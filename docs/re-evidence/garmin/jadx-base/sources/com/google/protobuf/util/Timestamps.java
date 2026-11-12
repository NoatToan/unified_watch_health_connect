package com.google.protobuf.util;

import am.j;
import com.google.android.exoplayer2.C;
import com.google.common.math.IntMath;
import com.google.common.math.LongMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompileTimeConstant;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import com.mapbox.maps.p;
import com.nimbusds.jose.shaded.gson.internal.a;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import v.h;
import yc.l2;

/* JADX INFO: loaded from: classes2.dex */
public final class Timestamps {
    static final int MICROS_PER_SECOND = 1000000;
    static final int MILLIS_PER_SECOND = 1000;
    static final int NANOS_PER_MICROSECOND = 1000;
    static final int NANOS_PER_MILLISECOND = 1000000;
    static final int NANOS_PER_SECOND = 1000000000;
    static final long TIMESTAMP_SECONDS_MIN = -62135596800L;
    public static final Timestamp MIN_VALUE = Timestamp.newBuilder().setSeconds(TIMESTAMP_SECONDS_MIN).setNanos(0).build();
    static final long TIMESTAMP_SECONDS_MAX = 253402300799L;
    public static final Timestamp MAX_VALUE = Timestamp.newBuilder().setSeconds(TIMESTAMP_SECONDS_MAX).setNanos(999999999).build();
    public static final Timestamp EPOCH = Timestamp.newBuilder().setSeconds(0).setNanos(0).build();
    private static final ThreadLocal<SimpleDateFormat> timestampFormat = new ThreadLocal<SimpleDateFormat>() { // from class: com.google.protobuf.util.Timestamps.1
        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return Timestamps.createTimestampFormat();
        }
    };
    private static final Method INSTANT_NOW = instantMethod("now");
    private static final Method INSTANT_GET_EPOCH_SECOND = instantMethod("getEpochSecond");
    private static final Method INSTANT_GET_NANO = instantMethod("getNano");

    public enum TimestampComparator implements Comparator<Timestamp>, Serializable {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Timestamp timestamp, Timestamp timestamp2) {
            Timestamps.checkValid(timestamp);
            Timestamps.checkValid(timestamp2);
            int iCompare = Long.compare(timestamp.getSeconds(), timestamp2.getSeconds());
            return iCompare != 0 ? iCompare : Integer.compare(timestamp.getNanos(), timestamp2.getNanos());
        }
    }

    private Timestamps() {
    }

    public static Timestamp add(Timestamp timestamp, Duration duration) {
        checkValid(timestamp);
        Durations.checkValid(duration);
        return normalizedTimestamp(LongMath.checkedAdd(timestamp.getSeconds(), duration.getSeconds()), IntMath.checkedAdd(timestamp.getNanos(), duration.getNanos()));
    }

    public static Duration between(Timestamp timestamp, Timestamp timestamp2) {
        checkValid(timestamp);
        checkValid(timestamp2);
        return Durations.normalizedDuration(LongMath.checkedSubtract(timestamp2.getSeconds(), timestamp.getSeconds()), IntMath.checkedSubtract(timestamp2.getNanos(), timestamp.getNanos()));
    }

    @CanIgnoreReturnValue
    public static Timestamp checkValid(Timestamp timestamp) {
        long seconds = timestamp.getSeconds();
        int nanos = timestamp.getNanos();
        if (isValid(seconds, nanos)) {
            return timestamp;
        }
        a.v(h.w(nanos, "Timestamp is not valid. See proto definition for valid values. Seconds (", ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (", seconds), ") must be in range [0, +999,999,999].");
        return null;
    }

    public static Comparator<Timestamp> comparator() {
        return TimestampComparator.INSTANCE;
    }

    public static int compare(Timestamp timestamp, Timestamp timestamp2) {
        return TimestampComparator.INSTANCE.compare(timestamp, timestamp2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SimpleDateFormat createTimestampFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat;
    }

    public static String formatNanos(int i14) {
        if (i14 % 1000000 == 0) {
            return String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(i14 / 1000000));
        }
        return i14 % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(i14 / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(i14));
    }

    public static Timestamp fromDate(Date date) {
        if (!(date instanceof java.sql.Timestamp)) {
            return fromMillis(date.getTime());
        }
        java.sql.Timestamp timestamp = (java.sql.Timestamp) date;
        long time = timestamp.getTime();
        return Timestamp.newBuilder().setSeconds((time >= 0 || time % 1000 == 0) ? time / 1000 : (time / 1000) - 1).setNanos(timestamp.getNanos()).build();
    }

    public static Timestamp fromMicros(long j8) {
        return normalizedTimestamp(j8 / 1000000, (int) ((j8 % 1000000) * 1000));
    }

    public static Timestamp fromMillis(long j8) {
        return normalizedTimestamp(j8 / 1000, (int) ((j8 % 1000) * 1000000));
    }

    public static Timestamp fromNanos(long j8) {
        return normalizedTimestamp(j8 / C.NANOS_PER_SECOND, (int) (j8 % C.NANOS_PER_SECOND));
    }

    public static Timestamp fromSeconds(long j8) {
        return normalizedTimestamp(j8, 0);
    }

    private static Method instantMethod(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isValid(long j8, int i14) {
        return j8 >= TIMESTAMP_SECONDS_MIN && j8 <= TIMESTAMP_SECONDS_MAX && i14 >= 0 && i14 < 1000000000;
    }

    public static Timestamp normalizedTimestamp(long j8, int i14) {
        if (i14 <= -1000000000 || i14 >= 1000000000) {
            j8 = LongMath.checkedAdd(j8, i14 / 1000000000);
            i14 %= 1000000000;
        }
        if (i14 < 0) {
            i14 += 1000000000;
            j8 = LongMath.checkedSubtract(j8, 1L);
        }
        return checkValid(Timestamp.newBuilder().setSeconds(j8).setNanos(i14).build());
    }

    public static Timestamp now() {
        Method method = INSTANT_NOW;
        if (method == null) {
            return fromMillis(System.currentTimeMillis());
        }
        try {
            Object objInvoke = method.invoke(null, null);
            return normalizedTimestamp(((Long) INSTANT_GET_EPOCH_SECOND.invoke(objInvoke, null)).longValue(), ((Integer) INSTANT_GET_NANO.invoke(objInvoke, null)).intValue());
        } catch (Throwable th3) {
            vb.h.q(th3);
            return null;
        }
    }

    public static Timestamp parse(String str) throws ParseException {
        String strSubstring;
        int iIndexOf = str.indexOf(84);
        if (iIndexOf == -1) {
            p.i(0, j.m("Failed to parse timestamp: invalid timestamp \"", str, "\""));
            return null;
        }
        int iIndexOf2 = str.indexOf(90, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(43, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(45, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            p.i(0, "Failed to parse timestamp: missing valid timezone offset.");
            return null;
        }
        String strSubstring2 = str.substring(0, iIndexOf2);
        int iIndexOf3 = strSubstring2.indexOf(46);
        if (iIndexOf3 != -1) {
            String strSubstring3 = strSubstring2.substring(0, iIndexOf3);
            strSubstring = strSubstring2.substring(iIndexOf3 + 1);
            strSubstring2 = strSubstring3;
        } else {
            strSubstring = "";
        }
        long time = timestampFormat.get().parse(strSubstring2).getTime() / 1000;
        int nanos = strSubstring.isEmpty() ? 0 : parseNanos(strSubstring);
        if (str.charAt(iIndexOf2) != 'Z') {
            long timezoneOffset = parseTimezoneOffset(str.substring(iIndexOf2 + 1));
            time = str.charAt(iIndexOf2) == '+' ? time - timezoneOffset : time + timezoneOffset;
        } else if (str.length() != iIndexOf2 + 1) {
            throw new ParseException("Failed to parse timestamp: invalid trailing data \"" + str.substring(iIndexOf2) + "\"", 0);
        }
        try {
            return normalizedTimestamp(time, nanos);
        } catch (IllegalArgumentException e4) {
            ParseException parseException = new ParseException(j.m("Failed to parse timestamp ", str, " Timestamp is out of range."), 0);
            parseException.initCause(e4);
            throw parseException;
        }
    }

    public static int parseNanos(String str) throws ParseException {
        int iCharAt = 0;
        for (int i14 = 0; i14 < 9; i14++) {
            iCharAt *= 10;
            if (i14 < str.length()) {
                if (str.charAt(i14) < '0' || str.charAt(i14) > '9') {
                    p.i(0, "Invalid nanoseconds.");
                    return 0;
                }
                iCharAt = (str.charAt(i14) - '0') + iCharAt;
            }
        }
        return iCharAt;
    }

    private static long parseTimezoneOffset(String str) throws ParseException {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            p.i(0, "Invalid offset value: ".concat(str));
            return 0L;
        }
        try {
            return ((Long.parseLong(str.substring(0, iIndexOf)) * 60) + Long.parseLong(str.substring(iIndexOf + 1))) * 60;
        } catch (NumberFormatException e4) {
            ParseException parseException = new ParseException("Invalid offset value: ".concat(str), 0);
            parseException.initCause(e4);
            throw parseException;
        }
    }

    public static Timestamp parseUnchecked(@CompileTimeConstant String str) {
        try {
            return parse(str);
        } catch (ParseException e4) {
            l2.t(e4);
            return null;
        }
    }

    public static Timestamp subtract(Timestamp timestamp, Duration duration) {
        checkValid(timestamp);
        Durations.checkValid(duration);
        return normalizedTimestamp(LongMath.checkedSubtract(timestamp.getSeconds(), duration.getSeconds()), IntMath.checkedSubtract(timestamp.getNanos(), duration.getNanos()));
    }

    public static long toMicros(Timestamp timestamp) {
        checkValid(timestamp);
        return LongMath.checkedAdd(LongMath.checkedMultiply(timestamp.getSeconds(), 1000000L), timestamp.getNanos() / 1000);
    }

    public static long toMillis(Timestamp timestamp) {
        checkValid(timestamp);
        return LongMath.checkedAdd(LongMath.checkedMultiply(timestamp.getSeconds(), 1000L), timestamp.getNanos() / 1000000);
    }

    public static long toNanos(Timestamp timestamp) {
        checkValid(timestamp);
        return LongMath.checkedAdd(LongMath.checkedMultiply(timestamp.getSeconds(), C.NANOS_PER_SECOND), timestamp.getNanos());
    }

    public static long toSeconds(Timestamp timestamp) {
        return checkValid(timestamp).getSeconds();
    }

    public static String toString(Timestamp timestamp) {
        checkValid(timestamp);
        long seconds = timestamp.getSeconds();
        int nanos = timestamp.getNanos();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(timestampFormat.get().format(new Date(seconds * 1000)));
        if (nanos != 0) {
            sb3.append(".");
            sb3.append(formatNanos(nanos));
        }
        sb3.append("Z");
        return sb3.toString();
    }

    public static Timestamp checkValid(Timestamp.Builder builder) {
        return checkValid(builder.build());
    }

    public static boolean isValid(Timestamp timestamp) {
        return isValid(timestamp.getSeconds(), timestamp.getNanos());
    }
}
