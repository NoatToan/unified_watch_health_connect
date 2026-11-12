package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class x6s implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d6s f38768a;

    public x6s(d6s d6sVar) {
        this.f38768a = d6sVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f38768a) {
            this.f38768a.d = new Messenger(iBinder);
            this.f38768a.g = false;
            Iterator it = this.f38768a.f.iterator();
            while (it.hasNext()) {
                try {
                    this.f38768a.d.send((Message) it.next());
                } catch (RemoteException e) {
                    x9s.s(e);
                }
            }
            this.f38768a.f.clear();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f38768a.d = null;
        this.f38768a.g = false;
    }
}
