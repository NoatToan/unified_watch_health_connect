package com.huawei.agconnect.https;

import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
class RequestFactory<HttpsRequest> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HttpsRequest f5025a;

    public Request.Builder a() {
        return AnnotationHandler.b(this.f5025a);
    }

    public static <HttpsRequest> RequestFactory a(HttpsRequest httpsrequest) {
        return new RequestFactory(httpsrequest);
    }

    public RequestFactory(HttpsRequest httpsrequest) {
        this.f5025a = httpsrequest;
    }
}
