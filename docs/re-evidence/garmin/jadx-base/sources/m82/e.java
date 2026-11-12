package m82;

import c22.e0;
import e2.l;
import e23.q;
import h2.u;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac A[PHI: r8 r9
      0x00ac: PHI (r8v5 h4.r) = (r8v3 h4.r), (r8v6 h4.r) binds: [B:69:0x00b9, B:60:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r9v9 int) = (r9v4 int), (r9v2 int) binds: [B:69:0x00b9, B:60:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:75:0x010a  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void a(r rVar, f fVar, int i14, boolean z14, q<? super Integer, ? super m, ? super Integer, Unit> qVar, m mVar, int i15, int i16) {
        r rVar2;
        int i17;
        int i18;
        int i19;
        boolean z15;
        int i24;
        boolean z16;
        o0 o0Var;
        r rVar3;
        int i25;
        boolean z17;
        p2 p2VarI0;
        r rVar4;
        r rVar5;
        boolean z18;
        int i26;
        qVar.getClass();
        o0 o0VarE = mVar.E(-1237168608);
        int i27 = i16 & 1;
        if (i27 != 0) {
            i17 = i15 | 6;
            rVar2 = rVar;
        } else if ((i15 & 6) == 0) {
            rVar2 = rVar;
            i17 = (o0VarE.B(rVar2) ? 4 : 2) | i15;
        } else {
            rVar2 = rVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.B(fVar) ? 32 : 16;
        }
        int i28 = i16 & 4;
        if (i28 == 0) {
            if ((i15 & 384) == 0) {
                i18 = i14;
                i17 |= o0VarE.k(i18) ? 256 : 128;
            }
            i19 = i16 & 8;
            if (i19 != 0) {
                if ((i15 & 3072) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i24 = 2048;
                    } else {
                        i24 = 1024;
                    }
                    i17 |= i24;
                }
                if ((i15 & 24576) == 0) {
                    if (o0VarE.r(qVar)) {
                        i26 = 16384;
                    } else {
                        i26 = 8192;
                    }
                    i17 |= i26;
                }
                if ((i17 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i17 & 1, z16)) {
                    o0VarE.G0();
                    if ((i15 & 1) != 0 || o0VarE.o0()) {
                        if (i27 != 0) {
                            rVar4 = r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i28 != 0) {
                            i18 = 0;
                        }
                        rVar5 = rVar4;
                        if (i19 == 0) {
                        }
                        int i29 = i18;
                        o0VarE.h0();
                        x1 x1Var = n.f135158a;
                        int i30 = i17;
                        o0Var = o0VarE;
                        u.a(fVar.f117196a, rVar5, null, null, i29, 0.0f, null, null, z18, null, null, null, null, z3.f.c(-1933238209, new l(qVar, 2), o0VarE), o0Var, ((i30 << 3) & 112) | (57344 & (i30 << 6)) | ((i30 << 15) & 234881024), 24576, 16108);
                        rVar3 = rVar5;
                        i25 = i29;
                        z17 = z18;
                    } else {
                        o0VarE.e();
                        rVar5 = rVar2;
                    }
                    int i210 = i18;
                    o0VarE.h0();
                    x1 x1Var2 = n.f135158a;
                    int i34 = i17;
                    o0Var = o0VarE;
                    u.a(fVar.f117196a, rVar5, null, null, i210, 0.0f, null, null, z18, null, null, null, null, z3.f.c(-1933238209, new l(qVar, 2), o0VarE), o0Var, ((i34 << 3) & 112) | (57344 & (i34 << 6)) | ((i34 << 15) & 234881024), 24576, 16108);
                    rVar3 = rVar5;
                    i25 = i210;
                    z17 = z18;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar3 = rVar2;
                    i25 = i18;
                    z17 = z15;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e0(rVar3, fVar, i25, z17, qVar, i15, i16, 2);
                }
            }
            i17 |= 3072;
            z15 = z14;
            if ((i15 & 24576) == 0) {
                if (o0VarE.r(qVar)) {
                    i26 = 16384;
                } else {
                    i26 = 8192;
                }
                i17 |= i26;
            }
            if ((i17 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i17 & 1, z16)) {
                o0VarE.G0();
                if ((i15 & 1) != 0) {
                    if (i27 != 0) {
                        rVar4 = r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i28 != 0) {
                        i18 = 0;
                    }
                    rVar5 = rVar4;
                    z18 = i19 == 0 ? z15 : true;
                } else {
                    if (i27 != 0) {
                        rVar4 = r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i28 != 0) {
                        i18 = 0;
                    }
                    rVar5 = rVar4;
                    if (i19 == 0) {
                    }
                }
                int i211 = i18;
                o0VarE.h0();
                x1 x1Var3 = n.f135158a;
                int i35 = i17;
                o0Var = o0VarE;
                u.a(fVar.f117196a, rVar5, null, null, i211, 0.0f, null, null, z18, null, null, null, null, z3.f.c(-1933238209, new l(qVar, 2), o0VarE), o0Var, ((i35 << 3) & 112) | (57344 & (i35 << 6)) | ((i35 << 15) & 234881024), 24576, 16108);
                rVar3 = rVar5;
                i25 = i211;
                z17 = z18;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar3 = rVar2;
                i25 = i18;
                z17 = z15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e0(rVar3, fVar, i25, z17, qVar, i15, i16, 2);
            }
        }
        i17 |= 384;
        i18 = i14;
        i19 = i16 & 8;
        if (i19 != 0) {
            if ((i15 & 3072) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i24 = 2048;
                } else {
                    i24 = 1024;
                }
                i17 |= i24;
            }
            if ((i15 & 24576) == 0) {
                if (o0VarE.r(qVar)) {
                    i26 = 16384;
                } else {
                    i26 = 8192;
                }
                i17 |= i26;
            }
            if ((i17 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i17 & 1, z16)) {
                o0VarE.G0();
                if ((i15 & 1) != 0) {
                    if (i27 != 0) {
                        rVar4 = r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i28 != 0) {
                        i18 = 0;
                    }
                    rVar5 = rVar4;
                    if (i19 == 0) {
                    }
                } else {
                    if (i27 != 0) {
                        rVar4 = r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i28 != 0) {
                        i18 = 0;
                    }
                    rVar5 = rVar4;
                    if (i19 == 0) {
                    }
                }
                int i212 = i18;
                o0VarE.h0();
                x1 x1Var4 = n.f135158a;
                int i36 = i17;
                o0Var = o0VarE;
                u.a(fVar.f117196a, rVar5, null, null, i212, 0.0f, null, null, z18, null, null, null, null, z3.f.c(-1933238209, new l(qVar, 2), o0VarE), o0Var, ((i36 << 3) & 112) | (57344 & (i36 << 6)) | ((i36 << 15) & 234881024), 24576, 16108);
                rVar3 = rVar5;
                i25 = i212;
                z17 = z18;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar3 = rVar2;
                i25 = i18;
                z17 = z15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e0(rVar3, fVar, i25, z17, qVar, i15, i16, 2);
            }
        }
        i17 |= 3072;
        z15 = z14;
        if ((i15 & 24576) == 0) {
            if (o0VarE.r(qVar)) {
                i26 = 16384;
            } else {
                i26 = 8192;
            }
            i17 |= i26;
        }
        if ((i17 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i17 & 1, z16)) {
            o0VarE.G0();
            if ((i15 & 1) != 0) {
                if (i27 != 0) {
                    rVar4 = r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i28 != 0) {
                    i18 = 0;
                }
                rVar5 = rVar4;
                if (i19 == 0) {
                }
            } else {
                if (i27 != 0) {
                    rVar4 = r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i28 != 0) {
                    i18 = 0;
                }
                rVar5 = rVar4;
                if (i19 == 0) {
                }
            }
            int i213 = i18;
            o0VarE.h0();
            x1 x1Var5 = n.f135158a;
            int i37 = i17;
            o0Var = o0VarE;
            u.a(fVar.f117196a, rVar5, null, null, i213, 0.0f, null, null, z18, null, null, null, null, z3.f.c(-1933238209, new l(qVar, 2), o0VarE), o0Var, ((i37 << 3) & 112) | (57344 & (i37 << 6)) | ((i37 << 15) & 234881024), 24576, 16108);
            rVar3 = rVar5;
            i25 = i213;
            z17 = z18;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar3 = rVar2;
            i25 = i18;
            z17 = z15;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e0(rVar3, fVar, i25, z17, qVar, i15, i16, 2);
        }
    }
}
