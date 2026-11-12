package com.xiaomi.ai.android.helper;

import com.xiaomi.ai.android.core.Engine;
import defpackage.wpe;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public class AuthorizationHttpHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OkHttpClient f10916a;

    public class a implements Interceptor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Engine f10917a;

        public a(Engine engine) {
            this.f10917a = engine;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) {
            String str;
            Request request = chain.request();
            if (AuthorizationHttpHelper.this.a(request)) {
                wpe.h("AuthorizationHttpHelper", "hasAuthorizationHeader");
            } else {
                String authorization = this.f10917a.getAuthorization();
                if (authorization == null) {
                    str = " getAuthorization is null";
                } else if (request.url().getIsHttps()) {
                    request = request.newBuilder().header("Authorization", authorization).build();
                } else {
                    str = "only support https and not add authorization";
                }
                wpe.e("AuthorizationHttpHelper", str);
            }
            return chain.proceed(request);
        }
    }

    public AuthorizationHttpHelper(Engine engine) {
        this(engine, null);
    }

    public OkHttpClient getClient() {
        return this.f10916a;
    }

    public AuthorizationHttpHelper(Engine engine, OkHttpClient.Builder builder) {
        if (builder == null) {
            wpe.h("AuthorizationHttpHelper", "builder is null");
            OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            builder = builder2.connectTimeout(10L, timeUnit).readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit);
        }
        this.f10916a = builder.addInterceptor(new a(engine)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Request request) {
        return request.headers().names().contains("Authorization");
    }
}
