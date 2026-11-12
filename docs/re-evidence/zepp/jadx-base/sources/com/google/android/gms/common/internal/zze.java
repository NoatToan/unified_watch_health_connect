package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zze implements ServiceConnection {
    private final int a;
    public final /* synthetic */ BaseGmsClient b;

    public zze(BaseGmsClient baseGmsClient, int i) {
        this.b = baseGmsClient;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        BaseGmsClient baseGmsClient = this.b;
        if (iBinder == null) {
            BaseGmsClient.j(baseGmsClient, 16);
            return;
        }
        synchronized (baseGmsClient.n) {
            BaseGmsClient baseGmsClient2 = this.b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            baseGmsClient2.o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGmsServiceBroker)) ? new k(iBinder) : (IGmsServiceBroker) iInterfaceQueryLocalInterface;
        }
        this.b.zzl(0, null, this.a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.b.n) {
            this.b.o = null;
        }
        Handler handler = this.b.l;
        handler.sendMessage(handler.obtainMessage(6, this.a, 1));
    }
}
