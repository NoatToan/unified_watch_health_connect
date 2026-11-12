package com.huawei.opendevice.open;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toolbar;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.analysis.i;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.ab;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bp;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.dw;
import com.huawei.openalliance.ad.utils.dy;
import com.huawei.openalliance.ad.views.interfaces.w;
import com.huawei.openalliance.ad.views.web.NetworkLoadStatusView;
import defpackage.ohk;
import defpackage.ohl;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes41.dex */
public abstract class a extends com.huawei.openalliance.ad.activity.f implements w, NetworkLoadStatusView.a, com.huawei.opendevice.open.c, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected WebView f21516a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NetworkLoadStatusView f21518c;
    private View d;
    private ProgressBar e;
    private String f;
    private WebChromeClient g = new c();
    private boolean h = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ohl f21517b = new ohl();

    private void j() {
    }

    protected void a(com.huawei.opendevice.open.c cVar) {
    }

    protected String d() {
        return null;
    }

    protected int e() {
        return 0;
    }

    protected boolean f() {
        return true;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.w
    public Context getContext() {
        return this;
    }

    protected int h() {
        return 0;
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f21517b != null) {
            if (hw.a()) {
                hw.a("BaseWebActivity", "onResume, record privacy open time.");
            }
            this.f21517b.e(as.c());
        }
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f21517b != null) {
            if (hw.a()) {
                hw.a("BaseWebActivity", "onPause, record privacy close time.");
            }
            this.f21517b.d(as.c());
            this.f21517b.a(d());
        }
        new i(getApplicationContext()).a(this.f21517b);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        StringBuilder sb;
        try {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            super.onBackPressed();
            return true;
        } catch (RuntimeException e2) {
            e = e2;
            sb = new StringBuilder("onOptionsItemSelected ");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseWebActivity", sb.toString());
            return false;
        } catch (Throwable th) {
            e = th;
            sb = new StringBuilder("onOptionsItemSelected ex: ");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseWebActivity", sb.toString());
            return false;
        }
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        hw.b("BaseWebActivity", "onKeyDown");
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ohk.a((f) null);
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        StringBuilder sb;
        bp.a(this);
        dk.h(this);
        super.onCreate(bundle);
        this.h = cc.b(this);
        try {
            a(this, 1);
            setContentView(e());
            i();
            j();
            dk.a(this.d, this);
        } catch (RuntimeException e2) {
            e = e2;
            sb = new StringBuilder("onCreate ");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseWebActivity", sb.toString());
        } catch (Throwable th) {
            e = th;
            sb = new StringBuilder("onCreate ex: ");
            sb.append(e.getClass().getSimpleName());
            hw.c("BaseWebActivity", sb.toString());
        }
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.uiMode & 48;
        hw.b("BaseWebActivity", "currentNightMode=" + i);
        a(32 == i ? 2 : 0);
    }

    @Override // com.huawei.openalliance.ad.views.web.NetworkLoadStatusView.a
    public void onClick(final View view) {
        dq.a(new Runnable() { // from class: com.huawei.opendevice.open.a.3
            @Override // java.lang.Runnable
            public void run() {
                if (view.getId() == R.id.privacy_set_network) {
                    Intent intent = new Intent("android.settings.WIFI_SETTINGS");
                    intent.setFlags(268435456);
                    dk.a(a.this, intent);
                } else {
                    if (!ab.h(a.this) || a.this.f21516a == null) {
                        return;
                    }
                    a.this.f21516a.loadUrl(a.this.f);
                }
            }
        });
    }

    @Override // com.huawei.opendevice.open.c
    public void g() {
        hw.d("BaseWebActivity", "onGrsFailed");
        dq.a(new Runnable() { // from class: com.huawei.opendevice.open.a.1
            @Override // java.lang.Runnable
            public void run() {
                a.this.a();
            }
        });
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.w
    public void c() {
        NetworkLoadStatusView networkLoadStatusView = this.f21518c;
        if (networkLoadStatusView == null) {
            return;
        }
        if (networkLoadStatusView.getCurrentState() == 1 && ab.h(this)) {
            this.f21518c.setState(0);
        }
        this.f21518c.setState(1);
    }

    @Override // com.huawei.opendevice.open.c
    public void a(final String str) {
        hw.b("BaseWebActivity", "onGrsSuccess");
        this.f = str;
        dq.a(new Runnable() { // from class: com.huawei.opendevice.open.a.2
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f21516a != null) {
                    a.this.f21516a.loadUrl(str);
                }
            }
        });
    }

    @Override // com.huawei.opendevice.open.f
    public void a(ohl ohlVar) {
        hw.b("BaseWebActivity", "onPrivacyInfoUpdate.");
        this.f21517b.d(ohlVar);
    }

    protected void a(WebView webView) {
        dy.a(webView);
        onConfigurationChanged(getResources().getConfiguration());
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.w
    public void a() {
        NetworkLoadStatusView networkLoadStatusView;
        int i;
        if (this.f21518c == null) {
            return;
        }
        if (ab.h(this)) {
            networkLoadStatusView = this.f21518c;
            i = -1;
        } else {
            networkLoadStatusView = this.f21518c;
            i = -2;
        }
        networkLoadStatusView.setState(i);
    }

    /* JADX INFO: renamed from: com.huawei.opendevice.open.a$a, reason: collision with other inner class name */
    public static class C0250a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Context f21526c;

        @JavascriptInterface
        public boolean showMore() {
            if (!"true".equalsIgnoreCase(dk.a("hw_sc.anco.enable"))) {
                return cc.g(this.f21526c) && ab.c();
            }
            hw.b("BaseWebActivity", "system is anco, don't show more");
            return false;
        }

        @JavascriptInterface
        public String queryThemeColor() {
            String strS = dk.s(this.f21526c);
            return TextUtils.isEmpty(strS) ? "#FF007DFF" : strS;
        }

        @JavascriptInterface
        public int queryApiLevel() {
            return Build.VERSION.SDK_INT;
        }

        @JavascriptInterface
        public boolean isEMuiVersion10() {
            return ab.c();
        }

        @JavascriptInterface
        public boolean isDarkMode() {
            return dk.r(this.f21526c);
        }

        @JavascriptInterface
        public String getPkgName() {
            return this.f21526c.getPackageName();
        }

        public C0250a(Context context) {
            this.f21526c = context;
        }
    }

    private void i() {
        ActionBar actionBar = getActionBar();
        if (actionBar != null && f()) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            if (h() != 0) {
                if (this.h) {
                    actionBar.setTitle(h());
                } else {
                    View viewInflate = getLayoutInflater().inflate(R.layout.action_bar_title_layout, (ViewGroup) null);
                    actionBar.setDisplayShowTitleEnabled(false);
                    actionBar.setDisplayShowCustomEnabled(true);
                    actionBar.setCustomView(viewInflate);
                    a(viewInflate);
                    ((TextView) findViewById(R.id.custom_action_bar_title)).setText(h());
                }
            }
        }
        this.d = findViewById(R.id.content_statement);
        this.f21516a = (WebView) findViewById(R.id.content_webview);
        this.e = (ProgressBar) findViewById(R.id.web_progress);
        b(this.f21516a);
        a(this.f21516a);
        com.huawei.openalliance.ad.views.web.e eVar = new com.huawei.openalliance.ad.views.web.e(this);
        eVar.a(this.e);
        WebView webView = this.f21516a;
        if (webView != null) {
            webView.setWebChromeClient(this.g);
            this.f21516a.setWebViewClient(eVar);
            this.f21516a.addJavascriptInterface(new C0250a(getContext()), Constants.HW_PPS_PRIVACY_JS_NAME);
        }
        a((com.huawei.opendevice.open.c) this);
        ohk.a(new e(this));
        NetworkLoadStatusView networkLoadStatusView = (NetworkLoadStatusView) findViewById(R.id.status_view);
        this.f21518c = networkLoadStatusView;
        if (networkLoadStatusView != null) {
            networkLoadStatusView.setState(1);
            this.f21518c.setOnEmptyClickListener(this);
            this.f21518c.setClickable(true);
        }
    }

    private void b(WebView webView) {
        if (webView == null) {
            return;
        }
        webView.setBackgroundColor(0);
    }

    class c extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            dw.a(a.this.e, i);
            super.onProgressChanged(webView, i);
        }

        private c() {
        }
    }

    private void a(final View view) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            final Toolbar toolbar = (Toolbar) view.getParent();
            if (toolbar != null) {
                toolbar.setLayoutParams(layoutParams);
            }
            view.post(new Runnable() { // from class: com.huawei.opendevice.open.a.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        TypedValue typedValue = new TypedValue();
                        int iMax = Math.max(view.getHeight(), a.this.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, a.this.getResources().getDisplayMetrics()) : 0);
                        if (iMax > 0) {
                            toolbar.setMinimumHeight(iMax);
                        }
                    } catch (Throwable unused) {
                        hw.c("BaseWebActivity", "set toolBar min height error.");
                    }
                }
            });
        } catch (Throwable unused) {
            hw.c("BaseWebActivity", "setCustomToolBar error.");
        }
    }

    private void a(Activity activity, int i) {
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        try {
            attributes.getClass().getDeclaredField(ParamConstants.Param.LAYOUT_IN_DISPLAY_CUTOUT_MODE).setInt(attributes, i);
            activity.getWindow().setAttributes(attributes);
        } catch (Throwable unused) {
            hw.c("BaseWebActivity", "setLayoutMode error");
        }
    }

    static class e implements f {
        private WeakReference<f> d;

        @Override // com.huawei.opendevice.open.f
        public void a(ohl ohlVar) {
            f fVar = this.d.get();
            if (fVar != null) {
                fVar.a(ohlVar);
            }
        }

        public e(f fVar) {
            this.d = new WeakReference<>(fVar);
        }
    }

    private void a(int i) {
        WebView webView;
        WebSettings settings;
        if (Build.VERSION.SDK_INT < 29 || (webView = this.f21516a) == null || (settings = webView.getSettings()) == null) {
            return;
        }
        settings.setForceDark(i);
    }
}
