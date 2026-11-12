package com.huami.nfc.web.interceptor;

import com.huami.nfc.web.PayHeaderKt;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R(\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/nfc/web/interceptor/HeaderInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lkotlin/Function0;", "", "", "a", "Lkotlin/jvm/functions/Function0;", "header", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "web_release"}, k = 1, mv = {1, 5, 1})
public final class HeaderInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<Map<String, String>> header;

    /* JADX WARN: Multi-variable type inference failed */
    public HeaderInterceptor(@NotNull Function0<? extends Map<String, String>> function0) {
        this.header = function0;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        for (Map.Entry<String, String> entry : this.header.invoke().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.length() == 0) {
                throw new IllegalArgumentException("Http Request Header ERROR. The key(" + key + ") of value must not be empty. 请检查Header信息。");
            }
            try {
                builderNewBuilder.addHeader(key, value);
            } catch (IllegalArgumentException e) {
                if (!Intrinsics.areEqual(key, PayHeaderKt.HEADER_IMEI)) {
                    throw e;
                }
                builderNewBuilder.addHeader(key, "sn_android");
            }
        }
        builderNewBuilder.addHeader("X-Request-Id", UUID.randomUUID().toString());
        return chain.proceed(builderNewBuilder.build());
    }
}
