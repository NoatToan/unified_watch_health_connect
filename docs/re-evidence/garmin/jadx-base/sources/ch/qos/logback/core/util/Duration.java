package ch.qos.logback.core.util;

import am.j;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class Duration {
    static final long DAYS_COEFFICIENT = 86400000;
    private static final int DOUBLE_GROUP = 1;
    private static final String DOUBLE_PART = "([0-9]*(.[0-9]+)?)";
    private static final Pattern DURATION_PATTERN = Pattern.compile("([0-9]*(.[0-9]+)?)\\s*(|milli(second)?|second(e)?|minute|hour|day)s?", 2);
    static final long HOURS_COEFFICIENT = 3600000;
    static final long MINUTES_COEFFICIENT = 60000;
    static final long SECONDS_COEFFICIENT = 1000;
    private static final int UNIT_GROUP = 3;
    private static final String UNIT_PART = "(|milli(second)?|second(e)?|minute|hour|day)s?";
    final long millis;

    public Duration(long j8) {
        this.millis = j8;
    }

    public static Duration buildByDays(double d14) {
        return new Duration((long) (d14 * 8.64E7d));
    }

    public static Duration buildByHours(double d14) {
        return new Duration((long) (d14 * 3600000.0d));
    }

    public static Duration buildByMilliseconds(double d14) {
        return new Duration((long) d14);
    }

    public static Duration buildByMinutes(double d14) {
        return new Duration((long) (d14 * 60000.0d));
    }

    public static Duration buildBySeconds(double d14) {
        return new Duration((long) (d14 * 1000.0d));
    }

    public static Duration buildUnbounded() {
        return new Duration(Long.MAX_VALUE);
    }

    public static Duration valueOf(String str) {
        Matcher matcher = DURATION_PATTERN.matcher(str);
        if (!matcher.matches()) {
            h.s(j.m("String value [", str, "] is not in the expected format."));
            return null;
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(3);
        double dDoubleValue = Double.valueOf(strGroup).doubleValue();
        if (strGroup2.equalsIgnoreCase("milli") || strGroup2.equalsIgnoreCase("millisecond") || strGroup2.length() == 0) {
            return buildByMilliseconds(dDoubleValue);
        }
        if (strGroup2.equalsIgnoreCase("second") || strGroup2.equalsIgnoreCase("seconde")) {
            return buildBySeconds(dDoubleValue);
        }
        if (strGroup2.equalsIgnoreCase("minute")) {
            return buildByMinutes(dDoubleValue);
        }
        if (strGroup2.equalsIgnoreCase("hour")) {
            return buildByHours(dDoubleValue);
        }
        if (strGroup2.equalsIgnoreCase("day")) {
            return buildByDays(dDoubleValue);
        }
        h.z("Unexpected ".concat(strGroup2));
        return null;
    }

    public long getMilliseconds() {
        return this.millis;
    }

    public String toString() {
        long j8 = this.millis;
        if (j8 < 1000) {
            return j.i(this.millis, " milliseconds", new StringBuilder());
        }
        if (j8 < 60000) {
            return j.i(this.millis / 1000, " seconds", new StringBuilder());
        }
        long j14 = this.millis;
        if (j8 < 3600000) {
            return j.i(j14 / 60000, " minutes", new StringBuilder());
        }
        return j.i(j14 / 3600000, " hours", new StringBuilder());
    }
}
