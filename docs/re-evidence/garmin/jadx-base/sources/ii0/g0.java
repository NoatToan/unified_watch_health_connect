package ii0;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.d6;
import i3.s4;
import p3.p1;
import p3.p2;
import p3.x1;
import yc.z0;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 {
    /* JADX WARN: Code duplicated, block: B:207:0x0352  */
    /* JADX WARN: Code duplicated, block: B:210:0x0359  */
    /* JADX WARN: Code duplicated, block: B:211:0x035c  */
    /* JADX WARN: Code duplicated, block: B:217:0x036b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, zc.d dVar, zc.d dVar2, li0.f fVar, u2.h hVar, p003ji0.a aVar, e2.i0 i0Var, e2.i0 i0Var2, e23.a aVar2, e23.p pVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        char c14;
        p1 p1Var;
        p1 p1Var2;
        p1 p1Var3;
        li0.f fVar2;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objQ;
        p3.o0 o0Var2;
        dVar2.getClass();
        fVar.getClass();
        hVar.getClass();
        aVar.getClass();
        i0Var.getClass();
        i0Var2.getClass();
        pVar.getClass();
        p3.o0 o0VarE = mVar.E(-542676315);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(dVar2) : o0VarE.r(dVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(hVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(aVar) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i15 |= o0VarE.B(i0Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i15 |= o0VarE.B(i0Var2) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i15 |= o0VarE.r(aVar2) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i15 |= o0VarE.r(pVar) ? 536870912 : 268435456;
        }
        if (o0VarE.n(i15 & 1, (i15 & 306783379) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ2 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var4 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var5 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p1 p1Var6 = (p1) objQ4;
            boolean zB = o0VarE.B(hVar.b().f167839c);
            Object objQ5 = o0VarE.q();
            if (zB || objQ5 == c2565a) {
                objQ5 = hb.a.n(hVar.b().f167839c.length() == 0, o0VarE);
            }
            p1 p1Var7 = (p1) objQ5;
            z0 z0Var = dVar.d().f196385a;
            int i16 = i15 & 112;
            int i17 = i15;
            boolean z17 = (i16 == 32 || ((i15 & 64) != 0 && o0VarE.r(dVar))) | ((i15 & 3670016) == 1048576);
            Object objQ6 = o0VarE.q();
            if (z17 || objQ6 == c2565a) {
                c14 = 256;
                p1Var = p1Var6;
                p1Var2 = p1Var5;
                e0 e0Var = new e0(dVar, i0Var, p1Var2, p1Var, p1Var4, null);
                p1Var3 = p1Var4;
                o0VarE.K(e0Var);
                objQ6 = e0Var;
            } else {
                p1Var3 = p1Var4;
                c14 = 256;
                p1Var = p1Var6;
                p1Var2 = p1Var5;
            }
            p3.l0.e((e23.p) objQ6, z0Var, o0VarE);
            Boolean bool = Boolean.FALSE;
            Boolean boolValueOf = Boolean.valueOf(dVar2.d().f196390f);
            CharSequence charSequence = hVar.b().f167839c;
            int i18 = i17 & 896;
            boolean z18 = i18 == c14 || ((i17 & 512) != 0 && o0VarE.r(dVar2));
            Object objQ7 = o0VarE.q();
            if (z18 || objQ7 == c2565a) {
                objQ7 = new f0(dVar2, null);
                o0VarE.K(objQ7);
            }
            p1 p1Var8 = p1Var;
            p1 p1Var9 = p1Var2;
            p1 p1VarP = p3.p0.p(bool, boolValueOf, charSequence, (e23.p) objQ7, o0VarE, 6);
            if (((Boolean) p1Var3.getF182175a()).booleanValue() || dVar.b() != 0) {
                o0VarE.C(-611287985);
                e2.i0 i0Var3 = ((Boolean) p1Var7.getF182175a()).booleanValue() ? i0Var : i0Var2;
                boolean zBooleanValue = ((Boolean) p1Var9.getF182175a()).booleanValue();
                boolean zJ = d53.w.J(hVar.b().f167839c);
                boolean z19 = ((234881024 & i17) == 67108864) | (i16 == 32 || ((i17 & 64) != 0 && o0VarE.r(dVar)));
                Object objQ8 = o0VarE.q();
                if (z19 || objQ8 == c2565a) {
                    objQ8 = new d6(aVar2, 15, dVar, p1Var9);
                    o0VarE.K(objQ8);
                }
                e23.a aVar3 = (e23.a) objQ8;
                z3.e eVarC = z3.f.c(1158131100, new w(hVar, 2), o0VarE);
                boolean zB2 = (i18 == 256 || ((i17 & 512) != 0 && o0VarE.r(dVar2))) | o0VarE.B(p1VarP) | ((57344 & i17) == 16384);
                if ((i17 & 7168) != 2048) {
                    fVar2 = fVar;
                    boolean z24 = (i17 & 4096) != 0 && o0VarE.r(fVar2);
                    boolean zB3 = zB2 | z24 | o0VarE.B(p1Var7);
                    if (i16 != 32 || ((i17 & 64) != 0 && o0VarE.r(dVar))) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z25 = z14 | zB3;
                    if ((i17 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z25 | z15;
                    objQ = o0VarE.q();
                    if (!z16 || objQ == c2565a) {
                        li0.f fVar3 = fVar2;
                        o0Var2 = o0VarE;
                        b82.l0 l0Var = new b82.l0(dVar2, hVar, fVar3, p1VarP, p1Var7, dVar, str);
                        o0Var2.K(l0Var);
                        objQ = l0Var;
                    } else {
                        o0Var2 = o0VarE;
                    }
                    p003ji0.h.a(i0Var3, zBooleanValue, zJ, aVar3, eVarC, aVar, (e23.l) objQ, o0Var2, (458752 & i17) | 24576);
                    o0Var = o0Var2;
                    o0Var.g0(false);
                } else {
                    fVar2 = fVar;
                }
                boolean zB4 = zB2 | z24 | o0VarE.B(p1Var7);
                if (i16 != 32) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                boolean z26 = z14 | zB4;
                if ((i17 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z26 | z15;
                objQ = o0VarE.q();
                if (z16) {
                    li0.f fVar4 = fVar2;
                    o0Var2 = o0VarE;
                    b82.l0 l0Var2 = new b82.l0(dVar2, hVar, fVar4, p1VarP, p1Var7, dVar, str);
                    o0Var2.K(l0Var2);
                    objQ = l0Var2;
                } else {
                    li0.f fVar5 = fVar2;
                    o0Var2 = o0VarE;
                    b82.l0 l0Var3 = new b82.l0(dVar2, hVar, fVar5, p1VarP, p1Var7, dVar, str);
                    o0Var2.K(l0Var3);
                    objQ = l0Var3;
                }
                p003ji0.h.a(i0Var3, zBooleanValue, zJ, aVar3, eVarC, aVar, (e23.l) objQ, o0Var2, (458752 & i17) | 24576);
                o0Var = o0Var2;
                o0Var.g0(false);
            } else {
                o0VarE.C(-611633480);
                boolean zBooleanValue2 = ((Boolean) p1Var9.getF182175a()).booleanValue();
                boolean z27 = i16 == 32 || ((i17 & 64) != 0 && o0VarE.r(dVar));
                Object objQ9 = o0VarE.q();
                if (z27 || objQ9 == c2565a) {
                    objQ9 = new b0(dVar, p1Var9, p1Var8, 1);
                    o0VarE.K(objQ9);
                }
                m3.l.b(zBooleanValue2, (e23.a) objQ9, null, null, null, null, z3.f.c(1139515408, new ba2.i(pVar, 2), o0VarE), o0VarE, 1572864, 60);
                o0VarE.g0(false);
                o0Var = o0VarE;
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s4(str, dVar, dVar2, fVar, hVar, aVar, i0Var, i0Var2, aVar2, pVar, i14);
        }
    }
}
