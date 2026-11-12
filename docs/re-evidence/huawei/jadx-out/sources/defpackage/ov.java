package defpackage;

import android.text.TextUtils;
import com.alipay.sdk.m.l.c;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class ov {
    public static String b(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf("}"));
    }

    public static String c(String str, String str2) {
        String strSubstring = null;
        try {
            for (String str3 : str.split(";")) {
                String[] strArrSplit = str3.split("=", 2);
                if (strArrSplit.length == 2) {
                    String strTrim = strArrSplit[0].trim();
                    String strTrim2 = strArrSplit[1].trim();
                    if (TextUtils.equals(strTrim, str2)) {
                        strSubstring = strTrim2.substring(1, strTrim2.length() - 1);
                    } else {
                        continue;
                    }
                }
            }
            return strSubstring;
        } catch (Throwable th) {
            oq.c(th);
            return null;
        }
    }

    public static Map<String, String> d(on onVar, String str) {
        Map<String, String> mapE = e();
        try {
            return e(str);
        } catch (Throwable th) {
            mu.c(onVar, "biz", "FormatResultEx", th);
            return mapE;
        }
    }

    public static Map<String, String> e() {
        c cVarA = c.a(c.CANCELED.b());
        HashMap map = new HashMap();
        map.put("resultStatus", Integer.toString(cVarA.b()));
        map.put("memo", cVarA.a());
        map.put("result", "");
        return map;
    }

    public static Map<String, String> e(String str) {
        String[] strArrSplit = str.split(";");
        HashMap map = new HashMap();
        for (String str2 : strArrSplit) {
            String strSubstring = str2.substring(0, str2.indexOf("={"));
            map.put(strSubstring, b(str2, strSubstring));
        }
        return map;
    }

    public static String a(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile("(^|;)" + str2 + "=\\{([^}]*?)\\}").matcher(str);
            return matcher.find() ? matcher.group(2) : "?";
        } catch (Throwable th) {
            oq.c(th);
            return "?";
        }
    }
}
