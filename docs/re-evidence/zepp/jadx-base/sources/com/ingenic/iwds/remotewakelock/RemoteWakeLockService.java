package com.ingenic.iwds.remotewakelock;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes18.dex */
public class RemoteWakeLockService extends Service {
    private RemoteWakeLockProxy a;
    private b b;

    public class b extends IRemoteWakeLockService.Stub {
        private b() {
        }

        @Override // com.ingenic.iwds.remotewakelock.IRemoteWakeLockService
        public void acquireWakeLock(int i, int i2, long j) {
            RemoteWakeLockService.this.a.j(i, i2, j);
        }

        @Override // com.ingenic.iwds.remotewakelock.IRemoteWakeLockService
        public void destroyRemoteWakeLock(int i, int i2) {
            RemoteWakeLockService.this.a.f(i, i2);
        }

        @Override // com.ingenic.iwds.remotewakelock.IRemoteWakeLockService
        public void newRemoteWakeLock(int i, int i2, int i3, String str) {
            RemoteWakeLockService.this.a.i(i, i2, i3, str);
        }

        @Override // com.ingenic.iwds.remotewakelock.IRemoteWakeLockService
        public int registerRemoteWakeLockCallback(IRemoteWakeLockCallback iRemoteWakeLockCallback) {
            return RemoteWakeLockService.this.a.a(iRemoteWakeLockCallback);
        }

        @Override // com.ingenic.iwds.remotewakelock.IRemoteWakeLockService
        public void releaseWakeLock(int i, int i2) {
            RemoteWakeLockService.this.a.E(i, i2);
        }

        @Override // com.ingenic.iwds.remotewakelock.IRemoteWakeLockService
        public void unregisterRemoteWakeLockCallback(int i) {
            RemoteWakeLockService.this.a.e(i);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.b;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.a = RemoteWakeLockProxy.getInstance(this);
        this.b = new b();
    }
}
