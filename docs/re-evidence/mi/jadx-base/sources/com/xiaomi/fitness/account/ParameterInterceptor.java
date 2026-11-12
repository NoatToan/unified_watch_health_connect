package com.xiaomi.fitness.account;

import com.miui.tsmclient.common.net.NetConstants;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.net.interceptor.HttpBeforeHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/account/ParameterInterceptor;", "Lcom/xiaomi/fitness/net/interceptor/HttpBeforeHandler;", "<init>", "()V", "onHttpRequestBefore", "Lokhttp3/Request;", "chain", "Lokhttp3/Interceptor$Chain;", "request", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ParameterInterceptor implements HttpBeforeHandler {
    @Override // com.xiaomi.fitness.net.interceptor.HttpBeforeHandler
    @NotNull
    public Request onHttpRequestBefore(@NotNull Interceptor.Chain chain, @NotNull Request request) {
        String str;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(request, "request");
        String strHeader = request.header(NetConstants.COOKIE);
        if (strHeader == null || strHeader.length() == 0) {
            str = "locale=" + LocaleUtil.getCurrentLocale();
        } else {
            str = strHeader + "; locale=" + LocaleUtil.getCurrentLocale();
        }
        return request.newBuilder().header(NetConstants.COOKIE, str).build();
    }

    @Override // com.xiaomi.fitness.net.interceptor.HttpBeforeHandler
    @NotNull
    public Response onHttpResponseBefore(@NotNull Interceptor.Chain chain, @NotNull Response response) {
        return HttpBeforeHandler.DefaultImpls.onHttpResponseBefore(this, chain, response);
    }

    @Override // com.xiaomi.fitness.net.interceptor.HttpBeforeHandler
    public int priority() {
        return HttpBeforeHandler.DefaultImpls.priority(this);
    }
}
