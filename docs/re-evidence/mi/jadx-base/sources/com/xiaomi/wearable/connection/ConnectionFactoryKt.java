package com.xiaomi.wearable.connection;

import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.wear.api.IDeviceApiCall;
import com.xiaomi.wearable.wear.api.ThirdPartyApiCall;
import defpackage.lq2;
import defpackage.x6o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Llq2;", "apiCall", "Lcom/xiaomi/wearable/core/DeviceInfo;", "deviceInfo", "Lcom/xiaomi/wearable/connection/BleConnection;", "createBleConnection", "(Llq2;Lcom/xiaomi/wearable/core/DeviceInfo;)Lcom/xiaomi/wearable/connection/BleConnection;", "Lcom/xiaomi/wearable/wear/api/ThirdPartyApiCall;", "Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", "device", "Lcom/xiaomi/wearable/connection/ThirdPartyConnection;", "createThirdPartyConnection", "(Lcom/xiaomi/wearable/core/DeviceInfo;Lcom/xiaomi/wearable/wear/api/ThirdPartyApiCall;Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;)Lcom/xiaomi/wearable/connection/ThirdPartyConnection;", "Lx6o;", "Lcom/xiaomi/wearable/connection/SppConnection;", "createSppConnection", "(Lcom/xiaomi/wearable/core/DeviceInfo;Lx6o;)Lcom/xiaomi/wearable/connection/SppConnection;", "", "V1_BIND", "I", "V2_LOCAL_BIND", "V2_PSK_BIND", "miwear-core_release"}, k = 2, mv = {2, 0, 0})
public final class ConnectionFactoryKt {
    public static final int V1_BIND = 0;
    public static final int V2_LOCAL_BIND = 1;
    public static final int V2_PSK_BIND = 2;

    @NotNull
    public static final BleConnection createBleConnection(@NotNull lq2 apiCall, @NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(apiCall, "apiCall");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        BleConnection bleConnection = new BleConnection(deviceInfo, apiCall);
        bleConnection.setRetryStrategy(deviceInfo.isLocalBindMode() ? new TimeDurationStrategy(10, 2, 1, 256) : new ExponentialBackoffStrategy(2, 1, 256));
        return bleConnection;
    }

    @NotNull
    public static final SppConnection createSppConnection(@NotNull DeviceInfo deviceInfo, @NotNull x6o apiCall) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(apiCall, "apiCall");
        SppConnection sppConnection = new SppConnection(deviceInfo, apiCall);
        sppConnection.setRetryStrategy(deviceInfo.getRetryStrategy() == 1 ? null : new ExponentialBackoffStrategy(2, 1, 256));
        return sppConnection;
    }

    @NotNull
    public static final ThirdPartyConnection createThirdPartyConnection(@NotNull DeviceInfo deviceInfo, @NotNull ThirdPartyApiCall apiCall, @NotNull IDeviceApiCall device) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(apiCall, "apiCall");
        Intrinsics.checkNotNullParameter(device, "device");
        ThirdPartyConnection thirdPartyConnection = new ThirdPartyConnection(deviceInfo, apiCall, device);
        thirdPartyConnection.setRetryStrategy(new ExponentialBackoffStrategy(2, 1, 256));
        return thirdPartyConnection;
    }
}
