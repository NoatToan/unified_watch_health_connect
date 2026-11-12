package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth;

import android.os.Bundle;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetError;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse;

/* JADX INFO: loaded from: classes10.dex */
public class BleMeshRegister extends BleSecurityLauncher {
    private BleMeshRegisterConnector mRegisterConnector;

    public BleMeshRegister(String str, int i, BleConnectOptions bleConnectOptions) {
        super(str, i, bleConnectOptions);
        this.mRegisterConnector = new BleMeshRegisterConnector(this.mLauncher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySuccess(int i) {
        notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, 0);
        dispatchResult(i);
        this.mRegisterConnector.disconnect();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public BleSecurityConnector getSecurityConnector() {
        return this.mRegisterConnector;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public void onPostConnect(final int i, Bundle bundle) {
        if (i == 0) {
            BluetoothCache.setPropDid(this.mDeviceMac, this.mRegisterConnector.getDeviceDid());
            this.mBundle.putString(BluetoothConstants.EXTRA_DID, this.mRegisterConnector.getDeviceDid());
        }
        DeviceApi.reportBleMeshVersion(this.mDeviceMac, this.mRegisterConnector.getDeviceDid(), new BleAsyncCallback<Void, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleMeshRegister.1
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onFailure(BleNetError bleNetError) {
                if (bleNetError != null) {
                    BluetoothMyLogger.d("report version failed: " + bleNetError.toString());
                }
                BleMeshRegister.this.notifySuccess(i);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onSuccess(Void r2) {
                BluetoothMyLogger.d("report version success");
                BleMeshRegister.this.notifySuccess(i);
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public void start(IBleSecureConnectResponse iBleSecureConnectResponse) {
        BluetoothService.getReportCoreProvider().startAction(3);
        super.start(iBleSecureConnectResponse);
    }
}
