package kotlin.comparisons;

import java.util.Comparator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
final class e<T> implements Comparator<T> {

    @NotNull
    private final Comparator<T> a;

    public e(@NotNull Comparator<T> comparator) {
        this.a = comparator;
    }

    @NotNull
    public final Comparator<T> a() {
        return this.a;
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        return this.a.compare(t2, t);
    }

    @Override // java.util.Comparator
    @NotNull
    public final Comparator<T> reversed() {
        return this.a;
    }
}
