package com.xiaomi.hm.health.bt.gatt;

import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.HMBleModule;
import com.xiaomi.hm.health.bt.ISBEListener;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.BluetoothSwitcher;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes19.dex */
public class BluetoothSwitcher {
    private static final String a = "BluetoothSwitcher";
    private static final int b = 3000;
    private static final int c = 2;
    private static final ExecutorService d = Executors.newSingleThreadExecutor();
    private static volatile boolean e = false;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b() {
        Debug.fi(a, "offOn start!");
        if (!GattUtils.enableBluetooth(false)) {
            e = false;
            return;
        }
        int i = 0;
        do {
            try {
                Thread.sleep(3000L);
            } catch (Exception unused) {
            }
            if (!GattUtils.isBluetoothEnable()) {
                break;
            } else {
                i++;
            }
        } while (i < 2);
        if (!GattUtils.enableBluetooth(true)) {
            e = false;
            return;
        }
        int i2 = 0;
        do {
            try {
                Thread.sleep(3000L);
            } catch (Exception unused2) {
            }
            if (GattUtils.isBluetoothEnable()) {
                break;
            } else {
                i2++;
            }
        } while (i2 < 2);
        e = false;
        Debug.fi(a, "offOn stop!");
    }

    public static synchronized boolean isSwitching() {
        return e;
    }

    public static synchronized void offOn(int exception) {
        Debug.fi(a, "exception:" + exception);
        if (!HMBleConfig.SUPPORT_AUTO_RESTART_BT) {
            ISBEListener sBEListener = HMBleModule.getSBEListener();
            if (sBEListener != null) {
                sBEListener.onException(exception);
            }
        } else {
            if (exception == 0) {
                return;
            }
            Debug.fi(a, "offOn");
            if (!e && GattUtils.isBluetoothEnable()) {
                e = true;
                d.execute(new Runnable() { // from class: e30
                    @Override // java.lang.Runnable
                    public final void run() {
                        BluetoothSwitcher.b();
                    }
                });
            }
        }
    }
}
