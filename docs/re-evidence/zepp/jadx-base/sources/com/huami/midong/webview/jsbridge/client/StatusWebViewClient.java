package com.huami.midong.webview.jsbridge.client;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.huami.midong.webview.jsbridge.JsBridgeStatusWebView;
import com.huami.midong.webview.jsbridge.JsBridgeWebViewClient;
import com.huami.watch.util.Log;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class StatusWebViewClient extends JsBridgeWebViewClient {
    private static final String TAG = "JsBridgeStatusClient";
    private boolean isFirst;
    private List<Integer> mErrorCodes;
    private JsBridgeStatusWebView mWebView;

    public StatusWebViewClient(Context context, @NonNull JsBridgeStatusWebView jsBridgeStatusWebView) {
        super(context, jsBridgeStatusWebView.getWeb());
        this.mErrorCodes = Arrays.asList(-12, -6, -8, -2);
        this.mWebView = jsBridgeStatusWebView;
    }

    @Override // com.huami.midong.webview.jsbridge.JsBridgeWebViewClient, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        Log.d(TAG, "page finish--->" + str, new Object[0]);
        this.mWebView.onStatusChange("finish");
        this.isFirst = false;
    }

    @Override // com.huami.midong.webview.jsbridge.JsBridgeWebViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        Log.d(TAG, "page start--->" + str, new Object[0]);
        this.mWebView.onStatusChange("start");
        this.isFirst = true;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        Log.d(TAG, "page error--->url:%s  code:%s   description:%s", webResourceRequest.getUrl(), Integer.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription());
        if (this.isFirst && this.mErrorCodes.contains(Integer.valueOf(webResourceError.getErrorCode()))) {
            this.mWebView.onStatusChange("error");
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        Log.d(TAG, "page error--->url:%s  code:%s   description:%s", str2, Integer.valueOf(i), str);
        if (this.isFirst && this.mErrorCodes.contains(Integer.valueOf(i))) {
            this.mWebView.onStatusChange("error");
        }
    }
}
