package com.huami.watch.companion.cloud;

import com.huami.watch.util.Log;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes16.dex */
public class OkHttpRetryInterceptor implements Interceptor {
    private String a;
    private int b;

    public OkHttpRetryInterceptor(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        while (!responseProceed.isSuccessful() && this.b < 3) {
            Log.d(this.a, "Request <" + request + "> Is Not Successful - " + this.b, new Object[0]);
            this.b = this.b + 1;
            responseProceed = chain.proceed(request);
        }
        return responseProceed;
    }
}
