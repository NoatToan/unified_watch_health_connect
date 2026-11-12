package rm1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lrm1/f;", "", "", "value", "", "startGMT", "deviationCelsius", "deviationFahrenheit", "<init>", "(Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f153555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f153556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f153557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f153558d;

    public f(Double d14, Long l14, Double d15, Double d16) {
        this.f153555a = d14;
        this.f153556b = l14;
        this.f153557c = d15;
        this.f153558d = d16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f153555a, fVar.f153555a) && s.g(this.f153556b, fVar.f153556b) && s.g(this.f153557c, fVar.f153557c) && s.g(this.f153558d, fVar.f153558d);
    }

    public final int hashCode() {
        Double d14 = this.f153555a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Long l14 = this.f153556b;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Double d15 = this.f153557c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f153558d;
        return iHashCode3 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SkinTempEpoch(value=");
        sb3.append(this.f153555a);
        sb3.append(", startGMT=");
        sb3.append(this.f153556b);
        sb3.append(", deviationCelsius=");
        return sn.a.f(this.f153557c, this.f153558d, ", deviationFahrenheit=", ")", sb3);
    }
}
