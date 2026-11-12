package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorDelay<T> implements Observable.Operator<T, T> {
    public final long a;
    public final TimeUnit b;
    public final Scheduler c;

    public class a extends Subscriber<T> {
        public boolean f;
        public final /* synthetic */ Scheduler.Worker g;
        public final /* synthetic */ Subscriber h;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorDelay$a$a, reason: collision with other inner class name */
        public class C1244a implements Action0 {
            public C1244a() {
            }

            @Override // rx.functions.Action0
            public void call() {
                a aVar = a.this;
                if (aVar.f) {
                    return;
                }
                aVar.f = true;
                aVar.h.onCompleted();
            }
        }

        public class b implements Action0 {
            public final /* synthetic */ Throwable a;

            public b(Throwable th) {
                this.a = th;
            }

            @Override // rx.functions.Action0
            public void call() {
                a aVar = a.this;
                if (aVar.f) {
                    return;
                }
                aVar.f = true;
                aVar.h.onError(this.a);
                a.this.g.unsubscribe();
            }
        }

        public class c implements Action0 {
            public final /* synthetic */ Object a;

            public c(Object obj) {
                this.a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // rx.functions.Action0
            public void call() {
                a aVar = a.this;
                if (aVar.f) {
                    return;
                }
                aVar.h.onNext(this.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Subscriber subscriber, Scheduler.Worker worker, Subscriber subscriber2) {
            super(subscriber);
            this.g = worker;
            this.h = subscriber2;
        }

        @Override // rx.Observer
        public void onCompleted() {
            Scheduler.Worker worker = this.g;
            C1244a c1244a = new C1244a();
            OperatorDelay operatorDelay = OperatorDelay.this;
            worker.schedule(c1244a, operatorDelay.a, operatorDelay.b);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.g.schedule(new b(th));
        }

        @Override // rx.Observer
        public void onNext(T t) {
            Scheduler.Worker worker = this.g;
            c cVar = new c(t);
            OperatorDelay operatorDelay = OperatorDelay.this;
            worker.schedule(cVar, operatorDelay.a, operatorDelay.b);
        }
    }

    public OperatorDelay(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = j;
        this.b = timeUnit;
        this.c = scheduler;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker workerCreateWorker = this.c.createWorker();
        subscriber.add(workerCreateWorker);
        return new a(subscriber, workerCreateWorker, subscriber);
    }
}
