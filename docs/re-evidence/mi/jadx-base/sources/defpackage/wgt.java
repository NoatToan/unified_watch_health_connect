package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes5.dex */
public final class wgt implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fht f37966a;

    public /* synthetic */ wgt(fht fhtVar, lgt lgtVar) {
        this.f37966a = fhtVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f37966a.f17799b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f37966a.c().post(new vft(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f37966a.f17799b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f37966a.c().post(new dgt(this));
    }
}
