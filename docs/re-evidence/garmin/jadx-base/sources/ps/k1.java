package ps;

import c22.o3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lps/k1;", "", "", "metricValue", "Lc22/o3;", "unit", "<init>", "(Ljava/lang/Double;Lc22/o3;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f139897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o3 f139898b;

    public /* synthetic */ k1(Double d14, o3 o3Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : o3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return p005kotlin.jvm.internal.s.g(this.f139897a, k1Var.f139897a) && this.f139898b == k1Var.f139898b;
    }

    public final int hashCode() {
        Double d14 = this.f139897a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        o3 o3Var = this.f139898b;
        return iHashCode + (o3Var != null ? o3Var.hashCode() : 0);
    }

    public final String toString() {
        return "PressureValueUnitMetric(metricValue=" + this.f139897a + ", unit=" + this.f139898b + ")";
    }

    public k1(Double d14, o3 o3Var) {
        this.f139897a = d14;
        this.f139898b = o3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k1() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
