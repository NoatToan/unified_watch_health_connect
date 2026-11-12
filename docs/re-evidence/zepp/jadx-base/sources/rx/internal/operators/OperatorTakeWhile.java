package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.functions.Func2;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorTakeWhile<T> implements Observable.Operator<T, T> {
    public final Func2<? super T, ? super Integer, Boolean> a;

    public class a implements Func2<T, Integer, Boolean> {
        public final /* synthetic */ Func1 a;

        public a(Func1 func1) {
            this.a = func1;
        }

        @Override // rx.functions.Func2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(T t, Integer num) {
            return (Boolean) this.a.call(t);
        }
    }

    public class b extends Subscriber<T> {
        private int f;
        private boolean g;
        public final /* synthetic */ Subscriber h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Subscriber subscriber, boolean z, Subscriber subscriber2) {
            super(subscriber, z);
            this.h = subscriber2;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.g) {
                return;
            }
            this.h.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.g) {
                return;
            }
            this.h.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            try {
                Func2<? super T, ? super Integer, Boolean> func2 = OperatorTakeWhile.this.a;
                int i = this.f;
                this.f = i + 1;
                if (func2.call(t, Integer.valueOf(i)).booleanValue()) {
                    this.h.onNext(t);
                    return;
                }
                this.g = true;
                this.h.onCompleted();
                unsubscribe();
            } catch (Throwable th) {
                this.g = true;
                Exceptions.throwOrReport(th, this.h, t);
                unsubscribe();
            }
        }
    }

    public OperatorTakeWhile(Func1<? super T, Boolean> func1) {
        this(new a(func1));
    }

    public OperatorTakeWhile(Func2<? super T, ? super Integer, Boolean> func2) {
        this.a = func2;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        b bVar = new b(subscriber, false, subscriber);
        subscriber.add(bVar);
        return bVar;
    }
}
