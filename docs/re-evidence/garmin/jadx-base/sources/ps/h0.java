package ps;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lps/h0;", "", "", "metricValue", "Lps/z1;", "unit", "<init>", "(Ljava/lang/Double;Lps/z1;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f139838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f139839b;

    static {
        z1.Companion companion = z1.INSTANCE;
    }

    public /* synthetic */ h0(Double d14, z1 z1Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : z1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return p005kotlin.jvm.internal.s.g(this.f139838a, h0Var.f139838a) && p005kotlin.jvm.internal.s.g(this.f139839b, h0Var.f139839b);
    }

    public final int hashCode() {
        Double d14 = this.f139838a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        z1 z1Var = this.f139839b;
        return iHashCode + (z1Var != null ? z1Var.hashCode() : 0);
    }

    public final String toString() {
        return "DefaultValueUnitMetric(metricValue=" + this.f139838a + ", unit=" + this.f139839b + ")";
    }

    public h0(Double d14, z1 z1Var) {
        this.f139838a = d14;
        this.f139839b = z1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
