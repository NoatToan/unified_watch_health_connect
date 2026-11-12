package cq0;

import b21.l0;
import c2.b0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h5.e0;
import i3.mh;
import java.util.List;
import java.util.Locale;
import o53.f0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class t {
    public static final void a(String str, String str2, String str3, String str4, List list, p3.m mVar, int i14) {
        o0 o0Var;
        List list2 = list;
        o0 o0VarE = mVar.E(-1257026512);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128) | (o0VarE.B(str4) ? 2048 : 1024) | (o0VarE.r(list2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97922g;
            float f16 = eVar.f97920e;
            h4.r rVarA = c2.l.A(aVar, f14, 0.0f, 2);
            String upperCase = gl1.y.Q(o0VarE, R.string.lbl_safety_event_triggered).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(upperCase, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131068);
            bVar2.getClass();
            c2.l.f(x2.h(aVar, eVar.f97919d), o0VarE);
            bVar2.getClass();
            h4.r rVarA2 = c2.l.A(aVar, f16, 0.0f, 2);
            fVar.getClass();
            mh.c(str, rVarA2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97929f), o0VarE), o0VarE, i15 & 14, 0, 131068);
            bVar2.getClass();
            c2.l.f(x2.h(aVar, f15), o0VarE);
            bVar2.getClass();
            h4.r rVarA3 = c2.l.A(aVar, f16, 0.0f, 2);
            fVar.getClass();
            x0 x0Var = j92.f.f97932i;
            mh.c(str2, rVarA3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131068);
            bVar2.getClass();
            c2.l.f(x2.h(aVar, f15), o0VarE);
            bVar2.getClass();
            h4.r rVarA4 = c2.l.A(aVar, f16, 0.0f, 2);
            h4.g.a aVar3 = h4.d.a.f81537o;
            h4.r rVarB = b0Var.b(rVarA4, aVar3);
            fVar.getClass();
            mh.c(str3, rVarB, 0L, null, f0.B(60), null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97928e), o0VarE), o0VarE, ((i15 >> 6) & 14) | 24576, 0, 131052);
            bVar2.getClass();
            c2.l.f(x2.h(aVar, eVar.f97918c), o0VarE);
            bVar2.getClass();
            h4.r rVarB2 = b0Var.b(c2.l.A(aVar, f16, 0.0f, 2), aVar3);
            fVar.getClass();
            mh.c(str4, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, (i15 >> 9) & 14, 0, 131068);
            o0Var = o0VarE;
            tn.k.n(bVar2, aVar, f15, o0Var);
            list2 = list;
            b.a(list2, o0Var, (i15 >> 12) & 14);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.z(str, str2, str3, str4, list2, i14, 16);
        }
    }

    public static final void b(String str, String str2, String str3, String str4, List list, String str5, e23.a aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1733222382);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128) | (o0VarE.B(str4) ? 2048 : 1024) | (o0VarE.r(list) ? 16384 : 8192) | (o0VarE.B(str5) ? 131072 : 65536) | (o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            b82.c.c(z3.f.c(43360964, new s(str5, aVar), o0VarE), z3.f.c(84441918, new ak0.j(str, str2, str3, str4, list, 13), o0VarE), o0VarE, 54);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(str, str2, str3, str4, list, str5, aVar, i14, 3);
        }
    }
}
