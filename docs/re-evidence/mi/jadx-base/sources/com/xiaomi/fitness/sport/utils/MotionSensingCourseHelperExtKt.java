package com.xiaomi.fitness.sport.utils;

import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"supportsMotionSensingCourse", "", "getSupportsMotionSensingCourse", "()Z", "sport_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MotionSensingCourseHelperExtKt {
    public static final boolean getSupportsMotionSensingCourse() {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        return (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected() || (DeviceManagerExtKt.getInstance(companion).getDeviceCapability(wearableDeviceModel.getDid()) & 512) == 0) ? false : true;
    }
}
