package com.xiaomi.smarthome.core.server.internal.bluetooth.model;

import com.xiaomi.smarthome.library.bluetooth.connect.BleGattProfile;

/* JADX INFO: loaded from: classes10.dex */
public interface IBlePropCacher {
    String getEncryptedKeyId(String str);

    String getEncryptedLtmk(String str);

    String getEncryptedMeshBindInfo(String str);

    String getEncryptedSessionKey(String str);

    String getEncryptedToken(String str);

    String getJsonFirmwareUpdateInfo(String str);

    String getLockShareCreateTime(String str);

    String getLockShareKeyId(String str);

    String getLockShareUserKey(String str);

    int getLtmkEncryptType(String str);

    String getPincode(String str);

    String getPropBeaconName(String str);

    int getPropBoundStatus(String str);

    String getPropDesc(String str);

    String getPropDid(String str);

    int getPropExtra(String str, String str2, int i);

    String getPropExtra(String str, String str2);

    boolean getPropExtra(String str, String str2, boolean z);

    BleGattProfile getPropGattProfile(String str);

    String getPropModel(String str);

    String getPropName(String str);

    String getPropOwnerId(String str);

    String getPropOwnerName(String str);

    int getPropPermitLevel(String str);

    int getPropProductId(String str);

    int getPropRssi(String str);

    String getPropSMac(String str);

    byte[] getPropScanRecord(String str);

    int getPropType(String str);

    boolean isShowPincode(String str);

    void removePropExtra(String str, String str2);

    void setEncryptedKeyId(String str, String str2);

    void setEncryptedLtmk(String str, String str2);

    void setEncryptedMeshBindInfo(String str, String str2);

    void setEncryptedSessionKey(String str, String str2);

    void setEncryptedToken(String str, String str2);

    void setJsonFirmwareUpdateInfo(String str, String str2);

    void setLockShareCreateTime(String str, String str2);

    void setLockShareKeyId(String str, String str2);

    void setLockShareUserKey(String str, String str2);

    void setLtmkEncryptType(String str, int i);

    void setPincode(String str, String str2);

    void setPropBeaconName(String str, String str2);

    void setPropBoundStatus(String str, int i);

    void setPropDesc(String str, String str2);

    void setPropDid(String str, String str2);

    void setPropExtra(String str, String str2, int i);

    void setPropExtra(String str, String str2, String str3);

    void setPropExtra(String str, String str2, boolean z);

    void setPropGattProfile(String str, BleGattProfile bleGattProfile);

    void setPropModel(String str, String str2);

    void setPropName(String str, String str2);

    void setPropOwnerId(String str, String str2);

    void setPropOwnerName(String str, String str2);

    void setPropPermitLevel(String str, int i);

    void setPropProductId(String str, int i);

    void setPropRssi(String str, int i);

    void setPropSMac(String str, String str2);

    void setPropScanRecord(String str, byte[] bArr);

    void setPropType(String str, int i);

    void setShowPincode(String str, boolean z);

    void traverse(BleDevicePropCache.IPropTraverse iPropTraverse);
}
