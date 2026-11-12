package com.ximalaya.ting.android.sdkdownloader.task;

import com.ximalaya.ting.android.opensdk.util.Logger;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes22.dex */
public abstract class AbsTask<ResultType> implements Callback.Cancelable {
    private b a;
    private final Callback.Cancelable b;
    private volatile boolean c;
    private volatile boolean d;
    private volatile State e;
    private ResultType f;

    public enum State {
        IDLE(0),
        WAITING(1),
        STARTED(2),
        SUCCESS(3),
        CANCELLED(4),
        ERROR(5),
        REMOVED(6);

        private final int value;

        State(int i) {
            this.value = i;
        }

        public int value() {
            return this.value;
        }
    }

    public AbsTask() {
        this(null);
    }

    public final void a(ResultType resulttype) {
        this.f = resulttype;
    }

    public void b(State state) {
        this.e = state;
    }

    public final void c(b bVar) {
        this.a = bVar;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.Callback.Cancelable
    public final synchronized void cancel() {
        if (!this.c) {
            this.c = true;
            cancelWorks(false);
            Callback.Cancelable cancelable = this.b;
            if (cancelable != null && !cancelable.isCancelled()) {
                Logger.log("AbsTask :  123");
                this.b.cancel();
            }
            if (this.e == State.WAITING || (this.e == State.STARTED && isCancelFast())) {
                b bVar = this.a;
                if (bVar != null) {
                    bVar.onCancelled(new Callback.CancelledException("cancelled by user"));
                    this.a.onFinished();
                } else if (this instanceof b) {
                    onCancelled(new Callback.CancelledException("cancelled by user"));
                    onFinished();
                }
            }
        }
    }

    public void cancelWorks(boolean z) {
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.Callback.Cancelable
    public final synchronized void cancleAndRemove() {
        if (!this.d) {
            this.d = true;
            cancelWorks(true);
            Callback.Cancelable cancelable = this.b;
            if (cancelable != null) {
                cancelable.cancleAndRemove();
            }
            b bVar = this.a;
            if (bVar != null) {
                bVar.onRemoved(new Callback.RemovedException("removed by user"));
                this.a.onFinished();
            } else if (this instanceof b) {
                onRemoved(new Callback.RemovedException("removed by user"));
                onFinished();
            }
        }
    }

    public abstract ResultType doBackground() throws Throwable;

    public Executor getExecutor() {
        return null;
    }

    public Priority getPriority() {
        return Priority.DEFAULT;
    }

    public final ResultType getResult() {
        return this.f;
    }

    public final State getState() {
        return this.e;
    }

    public boolean isCancelFast() {
        return false;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.Callback.Cancelable
    public final boolean isCancelled() {
        Callback.Cancelable cancelable;
        return this.c || this.e == State.CANCELLED || ((cancelable = this.b) != null && cancelable.isCancelled());
    }

    public final boolean isFinished() {
        return this.e.value() > State.STARTED.value();
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.Callback.Cancelable
    public final boolean isRemoved() {
        Callback.Cancelable cancelable;
        return this.d || this.e == State.REMOVED || ((cancelable = this.b) != null && cancelable.isRemoved());
    }

    public void onCancelled(Callback.CancelledException cancelledException) {
    }

    public abstract void onError(Throwable th, boolean z);

    public void onFinished() {
    }

    public abstract void onRemoved(Callback.RemovedException removedException);

    public void onStarted() {
    }

    public abstract void onSuccess(ResultType resulttype);

    public void onUpdate(int i, Object... objArr) {
    }

    public void onWaiting() {
    }

    public final void update(int i, Object... objArr) {
        b bVar = this.a;
        if (bVar != null) {
            bVar.onUpdate(i, objArr);
        }
    }

    public AbsTask(Callback.Cancelable cancelable) {
        this.a = null;
        this.c = false;
        this.d = false;
        this.e = State.IDLE;
        this.b = cancelable;
    }
}
