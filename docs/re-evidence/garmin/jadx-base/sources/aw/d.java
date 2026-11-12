package aw;

import a42.a0;
import android.content.Context;
import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import g6.f;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.e5;
import i3.mh;
import java.util.List;
import java.util.Locale;
import k2.i;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.w;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import vb.h;
import z3.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Law/d;", "Lh82/c;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13318f = 0;

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new e(1087170547, true, new b(this, 0)), 4, null));
    }

    public final void g(String str, p pVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(-723440817);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            f.a aVar2 = f.f75994b;
            r rVarE = u1.n.e(l.C(x2.f(aVar, 1.0f), 0.0f, 20, 0.0f, 0.0f, 13), h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            j.f22691a.getClass();
            j.C0343j c0343j = j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarE, o0VarE);
            g.V.getClass();
            e0.a aVar3 = g.a.f81805b;
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
            b4.c(g.a.f81810g, s2VarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58624b.getClass();
            float f14 = 8;
            mh.c(upperCase, l.C(aVar, 16, f14, 0.0f, f14, 4), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(d92.c.e(j92.f.f97934k), o0VarE), o0VarE, 48, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
            if (pVar == null) {
                o0Var.C(121057930);
                o0Var.g0(false);
            } else {
                o0Var.C(558094423);
                e5.q((i15 >> 3) & 14, pVar, o0Var, false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(this, str, pVar, i14, 8);
        }
    }

    public final void h(String str, String str2, r rVar, int i14, h4.d.b bVar, m mVar, int i15) {
        int i16;
        o0 o0Var;
        int i17;
        h4.d.b bVar2;
        r rVar2;
        h4.d.b bVar3;
        int i18;
        int i19;
        g.a.b bVar4;
        o0 o0VarE = mVar.E(-1129193315);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.B(str2) ? 32 : 16;
        }
        int i24 = i16 | 384;
        if ((i15 & 3072) == 0) {
            i24 = i16 | 1408;
        }
        int i25 = i24 | 24576;
        if (o0VarE.n(i25 & 1, (i25 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i15 & 1) == 0 || o0VarE.o0()) {
                rVar2 = r.S;
                h4.d.f81522a.getClass();
                bVar3 = h4.d.a.f81536n;
                i18 = i25 & (-7169);
                i19 = 2131232091;
            } else {
                o0VarE.e();
                rVar2 = rVar;
                bVar3 = bVar;
                i18 = i25 & (-7169);
                i19 = i14;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            f.a aVar2 = f.f75994b;
            r rVarThen = l.y(u1.n.e(x2.f(aVar, 1.0f), am.j.A(d92.b.f58623a, o0VarE), m1.f128891a), 16).then(rVar2);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            z zVarA = y.a(kVar, bVar3, o0VarE, (((i18 >> 6) & 896) >> 3) & 112);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarThen, o0VarE);
            g.V.getClass();
            e0.a aVar3 = g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            g.a.e eVar = g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            g.a.C1623g c1623g = g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            g.a.b bVar5 = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar5);
            }
            g.a.f fVar = g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            j.C0343j c0343j = j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            rVar = rVar2;
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(aVar, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            h4.d.b bVar6 = bVar3;
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar5);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            r rVarA = u2Var.a(aVar, 0.85f, true);
            h4.g.a aVar4 = h4.d.a.f81536n;
            z zVarA2 = y.a(kVar, aVar4, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC3 = k.c(rVarA, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                bVar4 = bVar5;
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
            } else {
                bVar4 = bVar5;
            }
            b4.c(fVar, rVarC3, o0VarE);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            int i26 = i19;
            g.a.b bVar7 = bVar4;
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, i18 & 14, 0, 131070);
            fVar2.getClass();
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, (i18 >> 3) & 14, 0, 131070);
            o0Var = o0VarE;
            o0Var.g0(true);
            r rVarA2 = u2Var.a(aVar, 0.15f, true);
            z zVarA3 = y.a(kVar, aVar4, o0Var, 0);
            int iHashCode4 = Long.hashCode(o0Var.U);
            i2 i2VarA3 = o0Var.a0();
            r rVarC4 = k.c(rVarA2, o0Var);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar3);
            } else {
                o0Var.c();
            }
            b4.c(eVar, zVarA3, o0Var);
            b4.c(c1623g, i2VarA3, o0Var);
            if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode4))) {
                v.h.A(iHashCode4, o0Var, iHashCode4, bVar7);
            }
            b4.c(fVar, rVarC4, o0Var);
            q.a(l4.r.a(l4.k.b(x2.q(aVar, 40), i.f102406a), n5.c.a(i26, o0Var, 0), null, null, 0.0f, null, 62), o0Var, 0);
            o0Var.g0(true);
            o0Var.g0(true);
            o0Var.g0(true);
            bVar2 = bVar6;
            i17 = i26;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            i17 = i14;
            bVar2 = bVar;
        }
        r rVar3 = rVar;
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(this, str, str2, rVar3, i17, bVar2, i15, 1);
        }
    }

    public final void i(m mVar, int i14) {
        o0 o0VarE = mVar.E(1016120208);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            g(gl1.y.Q(o0VarE, R.string.device_settings_sensor_indicators), z3.f.c(-806872555, new a61.d(this, 7), o0VarE), o0VarE, ((i15 << 6) & 896) | (h82.c.f82429e << 6) | 48);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(this, i14, 1);
        }
    }

    public final void j(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1115633480);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(-790462517, new b(this, 1), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(this, i14, 0);
        }
    }
}
