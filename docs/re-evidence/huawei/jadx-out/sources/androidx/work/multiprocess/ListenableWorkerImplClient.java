package androidx.work.multiprocess;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.work.Logger;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class ListenableWorkerImplClient {
    static final String TAG = Logger.tagWithPrefix("ListenableWorkerImplClient");
    private Connection mConnection;
    final Context mContext;
    final Executor mExecutor;
    private final Object mLock = new Object();

    public ListenableWorkerImplClient(Context context, Executor executor) {
        this.mContext = context;
        this.mExecutor = executor;
    }

    public ListenableFuture<IListenableWorkerImpl> getListenableWorkerImpl(ComponentName componentName) {
        SettableFuture<IListenableWorkerImpl> settableFuture;
        synchronized (this.mLock) {
            if (this.mConnection == null) {
                Logger.get().debug(TAG, "Binding to " + componentName.getPackageName() + ", " + componentName.getClassName());
                this.mConnection = new Connection();
                try {
                    Intent intent = new Intent();
                    intent.setComponent(componentName);
                    if (!this.mContext.bindService(intent, this.mConnection, 1)) {
                        unableToBind(this.mConnection, new RuntimeException("Unable to bind to service"));
                    }
                } catch (Throwable th) {
                    unableToBind(this.mConnection, th);
                }
                settableFuture = this.mConnection.mFuture;
            } else {
                settableFuture = this.mConnection.mFuture;
            }
            throw th;
        }
        return settableFuture;
    }

    public ListenableFuture<byte[]> execute(ComponentName componentName, RemoteDispatcher<IListenableWorkerImpl> remoteDispatcher) {
        return execute(getListenableWorkerImpl(componentName), remoteDispatcher, new RemoteCallback());
    }

    public ListenableFuture<byte[]> execute(final ListenableFuture<IListenableWorkerImpl> listenableFuture, final RemoteDispatcher<IListenableWorkerImpl> remoteDispatcher, final RemoteCallback remoteCallback) {
        listenableFuture.addListener(new Runnable() { // from class: androidx.work.multiprocess.ListenableWorkerImplClient.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    final IListenableWorkerImpl iListenableWorkerImpl = (IListenableWorkerImpl) listenableFuture.get();
                    remoteCallback.setBinder(iListenableWorkerImpl.asBinder());
                    ListenableWorkerImplClient.this.mExecutor.execute(new Runnable() { // from class: androidx.work.multiprocess.ListenableWorkerImplClient.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                remoteDispatcher.execute(iListenableWorkerImpl, remoteCallback);
                            } catch (Throwable th) {
                                Logger.get().error(ListenableWorkerImplClient.TAG, "Unable to execute", th);
                                ListenableCallback.ListenableCallbackRunnable.reportFailure(remoteCallback, th);
                            }
                        }
                    });
                } catch (InterruptedException | ExecutionException e) {
                    Logger.get().error(ListenableWorkerImplClient.TAG, "Unable to bind to service", e);
                    ListenableCallback.ListenableCallbackRunnable.reportFailure(remoteCallback, e);
                }
            }
        }, this.mExecutor);
        return remoteCallback.getFuture();
    }

    public void unbindService() {
        synchronized (this.mLock) {
            Connection connection = this.mConnection;
            if (connection != null) {
                this.mContext.unbindService(connection);
                this.mConnection = null;
            }
        }
    }

    public Connection getConnection() {
        return this.mConnection;
    }

    public static class Connection implements ServiceConnection {
        private static final String TAG = Logger.tagWithPrefix("ListenableWorkerImplSession");
        final SettableFuture<IListenableWorkerImpl> mFuture = SettableFuture.create();

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Logger.get().debug(TAG, "Service connected");
            this.mFuture.set(IListenableWorkerImpl.Stub.asInterface(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Logger.get().warning(TAG, "Service disconnected");
            this.mFuture.setException(new RuntimeException("Service disconnected"));
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            Logger.get().warning(TAG, "Binding died");
            this.mFuture.setException(new RuntimeException("Binding died"));
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            Logger.get().error(TAG, "Unable to bind to service");
            this.mFuture.setException(new RuntimeException("Cannot bind to service " + componentName));
        }
    }

    private static void unableToBind(Connection connection, Throwable th) {
        Logger.get().error(TAG, "Unable to bind to service", th);
        connection.mFuture.setException(th);
    }
}
