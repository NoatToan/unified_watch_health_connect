package com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth;

import android.os.Message;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.IBleDeviceLauncher;
import com.xiaomi.smarthome.device.bluetooth.security.BLECipher;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.Code;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleNotifyResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class BleLoginConnector extends BleRc4Connector {
    private static final int MSG_NOTIFY_CONFIRM_TIMEOUT = 2;
    private static final int MSG_NOTIFY_TICK_TIMEOUT = 1;
    private static final int SESSION_CONFIRM = 916084937;
    private static final int SESSION_END = -1816155127;
    private static final int SESSION_START = -851198976;
    private static final int TICK_LEN = 4;
    private final BleNotifyResponse mBleNotifyResponse;
    private byte[] mEncryptKey;

    public BleLoginConnector(IBleDeviceLauncher iBleDeviceLauncher) {
        super(iBleDeviceLauncher);
        this.mBleNotifyResponse = new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleLoginConnector.1
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r3) {
                BluetoothMyLogger.v("Step 1 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleLoginConnector.this.processStep2();
                } else {
                    BleLoginConnector.this.dispatchResult(-27);
                }
            }
        };
    }

    private void processConfirmNotify(byte[] bArr) {
        if (ByteUtils.byteEquals(Arrays.copyOfRange(BLECipher.encrypt(this.mEncryptKey, bArr), 0, 4), ByteUtils.fromInt(SESSION_CONFIRM))) {
            readFirmwareVersionFromDevice(getToken(), 0);
        } else {
            dispatchResult(-10);
        }
    }

    private void processConfirmNotifyTimeout() {
        if (willNotifyTokenNotMatch()) {
            dispatchResult(-7);
        } else {
            dispatchResult(-10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processStep2() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("Process Step 2");
        BleConnectManager.getInstance().write(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, ByteUtils.fromInt(SESSION_START), new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleLoginConnector.2
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r2) {
            }
        });
        this.mHandler.removeMessages(1);
        this.mHandler.sendEmptyMessageDelayed(1, 15000L);
    }

    private void processStep3(byte[] bArr) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("Process Step 3");
        BleConnectManager.getInstance().write(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_TOKEN, bArr, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleLoginConnector.3
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r2) {
            }
        });
        this.mHandler.removeMessages(2);
        this.mHandler.sendEmptyMessageDelayed(2, 15000L);
    }

    private void processTickNotify(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            dispatchResult(-31);
            return;
        }
        byte[] token = getToken();
        byte[] bArrEncrypt = BLECipher.encrypt(token, bArr);
        this.mEncryptKey = Arrays.copyOfRange(token, 0, token.length);
        for (int i = 0; i < 4; i++) {
            byte[] bArr2 = this.mEncryptKey;
            bArr2[i] = (byte) (bArr2[i] ^ bArrEncrypt[i]);
        }
        processStep3(BLECipher.encrypt(this.mEncryptKey, ByteUtils.fromInt(SESSION_END)));
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processHandlerMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            BluetoothMyLogger.w("tick notify timeout");
            this.mHandler.removeMessages(1);
            dispatchResult(-7);
        } else {
            if (i != 2) {
                return;
            }
            BluetoothMyLogger.w("confirm notify timeout");
            this.mHandler.removeMessages(2);
            processConfirmNotifyTimeout();
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        if (uuid.equals(BluetoothConstants.MISERVICE) && uuid2.equals(BluetoothConstants.CHARACTER_TOKEN)) {
            if (this.mHandler.hasMessages(1)) {
                this.mHandler.removeMessages(1);
                processTickNotify(bArr);
            } else if (this.mHandler.hasMessages(2)) {
                this.mHandler.removeMessages(2);
                processConfirmNotify(bArr);
            }
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processStep1() {
        if (isCanceled()) {
            dispatchResult(-2);
        } else {
            BluetoothMyLogger.v("Process Step 1 ...");
            openTokenNotify(this.mBleNotifyResponse);
        }
    }
}
