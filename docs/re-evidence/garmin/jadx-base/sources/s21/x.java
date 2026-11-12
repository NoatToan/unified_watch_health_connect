package s21;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ls21/x;", "", "", "initialWarningShown", "", "dailyCalorieGoal", "Ls21/g;", "dailyMacroGoals", "activeDailyCalories", "customActiveCalories", "Ls21/a;", "selectedActivityLevelOption", "Ll01/a;", "activityMultiplierType", "Lb63/o;", "targetDate", "", "targetWeeklyWeightChange", "Li53/c;", "targetWeeklyWeightValues", "isLoading", "Ls21/o;", "micronutrientsSettings", "showNutrientsHelp", "<init>", "(ZLjava/lang/Integer;Ls21/g;Ljava/lang/Integer;Ljava/lang/Integer;Ls21/a;Ll01/a;Lb63/o;FLi53/c;ZLs21/o;Z)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f156192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f156193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f156194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f156195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f156196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f156197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l01.a f156198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b63.o f156199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f156200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i53.c<Float> f156201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f156202k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f156203l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f156204m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o f156205n;

    public x(boolean z14, Integer num, g gVar, Integer num2, Integer num3, a aVar, l01.a aVar2, b63.o oVar, float f14, i53.c cVar, boolean z15, o oVar2, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : gVar, (i14 & 8) != 0 ? null : num2, (i14 & 16) != 0 ? null : num3, (i14 & 32) != 0 ? a.ACTIVITY_MULTIPLIER : aVar, (i14 & 64) != 0 ? l01.a.MODERATELY_ACTIVE : aVar2, (i14 & 128) != 0 ? g22.l.d(b63.o.INSTANCE) : oVar, (i14 & 256) != 0 ? 0.0f : f14, (i14 & 512) != 0 ? j53.l.b() : cVar, (i14 & 1024) != 0 ? false : z15, (i14 & 2048) == 0 ? oVar2 : null, (i14 & 4096) != 0 ? false : z16);
    }

    public static x a(x xVar, Integer num, g gVar, Integer num2, Integer num3, a aVar, l01.a aVar2, b63.o oVar, float f14, boolean z14, o oVar2, int i14) {
        boolean z15 = (i14 & 1) != 0 ? xVar.f156192a : true;
        Integer num4 = (i14 & 2) != 0 ? xVar.f156193b : num;
        g gVar2 = (i14 & 4) != 0 ? xVar.f156194c : gVar;
        Integer num5 = (i14 & 8) != 0 ? xVar.f156195d : num2;
        Integer num6 = (i14 & 16) != 0 ? xVar.f156196e : num3;
        a aVar3 = (i14 & 32) != 0 ? xVar.f156197f : aVar;
        l01.a aVar4 = (i14 & 64) != 0 ? xVar.f156198g : aVar2;
        b63.o oVar3 = (i14 & 128) != 0 ? xVar.f156199h : oVar;
        float f15 = (i14 & 256) != 0 ? xVar.f156200i : f14;
        i53.c<Float> cVar = xVar.f156201j;
        boolean z16 = (i14 & 1024) != 0 ? xVar.f156202k : z14;
        o oVar4 = (i14 & 2048) != 0 ? xVar.f156203l : oVar2;
        boolean z17 = xVar.f156204m;
        xVar.getClass();
        aVar3.getClass();
        aVar4.getClass();
        oVar3.getClass();
        cVar.getClass();
        return new x(z15, num4, gVar2, num5, num6, aVar3, aVar4, oVar3, f15, cVar, z16, oVar4, z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f156192a == xVar.f156192a && p005kotlin.jvm.internal.s.g(this.f156193b, xVar.f156193b) && p005kotlin.jvm.internal.s.g(this.f156194c, xVar.f156194c) && p005kotlin.jvm.internal.s.g(this.f156195d, xVar.f156195d) && p005kotlin.jvm.internal.s.g(this.f156196e, xVar.f156196e) && this.f156197f == xVar.f156197f && this.f156198g == xVar.f156198g && p005kotlin.jvm.internal.s.g(this.f156199h, xVar.f156199h) && Float.compare(this.f156200i, xVar.f156200i) == 0 && p005kotlin.jvm.internal.s.g(this.f156201j, xVar.f156201j) && this.f156202k == xVar.f156202k && p005kotlin.jvm.internal.s.g(this.f156203l, xVar.f156203l) && this.f156204m == xVar.f156204m;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f156192a) * 31;
        Integer num = this.f156193b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        g gVar = this.f156194c;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Integer num2 = this.f156195d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f156196e;
        int iG = q6.f.g(l2.a(this.f156201j, q6.f.d(this.f156200i, n23.j.a(this.f156199h.f16206a, (this.f156198g.hashCode() + ((this.f156197f.hashCode() + ((iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31)) * 31)) * 31, 31), 31), 31), 31, this.f156202k);
        o oVar = this.f156203l;
        return Boolean.hashCode(this.f156204m) + ((iG + (oVar != null ? oVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NutritionSetupRecommendationsUiModel(initialWarningShown=");
        sb3.append(this.f156192a);
        sb3.append(", dailyCalorieGoal=");
        sb3.append(this.f156193b);
        sb3.append(", dailyMacroGoals=");
        sb3.append(this.f156194c);
        sb3.append(", activeDailyCalories=");
        sb3.append(this.f156195d);
        sb3.append(", customActiveCalories=");
        sb3.append(this.f156196e);
        sb3.append(", selectedActivityLevelOption=");
        sb3.append(this.f156197f);
        sb3.append(", activityMultiplierType=");
        sb3.append(this.f156198g);
        sb3.append(", targetDate=");
        sb3.append(this.f156199h);
        sb3.append(", targetWeeklyWeightChange=");
        sb3.append(this.f156200i);
        sb3.append(", targetWeeklyWeightValues=");
        sb3.append(this.f156201j);
        sb3.append(", isLoading=");
        sb3.append(this.f156202k);
        sb3.append(", micronutrientsSettings=");
        sb3.append(this.f156203l);
        sb3.append(", showNutrientsHelp=");
        return hb.a.k(sb3, this.f156204m, ")");
    }

    public x(boolean z14, Integer num, g gVar, Integer num2, Integer num3, a aVar, l01.a aVar2, b63.o oVar, float f14, i53.c<Float> cVar, boolean z15, o oVar2, boolean z16) {
        aVar.getClass();
        aVar2.getClass();
        oVar.getClass();
        cVar.getClass();
        this.f156192a = z14;
        this.f156193b = num;
        this.f156194c = gVar;
        this.f156195d = num2;
        this.f156196e = num3;
        this.f156197f = aVar;
        this.f156198g = aVar2;
        this.f156199h = oVar;
        this.f156200i = f14;
        this.f156201j = cVar;
        this.f156202k = z15;
        this.f156203l = oVar2;
        this.f156204m = z16;
        this.f156205n = oVar2 != null ? o72.t.c0(oVar2) : null;
    }

    public x() {
        this(false, null, null, null, null, null, null, null, 0.0f, null, false, null, false, 8191, null);
    }
}
