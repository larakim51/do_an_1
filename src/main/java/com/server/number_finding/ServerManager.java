package com.server.number_finding;

import java.net.SocketAddress;
import java.util.Scanner;

public class ServerManager {
    private static NewServer newServer;

    public static void main(String[] args) {
        newServer = new NewServer();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Status: Hiển thị trạng thái user");
            System.out.println("Setup: chỉnh số lượng số");
            System.out.println("Time: thời gian");
            System.out.println("lobby");
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase("status")) {
                displayStatus();
                s = scanner.nextLine();
            }
            if (s.equalsIgnoreCase("SetUp")) {
                int x, y;
                do {
                    System.out.println("Đặt điểm khởi đầu");
                    s = scanner.nextLine();
                } while (!isInteger(s) && s != null);
                x = Integer.parseInt(s);

                do {
                    System.out.println("Đặt điểm kết thúc");
                    s = scanner.nextLine();
                } while (!isInteger(s) && s != null);
                y = Integer.parseInt(s);

                if (x < y) {
                    newServer.setStartpoint(x);
                    newServer.setEndpoint(y);
                    System.out.println("Cài đặt thành công");
                } else {
                    System.out.println("vui long nhập bắt đầu > kết thúc");
                }
            }
            //thoiGian
            if (s.equalsIgnoreCase("Time")) {
                int time;
                do {
                    System.out.println("thời gian: ");
                    s = scanner.nextLine();
                } while (!isInteger(s) && s != null);
                time = Integer.parseInt(s);

                newServer.setThoiGian(time);
                System.out.println("Cài đặt thành công");
            }
            if ((s.equalsIgnoreCase("Lobby"))) {
                if (newServer.getListLobby() == null) {
                    System.out.println();
                }
                for (Lobby lob : newServer.getListLobby()) {
                    System.out.println("Lobby" + lob.LobbyID + "\n");
                    for (SocketAddress soa : lob.addr) {
                        System.out.println("Player: " + soa.toString());
                    }
                }
            }
        } while (true);
    }

    public static void displayStatus() {
        System.out.println("Status Account:\n");
        newServer.userStatus.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    public static boolean isInteger(String var) {
        try {
            Integer.parseInt(var);
            return true;

            // return false when "var" can't be converted to integer
            // NumberFormatException will return null
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
