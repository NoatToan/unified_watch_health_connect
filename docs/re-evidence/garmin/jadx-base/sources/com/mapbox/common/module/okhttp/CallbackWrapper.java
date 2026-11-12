package com.mapbox.common.module.okhttp;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import javax.net.ssl.SSLException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0001%BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001a\u0010\u000e\u001a\u0016\u0012\b\u0012\u00060\u0004j\u0002`\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0019\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R(\u0010\u000e\u001a\u0016\u0012\b\u0012\u00060\u0004j\u0002`\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/mapbox/common/module/okhttp/CallbackWrapper;", "Lokhttp3/Callback;", "Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;", "service", "", TtmlNode.ATTR_ID, "Lokhttp3/Call;", "call", "Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;", "callback", "Lkotlin/Function1;", "Lcom/mapbox/common/module/RequestId;", "", "Lcom/mapbox/common/module/RequestFinishedCallback;", "onRequestFinished", "<init>", "(Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;JLokhttp3/Call;Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;Le23/l;)V", "Ljava/io/IOException;", JWKParameterNames.RSA_EXPONENT, "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "Lokhttp3/Response;", "response", "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "cancel", "()V", "Lcom/mapbox/common/HttpRequestError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "(Lcom/mapbox/common/HttpRequestError;)V", "Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;", "J", "Lokhttp3/Call;", "Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;", "Le23/l;", "requestError", "Lcom/mapbox/common/HttpRequestError;", "RequestCallback", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CallbackWrapper implements Callback {
    private final Call call;
    private final RequestCallback callback;
    private final long id;
    private final l<Long, Unit> onRequestFinished;
    private HttpRequestError requestError;
    private final OkHttpClientDetail service;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;", "", "onFailure", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/mapbox/common/HttpRequestError;", "onResponse", "call", "Lokhttp3/Call;", "response", "Lokhttp3/Response;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface RequestCallback {
        void onFailure(HttpRequestError error);

        void onResponse(Call call, Response response);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallbackWrapper(OkHttpClientDetail okHttpClientDetail, long j8, Call call, RequestCallback requestCallback, l<? super Long, Unit> lVar) {
        okHttpClientDetail.getClass();
        call.getClass();
        requestCallback.getClass();
        lVar.getClass();
        this.service = okHttpClientDetail;
        this.id = j8;
        this.call = call;
        this.callback = requestCallback;
        this.onRequestFinished = lVar;
    }

    public final void cancel() {
        this.requestError = new HttpRequestError(HttpRequestErrorType.REQUEST_CANCELLED, "Request cancelled");
        this.call.cancel();
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException e4) {
        HttpRequestError httpRequestError;
        call.getClass();
        e4.getClass();
        if (!call.isCanceled() || (httpRequestError = this.requestError) == null) {
            HttpRequestErrorType httpRequestErrorType = HttpRequestErrorType.OTHER_ERROR;
            if (e4 instanceof UnknownHostException ? true : e4 instanceof SSLException ? true : e4 instanceof UnknownServiceException ? true : e4 instanceof SocketException ? true : e4 instanceof ProtocolException) {
                httpRequestErrorType = HttpRequestErrorType.CONNECTION_ERROR;
            } else if (e4 instanceof InterruptedIOException) {
                httpRequestErrorType = HttpRequestErrorType.REQUEST_TIMED_OUT;
            }
            this.callback.onFailure(new HttpRequestError(httpRequestErrorType, String.valueOf(e4.getMessage())));
        } else {
            RequestCallback requestCallback = this.callback;
            httpRequestError.getClass();
            requestCallback.onFailure(httpRequestError);
        }
        this.onRequestFinished.invoke(Long.valueOf(this.id));
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        call.getClass();
        response.getClass();
        try {
            this.callback.onResponse(call, response);
        } catch (IOException e4) {
            onFailure(call, e4);
        } catch (Exception e14) {
            this.callback.onFailure(new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, String.valueOf(e14.getMessage())));
        }
    }

    public final void cancel(HttpRequestError error) {
        this.requestError = error;
        this.call.cancel();
    }
}
