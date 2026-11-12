package com.datatheorem.android.trustkit.pinning;

import androidx.annotation.NonNull;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class OkHttp2PinningInterceptor implements Interceptor {
    private final d a;

    public OkHttp2PinningInterceptor(@NonNull d dVar) {
        this.a = dVar;
    }

    @Override // com.squareup.okhttp.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        this.a.a(request.url().getHost());
        return chain.proceed(request);
    }
}
