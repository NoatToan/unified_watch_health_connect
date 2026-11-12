package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.regex.Pattern;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f21902a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Pattern f21903b = Pattern.compile("[\\W_]+");

    @Nullable
    public static String a(@Nullable String str, @NotNull ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            try {
                return new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str.getBytes(f21902a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e) {
                iLogger.a(SentryLevel.INFO, "SHA-1 isn't available to calculate the hash.", e);
            } catch (Throwable th) {
                iLogger.c(SentryLevel.INFO, "string: %s could not calculate its hash", th, str);
            }
        }
        return null;
    }

    @Nullable
    public static String b(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String[] strArrSplit = f21903b.split(str, -1);
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            sb.append(c(str2));
        }
        return sb.toString();
    }

    @Nullable
    public static String c(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb.append(strSubstring.toUpperCase(locale));
        sb.append(str.substring(1).toLowerCase(locale));
        return sb.toString();
    }

    @Nullable
    public static String d(@Nullable String str) {
        int i;
        if (str == null) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(".");
        return (iLastIndexOf < 0 || str.length() <= (i = iLastIndexOf + 1)) ? str : str.substring(i);
    }

    public static String e(@NotNull String str) {
        return str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
    }

    @Nullable
    public static String f(@Nullable String str, @Nullable String str2) {
        return (str == null || str2 == null || !str.startsWith(str2) || !str.endsWith(str2)) ? str : str.substring(str2.length(), str.length() - str2.length());
    }

    @Nullable
    public static String g(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }
}
