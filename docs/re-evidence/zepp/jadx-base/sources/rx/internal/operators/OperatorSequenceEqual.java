package rx.internal.operators;

import rx.Observable;
import rx.functions.Func2;
import rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorSequenceEqual {
    public static final Object a = new Object();

    public static class a implements Func2<Object, Object, Boolean> {
        public final /* synthetic */ Func2 a;

        public a(Func2 func2) {
            this.a = func2;
        }

        @Override // rx.functions.Func2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj, Object obj2) {
            Object obj3 = OperatorSequenceEqual.a;
            boolean z = obj == obj3;
            boolean z2 = obj2 == obj3;
            if (z && z2) {
                return Boolean.TRUE;
            }
            return (z || z2) ? Boolean.FALSE : (Boolean) this.a.call(obj, obj2);
        }
    }

    private OperatorSequenceEqual() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Observable<Object> a(Observable<T> observable) {
        return Observable.concat(observable, Observable.just(a));
    }

    public static <T> Observable<Boolean> sequenceEqual(Observable<? extends T> observable, Observable<? extends T> observable2, Func2<? super T, ? super T, Boolean> func2) {
        return Observable.zip(a(observable), a(observable2), new a(func2)).all(UtilityFunctions.identity());
    }
}
