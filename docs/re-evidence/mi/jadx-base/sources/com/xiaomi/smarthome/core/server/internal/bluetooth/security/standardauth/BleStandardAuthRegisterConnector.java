package com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetError;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.IBleDeviceLauncher;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.ECCPointConvert;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.Hkdf;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.SecurityChipUtil;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.Code;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleNotifyResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleReadResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import com.xiaomi.smarthome.library.crypto.Base64Coder;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import java.util.UUID;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class BleStandardAuthRegisterConnector extends BleStandardAuthConnector {
    private static final int MSG_NOTIFY_TIMEOUT = 4102;
    private static final int SUPPORT_STANDARD_AUTH_VERSION = 1;
    private static final int SUPPORT_STANDARD_AUTH_VERSION_V2 = 2;
    private static final int SUPPORT_STANDARD_AUTH_VERSION_V3 = 3;
    private static final String TAG = "BleStandardAuthRegisterConnector";
    private SecretKey eShareKey;
    private byte[] mAppConfirmation;
    private byte[] mAppRandom;
    private final BleReadResponse mApplyDidResponse;
    private byte[] mBeaconKey;
    private final BleWriteResponse mBindDidResponse;
    private String mCloudCert;
    private int mCurrentStandardAuthVersion;
    private byte[] mDevConfirmation;
    private byte[] mDeviceKey;
    private byte[] mDevicePubInfo;
    private PublicKey mDevicePubKey;
    private byte[] mEncryptData;
    private int mInputCapability;
    private byte[] mOOB;
    private int mOutputCapability;
    private String mQrcodeOob;
    private KeyPair mRegisterAppKeyPair;
    private byte[] mTempDeviceId;
    private byte[] mToken;
    private final BleWriteResponse mWriteDidResponse;
    private static final byte[] REQ_DEV_INFO = {-94, 0, 0, 0};
    private static final byte[] REG_SUCCESS = {17, 0, 0, 0};
    private static final byte[] REG_FAILED = {HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, 0, 0, 0};
    private static final byte[] REG_VERIFY_SUCCESS = {HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 0, 0, 0};
    private static final byte[] REG_VERIFY_FAILED = {20, 0, 0, 0};
    private static final byte[] ERR_REGISTERED = {-31, 0, 0, 0};

    public BleStandardAuthRegisterConnector(IBleDeviceLauncher iBleDeviceLauncher, String str) {
        super(iBleDeviceLauncher);
        this.mApplyDidResponse = new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.1
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(final int i, byte[] bArr) {
                if (i != 0) {
                    BleStandardAuthRegisterConnector.this.writeBindResultToDevice(false, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.1.1
                        @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                        public void onResponse(int i2, Void r2) {
                            BleStandardAuthRegisterConnector.this.dispatchResult(i);
                        }
                    });
                    return;
                }
                if (ByteUtils.isEmpty(bArr)) {
                    throw new IllegalStateException("strange exception");
                }
                if (!ByteUtils.isEmpty(BleStandardAuthRegisterConnector.this.mTempDeviceId) && !ByteUtils.byteEquals(BleStandardAuthRegisterConnector.this.mTempDeviceId, bArr)) {
                    BluetoothMyLogger.e("BleStandardAuthRegisterConnector device did don't match server did, device did = " + ByteUtils.byteToString(BleStandardAuthRegisterConnector.this.mTempDeviceId) + ", server did = " + ByteUtils.byteToString(bArr));
                }
                BleStandardAuthRegisterConnector.this.mTempDeviceId = bArr;
                byte[] bArrFillBeforeBytes = ByteUtils.fillBeforeBytes(bArr, 20, (byte) 0);
                BluetoothMyLogger.w("BleStandardAuthRegisterConnector write Did to Device: " + ByteUtils.byteToString(bArrFillBeforeBytes));
                if (BleStandardAuthRegisterConnector.this.mCurrentStandardAuthVersion == 2) {
                    BleStandardAuthRegisterConnector bleStandardAuthRegisterConnector = BleStandardAuthRegisterConnector.this;
                    bleStandardAuthRegisterConnector.bindDidToServerV2(bleStandardAuthRegisterConnector.mBindDidResponse);
                } else {
                    BleStandardAuthRegisterConnector bleStandardAuthRegisterConnector2 = BleStandardAuthRegisterConnector.this;
                    bleStandardAuthRegisterConnector2.writeDidToDevice(bArrFillBeforeBytes, bleStandardAuthRegisterConnector2.mWriteDidResponse);
                }
            }
        };
        this.mWriteDidResponse = new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.2
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r2) {
                if (i != 0) {
                    BleStandardAuthRegisterConnector.this.dispatchResult(i);
                } else {
                    BleStandardAuthRegisterConnector bleStandardAuthRegisterConnector = BleStandardAuthRegisterConnector.this;
                    bleStandardAuthRegisterConnector.bindDidToServer(bleStandardAuthRegisterConnector.mBindDidResponse);
                }
            }
        };
        this.mBindDidResponse = new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.3
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(final int i, Void r3) {
                if (i != 0) {
                    BleStandardAuthRegisterConnector.this.writeBindResultToDevice(false, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.3.2
                        @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                        public void onResponse(int i2, Void r2) {
                            BleStandardAuthRegisterConnector.this.dispatchResult(i);
                        }
                    });
                } else {
                    BluetoothCache.setPropBoundStatus(BleStandardAuthRegisterConnector.this.getMac(), 2);
                    BleStandardAuthRegisterConnector.this.writeBindResultToDevice(true, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.3.1
                        @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                        public void onResponse(int i2, Void r4) {
                            if (BleStandardAuthRegisterConnector.this.mCurrentStandardAuthVersion == 2) {
                                BleStandardAuthRegisterConnector.this.writeEncryptData();
                            } else {
                                ((BleSecurityConnector) BleStandardAuthRegisterConnector.this).mHandler.removeMessages(4102);
                                ((BleSecurityConnector) BleStandardAuthRegisterConnector.this).mHandler.sendEmptyMessageDelayed(4102, 15000L);
                            }
                        }
                    });
                }
            }
        };
        this.mQrcodeOob = str;
    }

    private void applyDid(final BleReadResponse bleReadResponse) {
        BluetoothMyLogger.v("BleStandardAuthRegisterConnector applyDid");
        String modelByProductId = BluetoothService.getBleCoreProvider().getModelByProductId(getProductId());
        BluetoothService.getReportCoreProvider().startAction(10);
        DeviceApi.getDeviceSN(getDidText(), this.mLauncher.getDeviceMac(), modelByProductId, getTokenText(), new BleAsyncCallback<String, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.10
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onFailure(BleNetError bleNetError) {
                if (bleNetError != null) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(10, "msg", bleNetError.toString());
                }
                BluetoothService.getReportCoreProvider().finishAction(10, 11);
                BluetoothMyLogger.v("BleStandardAuthRegisterConnector applyDid >>> onFailure " + bleNetError);
                bleReadResponse.onResponse(-29, null);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onSuccess(String str) {
                BluetoothMyLogger.v("BleStandardAuthRegisterConnector applyDid >>> onSuccess " + str);
                if (!TextUtils.isEmpty(str)) {
                    BluetoothService.getReportCoreProvider().finishAction(10);
                    bleReadResponse.onResponse(0, str.getBytes());
                } else {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(10, "msg", "result is empty");
                    BluetoothService.getReportCoreProvider().finishAction(10, 11);
                    bleReadResponse.onResponse(-29, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindDidToServer(final BleWriteResponse bleWriteResponse) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleStandardAuthRegisterConnector bindDidToServer start");
        String propSMac = BluetoothCache.getPropSMac(getMac());
        BluetoothService.getReportCoreProvider().startAction(12);
        DeviceApi.bindDeviceSN(getDidText(), getBeaconKeyText(), getTokenText(), propSMac, new BleAsyncCallback<Boolean, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.12
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onFailure(BleNetError bleNetError) {
                if (bleNetError != null) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(12, "msg", bleNetError.toString());
                }
                BluetoothService.getReportCoreProvider().finishAction(12, 11);
                BluetoothMyLogger.v("BleStandardAuthRegisterConnector bindDidToServer return failed: " + bleNetError);
                if (bleNetError.getCode() != -1) {
                    bleWriteResponse.onResponse(-30, null);
                    return;
                }
                String detail = bleNetError.getDetail();
                if (TextUtils.isEmpty(detail) || detail.contains("Unable to resolve")) {
                    bleWriteResponse.onResponse(-30, null);
                    return;
                }
                if (((BleSecurityConnector) BleStandardAuthRegisterConnector.this).mBundle != null) {
                    ((BleSecurityConnector) BleStandardAuthRegisterConnector.this).mBundle.putString("key_device_did", BleStandardAuthRegisterConnector.this.getDidText());
                }
                bleWriteResponse.onResponse(-14, null);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onSuccess(Boolean bool) {
                if (bool == null || !bool.booleanValue()) {
                    BluetoothService.getReportCoreProvider().finishAction(12, 11);
                } else {
                    BluetoothService.getReportCoreProvider().finishAction(12);
                }
                BluetoothMyLogger.v("BleStandardAuthRegisterConnector bindDidToServer return " + bool);
                bleWriteResponse.onResponse(bool.booleanValue() ? 0 : -30, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindDidToServerV2(final BleWriteResponse bleWriteResponse) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleStandardAuthRegisterConnector bindDidToServerV2 start");
        String propSMac = BluetoothCache.getPropSMac(getMac());
        BluetoothService.getReportCoreProvider().startAction(12);
        this.mCloudCert = null;
        this.mEncryptData = null;
        DeviceApi.bindDeviceSnV2(getDidText(), getBeaconKeyText(), getTokenText(), propSMac, new BleAsyncCallback<JSONObject, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.13
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onFailure(BleNetError bleNetError) {
                if (bleNetError != null) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(12, "msg", bleNetError.toString());
                }
                BluetoothService.getReportCoreProvider().finishAction(12, 11);
                BluetoothMyLogger.v("BleStandardAuthRegisterConnector bindDidToServerV2 return failed: " + bleNetError);
                if (bleNetError.getCode() != -1) {
                    bleWriteResponse.onResponse(-30, null);
                    return;
                }
                String detail = bleNetError.getDetail();
                if (TextUtils.isEmpty(detail) || detail.contains("Unable to resolve")) {
                    bleWriteResponse.onResponse(-30, null);
                    return;
                }
                if (((BleSecurityConnector) BleStandardAuthRegisterConnector.this).mBundle != null) {
                    ((BleSecurityConnector) BleStandardAuthRegisterConnector.this).mBundle.putString("key_device_did", BleStandardAuthRegisterConnector.this.getDidText());
                }
                bleWriteResponse.onResponse(-14, null);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onSuccess(JSONObject jSONObject) {
                boolean zOptBoolean = jSONObject.optBoolean("success");
                String strOptString = jSONObject.optString("cloud_cert");
                String strOptString2 = jSONObject.optString("cloud_sign");
                int iOptInt = jSONObject.optInt("utc");
                BluetoothMyLogger.v(">>> standard auth register:bindDidToServerV2 onSuccess " + jSONObject);
                if (!zOptBoolean) {
                    bleWriteResponse.onResponse(-30, null);
                    return;
                }
                BleStandardAuthRegisterConnector.this.mCloudCert = strOptString;
                BleStandardAuthRegisterConnector bleStandardAuthRegisterConnector = BleStandardAuthRegisterConnector.this;
                bleStandardAuthRegisterConnector.mEncryptData = bleStandardAuthRegisterConnector.buildEncryptData(strOptString2, iOptInt);
                bleWriteResponse.onResponse(0, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] buildEncryptData(String str, int i) throws Throwable {
        byte[] bArr = new byte[88];
        byte[] deviceDIDBytes = getDeviceDIDBytes();
        byte[] bArrDecode = Base64Coder.decode(str, 24);
        writeLog("utc =%d", Integer.valueOf(i));
        System.arraycopy(deviceDIDBytes, 0, bArr, 0, 20);
        System.arraycopy(bArrDecode, 0, bArr, 20, 64);
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt(i);
        System.arraycopy(byteBufferOrder.array(), 0, bArr, 84, 4);
        return SecurityChipUtil.AESEncrypt(this.mDeviceKey, new byte[]{16, 17, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 20, 21, 22, 23, 24, 25, 26, 27}, bArr, "devID".getBytes());
    }

    private byte[] deriveKeyFromOOB(byte[] bArr, byte[] bArr2) {
        try {
            Hkdf hkdf = Hkdf.getInstance("HmacSHA256");
            hkdf.init(bArr, bArr2);
            return hkdf.deriveKey("mible-setup-info".getBytes(), 64);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private byte[] generateAppRandom() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    private String getBeaconKeyText() {
        return ByteUtils.isEmpty(this.mBeaconKey) ? "" : ByteUtils.byteToString(this.mBeaconKey);
    }

    private String getTokenText() {
        return ByteUtils.isEmpty(this.mToken) ? "" : ByteUtils.byteToString(this.mToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processStep1Plus() {
        if (isCanceled()) {
            dispatchResult(-2);
        } else {
            BluetoothMyLogger.v("BleStandardAuthRegisterConnector Process Step 1 plus ...");
            openAuthNotify(new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.5
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, Void r3) {
                    BluetoothMyLogger.v("BleStandardAuthRegisterConnector Step 1 plus onResponse: " + Code.toString(i));
                    if (i == 0) {
                        BleStandardAuthRegisterConnector.this.requestDeviceInfo();
                    } else {
                        BleStandardAuthRegisterConnector.this.dispatchResult(-27);
                    }
                }
            });
        }
    }

    private void receiveDeviceResult(byte[] bArr) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleStandardAuthRegisterConnector receiveDeviceResult ..., value = " + ByteUtils.byteToString(bArr));
        if (ByteUtils.equals(bArr, REG_SUCCESS)) {
            this.mHandler.removeMessages(4102);
            BluetoothService.getReportCoreProvider().finishAction(14, 0);
            dispatchResult(0);
        } else {
            if (ByteUtils.equals(bArr, REG_FAILED)) {
                BluetoothService.getReportCoreProvider().addContextByActionCode(14, "msg", "reg fail");
                BluetoothService.getReportCoreProvider().finishAction(14, 13);
                this.mHandler.removeMessages(4102);
                unbindDeviceIfNeed();
                dispatchResult(-51);
                return;
            }
            if (ByteUtils.equals(bArr, ERR_REGISTERED)) {
                BluetoothService.getReportCoreProvider().addContextByActionCode(14, "msg", "registered error");
                BluetoothService.getReportCoreProvider().finishAction(14, 13);
                this.mHandler.removeMessages(4102);
                dispatchResult(-17);
            }
        }
    }

    private void recvDevConfirmation(byte[] bArr) {
        BluetoothMyLogger.v("BleStandardAuthRegisterConnector recvDevConfirmation ...");
        this.mDevConfirmation = bArr;
        this.mHandler.removeMessages(4102);
        if (!ByteUtils.isEmpty(this.mAppConfirmation)) {
            BluetoothService.getReportCoreProvider().finishAction(21);
            sendAppConfirmation();
        } else {
            BluetoothService.getReportCoreProvider().addContextByActionCode(21, "msg", "app confirm is empty");
            BluetoothService.getReportCoreProvider().finishAction(21, 105);
            dispatchResult(-48);
        }
    }

    private void recvDevRandom(final byte[] bArr) {
        BluetoothMyLogger.v("BleStandardAuthRegisterConnector recvDevRandom ...");
        this.mHandler.removeMessages(4102);
        BluetoothService.getReportCoreProvider().finishAction(19);
        BluetoothService.getReportCoreProvider().startAction(20);
        if (writeChannel(this.mAppRandom, 11, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.18
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                BluetoothMyLogger.v("BleStandardAuthRegisterConnector recvDevRandom onResponse: " + Code.toString(i));
                if (i != 0) {
                    BluetoothService.getReportCoreProvider().finishAction(20, 2);
                    BleStandardAuthRegisterConnector.this.dispatchResult(-28);
                    return;
                }
                if (ByteUtils.isEmpty(BleStandardAuthRegisterConnector.this.mOOB)) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(20, "msg", "oob is empty");
                    BluetoothService.getReportCoreProvider().finishAction(20, 2);
                    BluetoothMyLogger.v("BleStandardAuthRegisterConnector recvDevRandom mOOB is empty");
                    BleStandardAuthRegisterConnector.this.writeBindResultToDevice(false, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.18.1
                        @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                        public void onResponse(int i2, Void r2) {
                            BleStandardAuthRegisterConnector.this.dispatchResult(-49);
                        }
                    });
                    return;
                }
                byte[] bArr2 = new byte[32];
                System.arraycopy(bArr, 0, bArr2, 0, 16);
                System.arraycopy(BleStandardAuthRegisterConnector.this.mOOB, 0, bArr2, 16, 16);
                if (ByteUtils.byteEquals(BleStandardAuthRegisterConnector.this.mDevConfirmation, SecurityChipUtil.sha256HMAC(BleStandardAuthRegisterConnector.this.eShareKey.getEncoded(), bArr2))) {
                    BluetoothService.getReportCoreProvider().finishAction(20);
                    BleStandardAuthRegisterConnector.this.startBindAfterAuthSuccess();
                } else {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(20, "msg", "dev confirm not match");
                    BluetoothService.getReportCoreProvider().finishAction(20, 2);
                    BleStandardAuthRegisterConnector.this.writeBindResultToDevice(false, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.18.2
                        @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                        public void onResponse(int i2, Void r2) {
                            BleStandardAuthRegisterConnector.this.dispatchResult(-49);
                        }
                    });
                }
            }
        })) {
            return;
        }
        BluetoothService.getReportCoreProvider().finishAction(20, 2);
        dispatchResult(-28);
    }

    private void recvDeviceInfo(byte[] bArr) {
        BluetoothMyLogger.v("BleStandardAuthRegisterConnector recvDeviceInfo ...");
        if (bArr.length < 4) {
            BluetoothService.getReportCoreProvider().addContextByActionCode(15, "msg", "receive data wrong format");
            BluetoothService.getReportCoreProvider().finishAction(38, 105);
            BluetoothMyLogger.e("BleStandardAuthRegisterConnector recvDeviceInfo data format error");
            dispatchResult(-47);
            return;
        }
        int i = bArr[0] + (bArr[1] << 8);
        this.mCurrentStandardAuthVersion = i;
        if (i > 3) {
            BluetoothService.getReportCoreProvider().addContextByActionCode(15, "msg", "version not support");
            BluetoothService.getReportCoreProvider().finishAction(38, 104);
            dispatchResult(-37);
            return;
        }
        BluetoothService.getReportCoreProvider().finishAction(38);
        byte[] bArr2 = {bArr[2], bArr[3]};
        this.mInputCapability = getInt(bArr2[0], 0, 3);
        this.mOutputCapability = getInt(bArr2[0], 4, 7);
        if (bArr.length > 4) {
            if (this.mCurrentStandardAuthVersion < 3) {
                this.mTempDeviceId = ByteUtils.cutBeforeBytes(Arrays.copyOfRange(bArr, 4, bArr.length), (byte) 0);
            } else {
                this.mTempDeviceId = ByteUtils.cutBeforeBytes(Arrays.copyOfRange(bArr, 4, 24), (byte) 0);
                if (ByteUtils.parseDevInfoFeature(Arrays.copyOfRange(bArr, 24, 26))[0] == 1) {
                    BluetoothCache.setSupportReportDeviceLog(getMac(), true);
                }
            }
        }
        sendRegStart(new byte[]{bArr[2], bArr[3]});
    }

    private void recvDevicePubKey(byte[] bArr) {
        BluetoothMyLogger.v("BleStandardAuthRegisterConnector recvDevicePubKey ...");
        this.mHandler.removeMessages(4102);
        BluetoothService.getReportCoreProvider().finishAction(17);
        this.mDevicePubInfo = bArr;
        byte[] bArr2 = new byte[65];
        bArr2[0] = 4;
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        try {
            this.mDevicePubKey = ECCPointConvert.fromUncompressedPoint(bArr2, ((ECPublicKey) this.mRegisterAppKeyPair.getPublic()).getParams());
        } catch (Exception e) {
            e.printStackTrace();
        }
        verifyDeviceParams();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestDeviceInfo() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothService.getReportCoreProvider().startAction(15);
        BluetoothMyLogger.v("BleStandardAuthRegisterConnector requestDeviceInfo ...");
        BleConnectManager.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, REQ_DEV_INFO, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.6
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r4) {
                BluetoothMyLogger.v("BleStandardAuthRegisterConnector requestDeviceInfo onResponse: " + Code.toString(i));
                if (i != 0) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(15, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(15, 2);
                    BleStandardAuthRegisterConnector.this.dispatchResult(-28);
                } else {
                    BluetoothService.getReportCoreProvider().finishAction(15);
                    BluetoothService.getReportCoreProvider().startAction(38);
                    ((BleSecurityConnector) BleStandardAuthRegisterConnector.this).mHandler.removeMessages(4102);
                    ((BleSecurityConnector) BleStandardAuthRegisterConnector.this).mHandler.sendEmptyMessageDelayed(4102, 15000L);
                }
            }
        });
    }

    private void sendAppConfirmation() {
        BluetoothMyLogger.v("BleStandardAuthRegisterConnector sendAppConfirmation ...");
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothService.getReportCoreProvider().startAction(18);
        if (ByteUtils.isEmpty(this.mAppConfirmation)) {
            BluetoothService.getReportCoreProvider().addContextByActionCode(18, "msg", "app confirm is empty");
            BluetoothService.getReportCoreProvider().finishAction(18);
            BluetoothMyLogger.v("BleStandardAuthRegisterConnector mAppConfirmation is null ...");
            dispatchResult(-51);
            return;
        }
        if (writeChannel(this.mAppConfirmation, 10, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.17
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                BluetoothMyLogger.v("BleStandardAuthRegisterConnector sendAppConfirmation onResponse: " + Code.toString(i));
                if (i != 0) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(18, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(18);
                    BleStandardAuthRegisterConnector.this.dispatchResult(-28);
                } else {
                    BluetoothService.getReportCoreProvider().finishAction(18);
                    BluetoothService.getReportCoreProvider().startAction(19);
                    ((BleSecurityConnector) BleStandardAuthRegisterConnector.this).mHandler.removeMessages(4102);
                    ((BleSecurityConnector) BleStandardAuthRegisterConnector.this).mHandler.sendEmptyMessageDelayed(4102, 15000L);
                }
            }
        })) {
            return;
        }
        BluetoothService.getReportCoreProvider().finishAction(18, 2);
        dispatchResult(-28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAppPublicKey() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleStandardAuthRegisterConnector sendAppPublicKey ...");
        this.mRegisterAppKeyPair = SecurityChipUtil.generateEcc256KeyPair();
        BluetoothService.getReportCoreProvider().startAction(16);
        if (writeChannel(SecurityChipUtil.getRawPublicKey(this.mRegisterAppKeyPair.getPublic()), 3, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.8
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                BluetoothMyLogger.v("BleStandardAuthRegisterConnector sendAppPublicKey onResponse: " + Code.toString(i));
                if (i != 0) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(16, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(16, 2);
                    BleStandardAuthRegisterConnector.this.dispatchResult(-28);
                } else {
                    BluetoothService.getReportCoreProvider().finishAction(16);
                    BluetoothService.getReportCoreProvider().startAction(17);
                    ((BleSecurityConnector) BleStandardAuthRegisterConnector.this).mHandler.removeMessages(4102);
                    ((BleSecurityConnector) BleStandardAuthRegisterConnector.this).mHandler.sendEmptyMessageDelayed(4102, 15000L);
                }
            }
        })) {
            return;
        }
        BluetoothService.getReportCoreProvider().finishAction(16, 2);
        dispatchResult(-28);
    }

    private void sendRegStart(byte[] bArr) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        byte[] bArr2 = {21, bArr[0], bArr[1], 0};
        BluetoothService.getReportCoreProvider().startAction(4);
        BluetoothMyLogger.v("BleStandardAuthRegisterConnector sendRegStart ...");
        BluetoothService.getReportCoreProvider().addContextByActionCode(4, "data", ByteUtils.byteToString(bArr2));
        BleConnectManager.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, bArr2, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.7
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r4) {
                BluetoothMyLogger.v("BleStandardAuthRegisterConnector sendRegStart onResponse: " + Code.toString(i));
                if (i == 0) {
                    BluetoothService.getReportCoreProvider().finishAction(4);
                    BleStandardAuthRegisterConnector.this.sendAppPublicKey();
                } else {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(4, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(4);
                    BleStandardAuthRegisterConnector.this.dispatchResult(-28);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startBindAfterAuthSuccess() {
        BluetoothMyLogger.v("BleStandardAuthRegisterConnector startBindAfterAuthSuccess");
        byte[] bArrDeriveKeyFromOOB = deriveKeyFromOOB(this.eShareKey.getEncoded(), this.mOOB);
        byte[] bArr = new byte[12];
        this.mToken = bArr;
        System.arraycopy(bArrDeriveKeyFromOOB, 0, bArr, 0, 12);
        byte[] bArr2 = new byte[16];
        this.mBeaconKey = bArr2;
        System.arraycopy(bArrDeriveKeyFromOOB, 12, bArr2, 0, 16);
        byte[] bArr3 = new byte[16];
        this.mDeviceKey = bArr3;
        System.arraycopy(bArrDeriveKeyFromOOB, 28, bArr3, 0, 16);
        applyDid(this.mApplyDidResponse);
    }

    private void verifyDeviceParams() {
        BluetoothMyLogger.v("BleStandardAuthRegisterConnector verifyDeviceParams ...");
        BluetoothService.getReportCoreProvider().startAction(22);
        PublicKey publicKey = this.mDevicePubKey;
        if (publicKey == null) {
            BluetoothMyLogger.v("BleStandardAuthRegisterConnector mDevicePubKey is null ...");
            BluetoothService.getReportCoreProvider().addContextByActionCode(22, "msg", " dev pub key is empty");
            BluetoothService.getReportCoreProvider().finishAction(22, 10);
            dispatchResult(-51);
            return;
        }
        SecretKey secret = SecurityChipUtil.getSecret(publicKey, this.mRegisterAppKeyPair.getPrivate());
        this.eShareKey = secret;
        if (secret == null) {
            BluetoothMyLogger.v("BleStandardAuthRegisterConnector eShareKey is null ...");
            BluetoothService.getReportCoreProvider().addContextByActionCode(22, "msg", " eShare key is empty");
            BluetoothService.getReportCoreProvider().finishAction(22, 10);
            dispatchResult(-51);
            return;
        }
        if (this.mInputCapability != 0) {
            BluetoothService.getReportCoreProvider().addContextByActionCode(22, "msg", "not support input capability");
            BluetoothService.getReportCoreProvider().finishAction(22, 10);
            BluetoothMyLogger.v("BleStandardAuthRegisterConnectordon't support this input capability: " + this.mInputCapability);
            dispatchResult(-37);
            return;
        }
        int i = this.mOutputCapability;
        if (i == 0) {
            this.mOOB = new byte[16];
            startBindAfterAuthSuccess();
            return;
        }
        if (i != 8) {
            BluetoothService.getReportCoreProvider().addContextByActionCode(22, "msg", "not support output capability");
            BluetoothService.getReportCoreProvider().finishAction(22, 10);
            BluetoothMyLogger.v("BleStandardAuthRegisterConnector don't support this output capability: " + this.mOutputCapability);
            dispatchResult(-37);
            return;
        }
        if (TextUtils.isEmpty(this.mQrcodeOob)) {
            BluetoothService.getReportCoreProvider().addContextByActionCode(22, "msg", "QrCodeOOB is empty");
            BluetoothService.getReportCoreProvider().finishAction(22, 10);
            BluetoothMyLogger.v("BleStandardAuthRegisterConnector  get qrcode oob failed");
            dispatchResult(-50);
            return;
        }
        BluetoothService.getReportCoreProvider().finishAction(22);
        BluetoothService.getReportCoreProvider().startAction(21);
        this.mOOB = new byte[16];
        byte[] bArrStringToBytes = ByteUtils.stringToBytes(this.mQrcodeOob);
        System.arraycopy(bArrStringToBytes, 0, this.mOOB, 0, Math.min(bArrStringToBytes.length, 16));
        byte[] bArrGenerateAppRandom = generateAppRandom();
        this.mAppRandom = bArrGenerateAppRandom;
        byte[] bArr = new byte[32];
        System.arraycopy(bArrGenerateAppRandom, 0, bArr, 0, 16);
        System.arraycopy(this.mOOB, 0, bArr, 16, 16);
        this.mAppConfirmation = SecurityChipUtil.sha256HMAC(this.eShareKey.getEncoded(), bArr);
        this.mHandler.removeMessages(4102);
        this.mHandler.sendEmptyMessageDelayed(4102, 15000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeBindResultToDevice(boolean z, final BleWriteResponse bleWriteResponse) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        byte[] bArr = z ? REG_VERIFY_SUCCESS : REG_VERIFY_FAILED;
        BluetoothMyLogger.w(String.format("BleStandardAuthRegisterConnector writeBindResultToDevice : %s", ByteUtils.byteToString(bArr)));
        BluetoothService.getReportCoreProvider().startAction(13);
        BleConnectManager.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, bArr, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.9
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r6) {
                if (i == 0) {
                    BluetoothService.getReportCoreProvider().finishAction(13);
                    BluetoothService.getReportCoreProvider().startAction(14);
                } else {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(13, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(13);
                }
                BleWriteResponse bleWriteResponse2 = bleWriteResponse;
                if (bleWriteResponse2 != null) {
                    bleWriteResponse2.onResponse(i, r6);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeDidToDevice(byte[] bArr, final BleWriteResponse bleWriteResponse) {
        byte[] totalData;
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothService.getReportCoreProvider().startAction(11);
        byte[] bArr2 = {16, 17, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 20, 21, 22, 23, 24, 25, 26, 27};
        try {
            totalData = SecurityChipUtil.AESEncryptWithAuth(new SecretKeySpec(this.mDeviceKey, "AES"), bArr2, bArr, "devID".getBytes()).getTotalData();
        } catch (Exception e) {
            e.printStackTrace();
            totalData = null;
        }
        if (totalData == null) {
            BluetoothService.getReportCoreProvider().addContextByActionCode(11, "msg", "encrypt did is empty");
            BluetoothService.getReportCoreProvider().finishAction(11, 2);
            BluetoothMyLogger.e("BleStandardAuthRegisterConnector encrypt did failed");
            dispatchResult(-51);
            return;
        }
        BluetoothMyLogger.v("BleStandardAuthRegisterConnector start writeDidToDevice");
        if (writeChannel(totalData, 0, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.11
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                BluetoothMyLogger.v("BleStandardAuthRegisterConnector writeDidToDevice onResponse: " + Code.toString(i));
                if (i == 0) {
                    BluetoothService.getReportCoreProvider().finishAction(11);
                } else {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(11, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(11, 2);
                }
                BleWriteResponse bleWriteResponse2 = bleWriteResponse;
                if (bleWriteResponse2 != null) {
                    bleWriteResponse2.onResponse(i, null);
                }
            }
        })) {
            return;
        }
        BluetoothService.getReportCoreProvider().finishAction(11, 2);
        dispatchResult(-28);
    }

    public byte[] getDeviceDIDBytes() {
        byte[] bArr = this.mTempDeviceId;
        return bArr != null ? ByteUtils.fillBeforeBytes(bArr, 20, (byte) 0) : new byte[20];
    }

    public String getDidText() {
        return ByteUtils.isEmpty(this.mTempDeviceId) ? "" : new String(this.mTempDeviceId);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public byte[] getGeneratedToken() {
        return this.mToken;
    }

    public int getInt(int i, int i2, int i3) {
        return (i >> i2) & ((1 << ((i3 - i2) + 1)) - 1);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthConnector
    public void onChannelRead(byte[] bArr, int i) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        if (i == 0) {
            recvDeviceInfo(bArr);
            return;
        }
        if (i == 3) {
            recvDevicePubKey(bArr);
        } else if (i == 12) {
            recvDevConfirmation(bArr);
        } else {
            if (i != 13) {
                return;
            }
            recvDevRandom(bArr);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthConnector, com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processHandlerMessage(Message message) {
        if (message.what != 4102) {
            return;
        }
        BluetoothMyLogger.w("BleStandardAuthRegisterConnector notify timeout");
        dispatchResult(-55);
        BluetoothService.getReportCoreProvider().finishCurrentActionWithResult(8);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthConnector, com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        UUID uuid3 = BluetoothConstants.MISERVICE;
        if (uuid.equals(uuid3) && uuid2.equals(BluetoothConstants.CHARACTER_AUTH)) {
            receiveDeviceResult(bArr);
        } else if (uuid.equals(uuid3) && uuid2.equals(BluetoothConstants.CHARACTER_STANDARD_AUTH)) {
            super.processNotify(uuid, uuid2, bArr);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processStep1() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleStandardAuthRegisterConnector Process Step 1 ...");
        BluetoothCache.setPropSessionKeyBytes(getMac(), "".getBytes());
        openStandardAuthNotify(new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.4
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r3) {
                BluetoothMyLogger.v("BleStandardAuthRegisterConnector Step 1 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleStandardAuthRegisterConnector.this.processStep1Plus();
                } else {
                    BleStandardAuthRegisterConnector.this.dispatchResult(-27);
                }
            }
        });
    }

    public void unbindDeviceIfNeed() {
        if (this.mCurrentStandardAuthVersion != 2 || TextUtils.isEmpty(this.mCloudCert)) {
            return;
        }
        DeviceApi.unbindDevice(getDidText(), BluetoothCache.getPropProductId(getMac()), new BleAsyncCallback<Boolean, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.16
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onFailure(BleNetError bleNetError) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onSuccess(Boolean bool) {
            }
        });
        BluetoothCache.setPropName(getMac(), "");
        BluetoothCache.setPropBoundStatus(getMac(), 0);
    }

    public void writeCloudCert2Device() throws Throwable {
        byte[] bArrDecode = Base64Coder.decode(this.mCloudCert, 24);
        writeLog("writeCloudCert2Device cloud cert=%s", ByteUtils.byteToString(bArrDecode));
        if (writeChannel(bArrDecode, 7, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.15
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                if (i == 0) {
                    BluetoothService.getReportCoreProvider().startAction(14);
                    ((BleSecurityConnector) BleStandardAuthRegisterConnector.this).mHandler.removeMessages(4102);
                    ((BleSecurityConnector) BleStandardAuthRegisterConnector.this).mHandler.sendEmptyMessageDelayed(4102, 15000L);
                    return;
                }
                BleStandardAuthRegisterConnector.this.writeLog("writeCloudCert fail ,code=" + i, new Object[0]);
                BleStandardAuthRegisterConnector.this.unbindDeviceIfNeed();
                BleStandardAuthRegisterConnector.this.dispatchResult(-28);
            }
        })) {
            return;
        }
        writeLog("writeCloudCert fail", new Object[0]);
        unbindDeviceIfNeed();
        dispatchResult(-28);
    }

    public void writeEncryptData() {
        if (writeChannel(this.mEncryptData, 0, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegisterConnector.14
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws Throwable {
                if (i == 0) {
                    BleStandardAuthRegisterConnector.this.writeCloudCert2Device();
                    return;
                }
                BleStandardAuthRegisterConnector.this.writeLog("write EncryptData Fail ,code=" + i, new Object[0]);
                BleStandardAuthRegisterConnector.this.unbindDeviceIfNeed();
                BleStandardAuthRegisterConnector.this.dispatchResult(-28);
            }
        })) {
            return;
        }
        writeLog("writeEncryptData fail", new Object[0]);
        unbindDeviceIfNeed();
        dispatchResult(-28);
    }

    public void writeLog(String str, Object... objArr) {
        String str2 = TAG + str;
        if (objArr == null || objArr.length <= 0) {
            MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, "core-bluetooth", str2);
        } else {
            MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, "core-bluetooth", String.format(str2, objArr));
        }
    }
}
