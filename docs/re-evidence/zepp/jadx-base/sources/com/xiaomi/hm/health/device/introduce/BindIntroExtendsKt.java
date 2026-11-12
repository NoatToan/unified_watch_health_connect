package com.xiaomi.hm.health.device.introduce;

import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0004\u001a\u0018\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "supportBindIntro", "Lcom/xiaomi/hm/health/databases/model/Device;", "isActive", "stopDevice", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "stopType", "needSyncData", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class BindIntroExtendsKt {
    public static final boolean isActive(@NotNull Device device) {
        Integer activeStatus = device.getActiveStatus();
        return activeStatus != null && activeStatus.intValue() == 1;
    }

    public static final boolean needSyncData(@Nullable Device device, @NotNull HMDeviceType hMDeviceType) {
        if (device == null || hMDeviceType == HMDeviceType.WEIGHT || hMDeviceType == HMDeviceType.WATCH) {
            return false;
        }
        Calendar boundDeviceSyncTime = ManagerFunctionsKt.getDeviceTimeStoreApi().getBoundDeviceSyncTime(hMDeviceType);
        Calendar calendar = Calendar.getInstance();
        boundDeviceSyncTime.add(12, 1);
        return boundDeviceSyncTime.compareTo(calendar) <= 0;
    }

    public static final boolean supportBindIntro(@NotNull HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(hMDeviceSource, Feature.SUPPORT_BIND_INTRO);
    }
}
