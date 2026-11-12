package g21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lg21/c0;", "", "", "fiberGoal", "addedSugarGoal", "saturatedFatGoal", "ironGoal", "calciumGoal", "vitaminAGoal", "vitaminDGoal", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f75398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f75399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f75400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f75401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f75402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f75403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f75404g;

    public c0(Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24) {
        this.f75398a = d14;
        this.f75399b = d15;
        this.f75400c = d16;
        this.f75401d = d17;
        this.f75402e = d18;
        this.f75403f = d19;
        this.f75404g = d24;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return p005kotlin.jvm.internal.s.g(this.f75398a, c0Var.f75398a) && p005kotlin.jvm.internal.s.g(this.f75399b, c0Var.f75399b) && p005kotlin.jvm.internal.s.g(this.f75400c, c0Var.f75400c) && p005kotlin.jvm.internal.s.g(this.f75401d, c0Var.f75401d) && p005kotlin.jvm.internal.s.g(this.f75402e, c0Var.f75402e) && p005kotlin.jvm.internal.s.g(this.f75403f, c0Var.f75403f) && p005kotlin.jvm.internal.s.g(this.f75404g, c0Var.f75404g);
    }

    public final int hashCode() {
        Double d14 = this.f75398a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.f75399b;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f75400c;
        int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f75401d;
        int iHashCode4 = (iHashCode3 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.f75402e;
        int iHashCode5 = (iHashCode4 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.f75403f;
        int iHashCode6 = (iHashCode5 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.f75404g;
        return iHashCode6 + (d24 != null ? d24.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = tn.k.i("NutritionReportsMicrosGoalsChartData(fiberGoal=", this.f75398a, this.f75399b, ", addedSugarGoal=", ", saturatedFatGoal=");
        b71.i.p(this.f75400c, this.f75401d, ", ironGoal=", ", calciumGoal=", sbI);
        b71.i.p(this.f75402e, this.f75403f, ", vitaminAGoal=", ", vitaminDGoal=", sbI);
        return b71.i.g(sbI, this.f75404g, ")");
    }
}
