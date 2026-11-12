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
import android.view.ViewGroup;
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
import androidx.core.content.ContextCompat;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.handler.HandlerExecutor;
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
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.DeviceFragment;
import com.huawei.ui.homehealth.operation.ResourceCallback;
import com.huawei.ui.homehealth.operation.vmall.bean.VmallResource;
import defpackage.qsl;
import defpackage.qsm;
import defpackage.ssc;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes17.dex */
public class VmallWebview implements IWebViewLifeCycle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<DeviceFragment> f25360a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25362c;
    private View d;
    private WeakReference<Context> e;
    private boolean f;
    private boolean g;
    private boolean i;
    private boolean k;
    private View m;
    private NetworkStateReceiver n;
    private long o;
    private View p;
    private HealthSubHeader r;
    private LinearLayout t;
    private VmallLoginWebview v;
    private NestedWebView w;
    private int x;
    private boolean h = true;
    private boolean j = true;
    private VmallResource s = new VmallResource();
    private boolean l = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25361b = false;
    private e q = new e();

    public VmallWebview(Context context, View view, DeviceFragment deviceFragment) {
        this.e = new WeakReference<>(context);
        this.d = view;
        this.f25360a = new WeakReference<>(deviceFragment);
        this.p = this.d.findViewById(R.id.device_vmall_card_layout);
        f();
    }

    private void r() {
        LogUtil.a("VmallWebview", "startLoadWebView");
        if (this.k) {
            return;
        }
        LogUtil.a("VmallWebview", "startLoadWebView start to load");
        i();
    }

    public void b() {
        NestedWebView nestedWebView = this.w;
        if (nestedWebView != null) {
            nestedWebView.d();
        }
    }

    private void c(WebView webView) {
        webView.addJavascriptInterface(new JsInteraction(webView.getContext()), "JsInteraction");
    }

    private void h() {
        LogUtil.a("VmallWebview", "initWebViewClient");
        t();
        c((WebView) this.w);
        this.w.setWebViewClient(new WebViewClient() { // from class: com.huawei.ui.homehealth.device.view.VmallWebview.4
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                LogUtil.a("VmallWebview", "webViewClient shouldOverrideUrlLoading url");
                CustomWebView.setLoginStatus(VmallWebview.this.v != null && VmallWebview.this.v.isVmallLogin());
                VmallWebview.this.e(str);
                VmallWebview.this.b(str);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                LogUtil.a("VmallWebview", "webViewClient shouldOverrideUrlLoading request");
                CustomWebView.setLoginStatus(VmallWebview.this.v != null && VmallWebview.this.v.isVmallLogin());
                String string = webResourceRequest.getUrl().toString();
                VmallWebview.this.e(string);
                VmallWebview.this.b(string);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                int errorCode = webResourceError.getErrorCode();
                LogUtil.e("VmallWebview", "webViewClient onReceivedError ", "getErrorCode = ", Integer.valueOf(errorCode), " getDescription", webResourceError.getDescription());
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                VmallWebview.this.f = true;
                VmallWebview.this.d(8, 0);
                if (SystemClock.elapsedRealtime() - VmallWebview.this.o > 6000) {
                    VmallWebview.this.k();
                }
                VmallWebview.this.q.removeMessages(1);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                LogUtil.e("VmallWebview", "webViewClient onReceivedSslError ", "error = ", sslError.toString());
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                int statusCode = webResourceResponse.getStatusCode();
                LogUtil.e("VmallWebview", "webViewClient onReceivedHttpError ", "getStatusCode = ", Integer.valueOf(statusCode), " getReasonPhrase", webResourceResponse.getReasonPhrase());
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                LogUtil.a("VmallWebview", "webViewClient onPageFinished");
                VmallWebview.this.p();
                if (!VmallWebview.this.f) {
                    VmallWebview.this.d(0, 8);
                }
                VmallWebview.this.o = SystemClock.elapsedRealtime();
                VmallWebview.this.m();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.k = true;
        WeakReference<DeviceFragment> weakReference = this.f25360a;
        if (weakReference == null) {
            LogUtil.j("VmallWebview", "onPageFinishedInner weakRef is null");
            return;
        }
        if (weakReference.get() == null) {
            LogUtil.j("VmallWebview", "onPageFinishedInner deviceFragment is null");
        } else if (!this.i) {
            LogUtil.a("VmallWebview", "webview loading not in deviceFragment");
        } else {
            this.g = false;
            y();
        }
    }

    private void g() {
        this.t = (LinearLayout) this.p.findViewById(R.id.vmall_no_network_layout);
        LinearLayout linearLayout = (LinearLayout) this.p.findViewById(R.id.no_network_text_icon_layout);
        if (linearLayout == null) {
            qsl.b("initNoNetworkLayout noNetworkIconLayout == null", this.p, R.id.no_network_text_icon_layout);
            return;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: rvs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(view);
            }
        });
        HealthButton healthButton = (HealthButton) this.p.findViewById(R.id.vmall_net_setting_btn);
        if (healthButton == null) {
            qsl.b("initNoNetworkLayout vmallNoNetworkButton == null", this.p, R.id.vmall_net_setting_btn);
        } else {
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: rvu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47776a.d(view);
                }
            });
            n();
        }
    }

    public /* synthetic */ void c(View view) {
        if (this.w != null && !TextUtils.isEmpty(this.s.b())) {
            s();
        }
        if (!this.f25362c || this.f25360a.get() == null) {
            return;
        }
        LogUtil.a("VmallWebview", "update vmall marketing data");
        this.f25360a.get().j();
    }

    public /* synthetic */ void d(View view) {
        WeakReference<Context> weakReference = this.e;
        if (weakReference == null || weakReference.get() == null) {
            LogUtil.a("VmallWebview", "initWebView: get context fail");
        } else {
            CommonUtil.t(this.e.get());
        }
    }

    private void f() {
        LogUtil.a("VmallWebview", "initWebView");
        if (this.p == null) {
            LogUtil.e("VmallWebview", "inflate vmall webview fail");
            return;
        }
        g();
        this.r = (HealthSubHeader) this.p.findViewById(R.id.device_sub_header);
        this.w = (NestedWebView) this.p.findViewById(R.id.vmall_webview);
        this.m = this.p.findViewById(R.id.loading_progress);
        NestedWebView nestedWebView = this.w;
        if (nestedWebView == null) {
            LogUtil.e("VmallWebview", "mVmallWebview found with null");
            return;
        }
        nestedWebView.setBackgroundColor(0);
        this.w.getBackground().setAlpha(0);
        this.w.setDrawingCacheEnabled(false);
        h();
    }

    private void i() {
        LogUtil.a("VmallWebview", "loadWebview");
        o();
        if (TextUtils.isEmpty(this.s.b()) || this.w == null) {
            return;
        }
        LogUtil.a("VmallWebview", "load vmall url");
        s();
    }

    private void t() {
        LogUtil.a("VmallWebview", "setWebviewContent");
        this.w.setWebChromeClient(new WebChromeClientBase());
        this.w.setFocusableInTouchMode(false);
        this.w.requestFocus();
        WebSettings settings = this.w.getSettings();
        qsm.c(this.w);
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
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.w, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        LogUtil.a("VmallWebview", "retryLoadOnce");
        if (this.j) {
            s();
            this.j = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str) {
        LogUtil.a("VmallWebview", "vmallUrlLoading, url: " + str);
        if (TextUtils.equals(str, this.s.b())) {
            LogUtil.a("VmallWebview", "url equals mVmallUrl, reload vmall home page.");
            k();
            return;
        }
        LogUtil.a("VmallWebview", "load url with webview activity");
        if (this.l) {
            this.l = false;
            LogUtil.j("VmallWebview", "need not to refresh webview");
        } else {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: rvx
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.e.d(str, i, obj);
                }
            }, AnalyticsValue.HEALTH_CONFIGURE_PAGE_FRAGMENT_2020029.value());
        }
    }

    public /* synthetic */ void d(String str, int i, Object obj) {
        LogUtil.a("VmallWebview", "browsingToLogin response");
        if (i == 0) {
            a(str);
        } else {
            LogUtil.j("VmallWebview", "getViewClickListener errorCode = ", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int i2) {
        NestedWebView nestedWebView;
        LogUtil.a("VmallWebview", "setVmallVisible vmallVisible:", Boolean.valueOf(i == 0), " noNetworkVisible:", Boolean.valueOf(i2 == 0));
        this.m.setVisibility(8);
        if (this.r != null && (nestedWebView = this.w) != null) {
            nestedWebView.setVisibility(i);
            this.r.setVisibility(i);
        }
        if (this.t != null) {
            if (CommonUtil.bd() && TextUtils.isEmpty(this.s.b())) {
                this.t.setVisibility(8);
                LogUtil.a("VmallWebview", "setVmallLoadVisible isHonor, VmallUrl isEmpty, setVisibility GONE");
            } else {
                this.t.setVisibility(i2);
            }
        } else if (i2 == 0) {
            LogUtil.j("VmallWebview", "mVmallNoNetworkLayout is null");
        }
        if (i == 8 && i2 == 0 && this.j) {
            LogUtil.a("VmallWebview", "setVmallVisible reload");
            l();
            this.j = false;
        }
    }

    private void o() {
        if (this.s.c() == null || this.r == null) {
            return;
        }
        LogUtil.a("VmallWebview", "set vmall head title");
        this.r.setHeadTitleText(this.s.c());
        this.r.setMoreTextVisibility(8);
        this.r.setSubHeaderBackgroundColor(ContextCompat.getColor(BaseApplication.getContext(), R.color.common_transparent));
        this.r.setRightArrayVisibility(8);
    }

    public void e() {
        b();
        s();
    }

    private void s() {
        this.j = true;
        LogUtil.a("VmallWebview", "mVmallUrl: " + this.s.b());
        if (this.w == null || "".equals(this.s.b())) {
            LogUtil.a("VmallWebview", "mVmallWebview is null");
            return;
        }
        o();
        this.f = false;
        this.w.loadUrl(this.s.b());
        VmallLoginWebview vmallLoginWebview = this.v;
        if (vmallLoginWebview == null || !vmallLoginWebview.isVmallLogin()) {
            a();
        }
        HandlerExecutor.c(new Runnable() { // from class: rvt
            @Override // java.lang.Runnable
            public final void run() {
                this.f47775b.c();
            }
        }, 7000L);
    }

    public /* synthetic */ void c() {
        LogUtil.a("VmallWebview", "vmall load wait");
        if (this.k) {
            return;
        }
        LogUtil.a("VmallWebview", "mIsVmallLoaded is false");
        d(8, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        ViewGroup.LayoutParams layoutParams = this.w.getLayoutParams();
        if (this.x > 0 && layoutParams.height != this.x) {
            LogUtil.a("VmallWebview", "changeVmallHeight layoutParams.height = ", Integer.valueOf(layoutParams.height));
        }
        layoutParams.height = this.x;
        this.w.setLayoutParams(layoutParams);
    }

    private void a(String str) {
        LogUtil.a("VmallWebview", "loadWebViewActivity, url: " + str);
        WeakReference<Context> weakReference = this.e;
        if (weakReference == null || weakReference.get() == null) {
            LogUtil.a("VmallWebview", "loadWebViewActivity: get context fail");
            return;
        }
        Intent intent = new Intent(this.e.get(), (Class<?>) WebViewActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("url", str);
        intent.putExtra("EXTRA_BI_ID", String.valueOf(0));
        intent.putExtra("EXTRA_BI_NAME", "");
        intent.putExtra("EXTRA_BI_SOURCE", "CONFIGURE_PAGE_CARD");
        intent.putExtra("EXTRA_BI_SHOWTIME", "SHOW_TIME_BI");
        try {
            this.e.get().startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("VmallWebview", "ActivityNotFound", e2.getMessage());
        }
    }

    public void b(int i) {
        LogUtil.a("VmallWebview", "changeVmallHeight");
        this.x = i;
    }

    public void d() {
        new ssc().requestResource(new ResourceCallback() { // from class: rvz
            @Override // com.huawei.ui.homehealth.operation.ResourceCallback
            public final void obtainResource(sru sruVar) {
                this.f47778a.b((VmallResource) sruVar);
            }
        });
    }

    public /* synthetic */ void b(VmallResource vmallResource) {
        if (this.f25361b) {
            return;
        }
        if (vmallResource == null) {
            ReleaseLogUtil.d("R_VmallWebview", "loadVmallContent vmallResource == null isHonor: ", Boolean.valueOf(CommonUtil.bd()));
            if (CommonUtil.bd()) {
                this.s = new VmallResource();
            }
            j();
            return;
        }
        c(vmallResource);
    }

    private void c(VmallResource vmallResource) {
        if (!vmallResource.d()) {
            LogUtil.a("VmallWebview", "empty resource");
            return;
        }
        this.f25362c = false;
        if (vmallResource.e(this.s)) {
            LogUtil.a("VmallWebview", "vmall resource has init");
            return;
        }
        this.s = vmallResource;
        LogUtil.a("VmallWebview", "Url has get, start to load vmall");
        b(this.s.b());
        if (this.d == null) {
            LogUtil.j("VmallWebview", "this activity is destroy, finish vmall loading");
        } else {
            r();
        }
    }

    private void j() {
        if (this.s.d()) {
            return;
        }
        this.f25362c = true;
        this.s.d(true);
        LogUtil.a("VmallWebview", "dealEmptyMarketingData show noNetwork layout only");
        g();
        d(8, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (str.matches(".*vmall.com/.*/.*/index.html\\?pageId=.*")) {
            LogUtil.a("VmallWebview", "vmallUrl pageId is ", str.split("pageId=")[1].split("&cid")[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        LogUtil.a("VmallWebview", "onNetworkReceive, isNetwork: ", Boolean.valueOf(z), ", mIsLoadError: ", Boolean.valueOf(this.f));
        if (!VersionControlUtil.isSupportOperationAccount()) {
            d(8, 8);
        } else if (z) {
            if (!this.h && this.w != null) {
                LogUtil.a("VmallWebview", "onNetworkReceive network is accessible, start to load vmall");
                WeakReference<DeviceFragment> weakReference = this.f25360a;
                if (weakReference != null && weakReference.get() != null) {
                    DeviceFragment deviceFragment = this.f25360a.get();
                    deviceFragment.a();
                    deviceFragment.e();
                }
                if (!TextUtils.isEmpty(this.s.b())) {
                    s();
                }
            }
        } else {
            LogUtil.a("VmallWebview", "onNetworkReceive onReceive: default");
        }
        this.h = z;
    }

    private void n() {
        LogUtil.a("VmallWebview", "registerNetworkChangeBroadcastReceiver");
        if (this.n != null) {
            LogUtil.j("VmallWebview", "mNetworkStateReceiver is not null");
            return;
        }
        NetworkStateReceiver networkStateReceiver = new NetworkStateReceiver();
        this.n = networkStateReceiver;
        networkStateReceiver.b(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        BaseApplication.getContext().registerReceiver(this.n, intentFilter);
    }

    private void q() {
        LogUtil.a("VmallWebview", "unRegisterNetworkChangeBroadcastReceiver");
        try {
            if (this.n != null) {
                BaseApplication.getContext().unregisterReceiver(this.n);
            }
        } catch (IllegalArgumentException unused) {
            LogUtil.e("VmallWebview", "unRegisterNetworkChangeBroadcastReceiver IllegalArgumentException");
        }
    }

    private void l() {
        LinearLayout linearLayout;
        LogUtil.a("VmallWebview", "reloadVmallWhenFailed");
        if (this.f25362c) {
            LogUtil.a("VmallWebview", "reloadVmallWhenFailed with EmptyResource");
            return;
        }
        if ((this.w == null || TextUtils.isEmpty(this.s.b()) || !this.f || this.w.getVisibility() != 0) && ((linearLayout = this.t) == null || linearLayout.getVisibility() != 0)) {
            return;
        }
        LogUtil.a("VmallWebview", "reload vmall");
        s();
        this.f = false;
    }

    public void a() {
        LogUtil.a("VmallWebview", "vmallPreLoad");
        VmallLoginWebview vmallLoginWebview = this.v;
        if (vmallLoginWebview == null || !vmallLoginWebview.isVmallLogin()) {
            LogUtil.a("VmallWebview", "current state is logout, start to prelogin");
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.homehealth.device.view.VmallWebview.1
                @Override // java.lang.Runnable
                public void run() {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (VmallWebview.this.e == null || VmallWebview.this.e.get() == null) {
                        LogUtil.a("VmallWebview", "vmallPreLoad: get context fail");
                        return;
                    }
                    try {
                        WebView webView = new WebView((Context) VmallWebview.this.e.get());
                        VmallWebview.this.v = new VmallLoginWebview(webView);
                        webView.setWebChromeClient(new WebChromeClientBase());
                        webView.getSettings().setJavaScriptEnabled(true);
                        qsm.c(webView);
                        webView.setWebViewClient(new WebViewClient() { // from class: com.huawei.ui.homehealth.device.view.VmallWebview.1.5
                            @Override // android.webkit.WebViewClient
                            public void onPageFinished(WebView webView2, String str) {
                                super.onPageFinished(webView2, str);
                                if (VmallWebview.this.v != null) {
                                    VmallWebview.this.v.onPageFinishedForVmall(webView2, str);
                                }
                            }
                        });
                        VmallWebview.this.v.preLogin(true);
                    } catch (Exception unused) {
                        LogUtil.a("VmallWebview", "MissingWebViewPackageException");
                    }
                    ReleaseLogUtil.d("VmallWebview", "vmall preload finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
                }
            }, 6000L);
        }
    }

    @Override // com.huawei.ui.homehealth.device.view.IWebViewLifeCycle
    public void onResume() {
        LogUtil.a("VmallWebview", BaseDialog.LIFE_CYCLE_ON_RESUME);
        VmallLoginWebview vmallLoginWebview = this.v;
        if (vmallLoginWebview == null || !vmallLoginWebview.isVmallLogin()) {
            LogUtil.a("VmallWebview", "preLoad onResume");
            a();
        }
    }

    private void y() {
        if (!this.i || this.f) {
            LogUtil.j("VmallWebview", "updateResumeFinishedState is invisible or LoadError");
        } else {
            if (this.g || !this.k) {
                return;
            }
            this.q.removeMessages(1);
            this.q.sendEmptyMessageDelayed(1, 5000L);
        }
    }

    @Override // com.huawei.ui.homehealth.device.view.IWebViewLifeCycle
    public void onHiddenChanged(boolean z) {
        LogUtil.a("VmallWebview", "onHiddenChanged: ", Boolean.valueOf(z));
        NestedWebView nestedWebView = this.w;
        if (nestedWebView == null) {
            LogUtil.j("VmallWebview", "onHiddenChanged mVmallWebview is null.");
            return;
        }
        this.i = !z;
        if (z) {
            nestedWebView.d();
        }
        String url = this.w.getUrl();
        if (TextUtils.isEmpty(url)) {
            return;
        }
        LogUtil.d("VmallWebview", "VmallWebview cookie: ", CookieManager.getInstance().getCookie(url));
    }

    @Override // com.huawei.ui.homehealth.device.view.IWebViewLifeCycle
    public void onDestroy() {
        LogUtil.a("VmallWebview", "onDestroy");
        this.f25361b = true;
        q();
        NestedWebView nestedWebView = this.w;
        if (nestedWebView != null) {
            nestedWebView.destroy();
        }
        VmallLoginWebview vmallLoginWebview = this.v;
        if (vmallLoginWebview != null) {
            vmallLoginWebview.clear();
        }
    }

    public static class NetworkStateReceiver extends BroadcastReceiver {
        private WeakReference<VmallWebview> d;

        public void b(VmallWebview vmallWebview) {
            this.d = new WeakReference<>(vmallWebview);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VmallWebview vmallWebview;
            if (context == null) {
                LogUtil.j("VmallWebview", "context is null");
            } else {
                if (this.d.get() == null || (vmallWebview = this.d.get()) == null) {
                    return;
                }
                vmallWebview.a(NetworkUtil.i());
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

    class e extends Handler {
        private e() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                LogUtil.a("VmallWebview_VmallHandler", "checkResume finished");
                VmallWebview.this.g = true;
            } else {
                LogUtil.j("VmallWebview_VmallHandler", "invalid type");
            }
        }
    }
}
