package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Observer;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.observers.SerializedObserver;
import rx.observers.SerializedSubscriber;
import rx.subjects.UnicastSubject;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorWindowWithTime<T> implements Observable.Operator<Observable<T>, T> {
    public static final Object f = new Object();
    public final long a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final int e;

    public static final class a<T> {
        public final Observer<T> a;
        public final Observable<T> b;
        public int c;

        public a(Observer<T> observer, Observable<T> observable) {
            this.a = new SerializedObserver(observer);
            this.b = observable;
        }
    }

    public final class b extends Subscriber<T> {
        public final Subscriber<? super Observable<T>> f;
        public final Scheduler.Worker g;
        public List<Object> i;
        public boolean j;
        public final Object h = new Object();
        public volatile d<T> k = d.c();

        public class a implements Action0 {
            public final /* synthetic */ OperatorWindowWithTime a;

            public a(OperatorWindowWithTime operatorWindowWithTime) {
                this.a = operatorWindowWithTime;
            }

            @Override // rx.functions.Action0
            public void call() {
                if (b.this.k.a == null) {
                    b.this.unsubscribe();
                }
            }
        }

        /* JADX INFO: renamed from: rx.internal.operators.OperatorWindowWithTime$b$b, reason: collision with other inner class name */
        public class C1254b implements Action0 {
            public C1254b() {
            }

            @Override // rx.functions.Action0
            public void call() throws Throwable {
                b.this.e();
            }
        }

        public b(Subscriber<? super Observable<T>> subscriber, Scheduler.Worker worker) {
            this.f = new SerializedSubscriber(subscriber);
            this.g = worker;
            subscriber.add(Subscriptions.create(new a(OperatorWindowWithTime.this)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean b(List<Object> list) {
            if (list == null) {
                return true;
            }
            for (Object obj : list) {
                if (obj == OperatorWindowWithTime.f) {
                    if (!f()) {
                        return false;
                    }
                } else {
                    if (NotificationLite.isError(obj)) {
                        d(NotificationLite.getError(obj));
                        break;
                    }
                    if (NotificationLite.isCompleted(obj)) {
                        complete();
                        break;
                    }
                    if (!c(obj)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public boolean c(T t) {
            d<T> dVarD;
            d<T> dVar = this.k;
            if (dVar.a == null) {
                if (!f()) {
                    return false;
                }
                dVar = this.k;
            }
            dVar.a.onNext(t);
            if (dVar.c == OperatorWindowWithTime.this.e - 1) {
                dVar.a.onCompleted();
                dVarD = dVar.a();
            } else {
                dVarD = dVar.d();
            }
            this.k = dVarD;
            return true;
        }

        public void complete() {
            Observer<T> observer = this.k.a;
            this.k = this.k.a();
            if (observer != null) {
                observer.onCompleted();
            }
            this.f.onCompleted();
            unsubscribe();
        }

        public void d(Throwable th) {
            Observer<T> observer = this.k.a;
            this.k = this.k.a();
            if (observer != null) {
                observer.onError(th);
            }
            this.f.onError(th);
            unsubscribe();
        }

        public void e() throws Throwable {
            boolean z;
            List<Object> list;
            synchronized (this.h) {
                if (this.j) {
                    if (this.i == null) {
                        this.i = new ArrayList();
                    }
                    this.i.add(OperatorWindowWithTime.f);
                    return;
                }
                boolean z2 = true;
                this.j = true;
                try {
                    if (!f()) {
                        synchronized (this.h) {
                            this.j = false;
                        }
                        return;
                    }
                    do {
                        try {
                            synchronized (this.h) {
                                try {
                                    list = this.i;
                                    if (list == null) {
                                        this.j = false;
                                        return;
                                    }
                                    this.i = null;
                                } catch (Throwable th) {
                                    th = th;
                                    z2 = false;
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        z = z2;
                                        th = th2;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } while (b(list));
                    synchronized (this.h) {
                        this.j = false;
                    }
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    z = false;
                }
                if (!z) {
                    synchronized (this.h) {
                        this.j = false;
                    }
                }
                throw th;
            }
        }

        public boolean f() {
            Observer<T> observer = this.k.a;
            if (observer != null) {
                observer.onCompleted();
            }
            if (this.f.isUnsubscribed()) {
                this.k = this.k.a();
                unsubscribe();
                return false;
            }
            UnicastSubject unicastSubjectCreate = UnicastSubject.create();
            this.k = this.k.b(unicastSubjectCreate, unicastSubjectCreate);
            this.f.onNext(unicastSubjectCreate);
            return true;
        }

        public void g() {
            Scheduler.Worker worker = this.g;
            C1254b c1254b = new C1254b();
            OperatorWindowWithTime operatorWindowWithTime = OperatorWindowWithTime.this;
            worker.schedulePeriodically(c1254b, 0L, operatorWindowWithTime.a, operatorWindowWithTime.c);
        }

        @Override // rx.Observer
        public void onCompleted() {
            synchronized (this.h) {
                if (this.j) {
                    if (this.i == null) {
                        this.i = new ArrayList();
                    }
                    this.i.add(NotificationLite.completed());
                    return;
                }
                List<Object> list = this.i;
                this.i = null;
                this.j = true;
                try {
                    b(list);
                    complete();
                } catch (Throwable th) {
                    d(th);
                }
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            synchronized (this.h) {
                if (this.j) {
                    this.i = Collections.singletonList(NotificationLite.error(th));
                    return;
                }
                this.i = null;
                this.j = true;
                d(th);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) throws Throwable {
            List<Object> list;
            synchronized (this.h) {
                if (this.j) {
                    if (this.i == null) {
                        this.i = new ArrayList();
                    }
                    this.i.add(t);
                    return;
                }
                boolean z = true;
                this.j = true;
                try {
                    if (!c(t)) {
                        synchronized (this.h) {
                            this.j = false;
                        }
                        return;
                    }
                    do {
                        try {
                            synchronized (this.h) {
                                try {
                                    list = this.i;
                                    if (list == null) {
                                        this.j = false;
                                        return;
                                    }
                                    this.i = null;
                                } catch (Throwable th) {
                                    th = th;
                                    z = false;
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } while (b(list));
                    synchronized (this.h) {
                        this.j = false;
                    }
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    z = false;
                }
                if (!z) {
                    synchronized (this.h) {
                        this.j = false;
                    }
                }
                throw th;
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public final class c extends Subscriber<T> {
        public final Subscriber<? super Observable<T>> f;
        public final Scheduler.Worker g;
        public final Object h;
        public final List<a<T>> i;
        public boolean j;

        public class a implements Action0 {
            public a() {
            }

            @Override // rx.functions.Action0
            public void call() {
                c.this.d();
            }
        }

        public class b implements Action0 {
            public final /* synthetic */ a a;

            public b(a aVar) {
                this.a = aVar;
            }

            @Override // rx.functions.Action0
            public void call() {
                c.this.e(this.a);
            }
        }

        public c(Subscriber<? super Observable<T>> subscriber, Scheduler.Worker worker) {
            super(subscriber);
            this.f = subscriber;
            this.g = worker;
            this.h = new Object();
            this.i = new LinkedList();
        }

        public a<T> b() {
            UnicastSubject unicastSubjectCreate = UnicastSubject.create();
            return new a<>(unicastSubjectCreate, unicastSubjectCreate);
        }

        public void c() {
            Scheduler.Worker worker = this.g;
            a aVar = new a();
            OperatorWindowWithTime operatorWindowWithTime = OperatorWindowWithTime.this;
            long j = operatorWindowWithTime.b;
            worker.schedulePeriodically(aVar, j, j, operatorWindowWithTime.c);
        }

        public void d() {
            a<T> aVarB = b();
            synchronized (this.h) {
                if (this.j) {
                    return;
                }
                this.i.add(aVarB);
                try {
                    this.f.onNext(aVarB.b);
                    Scheduler.Worker worker = this.g;
                    b bVar = new b(aVarB);
                    OperatorWindowWithTime operatorWindowWithTime = OperatorWindowWithTime.this;
                    worker.schedule(bVar, operatorWindowWithTime.a, operatorWindowWithTime.c);
                } catch (Throwable th) {
                    onError(th);
                }
            }
        }

        public void e(a<T> aVar) {
            boolean z;
            synchronized (this.h) {
                if (this.j) {
                    return;
                }
                Iterator<a<T>> it2 = this.i.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    } else if (it2.next() == aVar) {
                        z = true;
                        it2.remove();
                        break;
                    }
                }
                if (z) {
                    aVar.a.onCompleted();
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            synchronized (this.h) {
                if (this.j) {
                    return;
                }
                this.j = true;
                ArrayList arrayList = new ArrayList(this.i);
                this.i.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((a) it2.next()).a.onCompleted();
                }
                this.f.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            synchronized (this.h) {
                if (this.j) {
                    return;
                }
                this.j = true;
                ArrayList arrayList = new ArrayList(this.i);
                this.i.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((a) it2.next()).a.onError(th);
                }
                this.f.onError(th);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            synchronized (this.h) {
                if (this.j) {
                    return;
                }
                ArrayList<a> arrayList = new ArrayList(this.i);
                Iterator<a<T>> it2 = this.i.iterator();
                while (it2.hasNext()) {
                    a<T> next = it2.next();
                    int i = next.c + 1;
                    next.c = i;
                    if (i == OperatorWindowWithTime.this.e) {
                        it2.remove();
                    }
                }
                for (a aVar : arrayList) {
                    aVar.a.onNext(t);
                    if (aVar.c == OperatorWindowWithTime.this.e) {
                        aVar.a.onCompleted();
                    }
                }
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public static final class d<T> {
        public static final d<Object> d = new d<>(null, null, 0);
        public final Observer<T> a;
        public final Observable<T> b;
        public final int c;

        public d(Observer<T> observer, Observable<T> observable, int i) {
            this.a = observer;
            this.b = observable;
            this.c = i;
        }

        public static <T> d<T> c() {
            return (d<T>) d;
        }

        public d<T> a() {
            return c();
        }

        public d<T> b(Observer<T> observer, Observable<T> observable) {
            return new d<>(observer, observable, 0);
        }

        public d<T> d() {
            return new d<>(this.a, this.b, this.c + 1);
        }
    }

    public OperatorWindowWithTime(long j, long j2, TimeUnit timeUnit, int i, Scheduler scheduler) {
        this.a = j;
        this.b = j2;
        this.c = timeUnit;
        this.e = i;
        this.d = scheduler;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        Scheduler.Worker workerCreateWorker = this.d.createWorker();
        if (this.a == this.b) {
            b bVar = new b(subscriber, workerCreateWorker);
            bVar.add(workerCreateWorker);
            bVar.g();
            return bVar;
        }
        c cVar = new c(subscriber, workerCreateWorker);
        cVar.add(workerCreateWorker);
        cVar.d();
        cVar.c();
        return cVar;
    }
}
