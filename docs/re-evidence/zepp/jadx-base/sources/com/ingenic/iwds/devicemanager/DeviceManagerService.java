package com.ingenic.iwds.devicemanager;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.os.RemoteException;
import com.ingenic.iwds.smartsense.SensorService;
import com.ingenic.iwds.utils.IwdsLog;

/* JADX INFO: loaded from: classes18.dex */
public class DeviceManagerService extends Service {
    private static Context b;
    private b a = new b();

    public static class b extends IDeviceManagerService.Stub {
        private b() {
        }

        @Override // com.ingenic.iwds.devicemanager.IDeviceManagerService
        public synchronized boolean isWearOnRightHand() throws RemoteException {
            return DeviceManagerService.d(DeviceManagerService.b, "isOnRightHand", false);
        }

        @Override // com.ingenic.iwds.devicemanager.IDeviceManagerService
        public synchronized boolean setWearOnRightHand(boolean z) throws RemoteException {
            boolean wearOnRightHand;
            DeviceManagerService.e(DeviceManagerService.b, "isOnRightHand", z);
            wearOnRightHand = SensorService.setWearOnRightHand(z);
            if (wearOnRightHand) {
                DeviceManagerService.b.sendBroadcast(new Intent(z ? DeviceManagerServiceManager.ACTION_WEAR_ON_RIGHT_HAND : DeviceManagerServiceManager.ACTION_WEAR_ON_LEFT_HAND));
            }
            return wearOnRightHand;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(Context context, String str, boolean z) {
        return context.getSharedPreferences("DeviceManagerService", 0).getBoolean(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Context context, String str, boolean z) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("DeviceManagerService", 0).edit();
        editorEdit.putBoolean(str, z);
        editorEdit.commit();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IwdsLog.d(this, "onBind");
        return this.a;
    }

    @Override // android.app.Service
    public void onCreate() {
        IwdsLog.d(this, "onCreate");
        super.onCreate();
        Context baseContext = getBaseContext();
        b = baseContext;
        SensorService.setWearOnRightHand(d(baseContext, "isOnRightHand", false));
    }
}
