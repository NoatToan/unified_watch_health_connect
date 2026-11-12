package bk0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b71.o;
import b82.f0;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.t0;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import i3.e5;
import i3.i7;
import i3.mh;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18472a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.BULLET_POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.CHECK_MARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f18472a = iArr;
        }
    }

    public static final void a(String str, i53.c<bk0.a> cVar, b bVar, x0 x0Var, m mVar, int i14, int i15) {
        String str2;
        int i16;
        x0 x0VarB;
        o0 o0Var;
        str.getClass();
        bVar.getClass();
        o0 o0VarE = mVar.E(1738710116);
        if ((i14 & 6) == 0) {
            str2 = str;
            i16 = (o0VarE.B(str2) ? 4 : 2) | i14;
        } else {
            str2 = str;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(cVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.k(bVar.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                x0VarB = x0Var;
                int i17 = o0VarE.B(x0VarB) ? 2048 : 1024;
                i16 |= i17;
            } else {
                x0VarB = x0Var;
            }
            i16 |= i17;
        } else {
            x0VarB = x0Var;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
                if ((i15 & 8) != 0) {
                    i16 &= -7169;
                }
            } else if ((i15 & 8) != 0) {
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarB = d92.c.b(d92.c.e(j92.f.f97932i), o0VarE);
                i16 &= -7169;
            }
            x0 x0Var2 = x0VarB;
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            if (cVar == null || cVar.isEmpty()) {
                o0Var = o0VarE;
                o0Var.C(608206110);
                o0Var.g0(false);
            } else {
                o0VarE.C(607742908);
                r rVarF = x2.f(r.S, 1.0f);
                h4.d.f81522a.getClass();
                h4.g.a aVar = h4.d.a.f81536n;
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
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, o0VarE, i16 & 14, (i16 << 12) & 29360128, 131070);
                o0Var = o0VarE;
                o0Var.C(444390577);
                for (bk0.a aVar3 : cVar) {
                    r.a aVar4 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar4, j92.b.f97899b.f97920e), o0Var);
                    b(aVar3, bVar, o0Var, (i16 >> 3) & 112);
                }
                e5.u(o0Var, false, true, false);
            }
            x1 x1Var2 = n.f135158a;
            x0VarB = x0Var2;
        } else {
            bVar = bVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(str, cVar, bVar, x0VarB, i14, i15, 1);
        }
    }

    public static final void b(bk0.a aVar, b bVar, m mVar, int i14) {
        int i15;
        h5.g.a.f fVar;
        j92.e eVar;
        h5.g.a.e eVar2;
        h5.g.a.b bVar2;
        e0.a aVar2;
        int i16;
        r.a aVar3;
        h5.g.a.C1623g c1623g;
        Object obj = aVar;
        o0 o0VarE = mVar.E(-1313970288);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(obj) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(bVar.ordinal()) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar3 = h4.d.a.f81533k;
            r.a aVar4 = r.S;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar4, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
            b4.c(c1623g2, i2VarA0, o0VarE);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            d92.b.f58623a.getClass();
            j92.b bVar5 = d92.b.f58625c;
            bVar5.getClass();
            j92.e eVar4 = j92.b.f97899b;
            c2.l.f(x2.u(aVar4, eVar4.f97918c), o0VarE);
            int i17 = a.f18472a[bVar.ordinal()];
            if (i17 == 1) {
                fVar = fVar2;
                eVar = eVar4;
                o0VarE.C(-46975623);
                Object objQ = o0VarE.q();
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new o(20);
                    o0VarE.K(objQ);
                }
                r rVarB = v.b(aVar4, (e23.l) objQ);
                d92.b.f58624b.getClass();
                eVar2 = eVar3;
                bVar2 = bVar4;
                aVar2 = aVar5;
                i16 = 0;
                aVar3 = aVar4;
                c1623g = c1623g2;
                mh.c("•", rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, 6, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
                Unit unit = Unit.INSTANCE;
            } else {
                if (i17 != 2) {
                    throw kg.f.h(o0VarE, -278611746, false);
                }
                o0VarE.C(-46680038);
                float fA = (c22.b.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)) - 1.0f) * 6;
                float f14 = fA > 0.0f ? fA : 0.0f;
                g6.f.a aVar6 = g6.f.f75994b;
                r rVarC2 = c2.l.C(aVar4, 0.0f, f14, 0.0f, 0.0f, 13);
                bVar5.getClass();
                eVar = eVar4;
                fVar = fVar2;
                i7.a(n5.c.a(R.drawable.check, o0VarE, 0), null, x2.q(rVarC2, j92.b.f97901d.f97904c), hb.a.s(o0VarE), o0VarE, 48, 0);
                o0VarE.g0(false);
                Unit unit2 = Unit.INSTANCE;
                i16 = 0;
                aVar3 = aVar4;
                c1623g = c1623g2;
                bVar2 = bVar4;
                aVar2 = aVar5;
                eVar2 = eVar3;
            }
            bVar5.getClass();
            j92.e eVar5 = eVar;
            c2.l.f(x2.u(aVar3, eVar5.f97920e), o0VarE);
            z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, i16);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = h4.k.c(aVar3, o0VarE);
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
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var = b0.f22601a;
            c2.j.c cVar2 = c2.j.f22696f;
            bVar5.getClass();
            o0 o0Var = o0VarE;
            t0.a(null, c2.j.i(eVar5.f97918c), cVar2, null, 0, 0, z3.f.c(1497977073, new a71.n(aVar, 10), o0VarE), o0Var, 1573248, 57);
            bVar5.getClass();
            c2.l.f(x2.h(aVar3, eVar5.f97917b), o0Var);
            String str = aVar.f18467b;
            d92.b.f58624b.getClass();
            obj = aVar;
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0Var), o0Var, 0, 0, 131070);
            o0VarE = o0Var;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(obj, bVar, i14, 5);
        }
    }
}
