package g21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lg21/b0;", "", "Lb63/o;", "date", "", "fiber", "addedSugar", "saturatedFat", "iron", "calcium", "vitaminA", "vitaminD", "<init>", "(Lb63/o;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b63.o f75383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f75384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f75385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f75386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f75387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f75388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f75389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f75390h;

    public b0(b63.o oVar, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24) {
        oVar.getClass();
        this.f75383a = oVar;
        this.f75384b = d14;
        this.f75385c = d15;
        this.f75386d = d16;
        this.f75387e = d17;
        this.f75388f = d18;
        this.f75389g = d19;
        this.f75390h = d24;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f75383a.equals(b0Var.f75383a) && p005kotlin.jvm.internal.s.g(this.f75384b, b0Var.f75384b) && p005kotlin.jvm.internal.s.g(this.f75385c, b0Var.f75385c) && p005kotlin.jvm.internal.s.g(this.f75386d, b0Var.f75386d) && p005kotlin.jvm.internal.s.g(this.f75387e, b0Var.f75387e) && p005kotlin.jvm.internal.s.g(this.f75388f, b0Var.f75388f) && p005kotlin.jvm.internal.s.g(this.f75389g, b0Var.f75389g) && p005kotlin.jvm.internal.s.g(this.f75390h, b0Var.f75390h);
    }

    public final int hashCode() {
        int iHashCode = this.f75383a.f16206a.hashCode() * 31;
        Double d14 = this.f75384b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f75385c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f75386d;
        int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f75387e;
        int iHashCode5 = (iHashCode4 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.f75388f;
        int iHashCode6 = (iHashCode5 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.f75389g;
        int iHashCode7 = (iHashCode6 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.f75390h;
        return iHashCode7 + (d24 != null ? d24.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NutritionReportsMicrosChartData(date=");
        sb3.append(this.f75383a);
        sb3.append(", fiber=");
        sb3.append(this.f75384b);
        sb3.append(", addedSugar=");
        b71.i.p(this.f75385c, this.f75386d, ", saturatedFat=", ", iron=", sb3);
        b71.i.p(this.f75387e, this.f75388f, ", calcium=", ", vitaminA=", sb3);
        return sn.a.f(this.f75389g, this.f75390h, ", vitaminD=", ")", sb3);
    }
}
