package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import k7.j;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<D> extends b<D> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile a<D>.RunnableC0114a mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile a<D>.RunnableC0114a mTask;
    long mUpdateThrottle;

    /* JADX INFO: renamed from: androidx.loader.content.a$a, reason: collision with other inner class name */
    public final class RunnableC0114a extends c<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final CountDownLatch f8086i = new CountDownLatch(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f8087j;

        public RunnableC0114a() {
        }

        @Override // androidx.loader.content.c
        public final Object a() {
            try {
                return a.this.onLoadInBackground();
            } catch (OperationCanceledException e4) {
                if (this.f8095d.get()) {
                    return null;
                }
                throw e4;
            }
        }

        @Override // androidx.loader.content.c
        public final void b(D d14) {
            CountDownLatch countDownLatch = this.f8086i;
            try {
                a.this.dispatchOnCancelled(this, d14);
            } finally {
                countDownLatch.countDown();
            }
        }

        @Override // androidx.loader.content.c
        public final void c(D d14) {
            CountDownLatch countDownLatch = this.f8086i;
            try {
                a.this.dispatchOnLoadComplete(this, d14);
            } finally {
                countDownLatch.countDown();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f8087j = false;
            a.this.executePendingTask();
        }
    }

    private a(Context context, Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = executor;
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(a<D>.RunnableC0114a runnableC0114a, D d14) {
        onCanceled(d14);
        if (this.mCancellingTask == runnableC0114a) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(a<D>.RunnableC0114a runnableC0114a, D d14) {
        if (this.mTask != runnableC0114a) {
            dispatchOnCancelled(runnableC0114a, d14);
            return;
        }
        if (isAbandoned()) {
            onCanceled(d14);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(d14);
    }

    @Override // androidx.loader.content.b
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f8087j);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f8087j);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            j.a(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            long j8 = this.mLastLoadCompleteTime;
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (j8 == 0) {
                printWriter.print("--");
            } else {
                j.a(j8 - jUptimeMillis, printWriter);
            }
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.f8087j) {
            this.mTask.f8087j = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.f8087j = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
            return;
        }
        a<D>.RunnableC0114a runnableC0114a = this.mTask;
        Executor executor = this.mExecutor;
        if (runnableC0114a.f8094c == c.g.PENDING) {
            runnableC0114a.f8094c = c.g.RUNNING;
            runnableC0114a.f8092a.getClass();
            executor.execute(runnableC0114a.f8093b);
            return;
        }
        int i14 = c.d.f8100a[runnableC0114a.f8094c.ordinal()];
        if (i14 == 1) {
            h.z("Cannot execute task: the task is already running.");
        } else if (i14 != 2) {
            h.z("We should never reach this state");
        } else {
            h.z("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract D loadInBackground();

    @Override // androidx.loader.content.b
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        a<D>.RunnableC0114a runnableC0114a = this.mCancellingTask;
        a<D>.RunnableC0114a runnableC0114a2 = this.mTask;
        if (runnableC0114a != null) {
            if (runnableC0114a2.f8087j) {
                this.mTask.f8087j = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        boolean z14 = runnableC0114a2.f8087j;
        a<D>.RunnableC0114a runnableC0114a3 = this.mTask;
        if (z14) {
            runnableC0114a3.f8087j = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        runnableC0114a3.f8095d.set(true);
        boolean zCancel = runnableC0114a3.f8093b.cancel(false);
        if (zCancel) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zCancel;
    }

    public void onCanceled(D d14) {
    }

    @Override // androidx.loader.content.b
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new RunnableC0114a();
        executePendingTask();
    }

    public D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j8) {
        this.mUpdateThrottle = j8;
        if (j8 != 0) {
            this.mHandler = new Handler();
        }
    }

    public void waitForLoader() {
        a<D>.RunnableC0114a runnableC0114a = this.mTask;
        if (runnableC0114a != null) {
            try {
                runnableC0114a.f8086i.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public a(Context context) {
        this(context, c.f8089f);
    }
}
