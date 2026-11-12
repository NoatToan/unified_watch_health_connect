package u82;

import a42.a0;
import b82.f1;
import c2.q;
import c2.t;
import c2.u;
import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import l72.v2;
import m3.l;
import m3.s;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import sg0.j;
import sk0.k1;
import u1.a2;
import u1.d2;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:73:0x0104  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0158  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0163  */
    /* JADX WARN: Code duplicated, block: B:86:0x0184  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @o13.e
    public static final <KeyType, ValueType> void a(KeyType keytype, d dVar, r rVar, d2 d2Var, e23.r<? super t, ? super f<ValueType>, ? super m, ? super Integer, Unit> rVar2, m mVar, int i14, int i15) {
        int i16;
        r rVar3;
        boolean z14;
        r rVar4;
        p2 p2VarI0;
        r rVar5;
        int i17;
        int i18;
        p1 p1VarC;
        boolean zB;
        Object objQ;
        m.a aVar;
        p1 p1Var;
        s sVarE;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objQ2;
        int i19;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar2;
        g.a.b bVar;
        int i24;
        int i25;
        dVar.getClass();
        rVar2.getClass();
        o0 o0VarE = mVar.E(-239222479);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(keytype) : o0VarE.r(keytype) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(dVar) ? 32 : 16;
        }
        int i26 = i15 & 4;
        if (i26 == 0) {
            if ((i14 & 384) == 0) {
                rVar3 = rVar;
                i16 |= o0VarE.B(rVar3) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.B(d2Var)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i16 |= i25;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.r(rVar2)) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i16 |= i24;
            }
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i26 != 0) {
                    rVar5 = r.S;
                } else {
                    rVar5 = rVar3;
                }
                x1 x1Var = n.f135158a;
                int i27 = i16 & 8;
                i17 = i16 & 14;
                i18 = i16 & 112;
                p1VarC = dVar.c(keytype, o0VarE);
                zB = o0VarE.B((f) p1VarC.getF182175a());
                objQ = o0VarE.q();
                aVar = m.f135153a;
                if (zB) {
                    objQ = hb.a.n(((f) p1VarC.getF182175a()) instanceof f.b, o0VarE);
                } else {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = hb.a.n(((f) p1VarC.getF182175a()) instanceof f.b, o0VarE);
                    }
                }
                p1Var = (p1) objQ;
                sVarE = l.e(o0VarE);
                r rVarThen = x2.d(r.S, 1.0f).then(rVar5);
                boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                boolean zB2 = o0VarE.B(p1Var);
                if (i18 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z18 = zB2 | z15;
                if (i17 != 4 || (i27 != 0 && o0VarE.r(keytype))) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z18 | z16;
                objQ2 = o0VarE.q();
                if (z17) {
                    objQ2 = new j(dVar, 27, keytype, p1Var);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new j(dVar, 27, keytype, p1Var);
                        o0VarE.K(objQ2);
                    }
                }
                i19 = i16 >> 6;
                r rVarB = v2.b(l.d(rVarThen, zBooleanValue, sVarE, false, (e23.a) objQ2, 12), d2Var, new u72.a(2), o0VarE, i19 & 112);
                h4.d.f81522a.getClass();
                z0VarD = q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarB, o0VarE);
                g.V.getClass();
                aVar2 = g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(g.a.f81810g, z0VarD, o0VarE);
                b4.c(g.a.f81809f, i2VarA0, o0VarE);
                bVar = g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(g.a.f81807d, rVarC, o0VarE);
                u uVar = u.f22885a;
                rVar2.invoke(uVar, (f) p1VarC.getF182175a(), o0VarE, Integer.valueOf(6 | (i19 & 896)));
                f1.a(uVar, ((Boolean) p1Var.getF182175a()).booleanValue(), sVarE, o0VarE, 6);
                o0VarE.g0(true);
                rVar4 = rVar5;
            } else {
                o0VarE.e();
                rVar4 = rVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a0((Object) keytype, (Object) dVar, rVar4, (Object) d2Var, (Object) rVar2, i14, i15, 27);
            }
        }
        i16 |= 384;
        rVar3 = rVar;
        if ((i14 & 3072) == 0) {
            if (o0VarE.B(d2Var)) {
                i25 = 2048;
            } else {
                i25 = 1024;
            }
            i16 |= i25;
        }
        if ((i14 & 24576) == 0) {
            if (o0VarE.r(rVar2)) {
                i24 = 16384;
            } else {
                i24 = 8192;
            }
            i16 |= i24;
        }
        if ((i16 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i26 != 0) {
                rVar5 = r.S;
            } else {
                rVar5 = rVar3;
            }
            x1 x1Var2 = n.f135158a;
            int i28 = i16 & 8;
            i17 = i16 & 14;
            i18 = i16 & 112;
            p1VarC = dVar.c(keytype, o0VarE);
            zB = o0VarE.B((f) p1VarC.getF182175a());
            objQ = o0VarE.q();
            aVar = m.f135153a;
            if (zB) {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = hb.a.n(((f) p1VarC.getF182175a()) instanceof f.b, o0VarE);
                }
            } else {
                objQ = hb.a.n(((f) p1VarC.getF182175a()) instanceof f.b, o0VarE);
            }
            p1Var = (p1) objQ;
            sVarE = l.e(o0VarE);
            r rVarThen2 = x2.d(r.S, 1.0f).then(rVar5);
            boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
            boolean zB3 = o0VarE.B(p1Var);
            if (i18 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z19 = zB3 | z15;
            if (i17 != 4) {
                z16 = true;
            } else {
                z16 = true;
            }
            z17 = z19 | z16;
            objQ2 = o0VarE.q();
            if (z17) {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new j(dVar, 27, keytype, p1Var);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new j(dVar, 27, keytype, p1Var);
                o0VarE.K(objQ2);
            }
            i19 = i16 >> 6;
            r rVarB2 = v2.b(l.d(rVarThen2, zBooleanValue2, sVarE, false, (e23.a) objQ2, 12), d2Var, new u72.a(2), o0VarE, i19 & 112);
            h4.d.f81522a.getClass();
            z0VarD = q.d(h4.d.a.f81524b, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarB2, o0VarE);
            g.V.getClass();
            aVar2 = g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, z0VarD, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            bVar = g.a.f81813j;
            if (o0VarE.T) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u uVar2 = u.f22885a;
            rVar2.invoke(uVar2, (f) p1VarC.getF182175a(), o0VarE, Integer.valueOf(6 | (i19 & 896)));
            f1.a(uVar2, ((Boolean) p1Var.getF182175a()).booleanValue(), sVarE, o0VarE, 6);
            o0VarE.g0(true);
            rVar4 = rVar5;
        } else {
            o0VarE.e();
            rVar4 = rVar3;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0((Object) keytype, (Object) dVar, rVar4, (Object) d2Var, (Object) rVar2, i14, i15, 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    @o13.e
    public static final <KeyType, ValueType> void b(KeyType keytype, d dVar, r rVar, boolean z14, e23.r<? super t, ? super f<ValueType>, ? super m, ? super Integer, Unit> rVar2, m mVar, int i14, int i15) {
        int i16;
        r rVar3;
        int i17;
        boolean z15;
        int i18;
        e23.r<? super t, ? super f<ValueType>, ? super m, ? super Integer, Unit> rVar4;
        boolean z16;
        r rVar5;
        boolean z17;
        p2 p2VarI0;
        r rVar6;
        boolean z18;
        d2 d2VarA;
        int i19;
        dVar.getClass();
        rVar2.getClass();
        o0 o0VarE = mVar.E(1288487701);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(keytype) : o0VarE.r(keytype) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(dVar) ? 32 : 16;
        }
        int i24 = i15 & 4;
        if (i24 == 0) {
            if ((i14 & 384) == 0) {
                rVar3 = rVar;
                i16 |= o0VarE.B(rVar3) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                if ((i14 & 24576) == 0) {
                    rVar4 = rVar2;
                    if (o0VarE.r(rVar4)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i16 |= i19;
                } else {
                    rVar4 = rVar2;
                }
                if ((i16 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i24 != 0) {
                        rVar6 = r.S;
                    } else {
                        rVar6 = rVar3;
                    }
                    z18 = i17 == 0 ? z15 : true;
                    x1 x1Var = n.f135158a;
                    if (z18) {
                        o0VarE.C(1286113354);
                        d2VarA = a2.a(o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1214834568);
                        o0VarE.g0(false);
                        d2VarA = null;
                    }
                    a(keytype, dVar, rVar6, d2VarA, rVar4, o0VarE, i16 & 58366, 0);
                    rVar5 = rVar6;
                    z17 = z18;
                } else {
                    o0VarE.e();
                    rVar5 = rVar3;
                    z17 = z15;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a82.a(keytype, dVar, rVar5, z17, rVar2, i14, i15, 16);
                }
            }
            i16 |= 3072;
            z15 = z14;
            if ((i14 & 24576) == 0) {
                rVar4 = rVar2;
                if (o0VarE.r(rVar4)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i16 |= i19;
            } else {
                rVar4 = rVar2;
            }
            if ((i16 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i24 != 0) {
                    rVar6 = r.S;
                } else {
                    rVar6 = rVar3;
                }
                if (i17 == 0) {
                }
                x1 x1Var2 = n.f135158a;
                if (z18) {
                    o0VarE.C(1286113354);
                    d2VarA = a2.a(o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1214834568);
                    o0VarE.g0(false);
                    d2VarA = null;
                }
                a(keytype, dVar, rVar6, d2VarA, rVar4, o0VarE, i16 & 58366, 0);
                rVar5 = rVar6;
                z17 = z18;
            } else {
                o0VarE.e();
                rVar5 = rVar3;
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a82.a(keytype, dVar, rVar5, z17, rVar2, i14, i15, 16);
            }
        }
        i16 |= 384;
        rVar3 = rVar;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            if ((i14 & 24576) == 0) {
                rVar4 = rVar2;
                if (o0VarE.r(rVar4)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i16 |= i19;
            } else {
                rVar4 = rVar2;
            }
            if ((i16 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i24 != 0) {
                    rVar6 = r.S;
                } else {
                    rVar6 = rVar3;
                }
                if (i17 == 0) {
                }
                x1 x1Var3 = n.f135158a;
                if (z18) {
                    o0VarE.C(1286113354);
                    d2VarA = a2.a(o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1214834568);
                    o0VarE.g0(false);
                    d2VarA = null;
                }
                a(keytype, dVar, rVar6, d2VarA, rVar4, o0VarE, i16 & 58366, 0);
                rVar5 = rVar6;
                z17 = z18;
            } else {
                o0VarE.e();
                rVar5 = rVar3;
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a82.a(keytype, dVar, rVar5, z17, rVar2, i14, i15, 16);
            }
        }
        i16 |= 3072;
        z15 = z14;
        if ((i14 & 24576) == 0) {
            rVar4 = rVar2;
            if (o0VarE.r(rVar4)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i16 |= i19;
        } else {
            rVar4 = rVar2;
        }
        if ((i16 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i24 != 0) {
                rVar6 = r.S;
            } else {
                rVar6 = rVar3;
            }
            if (i17 == 0) {
            }
            x1 x1Var4 = n.f135158a;
            if (z18) {
                o0VarE.C(1286113354);
                d2VarA = a2.a(o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1214834568);
                o0VarE.g0(false);
                d2VarA = null;
            }
            a(keytype, dVar, rVar6, d2VarA, rVar4, o0VarE, i16 & 58366, 0);
            rVar5 = rVar6;
            z17 = z18;
        } else {
            o0VarE.e();
            rVar5 = rVar3;
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.a(keytype, dVar, rVar5, z17, rVar2, i14, i15, 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(v82.a aVar, r rVar, d2 d2Var, z3.e eVar, m mVar, int i14) {
        e23.r rVar2;
        r rVar3;
        d2 d2Var2;
        r rVar4;
        d2 d2VarA;
        int i15;
        aVar.getClass();
        o0 o0VarE = mVar.E(-20078706);
        int i16 = i14 | (o0VarE.B(aVar) ? 4 : 2) | SyslogConstants.LOG_LOCAL6;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar4 = r.S;
                d2VarA = a2.a(o0VarE);
                i15 = i16 & (-897);
            } else {
                o0VarE.e();
                i15 = i16 & (-897);
                rVar4 = rVar;
                d2VarA = d2Var;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(aVar.getF189560e(), o0VarE);
            boolean z14 = ((w82.a) p1VarC.getF182175a()).f183555d;
            s sVarE = l.e(o0VarE);
            r rVarD = x2.d(rVar4, 1.0f);
            boolean z15 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new ty1.f1(aVar, 8);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ty1.f1(aVar, 8);
                    o0VarE.K(objQ);
                }
            }
            r rVarB = v2.b(l.d(rVarD, z14, sVarE, false, (e23.a) objQ, 12), d2VarA, new u72.a(1), o0VarE, 0);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarB, o0VarE);
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
            b4.c(g.a.f81810g, z0VarD, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            w82.a aVar3 = (w82.a) p1VarC.getF182175a();
            rVar2 = eVar;
            rVar2.invoke(uVar, aVar3, o0VarE, 390);
            f1.a(uVar, z14, sVarE, o0VarE, 6);
            o0VarE.g0(true);
            rVar3 = rVar4;
            d2Var2 = d2VarA;
        } else {
            rVar2 = eVar;
            o0VarE.e();
            rVar3 = rVar;
            d2Var2 = d2Var;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k1(aVar, rVar3, d2Var2, rVar2, i14, 16);
        }
    }
}
