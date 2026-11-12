package rm1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lrm1/c;", "", "", "endTimeGMT", "", "average", "high", "low", "<init>", "(JLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f153538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f153539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f153540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f153541d;

    public c(long j8, Double d14, Double d15, Double d16) {
        this.f153538a = j8;
        this.f153539b = d14;
        this.f153540c = d15;
        this.f153541d = d16;
    }

    public static c a(c cVar, Double d14) {
        long j8 = cVar.f153538a;
        Double d15 = cVar.f153540c;
        Double d16 = cVar.f153541d;
        cVar.getClass();
        return new c(j8, d14, d15, d16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f153538a == cVar.f153538a && s.g(this.f153539b, cVar.f153539b) && s.g(this.f153540c, cVar.f153540c) && s.g(this.f153541d, cVar.f153541d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f153538a) * 31;
        Double d14 = this.f153539b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f153540c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f153541d;
        return iHashCode3 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RespirationAveragesEvent(endTimeGMT=");
        sb3.append(this.f153538a);
        sb3.append(", average=");
        sb3.append(this.f153539b);
        sn.a.p(this.f153540c, this.f153541d, ", high=", ", low=", sb3);
        sb3.append(")");
        return sb3.toString();
    }
}
