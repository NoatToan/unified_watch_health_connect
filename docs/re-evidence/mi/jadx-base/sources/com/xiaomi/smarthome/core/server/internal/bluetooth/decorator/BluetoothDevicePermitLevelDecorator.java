package com.xiaomi.smarthome.core.server.internal.bluetooth.decorator;

import android.os.Bundle;
import com.xiaomi.smarthome.core.entity.device.BtDevice;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService;
import com.xiaomi.smarthome.library.bluetooth.BluetoothContextManager;

/* JADX INFO: loaded from: classes10.dex */
public class BluetoothDevicePermitLevelDecorator implements Decorator {
    private static volatile BluetoothDevicePermitLevelDecorator sInstance;

    public static BluetoothDevicePermitLevelDecorator getInstance() {
        if (sInstance == null) {
            synchronized (BluetoothDevicePermitLevelDecorator.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new BluetoothDevicePermitLevelDecorator();
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
        Bundle bundle = new Bundle();
        BluetoothService.getInstance(BluetoothContextManager.getContext()).getBluetoothCache(btDevice.getMac(), 15, bundle);
        btDevice.setPermitLevel(bundle.getInt(IBluetoothService.EXTRA_RESULT, 0));
        if (btDevice.getPermitLevel() == 0) {
            btDevice.setOwner(true);
        }
    }
}
