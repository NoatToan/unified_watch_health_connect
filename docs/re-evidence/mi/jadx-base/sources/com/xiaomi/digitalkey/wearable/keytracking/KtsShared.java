package com.xiaomi.digitalkey.wearable.keytracking;

import android.content.Context;
import android.os.Build;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.digitalkey.wearable.DeviceConf;
import com.xiaomi.digitalkey.wearable.EPConfig;
import com.xiaomi.digitalkey.wearable.Endpoint;
import com.xiaomi.digitalkey.wearable.TSMProxy;
import com.xiaomi.digitalkey.wearable.storage.DKStorageManager;
import com.xiaomi.digitalkey.wearable.storage.DigitalKeyRecord;
import com.xiaomi.digitalkey.wearable.utils.ByteUtils;
import com.xiaomi.digitalkey.wearable.utils.ConstUtils;
import com.xiaomi.digitalkey.wearable.utils.CryptoUtil;
import com.xiaomi.digitalkey.wearable.utils.IECDHAlgorithm;
import com.xiaomi.digitalkey.wearable.utils.Logger;
import com.xiaomi.digitalkey.wearable.utils.TLVObject;
import com.xiaomi.digitalkey.wearable.utils.TLVParser;
import com.xiaomi.digitalkey.wearable.utils.VehicleValue;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.m12;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.crypto.KeyAgreement;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class KtsShared {
    private static final boolean ERR = true;
    private static final String LogTag = "SDK-DKF-KtsShared:";
    String mBrandName;
    Context mContext;
    private Endpoint mEndpoint;
    byte[] mFriendlyName;
    byte[] mKeyId;
    byte[] mVehicleId;
    String mVehicleOemId;
    private static final boolean DEBUG = Logger.LOG_KTS;
    public static Object seLock = new Object();
    final int KTS_CODE_SUCCESS = 0;
    final int KTS_CODE_NO_RESPONSE = 1;
    final int KTS_CODE_INVALID_RESPONSE = 2;
    final int KTS_CODE_CRYPTOGRAPHY_ERR = 3;
    final int KTS_CODE_SE_ERR = 4;
    final String KTS_MSG_SUCCESS = "SUCCESS";
    final String KTS_MSG_NO_RESPONSE = "NO RESPONSE";
    final String KTS_MSG_INVALID_RESPONSE = "INVALID RESPONSE";
    final String KTS_MSG_CRYPTOGRAPHY_ERR = "CRYPTOGRAPHY ERROR";
    final String KTS_MSG_SE_ERR = "WRITE MAILBOX FAILED";
    final String KEY_STATUS_TSM_INVISIABLE = "TSM_INVISIABLE";
    final String KEY_STATUS_TSM_VISIABLE = "TSM_VISIABLE";
    final String KEY_STATUS_TSM_START_REPORT = "TSM_START_REPORT";
    KeyPair mEphemeralKp = null;

    public class KtsDecryptFailException extends Exception {
        public KtsDecryptFailException(String str) {
            super(str);
        }
    }

    public class KtsFailException extends Exception {
        public KtsFailException(String str) {
            super(str);
        }
    }

    public class KtsResponse {
        byte[] mKtsSignature;
        byte[] mSlotId;

        public KtsResponse(byte[] bArr, byte[] bArr2) throws KtsDecryptFailException, KtsFailException, IOException {
            parseRsp(bArr, bArr2);
        }

        public void parseRsp(byte[] bArr, byte[] bArr2) throws KtsDecryptFailException, KtsFailException, IOException {
            byte[] bytes;
            StringBuilder sb;
            String hexString;
            StringBuilder sb2;
            byte[] payloadFromTagNullPossible = TLVParser.getPayloadFromTagNullPossible(bArr2, ConstUtils.TAG_XM_PRIVATE_OUT);
            if (payloadFromTagNullPossible == null) {
                throw KtsShared.this.new KtsFailException("Null resp Data");
            }
            TLVParser tLVParser = new TLVParser();
            tLVParser.parse(payloadFromTagNullPossible);
            byte[] bArrFromHexString = null;
            byte[] bArrA = null;
            byte[] bArrFromHexString2 = null;
            byte[] bArrFromHexString3 = null;
            for (TLVObject tLVObject : tLVParser.getParseResult()) {
                if (ByteUtils.equals(tLVObject.getTag(), ConstUtils.TAG_KTS_SIG)) {
                    byte[] value = tLVObject.getValue();
                    this.mKtsSignature = value;
                    if (KtsShared.DEBUG) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Get kts_sig!");
                        sb3.append(ByteUtils.toHexString(value));
                    }
                }
                if (ByteUtils.equals(tLVObject.getTag(), ConstUtils.TAG_VEHICLE_MOBILIZATION_DATA)) {
                    byte[] value2 = tLVObject.getValue();
                    boolean unused = KtsShared.DEBUG;
                    try {
                        JSONObject jSONObject = new JSONObject(new String(value2));
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            String string = jSONObject.getString(next);
                            if (next.equalsIgnoreCase("data")) {
                                if (KtsShared.DEBUG) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("vehicleMobilizationData: data: ");
                                    sb4.append(string);
                                }
                                bArrA = m12.a(string);
                                if (KtsShared.DEBUG) {
                                    sb2 = new StringBuilder();
                                    sb2.append("vehicleMobilizationData: data: ");
                                    string = ByteUtils.toHexString(bArrA);
                                    sb2.append(string);
                                }
                            } else if (next.equalsIgnoreCase("publicKeyHash")) {
                                bArrFromHexString3 = ByteUtils.fromHexString(string);
                                if (KtsShared.DEBUG) {
                                    sb2 = new StringBuilder();
                                    sb2.append("publicKeyHash: ");
                                    sb2.append(string);
                                }
                            } else if (next.equalsIgnoreCase("ephemeralPublicKey")) {
                                bArrFromHexString2 = ByteUtils.fromHexString(string);
                                if (KtsShared.DEBUG) {
                                    sb2 = new StringBuilder();
                                    sb2.append("ephemeralPublicKey: ");
                                    string = ByteUtils.toHexString(bArrFromHexString2);
                                    sb2.append(string);
                                }
                            } else if (next.equalsIgnoreCase("version") && KtsShared.DEBUG) {
                                sb2 = new StringBuilder();
                                sb2.append("version:  ");
                                sb2.append(string);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
            byte[] eCPKHex = CryptoUtil.getECPKHex(DeviceConf.getInstance().getDevEncPubKey());
            if (bArrA == null || bArrFromHexString2 == null || !(CryptoUtil.isPkValid(bArrFromHexString2, bArrFromHexString3) || CryptoUtil.isPkValid(eCPKHex, bArrFromHexString3))) {
                boolean unused2 = KtsShared.DEBUG;
                return;
            }
            byte[] bArrDevDecrypt = KtsShared.this.devDecrypt(bArrA, KtsShared.this.derive_decrypt_keyMaterial(bArrFromHexString2));
            if (KtsShared.DEBUG) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Get plait_vehicle_mobi_data:");
                sb5.append(new String(bArrDevDecrypt));
            }
            if (bArrDevDecrypt == null) {
                throw KtsShared.this.new KtsDecryptFailException("Null resp Data");
            }
            try {
                JSONObject jSONObject2 = new JSONObject(new String(bArrDevDecrypt));
                Iterator<String> itKeys2 = jSONObject2.keys();
                bytes = null;
                while (itKeys2.hasNext()) {
                    try {
                        String next2 = itKeys2.next();
                        String string2 = jSONObject2.getString(next2);
                        if (KtsShared.DEBUG) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("key name : ");
                            sb6.append(next2);
                            sb6.append(" value : ");
                            sb6.append(string2);
                        }
                        if (next2.equalsIgnoreCase("slotIdentifier")) {
                            bArrFromHexString = ByteUtils.fromHexString(string2);
                            this.mSlotId = bArrFromHexString;
                            if (KtsShared.DEBUG) {
                                sb = new StringBuilder();
                                sb.append("slot id: ");
                                hexString = ByteUtils.toHexString(bArrFromHexString);
                                sb.append(hexString);
                            }
                        } else if (next2.equalsIgnoreCase("confidentialMailboxData")) {
                            bytes = string2.getBytes();
                            if (KtsShared.DEBUG) {
                                sb = new StringBuilder();
                                sb.append("confiden_MB_data: ");
                                hexString = ByteUtils.toHexString(bytes);
                                sb.append(hexString);
                            }
                        } else if (next2.equalsIgnoreCase("ephemeralPublicKey")) {
                            byte[] bytes2 = string2.getBytes();
                            if (KtsShared.DEBUG) {
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append("vehicle_ephemeral_pk: ");
                                sb7.append(ByteUtils.toHexString(bytes2));
                            }
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        e.printStackTrace();
                    }
                }
            } catch (JSONException e3) {
                e = e3;
                bytes = null;
            }
            if (bytes == null || !KtsShared.DEBUG) {
                return;
            }
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Get immobilizer online: ");
            sb8.append(ByteUtils.toHexString(bArrFromHexString));
        }
    }

    public class RetryKTSException extends Exception {
        public RetryKTSException() {
        }
    }

    public KtsShared(Context context, String str, Endpoint endpoint) {
        this.mContext = context;
        this.mVehicleOemId = str;
        this.mEndpoint = endpoint;
    }

    public byte[] deriveEncryptKeyMaterial() {
        this.mEphemeralKp = CryptoUtil.generateKeyPair();
        X509Certificate vehicleEncCa = DeviceConf.getInstance().getVehicleEncCa(this.mVehicleOemId);
        if (vehicleEncCa == null) {
            return null;
        }
        PublicKey publicKey = vehicleEncCa.getPublicKey();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) this.mEphemeralKp.getPrivate();
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("mEphemeralKp pub key: ");
            sb.append(ByteUtils.toHexString(CryptoUtil.getECPKHex((ECPublicKey) this.mEphemeralKp.getPublic())));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("vehicle pub key: ");
            sb2.append(ByteUtils.toHexString(CryptoUtil.getECPKHex((ECPublicKey) publicKey)));
            StringBuilder sb3 = new StringBuilder();
            sb3.append("mEpheerkp sk: ");
            sb3.append(ByteUtils.toHexString(eCPrivateKey.getS().toByteArray()));
        }
        return derive_KeryMaterial(generateKeyagreement(publicKey, eCPrivateKey), generateSharedInfo((ECPublicKey) this.mEphemeralKp.getPublic(), (ECPublicKey) publicKey));
    }

    public byte[] derive_KeryMaterial(byte[] bArr, byte[] bArr2) {
        byte[] bArrConcatenate = ByteUtils.concatenate(ByteUtils.concatenate(bArr, new byte[]{0, 0, 0, 1}), bArr2);
        try {
            boolean z = DEBUG;
            MessageDigest messageDigest = MessageDigest.getInstance(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM);
            messageDigest.update(bArrConcatenate);
            byte[] bArrDigest = messageDigest.digest();
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("keyMaterial is: ");
                sb.append(ByteUtils.toHexString(bArrDigest));
            }
            return bArrDigest;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] derive_decrypt_keyMaterial(byte[] bArr) throws IOException {
        PublicKey pkFromHex = CryptoUtil.getPkFromHex(bArr);
        DeviceConf deviceConf = DeviceConf.getInstance();
        return derive_KeryMaterial(deviceConf.generateSharedSecret(pkFromHex), generateSharedInfo((ECPublicKey) pkFromHex, deviceConf.getDevEncPubKey()));
    }

    public byte[] devDecrypt(byte[] bArr, byte[] bArr2) {
        return devXcrypt(bArr, bArr2, 2);
    }

    public byte[] devEncrypt(byte[] bArr, byte[] bArr2) {
        return devXcrypt(bArr, bArr2, 1);
    }

    public byte[] devXcrypt(byte[] bArr, byte[] bArr2, int i) {
        return CryptoUtil.aesGcmXcrypt(bArr, ByteUtils.clone(bArr2, 16, 16), ByteUtils.clone(bArr2, 0, 16), i);
    }

    public void enableEndpointWLvisiblityIfNeed(byte[] bArr) throws IOException {
        String keyTSMStatus = getKeyTSMStatus(bArr, this.mContext);
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("key status : ");
            sb.append(keyTSMStatus);
        }
        if (keyTSMStatus == null || !keyTSMStatus.equalsIgnoreCase("TSM_INVISIABLE")) {
            return;
        }
        synchronized (seLock) {
            try {
                this.mEndpoint.openSe();
                if (this.mEndpoint.selectCccApplet() == null) {
                    this.mEndpoint.deselectSe();
                    return;
                }
                this.mEndpoint.setupEndpointVisibility(bArr, (byte) 1);
                this.mEndpoint.deselectSe();
                updateKeyTSMStatus(bArr, "TSM_VISIABLE");
            } catch (Throwable th) {
                this.mEndpoint.deselectSe();
                throw th;
            }
        }
    }

    public byte[] generateKeyagreement(PublicKey publicKey, PrivateKey privateKey) {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance(IECDHAlgorithm.ALGORITHM_ECDH);
            keyAgreement.init(privateKey);
            keyAgreement.doPhase(publicKey, true);
            return keyAgreement.generateSecret();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] generateSharedInfo(ECPublicKey eCPublicKey, ECPublicKey eCPublicKey2) {
        return ByteUtils.concatenate(CryptoUtil.getECPKHex(eCPublicKey), CryptoUtil.getECPKHex(eCPublicKey2));
    }

    public byte[] getEphemeralPkHex() {
        KeyPair keyPair = this.mEphemeralKp;
        if (keyPair != null) {
            return CryptoUtil.getECPKHex((ECPublicKey) keyPair.getPublic());
        }
        return null;
    }

    public byte[] getFriendlyName() {
        byte[] bArr = this.mFriendlyName;
        return bArr != null ? bArr : "MyCar".getBytes();
    }

    public String getKeyTSMStatus(byte[] bArr, Context context) {
        try {
            return ((DigitalKeyRecord) DKStorageManager.loadRecord(context, ByteUtils.toHexString(bArr))).getKeyStage();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] getVehicleId() {
        return this.mVehicleId;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    public void parseTrackKeyResponse(byte[] bArr, KtsResponse ktsResponse) throws IOException {
        boolean z;
        synchronized (seLock) {
            try {
                this.mEndpoint.openSe();
                if (this.mEndpoint.selectCccApplet() == null) {
                    this.mEndpoint.deselectSe();
                    return;
                }
                if (ktsResponse.mKtsSignature != null) {
                    int iStream2len = ByteUtils.stream2len(this.mEndpoint.getConfig(bArr).getKeyAttOffset(this.mContext, bArr));
                    byte[] bArrConcatenateTLV = ByteUtils.concatenateTLV(new byte[]{69}, ktsResponse.mKtsSignature);
                    byte[] payloadFromTagNullPossible = TLVParser.getPayloadFromTagNullPossible(this.mEndpoint.getKeyAttSig(bArr, this.mContext), ConstUtils.TAG_KEY_ATT_PACKAGE);
                    if (payloadFromTagNullPossible != null) {
                        byte[] bArr2 = ktsResponse.mSlotId;
                        if (bArr2 != null && bArr2.length > 0) {
                            payloadFromTagNullPossible = ByteUtils.concatenate(payloadFromTagNullPossible, ByteUtils.concatenateTLV(new byte[]{78}, bArr2));
                        }
                        bArrConcatenateTLV = ByteUtils.concatenateTLV(ConstUtils.TAG_KEY_ATT_PACKAGE, ByteUtils.concatenate(payloadFromTagNullPossible, bArrConcatenateTLV));
                    }
                    z = ByteUtils.equals(ConstUtils.SW_OK, this.mEndpoint.writeKeyAttSig(bArr, iStream2len, bArrConcatenateTLV)) && this.mEndpoint.setPrivateMailboxBit(bArr, ConstUtils.ATTESTATION_PACKAGE_BIT, ConstUtils.SIGNALING_BITMAP_OFFSET);
                }
                byte[] bArr3 = ktsResponse.mSlotId;
                if (bArr3 != null && bArr3.length > 0) {
                    this.mEndpoint.getConfig(bArr).setKeySlot(ktsResponse.mSlotId);
                    z = this.mEndpoint.setupEndpoint(bArr);
                    updateSlotId(ktsResponse.mSlotId, ByteUtils.toHexString(bArr));
                }
                this.mEndpoint.deselectSe();
                if (z) {
                    reportKtsStatus(bArr, 0, "SUCCESS");
                } else {
                    reportKtsStatus(bArr, 4, "WRITE MAILBOX FAILED");
                }
            } catch (Throwable th) {
                this.mEndpoint.deselectSe();
                throw th;
            }
        }
    }

    public byte[] prepareKtsRegData(byte[] bArr, String str) throws IOException, CertificateException {
        TLVObject tLVObject;
        DeviceConf deviceConf = DeviceConf.getInstance();
        byte[] instanceCertificate = deviceConf.getInstanceCertificate(this.mVehicleOemId);
        byte[] bArr2 = deviceConf.get_ep_certificate(bArr);
        if (instanceCertificate == null || bArr2 == null) {
            return null;
        }
        boolean z = DEBUG;
        try {
            this.mEndpoint.openSe();
            if (this.mEndpoint.selectCccApplet() == null) {
                this.mEndpoint.deselectSe();
                return null;
            }
            byte[] keyAttSig = this.mEndpoint.getKeyAttSig(bArr, this.mContext);
            this.mEndpoint.deselectSe();
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("Friend attestation package: ");
                sb.append(ByteUtils.toHexString(keyAttSig));
            }
            if (keyAttSig == null) {
                return null;
            }
            byte[] eCPKHex = CryptoUtil.getECPKHex(deviceConf.getDevEncPubKey());
            byte[] bytes = "ECIES_v1".getBytes();
            byte[] payloadFromTagNullPossible = TLVParser.getPayloadFromTagNullPossible(keyAttSig, ConstUtils.TAG_KEY_ATT_PACKAGE);
            if (payloadFromTagNullPossible == null) {
                return null;
            }
            if (this.mEndpoint.getConfig(bArr).get_immo_token_keySlot_source(this.mContext, bArr) != 1) {
                tLVObject = new TLVObject(ConstUtils.TAG_KTS_REQUEST_FRIEND, (List<TLVObject>) Arrays.asList(new TLVObject(ConstUtils.TAG_KEY_ATT_PACKAGE, payloadFromTagNullPossible), new TLVObject(ConstUtils.TAG_INSTANCE_CA, instanceCertificate), new TLVObject(ConstUtils.TAG_EP_CA, bArr2), new TLVObject(ConstUtils.TAG_KTS_DEV_ENC_PK, eCPKHex), new TLVObject(new byte[]{-38}, bytes)));
            } else {
                if (TLVParser.getPayloadFromTagNullPossible(this.mEndpoint.createEncryptionKey(bArr), ConstUtils.TAG_EP_ENC_ATTESTATION) == null) {
                    return null;
                }
                tLVObject = new TLVObject(ConstUtils.TAG_KTS_REQUEST_FRIEND, (List<TLVObject>) Arrays.asList(new TLVObject(ConstUtils.TAG_KEY_ATT_PACKAGE, payloadFromTagNullPossible), new TLVObject(ConstUtils.TAG_INSTANCE_CA, instanceCertificate), new TLVObject(ConstUtils.TLV_KTS_DEV_ENC_PK, eCPKHex), new TLVObject(ConstUtils.TAG_EP_CA, bArr2), new TLVObject(ConstUtils.TAG_KTS_DEV_ENC_PK, eCPKHex), new TLVObject(new byte[]{-38}, bytes)));
            }
            byte[] bytes2 = tLVObject.toBytes();
            byte[] bArrDeriveEncryptKeyMaterial = deriveEncryptKeyMaterial();
            if (z) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("KTS before enc: ");
                sb2.append(ByteUtils.toHexString(bytes2));
            }
            byte[] bArrDevEncrypt = devEncrypt(bytes2, bArrDeriveEncryptKeyMaterial);
            if (z) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("KTS after enc: ");
                sb3.append(ByteUtils.toHexString(bArrDevEncrypt));
            }
            return bArrDevEncrypt;
        } catch (Throwable th) {
            this.mEndpoint.deselectSe();
            throw th;
        }
    }

    public byte[] prepareKtsRegRequest(byte[] bArr, String str) throws IOException, CertificateException {
        boolean z = DEBUG;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Key id: ");
            sb.append(ByteUtils.toHexString(bArr));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Friendly name: ");
            sb2.append(str);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("vehicle oem id: ");
            sb3.append(this.mVehicleOemId);
        }
        byte[] bArrPrepareKtsRegData = prepareKtsRegData(bArr, str);
        if (bArrPrepareKtsRegData == null) {
            return null;
        }
        byte[] bArrPrepareTrackKeyRequest = prepareTrackKeyRequest(bArr, bArrPrepareKtsRegData, "WATCH");
        if (z) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("KTS request, final data: ");
            sb4.append(ByteUtils.toHexString(bArrPrepareTrackKeyRequest));
        }
        return bArrPrepareTrackKeyRequest;
    }

    public byte[] prepareTrackKeyRequest(byte[] bArr, byte[] bArr2, String str) {
        byte[] bytes = this.mVehicleOemId.getBytes();
        byte[] vehicleId = EPConfig.getVehicleId(this.mVehicleId);
        byte[] bytes2 = Build.PRODUCT.getBytes();
        byte[] bytes3 = Constants.KEY_TYPE_SHARED.getBytes();
        byte[] friendlyName = getFriendlyName();
        byte[] bytes4 = "ECIES_v1".getBytes();
        byte[] ephemeralPkHex = getEphemeralPkHex();
        X509Certificate vehicleEncCa = DeviceConf.getInstance().getVehicleEncCa(this.mVehicleOemId);
        if (vehicleEncCa == null) {
            return null;
        }
        byte[] sha256Digist = CryptoUtil.getSha256Digist(CryptoUtil.getECPKHex((ECPublicKey) vehicleEncCa.getPublicKey()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TLVObject(ConstUtils.TAG_VEHICLE_OEM_ID, bytes));
        arrayList.add(new TLVObject(ConstUtils.TAG_VEHICLE_ID, vehicleId));
        if (this.mBrandName != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("shared kts brand:");
            sb.append(this.mBrandName);
            VehicleValue value = ConstUtils.getValue(this.mBrandName);
            String vehicleBrandId = value != null ? value.getVehicleBrandId() : null;
            if (vehicleBrandId != null) {
                arrayList.add(new TLVObject(ConstUtils.TAG_VEHICLE_BRAND_ID, ByteUtils.fromHexString(vehicleBrandId)));
            }
        }
        arrayList.add(new TLVObject(ConstUtils.TAG_DEVICE_MODEL_ID, bytes2));
        arrayList.add(new TLVObject(ConstUtils.TAG_KEY_ID, bArr));
        arrayList.add(new TLVObject(ConstUtils.TAG_KEY_TYPE, bytes3));
        arrayList.add(new TLVObject(new byte[]{-45}, friendlyName));
        arrayList.add(new TLVObject(new byte[]{-97, 21}, bytes4));
        arrayList.add(new TLVObject(ConstUtils.TAG_EPHEMERAL_PK, ephemeralPkHex));
        arrayList.add(new TLVObject(ConstUtils.TAG_EPHEMERAL_PK_HASH, sha256Digist));
        arrayList.add(new TLVObject(ConstUtils.TAG_KEY_DATA, bArr2));
        EPConfig config = this.mEndpoint.getConfig(bArr);
        if (config.getDuplicateVehicleIdKeyId() != null && config.getDuplicateVehicleIdTerminationAttestation() != null) {
            arrayList.add(new TLVObject(ConstUtils.TAG_KTS_DUP_TERMINATE_KEY_ID, config.getDuplicateVehicleIdKeyId()));
            arrayList.add(new TLVObject(ConstUtils.TAG_KTS_DUP_TERMINATE_ATTESTATION, config.getDuplicateVehicleIdTerminationAttestation()));
        }
        return new TLVObject(ConstUtils.TAG_XM_PRIVATE_IN, arrayList).toBytes();
    }

    public void reportKtsStatus(byte[] bArr, int i, String str) {
        TSMProxy.getInstance().reportKtsStatus(bArr, i, str);
    }

    public boolean sendTrackKeyRequest(byte[] bArr, String str) throws RetryKTSException {
        if (str != null) {
            this.mFriendlyName = str.getBytes();
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("start KTS Request : ");
            sb.append(this.mVehicleOemId);
            byte[] bArrPrepareKtsRegRequest = prepareKtsRegRequest(bArr, str);
            if (bArrPrepareKtsRegRequest == null) {
                reportKtsStatus(bArr, 2, "INVALID RESPONSE");
                throw new RetryKTSException();
            }
            updateKeyTSMStatus(bArr, "TSM_START_REPORT");
            byte[] bArrKTS_registerSync = TSMProxy.getInstance().KTS_registerSync(bArrPrepareKtsRegRequest);
            if (bArrKTS_registerSync != null) {
                try {
                    if (bArrKTS_registerSync.length >= 2) {
                        byte[] bArrClone = ByteUtils.clone(bArrKTS_registerSync, bArrKTS_registerSync.length - 2, 2);
                        boolean z = DEBUG;
                        if (z) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("SW code: ");
                            sb2.append(ByteUtils.toHexString(bArrClone));
                        }
                        String keyTSMStatus = getKeyTSMStatus(bArr, this.mContext);
                        if (z) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("key status: ");
                            sb3.append(keyTSMStatus);
                        }
                        if (ByteUtils.equals(bArrClone, new byte[]{-112, 0})) {
                            enableEndpointWLvisiblityIfNeed(bArr);
                        } else if (ByteUtils.equals(bArrClone, new byte[]{3, 2})) {
                            throw new RetryKTSException();
                        }
                    }
                } catch (KtsDecryptFailException unused) {
                    reportKtsStatus(bArr, 3, "CRYPTOGRAPHY ERROR");
                    return false;
                } catch (KtsFailException | IOException unused2) {
                    reportKtsStatus(bArr, 2, "INVALID RESPONSE");
                    return false;
                }
            }
            parseTrackKeyResponse(bArr, new KtsResponse(bArr, bArrKTS_registerSync));
            enableEndpointWLvisiblityIfNeed(bArr);
            return true;
        } catch (IOException unused3) {
            reportKtsStatus(bArr, 2, "INVALID RESPONSE");
            throw new RetryKTSException();
        } catch (CertificateException e) {
            e.printStackTrace();
            reportKtsStatus(bArr, 2, "INVALID RESPONSE");
            throw new RetryKTSException();
        }
    }

    public void setBrandName(String str) {
        this.mBrandName = str;
    }

    public void setVehicleId(byte[] bArr) {
        this.mVehicleId = bArr;
    }

    public void updateKeyTSMStatus(byte[] bArr, String str) {
        try {
            DigitalKeyRecord digitalKeyRecord = (DigitalKeyRecord) DKStorageManager.loadRecord(this.mContext, ByteUtils.toHexString(bArr));
            digitalKeyRecord.setKeyStage(str);
            DKStorageManager.saveRecord(this.mContext, digitalKeyRecord, ByteUtils.toHexString(bArr));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
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
}
