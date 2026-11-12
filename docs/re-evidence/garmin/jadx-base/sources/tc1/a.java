package tc1;

import b71.i;
import kg.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ltc1/a;", "", "", "calendarDate", "", "predictedRaceTime", "projectionRaceTime", "upperBoundProjectionRaceTime", "lowerBoundProjectionRaceTime", "feedBackPhrase", "", "speedPrediction", "speedProjection", "upperBoundProjectionRaceSpeed", "lowerBoundProjectionRaceSpeed", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f163812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f163813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f163814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f163815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f163816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f163817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f163818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Double f163819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Double f163820j;

    public a(String str, Long l14, Long l15, Long l16, Long l17, String str2, Double d14, Double d15, Double d16, Double d17) {
        this.f163811a = str;
        this.f163812b = l14;
        this.f163813c = l15;
        this.f163814d = l16;
        this.f163815e = l17;
        this.f163816f = str2;
        this.f163817g = d14;
        this.f163818h = d15;
        this.f163819i = d16;
        this.f163820j = d17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f163811a, aVar.f163811a) && s.g(this.f163812b, aVar.f163812b) && s.g(this.f163813c, aVar.f163813c) && s.g(this.f163814d, aVar.f163814d) && s.g(this.f163815e, aVar.f163815e) && s.g(this.f163816f, aVar.f163816f) && s.g(this.f163817g, aVar.f163817g) && s.g(this.f163818h, aVar.f163818h) && s.g(this.f163819i, aVar.f163819i) && s.g(this.f163820j, aVar.f163820j);
    }

    public final int hashCode() {
        String str = this.f163811a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l14 = this.f163812b;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f163813c;
        int iHashCode3 = (iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.f163814d;
        int iHashCode4 = (iHashCode3 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.f163815e;
        int iHashCode5 = (iHashCode4 + (l17 == null ? 0 : l17.hashCode())) * 31;
        String str2 = this.f163816f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this.f163817g;
        int iHashCode7 = (iHashCode6 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f163818h;
        int iHashCode8 = (iHashCode7 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f163819i;
        int iHashCode9 = (iHashCode8 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f163820j;
        return iHashCode9 + (d17 != null ? d17.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RaceTimePredictionMetrics(calendarDate=");
        sb3.append(this.f163811a);
        sb3.append(", predictedRaceTime=");
        sb3.append(this.f163812b);
        sb3.append(", projectionRaceTime=");
        f.s(sb3, this.f163813c, ", upperBoundProjectionRaceTime=", this.f163814d, ", lowerBoundProjectionRaceTime=");
        i.q(this.f163815e, ", feedBackPhrase=", this.f163816f, ", speedPrediction=", sb3);
        i.p(this.f163817g, this.f163818h, ", speedProjection=", ", upperBoundProjectionRaceSpeed=", sb3);
        return sn.a.f(this.f163819i, this.f163820j, ", lowerBoundProjectionRaceSpeed=", ")", sb3);
    }
}
