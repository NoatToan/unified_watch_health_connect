package com.miot.rn.plugin.utils;

import androidx.annotation.Keep;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.device.api.DeviceStat;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class DeviceStatUtil {
    public static final int AUTH_FLAG_SET = 1;
    public static final int AUTH_FLAG_UNSET = 0;
    public static final int BIND_FLAG_SET = 1;
    public static final int BIND_FLAG_UNSET = 0;

    public static DeviceStat newDeviceStat(Device device) {
        if (device == null) {
            return null;
        }
        DeviceStat deviceStat = new DeviceStat();
        deviceStat.did = device.did;
        deviceStat.name = device.name;
        deviceStat.mac = device.mac;
        deviceStat.model = device.model;
        deviceStat.ip = device.ip;
        String str = device.parentId;
        if (str == null) {
            str = "";
        }
        deviceStat.parentId = str;
        String str2 = device.parentModel;
        deviceStat.parentModel = str2 != null ? str2 : "";
        deviceStat.authFlag = device.isShared() ? 1 : 0;
        deviceStat.bindFlag = (device.isOwner() || device.isFamily()) ? 1 : 0;
        deviceStat.token = device.token;
        Device.Location location = device.location;
        if (location != null) {
            deviceStat.location = location.ordinal();
        }
        deviceStat.latitude = device.latitude;
        deviceStat.longitude = device.longitude;
        deviceStat.bssid = device.bssid;
        deviceStat.lastModified = device.lastModified;
        deviceStat.pid = device.pid;
        deviceStat.rssi = device.rssi;
        deviceStat.isOnline = device.isOnline;
        deviceStat.resetFlag = device.resetFlag;
        deviceStat.ssid = device.ssid;
        deviceStat.ownerName = device.ownerName;
        deviceStat.ownerId = device.ownerId;
        deviceStat.propInfo = device.propInfo;
        deviceStat.version = device.getFwVersion();
        deviceStat.property.clear();
        deviceStat.property.putAll(device.property);
        deviceStat.extrainfo = device.getExtraInfo();
        deviceStat.showMode = device.showMode;
        deviceStat.hideMode = device.hideMode;
        deviceStat.event = device.event;
        deviceStat.permitLevel = device.permitLevel;
        deviceStat.isSetPinCode = device.getIsSetPinCode();
        deviceStat.pinCodeType = device.getPinCodeType();
        deviceStat.orderTimeJString = device.orderTimeJString;
        deviceStat.specUrn = device.specUrn;
        deviceStat.isNew = device.isNew;
        return deviceStat;
    }
}
