package com.huawei.phoneservice.feedback.ui;

import android.R;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.util.IntentCheckUtils;
import com.huawei.phoneservice.faq.base.util.ModuleConfigUtils;
import com.huawei.phoneservice.faq.base.util.g;
import com.huawei.phoneservice.faq.base.util.j;
import com.huawei.phoneservice.faq.base.util.k;
import com.huawei.phoneservice.faq.base.util.q;
import com.huawei.phoneservice.faq.base.util.s;
import com.huawei.phoneservice.feedback.widget.FeedbackNoticeView;
import com.huawei.secure.android.common.intent.SafeIntent;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes41.dex */
public class FeedbackDispatchActivity extends FeedBaseActivity {
    private int i;
    private FeedbackNoticeView k;
    private WebView l;
    private ProgressBar n;
    private ViewGroup o;
    private ValueCallback<Uri> q;
    private e r;
    private ValueCallback<Uri[]> s;
    private boolean t;
    private WebChromeClient.CustomViewCallback u;
    public static final FrameLayout.LayoutParams e = new FrameLayout.LayoutParams(-1, -1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21732b = 2054;
    protected Handler f = new Handler();
    private String j = "com.android.gallery3d";
    private String g = "com.huawei.gallery";
    private String m = null;
    private String p = null;
    private Map<String, String> y = new HashMap();
    private Queue<String> v = new LinkedList();
    private WebChromeClient w = new a();
    private WebViewClient x = new b();
    protected Runnable h = new c();

    protected void b() {
        Queue<String> queue = this.v;
        if (queue == null || queue.size() <= 0) {
            return;
        }
        String strPoll = this.v.poll();
        this.p = strPoll;
        setTitle(strPoll);
    }

    public void e() {
        g.b("FeedDispatchActivity", "onPageTimeOut :" + this.m);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        setTitle(getTitle());
        super.onResume();
        WebView webView = this.l;
        if (webView != null) {
            webView.onResume();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        WebView webView = this.l;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.l.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.t) {
            this.l.setVisibility(8);
            this.l.clearView();
            this.l.removeAllViews();
            this.k.setVisibility(8);
        }
        this.l.goBack();
        b();
        return true;
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedBaseActivity, com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (this.l != null) {
            this.f.removeCallbacks(this.h);
            if (this.l.getParent() != null) {
                this.o.removeView(this.l);
            }
        }
        s.e(this.l);
        Window window = getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            if (decorView instanceof ViewGroup) {
                ((ViewGroup) decorView).removeAllViews();
            }
        }
        super.onDestroy();
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedBaseActivity, com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a();
        if (!TextUtils.isEmpty(this.p)) {
            setTitle(this.p);
        }
        super.onCreate(bundle);
        this.i = getWindow().getDecorView().getSystemUiVisibility();
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        ValueCallback<Uri[]> valueCallback;
        ValueCallback<Uri[]> valueCallback2;
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            if (i == 0) {
                if (this.q != null) {
                    this.q.onReceiveValue(i2 == -1 ? new SafeIntent(intent).getData() : null);
                    this.q = null;
                    return;
                }
                return;
            }
            if (i != 100 || (valueCallback = this.s) == null) {
                return;
            }
            valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, intent));
            this.s = null;
            return;
        }
        if (i == 0) {
            ValueCallback<Uri> valueCallback3 = this.q;
            if (valueCallback3 != null) {
                valueCallback3.onReceiveValue(null);
                this.q = null;
                return;
            }
            return;
        }
        if (i != 100 || (valueCallback2 = this.s) == null) {
            return;
        }
        valueCallback2.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, null));
        this.s = null;
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void n() {
        this.o = (ViewGroup) findViewById(R.id.content);
        this.l = (WebView) findViewById(com.huawei.phoneservice.feedback.R.id.feedback_dispatch_web_view);
        this.n = (ProgressBar) findViewById(com.huawei.phoneservice.feedback.R.id.fbsdkProgressbar);
        this.k = (FeedbackNoticeView) findViewById(com.huawei.phoneservice.feedback.R.id.feedback_dispatch_noticeView);
        c();
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void m() {
        this.k.setOnClickListener(new d());
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void l() {
        String[] feedbackOpenTypeConfig = ModuleConfigUtils.getFeedbackOpenTypeConfig();
        String str = feedbackOpenTypeConfig[0];
        String str2 = feedbackOpenTypeConfig[1];
        if (!com.huawei.phoneservice.faq.base.util.d.c(this)) {
            this.k.e(FaqConstants.FaqErrorCode.INTERNET_ERROR);
            return;
        }
        if (FaqConstants.OPEN_TYPE_OUT.equals(str)) {
            if (!k.b(str2)) {
                Intent intent = new Intent();
                intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent.setData(Uri.parse(str2));
                try {
                    startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    g.a("FeedDispatchActivity", "startActivity Exception");
                }
            }
            finish();
            return;
        }
        if (!FaqConstants.OPEN_TYPE_IN.equals(str) || k.b(str2)) {
            return;
        }
        if (s.a(str2, this)) {
            this.l.loadUrl(str2);
        } else {
            s.a(this, str2, true);
        }
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected int j() {
        return com.huawei.phoneservice.feedback.R.layout.feedback_sdk_dispatch_layout;
    }

    private void c() {
        WebSettings settings = this.l.getSettings();
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
        s.b(this.l);
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        this.l.setHorizontalScrollBarEnabled(false);
        this.l.setWebViewClient(this.x);
        this.l.setWebChromeClient(this.w);
    }

    private void a() {
        this.t = false;
        this.m = null;
        this.p = null;
        SafeIntent safeIntent = new SafeIntent(getIntent());
        try {
            if (!TextUtils.isEmpty(safeIntent.getStringExtra("url"))) {
                this.m = safeIntent.getStringExtra("url");
            }
            if (safeIntent.getIntExtra("title", 0) != 0) {
                this.p = getResources().getString(safeIntent.getIntExtra("title", 0));
            }
            if (!TextUtils.isEmpty(this.p) || TextUtils.isEmpty(safeIntent.getStringExtra("title"))) {
                return;
            }
            this.p = safeIntent.getStringExtra("title");
        } catch (Resources.NotFoundException | ClassCastException e2) {
            g.c("FeedDispatchActivity", e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.l.getSettings().setJavaScriptEnabled(false);
            this.t = true;
        } else {
            this.l.getSettings().setJavaScriptEnabled(true);
            s.c(this.l);
            this.t = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        getWindow().getDecorView().setSystemUiVisibility(z ? this.i : f21732b);
        getWindow().setFlags(z ? 0 : 1024, 1024);
    }

    class a extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (FeedbackDispatchActivity.this.s != null) {
                FeedbackDispatchActivity.this.s.onReceiveValue(null);
                FeedbackDispatchActivity.this.s = null;
            }
            FeedbackDispatchActivity.this.s = valueCallback;
            Intent intentCreateGalleryIntent = IntentCheckUtils.createGalleryIntent(FeedbackDispatchActivity.this.getApplicationContext());
            if (intentCreateGalleryIntent == null) {
                FeedbackDispatchActivity.this.d("onShowFileChooser Fail");
                return false;
            }
            try {
                FeedbackDispatchActivity.this.startActivityForResult(intentCreateGalleryIntent, 100);
                return true;
            } catch (ActivityNotFoundException e) {
                FeedbackDispatchActivity.this.s = null;
                g.b("FeedDispatchActivity", e);
                return false;
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (FeedbackDispatchActivity.this.r != null) {
                if (FeedbackDispatchActivity.this.u != null) {
                    FeedbackDispatchActivity.this.u.onCustomViewHidden();
                    return;
                }
                return;
            }
            FeedbackDispatchActivity.this.u = customViewCallback;
            FeedbackDispatchActivity.this.l.setVisibility(8);
            FeedbackDispatchActivity.this.setRequestedOrientation(6);
            FeedbackDispatchActivity.this.e(false);
            FrameLayout frameLayout = (FrameLayout) FeedbackDispatchActivity.this.getWindow().getDecorView();
            FeedbackDispatchActivity.this.r = new e(FeedbackDispatchActivity.this);
            e eVar = FeedbackDispatchActivity.this.r;
            FrameLayout.LayoutParams layoutParams = FeedbackDispatchActivity.e;
            eVar.addView(view, layoutParams);
            frameLayout.addView(FeedbackDispatchActivity.this.r, layoutParams);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            if (!TextUtils.isEmpty(FeedbackDispatchActivity.this.p) || TextUtils.isEmpty(str) || FeedbackDispatchActivity.this.t) {
                return;
            }
            FeedbackDispatchActivity.this.setTitle(str);
            FeedbackDispatchActivity.this.y.put(webView.getUrl(), str);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            if (i > 10) {
                FeedbackDispatchActivity.this.l.setVisibility(0);
            }
            if (FeedbackDispatchActivity.this.n == null || FeedbackDispatchActivity.this.m == null || !FeedbackDispatchActivity.this.m.equals(webView.getUrl())) {
                return;
            }
            FeedbackDispatchActivity.this.n.setProgress(i, true);
            if (i >= 80) {
                FeedbackDispatchActivity.this.n.setVisibility(8);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            if (FeedbackDispatchActivity.this.r != null) {
                if (FeedbackDispatchActivity.this.u != null) {
                    FeedbackDispatchActivity.this.u.onCustomViewHidden();
                }
                FrameLayout frameLayout = (FrameLayout) FeedbackDispatchActivity.this.getWindow().getDecorView();
                FeedbackDispatchActivity.this.r.removeAllViews();
                frameLayout.removeView(FeedbackDispatchActivity.this.r);
                FeedbackDispatchActivity.this.r = null;
                FeedbackDispatchActivity.this.setRequestedOrientation(1);
                FeedbackDispatchActivity.this.e(true);
                FeedbackDispatchActivity.this.l.setVisibility(0);
            }
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            return new TextView(FeedbackDispatchActivity.this);
        }

        a() {
        }
    }

    class b extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (s.a(str, FeedbackDispatchActivity.this)) {
                return false;
            }
            s.a(FeedbackDispatchActivity.this, str, false);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            FeedbackNoticeView feedbackNoticeView;
            FaqConstants.FaqErrorCode faqErrorCode;
            super.onReceivedError(webView, i, str, str2);
            FeedbackDispatchActivity.this.t = true;
            if (TextUtils.isEmpty(FeedbackDispatchActivity.this.p)) {
                FeedbackDispatchActivity.this.setTitle("");
            }
            if (com.huawei.phoneservice.faq.base.util.d.c(FeedbackDispatchActivity.this)) {
                feedbackNoticeView = FeedbackDispatchActivity.this.k;
                faqErrorCode = FaqConstants.FaqErrorCode.CONNECT_SERVER_ERROR;
            } else {
                feedbackNoticeView = FeedbackDispatchActivity.this.k;
                faqErrorCode = FaqConstants.FaqErrorCode.INTERNET_ERROR;
            }
            feedbackNoticeView.e(faqErrorCode);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            CharSequence title;
            FeedbackDispatchActivity feedbackDispatchActivity;
            FeedbackDispatchActivity.this.t = false;
            FeedbackDispatchActivity.this.m = str;
            FeedbackDispatchActivity.this.a(str);
            super.onPageStarted(webView, str, bitmap);
            FeedbackDispatchActivity feedbackDispatchActivity2 = FeedbackDispatchActivity.this;
            feedbackDispatchActivity2.f.postDelayed(feedbackDispatchActivity2.h, 20000L);
            if (FeedbackDispatchActivity.this.n != null) {
                FeedbackDispatchActivity.this.n.setVisibility(0);
            }
            if (TextUtils.isEmpty(FeedbackDispatchActivity.this.p)) {
                if (FeedbackDispatchActivity.this.y.containsKey(str)) {
                    feedbackDispatchActivity = FeedbackDispatchActivity.this;
                    title = (CharSequence) feedbackDispatchActivity.y.get(str);
                } else {
                    title = webView.getTitle();
                    if (TextUtils.isEmpty(title) || webView.getUrl() == null || webView.getUrl().contains(title)) {
                        try {
                            FeedbackDispatchActivity feedbackDispatchActivity3 = FeedbackDispatchActivity.this;
                            feedbackDispatchActivity3.setTitle(feedbackDispatchActivity3.getResources().getString(com.huawei.phoneservice.feedback.R.string.feedback_sdk_common_loading));
                            return;
                        } catch (Resources.NotFoundException e) {
                            g.c("FeedDispatchActivity", e.getMessage());
                            return;
                        }
                    }
                    FeedbackDispatchActivity.this.y.put(webView.getUrl(), title);
                    feedbackDispatchActivity = FeedbackDispatchActivity.this;
                }
                feedbackDispatchActivity.setTitle(title);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            FeedbackDispatchActivity feedbackDispatchActivity = FeedbackDispatchActivity.this;
            feedbackDispatchActivity.f.removeCallbacks(feedbackDispatchActivity.h);
            if (FeedbackDispatchActivity.this.n != null && FeedbackDispatchActivity.this.m != null && FeedbackDispatchActivity.this.m.equals(str)) {
                FeedbackDispatchActivity.this.n.setVisibility(8);
                FeedbackDispatchActivity.this.n.setProgress(0);
            }
            if (FeedbackDispatchActivity.this.t) {
                return;
            }
            FeedbackDispatchActivity.this.l.setVisibility(0);
            FeedbackDispatchActivity.this.k.setVisibility(8);
        }

        b() {
        }
    }

    class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            FeedbackDispatchActivity feedbackDispatchActivity = FeedbackDispatchActivity.this;
            Handler handler = feedbackDispatchActivity.f;
            if (handler != null) {
                handler.removeCallbacks(feedbackDispatchActivity.h);
            }
            FeedbackDispatchActivity.this.e();
        }

        c() {
        }
    }

    class d implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.b(view)) {
                return;
            }
            j.b(view);
            FeedbackDispatchActivity feedbackDispatchActivity = FeedbackDispatchActivity.this;
            feedbackDispatchActivity.f.removeCallbacks(feedbackDispatchActivity.h);
            FeedbackDispatchActivity.this.l.clearView();
            FeedbackDispatchActivity.this.l.removeAllViews();
            FeedbackDispatchActivity.this.l();
        }

        d() {
        }
    }

    static class e extends FrameLayout {
        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        e(Context context) {
            super(context);
            setBackgroundResource(R.color.black);
        }
    }
}
