package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth;

import android.os.Bundle;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetError;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;

/* JADX INFO: loaded from: classes10.dex */
public class BleSecurityDoubleFactorSharedLogin extends BleSecurityLauncher {
    private BleSecurityDoubleFactorSharedLoginConnector mLoginConnector;

    public BleSecurityDoubleFactorSharedLogin(String str, String str2, int i, BleConnectOptions bleConnectOptions) {
        super(str, i, null, bleConnectOptions);
        this.mLoginConnector = new BleSecurityDoubleFactorSharedLoginConnector(this.mLauncher, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doPostResult(int i, Bundle bundle) {
        BluetoothCache.setPropSessionKeyBytes(this.mDeviceMac, bundle.getByteArray(BluetoothConstants.KEY_SESSION_KEY));
        BleSecurityChipEncrypt.resetEncryptCounter(this.mDeviceMac);
        notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, i);
        dispatchResult(i);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public BleSecurityConnector getSecurityConnector() {
        return this.mLoginConnector;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public void onPostConnect(final int i, final Bundle bundle) {
        if (i != 0) {
            doPostResult(i, bundle);
        } else {
            this.mLoginConnector.reportBleLockVersion(this.mDeviceMac, BluetoothCache.getPropDid(this.mDeviceMac), new BleAsyncCallback<Void, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityDoubleFactorSharedLogin.1
                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                public void onFailure(BleNetError bleNetError) {
                    BleSecurityDoubleFactorSharedLogin.this.doPostResult(i, bundle);
                }

                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                public void onSuccess(Void r3) {
                    BleSecurityDoubleFactorSharedLogin.this.doPostResult(i, bundle);
                }
            });
        }
    }
}
