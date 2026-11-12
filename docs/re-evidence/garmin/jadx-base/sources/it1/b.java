package it1;

import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import cw1.v0;
import g02.u;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import h82.p;
import i3.mh;
import i53.c;
import ii0.h;
import j92.e;
import j92.f;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    public static final void a(c cVar, r rVar, e23.a aVar, m mVar, int i14) {
        c cVar2;
        int i15;
        cVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(749093521);
        if ((i14 & 6) == 0) {
            cVar2 = cVar;
            i15 = (o0VarE.r(cVar2) ? 4 : 2) | i14;
        } else {
            cVar2 = cVar;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new h(aVar, 19);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new h(aVar, 19);
                    o0VarE.K(objQ);
                }
            }
            r rVarD = w.d(rVar, false, null, null, (e23.a) objQ, 15);
            j jVar = j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            jVar.getClass();
            j.i iVarI = j.i(f14);
            d.f81522a.getClass();
            z zVarA = y.a(iVarI, d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarD, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar2 = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.activity_details_elevation);
            d92.b.f58624b.getClass();
            x0 x0VarA = x0.a(f.f97930g, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
            r.a aVar3 = r.S;
            bVar.getClass();
            mh.c(strQ, l.A(aVar3, eVar.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0VarE, 0, 0, 131068);
            bVar.getClass();
            o0VarE = o0VarE;
            b(cVar2, l.A(aVar3, eVar.f97918c, 0.0f, 2), false, false, aVar, o0VarE, (i15 & 14) | ((i15 << 6) & 57344), 12);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(cVar, rVar, aVar, i14, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x0115  */
    /* JADX WARN: Code duplicated, block: B:93:0x0122  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void b(c<? extends o20.a> cVar, r rVar, boolean z14, boolean z15, e23.a<Unit> aVar, m mVar, int i14, int i15) {
        int i16;
        r rVar2;
        int i17;
        boolean z16;
        int i18;
        int i19;
        boolean z17;
        int i24;
        int i25;
        e23.a<Unit> aVar2;
        int i26;
        boolean z18;
        r rVar3;
        boolean z19;
        boolean z24;
        e23.a<Unit> aVar3;
        p2 p2VarI0;
        boolean z25;
        boolean z26;
        boolean z27;
        Object objQ;
        cVar.getClass();
        o0 o0VarE = mVar.E(-389859492);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i27 = i15 & 2;
        if (i27 == 0) {
            if ((i14 & 48) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    z16 = z14;
                    if (o0VarE.h(z16)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 8;
                if (i19 != 0) {
                    if ((i14 & 3072) == 0) {
                        z17 = z15;
                        if (o0VarE.h(z17)) {
                            i24 = 2048;
                        } else {
                            i24 = 1024;
                        }
                        i16 |= i24;
                    }
                    i25 = i15 & 16;
                    if (i25 != 0) {
                        if ((i14 & 24576) == 0) {
                            aVar2 = aVar;
                            if (o0VarE.r(aVar2)) {
                                i26 = 16384;
                            } else {
                                i26 = 8192;
                            }
                            i16 |= i26;
                        }
                        if ((i16 & 9363) != 9362) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (o0VarE.n(i16 & 1, z18)) {
                            if (i27 != 0) {
                                rVar3 = r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i17 != 0) {
                                z19 = false;
                            } else {
                                z19 = z16;
                            }
                            if (i19 != 0) {
                                z24 = false;
                            } else {
                                z24 = z17;
                            }
                            if (i25 != 0) {
                                aVar2 = null;
                            }
                            x1 x1Var = n.f135158a;
                            boolean zR = o0VarE.r(cVar);
                            if ((i16 & 896) == 256) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            boolean z28 = z25 | zR;
                            if ((i16 & 7168) == 2048) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            z27 = z28 | z26 | ((i16 & 57344) == 16384);
                            objQ = o0VarE.q();
                            if (z27) {
                                objQ = new u(cVar, z19, z24, aVar2);
                                o0VarE.K(objQ);
                            } else {
                                m.f135153a.getClass();
                                if (objQ == m.a.f135155b) {
                                    objQ = new u(cVar, z19, z24, aVar2);
                                    o0VarE.K(objQ);
                                }
                            }
                            p002j6.c.b((e23.l) objQ, x2.h(x2.f(rVar3, 1.0f), gl.b.q(o0VarE, R.dimen.trail_preview_view_box_height)), null, o0VarE, 0, 4);
                        } else {
                            o0VarE.e();
                            rVar3 = rVar2;
                            z19 = z16;
                            z24 = z17;
                        }
                        aVar3 = aVar2;
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new v0(cVar, rVar3, z19, z24, aVar3, i14, i15, 5);
                        }
                    }
                    i16 |= 24576;
                    aVar2 = aVar;
                    if ((i16 & 9363) != 9362) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (o0VarE.n(i16 & 1, z18)) {
                        if (i27 != 0) {
                            rVar3 = r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i17 != 0) {
                            z19 = false;
                        } else {
                            z19 = z16;
                        }
                        if (i19 != 0) {
                            z24 = false;
                        } else {
                            z24 = z17;
                        }
                        if (i25 != 0) {
                            aVar2 = null;
                        }
                        x1 x1Var2 = n.f135158a;
                        boolean zR2 = o0VarE.r(cVar);
                        if ((i16 & 896) == 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z29 = z25 | zR2;
                        if ((i16 & 7168) == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z29 | z26 | ((i16 & 57344) == 16384);
                        objQ = o0VarE.q();
                        if (z27) {
                            m.f135153a.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new u(cVar, z19, z24, aVar2);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new u(cVar, z19, z24, aVar2);
                            o0VarE.K(objQ);
                        }
                        p002j6.c.b((e23.l) objQ, x2.h(x2.f(rVar3, 1.0f), gl.b.q(o0VarE, R.dimen.trail_preview_view_box_height)), null, o0VarE, 0, 4);
                    } else {
                        o0VarE.e();
                        rVar3 = rVar2;
                        z19 = z16;
                        z24 = z17;
                    }
                    aVar3 = aVar2;
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new v0(cVar, rVar3, z19, z24, aVar3, i14, i15, 5);
                    }
                }
                i16 |= 3072;
                z17 = z15;
                i25 = i15 & 16;
                if (i25 != 0) {
                    if ((i14 & 24576) == 0) {
                        aVar2 = aVar;
                        if (o0VarE.r(aVar2)) {
                            i26 = 16384;
                        } else {
                            i26 = 8192;
                        }
                        i16 |= i26;
                    }
                    if ((i16 & 9363) != 9362) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (o0VarE.n(i16 & 1, z18)) {
                        if (i27 != 0) {
                            rVar3 = r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i17 != 0) {
                            z19 = false;
                        } else {
                            z19 = z16;
                        }
                        if (i19 != 0) {
                            z24 = false;
                        } else {
                            z24 = z17;
                        }
                        if (i25 != 0) {
                            aVar2 = null;
                        }
                        x1 x1Var3 = n.f135158a;
                        boolean zR3 = o0VarE.r(cVar);
                        if ((i16 & 896) == 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z210 = z25 | zR3;
                        if ((i16 & 7168) == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z210 | z26 | ((i16 & 57344) == 16384);
                        objQ = o0VarE.q();
                        if (z27) {
                            m.f135153a.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new u(cVar, z19, z24, aVar2);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new u(cVar, z19, z24, aVar2);
                            o0VarE.K(objQ);
                        }
                        p002j6.c.b((e23.l) objQ, x2.h(x2.f(rVar3, 1.0f), gl.b.q(o0VarE, R.dimen.trail_preview_view_box_height)), null, o0VarE, 0, 4);
                    } else {
                        o0VarE.e();
                        rVar3 = rVar2;
                        z19 = z16;
                        z24 = z17;
                    }
                    aVar3 = aVar2;
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new v0(cVar, rVar3, z19, z24, aVar3, i14, i15, 5);
                    }
                }
                i16 |= 24576;
                aVar2 = aVar;
                if ((i16 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i16 & 1, z18)) {
                    if (i27 != 0) {
                        rVar3 = r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        z19 = false;
                    } else {
                        z19 = z16;
                    }
                    if (i19 != 0) {
                        z24 = false;
                    } else {
                        z24 = z17;
                    }
                    if (i25 != 0) {
                        aVar2 = null;
                    }
                    x1 x1Var4 = n.f135158a;
                    boolean zR4 = o0VarE.r(cVar);
                    if ((i16 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z211 = z25 | zR4;
                    if ((i16 & 7168) == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z211 | z26 | ((i16 & 57344) == 16384);
                    objQ = o0VarE.q();
                    if (z27) {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new u(cVar, z19, z24, aVar2);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new u(cVar, z19, z24, aVar2);
                        o0VarE.K(objQ);
                    }
                    p002j6.c.b((e23.l) objQ, x2.h(x2.f(rVar3, 1.0f), gl.b.q(o0VarE, R.dimen.trail_preview_view_box_height)), null, o0VarE, 0, 4);
                } else {
                    o0VarE.e();
                    rVar3 = rVar2;
                    z19 = z16;
                    z24 = z17;
                }
                aVar3 = aVar2;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new v0(cVar, rVar3, z19, z24, aVar3, i14, i15, 5);
                }
            }
            i16 |= 384;
            z16 = z14;
            i19 = i15 & 8;
            if (i19 != 0) {
                if ((i14 & 3072) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i24 = 2048;
                    } else {
                        i24 = 1024;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 16;
                if (i25 != 0) {
                    if ((i14 & 24576) == 0) {
                        aVar2 = aVar;
                        if (o0VarE.r(aVar2)) {
                            i26 = 16384;
                        } else {
                            i26 = 8192;
                        }
                        i16 |= i26;
                    }
                    if ((i16 & 9363) != 9362) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (o0VarE.n(i16 & 1, z18)) {
                        if (i27 != 0) {
                            rVar3 = r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i17 != 0) {
                            z19 = false;
                        } else {
                            z19 = z16;
                        }
                        if (i19 != 0) {
                            z24 = false;
                        } else {
                            z24 = z17;
                        }
                        if (i25 != 0) {
                            aVar2 = null;
                        }
                        x1 x1Var5 = n.f135158a;
                        boolean zR5 = o0VarE.r(cVar);
                        if ((i16 & 896) == 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z212 = z25 | zR5;
                        if ((i16 & 7168) == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z212 | z26 | ((i16 & 57344) == 16384);
                        objQ = o0VarE.q();
                        if (z27) {
                            m.f135153a.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new u(cVar, z19, z24, aVar2);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new u(cVar, z19, z24, aVar2);
                            o0VarE.K(objQ);
                        }
                        p002j6.c.b((e23.l) objQ, x2.h(x2.f(rVar3, 1.0f), gl.b.q(o0VarE, R.dimen.trail_preview_view_box_height)), null, o0VarE, 0, 4);
                    } else {
                        o0VarE.e();
                        rVar3 = rVar2;
                        z19 = z16;
                        z24 = z17;
                    }
                    aVar3 = aVar2;
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new v0(cVar, rVar3, z19, z24, aVar3, i14, i15, 5);
                    }
                }
                i16 |= 24576;
                aVar2 = aVar;
                if ((i16 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i16 & 1, z18)) {
                    if (i27 != 0) {
                        rVar3 = r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        z19 = false;
                    } else {
                        z19 = z16;
                    }
                    if (i19 != 0) {
                        z24 = false;
                    } else {
                        z24 = z17;
                    }
                    if (i25 != 0) {
                        aVar2 = null;
                    }
                    x1 x1Var6 = n.f135158a;
                    boolean zR6 = o0VarE.r(cVar);
                    if ((i16 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z213 = z25 | zR6;
                    if ((i16 & 7168) == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z213 | z26 | ((i16 & 57344) == 16384);
                    objQ = o0VarE.q();
                    if (z27) {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new u(cVar, z19, z24, aVar2);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new u(cVar, z19, z24, aVar2);
                        o0VarE.K(objQ);
                    }
                    p002j6.c.b((e23.l) objQ, x2.h(x2.f(rVar3, 1.0f), gl.b.q(o0VarE, R.dimen.trail_preview_view_box_height)), null, o0VarE, 0, 4);
                } else {
                    o0VarE.e();
                    rVar3 = rVar2;
                    z19 = z16;
                    z24 = z17;
                }
                aVar3 = aVar2;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new v0(cVar, rVar3, z19, z24, aVar3, i14, i15, 5);
                }
            }
            i16 |= 3072;
            z17 = z15;
            i25 = i15 & 16;
            if (i25 != 0) {
                if ((i14 & 24576) == 0) {
                    aVar2 = aVar;
                    if (o0VarE.r(aVar2)) {
                        i26 = 16384;
                    } else {
                        i26 = 8192;
                    }
                    i16 |= i26;
                }
                if ((i16 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i16 & 1, z18)) {
                    if (i27 != 0) {
                        rVar3 = r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        z19 = false;
                    } else {
                        z19 = z16;
                    }
                    if (i19 != 0) {
                        z24 = false;
                    } else {
                        z24 = z17;
                    }
                    if (i25 != 0) {
                        aVar2 = null;
                    }
                    x1 x1Var7 = n.f135158a;
                    boolean zR7 = o0VarE.r(cVar);
                    if ((i16 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z214 = z25 | zR7;
                    if ((i16 & 7168) == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z214 | z26 | ((i16 & 57344) == 16384);
                    objQ = o0VarE.q();
                    if (z27) {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new u(cVar, z19, z24, aVar2);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new u(cVar, z19, z24, aVar2);
                        o0VarE.K(objQ);
                    }
                    p002j6.c.b((e23.l) objQ, x2.h(x2.f(rVar3, 1.0f), gl.b.q(o0VarE, R.dimen.trail_preview_view_box_height)), null, o0VarE, 0, 4);
                } else {
                    o0VarE.e();
                    rVar3 = rVar2;
                    z19 = z16;
                    z24 = z17;
                }
                aVar3 = aVar2;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new v0(cVar, rVar3, z19, z24, aVar3, i14, i15, 5);
                }
            }
            i16 |= 24576;
            aVar2 = aVar;
            if ((i16 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i16 & 1, z18)) {
                if (i27 != 0) {
                    rVar3 = r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                if (i19 != 0) {
                    z24 = false;
                } else {
                    z24 = z17;
                }
                if (i25 != 0) {
                    aVar2 = null;
                }
                x1 x1Var8 = n.f135158a;
                boolean zR8 = o0VarE.r(cVar);
                if ((i16 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z215 = z25 | zR8;
                if ((i16 & 7168) == 2048) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z215 | z26 | ((i16 & 57344) == 16384);
                objQ = o0VarE.q();
                if (z27) {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new u(cVar, z19, z24, aVar2);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new u(cVar, z19, z24, aVar2);
                    o0VarE.K(objQ);
                }
                p002j6.c.b((e23.l) objQ, x2.h(x2.f(rVar3, 1.0f), gl.b.q(o0VarE, R.dimen.trail_preview_view_box_height)), null, o0VarE, 0, 4);
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                z19 = z16;
                z24 = z17;
            }
            aVar3 = aVar2;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v0(cVar, rVar3, z19, z24, aVar3, i14, i15, 5);
            }
        }
        i16 |= 48;
        rVar2 = rVar;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                z16 = z14;
                if (o0VarE.h(z16)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            i19 = i15 & 8;
            if (i19 != 0) {
                if ((i14 & 3072) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i24 = 2048;
                    } else {
                        i24 = 1024;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 16;
                if (i25 != 0) {
                    if ((i14 & 24576) == 0) {
                        aVar2 = aVar;
                        if (o0VarE.r(aVar2)) {
                            i26 = 16384;
                        } else {
                            i26 = 8192;
                        }
                        i16 |= i26;
                    }
                    if ((i16 & 9363) != 9362) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (o0VarE.n(i16 & 1, z18)) {
                        if (i27 != 0) {
                            rVar3 = r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i17 != 0) {
                            z19 = false;
                        } else {
                            z19 = z16;
                        }
                        if (i19 != 0) {
                            z24 = false;
                        } else {
                            z24 = z17;
                        }
                        if (i25 != 0) {
                            aVar2 = null;
                        }
                        x1 x1Var9 = n.f135158a;
                        boolean zR9 = o0VarE.r(cVar);
                        if ((i16 & 896) == 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z216 = z25 | zR9;
                        if ((i16 & 7168) == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z216 | z26 | ((i16 & 57344) == 16384);
                        objQ = o0VarE.q();
                        if (z27) {
                            m.f135153a.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new u(cVar, z19, z24, aVar2);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new u(cVar, z19, z24, aVar2);
                            o0VarE.K(objQ);
                        }
                        p002j6.c.b((e23.l) objQ, x2.h(x2.f(rVar3, 1.0f), gl.b.q(o0VarE, R.dimen.trail_preview_view_box_height)), null, o0VarE, 0, 4);
                    } else {
                        o0VarE.e();
                        rVar3 = rVar2;
                        z19 = z16;
                        z24 = z17;
                    }
                    aVar3 = aVar2;
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new v0(cVar, rVar3, z19, z24, aVar3, i14, i15, 5);
                    }
                }
                i16 |= 24576;
                aVar2 = aVar;
                if ((i16 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i16 & 1, z18)) {
                    if (i27 != 0) {
                        rVar3 = r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        z19 = false;
                    } else {
                        z19 = z16;
                    }
                    if (i19 != 0) {
                        z24 = false;
                    } else {
                        z24 = z17;
                    }
                    if (i25 != 0) {
                        aVar2 = null;
                    }
                    x1 x1Var10 = n.f135158a;
                    boolean zR10 = o0VarE.r(cVar);
                    if ((i16 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z217 = z25 | zR10;
                    if ((i16 & 7168) == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z217 | z26 | ((i16 & 57344) == 16384);
                    objQ = o0VarE.q();
                    if (z27) {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new u(cVar, z19, z24, aVar2);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new u(cVar, z19, z24, aVar2);
                        o0VarE.K(objQ);
                    }
                    p002j6.c.b((e23.l) objQ, x2.h(x2.f(rVar3, 1.0f), gl.b.q(o0VarE, R.dimen.trail_preview_view_box_height)), null, o0VarE, 0, 4);
                } else {
                    o0VarE.e();
                    rVar3 = rVar2;
                    z19 = z16;
                    z24 = z17;
                }
                aVar3 = aVar2;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new v0(cVar, rVar3, z19, z24, aVar3, i14, i15, 5);
                }
            }
            i16 |= 3072;
            z17 = z15;
            i25 = i15 & 16;
            if (i25 != 0) {
                if ((i14 & 24576) == 0) {
                    aVar2 = aVar;
                    if (o0VarE.r(aVar2)) {
                        i26 = 16384;
                    } else {
                        i26 = 8192;
                    }
                    i16 |= i26;
                }
                if ((i16 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i16 & 1, z18)) {
                    if (i27 != 0) {
                        rVar3 = r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        z19 = false;
                    } else {
                        z19 = z16;
                    }
                    if (i19 != 0) {
                        z24 = false;
                    } else {
                        z24 = z17;
                    }
                    if (i25 != 0) {
                        aVar2 = null;
                    }
                    x1 x1Var11 = n.f135158a;
                    boolean zR11 = o0VarE.r(cVar);
                    if ((i16 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z218 = z25 | zR11;
                    if ((i16 & 7168) == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z218 | z26 | ((i16 & 57344) == 16384);
                    objQ = o0VarE.q();
                    if (z27) {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new u(cVar, z19, z24, aVar2);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new u(cVar, z19, z24, aVar2);
                        o0VarE.K(objQ);
                    }
                    p002j6.c.b((e23.l) objQ, x2.h(x2.f(rVar3, 1.0f), gl.b.q(o0VarE, R.dimen.trail_preview_view_box_height)), null, o0VarE, 0, 4);
                } else {
                    o0VarE.e();
                    rVar3 = rVar2;
                    z19 = z16;
                    z24 = z17;
                }
                aVar3 = aVar2;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new v0(cVar, rVar3, z19, z24, aVar3, i14, i15, 5);
                }
            }
            i16 |= 24576;
            aVar2 = aVar;
            if ((i16 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i16 & 1, z18)) {
                if (i27 != 0) {
                    rVar3 = r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                if (i19 != 0) {
                    z24 = false;
                } else {
                    z24 = z17;
                }
                if (i25 != 0) {
                    aVar2 = null;
                }
                x1 x1Var12 = n.f135158a;
                boolean zR12 = o0VarE.r(cVar);
                if ((i16 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z219 = z25 | zR12;
                if ((i16 & 7168) == 2048) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z219 | z26 | ((i16 & 57344) == 16384);
                objQ = o0VarE.q();
                if (z27) {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new u(cVar, z19, z24, aVar2);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new u(cVar, z19, z24, aVar2);
                    o0VarE.K(objQ);
                }
                p002j6.c.b((e23.l) objQ, x2.h(x2.f(rVar3, 1.0f), gl.b.q(o0VarE, R.dimen.trail_preview_view_box_height)), null, o0VarE, 0, 4);
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                z19 = z16;
                z24 = z17;
            }
            aVar3 = aVar2;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v0(cVar, rVar3, z19, z24, aVar3, i14, i15, 5);
            }
        }
        i16 |= 384;
        z16 = z14;
        i19 = i15 & 8;
        if (i19 != 0) {
            if ((i14 & 3072) == 0) {
                z17 = z15;
                if (o0VarE.h(z17)) {
                    i24 = 2048;
                } else {
                    i24 = 1024;
                }
                i16 |= i24;
            }
            i25 = i15 & 16;
            if (i25 != 0) {
                if ((i14 & 24576) == 0) {
                    aVar2 = aVar;
                    if (o0VarE.r(aVar2)) {
                        i26 = 16384;
                    } else {
                        i26 = 8192;
                    }
                    i16 |= i26;
                }
                if ((i16 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i16 & 1, z18)) {
                    if (i27 != 0) {
                        rVar3 = r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        z19 = false;
                    } else {
                        z19 = z16;
                    }
                    if (i19 != 0) {
                        z24 = false;
                    } else {
                        z24 = z17;
                    }
                    if (i25 != 0) {
                        aVar2 = null;
                    }
                    x1 x1Var13 = n.f135158a;
                    boolean zR13 = o0VarE.r(cVar);
                    if ((i16 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z2110 = z25 | zR13;
                    if ((i16 & 7168) == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z2110 | z26 | ((i16 & 57344) == 16384);
                    objQ = o0VarE.q();
                    if (z27) {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new u(cVar, z19, z24, aVar2);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new u(cVar, z19, z24, aVar2);
                        o0VarE.K(objQ);
                    }
                    p002j6.c.b((e23.l) objQ, x2.h(x2.f(rVar3, 1.0f), gl.b.q(o0VarE, R.dimen.trail_preview_view_box_height)), null, o0VarE, 0, 4);
                } else {
                    o0VarE.e();
                    rVar3 = rVar2;
                    z19 = z16;
                    z24 = z17;
                }
                aVar3 = aVar2;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new v0(cVar, rVar3, z19, z24, aVar3, i14, i15, 5);
                }
            }
            i16 |= 24576;
            aVar2 = aVar;
            if ((i16 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i16 & 1, z18)) {
                if (i27 != 0) {
                    rVar3 = r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                if (i19 != 0) {
                    z24 = false;
                } else {
                    z24 = z17;
                }
                if (i25 != 0) {
                    aVar2 = null;
                }
                x1 x1Var14 = n.f135158a;
                boolean zR14 = o0VarE.r(cVar);
                if ((i16 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z2111 = z25 | zR14;
                if ((i16 & 7168) == 2048) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z2111 | z26 | ((i16 & 57344) == 16384);
                objQ = o0VarE.q();
                if (z27) {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new u(cVar, z19, z24, aVar2);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new u(cVar, z19, z24, aVar2);
                    o0VarE.K(objQ);
                }
                p002j6.c.b((e23.l) objQ, x2.h(x2.f(rVar3, 1.0f), gl.b.q(o0VarE, R.dimen.trail_preview_view_box_height)), null, o0VarE, 0, 4);
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                z19 = z16;
                z24 = z17;
            }
            aVar3 = aVar2;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v0(cVar, rVar3, z19, z24, aVar3, i14, i15, 5);
            }
        }
        i16 |= 3072;
        z17 = z15;
        i25 = i15 & 16;
        if (i25 != 0) {
            if ((i14 & 24576) == 0) {
                aVar2 = aVar;
                if (o0VarE.r(aVar2)) {
                    i26 = 16384;
                } else {
                    i26 = 8192;
                }
                i16 |= i26;
            }
            if ((i16 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i16 & 1, z18)) {
                if (i27 != 0) {
                    rVar3 = r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                if (i19 != 0) {
                    z24 = false;
                } else {
                    z24 = z17;
                }
                if (i25 != 0) {
                    aVar2 = null;
                }
                x1 x1Var15 = n.f135158a;
                boolean zR15 = o0VarE.r(cVar);
                if ((i16 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z2112 = z25 | zR15;
                if ((i16 & 7168) == 2048) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z2112 | z26 | ((i16 & 57344) == 16384);
                objQ = o0VarE.q();
                if (z27) {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new u(cVar, z19, z24, aVar2);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new u(cVar, z19, z24, aVar2);
                    o0VarE.K(objQ);
                }
                p002j6.c.b((e23.l) objQ, x2.h(x2.f(rVar3, 1.0f), gl.b.q(o0VarE, R.dimen.trail_preview_view_box_height)), null, o0VarE, 0, 4);
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                z19 = z16;
                z24 = z17;
            }
            aVar3 = aVar2;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v0(cVar, rVar3, z19, z24, aVar3, i14, i15, 5);
            }
        }
        i16 |= 24576;
        aVar2 = aVar;
        if ((i16 & 9363) != 9362) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (o0VarE.n(i16 & 1, z18)) {
            if (i27 != 0) {
                rVar3 = r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i17 != 0) {
                z19 = false;
            } else {
                z19 = z16;
            }
            if (i19 != 0) {
                z24 = false;
            } else {
                z24 = z17;
            }
            if (i25 != 0) {
                aVar2 = null;
            }
            x1 x1Var16 = n.f135158a;
            boolean zR16 = o0VarE.r(cVar);
            if ((i16 & 896) == 256) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z2113 = z25 | zR16;
            if ((i16 & 7168) == 2048) {
                z26 = true;
            } else {
                z26 = false;
            }
            z27 = z2113 | z26 | ((i16 & 57344) == 16384);
            objQ = o0VarE.q();
            if (z27) {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new u(cVar, z19, z24, aVar2);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new u(cVar, z19, z24, aVar2);
                o0VarE.K(objQ);
            }
            p002j6.c.b((e23.l) objQ, x2.h(x2.f(rVar3, 1.0f), gl.b.q(o0VarE, R.dimen.trail_preview_view_box_height)), null, o0VarE, 0, 4);
        } else {
            o0VarE.e();
            rVar3 = rVar2;
            z19 = z16;
            z24 = z17;
        }
        aVar3 = aVar2;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v0(cVar, rVar3, z19, z24, aVar3, i14, i15, 5);
        }
    }
}
