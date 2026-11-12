package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class ods implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zxl f29047a;

    public ods(zxl zxlVar) {
        this.f29047a = zxlVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f29047a) {
            this.f29047a.f = new Messenger(iBinder);
            this.f29047a.e = false;
            Iterator it = this.f29047a.d.iterator();
            while (it.hasNext()) {
                try {
                    this.f29047a.f.send((Message) it.next());
                } catch (RemoteException e) {
                    x9s.s(e);
                }
            }
            this.f29047a.d.clear();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f29047a.f = null;
        this.f29047a.e = false;
    }
}
