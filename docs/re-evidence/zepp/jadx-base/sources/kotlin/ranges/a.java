package kotlin.ranges;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
final class a implements ClosedFloatingPointRange<Double> {
    private final double a;
    private final double b;

    public a(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public boolean a(double d) {
        return d >= this.a && d <= this.b;
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Double getEndInclusive() {
        return Double.valueOf(this.b);
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Double getStart() {
        return Double.valueOf(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return a(((Number) comparable).doubleValue());
    }

    public boolean d(double d, double d2) {
        return d <= d2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof a) {
            if (isEmpty() && ((a) obj).isEmpty()) {
                return true;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a) {
                if (this.b == aVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.valueOf(this.a).hashCode() * 31) + Double.valueOf(this.b).hashCode();
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return this.a > this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return d(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    @NotNull
    public String toString() {
        return this.a + ".." + this.b;
    }
}
