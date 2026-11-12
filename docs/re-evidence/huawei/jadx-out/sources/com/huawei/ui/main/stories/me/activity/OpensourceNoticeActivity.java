package com.huawei.ui.main.stories.me.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.main.R;
import defpackage.qqs;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes19.dex */
public class OpensourceNoticeActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f28442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f28443b = new e(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebSettings f28444c;
    private ExecutorService d;
    private WebView e;
    private LinearLayout g;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("OpensourceNoticeActivity", "onCreate()");
        this.f28442a = this;
        this.d = Executors.newSingleThreadExecutor();
        b();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        b();
    }

    private void b() {
        LogUtil.a("OpensourceNoticeActivity", "initView()");
        setContentView(R.layout.activity_user_profile_opensource_notice);
        WebView webView = new WebView(this.f28442a);
        this.e = webView;
        webView.setBackgroundColor(0);
        qqs.a(this.f28442a, this.e);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.opensource_item_linear);
        this.g = linearLayout;
        setViewSafeRegion(false, linearLayout);
        this.g.addView(this.e);
        this.e.setVerticalScrollBarEnabled(false);
        WebSettings settings = this.e.getSettings();
        this.f28444c = settings;
        settings.setSupportZoom(true);
        this.f28444c.setTextSize(WebSettings.TextSize.SMALLER);
        this.f28444c.setAllowFileAccessFromFileURLs(false);
        this.f28444c.setJavaScriptEnabled(false);
        this.f28444c.setAllowFileAccess(false);
        this.f28444c.setGeolocationEnabled(false);
        this.f28444c.setAllowContentAccess(false);
        d();
    }

    private void d() {
        ExecutorService executorService = this.d;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: com.huawei.ui.main.stories.me.activity.OpensourceNoticeActivity.5
                @Override // java.lang.Runnable
                public void run() {
                    OpensourceNoticeActivity.this.f28443b.sendMessage(OpensourceNoticeActivity.this.f28443b.obtainMessage(1000, OpensourceNoticeActivity.this.a("hwOpenSource.html") ? "file:///android_asset/opensourcenotice/hwOpenSource.html" : null));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        WebView webView = this.e;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void loadApplicationTheme() {
        loadTheme("OpensourceNoticeTheme");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        a();
        LogUtil.a("OpensourceNoticeActivity", "onDestroy");
        ExecutorService executorService = this.d;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    private void a() {
        LogUtil.a("OpensourceNoticeActivity", "destroyWebView");
        if (this.e != null) {
            LogUtil.a("OpensourceNoticeActivity", "onDestroy destroyWebView");
            ViewParent parent = this.e.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.e);
            }
            try {
                this.e.destroy();
            } catch (Throwable unused) {
                LogUtil.e("OpensourceNoticeActivity", "destroyWebView error");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) {
        try {
            return Arrays.asList(getResources().getAssets().list("opensourcenotice")).contains(str);
        } catch (IOException unused) {
            LogUtil.e("OpensourceNoticeActivity", "isFileExists IOException");
            return false;
        }
    }

    static class e extends BaseHandler<OpensourceNoticeActivity> {
        e(OpensourceNoticeActivity opensourceNoticeActivity) {
            super(opensourceNoticeActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(OpensourceNoticeActivity opensourceNoticeActivity, Message message) {
            if (message.what == 1000 && (message.obj instanceof String)) {
                opensourceNoticeActivity.b((String) message.obj);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
