package o81;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import d6.i;
import f5.z0;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.List;
import l72.y0;
import o4.m1;
import o4.q1;
import o62.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.i0;
import tn.k;
import v.h;
import w5.b0;
import w5.c0;
import w5.f0;
import w5.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo81/a;", "Lh82/c;", "<init>", "()V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f130834f = 0;

    public static s5.c j(String str, m mVar) {
        mVar.C(843672637);
        x1 x1Var = n.f135158a;
        List listW = w.W(str, new String[]{"."});
        if (listW.isEmpty()) {
            s5.c cVar = new s5.c(str, null, 2, null);
            mVar.f();
            return cVar;
        }
        String strG = k.g(w.i0((String) listW.get(0)).toString(), ". ");
        String string = w.i0(h0.k0(h0.U(listW, 1), ".", null, null, null, 62)).toString();
        s5.c.b bVar = new s5.c.b(0, 1, null);
        f0.f182097b.getClass();
        int iJ = bVar.j(new i0(0L, 0L, f0.f182105j, (b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (i) null, (q1) null, (s5.b0) null, (q4.g) null, 65531, (j) null));
        try {
            bVar.b(strG);
            Unit unit = Unit.INSTANCE;
            bVar.f(iJ);
            bVar.b(string);
            s5.c cVarK = bVar.k();
            mVar.f();
            return cVarK;
        } catch (Throwable th3) {
            bVar.f(iJ);
            throw th3;
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return p13.w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(1352224265, true, new s0(this, 1)), 4, null));
    }

    public final void g(long j8, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1691565637);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.l(j8) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarC = l.C(aVar, 0.0f, 4, 0.0f, 0.0f, 13);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u uVar = u.f22885a;
            c2.q.a(u1.n.e(l4.k.b(x2.q(aVar, 16), k2.i.f102406a), j8, m1.f128891a), o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aq.x2(this, j8, i14, 5);
        }
    }

    public final void h(int i14, long j8, String str, String str2, m mVar) {
        int i15;
        o0 o0Var;
        String str3 = str2;
        o0 o0VarE = mVar.E(-1777009173);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str3) ? 256 : 128;
        }
        int i16 = i15 | 3072;
        if ((i14 & 24576) == 0) {
            i16 |= (32768 & i14) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 16384 : 8192;
        }
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar, o0VarE);
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.g.b bVar2 = h4.d.a.f81534l;
            float f14 = 16;
            g6.f.a aVar3 = g6.f.f75994b;
            r rVarC2 = l.C(aVar, f14, 0.0f, 0.0f, 0.0f, 14);
            int i17 = i16;
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVarC2, o0VarE);
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
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            u2 u2Var = u2.f22900a;
            g(j8, o0VarE, (i17 & 14) | (h82.c.f82429e << 3) | ((i17 >> 9) & 112));
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(str, l.C(aVar, f14, 0.0f, f14, 0.0f, 10), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, ((i17 >> 3) & 14) | 48, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
            r rVarC4 = l.C(aVar, 32, 0.0f, 0.0f, 0.0f, 14);
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode3 = Long.hashCode(o0Var.U);
            i2 i2VarA2 = o0Var.a0();
            r rVarC5 = h4.k.c(rVarC4, o0Var);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar2);
            } else {
                o0Var.c();
            }
            b4.c(eVar, z0VarD, o0Var);
            b4.c(c1623g, i2VarA2, o0Var);
            if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode3))) {
                h.A(iHashCode3, o0Var, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC5, o0Var);
            u uVar = u.f22885a;
            int i18 = i17 >> 6;
            str3 = str2;
            h82.r.f82497a.z((i18 & 112) | (i18 & 14) | 384, 0, str3, o0Var);
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.h(j8, this, str, str3, i14, 4);
        }
    }

    public final void i(m mVar, int i14) {
        o0 o0VarE = mVar.E(1784776164);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(-1019825871, new o72.b((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), this), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(this, i14, 7);
        }
    }
}
