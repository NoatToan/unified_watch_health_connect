package androidx.work.multiprocess;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.zcp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"RemoteWorkerWrapper", "Landroidx/work/multiprocess/RemoteWorkerWrapper;", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "configuration", "Landroidx/work/Configuration;", "workerClassName", "", "workerParameters", "Landroidx/work/WorkerParameters;", "taskExecutor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "create", "work-multiprocess_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RemoteWorkerWrapperKt {
    public static final RemoteWorkerWrapper create(final Context context, final Configuration configuration, final String str, final WorkerParameters workerParameters, final TaskExecutor taskExecutor) {
        zcp.c(context, "");
        zcp.c(configuration, "");
        zcp.c(str, "");
        zcp.c(workerParameters, "");
        zcp.c(taskExecutor, "");
        final SettableFuture settableFutureCreate = SettableFuture.create();
        zcp.b((Object) settableFutureCreate, "");
        final RemoteWorkerWrapper remoteWorkerWrapper = new RemoteWorkerWrapper(settableFutureCreate);
        taskExecutor.getMainThreadExecutor().execute(new Runnable() { // from class: androidx.work.multiprocess.RemoteWorkerWrapperKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RemoteWorkerWrapperKt.RemoteWorkerWrapper$lambda$1(settableFutureCreate, configuration, context, str, workerParameters, taskExecutor, remoteWorkerWrapper);
            }
        });
        return remoteWorkerWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteWorkerWrapper$lambda$1(final SettableFuture settableFuture, Configuration configuration, Context context, String str, WorkerParameters workerParameters, TaskExecutor taskExecutor, final RemoteWorkerWrapper remoteWorkerWrapper) {
        zcp.c(configuration, "");
        zcp.c(context, "");
        zcp.c(str, "");
        zcp.c(workerParameters, "");
        zcp.c(taskExecutor, "");
        zcp.c(remoteWorkerWrapper, "");
        try {
            if (settableFuture.isCancelled()) {
                return;
            }
            final ListenableWorker listenableWorkerCreateWorkerWithDefaultFallback = configuration.getWorkerFactory().createWorkerWithDefaultFallback(context, str, workerParameters);
            if (listenableWorkerCreateWorkerWithDefaultFallback == null) {
                String str2 = "Unable to create an instance of " + str;
                Logger.get().error(ListenableWorkerImpl.TAG, str2);
                settableFuture.setException(new IllegalStateException(str2));
                return;
            }
            if (!(listenableWorkerCreateWorkerWithDefaultFallback instanceof RemoteListenableWorker)) {
                String str3 = str + " does not extend " + RemoteListenableWorker.class.getName();
                Logger.get().error(ListenableWorkerImpl.TAG, str3);
                settableFuture.setException(new IllegalStateException(str3));
                return;
            }
            settableFuture.addListener(new Runnable() { // from class: androidx.work.multiprocess.RemoteWorkerWrapperKt$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    RemoteWorkerWrapperKt.RemoteWorkerWrapper$lambda$1$lambda$0(settableFuture, listenableWorkerCreateWorkerWithDefaultFallback, remoteWorkerWrapper);
                }
            }, taskExecutor.getSerialTaskExecutor());
            settableFuture.setFuture(((RemoteListenableWorker) listenableWorkerCreateWorkerWithDefaultFallback).startRemoteWork());
        } catch (Throwable th) {
            settableFuture.setException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteWorkerWrapper$lambda$1$lambda$0(SettableFuture settableFuture, ListenableWorker listenableWorker, RemoteWorkerWrapper remoteWorkerWrapper) {
        zcp.c(remoteWorkerWrapper, "");
        try {
            settableFuture.get();
        } catch (CancellationException unused) {
            ((RemoteListenableWorker) listenableWorker).stop(remoteWorkerWrapper.getStopReason().get());
        } catch (Throwable unused2) {
        }
    }
}
