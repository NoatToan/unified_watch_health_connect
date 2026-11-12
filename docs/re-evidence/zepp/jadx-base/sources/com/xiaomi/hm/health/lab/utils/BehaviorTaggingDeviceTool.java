package com.xiaomi.hm.health.lab.utils;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.lab.init.LabCallbackInit;

/* JADX INFO: loaded from: classes21.dex */
public class BehaviorTaggingDeviceTool {
    private static final String a = "CN";

    public static boolean isBehaviorSupportHeadsetSleep() {
        return LabCallbackInit.getInitCallBack().supportHeadsetSleep();
    }

    public static boolean isBehaviorTaggingShowNmeaItem() {
        return LabCallbackInit.getInitCallBack().supportNmeaTagging(HMDeviceType.MILI);
    }

    public static boolean isBehaviorTaggingShowSwimmingItem() {
        return LabCallbackInit.getInitCallBack().supportSwimTagging(HMDeviceType.MILI);
    }

    public static boolean isBehaviorTaggingShowTemperatureItem() {
        return LabCallbackInit.getInitCallBack().supportTemperatureTagging();
    }
}
