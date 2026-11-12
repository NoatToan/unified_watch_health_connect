package com.huami.watch.companion.cloud;

import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/watch/companion/cloud/HeaderInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "", "a", "Ljava/lang/String;", "userAgent", "<init>", "(Ljava/lang/String;)V", "companionlib_release"}, k = 1, mv = {1, 4, 0})
public final class HeaderInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String userAgent;

    public HeaderInterceptor(@NotNull String str) {
        this.userAgent = str;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        if (this.userAgent.length() > 0) {
            builderNewBuilder.removeHeader("User-Agent").addHeader("User-Agent", this.userAgent);
        }
        return chain.proceed(builderNewBuilder.build());
    }
}
