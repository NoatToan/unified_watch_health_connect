package j23;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj23/d;", "Lj23/f;", "", TtmlNode.START, "endInclusive", "<init>", "(DD)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements f<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f96787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f96788b;

    public d(double d14, double d15) {
        this.f96787a = d14;
        this.f96788b = d15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j23.f
    public final boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).doubleValue() <= ((Number) comparable2).doubleValue();
    }

    @Override // j23.g
    public final Comparable b() {
        return Double.valueOf(this.f96788b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j23.g
    public final boolean contains(Comparable comparable) {
        double dDoubleValue = ((Number) comparable).doubleValue();
        return dDoubleValue >= this.f96787a && dDoubleValue <= this.f96788b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        double d14 = this.f96787a;
        double d15 = this.f96788b;
        if (d14 > d15) {
            d dVar = (d) obj;
            if (dVar.f96787a > dVar.f96788b) {
                return true;
            }
        }
        d dVar2 = (d) obj;
        return d14 == dVar2.f96787a && d15 == dVar2.f96788b;
    }

    @Override // j23.g, j23.r
    public final Comparable getStart() {
        return Double.valueOf(this.f96787a);
    }

    public final int hashCode() {
        double d14 = this.f96787a;
        double d15 = this.f96788b;
        if (d14 > d15) {
            return -1;
        }
        return Double.hashCode(d15) + (Double.hashCode(d14) * 31);
    }

    @Override // j23.g
    public final boolean isEmpty() {
        return this.f96787a > this.f96788b;
    }

    public final String toString() {
        return this.f96787a + CallerDataConverter.DEFAULT_RANGE_DELIMITER + this.f96788b;
    }
}
