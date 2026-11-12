package com.xiaomi.fitness.net.di;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xiaomi.fitness.net.HttpConfig;
import com.xiaomi.fitness.net.TLSCompatSocketFactory;
import com.xiaomi.fitness.net.interceptor.HttpHandlerInterceptor;
import com.xiaomi.onetrack.c.q;
import defpackage.c4b;
import defpackage.etk;
import defpackage.ial;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/net/di/HttpClientModule;", "", "Lcom/xiaomi/fitness/net/HttpConfig;", q.f13857a, "Lcom/xiaomi/fitness/net/interceptor/HttpHandlerInterceptor;", "httpHandlerInterceptor", "", "Lokhttp3/Interceptor;", "Lkotlin/jvm/JvmSuppressWildcards;", "interceptors", "Lokhttp3/OkHttpClient$Builder;", "provideOkHttpBuilder", "(Lcom/xiaomi/fitness/net/HttpConfig;Lcom/xiaomi/fitness/net/interceptor/HttpHandlerInterceptor;Ljava/util/Set;)Lokhttp3/OkHttpClient$Builder;", "builder", "Lokhttp3/OkHttpClient;", "provideOkHttpClient", "(Lokhttp3/OkHttpClient$Builder;)Lokhttp3/OkHttpClient;", "client", "Lcom/google/gson/Gson;", "gson", "Letk;", "providerRetrofit", "(Lokhttp3/OkHttpClient;Lcom/xiaomi/fitness/net/HttpConfig;Lcom/google/gson/Gson;)Letk;", "providerGson", "()Lcom/google/gson/Gson;", "<init>", "()V", "net_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHttpClientModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientModule.kt\ncom/xiaomi/fitness/net/di/HttpClientModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1863#2,2:89\n1863#2,2:91\n*S KotlinDebug\n*F\n+ 1 HttpClientModule.kt\ncom/xiaomi/fitness/net/di/HttpClientModule\n*L\n46#1:89,2\n49#1:91,2\n*E\n"})
public final class HttpClientModule {
    @NotNull
    public final OkHttpClient.Builder provideOkHttpBuilder(@NotNull HttpConfig config, @NotNull HttpHandlerInterceptor httpHandlerInterceptor, @NotNull Set<Interceptor> interceptors) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(httpHandlerInterceptor, "httpHandlerInterceptor");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TLSCompatSocketFactory.Companion companion = TLSCompatSocketFactory.INSTANCE;
        builder.sslSocketFactory(companion.sslSocketFactory(), companion.trustManager());
        builder.addInterceptor(httpHandlerInterceptor);
        Iterator<T> it = interceptors.iterator();
        while (it.hasNext()) {
            builder.addInterceptor((Interceptor) it.next());
        }
        Iterator<T> it2 = config.getInterceptors().iterator();
        while (it2.hasNext()) {
            builder.addInterceptor((Interceptor) it2.next());
        }
        long timeout = config.getTimeout();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        builder.connectTimeout(timeout, timeUnit);
        builder.writeTimeout(config.getTimeout(), timeUnit);
        builder.readTimeout(config.getTimeout(), timeUnit);
        return builder;
    }

    @NotNull
    public final OkHttpClient provideOkHttpClient(@NotNull OkHttpClient.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.build();
    }

    @NotNull
    public final Gson providerGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
        Gson gsonCreate = gsonBuilder.create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
        return gsonCreate;
    }

    @NotNull
    public final etk providerRetrofit(@NotNull OkHttpClient client, @NotNull HttpConfig config, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(gson, "gson");
        etk etkVarE = new etk.b().b(c4b.g(gson)).b(ial.f()).c(config.getHost()).g(client).e();
        Intrinsics.checkNotNullExpressionValue(etkVarE, "build(...)");
        return etkVarE;
    }
}
