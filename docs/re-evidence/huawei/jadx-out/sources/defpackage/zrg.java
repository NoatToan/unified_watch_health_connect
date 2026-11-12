package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.openid.appauth.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class zrg {
    private static final Set<String> f = new HashSet(Arrays.asList("client_id", "client_secret", "client_secret_expires_at", "registration_access_token", "registration_client_uri", "client_id_issued_at", "token_endpoint_auth_method"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f54536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f54537c;
    public final String d;
    public final Long e;
    public final Uri g;
    public final String h;
    public final String i;
    public final zrf j;

    private zrg(zrf zrfVar, String str, Long l, String str2, Long l2, String str3, Uri uri, String str4, Map<String, String> map) {
        this.j = zrfVar;
        this.f54535a = str;
        this.f54536b = l;
        this.d = str2;
        this.e = l2;
        this.i = str3;
        this.g = uri;
        this.h = str4;
        this.f54537c = map;
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.e(jSONObject, "request", this.j.e());
        JsonUtil.e(jSONObject, "client_id", this.f54535a);
        JsonUtil.d(jSONObject, "client_id_issued_at", this.f54536b);
        JsonUtil.a(jSONObject, "client_secret", this.d);
        JsonUtil.d(jSONObject, "client_secret_expires_at", this.e);
        JsonUtil.a(jSONObject, "registration_access_token", this.i);
        JsonUtil.e(jSONObject, "registration_client_uri", this.g);
        JsonUtil.a(jSONObject, "token_endpoint_auth_method", this.h);
        JsonUtil.e(jSONObject, "additionalParameters", JsonUtil.a(this.f54537c));
        return jSONObject;
    }

    public static zrg c(JSONObject jSONObject) throws JSONException {
        zre.c(jSONObject, "json cannot be null");
        if (!jSONObject.has("request")) {
            throw new IllegalArgumentException("registration request not found in JSON");
        }
        return new zrg(zrf.a(jSONObject.getJSONObject("request")), JsonUtil.d(jSONObject, "client_id"), JsonUtil.b(jSONObject, "client_id_issued_at"), JsonUtil.c(jSONObject, "client_secret"), JsonUtil.b(jSONObject, "client_secret_expires_at"), JsonUtil.c(jSONObject, "registration_access_token"), JsonUtil.f(jSONObject, "registration_client_uri"), JsonUtil.c(jSONObject, "token_endpoint_auth_method"), JsonUtil.h(jSONObject, "additionalParameters"));
    }
}
