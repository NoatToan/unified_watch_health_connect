package t21;

import c2.n3;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.fe;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import l72.i3;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes9.dex */
public final class d1 {
    /* JADX WARN: Code duplicated, block: B:100:0x0139  */
    /* JADX WARN: Code duplicated, block: B:101:0x013c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0143  */
    /* JADX WARN: Code duplicated, block: B:107:0x014b  */
    /* JADX WARN: Code duplicated, block: B:108:0x014e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0153  */
    /* JADX WARN: Code duplicated, block: B:113:0x015b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0162  */
    /* JADX WARN: Code duplicated, block: B:117:0x0166  */
    /* JADX WARN: Code duplicated, block: B:119:0x0170  */
    /* JADX WARN: Code duplicated, block: B:120:0x0173  */
    /* JADX WARN: Code duplicated, block: B:122:0x0178  */
    /* JADX WARN: Code duplicated, block: B:125:0x0181  */
    /* JADX WARN: Code duplicated, block: B:126:0x0188  */
    /* JADX WARN: Code duplicated, block: B:128:0x018e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0197  */
    /* JADX WARN: Code duplicated, block: B:133:0x019c  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:138:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:154:0x01db  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:169:0x021e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0222  */
    /* JADX WARN: Code duplicated, block: B:172:0x022c  */
    /* JADX WARN: Code duplicated, block: B:174:0x022f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0232  */
    /* JADX WARN: Code duplicated, block: B:179:0x0238  */
    /* JADX WARN: Code duplicated, block: B:180:0x025b  */
    /* JADX WARN: Code duplicated, block: B:182:0x025f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0262  */
    /* JADX WARN: Code duplicated, block: B:186:0x026d  */
    /* JADX WARN: Code duplicated, block: B:188:0x0278  */
    /* JADX WARN: Code duplicated, block: B:190:0x027c  */
    /* JADX WARN: Code duplicated, block: B:191:0x027f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0283  */
    /* JADX WARN: Code duplicated, block: B:194:0x0286  */
    /* JADX WARN: Code duplicated, block: B:196:0x028a  */
    /* JADX WARN: Code duplicated, block: B:198:0x0297  */
    /* JADX WARN: Code duplicated, block: B:201:0x02af  */
    /* JADX WARN: Code duplicated, block: B:204:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:207:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:210:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:211:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:215:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:222:0x0324  */
    /* JADX WARN: Code duplicated, block: B:224:0x0333  */
    /* JADX WARN: Code duplicated, block: B:225:0x0336  */
    /* JADX WARN: Code duplicated, block: B:227:0x0339  */
    /* JADX WARN: Code duplicated, block: B:231:0x034b  */
    /* JADX WARN: Code duplicated, block: B:232:0x0350  */
    /* JADX WARN: Code duplicated, block: B:235:0x035d  */
    /* JADX WARN: Code duplicated, block: B:238:0x036e  */
    /* JADX WARN: Code duplicated, block: B:241:0x0389  */
    /* JADX WARN: Code duplicated, block: B:245:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:248:0x03b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:249:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:251:0x042a  */
    /* JADX WARN: Code duplicated, block: B:254:0x0442  */
    /* JADX WARN: Code duplicated, block: B:256:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:81:0x0103  */
    /* JADX WARN: Code duplicated, block: B:83:0x0109  */
    /* JADX WARN: Code duplicated, block: B:85:0x010f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0112  */
    /* JADX WARN: Code duplicated, block: B:90:0x011c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0121  */
    /* JADX WARN: Code duplicated, block: B:94:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0127  */
    /* JADX WARN: Code duplicated, block: B:97:0x012e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, fe feVar, lc.m0 m0Var, String str2, boolean z14, boolean z15, i53.f fVar, String str3, e23.a aVar, s21.v vVar, i53.h hVar, boolean z16, e23.a aVar2, e23.a aVar3, final z3.e eVar, p3.m mVar, int i14, int i15, int i16) {
        String str4;
        int i17;
        String str5;
        boolean z17;
        int i18;
        boolean z18;
        int i19;
        int i24;
        String str6;
        int i25;
        int i26;
        int i27;
        int i28;
        int iOrdinal;
        int i29;
        int i30;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        boolean z19;
        i53.f fVar2;
        e23.a aVar4;
        boolean z24;
        String str7;
        String str8;
        boolean z25;
        s21.v vVar2;
        boolean z26;
        e23.a aVar5;
        p2 p2VarI0;
        int i44;
        p3.m.a aVar6;
        String strQ;
        i53.f fVarA;
        e23.a aVar7;
        s21.v vVar3;
        boolean z27;
        e23.a aVar8;
        final String str9;
        final e23.a aVar9;
        boolean z28;
        final String str10;
        final boolean z29;
        final s21.v vVar4;
        Object objQ;
        Object objQ2;
        lc.v vVarI;
        String str11;
        String strF0;
        Iterator<T> it;
        Object next;
        s21.z zVar;
        ArrayList arrayList;
        final double d14;
        Object objQ3;
        p3.m.a.C2565a c2565a;
        p1 p1Var;
        Object objQ4;
        p1 p1Var2;
        Object objQ5;
        boolean z34;
        Object objQ6;
        boolean z35;
        lc.h0 h0Var;
        int i45;
        int i46;
        boolean zR;
        str.getClass();
        feVar.getClass();
        m0Var.getClass();
        hVar.getClass();
        aVar3.getClass();
        p3.o0 o0VarE = mVar.E(520963157);
        if ((i14 & 6) == 0) {
            str4 = str;
            i17 = (o0VarE.B(str4) ? 4 : 2) | i14;
        } else {
            str4 = str;
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.B(feVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.r(m0Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                str5 = str2;
                int i47 = o0VarE.B(str5) ? 2048 : 1024;
                i17 |= i47;
            } else {
                str5 = str2;
            }
            i17 |= i47;
        } else {
            str5 = str2;
        }
        int i48 = i16 & 16;
        if (i48 == 0) {
            if ((i14 & 24576) == 0) {
                z17 = z14;
                i17 |= o0VarE.h(z17) ? 16384 : 8192;
            }
            i18 = i16 & 32;
            if (i18 != 0) {
                i17 |= 196608;
                z18 = z15;
            } else {
                z18 = z15;
                if ((i14 & 196608) == 0) {
                    if (o0VarE.h(z18)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i17 |= i19;
                }
            }
            if ((i14 & 1572864) == 0) {
                if ((i16 & 64) != 0) {
                    i46 = 524288;
                } else {
                    if ((i14 & 2097152) == 0) {
                        zR = o0VarE.B(fVar);
                    } else {
                        zR = o0VarE.r(fVar);
                    }
                    if (zR) {
                        i46 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i46 = 524288;
                    }
                }
                i17 |= i46;
            }
            i24 = i16 & 128;
            if (i24 != 0) {
                i17 |= 12582912;
                str6 = str3;
            } else {
                str6 = str3;
                if ((i14 & 12582912) == 0) {
                    if (o0VarE.B(str6)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i17 |= i25;
                }
            }
            i26 = i16 & 256;
            if (i26 != 0) {
                i17 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarE.r(aVar)) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i17 |= i27;
            }
            i28 = i16 & 512;
            if (i28 != 0) {
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (vVar == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = vVar.ordinal();
                    }
                    if (o0VarE.k(iOrdinal)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i17 |= i29;
                }
                if ((i15 & 6) == 0) {
                    if (o0VarE.B(hVar)) {
                        i45 = 4;
                    } else {
                        i45 = 2;
                    }
                    i30 = i15 | i45;
                } else {
                    i30 = i15;
                }
                i34 = i16 & 2048;
                if (i34 != 0) {
                    i30 |= 48;
                } else if ((i15 & 48) != 0) {
                    if (o0VarE.h(z16)) {
                        i35 = 32;
                    } else {
                        i35 = 16;
                    }
                    i30 |= i35;
                }
                i36 = i30;
                i37 = i16 & 4096;
                if (i37 != 0) {
                    i38 = i36 | 384;
                } else if ((i15 & 384) == 0) {
                    i38 = i36 | (o0VarE.r(aVar2) ? 256 : 128);
                } else {
                    i38 = i36;
                }
                if ((i15 & 3072) == 0) {
                    i38 |= o0VarE.r(aVar3) ? 2048 : 1024;
                }
                if ((i15 & 24576) != 0) {
                    i38 |= o0VarE.r(eVar) ? 16384 : 8192;
                }
                i39 = i38;
                if ((i17 & 306783379) == 306783378 || (i39 & 9363) != 9362) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (o0VarE.n(i17 & 1, z19)) {
                    o0VarE.G0();
                    i44 = i14 & 1;
                    aVar6 = p3.m.f135153a;
                    if (i44 != 0 || o0VarE.o0()) {
                        if ((i16 & 8) != 0) {
                            strQ = gl1.y.Q(o0VarE, R.string.lbl_next);
                            i17 &= -7169;
                        } else {
                            strQ = str5;
                        }
                        if (i48 != 0) {
                            z17 = false;
                        }
                        if (i18 != 0) {
                            z18 = true;
                        }
                        if ((i16 & 64) != 0) {
                            fVarA = i53.a.a(new i3("EXIT", gl1.y.Q(o0VarE, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                            i17 &= -3670017;
                        } else {
                            fVarA = fVar;
                        }
                        if (i24 != 0) {
                            str6 = null;
                        }
                        if (i26 != 0) {
                            objQ2 = o0VarE.q();
                            aVar6.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new f(12);
                                o0VarE.K(objQ2);
                            }
                            aVar7 = (e23.a) objQ2;
                        } else {
                            aVar7 = aVar;
                        }
                        if (i28 != 0) {
                            vVar3 = s21.v.ENABLED;
                        } else {
                            vVar3 = vVar;
                        }
                        if (i34 != 0) {
                            z27 = false;
                        } else {
                            z27 = z16;
                        }
                        if (i37 != 0) {
                            objQ = o0VarE.q();
                            aVar6.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f(13);
                                o0VarE.K(objQ);
                            }
                            aVar8 = (e23.a) objQ;
                        } else {
                            aVar8 = aVar2;
                        }
                        str9 = strQ;
                        aVar9 = aVar7;
                        z28 = z17;
                        str10 = str6;
                        z29 = z18;
                        vVar4 = vVar3;
                    } else {
                        o0VarE.e();
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                        }
                        if ((i16 & 64) != 0) {
                            i17 &= -3670017;
                        }
                        aVar9 = aVar;
                        vVar4 = vVar;
                        z27 = z16;
                        z28 = z17;
                        str9 = str5;
                        str10 = str6;
                        z29 = z18;
                        fVarA = fVar;
                        aVar8 = aVar2;
                    }
                    o0VarE.h0();
                    x1 x1Var = p3.n.f135158a;
                    s21.z.a aVar10 = s21.z.f156209c;
                    vVarI = m0Var.f111904b.i();
                    if (vVarI != null || (h0Var = vVarI.f111882b) == null) {
                        str11 = null;
                    } else {
                        str11 = h0Var.f111773b.f144347f;
                    }
                    aVar10.getClass();
                    if (str11 != null) {
                        strF0 = d53.w.f0(str11, '?');
                    } else {
                        strF0 = null;
                    }
                    it = s21.z.f156222p.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!p005kotlin.jvm.internal.s.g(gl1.y.J(p005kotlin.jvm.internal.s0.f105811a.b(((s21.z) next).f156223a.getClass())).getF158591b().getF103221c(), strF0));
                    zVar = (s21.z) next;
                    int size = hVar.size();
                    arrayList = new ArrayList();
                    for (Object obj : hVar) {
                        e23.a aVar11 = aVar8;
                        if (((s21.z) obj).f156224b == 0.0d) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        if (z35) {
                            arrayList.add(obj);
                        }
                        aVar8 = aVar11;
                    }
                    e23.a aVar12 = aVar8;
                    final double size2 = size - arrayList.size();
                    if (zVar != null) {
                        d14 = zVar.f156224b;
                    } else {
                        d14 = 0.0d;
                    }
                    objQ3 = o0VarE.q();
                    aVar6.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = p3.p0.n(Boolean.TRUE);
                        o0VarE.K(objQ3);
                    }
                    p1Var = (p1) objQ3;
                    objQ4 = o0VarE.q();
                    if (objQ4 == c2565a) {
                        objQ4 = p3.p0.n(Boolean.FALSE);
                        o0VarE.K(objQ4);
                    }
                    p1Var2 = (p1) objQ4;
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    objQ5 = o0VarE.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new p40.q0(p1Var, p1Var2, 8);
                        o0VarE.K(objQ5);
                    }
                    c.w.a(48, 0, (e23.a) objQ5, o0VarE, zBooleanValue);
                    Boolean bool = (Boolean) p1Var2.getF182175a();
                    bool.getClass();
                    z34 = (i39 & 7168) == 2048;
                    objQ6 = o0VarE.q();
                    if (z34 || objQ6 == c2565a) {
                        objQ6 = new c1(aVar3, p1Var2, null);
                        o0VarE.K(objQ6);
                    }
                    p3.l0.e((e23.p) objQ6, bool, o0VarE);
                    c2.n0 n0Var = n3.f22788a;
                    i53.f fVar3 = fVarA;
                    z02.d.a(z28, z3.f.c(1744360282, new bt1.m(str4, aVar3, fVar3, z27, aVar12), o0VarE), z3.f.c(1605574875, new p21.b(feVar, 16), o0VarE), null, new c2.n0(0, 0, 0, 0), z3.f.c(1189218654, new e23.p() { // from class: t21.a1
                        @Override // e23.p
                        public final Object invoke(Object obj2, Object obj3) {
                            float f14;
                            h4.g.a aVar13;
                            h5.g.a.C1623g c1623g;
                            h5.g.a.b bVar;
                            h5.g.a.e eVar2;
                            c2.b0 b0Var;
                            h5.e0.a aVar14;
                            h5.g.a.b bVar2;
                            p3.m mVar2;
                            boolean z36;
                            s21.v vVar5;
                            h4.r.a aVar15;
                            p3.m mVar3 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = p3.n.f135158a;
                                h4.r.a aVar16 = h4.r.S;
                                h4.r rVarS = c2.l.s(u1.n.e(x2.c(aVar16, 1.0f), tn.k.a(d92.b.f58623a, mVar3), m1.f128891a));
                                c2.j.f22691a.getClass();
                                c2.j.k kVar = c2.j.f22694d;
                                h4.d.f81522a.getClass();
                                h4.g.a aVar17 = h4.d.a.f81536n;
                                c2.z zVarA = c2.y.a(kVar, aVar17, mVar3, 0);
                                int iHashCode = Long.hashCode(mVar3.getU());
                                i2 i2VarX = mVar3.x();
                                h4.r rVarC = h4.k.c(rVarS, mVar3);
                                h5.g.V.getClass();
                                h5.e0.a aVar18 = h5.g.a.f81805b;
                                if (mVar3.F() == null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar3.z();
                                if (mVar3.getT()) {
                                    mVar3.M(aVar18);
                                } else {
                                    mVar3.c();
                                }
                                h5.g.a.e eVar3 = h5.g.a.f81810g;
                                b4.c(eVar3, zVarA, mVar3);
                                h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                                b4.c(c1623g2, i2VarX, mVar3);
                                h5.g.a.b bVar3 = h5.g.a.f81813j;
                                if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                    v.h.z(iHashCode, mVar3, iHashCode, bVar3);
                                }
                                h5.g.a.f fVar4 = h5.g.a.f81807d;
                                b4.c(fVar4, rVarC, mVar3);
                                c2.b0 b0Var2 = c2.b0.f22601a;
                                if (z29) {
                                    mVar3.C(-654410468);
                                    h4.r rVarF = x2.f(aVar16, 1.0f);
                                    d92.b.f58625c.getClass();
                                    j92.e eVar4 = j92.b.f97899b;
                                    h4.r rVarZ = c2.l.z(rVarF, eVar4.f97920e, eVar4.f97918c);
                                    o4.d0 d0VarA = o4.d0.a(d92.b.a(mVar3).e().g());
                                    gl.c.f77766a.getClass();
                                    eVar2 = eVar3;
                                    aVar13 = aVar17;
                                    c1623g = c1623g2;
                                    b0Var = b0Var2;
                                    bVar = bVar3;
                                    f14 = 1.0f;
                                    g02.f1.i(rVarZ, d0VarA, i53.a.a(new g02.t0(d14, gl.c.a(mVar3).f(), null)), size2, 0.0f, 0.0f, 0.0f, mVar3, 0, 112);
                                    mVar3 = mVar3;
                                    mVar3.f();
                                } else {
                                    f14 = 1.0f;
                                    aVar13 = aVar17;
                                    c1623g = c1623g2;
                                    bVar = bVar3;
                                    eVar2 = eVar3;
                                    b0Var = b0Var2;
                                    mVar3.C(-653931890);
                                    mVar3.f();
                                }
                                h4.r rVarB = a2.b(b0Var.a(aVar16, f14, true), a2.a(mVar3), true);
                                c2.z zVarA2 = c2.y.a(kVar, aVar13, mVar3, 0);
                                int iHashCode2 = Long.hashCode(mVar3.getU());
                                i2 i2VarX2 = mVar3.x();
                                h4.r rVarC2 = h4.k.c(rVarB, mVar3);
                                if (mVar3.F() == null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar3.z();
                                if (mVar3.getT()) {
                                    aVar14 = aVar18;
                                    mVar3.M(aVar14);
                                } else {
                                    aVar14 = aVar18;
                                    mVar3.c();
                                }
                                h5.g.a.e eVar5 = eVar2;
                                b4.c(eVar5, zVarA2, mVar3);
                                h5.g.a.C1623g c1623g3 = c1623g;
                                b4.c(c1623g3, i2VarX2, mVar3);
                                if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                                    bVar2 = bVar;
                                    v.h.z(iHashCode2, mVar3, iHashCode2, bVar2);
                                } else {
                                    bVar2 = bVar;
                                }
                                b4.c(fVar4, rVarC2, mVar3);
                                eVar.invoke(b0Var, mVar3, 6);
                                mVar3.y();
                                s21.v vVar6 = s21.v.INVISIBLE;
                                s21.v vVar7 = vVar4;
                                if (vVar7 != vVar6) {
                                    mVar3.C(-653606824);
                                    h4.r rVarF2 = x2.f(aVar16, f14);
                                    c2.z zVarA3 = c2.y.a(kVar, aVar13, mVar3, 0);
                                    int iHashCode3 = Long.hashCode(mVar3.getU());
                                    i2 i2VarX3 = mVar3.x();
                                    h4.r rVarC3 = h4.k.c(rVarF2, mVar3);
                                    if (mVar3.F() == null) {
                                        p3.p0.l();
                                        throw null;
                                    }
                                    mVar3.z();
                                    if (mVar3.getT()) {
                                        mVar3.M(aVar14);
                                    } else {
                                        mVar3.c();
                                    }
                                    b4.c(eVar5, zVarA3, mVar3);
                                    b4.c(c1623g3, i2VarX3, mVar3);
                                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                                        v.h.z(iHashCode3, mVar3, iHashCode3, bVar2);
                                    }
                                    b4.c(fVar4, rVarC3, mVar3);
                                    String str12 = str10;
                                    if (str12 == null) {
                                        mVar3.C(-404201805);
                                        mVar3.f();
                                        mVar2 = mVar3;
                                        vVar5 = vVar7;
                                        aVar15 = aVar16;
                                        z36 = false;
                                    } else {
                                        mVar3.C(-404201804);
                                        Object objQ7 = mVar3.q();
                                        p3.m.f135153a.getClass();
                                        p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                                        if (objQ7 == c2565a2) {
                                            objQ7 = new u(10);
                                            mVar3.K(objQ7);
                                        }
                                        String strB = oi0.c.B(str12, (e23.l) objQ7, mVar3);
                                        d6.h.f57752b.getClass();
                                        int i49 = d6.h.f57757g;
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarF = d92.c.f(j92.f.f97933j, mVar3);
                                        h4.r rVarF3 = x2.f(aVar16, f14);
                                        boolean zB = mVar3.B(strB);
                                        Object objQ8 = mVar3.q();
                                        if (zB || objQ8 == c2565a2) {
                                            objQ8 = new s70.r0(strB, 15);
                                            mVar3.K(objQ8);
                                        }
                                        h4.r rVarC4 = p5.v.c((e23.l) objQ8, rVarF3, false);
                                        d92.b.f58625c.getClass();
                                        j92.e eVar6 = j92.b.f97899b;
                                        float f15 = eVar6.f97920e;
                                        mVar2 = mVar3;
                                        z36 = false;
                                        vVar5 = vVar7;
                                        aVar15 = aVar16;
                                        mh.c(str12, c2.l.C(rVarC4, f15, eVar6.f97918c, f15, 0.0f, 8), 0L, null, 0L, null, 0L, d6.h.a(i49), 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 130044);
                                        Unit unit = Unit.INSTANCE;
                                        mVar2.f();
                                    }
                                    l72.f0 f0Var = l72.f0.f110999a;
                                    h4.r rVarF4 = x2.f(aVar15, f14);
                                    d92.b.f58625c.getClass();
                                    j92.e eVar7 = j92.b.f97899b;
                                    mVar3 = mVar2;
                                    f0Var.d(0, 1, aVar9, c2.l.C(c2.l.A(rVarF4, eVar7.f97920e, 0.0f, 2), 0.0f, eVar7.f97920e, 0.0f, eVar7.f97921f, 5), str9, mVar3, null, vVar5 == s21.v.ENABLED ? true : z36);
                                    mVar3.y();
                                    mVar3.f();
                                } else {
                                    mVar3.C(-651986578);
                                    mVar3.f();
                                }
                                mVar3.y();
                            } else {
                                mVar3.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, ((i17 >> 12) & 14) | 197040, 8);
                    x1 x1Var2 = p3.n.f135158a;
                    z24 = z28;
                    z26 = z27;
                    z25 = z29;
                    vVar2 = vVar4;
                    str8 = str10;
                    str7 = str9;
                    aVar4 = aVar9;
                    fVar2 = fVar3;
                    aVar5 = aVar12;
                } else {
                    o0VarE.e();
                    fVar2 = fVar;
                    aVar4 = aVar;
                    z24 = z17;
                    str7 = str5;
                    str8 = str6;
                    z25 = z18;
                    vVar2 = vVar;
                    z26 = z16;
                    aVar5 = aVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new b1(str, feVar, m0Var, str7, z24, z25, fVar2, str8, aVar4, vVar2, hVar, z26, aVar5, aVar3, eVar, i14, i15, i16);
                }
            }
            i17 |= C.ENCODING_PCM_32BIT;
            if ((i15 & 6) == 0) {
                if (o0VarE.B(hVar)) {
                    i45 = 4;
                } else {
                    i45 = 2;
                }
                i30 = i15 | i45;
            } else {
                i30 = i15;
            }
            i34 = i16 & 2048;
            if (i34 != 0) {
                i30 |= 48;
            } else if ((i15 & 48) != 0) {
                if (o0VarE.h(z16)) {
                    i35 = 32;
                } else {
                    i35 = 16;
                }
                i30 |= i35;
            }
            i36 = i30;
            i37 = i16 & 4096;
            if (i37 != 0) {
                i38 = i36 | 384;
            } else if ((i15 & 384) == 0) {
                i38 = i36 | (o0VarE.r(aVar2) ? 256 : 128);
            } else {
                i38 = i36;
            }
            if ((i15 & 3072) == 0) {
                i38 |= o0VarE.r(aVar3) ? 2048 : 1024;
            }
            if ((i15 & 24576) != 0) {
                i38 |= o0VarE.r(eVar) ? 16384 : 8192;
            }
            i39 = i38;
            if ((i17 & 306783379) == 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (o0VarE.n(i17 & 1, z19)) {
                o0VarE.G0();
                i44 = i14 & 1;
                aVar6 = p3.m.f135153a;
                if (i44 != 0) {
                    if ((i16 & 8) != 0) {
                        strQ = gl1.y.Q(o0VarE, R.string.lbl_next);
                        i17 &= -7169;
                    } else {
                        strQ = str5;
                    }
                    if (i48 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z18 = true;
                    }
                    if ((i16 & 64) != 0) {
                        fVarA = i53.a.a(new i3("EXIT", gl1.y.Q(o0VarE, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        i17 &= -3670017;
                    } else {
                        fVarA = fVar;
                    }
                    if (i24 != 0) {
                        str6 = null;
                    }
                    if (i26 != 0) {
                        objQ2 = o0VarE.q();
                        aVar6.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f(12);
                            o0VarE.K(objQ2);
                        }
                        aVar7 = (e23.a) objQ2;
                    } else {
                        aVar7 = aVar;
                    }
                    if (i28 != 0) {
                        vVar3 = s21.v.ENABLED;
                    } else {
                        vVar3 = vVar;
                    }
                    if (i34 != 0) {
                        z27 = false;
                    } else {
                        z27 = z16;
                    }
                    if (i37 != 0) {
                        objQ = o0VarE.q();
                        aVar6.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f(13);
                            o0VarE.K(objQ);
                        }
                        aVar8 = (e23.a) objQ;
                    } else {
                        aVar8 = aVar2;
                    }
                    str9 = strQ;
                    aVar9 = aVar7;
                    z28 = z17;
                    str10 = str6;
                    z29 = z18;
                    vVar4 = vVar3;
                } else {
                    if ((i16 & 8) != 0) {
                        strQ = gl1.y.Q(o0VarE, R.string.lbl_next);
                        i17 &= -7169;
                    } else {
                        strQ = str5;
                    }
                    if (i48 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z18 = true;
                    }
                    if ((i16 & 64) != 0) {
                        fVarA = i53.a.a(new i3("EXIT", gl1.y.Q(o0VarE, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        i17 &= -3670017;
                    } else {
                        fVarA = fVar;
                    }
                    if (i24 != 0) {
                        str6 = null;
                    }
                    if (i26 != 0) {
                        objQ2 = o0VarE.q();
                        aVar6.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f(12);
                            o0VarE.K(objQ2);
                        }
                        aVar7 = (e23.a) objQ2;
                    } else {
                        aVar7 = aVar;
                    }
                    if (i28 != 0) {
                        vVar3 = s21.v.ENABLED;
                    } else {
                        vVar3 = vVar;
                    }
                    if (i34 != 0) {
                        z27 = false;
                    } else {
                        z27 = z16;
                    }
                    if (i37 != 0) {
                        objQ = o0VarE.q();
                        aVar6.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f(13);
                            o0VarE.K(objQ);
                        }
                        aVar8 = (e23.a) objQ;
                    } else {
                        aVar8 = aVar2;
                    }
                    str9 = strQ;
                    aVar9 = aVar7;
                    z28 = z17;
                    str10 = str6;
                    z29 = z18;
                    vVar4 = vVar3;
                }
                o0VarE.h0();
                x1 x1Var3 = p3.n.f135158a;
                s21.z.a aVar13 = s21.z.f156209c;
                vVarI = m0Var.f111904b.i();
                if (vVarI != null) {
                    str11 = null;
                } else {
                    str11 = null;
                }
                aVar13.getClass();
                if (str11 != null) {
                    strF0 = d53.w.f0(str11, '?');
                } else {
                    strF0 = null;
                }
                it = s21.z.f156222p.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(gl1.y.J(p005kotlin.jvm.internal.s0.f105811a.b(((s21.z) next).f156223a.getClass())).getF158591b().getF103221c(), strF0));
                zVar = (s21.z) next;
                int size3 = hVar.size();
                arrayList = new ArrayList();
                while (r11.hasNext()) {
                    e23.a aVar14 = aVar8;
                    if (((s21.z) obj).f156224b == 0.0d) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    if (z35) {
                        arrayList.add(obj);
                    }
                    aVar8 = aVar14;
                }
                e23.a aVar15 = aVar8;
                final double size4 = size3 - arrayList.size();
                if (zVar != null) {
                    d14 = zVar.f156224b;
                } else {
                    d14 = 0.0d;
                }
                objQ3 = o0VarE.q();
                aVar6.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ3 == c2565a) {
                    objQ3 = p3.p0.n(Boolean.TRUE);
                    o0VarE.K(objQ3);
                }
                p1Var = (p1) objQ3;
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objQ4);
                }
                p1Var2 = (p1) objQ4;
                boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = new p40.q0(p1Var, p1Var2, 8);
                    o0VarE.K(objQ5);
                }
                c.w.a(48, 0, (e23.a) objQ5, o0VarE, zBooleanValue2);
                Boolean bool2 = (Boolean) p1Var2.getF182175a();
                bool2.getClass();
                if ((i39 & 7168) == 2048) {
                }
                objQ6 = o0VarE.q();
                if (z34) {
                    objQ6 = new c1(aVar3, p1Var2, null);
                    o0VarE.K(objQ6);
                } else {
                    objQ6 = new c1(aVar3, p1Var2, null);
                    o0VarE.K(objQ6);
                }
                p3.l0.e((e23.p) objQ6, bool2, o0VarE);
                c2.n0 n0Var2 = n3.f22788a;
                i53.f fVar4 = fVarA;
                z02.d.a(z28, z3.f.c(1744360282, new bt1.m(str4, aVar3, fVar4, z27, aVar15), o0VarE), z3.f.c(1605574875, new p21.b(feVar, 16), o0VarE), null, new c2.n0(0, 0, 0, 0), z3.f.c(1189218654, new e23.p() { // from class: t21.a1
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        float f14;
                        h4.g.a aVar16;
                        h5.g.a.C1623g c1623g;
                        h5.g.a.b bVar;
                        h5.g.a.e eVar2;
                        c2.b0 b0Var;
                        h5.e0.a aVar17;
                        h5.g.a.b bVar2;
                        p3.m mVar2;
                        boolean z36;
                        s21.v vVar5;
                        h4.r.a aVar18;
                        p3.m mVar3 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            x1 x1Var4 = p3.n.f135158a;
                            h4.r.a aVar19 = h4.r.S;
                            h4.r rVarS = c2.l.s(u1.n.e(x2.c(aVar19, 1.0f), tn.k.a(d92.b.f58623a, mVar3), m1.f128891a));
                            c2.j.f22691a.getClass();
                            c2.j.k kVar = c2.j.f22694d;
                            h4.d.f81522a.getClass();
                            h4.g.a aVar110 = h4.d.a.f81536n;
                            c2.z zVarA = c2.y.a(kVar, aVar110, mVar3, 0);
                            int iHashCode = Long.hashCode(mVar3.getU());
                            i2 i2VarX = mVar3.x();
                            h4.r rVarC = h4.k.c(rVarS, mVar3);
                            h5.g.V.getClass();
                            h5.e0.a aVar111 = h5.g.a.f81805b;
                            if (mVar3.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar3.z();
                            if (mVar3.getT()) {
                                mVar3.M(aVar111);
                            } else {
                                mVar3.c();
                            }
                            h5.g.a.e eVar3 = h5.g.a.f81810g;
                            b4.c(eVar3, zVarA, mVar3);
                            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                            b4.c(c1623g2, i2VarX, mVar3);
                            h5.g.a.b bVar3 = h5.g.a.f81813j;
                            if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar3, iHashCode, bVar3);
                            }
                            h5.g.a.f fVar5 = h5.g.a.f81807d;
                            b4.c(fVar5, rVarC, mVar3);
                            c2.b0 b0Var2 = c2.b0.f22601a;
                            if (z29) {
                                mVar3.C(-654410468);
                                h4.r rVarF = x2.f(aVar19, 1.0f);
                                d92.b.f58625c.getClass();
                                j92.e eVar4 = j92.b.f97899b;
                                h4.r rVarZ = c2.l.z(rVarF, eVar4.f97920e, eVar4.f97918c);
                                o4.d0 d0VarA = o4.d0.a(d92.b.a(mVar3).e().g());
                                gl.c.f77766a.getClass();
                                eVar2 = eVar3;
                                aVar16 = aVar110;
                                c1623g = c1623g2;
                                b0Var = b0Var2;
                                bVar = bVar3;
                                f14 = 1.0f;
                                g02.f1.i(rVarZ, d0VarA, i53.a.a(new g02.t0(d14, gl.c.a(mVar3).f(), null)), size4, 0.0f, 0.0f, 0.0f, mVar3, 0, 112);
                                mVar3 = mVar3;
                                mVar3.f();
                            } else {
                                f14 = 1.0f;
                                aVar16 = aVar110;
                                c1623g = c1623g2;
                                bVar = bVar3;
                                eVar2 = eVar3;
                                b0Var = b0Var2;
                                mVar3.C(-653931890);
                                mVar3.f();
                            }
                            h4.r rVarB = a2.b(b0Var.a(aVar19, f14, true), a2.a(mVar3), true);
                            c2.z zVarA2 = c2.y.a(kVar, aVar16, mVar3, 0);
                            int iHashCode2 = Long.hashCode(mVar3.getU());
                            i2 i2VarX2 = mVar3.x();
                            h4.r rVarC2 = h4.k.c(rVarB, mVar3);
                            if (mVar3.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar3.z();
                            if (mVar3.getT()) {
                                aVar17 = aVar111;
                                mVar3.M(aVar17);
                            } else {
                                aVar17 = aVar111;
                                mVar3.c();
                            }
                            h5.g.a.e eVar5 = eVar2;
                            b4.c(eVar5, zVarA2, mVar3);
                            h5.g.a.C1623g c1623g3 = c1623g;
                            b4.c(c1623g3, i2VarX2, mVar3);
                            if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                                bVar2 = bVar;
                                v.h.z(iHashCode2, mVar3, iHashCode2, bVar2);
                            } else {
                                bVar2 = bVar;
                            }
                            b4.c(fVar5, rVarC2, mVar3);
                            eVar.invoke(b0Var, mVar3, 6);
                            mVar3.y();
                            s21.v vVar6 = s21.v.INVISIBLE;
                            s21.v vVar7 = vVar4;
                            if (vVar7 != vVar6) {
                                mVar3.C(-653606824);
                                h4.r rVarF2 = x2.f(aVar19, f14);
                                c2.z zVarA3 = c2.y.a(kVar, aVar16, mVar3, 0);
                                int iHashCode3 = Long.hashCode(mVar3.getU());
                                i2 i2VarX3 = mVar3.x();
                                h4.r rVarC3 = h4.k.c(rVarF2, mVar3);
                                if (mVar3.F() == null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar3.z();
                                if (mVar3.getT()) {
                                    mVar3.M(aVar17);
                                } else {
                                    mVar3.c();
                                }
                                b4.c(eVar5, zVarA3, mVar3);
                                b4.c(c1623g3, i2VarX3, mVar3);
                                if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                                    v.h.z(iHashCode3, mVar3, iHashCode3, bVar2);
                                }
                                b4.c(fVar5, rVarC3, mVar3);
                                String str12 = str10;
                                if (str12 == null) {
                                    mVar3.C(-404201805);
                                    mVar3.f();
                                    mVar2 = mVar3;
                                    vVar5 = vVar7;
                                    aVar18 = aVar19;
                                    z36 = false;
                                } else {
                                    mVar3.C(-404201804);
                                    Object objQ7 = mVar3.q();
                                    p3.m.f135153a.getClass();
                                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                                    if (objQ7 == c2565a2) {
                                        objQ7 = new u(10);
                                        mVar3.K(objQ7);
                                    }
                                    String strB = oi0.c.B(str12, (e23.l) objQ7, mVar3);
                                    d6.h.f57752b.getClass();
                                    int i49 = d6.h.f57757g;
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarF = d92.c.f(j92.f.f97933j, mVar3);
                                    h4.r rVarF3 = x2.f(aVar19, f14);
                                    boolean zB = mVar3.B(strB);
                                    Object objQ8 = mVar3.q();
                                    if (zB || objQ8 == c2565a2) {
                                        objQ8 = new s70.r0(strB, 15);
                                        mVar3.K(objQ8);
                                    }
                                    h4.r rVarC4 = p5.v.c((e23.l) objQ8, rVarF3, false);
                                    d92.b.f58625c.getClass();
                                    j92.e eVar6 = j92.b.f97899b;
                                    float f15 = eVar6.f97920e;
                                    mVar2 = mVar3;
                                    z36 = false;
                                    vVar5 = vVar7;
                                    aVar18 = aVar19;
                                    mh.c(str12, c2.l.C(rVarC4, f15, eVar6.f97918c, f15, 0.0f, 8), 0L, null, 0L, null, 0L, d6.h.a(i49), 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 130044);
                                    Unit unit = Unit.INSTANCE;
                                    mVar2.f();
                                }
                                l72.f0 f0Var = l72.f0.f110999a;
                                h4.r rVarF4 = x2.f(aVar18, f14);
                                d92.b.f58625c.getClass();
                                j92.e eVar7 = j92.b.f97899b;
                                mVar3 = mVar2;
                                f0Var.d(0, 1, aVar9, c2.l.C(c2.l.A(rVarF4, eVar7.f97920e, 0.0f, 2), 0.0f, eVar7.f97920e, 0.0f, eVar7.f97921f, 5), str9, mVar3, null, vVar5 == s21.v.ENABLED ? true : z36);
                                mVar3.y();
                                mVar3.f();
                            } else {
                                mVar3.C(-651986578);
                                mVar3.f();
                            }
                            mVar3.y();
                        } else {
                            mVar3.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, ((i17 >> 12) & 14) | 197040, 8);
                x1 x1Var4 = p3.n.f135158a;
                z24 = z28;
                z26 = z27;
                z25 = z29;
                vVar2 = vVar4;
                str8 = str10;
                str7 = str9;
                aVar4 = aVar9;
                fVar2 = fVar4;
                aVar5 = aVar15;
            } else {
                o0VarE.e();
                fVar2 = fVar;
                aVar4 = aVar;
                z24 = z17;
                str7 = str5;
                str8 = str6;
                z25 = z18;
                vVar2 = vVar;
                z26 = z16;
                aVar5 = aVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b1(str, feVar, m0Var, str7, z24, z25, fVar2, str8, aVar4, vVar2, hVar, z26, aVar5, aVar3, eVar, i14, i15, i16);
            }
        }
        i17 |= 24576;
        z17 = z14;
        i18 = i16 & 32;
        if (i18 != 0) {
            i17 |= 196608;
            z18 = z15;
        } else {
            z18 = z15;
            if ((i14 & 196608) == 0) {
                if (o0VarE.h(z18)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i17 |= i19;
            }
        }
        if ((i14 & 1572864) == 0) {
            if ((i16 & 64) != 0) {
                i46 = 524288;
            } else {
                if ((i14 & 2097152) == 0) {
                    zR = o0VarE.B(fVar);
                } else {
                    zR = o0VarE.r(fVar);
                }
                if (zR) {
                    i46 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i46 = 524288;
                }
            }
            i17 |= i46;
        }
        i24 = i16 & 128;
        if (i24 != 0) {
            i17 |= 12582912;
            str6 = str3;
        } else {
            str6 = str3;
            if ((i14 & 12582912) == 0) {
                if (o0VarE.B(str6)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i17 |= i25;
            }
        }
        i26 = i16 & 256;
        if (i26 != 0) {
            i17 |= 100663296;
        } else if ((i14 & 100663296) == 0) {
            if (o0VarE.r(aVar)) {
                i27 = 67108864;
            } else {
                i27 = 33554432;
            }
            i17 |= i27;
        }
        i28 = i16 & 512;
        if (i28 != 0) {
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (vVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = vVar.ordinal();
                }
                if (o0VarE.k(iOrdinal)) {
                    i29 = 536870912;
                } else {
                    i29 = 268435456;
                }
                i17 |= i29;
            }
            if ((i15 & 6) == 0) {
                if (o0VarE.B(hVar)) {
                    i45 = 4;
                } else {
                    i45 = 2;
                }
                i30 = i15 | i45;
            } else {
                i30 = i15;
            }
            i34 = i16 & 2048;
            if (i34 != 0) {
                i30 |= 48;
            } else if ((i15 & 48) != 0) {
                if (o0VarE.h(z16)) {
                    i35 = 32;
                } else {
                    i35 = 16;
                }
                i30 |= i35;
            }
            i36 = i30;
            i37 = i16 & 4096;
            if (i37 != 0) {
                i38 = i36 | 384;
            } else if ((i15 & 384) == 0) {
                i38 = i36 | (o0VarE.r(aVar2) ? 256 : 128);
            } else {
                i38 = i36;
            }
            if ((i15 & 3072) == 0) {
                i38 |= o0VarE.r(aVar3) ? 2048 : 1024;
            }
            if ((i15 & 24576) != 0) {
                i38 |= o0VarE.r(eVar) ? 16384 : 8192;
            }
            i39 = i38;
            if ((i17 & 306783379) == 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (o0VarE.n(i17 & 1, z19)) {
                o0VarE.G0();
                i44 = i14 & 1;
                aVar6 = p3.m.f135153a;
                if (i44 != 0) {
                    if ((i16 & 8) != 0) {
                        strQ = gl1.y.Q(o0VarE, R.string.lbl_next);
                        i17 &= -7169;
                    } else {
                        strQ = str5;
                    }
                    if (i48 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z18 = true;
                    }
                    if ((i16 & 64) != 0) {
                        fVarA = i53.a.a(new i3("EXIT", gl1.y.Q(o0VarE, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        i17 &= -3670017;
                    } else {
                        fVarA = fVar;
                    }
                    if (i24 != 0) {
                        str6 = null;
                    }
                    if (i26 != 0) {
                        objQ2 = o0VarE.q();
                        aVar6.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f(12);
                            o0VarE.K(objQ2);
                        }
                        aVar7 = (e23.a) objQ2;
                    } else {
                        aVar7 = aVar;
                    }
                    if (i28 != 0) {
                        vVar3 = s21.v.ENABLED;
                    } else {
                        vVar3 = vVar;
                    }
                    if (i34 != 0) {
                        z27 = false;
                    } else {
                        z27 = z16;
                    }
                    if (i37 != 0) {
                        objQ = o0VarE.q();
                        aVar6.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f(13);
                            o0VarE.K(objQ);
                        }
                        aVar8 = (e23.a) objQ;
                    } else {
                        aVar8 = aVar2;
                    }
                    str9 = strQ;
                    aVar9 = aVar7;
                    z28 = z17;
                    str10 = str6;
                    z29 = z18;
                    vVar4 = vVar3;
                } else {
                    if ((i16 & 8) != 0) {
                        strQ = gl1.y.Q(o0VarE, R.string.lbl_next);
                        i17 &= -7169;
                    } else {
                        strQ = str5;
                    }
                    if (i48 != 0) {
                        z17 = false;
                    }
                    if (i18 != 0) {
                        z18 = true;
                    }
                    if ((i16 & 64) != 0) {
                        fVarA = i53.a.a(new i3("EXIT", gl1.y.Q(o0VarE, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        i17 &= -3670017;
                    } else {
                        fVarA = fVar;
                    }
                    if (i24 != 0) {
                        str6 = null;
                    }
                    if (i26 != 0) {
                        objQ2 = o0VarE.q();
                        aVar6.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f(12);
                            o0VarE.K(objQ2);
                        }
                        aVar7 = (e23.a) objQ2;
                    } else {
                        aVar7 = aVar;
                    }
                    if (i28 != 0) {
                        vVar3 = s21.v.ENABLED;
                    } else {
                        vVar3 = vVar;
                    }
                    if (i34 != 0) {
                        z27 = false;
                    } else {
                        z27 = z16;
                    }
                    if (i37 != 0) {
                        objQ = o0VarE.q();
                        aVar6.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f(13);
                            o0VarE.K(objQ);
                        }
                        aVar8 = (e23.a) objQ;
                    } else {
                        aVar8 = aVar2;
                    }
                    str9 = strQ;
                    aVar9 = aVar7;
                    z28 = z17;
                    str10 = str6;
                    z29 = z18;
                    vVar4 = vVar3;
                }
                o0VarE.h0();
                x1 x1Var5 = p3.n.f135158a;
                s21.z.a aVar16 = s21.z.f156209c;
                vVarI = m0Var.f111904b.i();
                if (vVarI != null) {
                    str11 = null;
                } else {
                    str11 = null;
                }
                aVar16.getClass();
                if (str11 != null) {
                    strF0 = d53.w.f0(str11, '?');
                } else {
                    strF0 = null;
                }
                it = s21.z.f156222p.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(gl1.y.J(p005kotlin.jvm.internal.s0.f105811a.b(((s21.z) next).f156223a.getClass())).getF158591b().getF103221c(), strF0));
                zVar = (s21.z) next;
                int size5 = hVar.size();
                arrayList = new ArrayList();
                while (r11.hasNext()) {
                    e23.a aVar17 = aVar8;
                    if (((s21.z) obj).f156224b == 0.0d) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    if (z35) {
                        arrayList.add(obj);
                    }
                    aVar8 = aVar17;
                }
                e23.a aVar18 = aVar8;
                final double size6 = size5 - arrayList.size();
                if (zVar != null) {
                    d14 = zVar.f156224b;
                } else {
                    d14 = 0.0d;
                }
                objQ3 = o0VarE.q();
                aVar6.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ3 == c2565a) {
                    objQ3 = p3.p0.n(Boolean.TRUE);
                    o0VarE.K(objQ3);
                }
                p1Var = (p1) objQ3;
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objQ4);
                }
                p1Var2 = (p1) objQ4;
                boolean zBooleanValue3 = ((Boolean) p1Var.getF182175a()).booleanValue();
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = new p40.q0(p1Var, p1Var2, 8);
                    o0VarE.K(objQ5);
                }
                c.w.a(48, 0, (e23.a) objQ5, o0VarE, zBooleanValue3);
                Boolean bool3 = (Boolean) p1Var2.getF182175a();
                bool3.getClass();
                if ((i39 & 7168) == 2048) {
                }
                objQ6 = o0VarE.q();
                if (z34) {
                    objQ6 = new c1(aVar3, p1Var2, null);
                    o0VarE.K(objQ6);
                } else {
                    objQ6 = new c1(aVar3, p1Var2, null);
                    o0VarE.K(objQ6);
                }
                p3.l0.e((e23.p) objQ6, bool3, o0VarE);
                c2.n0 n0Var3 = n3.f22788a;
                i53.f fVar5 = fVarA;
                z02.d.a(z28, z3.f.c(1744360282, new bt1.m(str4, aVar3, fVar5, z27, aVar18), o0VarE), z3.f.c(1605574875, new p21.b(feVar, 16), o0VarE), null, new c2.n0(0, 0, 0, 0), z3.f.c(1189218654, new e23.p() { // from class: t21.a1
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        float f14;
                        h4.g.a aVar19;
                        h5.g.a.C1623g c1623g;
                        h5.g.a.b bVar;
                        h5.g.a.e eVar2;
                        c2.b0 b0Var;
                        h5.e0.a aVar110;
                        h5.g.a.b bVar2;
                        p3.m mVar2;
                        boolean z36;
                        s21.v vVar5;
                        h4.r.a aVar111;
                        p3.m mVar3 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            x1 x1Var6 = p3.n.f135158a;
                            h4.r.a aVar112 = h4.r.S;
                            h4.r rVarS = c2.l.s(u1.n.e(x2.c(aVar112, 1.0f), tn.k.a(d92.b.f58623a, mVar3), m1.f128891a));
                            c2.j.f22691a.getClass();
                            c2.j.k kVar = c2.j.f22694d;
                            h4.d.f81522a.getClass();
                            h4.g.a aVar113 = h4.d.a.f81536n;
                            c2.z zVarA = c2.y.a(kVar, aVar113, mVar3, 0);
                            int iHashCode = Long.hashCode(mVar3.getU());
                            i2 i2VarX = mVar3.x();
                            h4.r rVarC = h4.k.c(rVarS, mVar3);
                            h5.g.V.getClass();
                            h5.e0.a aVar114 = h5.g.a.f81805b;
                            if (mVar3.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar3.z();
                            if (mVar3.getT()) {
                                mVar3.M(aVar114);
                            } else {
                                mVar3.c();
                            }
                            h5.g.a.e eVar3 = h5.g.a.f81810g;
                            b4.c(eVar3, zVarA, mVar3);
                            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                            b4.c(c1623g2, i2VarX, mVar3);
                            h5.g.a.b bVar3 = h5.g.a.f81813j;
                            if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar3, iHashCode, bVar3);
                            }
                            h5.g.a.f fVar6 = h5.g.a.f81807d;
                            b4.c(fVar6, rVarC, mVar3);
                            c2.b0 b0Var2 = c2.b0.f22601a;
                            if (z29) {
                                mVar3.C(-654410468);
                                h4.r rVarF = x2.f(aVar112, 1.0f);
                                d92.b.f58625c.getClass();
                                j92.e eVar4 = j92.b.f97899b;
                                h4.r rVarZ = c2.l.z(rVarF, eVar4.f97920e, eVar4.f97918c);
                                o4.d0 d0VarA = o4.d0.a(d92.b.a(mVar3).e().g());
                                gl.c.f77766a.getClass();
                                eVar2 = eVar3;
                                aVar19 = aVar113;
                                c1623g = c1623g2;
                                b0Var = b0Var2;
                                bVar = bVar3;
                                f14 = 1.0f;
                                g02.f1.i(rVarZ, d0VarA, i53.a.a(new g02.t0(d14, gl.c.a(mVar3).f(), null)), size6, 0.0f, 0.0f, 0.0f, mVar3, 0, 112);
                                mVar3 = mVar3;
                                mVar3.f();
                            } else {
                                f14 = 1.0f;
                                aVar19 = aVar113;
                                c1623g = c1623g2;
                                bVar = bVar3;
                                eVar2 = eVar3;
                                b0Var = b0Var2;
                                mVar3.C(-653931890);
                                mVar3.f();
                            }
                            h4.r rVarB = a2.b(b0Var.a(aVar112, f14, true), a2.a(mVar3), true);
                            c2.z zVarA2 = c2.y.a(kVar, aVar19, mVar3, 0);
                            int iHashCode2 = Long.hashCode(mVar3.getU());
                            i2 i2VarX2 = mVar3.x();
                            h4.r rVarC2 = h4.k.c(rVarB, mVar3);
                            if (mVar3.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar3.z();
                            if (mVar3.getT()) {
                                aVar110 = aVar114;
                                mVar3.M(aVar110);
                            } else {
                                aVar110 = aVar114;
                                mVar3.c();
                            }
                            h5.g.a.e eVar5 = eVar2;
                            b4.c(eVar5, zVarA2, mVar3);
                            h5.g.a.C1623g c1623g3 = c1623g;
                            b4.c(c1623g3, i2VarX2, mVar3);
                            if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                                bVar2 = bVar;
                                v.h.z(iHashCode2, mVar3, iHashCode2, bVar2);
                            } else {
                                bVar2 = bVar;
                            }
                            b4.c(fVar6, rVarC2, mVar3);
                            eVar.invoke(b0Var, mVar3, 6);
                            mVar3.y();
                            s21.v vVar6 = s21.v.INVISIBLE;
                            s21.v vVar7 = vVar4;
                            if (vVar7 != vVar6) {
                                mVar3.C(-653606824);
                                h4.r rVarF2 = x2.f(aVar112, f14);
                                c2.z zVarA3 = c2.y.a(kVar, aVar19, mVar3, 0);
                                int iHashCode3 = Long.hashCode(mVar3.getU());
                                i2 i2VarX3 = mVar3.x();
                                h4.r rVarC3 = h4.k.c(rVarF2, mVar3);
                                if (mVar3.F() == null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar3.z();
                                if (mVar3.getT()) {
                                    mVar3.M(aVar110);
                                } else {
                                    mVar3.c();
                                }
                                b4.c(eVar5, zVarA3, mVar3);
                                b4.c(c1623g3, i2VarX3, mVar3);
                                if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                                    v.h.z(iHashCode3, mVar3, iHashCode3, bVar2);
                                }
                                b4.c(fVar6, rVarC3, mVar3);
                                String str12 = str10;
                                if (str12 == null) {
                                    mVar3.C(-404201805);
                                    mVar3.f();
                                    mVar2 = mVar3;
                                    vVar5 = vVar7;
                                    aVar111 = aVar112;
                                    z36 = false;
                                } else {
                                    mVar3.C(-404201804);
                                    Object objQ7 = mVar3.q();
                                    p3.m.f135153a.getClass();
                                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                                    if (objQ7 == c2565a2) {
                                        objQ7 = new u(10);
                                        mVar3.K(objQ7);
                                    }
                                    String strB = oi0.c.B(str12, (e23.l) objQ7, mVar3);
                                    d6.h.f57752b.getClass();
                                    int i49 = d6.h.f57757g;
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarF = d92.c.f(j92.f.f97933j, mVar3);
                                    h4.r rVarF3 = x2.f(aVar112, f14);
                                    boolean zB = mVar3.B(strB);
                                    Object objQ8 = mVar3.q();
                                    if (zB || objQ8 == c2565a2) {
                                        objQ8 = new s70.r0(strB, 15);
                                        mVar3.K(objQ8);
                                    }
                                    h4.r rVarC4 = p5.v.c((e23.l) objQ8, rVarF3, false);
                                    d92.b.f58625c.getClass();
                                    j92.e eVar6 = j92.b.f97899b;
                                    float f15 = eVar6.f97920e;
                                    mVar2 = mVar3;
                                    z36 = false;
                                    vVar5 = vVar7;
                                    aVar111 = aVar112;
                                    mh.c(str12, c2.l.C(rVarC4, f15, eVar6.f97918c, f15, 0.0f, 8), 0L, null, 0L, null, 0L, d6.h.a(i49), 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 130044);
                                    Unit unit = Unit.INSTANCE;
                                    mVar2.f();
                                }
                                l72.f0 f0Var = l72.f0.f110999a;
                                h4.r rVarF4 = x2.f(aVar111, f14);
                                d92.b.f58625c.getClass();
                                j92.e eVar7 = j92.b.f97899b;
                                mVar3 = mVar2;
                                f0Var.d(0, 1, aVar9, c2.l.C(c2.l.A(rVarF4, eVar7.f97920e, 0.0f, 2), 0.0f, eVar7.f97920e, 0.0f, eVar7.f97921f, 5), str9, mVar3, null, vVar5 == s21.v.ENABLED ? true : z36);
                                mVar3.y();
                                mVar3.f();
                            } else {
                                mVar3.C(-651986578);
                                mVar3.f();
                            }
                            mVar3.y();
                        } else {
                            mVar3.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, ((i17 >> 12) & 14) | 197040, 8);
                x1 x1Var6 = p3.n.f135158a;
                z24 = z28;
                z26 = z27;
                z25 = z29;
                vVar2 = vVar4;
                str8 = str10;
                str7 = str9;
                aVar4 = aVar9;
                fVar2 = fVar5;
                aVar5 = aVar18;
            } else {
                o0VarE.e();
                fVar2 = fVar;
                aVar4 = aVar;
                z24 = z17;
                str7 = str5;
                str8 = str6;
                z25 = z18;
                vVar2 = vVar;
                z26 = z16;
                aVar5 = aVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b1(str, feVar, m0Var, str7, z24, z25, fVar2, str8, aVar4, vVar2, hVar, z26, aVar5, aVar3, eVar, i14, i15, i16);
            }
        }
        i17 |= C.ENCODING_PCM_32BIT;
        if ((i15 & 6) == 0) {
            if (o0VarE.B(hVar)) {
                i45 = 4;
            } else {
                i45 = 2;
            }
            i30 = i15 | i45;
        } else {
            i30 = i15;
        }
        i34 = i16 & 2048;
        if (i34 != 0) {
            i30 |= 48;
        } else if ((i15 & 48) != 0) {
            if (o0VarE.h(z16)) {
                i35 = 32;
            } else {
                i35 = 16;
            }
            i30 |= i35;
        }
        i36 = i30;
        i37 = i16 & 4096;
        if (i37 != 0) {
            i38 = i36 | 384;
        } else if ((i15 & 384) == 0) {
            i38 = i36 | (o0VarE.r(aVar2) ? 256 : 128);
        } else {
            i38 = i36;
        }
        if ((i15 & 3072) == 0) {
            i38 |= o0VarE.r(aVar3) ? 2048 : 1024;
        }
        if ((i15 & 24576) != 0) {
            i38 |= o0VarE.r(eVar) ? 16384 : 8192;
        }
        i39 = i38;
        if ((i17 & 306783379) == 306783378) {
            z19 = true;
        } else {
            z19 = true;
        }
        if (o0VarE.n(i17 & 1, z19)) {
            o0VarE.G0();
            i44 = i14 & 1;
            aVar6 = p3.m.f135153a;
            if (i44 != 0) {
                if ((i16 & 8) != 0) {
                    strQ = gl1.y.Q(o0VarE, R.string.lbl_next);
                    i17 &= -7169;
                } else {
                    strQ = str5;
                }
                if (i48 != 0) {
                    z17 = false;
                }
                if (i18 != 0) {
                    z18 = true;
                }
                if ((i16 & 64) != 0) {
                    fVarA = i53.a.a(new i3("EXIT", gl1.y.Q(o0VarE, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    i17 &= -3670017;
                } else {
                    fVarA = fVar;
                }
                if (i24 != 0) {
                    str6 = null;
                }
                if (i26 != 0) {
                    objQ2 = o0VarE.q();
                    aVar6.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new f(12);
                        o0VarE.K(objQ2);
                    }
                    aVar7 = (e23.a) objQ2;
                } else {
                    aVar7 = aVar;
                }
                if (i28 != 0) {
                    vVar3 = s21.v.ENABLED;
                } else {
                    vVar3 = vVar;
                }
                if (i34 != 0) {
                    z27 = false;
                } else {
                    z27 = z16;
                }
                if (i37 != 0) {
                    objQ = o0VarE.q();
                    aVar6.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new f(13);
                        o0VarE.K(objQ);
                    }
                    aVar8 = (e23.a) objQ;
                } else {
                    aVar8 = aVar2;
                }
                str9 = strQ;
                aVar9 = aVar7;
                z28 = z17;
                str10 = str6;
                z29 = z18;
                vVar4 = vVar3;
            } else {
                if ((i16 & 8) != 0) {
                    strQ = gl1.y.Q(o0VarE, R.string.lbl_next);
                    i17 &= -7169;
                } else {
                    strQ = str5;
                }
                if (i48 != 0) {
                    z17 = false;
                }
                if (i18 != 0) {
                    z18 = true;
                }
                if ((i16 & 64) != 0) {
                    fVarA = i53.a.a(new i3("EXIT", gl1.y.Q(o0VarE, R.string.lbl_exit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    i17 &= -3670017;
                } else {
                    fVarA = fVar;
                }
                if (i24 != 0) {
                    str6 = null;
                }
                if (i26 != 0) {
                    objQ2 = o0VarE.q();
                    aVar6.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new f(12);
                        o0VarE.K(objQ2);
                    }
                    aVar7 = (e23.a) objQ2;
                } else {
                    aVar7 = aVar;
                }
                if (i28 != 0) {
                    vVar3 = s21.v.ENABLED;
                } else {
                    vVar3 = vVar;
                }
                if (i34 != 0) {
                    z27 = false;
                } else {
                    z27 = z16;
                }
                if (i37 != 0) {
                    objQ = o0VarE.q();
                    aVar6.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new f(13);
                        o0VarE.K(objQ);
                    }
                    aVar8 = (e23.a) objQ;
                } else {
                    aVar8 = aVar2;
                }
                str9 = strQ;
                aVar9 = aVar7;
                z28 = z17;
                str10 = str6;
                z29 = z18;
                vVar4 = vVar3;
            }
            o0VarE.h0();
            x1 x1Var7 = p3.n.f135158a;
            s21.z.a aVar19 = s21.z.f156209c;
            vVarI = m0Var.f111904b.i();
            if (vVarI != null) {
                str11 = null;
            } else {
                str11 = null;
            }
            aVar19.getClass();
            if (str11 != null) {
                strF0 = d53.w.f0(str11, '?');
            } else {
                strF0 = null;
            }
            it = s21.z.f156222p.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(gl1.y.J(p005kotlin.jvm.internal.s0.f105811a.b(((s21.z) next).f156223a.getClass())).getF158591b().getF103221c(), strF0));
            zVar = (s21.z) next;
            int size7 = hVar.size();
            arrayList = new ArrayList();
            while (r11.hasNext()) {
                e23.a aVar110 = aVar8;
                if (((s21.z) obj).f156224b == 0.0d) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                if (z35) {
                    arrayList.add(obj);
                }
                aVar8 = aVar110;
            }
            e23.a aVar111 = aVar8;
            final double size8 = size7 - arrayList.size();
            if (zVar != null) {
                d14 = zVar.f156224b;
            } else {
                d14 = 0.0d;
            }
            objQ3 = o0VarE.q();
            aVar6.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.TRUE);
                o0VarE.K(objQ3);
            }
            p1Var = (p1) objQ3;
            objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p1Var2 = (p1) objQ4;
            boolean zBooleanValue4 = ((Boolean) p1Var.getF182175a()).booleanValue();
            objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new p40.q0(p1Var, p1Var2, 8);
                o0VarE.K(objQ5);
            }
            c.w.a(48, 0, (e23.a) objQ5, o0VarE, zBooleanValue4);
            Boolean bool4 = (Boolean) p1Var2.getF182175a();
            bool4.getClass();
            if ((i39 & 7168) == 2048) {
            }
            objQ6 = o0VarE.q();
            if (z34) {
                objQ6 = new c1(aVar3, p1Var2, null);
                o0VarE.K(objQ6);
            } else {
                objQ6 = new c1(aVar3, p1Var2, null);
                o0VarE.K(objQ6);
            }
            p3.l0.e((e23.p) objQ6, bool4, o0VarE);
            c2.n0 n0Var4 = n3.f22788a;
            i53.f fVar6 = fVarA;
            z02.d.a(z28, z3.f.c(1744360282, new bt1.m(str4, aVar3, fVar6, z27, aVar111), o0VarE), z3.f.c(1605574875, new p21.b(feVar, 16), o0VarE), null, new c2.n0(0, 0, 0, 0), z3.f.c(1189218654, new e23.p() { // from class: t21.a1
                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    float f14;
                    h4.g.a aVar112;
                    h5.g.a.C1623g c1623g;
                    h5.g.a.b bVar;
                    h5.g.a.e eVar2;
                    c2.b0 b0Var;
                    h5.e0.a aVar113;
                    h5.g.a.b bVar2;
                    p3.m mVar2;
                    boolean z36;
                    s21.v vVar5;
                    h4.r.a aVar114;
                    p3.m mVar3 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var8 = p3.n.f135158a;
                        h4.r.a aVar115 = h4.r.S;
                        h4.r rVarS = c2.l.s(u1.n.e(x2.c(aVar115, 1.0f), tn.k.a(d92.b.f58623a, mVar3), m1.f128891a));
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        h4.g.a aVar116 = h4.d.a.f81536n;
                        c2.z zVarA = c2.y.a(kVar, aVar116, mVar3, 0);
                        int iHashCode = Long.hashCode(mVar3.getU());
                        i2 i2VarX = mVar3.x();
                        h4.r rVarC = h4.k.c(rVarS, mVar3);
                        h5.g.V.getClass();
                        h5.e0.a aVar117 = h5.g.a.f81805b;
                        if (mVar3.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar117);
                        } else {
                            mVar3.c();
                        }
                        h5.g.a.e eVar3 = h5.g.a.f81810g;
                        b4.c(eVar3, zVarA, mVar3);
                        h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                        b4.c(c1623g2, i2VarX, mVar3);
                        h5.g.a.b bVar3 = h5.g.a.f81813j;
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar3, iHashCode, bVar3);
                        }
                        h5.g.a.f fVar7 = h5.g.a.f81807d;
                        b4.c(fVar7, rVarC, mVar3);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        if (z29) {
                            mVar3.C(-654410468);
                            h4.r rVarF = x2.f(aVar115, 1.0f);
                            d92.b.f58625c.getClass();
                            j92.e eVar4 = j92.b.f97899b;
                            h4.r rVarZ = c2.l.z(rVarF, eVar4.f97920e, eVar4.f97918c);
                            o4.d0 d0VarA = o4.d0.a(d92.b.a(mVar3).e().g());
                            gl.c.f77766a.getClass();
                            eVar2 = eVar3;
                            aVar112 = aVar116;
                            c1623g = c1623g2;
                            b0Var = b0Var2;
                            bVar = bVar3;
                            f14 = 1.0f;
                            g02.f1.i(rVarZ, d0VarA, i53.a.a(new g02.t0(d14, gl.c.a(mVar3).f(), null)), size8, 0.0f, 0.0f, 0.0f, mVar3, 0, 112);
                            mVar3 = mVar3;
                            mVar3.f();
                        } else {
                            f14 = 1.0f;
                            aVar112 = aVar116;
                            c1623g = c1623g2;
                            bVar = bVar3;
                            eVar2 = eVar3;
                            b0Var = b0Var2;
                            mVar3.C(-653931890);
                            mVar3.f();
                        }
                        h4.r rVarB = a2.b(b0Var.a(aVar115, f14, true), a2.a(mVar3), true);
                        c2.z zVarA2 = c2.y.a(kVar, aVar112, mVar3, 0);
                        int iHashCode2 = Long.hashCode(mVar3.getU());
                        i2 i2VarX2 = mVar3.x();
                        h4.r rVarC2 = h4.k.c(rVarB, mVar3);
                        if (mVar3.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            aVar113 = aVar117;
                            mVar3.M(aVar113);
                        } else {
                            aVar113 = aVar117;
                            mVar3.c();
                        }
                        h5.g.a.e eVar5 = eVar2;
                        b4.c(eVar5, zVarA2, mVar3);
                        h5.g.a.C1623g c1623g3 = c1623g;
                        b4.c(c1623g3, i2VarX2, mVar3);
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                            bVar2 = bVar;
                            v.h.z(iHashCode2, mVar3, iHashCode2, bVar2);
                        } else {
                            bVar2 = bVar;
                        }
                        b4.c(fVar7, rVarC2, mVar3);
                        eVar.invoke(b0Var, mVar3, 6);
                        mVar3.y();
                        s21.v vVar6 = s21.v.INVISIBLE;
                        s21.v vVar7 = vVar4;
                        if (vVar7 != vVar6) {
                            mVar3.C(-653606824);
                            h4.r rVarF2 = x2.f(aVar115, f14);
                            c2.z zVarA3 = c2.y.a(kVar, aVar112, mVar3, 0);
                            int iHashCode3 = Long.hashCode(mVar3.getU());
                            i2 i2VarX3 = mVar3.x();
                            h4.r rVarC3 = h4.k.c(rVarF2, mVar3);
                            if (mVar3.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar3.z();
                            if (mVar3.getT()) {
                                mVar3.M(aVar113);
                            } else {
                                mVar3.c();
                            }
                            b4.c(eVar5, zVarA3, mVar3);
                            b4.c(c1623g3, i2VarX3, mVar3);
                            if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                                v.h.z(iHashCode3, mVar3, iHashCode3, bVar2);
                            }
                            b4.c(fVar7, rVarC3, mVar3);
                            String str12 = str10;
                            if (str12 == null) {
                                mVar3.C(-404201805);
                                mVar3.f();
                                mVar2 = mVar3;
                                vVar5 = vVar7;
                                aVar114 = aVar115;
                                z36 = false;
                            } else {
                                mVar3.C(-404201804);
                                Object objQ7 = mVar3.q();
                                p3.m.f135153a.getClass();
                                p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                                if (objQ7 == c2565a2) {
                                    objQ7 = new u(10);
                                    mVar3.K(objQ7);
                                }
                                String strB = oi0.c.B(str12, (e23.l) objQ7, mVar3);
                                d6.h.f57752b.getClass();
                                int i49 = d6.h.f57757g;
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarF = d92.c.f(j92.f.f97933j, mVar3);
                                h4.r rVarF3 = x2.f(aVar115, f14);
                                boolean zB = mVar3.B(strB);
                                Object objQ8 = mVar3.q();
                                if (zB || objQ8 == c2565a2) {
                                    objQ8 = new s70.r0(strB, 15);
                                    mVar3.K(objQ8);
                                }
                                h4.r rVarC4 = p5.v.c((e23.l) objQ8, rVarF3, false);
                                d92.b.f58625c.getClass();
                                j92.e eVar6 = j92.b.f97899b;
                                float f15 = eVar6.f97920e;
                                mVar2 = mVar3;
                                z36 = false;
                                vVar5 = vVar7;
                                aVar114 = aVar115;
                                mh.c(str12, c2.l.C(rVarC4, f15, eVar6.f97918c, f15, 0.0f, 8), 0L, null, 0L, null, 0L, d6.h.a(i49), 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 130044);
                                Unit unit = Unit.INSTANCE;
                                mVar2.f();
                            }
                            l72.f0 f0Var = l72.f0.f110999a;
                            h4.r rVarF4 = x2.f(aVar114, f14);
                            d92.b.f58625c.getClass();
                            j92.e eVar7 = j92.b.f97899b;
                            mVar3 = mVar2;
                            f0Var.d(0, 1, aVar9, c2.l.C(c2.l.A(rVarF4, eVar7.f97920e, 0.0f, 2), 0.0f, eVar7.f97920e, 0.0f, eVar7.f97921f, 5), str9, mVar3, null, vVar5 == s21.v.ENABLED ? true : z36);
                            mVar3.y();
                            mVar3.f();
                        } else {
                            mVar3.C(-651986578);
                            mVar3.f();
                        }
                        mVar3.y();
                    } else {
                        mVar3.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, ((i17 >> 12) & 14) | 197040, 8);
            x1 x1Var8 = p3.n.f135158a;
            z24 = z28;
            z26 = z27;
            z25 = z29;
            vVar2 = vVar4;
            str8 = str10;
            str7 = str9;
            aVar4 = aVar9;
            fVar2 = fVar6;
            aVar5 = aVar111;
        } else {
            o0VarE.e();
            fVar2 = fVar;
            aVar4 = aVar;
            z24 = z17;
            str7 = str5;
            str8 = str6;
            z25 = z18;
            vVar2 = vVar;
            z26 = z16;
            aVar5 = aVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b1(str, feVar, m0Var, str7, z24, z25, fVar2, str8, aVar4, vVar2, hVar, z26, aVar5, aVar3, eVar, i14, i15, i16);
        }
    }
}
