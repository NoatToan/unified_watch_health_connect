package net.openid.appauth;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.VastAttribute;
import defpackage.zqr;
import defpackage.zqw;
import defpackage.zrd;
import defpackage.zre;
import defpackage.zrg;
import defpackage.zri;
import defpackage.zrj;
import defpackage.zrk;
import defpackage.zrl;
import defpackage.zrn;
import defpackage.zrp;
import defpackage.zrq;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Map;
import net.openid.appauth.browser.CustomTabManager;
import net.openid.appauth.connectivity.ConnectionBuilder;
import net.openid.appauth.internal.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class AuthorizationService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CustomTabManager f43034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zqr f43035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f43036c;
    Context d;
    private final zrn e;

    /* JADX INFO: loaded from: classes46.dex */
    public interface RegistrationResponseCallback {
        void onRegistrationRequestCompleted(zrg zrgVar, zqw zqwVar);
    }

    public interface TokenResponseCallback {
        void onTokenRequestCompleted(zrl zrlVar, zqw zqwVar);
    }

    public AuthorizationService(Context context) {
        this(context, zqr.d);
    }

    public AuthorizationService(Context context, zqr zqrVar) {
        this(context, zqrVar, zrp.c(context, zqrVar.a()), new CustomTabManager(context));
    }

    AuthorizationService(Context context, zqr zqrVar, zrn zrnVar, CustomTabManager customTabManager) {
        this.f43036c = false;
        this.d = (Context) zre.c(context);
        this.f43035b = zqrVar;
        this.f43034a = customTabManager;
        this.e = zrnVar;
    }

    public void a(zrj zrjVar, ClientAuthentication clientAuthentication, TokenResponseCallback tokenResponseCallback) {
        a();
        Logger.d("Initiating code exchange request to %s", zrjVar.f54541c.f43042c);
        new c(zrjVar, clientAuthentication, this.f43035b.e(), zri.f54538b, tokenResponseCallback, Boolean.valueOf(this.f43035b.d())).execute(new Void[0]);
    }

    public void d() {
        if (this.f43036c) {
            return;
        }
        this.f43034a.c();
        this.f43036c = true;
    }

    private void a() {
        if (this.f43036c) {
            throw new IllegalStateException("Service has been disposed and rendered inoperable");
        }
    }

    static class c extends AsyncTask<Void, Void, JSONObject> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TokenResponseCallback f43037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ClientAuthentication f43038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private zqw f43039c;
        private Clock d;
        private final ConnectionBuilder e;
        private zrj f;
        private boolean h;

        c(zrj zrjVar, ClientAuthentication clientAuthentication, ConnectionBuilder connectionBuilder, Clock clock, TokenResponseCallback tokenResponseCallback, Boolean bool) {
            this.f = zrjVar;
            this.f43038b = clientAuthentication;
            this.e = connectionBuilder;
            this.d = clock;
            this.f43037a = tokenResponseCallback;
            this.h = bool.booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Not initialized variable reg: 2, insn: 0x00ae: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:21:0x00ae */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public JSONObject doInBackground(Void... voidArr) throws Throwable {
            JSONException e;
            InputStream errorStream;
            IOException e2;
            InputStream inputStream;
            InputStream inputStream2 = null;
            try {
                try {
                    HttpURLConnection httpURLConnectionOpenConnection = this.e.openConnection(this.f.f54541c.f43042c);
                    httpURLConnectionOpenConnection.setRequestMethod("POST");
                    httpURLConnectionOpenConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                    a(httpURLConnectionOpenConnection);
                    httpURLConnectionOpenConnection.setDoOutput(true);
                    Map<String, String> requestHeaders = this.f43038b.getRequestHeaders(this.f.e);
                    if (requestHeaders != null) {
                        for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                            httpURLConnectionOpenConnection.setRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    Map<String, String> mapD = this.f.d();
                    Map<String, String> requestParameters = this.f43038b.getRequestParameters(this.f.e);
                    if (requestParameters != null) {
                        mapD.putAll(requestParameters);
                    }
                    String strC = zrq.c(mapD);
                    httpURLConnectionOpenConnection.setRequestProperty("Content-Length", String.valueOf(strC.length()));
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnectionOpenConnection.getOutputStream());
                    outputStreamWriter.write(strC);
                    outputStreamWriter.flush();
                    if (httpURLConnectionOpenConnection.getResponseCode() >= 200 && httpURLConnectionOpenConnection.getResponseCode() < 300) {
                        errorStream = httpURLConnectionOpenConnection.getInputStream();
                    } else {
                        errorStream = httpURLConnectionOpenConnection.getErrorStream();
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(zrk.e(errorStream));
                        zrk.c(errorStream);
                        return jSONObject;
                    } catch (IOException e3) {
                        e2 = e3;
                        Logger.a(e2, "Failed to complete exchange request", new Object[0]);
                        this.f43039c = zqw.e(zqw.b.g, e2);
                        zrk.c(errorStream);
                        return null;
                    } catch (JSONException e4) {
                        e = e4;
                        Logger.a(e, "Failed to complete exchange request", new Object[0]);
                        this.f43039c = zqw.e(zqw.b.f54512a, e);
                        zrk.c(errorStream);
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    zrk.c(inputStream2);
                    throw th;
                }
            } catch (IOException e5) {
                e2 = e5;
                errorStream = null;
            } catch (JSONException e6) {
                e = e6;
                errorStream = null;
            } catch (Throwable th2) {
                th = th2;
                zrk.c(inputStream2);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(JSONObject jSONObject) {
            zqw zqwVarE;
            zqw zqwVar = this.f43039c;
            if (zqwVar != null) {
                this.f43037a.onTokenRequestCompleted(null, zqwVar);
                return;
            }
            if (jSONObject.has(VastAttribute.ERROR)) {
                try {
                    String string = jSONObject.getString(VastAttribute.ERROR);
                    zqwVarE = zqw.c(zqw.d.a(string), string, jSONObject.optString("error_description", null), zrq.a(jSONObject.optString("error_uri")));
                } catch (JSONException e) {
                    zqwVarE = zqw.e(zqw.b.f54512a, e);
                }
                this.f43037a.onTokenRequestCompleted(null, zqwVarE);
                return;
            }
            try {
                zrl zrlVarD = new zrl.a(this.f).e(jSONObject).d();
                if (zrlVarD.d != null) {
                    try {
                        try {
                            zrd.c(zrlVarD.d).b(this.f, this.d, this.h);
                        } catch (zqw e2) {
                            this.f43037a.onTokenRequestCompleted(null, e2);
                            return;
                        }
                    } catch (JSONException | zrd.c e3) {
                        this.f43037a.onTokenRequestCompleted(null, zqw.e(zqw.b.f54513b, e3));
                        return;
                    }
                }
                Logger.d("Token exchange with %s completed", this.f.f54541c.f43042c);
                this.f43037a.onTokenRequestCompleted(zrlVarD, null);
            } catch (JSONException e4) {
                this.f43037a.onTokenRequestCompleted(null, zqw.e(zqw.b.f54512a, e4));
            }
        }

        private void a(URLConnection uRLConnection) {
            if (TextUtils.isEmpty(uRLConnection.getRequestProperty("Accept"))) {
                uRLConnection.setRequestProperty("Accept", "application/json");
            }
        }
    }
}
