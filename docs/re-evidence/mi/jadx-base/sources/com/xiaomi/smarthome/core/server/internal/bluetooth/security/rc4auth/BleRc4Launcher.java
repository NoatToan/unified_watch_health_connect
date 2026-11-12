package com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth;

import android.text.TextUtils;
import com.xiaomi.smarthome.cache.BleCacheManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothHelper;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetError;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi;
import com.xiaomi.smarthome.device.bluetooth.security.BLECipher;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleReadResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.common.util.ByteUtils;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BleRc4Launcher extends BleSecurityLauncher implements IBleDeviceBinder {
    protected BleDeviceBinder mBleDeviceBinder;

    public BleRc4Launcher(String str, int i, BleConnectOptions bleConnectOptions) {
        super(str, i, bleConnectOptions);
        this.mBleDeviceBinder = new BleDeviceBinder(this.mLauncher);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.IBleDeviceBinder
    public void bindDeviceToServer(BleDeviceBinder.BleBindResponse bleBindResponse) {
        this.mBleDeviceBinder.bindDeviceToServer(bleBindResponse);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.IBleDeviceBinder
    public int getBindStyle() {
        return this.mBleDeviceBinder.getBindStyle();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public void onCanceled() {
        BleDeviceBinder bleDeviceBinder = this.mBleDeviceBinder;
        if (bleDeviceBinder != null) {
            bleDeviceBinder.cancel();
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.IBleDeviceBinder
    public void readBeaconKeyFromDevice(BleReadResponse bleReadResponse) {
        this.mBleDeviceBinder.readBeaconKeyFromDevice(bleReadResponse);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.IBleDeviceBinder
    public void readSNFromDevice(BleReadResponse bleReadResponse) {
        this.mBleDeviceBinder.readSNFromDevice(bleReadResponse);
    }

    public void refreshRemoteBinded(int i) {
        boolean z = i == 0;
        int bindStyle = getBindStyle();
        if (bindStyle == 1) {
            BluetoothCache.setPropBoundStatus(this.mDeviceMac, z ? 2 : 0);
        } else {
            if (bindStyle != 2) {
                return;
            }
            BluetoothCache.setPropBoundStatus(this.mDeviceMac, z ? 2 : 1);
        }
    }

    public void reportNonBleLockVersion(final String str) {
        final String propDid = BluetoothCache.getPropDid(str);
        final byte[] propTokenBytes = BluetoothCache.getPropTokenBytes(str);
        if (TextUtils.isEmpty(propDid) || ByteUtils.isEmpty(propTokenBytes)) {
            return;
        }
        BleConnectManager.getInstance().read(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_FIRMWARE_VERSION, new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleRc4Launcher.1
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, byte[] bArr) {
                if (i != 0 || ByteUtils.isEmpty(bArr)) {
                    return;
                }
                String str2 = new String(ByteUtils.cutAfterBytes(BLECipher.encrypt(propTokenBytes, bArr), (byte) 0));
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                BleCacheManager.getInstance().getBleDeviceState(str).setCurrentFirmwareVersion(str2);
                DeviceApi.reportCommonBleVersion(propDid, str2, new BleAsyncCallback<Void, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleRc4Launcher.1.1
                    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                    public void onFailure(BleNetError bleNetError) {
                    }

                    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                    public void onSuccess(Void r1) {
                    }
                });
            }
        });
    }

    public boolean shouldBindToServer() {
        BleSecurityConnector securityConnector = getSecurityConnector();
        boolean z = true;
        if ((securityConnector instanceof BleRc4Connector) && (!((BleRc4Connector) securityConnector).checkBindAbility() || !BluetoothHelper.checkBindStyle(this.mProductId))) {
            z = false;
        }
        BluetoothMyLogger.v("ShouldBindToServer: " + z);
        return z;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.IBleDeviceBinder
    public void writeSNToDevice(byte[] bArr, BleWriteResponse bleWriteResponse) {
        this.mBleDeviceBinder.writeSNToDevice(bArr, bleWriteResponse);
    }

    public BleRc4Launcher(String str, int i, byte[] bArr, BleConnectOptions bleConnectOptions) {
        super(str, i, bArr, bleConnectOptions);
        this.mBleDeviceBinder = new BleDeviceBinder(this.mLauncher);
    }
}
