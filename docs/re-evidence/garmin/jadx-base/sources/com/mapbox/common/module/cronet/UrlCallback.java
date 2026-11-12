package com.mapbox.common.module.cronet;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.mapbox.common.NetworkUsageMetricsMeter;
import com.mapbox.common.ResponseReadStream;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.http_backend.ResponseData;
import e23.a;
import e23.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p13.t0;
import w63.e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001b\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010!\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b#\u0010\u001eJ-\u0010&\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b(\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R(\u0010\n\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/mapbox/common/module/cronet/UrlCallback;", "Lorg/chromium/net/UrlRequest$Callback;", "", TtmlNode.ATTR_ID, "Lcom/mapbox/common/http_backend/RequestObserver;", "observer", "Lkotlin/Function1;", "Lcom/mapbox/common/module/RequestId;", "", "Lcom/mapbox/common/module/RequestFinishedCallback;", "onRequestFinished", "<init>", "(JLcom/mapbox/common/http_backend/RequestObserver;Le23/l;)V", "Lorg/chromium/net/UrlRequest;", "request", "Lkotlin/Function0;", "callback", "runObserverCallbackSynchronously", "(Lorg/chromium/net/UrlRequest;Le23/a;)V", "Lcom/mapbox/common/HttpRequestError;", "reason", "setCancelReason", "(Lcom/mapbox/common/HttpRequestError;)V", "Lorg/chromium/net/UrlResponseInfo;", "info", "", "newLocationUrl", "onRedirectReceived", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Ljava/lang/String;)V", "onResponseStarted", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;)V", "Ljava/nio/ByteBuffer;", "byteBuffer", "onReadCompleted", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Ljava/nio/ByteBuffer;)V", "onSucceeded", "Lorg/chromium/net/CronetException;", "exception", "onFailed", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Lorg/chromium/net/CronetException;)V", "onCanceled", "J", "Lcom/mapbox/common/http_backend/RequestObserver;", "Le23/l;", "", "chunkSize", "I", "", "failed", "Z", "Lw63/e;", "intermediateBuffer", "Lw63/e;", "Ljava/util/concurrent/atomic/AtomicReference;", "cancelReason", "Ljava/util/concurrent/atomic/AtomicReference;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UrlCallback extends UrlRequest.Callback {
    private AtomicReference<HttpRequestError> cancelReason;
    private final int chunkSize;
    private boolean failed;
    private final long id;
    private final e intermediateBuffer;
    private final RequestObserver observer;
    private final l<Long, Unit> onRequestFinished;

    /* JADX WARN: Multi-variable type inference failed */
    public UrlCallback(long j8, RequestObserver requestObserver, l<? super Long, Unit> lVar) {
        requestObserver.getClass();
        lVar.getClass();
        this.id = j8;
        this.observer = requestObserver;
        this.onRequestFinished = lVar;
        this.chunkSize = 65536;
        this.intermediateBuffer = new e();
        this.cancelReason = new AtomicReference<>(null);
    }

    private final void runObserverCallbackSynchronously(UrlRequest request, a<Unit> callback) {
        try {
            synchronized (this) {
                try {
                    if (!this.failed) {
                        callback.invoke();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (Exception e4) {
            if (request != null ? request.isDone() : false) {
                return;
            }
            setCancelReason(new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, com.airbnb.lottie.animation.keyframe.a.d(e4, "Exception during callback: ")));
            if (request != null) {
                request.cancel();
            }
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onCanceled(UrlRequest request, UrlResponseInfo info) {
        HttpRequestError httpRequestError = this.cancelReason.get();
        if (httpRequestError == null) {
            httpRequestError = new HttpRequestError(HttpRequestErrorType.REQUEST_CANCELLED, "Request cancelled");
        }
        runObserverCallbackSynchronously(request, new AnonymousClass1(httpRequestError));
        this.onRequestFinished.invoke(Long.valueOf(this.id));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onFailed(UrlRequest request, UrlResponseInfo info, CronetException exception) {
        String message;
        HttpRequestErrorType httpRequestErrorType = HttpRequestErrorType.OTHER_ERROR;
        if (exception instanceof NetworkException) {
            HttpRequestErrorType httpRequestErrorType2 = HttpRequestErrorType.CONNECTION_ERROR;
            int errorCode = ((NetworkException) exception).getErrorCode();
            if (errorCode == 4 || errorCode == 6) {
                httpRequestErrorType = HttpRequestErrorType.REQUEST_TIMED_OUT;
            } else if (errorCode != 11) {
                httpRequestErrorType = httpRequestErrorType2;
            }
        }
        if (exception != null) {
            message = exception.getMessage();
            if (message == null) {
                message = "Exception of type ".concat(exception.getClass().getSimpleName());
            }
        } else {
            message = "No info";
        }
        runObserverCallbackSynchronously(request, new C39571(new HttpRequestError(httpRequestErrorType, "Couldn't connect to server: ".concat(message))));
        this.onRequestFinished.invoke(Long.valueOf(this.id));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(UrlRequest request, UrlResponseInfo info, ByteBuffer byteBuffer) {
        int i14;
        int iWrite;
        byteBuffer.getClass();
        byteBuffer.flip();
        try {
            synchronized (this) {
                i14 = 0;
                do {
                    iWrite = this.intermediateBuffer.write(byteBuffer);
                    i14 += iWrite;
                } while (iWrite > 0);
                Unit unit = Unit.INSTANCE;
            }
            byteBuffer.clear();
            request.getClass();
            request.read(byteBuffer);
            if (i14 > 0) {
                runObserverCallbackSynchronously(request, new AnonymousClass2());
            }
        } catch (IOException e4) {
            setCancelReason(new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, "Error reading network buffer: " + e4));
            if (request != null) {
                request.cancel();
            }
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(UrlRequest request, UrlResponseInfo info, String newLocationUrl) {
        if (request != null) {
            request.followRedirect();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onResponseStarted(UrlRequest request, UrlResponseInfo info) {
        if (request == null || info == null) {
            if (request != null) {
                request.cancel();
                return;
            }
            return;
        }
        Map<String, List<String>> allHeaders = info.getAllHeaders();
        allHeaders.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<String>> entry : allHeaders.entrySet()) {
            if (entry.getValue().size() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(t0.a(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            key.getClass();
            String lowerCase = ((String) key).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            linkedHashMap2.put(lowerCase, entry2.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(t0.a(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry3.getKey(), (String) ((List) entry3.getValue()).get(0));
        }
        HashMap map = new HashMap(linkedHashMap3);
        NetworkUsageMetricsMeter.onHttpCodeReceived(info.getHttpStatusCode());
        runObserverCallbackSynchronously(request, new C39581(map, info));
        request.read(ByteBuffer.allocateDirect(this.chunkSize));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onSucceeded(UrlRequest request, UrlResponseInfo info) {
        runObserverCallbackSynchronously(request, new C39591());
        this.onRequestFinished.invoke(Long.valueOf(this.id));
    }

    public final void setCancelReason(HttpRequestError reason) {
        reason.getClass();
        this.cancelReason.set(reason);
    }

    /* JADX INFO: renamed from: com.mapbox.common.module.cronet.UrlCallback$onReadCompleted$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements a<Unit> {
        public AnonymousClass2() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            UrlCallback.this.observer.onData(UrlCallback.this.id);
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.module.cronet.UrlCallback$onSucceeded$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39591 extends w implements a<Unit> {
        public C39591() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            UrlCallback.this.observer.onSucceeded(UrlCallback.this.id);
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.module.cronet.UrlCallback$onCanceled$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements a<Unit> {
        final /* synthetic */ HttpRequestError $reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HttpRequestError httpRequestError) {
            super(0);
            this.$reason = httpRequestError;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            UrlCallback.this.failed = true;
            UrlCallback.this.observer.onFailed(UrlCallback.this.id, this.$reason);
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.module.cronet.UrlCallback$onFailed$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39571 extends w implements a<Unit> {
        final /* synthetic */ HttpRequestError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39571(HttpRequestError httpRequestError) {
            super(0);
            this.$error = httpRequestError;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            UrlCallback.this.failed = true;
            UrlCallback.this.observer.onFailed(UrlCallback.this.id, this.$error);
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.module.cronet.UrlCallback$onResponseStarted$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39581 extends w implements a<Unit> {
        final /* synthetic */ HashMap<String, String> $headers;
        final /* synthetic */ UrlResponseInfo $info;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39581(HashMap<String, String> map, UrlResponseInfo urlResponseInfo) {
            super(0);
            this.$headers = map;
            this.$info = urlResponseInfo;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            UrlCallback.this.observer.onResponse(UrlCallback.this.id, new ResponseData(this.$headers, this.$info.getHttpStatusCode(), new ResponseReadStream(UrlCallback.this.intermediateBuffer)));
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }
}
