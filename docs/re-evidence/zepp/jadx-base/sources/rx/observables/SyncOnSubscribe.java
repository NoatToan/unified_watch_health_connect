package rx.observables;

import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Action2;
import rx.functions.Func0;
import rx.functions.Func2;
import rx.internal.operators.BackpressureUtils;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public abstract class SyncOnSubscribe<S, T> implements Observable.OnSubscribe<T> {

    public static class a implements Func2<S, Observer<? super T>, S> {
        public final /* synthetic */ Action2 a;

        public a(Action2 action2) {
            this.a = action2;
        }

        @Override // rx.functions.Func2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public S call(S s, Observer<? super T> observer) {
            this.a.call(s, observer);
            return s;
        }
    }

    public static class b implements Func2<S, Observer<? super T>, S> {
        public final /* synthetic */ Action2 a;

        public b(Action2 action2) {
            this.a = action2;
        }

        @Override // rx.functions.Func2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public S call(S s, Observer<? super T> observer) {
            this.a.call(s, observer);
            return s;
        }
    }

    public static class c implements Func2<Void, Observer<? super T>, Void> {
        public final /* synthetic */ Action1 a;

        public c(Action1 action1) {
            this.a = action1;
        }

        @Override // rx.functions.Func2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call(Void r2, Observer<? super T> observer) {
            this.a.call(observer);
            return r2;
        }
    }

    public static class d implements Func2<Void, Observer<? super T>, Void> {
        public final /* synthetic */ Action1 a;

        public d(Action1 action1) {
            this.a = action1;
        }

        @Override // rx.functions.Func2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call(Void r1, Observer<? super T> observer) {
            this.a.call(observer);
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

    public static final class f<S, T> extends AtomicLong implements Producer, Subscription, Observer<T> {
        private static final long serialVersionUID = -3736864024352728072L;
        private final Subscriber<? super T> a;
        private final SyncOnSubscribe<S, T> b;
        private boolean c;
        private boolean d;
        private S e;

        public f(Subscriber<? super T> subscriber, SyncOnSubscribe<S, T> syncOnSubscribe, S s) {
            this.a = subscriber;
            this.b = syncOnSubscribe;
            this.e = s;
        }

        private void a() {
            try {
                this.b.onUnsubscribe(this.e);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaHooks.onError(th);
            }
        }

        private void b() {
            SyncOnSubscribe<S, T> syncOnSubscribe = this.b;
            Subscriber<? super T> subscriber = this.a;
            do {
                try {
                    this.c = false;
                    e(syncOnSubscribe);
                } catch (Throwable th) {
                    c(subscriber, th);
                    return;
                }
            } while (!g());
        }

        private void c(Subscriber<? super T> subscriber, Throwable th) {
            if (this.d) {
                RxJavaHooks.onError(th);
                return;
            }
            this.d = true;
            subscriber.onError(th);
            unsubscribe();
        }

        private void e(SyncOnSubscribe<S, T> syncOnSubscribe) {
            this.e = syncOnSubscribe.next(this.e, this);
        }

        private void f(long j) {
            SyncOnSubscribe<S, T> syncOnSubscribe = this.b;
            Subscriber<? super T> subscriber = this.a;
            do {
                long j2 = j;
                do {
                    try {
                        this.c = false;
                        e(syncOnSubscribe);
                        if (g()) {
                            return;
                        }
                        if (this.c) {
                            j2--;
                        }
                    } catch (Throwable th) {
                        c(subscriber, th);
                        return;
                    }
                } while (j2 != 0);
                j = addAndGet(-j);
            } while (j > 0);
            g();
        }

        private boolean g() {
            if (!this.d && get() >= -1) {
                return false;
            }
            set(-1L);
            a();
            return true;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() < 0;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.d) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.d = true;
            if (this.a.isUnsubscribed()) {
                return;
            }
            this.a.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.d) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.d = true;
            if (this.a.isUnsubscribed()) {
                return;
            }
            this.a.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.c) {
                throw new IllegalStateException("onNext called multiple times!");
            }
            this.c = true;
            this.a.onNext(t);
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j <= 0 || BackpressureUtils.getAndAddRequest(this, j) != 0) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                b();
            } else {
                f(j);
            }
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            long j;
            do {
                j = get();
                if (compareAndSet(0L, -1L)) {
                    a();
                    return;
                }
            } while (!compareAndSet(j, -2L));
        }
    }

    public static <S, T> SyncOnSubscribe<S, T> createSingleState(Func0<? extends S> func0, Action2<? super S, ? super Observer<? super T>> action2) {
        return new g(func0, new a(action2));
    }

    public static <S, T> SyncOnSubscribe<S, T> createStateful(Func0<? extends S> func0, Func2<? super S, ? super Observer<? super T>, ? extends S> func2, Action1<? super S> action1) {
        return new g(func0, func2, action1);
    }

    public static <T> SyncOnSubscribe<Void, T> createStateless(Action1<? super Observer<? super T>> action1) {
        return new g(new c(action1));
    }

    public abstract S generateState();

    public abstract S next(S s, Observer<? super T> observer);

    public void onUnsubscribe(S s) {
    }

    public static <S, T> SyncOnSubscribe<S, T> createStateful(Func0<? extends S> func0, Func2<? super S, ? super Observer<? super T>, ? extends S> func2) {
        return new g(func0, func2);
    }

    @Override // rx.functions.Action1
    public final void call(Subscriber<? super T> subscriber) {
        try {
            f fVar = new f(subscriber, this, generateState());
            subscriber.add(fVar);
            subscriber.setProducer(fVar);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            subscriber.onError(th);
        }
    }

    public static <S, T> SyncOnSubscribe<S, T> createSingleState(Func0<? extends S> func0, Action2<? super S, ? super Observer<? super T>> action2, Action1<? super S> action1) {
        return new g(func0, new b(action2), action1);
    }

    public static <T> SyncOnSubscribe<Void, T> createStateless(Action1<? super Observer<? super T>> action1, Action0 action0) {
        return new g(new d(action1), new e(action0));
    }

    public static final class g<S, T> extends SyncOnSubscribe<S, T> {
        private final Func0<? extends S> a;
        private final Func2<? super S, ? super Observer<? super T>, ? extends S> b;
        private final Action1<? super S> c;

        public g(Func0<? extends S> func0, Func2<? super S, ? super Observer<? super T>, ? extends S> func2, Action1<? super S> action1) {
            this.a = func0;
            this.b = func2;
            this.c = action1;
        }

        @Override // rx.observables.SyncOnSubscribe, rx.functions.Action1
        public /* bridge */ /* synthetic */ void call(Object obj) {
            super.call((Subscriber) obj);
        }

        @Override // rx.observables.SyncOnSubscribe
        public S generateState() {
            Func0<? extends S> func0 = this.a;
            if (func0 == null) {
                return null;
            }
            return func0.call();
        }

        @Override // rx.observables.SyncOnSubscribe
        public S next(S s, Observer<? super T> observer) {
            return this.b.call(s, observer);
        }

        @Override // rx.observables.SyncOnSubscribe
        public void onUnsubscribe(S s) {
            Action1<? super S> action1 = this.c;
            if (action1 != null) {
                action1.call(s);
            }
        }

        public g(Func0<? extends S> func0, Func2<? super S, ? super Observer<? super T>, ? extends S> func2) {
            this(func0, func2, null);
        }

        public g(Func2<S, Observer<? super T>, S> func2, Action1<? super S> action1) {
            this(null, func2, action1);
        }

        public g(Func2<S, Observer<? super T>, S> func2) {
            this(null, func2, null);
        }
    }
}
