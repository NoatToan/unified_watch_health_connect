package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorSubscribeOn<T> implements Observable.OnSubscribe<T> {
    public final Scheduler a;
    public final Observable<T> b;
    public final boolean c;

    public static final class a<T> extends Subscriber<T> implements Action0 {
        public final Subscriber<? super T> f;
        public final boolean g;
        public final Scheduler.Worker h;
        public Observable<T> i;
        public Thread j;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorSubscribeOn$a$a, reason: collision with other inner class name */
        public class C1248a implements Producer {
            public final /* synthetic */ Producer a;

            /* JADX INFO: renamed from: rx.internal.operators.OperatorSubscribeOn$a$a$a, reason: collision with other inner class name */
            public class C1249a implements Action0 {
                public final /* synthetic */ long a;

                public C1249a(long j) {
                    this.a = j;
                }

                @Override // rx.functions.Action0
                public void call() {
                    C1248a.this.a.request(this.a);
                }
            }

            public C1248a(Producer producer) {
                this.a = producer;
            }

            @Override // rx.Producer
            public void request(long j) {
                if (a.this.j != Thread.currentThread()) {
                    a aVar = a.this;
                    if (aVar.g) {
                        aVar.h.schedule(new C1249a(j));
                        return;
                    }
                }
                this.a.request(j);
            }
        }

        public a(Subscriber<? super T> subscriber, boolean z, Scheduler.Worker worker, Observable<T> observable) {
            this.f = subscriber;
            this.g = z;
            this.h = worker;
            this.i = observable;
        }

        @Override // rx.functions.Action0
        public void call() {
            Observable<T> observable = this.i;
            this.i = null;
            this.j = Thread.currentThread();
            observable.unsafeSubscribe(this);
        }

        @Override // rx.Observer
        public void onCompleted() {
            try {
                this.f.onCompleted();
            } finally {
                this.h.unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            try {
                this.f.onError(th);
            } finally {
                this.h.unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.f.onNext(t);
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f.setProducer(new C1248a(producer));
        }
    }

    public OperatorSubscribeOn(Observable<T> observable, Scheduler scheduler, boolean z) {
        this.a = scheduler;
        this.b = observable;
        this.c = z;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        Scheduler.Worker workerCreateWorker = this.a.createWorker();
        a aVar = new a(subscriber, this.c, workerCreateWorker, this.b);
        subscriber.add(aVar);
        subscriber.add(workerCreateWorker);
        workerCreateWorker.schedule(aVar);
    }
}
