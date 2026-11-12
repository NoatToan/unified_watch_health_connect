package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.functions.Func2;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorSkipWhile<T> implements Observable.Operator<T, T> {
    public final Func2<? super T, Integer, Boolean> a;

    public class a extends Subscriber<T> {
        public boolean f;
        public int g;
        public final /* synthetic */ Subscriber h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.h = subscriber2;
            this.f = true;
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
            if (!this.f) {
                this.h.onNext(t);
                return;
            }
            try {
                Func2<? super T, Integer, Boolean> func2 = OperatorSkipWhile.this.a;
                int i = this.g;
                this.g = i + 1;
                if (func2.call(t, Integer.valueOf(i)).booleanValue()) {
                    request(1L);
                } else {
                    this.f = false;
                    this.h.onNext(t);
                }
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this.h, t);
            }
        }
    }

    public static class b implements Func2<T, Integer, Boolean> {
        public final /* synthetic */ Func1 a;

        public b(Func1 func1) {
            this.a = func1;
        }

        @Override // rx.functions.Func2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(T t, Integer num) {
            return (Boolean) this.a.call(t);
        }
    }

    public OperatorSkipWhile(Func2<? super T, Integer, Boolean> func2) {
        this.a = func2;
    }

    public static <T> Func2<T, Integer, Boolean> toPredicate2(Func1<? super T, Boolean> func1) {
        return new b(func1);
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new a(subscriber, subscriber);
    }
}
