package com.xiaomi.hm.health.bt.sdk;

import com.xiaomi.hm.health.bt.profile.base.SystemImageStatus;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class DeviceInfoExt implements Serializable {
    private static final long serialVersionUID = 1;
    private int baseResourceFlag;
    private int baseResourceVersion;
    private int firmwareFlag;
    private int fontFlag;
    private int fontVersion;
    private String gpsVersion;
    private boolean hasBaseResource;
    private boolean hasExtResource;
    private boolean hasOtherVersion;
    private int resourceFlag;
    private int resourceVersion;
    private SystemImageStatus systemImageStatus;
    private String macAddress = null;
    private String authKey = null;
    private String sn = null;
    private String deviceId = null;
    private String hardwareVersion = null;
    private int pnpId = -1;
    private int pnpVersion = -1;
    private int deviceType = -1;
    private int deviceSource = -1;
    private String systemModel = null;
    private String systemVersion = null;
    private String softwareVersion = null;
    private String firmwareVersion = null;
    private int vendorId = -1;
    private int vendorSource = -1;
    private int extResourceVersion = -1;
    private int extResourceFlag = -1;

    public String getAuthKey() {
        return this.authKey;
    }

    public int getBaseResourceFlag() {
        return this.baseResourceFlag;
    }

    public int getBaseResourceVersion() {
        return this.baseResourceVersion;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public int getDeviceSource() {
        return this.deviceSource;
    }

    public int getDeviceType() {
        return this.deviceType;
    }

    public int getExtResourceFlag() {
        return this.extResourceFlag;
    }

    public int getExtResourceVersion() {
        return this.extResourceVersion;
    }

    public int getFirmwareFlag() {
        return this.firmwareFlag;
    }

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public int getFontFlag() {
        return this.fontFlag;
    }

    public int getFontVersion() {
        return this.fontVersion;
    }

    public String getGpsVersion() {
        return this.gpsVersion;
    }

    public String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public int getPnpId() {
        return this.pnpId;
    }

    public int getPnpVersion() {
        return this.pnpVersion;
    }

    public int getResourceFlag() {
        return this.resourceFlag;
    }

    public int getResourceVersion() {
        return this.resourceVersion;
    }

    public String getSn() {
        return this.sn;
    }

    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    public SystemImageStatus getSystemImageStatus() {
        return this.systemImageStatus;
    }

    public String getSystemModel() {
        return this.systemModel;
    }

    public String getSystemVersion() {
        return this.systemVersion;
    }

    public int getVendorId() {
        return this.vendorId;
    }

    public int getVendorSource() {
        return this.vendorSource;
    }

    public boolean isHasBaseResource() {
        return this.hasBaseResource;
    }

    public boolean isHasExtResource() {
        return this.hasExtResource;
    }

    public boolean isHasOtherVersion() {
        return this.hasOtherVersion;
    }

    public void setAuthKey(String str) {
        this.authKey = str;
    }

    public void setBaseResourceFlag(int i) {
        this.baseResourceFlag = i;
    }

    public void setBaseResourceVersion(int i) {
        this.baseResourceVersion = i;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceSource(int i) {
        this.deviceSource = i;
    }

    public void setDeviceType(int i) {
        this.deviceType = i;
    }

    public void setExtResourceFlag(int i) {
        this.extResourceFlag = i;
    }

    public void setExtResourceVersion(int i) {
        this.extResourceVersion = i;
    }

    public void setFirmwareFlag(int i) {
        this.firmwareFlag = i;
    }

    public void setFirmwareVersion(String str) {
        this.firmwareVersion = str;
    }

    public void setFontFlag(int i) {
        this.fontFlag = i;
    }

    public void setFontVersion(int i) {
        this.fontVersion = i;
    }

    public void setGpsVersion(String str) {
        this.gpsVersion = str;
    }

    public void setHardwareVersion(String str) {
        this.hardwareVersion = str;
    }

    public void setHasBaseResource(boolean z) {
        this.hasBaseResource = z;
    }

    public void setHasExtResource(boolean z) {
        this.hasExtResource = z;
    }

    public void setHasOtherVersion(boolean z) {
        this.hasOtherVersion = z;
    }

    public void setMacAddress(String str) {
        this.macAddress = str;
    }

    public void setPnpId(int i) {
        this.pnpId = i;
    }

    public void setPnpVersion(int i) {
        this.pnpVersion = i;
    }

    public void setResourceFlag(int i) {
        this.resourceFlag = i;
    }

    public void setResourceVersion(int i) {
        this.resourceVersion = i;
    }

    public void setSn(String str) {
        this.sn = str;
    }

    public void setSoftwareVersion(String str) {
        this.softwareVersion = str;
    }

    public void setSystemImageStatus(SystemImageStatus systemImageStatus) {
        this.systemImageStatus = systemImageStatus;
    }

    public void setSystemModel(String str) {
        this.systemModel = str;
    }

    public void setSystemVersion(String str) {
        this.systemVersion = str;
    }

    public void setVendorId(int i) {
        this.vendorId = i;
    }

    public void setVendorSource(int i) {
        this.vendorSource = i;
    }

    public String toString() {
        return "DeviceInfoExt{macAddress='" + this.macAddress + "', authKey='" + this.authKey + "', sn='" + this.sn + "', deviceId='" + this.deviceId + "', hardwareVersion='" + this.hardwareVersion + "', pnpId=" + this.pnpId + ", pnpVersion=" + this.pnpVersion + ", deviceType=" + this.deviceType + ", deviceSource=" + this.deviceSource + ", systemModel='" + this.systemModel + "', systemVersion='" + this.systemVersion + "', softwareVersion='" + this.softwareVersion + "', firmwareFlag=" + this.firmwareFlag + ", firmwareVersion='" + this.firmwareVersion + "', fontFlag=" + this.fontFlag + ", fontVersion='" + this.fontVersion + "', resourceFlag=" + this.resourceFlag + ", resourceVersion='" + this.resourceVersion + "', gpsVersion='" + this.gpsVersion + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
