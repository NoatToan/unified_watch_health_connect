package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public interface HttpServiceInterceptorInterface {
    void onRequest(HttpRequest httpRequest, HttpServiceInterceptorRequestContinuation httpServiceInterceptorRequestContinuation);

    void onResponse(HttpResponse httpResponse, HttpServiceInterceptorResponseContinuation httpServiceInterceptorResponseContinuation);
}
