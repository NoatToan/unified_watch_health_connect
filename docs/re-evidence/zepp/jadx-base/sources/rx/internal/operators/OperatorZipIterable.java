package rx.internal.operators;

import java.util.Iterator;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func2;
import rx.observers.Subscribers;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorZipIterable<T1, T2, R> implements Observable.Operator<R, T1> {
    public final Iterable<? extends T2> a;
    public final Func2<? super T1, ? super T2, ? extends R> b;

    public class a extends Subscriber<T1> {
        public boolean f;
        public final /* synthetic */ Subscriber g;
        public final /* synthetic */ Iterator h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Subscriber subscriber, Subscriber subscriber2, Iterator it2) {
            super(subscriber);
            this.g = subscriber2;
            this.h = it2;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.g.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.f) {
                Exceptions.throwIfFatal(th);
            } else {
                this.f = true;
                this.g.onError(th);
            }
        }

        @Override // rx.Observer
        public void onNext(T1 t1) {
            if (this.f) {
                return;
            }
            try {
                this.g.onNext(OperatorZipIterable.this.b.call(t1, (Object) this.h.next()));
                if (this.h.hasNext()) {
                    return;
                }
                onCompleted();
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this);
            }
        }
    }

    public OperatorZipIterable(Iterable<? extends T2> iterable, Func2<? super T1, ? super T2, ? extends R> func2) {
        this.a = iterable;
        this.b = func2;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T1> call(Subscriber<? super R> subscriber) {
        Iterator<? extends T2> it2 = this.a.iterator();
        try {
            if (it2.hasNext()) {
                return new a(subscriber, subscriber, it2);
            }
            subscriber.onCompleted();
            return Subscribers.empty();
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, subscriber);
            return Subscribers.empty();
        }
    }
}
