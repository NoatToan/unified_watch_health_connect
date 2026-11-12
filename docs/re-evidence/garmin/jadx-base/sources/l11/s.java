package l11;

import c22.c3;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import g21.f0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Ll11/s;", "", "Ll11/t$c;", RemoteConfigConstants.ResponseFieldKey.STATE, "Ll11/r;", "recipeDetails", "Lb11/l;", "selectedMealWindow", "Lg21/f0;", "mealNutritionContent", "Lg21/u;", "mealNutritionGoals", "Lb11/f;", "adjustedDailyNutritionContent", "adjustedMealNutritionContent", "Li53/c;", "Lb11/o;", "micronutrientEntries", "adjustedDailyMicroEntries", "La11/r;", "lastServingQtyInputType", "", "showFavorite", "showEditDeleteOptionMenu", "showRemoveFoodOptionMenu", "isMealSelectionAllowed", "", "actionLabelResId", "Lc22/c3;", "titleResId", "<init>", "(Ll11/t$c;Ll11/r;Lb11/l;Lg21/f0;Lg21/u;Lb11/f;Lg21/f0;Li53/c;Li53/c;La11/r;ZZZZILc22/c3;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t.c f108237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f108238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b11.l f108239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f108240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g21.u f108241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b11.f f108242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f0 f108243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i53.c<b11.o> f108244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i53.c<b11.o> f108245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a11.r f108246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f108247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f108248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f108249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f108250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f108251o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c3 f108252p;

    public /* synthetic */ s(t.c cVar, r rVar, b11.l lVar, f0 f0Var, g21.u uVar, b11.f fVar, f0 f0Var2, i53.c cVar2, i53.c cVar3, a11.r rVar2, boolean z14, boolean z15, boolean z16, boolean z17, int i14, c3 c3Var, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? t.c.i.f108288a : cVar, (i15 & 2) != 0 ? null : rVar, (i15 & 4) != 0 ? null : lVar, (i15 & 8) != 0 ? null : f0Var, (i15 & 16) != 0 ? null : uVar, (i15 & 32) != 0 ? null : fVar, (i15 & 64) != 0 ? null : f0Var2, (i15 & 128) != 0 ? null : cVar2, (i15 & 256) != 0 ? null : cVar3, (i15 & 512) != 0 ? a11.r.NUMBER : rVar2, z14, z15, z16, z17, i14, c3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.f108237a, sVar.f108237a) && p005kotlin.jvm.internal.s.g(this.f108238b, sVar.f108238b) && p005kotlin.jvm.internal.s.g(this.f108239c, sVar.f108239c) && p005kotlin.jvm.internal.s.g(this.f108240d, sVar.f108240d) && p005kotlin.jvm.internal.s.g(this.f108241e, sVar.f108241e) && p005kotlin.jvm.internal.s.g(this.f108242f, sVar.f108242f) && p005kotlin.jvm.internal.s.g(this.f108243g, sVar.f108243g) && p005kotlin.jvm.internal.s.g(this.f108244h, sVar.f108244h) && p005kotlin.jvm.internal.s.g(this.f108245i, sVar.f108245i) && this.f108246j == sVar.f108246j && this.f108247k == sVar.f108247k && this.f108248l == sVar.f108248l && this.f108249m == sVar.f108249m && this.f108250n == sVar.f108250n && this.f108251o == sVar.f108251o && p005kotlin.jvm.internal.s.g(this.f108252p, sVar.f108252p);
    }

    public final int hashCode() {
        int iHashCode = this.f108237a.hashCode() * 31;
        r rVar = this.f108238b;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        b11.l lVar = this.f108239c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        f0 f0Var = this.f108240d;
        int iHashCode4 = (iHashCode3 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        g21.u uVar = this.f108241e;
        int iHashCode5 = (iHashCode4 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        b11.f fVar = this.f108242f;
        int iHashCode6 = (iHashCode5 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        f0 f0Var2 = this.f108243g;
        int iHashCode7 = (iHashCode6 + (f0Var2 == null ? 0 : f0Var2.hashCode())) * 31;
        i53.c<b11.o> cVar = this.f108244h;
        int iHashCode8 = (iHashCode7 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        i53.c<b11.o> cVar2 = this.f108245i;
        return this.f108252p.hashCode() + q2.d(this.f108251o, q6.f.g(q6.f.g(q6.f.g(q6.f.g((this.f108246j.hashCode() + ((iHashCode8 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31)) * 31, 31, this.f108247k), 31, this.f108248l), 31, this.f108249m), 31, this.f108250n), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RecipeDetailsUiState(state=");
        sb3.append(this.f108237a);
        sb3.append(", recipeDetails=");
        sb3.append(this.f108238b);
        sb3.append(", selectedMealWindow=");
        sb3.append(this.f108239c);
        sb3.append(", mealNutritionContent=");
        sb3.append(this.f108240d);
        sb3.append(", mealNutritionGoals=");
        sb3.append(this.f108241e);
        sb3.append(", adjustedDailyNutritionContent=");
        sb3.append(this.f108242f);
        sb3.append(", adjustedMealNutritionContent=");
        sb3.append(this.f108243g);
        sb3.append(", micronutrientEntries=");
        sb3.append(this.f108244h);
        sb3.append(", adjustedDailyMicroEntries=");
        sb3.append(this.f108245i);
        sb3.append(", lastServingQtyInputType=");
        sb3.append(this.f108246j);
        sb3.append(", showFavorite=");
        kg.f.q(", showEditDeleteOptionMenu=", ", showRemoveFoodOptionMenu=", sb3, this.f108247k, this.f108248l);
        kg.f.q(", isMealSelectionAllowed=", ", actionLabelResId=", sb3, this.f108249m, this.f108250n);
        sb3.append(this.f108251o);
        sb3.append(", titleResId=");
        sb3.append(this.f108252p);
        sb3.append(")");
        return sb3.toString();
    }

    public s(t.c cVar, r rVar, b11.l lVar, f0 f0Var, g21.u uVar, b11.f fVar, f0 f0Var2, i53.c<b11.o> cVar2, i53.c<b11.o> cVar3, a11.r rVar2, boolean z14, boolean z15, boolean z16, boolean z17, int i14, c3 c3Var) {
        cVar.getClass();
        rVar2.getClass();
        c3Var.getClass();
        this.f108237a = cVar;
        this.f108238b = rVar;
        this.f108239c = lVar;
        this.f108240d = f0Var;
        this.f108241e = uVar;
        this.f108242f = fVar;
        this.f108243g = f0Var2;
        this.f108244h = cVar2;
        this.f108245i = cVar3;
        this.f108246j = rVar2;
        this.f108247k = z14;
        this.f108248l = z15;
        this.f108249m = z16;
        this.f108250n = z17;
        this.f108251o = i14;
        this.f108252p = c3Var;
    }
}
