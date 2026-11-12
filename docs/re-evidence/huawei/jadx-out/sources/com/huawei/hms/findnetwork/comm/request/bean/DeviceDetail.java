package com.huawei.hms.findnetwork.comm.request.bean;

import com.huawei.hms.findnetwork.comm.util.MaskUtil;

/* JADX INFO: loaded from: classes33.dex */
public class DeviceDetail {
    public static final String CAP_KEY_BLE_MEASURE_DISTANCE = "Ble_Measure_Distance";
    public static final String CAP_KEY_LOST_NEAR_LINK_NAVIGATION = "Near_Link_Navigation";
    public static final String CAP_KEY_LOST_REMINDER_FAST = "Fast_Lost_Reminder";
    public static final String CAP_KEY_LOST_REMINDER_NORMAL = "Normal_Lost_Reminder";
    public static final String CAP_KEY_RING = "Ring";
    public static final String CAP_KEY_ULTRA_SOUND = "Ultrasound";
    public static final int INVALID_BATTERY_LEVEL = -1;
    private String accessoryCapabilities;
    private int batteryLevel;
    private int batteryType;
    private int componentType;
    private String deviceSn;
    private String deviceType;
    private String extendData;
    private String firmwareVersion;
    private String productId;
    private int sequence;
    private String sn;
    private String subProductId;

    public DeviceDetail() {
    }

    public DeviceDetail(String str, String str2, String str3, String str4) {
        this.sn = str;
        this.deviceType = str2;
        this.accessoryCapabilities = str3;
        this.firmwareVersion = str4;
    }

    public DeviceDetail(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        this.sn = str;
        this.deviceType = str2;
        this.productId = str3;
        this.subProductId = str4;
        this.accessoryCapabilities = str5;
        this.firmwareVersion = str6;
        this.batteryType = i;
        this.batteryLevel = i2;
        this.componentType = 0;
        this.deviceSn = null;
        this.sequence = 0;
    }

    public String toString() {
        return "DeviceDetail{sn='" + MaskUtil.maskSn(this.sn) + "', productId='" + this.productId + "', accessoryCapabilities='" + this.accessoryCapabilities + "', firmwareVersion='" + this.firmwareVersion + "', batteryLevel=" + this.batteryLevel + ", componentType=" + this.componentType + ", deviceSn='" + MaskUtil.maskSn(this.deviceSn) + "', sequence=" + this.sequence + ", deviceType=" + this.deviceType + '}';
    }

    public void setSubProductId(String str) {
        this.subProductId = str;
    }

    public void setSn(String str) {
        this.sn = str;
    }

    public void setSequence(int i) {
        this.sequence = i;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setFirmwareVersion(String str) {
        this.firmwareVersion = str;
    }

    public void setExtendData(String str) {
        this.extendData = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setDeviceSn(String str) {
        this.deviceSn = str;
    }

    public void setComponentType(int i) {
        this.componentType = i;
    }

    public void setBatteryType(int i) {
        this.batteryType = i;
    }

    public void setBatteryLevel(int i) {
        this.batteryLevel = i;
    }

    public void setAccessoryCapabilities(String str) {
        this.accessoryCapabilities = str;
    }

    public String getSubProductId() {
        return this.subProductId;
    }

    public String getSn() {
        return this.sn;
    }

    public int getSequence() {
        return this.sequence;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public String getExtendData() {
        return this.extendData;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public String getDeviceSn() {
        return this.deviceSn;
    }

    public int getComponentType() {
        return this.componentType;
    }

    public int getBatteryType() {
        return this.batteryType;
    }

    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    public String getAccessoryCapabilities() {
        return this.accessoryCapabilities;
    }
}
