package com.huami.passport.auth;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.huami.passport.AccountManager;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.auth.AuthorizeLoader;
import com.huami.passport.auth.net.HeaderParams;
import com.huami.passport.entity.SingInfo;
import com.huami.passport.entity.Token;
import com.huami.passport.utils.Utils;
import com.huami.tools.log.HMLog;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AuthorizeLoader implements IAccount.Callback<String, IError> {
    private IAccount.Callback<String, IError> mCallback;
    private String mCustomAuthUrl;
    private String mHost;
    private WebSettings mSettings;
    private boolean mTestMode;
    private WebView mWebView;
    private WebViewClient mWebViewClient;
    private String redirectUri;

    /* JADX INFO: renamed from: com.huami.passport.auth.AuthorizeLoader$1, reason: invalid class name */
    public class AnonymousClass1 implements IAccount.Callback<Token, ErrorCode> {
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ String val$url;

        public AnonymousClass1(Context context, String str, IAccount.Callback callback) {
            this.val$context = context;
            this.val$url = str;
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onError$0(ErrorCode errorCode) {
            return "displayWebPage getToken error:" + errorCode;
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onError(final ErrorCode errorCode) {
            HMLog.error(new Function0() { // from class: com.huami.passport.auth.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AuthorizeLoader.AnonymousClass1.lambda$onError$0(errorCode);
                }
            });
            this.val$callback.onError(IError.EC_10002);
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onSuccess(final Token token) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huami.passport.auth.AuthorizeLoader.1.1
                @Override // java.lang.Runnable
                public void run() {
                    Map<String, String> map = HeaderParams.get(AnonymousClass1.this.val$context);
                    map.put("apptoken", token.getAccessToken());
                    AuthorizeLoader.this.mWebView.loadUrl(AnonymousClass1.this.val$url, map);
                }
            });
        }
    }

    public static class AuthorizeWebViewClient extends WebViewClient {
        private AuthorizeLoader mLoader;

        public AuthorizeWebViewClient(AuthorizeLoader authorizeLoader) {
            this.mLoader = authorizeLoader;
        }

        private void error(IError iError) {
            AuthorizeLoader authorizeLoader = this.mLoader;
            if (authorizeLoader != null) {
                authorizeLoader.onError(iError);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onPageFinished$3(String str) {
            return "onPageFinished " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onPageStarted$2(String str) {
            return "onPageStarted " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onReceivedError$0(int i, String str, String str2) {
            return "onReceivedError,errorCode:" + i + " description:" + str + " failingUrl:" + str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onReceivedSslError$1(SslError sslError) {
            return "onReceivedSslError SslError:" + sslError;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$shouldOverrideUrlLoading$4(String str) {
            return "shouldOverrideUrlLoading " + str;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, final String str) {
            HMLog.debug(new Function0() { // from class: ck
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AuthorizeLoader.AuthorizeWebViewClient.lambda$onPageFinished$3(str);
                }
            });
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, final String str, Bitmap bitmap) {
            HMLog.debug(new Function0() { // from class: dk
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AuthorizeLoader.AuthorizeWebViewClient.lambda$onPageStarted$2(str);
                }
            });
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, final int i, final String str, final String str2) {
            super.onReceivedError(webView, i, str, str2);
            HMLog.error(new Function0() { // from class: ak
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AuthorizeLoader.AuthorizeWebViewClient.lambda$onReceivedError$0(i, str, str2);
                }
            });
            error(IError.EC_10005);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, final SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            HMLog.error(new Function0() { // from class: bk
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AuthorizeLoader.AuthorizeWebViewClient.lambda$onReceivedSslError$1(sslError);
                }
            });
            error(IError.EC_10005);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, final String str) {
            HMLog.debug(new Function0() { // from class: ek
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AuthorizeLoader.AuthorizeWebViewClient.lambda$shouldOverrideUrlLoading$4(str);
                }
            });
            try {
                if (!str.contains(this.mLoader.getRedirectUri())) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                this.mLoader.onSuccess(str);
                return true;
            } catch (Exception unused) {
                error(IError.EC_10002);
                return true;
            }
        }
    }

    public AuthorizeLoader(WebView webView) {
        if (webView == null) {
            throw new IllegalArgumentException("WebView should not be null");
        }
        this.mWebView = webView;
        WebSettings settings = webView.getSettings();
        this.mSettings = settings;
        settings.setJavaScriptEnabled(true);
        this.mSettings.setSavePassword(false);
        this.mSettings.setSaveFormData(false);
        AuthorizeWebViewClient authorizeWebViewClient = new AuthorizeWebViewClient(this);
        this.mWebViewClient = authorizeWebViewClient;
        this.mWebView.setWebViewClient(authorizeWebViewClient);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$displayWebPage$0() {
        return "third app code signature is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$displayWebPage$1() {
        return "signature is not the same";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$displayWebPage$2(String str) {
        return "displayWebPage url:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$displayWebPage$3() {
        return "The user is not logged in";
    }

    public void displayWebPage(String str, Uri uri, IAccount.Callback<String, IError> callback) {
        final String str2;
        if (callback == null) {
            return;
        }
        this.mCallback = callback;
        if (!Protocol.verifyUri(uri, Protocol.ACCESS_TOKEN_PATH)) {
            callback.onError(IError.EC_10001);
            return;
        }
        Context context = this.mWebView.getContext();
        SingInfo singInfo = Utils.getSingInfo(context, str);
        if (singInfo != null) {
            String keyHash = singInfo.getKeyHash();
            if (!TextUtils.isEmpty(keyHash)) {
                if (!TextUtils.equals(uri.getQueryParameter(Protocol.Params.PACKAGE_ID), str)) {
                    callback.onError(IError.EC_10003);
                    return;
                }
                if (!TextUtils.equals(keyHash, uri.getQueryParameter(Protocol.Params.CODE_SIGNATURE))) {
                    HMLog.error(new Function0() { // from class: yj
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AuthorizeLoader.lambda$displayWebPage$1();
                        }
                    });
                    callback.onError(IError.EC_10003);
                    return;
                }
                String str3 = this.mTestMode ? Protocol.AUTH_STAGING_HOST : Protocol.AUTH_HOST;
                if (!TextUtils.isEmpty(this.mHost)) {
                    str3 = this.mHost;
                }
                if (TextUtils.isEmpty(this.mCustomAuthUrl)) {
                    str2 = String.format(Protocol.AUTH_URL, str3, uri.getEncodedQuery());
                } else if (this.mCustomAuthUrl.contains("?")) {
                    str2 = this.mCustomAuthUrl + com.alipay.sdk.m.s.a.l + uri.getEncodedQuery();
                } else {
                    str2 = this.mCustomAuthUrl + "?" + uri.getEncodedQuery();
                }
                HMLog.info(new Function0() { // from class: wj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AuthorizeLoader.lambda$displayWebPage$2(str2);
                    }
                });
                AccountManager accountManager = AccountManager.getDefault(context);
                if (accountManager.isLogin()) {
                    setRedirectUri(uri.getQueryParameter("redirect_uri"));
                    accountManager.getToken(new AnonymousClass1(context, str2, callback));
                    return;
                } else {
                    HMLog.error(new Function0() { // from class: xj
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AuthorizeLoader.lambda$displayWebPage$3();
                        }
                    });
                    callback.onError(IError.EC_10004);
                    return;
                }
            }
        }
        HMLog.error(new Function0() { // from class: zj
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AuthorizeLoader.lambda$displayWebPage$0();
            }
        });
        callback.onError(IError.EC_10003);
    }

    public String getRedirectUri() {
        return this.redirectUri;
    }

    public WebSettings getWebSettings() {
        return this.mSettings;
    }

    public void setAuthHost(String str) {
        this.mHost = str;
    }

    public void setCustomAuthUrl(String str) {
        this.mCustomAuthUrl = str;
    }

    public void setRedirectUri(String str) {
        this.redirectUri = str;
    }

    public void setTestMode(boolean z) {
        this.mTestMode = z;
    }

    public void setWebViewClient(AuthorizeWebViewClient authorizeWebViewClient) {
        this.mWebView.setWebViewClient(authorizeWebViewClient);
    }

    @Override // com.huami.passport.IAccount.Callback
    public void onError(IError iError) {
        IAccount.Callback<String, IError> callback = this.mCallback;
        if (callback != null) {
            callback.onError(iError);
        }
    }

    @Override // com.huami.passport.IAccount.Callback
    public void onSuccess(String str) {
        IAccount.Callback<String, IError> callback = this.mCallback;
        if (callback != null) {
            callback.onSuccess(str);
        }
    }
}
