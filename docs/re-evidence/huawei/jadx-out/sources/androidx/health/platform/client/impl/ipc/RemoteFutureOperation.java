package androidx.health.platform.client.impl.ipc;

import android.os.RemoteException;
import defpackage.arb;

/* JADX INFO: loaded from: classes3.dex */
public interface RemoteFutureOperation<S, R> {
    void execute(S s, arb<R> arbVar) throws RemoteException;
}
