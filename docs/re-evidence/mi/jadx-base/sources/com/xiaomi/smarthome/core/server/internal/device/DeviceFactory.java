package com.xiaomi.smarthome.core.server.internal.device;

import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceConfigManagerExtKt;
import com.xiaomi.smarthome.core.entity.device.MiTVDevice;
import com.xiaomi.smarthome.core.entity.device.MiioDevice;
import com.xiaomi.smarthome.core.entity.device.RouterDevice;
import com.xiaomi.smarthome.core.entity.device.WatchBandDevice;
import com.xiaomi.smarthome.core.server.ReflectUtils;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceFactory {
    public static final Set<String> HOME_NEAR_BY_GENERAL_AP_DEVICE_SET;
    public static final Set<String> HOME_NEAR_BY_HUAMI_DELETABLE_DEVICE_SET;
    public static final int PID_MIIO = 0;
    public static final int RESET_FLAG_SET = 1;
    public static final int RESET_FLAG_UNSET = 0;
    public static final String SHT_AER_MASK = "aer.mask.smartbug";
    public static final String SHT_FENGMI_PROJECTOR_FM05 = "fengmi.projector.fm05";
    public static final String SHT_FENGMI_PROJECTOR_FM15 = "fengmi.projector.fm15";
    public static final String SHT_FENGMI_PROJECTOR_FM154K = "fengmi.projector.fm154k";
    public static final String SHT_HAIII_PETTAG_V1 = "haiii.pettag.v1";
    public static final String SHT_INOVEL_PROJECTOR_ME2 = "inovel.projector.me2";
    public static final String SHT_MIDEA_AIRCONDITION = "midea.aircondition.v1";
    public static final String SHT_MIWIFI_V1 = "chuangmi.wifi.v1";
    public static final String SHT_NINEBOT_BALSCOOTER_V1 = "ninebot.balscooter.v1";
    public static final String SHT_NINEBOT_SCOOTER_V1 = "ninebot.scooter.v1";
    public static final String SHT_NINEBOT_SCOOTER_V2 = "ninebot.scooter.v2";
    public static final String SHT_ROIDMI_BTFM_M1 = "roidmi.btfm.m1";
    public static final String SHT_ROIDMI_BTFM_V1 = "roidmi.btfm.v1";
    public static final String SHT_RUNMI_SUITCASE_V1 = "runmi.suitcase.v1";
    public static final String SHT_SOUNDBOX_V1 = "onemore.soundbox.sm001";
    public static final String SHT_XIAOMI_BLE_V1 = "xiaomi.ble.v1";
    public static final String SHT_XIAOMI_MITVBOX_B1 = "xiaomi.tvbox.b1";
    public static final String SHT_XIAOMI_MITVBOX_I1 = "xiaomi.tvbox.i1";
    public static final String SHT_XIAOMI_MITVBOX_V1 = "xiaomi.tvbox.v1";
    public static final String SHT_XIAOMI_MITV_B1 = "xiaomi.tv.b1";
    public static final String SHT_XIAOMI_MITV_H1 = "xiaomi.tv.h1";
    public static final String SHT_XIAOMI_MITV_I1 = "xiaomi.tv.i1";
    public static final String SHT_XIAOMI_MITV_V1 = "xiaomi.tv.v1";
    public static final String SHT_XIAOMI_SPLIT_TV_B1 = "xiaomi.split_tv.b1";
    public static final String SHT_XIAOMI_SPLIT_TV_V1 = "xiaomi.split_tv.v1";
    public static final String[] SHT_XIAOMI_WATCH_BAND;
    public static final String SHT_YEELINK_LIGHT_BLE1 = "yeelink.light.ble1";
    public static final String SHT_ZIMI_POWER_V1 = "zimi.powerbank.v1";
    public static final String SHT_ZIMI_PROJECTOR_V1 = "zimi.projector.v1";
    private static final String TAG = "DeviceFactory";
    public static final Map<String, Class<?>> sModelClass;

    static {
        String[] strArr = {"xiaomi.watch.band1", "xiaomi.watch.band1S", "xiaomi.watch.band1A", "xiaomi.watch.band2", EcoDeviceConfigManagerExtKt.MODEL_SCALE_MIBFS, EcoDeviceConfigManagerExtKt.MODEL_SCALE_MISCALE2, "trios.bleshoes.v1", "hmpace.bracelet.v4", "hmpace.bracelet.v3nfc"};
        SHT_XIAOMI_WATCH_BAND = strArr;
        HashMap map = new HashMap();
        sModelClass = map;
        HOME_NEAR_BY_GENERAL_AP_DEVICE_SET = new HashSet();
        HOME_NEAR_BY_HUAMI_DELETABLE_DEVICE_SET = new HashSet();
        map.put(SHT_XIAOMI_MITV_V1, MiTVDevice.class);
        map.put(SHT_XIAOMI_MITV_B1, MiTVDevice.class);
        map.put(SHT_XIAOMI_MITV_I1, MiTVDevice.class);
        map.put(SHT_XIAOMI_MITV_H1, MiTVDevice.class);
        map.put(SHT_XIAOMI_MITVBOX_V1, MiTVDevice.class);
        map.put(SHT_XIAOMI_MITVBOX_B1, MiTVDevice.class);
        map.put(SHT_XIAOMI_MITVBOX_I1, MiTVDevice.class);
        map.put(SHT_XIAOMI_SPLIT_TV_B1, MiTVDevice.class);
        map.put(SHT_XIAOMI_SPLIT_TV_V1, MiTVDevice.class);
        map.put(SHT_FENGMI_PROJECTOR_FM15, MiTVDevice.class);
        map.put(SHT_INOVEL_PROJECTOR_ME2, MiTVDevice.class);
        map.put(SHT_ZIMI_PROJECTOR_V1, MiTVDevice.class);
        map.put(SHT_FENGMI_PROJECTOR_FM154K, MiTVDevice.class);
        map.put(SHT_FENGMI_PROJECTOR_FM05, MiTVDevice.class);
        for (String str : strArr) {
            sModelClass.put(str, WatchBandDevice.class);
        }
        Set<String> set = HOME_NEAR_BY_GENERAL_AP_DEVICE_SET;
        set.add("midr.cardvr.v1");
        set.add("midr.cardvr.m1");
        set.add("midr.cardvr.v2");
        set.add("midr.cardvr.mv2n");
        set.add("midr.cardvr.mv2");
        set.add("fimi.camera.c1");
        set.add("fimi.camera.c1b");
        set.add("onemore.soundbox.sm001");
        Set<String> set2 = HOME_NEAR_BY_HUAMI_DELETABLE_DEVICE_SET;
        set2.add("xiaomi.watch.band1");
        set2.add("xiaomi.watch.band2");
        set2.add("xiaomi.watch.band1S");
        set2.add("xiaomi.watch.band1A");
        set2.add(EcoDeviceConfigManagerExtKt.MODEL_SCALE_MIBFS);
        set2.add(EcoDeviceConfigManagerExtKt.MODEL_SCALE_MISCALE2);
        set2.add("hmpace.bracelet.v4");
        set2.add("hmpace.bracelet.v3nfc");
        set2.add("trios.bleshoes.v1");
    }

    public static Device createDevice(JSONObject jSONObject) {
        Device deviceCreateDeviceByModel = createDeviceByModel(jSONObject.optString("model"));
        deviceCreateDeviceByModel.parseFromJSONObject(jSONObject);
        return deviceCreateDeviceByModel;
    }

    public static Device createDeviceByModel(String str) {
        Device device;
        Class<?> modelClass = getModelClass(str);
        if (modelClass != null) {
            try {
                device = (Device) ReflectUtils.getInstance(modelClass, new Object[0]);
            } catch (Exception unused) {
                device = null;
            }
        } else {
            device = null;
        }
        return device == null ? new MiioDevice() : device;
    }

    public static String getDeviceType2(String str) {
        int iIndexOf = str.indexOf("_miio");
        if (iIndexOf > 1) {
            return str.substring(0, iIndexOf).replace('-', '.');
        }
        int iIndexOf2 = str.indexOf("_miap");
        if (iIndexOf2 > 1) {
            return str.substring(0, iIndexOf2).replace('-', '.');
        }
        int iIndexOf3 = str.indexOf("_mibt");
        if (iIndexOf3 > 1) {
            return str.substring(0, iIndexOf3).replace('-', '.');
        }
        return (str.contains("midea_AC") || str.contains("midea_ac")) ? "midea.aircondition.v1" : str;
    }

    public static String getDeviceUid(String str) {
        int iIndexOf = str.indexOf("_miio");
        if (iIndexOf > 0) {
            return str.substring(iIndexOf + 5);
        }
        int iIndexOf2 = str.indexOf("_miap");
        if (iIndexOf2 > 0) {
            return str.substring(iIndexOf2 + 5);
        }
        int iIndexOf3 = str.indexOf("_mibt");
        if (iIndexOf3 > 0) {
            return str.substring(iIndexOf3 + 5);
        }
        int iIndexOf4 = str.indexOf("midea_ac_");
        return iIndexOf4 >= 0 ? str.substring(iIndexOf4 + 9) : str;
    }

    public static String getMD5(String str) {
        if (str == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            return toHexString(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    private static Class<?> getModelClass(String str) {
        Class<?> cls = sModelClass.get(str);
        return (cls == null && str.startsWith("xiaomi.router")) ? RouterDevice.class : cls;
    }

    private static String toHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            while (hexString.length() < 2) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static Device createDevice(String str, String str2) {
        String deviceType2 = getDeviceType2(str);
        Device deviceCreateDeviceByModel = createDeviceByModel(deviceType2);
        deviceCreateDeviceByModel.setDid(getDeviceUid(str));
        int iIndexOf = str.indexOf("_miio");
        if (iIndexOf > 0) {
            deviceCreateDeviceByModel.setModel(str.substring(0, iIndexOf).replace('-', '.'));
        } else {
            deviceCreateDeviceByModel.setModel(deviceType2);
        }
        deviceCreateDeviceByModel.setPid(0);
        deviceCreateDeviceByModel.toggleOnline(true);
        deviceCreateDeviceByModel.setUnbind();
        deviceCreateDeviceByModel.setResetFlag(1);
        deviceCreateDeviceByModel.setLocalIP(str2);
        deviceCreateDeviceByModel.setLocation(Device.Location.LOCAL);
        return deviceCreateDeviceByModel;
    }
}
