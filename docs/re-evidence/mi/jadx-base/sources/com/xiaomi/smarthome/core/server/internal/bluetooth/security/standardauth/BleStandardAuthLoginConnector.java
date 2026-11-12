package com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.IBleDeviceLauncher;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.Hkdf;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.SecurityChipUtil;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.Code;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleNotifyResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class BleStandardAuthLoginConnector extends BleStandardAuthConnector {
    private static final int MSG_NOTIFY_TIMEOUT = 4103;
    private static final String TAG = "BleStandardAuthLoginConnector";
    private byte[] mAppConfirm;
    private byte[] mAppIv;
    private byte[] mAppKey;
    private byte[] mAppRandom;
    private byte[] mDevIv;
    private byte[] mDevKey;
    private byte[] mDeviceRandom;
    private byte[] mSessionKey;
    private static final byte[] LOGIN_START_W_RANDOM = {HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_SIMPLE, 0, 0, 0};
    private static final byte[] LOGIN_SUCCESS = {SettingsModule.VALUE_TYPE_STRING_ENUM, 0, 0, 0};
    private static final byte[] LOGIN_FAILED = {34, 0, 0, 0};
    private static final byte[] LOG_DECRYPT_FAILED = {HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL, 0, 0, 0};
    private static final byte[] ERR_NOT_REGISTERED = {-32, 0, 0, 0};
    private static final byte[] ERR_RELOGIN = {-30, 0, 0, 0};

    public BleStandardAuthLoginConnector(IBleDeviceLauncher iBleDeviceLauncher) {
        super(iBleDeviceLauncher);
    }

    private byte[] deriveSessionKey(byte[] bArr, byte[] bArr2) {
        try {
            Hkdf hkdf = Hkdf.getInstance("HmacSHA256");
            hkdf.init(bArr, bArr2);
            return hkdf.deriveKey("mible-login-info".getBytes(), 64);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void processStep1Plus() {
        if (isCanceled()) {
            dispatchResult(-2);
        } else {
            BluetoothMyLogger.v("BleStandardAuthLoginConnector Process Step 1 plus ...");
            openAuthNotify(new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthLoginConnector.2
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, Void r3) {
                    BluetoothMyLogger.v("BleStandardAuthLoginConnector Step 1 plus onResponse: " + Code.toString(i));
                    if (i == 0) {
                        BleStandardAuthLoginConnector.this.sendLoginStart();
                    } else {
                        BleStandardAuthLoginConnector.this.dispatchResult(-27);
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
        BluetoothMyLogger.v("BleStandardAuthLoginConnector receiveDeviceResult ..., value = " + ByteUtils.byteToString(bArr));
        if (ByteUtils.equals(bArr, LOGIN_SUCCESS)) {
            this.mHandler.removeMessages(4103);
            this.mBundle.putByteArray(BluetoothConstants.KEY_SESSION_KEY, this.mSessionKey);
            dispatchResult(0);
        } else if (ByteUtils.equals(bArr, LOGIN_FAILED) || ByteUtils.equals(bArr, LOG_DECRYPT_FAILED)) {
            this.mHandler.removeMessages(4103);
            dispatchResult(-52);
        } else if (ByteUtils.equals(bArr, ERR_NOT_REGISTERED)) {
            this.mHandler.removeMessages(4103);
            dispatchResult(-16);
        } else if (ByteUtils.equals(bArr, ERR_RELOGIN)) {
            this.mHandler.removeMessages(4103);
            dispatchResult(-53);
        }
    }

    private void recvDevConfirmation(byte[] bArr) {
        BluetoothMyLogger.v("BleStandardAuthLoginConnector recvDevConfirmation ...");
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        this.mHandler.removeMessages(4103);
        byte[] bArr2 = this.mDeviceRandom;
        byte[] bArr3 = new byte[bArr2.length + this.mAppRandom.length];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        byte[] bArr4 = this.mAppRandom;
        System.arraycopy(bArr4, 0, bArr3, this.mDeviceRandom.length, bArr4.length);
        if (!ByteUtils.equals(bArr, SecurityChipUtil.sha256HMAC(this.mDevKey, bArr3))) {
            dispatchResult(-52);
            return;
        }
        BluetoothMyLogger.v("BleStandardAuthLoginConnector verify device confirm success ...");
        sendAppConfirm();
        this.mHandler.removeMessages(4103);
        this.mHandler.sendEmptyMessageDelayed(4103, 15000L);
    }

    private void recvDevRandom(byte[] bArr) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.d("BleStandardAuthLoginConnector recvDevRandom ...");
        this.mHandler.removeMessages(4103);
        this.mDeviceRandom = bArr;
        byte[] bArr2 = this.mAppRandom;
        byte[] bArr3 = new byte[bArr2.length + bArr.length];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        byte[] bArr4 = this.mDeviceRandom;
        System.arraycopy(bArr4, 0, bArr3, this.mAppRandom.length, bArr4.length);
        byte[] bArrDeriveSessionKey = deriveSessionKey(getToken(), bArr3);
        this.mSessionKey = bArrDeriveSessionKey;
        if (bArrDeriveSessionKey == null) {
            dispatchResult(-52);
            return;
        }
        byte[] bArr5 = new byte[16];
        this.mDevKey = bArr5;
        System.arraycopy(bArrDeriveSessionKey, 0, bArr5, 0, 16);
        byte[] bArr6 = new byte[16];
        this.mAppKey = bArr6;
        System.arraycopy(this.mSessionKey, 16, bArr6, 0, 16);
        byte[] bArr7 = new byte[4];
        this.mDevIv = bArr7;
        System.arraycopy(this.mSessionKey, 32, bArr7, 0, 4);
        byte[] bArr8 = new byte[4];
        this.mAppIv = bArr8;
        System.arraycopy(this.mSessionKey, 36, bArr8, 0, 4);
        this.mAppConfirm = SecurityChipUtil.sha256HMAC(this.mAppKey, bArr3);
        this.mHandler.sendEmptyMessageDelayed(4103, 15000L);
    }

    private void sendAppConfirm() {
        BluetoothMyLogger.v("BleStandardAuthLoginConnector sendAppConfirm ...");
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        if (ByteUtils.isEmpty(this.mAppConfirm)) {
            BluetoothMyLogger.v("BleStandardAuthLoginConnector sendAppConfirm mAppConfirm is empty");
            dispatchResult(-52);
        } else {
            if (writeChannel(this.mAppConfirm, 10, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthLoginConnector.5
                @Override // android.os.IInterface
                public IBinder asBinder() {
                    return null;
                }

                @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
                public void onResponse(int i, Bundle bundle) throws RemoteException {
                    BluetoothMyLogger.v("BleStandardAuthLoginConnector sendAppConfirm onResponse: " + Code.toString(i));
                    if (i != 0) {
                        BleStandardAuthLoginConnector.this.dispatchResult(-28);
                    } else {
                        ((BleSecurityConnector) BleStandardAuthLoginConnector.this).mHandler.removeMessages(4103);
                        ((BleSecurityConnector) BleStandardAuthLoginConnector.this).mHandler.sendEmptyMessageDelayed(4103, 15000L);
                    }
                }
            })) {
                return;
            }
            dispatchResult(-28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAppRandom() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleStandardAuthLoginConnector sendAppRandom ...");
        byte[] bArrGenerateAppRandom = generateAppRandom();
        this.mAppRandom = bArrGenerateAppRandom;
        if (writeChannel(bArrGenerateAppRandom, 11, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthLoginConnector.4
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                BluetoothMyLogger.v("BleStandardAuthLoginConnector sendAppPublicKey onResponse: " + Code.toString(i));
                if (i != 0) {
                    BleStandardAuthLoginConnector.this.dispatchResult(-28);
                } else {
                    ((BleSecurityConnector) BleStandardAuthLoginConnector.this).mHandler.removeMessages(4103);
                    ((BleSecurityConnector) BleStandardAuthLoginConnector.this).mHandler.sendEmptyMessageDelayed(4103, 15000L);
                }
            }
        })) {
            return;
        }
        dispatchResult(-28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendLoginStart() {
        if (isCanceled()) {
            dispatchResult(-2);
        } else {
            BluetoothMyLogger.v("BleStandardAuthLoginConnector sendLoginStart ...");
            BleConnectManager.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, LOGIN_START_W_RANDOM, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthLoginConnector.3
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, Void r3) {
                    BluetoothMyLogger.v("BleStandardAuthLoginConnector sendRegStart onResponse: " + Code.toString(i));
                    if (i == 0) {
                        BleStandardAuthLoginConnector.this.sendAppRandom();
                    } else {
                        BleStandardAuthLoginConnector.this.dispatchResult(-28);
                    }
                }
            });
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthConnector
    public void onChannelRead(byte[] bArr, int i) {
        if (isCanceled()) {
            dispatchResult(-2);
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
        if (message.what != 4103) {
            return;
        }
        BluetoothMyLogger.w("BleStandardAuthLoginConnector notify timeout");
        dispatchResult(-7);
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
        BluetoothMyLogger.v("BleStandardAuthLoginConnector Process Step 1 ...");
        BluetoothCache.setPropSessionKeyBytes(getMac(), "".getBytes());
        openStandardAuthNotify(new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthLoginConnector.1
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r3) {
                BluetoothMyLogger.v("BleStandardAuthLoginConnector Step 1 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleStandardAuthLoginConnector.this.processStep1Plus();
                } else {
                    BleStandardAuthLoginConnector.this.dispatchResult(-27);
                }
            }
        });
    }
}
