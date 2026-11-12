package com.xiaomi.ai.a.a;

import com.xiaomi.ai.b.f;
import com.xiaomi.ai.b.g;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.log.Logger;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes18.dex */
public class d extends com.xiaomi.ai.a.a {
    private String d;
    private String e;
    private String f;

    public d(com.xiaomi.ai.core.a aVar) {
        super(7, aVar);
        if (!c()) {
            throw new IllegalArgumentException("DeviceTokenProvider: illegal config");
        }
    }

    private String a(String str) {
        return str == null ? "" : str;
    }

    private String a(String str, String str2, String str3, String str4, URI uri) {
        String strA = a("GET", str4, uri);
        Logger.a("ServerAuthProvider", "StringToSign " + strA);
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.getUrlDecoder().decode(str3), "HmacSHA256");
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKeySpec);
            return String.format("%s client_id:%s,key_id:%s,signature:%s", "DS-SIGNATURE-V1", str, str2, com.xiaomi.ai.b.b.a(mac.doFinal(strA.getBytes("utf-8"))));
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException e) {
            Logger.d("ServerAuthProvider", Logger.throwableToString(e));
            return null;
        }
    }

    private String a(String str, String str2, URI uri) {
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

    private boolean c() {
        String str;
        String string = this.b.getAivsConfig().getString(AivsConfig.Auth.CLIENT_ID);
        this.d = string;
        if (f.a(string)) {
            str = "initProvider: CLIENT_ID is not set";
        } else {
            String string2 = this.b.getAivsConfig().getString(AivsConfig.Auth.ServerAuth.KEY);
            this.e = string2;
            if (f.a(string2)) {
                str = "initProvider: AivsConfig.Auth.ServerAuth.KEY is not set";
            } else {
                String string3 = this.b.getAivsConfig().getString(AivsConfig.Auth.ServerAuth.SECRET);
                this.f = string3;
                if (!f.a(string3)) {
                    return true;
                }
                str = "initProvider: AivsConfig.Auth.ServerAuth.SECRET is not set";
            }
        }
        Logger.d("ServerAuthProvider", str);
        return false;
    }

    @Override // com.xiaomi.ai.a.a
    public String a(boolean z, boolean z2) {
        return null;
    }

    @Override // com.xiaomi.ai.a.a
    public String a(boolean z, boolean z2, Map<String, String> map) {
        String strA = g.a();
        try {
            if (this.b.getHttpDns() == null) {
                return null;
            }
            URI uri = new URI(this.b.getHttpDns().d());
            Logger.a("ServerAuthProvider", "getAuthHeader mDate=" + strA);
            if (map != null) {
                map.put("X-Xiaomi-Date", strA);
            }
            return a(this.d, this.e, this.f, strA, uri);
        } catch (URISyntaxException unused) {
            return null;
        }
    }
}
