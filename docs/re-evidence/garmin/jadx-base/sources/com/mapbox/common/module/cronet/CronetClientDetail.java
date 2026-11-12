package com.mapbox.common.module.cronet;

import c73.c;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.common.HttpHeaders;
import com.mapbox.common.HttpMethod;
import com.mapbox.common.ReadStream;
import com.mapbox.common.http_backend.Request;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.module.HttpClientDetail;
import com.mapbox.common.module.RequestDetail;
import e23.l;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import w63.e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004JO\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\f2\u001a\u0010\u0011\u001a\u0016\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JG\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\f2\u001a\u0010\u0011\u001a\u0016\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/mapbox/common/module/cronet/CronetClientDetail;", "Lcom/mapbox/common/module/HttpClientDetail;", "fallback", "<init>", "(Lcom/mapbox/common/module/HttpClientDetail;)V", "Lorg/chromium/net/CronetEngine;", "engine", "Lcom/mapbox/common/http_backend/Request;", "request", "", "Lcom/mapbox/common/module/RequestId;", TtmlNode.ATTR_ID, "Lcom/mapbox/common/http_backend/RequestObserver;", "requestObserver", "Lkotlin/Function1;", "", "Lcom/mapbox/common/module/RequestFinishedCallback;", "onRequestFinished", "Lcom/mapbox/common/module/cronet/CronetRequestDetail;", "buildRequestWithEngine", "(Lorg/chromium/net/CronetEngine;Lcom/mapbox/common/http_backend/Request;JLcom/mapbox/common/http_backend/RequestObserver;Le23/l;)Lcom/mapbox/common/module/cronet/CronetRequestDetail;", "Lcom/mapbox/common/module/RequestDetail;", "buildRequest", "(Lcom/mapbox/common/http_backend/Request;JLcom/mapbox/common/http_backend/RequestObserver;Le23/l;)Lcom/mapbox/common/module/RequestDetail;", "Ljava/util/concurrent/ExecutorService;", "executor", "()Ljava/util/concurrent/ExecutorService;", "", "max", "setMaxRequestsPerHost", "(B)V", "", "supportsKeepCompression", "()Z", "Lcom/mapbox/common/module/HttpClientDetail;", "Lcom/mapbox/common/module/cronet/LazyEngine;", "cronetEngine", "Lcom/mapbox/common/module/cronet/LazyEngine;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CronetClientDetail implements HttpClientDetail {
    private final LazyEngine cronetEngine;
    private final HttpClientDetail fallback;

    public CronetClientDetail(HttpClientDetail httpClientDetail) {
        httpClientDetail.getClass();
        this.fallback = httpClientDetail;
        ExecutorService executorService = CronetClientDetailKt.callbackExecutor;
        executorService.getClass();
        this.cronetEngine = new LazyEngine(executorService);
    }

    private final CronetRequestDetail buildRequestWithEngine(CronetEngine engine, Request request, long id3, RequestObserver requestObserver, l<? super Long, Unit> onRequestFinished) throws IOException {
        ReadStream body;
        UrlCallback urlCallback = new UrlCallback(id3, requestObserver, onRequestFinished);
        UrlRequest.Builder builderNewUrlRequestBuilder = engine.newUrlRequestBuilder(request.getUrl(), urlCallback, CronetClientDetailKt.callbackExecutor);
        HashMap<String, String> headers = request.getHeaders();
        headers.getClass();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            builderNewUrlRequestBuilder.addHeader(entry.getKey(), entry.getValue());
        }
        String string = request.getMethod().toString();
        string.getClass();
        String upperCase = string.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        builderNewUrlRequestBuilder.setHttpMethod(upperCase);
        if (request.getMethod() == HttpMethod.POST && (body = request.getBody()) != null) {
            if (!headers.containsKey(HttpHeaders.CONTENT_TYPE) && !headers.containsKey(com.google.common.net.HttpHeaders.CONTENT_TYPE)) {
                builderNewUrlRequestBuilder.addHeader(com.google.common.net.HttpHeaders.CONTENT_TYPE, "application/octet-stream");
            }
            e okioBuffer = CronetClientDetailKt.toOkioBuffer(body);
            byte[] bArrS = okioBuffer.s(okioBuffer.f183349b);
            builderNewUrlRequestBuilder.setUploadDataProvider(c.a(0, bArrS.length, bArrS), CronetClientDetailKt.callbackExecutor);
        }
        UrlRequest urlRequestBuild = builderNewUrlRequestBuilder.build();
        urlRequestBuild.getClass();
        return new CronetRequestDetail(urlRequestBuild, urlCallback, request.getTimeout());
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public RequestDetail buildRequest(Request request, long id3, RequestObserver requestObserver, l<? super Long, Unit> onRequestFinished) {
        CronetRequestDetail cronetRequestDetailBuildRequestWithEngine;
        request.getClass();
        requestObserver.getClass();
        onRequestFinished.getClass();
        CronetEngine engine = this.cronetEngine.getEngine();
        return (engine == null || (cronetRequestDetailBuildRequestWithEngine = buildRequestWithEngine(engine, request, id3, requestObserver, onRequestFinished)) == null) ? this.fallback.buildRequest(request, id3, requestObserver, onRequestFinished) : cronetRequestDetailBuildRequestWithEngine;
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public ExecutorService executor() {
        ExecutorService executorService = CronetClientDetailKt.callbackExecutor;
        executorService.getClass();
        return executorService;
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public void setMaxRequestsPerHost(byte max) {
        this.fallback.setMaxRequestsPerHost(max);
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public boolean supportsKeepCompression() {
        return false;
    }
}
