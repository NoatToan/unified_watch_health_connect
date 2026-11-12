package j23;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj23/p;", "Lj23/r;", "", TtmlNode.START, "endExclusive", "<init>", "(DD)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements r<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f96813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f96814b;

    public p(double d14, double d15) {
        this.f96813a = d14;
        this.f96814b = d15;
    }

    @Override // j23.r
    public final Comparable c() {
        return Double.valueOf(this.f96814b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j23.r
    public final boolean contains(Comparable comparable) {
        double dDoubleValue = ((Number) comparable).doubleValue();
        return dDoubleValue >= this.f96813a && dDoubleValue < this.f96814b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        double d14 = this.f96813a;
        double d15 = this.f96814b;
        if (d14 >= d15) {
            p pVar = (p) obj;
            if (pVar.f96813a >= pVar.f96814b) {
                return true;
            }
        }
        p pVar2 = (p) obj;
        return d14 == pVar2.f96813a && d15 == pVar2.f96814b;
    }

    @Override // j23.r
    public final Comparable getStart() {
        return Double.valueOf(this.f96813a);
    }

    public final int hashCode() {
        double d14 = this.f96813a;
        double d15 = this.f96814b;
        if (d14 >= d15) {
            return -1;
        }
        return Double.hashCode(d15) + (Double.hashCode(d14) * 31);
    }

    public final String toString() {
        return this.f96813a + "..<" + this.f96814b;
    }
}
