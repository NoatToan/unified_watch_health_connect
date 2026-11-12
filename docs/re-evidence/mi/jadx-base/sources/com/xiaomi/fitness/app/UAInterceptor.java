package com.xiaomi.fitness.app;

import android.os.Build;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DeviceUtil;
import com.xiaomi.fitness.common.utils.MD5Util;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/app/UAInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "userAgent", "", "fit-app_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UAInterceptor implements Interceptor {
    private final String userAgent() {
        String deviceID = DeviceUtil.INSTANCE.getDeviceID(ApplicationExtKt.getApplication());
        if (deviceID != null && deviceID.length() != 0) {
            deviceID = MD5Util.MD5(deviceID);
        }
        String userId = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).getUserId();
        if (userId != null && userId.length() != 0) {
            userId = MD5Util.MD5(userId);
        }
        return "Android-" + Build.VERSION.RELEASE + "-" + AppUtil.getVersionName() + "-" + Build.BRAND + "-" + Build.MODEL + "-" + deviceID + "-" + userId;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.proceed(chain.request().newBuilder().header("User-Agent", userAgent()).build());
    }
}
