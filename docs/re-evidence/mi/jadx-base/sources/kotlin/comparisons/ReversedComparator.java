package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class ReversedComparator<T> implements Comparator<T> {

    @NotNull
    private final Comparator<T> comparator;

    public ReversedComparator(@NotNull Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.comparator = comparator;
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        return this.comparator.compare(t2, t);
    }

    @NotNull
    public final Comparator<T> getComparator() {
        return this.comparator;
    }

    @Override // java.util.Comparator
    @NotNull
    public final Comparator<T> reversed() {
        return this.comparator;
    }
}
