package ns;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lns/l3;", "", "Lqs/a0;", "waterType", "", "waterDensity", "<init>", "(Lqs/a0;Ljava/lang/Double;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qs.a0 f127692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f127693b;

    public l3(qs.a0 a0Var, Double d14) {
        a0Var.getClass();
        this.f127692a = a0Var;
        this.f127693b = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return this.f127692a == l3Var.f127692a && p005kotlin.jvm.internal.s.g(this.f127693b, l3Var.f127693b);
    }

    public final int hashCode() {
        int iHashCode = this.f127692a.hashCode() * 31;
        Double d14 = this.f127693b;
        return iHashCode + (d14 == null ? 0 : d14.hashCode());
    }

    public final String toString() {
        return "WaterTypeMetric(waterType=" + this.f127692a + ", waterDensity=" + this.f127693b + ")";
    }

    public /* synthetic */ l3(qs.a0 a0Var, Double d14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(a0Var, (i14 & 2) != 0 ? null : d14);
    }
}
