package androidx.health.platform.client.impl.ipc.internal;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface QueueOperation {
    void execute(IBinder iBinder) throws RemoteException;

    ConnectionConfiguration getConnectionConfiguration();

    void setException(Throwable th);

    QueueOperation trackExecution(ExecutionTracker executionTracker);
}
