package p006l2;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import d4.a;
import e23.l;
import f5.y0;
import g6.o;
import h4.r;
import h5.e0;
import h5.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import jx0.e;
import kk1.h;
import kotlin.t1;
import ky0.k;
import l01.b;
import lg.d;
import o13.p;
import o4.j0;
import p005kotlin.Unit;
import p13.k0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.q2;
import s5.c;
import s5.f;
import s5.q0;
import s5.x0;
import w02.b0;
import w5.q;
import y2.i;
import y2.s;
import y2.t;
import z2.q1;
import z2.s1;
import z2.t2;
import z2.u2;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    /* JADX WARN: Code duplicated, block: B:100:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x011a  */
    /* JADX WARN: Code duplicated, block: B:102:0x011c  */
    /* JADX WARN: Code duplicated, block: B:104:0x011f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0127  */
    /* JADX WARN: Code duplicated, block: B:108:0x013a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0171  */
    /* JADX WARN: Code duplicated, block: B:113:0x0179  */
    /* JADX WARN: Code duplicated, block: B:114:0x017b  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:133:0x020d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0213 A[EDGE_INSN: B:135:0x0213->B:136:0x0215 BREAK  A[LOOP:0: B:125:0x01e8->B:134:0x020e]] */
    /* JADX WARN: Code duplicated, block: B:148:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:151:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:154:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:156:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:164:0x0351  */
    /* JADX WARN: Code duplicated, block: B:167:0x035c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    /* JADX WARN: Instruction removed from duplicated block: B:148:0x02b5, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final c cVar, final r rVar, final x0 x0Var, final l lVar, final int i14, final boolean z14, final int i15, int i16, Map map, m mVar, final int i17, final int i18, final int i19) {
        int i24;
        x0 x0Var2;
        int i25;
        int i26;
        Map map2;
        int i27;
        int i28;
        int i29;
        boolean zR;
        int i30;
        boolean z15;
        final Map map3;
        final int i34;
        p2 p2VarI0;
        int i35;
        Map map4;
        q1 q1Var;
        m.a aVar;
        m.a aVar2;
        y2.l lVar2;
        List<c.d<? extends c.a>> list;
        boolean z16;
        boolean z17;
        q.b bVar;
        y2.l lVar3;
        boolean z18;
        Object objQ;
        p1 p1Var;
        boolean zB;
        Object objQ2;
        Map map5;
        int i36;
        int size;
        int i37;
        c.d<? extends c.a> dVar;
        long j8;
        boolean zR2;
        Object objQ3;
        int i38;
        long jLongValue;
        boolean zL;
        Object objQ4;
        o0 o0VarE = mVar.E(-1343466571);
        if ((i17 & 6) == 0) {
            i24 = (o0VarE.B(cVar) ? 4 : 2) | i17;
        } else {
            i24 = i17;
        }
        if ((i17 & 48) == 0) {
            i24 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i17 & 384) == 0) {
            x0Var2 = x0Var;
            i24 |= o0VarE.B(x0Var2) ? 256 : 128;
        } else {
            x0Var2 = x0Var;
        }
        if ((i17 & 3072) == 0) {
            i24 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i17 & 24576) == 0) {
            i24 |= o0VarE.k(i14) ? 16384 : 8192;
        }
        if ((196608 & i17) == 0) {
            i24 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if ((1572864 & i17) == 0) {
            i24 |= o0VarE.k(i15) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i39 = i19 & 128;
        if (i39 == 0) {
            if ((12582912 & i17) == 0) {
                i25 = i16;
                i24 |= o0VarE.k(i25) ? 8388608 : 4194304;
            }
            i26 = i19 & 256;
            if (i26 != 0) {
                i24 |= 100663296;
                map2 = map;
            } else {
                map2 = map;
                if ((i17 & 100663296) == 0) {
                    if (o0VarE.r(map2)) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i24 |= i27;
                }
            }
            i28 = i24 | C.ENCODING_PCM_32BIT;
            if ((i19 & 1024) != 0) {
                i29 = i18 | 6;
            } else if ((i18 & 6) == 0) {
                if ((i18 & 8) == 0) {
                    zR = o0VarE.B(null);
                } else {
                    zR = o0VarE.r(null);
                }
                if (zR) {
                    i30 = 4;
                } else {
                    i30 = 2;
                }
                i29 = i18 | i30;
            } else {
                i29 = i18;
            }
            if ((i28 & 306783379) == 306783378 || (i29 & 3) != 2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i28 & 1, z15)) {
                if (i39 != 0) {
                    i35 = 1;
                } else {
                    i35 = i25;
                }
                if (i26 != 0) {
                    k0 k0Var = k0.f134949a;
                    k0Var.getClass();
                    map4 = k0Var;
                } else {
                    map4 = map2;
                }
                x1 x1Var = n.f135158a;
                o1.a(i35, i15);
                q1Var = (q1) o0VarE.A(s1.f201786a);
                aVar = m.f135153a;
                if (q1Var != null) {
                    o0VarE.C(1588268245);
                    aVar2 = aVar;
                    j8 = ((t2) o0VarE.A(u2.f201804a)).f201803b;
                    Object[] objArr = {q1Var};
                    h hVar = new h(q1Var, 11);
                    kn1.m mVar2 = new kn1.m(21);
                    d4.l lVar4 = d4.m.f57455a;
                    d4.l lVar5 = new d4.l(hVar, mVar2);
                    zR2 = o0VarE.r(q1Var);
                    objQ3 = o0VarE.q();
                    if (zR2) {
                        i38 = 0;
                        objQ3 = new s(q1Var, 0);
                        o0VarE.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == m.a.f135155b) {
                            i38 = 0;
                            objQ3 = new s(q1Var, 0);
                            o0VarE.K(objQ3);
                        } else {
                            i38 = 0;
                        }
                    }
                    jLongValue = ((Number) a.c(objArr, lVar5, (e23.a) objQ3, o0VarE, i38)).longValue();
                    zL = o0VarE.l(jLongValue) | o0VarE.B(q1Var) | o0VarE.l(j8);
                    objQ4 = o0VarE.q();
                    if (zL) {
                        objQ4 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                        o0VarE.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                            o0VarE.K(objQ4);
                        }
                    }
                    lVar2 = (y2.l) objQ4;
                    o0VarE.g0(false);
                } else {
                    aVar2 = aVar;
                    o0VarE.C(1588759409);
                    o0VarE.g0(false);
                    lVar2 = null;
                }
                p<List<c.d<s5.y>>, List<c.d<e23.q<String, m, Integer, Unit>>>> pVar = c.f108419a;
                int length = cVar.f157138b.length();
                list = cVar.f157137a;
                if (list != null) {
                    z16 = false;
                    z17 = false;
                    break;
                }
                size = list.size();
                i37 = 0;
                while (true) {
                    if (i37 < size) {
                        z16 = false;
                        z17 = false;
                        break;
                    }
                    dVar = list.get(i37);
                    if (!(dVar.f157149a instanceof s5.k0) && "androidx.compose.foundation.text.inlineContent".equals(dVar.f157152d)) {
                        z16 = false;
                        if (f.b(0, length, dVar.f157150b, dVar.f157151c)) {
                            z17 = true;
                            break;
                        }
                    }
                    i37++;
                }
                boolean zM = b0.m(cVar);
                bVar = (q.b) o0VarE.A(t1.f91493k);
                lVar3 = lVar2;
                if (!z17 || zM) {
                    int i44 = i35;
                    boolean z19 = z16;
                    o0VarE.C(1590022070);
                    z18 = (i28 & 14) != 4 ? z19 : true;
                    objQ = o0VarE.q();
                    if (z18) {
                        objQ = p0.n(cVar);
                        o0VarE.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = p0.n(cVar);
                            o0VarE.K(objQ);
                        }
                    }
                    p1Var = (p1) objQ;
                    c cVar2 = (c) p1Var.getF182175a();
                    zB = o0VarE.B(p1Var);
                    objQ2 = o0VarE.q();
                    if (zB) {
                        objQ2 = new k(p1Var, 6);
                        o0VarE.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new k(p1Var, 6);
                            o0VarE.K(objQ2);
                        }
                    }
                    int i45 = i28 << 6;
                    Map map6 = map4;
                    c(rVar, cVar2, lVar, z17, map6, x0Var, i14, z14, i15, i44, bVar, lVar3, (l) objQ2, null, o0VarE, ((i28 >> 3) & 910) | ((i28 >> 12) & 57344) | ((i28 << 9) & 458752) | (3670016 & i45) | (29360128 & i45) | (234881024 & i45) | (i45 & 1879048192), ((i28 >> 21) & 896) | (57344 & (i29 << 12)));
                    map5 = map6;
                    i36 = i44;
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1589006262);
                    a0.a(cVar, x0Var2, bVar, null, o0VarE, (i28 & 14) | 3072 | ((i28 >> 3) & 112));
                    i36 = i35;
                    r rVarE = e(rVar, cVar, x0Var, lVar, i14, z14, i15, i36, bVar, null, null, lVar3, null, null, null);
                    k1 k1Var = k1.f108614a;
                    x1 x1Var2 = n.f135158a;
                    int iHashCode = Long.hashCode(o0VarE.U);
                    r rVarC = h4.k.c(rVarE, o0VarE);
                    i2 i2VarA0 = o0VarE.a0();
                    g.V.getClass();
                    e0.a aVar3 = g.a.f81805b;
                    if (o0VarE.f135177b == null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(g.a.f81810g, k1Var, o0VarE);
                    b4.c(g.a.f81809f, i2VarA0, o0VarE);
                    b4.b(g.a.f81814k, o0VarE);
                    b4.c(g.a.f81807d, rVarC, o0VarE);
                    b4.a(o0VarE, Integer.valueOf(iHashCode), g.a.f81813j);
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                    o0VarE = o0VarE;
                    map5 = map4;
                }
                x1 x1Var3 = n.f135158a;
                map3 = map5;
                i34 = i36;
            } else {
                o0VarE.e();
                map3 = map2;
                i34 = i25;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l2.w
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        y.a(cVar, rVar, x0Var, lVar, i14, z14, i15, i34, map3, (m) obj, p0.t(i17 | 1), p0.t(i18), i19);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i24 |= 12582912;
        i25 = i16;
        i26 = i19 & 256;
        if (i26 != 0) {
            i24 |= 100663296;
            map2 = map;
        } else {
            map2 = map;
            if ((i17 & 100663296) == 0) {
                if (o0VarE.r(map2)) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i24 |= i27;
            }
        }
        i28 = i24 | C.ENCODING_PCM_32BIT;
        if ((i19 & 1024) != 0) {
            i29 = i18 | 6;
        } else if ((i18 & 6) == 0) {
            if ((i18 & 8) == 0) {
                zR = o0VarE.B(null);
            } else {
                zR = o0VarE.r(null);
            }
            if (zR) {
                i30 = 4;
            } else {
                i30 = 2;
            }
            i29 = i18 | i30;
        } else {
            i29 = i18;
        }
        if ((i28 & 306783379) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (o0VarE.n(i28 & 1, z15)) {
            if (i39 != 0) {
                i35 = 1;
            } else {
                i35 = i25;
            }
            if (i26 != 0) {
                k0 k0Var2 = k0.f134949a;
                k0Var2.getClass();
                map4 = k0Var2;
            } else {
                map4 = map2;
            }
            x1 x1Var4 = n.f135158a;
            o1.a(i35, i15);
            q1Var = (q1) o0VarE.A(s1.f201786a);
            aVar = m.f135153a;
            if (q1Var != null) {
                o0VarE.C(1588268245);
                aVar2 = aVar;
                j8 = ((t2) o0VarE.A(u2.f201804a)).f201803b;
                Object[] objArr2 = {q1Var};
                h hVar2 = new h(q1Var, 11);
                kn1.m mVar3 = new kn1.m(21);
                d4.l lVar6 = d4.m.f57455a;
                d4.l lVar7 = new d4.l(hVar2, mVar3);
                zR2 = o0VarE.r(q1Var);
                objQ3 = o0VarE.q();
                if (zR2) {
                    aVar2.getClass();
                    if (objQ3 == m.a.f135155b) {
                        i38 = 0;
                        objQ3 = new s(q1Var, 0);
                        o0VarE.K(objQ3);
                    } else {
                        i38 = 0;
                    }
                } else {
                    i38 = 0;
                    objQ3 = new s(q1Var, 0);
                    o0VarE.K(objQ3);
                }
                jLongValue = ((Number) a.c(objArr2, lVar7, (e23.a) objQ3, o0VarE, i38)).longValue();
                zL = o0VarE.l(jLongValue) | o0VarE.B(q1Var) | o0VarE.l(j8);
                objQ4 = o0VarE.q();
                if (zL) {
                    aVar2.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                        o0VarE.K(objQ4);
                    }
                } else {
                    objQ4 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                    o0VarE.K(objQ4);
                }
                lVar2 = (y2.l) objQ4;
                o0VarE.g0(false);
            } else {
                aVar2 = aVar;
                o0VarE.C(1588759409);
                o0VarE.g0(false);
                lVar2 = null;
            }
            p<List<c.d<s5.y>>, List<c.d<e23.q<String, m, Integer, Unit>>>> pVar2 = c.f108419a;
            int length2 = cVar.f157138b.length();
            list = cVar.f157137a;
            if (list != null) {
                z16 = false;
                z17 = false;
                break;
            }
            size = list.size();
            i37 = 0;
            while (true) {
                if (i37 < size) {
                    z16 = false;
                    z17 = false;
                    break;
                } else {
                    dVar = list.get(i37);
                    if (!(dVar.f157149a instanceof s5.k0)) {
                    }
                    i37++;
                }
            }
            boolean zM2 = b0.m(cVar);
            bVar = (q.b) o0VarE.A(t1.f91493k);
            lVar3 = lVar2;
            if (z17) {
                int i46 = i35;
                boolean z110 = z16;
                o0VarE.C(1590022070);
                if ((i28 & 14) != 4) {
                }
                objQ = o0VarE.q();
                if (z18) {
                    aVar2.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = p0.n(cVar);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = p0.n(cVar);
                    o0VarE.K(objQ);
                }
                p1Var = (p1) objQ;
                c cVar3 = (c) p1Var.getF182175a();
                zB = o0VarE.B(p1Var);
                objQ2 = o0VarE.q();
                if (zB) {
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new k(p1Var, 6);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new k(p1Var, 6);
                    o0VarE.K(objQ2);
                }
                int i47 = i28 << 6;
                Map map7 = map4;
                c(rVar, cVar3, lVar, z17, map7, x0Var, i14, z14, i15, i46, bVar, lVar3, (l) objQ2, null, o0VarE, ((i28 >> 3) & 910) | ((i28 >> 12) & 57344) | ((i28 << 9) & 458752) | (3670016 & i47) | (29360128 & i47) | (234881024 & i47) | (i47 & 1879048192), ((i28 >> 21) & 896) | (57344 & (i29 << 12)));
                map5 = map7;
                i36 = i46;
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                int i48 = i35;
                boolean z111 = z16;
                o0VarE.C(1590022070);
                if ((i28 & 14) != 4) {
                }
                objQ = o0VarE.q();
                if (z18) {
                    aVar2.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = p0.n(cVar);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = p0.n(cVar);
                    o0VarE.K(objQ);
                }
                p1Var = (p1) objQ;
                c cVar4 = (c) p1Var.getF182175a();
                zB = o0VarE.B(p1Var);
                objQ2 = o0VarE.q();
                if (zB) {
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new k(p1Var, 6);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new k(p1Var, 6);
                    o0VarE.K(objQ2);
                }
                int i49 = i28 << 6;
                Map map8 = map4;
                c(rVar, cVar4, lVar, z17, map8, x0Var, i14, z14, i15, i48, bVar, lVar3, (l) objQ2, null, o0VarE, ((i28 >> 3) & 910) | ((i28 >> 12) & 57344) | ((i28 << 9) & 458752) | (3670016 & i49) | (29360128 & i49) | (234881024 & i49) | (i49 & 1879048192), ((i28 >> 21) & 896) | (57344 & (i29 << 12)));
                map5 = map8;
                i36 = i48;
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            x1 x1Var5 = n.f135158a;
            map3 = map5;
            i34 = i36;
        } else {
            o0VarE.e();
            map3 = map2;
            i34 = i25;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: l2.w
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    y.a(cVar, rVar, x0Var, lVar, i14, z14, i15, i34, map3, (m) obj, p0.t(i17 | 1), p0.t(i18), i19);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0130  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:106:0x0137  */
    /* JADX WARN: Code duplicated, block: B:108:0x0141  */
    /* JADX WARN: Code duplicated, block: B:110:0x0144  */
    /* JADX WARN: Code duplicated, block: B:111:0x0146  */
    /* JADX WARN: Code duplicated, block: B:114:0x014b  */
    /* JADX WARN: Code duplicated, block: B:115:0x014d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0153  */
    /* JADX WARN: Code duplicated, block: B:119:0x0155  */
    /* JADX WARN: Code duplicated, block: B:122:0x0168  */
    /* JADX WARN: Code duplicated, block: B:124:0x019d  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:131:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:133:0x01da  */
    /* JADX WARN: Code duplicated, block: B:135:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:138:0x0221  */
    /* JADX WARN: Code duplicated, block: B:148:0x0258  */
    /* JADX WARN: Code duplicated, block: B:149:0x025a  */
    /* JADX WARN: Code duplicated, block: B:152:0x026d A[Catch: RejectedExecutionException -> 0x0250, TryCatch #0 {RejectedExecutionException -> 0x0250, blocks: (B:142:0x0249, B:150:0x025b, B:152:0x026d, B:156:0x027c, B:160:0x0283, B:162:0x0294, B:166:0x029f, B:146:0x0254), top: B:198:0x0249 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0277  */
    /* JADX WARN: Code duplicated, block: B:155:0x0278  */
    /* JADX WARN: Code duplicated, block: B:158:0x0280 A[PHI: r41
      0x0280: PHI (r41v2 g6.o) = (r41v4 g6.o), (r41v5 g6.o) binds: [B:157:0x027e, B:153:0x0275] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:159:0x0282  */
    /* JADX WARN: Code duplicated, block: B:162:0x0294 A[Catch: RejectedExecutionException -> 0x0250, TryCatch #0 {RejectedExecutionException -> 0x0250, blocks: (B:142:0x0249, B:150:0x025b, B:152:0x026d, B:156:0x027c, B:160:0x0283, B:162:0x0294, B:166:0x029f, B:146:0x0254), top: B:198:0x0249 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x029b  */
    /* JADX WARN: Code duplicated, block: B:165:0x029c  */
    /* JADX WARN: Code duplicated, block: B:166:0x029f A[Catch: RejectedExecutionException -> 0x0250, TRY_LEAVE, TryCatch #0 {RejectedExecutionException -> 0x0250, blocks: (B:142:0x0249, B:150:0x025b, B:152:0x026d, B:156:0x027c, B:160:0x0283, B:162:0x0294, B:166:0x029f, B:146:0x0254), top: B:198:0x0249 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:178:0x02cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:185:0x034e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0355  */
    /* JADX WARN: Code duplicated, block: B:188:0x0359  */
    /* JADX WARN: Code duplicated, block: B:190:0x0384  */
    /* JADX WARN: Code duplicated, block: B:192:0x0388  */
    /* JADX WARN: Code duplicated, block: B:195:0x039c  */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7 A[PHI: r21
      0x00f7: PHI (r21v18 int) = (r21v4 int), (r21v10 int), (r21v11 int) binds: [B:85:0x00f5, B:95:0x0112, B:94:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112  */
    /* JADX WARN: Code duplicated, block: B:98:0x0123  */
    /* JADX WARN: Code duplicated, block: B:99:0x0125  */
    public static final void b(final String str, final r rVar, final x0 x0Var, l<? super q0, Unit> lVar, int i14, boolean z14, final int i15, int i16, j0 j0Var, l2 l2Var, m mVar, final int i17, final int i18) {
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z15;
        int i28;
        int i29;
        int i30;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        boolean zR;
        boolean z16;
        o0 o0Var;
        final int i44;
        final boolean z17;
        final l<? super q0, Unit> lVar2;
        final j0 j0Var2;
        final l2 l2Var2;
        final int i45;
        p2 p2VarI0;
        l<? super q0, Unit> lVar3;
        int i46;
        boolean z18;
        j0 j0Var3;
        int i47;
        l2 l2Var3;
        q1 q1Var;
        m.a aVar;
        m.a aVar2;
        y2.l lVar4;
        Executor executor;
        int i48;
        boolean z19;
        boolean z24;
        int i49;
        int i54;
        Throwable th3;
        l<? super q0, Unit> lVar5;
        r rVarThen;
        k1 k1Var;
        int iHashCode;
        r rVarC;
        i2 i2VarA0;
        e0.a aVar3;
        boolean z25;
        o oVar;
        boolean z26;
        boolean zB;
        Object objQ;
        long j8;
        boolean zR2;
        Object objQ2;
        long jLongValue;
        boolean zL;
        Object objQ3;
        int i55;
        o0 o0VarE = mVar.E(-1040751001);
        if ((i17 & 6) == 0) {
            i19 = (o0VarE.B(str) ? 4 : 2) | i17;
        } else {
            i19 = i17;
        }
        if ((i17 & 48) == 0) {
            i19 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i17 & 384) == 0) {
            i19 |= o0VarE.B(x0Var) ? 256 : 128;
        }
        int i56 = i18 & 8;
        if (i56 == 0) {
            if ((i17 & 3072) == 0) {
                i19 |= o0VarE.r(lVar) ? 2048 : 1024;
            }
            i24 = i18 & 16;
            if (i24 != 0) {
                if ((i17 & 24576) == 0) {
                    i25 = i14;
                    if (o0VarE.k(i25)) {
                        i26 = 16384;
                    } else {
                        i26 = 8192;
                    }
                    i19 |= i26;
                }
                i27 = i18 & 32;
                if (i27 != 0) {
                    i19 |= 196608;
                    z15 = z14;
                } else {
                    z15 = z14;
                    if ((i17 & 196608) == 0) {
                        if (o0VarE.h(z15)) {
                            i28 = 131072;
                        } else {
                            i28 = 65536;
                        }
                        i19 |= i28;
                    }
                }
                if ((i17 & 1572864) == 0) {
                    if (o0VarE.k(i15)) {
                        i55 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i55 = 524288;
                    }
                    i19 |= i55;
                }
                i29 = i18 & 128;
                if (i29 != 0) {
                    i19 |= 12582912;
                    i30 = i16;
                } else {
                    i30 = i16;
                    if ((i17 & 12582912) == 0) {
                        if (o0VarE.k(i30)) {
                            i34 = 8388608;
                        } else {
                            i34 = 4194304;
                        }
                        i19 |= i34;
                    }
                }
                i35 = i19;
                i36 = i18 & 256;
                if (i36 != 0) {
                    if ((i17 & 100663296) == 0) {
                        if (o0VarE.r(j0Var)) {
                            i37 = 67108864;
                        } else {
                            i37 = 33554432;
                        }
                        i35 |= i37;
                    }
                    i38 = i18 & 512;
                    i39 = C.ENCODING_PCM_32BIT;
                    if (i38 == 0) {
                        i35 |= i39;
                    } else if ((i17 & C.ENCODING_PCM_32BIT) == 0) {
                        if ((i17 & 1073741824) == 0) {
                            zR = o0VarE.B(l2Var);
                        } else {
                            zR = o0VarE.r(l2Var);
                        }
                        if (zR) {
                            i39 = 536870912;
                        } else {
                            i39 = 268435456;
                        }
                        i35 |= i39;
                    }
                    if ((i35 & 306783379) != 306783378) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i35 & 1, z16)) {
                        if (i56 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        if (i24 != 0) {
                            d6.p.f57793b.getClass();
                            i25 = d6.p.f57794c;
                        }
                        if (i27 != 0) {
                            z15 = true;
                        }
                        if (i29 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i30;
                        }
                        z18 = z15;
                        if (i36 != 0) {
                            j0Var3 = null;
                        } else {
                            j0Var3 = j0Var;
                        }
                        i47 = i25;
                        if (i38 != 0) {
                            l2Var3 = null;
                        } else {
                            l2Var3 = l2Var;
                        }
                        x1 x1Var = n.f135158a;
                        o1.a(i46, i15);
                        q1Var = (q1) o0VarE.A(s1.f201786a);
                        aVar = m.f135153a;
                        if (q1Var != null) {
                            o0VarE.C(356423075);
                            j8 = ((t2) o0VarE.A(u2.f201804a)).f201803b;
                            Object[] objArr = {q1Var};
                            h hVar = new h(q1Var, 11);
                            kn1.m mVar2 = new kn1.m(21);
                            d4.l lVar6 = d4.m.f57455a;
                            d4.l lVar7 = new d4.l(hVar, mVar2);
                            zR2 = o0VarE.r(q1Var);
                            objQ2 = o0VarE.q();
                            if (zR2) {
                                objQ2 = new s(q1Var, 1);
                                o0VarE.K(objQ2);
                            } else {
                                aVar.getClass();
                                if (objQ2 == m.a.f135155b) {
                                    objQ2 = new s(q1Var, 1);
                                    o0VarE.K(objQ2);
                                }
                            }
                            aVar2 = aVar;
                            jLongValue = ((Number) a.c(objArr, lVar7, (e23.a) objQ2, o0VarE, 0)).longValue();
                            zL = o0VarE.l(jLongValue) | o0VarE.B(q1Var) | o0VarE.l(j8);
                            objQ3 = o0VarE.q();
                            if (zL) {
                                objQ3 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                                o0VarE.K(objQ3);
                            } else {
                                aVar2.getClass();
                                if (objQ3 == m.a.f135155b) {
                                    objQ3 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                                    o0VarE.K(objQ3);
                                }
                            }
                            lVar4 = (y2.l) objQ3;
                            o0VarE.g0(false);
                        } else {
                            aVar2 = aVar;
                            o0VarE.C(356914239);
                            o0VarE.g0(false);
                            lVar4 = null;
                        }
                        q.b bVar = (q.b) o0VarE.A(t1.f91493k);
                        int i57 = (i35 & 14) | ((i35 >> 3) & 112);
                        executor = (Executor) o0VarE.A(a0.f108336a);
                        if (executor == null && a0.b(str.length())) {
                            o0VarE.C(1254274527);
                            o oVar2 = (o) o0VarE.A(t1.f91496n);
                            g6.c cVar = (g6.c) o0VarE.A(t1.f91490h);
                            if (((i57 & 112) ^ 48) > 32) {
                                try {
                                    if (o0VarE.B(x0Var)) {
                                        z25 = true;
                                    } else if ((i57 & 48) == 32) {
                                        z25 = true;
                                    } else {
                                        z25 = false;
                                    }
                                    boolean zK = z25 | o0VarE.k(oVar2.ordinal());
                                    if (((i57 & 14) ^ 6) > 4) {
                                        oVar = oVar2;
                                        if (!o0VarE.B(str)) {
                                            z26 = true;
                                        }
                                        zB = z26 | zK | o0VarE.B(cVar) | o0VarE.r(bVar);
                                        objQ = o0VarE.q();
                                        if (zB) {
                                            i48 = i46;
                                            com.mapbox.maps.plugin.annotation.a aVar4 = new com.mapbox.maps.plugin.annotation.a(x0Var, oVar, str, cVar, bVar, 1);
                                            bVar = bVar;
                                            o0VarE.K(aVar4);
                                            objQ = aVar4;
                                            executor.execute((Runnable) objQ);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ == m.a.f135155b) {
                                                i48 = i46;
                                                try {
                                                    com.mapbox.maps.plugin.annotation.a aVar5 = new com.mapbox.maps.plugin.annotation.a(x0Var, oVar, str, cVar, bVar, 1);
                                                    bVar = bVar;
                                                    try {
                                                        o0VarE.K(aVar5);
                                                        objQ = aVar5;
                                                    } catch (RejectedExecutionException unused) {
                                                    }
                                                } catch (RejectedExecutionException unused2) {
                                                    bVar = bVar;
                                                }
                                            } else {
                                                i48 = i46;
                                            }
                                            executor.execute((Runnable) objQ);
                                        }
                                        z19 = false;
                                    } else {
                                        oVar = oVar2;
                                    }
                                    if ((i57 & 6) == 4) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    zB = z26 | zK | o0VarE.B(cVar) | o0VarE.r(bVar);
                                    objQ = o0VarE.q();
                                    if (zB) {
                                        aVar2.getClass();
                                        if (objQ == m.a.f135155b) {
                                            i48 = i46;
                                            com.mapbox.maps.plugin.annotation.a aVar6 = new com.mapbox.maps.plugin.annotation.a(x0Var, oVar, str, cVar, bVar, 1);
                                            bVar = bVar;
                                            o0VarE.K(aVar6);
                                            objQ = aVar6;
                                        } else {
                                            i48 = i46;
                                        }
                                        executor.execute((Runnable) objQ);
                                    } else {
                                        i48 = i46;
                                        com.mapbox.maps.plugin.annotation.a aVar7 = new com.mapbox.maps.plugin.annotation.a(x0Var, oVar, str, cVar, bVar, 1);
                                        bVar = bVar;
                                        o0VarE.K(aVar7);
                                        objQ = aVar7;
                                        executor.execute((Runnable) objQ);
                                    }
                                } catch (RejectedExecutionException unused3) {
                                    i48 = i46;
                                }
                                z19 = false;
                            } else {
                                if ((i57 & 48) == 32) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                boolean zK2 = z25 | o0VarE.k(oVar2.ordinal());
                                if (((i57 & 14) ^ 6) > 4) {
                                    oVar = oVar2;
                                    if (!o0VarE.B(str)) {
                                        z26 = true;
                                    }
                                    zB = z26 | zK2 | o0VarE.B(cVar) | o0VarE.r(bVar);
                                    objQ = o0VarE.q();
                                    if (zB) {
                                        aVar2.getClass();
                                        if (objQ == m.a.f135155b) {
                                            i48 = i46;
                                            com.mapbox.maps.plugin.annotation.a aVar8 = new com.mapbox.maps.plugin.annotation.a(x0Var, oVar, str, cVar, bVar, 1);
                                            bVar = bVar;
                                            o0VarE.K(aVar8);
                                            objQ = aVar8;
                                        } else {
                                            i48 = i46;
                                        }
                                        executor.execute((Runnable) objQ);
                                    } else {
                                        i48 = i46;
                                        com.mapbox.maps.plugin.annotation.a aVar9 = new com.mapbox.maps.plugin.annotation.a(x0Var, oVar, str, cVar, bVar, 1);
                                        bVar = bVar;
                                        o0VarE.K(aVar9);
                                        objQ = aVar9;
                                        executor.execute((Runnable) objQ);
                                    }
                                    z19 = false;
                                } else {
                                    oVar = oVar2;
                                }
                                if ((i57 & 6) == 4) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                zB = z26 | zK2 | o0VarE.B(cVar) | o0VarE.r(bVar);
                                objQ = o0VarE.q();
                                if (zB) {
                                    aVar2.getClass();
                                    if (objQ == m.a.f135155b) {
                                        i48 = i46;
                                        com.mapbox.maps.plugin.annotation.a aVar10 = new com.mapbox.maps.plugin.annotation.a(x0Var, oVar, str, cVar, bVar, 1);
                                        bVar = bVar;
                                        o0VarE.K(aVar10);
                                        objQ = aVar10;
                                    } else {
                                        i48 = i46;
                                    }
                                    executor.execute((Runnable) objQ);
                                } else {
                                    i48 = i46;
                                    com.mapbox.maps.plugin.annotation.a aVar11 = new com.mapbox.maps.plugin.annotation.a(x0Var, oVar, str, cVar, bVar, 1);
                                    bVar = bVar;
                                    o0VarE.K(aVar11);
                                    objQ = aVar11;
                                    executor.execute((Runnable) objQ);
                                }
                                z19 = false;
                            }
                        } else {
                            i48 = i46;
                            z19 = false;
                            o0VarE.C(1250991751);
                        }
                        o0VarE.g0(z19);
                        x1 x1Var2 = n.f135158a;
                        if (lVar4 != null && lVar3 == null && l2Var3 == null) {
                            o0VarE.C(357875859);
                            o0VarE.g0(z19);
                            z24 = z18;
                            i49 = i48;
                            i54 = i47;
                            rVarThen = rVar.then(new t(str, x0Var, bVar, i54, z24, i15, i49, j0Var3, null));
                            o0Var = o0VarE;
                            lVar5 = lVar3;
                            th3 = null;
                        } else {
                            z24 = z18;
                            i49 = i48;
                            i54 = i47;
                            o0VarE.C(357232113);
                            th3 = null;
                            o0Var = o0VarE;
                            j0 j0Var4 = j0Var3;
                            lVar5 = lVar3;
                            r rVarE = e(rVar, new c(str, null, 2, null), x0Var, lVar5, i54, z24, i15, i49, (q.b) o0VarE.A(t1.f91493k), null, null, lVar4, j0Var4, null, l2Var3);
                            j0Var3 = j0Var4;
                            o0Var.g0(false);
                            rVarThen = rVarE;
                        }
                        k1Var = k1.f108614a;
                        iHashCode = Long.hashCode(o0Var.U);
                        rVarC = h4.k.c(rVarThen, o0Var);
                        i2VarA0 = o0Var.a0();
                        g.V.getClass();
                        aVar3 = g.a.f81805b;
                        if (o0Var.f135177b != null) {
                            p0.l();
                            throw th3;
                        }
                        o0Var.z();
                        if (o0Var.T) {
                            o0Var.M(aVar3);
                        } else {
                            o0Var.c();
                        }
                        b4.c(g.a.f81810g, k1Var, o0Var);
                        b4.c(g.a.f81809f, i2VarA0, o0Var);
                        b4.b(g.a.f81814k, o0Var);
                        b4.c(g.a.f81807d, rVarC, o0Var);
                        b4.a(o0Var, Integer.valueOf(iHashCode), g.a.f81813j);
                        o0Var.g0(true);
                        z17 = z24;
                        j0Var2 = j0Var3;
                        l2Var2 = l2Var3;
                        i45 = i54;
                        i44 = i49;
                        lVar2 = lVar5;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        boolean z27 = z15;
                        i44 = i30;
                        z17 = z27;
                        lVar2 = lVar;
                        j0Var2 = j0Var;
                        l2Var2 = l2Var;
                        i45 = i25;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: l2.x
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                y.b(str, rVar, x0Var, lVar2, i45, z17, i15, i44, j0Var2, l2Var2, (m) obj, p0.t(i17 | 1), i18);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i35 |= 100663296;
                i38 = i18 & 512;
                i39 = C.ENCODING_PCM_32BIT;
                if (i38 == 0) {
                    i35 |= i39;
                } else if ((i17 & C.ENCODING_PCM_32BIT) == 0) {
                    if ((i17 & 1073741824) == 0) {
                        zR = o0VarE.B(l2Var);
                    } else {
                        zR = o0VarE.r(l2Var);
                    }
                    if (zR) {
                        i39 = 536870912;
                    } else {
                        i39 = 268435456;
                    }
                    i35 |= i39;
                }
                if ((i35 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i35 & 1, z16)) {
                    if (i56 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    if (i24 != 0) {
                        d6.p.f57793b.getClass();
                        i25 = d6.p.f57794c;
                    }
                    if (i27 != 0) {
                        z15 = true;
                    }
                    if (i29 != 0) {
                        i46 = 1;
                    } else {
                        i46 = i30;
                    }
                    z18 = z15;
                    if (i36 != 0) {
                        j0Var3 = null;
                    } else {
                        j0Var3 = j0Var;
                    }
                    i47 = i25;
                    if (i38 != 0) {
                        l2Var3 = null;
                    } else {
                        l2Var3 = l2Var;
                    }
                    x1 x1Var3 = n.f135158a;
                    o1.a(i46, i15);
                    q1Var = (q1) o0VarE.A(s1.f201786a);
                    aVar = m.f135153a;
                    if (q1Var != null) {
                        o0VarE.C(356423075);
                        j8 = ((t2) o0VarE.A(u2.f201804a)).f201803b;
                        Object[] objArr2 = {q1Var};
                        h hVar2 = new h(q1Var, 11);
                        kn1.m mVar3 = new kn1.m(21);
                        d4.l lVar8 = d4.m.f57455a;
                        d4.l lVar9 = new d4.l(hVar2, mVar3);
                        zR2 = o0VarE.r(q1Var);
                        objQ2 = o0VarE.q();
                        if (zR2) {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new s(q1Var, 1);
                                o0VarE.K(objQ2);
                            }
                        } else {
                            objQ2 = new s(q1Var, 1);
                            o0VarE.K(objQ2);
                        }
                        aVar2 = aVar;
                        jLongValue = ((Number) a.c(objArr2, lVar9, (e23.a) objQ2, o0VarE, 0)).longValue();
                        zL = o0VarE.l(jLongValue) | o0VarE.B(q1Var) | o0VarE.l(j8);
                        objQ3 = o0VarE.q();
                        if (zL) {
                            aVar2.getClass();
                            if (objQ3 == m.a.f135155b) {
                                objQ3 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                                o0VarE.K(objQ3);
                            }
                        } else {
                            objQ3 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                            o0VarE.K(objQ3);
                        }
                        lVar4 = (y2.l) objQ3;
                        o0VarE.g0(false);
                    } else {
                        aVar2 = aVar;
                        o0VarE.C(356914239);
                        o0VarE.g0(false);
                        lVar4 = null;
                    }
                    q.b bVar2 = (q.b) o0VarE.A(t1.f91493k);
                    int i58 = (i35 & 14) | ((i35 >> 3) & 112);
                    executor = (Executor) o0VarE.A(a0.f108336a);
                    if (executor == null) {
                        i48 = i46;
                        z19 = false;
                        o0VarE.C(1250991751);
                    } else {
                        i48 = i46;
                        z19 = false;
                        o0VarE.C(1250991751);
                    }
                    o0VarE.g0(z19);
                    x1 x1Var4 = n.f135158a;
                    if (lVar4 != null) {
                        z24 = z18;
                        i49 = i48;
                        i54 = i47;
                        o0VarE.C(357232113);
                        th3 = null;
                        o0Var = o0VarE;
                        j0 j0Var5 = j0Var3;
                        lVar5 = lVar3;
                        r rVarE2 = e(rVar, new c(str, null, 2, null), x0Var, lVar5, i54, z24, i15, i49, (q.b) o0VarE.A(t1.f91493k), null, null, lVar4, j0Var5, null, l2Var3);
                        j0Var3 = j0Var5;
                        o0Var.g0(false);
                        rVarThen = rVarE2;
                    } else {
                        z24 = z18;
                        i49 = i48;
                        i54 = i47;
                        o0VarE.C(357232113);
                        th3 = null;
                        o0Var = o0VarE;
                        j0 j0Var6 = j0Var3;
                        lVar5 = lVar3;
                        r rVarE3 = e(rVar, new c(str, null, 2, null), x0Var, lVar5, i54, z24, i15, i49, (q.b) o0VarE.A(t1.f91493k), null, null, lVar4, j0Var6, null, l2Var3);
                        j0Var3 = j0Var6;
                        o0Var.g0(false);
                        rVarThen = rVarE3;
                    }
                    k1Var = k1.f108614a;
                    iHashCode = Long.hashCode(o0Var.U);
                    rVarC = h4.k.c(rVarThen, o0Var);
                    i2VarA0 = o0Var.a0();
                    g.V.getClass();
                    aVar3 = g.a.f81805b;
                    if (o0Var.f135177b != null) {
                        p0.l();
                        throw th3;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar3);
                    } else {
                        o0Var.c();
                    }
                    b4.c(g.a.f81810g, k1Var, o0Var);
                    b4.c(g.a.f81809f, i2VarA0, o0Var);
                    b4.b(g.a.f81814k, o0Var);
                    b4.c(g.a.f81807d, rVarC, o0Var);
                    b4.a(o0Var, Integer.valueOf(iHashCode), g.a.f81813j);
                    o0Var.g0(true);
                    z17 = z24;
                    j0Var2 = j0Var3;
                    l2Var2 = l2Var3;
                    i45 = i54;
                    i44 = i49;
                    lVar2 = lVar5;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    boolean z28 = z15;
                    i44 = i30;
                    z17 = z28;
                    lVar2 = lVar;
                    j0Var2 = j0Var;
                    l2Var2 = l2Var;
                    i45 = i25;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: l2.x
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            y.b(str, rVar, x0Var, lVar2, i45, z17, i15, i44, j0Var2, l2Var2, (m) obj, p0.t(i17 | 1), i18);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i19 |= 24576;
            i25 = i14;
            i27 = i18 & 32;
            if (i27 != 0) {
                i19 |= 196608;
                z15 = z14;
            } else {
                z15 = z14;
                if ((i17 & 196608) == 0) {
                    if (o0VarE.h(z15)) {
                        i28 = 131072;
                    } else {
                        i28 = 65536;
                    }
                    i19 |= i28;
                }
            }
            if ((i17 & 1572864) == 0) {
                if (o0VarE.k(i15)) {
                    i55 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i55 = 524288;
                }
                i19 |= i55;
            }
            i29 = i18 & 128;
            if (i29 != 0) {
                i19 |= 12582912;
                i30 = i16;
            } else {
                i30 = i16;
                if ((i17 & 12582912) == 0) {
                    if (o0VarE.k(i30)) {
                        i34 = 8388608;
                    } else {
                        i34 = 4194304;
                    }
                    i19 |= i34;
                }
            }
            i35 = i19;
            i36 = i18 & 256;
            if (i36 != 0) {
                if ((i17 & 100663296) == 0) {
                    if (o0VarE.r(j0Var)) {
                        i37 = 67108864;
                    } else {
                        i37 = 33554432;
                    }
                    i35 |= i37;
                }
                i38 = i18 & 512;
                i39 = C.ENCODING_PCM_32BIT;
                if (i38 == 0) {
                    i35 |= i39;
                } else if ((i17 & C.ENCODING_PCM_32BIT) == 0) {
                    if ((i17 & 1073741824) == 0) {
                        zR = o0VarE.B(l2Var);
                    } else {
                        zR = o0VarE.r(l2Var);
                    }
                    if (zR) {
                        i39 = 536870912;
                    } else {
                        i39 = 268435456;
                    }
                    i35 |= i39;
                }
                if ((i35 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i35 & 1, z16)) {
                    if (i56 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    if (i24 != 0) {
                        d6.p.f57793b.getClass();
                        i25 = d6.p.f57794c;
                    }
                    if (i27 != 0) {
                        z15 = true;
                    }
                    if (i29 != 0) {
                        i46 = 1;
                    } else {
                        i46 = i30;
                    }
                    z18 = z15;
                    if (i36 != 0) {
                        j0Var3 = null;
                    } else {
                        j0Var3 = j0Var;
                    }
                    i47 = i25;
                    if (i38 != 0) {
                        l2Var3 = null;
                    } else {
                        l2Var3 = l2Var;
                    }
                    x1 x1Var5 = n.f135158a;
                    o1.a(i46, i15);
                    q1Var = (q1) o0VarE.A(s1.f201786a);
                    aVar = m.f135153a;
                    if (q1Var != null) {
                        o0VarE.C(356423075);
                        j8 = ((t2) o0VarE.A(u2.f201804a)).f201803b;
                        Object[] objArr3 = {q1Var};
                        h hVar3 = new h(q1Var, 11);
                        kn1.m mVar4 = new kn1.m(21);
                        d4.l lVar10 = d4.m.f57455a;
                        d4.l lVar11 = new d4.l(hVar3, mVar4);
                        zR2 = o0VarE.r(q1Var);
                        objQ2 = o0VarE.q();
                        if (zR2) {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new s(q1Var, 1);
                                o0VarE.K(objQ2);
                            }
                        } else {
                            objQ2 = new s(q1Var, 1);
                            o0VarE.K(objQ2);
                        }
                        aVar2 = aVar;
                        jLongValue = ((Number) a.c(objArr3, lVar11, (e23.a) objQ2, o0VarE, 0)).longValue();
                        zL = o0VarE.l(jLongValue) | o0VarE.B(q1Var) | o0VarE.l(j8);
                        objQ3 = o0VarE.q();
                        if (zL) {
                            aVar2.getClass();
                            if (objQ3 == m.a.f135155b) {
                                objQ3 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                                o0VarE.K(objQ3);
                            }
                        } else {
                            objQ3 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                            o0VarE.K(objQ3);
                        }
                        lVar4 = (y2.l) objQ3;
                        o0VarE.g0(false);
                    } else {
                        aVar2 = aVar;
                        o0VarE.C(356914239);
                        o0VarE.g0(false);
                        lVar4 = null;
                    }
                    q.b bVar3 = (q.b) o0VarE.A(t1.f91493k);
                    int i59 = (i35 & 14) | ((i35 >> 3) & 112);
                    executor = (Executor) o0VarE.A(a0.f108336a);
                    if (executor == null) {
                        i48 = i46;
                        z19 = false;
                        o0VarE.C(1250991751);
                    } else {
                        i48 = i46;
                        z19 = false;
                        o0VarE.C(1250991751);
                    }
                    o0VarE.g0(z19);
                    x1 x1Var6 = n.f135158a;
                    if (lVar4 != null) {
                        z24 = z18;
                        i49 = i48;
                        i54 = i47;
                        o0VarE.C(357232113);
                        th3 = null;
                        o0Var = o0VarE;
                        j0 j0Var7 = j0Var3;
                        lVar5 = lVar3;
                        r rVarE4 = e(rVar, new c(str, null, 2, null), x0Var, lVar5, i54, z24, i15, i49, (q.b) o0VarE.A(t1.f91493k), null, null, lVar4, j0Var7, null, l2Var3);
                        j0Var3 = j0Var7;
                        o0Var.g0(false);
                        rVarThen = rVarE4;
                    } else {
                        z24 = z18;
                        i49 = i48;
                        i54 = i47;
                        o0VarE.C(357232113);
                        th3 = null;
                        o0Var = o0VarE;
                        j0 j0Var8 = j0Var3;
                        lVar5 = lVar3;
                        r rVarE5 = e(rVar, new c(str, null, 2, null), x0Var, lVar5, i54, z24, i15, i49, (q.b) o0VarE.A(t1.f91493k), null, null, lVar4, j0Var8, null, l2Var3);
                        j0Var3 = j0Var8;
                        o0Var.g0(false);
                        rVarThen = rVarE5;
                    }
                    k1Var = k1.f108614a;
                    iHashCode = Long.hashCode(o0Var.U);
                    rVarC = h4.k.c(rVarThen, o0Var);
                    i2VarA0 = o0Var.a0();
                    g.V.getClass();
                    aVar3 = g.a.f81805b;
                    if (o0Var.f135177b != null) {
                        p0.l();
                        throw th3;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar3);
                    } else {
                        o0Var.c();
                    }
                    b4.c(g.a.f81810g, k1Var, o0Var);
                    b4.c(g.a.f81809f, i2VarA0, o0Var);
                    b4.b(g.a.f81814k, o0Var);
                    b4.c(g.a.f81807d, rVarC, o0Var);
                    b4.a(o0Var, Integer.valueOf(iHashCode), g.a.f81813j);
                    o0Var.g0(true);
                    z17 = z24;
                    j0Var2 = j0Var3;
                    l2Var2 = l2Var3;
                    i45 = i54;
                    i44 = i49;
                    lVar2 = lVar5;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    boolean z29 = z15;
                    i44 = i30;
                    z17 = z29;
                    lVar2 = lVar;
                    j0Var2 = j0Var;
                    l2Var2 = l2Var;
                    i45 = i25;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: l2.x
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            y.b(str, rVar, x0Var, lVar2, i45, z17, i15, i44, j0Var2, l2Var2, (m) obj, p0.t(i17 | 1), i18);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i35 |= 100663296;
            i38 = i18 & 512;
            i39 = C.ENCODING_PCM_32BIT;
            if (i38 == 0) {
                i35 |= i39;
            } else if ((i17 & C.ENCODING_PCM_32BIT) == 0) {
                if ((i17 & 1073741824) == 0) {
                    zR = o0VarE.B(l2Var);
                } else {
                    zR = o0VarE.r(l2Var);
                }
                if (zR) {
                    i39 = 536870912;
                } else {
                    i39 = 268435456;
                }
                i35 |= i39;
            }
            if ((i35 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i35 & 1, z16)) {
                if (i56 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                if (i24 != 0) {
                    d6.p.f57793b.getClass();
                    i25 = d6.p.f57794c;
                }
                if (i27 != 0) {
                    z15 = true;
                }
                if (i29 != 0) {
                    i46 = 1;
                } else {
                    i46 = i30;
                }
                z18 = z15;
                if (i36 != 0) {
                    j0Var3 = null;
                } else {
                    j0Var3 = j0Var;
                }
                i47 = i25;
                if (i38 != 0) {
                    l2Var3 = null;
                } else {
                    l2Var3 = l2Var;
                }
                x1 x1Var7 = n.f135158a;
                o1.a(i46, i15);
                q1Var = (q1) o0VarE.A(s1.f201786a);
                aVar = m.f135153a;
                if (q1Var != null) {
                    o0VarE.C(356423075);
                    j8 = ((t2) o0VarE.A(u2.f201804a)).f201803b;
                    Object[] objArr4 = {q1Var};
                    h hVar4 = new h(q1Var, 11);
                    kn1.m mVar5 = new kn1.m(21);
                    d4.l lVar12 = d4.m.f57455a;
                    d4.l lVar13 = new d4.l(hVar4, mVar5);
                    zR2 = o0VarE.r(q1Var);
                    objQ2 = o0VarE.q();
                    if (zR2) {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new s(q1Var, 1);
                            o0VarE.K(objQ2);
                        }
                    } else {
                        objQ2 = new s(q1Var, 1);
                        o0VarE.K(objQ2);
                    }
                    aVar2 = aVar;
                    jLongValue = ((Number) a.c(objArr4, lVar13, (e23.a) objQ2, o0VarE, 0)).longValue();
                    zL = o0VarE.l(jLongValue) | o0VarE.B(q1Var) | o0VarE.l(j8);
                    objQ3 = o0VarE.q();
                    if (zL) {
                        aVar2.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                            o0VarE.K(objQ3);
                        }
                    } else {
                        objQ3 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                        o0VarE.K(objQ3);
                    }
                    lVar4 = (y2.l) objQ3;
                    o0VarE.g0(false);
                } else {
                    aVar2 = aVar;
                    o0VarE.C(356914239);
                    o0VarE.g0(false);
                    lVar4 = null;
                }
                q.b bVar4 = (q.b) o0VarE.A(t1.f91493k);
                int i510 = (i35 & 14) | ((i35 >> 3) & 112);
                executor = (Executor) o0VarE.A(a0.f108336a);
                if (executor == null) {
                    i48 = i46;
                    z19 = false;
                    o0VarE.C(1250991751);
                } else {
                    i48 = i46;
                    z19 = false;
                    o0VarE.C(1250991751);
                }
                o0VarE.g0(z19);
                x1 x1Var8 = n.f135158a;
                if (lVar4 != null) {
                    z24 = z18;
                    i49 = i48;
                    i54 = i47;
                    o0VarE.C(357232113);
                    th3 = null;
                    o0Var = o0VarE;
                    j0 j0Var9 = j0Var3;
                    lVar5 = lVar3;
                    r rVarE6 = e(rVar, new c(str, null, 2, null), x0Var, lVar5, i54, z24, i15, i49, (q.b) o0VarE.A(t1.f91493k), null, null, lVar4, j0Var9, null, l2Var3);
                    j0Var3 = j0Var9;
                    o0Var.g0(false);
                    rVarThen = rVarE6;
                } else {
                    z24 = z18;
                    i49 = i48;
                    i54 = i47;
                    o0VarE.C(357232113);
                    th3 = null;
                    o0Var = o0VarE;
                    j0 j0Var10 = j0Var3;
                    lVar5 = lVar3;
                    r rVarE7 = e(rVar, new c(str, null, 2, null), x0Var, lVar5, i54, z24, i15, i49, (q.b) o0VarE.A(t1.f91493k), null, null, lVar4, j0Var10, null, l2Var3);
                    j0Var3 = j0Var10;
                    o0Var.g0(false);
                    rVarThen = rVarE7;
                }
                k1Var = k1.f108614a;
                iHashCode = Long.hashCode(o0Var.U);
                rVarC = h4.k.c(rVarThen, o0Var);
                i2VarA0 = o0Var.a0();
                g.V.getClass();
                aVar3 = g.a.f81805b;
                if (o0Var.f135177b != null) {
                    p0.l();
                    throw th3;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar3);
                } else {
                    o0Var.c();
                }
                b4.c(g.a.f81810g, k1Var, o0Var);
                b4.c(g.a.f81809f, i2VarA0, o0Var);
                b4.b(g.a.f81814k, o0Var);
                b4.c(g.a.f81807d, rVarC, o0Var);
                b4.a(o0Var, Integer.valueOf(iHashCode), g.a.f81813j);
                o0Var.g0(true);
                z17 = z24;
                j0Var2 = j0Var3;
                l2Var2 = l2Var3;
                i45 = i54;
                i44 = i49;
                lVar2 = lVar5;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                boolean z210 = z15;
                i44 = i30;
                z17 = z210;
                lVar2 = lVar;
                j0Var2 = j0Var;
                l2Var2 = l2Var;
                i45 = i25;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l2.x
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        y.b(str, rVar, x0Var, lVar2, i45, z17, i15, i44, j0Var2, l2Var2, (m) obj, p0.t(i17 | 1), i18);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i19 |= 3072;
        i24 = i18 & 16;
        if (i24 != 0) {
            if ((i17 & 24576) == 0) {
                i25 = i14;
                if (o0VarE.k(i25)) {
                    i26 = 16384;
                } else {
                    i26 = 8192;
                }
                i19 |= i26;
            }
            i27 = i18 & 32;
            if (i27 != 0) {
                i19 |= 196608;
                z15 = z14;
            } else {
                z15 = z14;
                if ((i17 & 196608) == 0) {
                    if (o0VarE.h(z15)) {
                        i28 = 131072;
                    } else {
                        i28 = 65536;
                    }
                    i19 |= i28;
                }
            }
            if ((i17 & 1572864) == 0) {
                if (o0VarE.k(i15)) {
                    i55 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i55 = 524288;
                }
                i19 |= i55;
            }
            i29 = i18 & 128;
            if (i29 != 0) {
                i19 |= 12582912;
                i30 = i16;
            } else {
                i30 = i16;
                if ((i17 & 12582912) == 0) {
                    if (o0VarE.k(i30)) {
                        i34 = 8388608;
                    } else {
                        i34 = 4194304;
                    }
                    i19 |= i34;
                }
            }
            i35 = i19;
            i36 = i18 & 256;
            if (i36 != 0) {
                if ((i17 & 100663296) == 0) {
                    if (o0VarE.r(j0Var)) {
                        i37 = 67108864;
                    } else {
                        i37 = 33554432;
                    }
                    i35 |= i37;
                }
                i38 = i18 & 512;
                i39 = C.ENCODING_PCM_32BIT;
                if (i38 == 0) {
                    i35 |= i39;
                } else if ((i17 & C.ENCODING_PCM_32BIT) == 0) {
                    if ((i17 & 1073741824) == 0) {
                        zR = o0VarE.B(l2Var);
                    } else {
                        zR = o0VarE.r(l2Var);
                    }
                    if (zR) {
                        i39 = 536870912;
                    } else {
                        i39 = 268435456;
                    }
                    i35 |= i39;
                }
                if ((i35 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i35 & 1, z16)) {
                    if (i56 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    if (i24 != 0) {
                        d6.p.f57793b.getClass();
                        i25 = d6.p.f57794c;
                    }
                    if (i27 != 0) {
                        z15 = true;
                    }
                    if (i29 != 0) {
                        i46 = 1;
                    } else {
                        i46 = i30;
                    }
                    z18 = z15;
                    if (i36 != 0) {
                        j0Var3 = null;
                    } else {
                        j0Var3 = j0Var;
                    }
                    i47 = i25;
                    if (i38 != 0) {
                        l2Var3 = null;
                    } else {
                        l2Var3 = l2Var;
                    }
                    x1 x1Var9 = n.f135158a;
                    o1.a(i46, i15);
                    q1Var = (q1) o0VarE.A(s1.f201786a);
                    aVar = m.f135153a;
                    if (q1Var != null) {
                        o0VarE.C(356423075);
                        j8 = ((t2) o0VarE.A(u2.f201804a)).f201803b;
                        Object[] objArr5 = {q1Var};
                        h hVar5 = new h(q1Var, 11);
                        kn1.m mVar6 = new kn1.m(21);
                        d4.l lVar14 = d4.m.f57455a;
                        d4.l lVar15 = new d4.l(hVar5, mVar6);
                        zR2 = o0VarE.r(q1Var);
                        objQ2 = o0VarE.q();
                        if (zR2) {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new s(q1Var, 1);
                                o0VarE.K(objQ2);
                            }
                        } else {
                            objQ2 = new s(q1Var, 1);
                            o0VarE.K(objQ2);
                        }
                        aVar2 = aVar;
                        jLongValue = ((Number) a.c(objArr5, lVar15, (e23.a) objQ2, o0VarE, 0)).longValue();
                        zL = o0VarE.l(jLongValue) | o0VarE.B(q1Var) | o0VarE.l(j8);
                        objQ3 = o0VarE.q();
                        if (zL) {
                            aVar2.getClass();
                            if (objQ3 == m.a.f135155b) {
                                objQ3 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                                o0VarE.K(objQ3);
                            }
                        } else {
                            objQ3 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                            o0VarE.K(objQ3);
                        }
                        lVar4 = (y2.l) objQ3;
                        o0VarE.g0(false);
                    } else {
                        aVar2 = aVar;
                        o0VarE.C(356914239);
                        o0VarE.g0(false);
                        lVar4 = null;
                    }
                    q.b bVar5 = (q.b) o0VarE.A(t1.f91493k);
                    int i511 = (i35 & 14) | ((i35 >> 3) & 112);
                    executor = (Executor) o0VarE.A(a0.f108336a);
                    if (executor == null) {
                        i48 = i46;
                        z19 = false;
                        o0VarE.C(1250991751);
                    } else {
                        i48 = i46;
                        z19 = false;
                        o0VarE.C(1250991751);
                    }
                    o0VarE.g0(z19);
                    x1 x1Var10 = n.f135158a;
                    if (lVar4 != null) {
                        z24 = z18;
                        i49 = i48;
                        i54 = i47;
                        o0VarE.C(357232113);
                        th3 = null;
                        o0Var = o0VarE;
                        j0 j0Var11 = j0Var3;
                        lVar5 = lVar3;
                        r rVarE8 = e(rVar, new c(str, null, 2, null), x0Var, lVar5, i54, z24, i15, i49, (q.b) o0VarE.A(t1.f91493k), null, null, lVar4, j0Var11, null, l2Var3);
                        j0Var3 = j0Var11;
                        o0Var.g0(false);
                        rVarThen = rVarE8;
                    } else {
                        z24 = z18;
                        i49 = i48;
                        i54 = i47;
                        o0VarE.C(357232113);
                        th3 = null;
                        o0Var = o0VarE;
                        j0 j0Var12 = j0Var3;
                        lVar5 = lVar3;
                        r rVarE9 = e(rVar, new c(str, null, 2, null), x0Var, lVar5, i54, z24, i15, i49, (q.b) o0VarE.A(t1.f91493k), null, null, lVar4, j0Var12, null, l2Var3);
                        j0Var3 = j0Var12;
                        o0Var.g0(false);
                        rVarThen = rVarE9;
                    }
                    k1Var = k1.f108614a;
                    iHashCode = Long.hashCode(o0Var.U);
                    rVarC = h4.k.c(rVarThen, o0Var);
                    i2VarA0 = o0Var.a0();
                    g.V.getClass();
                    aVar3 = g.a.f81805b;
                    if (o0Var.f135177b != null) {
                        p0.l();
                        throw th3;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar3);
                    } else {
                        o0Var.c();
                    }
                    b4.c(g.a.f81810g, k1Var, o0Var);
                    b4.c(g.a.f81809f, i2VarA0, o0Var);
                    b4.b(g.a.f81814k, o0Var);
                    b4.c(g.a.f81807d, rVarC, o0Var);
                    b4.a(o0Var, Integer.valueOf(iHashCode), g.a.f81813j);
                    o0Var.g0(true);
                    z17 = z24;
                    j0Var2 = j0Var3;
                    l2Var2 = l2Var3;
                    i45 = i54;
                    i44 = i49;
                    lVar2 = lVar5;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    boolean z211 = z15;
                    i44 = i30;
                    z17 = z211;
                    lVar2 = lVar;
                    j0Var2 = j0Var;
                    l2Var2 = l2Var;
                    i45 = i25;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: l2.x
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            y.b(str, rVar, x0Var, lVar2, i45, z17, i15, i44, j0Var2, l2Var2, (m) obj, p0.t(i17 | 1), i18);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i35 |= 100663296;
            i38 = i18 & 512;
            i39 = C.ENCODING_PCM_32BIT;
            if (i38 == 0) {
                i35 |= i39;
            } else if ((i17 & C.ENCODING_PCM_32BIT) == 0) {
                if ((i17 & 1073741824) == 0) {
                    zR = o0VarE.B(l2Var);
                } else {
                    zR = o0VarE.r(l2Var);
                }
                if (zR) {
                    i39 = 536870912;
                } else {
                    i39 = 268435456;
                }
                i35 |= i39;
            }
            if ((i35 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i35 & 1, z16)) {
                if (i56 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                if (i24 != 0) {
                    d6.p.f57793b.getClass();
                    i25 = d6.p.f57794c;
                }
                if (i27 != 0) {
                    z15 = true;
                }
                if (i29 != 0) {
                    i46 = 1;
                } else {
                    i46 = i30;
                }
                z18 = z15;
                if (i36 != 0) {
                    j0Var3 = null;
                } else {
                    j0Var3 = j0Var;
                }
                i47 = i25;
                if (i38 != 0) {
                    l2Var3 = null;
                } else {
                    l2Var3 = l2Var;
                }
                x1 x1Var11 = n.f135158a;
                o1.a(i46, i15);
                q1Var = (q1) o0VarE.A(s1.f201786a);
                aVar = m.f135153a;
                if (q1Var != null) {
                    o0VarE.C(356423075);
                    j8 = ((t2) o0VarE.A(u2.f201804a)).f201803b;
                    Object[] objArr6 = {q1Var};
                    h hVar6 = new h(q1Var, 11);
                    kn1.m mVar7 = new kn1.m(21);
                    d4.l lVar16 = d4.m.f57455a;
                    d4.l lVar17 = new d4.l(hVar6, mVar7);
                    zR2 = o0VarE.r(q1Var);
                    objQ2 = o0VarE.q();
                    if (zR2) {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new s(q1Var, 1);
                            o0VarE.K(objQ2);
                        }
                    } else {
                        objQ2 = new s(q1Var, 1);
                        o0VarE.K(objQ2);
                    }
                    aVar2 = aVar;
                    jLongValue = ((Number) a.c(objArr6, lVar17, (e23.a) objQ2, o0VarE, 0)).longValue();
                    zL = o0VarE.l(jLongValue) | o0VarE.B(q1Var) | o0VarE.l(j8);
                    objQ3 = o0VarE.q();
                    if (zL) {
                        aVar2.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                            o0VarE.K(objQ3);
                        }
                    } else {
                        objQ3 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                        o0VarE.K(objQ3);
                    }
                    lVar4 = (y2.l) objQ3;
                    o0VarE.g0(false);
                } else {
                    aVar2 = aVar;
                    o0VarE.C(356914239);
                    o0VarE.g0(false);
                    lVar4 = null;
                }
                q.b bVar6 = (q.b) o0VarE.A(t1.f91493k);
                int i512 = (i35 & 14) | ((i35 >> 3) & 112);
                executor = (Executor) o0VarE.A(a0.f108336a);
                if (executor == null) {
                    i48 = i46;
                    z19 = false;
                    o0VarE.C(1250991751);
                } else {
                    i48 = i46;
                    z19 = false;
                    o0VarE.C(1250991751);
                }
                o0VarE.g0(z19);
                x1 x1Var12 = n.f135158a;
                if (lVar4 != null) {
                    z24 = z18;
                    i49 = i48;
                    i54 = i47;
                    o0VarE.C(357232113);
                    th3 = null;
                    o0Var = o0VarE;
                    j0 j0Var13 = j0Var3;
                    lVar5 = lVar3;
                    r rVarE10 = e(rVar, new c(str, null, 2, null), x0Var, lVar5, i54, z24, i15, i49, (q.b) o0VarE.A(t1.f91493k), null, null, lVar4, j0Var13, null, l2Var3);
                    j0Var3 = j0Var13;
                    o0Var.g0(false);
                    rVarThen = rVarE10;
                } else {
                    z24 = z18;
                    i49 = i48;
                    i54 = i47;
                    o0VarE.C(357232113);
                    th3 = null;
                    o0Var = o0VarE;
                    j0 j0Var14 = j0Var3;
                    lVar5 = lVar3;
                    r rVarE11 = e(rVar, new c(str, null, 2, null), x0Var, lVar5, i54, z24, i15, i49, (q.b) o0VarE.A(t1.f91493k), null, null, lVar4, j0Var14, null, l2Var3);
                    j0Var3 = j0Var14;
                    o0Var.g0(false);
                    rVarThen = rVarE11;
                }
                k1Var = k1.f108614a;
                iHashCode = Long.hashCode(o0Var.U);
                rVarC = h4.k.c(rVarThen, o0Var);
                i2VarA0 = o0Var.a0();
                g.V.getClass();
                aVar3 = g.a.f81805b;
                if (o0Var.f135177b != null) {
                    p0.l();
                    throw th3;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar3);
                } else {
                    o0Var.c();
                }
                b4.c(g.a.f81810g, k1Var, o0Var);
                b4.c(g.a.f81809f, i2VarA0, o0Var);
                b4.b(g.a.f81814k, o0Var);
                b4.c(g.a.f81807d, rVarC, o0Var);
                b4.a(o0Var, Integer.valueOf(iHashCode), g.a.f81813j);
                o0Var.g0(true);
                z17 = z24;
                j0Var2 = j0Var3;
                l2Var2 = l2Var3;
                i45 = i54;
                i44 = i49;
                lVar2 = lVar5;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                boolean z212 = z15;
                i44 = i30;
                z17 = z212;
                lVar2 = lVar;
                j0Var2 = j0Var;
                l2Var2 = l2Var;
                i45 = i25;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l2.x
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        y.b(str, rVar, x0Var, lVar2, i45, z17, i15, i44, j0Var2, l2Var2, (m) obj, p0.t(i17 | 1), i18);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i19 |= 24576;
        i25 = i14;
        i27 = i18 & 32;
        if (i27 != 0) {
            i19 |= 196608;
            z15 = z14;
        } else {
            z15 = z14;
            if ((i17 & 196608) == 0) {
                if (o0VarE.h(z15)) {
                    i28 = 131072;
                } else {
                    i28 = 65536;
                }
                i19 |= i28;
            }
        }
        if ((i17 & 1572864) == 0) {
            if (o0VarE.k(i15)) {
                i55 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i55 = 524288;
            }
            i19 |= i55;
        }
        i29 = i18 & 128;
        if (i29 != 0) {
            i19 |= 12582912;
            i30 = i16;
        } else {
            i30 = i16;
            if ((i17 & 12582912) == 0) {
                if (o0VarE.k(i30)) {
                    i34 = 8388608;
                } else {
                    i34 = 4194304;
                }
                i19 |= i34;
            }
        }
        i35 = i19;
        i36 = i18 & 256;
        if (i36 != 0) {
            if ((i17 & 100663296) == 0) {
                if (o0VarE.r(j0Var)) {
                    i37 = 67108864;
                } else {
                    i37 = 33554432;
                }
                i35 |= i37;
            }
            i38 = i18 & 512;
            i39 = C.ENCODING_PCM_32BIT;
            if (i38 == 0) {
                i35 |= i39;
            } else if ((i17 & C.ENCODING_PCM_32BIT) == 0) {
                if ((i17 & 1073741824) == 0) {
                    zR = o0VarE.B(l2Var);
                } else {
                    zR = o0VarE.r(l2Var);
                }
                if (zR) {
                    i39 = 536870912;
                } else {
                    i39 = 268435456;
                }
                i35 |= i39;
            }
            if ((i35 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i35 & 1, z16)) {
                if (i56 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                if (i24 != 0) {
                    d6.p.f57793b.getClass();
                    i25 = d6.p.f57794c;
                }
                if (i27 != 0) {
                    z15 = true;
                }
                if (i29 != 0) {
                    i46 = 1;
                } else {
                    i46 = i30;
                }
                z18 = z15;
                if (i36 != 0) {
                    j0Var3 = null;
                } else {
                    j0Var3 = j0Var;
                }
                i47 = i25;
                if (i38 != 0) {
                    l2Var3 = null;
                } else {
                    l2Var3 = l2Var;
                }
                x1 x1Var13 = n.f135158a;
                o1.a(i46, i15);
                q1Var = (q1) o0VarE.A(s1.f201786a);
                aVar = m.f135153a;
                if (q1Var != null) {
                    o0VarE.C(356423075);
                    j8 = ((t2) o0VarE.A(u2.f201804a)).f201803b;
                    Object[] objArr7 = {q1Var};
                    h hVar7 = new h(q1Var, 11);
                    kn1.m mVar8 = new kn1.m(21);
                    d4.l lVar18 = d4.m.f57455a;
                    d4.l lVar19 = new d4.l(hVar7, mVar8);
                    zR2 = o0VarE.r(q1Var);
                    objQ2 = o0VarE.q();
                    if (zR2) {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new s(q1Var, 1);
                            o0VarE.K(objQ2);
                        }
                    } else {
                        objQ2 = new s(q1Var, 1);
                        o0VarE.K(objQ2);
                    }
                    aVar2 = aVar;
                    jLongValue = ((Number) a.c(objArr7, lVar19, (e23.a) objQ2, o0VarE, 0)).longValue();
                    zL = o0VarE.l(jLongValue) | o0VarE.B(q1Var) | o0VarE.l(j8);
                    objQ3 = o0VarE.q();
                    if (zL) {
                        aVar2.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                            o0VarE.K(objQ3);
                        }
                    } else {
                        objQ3 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                        o0VarE.K(objQ3);
                    }
                    lVar4 = (y2.l) objQ3;
                    o0VarE.g0(false);
                } else {
                    aVar2 = aVar;
                    o0VarE.C(356914239);
                    o0VarE.g0(false);
                    lVar4 = null;
                }
                q.b bVar7 = (q.b) o0VarE.A(t1.f91493k);
                int i513 = (i35 & 14) | ((i35 >> 3) & 112);
                executor = (Executor) o0VarE.A(a0.f108336a);
                if (executor == null) {
                    i48 = i46;
                    z19 = false;
                    o0VarE.C(1250991751);
                } else {
                    i48 = i46;
                    z19 = false;
                    o0VarE.C(1250991751);
                }
                o0VarE.g0(z19);
                x1 x1Var14 = n.f135158a;
                if (lVar4 != null) {
                    z24 = z18;
                    i49 = i48;
                    i54 = i47;
                    o0VarE.C(357232113);
                    th3 = null;
                    o0Var = o0VarE;
                    j0 j0Var15 = j0Var3;
                    lVar5 = lVar3;
                    r rVarE12 = e(rVar, new c(str, null, 2, null), x0Var, lVar5, i54, z24, i15, i49, (q.b) o0VarE.A(t1.f91493k), null, null, lVar4, j0Var15, null, l2Var3);
                    j0Var3 = j0Var15;
                    o0Var.g0(false);
                    rVarThen = rVarE12;
                } else {
                    z24 = z18;
                    i49 = i48;
                    i54 = i47;
                    o0VarE.C(357232113);
                    th3 = null;
                    o0Var = o0VarE;
                    j0 j0Var16 = j0Var3;
                    lVar5 = lVar3;
                    r rVarE13 = e(rVar, new c(str, null, 2, null), x0Var, lVar5, i54, z24, i15, i49, (q.b) o0VarE.A(t1.f91493k), null, null, lVar4, j0Var16, null, l2Var3);
                    j0Var3 = j0Var16;
                    o0Var.g0(false);
                    rVarThen = rVarE13;
                }
                k1Var = k1.f108614a;
                iHashCode = Long.hashCode(o0Var.U);
                rVarC = h4.k.c(rVarThen, o0Var);
                i2VarA0 = o0Var.a0();
                g.V.getClass();
                aVar3 = g.a.f81805b;
                if (o0Var.f135177b != null) {
                    p0.l();
                    throw th3;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar3);
                } else {
                    o0Var.c();
                }
                b4.c(g.a.f81810g, k1Var, o0Var);
                b4.c(g.a.f81809f, i2VarA0, o0Var);
                b4.b(g.a.f81814k, o0Var);
                b4.c(g.a.f81807d, rVarC, o0Var);
                b4.a(o0Var, Integer.valueOf(iHashCode), g.a.f81813j);
                o0Var.g0(true);
                z17 = z24;
                j0Var2 = j0Var3;
                l2Var2 = l2Var3;
                i45 = i54;
                i44 = i49;
                lVar2 = lVar5;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                boolean z213 = z15;
                i44 = i30;
                z17 = z213;
                lVar2 = lVar;
                j0Var2 = j0Var;
                l2Var2 = l2Var;
                i45 = i25;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l2.x
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        y.b(str, rVar, x0Var, lVar2, i45, z17, i15, i44, j0Var2, l2Var2, (m) obj, p0.t(i17 | 1), i18);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i35 |= 100663296;
        i38 = i18 & 512;
        i39 = C.ENCODING_PCM_32BIT;
        if (i38 == 0) {
            i35 |= i39;
        } else if ((i17 & C.ENCODING_PCM_32BIT) == 0) {
            if ((i17 & 1073741824) == 0) {
                zR = o0VarE.B(l2Var);
            } else {
                zR = o0VarE.r(l2Var);
            }
            if (zR) {
                i39 = 536870912;
            } else {
                i39 = 268435456;
            }
            i35 |= i39;
        }
        if ((i35 & 306783379) != 306783378) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i35 & 1, z16)) {
            if (i56 != 0) {
                lVar3 = null;
            } else {
                lVar3 = lVar;
            }
            if (i24 != 0) {
                d6.p.f57793b.getClass();
                i25 = d6.p.f57794c;
            }
            if (i27 != 0) {
                z15 = true;
            }
            if (i29 != 0) {
                i46 = 1;
            } else {
                i46 = i30;
            }
            z18 = z15;
            if (i36 != 0) {
                j0Var3 = null;
            } else {
                j0Var3 = j0Var;
            }
            i47 = i25;
            if (i38 != 0) {
                l2Var3 = null;
            } else {
                l2Var3 = l2Var;
            }
            x1 x1Var15 = n.f135158a;
            o1.a(i46, i15);
            q1Var = (q1) o0VarE.A(s1.f201786a);
            aVar = m.f135153a;
            if (q1Var != null) {
                o0VarE.C(356423075);
                j8 = ((t2) o0VarE.A(u2.f201804a)).f201803b;
                Object[] objArr8 = {q1Var};
                h hVar8 = new h(q1Var, 11);
                kn1.m mVar9 = new kn1.m(21);
                d4.l lVar110 = d4.m.f57455a;
                d4.l lVar111 = new d4.l(hVar8, mVar9);
                zR2 = o0VarE.r(q1Var);
                objQ2 = o0VarE.q();
                if (zR2) {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new s(q1Var, 1);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new s(q1Var, 1);
                    o0VarE.K(objQ2);
                }
                aVar2 = aVar;
                jLongValue = ((Number) a.c(objArr8, lVar111, (e23.a) objQ2, o0VarE, 0)).longValue();
                zL = o0VarE.l(jLongValue) | o0VarE.B(q1Var) | o0VarE.l(j8);
                objQ3 = o0VarE.q();
                if (zL) {
                    aVar2.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                        o0VarE.K(objQ3);
                    }
                } else {
                    objQ3 = new y2.l(jLongValue, q1Var, j8, null, 8, null);
                    o0VarE.K(objQ3);
                }
                lVar4 = (y2.l) objQ3;
                o0VarE.g0(false);
            } else {
                aVar2 = aVar;
                o0VarE.C(356914239);
                o0VarE.g0(false);
                lVar4 = null;
            }
            q.b bVar8 = (q.b) o0VarE.A(t1.f91493k);
            int i514 = (i35 & 14) | ((i35 >> 3) & 112);
            executor = (Executor) o0VarE.A(a0.f108336a);
            if (executor == null) {
                i48 = i46;
                z19 = false;
                o0VarE.C(1250991751);
            } else {
                i48 = i46;
                z19 = false;
                o0VarE.C(1250991751);
            }
            o0VarE.g0(z19);
            x1 x1Var16 = n.f135158a;
            if (lVar4 != null) {
                z24 = z18;
                i49 = i48;
                i54 = i47;
                o0VarE.C(357232113);
                th3 = null;
                o0Var = o0VarE;
                j0 j0Var17 = j0Var3;
                lVar5 = lVar3;
                r rVarE14 = e(rVar, new c(str, null, 2, null), x0Var, lVar5, i54, z24, i15, i49, (q.b) o0VarE.A(t1.f91493k), null, null, lVar4, j0Var17, null, l2Var3);
                j0Var3 = j0Var17;
                o0Var.g0(false);
                rVarThen = rVarE14;
            } else {
                z24 = z18;
                i49 = i48;
                i54 = i47;
                o0VarE.C(357232113);
                th3 = null;
                o0Var = o0VarE;
                j0 j0Var18 = j0Var3;
                lVar5 = lVar3;
                r rVarE15 = e(rVar, new c(str, null, 2, null), x0Var, lVar5, i54, z24, i15, i49, (q.b) o0VarE.A(t1.f91493k), null, null, lVar4, j0Var18, null, l2Var3);
                j0Var3 = j0Var18;
                o0Var.g0(false);
                rVarThen = rVarE15;
            }
            k1Var = k1.f108614a;
            iHashCode = Long.hashCode(o0Var.U);
            rVarC = h4.k.c(rVarThen, o0Var);
            i2VarA0 = o0Var.a0();
            g.V.getClass();
            aVar3 = g.a.f81805b;
            if (o0Var.f135177b != null) {
                p0.l();
                throw th3;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar3);
            } else {
                o0Var.c();
            }
            b4.c(g.a.f81810g, k1Var, o0Var);
            b4.c(g.a.f81809f, i2VarA0, o0Var);
            b4.b(g.a.f81814k, o0Var);
            b4.c(g.a.f81807d, rVarC, o0Var);
            b4.a(o0Var, Integer.valueOf(iHashCode), g.a.f81813j);
            o0Var.g0(true);
            z17 = z24;
            j0Var2 = j0Var3;
            l2Var2 = l2Var3;
            i45 = i54;
            i44 = i49;
            lVar2 = lVar5;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            boolean z214 = z15;
            i44 = i30;
            z17 = z214;
            lVar2 = lVar;
            j0Var2 = j0Var;
            l2Var2 = l2Var;
            i45 = i25;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: l2.x
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    y.b(str, rVar, x0Var, lVar2, i45, z17, i15, i44, j0Var2, l2Var2, (m) obj, p0.t(i17 | 1), i18);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0182  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:154:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:160:0x0211  */
    /* JADX WARN: Code duplicated, block: B:183:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:196:0x0330  */
    /* JADX WARN: Code duplicated, block: B:203:0x0375  */
    /* JADX WARN: Code duplicated, block: B:209:0x039f  */
    /* JADX WARN: Code duplicated, block: B:214:0x03ba  */
    public static final void c(final r rVar, final c cVar, final l lVar, final boolean z14, final Map map, final x0 x0Var, final int i14, final boolean z15, final int i15, final int i16, final q.b bVar, final y2.l lVar2, final l lVar3, final l2 l2Var, m mVar, final int i17, final int i18) {
        int i19;
        int i24;
        j3 j3Var;
        Object obj;
        e23.a aVar;
        int i25;
        p<List<c.d<s5.y>>, List<c.d<e23.q<String, m, Integer, Unit>>>> pVar;
        Object obj2;
        p1 p1Var;
        l lVar4;
        boolean z16;
        Object obj3;
        Object obj4;
        Object obj5;
        Object m3Var;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Map map2 = map;
        o0 o0VarE = mVar.E(-2118572703);
        if ((i17 & 6) == 0) {
            i19 = (o0VarE.B(rVar) ? 4 : 2) | i17;
        } else {
            i19 = i17;
        }
        if ((i17 & 48) == 0) {
            i19 |= o0VarE.B(cVar) ? 32 : 16;
        }
        if ((i17 & 384) == 0) {
            i19 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i17 & 3072) == 0) {
            i19 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i17 & 24576) == 0) {
            i19 |= o0VarE.r(map2) ? 16384 : 8192;
        }
        if ((196608 & i17) == 0) {
            i19 |= o0VarE.B(x0Var) ? 131072 : 65536;
        }
        if ((i17 & 1572864) == 0) {
            i19 |= o0VarE.k(i14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i17 & 12582912) == 0) {
            i19 |= o0VarE.h(z15) ? 8388608 : 4194304;
        }
        if ((i17 & 100663296) == 0) {
            i19 |= o0VarE.k(i15) ? 67108864 : 33554432;
        }
        if ((i17 & C.ENCODING_PCM_32BIT) == 0) {
            i19 |= o0VarE.k(i16) ? 536870912 : 268435456;
        }
        if ((i18 & 6) == 0) {
            i24 = (o0VarE.r(bVar) ? 4 : 2) | i18;
        } else {
            i24 = i18;
        }
        if ((i18 & 48) == 0) {
            i24 |= o0VarE.r(lVar2) ? 32 : 16;
        }
        int i26 = i19;
        if ((i18 & 384) == 0) {
            i24 |= o0VarE.r(null) ? 256 : 128;
        }
        if ((i18 & 3072) == 0) {
            i24 |= o0VarE.r(lVar3) ? 2048 : 1024;
        }
        if ((i18 & 24576) == 0) {
            i24 |= (32768 & i18) == 0 ? o0VarE.B(l2Var) : o0VarE.r(l2Var) ? 16384 : 8192;
        }
        if (o0VarE.n(i26 & 1, ((i26 & 306783379) == 306783378 && (i24 & 9363) == 9362) ? false : true)) {
            x1 x1Var = n.f135158a;
            boolean zM = b0.m(cVar);
            m.a aVar2 = m.f135153a;
            if (zM) {
                o0VarE.C(145641571);
                boolean z17 = (i26 & 112) == 32;
                Object objQ = o0VarE.q();
                if (z17) {
                    obj10 = objQ;
                    Object j3Var2 = new j3(cVar);
                    o0VarE.K(j3Var2);
                    obj10 = j3Var2;
                } else {
                    aVar2.getClass();
                    if (objQ == m.a.f135155b) {
                        obj10 = objQ;
                        Object j3Var3 = new j3(cVar);
                        o0VarE.K(j3Var3);
                        obj10 = j3Var3;
                    }
                }
                obj10 = objQ;
                o0VarE.g0(false);
                j3Var = (j3) obj10;
            } else {
                o0VarE.C(145707228);
                o0VarE.g0(false);
                j3Var = null;
            }
            if (b0.m(cVar)) {
                o0VarE.C(145905443);
                boolean zB = ((i26 & 112) == 32) | o0VarE.B(j3Var);
                Object objQ2 = o0VarE.q();
                if (zB) {
                    obj9 = objQ2;
                    Object hVar = new k11.h(22, j3Var, cVar);
                    o0VarE.K(hVar);
                    obj9 = hVar;
                } else {
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        obj9 = objQ2;
                        Object hVar2 = new k11.h(22, j3Var, cVar);
                        o0VarE.K(hVar2);
                        obj9 = hVar2;
                    }
                }
                obj9 = objQ2;
                aVar = (e23.a) obj9;
                i25 = 0;
                o0VarE.g0(false);
            } else {
                o0VarE.C(146002721);
                boolean z18 = (i26 & 112) == 32;
                Object objQ3 = o0VarE.q();
                if (z18) {
                    obj = objQ3;
                    Object eVar = new e(cVar, 29);
                    o0VarE.K(eVar);
                    obj = eVar;
                } else {
                    aVar2.getClass();
                    if (objQ3 == m.a.f135155b) {
                        obj = objQ3;
                        Object eVar2 = new e(cVar, 29);
                        o0VarE.K(eVar2);
                        obj = eVar2;
                    }
                }
                obj = objQ3;
                aVar = (e23.a) obj;
                i25 = 0;
                o0VarE.g0(false);
            }
            e23.a aVar3 = aVar;
            if (z14) {
                if (map2 != null) {
                    p<List<c.d<s5.y>>, List<c.d<e23.q<String, m, Integer, Unit>>>> pVar2 = c.f108419a;
                    if (map2.isEmpty()) {
                        pVar = c.f108419a;
                    } else {
                        List listB = cVar.b(i25, cVar.f157138b.length(), "androidx.compose.foundation.text.inlineContent");
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size = listB.size();
                        int i27 = 0;
                        while (i27 < size) {
                            int i28 = size;
                            c.d dVar = (c.d) listB.get(i27);
                            List list = listB;
                            Object obj11 = dVar.f157149a;
                            int i29 = i27;
                            int i30 = dVar.f157151c;
                            int i34 = dVar.f157150b;
                            q1 q1Var = (q1) map2.get(obj11);
                            if (q1Var != null) {
                                arrayList.add(new c.d(q1Var.f108739a, i34, i30));
                                arrayList2.add(new c.d(q1Var.f108740b, i34, i30));
                            }
                            i27 = i29 + 1;
                            map2 = map;
                            listB = list;
                            size = i28;
                        }
                        pVar = new p<>(arrayList, arrayList2);
                    }
                } else {
                    pVar = c.f108419a;
                }
                obj2 = null;
            } else {
                i24 = i24;
                obj2 = null;
                pVar = new p<>(null, null);
            }
            List<c.d<s5.y>> list2 = pVar.f128594a;
            List<c.d<e23.q<String, m, Integer, Unit>>> list3 = pVar.f128595b;
            if (z14) {
                Object objH = q2.h(o0VarE, 146318828, aVar2);
                if (objH == m.a.f135155b) {
                    obj8 = objH;
                    Object objN = p0.n(obj2);
                    o0VarE.K(objN);
                    obj8 = objN;
                }
                obj8 = objH;
                o0VarE.g0(false);
                p1Var = (p1) obj8;
            } else {
                o0VarE.C(146406588);
                o0VarE.g0(false);
                p1Var = null;
            }
            if (z14) {
                o0VarE.C(146499837);
                boolean zB2 = o0VarE.B(p1Var);
                Object objQ4 = o0VarE.q();
                if (zB2) {
                    obj7 = objQ4;
                    Object kVar = new k(p1Var, 7);
                    o0VarE.K(kVar);
                    obj7 = kVar;
                } else {
                    aVar2.getClass();
                    if (objQ4 == m.a.f135155b) {
                        obj7 = objQ4;
                        Object kVar2 = new k(p1Var, 7);
                        o0VarE.K(kVar2);
                        obj7 = kVar2;
                    }
                }
                obj7 = objQ4;
                o0VarE.g0(false);
                lVar4 = (l) obj7;
            } else {
                o0VarE.C(146571260);
                o0VarE.g0(false);
                lVar4 = null;
            }
            int i35 = (i26 >> 3) & 14;
            a0.a(cVar, x0Var, bVar, list2, o0VarE, ((i26 >> 12) & 112) | i35 | ((i24 << 6) & 896));
            c cVar2 = (c) aVar3.invoke();
            boolean zR = o0VarE.r(j3Var) | ((i26 & 896) == 256);
            Object objQ5 = o0VarE.q();
            if (zR) {
                z16 = false;
                Object tVar = new t(j3Var, lVar, 0);
                o0VarE.K(tVar);
                obj3 = tVar;
            } else {
                aVar2.getClass();
                if (objQ5 == m.a.f135155b) {
                    z16 = false;
                    Object tVar2 = new t(j3Var, lVar, 0);
                    o0VarE.K(tVar2);
                    obj3 = tVar2;
                } else {
                    z16 = false;
                    obj3 = objQ5;
                }
            }
            l lVar5 = (l) obj3;
            int i36 = 1;
            boolean z19 = z16;
            p1 p1Var2 = p1Var;
            j3 j3Var4 = j3Var;
            r rVarE = e(rVar, cVar2, x0Var, lVar5, i14, z15, i15, i16, bVar, list2, lVar4, lVar2, null, lVar3, l2Var);
            if (z14) {
                o0VarE.C(147927697);
                boolean zR2 = o0VarE.r(j3Var4);
                Object objQ6 = o0VarE.q();
                if (zR2) {
                    obj4 = objQ6;
                    Object uVar = new u(j3Var4, i36);
                    o0VarE.K(uVar);
                    obj4 = uVar;
                } else {
                    aVar2.getClass();
                    if (objQ6 == m.a.f135155b) {
                        obj4 = objQ6;
                        Object uVar2 = new u(j3Var4, i36);
                        o0VarE.K(uVar2);
                        obj4 = uVar2;
                    }
                }
                obj4 = objQ6;
                e23.a aVar4 = (e23.a) obj4;
                boolean zB3 = o0VarE.B(p1Var2);
                Object objQ7 = o0VarE.q();
                if (zB3) {
                    obj5 = objQ7;
                    Object kVar3 = new kb0.k(p1Var2, 27);
                    o0VarE.K(kVar3);
                    obj5 = kVar3;
                } else {
                    aVar2.getClass();
                    if (objQ7 == m.a.f135155b) {
                        obj5 = objQ7;
                        Object kVar4 = new kb0.k(p1Var2, 27);
                        o0VarE.K(kVar4);
                        obj5 = kVar4;
                    }
                }
                obj5 = objQ7;
                m3Var = new m3(aVar4, (e23.a) obj5);
                o0VarE.g0(z19);
            } else {
                o0VarE.C(147750935);
                boolean zR3 = o0VarE.r(j3Var4);
                Object objQ8 = o0VarE.q();
                if (zR3) {
                    obj6 = objQ8;
                    Object uVar3 = new u(j3Var4, z19 ? 1 : 0);
                    o0VarE.K(uVar3);
                    obj6 = uVar3;
                } else {
                    aVar2.getClass();
                    if (objQ8 == m.a.f135155b) {
                        obj6 = objQ8;
                        Object uVar4 = new u(j3Var4, z19 ? 1 : 0);
                        o0VarE.K(uVar4);
                        obj6 = uVar4;
                    }
                }
                obj6 = objQ8;
                m3Var = new e2((e23.a) obj6);
                o0VarE.g0(z19);
            }
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarE, o0VarE);
            g.V.getClass();
            e0.a aVar5 = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, m3Var, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            b4.a(o0VarE, Integer.valueOf(iHashCode), g.a.f81813j);
            b4.b(g.a.f81814k, o0VarE);
            b4.c(g.a.f81807d, rVarC, o0VarE);
            if (j3Var4 == null) {
                o0VarE.C(-433557001);
                o0VarE.g0(z19);
            } else {
                o0VarE.C(-291080374);
                j3Var4.a(o0VarE, z19 ? 1 : 0);
                o0VarE.g0(z19);
                Unit unit = Unit.INSTANCE;
            }
            if (list3 == null) {
                o0VarE.C(-433506223);
            } else {
                o0VarE.C(-433506222);
                c.a(cVar, list3, o0VarE, i35);
                Unit unit2 = Unit.INSTANCE;
            }
            o0VarE.g0(z19);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: l2.v
                @Override // e23.p
                public final Object invoke(Object obj12, Object obj13) {
                    ((Integer) obj13).getClass();
                    int iT = p0.t(i17 | 1);
                    int iT2 = p0.t(i18);
                    y.c(rVar, cVar, lVar, z14, map, x0Var, i14, z15, i15, i16, bVar, lVar2, lVar3, l2Var, (m) obj12, iT, iT2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList d(List list, e23.a aVar) {
        o3 o3Var;
        if (!((Boolean) aVar.invoke()).booleanValue()) {
            return null;
        }
        new p3();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            y0 y0Var = (y0) list.get(i14);
            Object a14 = y0Var.getA();
            a14.getClass();
            hc0.c cVar = (hc0.c) ((q3) a14).f108743a;
            j3 j3Var = (j3) cVar.f83232b;
            c.d dVar = (c.d) cVar.f83233c;
            q0 q0Var = (q0) j3Var.f108587a.getF182175a();
            if (q0Var == null) {
                o3Var = new o3(0, 0, new b(14));
            } else {
                c.d dVarC = j3.c(dVar, q0Var);
                if (dVarC == null) {
                    o3Var = new o3(0, 0, new b(15));
                } else {
                    g6.l lVarF = d.F(q0Var.k(dVarC.f157150b, dVarC.f157151c).getBounds());
                    o3Var = new o3(lVarF.d(), lVarF.b(), new v0(lVarF, 2));
                }
            }
            g6.a.f75987b.getClass();
            int i15 = o3Var.f108692a;
            int i16 = o3Var.f108693b;
            arrayList.add(new p(y0Var.Q(g6.a.C1525a.b(i15, i15, i16, i16)), o3Var.f108694c));
        }
        return arrayList;
    }

    public static final r e(r rVar, c cVar, x0 x0Var, l<? super q0, Unit> lVar, int i14, boolean z14, int i15, int i16, q.b bVar, List<c.d<s5.y>> list, l<? super List<n4.d>, Unit> lVar2, y2.l lVar3, j0 j0Var, l<? super s.a, Unit> lVar4, l2 l2Var) {
        if (lVar3 == null) {
            return rVar.then(r.S).then(new y2.q(cVar, x0Var, bVar, lVar, i14, z14, i15, i16, list, lVar2, null, j0Var, l2Var, lVar4, null));
        }
        return rVar.then(lVar3.f194123f).then(new i(cVar, x0Var, bVar, lVar, i14, z14, i15, i16, list, lVar2, lVar3, j0Var, l2Var, null));
    }
}
