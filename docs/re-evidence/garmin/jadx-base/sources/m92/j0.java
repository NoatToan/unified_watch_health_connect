package m92;

import com.google.android.exoplayer2.C;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 {
    /* JADX WARN: Code duplicated, block: B:50:0x00b0  */
    public static final void a(h4.r rVar, i53.c cVar, Float f14, float f15, String str, p3.m mVar, int i14) {
        int i15;
        cVar.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(1846888327);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        int i16 = i15 | 48 | (o0VarE.B(cVar) ? 256 : 128) | 27648 | (o0VarE.B(f14) ? 131072 : 65536);
        if ((i14 & 1572864) == 0) {
            i16 |= o0VarE.i(f15) ? 1048576 : 524288;
        }
        int i17 = i16 | 12582912 | (o0VarE.B(str) ? 67108864 : 33554432) | C.ENCODING_PCM_32BIT;
        if (o0VarE.n(i17 & 1, (306783379 & i17) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            boolean zIsEmpty = cVar.isEmpty();
            boolean z14 = ((i17 & 896) == 256) | ((458752 & i17) == 131072) | ((3670016 & i17) == 1048576);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new cq.p(cVar, f14, f15, 6);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new cq.p(cVar, f14, f15, 6);
                    o0VarE.K(objQ);
                }
            }
            l.b(rVar, null, null, str, zIsEmpty, 0.0f, null, null, null, (e23.l) objQ, o0VarE, ((i17 >> 15) & 7168) | (i17 & 126) | 384 | 918552576, 64);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dt1.c(rVar, cVar, f14, f15, str, i14);
        }
    }
}
