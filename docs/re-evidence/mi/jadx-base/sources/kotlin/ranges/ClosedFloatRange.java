package kotlin.ranges;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class ClosedFloatRange implements ClosedFloatingPointRange<Float> {
    private final float _endInclusive;
    private final float _start;

    public ClosedFloatRange(float f, float f2) {
        this._start = f;
        this._endInclusive = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).floatValue());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ClosedFloatRange) {
            if (!isEmpty() || !((ClosedFloatRange) obj).isEmpty()) {
                ClosedFloatRange closedFloatRange = (ClosedFloatRange) obj;
                if (this._start != closedFloatRange._start || this._endInclusive != closedFloatRange._endInclusive) {
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
        return (Float.hashCode(this._start) * 31) + Float.hashCode(this._endInclusive);
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return this._start > this._endInclusive;
    }

    public boolean lessThanOrEquals(float f, float f2) {
        return f <= f2;
    }

    @NotNull
    public String toString() {
        return this._start + ".." + this._endInclusive;
    }

    public boolean contains(float f) {
        return f >= this._start && f <= this._endInclusive;
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public Float getEndInclusive() {
        return Float.valueOf(this._endInclusive);
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public Float getStart() {
        return Float.valueOf(this._start);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return lessThanOrEquals(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }
}
