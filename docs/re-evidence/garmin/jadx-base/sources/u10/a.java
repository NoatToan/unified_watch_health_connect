package u10;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connectiq.requests.oauth.ConnectIQOAuthActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.ciq.http.requests.oauth.ConnectIQOAuthRequest;
import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import d53.u;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lu10/a;", "Landroid/webkit/WebViewClient;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConnectIQOAuthActivity f167725a;

    public a(ConnectIQOAuthActivity connectIQOAuthActivity) {
        this.f167725a = connectIQOAuthActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String strN = fb1.c.n("Load resource: ", str);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "ConnectIQOAuthActivity", strN);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        String strN = fb1.c.n("Page finished: ", str);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "ConnectIQOAuthActivity", strN);
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String strN = fb1.c.n("Page started: ", str);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "ConnectIQOAuthActivity", strN);
        if (str != null) {
            ConnectIQOAuthActivity connectIQOAuthActivity = this.f167725a;
            EditText editText = connectIQOAuthActivity.f31982a;
            if (editText == null) {
                s.m("addressBar");
                throw null;
            }
            editText.setText(str);
            ConnectIQOAuthRequest connectIQOAuthRequest = connectIQOAuthActivity.f31984c;
            if (connectIQOAuthRequest == null) {
                s.m("ciqRequest");
                throw null;
            }
            if (u.y(str, connectIQOAuthRequest.getResultUrl(), false)) {
                ConnectIQOAuthActivity.ca(connectIQOAuthActivity);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String str = "onReceivedError: URL=" + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + " error=" + (webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null) + StringUtils.SPACE + ((Object) (webResourceError != null ? webResourceError.getDescription() : null));
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "ConnectIQOAuthActivity", str);
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        i2.a.f(a2Var, "ConnectIQOAuthActivity", "show error dialog for main frame error: URL=" + webResourceRequest.getUrl() + " error=" + (webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null) + StringUtils.SPACE + ((Object) (webResourceError != null ? webResourceError.getDescription() : null)));
        int errorCode = webResourceError != null ? webResourceError.getErrorCode() : 500;
        int i14 = ConnectIQOAuthActivity.f31981g;
        this.f167725a.da().f167752b.j(g3.a.a(g3.f35298f, null, null, new h(GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.ResponseStatus.WEB_REQUEST_ERROR, errorCode, null), null, 11));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String str = "onReceivedHttpError: URL=" + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + " errorResponseCode=" + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "ConnectIQOAuthActivity", str);
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        i2.a.f(a2Var, "ConnectIQOAuthActivity", "show error dialog for main frame error: URL=" + webResourceRequest.getUrl() + " errorResponseCode=" + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null));
        int statusCode = webResourceResponse != null ? webResourceResponse.getStatusCode() : 500;
        int i14 = ConnectIQOAuthActivity.f31981g;
        this.f167725a.da().f167752b.j(g3.a.a(g3.f35298f, null, null, new h(GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.ResponseStatus.WEB_REQUEST_ERROR, statusCode, null), null, 11));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "ConnectIQOAuthActivity", "onReceivedSslError: SslError=" + sslError);
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, str);
        if (str != null) {
            ConnectIQOAuthActivity connectIQOAuthActivity = this.f167725a;
            ConnectIQOAuthRequest connectIQOAuthRequest = connectIQOAuthActivity.f31984c;
            if (connectIQOAuthRequest == null) {
                s.m("ciqRequest");
                throw null;
            }
            if (u.y(str, connectIQOAuthRequest.getResultUrl(), false)) {
                ConnectIQOAuthActivity.ca(connectIQOAuthActivity);
                i iVarDa = connectIQOAuthActivity.da();
                ConnectIQOAuthRequest connectIQOAuthRequest2 = connectIQOAuthActivity.f31984c;
                if (connectIQOAuthRequest2 == null) {
                    s.m("ciqRequest");
                    throw null;
                }
                ge1.b.T(v1.a(iVarDa), null, null, new j(iVarDa, str, connectIQOAuthRequest2, null), 3);
                String strConcat = "Override loading for Result URL to parse result: ".concat(str);
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "ConnectIQOAuthActivity", strConcat);
                return true;
            }
        }
        return zShouldOverrideUrlLoading;
    }
}
