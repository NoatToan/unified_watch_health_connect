package rx.observables;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.annotations.Beta;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Action2;
import rx.functions.Action3;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.functions.Func3;
import rx.internal.operators.BufferUntilSubscriber;
import rx.observers.SerializedObserver;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes23.dex */
@Beta
public abstract class AsyncOnSubscribe<S, T> implements Observable.OnSubscribe<T> {

    public static class a implements Func3<S, Long, Observer<Observable<? extends T>>, S> {
        public final /* synthetic */ Action3 a;

        public a(Action3 action3) {
            this.a = action3;
        }

        @Override // rx.functions.Func3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public S call(S s, Long l, Observer<Observable<? extends T>> observer) {
            this.a.call(s, l, observer);
            return s;
        }
    }

    public static class b implements Func3<S, Long, Observer<Observable<? extends T>>, S> {
        public final /* synthetic */ Action3 a;

        public b(Action3 action3) {
            this.a = action3;
        }

        @Override // rx.functions.Func3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public S call(S s, Long l, Observer<Observable<? extends T>> observer) {
            this.a.call(s, l, observer);
            return s;
        }
    }

    public static class c implements Func3<Void, Long, Observer<Observable<? extends T>>, Void> {
        public final /* synthetic */ Action2 a;

        public c(Action2 action2) {
            this.a = action2;
        }

        @Override // rx.functions.Func3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call(Void r2, Long l, Observer<Observable<? extends T>> observer) {
            this.a.call(l, observer);
            return r2;
        }
    }

    public static class d implements Func3<Void, Long, Observer<Observable<? extends T>>, Void> {
        public final /* synthetic */ Action2 a;

        public d(Action2 action2) {
            this.a = action2;
        }

        @Override // rx.functions.Func3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call(Void r1, Long l, Observer<Observable<? extends T>> observer) {
            this.a.call(l, observer);
            return null;
        }
    }

    public static class e implements Action1<Void> {
        public final /* synthetic */ Action0 a;

        public e(Action0 action0) {
            this.a = action0;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Void r1) {
            this.a.call();
        }
    }

    public class f extends Subscriber<T> {
        public final /* synthetic */ Subscriber f;
        public final /* synthetic */ i g;

        public f(Subscriber subscriber, i iVar) {
            this.f = subscriber;
            this.g = iVar;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.f.onNext(t);
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.g.f(producer);
        }
    }

    public class g implements Func1<Observable<T>, Observable<T>> {
        public g() {
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<T> call(Observable<T> observable) {
            return observable.onBackpressureBuffer();
        }
    }

    public static final class i<S, T> implements Producer, Subscription, Observer<Observable<? extends T>> {
        private final AsyncOnSubscribe<S, T> b;
        private boolean e;
        private boolean f;
        private S g;
        private final j<Observable<T>> h;
        public boolean i;
        public List<Long> j;
        public Producer k;
        public long l;
        public final CompositeSubscription d = new CompositeSubscription();
        private final SerializedObserver<Observable<? extends T>> c = new SerializedObserver<>(this);
        public final AtomicBoolean a = new AtomicBoolean();

        public class a extends Subscriber<T> {
            public long f;
            public final /* synthetic */ long g;
            public final /* synthetic */ BufferUntilSubscriber h;

            public a(long j, BufferUntilSubscriber bufferUntilSubscriber) {
                this.g = j;
                this.h = bufferUntilSubscriber;
                this.f = j;
            }

            @Override // rx.Observer
            public void onCompleted() {
                this.h.onCompleted();
                long j = this.f;
                if (j > 0) {
                    i.this.e(j);
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                this.h.onError(th);
            }

            @Override // rx.Observer
            public void onNext(T t) {
                this.f--;
                this.h.onNext(t);
            }
        }

        public class b implements Action0 {
            public final /* synthetic */ Subscriber a;

            public b(Subscriber subscriber) {
                this.a = subscriber;
            }

            @Override // rx.functions.Action0
            public void call() {
                i.this.d.remove(this.a);
            }
        }

        public i(AsyncOnSubscribe<S, T> asyncOnSubscribe, S s, j<Observable<T>> jVar) {
            this.b = asyncOnSubscribe;
            this.g = s;
            this.h = jVar;
        }

        private void b(Throwable th) {
            if (this.e) {
                RxJavaHooks.onError(th);
                return;
            }
            this.e = true;
            this.h.onError(th);
            a();
        }

        private void g(Observable<? extends T> observable) {
            BufferUntilSubscriber bufferUntilSubscriberCreate = BufferUntilSubscriber.create();
            a aVar = new a(this.l, bufferUntilSubscriberCreate);
            this.d.add(aVar);
            observable.doOnTerminate(new b(aVar)).subscribe((Subscriber<? super Object>) aVar);
            this.h.onNext(bufferUntilSubscriberCreate);
        }

        public void a() {
            this.d.unsubscribe();
            try {
                this.b.onUnsubscribe(this.g);
            } catch (Throwable th) {
                b(th);
            }
        }

        public void c(long j) {
            this.g = this.b.next(this.g, j, this.c);
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Observable<? extends T> observable) {
            if (this.f) {
                throw new IllegalStateException("onNext called multiple times!");
            }
            this.f = true;
            if (this.e) {
                return;
            }
            g(observable);
        }

        public void e(long j) {
            if (j == 0) {
                return;
            }
            if (j < 0) {
                throw new IllegalStateException("Request can't be negative! " + j);
            }
            synchronized (this) {
                if (this.i) {
                    List arrayList = this.j;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.j = arrayList;
                    }
                    arrayList.add(Long.valueOf(j));
                    return;
                }
                this.i = true;
                if (h(j)) {
                    return;
                }
                while (true) {
                    synchronized (this) {
                        List<Long> list = this.j;
                        if (list == null) {
                            this.i = false;
                            return;
                        }
                        this.j = null;
                        Iterator<Long> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (h(it2.next().longValue())) {
                                return;
                            }
                        }
                    }
                }
            }
        }

        public void f(Producer producer) {
            if (this.k != null) {
                throw new IllegalStateException("setConcatProducer may be called at most once!");
            }
            this.k = producer;
        }

        public boolean h(long j) {
            if (isUnsubscribed()) {
                a();
                return true;
            }
            try {
                this.f = false;
                this.l = j;
                c(j);
                if (!this.e && !isUnsubscribed()) {
                    if (this.f) {
                        return false;
                    }
                    b(new IllegalStateException("No events emitted!"));
                    return true;
                }
                a();
                return true;
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.a.get();
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.e) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.e = true;
            this.h.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.e) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.e = true;
            this.h.onError(th);
        }

        @Override // rx.Producer
        public void request(long j) {
            boolean z;
            if (j == 0) {
                return;
            }
            if (j < 0) {
                throw new IllegalStateException("Request can't be negative! " + j);
            }
            synchronized (this) {
                z = true;
                if (this.i) {
                    List arrayList = this.j;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.j = arrayList;
                    }
                    arrayList.add(Long.valueOf(j));
                } else {
                    this.i = true;
                    z = false;
                }
            }
            this.k.request(j);
            if (z || h(j)) {
                return;
            }
            while (true) {
                synchronized (this) {
                    List<Long> list = this.j;
                    if (list == null) {
                        this.i = false;
                        return;
                    }
                    this.j = null;
                    Iterator<Long> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (h(it2.next().longValue())) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (this.a.compareAndSet(false, true)) {
                synchronized (this) {
                    if (!this.i) {
                        this.i = true;
                        a();
                    } else {
                        ArrayList arrayList = new ArrayList();
                        this.j = arrayList;
                        arrayList.add(0L);
                    }
                }
            }
        }
    }

    public static final class j<T> extends Observable<T> implements Observer<T> {
        private final a<T> b;

        public static final class a<T> implements Observable.OnSubscribe<T> {
            public Subscriber<? super T> a;

            @Override // rx.functions.Action1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(Subscriber<? super T> subscriber) {
                synchronized (this) {
                    if (this.a == null) {
                        this.a = subscriber;
                    } else {
                        subscriber.onError(new IllegalStateException("There can be only one subscriber"));
                    }
                }
            }
        }

        public j(a<T> aVar) {
            super(aVar);
            this.b = aVar;
        }

        public static <T> j<T> c() {
            return new j<>(new a());
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.b.a.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.b.a.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.b.a.onNext(t);
        }
    }

    public static <S, T> AsyncOnSubscribe<S, T> createSingleState(Func0<? extends S> func0, Action3<? super S, Long, ? super Observer<Observable<? extends T>>> action3) {
        return new h(func0, new a(action3));
    }

    public static <S, T> AsyncOnSubscribe<S, T> createStateful(Func0<? extends S> func0, Func3<? super S, Long, ? super Observer<Observable<? extends T>>, ? extends S> func3, Action1<? super S> action1) {
        return new h(func0, func3, action1);
    }

    public static <T> AsyncOnSubscribe<Void, T> createStateless(Action2<Long, ? super Observer<Observable<? extends T>>> action2) {
        return new h(new c(action2));
    }

    public abstract S generateState();

    public abstract S next(S s, long j2, Observer<Observable<? extends T>> observer);

    public void onUnsubscribe(S s) {
    }

    public static <S, T> AsyncOnSubscribe<S, T> createStateful(Func0<? extends S> func0, Func3<? super S, Long, ? super Observer<Observable<? extends T>>, ? extends S> func3) {
        return new h(func0, func3);
    }

    @Override // rx.functions.Action1
    public final void call(Subscriber<? super T> subscriber) {
        try {
            S sGenerateState = generateState();
            j jVarC = j.c();
            i iVar = new i(this, sGenerateState, jVarC);
            f fVar = new f(subscriber, iVar);
            jVarC.onBackpressureBuffer().concatMap(new g()).unsafeSubscribe(fVar);
            subscriber.add(fVar);
            subscriber.add(iVar);
            subscriber.setProducer(iVar);
        } catch (Throwable th) {
            subscriber.onError(th);
        }
    }

    public static <S, T> AsyncOnSubscribe<S, T> createSingleState(Func0<? extends S> func0, Action3<? super S, Long, ? super Observer<Observable<? extends T>>> action3, Action1<? super S> action1) {
        return new h(func0, new b(action3), action1);
    }

    public static <T> AsyncOnSubscribe<Void, T> createStateless(Action2<Long, ? super Observer<Observable<? extends T>>> action2, Action0 action0) {
        return new h(new d(action2), new e(action0));
    }

    public static final class h<S, T> extends AsyncOnSubscribe<S, T> {
        private final Func0<? extends S> a;
        private final Func3<? super S, Long, ? super Observer<Observable<? extends T>>, ? extends S> b;
        private final Action1<? super S> c;

        public h(Func0<? extends S> func0, Func3<? super S, Long, ? super Observer<Observable<? extends T>>, ? extends S> func3, Action1<? super S> action1) {
            this.a = func0;
            this.b = func3;
            this.c = action1;
        }

        @Override // rx.observables.AsyncOnSubscribe, rx.functions.Action1
        public /* bridge */ /* synthetic */ void call(Object obj) {
            super.call((Subscriber) obj);
        }

        @Override // rx.observables.AsyncOnSubscribe
        public S generateState() {
            Func0<? extends S> func0 = this.a;
            if (func0 == null) {
                return null;
            }
            return func0.call();
        }

        @Override // rx.observables.AsyncOnSubscribe
        public S next(S s, long j, Observer<Observable<? extends T>> observer) {
            return this.b.call(s, Long.valueOf(j), observer);
        }

        @Override // rx.observables.AsyncOnSubscribe
        public void onUnsubscribe(S s) {
            Action1<? super S> action1 = this.c;
            if (action1 != null) {
                action1.call(s);
            }
        }

        public h(Func0<? extends S> func0, Func3<? super S, Long, ? super Observer<Observable<? extends T>>, ? extends S> func3) {
            this(func0, func3, null);
        }

        public h(Func3<S, Long, Observer<Observable<? extends T>>, S> func3, Action1<? super S> action1) {
            this(null, func3, action1);
        }

        public h(Func3<S, Long, Observer<Observable<? extends T>>, S> func3) {
            this(null, func3, null);
        }
    }
}
