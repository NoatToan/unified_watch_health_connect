package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.Set;
import net.openid.appauth.AuthorizationManagementRequest;
import net.openid.appauth.AuthorizationServiceConfiguration;
import net.openid.appauth.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class zra implements AuthorizationManagementRequest {
    private static final Set<String> g = zqs.b("id_token_hint", "post_logout_redirect_uri", "state", "ui_locales");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f54524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AuthorizationServiceConfiguration f54526c;
    public final String d;
    public final Map<String, String> e;
    public final String h;

    private zra(AuthorizationServiceConfiguration authorizationServiceConfiguration, String str, Uri uri, String str2, String str3, Map<String, String> map) {
        this.f54526c = authorizationServiceConfiguration;
        this.f54525b = str;
        this.f54524a = uri;
        this.d = str2;
        this.h = str3;
        this.e = map;
    }

    @Override // net.openid.appauth.AuthorizationManagementRequest
    public String getState() {
        return this.d;
    }

    @Override // net.openid.appauth.AuthorizationManagementRequest
    public Uri toUri() {
        Uri.Builder builderBuildUpon = this.f54526c.d.buildUpon();
        zrq.c(builderBuildUpon, "id_token_hint", this.f54525b);
        zrq.c(builderBuildUpon, "state", this.d);
        zrq.c(builderBuildUpon, "ui_locales", this.h);
        Uri uri = this.f54524a;
        if (uri != null) {
            builderBuildUpon.appendQueryParameter("post_logout_redirect_uri", uri.toString());
        }
        for (Map.Entry<String, String> entry : this.e.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build();
    }

    @Override // net.openid.appauth.AuthorizationManagementRequest
    public JSONObject jsonSerialize() {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.e(jSONObject, "configuration", this.f54526c.c());
        JsonUtil.a(jSONObject, "id_token_hint", this.f54525b);
        JsonUtil.e(jSONObject, "post_logout_redirect_uri", this.f54524a);
        JsonUtil.a(jSONObject, "state", this.d);
        JsonUtil.a(jSONObject, "ui_locales", this.h);
        JsonUtil.e(jSONObject, "additionalParameters", JsonUtil.a(this.e));
        return jSONObject;
    }

    @Override // net.openid.appauth.AuthorizationManagementRequest
    public String jsonSerializeString() {
        return jsonSerialize().toString();
    }

    public static zra e(JSONObject jSONObject) throws JSONException {
        zre.c(jSONObject, "json cannot be null");
        return new zra(AuthorizationServiceConfiguration.e(jSONObject.getJSONObject("configuration")), JsonUtil.c(jSONObject, "id_token_hint"), JsonUtil.f(jSONObject, "post_logout_redirect_uri"), JsonUtil.c(jSONObject, "state"), JsonUtil.c(jSONObject, "ui_locales"), JsonUtil.h(jSONObject, "additionalParameters"));
    }
}
