package r63;

import com.google.gdata.util.common.base.PercentEscaper;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import r1.q2;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PercentEscaper f151033a = new PercentEscaper("-._~", false);

    public static void a(String str, String str2) {
        if (System.getProperty("debug") != null) {
            System.out.println("[SIGNPOST] " + str + ": " + str2);
        }
    }

    public static t63.a b(String str) {
        String strC;
        String strC2;
        t63.a aVar = new t63.a();
        if (str.length() != 0) {
            for (String str2 : str.split("\\&")) {
                int iIndexOf = str2.indexOf(61);
                if (iIndexOf < 0) {
                    strC2 = c(str2);
                    strC = null;
                } else {
                    String strC3 = c(str2.substring(0, iIndexOf));
                    strC = c(str2.substring(iIndexOf + 1));
                    strC2 = strC3;
                }
                aVar.b(strC2, strC, false);
            }
        }
        return aVar;
    }

    public static String c(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e4) {
            q2.v(e4.getMessage(), e4);
            return null;
        }
    }

    public static String d(String str) {
        return str == null ? "" : f151033a.escape(str);
    }
}
