package com.ingenic.iwds;

import android.content.Context;

/* JADX INFO: loaded from: classes18.dex */
public class IwdsApplication {
    private static Context b;
    private DeviceDescriptor a = null;

    public static Context getAppContext() {
        return b;
    }

    public DeviceDescriptor getLocalDeviceDescriptor() {
        return this.a;
    }

    public boolean initialize(Context context, int i, int i2) {
        b = context.getApplicationContext();
        this.a = new DeviceDescriptor("any", "any", i, i2);
        IwdsInitializer.getInstance().initialize(this.a);
        return true;
    }
}
