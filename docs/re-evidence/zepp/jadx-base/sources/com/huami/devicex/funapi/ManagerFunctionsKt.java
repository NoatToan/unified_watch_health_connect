package com.huami.devicex.funapi;

import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.xiaomi.hm.health.device.agps.LowBatteryApi;
import com.xiaomi.hm.health.device.agps.SmartWatchUpgradeAgpsApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/huami/devicex/manager/DeviceManagerApi;", "getDeviceManagerApi", "Lcom/xiaomi/hm/health/device/agps/SmartWatchUpgradeAgpsApi;", "getSmartWatchUpgradeAgpsApi", "Lcom/xiaomi/hm/health/device/agps/LowBatteryApi;", "getLowBatteryApi", "Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "getDeviceTimeStoreApi", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class ManagerFunctionsKt {
    @NotNull
    public static final DeviceManagerApi getDeviceManagerApi() {
        return (DeviceManagerApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), null, null);
    }

    @NotNull
    public static final DeviceTimeStoreApi getDeviceTimeStoreApi() {
        return (DeviceTimeStoreApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceTimeStoreApi.class), null, null);
    }

    @NotNull
    public static final LowBatteryApi getLowBatteryApi() {
        return (LowBatteryApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(LowBatteryApi.class), null, null);
    }

    @NotNull
    public static final SmartWatchUpgradeAgpsApi getSmartWatchUpgradeAgpsApi() {
        return (SmartWatchUpgradeAgpsApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SmartWatchUpgradeAgpsApi.class), null, null);
    }
}
