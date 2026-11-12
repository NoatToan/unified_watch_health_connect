package com.xiaomi.fitness.devicesettings.huami.healthmonitor.utils;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.DeviceSettingsSyncer;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrModeKt;
import com.xiaomi.fitness.settingitem.settingitem.HRDetect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ \u0010\n\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/utils/HrUtils;", "", "<init>", "()V", "defaultKongMingConfig", "Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;", "defaultPanguConfig", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "defaultL66Config", "syncSetting2device", "", "info", "isKongMing", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HrUtils {

    @NotNull
    public static final HrUtils INSTANCE = new HrUtils();

    private HrUtils() {
    }

    @NotNull
    public final HRDetect defaultKongMingConfig() {
        return new HRDetect();
    }

    @NotNull
    public final HRDetect defaultL66Config(@Nullable WearableDeviceModel deviceModel) {
        HRDetect hRDetect = new HRDetect();
        hRDetect.setType(2);
        hRDetect.setFreq(255);
        hRDetect.setAbnormalHeartbeatEnable(false);
        return hRDetect;
    }

    @NotNull
    public final HRDetect defaultPanguConfig(@Nullable WearableDeviceModel deviceModel) {
        HRDetect hRDetect = new HRDetect();
        if (deviceModel != null && DeviceModelExtKt.isPanGu(deviceModel)) {
            hRDetect.setType(2);
            hRDetect.setFreq(10);
            hRDetect.setWarningEnable(true);
            hRDetect.setWarningValue(150);
        }
        return hRDetect;
    }

    public final void syncSetting2device(@Nullable WearableDeviceModel deviceModel, @NotNull HRDetect info, boolean isKongMing) {
        HuamiApiCaller huamiDevice;
        Intrinsics.checkNotNullParameter(info, "info");
        Logger.i(DeviceSettingsSyncer.TAG, "syncSetting2device start info:" + info);
        if (deviceModel == null || (huamiDevice = com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(deviceModel)) == null) {
            Logger.w(DeviceSettingsSyncer.TAG, "syncSetting2device error:HuamiApiCaller is null");
            return;
        }
        int type = info.getType();
        Logger.i(DeviceSettingsSyncer.TAG, "syncHeartInfo hrFreq " + HrModeKt.getHrFreq(info.getFreq()) + " mode:" + type + "  info.freq:" + info.getFreq());
        if (type == 1) {
            huamiDevice.enableHeart(false, info.getFreq());
            huamiDevice.enableSleep(true);
        } else if (type == 2) {
            huamiDevice.enableHeart(true, info.getFreq());
            huamiDevice.enableSleep(false);
        } else if (type != 3) {
            huamiDevice.enableHeartAndSleep(false, info.getFreq());
        } else {
            huamiDevice.enableHeartAndSleep(true, info.getFreq());
        }
        huamiDevice.enableSportHeartRate(info.isActiveEnable());
        huamiDevice.enablePressure(info.isPressureEnable());
        if (!isKongMing) {
            huamiDevice.setAtrialFibEnable(info.isAbnormalHeartbeatEnable());
            huamiDevice.enableOsa(info.isSleepBreathQualityEnable());
        }
        huamiDevice.setHighHr(info.isWarningEnable(), info.getWarningValue());
        huamiDevice.setLowHr(info.isLowWarningEnable(), info.getLowWarningValue());
        huamiDevice.enableRelax(info.isRelaxReminder());
        huamiDevice.enableSpo2(info.isSpo2Enable());
        huamiDevice.setLowSpo2(info.isLowSpo2WarningEnable() ? info.getLowSpo2WarningValue() : -1);
        Logger.i(DeviceSettingsSyncer.TAG, "syncSetting2device end info:" + info);
    }
}
