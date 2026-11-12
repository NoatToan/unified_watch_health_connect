package com.xiaomi.fitness.net;

import com.xiaomi.fitness.net.response.HttpResultHandler;
import com.xiaomi.onetrack.api.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u001d\"\u00020\f¢\u0006\u0002\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/net/HttpConfig;", "", "<init>", "()V", b.E, "", "getHost", "()Ljava/lang/String;", "setHost", "(Ljava/lang/String;)V", "interceptors", "", "Lokhttp3/Interceptor;", "getInterceptors", "()Ljava/util/List;", "timeout", "", "getTimeout", "()J", "setTimeout", "(J)V", "httpResultHandler", "Lcom/xiaomi/fitness/net/response/HttpResultHandler;", "getHttpResultHandler", "()Lcom/xiaomi/fitness/net/response/HttpResultHandler;", "setHttpResultHandler", "(Lcom/xiaomi/fitness/net/response/HttpResultHandler;)V", "interceptor", "", "", "([Lokhttp3/Interceptor;)V", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpConfig {
    public HttpResultHandler httpResultHandler;

    @NotNull
    private String host = "";

    @NotNull
    private final List<Interceptor> interceptors = new ArrayList();
    private long timeout = 10000;

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final HttpResultHandler getHttpResultHandler() {
        HttpResultHandler httpResultHandler = this.httpResultHandler;
        if (httpResultHandler != null) {
            return httpResultHandler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("httpResultHandler");
        return null;
    }

    @NotNull
    public final List<Interceptor> getInterceptors() {
        return this.interceptors;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    public final void interceptor(@NotNull Interceptor... interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        CollectionsKt__MutableCollectionsKt.addAll(this.interceptors, interceptor);
    }

    public final void setHost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.host = str;
    }

    public final void setHttpResultHandler(@NotNull HttpResultHandler httpResultHandler) {
        Intrinsics.checkNotNullParameter(httpResultHandler, "<set-?>");
        this.httpResultHandler = httpResultHandler;
    }

    public final void setTimeout(long j) {
        this.timeout = j;
    }
}
