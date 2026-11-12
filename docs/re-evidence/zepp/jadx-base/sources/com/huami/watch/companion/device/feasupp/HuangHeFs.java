package com.huami.watch.companion.device.feasupp;

import androidx.annotation.NonNull;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class HuangHeFs implements IFeatureSupp {
    private static final String a = "HuangHeFs";

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportAutoUpdate(@NonNull Device device) {
        boolean zIsRomSupport = DeviceUtil.isRomSupport(device, new String[]{"1", "1", "8a"});
        Log.d(a, "IsRomSupportAutoUpdate : " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportFTP(@NonNull Device device) {
        boolean zIsRomWOS2 = DeviceUtil.isOverseaEdition(device) ? isRomWOS2(device) : DeviceUtil.isRomSupport(device, new String[]{"1", "2", "47"});
        Log.d(a, "isRomSupportFTP : " + zIsRomWOS2, new Object[0]);
        return zIsRomWOS2;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportHRR(@NonNull Device device) {
        boolean zIsRomSupport = DeviceUtil.isRomSupport(device, DeviceUtil.isOverseaEdition(device) ? new String[]{"2", "8", "0", "0"} : new String[]{"2", "6", "1", "5"});
        Log.d(a, "isRomSupportHRR : " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportHideSportItem(@NonNull Device device) {
        boolean zIsRomWOS2 = isRomWOS2(device);
        Log.d(a, "isRomSupportHideSportItem : " + zIsRomWOS2, new Object[0]);
        return zIsRomWOS2;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportIntervalRun(@NonNull Device device) {
        boolean zIsRomWOS2 = isRomWOS2(device);
        Log.d(a, "isRomSupportIntervalRun : " + zIsRomWOS2, new Object[0]);
        return zIsRomWOS2;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportLapPace(@NonNull Device device) {
        boolean zIsRomSupport = DeviceUtil.isRomSupport(device, DeviceUtil.isOverseaEdition(device) ? new String[]{"2", "8", "1", "0"} : new String[]{"2", "6", "1", "10"});
        Log.d(a, "isRomSupportWatchFaceStore : " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportLoadBg(@NonNull Device device) {
        boolean zIsRomSupport = DeviceUtil.isRomSupport(device, DeviceUtil.isOverseaEdition(device) ? new String[]{"1", "3", "1"} : new String[]{"1", "2", "3"});
        Log.d(a, "isRomSupportLoadBg : " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportMiAI(@NonNull Device device) {
        return DeviceSource.isModelHuangheMainland(device);
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportMiotToken(@NonNull Device device) {
        boolean zIsRomSupport = DeviceUtil.isRomSupport(device, new String[]{"1", "2", "41"});
        Log.d(a, "isRomSupportMiotToken : " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportNewSportHealthChannel(@NonNull Device device) {
        return DeviceUtil.isRomSupport(device, DeviceUtil.isOverseaEdition(device) ? new String[]{"2", "8", "1", "0"} : new String[]{"2", "6", "2", "1"});
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportOutRidingCEL(@NonNull Device device) {
        boolean zIsRomSupport = DeviceUtil.isRomSupport(device, DeviceUtil.isOverseaEdition(device) ? new String[]{"1", "3", "1"} : new String[]{"1", "2", "8b"});
        Log.d(a, "isRomSupportOutRidingCEL : " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportShowQR(@NonNull Device device) {
        return false;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportStepGoalSet(@NonNull Device device) {
        return false;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportUnlock(@NonNull Device device) {
        boolean zIsRomSupport = DeviceUtil.isRomSupport(device, new String[]{"1", "1", "2"});
        Log.d(a, "isRomSupportUnlock : " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportWalkingStep(@NonNull Device device) {
        boolean zIsRomSupport = DeviceUtil.isRomSupport(device, DeviceUtil.isOverseaEdition(device) ? new String[]{"1", "3", "1"} : new String[]{"1", "2", "7"});
        Log.d(a, "isRomSupportWalkingStep : " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportWatchFaceStore(@NonNull Device device) {
        if (DeviceUtil.isOverseaEdition(device)) {
            return false;
        }
        boolean zIsRomSupport = DeviceUtil.isRomSupport(device, new String[]{"1", "2", "50h"});
        Log.d(a, "isRomSupportWatchFaceStore : " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportWorldCup(@NonNull Device device) {
        return DeviceUtil.isRomSupport(device, new String[]{"2", "6", "2", "0"});
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomWOS2(@NonNull Device device) {
        boolean zIsRomSupport = DeviceUtil.isRomSupport(device, new String[]{"2", "6", "0", "0"});
        Log.d(a, "isRomSupportWatchFaceStore : " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomWidgetSupportHidden(@NonNull Device device) {
        boolean zIsRomSupport = DeviceUtil.isRomSupport(device, new String[]{"1", "1", "6e"});
        Log.d(a, "IsRomWidgetSupportHidden : " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isSupportHiking(Device device) {
        return false;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isSupportNewLap(@NonNull Device device) {
        return false;
    }
}
