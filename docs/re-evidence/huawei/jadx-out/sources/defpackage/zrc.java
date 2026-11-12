package defpackage;

import java.util.HashMap;
import java.util.Map;
import net.openid.appauth.ClientAuthentication;

/* JADX INFO: loaded from: classes20.dex */
public class zrc implements ClientAuthentication {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f54528c;

    @Override // net.openid.appauth.ClientAuthentication
    public final Map<String, String> getRequestHeaders(String str) {
        return null;
    }

    public zrc(String str) {
        this.f54528c = (String) zre.c(str, (Object) "clientSecret cannot be null");
    }

    @Override // net.openid.appauth.ClientAuthentication
    public final Map<String, String> getRequestParameters(String str) {
        HashMap map = new HashMap();
        map.put("client_id", str);
        map.put("client_secret", this.f54528c);
        return map;
    }
}
