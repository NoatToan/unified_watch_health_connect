package ps;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lps/g0;", "", "", "firstValue", "secondValue", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f139822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f139823b;

    public g0(Double d14, Double d15) {
        this.f139822a = d14;
        this.f139823b = d15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return p005kotlin.jvm.internal.s.g(this.f139822a, g0Var.f139822a) && p005kotlin.jvm.internal.s.g(this.f139823b, g0Var.f139823b);
    }

    public final int hashCode() {
        Double d14 = this.f139822a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.f139823b;
        return iHashCode + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        return "CyclingMetric(firstValue=" + this.f139822a + ", secondValue=" + this.f139823b + ")";
    }
}
