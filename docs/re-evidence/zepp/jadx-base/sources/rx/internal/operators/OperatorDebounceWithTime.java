package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorDebounceWithTime<T> implements Observable.Operator<T, T> {
    public final long a;
    public final TimeUnit b;
    public final Scheduler c;

    public class a extends Subscriber<T> {
        public final b<T> f;
        public final Subscriber<?> g;
        public final /* synthetic */ SerialSubscription h;
        public final /* synthetic */ Scheduler.Worker i;
        public final /* synthetic */ SerializedSubscriber j;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorDebounceWithTime$a$a, reason: collision with other inner class name */
        public class C1243a implements Action0 {
            public final /* synthetic */ int a;

            public C1243a(int i) {
                this.a = i;
            }

            @Override // rx.functions.Action0
            public void call() {
                a aVar = a.this;
                aVar.f.b(this.a, aVar.j, aVar.g);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Subscriber subscriber, SerialSubscription serialSubscription, Scheduler.Worker worker, SerializedSubscriber serializedSubscriber) {
            super(subscriber);
            this.h = serialSubscription;
            this.i = worker;
            this.j = serializedSubscriber;
            this.f = new b<>();
            this.g = this;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.f.c(this.j, this);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.j.onError(th);
            unsubscribe();
            this.f.a();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            int iD = this.f.d(t);
            SerialSubscription serialSubscription = this.h;
            Scheduler.Worker worker = this.i;
            C1243a c1243a = new C1243a(iD);
            OperatorDebounceWithTime operatorDebounceWithTime = OperatorDebounceWithTime.this;
            serialSubscription.set(worker.schedule(c1243a, operatorDebounceWithTime.a, operatorDebounceWithTime.b));
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public static final class b<T> {
        public int a;
        public T b;
        public boolean c;
        public boolean d;
        public boolean e;

        public synchronized void a() {
            this.a++;
            this.b = null;
            this.c = false;
        }

        public void b(int i, Subscriber<T> subscriber, Subscriber<?> subscriber2) {
            synchronized (this) {
                if (!this.e && this.c && i == this.a) {
                    T t = this.b;
                    this.b = null;
                    this.c = false;
                    this.e = true;
                    try {
                        subscriber.onNext(t);
                        synchronized (this) {
                            if (this.d) {
                                subscriber.onCompleted();
                            } else {
                                this.e = false;
                            }
                        }
                    } catch (Throwable th) {
                        Exceptions.throwOrReport(th, subscriber2, t);
                    }
                }
            }
        }

        public void c(Subscriber<T> subscriber, Subscriber<?> subscriber2) {
            synchronized (this) {
                if (this.e) {
                    this.d = true;
                    return;
                }
                T t = this.b;
                boolean z = this.c;
                this.b = null;
                this.c = false;
                this.e = true;
                if (z) {
                    try {
                        subscriber.onNext(t);
                    } catch (Throwable th) {
                        Exceptions.throwOrReport(th, subscriber2, t);
                        return;
                    }
                }
                subscriber.onCompleted();
            }
        }

        public synchronized int d(T t) {
            int i;
            this.b = t;
            this.c = true;
            i = this.a + 1;
            this.a = i;
            return i;
        }
    }

    public OperatorDebounceWithTime(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = j;
        this.b = timeUnit;
        this.c = scheduler;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker workerCreateWorker = this.c.createWorker();
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        SerialSubscription serialSubscription = new SerialSubscription();
        serializedSubscriber.add(workerCreateWorker);
        serializedSubscriber.add(serialSubscription);
        return new a(subscriber, serialSubscription, workerCreateWorker, serializedSubscriber);
    }
}
