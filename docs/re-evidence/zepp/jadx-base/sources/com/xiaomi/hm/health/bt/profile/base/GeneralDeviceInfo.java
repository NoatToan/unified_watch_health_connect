package com.xiaomi.hm.health.bt.profile.base;

import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.feature.Feature;

/* JADX INFO: loaded from: classes11.dex */
public class GeneralDeviceInfo {
    private Feature a;
    public byte[] bytesOfDeviceID;
    public String deviceID;
    public String firmwareRevision;
    public String hardwareRevision;
    public String manufacturerName;
    public String modelNumberString;
    public PnP pnp;
    public String serialNumber;
    public int version;

    public GeneralDeviceInfo() {
        this.deviceID = null;
        this.serialNumber = null;
        this.firmwareRevision = null;
        this.hardwareRevision = null;
        this.pnp = null;
        this.bytesOfDeviceID = null;
        this.version = -1;
        this.a = null;
        this.manufacturerName = null;
        this.modelNumberString = null;
    }

    public Feature getDeviceFeature() {
        return this.a;
    }

    public boolean isValid() {
        return (this.deviceID == null || this.firmwareRevision == null || this.pnp == null || this.serialNumber == null) ? false : true;
    }

    public void setDeviceFeature(Feature deviceFeature) {
        this.a = deviceFeature;
    }

    public String toString() {
        return "GeneralDeviceInfo{deviceID='" + this.deviceID + "', serialNumber='" + this.serialNumber + "', firmwareRevision='" + this.firmwareRevision + "', hardwareRevision='" + this.hardwareRevision + "', pnp=" + this.pnp + ", bytesOfDeviceID=" + GattUtils.bytesToHexString(this.bytesOfDeviceID) + ", version=" + this.version + ", deviceFeature=" + this.a + ", manufacturerName=" + this.manufacturerName + ", modelNumberString=" + this.modelNumberString + '}';
    }

    public GeneralDeviceInfo(String deviceId, String serialNumber, String firmwareRevision, PnP pnp) {
        this.deviceID = null;
        this.serialNumber = null;
        this.firmwareRevision = null;
        this.hardwareRevision = null;
        this.pnp = null;
        this.bytesOfDeviceID = null;
        this.version = -1;
        this.a = null;
        this.manufacturerName = null;
        this.modelNumberString = null;
        this.deviceID = deviceId;
        this.serialNumber = serialNumber;
        this.firmwareRevision = firmwareRevision;
        this.pnp = pnp;
    }
}
