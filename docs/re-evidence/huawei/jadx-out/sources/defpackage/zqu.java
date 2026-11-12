package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.tencent.connect.common.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import net.openid.appauth.AuthorizationManagementRequest;
import net.openid.appauth.AuthorizationServiceConfiguration;
import net.openid.appauth.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class zqu implements AuthorizationManagementRequest {
    private static final Set<String> r = zqs.b("client_id", "code_challenge", "code_challenge_method", "display", "login_hint", "prompt", "ui_locales", CommonConstant.ReqAccessTokenParam.REDIRECT_URI, "response_mode", CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE, "scope", "state", "claims", "claims_locales");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f54498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f54499c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final AuthorizationServiceConfiguration h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Uri m;
    public final String n;
    public final String o;
    public final String p;
    public final String s;
    public final String t;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f54500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f54501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f54502c;
        private JSONObject d;
        private Map<String, String> e = new HashMap();
        private String f;
        private AuthorizationServiceConfiguration g;
        private String h;
        private String i;
        private String j;
        private String k;
        private String l;
        private String m;
        private String n;
        private Uri o;
        private String p;
        private String r;
        private String t;

        public b(AuthorizationServiceConfiguration authorizationServiceConfiguration, String str, String str2, Uri uri) {
            c(authorizationServiceConfiguration);
            e(str);
            c(str2);
            a(uri);
            g(zqx.a());
            b(zqx.a());
            d(zrb.d());
        }

        public b c(AuthorizationServiceConfiguration authorizationServiceConfiguration) {
            this.g = (AuthorizationServiceConfiguration) zre.c(authorizationServiceConfiguration, "configuration cannot be null");
            return this;
        }

        public b e(String str) {
            this.f54500a = zre.c(str, (Object) "client ID cannot be null or empty");
            return this;
        }

        public b a(String str) {
            this.l = zre.a(str, "prompt must be null or non-empty");
            return this;
        }

        public b i(String str) {
            this.t = zre.a(str, "uiLocales must be null or not empty");
            return this;
        }

        public b c(String str) {
            this.m = zre.c(str, (Object) "expected response type cannot be null or empty");
            return this;
        }

        public b a(Uri uri) {
            this.o = (Uri) zre.c(uri, "redirect URI cannot be null or empty");
            return this;
        }

        public b f(String str) {
            if (TextUtils.isEmpty(str)) {
                this.p = null;
                return this;
            }
            c(str.split(" +"));
            return this;
        }

        public b c(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            d(Arrays.asList(strArr));
            return this;
        }

        public b d(Iterable<String> iterable) {
            this.p = zqq.a(iterable);
            return this;
        }

        public b g(String str) {
            this.r = zre.a(str, "state cannot be empty if defined");
            return this;
        }

        public b b(String str) {
            this.n = zre.a(str, "nonce cannot be empty if defined");
            return this;
        }

        public b d(String str) {
            if (str != null) {
                zrb.a(str);
                this.f54501b = str;
                this.i = zrb.b(str);
                this.j = zrb.e();
                return this;
            }
            this.f54501b = null;
            this.i = null;
            this.j = null;
            return this;
        }

        public b d(Map<String, String> map) {
            this.e = zqs.d(map, zqu.r);
            return this;
        }

        public zqu a() {
            return new zqu(this.g, this.f54500a, this.m, this.o, this.f, this.h, this.l, this.t, this.p, this.r, this.n, this.f54501b, this.i, this.j, this.k, this.d, this.f54502c, Collections.unmodifiableMap(new HashMap(this.e)));
        }
    }

    private zqu(AuthorizationServiceConfiguration authorizationServiceConfiguration, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, JSONObject jSONObject, String str14, Map<String, String> map) {
        this.h = authorizationServiceConfiguration;
        this.e = str;
        this.k = str2;
        this.m = uri;
        this.f54498b = map;
        this.f = str3;
        this.g = str4;
        this.n = str5;
        this.s = str6;
        this.p = str7;
        this.t = str8;
        this.l = str9;
        this.d = str10;
        this.j = str11;
        this.i = str12;
        this.o = str13;
        this.f54499c = jSONObject;
        this.f54497a = str14;
    }

    @Override // net.openid.appauth.AuthorizationManagementRequest
    public String getState() {
        return this.t;
    }

    @Override // net.openid.appauth.AuthorizationManagementRequest
    public Uri toUri() {
        Uri.Builder builderAppendQueryParameter = this.h.f43040a.buildUpon().appendQueryParameter(CommonConstant.ReqAccessTokenParam.REDIRECT_URI, this.m.toString()).appendQueryParameter("client_id", this.e).appendQueryParameter(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE, this.k);
        zrq.c(builderAppendQueryParameter, "display", this.f);
        zrq.c(builderAppendQueryParameter, "login_hint", this.g);
        zrq.c(builderAppendQueryParameter, "prompt", this.n);
        zrq.c(builderAppendQueryParameter, "ui_locales", this.s);
        zrq.c(builderAppendQueryParameter, "state", this.t);
        zrq.c(builderAppendQueryParameter, Constants.NONCE, this.l);
        zrq.c(builderAppendQueryParameter, "scope", this.p);
        zrq.c(builderAppendQueryParameter, "response_mode", this.o);
        if (this.d != null) {
            builderAppendQueryParameter.appendQueryParameter("code_challenge", this.j).appendQueryParameter("code_challenge_method", this.i);
        }
        zrq.c(builderAppendQueryParameter, "claims", this.f54499c);
        zrq.c(builderAppendQueryParameter, "claims_locales", this.f54497a);
        for (Map.Entry<String, String> entry : this.f54498b.entrySet()) {
            builderAppendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderAppendQueryParameter.build();
    }

    @Override // net.openid.appauth.AuthorizationManagementRequest
    public JSONObject jsonSerialize() {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.e(jSONObject, "configuration", this.h.c());
        JsonUtil.e(jSONObject, "clientId", this.e);
        JsonUtil.e(jSONObject, "responseType", this.k);
        JsonUtil.e(jSONObject, "redirectUri", this.m.toString());
        JsonUtil.a(jSONObject, "display", this.f);
        JsonUtil.a(jSONObject, "login_hint", this.g);
        JsonUtil.a(jSONObject, "scope", this.p);
        JsonUtil.a(jSONObject, "prompt", this.n);
        JsonUtil.a(jSONObject, "ui_locales", this.s);
        JsonUtil.a(jSONObject, "state", this.t);
        JsonUtil.a(jSONObject, Constants.NONCE, this.l);
        JsonUtil.a(jSONObject, "codeVerifier", this.d);
        JsonUtil.a(jSONObject, "codeVerifierChallenge", this.j);
        JsonUtil.a(jSONObject, "codeVerifierChallengeMethod", this.i);
        JsonUtil.a(jSONObject, "responseMode", this.o);
        JsonUtil.c(jSONObject, "claims", this.f54499c);
        JsonUtil.a(jSONObject, "claimsLocales", this.f54497a);
        JsonUtil.e(jSONObject, "additionalParameters", JsonUtil.a(this.f54498b));
        return jSONObject;
    }

    @Override // net.openid.appauth.AuthorizationManagementRequest
    public String jsonSerializeString() {
        return jsonSerialize().toString();
    }

    public static zqu e(JSONObject jSONObject) throws JSONException {
        zre.c(jSONObject, "json cannot be null");
        return new zqu(AuthorizationServiceConfiguration.e(jSONObject.getJSONObject("configuration")), JsonUtil.d(jSONObject, "clientId"), JsonUtil.d(jSONObject, "responseType"), JsonUtil.i(jSONObject, "redirectUri"), JsonUtil.c(jSONObject, "display"), JsonUtil.c(jSONObject, "login_hint"), JsonUtil.c(jSONObject, "prompt"), JsonUtil.c(jSONObject, "ui_locales"), JsonUtil.c(jSONObject, "scope"), JsonUtil.c(jSONObject, "state"), JsonUtil.c(jSONObject, Constants.NONCE), JsonUtil.c(jSONObject, "codeVerifier"), JsonUtil.c(jSONObject, "codeVerifierChallenge"), JsonUtil.c(jSONObject, "codeVerifierChallengeMethod"), JsonUtil.c(jSONObject, "responseMode"), JsonUtil.a(jSONObject, "claims"), JsonUtil.c(jSONObject, "claimsLocales"), JsonUtil.h(jSONObject, "additionalParameters"));
    }
}
