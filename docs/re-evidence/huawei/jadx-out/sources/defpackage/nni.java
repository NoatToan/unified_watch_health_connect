package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwidauth.c.k;
import com.tencent.connect.common.Constants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes11.dex */
public class nni extends k {
    private nnl e;
    private Context j;

    public nni(Context context, nnl nnlVar) {
        this.e = nnlVar;
        this.j = context;
    }

    @Override // com.huawei.hwidauth.c.k
    public String a() throws IllegalStateException, IOException, IllegalArgumentException {
        return "";
    }

    @Override // com.huawei.hwidauth.c.k
    public String b() {
        return "/oauth2/v3/silent_token?client_id=" + this.e.d() + "&cVersion=HwID_6.13.0.301&hms_version=" + nom.c(this.j) + "&sdkVersion6.13.0.301";
    }

    @Override // com.huawei.hwidauth.c.k
    public String c() {
        return "";
    }

    @Override // com.huawei.hwidauth.c.k
    public String a_() {
        StringBuilder sb = new StringBuilder("client_id=");
        sb.append(this.e.d());
        sb.append("&grant_type=");
        sb.append(this.e.c());
        sb.append("&device_type=");
        sb.append(this.e.i());
        sb.append("&package_name=");
        sb.append(this.e.h());
        sb.append("&device_id=");
        sb.append(this.e.n());
        sb.append("&need_code=");
        sb.append(this.e.k());
        sb.append("&token_type=");
        sb.append(this.e.l());
        sb.append("&supportAlg=");
        sb.append(this.e.e());
        if ("service_token".equals(this.e.c())) {
            sb.append("&service_token=");
            sb.append(this.e.j());
            sb.append("&siteId=");
            sb.append(this.e.g());
        } else if (Constants.PARAM_ACCESS_TOKEN.equals(this.e.c())) {
            sb.append("&uuid=");
            sb.append(this.e.a());
            try {
                sb.append("&");
                sb.append(Constants.PARAM_ACCESS_TOKEN);
                sb.append("=");
                sb.append(URLEncoder.encode(this.e.b(), "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
                nox.b("SilentTokenRequest", "urlencode: UnsupportedEncodingException", true);
            }
        }
        if (!TextUtils.isEmpty(this.e.f())) {
            sb.append("&scope=");
            sb.append(this.e.f());
        }
        if (!TextUtils.isEmpty(this.e.m())) {
            sb.append("&carrier_id=");
            sb.append(this.e.m());
        }
        String string = sb.toString();
        nox.b("SilentTokenRequest", "urlencode: url = " + string, false);
        return string;
    }
}
