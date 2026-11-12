package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.openid.appauth.AuthorizationManagementResponse;
import net.openid.appauth.Clock;
import net.openid.appauth.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class zqt extends AuthorizationManagementResponse {
    private static final Set<String> i = Collections.unmodifiableSet(new HashSet(Arrays.asList("token_type", "state", "code", Constants.PARAM_ACCESS_TOKEN, Constants.PARAM_EXPIRES_IN, "id_token", "scope")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54493c;
    public final Map<String, String> d;
    public final Long e;
    public final String f;
    public final String g;
    public final String h;
    public final zqu j;

    /* JADX INFO: loaded from: classes46.dex */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f54494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f54495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f54496c;
        private String d;
        private Map<String, String> e = new LinkedHashMap();
        private String f;
        private String g;
        private zqu h;
        private String j;

        public a(zqu zquVar) {
            this.h = (zqu) zre.c(zquVar, "authorization request cannot be null");
        }

        public a d(Uri uri) {
            return b(uri, zri.f54538b);
        }

        a b(Uri uri, Clock clock) {
            b(uri.getQueryParameter("state"));
            j(uri.getQueryParameter("token_type"));
            d(uri.getQueryParameter("code"));
            a(uri.getQueryParameter(Constants.PARAM_ACCESS_TOKEN));
            e(zrq.b(uri, Constants.PARAM_EXPIRES_IN), clock);
            c(uri.getQueryParameter("id_token"));
            e(uri.getQueryParameter("scope"));
            e(zqs.b(uri, zqt.i));
            return this;
        }

        public a b(String str) {
            zre.a(str, "state must not be empty");
            this.j = str;
            return this;
        }

        public a j(String str) {
            zre.a(str, "tokenType must not be empty");
            this.g = str;
            return this;
        }

        public a d(String str) {
            zre.a(str, "authorizationCode must not be empty");
            this.d = str;
            return this;
        }

        public a a(String str) {
            zre.a(str, "accessToken must not be empty");
            this.f54496c = str;
            return this;
        }

        public a e(Long l, Clock clock) {
            if (l == null) {
                this.f54494a = null;
                return this;
            }
            this.f54494a = Long.valueOf(clock.getCurrentTimeMillis() + TimeUnit.SECONDS.toMillis(l.longValue()));
            return this;
        }

        public a c(String str) {
            zre.a(str, "idToken cannot be empty");
            this.f54495b = str;
            return this;
        }

        public a e(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f = null;
                return this;
            }
            c(str.split(" +"));
            return this;
        }

        public a c(String... strArr) {
            if (strArr == null) {
                this.f = null;
                return this;
            }
            e(Arrays.asList(strArr));
            return this;
        }

        public a e(Iterable<String> iterable) {
            this.f = zqq.a(iterable);
            return this;
        }

        public a e(Map<String, String> map) {
            this.e = zqs.d(map, zqt.i);
            return this;
        }

        public zqt c() {
            return new zqt(this.h, this.j, this.g, this.d, this.f54496c, this.f54494a, this.f54495b, this.f, Collections.unmodifiableMap(this.e));
        }
    }

    private zqt(zqu zquVar, String str, String str2, String str3, String str4, Long l, String str5, String str6, Map<String, String> map) {
        this.j = zquVar;
        this.f = str;
        this.h = str2;
        this.f54492b = str3;
        this.f54493c = str4;
        this.e = l;
        this.f54491a = str5;
        this.g = str6;
        this.d = map;
    }

    public zrj a() {
        return c(Collections.EMPTY_MAP);
    }

    public zrj c(Map<String, String> map) {
        zre.c(map, "additionalExchangeParameters cannot be null");
        if (this.f54492b == null) {
            throw new IllegalStateException("authorizationCode not available for exchange request");
        }
        return new zrj.a(this.j.h, this.j.e).e("authorization_code").d(this.j.m).a(this.j.d).b(this.f54492b).a(map).c(this.j.l).d();
    }

    @Override // net.openid.appauth.AuthorizationManagementResponse
    public String getState() {
        return this.f;
    }

    @Override // net.openid.appauth.AuthorizationManagementResponse
    public JSONObject jsonSerialize() {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.e(jSONObject, "request", this.j.jsonSerialize());
        JsonUtil.a(jSONObject, "state", this.f);
        JsonUtil.a(jSONObject, "token_type", this.h);
        JsonUtil.a(jSONObject, "code", this.f54492b);
        JsonUtil.a(jSONObject, Constants.PARAM_ACCESS_TOKEN, this.f54493c);
        JsonUtil.d(jSONObject, "expires_at", this.e);
        JsonUtil.a(jSONObject, "id_token", this.f54491a);
        JsonUtil.a(jSONObject, "scope", this.g);
        JsonUtil.e(jSONObject, "additional_parameters", JsonUtil.a(this.d));
        return jSONObject;
    }

    public static zqt e(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("request")) {
            throw new IllegalArgumentException("authorization request not provided and not found in JSON");
        }
        return new zqt(zqu.e(jSONObject.getJSONObject("request")), JsonUtil.c(jSONObject, "state"), JsonUtil.c(jSONObject, "token_type"), JsonUtil.c(jSONObject, "code"), JsonUtil.c(jSONObject, Constants.PARAM_ACCESS_TOKEN), JsonUtil.b(jSONObject, "expires_at"), JsonUtil.c(jSONObject, "id_token"), JsonUtil.c(jSONObject, "scope"), JsonUtil.h(jSONObject, "additional_parameters"));
    }

    public static zqt c(String str) throws JSONException {
        return e(new JSONObject(str));
    }

    @Override // net.openid.appauth.AuthorizationManagementResponse
    public Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationResponse", jsonSerializeString());
        return intent;
    }

    public static zqt d(Intent intent) {
        zre.c(intent, "dataIntent must not be null");
        if (!intent.hasExtra("net.openid.appauth.AuthorizationResponse")) {
            return null;
        }
        try {
            return c(intent.getStringExtra("net.openid.appauth.AuthorizationResponse"));
        } catch (JSONException e) {
            throw new IllegalArgumentException("Intent contains malformed auth response", e);
        }
    }
}
