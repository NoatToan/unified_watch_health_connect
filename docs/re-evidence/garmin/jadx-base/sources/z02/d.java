package z02;

import ba2.i;
import c2.k3;
import d62.o;
import e23.p;
import g02.s0;
import i3.hb;
import i3.kb;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import uj1.y;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x011c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0129  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void a(boolean z14, p<? super m, ? super Integer, Unit> pVar, p<? super m, ? super Integer, Unit> pVar2, p<? super m, ? super Integer, Unit> pVar3, k3 k3Var, p<? super m, ? super Integer, Unit> pVar4, m mVar, int i14, int i15) {
        int i16;
        p<? super m, ? super Integer, Unit> pVar5;
        int i17;
        p<? super m, ? super Integer, Unit> pVar6;
        int i18;
        k3 k3Var2;
        boolean z15;
        boolean z16;
        p<? super m, ? super Integer, Unit> pVar7;
        k3 k3Var3;
        p2 p2VarI0;
        p<? super m, ? super Integer, Unit> pVar8;
        p<? super m, ? super Integer, Unit> pVar9;
        k3 k3VarA;
        boolean z17;
        int i19;
        pVar.getClass();
        pVar4.getClass();
        o0 o0VarE = mVar.E(2105228282);
        int i24 = i15 & 1;
        if (i24 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(pVar) ? 32 : 16;
        }
        int i25 = i15 & 4;
        if (i25 == 0) {
            if ((i14 & 384) == 0) {
                pVar5 = pVar2;
                i16 |= o0VarE.r(pVar5) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    pVar6 = pVar3;
                    if (o0VarE.r(pVar6)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                if ((i14 & 24576) == 0) {
                    if ((i15 & 16) == 0) {
                        k3Var2 = k3Var;
                        int i26 = o0VarE.B(k3Var2) ? 16384 : 8192;
                        i16 |= i26;
                    } else {
                        k3Var2 = k3Var;
                    }
                    i16 |= i26;
                } else {
                    k3Var2 = k3Var;
                }
                if ((196608 & i14) == 0) {
                    if (o0VarE.r(pVar4)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i16 |= i19;
                }
                if ((74899 & i16) != 74898) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (o0VarE.n(i16 & 1, z15)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        if (i24 != 0) {
                            z14 = false;
                        }
                        if (i25 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar5;
                        }
                        if (i17 != 0) {
                            a.f200730a.getClass();
                            pVar9 = a.f200731b;
                        } else {
                            pVar9 = pVar6;
                        }
                        if ((i15 & 16) != 0) {
                            hb.f88319a.getClass();
                            i16 &= -57345;
                            k3VarA = hb.a(o0VarE);
                        } else {
                            k3VarA = k3Var2;
                        }
                        z17 = z14;
                    } else {
                        o0VarE.e();
                        if ((i15 & 16) != 0) {
                            i16 &= -57345;
                        }
                        z17 = z14;
                        pVar8 = pVar5;
                        pVar9 = pVar6;
                        k3VarA = k3Var2;
                    }
                    o0VarE.h0();
                    x1 x1Var = n.f135158a;
                    s0.a(null, z17, z3.f.c(1639185648, new c(pVar, pVar8, k3VarA, pVar9, pVar4), o0VarE), o0VarE, ((i16 << 3) & 112) | 384, 1);
                    z16 = z17;
                    pVar5 = pVar8;
                    k3Var3 = k3VarA;
                    pVar7 = pVar9;
                } else {
                    o0VarE.e();
                    z16 = z14;
                    pVar7 = pVar6;
                    k3Var3 = k3Var2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new o(z16, pVar, pVar5, pVar7, k3Var3, pVar4, i14, i15, 25);
                }
            }
            i16 |= 3072;
            pVar6 = pVar3;
            if ((i14 & 24576) == 0) {
                if ((i15 & 16) == 0) {
                    k3Var2 = k3Var;
                    if (o0VarE.B(k3Var2)) {
                    }
                    i16 |= i26;
                } else {
                    k3Var2 = k3Var;
                }
                i16 |= i26;
            } else {
                k3Var2 = k3Var;
            }
            if ((196608 & i14) == 0) {
                if (o0VarE.r(pVar4)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i16 |= i19;
            }
            if ((74899 & i16) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i16 & 1, z15)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i24 != 0) {
                        z14 = false;
                    }
                    if (i25 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar5;
                    }
                    if (i17 != 0) {
                        a.f200730a.getClass();
                        pVar9 = a.f200731b;
                    } else {
                        pVar9 = pVar6;
                    }
                    if ((i15 & 16) != 0) {
                        hb.f88319a.getClass();
                        i16 &= -57345;
                        k3VarA = hb.a(o0VarE);
                    } else {
                        k3VarA = k3Var2;
                    }
                    z17 = z14;
                } else {
                    if (i24 != 0) {
                        z14 = false;
                    }
                    if (i25 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar5;
                    }
                    if (i17 != 0) {
                        a.f200730a.getClass();
                        pVar9 = a.f200731b;
                    } else {
                        pVar9 = pVar6;
                    }
                    if ((i15 & 16) != 0) {
                        hb.f88319a.getClass();
                        i16 &= -57345;
                        k3VarA = hb.a(o0VarE);
                    } else {
                        k3VarA = k3Var2;
                    }
                    z17 = z14;
                }
                o0VarE.h0();
                x1 x1Var2 = n.f135158a;
                s0.a(null, z17, z3.f.c(1639185648, new c(pVar, pVar8, k3VarA, pVar9, pVar4), o0VarE), o0VarE, ((i16 << 3) & 112) | 384, 1);
                z16 = z17;
                pVar5 = pVar8;
                k3Var3 = k3VarA;
                pVar7 = pVar9;
            } else {
                o0VarE.e();
                z16 = z14;
                pVar7 = pVar6;
                k3Var3 = k3Var2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new o(z16, pVar, pVar5, pVar7, k3Var3, pVar4, i14, i15, 25);
            }
        }
        i16 |= 384;
        pVar5 = pVar2;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                pVar6 = pVar3;
                if (o0VarE.r(pVar6)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            if ((i14 & 24576) == 0) {
                if ((i15 & 16) == 0) {
                    k3Var2 = k3Var;
                    if (o0VarE.B(k3Var2)) {
                    }
                    i16 |= i26;
                } else {
                    k3Var2 = k3Var;
                }
                i16 |= i26;
            } else {
                k3Var2 = k3Var;
            }
            if ((196608 & i14) == 0) {
                if (o0VarE.r(pVar4)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i16 |= i19;
            }
            if ((74899 & i16) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i16 & 1, z15)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i24 != 0) {
                        z14 = false;
                    }
                    if (i25 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar5;
                    }
                    if (i17 != 0) {
                        a.f200730a.getClass();
                        pVar9 = a.f200731b;
                    } else {
                        pVar9 = pVar6;
                    }
                    if ((i15 & 16) != 0) {
                        hb.f88319a.getClass();
                        i16 &= -57345;
                        k3VarA = hb.a(o0VarE);
                    } else {
                        k3VarA = k3Var2;
                    }
                    z17 = z14;
                } else {
                    if (i24 != 0) {
                        z14 = false;
                    }
                    if (i25 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar5;
                    }
                    if (i17 != 0) {
                        a.f200730a.getClass();
                        pVar9 = a.f200731b;
                    } else {
                        pVar9 = pVar6;
                    }
                    if ((i15 & 16) != 0) {
                        hb.f88319a.getClass();
                        i16 &= -57345;
                        k3VarA = hb.a(o0VarE);
                    } else {
                        k3VarA = k3Var2;
                    }
                    z17 = z14;
                }
                o0VarE.h0();
                x1 x1Var3 = n.f135158a;
                s0.a(null, z17, z3.f.c(1639185648, new c(pVar, pVar8, k3VarA, pVar9, pVar4), o0VarE), o0VarE, ((i16 << 3) & 112) | 384, 1);
                z16 = z17;
                pVar5 = pVar8;
                k3Var3 = k3VarA;
                pVar7 = pVar9;
            } else {
                o0VarE.e();
                z16 = z14;
                pVar7 = pVar6;
                k3Var3 = k3Var2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new o(z16, pVar, pVar5, pVar7, k3Var3, pVar4, i14, i15, 25);
            }
        }
        i16 |= 3072;
        pVar6 = pVar3;
        if ((i14 & 24576) == 0) {
            if ((i15 & 16) == 0) {
                k3Var2 = k3Var;
                if (o0VarE.B(k3Var2)) {
                }
                i16 |= i26;
            } else {
                k3Var2 = k3Var;
            }
            i16 |= i26;
        } else {
            k3Var2 = k3Var;
        }
        if ((196608 & i14) == 0) {
            if (o0VarE.r(pVar4)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i16 |= i19;
        }
        if ((74899 & i16) != 74898) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i16 & 1, z15)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i24 != 0) {
                    z14 = false;
                }
                if (i25 != 0) {
                    pVar8 = null;
                } else {
                    pVar8 = pVar5;
                }
                if (i17 != 0) {
                    a.f200730a.getClass();
                    pVar9 = a.f200731b;
                } else {
                    pVar9 = pVar6;
                }
                if ((i15 & 16) != 0) {
                    hb.f88319a.getClass();
                    i16 &= -57345;
                    k3VarA = hb.a(o0VarE);
                } else {
                    k3VarA = k3Var2;
                }
                z17 = z14;
            } else {
                if (i24 != 0) {
                    z14 = false;
                }
                if (i25 != 0) {
                    pVar8 = null;
                } else {
                    pVar8 = pVar5;
                }
                if (i17 != 0) {
                    a.f200730a.getClass();
                    pVar9 = a.f200731b;
                } else {
                    pVar9 = pVar6;
                }
                if ((i15 & 16) != 0) {
                    hb.f88319a.getClass();
                    i16 &= -57345;
                    k3VarA = hb.a(o0VarE);
                } else {
                    k3VarA = k3Var2;
                }
                z17 = z14;
            }
            o0VarE.h0();
            x1 x1Var4 = n.f135158a;
            s0.a(null, z17, z3.f.c(1639185648, new c(pVar, pVar8, k3VarA, pVar9, pVar4), o0VarE), o0VarE, ((i16 << 3) & 112) | 384, 1);
            z16 = z17;
            pVar5 = pVar8;
            k3Var3 = k3VarA;
            pVar7 = pVar9;
        } else {
            o0VarE.e();
            z16 = z14;
            pVar7 = pVar6;
            k3Var3 = k3Var2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(z16, pVar, pVar5, pVar7, k3Var3, pVar4, i14, i15, 25);
        }
    }

    public static final void b(p pVar, p pVar2, k3 k3Var, p pVar3, p pVar4, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(85610726);
        int i15 = 16;
        int i16 = i14 | (o0VarE.r(pVar) ? 4 : 2) | (o0VarE.r(pVar2) ? 32 : 16) | (o0VarE.B(k3Var) ? 256 : 128) | (o0VarE.r(pVar3) ? 2048 : 1024) | (o0VarE.r(pVar4) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            o0Var = o0VarE;
            kb.a(null, z3.f.c(1649160354, new y(pVar, i15), o0VarE), pVar3, z3.f.c(776749792, new y(pVar2, 17), o0VarE), null, 0, 0L, 0L, k3Var, z3.f.c(-1357879241, new i(pVar4, 8), o0VarE), o0Var, ((i16 >> 3) & 896) | 805309488 | ((i16 << 18) & 234881024), 241);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(pVar, pVar2, k3Var, pVar3, pVar4, i14);
        }
    }
}
