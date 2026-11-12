package rx.subjects;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.BackpressureUtils;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishSubject<T> extends Subject<T, T> {
    public final b<T> b;

    public static final class a<T> extends AtomicLong implements Producer, Subscription, Observer<T> {
        private static final long serialVersionUID = 6451806817170721536L;
        public final b<T> a;
        public final Subscriber<? super T> b;
        public long c;

        public a(b<T> bVar, Subscriber<? super T> subscriber) {
            this.a = bVar;
            this.b = subscriber;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (get() != Long.MIN_VALUE) {
                this.b.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.b.onError(th);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            long j = get();
            if (j != Long.MIN_VALUE) {
                long j2 = this.c;
                if (j != j2) {
                    this.c = j2 + 1;
                    this.b.onNext(t);
                } else {
                    unsubscribe();
                    this.b.onError(new MissingBackpressureException("PublishSubject: could not emit value due to lack of requests"));
                }
            }
        }

        @Override // rx.Producer
        public void request(long j) {
            long j2;
            if (BackpressureUtils.validate(j)) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                } while (!compareAndSet(j2, BackpressureUtils.addCap(j2, j)));
            }
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.a.c(this);
            }
        }
    }

    public static final class b<T> extends AtomicReference<a<T>[]> implements Observable.OnSubscribe<T>, Observer<T> {
        public static final a[] b = new a[0];
        public static final a[] c = new a[0];
        private static final long serialVersionUID = -7568940796666027140L;
        public Throwable a;

        public b() {
            lazySet(b);
        }

        public boolean a(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                if (aVarArr == c) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super T> subscriber) {
            a<T> aVar = new a<>(this, subscriber);
            subscriber.add(aVar);
            subscriber.setProducer(aVar);
            if (a(aVar)) {
                if (aVar.isUnsubscribed()) {
                    c(aVar);
                }
            } else {
                Throwable th = this.a;
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onCompleted();
                }
            }
        }

        public void c(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                if (aVarArr == c || aVarArr == b) {
                    return;
                }
                int length = aVarArr.length;
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = b;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                    System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!compareAndSet(aVarArr, aVarArr2));
        }

        @Override // rx.Observer
        public void onCompleted() {
            for (a<T> aVar : getAndSet(c)) {
                aVar.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.a = th;
            ArrayList arrayList = null;
            for (a<T> aVar : getAndSet(c)) {
                try {
                    aVar.onError(th);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(th2);
                }
            }
            Exceptions.throwIfAny(arrayList);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            for (a<T> aVar : get()) {
                aVar.onNext(t);
            }
        }
    }

    public PublishSubject(b<T> bVar) {
        super(bVar);
        this.b = bVar;
    }

    public static <T> PublishSubject<T> create() {
        return new PublishSubject<>(new b());
    }

    public Throwable getThrowable() {
        if (this.b.get() == b.c) {
            return this.b.a;
        }
        return null;
    }

    public boolean hasCompleted() {
        return this.b.get() == b.c && this.b.a == null;
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.b.get().length != 0;
    }

    public boolean hasThrowable() {
        return this.b.get() == b.c && this.b.a != null;
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.b.onCompleted();
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.b.onError(th);
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.b.onNext(t);
    }
}
