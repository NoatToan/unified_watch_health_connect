package kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SinceKotlin(version = "1.3")
@RestrictsSuspension
public abstract class SequenceScope<T> {
    @Nullable
    public abstract Object yield(T t, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    public final Object yieldAll(@NotNull Iterable<? extends T> iterable, @NotNull Continuation<? super Unit> continuation) {
        Object objYieldAll;
        return (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) && (objYieldAll = yieldAll(iterable.iterator(), continuation)) == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objYieldAll : Unit.INSTANCE;
    }

    @Nullable
    public abstract Object yieldAll(@NotNull Iterator<? extends T> it, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    public final Object yieldAll(@NotNull Sequence<? extends T> sequence, @NotNull Continuation<? super Unit> continuation) {
        Object objYieldAll = yieldAll(sequence.iterator(), continuation);
        return objYieldAll == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objYieldAll : Unit.INSTANCE;
    }
}
