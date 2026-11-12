package com.huawei.watchface.mvp.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.WindowInsetsCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.secure.android.common.intent.SafeBroadcastReceiver;
import com.huawei.secure.android.common.util.UrlUtil;
import com.huawei.secure.android.common.webview.SafeWebSettings;
import com.huawei.secure.android.common.webview.SafeWebView;
import com.huawei.secure.android.common.webview.WebViewLoadCallBack;
import com.huawei.uikit.phone.hwtextview.widget.HwTextView;
import com.huawei.watchface.R;
import com.huawei.watchface.api.WebViewActivity;
import com.huawei.watchface.b3;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.g;
import com.huawei.watchface.g4;
import com.huawei.watchface.m;
import com.huawei.watchface.mvp.base.BaseActivity;
import com.huawei.watchface.mvp.model.helper.JsSafeUrlSystemParamManager;
import com.huawei.watchface.mvp.ui.widget.HwToolbar;
import com.huawei.watchface.n1;
import com.huawei.watchface.u4;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.LanguageUtils;
import com.huawei.watchface.utils.SafeHandler;
import com.huawei.watchface.utils.WebViewUtils;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import com.huawei.watchface.videoedit.utils.SafeIntent;
import com.huawei.watchface.x2;
import com.huawei.watchface.z2;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes45.dex */
public class WatchfaceUrlActivityV1 extends BaseActivity implements View.OnClickListener {
    private static final String TAG = "WatchfaceV1";
    private g mAnalyticsH5Event;
    private Button mBtnNetSetting;
    private Activity mContext;
    private SafeHandler mHandler;
    private boolean mIsNetworkAvailable;
    private View mIvBack;
    private LinearLayout mLoadingLayout;
    private LinearLayout mMainLayout;
    private b mNetworkBroadcastReceiver;
    private RelativeLayout mNoNetWorkLayout;
    private TextView mNoNetworkTips;
    private ProgressBar mProgressBar;
    private ImageView mTipsImageView;
    private String mTitle;
    private View mToolBar;
    private HwTextView mTvTitle;
    private String mWebSource;
    private int mWebType;
    private SafeWebView mWebView;

    public static class a extends SafeHandler {
        public a(WatchfaceUrlActivityV1 watchfaceUrlActivityV1) {
            super(watchfaceUrlActivityV1);
        }

        public static /* synthetic */ void a(WatchfaceUrlActivityV1 watchfaceUrlActivityV1) {
            SafeWebView safeWebView = watchfaceUrlActivityV1.mWebView;
            if (safeWebView != null) {
                safeWebView.goBack();
            }
        }

        @Override // com.huawei.watchface.utils.SafeHandler
        public void handlerMessageAction(Message message) {
            if (getObj() == null) {
                return;
            }
            final WatchfaceUrlActivityV1 watchfaceUrlActivityV1 = (WatchfaceUrlActivityV1) getObj();
            int i = message.what;
            if (i == 2000) {
                HwLog.i(WatchfaceUrlActivityV1.TAG, "MSG_PROGRESSBAR_GONE");
                u4.c(watchfaceUrlActivityV1.mLoadingLayout, 8);
                u4.c(watchfaceUrlActivityV1.mProgressBar, 8);
            } else if (i != 2001) {
                if (i == 2003) {
                    HwLog.i(WatchfaceUrlActivityV1.TAG, "MSG_ON_NET_WORK");
                    watchfaceUrlActivityV1.showNoNetworkPage();
                    watchfaceUrlActivityV1.setAnalyticsH5Event(message.what, "MSG_ON_NET_WORK noNetWork");
                } else if (i == 2022) {
                    HwLog.i(WatchfaceUrlActivityV1.TAG, "MSG_WATCH_FACE_SERVER_RETRY");
                    watchfaceUrlActivityV1.showWatchFaceServerRetryPage();
                    watchfaceUrlActivityV1.setAnalyticsH5Event(message.what, "MSG_WATCH_FACE_SERVER_RETRY");
                } else if (i == 4001) {
                    HwLog.i(WatchfaceUrlActivityV1.TAG, "MAG_WEB_VIEW_LOAD");
                    watchfaceUrlActivityV1.showUnstableNetworkPage();
                    watchfaceUrlActivityV1.setAnalyticsH5Event(message.what, "MAG_WEB_VIEW_LOAD");
                } else if (i == 10086) {
                    HwLog.i(WatchfaceUrlActivityV1.TAG, "handleLoadPage() ON_PAGE_FINISH");
                    watchfaceUrlActivityV1.dealOnPageFinish(message.obj);
                } else if (i == 10089) {
                    HwLog.i(WatchfaceUrlActivityV1.TAG, "handleLoadPage() ON_PAGE_TITLE_FINISH");
                    watchfaceUrlActivityV1.updateTitle(message.obj);
                } else if (i != 20253) {
                    switch (i) {
                        case 2006:
                            HwLog.i(WatchfaceUrlActivityV1.TAG, "MSG_SERVER_ERROR");
                            watchfaceUrlActivityV1.showServerErrorPage();
                            watchfaceUrlActivityV1.setAnalyticsH5Event(message.what, "MSG_SERVER_ERROR");
                            break;
                        case 2007:
                            HwLog.i(WatchfaceUrlActivityV1.TAG, "MSG_CONNECT_TIMEOUT");
                            watchfaceUrlActivityV1.showUnstableNetworkPage();
                            watchfaceUrlActivityV1.setAnalyticsH5Event(message.what, "MSG_CONNECT_TIMEOUT");
                            break;
                        case 2008:
                            HwLog.i(WatchfaceUrlActivityV1.TAG, "MSG_SSL_HANDLE_ERROR");
                            watchfaceUrlActivityV1.showSslErrorTipsPage();
                            watchfaceUrlActivityV1.setAnalyticsH5Event(message.what, "MSG_SSL_HANDLE_ERROR");
                            break;
                    }
                } else {
                    HwLog.i(WatchfaceUrlActivityV1.TAG, "handleTitle() UPLOAD_SUCCESS");
                    BackgroundTaskUtils.postInMainThread(new Runnable() { // from class: com.huawei.watchface.mvp.ui.activity.WatchfaceUrlActivityV1$a$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            WatchfaceUrlActivityV1.a.a(watchfaceUrlActivityV1);
                        }
                    });
                }
            } else if (CommonUtils.C()) {
                HwLog.i(WatchfaceUrlActivityV1.TAG, "MSG_ON_RECEIVED_ERROR showNoServicePage");
                watchfaceUrlActivityV1.showNoServicePage();
                watchfaceUrlActivityV1.setAnalyticsH5Event(message.what, "MSG_ON_RECEIVED_ERROR showNoServicePage");
            } else {
                HwLog.i(WatchfaceUrlActivityV1.TAG, "MSG_ON_RECEIVED_ERROR showNoNetworkPage");
                watchfaceUrlActivityV1.showNoNetworkPage();
                watchfaceUrlActivityV1.setAnalyticsH5Event(message.what, "MSG_ON_RECEIVED_ERROR showNoNetworkPage");
            }
            ((WatchfaceUrlActivityV1) getObj()).uploadH5LoadUrl();
        }
    }

    public class b extends SafeBroadcastReceiver {
        public b() {
        }

        @Override // com.huawei.secure.android.common.intent.SafeBroadcastReceiver
        public void onReceiveMsg(Context context, Intent intent) {
            if (intent == null || TextUtils.isEmpty(intent.getAction())) {
                HwLog.i(WatchfaceUrlActivityV1.TAG, "NetworkBroadcastReceiver intent or action is null.");
                return;
            }
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(Objects.requireNonNull(intent.getAction())) && WatchfaceUrlActivityV1.this.mWebView != null && x2.d()) {
                WatchfaceUrlActivityV1 watchfaceUrlActivityV1 = WatchfaceUrlActivityV1.this;
                watchfaceUrlActivityV1.mIsNetworkAvailable = true;
                watchfaceUrlActivityV1.mWebView.loadUrl(watchfaceUrlActivityV1.mWebSource);
                WatchfaceUrlActivityV1.this.showNetworkAvailablePage();
            }
        }
    }

    public class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            SafeHandler safeHandler;
            ProgressBar progressBar;
            if (!TextUtils.isEmpty(WatchfaceUrlActivityV1.this.mWebSource) && (progressBar = WatchfaceUrlActivityV1.this.mProgressBar) != null) {
                progressBar.setVisibility(i >= 100 ? 8 : 0);
                WatchfaceUrlActivityV1.this.mProgressBar.setProgress(i);
            }
            Activity activity = WatchfaceUrlActivityV1.this.mContext;
            if (activity == null || activity.isFinishing() || i < 99 || (safeHandler = WatchfaceUrlActivityV1.this.mHandler) == null) {
                return;
            }
            safeHandler.sendEmptyMessage(2000);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            Message messageObtainMessage = WatchfaceUrlActivityV1.this.mHandler.obtainMessage(10089);
            messageObtainMessage.obj = str;
            WatchfaceUrlActivityV1.this.mHandler.sendMessage(messageObtainMessage);
        }
    }

    public class d extends WebViewClient {
        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            HwLog.e(WatchfaceUrlActivityV1.TAG, "onPageFinished");
            if (WatchfaceUrlActivityV1.this.mHandler.hasMessages(2007)) {
                WatchfaceUrlActivityV1.this.mHandler.removeMessages(2007);
            }
            Message messageObtainMessage = WatchfaceUrlActivityV1.this.mHandler.obtainMessage(10086);
            messageObtainMessage.obj = webView.getTitle();
            WatchfaceUrlActivityV1.this.mHandler.sendMessage(messageObtainMessage);
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            g4 g4VarC = b3.b().c();
            if (g4VarC == null || g4VarC.c(str)) {
                WatchfaceUrlActivityV1 watchfaceUrlActivityV1 = WatchfaceUrlActivityV1.this;
                watchfaceUrlActivityV1.mWebSource = str;
                WebViewUtils.a(watchfaceUrlActivityV1.mContext, watchfaceUrlActivityV1.mWebView, str);
                super.onPageStarted(webView, str, bitmap);
                return;
            }
            HwLog.e(WatchfaceUrlActivityV1.TAG, "onPageStarted url is not in white list");
            FlavorConfig.safeHwLog(WatchfaceUrlActivityV1.TAG, "onPageStarted url is not in white list:" + str);
            webView.stopLoading();
            WatchfaceUrlActivityV1.this.goBack();
            WatchfaceUrlActivityV1.this.showOpenBrowserDialog(str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            HwLog.i(WatchfaceUrlActivityV1.TAG, "onReceivedError errorCode is " + i + "description is " + str);
            WatchfaceUrlActivityV1.this.mHandler.sendEmptyMessage(2001);
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            HwLog.i(WatchfaceUrlActivityV1.TAG, "shouldOverrideUrlLoading ");
            if (str == null) {
                HwLog.i(WatchfaceUrlActivityV1.TAG, "shouldOverrideUrlLoading url == null");
                return false;
            }
            if (WebViewUtils.f(str)) {
                return false;
            }
            WebViewUtils.a(WatchfaceUrlActivityV1.this.mContext, str);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealOnPageFinish(Object obj) {
        u4.c(this.mLoadingLayout, 8);
        this.mWebView.getSettings().setBlockNetworkImage(false);
        if (obj == null || !(obj instanceof String)) {
            return;
        }
        this.mTitle = (String) obj;
        FlavorConfig.safeHwLog(TAG, "title:" + this.mTitle);
        if (TextUtils.isEmpty(this.mTitle) || UrlUtil.isHttpsUrl(this.mTitle) || UrlUtil.isHttpUrl(this.mTitle)) {
            return;
        }
        u4.a(this.mTvTitle, this.mTitle);
    }

    private void destroyWebView() {
        HwLog.i(TAG, "destroyWebView");
        if (this.mWebView != null) {
            HwLog.i(TAG, "onDestroy destroyWebView");
            ViewParent parent = this.mWebView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.mWebView);
            }
            try {
                this.mWebView.destroy();
            } catch (Exception unused) {
                HwLog.i(TAG, "destroyWebView exception");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goBack() {
        SafeWebView safeWebView = this.mWebView;
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
        this.mWebView.goBack();
    }

    private void initContentView() {
        HwLog.i(TAG, "initContentView()");
        if (Build.VERSION.SDK_INT >= 35) {
            ((RelativeLayout) u4.a(this, R.id.service_item_layout)).setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.huawei.watchface.mvp.ui.activity.WatchfaceUrlActivityV1$$ExternalSyntheticLambda7
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return WatchfaceUrlActivityV1.lambda$initContentView$5(view, windowInsets);
                }
            });
        }
        this.mWebView = (SafeWebView) findViewById(R.id.hw_health_user_agreement_webview);
        this.mLoadingLayout = (LinearLayout) findViewById(R.id.service_layout_loading);
        this.mToolBar = findViewById(R.id.tl_common_toolbar);
        this.mMainLayout = (LinearLayout) findViewById(R.id.service_item_linear);
        this.mNoNetWorkLayout = (RelativeLayout) findViewById(R.id.reload_layout);
        this.mBtnNetSetting = (Button) findViewById(R.id.btn_no_net_work);
        this.mLoadingLayout.setVisibility(0);
        this.mNoNetworkTips = (TextView) u4.a(this, R.id.tips_no_net_work);
        this.mTipsImageView = (ImageView) u4.a(this, R.id.img_no_net_work);
        this.mBtnNetSetting.setOnClickListener(this);
        this.mTvTitle = (HwTextView) u4.a(this, R.id.tv_common_toolbar_title);
        this.mIvBack = u4.a(this, R.id.iv_back);
        this.mProgressBar = (ProgressBar) u4.a(this, R.id.prgress_load_url);
        u4.c(this.mIvBack, 0);
        u4.a(this.mIvBack, new View.OnClickListener() { // from class: com.huawei.watchface.mvp.ui.activity.WatchfaceUrlActivityV1$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$initContentView$6(view);
            }
        });
        u4.b(this.mToolBar, CommonUtils.e(Environment.getApplicationContext()));
        if (LanguageUtils.a(this.mContext) && n1.a(this.mContext)) {
            ((ImageView) this.mIvBack).setColorFilter(ResourcesCompat.getColor(getResources(), R.color.emui_primary_dark, null));
        }
        initWebView();
        showNoNetOrContent();
    }

    private void initErrorToolbar() {
        HwLog.i(TAG, "initErrorToolbar() enter.");
        HwToolbar hwToolbar = (HwToolbar) LayoutInflater.from(this).inflate(R.layout.watchface_activity_common_toolbar, (ViewGroup) null).findViewById(R.id.tl_common_toolbar);
        this.mTvTitle = (HwTextView) hwToolbar.findViewById(R.id.tv_common_toolbar_title);
        View viewA = u4.a(hwToolbar, R.id.iv_back);
        this.mIvBack = viewA;
        u4.c(viewA, 0);
        u4.a(this.mIvBack, new View.OnClickListener() { // from class: com.huawei.watchface.mvp.ui.activity.WatchfaceUrlActivityV1$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$initErrorToolbar$0(view);
            }
        });
    }

    private void initErrorView() {
        HwLog.i(TAG, "initErrorView");
        ((Button) findViewById(R.id.btn_go_setting)).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.watchface.mvp.ui.activity.WatchfaceUrlActivityV1$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$initErrorView$1(view);
            }
        });
        initErrorToolbar();
    }

    private void initIntent() {
        if (getIntent() == null) {
            finish();
            return;
        }
        SafeIntent safeIntent = new SafeIntent(getIntent());
        int intExtra = safeIntent.getIntExtra("WebType", 102);
        this.mWebType = intExtra;
        if (intExtra != 102) {
            this.mWebSource = LanguageUtils.d() ? "file:///android_asset/watchfaceOpenSource.html" : "file:///android_asset/watchfaceOpenSourceOverseas.html";
            return;
        }
        String stringExtra = safeIntent.getStringExtra("WebSource");
        this.mWebSource = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
        }
        g4 g4VarC = b3.b().c();
        if (g4VarC == null || g4VarC.c(this.mWebSource)) {
            HwLog.i(TAG, "mWebSource is in white list");
            return;
        }
        showOpenBrowserDialog(this.mWebSource);
        this.mWebSource = "";
        HwLog.i(TAG, "mWebSource is not in white list");
    }

    private void initView() {
        if (CommonUtils.j(this.mContext.getApplicationContext())) {
            setContentView(R.layout.watchface_fragment_web_view_error_1);
            initErrorView();
        } else {
            setContentView(R.layout.watchface_activity_url_item);
            HwLog.i(TAG, "onCreate()");
            initContentView();
        }
    }

    private void initWebView() {
        HwLog.i(TAG, "initWebViewSettings");
        this.mAnalyticsH5Event = new g();
        this.mWebView.requestFocus();
        this.mWebView.setOverScrollMode(2);
        WebSettings settings = this.mWebView.getSettings();
        settings.setSaveFormData(false);
        settings.setGeolocationEnabled(false);
        settings.setCacheMode(2);
        settings.setJavaScriptEnabled(true);
        settings.setBlockNetworkImage(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setTextZoom(100);
        settings.setMixedContentMode(2);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.mWebView, true);
        SafeWebSettings.initWebviewAndSettings(this.mWebView);
        this.mWebView.setWebViewClient(new d(), false);
        this.mWebView.setWebChromeClient(new c());
        this.mWebView.setWebViewLoadCallBack(new WebViewLoadCallBack() { // from class: com.huawei.watchface.mvp.ui.activity.WatchfaceUrlActivityV1$$ExternalSyntheticLambda2
            @Override // com.huawei.secure.android.common.webview.WebViewLoadCallBack
            public final void onCheckError(String str, WebViewLoadCallBack.ErrorCode errorCode) {
                HwLog.e(WatchfaceUrlActivityV1.TAG, "initWebViewSettingsEvent -- onCheckError: " + errorCode);
            }
        });
    }

    static /* synthetic */ WindowInsets lambda$initContentView$5(View view, WindowInsets windowInsets) {
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets);
        view.setPadding(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).left, 0, windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).right, windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom);
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initContentView$6(View view) {
        goBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initErrorToolbar$0(View view) {
        goBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initErrorView$1(View view) {
        HwLog.i(TAG, "enter btnGoSetting click");
        try {
            CommonUtils.e(this.mContext, "com.google.android.webview");
        } catch (Exception e) {
            HwLog.i(TAG, "initErrorView btnGoSetting click error" + HwLog.printException(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadSafeUrl$8(String str) {
        g4 g4VarC = b3.b().c();
        if (g4VarC == null || !g4VarC.c(str)) {
            HwLog.i(TAG, "loadSafeUrl - loadPage: SupportType is null.");
            loadSafeUrlAfterloadWhite(str);
            return;
        }
        List listD = g4VarC.d();
        if (!ArrayUtils.isEmpty(listD)) {
            this.mWebView.setWhitelistNotMatchSubDomain((String[]) listD.toArray(new String[0]));
        }
        SafeWebView safeWebView = this.mWebView;
        if (safeWebView != null) {
            safeWebView.loadUrl(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadSafeUrlAfterloadWhite$9(String str, int i, Object obj) {
        if (obj instanceof g4) {
            g4 g4Var = (g4) obj;
            List listD = g4Var.d();
            if (!ArrayUtils.isEmpty(listD)) {
                this.mWebView.setWhitelistNotMatchSubDomain((String[]) listD.toArray(new String[0]));
            }
            boolean zC = g4Var.c(str);
            HwLog.i(TAG, "reload whitelist isWhiteUrl : " + zC);
            if (zC) {
                this.mWebView.loadUrl(str);
            } else {
                HwLog.e(TAG, "reload isWhiteUrl false.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showOpenBrowserDialog$3(String str, View view) {
        HwLog.i(TAG, "showOpenBrowserDialog, confirm");
        WebViewUtils.a(this.mContext, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showOpenBrowserDialog$4(final String str) {
        z2 z2VarA = new z2.a(this.mContext).a(DensityUtil.getStringById(R.string.watch_face_jump_browser)).a(DensityUtil.getStringById(R.string.cancel), new View.OnClickListener() { // from class: com.huawei.watchface.mvp.ui.activity.WatchfaceUrlActivityV1$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HwLog.i(WatchfaceUrlActivityV1.TAG, "showOpenBrowserDialog, CancelSaveWatchFace.");
            }
        }).b(DensityUtil.getStringById(R.string.confirm), new View.OnClickListener() { // from class: com.huawei.watchface.mvp.ui.activity.WatchfaceUrlActivityV1$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$showOpenBrowserDialog$3(str, view);
            }
        }).a();
        if (z2VarA.isShowing()) {
            return;
        }
        HwLog.i(TAG, "showOpenBrowserDialog is Showing");
        z2VarA.setCancelable(false);
        z2VarA.show();
    }

    private void loadSafeUrl(final String str) {
        JsSafeUrlSystemParamManager.getInstance().c(new JsSafeUrlSystemParamManager.b() { // from class: com.huawei.watchface.mvp.ui.activity.WatchfaceUrlActivityV1$$ExternalSyntheticLambda4
            @Override // com.huawei.watchface.mvp.model.helper.JsSafeUrlSystemParamManager.b
            public final void onGetFinished() {
                this.f$0.lambda$loadSafeUrl$8(str);
            }
        });
    }

    private void loadSafeUrlAfterloadWhite(final String str) {
        b3.b().a(new IBaseResponseCallback() { // from class: com.huawei.watchface.mvp.ui.activity.WatchfaceUrlActivityV1$$ExternalSyntheticLambda0
            @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.lambda$loadSafeUrlAfterloadWhite$9(str, i, obj);
            }
        });
        b3.b().f();
    }

    private void registerNetworkReceiver() {
        if (this.mNetworkBroadcastReceiver == null) {
            this.mNetworkBroadcastReceiver = new b();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (CommonUtils.isAndroid13()) {
            registerReceiver(this.mNetworkBroadcastReceiver, intentFilter, WebViewActivity.HW_SIGNATURE_OR_SYSTEM, null, 4);
        } else {
            registerReceiver(this.mNetworkBroadcastReceiver, intentFilter, WebViewActivity.HW_SIGNATURE_OR_SYSTEM, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnalyticsH5Event(int i, String str) {
        g gVar = this.mAnalyticsH5Event;
        if (gVar != null) {
            gVar.a(i, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNetworkAvailablePage() {
        u4.c(this.mNoNetWorkLayout, 8);
        u4.c(this.mBtnNetSetting, 8);
        u4.c(this.mTvTitle, 0);
        u4.c(this.mMainLayout, 0);
        u4.c(this.mLoadingLayout, 0);
    }

    private void showNoNetOrContent() {
        if (CommonUtils.C()) {
            loadSafeUrl(this.mWebSource);
            return;
        }
        this.mNoNetWorkLayout.setVisibility(0);
        this.mMainLayout.setVisibility(8);
        this.mLoadingLayout.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNoNetworkPage() {
        HwLog.i(TAG, "showNoNetworkPage");
        u4.c(this.mNoNetWorkLayout, 0);
        u4.c(this.mLoadingLayout, 8);
        u4.c(this.mMainLayout, 8);
        u4.c(this.mTvTitle, 8);
        u4.c(this.mBtnNetSetting, 0);
        this.mNoNetworkTips.setGravity(17);
        this.mNoNetworkTips.setText(getString(R.string.IDS_hwh_home_healthshop_no_net_work_pls_click_again));
        this.mTipsImageView.setBackgroundResource(R.drawable.watchface_ic_network);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNoServicePage() {
        HwLog.i(TAG, "showNoServicePage");
        u4.c(this.mNoNetWorkLayout, 0);
        u4.c(this.mLoadingLayout, 8);
        u4.c(this.mMainLayout, 8);
        u4.c(this.mTvTitle, 8);
        u4.c(this.mBtnNetSetting, 8);
        this.mNoNetworkTips.setGravity(17);
        this.mNoNetworkTips.setText(getString(R.string.IDS_hwh_home_healthshop_unable_connect_server_tips));
        this.mTipsImageView.setBackgroundResource(R.drawable.watchface_ic_network);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showOpenBrowserDialog(final String str) {
        BackgroundTaskUtils.postInMainThread(new Runnable() { // from class: com.huawei.watchface.mvp.ui.activity.WatchfaceUrlActivityV1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$showOpenBrowserDialog$4(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showServerErrorPage() {
        HwLog.i(TAG, "showServerErrorPage");
        u4.c(this.mNoNetWorkLayout, 0);
        u4.c(this.mLoadingLayout, 8);
        u4.c(this.mMainLayout, 8);
        u4.c(this.mBtnNetSetting, 8);
        this.mNoNetworkTips.setGravity(17);
        this.mNoNetworkTips.setText(getString(R.string.IDS_hwh_home_healthshop_servers_error));
        this.mTipsImageView.setBackgroundResource(R.drawable.watchface_ic_network);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSslErrorTipsPage() {
        HwLog.i(TAG, "showSslErrorTipsPage");
        u4.c(this.mNoNetWorkLayout, 0);
        u4.c(this.mLoadingLayout, 8);
        u4.c(this.mMainLayout, 8);
        u4.c(this.mBtnNetSetting, 8);
        this.mNoNetworkTips.setGravity(0);
        this.mNoNetworkTips.setText(getString(R.string.IDS_hwh_home_healthshop_unable_connect_server_tips));
        this.mTipsImageView.setBackgroundResource(R.drawable.watchface_ic_abnormal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showUnstableNetworkPage() {
        HwLog.i(TAG, "showNoServicePage");
        u4.c(this.mNoNetWorkLayout, 0);
        u4.c(this.mLoadingLayout, 8);
        u4.c(this.mMainLayout, 8);
        u4.c(this.mBtnNetSetting, 8);
        this.mNoNetworkTips.setGravity(17);
        this.mNoNetworkTips.setText(getString(R.string.network_unstable_notice2));
        this.mTipsImageView.setBackgroundResource(R.drawable.watchface_ic_network);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showWatchFaceServerRetryPage() {
        HwLog.i(TAG, "showWatchFaceServerRetryPage");
        u4.c(this.mNoNetWorkLayout, 0);
        u4.c(this.mLoadingLayout, 8);
        u4.c(this.mMainLayout, 8);
        u4.c(this.mBtnNetSetting, 8);
        this.mNoNetworkTips.setGravity(17);
        this.mNoNetworkTips.setText(getString(R.string.IDS_watchface_server_retry));
        this.mTipsImageView.setBackgroundResource(R.drawable.watchface_ic_network);
    }

    private void unregisterNetworkReceiver() {
        try {
            unregisterReceiver(this.mNetworkBroadcastReceiver);
        } catch (Exception e) {
            HwLog.e(TAG, "unregisterNetworkReceiver" + HwLog.printException(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTitle(Object obj) {
        if (obj == null || !(obj instanceof String)) {
            return;
        }
        this.mTitle = (String) obj;
        FlavorConfig.safeHwLog(TAG, "updateTitle title:" + this.mTitle);
        if (TextUtils.isEmpty(this.mTitle) || UrlUtil.isHttpsUrl(this.mTitle) || UrlUtil.isHttpUrl(this.mTitle)) {
            return;
        }
        u4.a(this.mTvTitle, this.mTitle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uploadH5LoadUrl() {
        g gVar = this.mAnalyticsH5Event;
        if (gVar == null || gVar.k() == null) {
            return;
        }
        g gVar2 = this.mAnalyticsH5Event;
        m.a(gVar2, gVar2.o());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        goBack();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view != null && view == this.mBtnNetSetting) {
            CommonUtils.i(this.mContext);
        }
    }

    @Override // com.huawei.watchface.mvp.base.BaseActivity, com.huawei.secure.android.common.activity.SafeFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mContext = this;
        this.mHandler = new a(this);
        initIntent();
        if (CommonUtils.j(this.mContext.getApplicationContext())) {
            setContentView(R.layout.watchface_fragment_web_view_error_1);
            initErrorView();
        } else {
            setContentView(R.layout.watchface_activity_url_item);
            HwLog.i(TAG, "onCreate()");
            initView();
        }
    }

    @Override // com.huawei.watchface.mvp.base.BaseActivity, com.huawei.secure.android.common.activity.SafeFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        HwLog.i(TAG, "onDestroy");
        SafeHandler safeHandler = this.mHandler;
        if (safeHandler != null) {
            safeHandler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
        destroyWebView();
        unregisterNetworkReceiver();
        super.onDestroy();
    }

    @Override // com.huawei.secure.android.common.activity.SafeFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        initIntent();
        initView();
    }

    @Override // com.huawei.watchface.mvp.base.BaseActivity, com.huawei.secure.android.common.activity.SafeFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        registerNetworkReceiver();
    }

    @Override // com.huawei.watchface.mvp.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
