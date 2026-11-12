package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.ProxyConfig;
import com.huawei.hwidauth.h.a;
import com.huawei.hwidauth.ui.f;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.secure.android.common.ssl.WebViewSSLCheck;
import com.huawei.secure.android.common.webview.SafeWebView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class nok extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private not f43361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SafeWebView f43362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f43363c;
    private f.b d;
    private nog e;

    public nok(nog nogVar, Context context, SafeWebView safeWebView, not notVar, f.b bVar) {
        this.f43362b = safeWebView;
        this.f43363c = context;
        this.f43361a = notVar;
        this.e = nogVar;
        this.d = bVar;
        nox.b("SafeWebViewClient", "SafeWebViewClient start.", true);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        nox.a("SafeWebViewClient", "onReceivedSslError:" + sslError, false);
        nox.b("SafeWebViewClient", "is not joint debug. check server certificate", true);
        WebViewSSLCheck.checkServerCertificateNew(sslErrorHandler, sslError, this.f43363c);
        this.d.a(2015, "server certificate error");
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        nox.b("SafeWebViewClient", "shouldOverrideUrlLoading", true);
        nox.b("SafeWebViewClient", "enter shouldOverrideUrlLoading url: " + str, false);
        if ("from_other_app_signin".equalsIgnoreCase(this.e.d()) && this.e.k(str)) {
            nox.b("SafeWebViewClient", "shouldOverrideUrlLoading sign contains service", false);
            noj.b(this.f43363c, 907115001, 200, "loginSuccess", this.e.h(), "accountPickerH5.signIn_v3", "api_ret");
            if (this.e.n(str)) {
                return true;
            }
        }
        if ("open_personal_info".equalsIgnoreCase(this.e.d()) && !str.contains("ticket")) {
            nox.b("SafeWebViewClient", "PersonalInfoGoBack", true);
            if (a(webView)) {
                nox.b("SafeWebViewClient", "PersonalInfoGoBack true", true);
                return false;
            }
        }
        if (this.e.g(str) || this.e.m(str)) {
            return false;
        }
        HashMap<String, String> mapJ = this.e.j(str);
        if (str.contains("service/windex")) {
            mapJ.put("Referer", a.a().n());
        }
        a((SafeWebView) webView, str, mapJ);
        nox.b("SafeWebViewClient", "shouldOverrideUrlLoading map = " + mapJ.toString(), false);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponseA;
        String string = webResourceRequest.getUrl().toString();
        return (!d(string) || (webResourceResponseA = a(string)) == null) ? super.shouldInterceptRequest(webView, webResourceRequest) : webResourceResponseA;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        nox.b("SafeWebViewClient", "onPageFinished-", true);
        super.onPageFinished(webView, str);
        this.d.c(str);
        b();
    }

    private WebResourceResponse a(String str) {
        WebResourceResponse webResourceResponseD;
        if (!this.f43361a.e(str) || (webResourceResponseD = this.f43361a.d(str)) == null) {
            return null;
        }
        return webResourceResponseD;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    private boolean a(WebView webView) {
        String url;
        WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
        if (webBackForwardListCopyBackForwardList != null && webBackForwardListCopyBackForwardList.getSize() > 0) {
            nox.b("SafeWebViewClient", "PersonalInfo historyList is no empty", true);
            WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex());
            if (itemAtIndex != null) {
                url = itemAtIndex.getUrl();
            } else {
                url = "";
            }
        } else {
            url = "";
        }
        return url.contains("ticket");
    }

    private void b() {
        if ("from_signin".equalsIgnoreCase(this.e.d()) || "from_v3_signin".equalsIgnoreCase(this.e.d())) {
            this.e.a();
        }
    }

    private boolean d(String str) {
        String strC = npj.c(str);
        if (!TextUtils.isEmpty(str) && (ProxyConfig.MATCH_HTTPS.equals(strC) || "http".equals(strC) || com.huawei.hwcloudjs.g.a.f17122c.equals(strC) || "mqq".equals(strC) || "weixin".equals(strC) || "wtloginmqq".equals(strC))) {
            return this.f43362b.isWhiteListUrl(str);
        }
        nox.b("SafeWebViewClient", "is not a right url", true);
        return false;
    }

    private void a(SafeWebView safeWebView, String str, Map map) {
        if (e(str) && safeWebView.isWhiteListUrl(str)) {
            safeWebView.loadUrl(str, map);
        }
    }

    private boolean e(String str) {
        String strC = npj.c(str);
        if (!TextUtils.isEmpty(str) && (ProxyConfig.MATCH_HTTPS.equals(strC) || "http".equals(strC) || com.huawei.hwcloudjs.g.a.f17122c.equals(strC) || "mqq".equals(strC) || "weixin".equals(strC) || "wtloginmqq".equals(strC))) {
            return true;
        }
        nox.b("SafeWebViewClient", "is not a right url", true);
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        nox.e("SafeWebViewClient", "onReceivedError: " + (webResourceError != null ? webResourceError.getErrorCode() : Constants.COORDINATE_FAIL_DEF), true);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        nox.e("SafeWebViewClient", "onReceivedHttpError: " + (webResourceResponse != null ? webResourceResponse.getStatusCode() : Constants.COORDINATE_FAIL_DEF), true);
    }
}
