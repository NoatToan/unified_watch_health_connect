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
import android.webkit.PermissionRequest;
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
import com.huawei.multisimsdk.odsa.presenter.IThirdPartyLoginPresenter;
import defpackage.obm;
import defpackage.ocq;
import defpackage.odg;
import defpackage.oea;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes12.dex */
public class ThirdPartyLoginWebActivity extends Activity implements ILoginView, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f18066a = new Handler(Looper.getMainLooper()) { // from class: com.huawei.multisimsdk.odsa.view.ThirdPartyLoginWebActivity.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                ocq.e("ThirdPartyLoginWebActivity", "EVENT_DISPOSE_WEBVIEW");
                ThirdPartyLoginWebActivity.this.c();
            } else {
                super.handleMessage(message);
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f18067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18068c;
    private int d;
    private View e;
    private PermissionRequest f;
    private IThirdPartyLoginPresenter g;
    private int h;
    private WebView i;
    private ProgressBar j;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        ocq.e("ThirdPartyLoginWebActivity", "onCreate start");
        requestWindowFeature(1);
        super.onCreate(bundle);
        setContentView(R.layout.sign_web);
        this.f18067b = getApplicationContext();
        this.g = new oea(this);
        View viewFindViewById = findViewById(R.id.sign_webView);
        if (viewFindViewById instanceof WebView) {
            this.i = (WebView) viewFindViewById;
        } else {
            ocq.c("ThirdPartyLoginWebActivity", "ID sign_webView expected WebView but got " + viewFindViewById.getClass().getSimpleName());
        }
        View viewFindViewById2 = findViewById(R.id.progress_bar);
        if (viewFindViewById2 instanceof ProgressBar) {
            this.j = (ProgressBar) viewFindViewById2;
        } else {
            ocq.c("ThirdPartyLoginWebActivity", "ID progress_bar expected ProgressBar but got " + viewFindViewById.getClass().getSimpleName());
        }
        a();
        d();
        this.g.startLogin();
    }

    private void a() {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        this.d = new BigDecimal(point.y).divide(new BigDecimal("3"), 0, 4).intValue();
        View viewFindViewById = findViewById(R.id.sign_webView);
        this.e = viewFindViewById;
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int height = this.e.getRootView().getHeight() - this.e.getHeight();
        ocq.e("ThirdPartyLoginWebActivity", "mPreHeight:" + this.h + " heightDiff:" + height);
        if (this.h == height) {
            return;
        }
        this.h = height;
        if (height > this.d) {
            ocq.e("ThirdPartyLoginWebActivity", "hide activity");
            getWindow().addFlags(8192);
        } else {
            ocq.e("ThirdPartyLoginWebActivity", "show activity");
            getWindow().clearFlags(8192);
        }
    }

    @Override // com.huawei.multisimsdk.odsa.view.ILoginView
    public Context getAppContext() {
        return this.f18067b;
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.g.onStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.g.onStop();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ocq.e("ThirdPartyLoginWebActivity", "destroy web view");
        c();
        this.g.onDestroy();
    }

    @Override // com.huawei.multisimsdk.odsa.view.ILoginView
    public void finishView() {
        finish();
    }

    @Override // com.huawei.multisimsdk.odsa.view.ILoginView
    public void startAuthActivity(Intent intent, int i) {
        startActivityForResult(intent, i);
    }

    @Override // com.huawei.multisimsdk.odsa.view.ILoginView
    public void loadUrl(final String str) {
        ocq.b("ThirdPartyLoginWebActivity", "loadUrl:" + str);
        if (this.i != null) {
            ocq.b("ThirdPartyLoginWebActivity", "loadUrl: begin " + str);
            this.i.post(new Runnable() { // from class: com.huawei.multisimsdk.odsa.view.ThirdPartyLoginWebActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    ThirdPartyLoginWebActivity.this.i.loadUrl(str);
                }
            });
        }
    }

    private void d() {
        this.i.getSettings().setSupportZoom(true);
        this.i.getSettings().setUseWideViewPort(true);
        this.i.getSettings().setAllowFileAccessFromFileURLs(false);
        this.i.getSettings().setJavaScriptEnabled(true);
        this.i.getSettings().setDomStorageEnabled(true);
        this.i.getSettings().setGeolocationEnabled(false);
        this.i.getSettings().setAllowContentAccess(true);
        this.i.getSettings().setLoadsImagesAutomatically(true);
        this.i.getSettings().setAllowFileAccess(false);
        this.i.getSettings().setPluginState(WebSettings.PluginState.ON);
        this.i.addJavascriptInterface(new c(), "HTMLOUT");
        WebView.setWebContentsDebuggingEnabled(false);
        this.i.setWebViewClient(new e());
        this.i.setWebChromeClient(new WebChromeClient() { // from class: com.huawei.multisimsdk.odsa.view.ThirdPartyLoginWebActivity.3
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                ocq.a("ThirdPartyLoginWebActivity", "onProgressChanged newProgress = " + i);
                if (i > 80 && !ThirdPartyLoginWebActivity.this.f18068c) {
                    ThirdPartyLoginWebActivity.this.b(false);
                }
                super.onProgressChanged(webView, i);
                webView.requestFocus();
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequest(PermissionRequest permissionRequest) {
                ThirdPartyLoginWebActivity.this.c(permissionRequest);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(PermissionRequest permissionRequest) {
        ocq.e("ThirdPartyLoginWebActivity", "onPermissionsRequest enter");
        for (String str : permissionRequest.getResources()) {
            ocq.e("ThirdPartyLoginWebActivity", "onPermissionsRequest permission = " + str);
            if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                if (!obm.c("android.permission.CAMERA", this)) {
                    ocq.e("ThirdPartyLoginWebActivity", "requestPermission permission for camera");
                    obm.a(this, new String[]{"android.permission.CAMERA"}, 1);
                    this.f = permissionRequest;
                    return;
                } else {
                    ocq.e("ThirdPartyLoginWebActivity", "already have permission");
                    permissionRequest.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
                    return;
                }
            }
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ocq.e("ThirdPartyLoginWebActivity", "onRequestPermissionsResult enter");
        if (i != 1) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            PermissionRequest permissionRequest = this.f;
            if (permissionRequest != null) {
                permissionRequest.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
            }
        } else {
            PermissionRequest permissionRequest2 = this.f;
            if (permissionRequest2 != null) {
                permissionRequest2.deny();
            }
        }
        this.f = null;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        WebView webView = this.i;
        if (webView != null && i == 4) {
            if (webView.canGoBack()) {
                this.i.goBack();
                return true;
            }
            ocq.e("ThirdPartyLoginWebActivity", "user click back");
            if (odg.a() != null) {
                odg.a().b(1100);
            }
            finish();
            overridePendingTransition(R.anim.push_left_in, R.anim.push_right_out);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        if (z) {
            this.i.setVisibility(8);
            this.j.setVisibility(0);
        } else {
            this.i.setVisibility(0);
            this.j.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        WebView webView = this.i;
        if (webView != null) {
            webView.clearHistory();
            this.i.clearCache(true);
            this.i.removeAllViews();
            this.i.destroy();
            this.i = null;
        }
    }

    class c {
        c() {
        }

        @JavascriptInterface
        public void processHtml(String str) {
            ocq.b("ThirdPartyLoginWebActivity", "processHtml " + str);
            ThirdPartyLoginWebActivity.this.g.getWsTokenAndNonce(str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ThirdPartyLoginWebActivity.this.f18066a.sendEmptyMessage(1);
            ocq.e("ThirdPartyLoginWebActivity", "processHtml end ");
        }
    }

    class e extends WebViewClient {
        e() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ocq.b("ThirdPartyLoginWebActivity", "onPageStarted url = " + str);
            super.onPageStarted(webView, str, bitmap);
            ThirdPartyLoginWebActivity.this.b(true);
            if (str.contains("state=") && str.contains("code=")) {
                ThirdPartyLoginWebActivity.this.f18068c = true;
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            ocq.b("ThirdPartyLoginWebActivity", "onPageFinished url = " + str);
            super.onPageFinished(webView, str);
            if (str.contains("state=") && str.contains("code=")) {
                webView.loadUrl("javascript:window.HTMLOUT.processHtml(document.body.innerHTML);");
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            ocq.a("ThirdPartyLoginWebActivity", "onReceivedError error =" + webResourceError.getErrorCode() + ", des = " + ((Object) webResourceError.getDescription()));
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webView == null) {
                return;
            }
            webView.stopLoading();
            webView.removeAllViews();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            ocq.a("ThirdPartyLoginWebActivity", "onReceivedSslError error =" + sslError.toString());
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            ocq.a("ThirdPartyLoginWebActivity", "shouldOverrideUrlLoading request = " + webResourceRequest);
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
