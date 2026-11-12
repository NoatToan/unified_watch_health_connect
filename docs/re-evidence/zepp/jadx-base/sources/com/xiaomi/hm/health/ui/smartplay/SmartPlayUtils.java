package com.xiaomi.hm.health.ui.smartplay;

import android.content.Context;
import com.huami.device.feature.unlock.MiuiUnlockAPI;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.HMSilentConfig;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.Calendar;

/* JADX INFO: loaded from: classes22.dex */
public class SmartPlayUtils {
    private static final String a = "SmartPlayUtils";

    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    public static boolean isAviodDisturbTipShow() {
        boolean z;
        HMSilentConfig hMSilentConfigFromSilentConfig = HMDeviceUtils.fromSilentConfig(HMPersonInfo.getInstance().getMiliConfig().getQuietMode());
        boolean z2 = hMSilentConfigFromSilentConfig.isEnable() && !hMSilentConfigFromSilentConfig.isSmart();
        int startIndex = hMSilentConfigFromSilentConfig.getStartIndex();
        int stopIndex = hMSilentConfigFromSilentConfig.getStopIndex();
        Calendar calendar = Calendar.getInstance();
        int i = (calendar.get(11) * 60) + calendar.get(12);
        if (startIndex < stopIndex) {
            if (i > stopIndex || i < startIndex) {
                z = false;
            } else {
                z = true;
            }
            z2 &= z;
        } else if (startIndex > stopIndex) {
            if (i <= stopIndex || i >= startIndex) {
                z = true;
            } else {
                z = false;
            }
            z2 &= z;
        }
        return HMDeviceConfig.hasFeatureDNDDevice() && z2;
    }

    public static boolean isEnableScreenUnlockOnDevice(Context context) {
        return MiuiUnlockAPI.hasSetUnlockByDevice(context, HMDeviceManager.getInstance().getBoundDeviceAddress(HMDeviceType.MILI));
    }

    public static boolean isScreenUnlockOpened() {
        return 1 == HMPersonInfo.getInstance().getMiliConfig().getScreenLock();
    }
}
