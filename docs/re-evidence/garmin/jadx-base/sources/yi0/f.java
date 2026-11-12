package yi0;

import j23.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyi0/f;", "", "Lj23/r;", "", "maleValues", "femaleValues", "<init>", "(Lj23/r;Lj23/r;)V", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r<Double> f197351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r<Double> f197352b;

    public f(r<Double> rVar, r<Double> rVar2) {
        rVar.getClass();
        rVar2.getClass();
        this.f197351a = rVar;
        this.f197352b = rVar2;
    }

    public final r<Double> a(boolean z14) {
        return z14 ? this.f197351a : this.f197352b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f197351a.equals(fVar.f197351a) && this.f197352b.equals(fVar.f197352b);
    }

    public final int hashCode() {
        return this.f197352b.hashCode() + (this.f197351a.hashCode() * 31);
    }

    public final String toString() {
        return "MaleFemaleRange(maleValues=" + this.f197351a + ", femaleValues=" + this.f197352b + ")";
    }
}
