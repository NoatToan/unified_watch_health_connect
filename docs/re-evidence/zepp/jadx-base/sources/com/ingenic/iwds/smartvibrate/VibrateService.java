package com.ingenic.iwds.smartvibrate;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.ingenic.iwds.utils.IwdsLog;

/* JADX INFO: loaded from: classes18.dex */
public class VibrateService extends Service {
    private VibrateServiceStub a = new VibrateServiceStub();

    public static class VibrateServiceStub extends IVibrateService.Stub {
        private VibrateServiceStub() {
        }

        private static final native int nativeSpecialVibrate(int[] iArr);

        @Override // com.ingenic.iwds.smartvibrate.IVibrateService
        public int Drv2605Vibrate(int[] iArr) throws RemoteException {
            return nativeSpecialVibrate(iArr);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IwdsLog.d(this, "onBind()");
        return this.a;
    }
}
