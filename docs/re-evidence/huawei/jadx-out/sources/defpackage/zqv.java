package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.openid.appauth.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class zqv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final JsonUtil.e f54503a;
    static final JsonUtil.e aa;
    static final JsonUtil.d ab;
    static final JsonUtil.e ac;
    static final JsonUtil.d ad;
    static final JsonUtil.e ae;
    static final JsonUtil.e af;
    static final JsonUtil.e ag;
    static final JsonUtil.d ah;
    static final JsonUtil.e ai;
    private static final List<String> al;
    static final JsonUtil.e am;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final JsonUtil.e f54504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final JsonUtil.e f54505c;
    static final JsonUtil.a d;
    static final JsonUtil.d e;
    static final JsonUtil.e f;
    static final JsonUtil.d g;
    static final JsonUtil.e h;
    static final JsonUtil.e i;
    static final JsonUtil.e j;
    static final JsonUtil.e k;
    static final JsonUtil.e l;
    static final JsonUtil.d m;
    static final JsonUtil.d n;
    static final JsonUtil.c o;
    static final JsonUtil.e p;
    static final JsonUtil.e q;
    static final JsonUtil.e r;
    static final JsonUtil.d s;
    static final JsonUtil.d t;
    static final JsonUtil.a u;
    static final JsonUtil.a v;
    static final JsonUtil.e w;
    static final JsonUtil.e x;
    static final JsonUtil.a y;
    static final JsonUtil.e z;
    public final JSONObject an;

    static {
        JsonUtil.c cVarA = a("issuer");
        o = cVarA;
        JsonUtil.d dVarB = b("authorization_endpoint");
        e = dVarB;
        ab = b("token_endpoint");
        g = b("end_session_endpoint");
        ah = b("userinfo_endpoint");
        JsonUtil.d dVarB2 = b("jwks_uri");
        m = dVarB2;
        t = b("registration_endpoint");
        z = d("scopes_supported");
        JsonUtil.e eVarD = d("response_types_supported");
        x = eVarD;
        w = d("response_modes_supported");
        i = e("grant_types_supported", Arrays.asList("authorization_code", "implicit"));
        f54504b = d("acr_values_supported");
        JsonUtil.e eVarD2 = d("subject_types_supported");
        aa = eVarD2;
        JsonUtil.e eVarD3 = d("id_token_signing_alg_values_supported");
        k = eVarD3;
        j = d("id_token_encryption_enc_values_supported");
        l = d("id_token_encryption_enc_values_supported");
        am = d("userinfo_signing_alg_values_supported");
        ae = d("userinfo_encryption_alg_values_supported");
        af = d("userinfo_encryption_enc_values_supported");
        p = d("request_object_signing_alg_values_supported");
        q = d("request_object_encryption_alg_values_supported");
        r = d("request_object_encryption_enc_values_supported");
        ac = e("token_endpoint_auth_methods_supported", Collections.singletonList("client_secret_basic"));
        ai = d("token_endpoint_auth_signing_alg_values_supported");
        f = d("display_values_supported");
        h = e("claim_types_supported", Collections.singletonList("normal"));
        f54505c = d("claims_supported");
        ad = b("service_documentation");
        f54503a = d("claims_locales_supported");
        ag = d("ui_locales_supported");
        d = c("claims_parameter_supported", false);
        u = c("request_parameter_supported", false);
        v = c("request_uri_parameter_supported", true);
        y = c("require_request_uri_registration", false);
        n = b("op_policy_uri");
        s = b("op_tos_uri");
        al = Arrays.asList(cVarA.key, dVarB.key, dVarB2.key, eVarD.key, eVarD2.key, eVarD3.key);
    }

    public zqv(JSONObject jSONObject) throws JSONException, d {
        this.an = (JSONObject) zre.c(jSONObject);
        for (String str : al) {
            if (!this.an.has(str) || this.an.get(str) == null) {
                throw new d(str);
            }
        }
    }

    public static class d extends Exception {
        private String d;

        public d(String str) {
            super("Missing mandatory configuration field: " + str);
            this.d = str;
        }

        public String b() {
            return this.d;
        }
    }

    private <T> T c(JsonUtil.Field<T> field) {
        return (T) JsonUtil.b(this.an, field);
    }

    public String c() {
        return (String) c(o);
    }

    public Uri b() {
        return (Uri) c(e);
    }

    public Uri e() {
        return (Uri) c(ab);
    }

    public Uri d() {
        return (Uri) c(g);
    }

    public Uri a() {
        return (Uri) c(t);
    }

    private static JsonUtil.c a(String str) {
        return new JsonUtil.c(str);
    }

    private static JsonUtil.d b(String str) {
        return new JsonUtil.d(str);
    }

    private static JsonUtil.e d(String str) {
        return new JsonUtil.e(str);
    }

    private static JsonUtil.e e(String str, List<String> list) {
        return new JsonUtil.e(str, list);
    }

    private static JsonUtil.a c(String str, boolean z2) {
        return new JsonUtil.a(str, z2);
    }
}
