package com.huami.midong.webview.jsbridge;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.huami.midong.webview.jsbridge.JsBridgeStatusWebView;
import com.huami.midong.webview.jsbridge.client.ChromeWebViewClient;
import com.huami.midong.webview.jsbridge.client.StatusWebViewClient;
import com.huami.midong.webview.nativejsapi.IJsBridgeTitleCallback;
import com.huami.midong.webview.utils.UserAgent;
import com.huami.watch.jsbridge.R;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes11.dex */
public class JsBridgeStatusWebView extends RelativeLayout {
    private static final String TAG = "JsBridge-StatusWebView";
    private FragmentActivity mActivity;
    private View mErrorView;
    private View mLoadingView;
    private View mStatusView;
    private IJsBridgeTitleCallback mTitleCallback;
    private JsBridgeWebView mWebView;
    private FrameLayout mWebViewContent;

    public @interface WebPageStatus {
        public static final String ERROR = "error";
        public static final String FINISH = "finish";
        public static final String START = "start";
    }

    public JsBridgeStatusWebView(Context context) {
        super(context);
        initView(context);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void configWebSetting(WebSettings webSettings) {
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setAppCacheEnabled(false);
        webSettings.setCacheMode(2);
        if (Build.VERSION.SDK_INT >= 21) {
            webSettings.setMixedContentMode(2);
        }
        webSettings.setUserAgentString(UserAgent.getUserAgent(getContext(), webSettings.getUserAgentString()));
    }

    private void initView(Context context) {
        View.inflate(context, R.layout.watch_view_status_web_view, this);
        this.mWebViewContent = (FrameLayout) findViewById(R.id.status_web_view_content);
        this.mWebView = new JsBridgeWebView(context.getApplicationContext());
        this.mWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mWebViewContent.addView(this.mWebView);
        this.mStatusView = findViewById(R.id.status_layout);
        this.mLoadingView = findViewById(R.id.status_loading);
        this.mErrorView = findViewById(R.id.status_error);
        initWebView();
    }

    private void initWebView() {
        this.mWebView.setOnLongClickListener(new View.OnLongClickListener() { // from class: rj4
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return JsBridgeStatusWebView.lambda$initWebView$1(view);
            }
        });
        configWebSetting(this.mWebView.getSettings());
        this.mWebView.setDefaultHandler(new JsBridgeDefaultHandler());
        this.mWebView.setWebViewClient(new StatusWebViewClient(getContext(), this));
        this.mWebView.setWebChromeClient(new ChromeWebViewClient(this));
        this.mWebView.setDownloadListener(new DownloadListener() { // from class: sj4
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                this.a.lambda$initWebView$2(str, str2, str3, str4, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$initWebView$1(View view) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initWebView$2(String str, String str2, String str3, String str4, long j) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        getContext().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadPage$0(String str, String str2) {
        Log.d(TAG, "load:%s callback data:&s", str, str2);
    }

    public FragmentActivity getActivity() {
        return this.mActivity;
    }

    public JsBridgeWebView getWeb() {
        return this.mWebView;
    }

    public void loadPage(final String str) {
        this.mWebView.loadUrl(str, new JsCallBackFunction() { // from class: tj4
            @Override // com.huami.midong.webview.jsbridge.JsCallBackFunction
            public final void onCallBack(String str2) {
                JsBridgeStatusWebView.lambda$loadPage$0(str, str2);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        JsBridgeWebView jsBridgeWebView = this.mWebView;
        if (jsBridgeWebView != null) {
            try {
                jsBridgeWebView.stopLoading();
                this.mWebView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
                this.mWebView.clearHistory();
                this.mWebView.clearCache(true);
                this.mWebViewContent.removeView(this.mWebView);
                this.mWebView.removeAllViews();
                this.mWebView.destroy();
            } catch (IllegalArgumentException e) {
                Log.e(TAG, e.getMessage(), new Object[0]);
            }
            this.mWebView = null;
        }
    }

    public void onPause() {
        this.mWebView.onPause();
        this.mWebView.pauseTimers();
    }

    public void onProgressChange(int i) {
        IJsBridgeTitleCallback iJsBridgeTitleCallback = this.mTitleCallback;
        if (iJsBridgeTitleCallback != null) {
            iJsBridgeTitleCallback.onProgressChange(i);
        }
    }

    public void onReceiveTitle(String str) {
        IJsBridgeTitleCallback iJsBridgeTitleCallback = this.mTitleCallback;
        if (iJsBridgeTitleCallback != null) {
            iJsBridgeTitleCallback.setTitleText(str);
        }
    }

    public void onResume() {
        this.mWebView.onResume();
        this.mWebView.resumeTimers();
    }

    public void onStatusChange(@WebPageStatus String str) {
        if ("start".equals(str)) {
            this.mStatusView.setVisibility(0);
            this.mErrorView.setVisibility(8);
            this.mLoadingView.setVisibility(0);
        } else if ("finish".equals(str)) {
            this.mStatusView.setVisibility(8);
        } else if ("error".equals(str)) {
            this.mStatusView.setVisibility(0);
            this.mErrorView.setVisibility(0);
            this.mLoadingView.setVisibility(8);
        }
    }

    public void setActivity(FragmentActivity fragmentActivity) {
        this.mActivity = fragmentActivity;
    }

    public void setTitleCallback(IJsBridgeTitleCallback iJsBridgeTitleCallback) {
        this.mTitleCallback = iJsBridgeTitleCallback;
    }

    public JsBridgeStatusWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public JsBridgeStatusWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    @TargetApi(21)
    public JsBridgeStatusWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initView(context);
    }
}
