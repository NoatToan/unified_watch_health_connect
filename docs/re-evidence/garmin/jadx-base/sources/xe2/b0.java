package xe2;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.garmin.android.apps.connectmobile.R;
import java.net.URL;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxe2/b0;", "Landroid/webkit/WebViewClient;", "<init>", "()V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class b0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f190450a;

    public b0() {
        re2.l0.f152316a.getClass();
        this.f190450a = re2.l0.c("CustomWebViewClient");
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        this.f190450a.debug("onLoadResource: ".concat(str));
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        this.f190450a.debug("onPageFinished: ".concat(str));
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        str.getClass();
        this.f190450a.debug("onPageStarted: ".concat(str));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        this.f190450a.error("onReceivedError: " + webResourceRequest.getUrl() + "\nerror - " + webResourceError.getErrorCode() + " (" + ((Object) webResourceError.getDescription()) + ")");
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceResponse.getClass();
        String strValueOf = String.valueOf(webResourceRequest.getUrl());
        if (d53.u.p(strValueOf, ".ico", true)) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            return;
        }
        int statusCode = webResourceResponse.getStatusCode();
        Logger logger = this.f190450a;
        if (statusCode != 429) {
            logger.error("onReceivedHttpError: " + statusCode + StringUtils.SPACE + strValueOf);
            return;
        }
        Context context = webView.getContext();
        if (context != null) {
            ds.e0.u("handle429: showing dialog, url [", strValueOf, "]", logger);
            n0.a(context, context.getString(R.string.mobile_auth_title_unable_to_continue), tn.k.g(context.getString(R.string.mobile_auth_msg_sign_in_attempt_failed), "\nERR: 429"), null, null, null, null, 120);
        } else {
            ds.e0.u("handle429: view or context is null, cannot show dialog, url [", strValueOf, "]", logger);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        webView.getClass();
        sslErrorHandler.getClass();
        sslError.getClass();
        this.f190450a.error("onReceivedSslError: " + sslError);
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        webView.getClass();
        renderProcessGoneDetail.getClass();
        this.f190450a.error("onRenderProcessGone: didCrash - " + renderProcessGoneDetail.didCrash());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i14, SafeBrowsingResponse safeBrowsingResponse) {
        webView.getClass();
        webResourceRequest.getClass();
        safeBrowsingResponse.getClass();
        this.f190450a.warn("onSafeBrowsingHit: " + webResourceRequest.getUrl() + "\nthreat type - " + i14);
        safeBrowsingResponse.showInterstitial(true);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String path;
        String host;
        Logger logger = this.f190450a;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (path = url.getPath()) != null && webView != null && !d53.w.z(path, "reconsentPrivacyPolicy", false) && (d53.w.z(path, "privacy", true) || d53.w.z(path, "legal/terms-of-use", true) || d53.w.z(path, "/terms", true) || ((host = url.getHost()) != null && d53.w.z(host, "support.garmin.", true)))) {
            try {
                URL url2 = new URL(url.toString());
                Context context = webView.getContext();
                context.getClass();
                re2.g0.b(url2, context);
                logger.debug("shouldOverrideUrlLoading: YES, loaded [{}] into external app/browser", url);
                return true;
            } catch (ActivityNotFoundException unused) {
                logger.warn("shouldOverrideUrlLoading: YES, but no activity found for handling [" + url + "], so will load into this webview instead");
            }
        }
        return false;
    }
}
