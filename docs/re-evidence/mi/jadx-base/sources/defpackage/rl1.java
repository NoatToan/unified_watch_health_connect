package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.RestrictTo;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.ModernAsyncTask;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class rl1<D> extends rie<D> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile rl1<D>.a mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile rl1<D>.a mTask;
    long mUpdateThrottle;

    public final class a extends ModernAsyncTask<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final CountDownLatch f32655k = new CountDownLatch(1);
        public boolean l;

        public a() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public void h(D d) {
            try {
                rl1.this.dispatchOnCancelled(this, d);
            } finally {
                this.f32655k.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public void i(D d) {
            try {
                rl1.this.dispatchOnLoadComplete(this, d);
            } finally {
                this.f32655k.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public D b(Void... voidArr) {
            try {
                return (D) rl1.this.onLoadInBackground();
            } catch (OperationCanceledException e) {
                if (f()) {
                    return null;
                }
                throw e;
            }
        }

        public void o() {
            try {
                this.f32655k.await();
            } catch (InterruptedException unused) {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.l = false;
            rl1.this.executePendingTask();
        }
    }

    public rl1(Context context) {
        this(context, ModernAsyncTask.h);
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(rl1<D>.a aVar, D d) {
        onCanceled(d);
        if (this.mCancellingTask == aVar) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(rl1<D>.a aVar, D d) {
        if (this.mTask != aVar) {
            dispatchOnCancelled(aVar, d);
            return;
        }
        if (isAbandoned()) {
            onCanceled(d);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(d);
    }

    @Override // defpackage.rie
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.l);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.l);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            gfp.c(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            gfp.b(this.mLastLoadCompleteTime, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.l) {
            this.mTask.l = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle <= 0 || SystemClock.uptimeMillis() >= this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.c(this.mExecutor, null);
        } else {
            this.mTask.l = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract D loadInBackground();

    @Override // defpackage.rie
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.l) {
                this.mTask.l = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.l) {
            this.mTask.l = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        boolean zA = this.mTask.a(false);
        if (zA) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zA;
    }

    public void onCanceled(D d) {
    }

    @Override // defpackage.rie
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new a();
        executePendingTask();
    }

    public D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new Handler();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void waitForLoader() {
        rl1<D>.a aVar = this.mTask;
        if (aVar != null) {
            aVar.o();
        }
    }

    private rl1(Context context, Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = executor;
    }
}
