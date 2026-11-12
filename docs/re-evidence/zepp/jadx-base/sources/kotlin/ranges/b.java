package kotlin.ranges;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
final class b implements ClosedFloatingPointRange<Float> {
    private final float a;
    private final float b;

    public b(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public boolean a(float f) {
        return f >= this.a && f <= this.b;
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float getEndInclusive() {
        return Float.valueOf(this.b);
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float getStart() {
        return Float.valueOf(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return a(((Number) comparable).floatValue());
    }

    public boolean d(float f, float f2) {
        return f <= f2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof b) {
            if (isEmpty() && ((b) obj).isEmpty()) {
                return true;
            }
            b bVar = (b) obj;
            if (this.a == bVar.a) {
                if (this.b == bVar.b) {
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
        return (Float.valueOf(this.a).hashCode() * 31) + Float.valueOf(this.b).hashCode();
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return this.a > this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return d(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    @NotNull
    public String toString() {
        return this.a + ".." + this.b;
    }
}
