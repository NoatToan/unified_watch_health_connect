package c62;

import com.garmin.android.apps.connectmobile.R;
import java.util.Collection;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc62/y0;", "Lr52/b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/e;", "Lc62/t;", "Lw52/v0;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y0 implements r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.details.e, t>, w52.v0 {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.q<String, String, e23.a<? extends Unit>, Unit> {
        public a(Object obj) {
            super(3, obj, t.class, "downloadAudioNote", "downloadAudioNote(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", 0);
        }

        @Override // e23.q
        public final Unit invoke(String str, String str2, e23.a<? extends Unit> aVar) {
            String str3 = str;
            String str4 = str2;
            e23.a<? extends Unit> aVar2 = aVar;
            str3.getClass();
            str4.getClass();
            aVar2.getClass();
            ((t) this.receiver).t(aVar2, str3, str4);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:172:0x03e6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v3, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // r52.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(t tVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar, p3.m mVar, int i14) {
        int i15;
        y0 y0Var;
        ?? r14;
        boolean z14;
        boolean z15;
        m52.j jVar;
        ?? r15;
        char c14;
        ?? r16;
        m52.j jVar2;
        tVar.getClass();
        eVar.getClass();
        p3.o0 o0VarE = mVar.E(-346646501);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(tVar) : o0VarE.r(tVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(this) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            m52.k kVarB = eVar.B();
            m52.k kVar = m52.k.f116754n;
            boolean z16 = kVarB == kVar || eVar.B() == m52.k.f116755o;
            boolean zD = g22.n.d(eVar.getF48577a().K0);
            if (!z16 || zD) {
                z14 = false;
                o0VarE.C(-1843786713);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1880173683);
                z52.a f48586j = eVar.getF48586j();
                if (f48586j == null) {
                    o0VarE.C(-1844157970);
                    o0VarE.g0(false);
                    z14 = false;
                } else {
                    o0VarE.C(-1844157969);
                    h4.r rVarG = c2.l.g(h4.r.S, 2.840909f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    z14 = false;
                    w52.f1.b(c2.l.y(rVarG, j92.b.f97899b.f97920e), eVar.B(), eVar.p(), f48586j, o0VarE, 0);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z14);
            }
            String str = eVar.getF48577a().F;
            boolean z17 = (!((str == null || !g22.n.d(str)) ? z14 : true) || !(eVar.getF48577a().H() || eVar.getF48577a().F()) || eVar.a() > 0) ? z14 : true;
            boolean z18 = (eVar.h() && eVar.B() == kVar) ? true : z14;
            boolean zContains = p13.x.k(m52.k.f116759t, m52.k.f116760v, m52.k.f116762x, m52.k.f116764z).contains(eVar.B());
            v52.e.a aVarE = v52.e.e(eVar.b().f69291a, eVar.b().f69292b, eVar.b().f69293c);
            m52.j jVar3 = eVar.b().f69294d;
            if (jVar3 == null) {
                v52.e eVar2 = v52.e.f175761a;
                m52.k kVarB2 = eVar.B();
                m52.j f48948c = eVar.A().getF48948c();
                eVar2.getClass();
                kVarB2.getClass();
                if (kVarB2 != m52.k.f116758r) {
                    jVar2 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? m52.j.f116746f : m52.j.f116745e;
                } else if (f48948c == null) {
                    jVar2 = m52.j.f116747g;
                } else {
                    jVar3 = f48948c;
                }
                jVar3 = jVar2;
            }
            m52.j jVar4 = jVar3;
            boolean z19 = (eVar.getF48577a().H() || eVar.getF48577a().F()) ? z14 : true;
            boolean zD2 = g22.n.d(eVar.D());
            boolean z24 = eVar.B() == m52.k.f116758r ? true : z14;
            boolean zD3 = g22.n.d(eVar.F().getAudioNoteUuid());
            new v52.b();
            l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVarP = eVar.p();
            com.garmin.android.apps.connectmobile.repcounting.model.c cVarC = eVar.c();
            iVarP.getClass();
            o13.p pVarA = v52.b.a(iVarP, cVarC);
            boolean z25 = (zContains && ((!((Collection) pVarA.f128594a).isEmpty() || !((Collection) pVarA.f128595b).isEmpty()) ? true : z14)) ? true : z14;
            if (z19 && (zD2 || z25 || zD3 || aVarE != v52.e.a.NONE || (eVar.o() instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.g.a))) {
                o0VarE.C(-1841682309);
                w52.a0.b(this, gl1.y.Q(o0VarE, R.string.lbl_overview), o0VarE, (i15 >> 6) & 14);
                o0VarE.g0(z14);
            } else {
                o0VarE.C(-1841609273);
                o0VarE.g0(z14);
            }
            if (z17) {
                o0VarE.C(-1841573096);
                w52.y.n(this, eVar.l().f24692c, o0VarE, (i15 >> 6) & 14);
                o0VarE.g0(z14);
            } else {
                o0VarE.C(-1841497177);
                o0VarE.g0(z14);
            }
            if (aVarE == v52.e.a.TIME) {
                o0VarE.C(-1841418220);
                w52.l0.f(this, eVar.b().f69291a, eVar.b().f69293c, o0VarE, (i15 >> 6) & 14);
                o0VarE.g0(z14);
            } else {
                o0VarE.C(-1841276953);
                o0VarE.g0(z14);
            }
            if (aVarE == v52.e.a.DISTANCE) {
                o0VarE.C(-1841192571);
                z15 = z14;
                jVar = jVar4;
                w52.l0.b(this, eVar.b().f69292b, eVar.b().f69293c, jVar, o0VarE, (i15 >> 6) & 14);
                p3.o0 o0Var = o0VarE;
                o0Var.g0(z15);
                r15 = o0Var;
            } else {
                z15 = z14;
                jVar = jVar4;
                o0VarE.C(-1841006137);
                o0VarE.g0(z15);
                r15 = o0VarE;
            }
            if (aVarE == v52.e.a.BOTH) {
                r15.C(-1840924111);
                c14 = 4;
                boolean z26 = z15;
                w52.l0.j(this, eVar.b().f69291a, eVar.b().f69292b, eVar.b().f69293c, jVar, r15, (i15 >> 6) & 14);
                r15.g0(z26);
                r16 = z26;
            } else {
                boolean z27 = z15;
                c14 = 4;
                r15.C(-1840687705);
                r15.g0(z27);
                r16 = z27;
            }
            f62.p pVarI = eVar.I();
            if (pVarI instanceof f62.p.b) {
                r15.C(-1840547213);
                f62.p.b bVar = (f62.p.b) pVarI;
                w52.q0.a(this, bVar.f69299a, bVar.f69300b, r15, (i15 >> 6) & 14);
                y0Var = this;
                r15.g0(r16);
            } else {
                y0Var = this;
                if (!(pVarI instanceof f62.p.a)) {
                    throw kg.f.h(r15, 1880286339, r16);
                }
                r15.C(-1840295958);
                r15.g0(r16);
            }
            if (zD2) {
                r15.C(-1840219171);
                String strD = eVar.D();
                String str2 = eVar.getF48577a().f48057q;
                w52.y1.c(r16, strD, r15, (str2 == null || str2.length() == 0) ? 1 : r16);
                r15.g0(r16);
            } else {
                r15.C(-1840117305);
                r15.g0(r16);
            }
            if (z18) {
                r15.C(-1840078214);
                w52.m0.a(y0Var, r15, (i15 >> 6) & 14);
                r15.g0(r16);
            } else {
                r15.C(-1840034969);
                r15.g0(r16);
            }
            List<ww1.i0> listE = eVar.E();
            if (listE == null) {
                r15.C(-1839980007);
                r15.g0(r16);
            } else {
                r15.C(-1839980006);
                if (listE.isEmpty()) {
                    r15.C(-1670587615);
                    r15.g0(r16);
                } else {
                    r15.C(-1670676027);
                    w52.h.a(y0Var, eVar.getF48577a().f48041b, listE, r15, (i15 >> 6) & 14);
                    r15.g0(r16);
                }
                r15.g0(r16);
            }
            if (zD3) {
                r15.C(-1839798656);
                com.garmin.android.apps.connectmobile.workouts.data.model.a aVarF = eVar.F();
                String strU = eVar.u();
                ?? r17 = ((i15 & 14) == c14 || ((i15 & 8) != 0 && r15.r(tVar))) ? 1 : r16;
                Object objQ = r15.q();
                if (r17 == 0) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a(tVar);
                        r15.K(objQ);
                    }
                } else {
                    objQ = new a(tVar);
                    r15.K(objQ);
                }
                w52.s0.a(aVarF, strU, (e23.q) ((k23.g) objQ), r15, com.garmin.android.apps.connectmobile.workouts.data.model.a.f48070d);
                r15.g0(r16);
            } else {
                r15.C(-1839638169);
                r15.g0(r16);
            }
            if (z24) {
                r15.C(-1839600721);
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVarA = eVar.A();
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.g gVarO = eVar.o();
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.g.a aVar = gVarO instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.g.a ? (com.garmin.android.apps.connectmobile.workouts.presentation.edit.g.a) gVarO : null;
                w52.z.a(y0Var, dVarA, aVar != null ? aVar.f48994c : r16, r15, (i15 >> 6) & 14);
                r15.g0(r16);
            } else {
                r15.C(-1839423897);
                r15.g0(r16);
            }
            if (z25) {
                r15.C(-1839380776);
                new v52.b();
                o13.p pVarA2 = v52.b.a(eVar.p(), eVar.c());
                w52.b1.a(y0Var, (List) pVarA2.f128594a, (List) pVarA2.f128595b, r15, (i15 >> 6) & 14);
                r15.g0(r16);
            } else {
                r15.C(-1839089593);
                r15.g0(r16);
            }
            if (z19) {
                r15.C(-1839050192);
                w52.a0.b(y0Var, gl1.y.Q(r15, R.string.workout_procedure_title), r15, (i15 >> 6) & 14);
                r15.g0(r16);
            } else {
                r15.C(-1838966585);
                r15.g0(r16);
            }
            if (eVar.getF48577a().H() || eVar.getF48577a().F()) {
                r15.C(-1838874174);
                w52.d0.a(y0Var, r15, (i15 >> 6) & 14);
                r15.g0(r16);
                r14 = r15;
            } else {
                r15.C(-1838838617);
                r15.g0(r16);
                r14 = r15;
            }
        } else {
            y0Var = this;
            o0VarE.e();
            r14 = o0VarE;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(y0Var, tVar, eVar, i14, 14);
        }
    }
}
