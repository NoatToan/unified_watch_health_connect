package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorTimeout<T> extends rx.internal.operators.a<T> {

    public class a implements rx.internal.operators.a.InterfaceC1260a<T> {
        public final /* synthetic */ long a;
        public final /* synthetic */ TimeUnit b;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorTimeout$a$a, reason: collision with other inner class name */
        public class C1251a implements Action0 {
            public final /* synthetic */ rx.internal.operators.a.c a;
            public final /* synthetic */ Long b;

            public C1251a(rx.internal.operators.a.c cVar, Long l) {
                this.a = cVar;
                this.b = l;
            }

            @Override // rx.functions.Action0
            public void call() {
                this.a.b(this.b.longValue());
            }
        }

        public a(long j, TimeUnit timeUnit) {
            this.a = j;
            this.b = timeUnit;
        }

        @Override // rx.functions.Func3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Subscription call(rx.internal.operators.a.c<T> cVar, Long l, Scheduler.Worker worker) {
            return worker.schedule(new C1251a(cVar, l), this.a, this.b);
        }
    }

    public class b implements rx.internal.operators.a.b<T> {
        public final /* synthetic */ long a;
        public final /* synthetic */ TimeUnit b;

        public class a implements Action0 {
            public final /* synthetic */ rx.internal.operators.a.c a;
            public final /* synthetic */ Long b;

            public a(rx.internal.operators.a.c cVar, Long l) {
                this.a = cVar;
                this.b = l;
            }

            @Override // rx.functions.Action0
            public void call() {
                this.a.b(this.b.longValue());
            }
        }

        public b(long j, TimeUnit timeUnit) {
            this.a = j;
            this.b = timeUnit;
        }

        @Override // rx.functions.Func4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Subscription call(rx.internal.operators.a.c<T> cVar, Long l, T t, Scheduler.Worker worker) {
            return worker.schedule(new a(cVar, l), this.a, this.b);
        }
    }

    public OperatorTimeout(long j, TimeUnit timeUnit, Observable<? extends T> observable, Scheduler scheduler) {
        super(new a(j, timeUnit), new b(j, timeUnit), observable, scheduler);
    }

    @Override // rx.internal.operators.a
    public /* bridge */ /* synthetic */ Subscriber call(Subscriber subscriber) {
        return super.call(subscriber);
    }
}
