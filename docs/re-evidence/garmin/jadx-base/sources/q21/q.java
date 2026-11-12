package q21;

import b21.l4;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lq21/q;", "", "", "hasNutritionGoal", "autoCalorieAdjustment", "", "dailyCalorieGoal", "Ls21/e;", "macroGoals", "isLoading", "snackbarMessage", "showLoadingErrorScreen", "isFlexibleMealWindowsEnabled", "Lb21/l4;", "navigateToRoute", "<init>", "(ZZLjava/lang/Integer;Ls21/e;ZLjava/lang/Integer;ZZLb21/l4;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f142278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f142279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f142280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s21.e f142281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f142282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f142283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f142284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f142285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l4 f142286i;

    public /* synthetic */ q(boolean z14, boolean z15, Integer num, s21.e eVar, boolean z16, Integer num2, boolean z17, boolean z18, l4 l4Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : eVar, (i14 & 16) != 0 ? false : z16, (i14 & 32) != 0 ? null : num2, (i14 & 64) != 0 ? false : z17, (i14 & 128) != 0 ? false : z18, (i14 & 256) != 0 ? null : l4Var);
    }

    public static q a(q qVar, boolean z14, boolean z15, Integer num, s21.e eVar, boolean z16, Integer num2, boolean z17, boolean z18, l4 l4Var, int i14) {
        if ((i14 & 1) != 0) {
            z14 = qVar.f142278a;
        }
        boolean z19 = z14;
        if ((i14 & 2) != 0) {
            z15 = qVar.f142279b;
        }
        boolean z24 = z15;
        if ((i14 & 4) != 0) {
            num = qVar.f142280c;
        }
        Integer num3 = num;
        if ((i14 & 8) != 0) {
            eVar = qVar.f142281d;
        }
        s21.e eVar2 = eVar;
        if ((i14 & 16) != 0) {
            z16 = qVar.f142282e;
        }
        boolean z25 = z16;
        Integer num4 = (i14 & 32) != 0 ? qVar.f142283f : num2;
        boolean z26 = (i14 & 64) != 0 ? qVar.f142284g : z17;
        boolean z27 = (i14 & 128) != 0 ? qVar.f142285h : z18;
        l4 l4Var2 = (i14 & 256) != 0 ? qVar.f142286i : l4Var;
        qVar.getClass();
        return new q(z19, z24, num3, eVar2, z25, num4, z26, z27, l4Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f142278a == qVar.f142278a && this.f142279b == qVar.f142279b && p005kotlin.jvm.internal.s.g(this.f142280c, qVar.f142280c) && p005kotlin.jvm.internal.s.g(this.f142281d, qVar.f142281d) && this.f142282e == qVar.f142282e && p005kotlin.jvm.internal.s.g(this.f142283f, qVar.f142283f) && this.f142284g == qVar.f142284g && this.f142285h == qVar.f142285h && p005kotlin.jvm.internal.s.g(this.f142286i, qVar.f142286i);
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.f142278a) * 31, 31, this.f142279b);
        Integer num = this.f142280c;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        s21.e eVar = this.f142281d;
        int iG2 = q6.f.g((iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.f142282e);
        Integer num2 = this.f142283f;
        int iG3 = q6.f.g(q6.f.g((iG2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f142284g), 31, this.f142285h);
        l4 l4Var = this.f142286i;
        return iG3 + (l4Var != null ? l4Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("NutritionSettingsUiState(hasNutritionGoal=", ", autoCalorieAdjustment=", ", dailyCalorieGoal=", this.f142278a, this.f142279b);
        sbM.append(this.f142280c);
        sbM.append(", macroGoals=");
        sbM.append(this.f142281d);
        sbM.append(", isLoading=");
        sbM.append(this.f142282e);
        sbM.append(", snackbarMessage=");
        sbM.append(this.f142283f);
        sbM.append(", showLoadingErrorScreen=");
        kg.f.q(", isFlexibleMealWindowsEnabled=", ", navigateToRoute=", sbM, this.f142284g, this.f142285h);
        sbM.append(this.f142286i);
        sbM.append(")");
        return sbM.toString();
    }

    public q(boolean z14, boolean z15, Integer num, s21.e eVar, boolean z16, Integer num2, boolean z17, boolean z18, l4 l4Var) {
        this.f142278a = z14;
        this.f142279b = z15;
        this.f142280c = num;
        this.f142281d = eVar;
        this.f142282e = z16;
        this.f142283f = num2;
        this.f142284g = z17;
        this.f142285h = z18;
        this.f142286i = l4Var;
    }

    public q() {
        this(false, false, null, null, false, null, false, false, null, 511, null);
    }
}
