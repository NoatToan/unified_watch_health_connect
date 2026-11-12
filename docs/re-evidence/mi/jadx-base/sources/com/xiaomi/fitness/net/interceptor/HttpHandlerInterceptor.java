package com.xiaomi.fitness.net.interceptor;

import android.text.TextUtils;
import com.xiaomi.fitness.net.interceptor.HttpBeforeHandler;
import com.xiaomi.fitness.net.interceptor.HttpHandlerInterceptor;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001c\b\u0007\u0012\u0011\u0010\u0002\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/net/interceptor/HttpHandlerInterceptor;", "Lokhttp3/Interceptor;", "beforeHandlers", "", "Lcom/xiaomi/fitness/net/interceptor/HttpBeforeHandler;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljava/util/Set;)V", "mHttpBeforeHandlers", "", "onHttpRequestBefore", "Lokhttp3/Request;", "chain", "Lokhttp3/Interceptor$Chain;", "request", "onHttpResultResponse", "Lokhttp3/Response;", b.I, "intercept", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpHandlerInterceptor implements Interceptor {

    @NotNull
    private List<? extends HttpBeforeHandler> mHttpBeforeHandlers;

    public HttpHandlerInterceptor(@NotNull Set<HttpBeforeHandler> beforeHandlers) {
        Intrinsics.checkNotNullParameter(beforeHandlers, "beforeHandlers");
        final Function2 function2 = new Function2() { // from class: zfc
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(HttpHandlerInterceptor.mHttpBeforeHandlers$lambda$0((HttpBeforeHandler) obj, (HttpBeforeHandler) obj2));
            }
        };
        this.mHttpBeforeHandlers = CollectionsKt___CollectionsKt.sortedWith(beforeHandlers, new Comparator() { // from class: agc
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return HttpHandlerInterceptor.mHttpBeforeHandlers$lambda$1(function2, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mHttpBeforeHandlers$lambda$0(HttpBeforeHandler httpBeforeHandler, HttpBeforeHandler httpBeforeHandler2) {
        return httpBeforeHandler2.priority() - httpBeforeHandler.priority();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mHttpBeforeHandlers$lambda$1(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final Request onHttpRequestBefore(Interceptor.Chain chain, Request request) throws IOException {
        if (!this.mHttpBeforeHandlers.isEmpty()) {
            Iterator<? extends HttpBeforeHandler> it = this.mHttpBeforeHandlers.iterator();
            while (it.hasNext()) {
                request = it.next().onHttpRequestBefore(chain, request);
            }
        }
        return request;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Response responseProceed = chain.proceed(onHttpRequestBefore(chain, chain.request()));
        if (!this.mHttpBeforeHandlers.isEmpty()) {
            Iterator<? extends HttpBeforeHandler> it = this.mHttpBeforeHandlers.iterator();
            while (it.hasNext()) {
                responseProceed = it.next().onHttpResponseBefore(chain, responseProceed);
            }
        }
        return onHttpResultResponse(chain, responseProceed);
    }

    @NotNull
    public final Response onHttpResultResponse(@Nullable Interceptor.Chain chain, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        TextUtils.isEmpty(Response.header$default(response, HTTP.DATE_HEADER, null, 2, null));
        return response;
    }
}
