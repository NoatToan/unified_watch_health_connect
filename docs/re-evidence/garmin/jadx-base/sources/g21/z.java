package g21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg21/z;", "", "Lb63/o;", "date", "", "calories", "", "protein", "fat", "carbs", "other", "<init>", "(Lb63/o;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b63.o f75539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f75540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f75541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f75542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f75543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f75544f;

    public z(b63.o oVar, Integer num, Double d14, Double d15, Double d16, Integer num2) {
        oVar.getClass();
        this.f75539a = oVar;
        this.f75540b = num;
        this.f75541c = d14;
        this.f75542d = d15;
        this.f75543e = d16;
        this.f75544f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f75539a.equals(zVar.f75539a) && p005kotlin.jvm.internal.s.g(this.f75540b, zVar.f75540b) && p005kotlin.jvm.internal.s.g(this.f75541c, zVar.f75541c) && p005kotlin.jvm.internal.s.g(this.f75542d, zVar.f75542d) && p005kotlin.jvm.internal.s.g(this.f75543e, zVar.f75543e) && p005kotlin.jvm.internal.s.g(this.f75544f, zVar.f75544f);
    }

    public final int hashCode() {
        int iHashCode = this.f75539a.f16206a.hashCode() * 31;
        Integer num = this.f75540b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.f75541c;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f75542d;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f75543e;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Integer num2 = this.f75544f;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NutritionReportsMacrosChartData(date=");
        sb3.append(this.f75539a);
        sb3.append(", calories=");
        sb3.append(this.f75540b);
        sb3.append(", protein=");
        b71.i.p(this.f75541c, this.f75542d, ", fat=", ", carbs=", sb3);
        sb3.append(this.f75543e);
        sb3.append(", other=");
        sb3.append(this.f75544f);
        sb3.append(")");
        return sb3.toString();
    }
}
