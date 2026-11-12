package defpackage;

import android.net.Uri;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.openid.appauth.AuthorizationServiceConfiguration;
import net.openid.appauth.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class zrf {
    private static final Set<String> o = zqs.b("redirect_uris", "response_types", "grant_types", "application_type", "subject_type", "jwks_uri", "jwks", "token_endpoint_auth_method");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f54532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f54533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54534c = Constants.NATIVE_CACHE;
    public final AuthorizationServiceConfiguration d;
    public final Map<String, String> e;
    public final String f;
    public final Uri g;
    public final String h;
    public final List<Uri> i;
    public final List<String> j;

    private zrf(AuthorizationServiceConfiguration authorizationServiceConfiguration, List<Uri> list, List<String> list2, List<String> list3, String str, Uri uri, JSONObject jSONObject, String str2, Map<String, String> map) {
        this.d = authorizationServiceConfiguration;
        this.i = list;
        this.j = list2;
        this.f54533b = list3;
        this.f = str;
        this.g = uri;
        this.f54532a = jSONObject;
        this.h = str2;
        this.e = map;
    }

    public JSONObject e() {
        JSONObject jSONObjectD = d();
        JsonUtil.e(jSONObjectD, "configuration", this.d.c());
        JsonUtil.e(jSONObjectD, "additionalParameters", JsonUtil.a(this.e));
        return jSONObjectD;
    }

    private JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.d(jSONObject, "redirect_uris", JsonUtil.a(this.i));
        JsonUtil.e(jSONObject, "application_type", this.f54534c);
        List<String> list = this.j;
        if (list != null) {
            JsonUtil.d(jSONObject, "response_types", JsonUtil.a(list));
        }
        List<String> list2 = this.f54533b;
        if (list2 != null) {
            JsonUtil.d(jSONObject, "grant_types", JsonUtil.a(list2));
        }
        JsonUtil.a(jSONObject, "subject_type", this.f);
        JsonUtil.e(jSONObject, "jwks_uri", this.g);
        JsonUtil.c(jSONObject, "jwks", this.f54532a);
        JsonUtil.a(jSONObject, "token_endpoint_auth_method", this.h);
        return jSONObject;
    }

    public static zrf a(JSONObject jSONObject) throws JSONException {
        zre.c(jSONObject, "json must not be null");
        return new zrf(AuthorizationServiceConfiguration.e(jSONObject.getJSONObject("configuration")), JsonUtil.j(jSONObject, "redirect_uris"), JsonUtil.g(jSONObject, "response_types"), JsonUtil.g(jSONObject, "grant_types"), JsonUtil.c(jSONObject, "subject_type"), JsonUtil.f(jSONObject, "jwks_uri"), JsonUtil.a(jSONObject, "jwks"), JsonUtil.c(jSONObject, "token_endpoint_auth_method"), JsonUtil.h(jSONObject, "additionalParameters"));
    }
}
