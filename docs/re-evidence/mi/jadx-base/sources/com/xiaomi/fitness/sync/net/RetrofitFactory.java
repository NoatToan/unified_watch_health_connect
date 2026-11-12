package com.xiaomi.fitness.sync.net;

import com.xiaomi.fitness.net.TLSCompatSocketFactory;
import defpackage.c4b;
import defpackage.etk;
import defpackage.m5l;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001aB\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/sync/net/RetrofitFactory;", "", "Lokhttp3/CookieJar;", "cookieJar", "Lokhttp3/OkHttpClient;", "initClient", "(Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient;", "T", "Ljava/lang/Class;", "clazz", "", "baseUrl", "getService", "(Ljava/lang/Class;Ljava/lang/String;Lokhttp3/CookieJar;)Ljava/lang/Object;", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "Letk;", "getRetrofit", "(Ljava/lang/String;Lokhttp3/CookieJar;)Letk;", "Ljava/util/HashMap;", "mRetrofits", "Ljava/util/HashMap;", "Lokhttp3/logging/HttpLoggingInterceptor;", "mLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "<init>", "()V", "Companion", "SingleHolder", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RetrofitFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private HttpLoggingInterceptor mLoggingInterceptor;

    @NotNull
    private final HashMap<String, etk> mRetrofits;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sync/net/RetrofitFactory$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/sync/net/RetrofitFactory;", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RetrofitFactory instance() {
            return SingleHolder.INSTANCE.getINSTANCE();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\b\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sync/net/RetrofitFactory$SingleHolder;", "", "<init>", "()V", "INSTANCE", "Lcom/xiaomi/fitness/sync/net/RetrofitFactory;", "getINSTANCE", "()Lcom/xiaomi/fitness/sync/net/RetrofitFactory;", "INSTANCE$1", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SingleHolder {

        @NotNull
        public static final SingleHolder INSTANCE = new SingleHolder();

        /* JADX INFO: renamed from: INSTANCE$1, reason: from kotlin metadata */
        @NotNull
        private static final RetrofitFactory INSTANCE = new RetrofitFactory(null);

        private SingleHolder() {
        }

        @NotNull
        public final RetrofitFactory getINSTANCE() {
            return INSTANCE;
        }
    }

    public /* synthetic */ RetrofitFactory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final OkHttpClient initClient(CookieJar cookieJar) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TLSCompatSocketFactory.Companion companion = TLSCompatSocketFactory.INSTANCE;
        builder.sslSocketFactory(companion.sslSocketFactory(), companion.trustManager()).addInterceptor(new HeaderInterceptor()).addInterceptor(new CommonInterceptor());
        if (cookieJar != null) {
            builder.cookieJar(cookieJar);
        }
        return builder.build();
    }

    @NotNull
    public final etk getRetrofit(@NotNull String baseUrl, @Nullable CookieJar cookieJar) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        etk etkVar = this.mRetrofits.get(baseUrl);
        if (etkVar != null) {
            return etkVar;
        }
        etk etkVarE = new etk.b().c(baseUrl).g(initClient(cookieJar)).b(c4b.f()).a(m5l.d()).e();
        this.mRetrofits.put(baseUrl, etkVarE);
        Intrinsics.checkNotNull(etkVarE);
        return etkVarE;
    }

    public final <T> T getService(@Nullable Class<T> clazz, @NotNull String baseUrl, @Nullable CookieJar cookieJar) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        return (T) getRetrofit(baseUrl, cookieJar).b(clazz);
    }

    private RetrofitFactory() {
        this.mRetrofits = new HashMap<>();
    }

    public final <T> T getService(@Nullable Class<T> clazz, @NotNull String baseUrl) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        return (T) getService(clazz, baseUrl, null);
    }
}
