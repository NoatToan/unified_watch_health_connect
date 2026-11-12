package kotlin.ranges;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class d {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Ljava/lang/Iterable<+TT;>;:Lkotlin/ranges/ClosedRange<TT;>;>(TR;TT;)Z */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean a(Iterable iterable, Object obj) {
        return obj != null && ((ClosedRange) iterable).contains((Comparable) obj);
    }

    public static final void checkStepIsPositive(boolean z, @NotNull Number number) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    @NotNull
    public static final <T extends Comparable<? super T>> ClosedRange<T> rangeTo(@NotNull T t, @NotNull T t2) {
        return new c(t, t2);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final ClosedFloatingPointRange<Double> rangeTo(double d, double d2) {
        return new a(d, d2);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static ClosedFloatingPointRange<Float> rangeTo(float f, float f2) {
        return new b(f, f2);
    }
}
