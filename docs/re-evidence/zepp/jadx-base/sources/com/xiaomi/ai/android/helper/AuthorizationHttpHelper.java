package com.xiaomi.ai.android.helper;

import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.log.Logger;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes18.dex */
public class AuthorizationHttpHelper {
    private OkHttpClient a;

    public AuthorizationHttpHelper(Engine engine) {
        this(engine, null);
    }

    public AuthorizationHttpHelper(final Engine engine, OkHttpClient.Builder builder) {
        if (builder == null) {
            Logger.b("AuthorizationHttpHelper", "builder is null");
            OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            builder = builder2.connectTimeout(10L, timeUnit).readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit);
        }
        this.a = builder.addInterceptor(new Interceptor() { // from class: com.xiaomi.ai.android.helper.AuthorizationHttpHelper.1
            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) {
                String str;
                Request request = chain.request();
                if (AuthorizationHttpHelper.this.a(request)) {
                    Logger.b("AuthorizationHttpHelper", "hasAuthorizationHeader");
                } else {
                    String authorization = engine.getAuthorization();
                    if (authorization == null) {
                        str = " getAuthorization is null";
                    } else if (request.url().isHttps()) {
                        request = request.newBuilder().header("Authorization", authorization).build();
                    } else {
                        str = "only support https and not add authorization";
                    }
                    Logger.d("AuthorizationHttpHelper", str);
                }
                return chain.proceed(request);
            }
        }).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Request request) {
        return request.headers().names().contains("Authorization");
    }

    public OkHttpClient getClient() {
        return this.a;
    }
}
