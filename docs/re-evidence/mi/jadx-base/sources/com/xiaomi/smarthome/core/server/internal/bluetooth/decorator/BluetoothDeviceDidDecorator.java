package com.xiaomi.smarthome.core.server.internal.bluetooth.decorator;

import android.text.TextUtils;
import com.xiaomi.smarthome.core.entity.device.BtDevice;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;

/* JADX INFO: loaded from: classes10.dex */
public class BluetoothDeviceDidDecorator implements Decorator {
    private static volatile BluetoothDeviceDidDecorator sInstance;

    public static BluetoothDeviceDidDecorator getInstance() {
        if (sInstance == null) {
            synchronized (BluetoothDeviceDidDecorator.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new BluetoothDeviceDidDecorator();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.decorator.Decorator
    public void decorate(BtDevice btDevice) {
        String propDid = BluetoothCache.getPropDid(btDevice.getMac());
        if (!TextUtils.isEmpty(propDid)) {
            btDevice.setDid(propDid);
        }
        if (TextUtils.isEmpty(btDevice.getDid())) {
            btDevice.setDid(btDevice.getMac());
        }
    }
}
