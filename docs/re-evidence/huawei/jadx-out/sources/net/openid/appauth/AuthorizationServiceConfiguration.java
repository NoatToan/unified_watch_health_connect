package net.openid.appauth;

import android.net.Uri;
import android.os.AsyncTask;
import defpackage.zqv;
import defpackage.zqw;
import defpackage.zre;
import defpackage.zrk;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import net.openid.appauth.connectivity.ConnectionBuilder;
import net.openid.appauth.internal.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class AuthorizationServiceConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f43040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zqv f43041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f43042c;
    public final Uri d;
    public final Uri e;

    public interface RetrieveConfigurationCallback {
        void onFetchConfigurationCompleted(AuthorizationServiceConfiguration authorizationServiceConfiguration, zqw zqwVar);
    }

    public AuthorizationServiceConfiguration(Uri uri, Uri uri2) {
        this(uri, uri2, null);
    }

    public AuthorizationServiceConfiguration(Uri uri, Uri uri2, Uri uri3) {
        this(uri, uri2, uri3, null);
    }

    public AuthorizationServiceConfiguration(Uri uri, Uri uri2, Uri uri3, Uri uri4) {
        this.f43040a = (Uri) zre.c(uri);
        this.f43042c = (Uri) zre.c(uri2);
        this.e = uri3;
        this.d = uri4;
        this.f43041b = null;
    }

    public AuthorizationServiceConfiguration(zqv zqvVar) {
        zre.c(zqvVar, "docJson cannot be null");
        this.f43041b = zqvVar;
        this.f43040a = zqvVar.b();
        this.f43042c = zqvVar.e();
        this.e = zqvVar.a();
        this.d = zqvVar.d();
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.e(jSONObject, "authorizationEndpoint", this.f43040a.toString());
        JsonUtil.e(jSONObject, "tokenEndpoint", this.f43042c.toString());
        Uri uri = this.e;
        if (uri != null) {
            JsonUtil.e(jSONObject, "registrationEndpoint", uri.toString());
        }
        Uri uri2 = this.d;
        if (uri2 != null) {
            JsonUtil.e(jSONObject, "endSessionEndpoint", uri2.toString());
        }
        zqv zqvVar = this.f43041b;
        if (zqvVar != null) {
            JsonUtil.e(jSONObject, "discoveryDoc", zqvVar.an);
        }
        return jSONObject;
    }

    public String a() {
        return c().toString();
    }

    public static AuthorizationServiceConfiguration e(JSONObject jSONObject) throws JSONException {
        zre.c(jSONObject, "json object cannot be null");
        if (jSONObject.has("discoveryDoc")) {
            try {
                return new AuthorizationServiceConfiguration(new zqv(jSONObject.optJSONObject("discoveryDoc")));
            } catch (zqv.d e) {
                throw new JSONException("Missing required field in discovery doc: " + e.b());
            }
        }
        zre.e(jSONObject.has("authorizationEndpoint"), "missing authorizationEndpoint");
        zre.e(jSONObject.has("tokenEndpoint"), "missing tokenEndpoint");
        return new AuthorizationServiceConfiguration(JsonUtil.i(jSONObject, "authorizationEndpoint"), JsonUtil.i(jSONObject, "tokenEndpoint"), JsonUtil.f(jSONObject, "registrationEndpoint"), JsonUtil.f(jSONObject, "endSessionEndpoint"));
    }

    public static void c(Uri uri, RetrieveConfigurationCallback retrieveConfigurationCallback, ConnectionBuilder connectionBuilder) {
        zre.c(uri, "openIDConnectDiscoveryUri cannot be null");
        zre.c(retrieveConfigurationCallback, "callback cannot be null");
        zre.c(connectionBuilder, "connectionBuilder must not be null");
        new a(uri, connectionBuilder, retrieveConfigurationCallback).execute(new Void[0]);
    }

    static class a extends AsyncTask<Void, Void, AuthorizationServiceConfiguration> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RetrieveConfigurationCallback f43043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Uri f43044c;
        private zqw d = null;
        private ConnectionBuilder e;

        a(Uri uri, ConnectionBuilder connectionBuilder, RetrieveConfigurationCallback retrieveConfigurationCallback) {
            this.f43044c = uri;
            this.e = connectionBuilder;
            this.f43043b = retrieveConfigurationCallback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Not initialized variable reg: 1, insn: 0x0076: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:27:0x0076 */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public AuthorizationServiceConfiguration doInBackground(Void... voidArr) throws Throwable {
            zqv.d e;
            InputStream inputStream;
            JSONException e2;
            IOException e3;
            InputStream inputStream2;
            InputStream inputStream3 = null;
            try {
                try {
                    HttpURLConnection httpURLConnectionOpenConnection = this.e.openConnection(this.f43044c);
                    httpURLConnectionOpenConnection.setRequestMethod("GET");
                    httpURLConnectionOpenConnection.setDoInput(true);
                    httpURLConnectionOpenConnection.connect();
                    inputStream = httpURLConnectionOpenConnection.getInputStream();
                    try {
                        AuthorizationServiceConfiguration authorizationServiceConfiguration = new AuthorizationServiceConfiguration(new zqv(new JSONObject(zrk.e(inputStream))));
                        zrk.c(inputStream);
                        return authorizationServiceConfiguration;
                    } catch (IOException e4) {
                        e3 = e4;
                        Logger.e(e3, "Network error when retrieving discovery document", new Object[0]);
                        this.d = zqw.e(zqw.b.g, e3);
                        zrk.c(inputStream);
                        return null;
                    } catch (JSONException e5) {
                        e2 = e5;
                        Logger.e(e2, "Error parsing discovery document", new Object[0]);
                        this.d = zqw.e(zqw.b.f54512a, e2);
                        zrk.c(inputStream);
                        return null;
                    } catch (zqv.d e6) {
                        e = e6;
                        Logger.e(e, "Malformed discovery document", new Object[0]);
                        this.d = zqw.e(zqw.b.e, e);
                        zrk.c(inputStream);
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream3 = inputStream2;
                    zrk.c(inputStream3);
                    throw th;
                }
            } catch (IOException e7) {
                e3 = e7;
                inputStream = null;
            } catch (JSONException e8) {
                e2 = e8;
                inputStream = null;
            } catch (zqv.d e9) {
                e = e9;
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
                zrk.c(inputStream3);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(AuthorizationServiceConfiguration authorizationServiceConfiguration) {
            zqw zqwVar = this.d;
            if (zqwVar != null) {
                this.f43043b.onFetchConfigurationCompleted(null, zqwVar);
            } else {
                this.f43043b.onFetchConfigurationCompleted(authorizationServiceConfiguration, null);
            }
        }
    }
}
