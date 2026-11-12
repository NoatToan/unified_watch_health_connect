package kh;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes7.dex */
public class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f104707a;

    public a(b bVar) {
        this.f104707a = bVar;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ih.a c1788a;
        b bVar = this.f104707a;
        int i14 = ih.a.AbstractBinderC1787a.f93440a;
        if (iBinder == null) {
            c1788a = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.zui.deviceidservice.IDeviceidInterface");
            c1788a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ih.a)) ? new ih.a.AbstractBinderC1787a.C1788a(iBinder) : (ih.a) iInterfaceQueryLocalInterface;
        }
        bVar.f104709b = c1788a;
        this.f104707a.getClass();
        this.f104707a.getClass();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        b bVar = this.f104707a;
        bVar.f104709b = null;
        bVar.getClass();
    }
}
