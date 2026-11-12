package com.xiaomi.smarthome.core.server.internal.bluetooth.model;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceType {
    public static final int BEACON_ONLY = 1;
    public static final int MIOT_BIND = 2;
    public static final int NOT_MIOT = 0;
    public static final String SHT_AER_MASK = "aer.mask.smartbug";
    public static final String SHT_HAIII_PETTAG_V1 = "haiii.pettag.v1";
    public static final String SHT_NINEBOT_BALSCOOTER_V1 = "ninebot.balscooter.v1";
    public static final String SHT_ROIDMI_BTFM_M1 = "roidmi.btfm.m1";
    public static final String SHT_ROIDMI_BTFM_V1 = "roidmi.btfm.v1";
    public static final String SHT_SOUNDBOX_V1 = "onemore.soundbox.sm001";
    public static final String SHT_XIAOMI_BLE_V1 = "xiaomi.ble.v1";
    public static final String SHT_YEELINK_LIGHT_BLE1 = "yeelink.light.ble1";
    public static final String SHT_ZIMI_POWER_V1 = "zimi.powerbank.v1";
    private static final String[] NOT_MIOT_MODELS = {"yeelink.light.ble1", "roidmi.btfm.v1", "roidmi.btfm.m1", "ninebot.balscooter.v1", "xiaomi.ble.v1", "onemore.soundbox.sm001"};
    private static final String[] BEACON_ONLY_MODELS = {"zimi.powerbank.v1", "haiii.pettag.v1", "aer.mask.smartbug"};

    public static int getDeviceType(String str) {
        if (Arrays.asList(NOT_MIOT_MODELS).contains(str)) {
            return 0;
        }
        return Arrays.asList(BEACON_ONLY_MODELS).contains(str) ? 1 : 2;
    }

    public static boolean isLocalBoundDevice(String str) {
        int deviceType = getDeviceType(str);
        return deviceType == 0 || deviceType == 1;
    }

    public static boolean isMiotDevice(String str) {
        return !TextUtils.isEmpty(str) && getDeviceType(str) == 2;
    }
}
