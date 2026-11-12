package com.huawei.watchface.mvp.ui.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.secure.android.common.ssl.WebViewSSLCheck;
import com.huawei.secure.android.common.webview.SafeWebSettings;
import com.huawei.secure.android.common.webview.SafeWebView;
import com.huawei.skinner.base.SkinBaseFragmentActivity;
import com.huawei.uikit.phone.hwtextview.widget.HwTextView;
import com.huawei.watchface.R;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.b3;
import com.huawei.watchface.g4;
import com.huawei.watchface.mvp.model.filedownload.threadpool.ThreadPoolManager;
import com.huawei.watchface.mvp.ui.widget.HwToolbar;
import com.huawei.watchface.n1;
import com.huawei.watchface.t4;
import com.huawei.watchface.u4;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WebViewUtils;
import com.huawei.watchface.v0;
import com.huawei.watchface.x2;
import defpackage.orf;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes45.dex */
public class WatchfaceUrlActivity extends SkinBaseFragmentActivity implements View.OnClickListener {
    private static final String AGREEMENT_KEY = "Agreement_key";
    private static final int DELAY_LOADING_TIME = 100;
    private static final int LOAD_WEB_VIEW_URL = 1;
    private static final String PRIVACY_STATEMENT_URL = "/minisite/cloudservice/themes/privacy-statement.htm?country=";
    private static final String PRIVACY_URL_CONTANTS = "privacyurl";
    private static final String SELECT_COUNTRY = "select_country";
    private static final String TAG = "WatchfaceUrlActivity";
    private static final String TERMS_URL = "/minisite/cloudservice/themes/terms.htm?country=";
    private static final String TERMS_URL_CONTANTS = "termsurl";
    private static final String UNDER_LINE = "_";
    private AnimationDrawable mAnimationDrawable;
    private TextView mCheckMore;
    private Activity mContext;
    private String mCountry;
    private Handler mHandler = new a();
    private String mHeadUrl;
    private String mHwConsumerUrl;
    private LinearLayout mLoadingLayout;
    private LinearLayout mMainLayout;
    private RelativeLayout mNoNetWorkLayout;
    private Button mSetNetWorkBtn;
    private String mTitle;
    private HwTextView mTvTitle;
    private SafeWebView mUserAgreement;
    private String mWebSource;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                HwLog.w(WatchfaceUrlActivity.TAG, "handleMessage(), message is null");
                return;
            }
            super.handleMessage(message);
            if (message.what == 1) {
                WatchfaceUrlActivity.this.loadWebView();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String commonCountryCode = HwWatchFaceApi.getInstance(WatchfaceUrlActivity.this.mContext).getCommonCountryCode();
            WatchfaceUrlActivity.this.mHwConsumerUrl = v0.a().a(commonCountryCode, "ROOT", "com.huawei.cloud.agreementservice");
            if (TextUtils.isEmpty(WatchfaceUrlActivity.this.mHwConsumerUrl)) {
                HwLog.w(WatchfaceUrlActivity.TAG, "loadWebViewUrl mHwConsumerUrl is empty");
            } else if (WatchfaceUrlActivity.this.isFinishing() || WatchfaceUrlActivity.this.isDestroyed()) {
                HwLog.w(WatchfaceUrlActivity.TAG, "loadWebViewUrl isFinishing or isDestroyed");
            } else {
                WatchfaceUrlActivity.this.mHandler.sendEmptyMessage(1);
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HwLog.i(WatchfaceUrlActivity.TAG, "ServiceItemActivity.uninstallApk");
            try {
                CommonUtils.e(WatchfaceUrlActivity.this.mContext, "com.google.android.webview");
            } catch (Exception unused) {
                HwLog.i(WatchfaceUrlActivity.TAG, "ServiceItemActivity test");
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClassName("com.huawei.systemmanager", "com.huawei.dataprivacycenter.MainActivity");
            CommonUtils.a(WatchfaceUrlActivity.this.mContext, intent);
            WatchfaceUrlActivity.this.finish();
        }
    }

    private void destroyWebView() {
        HwLog.i(TAG, "destroyWebView");
        if (this.mUserAgreement != null) {
            HwLog.i(TAG, "onDestroy destroyWebView");
            ViewParent parent = this.mUserAgreement.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.mUserAgreement);
            }
            try {
                this.mUserAgreement.destroy();
            } catch (Exception unused) {
                HwLog.i(TAG, "destroyWebView exception");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goBack() {
        SafeWebView safeWebView = this.mUserAgreement;
        if (safeWebView == null || !safeWebView.canGoBack()) {
            Activity activity = this.mContext;
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        if (!x2.d()) {
            Activity activity2 = this.mContext;
            if (activity2 != null) {
                activity2.finish();
                return;
            }
            return;
        }
        u4.c(this.mMainLayout, 0);
        u4.c(this.mLoadingLayout, 8);
        u4.c(this.mNoNetWorkLayout, 8);
        u4.c(this.mTvTitle, 0);
        this.mUserAgreement.goBack();
    }

    private void initErrorView() {
        HwLog.i(TAG, "ServiceItemActivity.isErrorWebView");
        ((Button) findViewById(R.id.btn_go_setting)).setOnClickListener(new c());
        initToolbar();
    }

    private void initToolbar() {
        HwLog.i(TAG, "initToolbar() enter.");
        HwTextView hwTextView = (HwTextView) ((HwToolbar) LayoutInflater.from(this).inflate(R.layout.watchface_activity_common_toolbar, (ViewGroup) null).findViewById(R.id.tl_common_toolbar)).findViewById(R.id.tv_common_toolbar_title);
        this.mTvTitle = hwTextView;
        hwTextView.setText(DensityUtil.getStringById(R.string.IDS_hw_watchface_secret_dialog_content_user_agreement));
    }

    private void initView() {
        HwLog.i(TAG, "initView()");
        SafeWebView safeWebView = (SafeWebView) findViewById(R.id.hw_health_user_agreement_webview);
        this.mUserAgreement = safeWebView;
        n1.a(this.mContext, safeWebView);
        this.mCheckMore = (TextView) findViewById(R.id.check_more);
        if (CommonUtils.G()) {
            this.mCheckMore.setOnClickListener(new d());
        } else {
            this.mCheckMore.setVisibility(8);
        }
        this.mLoadingLayout = (LinearLayout) findViewById(R.id.service_layout_loading);
        this.mMainLayout = (LinearLayout) findViewById(R.id.service_item_linear);
        this.mNoNetWorkLayout = (RelativeLayout) findViewById(R.id.reload_layout);
        this.mSetNetWorkBtn = (Button) findViewById(R.id.btn_no_net_work);
        this.mLoadingLayout.setVisibility(0);
        AnimationDrawable animationDrawable = (AnimationDrawable) ((ImageView) this.mLoadingLayout.findViewById(R.id.service_info_loading)).getDrawable();
        this.mAnimationDrawable = animationDrawable;
        animationDrawable.start();
        this.mSetNetWorkBtn.setOnClickListener(this);
        showNoNetWork();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadWebView() {
        this.mTvTitle = (HwTextView) u4.a(this, R.id.tv_common_toolbar_title);
        this.mHeadUrl = this.mHwConsumerUrl + TERMS_URL;
        if (TERMS_URL_CONTANTS.equals(this.mWebSource)) {
            this.mHeadUrl = this.mHwConsumerUrl + TERMS_URL;
            this.mTitle = DensityUtil.getStringById(R.string.IDS_hw_watchface_secret_dialog_content_user_agreement);
        }
        if (PRIVACY_URL_CONTANTS.equals(this.mWebSource)) {
            this.mHeadUrl = this.mHwConsumerUrl + PRIVACY_STATEMENT_URL;
            this.mTitle = DensityUtil.getStringById(R.string.IDS_hw_watchface_secret_dialog_content_privacy_statement);
        }
        this.mTvTitle.setText(this.mTitle);
        WebSettings settings = this.mUserAgreement.getSettings();
        settings.setGeolocationEnabled(false);
        settings.setAllowContentAccess(false);
        settings.setCacheMode(2);
        settings.setSupportZoom(true);
        settings.setTextSize(WebSettings.TextSize.SMALLER);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(true);
        g4 g4VarC = b3.b().c();
        if (g4VarC != null) {
            List listD = g4VarC.d();
            if (!ArrayUtils.isEmpty(listD)) {
                this.mUserAgreement.setWhitelistNotMatchSubDomain((String[]) listD.toArray(new String[0]));
            }
        }
        SafeWebSettings.initWebviewAndSettings(this.mUserAgreement);
        this.mUserAgreement.setWebViewClient(new e(), false);
        this.mUserAgreement.loadUrl(termsUrl());
    }

    private void loadWebViewUrl() {
        ThreadPoolManager.getInstance().execute(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean openApkToHandleUrl(WebView webView, String str) {
        try {
            if (!str.startsWith("http://") && !str.startsWith("https://")) {
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
                if (CommonUtils.setIntentComponent(this, intent)) {
                    orf.a(this, intent);
                }
                return true;
            }
            if (webView != null) {
                g4 g4VarC = b3.b().c();
                if (g4VarC != null && !g4VarC.c(str)) {
                    HwLog.e(TAG, "openApkToHandleUrl url is not in white list");
                    return true;
                }
                webView.loadUrl(str);
            }
            return true;
        } catch (ActivityNotFoundException unused) {
            HwLog.e(TAG, "ActivityNotFoundException：not install apk to open this url");
            return true;
        }
    }

    private void showNoNetWork() {
        if (CommonUtils.C()) {
            return;
        }
        this.mNoNetWorkLayout.setVisibility(0);
        this.mMainLayout.setVisibility(8);
        this.mLoadingLayout.setVisibility(8);
    }

    private String termsUrl() {
        String str;
        String language = Locale.getDefault().getLanguage();
        String script = Locale.getDefault().getScript();
        if (TextUtils.isEmpty(this.mCountry)) {
            this.mCountry = "GB";
        }
        String country = Locale.getDefault().getCountry();
        if (TextUtils.isEmpty(script)) {
            str = language + "_" + country;
        } else {
            str = language + "_" + script + "_" + country;
        }
        return this.mHeadUrl + this.mCountry + Constants.LANGUAGE + str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view != null && view == this.mSetNetWorkBtn) {
            CommonUtils.i(this.mContext);
        }
    }

    @Override // com.huawei.skinner.base.SkinBaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mContext = this;
        if (getIntent() == null) {
            finish();
            return;
        }
        if (!HwWatchFaceApi.getInstance(this.mContext).isOversea()) {
            this.mCountry = "CN";
        }
        if (HwWatchFaceApi.getInstance(this.mContext).isLogin()) {
            this.mCountry = HwWatchFaceApi.getInstance(this.mContext).getCommonCountryCode();
        }
        try {
            this.mWebSource = getIntent().getStringExtra(AGREEMENT_KEY);
        } catch (Exception unused) {
            HwLog.e(TAG, "getStringExtra AGREEMENT_KEY Exception");
        }
        if (CommonUtils.j(this.mContext.getApplicationContext())) {
            setContentView(R.layout.watchface_fragment_web_view_error_1);
            initErrorView();
        } else {
            setContentView(R.layout.watchface_activity_watchface_url_item);
            HwLog.i(TAG, "onCreate()");
            initView();
            loadWebViewUrl();
        }
    }

    @Override // com.huawei.skinner.base.SkinBaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        destroyWebView();
        HwLog.i(TAG, "onDestroy");
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        HwLog.i(TAG, "onPause()");
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        HwLog.i(TAG, "onRestart()");
    }

    @Override // com.huawei.skinner.base.SkinBaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        HwLog.i(TAG, "onResume()");
    }

    public class e extends WebViewClient {
        public e() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            HwLog.i(WatchfaceUrlActivity.TAG, "onPageFinished");
            super.onPageFinished(webView, str);
            WatchfaceUrlActivity.this.mAnimationDrawable.stop();
            WatchfaceUrlActivity.this.mLoadingLayout.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            HwLog.i(WatchfaceUrlActivity.TAG, "onPageStarted");
            g4 g4VarC = b3.b().c();
            if (g4VarC == null || g4VarC.c(str)) {
                super.onPageStarted(webView, str, bitmap);
                return;
            }
            HwLog.i(WatchfaceUrlActivity.TAG, "onPageStarted url is not in white list");
            webView.stopLoading();
            WatchfaceUrlActivity.this.goBack();
            WebViewUtils.a(WatchfaceUrlActivity.this.mContext, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            HwLog.e(WatchfaceUrlActivity.TAG, "on received ssl error");
            if (sslError != null) {
                WebViewSSLCheck.checkServerCertificateNew(sslErrorHandler, sslError, WatchfaceUrlActivity.this.mContext);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            n1.a(WatchfaceUrlActivity.this.mContext, webView);
            if (!TextUtils.isEmpty(str)) {
                return WatchfaceUrlActivity.this.openApkToHandleUrl(webView, str);
            }
            HwLog.w(WatchfaceUrlActivity.TAG, "load url is null");
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            n1.a(WatchfaceUrlActivity.this.mContext, webView);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                HwLog.w(WatchfaceUrlActivity.TAG, "shouldOverrideUrlLoading() load url request is null");
                return false;
            }
            if (t4.a(webResourceRequest.getUrl().toString())) {
                HwLog.e(WatchfaceUrlActivity.TAG, "shouldOverrideUrlLoading() url contain xss char.");
                return true;
            }
            return WatchfaceUrlActivity.this.openApkToHandleUrl(webView, webResourceRequest.getUrl().toString());
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
