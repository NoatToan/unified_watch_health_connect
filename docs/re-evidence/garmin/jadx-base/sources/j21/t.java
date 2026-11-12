package j21;

import c2.l2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.b1;
import i3.c1;
import i3.h1;
import o4.d0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.u;

/* JADX INFO: loaded from: classes9.dex */
public final class t {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, e23.p pVar, l2 l2Var, long j8, x0 x0Var, e23.a aVar, String str, b1 b1Var, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        u uVarA;
        o0 o0VarE = mVar.E(-1683814082);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(true) ? 256 : 128;
        }
        int i16 = i15 | (o0VarE.B(l2Var) ? 2048 : 1024) | (o0VarE.l(j8) ? 16384 : 8192) | (o0VarE.B(x0Var) ? 131072 : 65536);
        if ((1572864 & i14) == 0) {
            i16 |= o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i16 |= o0VarE.B(str) ? 8388608 : 4194304;
        }
        int i17 = i16 | (o0VarE.B(b1Var) ? 67108864 : 33554432);
        if (o0VarE.n(i17 & 1, (38347923 & i17) != 38347922)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ;
            p1 p1VarI = zf.b.i(jVar, o0VarE, 6);
            p1 p1VarK = xy2.b.k(jVar, o0VarE, 6);
            d92.b.f58623a.getClass();
            long j14 = d92.b.d(o0VarE) ? zl.a.b(o0VarE, 1057361801, o0VarE).f63508c : zl.a.b(o0VarE, 1057362857, o0VarE).f63509d;
            o0VarE.g0(false);
            if (((Boolean) p1VarI.getF182175a()).booleanValue() || ((Boolean) p1VarK.getF182175a()).booleanValue()) {
                d92.b.f58625c.getClass();
                uVarA = u1.n.a(j92.b.f97900c.f97909a, j14);
            } else {
                uVarA = null;
            }
            u uVar = uVarA;
            d92.b.f58625c.getClass();
            o0Var = o0VarE;
            h1.a(aVar, rVar, true, k2.i.a(j92.b.f97900c.f97910b), b1Var, null, uVar, l2Var, jVar, z3.f.c(-978737330, new s(str, x0Var, j8, pVar), o0VarE), o0Var, ((i17 >> 18) & 14) | 905969664 | ((i17 << 3) & 112) | (i17 & 896) | ((i17 >> 12) & 57344) | ((i17 << 12) & 29360128), 32);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ib0.m(rVar, pVar, l2Var, j8, x0Var, aVar, str, b1Var, i14);
        }
    }

    public static final void b(int i14, e23.a aVar, h4.r rVar, String str, p3.m mVar, u4.d dVar, boolean z14) {
        h4.r rVar2;
        boolean z15;
        o0 o0VarL = vb.h.l(-2047876265, aVar, str, mVar);
        int i15 = i14 | 54 | (o0VarL.B(dVar) ? 256 : 128) | (o0VarL.B(str) ? 2048 : 1024);
        if (o0VarL.n(i15 & 1, (i15 & 9363) != 9362)) {
            h4.r.a aVar2 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            long jB = d92.b.a(o0VarL).d().a().b();
            long jD = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarL);
            long jD2 = am.j.d(o0VarL);
            c1 c1Var = c1.f87691a;
            long jC = d0.c(0.5f, jB, 14);
            long jC2 = d0.c(0.5f, jD, 14);
            c1Var.getClass();
            b1 b1VarA = c1.a(jB, jD, jC, jC2, o0VarL, 0);
            o0VarL = o0VarL;
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97918c;
            l2 l2VarD = c2.l.d(f14, f15, f14, f15);
            long jD3 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarL);
            d92.b.f58624b.getClass();
            a(aVar2, z3.f.c(-9305224, new r(dVar, jD2, 0, (byte) 0), o0VarL), l2VarD, jD3, j92.f.f97933j, aVar, str, b1VarA, o0VarL, 1573302 | ((i15 << 12) & 29360128));
            rVar2 = aVar2;
            z15 = true;
        } else {
            o0VarL.e();
            rVar2 = rVar;
            z15 = z14;
        }
        p2 p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.m(rVar2, z15, dVar, str, aVar, i14);
        }
    }
}
