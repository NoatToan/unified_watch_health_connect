package cy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcy0/i;", "", "", "wellnessMaxAvgHR", "avgRestingHr", "", "restingCaloriesAverage", "activeCaloriesAverage", "totalCaloriesAverage", "averageSleepScore", "meanAvgHeartRate", "averageRestingHeartRate", "", "averageBodyBatteryChange", "averageSpO2", "averageRespiration", "averageSkinTempC", "averageSkinTempF", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f56721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f56722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f56723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Float f56724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Float f56725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f56726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f56727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f56728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f56729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Double f56730j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Double f56731k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f56732l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Double f56733m;

    public i(Double d14, Double d15, Float f14, Float f15, Float f16, Double d16, Double d17, Double d18, Integer num, Double d19, Double d24, Double d25, Double d26) {
        this.f56721a = d14;
        this.f56722b = d15;
        this.f56723c = f14;
        this.f56724d = f15;
        this.f56725e = f16;
        this.f56726f = d16;
        this.f56727g = d17;
        this.f56728h = d18;
        this.f56729i = num;
        this.f56730j = d19;
        this.f56731k = d24;
        this.f56732l = d25;
        this.f56733m = d26;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.f56721a, iVar.f56721a) && p005kotlin.jvm.internal.s.g(this.f56722b, iVar.f56722b) && p005kotlin.jvm.internal.s.g(this.f56723c, iVar.f56723c) && p005kotlin.jvm.internal.s.g(this.f56724d, iVar.f56724d) && p005kotlin.jvm.internal.s.g(this.f56725e, iVar.f56725e) && p005kotlin.jvm.internal.s.g(this.f56726f, iVar.f56726f) && p005kotlin.jvm.internal.s.g(this.f56727g, iVar.f56727g) && p005kotlin.jvm.internal.s.g(this.f56728h, iVar.f56728h) && p005kotlin.jvm.internal.s.g(this.f56729i, iVar.f56729i) && p005kotlin.jvm.internal.s.g(this.f56730j, iVar.f56730j) && p005kotlin.jvm.internal.s.g(this.f56731k, iVar.f56731k) && p005kotlin.jvm.internal.s.g(this.f56732l, iVar.f56732l) && p005kotlin.jvm.internal.s.g(this.f56733m, iVar.f56733m);
    }

    public final int hashCode() {
        Double d14 = this.f56721a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.f56722b;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Float f14 = this.f56723c;
        int iHashCode3 = (iHashCode2 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.f56724d;
        int iHashCode4 = (iHashCode3 + (f15 == null ? 0 : f15.hashCode())) * 31;
        Float f16 = this.f56725e;
        int iHashCode5 = (iHashCode4 + (f16 == null ? 0 : f16.hashCode())) * 31;
        Double d16 = this.f56726f;
        int iHashCode6 = (iHashCode5 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f56727g;
        int iHashCode7 = (iHashCode6 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.f56728h;
        int iHashCode8 = (iHashCode7 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Integer num = this.f56729i;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Double d19 = this.f56730j;
        int iHashCode10 = (iHashCode9 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.f56731k;
        int iHashCode11 = (iHashCode10 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.f56732l;
        int iHashCode12 = (iHashCode11 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.f56733m;
        return iHashCode12 + (d26 != null ? d26.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = tn.k.i("HealthStatsDTO(wellnessMaxAvgHR=", this.f56721a, this.f56722b, ", avgRestingHr=", ", restingCaloriesAverage=");
        sbI.append(this.f56723c);
        sbI.append(", activeCaloriesAverage=");
        sbI.append(this.f56724d);
        sbI.append(", totalCaloriesAverage=");
        sbI.append(this.f56725e);
        sbI.append(", averageSleepScore=");
        sbI.append(this.f56726f);
        sbI.append(", meanAvgHeartRate=");
        b71.i.p(this.f56727g, this.f56728h, ", averageRestingHeartRate=", ", averageBodyBatteryChange=", sbI);
        b71.i.v(sbI, this.f56729i, ", averageSpO2=", this.f56730j, ", averageRespiration=");
        b71.i.p(this.f56731k, this.f56732l, ", averageSkinTempC=", ", averageSkinTempF=", sbI);
        return b71.i.g(sbI, this.f56733m, ")");
    }
}
