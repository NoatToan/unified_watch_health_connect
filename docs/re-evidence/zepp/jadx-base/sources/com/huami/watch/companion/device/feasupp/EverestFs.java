package com.huami.watch.companion.device.feasupp;

import androidx.annotation.NonNull;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.util.Log;
import com.tencent.connect.common.Constants;

/* JADX INFO: loaded from: classes16.dex */
public class EverestFs implements IFeatureSupp {
    private static final String a = "EverestFs";

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportAutoUpdate(@NonNull Device device) {
        return true;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportFTP(@NonNull Device device) {
        boolean zIsRomSupport = DeviceUtil.isRomSupport(device, DeviceUtil.isOverseaEdition(device) ? new String[]{"2", "3", "2", "0"} : new String[]{"2", "0", "0", "14"});
        Log.d(a, "isRomSupportFTP : " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportHRR(@NonNull Device device) {
        boolean zIsRomSupport = DeviceUtil.isRomSupport(device, DeviceUtil.isOverseaEdition(device) ? new String[]{"2", "3", "4", "0"} : new String[]{"2", "0", Constants.VIA_REPORT_TYPE_START_GROUP, "2"});
        Log.d(a, "isRomSupportHRR : " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportHideSportItem(@NonNull Device device) {
        boolean zIsRomSupport = DeviceUtil.isRomSupport(device, DeviceUtil.isOverseaEdition(device) ? new String[]{"2", "3", "2", "0"} : new String[]{"2", "0", "6", "0"});
        Log.d(a, "isRomSupportHideSportItem : " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportIntervalRun(@NonNull Device device) {
        boolean zIsRomSupport = DeviceUtil.isRomSupport(device, DeviceUtil.isOverseaEdition(device) ? new String[]{"2", "3", "2", "0"} : new String[]{"2", "0", "7", "0"});
        Log.d(a, "isRomSupportIntervalRun : " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportLapPace(@NonNull Device device) {
        if (DeviceUtil.isOverseaEdition(device)) {
            return DeviceUtil.isRomSupport(device, new String[]{"2", "3", "5", "0"});
        }
        return true;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportLoadBg(@NonNull Device device) {
        return true;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportMiAI(@NonNull Device device) {
        return false;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportMiotToken(@NonNull Device device) {
        return false;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportNewSportHealthChannel(@NonNull Device device) {
        return DeviceUtil.isRomSupport(device, DeviceUtil.isOverseaEdition(device) ? new String[]{"2", "3", "5", "0"} : new String[]{"2", "0", Constants.VIA_REPORT_TYPE_CHAT_VIDEO, "0"});
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportOutRidingCEL(@NonNull Device device) {
        return true;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportShowQR(@NonNull Device device) {
        boolean zIsRomSupport = DeviceUtil.isRomSupport(device, new String[]{"2", "0", "4", "0"});
        Log.d(a, "isRomSupportShowQR : " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportStepGoalSet(@NonNull Device device) {
        if (DeviceUtil.isOverseaEdition(device)) {
            return false;
        }
        return DeviceUtil.isRomSupport(device, new String[]{"2", "0", "29", "0"});
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportUnlock(@NonNull Device device) {
        return true;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportWalkingStep(@NonNull Device device) {
        return true;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportWatchFaceStore(@NonNull Device device) {
        return !DeviceUtil.isOverseaEdition(device);
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomSupportWorldCup(@NonNull Device device) {
        return DeviceUtil.isRomSupport(device, new String[]{"2", "0", Constants.VIA_REPORT_TYPE_CHAT_AIO, "0"});
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomWOS2(@NonNull Device device) {
        return true;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isRomWidgetSupportHidden(@NonNull Device device) {
        return true;
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isSupportHiking(Device device) {
        return DeviceUtil.isRomSupport(device, DeviceUtil.isOverseaEdition(device) ? new String[]{"2", "3", "11", "0"} : new String[]{"2", "0", "63", "0"});
    }

    @Override // com.huami.watch.companion.device.feasupp.IFeatureSupp
    public boolean isSupportNewLap(@NonNull Device device) {
        return DeviceUtil.isRomSupport(device, DeviceUtil.isOverseaEdition(device) ? new String[]{"2", "3", "11", "0"} : new String[]{"2", "0", "57", "0"});
    }
}
