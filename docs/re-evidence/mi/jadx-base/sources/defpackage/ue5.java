package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.MarketUtil;
import com.xiaomi.fitness.webview.WebViewUtil;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;
import com.xiaomi.passport.servicetoken.ServiceTokenResult;
import com.xiaomi.wearable.yrn.export.YRNPushHandler;
import com.xiaomi.wearable.yrn.export.YRNPushHandlerExtKt;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class ue5 extends WebViewClient {
    private static final String TAG = "WebViewClient";
    private jz6 loginDisposable;
    private CommonDialog sslDialog;
    private WeakReference<iqc> webViewPageWeakReference;
    private float mCurrentScale = 1.0f;
    private boolean isLoadSuccess = false;
    private boolean isLoadError = false;
    private int RETRY_MAX_NUM = 20;
    private int mCurrentRefreshTokenCount = 0;
    private Context context = AppUtil.getApp().getApplicationContext();

    public class a extends av6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SslErrorHandler f35680a;

        public a(SslErrorHandler sslErrorHandler) {
            this.f35680a = sslErrorHandler;
        }

        @Override // defpackage.av6
        public void onDialogClick(String str, DialogInterface dialogInterface, int i) {
            if (i == -2) {
                this.f35680a.cancel();
            } else {
                if (i != -1) {
                    return;
                }
                ue5.this.proceed(this.f35680a);
            }
        }
    }

    public ue5(WeakReference<iqc> weakReference) {
        this.webViewPageWeakReference = weakReference;
    }

    private void autoLogin(final Context context, final String str) {
        WebViewUtil.releaseDisposable(this.loginDisposable);
        this.loginDisposable = o4h.f(new j5h() { // from class: re5
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) throws Exception {
                this.f32464a.lambda$autoLogin$0(context, str, v4hVar);
            }
        }).S(ofl.c()).H(ua1.c()).O(new bg4() { // from class: se5
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                this.f33560a.lambda$autoLogin$1((String) obj);
            }
        }, new bg4() { // from class: te5
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                ue5.lambda$autoLogin$2((Throwable) obj);
            }
        });
    }

    private boolean doOnLogOffAccount(Uri uri) {
        String queryParameter = uri.getQueryParameter("code");
        if (queryParameter == null) {
            return true;
        }
        int i = Integer.parseInt(queryParameter);
        if (i == 0) {
            String queryParameter2 = uri.getQueryParameter("message");
            if (getView() == null) {
                return true;
            }
            Intent intent = new Intent();
            intent.putExtra("MESSAGE", queryParameter2);
            getView().finishForResult(intent);
            return true;
        }
        String str = ":" + i;
        ToastExtKt.show(AppUtil.getApp(), AppUtil.getApp().getString(q1j.d) + str);
        if (getView() == null) {
            return true;
        }
        getView().finishFromWeb();
        return true;
    }

    private void doOnServerError() {
        iqc view = getView();
        this.isLoadError = true;
        this.isLoadSuccess = false;
        if (view != null) {
            view.showServerErrorView();
        }
    }

    private boolean doOverrideUrlLoading(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && !TextUtils.isEmpty(scheme)) {
            String path = uri.getPath();
            if (path != null && (path.endsWith(".apk") || path.endsWith(".APK") || path.endsWith(".pdf"))) {
                goToUriPage(uri);
                return true;
            }
            if (!"http".equals(scheme) && !Constants.URI_SCHEME.equals(scheme)) {
                if ("market".equals(scheme)) {
                    if (!MarketUtil.launchAppDetail(this.context, uri.getQueryParameter("id"))) {
                        ToastExtKt.toast(AppUtil.getApp(), q1j.i);
                    }
                    return true;
                }
                if (YRNPushHandlerExtKt.isVirtualPage(uri) && "mihealth".equals(scheme)) {
                    YRNPushHandlerExtKt.getInstance(YRNPushHandler.INSTANCE).handlePushRNPage(uri);
                    return true;
                }
                goToUriPage(uri);
                return true;
            }
            if ("/healthapp/privacy/logoff_service".equals(uri.getPath())) {
                return doOnLogOffAccount(uri);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$autoLogin$0(Context context, String str, v4h v4hVar) throws Exception {
        XiaomiAccountManager xiaomiAccountManager = XiaomiAccountManager.get(context);
        ServiceTokenResult serviceTokenResult = xiaomiAccountManager.getServiceToken(xiaomiAccountManager.getXiaomiAccount(), str, null).get();
        this.mCurrentRefreshTokenCount++;
        Logger.d(TAG, "autoLogin current refresh token count is " + this.mCurrentRefreshTokenCount + "serviceTokenResult is " + serviceTokenResult);
        if (serviceTokenResult == null) {
            if (v4hVar.isDisposed()) {
                return;
            }
            v4hVar.onError(new Exception(String.format("%s account service token result is null", "|WEBVIEW|")));
        } else if (serviceTokenResult.errorCode != ServiceTokenResult.ErrorCode.ERROR_NONE) {
            if (v4hVar.isDisposed()) {
                return;
            }
            v4hVar.onError(new Exception(String.format("%s service token result error code = %s error msg: %s", "|WEBVIEW|", serviceTokenResult.errorCode, serviceTokenResult.errorMessage)));
        } else {
            if (v4hVar.isDisposed()) {
                return;
            }
            if (serviceTokenResult.peeked) {
                serviceTokenResult = xiaomiAccountManager.refreshServiceToken(xiaomiAccountManager.getXiaomiAccount(), str, serviceTokenResult, null).get();
            }
            v4hVar.onNext(serviceTokenResult.serviceToken);
            v4hVar.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$autoLogin$1(String str) throws Exception {
        iqc view = getView();
        if (view != null) {
            Logger.d(TAG, "autoLogin serviceToken is " + str);
            view.loadUrl(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$autoLogin$2(Throwable th) throws Exception {
        Logger.i("|WEBVIEW|" + th.getMessage(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void proceed(SslErrorHandler sslErrorHandler) {
        try {
            sslErrorHandler.proceed();
            Logger.i(String.format("%s onReceivedSslError", "|WEBVIEW|"), new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            doOnServerError();
            Logger.i(String.format("%s,%s onReceivedSslError,exception:", "|WEBVIEW|", WebViewUtil.getThrowableString(e)), new Object[0]);
        }
    }

    private void showSslErrorDialog(SslErrorHandler sslErrorHandler) {
        CommonDialog commonDialog = this.sslDialog;
        if (commonDialog != null && commonDialog.isShowing()) {
            this.sslDialog.dismiss();
            this.sslDialog = null;
        }
        Object view = getView();
        if (view instanceof Activity) {
            CommonDialog commonDialogAddDialogCallback = new CommonDialog.c("ssl").setDialogTitle(q1j.m).setDialogDescription(q1j.l).setPositiveText(q1j.g).setNegativeText(q1j.c).create().addDialogCallback(new a(sslErrorHandler));
            this.sslDialog = commonDialogAddDialogCallback;
            commonDialogAddDialogCallback.showIfNeed(((FragmentActivity) view).getSupportFragmentManager());
        }
    }

    public void destroy() {
        WebViewUtil.releaseDisposable(this.loginDisposable);
    }

    public float getScale() {
        return this.mCurrentScale;
    }

    public iqc getView() {
        WeakReference<iqc> weakReference = this.webViewPageWeakReference;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void goToUriPage(Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (intent.resolveActivity(this.context.getPackageManager()) != null) {
                intent.setFlags(268435456);
                this.context.startActivity(intent);
            } else {
                Logger.i(TAG, "cannot find page");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isLoadSuccess() {
        return this.isLoadSuccess;
    }

    public boolean onLoadFinish() {
        boolean z = !this.isLoadError;
        this.isLoadSuccess = z;
        this.isLoadError = false;
        return z;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        StringBuilder sb = new StringBuilder();
        sb.append("onPageStarted: ");
        sb.append(str);
        sb.append(":::::");
        sb.append(CookieManager.getInstance().getCookie(str));
    }

    @Override // android.webkit.WebViewClient
    @SuppressLint({"DefaultLocale"})
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        Logger.d("|WEBVIEW|onReceivedHttpAuthRequest", new Object[0]);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    @SuppressLint({"DefaultLocale"})
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        int statusCode = webResourceResponse.getStatusCode();
        Logger.i(String.format("%s onReceivedHttpError,statusCode:%d", "|WEBVIEW|", Integer.valueOf(statusCode)), new Object[0]);
        if (404 == statusCode || 500 == statusCode) {
            doOnServerError();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        super.onReceivedLoginRequest(webView, str, str2, str3);
        if ("com.xiaomi".equals(str)) {
            String str4 = "weblogin:" + str3;
            if (XiaomiAccountManager.get(this.context).getXiaomiAccount() != null && this.mCurrentRefreshTokenCount < this.RETRY_MAX_NUM) {
                autoLogin(this.context, str4);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        showSslErrorDialog(sslErrorHandler);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (renderProcessGoneDetail.didCrash()) {
            Logger.e("WebView", "渲染进程崩溃了");
        } else {
            Logger.w("WebView", "渲染进程因系统资源不足被杀死");
        }
        if (webView == null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) webView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
        super.onScaleChanged(webView, f, f2);
        this.mCurrentScale = f2;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("|WEBVIEW|shouldOverrideUrlLoading:" + str, new Object[0]);
        return doOverrideUrlLoading(Uri.parse(str));
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    @SuppressLint({"DefaultLocale"})
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        int errorCode = webResourceError.getErrorCode();
        Logger.i(String.format("%s onReceivedError,errorCode:%d", "|WEBVIEW|", Integer.valueOf(errorCode)), new Object[0]);
        if (webResourceRequest.isForMainFrame()) {
            this.isLoadError = true;
            this.isLoadSuccess = false;
            if (errorCode == -6 || errorCode == -8) {
                iqc view = getView();
                if (view != null) {
                    view.showNoNetView();
                    return;
                }
                return;
            }
            iqc view2 = getView();
            if (view2 != null) {
                view2.hideNoNetView();
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.i("|WEBVIEW|shouldOverrideUrlLoading:" + webResourceRequest.getUrl(), new Object[0]);
        return doOverrideUrlLoading(webResourceRequest.getUrl());
    }
}
