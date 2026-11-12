package com.ingenic.iwds.remotebroadcast;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;

/* JADX INFO: loaded from: classes18.dex */
public class RemoteBroadcastService extends Service {
    private b a;
    private RemoteBroadcastProxy b;

    public class b extends IRemoteBroadcastService.Stub {
        private b() {
        }

        @Override // com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService
        public int registerRemoteBroadcastCallback(IRemoteBroadcastCallback iRemoteBroadcastCallback) {
            return RemoteBroadcastService.this.b.a(iRemoteBroadcastCallback);
        }

        @Override // com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService
        public void registerRemoteReceiver(int i, int i2, IntentFilter intentFilter, String str) {
            RemoteBroadcastService.this.b.g(i, i2, intentFilter, str);
        }

        @Override // com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService
        public void sendRemoteBroadcast(int i, Intent intent, String str) {
            RemoteBroadcastService.this.b.h(i, intent, str);
        }

        @Override // com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService
        public void unregisterRemoteBroadcastCallback(int i) {
            RemoteBroadcastService.this.b.d(i);
        }

        @Override // com.ingenic.iwds.remotebroadcast.IRemoteBroadcastService
        public void unregisterRemoteReceiver(int i, int i2) {
            RemoteBroadcastService.this.b.e(i, i2);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.b = RemoteBroadcastProxy.getInstance(this);
        this.a = new b();
    }
}
