package com.xiaomi.fitness.sync.net;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.NetUtil;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sync/net/CommonInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonInterceptor implements Interceptor {

    @NotNull
    private static final String TAG = "CommonInterceptor";

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        boolean netWorkAvailable = NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication());
        Logger.d(TAG, "intercept: netEnable = " + netWorkAvailable);
        if (netWorkAvailable) {
            return chain.proceed(chain.request());
        }
        throw new NoNetException("network is unavailable");
    }
}
