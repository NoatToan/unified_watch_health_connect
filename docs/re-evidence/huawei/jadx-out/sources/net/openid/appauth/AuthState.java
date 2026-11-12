package net.openid.appauth;

import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import defpackage.zqt;
import defpackage.zqw;
import defpackage.zqy;
import defpackage.zrc;
import defpackage.zre;
import defpackage.zrg;
import defpackage.zrh;
import defpackage.zri;
import defpackage.zrj;
import defpackage.zrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.openid.appauth.internal.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class AuthState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zrl f43027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AuthorizationServiceConfiguration f43028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zrg f43029c;
    private zqw d;
    private zqt e;
    private final Object f = new Object();
    private String g;
    private String h;
    private List<AuthStateAction> i;
    private boolean j;

    public interface AuthStateAction {
        void execute(String str, String str2, zqw zqwVar);
    }

    public AuthState() {
    }

    public AuthState(AuthorizationServiceConfiguration authorizationServiceConfiguration) {
        this.f43028b = authorizationServiceConfiguration;
    }

    public AuthorizationServiceConfiguration e() {
        zqt zqtVar = this.e;
        if (zqtVar != null) {
            return zqtVar.j.h;
        }
        return this.f43028b;
    }

    public String a() {
        if (this.d != null) {
            return null;
        }
        zrl zrlVar = this.f43027a;
        if (zrlVar != null && zrlVar.e != null) {
            return this.f43027a.e;
        }
        zqt zqtVar = this.e;
        if (zqtVar != null) {
            return zqtVar.f54493c;
        }
        return null;
    }

    public Long d() {
        if (this.d != null) {
            return null;
        }
        zrl zrlVar = this.f43027a;
        if (zrlVar != null && zrlVar.e != null) {
            return this.f43027a.f54546b;
        }
        zqt zqtVar = this.e;
        if (zqtVar == null || zqtVar.f54493c == null) {
            return null;
        }
        return this.e.e;
    }

    public String h() {
        if (this.d != null) {
            return null;
        }
        zrl zrlVar = this.f43027a;
        if (zrlVar != null && zrlVar.d != null) {
            return this.f43027a.d;
        }
        zqt zqtVar = this.e;
        if (zqtVar != null) {
            return zqtVar.f54491a;
        }
        return null;
    }

    public String c() {
        zrg zrgVar = this.f43029c;
        if (zrgVar != null) {
            return zrgVar.d;
        }
        return null;
    }

    public boolean j() {
        if (this.d == null) {
            return (a() == null && h() == null) ? false : true;
        }
        return false;
    }

    boolean e(Clock clock) {
        if (this.j) {
            return true;
        }
        if (d() == null) {
            return a() == null;
        }
        return d().longValue() <= clock.getCurrentTimeMillis() + 60000;
    }

    public void d(zqt zqtVar, zqw zqwVar) {
        zre.e((zqwVar != null) ^ (zqtVar != null), "exactly one of authResponse or authException should be non-null");
        if (zqwVar != null) {
            if (zqwVar.d == 1) {
                this.d = zqwVar;
            }
        } else {
            this.e = zqtVar;
            this.f43028b = null;
            this.f43027a = null;
            this.h = null;
            this.d = null;
            this.g = zqtVar.g != null ? zqtVar.g : zqtVar.j.p;
        }
    }

    public void e(zrl zrlVar, zqw zqwVar) {
        zre.e((zqwVar != null) ^ (zrlVar != null), "exactly one of tokenResponse or authException should be non-null");
        zqw zqwVar2 = this.d;
        if (zqwVar2 != null) {
            Logger.c("AuthState.update should not be called in an error state (%s), call updatewith the result of the fresh authorization response first", zqwVar2);
            this.d = null;
        }
        if (zqwVar != null) {
            if (zqwVar.d == 2) {
                this.d = zqwVar;
            }
        } else {
            this.f43027a = zrlVar;
            if (zrlVar.j != null) {
                this.g = zrlVar.j;
            }
            if (zrlVar.f54547c != null) {
                this.h = zrlVar.f54547c;
            }
        }
    }

    public void e(AuthorizationService authorizationService, AuthStateAction authStateAction) {
        a(authorizationService, zrh.e, Collections.EMPTY_MAP, zri.f54538b, authStateAction);
    }

    void a(AuthorizationService authorizationService, ClientAuthentication clientAuthentication, Map<String, String> map, Clock clock, AuthStateAction authStateAction) {
        zre.c(authorizationService, "service cannot be null");
        zre.c(clientAuthentication, "client authentication cannot be null");
        zre.c(map, "additional params cannot be null");
        zre.c(clock, "clock cannot be null");
        zre.c(authStateAction, "action cannot be null");
        if (!e(clock)) {
            authStateAction.execute(a(), h(), null);
            return;
        }
        if (this.h == null) {
            authStateAction.execute(null, null, zqw.e(zqw.a.f54511c, new IllegalStateException("No refresh token available and token have expired")));
            return;
        }
        zre.c(this.f, "pending actions sync object cannot be null");
        synchronized (this.f) {
            List<AuthStateAction> list = this.i;
            if (list != null) {
                list.add(authStateAction);
                return;
            }
            ArrayList arrayList = new ArrayList();
            this.i = arrayList;
            arrayList.add(authStateAction);
            authorizationService.a(d(map), clientAuthentication, new AuthorizationService.TokenResponseCallback() { // from class: net.openid.appauth.AuthState.4
                @Override // net.openid.appauth.AuthorizationService.TokenResponseCallback
                public void onTokenRequestCompleted(zrl zrlVar, zqw zqwVar) {
                    String str;
                    String strH;
                    List list2;
                    AuthState.this.e(zrlVar, zqwVar);
                    if (zqwVar == null) {
                        AuthState.this.j = false;
                        String strA = AuthState.this.a();
                        strH = AuthState.this.h();
                        str = strA;
                        zqwVar = null;
                    } else {
                        str = null;
                        strH = null;
                    }
                    synchronized (AuthState.this.f) {
                        list2 = AuthState.this.i;
                        AuthState.this.i = null;
                    }
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        ((AuthStateAction) it.next()).execute(str, strH, zqwVar);
                    }
                }
            });
        }
    }

    public zrj d(Map<String, String> map) {
        if (this.h == null) {
            throw new IllegalStateException("No refresh token available for refresh request");
        }
        zqt zqtVar = this.e;
        if (zqtVar == null) {
            throw new IllegalStateException("No authorization configuration available for refresh request");
        }
        return new zrj.a(zqtVar.j.h, this.e.j.e).e("refresh_token").g(null).j(this.h).a(map).d();
    }

    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.a(jSONObject, FaqConstants.FAQ_REFRESH, this.h);
        JsonUtil.a(jSONObject, "scope", this.g);
        AuthorizationServiceConfiguration authorizationServiceConfiguration = this.f43028b;
        if (authorizationServiceConfiguration != null) {
            JsonUtil.e(jSONObject, NetworkService.Constants.CONFIG_SERVICE, authorizationServiceConfiguration.c());
        }
        zqw zqwVar = this.d;
        if (zqwVar != null) {
            JsonUtil.e(jSONObject, "mAuthorizationException", zqwVar.a());
        }
        zqt zqtVar = this.e;
        if (zqtVar != null) {
            JsonUtil.e(jSONObject, "lastAuthorizationResponse", zqtVar.jsonSerialize());
        }
        zrl zrlVar = this.f43027a;
        if (zrlVar != null) {
            JsonUtil.e(jSONObject, "mLastTokenResponse", zrlVar.c());
        }
        zrg zrgVar = this.f43029c;
        if (zrgVar != null) {
            JsonUtil.e(jSONObject, "lastRegistrationResponse", zrgVar.d());
        }
        return jSONObject;
    }

    public String f() {
        return g().toString();
    }

    public static AuthState c(JSONObject jSONObject) throws JSONException {
        zre.c(jSONObject, "json cannot be null");
        AuthState authState = new AuthState();
        authState.h = JsonUtil.c(jSONObject, FaqConstants.FAQ_REFRESH);
        authState.g = JsonUtil.c(jSONObject, "scope");
        if (jSONObject.has(NetworkService.Constants.CONFIG_SERVICE)) {
            authState.f43028b = AuthorizationServiceConfiguration.e(jSONObject.getJSONObject(NetworkService.Constants.CONFIG_SERVICE));
        }
        if (jSONObject.has("mAuthorizationException")) {
            authState.d = zqw.c(jSONObject.getJSONObject("mAuthorizationException"));
        }
        if (jSONObject.has("lastAuthorizationResponse")) {
            authState.e = zqt.e(jSONObject.getJSONObject("lastAuthorizationResponse"));
        }
        if (jSONObject.has("mLastTokenResponse")) {
            authState.f43027a = zrl.d(jSONObject.getJSONObject("mLastTokenResponse"));
        }
        if (jSONObject.has("lastRegistrationResponse")) {
            authState.f43029c = zrg.c(jSONObject.getJSONObject("lastRegistrationResponse"));
        }
        return authState;
    }

    public static AuthState a(String str) throws JSONException {
        zre.c(str, (Object) "jsonStr cannot be null or empty");
        return c(new JSONObject(str));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    public ClientAuthentication b() throws ClientAuthentication.c {
        byte b2;
        if (c() == null) {
            return zrh.e;
        }
        if (this.f43029c.h == null) {
            return new zqy(c());
        }
        String str = this.f43029c.h;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -2034587045) {
            if (iHashCode != 3387192) {
                if (iHashCode == 1338964435 && str.equals("client_secret_basic")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("none")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("client_secret_post")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return new zrc(c());
        }
        if (b2 == 1) {
            return zrh.e;
        }
        if (b2 == 2) {
            return new zqy(c());
        }
        throw new ClientAuthentication.c(this.f43029c.h);
    }
}
