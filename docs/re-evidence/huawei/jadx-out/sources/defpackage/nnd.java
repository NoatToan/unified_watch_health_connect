package defpackage;

import android.content.Context;
import com.huawei.hwidauth.c.k;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes38.dex */
public class nnd extends k {
    private String e = "/oauth2/v3/revoke?";
    private Context g;
    private String h;

    public nnd(Context context, String str) {
        this.h = str;
        this.g = context;
    }

    @Override // com.huawei.hwidauth.c.k
    public String a() throws IllegalStateException, IOException, IllegalArgumentException {
        return "";
    }

    @Override // com.huawei.hwidauth.c.k
    public String a_() {
        StringBuilder sb = new StringBuilder();
        try {
            String strEncode = URLEncoder.encode(this.h, "UTF-8");
            sb.append("token");
            sb.append("=");
            sb.append(strEncode);
        } catch (UnsupportedEncodingException unused) {
            nox.b("revokeRequest", "UnsupportedEncodingException", true);
        }
        return sb.toString();
    }

    @Override // com.huawei.hwidauth.c.k
    public String b() {
        return this.e + "hms_version=" + nom.c(this.g) + "&sdkVersion=6.13.0.301";
    }

    @Override // com.huawei.hwidauth.c.k
    public String c() {
        return "";
    }
}
