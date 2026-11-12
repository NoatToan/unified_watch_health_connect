package f03;

import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes3.dex */
public class c extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f67756a;

    public c(d dVar) {
        this.f67756a = dVar;
    }

    public final WebResourceResponse a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        boolean zContains = str.contains(".css");
        d dVar = this.f67756a;
        if (zContains && dVar.f67758b != null) {
            return new WebResourceResponse("text/css", "UTF-8", dVar.f67758b);
        }
        if (!str.contains("/bbp/tablet/images/logo.png") || dVar.f67759c == null) {
            return null;
        }
        return new WebResourceResponse("image/*", "UTF-8", dVar.f67759c);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        a aVar = this.f67756a.f67761e;
        if (aVar != null) {
            aVar.c(h.STARTED);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponseA = a(webResourceRequest.getUrl().toString());
        return webResourceResponseA != null ? webResourceResponseA : super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse webResourceResponseA = a(str);
        return webResourceResponseA != null ? webResourceResponseA : super.shouldInterceptRequest(webView, str);
    }
}
