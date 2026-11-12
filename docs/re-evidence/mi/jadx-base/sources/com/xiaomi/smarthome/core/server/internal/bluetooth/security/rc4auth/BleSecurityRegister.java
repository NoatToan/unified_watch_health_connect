package com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth;

import android.os.Bundle;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse;

/* JADX INFO: loaded from: classes10.dex */
public class BleSecurityRegister extends BleRc4Launcher {
    private BleRegisterConnector mRegisterConnector;
    private final BleDeviceBinder.BleBindResponse mStrongBindResponse;

    public BleSecurityRegister(String str, int i, BleConnectOptions bleConnectOptions) {
        super(str, i, bleConnectOptions);
        this.mStrongBindResponse = new BleDeviceBinder.BleBindResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleSecurityRegister.1
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i2, Void r4) {
                if (i2 == 0) {
                    BleSecurityRegister.this.refreshLocalToken();
                    BleSecurityRegister bleSecurityRegister = BleSecurityRegister.this;
                    bleSecurityRegister.reportNonBleLockVersion(((BleSecurityLauncher) bleSecurityRegister).mDeviceMac);
                }
                ((BleSecurityLauncher) BleSecurityRegister.this).mBundle.putString(BluetoothConstants.EXTRA_DID, BluetoothCache.getPropDid(((BleSecurityLauncher) BleSecurityRegister.this).mDeviceMac));
                BluetoothCache.setPropBoundStatus(((BleSecurityLauncher) BleSecurityRegister.this).mDeviceMac, i2 == 0 ? 2 : 0);
                BleSecurityRegister.this.notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, i2);
                BleSecurityRegister.this.dispatchResult(i2);
            }
        };
        this.mRegisterConnector = new BleRegisterConnector(this.mLauncher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshLocalToken() {
        BluetoothCache.setPropTokenBytes(this.mDeviceMac, this.mToken);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public BleSecurityConnector getSecurityConnector() {
        return this.mRegisterConnector;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public void onPostConnect(int i, Bundle bundle) {
        this.mToken = this.mBundle.getByteArray(BluetoothConstants.KEY_TOKEN);
        if (shouldBindToServer()) {
            bindDeviceToServer(this.mStrongBindResponse);
            return;
        }
        refreshLocalToken();
        notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, 0);
        dispatchResult(i);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public void start(IBleSecureConnectResponse iBleSecureConnectResponse) {
        BluetoothService.getReportCoreProvider().startAction(3);
        super.start(iBleSecureConnectResponse);
    }
}
