package com.example;

public class TimeFormatter {
    
    private TimeFormatter() {}

    private static final int[] UNITS = new int[] {31536000, 86400, 3600, 60, 1};
    private static final String[] DURATIONS = new String[] {"year", "day", "hour", "minute", "second"};

    public static String formatDuration(int seconds) {
        String result = "";
        
        if (seconds == 0) return "now";
        
        for (int i = 0; i < 5; i++) {
          if (seconds >= UNITS[i]) {
            int remainder = seconds / UNITS[i];
            seconds = seconds % UNITS[i];
            result += (result.equals("") ? "" : (seconds == 0 ? " and " : ", "))
                   + remainder + " " + DURATIONS[i] + (remainder > 1 ? "s" : "");              
          }
        }
        return result;
    }
}
