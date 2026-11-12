package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.SynchronousExecutor;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.yzc;
import defpackage.zcp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001dH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u00018G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR2\u0010\u000e\u001a&\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u0010 \u0011*\u0012\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u0010\u0018\u00010\u000f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/ListenableWorker;", "Landroidx/work/impl/constraints/OnConstraintsStateChangedListener;", "appContext", "Landroid/content/Context;", "workerParameters", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "areConstraintsUnmet", "", "<set-?>", "delegate", "getDelegate", "()Landroidx/work/ListenableWorker;", "future", "Landroidx/work/impl/utils/futures/SettableFuture;", "Landroidx/work/ListenableWorker$Result;", "kotlin.jvm.PlatformType", "lock", "", "onConstraintsStateChanged", "", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "state", "Landroidx/work/impl/constraints/ConstraintsState;", "onStopped", "setupAndRunConstraintTrackingWork", "startWork", "Lcom/google/common/util/concurrent/ListenableFuture;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConstraintTrackingWorker extends ListenableWorker implements OnConstraintsStateChangedListener {
    private volatile boolean areConstraintsUnmet;
    private ListenableWorker delegate;
    private final SettableFuture<ListenableWorker.Result> future;
    private final Object lock;
    private final WorkerParameters workerParameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        zcp.c(context, "");
        zcp.c(workerParameters, "");
        this.workerParameters = workerParameters;
        this.lock = new Object();
        this.future = SettableFuture.create();
    }

    public final ListenableWorker getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWork$lambda$0(ConstraintTrackingWorker constraintTrackingWorker) {
        zcp.c(constraintTrackingWorker, "");
        constraintTrackingWorker.setupAndRunConstraintTrackingWork();
    }

    @Override // androidx.work.ListenableWorker
    public ListenableFuture<ListenableWorker.Result> startWork() {
        getBackgroundExecutor().execute(new Runnable() { // from class: androidx.work.impl.workers.ConstraintTrackingWorker$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.startWork$lambda$0(this.f$0);
            }
        });
        SettableFuture<ListenableWorker.Result> settableFuture = this.future;
        zcp.b((Object) settableFuture, "");
        return settableFuture;
    }

    private final void setupAndRunConstraintTrackingWork() {
        if (this.future.isCancelled()) {
            return;
        }
        String string = getInputData().getString(ConstraintTrackingWorkerKt.ARGUMENT_CLASS_NAME);
        Logger logger = Logger.get();
        zcp.b((Object) logger, "");
        String str = string;
        if (str == null || str.length() == 0) {
            logger.error(ConstraintTrackingWorkerKt.TAG, "No worker to delegate to.");
            SettableFuture<ListenableWorker.Result> settableFuture = this.future;
            zcp.b((Object) settableFuture, "");
            ConstraintTrackingWorkerKt.setFailed(settableFuture);
            return;
        }
        ListenableWorker listenableWorkerCreateWorkerWithDefaultFallback = getWorkerFactory().createWorkerWithDefaultFallback(getApplicationContext(), string, this.workerParameters);
        this.delegate = listenableWorkerCreateWorkerWithDefaultFallback;
        if (listenableWorkerCreateWorkerWithDefaultFallback == null) {
            logger.debug(ConstraintTrackingWorkerKt.TAG, "No worker to delegate to.");
            SettableFuture<ListenableWorker.Result> settableFuture2 = this.future;
            zcp.b((Object) settableFuture2, "");
            ConstraintTrackingWorkerKt.setFailed(settableFuture2);
            return;
        }
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
        zcp.b((Object) workManagerImpl, "");
        WorkSpecDao workSpecDao = workManagerImpl.getWorkDatabase().workSpecDao();
        String string2 = getId().toString();
        zcp.b((Object) string2, "");
        WorkSpec workSpec = workSpecDao.getWorkSpec(string2);
        if (workSpec == null) {
            SettableFuture<ListenableWorker.Result> settableFuture3 = this.future;
            zcp.b((Object) settableFuture3, "");
            ConstraintTrackingWorkerKt.setFailed(settableFuture3);
            return;
        }
        Trackers trackers = workManagerImpl.getTrackers();
        zcp.b((Object) trackers, "");
        WorkConstraintsTracker workConstraintsTracker = new WorkConstraintsTracker(trackers);
        CoroutineDispatcher taskCoroutineDispatcher = workManagerImpl.getWorkTaskExecutor().getTaskCoroutineDispatcher();
        zcp.b((Object) taskCoroutineDispatcher, "");
        final Job jobListen = WorkConstraintsTrackerKt.listen(workConstraintsTracker, workSpec, taskCoroutineDispatcher, this);
        this.future.addListener(new Runnable() { // from class: androidx.work.impl.workers.ConstraintTrackingWorker$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.setupAndRunConstraintTrackingWork$lambda$1(jobListen);
            }
        }, new SynchronousExecutor());
        if (workConstraintsTracker.areAllConstraintsMet(workSpec)) {
            logger.debug(ConstraintTrackingWorkerKt.TAG, "Constraints met for delegate " + string);
            try {
                ListenableWorker listenableWorker = this.delegate;
                zcp.e(listenableWorker);
                final ListenableFuture<ListenableWorker.Result> listenableFutureStartWork = listenableWorker.startWork();
                zcp.b((Object) listenableFutureStartWork, "");
                listenableFutureStartWork.addListener(new Runnable() { // from class: androidx.work.impl.workers.ConstraintTrackingWorker$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConstraintTrackingWorker.setupAndRunConstraintTrackingWork$lambda$3(this.f$0, listenableFutureStartWork);
                    }
                }, getBackgroundExecutor());
                return;
            } catch (Throwable th) {
                logger.debug(ConstraintTrackingWorkerKt.TAG, "Delegated worker " + string + " threw exception in startWork.", th);
                synchronized (this.lock) {
                    if (this.areConstraintsUnmet) {
                        logger.debug(ConstraintTrackingWorkerKt.TAG, "Constraints were unmet, Retrying.");
                        SettableFuture<ListenableWorker.Result> settableFuture4 = this.future;
                        zcp.b((Object) settableFuture4, "");
                        ConstraintTrackingWorkerKt.setRetry(settableFuture4);
                        return;
                    }
                    SettableFuture<ListenableWorker.Result> settableFuture5 = this.future;
                    zcp.b((Object) settableFuture5, "");
                    ConstraintTrackingWorkerKt.setFailed(settableFuture5);
                    return;
                }
            }
        }
        logger.debug(ConstraintTrackingWorkerKt.TAG, "Constraints not met for delegate " + string + ". Requesting retry.");
        SettableFuture<ListenableWorker.Result> settableFuture6 = this.future;
        zcp.b((Object) settableFuture6, "");
        ConstraintTrackingWorkerKt.setRetry(settableFuture6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAndRunConstraintTrackingWork$lambda$1(Job job) {
        zcp.c(job, "");
        job.cancel((CancellationException) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAndRunConstraintTrackingWork$lambda$3(ConstraintTrackingWorker constraintTrackingWorker, ListenableFuture listenableFuture) {
        zcp.c(constraintTrackingWorker, "");
        zcp.c(listenableFuture, "");
        synchronized (constraintTrackingWorker.lock) {
            if (constraintTrackingWorker.areConstraintsUnmet) {
                SettableFuture<ListenableWorker.Result> settableFuture = constraintTrackingWorker.future;
                zcp.b((Object) settableFuture, "");
                ConstraintTrackingWorkerKt.setRetry(settableFuture);
            } else {
                constraintTrackingWorker.future.setFuture(listenableFuture);
            }
            yzc yzcVar = yzc.e;
        }
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.delegate;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        listenableWorker.stop(Build.VERSION.SDK_INT >= 31 ? getStopReason() : 0);
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(WorkSpec workSpec, ConstraintsState state) {
        zcp.c(workSpec, "");
        zcp.c(state, "");
        Logger.get().debug(ConstraintTrackingWorkerKt.TAG, "Constraints changed for " + workSpec);
        if (state instanceof ConstraintsState.ConstraintsNotMet) {
            synchronized (this.lock) {
                this.areConstraintsUnmet = true;
                yzc yzcVar = yzc.e;
            }
        }
    }
}
