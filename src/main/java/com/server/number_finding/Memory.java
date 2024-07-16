package com.server.number_finding;

import com.server.model.DTO.Ranking;
import com.server.model.DTO.UserAccountDTO;

import java.util.HashMap;

public class Memory {
    public static NewClient client = new NewClient();

    public static UserAccountDTO userAccountDTO = new UserAccountDTO();
    public static Ranking rankingDTO = new Ranking();

    public static String userColor;
    public static HashMap<String,String> otherUserInfor_Color = new HashMap<>();

//    ======================================================================
//    ======================================================================

    //    About Client to CLien
    public static String messenger = " ";
    /**
     * true if there is a messenger come from the other client
     * <br>It mean in your turn is false
     */
    static boolean playerMessenger = true;

    static String statusMessenger = " ";
}
