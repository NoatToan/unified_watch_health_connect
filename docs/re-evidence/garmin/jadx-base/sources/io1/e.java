package io1;

import am.j;
import c2.b0;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.mlkit.common.MlKitException;
import e23.l;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import k2.i;
import o4.f0;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;
import v.h;
import yc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0123  */
    /* JADX WARN: Code duplicated, block: B:54:0x015a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final com.garmin.android.apps.connectmobile.tag.b bVar, final l lVar, m mVar, final int i14) {
        final int i15;
        bVar.getClass();
        o0 o0VarE = mVar.E(706359845);
        int i16 = (o0VarE.r(bVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        final int i17 = 0;
        int i18 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            zc.d dVarA = zc.g.a(bVar.f45064e, o0VarE);
            p1 p1VarC = p0.c(bVar.f45062c, o0VarE, 0);
            if (dVarA.b() == 0) {
                cs1.f fVar = bVar.f45063d;
                if (fVar != null) {
                    fVar.v3(com.garmin.android.apps.connectmobile.tag.a.e.f45057a);
                }
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p() { // from class: io1.b
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i19 = i17;
                            m mVar2 = (m) obj;
                            ((Integer) obj2).getClass();
                            switch (i19) {
                                case 0:
                                    e.a(bVar, lVar, mVar2, p0.t(i14 | 1));
                                    break;
                                default:
                                    e.a(bVar, lVar, mVar2, p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            s sVarD = dVarA.d();
            boolean zR = o0VarE.r(dVarA) | o0VarE.r(bVar);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zR) {
                objQ = new c(dVarA, bVar, null);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new c(dVarA, bVar, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((p) objQ, sVarD, o0VarE);
            r.a aVar2 = r.S;
            r rVarE = u1.n.e(x2.d(aVar2, 1.0f), j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            r rVarD = x2.d(aVar2, 1.0f);
            boolean zR2 = ((i16 & 112) == 32) | o0VarE.r(dVarA);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new dl0.e(dVarA, lVar, i18);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new dl0.e(dVarA, lVar, i18);
                    o0VarE.K(objQ2);
                }
            }
            e2.c.b(rVarD, null, null, null, null, null, false, null, (l) objQ2, o0VarE, 6, 510);
            String str = (String) p1VarC.getF182175a();
            boolean zR3 = o0VarE.r(dVarA);
            Object objQ3 = o0VarE.q();
            if (zR3) {
                objQ3 = new d(dVarA, null);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new d(dVarA, null);
                    o0VarE.K(objQ3);
                }
            }
            l0.e((p) objQ3, str, o0VarE);
            i15 = 1;
            o0VarE.g0(true);
        } else {
            i15 = 1;
            o0VarE.e();
        }
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new p() { // from class: io1.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = i15;
                    m mVar2 = (m) obj;
                    ((Integer) obj2).getClass();
                    switch (i19) {
                        case 0:
                            e.a(bVar, lVar, mVar2, p0.t(i14 | 1));
                            break;
                        default:
                            e.a(bVar, lVar, mVar2, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0104  */
    /* JADX WARN: Code duplicated, block: B:25:0x010b  */
    /* JADX WARN: Code duplicated, block: B:26:0x010f  */
    /* JADX WARN: Code duplicated, block: B:31:0x012a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0178  */
    public static final void b(m mVar, int i14) {
        p3.c<?> cVar;
        h5.g.a.f fVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        o0 o0VarE = mVar.E(-439002169);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            long jD = f0.d(4283189837L);
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarY = c2.l.y(rVarF, eVar.f97920e);
            long jB = p6.b.b(o0VarE);
            m1.a aVar2 = m1.f128891a;
            r rVarE = u1.n.e(rVarY, jB, aVar2);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                bVar.getClass();
                q.a(u1.n.e(l4.k.b(x2.q(aVar, j92.b.f97901d.f97906e), i.f102406a), jD, aVar2), o0VarE, 0);
                bVar.getClass();
                float f14 = eVar.f97920e;
                bVar.getClass();
                float f15 = eVar.f97917b;
                bVar.getClass();
                r rVarC3 = c2.l.C(aVar, f14, f15, 0.0f, eVar.f97917b, 4);
                zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarC3, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                bVar.getClass();
                r rVarH = x2.h(aVar, eVar.f97919d);
                float f16 = MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD;
                g6.f.a aVar4 = g6.f.f75994b;
                c2.l.f(u1.n.e(x2.u(rVarH, f16), jD, aVar2), o0VarE);
                bVar.getClass();
                r rVarC4 = c2.l.C(aVar, 0.0f, eVar.f97919d, 0.0f, 0.0f, 13);
                bVar.getClass();
                c2.l.f(u1.n.e(x2.u(x2.h(rVarC4, eVar.f97918c), 110), jD, aVar2), o0VarE);
                o0VarE.g0(true);
                o0VarE.g0(true);
            }
            h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var2 = u2.f22900a;
            bVar.getClass();
            q.a(u1.n.e(l4.k.b(x2.q(aVar, j92.b.f97901d.f97906e), i.f102406a), jD, aVar2), o0VarE, 0);
            bVar.getClass();
            float f17 = eVar.f97920e;
            bVar.getClass();
            float f18 = eVar.f97917b;
            bVar.getClass();
            r rVarC5 = c2.l.C(aVar, f17, f18, 0.0f, eVar.f97917b, 4);
            zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarC5, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                h.A(iHashCode, o0VarE, iHashCode, bVar3);
            } else {
                h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            bVar.getClass();
            r rVarH2 = x2.h(aVar, eVar.f97919d);
            float f19 = MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD;
            g6.f.a aVar5 = g6.f.f75994b;
            c2.l.f(u1.n.e(x2.u(rVarH2, f19), jD, aVar2), o0VarE);
            bVar.getClass();
            r rVarC6 = c2.l.C(aVar, 0.0f, eVar.f97919d, 0.0f, 0.0f, 13);
            bVar.getClass();
            c2.l.f(u1.n.e(x2.u(x2.h(rVarC6, eVar.f97918c), 110), jD, aVar2), o0VarE);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new in2.e(i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    public static final void c(ds1.a aVar, l lVar, m mVar, int i14) {
        int i15;
        String str = aVar.f61094d;
        o0 o0VarE = mVar.E(2122553510);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            r.a aVar2 = r.S;
            r rVarX = x2.x(x2.f(aVar2, 1.0f), null, 3);
            bVar.getClass();
            float f15 = eVar.f97922g;
            bVar.getClass();
            float f16 = f15 + eVar.f97923h;
            g6.f.a aVar3 = g6.f.f75994b;
            r rVarJ = x2.j(rVarX, f16, 0.0f, 2);
            bVar.getClass();
            r rVarY = c2.l.y(rVarJ, eVar.f97920e);
            boolean z14 = ((i16 & 112) == 32) | ((i16 & 14) == 4 || ((i16 & 8) != 0 && o0VarE.r(aVar)));
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new i91.c(12, lVar, aVar);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new i91.c(12, lVar, aVar);
                    o0VarE.K(objQ);
                }
            }
            r rVarD = w.d(rVarY, false, null, null, (e23.a) objQ, 15);
            s2 s2VarA = q2.a(iVarI, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarD, o0VarE);
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
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            String strQ = gl1.y.Q(o0VarE, R.string.default_image_view_content_description);
            bVar.getClass();
            b12.k.b(null, strQ, j92.b.f97901d.f97906e, aVar.f61095e, o0VarE, b12.b.f14385f << 9, 17);
            r rVarX2 = x2.x(u2Var.a(aVar2, 1.0f, true), null, 3);
            z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarX2, o0VarE);
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
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            String strA = aVar.a();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            i15 = 4;
            mh.c(strA, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97931h, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            if (g22.n.d(str)) {
                o0VarE.C(-638081918);
                String str2 = str == null ? "" : str;
                fVar2.getClass();
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97933j, vb.h.g(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-637897406);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            i15 = 4;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(aVar, lVar, i14, i15);
        }
    }
}
