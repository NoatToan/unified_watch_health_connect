package at;

import androidx.room.w0;
import c2.b0;
import c2.j;
import c2.k3;
import c2.q;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import f5.z0;
import g02.s0;
import h4.k;
import h4.r;
import h5.e0;
import i3.hb;
import i3.mh;
import l72.f0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import v.h;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static final void a(boolean z14, boolean z15, e23.a aVar, z3.e eVar, k3 k3Var, z3.e eVar2, m mVar, int i14, int i15) {
        int i16;
        boolean z16;
        k3 k3Var2;
        k3 k3VarA;
        int i17;
        aVar.getClass();
        o0 o0VarE = mVar.E(931173763);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i18 = i15 & 2;
        if (i18 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarE.h(z15) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(eVar) ? 2048 : 1024;
        }
        int i19 = i16 | 24576;
        if ((196608 & i14) == 0) {
            i19 = 90112 | i16;
        }
        if ((1572864 & i14) == 0) {
            i19 |= o0VarE.r(eVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i19 & 1, (599187 & i19) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                if (i18 != 0) {
                    z15 = false;
                }
                hb.f88319a.getClass();
                k3VarA = hb.a(o0VarE);
                i17 = i19 & (-458753);
            } else {
                o0VarE.e();
                i17 = i19 & (-458753);
                k3VarA = k3Var;
            }
            boolean z17 = z15;
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            b(z14, aVar, z3.f.c(-313484485, new ad0.g(z17, eVar, k3VarA, eVar2, 3), o0VarE), o0VarE, ((i17 >> 3) & 112) | (i17 & 14) | 384);
            z16 = z17;
            k3Var2 = k3VarA;
        } else {
            o0VarE.e();
            z16 = z15;
            k3Var2 = k3Var;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(z14, z16, aVar, eVar, k3Var2, eVar2, i14, i15);
        }
    }

    public static final void b(boolean z14, e23.a aVar, z3.e eVar, m mVar, int i14) {
        int i15;
        boolean z15;
        e23.a aVar2 = aVar;
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1070364606);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(eVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r.a aVar3 = r.S;
            r rVarD = x2.d(aVar3, 1.0f);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
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
            b4.c(eVar2, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar = u.f22885a;
            eVar.invoke(o0VarE, Integer.valueOf((i15 >> 6) & 14));
            if (z14) {
                o0VarE.C(491996148);
                r rVarC2 = s0.c(x2.d(aVar3, 1.0f), true);
                Object objQ = o0VarE.q();
                m.f135153a.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new w0(6);
                    o0VarE.K(objQ);
                }
                u1.n.b(rVarC2, (l) objQ, o0VarE, 48);
                r rVarC3 = uVar.c(aVar3, h4.d.a.f81528f);
                j.f22691a.getClass();
                z zVarA = y.a(j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                r rVarC4 = k.c(rVarC3, o0VarE);
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
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC4, o0VarE);
                b0 b0Var = b0.f22601a;
                h4.g.a aVar5 = h4.d.a.f81537o;
                s0.b(b0Var.b(aVar3, aVar5), 0.0f, o0VarE, 0, 2);
                String strQ = gl1.y.Q(o0VarE, R.string.msg_trying_to_reconnect);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
                r rVarB = b0Var.b(aVar3, aVar5);
                int i16 = i15;
                z15 = true;
                mh.c(strQ, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                f0 f0Var = f0.f110999a;
                r rVarC5 = uVar.c(x2.f(aVar3, 1.0f), h4.d.a.f81531i);
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar3 = j92.b.f97899b;
                float f14 = eVar3.f97920e;
                bVar2.getClass();
                r rVarZ = c2.l.z(rVarC5, f14, eVar3.f97923h);
                String strQ2 = gl1.y.Q(o0VarE, R.string.text_return_to_home);
                boolean z16 = (i16 & 112) == 32;
                Object objQ2 = o0VarE.q();
                if (z16 || objQ2 == c2565a) {
                    aVar2 = aVar;
                    objQ2 = new as.n(aVar2, 2);
                    o0VarE.K(objQ2);
                } else {
                    aVar2 = aVar;
                }
                f0Var.d(0, 9, (e23.a) objQ2, rVarZ, strQ2, o0VarE, null, false);
                o0VarE.g0(false);
            } else {
                z15 = true;
                o0VarE.C(492997510);
                o0VarE.g0(false);
            }
            o0VarE.g0(z15);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(z14, aVar2, eVar, i14, 0);
        }
    }
}
