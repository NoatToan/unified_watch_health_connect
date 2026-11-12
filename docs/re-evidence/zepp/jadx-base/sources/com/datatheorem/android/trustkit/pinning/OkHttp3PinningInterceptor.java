package com.datatheorem.android.trustkit.pinning;

import androidx.annotation.NonNull;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public class OkHttp3PinningInterceptor implements Interceptor {
    private final d a;

    public OkHttp3PinningInterceptor(@NonNull d dVar) {
        this.a = dVar;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        this.a.a(request.url().host());
        return chain.proceed(request);
    }
}
