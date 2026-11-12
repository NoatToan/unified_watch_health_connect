package com.xiaomi.smarthome.core.server.internal.bluetooth.decorator;

import com.xiaomi.smarthome.core.entity.device.BtDevice;

/* JADX INFO: loaded from: classes10.dex */
public class BluetoothDeviceDecorator implements Decorator {
    private static Decorator[] DECORATOR = {BluetoothDeviceModelDecorator.getInstance(), BluetoothDeviceNameDecorator.getInstance(), BluetoothDeviceDidDecorator.getInstance(), BluetoothOwnerDecorator.getInstance()};
    private static volatile BluetoothDeviceDecorator sInstance;

    public static BluetoothDeviceDecorator getInstance() {
        if (sInstance == null) {
            synchronized (BluetoothDeviceDecorator.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new BluetoothDeviceDecorator();
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
        for (Decorator decorator : DECORATOR) {
            decorator.decorate(btDevice);
        }
    }
}
