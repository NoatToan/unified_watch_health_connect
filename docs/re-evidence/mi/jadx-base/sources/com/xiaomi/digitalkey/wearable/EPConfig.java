package com.xiaomi.digitalkey.wearable;

import android.content.Context;
import com.xiaomi.digitalkey.wearable.storage.DKStorageManager;
import com.xiaomi.digitalkey.wearable.storage.DigitalKeyRecord;
import com.xiaomi.digitalkey.wearable.utils.ByteUtils;
import com.xiaomi.digitalkey.wearable.utils.ConstUtils;
import com.xiaomi.digitalkey.wearable.utils.Logger;
import com.xiaomi.digitalkey.wearable.utils.TLVObject;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class EPConfig implements Serializable {
    private static final boolean DEBUG = Logger.LOG_EPCONF;
    private static final String LogTag = "SDK-DKF-EPConfig:";
    private static final long serialVersionUID = 120510;
    private byte[] mBTAddress;
    private byte[] mBrandId;
    private String mBrandName;
    private byte[] mConf_mbx_size;
    private byte[] mConfidentMbAuth1;
    private byte[] mCountLimit;
    private String mFriendName;
    private byte[] mIRK;
    private byte[] mImmobilizerTokeLen;
    private byte[] mKBleIntro;
    private byte[] mKBleMaster;
    private byte[] mKBleOob;
    private byte[] mKeyAttOffset;
    private int mKeyStatus;
    private String mKeyType;
    private byte[] mLongTermSecret;
    private byte[] mMBMapping;
    private byte[] mMbxEndOffset;
    private byte[] mPriv_mbx_size;
    private byte[] mPrivateMbAuth1;
    private int mProfile;
    private byte[] mSigBmpOffset;
    private byte[] mSlotIdBmpOffset;
    private byte[] mSlotIdLstOffset;
    private byte mTag46;
    private byte mTag47;
    private String mVehicleOemId;
    private byte[] mVehiclePropDatOffset;
    private byte[] mVersion;
    private byte[] mWCC;
    private byte[] mAuth_PK = null;
    private byte[] mKeySlot = null;
    private byte[] mEPId = new byte[8];
    private byte[] mVehicleId = null;
    private byte[] mInstanceCAId = new byte[8];
    private byte[] mVehiclePK = new byte[65];
    private byte[] mNot_before = new byte[15];
    private byte[] mNot_after = new byte[15];
    private String mKey_identifer = null;
    private byte[] mKeyShareConf = null;
    private byte[] mRoutingInfo = null;
    private byte[] mDK_ver = null;
    private boolean mNFCCapability = false;
    private boolean mUWBCapability = false;
    private boolean mBLECapability = false;
    private boolean mLELR = false;
    private boolean mKeyTrackingReceipt = false;
    private boolean mKey_share_psw = false;
    private int mKeySharePswLen = 0;
    private byte[] mKeyProfileList = null;
    private byte[] mImmoTokenKeySlotSource = null;
    private boolean mOnlineCertificateDeliver = false;
    byte[] mTranCodeWired = null;
    byte[] mTranCodeCl = null;
    byte mVisibilityClPersist = 31;
    byte mVisibilityClVolatile = 31;
    byte mVisibilityWiredPersist = 31;
    byte mVisibilityWiredVolatile = 31;
    byte mClearVisibilityVolatile = 31;
    byte[] mDuplicateVehicleIdKeyId = null;
    byte[] mDuplicateVehicleIdTerminationAttestation = null;
    boolean mLoadedConfig = false;
    byte[] mVehiclePkCertificate = null;
    byte[] mVehicleIntermediateCertificate = null;
    final String VEHICLE_STATUS_UNPAIRED = "Vehicle_Unpaired";

    public static void removeLongTermConf(Context context, byte[] bArr) {
        try {
            DKStorageManager.removeRecord(context, ByteUtils.toHexString(bArr));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void restoreLongTermConfig(EPConfig ePConfig) {
        this.mRoutingInfo = ePConfig.mRoutingInfo;
        this.mLoadedConfig = ePConfig.mLoadedConfig;
        this.mFriendName = ePConfig.mFriendName;
        this.mBTAddress = ePConfig.mBTAddress;
        this.mKeySharePswLen = ePConfig.mKeySharePswLen;
        this.mKeyProfileList = ePConfig.mKeyProfileList;
        this.mImmoTokenKeySlotSource = ePConfig.mImmoTokenKeySlotSource;
        this.mKeyTrackingReceipt = ePConfig.mKeyTrackingReceipt;
        this.mOnlineCertificateDeliver = ePConfig.mOnlineCertificateDeliver;
        this.mConfidentMbAuth1 = ePConfig.mConfidentMbAuth1;
        this.mPrivateMbAuth1 = ePConfig.mPrivateMbAuth1;
        this.mVehicleId = ePConfig.mVehicleId;
        this.mSigBmpOffset = ePConfig.mSigBmpOffset;
        this.mMbxEndOffset = ePConfig.mMbxEndOffset;
        this.mImmobilizerTokeLen = ePConfig.mImmobilizerTokeLen;
        this.mSlotIdLstOffset = ePConfig.mSlotIdLstOffset;
        this.mSlotIdBmpOffset = ePConfig.mSlotIdBmpOffset;
        this.mVehiclePropDatOffset = ePConfig.mVehiclePropDatOffset;
        this.mKeyAttOffset = ePConfig.mKeyAttOffset;
        this.mIRK = ePConfig.mIRK;
        this.mLongTermSecret = ePConfig.mLongTermSecret;
        this.mKeyShareConf = ePConfig.mKeyShareConf;
        this.mMBMapping = ePConfig.mMBMapping;
        this.mWCC = ePConfig.mWCC;
        this.mKeySlot = ePConfig.mKeySlot;
        this.mKBleIntro = ePConfig.mKBleIntro;
        this.mKBleMaster = ePConfig.mKBleMaster;
        this.mKBleOob = ePConfig.mKBleOob;
        this.mDuplicateVehicleIdTerminationAttestation = ePConfig.mDuplicateVehicleIdTerminationAttestation;
        this.mDuplicateVehicleIdKeyId = ePConfig.mDuplicateVehicleIdKeyId;
        this.mKeyType = ePConfig.mKeyType;
        this.mBrandId = ePConfig.mBrandId;
        this.mVehiclePkCertificate = ePConfig.mVehiclePkCertificate;
        this.mVehicleIntermediateCertificate = ePConfig.mVehicleIntermediateCertificate;
        this.mTag46 = ePConfig.mTag46;
        this.mTag47 = ePConfig.mTag47;
        this.mVersion = ePConfig.mVersion;
        this.mVehiclePK = ePConfig.mVehiclePK;
        this.mNot_before = ePConfig.mNot_before;
        this.mNot_after = ePConfig.mNot_after;
        this.mAuth_PK = ePConfig.mAuth_PK;
        this.mConf_mbx_size = ePConfig.mConf_mbx_size;
        this.mPriv_mbx_size = ePConfig.mPriv_mbx_size;
        this.mNFCCapability = ePConfig.mNFCCapability;
        this.mUWBCapability = ePConfig.mUWBCapability;
        this.mBLECapability = ePConfig.mBLECapability;
        this.mLELR = ePConfig.mLELR;
    }

    public void clearVolatileSettings() {
        this.mClearVisibilityVolatile = (byte) 1;
    }

    public void createEpId(int i) {
        StringBuilder sb;
        String str;
        String str2 = (i == ConstUtils.DK_TYPE_OWNER ? "DIGK.OWNR." : "DIGK.FRND.") + ByteUtils.randomString(4);
        if (this.mFriendName != null) {
            sb = new StringBuilder();
            sb.append(str2);
            sb.append("=");
            str = this.mFriendName;
        } else {
            sb = new StringBuilder();
            sb.append(str2);
            str = "=XiaomiTest";
        }
        sb.append(str);
        this.mEPId = ByteUtils.getLimitValidUTF8String(sb.toString(), 30).getBytes();
        if (DEBUG) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ep_id is: ");
            sb2.append(new String(this.mEPId));
        }
    }

    public void flushLongTermConfig(Context context, byte[] bArr) {
        DigitalKeyRecord digitalKeyRecord;
        String strConcat = ByteUtils.toHexString(bArr).concat(".db");
        if (new File(context.getDataDir().toString() + "/record", strConcat).exists()) {
            if (DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("record file: ");
                sb.append(strConcat);
                sb.append(" exist, it is the second time to flush it, load config first.");
            }
            try {
                digitalKeyRecord = (DigitalKeyRecord) DKStorageManager.loadRecord(context, ByteUtils.toHexString(bArr));
                EPConfig ePConfig = digitalKeyRecord.getEPConfig();
                this.mConfidentMbAuth1 = ePConfig.mConfidentMbAuth1;
                this.mPrivateMbAuth1 = ePConfig.mPrivateMbAuth1;
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                digitalKeyRecord = new DigitalKeyRecord(bArr);
            }
        } else {
            if (DEBUG) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("record file: ");
                sb2.append(strConcat);
                sb2.append(" Not exist, create and flush config to it.");
            }
            digitalKeyRecord = new DigitalKeyRecord(bArr);
        }
        byte[] bArr2 = this.mBTAddress;
        if (bArr2 != null) {
            digitalKeyRecord.setPublicBTAddress(ByteUtils.ConvertToBTAddress(bArr2));
        }
        byte[] bArr3 = this.mIRK;
        if (bArr3 != null) {
            digitalKeyRecord.setIRK(ByteUtils.toHexString(bArr3));
        }
        byte[] bArr4 = this.mBrandId;
        if (bArr4 != null) {
            digitalKeyRecord.setBrandId(ByteUtils.toHexString(bArr4));
        }
        String str = this.mBrandName;
        if (str != null) {
            digitalKeyRecord.setBrandName(str);
        }
        String str2 = this.mVehicleOemId;
        if (str2 != null) {
            digitalKeyRecord.setVehicleOemId(str2);
        }
        byte[] bArr5 = this.mDuplicateVehicleIdKeyId;
        if (bArr5 != null) {
            digitalKeyRecord.setDuplicateVehicleIdKeyId(bArr5);
        } else {
            this.mDuplicateVehicleIdKeyId = digitalKeyRecord.getDuplicateVehicleIdKeyId();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("check dup keyid ");
            sb3.append(ByteUtils.toHexString(this.mDuplicateVehicleIdKeyId));
        }
        byte[] bArr6 = this.mDuplicateVehicleIdTerminationAttestation;
        if (bArr6 != null) {
            digitalKeyRecord.setDuplicateVehicleIdTerminationAttestation(bArr6);
        } else {
            this.mDuplicateVehicleIdTerminationAttestation = digitalKeyRecord.getDuplicateVehicleIdTerminationAttestation();
            if (DEBUG) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("check attestation ");
                sb4.append(ByteUtils.toHexString(this.mDuplicateVehicleIdTerminationAttestation));
            }
        }
        digitalKeyRecord.setFriendlyName(this.mFriendName);
        digitalKeyRecord.setKeyType(this.mKeyType);
        digitalKeyRecord.setParingStatus("Vehicle_Unpaired");
        digitalKeyRecord.setEPConfig(this);
        try {
            DKStorageManager.saveRecord(context, digitalKeyRecord, ByteUtils.toHexString(bArr));
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public byte[] getAuth1ConfidentialMB() {
        return this.mConfidentMbAuth1;
    }

    public byte[] getAuth1PrivateMB() {
        return this.mPrivateMbAuth1;
    }

    public byte[] getAuthPk() {
        return this.mAuth_PK;
    }

    public boolean getBLECapability() {
        return this.mBLECapability;
    }

    public byte[] getBTADDR(Context context, byte[] bArr) {
        if (this.mBTAddress == null) {
            restoreConfigIfNeeded(context, bArr);
        }
        return this.mBTAddress;
    }

    public byte[] getBrandId() {
        return this.mBrandId;
    }

    public String getBrandName() {
        return this.mBrandName;
    }

    public byte[] getConfMbxSize() {
        return this.mConf_mbx_size;
    }

    public byte[] getCountLimit() {
        return this.mCountLimit;
    }

    public byte[] getDuplicateVehicleIdKeyId() {
        return this.mDuplicateVehicleIdKeyId;
    }

    public byte[] getDuplicateVehicleIdTerminationAttestation() {
        return this.mDuplicateVehicleIdTerminationAttestation;
    }

    public byte[] getEpId() {
        return this.mEPId;
    }

    public String getFriendlyName() {
        return this.mFriendName;
    }

    public byte[] getIRK(Context context, byte[] bArr) {
        if (this.mIRK == null) {
            restoreConfigIfNeeded(context, bArr);
        }
        return this.mIRK;
    }

    public byte[] getImmtokenLen(Context context, byte[] bArr) {
        if (this.mImmobilizerTokeLen == null) {
            restoreConfigIfNeeded(context, bArr);
        }
        return this.mImmobilizerTokeLen;
    }

    public byte[] getInstanceCAId() {
        return this.mInstanceCAId;
    }

    public byte[] getKBleIntro() {
        return this.mKBleIntro;
    }

    public byte[] getKBleMaster() {
        return this.mKBleMaster;
    }

    public byte[] getKBleOob() {
        return this.mKBleOob;
    }

    public byte[] getKeyAttOffset(Context context, byte[] bArr) {
        if (this.mKeyAttOffset == null) {
            restoreConfigIfNeeded(context, bArr);
            if (DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("get mKeyAtt_offset: ");
                sb.append(ByteUtils.toHexString(this.mKeyAttOffset));
            }
        }
        return this.mKeyAttOffset;
    }

    public int getKeyAttSize() {
        int iStream2len = ByteUtils.stream2len(this.mMbxEndOffset) - ByteUtils.stream2len(this.mKeyAttOffset);
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("get_KeyAtt_size: ");
            sb.append(iStream2len);
        }
        if (iStream2len > 0) {
            return iStream2len;
        }
        return 0;
    }

    public String getKeyIdentifier() {
        return this.mKey_identifer;
    }

    public byte[] getKeyShareEpConfig(Context context, byte[] bArr) {
        if (this.mKeyShareConf == null) {
            restoreConfigIfNeeded(context, bArr);
        }
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("load KeyShare_ep_config : ");
            sb.append(ByteUtils.toHexString(this.mKeyShareConf));
        }
        return this.mKeyShareConf;
    }

    public int getKeySharePswLen(Context context, byte[] bArr) {
        if (this.mKeySharePswLen == 0) {
            restoreConfigIfNeeded(context, bArr);
        }
        return this.mKeySharePswLen;
    }

    public boolean getKeySharePswRequired(Context context, byte[] bArr) {
        restoreConfigIfNeeded(context, bArr);
        return this.mKey_share_psw;
    }

    public byte[] getKeySlot() {
        return this.mKeySlot;
    }

    public boolean getKeyTrackingReceipt(Context context, byte[] bArr) {
        restoreConfigIfNeeded(context, bArr);
        return this.mKeyTrackingReceipt;
    }

    public String getKeyType() {
        return this.mKeyType;
    }

    public boolean getLELR() {
        return this.mLELR;
    }

    public byte[] getLongTermSharedSecret(Context context, byte[] bArr) {
        if (this.mLongTermSecret == null) {
            restoreConfigIfNeeded(context, bArr);
        }
        return this.mLongTermSecret;
    }

    public byte[] getMBMappingData(Context context, byte[] bArr) {
        if (this.mMBMapping == null) {
            restoreConfigIfNeeded(context, bArr);
        }
        return this.mMBMapping;
    }

    public byte[] getMbxEndOffset(Context context, byte[] bArr) {
        if (this.mMbxEndOffset == null) {
            restoreConfigIfNeeded(context, bArr);
        }
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("mMbxEnd_offset: ");
            sb.append(ByteUtils.toHexString(this.mMbxEndOffset));
        }
        return this.mMbxEndOffset;
    }

    public boolean getNFCCapability() {
        return this.mNFCCapability;
    }

    public byte[] getNotAfter() {
        return this.mNot_after;
    }

    public byte[] getNotBefore() {
        return this.mNot_before;
    }

    public boolean getOnlineCertificateDeliver(Context context, byte[] bArr) {
        restoreConfigIfNeeded(context, bArr);
        return this.mOnlineCertificateDeliver;
    }

    public byte[] getPrivMbxSize() {
        return this.mPriv_mbx_size;
    }

    public byte[] getSigBmpOffset(Context context, byte[] bArr) {
        if (this.mSigBmpOffset == null) {
            restoreConfigIfNeeded(context, bArr);
        }
        return this.mSigBmpOffset;
    }

    public byte[] getSlotIdentLstOffest(Context context, byte[] bArr) {
        if (this.mSlotIdLstOffset == null) {
            restoreConfigIfNeeded(context, bArr);
        }
        return this.mSlotIdLstOffset;
    }

    public int getStandardProfile() {
        return this.mProfile;
    }

    public byte getTag46() {
        return this.mTag46;
    }

    public byte getTag47() {
        return this.mTag47;
    }

    public byte[] getTransactionCodeCl() {
        return this.mTranCodeCl;
    }

    public byte[] getTransactionCodeWired() {
        return this.mTranCodeWired;
    }

    public boolean getUWBCapability() {
        return this.mUWBCapability;
    }

    public byte[] getVehicleId() {
        byte[] bArr = this.mVehicleId;
        if (bArr == null || bArr.length < 8) {
            this.mVehicleId = ByteUtils.randomString(8).getBytes();
            if (DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid Vehicle_id, create one: ");
                sb.append(ByteUtils.toHexString(this.mVehicleId));
            }
        }
        if (DEBUG) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Vehicle_id is: ");
            sb2.append(ByteUtils.toHexString(this.mVehicleId));
        }
        return this.mVehicleId;
    }

    public byte[] getVehicleIntermediateCertificate() {
        return this.mVehicleIntermediateCertificate;
    }

    public String getVehicleOemId() {
        return this.mVehicleOemId;
    }

    public byte[] getVehiclePK() {
        return this.mVehiclePK;
    }

    public byte[] getVehiclePkCertificate() {
        return this.mVehiclePkCertificate;
    }

    public byte[] getVehiclePropDatOffset(Context context, byte[] bArr) {
        if (this.mVehiclePropDatOffset == null) {
            restoreConfigIfNeeded(context, bArr);
        }
        return this.mVehiclePropDatOffset;
    }

    public byte[] getVersion() {
        return this.mVersion;
    }

    public byte getVisibilityWiredPersist() {
        return this.mVisibilityWiredPersist;
    }

    public byte getVisibilityWiredVolatile() {
        return this.mVisibilityWiredVolatile;
    }

    public byte getVisibilityWlPersist() {
        return this.mVisibilityClPersist;
    }

    public byte getVisibilityWlVolatile() {
        return this.mVisibilityClVolatile;
    }

    public byte[] getWirelessCapbility(Context context, byte[] bArr) {
        restoreConfigIfNeeded(context, bArr);
        ArrayList arrayList = new ArrayList();
        if (getNFCCapability()) {
            arrayList.add(new TLVObject(ConstUtils.TAG_NFC_CAPBLITY, (byte[]) null));
        }
        if (getUWBCapability()) {
            arrayList.add(new TLVObject(ConstUtils.TAG_UWB_CAPBLITY, (byte[]) null));
        }
        if (getBLECapability()) {
            ArrayList arrayList2 = new ArrayList();
            if (this.mIRK != null) {
                arrayList2.add(new TLVObject(new byte[]{-48}, this.mIRK));
            }
            if (this.mBTAddress != null) {
                arrayList2.add(new TLVObject(new byte[]{-47}, this.mBTAddress));
            }
            if (getLELR()) {
                arrayList2.add(new TLVObject(new byte[]{-46}, (byte[]) null));
            }
            arrayList2.add(this.mKBleOob != null ? new TLVObject(new byte[]{-45}, this.mKBleOob) : new TLVObject(new byte[]{-45}, this.mKBleMaster));
            arrayList2.add(new TLVObject(new byte[]{-44}, this.mKBleIntro));
            arrayList.add(new TLVObject(ConstUtils.TAG_BLE_CAPBLITY, arrayList2));
        }
        this.mWCC = new TLVObject(ConstUtils.TAG_WL_CAPBLITY, arrayList).toBytes();
        StringBuilder sb = new StringBuilder();
        sb.append("get WirelessCapbility = ");
        sb.append(ByteUtils.toHexString(this.mWCC));
        return this.mWCC;
    }

    public byte[] get_SlotIdentBmp_offset(Context context, byte[] bArr) {
        if (this.mSlotIdBmpOffset == null) {
            restoreConfigIfNeeded(context, bArr);
        }
        if (this.mSlotIdBmpOffset == null) {
            this.mSlotIdBmpOffset = new byte[]{0};
        }
        return this.mSlotIdBmpOffset;
    }

    public int get_immo_token_keySlot_source(Context context, byte[] bArr) {
        byte[] bArr2 = this.mImmoTokenKeySlotSource;
        if (bArr2 != null) {
            return bArr2[0];
        }
        restoreConfigIfNeeded(context, bArr);
        byte[] bArr3 = this.mImmoTokenKeySlotSource;
        if (bArr3 == null) {
            return 0;
        }
        return bArr3[0];
    }

    public byte[] get_key_profile_list(Context context, byte[] bArr) {
        if (this.mKeyProfileList == null) {
            restoreConfigIfNeeded(context, bArr);
        }
        return this.mKeyProfileList;
    }

    public byte[] get_routing_info(Context context, byte[] bArr) {
        if (this.mRoutingInfo == null) {
            restoreConfigIfNeeded(context, bArr);
        }
        return this.mRoutingInfo;
    }

    public boolean isConfigLoaded() {
        return this.mLoadedConfig;
    }

    public void loadLongTermConfig(Context context, byte[] bArr) {
        try {
            restoreLongTermConfig(((DigitalKeyRecord) DKStorageManager.loadRecord(context, ByteUtils.toHexString(bArr))).getEPConfig());
            this.mLoadedConfig = true;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void restoreConfigIfNeeded(Context context, byte[] bArr) {
        if (this.mLoadedConfig) {
            return;
        }
        loadLongTermConfig(context, bArr);
    }

    public void setAuth1ConfidentialMB(byte[] bArr) {
        this.mConfidentMbAuth1 = bArr;
    }

    public void setAuth1PrivateMB(byte[] bArr) {
        this.mPrivateMbAuth1 = bArr;
    }

    public void setAuthPk(byte[] bArr) {
        this.mAuth_PK = bArr;
    }

    public void setBLECapability(boolean z) {
        this.mBLECapability = z;
    }

    public void setBTADDR(byte[] bArr) {
        this.mBTAddress = bArr;
    }

    public void setBrandId(byte[] bArr) {
        this.mBrandId = bArr;
    }

    public void setBrandName(String str) {
        this.mBrandName = str;
    }

    public void setConfMbxSize(byte[] bArr) {
        this.mConf_mbx_size = bArr;
    }

    public void setCountLimit(byte[] bArr) {
        this.mCountLimit = bArr;
    }

    public void setDuplicateVehicleIdKeyId(byte[] bArr) {
        this.mDuplicateVehicleIdKeyId = bArr;
    }

    public void setDuplicateVehicleIdTerminationAttestation(byte[] bArr) {
        this.mDuplicateVehicleIdTerminationAttestation = bArr;
    }

    public void setFriendlyName(String str) {
        this.mFriendName = str;
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("Friendly name is: ");
            sb.append(this.mFriendName);
        }
    }

    public void setIRK(byte[] bArr) {
        this.mIRK = bArr;
    }

    public void setImmoTokenKeySlotSource(byte[] bArr) {
        this.mImmoTokenKeySlotSource = bArr;
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("save immotoken_keyslot_source config: ");
            sb.append(ByteUtils.toHexString(bArr));
        }
    }

    public void setImmtokenLen(byte[] bArr) {
        this.mImmobilizerTokeLen = bArr;
    }

    public void setInstanceCAId(byte[] bArr) {
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("instance ca is: ");
            sb.append(new String(bArr));
        }
        this.mInstanceCAId = bArr;
    }

    public void setKBleIntro(byte[] bArr) {
        this.mKBleIntro = bArr;
    }

    public void setKBleMaster(byte[] bArr) {
        this.mKBleMaster = bArr;
    }

    public void setKBleOob(byte[] bArr) {
        this.mKBleOob = bArr;
    }

    public void setKeyAttOffset(byte[] bArr) {
        this.mKeyAttOffset = bArr;
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("set mKeyAtt_offset: ");
            sb.append(ByteUtils.toHexString(this.mKeyAttOffset));
        }
    }

    public void setKeyIdentifier(String str) {
        this.mKey_identifer = str;
    }

    public void setKeyProfileList(byte[] bArr) {
        this.mKeyProfileList = bArr;
    }

    public void setKeySharePswLen(byte[] bArr) {
        this.mKeySharePswLen = bArr[0];
    }

    public void setKeySlot(byte[] bArr) {
        this.mKeySlot = bArr;
    }

    public void setKeyTrackingReceipt() {
        this.mKeyTrackingReceipt = true;
    }

    public void setKeyType(String str) {
        this.mKeyType = str;
    }

    public void setLELR(boolean z) {
        this.mLELR = z;
    }

    public void setLongTermSharedScret(byte[] bArr) {
        this.mLongTermSecret = bArr;
    }

    public void setMbxEndOffset(byte[] bArr) {
        this.mMbxEndOffset = bArr;
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("mMbxEnd_offset: ");
            sb.append(ByteUtils.toHexString(this.mMbxEndOffset));
        }
    }

    public void setNFCCapability(boolean z) {
        this.mNFCCapability = z;
    }

    public void setNotAfter(byte[] bArr) {
        this.mNot_after = bArr;
    }

    public void setNotBefore(byte[] bArr) {
        this.mNot_before = bArr;
    }

    public void setOnlineCertificateDeliver() {
        this.mOnlineCertificateDeliver = true;
    }

    public void setPrivMbxSize(byte[] bArr) {
        this.mPriv_mbx_size = bArr;
    }

    public void setSigBmpOffset(byte[] bArr) {
        this.mSigBmpOffset = bArr;
    }

    public void setSlotIdentBmpOffset(byte[] bArr) {
        this.mSlotIdBmpOffset = bArr;
    }

    public void setSlotIdentLstOffest(byte[] bArr) {
        this.mSlotIdLstOffset = bArr;
    }

    public void setStandardProfile(int i) {
        this.mProfile = i;
    }

    public void setTag46(byte b2) {
        this.mTag46 = b2;
    }

    public void setTag47(byte b2) {
        this.mTag47 = b2;
    }

    public void setTransactionCodeCl(byte[] bArr) {
        this.mTranCodeCl = bArr;
    }

    public void setTransactionCodeWired(byte[] bArr) {
        this.mTranCodeWired = bArr;
    }

    public void setUWBCapability(boolean z) {
        this.mUWBCapability = z;
    }

    public void setVehicleId(byte[] bArr) {
        this.mVehicleId = bArr;
    }

    public void setVehicleIntermediateCertificate(byte[] bArr) {
        this.mVehicleIntermediateCertificate = bArr;
    }

    public void setVehicleOemId(String str) {
        this.mVehicleOemId = str;
    }

    public void setVehiclePK(byte[] bArr) {
        this.mVehiclePK = bArr;
    }

    public void setVehiclePkCertificate(byte[] bArr) {
        this.mVehiclePkCertificate = bArr;
    }

    public void setVehiclePropDatOffset(byte[] bArr) {
        this.mVehiclePropDatOffset = bArr;
    }

    public void setVersion(byte[] bArr) {
        this.mVersion = bArr;
    }

    public void setVisibilityWiredPersist(byte b2) {
        if (b2 == 0 || b2 == 1) {
            this.mVisibilityWiredPersist = b2;
        }
    }

    public void setVisibilityWiredVolatile(byte b2) {
        if (b2 == 0 || b2 == 1) {
            this.mVisibilityWiredVolatile = b2;
        }
    }

    public void setVisibilityWlPersist(byte b2) {
        if (b2 == 0 || b2 == 1) {
            this.mVisibilityClPersist = b2;
        }
    }

    public void setVisibilityWlVolatile(byte b2) {
        if (b2 == 0 || b2 == 1) {
            this.mVisibilityClVolatile = b2;
        }
    }

    public void set_key_share_psw_required() {
        this.mKey_share_psw = true;
    }

    public void updateKeyShareEpConfig(byte[] bArr) {
        this.mKeyShareConf = bArr;
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("KeyShare_ep_config : ");
            sb.append(ByteUtils.toHexString(this.mKeyShareConf));
        }
    }

    public void updateMbMapping(byte[] bArr) {
        if (bArr != null) {
            this.mMBMapping = bArr;
        }
    }

    public void updateRoutingInfo(byte[] bArr) {
        this.mRoutingInfo = bArr;
    }

    public void updateWirelessCapbility(byte[] bArr) {
        if (bArr != null) {
            this.mWCC = bArr;
        }
    }

    public byte[] getAuth1ConfidentialMB(Context context, byte[] bArr) {
        if (this.mConfidentMbAuth1 == null) {
            restoreConfigIfNeeded(context, bArr);
        }
        return this.mConfidentMbAuth1;
    }

    public byte[] getAuth1PrivateMB(Context context, byte[] bArr) {
        if (this.mPrivateMbAuth1 == null) {
            restoreConfigIfNeeded(context, bArr);
        }
        return this.mPrivateMbAuth1;
    }

    public byte[] getKeySlot(Context context, byte[] bArr) {
        if (this.mKeySlot == null) {
            restoreConfigIfNeeded(context, bArr);
        }
        return this.mKeySlot;
    }

    public byte[] getVehicleId(Context context, byte[] bArr) {
        if (this.mVehicleId == null) {
            restoreConfigIfNeeded(context, bArr);
        }
        return this.mVehicleId;
    }

    public static byte[] getVehicleId(byte[] bArr) {
        if (bArr == null || bArr.length < 8) {
            bArr = ByteUtils.randomString(8).getBytes();
            if (DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid Vehicle_id, create one: ");
                sb.append(ByteUtils.toHexString(bArr));
            }
        }
        if (DEBUG) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Vehicle_id is: ");
            sb2.append(ByteUtils.toHexString(bArr));
        }
        return bArr;
    }
}
