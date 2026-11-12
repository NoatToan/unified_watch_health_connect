package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
class f0 implements ServiceConnection {
    public final /* synthetic */ ServiceClient a;

    public f0(ServiceClient serviceClient) {
        this.a = serviceClient;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.a) {
            this.a.f = new Messenger(iBinder);
            this.a.e = false;
            Iterator it2 = this.a.d.iterator();
            while (it2.hasNext()) {
                try {
                    this.a.f.send((Message) it2.next());
                } catch (RemoteException e) {
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                }
            }
            this.a.d.clear();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.a.f = null;
        this.a.e = false;
    }
}
