package li0;

import b21.n9;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lli0/c0;", "", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f112641a = new c0();

    private c0() {
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public final void a(d0 d0Var, f fVar, h4.r rVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        int i17;
        e23.p<? super p3.m, ? super Integer, Unit> pVar2;
        int i18;
        boolean z14;
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        p2 p2VarI0;
        h4.r rVar3;
        e23.p<? super p3.m, ? super Integer, Unit> pVar4;
        d0Var.getClass();
        fVar.getClass();
        p3.o0 o0VarE = mVar.E(-606981933);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(fVar) ? 32 : 16;
        }
        int i19 = i15 & 4;
        if (i19 == 0) {
            if ((i14 & 384) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    pVar2 = pVar;
                    if (o0VarE.r(pVar2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                if ((i16 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i19 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar2;
                    }
                    x1 x1Var = p3.n.f135158a;
                    k0.a(d0Var, fVar, rVar3, false, false, false, false, null, pVar4, o0VarE, (i16 & 14) | 199680 | (i16 & 112) | (i16 & 896) | ((i16 << 15) & 234881024), 208);
                    rVar2 = rVar3;
                    pVar3 = pVar4;
                } else {
                    o0VarE.e();
                    pVar3 = pVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a42.a0(this, d0Var, fVar, rVar2, pVar3, i14, i15, 22);
                }
            }
            i16 |= 3072;
            pVar2 = pVar;
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i19 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar2;
                }
                x1 x1Var2 = p3.n.f135158a;
                k0.a(d0Var, fVar, rVar3, false, false, false, false, null, pVar4, o0VarE, (i16 & 14) | 199680 | (i16 & 112) | (i16 & 896) | ((i16 << 15) & 234881024), 208);
                rVar2 = rVar3;
                pVar3 = pVar4;
            } else {
                o0VarE.e();
                pVar3 = pVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a42.a0(this, d0Var, fVar, rVar2, pVar3, i14, i15, 22);
            }
        }
        i16 |= 384;
        rVar2 = rVar;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                pVar2 = pVar;
                if (o0VarE.r(pVar2)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i19 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar2;
                }
                x1 x1Var3 = p3.n.f135158a;
                k0.a(d0Var, fVar, rVar3, false, false, false, false, null, pVar4, o0VarE, (i16 & 14) | 199680 | (i16 & 112) | (i16 & 896) | ((i16 << 15) & 234881024), 208);
                rVar2 = rVar3;
                pVar3 = pVar4;
            } else {
                o0VarE.e();
                pVar3 = pVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a42.a0(this, d0Var, fVar, rVar2, pVar3, i14, i15, 22);
            }
        }
        i16 |= 3072;
        pVar2 = pVar;
        if ((i16 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i19 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i17 != 0) {
                pVar4 = null;
            } else {
                pVar4 = pVar2;
            }
            x1 x1Var4 = p3.n.f135158a;
            k0.a(d0Var, fVar, rVar3, false, false, false, false, null, pVar4, o0VarE, (i16 & 14) | 199680 | (i16 & 112) | (i16 & 896) | ((i16 << 15) & 234881024), 208);
            rVar2 = rVar3;
            pVar3 = pVar4;
        } else {
            o0VarE.e();
            pVar3 = pVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.a0(this, d0Var, fVar, rVar2, pVar3, i14, i15, 22);
        }
    }

    public final void b(d0 d0Var, f fVar, h4.r rVar, boolean z14, e23.a aVar, e23.p pVar, p3.m mVar, int i14) {
        int i15;
        h4.r rVar2;
        boolean z15;
        fVar.getClass();
        p3.o0 o0VarE = mVar.E(442511243);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(fVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            rVar2 = rVar;
            i15 |= o0VarE.B(rVar2) ? 256 : 128;
        } else {
            rVar2 = rVar;
        }
        if ((i14 & 3072) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 2048 : 1024;
        } else {
            z15 = z14;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i15 |= o0VarE.r(pVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = 196608 | (i15 & 14) | (i15 & 112) | (i15 & 896) | ((i15 << 3) & 57344);
            int i17 = i15 << 9;
            k0.a(d0Var, fVar, rVar2, false, z15, true, false, aVar, pVar, o0VarE, i16 | (29360128 & i17) | (i17 & 234881024), 72);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(this, d0Var, fVar, rVar, z14, aVar, pVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public final void c(d0 d0Var, f fVar, boolean z14, h4.r rVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        boolean z15;
        p2 p2VarI0;
        h4.r rVar3;
        h4.r rVar4;
        d0Var.getClass();
        b0 b0Var = d0Var.f112649b;
        fVar.getClass();
        p3.o0 o0VarE = mVar.E(1897294026);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(fVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.h(z14) ? 256 : 128;
        }
        int i17 = i15 & 8;
        if (i17 == 0) {
            if ((i14 & 3072) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 2048 : 1024;
            }
            if ((i16 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i16 & 1, z15)) {
                if (i17 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                x1 x1Var = p3.n.f135158a;
                if (b0Var != b0.UNDO) {
                    o0VarE.C(516952559);
                    boolean z16 = (z14 || e0.b(d0Var) || b0Var == b0.REQUEST_SENT) ? false : true;
                    rVar4 = rVar3;
                    k0.a(d0Var, fVar, rVar4, z16, false, true, false, null, null, o0VarE, (i16 & 14) | 196608 | (i16 & 112) | ((i16 >> 3) & 896), 464);
                    o0VarE.g0(false);
                } else {
                    rVar4 = rVar3;
                    o0VarE.C(517279671);
                    k0.b(d0Var, fVar, rVar4, o0VarE, ((i16 >> 3) & 896) | (i16 & 126));
                    o0VarE.g0(false);
                }
                rVar2 = rVar4;
            } else {
                o0VarE.e();
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a82.a(this, d0Var, fVar, z14, rVar2, i14, i15);
            }
        }
        i16 |= 3072;
        rVar2 = rVar;
        if ((i16 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i16 & 1, z15)) {
            if (i17 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar2;
            }
            x1 x1Var2 = p3.n.f135158a;
            if (b0Var != b0.UNDO) {
                o0VarE.C(516952559);
                if (z14) {
                }
                rVar4 = rVar3;
                k0.a(d0Var, fVar, rVar4, z16, false, true, false, null, null, o0VarE, (i16 & 14) | 196608 | (i16 & 112) | ((i16 >> 3) & 896), 464);
                o0VarE.g0(false);
            } else {
                rVar4 = rVar3;
                o0VarE.C(517279671);
                k0.b(d0Var, fVar, rVar4, o0VarE, ((i16 >> 3) & 896) | (i16 & 126));
                o0VarE.g0(false);
            }
            rVar2 = rVar4;
        } else {
            o0VarE.e();
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.a(this, d0Var, fVar, z14, rVar2, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x009b  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public final void d(d0 d0Var, f fVar, h4.r rVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        boolean z14;
        p2 p2VarI0;
        h4.r rVar3;
        d0Var.getClass();
        fVar.getClass();
        p3.o0 o0VarE = mVar.E(-1225481631);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(fVar) ? 32 : 16;
        }
        int i17 = i15 & 4;
        if (i17 == 0) {
            if ((i14 & 384) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 256 : 128;
            }
            if ((i16 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i17 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                x1 x1Var = p3.n.f135158a;
                k0.a(d0Var, fVar, rVar3, d0Var.f112649b == b0.ACCEPT, false, false, true, null, null, o0VarE, (i16 & 14) | 1572864 | (i16 & 112) | (i16 & 896), 432);
                rVar2 = rVar3;
            } else {
                o0VarE.e();
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.f0(this, d0Var, fVar, rVar2, i14, i15);
            }
        }
        i16 |= 384;
        rVar2 = rVar;
        if ((i16 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i17 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar2;
            }
            x1 x1Var2 = p3.n.f135158a;
            k0.a(d0Var, fVar, rVar3, d0Var.f112649b == b0.ACCEPT, false, false, true, null, null, o0VarE, (i16 & 14) | 1572864 | (i16 & 112) | (i16 & 896), 432);
            rVar2 = rVar3;
        } else {
            o0VarE.e();
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.f0(this, d0Var, fVar, rVar2, i14, i15);
        }
    }

    public final void e(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1965841686);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            k0.d(o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new kk1.h(this, i14, 21);
        }
    }
}
