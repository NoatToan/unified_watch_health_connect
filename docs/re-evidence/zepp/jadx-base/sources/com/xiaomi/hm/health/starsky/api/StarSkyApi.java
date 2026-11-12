package com.xiaomi.hm.health.starsky.api;

import com.xiaomi.hm.health.starsky.StartSkyDataCallback;
import com.xiaomi.mipush.sdk.MiPushClient;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/starsky/api/StarSkyApi;", "", "Lcom/xiaomi/hm/health/starsky/StartSkyDataCallback;", "callback", "", "registerDataCallback", MiPushClient.COMMAND_UNREGISTER, "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface StarSkyApi {
    void registerDataCallback(@NotNull StartSkyDataCallback callback);

    void unregister();
}
