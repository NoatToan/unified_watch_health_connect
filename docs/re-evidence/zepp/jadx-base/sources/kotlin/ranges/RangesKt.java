package kotlin.ranges;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class RangesKt extends e {
    private RangesKt() {
    }

    @NotNull
    public static /* bridge */ /* synthetic */ <T extends Comparable<? super T>> T coerceAtLeast(@NotNull T t, @NotNull T t2) {
        return (T) e.coerceAtLeast(t, t2);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ <T extends Comparable<? super T>> T coerceIn(@NotNull T t, @Nullable T t2, @Nullable T t3) {
        return (T) e.coerceIn(t, t2, t3);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static /* bridge */ /* synthetic */ <T extends Comparable<? super T>> T coerceIn(@NotNull T t, @NotNull ClosedFloatingPointRange<T> closedFloatingPointRange) {
        return (T) e.coerceIn((Comparable) t, (ClosedFloatingPointRange) closedFloatingPointRange);
    }
}
