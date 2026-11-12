package yw1;

import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lyw1/r;", "Lyw1/p;", "", "totalSteps", "", "totalDistanceInMeters", "totalDistance", "", "totalTime", "totalCalories", "", "totalIntensityMins", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f199967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f199968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f199969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f199970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f199971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f199972f;

    public r(Integer num, Double d14, Double d15, String str, Double d16, Long l14) {
        super(null);
        this.f199967a = num;
        this.f199968b = d14;
        this.f199969c = d15;
        this.f199970d = str;
        this.f199971e = d16;
        this.f199972f = l14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p005kotlin.jvm.internal.s.g(this.f199967a, rVar.f199967a) && p005kotlin.jvm.internal.s.g(this.f199968b, rVar.f199968b) && p005kotlin.jvm.internal.s.g(this.f199969c, rVar.f199969c) && p005kotlin.jvm.internal.s.g(this.f199970d, rVar.f199970d) && p005kotlin.jvm.internal.s.g(this.f199971e, rVar.f199971e) && p005kotlin.jvm.internal.s.g(this.f199972f, rVar.f199972f);
    }

    public final int hashCode() {
        Integer num = this.f199967a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d14 = this.f199968b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f199969c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        String str = this.f199970d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Double d16 = this.f199971e;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Long l14 = this.f199972f;
        return iHashCode5 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = u0.m("FrogPerformanceStatsTotals(totalSteps=", this.f199967a, ", totalDistanceInMeters=", this.f199968b, ", totalDistance=");
        b71.i.u(sbM, this.f199969c, ", totalTime=", this.f199970d, ", totalCalories=");
        sbM.append(this.f199971e);
        sbM.append(", totalIntensityMins=");
        sbM.append(this.f199972f);
        sbM.append(")");
        return sbM.toString();
    }
}
