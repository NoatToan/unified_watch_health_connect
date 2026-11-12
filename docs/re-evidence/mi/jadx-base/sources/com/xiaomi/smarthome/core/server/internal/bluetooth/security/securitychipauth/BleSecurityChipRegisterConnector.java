package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.smarthome.core.entity.device.BtDevice;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetError;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.IBleDeviceLauncher;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboWifiConfig;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.ECCPointConvert;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.Hkdf;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.MijiaRootCertUtil;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.SecurityChipUtil;
import com.xiaomi.smarthome.core.server.internal.util.LtmkEncryptUtil;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.Code;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleNotifyResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import com.xiaomi.smarthome.library.crypto.Base64Coder;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.UUID;
import javax.crypto.SecretKey;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class BleSecurityChipRegisterConnector extends BleSecurityChipConnector {
    private static final int DEVICE_MAJOR_VERSION_2_1 = 2001;
    private static final int MSG_NOTIFY_TIMEOUT = 4098;
    private static final int MSG_PAIR_CODE_TIMEOUT = 4099;
    private static final int PAIR_CODE_EXPIRED_TIME = 30000;
    private static final short PROTOCOL_VERSION_1_1 = 257;
    private static final short PROTOCOL_VERSION_2_0 = 512;
    private static final short PROTOCOL_VERSION_2_2 = 514;
    private static final short PROTOCOL_VERSION_2_3 = 515;
    private static final short PROTOCOL_VERSION_2_4 = 516;
    private static final short PROTOCOL_VERSION_2_5 = 517;
    private static final short PROTOCOL_VERSION_2_6 = 518;
    private static final String TAG = "BleSecurityChipRegisterConnector";
    private SecretKey eShareKey;
    private byte[] mAppConfirmation;
    private byte[] mAppRandom;
    private byte[] mBeaconKey;
    private String mBindKey;
    private BleComboWifiConfig mBleWifiConfig;
    private String mCloudCert;
    private byte[] mCloudKey;
    private int mDefaultFailedCode;
    private X509Certificate mDevCert;
    private byte[] mDevCertRaw;
    private byte[] mDevConfirmation;
    private String mDevSignatureBase64;
    private byte[] mDevicePubInfo;
    private PublicKey mDevicePubKey;
    private byte[] mEncryptData;
    private byte[] mLTMK;
    private byte[] mMSCInfo;
    private X509Certificate mManuCert;
    private byte[] mManuCertRaw;
    private byte[] mOOB;
    private String mQrcodeOob;
    private KeyPair mRegisterAppKeyPair;
    private String mSignDataBase64;
    private byte[] mToken;
    private static final byte[] OLD_REG_START = {16, 0, 0, 0};
    private static final byte[] NEW_REG_START_MANUAL = {16, 1, 0, 0};
    private static final byte[] NEW_REG_START_SCAN = {16, -128, 0, 0};
    private static final byte[] REG_SUCCESS = {17, 0, 0, 0};
    private static final byte[] REG_FAILED = {HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, 0, 0, 0};
    private static final byte[] REG_VERIFY_SUCCESS = {HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 0, 0, 0};
    private static final byte[] REG_VERIFY_FAILED = {20, 0, 0, 0};
    private static final byte[] ERR_REGISTERED = {-31, 0, 0, 0};

    public BleSecurityChipRegisterConnector(IBleDeviceLauncher iBleDeviceLauncher, BleConnectOptions bleConnectOptions) {
        super(iBleDeviceLauncher);
        this.mDefaultFailedCode = -7;
        if (bleConnectOptions != null) {
            this.mQrcodeOob = bleConnectOptions.getQrcodeOob();
            this.mBleWifiConfig = bleConnectOptions.getBleComboWifiConfig();
        }
    }

    private void bindLtmkToServer() {
        this.mToken = getTokenFromLtmk(this.mLTMK);
        String propModel = BluetoothCache.getPropModel(getMac());
        String strEncodeBytes = Base64Coder.encodeBytes(this.mDevCertRaw, 24);
        String strEncodeBytes2 = Base64Coder.encodeBytes(this.mManuCertRaw, 24);
        final String newDeviceName = getNewDeviceName(BluetoothService.getBleCoreProvider().getPluginNameByModel(propModel), propModel);
        BluetoothMyLogger.v(String.format("bindLtmkToServer name = %s, did = %s, mac = %s, model = %s", newDeviceName, getDeviceDid(), BluetoothMyLogger.getBase64(getMac()), propModel));
        String strByteToString = !ByteUtils.isEmpty(this.mBeaconKey) ? ByteUtils.byteToString(this.mBeaconKey) : "";
        String strByteToString2 = !ByteUtils.isEmpty(this.mCloudKey) ? ByteUtils.byteToString(this.mCloudKey) : "";
        final int propLtmkEncryptType = BluetoothCache.getPropLtmkEncryptType(getMac());
        BluetoothService.getReportCoreProvider().startAction(12);
        DeviceApi.securityChipBindLtmkToServer(getMac(), propModel, ByteUtils.byteToString(this.mToken), ByteUtils.byteToString(this.mLTMK), strEncodeBytes, strEncodeBytes2, strByteToString, strByteToString2, propLtmkEncryptType, this.mDevSignatureBase64, this.mSignDataBase64, this.mBindKey, new BleAsyncCallback<Boolean, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegisterConnector.16
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onFailure(BleNetError bleNetError) {
                BluetoothMyLogger.e(">>> securityChipBindLtmkToServer onFailure: " + bleNetError);
                if (bleNetError != null) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(12, "msg", bleNetError.toString());
                    BluetoothService.getReportCoreProvider().finishAction(12, 11);
                }
                if (bleNetError.getCode() != -1) {
                    BleSecurityChipRegisterConnector.this.sendRegisterResult(false, -26);
                    return;
                }
                String detail = bleNetError.getDetail();
                if (TextUtils.isEmpty(detail) || detail.contains("Unable to resolve")) {
                    BleSecurityChipRegisterConnector.this.sendRegisterResult(false, -26);
                } else {
                    ((BleSecurityConnector) BleSecurityChipRegisterConnector.this).mBundle.putString("key_device_did", BleSecurityChipRegisterConnector.this.getDeviceDid());
                    BleSecurityChipRegisterConnector.this.sendRegisterResult(false, -14);
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onSuccess(Boolean bool) {
                BluetoothMyLogger.v(">>> securityChipBindLtmkToServer onSuccess " + bool);
                if (!bool.booleanValue()) {
                    BluetoothService.getReportCoreProvider().finishAction(12, 11);
                    BleSecurityChipRegisterConnector.this.sendRegisterResult(false, -26);
                    return;
                }
                BluetoothService.getReportCoreProvider().finishAction(12);
                BluetoothCache.setPropName(BleSecurityChipRegisterConnector.this.getMac(), newDeviceName);
                BluetoothCache.setPropBoundStatus(BleSecurityChipRegisterConnector.this.getMac(), 2);
                BleSecurityChipRegisterConnector.this.sendRegisterResult(true, 0);
                if (propLtmkEncryptType != 0) {
                    DeviceApi.setShowSecurePin(BleSecurityChipRegisterConnector.this.getDeviceDid(), BluetoothCache.isShowPincode(BleSecurityChipRegisterConnector.this.getMac()));
                }
            }
        });
    }

    private void bindLtmkToServerV205() {
        this.mToken = getTokenFromLtmk(this.mLTMK);
        String propModel = BluetoothCache.getPropModel(getMac());
        String strEncodeBytes = Base64Coder.encodeBytes(this.mDevCertRaw, 24);
        String strEncodeBytes2 = Base64Coder.encodeBytes(this.mManuCertRaw, 24);
        final String newDeviceName = getNewDeviceName(BluetoothService.getBleCoreProvider().getPluginNameByModel(propModel), propModel);
        BluetoothMyLogger.v(String.format("bindLtmkToServerV205 name = %s, did = %s, mac = %s, model = %s", newDeviceName, getDeviceDid(), BluetoothMyLogger.getBase64(getMac()), propModel));
        String strByteToString = !ByteUtils.isEmpty(this.mBeaconKey) ? ByteUtils.byteToString(this.mBeaconKey) : "";
        String strByteToString2 = !ByteUtils.isEmpty(this.mCloudKey) ? ByteUtils.byteToString(this.mCloudKey) : "";
        final int propLtmkEncryptType = BluetoothCache.getPropLtmkEncryptType(getMac());
        BluetoothService.getReportCoreProvider().startAction(12);
        this.mCloudCert = null;
        this.mEncryptData = null;
        DeviceApi.securityChipBindLtmkToServerV205(getMac(), propModel, ByteUtils.byteToString(this.mToken), ByteUtils.byteToString(this.mLTMK), strEncodeBytes, strEncodeBytes2, strByteToString, strByteToString2, propLtmkEncryptType, this.mDevSignatureBase64, this.mSignDataBase64, this.mBindKey, new BleAsyncCallback<JSONObject, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegisterConnector.15
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onFailure(BleNetError bleNetError) {
                BluetoothMyLogger.e(">>> bindLtmkToServerV205 onFailure: " + bleNetError);
                if (bleNetError != null) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(12, "msg", bleNetError.toString());
                    BluetoothService.getReportCoreProvider().finishAction(12, 11);
                }
                if (bleNetError.getCode() != -1) {
                    BleSecurityChipRegisterConnector.this.sendRegisterResult(false, -26);
                    return;
                }
                String detail = bleNetError.getDetail();
                if (TextUtils.isEmpty(detail) || detail.contains("Unable to resolve")) {
                    BleSecurityChipRegisterConnector.this.sendRegisterResult(false, -26);
                } else {
                    ((BleSecurityConnector) BleSecurityChipRegisterConnector.this).mBundle.putString("key_device_did", BleSecurityChipRegisterConnector.this.getDeviceDid());
                    BleSecurityChipRegisterConnector.this.sendRegisterResult(false, -14);
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onSuccess(JSONObject jSONObject) {
                boolean zOptBoolean = jSONObject.optBoolean("success");
                String strOptString = jSONObject.optString("cloud_cert");
                String strOptString2 = jSONObject.optString("cloud_sign");
                int iOptInt = jSONObject.optInt("utc");
                BluetoothMyLogger.v(">>> bindLtmkToServerV205 onSuccess " + jSONObject);
                if (!zOptBoolean) {
                    BluetoothService.getReportCoreProvider().finishAction(12, 11);
                    BleSecurityChipRegisterConnector.this.sendRegisterResult(false, -26);
                    return;
                }
                BluetoothService.getReportCoreProvider().finishAction(12);
                BluetoothCache.setPropName(BleSecurityChipRegisterConnector.this.getMac(), newDeviceName);
                BluetoothCache.setPropBoundStatus(BleSecurityChipRegisterConnector.this.getMac(), 2);
                BleSecurityChipRegisterConnector.this.mCloudCert = strOptString;
                BleSecurityChipRegisterConnector bleSecurityChipRegisterConnector = BleSecurityChipRegisterConnector.this;
                bleSecurityChipRegisterConnector.mEncryptData = bleSecurityChipRegisterConnector.buildEncryptData(strOptString2, iOptInt);
                BleSecurityChipRegisterConnector.this.sendRegisterResult(true, 0);
                if (propLtmkEncryptType != 0) {
                    DeviceApi.setShowSecurePin(BleSecurityChipRegisterConnector.this.getDeviceDid(), BluetoothCache.isShowPincode(BleSecurityChipRegisterConnector.this.getMac()));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] buildEncryptData(String str, int i) throws Throwable {
        byte[] bArr = new byte[76];
        byte[] deviceDIDBytes = getDeviceDIDBytes();
        byte[] bArrDecode = Base64Coder.decode(str, 24);
        writeLog("utc =%d", Integer.valueOf(i));
        System.arraycopy(deviceDIDBytes, 0, bArr, 0, 8);
        System.arraycopy(bArrDecode, 0, bArr, 8, 64);
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt(i);
        byte[] bArrArray = byteBufferOrder.array();
        System.arraycopy(bArrArray, 0, bArr, 72, 4);
        byte[] bArrAESEncrypt = SecurityChipUtil.AESEncrypt(this.mCloudKey, new byte[]{16, 17, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 20, 21, 22, 23, 24, 25, 26, 27}, bArr);
        writeLog("buildEncryptData===>\nutc=%s", ByteUtils.byteToString(bArrArray));
        writeLog("buildEncryptData===> \nsign=%s,\n deviceID=%s", ByteUtils.byteToString(bArrDecode), ByteUtils.byteToString(deviceDIDBytes));
        writeLog("buildEncryptData===> \ncloudKey=%s\n, plain=%s", ByteUtils.byteToString(this.mCloudKey), ByteUtils.byteToString(bArr));
        writeLog("buildEncryptData===> data length=%d,\ndata=%s", Integer.valueOf(bArrAESEncrypt.length), ByteUtils.byteToString(bArrAESEncrypt));
        return bArrAESEncrypt;
    }

    private byte[] deriveLongTermpreMasterKey(byte[] bArr) {
        try {
            Hkdf hkdf = Hkdf.getInstance("HmacSHA256");
            hkdf.init(bArr, "smartcfg-masterkey-salt".getBytes());
            return hkdf.deriveKey("smartcfg-masterkey-info".getBytes(), 32);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private byte[] deriveLtmkAndBaconKeyFromOOB(byte[] bArr, byte[] bArr2) {
        try {
            Hkdf hkdf = Hkdf.getInstance("HmacSHA256");
            hkdf.init(bArr, bArr2);
            return hkdf.deriveKey("smartcfg-setup-info".getBytes(), 64);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private byte[] deriveLtmkFromOOB(byte[] bArr, byte[] bArr2) {
        try {
            Hkdf hkdf = Hkdf.getInstance("HmacSHA256");
            hkdf.init(bArr, bArr2);
            return hkdf.deriveKey("smartcfg-setup-info".getBytes(), 32);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private byte[] deriveRegSessionKey(byte[] bArr) {
        try {
            Hkdf hkdf = Hkdf.getInstance("HmacSHA256");
            hkdf.init(bArr, "smartcfg-setup-salt".getBytes());
            return hkdf.deriveKey("smartcfg-setup-info".getBytes(), 64);
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

    private String generateRandomPaircode() {
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            stringBuffer.append(random.nextInt(10));
        }
        return stringBuffer.toString();
    }

    private String getNewDeviceName(String str, String str2) {
        int i;
        ArrayList<BtDevice> remoteBoundedDevices = BluetoothApi.getRemoteBoundedDevices();
        ArrayList arrayList = new ArrayList();
        for (BtDevice btDevice : remoteBoundedDevices) {
            if (TextUtils.equals(str2, btDevice.getModel())) {
                arrayList.add(btDevice);
            }
        }
        if (arrayList.size() > 0) {
            boolean z = false;
            i = 1;
            while (!z) {
                String str3 = i == 1 ? str : str + i;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    if (TextUtils.equals(str3, ((BtDevice) it.next()).getName())) {
                        i++;
                        z = false;
                        break;
                    }
                }
            }
        } else {
            i = 1;
        }
        if (i == 1) {
            return str;
        }
        return str + i;
    }

    private short getProtocolVersion() {
        return ByteBuffer.wrap(Arrays.copyOfRange(this.mMSCInfo, 10, 12)).order(ByteOrder.LITTLE_ENDIAN).getShort();
    }

    private byte[] getTokenFromLtmk(byte[] bArr) {
        int i = this.mBleWifiConfig != null ? 16 : 12;
        try {
            return Arrays.copyOfRange(Coder.sha256Hash(bArr), 0, i);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            return Arrays.copyOfRange(bArr, 0, i);
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return Arrays.copyOfRange(bArr, 0, i);
        }
    }

    private boolean isSupportVersion() {
        short protocolVersion = getProtocolVersion();
        if (protocolVersion != 257 && protocolVersion != 512) {
            switch (protocolVersion) {
                case SportSummary.VRESION_202 /* 514 */:
                case SportSummary.VERSION_203 /* 515 */:
                case SportSummary.VRESION_204 /* 516 */:
                case SportSummary.VERSION_205 /* 517 */:
                case SportSummary.VERSION_206 /* 518 */:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processDeviceAuthComplete(boolean z) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleSecurityChipRegisterConnector processDeviceAuthComplete ..., isRegisterSuccess = " + z);
        if (z) {
            if (getProtocolVersion() == 517 || getProtocolVersion() == 518) {
                bindLtmkToServerV205();
                return;
            } else {
                bindLtmkToServer();
                return;
            }
        }
        if (ByteUtils.isEmpty(this.mOOB)) {
            sendRegisterResult(false, -20);
        } else {
            BluetoothService.getReportCoreProvider().addContextByActionCode(44, "msg", "retry input PIN-CODE");
            sendRegisterResult(false, -34);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processStep1Plus() {
        if (isCanceled()) {
            dispatchResult(-2);
        } else {
            BluetoothMyLogger.v("BleSecurityChipRegisterConnector Process Step 1 plus ...");
            openAuthNotify(new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegisterConnector.2
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, Void r3) {
                    BluetoothMyLogger.v("BleSecurityChipRegisterConnector Step 1 plus onResponse: " + Code.toString(i));
                    if (i == 0) {
                        BleSecurityChipRegisterConnector.this.processStep2();
                    } else {
                        BleSecurityChipRegisterConnector.this.dispatchResult(-27);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processStep2() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleSecurityChipRegisterConnector Process Step 2 ...");
        BluetoothService.getReportCoreProvider().startAction(40);
        getBleLockFirmwareVersion(getMac(), new BleResponse<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegisterConnector.3
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, String str) {
                if (i != 0 || TextUtils.isEmpty(str)) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(40, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(40, 2);
                    BleSecurityChipRegisterConnector.this.dispatchResult(-36);
                    return;
                }
                BluetoothMyLogger.v("BleSecurityChipRegisterConnector version: " + str);
                String[] strArrSplit = str.split("[._]");
                int iIntValue = 0;
                try {
                    iIntValue = strArrSplit.length == 1 ? Integer.valueOf(strArrSplit[0]).intValue() : (Integer.valueOf(strArrSplit[0]).intValue() * 1000) + Integer.valueOf(strArrSplit[1]).intValue();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                BluetoothService.getReportCoreProvider().addContextByActionCode(40, "version", str);
                BluetoothService.getReportCoreProvider().finishAction(40);
                BluetoothCache.setPropFirVersion(BleSecurityChipRegisterConnector.this.getMac(), str);
                if (iIntValue < 2001) {
                    BleSecurityChipRegisterConnector.this.sendRegStart(BleSecurityChipRegisterConnector.OLD_REG_START);
                } else if (TextUtils.isEmpty(BleSecurityChipRegisterConnector.this.mQrcodeOob)) {
                    BleSecurityChipRegisterConnector.this.sendRegStart(BleSecurityChipRegisterConnector.NEW_REG_START_MANUAL);
                } else {
                    BleSecurityChipRegisterConnector.this.sendRegStart(BleSecurityChipRegisterConnector.NEW_REG_START_SCAN);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processStep3() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleSecurityChipRegisterConnector Process Step 3 ...");
        this.mRegisterAppKeyPair = SecurityChipUtil.generateEcc256KeyPair();
        BluetoothService.getReportCoreProvider().startAction(16);
        if (writeChannel(SecurityChipUtil.getRawPublicKey(this.mRegisterAppKeyPair.getPublic()), 3, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegisterConnector.5
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                BluetoothMyLogger.v("BleSecurityChipRegisterConnector Step 3 onResponse: " + Code.toString(i));
                if (i != 0) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(16, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(16, 2);
                    BleSecurityChipRegisterConnector.this.dispatchResult(-28);
                } else {
                    BluetoothService.getReportCoreProvider().finishAction(16);
                    ((BleSecurityConnector) BleSecurityChipRegisterConnector.this).mHandler.removeMessages(4098);
                    BluetoothService.getReportCoreProvider().startAction(17);
                    ((BleSecurityConnector) BleSecurityChipRegisterConnector.this).mHandler.sendEmptyMessageDelayed(4098, 15000L);
                }
            }
        })) {
            return;
        }
        BluetoothService.getReportCoreProvider().finishAction(16, 2);
        dispatchResult(-28);
    }

    private void receiveDeviceResult(byte[] bArr) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleSecurityChipRegisterConnector receiveDeviceResult ..., value = " + ByteUtils.byteToString(bArr));
        BluetoothService.getReportCoreProvider().finishAction(14);
        if (ByteUtils.equals(bArr, REG_SUCCESS)) {
            this.mHandler.removeMessages(4098);
            this.mBundle.putByteArray(BluetoothConstants.KEY_LTMK, this.mLTMK);
            dispatchResult(0);
        } else {
            if (ByteUtils.equals(bArr, REG_FAILED)) {
                this.mHandler.removeMessages(4098);
                BluetoothService.getReportCoreProvider().addContextByActionCode(14, "msg", "reg failed");
                unbindDeviceIfNeed();
                dispatchResult(this.mDefaultFailedCode);
                return;
            }
            if (ByteUtils.equals(bArr, ERR_REGISTERED)) {
                this.mHandler.removeMessages(4098);
                BluetoothService.getReportCoreProvider().addContextByActionCode(14, "msg", "error:registered");
                dispatchResult(-17);
            }
        }
    }

    private void recvDevConfirmation(byte[] bArr) {
        BluetoothMyLogger.v("BleSecurityChipRegisterConnector recvDevConfirmation ...");
        this.mDevConfirmation = bArr;
        BluetoothService.getReportCoreProvider().finishAction(44);
        BluetoothService.getReportCoreProvider().finishAction(21);
        BluetoothService.getReportCoreProvider().startAction(18);
        if (writeChannel(this.mAppConfirmation, 10, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegisterConnector.7
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                BluetoothMyLogger.v("BleSecurityChipRegisterConnector recvDevConfirmation onResponse: " + Code.toString(i));
                if (i == 0) {
                    BluetoothService.getReportCoreProvider().finishAction(18);
                    BluetoothService.getReportCoreProvider().startAction(19);
                } else {
                    BleSecurityChipRegisterConnector.this.dispatchResult(-28);
                    BluetoothService.getReportCoreProvider().addContextByActionCode(18, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(18, 2);
                }
            }
        })) {
            return;
        }
        BluetoothService.getReportCoreProvider().finishAction(18, 2);
        dispatchResult(-28);
    }

    private void recvDevRandom(final byte[] bArr) {
        BluetoothMyLogger.v("BleSecurityChipRegisterConnector recvDevRandom ...");
        this.mHandler.removeMessages(4098);
        this.mHandler.removeMessages(4099);
        BluetoothService.getReportCoreProvider().finishAction(19);
        BluetoothService.getReportCoreProvider().startAction(20);
        if (writeChannel(this.mAppRandom, 11, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegisterConnector.8
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                BluetoothMyLogger.v("BleSecurityChipRegisterConnector recvDevRandom onResponse: " + Code.toString(i));
                if (i != 0) {
                    BleSecurityChipRegisterConnector.this.dispatchResult(-28);
                    BluetoothService.getReportCoreProvider().addContextByActionCode(20, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(20, 2);
                    return;
                }
                BluetoothService.getReportCoreProvider().finishAction(20);
                byte[] bArr2 = new byte[32];
                System.arraycopy(bArr, 0, bArr2, 0, 16);
                System.arraycopy(BleSecurityChipRegisterConnector.this.mOOB, 0, bArr2, 16, 16);
                if (ByteUtils.byteEquals(BleSecurityChipRegisterConnector.this.mDevConfirmation, SecurityChipUtil.sha256HMAC(BleSecurityChipRegisterConnector.this.eShareKey.getEncoded(), bArr2))) {
                    BleSecurityChipRegisterConnector.this.processDeviceAuthComplete(true);
                } else {
                    BleSecurityChipRegisterConnector.this.processDeviceAuthComplete(false);
                }
            }
        })) {
            return;
        }
        BluetoothService.getReportCoreProvider().finishAction(20, 2);
        dispatchResult(-28);
    }

    private void recvDeviceCert(byte[] bArr) {
        BluetoothMyLogger.v("BleSecurityChipRegisterConnector recvDeviceCert ...");
        this.mDevCertRaw = Arrays.copyOf(bArr, bArr.length);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        BluetoothService.getReportCoreProvider().finishAction(24);
        try {
            this.mDevCert = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream);
        } catch (CertificateException e) {
            e.printStackTrace();
        }
        BluetoothService.getReportCoreProvider().startAction(43);
        this.mHandler.removeMessages(4098);
        this.mHandler.sendEmptyMessageDelayed(4098, 15000L);
    }

    private void recvDeviceManuCert(byte[] bArr) {
        BluetoothMyLogger.v("BleSecurityChipRegisterConnector recvDeviceManuCert ...");
        BluetoothService.getReportCoreProvider().finishAction(43);
        this.mManuCertRaw = Arrays.copyOf(bArr, bArr.length);
        try {
            this.mManuCert = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        } catch (CertificateException e) {
            e.printStackTrace();
        }
        BluetoothService.getReportCoreProvider().startAction(29);
        this.mHandler.removeMessages(4098);
        this.mHandler.sendEmptyMessageDelayed(4098, 15000L);
    }

    private void recvDevicePubKey(byte[] bArr) {
        BluetoothMyLogger.v("BleSecurityChipRegisterConnector recvDevicePubKey ...");
        this.mMSCInfo = Arrays.copyOfRange(bArr, 0, 12);
        this.mDevicePubInfo = Arrays.copyOfRange(bArr, 12, 76);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 11, 76);
        bArrCopyOfRange[0] = 4;
        try {
            this.mDevicePubKey = ECCPointConvert.fromUncompressedPoint(bArrCopyOfRange, ((ECPublicKey) this.mRegisterAppKeyPair.getPublic()).getParams());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!isSupportVersion()) {
            BluetoothService.getReportCoreProvider().finishAction(17, 104);
            dispatchResult(-37);
            return;
        }
        BluetoothService.getReportCoreProvider().finishAction(17);
        if (516 <= getProtocolVersion()) {
            BluetoothService.getReportCoreProvider().startAction(41);
            DeviceApi.getBindKey(new BleAsyncCallback<String, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegisterConnector.6
                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                public void onFailure(BleNetError bleNetError) {
                    if (bleNetError != null) {
                        BluetoothService.getReportCoreProvider().addContextByActionCode(41, "msg", bleNetError.toString());
                    }
                    BluetoothService.getReportCoreProvider().finishAction(41, 11);
                    BluetoothMyLogger.d("BleSecurityChipRegisterConnector get bind key failed: " + bleNetError.toString());
                    BleSecurityChipRegisterConnector.this.dispatchResult(-46);
                }

                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                public void onSuccess(String str) {
                    if (TextUtils.isEmpty(str)) {
                        BluetoothService.getReportCoreProvider().finishAction(41, 11);
                        BluetoothMyLogger.d("BleSecurityChipRegisterConnector get bind key is empty");
                        BleSecurityChipRegisterConnector.this.dispatchResult(-46);
                    } else {
                        BluetoothService.getReportCoreProvider().finishAction(41);
                        BleSecurityChipRegisterConnector.this.mBindKey = str;
                        BleSecurityChipRegisterConnector.this.sendBindKey(str.getBytes());
                    }
                }
            });
        } else {
            this.mHandler.removeMessages(4098);
            BluetoothService.getReportCoreProvider().startAction(24);
            this.mHandler.sendEmptyMessageDelayed(4098, 15000L);
        }
    }

    private boolean recvDeviceSignature(byte[] bArr) {
        byte[] encoded;
        BluetoothMyLogger.v("BleSecurityChipRegisterConnector recvDeviceSignature ...");
        this.mHandler.removeMessages(4098);
        if (this.mDevCert == null || this.mManuCert == null || this.mDevicePubKey == null) {
            BluetoothService.getReportCoreProvider().addContextByActionCode(45, "msg", "devCert/ManuCert/DevPublicKey is empty");
            return false;
        }
        if (!MijiaRootCertUtil.verifyX509Certificate(MijiaRootCertUtil.getMijiaRootCertificateFromAssets(), this.mManuCert)) {
            BluetoothService.getReportCoreProvider().addContextByActionCode(45, "msg", "Manu cert is invalid");
            BluetoothMyLogger.v("BleSecurityChipRegisterConnector MijiaManufactureCERT is invalid");
            return false;
        }
        if (!MijiaRootCertUtil.verifyX509Certificate(this.mManuCert, this.mDevCert)) {
            BluetoothService.getReportCoreProvider().addContextByActionCode(45, "msg", "Device Cert is invalid");
            BluetoothMyLogger.v("BleSecurityChipRegisterConnector MijiaDeviceCert is invalid");
            return false;
        }
        SecretKey secret = SecurityChipUtil.getSecret(this.mDevicePubKey, this.mRegisterAppKeyPair.getPrivate());
        this.eShareKey = secret;
        if (secret == null) {
            BluetoothService.getReportCoreProvider().addContextByActionCode(45, "msg", "eShare is empty");
            return false;
        }
        short protocolVersion = getProtocolVersion();
        try {
            BluetoothMyLogger.v("BleSecurityChipRegisterConnector protocol version = " + ((int) protocolVersion));
            if (257 == protocolVersion || 512 == protocolVersion) {
                byte[] bArrAESDecrypt = SecurityChipUtil.AESDecrypt(Arrays.copyOfRange(deriveRegSessionKey(this.eShareKey.getEncoded()), 0, 16), new byte[]{16, 17, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 20, 21, 22, 23, 24, 25, 26, 27}, bArr);
                if (bArrAESDecrypt != null) {
                    byte[] bArrStr2byteMac = SecurityChipUtil.str2byteMac(getMac());
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(82);
                    byteBufferAllocate.put(this.mMSCInfo);
                    byteBufferAllocate.put(bArrStr2byteMac);
                    byteBufferAllocate.put(this.mDevicePubInfo);
                    if (SecurityChipUtil.isEcdsaSignatureValid(byteBufferAllocate.array(), SecurityChipUtil.getDERSignature(bArrAESDecrypt), this.mDevCert.getPublicKey())) {
                        this.mDevSignatureBase64 = Base64Coder.encodeBytes(bArrAESDecrypt, 24);
                        this.mSignDataBase64 = Base64Coder.encodeBytes(BleMeshRegisterConnector.getSHA2Digest(byteBufferAllocate.array()), 24);
                        this.mLTMK = deriveLongTermpreMasterKey(this.eShareKey.getEncoded());
                        return true;
                    }
                    BluetoothService.getReportCoreProvider().addContextByActionCode(45, "msg", "device sign is invalid");
                }
            } else {
                byte[] dERSignature = SecurityChipUtil.getDERSignature(bArr);
                if (TextUtils.isEmpty(this.mBindKey)) {
                    encoded = this.eShareKey.getEncoded();
                } else {
                    byte[] sHA2Digest = BleMeshRegisterConnector.getSHA2Digest(this.eShareKey.getEncoded());
                    byte[] bytes = this.mBindKey.getBytes();
                    byte[] bArr2 = new byte[sHA2Digest.length + bytes.length];
                    System.arraycopy(sHA2Digest, 0, bArr2, 0, sHA2Digest.length);
                    System.arraycopy(bytes, 0, bArr2, sHA2Digest.length, bytes.length);
                    encoded = bArr2;
                }
                if (SecurityChipUtil.isEcdsaSignatureValid(encoded, dERSignature, this.mDevCert.getPublicKey())) {
                    this.mOOB = new byte[16];
                    BluetoothMyLogger.v("BleSecurityChipRegisterConnector qrcode oob: " + this.mQrcodeOob);
                    if (TextUtils.isEmpty(this.mQrcodeOob)) {
                        String strGenerateRandomPaircode = generateRandomPaircode();
                        showPaircode(strGenerateRandomPaircode);
                        this.mHandler.sendEmptyMessageDelayed(4099, 30000L);
                        System.arraycopy(strGenerateRandomPaircode.getBytes(), 0, this.mOOB, 0, strGenerateRandomPaircode.getBytes().length);
                    } else {
                        BluetoothService.getReportCoreProvider().startAction(21);
                        this.mHandler.removeMessages(4098);
                        this.mHandler.sendEmptyMessageDelayed(4098, 15000L);
                        byte[] bArrStringToBytes = ByteUtils.stringToBytes(this.mQrcodeOob);
                        System.arraycopy(bArrStringToBytes, 0, this.mOOB, 0, Math.min(bArrStringToBytes.length, 16));
                    }
                    byte[] bArrGenerateAppRandom = generateAppRandom();
                    this.mAppRandom = bArrGenerateAppRandom;
                    byte[] bArr3 = new byte[32];
                    System.arraycopy(bArrGenerateAppRandom, 0, bArr3, 0, 16);
                    System.arraycopy(this.mOOB, 0, bArr3, 16, 16);
                    this.mAppConfirmation = SecurityChipUtil.sha256HMAC(this.eShareKey.getEncoded(), bArr3);
                    this.mDevSignatureBase64 = Base64Coder.encodeBytes(bArr, 24);
                    this.mSignDataBase64 = Base64Coder.encodeBytes(BleMeshRegisterConnector.getSHA2Digest(this.eShareKey.getEncoded()), 24);
                    if (514 == protocolVersion) {
                        this.mLTMK = deriveLtmkFromOOB(this.eShareKey.getEncoded(), this.mOOB);
                    } else {
                        byte[] bArrDeriveLtmkAndBaconKeyFromOOB = deriveLtmkAndBaconKeyFromOOB(this.eShareKey.getEncoded(), this.mOOB);
                        byte[] bArr4 = new byte[32];
                        this.mLTMK = bArr4;
                        this.mBeaconKey = new byte[16];
                        this.mCloudKey = new byte[16];
                        System.arraycopy(bArrDeriveLtmkAndBaconKeyFromOOB, 0, bArr4, 0, 32);
                        System.arraycopy(bArrDeriveLtmkAndBaconKeyFromOOB, 32, this.mBeaconKey, 0, 16);
                        System.arraycopy(bArrDeriveLtmkAndBaconKeyFromOOB, 48, this.mCloudKey, 0, 16);
                    }
                    String propPincode = BluetoothCache.getPropPincode(getMac());
                    int propLtmkEncryptType = BluetoothCache.getPropLtmkEncryptType(getMac());
                    if (!TextUtils.isEmpty(propPincode) && propLtmkEncryptType != 0) {
                        BluetoothMyLogger.d("BleSecurityChipRegisterConnector encryptLtmk");
                        this.mLTMK = ByteUtils.stringToBytes(LtmkEncryptUtil.encryptLtmk(propPincode, ByteUtils.byteToString(this.mLTMK), propLtmkEncryptType));
                    }
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendBindKey(byte[] bArr) {
        BluetoothService.getReportCoreProvider().startAction(42);
        if (writeChannel(bArr, 14, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegisterConnector.9
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                BluetoothMyLogger.v("BleSecurityChipRegisterConnector sendBindKey onResponse: " + Code.toString(i));
                if (i != 0) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(42, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(42, 2);
                    BleSecurityChipRegisterConnector.this.dispatchResult(-28);
                } else {
                    BluetoothService.getReportCoreProvider().finishAction(42);
                    ((BleSecurityConnector) BleSecurityChipRegisterConnector.this).mHandler.removeMessages(4098);
                    BluetoothService.getReportCoreProvider().startAction(24);
                    ((BleSecurityConnector) BleSecurityChipRegisterConnector.this).mHandler.sendEmptyMessageDelayed(4098, 15000L);
                }
            }
        })) {
            return;
        }
        BluetoothService.getReportCoreProvider().finishAction(42, 2);
        dispatchResult(-28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendRegStart(final byte[] bArr) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleSecurityChipRegisterConnector sendRegStart ...");
        BluetoothService.getReportCoreProvider().startAction(4);
        BleConnectManager.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, bArr, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegisterConnector.4
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r4) {
                BluetoothMyLogger.v("BleSecurityChipRegisterConnector sendRegStart onResponse: " + Code.toString(i));
                if (i == 0) {
                    BluetoothService.getReportCoreProvider().finishAction(4);
                    BleSecurityChipRegisterConnector.this.processStep3();
                } else {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(4, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().addContextByActionCode(4, "data", ByteUtils.byteToString(bArr));
                    BluetoothService.getReportCoreProvider().finishAction(4, 2);
                    BleSecurityChipRegisterConnector.this.dispatchResult(-28);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendRegisterResult(final boolean z, final int i) {
        byte[] bArr;
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleSecurityChipRegisterConnector Process Step 9 ..., isRegisterSuccess = " + z);
        final short protocolVersion = getProtocolVersion();
        if (257 == protocolVersion) {
            byte[] bArr2 = z ? REG_SUCCESS : REG_FAILED;
            BluetoothService.getReportCoreProvider().startAction(13);
            BluetoothService.getReportCoreProvider().addContextByActionCode(13, "data", ByteUtils.byteToString(bArr2));
            BleConnectManager.getInstance().write(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, bArr2, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegisterConnector.10
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i2, Void r5) {
                    BluetoothMyLogger.v("BleSecurityChipRegisterConnector Step 9 onResponse: " + Code.toString(i2));
                    if (!z) {
                        BluetoothService.getReportCoreProvider().addContextByActionCode(13, "error_code", String.valueOf(i2));
                        BluetoothService.getReportCoreProvider().addContextByActionCode(13, "msg", "register result=False");
                        BluetoothService.getReportCoreProvider().finishAction(13, 2);
                        BleSecurityChipRegisterConnector.this.dispatchResult(i);
                        return;
                    }
                    if (i2 == 0) {
                        BluetoothService.getReportCoreProvider().finishAction(13);
                        ((BleSecurityConnector) BleSecurityChipRegisterConnector.this).mBundle.putByteArray(BluetoothConstants.KEY_LTMK, BleSecurityChipRegisterConnector.this.mLTMK);
                        BleSecurityChipRegisterConnector.this.dispatchResult(0);
                    } else {
                        BluetoothService.getReportCoreProvider().addContextByActionCode(13, "error_code", String.valueOf(i2));
                        BluetoothService.getReportCoreProvider().finishAction(13, 2);
                        BleSecurityChipRegisterConnector.this.dispatchResult(-28);
                    }
                }
            });
            return;
        }
        if (z) {
            bArr = REG_VERIFY_SUCCESS;
        } else {
            byte[] bArr3 = REG_VERIFY_FAILED;
            this.mDefaultFailedCode = i;
            bArr = bArr3;
        }
        BluetoothService.getReportCoreProvider().startAction(13);
        BleConnectManager.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, bArr, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegisterConnector.11
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i2, Void r3) {
                BluetoothMyLogger.v("BleSecurityChipRegisterConnector Step 9 onResponse: " + Code.toString(i2));
                if (z) {
                    BleSecurityChipRegisterConnector.this.writeEncryptData(protocolVersion);
                }
            }
        });
        BluetoothService.getReportCoreProvider().finishAction(13);
        BluetoothService.getReportCoreProvider().startAction(14);
        this.mHandler.removeMessages(4098);
        this.mHandler.sendEmptyMessageDelayed(4098, 15000L);
    }

    public byte[] getDeviceDIDBytes() {
        X509Certificate x509Certificate = this.mDevCert;
        if (x509Certificate == null) {
            return new byte[8];
        }
        String string = x509Certificate.getSerialNumber().toString();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.putLong(Long.parseLong(string));
        return byteBufferOrder.array();
    }

    public String getDeviceDid() {
        X509Certificate x509Certificate = this.mDevCert;
        return x509Certificate != null ? x509Certificate.getSerialNumber().toString() : "";
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public byte[] getGeneratedToken() {
        return this.mToken;
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
            return;
        }
        if (i != 4) {
            if (i == 12) {
                recvDevConfirmation(bArr);
                return;
            } else {
                if (i != 13) {
                    return;
                }
                recvDevRandom(bArr);
                return;
            }
        }
        BluetoothService.getReportCoreProvider().finishAction(29);
        BluetoothService.getReportCoreProvider().startAction(45);
        if (!recvDeviceSignature(bArr)) {
            BluetoothService.getReportCoreProvider().finishAction(45, 10);
            processDeviceAuthComplete(false);
            return;
        }
        BluetoothService.getReportCoreProvider().finishAction(45);
        if (ByteUtils.isEmpty(this.mOOB)) {
            processDeviceAuthComplete(true);
        } else {
            BluetoothService.getReportCoreProvider().startAction(21);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipConnector, com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processHandlerMessage(Message message) {
        int i = message.what;
        if (i == 4098) {
            BluetoothMyLogger.w("BleSecurityChipRegisterConnector notify timeout");
            dispatchResult(this.mDefaultFailedCode);
            BluetoothService.getReportCoreProvider().finishCurrentActionWithResult(8);
        } else {
            if (i != 4099) {
                return;
            }
            BluetoothMyLogger.w("BleSecurityChipRegisterConnector paircode timeout");
            BluetoothService.getReportCoreProvider().finishAction(44, 8);
            dispatchResult(-35);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipConnector, com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        UUID uuid3 = BluetoothConstants.MISERVICE;
        if (uuid.equals(uuid3) && uuid2.equals(BluetoothConstants.CHARACTER_AUTH)) {
            receiveDeviceResult(bArr);
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
        BluetoothMyLogger.v("BleSecurityChipRegisterConnector Process Step 1 ...");
        BluetoothCache.setPropSessionKeyBytes(getMac(), "".getBytes());
        openSecureAuthNotify(new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegisterConnector.1
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r3) {
                BluetoothMyLogger.v("BleSecurityChipRegisterConnector Step 1 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleSecurityChipRegisterConnector.this.processStep1Plus();
                } else {
                    BleSecurityChipRegisterConnector.this.dispatchResult(-27);
                }
            }
        });
    }

    public void unbindDeviceIfNeed() {
        if ((getProtocolVersion() == 517 || getProtocolVersion() == 518) && !TextUtils.isEmpty(this.mCloudCert)) {
            DeviceApi.unbindDevice(getDeviceDid(), BluetoothCache.getPropProductId(getMac()), new BleAsyncCallback<Boolean, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegisterConnector.14
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
    }

    public void writeCloudCert2Device() throws Throwable {
        byte[] bArrDecode = Base64Coder.decode(this.mCloudCert, 24);
        writeLog("writeCloudCert2Device cloud cert=%s", ByteUtils.byteToString(bArrDecode));
        if (writeChannel(bArrDecode, 7, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegisterConnector.13
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                if (i == 0) {
                    BluetoothService.getReportCoreProvider().startAction(14);
                    ((BleSecurityConnector) BleSecurityChipRegisterConnector.this).mHandler.removeMessages(4098);
                    ((BleSecurityConnector) BleSecurityChipRegisterConnector.this).mHandler.sendEmptyMessageDelayed(4098, 15000L);
                    return;
                }
                BleSecurityChipRegisterConnector.this.writeLog("writeCloudCert fail ,code=" + i, new Object[0]);
                BleSecurityChipRegisterConnector.this.unbindDeviceIfNeed();
                BleSecurityChipRegisterConnector.this.dispatchResult(-28);
            }
        })) {
            return;
        }
        writeLog("writeCloudCert fail", new Object[0]);
        unbindDeviceIfNeed();
        dispatchResult(-28);
    }

    public void writeEncryptData(short s) {
        if ((517 == s || getProtocolVersion() == 518) && !writeChannel(this.mEncryptData, 0, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegisterConnector.12
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws Throwable {
                if (i == 0) {
                    BleSecurityChipRegisterConnector.this.writeCloudCert2Device();
                    return;
                }
                BleSecurityChipRegisterConnector.this.writeLog("write EncryptData Fail ,code=" + i, new Object[0]);
                BleSecurityChipRegisterConnector.this.unbindDeviceIfNeed();
                BleSecurityChipRegisterConnector.this.dispatchResult(-28);
            }
        })) {
            writeLog("writeEncryptData fail", new Object[0]);
            unbindDeviceIfNeed();
            dispatchResult(-28);
        }
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
