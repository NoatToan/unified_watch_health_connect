package com.alipay.android.phone.mrpc.core;

import org.apache.http.HttpResponse;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes4.dex */
class e extends DefaultRedirectHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f1989b;

    @Override // org.apache.http.impl.client.DefaultRedirectHandler, org.apache.http.client.RedirectHandler
    public boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
        int statusCode;
        this.f1988a++;
        boolean zIsRedirectRequested = super.isRedirectRequested(httpResponse, httpContext);
        if (zIsRedirectRequested || this.f1988a >= 5 || !((statusCode = httpResponse.getStatusLine().getStatusCode()) == 301 || statusCode == 302)) {
            return zIsRedirectRequested;
        }
        return true;
    }

    public e(d dVar) {
        this.f1989b = dVar;
    }
}
