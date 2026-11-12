package com.xiaomi.smarthome.framework.plugin.rn.nativemodule.device;

import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.mibi.sdk.common.CommonConstants;
import com.miui.circulate.device.api.DeviceInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.framework.plugin.rn.RnModuleProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import com.xiaomi.smarthome.library.crypto.MD5Util;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceInfoHelper {
    private static int PERMISSION_NONE_MASK = 30;
    private static int PERMISSION_OWNER = 16;

    private static String NVL(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        String string = obj.toString();
        return string == null ? "" : string;
    }

    private static void convertDeviceStat2Map(WritableMap writableMap, DeviceStat deviceStat) {
        double d;
        if (deviceStat == null || writableMap == null) {
            return;
        }
        writableMap.putString("model", NVL(deviceStat.model));
        writableMap.putString("did", NVL(deviceStat.did));
        writableMap.putString("mac", NVL(deviceStat.mac));
        writableMap.putString("name", NVL(deviceStat.name));
        writableMap.putInt("permitLevel", deviceStat.permitLevel);
        writableMap.putString("extrainfo", NVL(deviceStat.extrainfo));
        writableMap.putString("ownerName", NVL(deviceStat.ownerName));
        if (TextUtils.isEmpty(deviceStat.ownerId) && isOwner(deviceStat.permitLevel)) {
            writableMap.putString("ownerId", NVL(((IRnPluginHostApiProvider) RnModuleProvider.as(IRnPluginHostApiProvider.class)).getAccountId()));
        } else {
            writableMap.putString("ownerId", NVL(deviceStat.ownerId));
        }
        writableMap.putString(DeviceTagInterface.ROUTER_BSSID, NVL(deviceStat.bssid));
        writableMap.putString("deviceIconReal", NVL(deviceStat.deviceIconReal));
        writableMap.putString("iconURL", NVL(deviceStat.deviceIconReal));
        writableMap.putString("event", NVL(deviceStat.event));
        writableMap.putString(DeviceInfo.Builder.PrivateDataKey.IP, NVL(deviceStat.ip));
        writableMap.putBoolean("isOnline", deviceStat.isOnline);
        writableMap.putInt("isSetPinCode", deviceStat.isSetPinCode);
        writableMap.putString("parentId", NVL(deviceStat.parentId));
        writableMap.putString("parentModel", NVL(deviceStat.parentModel));
        writableMap.putString("lastModified", NVL(String.valueOf(deviceStat.lastModified)));
        writableMap.putString(CommonConstants.KEY_SESSION, NVL(MD5Util.getMd5Digest(NVL(deviceStat.token) + "4E60D36E")).toUpperCase());
        writableMap.putInt("location", deviceStat.location);
        writableMap.putString("latitude", Double.toString(deviceStat.latitude));
        writableMap.putString("longitude", Double.toString(deviceStat.longitude));
        writableMap.putString("pid", NVL(String.valueOf(deviceStat.pid)));
        writableMap.putString("rssi", NVL(String.valueOf(deviceStat.rssi)));
        writableMap.putInt("resetFlag", deviceStat.resetFlag);
        writableMap.putString("ssid", NVL(deviceStat.ssid));
        writableMap.putString("version", NVL(deviceStat.version));
        writableMap.putInt("showMode", deviceStat.showMode);
        writableMap.putString("propInfo", NVL(deviceStat.propInfo));
        writableMap.putBoolean("isGrouped", deviceStat.isGrouped);
        if (TextUtils.isEmpty(deviceStat.orderTimeJString)) {
            d = 0.0d;
        } else {
            try {
                d = Double.parseDouble(deviceStat.orderTimeJString);
            } catch (Exception e) {
                RnPluginLog.e(Log.getStackTraceString(e));
                d = 0.0d;
            }
        }
        writableMap.putDouble("orderTime", d);
        writableMap.putBoolean("isNew", deviceStat.isNew);
        writableMap.putString(TSMAuthContants.PARAM_PARTNER_ID, deviceStat.partnerId);
        writableMap.putString("meshId", deviceStat.meshId);
    }

    public static void device2Map(WritableMap writableMap, DeviceStat deviceStat) {
        convertDeviceStat2Map(writableMap, deviceStat);
        if (deviceStat == null || TextUtils.isEmpty(deviceStat.parentId)) {
            return;
        }
        writableMap.putMap("parentDevice", parentDvice2Map(deviceStat.parentId));
    }

    public static boolean isOwner(int i) {
        return ((i & PERMISSION_NONE_MASK) & PERMISSION_OWNER) != 0;
    }

    private static WritableMap parentDvice2Map(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (TextUtils.isEmpty(str)) {
            return writableMapCreateMap;
        }
        convertDeviceStat2Map(writableMapCreateMap, ((IRnPluginHostApiProvider) RnModuleProvider.as(IRnPluginHostApiProvider.class)).getDeviceByDid(str));
        return writableMapCreateMap;
    }
}
