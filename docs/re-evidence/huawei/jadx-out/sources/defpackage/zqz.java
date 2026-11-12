package defpackage;

import android.content.Intent;
import android.net.Uri;
import net.openid.appauth.AuthorizationManagementResponse;
import net.openid.appauth.JsonUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class zqz extends AuthorizationManagementResponse {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zra f54518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54519c;

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f54520c;
        private zra e;

        public b(zra zraVar) {
            c(zraVar);
        }

        b d(Uri uri) {
            d(uri.getQueryParameter("state"));
            return this;
        }

        public b c(zra zraVar) {
            this.e = (zra) zre.c(zraVar, "request cannot be null");
            return this;
        }

        public b d(String str) {
            this.f54520c = zre.a(str, "state must not be empty");
            return this;
        }

        public zqz b() {
            return new zqz(this.e, this.f54520c);
        }
    }

    private zqz(zra zraVar, String str) {
        this.f54518b = zraVar;
        this.f54519c = str;
    }

    @Override // net.openid.appauth.AuthorizationManagementResponse
    public String getState() {
        return this.f54519c;
    }

    @Override // net.openid.appauth.AuthorizationManagementResponse
    public JSONObject jsonSerialize() {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.e(jSONObject, "request", this.f54518b.jsonSerialize());
        JsonUtil.a(jSONObject, "state", this.f54519c);
        return jSONObject;
    }

    @Override // net.openid.appauth.AuthorizationManagementResponse
    public Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.EndSessionResponse", jsonSerializeString());
        return intent;
    }
}
