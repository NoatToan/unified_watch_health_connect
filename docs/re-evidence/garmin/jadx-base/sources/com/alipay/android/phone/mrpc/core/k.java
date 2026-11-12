package com.alipay.android.phone.mrpc.core;

import android.text.format.Time;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f28293a = Pattern.compile("([0-9]{1,2})[- ]([A-Za-z]{3,9})[- ]([0-9]{2,4})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f28294b = Pattern.compile("[ ]([A-Za-z]{3,9})[ ]+([0-9]{1,2})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])[ ]([0-9]{2,4})");

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f28296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28297c;

        public a(int i14, int i15, int i16) {
            this.f28295a = i14;
            this.f28296b = i15;
            this.f28297c = i16;
        }
    }

    public static long a(String str) {
        int iC;
        int iD;
        int iB;
        a aVarE;
        int i14;
        int i15;
        int i16;
        Matcher matcher = f28293a.matcher(str);
        if (matcher.find()) {
            iB = b(matcher.group(1));
            iC = c(matcher.group(2));
            iD = d(matcher.group(3));
            aVarE = e(matcher.group(4));
        } else {
            Matcher matcher2 = f28294b.matcher(str);
            if (!matcher2.find()) {
                vb.h.w();
                return 0L;
            }
            iC = c(matcher2.group(1));
            int iB2 = b(matcher2.group(2));
            a aVarE2 = e(matcher2.group(3));
            iD = d(matcher2.group(4));
            iB = iB2;
            aVarE = aVarE2;
        }
        if (iD >= 2038) {
            i15 = 0;
            i16 = 2038;
            i14 = 1;
        } else {
            i14 = iB;
            i15 = iC;
            i16 = iD;
        }
        Time time = new Time("UTC");
        time.set(aVarE.f28297c, aVarE.f28296b, aVarE.f28295a, i14, i15, i16);
        return time.toMillis(false);
    }

    public static int b(String str) {
        if (str.length() != 2) {
            return str.charAt(0) - '0';
        }
        return (str.charAt(1) - '0') + ((str.charAt(0) - '0') * 10);
    }

    public static int c(String str) {
        int lowerCase = (Character.toLowerCase(str.charAt(2)) + (Character.toLowerCase(str.charAt(1)) + Character.toLowerCase(str.charAt(0)))) - 291;
        if (lowerCase == 9) {
            return 11;
        }
        if (lowerCase == 10) {
            return 1;
        }
        if (lowerCase == 22) {
            return 0;
        }
        if (lowerCase == 26) {
            return 7;
        }
        if (lowerCase == 29) {
            return 2;
        }
        if (lowerCase == 32) {
            return 3;
        }
        if (lowerCase == 40) {
            return 6;
        }
        if (lowerCase == 42) {
            return 5;
        }
        if (lowerCase == 48) {
            return 10;
        }
        switch (lowerCase) {
            case 35:
                return 9;
            case 36:
                return 4;
            case 37:
                return 8;
            default:
                vb.h.w();
                return 0;
        }
    }

    public static int d(String str) {
        if (str.length() == 2) {
            int iCharAt = (str.charAt(1) - '0') + ((str.charAt(0) - '0') * 10);
            return iCharAt >= 70 ? iCharAt + 1900 : iCharAt + 2000;
        }
        if (str.length() == 3) {
            return (str.charAt(2) - '0') + ((str.charAt(1) - '0') * 10) + ((str.charAt(0) - '0') * 100) + 1900;
        }
        if (str.length() == 4) {
            return (str.charAt(3) - '0') + ((str.charAt(2) - '0') * 10) + ((str.charAt(1) - '0') * 100) + ((str.charAt(0) - '0') * 1000);
        }
        return 1970;
    }

    public static a e(String str) {
        int iCharAt = str.charAt(0) - '0';
        int i14 = 1;
        if (str.charAt(1) != ':') {
            iCharAt = (iCharAt * 10) + (str.charAt(1) - '0');
            i14 = 2;
        }
        return new a(iCharAt, (str.charAt(i14 + 2) - '0') + ((str.charAt(i14 + 1) - '0') * 10), (str.charAt(i14 + 5) - '0') + ((str.charAt(i14 + 4) - '0') * 10));
    }
}
