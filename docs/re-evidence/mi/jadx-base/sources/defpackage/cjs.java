package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class cjs extends tq1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f5412k;
    public String l;
    public String m;

    public cjs(gt3 gt3Var) {
        super(7, gt3Var);
        a();
    }

    public final String a(String str) {
        return str == null ? "" : str;
    }

    public final String b(String str, String str2, String str3, String str4, URI uri) {
        String strC = c("GET", str4, uri);
        wpe.b("ServerAuthProvider", "StringToSign " + strC);
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.getUrlDecoder().decode(str3), "HmacSHA256");
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKeySpec);
            return String.format("%s client_id:%s,key_id:%s,signature:%s", "DS-SIGNATURE-V1", str, str2, e3s.b(mac.doFinal(strC.getBytes("utf-8"))));
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException e) {
            wpe.e("ServerAuthProvider", wpe.o(e));
            return null;
        }
    }

    public final String c(String str, String str2, URI uri) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append("\n");
        stringBuffer.append(a(uri.getPath()));
        stringBuffer.append("\n");
        stringBuffer.append(a(uri.getQuery()));
        stringBuffer.append("\n");
        stringBuffer.append(str2);
        stringBuffer.append("\n");
        stringBuffer.append(a(uri.getHost()));
        stringBuffer.append("\n");
        stringBuffer.append("\n");
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    @Override // defpackage.tq1
    public String getAuthHeader(boolean z, boolean z2, Map<String, String> map) {
        String strA = sus.a();
        try {
            if (this.mChannel.getHttpDns() == null) {
                return null;
            }
            URI uri = new URI(this.mChannel.getHttpDns().j());
            wpe.b("ServerAuthProvider", "getAuthHeader mDate=" + strA);
            if (map != null) {
                map.put("X-Xiaomi-Date", strA);
            }
            return b(this.f5412k, this.l, this.m, strA, uri);
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    @Override // defpackage.tq1
    public String requestToken(boolean z, boolean z2) {
        return null;
    }

    private void a() {
        String strI = this.mChannel.getAivsConfig().i("auth.client_id");
        this.f5412k = strI;
        if (yrs.b(strI)) {
            wpe.e("ServerAuthProvider", "initProvider: CLIENT_ID is not set");
            throw new IllegalArgumentException("CLIENT_ID is not set");
        }
        String strI2 = this.mChannel.getAivsConfig().i("auth.server_auth.key");
        this.l = strI2;
        if (yrs.b(strI2)) {
            wpe.e("ServerAuthProvider", "initProvider: AivsConfig.Auth.ServerAuth.KEY is not set");
            throw new IllegalArgumentException("AivsConfig.Auth.ServerAuth.KEY is not set");
        }
        String strI3 = this.mChannel.getAivsConfig().i("auth.server_auth.secret");
        this.m = strI3;
        if (yrs.b(strI3)) {
            wpe.e("ServerAuthProvider", "initProvider: AivsConfig.Auth.ServerAuth.SECRET is not set");
            throw new IllegalArgumentException("AivsConfig.Auth.ServerAuth.SECRET is not set");
        }
    }
}
