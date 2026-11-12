package defpackage;

import io.sentry.vendor.gson.internal.bind.util.a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import miuix.animation.internal.FolmeCore;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class yq5 {
    public static long a(@NotNull Date date) {
        return h(date.getTime());
    }

    public static double b(@NotNull Date date) {
        return i(date.getTime());
    }

    @NotNull
    public static Date c() {
        return Calendar.getInstance(a.f21912a).getTime();
    }

    @NotNull
    public static Date d(long j) {
        Calendar calendar = Calendar.getInstance(a.f21912a);
        calendar.setTimeInMillis(j);
        return calendar.getTime();
    }

    @NotNull
    public static Date e(@NotNull String str) throws IllegalArgumentException {
        try {
            return a.f(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException("timestamp is not ISO format " + str);
        }
    }

    @NotNull
    public static Date f(@NotNull String str) throws IllegalArgumentException {
        try {
            return d(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("timestamp is not millis format " + str);
        }
    }

    @NotNull
    public static String g(@NotNull Date date) {
        return a.b(date, true);
    }

    public static long h(long j) {
        return j * FolmeCore.NANOS_TO_MS;
    }

    public static double i(double d) {
        return d / 1000.0d;
    }

    public static Date j(long j) {
        return d(Double.valueOf(k(j)).longValue());
    }

    public static double k(double d) {
        return d / 1000000.0d;
    }

    public static double l(long j) {
        return j / 1.0E9d;
    }

    public static long m(@NotNull long j) {
        return j * FolmeCore.NANOS_TO_S;
    }

    @Nullable
    public static Date n(@Nullable hul hulVar) {
        if (hulVar == null) {
            return null;
        }
        return o(hulVar);
    }

    @NotNull
    public static Date o(@NotNull hul hulVar) {
        return j(hulVar.h());
    }
}
