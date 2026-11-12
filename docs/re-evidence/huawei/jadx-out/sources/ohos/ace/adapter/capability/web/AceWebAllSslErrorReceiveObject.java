package ohos.ace.adapter.capability.web;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;

/* JADX INFO: loaded from: classes46.dex */
public class AceWebAllSslErrorReceiveObject {
    private static final String LOG_TAG = "AceWebAllSslErrorReceiveObject";
    private final SslError error;
    private final SslErrorHandler handler;
    private final boolean isMainFrame;
    private final String referrer;

    public boolean getIsFatalError() {
        return false;
    }

    public AceWebAllSslErrorReceiveObject(SslError sslError, SslErrorHandler sslErrorHandler, String str, boolean z) {
        this.error = sslError;
        this.handler = sslErrorHandler;
        this.referrer = str == null ? "" : str;
        this.isMainFrame = z;
    }

    public int getError() {
        return AceWebSslErrorHelperObject.convertErrorCode(this.error);
    }

    public String getUrl() {
        String url;
        SslError sslError = this.error;
        return (sslError == null || (url = sslError.getUrl()) == null) ? "" : url;
    }

    public String getOriginalUrl() {
        return getUrl();
    }

    public String getReferrer() {
        return this.referrer;
    }

    public boolean getIsMainFrame() {
        return this.isMainFrame;
    }

    public void confirm() {
        SslErrorHandler sslErrorHandler = this.handler;
        if (sslErrorHandler != null) {
            sslErrorHandler.proceed();
        }
    }

    public void cancel() {
        SslErrorHandler sslErrorHandler = this.handler;
        if (sslErrorHandler != null) {
            sslErrorHandler.cancel();
        }
    }

    public String[] getCertChainDataArray() {
        return (String[]) AceWebSslErrorHelperObject.getCertChainData(this.error).toArray(new String[0]);
    }
}
