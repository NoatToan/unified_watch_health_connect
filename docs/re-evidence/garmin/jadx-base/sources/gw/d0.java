package gw;

import android.net.Uri;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.google.common.net.HttpHeaders;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import o53.s0;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.Request;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public class d0 extends com.garmin.android.library.backgroundtaskmanagement.b<String> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Call f79492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f79493m;

    public class a extends com.garmin.android.library.backgroundtaskmanagement.d {
        public a(com.garmin.android.library.backgroundtaskmanagement.b bVar) {
            super(bVar);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.f
        public final void a() {
            String strEncode;
            d0 d0Var = d0.this;
            String str = null;
            try {
                strEncode = URLEncoder.encode(d0Var.f79493m, "UTF-8");
            } catch (UnsupportedEncodingException e4) {
                i2.i("SSOServiceLoginOp", e4.toString());
                c(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                strEncode = null;
            }
            d0Var.getClass();
            StringBuilder sb3 = new StringBuilder("https://");
            GCMSettingManager.k().getClass();
            String strO = am.j.o(GCMSettingManager.k().f77335a.f204880a, "/", sb3);
            Uri.Builder builderAppendQueryParameter = Uri.parse(strO).buildUpon().appendPath("sso").appendPath("requestToken").appendQueryParameter("appid", "GarminConnectMobileAndroid").appendQueryParameter("version", "4").appendQueryParameter("service", d0Var.f79493m);
            try {
                x53.c cVar = s0.f129406a;
                str = (String) ge1.b.W(u53.o.f168762a, new gq1.a((byte) 0, 22));
            } catch (InterruptedException unused) {
                i2.i("SSOServiceLoginOp", "Error get mfa token interrupted: ${e.getMessage()}");
            }
            try {
                if (!TextUtils.isEmpty(str)) {
                    i2.d("SSOServiceLoginOp", "Appending Mfa token");
                    builderAppendQueryParameter.appendQueryParameter("mfaToken", str);
                }
            } catch (Exception unused2) {
                i2.i("SSOServiceLoginOp", "Error appending mfa token");
            }
            FormBody.Builder builder = new FormBody.Builder();
            f12.l.f68084a.getClass();
            Request requestBuild = new Request.Builder().header(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded").url(builderAppendQueryParameter.toString()).post(builder.add("customerGUID", f12.l.a.a().Q2()).add("connectAccessToken", ((f12.b) KoinJavaComponent.get(f12.b.class)).d().f158514a).build()).build();
            e0 e0Var = new e0(d0Var, this, strO, strEncode);
            bz0.o.f22274a.getClass();
            Call callNewCall = bz0.o.j().newCall(requestBuild);
            d0Var.f79492l = callNewCall;
            callNewCall.enqueue(e0Var);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.d
        public final void b() {
            Call call = d0.this.f79492l;
            if (call != null) {
                call.cancel();
            }
        }
    }

    public d0(String str, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        this.f79493m = str;
        f12.l.f68084a.getClass();
        if (TextUtils.isEmpty(f12.l.a.a().Q2())) {
            b(new cw.w(this));
        }
        b(new a(this));
    }
}
