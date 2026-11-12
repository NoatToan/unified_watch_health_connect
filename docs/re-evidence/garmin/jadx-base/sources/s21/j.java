package s21;

import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls21/j;", "", "", "mealIndex", "", "mealName", "", "isTranslated", "percentage", "calorieGoal", "", "proteinGoal", "fatGoal", "carbsGoal", "<init>", "(ILjava/lang/String;ZILjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f156129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f156131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f156132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f156133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f156134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f156135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f156136h;

    public j(int i14, String str, boolean z14, int i15, Integer num, Double d14, Double d15, Double d16) {
        str.getClass();
        this.f156129a = i14;
        this.f156130b = str;
        this.f156131c = z14;
        this.f156132d = i15;
        this.f156133e = num;
        this.f156134f = d14;
        this.f156135g = d15;
        this.f156136h = d16;
    }

    public static j a(j jVar, int i14, Integer num, Double d14, Double d15, Double d16, int i15) {
        int i16 = jVar.f156129a;
        String str = jVar.f156130b;
        boolean z14 = jVar.f156131c;
        if ((i15 & 8) != 0) {
            i14 = jVar.f156132d;
        }
        int i17 = i14;
        if ((i15 & 16) != 0) {
            num = jVar.f156133e;
        }
        Integer num2 = num;
        if ((i15 & 32) != 0) {
            d14 = jVar.f156134f;
        }
        Double d17 = d14;
        if ((i15 & 64) != 0) {
            d15 = jVar.f156135g;
        }
        Double d18 = d15;
        if ((i15 & 128) != 0) {
            d16 = jVar.f156136h;
        }
        jVar.getClass();
        return new j(i16, str, z14, i17, num2, d17, d18, d16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f156129a == jVar.f156129a && this.f156130b.equals(jVar.f156130b) && this.f156131c == jVar.f156131c && this.f156132d == jVar.f156132d && p005kotlin.jvm.internal.s.g(this.f156133e, jVar.f156133e) && p005kotlin.jvm.internal.s.g(this.f156134f, jVar.f156134f) && p005kotlin.jvm.internal.s.g(this.f156135g, jVar.f156135g) && p005kotlin.jvm.internal.s.g(this.f156136h, jVar.f156136h);
    }

    public final int hashCode() {
        int iD = q2.d(this.f156132d, q6.f.g(wr.g.j(Integer.hashCode(this.f156129a) * 31, 31, this.f156130b), 31, this.f156131c), 31);
        Integer num = this.f156133e;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.f156134f;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f156135g;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f156136h;
        return iHashCode3 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = wr.g.r(this.f156129a, "MealCalorieGoalsUiModel(mealIndex=", ", mealName=", this.f156130b, ", isTranslated=");
        sbR.append(this.f156131c);
        sbR.append(", percentage=");
        sbR.append(this.f156132d);
        sbR.append(", calorieGoal=");
        b71.i.v(sbR, this.f156133e, ", proteinGoal=", this.f156134f, ", fatGoal=");
        return sn.a.f(this.f156135g, this.f156136h, ", carbsGoal=", ")", sbR);
    }
}
