package com.xiaomi.digitalkey.wearable.storage;

import com.xiaomi.digitalkey.wearable.utils.ByteUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class KeyShareRecord implements Serializable {
    private static final boolean DEBUG = true;
    private static final boolean ERR = true;
    public static final String SECRET_FORMAT_TYPE_BASE64 = "Base64";
    public static final String SECRET_FORMAT_TYPE_HEX = "Hex";
    public static final String SHARE_TYPE_FRIEND = "FRIEND";
    public static final String SHARE_TYPE_OWNER = "OWNER";
    public static final int STEP_SHARE_CHECK = 1;
    public static final int STEP_SHARE_KTS = 4;
    public static final int STEP_SHARE_SIGN = 3;
    public static final int STEP_SHARE_UNTRACKED = 2;
    private static final long serialVersionUID = 120510;
    private final String LogTag = "SDK-DKF-KeyShareRecord:";
    byte[] mConfidentMbAuth1;
    int mDA_Tag;
    String mDeviceClaim;
    String mFriendlyName;
    byte[] mInviteData;
    String mKeyId;
    String mKeyShareStage;
    String mMailboxId;
    byte[] mNotAfter;
    byte[] mNotBefore;
    byte[] mNotificationData;
    byte[] mPrivateMbAuth1;
    String mSecret;
    String mSecretFormatType;
    int mSelectedEntry;
    byte[] mSelectedSlotId;
    byte[] mShareConf;
    String mShareType;
    int mStandardProfile;
    int mStep;
    String mUrl;
    String mVehicleBrandId;
    String mVehicleBrandName;
    byte[] mVehicleID;
    String mVehicleOemId;

    public KeyShareRecord(String str) {
        this.mDeviceClaim = str;
    }

    public byte[] getConfidentMbAuth1() {
        return this.mConfidentMbAuth1;
    }

    public int getDATag() {
        return this.mDA_Tag;
    }

    public String getDeviceClaim() {
        return this.mDeviceClaim;
    }

    public String getFriendlyName() {
        return this.mFriendlyName;
    }

    public byte[] getInviteData() {
        return this.mInviteData;
    }

    public String getKeyId() {
        return this.mKeyId;
    }

    public String getMailboxId() {
        return this.mMailboxId;
    }

    public byte[] getNotAfter() {
        return this.mNotAfter;
    }

    public byte[] getNotBefore() {
        return this.mNotBefore;
    }

    public byte[] getNotificationData() {
        return this.mNotificationData;
    }

    public byte[] getPrivateMbAuth1() {
        return this.mPrivateMbAuth1;
    }

    public String getSecret() {
        return this.mSecret;
    }

    public int getSelectedEntry() {
        return this.mSelectedEntry;
    }

    public byte[] getSelectedSlotId() {
        return this.mSelectedSlotId;
    }

    public String getShareStage() {
        return this.mShareType;
    }

    public String getShareType() {
        return this.mShareType;
    }

    public int getStandProfile() {
        return this.mStandardProfile;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public String getVehicleBrandId() {
        return this.mVehicleBrandId;
    }

    public String getVehicleBrandName() {
        return this.mVehicleBrandName;
    }

    public byte[] getVehicleID() {
        return this.mVehicleID;
    }

    public String getVehicleOemId() {
        return this.mVehicleOemId;
    }

    public boolean isBase64FormatSecret() {
        return !SECRET_FORMAT_TYPE_HEX.equals(this.mSecretFormatType);
    }

    public void setConfidentMbAuth1(byte[] bArr) {
        this.mConfidentMbAuth1 = bArr;
    }

    public void setDATag(int i) {
        this.mDA_Tag = i;
    }

    public void setDeviceClaim(String str) {
        this.mDeviceClaim = str;
    }

    public void setFriendlyName(String str) {
        this.mFriendlyName = str;
    }

    public void setInviteData(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("save inviteData: ");
        sb.append(ByteUtils.toHexString(bArr));
        this.mInviteData = bArr;
    }

    public void setKeyId(String str) {
        this.mKeyId = str;
    }

    public void setMailboxId(String str) {
        this.mMailboxId = str;
    }

    public void setNotAfter(byte[] bArr) {
        this.mNotAfter = bArr;
    }

    public void setNotBefore(byte[] bArr) {
        this.mNotBefore = bArr;
    }

    public void setNotificationData(byte[] bArr) {
        this.mNotificationData = bArr;
    }

    public void setPrivateMbAuth1(byte[] bArr) {
        this.mPrivateMbAuth1 = bArr;
    }

    public void setSecret(String str) {
        this.mSecret = str;
    }

    public void setSecretFormatType(String str) {
        this.mSecretFormatType = str;
    }

    public void setSelectedEntry(int i) {
        this.mSelectedEntry = i;
    }

    public void setSelectedSlotId(byte[] bArr) {
        this.mSelectedSlotId = bArr;
    }

    public void setShareStage(String str) {
        this.mKeyShareStage = str;
    }

    public void setShareType(String str) {
        this.mShareType = str;
    }

    public void setStandProfile(int i) {
        this.mStandardProfile = i;
    }

    public void setStep(int i) {
        this.mStep = i;
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }

    public void setVehicleBrandId(String str) {
        this.mVehicleBrandId = str;
    }

    public void setVehicleBrandName(String str) {
        this.mVehicleBrandName = str;
    }

    public void setVehicleID(byte[] bArr) {
        this.mVehicleID = bArr;
    }

    public void setVehicleOemId(String str) {
        this.mVehicleOemId = str;
    }

    public String toString() {
        return "url: " + this.mUrl + "\n keyId: " + this.mKeyId + "\n MailBoxId: " + this.mMailboxId + " \n DeviceClaim: " + this.mDeviceClaim + " \ninviteData: " + ByteUtils.toHexString(this.mInviteData) + "\n ShareStage:" + this.mKeyShareStage + "\n mSecretFormatType:" + this.mSecretFormatType;
    }
}
