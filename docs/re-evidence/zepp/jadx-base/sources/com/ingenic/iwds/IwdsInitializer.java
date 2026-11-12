package com.ingenic.iwds;

import android.os.PowerManager;

/* JADX INFO: loaded from: classes18.dex */
public class IwdsInitializer {
    private static PowerManager a;
    private static PowerManager.WakeLock b;
    private static IwdsInitializer c;

    private IwdsInitializer() {
    }

    public static boolean acquireWakeLock(int i) {
        PowerManager.WakeLock wakeLock = b;
        if (wakeLock == null) {
            return false;
        }
        if (wakeLock.isHeld()) {
            return true;
        }
        b.acquire(i);
        return true;
    }

    private static final native void classInitNative();

    public static IwdsInitializer getInstance() {
        if (c == null) {
            c = new IwdsInitializer();
        }
        return c;
    }

    private static final native void nativeInit(DeviceDescriptor deviceDescriptor, boolean z);

    public void initialize(DeviceDescriptor deviceDescriptor) {
        if (deviceDescriptor.devClass == 0 && deviceDescriptor.devSubClass == 1) {
            PowerManager powerManager = (PowerManager) IwdsApplication.getAppContext().getSystemService("power");
            a = powerManager;
            if (powerManager != null) {
                b = powerManager.newWakeLock(1, "UniconnServer");
            }
        }
        System.loadLibrary("iwds");
        nativeInit(deviceDescriptor, true);
        classInitNative();
    }
}
