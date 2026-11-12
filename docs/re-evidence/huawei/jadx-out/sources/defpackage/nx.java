package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class nx {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split("&");
        if (strArrSplit.length == 0) {
            return "";
        }
        String strB = null;
        String strD = null;
        String strG = null;
        String strE = null;
        for (String str2 : strArrSplit) {
            if (TextUtils.isEmpty(strB)) {
                strB = b(str2);
            }
            if (TextUtils.isEmpty(strD)) {
                strD = d(str2);
            }
            if (TextUtils.isEmpty(strG)) {
                strG = g(str2);
            }
            if (TextUtils.isEmpty(strE)) {
                strE = e(str2);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(strB)) {
            sb.append("biz_type=" + strB + ";");
        }
        if (!TextUtils.isEmpty(strD)) {
            sb.append("biz_no=" + strD + ";");
        }
        if (!TextUtils.isEmpty(strG)) {
            sb.append("trade_no=" + strG + ";");
        }
        if (!TextUtils.isEmpty(strE)) {
            sb.append("app_userid=" + strE + ";");
        }
        String string = sb.toString();
        return string.endsWith(";") ? string.substring(0, string.length() - 1) : string;
    }

    public static String b(String str) {
        if (str.contains("biz_type")) {
            return c(str);
        }
        return null;
    }

    public static String c(String str) {
        String[] strArrSplit = str.split("=");
        if (strArrSplit.length <= 1) {
            return null;
        }
        String str2 = strArrSplit[1];
        return str2.contains("\"") ? str2.replaceAll("\"", "") : str2;
    }

    public static String d(String str) {
        if (str.contains("biz_no")) {
            return c(str);
        }
        return null;
    }

    public static String e(String str) {
        if (str.contains("app_userid")) {
            return c(str);
        }
        return null;
    }

    public static String g(String str) {
        if (!str.contains("trade_no") || str.startsWith("out_trade_no")) {
            return null;
        }
        return c(str);
    }
}
