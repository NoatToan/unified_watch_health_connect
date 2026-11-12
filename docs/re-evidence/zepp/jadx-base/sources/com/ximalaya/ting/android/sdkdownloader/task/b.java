package com.ximalaya.ting.android.sdkdownloader.task;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes22.dex */
class b<ResultType> extends AbsTask<ResultType> {
    public static final PriorityExecutor m = new PriorityExecutor(true);
    public static final Handler n = new Handler(Looper.getMainLooper());
    private final AbsTask<ResultType> g;
    private final Executor h;
    private volatile boolean i;
    private volatile boolean j;
    private volatile boolean k;
    private com.ximalaya.ting.android.sdkdownloader.task.a l;

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        try {
                            if (b.this.i || b.this.isCancelled()) {
                                throw new Callback.CancelledException("");
                            }
                            if (b.this.j || b.this.isRemoved()) {
                                throw new Callback.RemovedException("");
                            }
                            b.this.onStarted();
                            if (b.this.isCancelled()) {
                                throw new Callback.CancelledException("");
                            }
                            if (b.this.isRemoved()) {
                                throw new Callback.RemovedException("");
                            }
                            b.this.g.a(b.this.g.doBackground());
                            b bVar = b.this;
                            bVar.a(bVar.g.getResult());
                            if (b.this.isCancelled()) {
                                throw new Callback.CancelledException("");
                            }
                            if (b.this.isRemoved()) {
                                throw new Callback.RemovedException("");
                            }
                            b bVar2 = b.this;
                            bVar2.onSuccess(bVar2.g.getResult());
                            b.this.onFinished();
                        } catch (Callback.CancelledException e) {
                            b.this.onCancelled(e);
                        }
                    } catch (Throwable th) {
                        b.this.onError(th, false);
                    }
                } catch (Callback.RemovedException e2) {
                    b.this.onRemoved(e2);
                }
            } catch (Throwable th2) {
                b.this.onFinished();
                throw th2;
            }
        }
    }

    public b(AbsTask<ResultType> absTask) {
        super(absTask);
        this.i = false;
        this.j = false;
        this.k = false;
        this.g = absTask;
        absTask.c(this);
        c(null);
        Executor executor = absTask.getExecutor();
        this.h = executor == null ? m : executor;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public final void b(AbsTask.State state) {
        super.b(state);
        this.g.b(state);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public final ResultType doBackground() throws Throwable {
        onWaiting();
        g();
        return null;
    }

    public void g() {
        com.ximalaya.ting.android.sdkdownloader.task.a aVar = new com.ximalaya.ting.android.sdkdownloader.task.a(this.g.getPriority(), new a());
        this.l = aVar;
        this.h.execute(aVar);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public final Executor getExecutor() {
        return this.h;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public final Priority getPriority() {
        return this.g.getPriority();
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public void onCancelled(Callback.CancelledException cancelledException) {
        b(AbsTask.State.CANCELLED);
        if (this.i) {
            return;
        }
        this.i = true;
        this.g.onCancelled(cancelledException);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public void onError(Throwable th, boolean z) {
        b(AbsTask.State.ERROR);
        this.g.onError(th, false);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public void onFinished() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.g.onFinished();
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public void onRemoved(Callback.RemovedException removedException) {
        b(AbsTask.State.REMOVED);
        if (this.j) {
            return;
        }
        this.j = true;
        this.g.onRemoved(removedException);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public void onStarted() {
        b(AbsTask.State.STARTED);
        this.g.onStarted();
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public void onSuccess(ResultType resulttype) {
        b(AbsTask.State.SUCCESS);
        this.g.onSuccess(getResult());
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public void onUpdate(int i, Object... objArr) {
        this.g.onUpdate(i, objArr);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public void onWaiting() {
        b(AbsTask.State.WAITING);
        this.g.onWaiting();
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.Callback.Cancelable
    public void removeTaskFromQueue() {
        com.ximalaya.ting.android.sdkdownloader.task.a aVar;
        try {
            Executor executor = this.h;
            if (executor == null || (aVar = this.l) == null || !(executor instanceof PriorityExecutor)) {
                return;
            }
            ((PriorityExecutor) executor).remove(aVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
