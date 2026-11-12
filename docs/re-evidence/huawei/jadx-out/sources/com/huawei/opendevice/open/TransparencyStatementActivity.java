package com.huawei.opendevice.open;

import android.app.ActionBar;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toolbar;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.activity.SafeIntent;
import com.huawei.openalliance.ad.activity.e;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.aa;
import com.huawei.openalliance.ad.utils.ab;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.ds;
import com.huawei.openalliance.ad.views.interfaces.q;
import com.huawei.openalliance.ad.views.web.PureWebView;

/* JADX INFO: loaded from: classes12.dex */
public class TransparencyStatementActivity extends e implements PureWebView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PureWebView f21510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f21511b;
    private String e;
    private boolean d = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21512c = 1;

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onResume() {
        super.onResume();
        int i = this.f21512c;
        if (i == -1 || i == -2) {
            g();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            super.onBackPressed();
            return true;
        } catch (Throwable th) {
            hw.c("Transparency", "onOptionsItemSelected ex: " + th.getClass().getSimpleName());
            return false;
        }
    }

    @Override // com.huawei.openalliance.ad.activity.e, com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean zJ = ab.j(this);
        this.d = zJ;
        if (zJ) {
            setTheme(R.style.HiAdThemeNoActionBarFullScreen);
        }
        super.onCreate(bundle);
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        if (configuration == null) {
            return;
        }
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        if (this.d) {
            c(2);
            return;
        }
        int i = configuration.uiMode & 48;
        hw.b("Transparency", "currentNightMode=" + i);
        if (32 == i) {
            c(2);
        } else {
            c(0);
        }
    }

    protected int d() {
        return R.string.hiad_choices_whythisad;
    }

    @Override // com.huawei.openalliance.ad.views.web.PureWebView.a
    public void a(int i) {
        this.f21512c = i;
        if (this.d && i == 0) {
            dq.a(new Runnable() { // from class: com.huawei.opendevice.open.TransparencyStatementActivity.5
                @Override // java.lang.Runnable
                public void run() {
                    if (TransparencyStatementActivity.this.f21511b != null) {
                        TransparencyStatementActivity.this.f21511b.setVisibility(0);
                    }
                }
            });
        }
    }

    @Override // com.huawei.openalliance.ad.activity.e
    public void a() {
        hw.b("Transparency", "initLayout");
        try {
            e();
            setContentView(R.layout.transparency_activity_layout);
        } catch (Throwable unused) {
            hw.b("Transparency", "set content view error");
        }
        l();
        b();
        i();
        g();
    }

    private void l() {
        if (this.d || !j()) {
            return;
        }
        try {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(134217728);
            window.setNavigationBarColor(getResources().getColor(R.color.hiad_emui_color_subbg));
            window.setStatusBarColor(getResources().getColor(R.color.hiad_emui_color_subbg));
        } catch (Throwable th) {
            hw.c("Transparency", "setStatusAndNavigationBarColor error. %s", th.getClass().getSimpleName());
        }
    }

    private String f() {
        String stringExtra = new SafeIntent(getIntent()).getStringExtra(MapKeyNames.DSA_URL);
        hw.b("Transparency", "statement url:%s", ds.a(stringExtra));
        return stringExtra;
    }

    private void g() {
        if (this.e == null) {
            this.e = f();
        }
        b(this.e);
    }

    private void i() {
        PureWebView pureWebView = (PureWebView) findViewById(R.id.webview);
        this.f21510a = pureWebView;
        if (pureWebView == null) {
            hw.c("Transparency", "get webview error.");
            return;
        }
        pureWebView.setWebViewClient(new b(this.f21510a));
        this.f21510a.setOnLoadFinishedListener(this);
        this.f21510a.setProcessBarNeedHide(this.d);
        this.f21510a.a(new a(this), "HwPPSTransparency");
        Resources resources = getResources();
        if (resources == null) {
            hw.c("Transparency", "resources is null");
        } else {
            onConfigurationChanged(resources.getConfiguration());
        }
    }

    private boolean j() {
        return cc.b(this);
    }

    private void h() {
        ActionBar actionBar = getActionBar();
        if (actionBar == null) {
            return;
        }
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
        if (j()) {
            e(actionBar);
        }
        actionBar.setTitle(d());
    }

    private void c() {
        TextView textView = (TextView) findViewById(R.id.web_appbar_tv);
        this.f21511b = textView;
        if (textView == null) {
            hw.c("Transparency", "get text view failed");
        } else {
            textView.setText(d());
            this.f21511b.setVisibility(8);
        }
    }

    private void b() {
        if (this.d) {
            c();
        } else {
            h();
        }
    }

    private void e() {
        Resources resources;
        int i;
        View decorView = getWindow().getDecorView();
        if (decorView == null) {
            return;
        }
        if (this.d || !j()) {
            resources = getResources();
            i = R.color.emui_color_bg;
        } else {
            resources = getResources();
            i = R.color.hiad_emui_color_subbg;
        }
        decorView.setBackgroundColor(resources.getColor(i));
    }

    private void c(int i) {
        PureWebView pureWebView = this.f21510a;
        if (pureWebView == null || pureWebView.getWebView() == null) {
            hw.b("Transparency", "webView is null");
            return;
        }
        WebSettings settings = this.f21510a.getWebView().getSettings();
        if (settings != null) {
            settings.setForceDark(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String str) {
        dq.a(new Runnable() { // from class: com.huawei.opendevice.open.TransparencyStatementActivity.4
            @Override // java.lang.Runnable
            public void run() {
                if (TransparencyStatementActivity.this.f21510a == null) {
                    return;
                }
                TransparencyStatementActivity.this.f21510a.a(str, 10000L);
            }
        });
    }

    public static class a {
        private final Context e;

        @JavascriptInterface
        public boolean isDarkMode() {
            return dk.r(this.e);
        }

        @JavascriptInterface
        public int getDeviceType() {
            return aa.a(this.e).c();
        }

        public a(Context context) {
            this.e = context;
        }
    }

    class b extends com.huawei.openalliance.ad.views.web.e {
        @Override // com.huawei.openalliance.ad.views.web.e, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!TransparencyStatementActivity.this.d) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            TransparencyStatementActivity.this.b(str);
            return true;
        }

        @Override // com.huawei.openalliance.ad.views.web.e, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            hw.a("Transparency", "WebResourceRequest url=%s", webResourceRequest.getUrl().toString());
            if (!TransparencyStatementActivity.this.d) {
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            TransparencyStatementActivity.this.b(webResourceRequest.getUrl().toString());
            return true;
        }

        public b(q qVar) {
            super(qVar);
        }
    }

    private void e(ActionBar actionBar) {
        View viewInflate = getLayoutInflater().inflate(R.layout.action_bar_title_layout, (ViewGroup) null);
        try {
            try {
                actionBar.setDisplayShowCustomEnabled(true);
                actionBar.setCustomView(viewInflate);
                Toolbar toolbar = (Toolbar) viewInflate.getParent();
                if (toolbar != null) {
                    toolbar.setBackgroundColor(getResources().getColor(R.color.hiad_emui_color_subbg));
                }
            } catch (Throwable unused) {
                hw.c("Transparency", "setCustomToolBar error.");
            }
        } finally {
            viewInflate.setVisibility(8);
            actionBar.setDisplayShowCustomEnabled(false);
        }
    }
}
