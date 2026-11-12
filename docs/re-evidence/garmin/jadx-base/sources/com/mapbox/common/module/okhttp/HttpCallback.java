package com.mapbox.common.module.okhttp;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.ResponseReadStream;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.http_backend.ResponseData;
import e23.l;
import jg.b;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import w63.e;
import w63.g;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R(\u0010\n\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/mapbox/common/module/okhttp/HttpCallback;", "Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;", "", TtmlNode.ATTR_ID, "Lcom/mapbox/common/http_backend/RequestObserver;", "observer", "Lkotlin/Function1;", "Lcom/mapbox/common/module/RequestId;", "", "Lcom/mapbox/common/module/RequestFinishedCallback;", "onRequestFinished", "<init>", "(JLcom/mapbox/common/http_backend/RequestObserver;Le23/l;)V", "Lcom/mapbox/common/HttpRequestError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onFailure", "(Lcom/mapbox/common/HttpRequestError;)V", "Lokhttp3/Call;", "call", "Lokhttp3/Response;", "response", "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "J", "Lcom/mapbox/common/http_backend/RequestObserver;", "Le23/l;", "chunkSize", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class HttpCallback implements CallbackWrapper.RequestCallback {
    private final long chunkSize;
    private final long id;
    private final RequestObserver observer;
    private final l<Long, Unit> onRequestFinished;

    /* JADX WARN: Multi-variable type inference failed */
    public HttpCallback(long j8, RequestObserver requestObserver, l<? super Long, Unit> lVar) {
        requestObserver.getClass();
        lVar.getClass();
        this.id = j8;
        this.observer = requestObserver;
        this.onRequestFinished = lVar;
        this.chunkSize = PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }

    @Override // com.mapbox.common.module.okhttp.CallbackWrapper.RequestCallback
    public void onFailure(HttpRequestError error) {
        error.getClass();
        this.observer.onFailed(this.id, error);
    }

    @Override // com.mapbox.common.module.okhttp.CallbackWrapper.RequestCallback
    public void onResponse(Call call, Response response) {
        call.getClass();
        response.getClass();
        try {
            e eVar = new e();
            this.observer.onResponse(this.id, new ResponseData(HttpCallbackKt.generateOutputHeaders(response), response.code(), new ResponseReadStream(eVar)));
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody != null) {
                try {
                    g bodySource = responseBodyBody.getBodySource();
                    boolean z14 = false;
                    while (!z14) {
                        long j8 = 0;
                        do {
                            try {
                                long j14 = bodySource.read(eVar, this.chunkSize - j8);
                                if (j14 == -1) {
                                    z14 = true;
                                    break;
                                } else {
                                    j8 += j14;
                                    if (j14 != 8192) {
                                        break;
                                    }
                                }
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    b.l(bodySource, th3);
                                    throw th4;
                                }
                            }
                        } while (j8 < this.chunkSize);
                        if (j8 > 0) {
                            this.observer.onData(this.id);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    b.l(bodySource, null);
                    responseBodyBody.close();
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        b.l(responseBodyBody, th5);
                        throw th6;
                    }
                }
            }
            this.observer.onSucceeded(this.id);
            this.onRequestFinished.invoke(Long.valueOf(this.id));
        } catch (Throwable th7) {
            this.onRequestFinished.invoke(Long.valueOf(this.id));
            throw th7;
        }
    }
}
