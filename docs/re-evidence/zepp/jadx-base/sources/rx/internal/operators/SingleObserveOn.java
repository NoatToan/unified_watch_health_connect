package rx.internal.operators;

import rx.Scheduler;
import rx.Single;
import rx.SingleSubscriber;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleObserveOn<T> implements Single.OnSubscribe<T> {
    public final Single.OnSubscribe<T> a;
    public final Scheduler b;

    public static final class a<T> extends SingleSubscriber<T> implements Action0 {
        public final SingleSubscriber<? super T> b;
        public final Scheduler.Worker c;
        public T d;
        public Throwable e;

        public a(SingleSubscriber<? super T> singleSubscriber, Scheduler.Worker worker) {
            this.b = singleSubscriber;
            this.c = worker;
        }

        @Override // rx.functions.Action0
        public void call() {
            try {
                Throwable th = this.e;
                if (th != null) {
                    this.e = null;
                    this.b.onError(th);
                } else {
                    T t = this.d;
                    this.d = null;
                    this.b.onSuccess(t);
                }
            } finally {
                this.c.unsubscribe();
            }
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            this.e = th;
            this.c.schedule(this);
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            this.d = t;
            this.c.schedule(this);
        }
    }

    public SingleObserveOn(Single.OnSubscribe<T> onSubscribe, Scheduler scheduler) {
        this.a = onSubscribe;
        this.b = scheduler;
    }

    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        Scheduler.Worker workerCreateWorker = this.b.createWorker();
        a aVar = new a(singleSubscriber, workerCreateWorker);
        singleSubscriber.add(workerCreateWorker);
        singleSubscriber.add(aVar);
        this.a.call(aVar);
    }
}
