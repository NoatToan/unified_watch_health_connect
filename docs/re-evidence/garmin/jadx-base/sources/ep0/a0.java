package ep0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lep0/a0;", "", "", "progressValue", "targetValue", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f64859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f64860b;

    public a0(Double d14, Double d15) {
        this.f64859a = d14;
        this.f64860b = d15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return p005kotlin.jvm.internal.s.g(this.f64859a, a0Var.f64859a) && p005kotlin.jvm.internal.s.g(this.f64860b, a0Var.f64860b);
    }

    public final int hashCode() {
        Double d14 = this.f64859a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.f64860b;
        return iHashCode + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        return "Progress(progressValue=" + this.f64859a + ", targetValue=" + this.f64860b + ")";
    }
}
