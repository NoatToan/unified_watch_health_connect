package lm0;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.w;
import c2.b0;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import h4.r;
import h5.e0;
import ho.d0;
import i3.i7;
import i3.mh;
import java.util.List;
import l3.p1;
import l30.y0;
import l72.c1;
import l72.r1;
import o4.m1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import v62.c6;

/* JADX INFO: loaded from: classes8.dex */
public final class p {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(km0.e eVar, e23.l<? super km0.e, Unit> lVar, p3.m mVar, int i14) {
        e23.l<? super km0.e, Unit> lVar2;
        boolean z14;
        Object d0Var;
        km0.e eVar2;
        boolean z15;
        lVar.getClass();
        o0 o0VarE = mVar.E(691940093);
        int i15 = (o0VarE.B(eVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = ((jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null)).v(context);
                o0VarE.K(objQ);
            }
            List list = (List) objQ;
            g.h hVar = new g.h();
            int i16 = i15 & 14;
            int i17 = i15 & 112;
            boolean zR = o0VarE.r(context) | (i16 == 4) | (i17 == 32);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new k62.k(27, context, eVar, lVar);
                o0VarE.K(objQ2);
            }
            c.q qVarC = w.c(hVar, (e23.l) objQ2, o0VarE, 0);
            g.e eVar3 = new g.e();
            boolean zR2 = o0VarE.r(activity) | o0VarE.r(qVarC);
            Object objQ3 = o0VarE.q();
            if (zR2 || objQ3 == c2565a) {
                objQ3 = new p1(15, activity, qVarC);
                o0VarE.K(objQ3);
            }
            c.q qVarC2 = w.c(eVar3, (e23.l) objQ3, o0VarE, 0);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p3.p1 p1Var = (p3.p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n(null);
                o0VarE.K(objQ5);
            }
            p3.p1 p1Var2 = (p3.p1) objQ5;
            r.a aVar = r.S;
            r rVarF = x2.f(u1.n.e(aVar, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a), 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            boolean zR3 = o0VarE.r(qVarC2);
            Object objQ6 = o0VarE.q();
            if (zR3 || objQ6 == c2565a) {
                z14 = true;
                objQ6 = new ib0.n(qVarC2, 1);
                o0VarE.K(objQ6);
            } else {
                z14 = true;
            }
            e23.a aVar3 = (e23.a) objQ6;
            boolean zR4 = (i16 != 4 ? false : z14) | o0VarE.r(activity) | o0VarE.r(qVarC) | o0VarE.r(context);
            Object objQ7 = o0VarE.q();
            if (zR4 || objQ7 == c2565a) {
                eVar2 = eVar;
                d0Var = new d0(eVar2, activity, qVarC, context, 19);
                o0VarE.K(d0Var);
            } else {
                d0Var = objQ7;
                eVar2 = eVar;
            }
            b(eVar2, aVar3, (e23.a) d0Var, o0VarE, i16);
            lVar2 = lVar;
            r1.b(gl1.y.Q(o0VarE, R.string.lbl_stock_photos), z3.f.c(1406967182, new ix.h(list, eVar2, lVar2, p1Var2, p1Var, 18), o0VarE), o0VarE, 48, 0);
            String strQ = gl1.y.Q(o0VarE, R.string.msg_group_photo_is_public);
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            d92.b.f58625c.getClass();
            boolean z16 = z14;
            mh.c(strQ, c2.l.A(aVar, j92.b.f97899b.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(z16);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(2046177625);
                c1 c1Var = c1.f110940a;
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_select_another_photo_title);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_select_another_photo_description);
                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_common_continue);
                if (i17 != 32) {
                    z16 = false;
                }
                Object objQ8 = o0VarE.q();
                if (z16 || objQ8 == c2565a) {
                    z15 = false;
                    objQ8 = new o(p1Var2, lVar2, p1Var, 0);
                    o0VarE.K(objQ8);
                } else {
                    z15 = false;
                }
                e23.a<Unit> aVar4 = (e23.a) objQ8;
                String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                Object objQ9 = o0VarE.q();
                if (objQ9 == c2565a) {
                    objQ9 = new l51.c(p1Var, 27);
                    o0VarE.K(objQ9);
                }
                c1Var.a(false, strQ2, strQ3, null, null, strQ4, false, false, aVar4, strQ5, (e23.a) objQ9, o0VarE, 0, 6, 217);
                o0VarE = o0VarE;
                o0VarE.g0(z15);
            } else {
                o0VarE.C(2046742693);
                o0VarE.g0(false);
            }
        } else {
            lVar2 = lVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(eVar, lVar2, i14, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0102  */
    /* JADX WARN: Code duplicated, block: B:41:0x013c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0142  */
    /* JADX WARN: Code duplicated, block: B:44:0x0197  */
    /* JADX WARN: Code duplicated, block: B:46:0x019b  */
    /* JADX WARN: Code duplicated, block: B:48:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:59:0x0202  */
    /* JADX WARN: Code duplicated, block: B:61:0x0209  */
    /* JADX WARN: Code duplicated, block: B:62:0x020d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0228  */
    /* JADX WARN: Code duplicated, block: B:70:0x0287  */
    /* JADX WARN: Code duplicated, block: B:71:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:73:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:75:0x02bc  */
    public static final void b(km0.e eVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        long jA;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        u uVar;
        boolean z14;
        Object objQ;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        int i15;
        r.a aVar3;
        boolean z15;
        u uVar2;
        o0 o0VarE = mVar.E(380046400);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.B(eVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar4 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarG = c2.l.g(x2.f(c2.l.y(aVar4, j92.b.f97899b.f97920e), 1.0f), 2.0833333f);
            float f14 = 1;
            g6.f.a aVar5 = g6.f.f75994b;
            if (eVar != null) {
                o0VarE.C(152383753);
                jA = d92.b.a(o0VarE).j().d();
            } else {
                o0VarE.C(152384806);
                jA = d92.b.a(o0VarE).j().a();
            }
            o0VarE.g0(false);
            m1.a aVar6 = m1.f128891a;
            r rVarB = u1.q.b(f14, jA, rVarG, aVar6);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81524b;
            z0 z0VarD2 = c2.q.d(gVar, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar7 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                uVar = u.f22885a;
                if (eVar instanceof km0.e.a) {
                    o0VarE.C(-929561684);
                    t4.d dVarA = n5.c.a(((km0.e.a) eVar).f105317a, o0VarE, 0);
                    f5.k.f68985a.getClass();
                    aVar3 = aVar4;
                    u1.y0.a(dVarA, null, x2.d(aVar4, 1.0f), null, f5.k.a.f68987b, 0.0f, null, o0VarE, 25008, 104);
                    o0VarE.g0(false);
                    i15 = i16;
                    uVar2 = uVar;
                    z15 = true;
                } else if (eVar instanceof km0.e.b) {
                    o0VarE.C(-929245081);
                    o0VarE.N(-1276895761, eVar);
                    wf.f.a aVar8 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                    aVar8.f184930c = ((km0.e.b) eVar).f105320b;
                    wf.c cVar3 = wf.c.DISABLED;
                    aVar8.f184942o = cVar3;
                    aVar8.f184943p = cVar3;
                    wf.f fVarA = aVar8.a();
                    f5.k.f68985a.getClass();
                    aVar3 = aVar4;
                    jf.r.a(fVarA, null, x2.d(aVar4, 1.0f), null, null, f5.k.a.f68987b, null, o0VarE, 1573296, 1976);
                    o0VarE.g0(false);
                    o0VarE.g0(false);
                    z15 = true;
                    i15 = i16;
                    uVar2 = uVar;
                } else {
                    if (eVar == null) {
                        throw kg.f.h(o0VarE, -1276912921, false);
                    }
                    o0VarE.C(-928477552);
                    r rVarE = u1.n.e(x2.d(aVar4, 1.0f), d92.b.a(o0VarE).c().g(), aVar6);
                    if ((i16 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objQ = o0VarE.q();
                    if (z14) {
                        objQ = new ll0.a(aVar, 1);
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ll0.a(aVar, 1);
                            o0VarE.K(objQ);
                        }
                    }
                    r rVarD = u1.w.d(rVarE, false, null, null, (e23.a) objQ, 15);
                    z0VarD = c2.q.d(gVar, false);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarD, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar7);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA0, o0VarE);
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    String strQ = gl1.y.Q(o0VarE, R.string.lbl_group_upload_a_photo);
                    d92.b.f58624b.getClass();
                    i15 = i16;
                    aVar3 = aVar4;
                    z15 = true;
                    uVar2 = uVar;
                    mh.c(strQ, uVar.c(aVar4, h4.d.a.f81528f), hb.a.e(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, o0VarE, 0, 0, 131064);
                    o0VarE = o0VarE;
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                }
                if (eVar != null) {
                    o0VarE.C(-927864620);
                    c(uVar2.c(aVar3, h4.d.a.f81526d), eVar instanceof km0.e.b, aVar, aVar2, o0VarE, (i15 << 3) & 8064);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-927580164);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z15);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            uVar = u.f22885a;
            if (eVar instanceof km0.e.a) {
                o0VarE.C(-929561684);
                t4.d dVarA2 = n5.c.a(((km0.e.a) eVar).f105317a, o0VarE, 0);
                f5.k.f68985a.getClass();
                aVar3 = aVar4;
                u1.y0.a(dVarA2, null, x2.d(aVar4, 1.0f), null, f5.k.a.f68987b, 0.0f, null, o0VarE, 25008, 104);
                o0VarE.g0(false);
                i15 = i16;
                uVar2 = uVar;
                z15 = true;
            } else if (eVar instanceof km0.e.b) {
                o0VarE.C(-929245081);
                o0VarE.N(-1276895761, eVar);
                wf.f.a aVar9 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                aVar9.f184930c = ((km0.e.b) eVar).f105320b;
                wf.c cVar4 = wf.c.DISABLED;
                aVar9.f184942o = cVar4;
                aVar9.f184943p = cVar4;
                wf.f fVarA2 = aVar9.a();
                f5.k.f68985a.getClass();
                aVar3 = aVar4;
                jf.r.a(fVarA2, null, x2.d(aVar4, 1.0f), null, null, f5.k.a.f68987b, null, o0VarE, 1573296, 1976);
                o0VarE.g0(false);
                o0VarE.g0(false);
                z15 = true;
                i15 = i16;
                uVar2 = uVar;
            } else {
                if (eVar == null) {
                    throw kg.f.h(o0VarE, -1276912921, false);
                }
                o0VarE.C(-928477552);
                r rVarE2 = u1.n.e(x2.d(aVar4, 1.0f), d92.b.a(o0VarE).c().g(), aVar6);
                if ((i16 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ = o0VarE.q();
                if (z14) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ll0.a(aVar, 1);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new ll0.a(aVar, 1);
                    o0VarE.K(objQ);
                }
                r rVarD2 = u1.w.d(rVarE2, false, null, null, (e23.a) objQ, 15);
                z0VarD = c2.q.d(gVar, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarD2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_group_upload_a_photo);
                d92.b.f58624b.getClass();
                i15 = i16;
                aVar3 = aVar4;
                z15 = true;
                uVar2 = uVar;
                mh.c(strQ2, uVar.c(aVar4, h4.d.a.f81528f), hb.a.e(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, o0VarE, 0, 0, 131064);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
            if (eVar != null) {
                o0VarE.C(-927864620);
                c(uVar2.c(aVar3, h4.d.a.f81526d), eVar instanceof km0.e.b, aVar, aVar2, o0VarE, (i15 << 3) & 8064);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-927580164);
                o0VarE.g0(false);
            }
            o0VarE.g0(z15);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lb0.a((Object) eVar, (Object) aVar, (Object) aVar2, i14, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(r rVar, boolean z14, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        int i15;
        e23.a aVar3;
        boolean z15;
        o0 o0VarE = mVar.E(-567993907);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarY = c2.l.y(rVar, eVar.f97919d);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar = u.f22885a;
            r.a aVar5 = r.S;
            bVar.getClass();
            r rVarE = u1.n.e(l4.k.b(x2.q(aVar5, eVar.f97921f), k2.i.f102406a), ds.e0.f(o0VarE), m1.f128891a);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new l51.c(p1Var, 25);
                o0VarE.K(objQ2);
            }
            r rVarD = u1.w.d(rVarE, false, null, null, (e23.a) objQ2, 15);
            z0 z0VarD2 = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarD, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            s62.a.f157643a.getClass();
            u4.d dVarA = c6.a(t62.b.f162798a);
            long jB = d92.b.a(o0VarE).f().b();
            bVar.getClass();
            i7.b(dVarA, null, x2.q(aVar5, eVar.f97920e), jB, o0VarE, 48, 0);
            o0VarE.g0(true);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new l51.c(p1Var, 26);
                o0VarE.K(objQ3);
            }
            z15 = z14;
            aVar3 = aVar;
            i3.u.a(zBooleanValue, (e23.a) objQ3, null, 0L, null, null, null, ds.e0.w(o0VarE), 0.0f, 0.0f, z3.f.c(46912824, new h21.m(aVar3, z15, aVar2, p1Var), o0VarE), o0VarE, 48, 48, 1916);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            aVar3 = aVar;
            z15 = z14;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i((Object) rVar, z15, aVar3, aVar2, i14, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    public static final void d(int i14, int i15, int i16, e23.a aVar, p3.m mVar, boolean z14) {
        o0 o0VarE = mVar.E(2064672063);
        int i17 = i16 | (o0VarE.k(i14) ? 4 : 2) | (o0VarE.k(i15) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i17 & 1, (i17 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            long jA = d92.b.a(o0VarE).f().a();
            t4.d dVarA = n5.c.a(i14, o0VarE, i17 & 14);
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarU = x2.u(r.S, i15);
            boolean zL = o0VarE.l(jA);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zL) {
                objQ = new j82.d(jA, 11);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j82.d(jA, 11);
                    o0VarE.K(objQ);
                }
            }
            r rVarA = wz1.i.a((e23.l) objQ, rVarU, z14);
            boolean z15 = (i17 & 7168) == 2048;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new ll0.a(aVar, 2);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ll0.a(aVar, 2);
                    o0VarE.K(objQ2);
                }
            }
            u1.y0.a(dVarA, null, u1.w.d(rVarA, false, null, null, (e23.a) objQ2, 15), null, null, 0.0f, null, o0VarE, 48, 120);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c.f(i14, i15, z14, aVar, i16);
        }
    }
}
