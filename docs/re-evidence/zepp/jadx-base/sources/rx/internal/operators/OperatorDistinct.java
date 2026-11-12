package rx.internal.operators;

import java.util.HashSet;
import java.util.Set;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;
import rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorDistinct<T, U> implements Observable.Operator<T, T> {
    public final Func1<? super T, ? extends U> a;

    public class a extends Subscriber<T> {
        public Set<U> f;
        public final /* synthetic */ Subscriber g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.g = subscriber2;
            this.f = new HashSet();
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.f = null;
            this.g.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f = null;
            this.g.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.f.add(OperatorDistinct.this.a.call(t))) {
                this.g.onNext(t);
            } else {
                request(1L);
            }
        }
    }

    public static final class b {
        public static final OperatorDistinct<?, ?> a = new OperatorDistinct<>(UtilityFunctions.identity());
    }

    public OperatorDistinct(Func1<? super T, ? extends U> func1) {
        this.a = func1;
    }

    public static <T> OperatorDistinct<T, T> instance() {
        return (OperatorDistinct<T, T>) b.a;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new a(subscriber, subscriber);
    }
}
