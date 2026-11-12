package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes22.dex */
final class azk implements ServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final azj f843c;

    azk(azj azjVar) {
        this.f843c = azjVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f843c.d.e("RemoteServiceConnection.onServiceConnected(%s)", componentName);
        this.f843c.b(new azn(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f843c.d.e("RemoteServiceConnection.onServiceDisconnected(%s)", componentName);
        this.f843c.b(new azr(this));
    }
}
