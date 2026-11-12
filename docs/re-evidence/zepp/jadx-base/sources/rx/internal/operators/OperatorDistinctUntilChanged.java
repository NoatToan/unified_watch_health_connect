package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorDistinctUntilChanged<T, U> implements Observable.Operator<T, T>, Func2<U, U, Boolean> {
    public final Func1<? super T, ? extends U> a;
    public final Func2<? super U, ? super U, Boolean> b;

    public class a extends Subscriber<T> {
        public U f;
        public boolean g;
        public final /* synthetic */ Subscriber h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.h = subscriber2;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.h.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.h.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            try {
                U uCall = OperatorDistinctUntilChanged.this.a.call(t);
                U u = this.f;
                this.f = uCall;
                if (!this.g) {
                    this.g = true;
                    this.h.onNext(t);
                    return;
                }
                try {
                    if (OperatorDistinctUntilChanged.this.b.call(u, uCall).booleanValue()) {
                        request(1L);
                    } else {
                        this.h.onNext(t);
                    }
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this.h, uCall);
                }
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.h, t);
            }
        }
    }

    public static final class b {
        public static final OperatorDistinctUntilChanged<?, ?> a = new OperatorDistinctUntilChanged<>(UtilityFunctions.identity());
    }

    public OperatorDistinctUntilChanged(Func1<? super T, ? extends U> func1) {
        this.a = func1;
        this.b = this;
    }

    public static <T> OperatorDistinctUntilChanged<T, T> instance() {
        return (OperatorDistinctUntilChanged<T, T>) b.a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // rx.functions.Func2
    public Boolean call(U u, U u2) {
        return Boolean.valueOf(u == u2 || (u != null && u.equals(u2)));
    }

    public OperatorDistinctUntilChanged(Func2<? super U, ? super U, Boolean> func2) {
        this.a = UtilityFunctions.identity();
        this.b = func2;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new a(subscriber, subscriber);
    }
}
