package models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UpdateDB {

    
    private static Map<String, Update> updates = new HashMap<>();
    
    
    /**
     * Creates a new Update.
     * @param formData
     * @return contact
     */
    public static Update addUpdate(String action, String surfer) {
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

      Date today = Calendar.getInstance().getTime();        
      String date = df.format(today);
      
      Update update = new Update(date, action, surfer);
      updates.put(date, update);
      return update;
    }
    
    /**
     * Deletes an update from in memory database.
     * @param date
     */
    public static void deleteUpdate(String date) {
      updates.remove(date);
    }
    
    /**
     * Return in memory database containing all updates.
     * @return contacts
     */
    public static List<Update> getUpdates() {
      return new ArrayList<>(updates.values());
    }

    /**
     * Returns update at specified date.
     * @param date
     * @return update
     */
    public static Update getUpdate(String date) {
      Update update = updates.get(date);
      if (update == null) {
        throw new RuntimeException("Passed a bogus date " + date);
      }
      return update;
    }
  

  
}
