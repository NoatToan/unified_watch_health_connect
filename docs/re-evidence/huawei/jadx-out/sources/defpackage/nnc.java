package defpackage;

import android.content.Context;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwidauth.c.k;
import com.tencent.connect.common.Constants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes11.dex */
public class nnc extends k {
    private String e = "/oauth2/v3/silent_code?";
    private String f = Constants.PARAM_ACCESS_TOKEN;
    private String g;
    private String h;
    private String i;
    private String j;
    private Context l;

    @Override // com.huawei.hwidauth.c.k
    public String a() throws IllegalStateException, IOException, IllegalArgumentException {
        return null;
    }

    public nnc(Context context, String str, String str2, String str3, String str4) {
        this.l = context;
        this.h = str;
        this.j = str2;
        this.i = str3;
        this.g = str4;
    }

    @Override // com.huawei.hwidauth.c.k
    public String a_() {
        StringBuilder sb = new StringBuilder();
        try {
            String strEncode = URLEncoder.encode(this.i, "UTF-8");
            if (!strEncode.contains("openid")) {
                strEncode = "openid " + strEncode;
            }
            String strEncode2 = URLEncoder.encode(this.g, "UTF-8");
            String strEncode3 = URLEncoder.encode(this.j, "UTF-8");
            sb.append("grant_type");
            sb.append("=");
            sb.append(this.f);
            sb.append("&");
            sb.append(Constants.PARAM_ACCESS_TOKEN);
            sb.append("=");
            sb.append(strEncode3);
            sb.append("&");
            sb.append("scope");
            sb.append("=");
            sb.append(strEncode);
            sb.append("&");
            sb.append(CommonConstant.ReqAccessTokenParam.REDIRECT_URI);
            sb.append("=");
            sb.append(strEncode2);
            sb.append("&");
            sb.append("need_show_page");
            sb.append("=");
            sb.append("true");
            sb.append("&");
            sb.append(Constants.NONCE);
            sb.append("=");
            sb.append(d());
            sb.append("&");
            sb.append("include_granted_scopes");
            sb.append("=");
            sb.append("true");
            sb.append("&");
            sb.append("access_type");
            sb.append("=");
            sb.append("offline");
            sb.append("&");
            sb.append("state");
            sb.append("=");
            sb.append(d());
            sb.append("&");
            sb.append("uuid");
            sb.append(nph.a(this.l));
        } catch (UnsupportedEncodingException unused) {
            nox.b("GwSilentCodeHttpRequest", "UnsupportedEncodingException", true);
        }
        return sb.toString();
    }

    private String d() {
        try {
            return URLEncoder.encode(npd.a(), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            nox.a("GwSilentCodeHttpRequest", "UnsupportedEncodingException", true);
            return "";
        }
    }

    @Override // com.huawei.hwidauth.c.k
    public String b() {
        return this.e + "client_id=" + this.h + "&hms_version=" + nom.c(this.l) + "&sdkVersion=6.13.0.301";
    }

    @Override // com.huawei.hwidauth.c.k
    public String c() {
        return "";
    }
}
