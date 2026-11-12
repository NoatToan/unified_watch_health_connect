package com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth;

import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleDeleteDeviceCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetError;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class BleStandardAuthRegister extends BleSecurityLauncher {
    private BleStandardAuthRegisterConnector mRegisterConnector;

    public BleStandardAuthRegister(String str, int i, BleConnectOptions bleConnectOptions) {
        super(str, i, bleConnectOptions);
        this.mRegisterConnector = new BleStandardAuthRegisterConnector(this.mLauncher, bleConnectOptions.getQrcodeOob());
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
        if (i != 0) {
            dispatchResult(i);
            return;
        }
        byte[] byteArray = bundle.getByteArray(BluetoothConstants.KEY_TOKEN);
        BluetoothCache.setPropBoundStatus(this.mDeviceMac, 2);
        BluetoothCache.setPropDid(this.mDeviceMac, this.mRegisterConnector.getDidText());
        BluetoothCache.setPropTokenBytes(this.mDeviceMac, byteArray);
        String didText = this.mRegisterConnector.getDidText();
        this.mBundle.putString(BluetoothConstants.EXTRA_DID, didText);
        this.mRegisterConnector.reportBleLockVersion(this.mDeviceMac, didText, new BleAsyncCallback<Void, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegister.1
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onFailure(BleNetError bleNetError) {
                if (bleNetError != null) {
                    BluetoothMyLogger.d("report version failed: " + bleNetError.toString());
                }
                BleStandardAuthRegister.this.notifySuccess(i);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onSuccess(Void r2) {
                BluetoothMyLogger.d("report version success");
                BleStandardAuthRegister.this.notifySuccess(i);
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public void onPostConnectFailed(int i) {
        if (i == 0 || BluetoothCache.getPropBoundStatus(this.mDeviceMac) != 2 || TextUtils.isEmpty(this.mRegisterConnector.getDidText())) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.mRegisterConnector.getDidText());
        BluetoothService.getBleCoreProvider().delDeviceBatch(arrayList, new BleDeleteDeviceCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegister.2
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleDeleteDeviceCallback
            public void onFailure(Bundle bundle) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleDeleteDeviceCallback
            public void onSuccess(Bundle bundle) {
                BluetoothCache.setPropBoundStatus(((BleSecurityLauncher) BleStandardAuthRegister.this).mDeviceMac, 0);
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public void start(IBleSecureConnectResponse iBleSecureConnectResponse) {
        BluetoothService.getReportCoreProvider().startAction(3);
        super.start(iBleSecureConnectResponse);
    }
}
