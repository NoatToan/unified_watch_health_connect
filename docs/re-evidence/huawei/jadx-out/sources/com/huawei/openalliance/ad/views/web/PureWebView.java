package com.huawei.openalliance.ad.views.web;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.od;
import com.huawei.openalliance.ad.or;
import com.huawei.openalliance.ad.utils.ab;
import com.huawei.openalliance.ad.utils.cr;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.dy;
import com.huawei.openalliance.ad.views.interfaces.q;
import com.huawei.operation.utils.Constants;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class PureWebView extends RelativeLayout implements q, PureNetworkLoadStatusView.a, PureNetworkLoadStatusView.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ProgressBar f21400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PureNetworkLoadStatusView f21401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f21402c;
    private String d;
    private or e;
    private com.huawei.openalliance.ad.views.web.c f;
    private Handler g;
    private long h;
    private boolean i;
    private int j;
    private a k;
    private Runnable l;

    public interface a {
        void a(int i);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.w
    public void a(String str, String str2, String str3) {
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        this.f.a(webViewClient);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.q
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f21402c.setWebChromeClient(webChromeClient);
    }

    public void setProcessBarNeedHide(boolean z) {
        this.i = z;
        ProgressBar progressBar = this.f21400a;
        if (progressBar != null) {
            progressBar.setVisibility(z ? 8 : 0);
        }
    }

    public void setOnLoadFinishedListener(a aVar) {
        this.k = aVar;
    }

    public WebView getWebView() {
        return this.f21402c;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.w
    public String getCurrentPageUrl() {
        return this.d;
    }

    public void e() {
        WebView webView = getWebView();
        if (webView == null) {
            return;
        }
        webView.setBackgroundColor(0);
        dy.a(this.f21402c);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.q
    public void d() {
        WebView webView = this.f21402c;
        if (webView != null) {
            webView.destroy();
        }
        this.f21402c = null;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.w
    public void c() {
        hw.a("PureWebView", "showPageFinishPage");
        PureNetworkLoadStatusView pureNetworkLoadStatusView = this.f21401b;
        if (pureNetworkLoadStatusView == null) {
            return;
        }
        int currentState = pureNetworkLoadStatusView.getCurrentState();
        hw.a("PureWebView", "state:%s", Integer.valueOf(currentState));
        if (this.f21401b.getCurrentState() == 1 && ab.h(getContext())) {
            this.f21401b.setState(0);
            WebView webView = this.f21402c;
            if (webView != null) {
                webView.setVisibility(0);
                this.f21402c.requestFocus();
            }
        }
        a aVar = this.k;
        if (aVar != null) {
            aVar.a(currentState);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.w
    public void b(String str) {
        this.d = str;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.w
    public void b() {
        WebView webView = this.f21402c;
        if (webView != null) {
            webView.loadUrl(Constants.ABOUT_BLANK);
        }
        ProgressBar progressBar = this.f21400a;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public void a(final String str, final long j) {
        this.h = j;
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.web.PureWebView.2
            @Override // java.lang.Runnable
            public void run() {
                PureWebView.this.d = str;
                PureWebView.this.e();
                PureWebView.this.b(str, j);
            }
        });
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.q
    public void a(String str) {
        a(str, 0L);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.q
    public void a(Object obj, String str) {
        this.e.a(obj, str, getWebView());
    }

    @Override // com.huawei.openalliance.ad.views.web.PureNetworkLoadStatusView.a
    public void a(PureNetworkLoadStatusView pureNetworkLoadStatusView) {
        WebView webView;
        View rootView;
        if (pureNetworkLoadStatusView == null || (webView = this.f21402c) == null || (rootView = webView.getRootView()) == null || rootView.getParent() != null) {
            return;
        }
        pureNetworkLoadStatusView.addView(rootView);
    }

    @Override // com.huawei.openalliance.ad.views.web.PureNetworkLoadStatusView.b
    public void a(final View view) {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.web.PureWebView.1
            @Override // java.lang.Runnable
            public void run() {
                if (view.getId() == R.id.privacy_set_network) {
                    Intent intent = new Intent("android.settings.WIFI_SETTINGS");
                    intent.setFlags(268435456);
                    dk.a(PureWebView.this.getContext(), intent);
                } else if (!ab.h(PureWebView.this.getContext())) {
                    if (PureWebView.this.f21401b != null) {
                        PureWebView.this.f21401b.setState(-2);
                    }
                } else {
                    PureWebView pureWebView = PureWebView.this;
                    pureWebView.b(pureWebView.getCurrentPageUrl(), PureWebView.this.h);
                }
            }
        });
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.q
    public void a(int i) {
        ProgressBar progressBar;
        hw.a("PureWebView", "handleProgressChanged:" + i);
        this.j = i;
        if (this.i || (progressBar = this.f21400a) == null) {
            return;
        }
        if (i == 100) {
            progressBar.setVisibility(8);
            return;
        }
        if (progressBar.getVisibility() == 8) {
            this.f21400a.setVisibility(0);
        }
        this.f21400a.setProgress(i);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.w
    public void a() {
        PureNetworkLoadStatusView pureNetworkLoadStatusView;
        int i;
        if (this.f21401b == null) {
            return;
        }
        if (ab.h(getContext())) {
            pureNetworkLoadStatusView = this.f21401b;
            i = -1;
        } else {
            pureNetworkLoadStatusView = this.f21401b;
            i = -2;
        }
        pureNetworkLoadStatusView.setState(i);
    }

    private void c(Context context) {
        hw.b("PureWebView", "safeInitPureWebView");
        try {
            if (!context.isDeviceProtectedStorage()) {
                hw.b("PureWebView", "context is not in DeviceProtectedStorage.");
                inflate(context, R.layout.pure_web_layout, this);
                this.f21402c = (WebView) findViewById(R.id.content_webview);
                return;
            }
            inflate(context, R.layout.pure_web_layout_without_webview, this);
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.replace_layout);
            Context context2 = (Context) cr.a(context, "createCredentialProtectedStorageContext", (Class<?>[]) null, (Object[]) null);
            WebView webView = new WebView(context2);
            this.f21402c = webView;
            webView.setVerticalScrollBarEnabled(true);
            this.f21402c.setClipToPadding(true);
            if (Build.VERSION.SDK_INT >= 29) {
                this.f21402c.setVerticalScrollbarThumbDrawable(context2.getDrawable(R.drawable.hiad_scrollbar_thumb));
            }
            this.f21402c.setId(R.id.content_webview);
            linearLayout.addView(this.f21402c, new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th) {
            hw.c("PureWebView", "safe init pure web view err: %s.", th.getClass().getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, long j) {
        hw.a("PureWebView", "startLoad");
        this.j = 0;
        PureNetworkLoadStatusView pureNetworkLoadStatusView = this.f21401b;
        if (pureNetworkLoadStatusView != null) {
            pureNetworkLoadStatusView.setState(1);
        }
        WebView webView = this.f21402c;
        if (webView != null) {
            webView.setVisibility(4);
        }
        if (j > 0) {
            a(j);
        }
        this.e.a(str, getWebView());
    }

    private void b(Context context) {
        hw.b("PureWebView", "initPureWebView.");
        try {
            hw.b("PureWebView", "api version is %s.", Integer.valueOf(Build.VERSION.SDK_INT));
            c(context);
        } catch (Throwable th) {
            hw.c("PureWebView", "init pure web view err: %s.", th.getClass().getSimpleName());
        }
    }

    private void a(Context context) {
        b(context);
        this.f21400a = (ProgressBar) findViewById(R.id.web_progress);
        this.f21401b = (PureNetworkLoadStatusView) findViewById(R.id.status_view);
        this.l = new c(this);
        PureNetworkLoadStatusView pureNetworkLoadStatusView = this.f21401b;
        if (pureNetworkLoadStatusView != null) {
            pureNetworkLoadStatusView.setState(1);
            this.f21401b.setOnEmptyClickListener(this);
            this.f21401b.setClickable(true);
            this.f21401b.setOnConfigurationChangedListener(this);
        }
        this.e = new od(context, this);
        this.f21402c.setWebChromeClient(new b());
        WebView webView = this.f21402c;
        com.huawei.openalliance.ad.views.web.c cVar = new com.huawei.openalliance.ad.views.web.c(this);
        this.f = cVar;
        webView.setWebViewClient(cVar);
        this.f.a(this.e);
    }

    private void a(long j) {
        if (this.g == null) {
            this.g = new Handler(Looper.getMainLooper());
        }
        this.g.removeCallbacks(this.l);
        this.g.postDelayed(this.l, j);
    }

    /* JADX INFO: loaded from: classes41.dex */
    class b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            PureWebView.this.a(i);
            super.onProgressChanged(webView, i);
        }

        private b() {
        }
    }

    public PureWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = false;
        a(context);
    }

    /* JADX INFO: loaded from: classes41.dex */
    static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<PureWebView> f21409a;

        @Override // java.lang.Runnable
        public void run() {
            PureWebView pureWebView = this.f21409a.get();
            if (pureWebView != null && pureWebView.j < 100) {
                pureWebView.a();
                if (pureWebView.f21402c != null) {
                    pureWebView.f21402c.stopLoading();
                }
            }
        }

        public c(PureWebView pureWebView) {
            this.f21409a = new WeakReference<>(pureWebView);
        }
    }

    public PureWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = false;
    }

    public PureWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = false;
        a(context);
    }

    public PureWebView(Context context) {
        super(context);
        this.i = false;
        a(context);
    }
}
