package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetError;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.IBleDeviceLauncher;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.ECCPointConvert;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.Hkdf;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.MijiaRootCertUtil;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.SecurityChipUtil;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.BluetoothContextManager;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.Code;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleNotifyResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import com.xiaomi.smarthome.library.common.util.SharePrefsManager;
import java.io.ByteArrayInputStream;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import java.util.UUID;
import javax.crypto.SecretKey;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class BleSecurityDoubleFactorSharedLoginConnector extends BleSecurityChipConnector {
    private static final int MSG_NOTIFY_TIMEOUT = 4100;
    private static final String PREF_DEVICE_CERT = "pref_device_cert";
    private static final String TAG = "BleSecurityDoubleFactorSharedLoginConnector";
    private String mCloudTokenStr;
    private X509Certificate mDevCert;
    private PublicKey mDevCertCachePublicKey;
    private byte[] mDevicePubInfo;
    private String mKeyId;
    private X509Certificate mManuCert;
    private byte[] mSessionKey;
    private KeyPair mSharedLoginAppKeyPair;
    private PublicKey mSharedLoginDevicePubKey;
    private String mUserKeyStr;
    private static final byte[] SHARED_LOG_START = {48, 0, 0, 0};
    private static final byte[] SHARED_LOG_SUCCESS = {49, 0, 0, 0};
    private static final byte[] SHARED_LOG_FAILED = {HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 0, 0, 0};
    private static final byte[] SHARED_LOG_EXPIRED = {51, 0, 0, 0};
    private static final byte[] SHARED_LOG_START_W_CERT = {HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, 0, 0, 0};
    private static final byte[] SHARED_LOG_START_2FA = {HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, 0, 0, 0};
    private static final byte[] SHARED_LOG_START_2FA_W_CERT = {HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, 0, 0, 0};

    public BleSecurityDoubleFactorSharedLoginConnector(IBleDeviceLauncher iBleDeviceLauncher, String str) {
        super(iBleDeviceLauncher);
        this.mUserKeyStr = TextUtils.isEmpty(str) ? BluetoothCache.getLockShareUserKey(getMac()) : str;
        this.mKeyId = BluetoothCache.getLockShareKeyId(getMac());
        BluetoothMyLogger.v(String.format("BleSecurityDoubleFactorSharedLoginConnector keyStr = %s", this.mUserKeyStr));
        BluetoothMyLogger.v(String.format("BleSecurityDoubleFactorSharedLoginConnector mKeyId = %s", this.mKeyId));
    }

    public static int byteArrayToInt(byte[] bArr, int i) throws StringIndexOutOfBoundsException {
        return ((bArr[i + 3] << 24) & (-16777216)) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & 65280) | ((bArr[i + 2] << 16) & 16711680);
    }

    private byte[] deriveSharedLoginSessionKey(byte[] bArr) {
        try {
            Hkdf hkdf = Hkdf.getInstance("HmacSHA256");
            hkdf.init(bArr, "smartcfg-share-salt".getBytes());
            return hkdf.deriveKey("smartcfg-share-info".getBytes(), 64);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void processStep10(byte[] bArr) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector Process Step 10 ..., value = " + Arrays.toString(bArr));
        if (ByteUtils.equals(bArr, SHARED_LOG_SUCCESS)) {
            this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
            this.mBundle.putByteArray(BluetoothConstants.KEY_SESSION_KEY, this.mSessionKey);
            dispatchResult(0);
        } else if (ByteUtils.equals(bArr, SHARED_LOG_FAILED)) {
            this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
            dispatchResult(-24);
        } else if (ByteUtils.equals(bArr, SHARED_LOG_EXPIRED)) {
            this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
            dispatchResult(-18);
        } else if (ByteUtils.equals(bArr, BleSecurityChipLoginConnector.ERR_NOT_REGISTERED)) {
            this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
            dispatchResult(-16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processStep1Plus() {
        BluetoothCache.setPropSessionKeyBytes(getMac(), "".getBytes());
        openSecureAuthNotify(new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityDoubleFactorSharedLoginConnector.2
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r3) {
                BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector Step 1 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleSecurityDoubleFactorSharedLoginConnector.this.processStep2();
                } else {
                    BleSecurityDoubleFactorSharedLoginConnector.this.dispatchResult(-27);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processStep2() {
        if (isCanceled()) {
            dispatchResult(-2);
        } else {
            BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector Process Step 2 ...");
            openAuthNotify(new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityDoubleFactorSharedLoginConnector.3
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, Void r3) {
                    BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector Step 2 onResponse: " + Code.toString(i));
                    if (i == 0) {
                        BleSecurityDoubleFactorSharedLoginConnector.this.processStep3();
                    } else {
                        BleSecurityDoubleFactorSharedLoginConnector.this.dispatchResult(-27);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processStep3() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector Process Step 3 ...");
        this.mSharedLoginAppKeyPair = SecurityChipUtil.generateEcc256KeyPair();
        String string = SharePrefsManager.getSharedPrefs(BluetoothContextManager.getContext(), PREF_DEVICE_CERT).getString(getMac(), "");
        if (!TextUtils.isEmpty(string)) {
            try {
                this.mDevCertCachePublicKey = ECCPointConvert.fromUncompressedPoint(ByteUtils.stringToBytes(string), ((ECPublicKey) this.mSharedLoginAppKeyPair.getPublic()).getParams());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        BleConnectManager.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, this.mDevCertCachePublicKey != null ? SHARED_LOG_START_2FA : SHARED_LOG_START_2FA_W_CERT, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityDoubleFactorSharedLoginConnector.4
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r3) {
                BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector Step 3 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleSecurityDoubleFactorSharedLoginConnector.this.processStep4();
                } else {
                    BleSecurityDoubleFactorSharedLoginConnector.this.dispatchResult(-28);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processStep4() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector Process Step 4 ...");
        if (writeChannel(SecurityChipUtil.getRawPublicKey(this.mSharedLoginAppKeyPair.getPublic()), 3, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityDoubleFactorSharedLoginConnector.5
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector Step 4 onResponse: " + Code.toString(i));
                if (i != 0) {
                    BleSecurityDoubleFactorSharedLoginConnector.this.dispatchResult(-28);
                } else {
                    ((BleSecurityConnector) BleSecurityDoubleFactorSharedLoginConnector.this).mHandler.removeMessages(BleSecurityDoubleFactorSharedLoginConnector.MSG_NOTIFY_TIMEOUT);
                    ((BleSecurityConnector) BleSecurityDoubleFactorSharedLoginConnector.this).mHandler.sendEmptyMessageDelayed(BleSecurityDoubleFactorSharedLoginConnector.MSG_NOTIFY_TIMEOUT, 15000L);
                }
            }
        })) {
            return;
        }
        dispatchResult(-28);
    }

    private boolean recvDeviceEncryptData(byte[] bArr) {
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector Process Step 8 ...");
        this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
        if (this.mSharedLoginDevicePubKey == null) {
            return false;
        }
        PublicKey publicKey = this.mDevCertCachePublicKey;
        if (publicKey == null && (this.mDevCert == null || this.mManuCert == null)) {
            return false;
        }
        if (publicKey == null) {
            if (!MijiaRootCertUtil.verifyX509Certificate(MijiaRootCertUtil.getMijiaRootCertificateFromAssets(), this.mManuCert)) {
                BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector MijiaManufactureCERT is invalid");
                return false;
            }
            if (!MijiaRootCertUtil.verifyX509Certificate(this.mManuCert, this.mDevCert)) {
                BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector MijiaDeviceCert is invalid");
                return false;
            }
            SharedPreferences.Editor editorEdit = SharePrefsManager.getSharedPrefs(BluetoothContextManager.getContext(), PREF_DEVICE_CERT).edit();
            PublicKey publicKey2 = this.mDevCert.getPublicKey();
            this.mDevCertCachePublicKey = publicKey2;
            editorEdit.putString(getMac(), ByteUtils.byteToString(ECCPointConvert.publicKeyToBytes((ECPublicKey) publicKey2)));
            editorEdit.apply();
        }
        SecretKey secret = SecurityChipUtil.getSecret(this.mSharedLoginDevicePubKey, this.mSharedLoginAppKeyPair.getPrivate());
        if (secret == null) {
            return false;
        }
        try {
            boolean zIsEcdsaSignatureValid = SecurityChipUtil.isEcdsaSignatureValid(secret.getEncoded(), SecurityChipUtil.getDERSignature(bArr), this.mDevCertCachePublicKey);
            BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector isEcdsaSignatureValid  : " + zIsEcdsaSignatureValid);
            if (!zIsEcdsaSignatureValid) {
                return false;
            }
            this.mSessionKey = deriveSharedLoginSessionKey(secret.getEncoded());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void recvDevicePubKey(byte[] bArr) {
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector Process Step 5 ...");
        this.mDevicePubInfo = Arrays.copyOf(bArr, bArr.length);
        byte[] bArr2 = new byte[65];
        bArr2[0] = 4;
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        try {
            this.mSharedLoginDevicePubKey = ECCPointConvert.fromUncompressedPoint(bArr2, ((ECPublicKey) this.mSharedLoginAppKeyPair.getPublic()).getParams());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
        this.mHandler.sendEmptyMessageDelayed(MSG_NOTIFY_TIMEOUT, 15000L);
    }

    private void sendEncryptData() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector Process Step 9 ...");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(this.mSessionKey, 16, 32);
        byte[] bArr = {16, 17, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 20, 21, 22, 23, 24, 25, 26, 27};
        byte[] bArrStringToBytes = ByteUtils.stringToBytes(this.mCloudTokenStr);
        String strDecodeBase36 = ByteUtils.decodeBase36(this.mUserKeyStr);
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnectorhexString2 : " + strDecodeBase36.length());
        byte[] bArrStringToBytes2 = ByteUtils.stringToBytes(strDecodeBase36);
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector userKey : " + Arrays.toString(bArrStringToBytes2));
        byte[] bArrSha256HMAC = SecurityChipUtil.sha256HMAC(bArrStringToBytes2, bArrStringToBytes);
        byte[] bArrUnitByteArray = ByteUtils.unitByteArray(bArrStringToBytes, bArrSha256HMAC);
        int iByteArrayToInt = byteArrayToInt(ByteUtils.stringToBytes(this.mCloudTokenStr), 4);
        int iByteArrayToInt2 = byteArrayToInt(ByteUtils.stringToBytes(this.mCloudTokenStr), 8);
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector ByteUtils.decodeBase36(mUserKeyStr) : " + ByteUtils.decodeBase36(this.mUserKeyStr));
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector create_time : " + iByteArrayToInt);
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector key_id : " + iByteArrayToInt2);
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  ");
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector ====cloudTokenStr =============  " + this.mCloudTokenStr);
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector ====userKeyStr =============  " + ByteUtils.byteToString(bArrStringToBytes2));
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector ====userTokenStr =============  " + ByteUtils.byteToString(bArrSha256HMAC));
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector ====encryptKeyStr =========  " + ByteUtils.byteToString(bArrCopyOfRange));
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector encryptTokenStr :  " + ByteUtils.byteToString(bArrUnitByteArray));
        byte[] bArrAESEncrypt = SecurityChipUtil.AESEncrypt(bArrCopyOfRange, bArr, bArrUnitByteArray);
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector encryptDataStr :  " + ByteUtils.byteToString(bArrAESEncrypt));
        if (bArrAESEncrypt == null) {
            dispatchResult(-28);
            return;
        }
        this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
        this.mHandler.sendEmptyMessageDelayed(MSG_NOTIFY_TIMEOUT, 15000L);
        if (writeChannel(bArrAESEncrypt, 6, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityDoubleFactorSharedLoginConnector.6
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                if (i != 0) {
                    BleSecurityDoubleFactorSharedLoginConnector.this.dispatchResult(-28);
                }
            }
        })) {
            return;
        }
        dispatchResult(-28);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipConnector
    public void onChannelRead(byte[] bArr, int i) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        if (i == 1) {
            recvDeviceCert(bArr);
            return;
        }
        if (i == 2) {
            recvDeviceManuCert(bArr);
            return;
        }
        if (i == 3) {
            recvDevicePubKey(bArr);
        } else {
            if (i != 4) {
                return;
            }
            if (recvDeviceEncryptData(bArr)) {
                sendEncryptData();
            } else {
                dispatchResult(-23);
            }
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipConnector, com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processHandlerMessage(Message message) {
        if (message.what != MSG_NOTIFY_TIMEOUT) {
            return;
        }
        BluetoothMyLogger.w("BleSecurityDoubleFactorSharedLoginConnector notify timeout");
        dispatchResult(-7);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipConnector, com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        UUID uuid3 = BluetoothConstants.MISERVICE;
        if (uuid.equals(uuid3) && uuid2.equals(BluetoothConstants.CHARACTER_AUTH)) {
            processStep10(bArr);
        } else if (uuid.equals(uuid3) && uuid2.equals(BluetoothConstants.CHARACTER_SECURE_AUTH)) {
            super.processNotify(uuid, uuid2, bArr);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processStep1() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector Process Step 1 ...");
        String propDid = BluetoothCache.getPropDid(getMac());
        if (!TextUtils.isEmpty(propDid)) {
            DeviceApi.getShareLockCloudToken(propDid, Integer.parseInt(this.mKeyId), new BleAsyncCallback<JSONObject, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityDoubleFactorSharedLoginConnector.1
                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                public void onFailure(BleNetError bleNetError) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("BleSecurityDoubleFactorSharedLoginConnector fetch share key failed");
                    sb.append(bleNetError != null ? bleNetError.getDetail() : "");
                    BluetoothMyLogger.e(sb.toString());
                    if (bleNetError == null || bleNetError.getCode() != -6 || bleNetError.getDetail() == null || !bleNetError.getDetail().contains("key is out of date")) {
                        BleSecurityDoubleFactorSharedLoginConnector.this.dispatchResult(-19);
                    } else {
                        BleSecurityDoubleFactorSharedLoginConnector.this.dispatchResult(-18);
                    }
                }

                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                public void onSuccess(JSONObject jSONObject) {
                    String strOptString = jSONObject != null ? jSONObject.optString("cloud_token") : "";
                    if (TextUtils.isEmpty(strOptString)) {
                        BluetoothMyLogger.e("BleSecurityDoubleFactorSharedLoginConnector cloudToken is empty......");
                        BleSecurityDoubleFactorSharedLoginConnector.this.dispatchResult(-19);
                    } else {
                        BleSecurityDoubleFactorSharedLoginConnector.this.mCloudTokenStr = strOptString;
                        BleSecurityDoubleFactorSharedLoginConnector.this.processStep1Plus();
                    }
                }
            });
        } else {
            BluetoothMyLogger.e("BleSecurityDoubleFactorSharedLoginConnector did is empty");
            dispatchResult(-12);
        }
    }

    public void recvDeviceCert(byte[] bArr) {
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector Process Step 6 ...");
        try {
            this.mDevCert = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        } catch (CertificateException e) {
            e.printStackTrace();
        }
        this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
        this.mHandler.sendEmptyMessageDelayed(MSG_NOTIFY_TIMEOUT, 15000L);
    }

    public void recvDeviceManuCert(byte[] bArr) {
        BluetoothMyLogger.v("BleSecurityDoubleFactorSharedLoginConnector Process Step 7 ...");
        try {
            this.mManuCert = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        } catch (CertificateException e) {
            e.printStackTrace();
        }
        this.mHandler.removeMessages(MSG_NOTIFY_TIMEOUT);
        this.mHandler.sendEmptyMessageDelayed(MSG_NOTIFY_TIMEOUT, 15000L);
    }
}
