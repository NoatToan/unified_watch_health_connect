package y01;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import ds.e0;
import kotlin.m3;
import kotlin.t1;
import o4.d0;
import o53.b0;
import p3.l0;
import p3.n2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import s5.w0;
import z2.t2;
import z2.u2;

/* JADX INFO: loaded from: classes9.dex */
public final class w {
    /* JADX WARN: Code duplicated, block: B:100:0x0131  */
    /* JADX WARN: Code duplicated, block: B:101:0x0136  */
    /* JADX WARN: Code duplicated, block: B:104:0x0142  */
    /* JADX WARN: Code duplicated, block: B:105:0x0144  */
    /* JADX WARN: Code duplicated, block: B:108:0x0155  */
    /* JADX WARN: Code duplicated, block: B:111:0x0167  */
    /* JADX WARN: Code duplicated, block: B:114:0x0184  */
    /* JADX WARN: Code duplicated, block: B:117:0x019c  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:128:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:129:0x020e  */
    /* JADX WARN: Code duplicated, block: B:132:0x021d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0238  */
    /* JADX WARN: Code duplicated, block: B:136:0x0268  */
    /* JADX WARN: Code duplicated, block: B:137:0x026b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0273 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x0275  */
    /* JADX WARN: Code duplicated, block: B:143:0x02be  */
    /* JADX WARN: Code duplicated, block: B:146:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0118  */
    /* JADX WARN: Code duplicated, block: B:96:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0124  */
    /* JADX WARN: Code duplicated, block: B:98:0x012b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, String str, String str2, String str3, Integer num, boolean z14, e23.l lVar, e23.l lVar2, int i14, int i15, e23.p pVar, p3.m mVar, int i16, int i17, int i18) {
        h4.r rVar2;
        int i19;
        String str4;
        Integer num2;
        boolean z15;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z16;
        String str5;
        o0 o0Var;
        e23.p pVar2;
        String str6;
        int i28;
        p2 p2VarI0;
        h4.r rVar3;
        String str7;
        e23.p pVar3;
        Object objQ;
        p3.m.a.C2565a c2565a;
        Object objQ2;
        Object objQ3;
        Object objQ4;
        p1 p1Var;
        float f14;
        int i29;
        Object objQ5;
        int i30;
        p1 p1Var2;
        Object objQ6;
        boolean z17;
        Object objQ7;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        str.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(608694467);
        int i39 = i18 & 1;
        if (i39 != 0) {
            i19 = i16 | 6;
            rVar2 = rVar;
        } else if ((i16 & 6) == 0) {
            rVar2 = rVar;
            i19 = (o0VarE.B(rVar2) ? 4 : 2) | i16;
        } else {
            rVar2 = rVar;
            i19 = i16;
        }
        if ((i16 & 48) == 0) {
            i19 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i19 |= o0VarE.B(str2) ? 256 : 128;
        }
        int i44 = i18 & 8;
        if (i44 == 0) {
            if ((i16 & 3072) == 0) {
                str4 = str3;
                i19 |= o0VarE.B(str4) ? 2048 : 1024;
            }
            if ((i16 & 24576) == 0) {
                num2 = num;
                if (o0VarE.B(num2)) {
                    i38 = 16384;
                } else {
                    i38 = 8192;
                }
                i19 |= i38;
            } else {
                num2 = num;
            }
            if ((196608 & i16) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i37 = 131072;
                } else {
                    i37 = 65536;
                }
                i19 |= i37;
            } else {
                z15 = z14;
            }
            if ((1572864 & i16) != 0) {
                if (o0VarE.r(lVar)) {
                    i36 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i36 = 524288;
                }
                i19 |= i36;
            }
            if ((i16 & 12582912) == 0) {
                if (o0VarE.r(lVar2)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i19 |= i35;
            }
            i24 = i19 | 100663296;
            if ((i16 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.k(i14)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i24 |= i34;
            }
            i25 = i17 | 6;
            i26 = i18 & 2048;
            if (i26 != 0) {
                if ((i17 & 48) == 0) {
                    if (o0VarE.r(pVar)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i25 |= i27;
                }
                if ((i24 & 306783379) == 306783378 || (i25 & 19) != 18) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i24 & 1, z16)) {
                    if (i39 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i44 != 0) {
                        str7 = "";
                    } else {
                        str7 = str4;
                    }
                    x5.p.f188918b.getClass();
                    int i45 = x5.p.f188926j;
                    if (i26 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    x1 x1Var = p3.n.f135158a;
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new i2.c();
                        o0VarE.K(objQ);
                    }
                    i2.a aVar = (i2.a) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = l0.j(t13.h.f161748a, o0VarE);
                        o0VarE.K(objQ2);
                    }
                    b0 b0Var = (b0) objQ2;
                    m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = kg.f.j(o0VarE);
                    }
                    m4.b0 b0Var2 = (m4.b0) objQ3;
                    m3 m3Var = (m3) o0VarE.A(t1.f91499q);
                    objQ4 = o0VarE.q();
                    if (objQ4 == c2565a) {
                        objQ4 = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ4);
                    }
                    p1Var = (p1) objQ4;
                    if (((Boolean) p1Var.getF182175a()).booleanValue() && str2.length() == 0 && str7.length() == 0) {
                        f14 = 0.0f;
                    } else {
                        f14 = -1.0f;
                    }
                    i29 = i24;
                    x3 x3VarB = s1.f.b(f14, s1.l.d(300, 0, null, 6), "", o0VarE, 3120, 20);
                    objQ5 = o0VarE.q();
                    if (objQ5 == c2565a) {
                        int length = str2.length();
                        o0Var = o0VarE;
                        str5 = str2;
                        i30 = i29;
                        objQ5 = p0.n(new x5.l0(str5, og.a.l(length, length), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
                        o0Var.K(objQ5);
                    } else {
                        o0Var = o0VarE;
                        str5 = str2;
                        i30 = i29;
                    }
                    p1Var2 = (p1) objQ5;
                    objQ6 = o0Var.q();
                    if (objQ6 == r1) {
                        int length2 = str7.length();
                        objQ6 = new x5.l0(str7, og.a.l(length2, length2), (w0) null, 4, (p005kotlin.jvm.internal.j) null);
                        o0Var.K(objQ6);
                    }
                    x5.l0 l0Var = (x5.l0) objQ6;
                    t2 t2Var = new t2(e0.d(d92.b.f58623a, o0Var), d0.c(0.4f, d92.b.a(o0Var).k().b(), 14), null);
                    if ((i30 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objQ7 = o0Var.q();
                    if (z17 || objQ7 == c2565a) {
                        objQ7 = new b82.b0(6, str5, p1Var2);
                        o0Var.K(objQ7);
                    }
                    l0.a(str5, (e23.l) objQ7, o0Var);
                    n2 n2VarC = u2.f201804a.c(t2Var);
                    e23.p pVar4 = pVar3;
                    p3.v.a(n2VarC, z3.f.c(2055885827, new iv0.u(rVar3, m3Var, pVar4, b0Var2, p1Var, z15, x3VarB, str, b0Var, aVar, p1Var2, l0Var, i14, i45, qVar, num2, lVar2, lVar), o0Var), o0Var, 56);
                    str6 = str7;
                    rVar2 = rVar3;
                    pVar2 = pVar4;
                    i28 = i45;
                } else {
                    str5 = str2;
                    o0Var = o0VarE;
                    o0Var.e();
                    pVar2 = pVar;
                    str6 = str4;
                    i28 = i15;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new t(rVar2, str, str5, str6, num, z14, lVar, lVar2, i14, i28, pVar2, i16, i17, i18);
                }
            }
            i25 = 54;
            if ((i24 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i24 & 1, z16)) {
                if (i39 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i44 != 0) {
                    str7 = "";
                } else {
                    str7 = str4;
                }
                x5.p.f188918b.getClass();
                int i46 = x5.p.f188926j;
                if (i26 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                x1 x1Var2 = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new i2.c();
                    o0VarE.K(objQ);
                }
                i2.a aVar2 = (i2.a) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ2);
                }
                b0 b0Var3 = (b0) objQ2;
                m4.q qVar2 = (m4.q) o0VarE.A(t1.f91491i);
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = kg.f.j(o0VarE);
                }
                m4.b0 b0Var4 = (m4.b0) objQ3;
                m3 m3Var2 = (m3) o0VarE.A(t1.f91499q);
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ4);
                }
                p1Var = (p1) objQ4;
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    f14 = -1.0f;
                } else {
                    f14 = -1.0f;
                }
                i29 = i24;
                x3 x3VarB2 = s1.f.b(f14, s1.l.d(300, 0, null, 6), "", o0VarE, 3120, 20);
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    int length3 = str2.length();
                    o0Var = o0VarE;
                    str5 = str2;
                    i30 = i29;
                    objQ5 = p0.n(new x5.l0(str5, og.a.l(length3, length3), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
                    o0Var.K(objQ5);
                } else {
                    o0Var = o0VarE;
                    str5 = str2;
                    i30 = i29;
                }
                p1Var2 = (p1) objQ5;
                objQ6 = o0Var.q();
                if (objQ6 == r1) {
                    int length4 = str7.length();
                    objQ6 = new x5.l0(str7, og.a.l(length4, length4), (w0) null, 4, (p005kotlin.jvm.internal.j) null);
                    o0Var.K(objQ6);
                }
                x5.l0 l0Var2 = (x5.l0) objQ6;
                t2 t2Var2 = new t2(e0.d(d92.b.f58623a, o0Var), d0.c(0.4f, d92.b.a(o0Var).k().b(), 14), null);
                if ((i30 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objQ7 = o0Var.q();
                if (z17) {
                    objQ7 = new b82.b0(6, str5, p1Var2);
                    o0Var.K(objQ7);
                } else {
                    objQ7 = new b82.b0(6, str5, p1Var2);
                    o0Var.K(objQ7);
                }
                l0.a(str5, (e23.l) objQ7, o0Var);
                n2 n2VarC2 = u2.f201804a.c(t2Var2);
                e23.p pVar5 = pVar3;
                p3.v.a(n2VarC2, z3.f.c(2055885827, new iv0.u(rVar3, m3Var2, pVar5, b0Var4, p1Var, z15, x3VarB2, str, b0Var3, aVar2, p1Var2, l0Var2, i14, i46, qVar2, num2, lVar2, lVar), o0Var), o0Var, 56);
                str6 = str7;
                rVar2 = rVar3;
                pVar2 = pVar5;
                i28 = i46;
            } else {
                str5 = str2;
                o0Var = o0VarE;
                o0Var.e();
                pVar2 = pVar;
                str6 = str4;
                i28 = i15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new t(rVar2, str, str5, str6, num, z14, lVar, lVar2, i14, i28, pVar2, i16, i17, i18);
            }
        }
        i19 |= 3072;
        str4 = str3;
        if ((i16 & 24576) == 0) {
            num2 = num;
            if (o0VarE.B(num2)) {
                i38 = 16384;
            } else {
                i38 = 8192;
            }
            i19 |= i38;
        } else {
            num2 = num;
        }
        if ((196608 & i16) == 0) {
            z15 = z14;
            if (o0VarE.h(z15)) {
                i37 = 131072;
            } else {
                i37 = 65536;
            }
            i19 |= i37;
        } else {
            z15 = z14;
        }
        if ((1572864 & i16) != 0) {
            if (o0VarE.r(lVar)) {
                i36 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i36 = 524288;
            }
            i19 |= i36;
        }
        if ((i16 & 12582912) == 0) {
            if (o0VarE.r(lVar2)) {
                i35 = 8388608;
            } else {
                i35 = 4194304;
            }
            i19 |= i35;
        }
        i24 = i19 | 100663296;
        if ((i16 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.k(i14)) {
                i34 = 536870912;
            } else {
                i34 = 268435456;
            }
            i24 |= i34;
        }
        i25 = i17 | 6;
        i26 = i18 & 2048;
        if (i26 != 0) {
            if ((i17 & 48) == 0) {
                if (o0VarE.r(pVar)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i25 |= i27;
            }
            if ((i24 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i24 & 1, z16)) {
                if (i39 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i44 != 0) {
                    str7 = "";
                } else {
                    str7 = str4;
                }
                x5.p.f188918b.getClass();
                int i47 = x5.p.f188926j;
                if (i26 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                x1 x1Var3 = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new i2.c();
                    o0VarE.K(objQ);
                }
                i2.a aVar3 = (i2.a) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ2);
                }
                b0 b0Var5 = (b0) objQ2;
                m4.q qVar3 = (m4.q) o0VarE.A(t1.f91491i);
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = kg.f.j(o0VarE);
                }
                m4.b0 b0Var6 = (m4.b0) objQ3;
                m3 m3Var3 = (m3) o0VarE.A(t1.f91499q);
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ4);
                }
                p1Var = (p1) objQ4;
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    f14 = -1.0f;
                } else {
                    f14 = -1.0f;
                }
                i29 = i24;
                x3 x3VarB3 = s1.f.b(f14, s1.l.d(300, 0, null, 6), "", o0VarE, 3120, 20);
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    int length5 = str2.length();
                    o0Var = o0VarE;
                    str5 = str2;
                    i30 = i29;
                    objQ5 = p0.n(new x5.l0(str5, og.a.l(length5, length5), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
                    o0Var.K(objQ5);
                } else {
                    o0Var = o0VarE;
                    str5 = str2;
                    i30 = i29;
                }
                p1Var2 = (p1) objQ5;
                objQ6 = o0Var.q();
                if (objQ6 == r1) {
                    int length6 = str7.length();
                    objQ6 = new x5.l0(str7, og.a.l(length6, length6), (w0) null, 4, (p005kotlin.jvm.internal.j) null);
                    o0Var.K(objQ6);
                }
                x5.l0 l0Var3 = (x5.l0) objQ6;
                t2 t2Var3 = new t2(e0.d(d92.b.f58623a, o0Var), d0.c(0.4f, d92.b.a(o0Var).k().b(), 14), null);
                if ((i30 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objQ7 = o0Var.q();
                if (z17) {
                    objQ7 = new b82.b0(6, str5, p1Var2);
                    o0Var.K(objQ7);
                } else {
                    objQ7 = new b82.b0(6, str5, p1Var2);
                    o0Var.K(objQ7);
                }
                l0.a(str5, (e23.l) objQ7, o0Var);
                n2 n2VarC3 = u2.f201804a.c(t2Var3);
                e23.p pVar6 = pVar3;
                p3.v.a(n2VarC3, z3.f.c(2055885827, new iv0.u(rVar3, m3Var3, pVar6, b0Var6, p1Var, z15, x3VarB3, str, b0Var5, aVar3, p1Var2, l0Var3, i14, i47, qVar3, num2, lVar2, lVar), o0Var), o0Var, 56);
                str6 = str7;
                rVar2 = rVar3;
                pVar2 = pVar6;
                i28 = i47;
            } else {
                str5 = str2;
                o0Var = o0VarE;
                o0Var.e();
                pVar2 = pVar;
                str6 = str4;
                i28 = i15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new t(rVar2, str, str5, str6, num, z14, lVar, lVar2, i14, i28, pVar2, i16, i17, i18);
            }
        }
        i25 = 54;
        if ((i24 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (o0VarE.n(i24 & 1, z16)) {
            if (i39 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i44 != 0) {
                str7 = "";
            } else {
                str7 = str4;
            }
            x5.p.f188918b.getClass();
            int i48 = x5.p.f188926j;
            if (i26 != 0) {
                pVar3 = null;
            } else {
                pVar3 = pVar;
            }
            x1 x1Var4 = p3.n.f135158a;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new i2.c();
                o0VarE.K(objQ);
            }
            i2.a aVar4 = (i2.a) objQ;
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            b0 b0Var7 = (b0) objQ2;
            m4.q qVar4 = (m4.q) o0VarE.A(t1.f91491i);
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = kg.f.j(o0VarE);
            }
            m4.b0 b0Var8 = (m4.b0) objQ3;
            m3 m3Var4 = (m3) o0VarE.A(t1.f91499q);
            objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p1Var = (p1) objQ4;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                f14 = -1.0f;
            } else {
                f14 = -1.0f;
            }
            i29 = i24;
            x3 x3VarB4 = s1.f.b(f14, s1.l.d(300, 0, null, 6), "", o0VarE, 3120, 20);
            objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                int length7 = str2.length();
                o0Var = o0VarE;
                str5 = str2;
                i30 = i29;
                objQ5 = p0.n(new x5.l0(str5, og.a.l(length7, length7), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
                o0Var.K(objQ5);
            } else {
                o0Var = o0VarE;
                str5 = str2;
                i30 = i29;
            }
            p1Var2 = (p1) objQ5;
            objQ6 = o0Var.q();
            if (objQ6 == r1) {
                int length8 = str7.length();
                objQ6 = new x5.l0(str7, og.a.l(length8, length8), (w0) null, 4, (p005kotlin.jvm.internal.j) null);
                o0Var.K(objQ6);
            }
            x5.l0 l0Var4 = (x5.l0) objQ6;
            t2 t2Var4 = new t2(e0.d(d92.b.f58623a, o0Var), d0.c(0.4f, d92.b.a(o0Var).k().b(), 14), null);
            if ((i30 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            objQ7 = o0Var.q();
            if (z17) {
                objQ7 = new b82.b0(6, str5, p1Var2);
                o0Var.K(objQ7);
            } else {
                objQ7 = new b82.b0(6, str5, p1Var2);
                o0Var.K(objQ7);
            }
            l0.a(str5, (e23.l) objQ7, o0Var);
            n2 n2VarC4 = u2.f201804a.c(t2Var4);
            e23.p pVar7 = pVar3;
            p3.v.a(n2VarC4, z3.f.c(2055885827, new iv0.u(rVar3, m3Var4, pVar7, b0Var8, p1Var, z15, x3VarB4, str, b0Var7, aVar4, p1Var2, l0Var4, i14, i48, qVar4, num2, lVar2, lVar), o0Var), o0Var, 56);
            str6 = str7;
            rVar2 = rVar3;
            pVar2 = pVar7;
            i28 = i48;
        } else {
            str5 = str2;
            o0Var = o0VarE;
            o0Var.e();
            pVar2 = pVar;
            str6 = str4;
            i28 = i15;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(rVar2, str, str5, str6, num, z14, lVar, lVar2, i14, i28, pVar2, i16, i17, i18);
        }
    }
}
