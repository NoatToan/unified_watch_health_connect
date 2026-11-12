package androidx.work.multiprocess;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import androidx.arch.core.util.Function;
import androidx.core.os.HandlerCompat;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.multiprocess.parcelable.ParcelConverters;
import androidx.work.multiprocess.parcelable.ParcelableForegroundRequestInfo;
import androidx.work.multiprocess.parcelable.ParcelableUpdateRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl;
import androidx.work.multiprocess.parcelable.ParcelableWorkInfos;
import androidx.work.multiprocess.parcelable.ParcelableWorkQuery;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequests;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class RemoteWorkManagerClient extends RemoteWorkManager {
    private static final long SESSION_TIMEOUT_MILLIS = 60000;
    static final String TAG = Logger.tagWithPrefix("RemoteWorkManagerClient");
    final Context mContext;
    final Executor mExecutor;
    private final Handler mHandler;
    final Object mLock;
    Session mSession;
    private volatile long mSessionIndex;
    private final long mSessionTimeout;
    private final SessionTracker mSessionTracker;
    final WorkManagerImpl mWorkManager;

    public RemoteWorkManagerClient(Context context, WorkManagerImpl workManagerImpl) {
        this(context, workManagerImpl, 60000L);
    }

    public RemoteWorkManagerClient(Context context, WorkManagerImpl workManagerImpl, long j) {
        this.mContext = context.getApplicationContext();
        this.mWorkManager = workManagerImpl;
        this.mExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        this.mLock = new Object();
        this.mSession = null;
        this.mSessionTracker = new SessionTracker(this);
        this.mSessionTimeout = j;
        this.mHandler = HandlerCompat.createAsync(Looper.getMainLooper());
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public ListenableFuture<Void> enqueue(WorkRequest workRequest) {
        return enqueue(Collections.singletonList(workRequest));
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public ListenableFuture<Void> enqueue(final List<WorkRequest> list) {
        return RemoteClientUtils.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.1
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IWorkManagerImpl iWorkManagerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                iWorkManagerImpl.enqueueWorkRequests(ParcelConverters.marshall(new ParcelableWorkRequests((List<WorkRequest>) list)), iWorkManagerImplCallback);
            }
        }), RemoteClientUtils.sVoidMapper, this.mExecutor);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public ListenableFuture<Void> enqueueUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list) {
        return beginUniqueWork(str, existingWorkPolicy, list).enqueue();
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public ListenableFuture<Void> enqueueUniquePeriodicWork(final String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, final PeriodicWorkRequest periodicWorkRequest) {
        if (existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.UPDATE) {
            return RemoteClientUtils.map(execute(new RemoteDispatcher() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient$$ExternalSyntheticLambda0
                @Override // androidx.work.multiprocess.RemoteDispatcher
                public final void execute(Object obj, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                    IWorkManagerImpl iWorkManagerImpl = (IWorkManagerImpl) obj;
                    iWorkManagerImpl.updateUniquePeriodicWorkRequest(str, ParcelConverters.marshall(new ParcelableWorkRequest(periodicWorkRequest)), iWorkManagerImplCallback);
                }
            }), RemoteClientUtils.sVoidMapper, this.mExecutor);
        }
        return enqueue(this.mWorkManager.createWorkContinuationForUniquePeriodicWork(str, existingPeriodicWorkPolicy, periodicWorkRequest));
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public RemoteWorkContinuation beginWith(List<OneTimeWorkRequest> list) {
        return new RemoteWorkContinuationImpl(this, this.mWorkManager.beginWith(list));
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public RemoteWorkContinuation beginUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list) {
        return new RemoteWorkContinuationImpl(this, this.mWorkManager.beginUniqueWork(str, existingWorkPolicy, list));
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public ListenableFuture<Void> enqueue(final WorkContinuation workContinuation) {
        return RemoteClientUtils.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.2
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IWorkManagerImpl iWorkManagerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) throws Throwable {
                iWorkManagerImpl.enqueueContinuation(ParcelConverters.marshall(new ParcelableWorkContinuationImpl((WorkContinuationImpl) workContinuation)), iWorkManagerImplCallback);
            }
        }), RemoteClientUtils.sVoidMapper, this.mExecutor);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public ListenableFuture<Void> cancelWorkById(final UUID uuid) {
        return RemoteClientUtils.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.3
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IWorkManagerImpl iWorkManagerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) throws Throwable {
                iWorkManagerImpl.cancelWorkById(uuid.toString(), iWorkManagerImplCallback);
            }
        }), RemoteClientUtils.sVoidMapper, this.mExecutor);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public ListenableFuture<Void> cancelAllWorkByTag(final String str) {
        return RemoteClientUtils.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.4
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IWorkManagerImpl iWorkManagerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) throws Throwable {
                iWorkManagerImpl.cancelAllWorkByTag(str, iWorkManagerImplCallback);
            }
        }), RemoteClientUtils.sVoidMapper, this.mExecutor);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public ListenableFuture<Void> cancelUniqueWork(final String str) {
        return RemoteClientUtils.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.5
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IWorkManagerImpl iWorkManagerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) throws Throwable {
                iWorkManagerImpl.cancelUniqueWork(str, iWorkManagerImplCallback);
            }
        }), RemoteClientUtils.sVoidMapper, this.mExecutor);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public ListenableFuture<Void> cancelAllWork() {
        return RemoteClientUtils.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.6
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IWorkManagerImpl iWorkManagerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) throws Throwable {
                iWorkManagerImpl.cancelAllWork(iWorkManagerImplCallback);
            }
        }), RemoteClientUtils.sVoidMapper, this.mExecutor);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public ListenableFuture<List<WorkInfo>> getWorkInfos(final WorkQuery workQuery) {
        return RemoteClientUtils.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.7
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IWorkManagerImpl iWorkManagerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) throws Throwable {
                iWorkManagerImpl.queryWorkInfo(ParcelConverters.marshall(new ParcelableWorkQuery(workQuery)), iWorkManagerImplCallback);
            }
        }), new Function<byte[], List<WorkInfo>>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.8
            @Override // androidx.arch.core.util.Function
            public List<WorkInfo> apply(byte[] bArr) {
                return ((ParcelableWorkInfos) ParcelConverters.unmarshall(bArr, ParcelableWorkInfos.CREATOR)).getWorkInfos();
            }
        }, this.mExecutor);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public ListenableFuture<Void> setProgress(final UUID uuid, final Data data) {
        return RemoteClientUtils.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.9
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IWorkManagerImpl iWorkManagerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) throws Throwable {
                iWorkManagerImpl.setProgress(ParcelConverters.marshall(new ParcelableUpdateRequest(uuid, data)), iWorkManagerImplCallback);
            }
        }), RemoteClientUtils.sVoidMapper, this.mExecutor);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public ListenableFuture<Void> setForegroundAsync(final String str, final ForegroundInfo foregroundInfo) {
        return RemoteClientUtils.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.10
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IWorkManagerImpl iWorkManagerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) throws Throwable {
                iWorkManagerImpl.setForegroundAsync(ParcelConverters.marshall(new ParcelableForegroundRequestInfo(str, foregroundInfo)), iWorkManagerImplCallback);
            }
        }), RemoteClientUtils.sVoidMapper, this.mExecutor);
    }

    public ListenableFuture<byte[]> execute(RemoteDispatcher<IWorkManagerImpl> remoteDispatcher) {
        return execute(getSession(), remoteDispatcher, new SessionRemoteCallback(this));
    }

    public ListenableFuture<IWorkManagerImpl> getSession() {
        return getSession(newIntent(this.mContext));
    }

    public Context getContext() {
        return this.mContext;
    }

    public long getSessionTimeout() {
        return this.mSessionTimeout;
    }

    public Session getCurrentSession() {
        return this.mSession;
    }

    public Handler getSessionHandler() {
        return this.mHandler;
    }

    public SessionTracker getSessionTracker() {
        return this.mSessionTracker;
    }

    public Object getSessionLock() {
        return this.mLock;
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public long getSessionIndex() {
        return this.mSessionIndex;
    }

    ListenableFuture<byte[]> execute(final ListenableFuture<IWorkManagerImpl> listenableFuture, final RemoteDispatcher<IWorkManagerImpl> remoteDispatcher, final RemoteCallback remoteCallback) {
        listenableFuture.addListener(new Runnable() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    final IWorkManagerImpl iWorkManagerImpl = (IWorkManagerImpl) listenableFuture.get();
                    remoteCallback.setBinder(iWorkManagerImpl.asBinder());
                    RemoteWorkManagerClient.this.mExecutor.execute(new Runnable() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.11.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                remoteDispatcher.execute(iWorkManagerImpl, remoteCallback);
                            } catch (Throwable th) {
                                Logger.get().error(RemoteWorkManagerClient.TAG, "Unable to execute", th);
                                ListenableCallback.ListenableCallbackRunnable.reportFailure(remoteCallback, th);
                            }
                        }
                    });
                } catch (InterruptedException | ExecutionException unused) {
                    Logger.get().error(RemoteWorkManagerClient.TAG, "Unable to bind to service");
                    ListenableCallback.ListenableCallbackRunnable.reportFailure(remoteCallback, new RuntimeException("Unable to bind to service"));
                    RemoteWorkManagerClient.this.cleanUp();
                }
            }
        }, this.mExecutor);
        return remoteCallback.getFuture();
    }

    ListenableFuture<IWorkManagerImpl> getSession(Intent intent) {
        SettableFuture<IWorkManagerImpl> settableFuture;
        synchronized (this.mLock) {
            this.mSessionIndex++;
            if (this.mSession == null) {
                Logger.get().debug(TAG, "Creating a new session");
                Session session = new Session(this);
                this.mSession = session;
                try {
                    if (!this.mContext.bindService(intent, session, 1)) {
                        unableToBind(this.mSession, new RuntimeException("Unable to bind to service"));
                    }
                } catch (Throwable th) {
                    unableToBind(this.mSession, th);
                }
                this.mHandler.removeCallbacks(this.mSessionTracker);
                settableFuture = this.mSession.mFuture;
            } else {
                this.mHandler.removeCallbacks(this.mSessionTracker);
                settableFuture = this.mSession.mFuture;
            }
            throw th;
        }
        return settableFuture;
    }

    public void cleanUp() {
        synchronized (this.mLock) {
            Logger.get().debug(TAG, "Cleaning up.");
            this.mSession = null;
        }
    }

    private void unableToBind(Session session, Throwable th) {
        Logger.get().error(TAG, "Unable to bind to service", th);
        session.mFuture.setException(th);
    }

    private static Intent newIntent(Context context) {
        return new Intent(context, (Class<?>) RemoteWorkManagerService.class);
    }

    public static class Session implements ServiceConnection {
        private static final String TAG = Logger.tagWithPrefix("RemoteWMgr.Connection");
        final RemoteWorkManagerClient mClient;
        final SettableFuture<IWorkManagerImpl> mFuture = SettableFuture.create();

        public Session(RemoteWorkManagerClient remoteWorkManagerClient) {
            this.mClient = remoteWorkManagerClient;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Logger.get().debug(TAG, "Service connected");
            this.mFuture.set(IWorkManagerImpl.Stub.asInterface(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Logger.get().debug(TAG, "Service disconnected");
            this.mFuture.setException(new RuntimeException("Service disconnected"));
            this.mClient.cleanUp();
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            onBindingDied();
        }

        public void onBindingDied() {
            Logger.get().debug(TAG, "Binding died");
            this.mFuture.setException(new RuntimeException("Binding died"));
            this.mClient.cleanUp();
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            Logger.get().error(TAG, "Unable to bind to service");
            this.mFuture.setException(new RuntimeException("Cannot bind to service " + componentName));
        }
    }

    public static class SessionRemoteCallback extends RemoteCallback {
        private final RemoteWorkManagerClient mClient;

        public SessionRemoteCallback(RemoteWorkManagerClient remoteWorkManagerClient) {
            this.mClient = remoteWorkManagerClient;
        }

        @Override // androidx.work.multiprocess.RemoteCallback
        protected void onRequestCompleted() {
            super.onRequestCompleted();
            this.mClient.getSessionHandler().postDelayed(this.mClient.getSessionTracker(), this.mClient.getSessionTimeout());
        }
    }

    public static class SessionTracker implements Runnable {
        private static final String TAG = Logger.tagWithPrefix("SessionHandler");
        private final RemoteWorkManagerClient mClient;

        public SessionTracker(RemoteWorkManagerClient remoteWorkManagerClient) {
            this.mClient = remoteWorkManagerClient;
        }

        @Override // java.lang.Runnable
        public void run() {
            long sessionIndex = this.mClient.getSessionIndex();
            synchronized (this.mClient.getSessionLock()) {
                long sessionIndex2 = this.mClient.getSessionIndex();
                Session currentSession = this.mClient.getCurrentSession();
                if (currentSession != null) {
                    if (sessionIndex == sessionIndex2) {
                        Logger.get().debug(TAG, "Unbinding service");
                        this.mClient.getContext().unbindService(currentSession);
                        currentSession.onBindingDied();
                    } else {
                        Logger.get().debug(TAG, "Ignoring request to unbind.");
                    }
                }
            }
        }
    }
}
