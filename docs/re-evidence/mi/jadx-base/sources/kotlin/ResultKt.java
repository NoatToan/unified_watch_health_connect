package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\nkotlin/ResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
public final class ResultKt {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static final Object createFailure(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new Result.Failure(exception);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T> R fold(Object obj, Function1<? super T, ? extends R> onSuccess, Function1<? super Throwable, ? extends R> onFailure) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(obj);
        return thM889exceptionOrNullimpl == null ? onSuccess.invoke(obj) : onFailure.invoke(thM889exceptionOrNullimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T extends R> R getOrDefault(Object obj, R r2) {
        return Result.m892isFailureimpl(obj) ? r2 : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T extends R> R getOrElse(Object obj, Function1<? super Throwable, ? extends R> onFailure) {
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(obj);
        return thM889exceptionOrNullimpl == null ? obj : onFailure.invoke(thM889exceptionOrNullimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> T getOrThrow(Object obj) {
        throwOnFailure(obj);
        return obj;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T> Object map(Object obj, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        return Result.m893isSuccessimpl(obj) ? Result.m886constructorimpl(transform.invoke(obj)) : Result.m886constructorimpl(obj);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T> Object mapCatching(Object obj, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (!Result.m893isSuccessimpl(obj)) {
            return Result.m886constructorimpl(obj);
        }
        try {
            return Result.m886constructorimpl(transform.invoke(obj));
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            return Result.m886constructorimpl(createFailure(th));
        }
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Object onFailure(Object obj, Function1<? super Throwable, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(obj);
        if (thM889exceptionOrNullimpl != null) {
            action.invoke(thM889exceptionOrNullimpl);
        }
        return obj;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Object onSuccess(Object obj, Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (Result.m893isSuccessimpl(obj)) {
            action.invoke(obj);
        }
        return obj;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T extends R> Object recover(Object obj, Function1<? super Throwable, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(obj);
        return thM889exceptionOrNullimpl == null ? obj : Result.m886constructorimpl(transform.invoke(thM889exceptionOrNullimpl));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T extends R> Object recoverCatching(Object obj, Function1<? super Throwable, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(obj);
        if (thM889exceptionOrNullimpl == null) {
            return obj;
        }
        try {
            return Result.m886constructorimpl(transform.invoke(thM889exceptionOrNullimpl));
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            return Result.m886constructorimpl(createFailure(th));
        }
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R> Object runCatching(Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.Companion;
            return Result.m886constructorimpl(block.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m886constructorimpl(createFailure(th));
        }
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static final void throwOnFailure(@NotNull Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T, R> Object runCatching(T t, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.Companion;
            return Result.m886constructorimpl(block.invoke(t));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m886constructorimpl(createFailure(th));
        }
    }
}
