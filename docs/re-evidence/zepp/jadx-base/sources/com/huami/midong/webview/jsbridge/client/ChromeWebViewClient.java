package com.huami.midong.webview.jsbridge.client;

import android.R;
import android.net.Uri;
import android.view.View;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.huami.midong.webview.jsbridge.JsBridgeStatusWebView;
import com.huami.midong.webview.jsbridge.client.ChromeWebViewClient;
import com.huami.midong.webview.ui.WebPromptFragment;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes11.dex */
public class ChromeWebViewClient extends WebChromeClient {
    private static final String TAG = "JsBridgeChromeClient";
    private JsBridgeStatusWebView mWebView;

    public ChromeWebViewClient(JsBridgeStatusWebView jsBridgeStatusWebView) {
        this.mWebView = jsBridgeStatusWebView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsAlert$0(String str, String str2, AlertDialogFragment alertDialogFragment, JsResult jsResult, View view) {
        Log.d(TAG, "onJsAlert confirm click  url:%s  message:%s", str, str2);
        alertDialogFragment.dismissAllowingStateLoss();
        jsResult.confirm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsConfirm$1(String str, String str2, AlertDialogFragment alertDialogFragment, JsResult jsResult, View view) {
        Log.d(TAG, "onJsConfirm confirm click  url:%s  message:%s", str, str2);
        alertDialogFragment.dismissAllowingStateLoss();
        jsResult.confirm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsConfirm$2(String str, String str2, AlertDialogFragment alertDialogFragment, JsResult jsResult, View view) {
        Log.d(TAG, "onJsConfirm cancel click  url:%s  message:%s", str, str2);
        alertDialogFragment.dismissAllowingStateLoss();
        jsResult.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsPrompt$3(String str, String str2, String str3, WebPromptFragment webPromptFragment, AlertDialogFragment alertDialogFragment, JsPromptResult jsPromptResult, View view) {
        Log.d(TAG, "onJsPrompt confirm url:%s  message:%s  defaultValue:%s value:%s", str, str2, str3, webPromptFragment.getContent());
        alertDialogFragment.dismissAllowingStateLoss();
        jsPromptResult.confirm(webPromptFragment.getContent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsPrompt$4(String str, String str2, String str3, AlertDialogFragment alertDialogFragment, JsPromptResult jsPromptResult, View view) {
        Log.d(TAG, "onJsPrompt cancel url:%s  message:%s  defaultValue:%s", str, str2, str3);
        alertDialogFragment.dismissAllowingStateLoss();
        jsPromptResult.cancel();
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        super.onHideCustomView();
        Log.d(TAG, "onHideCustomView", new Object[0]);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, final String str, final String str2, final JsResult jsResult) {
        Log.d(TAG, "onJsAlert  url:%s  message:%s", str, str2);
        if (this.mWebView.getActivity() != null && !this.mWebView.getActivity().isDestroyed()) {
            final AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance();
            alertDialogFragmentNewInstance.setStyle(4);
            alertDialogFragmentNewInstance.setTitle(this.mWebView.getActivity().getString(R.string.dialog_alert_title));
            alertDialogFragmentNewInstance.setMessage(str2);
            alertDialogFragmentNewInstance.setCancelable(false);
            alertDialogFragmentNewInstance.setCanceledOnTouchOutside(false);
            alertDialogFragmentNewInstance.setNeutral(this.mWebView.getActivity().getString(R.string.ok), new View.OnClickListener() { // from class: uo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChromeWebViewClient.lambda$onJsAlert$0(str, str2, alertDialogFragmentNewInstance, jsResult, view);
                }
            });
            alertDialogFragmentNewInstance.show(this.mWebView.getActivity().getFragmentManager(), "web alert");
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, final String str, final String str2, final JsResult jsResult) {
        Log.d(TAG, "onJsConfirm  url:%s  message:%s", str, str2);
        if (this.mWebView.getActivity() != null && !this.mWebView.getActivity().isDestroyed()) {
            final AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance();
            alertDialogFragmentNewInstance.setStyle(3);
            alertDialogFragmentNewInstance.setTitle(this.mWebView.getActivity().getString(R.string.dialog_alert_title));
            alertDialogFragmentNewInstance.setMessage(str2);
            alertDialogFragmentNewInstance.setConfirm(this.mWebView.getActivity().getString(R.string.ok), new View.OnClickListener() { // from class: vo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChromeWebViewClient.lambda$onJsConfirm$1(str, str2, alertDialogFragmentNewInstance, jsResult, view);
                }
            });
            alertDialogFragmentNewInstance.setCancel(this.mWebView.getActivity().getString(R.string.cancel), new View.OnClickListener() { // from class: to0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChromeWebViewClient.lambda$onJsConfirm$2(str, str2, alertDialogFragmentNewInstance, jsResult, view);
                }
            });
            alertDialogFragmentNewInstance.setCancelable(false);
            alertDialogFragmentNewInstance.setCanceledOnTouchOutside(false);
            alertDialogFragmentNewInstance.show(this.mWebView.getActivity().getFragmentManager(), "web confirm");
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, final String str, final String str2, final String str3, final JsPromptResult jsPromptResult) {
        Log.d(TAG, "onJsPrompt url:%s  message:%s  defaultValue:%s", str, str2, str3);
        if (this.mWebView.getActivity() != null && !this.mWebView.getActivity().isDestroyed()) {
            final AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance();
            alertDialogFragmentNewInstance.setStyle(5);
            alertDialogFragmentNewInstance.setTitle(this.mWebView.getActivity().getString(R.string.dialog_alert_title));
            final WebPromptFragment webPromptFragment = new WebPromptFragment();
            webPromptFragment.setTitle(str2);
            webPromptFragment.setContent(str3);
            alertDialogFragmentNewInstance.setContent(webPromptFragment);
            alertDialogFragmentNewInstance.setConfirm(this.mWebView.getActivity().getString(R.string.ok), new View.OnClickListener() { // from class: wo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChromeWebViewClient.lambda$onJsPrompt$3(str, str2, str3, webPromptFragment, alertDialogFragmentNewInstance, jsPromptResult, view);
                }
            });
            alertDialogFragmentNewInstance.setCancel(this.mWebView.getActivity().getString(R.string.cancel), new View.OnClickListener() { // from class: xo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChromeWebViewClient.lambda$onJsPrompt$4(str, str2, str3, alertDialogFragmentNewInstance, jsPromptResult, view);
                }
            });
            alertDialogFragmentNewInstance.setCancelable(false);
            alertDialogFragmentNewInstance.setCanceledOnTouchOutside(false);
            alertDialogFragmentNewInstance.show(this.mWebView.getActivity().getFragmentManager(), "web confirm");
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        Log.d(TAG, "page:%s on progress change:%s", webView.getUrl(), Integer.valueOf(i));
        this.mWebView.onProgressChange(i);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        Log.d(TAG, "page:%s  receive title:%s", webView.getUrl(), str);
        this.mWebView.onReceiveTitle(str);
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        Log.d(TAG, "onShowCustomView", new Object[0]);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Log.d(TAG, "onShowFileChooser", new Object[0]);
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        Log.d(TAG, "openFileChooser", new Object[0]);
    }
}
