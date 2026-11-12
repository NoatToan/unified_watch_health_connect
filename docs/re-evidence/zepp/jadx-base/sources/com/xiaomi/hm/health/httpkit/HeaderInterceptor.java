package com.xiaomi.hm.health.httpkit;

import com.xiaomi.hm.health.utils.ex.CrashReportExtKt;
import com.xiaomi.hm.health.webapi.HMWebInit;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R(\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/httpkit/HeaderInterceptor;", "Lokhttp3/Interceptor;", "", "name", "value", "", "a", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lkotlin/Function0;", "", "Lkotlin/jvm/functions/Function0;", "header", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HeaderInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<Map<String, String>> header;

    /* JADX WARN: Multi-variable type inference failed */
    public HeaderInterceptor(@NotNull Function0<? extends Map<String, String>> function0) {
        this.header = function0;
    }

    private final boolean a(String name, String value) {
        try {
            if (value == null) {
                throw new NullPointerException("value for name " + name + " == null");
            }
            for (int i = 0; i < value.length(); i++) {
                char cCharAt = value.charAt(i);
                if (!((Intrinsics.compare((int) cCharAt, 31) > 0 || cCharAt == '\t') && Intrinsics.compare((int) cCharAt, 127) < 0)) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), name, value).toString());
                }
            }
            return true;
        } catch (Exception e) {
            CrashReportExtKt.reportManual(new Exception("手动上报：" + e.getMessage(), e));
            return false;
        }
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        try {
            for (Map.Entry<String, String> entry : this.header.invoke().entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (a(key, value)) {
                    builderNewBuilder.addHeader(key, value);
                }
            }
            builderNewBuilder.addHeader("X-Request-Id", UUID.randomUUID().toString());
            if (HMWebInit.userAgentInfo().length() > 0) {
                builderNewBuilder.removeHeader("User-Agent").addHeader("User-Agent", HMWebInit.userAgentInfo());
            }
        } catch (Exception e) {
            CrashReportExtKt.reportManual(new Exception("手动上报：" + e.getMessage(), e));
        }
        return chain.proceed(builderNewBuilder.build());
    }
}
