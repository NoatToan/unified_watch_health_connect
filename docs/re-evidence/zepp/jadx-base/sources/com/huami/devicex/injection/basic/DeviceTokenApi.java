package com.huami.devicex.injection.basic;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\n"}, d2 = {"Lcom/huami/devicex/injection/basic/DeviceTokenApi;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "isSupportDeviceToken", "", "getTpacProvider", "getSecret", "getClientId", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface DeviceTokenApi {
    @NotNull
    String getClientId(@Nullable HMDeviceSource source);

    @NotNull
    String getSecret(@Nullable HMDeviceSource source);

    @Nullable
    String getTpacProvider(@Nullable HMDeviceSource source);

    boolean isSupportDeviceToken(@Nullable HMDeviceSource source);
}
