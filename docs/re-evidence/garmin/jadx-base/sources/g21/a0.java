package g21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lg21/a0;", "", "", "proteinGoal", "fatGoal", "carbsGoal", "adjustedProtein", "adjustedFat", "adjustedCarbs", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f75373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f75374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f75375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f75376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f75377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f75378f;

    public /* synthetic */ a0(Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, int i14, p005kotlin.jvm.internal.j jVar) {
        this(d14, d15, d16, (i14 & 8) != 0 ? null : d17, (i14 & 16) != 0 ? null : d18, (i14 & 32) != 0 ? null : d19);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return p005kotlin.jvm.internal.s.g(this.f75373a, a0Var.f75373a) && p005kotlin.jvm.internal.s.g(this.f75374b, a0Var.f75374b) && p005kotlin.jvm.internal.s.g(this.f75375c, a0Var.f75375c) && p005kotlin.jvm.internal.s.g(this.f75376d, a0Var.f75376d) && p005kotlin.jvm.internal.s.g(this.f75377e, a0Var.f75377e) && p005kotlin.jvm.internal.s.g(this.f75378f, a0Var.f75378f);
    }

    public final int hashCode() {
        Double d14 = this.f75373a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.f75374b;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f75375c;
        int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f75376d;
        int iHashCode4 = (iHashCode3 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.f75377e;
        int iHashCode5 = (iHashCode4 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.f75378f;
        return iHashCode5 + (d19 != null ? d19.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = tn.k.i("NutritionReportsMacrosGoalsChartData(proteinGoal=", this.f75373a, this.f75374b, ", fatGoal=", ", carbsGoal=");
        b71.i.p(this.f75375c, this.f75376d, ", adjustedProtein=", ", adjustedFat=", sbI);
        return sn.a.f(this.f75377e, this.f75378f, ", adjustedCarbs=", ")", sbI);
    }

    public a0(Double d14, Double d15, Double d16, Double d17, Double d18, Double d19) {
        this.f75373a = d14;
        this.f75374b = d15;
        this.f75375c = d16;
        this.f75376d = d17;
        this.f75377e = d18;
        this.f75378f = d19;
    }
}
