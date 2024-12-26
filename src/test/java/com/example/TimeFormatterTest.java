package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TimeFormatterTest{

    @Test
    public void testFormatDuration() {
        assertEquals("now", TimeFormatter.formatDuration(0));
        assertEquals("1 second", TimeFormatter.formatDuration(1));
        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
        assertEquals("2 minutes", TimeFormatter.formatDuration(120));
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
        assertEquals("182 days, 1 hour, 44 minutes and 40 seconds", TimeFormatter.formatDuration(15731080));
        assertEquals("4 years, 68 days, 3 hours and 4 minutes", TimeFormatter.formatDuration(132030240));
        assertEquals("6 years, 192 days, 13 hours, 3 minutes and 54 seconds", TimeFormatter.formatDuration(205851834));
        assertEquals("8 years, 12 days, 13 hours, 41 minutes and 1 second", TimeFormatter.formatDuration(253374061));
        assertEquals("7 years, 246 days, 15 hours, 32 minutes and 54 seconds", TimeFormatter.formatDuration(242062374));
    }
}
