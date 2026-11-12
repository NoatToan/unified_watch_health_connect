package com.huawei.datatype;

import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import defpackage.lst;

/* JADX INFO: loaded from: classes4.dex */
public class DataDeviceInfo {
    private String btVersion;
    private String deviceEmmcId;
    private String deviceImei;
    private String deviceMac;
    private String deviceModel;
    private String deviceOpenSourceVersion;
    private String deviceOtaPackageName;
    private String devicePhoneNumber;
    private String deviceSn;
    private String deviceSoftVersion;
    private int deviceType;
    private String deviceVersion;

    public String getBtVersion() {
        return (String) lst.d(this.btVersion);
    }

    public void setBtVersion(String str) {
        this.btVersion = (String) lst.d(str);
    }

    public int getDeviceType() {
        return ((Integer) lst.d(Integer.valueOf(this.deviceType))).intValue();
    }

    public void setDeviceType(int i) {
        this.deviceType = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String getDeviceVersion() {
        return (String) lst.d(this.deviceVersion);
    }

    public void setDeviceVersion(String str) {
        this.deviceVersion = (String) lst.d(str);
    }

    public String getDeviceSoftVersion() {
        return (String) lst.d(this.deviceSoftVersion);
    }

    public void setDeviceSoftVersion(String str) {
        this.deviceSoftVersion = (String) lst.d(str);
    }

    public String getDeviceImei() {
        return (String) lst.d(this.deviceImei);
    }

    public void setDeviceImei(String str) {
        this.deviceImei = (String) lst.d(str);
    }

    public String getDevicePhoneNumber() {
        return (String) lst.d(this.devicePhoneNumber);
    }

    public void setDevicePhoneNumber(String str) {
        this.devicePhoneNumber = (String) lst.d(str);
    }

    public String getDeviceBtMac() {
        return (String) lst.d(this.deviceMac);
    }

    public void setDeviceBtMac(String str) {
        this.deviceMac = (String) lst.d(str);
    }

    public String getDeviceOpenSourceVersion() {
        return this.deviceOpenSourceVersion;
    }

    public void setDeviceOpenSourceVersion(String str) {
        this.deviceOpenSourceVersion = (String) lst.d(str);
    }

    public String getDeviceSn() {
        return (String) lst.d(this.deviceSn);
    }

    public void setDeviceSn(String str) {
        this.deviceSn = (String) lst.d(str);
    }

    public String getDeviceModel() {
        return (String) lst.d(this.deviceModel);
    }

    public void setDeviceModel(String str) {
        this.deviceModel = (String) lst.d(str);
    }

    public String getDeviceEmmcId() {
        return (String) lst.d(this.deviceEmmcId);
    }

    public void setDeviceEmmcId(String str) {
        this.deviceEmmcId = (String) lst.d(str);
    }

    public String getDeviceOtaPackageName() {
        return this.deviceOtaPackageName;
    }

    public void setDeviceOtaPackageName(String str) {
        this.deviceOtaPackageName = str;
    }

    public String toString() {
        return "DataDeviceInfo [btVersion=" + this.btVersion + ", deviceType=" + this.deviceType + ", deviceVersion=" + this.deviceVersion + ", deviceSoftVersion=" + this.deviceSoftVersion + ", deviceImei=" + BTDeviceMgrUtil.c().e(this.deviceImei) + ", devicePhoneNumber=" + this.devicePhoneNumber + ", deviceBtMac=" + BTDeviceMgrUtil.c().e(this.deviceMac) + ", deviceOpenSourceVersion=" + this.deviceOpenSourceVersion + ", deviceModel=" + this.deviceModel + ", deviceEmmcId=" + this.deviceEmmcId + ", deviceOtaPackageName=" + this.deviceOtaPackageName + "]";
    }
}
