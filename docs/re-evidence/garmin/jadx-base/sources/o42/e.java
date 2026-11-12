package o42;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo42/e;", "", "Lyz1/d;", "status", "", "lastWeight", "lastWeightDelta", "", "lastWeightTimestamp", "weightGoal", "bmi", "highWeightGoalInGrams", "lowWeightGoalInGrams", "<init>", "(Lyz1/d;Ljava/lang/Double;Ljava/lang/Double;JLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f129082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f129083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f129084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f129085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f129086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f129087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f129088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f129089h;

    public /* synthetic */ e(yz1.d dVar, Double d14, Double d15, long j8, Double d16, Double d17, Double d18, Double d19, int i14, j jVar) {
        this(dVar, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, j8, (i14 & 16) != 0 ? null : d16, (i14 & 32) != 0 ? null : d17, (i14 & 64) != 0 ? null : d18, (i14 & 128) != 0 ? null : d19);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f129082a, eVar.f129082a) && s.g(this.f129083b, eVar.f129083b) && s.g(this.f129084c, eVar.f129084c) && this.f129085d == eVar.f129085d && s.g(this.f129086e, eVar.f129086e) && s.g(this.f129087f, eVar.f129087f) && s.g(this.f129088g, eVar.f129088g) && s.g(this.f129089h, eVar.f129089h);
    }

    public final int hashCode() {
        int iHashCode = this.f129082a.hashCode() * 31;
        Double d14 = this.f129083b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f129084c;
        int iE = f.e((iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31, 31, this.f129085d);
        Double d16 = this.f129086e;
        int iHashCode3 = (iE + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f129087f;
        int iHashCode4 = (iHashCode3 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.f129088g;
        int iHashCode5 = (iHashCode4 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.f129089h;
        return iHashCode5 + (d19 != null ? d19.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WeightCardData(status=");
        sb3.append(this.f129082a);
        sb3.append(", lastWeight=");
        sb3.append(this.f129083b);
        sb3.append(", lastWeightDelta=");
        sb3.append(this.f129084c);
        sb3.append(", lastWeightTimestamp=");
        sb3.append(this.f129085d);
        sn.a.p(this.f129086e, this.f129087f, ", weightGoal=", ", bmi=", sb3);
        sn.a.p(this.f129088g, this.f129089h, ", highWeightGoalInGrams=", ", lowWeightGoalInGrams=", sb3);
        sb3.append(")");
        return sb3.toString();
    }

    public e(yz1.d dVar, Double d14, Double d15, long j8, Double d16, Double d17, Double d18, Double d19) {
        dVar.getClass();
        this.f129082a = dVar;
        this.f129083b = d14;
        this.f129084c = d15;
        this.f129085d = j8;
        this.f129086e = d16;
        this.f129087f = d17;
        this.f129088g = d18;
        this.f129089h = d19;
    }
}
