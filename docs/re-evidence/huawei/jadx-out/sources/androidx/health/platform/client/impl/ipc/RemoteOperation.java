package androidx.health.platform.client.impl.ipc;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface RemoteOperation<S, R> {
    R execute(S s) throws RemoteException;
}
