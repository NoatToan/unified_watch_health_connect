package com.xiaomi.fitness.sport_manager_export.utils;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"isSupportWristPosture", "", DailyRecordKey.sportType, "", "sport-manager-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SportStateUtilsKt {
    @JvmOverloads
    public static final boolean isSupportWristPosture() {
        return isSupportWristPosture$default(0, 1, null);
    }

    public static /* synthetic */ boolean isSupportWristPosture$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return isSupportWristPosture(i);
    }

    @JvmOverloads
    public static final boolean isSupportWristPosture(int i) {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (i == 0) {
            i = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).getSportLaunchType();
        }
        return i == 1 && wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected() && (DeviceManagerExtKt.getInstance(companion).getDeviceCapabilityV2(wearableDeviceModel.getDid()) & 8) != 0 && SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).getAppLaunchType() == 3;
    }
}
