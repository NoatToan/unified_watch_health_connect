package com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth;

import android.os.Message;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothHelper;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.IBleDeviceLauncher;
import com.xiaomi.smarthome.device.bluetooth.security.BLECipher;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.Code;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleNotifyResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class BleRegisterConnector extends BleRc4Connector {
    private static final int MSG_NOTIFY_TIMEOUT = 1;
    private static final int SESSION_END = -95114350;
    private static final int SESSION_START = -561657200;
    private final BleNotifyResponse mBleNotifyResponse;
    private byte[] mTempToken;

    public BleRegisterConnector(IBleDeviceLauncher iBleDeviceLauncher) {
        super(iBleDeviceLauncher);
        this.mBleNotifyResponse = new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleRegisterConnector.2
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r3) {
                BluetoothMyLogger.v("Step 2 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleRegisterConnector.this.processStep3();
                } else {
                    BleRegisterConnector.this.dispatchResult(-27);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processStep2() {
        if (isCanceled()) {
            dispatchResult(-2);
        } else {
            BluetoothMyLogger.v("Process Step 2 ...");
            openTokenNotify(this.mBleNotifyResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processStep3() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("Process Step 3");
        this.mTempToken = BluetoothHelper.generateToken();
        byte[] bArrEncrypt = BLECipher.encrypt(BluetoothHelper.mixA(getMac(), getProductId()), this.mTempToken);
        BluetoothService.getReportCoreProvider().startAction(5);
        BleConnectManager.getInstance().write(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_TOKEN, bArrEncrypt, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleRegisterConnector.3
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r4) {
                if (i == 0) {
                    BluetoothService.getReportCoreProvider().finishAction(5);
                } else {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(5, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(5, 2);
                }
            }
        });
        BluetoothService.getReportCoreProvider().startAction(6);
        this.mHandler.removeMessages(1);
        this.mHandler.sendEmptyMessageDelayed(1, 15000L);
    }

    private void processStep4() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("Process Step 4 ...");
        byte[] bArrEncrypt = BLECipher.encrypt(this.mTempToken, ByteUtils.fromInt(SESSION_END));
        BluetoothService.getReportCoreProvider().startAction(7);
        BleConnectManager.getInstance().write(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_TOKEN, bArrEncrypt, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleRegisterConnector.4
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r5) {
                BluetoothMyLogger.v("Step 4 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BluetoothService.getReportCoreProvider().finishAction(7);
                    BleRegisterConnector bleRegisterConnector = BleRegisterConnector.this;
                    bleRegisterConnector.readFirmwareVersionFromDevice(bleRegisterConnector.getGeneratedToken(), i);
                } else {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(7, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(7, 2);
                    BleRegisterConnector.this.dispatchResult(i);
                }
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public byte[] getGeneratedToken() {
        return this.mTempToken;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processHandlerMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        BluetoothMyLogger.w("notify timeout");
        BluetoothService.getReportCoreProvider().finishCurrentActionWithResult(8);
        dispatchResult(-55);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        if (uuid.equals(BluetoothConstants.MISERVICE) && uuid2.equals(BluetoothConstants.CHARACTER_TOKEN) && this.mHandler.hasMessages(1)) {
            this.mHandler.removeMessages(1);
            if (ByteUtils.byteEquals(BLECipher.encrypt(BluetoothHelper.mixB(getMac(), getProductId()), BLECipher.encrypt(BluetoothHelper.mixA(getMac(), getProductId()), bArr)), this.mTempToken)) {
                BluetoothService.getReportCoreProvider().finishAction(6);
                processStep4();
            } else {
                BluetoothService.getReportCoreProvider().addContextByActionCode(6, "msg", "token not match");
                BluetoothMyLogger.w("token not match");
                BluetoothService.getReportCoreProvider().finishAction(6, 10);
                dispatchResult(-31);
            }
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processStep1() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("Process Step 1 ...");
        BluetoothService.getReportCoreProvider().startAction(4);
        BleConnectManager.getInstance().write(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, ByteUtils.fromInt(SESSION_START), new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleRegisterConnector.1
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r4) {
                BluetoothMyLogger.v("Step 1 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BluetoothService.getReportCoreProvider().finishAction(4);
                    BleRegisterConnector.this.processStep2();
                } else {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(4, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(4, 2);
                    BleRegisterConnector.this.dispatchResult(-28);
                }
            }
        });
    }
}
