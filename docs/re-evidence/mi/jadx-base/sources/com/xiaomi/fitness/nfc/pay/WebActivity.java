package com.xiaomi.fitness.nfc.pay;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mipay.sdk.Mipay;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.nfc.pay.WebActivity;
import com.xiaomi.fitness.webview.WebViewUtil;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;
import com.xiaomi.passport.servicetoken.ServiceTokenResult;
import defpackage.bg4;
import defpackage.j5h;
import defpackage.jz6;
import defpackage.mri;
import defpackage.o0j;
import defpackage.o4h;
import defpackage.ofl;
import defpackage.pf4;
import defpackage.qdq;
import defpackage.sui;
import defpackage.ua1;
import defpackage.v4h;
import defpackage.vqg;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class WebActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Intent f12522b;
    public LinearLayout c;
    public WebView d;
    public ProgressBar e;
    public TextView f;
    public jz6 i;
    public int h = 0;
    public int j = 20;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12523k = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f12521a = d.LOAD_ING;
    public final AccountManagerCallback<Bundle> g = new a();

    public class a implements AccountManagerCallback<Bundle> {
        public a() {
        }

        @Override // android.accounts.AccountManagerCallback
        public void run(AccountManagerFuture<Bundle> accountManagerFuture) {
            try {
                String string = accountManagerFuture.getResult().getString("authtoken");
                if (TextUtils.isEmpty(string)) {
                    WebActivity.this.s();
                    WebActivity.this.f12521a = d.LOAD_FINISHED;
                } else {
                    WebActivity.this.d.loadUrl(string);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class b extends WebViewClient {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                WebActivity.this.s();
            }
        }

        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (WebActivity.this.f12521a == d.LOGIN_FINISHING) {
                WebActivity.this.f12521a = d.LOGIN_FINISHED;
                WebActivity.this.f12523k = true;
                WebActivity.this.d.postDelayed(new a(), 500L);
                return;
            }
            if (WebActivity.this.f12521a == d.LOAD_ING) {
                WebActivity.this.s();
                WebActivity.this.f12521a = d.LOAD_FINISHED;
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (WebActivity.this.f12521a == d.LOAD_ING) {
                WebActivity.this.B();
            } else if (WebActivity.this.f12521a == d.LOGIN_ING) {
                WebActivity.this.f12521a = d.LOGIN_FINISHING;
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            if (TextUtils.equals(str, "com.xiaomi")) {
                String str4 = "weblogin:" + str3;
                if (XiaomiAccountManager.get(WebActivity.this).getXiaomiAccount() == null || WebActivity.this.h >= WebActivity.this.j || WebActivity.this.f12523k) {
                    return;
                }
                WebActivity.this.f12521a = d.LOGIN_ING;
                WebActivity webActivity = WebActivity.this;
                webActivity.q(webActivity, str4);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!TextUtils.isEmpty(str) && (str.contains("www.huami.com") || str.contains("card/pay_result"))) {
                try {
                    String host = Uri.parse(str).getHost();
                    vqg.d("shouldOverrideUrlLoading host:" + host);
                    if (!"www.huami.com".equals(host)) {
                        if ("card".equals(host)) {
                        }
                    }
                    WebActivity.this.finish();
                    return true;
                } catch (Exception e) {
                    vqg.c("WebActivity shouldOverrideUrlLoading", e);
                }
            }
            if (!qdq.b(str)) {
                return false;
            }
            Context context = webView.getContext();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addCategory("android.intent.category.BROWSABLE");
            ResolveInfo resolveInfoA = qdq.a(context, intent);
            if (resolveInfoA == null || resolveInfoA.activityInfo == null) {
                return false;
            }
            context.startActivity(intent);
            return true;
        }
    }

    public class c extends WebChromeClient {

        public class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ JsResult f12528a;

            public a(JsResult jsResult) {
                this.f12528a = jsResult;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.f12528a.confirm();
            }
        }

        public class b implements DialogInterface.OnCancelListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ JsResult f12530a;

            public b(JsResult jsResult) {
                this.f12530a = jsResult;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                this.f12530a.cancel();
            }
        }

        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            AlertDialog.Builder builder = new AlertDialog.Builder(WebActivity.this, 3);
            builder.setMessage(str2);
            builder.setPositiveButton(o0j.l2, new a(jsResult));
            builder.setOnCancelListener(new b(jsResult));
            builder.show();
            return true;
        }
    }

    public enum d {
        LOAD_ING,
        LOGIN_ING,
        LOGIN_FINISHING,
        LOGIN_FINISHED,
        LOAD_FINISHED
    }

    public class e {
        public e() {
        }

        @JavascriptInterface
        public void finish() {
            WebActivity.this.finish();
        }

        @JavascriptInterface
        public void notify(String str) {
            WebActivity.this.z(str);
            WebActivity.this.finish();
        }

        @JavascriptInterface
        public void setResult(String str) {
            WebActivity.this.z(str);
        }
    }

    public static /* synthetic */ void w(Throwable th) throws Exception {
        Logger.i("|WEBVIEW|" + th.getMessage(), new Object[0]);
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    public final void A() {
        this.d.getSettings().setMixedContentMode(1);
        this.d.getSettings().setJavaScriptEnabled(true);
        this.d.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.d.addJavascriptInterface(new e(), "UCashier");
        p("XiaoMi/MiuiBrowser/4.3");
        p("UCashierSdk/1.0");
        this.d.setWebViewClient(new b());
        this.d.setWebChromeClient(new c());
    }

    public final void B() {
        this.c.setVisibility(0);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f12522b != null) {
            finish();
        } else if (this.d.canGoBack()) {
            this.d.goBack();
        } else {
            setResult(0, y(2, "user canceled", null));
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t();
        A();
        String stringExtra = getIntent().getStringExtra(pf4.f30343b);
        if (!TextUtils.isEmpty(stringExtra)) {
            this.d.loadUrl(stringExtra);
        } else {
            setResult(0, y(1, "url is empty", null));
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WebViewUtil.releaseDisposable(this.i);
        this.d.removeAllViews();
        this.d.destroy();
    }

    public final void p(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String userAgentString = this.d.getSettings().getUserAgentString();
        this.d.getSettings().setUserAgentString(userAgentString.trim() + " " + str.trim());
    }

    public final void q(final Context context, final String str) {
        WebViewUtil.releaseDisposable(this.i);
        this.i = o4h.f(new j5h() { // from class: ebr
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) throws Exception {
                this.f16473a.u(context, str, v4hVar);
            }
        }).S(ofl.c()).H(ua1.c()).O(new bg4() { // from class: fbr
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                this.f17636a.v((String) obj);
            }
        }, new bg4() { // from class: gbr
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                WebActivity.w((Throwable) obj);
            }
        });
    }

    public final Bundle r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Integer) {
                    bundle.putString(next, obj.toString());
                } else if (obj instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    bundle.putString(next, (String) obj);
                }
            }
            return bundle;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void s() {
        this.c.setVisibility(8);
    }

    public final void t() {
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        FrameLayout frameLayout = new FrameLayout(this);
        LinearLayout linearLayout = new LinearLayout(this);
        View viewInflate = getLayoutInflater().inflate(sui.Q0, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(mri.v);
        TextView textView = (TextView) viewInflate.findViewById(mri.S4);
        String stringExtra = getIntent().getStringExtra(pf4.c);
        if (!TextUtils.isEmpty(stringExtra)) {
            textView.setText(stringExtra);
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: dbr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15351a.x(view);
            }
        });
        linearLayout.setOrientation(1);
        this.d = new WebView(this);
        linearLayout.addView(viewInflate, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(this.d, new LinearLayout.LayoutParams(-1, -1));
        frameLayout.addView(linearLayout, new LinearLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout2 = new LinearLayout(this);
        this.c = linearLayout2;
        linearLayout2.setBackgroundColor(pf4.f);
        this.c.setOrientation(1);
        this.c.setGravity(17);
        TextView textView2 = new TextView(this);
        this.f = textView2;
        textView2.setTextSize(pf4.d);
        this.f.setTextColor(pf4.e);
        this.f.setText(pf4.g(pf4.g));
        ProgressBar progressBar = new ProgressBar(this);
        this.e = progressBar;
        this.c.addView(progressBar, new LinearLayout.LayoutParams(-2, -2));
        this.c.addView(this.f, new LinearLayout.LayoutParams(-2, -2));
        frameLayout.addView(this.c, new FrameLayout.LayoutParams(-1, -1));
        setContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
    }

    public final /* synthetic */ void u(Context context, String str, v4h v4hVar) throws Exception {
        XiaomiAccountManager xiaomiAccountManager = XiaomiAccountManager.get(context);
        ServiceTokenResult serviceTokenResult = xiaomiAccountManager.getServiceToken(xiaomiAccountManager.getXiaomiAccount(), str, null).get();
        this.h++;
        Logger.d("WebActivity", "autoLogin current refresh token count is " + this.h + "serviceTokenResult is " + serviceTokenResult);
        if (serviceTokenResult == null) {
            if (v4hVar.isDisposed()) {
                return;
            }
            v4hVar.onError(new Exception(String.format("%s account service token result is null", "|WEBVIEW|")));
        } else if (serviceTokenResult.errorCode != ServiceTokenResult.ErrorCode.ERROR_NONE) {
            if (v4hVar.isDisposed()) {
                return;
            }
            v4hVar.onError(new Exception(String.format("%s service token result error code = %s error msg: %s", "|WEBVIEW|", serviceTokenResult.errorCode, serviceTokenResult.errorMessage)));
        } else {
            if (v4hVar.isDisposed()) {
                return;
            }
            if (serviceTokenResult.peeked) {
                serviceTokenResult = xiaomiAccountManager.refreshServiceToken(xiaomiAccountManager.getXiaomiAccount(), str, serviceTokenResult, null).get();
            }
            v4hVar.onNext(serviceTokenResult.serviceToken);
            v4hVar.onComplete();
        }
    }

    public final /* synthetic */ void v(String str) throws Exception {
        if (this.d != null) {
            Logger.d("WebActivity", "autoLogin serviceToken is " + str);
            if (!TextUtils.isEmpty(str)) {
                this.d.loadUrl(str);
            } else {
                s();
                this.f12521a = d.LOAD_FINISHED;
            }
        }
    }

    public final /* synthetic */ void x(View view) {
        if (this.d.canGoBack()) {
            this.d.goBack();
        } else {
            finish();
        }
    }

    public final Intent y(int i, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("code", i);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("message", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                intent.putExtra("result", r(new JSONObject(str2)));
            } catch (JSONException unused) {
                intent.putExtra("result", str2);
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("message", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("result", str2);
            }
        } catch (JSONException unused2) {
        }
        intent.putExtra(Mipay.KEY_FULL_RESULT, jSONObject.toString());
        return intent;
    }

    public final void z(String str) {
        String strOptString;
        String strOptString2 = "user canceled";
        int i = 2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.getInt("code");
            strOptString2 = jSONObject.optString("message");
            strOptString = jSONObject.optString("result");
        } catch (JSONException unused) {
            strOptString = null;
        }
        Intent intentY = y(i, strOptString2, strOptString);
        this.f12522b = intentY;
        if (i == 0) {
            setResult(-1, intentY);
        } else {
            setResult(0, intentY);
        }
    }
}
