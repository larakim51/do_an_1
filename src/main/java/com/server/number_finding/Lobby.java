package com.server.number_finding;

import com.server.controller.BUS.Match;

import java.net.SocketAddress;
import java.util.*;

public class Lobby{
    public String state="isFree";
    public HashMap<String, Integer> ListOwner;
    public Match Match;
    public String LobbyID;
    public List<SocketAddress> addr= new ArrayList<>(3);
}
