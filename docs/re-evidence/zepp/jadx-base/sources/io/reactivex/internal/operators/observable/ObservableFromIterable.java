package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
public final class ObservableFromIterable<T> extends Observable<T> {
    public final Iterable<? extends T> a;

    public static final class a<T> extends BasicQueueDisposable<T> {
        public final Observer<? super T> a;
        public final Iterator<? extends T> b;
        public volatile boolean c;
        public boolean d;
        public boolean e;
        public boolean f;

        public a(Observer<? super T> observer, Iterator<? extends T> it2) {
            this.a = observer;
            this.b = it2;
        }

        public void a() {
            while (!isDisposed()) {
                try {
                    this.a.onNext(ObjectHelper.requireNonNull(this.b.next(), "The iterator returned a null value"));
                    if (isDisposed()) {
                        return;
                    }
                    try {
                        if (!this.b.hasNext()) {
                            if (isDisposed()) {
                                return;
                            }
                            this.a.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.a.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.a.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.e = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.c = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.c;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.e;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            if (this.e) {
                return null;
            }
            if (!this.f) {
                this.f = true;
            } else if (!this.b.hasNext()) {
                this.e = true;
                return null;
            }
            return (T) ObjectHelper.requireNonNull(this.b.next(), "The iterator returned a null value");
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.d = true;
            return 1;
        }
    }

    public ObservableFromIterable(Iterable<? extends T> iterable) {
        this.a = iterable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        try {
            Iterator<? extends T> it2 = this.a.iterator();
            try {
                if (!it2.hasNext()) {
                    EmptyDisposable.complete(observer);
                    return;
                }
                a aVar = new a(observer, it2);
                observer.onSubscribe(aVar);
                if (aVar.d) {
                    return;
                }
                aVar.a();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptyDisposable.error(th, observer);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}
