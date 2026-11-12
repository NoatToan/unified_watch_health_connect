package com.huami.watch.companion.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.huami.watch.companion.R;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public class WebActivity extends Activity {
    private static final String e = "WebActivity";
    private ProgressBar a;
    private ActionbarLayout b;
    private String c;
    private boolean d;
    public WebView mWebView;

    public static class AppWebClient extends WebViewClient {
        public WeakReference<WebActivity> mWebActivity;

        public AppWebClient(WebActivity webActivity) {
            this.mWebActivity = new WeakReference<>(webActivity);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            WebActivity webActivity = this.mWebActivity.get();
            if (webActivity == null) {
                return;
            }
            webActivity.a.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebActivity webActivity = this.mWebActivity.get();
            if (webActivity == null) {
                return;
            }
            webActivity.a.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            WebActivity webActivity = this.mWebActivity.get();
            if (webActivity == null) {
                return;
            }
            webActivity.a.setVisibility(4);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WebActivity.this.onBackPressed();
        }
    }

    public class b implements DownloadListener {
        public b() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            WebActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    public class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            WebActivity.this.a.setProgress(i + 5);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (WebActivity.this.d) {
                WebActivity.this.b.setTitleText(str);
            }
        }
    }

    private void d(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        String userAgentString = settings.getUserAgentString();
        Log.d(e, "UserAgent before : " + userAgentString, new Object[0]);
        if (userAgentString.contains(" wv")) {
            settings.setUserAgentString(userAgentString.replace(" wv", ""));
        } else {
            settings.setUserAgentString(userAgentString.replace("Version/", "xxx/"));
        }
        Log.d(e, "UserAgent after : " + userAgentString, new Object[0]);
    }

    public static void open(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) WebActivity.class);
        intent.putExtra("webtitle", str);
        intent.putExtra("url", str2);
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_webview);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        this.b = actionbarLayout;
        actionbarLayout.setBackArrowClickListener(new a());
        Intent intent = getIntent();
        if (intent != null) {
            CharSequence charSequenceExtra = intent.getCharSequenceExtra("webtitle");
            this.c = intent.getCharSequenceExtra("url").toString();
            if (charSequenceExtra != null) {
                this.b.setTitleText(charSequenceExtra.toString());
            }
            this.d = intent.getBooleanExtra("showHtmlTitle", false);
        }
        WebView webView = new WebView(getApplicationContext());
        this.mWebView = webView;
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mWebView.setBackgroundColor(getResources().getColor(R.color.white));
        ((ViewGroup) findViewById(R.id.container)).addView(this.mWebView, 0);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.web_view_progress);
        this.a = progressBar;
        if (Build.VERSION.SDK_INT < 21) {
            progressBar.getProgressDrawable().setColorFilter(getResources().getColor(R.color.dark_red), PorterDuff.Mode.SRC_IN);
            this.a.setBackgroundColor(Color.parseColor("#00ffffff"));
        }
        d(this.mWebView);
        this.mWebView.setLayerType(1, null);
        this.mWebView.setBackgroundColor(0);
        this.mWebView.setWebViewClient(new AppWebClient(this));
        this.mWebView.setDownloadListener(new b());
        this.mWebView.setWebChromeClient(new c());
        Log.f().d(e, "Load : " + this.c, new Object[0]);
        this.mWebView.loadUrl(this.c);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.mWebView.destroy();
        this.mWebView.setWebViewClient(null);
        this.mWebView.setWebChromeClient(null);
        this.mWebView.setDownloadListener(null);
        this.mWebView.setOnLongClickListener(null);
        this.mWebView.removeAllViews();
        ((ViewGroup) this.mWebView.getParent()).removeView(this.mWebView);
        this.mWebView = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.mWebView.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.mWebView.goBack();
        return true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Analytics.endSession(this);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Analytics.startSession(this);
    }
}
