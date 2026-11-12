package com.xiaomi.ai.domain.mobileapp.common;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public enum Device {
    NONE("NONE"),
    PHONE("MIAI"),
    PAD("pad_miui_voiceassist"),
    XIAOAI_LITE("com.xiaomi.xiaoailite"),
    XIAOAI_LITE_IOS("com.xiaomi.xiaoailiteios"),
    M01("M01"),
    MIDR_RV_MIRROR_M5("midr.rv_mirror.m5"),
    WM_ASE("WM_ASE2.0"),
    WM_AUTO("com.wm.autocontrol"),
    MARS("xiaomi.watch.mars"),
    XMWT06("xmwt06"),
    XUNBRAIN("com.xxun.watch.xunbrain.x3"),
    EP30("EP30"),
    MOUSE1("mouse_1"),
    X08A("xiaomi.wifispeaker.x08a"),
    X08B("xiaomi.wifispeaker.x08b"),
    X08C("xiaomi.wifispeaker.x08c"),
    LX04("xiaomi.wifispeaker.lx04"),
    Bike("midr.e_bike.ev0008"),
    TVH1("xiaomi.tv.mitv5h1"),
    TVPROH1("xiaomi.tv.mitv5proh1"),
    TVMITV("mitv");

    public static final String automobileCategory = "Device/Automotive";
    private String appName;
    private String appNameOriginal = "";

    Device(String str) {
        this.appName = str;
    }

    public static Device fromAppName(String str) {
        for (Device device : values()) {
            if (device.appName.equals(str)) {
                device.setAppNameOriginal(str);
                return device;
            }
        }
        Device device2 = PHONE;
        device2.setAppNameOriginal(str);
        return device2;
    }

    public static String getDeviceType(Device device) {
        return (device.equals(EP30) || device.equals(M01) || device.equals(WM_ASE) || device.equals(MIDR_RV_MIRROR_M5) || device.equals(MARS) || device.equals(XMWT06) || device.equals(XUNBRAIN) || device.equals(MOUSE1) || device.equals(LX04) || device.equals(X08A) || device.equals(X08B) || device.equals(X08C) || device.equals(Bike) || device.equals(WM_AUTO) || device.equals(XIAOAI_LITE_IOS) || device.equals(TVH1) || device.equals(TVMITV) || device.equals(TVPROH1)) ? device.getAppNameOriginal() : "universal";
    }

    public static String getDeviceTypeBase(Device device) {
        return (device.equals(EP30) || device.equals(M01) || device.equals(WM_ASE) || device.equals(MIDR_RV_MIRROR_M5) || device.equals(MOUSE1) || device.equals(Bike) || device.equals(WM_AUTO) || device.equals(XIAOAI_LITE_IOS) || device.equals(TVH1) || device.equals(TVMITV) || device.equals(TVPROH1)) ? device.getAppNameOriginal() : "universal";
    }

    public static String getDeviceTypeUpdate(Device device) {
        return (device.equals(EP30) || device.equals(M01) || device.equals(WM_ASE) || device.equals(MIDR_RV_MIRROR_M5) || device.equals(MARS) || device.equals(XMWT06) || device.equals(XUNBRAIN) || device.equals(MOUSE1) || device.equals(LX04) || device.equals(X08A) || device.equals(X08B) || device.equals(X08C) || device.equals(Bike) || device.equals(WM_AUTO) || device.equals(XIAOAI_LITE_IOS) || device.equals(TVH1) || device.equals(TVMITV) || device.equals(TVPROH1)) ? device.getAppNameOriginal() : "universal";
    }

    @Deprecated
    public static boolean isCheZaiDevice(Device device) {
        if (device == null) {
            return false;
        }
        return device == M01 || device == MIDR_RV_MIRROR_M5 || device == WM_ASE || device == EP30 || device == WM_AUTO;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    public static boolean isMiPhoneOrPad(Device device) {
        boolean z;
        if (device == null) {
            return false;
        }
        String str = device.appNameOriginal;
        if (str != null) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.isEmpty() || lowerCase.contains("miai") || lowerCase.contains("miui_voiceassist") || lowerCase.contains("voice assistant") || lowerCase.contains("pad_miui_voiceassist")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return (device == PHONE || device == PAD) && z;
    }

    public static boolean isOtherPhoneDevice(Device device) {
        if (device == null) {
            return false;
        }
        String str = device.appNameOriginal;
        return device == PHONE && (str != null && str.toLowerCase().contains("qin2"));
    }

    public static boolean isTV(Device device) {
        if (device == null) {
            return false;
        }
        return device.equals(TVH1) || device.equals(TVPROH1) || device.equals(TVMITV);
    }

    public static List<Device> parseAppNameList(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(";")) {
            for (Device device : values()) {
                if (device.appName.equals(str2)) {
                    arrayList.add(device);
                }
            }
        }
        return arrayList;
    }

    public static Device parseAppNameWithNone(String str) {
        for (Device device : values()) {
            if (device.appName.equals(str)) {
                device.setAppNameOriginal(str);
                return device;
            }
        }
        Device device2 = NONE;
        device2.setAppNameOriginal(str);
        return device2;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getAppNameOriginal() {
        return this.appNameOriginal;
    }

    public void setAppNameOriginal(String str) {
        this.appNameOriginal = str;
    }

    public static boolean isCheZaiDevice(String str) {
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase(automobileCategory);
    }
}
