package com.huami.watch.companion.ui.activity;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.huami.midong.webview.utils.UserAgent;
import com.huami.watch.companion.R;
import com.huami.watch.companion.cloud.api.NoticeSettingApi;
import com.huami.watch.companion.config.LvMiConfig;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.companion.util.URLUtil;
import com.huami.watch.ui.BaseActivity;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.NetworkUtil;
import com.xiaomi.hm.health.device.bind.HMUnbindBaseLogic;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class BindLvMiActivity extends BaseActivity {
    private static final String h = "BindLvMiActivity";
    private WebView b;
    private LinearLayout c;
    private ActionbarLayout d;
    private DialogFragment e;
    private View f;
    private WebViewClient g = new a();

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            BindLvMiActivity.this.dismissDialog();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            BindLvMiActivity.this.dismissDialog();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Log.i(BindLvMiActivity.h, "拦截url:" + str);
            if (!str.startsWith(LvMiConfig.REDIRCTURL)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            BindLvMiActivity.this.i();
            BindLvMiActivity.this.n(URLUtil.getRequestParamMap(str));
            NoticeSettingApi.setNoticeEnable(BindLvMiActivity.this, true, null);
            return true;
        }
    }

    private void h(WebSettings webSettings) {
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        if (NetworkUtil.isOnline(this)) {
            webSettings.setCacheMode(-1);
        } else {
            webSettings.setCacheMode(1);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            webSettings.setMixedContentMode(2);
        }
        webSettings.setUserAgentString(UserAgent.getUserAgent(this, webSettings.getUserAgentString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    private void initView() {
        this.f = findViewById(R.id.layout_author);
        this.b = (WebView) findViewById(R.id.webview);
        this.c = (LinearLayout) findViewById(R.id.layout_contain);
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.app_bar_layout);
        this.d = actionbarLayout;
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: ow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.k(view);
            }
        });
        this.d.setTitleText(getString(R.string.author_lvmi, new Object[]{getString(R.string.lvmi_str)}));
    }

    private void j() {
        this.b.setWebViewClient(this.g);
        h(this.b.getSettings());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(Boolean bool) {
        dismissDialog();
        if (!bool.booleanValue()) {
            Toast.makeText(this, getString(R.string.cancel_author_failed), 0).show();
            return;
        }
        LvMiConfig.unbindLvMi();
        p(false);
        Toast.makeText(this, getString(R.string.already_cancel_author), 0).show();
        Analytics.event(this, AnalyticsEvents.EVENT_STATUS_LUMI_AUTHORIZATION, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(DialogInterface dialogInterface, int i) {
        showLoadDialog(getString(R.string.cancel_author));
        NoticeSettingApi.setNoticeEnable(this, false, new NoticeSettingApi.NoticeStatusListener() { // from class: pw
            @Override // com.huami.watch.companion.cloud.api.NoticeSettingApi.NoticeStatusListener
            public final void onNoticeStatusChange(Object obj) {
                this.a.l((Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Map<String, String> map) {
        Log.i(h, "saveParam:" + map);
        if (map == null || !LvMiConfig.saveToken(map)) {
            Toast.makeText(this, R.string.author_failed, 0).show();
            return;
        }
        p(true);
        o();
        Analytics.event(this, AnalyticsEvents.EVENT_STATUS_LUMI_AUTHORIZATION, 1);
    }

    private void o() {
        AlertDialog.setTitle(getString(R.string.author_success)).setMessage(getString(R.string.author_success_message)).setNeutralBtn(getString(R.string.btn_known)).setCanceledOnTouchOutside(false).show(getFragmentManager(), "confirm");
    }

    private void p(boolean z) {
        if (!z) {
            this.b.setVisibility(0);
            this.f.setVisibility(8);
            j();
            showLoadDialog(getString(R.string.loading));
            this.b.loadUrl(LvMiConfig.getLvMiAuthourl(this));
            return;
        }
        this.b.stopLoading();
        this.b.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
        this.b.clearHistory();
        this.b.setVisibility(8);
        this.f.setVisibility(0);
        ((TextView) findViewById(R.id.tv_author)).setText(getString(R.string.already_author, new Object[]{getString(R.string.lvmi_str)}));
    }

    public void dismissDialog() {
        DialogFragment dialogFragment = this.e;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_bind_lvmi);
        initView();
        p(LvMiConfig.isAlreadyAuthor());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.b;
        if (webView != null) {
            try {
                webView.stopLoading();
                this.b.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
                this.b.clearHistory();
                this.c.removeView(this.b);
                this.b.removeAllViews();
                this.b.destroy();
            } catch (IllegalArgumentException e) {
                Log.e(h, e.getMessage());
            }
            this.b = null;
        }
    }

    public void showLoadDialog(String str) {
        this.e = LoadingDialog.setMessage(str).setCanceledOnTouchOutside(false).show(getFragmentManager(), PointCategory.LOAD);
    }

    public void unbindAuthor(View view) {
        AlertDialog.setTitle(getString(R.string.remove_author)).setMessage(getString(R.string.unbind_author_message)).setNegativeBtn(getString(R.string.cancel)).setPositiveBtn(getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: nw
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.m(dialogInterface, i);
            }
        }).show(getFragmentManager(), HMUnbindBaseLogic.TAG);
    }
}
