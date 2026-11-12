package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Single;
import rx.SingleSubscriber;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleDelay<T> implements Single.OnSubscribe<T> {
    public final Single.OnSubscribe<T> a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;

    public static final class a<T> extends SingleSubscriber<T> implements Action0 {
        public final SingleSubscriber<? super T> b;
        public final Scheduler.Worker c;
        public final long d;
        public final TimeUnit e;
        public T f;
        public Throwable g;

        public a(SingleSubscriber<? super T> singleSubscriber, Scheduler.Worker worker, long j, TimeUnit timeUnit) {
            this.b = singleSubscriber;
            this.c = worker;
            this.d = j;
            this.e = timeUnit;
        }

        @Override // rx.functions.Action0
        public void call() {
            try {
                Throwable th = this.g;
                if (th != null) {
                    this.g = null;
                    this.b.onError(th);
                } else {
                    T t = this.f;
                    this.f = null;
                    this.b.onSuccess(t);
                }
            } finally {
                this.c.unsubscribe();
            }
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            this.g = th;
            this.c.schedule(this, this.d, this.e);
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            this.f = t;
            this.c.schedule(this, this.d, this.e);
        }
    }

    public SingleDelay(Single.OnSubscribe<T> onSubscribe, long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = onSubscribe;
        this.d = scheduler;
        this.b = j;
        this.c = timeUnit;
    }

    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        Scheduler.Worker workerCreateWorker = this.d.createWorker();
        a aVar = new a(singleSubscriber, workerCreateWorker, this.b, this.c);
        singleSubscriber.add(workerCreateWorker);
        singleSubscriber.add(aVar);
        this.a.call(aVar);
    }
}
