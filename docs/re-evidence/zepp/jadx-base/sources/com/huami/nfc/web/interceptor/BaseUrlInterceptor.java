package com.huami.nfc.web.interceptor;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/nfc/web/interceptor/BaseUrlInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "url", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "web_release"}, k = 1, mv = {1, 5, 1})
public final class BaseUrlInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> url;

    public BaseUrlInterceptor(@NotNull Function0<String> function0) {
        this.url = function0;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        HttpUrl httpUrl = HttpUrl.parse(this.url.invoke());
        if (httpUrl != null) {
            request = request.newBuilder().url(chain.request().url().newBuilder().scheme(httpUrl.scheme()).host(httpUrl.url().toURI().getHost()).port(httpUrl.port()).build()).build();
        }
        return chain.proceed(request);
    }
}
