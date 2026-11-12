package defpackage;

import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.openid.appauth.Clock;
import net.openid.appauth.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class zrl {
    private static final Set<String> g = new HashSet(Arrays.asList("token_type", Constants.PARAM_ACCESS_TOKEN, Constants.PARAM_EXPIRES_IN, "refresh_token", "id_token", "scope"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f54545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f54546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54547c;
    public final String d;
    public final String e;
    public final String f;
    public final zrj i;
    public final String j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f54548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f54549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f54550c;
        private Map<String, String> d;
        private String e;
        private String f;
        private String i;
        private zrj j;

        public a(zrj zrjVar) {
            c(zrjVar);
            this.d = Collections.EMPTY_MAP;
        }

        public a e(JSONObject jSONObject) throws JSONException {
            b(JsonUtil.d(jSONObject, "token_type"));
            c(JsonUtil.c(jSONObject, Constants.PARAM_ACCESS_TOKEN));
            b(JsonUtil.b(jSONObject, "expires_at"));
            if (jSONObject.has(Constants.PARAM_EXPIRES_IN)) {
                a(Long.valueOf(jSONObject.getLong(Constants.PARAM_EXPIRES_IN)));
            }
            a(JsonUtil.c(jSONObject, "refresh_token"));
            d(JsonUtil.c(jSONObject, "id_token"));
            e(JsonUtil.c(jSONObject, "scope"));
            e(zqs.c(jSONObject, zrl.g));
            return this;
        }

        public a c(zrj zrjVar) {
            this.j = (zrj) zre.c(zrjVar, "request cannot be null");
            return this;
        }

        public a b(String str) {
            this.i = zre.a(str, "token type must not be empty if defined");
            return this;
        }

        public a c(String str) {
            this.f54548a = zre.a(str, "access token cannot be empty if specified");
            return this;
        }

        public a a(Long l) {
            return a(l, zri.f54538b);
        }

        a a(Long l, Clock clock) {
            if (l == null) {
                this.f54549b = null;
                return this;
            }
            this.f54549b = Long.valueOf(clock.getCurrentTimeMillis() + TimeUnit.SECONDS.toMillis(l.longValue()));
            return this;
        }

        public a b(Long l) {
            this.f54549b = l;
            return this;
        }

        public a d(String str) {
            this.e = zre.a(str, "id token must not be empty if defined");
            return this;
        }

        public a a(String str) {
            this.f54550c = zre.a(str, "refresh token must not be empty if defined");
            return this;
        }

        public a e(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f = null;
                return this;
            }
            d(str.split(" +"));
            return this;
        }

        public a d(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            a(Arrays.asList(strArr));
            return this;
        }

        public a a(Iterable<String> iterable) {
            this.f = zqq.a(iterable);
            return this;
        }

        public a e(Map<String, String> map) {
            this.d = zqs.d(map, zrl.g);
            return this;
        }

        public zrl d() {
            return new zrl(this.j, this.i, this.f54548a, this.f54549b, this.e, this.f54550c, this.f, this.d);
        }
    }

    zrl(zrj zrjVar, String str, String str2, Long l, String str3, String str4, String str5, Map<String, String> map) {
        this.i = zrjVar;
        this.f = str;
        this.e = str2;
        this.f54546b = l;
        this.d = str3;
        this.f54547c = str4;
        this.j = str5;
        this.f54545a = map;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.e(jSONObject, "request", this.i.e());
        JsonUtil.a(jSONObject, "token_type", this.f);
        JsonUtil.a(jSONObject, Constants.PARAM_ACCESS_TOKEN, this.e);
        JsonUtil.d(jSONObject, "expires_at", this.f54546b);
        JsonUtil.a(jSONObject, "id_token", this.d);
        JsonUtil.a(jSONObject, "refresh_token", this.f54547c);
        JsonUtil.a(jSONObject, "scope", this.j);
        JsonUtil.e(jSONObject, "additionalParameters", JsonUtil.a(this.f54545a));
        return jSONObject;
    }

    public static zrl d(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("request")) {
            throw new IllegalArgumentException("token request not provided and not found in JSON");
        }
        return new zrl(zrj.b(jSONObject.getJSONObject("request")), JsonUtil.c(jSONObject, "token_type"), JsonUtil.c(jSONObject, Constants.PARAM_ACCESS_TOKEN), JsonUtil.b(jSONObject, "expires_at"), JsonUtil.c(jSONObject, "id_token"), JsonUtil.c(jSONObject, "refresh_token"), JsonUtil.c(jSONObject, "scope"), JsonUtil.h(jSONObject, "additionalParameters"));
    }
}
