package com.huawei.health.h5pro.webkit;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.vengine.H5ProAppLoadListener;
import com.huawei.health.h5pro.vengine.H5ProAppLoader;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.health.h5pro.vengine.H5ProPackageManager;
import com.huawei.health.h5pro.vengine.H5ResultCallback;
import com.huawei.health.h5pro.vengine.load.H5ProInstanceStatus;
import com.huawei.health.h5pro.vengine.load.H5ProInstanceStatusListener;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseDialog;
import defpackage.exq;
import defpackage.exy;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public class WebKitInstance extends H5ProInstance {
    private H5ProPackageManager d;
    private H5ProAppLoadListener e;
    private H5ProWebChromeClient f;
    private WebView i;
    private exq j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7043b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7042a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7044c = false;

    public WebKitInstance(Context context, H5ProAppLoadListener h5ProAppLoadListener) {
        long time = new Date().getTime();
        this.i = new WebView(context);
        LogUtil.i("H5PRO_WebKitInstance", "createView duration: " + (new Date().getTime() - time));
        this.e = h5ProAppLoadListener;
        this.d = new QuickPackageManager(context);
        H5ProWebChromeClient h5ProWebChromeClient = new H5ProWebChromeClient(context, this, this.e);
        this.f = h5ProWebChromeClient;
        this.i.setWebChromeClient(h5ProWebChromeClient);
        exq exqVar = new exq(this, this.e);
        this.j = exqVar;
        this.i.setWebViewClient(exqVar);
        WebKitUtil.c(context, this.i);
        WebKitUtil.c(this.i);
        WebView.setWebContentsDebuggingEnabled(!WebKitUtil.b());
    }

    public WebKitInstance(WebView webView, H5ProAppLoadListener h5ProAppLoadListener) {
        this.i = webView;
        this.e = h5ProAppLoadListener;
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public H5ProAppLoader getAppLoader() {
        H5ProAppLoaderImp h5ProAppLoaderImpE = new H5ProAppLoaderImp().c(this.i).b(this.d).c(this).e(this.e);
        exq exqVar = this.j;
        if (exqVar != null) {
            exqVar.c(h5ProAppLoaderImpE);
        }
        return h5ProAppLoaderImpE;
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public H5ProAppLoadListener getAppLoadListener() {
        return this.e;
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public boolean canGoBack() {
        WebView webView = this.i;
        if (webView == null) {
            return false;
        }
        return webView.canGoBack();
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public void goBack(H5ResultCallback h5ResultCallback) {
        if (this.i != null) {
            exy.a();
            WebView webView = this.i;
            webView.evaluateJavascript("if (typeof(window.onGoBack) === 'function') {window.onGoBack();}", new e(webView, h5ResultCallback));
        } else {
            LogUtil.w("H5PRO_WebKitInstance", "goBack: mWebView is null");
            if (h5ResultCallback != null) {
                h5ResultCallback.onResult(true);
            } else {
                LogUtil.w("H5PRO_WebKitInstance", "goBack: callback is null");
            }
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public void setBackGroundColor(int i) {
        WebView webView = this.i;
        if (webView != null) {
            webView.setBackgroundColor(i);
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public WebView getWebView() {
        return this.i;
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public String getUrl() {
        if (this.i == null) {
            LogUtil.w("H5PRO_WebKitInstance", "getUrl: webview is null");
            return "";
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return this.i.getUrl();
        }
        Handler handler = new Handler(Looper.getMainLooper());
        final String[] strArr = {null};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new Runnable() { // from class: com.huawei.health.h5pro.webkit.WebKitInstance.4
            @Override // java.lang.Runnable
            public void run() {
                synchronized (strArr) {
                    if (WebKitInstance.this.i != null) {
                        strArr[0] = WebKitInstance.this.i.getUrl();
                    } else {
                        LogUtil.w("H5PRO_WebKitInstance", "run: webview is null");
                        strArr[0] = "";
                    }
                    countDownLatch.countDown();
                }
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            LogUtil.e("H5PRO_WebKitInstance", "getUrl InterruptedException");
        }
        return strArr[0];
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public void registerJsModule(String str, Object obj) {
        WebView webView = this.i;
        if (webView != null) {
            webView.addJavascriptInterface(obj, str);
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public void onResume() {
        super.onResume();
        WebView webView = this.i;
        if (webView != null) {
            webView.onResume();
            this.i.resumeTimers();
            if (this.f7043b) {
                c(BaseDialog.LIFE_CYCLE_ON_RESUME);
            }
            interceptWebViewPause(false);
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public void onPause() {
        super.onPause();
        if (this.i != null) {
            if (this.f7044c) {
                c(BaseDialog.LIFE_CYCLE_ON_PAUSE);
            }
            if (isInterceptWebViewPause()) {
                LogUtil.e("H5PRO_WebKitInstance", "onPause: isInterceptWebViewPause -> true");
            } else {
                this.i.onPause();
            }
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public void destroy() {
        if (this.i != null && this.f7042a) {
            c("onDestroy");
        }
        super.destroy();
        if (Looper.getMainLooper() == Looper.myLooper()) {
            e();
        } else {
            this.i.post(new Runnable() { // from class: com.huawei.health.h5pro.webkit.WebKitInstance.3
                @Override // java.lang.Runnable
                public void run() {
                    WebKitInstance.this.e();
                }
            });
        }
        this.e = null;
        this.j = null;
        this.f = null;
    }

    public boolean isTitleValid(String str) {
        return (str == null || Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) ? false : true;
    }

    public static void setDarkMode(Context context, WebView webView, int i) {
        if (context == null || webView == null) {
            return;
        }
        WebKitUtil.b(context, webView, i);
    }

    public void setCustomViewListener(WebChromeCustomViewListener webChromeCustomViewListener) {
        H5ProWebChromeClient h5ProWebChromeClient = this.f;
        if (h5ProWebChromeClient != null) {
            h5ProWebChromeClient.setCustomViewListener(webChromeCustomViewListener);
        }
    }

    static class e implements ValueCallback<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected WeakReference<H5ResultCallback> f7046a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected WeakReference<WebView> f7047c;

        e(WebView webView, H5ResultCallback h5ResultCallback) {
            this.f7047c = new WeakReference<>(webView);
            this.f7046a = new WeakReference<>(h5ResultCallback);
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
            exy.d();
            LogUtil.i("H5PRO_WebKitInstance", "receive h5 result: " + str);
            if (TextUtils.equals("true", str)) {
                d(false);
                return;
            }
            WebView webView = (WebView) GeneralUtil.getReferent(this.f7047c);
            if (webView != null && webView.canGoBack()) {
                webView.goBack();
                d(false);
            } else {
                d(true);
            }
        }

        private void d(boolean z) {
            H5ResultCallback h5ResultCallback = (H5ResultCallback) GeneralUtil.getReferent(this.f7046a);
            if (h5ResultCallback != null) {
                h5ResultCallback.onResult(Boolean.valueOf(z));
            }
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public void onActivityResult(int i, int i2, Intent intent) {
        H5ProWebChromeClient h5ProWebChromeClient = this.f;
        if (h5ProWebChromeClient != null) {
            h5ProWebChromeClient.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        H5ProWebChromeClient h5ProWebChromeClient = this.f;
        if (h5ProWebChromeClient != null) {
            h5ProWebChromeClient.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    private void c(String str) {
        WebView webView = this.i;
        if (webView != null) {
            webView.evaluateJavascript(String.format("if (typeof(window.%sCallback) === 'function') {window.%sCallback();}", str, str), null);
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public void setIsEnableOnResumeCallback(boolean z) {
        this.f7043b = z;
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public void setIsEnableOnDestroyCallback(boolean z) {
        this.f7042a = z;
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public void setIsEnableOnPauseCallback(boolean z) {
        this.f7044c = z;
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public void onMultiWindowModeChange(int i) {
        WebView webView = this.i;
        if (webView != null) {
            webView.evaluateJavascript(String.format("if (typeof(window.onMultiWindowModeChange) === 'function'){window.onMultiWindowModeChange(%s);}", Integer.valueOf(i)), null);
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public void registerInstanceStatusListener(H5ProInstanceStatusListener h5ProInstanceStatusListener) {
        H5ProPackageManager h5ProPackageManager = this.d;
        if (h5ProPackageManager != null) {
            h5ProPackageManager.setInstanceStatusListener(h5ProInstanceStatusListener);
        }
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public void onStatusChanged(H5ProInstanceStatus h5ProInstanceStatus) {
        if (h5ProInstanceStatus == H5ProInstanceStatus.CONFIG_PREPARED) {
            c();
        }
    }

    private void c() {
        H5ProAppInfo appInfo;
        if (this.d == null || (appInfo = getAppInfo()) == null || TextUtils.isEmpty(appInfo.getPkgName())) {
            return;
        }
        setAppInfo(this.d.getAppInfo(appInfo.getPkgName()));
    }

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance
    public String readPreRequestsJson() {
        H5ProAppInfo appInfo;
        return (this.d == null || (appInfo = getAppInfo()) == null || TextUtils.isEmpty(appInfo.getPkgName())) ? "" : this.d.readPreRequestsJson(appInfo.getPkgName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        WebView webView = this.i;
        if (webView == null) {
            LogUtil.w("H5PRO_WebKitInstance", "clearWebView: mWebView is null");
            return;
        }
        ViewParent parent = webView.getParent();
        this.i.loadUrl(Constants.ABOUT_BLANK);
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.i);
        }
        this.i.stopLoading();
        this.i.getSettings().setJavaScriptEnabled(false);
        this.i.clearHistory();
        this.i.removeAllViews();
        try {
            LogUtil.i("H5PRO_WebKitInstance", "webview destroy");
            this.i.destroy();
        } catch (Throwable th) {
            LogUtil.e("H5PRO_WebKitInstance", "webview destroy fail:" + th.getMessage());
        }
        this.i = null;
    }
}
