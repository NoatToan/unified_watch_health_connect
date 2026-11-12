package com.huawei.phoneservice.websurvey.ui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.huawei.operation.utils.Constants;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.util.IntentCheckUtils;
import com.huawei.phoneservice.faq.base.util.g;
import com.huawei.phoneservice.faq.base.util.q;
import com.huawei.phoneservice.faq.base.util.s;
import com.huawei.phoneservice.websurvey.R;
import com.huawei.phoneservice.websurvey.widget.NpsNoticeView;

/* JADX INFO: loaded from: classes13.dex */
public abstract class NpsBaseWebActivity extends NpsBaseActivity {
    protected String d;
    protected com.huawei.phoneservice.websurvey.jsInterface.b e;
    protected WebView f;
    protected NpsNoticeView g;
    private ViewGroup h;
    private ValueCallback<Uri> m;
    private ValueCallback<Uri[]> n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f21986c = false;
    protected Handler i = new Handler();
    public boolean j = false;
    private int k = 0;
    private String l = "";
    private final WebChromeClient o = new AnonymousClass1();
    private final WebViewClient p = new d();

    public abstract void a(int i);

    public abstract void a(String str);

    protected void r() {
        WebSettings settings = this.f.getSettings();
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
        s.b(this.f);
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        this.f.setHorizontalScrollBarEnabled(false);
        this.f.setWebViewClient(this.p);
        this.f.setWebChromeClient(this.o);
        this.f.setBackgroundColor(getResources().getColor(R.color.emui_color_subbg));
    }

    public String q() {
        return this.l;
    }

    protected boolean p() {
        if (this.f == null || !TextUtils.equals(q(), "h5_nps_is_block")) {
            return false;
        }
        int i = this.k + 1;
        this.k = i;
        if (i >= 3) {
            return false;
        }
        this.f.evaluateJavascript("onH5NpsDialog('')", null);
        g.e("NpsBaseWebActivity", "H5 NPS on Back is Block " + this.k);
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        WebView webView = this.f;
        if (webView != null) {
            webView.onResume();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        WebView webView = this.f;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // com.huawei.phoneservice.websurvey.ui.AbstractBaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        init();
        g();
        f();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (p()) {
                return true;
            }
            if (this.f.canGoBack()) {
                if (this.f21986c) {
                    this.f.setVisibility(8);
                    this.f.clearView();
                    this.f.removeAllViews();
                    this.g.setVisibility(8);
                }
                this.f.goBack();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.huawei.phoneservice.websurvey.ui.AbstractBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ViewGroup viewGroup;
        WebView webView = this.f;
        if (webView != null && webView.getParent() != null && (viewGroup = this.h) != null) {
            viewGroup.removeView(this.f);
        }
        s.e(this.f);
        Window window = getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            if (decorView instanceof ViewGroup) {
                ((ViewGroup) decorView).removeAllViews();
            }
        }
        this.i.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // com.huawei.phoneservice.websurvey.ui.NpsBaseActivity, com.huawei.phoneservice.websurvey.ui.AbstractBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        init();
        setTitle("");
        super.onCreate(bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (p()) {
            return;
        }
        if (!this.f.canGoBack()) {
            super.onBackPressed();
            return;
        }
        if (this.f21986c) {
            this.f.setVisibility(8);
            this.f.clearView();
            this.f.removeAllViews();
            this.g.setVisibility(8);
        }
        this.f.goBack();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent == null) {
            a(i, i2);
        } else {
            a(i, i2, intent);
        }
    }

    protected void init() {
        this.f21986c = false;
        this.d = null;
    }

    @Override // com.huawei.phoneservice.websurvey.ui.AbstractBaseActivity
    protected void h() {
        this.h = (ViewGroup) findViewById(android.R.id.content);
        this.g = (NpsNoticeView) findViewById(R.id.notice_view);
        this.f = (WebView) findViewById(R.id.common_web_view);
        r();
    }

    @Override // com.huawei.phoneservice.websurvey.ui.AbstractBaseActivity
    protected void g() {
        NpsNoticeView npsNoticeView = this.g;
        if (npsNoticeView != null) {
            npsNoticeView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.phoneservice.websurvey.ui.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21989a.a(view);
                }
            });
        }
    }

    public void b(String str) {
        this.l = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        f();
    }

    /* JADX INFO: renamed from: com.huawei.phoneservice.websurvey.ui.NpsBaseWebActivity$1, reason: invalid class name */
    class AnonymousClass1 extends WebChromeClient {
        /* JADX INFO: renamed from: lambda$onReceivedTitle$0$com-huawei-phoneservice-websurvey-ui-NpsBaseWebActivity$1, reason: not valid java name */
        /* synthetic */ void m1647xcac3711f(String str) {
            NpsBaseWebActivity.this.setTitle(str);
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
            String str3;
            NpsBaseWebActivity.this.m = valueCallback;
            Intent intentCreateGalleryIntent = IntentCheckUtils.createGalleryIntent(NpsBaseWebActivity.this.getApplicationContext());
            if (intentCreateGalleryIntent == null) {
                str3 = "GalleryIntent is null";
            } else {
                try {
                    NpsBaseWebActivity.this.startActivityForResult(Intent.createChooser(intentCreateGalleryIntent, "choose image"), 0);
                    return;
                } catch (ActivityNotFoundException unused) {
                    str3 = "choose image openFileChooser failed";
                }
            }
            g.c("NpsBaseWebActivity", str3);
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
            String str2;
            NpsBaseWebActivity.this.m = valueCallback;
            Intent intentCreateGalleryIntent = IntentCheckUtils.createGalleryIntent(NpsBaseWebActivity.this.getApplicationContext());
            if (intentCreateGalleryIntent == null) {
                str2 = "GalleryIntent is null";
            } else {
                try {
                    NpsBaseWebActivity.this.startActivityForResult(Intent.createChooser(intentCreateGalleryIntent, "choose image"), 0);
                    return;
                } catch (ActivityNotFoundException unused) {
                    str2 = "choose image openFileChooser failed";
                }
            }
            g.c("NpsBaseWebActivity", str2);
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback) {
            String str;
            NpsBaseWebActivity.this.m = valueCallback;
            Intent intentCreateGalleryIntent = IntentCheckUtils.createGalleryIntent(NpsBaseWebActivity.this.getApplicationContext());
            if (intentCreateGalleryIntent == null) {
                str = "GalleryIntent is null";
            } else {
                try {
                    NpsBaseWebActivity.this.startActivityForResult(Intent.createChooser(intentCreateGalleryIntent, "choose image"), 0);
                    return;
                } catch (ActivityNotFoundException unused) {
                    str = "choose image openFileChooser failed";
                }
            }
            g.c("NpsBaseWebActivity", str);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            String str;
            if (NpsBaseWebActivity.this.n != null) {
                NpsBaseWebActivity.this.n.onReceiveValue(null);
            }
            NpsBaseWebActivity.this.n = valueCallback;
            Intent intentCreateGalleryIntent = IntentCheckUtils.createGalleryIntent(NpsBaseWebActivity.this.getApplicationContext());
            if (intentCreateGalleryIntent == null) {
                str = "GalleryIntent is null";
            } else {
                try {
                    NpsBaseWebActivity.this.startActivityForResult(intentCreateGalleryIntent, 100);
                    return true;
                } catch (ActivityNotFoundException unused) {
                    NpsBaseWebActivity.this.n = null;
                    str = "exception happend!";
                }
            }
            g.c("NpsBaseWebActivity", str);
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, final String str) {
            if (!com.huawei.phoneservice.faq.base.util.d.c(NpsBaseWebActivity.this) || TextUtils.isEmpty(str) || NpsBaseWebActivity.this.f21986c || s.c(str) || Constants.ABOUT_BLANK.equals(str)) {
                return;
            }
            NpsBaseWebActivity.this.i.removeCallbacksAndMessages(null);
            NpsBaseWebActivity npsBaseWebActivity = NpsBaseWebActivity.this;
            if (npsBaseWebActivity.j) {
                npsBaseWebActivity.setTitle(str);
            } else {
                npsBaseWebActivity.i.postDelayed(new Runnable() { // from class: com.huawei.phoneservice.websurvey.ui.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21992b.m1647xcac3711f(str);
                    }
                }, 1000L);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            NpsBaseWebActivity.this.a(i);
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            return new TextView(NpsBaseWebActivity.this);
        }

        AnonymousClass1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        if (q.b(view)) {
            return;
        }
        this.f.clearView();
        this.f.removeAllViews();
        this.g.e(NpsNoticeView.b.PROGRESS);
        this.i.postDelayed(new Runnable() { // from class: com.huawei.phoneservice.websurvey.ui.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f21991c.s();
            }
        }, 500L);
    }

    private void a(int i, int i2, Intent intent) {
        if (i == 0) {
            if (this.m == null) {
                return;
            }
            this.m.onReceiveValue(i2 == -1 ? intent.getData() : null);
            this.m = null;
            return;
        }
        if (i != 100 || this.n == null) {
            return;
        }
        if (s.d(getApplicationContext(), intent.getData())) {
            this.n.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, intent));
        } else {
            this.n.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, null));
        }
        this.n = null;
    }

    class d extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            s.e(sslErrorHandler);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            NpsNoticeView npsNoticeView;
            FaqConstants.FaqErrorCode faqErrorCode;
            super.onReceivedError(webView, i, str, str2);
            NpsBaseWebActivity npsBaseWebActivity = NpsBaseWebActivity.this;
            npsBaseWebActivity.f21986c = true;
            npsBaseWebActivity.g.setVisibility(0);
            if (com.huawei.phoneservice.faq.base.util.d.c(NpsBaseWebActivity.this)) {
                npsNoticeView = NpsBaseWebActivity.this.g;
                faqErrorCode = FaqConstants.FaqErrorCode.CONNECT_SERVER_ERROR;
            } else {
                npsNoticeView = NpsBaseWebActivity.this.g;
                faqErrorCode = FaqConstants.FaqErrorCode.INTERNET_ERROR;
            }
            npsNoticeView.d(faqErrorCode);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            NpsBaseWebActivity npsBaseWebActivity = NpsBaseWebActivity.this;
            npsBaseWebActivity.f21986c = false;
            npsBaseWebActivity.d = str;
            npsBaseWebActivity.a(str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            NpsBaseWebActivity npsBaseWebActivity = NpsBaseWebActivity.this;
            if (npsBaseWebActivity.f21986c) {
                return;
            }
            npsBaseWebActivity.f.setVisibility(0);
            NpsBaseWebActivity.this.g.setVisibility(8);
        }

        d() {
        }
    }

    private void a(int i, int i2) {
        ValueCallback<Uri[]> valueCallback;
        if (i == 0) {
            ValueCallback<Uri> valueCallback2 = this.m;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(null);
                this.m = null;
                return;
            }
            return;
        }
        if (i != 100 || (valueCallback = this.n) == null) {
            return;
        }
        valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, null));
        this.n = null;
    }
}
