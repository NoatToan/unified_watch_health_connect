package androidx.work.multiprocess;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.ProgressUpdater;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.multiprocess.parcelable.ParcelConverters;
import androidx.work.multiprocess.parcelable.ParcelableInterruptRequest;
import androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableResult;
import com.google.common.util.concurrent.ListenableFuture;
import com.huawei.operation.utils.Constants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public class ListenableWorkerImpl extends IListenableWorkerImpl.Stub {
    static final String TAG = Logger.tagWithPrefix("WM-RemoteWorker ListenableWorkerImpl");
    static byte[] sEMPTY = new byte[0];
    static final Object sLock = new Object();
    final Configuration mConfiguration;
    final Context mContext;
    final ForegroundUpdater mForegroundUpdater;
    final ProgressUpdater mProgressUpdater;
    final Map<String, RemoteWorkerWrapper> mRemoteWorkerWrapperMap;
    final TaskExecutor mTaskExecutor;

    ListenableWorkerImpl(Context context) {
        this.mContext = context.getApplicationContext();
        RemoteWorkManagerInfo remoteWorkManagerInfo = RemoteWorkManagerInfo.getInstance(context);
        this.mConfiguration = remoteWorkManagerInfo.getConfiguration();
        this.mTaskExecutor = remoteWorkManagerInfo.getTaskExecutor();
        this.mProgressUpdater = remoteWorkManagerInfo.getProgressUpdater();
        this.mForegroundUpdater = remoteWorkManagerInfo.getForegroundUpdater();
        this.mRemoteWorkerWrapperMap = new HashMap();
    }

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public void startWork(byte[] bArr, final IWorkManagerImplCallback iWorkManagerImplCallback) {
        try {
            ParcelableRemoteWorkRequest parcelableRemoteWorkRequest = (ParcelableRemoteWorkRequest) ParcelConverters.unmarshall(bArr, ParcelableRemoteWorkRequest.CREATOR);
            WorkerParameters workerParameters = parcelableRemoteWorkRequest.getParcelableWorkerParameters().toWorkerParameters(this.mConfiguration, this.mTaskExecutor, this.mProgressUpdater, this.mForegroundUpdater);
            final String string = workerParameters.getId().toString();
            String workerClassName = parcelableRemoteWorkRequest.getWorkerClassName();
            Logger.get().debug(TAG, "Executing work request (" + string + ", " + workerClassName + Constants.RIGHT_BRACKET_ONLY);
            final ListenableFuture<ListenableWorker.Result> listenableFutureExecuteWorkRequest = executeWorkRequest(string, workerClassName, workerParameters);
            listenableFutureExecuteWorkRequest.addListener(new Runnable() { // from class: androidx.work.multiprocess.ListenableWorkerImpl.1
                /* JADX WARN: Code duplicated, block: B:43:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        try {
                            ListenableCallback.ListenableCallbackRunnable.reportSuccess(iWorkManagerImplCallback, ParcelConverters.marshall(new ParcelableResult((ListenableWorker.Result) listenableFutureExecuteWorkRequest.get())));
                            synchronized (ListenableWorkerImpl.sLock) {
                                ListenableWorkerImpl.this.mRemoteWorkerWrapperMap.remove(string);
                            }
                        } catch (InterruptedException e) {
                            e = e;
                            ListenableCallback.ListenableCallbackRunnable.reportFailure(iWorkManagerImplCallback, e);
                            synchronized (ListenableWorkerImpl.sLock) {
                                ListenableWorkerImpl.this.mRemoteWorkerWrapperMap.remove(string);
                            }
                        } catch (CancellationException e2) {
                            Logger.get().debug(ListenableWorkerImpl.TAG, "Worker (" + string + ") was cancelled");
                            ListenableCallback.ListenableCallbackRunnable.reportFailure(iWorkManagerImplCallback, e2);
                            synchronized (ListenableWorkerImpl.sLock) {
                                ListenableWorkerImpl.this.mRemoteWorkerWrapperMap.remove(string);
                            }
                        } catch (ExecutionException e3) {
                            e = e3;
                            ListenableCallback.ListenableCallbackRunnable.reportFailure(iWorkManagerImplCallback, e);
                            synchronized (ListenableWorkerImpl.sLock) {
                                ListenableWorkerImpl.this.mRemoteWorkerWrapperMap.remove(string);
                            }
                        }
                    } catch (Throwable th) {
                        synchronized (ListenableWorkerImpl.sLock) {
                            ListenableWorkerImpl.this.mRemoteWorkerWrapperMap.remove(string);
                            throw th;
                        }
                    }
                }
            }, this.mTaskExecutor.getSerialTaskExecutor());
        } catch (Throwable th) {
            ListenableCallback.ListenableCallbackRunnable.reportFailure(iWorkManagerImplCallback, th);
        }
    }

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public void interrupt(byte[] bArr, final IWorkManagerImplCallback iWorkManagerImplCallback) {
        final RemoteWorkerWrapper remoteWorkerWrapperRemove;
        try {
            ParcelableInterruptRequest parcelableInterruptRequest = (ParcelableInterruptRequest) ParcelConverters.unmarshall(bArr, ParcelableInterruptRequest.CREATOR);
            String id = parcelableInterruptRequest.getId();
            final int stopReason = parcelableInterruptRequest.getStopReason();
            Logger.get().debug(TAG, "Interrupting work with id (" + id + Constants.RIGHT_BRACKET_ONLY);
            synchronized (sLock) {
                remoteWorkerWrapperRemove = this.mRemoteWorkerWrapperMap.remove(id);
            }
            if (remoteWorkerWrapperRemove != null) {
                this.mTaskExecutor.getSerialTaskExecutor().execute(new Runnable() { // from class: androidx.work.multiprocess.ListenableWorkerImpl$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ListenableWorkerImpl.lambda$interrupt$0(remoteWorkerWrapperRemove, stopReason, iWorkManagerImplCallback);
                    }
                });
            } else {
                ListenableCallback.ListenableCallbackRunnable.reportSuccess(iWorkManagerImplCallback, sEMPTY);
            }
        } catch (Throwable th) {
            ListenableCallback.ListenableCallbackRunnable.reportFailure(iWorkManagerImplCallback, th);
        }
    }

    static /* synthetic */ void lambda$interrupt$0(RemoteWorkerWrapper remoteWorkerWrapper, int i, IWorkManagerImplCallback iWorkManagerImplCallback) {
        remoteWorkerWrapper.interrupt(i);
        ListenableCallback.ListenableCallbackRunnable.reportSuccess(iWorkManagerImplCallback, sEMPTY);
    }

    private ListenableFuture<ListenableWorker.Result> executeWorkRequest(String str, String str2, WorkerParameters workerParameters) {
        RemoteWorkerWrapper remoteWorkerWrapperCreate = RemoteWorkerWrapperKt.create(this.mContext, this.mConfiguration, str2, workerParameters, this.mTaskExecutor);
        synchronized (sLock) {
            this.mRemoteWorkerWrapperMap.put(str, remoteWorkerWrapperCreate);
        }
        return remoteWorkerWrapperCreate.getFuture();
    }
}
