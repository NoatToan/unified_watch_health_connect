package com.xiaomi.smarthome.core.server.internal.bluetooth.decorator;

import android.text.TextUtils;
import com.xiaomi.smarthome.core.entity.device.BtDevice;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;

/* JADX INFO: loaded from: classes10.dex */
public class BluetoothDeviceModelDecorator implements Decorator {
    private static volatile BluetoothDeviceModelDecorator sInstance;

    public static BluetoothDeviceModelDecorator getInstance() {
        if (sInstance == null) {
            synchronized (BluetoothDeviceModelDecorator.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new BluetoothDeviceModelDecorator();
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
        if (TextUtils.isEmpty(btDevice.getModel())) {
            String propModel = BluetoothCache.getPropModel(btDevice.getMac());
            if (TextUtils.isEmpty(propModel)) {
                return;
            }
            btDevice.setModel(propModel);
        }
    }
}
