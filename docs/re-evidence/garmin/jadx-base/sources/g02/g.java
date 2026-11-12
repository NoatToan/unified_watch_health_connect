package g02;

import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    /* JADX WARN: Code duplicated, block: B:101:0x0128  */
    /* JADX WARN: Code duplicated, block: B:102:0x012d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0144  */
    /* JADX WARN: Code duplicated, block: B:107:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x015a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0164  */
    /* JADX WARN: Code duplicated, block: B:119:0x016d  */
    /* JADX WARN: Code duplicated, block: B:121:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:124:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x0099  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:92:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:98:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x0125  */
    public static final void a(final String str, long j8, long j14, h4.r rVar, float f14, float f15, p3.m mVar, final int i14, final int i15) {
        int i16;
        final long j15;
        final long jA;
        h4.r rVar2;
        float f16;
        int i17;
        float f17;
        int i18;
        int i19;
        boolean z14;
        p3.o0 o0Var;
        final h4.r rVar3;
        final float f18;
        final float f19;
        p2 p2VarI0;
        long j16;
        boolean z15;
        Object objQ;
        str.getClass();
        p3.o0 o0VarE = mVar.E(-944091279);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            if ((i15 & 2) == 0) {
                j15 = j8;
                int i24 = o0VarE.l(j15) ? 32 : 16;
                i16 |= i24;
            } else {
                j15 = j8;
            }
            i16 |= i24;
        } else {
            j15 = j8;
        }
        if ((i14 & 384) == 0) {
            if ((i15 & 4) == 0) {
                jA = j14;
                int i25 = o0VarE.l(jA) ? 256 : 128;
                i16 |= i25;
            } else {
                jA = j14;
            }
            i16 |= i25;
        } else {
            jA = j14;
        }
        int i26 = i15 & 8;
        if (i26 == 0) {
            if ((i14 & 3072) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 2048 : 1024;
            }
            if ((i14 & 24576) == 0) {
                if ((i15 & 16) == 0) {
                    f16 = f14;
                    int i27 = o0VarE.i(f16) ? 16384 : 8192;
                    i16 |= i27;
                } else {
                    f16 = f14;
                }
                i16 |= i27;
            } else {
                f16 = f14;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                if ((196608 & i14) == 0) {
                    f17 = f15;
                    if (o0VarE.i(f17)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i16 |= i18;
                }
                i19 = 0;
                if ((74899 & i16) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        if ((i15 & 2) != 0) {
                            d92.b.f58623a.getClass();
                            j15 = d92.b.a(o0VarE).k().f63527d;
                            i16 &= -113;
                        }
                        if ((i15 & 4) != 0) {
                            jA = n5.a.a(o0VarE, R.color.red_40);
                            i16 &= -897;
                        }
                        if (i26 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if ((i15 & 16) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f18 = j92.b.f97899b.f97918c;
                            i16 &= -57345;
                        } else {
                            f18 = f16;
                        }
                        if (i17 != 0) {
                            f19 = 0;
                            g6.f.a aVar = g6.f.f75994b;
                            j16 = j15;
                        } else {
                            j16 = j15;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var = p3.n.f135158a;
                        h4.r rVarE = u1.n.e(rVar3, jA, k2.i.f102406a);
                        z15 = ((((57344 & i16) ^ 24576) <= 16384 && o0VarE.i(f18)) || (i16 & 24576) == 16384) | ((458752 & i16) == 131072);
                        objQ = o0VarE.q();
                        if (z15) {
                            objQ = new e(f18, f19, i19);
                            o0VarE.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new e(f18, f19, i19);
                                o0VarE.K(objQ);
                            }
                        }
                        h4.r rVarD = f5.g0.d(rVarE, (e23.q) objQ);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarE = d92.c.e(j92.f.f97935l);
                        d6.h.f57752b.getClass();
                        o0Var = o0VarE;
                        mh.c(str, rVarD, j16, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 1, 0, null, x0VarE, o0Var, (i16 & 14) | ((i16 << 3) & 896), 24576, 113656);
                        j15 = j16;
                    } else {
                        o0VarE.e();
                        if ((i15 & 2) != 0) {
                            i16 &= -113;
                        }
                        if ((i15 & 4) != 0) {
                            i16 &= -897;
                        }
                        if ((i15 & 16) != 0) {
                            i16 &= -57345;
                        }
                        j16 = j15;
                        rVar3 = rVar2;
                        f18 = f16;
                    }
                    f19 = f17;
                    o0VarE.h0();
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarE2 = u1.n.e(rVar3, jA, k2.i.f102406a);
                    z15 = ((((57344 & i16) ^ 24576) <= 16384 && o0VarE.i(f18)) || (i16 & 24576) == 16384) | ((458752 & i16) == 131072);
                    objQ = o0VarE.q();
                    if (z15) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e(f18, f19, i19);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new e(f18, f19, i19);
                        o0VarE.K(objQ);
                    }
                    h4.r rVarD2 = f5.g0.d(rVarE2, (e23.q) objQ);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarE2 = d92.c.e(j92.f.f97935l);
                    d6.h.f57752b.getClass();
                    o0Var = o0VarE;
                    mh.c(str, rVarD2, j16, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 1, 0, null, x0VarE2, o0Var, (i16 & 14) | ((i16 << 3) & 896), 24576, 113656);
                    j15 = j16;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar3 = rVar2;
                    f18 = f16;
                    f19 = f17;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: g02.f
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            g.a(str, j15, jA, rVar3, f18, f19, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i16 |= 196608;
            f17 = f15;
            i19 = 0;
            if ((74899 & i16) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if ((i15 & 2) != 0) {
                        d92.b.f58623a.getClass();
                        j15 = d92.b.a(o0VarE).k().f63527d;
                        i16 &= -113;
                    }
                    if ((i15 & 4) != 0) {
                        jA = n5.a.a(o0VarE, R.color.red_40);
                        i16 &= -897;
                    }
                    if (i26 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i15 & 16) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f18 = j92.b.f97899b.f97918c;
                        i16 &= -57345;
                    } else {
                        f18 = f16;
                    }
                    if (i17 != 0) {
                        f19 = 0;
                        g6.f.a aVar2 = g6.f.f75994b;
                        j16 = j15;
                    } else {
                        j16 = j15;
                        f19 = f17;
                    }
                } else {
                    if ((i15 & 2) != 0) {
                        d92.b.f58623a.getClass();
                        j15 = d92.b.a(o0VarE).k().f63527d;
                        i16 &= -113;
                    }
                    if ((i15 & 4) != 0) {
                        jA = n5.a.a(o0VarE, R.color.red_40);
                        i16 &= -897;
                    }
                    if (i26 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i15 & 16) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f18 = j92.b.f97899b.f97918c;
                        i16 &= -57345;
                    } else {
                        f18 = f16;
                    }
                    if (i17 != 0) {
                        f19 = 0;
                        g6.f.a aVar3 = g6.f.f75994b;
                        j16 = j15;
                    } else {
                        j16 = j15;
                        f19 = f17;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var3 = p3.n.f135158a;
                h4.r rVarE3 = u1.n.e(rVar3, jA, k2.i.f102406a);
                z15 = ((((57344 & i16) ^ 24576) <= 16384 && o0VarE.i(f18)) || (i16 & 24576) == 16384) | ((458752 & i16) == 131072);
                objQ = o0VarE.q();
                if (z15) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e(f18, f19, i19);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new e(f18, f19, i19);
                    o0VarE.K(objQ);
                }
                h4.r rVarD3 = f5.g0.d(rVarE3, (e23.q) objQ);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarE3 = d92.c.e(j92.f.f97935l);
                d6.h.f57752b.getClass();
                o0Var = o0VarE;
                mh.c(str, rVarD3, j16, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 1, 0, null, x0VarE3, o0Var, (i16 & 14) | ((i16 << 3) & 896), 24576, 113656);
                j15 = j16;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar3 = rVar2;
                f18 = f16;
                f19 = f17;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: g02.f
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        g.a(str, j15, jA, rVar3, f18, f19, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i16 |= 3072;
        rVar2 = rVar;
        if ((i14 & 24576) == 0) {
            if ((i15 & 16) == 0) {
                f16 = f14;
                if (o0VarE.i(f16)) {
                }
                i16 |= i27;
            } else {
                f16 = f14;
            }
            i16 |= i27;
        } else {
            f16 = f14;
        }
        i17 = i15 & 32;
        if (i17 != 0) {
            if ((196608 & i14) == 0) {
                f17 = f15;
                if (o0VarE.i(f17)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i16 |= i18;
            }
            i19 = 0;
            if ((74899 & i16) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if ((i15 & 2) != 0) {
                        d92.b.f58623a.getClass();
                        j15 = d92.b.a(o0VarE).k().f63527d;
                        i16 &= -113;
                    }
                    if ((i15 & 4) != 0) {
                        jA = n5.a.a(o0VarE, R.color.red_40);
                        i16 &= -897;
                    }
                    if (i26 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i15 & 16) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f18 = j92.b.f97899b.f97918c;
                        i16 &= -57345;
                    } else {
                        f18 = f16;
                    }
                    if (i17 != 0) {
                        f19 = 0;
                        g6.f.a aVar4 = g6.f.f75994b;
                        j16 = j15;
                    } else {
                        j16 = j15;
                        f19 = f17;
                    }
                } else {
                    if ((i15 & 2) != 0) {
                        d92.b.f58623a.getClass();
                        j15 = d92.b.a(o0VarE).k().f63527d;
                        i16 &= -113;
                    }
                    if ((i15 & 4) != 0) {
                        jA = n5.a.a(o0VarE, R.color.red_40);
                        i16 &= -897;
                    }
                    if (i26 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i15 & 16) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f18 = j92.b.f97899b.f97918c;
                        i16 &= -57345;
                    } else {
                        f18 = f16;
                    }
                    if (i17 != 0) {
                        f19 = 0;
                        g6.f.a aVar5 = g6.f.f75994b;
                        j16 = j15;
                    } else {
                        j16 = j15;
                        f19 = f17;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var4 = p3.n.f135158a;
                h4.r rVarE4 = u1.n.e(rVar3, jA, k2.i.f102406a);
                z15 = ((((57344 & i16) ^ 24576) <= 16384 && o0VarE.i(f18)) || (i16 & 24576) == 16384) | ((458752 & i16) == 131072);
                objQ = o0VarE.q();
                if (z15) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e(f18, f19, i19);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new e(f18, f19, i19);
                    o0VarE.K(objQ);
                }
                h4.r rVarD4 = f5.g0.d(rVarE4, (e23.q) objQ);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarE4 = d92.c.e(j92.f.f97935l);
                d6.h.f57752b.getClass();
                o0Var = o0VarE;
                mh.c(str, rVarD4, j16, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 1, 0, null, x0VarE4, o0Var, (i16 & 14) | ((i16 << 3) & 896), 24576, 113656);
                j15 = j16;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar3 = rVar2;
                f18 = f16;
                f19 = f17;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: g02.f
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        g.a(str, j15, jA, rVar3, f18, f19, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i16 |= 196608;
        f17 = f15;
        i19 = 0;
        if ((74899 & i16) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if ((i15 & 2) != 0) {
                    d92.b.f58623a.getClass();
                    j15 = d92.b.a(o0VarE).k().f63527d;
                    i16 &= -113;
                }
                if ((i15 & 4) != 0) {
                    jA = n5.a.a(o0VarE, R.color.red_40);
                    i16 &= -897;
                }
                if (i26 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if ((i15 & 16) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f18 = j92.b.f97899b.f97918c;
                    i16 &= -57345;
                } else {
                    f18 = f16;
                }
                if (i17 != 0) {
                    f19 = 0;
                    g6.f.a aVar6 = g6.f.f75994b;
                    j16 = j15;
                } else {
                    j16 = j15;
                    f19 = f17;
                }
            } else {
                if ((i15 & 2) != 0) {
                    d92.b.f58623a.getClass();
                    j15 = d92.b.a(o0VarE).k().f63527d;
                    i16 &= -113;
                }
                if ((i15 & 4) != 0) {
                    jA = n5.a.a(o0VarE, R.color.red_40);
                    i16 &= -897;
                }
                if (i26 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if ((i15 & 16) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f18 = j92.b.f97899b.f97918c;
                    i16 &= -57345;
                } else {
                    f18 = f16;
                }
                if (i17 != 0) {
                    f19 = 0;
                    g6.f.a aVar7 = g6.f.f75994b;
                    j16 = j15;
                } else {
                    j16 = j15;
                    f19 = f17;
                }
            }
            o0VarE.h0();
            p3.x1 x1Var5 = p3.n.f135158a;
            h4.r rVarE5 = u1.n.e(rVar3, jA, k2.i.f102406a);
            z15 = ((((57344 & i16) ^ 24576) <= 16384 && o0VarE.i(f18)) || (i16 & 24576) == 16384) | ((458752 & i16) == 131072);
            objQ = o0VarE.q();
            if (z15) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e(f18, f19, i19);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new e(f18, f19, i19);
                o0VarE.K(objQ);
            }
            h4.r rVarD5 = f5.g0.d(rVarE5, (e23.q) objQ);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarE5 = d92.c.e(j92.f.f97935l);
            d6.h.f57752b.getClass();
            o0Var = o0VarE;
            mh.c(str, rVarD5, j16, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 1, 0, null, x0VarE5, o0Var, (i16 & 14) | ((i16 << 3) & 896), 24576, 113656);
            j15 = j16;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar3 = rVar2;
            f18 = f16;
            f19 = f17;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: g02.f
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g.a(str, j15, jA, rVar3, f18, f19, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
