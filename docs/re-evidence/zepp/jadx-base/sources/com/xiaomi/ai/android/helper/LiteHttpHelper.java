package com.xiaomi.ai.android.helper;

import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.log.Logger;
import com.xiaomi.ai.transport.d;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes18.dex */
public class LiteHttpHelper {
    private OkHttpClient a;

    public LiteHttpHelper(Engine engine) {
        this(engine, null);
    }

    public LiteHttpHelper(Engine engine, OkHttpClient.Builder builder) {
        d dVar = new d(((com.xiaomi.ai.android.core.d) engine).g());
        if (builder == null) {
            Logger.b("LiteHttpHelper", "builder is null");
            OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            builder = builder2.connectTimeout(10L, timeUnit).readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit);
        }
        this.a = builder.addInterceptor(dVar).build();
    }

    public OkHttpClient getClient() {
        return this.a;
    }
}
