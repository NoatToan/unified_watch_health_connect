package u21;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lu21/s;", "", "", "isLoading", "isInMinutes", "Ls21/c;", "selectedViewType", "isEditingExistingSettings", "showLoadingErrorScreen", "hasDataLoaded", "", "Ls21/k;", "activeMeals", "Ls21/e0;", "timelineStart", "timelineEnd", "Ls21/d0;", "navigateNextWithSavedData", "isDataValidForSaving", "showWarningDialog", "navigateBack", "navigateToManageMeals", "showMealGoalsRecalculatedSnackbar", "", "snackbarMessageRes", "<init>", "(ZZLs21/c;ZZZLjava/util/List;Ls21/e0;Ls21/e0;Ls21/d0;ZZZZZLjava/lang/Integer;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f168112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s21.c f168114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f168115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f168116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f168117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<s21.k> f168118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s21.e0 f168119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s21.e0 f168120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s21.d0 f168121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f168122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f168123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f168124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f168125n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f168126o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f168127p;

    public s(boolean z14, boolean z15, s21.c cVar, boolean z16, boolean z17, boolean z18, List list, s21.e0 e0Var, s21.e0 e0Var2, s21.d0 d0Var, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        s21.e0 e0Var3;
        boolean z28 = (i14 & 1) != 0 ? false : z14;
        s21.c cVar2 = (i14 & 4) != 0 ? s21.c.TIMELINE : cVar;
        boolean z29 = (i14 & 8) != 0 ? false : z16;
        boolean z34 = (i14 & 16) != 0 ? false : z17;
        boolean z35 = (i14 & 32) != 0 ? false : z18;
        List list2 = (i14 & 64) != 0 ? p13.j0.f134944a : list;
        s21.e0 e0Var4 = (i14 & 128) != 0 ? new s21.e0(v21.d.f175307k, null, null, null, 14, null) : e0Var;
        if ((i14 & 256) != 0) {
            b63.v vVar = v21.d.f175308l;
            v21.f fVar = v21.f.f175333a;
            b63.v vVar2 = v21.d.f175307k;
            fVar.getClass();
            e0Var3 = new s21.e0(vVar, v21.f.u(vVar2), null, null, 12, null);
        } else {
            e0Var3 = e0Var2;
        }
        this(z28, z15, cVar2, z29, z34, z35, list2, e0Var4, e0Var3, (i14 & 512) != 0 ? null : d0Var, (i14 & 1024) != 0 ? true : z19, (i14 & 2048) != 0 ? false : z24, (i14 & 4096) != 0 ? false : z25, (i14 & 8192) != 0 ? false : z26, (i14 & 16384) != 0 ? false : z27, (i14 & 32768) != 0 ? null : num);
    }

    public static s a(s sVar, boolean z14, s21.c cVar, boolean z15, List list, s21.e0 e0Var, s21.e0 e0Var2, s21.d0 d0Var, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, Integer num, int i14) {
        boolean z25 = (i14 & 1) != 0 ? sVar.f168112a : z14;
        boolean z26 = sVar.f168113b;
        s21.c cVar2 = (i14 & 4) != 0 ? sVar.f168114c : cVar;
        boolean z27 = sVar.f168115d;
        boolean z28 = (i14 & 16) != 0 ? sVar.f168116e : z15;
        boolean z29 = (i14 & 32) != 0 ? sVar.f168117f : true;
        List list2 = (i14 & 64) != 0 ? sVar.f168118g : list;
        s21.e0 e0Var3 = (i14 & 128) != 0 ? sVar.f168119h : e0Var;
        s21.e0 e0Var4 = (i14 & 256) != 0 ? sVar.f168120i : e0Var2;
        s21.d0 d0Var2 = (i14 & 512) != 0 ? sVar.f168121j : d0Var;
        boolean z34 = (i14 & 1024) != 0 ? sVar.f168122k : z16;
        boolean z35 = (i14 & 2048) != 0 ? sVar.f168123l : z17;
        boolean z36 = (i14 & 4096) != 0 ? sVar.f168124m : z18;
        boolean z37 = (i14 & 8192) != 0 ? sVar.f168125n : z19;
        boolean z38 = (i14 & 16384) != 0 ? sVar.f168126o : z24;
        Integer num2 = (i14 & 32768) != 0 ? sVar.f168127p : num;
        sVar.getClass();
        cVar2.getClass();
        list2.getClass();
        e0Var3.getClass();
        e0Var4.getClass();
        return new s(z25, z26, cVar2, z27, z28, z29, list2, e0Var3, e0Var4, d0Var2, z34, z35, z36, z37, z38, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f168112a == sVar.f168112a && this.f168113b == sVar.f168113b && this.f168114c == sVar.f168114c && this.f168115d == sVar.f168115d && this.f168116e == sVar.f168116e && this.f168117f == sVar.f168117f && p005kotlin.jvm.internal.s.g(this.f168118g, sVar.f168118g) && p005kotlin.jvm.internal.s.g(this.f168119h, sVar.f168119h) && p005kotlin.jvm.internal.s.g(this.f168120i, sVar.f168120i) && p005kotlin.jvm.internal.s.g(this.f168121j, sVar.f168121j) && this.f168122k == sVar.f168122k && this.f168123l == sVar.f168123l && this.f168124m == sVar.f168124m && this.f168125n == sVar.f168125n && this.f168126o == sVar.f168126o && p005kotlin.jvm.internal.s.g(this.f168127p, sVar.f168127p);
    }

    public final int hashCode() {
        int iHashCode = (this.f168120i.hashCode() + ((this.f168119h.hashCode() + lc.u0.b(q6.f.g(q6.f.g(q6.f.g((this.f168114c.hashCode() + q6.f.g(Boolean.hashCode(this.f168112a) * 31, 31, this.f168113b)) * 31, 31, this.f168115d), 31, this.f168116e), 31, this.f168117f), 31, this.f168118g)) * 31)) * 31;
        s21.d0 d0Var = this.f168121j;
        int iG = q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g((iHashCode + (d0Var == null ? 0 : d0Var.hashCode())) * 31, 31, this.f168122k), 31, this.f168123l), 31, this.f168124m), 31, this.f168125n), 31, this.f168126o);
        Integer num = this.f168127p;
        return iG + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("MealSettingsUiState(isLoading=", ", isInMinutes=", ", selectedViewType=", this.f168112a, this.f168113b);
        sbM.append(this.f168114c);
        sbM.append(", isEditingExistingSettings=");
        sbM.append(this.f168115d);
        sbM.append(", showLoadingErrorScreen=");
        kg.f.q(", hasDataLoaded=", ", activeMeals=", sbM, this.f168116e, this.f168117f);
        sbM.append(this.f168118g);
        sbM.append(", timelineStart=");
        sbM.append(this.f168119h);
        sbM.append(", timelineEnd=");
        sbM.append(this.f168120i);
        sbM.append(", navigateNextWithSavedData=");
        sbM.append(this.f168121j);
        sbM.append(", isDataValidForSaving=");
        kg.f.q(", showWarningDialog=", ", navigateBack=", sbM, this.f168122k, this.f168123l);
        kg.f.q(", navigateToManageMeals=", ", showMealGoalsRecalculatedSnackbar=", sbM, this.f168124m, this.f168125n);
        sbM.append(this.f168126o);
        sbM.append(", snackbarMessageRes=");
        sbM.append(this.f168127p);
        sbM.append(")");
        return sbM.toString();
    }

    public s(boolean z14, boolean z15, s21.c cVar, boolean z16, boolean z17, boolean z18, List<s21.k> list, s21.e0 e0Var, s21.e0 e0Var2, s21.d0 d0Var, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, Integer num) {
        cVar.getClass();
        list.getClass();
        e0Var.getClass();
        e0Var2.getClass();
        this.f168112a = z14;
        this.f168113b = z15;
        this.f168114c = cVar;
        this.f168115d = z16;
        this.f168116e = z17;
        this.f168117f = z18;
        this.f168118g = list;
        this.f168119h = e0Var;
        this.f168120i = e0Var2;
        this.f168121j = d0Var;
        this.f168122k = z19;
        this.f168123l = z24;
        this.f168124m = z25;
        this.f168125n = z26;
        this.f168126o = z27;
        this.f168127p = num;
    }
}
