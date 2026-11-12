package com.xiaomi.fitness.net;

import com.xiaomi.fitness.common.repository.Repository;
import com.xiaomi.fitness.net.HttpRepository;
import com.xiaomi.fitness.net.url.ApiHolder;
import com.xiaomi.fitness.net.url.Timeout;
import defpackage.etk;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b%\u0010&J%\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u000b*\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0007R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/net/HttpRepository;", "Lcom/xiaomi/fitness/common/repository/Repository;", "", "T", "Ljava/lang/Class;", "apiClass", "createApi", "(Ljava/lang/Class;)Ljava/lang/Object;", "Letk$b;", "", "url", "", "rebuildClient", "(Letk$b;Ljava/lang/Class;Ljava/lang/String;)V", "serviceClass", "getService", "Letk;", "mRetrofit", "Letk;", "getMRetrofit", "()Letk;", "setMRetrofit", "(Letk;)V", "Lokhttp3/OkHttpClient;", "mOkHttpClient", "Lokhttp3/OkHttpClient;", "getMOkHttpClient", "()Lokhttp3/OkHttpClient;", "setMOkHttpClient", "(Lokhttp3/OkHttpClient;)V", "Lcom/xiaomi/fitness/net/url/ApiHolder;", "mApiHolder", "Lcom/xiaomi/fitness/net/url/ApiHolder;", "getMApiHolder", "()Lcom/xiaomi/fitness/net/url/ApiHolder;", "setMApiHolder", "(Lcom/xiaomi/fitness/net/url/ApiHolder;)V", "<init>", "()V", "net_release"}, k = 1, mv = {2, 0, 0})
public final class HttpRepository implements Repository {
    public ApiHolder mApiHolder;
    public OkHttpClient mOkHttpClient;
    public etk mRetrofit;

    private final <T> T createApi(Class<?> apiClass) {
        String baseUrl = getMApiHolder().getBaseUrl(apiClass);
        etk.b bVarD = getMRetrofit().d();
        Intrinsics.checkNotNull(bVarD);
        rebuildClient(bVarD, apiClass, baseUrl);
        T t = (T) bVarD.c(baseUrl).e().b(apiClass);
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of com.xiaomi.fitness.net.HttpRepository.createApi");
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getService$lambda$0(HttpRepository this$0, Class serviceClass) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(serviceClass, "$serviceClass");
        return this$0.createApi(serviceClass);
    }

    private final void rebuildClient(etk.b bVar, Class<?> cls, String str) {
        OkHttpClient.Builder builderNewBuilder;
        if (cls.isAnnotationPresent(Timeout.class)) {
            Annotation annotation = cls.getAnnotation(Timeout.class);
            Intrinsics.checkNotNull(annotation);
            Timeout timeout = (Timeout) annotation;
            builderNewBuilder = getMOkHttpClient().newBuilder();
            if (timeout.connect() > 0) {
                builderNewBuilder.connectTimeout(timeout.connect(), timeout.timeUnit());
            }
            if (timeout.read() > 0) {
                builderNewBuilder.readTimeout(timeout.read(), timeout.timeUnit());
            }
            if (timeout.write() > 0) {
                builderNewBuilder.writeTimeout(timeout.write(), timeout.timeUnit());
            }
        } else {
            builderNewBuilder = null;
        }
        if (builderNewBuilder != null) {
            bVar.g(builderNewBuilder.build());
        }
    }

    @NotNull
    public final ApiHolder getMApiHolder() {
        ApiHolder apiHolder = this.mApiHolder;
        if (apiHolder != null) {
            return apiHolder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mApiHolder");
        return null;
    }

    @NotNull
    public final OkHttpClient getMOkHttpClient() {
        OkHttpClient okHttpClient = this.mOkHttpClient;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOkHttpClient");
        return null;
    }

    @NotNull
    public final etk getMRetrofit() {
        etk etkVar = this.mRetrofit;
        if (etkVar != null) {
            return etkVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRetrofit");
        return null;
    }

    @Override // com.xiaomi.fitness.common.repository.Repository
    public <T> T getService(@NotNull final Class<T> serviceClass) {
        Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
        return (T) getMApiHolder().getService$net_release(serviceClass, new Function0() { // from class: bhc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HttpRepository.getService$lambda$0(this.f4214a, serviceClass);
            }
        });
    }

    public final void setMApiHolder(@NotNull ApiHolder apiHolder) {
        Intrinsics.checkNotNullParameter(apiHolder, "<set-?>");
        this.mApiHolder = apiHolder;
    }

    public final void setMOkHttpClient(@NotNull OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "<set-?>");
        this.mOkHttpClient = okHttpClient;
    }

    public final void setMRetrofit(@NotNull etk etkVar) {
        Intrinsics.checkNotNullParameter(etkVar, "<set-?>");
        this.mRetrofit = etkVar;
    }
}
