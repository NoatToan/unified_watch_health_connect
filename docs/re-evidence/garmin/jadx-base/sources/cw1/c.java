package cw1;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.C;
import i3.i7;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import l72.g3;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static final void a(int i14, h4.r rVar, String str, p3.m mVar) {
        p3.o0 o0Var;
        int i15;
        p3.o0 o0VarE = mVar.E(1063198147);
        int i16 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.B(str) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            s5.w wVar = new s5.w(0, 0, 0L, new d6.n(0L, o53.f0.B(10), 1, null), (s5.a0) null, (d6.f) null, 0, 0, (d6.o) null, 503, (p005kotlin.jvm.internal.j) null);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(rVar, j92.b.f97899b.f97918c, 0.0f, 0.0f, 0.0f, 14);
            s5.c.b bVar = new s5.c.b(0, 1, null);
            int i17 = bVar.i(wVar);
            try {
                bVar.b("•  ");
                bVar.b(str);
                Unit unit = Unit.INSTANCE;
                bVar.f(i17);
                s5.c cVarK = bVar.k();
                d92.b.f58624b.getClass();
                i15 = 1;
                o0Var = o0VarE;
                mh.d(cVarK, rVarC, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.b(j92.f.f97933j, o0VarE), o0Var, 0, 0, 262140);
            } catch (Throwable th3) {
                bVar.f(i17);
                throw th3;
            }
        } else {
            o0Var = o0VarE;
            i15 = 1;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq.g(rVar, str, i14, i15);
        }
    }

    public static final void b(h4.r rVar, u4.d dVar, String str, p3.m mVar, int i14) {
        int i15;
        str.getClass();
        p3.o0 o0VarE = mVar.E(873386931);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            s2 s2VarF = hb.a.f(jVar, j92.b.f97899b.f97918c, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarF, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            if (dVar == null) {
                o0VarE.C(1277174202);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1277174203);
                i7.a(u4.p.b(dVar, o0VarE), null, x2.q(h4.r.S, h(o0VarE)), com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), o0VarE, 56, 0);
                o0VarE.g0(false);
            }
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97933j), o0VarE);
            d6.h.f57752b.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, (i15 >> 6) & 14, 0, 130046);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(rVar, dVar, str, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0164  */
    /* JADX WARN: Code duplicated, block: B:102:0x0169  */
    /* JADX WARN: Code duplicated, block: B:104:0x0171  */
    /* JADX WARN: Code duplicated, block: B:108:0x0179  */
    /* JADX WARN: Code duplicated, block: B:109:0x0180  */
    /* JADX WARN: Code duplicated, block: B:111:0x0188  */
    /* JADX WARN: Code duplicated, block: B:115:0x0194  */
    /* JADX WARN: Code duplicated, block: B:117:0x019b  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:132:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:134:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:137:0x01da  */
    /* JADX WARN: Code duplicated, block: B:138:0x01df  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:147:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:149:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:152:0x0203  */
    /* JADX WARN: Code duplicated, block: B:153:0x020a  */
    /* JADX WARN: Code duplicated, block: B:155:0x020e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0210  */
    /* JADX WARN: Code duplicated, block: B:158:0x0214  */
    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX WARN: Code duplicated, block: B:161:0x0219  */
    /* JADX WARN: Code duplicated, block: B:163:0x0226  */
    /* JADX WARN: Code duplicated, block: B:165:0x0233  */
    /* JADX WARN: Code duplicated, block: B:167:0x0237  */
    /* JADX WARN: Code duplicated, block: B:168:0x023a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:171:0x029a  */
    /* JADX WARN: Code duplicated, block: B:173:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:174:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:177:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:179:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:182:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:186:0x03be A[LOOP:1: B:184:0x03b8->B:186:0x03be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:190:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:191:0x0402  */
    /* JADX WARN: Code duplicated, block: B:195:0x044d A[LOOP:0: B:193:0x0447->B:195:0x044d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:198:0x0489  */
    /* JADX WARN: Code duplicated, block: B:199:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:202:0x04df  */
    /* JADX WARN: Code duplicated, block: B:203:0x051e  */
    /* JADX WARN: Code duplicated, block: B:206:0x052e  */
    /* JADX WARN: Code duplicated, block: B:207:0x056d  */
    /* JADX WARN: Code duplicated, block: B:210:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:212:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:215:0x05de  */
    /* JADX WARN: Code duplicated, block: B:217:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:220:0x0603  */
    /* JADX WARN: Code duplicated, block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x0101  */
    /* JADX WARN: Code duplicated, block: B:69:0x0104  */
    /* JADX WARN: Code duplicated, block: B:73:0x010f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0116  */
    /* JADX WARN: Code duplicated, block: B:76:0x0120  */
    /* JADX WARN: Code duplicated, block: B:77:0x0123  */
    /* JADX WARN: Code duplicated, block: B:81:0x012b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0131  */
    /* JADX WARN: Code duplicated, block: B:84:0x0134  */
    /* JADX WARN: Code duplicated, block: B:88:0x0140  */
    /* JADX WARN: Code duplicated, block: B:90:0x0145  */
    /* JADX WARN: Code duplicated, block: B:92:0x0149  */
    /* JADX WARN: Code duplicated, block: B:94:0x0151  */
    /* JADX WARN: Code duplicated, block: B:98:0x015d  */
    public static final void c(h4.r rVar, Integer num, t4.d dVar, Integer num2, final u4.d dVar2, final String str, final String str2, final String str3, i53.c cVar, i53.c cVar2, i53.c cVar3, i53.c cVar4, final String str4, boolean z14, boolean z15, e23.a aVar, e23.a aVar2, p3.m mVar, final int i14, final int i15, final int i16) {
        Integer num3;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        int i35;
        int i36;
        i53.c<String> cVar5;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i64;
        int i65;
        boolean z16;
        int i66;
        int i67;
        int i68;
        int i69;
        boolean z17;
        final h4.r rVar2;
        final i53.c cVar6;
        final i53.c cVar7;
        final i53.c cVar8;
        final boolean z18;
        final e23.a aVar3;
        final e23.a aVar4;
        final boolean z19;
        p3.o0 o0Var;
        final Integer num4;
        final t4.d dVar3;
        final Integer num5;
        final i53.c cVar9;
        p2 p2VarI0;
        h4.r.a aVar5;
        Integer num6;
        int i74;
        t4.d dVar4;
        Integer num7;
        i53.c cVarB;
        i53.c cVarB2;
        i53.c<jv1.k> cVarB3;
        boolean z24;
        e23.a aVar6;
        e23.a aVar7;
        Integer num8;
        j92.b bVar;
        e23.a aVar8;
        j92.e eVar;
        boolean z25;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar9;
        boolean z26;
        h5.g.a.b bVar2;
        boolean z27;
        boolean z28;
        z3.e eVar2;
        Object objQ;
        int i75;
        str.getClass();
        str2.getClass();
        str3.getClass();
        p3.o0 o0VarE = mVar.E(275446391);
        int i76 = i14 | 6;
        int i77 = i16 & 2;
        if (i77 == 0) {
            if ((i14 & 48) == 0) {
                num3 = num;
                i76 |= o0VarE.B(num3) ? 32 : 16;
            }
            i17 = i16 & 4;
            if (i17 != 0) {
                i19 = i76 | 384;
            } else {
                if (o0VarE.r(dVar)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i19 = i76 | i18;
            }
            i24 = i19 | 3072;
            i25 = i16 & 16;
            if (i25 != 0) {
                i27 = i19 | 27648;
            } else {
                if (o0VarE.B(num2)) {
                    i26 = 16384;
                } else {
                    i26 = 8192;
                }
                i27 = i24 | i26;
            }
            if (o0VarE.B(dVar2)) {
                i28 = 131072;
            } else {
                i28 = 65536;
            }
            int i78 = i27 | i28;
            if (o0VarE.B(str)) {
                i29 = 1048576;
            } else {
                i29 = 524288;
            }
            int i79 = i78 | i29;
            if (o0VarE.B(str2)) {
                i30 = 8388608;
            } else {
                i30 = 4194304;
            }
            int i84 = i79 | i30;
            if (o0VarE.B(str3)) {
                i34 = 67108864;
            } else {
                i34 = 33554432;
            }
            i35 = i84 | i34;
            i36 = i16 & 512;
            if (i36 != 0) {
                i38 = i35 | C.ENCODING_PCM_32BIT;
                cVar5 = cVar;
            } else {
                cVar5 = cVar;
                if (o0VarE.B(cVar5)) {
                    i37 = 536870912;
                } else {
                    i37 = 268435456;
                }
                i38 = i35 | i37;
            }
            i39 = i38;
            i44 = i16 & 1024;
            if (i44 != 0) {
                i46 = i15 | 6;
            } else {
                if (o0VarE.B(cVar2)) {
                    i45 = 4;
                } else {
                    i45 = 2;
                }
                i46 = i15 | i45;
            }
            i47 = i16 & 2048;
            if (i47 != 0) {
                i49 = i46 | 48;
            } else {
                if (o0VarE.B(cVar3)) {
                    i48 = 32;
                } else {
                    i48 = 16;
                }
                i49 = i46 | i48;
            }
            i54 = i49;
            i55 = i16 & 4096;
            if (i55 != 0) {
                i57 = i54 | 384;
            } else {
                if (o0VarE.r(cVar4)) {
                    i56 = 256;
                } else {
                    i56 = 128;
                }
                i57 = i54 | i56;
            }
            if ((i15 & 3072) == 0) {
                if (o0VarE.B(str4)) {
                    i75 = 2048;
                } else {
                    i75 = 1024;
                }
                i57 |= i75;
            }
            i58 = i57;
            i59 = i16 & 16384;
            if (i59 != 0) {
                if ((i15 & 24576) == 0) {
                    i58 |= o0VarE.h(z14) ? 16384 : 8192;
                }
                i64 = i58 | 196608;
                i65 = i16 & 65536;
                if (i65 != 0) {
                    if ((1572864 & i15) == 0) {
                        z16 = z15;
                        i64 |= o0VarE.h(z16) ? 1048576 : 524288;
                    }
                    i66 = i16 & 131072;
                    if (i66 != 0) {
                        i67 = i64 | 12582912;
                    } else {
                        i67 = i64 | (o0VarE.r(aVar) ? 8388608 : 4194304);
                    }
                    i68 = i16 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                    if (i68 != 0) {
                        i67 |= 100663296;
                    } else if ((i15 & 100663296) == 0) {
                        i67 |= o0VarE.r(aVar2) ? 67108864 : 33554432;
                    }
                    i69 = i67;
                    if ((i39 & 306783379) == 306783378 || (i69 & 38347923) != 38347922) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (o0VarE.n(i39 & 1, z17)) {
                        aVar5 = h4.r.S;
                        if (i77 != 0) {
                            i74 = i44;
                            num6 = null;
                        } else {
                            num6 = num3;
                            i74 = i44;
                        }
                        if (i17 != 0) {
                            dVar4 = null;
                        } else {
                            dVar4 = dVar;
                        }
                        if (i25 != 0) {
                            num7 = null;
                        } else {
                            num7 = num2;
                        }
                        if (i36 != 0) {
                            cVar5 = null;
                        }
                        if (i74 != 0) {
                            cVarB = j53.l.b();
                        } else {
                            cVarB = cVar2;
                        }
                        if (i47 != 0) {
                            cVarB2 = j53.l.b();
                        } else {
                            cVarB2 = cVar3;
                        }
                        if (i55 != 0) {
                            cVarB3 = j53.l.b();
                        } else {
                            cVarB3 = cVar4;
                        }
                        if (i59 != 0) {
                            z24 = false;
                        } else {
                            z24 = z14;
                        }
                        if (i65 != 0) {
                            z16 = false;
                        }
                        if (i66 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new com.google.accompanist.drawablepainter.a(16);
                                o0VarE.K(objQ);
                            }
                            aVar6 = (e23.a) objQ;
                        } else {
                            aVar6 = aVar;
                        }
                        if (i68 != 0) {
                            aVar7 = null;
                        } else {
                            aVar7 = aVar2;
                        }
                        x1 x1Var = p3.n.f135158a;
                        num8 = num6;
                        long jB = am.j.B(d92.b.f58623a, o0VarE);
                        bVar = d92.b.f58625c;
                        bVar.getClass();
                        aVar8 = aVar6;
                        eVar = j92.b.f97899b;
                        z25 = z16;
                        h4.r rVarE = u1.n.e(aVar5, jB, k2.i.a(eVar.f97918c));
                        bVar.getClass();
                        h4.r rVarB = l4.k.b(rVarE, k2.i.a(eVar.f97918c));
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = h4.k.c(rVarB, o0VarE);
                        h5.g.V.getClass();
                        aVar9 = h5.g.a.f81805b;
                        z26 = z24;
                        if (o0VarE.f135177b != null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar9);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                        b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                        bVar2 = h5.g.a.f81813j;
                        if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                        c2.b0 b0Var = c2.b0.f22601a;
                        int i85 = i69 >> 9;
                        e(null, num8, dVar4, num7, aVar7, o0VarE, (i39 & 65520) | (458752 & i85));
                        t4.d dVar5 = dVar4;
                        Integer num9 = num7;
                        e23.a aVar10 = aVar7;
                        bVar.getClass();
                        float f14 = eVar.f97920e;
                        bVar.getClass();
                        float f15 = eVar.f97920e;
                        bVar.getClass();
                        b(c2.l.C(aVar5, f14, eVar.f97918c, f15, 0.0f, 8), dVar2, str, o0VarE, (i39 >> 12) & 1008);
                        bVar.getClass();
                        float f16 = eVar.f97920e;
                        bVar.getClass();
                        float f17 = eVar.f97920e;
                        bVar.getClass();
                        h4.r rVarC2 = c2.l.C(aVar5, f16, eVar.f97918c, f17, 0.0f, 8);
                        j92.f fVar = d92.b.f58624b;
                        fVar.getClass();
                        mh.c(str2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, (i39 >> 21) & 14, 0, 131068);
                        bVar.getClass();
                        float f18 = eVar.f97920e;
                        bVar.getClass();
                        float f19 = eVar.f97920e;
                        bVar.getClass();
                        h4.r rVarC3 = c2.l.C(aVar5, f18, eVar.f97918c, f19, 0.0f, 8);
                        fVar.getClass();
                        mh.c(str3, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, (i39 >> 24) & 14, 0, 131068);
                        if (cVar5 == null) {
                            o0VarE.C(1465326525);
                            z27 = false;
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(1465326526);
                            for (String str5 : cVar5) {
                                h4.r.a aVar11 = h4.r.S;
                                d92.b.f58623a.getClass();
                                j92.b bVar3 = d92.b.f58625c;
                                bVar3.getClass();
                                j92.e eVar3 = j92.b.f97899b;
                                float f22 = eVar3.f97920e;
                                bVar3.getClass();
                                float f24 = eVar3.f97920e;
                                bVar3.getClass();
                                a(0, c2.l.C(aVar11, f22, eVar3.f97917b, f24, 0.0f, 8), str5, o0VarE);
                            }
                            z27 = false;
                            o0VarE.g0(false);
                            Unit unit = Unit.INSTANCE;
                        }
                        if (str4 == null) {
                            o0VarE.C(1465579392);
                            o0VarE.g0(z27);
                        } else {
                            o0VarE.C(1465579393);
                            h4.r.a aVar12 = h4.r.S;
                            d92.b.f58623a.getClass();
                            j92.b bVar4 = d92.b.f58625c;
                            bVar4.getClass();
                            j92.e eVar4 = j92.b.f97899b;
                            h4.r rVarA = c2.l.A(aVar12, eVar4.f97920e, 0.0f, 2);
                            bVar4.getClass();
                            g((i69 >> 6) & 112, c2.l.C(rVarA, 0.0f, eVar4.f97920e, 0.0f, 0.0f, 13), str4, o0VarE);
                            Unit unit2 = Unit.INSTANCE;
                            o0VarE.g0(false);
                        }
                        o0VarE.C(-1615282371);
                        for (jv1.k kVar2 : cVarB3) {
                            h4.r.a aVar13 = h4.r.S;
                            d92.b.f58623a.getClass();
                            j92.b bVar5 = d92.b.f58625c;
                            bVar5.getClass();
                            j92.e eVar5 = j92.b.f97899b;
                            float f25 = eVar5.f97920e;
                            bVar5.getClass();
                            float f26 = eVar5.f97920e;
                            bVar5.getClass();
                            d(0, c2.l.C(aVar13, f25, eVar5.f97918c, f26, 0.0f, 8), kVar2.f101072b, kVar2.f101071a, o0VarE);
                        }
                        o0VarE.g0(false);
                        if (z26) {
                            o0VarE.C(1466213963);
                            h4.r.a aVar14 = h4.r.S;
                            d92.b.f58623a.getClass();
                            j92.b bVar6 = d92.b.f58625c;
                            bVar6.getClass();
                            j92.e eVar6 = j92.b.f97899b;
                            h4.r rVarA2 = c2.l.A(aVar14, eVar6.f97920e, 0.0f, 2);
                            bVar6.getClass();
                            d(0, c2.l.C(rVarA2, 0.0f, eVar6.f97918c, 0.0f, 0.0f, 13), gl1.y.Q(o0VarE, R.string.optional_strength_workouts), p13.w.c(am.x0.f4309n1.f4362e), o0VarE);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(1466521793);
                            o0VarE.g0(false);
                        }
                        if (cVarB.isEmpty()) {
                            o0VarE.C(1466911649);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(1466607973);
                            h4.r.a aVar15 = h4.r.S;
                            d92.b.f58623a.getClass();
                            j92.b bVar7 = d92.b.f58625c;
                            bVar7.getClass();
                            j92.e eVar7 = j92.b.f97899b;
                            float f27 = eVar7.f97920e;
                            bVar7.getClass();
                            float f28 = eVar7.f97920e;
                            bVar7.getClass();
                            f((i69 << 6) & 896, c2.l.C(aVar15, f27, eVar7.f97918c, f28, 0.0f, 8), gl1.y.Q(o0VarE, R.string.required_list_header), cVarB, o0VarE);
                            o0VarE.g0(false);
                        }
                        if (cVarB2.isEmpty()) {
                            z28 = false;
                            o0VarE.C(1467265793);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(1466962117);
                            h4.r.a aVar16 = h4.r.S;
                            d92.b.f58623a.getClass();
                            j92.b bVar8 = d92.b.f58625c;
                            bVar8.getClass();
                            j92.e eVar8 = j92.b.f97899b;
                            float f29 = eVar8.f97920e;
                            bVar8.getClass();
                            float f34 = eVar8.f97920e;
                            bVar8.getClass();
                            f((i69 << 3) & 896, c2.l.C(aVar16, f29, eVar8.f97918c, f34, 0.0f, 8), gl1.y.Q(o0VarE, R.string.optional_list_header), cVarB2, o0VarE);
                            z28 = false;
                            o0VarE.g0(false);
                        }
                        o0VarE.C(1467323576);
                        o0VarE.g0(z28);
                        l72.f0 f0Var = l72.f0.f110999a;
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
                        d.f56011a.getClass();
                        if (z25) {
                            eVar2 = d.f56012b;
                        } else {
                            eVar2 = d.f56013c;
                        }
                        f0Var.h(eVar2, gl1.y.Q(o0VarE, R.string.select_plan), rVarY, false, aVar8, o0VarE, i85 & 57344, 8);
                        o0VarE.g0(true);
                        x1 x1Var2 = p3.n.f135158a;
                        z19 = z25;
                        z18 = z26;
                        rVar2 = aVar5;
                        o0Var = o0VarE;
                        cVar6 = cVarB;
                        cVar7 = cVarB2;
                        aVar3 = aVar8;
                        cVar8 = cVarB3;
                        num4 = num8;
                        dVar3 = dVar5;
                        num5 = num9;
                        aVar4 = aVar10;
                    } else {
                        o0VarE.e();
                        rVar2 = rVar;
                        cVar6 = cVar2;
                        cVar7 = cVar3;
                        cVar8 = cVar4;
                        z18 = z14;
                        aVar3 = aVar;
                        aVar4 = aVar2;
                        z19 = z16;
                        o0Var = o0VarE;
                        num4 = num3;
                        dVar3 = dVar;
                        num5 = num2;
                    }
                    cVar9 = cVar5;
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: cw1.b
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                c.c(rVar2, num4, dVar3, num5, dVar2, str, str2, str3, cVar9, cVar6, cVar7, cVar8, str4, z18, z19, aVar3, aVar4, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i64 = i58 | 1769472;
                z16 = z15;
                i66 = i16 & 131072;
                if (i66 != 0) {
                    i67 = i64 | 12582912;
                } else {
                    i67 = i64 | (o0VarE.r(aVar) ? 8388608 : 4194304);
                }
                i68 = i16 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                if (i68 != 0) {
                    i67 |= 100663296;
                } else if ((i15 & 100663296) == 0) {
                    i67 |= o0VarE.r(aVar2) ? 67108864 : 33554432;
                }
                i69 = i67;
                if ((i39 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (o0VarE.n(i39 & 1, z17)) {
                    aVar5 = h4.r.S;
                    if (i77 != 0) {
                        i74 = i44;
                        num6 = null;
                    } else {
                        num6 = num3;
                        i74 = i44;
                    }
                    if (i17 != 0) {
                        dVar4 = null;
                    } else {
                        dVar4 = dVar;
                    }
                    if (i25 != 0) {
                        num7 = null;
                    } else {
                        num7 = num2;
                    }
                    if (i36 != 0) {
                        cVar5 = null;
                    }
                    if (i74 != 0) {
                        cVarB = j53.l.b();
                    } else {
                        cVarB = cVar2;
                    }
                    if (i47 != 0) {
                        cVarB2 = j53.l.b();
                    } else {
                        cVarB2 = cVar3;
                    }
                    if (i55 != 0) {
                        cVarB3 = j53.l.b();
                    } else {
                        cVarB3 = cVar4;
                    }
                    if (i59 != 0) {
                        z24 = false;
                    } else {
                        z24 = z14;
                    }
                    if (i65 != 0) {
                        z16 = false;
                    }
                    if (i66 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new com.google.accompanist.drawablepainter.a(16);
                            o0VarE.K(objQ);
                        }
                        aVar6 = (e23.a) objQ;
                    } else {
                        aVar6 = aVar;
                    }
                    if (i68 != 0) {
                        aVar7 = null;
                    } else {
                        aVar7 = aVar2;
                    }
                    x1 x1Var3 = p3.n.f135158a;
                    num8 = num6;
                    long jB2 = am.j.B(d92.b.f58623a, o0VarE);
                    bVar = d92.b.f58625c;
                    bVar.getClass();
                    aVar8 = aVar6;
                    eVar = j92.b.f97899b;
                    z25 = z16;
                    h4.r rVarE2 = u1.n.e(aVar5, jB2, k2.i.a(eVar.f97918c));
                    bVar.getClass();
                    h4.r rVarB2 = l4.k.b(rVarE2, k2.i.a(eVar.f97918c));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(kVar3, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarB2, o0VarE);
                    h5.g.V.getClass();
                    aVar9 = h5.g.a.f81805b;
                    z26 = z24;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar9);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    int i86 = i69 >> 9;
                    e(null, num8, dVar4, num7, aVar7, o0VarE, (i39 & 65520) | (458752 & i86));
                    t4.d dVar6 = dVar4;
                    Integer num10 = num7;
                    e23.a aVar17 = aVar7;
                    bVar.getClass();
                    float f110 = eVar.f97920e;
                    bVar.getClass();
                    float f111 = eVar.f97920e;
                    bVar.getClass();
                    b(c2.l.C(aVar5, f110, eVar.f97918c, f111, 0.0f, 8), dVar2, str, o0VarE, (i39 >> 12) & 1008);
                    bVar.getClass();
                    float f112 = eVar.f97920e;
                    bVar.getClass();
                    float f113 = eVar.f97920e;
                    bVar.getClass();
                    h4.r rVarC4 = c2.l.C(aVar5, f112, eVar.f97918c, f113, 0.0f, 8);
                    j92.f fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    mh.c(str2, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, (i39 >> 21) & 14, 0, 131068);
                    bVar.getClass();
                    float f114 = eVar.f97920e;
                    bVar.getClass();
                    float f115 = eVar.f97920e;
                    bVar.getClass();
                    h4.r rVarC5 = c2.l.C(aVar5, f114, eVar.f97918c, f115, 0.0f, 8);
                    fVar2.getClass();
                    mh.c(str3, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, (i39 >> 24) & 14, 0, 131068);
                    if (cVar5 == null) {
                        o0VarE.C(1465326525);
                        z27 = false;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1465326526);
                        while (r2.hasNext()) {
                            h4.r.a aVar18 = h4.r.S;
                            d92.b.f58623a.getClass();
                            j92.b bVar9 = d92.b.f58625c;
                            bVar9.getClass();
                            j92.e eVar9 = j92.b.f97899b;
                            float f210 = eVar9.f97920e;
                            bVar9.getClass();
                            float f211 = eVar9.f97920e;
                            bVar9.getClass();
                            a(0, c2.l.C(aVar18, f210, eVar9.f97917b, f211, 0.0f, 8), str5, o0VarE);
                        }
                        z27 = false;
                        o0VarE.g0(false);
                        Unit unit3 = Unit.INSTANCE;
                    }
                    if (str4 == null) {
                        o0VarE.C(1465579392);
                        o0VarE.g0(z27);
                    } else {
                        o0VarE.C(1465579393);
                        h4.r.a aVar19 = h4.r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar10 = d92.b.f58625c;
                        bVar10.getClass();
                        j92.e eVar10 = j92.b.f97899b;
                        h4.r rVarA3 = c2.l.A(aVar19, eVar10.f97920e, 0.0f, 2);
                        bVar10.getClass();
                        g((i69 >> 6) & 112, c2.l.C(rVarA3, 0.0f, eVar10.f97920e, 0.0f, 0.0f, 13), str4, o0VarE);
                        Unit unit4 = Unit.INSTANCE;
                        o0VarE.g0(false);
                    }
                    o0VarE.C(-1615282371);
                    while (r3.hasNext()) {
                        h4.r.a aVar110 = h4.r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar11 = d92.b.f58625c;
                        bVar11.getClass();
                        j92.e eVar11 = j92.b.f97899b;
                        float f212 = eVar11.f97920e;
                        bVar11.getClass();
                        float f213 = eVar11.f97920e;
                        bVar11.getClass();
                        d(0, c2.l.C(aVar110, f212, eVar11.f97918c, f213, 0.0f, 8), kVar2.f101072b, kVar2.f101071a, o0VarE);
                    }
                    o0VarE.g0(false);
                    if (z26) {
                        o0VarE.C(1466213963);
                        h4.r.a aVar111 = h4.r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar12 = d92.b.f58625c;
                        bVar12.getClass();
                        j92.e eVar12 = j92.b.f97899b;
                        h4.r rVarA4 = c2.l.A(aVar111, eVar12.f97920e, 0.0f, 2);
                        bVar12.getClass();
                        d(0, c2.l.C(rVarA4, 0.0f, eVar12.f97918c, 0.0f, 0.0f, 13), gl1.y.Q(o0VarE, R.string.optional_strength_workouts), p13.w.c(am.x0.f4309n1.f4362e), o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1466521793);
                        o0VarE.g0(false);
                    }
                    if (cVarB.isEmpty()) {
                        o0VarE.C(1466607973);
                        h4.r.a aVar112 = h4.r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar13 = d92.b.f58625c;
                        bVar13.getClass();
                        j92.e eVar13 = j92.b.f97899b;
                        float f214 = eVar13.f97920e;
                        bVar13.getClass();
                        float f215 = eVar13.f97920e;
                        bVar13.getClass();
                        f((i69 << 6) & 896, c2.l.C(aVar112, f214, eVar13.f97918c, f215, 0.0f, 8), gl1.y.Q(o0VarE, R.string.required_list_header), cVarB, o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1466911649);
                        o0VarE.g0(false);
                    }
                    if (cVarB2.isEmpty()) {
                        o0VarE.C(1466962117);
                        h4.r.a aVar113 = h4.r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar14 = d92.b.f58625c;
                        bVar14.getClass();
                        j92.e eVar14 = j92.b.f97899b;
                        float f216 = eVar14.f97920e;
                        bVar14.getClass();
                        float f35 = eVar14.f97920e;
                        bVar14.getClass();
                        f((i69 << 3) & 896, c2.l.C(aVar113, f216, eVar14.f97918c, f35, 0.0f, 8), gl1.y.Q(o0VarE, R.string.optional_list_header), cVarB2, o0VarE);
                        z28 = false;
                        o0VarE.g0(false);
                    } else {
                        z28 = false;
                        o0VarE.C(1467265793);
                        o0VarE.g0(false);
                    }
                    o0VarE.C(1467323576);
                    o0VarE.g0(z28);
                    l72.f0 f0Var2 = l72.f0.f110999a;
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY2 = c2.l.y(rVarF2, j92.b.f97899b.f97920e);
                    d.f56011a.getClass();
                    if (z25) {
                        eVar2 = d.f56012b;
                    } else {
                        eVar2 = d.f56013c;
                    }
                    f0Var2.h(eVar2, gl1.y.Q(o0VarE, R.string.select_plan), rVarY2, false, aVar8, o0VarE, i86 & 57344, 8);
                    o0VarE.g0(true);
                    x1 x1Var4 = p3.n.f135158a;
                    z19 = z25;
                    z18 = z26;
                    rVar2 = aVar5;
                    o0Var = o0VarE;
                    cVar6 = cVarB;
                    cVar7 = cVarB2;
                    aVar3 = aVar8;
                    cVar8 = cVarB3;
                    num4 = num8;
                    dVar3 = dVar6;
                    num5 = num10;
                    aVar4 = aVar17;
                } else {
                    o0VarE.e();
                    rVar2 = rVar;
                    cVar6 = cVar2;
                    cVar7 = cVar3;
                    cVar8 = cVar4;
                    z18 = z14;
                    aVar3 = aVar;
                    aVar4 = aVar2;
                    z19 = z16;
                    o0Var = o0VarE;
                    num4 = num3;
                    dVar3 = dVar;
                    num5 = num2;
                }
                cVar9 = cVar5;
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: cw1.b
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            c.c(rVar2, num4, dVar3, num5, dVar2, str, str2, str3, cVar9, cVar6, cVar7, cVar8, str4, z18, z19, aVar3, aVar4, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i58 |= 24576;
            i64 = i58 | 196608;
            i65 = i16 & 65536;
            if (i65 != 0) {
                if ((1572864 & i15) == 0) {
                    z16 = z15;
                    i64 |= o0VarE.h(z16) ? 1048576 : 524288;
                }
                i66 = i16 & 131072;
                if (i66 != 0) {
                    i67 = i64 | 12582912;
                } else {
                    i67 = i64 | (o0VarE.r(aVar) ? 8388608 : 4194304);
                }
                i68 = i16 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                if (i68 != 0) {
                    i67 |= 100663296;
                } else if ((i15 & 100663296) == 0) {
                    i67 |= o0VarE.r(aVar2) ? 67108864 : 33554432;
                }
                i69 = i67;
                if ((i39 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (o0VarE.n(i39 & 1, z17)) {
                    aVar5 = h4.r.S;
                    if (i77 != 0) {
                        i74 = i44;
                        num6 = null;
                    } else {
                        num6 = num3;
                        i74 = i44;
                    }
                    if (i17 != 0) {
                        dVar4 = null;
                    } else {
                        dVar4 = dVar;
                    }
                    if (i25 != 0) {
                        num7 = null;
                    } else {
                        num7 = num2;
                    }
                    if (i36 != 0) {
                        cVar5 = null;
                    }
                    if (i74 != 0) {
                        cVarB = j53.l.b();
                    } else {
                        cVarB = cVar2;
                    }
                    if (i47 != 0) {
                        cVarB2 = j53.l.b();
                    } else {
                        cVarB2 = cVar3;
                    }
                    if (i55 != 0) {
                        cVarB3 = j53.l.b();
                    } else {
                        cVarB3 = cVar4;
                    }
                    if (i59 != 0) {
                        z24 = false;
                    } else {
                        z24 = z14;
                    }
                    if (i65 != 0) {
                        z16 = false;
                    }
                    if (i66 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new com.google.accompanist.drawablepainter.a(16);
                            o0VarE.K(objQ);
                        }
                        aVar6 = (e23.a) objQ;
                    } else {
                        aVar6 = aVar;
                    }
                    if (i68 != 0) {
                        aVar7 = null;
                    } else {
                        aVar7 = aVar2;
                    }
                    x1 x1Var5 = p3.n.f135158a;
                    num8 = num6;
                    long jB3 = am.j.B(d92.b.f58623a, o0VarE);
                    bVar = d92.b.f58625c;
                    bVar.getClass();
                    aVar8 = aVar6;
                    eVar = j92.b.f97899b;
                    z25 = z16;
                    h4.r rVarE3 = u1.n.e(aVar5, jB3, k2.i.a(eVar.f97918c));
                    bVar.getClass();
                    h4.r rVarB3 = l4.k.b(rVarE3, k2.i.a(eVar.f97918c));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar4 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(kVar4, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarB3, o0VarE);
                    h5.g.V.getClass();
                    aVar9 = h5.g.a.f81805b;
                    z26 = z24;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar9);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    int i87 = i69 >> 9;
                    e(null, num8, dVar4, num7, aVar7, o0VarE, (i39 & 65520) | (458752 & i87));
                    t4.d dVar7 = dVar4;
                    Integer num11 = num7;
                    e23.a aVar114 = aVar7;
                    bVar.getClass();
                    float f116 = eVar.f97920e;
                    bVar.getClass();
                    float f117 = eVar.f97920e;
                    bVar.getClass();
                    b(c2.l.C(aVar5, f116, eVar.f97918c, f117, 0.0f, 8), dVar2, str, o0VarE, (i39 >> 12) & 1008);
                    bVar.getClass();
                    float f118 = eVar.f97920e;
                    bVar.getClass();
                    float f119 = eVar.f97920e;
                    bVar.getClass();
                    h4.r rVarC6 = c2.l.C(aVar5, f118, eVar.f97918c, f119, 0.0f, 8);
                    j92.f fVar3 = d92.b.f58624b;
                    fVar3.getClass();
                    mh.c(str2, rVarC6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, (i39 >> 21) & 14, 0, 131068);
                    bVar.getClass();
                    float f1110 = eVar.f97920e;
                    bVar.getClass();
                    float f1111 = eVar.f97920e;
                    bVar.getClass();
                    h4.r rVarC7 = c2.l.C(aVar5, f1110, eVar.f97918c, f1111, 0.0f, 8);
                    fVar3.getClass();
                    mh.c(str3, rVarC7, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, (i39 >> 24) & 14, 0, 131068);
                    if (cVar5 == null) {
                        o0VarE.C(1465326525);
                        z27 = false;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1465326526);
                        while (r2.hasNext()) {
                            h4.r.a aVar115 = h4.r.S;
                            d92.b.f58623a.getClass();
                            j92.b bVar15 = d92.b.f58625c;
                            bVar15.getClass();
                            j92.e eVar15 = j92.b.f97899b;
                            float f217 = eVar15.f97920e;
                            bVar15.getClass();
                            float f218 = eVar15.f97920e;
                            bVar15.getClass();
                            a(0, c2.l.C(aVar115, f217, eVar15.f97917b, f218, 0.0f, 8), str5, o0VarE);
                        }
                        z27 = false;
                        o0VarE.g0(false);
                        Unit unit5 = Unit.INSTANCE;
                    }
                    if (str4 == null) {
                        o0VarE.C(1465579392);
                        o0VarE.g0(z27);
                    } else {
                        o0VarE.C(1465579393);
                        h4.r.a aVar116 = h4.r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar16 = d92.b.f58625c;
                        bVar16.getClass();
                        j92.e eVar16 = j92.b.f97899b;
                        h4.r rVarA5 = c2.l.A(aVar116, eVar16.f97920e, 0.0f, 2);
                        bVar16.getClass();
                        g((i69 >> 6) & 112, c2.l.C(rVarA5, 0.0f, eVar16.f97920e, 0.0f, 0.0f, 13), str4, o0VarE);
                        Unit unit6 = Unit.INSTANCE;
                        o0VarE.g0(false);
                    }
                    o0VarE.C(-1615282371);
                    while (r3.hasNext()) {
                        h4.r.a aVar117 = h4.r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar17 = d92.b.f58625c;
                        bVar17.getClass();
                        j92.e eVar17 = j92.b.f97899b;
                        float f219 = eVar17.f97920e;
                        bVar17.getClass();
                        float f2110 = eVar17.f97920e;
                        bVar17.getClass();
                        d(0, c2.l.C(aVar117, f219, eVar17.f97918c, f2110, 0.0f, 8), kVar2.f101072b, kVar2.f101071a, o0VarE);
                    }
                    o0VarE.g0(false);
                    if (z26) {
                        o0VarE.C(1466213963);
                        h4.r.a aVar118 = h4.r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar18 = d92.b.f58625c;
                        bVar18.getClass();
                        j92.e eVar18 = j92.b.f97899b;
                        h4.r rVarA6 = c2.l.A(aVar118, eVar18.f97920e, 0.0f, 2);
                        bVar18.getClass();
                        d(0, c2.l.C(rVarA6, 0.0f, eVar18.f97918c, 0.0f, 0.0f, 13), gl1.y.Q(o0VarE, R.string.optional_strength_workouts), p13.w.c(am.x0.f4309n1.f4362e), o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1466521793);
                        o0VarE.g0(false);
                    }
                    if (cVarB.isEmpty()) {
                        o0VarE.C(1466607973);
                        h4.r.a aVar119 = h4.r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar19 = d92.b.f58625c;
                        bVar19.getClass();
                        j92.e eVar19 = j92.b.f97899b;
                        float f2111 = eVar19.f97920e;
                        bVar19.getClass();
                        float f2112 = eVar19.f97920e;
                        bVar19.getClass();
                        f((i69 << 6) & 896, c2.l.C(aVar119, f2111, eVar19.f97918c, f2112, 0.0f, 8), gl1.y.Q(o0VarE, R.string.required_list_header), cVarB, o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1466911649);
                        o0VarE.g0(false);
                    }
                    if (cVarB2.isEmpty()) {
                        o0VarE.C(1466962117);
                        h4.r.a aVar1110 = h4.r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar110 = d92.b.f58625c;
                        bVar110.getClass();
                        j92.e eVar110 = j92.b.f97899b;
                        float f2113 = eVar110.f97920e;
                        bVar110.getClass();
                        float f36 = eVar110.f97920e;
                        bVar110.getClass();
                        f((i69 << 3) & 896, c2.l.C(aVar1110, f2113, eVar110.f97918c, f36, 0.0f, 8), gl1.y.Q(o0VarE, R.string.optional_list_header), cVarB2, o0VarE);
                        z28 = false;
                        o0VarE.g0(false);
                    } else {
                        z28 = false;
                        o0VarE.C(1467265793);
                        o0VarE.g0(false);
                    }
                    o0VarE.C(1467323576);
                    o0VarE.g0(z28);
                    l72.f0 f0Var3 = l72.f0.f110999a;
                    h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY3 = c2.l.y(rVarF3, j92.b.f97899b.f97920e);
                    d.f56011a.getClass();
                    if (z25) {
                        eVar2 = d.f56012b;
                    } else {
                        eVar2 = d.f56013c;
                    }
                    f0Var3.h(eVar2, gl1.y.Q(o0VarE, R.string.select_plan), rVarY3, false, aVar8, o0VarE, i87 & 57344, 8);
                    o0VarE.g0(true);
                    x1 x1Var6 = p3.n.f135158a;
                    z19 = z25;
                    z18 = z26;
                    rVar2 = aVar5;
                    o0Var = o0VarE;
                    cVar6 = cVarB;
                    cVar7 = cVarB2;
                    aVar3 = aVar8;
                    cVar8 = cVarB3;
                    num4 = num8;
                    dVar3 = dVar7;
                    num5 = num11;
                    aVar4 = aVar114;
                } else {
                    o0VarE.e();
                    rVar2 = rVar;
                    cVar6 = cVar2;
                    cVar7 = cVar3;
                    cVar8 = cVar4;
                    z18 = z14;
                    aVar3 = aVar;
                    aVar4 = aVar2;
                    z19 = z16;
                    o0Var = o0VarE;
                    num4 = num3;
                    dVar3 = dVar;
                    num5 = num2;
                }
                cVar9 = cVar5;
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: cw1.b
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            c.c(rVar2, num4, dVar3, num5, dVar2, str, str2, str3, cVar9, cVar6, cVar7, cVar8, str4, z18, z19, aVar3, aVar4, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i64 = i58 | 1769472;
            z16 = z15;
            i66 = i16 & 131072;
            if (i66 != 0) {
                i67 = i64 | 12582912;
            } else {
                i67 = i64 | (o0VarE.r(aVar) ? 8388608 : 4194304);
            }
            i68 = i16 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
            if (i68 != 0) {
                i67 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                i67 |= o0VarE.r(aVar2) ? 67108864 : 33554432;
            }
            i69 = i67;
            if ((i39 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (o0VarE.n(i39 & 1, z17)) {
                aVar5 = h4.r.S;
                if (i77 != 0) {
                    i74 = i44;
                    num6 = null;
                } else {
                    num6 = num3;
                    i74 = i44;
                }
                if (i17 != 0) {
                    dVar4 = null;
                } else {
                    dVar4 = dVar;
                }
                if (i25 != 0) {
                    num7 = null;
                } else {
                    num7 = num2;
                }
                if (i36 != 0) {
                    cVar5 = null;
                }
                if (i74 != 0) {
                    cVarB = j53.l.b();
                } else {
                    cVarB = cVar2;
                }
                if (i47 != 0) {
                    cVarB2 = j53.l.b();
                } else {
                    cVarB2 = cVar3;
                }
                if (i55 != 0) {
                    cVarB3 = j53.l.b();
                } else {
                    cVarB3 = cVar4;
                }
                if (i59 != 0) {
                    z24 = false;
                } else {
                    z24 = z14;
                }
                if (i65 != 0) {
                    z16 = false;
                }
                if (i66 != 0) {
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new com.google.accompanist.drawablepainter.a(16);
                        o0VarE.K(objQ);
                    }
                    aVar6 = (e23.a) objQ;
                } else {
                    aVar6 = aVar;
                }
                if (i68 != 0) {
                    aVar7 = null;
                } else {
                    aVar7 = aVar2;
                }
                x1 x1Var7 = p3.n.f135158a;
                num8 = num6;
                long jB4 = am.j.B(d92.b.f58623a, o0VarE);
                bVar = d92.b.f58625c;
                bVar.getClass();
                aVar8 = aVar6;
                eVar = j92.b.f97899b;
                z25 = z16;
                h4.r rVarE4 = u1.n.e(aVar5, jB4, k2.i.a(eVar.f97918c));
                bVar.getClass();
                h4.r rVarB4 = l4.k.b(rVarE4, k2.i.a(eVar.f97918c));
                c2.j.f22691a.getClass();
                c2.j.k kVar5 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar5, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarB4, o0VarE);
                h5.g.V.getClass();
                aVar9 = h5.g.a.f81805b;
                z26 = z24;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar9);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var4 = c2.b0.f22601a;
                int i88 = i69 >> 9;
                e(null, num8, dVar4, num7, aVar7, o0VarE, (i39 & 65520) | (458752 & i88));
                t4.d dVar8 = dVar4;
                Integer num12 = num7;
                e23.a aVar1111 = aVar7;
                bVar.getClass();
                float f1112 = eVar.f97920e;
                bVar.getClass();
                float f1113 = eVar.f97920e;
                bVar.getClass();
                b(c2.l.C(aVar5, f1112, eVar.f97918c, f1113, 0.0f, 8), dVar2, str, o0VarE, (i39 >> 12) & 1008);
                bVar.getClass();
                float f1114 = eVar.f97920e;
                bVar.getClass();
                float f1115 = eVar.f97920e;
                bVar.getClass();
                h4.r rVarC8 = c2.l.C(aVar5, f1114, eVar.f97918c, f1115, 0.0f, 8);
                j92.f fVar4 = d92.b.f58624b;
                fVar4.getClass();
                mh.c(str2, rVarC8, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, (i39 >> 21) & 14, 0, 131068);
                bVar.getClass();
                float f1116 = eVar.f97920e;
                bVar.getClass();
                float f1117 = eVar.f97920e;
                bVar.getClass();
                h4.r rVarC9 = c2.l.C(aVar5, f1116, eVar.f97918c, f1117, 0.0f, 8);
                fVar4.getClass();
                mh.c(str3, rVarC9, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, (i39 >> 24) & 14, 0, 131068);
                if (cVar5 == null) {
                    o0VarE.C(1465326525);
                    z27 = false;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1465326526);
                    while (r2.hasNext()) {
                        h4.r.a aVar1112 = h4.r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar111 = d92.b.f58625c;
                        bVar111.getClass();
                        j92.e eVar111 = j92.b.f97899b;
                        float f2114 = eVar111.f97920e;
                        bVar111.getClass();
                        float f2115 = eVar111.f97920e;
                        bVar111.getClass();
                        a(0, c2.l.C(aVar1112, f2114, eVar111.f97917b, f2115, 0.0f, 8), str5, o0VarE);
                    }
                    z27 = false;
                    o0VarE.g0(false);
                    Unit unit7 = Unit.INSTANCE;
                }
                if (str4 == null) {
                    o0VarE.C(1465579392);
                    o0VarE.g0(z27);
                } else {
                    o0VarE.C(1465579393);
                    h4.r.a aVar1113 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar112 = d92.b.f58625c;
                    bVar112.getClass();
                    j92.e eVar112 = j92.b.f97899b;
                    h4.r rVarA7 = c2.l.A(aVar1113, eVar112.f97920e, 0.0f, 2);
                    bVar112.getClass();
                    g((i69 >> 6) & 112, c2.l.C(rVarA7, 0.0f, eVar112.f97920e, 0.0f, 0.0f, 13), str4, o0VarE);
                    Unit unit8 = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                o0VarE.C(-1615282371);
                while (r3.hasNext()) {
                    h4.r.a aVar1114 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar113 = d92.b.f58625c;
                    bVar113.getClass();
                    j92.e eVar113 = j92.b.f97899b;
                    float f2116 = eVar113.f97920e;
                    bVar113.getClass();
                    float f2117 = eVar113.f97920e;
                    bVar113.getClass();
                    d(0, c2.l.C(aVar1114, f2116, eVar113.f97918c, f2117, 0.0f, 8), kVar2.f101072b, kVar2.f101071a, o0VarE);
                }
                o0VarE.g0(false);
                if (z26) {
                    o0VarE.C(1466213963);
                    h4.r.a aVar1115 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar114 = d92.b.f58625c;
                    bVar114.getClass();
                    j92.e eVar114 = j92.b.f97899b;
                    h4.r rVarA8 = c2.l.A(aVar1115, eVar114.f97920e, 0.0f, 2);
                    bVar114.getClass();
                    d(0, c2.l.C(rVarA8, 0.0f, eVar114.f97918c, 0.0f, 0.0f, 13), gl1.y.Q(o0VarE, R.string.optional_strength_workouts), p13.w.c(am.x0.f4309n1.f4362e), o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1466521793);
                    o0VarE.g0(false);
                }
                if (cVarB.isEmpty()) {
                    o0VarE.C(1466607973);
                    h4.r.a aVar1116 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar115 = d92.b.f58625c;
                    bVar115.getClass();
                    j92.e eVar115 = j92.b.f97899b;
                    float f2118 = eVar115.f97920e;
                    bVar115.getClass();
                    float f2119 = eVar115.f97920e;
                    bVar115.getClass();
                    f((i69 << 6) & 896, c2.l.C(aVar1116, f2118, eVar115.f97918c, f2119, 0.0f, 8), gl1.y.Q(o0VarE, R.string.required_list_header), cVarB, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1466911649);
                    o0VarE.g0(false);
                }
                if (cVarB2.isEmpty()) {
                    o0VarE.C(1466962117);
                    h4.r.a aVar1117 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar116 = d92.b.f58625c;
                    bVar116.getClass();
                    j92.e eVar116 = j92.b.f97899b;
                    float f21110 = eVar116.f97920e;
                    bVar116.getClass();
                    float f37 = eVar116.f97920e;
                    bVar116.getClass();
                    f((i69 << 3) & 896, c2.l.C(aVar1117, f21110, eVar116.f97918c, f37, 0.0f, 8), gl1.y.Q(o0VarE, R.string.optional_list_header), cVarB2, o0VarE);
                    z28 = false;
                    o0VarE.g0(false);
                } else {
                    z28 = false;
                    o0VarE.C(1467265793);
                    o0VarE.g0(false);
                }
                o0VarE.C(1467323576);
                o0VarE.g0(z28);
                l72.f0 f0Var4 = l72.f0.f110999a;
                h4.r rVarF4 = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarY4 = c2.l.y(rVarF4, j92.b.f97899b.f97920e);
                d.f56011a.getClass();
                if (z25) {
                    eVar2 = d.f56012b;
                } else {
                    eVar2 = d.f56013c;
                }
                f0Var4.h(eVar2, gl1.y.Q(o0VarE, R.string.select_plan), rVarY4, false, aVar8, o0VarE, i88 & 57344, 8);
                o0VarE.g0(true);
                x1 x1Var8 = p3.n.f135158a;
                z19 = z25;
                z18 = z26;
                rVar2 = aVar5;
                o0Var = o0VarE;
                cVar6 = cVarB;
                cVar7 = cVarB2;
                aVar3 = aVar8;
                cVar8 = cVarB3;
                num4 = num8;
                dVar3 = dVar8;
                num5 = num12;
                aVar4 = aVar1111;
            } else {
                o0VarE.e();
                rVar2 = rVar;
                cVar6 = cVar2;
                cVar7 = cVar3;
                cVar8 = cVar4;
                z18 = z14;
                aVar3 = aVar;
                aVar4 = aVar2;
                z19 = z16;
                o0Var = o0VarE;
                num4 = num3;
                dVar3 = dVar;
                num5 = num2;
            }
            cVar9 = cVar5;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: cw1.b
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        c.c(rVar2, num4, dVar3, num5, dVar2, str, str2, str3, cVar9, cVar6, cVar7, cVar8, str4, z18, z19, aVar3, aVar4, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i76 = i14 | 54;
        num3 = num;
        i17 = i16 & 4;
        if (i17 != 0) {
            i19 = i76 | 384;
        } else {
            if (o0VarE.r(dVar)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i19 = i76 | i18;
        }
        i24 = i19 | 3072;
        i25 = i16 & 16;
        if (i25 != 0) {
            i27 = i19 | 27648;
        } else {
            if (o0VarE.B(num2)) {
                i26 = 16384;
            } else {
                i26 = 8192;
            }
            i27 = i24 | i26;
        }
        if (o0VarE.B(dVar2)) {
            i28 = 131072;
        } else {
            i28 = 65536;
        }
        int i710 = i27 | i28;
        if (o0VarE.B(str)) {
            i29 = 1048576;
        } else {
            i29 = 524288;
        }
        int i711 = i710 | i29;
        if (o0VarE.B(str2)) {
            i30 = 8388608;
        } else {
            i30 = 4194304;
        }
        int i89 = i711 | i30;
        if (o0VarE.B(str3)) {
            i34 = 67108864;
        } else {
            i34 = 33554432;
        }
        i35 = i89 | i34;
        i36 = i16 & 512;
        if (i36 != 0) {
            i38 = i35 | C.ENCODING_PCM_32BIT;
            cVar5 = cVar;
        } else {
            cVar5 = cVar;
            if (o0VarE.B(cVar5)) {
                i37 = 536870912;
            } else {
                i37 = 268435456;
            }
            i38 = i35 | i37;
        }
        i39 = i38;
        i44 = i16 & 1024;
        if (i44 != 0) {
            i46 = i15 | 6;
        } else {
            if (o0VarE.B(cVar2)) {
                i45 = 4;
            } else {
                i45 = 2;
            }
            i46 = i15 | i45;
        }
        i47 = i16 & 2048;
        if (i47 != 0) {
            i49 = i46 | 48;
        } else {
            if (o0VarE.B(cVar3)) {
                i48 = 32;
            } else {
                i48 = 16;
            }
            i49 = i46 | i48;
        }
        i54 = i49;
        i55 = i16 & 4096;
        if (i55 != 0) {
            i57 = i54 | 384;
        } else {
            if (o0VarE.r(cVar4)) {
                i56 = 256;
            } else {
                i56 = 128;
            }
            i57 = i54 | i56;
        }
        if ((i15 & 3072) == 0) {
            if (o0VarE.B(str4)) {
                i75 = 2048;
            } else {
                i75 = 1024;
            }
            i57 |= i75;
        }
        i58 = i57;
        i59 = i16 & 16384;
        if (i59 != 0) {
            if ((i15 & 24576) == 0) {
                i58 |= o0VarE.h(z14) ? 16384 : 8192;
            }
            i64 = i58 | 196608;
            i65 = i16 & 65536;
            if (i65 != 0) {
                if ((1572864 & i15) == 0) {
                    z16 = z15;
                    i64 |= o0VarE.h(z16) ? 1048576 : 524288;
                }
                i66 = i16 & 131072;
                if (i66 != 0) {
                    i67 = i64 | 12582912;
                } else {
                    i67 = i64 | (o0VarE.r(aVar) ? 8388608 : 4194304);
                }
                i68 = i16 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                if (i68 != 0) {
                    i67 |= 100663296;
                } else if ((i15 & 100663296) == 0) {
                    i67 |= o0VarE.r(aVar2) ? 67108864 : 33554432;
                }
                i69 = i67;
                if ((i39 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (o0VarE.n(i39 & 1, z17)) {
                    aVar5 = h4.r.S;
                    if (i77 != 0) {
                        i74 = i44;
                        num6 = null;
                    } else {
                        num6 = num3;
                        i74 = i44;
                    }
                    if (i17 != 0) {
                        dVar4 = null;
                    } else {
                        dVar4 = dVar;
                    }
                    if (i25 != 0) {
                        num7 = null;
                    } else {
                        num7 = num2;
                    }
                    if (i36 != 0) {
                        cVar5 = null;
                    }
                    if (i74 != 0) {
                        cVarB = j53.l.b();
                    } else {
                        cVarB = cVar2;
                    }
                    if (i47 != 0) {
                        cVarB2 = j53.l.b();
                    } else {
                        cVarB2 = cVar3;
                    }
                    if (i55 != 0) {
                        cVarB3 = j53.l.b();
                    } else {
                        cVarB3 = cVar4;
                    }
                    if (i59 != 0) {
                        z24 = false;
                    } else {
                        z24 = z14;
                    }
                    if (i65 != 0) {
                        z16 = false;
                    }
                    if (i66 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new com.google.accompanist.drawablepainter.a(16);
                            o0VarE.K(objQ);
                        }
                        aVar6 = (e23.a) objQ;
                    } else {
                        aVar6 = aVar;
                    }
                    if (i68 != 0) {
                        aVar7 = null;
                    } else {
                        aVar7 = aVar2;
                    }
                    x1 x1Var9 = p3.n.f135158a;
                    num8 = num6;
                    long jB5 = am.j.B(d92.b.f58623a, o0VarE);
                    bVar = d92.b.f58625c;
                    bVar.getClass();
                    aVar8 = aVar6;
                    eVar = j92.b.f97899b;
                    z25 = z16;
                    h4.r rVarE5 = u1.n.e(aVar5, jB5, k2.i.a(eVar.f97918c));
                    bVar.getClass();
                    h4.r rVarB5 = l4.k.b(rVarE5, k2.i.a(eVar.f97918c));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar6 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(kVar6, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarB5, o0VarE);
                    h5.g.V.getClass();
                    aVar9 = h5.g.a.f81805b;
                    z26 = z24;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar9);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var5 = c2.b0.f22601a;
                    int i810 = i69 >> 9;
                    e(null, num8, dVar4, num7, aVar7, o0VarE, (i39 & 65520) | (458752 & i810));
                    t4.d dVar9 = dVar4;
                    Integer num13 = num7;
                    e23.a aVar1118 = aVar7;
                    bVar.getClass();
                    float f1118 = eVar.f97920e;
                    bVar.getClass();
                    float f1119 = eVar.f97920e;
                    bVar.getClass();
                    b(c2.l.C(aVar5, f1118, eVar.f97918c, f1119, 0.0f, 8), dVar2, str, o0VarE, (i39 >> 12) & 1008);
                    bVar.getClass();
                    float f11110 = eVar.f97920e;
                    bVar.getClass();
                    float f11111 = eVar.f97920e;
                    bVar.getClass();
                    h4.r rVarC10 = c2.l.C(aVar5, f11110, eVar.f97918c, f11111, 0.0f, 8);
                    j92.f fVar5 = d92.b.f58624b;
                    fVar5.getClass();
                    mh.c(str2, rVarC10, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, (i39 >> 21) & 14, 0, 131068);
                    bVar.getClass();
                    float f11112 = eVar.f97920e;
                    bVar.getClass();
                    float f11113 = eVar.f97920e;
                    bVar.getClass();
                    h4.r rVarC11 = c2.l.C(aVar5, f11112, eVar.f97918c, f11113, 0.0f, 8);
                    fVar5.getClass();
                    mh.c(str3, rVarC11, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, (i39 >> 24) & 14, 0, 131068);
                    if (cVar5 == null) {
                        o0VarE.C(1465326525);
                        z27 = false;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1465326526);
                        while (r2.hasNext()) {
                            h4.r.a aVar1119 = h4.r.S;
                            d92.b.f58623a.getClass();
                            j92.b bVar117 = d92.b.f58625c;
                            bVar117.getClass();
                            j92.e eVar117 = j92.b.f97899b;
                            float f21111 = eVar117.f97920e;
                            bVar117.getClass();
                            float f21112 = eVar117.f97920e;
                            bVar117.getClass();
                            a(0, c2.l.C(aVar1119, f21111, eVar117.f97917b, f21112, 0.0f, 8), str5, o0VarE);
                        }
                        z27 = false;
                        o0VarE.g0(false);
                        Unit unit9 = Unit.INSTANCE;
                    }
                    if (str4 == null) {
                        o0VarE.C(1465579392);
                        o0VarE.g0(z27);
                    } else {
                        o0VarE.C(1465579393);
                        h4.r.a aVar11110 = h4.r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar118 = d92.b.f58625c;
                        bVar118.getClass();
                        j92.e eVar118 = j92.b.f97899b;
                        h4.r rVarA9 = c2.l.A(aVar11110, eVar118.f97920e, 0.0f, 2);
                        bVar118.getClass();
                        g((i69 >> 6) & 112, c2.l.C(rVarA9, 0.0f, eVar118.f97920e, 0.0f, 0.0f, 13), str4, o0VarE);
                        Unit unit10 = Unit.INSTANCE;
                        o0VarE.g0(false);
                    }
                    o0VarE.C(-1615282371);
                    while (r3.hasNext()) {
                        h4.r.a aVar11111 = h4.r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar119 = d92.b.f58625c;
                        bVar119.getClass();
                        j92.e eVar119 = j92.b.f97899b;
                        float f21113 = eVar119.f97920e;
                        bVar119.getClass();
                        float f21114 = eVar119.f97920e;
                        bVar119.getClass();
                        d(0, c2.l.C(aVar11111, f21113, eVar119.f97918c, f21114, 0.0f, 8), kVar2.f101072b, kVar2.f101071a, o0VarE);
                    }
                    o0VarE.g0(false);
                    if (z26) {
                        o0VarE.C(1466213963);
                        h4.r.a aVar11112 = h4.r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar1110 = d92.b.f58625c;
                        bVar1110.getClass();
                        j92.e eVar1110 = j92.b.f97899b;
                        h4.r rVarA10 = c2.l.A(aVar11112, eVar1110.f97920e, 0.0f, 2);
                        bVar1110.getClass();
                        d(0, c2.l.C(rVarA10, 0.0f, eVar1110.f97918c, 0.0f, 0.0f, 13), gl1.y.Q(o0VarE, R.string.optional_strength_workouts), p13.w.c(am.x0.f4309n1.f4362e), o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1466521793);
                        o0VarE.g0(false);
                    }
                    if (cVarB.isEmpty()) {
                        o0VarE.C(1466607973);
                        h4.r.a aVar11113 = h4.r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar1111 = d92.b.f58625c;
                        bVar1111.getClass();
                        j92.e eVar1111 = j92.b.f97899b;
                        float f21115 = eVar1111.f97920e;
                        bVar1111.getClass();
                        float f21116 = eVar1111.f97920e;
                        bVar1111.getClass();
                        f((i69 << 6) & 896, c2.l.C(aVar11113, f21115, eVar1111.f97918c, f21116, 0.0f, 8), gl1.y.Q(o0VarE, R.string.required_list_header), cVarB, o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1466911649);
                        o0VarE.g0(false);
                    }
                    if (cVarB2.isEmpty()) {
                        o0VarE.C(1466962117);
                        h4.r.a aVar11114 = h4.r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar1112 = d92.b.f58625c;
                        bVar1112.getClass();
                        j92.e eVar1112 = j92.b.f97899b;
                        float f21117 = eVar1112.f97920e;
                        bVar1112.getClass();
                        float f38 = eVar1112.f97920e;
                        bVar1112.getClass();
                        f((i69 << 3) & 896, c2.l.C(aVar11114, f21117, eVar1112.f97918c, f38, 0.0f, 8), gl1.y.Q(o0VarE, R.string.optional_list_header), cVarB2, o0VarE);
                        z28 = false;
                        o0VarE.g0(false);
                    } else {
                        z28 = false;
                        o0VarE.C(1467265793);
                        o0VarE.g0(false);
                    }
                    o0VarE.C(1467323576);
                    o0VarE.g0(z28);
                    l72.f0 f0Var5 = l72.f0.f110999a;
                    h4.r rVarF5 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY5 = c2.l.y(rVarF5, j92.b.f97899b.f97920e);
                    d.f56011a.getClass();
                    if (z25) {
                        eVar2 = d.f56012b;
                    } else {
                        eVar2 = d.f56013c;
                    }
                    f0Var5.h(eVar2, gl1.y.Q(o0VarE, R.string.select_plan), rVarY5, false, aVar8, o0VarE, i810 & 57344, 8);
                    o0VarE.g0(true);
                    x1 x1Var10 = p3.n.f135158a;
                    z19 = z25;
                    z18 = z26;
                    rVar2 = aVar5;
                    o0Var = o0VarE;
                    cVar6 = cVarB;
                    cVar7 = cVarB2;
                    aVar3 = aVar8;
                    cVar8 = cVarB3;
                    num4 = num8;
                    dVar3 = dVar9;
                    num5 = num13;
                    aVar4 = aVar1118;
                } else {
                    o0VarE.e();
                    rVar2 = rVar;
                    cVar6 = cVar2;
                    cVar7 = cVar3;
                    cVar8 = cVar4;
                    z18 = z14;
                    aVar3 = aVar;
                    aVar4 = aVar2;
                    z19 = z16;
                    o0Var = o0VarE;
                    num4 = num3;
                    dVar3 = dVar;
                    num5 = num2;
                }
                cVar9 = cVar5;
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: cw1.b
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            c.c(rVar2, num4, dVar3, num5, dVar2, str, str2, str3, cVar9, cVar6, cVar7, cVar8, str4, z18, z19, aVar3, aVar4, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i64 = i58 | 1769472;
            z16 = z15;
            i66 = i16 & 131072;
            if (i66 != 0) {
                i67 = i64 | 12582912;
            } else {
                i67 = i64 | (o0VarE.r(aVar) ? 8388608 : 4194304);
            }
            i68 = i16 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
            if (i68 != 0) {
                i67 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                i67 |= o0VarE.r(aVar2) ? 67108864 : 33554432;
            }
            i69 = i67;
            if ((i39 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (o0VarE.n(i39 & 1, z17)) {
                aVar5 = h4.r.S;
                if (i77 != 0) {
                    i74 = i44;
                    num6 = null;
                } else {
                    num6 = num3;
                    i74 = i44;
                }
                if (i17 != 0) {
                    dVar4 = null;
                } else {
                    dVar4 = dVar;
                }
                if (i25 != 0) {
                    num7 = null;
                } else {
                    num7 = num2;
                }
                if (i36 != 0) {
                    cVar5 = null;
                }
                if (i74 != 0) {
                    cVarB = j53.l.b();
                } else {
                    cVarB = cVar2;
                }
                if (i47 != 0) {
                    cVarB2 = j53.l.b();
                } else {
                    cVarB2 = cVar3;
                }
                if (i55 != 0) {
                    cVarB3 = j53.l.b();
                } else {
                    cVarB3 = cVar4;
                }
                if (i59 != 0) {
                    z24 = false;
                } else {
                    z24 = z14;
                }
                if (i65 != 0) {
                    z16 = false;
                }
                if (i66 != 0) {
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new com.google.accompanist.drawablepainter.a(16);
                        o0VarE.K(objQ);
                    }
                    aVar6 = (e23.a) objQ;
                } else {
                    aVar6 = aVar;
                }
                if (i68 != 0) {
                    aVar7 = null;
                } else {
                    aVar7 = aVar2;
                }
                x1 x1Var11 = p3.n.f135158a;
                num8 = num6;
                long jB6 = am.j.B(d92.b.f58623a, o0VarE);
                bVar = d92.b.f58625c;
                bVar.getClass();
                aVar8 = aVar6;
                eVar = j92.b.f97899b;
                z25 = z16;
                h4.r rVarE6 = u1.n.e(aVar5, jB6, k2.i.a(eVar.f97918c));
                bVar.getClass();
                h4.r rVarB6 = l4.k.b(rVarE6, k2.i.a(eVar.f97918c));
                c2.j.f22691a.getClass();
                c2.j.k kVar7 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar7, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarB6, o0VarE);
                h5.g.V.getClass();
                aVar9 = h5.g.a.f81805b;
                z26 = z24;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar9);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var6 = c2.b0.f22601a;
                int i811 = i69 >> 9;
                e(null, num8, dVar4, num7, aVar7, o0VarE, (i39 & 65520) | (458752 & i811));
                t4.d dVar10 = dVar4;
                Integer num14 = num7;
                e23.a aVar11115 = aVar7;
                bVar.getClass();
                float f11114 = eVar.f97920e;
                bVar.getClass();
                float f11115 = eVar.f97920e;
                bVar.getClass();
                b(c2.l.C(aVar5, f11114, eVar.f97918c, f11115, 0.0f, 8), dVar2, str, o0VarE, (i39 >> 12) & 1008);
                bVar.getClass();
                float f11116 = eVar.f97920e;
                bVar.getClass();
                float f11117 = eVar.f97920e;
                bVar.getClass();
                h4.r rVarC12 = c2.l.C(aVar5, f11116, eVar.f97918c, f11117, 0.0f, 8);
                j92.f fVar6 = d92.b.f58624b;
                fVar6.getClass();
                mh.c(str2, rVarC12, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, (i39 >> 21) & 14, 0, 131068);
                bVar.getClass();
                float f11118 = eVar.f97920e;
                bVar.getClass();
                float f11119 = eVar.f97920e;
                bVar.getClass();
                h4.r rVarC13 = c2.l.C(aVar5, f11118, eVar.f97918c, f11119, 0.0f, 8);
                fVar6.getClass();
                mh.c(str3, rVarC13, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, (i39 >> 24) & 14, 0, 131068);
                if (cVar5 == null) {
                    o0VarE.C(1465326525);
                    z27 = false;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1465326526);
                    while (r2.hasNext()) {
                        h4.r.a aVar11116 = h4.r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar1113 = d92.b.f58625c;
                        bVar1113.getClass();
                        j92.e eVar1113 = j92.b.f97899b;
                        float f21118 = eVar1113.f97920e;
                        bVar1113.getClass();
                        float f21119 = eVar1113.f97920e;
                        bVar1113.getClass();
                        a(0, c2.l.C(aVar11116, f21118, eVar1113.f97917b, f21119, 0.0f, 8), str5, o0VarE);
                    }
                    z27 = false;
                    o0VarE.g0(false);
                    Unit unit11 = Unit.INSTANCE;
                }
                if (str4 == null) {
                    o0VarE.C(1465579392);
                    o0VarE.g0(z27);
                } else {
                    o0VarE.C(1465579393);
                    h4.r.a aVar11117 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar1114 = d92.b.f58625c;
                    bVar1114.getClass();
                    j92.e eVar1114 = j92.b.f97899b;
                    h4.r rVarA11 = c2.l.A(aVar11117, eVar1114.f97920e, 0.0f, 2);
                    bVar1114.getClass();
                    g((i69 >> 6) & 112, c2.l.C(rVarA11, 0.0f, eVar1114.f97920e, 0.0f, 0.0f, 13), str4, o0VarE);
                    Unit unit12 = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                o0VarE.C(-1615282371);
                while (r3.hasNext()) {
                    h4.r.a aVar11118 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar1115 = d92.b.f58625c;
                    bVar1115.getClass();
                    j92.e eVar1115 = j92.b.f97899b;
                    float f211110 = eVar1115.f97920e;
                    bVar1115.getClass();
                    float f211111 = eVar1115.f97920e;
                    bVar1115.getClass();
                    d(0, c2.l.C(aVar11118, f211110, eVar1115.f97918c, f211111, 0.0f, 8), kVar2.f101072b, kVar2.f101071a, o0VarE);
                }
                o0VarE.g0(false);
                if (z26) {
                    o0VarE.C(1466213963);
                    h4.r.a aVar11119 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar1116 = d92.b.f58625c;
                    bVar1116.getClass();
                    j92.e eVar1116 = j92.b.f97899b;
                    h4.r rVarA12 = c2.l.A(aVar11119, eVar1116.f97920e, 0.0f, 2);
                    bVar1116.getClass();
                    d(0, c2.l.C(rVarA12, 0.0f, eVar1116.f97918c, 0.0f, 0.0f, 13), gl1.y.Q(o0VarE, R.string.optional_strength_workouts), p13.w.c(am.x0.f4309n1.f4362e), o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1466521793);
                    o0VarE.g0(false);
                }
                if (cVarB.isEmpty()) {
                    o0VarE.C(1466607973);
                    h4.r.a aVar111110 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar1117 = d92.b.f58625c;
                    bVar1117.getClass();
                    j92.e eVar1117 = j92.b.f97899b;
                    float f211112 = eVar1117.f97920e;
                    bVar1117.getClass();
                    float f211113 = eVar1117.f97920e;
                    bVar1117.getClass();
                    f((i69 << 6) & 896, c2.l.C(aVar111110, f211112, eVar1117.f97918c, f211113, 0.0f, 8), gl1.y.Q(o0VarE, R.string.required_list_header), cVarB, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1466911649);
                    o0VarE.g0(false);
                }
                if (cVarB2.isEmpty()) {
                    o0VarE.C(1466962117);
                    h4.r.a aVar111111 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar1118 = d92.b.f58625c;
                    bVar1118.getClass();
                    j92.e eVar1118 = j92.b.f97899b;
                    float f211114 = eVar1118.f97920e;
                    bVar1118.getClass();
                    float f39 = eVar1118.f97920e;
                    bVar1118.getClass();
                    f((i69 << 3) & 896, c2.l.C(aVar111111, f211114, eVar1118.f97918c, f39, 0.0f, 8), gl1.y.Q(o0VarE, R.string.optional_list_header), cVarB2, o0VarE);
                    z28 = false;
                    o0VarE.g0(false);
                } else {
                    z28 = false;
                    o0VarE.C(1467265793);
                    o0VarE.g0(false);
                }
                o0VarE.C(1467323576);
                o0VarE.g0(z28);
                l72.f0 f0Var6 = l72.f0.f110999a;
                h4.r rVarF6 = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarY6 = c2.l.y(rVarF6, j92.b.f97899b.f97920e);
                d.f56011a.getClass();
                if (z25) {
                    eVar2 = d.f56012b;
                } else {
                    eVar2 = d.f56013c;
                }
                f0Var6.h(eVar2, gl1.y.Q(o0VarE, R.string.select_plan), rVarY6, false, aVar8, o0VarE, i811 & 57344, 8);
                o0VarE.g0(true);
                x1 x1Var12 = p3.n.f135158a;
                z19 = z25;
                z18 = z26;
                rVar2 = aVar5;
                o0Var = o0VarE;
                cVar6 = cVarB;
                cVar7 = cVarB2;
                aVar3 = aVar8;
                cVar8 = cVarB3;
                num4 = num8;
                dVar3 = dVar10;
                num5 = num14;
                aVar4 = aVar11115;
            } else {
                o0VarE.e();
                rVar2 = rVar;
                cVar6 = cVar2;
                cVar7 = cVar3;
                cVar8 = cVar4;
                z18 = z14;
                aVar3 = aVar;
                aVar4 = aVar2;
                z19 = z16;
                o0Var = o0VarE;
                num4 = num3;
                dVar3 = dVar;
                num5 = num2;
            }
            cVar9 = cVar5;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: cw1.b
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        c.c(rVar2, num4, dVar3, num5, dVar2, str, str2, str3, cVar9, cVar6, cVar7, cVar8, str4, z18, z19, aVar3, aVar4, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i58 |= 24576;
        i64 = i58 | 196608;
        i65 = i16 & 65536;
        if (i65 != 0) {
            if ((1572864 & i15) == 0) {
                z16 = z15;
                i64 |= o0VarE.h(z16) ? 1048576 : 524288;
            }
            i66 = i16 & 131072;
            if (i66 != 0) {
                i67 = i64 | 12582912;
            } else {
                i67 = i64 | (o0VarE.r(aVar) ? 8388608 : 4194304);
            }
            i68 = i16 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
            if (i68 != 0) {
                i67 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                i67 |= o0VarE.r(aVar2) ? 67108864 : 33554432;
            }
            i69 = i67;
            if ((i39 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (o0VarE.n(i39 & 1, z17)) {
                aVar5 = h4.r.S;
                if (i77 != 0) {
                    i74 = i44;
                    num6 = null;
                } else {
                    num6 = num3;
                    i74 = i44;
                }
                if (i17 != 0) {
                    dVar4 = null;
                } else {
                    dVar4 = dVar;
                }
                if (i25 != 0) {
                    num7 = null;
                } else {
                    num7 = num2;
                }
                if (i36 != 0) {
                    cVar5 = null;
                }
                if (i74 != 0) {
                    cVarB = j53.l.b();
                } else {
                    cVarB = cVar2;
                }
                if (i47 != 0) {
                    cVarB2 = j53.l.b();
                } else {
                    cVarB2 = cVar3;
                }
                if (i55 != 0) {
                    cVarB3 = j53.l.b();
                } else {
                    cVarB3 = cVar4;
                }
                if (i59 != 0) {
                    z24 = false;
                } else {
                    z24 = z14;
                }
                if (i65 != 0) {
                    z16 = false;
                }
                if (i66 != 0) {
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new com.google.accompanist.drawablepainter.a(16);
                        o0VarE.K(objQ);
                    }
                    aVar6 = (e23.a) objQ;
                } else {
                    aVar6 = aVar;
                }
                if (i68 != 0) {
                    aVar7 = null;
                } else {
                    aVar7 = aVar2;
                }
                x1 x1Var13 = p3.n.f135158a;
                num8 = num6;
                long jB7 = am.j.B(d92.b.f58623a, o0VarE);
                bVar = d92.b.f58625c;
                bVar.getClass();
                aVar8 = aVar6;
                eVar = j92.b.f97899b;
                z25 = z16;
                h4.r rVarE7 = u1.n.e(aVar5, jB7, k2.i.a(eVar.f97918c));
                bVar.getClass();
                h4.r rVarB7 = l4.k.b(rVarE7, k2.i.a(eVar.f97918c));
                c2.j.f22691a.getClass();
                c2.j.k kVar8 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar8, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarB7, o0VarE);
                h5.g.V.getClass();
                aVar9 = h5.g.a.f81805b;
                z26 = z24;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar9);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var7 = c2.b0.f22601a;
                int i812 = i69 >> 9;
                e(null, num8, dVar4, num7, aVar7, o0VarE, (i39 & 65520) | (458752 & i812));
                t4.d dVar11 = dVar4;
                Integer num15 = num7;
                e23.a aVar111112 = aVar7;
                bVar.getClass();
                float f111110 = eVar.f97920e;
                bVar.getClass();
                float f111111 = eVar.f97920e;
                bVar.getClass();
                b(c2.l.C(aVar5, f111110, eVar.f97918c, f111111, 0.0f, 8), dVar2, str, o0VarE, (i39 >> 12) & 1008);
                bVar.getClass();
                float f111112 = eVar.f97920e;
                bVar.getClass();
                float f111113 = eVar.f97920e;
                bVar.getClass();
                h4.r rVarC14 = c2.l.C(aVar5, f111112, eVar.f97918c, f111113, 0.0f, 8);
                j92.f fVar7 = d92.b.f58624b;
                fVar7.getClass();
                mh.c(str2, rVarC14, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, (i39 >> 21) & 14, 0, 131068);
                bVar.getClass();
                float f111114 = eVar.f97920e;
                bVar.getClass();
                float f111115 = eVar.f97920e;
                bVar.getClass();
                h4.r rVarC15 = c2.l.C(aVar5, f111114, eVar.f97918c, f111115, 0.0f, 8);
                fVar7.getClass();
                mh.c(str3, rVarC15, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, (i39 >> 24) & 14, 0, 131068);
                if (cVar5 == null) {
                    o0VarE.C(1465326525);
                    z27 = false;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1465326526);
                    while (r2.hasNext()) {
                        h4.r.a aVar111113 = h4.r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar1119 = d92.b.f58625c;
                        bVar1119.getClass();
                        j92.e eVar1119 = j92.b.f97899b;
                        float f211115 = eVar1119.f97920e;
                        bVar1119.getClass();
                        float f211116 = eVar1119.f97920e;
                        bVar1119.getClass();
                        a(0, c2.l.C(aVar111113, f211115, eVar1119.f97917b, f211116, 0.0f, 8), str5, o0VarE);
                    }
                    z27 = false;
                    o0VarE.g0(false);
                    Unit unit13 = Unit.INSTANCE;
                }
                if (str4 == null) {
                    o0VarE.C(1465579392);
                    o0VarE.g0(z27);
                } else {
                    o0VarE.C(1465579393);
                    h4.r.a aVar111114 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar11110 = d92.b.f58625c;
                    bVar11110.getClass();
                    j92.e eVar11110 = j92.b.f97899b;
                    h4.r rVarA13 = c2.l.A(aVar111114, eVar11110.f97920e, 0.0f, 2);
                    bVar11110.getClass();
                    g((i69 >> 6) & 112, c2.l.C(rVarA13, 0.0f, eVar11110.f97920e, 0.0f, 0.0f, 13), str4, o0VarE);
                    Unit unit14 = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                o0VarE.C(-1615282371);
                while (r3.hasNext()) {
                    h4.r.a aVar111115 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar11111 = d92.b.f58625c;
                    bVar11111.getClass();
                    j92.e eVar11111 = j92.b.f97899b;
                    float f211117 = eVar11111.f97920e;
                    bVar11111.getClass();
                    float f211118 = eVar11111.f97920e;
                    bVar11111.getClass();
                    d(0, c2.l.C(aVar111115, f211117, eVar11111.f97918c, f211118, 0.0f, 8), kVar2.f101072b, kVar2.f101071a, o0VarE);
                }
                o0VarE.g0(false);
                if (z26) {
                    o0VarE.C(1466213963);
                    h4.r.a aVar111116 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar11112 = d92.b.f58625c;
                    bVar11112.getClass();
                    j92.e eVar11112 = j92.b.f97899b;
                    h4.r rVarA14 = c2.l.A(aVar111116, eVar11112.f97920e, 0.0f, 2);
                    bVar11112.getClass();
                    d(0, c2.l.C(rVarA14, 0.0f, eVar11112.f97918c, 0.0f, 0.0f, 13), gl1.y.Q(o0VarE, R.string.optional_strength_workouts), p13.w.c(am.x0.f4309n1.f4362e), o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1466521793);
                    o0VarE.g0(false);
                }
                if (cVarB.isEmpty()) {
                    o0VarE.C(1466607973);
                    h4.r.a aVar111117 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar11113 = d92.b.f58625c;
                    bVar11113.getClass();
                    j92.e eVar11113 = j92.b.f97899b;
                    float f211119 = eVar11113.f97920e;
                    bVar11113.getClass();
                    float f2111110 = eVar11113.f97920e;
                    bVar11113.getClass();
                    f((i69 << 6) & 896, c2.l.C(aVar111117, f211119, eVar11113.f97918c, f2111110, 0.0f, 8), gl1.y.Q(o0VarE, R.string.required_list_header), cVarB, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1466911649);
                    o0VarE.g0(false);
                }
                if (cVarB2.isEmpty()) {
                    o0VarE.C(1466962117);
                    h4.r.a aVar111118 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar11114 = d92.b.f58625c;
                    bVar11114.getClass();
                    j92.e eVar11114 = j92.b.f97899b;
                    float f2111111 = eVar11114.f97920e;
                    bVar11114.getClass();
                    float f310 = eVar11114.f97920e;
                    bVar11114.getClass();
                    f((i69 << 3) & 896, c2.l.C(aVar111118, f2111111, eVar11114.f97918c, f310, 0.0f, 8), gl1.y.Q(o0VarE, R.string.optional_list_header), cVarB2, o0VarE);
                    z28 = false;
                    o0VarE.g0(false);
                } else {
                    z28 = false;
                    o0VarE.C(1467265793);
                    o0VarE.g0(false);
                }
                o0VarE.C(1467323576);
                o0VarE.g0(z28);
                l72.f0 f0Var7 = l72.f0.f110999a;
                h4.r rVarF7 = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarY7 = c2.l.y(rVarF7, j92.b.f97899b.f97920e);
                d.f56011a.getClass();
                if (z25) {
                    eVar2 = d.f56012b;
                } else {
                    eVar2 = d.f56013c;
                }
                f0Var7.h(eVar2, gl1.y.Q(o0VarE, R.string.select_plan), rVarY7, false, aVar8, o0VarE, i812 & 57344, 8);
                o0VarE.g0(true);
                x1 x1Var14 = p3.n.f135158a;
                z19 = z25;
                z18 = z26;
                rVar2 = aVar5;
                o0Var = o0VarE;
                cVar6 = cVarB;
                cVar7 = cVarB2;
                aVar3 = aVar8;
                cVar8 = cVarB3;
                num4 = num8;
                dVar3 = dVar11;
                num5 = num15;
                aVar4 = aVar111112;
            } else {
                o0VarE.e();
                rVar2 = rVar;
                cVar6 = cVar2;
                cVar7 = cVar3;
                cVar8 = cVar4;
                z18 = z14;
                aVar3 = aVar;
                aVar4 = aVar2;
                z19 = z16;
                o0Var = o0VarE;
                num4 = num3;
                dVar3 = dVar;
                num5 = num2;
            }
            cVar9 = cVar5;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: cw1.b
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        c.c(rVar2, num4, dVar3, num5, dVar2, str, str2, str3, cVar9, cVar6, cVar7, cVar8, str4, z18, z19, aVar3, aVar4, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i64 = i58 | 1769472;
        z16 = z15;
        i66 = i16 & 131072;
        if (i66 != 0) {
            i67 = i64 | 12582912;
        } else {
            i67 = i64 | (o0VarE.r(aVar) ? 8388608 : 4194304);
        }
        i68 = i16 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
        if (i68 != 0) {
            i67 |= 100663296;
        } else if ((i15 & 100663296) == 0) {
            i67 |= o0VarE.r(aVar2) ? 67108864 : 33554432;
        }
        i69 = i67;
        if ((i39 & 306783379) == 306783378) {
            z17 = true;
        } else {
            z17 = true;
        }
        if (o0VarE.n(i39 & 1, z17)) {
            aVar5 = h4.r.S;
            if (i77 != 0) {
                i74 = i44;
                num6 = null;
            } else {
                num6 = num3;
                i74 = i44;
            }
            if (i17 != 0) {
                dVar4 = null;
            } else {
                dVar4 = dVar;
            }
            if (i25 != 0) {
                num7 = null;
            } else {
                num7 = num2;
            }
            if (i36 != 0) {
                cVar5 = null;
            }
            if (i74 != 0) {
                cVarB = j53.l.b();
            } else {
                cVarB = cVar2;
            }
            if (i47 != 0) {
                cVarB2 = j53.l.b();
            } else {
                cVarB2 = cVar3;
            }
            if (i55 != 0) {
                cVarB3 = j53.l.b();
            } else {
                cVarB3 = cVar4;
            }
            if (i59 != 0) {
                z24 = false;
            } else {
                z24 = z14;
            }
            if (i65 != 0) {
                z16 = false;
            }
            if (i66 != 0) {
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new com.google.accompanist.drawablepainter.a(16);
                    o0VarE.K(objQ);
                }
                aVar6 = (e23.a) objQ;
            } else {
                aVar6 = aVar;
            }
            if (i68 != 0) {
                aVar7 = null;
            } else {
                aVar7 = aVar2;
            }
            x1 x1Var15 = p3.n.f135158a;
            num8 = num6;
            long jB8 = am.j.B(d92.b.f58623a, o0VarE);
            bVar = d92.b.f58625c;
            bVar.getClass();
            aVar8 = aVar6;
            eVar = j92.b.f97899b;
            z25 = z16;
            h4.r rVarE8 = u1.n.e(aVar5, jB8, k2.i.a(eVar.f97918c));
            bVar.getClass();
            h4.r rVarB8 = l4.k.b(rVarE8, k2.i.a(eVar.f97918c));
            c2.j.f22691a.getClass();
            c2.j.k kVar9 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(kVar9, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarB8, o0VarE);
            h5.g.V.getClass();
            aVar9 = h5.g.a.f81805b;
            z26 = z24;
            if (o0VarE.f135177b != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar9);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var8 = c2.b0.f22601a;
            int i813 = i69 >> 9;
            e(null, num8, dVar4, num7, aVar7, o0VarE, (i39 & 65520) | (458752 & i813));
            t4.d dVar12 = dVar4;
            Integer num16 = num7;
            e23.a aVar111119 = aVar7;
            bVar.getClass();
            float f111116 = eVar.f97920e;
            bVar.getClass();
            float f111117 = eVar.f97920e;
            bVar.getClass();
            b(c2.l.C(aVar5, f111116, eVar.f97918c, f111117, 0.0f, 8), dVar2, str, o0VarE, (i39 >> 12) & 1008);
            bVar.getClass();
            float f111118 = eVar.f97920e;
            bVar.getClass();
            float f111119 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC16 = c2.l.C(aVar5, f111118, eVar.f97918c, f111119, 0.0f, 8);
            j92.f fVar8 = d92.b.f58624b;
            fVar8.getClass();
            mh.c(str2, rVarC16, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, (i39 >> 21) & 14, 0, 131068);
            bVar.getClass();
            float f1111110 = eVar.f97920e;
            bVar.getClass();
            float f1111111 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC17 = c2.l.C(aVar5, f1111110, eVar.f97918c, f1111111, 0.0f, 8);
            fVar8.getClass();
            mh.c(str3, rVarC17, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, (i39 >> 24) & 14, 0, 131068);
            if (cVar5 == null) {
                o0VarE.C(1465326525);
                z27 = false;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1465326526);
                while (r2.hasNext()) {
                    h4.r.a aVar1111110 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar11115 = d92.b.f58625c;
                    bVar11115.getClass();
                    j92.e eVar11115 = j92.b.f97899b;
                    float f2111112 = eVar11115.f97920e;
                    bVar11115.getClass();
                    float f2111113 = eVar11115.f97920e;
                    bVar11115.getClass();
                    a(0, c2.l.C(aVar1111110, f2111112, eVar11115.f97917b, f2111113, 0.0f, 8), str5, o0VarE);
                }
                z27 = false;
                o0VarE.g0(false);
                Unit unit15 = Unit.INSTANCE;
            }
            if (str4 == null) {
                o0VarE.C(1465579392);
                o0VarE.g0(z27);
            } else {
                o0VarE.C(1465579393);
                h4.r.a aVar1111111 = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar11116 = d92.b.f58625c;
                bVar11116.getClass();
                j92.e eVar11116 = j92.b.f97899b;
                h4.r rVarA15 = c2.l.A(aVar1111111, eVar11116.f97920e, 0.0f, 2);
                bVar11116.getClass();
                g((i69 >> 6) & 112, c2.l.C(rVarA15, 0.0f, eVar11116.f97920e, 0.0f, 0.0f, 13), str4, o0VarE);
                Unit unit16 = Unit.INSTANCE;
                o0VarE.g0(false);
            }
            o0VarE.C(-1615282371);
            while (r3.hasNext()) {
                h4.r.a aVar1111112 = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar11117 = d92.b.f58625c;
                bVar11117.getClass();
                j92.e eVar11117 = j92.b.f97899b;
                float f2111114 = eVar11117.f97920e;
                bVar11117.getClass();
                float f2111115 = eVar11117.f97920e;
                bVar11117.getClass();
                d(0, c2.l.C(aVar1111112, f2111114, eVar11117.f97918c, f2111115, 0.0f, 8), kVar2.f101072b, kVar2.f101071a, o0VarE);
            }
            o0VarE.g0(false);
            if (z26) {
                o0VarE.C(1466213963);
                h4.r.a aVar1111113 = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar11118 = d92.b.f58625c;
                bVar11118.getClass();
                j92.e eVar11118 = j92.b.f97899b;
                h4.r rVarA16 = c2.l.A(aVar1111113, eVar11118.f97920e, 0.0f, 2);
                bVar11118.getClass();
                d(0, c2.l.C(rVarA16, 0.0f, eVar11118.f97918c, 0.0f, 0.0f, 13), gl1.y.Q(o0VarE, R.string.optional_strength_workouts), p13.w.c(am.x0.f4309n1.f4362e), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1466521793);
                o0VarE.g0(false);
            }
            if (cVarB.isEmpty()) {
                o0VarE.C(1466607973);
                h4.r.a aVar1111114 = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar11119 = d92.b.f58625c;
                bVar11119.getClass();
                j92.e eVar11119 = j92.b.f97899b;
                float f2111116 = eVar11119.f97920e;
                bVar11119.getClass();
                float f2111117 = eVar11119.f97920e;
                bVar11119.getClass();
                f((i69 << 6) & 896, c2.l.C(aVar1111114, f2111116, eVar11119.f97918c, f2111117, 0.0f, 8), gl1.y.Q(o0VarE, R.string.required_list_header), cVarB, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1466911649);
                o0VarE.g0(false);
            }
            if (cVarB2.isEmpty()) {
                o0VarE.C(1466962117);
                h4.r.a aVar1111115 = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar111110 = d92.b.f58625c;
                bVar111110.getClass();
                j92.e eVar111110 = j92.b.f97899b;
                float f2111118 = eVar111110.f97920e;
                bVar111110.getClass();
                float f311 = eVar111110.f97920e;
                bVar111110.getClass();
                f((i69 << 3) & 896, c2.l.C(aVar1111115, f2111118, eVar111110.f97918c, f311, 0.0f, 8), gl1.y.Q(o0VarE, R.string.optional_list_header), cVarB2, o0VarE);
                z28 = false;
                o0VarE.g0(false);
            } else {
                z28 = false;
                o0VarE.C(1467265793);
                o0VarE.g0(false);
            }
            o0VarE.C(1467323576);
            o0VarE.g0(z28);
            l72.f0 f0Var8 = l72.f0.f110999a;
            h4.r rVarF8 = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY8 = c2.l.y(rVarF8, j92.b.f97899b.f97920e);
            d.f56011a.getClass();
            if (z25) {
                eVar2 = d.f56012b;
            } else {
                eVar2 = d.f56013c;
            }
            f0Var8.h(eVar2, gl1.y.Q(o0VarE, R.string.select_plan), rVarY8, false, aVar8, o0VarE, i813 & 57344, 8);
            o0VarE.g0(true);
            x1 x1Var16 = p3.n.f135158a;
            z19 = z25;
            z18 = z26;
            rVar2 = aVar5;
            o0Var = o0VarE;
            cVar6 = cVarB;
            cVar7 = cVarB2;
            aVar3 = aVar8;
            cVar8 = cVarB3;
            num4 = num8;
            dVar3 = dVar12;
            num5 = num16;
            aVar4 = aVar111119;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            cVar6 = cVar2;
            cVar7 = cVar3;
            cVar8 = cVar4;
            z18 = z14;
            aVar3 = aVar;
            aVar4 = aVar2;
            z19 = z16;
            o0Var = o0VarE;
            num4 = num3;
            dVar3 = dVar;
            num5 = num2;
        }
        cVar9 = cVar5;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: cw1.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    c.c(rVar2, num4, dVar3, num5, dVar2, str, str2, str3, cVar9, cVar6, cVar7, cVar8, str4, z18, z19, aVar3, aVar4, (p3.m) obj, iT, iT2, i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void d(int i14, h4.r rVar, String str, List list, p3.m mVar) {
        list.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(-93780216);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97917b;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(iVarI, h4.d.a.f81534l, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            o0VarE.C(1739449165);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i7.b((u4.d) it.next(), null, x2.q(h4.r.S, h(o0VarE)), ds.e0.d(d92.b.f58623a, o0VarE), o0VarE, 48, 0);
            }
            o0VarE.g0(false);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(list, str, rVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:85:0x0247  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    public static final void e(h4.r rVar, Integer num, t4.d dVar, Integer num2, e23.a aVar, p3.m mVar, int i14) {
        h4.r rVar2;
        h4.r rVarF;
        c2.u uVar;
        ?? r14;
        int i15;
        ?? E = mVar.E(679474035);
        int i16 = i14 | 6;
        if ((i14 & 48) == 0) {
            i16 |= E.B(num) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= E.r(dVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= E.B(null) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= E.B(num2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= E.r(aVar) ? 131072 : 65536;
        }
        int i17 = i16;
        if (E.n(i17 & 1, (i17 & 74899) != 74898)) {
            h4.r.a aVar2 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            p3.m.a aVar3 = p3.m.f135153a;
            if (aVar != null) {
                E.C(30424390);
                h4.r rVarF2 = x2.f(aVar2, 1.0f);
                boolean z14 = (i17 & 458752) == 131072;
                Object objQ = E.q();
                if (z14) {
                    objQ = new ca0.v0(aVar, 26);
                    E.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ca0.v0(aVar, 26);
                        E.K(objQ);
                    }
                }
                rVarF = u1.w.d(rVarF2, false, null, null, (e23.a) objQ, 15);
                E.g0(false);
            } else {
                E.C(30532704);
                E.g0(false);
                rVarF = x2.f(aVar2, 1.0f);
            }
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(E.U);
            i2 i2VarA0 = E.a0();
            h4.r rVarC = h4.k.c(rVarF, E);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (E.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            E.z();
            if (E.T) {
                E.M(aVar4);
            } else {
                E.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, E);
            b4.c(h5.g.a.f81809f, i2VarA0, E);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (E.T || !p005kotlin.jvm.internal.s.g(E.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, E, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, E);
            c2.u uVar2 = c2.u.f22885a;
            if (num != null) {
                E.C(-808347715);
                u1.y0.a(n5.c.a(num.intValue(), E, 14 & (i17 >> 3)), null, c2.l.g(x2.f(aVar2, 1.0f), 1.7777778f), null, null, 0.0f, null, E, ((i17 >> 6) & 112) | 384, 120);
                E.g0(false);
                rVar2 = aVar2;
                uVar = uVar2;
                r14 = 0;
                i15 = 131072;
            } else if (dVar != null) {
                E.C(-808018898);
                int i18 = i17 >> 6;
                rVar2 = aVar2;
                uVar = uVar2;
                r14 = 0;
                i15 = 131072;
                u1.y0.a(dVar, null, c2.l.g(x2.f(aVar2, 1.0f), 1.7777778f), null, null, 0.0f, null, E, (i18 & 14) | 384 | (i18 & 112), 120);
                E.g0(false);
            } else {
                rVar2 = aVar2;
                uVar = uVar2;
                r14 = 0;
                i15 = 131072;
                E.C(-807715315);
                h4.r rVarG = c2.l.g(x2.f(rVar2, 1.0f), 1.7777778f);
                gl.c.f77766a.getClass();
                c2.q.a(u1.n.e(rVarG, o4.d0.c(0.4f, gl.c.a(E).p(), 14), o4.m1.f128891a), E, 0);
                E.g0(false);
            }
            if (num2 == null) {
                E.C(-807293654);
                E.g0(r14);
            } else {
                E.C(-807293653);
                int iIntValue = num2.intValue();
                l3.f23124b.getClass();
                String strValueOf = String.valueOf(l3.a.e1(iIntValue));
                h4.r rVarC2 = uVar.c(rVar2, h4.d.a.f81532j);
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97918c;
                bVar2.getClass();
                g3.a(r14, r14, c2.l.C(rVarC2, 0.0f, 0.0f, f14, eVar.f97918c, 3), strValueOf, E);
                E.g0(r14);
            }
            if (aVar != null) {
                E.C(-806985451);
                ?? r15 = (i17 & 458752) == i15 ? 1 : r14;
                Object objQ2 = E.q();
                if (r15 == 0) {
                    aVar3.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new ca0.v0(aVar, 27);
                        E.K(objQ2);
                    }
                } else {
                    objQ2 = new ca0.v0(aVar, 27);
                    E.K(objQ2);
                }
                q0.a((e23.a) objQ2, E, r14);
                E.g0(r14);
            } else {
                E.C(-806904727);
                E.g0(r14);
            }
            E.g0(true);
        } else {
            E.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = E.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(rVar2, num, dVar, num2, aVar, i14, 9);
        }
    }

    public static final void f(int i14, h4.r rVar, String str, List list, p3.m mVar) {
        int i15;
        List list2;
        p3.o0 o0Var;
        str.getClass();
        list.getClass();
        p3.o0 o0VarE = mVar.E(1861740700);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            list2 = list;
            i15 |= o0VarE.r(list2) ? 256 : 128;
        } else {
            list2 = list;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(rVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC2 = c2.l.C(aVar2, 0.0f, 0.0f, j92.b.f97899b.f97917b, 0.0f, 11);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            s5.x0 x0Var = j92.f.f97933j;
            mh.c(str, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var), o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131068);
            String strK0 = p13.h0.k0(list2, "\n", null, null, null, 62);
            fVar.getClass();
            mh.c(strK0, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131070);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(rVar, str, list, i14, 5);
        }
    }

    public static final void g(int i14, h4.r rVar, String str, p3.m mVar) {
        int i15;
        p3.o0 o0VarE = mVar.E(-943727168);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(iVarI, h4.d.a.f81534l, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            h4.r rVarQ = x2.q(h4.r.S, h(o0VarE));
            s62.a.f157643a.getClass();
            i7.b(v62.s0.a(t62.b.f162798a), null, rVarQ, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), o0VarE, 48, 0);
            d92.b.f58624b.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.d(rVar, str, i14, 1, (byte) 0);
        }
    }

    public static final float h(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        float f75992b = ((g6.c) mVar.A(kotlin.t1.f91490h)).getF75992b();
        d92.b.f58623a.getClass();
        d92.b.f58625c.getClass();
        float f14 = j92.b.f97901d.f97904c * f75992b;
        g6.f.a aVar = g6.f.f75994b;
        return f14;
    }
}
