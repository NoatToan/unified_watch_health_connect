package e50;

import am.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Le50/i;", "", "", "distance", "", "unpavedPercentage", "unpavedDistance", "highTrafficPercentage", "highTrafficDistance", "elevationGain", "elevationLoss", "minElevation", "maxElevation", "", "useMetricSystem", "hazards", "<init>", "(DLjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;DDDDZLjava/lang/Integer;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f63034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f63035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f63036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f63037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f63038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f63039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f63040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f63041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f63042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f63043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f63044k;

    public i(double d14, Integer num, Double d15, Integer num2, Double d16, double d17, double d18, double d19, double d24, boolean z14, Integer num3) {
        this.f63034a = d14;
        this.f63035b = num;
        this.f63036c = d15;
        this.f63037d = num2;
        this.f63038e = d16;
        this.f63039f = d17;
        this.f63040g = d18;
        this.f63041h = d19;
        this.f63042i = d24;
        this.f63043j = z14;
        this.f63044k = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Double.compare(this.f63034a, iVar.f63034a) == 0 && s.g(this.f63035b, iVar.f63035b) && s.g(this.f63036c, iVar.f63036c) && s.g(this.f63037d, iVar.f63037d) && s.g(this.f63038e, iVar.f63038e) && Double.compare(this.f63039f, iVar.f63039f) == 0 && Double.compare(this.f63040g, iVar.f63040g) == 0 && Double.compare(this.f63041h, iVar.f63041h) == 0 && Double.compare(this.f63042i, iVar.f63042i) == 0 && this.f63043j == iVar.f63043j && s.g(this.f63044k, iVar.f63044k);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f63034a) * 31;
        Integer num = this.f63035b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.f63036c;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Integer num2 = this.f63037d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d15 = this.f63038e;
        int iG = q6.f.g(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31, 31, this.f63039f), 31, this.f63040g), 31, this.f63041h), 31, this.f63042i), 31, this.f63043j);
        Integer num3 = this.f63044k;
        return iG + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CourseStatsUIState(distance=");
        sb3.append(this.f63034a);
        sb3.append(", unpavedPercentage=");
        sb3.append(this.f63035b);
        sb3.append(", unpavedDistance=");
        sb3.append(this.f63036c);
        sb3.append(", highTrafficPercentage=");
        sb3.append(this.f63037d);
        sb3.append(", highTrafficDistance=");
        sb3.append(this.f63038e);
        sb3.append(", elevationGain=");
        sb3.append(this.f63039f);
        j.x(sb3, ", elevationLoss=", this.f63040g, ", minElevation=");
        sb3.append(this.f63041h);
        j.x(sb3, ", maxElevation=", this.f63042i, ", useMetricSystem=");
        sb3.append(this.f63043j);
        sb3.append(", hazards=");
        sb3.append(this.f63044k);
        sb3.append(")");
        return sb3.toString();
    }
}
