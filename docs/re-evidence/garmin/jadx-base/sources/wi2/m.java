package wi2;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import d53.u;
import d53.w;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwi2/m;", "Landroid/webkit/WebViewClient;", "<init>", "()V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zy2.k f185677a;

    public m() {
        xi2.a.f191145a.getClass();
        this.f185677a = xi2.a.a("WebViewClient");
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (str != null) {
            this.f185677a.debug("onLoadResource: ".concat(str));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (str != null) {
            this.f185677a.debug("onPageFinished: ".concat(str));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str != null) {
            this.f185677a.debug("onPageStarted: ".concat(str));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String str;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest != null) {
            String str2 = "\n*** REQUEST ***\n" + webResourceRequest.getMethod() + StringUtils.SPACE + webResourceRequest.getUrl() + "\n";
            str = ((Object) (((Object) str2) + "isRedirect -> " + webResourceRequest.isRedirect() + "\n")) + "headers ->\n";
            Iterator<T> it = webResourceRequest.getRequestHeaders().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                str = ((Object) str) + "   " + entry.getKey() + "=" + entry.getValue() + "\n";
            }
        } else {
            str = "\n";
        }
        if (webResourceError != null) {
            str = ((Object) (((Object) str) + "errorCode -> " + webResourceError.getErrorCode() + "\n")) + "description -> " + ((Object) webResourceError.getDescription());
        }
        this.f185677a.error("onReceivedError: " + ((Object) str), null);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String str;
        Uri url;
        String path;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest != null) {
            String str2 = "\n*** REQUEST ***\n" + webResourceRequest.getMethod() + StringUtils.SPACE + webResourceRequest.getUrl() + "\n";
            str = ((Object) (((Object) str2) + "isRedirect -> " + webResourceRequest.isRedirect() + "\n")) + "headers ->\n";
            Iterator<T> it = webResourceRequest.getRequestHeaders().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                str = ((Object) str) + "   " + entry.getKey() + "=" + entry.getValue() + "\n";
            }
        } else {
            str = "\n";
        }
        if (webResourceResponse != null) {
            int statusCode = webResourceResponse.getStatusCode();
            String str3 = ((Object) (((Object) str) + "*** ERROR ***\n")) + "statusCode -> " + statusCode + "\n";
            String str4 = ((Object) str3) + "encoding -> " + webResourceResponse.getEncoding() + "\n";
            String str5 = ((Object) str4) + "mimeType -> " + webResourceResponse.getMimeType() + "\n";
            String str6 = ((Object) (((Object) str5) + "reasonPhrase -> " + webResourceResponse.getReasonPhrase() + "\n")) + "headers ->\n";
            Iterator<T> it3 = webResourceResponse.getResponseHeaders().entrySet().iterator();
            str = str6;
            while (it3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it3.next();
                str = ((Object) str) + "   " + entry2.getKey() + "=" + entry2.getValue() + "\n";
            }
        }
        boolean zP = false;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (path = url.getPath()) != null) {
            zP = u.p(path, ".ico", false);
        }
        zy2.k kVar = this.f185677a;
        if (zP) {
            kVar.a(null, "onReceivedHttpError: " + ((Object) str));
        } else {
            kVar.error("onReceivedHttpError: " + ((Object) str), null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            String url = sslError.getUrl();
            SslCertificate certificate = sslError.getCertificate();
            StringBuilder sbR = wr.g.r(primaryError, "onReceivedSslError: ", StringUtils.SPACE, url, "\ncertificate ->\n");
            sbR.append(certificate);
            this.f185677a.error(sbR.toString(), null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String path;
        zy2.k kVar = this.f185677a;
        if (webView == null) {
            return false;
        }
        Boolean boolValueOf = null;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (path = url.getPath()) != null) {
            boolean z14 = true;
            if (w.z(path, "privacy", true) || w.z(path, "terms", true) || w.z(path, "shopterms", true) || w.z(path, "pdfs", true)) {
                try {
                    URL url2 = new URL(url.toString());
                    Context context = webView.getContext();
                    context.getClass();
                    String string = url2.toString();
                    string.getClass();
                    Uri uri = Uri.parse(string);
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setFlags(524288);
                    intent.setData(uri);
                    a7.b.startActivity(context, intent, null);
                    kVar.debug("shouldOverrideUrlLoading: YES, loaded [" + url + "] into external app/browser");
                } catch (ActivityNotFoundException unused) {
                    kVar.a(null, "shouldOverrideUrlLoading: YES, but no activity found for handling [" + url + "], so will load into this webview instead");
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            boolValueOf = Boolean.valueOf(z14);
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }
}
