package rx.internal.operators;

import java.util.Objects;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorDoAfterTerminate<T> implements Observable.Operator<T, T> {
    public final Action0 a;

    public class a extends Subscriber<T> {
        public final /* synthetic */ Subscriber f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f = subscriber2;
        }

        public void b() {
            try {
                OperatorDoAfterTerminate.this.a.call();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaHooks.onError(th);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            try {
                this.f.onCompleted();
            } finally {
                b();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            try {
                this.f.onError(th);
            } finally {
                b();
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.f.onNext(t);
        }
    }

    public OperatorDoAfterTerminate(Action0 action0) {
        Objects.requireNonNull(action0, "Action can not be null");
        this.a = action0;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new a(subscriber, subscriber);
    }
}
