package b11;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb11/o;", "", "Ls21/n;", "micronutrientSettings", "", "consumed", "<init>", "(Ls21/n;Ljava/lang/Double;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s21.n f14356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f14357b;

    public o(s21.n nVar, Double d14) {
        nVar.getClass();
        this.f14356a = nVar;
        this.f14357b = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f14356a.equals(oVar.f14356a) && p005kotlin.jvm.internal.s.g(this.f14357b, oVar.f14357b);
    }

    public final int hashCode() {
        int iHashCode = this.f14356a.hashCode() * 31;
        Double d14 = this.f14357b;
        return iHashCode + (d14 == null ? 0 : d14.hashCode());
    }

    public final String toString() {
        return "MicronutrientEntry(micronutrientSettings=" + this.f14356a + ", consumed=" + this.f14357b + ")";
    }
}
