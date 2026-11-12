package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.observers.SerializedSubscriber;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorBufferWithTime<T> implements Observable.Operator<List<T>, T> {
    public final long a;
    public final long b;
    public final TimeUnit c;
    public final int d;
    public final Scheduler e;

    public final class a extends Subscriber<T> {
        public final Subscriber<? super List<T>> f;
        public final Scheduler.Worker g;
        public List<T> h = new ArrayList();
        public boolean i;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorBufferWithTime$a$a, reason: collision with other inner class name */
        public class C1240a implements Action0 {
            public C1240a() {
            }

            @Override // rx.functions.Action0
            public void call() {
                a.this.b();
            }
        }

        public a(Subscriber<? super List<T>> subscriber, Scheduler.Worker worker) {
            this.f = subscriber;
            this.g = worker;
        }

        public void b() {
            synchronized (this) {
                if (this.i) {
                    return;
                }
                List<T> list = this.h;
                this.h = new ArrayList();
                try {
                    this.f.onNext(list);
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this);
                }
            }
        }

        public void c() {
            Scheduler.Worker worker = this.g;
            C1240a c1240a = new C1240a();
            OperatorBufferWithTime operatorBufferWithTime = OperatorBufferWithTime.this;
            long j = operatorBufferWithTime.a;
            worker.schedulePeriodically(c1240a, j, j, operatorBufferWithTime.c);
        }

        @Override // rx.Observer
        public void onCompleted() {
            try {
                this.g.unsubscribe();
                synchronized (this) {
                    if (this.i) {
                        return;
                    }
                    this.i = true;
                    List<T> list = this.h;
                    this.h = null;
                    this.f.onNext(list);
                    this.f.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this.f);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            synchronized (this) {
                if (this.i) {
                    return;
                }
                this.i = true;
                this.h = null;
                this.f.onError(th);
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            List<T> list;
            synchronized (this) {
                if (this.i) {
                    return;
                }
                this.h.add(t);
                if (this.h.size() == OperatorBufferWithTime.this.d) {
                    list = this.h;
                    this.h = new ArrayList();
                } else {
                    list = null;
                }
                if (list != null) {
                    this.f.onNext(list);
                }
            }
        }
    }

    public final class b extends Subscriber<T> {
        public final Subscriber<? super List<T>> f;
        public final Scheduler.Worker g;
        public final List<List<T>> h = new LinkedList();
        public boolean i;

        public class a implements Action0 {
            public a() {
            }

            @Override // rx.functions.Action0
            public void call() {
                b.this.d();
            }
        }

        /* JADX INFO: renamed from: rx.internal.operators.OperatorBufferWithTime$b$b, reason: collision with other inner class name */
        public class C1241b implements Action0 {
            public final /* synthetic */ List a;

            public C1241b(List list) {
                this.a = list;
            }

            @Override // rx.functions.Action0
            public void call() {
                b.this.b(this.a);
            }
        }

        public b(Subscriber<? super List<T>> subscriber, Scheduler.Worker worker) {
            this.f = subscriber;
            this.g = worker;
        }

        public void b(List<T> list) {
            boolean z;
            synchronized (this) {
                if (this.i) {
                    return;
                }
                Iterator<List<T>> it2 = this.h.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    } else if (it2.next() == list) {
                        it2.remove();
                        z = true;
                        break;
                    }
                }
                if (z) {
                    try {
                        this.f.onNext(list);
                    } catch (Throwable th) {
                        Exceptions.throwOrReport(th, this);
                    }
                }
            }
        }

        public void c() {
            Scheduler.Worker worker = this.g;
            a aVar = new a();
            OperatorBufferWithTime operatorBufferWithTime = OperatorBufferWithTime.this;
            long j = operatorBufferWithTime.b;
            worker.schedulePeriodically(aVar, j, j, operatorBufferWithTime.c);
        }

        public void d() {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                if (this.i) {
                    return;
                }
                this.h.add(arrayList);
                Scheduler.Worker worker = this.g;
                C1241b c1241b = new C1241b(arrayList);
                OperatorBufferWithTime operatorBufferWithTime = OperatorBufferWithTime.this;
                worker.schedule(c1241b, operatorBufferWithTime.a, operatorBufferWithTime.c);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            try {
                synchronized (this) {
                    if (this.i) {
                        return;
                    }
                    this.i = true;
                    LinkedList linkedList = new LinkedList(this.h);
                    this.h.clear();
                    Iterator it2 = linkedList.iterator();
                    while (it2.hasNext()) {
                        this.f.onNext((List) it2.next());
                    }
                    this.f.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this.f);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            synchronized (this) {
                if (this.i) {
                    return;
                }
                this.i = true;
                this.h.clear();
                this.f.onError(th);
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            synchronized (this) {
                if (this.i) {
                    return;
                }
                Iterator<List<T>> it2 = this.h.iterator();
                LinkedList linkedList = null;
                while (it2.hasNext()) {
                    List<T> next = it2.next();
                    next.add(t);
                    if (next.size() == OperatorBufferWithTime.this.d) {
                        it2.remove();
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                        }
                        linkedList.add(next);
                    }
                }
                if (linkedList != null) {
                    Iterator it3 = linkedList.iterator();
                    while (it3.hasNext()) {
                        this.f.onNext((List) it3.next());
                    }
                }
            }
        }
    }

    public OperatorBufferWithTime(long j, long j2, TimeUnit timeUnit, int i, Scheduler scheduler) {
        this.a = j;
        this.b = j2;
        this.c = timeUnit;
        this.d = i;
        this.e = scheduler;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        Scheduler.Worker workerCreateWorker = this.e.createWorker();
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        if (this.a == this.b) {
            a aVar = new a(serializedSubscriber, workerCreateWorker);
            aVar.add(workerCreateWorker);
            subscriber.add(aVar);
            aVar.c();
            return aVar;
        }
        b bVar = new b(serializedSubscriber, workerCreateWorker);
        bVar.add(workerCreateWorker);
        subscriber.add(bVar);
        bVar.d();
        bVar.c();
        return bVar;
    }
}
