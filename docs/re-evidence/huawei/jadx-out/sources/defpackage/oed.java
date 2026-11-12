package defpackage;

import com.huawei.operation.utils.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes12.dex */
public class oed {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f44227c;
    private static String[] d = {"0", "1", "2"};

    public static String e() {
        return f44227c;
    }

    public static void c(String str) {
        if (oco.b("ODSA_SUPPORT_URL_ENCODER_TOKEN", (Boolean) false).booleanValue()) {
            try {
                f44227c = URLEncoder.encode(str, "utf-8");
            } catch (UnsupportedEncodingException unused) {
                ocq.c("TokenUtils", "UnsupportedEncodingException.");
            }
        } else {
            f44227c = str;
        }
        StringBuilder sb = new StringBuilder("update token to xxx, length is ");
        sb.append(str != null ? Integer.valueOf(str.length()) : Constants.NULL);
        ocq.a("TokenUtils", sb.toString());
    }
}
