package o21;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo21/d;", "", "", "mealId", "", "mealName", "", "percentage", "calorieGoal", "", "proteinGoal", "fatGoal", "carbsGoal", "<init>", "(JLjava/lang/String;ILjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f128658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f128660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f128661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f128662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f128663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f128664g;

    public d(long j8, String str, int i14, Integer num, Double d14, Double d15, Double d16) {
        str.getClass();
        this.f128658a = j8;
        this.f128659b = str;
        this.f128660c = i14;
        this.f128661d = num;
        this.f128662e = d14;
        this.f128663f = d15;
        this.f128664g = d16;
    }

    public static d a(d dVar, int i14, Integer num, Double d14, Double d15, Double d16, int i15) {
        long j8 = dVar.f128658a;
        String str = dVar.f128659b;
        if ((i15 & 4) != 0) {
            i14 = dVar.f128660c;
        }
        int i16 = i14;
        if ((i15 & 8) != 0) {
            num = dVar.f128661d;
        }
        Integer num2 = num;
        if ((i15 & 16) != 0) {
            d14 = dVar.f128662e;
        }
        Double d17 = d14;
        if ((i15 & 32) != 0) {
            d15 = dVar.f128663f;
        }
        Double d18 = d15;
        if ((i15 & 64) != 0) {
            d16 = dVar.f128664g;
        }
        dVar.getClass();
        return new d(j8, str, i16, num2, d17, d18, d16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f128658a == dVar.f128658a && this.f128659b.equals(dVar.f128659b) && this.f128660c == dVar.f128660c && s.g(this.f128661d, dVar.f128661d) && s.g(this.f128662e, dVar.f128662e) && s.g(this.f128663f, dVar.f128663f) && s.g(this.f128664g, dVar.f128664g);
    }

    public final int hashCode() {
        int iD = q2.d(this.f128660c, wr.g.j(Long.hashCode(this.f128658a) * 31, 31, this.f128659b), 31);
        Integer num = this.f128661d;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.f128662e;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f128663f;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f128664g;
        return iHashCode3 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f128658a, "LegacyMealGoalItem(mealId=", ", mealName=", this.f128659b);
        sbK.append(", percentage=");
        sbK.append(this.f128660c);
        sbK.append(", calorieGoal=");
        sbK.append(this.f128661d);
        sn.a.p(this.f128662e, this.f128663f, ", proteinGoal=", ", fatGoal=", sbK);
        sbK.append(", carbsGoal=");
        sbK.append(this.f128664g);
        sbK.append(")");
        return sbK.toString();
    }
}
