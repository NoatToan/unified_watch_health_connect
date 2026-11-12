package defpackage;

import java.util.Collections;
import java.util.Map;
import net.openid.appauth.ClientAuthentication;

/* JADX INFO: loaded from: classes20.dex */
public class zrh implements ClientAuthentication {
    public static final zrh e = new zrh();

    @Override // net.openid.appauth.ClientAuthentication
    public Map<String, String> getRequestHeaders(String str) {
        return null;
    }

    private zrh() {
    }

    @Override // net.openid.appauth.ClientAuthentication
    public Map<String, String> getRequestParameters(String str) {
        return Collections.singletonMap("client_id", str);
    }
}
