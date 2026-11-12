package com.xiaomi.fitness.net.interceptor;

import com.xiaomi.onetrack.api.b;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/net/interceptor/HttpBeforeHandler;", "", "onHttpRequestBefore", "Lokhttp3/Request;", "chain", "Lokhttp3/Interceptor$Chain;", "request", "onHttpResponseBefore", "Lokhttp3/Response;", b.I, "priority", "", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HttpBeforeHandler {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static Response onHttpResponseBefore(@NotNull HttpBeforeHandler httpBeforeHandler, @NotNull Interceptor.Chain chain, @NotNull Response response) throws IOException {
            Intrinsics.checkNotNullParameter(chain, "chain");
            Intrinsics.checkNotNullParameter(response, "response");
            return response;
        }

        public static int priority(@NotNull HttpBeforeHandler httpBeforeHandler) {
            return 0;
        }
    }

    @NotNull
    Request onHttpRequestBefore(@NotNull Interceptor.Chain chain, @NotNull Request request) throws IOException;

    @NotNull
    Response onHttpResponseBefore(@NotNull Interceptor.Chain chain, @NotNull Response response) throws IOException;

    int priority();
}
