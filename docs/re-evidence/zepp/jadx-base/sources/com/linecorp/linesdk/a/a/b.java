package com.linecorp.linesdk.a.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.linecorp.linesdk.BuildConfig;
import com.linecorp.linesdk.a.e;
import com.linecorp.linesdk.a.f;
import com.linecorp.linesdk.a.g;
import com.twitter.sdk.android.core.internal.oauth.OAuthConstants;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class b {
    public static final com.linecorp.linesdk.a.a.a.c<f> a;
    public static final com.linecorp.linesdk.a.a.a.c<e> b;
    public static final com.linecorp.linesdk.a.a.a.c<com.linecorp.linesdk.a.b> c;
    public static final com.linecorp.linesdk.a.a.a.c<g> d;
    public static final com.linecorp.linesdk.a.a.a.c<?> e = new com.linecorp.linesdk.a.a.c();

    @NonNull
    public final Uri f;

    @NonNull
    public final com.linecorp.linesdk.a.a.a.a g;

    public static class a extends com.linecorp.linesdk.a.a.a<e> {
        private a() {
        }

        @Override // com.linecorp.linesdk.a.a.a
        @NonNull
        public final /* synthetic */ e b(@NonNull JSONObject jSONObject) throws JSONException {
            String string = jSONObject.getString("token_type");
            if (OAuthConstants.AUTHORIZATION_BEARER.equals(string)) {
                String strOptString = jSONObject.optString("scope");
                return new e(new com.linecorp.linesdk.a.d(jSONObject.getString("access_token"), jSONObject.getLong("expires_in") * 1000, System.currentTimeMillis(), jSONObject.getString("refresh_token")), TextUtils.isEmpty(strOptString) ? Collections.emptyList() : Arrays.asList(strOptString.split(" ")));
            }
            throw new JSONException("Illegal token type. token_type=" + string);
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.linecorp.linesdk.a.a.b$b, reason: collision with other inner class name */
    public static class C0728b extends com.linecorp.linesdk.a.a.a<f> {
        private C0728b() {
        }

        @Override // com.linecorp.linesdk.a.a.a
        @NonNull
        public final /* synthetic */ f b(@NonNull JSONObject jSONObject) {
            return new f(jSONObject.getString("otpId"), jSONObject.getString(DTransferConstants.OTP));
        }

        public /* synthetic */ C0728b(byte b) {
            this();
        }
    }

    public static class c extends com.linecorp.linesdk.a.a.a<g> {
        private c() {
        }

        @Override // com.linecorp.linesdk.a.a.a
        @NonNull
        public final /* synthetic */ g b(@NonNull JSONObject jSONObject) throws JSONException {
            String string = jSONObject.getString("token_type");
            if (OAuthConstants.AUTHORIZATION_BEARER.equals(string)) {
                return new g(jSONObject.getString("access_token"), jSONObject.getLong("expires_in") * 1000, jSONObject.optString("refresh_token"));
            }
            throw new JSONException("Illegal token type. token_type=" + string);
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    public static class d extends com.linecorp.linesdk.a.a.a<com.linecorp.linesdk.a.b> {
        private d() {
        }

        @Override // com.linecorp.linesdk.a.a.a
        @NonNull
        public final /* synthetic */ com.linecorp.linesdk.a.b b(@NonNull JSONObject jSONObject) {
            String strOptString = jSONObject.optString("scope");
            return new com.linecorp.linesdk.a.b(jSONObject.getString("client_id"), jSONObject.getLong("expires_in") * 1000, TextUtils.isEmpty(strOptString) ? Collections.emptyList() : Arrays.asList(strOptString.split(" ")));
        }

        public /* synthetic */ d(byte b) {
            this();
        }
    }

    static {
        byte b2 = 0;
        a = new C0728b(b2);
        b = new a(b2);
        c = new d(b2);
        d = new c(b2);
    }

    public b(@NonNull Context context, @NonNull Uri uri) {
        this(uri, new com.linecorp.linesdk.a.a.a.a(context, BuildConfig.VERSION_NAME));
    }

    @VisibleForTesting
    private b(@NonNull Uri uri, @NonNull com.linecorp.linesdk.a.a.a.a aVar) {
        this.f = uri;
        this.g = aVar;
    }
}
