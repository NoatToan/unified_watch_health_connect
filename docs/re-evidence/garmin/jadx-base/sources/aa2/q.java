package aa2;

import a42.z;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.ViewModelStoreOwner;
import b21.d7;
import b21.j0;
import c2.x2;
import ca0.o0;
import ca0.o1;
import ca0.u0;
import ca0.u1;
import ca0.y0;
import ca0.z0;
import ch.qos.logback.core.net.SyslogConstants;
import e2.i0;
import g2.m1;
import gl1.y;
import h2.c0;
import h5.e0;
import i3.fe;
import kotlin.t1;
import lc.m0;
import o53.b0;
import org.joda.time.DateTime;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.x1;
import q42.d0;
import r1.q2;
import w52.v0;
import yg2.q0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2369g;

    public /* synthetic */ q(aa1.h hVar, e23.a aVar, e23.l lVar, e23.l lVar2, e23.p pVar, e23.q qVar) {
        this.f2363a = 13;
        this.f2367e = hVar;
        this.f2365c = aVar;
        this.f2366d = lVar;
        this.f2368f = lVar2;
        this.f2369g = pVar;
        this.f2364b = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        i53.f fVar = (i53.f) this.f2367e;
        yd1.b bVar = (yd1.b) this.f2368f;
        yq1.e eVar = (yq1.e) this.f2369g;
        o82.a aVar = (o82.a) this.f2364b;
        n82.f fVar2 = (n82.f) this.f2366d;
        e23.a aVar2 = (e23.a) this.f2365c;
        u82.f fVar3 = (u82.f) obj2;
        p3.m mVar = (p3.m) obj3;
        int iC = vb.h.c((Integer) obj4, (c2.t) obj, fVar3);
        if ((iC & 48) == 0) {
            iC |= (iC & 64) == 0 ? mVar.B(fVar3) : mVar.r(fVar3) ? 32 : 16;
        }
        if (mVar.n(iC & 1, (iC & 145) != 144)) {
            x1 x1Var = p3.n.f135158a;
            boolean zR = mVar.r(eVar);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new pq1.g(eVar, 4);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new pq1.g(eVar, 4);
                    mVar.K(objQ);
                }
            }
            xq1.j.b(fVar, bVar, (e23.l) objQ, z3.f.c(-1448962045, new g52.o(fVar3, aVar, fVar2, aVar2, 1), mVar), mVar, 3072);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0375  */
    /* JADX WARN: Code duplicated, block: B:105:0x039c  */
    /* JADX WARN: Code duplicated, block: B:110:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:115:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:120:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:125:0x0421  */
    /* JADX WARN: Code duplicated, block: B:130:0x043e  */
    /* JADX WARN: Code duplicated, block: B:135:0x045d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0484  */
    /* JADX WARN: Code duplicated, block: B:173:0x0526  */
    /* JADX WARN: Code duplicated, block: B:178:0x055c  */
    /* JADX WARN: Code duplicated, block: B:212:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:244:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:254:0x0854  */
    /* JADX WARN: Code duplicated, block: B:261:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:266:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:271:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:276:0x091e  */
    /* JADX WARN: Code duplicated, block: B:284:0x097a  */
    /* JADX WARN: Code duplicated, block: B:291:0x09e1  */
    /* JADX WARN: Code duplicated, block: B:301:0x0a23  */
    /* JADX WARN: Code duplicated, block: B:306:0x0a3f  */
    /* JADX WARN: Code duplicated, block: B:315:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:322:0x0b04  */
    /* JADX WARN: Code duplicated, block: B:329:0x0b3a  */
    /* JADX WARN: Code duplicated, block: B:341:0x0bb3  */
    /* JADX WARN: Code duplicated, block: B:346:0x0bcf  */
    /* JADX WARN: Code duplicated, block: B:351:0x0bf1  */
    /* JADX WARN: Code duplicated, block: B:356:0x0c0e  */
    /* JADX WARN: Code duplicated, block: B:361:0x0c2b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        int i14;
        int i15;
        Object dVar;
        n82.f fVar;
        p3.m mVar;
        int i16 = this.f2363a;
        int i17 = 4;
        p3.m.a aVar = p3.m.f135153a;
        int i18 = 1;
        int i19 = 0;
        Object obj19 = this.f2366d;
        Object obj20 = this.f2365c;
        int i24 = 6;
        Object obj21 = this.f2364b;
        Object obj22 = this.f2369g;
        Object obj23 = this.f2368f;
        Object obj24 = this.f2367e;
        switch (i16) {
            case 0:
                u uVar = (u) obj24;
                p3.m mVar2 = (p3.m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                x1 x1Var = p3.n.f135158a;
                ((e23.r) obj23).invoke(Boolean.valueOf(((t) p0.c(uVar.f2394f, mVar2, 0).getF182175a()).f2383j), z3.f.c(959970792, new z((e23.r) obj22, uVar, (m0) obj21, (e23.a) obj20, (e23.l) obj19, 1), mVar2), mVar2, 48);
                return Unit.INSTANCE;
            case 1:
                o1 o1Var = (o1) obj24;
                m0 m0Var = (m0) obj21;
                e23.a aVar2 = (e23.a) obj20;
                l90.d dVar2 = (l90.d) obj23;
                u0 u0Var = (u0) obj22;
                e23.l lVar = (e23.l) obj19;
                lc.v vVar = (lc.v) obj2;
                p3.m mVar3 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                vVar.getClass();
                x1 x1Var2 = p3.n.f135158a;
                ta0.x xVarA = y0.a(vVar, m0Var, mVar3);
                boolean zK = mVar3.k(o1Var.ordinal()) | mVar3.r(m0Var) | mVar3.B(aVar2);
                Object objQ = mVar3.q();
                if (zK) {
                    obj5 = objQ;
                    o0 o0Var = new o0(o1Var, m0Var, aVar2);
                    mVar3.K(o0Var);
                    obj5 = o0Var;
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        obj5 = objQ;
                        o0 o0Var2 = new o0(o1Var, m0Var, aVar2);
                        mVar3.K(o0Var2);
                        obj5 = o0Var2;
                    }
                }
                obj5 = objQ;
                e23.a aVar3 = (e23.a) obj5;
                boolean zB = mVar3.B(aVar3);
                Object objQ2 = mVar3.q();
                if (zB) {
                    obj6 = objQ2;
                    as.n nVar = new as.n(aVar3, 29);
                    mVar3.K(nVar);
                    obj6 = nVar;
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        obj6 = objQ2;
                        as.n nVar2 = new as.n(aVar3, 29);
                        mVar3.K(nVar2);
                        obj6 = nVar2;
                    }
                }
                obj6 = objQ2;
                c.w.a(0, 1, (e23.a) obj6, mVar3, false);
                boolean zR = mVar3.r(m0Var);
                Object objQ3 = mVar3.q();
                if (zR) {
                    obj7 = objQ3;
                    d7 d7Var = new d7(m0Var, i24);
                    mVar3.K(d7Var);
                    obj7 = d7Var;
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        obj7 = objQ3;
                        d7 d7Var2 = new d7(m0Var, i24);
                        mVar3.K(d7Var2);
                        obj7 = d7Var2;
                    }
                }
                obj7 = objQ3;
                e23.l lVar2 = (e23.l) obj7;
                boolean zR2 = mVar3.r(m0Var);
                Object objQ4 = mVar3.q();
                if (zR2) {
                    obj8 = objQ4;
                    m mVar4 = new m(m0Var, 28);
                    mVar3.K(mVar4);
                    obj8 = mVar4;
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        obj8 = objQ4;
                        m mVar5 = new m(m0Var, 28);
                        mVar3.K(mVar5);
                        obj8 = mVar5;
                    }
                }
                obj8 = objQ4;
                e23.a aVar4 = (e23.a) obj8;
                boolean zR3 = mVar3.r(m0Var);
                Object objQ5 = mVar3.q();
                if (zR3) {
                    obj9 = objQ5;
                    m mVar6 = new m(m0Var, 29);
                    mVar3.K(mVar6);
                    obj9 = mVar6;
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        obj9 = objQ5;
                        m mVar7 = new m(m0Var, 29);
                        mVar3.K(mVar7);
                        obj9 = mVar7;
                    }
                }
                obj9 = objQ5;
                ta0.w.a(xVarA, dVar2, o1Var, lVar2, aVar4, (e23.a) obj9, aVar3, u0Var, lVar, mVar3, 0);
                return Unit.INSTANCE;
            case 2:
                u1 u1Var = (u1) obj24;
                m0 m0Var2 = (m0) obj21;
                o1 o1Var2 = (o1) obj23;
                l90.d dVar3 = (l90.d) obj22;
                e23.a aVar5 = (u0) obj19;
                e23.a aVar6 = (e23.a) obj20;
                lc.v vVar2 = (lc.v) obj2;
                p3.m mVar8 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar2.getClass();
                x1 x1Var3 = p3.n.f135158a;
                ta0.x xVarA2 = y0.a(vVar2, m0Var2, mVar8);
                p1 p1VarC = s9.c.c(xVarA2.f163475t, mVar8);
                Boolean bool = (Boolean) p1VarC.getF182175a();
                boolean zB2 = mVar8.B(p1VarC) | mVar8.B(u1Var) | mVar8.r(m0Var2);
                Object objQ6 = mVar8.q();
                if (zB2) {
                    obj10 = objQ6;
                    z0 z0Var = new z0(u1Var, m0Var2, p1VarC, null);
                    mVar8.K(z0Var);
                    obj10 = z0Var;
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        obj10 = objQ6;
                        z0 z0Var2 = new z0(u1Var, m0Var2, p1VarC, null);
                        mVar8.K(z0Var2);
                        obj10 = z0Var2;
                    }
                }
                obj10 = objQ6;
                l0.e((e23.p) obj10, bool, mVar8);
                boolean zR4 = mVar8.r(dVar3) | mVar8.r(m0Var2) | mVar8.k(o1Var2.ordinal()) | mVar8.r(xVarA2);
                Object objQ7 = mVar8.q();
                if (zR4) {
                    objQ7 = new af0.e(dVar3, m0Var2, o1Var2, xVarA2, 11);
                    mVar8.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new af0.e(dVar3, m0Var2, o1Var2, xVarA2, 11);
                        mVar8.K(objQ7);
                    }
                }
                e23.a aVar7 = (e23.a) objQ7;
                int i25 = y0.a.f26538a[o1Var2.ordinal()];
                if (i25 != 1 && i25 != 2) {
                    aVar5 = aVar6;
                }
                ta0.p0.b(o1Var2, aVar7, aVar5, mVar8, 0);
                return Unit.INSTANCE;
            case 3:
                v0 v0Var = (v0) obj24;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar2 = (com.garmin.android.apps.connectmobile.workouts.presentation.details.f) obj23;
                e23.a aVar8 = (e23.a) obj20;
                m0 m0Var3 = (m0) obj21;
                e23.l lVar3 = (e23.l) obj19;
                e23.a aVar9 = (e23.a) obj22;
                p3.m mVar9 = (p3.m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                x1 x1Var4 = p3.n.f135158a;
                boolean zR5 = mVar9.r(m0Var3);
                Object objQ8 = mVar9.q();
                if (zR5) {
                    objQ8 = new d7(m0Var3, 22);
                    mVar9.K(objQ8);
                } else {
                    aVar.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new d7(m0Var3, 22);
                        mVar9.K(objQ8);
                    }
                }
                e62.j.a(v0Var, fVar2, aVar8, (e23.l) objQ8, lVar3, aVar9, mVar9, 0);
                return Unit.INSTANCE;
            case 4:
                km1.c cVar = (km1.c) obj24;
                DateTime dateTime = (DateTime) obj23;
                sm1.s sVar = (sm1.s) obj22;
                e23.a aVar10 = (e23.a) obj20;
                e23.a aVar11 = (e23.a) obj21;
                e23.a aVar12 = (e23.a) obj19;
                Integer num = (Integer) obj2;
                int iIntValue = num.intValue();
                p3.m mVar10 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((c0) obj).getClass();
                x1 x1Var5 = p3.n.f135158a;
                m4.q qVar = (m4.q) mVar10.A(t1.f91491i);
                boolean zR6 = mVar10.r(qVar);
                Object objQ9 = mVar10.q();
                if (zR6) {
                    obj11 = objQ9;
                    en1.b.C1376b c1376b = new en1.b.C1376b(qVar, null);
                    mVar10.K(c1376b);
                    obj11 = c1376b;
                } else {
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        obj11 = objQ9;
                        en1.b.C1376b c1376b2 = new en1.b.C1376b(qVar, null);
                        mVar10.K(c1376b2);
                        obj11 = c1376b2;
                    }
                }
                obj11 = objQ9;
                l0.e((e23.p) obj11, num, mVar10);
                if (iIntValue == en1.c.SCORE.f64737a) {
                    mVar10.C(-165936364);
                    kn1.d.a(cVar, dateTime, sVar, aVar10, mVar10, km1.c.B);
                    mVar10.f();
                } else if (iIntValue == en1.c.COACH.f64737a) {
                    mVar10.C(-165708824);
                    boolean zB3 = mVar10.B(aVar11);
                    Object objQ10 = mVar10.q();
                    if (zB3) {
                        obj12 = objQ10;
                        e52.c cVar2 = new e52.c(aVar11, 4);
                        mVar10.K(cVar2);
                        obj12 = cVar2;
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            obj12 = objQ10;
                            e52.c cVar3 = new e52.c(aVar11, 4);
                            mVar10.K(cVar3);
                            obj12 = cVar3;
                        }
                    }
                    obj12 = objQ10;
                    e23.a aVar13 = (e23.a) obj12;
                    boolean zB4 = mVar10.B(aVar12);
                    Object objQ11 = mVar10.q();
                    if (zB4) {
                        obj13 = objQ11;
                        e52.c cVar4 = new e52.c(aVar12, 5);
                        mVar10.K(cVar4);
                        obj13 = cVar4;
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            obj13 = objQ11;
                            e52.c cVar5 = new e52.c(aVar12, 5);
                            mVar10.K(cVar5);
                            obj13 = cVar5;
                        }
                    }
                    obj13 = objQ11;
                    fn1.c.a(cVar, dateTime, sVar, aVar13, (e23.a) obj13, mVar10, km1.c.B);
                    mVar10.f();
                } else {
                    mVar10.C(-165279660);
                    mVar10.f();
                }
                return Unit.INSTANCE;
            case 5:
                i53.f fVar3 = (i53.f) obj24;
                yd1.b bVar = (yd1.b) obj23;
                d52.q qVar2 = (d52.q) obj22;
                o82.a aVar14 = (o82.a) obj21;
                n82.f fVar4 = (n82.f) obj19;
                e23.a aVar15 = (e23.a) obj20;
                u82.f fVar5 = (u82.f) obj2;
                p3.m mVar11 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((c2.t) obj).getClass();
                fVar5.getClass();
                x1 x1Var6 = p3.n.f135158a;
                boolean zR7 = mVar11.r(qVar2);
                Object objQ12 = mVar11.q();
                if (zR7) {
                    objQ12 = new d52.j(qVar2, 2);
                    mVar11.K(objQ12);
                } else {
                    aVar.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new d52.j(qVar2, 2);
                        mVar11.K(objQ12);
                    }
                }
                g52.r.b(fVar3, bVar, (e23.l) objQ12, z3.f.c(-1584627019, new g52.o(fVar5, aVar14, fVar4, aVar15, 0), mVar11), mVar11, 3072);
                return Unit.INSTANCE;
            case 6:
                kl1.a aVar16 = (kl1.a) obj24;
                d7 d7Var3 = (d7) obj23;
                d7 d7Var4 = (d7) obj22;
                gl1.c cVar6 = (gl1.c) obj21;
                e23.a aVar17 = (e23.a) obj20;
                m1 m1Var = (m1) obj19;
                lc.v vVar3 = (lc.v) obj2;
                p3.m mVar12 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                vVar3.getClass();
                x1 x1Var7 = p3.n.f135158a;
                t0 t0Var = s0.f105811a;
                long j8 = ((gl1.i) lc.w.a(vVar3, t0Var.b(gl1.i.class))).f77842a;
                p1 p1VarC2 = s9.c.c(vVar3.a().d(Boolean.FALSE, "REFRESH_DATA"), mVar12);
                boolean zL = mVar12.l(j8);
                Object objQ13 = mVar12.q();
                if (zL) {
                    obj14 = objQ13;
                    a90.b bVar2 = new a90.b(j8, 5);
                    mVar12.K(bVar2);
                    obj14 = bVar2;
                } else {
                    aVar.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        obj14 = objQ13;
                        a90.b bVar3 = new a90.b(j8, 5);
                        mVar12.K(bVar3);
                        obj14 = bVar3;
                    }
                }
                obj14 = objQ13;
                e23.a aVar18 = (e23.a) obj14;
                mVar12.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar12);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(hl1.n.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar12, 0), aVar18);
                mVar12.R();
                hl1.n nVar3 = (hl1.n) u1VarResolveViewModel;
                Boolean bool2 = (Boolean) p1VarC2.getF182175a();
                bool2.booleanValue();
                boolean zB5 = mVar12.B(p1VarC2) | mVar12.r(nVar3) | mVar12.r(vVar3);
                Object objQ14 = mVar12.q();
                if (zB5) {
                    obj15 = objQ14;
                    gl1.p pVar = new gl1.p(nVar3, vVar3, p1VarC2, null);
                    mVar12.K(pVar);
                    obj15 = pVar;
                } else {
                    aVar.getClass();
                    if (objQ14 == p3.m.a.f135155b) {
                        obj15 = objQ14;
                        gl1.p pVar2 = new gl1.p(nVar3, vVar3, p1VarC2, null);
                        mVar12.K(pVar2);
                        obj15 = pVar2;
                    }
                }
                obj15 = objQ14;
                l0.e((e23.p) obj15, bool2, mVar12);
                boolean zB6 = mVar12.B(d7Var3) | mVar12.l(j8);
                Object objQ15 = mVar12.q();
                if (zB6) {
                    obj16 = objQ15;
                    a6.g gVar = new a6.g(d7Var3, j8, 3);
                    mVar12.K(gVar);
                    obj16 = gVar;
                } else {
                    aVar.getClass();
                    if (objQ15 == p3.m.a.f135155b) {
                        obj16 = objQ15;
                        a6.g gVar2 = new a6.g(d7Var3, j8, 3);
                        mVar12.K(gVar2);
                        obj16 = gVar2;
                    }
                }
                obj16 = objQ15;
                e23.a aVar19 = (e23.a) obj16;
                boolean zB7 = mVar12.B(d7Var4) | mVar12.l(j8);
                Object objQ16 = mVar12.q();
                if (zB7) {
                    obj17 = objQ16;
                    a6.g gVar3 = new a6.g(d7Var4, j8, 4);
                    mVar12.K(gVar3);
                    obj17 = gVar3;
                } else {
                    aVar.getClass();
                    if (objQ16 == p3.m.a.f135155b) {
                        obj17 = objQ16;
                        a6.g gVar4 = new a6.g(d7Var4, j8, 4);
                        mVar12.K(gVar4);
                        obj17 = gVar4;
                    }
                }
                obj17 = objQ16;
                e23.a aVar20 = (e23.a) obj17;
                boolean zB8 = mVar12.B(cVar6) | mVar12.l(j8);
                Object objQ17 = mVar12.q();
                if (zB8) {
                    obj18 = objQ17;
                    gl1.l lVar4 = new gl1.l(cVar6, j8, 0);
                    mVar12.K(lVar4);
                    obj18 = lVar4;
                } else {
                    aVar.getClass();
                    if (objQ17 == p3.m.a.f135155b) {
                        obj18 = objQ17;
                        gl1.l lVar5 = new gl1.l(cVar6, j8, 0);
                        mVar12.K(lVar5);
                        obj18 = lVar5;
                    }
                }
                obj18 = objQ17;
                hl1.m.a(nVar3, aVar16, aVar19, aVar20, (e23.s) obj18, aVar17, m1Var, mVar12, 0);
                return Unit.INSTANCE;
            case 7:
                Long l14 = (Long) obj24;
                u0 u0Var2 = (u0) obj23;
                gl1.a aVar21 = (gl1.a) obj22;
                gl1.b bVar4 = (gl1.b) obj21;
                j0 j0Var = (j0) obj19;
                e23.a aVar22 = (e23.a) obj20;
                p3.m mVar13 = (p3.m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
                x1 x1Var8 = p3.n.f135158a;
                boolean zB9 = mVar13.B(l14);
                Object objQ18 = mVar13.q();
                if (zB9) {
                    i14 = 0;
                    objQ18 = new gl1.m(0, l14);
                    mVar13.K(objQ18);
                } else {
                    aVar.getClass();
                    if (objQ18 == p3.m.a.f135155b) {
                        i14 = 0;
                        objQ18 = new gl1.m(0, l14);
                        mVar13.K(objQ18);
                    } else {
                        i14 = 0;
                    }
                }
                e23.a aVar23 = (e23.a) objQ18;
                mVar13.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar13);
                if (viewModelStoreOwnerA2 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(s0.f105811a.b(ll1.e.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar13, i14), aVar23);
                mVar13.R();
                ll1.c.a((ll1.e) u1VarResolveViewModel2, u0Var2, aVar21, bVar4, j0Var, aVar22, mVar13, 0);
                return Unit.INSTANCE;
            case 8:
                b63.t tVar = (b63.t) obj23;
                kw0.f fVar6 = (kw0.f) obj22;
                pv0.r rVar = (pv0.r) obj21;
                String str = (String) obj20;
                gw0.u uVar2 = (gw0.u) obj19;
                int iIntValue2 = ((Integer) obj2).intValue();
                p3.m mVar14 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((c0) obj).getClass();
                x1 x1Var9 = p3.n.f135158a;
                int i26 = mw0.n.a.f121281a[((mw0.r) ((w13.a) obj24).get(iIntValue2)).ordinal()];
                if (i26 == 1) {
                    mVar14.C(-1802437704);
                    mw0.p.b(24576, tVar, str, fVar6, mVar14, rVar, false);
                    mVar14.f();
                } else {
                    if (i26 != 2) {
                        throw n23.j.m(mVar14, -1802439109);
                    }
                    mVar14.C(-1802428579);
                    y.a(1572864, tVar, uVar2, str, fVar6, mVar14, rVar, false);
                    mVar14.f();
                }
                return Unit.INSTANCE;
            case 9:
                n82.f fVar7 = (n82.f) obj24;
                or0.m mVar15 = (or0.m) obj23;
                lr0.a aVar24 = (lr0.a) obj22;
                Activity activity = (Activity) obj21;
                c.q qVar3 = (c.q) obj20;
                p1 p1Var = (p1) obj19;
                o82.g gVar5 = (o82.g) obj;
                o82.a aVar25 = (o82.a) obj2;
                p3.m mVar16 = (p3.m) obj3;
                int iD = vb.h.d((Integer) obj4, gVar5, aVar25);
                if ((iD & 6) == 0) {
                    i15 = (mVar16.k(gVar5.ordinal()) ? 4 : 2) | iD;
                } else {
                    i15 = iD;
                }
                if ((iD & 48) == 0) {
                    i15 |= mVar16.B(aVar25) ? 32 : 16;
                }
                if (mVar16.n(i15 & 1, (i15 & 147) != 146)) {
                    x1 x1Var10 = p3.n.f135158a;
                    boolean zB10 = mVar16.B(fVar7) | mVar16.r(mVar15) | ((i15 & 14) == 4);
                    Object objQ19 = mVar16.q();
                    if (zB10) {
                        objQ19 = new or0.l.a(fVar7, mVar15, gVar5, null);
                        mVar16.K(objQ19);
                    } else {
                        aVar.getClass();
                        if (objQ19 == p3.m.a.f135155b) {
                            objQ19 = new or0.l.a(fVar7, mVar15, gVar5, null);
                            mVar16.K(objQ19);
                        }
                    }
                    l0.e((e23.p) objQ19, gVar5, mVar16);
                    int i27 = or0.l.b.f133361a[gVar5.ordinal()];
                    int i28 = 14;
                    if (i27 != 1) {
                        int i29 = 2;
                        if (i27 == 2) {
                            mVar16.C(-1359922958);
                            u82.e.b(aVar25, mVar15.f133370i, null, false, z3.f.c(905447344, new o72.m1(3, fVar7, p1Var), mVar16), mVar16, ((i15 >> 3) & 14) | 24576, 12);
                            mVar16.f();
                        } else if (i27 == 3) {
                            mVar16.C(-1359009574);
                            u82.e.b(aVar25, mVar15.f133371j, null, false, z3.f.c(-340460593, new a6.c(fVar7, i28), mVar16), mVar16, ((i15 >> 3) & 14) | 24576, 12);
                            mVar16.f();
                        } else if (i27 != 4) {
                            mVar16.C(-1567810253);
                            mVar16.f();
                        } else {
                            mVar16.C(-1358135126);
                            u82.e.b(aVar25, mVar15.f133372k, null, false, z3.f.c(-1586368530, new ic1.k(aVar25, fVar7, i29), mVar16), mVar16, ((i15 >> 3) & 14) | 24576, 12);
                            mVar16.f();
                        }
                    } else {
                        mVar16.C(-1360817339);
                        u82.e.b(aVar25, mVar15.f133369h, null, false, z3.f.c(1797538695, new i91.e(aVar24, 20, activity, qVar3), mVar16), mVar16, ((i15 >> 3) & 14) | 24576, 12);
                        mVar16.f();
                    }
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 10:
                n82.f fVar8 = (n82.f) obj24;
                o82.a aVar26 = (o82.a) obj23;
                q42.y yVar = (q42.y) obj22;
                d0 d0Var = (d0) obj21;
                Context context = (Context) obj20;
                c.q qVar4 = (c.q) obj19;
                u82.f fVar9 = (u82.f) obj2;
                p3.m mVar17 = (p3.m) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((c2.t) obj).getClass();
                fVar9.getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= (iIntValue3 & 64) == 0 ? mVar17.B(fVar9) : mVar17.r(fVar9) ? 32 : 16;
                }
                if (mVar17.n(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    x1 x1Var11 = p3.n.f135158a;
                    int i30 = (mVar17.B(fVar8) ? 1 : 0) | (mVar17.B(aVar26) ? 1 : 0) | (mVar17.r(yVar) ? 1 : 0);
                    if ((iIntValue3 & 112) != 32 && ((iIntValue3 & 64) == 0 || !mVar17.r(fVar9))) {
                        i18 = 0;
                    }
                    int i34 = i30 | i18;
                    Object objQ20 = mVar17.q();
                    if (i34 == 0) {
                        aVar.getClass();
                        if (objQ20 == p3.m.a.f135155b) {
                            fVar = fVar8;
                            dVar = new q42.x.d(fVar, aVar26, yVar, fVar9, null);
                            mVar17.K(dVar);
                        } else {
                            dVar = objQ20;
                            fVar = fVar8;
                        }
                    } else {
                        fVar = fVar8;
                        dVar = new q42.x.d(fVar, aVar26, yVar, fVar9, null);
                        mVar17.K(dVar);
                    }
                    int i35 = l42.a.f109910e;
                    l0.e((e23.p) dVar, fVar9, mVar17);
                    l42.a aVar27 = (l42.a) fVar9.a();
                    boolean zR8 = mVar17.r(context) | mVar17.B(fVar) | mVar17.r(qVar4);
                    Object objQ21 = mVar17.q();
                    if (zR8) {
                        objQ21 = new q42.u(context, fVar, qVar4, i19);
                        mVar17.K(objQ21);
                    } else {
                        aVar.getClass();
                        if (objQ21 == p3.m.a.f135155b) {
                            objQ21 = new q42.u(context, fVar, qVar4, i19);
                            mVar17.K(objQ21);
                        }
                    }
                    t42.p.a(yVar, d0Var, aVar27, (e23.a) objQ21, mVar17, i35 << 6);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 11:
                ba1.d dVar4 = (ba1.d) obj24;
                fe feVar = (fe) obj23;
                m0 m0Var4 = (m0) obj21;
                Context context2 = (Context) obj22;
                c.q qVar5 = (c.q) obj20;
                Activity activity2 = (Activity) obj19;
                p3.m mVar18 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                x1 x1Var12 = p3.n.f135158a;
                aa1.e eVar = (aa1.e) s9.c.c(dVar4.B, mVar18).getF182175a();
                boolean zR9 = mVar18.r(dVar4) | mVar18.r(m0Var4);
                Object objQ22 = mVar18.q();
                if (zR9) {
                    objQ22 = new w91.a(dVar4, m0Var4, i18);
                    mVar18.K(objQ22);
                } else {
                    aVar.getClass();
                    if (objQ22 == p3.m.a.f135155b) {
                        objQ22 = new w91.a(dVar4, m0Var4, i18);
                        mVar18.K(objQ22);
                    }
                }
                e23.l lVar6 = (e23.l) objQ22;
                boolean zR10 = mVar18.r(dVar4) | mVar18.r(context2) | mVar18.r(qVar5);
                Object objQ23 = mVar18.q();
                if (zR10) {
                    objQ23 = new w91.e(dVar4, context2, qVar5, 0);
                    mVar18.K(objQ23);
                } else {
                    aVar.getClass();
                    if (objQ23 == p3.m.a.f135155b) {
                        objQ23 = new w91.e(dVar4, context2, qVar5, 0);
                        mVar18.K(objQ23);
                    }
                }
                e23.p pVar3 = (e23.p) objQ23;
                boolean zR11 = mVar18.r(dVar4);
                Object objQ24 = mVar18.q();
                if (zR11) {
                    objQ24 = new w91.s(dVar4);
                    mVar18.K(objQ24);
                } else {
                    aVar.getClass();
                    if (objQ24 == p3.m.a.f135155b) {
                        objQ24 = new w91.s(dVar4);
                        mVar18.K(objQ24);
                    }
                }
                e23.a aVar28 = (e23.a) ((k23.g) objQ24);
                boolean zR12 = mVar18.r(dVar4) | mVar18.r(m0Var4);
                Object objQ25 = mVar18.q();
                if (zR12) {
                    objQ25 = new w91.d(dVar4, m0Var4, i17);
                    mVar18.K(objQ25);
                } else {
                    aVar.getClass();
                    if (objQ25 == p3.m.a.f135155b) {
                        objQ25 = new w91.d(dVar4, m0Var4, i17);
                        mVar18.K(objQ25);
                    }
                }
                e23.a aVar29 = (e23.a) objQ25;
                boolean zR13 = mVar18.r(dVar4) | mVar18.r(m0Var4);
                Object objQ26 = mVar18.q();
                if (zR13) {
                    objQ26 = new w91.c(dVar4, m0Var4, i18);
                    mVar18.K(objQ26);
                } else {
                    aVar.getClass();
                    if (objQ26 == p3.m.a.f135155b) {
                        objQ26 = new w91.c(dVar4, m0Var4, i18);
                        mVar18.K(objQ26);
                    }
                }
                e23.p pVar4 = (e23.p) objQ26;
                boolean zR14 = mVar18.r(activity2) | mVar18.r(dVar4);
                Object objQ27 = mVar18.q();
                if (zR14) {
                    objQ27 = new w91.b(activity2, dVar4, 1);
                    mVar18.K(objQ27);
                } else {
                    aVar.getClass();
                    if (objQ27 == p3.m.a.f135155b) {
                        objQ27 = new w91.b(activity2, dVar4, 1);
                        mVar18.K(objQ27);
                    }
                }
                e23.l lVar7 = (e23.l) objQ27;
                boolean zR15 = mVar18.r(dVar4);
                Object objQ28 = mVar18.q();
                if (zR15) {
                    objQ28 = new w91.t(dVar4);
                    mVar18.K(objQ28);
                } else {
                    aVar.getClass();
                    if (objQ28 == p3.m.a.f135155b) {
                        objQ28 = new w91.t(dVar4);
                        mVar18.K(objQ28);
                    }
                }
                e23.a aVar30 = (e23.a) ((k23.g) objQ28);
                boolean zR16 = mVar18.r(context2);
                Object objQ29 = mVar18.q();
                if (zR16) {
                    objQ29 = new tz1.h(context2, 15);
                    mVar18.K(objQ29);
                } else {
                    aVar.getClass();
                    if (objQ29 == p3.m.a.f135155b) {
                        objQ29 = new tz1.h(context2, 15);
                        mVar18.K(objQ29);
                    }
                }
                e23.a aVar31 = (e23.a) objQ29;
                b.u uVar3 = (b.u) mVar18.A(g02.d.f74342a);
                boolean zR17 = mVar18.r(uVar3);
                Object objQ30 = mVar18.q();
                if (zR17) {
                    objQ30 = new w91.u(uVar3);
                    mVar18.K(objQ30);
                } else {
                    aVar.getClass();
                    if (objQ30 == p3.m.a.f135155b) {
                        objQ30 = new w91.u(uVar3);
                        mVar18.K(objQ30);
                    }
                }
                x91.o.a(eVar, feVar, lVar6, pVar3, aVar28, aVar29, pVar4, lVar7, aVar30, aVar31, (e23.a) ((k23.g) objQ30), mVar18, 48, 0);
                return Unit.INSTANCE;
            case 12:
                aa1.e eVar2 = (aa1.e) obj24;
                p1 p1Var2 = (p1) obj23;
                e23.p pVar5 = (e23.p) obj22;
                e23.p pVar6 = (e23.p) obj21;
                p3.o1 o1Var3 = (p3.o1) obj20;
                p1 p1Var3 = (p1) obj19;
                int iIntValue4 = ((Integer) obj2).intValue();
                p3.m mVar19 = (p3.m) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= mVar19.k(iIntValue4) ? 32 : 16;
                }
                if (mVar19.n(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                    x1 x1Var13 = p3.n.f135158a;
                    aa1.d dVar5 = eVar2.f2269k.get(iIntValue4);
                    h4.r.a aVar32 = h4.r.S;
                    h4.r rVarF = x2.f(aVar32, 1.0f);
                    q91.d dVar6 = eVar2.f2262d;
                    boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                    boolean z14 = iIntValue4 == 0;
                    Object objQ31 = mVar19.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ31 == c2565a) {
                        objQ31 = new x1.b(21);
                        mVar19.K(objQ31);
                    }
                    e23.a aVar33 = (e23.a) objQ31;
                    Object objQ32 = mVar19.q();
                    if (objQ32 == c2565a) {
                        objQ32 = new x1.b(26);
                        mVar19.K(objQ32);
                    }
                    e23.a aVar34 = (e23.a) objQ32;
                    boolean zB11 = mVar19.B(pVar6);
                    Object objQ33 = mVar19.q();
                    if (zB11 || objQ33 == c2565a) {
                        objQ33 = new uj1.y(pVar6, 13);
                        mVar19.K(objQ33);
                    }
                    e23.p pVar7 = (e23.p) objQ33;
                    boolean zB12 = mVar19.B(o1Var3) | mVar19.B(p1Var3);
                    Object objQ34 = mVar19.q();
                    if (zB12 || objQ34 == c2565a) {
                        objQ34 = new x91.e(o1Var3, p1Var3, 1);
                        mVar19.K(objQ34);
                    }
                    u91.h.b(rVarF, dVar5, dVar6, false, zBooleanValue, false, z14, false, pVar5, aVar33, aVar34, pVar7, (e23.p) objQ34, mVar19, 805309446, 6, SyslogConstants.LOG_LOCAL4);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar32, j92.b.f97899b.f97920e), mVar19);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 13:
                aa1.h hVar = (aa1.h) obj24;
                e23.a aVar35 = (e23.a) obj20;
                e23.l lVar8 = (e23.l) obj19;
                e23.l lVar9 = (e23.l) obj23;
                e23.p pVar8 = (e23.p) obj22;
                e23.q qVar6 = (e23.q) obj21;
                int iIntValue6 = ((Integer) obj2).intValue();
                p3.m mVar20 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((c0) obj).getClass();
                x1 x1Var14 = p3.n.f135158a;
                h4.r rVarE = u1.n.e(x2.d(h4.r.S, 1.0f), tn.k.a(d92.b.f58623a, mVar20), o4.m1.f128891a);
                h4.d.f81522a.getClass();
                f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iHashCode = Long.hashCode(mVar20.getU());
                i2 i2VarX = mVar20.x();
                h4.r rVarC = h4.k.c(rVarE, mVar20);
                h5.g.V.getClass();
                e0.a aVar36 = h5.g.a.f81805b;
                if (mVar20.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar20.z();
                if (mVar20.getT()) {
                    mVar20.M(aVar36);
                } else {
                    mVar20.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, mVar20);
                b4.c(h5.g.a.f81809f, i2VarX, mVar20);
                h5.g.a.b bVar5 = h5.g.a.f81813j;
                if (mVar20.getT() || !p005kotlin.jvm.internal.s.g(mVar20.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar20, iHashCode, bVar5);
                }
                b4.c(h5.g.a.f81807d, rVarC, mVar20);
                c2.u uVar4 = c2.u.f22885a;
                if (hVar.f2290b) {
                    mVar20.C(-2005723312);
                    x91.m.a(aVar35, mVar20, 0);
                    mVar20.f();
                    mVar = mVar20;
                } else if (hVar.f2289a) {
                    mVar = mVar20;
                    mVar.C(-2004338015);
                    mVar.f();
                } else {
                    mVar20.C(-2005527733);
                    q91.g gVar6 = (q91.g) h0.e0(iIntValue6, hVar.f2294f);
                    aa1.i iVar = gVar6 != null ? hVar.f2295g.get(gVar6) : null;
                    if (iVar == null) {
                        mVar20.C(-2005219098);
                        mVar20.f();
                        mVar = mVar20;
                    } else {
                        mVar20.C(-2005219097);
                        if (iVar.f2299a.isEmpty()) {
                            mVar20.C(-787277120);
                            x91.s.a(gVar6, mVar20, 0);
                            mVar20.f();
                            mVar = mVar20;
                        } else {
                            mVar20.C(-787148408);
                            x91.s.b(iVar, lVar8, lVar9, pVar8, qVar6, mVar20, 0);
                            mVar = mVar20;
                            mVar.f();
                        }
                        mVar.f();
                    }
                    mVar.f();
                }
                mVar.y();
                return Unit.INSTANCE;
            case 14:
                return a(obj, obj2, obj3, obj4);
            default:
                yg2.a aVar37 = (yg2.a) obj24;
                yg2.o oVar = (yg2.o) obj23;
                yg2.h0 h0Var = (yg2.h0) obj22;
                yg2.u0 u0Var3 = (yg2.u0) obj21;
                i0 i0Var = (i0) obj20;
                b0 b0Var = (b0) obj19;
                ((Integer) obj2).getClass();
                p3.m mVar21 = (p3.m) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if (mVar21.n(iIntValue7 & 1, (iIntValue7 & 129) != 128)) {
                    x1 x1Var15 = p3.n.f135158a;
                    h4.r rVarE2 = u1.n.e(h4.r.S, tn.k.a(d92.b.f58623a, mVar21), o4.m1.f128891a);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar21.getU());
                    i2 i2VarX2 = mVar21.x();
                    h4.r rVarC2 = h4.k.c(rVarE2, mVar21);
                    h5.g.V.getClass();
                    e0.a aVar38 = h5.g.a.f81805b;
                    if (mVar21.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar21.z();
                    if (mVar21.getT()) {
                        mVar21.M(aVar38);
                    } else {
                        mVar21.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD2, mVar21);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar21);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar21.getT() || !p005kotlin.jvm.internal.s.g(mVar21.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar21, iHashCode2, bVar6);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar21);
                    c2.u uVar5 = c2.u.f22885a;
                    q0.b(aVar37, oVar, h0Var, u0Var3, i0Var, b0Var, false, mVar21, 0, 64);
                    mVar21.y();
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ q(int i14, e23.a aVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f2363a = i14;
        this.f2367e = obj;
        this.f2368f = obj2;
        this.f2369g = obj3;
        this.f2364b = obj4;
        this.f2366d = obj5;
        this.f2365c = aVar;
    }

    public /* synthetic */ q(ba1.d dVar, fe feVar, m0 m0Var, Context context, c.q qVar, Activity activity) {
        this.f2363a = 11;
        this.f2367e = dVar;
        this.f2368f = feVar;
        this.f2364b = m0Var;
        this.f2369g = context;
        this.f2365c = qVar;
        this.f2366d = activity;
    }

    public /* synthetic */ q(o1 o1Var, m0 m0Var, e23.a aVar, l90.d dVar, u0 u0Var, e23.l lVar) {
        this.f2363a = 1;
        this.f2367e = o1Var;
        this.f2364b = m0Var;
        this.f2365c = aVar;
        this.f2368f = dVar;
        this.f2369g = u0Var;
        this.f2366d = lVar;
    }

    public /* synthetic */ q(u1 u1Var, m0 m0Var, o1 o1Var, l90.d dVar, u0 u0Var, e23.a aVar) {
        this.f2363a = 2;
        this.f2367e = u1Var;
        this.f2364b = m0Var;
        this.f2368f = o1Var;
        this.f2369g = dVar;
        this.f2366d = u0Var;
        this.f2365c = aVar;
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i14) {
        this.f2363a = i14;
        this.f2367e = obj;
        this.f2368f = obj2;
        this.f2369g = obj3;
        this.f2364b = obj4;
        this.f2365c = obj5;
        this.f2366d = obj6;
    }

    public /* synthetic */ q(km1.c cVar, DateTime dateTime, sm1.s sVar, e23.a aVar, e23.a aVar2, e23.a aVar3) {
        this.f2363a = 4;
        this.f2367e = cVar;
        this.f2368f = dateTime;
        this.f2369g = sVar;
        this.f2365c = aVar;
        this.f2364b = aVar2;
        this.f2366d = aVar3;
    }

    public /* synthetic */ q(v0 v0Var, com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, e23.a aVar, m0 m0Var, e23.l lVar, e23.a aVar2) {
        this.f2363a = 3;
        this.f2367e = v0Var;
        this.f2368f = fVar;
        this.f2365c = aVar;
        this.f2364b = m0Var;
        this.f2366d = lVar;
        this.f2369g = aVar2;
    }
}
