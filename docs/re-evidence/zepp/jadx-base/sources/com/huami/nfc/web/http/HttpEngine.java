package com.huami.nfc.web.http;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\u00020\b8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/nfc/web/http/HttpEngine;", "", "Lretrofit2/Retrofit;", "a", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "retrofit", "Lcom/huami/nfc/web/http/HttpService;", "b", "Lkotlin/Lazy;", "getService", "()Lcom/huami/nfc/web/http/HttpService;", "service", "<init>", "(Lretrofit2/Retrofit;)V", "web_release"}, k = 1, mv = {1, 5, 1})
public final class HttpEngine {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Retrofit retrofit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy service = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/nfc/web/http/HttpService;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HttpService> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HttpService invoke() {
            return (HttpService) HttpEngine.this.getRetrofit().create(HttpService.class);
        }
    }

    public HttpEngine(@NotNull Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    @NotNull
    public final Retrofit getRetrofit() {
        return this.retrofit;
    }

    @NotNull
    public final HttpService getService() {
        return (HttpService) this.service.getValue();
    }
}
