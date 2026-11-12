package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.tencent.connect.common.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import net.openid.appauth.AuthorizationServiceConfiguration;
import net.openid.appauth.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class zrj {
    private static final Set<String> o = Collections.unmodifiableSet(new HashSet(Arrays.asList("client_id", "code", "code_verifier", "grant_type", CommonConstant.ReqAccessTokenParam.REDIRECT_URI, "refresh_token", "scope")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f54539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AuthorizationServiceConfiguration f54541c;
    public final String d;
    public final String e;
    public final Uri f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f54542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AuthorizationServiceConfiguration f54543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<String, String> f54544c;
        private String d;
        private String e;
        private String f;
        private Uri g;
        private String h;
        private String i;
        private String j;

        public a(AuthorizationServiceConfiguration authorizationServiceConfiguration, String str) {
            a(authorizationServiceConfiguration);
            d(str);
            this.f54544c = new LinkedHashMap();
        }

        public a a(AuthorizationServiceConfiguration authorizationServiceConfiguration) {
            this.f54543b = (AuthorizationServiceConfiguration) zre.c(authorizationServiceConfiguration);
            return this;
        }

        public a d(String str) {
            this.e = zre.c(str, (Object) "clientId cannot be null or empty");
            return this;
        }

        public a c(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f = null;
                return this;
            }
            this.f = str;
            return this;
        }

        public a e(String str) {
            this.h = zre.c(str, (Object) "grantType cannot be null or empty");
            return this;
        }

        public a d(Uri uri) {
            if (uri != null) {
                zre.c(uri.getScheme(), (Object) "redirectUri must have a scheme");
            }
            this.g = uri;
            return this;
        }

        public a g(String str) {
            if (TextUtils.isEmpty(str)) {
                this.j = null;
                return this;
            }
            a(str.split(" +"));
            return this;
        }

        public a a(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            e(Arrays.asList(strArr));
            return this;
        }

        public a e(Iterable<String> iterable) {
            this.j = zqq.a(iterable);
            return this;
        }

        public a b(String str) {
            zre.a(str, "authorization code must not be empty");
            this.d = str;
            return this;
        }

        public a j(String str) {
            if (str != null) {
                zre.c(str, (Object) "refresh token cannot be empty if defined");
            }
            this.i = str;
            return this;
        }

        public a a(String str) {
            if (str != null) {
                zrb.a(str);
            }
            this.f54542a = str;
            return this;
        }

        public a a(Map<String, String> map) {
            this.f54544c = zqs.d(map, zrj.o);
            return this;
        }

        public zrj d() {
            String strB = b();
            if ("authorization_code".equals(strB)) {
                zre.c(this.d, (Object) "authorization code must be specified for grant_type = authorization_code");
            }
            if ("refresh_token".equals(strB)) {
                zre.c(this.i, (Object) "refresh token must be specified for grant_type = refresh_token");
            }
            if (strB.equals("authorization_code") && this.g == null) {
                throw new IllegalStateException("no redirect URI specified on token request for code exchange");
            }
            return new zrj(this.f54543b, this.e, this.f, strB, this.g, this.j, this.d, this.i, this.f54542a, Collections.unmodifiableMap(this.f54544c));
        }

        private String b() {
            String str = this.h;
            if (str != null) {
                return str;
            }
            if (this.d != null) {
                return "authorization_code";
            }
            if (this.i != null) {
                return "refresh_token";
            }
            throw new IllegalStateException("grant type not specified and cannot be inferred");
        }
    }

    private zrj(AuthorizationServiceConfiguration authorizationServiceConfiguration, String str, String str2, String str3, Uri uri, String str4, String str5, String str6, String str7, Map<String, String> map) {
        this.f54541c = authorizationServiceConfiguration;
        this.e = str;
        this.h = str2;
        this.g = str3;
        this.f = uri;
        this.j = str4;
        this.d = str5;
        this.i = str6;
        this.f54540b = str7;
        this.f54539a = map;
    }

    public Map<String, String> d() {
        HashMap map = new HashMap();
        map.put("grant_type", this.g);
        a(map, CommonConstant.ReqAccessTokenParam.REDIRECT_URI, this.f);
        a(map, "code", this.d);
        a(map, "refresh_token", this.i);
        a(map, "code_verifier", this.f54540b);
        a(map, "scope", this.j);
        for (Map.Entry<String, String> entry : this.f54539a.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }

    private void a(Map<String, String> map, String str, Object obj) {
        if (obj != null) {
            map.put(str, obj.toString());
        }
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.e(jSONObject, "configuration", this.f54541c.c());
        JsonUtil.e(jSONObject, "clientId", this.e);
        JsonUtil.a(jSONObject, Constants.NONCE, this.h);
        JsonUtil.e(jSONObject, "grantType", this.g);
        JsonUtil.e(jSONObject, "redirectUri", this.f);
        JsonUtil.a(jSONObject, "scope", this.j);
        JsonUtil.a(jSONObject, "authorizationCode", this.d);
        JsonUtil.a(jSONObject, FaqConstants.FAQ_REFRESH, this.i);
        JsonUtil.a(jSONObject, "codeVerifier", this.f54540b);
        JsonUtil.e(jSONObject, "additionalParameters", JsonUtil.a(this.f54539a));
        return jSONObject;
    }

    public String a() {
        return e().toString();
    }

    public static zrj b(JSONObject jSONObject) throws JSONException {
        zre.c(jSONObject, "json object cannot be null");
        return new zrj(AuthorizationServiceConfiguration.e(jSONObject.getJSONObject("configuration")), JsonUtil.d(jSONObject, "clientId"), JsonUtil.c(jSONObject, Constants.NONCE), JsonUtil.d(jSONObject, "grantType"), JsonUtil.f(jSONObject, "redirectUri"), JsonUtil.c(jSONObject, "scope"), JsonUtil.c(jSONObject, "authorizationCode"), JsonUtil.c(jSONObject, FaqConstants.FAQ_REFRESH), JsonUtil.c(jSONObject, "codeVerifier"), JsonUtil.h(jSONObject, "additionalParameters"));
    }
}
