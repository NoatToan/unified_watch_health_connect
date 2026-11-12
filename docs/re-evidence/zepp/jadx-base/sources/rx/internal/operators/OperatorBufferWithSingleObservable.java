package rx.internal.operators;

import java.util.ArrayList;
import java.util.List;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.observers.SerializedSubscriber;
import rx.observers.Subscribers;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorBufferWithSingleObservable<T, TClosing> implements Observable.Operator<List<T>, T> {
    public final Func0<? extends Observable<? extends TClosing>> a;
    public final int b;

    public class a implements Func0<Observable<? extends TClosing>> {
        public final /* synthetic */ Observable a;

        public a(Observable observable) {
            this.a = observable;
        }

        @Override // rx.functions.Func0, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<? extends TClosing> call() {
            return this.a;
        }
    }

    public class b extends Subscriber<TClosing> {
        public final /* synthetic */ c f;

        public b(c cVar) {
            this.f = cVar;
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
        public void onNext(TClosing tclosing) {
            this.f.b();
        }
    }

    public final class c extends Subscriber<T> {
        public final Subscriber<? super List<T>> f;
        public List<T> g;
        public boolean h;

        public c(Subscriber<? super List<T>> subscriber) {
            this.f = subscriber;
            this.g = new ArrayList(OperatorBufferWithSingleObservable.this.b);
        }

        public void b() {
            synchronized (this) {
                if (this.h) {
                    return;
                }
                List<T> list = this.g;
                this.g = new ArrayList(OperatorBufferWithSingleObservable.this.b);
                try {
                    this.f.onNext(list);
                } catch (Throwable th) {
                    unsubscribe();
                    synchronized (this) {
                        if (this.h) {
                            return;
                        }
                        this.h = true;
                        Exceptions.throwOrReport(th, this.f);
                    }
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            try {
                synchronized (this) {
                    if (this.h) {
                        return;
                    }
                    this.h = true;
                    List<T> list = this.g;
                    this.g = null;
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
                if (this.h) {
                    return;
                }
                this.h = true;
                this.g = null;
                this.f.onError(th);
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            synchronized (this) {
                if (this.h) {
                    return;
                }
                this.g.add(t);
            }
        }
    }

    public OperatorBufferWithSingleObservable(Func0<? extends Observable<? extends TClosing>> func0, int i) {
        this.a = func0;
        this.b = i;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        try {
            Observable<? extends TClosing> observableCall = this.a.call();
            c cVar = new c(new SerializedSubscriber(subscriber));
            b bVar = new b(cVar);
            subscriber.add(bVar);
            subscriber.add(cVar);
            observableCall.unsafeSubscribe(bVar);
            return cVar;
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, subscriber);
            return Subscribers.empty();
        }
    }

    public OperatorBufferWithSingleObservable(Observable<? extends TClosing> observable, int i) {
        this.a = new a(observable);
        this.b = i;
    }
}
