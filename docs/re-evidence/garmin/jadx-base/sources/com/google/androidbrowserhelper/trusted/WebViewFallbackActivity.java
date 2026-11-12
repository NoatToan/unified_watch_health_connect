package com.google.androidbrowserhelper.trusted;

import a7.b;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.google.common.net.HttpHeaders;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import r.e;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class WebViewFallbackActivity extends Activity {
    private static final String KEY_EXTRA_ORIGINS = "com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_EXTRA_ORIGINS";
    private static final String KEY_LAUNCH_URI = "com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.LAUNCH_URL";
    private static final String KEY_NAVIGATION_BAR_COLOR = "com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_NAVIGATION_BAR_COLOR";
    private static final String KEY_PREFIX = "com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.";
    private static final String KEY_STATUS_BAR_COLOR = "com.google.browser.examples.twawebviewfallback.WebViewFallbackActivity.KEY_STATUS_BAR_COLOR";
    private static final String TAG = "WebViewFallbackActivity";
    private List<Uri> mExtraOrigins = new ArrayList();
    private Uri mLaunchUrl;
    private int mStatusBarColor;
    private WebView mWebView;

    public static Intent createLaunchIntent(Context context, Uri uri, LauncherActivityMetadata launcherActivityMetadata) {
        Intent intent = new Intent(context, (Class<?>) WebViewFallbackActivity.class);
        intent.putExtra(KEY_LAUNCH_URI, uri);
        intent.putExtra(KEY_STATUS_BAR_COLOR, b.getColor(context, launcherActivityMetadata.statusBarColorId));
        intent.putExtra(KEY_NAVIGATION_BAR_COLOR, b.getColor(context, launcherActivityMetadata.navigationBarColorId));
        if (launcherActivityMetadata.additionalTrustedOrigins != null) {
            intent.putStringArrayListExtra(KEY_EXTRA_ORIGINS, new ArrayList<>(launcherActivityMetadata.additionalTrustedOrigins));
        }
        return intent;
    }

    private WebChromeClient createWebViewChromeClient() {
        return new WebChromeClient() { // from class: com.google.androidbrowserhelper.trusted.WebViewFallbackActivity.2
            private View fullScreenView;
            private int originalOrientation;

            @Override // android.webkit.WebChromeClient
            public void onHideCustomView() {
                if (this.fullScreenView == null) {
                    return;
                }
                WebViewFallbackActivity.this.getWindow().clearFlags(1024);
                ((ViewGroup) this.fullScreenView.getParent()).removeView(this.fullScreenView);
                this.fullScreenView = null;
                WebViewFallbackActivity.this.setRequestedOrientation(this.originalOrientation);
            }

            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(View view2, WebChromeClient.CustomViewCallback customViewCallback) {
                if (this.fullScreenView != null) {
                    onHideCustomView();
                }
                this.fullScreenView = view2;
                this.originalOrientation = WebViewFallbackActivity.this.getRequestedOrientation();
                WebViewFallbackActivity.this.getWindow().addFlags(1024);
                WebViewFallbackActivity.this.getWindow().addContentView(this.fullScreenView, new FrameLayout.LayoutParams(-1, -1, 17));
            }
        };
    }

    private WebViewClient createWebViewClient() {
        return new WebViewClient() { // from class: com.google.androidbrowserhelper.trusted.WebViewFallbackActivity.1
            private boolean matchExtraOrigins(Uri uri) {
                Iterator it = WebViewFallbackActivity.this.mExtraOrigins.iterator();
                while (it.hasNext()) {
                    if (uriOriginsMatch((Uri) it.next(), uri)) {
                        return true;
                    }
                }
                return false;
            }

            private boolean shouldOverrideUrlLoading(Uri uri) {
                Uri uri2 = WebViewFallbackActivity.this.mLaunchUrl;
                if (!"data".equals(uri.getScheme()) && !uriOriginsMatch(uri, uri2) && !matchExtraOrigins(uri)) {
                    try {
                        e.d dVar = new e.d();
                        int i14 = WebViewFallbackActivity.this.mStatusBarColor;
                        dVar.f148680b.f148636a = Integer.valueOf(i14 | (-16777216));
                        e eVarA = dVar.a();
                        WebViewFallbackActivity webViewFallbackActivity = WebViewFallbackActivity.this;
                        Intent intent = eVarA.f148677a;
                        intent.setData(uri);
                        b.startActivity(webViewFallbackActivity, intent, eVarA.f148678b);
                        return true;
                    } catch (ActivityNotFoundException unused) {
                        String unused2 = WebViewFallbackActivity.TAG;
                        String.format("ActivityNotFoundException while launching '%s'", uri);
                    }
                }
                return false;
            }

            private boolean uriOriginsMatch(Uri uri, Uri uri2) {
                return uri.getScheme().equalsIgnoreCase(uri2.getScheme()) && uri.getHost().equalsIgnoreCase(uri2.getHost()) && uri.getPort() == uri2.getPort();
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                ViewGroup viewGroup = (ViewGroup) webView.getParent();
                viewGroup.removeView(webView);
                webView.destroy();
                WebViewFallbackActivity.this.mWebView = new WebView(webView.getContext());
                WebViewFallbackActivity.this.mWebView.setWebViewClient(this);
                WebViewFallbackActivity.setupWebSettings(WebViewFallbackActivity.this.mWebView.getSettings());
                viewGroup.addView(WebViewFallbackActivity.this.mWebView);
                Toast.makeText(webView.getContext(), "Recovering from crash", 1).show();
                WebViewFallbackActivity.this.mWebView.loadUrl(WebViewFallbackActivity.this.mLaunchUrl.toString());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                return shouldOverrideUrlLoading(Uri.parse(str));
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                return shouldOverrideUrlLoading(webResourceRequest.getUrl());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    public static void setupWebSettings(WebSettings webSettings) {
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDatabaseEnabled(true);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    public void onCreate(Bundle bundle) {
        ArrayList<String> stringArrayListExtra;
        super.onCreate(bundle);
        Uri uri = (Uri) getIntent().getParcelableExtra(KEY_LAUNCH_URI);
        this.mLaunchUrl = uri;
        if (!"https".equals(uri.getScheme())) {
            h.s("launchUrl scheme must be 'https'");
            return;
        }
        if (getIntent().hasExtra(KEY_NAVIGATION_BAR_COLOR)) {
            getWindow().setNavigationBarColor(getIntent().getIntExtra(KEY_NAVIGATION_BAR_COLOR, 0));
        }
        if (getIntent().hasExtra(KEY_STATUS_BAR_COLOR)) {
            this.mStatusBarColor = getIntent().getIntExtra(KEY_STATUS_BAR_COLOR, 0);
            getWindow().setStatusBarColor(this.mStatusBarColor);
        } else {
            this.mStatusBarColor = getWindow().getStatusBarColor();
        }
        if (getIntent().hasExtra(KEY_EXTRA_ORIGINS) && (stringArrayListExtra = getIntent().getStringArrayListExtra(KEY_EXTRA_ORIGINS)) != null) {
            Iterator<String> it = stringArrayListExtra.iterator();
            while (it.hasNext()) {
                Uri uri2 = Uri.parse(it.next());
                if ("https".equalsIgnoreCase(uri2.getScheme())) {
                    this.mExtraOrigins.add(uri2);
                }
            }
        }
        WebView webView = new WebView(this);
        this.mWebView = webView;
        webView.setWebViewClient(createWebViewClient());
        this.mWebView.setWebChromeClient(createWebViewChromeClient());
        setupWebSettings(this.mWebView.getSettings());
        setContentView(this.mWebView, new ViewGroup.LayoutParams(-1, -1));
        if (bundle != null) {
            this.mWebView.restoreState(bundle);
            return;
        }
        HashMap map = new HashMap();
        map.put(HttpHeaders.REFERER, "android-app://" + getPackageName() + "/");
        this.mWebView.loadUrl(this.mLaunchUrl.toString(), map);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i14, KeyEvent keyEvent) {
        if (i14 != 4 || !this.mWebView.canGoBack()) {
            return super.onKeyDown(i14, keyEvent);
        }
        this.mWebView.goBack();
        return true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        WebView webView = this.mWebView;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        WebView webView = this.mWebView;
        if (webView != null) {
            webView.onResume();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        WebView webView = this.mWebView;
        if (webView != null) {
            webView.saveState(bundle);
        }
    }
}
