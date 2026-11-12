package defpackage;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class oxr {
    public static String a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String b(JsonObject jsonObject, String str) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            String strF = nxr.f(entry.getValue());
            String strA = a(key, str);
            String strA2 = strF != null ? a(strF, str) : "";
            if (sb.length() > 0) {
                sb.append(gv5.CONNECT_STR);
            }
            sb.append(strA);
            sb.append("=");
            sb.append(strA2);
        }
        return sb.toString();
    }

    public static String c(String str, JsonObject jsonObject) {
        if (jsonObject == null || jsonObject.size() == 0) {
            return str;
        }
        String strB = b(jsonObject, "UTF-8");
        if (str.contains("?")) {
            return str + gv5.CONNECT_STR + strB;
        }
        return str + "?" + strB;
    }
}
