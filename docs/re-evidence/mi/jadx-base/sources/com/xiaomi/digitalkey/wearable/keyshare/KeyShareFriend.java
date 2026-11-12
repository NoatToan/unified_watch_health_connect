package com.xiaomi.digitalkey.wearable.keyshare;

import android.content.Context;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.digitalkey.ccc.api.DigitalKeyAccessProfile;
import com.xiaomi.digitalkey.ccc.api.DigitalKeyData;
import com.xiaomi.digitalkey.wearable.DeviceConf;
import com.xiaomi.digitalkey.wearable.EPConfig;
import com.xiaomi.digitalkey.wearable.Endpoint;
import com.xiaomi.digitalkey.wearable.TSMProxy;
import com.xiaomi.digitalkey.wearable.WearableSEProxy;
import com.xiaomi.digitalkey.wearable.certificate.EndpointCertificate;
import com.xiaomi.digitalkey.wearable.certificate.InstanceCertificate;
import com.xiaomi.digitalkey.wearable.keytracking.KtsShared;
import com.xiaomi.digitalkey.wearable.storage.DKStorageManager;
import com.xiaomi.digitalkey.wearable.storage.DigitalKeyRecord;
import com.xiaomi.digitalkey.wearable.storage.KeyShareRecord;
import com.xiaomi.digitalkey.wearable.utils.ByteUtils;
import com.xiaomi.digitalkey.wearable.utils.ConstUtils;
import com.xiaomi.digitalkey.wearable.utils.CryptoUtil;
import com.xiaomi.digitalkey.wearable.utils.Logger;
import com.xiaomi.digitalkey.wearable.utils.TLVObject;
import com.xiaomi.digitalkey.wearable.utils.TLVParser;
import com.xiaomi.digitalkey.wearable.utils.VehicleValue;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.m12;
import java.io.IOException;
import java.lang.reflect.Array;
import java.security.InvalidKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class KeyShareFriend {
    private static final boolean ERR = true;
    private static final String LogTag = "SDK-DKF-KeyShareFriend:";
    short ATTESTATION_PACKAGE_OFFSET;
    Context mContext;
    String mDevClaim;
    byte[] mEPCaData;
    byte[] mFriendEndPoint_PK;
    byte[] mFriendlyName;
    String mKeyIdString;
    boolean mKey_tracking_receipt_flag;
    String mMailBoxId;
    byte[] mNotAfter;
    byte[] mNotBefore;
    byte[] mNotificationData;
    boolean mOnline_attestation_deliver_flag;
    public String mPrKey;
    byte[] mPropertyProfile;
    String mSessionId;
    KeyShareRecord mShareRecord;
    String mShareStage;
    int mStandardProfile;
    String mUrlLink;
    String mUrlLinkWithSecret;
    private static final boolean DEBUG = Logger.LOG_SHARE;
    private static String KeyId = "KeyId";
    private static String prKey = "prKey";
    private static String SessionId = "SessionId";
    private static String vehicleOemId = "vehicleOemId";
    public static String SHARE_STAGE_FRIEND_CREATED = "created";
    public String[] authType = {"VehicleActivation"};
    public String[] authOptions = {"ownerKeyActivation", "friendKeyActivation", "keyFobActivation", "sharingPasswordActivation"};
    String mVehicleOemId = null;
    String mVehicleBrandId = null;
    String mVehicleBrandName = null;
    String mVehicleOemUrl = null;
    byte[] mConfidentMbAuth1 = null;
    byte[] mPrivateMbAuth1 = null;
    byte[] mSlotId = null;
    byte[] mVehicleID = null;
    byte[] mInviteData = null;
    Endpoint mEP = new Endpoint();

    public static class DigitalKeyInsufficientSpaceException extends Exception {
        public DigitalKeyInsufficientSpaceException(String str) {
            super(str);
        }
    }

    public static class KeyShareCANotReadyException extends Exception {
        public KeyShareCANotReadyException(String str) {
            super(str);
        }
    }

    public static class KeyShareCreateFailException extends Exception {
        public KeyShareCreateFailException(String str) {
            super(str);
        }
    }

    public static class KeyShareException extends Exception {
        public KeyShareException(String str) {
            super(str);
        }
    }

    public static class KeyShareIOErrorException extends Exception {
        public KeyShareIOErrorException(String str) {
            super(str);
        }
    }

    public static class KeyShareQueryDeletedMailboxException extends Exception {
        public KeyShareQueryDeletedMailboxException(String str) {
            super(str);
        }
    }

    public static class KeyShareQueryOccupiedMailboxException extends Exception {
        public KeyShareQueryOccupiedMailboxException(String str) {
            super(str);
        }
    }

    public static class KeyShareQuerySelfOccupiedMailboxException extends Exception {
        public KeyShareQuerySelfOccupiedMailboxException(String str) {
            super(str);
        }
    }

    public static class KeyShareUpdateDeletedMailboxException extends Exception {
        public KeyShareUpdateDeletedMailboxException(String str) {
            super(str);
        }
    }

    public static class KeyShareUpdateOccupiedMailboxException extends Exception {
        public KeyShareUpdateOccupiedMailboxException(String str) {
            super(str);
        }
    }

    public static class KeyShareUpdateWrongDataException extends Exception {
        public KeyShareUpdateWrongDataException(String str) {
            super(str);
        }
    }

    public static class MailboxNotReadyException extends Exception {
    }

    public static class RetryException extends Exception {
    }

    public KeyShareFriend(Context context) {
        this.mContext = context;
    }

    public static KeyShareFriend handlePushData(Context context, String str) {
        KeyShareRecord keyShareRecord = (KeyShareRecord) loadShareData(context, str);
        if (keyShareRecord == null) {
            return null;
        }
        KeyShareFriend keyShareFriend = keyShareRecord.getShareType().equalsIgnoreCase(KeyShareRecord.SHARE_TYPE_FRIEND) ? new KeyShareFriend(context) : null;
        keyShareFriend.restoreCacheData(keyShareRecord);
        return keyShareFriend;
    }

    public static Object loadShareData(Context context, String str) {
        try {
            return DKStorageManager.loadRecord(context, str);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            StringBuilder sb = new StringBuilder();
            sb.append("load share record fail");
            sb.append(e);
            return null;
        }
    }

    private boolean registerKTS(Context context, byte[] bArr, int i, String str, String str2, String str3, byte[] bArr2) throws KtsShared.RetryKTSException {
        KtsShared ktsShared = new KtsShared(context, str, this.mEP);
        ktsShared.setBrandName(str3);
        ktsShared.setVehicleId(bArr2);
        return ktsShared.sendTrackKeyRequest(bArr, str2);
    }

    public byte[] buildShareErrMessage(byte b2) {
        return new TLVObject(new byte[]{127, 108}, new TLVObject(new byte[]{109}, new byte[]{b2}).toBytes()).toBytes();
    }

    public boolean checkCertChain(byte[] bArr) {
        return true;
    }

    public boolean checkCertificateReady(String str) throws DigitalKeyInsufficientSpaceException {
        if (str == null) {
            return false;
        }
        DeviceConf deviceConf = DeviceConf.getInstance();
        TSMProxy.getInstance().getCAs(str);
        for (int i = 0; i < 60; i++) {
            try {
                if (DEBUG) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("wait server rsp: ");
                    sb.append(i * 500);
                    sb.append("ms");
                }
                Thread.sleep(i * 500);
                if (deviceConf.getInstanceCAFromKeyStore(str) != null && deviceConf.getDevCAFromKeyStore(str) != null) {
                    return true;
                }
            } catch (InterruptedException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Fetch certificate fail ");
                sb2.append(e);
                e.printStackTrace();
                return true;
            }
        }
        return false;
    }

    public void continueCreateDigitalKey() throws DigitalKeyInsufficientSpaceException, KeyShareUpdateOccupiedMailboxException, KeyShareUpdateWrongDataException, KeyShareCreateFailException, KeyShareUpdateDeletedMailboxException, KeyShareException, KeyShareIOErrorException {
        byte[] bArrHandleFriendCreateRequest = handleFriendCreateRequest(this.mInviteData);
        if (ByteUtils.equals(bArrHandleFriendCreateRequest, ConstUtils.SW_SHARE_IO_ERROR)) {
            throw new KeyShareIOErrorException("query mailbox occurs IO error");
        }
        if (ByteUtils.equals(bArrHandleFriendCreateRequest, ConstUtils.SW_UPDATE_MAILBOX_WRONG_DATA)) {
            throw new KeyShareUpdateWrongDataException("update mailbox with wrong param");
        }
        if (ByteUtils.equals(bArrHandleFriendCreateRequest, ConstUtils.SW_UPDATE_MAILBOX_OCCUPIED)) {
            throw new KeyShareUpdateOccupiedMailboxException("update occupied mailbox");
        }
        if (ByteUtils.equals(bArrHandleFriendCreateRequest, ConstUtils.SW_UPDATE_MAILBOX_DELETED)) {
            throw new KeyShareUpdateDeletedMailboxException("update deleted mailbox");
        }
        this.mShareRecord.setStep(3);
        saveShareData(this.mMailBoxId, this.mShareRecord);
    }

    public boolean continueImportDigitalKey() throws KeyShareQueryDeletedMailboxException, RetryException, KeyShareIOErrorException, KtsShared.RetryKTSException, IOException, KeyShareQueryOccupiedMailboxException, MailboxNotReadyException {
        byte[] payloadFromTagNullPossible;
        boolean zCheckRSPSWexpected;
        byte[] bArrQueryMailbox = queryMailbox(this.mDevClaim, this.mUrlLink);
        if (ByteUtils.equals(bArrQueryMailbox, ConstUtils.SW_SHARE_IO_ERROR)) {
            throw new KeyShareIOErrorException("query mailbox occurs IO error");
        }
        if (ByteUtils.equals(bArrQueryMailbox, ConstUtils.SW_QUERY_MAILBOX_OCCUPIED)) {
            throw new KeyShareQueryOccupiedMailboxException("query occupied mailbox");
        }
        if (ByteUtils.equals(bArrQueryMailbox, ConstUtils.SW_QUERY_MAILBOX_DELETED)) {
            throw new KeyShareQueryDeletedMailboxException("query deleted mailbox");
        }
        if (bArrQueryMailbox == null || bArrQueryMailbox.length <= 2) {
            payloadFromTagNullPossible = null;
            zCheckRSPSWexpected = false;
        } else {
            zCheckRSPSWexpected = ByteUtils.checkRSPSWexpected(bArrQueryMailbox, ConstUtils.SW_OK);
            payloadFromTagNullPossible = TLVParser.getPayloadFromTagNullPossible(TLVParser.getPayloadFromTag(bArrQueryMailbox, ConstUtils.TAG_XM_PRIVATE_OUT), ConstUtils.TAG_XPS_MB_PAYLOAD);
        }
        if (payloadFromTagNullPossible == null) {
            throw new RetryException();
        }
        boolean z = DEBUG;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Json pload: ");
            sb.append(new String(payloadFromTagNullPossible));
        }
        byte[] xPSData = getXPSData(payloadFromTagNullPossible, this.mShareRecord.isBase64FormatSecret() ? m12.a(this.mPrKey) : ByteUtils.fromHexString(this.mPrKey));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("queryMailbox: success ");
        sb2.append(zCheckRSPSWexpected);
        sb2.append(" data != null ");
        sb2.append(xPSData != null);
        if (zCheckRSPSWexpected && xPSData != null) {
            byte[] payloadFromTagNullPossible2 = TLVParser.getPayloadFromTagNullPossible(xPSData, ConstUtils.TAG_MB_IMPORT_REQ);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("getPayloadFromTagNullPossible: success ");
            sb3.append(payloadFromTagNullPossible2 != null);
            if (payloadFromTagNullPossible2 != null) {
                byte[] bArrHandleFriendImportRequest = handleFriendImportRequest(payloadFromTagNullPossible2);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("handleFriendImportRequest: success ");
                sb4.append(ByteUtils.checkRSPSWexpected(bArrHandleFriendImportRequest, ConstUtils.SW_OK));
                if (ByteUtils.checkRSPSWexpected(bArrHandleFriendImportRequest, ConstUtils.SW_OK)) {
                    if (z) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("trigger for Friend ");
                        sb5.append(this.mVehicleBrandName);
                    }
                    this.mShareRecord.setStep(4);
                    saveShareData(this.mMailBoxId, this.mShareRecord);
                    boolean zRegisterKTS = registerKTS(this.mContext, ByteUtils.fromHexString(this.mKeyIdString), 1, this.mVehicleOemId, new String(this.mFriendlyName), this.mVehicleBrandName, this.mVehicleID);
                    deleteMailbox(this.mDevClaim, this.mUrlLink);
                    deleteKeyShareData(this.mMailBoxId);
                    return zRegisterKTS;
                }
            } else {
                byte[] payloadFromTagNullPossible3 = TLVParser.getPayloadFromTagNullPossible(xPSData, ConstUtils.TAG_KEY_ERROR_MSG);
                if (payloadFromTagNullPossible3 == null) {
                    throw new MailboxNotReadyException();
                }
                StringBuilder sb6 = new StringBuilder();
                sb6.append("getPayloadFromTagNullPossible: err ");
                sb6.append(ByteUtils.toHexString(payloadFromTagNullPossible3));
            }
        }
        return false;
    }

    public Date convertUTCtoDate(byte[] bArr) {
        String str;
        if (bArr == null || !(bArr.length == 15 || bArr.length == 13)) {
            return new Date();
        }
        if (bArr.length == 15) {
            str = "yyyyMMddHHmmss";
        } else {
            str = bArr.length == 13 ? "yyMMddHHmmss" : null;
        }
        String str2 = new String(ByteUtils.clone(bArr, 0, bArr.length - 1));
        StringBuilder sb = new StringBuilder();
        sb.append(" date is : ");
        sb.append(str2);
        try {
            Date date = new SimpleDateFormat(str).parse(str2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" date is : ");
            sb2.append(date);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
            return new Date();
        }
    }

    public void deleteKeyShareData(String str) {
        try {
            DKStorageManager.removeRecord(this.mContext, str);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void deleteMailbox(String str, String str2) {
        TSMProxy.getInstance().deleteMailbox(new TLVObject(ConstUtils.TAG_XM_PRIVATE_IN, (List<TLVObject>) Arrays.asList(new TLVObject(ConstUtils.TAG_XPS_DEV_CLAIM, str.getBytes()), new TLVObject(ConstUtils.TAG_XPS_MB_URL, str2.getBytes()))).toBytes());
    }

    public void extractEpCreateConf(byte[] bArr, EPConfig ePConfig) {
        TLVParser tLVParser = new TLVParser();
        tLVParser.parse(bArr);
        for (TLVObject tLVObject : tLVParser.getParseResult()) {
            if (tLVObject.getTag()[0] == 70) {
                ePConfig.setTag46(tLVObject.getValue()[0]);
            }
            if (tLVObject.getTag()[0] == 71) {
                ePConfig.setTag47(tLVObject.getValue()[0]);
            }
            if (tLVObject.getTag()[0] == 91) {
                ePConfig.setVehiclePK(tLVObject.getValue());
            }
            if (tLVObject.getTag()[0] == 92) {
                ePConfig.setVersion(tLVObject.getValue());
            }
            if (tLVObject.getTag()[0] == 81) {
                ePConfig.setNotBefore(tLVObject.getValue());
            }
            if (tLVObject.getTag()[0] == 82) {
                ePConfig.setNotAfter(tLVObject.getValue());
            }
            if (tLVObject.getTag()[0] == 73) {
                int length = tLVObject.getLength() / 65;
                boolean z = DEBUG;
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ep conf auth_pk number: ");
                    sb.append(length);
                }
                byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, length, 65);
                if (z) {
                    for (int i = 0; i < length; i++) {
                        System.arraycopy(tLVObject.getValue(), i * length, bArr2[i], 0, 65);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("\n auth_pk[");
                        sb2.append(i);
                        sb2.append("]: ");
                        sb2.append(ByteUtils.toHexString(bArr2[i]));
                    }
                }
                ePConfig.setAuthPk(tLVObject.getValue());
            }
            if (tLVObject.getTag()[0] == 74) {
                ePConfig.setConfMbxSize(tLVObject.getValue());
            }
            if (tLVObject.getTag()[0] == 75) {
                ePConfig.setPrivMbxSize(tLVObject.getValue());
            }
            if (tLVObject.getTag()[0] == 77) {
                ePConfig.setVehicleId(tLVObject.getValue());
            }
            if (tLVObject.getTag()[0] == 78) {
                ePConfig.setKeySlot(tLVObject.getValue());
                this.mSlotId = tLVObject.getValue();
            }
            if (tLVObject.getTag()[0] == 87) {
                ePConfig.setCountLimit(tLVObject.getValue());
            }
        }
    }

    public void extractKeyConfigration(byte[] bArr) {
        int i;
        int i2 = 0;
        if (bArr[0] == 48) {
            if (bArr[1] + 2 != bArr.length) {
                return;
            } else {
                i2 = 2;
            }
        }
        if (bArr[i2] == 2) {
            byte b2 = bArr[i2 + 2];
            int i3 = i2 + 3;
            boolean z = DEBUG;
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("Version: ");
                sb.append((int) b2);
            }
            if (bArr[i3] == 2) {
                byte b3 = bArr[i2 + 5];
                int i4 = i2 + 6;
                if (z) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Version: ");
                    sb2.append((int) b3);
                }
                byte b4 = bArr[i4];
                if (b4 == 10) {
                    this.mStandardProfile = bArr[i2 + 8];
                    i = i2 + 9;
                    if (z) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("mStandardProfile: ");
                        sb3.append(this.mStandardProfile);
                    }
                } else {
                    if (b4 != 4) {
                        return;
                    }
                    int i5 = i2 + 7;
                    this.mPropertyProfile = ByteUtils.clone(bArr, i2 + 8, bArr[i5]);
                    i = i5 + bArr[i5] + 1;
                    if (z) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("mPropertyProfile: ");
                        sb4.append(ByteUtils.toHexString(this.mPropertyProfile));
                    }
                }
                byte b5 = bArr[i];
                if (b5 == 23 || b5 == 24) {
                    int i6 = i + 1;
                    this.mNotBefore = ByteUtils.clone(bArr, i + 2, bArr[i6]);
                    i = i6 + bArr[i6] + 1;
                    if (z) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("not before: ");
                        sb5.append(ByteUtils.toHexString(this.mNotBefore));
                    }
                }
                byte b6 = bArr[i];
                if (b6 == 23 || b6 == 24) {
                    int i7 = i + 1;
                    this.mNotAfter = ByteUtils.clone(bArr, i + 2, bArr[i7]);
                    i = i7 + bArr[i7] + 1;
                    if (z) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("not after: ");
                        sb6.append(ByteUtils.toHexString(this.mNotAfter));
                    }
                }
                if (bArr[i] == 12) {
                    int i8 = i + 1;
                    this.mFriendlyName = ByteUtils.clone(bArr, i + 2, bArr[i8]);
                    byte b7 = bArr[i8];
                    if (z) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("friendly name: ");
                        sb7.append(new String(this.mFriendlyName));
                    }
                }
            }
        }
    }

    public void extractShareConf(byte[] bArr, EPConfig ePConfig) {
        TLVParser tLVParser = new TLVParser();
        tLVParser.parse(bArr);
        for (TLVObject tLVObject : tLVParser.getParseResult()) {
            byte b2 = tLVObject.getTag()[0];
            if (tLVObject.getTag()[0] == -37) {
                this.mKey_tracking_receipt_flag = true;
            }
            if (tLVObject.getTag()[0] == -36) {
                this.mOnline_attestation_deliver_flag = true;
            }
            if (ByteUtils.equals(tLVObject.getTag(), new byte[]{74})) {
                ePConfig.setAuth1ConfidentialMB(tLVObject.getValue());
                this.mConfidentMbAuth1 = tLVObject.getValue();
                if (DEBUG) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("mConfidentMbAuth1 in 7f60: ");
                    sb.append(ByteUtils.toHexString(this.mConfidentMbAuth1));
                }
            }
            if (ByteUtils.equals(tLVObject.getTag(), new byte[]{75})) {
                ePConfig.setAuth1PrivateMB(tLVObject.getValue());
                this.mPrivateMbAuth1 = tLVObject.getValue();
                if (DEBUG) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("mPrivateMbAuth1 in 7f60: ");
                    sb2.append(ByteUtils.toHexString(this.mPrivateMbAuth1));
                }
            }
        }
    }

    public byte[] getAttestationPackage(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = new byte[13];
        byte[] keySlotId = getKeySlotId();
        bArr6[0] = HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION;
        bArr6[1] = 1;
        bArr6[2] = 1;
        bArr6[3] = -110;
        bArr6[4] = 8;
        System.arraycopy(bArr, 0, bArr6, 5, 8);
        byte[] bArrConcatenate = ByteUtils.concatenate(ByteUtils.concatenate(ByteUtils.concatenate(bArr6, ByteUtils.concatenateTLV(ConstUtils.TAG_ATTESTATION_FRND_PK, bArr2)), ByteUtils.concatenateTLV(ConstUtils.TAG_ATTESTATION_ARBITRARY_DATA, bArr5)), ByteUtils.concatenateTLV(ConstUtils.TAG_ATTESTATION_SIG, bArr3));
        if (keySlotId != null) {
            bArrConcatenate = ByteUtils.concatenate(bArrConcatenate, ByteUtils.concatenateTLV(ConstUtils.TAG_EPC_KEY_SLOT_ID, keySlotId));
        }
        if (bArr4 != null) {
            bArrConcatenate = ByteUtils.concatenate(bArrConcatenate, ByteUtils.concatenateTLV(new byte[]{69}, bArr4));
        }
        byte[] bArrConcatenateTLV = ByteUtils.concatenateTLV(ConstUtils.TAG_KEY_ATT_PACKAGE, bArrConcatenate);
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("attestationPackage: ");
            sb.append(ByteUtils.toHexString(bArrConcatenateTLV));
        }
        return bArrConcatenateTLV;
    }

    public DigitalKeyData getDigitalKeyData(byte[] bArr) throws RetryException {
        EPConfig config = this.mEP.getConfig(null);
        TLVParser tLVParser = new TLVParser();
        tLVParser.parse(bArr);
        for (TLVObject tLVObject : tLVParser.getParseResult()) {
            if (ByteUtils.equals(tLVObject.getTag(), ConstUtils.TAG_EP_CONFIG)) {
                extractEpCreateConf(tLVObject.getValue(), config);
            }
            if (ByteUtils.equals(tLVObject.getTag(), ConstUtils.TAG_SHARE_CONF)) {
                extractShareConf(tLVObject.getValue(), config);
            }
            if (ByteUtils.equals(tLVObject.getTag(), ConstUtils.TAG_KEY_CONFIG)) {
                extractKeyConfigration(tLVObject.getValue());
            }
            if (ByteUtils.equals(tLVObject.getTag(), new byte[]{89})) {
                String vehicleOemIdFromRoutingInfo = getVehicleOemIdFromRoutingInfo(tLVObject.getValue());
                this.mVehicleOemId = vehicleOemIdFromRoutingInfo;
                if (DEBUG) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Vehicle oem id: ");
                    sb.append(vehicleOemIdFromRoutingInfo);
                }
            }
        }
        DigitalKeyData digitalKeyData = new DigitalKeyData();
        digitalKeyData.setAccessProfile(new DigitalKeyAccessProfile(this.mStandardProfile));
        digitalKeyData.setFriendlyName(new String(this.mFriendlyName));
        digitalKeyData.setVehicleOemId(this.mVehicleOemId);
        digitalKeyData.setNotAfterTime(convertUTCtoDate(this.mNotAfter));
        digitalKeyData.setNotBeforeTime(convertUTCtoDate(this.mNotBefore));
        digitalKeyData.setVehicleBrandId(this.mVehicleBrandName);
        this.mShareRecord.setShareType(KeyShareRecord.SHARE_TYPE_FRIEND);
        this.mShareRecord.setVehicleOemId(this.mVehicleOemId);
        byte[] bArr2 = this.mFriendlyName;
        if (bArr2 != null) {
            this.mShareRecord.setFriendlyName(new String(bArr2));
        }
        this.mShareRecord.setInviteData(this.mInviteData);
        this.mShareRecord.setStep(1);
        if (DEBUG) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("set keyData done for: ");
            sb2.append(digitalKeyData.getVehicleOemId());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("save record with file: ");
            sb3.append(this.mMailBoxId);
        }
        saveShareData(this.mMailBoxId, this.mShareRecord);
        return digitalKeyData;
    }

    public byte[] getInviteDataFromMailbox() throws KeyShareQueryDeletedMailboxException, RetryException, KeyShareIOErrorException, KeyShareQuerySelfOccupiedMailboxException, InvalidKeyException, KeyShareQueryOccupiedMailboxException {
        byte[] bArrA = m12.a(this.mPrKey);
        if (bArrA.length == 16 || bArrA.length == 32) {
            this.mShareRecord.setSecretFormatType(KeyShareRecord.SECRET_FORMAT_TYPE_BASE64);
        } else {
            this.mShareRecord.setSecretFormatType(KeyShareRecord.SECRET_FORMAT_TYPE_HEX);
            bArrA = ByteUtils.fromHexString(this.mPrKey);
            if (DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("key length is: ");
                sb.append(bArrA.length);
                sb.append(" maybe share from version below 213");
            }
        }
        boolean z = DEBUG;
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("secret: ");
            sb2.append(ByteUtils.toHexString(bArrA));
        }
        byte[] bArrQueryMailbox = queryMailbox(this.mDevClaim, this.mUrlLink);
        if (ByteUtils.equals(bArrQueryMailbox, ConstUtils.SW_SHARE_IO_ERROR)) {
            throw new KeyShareIOErrorException("query mailbox occurs IO error");
        }
        if (ByteUtils.equals(bArrQueryMailbox, ConstUtils.SW_QUERY_MAILBOX_OCCUPIED)) {
            throw new KeyShareQueryOccupiedMailboxException("query occupied mailbox");
        }
        if (ByteUtils.equals(bArrQueryMailbox, ConstUtils.SW_QUERY_MAILBOX_DELETED)) {
            throw new KeyShareQueryDeletedMailboxException("query deleted mailbox");
        }
        if (!ByteUtils.checkRSPSWexpected(bArrQueryMailbox, ConstUtils.SW_OK)) {
            return null;
        }
        byte[] payloadFromTagNullPossible = TLVParser.getPayloadFromTagNullPossible(TLVParser.getPayloadFromTag(bArrQueryMailbox, ConstUtils.TAG_XM_PRIVATE_OUT), ConstUtils.TAG_XPS_MB_PAYLOAD);
        if (payloadFromTagNullPossible == null) {
            throw new RetryException();
        }
        if (z) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Json payload: ");
            sb3.append(new String(payloadFromTagNullPossible));
        }
        byte[] xPSData = getXPSData(payloadFromTagNullPossible, bArrA);
        if (xPSData == null) {
            throw new RetryException();
        }
        byte[] payloadFromTagNullPossible2 = TLVParser.getPayloadFromTagNullPossible(xPSData, ConstUtils.TAG_KYE_CREATE_REQ);
        if (payloadFromTagNullPossible2 != null) {
            return payloadFromTagNullPossible2;
        }
        throw new KeyShareQuerySelfOccupiedMailboxException("query self occupied mailbox");
    }

    public DigitalKeyData getInviteDigitalKeyInformation() throws KeyShareQueryDeletedMailboxException, RetryException, KeyShareIOErrorException, KeyShareQuerySelfOccupiedMailboxException, InvalidKeyException, KeyShareQueryOccupiedMailboxException {
        parseXPSUrl(this.mUrlLinkWithSecret, false);
        boolean z = DEBUG;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("getInviteDigitalKeyInformation with claim: ");
            sb.append(this.mDevClaim);
        }
        byte[] inviteDataFromMailbox = getInviteDataFromMailbox();
        if (inviteDataFromMailbox == null) {
            return null;
        }
        this.mInviteData = inviteDataFromMailbox;
        DigitalKeyData digitalKeyData = getDigitalKeyData(inviteDataFromMailbox);
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("shared digital key Data: ");
            sb2.append(digitalKeyData.getVehicleOemId());
        }
        return digitalKeyData;
    }

    public byte[] getKeyId() {
        return ByteUtils.fromHexString(this.mKeyIdString);
    }

    public byte[] getKeySignRequest() throws IOException, CertificateException {
        byte[] bArrFromHexString = ByteUtils.fromHexString(this.mKeyIdString);
        Endpoint endpoint = this.mEP;
        byte[] deviceCertificate = DeviceConf.getInstance().getDeviceCertificate(this.mVehicleOemId);
        byte[] instanceCertificate = DeviceConf.getInstance().getInstanceCertificate(this.mVehicleOemId);
        if (deviceCertificate == null || instanceCertificate == null) {
            throw new IOException();
        }
        byte[] bArr = this.mEPCaData;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TLVObject(ConstUtils.TAG_DEV_CA, deviceCertificate));
        arrayList.add(new TLVObject(ConstUtils.TAG_INSTANCE_CA, instanceCertificate));
        arrayList.add(new TLVObject(ConstUtils.TAG_EP_CA, bArr));
        byte[] bArrCreateEncryptionKey = endpoint.createEncryptionKey(bArrFromHexString);
        if (bArrCreateEncryptionKey != null) {
            byte[] payloadFromTagNullPossible = TLVParser.getPayloadFromTagNullPossible(bArrCreateEncryptionKey, ConstUtils.TAG_EP_ENC_ATTESTATION);
            if (payloadFromTagNullPossible != null) {
                arrayList.add(new TLVObject(ConstUtils.TAG_EP_ENC_ATTESTATION, payloadFromTagNullPossible));
            } else if (DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fatal! unable to get ep_encrypt data: ");
                sb.append(ByteUtils.toHexString(bArrCreateEncryptionKey));
            }
        }
        byte[] bytes = new TLVObject(ConstUtils.TAG_KEY_SIGN_REQ, arrayList).toBytes();
        if (DEBUG) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("get_key_sign_request new: ");
            sb2.append(ByteUtils.toHexString(bytes));
        }
        return bytes;
    }

    public byte[] getKeySlotId() {
        return null;
    }

    public String getVehicleOemIdFromRoutingInfo(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        String str = new String(bArr);
        boolean z = DEBUG;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Routing Info: ");
            sb.append(str);
        }
        int iIndexOf = str.indexOf(".");
        if (iIndexOf < 0) {
            return null;
        }
        this.mVehicleOemId = str.substring(0, iIndexOf);
        String strSubstring = str.substring(iIndexOf + 1);
        int iIndexOf2 = strSubstring.indexOf(".");
        if (iIndexOf2 < 0) {
            return null;
        }
        strSubstring.substring(0, iIndexOf2);
        this.mVehicleBrandName = strSubstring.substring(iIndexOf2 + 1);
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Routing Info: Brand ");
            sb2.append(this.mVehicleBrandName);
        }
        return this.mVehicleOemId;
    }

    public byte[] getXPSData(byte[] bArr, byte[] bArr2) {
        GenericSharingData genericSharingDataCreateFromXPSEncryptedData = GenericSharingData.createFromXPSEncryptedData(bArr, bArr2);
        if (genericSharingDataCreateFromXPSEncryptedData == null) {
            return null;
        }
        return genericSharingDataCreateFromXPSEncryptedData.getSharingData();
    }

    public byte[] getXPSNotificationData() {
        byte[] payloadFromTagNullPossible = TLVParser.getPayloadFromTagNullPossible(TLVParser.getPayloadFromTag(TSMProxy.getInstance().getXPSNotificationData(), ConstUtils.TAG_XM_PRIVATE_OUT), ConstUtils.TAG_XPS_PUSH_NOTIFICATION_TOKEN);
        this.mNotificationData = payloadFromTagNullPossible;
        return payloadFromTagNullPossible;
    }

    public byte[] handleFriendCreateRequest(byte[] bArr) throws DigitalKeyInsufficientSpaceException, KeyShareCreateFailException, KeyShareException {
        byte b2;
        byte[] bArrBuildShareErrMessage;
        boolean z = false;
        try {
            parseKeyCreateRequest(bArr);
            bArrBuildShareErrMessage = getKeySignRequest();
            z = true;
        } catch (Endpoint.EndpointExistException unused) {
            b2 = -1;
            bArrBuildShareErrMessage = buildShareErrMessage(b2);
        } catch (Endpoint.EndpointTerminatedNetworkException e) {
            e = e;
            throw new KeyShareCreateFailException(e.toString());
        } catch (KeyShareCANotReadyException unused2) {
            b2 = 7;
            bArrBuildShareErrMessage = buildShareErrMessage(b2);
        } catch (IOException e2) {
            e = e2;
            throw new KeyShareCreateFailException(e.toString());
        } catch (CertificateException unused3) {
            b2 = 6;
            bArrBuildShareErrMessage = buildShareErrMessage(b2);
        }
        GenericSharingData genericSharingData = new GenericSharingData();
        genericSharingData.setSharingData(ByteUtils.toHexString(bArrBuildShareErrMessage));
        genericSharingData.setSharingDataType(2);
        genericSharingData.setFriendKeyId(this.mKeyIdString);
        genericSharingData.setAuthType(this.authType);
        genericSharingData.setActivationOptions(this.authOptions);
        byte[] bArrUpdateMailbox = updateMailbox(this.mDevClaim, this.mUrlLink, genericSharingData);
        if (z) {
            return bArrUpdateMailbox;
        }
        throw new KeyShareCreateFailException("create fail");
    }

    public byte[] handleFriendImportRequest(byte[] bArr) throws RetryException, IOException {
        return parseImportRequest(bArr);
    }

    public byte[] parseImportRequest(byte[] bArr) throws RetryException, IOException {
        if (this.mKeyIdString == null) {
            return ConstUtils.SW_NO_MEM;
        }
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("Import settings for keyid:");
            sb.append(this.mKeyIdString);
            sb.append("\n data:");
            sb.append(ByteUtils.toHexString(bArr));
        }
        byte[] bArrFromHexString = ByteUtils.fromHexString(this.mKeyIdString);
        TLVParser tLVParser = new TLVParser();
        tLVParser.parse(bArr);
        Iterator<TLVObject> it = tLVParser.getParseResult().iterator();
        byte[] value = null;
        byte[] value2 = null;
        byte[] value3 = null;
        byte[] value4 = null;
        byte[] value5 = null;
        byte[] value6 = null;
        byte[] value7 = null;
        byte[] value8 = null;
        while (it.hasNext()) {
            TLVObject next = it.next();
            if (ByteUtils.equals(next.getTag(), ConstUtils.TAG_REC_EP_KEY_ATTESTATION)) {
                value3 = next.getValue();
                TLVParser tLVParser2 = new TLVParser();
                tLVParser2.parse(value3);
                for (TLVObject tLVObject : tLVParser2.getParseResult()) {
                    Iterator<TLVObject> it2 = it;
                    if (ByteUtils.equals(tLVObject.getTag(), ConstUtils.TAG_ATTESTATION_RANDOM)) {
                        value = tLVObject.getValue();
                    }
                    if (ByteUtils.equals(tLVObject.getTag(), ConstUtils.TAG_ATTESTATION_FRND_PK)) {
                        value4 = tLVObject.getValue();
                    }
                    if (ByteUtils.equals(tLVObject.getTag(), ConstUtils.TAG_ATTESTATION_SIG)) {
                        value7 = tLVObject.getValue();
                    }
                    if (ByteUtils.equals(tLVObject.getTag(), ConstUtils.TAG_ATTESTATION_ARBITRARY_DATA)) {
                        value8 = tLVObject.getValue();
                    }
                    it = it2;
                }
            }
            Iterator<TLVObject> it3 = it;
            if (ByteUtils.equals(next.getTag(), ConstUtils.TAG_MB_MAPPING)) {
                value2 = next.getValue();
            }
            if (ByteUtils.equals(next.getTag(), new byte[]{74})) {
                value5 = next.getValue();
            }
            if (ByteUtils.equals(next.getTag(), new byte[]{-105})) {
                value6 = next.getValue();
            }
            if (ByteUtils.equals(next.getTag(), new byte[]{127, 73})) {
                updateWlCapbility(bArrFromHexString, next.getValue());
            }
            it = it3;
        }
        if (value2 == null) {
            return ConstUtils.SW_NO_MEM;
        }
        tLVParser.parse(value2);
        List<TLVObject> parseResult = tLVParser.getParseResult();
        EPConfig config = this.mEP.getConfig(bArrFromHexString);
        for (TLVObject tLVObject2 : parseResult) {
            if (tLVObject2.getTag()[0] == -48) {
                config.setSigBmpOffset(tLVObject2.getValue());
            }
            if (tLVObject2.getTag()[0] == -47) {
                config.setMbxEndOffset(tLVObject2.getValue());
            }
            if (tLVObject2.getTag()[0] == -46) {
                config.setImmtokenLen(tLVObject2.getValue());
            }
            if (tLVObject2.getTag()[0] == -64) {
                config.setSlotIdentBmpOffset(tLVObject2.getValue());
            }
            if (tLVObject2.getTag()[0] == -63) {
                config.setSlotIdentLstOffest(tLVObject2.getValue());
            }
            if (tLVObject2.getTag()[0] == -62) {
                config.setVehiclePropDatOffset(tLVObject2.getValue());
            }
            if (tLVObject2.getTag()[0] == -61) {
                config.setKeyAttOffset(tLVObject2.getValue());
                this.ATTESTATION_PACKAGE_OFFSET = (short) ByteUtils.stream2len(tLVObject2.getValue());
                if (DEBUG) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ATTESTATION_PACKAGE_OFFSET: ");
                    sb2.append((int) this.ATTESTATION_PACKAGE_OFFSET);
                }
            }
        }
        config.flushLongTermConfig(this.mContext, bArrFromHexString);
        if (value3 == null || value == null || value4 == null || value7 == null) {
            return ConstUtils.SW_NO_MEM;
        }
        byte[] attestationPackage = getAttestationPackage(value, value4, value7, null, value8);
        if (attestationPackage == null) {
            return ConstUtils.SW_NO_MEM;
        }
        Endpoint endpoint = this.mEP;
        try {
            endpoint.openSe();
            endpoint.selectCccApplet();
            if (!ByteUtils.equals(ConstUtils.SW_OK, endpoint.writeKeyAttSig(bArrFromHexString, this.ATTESTATION_PACKAGE_OFFSET, attestationPackage))) {
                throw new RetryException();
            }
            endpoint.setPrivateMailboxBit(bArrFromHexString, ConstUtils.ATTESTATION_PACKAGE_BIT, ConstUtils.SIGNALING_BITMAP_OFFSET);
            if (value5 != null && value6 != null) {
                try {
                    endpoint.setConfidentialData(bArrFromHexString, 0, value6, value5);
                } catch (WearableSEProxy.AppletNotFoundException unused) {
                    throw new RetryException();
                }
            }
            byte[] bArr2 = this.mConfidentMbAuth1;
            if (bArr2 != null || this.mPrivateMbAuth1 != null) {
                if (bArr2 != null) {
                    endpoint.getConfig(bArrFromHexString).setAuth1ConfidentialMB(this.mConfidentMbAuth1);
                }
                if (this.mPrivateMbAuth1 != null) {
                    endpoint.getConfig(bArrFromHexString).setAuth1PrivateMB(this.mPrivateMbAuth1);
                }
                endpoint.setupEndpoint(bArrFromHexString);
            }
            endpoint.setPrivateMailboxBit(bArrFromHexString, ConstUtils.SLOT_IDENTIFIER_BITMAP_BIT, ConstUtils.SLOT_IDENTIFIER_BITMAP_OFFSET);
            byte[] bArr3 = ConstUtils.SW_OK;
            endpoint.deselectSe();
            return bArr3;
        } catch (Throwable th) {
            endpoint.deselectSe();
            throw th;
        }
    }

    public void parseKeyCreateRequest(byte[] bArr) throws DigitalKeyInsufficientSpaceException, KeyShareException, KeyShareCANotReadyException, Endpoint.EndpointTerminatedNetworkException, IOException, CertificateException, Endpoint.EndpointExistException {
        if (bArr == null) {
            throw new KeyShareException("Fatal No payload data!");
        }
        Endpoint endpoint = this.mEP;
        EPConfig ePConfig = new EPConfig();
        endpoint.setConfig(ePConfig);
        TLVParser tLVParser = new TLVParser();
        tLVParser.parse(bArr);
        String vehicleOemIdFromRoutingInfo = null;
        for (TLVObject tLVObject : tLVParser.getParseResult()) {
            if (ByteUtils.equals(tLVObject.getTag(), ConstUtils.TAG_EP_CONFIG)) {
                extractEpCreateConf(tLVObject.getValue(), ePConfig);
            }
            if (ByteUtils.equals(tLVObject.getTag(), ConstUtils.TAG_SHARE_CONF)) {
                extractShareConf(tLVObject.getValue(), ePConfig);
            }
            if (ByteUtils.equals(tLVObject.getTag(), ConstUtils.TAG_KEY_CONFIG)) {
                extractKeyConfigration(tLVObject.getValue());
            }
            if (ByteUtils.equals(tLVObject.getTag(), new byte[]{89})) {
                vehicleOemIdFromRoutingInfo = getVehicleOemIdFromRoutingInfo(tLVObject.getValue());
                this.mVehicleOemId = vehicleOemIdFromRoutingInfo;
                if (DEBUG) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Vehicle oem id: ");
                    sb.append(vehicleOemIdFromRoutingInfo);
                }
            }
            if (ByteUtils.equals(tLVObject.getTag(), new byte[]{74})) {
                ePConfig.setAuth1ConfidentialMB(tLVObject.getValue());
                this.mConfidentMbAuth1 = tLVObject.getValue();
                if (DEBUG) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("mConfidentMbAuth1 : ");
                    sb2.append(ByteUtils.toHexString(this.mConfidentMbAuth1));
                }
            }
            if (ByteUtils.equals(tLVObject.getTag(), new byte[]{75})) {
                ePConfig.setAuth1PrivateMB(tLVObject.getValue());
                this.mPrivateMbAuth1 = tLVObject.getValue();
                if (DEBUG) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("mPrivateMbAuth1 : ");
                    sb3.append(ByteUtils.toHexString(this.mPrivateMbAuth1));
                }
            }
        }
        if (!checkCertificateReady(vehicleOemIdFromRoutingInfo)) {
            throw new KeyShareCANotReadyException("Certificate is not ready");
        }
        if (checkCertChain(ePConfig.getAuthPk())) {
            updateFriendConfig(ePConfig);
        }
        if (endpoint.deleteEndpointIfDuplicateVehicleId(this.mContext, ePConfig.getVehicleId(), 1)) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("find and delete duplicate key for same vehicle: ");
            sb4.append(this.mVehicleOemId);
        }
        this.mEPCaData = endpoint.createShare();
        EndpointCertificate endpointCertificate = new EndpointCertificate(this.mEPCaData);
        byte[] keyIdentifier = endpointCertificate.getKeyIdentifier();
        String hexString = ByteUtils.toHexString(keyIdentifier);
        this.mKeyIdString = hexString;
        ePConfig.setKeyIdentifier(hexString);
        ePConfig.setKeyType(Constants.KEY_TYPE_SHARED);
        ePConfig.setBrandName(this.mVehicleBrandName);
        ePConfig.setVehicleOemId(this.mVehicleOemId);
        VehicleValue value = ConstUtils.getValue(this.mVehicleBrandName);
        if (value != null) {
            this.mVehicleBrandId = value.getVehicleBrandId();
        }
        ePConfig.setBrandId(ByteUtils.fromHexString(this.mVehicleBrandId));
        ePConfig.flushLongTermConfig(this.mContext, keyIdentifier);
        updateSlotId(this.mSlotId, ByteUtils.toHexString(keyIdentifier));
        if (DEBUG) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("create frnd key id:");
            sb5.append(this.mKeyIdString);
        }
        this.mShareRecord.setKeyId(this.mKeyIdString);
        this.mShareRecord.setShareType(KeyShareRecord.SHARE_TYPE_FRIEND);
        this.mShareRecord.setVehicleOemId(this.mVehicleOemId);
        this.mShareRecord.setVehicleBrandId(this.mVehicleBrandId);
        this.mShareRecord.setVehicleBrandName(this.mVehicleBrandName);
        this.mShareRecord.setShareStage(SHARE_STAGE_FRIEND_CREATED);
        this.mShareRecord.setConfidentMbAuth1(this.mConfidentMbAuth1);
        this.mShareRecord.setPrivateMbAuth1(this.mPrivateMbAuth1);
        this.mShareRecord.setVehicleID(ePConfig.getVehicleId());
        this.mShareRecord.setStep(2);
        byte[] bArr2 = this.mFriendlyName;
        if (bArr2 != null) {
            this.mShareRecord.setFriendlyName(new String(bArr2));
        }
        this.mShareRecord.setDeviceClaim(this.mDevClaim);
        this.mFriendEndPoint_PK = endpointCertificate.getPublicKeyBytes();
        saveShareData(this.mMailBoxId, this.mShareRecord);
    }

    public void parseXPSUrl(String str, boolean z) {
        boolean z2 = DEBUG;
        if (z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("parseXPSUrl: ");
            sb.append(str);
        }
        int iIndexOf = str.indexOf("?v=c#");
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 5);
        String strSubstring3 = strSubstring.substring(str.indexOf("/m/") + 3);
        this.mUrlLink = strSubstring;
        this.mPrKey = strSubstring2;
        this.mMailBoxId = strSubstring3;
        if (!z) {
            KeyShareRecord keyShareRecord = (KeyShareRecord) loadShareData(this.mContext, strSubstring3);
            this.mDevClaim = keyShareRecord != null ? keyShareRecord.getDeviceClaim() : UUID.randomUUID().toString();
        }
        if (z2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mMailBoxId: ");
            sb2.append(str);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("mDevClaim: ");
            sb3.append(this.mDevClaim);
        }
        KeyShareRecord keyShareRecord2 = new KeyShareRecord(this.mDevClaim);
        this.mShareRecord = keyShareRecord2;
        keyShareRecord2.setSecret(strSubstring2);
        this.mShareRecord.setUrl(this.mUrlLink);
        this.mShareRecord.setMailboxId(strSubstring3);
    }

    public boolean queryImportRequest() throws KeyShareQueryDeletedMailboxException, KeyShareIOErrorException, MailboxNotReadyException {
        byte[] payloadFromTagNullPossible;
        boolean zCheckRSPSWexpected;
        byte[] bArrQueryMailbox = queryMailbox(this.mDevClaim, this.mUrlLink);
        if (ByteUtils.equals(bArrQueryMailbox, ConstUtils.SW_SHARE_IO_ERROR)) {
            throw new KeyShareIOErrorException("query mailbox occurs IO error");
        }
        if (ByteUtils.equals(bArrQueryMailbox, ConstUtils.SW_QUERY_MAILBOX_DELETED)) {
            throw new KeyShareQueryDeletedMailboxException("query deleted mailbox");
        }
        if (bArrQueryMailbox == null || bArrQueryMailbox.length <= 2) {
            payloadFromTagNullPossible = null;
            zCheckRSPSWexpected = false;
        } else {
            zCheckRSPSWexpected = ByteUtils.checkRSPSWexpected(bArrQueryMailbox, ConstUtils.SW_OK);
            payloadFromTagNullPossible = TLVParser.getPayloadFromTagNullPossible(TLVParser.getPayloadFromTag(bArrQueryMailbox, ConstUtils.TAG_XM_PRIVATE_OUT), ConstUtils.TAG_XPS_MB_PAYLOAD);
        }
        if (payloadFromTagNullPossible != null) {
            if (DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("Json payload: ");
                sb.append(new String(payloadFromTagNullPossible));
            }
            byte[] xPSData = getXPSData(payloadFromTagNullPossible, this.mShareRecord.isBase64FormatSecret() ? m12.a(this.mPrKey) : ByteUtils.fromHexString(this.mPrKey));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("queryMailbox: success ");
            sb2.append(zCheckRSPSWexpected);
            sb2.append(" data != null ");
            sb2.append(xPSData != null);
            if (xPSData != null) {
                byte[] payloadFromTagNullPossible2 = TLVParser.getPayloadFromTagNullPossible(xPSData, ConstUtils.TAG_MB_IMPORT_REQ);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("getPayloadFromTagNullPossible: success ");
                sb3.append(payloadFromTagNullPossible2 != null);
                if (payloadFromTagNullPossible2 != null) {
                    return true;
                }
                byte[] payloadFromTagNullPossible3 = TLVParser.getPayloadFromTagNullPossible(xPSData, ConstUtils.TAG_KEY_ERROR_MSG);
                if (payloadFromTagNullPossible3 == null) {
                    throw new MailboxNotReadyException();
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("getPayloadFromTagNullPossible: err ");
                sb4.append(ByteUtils.toHexString(payloadFromTagNullPossible3));
            }
        }
        return false;
    }

    public byte[] queryMailbox(String str, String str2) {
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("queryMailbox: ");
            sb.append(str2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("claim: ");
            sb2.append(str);
        }
        return TSMProxy.getInstance().queryMailbox(new TLVObject(ConstUtils.TAG_XM_PRIVATE_IN, (List<TLVObject>) Arrays.asList(new TLVObject(ConstUtils.TAG_XPS_DEV_CLAIM, str.getBytes()), new TLVObject(ConstUtils.TAG_XPS_MB_URL, str2.getBytes()))).toBytes());
    }

    public void restoreCacheData(KeyShareRecord keyShareRecord) {
        this.mPrKey = keyShareRecord.getSecret();
        this.mUrlLink = keyShareRecord.getUrl();
        this.mDevClaim = keyShareRecord.getDeviceClaim();
        this.mNotificationData = keyShareRecord.getNotificationData();
        this.mVehicleOemId = keyShareRecord.getVehicleOemId();
        this.mMailBoxId = keyShareRecord.getMailboxId();
        this.mInviteData = keyShareRecord.getInviteData();
        this.mVehicleBrandId = keyShareRecord.getVehicleBrandId();
        this.mVehicleBrandName = keyShareRecord.getVehicleBrandName();
        String friendlyName = keyShareRecord.getFriendlyName();
        this.mKeyIdString = keyShareRecord.getKeyId();
        this.mConfidentMbAuth1 = keyShareRecord.getConfidentMbAuth1();
        this.mPrivateMbAuth1 = keyShareRecord.getPrivateMbAuth1();
        if (friendlyName != null) {
            this.mFriendlyName = friendlyName.getBytes();
        } else {
            this.mFriendlyName = "MyCar".getBytes();
        }
        this.mVehicleID = keyShareRecord.getVehicleID();
        this.mShareStage = keyShareRecord.getShareStage();
        this.mShareRecord = keyShareRecord;
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("restore data for Friend: ");
            sb.append(keyShareRecord.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("restore invite data for Friend: ");
            sb2.append(ByteUtils.toHexString(this.mInviteData));
        }
    }

    public void saveShareData(String str, Object obj) {
        try {
            DKStorageManager.saveRecord(this.mContext, obj, str);
            if ((obj instanceof KeyShareRecord) && DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("Save share record successful!");
                sb.append(((KeyShareRecord) obj).toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Save share record fail!");
            sb2.append(e);
        }
    }

    public X509Certificate selectInstanceCa(String str) throws CertificateException {
        return DeviceConf.getInstance().getInstanceCA(str);
    }

    public void updateFriendConfig(EPConfig ePConfig) throws CertificateException {
        ePConfig.setInstanceCAId(new InstanceCertificate(selectInstanceCa(this.mVehicleOemId)).getInstanceCAId().getBytes());
        ePConfig.setAuthPk(null);
        byte[] bArr = this.mNotAfter;
        if (bArr != null) {
            ePConfig.setNotAfter(bArr);
        }
        byte[] bArr2 = this.mNotBefore;
        if (bArr2 != null) {
            ePConfig.setNotBefore(bArr2);
        }
        byte[] bArr3 = this.mFriendlyName;
        if (bArr3 != null) {
            ePConfig.setFriendlyName(new String(bArr3));
        }
        ePConfig.createEpId(ConstUtils.DK_TYPE_FRND);
    }

    public byte[] updateMailbox(String str, String str2, GenericSharingData genericSharingData) {
        TSMProxy tSMProxy = TSMProxy.getInstance();
        String jsonString = genericSharingData.toJsonString();
        boolean z = DEBUG;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("update Mailbox, Json Data: ");
            sb.append(jsonString);
        }
        byte[] bArrA = this.mShareRecord.isBase64FormatSecret() ? m12.a(this.mPrKey) : ByteUtils.fromHexString(this.mPrKey);
        byte[] bArrEncyptShareData = CryptoUtil.encyptShareData(jsonString.getBytes(), bArrA);
        String str3 = bArrA.length == 16 ? "AEAD_AES_128_GCM" : "AEAD_AES_256_GCM";
        String strByteArrytoXPSString = ByteUtils.byteArrytoXPSString(bArrEncyptShareData, str3);
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("updateMailbox: ");
            sb2.append(str2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("claim: ");
            sb3.append(str);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("aesType: ");
            sb4.append(str3);
        }
        byte[] xPSNotificationData = this.mNotificationData;
        if (xPSNotificationData == null) {
            xPSNotificationData = getXPSNotificationData();
        }
        if (z) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("update Mailbox, Token Data: ");
            sb5.append(ByteUtils.toHexString(xPSNotificationData));
        }
        return tSMProxy.updateMailbox(new TLVObject(ConstUtils.TAG_XM_PRIVATE_IN, (List<TLVObject>) Arrays.asList(new TLVObject(ConstUtils.TAG_XPS_DEV_CLAIM, str.getBytes()), new TLVObject(ConstUtils.TAG_XPS_MB_PAYLOAD, strByteArrytoXPSString.getBytes()), new TLVObject(ConstUtils.TAG_XPS_MB_URL, str2.getBytes()), new TLVObject(ConstUtils.TAG_XPS_PUSH_NOTIFICATION_TOKEN, xPSNotificationData))).toBytes());
    }

    public void updateSlotId(byte[] bArr, String str) {
        try {
            DigitalKeyRecord digitalKeyRecord = (DigitalKeyRecord) DKStorageManager.loadRecord(this.mContext, str);
            digitalKeyRecord.setSlotId(ByteUtils.toHexString(bArr));
            DKStorageManager.saveRecord(this.mContext, digitalKeyRecord, str);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void updateWlCapbility(byte[] bArr, byte[] bArr2) {
        TLVParser tLVParser = new TLVParser();
        tLVParser.parse(bArr2);
        List<TLVObject> parseResult = tLVParser.getParseResult();
        EPConfig config = this.mEP.getConfig(bArr);
        for (TLVObject tLVObject : parseResult) {
            ByteUtils.equals(tLVObject.getTag(), ConstUtils.TAG_NFC_CAPBLITY);
            ByteUtils.equals(tLVObject.getTag(), ConstUtils.TAG_UWB_CAPBLITY);
            if (ByteUtils.equals(tLVObject.getTag(), ConstUtils.TAG_BLE_CAPBLITY)) {
                TLVParser tLVParser2 = new TLVParser();
                tLVParser2.parse(tLVObject.getValue());
                for (TLVObject tLVObject2 : tLVParser2.getParseResult()) {
                    if (tLVObject2.getTag()[0] == -48) {
                        config.setIRK(tLVObject2.getValue());
                        if (DEBUG) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("BLE IRK ");
                            sb.append(ByteUtils.toHexString(tLVObject2.getValue()));
                        }
                    }
                    if (tLVObject2.getTag()[0] == -47) {
                        config.setBTADDR(tLVObject2.getValue());
                        if (DEBUG) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("BLE addr: ");
                            sb2.append(ByteUtils.toHexString(tLVObject2.getValue()));
                        }
                    }
                    byte b2 = tLVObject2.getTag()[0];
                    if (tLVObject2.getTag()[0] == -45) {
                        config.setKBleMaster(tLVObject2.getValue());
                        if (DEBUG) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("BLE oob: ");
                            sb3.append(ByteUtils.toHexString(tLVObject2.getValue()));
                        }
                    }
                    if (tLVObject2.getTag()[0] == -44) {
                        config.setKBleIntro(tLVObject2.getValue());
                        if (DEBUG) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("BLE intro: ");
                            sb4.append(ByteUtils.toHexString(tLVObject2.getValue()));
                        }
                    }
                }
            }
        }
    }

    public KeyShareFriend(Context context, String str) {
        this.mContext = context;
        this.mSessionId = str;
        this.mUrlLinkWithSecret = str;
    }
}
