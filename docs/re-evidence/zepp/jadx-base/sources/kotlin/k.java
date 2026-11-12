package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
class k {
    @InlineOnly
    private static final Void a() {
        throw new NotImplementedError(null, 1, null);
    }

    @InlineOnly
    private static final Void b(String str) {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", str));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> T c(T t, Function1<? super T, Unit> function1) {
        function1.invoke(t);
        return t;
    }

    @InlineOnly
    private static final <T> T d(T t, Function1<? super T, Unit> function1) {
        function1.invoke(t);
        return t;
    }

    @InlineOnly
    private static final <T, R> R e(T t, Function1<? super T, ? extends R> function1) {
        return function1.invoke(t);
    }

    @InlineOnly
    private static final void f(int i, Function1<? super Integer, Unit> function1) {
        for (int i2 = 0; i2 < i; i2++) {
            function1.invoke(Integer.valueOf(i2));
        }
    }

    @InlineOnly
    private static final <T, R> R g(T t, Function1<? super T, ? extends R> function1) {
        return function1.invoke(t);
    }

    @InlineOnly
    private static final <R> R h(Function0<? extends R> function0) {
        return function0.invoke();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> T i(T t, Function1<? super T, Boolean> function1) {
        if (function1.invoke(t).booleanValue()) {
            return t;
        }
        return null;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> T j(T t, Function1<? super T, Boolean> function1) {
        if (function1.invoke(t).booleanValue()) {
            return null;
        }
        return t;
    }

    @InlineOnly
    private static final <T, R> R k(T t, Function1<? super T, ? extends R> function1) {
        return function1.invoke(t);
    }
}
