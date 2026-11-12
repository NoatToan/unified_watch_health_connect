package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ResultKt {
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T> R a(Object obj, Function1<? super T, ? extends R> function1, Function1<? super Throwable, ? extends R> function2) {
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(obj);
        return thM3848exceptionOrNullimpl == null ? function1.invoke(obj) : function2.invoke(thM3848exceptionOrNullimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T extends R> R b(Object obj, R r) {
        return Result.m3850isFailureimpl(obj) ? r : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T extends R> R c(Object obj, Function1<? super Throwable, ? extends R> function1) {
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(obj);
        return thM3848exceptionOrNullimpl == null ? obj : function1.invoke(thM3848exceptionOrNullimpl);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static final Object createFailure(@NotNull Throwable th) {
        return new Result.Failure(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> T d(Object obj) {
        throwOnFailure(obj);
        return obj;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T> Object e(Object obj, Function1<? super T, ? extends R> function1) {
        if (!Result.m3851isSuccessimpl(obj)) {
            return Result.m3845constructorimpl(obj);
        }
        Result.Companion companion = Result.Companion;
        return Result.m3845constructorimpl(function1.invoke(obj));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T> Object f(Object obj, Function1<? super T, ? extends R> function1) {
        if (!Result.m3851isSuccessimpl(obj)) {
            return Result.m3845constructorimpl(obj);
        }
        try {
            Result.Companion companion = Result.Companion;
            return Result.m3845constructorimpl(function1.invoke(obj));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m3845constructorimpl(createFailure(th));
        }
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Object g(Object obj, Function1<? super Throwable, Unit> function1) {
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(obj);
        if (thM3848exceptionOrNullimpl != null) {
            function1.invoke(thM3848exceptionOrNullimpl);
        }
        return obj;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Object h(Object obj, Function1<? super T, Unit> function1) {
        if (Result.m3851isSuccessimpl(obj)) {
            function1.invoke(obj);
        }
        return obj;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T extends R> Object i(Object obj, Function1<? super Throwable, ? extends R> function1) {
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(obj);
        if (thM3848exceptionOrNullimpl == null) {
            return obj;
        }
        Result.Companion companion = Result.Companion;
        return Result.m3845constructorimpl(function1.invoke(thM3848exceptionOrNullimpl));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T extends R> Object j(Object obj, Function1<? super Throwable, ? extends R> function1) {
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(obj);
        if (thM3848exceptionOrNullimpl == null) {
            return obj;
        }
        try {
            Result.Companion companion = Result.Companion;
            return Result.m3845constructorimpl(function1.invoke(thM3848exceptionOrNullimpl));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m3845constructorimpl(createFailure(th));
        }
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T, R> Object k(T t, Function1<? super T, ? extends R> function1) {
        try {
            Result.Companion companion = Result.Companion;
            return Result.m3845constructorimpl(function1.invoke(t));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m3845constructorimpl(createFailure(th));
        }
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R> Object l(Function0<? extends R> function0) {
        try {
            Result.Companion companion = Result.Companion;
            return Result.m3845constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m3845constructorimpl(createFailure(th));
        }
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static final void throwOnFailure(@NotNull Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}
