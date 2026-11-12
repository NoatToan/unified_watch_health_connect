package g02;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e5;
import i3.mh;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 {
    /* JADX WARN: Code duplicated, block: B:102:0x0120  */
    /* JADX WARN: Code duplicated, block: B:103:0x0129  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0137  */
    /* JADX WARN: Code duplicated, block: B:108:0x013a  */
    /* JADX WARN: Code duplicated, block: B:110:0x013f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0149  */
    /* JADX WARN: Code duplicated, block: B:115:0x014d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x015f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0170  */
    /* JADX WARN: Code duplicated, block: B:128:0x0177  */
    /* JADX WARN: Code duplicated, block: B:131:0x0180  */
    /* JADX WARN: Code duplicated, block: B:133:0x0187  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:150:0x01be  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:158:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:160:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:161:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:164:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:166:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:169:0x0243  */
    /* JADX WARN: Code duplicated, block: B:171:0x024a  */
    /* JADX WARN: Code duplicated, block: B:172:0x024e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0261  */
    /* JADX WARN: Code duplicated, block: B:177:0x026f  */
    /* JADX WARN: Code duplicated, block: B:180:0x027b  */
    /* JADX WARN: Code duplicated, block: B:181:0x0280  */
    /* JADX WARN: Code duplicated, block: B:184:0x0288  */
    /* JADX WARN: Code duplicated, block: B:186:0x028c  */
    /* JADX WARN: Code duplicated, block: B:189:0x0297  */
    /* JADX WARN: Code duplicated, block: B:190:0x0299  */
    /* JADX WARN: Code duplicated, block: B:193:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:195:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:198:0x0326  */
    /* JADX WARN: Code duplicated, block: B:200:0x0332  */
    /* JADX WARN: Code duplicated, block: B:201:0x0334  */
    /* JADX WARN: Code duplicated, block: B:204:0x033b  */
    /* JADX WARN: Code duplicated, block: B:207:0x0343  */
    /* JADX WARN: Code duplicated, block: B:208:0x0346  */
    /* JADX WARN: Code duplicated, block: B:211:0x03b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:216:0x03db  */
    /* JADX WARN: Code duplicated, block: B:217:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:220:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:223:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:224:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:227:0x0405  */
    /* JADX WARN: Code duplicated, block: B:228:0x0408  */
    /* JADX WARN: Code duplicated, block: B:232:0x0446  */
    /* JADX WARN: Code duplicated, block: B:234:0x0451  */
    /* JADX WARN: Code duplicated, block: B:235:0x0453  */
    /* JADX WARN: Code duplicated, block: B:238:0x045a  */
    /* JADX WARN: Code duplicated, block: B:241:0x0462  */
    /* JADX WARN: Code duplicated, block: B:242:0x0465  */
    /* JADX WARN: Code duplicated, block: B:244:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:246:0x04be  */
    /* JADX WARN: Code duplicated, block: B:248:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:281:0x052a  */
    /* JADX WARN: Code duplicated, block: B:285:0x0592  */
    /* JADX WARN: Code duplicated, block: B:287:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:289:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:290:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:293:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:294:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:297:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:298:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:301:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:302:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:305:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:308:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:309:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:312:0x064f  */
    /* JADX WARN: Code duplicated, block: B:314:0x0659  */
    /* JADX WARN: Code duplicated, block: B:315:0x065b  */
    /* JADX WARN: Code duplicated, block: B:318:0x0662  */
    /* JADX WARN: Code duplicated, block: B:320:0x0669  */
    /* JADX WARN: Code duplicated, block: B:322:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:324:0x06be  */
    /* JADX WARN: Code duplicated, block: B:326:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:327:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:330:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:332:0x06de  */
    /* JADX WARN: Code duplicated, block: B:335:0x074e  */
    /* JADX WARN: Code duplicated, block: B:337:0x0752  */
    /* JADX WARN: Code duplicated, block: B:340:0x076a  */
    /* JADX WARN: Code duplicated, block: B:342:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x0107  */
    /* JADX WARN: Code duplicated, block: B:95:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0113  */
    /* JADX WARN: Code duplicated, block: B:98:0x0116  */
    public static final void a(String str, String str2, String str3, String str4, boolean z14, boolean z15, boolean z16, String str5, String str6, String str7, String str8, s5.x0 x0Var, p3.m mVar, int i14, int i15, int i16) {
        int i17;
        String str9;
        int i18;
        String str10;
        int i19;
        int i24;
        boolean z17;
        int i25;
        int i26;
        boolean z18;
        int i27;
        int i28;
        boolean z19;
        int i29;
        int i30;
        String str11;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        boolean z24;
        p3.o0 o0Var;
        String str12;
        boolean z25;
        boolean z26;
        boolean z27;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        s5.x0 x0Var2;
        p2 p2VarI0;
        String str18;
        String str19;
        String str20;
        s5.x0 x0VarB;
        String str21;
        int i47;
        char c14;
        String str22;
        String str23;
        String str24;
        h4.r.a aVar;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar2;
        h5.g.a.b bVar;
        int i48;
        int i49;
        int i54;
        boolean z28;
        Object objQ;
        p3.m.a aVar3;
        String str25;
        String str26;
        String str27;
        int i55;
        String str28;
        String str29;
        String str30;
        boolean z29;
        Object objQ2;
        boolean z34;
        boolean z35;
        boolean z36;
        boolean z37;
        boolean z38;
        Object objQ3;
        String str31;
        String str32;
        j92.f fVar;
        s5.x0 x0Var3;
        p3.o0 o0Var2;
        boolean z39;
        boolean z44;
        Object objQ4;
        boolean z45;
        String str33;
        String str34;
        String str35;
        boolean z46;
        Object objQ5;
        String str36;
        j92.f fVar2;
        s5.x0 x0Var4;
        boolean z47;
        int i56;
        boolean z48;
        Object objQ6;
        String str37;
        h4.r.a aVar4;
        String str38;
        s5.x0 x0Var5;
        p3.o0 o0Var3;
        String str39;
        boolean z49;
        Object objQ7;
        String str40;
        p3.o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, -1554313433);
        if ((i14 & 6) == 0) {
            i17 = (o0VarK.B(str) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= o0VarK.B(str2) ? 32 : 16;
        }
        int i57 = i16 & 4;
        if (i57 == 0) {
            if ((i14 & 384) == 0) {
                str9 = str3;
                i17 |= o0VarK.B(str9) ? 256 : 128;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                if ((i14 & 3072) == 0) {
                    str10 = str4;
                    if (o0VarK.B(str10)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
                i24 = i16 & 16;
                if (i24 != 0) {
                    if ((i14 & 24576) == 0) {
                        z17 = z14;
                        if (o0VarK.h(z17)) {
                            i25 = 16384;
                        } else {
                            i25 = 8192;
                        }
                        i17 |= i25;
                    }
                    i26 = i16 & 32;
                    if (i26 != 0) {
                        i17 |= 196608;
                        z18 = z15;
                    } else {
                        z18 = z15;
                        if ((i14 & 196608) == 0) {
                            if (o0VarK.h(z18)) {
                                i27 = 131072;
                            } else {
                                i27 = 65536;
                            }
                            i17 |= i27;
                        }
                    }
                    i28 = i16 & 64;
                    if (i28 != 0) {
                        i17 |= 1572864;
                        z19 = z16;
                    } else {
                        z19 = z16;
                        if ((i14 & 1572864) == 0) {
                            if (o0VarK.h(z19)) {
                                i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            } else {
                                i29 = 524288;
                            }
                            i17 |= i29;
                        }
                    }
                    i30 = i16 & 128;
                    if (i30 != 0) {
                        i17 |= 12582912;
                        str11 = str5;
                    } else {
                        str11 = str5;
                        if ((i14 & 12582912) == 0) {
                            if (o0VarK.B(str11)) {
                                i34 = 8388608;
                            } else {
                                i34 = 4194304;
                            }
                            i17 |= i34;
                        }
                    }
                    i35 = i16 & 256;
                    if (i35 != 0) {
                        i17 |= 100663296;
                    } else if ((i14 & 100663296) == 0) {
                        if (o0VarK.B(str6)) {
                            i36 = 67108864;
                        } else {
                            i36 = 33554432;
                        }
                        i17 |= i36;
                    }
                    i37 = i16 & 512;
                    if (i37 != 0) {
                        i17 |= C.ENCODING_PCM_32BIT;
                    } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarK.B(str7)) {
                            i38 = 536870912;
                        } else {
                            i38 = 268435456;
                        }
                        i17 |= i38;
                    }
                    i39 = i16 & 1024;
                    if (i39 != 0) {
                        i44 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarK.B(str8)) {
                            i45 = 4;
                        } else {
                            i45 = 2;
                        }
                        i44 = i15 | i45;
                    } else {
                        i44 = i15;
                    }
                    if ((i15 & 48) != 0) {
                        i44 |= ((i16 & 2048) == 0 || !o0VarK.B(x0Var)) ? 16 : 32;
                    }
                    i46 = i17;
                    if ((i17 & 306783379) == 306783378 || (i44 & 19) != 18) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if (o0VarK.n(i46 & 1, z24)) {
                        o0VarK.G0();
                        if ((i14 & 1) != 0 || o0VarK.o0()) {
                            if (i57 != 0) {
                                str9 = null;
                            }
                            if (i18 != 0) {
                                str10 = null;
                            }
                            if (i24 != 0) {
                                z17 = true;
                            }
                            if (i26 != 0) {
                                z18 = true;
                            }
                            if (i28 != 0) {
                                z19 = false;
                            }
                            if (i30 != 0) {
                                str11 = null;
                            }
                            if (i35 != 0) {
                                str18 = null;
                            } else {
                                str18 = str6;
                            }
                            if (i37 != 0) {
                                str19 = null;
                            } else {
                                str19 = str7;
                            }
                            if (i39 != 0) {
                                str20 = null;
                            } else {
                                str20 = str8;
                            }
                            if ((i16 & 2048) != 0) {
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                i44 &= -113;
                                x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarK);
                            } else {
                                x0VarB = x0Var;
                            }
                            str21 = str9;
                            i47 = i44;
                            c14 = 16;
                            str22 = str18;
                            str23 = str11;
                        } else {
                            o0VarK.e();
                            if ((i16 & 2048) != 0) {
                                i44 &= -113;
                            }
                            str19 = str7;
                            str20 = str8;
                            x0VarB = x0Var;
                            z17 = z17;
                            z18 = z18;
                            z19 = z19;
                            str21 = str9;
                            str23 = str11;
                            i47 = i44;
                            c14 = 16;
                            str22 = str6;
                        }
                        str24 = str10;
                        o0VarK.h0();
                        p3.x1 x1Var = p3.n.f135158a;
                        c2.j jVar = c2.j.f22691a;
                        g6.f.a aVar5 = g6.f.f75994b;
                        jVar.getClass();
                        c2.j.i iVarI = c2.j.i(4);
                        aVar = h4.r.S;
                        h4.d.f81522a.getClass();
                        zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarK, 6);
                        iHashCode = Long.hashCode(o0VarK.U);
                        i2VarA0 = o0VarK.a0();
                        rVarC = h4.k.c(aVar, o0VarK);
                        h5.g.V.getClass();
                        aVar2 = h5.g.a.f81805b;
                        if (o0VarK.f135177b != null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0VarK.z();
                        if (o0VarK.T) {
                            o0VarK.M(aVar2);
                        } else {
                            o0VarK.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, o0VarK);
                        b4.c(h5.g.a.f81809f, i2VarA0, o0VarK);
                        bVar = h5.g.a.f81813j;
                        if (o0VarK.T || !p005kotlin.jvm.internal.s.g(o0VarK.q(), Integer.valueOf(iHashCode))) {
                            v.h.A(iHashCode, o0VarK, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, o0VarK);
                        c2.b0 b0Var = c2.b0.f22601a;
                        if (z19) {
                            i48 = Integer.MAX_VALUE;
                        } else {
                            i48 = 1;
                        }
                        d6.p.f57793b.getClass();
                        if (z19) {
                            i49 = d6.p.f57796e;
                        } else {
                            i49 = d6.p.f57795d;
                        }
                        i54 = i49;
                        if ((i46 & 29360128) == 8388608) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        objQ = o0VarK.q();
                        aVar3 = p3.m.f135153a;
                        if (z28) {
                            objQ = new fp0.c(str23, 13);
                            o0VarK.K(objQ);
                        } else {
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new fp0.c(str23, 13);
                                o0VarK.K(objQ);
                            }
                        }
                        String str41 = str23;
                        str25 = str22;
                        str26 = str19;
                        str27 = str20;
                        mh.c(str, p5.v.c((e23.l) objQ, aVar, false), 0L, null, 0L, null, 0L, null, 0L, i54, false, i48, 0, null, x0VarB, o0VarK, i46 & 14, 29360128 & (i47 << 18), 110588);
                        i55 = i48;
                        s5.x0 x0Var6 = x0VarB;
                        if (((g6.c) o0VarK.A(kotlin.t1.f91490h)).getF75992b() > 1.5d) {
                            o0VarK.C(-1985975889);
                            if ((i46 & 234881024) == 67108864) {
                                z46 = true;
                            } else {
                                z46 = false;
                            }
                            objQ5 = o0VarK.q();
                            if (z46) {
                                str36 = str25;
                                objQ5 = new fp0.c(str36, 14);
                                o0VarK.K(objQ5);
                            } else {
                                aVar3.getClass();
                                if (objQ5 == p3.m.a.f135155b) {
                                    str36 = str25;
                                    objQ5 = new fp0.c(str36, 14);
                                    o0VarK.K(objQ5);
                                } else {
                                    str36 = str25;
                                }
                            }
                            h4.r rVarC2 = p5.v.c((e23.l) objQ5, aVar, false);
                            d92.b.f58623a.getClass();
                            fVar2 = d92.b.f58624b;
                            fVar2.getClass();
                            x0Var4 = j92.f.f97933j;
                            str25 = str36;
                            mh.c(str2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                            if (!g22.n.d(str21) || z17) {
                                z47 = false;
                                o0VarK.C(-1985448424);
                                i56 = i46;
                                if ((i56 & 1879048192) == 536870912) {
                                    z48 = true;
                                } else {
                                    z48 = false;
                                }
                                objQ6 = o0VarK.q();
                                if (z48) {
                                    str37 = str26;
                                    objQ6 = new fp0.c(str37, 15);
                                    o0VarK.K(objQ6);
                                } else {
                                    aVar3.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        str37 = str26;
                                        objQ6 = new fp0.c(str37, 15);
                                        o0VarK.K(objQ6);
                                    } else {
                                        str37 = str26;
                                    }
                                }
                                aVar4 = aVar;
                                h4.r rVarC3 = p5.v.c((e23.l) objQ6, aVar4, false);
                                if (str21 == null) {
                                    str38 = "";
                                } else {
                                    str38 = str21;
                                }
                                fVar2.getClass();
                                str26 = str37;
                                x0Var5 = x0Var4;
                                mh.c(str38, rVarC3, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, 0, 0, 110588);
                                o0Var3 = o0VarK;
                                o0Var3.g0(false);
                            } else {
                                o0VarK.C(-1984945263);
                                z47 = false;
                                o0VarK.g0(false);
                                o0Var3 = o0VarK;
                                i56 = i46;
                                aVar4 = aVar;
                                x0Var5 = x0Var4;
                            }
                            if (g22.n.d(str24)) {
                                o0Var3.C(-1984855394);
                                if ((i47 & 14) == 4) {
                                    z49 = true;
                                } else {
                                    z49 = z47;
                                }
                                objQ7 = o0Var3.q();
                                if (z49) {
                                    str40 = str27;
                                    objQ7 = new fp0.c(str40, 16);
                                    o0Var3.K(objQ7);
                                } else {
                                    aVar3.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        str40 = str27;
                                        objQ7 = new fp0.c(str40, 16);
                                        o0Var3.K(objQ7);
                                    } else {
                                        str40 = str27;
                                    }
                                }
                                h4.r rVarC4 = p5.v.c((e23.l) objQ7, aVar4, z47);
                                fVar2.getClass();
                                p3.o0 o0Var4 = o0Var3;
                                str27 = str40;
                                mh.c(str24, rVarC4, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var5, o0Var3), o0Var4, (i56 >> 9) & 14, 0, 110588);
                                str39 = str24;
                                o0Var = o0Var4;
                                o0Var.g0(z47);
                            } else {
                                o0Var = o0Var3;
                                str39 = str24;
                                o0Var.C(-1984357999);
                                o0Var.g0(z47);
                            }
                            o0Var.g0(z47);
                            str30 = str21;
                            z45 = true;
                            str28 = str39;
                        } else {
                            if (g22.n.d(str21) || !g22.n.d(str24) || z18) {
                                str28 = str24;
                                str29 = str21;
                                if (g22.n.d(str29)) {
                                    o0VarK.C(-1983478436);
                                    if ((234881024 & i46) == 67108864) {
                                        z34 = true;
                                    } else {
                                        z34 = false;
                                    }
                                    if ((i46 & 112) == 32) {
                                        z35 = true;
                                    } else {
                                        z35 = false;
                                    }
                                    boolean z54 = z34 | z35;
                                    if ((i46 & 1879048192) == 536870912) {
                                        z36 = true;
                                    } else {
                                        z36 = false;
                                    }
                                    boolean z55 = z54 | z36;
                                    if ((i46 & 896) == 256) {
                                        z37 = true;
                                    } else {
                                        z37 = false;
                                    }
                                    z38 = z55 | z37;
                                    objQ3 = o0VarK.q();
                                    if (z38) {
                                        objQ3 = new c0(0, str25, str2, str26, str29);
                                        str31 = str29;
                                        str32 = str2;
                                        o0VarK.K(objQ3);
                                    } else {
                                        aVar3.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            objQ3 = new c0(0, str25, str2, str26, str29);
                                            str31 = str29;
                                            str32 = str2;
                                            o0VarK.K(objQ3);
                                        } else {
                                            str31 = str29;
                                            str32 = str2;
                                        }
                                    }
                                    h4.r rVarC5 = p5.v.c((e23.l) objQ3, aVar, false);
                                    String strG = e5.g(str32, " • ", str31);
                                    d92.b.f58623a.getClass();
                                    fVar = d92.b.f58624b;
                                    fVar.getClass();
                                    x0Var3 = j92.f.f97933j;
                                    mh.c(strG, rVarC5, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0VarK), o0VarK, 0, 0, 110588);
                                    o0Var2 = o0VarK;
                                    if (g22.n.d(str28)) {
                                        o0Var2.C(-1982862466);
                                        if ((i47 & 14) == 4) {
                                            z44 = true;
                                        } else {
                                            z44 = false;
                                        }
                                        objQ4 = o0Var2.q();
                                        if (z44) {
                                            objQ4 = new fp0.c(str27, 17);
                                            o0Var2.K(objQ4);
                                        } else {
                                            aVar3.getClass();
                                            if (objQ4 == p3.m.a.f135155b) {
                                                objQ4 = new fp0.c(str27, 17);
                                                o0Var2.K(objQ4);
                                            }
                                        }
                                        h4.r rVarC6 = p5.v.c((e23.l) objQ4, aVar, false);
                                        fVar.getClass();
                                        mh.c(str28, rVarC6, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0Var2), o0Var2, (i46 >> 9) & 14, 0, 110588);
                                        o0Var2 = o0Var2;
                                        z39 = false;
                                        o0Var2.g0(false);
                                    } else {
                                        z39 = false;
                                        o0Var2.C(-1982365071);
                                        o0Var2.g0(false);
                                    }
                                    o0Var2.g0(z39);
                                    str30 = str31;
                                    str27 = str27;
                                } else {
                                    str28 = str28;
                                    str30 = str29;
                                    o0VarK.C(-1982297398);
                                    if ((234881024 & i46) == 67108864) {
                                        z29 = true;
                                    } else {
                                        z29 = false;
                                    }
                                    objQ2 = o0VarK.q();
                                    if (z29) {
                                        objQ2 = new fp0.c(str25, 18);
                                        o0VarK.K(objQ2);
                                    } else {
                                        aVar3.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new fp0.c(str25, 18);
                                            o0VarK.K(objQ2);
                                        }
                                    }
                                    h4.r rVarC7 = p5.v.c((e23.l) objQ2, aVar, false);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    str25 = str25;
                                    mh.c(str2, rVarC7, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(j92.f.f97933j, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                                    o0Var = o0VarK;
                                    o0Var.g0(false);
                                }
                                z45 = true;
                            } else {
                                o0VarK.C(-1984199000);
                                boolean z56 = ((234881024 & i46) == 67108864) | ((i46 & 112) == 32) | ((i46 & 1879048192) == 536870912) | ((i46 & 896) == 256) | ((i47 & 14) == 4) | ((i46 & 7168) == 2048);
                                Object objQ8 = o0VarK.q();
                                if (z56) {
                                    String str42 = str21;
                                    objQ8 = new e60.b(str25, 1, str2, str26, str42, str27, str24);
                                    str33 = str2;
                                    str34 = str42;
                                    str35 = str24;
                                    o0VarK.K(objQ8);
                                } else {
                                    aVar3.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        String str43 = str21;
                                        objQ8 = new e60.b(str25, 1, str2, str26, str43, str27, str24);
                                        str33 = str2;
                                        str34 = str43;
                                        str35 = str24;
                                        o0VarK.K(objQ8);
                                    } else {
                                        str33 = str2;
                                        str35 = str24;
                                        str34 = str21;
                                    }
                                }
                                h4.r rVarC8 = p5.v.c((e23.l) objQ8, aVar, false);
                                String str44 = str35;
                                String strD = j20.x.d(str33, " • ", str34, " • ", str44);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                mh.c(strD, rVarC8, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(j92.f.f97933j, o0VarK), o0VarK, 0, 0, 110588);
                                o0Var2 = o0VarK;
                                o0Var2.g0(false);
                                str28 = str44;
                                str30 = str34;
                            }
                            o0Var = o0Var2;
                            z45 = true;
                        }
                        o0Var.g0(z45);
                        str13 = str30;
                        str15 = str28;
                        str14 = str41;
                        z25 = z17;
                        z26 = z18;
                        z27 = z19;
                        x0Var2 = x0Var6;
                        str16 = str25;
                        str17 = str26;
                        str12 = str27;
                    } else {
                        o0Var = o0VarK;
                        o0Var.e();
                        str12 = str8;
                        z25 = z17;
                        z26 = z18;
                        z27 = z19;
                        str13 = str9;
                        str14 = str11;
                        str15 = str10;
                        str16 = str6;
                        str17 = str7;
                        x0Var2 = x0Var;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new d0(str, str2, str13, str15, z25, z26, z27, str14, str16, str17, str12, x0Var2, i14, i15, i16);
                    }
                }
                i17 |= 24576;
                z17 = z14;
                i26 = i16 & 32;
                if (i26 != 0) {
                    i17 |= 196608;
                    z18 = z15;
                } else {
                    z18 = z15;
                    if ((i14 & 196608) == 0) {
                        if (o0VarK.h(z18)) {
                            i27 = 131072;
                        } else {
                            i27 = 65536;
                        }
                        i17 |= i27;
                    }
                }
                i28 = i16 & 64;
                if (i28 != 0) {
                    i17 |= 1572864;
                    z19 = z16;
                } else {
                    z19 = z16;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarK.h(z19)) {
                            i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i29 = 524288;
                        }
                        i17 |= i29;
                    }
                }
                i30 = i16 & 128;
                if (i30 != 0) {
                    i17 |= 12582912;
                    str11 = str5;
                } else {
                    str11 = str5;
                    if ((i14 & 12582912) == 0) {
                        if (o0VarK.B(str11)) {
                            i34 = 8388608;
                        } else {
                            i34 = 4194304;
                        }
                        i17 |= i34;
                    }
                }
                i35 = i16 & 256;
                if (i35 != 0) {
                    i17 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    if (o0VarK.B(str6)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i17 |= i36;
                }
                i37 = i16 & 512;
                if (i37 != 0) {
                    i17 |= C.ENCODING_PCM_32BIT;
                } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarK.B(str7)) {
                        i38 = 536870912;
                    } else {
                        i38 = 268435456;
                    }
                    i17 |= i38;
                }
                i39 = i16 & 1024;
                if (i39 != 0) {
                    i44 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarK.B(str8)) {
                        i45 = 4;
                    } else {
                        i45 = 2;
                    }
                    i44 = i15 | i45;
                } else {
                    i44 = i15;
                }
                if ((i15 & 48) != 0) {
                    i44 |= ((i16 & 2048) == 0 || !o0VarK.B(x0Var)) ? 16 : 32;
                }
                i46 = i17;
                if ((i17 & 306783379) == 306783378) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                if (o0VarK.n(i46 & 1, z24)) {
                    o0VarK.G0();
                    if ((i14 & 1) != 0) {
                        if (i57 != 0) {
                            str9 = null;
                        }
                        if (i18 != 0) {
                            str10 = null;
                        }
                        if (i24 != 0) {
                            z17 = true;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i30 != 0) {
                            str11 = null;
                        }
                        if (i35 != 0) {
                            str18 = null;
                        } else {
                            str18 = str6;
                        }
                        if (i37 != 0) {
                            str19 = null;
                        } else {
                            str19 = str7;
                        }
                        if (i39 != 0) {
                            str20 = null;
                        } else {
                            str20 = str8;
                        }
                        if ((i16 & 2048) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            i44 &= -113;
                            x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarK);
                        } else {
                            x0VarB = x0Var;
                        }
                        str21 = str9;
                        i47 = i44;
                        c14 = 16;
                        str22 = str18;
                        str23 = str11;
                    } else {
                        if (i57 != 0) {
                            str9 = null;
                        }
                        if (i18 != 0) {
                            str10 = null;
                        }
                        if (i24 != 0) {
                            z17 = true;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i30 != 0) {
                            str11 = null;
                        }
                        if (i35 != 0) {
                            str18 = null;
                        } else {
                            str18 = str6;
                        }
                        if (i37 != 0) {
                            str19 = null;
                        } else {
                            str19 = str7;
                        }
                        if (i39 != 0) {
                            str20 = null;
                        } else {
                            str20 = str8;
                        }
                        if ((i16 & 2048) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            i44 &= -113;
                            x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarK);
                        } else {
                            x0VarB = x0Var;
                        }
                        str21 = str9;
                        i47 = i44;
                        c14 = 16;
                        str22 = str18;
                        str23 = str11;
                    }
                    str24 = str10;
                    o0VarK.h0();
                    p3.x1 x1Var2 = p3.n.f135158a;
                    c2.j jVar2 = c2.j.f22691a;
                    g6.f.a aVar6 = g6.f.f75994b;
                    jVar2.getClass();
                    c2.j.i iVarI2 = c2.j.i(4);
                    aVar = h4.r.S;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(iVarI2, h4.d.a.f81536n, o0VarK, 6);
                    iHashCode = Long.hashCode(o0VarK.U);
                    i2VarA0 = o0VarK.a0();
                    rVarC = h4.k.c(aVar, o0VarK);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarK.f135177b != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarK.z();
                    if (o0VarK.T) {
                        o0VarK.M(aVar2);
                    } else {
                        o0VarK.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarK);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarK);
                    bVar = h5.g.a.f81813j;
                    if (o0VarK.T) {
                        v.h.A(iHashCode, o0VarK, iHashCode, bVar);
                    } else {
                        v.h.A(iHashCode, o0VarK, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarK);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    if (z19) {
                        i48 = Integer.MAX_VALUE;
                    } else {
                        i48 = 1;
                    }
                    d6.p.f57793b.getClass();
                    if (z19) {
                        i49 = d6.p.f57796e;
                    } else {
                        i49 = d6.p.f57795d;
                    }
                    i54 = i49;
                    if ((i46 & 29360128) == 8388608) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objQ = o0VarK.q();
                    aVar3 = p3.m.f135153a;
                    if (z28) {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new fp0.c(str23, 13);
                            o0VarK.K(objQ);
                        }
                    } else {
                        objQ = new fp0.c(str23, 13);
                        o0VarK.K(objQ);
                    }
                    String str45 = str23;
                    str25 = str22;
                    str26 = str19;
                    str27 = str20;
                    mh.c(str, p5.v.c((e23.l) objQ, aVar, false), 0L, null, 0L, null, 0L, null, 0L, i54, false, i48, 0, null, x0VarB, o0VarK, i46 & 14, 29360128 & (i47 << 18), 110588);
                    i55 = i48;
                    s5.x0 x0Var7 = x0VarB;
                    if (((g6.c) o0VarK.A(kotlin.t1.f91490h)).getF75992b() > 1.5d) {
                        o0VarK.C(-1985975889);
                        if ((i46 & 234881024) == 67108864) {
                            z46 = true;
                        } else {
                            z46 = false;
                        }
                        objQ5 = o0VarK.q();
                        if (z46) {
                            aVar3.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                str36 = str25;
                                objQ5 = new fp0.c(str36, 14);
                                o0VarK.K(objQ5);
                            } else {
                                str36 = str25;
                            }
                        } else {
                            str36 = str25;
                            objQ5 = new fp0.c(str36, 14);
                            o0VarK.K(objQ5);
                        }
                        h4.r rVarC9 = p5.v.c((e23.l) objQ5, aVar, false);
                        d92.b.f58623a.getClass();
                        fVar2 = d92.b.f58624b;
                        fVar2.getClass();
                        x0Var4 = j92.f.f97933j;
                        str25 = str36;
                        mh.c(str2, rVarC9, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                        if (g22.n.d(str21)) {
                            z47 = false;
                            o0VarK.C(-1985448424);
                            i56 = i46;
                            if ((i56 & 1879048192) == 536870912) {
                                z48 = true;
                            } else {
                                z48 = false;
                            }
                            objQ6 = o0VarK.q();
                            if (z48) {
                                aVar3.getClass();
                                if (objQ6 == p3.m.a.f135155b) {
                                    str37 = str26;
                                    objQ6 = new fp0.c(str37, 15);
                                    o0VarK.K(objQ6);
                                } else {
                                    str37 = str26;
                                }
                            } else {
                                str37 = str26;
                                objQ6 = new fp0.c(str37, 15);
                                o0VarK.K(objQ6);
                            }
                            aVar4 = aVar;
                            h4.r rVarC10 = p5.v.c((e23.l) objQ6, aVar4, false);
                            if (str21 == null) {
                                str38 = "";
                            } else {
                                str38 = str21;
                            }
                            fVar2.getClass();
                            str26 = str37;
                            x0Var5 = x0Var4;
                            mh.c(str38, rVarC10, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, 0, 0, 110588);
                            o0Var3 = o0VarK;
                            o0Var3.g0(false);
                        } else {
                            z47 = false;
                            o0VarK.C(-1985448424);
                            i56 = i46;
                            if ((i56 & 1879048192) == 536870912) {
                                z48 = true;
                            } else {
                                z48 = false;
                            }
                            objQ6 = o0VarK.q();
                            if (z48) {
                                aVar3.getClass();
                                if (objQ6 == p3.m.a.f135155b) {
                                    str37 = str26;
                                    objQ6 = new fp0.c(str37, 15);
                                    o0VarK.K(objQ6);
                                } else {
                                    str37 = str26;
                                }
                            } else {
                                str37 = str26;
                                objQ6 = new fp0.c(str37, 15);
                                o0VarK.K(objQ6);
                            }
                            aVar4 = aVar;
                            h4.r rVarC11 = p5.v.c((e23.l) objQ6, aVar4, false);
                            if (str21 == null) {
                                str38 = "";
                            } else {
                                str38 = str21;
                            }
                            fVar2.getClass();
                            str26 = str37;
                            x0Var5 = x0Var4;
                            mh.c(str38, rVarC11, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, 0, 0, 110588);
                            o0Var3 = o0VarK;
                            o0Var3.g0(false);
                        }
                        if (g22.n.d(str24)) {
                            o0Var3.C(-1984855394);
                            if ((i47 & 14) == 4) {
                                z49 = true;
                            } else {
                                z49 = z47;
                            }
                            objQ7 = o0Var3.q();
                            if (z49) {
                                aVar3.getClass();
                                if (objQ7 == p3.m.a.f135155b) {
                                    str40 = str27;
                                    objQ7 = new fp0.c(str40, 16);
                                    o0Var3.K(objQ7);
                                } else {
                                    str40 = str27;
                                }
                            } else {
                                str40 = str27;
                                objQ7 = new fp0.c(str40, 16);
                                o0Var3.K(objQ7);
                            }
                            h4.r rVarC12 = p5.v.c((e23.l) objQ7, aVar4, z47);
                            fVar2.getClass();
                            p3.o0 o0Var5 = o0Var3;
                            str27 = str40;
                            mh.c(str24, rVarC12, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var5, o0Var3), o0Var5, (i56 >> 9) & 14, 0, 110588);
                            str39 = str24;
                            o0Var = o0Var5;
                            o0Var.g0(z47);
                        } else {
                            o0Var = o0Var3;
                            str39 = str24;
                            o0Var.C(-1984357999);
                            o0Var.g0(z47);
                        }
                        o0Var.g0(z47);
                        str30 = str21;
                        z45 = true;
                        str28 = str39;
                    } else {
                        if (g22.n.d(str21)) {
                            str28 = str24;
                            str29 = str21;
                            if (g22.n.d(str29)) {
                                o0VarK.C(-1983478436);
                                if ((234881024 & i46) == 67108864) {
                                    z34 = true;
                                } else {
                                    z34 = false;
                                }
                                if ((i46 & 112) == 32) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                boolean z57 = z34 | z35;
                                if ((i46 & 1879048192) == 536870912) {
                                    z36 = true;
                                } else {
                                    z36 = false;
                                }
                                boolean z58 = z57 | z36;
                                if ((i46 & 896) == 256) {
                                    z37 = true;
                                } else {
                                    z37 = false;
                                }
                                z38 = z58 | z37;
                                objQ3 = o0VarK.q();
                                if (z38) {
                                    aVar3.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new c0(0, str25, str2, str26, str29);
                                        str31 = str29;
                                        str32 = str2;
                                        o0VarK.K(objQ3);
                                    } else {
                                        str31 = str29;
                                        str32 = str2;
                                    }
                                } else {
                                    objQ3 = new c0(0, str25, str2, str26, str29);
                                    str31 = str29;
                                    str32 = str2;
                                    o0VarK.K(objQ3);
                                }
                                h4.r rVarC13 = p5.v.c((e23.l) objQ3, aVar, false);
                                String strG2 = e5.g(str32, " • ", str31);
                                d92.b.f58623a.getClass();
                                fVar = d92.b.f58624b;
                                fVar.getClass();
                                x0Var3 = j92.f.f97933j;
                                mh.c(strG2, rVarC13, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0VarK), o0VarK, 0, 0, 110588);
                                o0Var2 = o0VarK;
                                if (g22.n.d(str28)) {
                                    o0Var2.C(-1982862466);
                                    if ((i47 & 14) == 4) {
                                        z44 = true;
                                    } else {
                                        z44 = false;
                                    }
                                    objQ4 = o0Var2.q();
                                    if (z44) {
                                        aVar3.getClass();
                                        if (objQ4 == p3.m.a.f135155b) {
                                            objQ4 = new fp0.c(str27, 17);
                                            o0Var2.K(objQ4);
                                        }
                                    } else {
                                        objQ4 = new fp0.c(str27, 17);
                                        o0Var2.K(objQ4);
                                    }
                                    h4.r rVarC14 = p5.v.c((e23.l) objQ4, aVar, false);
                                    fVar.getClass();
                                    mh.c(str28, rVarC14, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0Var2), o0Var2, (i46 >> 9) & 14, 0, 110588);
                                    o0Var2 = o0Var2;
                                    z39 = false;
                                    o0Var2.g0(false);
                                } else {
                                    z39 = false;
                                    o0Var2.C(-1982365071);
                                    o0Var2.g0(false);
                                }
                                o0Var2.g0(z39);
                                str30 = str31;
                                str27 = str27;
                                o0Var = o0Var2;
                            } else {
                                str28 = str28;
                                str30 = str29;
                                o0VarK.C(-1982297398);
                                if ((234881024 & i46) == 67108864) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                objQ2 = o0VarK.q();
                                if (z29) {
                                    aVar3.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new fp0.c(str25, 18);
                                        o0VarK.K(objQ2);
                                    }
                                } else {
                                    objQ2 = new fp0.c(str25, 18);
                                    o0VarK.K(objQ2);
                                }
                                h4.r rVarC15 = p5.v.c((e23.l) objQ2, aVar, false);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                str25 = str25;
                                mh.c(str2, rVarC15, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(j92.f.f97933j, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                                o0Var = o0VarK;
                                o0Var.g0(false);
                            }
                        } else {
                            str28 = str24;
                            str29 = str21;
                            if (g22.n.d(str29)) {
                                o0VarK.C(-1983478436);
                                if ((234881024 & i46) == 67108864) {
                                    z34 = true;
                                } else {
                                    z34 = false;
                                }
                                if ((i46 & 112) == 32) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                boolean z59 = z34 | z35;
                                if ((i46 & 1879048192) == 536870912) {
                                    z36 = true;
                                } else {
                                    z36 = false;
                                }
                                boolean z510 = z59 | z36;
                                if ((i46 & 896) == 256) {
                                    z37 = true;
                                } else {
                                    z37 = false;
                                }
                                z38 = z510 | z37;
                                objQ3 = o0VarK.q();
                                if (z38) {
                                    aVar3.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new c0(0, str25, str2, str26, str29);
                                        str31 = str29;
                                        str32 = str2;
                                        o0VarK.K(objQ3);
                                    } else {
                                        str31 = str29;
                                        str32 = str2;
                                    }
                                } else {
                                    objQ3 = new c0(0, str25, str2, str26, str29);
                                    str31 = str29;
                                    str32 = str2;
                                    o0VarK.K(objQ3);
                                }
                                h4.r rVarC16 = p5.v.c((e23.l) objQ3, aVar, false);
                                String strG3 = e5.g(str32, " • ", str31);
                                d92.b.f58623a.getClass();
                                fVar = d92.b.f58624b;
                                fVar.getClass();
                                x0Var3 = j92.f.f97933j;
                                mh.c(strG3, rVarC16, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0VarK), o0VarK, 0, 0, 110588);
                                o0Var2 = o0VarK;
                                if (g22.n.d(str28)) {
                                    o0Var2.C(-1982862466);
                                    if ((i47 & 14) == 4) {
                                        z44 = true;
                                    } else {
                                        z44 = false;
                                    }
                                    objQ4 = o0Var2.q();
                                    if (z44) {
                                        aVar3.getClass();
                                        if (objQ4 == p3.m.a.f135155b) {
                                            objQ4 = new fp0.c(str27, 17);
                                            o0Var2.K(objQ4);
                                        }
                                    } else {
                                        objQ4 = new fp0.c(str27, 17);
                                        o0Var2.K(objQ4);
                                    }
                                    h4.r rVarC17 = p5.v.c((e23.l) objQ4, aVar, false);
                                    fVar.getClass();
                                    mh.c(str28, rVarC17, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0Var2), o0Var2, (i46 >> 9) & 14, 0, 110588);
                                    o0Var2 = o0Var2;
                                    z39 = false;
                                    o0Var2.g0(false);
                                } else {
                                    z39 = false;
                                    o0Var2.C(-1982365071);
                                    o0Var2.g0(false);
                                }
                                o0Var2.g0(z39);
                                str30 = str31;
                                str27 = str27;
                                o0Var = o0Var2;
                            } else {
                                str28 = str28;
                                str30 = str29;
                                o0VarK.C(-1982297398);
                                if ((234881024 & i46) == 67108864) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                objQ2 = o0VarK.q();
                                if (z29) {
                                    aVar3.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new fp0.c(str25, 18);
                                        o0VarK.K(objQ2);
                                    }
                                } else {
                                    objQ2 = new fp0.c(str25, 18);
                                    o0VarK.K(objQ2);
                                }
                                h4.r rVarC18 = p5.v.c((e23.l) objQ2, aVar, false);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                str25 = str25;
                                mh.c(str2, rVarC18, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(j92.f.f97933j, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                                o0Var = o0VarK;
                                o0Var.g0(false);
                            }
                        }
                        z45 = true;
                    }
                    o0Var.g0(z45);
                    str13 = str30;
                    str15 = str28;
                    str14 = str45;
                    z25 = z17;
                    z26 = z18;
                    z27 = z19;
                    x0Var2 = x0Var7;
                    str16 = str25;
                    str17 = str26;
                    str12 = str27;
                } else {
                    o0Var = o0VarK;
                    o0Var.e();
                    str12 = str8;
                    z25 = z17;
                    z26 = z18;
                    z27 = z19;
                    str13 = str9;
                    str14 = str11;
                    str15 = str10;
                    str16 = str6;
                    str17 = str7;
                    x0Var2 = x0Var;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new d0(str, str2, str13, str15, z25, z26, z27, str14, str16, str17, str12, x0Var2, i14, i15, i16);
                }
            }
            i17 |= 3072;
            str10 = str4;
            i24 = i16 & 16;
            if (i24 != 0) {
                if ((i14 & 24576) == 0) {
                    z17 = z14;
                    if (o0VarK.h(z17)) {
                        i25 = 16384;
                    } else {
                        i25 = 8192;
                    }
                    i17 |= i25;
                }
                i26 = i16 & 32;
                if (i26 != 0) {
                    i17 |= 196608;
                    z18 = z15;
                } else {
                    z18 = z15;
                    if ((i14 & 196608) == 0) {
                        if (o0VarK.h(z18)) {
                            i27 = 131072;
                        } else {
                            i27 = 65536;
                        }
                        i17 |= i27;
                    }
                }
                i28 = i16 & 64;
                if (i28 != 0) {
                    i17 |= 1572864;
                    z19 = z16;
                } else {
                    z19 = z16;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarK.h(z19)) {
                            i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i29 = 524288;
                        }
                        i17 |= i29;
                    }
                }
                i30 = i16 & 128;
                if (i30 != 0) {
                    i17 |= 12582912;
                    str11 = str5;
                } else {
                    str11 = str5;
                    if ((i14 & 12582912) == 0) {
                        if (o0VarK.B(str11)) {
                            i34 = 8388608;
                        } else {
                            i34 = 4194304;
                        }
                        i17 |= i34;
                    }
                }
                i35 = i16 & 256;
                if (i35 != 0) {
                    i17 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    if (o0VarK.B(str6)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i17 |= i36;
                }
                i37 = i16 & 512;
                if (i37 != 0) {
                    i17 |= C.ENCODING_PCM_32BIT;
                } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarK.B(str7)) {
                        i38 = 536870912;
                    } else {
                        i38 = 268435456;
                    }
                    i17 |= i38;
                }
                i39 = i16 & 1024;
                if (i39 != 0) {
                    i44 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarK.B(str8)) {
                        i45 = 4;
                    } else {
                        i45 = 2;
                    }
                    i44 = i15 | i45;
                } else {
                    i44 = i15;
                }
                if ((i15 & 48) != 0) {
                    i44 |= ((i16 & 2048) == 0 || !o0VarK.B(x0Var)) ? 16 : 32;
                }
                i46 = i17;
                if ((i17 & 306783379) == 306783378) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                if (o0VarK.n(i46 & 1, z24)) {
                    o0VarK.G0();
                    if ((i14 & 1) != 0) {
                        if (i57 != 0) {
                            str9 = null;
                        }
                        if (i18 != 0) {
                            str10 = null;
                        }
                        if (i24 != 0) {
                            z17 = true;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i30 != 0) {
                            str11 = null;
                        }
                        if (i35 != 0) {
                            str18 = null;
                        } else {
                            str18 = str6;
                        }
                        if (i37 != 0) {
                            str19 = null;
                        } else {
                            str19 = str7;
                        }
                        if (i39 != 0) {
                            str20 = null;
                        } else {
                            str20 = str8;
                        }
                        if ((i16 & 2048) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            i44 &= -113;
                            x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarK);
                        } else {
                            x0VarB = x0Var;
                        }
                        str21 = str9;
                        i47 = i44;
                        c14 = 16;
                        str22 = str18;
                        str23 = str11;
                    } else {
                        if (i57 != 0) {
                            str9 = null;
                        }
                        if (i18 != 0) {
                            str10 = null;
                        }
                        if (i24 != 0) {
                            z17 = true;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i30 != 0) {
                            str11 = null;
                        }
                        if (i35 != 0) {
                            str18 = null;
                        } else {
                            str18 = str6;
                        }
                        if (i37 != 0) {
                            str19 = null;
                        } else {
                            str19 = str7;
                        }
                        if (i39 != 0) {
                            str20 = null;
                        } else {
                            str20 = str8;
                        }
                        if ((i16 & 2048) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            i44 &= -113;
                            x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarK);
                        } else {
                            x0VarB = x0Var;
                        }
                        str21 = str9;
                        i47 = i44;
                        c14 = 16;
                        str22 = str18;
                        str23 = str11;
                    }
                    str24 = str10;
                    o0VarK.h0();
                    p3.x1 x1Var3 = p3.n.f135158a;
                    c2.j jVar3 = c2.j.f22691a;
                    g6.f.a aVar7 = g6.f.f75994b;
                    jVar3.getClass();
                    c2.j.i iVarI3 = c2.j.i(4);
                    aVar = h4.r.S;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(iVarI3, h4.d.a.f81536n, o0VarK, 6);
                    iHashCode = Long.hashCode(o0VarK.U);
                    i2VarA0 = o0VarK.a0();
                    rVarC = h4.k.c(aVar, o0VarK);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarK.f135177b != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarK.z();
                    if (o0VarK.T) {
                        o0VarK.M(aVar2);
                    } else {
                        o0VarK.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarK);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarK);
                    bVar = h5.g.a.f81813j;
                    if (o0VarK.T) {
                        v.h.A(iHashCode, o0VarK, iHashCode, bVar);
                    } else {
                        v.h.A(iHashCode, o0VarK, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarK);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    if (z19) {
                        i48 = Integer.MAX_VALUE;
                    } else {
                        i48 = 1;
                    }
                    d6.p.f57793b.getClass();
                    if (z19) {
                        i49 = d6.p.f57796e;
                    } else {
                        i49 = d6.p.f57795d;
                    }
                    i54 = i49;
                    if ((i46 & 29360128) == 8388608) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objQ = o0VarK.q();
                    aVar3 = p3.m.f135153a;
                    if (z28) {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new fp0.c(str23, 13);
                            o0VarK.K(objQ);
                        }
                    } else {
                        objQ = new fp0.c(str23, 13);
                        o0VarK.K(objQ);
                    }
                    String str46 = str23;
                    str25 = str22;
                    str26 = str19;
                    str27 = str20;
                    mh.c(str, p5.v.c((e23.l) objQ, aVar, false), 0L, null, 0L, null, 0L, null, 0L, i54, false, i48, 0, null, x0VarB, o0VarK, i46 & 14, 29360128 & (i47 << 18), 110588);
                    i55 = i48;
                    s5.x0 x0Var8 = x0VarB;
                    if (((g6.c) o0VarK.A(kotlin.t1.f91490h)).getF75992b() > 1.5d) {
                        o0VarK.C(-1985975889);
                        if ((i46 & 234881024) == 67108864) {
                            z46 = true;
                        } else {
                            z46 = false;
                        }
                        objQ5 = o0VarK.q();
                        if (z46) {
                            aVar3.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                str36 = str25;
                                objQ5 = new fp0.c(str36, 14);
                                o0VarK.K(objQ5);
                            } else {
                                str36 = str25;
                            }
                        } else {
                            str36 = str25;
                            objQ5 = new fp0.c(str36, 14);
                            o0VarK.K(objQ5);
                        }
                        h4.r rVarC19 = p5.v.c((e23.l) objQ5, aVar, false);
                        d92.b.f58623a.getClass();
                        fVar2 = d92.b.f58624b;
                        fVar2.getClass();
                        x0Var4 = j92.f.f97933j;
                        str25 = str36;
                        mh.c(str2, rVarC19, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                        if (g22.n.d(str21)) {
                            z47 = false;
                            o0VarK.C(-1985448424);
                            i56 = i46;
                            if ((i56 & 1879048192) == 536870912) {
                                z48 = true;
                            } else {
                                z48 = false;
                            }
                            objQ6 = o0VarK.q();
                            if (z48) {
                                aVar3.getClass();
                                if (objQ6 == p3.m.a.f135155b) {
                                    str37 = str26;
                                    objQ6 = new fp0.c(str37, 15);
                                    o0VarK.K(objQ6);
                                } else {
                                    str37 = str26;
                                }
                            } else {
                                str37 = str26;
                                objQ6 = new fp0.c(str37, 15);
                                o0VarK.K(objQ6);
                            }
                            aVar4 = aVar;
                            h4.r rVarC110 = p5.v.c((e23.l) objQ6, aVar4, false);
                            if (str21 == null) {
                                str38 = "";
                            } else {
                                str38 = str21;
                            }
                            fVar2.getClass();
                            str26 = str37;
                            x0Var5 = x0Var4;
                            mh.c(str38, rVarC110, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, 0, 0, 110588);
                            o0Var3 = o0VarK;
                            o0Var3.g0(false);
                        } else {
                            z47 = false;
                            o0VarK.C(-1985448424);
                            i56 = i46;
                            if ((i56 & 1879048192) == 536870912) {
                                z48 = true;
                            } else {
                                z48 = false;
                            }
                            objQ6 = o0VarK.q();
                            if (z48) {
                                aVar3.getClass();
                                if (objQ6 == p3.m.a.f135155b) {
                                    str37 = str26;
                                    objQ6 = new fp0.c(str37, 15);
                                    o0VarK.K(objQ6);
                                } else {
                                    str37 = str26;
                                }
                            } else {
                                str37 = str26;
                                objQ6 = new fp0.c(str37, 15);
                                o0VarK.K(objQ6);
                            }
                            aVar4 = aVar;
                            h4.r rVarC111 = p5.v.c((e23.l) objQ6, aVar4, false);
                            if (str21 == null) {
                                str38 = "";
                            } else {
                                str38 = str21;
                            }
                            fVar2.getClass();
                            str26 = str37;
                            x0Var5 = x0Var4;
                            mh.c(str38, rVarC111, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, 0, 0, 110588);
                            o0Var3 = o0VarK;
                            o0Var3.g0(false);
                        }
                        if (g22.n.d(str24)) {
                            o0Var3.C(-1984855394);
                            if ((i47 & 14) == 4) {
                                z49 = true;
                            } else {
                                z49 = z47;
                            }
                            objQ7 = o0Var3.q();
                            if (z49) {
                                aVar3.getClass();
                                if (objQ7 == p3.m.a.f135155b) {
                                    str40 = str27;
                                    objQ7 = new fp0.c(str40, 16);
                                    o0Var3.K(objQ7);
                                } else {
                                    str40 = str27;
                                }
                            } else {
                                str40 = str27;
                                objQ7 = new fp0.c(str40, 16);
                                o0Var3.K(objQ7);
                            }
                            h4.r rVarC112 = p5.v.c((e23.l) objQ7, aVar4, z47);
                            fVar2.getClass();
                            p3.o0 o0Var6 = o0Var3;
                            str27 = str40;
                            mh.c(str24, rVarC112, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var5, o0Var3), o0Var6, (i56 >> 9) & 14, 0, 110588);
                            str39 = str24;
                            o0Var = o0Var6;
                            o0Var.g0(z47);
                        } else {
                            o0Var = o0Var3;
                            str39 = str24;
                            o0Var.C(-1984357999);
                            o0Var.g0(z47);
                        }
                        o0Var.g0(z47);
                        str30 = str21;
                        z45 = true;
                        str28 = str39;
                    } else {
                        if (g22.n.d(str21)) {
                            str28 = str24;
                            str29 = str21;
                            if (g22.n.d(str29)) {
                                o0VarK.C(-1983478436);
                                if ((234881024 & i46) == 67108864) {
                                    z34 = true;
                                } else {
                                    z34 = false;
                                }
                                if ((i46 & 112) == 32) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                boolean z511 = z34 | z35;
                                if ((i46 & 1879048192) == 536870912) {
                                    z36 = true;
                                } else {
                                    z36 = false;
                                }
                                boolean z512 = z511 | z36;
                                if ((i46 & 896) == 256) {
                                    z37 = true;
                                } else {
                                    z37 = false;
                                }
                                z38 = z512 | z37;
                                objQ3 = o0VarK.q();
                                if (z38) {
                                    aVar3.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new c0(0, str25, str2, str26, str29);
                                        str31 = str29;
                                        str32 = str2;
                                        o0VarK.K(objQ3);
                                    } else {
                                        str31 = str29;
                                        str32 = str2;
                                    }
                                } else {
                                    objQ3 = new c0(0, str25, str2, str26, str29);
                                    str31 = str29;
                                    str32 = str2;
                                    o0VarK.K(objQ3);
                                }
                                h4.r rVarC113 = p5.v.c((e23.l) objQ3, aVar, false);
                                String strG4 = e5.g(str32, " • ", str31);
                                d92.b.f58623a.getClass();
                                fVar = d92.b.f58624b;
                                fVar.getClass();
                                x0Var3 = j92.f.f97933j;
                                mh.c(strG4, rVarC113, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0VarK), o0VarK, 0, 0, 110588);
                                o0Var2 = o0VarK;
                                if (g22.n.d(str28)) {
                                    o0Var2.C(-1982862466);
                                    if ((i47 & 14) == 4) {
                                        z44 = true;
                                    } else {
                                        z44 = false;
                                    }
                                    objQ4 = o0Var2.q();
                                    if (z44) {
                                        aVar3.getClass();
                                        if (objQ4 == p3.m.a.f135155b) {
                                            objQ4 = new fp0.c(str27, 17);
                                            o0Var2.K(objQ4);
                                        }
                                    } else {
                                        objQ4 = new fp0.c(str27, 17);
                                        o0Var2.K(objQ4);
                                    }
                                    h4.r rVarC114 = p5.v.c((e23.l) objQ4, aVar, false);
                                    fVar.getClass();
                                    mh.c(str28, rVarC114, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0Var2), o0Var2, (i46 >> 9) & 14, 0, 110588);
                                    o0Var2 = o0Var2;
                                    z39 = false;
                                    o0Var2.g0(false);
                                } else {
                                    z39 = false;
                                    o0Var2.C(-1982365071);
                                    o0Var2.g0(false);
                                }
                                o0Var2.g0(z39);
                                str30 = str31;
                                str27 = str27;
                                o0Var = o0Var2;
                            } else {
                                str28 = str28;
                                str30 = str29;
                                o0VarK.C(-1982297398);
                                if ((234881024 & i46) == 67108864) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                objQ2 = o0VarK.q();
                                if (z29) {
                                    aVar3.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new fp0.c(str25, 18);
                                        o0VarK.K(objQ2);
                                    }
                                } else {
                                    objQ2 = new fp0.c(str25, 18);
                                    o0VarK.K(objQ2);
                                }
                                h4.r rVarC115 = p5.v.c((e23.l) objQ2, aVar, false);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                str25 = str25;
                                mh.c(str2, rVarC115, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(j92.f.f97933j, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                                o0Var = o0VarK;
                                o0Var.g0(false);
                            }
                        } else {
                            str28 = str24;
                            str29 = str21;
                            if (g22.n.d(str29)) {
                                o0VarK.C(-1983478436);
                                if ((234881024 & i46) == 67108864) {
                                    z34 = true;
                                } else {
                                    z34 = false;
                                }
                                if ((i46 & 112) == 32) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                boolean z513 = z34 | z35;
                                if ((i46 & 1879048192) == 536870912) {
                                    z36 = true;
                                } else {
                                    z36 = false;
                                }
                                boolean z514 = z513 | z36;
                                if ((i46 & 896) == 256) {
                                    z37 = true;
                                } else {
                                    z37 = false;
                                }
                                z38 = z514 | z37;
                                objQ3 = o0VarK.q();
                                if (z38) {
                                    aVar3.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new c0(0, str25, str2, str26, str29);
                                        str31 = str29;
                                        str32 = str2;
                                        o0VarK.K(objQ3);
                                    } else {
                                        str31 = str29;
                                        str32 = str2;
                                    }
                                } else {
                                    objQ3 = new c0(0, str25, str2, str26, str29);
                                    str31 = str29;
                                    str32 = str2;
                                    o0VarK.K(objQ3);
                                }
                                h4.r rVarC116 = p5.v.c((e23.l) objQ3, aVar, false);
                                String strG5 = e5.g(str32, " • ", str31);
                                d92.b.f58623a.getClass();
                                fVar = d92.b.f58624b;
                                fVar.getClass();
                                x0Var3 = j92.f.f97933j;
                                mh.c(strG5, rVarC116, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0VarK), o0VarK, 0, 0, 110588);
                                o0Var2 = o0VarK;
                                if (g22.n.d(str28)) {
                                    o0Var2.C(-1982862466);
                                    if ((i47 & 14) == 4) {
                                        z44 = true;
                                    } else {
                                        z44 = false;
                                    }
                                    objQ4 = o0Var2.q();
                                    if (z44) {
                                        aVar3.getClass();
                                        if (objQ4 == p3.m.a.f135155b) {
                                            objQ4 = new fp0.c(str27, 17);
                                            o0Var2.K(objQ4);
                                        }
                                    } else {
                                        objQ4 = new fp0.c(str27, 17);
                                        o0Var2.K(objQ4);
                                    }
                                    h4.r rVarC117 = p5.v.c((e23.l) objQ4, aVar, false);
                                    fVar.getClass();
                                    mh.c(str28, rVarC117, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0Var2), o0Var2, (i46 >> 9) & 14, 0, 110588);
                                    o0Var2 = o0Var2;
                                    z39 = false;
                                    o0Var2.g0(false);
                                } else {
                                    z39 = false;
                                    o0Var2.C(-1982365071);
                                    o0Var2.g0(false);
                                }
                                o0Var2.g0(z39);
                                str30 = str31;
                                str27 = str27;
                                o0Var = o0Var2;
                            } else {
                                str28 = str28;
                                str30 = str29;
                                o0VarK.C(-1982297398);
                                if ((234881024 & i46) == 67108864) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                objQ2 = o0VarK.q();
                                if (z29) {
                                    aVar3.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new fp0.c(str25, 18);
                                        o0VarK.K(objQ2);
                                    }
                                } else {
                                    objQ2 = new fp0.c(str25, 18);
                                    o0VarK.K(objQ2);
                                }
                                h4.r rVarC118 = p5.v.c((e23.l) objQ2, aVar, false);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                str25 = str25;
                                mh.c(str2, rVarC118, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(j92.f.f97933j, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                                o0Var = o0VarK;
                                o0Var.g0(false);
                            }
                        }
                        z45 = true;
                    }
                    o0Var.g0(z45);
                    str13 = str30;
                    str15 = str28;
                    str14 = str46;
                    z25 = z17;
                    z26 = z18;
                    z27 = z19;
                    x0Var2 = x0Var8;
                    str16 = str25;
                    str17 = str26;
                    str12 = str27;
                } else {
                    o0Var = o0VarK;
                    o0Var.e();
                    str12 = str8;
                    z25 = z17;
                    z26 = z18;
                    z27 = z19;
                    str13 = str9;
                    str14 = str11;
                    str15 = str10;
                    str16 = str6;
                    str17 = str7;
                    x0Var2 = x0Var;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new d0(str, str2, str13, str15, z25, z26, z27, str14, str16, str17, str12, x0Var2, i14, i15, i16);
                }
            }
            i17 |= 24576;
            z17 = z14;
            i26 = i16 & 32;
            if (i26 != 0) {
                i17 |= 196608;
                z18 = z15;
            } else {
                z18 = z15;
                if ((i14 & 196608) == 0) {
                    if (o0VarK.h(z18)) {
                        i27 = 131072;
                    } else {
                        i27 = 65536;
                    }
                    i17 |= i27;
                }
            }
            i28 = i16 & 64;
            if (i28 != 0) {
                i17 |= 1572864;
                z19 = z16;
            } else {
                z19 = z16;
                if ((i14 & 1572864) == 0) {
                    if (o0VarK.h(z19)) {
                        i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i29 = 524288;
                    }
                    i17 |= i29;
                }
            }
            i30 = i16 & 128;
            if (i30 != 0) {
                i17 |= 12582912;
                str11 = str5;
            } else {
                str11 = str5;
                if ((i14 & 12582912) == 0) {
                    if (o0VarK.B(str11)) {
                        i34 = 8388608;
                    } else {
                        i34 = 4194304;
                    }
                    i17 |= i34;
                }
            }
            i35 = i16 & 256;
            if (i35 != 0) {
                i17 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarK.B(str6)) {
                    i36 = 67108864;
                } else {
                    i36 = 33554432;
                }
                i17 |= i36;
            }
            i37 = i16 & 512;
            if (i37 != 0) {
                i17 |= C.ENCODING_PCM_32BIT;
            } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarK.B(str7)) {
                    i38 = 536870912;
                } else {
                    i38 = 268435456;
                }
                i17 |= i38;
            }
            i39 = i16 & 1024;
            if (i39 != 0) {
                i44 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarK.B(str8)) {
                    i45 = 4;
                } else {
                    i45 = 2;
                }
                i44 = i15 | i45;
            } else {
                i44 = i15;
            }
            if ((i15 & 48) != 0) {
                i44 |= ((i16 & 2048) == 0 || !o0VarK.B(x0Var)) ? 16 : 32;
            }
            i46 = i17;
            if ((i17 & 306783379) == 306783378) {
                z24 = true;
            } else {
                z24 = true;
            }
            if (o0VarK.n(i46 & 1, z24)) {
                o0VarK.G0();
                if ((i14 & 1) != 0) {
                    if (i57 != 0) {
                        str9 = null;
                    }
                    if (i18 != 0) {
                        str10 = null;
                    }
                    if (i24 != 0) {
                        z17 = true;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i30 != 0) {
                        str11 = null;
                    }
                    if (i35 != 0) {
                        str18 = null;
                    } else {
                        str18 = str6;
                    }
                    if (i37 != 0) {
                        str19 = null;
                    } else {
                        str19 = str7;
                    }
                    if (i39 != 0) {
                        str20 = null;
                    } else {
                        str20 = str8;
                    }
                    if ((i16 & 2048) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i44 &= -113;
                        x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarK);
                    } else {
                        x0VarB = x0Var;
                    }
                    str21 = str9;
                    i47 = i44;
                    c14 = 16;
                    str22 = str18;
                    str23 = str11;
                } else {
                    if (i57 != 0) {
                        str9 = null;
                    }
                    if (i18 != 0) {
                        str10 = null;
                    }
                    if (i24 != 0) {
                        z17 = true;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i30 != 0) {
                        str11 = null;
                    }
                    if (i35 != 0) {
                        str18 = null;
                    } else {
                        str18 = str6;
                    }
                    if (i37 != 0) {
                        str19 = null;
                    } else {
                        str19 = str7;
                    }
                    if (i39 != 0) {
                        str20 = null;
                    } else {
                        str20 = str8;
                    }
                    if ((i16 & 2048) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i44 &= -113;
                        x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarK);
                    } else {
                        x0VarB = x0Var;
                    }
                    str21 = str9;
                    i47 = i44;
                    c14 = 16;
                    str22 = str18;
                    str23 = str11;
                }
                str24 = str10;
                o0VarK.h0();
                p3.x1 x1Var4 = p3.n.f135158a;
                c2.j jVar4 = c2.j.f22691a;
                g6.f.a aVar8 = g6.f.f75994b;
                jVar4.getClass();
                c2.j.i iVarI4 = c2.j.i(4);
                aVar = h4.r.S;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(iVarI4, h4.d.a.f81536n, o0VarK, 6);
                iHashCode = Long.hashCode(o0VarK.U);
                i2VarA0 = o0VarK.a0();
                rVarC = h4.k.c(aVar, o0VarK);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarK.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarK.z();
                if (o0VarK.T) {
                    o0VarK.M(aVar2);
                } else {
                    o0VarK.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarK);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarK);
                bVar = h5.g.a.f81813j;
                if (o0VarK.T) {
                    v.h.A(iHashCode, o0VarK, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarK, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarK);
                c2.b0 b0Var4 = c2.b0.f22601a;
                if (z19) {
                    i48 = Integer.MAX_VALUE;
                } else {
                    i48 = 1;
                }
                d6.p.f57793b.getClass();
                if (z19) {
                    i49 = d6.p.f57796e;
                } else {
                    i49 = d6.p.f57795d;
                }
                i54 = i49;
                if ((i46 & 29360128) == 8388608) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                objQ = o0VarK.q();
                aVar3 = p3.m.f135153a;
                if (z28) {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new fp0.c(str23, 13);
                        o0VarK.K(objQ);
                    }
                } else {
                    objQ = new fp0.c(str23, 13);
                    o0VarK.K(objQ);
                }
                String str47 = str23;
                str25 = str22;
                str26 = str19;
                str27 = str20;
                mh.c(str, p5.v.c((e23.l) objQ, aVar, false), 0L, null, 0L, null, 0L, null, 0L, i54, false, i48, 0, null, x0VarB, o0VarK, i46 & 14, 29360128 & (i47 << 18), 110588);
                i55 = i48;
                s5.x0 x0Var9 = x0VarB;
                if (((g6.c) o0VarK.A(kotlin.t1.f91490h)).getF75992b() > 1.5d) {
                    o0VarK.C(-1985975889);
                    if ((i46 & 234881024) == 67108864) {
                        z46 = true;
                    } else {
                        z46 = false;
                    }
                    objQ5 = o0VarK.q();
                    if (z46) {
                        aVar3.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            str36 = str25;
                            objQ5 = new fp0.c(str36, 14);
                            o0VarK.K(objQ5);
                        } else {
                            str36 = str25;
                        }
                    } else {
                        str36 = str25;
                        objQ5 = new fp0.c(str36, 14);
                        o0VarK.K(objQ5);
                    }
                    h4.r rVarC119 = p5.v.c((e23.l) objQ5, aVar, false);
                    d92.b.f58623a.getClass();
                    fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    x0Var4 = j92.f.f97933j;
                    str25 = str36;
                    mh.c(str2, rVarC119, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                    if (g22.n.d(str21)) {
                        z47 = false;
                        o0VarK.C(-1985448424);
                        i56 = i46;
                        if ((i56 & 1879048192) == 536870912) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                        objQ6 = o0VarK.q();
                        if (z48) {
                            aVar3.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                str37 = str26;
                                objQ6 = new fp0.c(str37, 15);
                                o0VarK.K(objQ6);
                            } else {
                                str37 = str26;
                            }
                        } else {
                            str37 = str26;
                            objQ6 = new fp0.c(str37, 15);
                            o0VarK.K(objQ6);
                        }
                        aVar4 = aVar;
                        h4.r rVarC1110 = p5.v.c((e23.l) objQ6, aVar4, false);
                        if (str21 == null) {
                            str38 = "";
                        } else {
                            str38 = str21;
                        }
                        fVar2.getClass();
                        str26 = str37;
                        x0Var5 = x0Var4;
                        mh.c(str38, rVarC1110, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, 0, 0, 110588);
                        o0Var3 = o0VarK;
                        o0Var3.g0(false);
                    } else {
                        z47 = false;
                        o0VarK.C(-1985448424);
                        i56 = i46;
                        if ((i56 & 1879048192) == 536870912) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                        objQ6 = o0VarK.q();
                        if (z48) {
                            aVar3.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                str37 = str26;
                                objQ6 = new fp0.c(str37, 15);
                                o0VarK.K(objQ6);
                            } else {
                                str37 = str26;
                            }
                        } else {
                            str37 = str26;
                            objQ6 = new fp0.c(str37, 15);
                            o0VarK.K(objQ6);
                        }
                        aVar4 = aVar;
                        h4.r rVarC1111 = p5.v.c((e23.l) objQ6, aVar4, false);
                        if (str21 == null) {
                            str38 = "";
                        } else {
                            str38 = str21;
                        }
                        fVar2.getClass();
                        str26 = str37;
                        x0Var5 = x0Var4;
                        mh.c(str38, rVarC1111, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, 0, 0, 110588);
                        o0Var3 = o0VarK;
                        o0Var3.g0(false);
                    }
                    if (g22.n.d(str24)) {
                        o0Var3.C(-1984855394);
                        if ((i47 & 14) == 4) {
                            z49 = true;
                        } else {
                            z49 = z47;
                        }
                        objQ7 = o0Var3.q();
                        if (z49) {
                            aVar3.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                str40 = str27;
                                objQ7 = new fp0.c(str40, 16);
                                o0Var3.K(objQ7);
                            } else {
                                str40 = str27;
                            }
                        } else {
                            str40 = str27;
                            objQ7 = new fp0.c(str40, 16);
                            o0Var3.K(objQ7);
                        }
                        h4.r rVarC1112 = p5.v.c((e23.l) objQ7, aVar4, z47);
                        fVar2.getClass();
                        p3.o0 o0Var7 = o0Var3;
                        str27 = str40;
                        mh.c(str24, rVarC1112, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var5, o0Var3), o0Var7, (i56 >> 9) & 14, 0, 110588);
                        str39 = str24;
                        o0Var = o0Var7;
                        o0Var.g0(z47);
                    } else {
                        o0Var = o0Var3;
                        str39 = str24;
                        o0Var.C(-1984357999);
                        o0Var.g0(z47);
                    }
                    o0Var.g0(z47);
                    str30 = str21;
                    z45 = true;
                    str28 = str39;
                } else {
                    if (g22.n.d(str21)) {
                        str28 = str24;
                        str29 = str21;
                        if (g22.n.d(str29)) {
                            o0VarK.C(-1983478436);
                            if ((234881024 & i46) == 67108864) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            if ((i46 & 112) == 32) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            boolean z515 = z34 | z35;
                            if ((i46 & 1879048192) == 536870912) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            boolean z516 = z515 | z36;
                            if ((i46 & 896) == 256) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            z38 = z516 | z37;
                            objQ3 = o0VarK.q();
                            if (z38) {
                                aVar3.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new c0(0, str25, str2, str26, str29);
                                    str31 = str29;
                                    str32 = str2;
                                    o0VarK.K(objQ3);
                                } else {
                                    str31 = str29;
                                    str32 = str2;
                                }
                            } else {
                                objQ3 = new c0(0, str25, str2, str26, str29);
                                str31 = str29;
                                str32 = str2;
                                o0VarK.K(objQ3);
                            }
                            h4.r rVarC1113 = p5.v.c((e23.l) objQ3, aVar, false);
                            String strG6 = e5.g(str32, " • ", str31);
                            d92.b.f58623a.getClass();
                            fVar = d92.b.f58624b;
                            fVar.getClass();
                            x0Var3 = j92.f.f97933j;
                            mh.c(strG6, rVarC1113, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0VarK), o0VarK, 0, 0, 110588);
                            o0Var2 = o0VarK;
                            if (g22.n.d(str28)) {
                                o0Var2.C(-1982862466);
                                if ((i47 & 14) == 4) {
                                    z44 = true;
                                } else {
                                    z44 = false;
                                }
                                objQ4 = o0Var2.q();
                                if (z44) {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new fp0.c(str27, 17);
                                        o0Var2.K(objQ4);
                                    }
                                } else {
                                    objQ4 = new fp0.c(str27, 17);
                                    o0Var2.K(objQ4);
                                }
                                h4.r rVarC1114 = p5.v.c((e23.l) objQ4, aVar, false);
                                fVar.getClass();
                                mh.c(str28, rVarC1114, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0Var2), o0Var2, (i46 >> 9) & 14, 0, 110588);
                                o0Var2 = o0Var2;
                                z39 = false;
                                o0Var2.g0(false);
                            } else {
                                z39 = false;
                                o0Var2.C(-1982365071);
                                o0Var2.g0(false);
                            }
                            o0Var2.g0(z39);
                            str30 = str31;
                            str27 = str27;
                            o0Var = o0Var2;
                        } else {
                            str28 = str28;
                            str30 = str29;
                            o0VarK.C(-1982297398);
                            if ((234881024 & i46) == 67108864) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            objQ2 = o0VarK.q();
                            if (z29) {
                                aVar3.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new fp0.c(str25, 18);
                                    o0VarK.K(objQ2);
                                }
                            } else {
                                objQ2 = new fp0.c(str25, 18);
                                o0VarK.K(objQ2);
                            }
                            h4.r rVarC1115 = p5.v.c((e23.l) objQ2, aVar, false);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            str25 = str25;
                            mh.c(str2, rVarC1115, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(j92.f.f97933j, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                            o0Var = o0VarK;
                            o0Var.g0(false);
                        }
                    } else {
                        str28 = str24;
                        str29 = str21;
                        if (g22.n.d(str29)) {
                            o0VarK.C(-1983478436);
                            if ((234881024 & i46) == 67108864) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            if ((i46 & 112) == 32) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            boolean z517 = z34 | z35;
                            if ((i46 & 1879048192) == 536870912) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            boolean z518 = z517 | z36;
                            if ((i46 & 896) == 256) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            z38 = z518 | z37;
                            objQ3 = o0VarK.q();
                            if (z38) {
                                aVar3.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new c0(0, str25, str2, str26, str29);
                                    str31 = str29;
                                    str32 = str2;
                                    o0VarK.K(objQ3);
                                } else {
                                    str31 = str29;
                                    str32 = str2;
                                }
                            } else {
                                objQ3 = new c0(0, str25, str2, str26, str29);
                                str31 = str29;
                                str32 = str2;
                                o0VarK.K(objQ3);
                            }
                            h4.r rVarC1116 = p5.v.c((e23.l) objQ3, aVar, false);
                            String strG7 = e5.g(str32, " • ", str31);
                            d92.b.f58623a.getClass();
                            fVar = d92.b.f58624b;
                            fVar.getClass();
                            x0Var3 = j92.f.f97933j;
                            mh.c(strG7, rVarC1116, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0VarK), o0VarK, 0, 0, 110588);
                            o0Var2 = o0VarK;
                            if (g22.n.d(str28)) {
                                o0Var2.C(-1982862466);
                                if ((i47 & 14) == 4) {
                                    z44 = true;
                                } else {
                                    z44 = false;
                                }
                                objQ4 = o0Var2.q();
                                if (z44) {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new fp0.c(str27, 17);
                                        o0Var2.K(objQ4);
                                    }
                                } else {
                                    objQ4 = new fp0.c(str27, 17);
                                    o0Var2.K(objQ4);
                                }
                                h4.r rVarC1117 = p5.v.c((e23.l) objQ4, aVar, false);
                                fVar.getClass();
                                mh.c(str28, rVarC1117, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0Var2), o0Var2, (i46 >> 9) & 14, 0, 110588);
                                o0Var2 = o0Var2;
                                z39 = false;
                                o0Var2.g0(false);
                            } else {
                                z39 = false;
                                o0Var2.C(-1982365071);
                                o0Var2.g0(false);
                            }
                            o0Var2.g0(z39);
                            str30 = str31;
                            str27 = str27;
                            o0Var = o0Var2;
                        } else {
                            str28 = str28;
                            str30 = str29;
                            o0VarK.C(-1982297398);
                            if ((234881024 & i46) == 67108864) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            objQ2 = o0VarK.q();
                            if (z29) {
                                aVar3.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new fp0.c(str25, 18);
                                    o0VarK.K(objQ2);
                                }
                            } else {
                                objQ2 = new fp0.c(str25, 18);
                                o0VarK.K(objQ2);
                            }
                            h4.r rVarC1118 = p5.v.c((e23.l) objQ2, aVar, false);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            str25 = str25;
                            mh.c(str2, rVarC1118, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(j92.f.f97933j, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                            o0Var = o0VarK;
                            o0Var.g0(false);
                        }
                    }
                    z45 = true;
                }
                o0Var.g0(z45);
                str13 = str30;
                str15 = str28;
                str14 = str47;
                z25 = z17;
                z26 = z18;
                z27 = z19;
                x0Var2 = x0Var9;
                str16 = str25;
                str17 = str26;
                str12 = str27;
            } else {
                o0Var = o0VarK;
                o0Var.e();
                str12 = str8;
                z25 = z17;
                z26 = z18;
                z27 = z19;
                str13 = str9;
                str14 = str11;
                str15 = str10;
                str16 = str6;
                str17 = str7;
                x0Var2 = x0Var;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d0(str, str2, str13, str15, z25, z26, z27, str14, str16, str17, str12, x0Var2, i14, i15, i16);
            }
        }
        i17 |= 384;
        str9 = str3;
        i18 = i16 & 8;
        if (i18 != 0) {
            if ((i14 & 3072) == 0) {
                str10 = str4;
                if (o0VarK.B(str10)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            i24 = i16 & 16;
            if (i24 != 0) {
                if ((i14 & 24576) == 0) {
                    z17 = z14;
                    if (o0VarK.h(z17)) {
                        i25 = 16384;
                    } else {
                        i25 = 8192;
                    }
                    i17 |= i25;
                }
                i26 = i16 & 32;
                if (i26 != 0) {
                    i17 |= 196608;
                    z18 = z15;
                } else {
                    z18 = z15;
                    if ((i14 & 196608) == 0) {
                        if (o0VarK.h(z18)) {
                            i27 = 131072;
                        } else {
                            i27 = 65536;
                        }
                        i17 |= i27;
                    }
                }
                i28 = i16 & 64;
                if (i28 != 0) {
                    i17 |= 1572864;
                    z19 = z16;
                } else {
                    z19 = z16;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarK.h(z19)) {
                            i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i29 = 524288;
                        }
                        i17 |= i29;
                    }
                }
                i30 = i16 & 128;
                if (i30 != 0) {
                    i17 |= 12582912;
                    str11 = str5;
                } else {
                    str11 = str5;
                    if ((i14 & 12582912) == 0) {
                        if (o0VarK.B(str11)) {
                            i34 = 8388608;
                        } else {
                            i34 = 4194304;
                        }
                        i17 |= i34;
                    }
                }
                i35 = i16 & 256;
                if (i35 != 0) {
                    i17 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    if (o0VarK.B(str6)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i17 |= i36;
                }
                i37 = i16 & 512;
                if (i37 != 0) {
                    i17 |= C.ENCODING_PCM_32BIT;
                } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarK.B(str7)) {
                        i38 = 536870912;
                    } else {
                        i38 = 268435456;
                    }
                    i17 |= i38;
                }
                i39 = i16 & 1024;
                if (i39 != 0) {
                    i44 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarK.B(str8)) {
                        i45 = 4;
                    } else {
                        i45 = 2;
                    }
                    i44 = i15 | i45;
                } else {
                    i44 = i15;
                }
                if ((i15 & 48) != 0) {
                    i44 |= ((i16 & 2048) == 0 || !o0VarK.B(x0Var)) ? 16 : 32;
                }
                i46 = i17;
                if ((i17 & 306783379) == 306783378) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                if (o0VarK.n(i46 & 1, z24)) {
                    o0VarK.G0();
                    if ((i14 & 1) != 0) {
                        if (i57 != 0) {
                            str9 = null;
                        }
                        if (i18 != 0) {
                            str10 = null;
                        }
                        if (i24 != 0) {
                            z17 = true;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i30 != 0) {
                            str11 = null;
                        }
                        if (i35 != 0) {
                            str18 = null;
                        } else {
                            str18 = str6;
                        }
                        if (i37 != 0) {
                            str19 = null;
                        } else {
                            str19 = str7;
                        }
                        if (i39 != 0) {
                            str20 = null;
                        } else {
                            str20 = str8;
                        }
                        if ((i16 & 2048) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            i44 &= -113;
                            x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarK);
                        } else {
                            x0VarB = x0Var;
                        }
                        str21 = str9;
                        i47 = i44;
                        c14 = 16;
                        str22 = str18;
                        str23 = str11;
                    } else {
                        if (i57 != 0) {
                            str9 = null;
                        }
                        if (i18 != 0) {
                            str10 = null;
                        }
                        if (i24 != 0) {
                            z17 = true;
                        }
                        if (i26 != 0) {
                            z18 = true;
                        }
                        if (i28 != 0) {
                            z19 = false;
                        }
                        if (i30 != 0) {
                            str11 = null;
                        }
                        if (i35 != 0) {
                            str18 = null;
                        } else {
                            str18 = str6;
                        }
                        if (i37 != 0) {
                            str19 = null;
                        } else {
                            str19 = str7;
                        }
                        if (i39 != 0) {
                            str20 = null;
                        } else {
                            str20 = str8;
                        }
                        if ((i16 & 2048) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            i44 &= -113;
                            x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarK);
                        } else {
                            x0VarB = x0Var;
                        }
                        str21 = str9;
                        i47 = i44;
                        c14 = 16;
                        str22 = str18;
                        str23 = str11;
                    }
                    str24 = str10;
                    o0VarK.h0();
                    p3.x1 x1Var5 = p3.n.f135158a;
                    c2.j jVar5 = c2.j.f22691a;
                    g6.f.a aVar9 = g6.f.f75994b;
                    jVar5.getClass();
                    c2.j.i iVarI5 = c2.j.i(4);
                    aVar = h4.r.S;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(iVarI5, h4.d.a.f81536n, o0VarK, 6);
                    iHashCode = Long.hashCode(o0VarK.U);
                    i2VarA0 = o0VarK.a0();
                    rVarC = h4.k.c(aVar, o0VarK);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarK.f135177b != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarK.z();
                    if (o0VarK.T) {
                        o0VarK.M(aVar2);
                    } else {
                        o0VarK.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarK);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarK);
                    bVar = h5.g.a.f81813j;
                    if (o0VarK.T) {
                        v.h.A(iHashCode, o0VarK, iHashCode, bVar);
                    } else {
                        v.h.A(iHashCode, o0VarK, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarK);
                    c2.b0 b0Var5 = c2.b0.f22601a;
                    if (z19) {
                        i48 = Integer.MAX_VALUE;
                    } else {
                        i48 = 1;
                    }
                    d6.p.f57793b.getClass();
                    if (z19) {
                        i49 = d6.p.f57796e;
                    } else {
                        i49 = d6.p.f57795d;
                    }
                    i54 = i49;
                    if ((i46 & 29360128) == 8388608) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objQ = o0VarK.q();
                    aVar3 = p3.m.f135153a;
                    if (z28) {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new fp0.c(str23, 13);
                            o0VarK.K(objQ);
                        }
                    } else {
                        objQ = new fp0.c(str23, 13);
                        o0VarK.K(objQ);
                    }
                    String str48 = str23;
                    str25 = str22;
                    str26 = str19;
                    str27 = str20;
                    mh.c(str, p5.v.c((e23.l) objQ, aVar, false), 0L, null, 0L, null, 0L, null, 0L, i54, false, i48, 0, null, x0VarB, o0VarK, i46 & 14, 29360128 & (i47 << 18), 110588);
                    i55 = i48;
                    s5.x0 x0Var10 = x0VarB;
                    if (((g6.c) o0VarK.A(kotlin.t1.f91490h)).getF75992b() > 1.5d) {
                        o0VarK.C(-1985975889);
                        if ((i46 & 234881024) == 67108864) {
                            z46 = true;
                        } else {
                            z46 = false;
                        }
                        objQ5 = o0VarK.q();
                        if (z46) {
                            aVar3.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                str36 = str25;
                                objQ5 = new fp0.c(str36, 14);
                                o0VarK.K(objQ5);
                            } else {
                                str36 = str25;
                            }
                        } else {
                            str36 = str25;
                            objQ5 = new fp0.c(str36, 14);
                            o0VarK.K(objQ5);
                        }
                        h4.r rVarC1119 = p5.v.c((e23.l) objQ5, aVar, false);
                        d92.b.f58623a.getClass();
                        fVar2 = d92.b.f58624b;
                        fVar2.getClass();
                        x0Var4 = j92.f.f97933j;
                        str25 = str36;
                        mh.c(str2, rVarC1119, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                        if (g22.n.d(str21)) {
                            z47 = false;
                            o0VarK.C(-1985448424);
                            i56 = i46;
                            if ((i56 & 1879048192) == 536870912) {
                                z48 = true;
                            } else {
                                z48 = false;
                            }
                            objQ6 = o0VarK.q();
                            if (z48) {
                                aVar3.getClass();
                                if (objQ6 == p3.m.a.f135155b) {
                                    str37 = str26;
                                    objQ6 = new fp0.c(str37, 15);
                                    o0VarK.K(objQ6);
                                } else {
                                    str37 = str26;
                                }
                            } else {
                                str37 = str26;
                                objQ6 = new fp0.c(str37, 15);
                                o0VarK.K(objQ6);
                            }
                            aVar4 = aVar;
                            h4.r rVarC11110 = p5.v.c((e23.l) objQ6, aVar4, false);
                            if (str21 == null) {
                                str38 = "";
                            } else {
                                str38 = str21;
                            }
                            fVar2.getClass();
                            str26 = str37;
                            x0Var5 = x0Var4;
                            mh.c(str38, rVarC11110, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, 0, 0, 110588);
                            o0Var3 = o0VarK;
                            o0Var3.g0(false);
                        } else {
                            z47 = false;
                            o0VarK.C(-1985448424);
                            i56 = i46;
                            if ((i56 & 1879048192) == 536870912) {
                                z48 = true;
                            } else {
                                z48 = false;
                            }
                            objQ6 = o0VarK.q();
                            if (z48) {
                                aVar3.getClass();
                                if (objQ6 == p3.m.a.f135155b) {
                                    str37 = str26;
                                    objQ6 = new fp0.c(str37, 15);
                                    o0VarK.K(objQ6);
                                } else {
                                    str37 = str26;
                                }
                            } else {
                                str37 = str26;
                                objQ6 = new fp0.c(str37, 15);
                                o0VarK.K(objQ6);
                            }
                            aVar4 = aVar;
                            h4.r rVarC11111 = p5.v.c((e23.l) objQ6, aVar4, false);
                            if (str21 == null) {
                                str38 = "";
                            } else {
                                str38 = str21;
                            }
                            fVar2.getClass();
                            str26 = str37;
                            x0Var5 = x0Var4;
                            mh.c(str38, rVarC11111, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, 0, 0, 110588);
                            o0Var3 = o0VarK;
                            o0Var3.g0(false);
                        }
                        if (g22.n.d(str24)) {
                            o0Var3.C(-1984855394);
                            if ((i47 & 14) == 4) {
                                z49 = true;
                            } else {
                                z49 = z47;
                            }
                            objQ7 = o0Var3.q();
                            if (z49) {
                                aVar3.getClass();
                                if (objQ7 == p3.m.a.f135155b) {
                                    str40 = str27;
                                    objQ7 = new fp0.c(str40, 16);
                                    o0Var3.K(objQ7);
                                } else {
                                    str40 = str27;
                                }
                            } else {
                                str40 = str27;
                                objQ7 = new fp0.c(str40, 16);
                                o0Var3.K(objQ7);
                            }
                            h4.r rVarC11112 = p5.v.c((e23.l) objQ7, aVar4, z47);
                            fVar2.getClass();
                            p3.o0 o0Var8 = o0Var3;
                            str27 = str40;
                            mh.c(str24, rVarC11112, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var5, o0Var3), o0Var8, (i56 >> 9) & 14, 0, 110588);
                            str39 = str24;
                            o0Var = o0Var8;
                            o0Var.g0(z47);
                        } else {
                            o0Var = o0Var3;
                            str39 = str24;
                            o0Var.C(-1984357999);
                            o0Var.g0(z47);
                        }
                        o0Var.g0(z47);
                        str30 = str21;
                        z45 = true;
                        str28 = str39;
                    } else {
                        if (g22.n.d(str21)) {
                            str28 = str24;
                            str29 = str21;
                            if (g22.n.d(str29)) {
                                o0VarK.C(-1983478436);
                                if ((234881024 & i46) == 67108864) {
                                    z34 = true;
                                } else {
                                    z34 = false;
                                }
                                if ((i46 & 112) == 32) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                boolean z519 = z34 | z35;
                                if ((i46 & 1879048192) == 536870912) {
                                    z36 = true;
                                } else {
                                    z36 = false;
                                }
                                boolean z5110 = z519 | z36;
                                if ((i46 & 896) == 256) {
                                    z37 = true;
                                } else {
                                    z37 = false;
                                }
                                z38 = z5110 | z37;
                                objQ3 = o0VarK.q();
                                if (z38) {
                                    aVar3.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new c0(0, str25, str2, str26, str29);
                                        str31 = str29;
                                        str32 = str2;
                                        o0VarK.K(objQ3);
                                    } else {
                                        str31 = str29;
                                        str32 = str2;
                                    }
                                } else {
                                    objQ3 = new c0(0, str25, str2, str26, str29);
                                    str31 = str29;
                                    str32 = str2;
                                    o0VarK.K(objQ3);
                                }
                                h4.r rVarC11113 = p5.v.c((e23.l) objQ3, aVar, false);
                                String strG8 = e5.g(str32, " • ", str31);
                                d92.b.f58623a.getClass();
                                fVar = d92.b.f58624b;
                                fVar.getClass();
                                x0Var3 = j92.f.f97933j;
                                mh.c(strG8, rVarC11113, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0VarK), o0VarK, 0, 0, 110588);
                                o0Var2 = o0VarK;
                                if (g22.n.d(str28)) {
                                    o0Var2.C(-1982862466);
                                    if ((i47 & 14) == 4) {
                                        z44 = true;
                                    } else {
                                        z44 = false;
                                    }
                                    objQ4 = o0Var2.q();
                                    if (z44) {
                                        aVar3.getClass();
                                        if (objQ4 == p3.m.a.f135155b) {
                                            objQ4 = new fp0.c(str27, 17);
                                            o0Var2.K(objQ4);
                                        }
                                    } else {
                                        objQ4 = new fp0.c(str27, 17);
                                        o0Var2.K(objQ4);
                                    }
                                    h4.r rVarC11114 = p5.v.c((e23.l) objQ4, aVar, false);
                                    fVar.getClass();
                                    mh.c(str28, rVarC11114, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0Var2), o0Var2, (i46 >> 9) & 14, 0, 110588);
                                    o0Var2 = o0Var2;
                                    z39 = false;
                                    o0Var2.g0(false);
                                } else {
                                    z39 = false;
                                    o0Var2.C(-1982365071);
                                    o0Var2.g0(false);
                                }
                                o0Var2.g0(z39);
                                str30 = str31;
                                str27 = str27;
                                o0Var = o0Var2;
                            } else {
                                str28 = str28;
                                str30 = str29;
                                o0VarK.C(-1982297398);
                                if ((234881024 & i46) == 67108864) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                objQ2 = o0VarK.q();
                                if (z29) {
                                    aVar3.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new fp0.c(str25, 18);
                                        o0VarK.K(objQ2);
                                    }
                                } else {
                                    objQ2 = new fp0.c(str25, 18);
                                    o0VarK.K(objQ2);
                                }
                                h4.r rVarC11115 = p5.v.c((e23.l) objQ2, aVar, false);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                str25 = str25;
                                mh.c(str2, rVarC11115, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(j92.f.f97933j, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                                o0Var = o0VarK;
                                o0Var.g0(false);
                            }
                        } else {
                            str28 = str24;
                            str29 = str21;
                            if (g22.n.d(str29)) {
                                o0VarK.C(-1983478436);
                                if ((234881024 & i46) == 67108864) {
                                    z34 = true;
                                } else {
                                    z34 = false;
                                }
                                if ((i46 & 112) == 32) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                boolean z5111 = z34 | z35;
                                if ((i46 & 1879048192) == 536870912) {
                                    z36 = true;
                                } else {
                                    z36 = false;
                                }
                                boolean z5112 = z5111 | z36;
                                if ((i46 & 896) == 256) {
                                    z37 = true;
                                } else {
                                    z37 = false;
                                }
                                z38 = z5112 | z37;
                                objQ3 = o0VarK.q();
                                if (z38) {
                                    aVar3.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new c0(0, str25, str2, str26, str29);
                                        str31 = str29;
                                        str32 = str2;
                                        o0VarK.K(objQ3);
                                    } else {
                                        str31 = str29;
                                        str32 = str2;
                                    }
                                } else {
                                    objQ3 = new c0(0, str25, str2, str26, str29);
                                    str31 = str29;
                                    str32 = str2;
                                    o0VarK.K(objQ3);
                                }
                                h4.r rVarC11116 = p5.v.c((e23.l) objQ3, aVar, false);
                                String strG9 = e5.g(str32, " • ", str31);
                                d92.b.f58623a.getClass();
                                fVar = d92.b.f58624b;
                                fVar.getClass();
                                x0Var3 = j92.f.f97933j;
                                mh.c(strG9, rVarC11116, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0VarK), o0VarK, 0, 0, 110588);
                                o0Var2 = o0VarK;
                                if (g22.n.d(str28)) {
                                    o0Var2.C(-1982862466);
                                    if ((i47 & 14) == 4) {
                                        z44 = true;
                                    } else {
                                        z44 = false;
                                    }
                                    objQ4 = o0Var2.q();
                                    if (z44) {
                                        aVar3.getClass();
                                        if (objQ4 == p3.m.a.f135155b) {
                                            objQ4 = new fp0.c(str27, 17);
                                            o0Var2.K(objQ4);
                                        }
                                    } else {
                                        objQ4 = new fp0.c(str27, 17);
                                        o0Var2.K(objQ4);
                                    }
                                    h4.r rVarC11117 = p5.v.c((e23.l) objQ4, aVar, false);
                                    fVar.getClass();
                                    mh.c(str28, rVarC11117, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0Var2), o0Var2, (i46 >> 9) & 14, 0, 110588);
                                    o0Var2 = o0Var2;
                                    z39 = false;
                                    o0Var2.g0(false);
                                } else {
                                    z39 = false;
                                    o0Var2.C(-1982365071);
                                    o0Var2.g0(false);
                                }
                                o0Var2.g0(z39);
                                str30 = str31;
                                str27 = str27;
                                o0Var = o0Var2;
                            } else {
                                str28 = str28;
                                str30 = str29;
                                o0VarK.C(-1982297398);
                                if ((234881024 & i46) == 67108864) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                objQ2 = o0VarK.q();
                                if (z29) {
                                    aVar3.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new fp0.c(str25, 18);
                                        o0VarK.K(objQ2);
                                    }
                                } else {
                                    objQ2 = new fp0.c(str25, 18);
                                    o0VarK.K(objQ2);
                                }
                                h4.r rVarC11118 = p5.v.c((e23.l) objQ2, aVar, false);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                str25 = str25;
                                mh.c(str2, rVarC11118, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(j92.f.f97933j, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                                o0Var = o0VarK;
                                o0Var.g0(false);
                            }
                        }
                        z45 = true;
                    }
                    o0Var.g0(z45);
                    str13 = str30;
                    str15 = str28;
                    str14 = str48;
                    z25 = z17;
                    z26 = z18;
                    z27 = z19;
                    x0Var2 = x0Var10;
                    str16 = str25;
                    str17 = str26;
                    str12 = str27;
                } else {
                    o0Var = o0VarK;
                    o0Var.e();
                    str12 = str8;
                    z25 = z17;
                    z26 = z18;
                    z27 = z19;
                    str13 = str9;
                    str14 = str11;
                    str15 = str10;
                    str16 = str6;
                    str17 = str7;
                    x0Var2 = x0Var;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new d0(str, str2, str13, str15, z25, z26, z27, str14, str16, str17, str12, x0Var2, i14, i15, i16);
                }
            }
            i17 |= 24576;
            z17 = z14;
            i26 = i16 & 32;
            if (i26 != 0) {
                i17 |= 196608;
                z18 = z15;
            } else {
                z18 = z15;
                if ((i14 & 196608) == 0) {
                    if (o0VarK.h(z18)) {
                        i27 = 131072;
                    } else {
                        i27 = 65536;
                    }
                    i17 |= i27;
                }
            }
            i28 = i16 & 64;
            if (i28 != 0) {
                i17 |= 1572864;
                z19 = z16;
            } else {
                z19 = z16;
                if ((i14 & 1572864) == 0) {
                    if (o0VarK.h(z19)) {
                        i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i29 = 524288;
                    }
                    i17 |= i29;
                }
            }
            i30 = i16 & 128;
            if (i30 != 0) {
                i17 |= 12582912;
                str11 = str5;
            } else {
                str11 = str5;
                if ((i14 & 12582912) == 0) {
                    if (o0VarK.B(str11)) {
                        i34 = 8388608;
                    } else {
                        i34 = 4194304;
                    }
                    i17 |= i34;
                }
            }
            i35 = i16 & 256;
            if (i35 != 0) {
                i17 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarK.B(str6)) {
                    i36 = 67108864;
                } else {
                    i36 = 33554432;
                }
                i17 |= i36;
            }
            i37 = i16 & 512;
            if (i37 != 0) {
                i17 |= C.ENCODING_PCM_32BIT;
            } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarK.B(str7)) {
                    i38 = 536870912;
                } else {
                    i38 = 268435456;
                }
                i17 |= i38;
            }
            i39 = i16 & 1024;
            if (i39 != 0) {
                i44 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarK.B(str8)) {
                    i45 = 4;
                } else {
                    i45 = 2;
                }
                i44 = i15 | i45;
            } else {
                i44 = i15;
            }
            if ((i15 & 48) != 0) {
                i44 |= ((i16 & 2048) == 0 || !o0VarK.B(x0Var)) ? 16 : 32;
            }
            i46 = i17;
            if ((i17 & 306783379) == 306783378) {
                z24 = true;
            } else {
                z24 = true;
            }
            if (o0VarK.n(i46 & 1, z24)) {
                o0VarK.G0();
                if ((i14 & 1) != 0) {
                    if (i57 != 0) {
                        str9 = null;
                    }
                    if (i18 != 0) {
                        str10 = null;
                    }
                    if (i24 != 0) {
                        z17 = true;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i30 != 0) {
                        str11 = null;
                    }
                    if (i35 != 0) {
                        str18 = null;
                    } else {
                        str18 = str6;
                    }
                    if (i37 != 0) {
                        str19 = null;
                    } else {
                        str19 = str7;
                    }
                    if (i39 != 0) {
                        str20 = null;
                    } else {
                        str20 = str8;
                    }
                    if ((i16 & 2048) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i44 &= -113;
                        x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarK);
                    } else {
                        x0VarB = x0Var;
                    }
                    str21 = str9;
                    i47 = i44;
                    c14 = 16;
                    str22 = str18;
                    str23 = str11;
                } else {
                    if (i57 != 0) {
                        str9 = null;
                    }
                    if (i18 != 0) {
                        str10 = null;
                    }
                    if (i24 != 0) {
                        z17 = true;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i30 != 0) {
                        str11 = null;
                    }
                    if (i35 != 0) {
                        str18 = null;
                    } else {
                        str18 = str6;
                    }
                    if (i37 != 0) {
                        str19 = null;
                    } else {
                        str19 = str7;
                    }
                    if (i39 != 0) {
                        str20 = null;
                    } else {
                        str20 = str8;
                    }
                    if ((i16 & 2048) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i44 &= -113;
                        x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarK);
                    } else {
                        x0VarB = x0Var;
                    }
                    str21 = str9;
                    i47 = i44;
                    c14 = 16;
                    str22 = str18;
                    str23 = str11;
                }
                str24 = str10;
                o0VarK.h0();
                p3.x1 x1Var6 = p3.n.f135158a;
                c2.j jVar6 = c2.j.f22691a;
                g6.f.a aVar10 = g6.f.f75994b;
                jVar6.getClass();
                c2.j.i iVarI6 = c2.j.i(4);
                aVar = h4.r.S;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(iVarI6, h4.d.a.f81536n, o0VarK, 6);
                iHashCode = Long.hashCode(o0VarK.U);
                i2VarA0 = o0VarK.a0();
                rVarC = h4.k.c(aVar, o0VarK);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarK.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarK.z();
                if (o0VarK.T) {
                    o0VarK.M(aVar2);
                } else {
                    o0VarK.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarK);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarK);
                bVar = h5.g.a.f81813j;
                if (o0VarK.T) {
                    v.h.A(iHashCode, o0VarK, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarK, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarK);
                c2.b0 b0Var6 = c2.b0.f22601a;
                if (z19) {
                    i48 = Integer.MAX_VALUE;
                } else {
                    i48 = 1;
                }
                d6.p.f57793b.getClass();
                if (z19) {
                    i49 = d6.p.f57796e;
                } else {
                    i49 = d6.p.f57795d;
                }
                i54 = i49;
                if ((i46 & 29360128) == 8388608) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                objQ = o0VarK.q();
                aVar3 = p3.m.f135153a;
                if (z28) {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new fp0.c(str23, 13);
                        o0VarK.K(objQ);
                    }
                } else {
                    objQ = new fp0.c(str23, 13);
                    o0VarK.K(objQ);
                }
                String str49 = str23;
                str25 = str22;
                str26 = str19;
                str27 = str20;
                mh.c(str, p5.v.c((e23.l) objQ, aVar, false), 0L, null, 0L, null, 0L, null, 0L, i54, false, i48, 0, null, x0VarB, o0VarK, i46 & 14, 29360128 & (i47 << 18), 110588);
                i55 = i48;
                s5.x0 x0Var11 = x0VarB;
                if (((g6.c) o0VarK.A(kotlin.t1.f91490h)).getF75992b() > 1.5d) {
                    o0VarK.C(-1985975889);
                    if ((i46 & 234881024) == 67108864) {
                        z46 = true;
                    } else {
                        z46 = false;
                    }
                    objQ5 = o0VarK.q();
                    if (z46) {
                        aVar3.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            str36 = str25;
                            objQ5 = new fp0.c(str36, 14);
                            o0VarK.K(objQ5);
                        } else {
                            str36 = str25;
                        }
                    } else {
                        str36 = str25;
                        objQ5 = new fp0.c(str36, 14);
                        o0VarK.K(objQ5);
                    }
                    h4.r rVarC11119 = p5.v.c((e23.l) objQ5, aVar, false);
                    d92.b.f58623a.getClass();
                    fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    x0Var4 = j92.f.f97933j;
                    str25 = str36;
                    mh.c(str2, rVarC11119, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                    if (g22.n.d(str21)) {
                        z47 = false;
                        o0VarK.C(-1985448424);
                        i56 = i46;
                        if ((i56 & 1879048192) == 536870912) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                        objQ6 = o0VarK.q();
                        if (z48) {
                            aVar3.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                str37 = str26;
                                objQ6 = new fp0.c(str37, 15);
                                o0VarK.K(objQ6);
                            } else {
                                str37 = str26;
                            }
                        } else {
                            str37 = str26;
                            objQ6 = new fp0.c(str37, 15);
                            o0VarK.K(objQ6);
                        }
                        aVar4 = aVar;
                        h4.r rVarC111110 = p5.v.c((e23.l) objQ6, aVar4, false);
                        if (str21 == null) {
                            str38 = "";
                        } else {
                            str38 = str21;
                        }
                        fVar2.getClass();
                        str26 = str37;
                        x0Var5 = x0Var4;
                        mh.c(str38, rVarC111110, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, 0, 0, 110588);
                        o0Var3 = o0VarK;
                        o0Var3.g0(false);
                    } else {
                        z47 = false;
                        o0VarK.C(-1985448424);
                        i56 = i46;
                        if ((i56 & 1879048192) == 536870912) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                        objQ6 = o0VarK.q();
                        if (z48) {
                            aVar3.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                str37 = str26;
                                objQ6 = new fp0.c(str37, 15);
                                o0VarK.K(objQ6);
                            } else {
                                str37 = str26;
                            }
                        } else {
                            str37 = str26;
                            objQ6 = new fp0.c(str37, 15);
                            o0VarK.K(objQ6);
                        }
                        aVar4 = aVar;
                        h4.r rVarC111111 = p5.v.c((e23.l) objQ6, aVar4, false);
                        if (str21 == null) {
                            str38 = "";
                        } else {
                            str38 = str21;
                        }
                        fVar2.getClass();
                        str26 = str37;
                        x0Var5 = x0Var4;
                        mh.c(str38, rVarC111111, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, 0, 0, 110588);
                        o0Var3 = o0VarK;
                        o0Var3.g0(false);
                    }
                    if (g22.n.d(str24)) {
                        o0Var3.C(-1984855394);
                        if ((i47 & 14) == 4) {
                            z49 = true;
                        } else {
                            z49 = z47;
                        }
                        objQ7 = o0Var3.q();
                        if (z49) {
                            aVar3.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                str40 = str27;
                                objQ7 = new fp0.c(str40, 16);
                                o0Var3.K(objQ7);
                            } else {
                                str40 = str27;
                            }
                        } else {
                            str40 = str27;
                            objQ7 = new fp0.c(str40, 16);
                            o0Var3.K(objQ7);
                        }
                        h4.r rVarC111112 = p5.v.c((e23.l) objQ7, aVar4, z47);
                        fVar2.getClass();
                        p3.o0 o0Var9 = o0Var3;
                        str27 = str40;
                        mh.c(str24, rVarC111112, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var5, o0Var3), o0Var9, (i56 >> 9) & 14, 0, 110588);
                        str39 = str24;
                        o0Var = o0Var9;
                        o0Var.g0(z47);
                    } else {
                        o0Var = o0Var3;
                        str39 = str24;
                        o0Var.C(-1984357999);
                        o0Var.g0(z47);
                    }
                    o0Var.g0(z47);
                    str30 = str21;
                    z45 = true;
                    str28 = str39;
                } else {
                    if (g22.n.d(str21)) {
                        str28 = str24;
                        str29 = str21;
                        if (g22.n.d(str29)) {
                            o0VarK.C(-1983478436);
                            if ((234881024 & i46) == 67108864) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            if ((i46 & 112) == 32) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            boolean z5113 = z34 | z35;
                            if ((i46 & 1879048192) == 536870912) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            boolean z5114 = z5113 | z36;
                            if ((i46 & 896) == 256) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            z38 = z5114 | z37;
                            objQ3 = o0VarK.q();
                            if (z38) {
                                aVar3.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new c0(0, str25, str2, str26, str29);
                                    str31 = str29;
                                    str32 = str2;
                                    o0VarK.K(objQ3);
                                } else {
                                    str31 = str29;
                                    str32 = str2;
                                }
                            } else {
                                objQ3 = new c0(0, str25, str2, str26, str29);
                                str31 = str29;
                                str32 = str2;
                                o0VarK.K(objQ3);
                            }
                            h4.r rVarC111113 = p5.v.c((e23.l) objQ3, aVar, false);
                            String strG10 = e5.g(str32, " • ", str31);
                            d92.b.f58623a.getClass();
                            fVar = d92.b.f58624b;
                            fVar.getClass();
                            x0Var3 = j92.f.f97933j;
                            mh.c(strG10, rVarC111113, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0VarK), o0VarK, 0, 0, 110588);
                            o0Var2 = o0VarK;
                            if (g22.n.d(str28)) {
                                o0Var2.C(-1982862466);
                                if ((i47 & 14) == 4) {
                                    z44 = true;
                                } else {
                                    z44 = false;
                                }
                                objQ4 = o0Var2.q();
                                if (z44) {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new fp0.c(str27, 17);
                                        o0Var2.K(objQ4);
                                    }
                                } else {
                                    objQ4 = new fp0.c(str27, 17);
                                    o0Var2.K(objQ4);
                                }
                                h4.r rVarC111114 = p5.v.c((e23.l) objQ4, aVar, false);
                                fVar.getClass();
                                mh.c(str28, rVarC111114, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0Var2), o0Var2, (i46 >> 9) & 14, 0, 110588);
                                o0Var2 = o0Var2;
                                z39 = false;
                                o0Var2.g0(false);
                            } else {
                                z39 = false;
                                o0Var2.C(-1982365071);
                                o0Var2.g0(false);
                            }
                            o0Var2.g0(z39);
                            str30 = str31;
                            str27 = str27;
                            o0Var = o0Var2;
                        } else {
                            str28 = str28;
                            str30 = str29;
                            o0VarK.C(-1982297398);
                            if ((234881024 & i46) == 67108864) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            objQ2 = o0VarK.q();
                            if (z29) {
                                aVar3.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new fp0.c(str25, 18);
                                    o0VarK.K(objQ2);
                                }
                            } else {
                                objQ2 = new fp0.c(str25, 18);
                                o0VarK.K(objQ2);
                            }
                            h4.r rVarC111115 = p5.v.c((e23.l) objQ2, aVar, false);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            str25 = str25;
                            mh.c(str2, rVarC111115, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(j92.f.f97933j, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                            o0Var = o0VarK;
                            o0Var.g0(false);
                        }
                    } else {
                        str28 = str24;
                        str29 = str21;
                        if (g22.n.d(str29)) {
                            o0VarK.C(-1983478436);
                            if ((234881024 & i46) == 67108864) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            if ((i46 & 112) == 32) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            boolean z5115 = z34 | z35;
                            if ((i46 & 1879048192) == 536870912) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            boolean z5116 = z5115 | z36;
                            if ((i46 & 896) == 256) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            z38 = z5116 | z37;
                            objQ3 = o0VarK.q();
                            if (z38) {
                                aVar3.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new c0(0, str25, str2, str26, str29);
                                    str31 = str29;
                                    str32 = str2;
                                    o0VarK.K(objQ3);
                                } else {
                                    str31 = str29;
                                    str32 = str2;
                                }
                            } else {
                                objQ3 = new c0(0, str25, str2, str26, str29);
                                str31 = str29;
                                str32 = str2;
                                o0VarK.K(objQ3);
                            }
                            h4.r rVarC111116 = p5.v.c((e23.l) objQ3, aVar, false);
                            String strG11 = e5.g(str32, " • ", str31);
                            d92.b.f58623a.getClass();
                            fVar = d92.b.f58624b;
                            fVar.getClass();
                            x0Var3 = j92.f.f97933j;
                            mh.c(strG11, rVarC111116, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0VarK), o0VarK, 0, 0, 110588);
                            o0Var2 = o0VarK;
                            if (g22.n.d(str28)) {
                                o0Var2.C(-1982862466);
                                if ((i47 & 14) == 4) {
                                    z44 = true;
                                } else {
                                    z44 = false;
                                }
                                objQ4 = o0Var2.q();
                                if (z44) {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new fp0.c(str27, 17);
                                        o0Var2.K(objQ4);
                                    }
                                } else {
                                    objQ4 = new fp0.c(str27, 17);
                                    o0Var2.K(objQ4);
                                }
                                h4.r rVarC111117 = p5.v.c((e23.l) objQ4, aVar, false);
                                fVar.getClass();
                                mh.c(str28, rVarC111117, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0Var2), o0Var2, (i46 >> 9) & 14, 0, 110588);
                                o0Var2 = o0Var2;
                                z39 = false;
                                o0Var2.g0(false);
                            } else {
                                z39 = false;
                                o0Var2.C(-1982365071);
                                o0Var2.g0(false);
                            }
                            o0Var2.g0(z39);
                            str30 = str31;
                            str27 = str27;
                            o0Var = o0Var2;
                        } else {
                            str28 = str28;
                            str30 = str29;
                            o0VarK.C(-1982297398);
                            if ((234881024 & i46) == 67108864) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            objQ2 = o0VarK.q();
                            if (z29) {
                                aVar3.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new fp0.c(str25, 18);
                                    o0VarK.K(objQ2);
                                }
                            } else {
                                objQ2 = new fp0.c(str25, 18);
                                o0VarK.K(objQ2);
                            }
                            h4.r rVarC111118 = p5.v.c((e23.l) objQ2, aVar, false);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            str25 = str25;
                            mh.c(str2, rVarC111118, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(j92.f.f97933j, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                            o0Var = o0VarK;
                            o0Var.g0(false);
                        }
                    }
                    z45 = true;
                }
                o0Var.g0(z45);
                str13 = str30;
                str15 = str28;
                str14 = str49;
                z25 = z17;
                z26 = z18;
                z27 = z19;
                x0Var2 = x0Var11;
                str16 = str25;
                str17 = str26;
                str12 = str27;
            } else {
                o0Var = o0VarK;
                o0Var.e();
                str12 = str8;
                z25 = z17;
                z26 = z18;
                z27 = z19;
                str13 = str9;
                str14 = str11;
                str15 = str10;
                str16 = str6;
                str17 = str7;
                x0Var2 = x0Var;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d0(str, str2, str13, str15, z25, z26, z27, str14, str16, str17, str12, x0Var2, i14, i15, i16);
            }
        }
        i17 |= 3072;
        str10 = str4;
        i24 = i16 & 16;
        if (i24 != 0) {
            if ((i14 & 24576) == 0) {
                z17 = z14;
                if (o0VarK.h(z17)) {
                    i25 = 16384;
                } else {
                    i25 = 8192;
                }
                i17 |= i25;
            }
            i26 = i16 & 32;
            if (i26 != 0) {
                i17 |= 196608;
                z18 = z15;
            } else {
                z18 = z15;
                if ((i14 & 196608) == 0) {
                    if (o0VarK.h(z18)) {
                        i27 = 131072;
                    } else {
                        i27 = 65536;
                    }
                    i17 |= i27;
                }
            }
            i28 = i16 & 64;
            if (i28 != 0) {
                i17 |= 1572864;
                z19 = z16;
            } else {
                z19 = z16;
                if ((i14 & 1572864) == 0) {
                    if (o0VarK.h(z19)) {
                        i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i29 = 524288;
                    }
                    i17 |= i29;
                }
            }
            i30 = i16 & 128;
            if (i30 != 0) {
                i17 |= 12582912;
                str11 = str5;
            } else {
                str11 = str5;
                if ((i14 & 12582912) == 0) {
                    if (o0VarK.B(str11)) {
                        i34 = 8388608;
                    } else {
                        i34 = 4194304;
                    }
                    i17 |= i34;
                }
            }
            i35 = i16 & 256;
            if (i35 != 0) {
                i17 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarK.B(str6)) {
                    i36 = 67108864;
                } else {
                    i36 = 33554432;
                }
                i17 |= i36;
            }
            i37 = i16 & 512;
            if (i37 != 0) {
                i17 |= C.ENCODING_PCM_32BIT;
            } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarK.B(str7)) {
                    i38 = 536870912;
                } else {
                    i38 = 268435456;
                }
                i17 |= i38;
            }
            i39 = i16 & 1024;
            if (i39 != 0) {
                i44 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarK.B(str8)) {
                    i45 = 4;
                } else {
                    i45 = 2;
                }
                i44 = i15 | i45;
            } else {
                i44 = i15;
            }
            if ((i15 & 48) != 0) {
                i44 |= ((i16 & 2048) == 0 || !o0VarK.B(x0Var)) ? 16 : 32;
            }
            i46 = i17;
            if ((i17 & 306783379) == 306783378) {
                z24 = true;
            } else {
                z24 = true;
            }
            if (o0VarK.n(i46 & 1, z24)) {
                o0VarK.G0();
                if ((i14 & 1) != 0) {
                    if (i57 != 0) {
                        str9 = null;
                    }
                    if (i18 != 0) {
                        str10 = null;
                    }
                    if (i24 != 0) {
                        z17 = true;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i30 != 0) {
                        str11 = null;
                    }
                    if (i35 != 0) {
                        str18 = null;
                    } else {
                        str18 = str6;
                    }
                    if (i37 != 0) {
                        str19 = null;
                    } else {
                        str19 = str7;
                    }
                    if (i39 != 0) {
                        str20 = null;
                    } else {
                        str20 = str8;
                    }
                    if ((i16 & 2048) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i44 &= -113;
                        x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarK);
                    } else {
                        x0VarB = x0Var;
                    }
                    str21 = str9;
                    i47 = i44;
                    c14 = 16;
                    str22 = str18;
                    str23 = str11;
                } else {
                    if (i57 != 0) {
                        str9 = null;
                    }
                    if (i18 != 0) {
                        str10 = null;
                    }
                    if (i24 != 0) {
                        z17 = true;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    }
                    if (i28 != 0) {
                        z19 = false;
                    }
                    if (i30 != 0) {
                        str11 = null;
                    }
                    if (i35 != 0) {
                        str18 = null;
                    } else {
                        str18 = str6;
                    }
                    if (i37 != 0) {
                        str19 = null;
                    } else {
                        str19 = str7;
                    }
                    if (i39 != 0) {
                        str20 = null;
                    } else {
                        str20 = str8;
                    }
                    if ((i16 & 2048) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i44 &= -113;
                        x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarK);
                    } else {
                        x0VarB = x0Var;
                    }
                    str21 = str9;
                    i47 = i44;
                    c14 = 16;
                    str22 = str18;
                    str23 = str11;
                }
                str24 = str10;
                o0VarK.h0();
                p3.x1 x1Var7 = p3.n.f135158a;
                c2.j jVar7 = c2.j.f22691a;
                g6.f.a aVar11 = g6.f.f75994b;
                jVar7.getClass();
                c2.j.i iVarI7 = c2.j.i(4);
                aVar = h4.r.S;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(iVarI7, h4.d.a.f81536n, o0VarK, 6);
                iHashCode = Long.hashCode(o0VarK.U);
                i2VarA0 = o0VarK.a0();
                rVarC = h4.k.c(aVar, o0VarK);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarK.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarK.z();
                if (o0VarK.T) {
                    o0VarK.M(aVar2);
                } else {
                    o0VarK.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarK);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarK);
                bVar = h5.g.a.f81813j;
                if (o0VarK.T) {
                    v.h.A(iHashCode, o0VarK, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarK, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarK);
                c2.b0 b0Var7 = c2.b0.f22601a;
                if (z19) {
                    i48 = Integer.MAX_VALUE;
                } else {
                    i48 = 1;
                }
                d6.p.f57793b.getClass();
                if (z19) {
                    i49 = d6.p.f57796e;
                } else {
                    i49 = d6.p.f57795d;
                }
                i54 = i49;
                if ((i46 & 29360128) == 8388608) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                objQ = o0VarK.q();
                aVar3 = p3.m.f135153a;
                if (z28) {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new fp0.c(str23, 13);
                        o0VarK.K(objQ);
                    }
                } else {
                    objQ = new fp0.c(str23, 13);
                    o0VarK.K(objQ);
                }
                String str410 = str23;
                str25 = str22;
                str26 = str19;
                str27 = str20;
                mh.c(str, p5.v.c((e23.l) objQ, aVar, false), 0L, null, 0L, null, 0L, null, 0L, i54, false, i48, 0, null, x0VarB, o0VarK, i46 & 14, 29360128 & (i47 << 18), 110588);
                i55 = i48;
                s5.x0 x0Var12 = x0VarB;
                if (((g6.c) o0VarK.A(kotlin.t1.f91490h)).getF75992b() > 1.5d) {
                    o0VarK.C(-1985975889);
                    if ((i46 & 234881024) == 67108864) {
                        z46 = true;
                    } else {
                        z46 = false;
                    }
                    objQ5 = o0VarK.q();
                    if (z46) {
                        aVar3.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            str36 = str25;
                            objQ5 = new fp0.c(str36, 14);
                            o0VarK.K(objQ5);
                        } else {
                            str36 = str25;
                        }
                    } else {
                        str36 = str25;
                        objQ5 = new fp0.c(str36, 14);
                        o0VarK.K(objQ5);
                    }
                    h4.r rVarC111119 = p5.v.c((e23.l) objQ5, aVar, false);
                    d92.b.f58623a.getClass();
                    fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    x0Var4 = j92.f.f97933j;
                    str25 = str36;
                    mh.c(str2, rVarC111119, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                    if (g22.n.d(str21)) {
                        z47 = false;
                        o0VarK.C(-1985448424);
                        i56 = i46;
                        if ((i56 & 1879048192) == 536870912) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                        objQ6 = o0VarK.q();
                        if (z48) {
                            aVar3.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                str37 = str26;
                                objQ6 = new fp0.c(str37, 15);
                                o0VarK.K(objQ6);
                            } else {
                                str37 = str26;
                            }
                        } else {
                            str37 = str26;
                            objQ6 = new fp0.c(str37, 15);
                            o0VarK.K(objQ6);
                        }
                        aVar4 = aVar;
                        h4.r rVarC1111110 = p5.v.c((e23.l) objQ6, aVar4, false);
                        if (str21 == null) {
                            str38 = "";
                        } else {
                            str38 = str21;
                        }
                        fVar2.getClass();
                        str26 = str37;
                        x0Var5 = x0Var4;
                        mh.c(str38, rVarC1111110, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, 0, 0, 110588);
                        o0Var3 = o0VarK;
                        o0Var3.g0(false);
                    } else {
                        z47 = false;
                        o0VarK.C(-1985448424);
                        i56 = i46;
                        if ((i56 & 1879048192) == 536870912) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                        objQ6 = o0VarK.q();
                        if (z48) {
                            aVar3.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                str37 = str26;
                                objQ6 = new fp0.c(str37, 15);
                                o0VarK.K(objQ6);
                            } else {
                                str37 = str26;
                            }
                        } else {
                            str37 = str26;
                            objQ6 = new fp0.c(str37, 15);
                            o0VarK.K(objQ6);
                        }
                        aVar4 = aVar;
                        h4.r rVarC1111111 = p5.v.c((e23.l) objQ6, aVar4, false);
                        if (str21 == null) {
                            str38 = "";
                        } else {
                            str38 = str21;
                        }
                        fVar2.getClass();
                        str26 = str37;
                        x0Var5 = x0Var4;
                        mh.c(str38, rVarC1111111, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, 0, 0, 110588);
                        o0Var3 = o0VarK;
                        o0Var3.g0(false);
                    }
                    if (g22.n.d(str24)) {
                        o0Var3.C(-1984855394);
                        if ((i47 & 14) == 4) {
                            z49 = true;
                        } else {
                            z49 = z47;
                        }
                        objQ7 = o0Var3.q();
                        if (z49) {
                            aVar3.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                str40 = str27;
                                objQ7 = new fp0.c(str40, 16);
                                o0Var3.K(objQ7);
                            } else {
                                str40 = str27;
                            }
                        } else {
                            str40 = str27;
                            objQ7 = new fp0.c(str40, 16);
                            o0Var3.K(objQ7);
                        }
                        h4.r rVarC1111112 = p5.v.c((e23.l) objQ7, aVar4, z47);
                        fVar2.getClass();
                        p3.o0 o0Var10 = o0Var3;
                        str27 = str40;
                        mh.c(str24, rVarC1111112, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var5, o0Var3), o0Var10, (i56 >> 9) & 14, 0, 110588);
                        str39 = str24;
                        o0Var = o0Var10;
                        o0Var.g0(z47);
                    } else {
                        o0Var = o0Var3;
                        str39 = str24;
                        o0Var.C(-1984357999);
                        o0Var.g0(z47);
                    }
                    o0Var.g0(z47);
                    str30 = str21;
                    z45 = true;
                    str28 = str39;
                } else {
                    if (g22.n.d(str21)) {
                        str28 = str24;
                        str29 = str21;
                        if (g22.n.d(str29)) {
                            o0VarK.C(-1983478436);
                            if ((234881024 & i46) == 67108864) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            if ((i46 & 112) == 32) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            boolean z5117 = z34 | z35;
                            if ((i46 & 1879048192) == 536870912) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            boolean z5118 = z5117 | z36;
                            if ((i46 & 896) == 256) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            z38 = z5118 | z37;
                            objQ3 = o0VarK.q();
                            if (z38) {
                                aVar3.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new c0(0, str25, str2, str26, str29);
                                    str31 = str29;
                                    str32 = str2;
                                    o0VarK.K(objQ3);
                                } else {
                                    str31 = str29;
                                    str32 = str2;
                                }
                            } else {
                                objQ3 = new c0(0, str25, str2, str26, str29);
                                str31 = str29;
                                str32 = str2;
                                o0VarK.K(objQ3);
                            }
                            h4.r rVarC1111113 = p5.v.c((e23.l) objQ3, aVar, false);
                            String strG12 = e5.g(str32, " • ", str31);
                            d92.b.f58623a.getClass();
                            fVar = d92.b.f58624b;
                            fVar.getClass();
                            x0Var3 = j92.f.f97933j;
                            mh.c(strG12, rVarC1111113, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0VarK), o0VarK, 0, 0, 110588);
                            o0Var2 = o0VarK;
                            if (g22.n.d(str28)) {
                                o0Var2.C(-1982862466);
                                if ((i47 & 14) == 4) {
                                    z44 = true;
                                } else {
                                    z44 = false;
                                }
                                objQ4 = o0Var2.q();
                                if (z44) {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new fp0.c(str27, 17);
                                        o0Var2.K(objQ4);
                                    }
                                } else {
                                    objQ4 = new fp0.c(str27, 17);
                                    o0Var2.K(objQ4);
                                }
                                h4.r rVarC1111114 = p5.v.c((e23.l) objQ4, aVar, false);
                                fVar.getClass();
                                mh.c(str28, rVarC1111114, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0Var2), o0Var2, (i46 >> 9) & 14, 0, 110588);
                                o0Var2 = o0Var2;
                                z39 = false;
                                o0Var2.g0(false);
                            } else {
                                z39 = false;
                                o0Var2.C(-1982365071);
                                o0Var2.g0(false);
                            }
                            o0Var2.g0(z39);
                            str30 = str31;
                            str27 = str27;
                            o0Var = o0Var2;
                        } else {
                            str28 = str28;
                            str30 = str29;
                            o0VarK.C(-1982297398);
                            if ((234881024 & i46) == 67108864) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            objQ2 = o0VarK.q();
                            if (z29) {
                                aVar3.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new fp0.c(str25, 18);
                                    o0VarK.K(objQ2);
                                }
                            } else {
                                objQ2 = new fp0.c(str25, 18);
                                o0VarK.K(objQ2);
                            }
                            h4.r rVarC1111115 = p5.v.c((e23.l) objQ2, aVar, false);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            str25 = str25;
                            mh.c(str2, rVarC1111115, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(j92.f.f97933j, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                            o0Var = o0VarK;
                            o0Var.g0(false);
                        }
                    } else {
                        str28 = str24;
                        str29 = str21;
                        if (g22.n.d(str29)) {
                            o0VarK.C(-1983478436);
                            if ((234881024 & i46) == 67108864) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            if ((i46 & 112) == 32) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            boolean z5119 = z34 | z35;
                            if ((i46 & 1879048192) == 536870912) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            boolean z51110 = z5119 | z36;
                            if ((i46 & 896) == 256) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            z38 = z51110 | z37;
                            objQ3 = o0VarK.q();
                            if (z38) {
                                aVar3.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new c0(0, str25, str2, str26, str29);
                                    str31 = str29;
                                    str32 = str2;
                                    o0VarK.K(objQ3);
                                } else {
                                    str31 = str29;
                                    str32 = str2;
                                }
                            } else {
                                objQ3 = new c0(0, str25, str2, str26, str29);
                                str31 = str29;
                                str32 = str2;
                                o0VarK.K(objQ3);
                            }
                            h4.r rVarC1111116 = p5.v.c((e23.l) objQ3, aVar, false);
                            String strG13 = e5.g(str32, " • ", str31);
                            d92.b.f58623a.getClass();
                            fVar = d92.b.f58624b;
                            fVar.getClass();
                            x0Var3 = j92.f.f97933j;
                            mh.c(strG13, rVarC1111116, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0VarK), o0VarK, 0, 0, 110588);
                            o0Var2 = o0VarK;
                            if (g22.n.d(str28)) {
                                o0Var2.C(-1982862466);
                                if ((i47 & 14) == 4) {
                                    z44 = true;
                                } else {
                                    z44 = false;
                                }
                                objQ4 = o0Var2.q();
                                if (z44) {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new fp0.c(str27, 17);
                                        o0Var2.K(objQ4);
                                    }
                                } else {
                                    objQ4 = new fp0.c(str27, 17);
                                    o0Var2.K(objQ4);
                                }
                                h4.r rVarC1111117 = p5.v.c((e23.l) objQ4, aVar, false);
                                fVar.getClass();
                                mh.c(str28, rVarC1111117, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0Var2), o0Var2, (i46 >> 9) & 14, 0, 110588);
                                o0Var2 = o0Var2;
                                z39 = false;
                                o0Var2.g0(false);
                            } else {
                                z39 = false;
                                o0Var2.C(-1982365071);
                                o0Var2.g0(false);
                            }
                            o0Var2.g0(z39);
                            str30 = str31;
                            str27 = str27;
                            o0Var = o0Var2;
                        } else {
                            str28 = str28;
                            str30 = str29;
                            o0VarK.C(-1982297398);
                            if ((234881024 & i46) == 67108864) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            objQ2 = o0VarK.q();
                            if (z29) {
                                aVar3.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new fp0.c(str25, 18);
                                    o0VarK.K(objQ2);
                                }
                            } else {
                                objQ2 = new fp0.c(str25, 18);
                                o0VarK.K(objQ2);
                            }
                            h4.r rVarC1111118 = p5.v.c((e23.l) objQ2, aVar, false);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            str25 = str25;
                            mh.c(str2, rVarC1111118, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(j92.f.f97933j, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                            o0Var = o0VarK;
                            o0Var.g0(false);
                        }
                    }
                    z45 = true;
                }
                o0Var.g0(z45);
                str13 = str30;
                str15 = str28;
                str14 = str410;
                z25 = z17;
                z26 = z18;
                z27 = z19;
                x0Var2 = x0Var12;
                str16 = str25;
                str17 = str26;
                str12 = str27;
            } else {
                o0Var = o0VarK;
                o0Var.e();
                str12 = str8;
                z25 = z17;
                z26 = z18;
                z27 = z19;
                str13 = str9;
                str14 = str11;
                str15 = str10;
                str16 = str6;
                str17 = str7;
                x0Var2 = x0Var;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d0(str, str2, str13, str15, z25, z26, z27, str14, str16, str17, str12, x0Var2, i14, i15, i16);
            }
        }
        i17 |= 24576;
        z17 = z14;
        i26 = i16 & 32;
        if (i26 != 0) {
            i17 |= 196608;
            z18 = z15;
        } else {
            z18 = z15;
            if ((i14 & 196608) == 0) {
                if (o0VarK.h(z18)) {
                    i27 = 131072;
                } else {
                    i27 = 65536;
                }
                i17 |= i27;
            }
        }
        i28 = i16 & 64;
        if (i28 != 0) {
            i17 |= 1572864;
            z19 = z16;
        } else {
            z19 = z16;
            if ((i14 & 1572864) == 0) {
                if (o0VarK.h(z19)) {
                    i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i29 = 524288;
                }
                i17 |= i29;
            }
        }
        i30 = i16 & 128;
        if (i30 != 0) {
            i17 |= 12582912;
            str11 = str5;
        } else {
            str11 = str5;
            if ((i14 & 12582912) == 0) {
                if (o0VarK.B(str11)) {
                    i34 = 8388608;
                } else {
                    i34 = 4194304;
                }
                i17 |= i34;
            }
        }
        i35 = i16 & 256;
        if (i35 != 0) {
            i17 |= 100663296;
        } else if ((i14 & 100663296) == 0) {
            if (o0VarK.B(str6)) {
                i36 = 67108864;
            } else {
                i36 = 33554432;
            }
            i17 |= i36;
        }
        i37 = i16 & 512;
        if (i37 != 0) {
            i17 |= C.ENCODING_PCM_32BIT;
        } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarK.B(str7)) {
                i38 = 536870912;
            } else {
                i38 = 268435456;
            }
            i17 |= i38;
        }
        i39 = i16 & 1024;
        if (i39 != 0) {
            i44 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            if (o0VarK.B(str8)) {
                i45 = 4;
            } else {
                i45 = 2;
            }
            i44 = i15 | i45;
        } else {
            i44 = i15;
        }
        if ((i15 & 48) != 0) {
            i44 |= ((i16 & 2048) == 0 || !o0VarK.B(x0Var)) ? 16 : 32;
        }
        i46 = i17;
        if ((i17 & 306783379) == 306783378) {
            z24 = true;
        } else {
            z24 = true;
        }
        if (o0VarK.n(i46 & 1, z24)) {
            o0VarK.G0();
            if ((i14 & 1) != 0) {
                if (i57 != 0) {
                    str9 = null;
                }
                if (i18 != 0) {
                    str10 = null;
                }
                if (i24 != 0) {
                    z17 = true;
                }
                if (i26 != 0) {
                    z18 = true;
                }
                if (i28 != 0) {
                    z19 = false;
                }
                if (i30 != 0) {
                    str11 = null;
                }
                if (i35 != 0) {
                    str18 = null;
                } else {
                    str18 = str6;
                }
                if (i37 != 0) {
                    str19 = null;
                } else {
                    str19 = str7;
                }
                if (i39 != 0) {
                    str20 = null;
                } else {
                    str20 = str8;
                }
                if ((i16 & 2048) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    i44 &= -113;
                    x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarK);
                } else {
                    x0VarB = x0Var;
                }
                str21 = str9;
                i47 = i44;
                c14 = 16;
                str22 = str18;
                str23 = str11;
            } else {
                if (i57 != 0) {
                    str9 = null;
                }
                if (i18 != 0) {
                    str10 = null;
                }
                if (i24 != 0) {
                    z17 = true;
                }
                if (i26 != 0) {
                    z18 = true;
                }
                if (i28 != 0) {
                    z19 = false;
                }
                if (i30 != 0) {
                    str11 = null;
                }
                if (i35 != 0) {
                    str18 = null;
                } else {
                    str18 = str6;
                }
                if (i37 != 0) {
                    str19 = null;
                } else {
                    str19 = str7;
                }
                if (i39 != 0) {
                    str20 = null;
                } else {
                    str20 = str8;
                }
                if ((i16 & 2048) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    i44 &= -113;
                    x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarK);
                } else {
                    x0VarB = x0Var;
                }
                str21 = str9;
                i47 = i44;
                c14 = 16;
                str22 = str18;
                str23 = str11;
            }
            str24 = str10;
            o0VarK.h0();
            p3.x1 x1Var8 = p3.n.f135158a;
            c2.j jVar8 = c2.j.f22691a;
            g6.f.a aVar12 = g6.f.f75994b;
            jVar8.getClass();
            c2.j.i iVarI8 = c2.j.i(4);
            aVar = h4.r.S;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(iVarI8, h4.d.a.f81536n, o0VarK, 6);
            iHashCode = Long.hashCode(o0VarK.U);
            i2VarA0 = o0VarK.a0();
            rVarC = h4.k.c(aVar, o0VarK);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (o0VarK.f135177b != null) {
                p3.p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar2);
            } else {
                o0VarK.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarK);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarK);
            bVar = h5.g.a.f81813j;
            if (o0VarK.T) {
                v.h.A(iHashCode, o0VarK, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarK, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarK);
            c2.b0 b0Var8 = c2.b0.f22601a;
            if (z19) {
                i48 = Integer.MAX_VALUE;
            } else {
                i48 = 1;
            }
            d6.p.f57793b.getClass();
            if (z19) {
                i49 = d6.p.f57796e;
            } else {
                i49 = d6.p.f57795d;
            }
            i54 = i49;
            if ((i46 & 29360128) == 8388608) {
                z28 = true;
            } else {
                z28 = false;
            }
            objQ = o0VarK.q();
            aVar3 = p3.m.f135153a;
            if (z28) {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new fp0.c(str23, 13);
                    o0VarK.K(objQ);
                }
            } else {
                objQ = new fp0.c(str23, 13);
                o0VarK.K(objQ);
            }
            String str411 = str23;
            str25 = str22;
            str26 = str19;
            str27 = str20;
            mh.c(str, p5.v.c((e23.l) objQ, aVar, false), 0L, null, 0L, null, 0L, null, 0L, i54, false, i48, 0, null, x0VarB, o0VarK, i46 & 14, 29360128 & (i47 << 18), 110588);
            i55 = i48;
            s5.x0 x0Var13 = x0VarB;
            if (((g6.c) o0VarK.A(kotlin.t1.f91490h)).getF75992b() > 1.5d) {
                o0VarK.C(-1985975889);
                if ((i46 & 234881024) == 67108864) {
                    z46 = true;
                } else {
                    z46 = false;
                }
                objQ5 = o0VarK.q();
                if (z46) {
                    aVar3.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        str36 = str25;
                        objQ5 = new fp0.c(str36, 14);
                        o0VarK.K(objQ5);
                    } else {
                        str36 = str25;
                    }
                } else {
                    str36 = str25;
                    objQ5 = new fp0.c(str36, 14);
                    o0VarK.K(objQ5);
                }
                h4.r rVarC1111119 = p5.v.c((e23.l) objQ5, aVar, false);
                d92.b.f58623a.getClass();
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0Var4 = j92.f.f97933j;
                str25 = str36;
                mh.c(str2, rVarC1111119, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                if (g22.n.d(str21)) {
                    z47 = false;
                    o0VarK.C(-1985448424);
                    i56 = i46;
                    if ((i56 & 1879048192) == 536870912) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                    objQ6 = o0VarK.q();
                    if (z48) {
                        aVar3.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            str37 = str26;
                            objQ6 = new fp0.c(str37, 15);
                            o0VarK.K(objQ6);
                        } else {
                            str37 = str26;
                        }
                    } else {
                        str37 = str26;
                        objQ6 = new fp0.c(str37, 15);
                        o0VarK.K(objQ6);
                    }
                    aVar4 = aVar;
                    h4.r rVarC11111110 = p5.v.c((e23.l) objQ6, aVar4, false);
                    if (str21 == null) {
                        str38 = "";
                    } else {
                        str38 = str21;
                    }
                    fVar2.getClass();
                    str26 = str37;
                    x0Var5 = x0Var4;
                    mh.c(str38, rVarC11111110, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, 0, 0, 110588);
                    o0Var3 = o0VarK;
                    o0Var3.g0(false);
                } else {
                    z47 = false;
                    o0VarK.C(-1985448424);
                    i56 = i46;
                    if ((i56 & 1879048192) == 536870912) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                    objQ6 = o0VarK.q();
                    if (z48) {
                        aVar3.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            str37 = str26;
                            objQ6 = new fp0.c(str37, 15);
                            o0VarK.K(objQ6);
                        } else {
                            str37 = str26;
                        }
                    } else {
                        str37 = str26;
                        objQ6 = new fp0.c(str37, 15);
                        o0VarK.K(objQ6);
                    }
                    aVar4 = aVar;
                    h4.r rVarC11111111 = p5.v.c((e23.l) objQ6, aVar4, false);
                    if (str21 == null) {
                        str38 = "";
                    } else {
                        str38 = str21;
                    }
                    fVar2.getClass();
                    str26 = str37;
                    x0Var5 = x0Var4;
                    mh.c(str38, rVarC11111111, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var4, o0VarK), o0VarK, 0, 0, 110588);
                    o0Var3 = o0VarK;
                    o0Var3.g0(false);
                }
                if (g22.n.d(str24)) {
                    o0Var3.C(-1984855394);
                    if ((i47 & 14) == 4) {
                        z49 = true;
                    } else {
                        z49 = z47;
                    }
                    objQ7 = o0Var3.q();
                    if (z49) {
                        aVar3.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            str40 = str27;
                            objQ7 = new fp0.c(str40, 16);
                            o0Var3.K(objQ7);
                        } else {
                            str40 = str27;
                        }
                    } else {
                        str40 = str27;
                        objQ7 = new fp0.c(str40, 16);
                        o0Var3.K(objQ7);
                    }
                    h4.r rVarC11111112 = p5.v.c((e23.l) objQ7, aVar4, z47);
                    fVar2.getClass();
                    p3.o0 o0Var11 = o0Var3;
                    str27 = str40;
                    mh.c(str24, rVarC11111112, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var5, o0Var3), o0Var11, (i56 >> 9) & 14, 0, 110588);
                    str39 = str24;
                    o0Var = o0Var11;
                    o0Var.g0(z47);
                } else {
                    o0Var = o0Var3;
                    str39 = str24;
                    o0Var.C(-1984357999);
                    o0Var.g0(z47);
                }
                o0Var.g0(z47);
                str30 = str21;
                z45 = true;
                str28 = str39;
            } else {
                if (g22.n.d(str21)) {
                    str28 = str24;
                    str29 = str21;
                    if (g22.n.d(str29)) {
                        o0VarK.C(-1983478436);
                        if ((234881024 & i46) == 67108864) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        if ((i46 & 112) == 32) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        boolean z51111 = z34 | z35;
                        if ((i46 & 1879048192) == 536870912) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        boolean z51112 = z51111 | z36;
                        if ((i46 & 896) == 256) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        z38 = z51112 | z37;
                        objQ3 = o0VarK.q();
                        if (z38) {
                            aVar3.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new c0(0, str25, str2, str26, str29);
                                str31 = str29;
                                str32 = str2;
                                o0VarK.K(objQ3);
                            } else {
                                str31 = str29;
                                str32 = str2;
                            }
                        } else {
                            objQ3 = new c0(0, str25, str2, str26, str29);
                            str31 = str29;
                            str32 = str2;
                            o0VarK.K(objQ3);
                        }
                        h4.r rVarC11111113 = p5.v.c((e23.l) objQ3, aVar, false);
                        String strG14 = e5.g(str32, " • ", str31);
                        d92.b.f58623a.getClass();
                        fVar = d92.b.f58624b;
                        fVar.getClass();
                        x0Var3 = j92.f.f97933j;
                        mh.c(strG14, rVarC11111113, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0VarK), o0VarK, 0, 0, 110588);
                        o0Var2 = o0VarK;
                        if (g22.n.d(str28)) {
                            o0Var2.C(-1982862466);
                            if ((i47 & 14) == 4) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            objQ4 = o0Var2.q();
                            if (z44) {
                                aVar3.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new fp0.c(str27, 17);
                                    o0Var2.K(objQ4);
                                }
                            } else {
                                objQ4 = new fp0.c(str27, 17);
                                o0Var2.K(objQ4);
                            }
                            h4.r rVarC11111114 = p5.v.c((e23.l) objQ4, aVar, false);
                            fVar.getClass();
                            mh.c(str28, rVarC11111114, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0Var2), o0Var2, (i46 >> 9) & 14, 0, 110588);
                            o0Var2 = o0Var2;
                            z39 = false;
                            o0Var2.g0(false);
                        } else {
                            z39 = false;
                            o0Var2.C(-1982365071);
                            o0Var2.g0(false);
                        }
                        o0Var2.g0(z39);
                        str30 = str31;
                        str27 = str27;
                        o0Var = o0Var2;
                    } else {
                        str28 = str28;
                        str30 = str29;
                        o0VarK.C(-1982297398);
                        if ((234881024 & i46) == 67108864) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        objQ2 = o0VarK.q();
                        if (z29) {
                            aVar3.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new fp0.c(str25, 18);
                                o0VarK.K(objQ2);
                            }
                        } else {
                            objQ2 = new fp0.c(str25, 18);
                            o0VarK.K(objQ2);
                        }
                        h4.r rVarC11111115 = p5.v.c((e23.l) objQ2, aVar, false);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        str25 = str25;
                        mh.c(str2, rVarC11111115, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(j92.f.f97933j, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                        o0Var = o0VarK;
                        o0Var.g0(false);
                    }
                } else {
                    str28 = str24;
                    str29 = str21;
                    if (g22.n.d(str29)) {
                        o0VarK.C(-1983478436);
                        if ((234881024 & i46) == 67108864) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        if ((i46 & 112) == 32) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        boolean z51113 = z34 | z35;
                        if ((i46 & 1879048192) == 536870912) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        boolean z51114 = z51113 | z36;
                        if ((i46 & 896) == 256) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        z38 = z51114 | z37;
                        objQ3 = o0VarK.q();
                        if (z38) {
                            aVar3.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new c0(0, str25, str2, str26, str29);
                                str31 = str29;
                                str32 = str2;
                                o0VarK.K(objQ3);
                            } else {
                                str31 = str29;
                                str32 = str2;
                            }
                        } else {
                            objQ3 = new c0(0, str25, str2, str26, str29);
                            str31 = str29;
                            str32 = str2;
                            o0VarK.K(objQ3);
                        }
                        h4.r rVarC11111116 = p5.v.c((e23.l) objQ3, aVar, false);
                        String strG15 = e5.g(str32, " • ", str31);
                        d92.b.f58623a.getClass();
                        fVar = d92.b.f58624b;
                        fVar.getClass();
                        x0Var3 = j92.f.f97933j;
                        mh.c(strG15, rVarC11111116, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0VarK), o0VarK, 0, 0, 110588);
                        o0Var2 = o0VarK;
                        if (g22.n.d(str28)) {
                            o0Var2.C(-1982862466);
                            if ((i47 & 14) == 4) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            objQ4 = o0Var2.q();
                            if (z44) {
                                aVar3.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new fp0.c(str27, 17);
                                    o0Var2.K(objQ4);
                                }
                            } else {
                                objQ4 = new fp0.c(str27, 17);
                                o0Var2.K(objQ4);
                            }
                            h4.r rVarC11111117 = p5.v.c((e23.l) objQ4, aVar, false);
                            fVar.getClass();
                            mh.c(str28, rVarC11111117, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(x0Var3, o0Var2), o0Var2, (i46 >> 9) & 14, 0, 110588);
                            o0Var2 = o0Var2;
                            z39 = false;
                            o0Var2.g0(false);
                        } else {
                            z39 = false;
                            o0Var2.C(-1982365071);
                            o0Var2.g0(false);
                        }
                        o0Var2.g0(z39);
                        str30 = str31;
                        str27 = str27;
                        o0Var = o0Var2;
                    } else {
                        str28 = str28;
                        str30 = str29;
                        o0VarK.C(-1982297398);
                        if ((234881024 & i46) == 67108864) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        objQ2 = o0VarK.q();
                        if (z29) {
                            aVar3.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new fp0.c(str25, 18);
                                o0VarK.K(objQ2);
                            }
                        } else {
                            objQ2 = new fp0.c(str25, 18);
                            o0VarK.K(objQ2);
                        }
                        h4.r rVarC11111118 = p5.v.c((e23.l) objQ2, aVar, false);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        str25 = str25;
                        mh.c(str2, rVarC11111118, 0L, null, 0L, null, 0L, null, 0L, i54, false, i55, 0, null, d92.c.f(j92.f.f97933j, o0VarK), o0VarK, (i46 >> 3) & 14, 0, 110588);
                        o0Var = o0VarK;
                        o0Var.g0(false);
                    }
                }
                z45 = true;
            }
            o0Var.g0(z45);
            str13 = str30;
            str15 = str28;
            str14 = str411;
            z25 = z17;
            z26 = z18;
            z27 = z19;
            x0Var2 = x0Var13;
            str16 = str25;
            str17 = str26;
            str12 = str27;
        } else {
            o0Var = o0VarK;
            o0Var.e();
            str12 = str8;
            z25 = z17;
            z26 = z18;
            z27 = z19;
            str13 = str9;
            str14 = str11;
            str15 = str10;
            str16 = str6;
            str17 = str7;
            x0Var2 = x0Var;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d0(str, str2, str13, str15, z25, z26, z27, str14, str16, str17, str12, x0Var2, i14, i15, i16);
        }
    }
}
