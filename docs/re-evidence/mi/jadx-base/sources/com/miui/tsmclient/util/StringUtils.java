package com.miui.tsmclient.util;

import android.os.Bundle;
import android.text.TextUtils;
import defpackage.gv5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class StringUtils {
    public static final String EXPECT_DATE_FORMAT = "yyyy/MM/dd";
    public static final String EXPECT_TIME_FORMAT = "HH:mm:ss";
    private static final String REGEX_PHONE = "^\\d{11}$";
    public static final String SOURCE_ANY_FORMAT = ".(?!$)";
    public static final String SOURCE_DATE_FORMAT = "yyyyMMdd";
    public static final String SOURCE_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String SOURCE_DATE_TRANSVERSE_FORMAT = "yyyy-MM-dd";
    public static final String SOURCE_SPACE_FORMAT = "$0 ";
    public static final String SOURCE_TIME_FORMAT = "HHmmss";
    public static final long TIME_DAY = 86400000;
    public static final long TIME_HOUR = 3600000;
    public static final long TIME_MINUTE = 60000;

    private StringUtils() {
    }

    public static boolean checkLength(String str, int i) {
        return checkLength(str, i, i);
    }

    public static boolean checkPhoneNum(String str) {
        return checkValidByPatten(str, REGEX_PHONE);
    }

    public static boolean checkValidByPatten(String str, String str2) {
        return Pattern.compile(str2).matcher(str).matches();
    }

    public static String covertFloatToString(float f) {
        int i = (int) f;
        return f == ((float) i) ? String.valueOf(i) : String.valueOf(f);
    }

    public static String createMarkedString(String str, int i, int i2, char c) {
        if (TextUtils.isEmpty(str) || i2 > str.length()) {
            return null;
        }
        StringBuilder sb = new StringBuilder(i);
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 >= i) {
                sb.replace(i - i2, i, str.subSequence(str.length() - i2, str.length()).toString());
                return sb.toString();
            }
            sb.append(c);
            i3 = i4;
        }
    }

    public static String formatAmount(int i) {
        return String.format(String.format("%.2f", Float.valueOf(i / 100.0f)), new Object[0]);
    }

    public static long formatDataFromString(String str, String str2) {
        try {
            return new SimpleDateFormat(str2).parse(str).getTime();
        } catch (Exception e) {
            LogUtils.e("parse date failed,date string is:" + str + ",pattern is:" + str2, e);
            return -1L;
        }
    }

    public static String formatDateFromString(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return "";
        }
        try {
            return new SimpleDateFormat(str3).format(new SimpleDateFormat(str2).parse(str));
        } catch (ParseException e) {
            LogUtils.e("parse date failed,date string is:" + str + ",pattern is:" + str2, e);
            return null;
        }
    }

    public static String join(Map<String, String> map, String str) {
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (i > 0) {
                sb.append(str);
            }
            String key = entry.getKey();
            String value = entry.getValue();
            sb.append(key);
            sb.append("=");
            sb.append(value);
            i++;
        }
        return sb.toString();
    }

    public static String millsToTime(long j, String str) {
        if (j < 0) {
            return null;
        }
        return new SimpleDateFormat(str).format(new Date(j));
    }

    public static String replaceAll(String str, String str2, String str3) {
        return TextUtils.isEmpty(str) ? "" : str.replaceAll(str2, str3);
    }

    public static String tail(String str, int i) {
        return (TextUtils.isEmpty(str) || str.length() <= i) ? str : str.substring(str.length() - i);
    }

    public static Bundle transitionUrlParameterToMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (String str2 : str.split(gv5.CONNECT_STR)) {
            String[] strArrSplit = str2.split("=", 2);
            if (strArrSplit.length > 1) {
                bundle.putString(strArrSplit[0], strArrSplit[1]);
            }
        }
        return bundle;
    }

    public static boolean checkLength(String str, int i, int i2) {
        return !TextUtils.isEmpty(str) && str.length() >= i && str.length() <= i2;
    }

    public static String createMarkedString(String str, int i, char c) {
        if (TextUtils.isEmpty(str) || i > str.length()) {
            return null;
        }
        return createMarkedString(str, str.length(), i, c);
    }

    public static String join(String str, String... strArr) {
        if (strArr != null && str != null) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
                sb.append(str);
            }
            if (sb.length() > 0) {
                return sb.substring(0, sb.length() - 1).toString();
            }
        }
        return null;
    }
}
