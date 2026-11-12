package com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo;

import android.os.Bundle;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;

/* JADX INFO: loaded from: classes10.dex */
public class BleComboWuganStandardAuth extends BleSecurityLauncher {
    private BleComboWuganStandardConnector mAuthConnector;

    public BleComboWuganStandardAuth(String str, int i, BleComboWifiConfig bleComboWifiConfig, BleConnectOptions bleConnectOptions) {
        super(str, i, bleConnectOptions);
        this.mAuthConnector = new BleComboWuganStandardConnector(this.mLauncher, bleComboWifiConfig);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public BleSecurityConnector getSecurityConnector() {
        return this.mAuthConnector;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public void onPostConnect(int i, Bundle bundle) {
        Bundle bundle2 = this.mBundle;
        if (bundle2 != null) {
            bundle2.putString("key_device_did", this.mAuthConnector.getDidText());
        }
        if (i == 0) {
            notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, 0);
        }
        dispatchResult(i);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public void sendCommand(int i, Bundle bundle, IBleResponse iBleResponse) {
        if (i == 10) {
            this.mAuthConnector.requestDeviceLog(bundle.getString("logFilePath"), iBleResponse);
        }
    }
}
