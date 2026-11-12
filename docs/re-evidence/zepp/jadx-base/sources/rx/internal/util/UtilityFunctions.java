package rx.internal.util;

import rx.functions.Func1;

/* JADX INFO: loaded from: classes23.dex */
public final class UtilityFunctions {

    public enum a implements Func1<Object, Boolean> {
        INSTANCE;

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj) {
            return Boolean.FALSE;
        }
    }

    public enum b implements Func1<Object, Boolean> {
        INSTANCE;

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Object obj) {
            return Boolean.TRUE;
        }
    }

    public enum c implements Func1<Object, Object> {
        INSTANCE;

        @Override // rx.functions.Func1
        public Object call(Object obj) {
            return obj;
        }
    }

    private UtilityFunctions() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Func1<? super T, Boolean> alwaysFalse() {
        return a.INSTANCE;
    }

    public static <T> Func1<? super T, Boolean> alwaysTrue() {
        return b.INSTANCE;
    }

    public static <T> Func1<T, T> identity() {
        return c.INSTANCE;
    }
}
