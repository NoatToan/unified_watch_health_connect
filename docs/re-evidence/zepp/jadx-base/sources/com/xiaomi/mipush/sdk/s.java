package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
class s implements ServiceConnection {
    public final /* synthetic */ ag a;

    public s(ag agVar) {
        this.a = agVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.a) {
            this.a.d = new Messenger(iBinder);
            this.a.g = false;
            Iterator it2 = this.a.f.iterator();
            while (it2.hasNext()) {
                try {
                    this.a.d.send((Message) it2.next());
                } catch (RemoteException e) {
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                }
            }
            this.a.f.clear();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.a.d = null;
        this.a.g = false;
    }
}
