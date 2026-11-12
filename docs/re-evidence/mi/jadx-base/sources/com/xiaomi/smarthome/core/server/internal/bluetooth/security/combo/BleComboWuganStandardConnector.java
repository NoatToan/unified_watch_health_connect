package com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.miui.tsmclient.service.DKFRequestService;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.IBleDeviceLauncher;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.Code;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;

/* JADX INFO: loaded from: classes10.dex */
public class BleComboWuganStandardConnector extends BleComboStandardAuthConnector {
    private static final String TAG = "WuganStandardConnector";

    public BleComboWuganStandardConnector(IBleDeviceLauncher iBleDeviceLauncher, BleComboWifiConfig bleComboWifiConfig) {
        super(iBleDeviceLauncher, bleComboWifiConfig);
    }

    private void recvWuganMsg(byte[] bArr) {
        String str = new String(bArr);
        BluetoothMyLogger.v("WuganStandardConnector recvWuganMsg ..." + str + ", recvLength:" + str.length() + " server msg ... " + this.mWifiConfig.wuganConfirmMessage + ", serverLength:" + this.mWifiConfig.wuganConfirmMessage.length());
        this.mHandler.removeMessages(DKFRequestService.H0);
        if (str.equals(this.mWifiConfig.wuganConfirmMessage)) {
            sendRegStart();
        } else {
            dispatchResult(-104);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendRandomKey() {
        BluetoothMyLogger.v("WuganStandardConnector sendWugan RandomKey key: " + this.mWifiConfig.wuganRandomKey);
        BluetoothMyLogger.v("WuganStandardConnector sendWugan RandomKey key, byte length: " + this.mWifiConfig.wuganRandomKey.getBytes().length);
        if (writeChannel(this.mWifiConfig.wuganRandomKey.getBytes(), 18, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboWuganStandardConnector.2
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                BluetoothMyLogger.v("WuganStandardConnector sendWugan RandomKey onResponse: " + Code.toString(i));
                if (i != 0) {
                    BleComboWuganStandardConnector.this.dispatchResult(-28);
                } else {
                    ((BleSecurityConnector) BleComboWuganStandardConnector.this).mHandler.removeMessages(DKFRequestService.H0);
                    ((BleSecurityConnector) BleComboWuganStandardConnector.this).mHandler.sendEmptyMessageDelayed(DKFRequestService.H0, 15000L);
                }
            }
        })) {
            return;
        }
        dispatchResult(-28);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboStandardAuthConnector
    public void doAfterMTUCompleted() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("WuganStandardConnector doAfterMTUCompleted ...");
        BluetoothMyLogger.v("WuganStandardConnector sendA7 ...");
        BleConnectManager.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, BleComboStandardAuthConnector.REQ_WUGAN_CONFIRM_MSG, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboWuganStandardConnector.1
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r3) {
                BluetoothMyLogger.v("WuganStandardConnector sendA7 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleComboWuganStandardConnector.this.sendRandomKey();
                } else {
                    BleComboWuganStandardConnector.this.dispatchResult(-28);
                }
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboStandardAuthConnector, com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthConnector
    public void onChannelRead(byte[] bArr, int i) throws Throwable {
        super.onChannelRead(bArr, i);
        if (i != 19) {
            return;
        }
        recvWuganMsg(bArr);
    }
}
