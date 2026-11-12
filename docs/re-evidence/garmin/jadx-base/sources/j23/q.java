package j23;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj23/q;", "Lj23/r;", "", TtmlNode.START, "endExclusive", "<init>", "(FF)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q implements r<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f96815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f96816b;

    public q(float f14, float f15) {
        this.f96815a = f14;
        this.f96816b = f15;
    }

    @Override // j23.r
    public final Comparable c() {
        return Float.valueOf(this.f96816b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j23.r
    public final boolean contains(Comparable comparable) {
        float fFloatValue = ((Number) comparable).floatValue();
        return fFloatValue >= this.f96815a && fFloatValue < this.f96816b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        float f14 = this.f96815a;
        float f15 = this.f96816b;
        if (f14 >= f15) {
            q qVar = (q) obj;
            if (qVar.f96815a >= qVar.f96816b) {
                return true;
            }
        }
        q qVar2 = (q) obj;
        return f14 == qVar2.f96815a && f15 == qVar2.f96816b;
    }

    @Override // j23.r
    public final Comparable getStart() {
        return Float.valueOf(this.f96815a);
    }

    public final int hashCode() {
        float f14 = this.f96815a;
        float f15 = this.f96816b;
        if (f14 >= f15) {
            return -1;
        }
        return Float.hashCode(f15) + (Float.hashCode(f14) * 31);
    }

    public final String toString() {
        return this.f96815a + "..<" + this.f96816b;
    }
}
