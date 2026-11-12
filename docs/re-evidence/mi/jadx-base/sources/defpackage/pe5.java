package defpackage;

import android.app.AlertDialog;
import android.net.Uri;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.xiaomi.fitness.common.log.Logger;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class pe5 extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public iqc f30313a;

    public pe5(WeakReference<iqc> weakReference) {
        this.f30313a = weakReference.get();
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        this.f30313a.onVideoScreenModeChanged(false, null);
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        new AlertDialog.Builder(webView.getContext()).setMessage(str2).show();
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        if (this.f30313a.isInValid()) {
            return;
        }
        this.f30313a.onProgressChanged(i);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        if (this.f30313a.isInValid()) {
            return;
        }
        Logger.d("|WEBVIEW|onReceivedTitle:" + str, new Object[0]);
        this.f30313a.setWebTitle(str);
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Logger.d("|WEBVIEW|onShowCustomView", new Object[0]);
        this.f30313a.onVideoScreenModeChanged(true, view);
        super.onShowCustomView(view, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (!fileChooserParams.isCaptureEnabled()) {
            this.f30313a.openFileChooser(valueCallback);
            return true;
        }
        Logger.d("|WEBVIEW| isCaptureEnabled", new Object[0]);
        this.f30313a.openCamera(valueCallback);
        return true;
    }
}
