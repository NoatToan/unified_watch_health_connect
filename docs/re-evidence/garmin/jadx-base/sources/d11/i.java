package d11;

import a11.r;
import b11.v;
import c22.c3;
import c22.g2;
import c22.x0;
import j53.l;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.y;
import s21.o;
import y22.x;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ld11/i;", "", "Lc22/c3;", "titleResId", "Ld11/g;", "recipeDetails", "Li53/c;", "Lg01/c;", "units", "Ld11/f;", "ingredients", "La11/r;", "selectedFractionTab", "Ld11/e;", "errors", "Ly22/x;", "photo", "", "ingredientsListInEditMode", "isLoading", "navigateToFindFood", "navigateBackWithSavedData", "Ls21/o;", "micronutrientsSettings", "<init>", "(Lc22/c3;Ld11/g;Li53/c;Li53/c;La11/r;Ld11/e;Ly22/x;ZZZZLs21/o;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f57079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f57080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<g01.c> f57081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<f> f57082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f57083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f57084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f57085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f57086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f57087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f57088j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f57089k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f57090l;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(c3 c3Var, g gVar, i53.c cVar, i53.c cVar2, r rVar, e eVar, x xVar, boolean z14, boolean z15, boolean z16, boolean z17, o oVar, int i14, j jVar) {
        c3 c3VarB;
        if ((i14 & 1) != 0) {
            x0.f23314a.getClass();
            c3VarB = g2.b(x0.Jd);
        } else {
            c3VarB = c3Var;
        }
        this(c3VarB, (i14 & 2) != 0 ? new g(null, null, null, null, null, 31, null) : gVar, (i14 & 4) != 0 ? l.b() : cVar, (i14 & 8) != 0 ? l.b() : cVar2, (i14 & 16) != 0 ? r.NUMBER : rVar, (i14 & 32) != 0 ? new e(false, false, false, false, false, false, false, 127, null) : eVar, (i14 & 64) != 0 ? null : xVar, (i14 & 128) != 0 ? false : z14, (i14 & 256) != 0 ? false : z15, (i14 & 512) != 0 ? false : z16, (i14 & 1024) == 0 ? z17 : false, (i14 & 2048) != 0 ? null : oVar);
    }

    public static i a(i iVar, g gVar, i53.f fVar, i53.f fVar2, r rVar, e eVar, x xVar, boolean z14, boolean z15, boolean z16, boolean z17, o oVar, int i14) {
        g gVar2 = gVar;
        c3 c3Var = iVar.f57079a;
        if ((i14 & 2) != 0) {
            gVar2 = iVar.f57080b;
        }
        i53.c<g01.c> cVar = fVar;
        if ((i14 & 4) != 0) {
            cVar = iVar.f57081c;
        }
        i53.c<f> cVar2 = fVar2;
        if ((i14 & 8) != 0) {
            cVar2 = iVar.f57082d;
        }
        if ((i14 & 16) != 0) {
            rVar = iVar.f57083e;
        }
        if ((i14 & 32) != 0) {
            eVar = iVar.f57084f;
        }
        if ((i14 & 64) != 0) {
            xVar = iVar.f57085g;
        }
        if ((i14 & 128) != 0) {
            z14 = iVar.f57086h;
        }
        if ((i14 & 256) != 0) {
            z15 = iVar.f57087i;
        }
        if ((i14 & 512) != 0) {
            z16 = iVar.f57088j;
        }
        if ((i14 & 1024) != 0) {
            z17 = iVar.f57089k;
        }
        if ((i14 & 2048) != 0) {
            oVar = iVar.f57090l;
        }
        o oVar2 = oVar;
        iVar.getClass();
        c3Var.getClass();
        gVar2.getClass();
        cVar.getClass();
        cVar2.getClass();
        rVar.getClass();
        eVar.getClass();
        boolean z18 = z17;
        boolean z19 = z16;
        boolean z24 = z15;
        boolean z25 = z14;
        x xVar2 = xVar;
        e eVar2 = eVar;
        r rVar2 = rVar;
        i53.c<f> cVar3 = cVar2;
        return new i(c3Var, gVar2, cVar, cVar3, rVar2, eVar2, xVar2, z25, z24, z19, z18, oVar2);
    }

    public final b11.f b() {
        g gVar = this.f57080b;
        Double d14 = gVar.f57072d;
        Double d15 = gVar.f57072d;
        if (!zf.b.D(d14) || d15.doubleValue() <= 0.0d) {
            Double dValueOf = Double.valueOf(0.0d);
            return new b11.f(0, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf);
        }
        b11.f fVarC = c();
        double dDoubleValue = d15.doubleValue();
        if (!zf.b.D(d15) || dDoubleValue == 0.0d) {
            return new b11.f(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        Integer num = fVarC.f14266a;
        Integer numValueOf = num != null ? Integer.valueOf(MathKt.b(((double) num.intValue()) / dDoubleValue)) : null;
        Double d16 = fVarC.f14267b;
        Double dH = d16 != null ? u0.h(dDoubleValue, d16) : null;
        Double d17 = fVarC.f14268c;
        Double dH2 = d17 != null ? u0.h(dDoubleValue, d17) : null;
        Double d18 = fVarC.f14269d;
        Double dH3 = d18 != null ? u0.h(dDoubleValue, d18) : null;
        Double d19 = fVarC.f14270e;
        Double dH4 = d19 != null ? u0.h(dDoubleValue, d19) : null;
        Double d24 = fVarC.f14271f;
        Double dH5 = d24 != null ? u0.h(dDoubleValue, d24) : null;
        Double d25 = fVarC.f14272g;
        Double dH6 = d25 != null ? u0.h(dDoubleValue, d25) : null;
        Double d26 = fVarC.f14273h;
        Double dH7 = d26 != null ? u0.h(dDoubleValue, d26) : null;
        Double d27 = fVarC.f14274i;
        Double dH8 = d27 != null ? u0.h(dDoubleValue, d27) : null;
        Double d28 = fVarC.f14275j;
        Double dH9 = d28 != null ? u0.h(dDoubleValue, d28) : null;
        Double d29 = fVarC.f14276k;
        Double dH10 = d29 != null ? u0.h(dDoubleValue, d29) : null;
        Double d34 = fVarC.f14277l;
        Double dH11 = d34 != null ? u0.h(dDoubleValue, d34) : null;
        Double d35 = fVarC.f14278m;
        Double dH12 = d35 != null ? u0.h(dDoubleValue, d35) : null;
        Double d36 = fVarC.f14279n;
        Double dH13 = d36 != null ? u0.h(dDoubleValue, d36) : null;
        Double d37 = fVarC.f14280o;
        Double dH14 = d37 != null ? u0.h(dDoubleValue, d37) : null;
        Double d38 = fVarC.f14281p;
        Double dH15 = d38 != null ? u0.h(dDoubleValue, d38) : null;
        Double d39 = fVarC.f14282q;
        Double dH16 = d39 != null ? u0.h(dDoubleValue, d39) : null;
        Double d44 = fVarC.f14283r;
        Double dH17 = d44 != null ? u0.h(dDoubleValue, d44) : null;
        Double d45 = fVarC.f14284t;
        return new b11.f(numValueOf, dH, dH2, dH3, dH4, dH5, dH6, dH7, dH8, dH9, dH10, dH11, dH12, dH13, dH14, dH15, dH16, dH17, d45 != null ? u0.h(dDoubleValue, d45) : null);
    }

    public final b11.f c() {
        i53.c<f> cVar = this.f57082d;
        ArrayList<v> arrayList = new ArrayList(y.r(cVar, 10));
        Iterator<f> it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f57067a);
        }
        Double dValueOf = Double.valueOf(0.0d);
        b11.f fVar = new b11.f(0, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf);
        for (v vVar : arrayList) {
            fVar = fVar.d(vVar.E().f(vVar.getF14235b()));
        }
        return fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f57079a, iVar.f57079a) && s.g(this.f57080b, iVar.f57080b) && s.g(this.f57081c, iVar.f57081c) && s.g(this.f57082d, iVar.f57082d) && this.f57083e == iVar.f57083e && s.g(this.f57084f, iVar.f57084f) && s.g(this.f57085g, iVar.f57085g) && this.f57086h == iVar.f57086h && this.f57087i == iVar.f57087i && this.f57088j == iVar.f57088j && this.f57089k == iVar.f57089k && s.g(this.f57090l, iVar.f57090l);
    }

    public final int hashCode() {
        int iHashCode = (this.f57084f.hashCode() + ((this.f57083e.hashCode() + l2.a(this.f57082d, l2.a(this.f57081c, (this.f57080b.hashCode() + (this.f57079a.hashCode() * 31)) * 31, 31), 31)) * 31)) * 31;
        x xVar = this.f57085g;
        int iG = q6.f.g(q6.f.g(q6.f.g(q6.f.g((iHashCode + (xVar == null ? 0 : xVar.hashCode())) * 31, 31, this.f57086h), 31, this.f57087i), 31, this.f57088j), 31, this.f57089k);
        o oVar = this.f57090l;
        return iG + (oVar != null ? oVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RecipeUiState(titleResId=");
        sb3.append(this.f57079a);
        sb3.append(", recipeDetails=");
        sb3.append(this.f57080b);
        sb3.append(", units=");
        q6.f.w(sb3, this.f57081c, ", ingredients=", this.f57082d, ", selectedFractionTab=");
        sb3.append(this.f57083e);
        sb3.append(", errors=");
        sb3.append(this.f57084f);
        sb3.append(", photo=");
        sb3.append(this.f57085g);
        sb3.append(", ingredientsListInEditMode=");
        sb3.append(this.f57086h);
        sb3.append(", isLoading=");
        kg.f.q(", navigateToFindFood=", ", navigateBackWithSavedData=", sb3, this.f57087i, this.f57088j);
        sb3.append(this.f57089k);
        sb3.append(", micronutrientsSettings=");
        sb3.append(this.f57090l);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(c3 c3Var, g gVar, i53.c<? extends g01.c> cVar, i53.c<f> cVar2, r rVar, e eVar, x xVar, boolean z14, boolean z15, boolean z16, boolean z17, o oVar) {
        c3Var.getClass();
        gVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        rVar.getClass();
        eVar.getClass();
        this.f57079a = c3Var;
        this.f57080b = gVar;
        this.f57081c = cVar;
        this.f57082d = cVar2;
        this.f57083e = rVar;
        this.f57084f = eVar;
        this.f57085g = xVar;
        this.f57086h = z14;
        this.f57087i = z15;
        this.f57088j = z16;
        this.f57089k = z17;
        this.f57090l = oVar;
    }

    public i() {
        this(null, null, null, null, null, null, null, false, false, false, false, null, 4095, null);
    }
}
