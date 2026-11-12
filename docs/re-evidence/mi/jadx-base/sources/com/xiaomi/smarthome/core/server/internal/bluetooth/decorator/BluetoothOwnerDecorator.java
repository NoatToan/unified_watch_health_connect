package com.xiaomi.smarthome.core.server.internal.bluetooth.decorator;

import android.text.TextUtils;
import com.xiaomi.smarthome.core.entity.device.BtDevice;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;

/* JADX INFO: loaded from: classes10.dex */
public class BluetoothOwnerDecorator implements Decorator {
    private static volatile BluetoothOwnerDecorator sInstance;

    public static BluetoothOwnerDecorator getInstance() {
        if (sInstance == null) {
            synchronized (BluetoothOwnerDecorator.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new BluetoothOwnerDecorator();
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
        String propOwnerId = BluetoothCache.getPropOwnerId(btDevice.getMac());
        if (!TextUtils.isEmpty(propOwnerId)) {
            btDevice.setOwnerId(propOwnerId);
        }
        String propOwnerName = BluetoothCache.getPropOwnerName(btDevice.getMac());
        if (!TextUtils.isEmpty(propOwnerName)) {
            btDevice.setOwnerName(propOwnerName);
        }
        btDevice.setPermitLevel(BluetoothCache.getPropPermitLevel(btDevice.getMac()));
    }
}
