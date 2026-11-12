package com.xiaomi.ai.android.helper;

import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.android.core.e;
import defpackage.djs;
import defpackage.wpe;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes6.dex */
public class LiteHttpHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OkHttpClient f10929a;

    public LiteHttpHelper(Engine engine) {
        this(engine, null);
    }

    public OkHttpClient getClient() {
        return this.f10929a;
    }

    public LiteHttpHelper(Engine engine, OkHttpClient.Builder builder) {
        djs djsVar = new djs(((e) engine).e());
        if (builder == null) {
            wpe.h("LiteHttpHelper", "builder is null");
            OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            builder = builder2.connectTimeout(10L, timeUnit).readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit);
        }
        this.f10929a = builder.addInterceptor(djsVar).build();
    }
}
