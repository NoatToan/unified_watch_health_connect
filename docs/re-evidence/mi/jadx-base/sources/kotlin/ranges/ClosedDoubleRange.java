package kotlin.ranges;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class ClosedDoubleRange implements ClosedFloatingPointRange<Double> {
    private final double _endInclusive;
    private final double _start;

    public ClosedDoubleRange(double d, double d2) {
        this._start = d;
        this._endInclusive = d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).doubleValue());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ClosedDoubleRange) {
            if (!isEmpty() || !((ClosedDoubleRange) obj).isEmpty()) {
                ClosedDoubleRange closedDoubleRange = (ClosedDoubleRange) obj;
                if (this._start != closedDoubleRange._start || this._endInclusive != closedDoubleRange._endInclusive) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this._start) * 31) + Double.hashCode(this._endInclusive);
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return this._start > this._endInclusive;
    }

    public boolean lessThanOrEquals(double d, double d2) {
        return d <= d2;
    }

    @NotNull
    public String toString() {
        return this._start + ".." + this._endInclusive;
    }

    public boolean contains(double d) {
        return d >= this._start && d <= this._endInclusive;
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public Double getEndInclusive() {
        return Double.valueOf(this._endInclusive);
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public Double getStart() {
        return Double.valueOf(this._start);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return lessThanOrEquals(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }
}
