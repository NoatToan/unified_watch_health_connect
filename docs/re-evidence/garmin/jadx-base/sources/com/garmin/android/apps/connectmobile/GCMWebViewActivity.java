package com.garmin.android.apps.connectmobile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewTreeObserver;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public class GCMWebViewActivity extends k0 implements dv.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f28675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WebView f28676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Menu f28677g;

    public class a extends WebChromeClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ProgressBar f28678a;

        public a(ProgressBar progressBar) {
            this.f28678a = progressBar;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i14) {
            ProgressBar progressBar = this.f28678a;
            progressBar.setVisibility(0);
            progressBar.setProgress(0);
            GCMWebViewActivity gCMWebViewActivity = GCMWebViewActivity.this;
            gCMWebViewActivity.setProgress(i14 * 100);
            progressBar.incrementProgressBy(i14);
            if (i14 == 100) {
                progressBar.setVisibility(4);
                gCMWebViewActivity.ca();
            }
        }
    }

    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
            Menu menu;
            boolean zIsEmpty = TextUtils.isEmpty(webView.getTitle());
            GCMWebViewActivity gCMWebViewActivity = GCMWebViewActivity.this;
            if (!zIsEmpty) {
                gCMWebViewActivity.setTitle(webView.getTitle());
            }
            if (gCMWebViewActivity.f28676f == null || (menu = gCMWebViewActivity.f28677g) == null) {
                return;
            }
            MenuItem menuItemFindItem = menu.findItem(R.id.web_view_back);
            if (menuItemFindItem != null) {
                menuItemFindItem.setIcon(gCMWebViewActivity.f28676f.canGoBack() ? 2131232206 : 2131232207);
            }
            MenuItem menuItemFindItem2 = gCMWebViewActivity.f28677g.findItem(R.id.web_view_forward);
            if (menuItemFindItem2 != null) {
                menuItemFindItem2.setIcon(gCMWebViewActivity.f28676f.canGoForward() ? 2131232208 : 2131232209);
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return false;
        }
    }

    public class c extends WebViewClient {
        public c(GCMWebViewActivity gCMWebViewActivity) {
        }
    }

    public class d implements ViewTreeObserver.OnScrollChangedListener {
        public d() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            GCMWebViewActivity gCMWebViewActivity = GCMWebViewActivity.this;
            if (gCMWebViewActivity.f28676f.getScrollY() == 0) {
                gCMWebViewActivity.ea(true);
            } else {
                gCMWebViewActivity.ea(false);
            }
        }
    }

    public static void fa(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) GCMWebViewActivity.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        context.startActivity(intent);
    }

    @Override // com.garmin.android.apps.connectmobile.k0
    public final void da() {
        WebView webView = this.f28676f;
        if (webView != null) {
            webView.reload();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (this.f28676f.canGoBack()) {
            this.f28676f.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_web_view_activity_layout);
        String string = "";
        String string2 = (getIntent().getExtras() == null || getIntent().getExtras().getString("title") == null) ? "" : getIntent().getExtras().getString("title");
        if (getIntent().getExtras() != null && getIntent().getExtras().getString("url") != null) {
            string = getIntent().getExtras().getString("url");
        }
        initActionBar(string2, 3);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        WebView webView = (WebView) findViewById(R.id.web_view);
        this.f28676f = webView;
        WebSettings settings = webView.getSettings();
        boolean z14 = true;
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        this.f28676f.getSettings().setBuiltInZoomControls(true);
        this.f28676f.getSettings().setDisplayZoomControls(false);
        WebView webView2 = this.f28676f;
        webView2.getClass();
        Context context = webView2.getContext();
        context.getClass();
        int i14 = c22.n.f23166a[((r22.z1) KoinJavaComponent.get$default(r22.z1.class, null, null, 6, null)).a().ordinal()];
        if (i14 != 1 && (i14 == 2 || (context.getResources().getConfiguration().uiMode & 48) != 32)) {
            z14 = false;
        }
        if (je.c.a("ALGORITHMIC_DARKENING")) {
            WebSettings settings2 = webView2.getSettings();
            if (!ke.g.f104531a.c()) {
                org.apache.commons.lang3.e.w("This method is not supported by the current version of the framework and the current WebView APK");
                return;
            }
            je.a.a(settings2).a(z14);
        }
        this.f28676f.setWebChromeClient(new a(progressBar));
        this.f28676f.setWebViewClient(new b());
        this.f28676f.loadUrl(string);
        this.f28676f.setWebViewClient(new c(this));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.web_view_menu, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.home) {
            finish();
        }
        if (itemId == R.id.web_view_back && this.f28676f.canGoBack()) {
            this.f28676f.goBack();
            return true;
        }
        if (itemId != R.id.web_view_forward || !this.f28676f.canGoForward()) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f28676f.goForward();
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        this.f28677g = menu;
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        ViewTreeObserver viewTreeObserver = this.f28676f.getViewTreeObserver();
        d dVar = new d();
        this.f28675e = dVar;
        viewTreeObserver.addOnScrollChangedListener(dVar);
    }

    @Override // com.garmin.android.apps.connectmobile.k0, com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.f28676f.getViewTreeObserver().removeOnScrollChangedListener(this.f28675e);
    }
}
