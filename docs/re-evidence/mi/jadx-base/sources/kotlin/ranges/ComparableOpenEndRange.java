package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
class ComparableOpenEndRange<T extends Comparable<? super T>> implements OpenEndRange<T> {

    @NotNull
    private final T endExclusive;

    @NotNull
    private final T start;

    public ComparableOpenEndRange(@NotNull T start, @NotNull T endExclusive) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(endExclusive, "endExclusive");
        this.start = start;
        this.endExclusive = endExclusive;
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean contains(@NotNull T t) {
        return OpenEndRange.DefaultImpls.contains(this, t);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ComparableOpenEndRange) {
            if (!isEmpty() || !((ComparableOpenEndRange) obj).isEmpty()) {
                ComparableOpenEndRange comparableOpenEndRange = (ComparableOpenEndRange) obj;
                if (!Intrinsics.areEqual(getStart(), comparableOpenEndRange.getStart()) || !Intrinsics.areEqual(getEndExclusive(), comparableOpenEndRange.getEndExclusive())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    @NotNull
    public T getEndExclusive() {
        return this.endExclusive;
    }

    @Override // kotlin.ranges.OpenEndRange
    @NotNull
    public T getStart() {
        return this.start;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + getEndExclusive().hashCode();
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return OpenEndRange.DefaultImpls.isEmpty(this);
    }

    @NotNull
    public String toString() {
        return getStart() + "..<" + getEndExclusive();
    }
}
