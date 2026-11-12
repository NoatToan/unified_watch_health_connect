package com.huawei.multisimsdk.odsa.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.multisimsdk.multidevicemanager.R;
import com.huawei.multisimsdk.odsa.presenter.ILoginPresenter;
import com.huawei.operation.utils.Constants;
import defpackage.ocq;
import defpackage.odc;
import defpackage.odu;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes12.dex */
public class LoginWebActivity extends Activity implements ILoginView, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f18060a = new Handler(Looper.getMainLooper()) { // from class: com.huawei.multisimsdk.odsa.view.LoginWebActivity.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                ocq.e("LoginWebActivity", "EVENT_DISPOSE_WEBVIEW");
                LoginWebActivity.this.a();
            } else {
                super.handleMessage(message);
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f18061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18062c;
    private Context d;
    private int e;
    private ProgressBar f;
    private ILoginPresenter h;
    private int i;
    private WebView j;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        ocq.e("LoginWebActivity", "onCreate start");
        requestWindowFeature(1);
        super.onCreate(bundle);
        setContentView(R.layout.sign_web);
        Intent intent = getIntent();
        if (intent != null) {
            this.i = intent.getIntExtra("slotId", -1);
        }
        this.d = getApplicationContext();
        this.h = new odu(this, this.i);
        this.j = (WebView) findViewById(R.id.sign_webView);
        this.f = (ProgressBar) findViewById(R.id.progress_bar);
        e();
        c();
        this.h.startLogin();
    }

    private void e() {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        this.e = new BigDecimal(point.y).divide(new BigDecimal("3"), 0, 4).intValue();
        View viewFindViewById = findViewById(R.id.sign_webView);
        this.f18061b = viewFindViewById;
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int height = this.f18061b.getRootView().getHeight() - this.f18061b.getHeight();
        ocq.e("LoginWebActivity", "mPreHeight:" + this.f18062c + " heightDiff:" + height);
        if (this.f18062c == height) {
            return;
        }
        this.f18062c = height;
        if (height > this.e) {
            ocq.e("LoginWebActivity", "hide activity");
            getWindow().addFlags(8192);
        } else {
            ocq.e("LoginWebActivity", "show activity");
            getWindow().clearFlags(8192);
        }
    }

    @Override // com.huawei.multisimsdk.odsa.view.ILoginView
    public Context getAppContext() {
        return this.d;
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.h.onStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.h.onStop();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ocq.e("LoginWebActivity", "destroy web view");
        a();
        this.h.onDestroy();
    }

    @Override // com.huawei.multisimsdk.odsa.view.ILoginView
    public void finishView() {
        finish();
    }

    @Override // com.huawei.multisimsdk.odsa.view.ILoginView
    public void startAuthActivity(Intent intent, int i) {
        startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        ocq.e("LoginWebActivity", "onActivityResult->requestCode: " + i + " resultCode: " + i2);
        StringBuilder sb = new StringBuilder("onActivityResult->data: ");
        sb.append(intent == null ? Constants.NULL : intent.getExtras());
        ocq.b("LoginWebActivity", sb.toString());
        if (i == 1) {
            this.h.processAuthResult(i, i2, intent);
        } else {
            ocq.h("LoginWebActivity", "unknown request code!");
        }
    }

    @Override // com.huawei.multisimsdk.odsa.view.ILoginView
    public void loadUrl(final String str) {
        ocq.b("LoginWebActivity", "loadUrl:" + str);
        if (this.j != null) {
            ocq.b("LoginWebActivity", "loadUrl: begin " + str);
            this.j.post(new Runnable() { // from class: com.huawei.multisimsdk.odsa.view.LoginWebActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    LoginWebActivity.this.j.loadUrl(str);
                }
            });
        }
    }

    private void c() {
        this.j.getSettings().setSupportZoom(true);
        this.j.getSettings().setUseWideViewPort(true);
        this.j.getSettings().setAllowFileAccessFromFileURLs(false);
        this.j.getSettings().setJavaScriptEnabled(true);
        this.j.getSettings().setDomStorageEnabled(true);
        this.j.getSettings().setGeolocationEnabled(false);
        this.j.getSettings().setAllowContentAccess(true);
        this.j.getSettings().setLoadsImagesAutomatically(true);
        this.j.getSettings().setAllowFileAccess(false);
        this.j.getSettings().setPluginState(WebSettings.PluginState.ON);
        this.j.addJavascriptInterface(new d(), "HTMLOUT");
        WebView.setWebContentsDebuggingEnabled(false);
        this.j.setWebViewClient(new a());
        this.j.setWebChromeClient(new WebChromeClient() { // from class: com.huawei.multisimsdk.odsa.view.LoginWebActivity.3
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                ocq.a("LoginWebActivity", "onProgressChanged newProgress = " + i);
                if (i > 80) {
                    LoginWebActivity.this.e(false);
                }
                super.onProgressChanged(webView, i);
                webView.requestFocus();
            }
        });
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        WebView webView = this.j;
        if (webView != null && i == 4) {
            if (webView.canGoBack()) {
                this.j.goBack();
                return true;
            }
            ocq.e("LoginWebActivity", "user click back");
            if (odc.e() != null) {
                odc.e().e(1056);
            }
            finish();
            overridePendingTransition(R.anim.push_left_in, R.anim.push_right_out);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        if (z) {
            this.j.setVisibility(8);
            this.f.setVisibility(0);
        } else {
            this.j.setVisibility(0);
            this.f.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        WebView webView = this.j;
        if (webView != null) {
            webView.clearHistory();
            this.j.clearCache(true);
            this.j.removeAllViews();
            this.j.destroy();
            this.j = null;
        }
    }

    class d {
        d() {
        }

        @JavascriptInterface
        public void processHtml(String str) {
            ocq.b("LoginWebActivity", "processHtml " + str);
            String tokenValue = LoginWebActivity.this.h.getTokenValue(str);
            ocq.b("LoginWebActivity", "processHtml token " + tokenValue);
            if (TextUtils.isEmpty(tokenValue)) {
                return;
            }
            LoginWebActivity.this.h.processAuthResultFromWebView(tokenValue);
            LoginWebActivity.this.f18060a.sendEmptyMessage(1);
            ocq.e("LoginWebActivity", "processHtml end ");
        }
    }

    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ocq.b("LoginWebActivity", "onPageStarted url = " + str);
            super.onPageStarted(webView, str, bitmap);
            LoginWebActivity.this.e(true);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            ocq.b("LoginWebActivity", "onPageFinished url = " + str);
            super.onPageFinished(webView, str);
            webView.loadUrl("javascript:window.HTMLOUT.processHtml(document.body.innerHTML);");
            if (str.contains("state=") && str.contains("code=")) {
                LoginWebActivity.this.h.setUrlWithAuthorizationCodeFromWebView(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            ocq.a("LoginWebActivity", "onReceivedError error =" + webResourceError.getErrorCode() + ", des = " + ((Object) webResourceError.getDescription()));
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webView == null) {
                return;
            }
            webView.stopLoading();
            webView.removeAllViews();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            ocq.a("LoginWebActivity", "onReceivedSslError error =" + sslError.toString());
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            ocq.a("LoginWebActivity", "shouldOverrideUrlLoading request = " + webResourceRequest);
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
