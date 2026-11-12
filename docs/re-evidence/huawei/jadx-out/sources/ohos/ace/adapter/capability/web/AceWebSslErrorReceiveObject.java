package ohos.ace.adapter.capability.web;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;

/* JADX INFO: loaded from: classes46.dex */
public class AceWebSslErrorReceiveObject {
    private final SslError error;
    private final SslErrorHandler handler;

    public AceWebSslErrorReceiveObject(SslError sslError, SslErrorHandler sslErrorHandler) {
        this.error = sslError;
        this.handler = sslErrorHandler;
    }

    public int getError() {
        return AceWebSslErrorHelperObject.convertErrorCode(this.error);
    }

    public String[] getCertChainDataArray() {
        return (String[]) AceWebSslErrorHelperObject.getCertChainData(this.error).toArray(new String[0]);
    }

    public void proceed() {
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
}
