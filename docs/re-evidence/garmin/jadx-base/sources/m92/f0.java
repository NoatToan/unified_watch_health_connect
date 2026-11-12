package m92;

import l3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 {
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    public static final void a(h4.r rVar, j23.l lVar, z zVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1488279636);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(zVar) ? 256 : 128) | 27648;
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            boolean zR = o0VarE.r(lVar) | o0VarE.r(zVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new p1(28, lVar, zVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p1(28, lVar, zVar);
                    o0VarE.K(objQ);
                }
            }
            u1.n.b(rVar, (e23.l) objQ, o0VarE, i15 & 14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lb0.a(rVar, (Object) lVar, (Object) zVar, i14, 17);
        }
    }

    public static final l53.c b(q4.f fVar, j23.l lVar, z zVar, Float f14, Float f15) {
        fVar.getClass();
        int i14 = lVar.f96797b;
        zVar.getClass();
        float fFloatValue = (f14 == null ? Integer.valueOf(i14) : f14).floatValue();
        float fH = i0.h(0.0f, 0.0f, f15 != null ? f15.floatValue() : 1.0f, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)), 0.0f);
        float fH2 = i0.h(lVar.f96796a, 0.0f, fFloatValue, 0.0f, Float.intBitsToFloat((int) (fVar.b() >> 32)));
        float fH3 = i0.h(i14, 0.0f, fFloatValue, 0.0f, Float.intBitsToFloat((int) (fVar.b() >> 32))) - fH2;
        float fS0 = fVar.s0(zVar.f117460b);
        long j8 = zVar.f117459a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fH2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        n4.c.a aVar = n4.c.f123541b;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fH3)) << 32) | (((long) Float.floatToRawIntBits(fH)) & 4294967295L);
        n4.g.a aVar2 = n4.g.f123559b;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fS0)) << 32) | (((long) Float.floatToRawIntBits(fS0)) & 4294967295L);
        n4.a.C2318a c2318a = n4.a.f123535b;
        q4.f.M0(fVar, j8, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, zVar.f117461c, 0, 224);
        return i53.a.c();
    }
}
