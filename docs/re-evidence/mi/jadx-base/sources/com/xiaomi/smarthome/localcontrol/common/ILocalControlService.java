package com.xiaomi.smarthome.localcontrol.common;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public class ILocalControlService extends Service {
    private static final String TAG = "ILocalControlService";
    LocalServiceManager serviceManager = new LocalServiceManager();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.serviceManager;
    }
}
