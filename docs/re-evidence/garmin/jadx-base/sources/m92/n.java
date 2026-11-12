package m92;

import s5.s0;
import s5.v0;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class n {
    /* JADX WARN: Code duplicated, block: B:16:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:18:0x011a  */
    /* JADX WARN: Code duplicated, block: B:7:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:9:0x00da  */
    public static l53.c a(q4.f fVar, s5.c cVar, s0 s0Var, h0.e.a aVar, Float f14, int i14) {
        int iRound;
        int i15;
        int iRound2;
        int iRound3;
        int iRound4;
        fVar.getClass();
        aVar.getClass();
        float fH = i0.h(aVar.f117346a, 0.0f, f14.floatValue() - 1, 0.0f, Float.intBitsToFloat((int) (fVar.b() >> 32)));
        float fH2 = i0.h(aVar.f117347b, 0.0f, 100.0f, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)), 0.0f);
        s5.c.b bVar = new s5.c.b(0, 1, null);
        bVar.c(cVar);
        s5.c cVarK = bVar.k();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fH - (((int) (s0.b(s0Var, cVarK, null, 0, false, 0, null, 0L, null, null, null, 2046).f157282c >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits((fH2 - (((int) (s0.b(s0Var, cVarK, null, 0, false, 0, null, 0L, null, null, null, 2046).f157282c & 4294967295L)) / 2)) - i14)) & 4294967295L);
        n4.c.a aVar2 = n4.c.f123541b;
        x0.f157320d.getClass();
        x0 x0Var = x0.f157321e;
        d6.p.f57793b.getClass();
        int i16 = d6.p.f57794c;
        p13.j0 j0Var = p13.j0.f134944a;
        n4.g.f123559b.getClass();
        long j8 = n4.g.f123560c;
        q4.f.f142555o0.getClass();
        int i17 = q4.f.a.f142557b;
        if (j8 == 9205357640488583168L) {
            iRound = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (fVar.b() >> 32)) - Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))));
            if (iRound < 0) {
                iRound = 0;
            }
            i15 = iRound;
            iRound2 = 0;
        } else {
            int i18 = (int) (j8 >> 32);
            if (Float.isNaN(Float.intBitsToFloat(i18))) {
                iRound = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (fVar.b() >> 32)) - Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))));
                if (iRound < 0) {
                    iRound = 0;
                }
                i15 = iRound;
                iRound2 = 0;
            } else {
                iRound2 = Math.round((float) Math.ceil(Float.intBitsToFloat(i18)));
                i15 = iRound2;
            }
        }
        if (j8 == 9205357640488583168L) {
            iRound3 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))));
            if (iRound3 < 0) {
                iRound3 = 0;
            }
            iRound4 = 0;
        } else {
            int i19 = (int) (j8 & 4294967295L);
            if (Float.isNaN(Float.intBitsToFloat(i19))) {
                iRound3 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))));
                if (iRound3 < 0) {
                    iRound3 = 0;
                }
                iRound4 = 0;
            } else {
                iRound4 = Math.round((float) Math.ceil(Float.intBitsToFloat(i19)));
                iRound3 = iRound4;
            }
        }
        s5.q0 q0VarB = s0.b(s0Var, cVarK, x0Var, i16, true, Integer.MAX_VALUE, j0Var, g6.b.a(iRound2, i15, iRound4, iRound3), fVar.getLayoutDirection(), fVar, null, 1536);
        q4.a.b f142543b = fVar.getF142543b();
        long jB = f142543b.b();
        f142543b.a().l();
        try {
            q4.b bVar2 = f142543b.f142550a;
            bVar2.h(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
            v0.a(bVar2, q0VarB);
            s5.o.j(q0VarB.f157281b, fVar.getF142543b().a(), 0L, null, null, null, i17, 30);
            f142543b.a().i();
            f142543b.c(jB);
            return i53.a.c();
        } catch (Throwable th3) {
            tn.k.p(f142543b, jB);
            throw th3;
        }
    }
}
