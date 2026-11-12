package com.alipay.sdk.util;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static String a(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile("(^|;)" + str2 + "=\\{([^}]*?)\\}").matcher(str);
            return matcher.find() ? matcher.group(2) : "?";
        } catch (Throwable th) {
            c.d(th);
            return "?";
        }
    }

    public static Map<String, String> b() {
        com.alipay.sdk.app.c cVarB = com.alipay.sdk.app.c.b(com.alipay.sdk.app.c.CANCELED.a());
        HashMap map = new HashMap();
        map.put("resultStatus", Integer.toString(cVarB.a()));
        map.put("memo", cVarB.b());
        map.put("result", "");
        return map;
    }

    public static Map<String, String> c(com.alipay.sdk.sys.a aVar, String str) {
        Map<String, String> mapB = b();
        try {
            return d(str);
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.d(aVar, "biz", "FormatResultEx", th);
            return mapB;
        }
    }

    public static Map<String, String> d(String str) {
        String[] strArrSplit = str.split(";");
        HashMap map = new HashMap();
        for (String str2 : strArrSplit) {
            String strSubstring = str2.substring(0, str2.indexOf("={"));
            map.put(strSubstring, e(str2, strSubstring));
        }
        return map;
    }

    public static String e(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf("}"));
    }
}
