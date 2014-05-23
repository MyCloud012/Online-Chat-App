/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

/**
 *
 * @author Xerazx
 */
public class People {

    //Globals
    //public static ArrayList<String> CurrentRooms = new ArrayList<String>();
    public static HashMap<String, Vector> rooms = new HashMap<String, Vector>();
    //---------------------------------------------------------------

    public static boolean checkExists(String roomName) {
        for (String key : rooms.keySet()) {
            if (key.equals(roomName)) {
                return true;
            }
        }
        return false;
    }

    public static void createRoom(String roomName) {
        rooms.put(roomName, new Vector());
    }
    
    public static void insertUser(String userName, String roomName)
    {
        if(rooms.containsKey(roomName))
            rooms.get(roomName).add(userName);
    }
    
    public static String[] getOnlineUsers(String roomName)
    {
        Vector v = rooms.get(roomName);
        int size = v.size();
        String[] s = new String[size];
        for(int i=0; i < size; ++i)
        {
            s[i] = (String) v.get(i);
        }
        return s;
    }
}