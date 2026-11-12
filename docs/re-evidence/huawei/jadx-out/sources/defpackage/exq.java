package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.ProxyConfig;
import androidx.webkit.WebViewAssetLoader;
import com.huawei.health.h5pro.utils.EnvironmentHelper;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.vengine.H5ProAppLoadListener;
import com.huawei.health.h5pro.webkit.H5ProAppLoaderImp;
import com.huawei.health.h5pro.webkit.H5ProDeeplinkManager;
import com.huawei.health.h5pro.webkit.ResourceUtil;
import com.huawei.health.h5pro.webkit.WebKitInstance;
import com.huawei.health.h5pro.webkit.WebKitUtil;
import com.huawei.health.h5pro.webkit.trustlist.H5ProTrustListChecker;
import com.huawei.operation.utils.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class exq extends WebViewClient {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebKitInstance f33645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H5ProAppLoadListener f33646c;
    private WeakReference<H5ProAppLoaderImp> d;
    private exp e;

    public exq(WebKitInstance webKitInstance, H5ProAppLoadListener h5ProAppLoadListener) {
        this.f33645b = webKitInstance;
        this.f33646c = h5ProAppLoadListener;
    }

    private String d() {
        return LogUtil.getTag(this.f33645b, "WebViewClient");
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        LogUtil.i(d(), "shouldOverrideUrlLoading");
        Context context = webView.getContext();
        if (context == null) {
            LogUtil.w(d(), "context is null");
            return true;
        }
        if (WebKitUtil.c(str)) {
            return !WebKitUtil.d(context, str);
        }
        if (H5ProTrustListChecker.isWeChatPayUrl(str)) {
            HashMap map = new HashMap();
            map.put("Referer", this.f33645b.getUrl());
            webView.loadUrl(str, map);
            return true;
        }
        if (!H5ProTrustListChecker.isTrustedToLoad(str)) {
            LogUtil.w(d(), "untrusted -> " + str);
            return true;
        }
        if (WebKitUtil.e(str)) {
            return WebKitUtil.jumpToBrowser(context, str);
        }
        H5ProDeeplinkManager.jumpFromDeeplink(context, str);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        LogUtil.i(d(), "onPageStarted");
        if (H5ProTrustListChecker.disableHttpLoad(str)) {
            LogUtil.w(d(), "onPageStarted: disableHttpLoad -> " + str);
            WebKitUtil.e(webView);
            return;
        }
        WebKitInstance webKitInstance = this.f33645b;
        boolean zIsEnableSelfProtection = webKitInstance != null ? webKitInstance.isEnableSelfProtection() : false;
        if (!this.f33645b.isEmbedded() && (webView.getContext() instanceof Activity)) {
            Activity activity = (Activity) webView.getContext();
            if (GeneralUtil.isShouldSelfProtection(activity, str, this.f33645b.getSafeUrls(), zIsEnableSelfProtection)) {
                activity.getWindow().addFlags(8192);
            } else {
                activity.getWindow().clearFlags(8192);
            }
        }
        this.f33646c.onNewPageStartLoad(this.f33645b, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        LogUtil.i(d(), "onPageFinished");
        String title = webView.getTitle();
        WebKitInstance webKitInstance = this.f33645b;
        if (!webKitInstance.isTitleValid(title)) {
            title = "";
        }
        webKitInstance.updateTitle(title);
        H5ProAppLoaderImp h5ProAppLoaderImp = (H5ProAppLoaderImp) GeneralUtil.getReferent(this.d);
        if (h5ProAppLoaderImp != null) {
            h5ProAppLoaderImp.b(webView, str);
        }
        this.f33646c.onNewPageLoaded(this.f33645b, str);
        this.f33646c.onProgressChanged(this.f33645b, 100);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String strD = d();
        Locale locale = Locale.ROOT;
        boolean zIsForMainFrame = webResourceRequest.isForMainFrame();
        int errorCode = webResourceError.getErrorCode();
        LogUtil.i(strD, String.format(locale, "onReceivedError: %s, %s, %s", Boolean.valueOf(zIsForMainFrame), Integer.valueOf(errorCode), webResourceError.getDescription()));
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest.isForMainFrame()) {
            this.f33646c.onException(this.f33645b, webResourceError.getDescription().toString());
        }
        Uri url = webResourceRequest.getUrl();
        if (url == null || !url.toString().startsWith(ProxyConfig.MATCH_HTTPS)) {
            return;
        }
        this.f33646c.onResourceLoadErr(this.f33645b, url.toString(), webResourceError.getErrorCode());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String strD = d();
        Locale locale = Locale.ROOT;
        int statusCode = webResourceResponse.getStatusCode();
        LogUtil.i(strD, String.format(locale, "onReceivedHttpError: %s, %s", Integer.valueOf(statusCode), webResourceResponse.getReasonPhrase()));
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            this.f33646c.onResourceLoadErr(this.f33645b, url.toString(), webResourceResponse.getStatusCode());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        LogUtil.i(d(), "onReceivedSslError");
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponseC;
        Uri url = webResourceRequest.getUrl();
        String string = url.toString();
        if (TextUtils.isEmpty(string)) {
            LogUtil.w(d(), "shouldInterceptRequest: url is empty");
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        String strD = d();
        StringBuilder sb = new StringBuilder("shouldInterceptRequest: ");
        sb.append((Object) ((EnvironmentHelper.getInstance().getBuildType() == EnvironmentHelper.BuildType.TEST || EnvironmentHelper.getInstance().getBuildType() == EnvironmentHelper.BuildType.DEBUG) ? string : TextUtils.concat("*****", url.getPath())));
        LogUtil.i(strD, sb.toString());
        if (H5ProTrustListChecker.isRequestProxyNeeded(string) && (webResourceResponseC = ResourceUtil.c(webResourceRequest, "application/json")) != null) {
            return webResourceResponseC;
        }
        WebKitInstance webKitInstance = this.f33645b;
        if (webKitInstance == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        H5ProAppInfo appInfo = webKitInstance.getAppInfo();
        if (ResourceUtil.d(string)) {
            return ResourceUtil.e(appInfo, this.f33645b.getUrl(), string, webView.getContext());
        }
        if (this.e == null) {
            this.e = new exp();
        }
        if (this.e.b(appInfo, this.f33645b.getUrl(), string, webView.getContext())) {
            return this.e.e(string);
        }
        if (ResourceUtil.d(webResourceRequest)) {
            if (this.f33645b.isDisableImageProxy() || ResourceUtil.e(webResourceRequest)) {
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
            if (this.f33645b.isEnableImageCache() || ResourceUtil.b(webResourceRequest)) {
                WebResourceResponse webResourceResponseD = ResourceUtil.d(string, webView);
                if (webResourceResponseD != null) {
                    return webResourceResponseD;
                }
            } else {
                WebResourceResponse webResourceResponseC2 = ResourceUtil.c(webResourceRequest);
                if (webResourceResponseC2 != null) {
                    return webResourceResponseC2;
                }
            }
        }
        if (appInfo == null || appInfo.getH5ProAppType() == H5ProAppInfo.H5ProAppType.H5_LIGHT_APP || TextUtils.isEmpty(appInfo.getBaseUrl()) || !string.startsWith(appInfo.getBaseUrl())) {
            if (H5ProTrustListChecker.disableHttpLoad(string)) {
                LogUtil.w(d(), "shouldInterceptRequest: disableHttpLoad -> " + string);
                WebKitUtil.e(webView);
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        return a(string, appInfo, webView, webResourceRequest);
    }

    private WebResourceResponse a(String str, H5ProAppInfo h5ProAppInfo, WebView webView, WebResourceRequest webResourceRequest) {
        String baseUrl = h5ProAppInfo.getBaseUrl();
        Context context = webView.getContext();
        if (context == null) {
            LogUtil.e(d(), "shouldInterceptRequest context is null");
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        if (WebKitUtil.b()) {
            File file = new File(context.getFilesDir(), "h5pro");
            if (!file.exists()) {
                boolean zMkdirs = file.mkdirs();
                LogUtil.i(d(), "shouldInterceptRequest(strict mode) mkdirs-> " + zMkdirs);
            }
            return new WebViewAssetLoader.Builder().setDomain(baseUrl.replace("https://", "")).addPathHandler("/h5pro/", new WebViewAssetLoader.InternalStoragePathHandler(context, file)).build().shouldInterceptRequest(webResourceRequest.getUrl());
        }
        if (str.startsWith(baseUrl)) {
            File externalFilesDir = context.getExternalFilesDir("");
            if (!externalFilesDir.exists()) {
                boolean zMkdirs2 = externalFilesDir.mkdirs();
                LogUtil.i(d(), "shouldInterceptRequest mkdirs-> " + zMkdirs2);
            }
            String string = TextUtils.concat(externalFilesDir.getAbsolutePath(), str.replace(baseUrl, "")).toString();
            try {
                String str2 = string.contains("#") ? string.split("#")[0] : string;
                return new WebResourceResponse(GeneralUtil.getMimeType(str2), StandardCharsets.UTF_8.name(), new FileInputStream(str2));
            } catch (IOException unused) {
                return super.shouldInterceptRequest(webView, c(webResourceRequest, Constants.PREFIX_FILE + string));
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        super.onReceivedClientCertRequest(webView, clientCertRequest);
        LogUtil.i(d(), "onReceivedClientCertRequest");
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        LogUtil.i(d(), "onReceivedHttpAuthRequest");
    }

    private WebResourceRequest c(final WebResourceRequest webResourceRequest, final String str) {
        return new WebResourceRequest() { // from class: exq.2
            @Override // android.webkit.WebResourceRequest
            public Uri getUrl() {
                return Uri.parse(str);
            }

            @Override // android.webkit.WebResourceRequest
            public boolean isForMainFrame() {
                return webResourceRequest.isForMainFrame();
            }

            @Override // android.webkit.WebResourceRequest
            public boolean isRedirect() {
                return webResourceRequest.isRedirect();
            }

            @Override // android.webkit.WebResourceRequest
            public boolean hasGesture() {
                return webResourceRequest.hasGesture();
            }

            @Override // android.webkit.WebResourceRequest
            public String getMethod() {
                return webResourceRequest.getMethod();
            }

            @Override // android.webkit.WebResourceRequest
            public Map<String, String> getRequestHeaders() {
                return webResourceRequest.getRequestHeaders();
            }
        };
    }

    public void c(H5ProAppLoaderImp h5ProAppLoaderImp) {
        this.d = new WeakReference<>(h5ProAppLoaderImp);
    }
}
