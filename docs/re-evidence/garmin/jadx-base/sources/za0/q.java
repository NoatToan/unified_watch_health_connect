package za0;

import androidx.room.a0;
import c.w;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import ca0.u1;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import gl1.y;
import h5.e0;
import i3.i7;
import i3.mh;
import o4.m1;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import v62.e1;

/* JADX INFO: loaded from: classes8.dex */
public final class q {
    /* JADX WARN: Code duplicated, block: B:23:0x009f  */
    public static final void a(h4.r rVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(166070231);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarD = x2.d(rVar, 1.0f);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            long jD = hb.a.d(d92.b.f58623a, o0VarE);
            h4.r.a aVar2 = h4.r.S;
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarQ = x2.q(aVar2, 80);
            boolean zL = o0VarE.l(jD);
            Object objQ = o0VarE.q();
            if (zL) {
                objQ = new j82.d(jD, 29);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j82.d(jD, 29);
                    o0VarE.K(objQ);
                }
            }
            u1.n.b(rVarQ, (e23.l) objQ, o0VarE, 6);
            s62.a.f157643a.getClass();
            i7.b(e1.a(t62.b.f162798a), null, x2.q(aVar2, 32), am.j.d(o0VarE), o0VarE, 432, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(rVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(i iVar, u1 u1Var, e23.l lVar, u1 u1Var2, e23.a aVar, boolean z14, p3.m mVar, int i14) {
        o0 o0VarP = a0.p(lVar, aVar, mVar, 717785981);
        int i15 = i14 | (o0VarP.r(iVar) ? 4 : 2) | (o0VarP.r(u1Var) ? 32 : 16) | (o0VarP.r(u1Var2) ? 2048 : 1024) | (o0VarP.r(aVar) ? 16384 : 8192) | (o0VarP.h(z14) ? 131072 : 65536);
        if (o0VarP.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            i53.f fVarJ = i53.a.j(((i.b) s9.c.c(iVar.f203251f, o0VarP).getF182175a()).f203255b);
            g.h hVar = new g.h();
            boolean zR = o0VarP.r(iVar);
            Object objQ = o0VarP.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new yw2.h(iVar, 7);
                o0VarP.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new yw2.h(iVar, 7);
                    o0VarP.K(objQ);
                }
            }
            c.q qVarC = w.c(hVar, (e23.l) objQ, o0VarP, 0);
            boolean zR2 = o0VarP.r(qVarC);
            Object objQ2 = o0VarP.q();
            if (zR2) {
                objQ2 = new z10.d(9, lVar, qVarC);
                o0VarP.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new z10.d(9, lVar, qVarC);
                    o0VarP.K(objQ2);
                }
            }
            c(fVarJ, u1Var, (e23.a) objQ2, u1Var2, aVar, z14, o0VarP, i15 & 523376);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w52.z0(iVar, u1Var, lVar, u1Var2, aVar, z14, i14);
        }
    }

    public static final void c(i53.c cVar, u1 u1Var, e23.a aVar, u1 u1Var2, e23.a aVar2, boolean z14, p3.m mVar, int i14) {
        int i15;
        u1 u1Var3;
        e23.a aVar3;
        e23.a aVar4;
        o0 o0Var;
        int i16;
        int i17;
        String strJ;
        o0 o0VarE = mVar.E(622513918);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            u1Var3 = u1Var;
            i15 |= o0VarE.r(u1Var3) ? 32 : 16;
        } else {
            u1Var3 = u1Var;
        }
        if ((i14 & 384) == 0) {
            aVar3 = aVar;
            i15 |= o0VarE.r(aVar3) ? 256 : 128;
        } else {
            aVar3 = aVar;
        }
        if ((i14 & 3072) == 0) {
            aVar4 = u1Var2;
            i15 |= o0VarE.r(aVar4) ? 2048 : 1024;
        } else {
            aVar4 = u1Var2;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            boolean zIsEmpty = cVar.isEmpty();
            String strQ = y.Q(o0VarE, R.string.lbl_phone_permissions);
            if (zIsEmpty) {
                i16 = -356134792;
                i17 = R.string.lbl_all_permissions_granted;
            } else {
                i16 = -356053169;
                i17 = R.string.msg_recommend_turning_on_permissions;
            }
            String strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i16, i17, o0VarE, false);
            String strQ2 = y.Q(o0VarE, R.string.lbl_change_permissions_anytime);
            String strJ3 = zIsEmpty ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -355839765, R.string.lbl_next, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -355776835, R.string.lbl_manage_permissions, o0VarE, false);
            e23.a aVar5 = zIsEmpty ? aVar4 : aVar3;
            if (zIsEmpty) {
                o0VarE.C(-355444856);
                o0VarE.g0(false);
                strJ = null;
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -355513180, R.string.lbl_skip_button, o0VarE, false);
            }
            u1 u1Var4 = zIsEmpty ? null : u1Var3;
            c2.j.f22691a.getClass();
            o0Var = o0VarE;
            da0.p.b("permissions_manage_screen", strQ, null, strJ2, strQ2, strJ3, aVar5, false, strJ, u1Var4, false, null, null, false, false, aVar2, null, null, null, zIsEmpty ? c2.j.f22696f : c2.j.f22694d, null, z3.f.c(433730558, new qx1.k(cVar, zIsEmpty, z14, 2), o0VarE), o0Var, 6, (i15 << 3) & 458752, 384, 3112068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ux1.e(cVar, u1Var3, aVar3, u1Var2, aVar2, z14, i14);
        }
    }

    public static final void d(u4.d dVar, int i14, int i15, p3.m mVar, int i16) {
        int i17 = i14;
        o0 o0VarE = mVar.E(1392723415);
        p3.c<?> cVar = o0VarE.f135177b;
        int i18 = i16 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.k(i17) ? 32 : 16) | (o0VarE.k(i15) ? 256 : 128);
        if (o0VarE.n(i18 & 1, (i18 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(aVar, 0.0f, eVar.f97920e, 1);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            bVar.getClass();
            h4.r rVarE = u1.n.e(l4.k.b(x2.q(aVar, j92.b.f97901d.f97906e), k2.i.f102406a), d92.b.a(o0VarE).e().e(), m1.f128891a);
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarE, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            long j8 = d92.b.a(o0VarE).f().f63508c;
            bVar.getClass();
            i7.b(dVar, null, c2.l.y(aVar, eVar.f97918c), j8, o0VarE, (i18 & 14) | 48, 0);
            o0VarE.g0(true);
            bVar.getClass();
            h4.r rVarA2 = c2.l.A(aVar, eVar.f97919d, 0.0f, 2);
            z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarA2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar3);
            }
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var = b0.f22601a;
            i17 = i14;
            String strQ = y.Q(o0VarE, i17);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
            String strQ2 = y.Q(o0VarE, i15);
            fVar2.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97933j, o0VarE);
            bVar.getClass();
            mh.c(strQ2, c2.l.C(aVar, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new li0.o0(dVar, i17, i15, i16, 1);
        }
    }
}
