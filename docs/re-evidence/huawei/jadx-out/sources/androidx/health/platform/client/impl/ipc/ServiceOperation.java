package androidx.health.platform.client.impl.ipc;

import android.os.IBinder;
import android.os.RemoteException;
import defpackage.arb;

/* JADX INFO: loaded from: classes20.dex */
public interface ServiceOperation<R> {
    void execute(IBinder iBinder, arb<R> arbVar) throws RemoteException;
}
