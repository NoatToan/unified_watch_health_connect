package u21;

import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lu21/h1;", "", "", "shouldCalculateGoal", "Ls21/s;", "goalType", "", "currentWeightInGrams", "targetWeightInGrams", "", "targetWeeklyWeightChangeInGrams", "activeCalories", "Ls21/a;", "activityLevelOption", "Ll01/a;", "activityMultiplierType", "calorieGoal", "Ls21/e;", "macroGoals", "Ls21/o;", "micronutrientsSettings", "Lb63/o;", "targetDate", "<init>", "(ZLs21/s;IILjava/lang/Float;Ljava/lang/Integer;Ls21/a;Ll01/a;Ljava/lang/Integer;Ls21/e;Ls21/o;Lb63/o;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s21.s f167989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f167990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f167991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Float f167992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f167993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s21.a f167994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l01.a f167995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f167996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s21.e f167997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s21.o f167998k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b63.o f167999l;

    public /* synthetic */ h1(boolean z14, s21.s sVar, int i14, int i15, Float f14, Integer num, s21.a aVar, l01.a aVar2, Integer num2, s21.e eVar, s21.o oVar, b63.o oVar2, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? true : z14, sVar, i14, i15, (i16 & 16) != 0 ? null : f14, (i16 & 32) != 0 ? null : num, (i16 & 64) != 0 ? null : aVar, (i16 & 128) != 0 ? null : aVar2, num2, eVar, oVar, oVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f167988a == h1Var.f167988a && this.f167989b == h1Var.f167989b && this.f167990c == h1Var.f167990c && this.f167991d == h1Var.f167991d && p005kotlin.jvm.internal.s.g(this.f167992e, h1Var.f167992e) && p005kotlin.jvm.internal.s.g(this.f167993f, h1Var.f167993f) && this.f167994g == h1Var.f167994g && this.f167995h == h1Var.f167995h && p005kotlin.jvm.internal.s.g(this.f167996i, h1Var.f167996i) && p005kotlin.jvm.internal.s.g(this.f167997j, h1Var.f167997j) && p005kotlin.jvm.internal.s.g(this.f167998k, h1Var.f167998k) && p005kotlin.jvm.internal.s.g(this.f167999l, h1Var.f167999l);
    }

    public final int hashCode() {
        int iD = q2.d(this.f167991d, q2.d(this.f167990c, (this.f167989b.hashCode() + (Boolean.hashCode(this.f167988a) * 31)) * 31, 31), 31);
        Float f14 = this.f167992e;
        int iHashCode = (iD + (f14 == null ? 0 : f14.hashCode())) * 31;
        Integer num = this.f167993f;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        s21.a aVar = this.f167994g;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        l01.a aVar2 = this.f167995h;
        int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Integer num2 = this.f167996i;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        s21.e eVar = this.f167997j;
        int iHashCode6 = (iHashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        s21.o oVar = this.f167998k;
        int iHashCode7 = (iHashCode6 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        b63.o oVar2 = this.f167999l;
        return iHashCode7 + (oVar2 != null ? oVar2.f16206a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RecommendationsSetupData(shouldCalculateGoal=");
        sb3.append(this.f167988a);
        sb3.append(", goalType=");
        sb3.append(this.f167989b);
        sb3.append(", currentWeightInGrams=");
        ds.e0.m(this.f167990c, this.f167991d, ", targetWeightInGrams=", ", targetWeeklyWeightChangeInGrams=", sb3);
        sb3.append(this.f167992e);
        sb3.append(", activeCalories=");
        sb3.append(this.f167993f);
        sb3.append(", activityLevelOption=");
        sb3.append(this.f167994g);
        sb3.append(", activityMultiplierType=");
        sb3.append(this.f167995h);
        sb3.append(", calorieGoal=");
        sb3.append(this.f167996i);
        sb3.append(", macroGoals=");
        sb3.append(this.f167997j);
        sb3.append(", micronutrientsSettings=");
        sb3.append(this.f167998k);
        sb3.append(", targetDate=");
        sb3.append(this.f167999l);
        sb3.append(")");
        return sb3.toString();
    }

    public h1(boolean z14, s21.s sVar, int i14, int i15, Float f14, Integer num, s21.a aVar, l01.a aVar2, Integer num2, s21.e eVar, s21.o oVar, b63.o oVar2) {
        sVar.getClass();
        this.f167988a = z14;
        this.f167989b = sVar;
        this.f167990c = i14;
        this.f167991d = i15;
        this.f167992e = f14;
        this.f167993f = num;
        this.f167994g = aVar;
        this.f167995h = aVar2;
        this.f167996i = num2;
        this.f167997j = eVar;
        this.f167998k = oVar;
        this.f167999l = oVar2;
    }
}
