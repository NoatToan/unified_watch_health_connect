package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth;

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
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.ECCPointConvert;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.Hkdf;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.SecurityChipUtil;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.channel.CRC32;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.Code;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleNotifyResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class BleSecurityChipLoginConnector extends BleSecurityChipConnector {
    private static final int MSG_NOTIFY_TIMEOUT = 4099;
    private static final String TAG = "BleSecurityChipLoginConnector";
    private KeyPair mLoginAppKeyPair;
    private PublicKey mLoginDevicePubKey;
    private byte[] mLtmk;
    private byte[] mSessionKey;
    private static final byte[] LOG_START = {32, 0, 0, 0};
    private static final byte[] LOG_SUCCESS = {SettingsModule.VALUE_TYPE_STRING_ENUM, 0, 0, 0};
    private static final byte[] LOG_FAILED = {34, 0, 0, 0};
    public static final byte[] ERR_NOT_REGISTERED = {-32, 0, 0, 0};

    public BleSecurityChipLoginConnector(IBleDeviceLauncher iBleDeviceLauncher, byte[] bArr) {
        super(iBleDeviceLauncher);
        this.mLtmk = bArr;
    }

    private byte[] deriveLoginSessionKey(byte[] bArr) {
        try {
            Hkdf hkdf = Hkdf.getInstance("HmacSHA256");
            hkdf.init(bArr, "smartcfg-login-salt".getBytes());
            return hkdf.deriveKey("smartcfg-login-info".getBytes(), 64);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processStep2() {
        if (isCanceled()) {
            dispatchResult(-2);
        } else {
            BluetoothMyLogger.v("BleSecurityChipLoginConnector Process Step 2 ...");
            openAuthNotify(new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipLoginConnector.2
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, Void r3) {
                    BluetoothMyLogger.v("BleSecurityChipLoginConnector Step 2 onResponse: " + Code.toString(i));
                    if (i == 0) {
                        BleSecurityChipLoginConnector.this.processStep3();
                    } else {
                        BleSecurityChipLoginConnector.this.dispatchResult(-27);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processStep3() {
        if (isCanceled()) {
            dispatchResult(-2);
        } else {
            BluetoothMyLogger.v("BleSecurityChipLoginConnector Process Step 3 ...");
            BleConnectManager.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, LOG_START, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipLoginConnector.3
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, Void r3) {
                    BluetoothMyLogger.v("BleSecurityChipLoginConnector Step 3 onResponse: " + Code.toString(i));
                    if (i == 0) {
                        BleSecurityChipLoginConnector.this.processStep4();
                    } else {
                        BleSecurityChipLoginConnector.this.dispatchResult(-28);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processStep4() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleSecurityChipLoginConnector Process Step 4 ...");
        KeyPair keyPairGenerateEcc256KeyPair = SecurityChipUtil.generateEcc256KeyPair();
        this.mLoginAppKeyPair = keyPairGenerateEcc256KeyPair;
        if (writeChannel(SecurityChipUtil.getRawPublicKey(keyPairGenerateEcc256KeyPair.getPublic()), 3, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipLoginConnector.4
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                BluetoothMyLogger.v("BleSecurityChipLoginConnector Step 4 onResponse: " + Code.toString(i));
                if (i != 0) {
                    BleSecurityChipLoginConnector.this.dispatchResult(-28);
                } else {
                    ((BleSecurityConnector) BleSecurityChipLoginConnector.this).mHandler.removeMessages(4099);
                    ((BleSecurityConnector) BleSecurityChipLoginConnector.this).mHandler.sendEmptyMessageDelayed(4099, 15000L);
                }
            }
        })) {
            return;
        }
        dispatchResult(-28);
    }

    private void processStep5(byte[] bArr) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleSecurityChipLoginConnector Process Step 5 ...");
        this.mHandler.removeMessages(4099);
        processStep6(recvLoginDevicePubKey(bArr, this.mLtmk));
    }

    private void processStep6(byte[] bArr) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleSecurityChipLoginConnector Process Step 6 ...");
        if (bArr == null) {
            BluetoothMyLogger.v("BleSecurityChipLoginConnector Process Step 6 encryptData is null ... ");
            dispatchResult(-21);
            return;
        }
        this.mHandler.removeMessages(4099);
        this.mHandler.sendEmptyMessageDelayed(4099, 15000L);
        if (writeChannel(bArr, 5, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipLoginConnector.5
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                if (i != 0) {
                    BleSecurityChipLoginConnector.this.dispatchResult(-28);
                }
            }
        })) {
            return;
        }
        dispatchResult(-28);
    }

    private void processStep7(byte[] bArr) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleSecurityChipLoginConnector Process Step 7 ..., value = " + ByteUtils.byteToString(bArr));
        if (ByteUtils.equals(bArr, LOG_SUCCESS)) {
            this.mHandler.removeMessages(4099);
            this.mBundle.putByteArray(BluetoothConstants.KEY_SESSION_KEY, this.mSessionKey);
            dispatchResult(0);
        } else if (ByteUtils.equals(bArr, LOG_FAILED)) {
            this.mHandler.removeMessages(4099);
            dispatchResult(-22);
        } else if (ByteUtils.equals(bArr, ERR_NOT_REGISTERED)) {
            this.mHandler.removeMessages(4099);
            dispatchResult(-16);
        }
    }

    private byte[] recvLoginDevicePubKey(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[65];
        bArr3[0] = 4;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        try {
            this.mLoginDevicePubKey = ECCPointConvert.fromUncompressedPoint(bArr3, ((ECPublicKey) this.mLoginAppKeyPair.getPublic()).getParams());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            byte[] bArr4 = new byte[64];
            System.arraycopy(SecurityChipUtil.getSecret(this.mLoginDevicePubKey, this.mLoginAppKeyPair.getPrivate()).getEncoded(), 0, bArr4, 0, 32);
            System.arraycopy(bArr2, 0, bArr4, 32, 32);
            byte[] bArrDeriveLoginSessionKey = deriveLoginSessionKey(bArr4);
            this.mSessionKey = bArrDeriveLoginSessionKey;
            return SecurityChipUtil.AESEncrypt(Arrays.copyOfRange(bArrDeriveLoginSessionKey, 16, 32), new byte[]{16, 17, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 20, 21, 22, 23, 24, 25, 26, 27}, CRC32.get(bArr));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipConnector
    public void onChannelRead(byte[] bArr, int i) {
        if (i != 3) {
            return;
        }
        processStep5(bArr);
    }

    public void postDelayed(Runnable runnable, long j) {
        if (runnable != null) {
            this.mHandler.postDelayed(runnable, j);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipConnector, com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processHandlerMessage(Message message) {
        if (message.what != 4099) {
            return;
        }
        BluetoothMyLogger.w("BleSecurityChipLoginConnector notify timeout");
        dispatchResult(-7);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipConnector, com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        UUID uuid3 = BluetoothConstants.MISERVICE;
        if (uuid.equals(uuid3) && uuid2.equals(BluetoothConstants.CHARACTER_AUTH)) {
            processStep7(bArr);
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
        BluetoothMyLogger.v("BleSecurityChipLoginConnector Process Step 1 ...");
        BluetoothCache.setPropSessionKeyBytes(getMac(), "".getBytes());
        openSecureAuthNotify(new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipLoginConnector.1
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r3) {
                BluetoothMyLogger.v("BleSecurityChipLoginConnector Step 1 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleSecurityChipLoginConnector.this.processStep2();
                } else {
                    BleSecurityChipLoginConnector.this.dispatchResult(-27);
                }
            }
        });
    }
}
