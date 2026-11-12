package b21;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s8 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f15238c;

    public /* synthetic */ s8(lc.m0 m0Var, p3.p1 p1Var, int i14) {
        this.f15236a = i14;
        this.f15237b = m0Var;
        this.f15238c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        androidx.lifecycle.j1 j1VarA;
        androidx.lifecycle.j1 j1VarA2;
        int i14 = this.f15236a;
        p3.p1 p1Var = this.f15238c;
        lc.m0 m0Var = this.f15237b;
        switch (i14) {
            case 0:
                lc.v vVarF = m0Var.f();
                if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                    j1VarA.f(new s21.b(d53.t.i(((u21.c) p1Var.getF182175a()).f167907a), d53.t.i(((u21.c) p1Var.getF182175a()).f167908b), ((u21.c) p1Var.getF182175a()).f167911e, ((u21.c) p1Var.getF182175a()).f167912f), "activityLevelResult");
                }
                m0Var.n();
                break;
            case 1:
                lc.y.l(m0Var, new l4.d0(((s21.x) p1Var.getF182175a()).f156203l));
                break;
            case 2:
                lc.v vVarF2 = m0Var.f();
                if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                    j1VarA2.f(new s21.h(((u21.l0) p1Var.getF182175a()).f168029b, ((u21.l0) p1Var.getF182175a()).f168030c, ((u21.l0) p1Var.getF182175a()).f168031d, ((u21.l0) p1Var.getF182175a()).f168032e, ((u21.l0) p1Var.getF182175a()).f168033f, ((u21.l0) p1Var.getF182175a()).f168034g), "macrosGoalsResult");
                }
                m0Var.n();
                break;
            case 3:
                if (((s21.x) p1Var.getF182175a()).f156204m) {
                    m0Var.getClass();
                    lc.y.l(m0Var, new l4.n(new ro0.i(ro0.l.NUTRITION, "NUTRITION_NUTRIENTS")));
                } else {
                    m0Var.getClass();
                    lc.y.l(m0Var, new l4.n(new ro0.i(ro0.l.NUTRITION, "NUTRITION_MACRONUTRIENTS")));
                }
                break;
            case 4:
                lc.y.l(m0Var, new l4.c0(((u21.a0) p1Var.getF182175a()).f167892b));
                break;
            case 5:
                lc.y.l(m0Var, new l4.a0(((s21.x) p1Var.getF182175a()).f156192a, ((s21.x) p1Var.getF182175a()).f156193b));
                break;
            case 6:
                lc.y.l(m0Var, new l4.z(((s21.x) p1Var.getF182175a()).f156195d, ((s21.x) p1Var.getF182175a()).f156196e, ((s21.x) p1Var.getF182175a()).f156197f, ((s21.x) p1Var.getF182175a()).f156198g));
                break;
            case 7:
                lc.y.l(m0Var, new l4.b0(((s21.x) p1Var.getF182175a()).f156193b, ((s21.x) p1Var.getF182175a()).f156194c));
                break;
            default:
                int i15 = tn.m.f165476e;
                p1Var.setValue(Boolean.FALSE);
                m0Var.n();
                break;
        }
        return Unit.INSTANCE;
    }
}
