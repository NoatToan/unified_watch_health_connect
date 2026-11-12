package defpackage;

import android.util.Base64;
import java.util.Collections;
import java.util.Map;
import net.openid.appauth.ClientAuthentication;

/* JADX INFO: loaded from: classes20.dex */
public class zqy implements ClientAuthentication {
    private String d;

    @Override // net.openid.appauth.ClientAuthentication
    public final Map<String, String> getRequestParameters(String str) {
        return null;
    }

    public zqy(String str) {
        this.d = (String) zre.c(str, (Object) "mClientSecret cannot be null");
    }

    @Override // net.openid.appauth.ClientAuthentication
    public final Map<String, String> getRequestHeaders(String str) {
        return Collections.singletonMap("Authorization", "Basic " + Base64.encodeToString((zrq.e(str) + ":" + zrq.e(this.d)).getBytes(), 2));
    }
}
