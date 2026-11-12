package com.mapbox.common.module.cronet;

import cd0.h0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.mapbox.common.module.RequestDetail;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/mapbox/common/module/cronet/CronetRequestDetail;", "Lcom/mapbox/common/module/RequestDetail;", "request", "Lorg/chromium/net/UrlRequest;", "callback", "Lcom/mapbox/common/module/cronet/UrlCallback;", "timeoutSeconds", "", "(Lorg/chromium/net/UrlRequest;Lcom/mapbox/common/module/cronet/UrlCallback;J)V", "cancel", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/mapbox/common/HttpRequestError;", TtmlNode.START, "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CronetRequestDetail implements RequestDetail {
    private final UrlCallback callback;
    private final UrlRequest request;
    private final long timeoutSeconds;

    public CronetRequestDetail(UrlRequest urlRequest, UrlCallback urlCallback, long j8) {
        urlRequest.getClass();
        urlCallback.getClass();
        this.request = urlRequest;
        this.callback = urlCallback;
        this.timeoutSeconds = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(CronetRequestDetail cronetRequestDetail) {
        cronetRequestDetail.getClass();
        if (cronetRequestDetail.request.isDone()) {
            return;
        }
        cronetRequestDetail.cancel(new HttpRequestError(HttpRequestErrorType.REQUEST_TIMED_OUT, "Request timed out"));
    }

    @Override // com.mapbox.common.module.RequestDetail
    public void cancel(HttpRequestError error) {
        if (error != null) {
            this.callback.setCancelReason(error);
        }
        this.request.cancel();
    }

    @Override // com.mapbox.common.module.RequestDetail
    public void start() {
        if (this.timeoutSeconds > 0) {
            CronetRequestDetailKt.executor.schedule(new h0(this, 19), this.timeoutSeconds, TimeUnit.SECONDS);
        }
        this.request.start();
    }
}
