package com.xiaomi.hm.health.modules;

import com.huami.hid.takepic.TakePicSettingActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0017\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "", "isMili", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)Z", TakePicSettingActivity.KEY_IS_WATCH, "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class ModulesUtilKt {
    public static final boolean isMili(@NotNull HMDeviceSource hMDeviceSource) {
        return hMDeviceSource.getType() == HMDeviceType.MILI;
    }

    public static final boolean isWatch(@NotNull HMDeviceSource hMDeviceSource) {
        return hMDeviceSource.getType() == HMDeviceType.WATCH;
    }
}
