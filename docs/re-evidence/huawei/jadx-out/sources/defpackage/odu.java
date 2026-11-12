package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Html;
import android.text.TextUtils;
import com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler;
import com.huawei.multisimsdk.odsa.presenter.ILoginPresenter;
import com.huawei.multisimsdk.odsa.response.OdsaResponseParam;
import com.huawei.multisimsdk.odsa.utils.OdsaHttpConnectionUtils;
import com.huawei.multisimsdk.odsa.view.ILoginView;
import com.tencent.connect.common.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import net.openid.appauth.AuthState;
import net.openid.appauth.AuthorizationService;
import net.openid.appauth.AuthorizationServiceConfiguration;
import net.openid.appauth.ClientAuthentication;
import net.openid.appauth.browser.BrowserMatcher;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes12.dex */
public class odu implements ILoginPresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44210a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AuthorizationService f44212c;
    private final ocp d;
    private zqt f;
    private final ode g;
    private final ocy h;
    private String k;
    private final Context l;
    private String n;
    private ExecutorService o;
    private int p;
    private String q;
    private String r;
    private final WeakReference<ILoginView> v;
    private zrj w;
    private String x;
    private String y;
    private final AtomicReference<String> i = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<zqu> f44211b = new AtomicReference<>();
    private final AtomicReference<JSONObject> u = new AtomicReference<>();
    private final BrowserMatcher j = zrm.d;
    private CountDownLatch e = new CountDownLatch(1);
    private final Handler m = new Handler(Looper.getMainLooper()) { // from class: odu.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                ocq.e("LoginPresenter", "EVENT_INIT_AUTH_REQUEST");
                odu.this.h();
                odu.this.l();
            } else {
                if (i != 2) {
                    return;
                }
                ocq.e("LoginPresenter", "EVENT_FETCH_USER_INFO");
                odu.this.d();
            }
        }
    };
    private final ResponseHandler t = new ResponseHandler() { // from class: odu.1
        @Override // com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler
        public void onCallback(String str) {
            ocq.b("LoginPresenter", "mResponseHandler onCallback result=" + str);
        }

        @Override // com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler
        public void onCallback(int i, String str) {
            int i2;
            ocq.b("LoginPresenter", "mResponseHandler onCallback type=" + i + ", result=" + str);
            if (oco.c(str) && (i2 = Integer.parseInt(str)) != 302) {
                odu.this.e(i2);
                return;
            }
            if (i != 4) {
                return;
            }
            Map<String, String> mapB = OdsaHttpConnectionUtils.b(str);
            for (Map.Entry<String, String> entry : mapB.entrySet()) {
                ocq.b("LoginPresenter", "mResponseHandler, map[" + entry.getKey() + "]=" + entry.getValue());
            }
            odu.this.g.a(mapB);
            odu.this.r = mapB.get("service_id");
            odu.this.x = mapB.get("state");
            odu.this.n = mapB.get(Constants.NONCE);
            odu.this.f44210a = mapB.get("acr_values");
            odu.this.q = mapB.get("prompt");
            if (odu.this.g.i()) {
                odu.this.o();
            } else {
                odu.this.e(1054);
            }
        }
    };
    private ResponseHandler s = new ResponseHandler() { // from class: odu.3
        @Override // com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler
        public void onCallback(String str) {
            try {
                ocq.b("LoginPresenter", "mResponseHandlerWithAuthCode onCallback result=" + str);
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                if (xmlPullParserNewPullParser != null) {
                    xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(str.getBytes("UTF-8")), "UTF-8");
                }
                OdsaResponseParam odsaResponseParamA = odm.a(xmlPullParserNewPullParser);
                if (odsaResponseParamA == null) {
                    odu.this.e(1061);
                    return;
                }
                String token = odsaResponseParamA.getToken();
                ocq.b("LoginPresenter", "mResponseHandlerWithAuthCode onCallback odsaResponseParam=" + odsaResponseParamA.toString());
                ocq.b("LoginPresenter", "mResponseHandlerWithAuthCode onCallback token=" + token);
                if (TextUtils.isEmpty(token)) {
                    odu.this.e(1061);
                } else {
                    odu.this.b(new zrl.a(odu.this.w).c(token).d(), (zqw) null);
                }
            } catch (UnsupportedEncodingException e) {
                ocq.a("LoginPresenter", "mResponseHandlerWithAuthCode occur an UnsupportedEncodingException ", e);
            } catch (IOException e2) {
                e = e2;
                ocq.a("LoginPresenter", "mResponseHandlerWithAuthCode occur an IOException error", e);
                odu.this.e(1061);
            } catch (XmlPullParserException e3) {
                e = e3;
                ocq.a("LoginPresenter", "mResponseHandlerWithAuthCode occur an IOException error", e);
                odu.this.e(1061);
            } catch (Exception e4) {
                ocq.a("LoginPresenter", "mResponseHandlerWithAuthCode occur an Exception ", e4);
            }
        }
    };

    public odu(ILoginView iLoginView, int i) {
        ocq.e("LoginPresenter", "constructor slotId= " + i);
        WeakReference<ILoginView> weakReference = new WeakReference<>(iLoginView);
        this.v = weakReference;
        Context appContext = weakReference.get().getAppContext();
        this.l = appContext;
        this.h = ocy.c(appContext);
        this.g = ode.e(appContext, i);
        this.o = Executors.newSingleThreadExecutor();
        this.d = ocp.d();
        this.p = i;
    }

    @Override // com.huawei.multisimsdk.odsa.presenter.ILoginPresenter
    public void startLogin() {
        ocq.b("LoginPresenter", "startLogin 1: " + this.h.d().j());
        ocq.b("LoginPresenter", "startLogin 2: " + this.g.h());
        String strC = oco.c("ODSA_ESURL", "");
        this.k = strC;
        if (TextUtils.isEmpty(strC)) {
            e(1053);
        } else if (odc.e() == null) {
            e(1052);
        } else {
            ocq.b("LoginPresenter", "Step1. startLogin, try to get params from es server.");
            this.d.b(odc.e().b(), odc.e().c(), null, this.t, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (!this.g.i()) {
            ocq.e("LoginPresenter", "configuration is invalid, response fail");
            e(1052);
            return;
        }
        g();
        if (!this.o.isShutdown()) {
            this.o.submit(new Runnable() { // from class: odr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44208a.f();
                }
            });
        } else {
            e(1056);
        }
    }

    @Override // com.huawei.multisimsdk.odsa.presenter.ILoginPresenter
    public void onStart() {
        if (this.o.isShutdown()) {
            this.o = Executors.newSingleThreadExecutor();
        }
    }

    @Override // com.huawei.multisimsdk.odsa.presenter.ILoginPresenter
    public void onStop() {
        this.o.shutdownNow();
    }

    @Override // com.huawei.multisimsdk.odsa.presenter.ILoginPresenter
    public void onDestroy() {
        AuthorizationService authorizationService = this.f44212c;
        if (authorizationService != null) {
            authorizationService.d();
        }
        ExecutorService executorService = this.o;
        if (executorService != null) {
            executorService.shutdownNow();
        }
        WeakReference<ILoginView> weakReference = this.v;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    private void n() {
        ocq.e("LoginPresenter", "responseSuccess");
        if (odc.e() != null) {
            odc.e().e(1000);
        }
        if (i()) {
            this.v.get().finishView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        ocq.e("LoginPresenter", "responseFailWithReason: reason = " + i);
        if (odc.e() != null) {
            odc.e().e(i);
        }
        if (i()) {
            this.v.get().finishView();
        }
    }

    private void g() {
        if (this.g.h()) {
            ocq.e("LoginPresenter", "Configuration change detected, discarding old state");
            this.h.e(new AuthState());
            this.g.a();
        }
    }

    private boolean i() {
        WeakReference<ILoginView> weakReference = this.v;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ocq.e("LoginPresenter", "Step2. initAppAuthService");
        k();
        if (this.h.d().e() != null) {
            ocq.e("LoginPresenter", "auth config already got");
            j();
        } else {
            if (this.g.d() == null) {
                ocq.e("LoginPresenter", "Creating auth config");
                this.h.e(new AuthState(new AuthorizationServiceConfiguration(this.g.c(), this.g.c())));
                j();
                return;
            }
            ocq.e("LoginPresenter", "Retrieving OpenID discovery doc");
            AuthorizationServiceConfiguration.c(this.g.d(), new AuthorizationServiceConfiguration.RetrieveConfigurationCallback() { // from class: ods
                @Override // net.openid.appauth.AuthorizationServiceConfiguration.RetrieveConfigurationCallback
                public final void onFetchConfigurationCompleted(AuthorizationServiceConfiguration authorizationServiceConfiguration, zqw zqwVar) {
                    this.f44209b.c(authorizationServiceConfiguration, zqwVar);
                }
            }, this.g.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(AuthorizationServiceConfiguration authorizationServiceConfiguration, zqw zqwVar) {
        if (authorizationServiceConfiguration == null) {
            ocq.a("LoginPresenter", "handleRetrieveConfigurationCallback: Failed to retrieve discovery document", zqwVar);
            e(1055);
            return;
        }
        ocq.e("LoginPresenter", "handleRetrieveConfigurationCallback: Discovery document retrieved");
        this.h.e(new AuthState(authorizationServiceConfiguration));
        if (this.o.isShutdown()) {
            ocq.h("LoginPresenter", "handleRetrieveConfigurationCallback: excutor service shut down!");
        } else {
            this.o.submit(new Runnable() { // from class: odt
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.j();
                }
            });
        }
    }

    private void k() {
        ocq.e("LoginPresenter", "refreshAppAuthService start.");
        if (this.f44212c != null) {
            ocq.e("LoginPresenter", "refreshAppAuthService mAuthService dispose");
            this.f44212c.d();
        }
        this.f44212c = b();
        this.f44211b.set(null);
    }

    private AuthorizationService b() {
        ocq.e("LoginPresenter", "Creating authorization service");
        zqr.a aVar = new zqr.a();
        aVar.c(this.j);
        aVar.b(zrr.f54554a);
        return new AuthorizationService(this.l, aVar.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ocq.e("LoginPresenter", "initClient");
        if (this.g.e() != null) {
            ocq.b("LoginPresenter", "initClient, Using static client ID: " + this.g.e());
            this.i.set(this.g.e());
            Handler handler = this.m;
            handler.sendMessage(handler.obtainMessage(1));
            return;
        }
        ocq.h("LoginPresenter", "initClient, It will not happen!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        ocq.e("LoginPresenter", "initAuthRequest");
        e();
    }

    private void e() {
        zqu.b bVarD = new zqu.b(this.h.d().e(), this.i.get(), "code", this.g.g()).f(this.g.f()).d((String) null).d(a());
        if (!TextUtils.isEmpty(this.x)) {
            bVarD = bVarD.g(this.x);
        }
        if (!TextUtils.isEmpty(this.q)) {
            bVarD = bVarD.a(this.q);
        }
        String strC = oco.c();
        if (oco.b("OIDC_SUPPORT_SPECIFY_LANGUAGE", (Boolean) false).booleanValue() && !TextUtils.isEmpty(strC)) {
            bVarD = bVarD.i(strC);
        }
        this.f44211b.set(bVarD.a());
    }

    private Map<String, String> a() {
        HashMap map = new HashMap(2);
        if (!TextUtils.isEmpty(this.r)) {
            map.put("service_id", this.r);
        }
        if (!TextUtils.isEmpty(this.n)) {
            map.put(Constants.NONCE, this.n);
        }
        if (!TextUtils.isEmpty(this.f44210a)) {
            map.put("acr_values", this.f44210a);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        ocq.e("LoginPresenter", "Step3. startAuth.");
        if (!this.o.isShutdown()) {
            this.o.submit(new Runnable() { // from class: odz
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c();
                }
            });
        } else {
            e(1056);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        ocq.e("LoginPresenter", "doAuth");
        if (i()) {
            this.v.get().loadUrl(this.f44211b.get().toUri().toString());
        }
    }

    @Override // com.huawei.multisimsdk.odsa.presenter.ILoginPresenter
    public void setUrlWithAuthorizationCodeFromWebView(String str) {
        this.y = str;
    }

    @Override // com.huawei.multisimsdk.odsa.presenter.ILoginPresenter
    public String getTokenValue(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.indexOf("&lt;") >= 0) {
            str = Html.fromHtml(str).toString();
        }
        int iIndexOf = str.indexOf("<wap-provisioningdoc");
        int iIndexOf2 = str.indexOf("</wap-provisioningdoc>");
        ocq.b("LoginPresenter", "getTokenValue firstIndex = " + iIndexOf);
        ocq.b("LoginPresenter", "getTokenValue secondIndex = " + iIndexOf2);
        if (iIndexOf >= 0 && iIndexOf2 >= 0 && (i = iIndexOf2 + 22) <= str.length() && i >= iIndexOf) {
            String strSubstring = str.substring(iIndexOf, i);
            ocq.b("LoginPresenter", "getTokenValue content = " + strSubstring);
            try {
                ocq.b("LoginPresenter", "getTokenValue onCallback result=" + strSubstring);
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                if (xmlPullParserNewPullParser != null) {
                    xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(strSubstring.getBytes("UTF-8")), "UTF-8");
                }
                OdsaResponseParam odsaResponseParamA = odm.a(xmlPullParserNewPullParser);
                String token = odsaResponseParamA.getToken();
                ocq.b("LoginPresenter", "getTokenValue onCallback odsaResponseParam=" + odsaResponseParamA.toString());
                ocq.b("LoginPresenter", "getTokenValue onCallback token=" + token);
                if (TextUtils.isEmpty(token)) {
                    return null;
                }
                return token;
            } catch (UnsupportedEncodingException e) {
                ocq.a("LoginPresenter", "getTokenValue occur an UnsupportedEncodingException ", e);
            } catch (IOException e2) {
                e = e2;
                ocq.a("LoginPresenter", "getTokenValue occur an IOException ", e);
                return null;
            } catch (XmlPullParserException e3) {
                e = e3;
                ocq.a("LoginPresenter", "getTokenValue occur an IOException ", e);
                return null;
            } catch (Exception e4) {
                ocq.a("LoginPresenter", "getTokenValue occur an Exception ", e4);
            }
        }
        return null;
    }

    @Override // com.huawei.multisimsdk.odsa.presenter.ILoginPresenter
    public void processAuthResultFromWebView(String str) {
        zqt.a aVarD;
        ocq.b("LoginPresenter", "processAuthResultFromWebView, token = " + str);
        if (str == null) {
            e(1056);
            return;
        }
        ocq.b("LoginPresenter", "processAuthResultFromWebView, 1 = " + str);
        zqt.a aVar = new zqt.a(this.f44211b.get());
        String str2 = this.y;
        if (str2 != null) {
            aVarD = aVar.d(Uri.parse(str2));
        } else {
            aVarD = aVar.d(this.f44211b.get().toUri());
        }
        ocq.b("LoginPresenter", "processAuthResultFromWebView, 2 = " + str);
        aVarD.a(str);
        this.f = aVarD.c();
        ocq.b("LoginPresenter", "mAuthorizationResponse: " + this.f.jsonSerializeString());
        ocq.b("LoginPresenter", "processAuthResultFromWebView, 3, mAuthorizationResponse = " + this.f);
        this.w = this.f.a();
        ocq.b("LoginPresenter", "processAuthResultFromWebView, 4, mTokenRequest = " + this.w);
        if (!TextUtils.isEmpty(str)) {
            zrl zrlVarD = new zrl.a(this.w).c(str).d();
            ocq.b("LoginPresenter", "processAuthResultFromWebView, 5, response = " + zrlVarD);
            b(zrlVarD, (zqw) null);
            return;
        }
        ocq.b("LoginPresenter", "processAuthResultFromWebView, 6, fail");
        e(1061);
    }

    @Override // com.huawei.multisimsdk.odsa.presenter.ILoginPresenter
    public void processAuthResult(int i, int i2, Intent intent) {
        if (i == 0) {
            e(1056);
            return;
        }
        if (intent == null) {
            e(1057);
            return;
        }
        zqt zqtVarD = zqt.d(intent);
        this.f = zqtVarD;
        zqw zqwVarE = zqw.e(intent);
        if (zqtVarD != null || zqwVarE != null) {
            this.h.d(zqtVarD, zqwVarE);
        }
        if (zqtVarD != null && zqtVarD.f54492b != null) {
            ocq.b("LoginPresenter", "debug response.authorizationCode is " + zqtVarD.f54492b);
            ocq.b("LoginPresenter", "debug response.authorizationCode is " + zqtVarD.jsonSerializeString());
            b(zqtVarD);
            return;
        }
        if (zqwVarE != null) {
            ocq.h("LoginPresenter", "Authorization flow failed: " + zqwVarE.getMessage());
        }
        e(1058);
    }

    private void b(zqt zqtVar) {
        ocq.e("LoginPresenter", "Exchanging authorization code.");
        this.w = zqtVar.a();
        ocq.b("LoginPresenter", "Exchanging tokenRequest 1 " + this.w.f54541c.f43042c);
        ocq.b("LoginPresenter", "Exchanging tokenRequest 2 " + this.w.f54541c.a());
        ocq.b("LoginPresenter", "Exchanging tokenRequest 3 " + this.w.a());
        a(this.w, new AuthorizationService.TokenResponseCallback() { // from class: ody
            @Override // net.openid.appauth.AuthorizationService.TokenResponseCallback
            public final void onTokenRequestCompleted(zrl zrlVar, zqw zqwVar) {
                this.f44219b.b(zrlVar, zqwVar);
            }
        });
    }

    private void a(zrj zrjVar, AuthorizationService.TokenResponseCallback tokenResponseCallback) {
        try {
            ClientAuthentication clientAuthenticationB = this.h.d().b();
            StringBuilder sb = new StringBuilder("mAuthService ");
            sb.append(this.f44212c == null);
            sb.append(" callback ");
            sb.append(tokenResponseCallback == null);
            sb.append(" client ");
            sb.append(clientAuthenticationB == null);
            ocq.e("LoginPresenter", sb.toString());
            k();
            this.f44212c.a(zrjVar, clientAuthenticationB, tokenResponseCallback);
        } catch (ClientAuthentication.c e) {
            ocq.c("LoginPresenter", "Token request cannot be made, client authentication for the token endpoint could not be constructed (%s)", e.toString());
            e(1059);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(zrl zrlVar, zqw zqwVar) {
        ocq.b("LoginPresenter", "before token is " + this.h.d().a());
        this.h.e(zrlVar, zqwVar);
        ocq.b("LoginPresenter", "after token is " + this.h.d().a());
        if (!this.h.d().j()) {
            StringBuilder sb = new StringBuilder("Authorization Code exchange failed");
            sb.append(zqwVar != null ? zqwVar.f54508c : "");
            ocq.h("LoginPresenter", "handleCodeExchangeResponse displayNotAuthorized: " + sb.toString() + " authException: " + zqwVar);
            m();
            return;
        }
        ocq.e("LoginPresenter", "handleCodeExchangeResponse displayAuthorized.");
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(2));
    }

    private void m() {
        if (TextUtils.isEmpty(this.k) || this.f == null) {
            e(1060);
            return;
        }
        HashMap map = new HashMap(2);
        map.put("state", this.f.f);
        map.put("code", this.f.f54492b);
        this.d.b(odc.e().b(), odc.e().c(), map, this.s, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        ocq.e("LoginPresenter", "fetchUserInfo start.");
        this.h.d().e(this.f44212c, new AuthState.AuthStateAction() { // from class: odv
            @Override // net.openid.appauth.AuthState.AuthStateAction
            public final void execute(String str, String str2, zqw zqwVar) {
                this.f44215c.e(str, str2, zqwVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, String str2, zqw zqwVar) {
        ocq.b("LoginPresenter", "fetchUserInfo accessToken:" + str + ", idToken:" + str2 + ", ex:" + zqwVar);
        if (zqwVar != null) {
            ocq.h("LoginPresenter", "Token fresh failed");
            this.u.set(null);
            e(1061);
            return;
        }
        n();
    }
}
