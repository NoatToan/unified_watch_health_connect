package z80;

import gg1.o0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lz80/n;", "", "", "weightInGrams", "Lgg1/o0;", "measurementSystemEnum", "Lz80/k;", "userGender", "<init>", "(DLgg1/o0;Lz80/k;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f203089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f203090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f203091c;

    public n(double d14, o0 o0Var, k kVar) {
        o0Var.getClass();
        this.f203089a = d14;
        this.f203090b = o0Var;
        this.f203091c = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Double.compare(this.f203089a, nVar.f203089a) == 0 && this.f203090b == nVar.f203090b && this.f203091c == nVar.f203091c;
    }

    public final int hashCode() {
        int iHashCode = (this.f203090b.hashCode() + (Double.hashCode(this.f203089a) * 31)) * 31;
        k kVar = this.f203091c;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        return "WeightRouteData(weightInGrams=" + this.f203089a + ", measurementSystemEnum=" + this.f203090b + ", userGender=" + this.f203091c + ")";
    }
}
