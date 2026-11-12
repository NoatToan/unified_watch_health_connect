package z2;

import android.graphics.Bitmap;
import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import kotlin.a4;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    public static final void a(p pVar, h4.d dVar, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-1090171650);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(pVar) : o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(eVar) ? 256 : 128;
        }
        boolean z14 = false;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean z15 = (i15 & 112) == 32;
            if ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.B(pVar))) {
                z14 = true;
            }
            boolean z16 = z15 | z14;
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new k(dVar, pVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k(dVar, pVar);
                    o0VarE.K(objQ);
                }
            }
            p004k6.g.a((k) objQ, null, new p004k6.d0(false, false, false, (p004k6.e0) null, true, false, 15, (p005kotlin.jvm.internal.j) null), eVar, o0VarE, ((i15 << 3) & 7168) | 384, 2);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w52.k0(pVar, dVar, eVar, i14, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0136  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9  */
    public static final void b(final p pVar, final boolean z14, final d6.g gVar, final boolean z15, long j8, final float f14, final h4.r rVar, p3.m mVar, final int i14, final int i15) {
        int i16;
        long j14;
        boolean z16;
        p3.o0 o0VarE = mVar.E(-466280168);
        int i17 = 2;
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(pVar) : o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.k(gVar.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.h(z15) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            j14 = j8;
            i16 |= ((i15 & 16) == 0 && o0VarE.l(j14)) ? 16384 : 8192;
        } else {
            j14 = j8;
        }
        if ((1572864 & i14) == 0) {
            i16 |= o0VarE.B(rVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i16 & 1, (533651 & i16) != 533650)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
                if ((i15 & 16) != 0) {
                    i16 &= -57345;
                }
            } else if ((i15 & 16) != 0) {
                g6.h.f76000b.getClass();
                j14 = g6.h.f76001c;
                i16 &= -57345;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            if (z14) {
                float f15 = x0.f201841a;
                if ((gVar != d6.g.Ltr || z15) && !(gVar == d6.g.Rtl && z15)) {
                    z16 = false;
                } else {
                    z16 = true;
                }
            } else {
                float f16 = x0.f201841a;
                if ((gVar == d6.g.Ltr && !z15) || (gVar == d6.g.Rtl && z15)) {
                    z16 = false;
                } else {
                    z16 = true;
                }
            }
            h4.a.f81516a.getClass();
            h4.f fVar = z16 ? h4.a.f81518c : h4.a.f81517b;
            int i18 = i16 & 14;
            boolean zH = (i18 == 4 || ((i16 & 8) != 0 && o0VarE.r(pVar))) | ((i16 & 112) == 32) | o0VarE.h(z16);
            Object objQ = o0VarE.q();
            if (zH) {
                objQ = new lo.o(pVar, z14, z16, i17);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new lo.o(pVar, z14, z16, i17);
                    o0VarE.K(objQ);
                }
            }
            long j15 = j14;
            a(pVar, fVar, z3.f.c(1365123137, new a42.o((a4) o0VarE.A(kotlin.t1.f91502t), j15, z16, p5.v.c((e23.l) objQ, rVar, false), pVar), o0VarE), o0VarE, i18 | 384);
            j14 = j15;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final long j16 = j14;
            p2VarI0.f135219d = new e23.p() { // from class: z2.a
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c.b(pVar, z14, gVar, z15, j16, f14, rVar, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void c(int i14, e23.a aVar, h4.r rVar, p3.m mVar, boolean z14) {
        int i15;
        p3.o0 o0VarE = mVar.E(2111672474);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            c2.l.f(h4.k.a(x2.r(rVar, x0.f201841a, x0.f201842b), kotlin.k2.f91249a, new h62.g(z14, aVar)), o0VarE);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.h(rVar, aVar, z14, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    public static final o4.v0 d(l4.f fVar, float f14) {
        int iCeil = ((int) Math.ceil(f14)) * 2;
        j.f201648a.getClass();
        o4.f fVarA = j.f201649b;
        o4.c cVarA = j.f201650c;
        q4.a aVar = j.f201651d;
        if (fVarA != null) {
            Bitmap bitmap = fVarA.f128848b;
            if (cVarA == null || iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                o4.w0.f129024b.getClass();
                fVarA = o4.x0.a(iCeil, iCeil, o4.w0.f129025c, 24);
                j.f201649b = fVarA;
                cVarA = o4.l1.a(fVarA);
                j.f201650c = cVarA;
            }
        } else {
            o4.w0.f129024b.getClass();
            fVarA = o4.x0.a(iCeil, iCeil, o4.w0.f129025c, 24);
            j.f201649b = fVarA;
            cVarA = o4.l1.a(fVarA);
            j.f201650c = cVarA;
        }
        o4.f fVar2 = fVarA;
        o4.c cVar = cVarA;
        Bitmap bitmap2 = fVar2.f128848b;
        if (aVar == null) {
            aVar = new q4.a();
            j.f201651d = aVar;
        }
        q4.a aVar2 = aVar;
        q4.a.C2680a c2680a = aVar2.f142542a;
        g6.o layoutDirection = fVar.f109845a.getLayoutDirection();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        n4.g.a aVar3 = n4.g.f123559b;
        g6.c cVar2 = c2680a.f142546a;
        g6.o oVar = c2680a.f142547b;
        o4.y yVar = c2680a.f142548c;
        long j8 = c2680a.f142549d;
        c2680a.f142546a = fVar;
        c2680a.f142547b = layoutDirection;
        c2680a.f142548c = cVar;
        c2680a.f142549d = jFloatToRawIntBits;
        cVar.l();
        o4.d0.f128823b.getClass();
        long j14 = o4.d0.f128824c;
        long jB = aVar2.b();
        o4.q.f128930b.getClass();
        q4.f.A0(aVar2, j14, 0L, jB, 0.0f, null, null, 58);
        long jD = o4.f0.d(4278190080L);
        n4.c.f123541b.getClass();
        q4.f.A0(aVar2, jD, 0L, (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), 0.0f, null, null, 120);
        q4.f.o0(aVar2, o4.f0.d(4278190080L), f14, (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), null, 0, 120);
        cVar.i();
        c2680a.f142546a = cVar2;
        c2680a.f142547b = oVar;
        c2680a.f142548c = yVar;
        c2680a.f142549d = j8;
        return fVar2;
    }
}
