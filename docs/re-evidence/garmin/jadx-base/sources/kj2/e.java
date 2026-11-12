package kj2;

import c2.b0;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h4.r;
import h5.e0;
import i3.mh;
import o4.m1;
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
import s5.x0;
import u1.w;

/* JADX INFO: loaded from: classes11.dex */
public final class e {
    public static final void a(String str, String str2, String str3, String str4, String str5, String str6, e23.a aVar, e23.a aVar2, m mVar, int i14) {
        o0 o0Var;
        j92.e eVar;
        boolean z14;
        j92.e eVar2;
        j92.e eVar3;
        aVar.getClass();
        o0 o0VarE = mVar.E(15915450);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128) | (o0VarE.B(str4) ? 2048 : 1024) | (o0VarE.B(str5) ? 16384 : 8192) | (o0VarE.B(str6) ? 131072 : 65536) | (o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar2) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (i15 & 4793491) != 4793490)) {
            x1 x1Var = n.f135158a;
            r.a aVar3 = r.S;
            r rVarE = u1.n.e(x2.f(w.f(239, aVar2, aVar, aVar3, null, false), 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar4 = j92.b.f97899b;
            float f14 = eVar4.f97920e;
            float f15 = eVar4.f97920e;
            org.apache.commons.lang3.e.j(bVar);
            r rVarB = l.B(rVarE, f14, f15, f15, f15);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
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
            bVar.getClass();
            r rVarF = x2.f(l.C(aVar3, 0.0f, eVar4.f97917b, 0.0f, 0.0f, 13), 1.0f);
            j92.f.f97924a.getClass();
            mh.c(str, rVarF, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, o0VarE, i15 & 14, 0, 131064);
            bVar.getClass();
            r rVarF2 = x2.f(l.C(aVar3, 0.0f, eVar4.f97917b, 0.0f, 0.0f, 13), 1.0f);
            x0 x0Var = j92.f.f97932i;
            mh.c(str2, rVarF2, vb.h.g(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, (i15 >> 3) & 14, 0, 131064);
            o0 o0Var2 = o0VarE;
            if (str3 == null) {
                o0Var2.C(-654104496);
                o0Var2.g0(false);
                eVar = eVar4;
                z14 = false;
            } else {
                o0Var2.C(-654104495);
                bVar.getClass();
                eVar = eVar4;
                mh.c(str3, x2.f(l.C(aVar3, 0.0f, eVar4.f97917b, 0.0f, 0.0f, 13), 1.0f), vb.h.g(o0Var2), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0Var2, 0, 0, 131064);
                Unit unit = Unit.INSTANCE;
                z14 = false;
                o0Var2.g0(false);
            }
            if (str4 == null) {
                x0Var = x0Var;
                o0Var2 = o0Var2;
                o0Var2.C(-653778128);
                o0Var2.g0(z14);
                eVar2 = eVar;
            } else {
                x0Var = x0Var;
                o0Var2 = o0Var2;
                o0Var2.C(-653778127);
                bVar.getClass();
                j92.e eVar5 = eVar;
                x0 x0Var2 = x0Var;
                o0 o0Var3 = o0Var2;
                eVar2 = eVar5;
                mh.c(str4, x2.f(l.C(aVar3, 0.0f, eVar5.f97917b, 0.0f, 0.0f, 13), 1.0f), vb.h.g(o0Var2), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, o0Var3, 0, 0, 131064);
                x0Var = x0Var2;
                o0Var2 = o0Var3;
                Unit unit2 = Unit.INSTANCE;
                z14 = false;
                o0Var2.g0(false);
            }
            if (str5 == null) {
                o0Var2.C(-653451760);
                o0Var2.g0(z14);
                eVar3 = eVar2;
            } else {
                o0Var2.C(-653451759);
                bVar.getClass();
                j92.e eVar6 = eVar2;
                x0 x0Var3 = x0Var;
                o0 o0Var4 = o0Var2;
                eVar3 = eVar6;
                mh.c(str5, x2.f(l.C(aVar3, 0.0f, eVar6.f97917b, 0.0f, 0.0f, 13), 1.0f), vb.h.g(o0Var2), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var3, o0Var4, 0, 0, 131064);
                x0Var = x0Var3;
                o0Var2 = o0Var4;
                Unit unit3 = Unit.INSTANCE;
                o0Var2.g0(false);
            }
            bVar.getClass();
            o0 o0Var5 = o0Var2;
            mh.c(str6, x2.f(l.C(aVar3, 0.0f, eVar3.f97917b, 0.0f, 0.0f, 13), 1.0f), vb.h.g(o0Var2), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0Var5, (i15 >> 15) & 14, 0, 131064);
            o0Var = o0Var5;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dd1.d(str, str2, str3, str4, str5, str6, aVar, aVar2, i14, 11);
        }
    }
}
