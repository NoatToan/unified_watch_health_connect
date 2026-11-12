package com.google.protobuf.util;

import com.google.android.exoplayer2.C;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.common.math.LongMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompileTimeConstant;
import com.google.protobuf.Duration;
import com.mapbox.maps.p;
import com.nimbusds.jose.shaded.gson.internal.a;
import fb1.c;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Comparator;
import v.h;
import yc.l2;

/* JADX INFO: loaded from: classes2.dex */
public final class Durations {
    private static final long SECONDS_PER_DAY = 86400;
    private static final long SECONDS_PER_HOUR = 3600;
    private static final long SECONDS_PER_MINUTE = 60;
    static final long DURATION_SECONDS_MIN = -315576000000L;
    public static final Duration MIN_VALUE = Duration.newBuilder().setSeconds(DURATION_SECONDS_MIN).setNanos(-999999999).build();
    static final long DURATION_SECONDS_MAX = 315576000000L;
    public static final Duration MAX_VALUE = Duration.newBuilder().setSeconds(DURATION_SECONDS_MAX).setNanos(999999999).build();
    public static final Duration ZERO = Duration.newBuilder().setSeconds(0).setNanos(0).build();

    public enum DurationComparator implements Comparator<Duration>, Serializable {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Duration duration, Duration duration2) {
            Durations.checkValid(duration);
            Durations.checkValid(duration2);
            int iCompare = Long.compare(duration.getSeconds(), duration2.getSeconds());
            return iCompare != 0 ? iCompare : Integer.compare(duration.getNanos(), duration2.getNanos());
        }
    }

    private Durations() {
    }

    public static Duration add(Duration duration, Duration duration2) {
        checkValid(duration);
        checkValid(duration2);
        return normalizedDuration(LongMath.checkedAdd(duration.getSeconds(), duration2.getSeconds()), IntMath.checkedAdd(duration.getNanos(), duration2.getNanos()));
    }

    @CanIgnoreReturnValue
    public static Duration checkNotNegative(Duration duration) {
        Preconditions.checkArgument(!isNegative(duration), "duration (%s) must not be negative", toString(duration));
        return duration;
    }

    @CanIgnoreReturnValue
    public static Duration checkPositive(Duration duration) {
        Preconditions.checkArgument(isPositive(duration), "duration (%s) must be positive", toString(duration));
        return duration;
    }

    @CanIgnoreReturnValue
    public static Duration checkValid(Duration duration) {
        long seconds = duration.getSeconds();
        int nanos = duration.getNanos();
        if (isValid(seconds, nanos)) {
            return duration;
        }
        a.v(h.w(nanos, "Duration is not valid. See proto definition for valid values. Seconds (", ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (", seconds), ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
        return null;
    }

    public static Comparator<Duration> comparator() {
        return DurationComparator.INSTANCE;
    }

    public static int compare(Duration duration, Duration duration2) {
        return DurationComparator.INSTANCE.compare(duration, duration2);
    }

    public static Duration fromDays(long j8) {
        return Duration.newBuilder().setSeconds(LongMath.checkedMultiply(j8, SECONDS_PER_DAY)).setNanos(0).build();
    }

    public static Duration fromHours(long j8) {
        return Duration.newBuilder().setSeconds(LongMath.checkedMultiply(j8, SECONDS_PER_HOUR)).setNanos(0).build();
    }

    public static Duration fromMicros(long j8) {
        return normalizedDuration(j8 / 1000000, (int) ((j8 % 1000000) * 1000));
    }

    public static Duration fromMillis(long j8) {
        return normalizedDuration(j8 / 1000, (int) ((j8 % 1000) * 1000000));
    }

    public static Duration fromMinutes(long j8) {
        return Duration.newBuilder().setSeconds(LongMath.checkedMultiply(j8, 60L)).setNanos(0).build();
    }

    public static Duration fromNanos(long j8) {
        return normalizedDuration(j8 / C.NANOS_PER_SECOND, (int) (j8 % C.NANOS_PER_SECOND));
    }

    public static Duration fromSeconds(long j8) {
        return normalizedDuration(j8, 0);
    }

    public static boolean isNegative(Duration duration) {
        checkValid(duration);
        if (duration.getSeconds() == 0) {
            return duration.getNanos() < 0;
        }
        return duration.getSeconds() < 0;
    }

    public static boolean isPositive(Duration duration) {
        checkValid(duration);
        return (isNegative(duration) || duration.equals(ZERO)) ? false : true;
    }

    public static boolean isValid(long j8, int i14) {
        if (j8 >= DURATION_SECONDS_MIN && j8 <= DURATION_SECONDS_MAX && i14 >= -999999999 && i14 < 1000000000) {
            if (j8 >= 0 && i14 >= 0) {
                return true;
            }
            if (j8 <= 0 && i14 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static Duration normalizedDuration(long j8, int i14) {
        if (i14 <= -1000000000 || i14 >= 1000000000) {
            j8 = LongMath.checkedAdd(j8, i14 / 1000000000);
            i14 %= 1000000000;
        }
        if (j8 > 0 && i14 < 0) {
            i14 += 1000000000;
            j8--;
        }
        if (j8 < 0 && i14 > 0) {
            i14 -= 1000000000;
            j8++;
        }
        return checkValid(Duration.newBuilder().setSeconds(j8).setNanos(i14).build());
    }

    public static Duration parse(String str) throws ParseException {
        boolean z14;
        String strSubstring;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            p.i(0, "Invalid duration string: ".concat(str));
            return null;
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z14 = true;
        } else {
            z14 = false;
        }
        String strM = c.m(1, 0, str);
        int iIndexOf = strM.indexOf(46);
        if (iIndexOf != -1) {
            strSubstring = strM.substring(iIndexOf + 1);
            strM = strM.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        long j8 = Long.parseLong(strM);
        int nanos = strSubstring.isEmpty() ? 0 : Timestamps.parseNanos(strSubstring);
        if (j8 < 0) {
            p.i(0, "Invalid duration string: ".concat(str));
            return null;
        }
        if (z14) {
            j8 = -j8;
            nanos = -nanos;
        }
        try {
            return normalizedDuration(j8, nanos);
        } catch (IllegalArgumentException e4) {
            ParseException parseException = new ParseException("Duration value is out of range.", 0);
            parseException.initCause(e4);
            throw parseException;
        }
    }

    public static Duration parseUnchecked(@CompileTimeConstant String str) {
        try {
            return parse(str);
        } catch (ParseException e4) {
            l2.t(e4);
            return null;
        }
    }

    public static Duration subtract(Duration duration, Duration duration2) {
        checkValid(duration);
        checkValid(duration2);
        return normalizedDuration(LongMath.checkedSubtract(duration.getSeconds(), duration2.getSeconds()), IntMath.checkedSubtract(duration.getNanos(), duration2.getNanos()));
    }

    public static long toDays(Duration duration) {
        return checkValid(duration).getSeconds() / SECONDS_PER_DAY;
    }

    public static long toHours(Duration duration) {
        return checkValid(duration).getSeconds() / SECONDS_PER_HOUR;
    }

    public static long toMicros(Duration duration) {
        checkValid(duration);
        return LongMath.checkedAdd(LongMath.checkedMultiply(duration.getSeconds(), 1000000L), duration.getNanos() / 1000);
    }

    public static long toMillis(Duration duration) {
        checkValid(duration);
        return LongMath.checkedAdd(LongMath.checkedMultiply(duration.getSeconds(), 1000L), duration.getNanos() / 1000000);
    }

    public static long toMinutes(Duration duration) {
        return checkValid(duration).getSeconds() / 60;
    }

    public static long toNanos(Duration duration) {
        checkValid(duration);
        return LongMath.checkedAdd(LongMath.checkedMultiply(duration.getSeconds(), C.NANOS_PER_SECOND), duration.getNanos());
    }

    public static long toSeconds(Duration duration) {
        return checkValid(duration).getSeconds();
    }

    public static double toSecondsAsDouble(Duration duration) {
        checkValid(duration);
        return (((double) duration.getNanos()) / 1.0E9d) + duration.getSeconds();
    }

    public static String toString(Duration duration) {
        checkValid(duration);
        long seconds = duration.getSeconds();
        int nanos = duration.getNanos();
        StringBuilder sb3 = new StringBuilder();
        if (seconds < 0 || nanos < 0) {
            sb3.append("-");
            seconds = -seconds;
            nanos = -nanos;
        }
        sb3.append(seconds);
        if (nanos != 0) {
            sb3.append(".");
            sb3.append(Timestamps.formatNanos(nanos));
        }
        sb3.append("s");
        return sb3.toString();
    }

    public static Duration checkValid(Duration.Builder builder) {
        return checkValid(builder.build());
    }

    public static boolean isValid(Duration duration) {
        return isValid(duration.getSeconds(), duration.getNanos());
    }
}
