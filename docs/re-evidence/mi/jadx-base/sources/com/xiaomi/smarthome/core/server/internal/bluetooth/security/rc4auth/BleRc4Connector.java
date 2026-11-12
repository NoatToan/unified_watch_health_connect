package com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth;

import android.os.Bundle;
import com.xiaomi.smarthome.cache.BleCacheManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.IBleDeviceLauncher;
import com.xiaomi.smarthome.device.bluetooth.security.BLECipher;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.BleGattProfile;
import com.xiaomi.smarthome.library.bluetooth.connect.BleGattService;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleNotifyResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleReadResponse;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import com.xiaomi.smarthome.report.IReportCoreProvider;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BleRc4Connector extends BleSecurityConnector {
    protected boolean mNeedBindToServer;

    public BleRc4Connector(IBleDeviceLauncher iBleDeviceLauncher) {
        super(iBleDeviceLauncher);
        this.mNeedBindToServer = true;
    }

    private boolean checkFirmwareVersionAccess() {
        return checkBindAbility();
    }

    public boolean checkBindAbility() {
        return this.mNeedBindToServer;
    }

    public boolean checkNeedBindToServer(Bundle bundle) {
        BleGattService service;
        return bundle != null && (service = ((BleGattProfile) bundle.getParcelable("key_gatt_profile")).getService(BluetoothConstants.MISERVICE)) != null && service.contains(BluetoothConstants.CHARACTER_SN) && service.contains(BluetoothConstants.CHARACTER_BEACONKEY);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void onConnectSuccess(Bundle bundle) {
        this.mNeedBindToServer = checkNeedBindToServer(bundle);
    }

    public void openTokenNotify(final BleNotifyResponse bleNotifyResponse) {
        BluetoothService.getReportCoreProvider().startAction(23);
        IReportCoreProvider reportCoreProvider = BluetoothService.getReportCoreProvider();
        UUID uuid = BluetoothConstants.CHARACTER_TOKEN;
        reportCoreProvider.addContextByActionCode(23, "char", uuid.toString());
        BleConnectManager.getInstance().notify(getMac(), BluetoothConstants.MISERVICE, uuid, new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleRc4Connector.2
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r5) {
                if (i == 0) {
                    BluetoothService.getReportCoreProvider().finishAction(23);
                } else {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(23, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(23, 3);
                }
                bleNotifyResponse.onResponse(i, null);
            }
        });
    }

    public void readFirmwareVersionFromDevice(final byte[] bArr, final int i) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("readFirmwareVersionFromDevice: ");
        BluetoothService.getReportCoreProvider().startAction(40);
        BleConnectManager.getInstance().read(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_FIRMWARE_VERSION, new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleRc4Connector.1
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i2, byte[] bArr2) {
                if (i2 != 0 || ByteUtils.isEmpty(bArr2)) {
                    if (ByteUtils.isEmpty(bArr2)) {
                        BluetoothService.getReportCoreProvider().addContextByActionCode(40, "msg", "data is empty");
                    }
                    BluetoothService.getReportCoreProvider().addContextByActionCode(40, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(40, 2);
                } else {
                    String str = new String(ByteUtils.cutAfterBytes(BLECipher.encrypt(bArr, bArr2), (byte) 0));
                    BluetoothMyLogger.w("firmWare version " + str);
                    BluetoothCache.setPropFirVersion(BleRc4Connector.this.getMac(), str);
                    ((BleSecurityConnector) BleRc4Connector.this).mBundle.putString(BluetoothConstants.KEY_VERSION, str);
                    BleCacheManager.getInstance().getBleDeviceState(BleRc4Connector.this.getMac()).setCurrentFirmwareVersion(str);
                    BluetoothService.getReportCoreProvider().finishAction(40);
                }
                BleRc4Connector.this.dispatchResult(i);
            }
        });
    }

    public boolean willNotifyTokenNotMatch() {
        return checkBindAbility();
    }
}
