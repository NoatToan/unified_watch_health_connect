package com.huawei.agconnect.https;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes22.dex */
class RetryInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5027b;

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response responseProceed;
        int i;
        Request request = chain.request();
        while (true) {
            responseProceed = chain.proceed(request);
            if (responseProceed.isSuccessful() || (i = this.f5027b) >= this.f5026a) {
                break;
            }
            this.f5027b = i + 1;
        }
        return responseProceed;
    }

    public RetryInterceptor(int i) {
        this.f5026a = i;
    }
}
