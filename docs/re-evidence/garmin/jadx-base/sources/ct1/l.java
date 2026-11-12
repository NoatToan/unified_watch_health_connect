package ct1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.i1;
import c2.b0;
import c2.v;
import c2.w;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e2.i0;
import e2.k0;
import e23.p;
import e23.q;
import h4.r;
import h5.e0;
import kotlin.t1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p008y1.t3;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import r1.c0;
import r1.u0;
import z1.u;

/* JADX INFO: loaded from: classes10.dex */
public final class l {
    public static final void a(r rVar, final zc.d dVar, int i14, final int i15, float f14, final e23.l lVar, e23.l lVar2, p3.m mVar, int i16) {
        int i17;
        o0 o0Var;
        float f15;
        int i18;
        final float f16;
        p3.m.a.C2565a c2565a;
        boolean z14;
        dVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-1327075278);
        if ((i16 & 6) == 0) {
            i17 = (o0VarE.B(rVar) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= (i16 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i17 |= o0VarE.k(i14) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i17 |= o0VarE.k(i15) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i17 |= 8192;
        }
        if ((196608 & i16) == 0) {
            i17 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if ((1572864 & i16) == 0) {
            i17 |= o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i17 & 1, (599187 & i17) != 599186)) {
            o0VarE.G0();
            if ((i16 & 1) == 0 || o0VarE.o0()) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                i18 = i17 & (-57345);
                f16 = j92.b.f97899b.f97920e;
            } else {
                o0VarE.e();
                i18 = i17 & (-57345);
                f16 = f14;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            r rVarF = x2.f(rVar, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar, o0VarE, 48);
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
            int iG = (int) w02.b0.g(f16, o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var2 = (o53.b0) objQ;
            final i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                objQ2 = p0.f(new c(i0VarA, 0));
                o0VarE.K(objQ2);
            }
            final x3 x3Var = (x3) objQ2;
            int i19 = i18;
            float f17 = f16;
            o0Var = o0VarE;
            v.a(null, null, false, z3.f.c(-1714321410, new q() { // from class: ct1.d
                /* JADX WARN: Code duplicated, block: B:19:0x0076  */
                /* JADX WARN: Code duplicated, block: B:27:0x00b4  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    w wVar = (w) obj;
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    wVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= mVar2.B(wVar) ? 4 : 2;
                    }
                    if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                        x1 x1Var2 = p3.n.f135158a;
                        c2.j jVar = c2.j.f22691a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        float f18 = eVar.f97916a;
                        jVar.getClass();
                        c2.j.i iVarI = c2.j.i(f18);
                        float f19 = n.f55521a;
                        i0 i0Var = i0VarA;
                        i0Var.getClass();
                        u.a aVar3 = u.a.f200875a;
                        g6.c cVar = (g6.c) mVar2.A(t1.f91490h);
                        boolean zB = mVar2.B(i0Var);
                        Object objQ3 = mVar2.q();
                        p3.m.a aVar4 = p3.m.f135153a;
                        if (zB) {
                            objQ3 = new m(i0Var, aVar3, cVar);
                            mVar2.K(objQ3);
                        } else {
                            aVar4.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new m(i0Var, aVar3, cVar);
                                mVar2.K(objQ3);
                            }
                        }
                        t3 t3VarE = z1.s.e((m) objQ3, mVar2);
                        int i24 = i15;
                        boolean zK = mVar2.k(i24);
                        boolean z15 = (iIntValue & 14) == 4;
                        float f22 = f16;
                        boolean zI = zK | z15 | mVar2.i(f22);
                        e23.l lVar3 = lVar;
                        boolean zB2 = zI | mVar2.B(lVar3);
                        zc.d dVar2 = dVar;
                        boolean zR = zB2 | mVar2.r(dVar2);
                        Object objQ4 = mVar2.q();
                        if (zR) {
                            e eVar2 = new e(i24, wVar, f22, lVar3, dVar2);
                            mVar2.K(eVar2);
                            objQ4 = eVar2;
                        } else {
                            aVar4.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                e eVar3 = new e(i24, wVar, f22, lVar3, dVar2);
                                mVar2.K(eVar3);
                                objQ4 = eVar3;
                            }
                        }
                        e2.c.c(null, i0Var, null, iVarI, null, t3VarE, false, null, (e23.l) objQ4, mVar2, 0, 429);
                        if (i24 > 5) {
                            mVar2.C(108582906);
                            r.a aVar5 = r.S;
                            h4.d.f81522a.getClass();
                            l.b(c2.l.C(wVar.c(aVar5, h4.d.a.f81530h), eVar.f97920e, 0.0f, 0.0f, eVar.f97921f, 6), ((Number) x3Var.getF182175a()).intValue() + 1, i24, 0, mVar2, 0);
                            mVar2.f();
                        } else {
                            mVar2.C(108961540);
                            mVar2.f();
                        }
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0Var, 3072, 7);
            if (i15 >= 2) {
                o0Var.C(-906367139);
                r.a aVar3 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarA = c2.l.A(aVar3, 0.0f, j92.b.f97899b.f97918c, 1);
                int iIntValue = ((Number) x3Var.getF182175a()).intValue();
                long jA = n5.a.a(o0Var, R.color.icon_1);
                long jY = sn.a.y(o0Var);
                boolean zR = o0Var.r(context);
                Object objQ3 = o0Var.q();
                if (zR || objQ3 == c2565a2) {
                    objQ3 = new br2.a(context, 6);
                    o0Var.K(objQ3);
                }
                c2565a = c2565a2;
                z14 = false;
                l02.k.a(rVarA, iIntValue, i15, 0, jA, jY, 0.0f, 0.0f, 0.0f, 0.0f, null, null, (p) objQ3, o0Var, (i19 >> 3) & 896, 0, 4040);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                c2565a = c2565a2;
                z14 = false;
                o0Var.C(-905816486);
                o0Var.g0(false);
            }
            Integer numValueOf = Integer.valueOf(i14);
            boolean zR2 = o0Var.r(b0Var2) | o0Var.B(i0VarA) | ((i19 & 896) == 256 ? true : z14) | o0Var.k(iG) | ((3670016 & i19) == 1048576 ? true : z14);
            Object objQ4 = o0Var.q();
            if (zR2 || objQ4 == c2565a) {
                c2.r rVar2 = new c2.r(i14, iG, 2, b0Var2, i0VarA, lVar2, x3Var);
                o0Var.K(rVar2);
                objQ4 = rVar2;
            }
            l0.a(numValueOf, (e23.l) objQ4, o0Var);
            o0Var.g0(true);
            f15 = f17;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            f15 = f14;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i1(rVar, dVar, i14, i15, f15, lVar, lVar2, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(r rVar, int i14, int i15, int i16, p3.m mVar, int i17) {
        int i18;
        o0 o0VarE = mVar.E(-194906666);
        int i19 = i17 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.k(i15) ? 256 : 128) | 3072;
        if (o0VarE.n(i19 & 1, (i19 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = ((i19 & 112) == 32) | ((i19 & 896) == 256);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z14) {
                objQ = p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = p0.n(Boolean.TRUE);
                    o0VarE.K(objQ);
                }
            }
            p1 p1Var = (p1) objQ;
            Integer numValueOf = Integer.valueOf(i14);
            Integer numValueOf2 = Integer.valueOf(i15);
            boolean zB = o0VarE.B(p1Var);
            Object objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = new k(2000, p1Var, null);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new k(2000, p1Var, null);
                    o0VarE.K(objQ2);
                }
            }
            l0.f(numValueOf, numValueOf2, (p) objQ2, o0VarE);
            c0.e(((Boolean) p1Var.getF182175a()).booleanValue(), rVar, u0.d(s1.l.d(0, 0, null, 6), 2), u0.e(s1.l.d(1000, 0, null, 6), 2), null, z3.f.c(-1980353026, new f(i14, i15, 0), o0VarE), o0VarE, ((i19 << 3) & 112) | 196992, 16);
            i18 = 2000;
        } else {
            o0VarE.e();
            i18 = i16;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(rVar, i14, i15, i18, i17);
        }
    }
}
