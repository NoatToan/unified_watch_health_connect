package com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth;

import android.os.Bundle;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;

/* JADX INFO: loaded from: classes10.dex */
public class BleSecurityLogin extends BleRc4Launcher {
    private BleLoginConnector mLoginConnector;

    public BleSecurityLogin(String str, int i, byte[] bArr, BleConnectOptions bleConnectOptions) {
        super(str, i, bArr, bleConnectOptions);
        this.mLoginConnector = new BleLoginConnector(this.mLauncher);
    }

    private void loginForStrongBind(int i) {
        BluetoothMyLogger.w("loginForStrongBind " + i);
        notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, 0);
        dispatchResult(i);
    }

    private void loginForWeakBind(final int i) {
        if (BluetoothCache.getPropBoundStatus(this.mDeviceMac) != 2) {
            BluetoothMyLogger.w("loginForWeakBind, remoteBinded false");
            bindDeviceToServer(new BleDeviceBinder.BleBindResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleSecurityLogin.1
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i2, Void r3) {
                    BleSecurityLogin.this.refreshRemoteBinded(i2);
                    BleSecurityLogin.this.notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, i2);
                    BleSecurityLogin.this.dispatchResult(i);
                }
            });
        } else {
            BluetoothMyLogger.w("loginForWeakBind, remoteBinded true");
            notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, 0);
            dispatchResult(i);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public BleSecurityConnector getSecurityConnector() {
        return this.mLoginConnector;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public void onPostConnect(int i, Bundle bundle) {
        if (!shouldBindToServer()) {
            notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, 0);
            dispatchResult(i);
            return;
        }
        int bindStyle = getBindStyle();
        if (bindStyle == 1) {
            loginForStrongBind(i);
        } else {
            if (bindStyle != 2) {
                throw new IllegalStateException("impossible here");
            }
            loginForWeakBind(i);
        }
        if (i == 0) {
            reportNonBleLockVersion(this.mDeviceMac);
        }
    }
}
