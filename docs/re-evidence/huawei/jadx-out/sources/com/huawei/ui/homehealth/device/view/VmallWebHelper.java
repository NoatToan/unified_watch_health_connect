package com.huawei.ui.homehealth.device.view;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hianalytics.visual.autocollect.HAWebChromeClient;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.js.JsInteraction;
import com.huawei.operation.view.CustomWebView;
import com.huawei.operation.vmall.VmallLoginWebview;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.operation.ResourceCallback;
import com.huawei.ui.homehealth.operation.vmall.bean.VmallResource;
import defpackage.lmf;
import defpackage.qsl;
import defpackage.qsm;
import defpackage.ssc;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class VmallWebHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f25357c;
    private final WeakReference<Context> d;
    private boolean e;
    private boolean f;
    private boolean h;
    private NetworkStateReceiver k;
    private long l;
    private View m;
    private LinearLayout o;
    private WebView q;
    private final View s;
    private VmallLoginWebview t;
    private boolean i = true;
    private boolean j = true;
    private VmallResource p = new VmallResource();
    private boolean g = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25355a = false;
    private final d n = new d();

    public VmallWebHelper(Context context, View view) {
        this.d = new WeakReference<>(context);
        this.f25357c = view;
        this.s = view.findViewById(R.id.device_vmall_card_layout);
        i();
    }

    private void r() {
        LogUtil.a("VmallWebHelper", "startLoadWebView");
        if (this.h) {
            return;
        }
        LogUtil.a("VmallWebHelper", "startLoadWebView start to load");
        n();
    }

    private void e(WebView webView) {
        webView.addJavascriptInterface(new JsInteraction(webView.getContext()), "JsInteraction");
    }

    private void o() {
        LogUtil.a("VmallWebHelper", "initWebViewClient");
        t();
        e(this.q);
        this.q.setWebViewClient(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.h = true;
        this.f = false;
        q();
    }

    private void g() {
        this.o = (LinearLayout) this.s.findViewById(R.id.vmall_no_network_layout);
        LinearLayout linearLayout = (LinearLayout) this.s.findViewById(R.id.no_network_text_icon_layout);
        if (linearLayout == null) {
            qsl.b("initNoNetworkLayout noNetworkIconLayout == null", this.s, R.id.no_network_text_icon_layout);
            return;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: rvn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47769c.d(view);
            }
        });
        HealthButton healthButton = (HealthButton) this.s.findViewById(R.id.vmall_net_setting_btn);
        if (healthButton == null) {
            qsl.b("initNoNetworkLayout vmallNoNetworkButton == null", this.s, R.id.vmall_net_setting_btn);
        } else {
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: rvm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47768c.c(view);
                }
            });
            m();
        }
    }

    public /* synthetic */ void d(View view) {
        if (this.q != null && !TextUtils.isEmpty(this.p.b())) {
            f();
        }
        if (this.e) {
            b();
        }
    }

    public /* synthetic */ void c(View view) {
        WeakReference<Context> weakReference = this.d;
        if (weakReference == null || weakReference.get() == null) {
            LogUtil.a("VmallWebHelper", "initWebView: get context fail");
        } else {
            CommonUtil.t(this.d.get());
        }
    }

    private void i() {
        LogUtil.a("VmallWebHelper", "initWebView");
        if (this.s == null) {
            LogUtil.e("VmallWebHelper", "inflate vmall webview fail");
            return;
        }
        g();
        this.q = (WebView) this.s.findViewById(R.id.vmall_webview);
        this.m = this.s.findViewById(R.id.loading_progress);
        WebView webView = this.q;
        if (webView == null) {
            LogUtil.e("VmallWebHelper", "mVmallWebview found with null");
            return;
        }
        webView.setBackgroundColor(0);
        this.q.getBackground().setAlpha(0);
        this.q.setDrawingCacheEnabled(false);
        o();
    }

    private void n() {
        LogUtil.a("VmallWebHelper", "loadWebview");
        if (TextUtils.isEmpty(this.p.b()) || this.q == null) {
            return;
        }
        LogUtil.a("VmallWebHelper", "load vmall url");
        f();
    }

    private void t() {
        LogUtil.a("VmallWebHelper", "setWebviewContent");
        this.q.setWebChromeClient(new WebChromeClientBase());
        this.q.setFocusableInTouchMode(false);
        this.q.requestFocus();
        WebSettings settings = this.q.getSettings();
        qsm.c(this.q);
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setUserAgentString(settings.getUserAgentString() + "; HuaweiHealth; HuaweiHealthV2");
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(false);
        settings.setTextZoom(100);
        settings.setSavePassword(false);
        settings.setGeolocationEnabled(false);
        settings.setAllowContentAccess(false);
        settings.setLoadWithOverviewMode(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.q, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        LogUtil.a("VmallWebHelper", "retryLoadOnce");
        if (this.j) {
            f();
            this.j = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str) {
        LogUtil.a("VmallWebHelper", "vmallUrlLoading, url: " + str);
        if (TextUtils.equals(str, this.p.b())) {
            LogUtil.a("VmallWebHelper", "url equals mVmallUrl, reload vmall home page.");
            p();
            return;
        }
        LogUtil.a("VmallWebHelper", "load url with webview activity");
        if (this.g) {
            this.g = false;
            LogUtil.j("VmallWebHelper", "need not to refresh webview");
        } else if (LoginInit.checkBaseServiceModel()) {
            LogUtil.j("VmallWebHelper", "vmallUrlLoading checkBaseServiceModel");
        } else {
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.ENTRY_VMALL_H9000001.value(), b(1), 0);
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: rvv
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.e.b(str, i, obj);
                }
            }, AnalyticsValue.HEALTH_CONFIGURE_PAGE_FRAGMENT_2020029.value());
        }
    }

    public /* synthetic */ void b(String str, int i, Object obj) {
        LogUtil.a("VmallWebHelper", "browsingToLogin response");
        if (i == 0) {
            c(str);
        } else {
            LogUtil.j("VmallWebHelper", "getViewClickListener errorCode = ", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2) {
        LogUtil.a("VmallWebHelper", "setVmallVisible vmallVisible:", Boolean.valueOf(i == 0), " noNetworkVisible:", Boolean.valueOf(i2 == 0));
        this.m.setVisibility(8);
        WebView webView = this.q;
        if (webView != null) {
            webView.setVisibility(i);
        }
        if (this.o != null) {
            if (CommonUtil.bd() && TextUtils.isEmpty(this.p.b())) {
                this.o.setVisibility(8);
                LogUtil.a("VmallWebHelper", "setVmallLoadVisible isHonor, VmallUrl isEmpty, setVisibility GONE");
            } else {
                this.o.setVisibility(i2);
            }
        } else if (i2 == 0) {
            LogUtil.j("VmallWebHelper", "mVmallNoNetworkLayout is null");
        }
        if (i == 8 && i2 == 0 && this.j) {
            LogUtil.a("VmallWebHelper", "setVmallVisible reload");
            l();
            this.j = false;
        }
    }

    public void f() {
        this.j = true;
        LogUtil.a("VmallWebHelper", "mVmallUrl: " + this.p.b());
        if (this.q == null || "".equals(this.p.b())) {
            LogUtil.a("VmallWebHelper", "mVmallWebview is null");
            return;
        }
        this.f25356b = false;
        this.q.loadUrl(this.p.b());
        VmallLoginWebview vmallLoginWebview = this.t;
        if (vmallLoginWebview == null || !vmallLoginWebview.isVmallLogin()) {
            h();
        }
        HandlerExecutor.c(new Runnable() { // from class: rvq
            @Override // java.lang.Runnable
            public final void run() {
                this.f47774b.d();
            }
        }, 7000L);
    }

    public /* synthetic */ void d() {
        LogUtil.a("VmallWebHelper", "vmall load wait");
        if (this.h) {
            return;
        }
        LogUtil.a("VmallWebHelper", "mIsVmallLoaded is false");
        c(8, 0);
    }

    private void c(String str) {
        LogUtil.a("VmallWebHelper", "loadWebViewActivity, url: " + str);
        WeakReference<Context> weakReference = this.d;
        if (weakReference == null || weakReference.get() == null) {
            LogUtil.a("VmallWebHelper", "loadWebViewActivity: get context fail");
            return;
        }
        Intent intent = new Intent(this.d.get(), (Class<?>) WebViewActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("url", str);
        intent.putExtra("EXTRA_BI_ID", String.valueOf(0));
        intent.putExtra("EXTRA_BI_NAME", "");
        intent.putExtra("EXTRA_BI_SOURCE", "CONFIGURE_PAGE_CARD");
        intent.putExtra("EXTRA_BI_SHOWTIME", "SHOW_TIME_BI");
        try {
            this.d.get().startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("VmallWebHelper", "ActivityNotFound", e2.getMessage());
        }
    }

    public void b() {
        new ssc().requestResource(new ResourceCallback() { // from class: rvp
            @Override // com.huawei.ui.homehealth.operation.ResourceCallback
            public final void obtainResource(sru sruVar) {
                this.f47773b.e((VmallResource) sruVar);
            }
        });
    }

    public /* synthetic */ void e(VmallResource vmallResource) {
        if (this.f25355a) {
            return;
        }
        if (vmallResource == null) {
            ReleaseLogUtil.d("R_VmallWebHelper", "loadVmallContent vmallResource == null isHonor: ", Boolean.valueOf(CommonUtil.bd()));
            if (CommonUtil.bd()) {
                this.p = new VmallResource();
            }
            j();
            return;
        }
        c(vmallResource);
    }

    private void c(VmallResource vmallResource) {
        if (!vmallResource.d()) {
            LogUtil.a("VmallWebHelper", "empty resource");
            return;
        }
        this.e = false;
        if (vmallResource.e(this.p)) {
            LogUtil.a("VmallWebHelper", "vmall resource has init");
            return;
        }
        this.p = vmallResource;
        LogUtil.a("VmallWebHelper", "Url has get, start to load vmall");
        d(this.p.b());
        if (this.f25357c == null) {
            LogUtil.j("VmallWebHelper", "this activity is destroy, finish vmall loading");
        } else {
            r();
        }
    }

    private void j() {
        if (this.p.d()) {
            return;
        }
        this.e = true;
        this.p.d(true);
        LogUtil.a("VmallWebHelper", "dealEmptyMarketingData show noNetwork layout only");
        g();
        c(8, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (str.matches(".*vmall.com/.*/.*/index.html\\?pageId=.*")) {
            LogUtil.a("VmallWebHelper", "vmallUrl pageId is ", str.split("pageId=")[1].split("&cid")[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        LogUtil.a("VmallWebHelper", "onNetworkReceive, isNetwork: ", Boolean.valueOf(z), ", mIsLoadError: ", Boolean.valueOf(this.f25356b));
        if (z) {
            if (!this.i && this.q != null) {
                LogUtil.a("VmallWebHelper", "onNetworkReceive network is accessible, start to load vmall");
                b();
                if (!TextUtils.isEmpty(this.p.b())) {
                    f();
                }
            }
        } else {
            LogUtil.a("VmallWebHelper", "onNetworkReceive onReceive: default");
        }
        this.i = z;
    }

    private void m() {
        LogUtil.a("VmallWebHelper", "registerNetworkChangeBroadcastReceiver");
        if (this.k != null) {
            LogUtil.j("VmallWebHelper", "mNetworkStateReceiver is not null");
            return;
        }
        NetworkStateReceiver networkStateReceiver = new NetworkStateReceiver();
        this.k = networkStateReceiver;
        networkStateReceiver.e(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        BaseApplication.getContext().registerReceiver(this.k, intentFilter);
    }

    private void s() {
        LogUtil.a("VmallWebHelper", "unRegisterNetworkChangeBroadcastReceiver");
        try {
            if (this.k != null) {
                BaseApplication.getContext().unregisterReceiver(this.k);
            }
        } catch (IllegalArgumentException unused) {
            LogUtil.e("VmallWebHelper", "unRegisterNetworkChangeBroadcastReceiver IllegalArgumentException");
        }
    }

    private void l() {
        LinearLayout linearLayout;
        LogUtil.a("VmallWebHelper", "reloadVmallWhenFailed");
        if (this.e) {
            LogUtil.a("VmallWebHelper", "reloadVmallWhenFailed with EmptyResource");
            return;
        }
        if ((this.q == null || TextUtils.isEmpty(this.p.b()) || !this.f25356b || this.q.getVisibility() != 0) && ((linearLayout = this.o) == null || linearLayout.getVisibility() != 0)) {
            return;
        }
        LogUtil.a("VmallWebHelper", "reload vmall");
        f();
        this.f25356b = false;
    }

    public void h() {
        LogUtil.a("VmallWebHelper", "vmallPreLoad");
        VmallLoginWebview vmallLoginWebview = this.t;
        if (vmallLoginWebview == null || !vmallLoginWebview.isVmallLogin()) {
            LogUtil.a("VmallWebHelper", "current state is logout, start to prelogin");
            HandlerExecutor.c(new c(), 6000L);
        }
    }

    public void c() {
        LogUtil.a("VmallWebHelper", BaseDialog.LIFE_CYCLE_ON_RESUME);
        VmallLoginWebview vmallLoginWebview = this.t;
        if (vmallLoginWebview == null || !vmallLoginWebview.isVmallLogin()) {
            LogUtil.a("VmallWebHelper", "preLoad onResume");
            h();
        }
    }

    private void q() {
        if (this.f25356b) {
            LogUtil.j("VmallWebHelper", "updateResumeFinishedState is invisible or LoadError");
        } else {
            if (this.f || !this.h) {
                return;
            }
            this.n.removeMessages(1);
            this.n.sendEmptyMessageDelayed(1, 5000L);
        }
    }

    public void a() {
        LogUtil.a("VmallWebHelper", "onDestroy");
        this.f25355a = true;
        s();
        WebView webView = this.q;
        if (webView != null) {
            webView.destroy();
        }
        VmallLoginWebview vmallLoginWebview = this.t;
        if (vmallLoginWebview != null) {
            vmallLoginWebview.clear();
        }
    }

    public void e() {
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.ENTRY_VMALL_H9000001.value(), b(0), 0);
    }

    public static class NetworkStateReceiver extends BroadcastReceiver {
        private WeakReference<VmallWebHelper> d;

        public void e(VmallWebHelper vmallWebHelper) {
            this.d = new WeakReference<>(vmallWebHelper);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VmallWebHelper vmallWebHelper;
            if (context == null) {
                LogUtil.j("VmallWebHelper", "context is null");
            } else {
                if (this.d.get() == null || (vmallWebHelper = this.d.get()) == null) {
                    return;
                }
                vmallWebHelper.e(NetworkUtil.i());
            }
        }
    }

    static class WebChromeClientBase extends WebChromeClient {
        private WebChromeClientBase() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            HAWebChromeClient.initH5Monitor(webView, i);
            super.onProgressChanged(webView, i);
        }
    }

    class d extends Handler {
        private d() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                LogUtil.a("VmallWebHelper_VmallHandler", "checkResume finished");
                VmallWebHelper.this.f = true;
            } else {
                LogUtil.j("VmallWebHelper_VmallHandler", "invalid type");
            }
        }
    }

    class b extends WebViewClient {
        private b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            LogUtil.a("VmallWebHelper", "webViewClient shouldOverrideUrlLoading url");
            CustomWebView.setLoginStatus(VmallWebHelper.this.t != null && VmallWebHelper.this.t.isVmallLogin());
            VmallWebHelper.this.e(str);
            VmallWebHelper.this.d(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            LogUtil.a("VmallWebHelper", "webViewClient shouldOverrideUrlLoading request");
            CustomWebView.setLoginStatus(VmallWebHelper.this.t != null && VmallWebHelper.this.t.isVmallLogin());
            String string = webResourceRequest.getUrl().toString();
            VmallWebHelper.this.e(string);
            VmallWebHelper.this.d(string);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            int errorCode = webResourceError.getErrorCode();
            LogUtil.e("VmallWebHelper", "webViewClient onReceivedError ", "getErrorCode = ", Integer.valueOf(errorCode), " getDescription", webResourceError.getDescription());
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            VmallWebHelper.this.f25356b = true;
            VmallWebHelper.this.c(8, 0);
            if (SystemClock.elapsedRealtime() - VmallWebHelper.this.l > 6000) {
                VmallWebHelper.this.p();
            }
            VmallWebHelper.this.n.removeMessages(1);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            LogUtil.e("VmallWebHelper", "webViewClient onReceivedSslError ", "error = ", sslError.toString());
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            int statusCode = webResourceResponse.getStatusCode();
            LogUtil.e("VmallWebHelper", "webViewClient onReceivedHttpError ", "getStatusCode = ", Integer.valueOf(statusCode), " getReasonPhrase", webResourceResponse.getReasonPhrase());
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            LogUtil.a("VmallWebHelper", "webViewClient onPageFinished");
            if (!VmallWebHelper.this.f25356b) {
                VmallWebHelper.this.c(0, 8);
            }
            VmallWebHelper.this.l = SystemClock.elapsedRealtime();
            VmallWebHelper.this.k();
        }
    }

    private static Map<String, Object> b(int i) {
        HashMap map = new HashMap();
        map.put("sessionId", Long.valueOf(System.currentTimeMillis()));
        map.put("pageId", "vmall_0001");
        Thread.currentThread().getName();
        map.put("moduleName", "main_page");
        if (i == 0) {
            map.put(FunctionSetBeanReader.BI_ELEMENT, "m0");
            map.put("event", 0);
            return map;
        }
        if (i != 1) {
            return map;
        }
        map.put(FunctionSetBeanReader.BI_ELEMENT, "goods_item");
        map.put("event", 1);
        return map;
    }

    class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (VmallWebHelper.this.d.get() == null) {
                LogUtil.a("VmallWebHelper", "vmallPreLoad: get context fail");
                return;
            }
            try {
                WebView webView = new WebView((Context) VmallWebHelper.this.d.get());
                VmallWebHelper.this.t = new VmallLoginWebview(webView);
                webView.setWebChromeClient(new WebChromeClientBase());
                webView.getSettings().setJavaScriptEnabled(true);
                qsm.c(webView);
                webView.setWebViewClient(new e());
                VmallWebHelper.this.t.preLogin(true);
            } catch (Exception unused) {
                LogUtil.a("VmallWebHelper", "MissingWebViewPackageException");
            }
            ReleaseLogUtil.d("VmallWebHelper", "vmall preload finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    class e extends WebViewClient {
        private e() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            LogUtil.a("VmallWebHelper", "PreLoginClient: onPageFinished");
            if (VmallWebHelper.this.t != null) {
                VmallWebHelper.this.t.onPageFinishedForVmall(webView, str);
            }
        }
    }
}
