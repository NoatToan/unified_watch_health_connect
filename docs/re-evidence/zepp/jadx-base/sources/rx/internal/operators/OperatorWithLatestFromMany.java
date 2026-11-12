package rx.internal.operators;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.FuncN;
import rx.observers.SerializedSubscriber;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorWithLatestFromMany<T, R> implements Observable.OnSubscribe<R> {
    public final Observable<T> a;
    public final Observable<?>[] b;
    public final Iterable<Observable<?>> c;
    public final FuncN<R> d;

    public static final class a<T, R> extends Subscriber<T> {
        public static final Object k = new Object();
        public final Subscriber<? super R> f;
        public final FuncN<R> g;
        public final AtomicReferenceArray<Object> h;
        public final AtomicInteger i;
        public boolean j;

        public a(Subscriber<? super R> subscriber, FuncN<R> funcN, int i) {
            this.f = subscriber;
            this.g = funcN;
            AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(i + 1);
            for (int i2 = 0; i2 <= i; i2++) {
                atomicReferenceArray.lazySet(i2, k);
            }
            this.h = atomicReferenceArray;
            this.i = new AtomicInteger(i);
            request(0L);
        }

        public void b(int i) {
            if (this.h.get(i) == k) {
                onCompleted();
            }
        }

        public void c(int i, Throwable th) {
            onError(th);
        }

        public void d(int i, Object obj) {
            if (this.h.getAndSet(i, obj) == k) {
                this.i.decrementAndGet();
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.j) {
                return;
            }
            this.j = true;
            unsubscribe();
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.j) {
                RxJavaHooks.onError(th);
                return;
            }
            this.j = true;
            unsubscribe();
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.j) {
                return;
            }
            if (this.i.get() != 0) {
                request(1L);
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.h;
            int length = atomicReferenceArray.length();
            atomicReferenceArray.lazySet(0, t);
            Object[] objArr = new Object[atomicReferenceArray.length()];
            for (int i = 0; i < length; i++) {
                objArr[i] = atomicReferenceArray.get(i);
            }
            try {
                this.f.onNext(this.g.call(objArr));
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                onError(th);
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            super.setProducer(producer);
            this.f.setProducer(producer);
        }
    }

    public static final class b extends Subscriber<Object> {
        public final a<?, ?> f;
        public final int g;

        public b(a<?, ?> aVar, int i) {
            this.f = aVar;
            this.g = i;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.f.b(this.g);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f.c(this.g, th);
        }

        @Override // rx.Observer
        public void onNext(Object obj) {
            this.f.d(this.g, obj);
        }
    }

    public OperatorWithLatestFromMany(Observable<T> observable, Observable<?>[] observableArr, Iterable<Observable<?>> iterable, FuncN<R> funcN) {
        this.a = observable;
        this.b = observableArr;
        this.c = iterable;
        this.d = funcN;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        int length;
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        Observable<?>[] observableArr = this.b;
        int i = 0;
        if (observableArr != null) {
            length = observableArr.length;
        } else {
            observableArr = new Observable[8];
            int i2 = 0;
            for (Observable<?> observable : this.c) {
                if (i2 == observableArr.length) {
                    observableArr = (Observable[]) Arrays.copyOf(observableArr, (i2 >> 2) + i2);
                }
                observableArr[i2] = observable;
                i2++;
            }
            length = i2;
        }
        a aVar = new a(subscriber, this.d, length);
        serializedSubscriber.add(aVar);
        while (i < length) {
            if (serializedSubscriber.isUnsubscribed()) {
                return;
            }
            int i3 = i + 1;
            b bVar = new b(aVar, i3);
            aVar.add(bVar);
            observableArr[i].unsafeSubscribe(bVar);
            i = i3;
        }
        this.a.unsafeSubscribe(aVar);
    }
}
