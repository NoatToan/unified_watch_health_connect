package com.huawei.watchface.mvp.ui.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.DialogFragment;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.secure.android.common.ssl.WebViewSSLCheck;
import com.huawei.secure.android.common.webview.SafeWebSettings;
import com.huawei.secure.android.common.webview.SafeWebView;
import com.huawei.secure.android.common.webview.WebViewLoadCallBack;
import com.huawei.watchface.R;
import com.huawei.watchface.api.WebViewActivity;
import com.huawei.watchface.b3;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.g4;
import com.huawei.watchface.k4;
import com.huawei.watchface.mvp.model.helper.JsSafeUrlSystemParamManager;
import com.huawei.watchface.mvp.model.webview.JSInterface;
import com.huawei.watchface.mvp.model.webview.JsInteractAddition;
import com.huawei.watchface.mvp.model.webview.JsInterfaceMarketing;
import com.huawei.watchface.n1;
import com.huawei.watchface.t4;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WebViewUtils;
import com.huawei.watchface.utils.constants.WatchFaceConstant;

/* JADX INFO: loaded from: classes45.dex */
public class BottomVipPayDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f30402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SafeWebView f30403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30404c = true;
    public String d;

    public BottomVipPayDialogFragment() {
    }

    public void a(JSInterface jSInterface) {
        HwLog.d("BottomPayDialogFragment", "BottomVipPayDialogFragment1 addJavascriptInterface");
        Object tag = this.f30403b.getTag();
        if (tag != null && ((Boolean) tag).booleanValue()) {
            HwLog.e("BottomPayDialogFragment", "mWebView set JSInterface again");
            return;
        }
        jSInterface.setMagicWebView(this.f30403b);
        this.f30403b.addJavascriptInterface(jSInterface, "JsInteraction");
        JsInterfaceMarketing jsInterfaceMarketing = new JsInterfaceMarketing(this.f30402a);
        jsInterfaceMarketing.setWebView(this.f30403b);
        this.f30403b.addJavascriptInterface(jsInterfaceMarketing, WatchFaceConstant.JS_INTERFACE);
        this.f30403b.setTag(Boolean.TRUE);
    }

    public void b(String str) {
        this.d = str;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        super.dismiss();
        HwLog.i("BottomPayDialogFragment", "dismiss enter");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.MatchWidthDialog);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getWindow().setGravity(80);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.watchface_choose_buy_vip_layout_webview, viewGroup, false);
        a(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        HwLog.i("BottomPayDialogFragment", "onDismiss enter");
        JsInteractAddition.getInstance().a((WebView) null);
        WebViewUtils.a(this.f30403b);
        this.f30403b = null;
        this.f30404c = true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (getActivity() != null && getActivity().getWindowManager() != null && getActivity().getWindowManager().getDefaultDisplay() != null) {
            getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        }
        if (getDialog() == null || getDialog().getWindow() == null) {
            return;
        }
        int i = displayMetrics.heightPixels;
        int iA = a("status_bar_height");
        int iA2 = Build.VERSION.SDK_INT >= 35 ? a("navigation_bar_height") : 0;
        HwLog.i("BottomPayDialogFragment", "statusBarHeight:" + iA + ", navigationBarHeight:" + iA2);
        getDialog().getWindow().setLayout(-1, (i - iA) - iA2);
    }

    public final void b() {
        if (TextUtils.isEmpty(this.d)) {
            HwLog.i("BottomPayDialogFragment", "url is empty");
            dismiss();
            return;
        }
        FlavorConfig.safeHwLog("BottomPayDialogFragment", "mUrl:" + this.d);
        if (!CommonUtils.C()) {
            k4.a(R.string.IDS_network_connect_error);
            dismiss();
            return;
        }
        g4 g4VarC = b3.b().c();
        if (g4VarC == null || !g4VarC.a(this.d)) {
            HwLog.i("BottomPayDialogFragment", "Url verify fail");
            dismiss();
        } else {
            a(true);
            this.f30403b.loadUrl(this.d);
        }
    }

    public BottomVipPayDialogFragment(Context context) {
        this.f30402a = context;
    }

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            HwLog.i("BottomPayDialogFragment", "onPageFinished");
            JsSafeUrlSystemParamManager.getInstance().d(WebViewUtils.a((WebView) BottomVipPayDialogFragment.this.f30403b));
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            HwLog.i("BottomPayDialogFragment", "onPageStarted isFirstLoad:" + BottomVipPayDialogFragment.this.f30404c);
            JsSafeUrlSystemParamManager.getInstance().d(WebViewUtils.a((WebView) BottomVipPayDialogFragment.this.f30403b));
            g4 g4VarC = b3.b().c();
            if (g4VarC != null && !g4VarC.c(str)) {
                HwLog.e("BottomPayDialogFragment", "onPageStarted url is not in white list");
                webView.stopLoading();
                return;
            }
            BottomVipPayDialogFragment bottomVipPayDialogFragment = BottomVipPayDialogFragment.this;
            if (bottomVipPayDialogFragment.f30404c) {
                bottomVipPayDialogFragment.f30404c = false;
                return;
            }
            Activity activity = WebViewActivity.getActivity();
            if (activity == null) {
                HwLog.i("BottomPayDialogFragment", "onPageStarted activity is null");
            } else if (!(activity instanceof WebViewActivity)) {
                HwLog.i("BottomPayDialogFragment", "onPageStarted activity is not WebViewActivity");
            } else {
                BottomVipPayDialogFragment.this.dismiss();
                ((WebViewActivity) activity).startLoadUrl(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            HwLog.e("BottomPayDialogFragment", "on received ssl error");
            if (sslError != null) {
                WebViewSSLCheck.checkServerCertificateNew(sslErrorHandler, sslError, BottomVipPayDialogFragment.this.f30402a);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!TextUtils.isEmpty(str)) {
                return BottomVipPayDialogFragment.this.a(webView, str);
            }
            HwLog.w("BottomPayDialogFragment", "load url is null");
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            n1.a(BottomVipPayDialogFragment.this.f30402a, webView);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                HwLog.w("BottomPayDialogFragment", "shouldOverrideUrlLoading() load url request is null");
                return false;
            }
            if (t4.a(webResourceRequest.getUrl().toString())) {
                HwLog.e("BottomPayDialogFragment", "shouldOverrideUrlLoading() url contain xss char.");
                return true;
            }
            return BottomVipPayDialogFragment.this.a(webView, webResourceRequest.getUrl().toString());
        }
    }

    public final void a(View view) {
        SafeWebView safeWebView = (SafeWebView) view.findViewById(R.id.web_view);
        this.f30403b = safeWebView;
        a(safeWebView);
        a();
        a(new JSInterface(this.f30402a));
        b();
        SafeWebView safeWebView2 = this.f30403b;
        if (safeWebView2 != null) {
            safeWebView2.setBackgroundColor(0);
            this.f30403b.getBackground().setAlpha(0);
        }
    }

    public void a(boolean z) {
        HwLog.i("BottomPayDialogFragment", "setJsEnable isEnable:" + z);
        SafeWebView safeWebView = this.f30403b;
        if (safeWebView != null) {
            safeWebView.getSettings().setJavaScriptEnabled(z);
        }
    }

    public final void a(SafeWebView safeWebView) {
        if (safeWebView == null || Build.VERSION.SDK_INT < 29 || CommonUtils.isAndroid13()) {
            return;
        }
        safeWebView.getSettings().setForceDark(0);
    }

    public final void a() {
        HwLog.i("BottomPayDialogFragment", "initWebViewSettings");
        FlavorConfig.openWebviewDebugMode();
        WebSettings settings = this.f30403b.getSettings();
        settings.setCacheMode(2);
        settings.setAllowFileAccess(false);
        settings.setGeolocationEnabled(false);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        String userAgentString = this.f30403b.getSettings().getUserAgentString();
        this.f30403b.getSettings().setUserAgentString(userAgentString + "; HuaweiHealth");
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(false);
        settings.setTextZoom(100);
        settings.setLoadWithOverviewMode(true);
        settings.setMixedContentMode(2);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f30403b, true);
        this.f30403b.setWebViewLoadCallBack(new WebViewLoadCallBack() { // from class: com.huawei.watchface.mvp.ui.dialog.BottomVipPayDialogFragment$$ExternalSyntheticLambda0
            @Override // com.huawei.secure.android.common.webview.WebViewLoadCallBack
            public final void onCheckError(String str, WebViewLoadCallBack.ErrorCode errorCode) {
                HwLog.e("BottomPayDialogFragment", "initWebViewSettingsEvent -- onCheckError: " + errorCode);
            }
        });
        SafeWebSettings.initWebviewAndSettings(this.f30403b);
        this.f30403b.setWebViewClient(new a(), false);
    }

    public final boolean a(WebView webView, String str) {
        if (webView != null) {
            g4 g4VarC = b3.b().c();
            if (g4VarC != null && !g4VarC.c(str)) {
                HwLog.e("BottomPayDialogFragment", "openApkToHandleUrl url is not in white list");
                return true;
            }
            webView.loadUrl(str);
        }
        return true;
    }

    public final int a(String str) {
        int identifier = getResources().getIdentifier(str, "dimen", OsType.ANDROID);
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
