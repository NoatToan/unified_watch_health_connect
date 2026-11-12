package com.xiaomi.digitalkey.wearable.storage;

import com.xiaomi.digitalkey.wearable.EPConfig;
import com.xiaomi.digitalkey.wearable.utils.ByteUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class DigitalKeyRecord implements Serializable {
    private static final long serialVersionUID = 120510;
    String mBrandId;
    String mBrandName;
    byte[] mDuplicateVehicleIdKeyId;
    byte[] mDuplicateVehicleIdTerminationAttestation;
    EPConfig mEndpointConfig;
    String mFriendlyName;
    String mKeyId;
    String mKeyStage;
    String mKeyType;
    String mShareRecordLocalData;
    String mShareRecordServerData;
    String mSlotId;
    String mVehicleId;
    String mVehicleOemId;
    String mBTAddr = null;
    String mBTPubAddr = null;
    String mIKR = null;
    String mVehiclePairedStatus = null;

    public DigitalKeyRecord(byte[] bArr) {
        this.mKeyId = ByteUtils.toHexString(bArr);
    }

    public String getBTAddr() {
        return this.mBTAddr;
    }

    public String getBrandId() {
        return this.mBrandId;
    }

    public String getBrandName() {
        return this.mBrandName;
    }

    public byte[] getDuplicateVehicleIdKeyId() {
        return this.mDuplicateVehicleIdKeyId;
    }

    public byte[] getDuplicateVehicleIdTerminationAttestation() {
        return this.mDuplicateVehicleIdTerminationAttestation;
    }

    public EPConfig getEPConfig() {
        return this.mEndpointConfig;
    }

    public String getFriendlyName() {
        return this.mFriendlyName;
    }

    public String getIRK() {
        return this.mIKR;
    }

    public String getKeyId() {
        return this.mKeyId;
    }

    public String getKeyStage() {
        return this.mKeyStage;
    }

    public String getKeyType() {
        return this.mKeyType;
    }

    public String getLocalShareData() {
        return this.mShareRecordLocalData;
    }

    public String getParingStatus() {
        return this.mVehiclePairedStatus;
    }

    public String getPublicBTAddr() {
        return this.mBTPubAddr;
    }

    public String getServerShareRecordData() {
        return this.mShareRecordServerData;
    }

    public String getSlotId() {
        return this.mSlotId;
    }

    public String getVehicleOemId() {
        return this.mVehicleOemId;
    }

    public void setBTAddress(String str) {
        this.mBTAddr = str;
    }

    public void setBrandId(String str) {
        this.mBrandId = str;
    }

    public void setBrandName(String str) {
        this.mBrandName = str;
    }

    public void setDuplicateVehicleIdKeyId(byte[] bArr) {
        this.mDuplicateVehicleIdKeyId = bArr;
    }

    public void setDuplicateVehicleIdTerminationAttestation(byte[] bArr) {
        this.mDuplicateVehicleIdTerminationAttestation = bArr;
    }

    public void setEPConfig(EPConfig ePConfig) {
        this.mEndpointConfig = ePConfig;
    }

    public void setFriendlyName(String str) {
        this.mFriendlyName = str;
    }

    public void setIRK(String str) {
        this.mIKR = str;
    }

    public void setKeyStage(String str) {
        this.mKeyStage = str;
    }

    public void setKeyType(String str) {
        this.mKeyType = str;
    }

    public void setLocalShareData(String str) {
        this.mShareRecordLocalData = str;
    }

    public void setParingStatus(String str) {
        this.mVehiclePairedStatus = str;
    }

    public void setPublicBTAddress(String str) {
        this.mBTPubAddr = str;
    }

    public void setServerShareRecordData(String str) {
        this.mShareRecordServerData = str;
    }

    public void setSlotId(String str) {
        this.mSlotId = str;
    }

    public void setVehicleOemId(String str) {
        this.mVehicleOemId = str;
    }

    public String toString() {
        return "KeyId: " + this.mKeyId + " address: " + this.mBTAddr + " status: " + this.mVehiclePairedStatus + "brandId: " + this.mBrandId + "vehicleOemId: " + this.mVehicleOemId;
    }
}
