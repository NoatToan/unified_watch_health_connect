package rx.internal.operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeJoin<TLeft, TRight, TLeftDuration, TRightDuration, R> implements Observable.OnSubscribe<R> {
    public final Observable<TLeft> a;
    public final Observable<TRight> b;
    public final Func1<TLeft, Observable<TLeftDuration>> c;
    public final Func1<TRight, Observable<TRightDuration>> d;
    public final Func2<TLeft, TRight, R> e;

    public final class a extends HashMap<Integer, TLeft> {
        private static final long serialVersionUID = 3491669543549085380L;
        public final Subscriber<? super R> b;
        public boolean c;
        public int d;
        public boolean e;
        public int f;
        public final CompositeSubscription a = new CompositeSubscription();
        public final Map<Integer, TRight> g = new HashMap();

        /* JADX INFO: renamed from: rx.internal.operators.OnSubscribeJoin$a$a, reason: collision with other inner class name */
        public final class C1234a extends Subscriber<TLeft> {

            /* JADX INFO: renamed from: rx.internal.operators.OnSubscribeJoin$a$a$a, reason: collision with other inner class name */
            public final class C1235a extends Subscriber<TLeftDuration> {
                public final int f;
                public boolean g = true;

                public C1235a(int i) {
                    this.f = i;
                }

                @Override // rx.Observer
                public void onCompleted() {
                    if (this.g) {
                        this.g = false;
                        C1234a.this.b(this.f, this);
                    }
                }

                @Override // rx.Observer
                public void onError(Throwable th) {
                    C1234a.this.onError(th);
                }

                @Override // rx.Observer
                public void onNext(TLeftDuration tleftduration) {
                    onCompleted();
                }
            }

            public C1234a() {
            }

            public void b(int i, Subscription subscription) {
                boolean z;
                synchronized (a.this) {
                    z = a.this.a().remove(Integer.valueOf(i)) != null && a.this.a().isEmpty() && a.this.c;
                }
                if (!z) {
                    a.this.a.remove(subscription);
                } else {
                    a.this.b.onCompleted();
                    a.this.b.unsubscribe();
                }
            }

            @Override // rx.Observer
            public void onCompleted() {
                boolean z;
                synchronized (a.this) {
                    a aVar = a.this;
                    z = true;
                    aVar.c = true;
                    if (!aVar.e && !aVar.a().isEmpty()) {
                        z = false;
                    }
                }
                if (!z) {
                    a.this.a.remove(this);
                } else {
                    a.this.b.onCompleted();
                    a.this.b.unsubscribe();
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                a.this.b.onError(th);
                a.this.b.unsubscribe();
            }

            @Override // rx.Observer
            public void onNext(TLeft tleft) {
                int i;
                a aVar;
                int i2;
                synchronized (a.this) {
                    a aVar2 = a.this;
                    i = aVar2.d;
                    aVar2.d = i + 1;
                    aVar2.a().put(Integer.valueOf(i), tleft);
                    aVar = a.this;
                    i2 = aVar.f;
                }
                try {
                    Observable<TLeftDuration> observableCall = OnSubscribeJoin.this.c.call(tleft);
                    C1235a c1235a = new C1235a(i);
                    a.this.a.add(c1235a);
                    observableCall.unsafeSubscribe(c1235a);
                    ArrayList arrayList = new ArrayList();
                    synchronized (a.this) {
                        for (Map.Entry<Integer, TRight> entry : a.this.g.entrySet()) {
                            if (entry.getKey().intValue() < i2) {
                                arrayList.add(entry.getValue());
                            }
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        a.this.b.onNext(OnSubscribeJoin.this.e.call(tleft, (TRight) it2.next()));
                    }
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this);
                }
            }
        }

        public final class b extends Subscriber<TRight> {

            /* JADX INFO: renamed from: rx.internal.operators.OnSubscribeJoin$a$b$a, reason: collision with other inner class name */
            public final class C1236a extends Subscriber<TRightDuration> {
                public final int f;
                public boolean g = true;

                public C1236a(int i) {
                    this.f = i;
                }

                @Override // rx.Observer
                public void onCompleted() {
                    if (this.g) {
                        this.g = false;
                        b.this.b(this.f, this);
                    }
                }

                @Override // rx.Observer
                public void onError(Throwable th) {
                    b.this.onError(th);
                }

                @Override // rx.Observer
                public void onNext(TRightDuration trightduration) {
                    onCompleted();
                }
            }

            public b() {
            }

            public void b(int i, Subscription subscription) {
                boolean z;
                synchronized (a.this) {
                    z = a.this.g.remove(Integer.valueOf(i)) != null && a.this.g.isEmpty() && a.this.e;
                }
                if (!z) {
                    a.this.a.remove(subscription);
                } else {
                    a.this.b.onCompleted();
                    a.this.b.unsubscribe();
                }
            }

            @Override // rx.Observer
            public void onCompleted() {
                boolean z;
                synchronized (a.this) {
                    a aVar = a.this;
                    z = true;
                    aVar.e = true;
                    if (!aVar.c && !aVar.g.isEmpty()) {
                        z = false;
                    }
                }
                if (!z) {
                    a.this.a.remove(this);
                } else {
                    a.this.b.onCompleted();
                    a.this.b.unsubscribe();
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                a.this.b.onError(th);
                a.this.b.unsubscribe();
            }

            @Override // rx.Observer
            public void onNext(TRight tright) {
                int i;
                int i2;
                synchronized (a.this) {
                    a aVar = a.this;
                    i = aVar.f;
                    aVar.f = i + 1;
                    aVar.g.put(Integer.valueOf(i), tright);
                    i2 = a.this.d;
                }
                a.this.a.add(new SerialSubscription());
                try {
                    Observable<TRightDuration> observableCall = OnSubscribeJoin.this.d.call(tright);
                    C1236a c1236a = new C1236a(i);
                    a.this.a.add(c1236a);
                    observableCall.unsafeSubscribe(c1236a);
                    ArrayList arrayList = new ArrayList();
                    synchronized (a.this) {
                        for (Map.Entry<Integer, TLeft> entry : a.this.a().entrySet()) {
                            if (entry.getKey().intValue() < i2) {
                                arrayList.add(entry.getValue());
                            }
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        a.this.b.onNext(OnSubscribeJoin.this.e.call((TLeft) it2.next(), tright));
                    }
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this);
                }
            }
        }

        public a(Subscriber<? super R> subscriber) {
            this.b = subscriber;
        }

        public HashMap<Integer, TLeft> a() {
            return this;
        }

        public void c() {
            this.b.add(this.a);
            C1234a c1234a = new C1234a();
            b bVar = new b();
            this.a.add(c1234a);
            this.a.add(bVar);
            OnSubscribeJoin.this.a.unsafeSubscribe(c1234a);
            OnSubscribeJoin.this.b.unsafeSubscribe(bVar);
        }
    }

    public OnSubscribeJoin(Observable<TLeft> observable, Observable<TRight> observable2, Func1<TLeft, Observable<TLeftDuration>> func1, Func1<TRight, Observable<TRightDuration>> func2, Func2<TLeft, TRight, R> func3) {
        this.a = observable;
        this.b = observable2;
        this.c = func1;
        this.d = func2;
        this.e = func3;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        new a(new SerializedSubscriber(subscriber)).c();
    }
}
