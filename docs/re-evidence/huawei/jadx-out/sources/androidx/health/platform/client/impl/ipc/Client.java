package androidx.health.platform.client.impl.ipc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.health.platform.client.impl.ipc.internal.BaseQueueOperation;
import androidx.health.platform.client.impl.ipc.internal.ConnectionConfiguration;
import androidx.health.platform.client.impl.ipc.internal.ConnectionManager;
import androidx.health.platform.client.impl.ipc.internal.ExecutionTracker;
import androidx.health.platform.client.impl.ipc.internal.ListenerKey;
import androidx.health.platform.client.impl.ipc.internal.QueueOperation;
import com.google.common.base.Function;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aqt;
import defpackage.aqx;
import defpackage.arb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Client<S extends IInterface> {
    private static final int UNKNOWN_VERSION = -1;
    protected final ConnectionConfiguration mConnectionConfiguration;
    protected final ConnectionManager mConnectionManager;
    protected volatile int mCurrentVersion = -1;
    private final RemoteOperation<S, Integer> mRemoteVersionGetter;
    private final ServiceGetter<S> mServiceGetter;

    public interface ServiceGetter<S> {
        S getService(IBinder iBinder);
    }

    public Client(ClientConfiguration clientConfiguration, ConnectionManager connectionManager, final ServiceGetter<S> serviceGetter, final RemoteOperation<S, Integer> remoteOperation) {
        this.mConnectionConfiguration = new ConnectionConfiguration(clientConfiguration.getServicePackageName(), clientConfiguration.getApiClientName(), clientConfiguration.getBindAction(), new QueueOperation() { // from class: androidx.health.platform.client.impl.ipc.Client.1
            @Override // androidx.health.platform.client.impl.ipc.internal.QueueOperation
            public void setException(Throwable th) {
            }

            @Override // androidx.health.platform.client.impl.ipc.internal.QueueOperation
            public QueueOperation trackExecution(ExecutionTracker executionTracker) {
                return this;
            }

            @Override // androidx.health.platform.client.impl.ipc.internal.QueueOperation
            public void execute(IBinder iBinder) throws RemoteException {
                Client.this.mCurrentVersion = ((Integer) remoteOperation.execute((IInterface) serviceGetter.getService(iBinder))).intValue();
            }

            @Override // androidx.health.platform.client.impl.ipc.internal.QueueOperation
            public ConnectionConfiguration getConnectionConfiguration() {
                return Client.this.mConnectionConfiguration;
            }
        });
        this.mConnectionManager = connectionManager;
        this.mServiceGetter = serviceGetter;
        this.mRemoteVersionGetter = remoteOperation;
    }

    protected <R> ListenableFuture<R> execute(final RemoteOperation<S, R> remoteOperation) {
        return execute(new RemoteFutureOperation() { // from class: androidx.health.platform.client.impl.ipc.Client$$ExternalSyntheticLambda2
            @Override // androidx.health.platform.client.impl.ipc.RemoteFutureOperation
            public final void execute(Object obj, arb arbVar) {
                arbVar.set(remoteOperation.execute((IInterface) obj));
            }
        });
    }

    protected <R> ListenableFuture<R> execute(RemoteFutureOperation<S, R> remoteFutureOperation) {
        arb<R> arbVarA = arb.a();
        this.mConnectionManager.scheduleForExecution(createQueueOperation(remoteFutureOperation, arbVarA));
        return arbVarA;
    }

    protected <R> ListenableFuture<R> executeWithVersionCheck(final int i, final RemoteFutureOperation<S, R> remoteFutureOperation) {
        final arb arbVarA = arb.a();
        aqt.e(getCurrentRemoteVersion(false), new FutureCallback<Integer>() { // from class: androidx.health.platform.client.impl.ipc.Client.2
            @Override // com.google.common.util.concurrent.FutureCallback
            public void onSuccess(Integer num) {
                if (num.intValue() < i) {
                    Client.this.mConnectionManager.scheduleForExecution(new BaseQueueOperation(Client.this.mConnectionConfiguration));
                    arbVarA.setException(Client.this.getApiVersionCheckFailureException(num.intValue(), i));
                } else {
                    Client.this.mConnectionManager.scheduleForExecution(Client.this.createQueueOperation(remoteFutureOperation, arbVarA));
                }
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public void onFailure(Throwable th) {
                arbVarA.setException(th);
            }
        }, aqx.e());
        return arbVarA;
    }

    protected ListenableFuture<Integer> getCurrentRemoteVersion(boolean z) {
        if (this.mCurrentVersion == -1 || z) {
            return aqt.d(execute(this.mRemoteVersionGetter), new Function() { // from class: androidx.health.platform.client.impl.ipc.Client$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return this.f$0.m456x4bf610cf((Integer) obj);
                }
            }, aqx.e());
        }
        return aqt.a(Integer.valueOf(this.mCurrentVersion));
    }

    /* JADX INFO: renamed from: lambda$getCurrentRemoteVersion$1$androidx-health-platform-client-impl-ipc-Client, reason: not valid java name */
    /* synthetic */ Integer m456x4bf610cf(Integer num) {
        this.mCurrentVersion = num.intValue();
        return Integer.valueOf(this.mCurrentVersion);
    }

    protected <R> ListenableFuture<R> registerListener(ListenerKey listenerKey, final RemoteOperation<S, R> remoteOperation) {
        return registerListener(listenerKey, new RemoteFutureOperation() { // from class: androidx.health.platform.client.impl.ipc.Client$$ExternalSyntheticLambda0
            @Override // androidx.health.platform.client.impl.ipc.RemoteFutureOperation
            public final void execute(Object obj, arb arbVar) {
                arbVar.set(remoteOperation.execute((IInterface) obj));
            }
        });
    }

    protected <R> ListenableFuture<R> registerListener(ListenerKey listenerKey, RemoteFutureOperation<S, R> remoteFutureOperation) {
        arb<R> arbVarA = arb.a();
        this.mConnectionManager.registerListener(listenerKey, createQueueOperation(remoteFutureOperation, arbVarA));
        return arbVarA;
    }

    protected <R> ListenableFuture<R> unregisterListener(ListenerKey listenerKey, final RemoteOperation<S, R> remoteOperation) {
        return unregisterListener(listenerKey, new RemoteFutureOperation() { // from class: androidx.health.platform.client.impl.ipc.Client$$ExternalSyntheticLambda3
            @Override // androidx.health.platform.client.impl.ipc.RemoteFutureOperation
            public final void execute(Object obj, arb arbVar) {
                arbVar.set(remoteOperation.execute((IInterface) obj));
            }
        });
    }

    protected <R> ListenableFuture<R> unregisterListener(ListenerKey listenerKey, RemoteFutureOperation<S, R> remoteFutureOperation) {
        arb<R> arbVarA = arb.a();
        this.mConnectionManager.unregisterListener(listenerKey, createQueueOperation(remoteFutureOperation, arbVarA));
        return arbVarA;
    }

    protected Exception getApiVersionCheckFailureException(int i, int i2) {
        return new ApiVersionException(i, i2);
    }

    ConnectionConfiguration getConnectionConfiguration() {
        return this.mConnectionConfiguration;
    }

    ConnectionManager getConnectionManager() {
        return this.mConnectionManager;
    }

    <R> QueueOperation createQueueOperation(final RemoteFutureOperation<S, R> remoteFutureOperation, final arb<R> arbVar) {
        return new BaseQueueOperation(this.mConnectionConfiguration) { // from class: androidx.health.platform.client.impl.ipc.Client.3
            @Override // androidx.health.platform.client.impl.ipc.internal.BaseQueueOperation, androidx.health.platform.client.impl.ipc.internal.QueueOperation
            public void execute(IBinder iBinder) throws RemoteException {
                remoteFutureOperation.execute(Client.this.getService(iBinder), arbVar);
            }

            @Override // androidx.health.platform.client.impl.ipc.internal.BaseQueueOperation, androidx.health.platform.client.impl.ipc.internal.QueueOperation
            public void setException(Throwable th) {
                arbVar.setException(th);
            }

            @Override // androidx.health.platform.client.impl.ipc.internal.BaseQueueOperation, androidx.health.platform.client.impl.ipc.internal.QueueOperation
            public QueueOperation trackExecution(ExecutionTracker executionTracker) {
                executionTracker.track(arbVar);
                return this;
            }
        };
    }

    S getService(IBinder iBinder) {
        return this.mServiceGetter.getService(iBinder);
    }
}
