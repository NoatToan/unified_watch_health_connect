package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwidauth.c.k;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes11.dex */
public class nng extends k {
    private nnj e;
    private Context j;

    public nng(Context context, nnj nnjVar) {
        this.e = nnjVar;
        this.j = context;
    }

    @Override // com.huawei.hwidauth.c.k
    public String a() throws IllegalStateException, IOException, IllegalArgumentException {
        return "";
    }

    @Override // com.huawei.hwidauth.c.k
    public String b() {
        return "/oauth2/v3/token?client_id=" + this.e.c() + "&cVersion=HwID_6.13.0.301&hms_version=" + nom.c(this.j) + "&sdkVersion6.13.0.301";
    }

    @Override // com.huawei.hwidauth.c.k
    public String c() {
        return "";
    }

    @Override // com.huawei.hwidauth.c.k
    public String a_() {
        nox.b("GwTokenRequest", "urlencode: enter", true);
        StringBuilder sb = new StringBuilder("client_id=");
        sb.append(this.e.c());
        sb.append("&grant_type=");
        sb.append(this.e.e());
        sb.append("&redirect_uri=");
        sb.append(this.e.k());
        sb.append("&need_code=");
        sb.append(this.e.i());
        sb.append("&need_open_uid=");
        sb.append(this.e.f());
        sb.append("&supportAlg=");
        sb.append(this.e.a());
        try {
            sb.append("&");
            sb.append("code");
            sb.append("=");
            sb.append(URLEncoder.encode(this.e.b(), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            nox.b("GwTokenRequest", "urlencode: " + e.getClass().getSimpleName(), true);
        }
        if (!TextUtils.isEmpty(this.e.h())) {
            sb.append("&carrier_id=");
            sb.append(this.e.h());
        }
        if (this.e.j() != null) {
            sb.append("&code_type=");
            sb.append(this.e.j());
            if (this.e.j().intValue() == 1) {
                sb.append("&uuid=");
                sb.append(this.e.l());
                sb.append("&device_id=");
                sb.append(this.e.n());
                sb.append("&device_type=");
                sb.append(this.e.m());
                sb.append("&package_name=");
                sb.append(this.e.o());
            }
        }
        if (!TextUtils.isEmpty(this.e.g())) {
            sb.append("&code_verifier=");
            sb.append(this.e.g());
        }
        if (!TextUtils.isEmpty(this.e.d())) {
            sb.append("&client_secret=");
            sb.append(this.e.d());
        }
        String string = sb.toString();
        nox.b("GwTokenRequest", "urlencode: url = " + string, false);
        return string;
    }
}
