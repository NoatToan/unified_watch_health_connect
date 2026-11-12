package l72;

import android.annotation.SuppressLint;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.ba;
import i3.eh;
import i3.sg;
import i3.ve;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class p1 {
    /* JADX WARN: Code duplicated, block: B:100:0x0127  */
    /* JADX WARN: Code duplicated, block: B:103:0x0137  */
    /* JADX WARN: Code duplicated, block: B:104:0x013a  */
    /* JADX WARN: Code duplicated, block: B:106:0x013e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0145  */
    /* JADX WARN: Code duplicated, block: B:111:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0150  */
    /* JADX WARN: Code duplicated, block: B:116:0x0156  */
    /* JADX WARN: Code duplicated, block: B:120:0x0168  */
    /* JADX WARN: Code duplicated, block: B:124:0x0172  */
    /* JADX WARN: Code duplicated, block: B:127:0x017c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0188  */
    /* JADX WARN: Code duplicated, block: B:133:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:141:0x01be  */
    /* JADX WARN: Code duplicated, block: B:144:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:146:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:149:0x0203  */
    /* JADX WARN: Code duplicated, block: B:150:0x020b  */
    /* JADX WARN: Code duplicated, block: B:153:0x021a  */
    /* JADX WARN: Code duplicated, block: B:157:0x024d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x024f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0251  */
    /* JADX WARN: Code duplicated, block: B:162:0x0259  */
    /* JADX WARN: Code duplicated, block: B:163:0x025b  */
    /* JADX WARN: Code duplicated, block: B:167:0x027e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0281  */
    /* JADX WARN: Code duplicated, block: B:171:0x028e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x0290  */
    /* JADX WARN: Code duplicated, block: B:175:0x0295  */
    /* JADX WARN: Code duplicated, block: B:179:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:182:0x02ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:183:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:185:0x030b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0327  */
    /* JADX WARN: Code duplicated, block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:91:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x011f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0122  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, @SuppressLint({"ModifierParameter"}) h4.r rVar, final String str2, Integer num, boolean z14, boolean z15, p006l2.a2 a2Var, long j8, sg sgVar, e23.p pVar, e23.p pVar2, x5.r0 r0Var, a2.j jVar, final e23.l lVar, p3.m mVar, final int i14, final int i15, final int i16) {
        int i17;
        h4.r rVar2;
        String str3;
        int i18;
        Integer num2;
        int i19;
        int i24;
        boolean z16;
        int i25;
        int i26;
        int i27;
        p006l2.a2 a2Var2;
        int i28;
        int i29;
        e23.p pVar3;
        int i30;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        boolean z17;
        p3.o0 o0Var;
        final boolean z18;
        final e23.p pVar4;
        final x5.r0 r0Var2;
        final a2.j jVar2;
        final Integer num3;
        final h4.r rVar3;
        final p006l2.a2 a2Var3;
        final e23.p pVar5;
        final boolean z19;
        final long j14;
        final sg sgVar2;
        p3.p2 p2VarI0;
        int i46;
        p3.m.a aVar;
        h4.r rVar4;
        e23.p pVar6;
        x5.r0 r0Var3;
        Object objQ;
        h4.r rVar5;
        a2.j jVar3;
        e23.p pVar7;
        sg sgVar3;
        int i47;
        x5.r0 r0Var4;
        boolean z24;
        long j15;
        Integer num4;
        e23.p pVar8;
        boolean z25;
        int i48;
        p006l2.a2 a2Var4;
        int i49;
        Object objQ2;
        p3.m.a.C2565a c2565a;
        p3.p1 p1Var;
        boolean z26;
        boolean zL;
        Object objQ3;
        boolean z27;
        Object objQ4;
        String str4;
        String str5;
        int i54;
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-206891401);
        if ((i14 & 6) == 0) {
            i17 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        int i55 = i16 & 2;
        if (i55 == 0) {
            if ((i14 & 48) == 0) {
                rVar2 = rVar;
                i17 |= o0VarE.B(rVar2) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                str3 = str2;
                if (o0VarE.B(str3)) {
                    i54 = 256;
                } else {
                    i54 = 128;
                }
                i17 |= i54;
            } else {
                str3 = str2;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                if ((i14 & 3072) == 0) {
                    num2 = num;
                    if (o0VarE.B(num2)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
                i24 = i16 & 16;
                if (i24 != 0) {
                    if ((i14 & 24576) == 0) {
                        z16 = z14;
                        if (o0VarE.h(z16)) {
                            i25 = 16384;
                        } else {
                            i25 = 8192;
                        }
                        i17 |= i25;
                    }
                    i26 = i17 | 196608;
                    i27 = i16 & 64;
                    if (i27 != 0) {
                        if ((1572864 & i14) == 0) {
                            a2Var2 = a2Var;
                            if (o0VarE.B(a2Var2)) {
                                i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            } else {
                                i28 = 524288;
                            }
                            i26 |= i28;
                        }
                        if ((i14 & 12582912) == 0) {
                            i26 |= 4194304;
                        }
                        if ((i14 & 100663296) == 0) {
                            i26 |= 33554432;
                        }
                        i29 = i16 & 512;
                        if (i29 != 0) {
                            i26 |= C.ENCODING_PCM_32BIT;
                            pVar3 = pVar;
                        } else {
                            pVar3 = pVar;
                            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                                if (o0VarE.r(pVar3)) {
                                    i30 = 536870912;
                                } else {
                                    i30 = 268435456;
                                }
                                i26 |= i30;
                            }
                        }
                        i34 = i16 & 1024;
                        if (i34 != 0) {
                            i35 = i15 | 6;
                        } else if ((i15 & 6) == 0) {
                            if (o0VarE.r(pVar2)) {
                                i36 = 4;
                            } else {
                                i36 = 2;
                            }
                            i35 = i15 | i36;
                        } else {
                            i35 = i15;
                        }
                        i37 = i16 & 2048;
                        if (i37 != 0) {
                            i35 |= 48;
                        } else if ((i15 & 48) != 0) {
                            if (o0VarE.B(r0Var)) {
                                i38 = 32;
                            } else {
                                i38 = 16;
                            }
                            i35 |= i38;
                        }
                        i39 = i35;
                        i44 = i39 | 384;
                        if ((i16 & 8192) != 0) {
                            i45 = i39 | 3456;
                        } else if ((i15 & 3072) == 0) {
                            i45 = i44 | (o0VarE.r(null) ? 2048 : 1024);
                        } else {
                            i45 = i44;
                        }
                        if ((i15 & 24576) == 0) {
                            i45 |= o0VarE.r(lVar) ? 16384 : 8192;
                        }
                        if ((i26 & 306783379) == 306783378 || (i45 & 9363) != 9362) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (o0VarE.n(i26 & 1, z17)) {
                            o0VarE.G0();
                            i46 = i14 & 1;
                            aVar = p3.m.f135153a;
                            if (i46 != 0 || o0VarE.o0()) {
                                if (i55 != 0) {
                                    rVar4 = h4.r.S;
                                } else {
                                    rVar4 = rVar2;
                                }
                                if (i18 != 0) {
                                    num2 = null;
                                }
                                if (i24 != 0) {
                                    z16 = true;
                                }
                                if (i27 != 0) {
                                    x5.v.f188954b.getClass();
                                    int i56 = x5.v.f188955c;
                                    x5.p.f188918b.getClass();
                                    a2Var2 = new p006l2.a2(0, (Boolean) null, i56, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                                }
                                d92.b.f58623a.getClass();
                                long jD = d92.b.a(o0VarE).k().d();
                                sg sgVarD = d(o0VarE);
                                int i57 = i26 & (-264241153);
                                if (i29 != 0) {
                                    pVar3 = null;
                                }
                                if (i34 != 0) {
                                    pVar6 = null;
                                } else {
                                    pVar6 = pVar2;
                                }
                                if (i37 != 0) {
                                    x5.r0.f188941a.getClass();
                                    r0Var3 = x5.r0.a.f188943b;
                                } else {
                                    r0Var3 = r0Var;
                                }
                                objQ = o0VarE.q();
                                aVar.getClass();
                                h4.r rVar6 = rVar4;
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                rVar5 = rVar6;
                                jVar3 = (a2.j) objQ;
                                pVar7 = pVar6;
                                sgVar3 = sgVarD;
                                i47 = i57;
                                r0Var4 = r0Var3;
                                z24 = true;
                                j15 = jD;
                                num4 = num2;
                                pVar8 = pVar3;
                                z25 = z16;
                                i48 = 4;
                                a2Var4 = a2Var2;
                                i49 = 16384;
                            } else {
                                o0VarE.e();
                                i47 = i26 & (-264241153);
                                z24 = z15;
                                j15 = j8;
                                sgVar3 = sgVar;
                                pVar7 = pVar2;
                                r0Var4 = r0Var;
                                jVar3 = jVar;
                                rVar5 = rVar2;
                                a2Var4 = a2Var2;
                                num4 = num2;
                                pVar8 = pVar3;
                                z25 = z16;
                                i49 = 16384;
                                i48 = 4;
                            }
                            o0VarE.h0();
                            p3.x1 x1Var = p3.n.f135158a;
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            c2565a = p3.m.a.f135155b;
                            if (objQ2 == c2565a) {
                                if (str == null) {
                                    str4 = "";
                                } else {
                                    str4 = str;
                                }
                                int length = str4.length();
                                if (str == null) {
                                    str5 = "";
                                } else {
                                    str5 = str;
                                }
                                objQ2 = p3.p0.n(s5.w0.a(og.a.l(length, str5.length())));
                                o0VarE.K(objQ2);
                            }
                            p1Var = (p3.p1) objQ2;
                            long j16 = ((s5.w0) p1Var.getF182175a()).f157317a;
                            if ((i47 & 14) == i48) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            zL = z26 | o0VarE.l(j16);
                            objQ3 = o0VarE.q();
                            if (zL || objQ3 == c2565a) {
                                objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                                o0VarE.K(objQ3);
                            }
                            x5.l0 l0Var = (x5.l0) ((p3.p1) objQ3).getF182175a();
                            z27 = (57344 & i45) == i49;
                            objQ4 = o0VarE.q();
                            if (z27 || objQ4 == c2565a) {
                                objQ4 = new a11.b0(lVar, p1Var, 20);
                                o0VarE.K(objQ4);
                            }
                            o0Var = o0VarE;
                            b(l0Var, rVar5, str3, num4, z25, z24, a2Var4, j15, sgVar3, pVar8, pVar7, r0Var4, jVar3, null, (e23.l) objQ4, o0Var, i47 & 2147483632, i45 & 8190, 0);
                            rVar3 = rVar5;
                            num3 = num4;
                            z19 = z25;
                            z18 = z24;
                            a2Var3 = a2Var4;
                            j14 = j15;
                            sgVar2 = sgVar3;
                            pVar5 = pVar8;
                            pVar4 = pVar7;
                            r0Var2 = r0Var4;
                            jVar2 = jVar3;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            z18 = z15;
                            pVar4 = pVar2;
                            r0Var2 = r0Var;
                            jVar2 = jVar;
                            num3 = num2;
                            rVar3 = rVar2;
                            a2Var3 = a2Var2;
                            pVar5 = pVar3;
                            z19 = z16;
                            j14 = j8;
                            sgVar2 = sgVar;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new e23.p() { // from class: l72.j1
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iT = p3.p0.t(i14 | 1);
                                    int iT2 = p3.p0.t(i15);
                                    p1.a(str, rVar3, str2, num3, z19, z18, a2Var3, j14, sgVar2, pVar5, pVar4, r0Var2, jVar2, lVar, (p3.m) obj, iT, iT2, i16);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    }
                    i26 = i17 | 1769472;
                    a2Var2 = a2Var;
                    if ((i14 & 12582912) == 0) {
                        i26 |= 4194304;
                    }
                    if ((i14 & 100663296) == 0) {
                        i26 |= 33554432;
                    }
                    i29 = i16 & 512;
                    if (i29 != 0) {
                        i26 |= C.ENCODING_PCM_32BIT;
                        pVar3 = pVar;
                    } else {
                        pVar3 = pVar;
                        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarE.r(pVar3)) {
                                i30 = 536870912;
                            } else {
                                i30 = 268435456;
                            }
                            i26 |= i30;
                        }
                    }
                    i34 = i16 & 1024;
                    if (i34 != 0) {
                        i35 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(pVar2)) {
                            i36 = 4;
                        } else {
                            i36 = 2;
                        }
                        i35 = i15 | i36;
                    } else {
                        i35 = i15;
                    }
                    i37 = i16 & 2048;
                    if (i37 != 0) {
                        i35 |= 48;
                    } else if ((i15 & 48) != 0) {
                        if (o0VarE.B(r0Var)) {
                            i38 = 32;
                        } else {
                            i38 = 16;
                        }
                        i35 |= i38;
                    }
                    i39 = i35;
                    i44 = i39 | 384;
                    if ((i16 & 8192) != 0) {
                        i45 = i39 | 3456;
                    } else if ((i15 & 3072) == 0) {
                        i45 = i44 | (o0VarE.r(null) ? 2048 : 1024);
                    } else {
                        i45 = i44;
                    }
                    if ((i15 & 24576) == 0) {
                        i45 |= o0VarE.r(lVar) ? 16384 : 8192;
                    }
                    if ((i26 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (o0VarE.n(i26 & 1, z17)) {
                        o0VarE.G0();
                        i46 = i14 & 1;
                        aVar = p3.m.f135153a;
                        if (i46 != 0) {
                            if (i55 != 0) {
                                rVar4 = h4.r.S;
                            } else {
                                rVar4 = rVar2;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                x5.v.f188954b.getClass();
                                int i58 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var2 = new p006l2.a2(0, (Boolean) null, i58, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            }
                            d92.b.f58623a.getClass();
                            long jD2 = d92.b.a(o0VarE).k().d();
                            sg sgVarD2 = d(o0VarE);
                            int i59 = i26 & (-264241153);
                            if (i29 != 0) {
                                pVar3 = null;
                            }
                            if (i34 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i37 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            objQ = o0VarE.q();
                            aVar.getClass();
                            h4.r rVar7 = rVar4;
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            rVar5 = rVar7;
                            jVar3 = (a2.j) objQ;
                            pVar7 = pVar6;
                            sgVar3 = sgVarD2;
                            i47 = i59;
                            r0Var4 = r0Var3;
                            z24 = true;
                            j15 = jD2;
                            num4 = num2;
                            pVar8 = pVar3;
                            z25 = z16;
                            i48 = 4;
                            a2Var4 = a2Var2;
                            i49 = 16384;
                        } else {
                            if (i55 != 0) {
                                rVar4 = h4.r.S;
                            } else {
                                rVar4 = rVar2;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                x5.v.f188954b.getClass();
                                int i510 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var2 = new p006l2.a2(0, (Boolean) null, i510, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            }
                            d92.b.f58623a.getClass();
                            long jD3 = d92.b.a(o0VarE).k().d();
                            sg sgVarD3 = d(o0VarE);
                            int i511 = i26 & (-264241153);
                            if (i29 != 0) {
                                pVar3 = null;
                            }
                            if (i34 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i37 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            objQ = o0VarE.q();
                            aVar.getClass();
                            h4.r rVar8 = rVar4;
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            rVar5 = rVar8;
                            jVar3 = (a2.j) objQ;
                            pVar7 = pVar6;
                            sgVar3 = sgVarD3;
                            i47 = i511;
                            r0Var4 = r0Var3;
                            z24 = true;
                            j15 = jD3;
                            num4 = num2;
                            pVar8 = pVar3;
                            z25 = z16;
                            i48 = 4;
                            a2Var4 = a2Var2;
                            i49 = 16384;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var2 = p3.n.f135158a;
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ2 == c2565a) {
                            if (str == null) {
                                str4 = "";
                            } else {
                                str4 = str;
                            }
                            int length2 = str4.length();
                            if (str == null) {
                                str5 = "";
                            } else {
                                str5 = str;
                            }
                            objQ2 = p3.p0.n(s5.w0.a(og.a.l(length2, str5.length())));
                            o0VarE.K(objQ2);
                        }
                        p1Var = (p3.p1) objQ2;
                        long j17 = ((s5.w0) p1Var.getF182175a()).f157317a;
                        if ((i47 & 14) == i48) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        zL = z26 | o0VarE.l(j17);
                        objQ3 = o0VarE.q();
                        if (zL) {
                            objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                            o0VarE.K(objQ3);
                        }
                        x5.l0 l0Var2 = (x5.l0) ((p3.p1) objQ3).getF182175a();
                        if ((57344 & i45) == i49) {
                        }
                        objQ4 = o0VarE.q();
                        if (z27) {
                            objQ4 = new a11.b0(lVar, p1Var, 20);
                            o0VarE.K(objQ4);
                        } else {
                            objQ4 = new a11.b0(lVar, p1Var, 20);
                            o0VarE.K(objQ4);
                        }
                        o0Var = o0VarE;
                        b(l0Var2, rVar5, str3, num4, z25, z24, a2Var4, j15, sgVar3, pVar8, pVar7, r0Var4, jVar3, null, (e23.l) objQ4, o0Var, i47 & 2147483632, i45 & 8190, 0);
                        rVar3 = rVar5;
                        num3 = num4;
                        z19 = z25;
                        z18 = z24;
                        a2Var3 = a2Var4;
                        j14 = j15;
                        sgVar2 = sgVar3;
                        pVar5 = pVar8;
                        pVar4 = pVar7;
                        r0Var2 = r0Var4;
                        jVar2 = jVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        z18 = z15;
                        pVar4 = pVar2;
                        r0Var2 = r0Var;
                        jVar2 = jVar;
                        num3 = num2;
                        rVar3 = rVar2;
                        a2Var3 = a2Var2;
                        pVar5 = pVar3;
                        z19 = z16;
                        j14 = j8;
                        sgVar2 = sgVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: l72.j1
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                p1.a(str, rVar3, str2, num3, z19, z18, a2Var3, j14, sgVar2, pVar5, pVar4, r0Var2, jVar2, lVar, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i17 |= 24576;
                z16 = z14;
                i26 = i17 | 196608;
                i27 = i16 & 64;
                if (i27 != 0) {
                    if ((1572864 & i14) == 0) {
                        a2Var2 = a2Var;
                        if (o0VarE.B(a2Var2)) {
                            i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i28 = 524288;
                        }
                        i26 |= i28;
                    }
                    if ((i14 & 12582912) == 0) {
                        i26 |= 4194304;
                    }
                    if ((i14 & 100663296) == 0) {
                        i26 |= 33554432;
                    }
                    i29 = i16 & 512;
                    if (i29 != 0) {
                        i26 |= C.ENCODING_PCM_32BIT;
                        pVar3 = pVar;
                    } else {
                        pVar3 = pVar;
                        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarE.r(pVar3)) {
                                i30 = 536870912;
                            } else {
                                i30 = 268435456;
                            }
                            i26 |= i30;
                        }
                    }
                    i34 = i16 & 1024;
                    if (i34 != 0) {
                        i35 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(pVar2)) {
                            i36 = 4;
                        } else {
                            i36 = 2;
                        }
                        i35 = i15 | i36;
                    } else {
                        i35 = i15;
                    }
                    i37 = i16 & 2048;
                    if (i37 != 0) {
                        i35 |= 48;
                    } else if ((i15 & 48) != 0) {
                        if (o0VarE.B(r0Var)) {
                            i38 = 32;
                        } else {
                            i38 = 16;
                        }
                        i35 |= i38;
                    }
                    i39 = i35;
                    i44 = i39 | 384;
                    if ((i16 & 8192) != 0) {
                        i45 = i39 | 3456;
                    } else if ((i15 & 3072) == 0) {
                        i45 = i44 | (o0VarE.r(null) ? 2048 : 1024);
                    } else {
                        i45 = i44;
                    }
                    if ((i15 & 24576) == 0) {
                        i45 |= o0VarE.r(lVar) ? 16384 : 8192;
                    }
                    if ((i26 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (o0VarE.n(i26 & 1, z17)) {
                        o0VarE.G0();
                        i46 = i14 & 1;
                        aVar = p3.m.f135153a;
                        if (i46 != 0) {
                            if (i55 != 0) {
                                rVar4 = h4.r.S;
                            } else {
                                rVar4 = rVar2;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                x5.v.f188954b.getClass();
                                int i512 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var2 = new p006l2.a2(0, (Boolean) null, i512, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            }
                            d92.b.f58623a.getClass();
                            long jD4 = d92.b.a(o0VarE).k().d();
                            sg sgVarD4 = d(o0VarE);
                            int i513 = i26 & (-264241153);
                            if (i29 != 0) {
                                pVar3 = null;
                            }
                            if (i34 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i37 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            objQ = o0VarE.q();
                            aVar.getClass();
                            h4.r rVar9 = rVar4;
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            rVar5 = rVar9;
                            jVar3 = (a2.j) objQ;
                            pVar7 = pVar6;
                            sgVar3 = sgVarD4;
                            i47 = i513;
                            r0Var4 = r0Var3;
                            z24 = true;
                            j15 = jD4;
                            num4 = num2;
                            pVar8 = pVar3;
                            z25 = z16;
                            i48 = 4;
                            a2Var4 = a2Var2;
                            i49 = 16384;
                        } else {
                            if (i55 != 0) {
                                rVar4 = h4.r.S;
                            } else {
                                rVar4 = rVar2;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                x5.v.f188954b.getClass();
                                int i514 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var2 = new p006l2.a2(0, (Boolean) null, i514, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            }
                            d92.b.f58623a.getClass();
                            long jD5 = d92.b.a(o0VarE).k().d();
                            sg sgVarD5 = d(o0VarE);
                            int i515 = i26 & (-264241153);
                            if (i29 != 0) {
                                pVar3 = null;
                            }
                            if (i34 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i37 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            objQ = o0VarE.q();
                            aVar.getClass();
                            h4.r rVar10 = rVar4;
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            rVar5 = rVar10;
                            jVar3 = (a2.j) objQ;
                            pVar7 = pVar6;
                            sgVar3 = sgVarD5;
                            i47 = i515;
                            r0Var4 = r0Var3;
                            z24 = true;
                            j15 = jD5;
                            num4 = num2;
                            pVar8 = pVar3;
                            z25 = z16;
                            i48 = 4;
                            a2Var4 = a2Var2;
                            i49 = 16384;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var3 = p3.n.f135158a;
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ2 == c2565a) {
                            if (str == null) {
                                str4 = "";
                            } else {
                                str4 = str;
                            }
                            int length3 = str4.length();
                            if (str == null) {
                                str5 = "";
                            } else {
                                str5 = str;
                            }
                            objQ2 = p3.p0.n(s5.w0.a(og.a.l(length3, str5.length())));
                            o0VarE.K(objQ2);
                        }
                        p1Var = (p3.p1) objQ2;
                        long j18 = ((s5.w0) p1Var.getF182175a()).f157317a;
                        if ((i47 & 14) == i48) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        zL = z26 | o0VarE.l(j18);
                        objQ3 = o0VarE.q();
                        if (zL) {
                            objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                            o0VarE.K(objQ3);
                        }
                        x5.l0 l0Var3 = (x5.l0) ((p3.p1) objQ3).getF182175a();
                        if ((57344 & i45) == i49) {
                        }
                        objQ4 = o0VarE.q();
                        if (z27) {
                            objQ4 = new a11.b0(lVar, p1Var, 20);
                            o0VarE.K(objQ4);
                        } else {
                            objQ4 = new a11.b0(lVar, p1Var, 20);
                            o0VarE.K(objQ4);
                        }
                        o0Var = o0VarE;
                        b(l0Var3, rVar5, str3, num4, z25, z24, a2Var4, j15, sgVar3, pVar8, pVar7, r0Var4, jVar3, null, (e23.l) objQ4, o0Var, i47 & 2147483632, i45 & 8190, 0);
                        rVar3 = rVar5;
                        num3 = num4;
                        z19 = z25;
                        z18 = z24;
                        a2Var3 = a2Var4;
                        j14 = j15;
                        sgVar2 = sgVar3;
                        pVar5 = pVar8;
                        pVar4 = pVar7;
                        r0Var2 = r0Var4;
                        jVar2 = jVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        z18 = z15;
                        pVar4 = pVar2;
                        r0Var2 = r0Var;
                        jVar2 = jVar;
                        num3 = num2;
                        rVar3 = rVar2;
                        a2Var3 = a2Var2;
                        pVar5 = pVar3;
                        z19 = z16;
                        j14 = j8;
                        sgVar2 = sgVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: l72.j1
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                p1.a(str, rVar3, str2, num3, z19, z18, a2Var3, j14, sgVar2, pVar5, pVar4, r0Var2, jVar2, lVar, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i26 = i17 | 1769472;
                a2Var2 = a2Var;
                if ((i14 & 12582912) == 0) {
                    i26 |= 4194304;
                }
                if ((i14 & 100663296) == 0) {
                    i26 |= 33554432;
                }
                i29 = i16 & 512;
                if (i29 != 0) {
                    i26 |= C.ENCODING_PCM_32BIT;
                    pVar3 = pVar;
                } else {
                    pVar3 = pVar;
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(pVar3)) {
                            i30 = 536870912;
                        } else {
                            i30 = 268435456;
                        }
                        i26 |= i30;
                    }
                }
                i34 = i16 & 1024;
                if (i34 != 0) {
                    i35 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i36 = 4;
                    } else {
                        i36 = 2;
                    }
                    i35 = i15 | i36;
                } else {
                    i35 = i15;
                }
                i37 = i16 & 2048;
                if (i37 != 0) {
                    i35 |= 48;
                } else if ((i15 & 48) != 0) {
                    if (o0VarE.B(r0Var)) {
                        i38 = 32;
                    } else {
                        i38 = 16;
                    }
                    i35 |= i38;
                }
                i39 = i35;
                i44 = i39 | 384;
                if ((i16 & 8192) != 0) {
                    i45 = i39 | 3456;
                } else if ((i15 & 3072) == 0) {
                    i45 = i44 | (o0VarE.r(null) ? 2048 : 1024);
                } else {
                    i45 = i44;
                }
                if ((i15 & 24576) == 0) {
                    i45 |= o0VarE.r(lVar) ? 16384 : 8192;
                }
                if ((i26 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (o0VarE.n(i26 & 1, z17)) {
                    o0VarE.G0();
                    i46 = i14 & 1;
                    aVar = p3.m.f135153a;
                    if (i46 != 0) {
                        if (i55 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            x5.v.f188954b.getClass();
                            int i516 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var2 = new p006l2.a2(0, (Boolean) null, i516, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        }
                        d92.b.f58623a.getClass();
                        long jD6 = d92.b.a(o0VarE).k().d();
                        sg sgVarD6 = d(o0VarE);
                        int i517 = i26 & (-264241153);
                        if (i29 != 0) {
                            pVar3 = null;
                        }
                        if (i34 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i37 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        objQ = o0VarE.q();
                        aVar.getClass();
                        h4.r rVar11 = rVar4;
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        rVar5 = rVar11;
                        jVar3 = (a2.j) objQ;
                        pVar7 = pVar6;
                        sgVar3 = sgVarD6;
                        i47 = i517;
                        r0Var4 = r0Var3;
                        z24 = true;
                        j15 = jD6;
                        num4 = num2;
                        pVar8 = pVar3;
                        z25 = z16;
                        i48 = 4;
                        a2Var4 = a2Var2;
                        i49 = 16384;
                    } else {
                        if (i55 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            x5.v.f188954b.getClass();
                            int i518 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var2 = new p006l2.a2(0, (Boolean) null, i518, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        }
                        d92.b.f58623a.getClass();
                        long jD7 = d92.b.a(o0VarE).k().d();
                        sg sgVarD7 = d(o0VarE);
                        int i519 = i26 & (-264241153);
                        if (i29 != 0) {
                            pVar3 = null;
                        }
                        if (i34 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i37 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        objQ = o0VarE.q();
                        aVar.getClass();
                        h4.r rVar12 = rVar4;
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        rVar5 = rVar12;
                        jVar3 = (a2.j) objQ;
                        pVar7 = pVar6;
                        sgVar3 = sgVarD7;
                        i47 = i519;
                        r0Var4 = r0Var3;
                        z24 = true;
                        j15 = jD7;
                        num4 = num2;
                        pVar8 = pVar3;
                        z25 = z16;
                        i48 = 4;
                        a2Var4 = a2Var2;
                        i49 = 16384;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var4 = p3.n.f135158a;
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        if (str == null) {
                            str4 = "";
                        } else {
                            str4 = str;
                        }
                        int length4 = str4.length();
                        if (str == null) {
                            str5 = "";
                        } else {
                            str5 = str;
                        }
                        objQ2 = p3.p0.n(s5.w0.a(og.a.l(length4, str5.length())));
                        o0VarE.K(objQ2);
                    }
                    p1Var = (p3.p1) objQ2;
                    long j19 = ((s5.w0) p1Var.getF182175a()).f157317a;
                    if ((i47 & 14) == i48) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zL = z26 | o0VarE.l(j19);
                    objQ3 = o0VarE.q();
                    if (zL) {
                        objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                        o0VarE.K(objQ3);
                    }
                    x5.l0 l0Var4 = (x5.l0) ((p3.p1) objQ3).getF182175a();
                    if ((57344 & i45) == i49) {
                    }
                    objQ4 = o0VarE.q();
                    if (z27) {
                        objQ4 = new a11.b0(lVar, p1Var, 20);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new a11.b0(lVar, p1Var, 20);
                        o0VarE.K(objQ4);
                    }
                    o0Var = o0VarE;
                    b(l0Var4, rVar5, str3, num4, z25, z24, a2Var4, j15, sgVar3, pVar8, pVar7, r0Var4, jVar3, null, (e23.l) objQ4, o0Var, i47 & 2147483632, i45 & 8190, 0);
                    rVar3 = rVar5;
                    num3 = num4;
                    z19 = z25;
                    z18 = z24;
                    a2Var3 = a2Var4;
                    j14 = j15;
                    sgVar2 = sgVar3;
                    pVar5 = pVar8;
                    pVar4 = pVar7;
                    r0Var2 = r0Var4;
                    jVar2 = jVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    z18 = z15;
                    pVar4 = pVar2;
                    r0Var2 = r0Var;
                    jVar2 = jVar;
                    num3 = num2;
                    rVar3 = rVar2;
                    a2Var3 = a2Var2;
                    pVar5 = pVar3;
                    z19 = z16;
                    j14 = j8;
                    sgVar2 = sgVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: l72.j1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            p1.a(str, rVar3, str2, num3, z19, z18, a2Var3, j14, sgVar2, pVar5, pVar4, r0Var2, jVar2, lVar, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i17 |= 3072;
            num2 = num;
            i24 = i16 & 16;
            if (i24 != 0) {
                if ((i14 & 24576) == 0) {
                    z16 = z14;
                    if (o0VarE.h(z16)) {
                        i25 = 16384;
                    } else {
                        i25 = 8192;
                    }
                    i17 |= i25;
                }
                i26 = i17 | 196608;
                i27 = i16 & 64;
                if (i27 != 0) {
                    if ((1572864 & i14) == 0) {
                        a2Var2 = a2Var;
                        if (o0VarE.B(a2Var2)) {
                            i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i28 = 524288;
                        }
                        i26 |= i28;
                    }
                    if ((i14 & 12582912) == 0) {
                        i26 |= 4194304;
                    }
                    if ((i14 & 100663296) == 0) {
                        i26 |= 33554432;
                    }
                    i29 = i16 & 512;
                    if (i29 != 0) {
                        i26 |= C.ENCODING_PCM_32BIT;
                        pVar3 = pVar;
                    } else {
                        pVar3 = pVar;
                        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarE.r(pVar3)) {
                                i30 = 536870912;
                            } else {
                                i30 = 268435456;
                            }
                            i26 |= i30;
                        }
                    }
                    i34 = i16 & 1024;
                    if (i34 != 0) {
                        i35 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(pVar2)) {
                            i36 = 4;
                        } else {
                            i36 = 2;
                        }
                        i35 = i15 | i36;
                    } else {
                        i35 = i15;
                    }
                    i37 = i16 & 2048;
                    if (i37 != 0) {
                        i35 |= 48;
                    } else if ((i15 & 48) != 0) {
                        if (o0VarE.B(r0Var)) {
                            i38 = 32;
                        } else {
                            i38 = 16;
                        }
                        i35 |= i38;
                    }
                    i39 = i35;
                    i44 = i39 | 384;
                    if ((i16 & 8192) != 0) {
                        i45 = i39 | 3456;
                    } else if ((i15 & 3072) == 0) {
                        i45 = i44 | (o0VarE.r(null) ? 2048 : 1024);
                    } else {
                        i45 = i44;
                    }
                    if ((i15 & 24576) == 0) {
                        i45 |= o0VarE.r(lVar) ? 16384 : 8192;
                    }
                    if ((i26 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (o0VarE.n(i26 & 1, z17)) {
                        o0VarE.G0();
                        i46 = i14 & 1;
                        aVar = p3.m.f135153a;
                        if (i46 != 0) {
                            if (i55 != 0) {
                                rVar4 = h4.r.S;
                            } else {
                                rVar4 = rVar2;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                x5.v.f188954b.getClass();
                                int i5110 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var2 = new p006l2.a2(0, (Boolean) null, i5110, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            }
                            d92.b.f58623a.getClass();
                            long jD8 = d92.b.a(o0VarE).k().d();
                            sg sgVarD8 = d(o0VarE);
                            int i5111 = i26 & (-264241153);
                            if (i29 != 0) {
                                pVar3 = null;
                            }
                            if (i34 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i37 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            objQ = o0VarE.q();
                            aVar.getClass();
                            h4.r rVar13 = rVar4;
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            rVar5 = rVar13;
                            jVar3 = (a2.j) objQ;
                            pVar7 = pVar6;
                            sgVar3 = sgVarD8;
                            i47 = i5111;
                            r0Var4 = r0Var3;
                            z24 = true;
                            j15 = jD8;
                            num4 = num2;
                            pVar8 = pVar3;
                            z25 = z16;
                            i48 = 4;
                            a2Var4 = a2Var2;
                            i49 = 16384;
                        } else {
                            if (i55 != 0) {
                                rVar4 = h4.r.S;
                            } else {
                                rVar4 = rVar2;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                x5.v.f188954b.getClass();
                                int i5112 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var2 = new p006l2.a2(0, (Boolean) null, i5112, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            }
                            d92.b.f58623a.getClass();
                            long jD9 = d92.b.a(o0VarE).k().d();
                            sg sgVarD9 = d(o0VarE);
                            int i5113 = i26 & (-264241153);
                            if (i29 != 0) {
                                pVar3 = null;
                            }
                            if (i34 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i37 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            objQ = o0VarE.q();
                            aVar.getClass();
                            h4.r rVar14 = rVar4;
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            rVar5 = rVar14;
                            jVar3 = (a2.j) objQ;
                            pVar7 = pVar6;
                            sgVar3 = sgVarD9;
                            i47 = i5113;
                            r0Var4 = r0Var3;
                            z24 = true;
                            j15 = jD9;
                            num4 = num2;
                            pVar8 = pVar3;
                            z25 = z16;
                            i48 = 4;
                            a2Var4 = a2Var2;
                            i49 = 16384;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var5 = p3.n.f135158a;
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ2 == c2565a) {
                            if (str == null) {
                                str4 = "";
                            } else {
                                str4 = str;
                            }
                            int length5 = str4.length();
                            if (str == null) {
                                str5 = "";
                            } else {
                                str5 = str;
                            }
                            objQ2 = p3.p0.n(s5.w0.a(og.a.l(length5, str5.length())));
                            o0VarE.K(objQ2);
                        }
                        p1Var = (p3.p1) objQ2;
                        long j110 = ((s5.w0) p1Var.getF182175a()).f157317a;
                        if ((i47 & 14) == i48) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        zL = z26 | o0VarE.l(j110);
                        objQ3 = o0VarE.q();
                        if (zL) {
                            objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                            o0VarE.K(objQ3);
                        }
                        x5.l0 l0Var5 = (x5.l0) ((p3.p1) objQ3).getF182175a();
                        if ((57344 & i45) == i49) {
                        }
                        objQ4 = o0VarE.q();
                        if (z27) {
                            objQ4 = new a11.b0(lVar, p1Var, 20);
                            o0VarE.K(objQ4);
                        } else {
                            objQ4 = new a11.b0(lVar, p1Var, 20);
                            o0VarE.K(objQ4);
                        }
                        o0Var = o0VarE;
                        b(l0Var5, rVar5, str3, num4, z25, z24, a2Var4, j15, sgVar3, pVar8, pVar7, r0Var4, jVar3, null, (e23.l) objQ4, o0Var, i47 & 2147483632, i45 & 8190, 0);
                        rVar3 = rVar5;
                        num3 = num4;
                        z19 = z25;
                        z18 = z24;
                        a2Var3 = a2Var4;
                        j14 = j15;
                        sgVar2 = sgVar3;
                        pVar5 = pVar8;
                        pVar4 = pVar7;
                        r0Var2 = r0Var4;
                        jVar2 = jVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        z18 = z15;
                        pVar4 = pVar2;
                        r0Var2 = r0Var;
                        jVar2 = jVar;
                        num3 = num2;
                        rVar3 = rVar2;
                        a2Var3 = a2Var2;
                        pVar5 = pVar3;
                        z19 = z16;
                        j14 = j8;
                        sgVar2 = sgVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: l72.j1
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                p1.a(str, rVar3, str2, num3, z19, z18, a2Var3, j14, sgVar2, pVar5, pVar4, r0Var2, jVar2, lVar, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i26 = i17 | 1769472;
                a2Var2 = a2Var;
                if ((i14 & 12582912) == 0) {
                    i26 |= 4194304;
                }
                if ((i14 & 100663296) == 0) {
                    i26 |= 33554432;
                }
                i29 = i16 & 512;
                if (i29 != 0) {
                    i26 |= C.ENCODING_PCM_32BIT;
                    pVar3 = pVar;
                } else {
                    pVar3 = pVar;
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(pVar3)) {
                            i30 = 536870912;
                        } else {
                            i30 = 268435456;
                        }
                        i26 |= i30;
                    }
                }
                i34 = i16 & 1024;
                if (i34 != 0) {
                    i35 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i36 = 4;
                    } else {
                        i36 = 2;
                    }
                    i35 = i15 | i36;
                } else {
                    i35 = i15;
                }
                i37 = i16 & 2048;
                if (i37 != 0) {
                    i35 |= 48;
                } else if ((i15 & 48) != 0) {
                    if (o0VarE.B(r0Var)) {
                        i38 = 32;
                    } else {
                        i38 = 16;
                    }
                    i35 |= i38;
                }
                i39 = i35;
                i44 = i39 | 384;
                if ((i16 & 8192) != 0) {
                    i45 = i39 | 3456;
                } else if ((i15 & 3072) == 0) {
                    i45 = i44 | (o0VarE.r(null) ? 2048 : 1024);
                } else {
                    i45 = i44;
                }
                if ((i15 & 24576) == 0) {
                    i45 |= o0VarE.r(lVar) ? 16384 : 8192;
                }
                if ((i26 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (o0VarE.n(i26 & 1, z17)) {
                    o0VarE.G0();
                    i46 = i14 & 1;
                    aVar = p3.m.f135153a;
                    if (i46 != 0) {
                        if (i55 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            x5.v.f188954b.getClass();
                            int i5114 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var2 = new p006l2.a2(0, (Boolean) null, i5114, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        }
                        d92.b.f58623a.getClass();
                        long jD10 = d92.b.a(o0VarE).k().d();
                        sg sgVarD10 = d(o0VarE);
                        int i5115 = i26 & (-264241153);
                        if (i29 != 0) {
                            pVar3 = null;
                        }
                        if (i34 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i37 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        objQ = o0VarE.q();
                        aVar.getClass();
                        h4.r rVar15 = rVar4;
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        rVar5 = rVar15;
                        jVar3 = (a2.j) objQ;
                        pVar7 = pVar6;
                        sgVar3 = sgVarD10;
                        i47 = i5115;
                        r0Var4 = r0Var3;
                        z24 = true;
                        j15 = jD10;
                        num4 = num2;
                        pVar8 = pVar3;
                        z25 = z16;
                        i48 = 4;
                        a2Var4 = a2Var2;
                        i49 = 16384;
                    } else {
                        if (i55 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            x5.v.f188954b.getClass();
                            int i5116 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var2 = new p006l2.a2(0, (Boolean) null, i5116, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        }
                        d92.b.f58623a.getClass();
                        long jD11 = d92.b.a(o0VarE).k().d();
                        sg sgVarD11 = d(o0VarE);
                        int i5117 = i26 & (-264241153);
                        if (i29 != 0) {
                            pVar3 = null;
                        }
                        if (i34 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i37 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        objQ = o0VarE.q();
                        aVar.getClass();
                        h4.r rVar16 = rVar4;
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        rVar5 = rVar16;
                        jVar3 = (a2.j) objQ;
                        pVar7 = pVar6;
                        sgVar3 = sgVarD11;
                        i47 = i5117;
                        r0Var4 = r0Var3;
                        z24 = true;
                        j15 = jD11;
                        num4 = num2;
                        pVar8 = pVar3;
                        z25 = z16;
                        i48 = 4;
                        a2Var4 = a2Var2;
                        i49 = 16384;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var6 = p3.n.f135158a;
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        if (str == null) {
                            str4 = "";
                        } else {
                            str4 = str;
                        }
                        int length6 = str4.length();
                        if (str == null) {
                            str5 = "";
                        } else {
                            str5 = str;
                        }
                        objQ2 = p3.p0.n(s5.w0.a(og.a.l(length6, str5.length())));
                        o0VarE.K(objQ2);
                    }
                    p1Var = (p3.p1) objQ2;
                    long j111 = ((s5.w0) p1Var.getF182175a()).f157317a;
                    if ((i47 & 14) == i48) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zL = z26 | o0VarE.l(j111);
                    objQ3 = o0VarE.q();
                    if (zL) {
                        objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                        o0VarE.K(objQ3);
                    }
                    x5.l0 l0Var6 = (x5.l0) ((p3.p1) objQ3).getF182175a();
                    if ((57344 & i45) == i49) {
                    }
                    objQ4 = o0VarE.q();
                    if (z27) {
                        objQ4 = new a11.b0(lVar, p1Var, 20);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new a11.b0(lVar, p1Var, 20);
                        o0VarE.K(objQ4);
                    }
                    o0Var = o0VarE;
                    b(l0Var6, rVar5, str3, num4, z25, z24, a2Var4, j15, sgVar3, pVar8, pVar7, r0Var4, jVar3, null, (e23.l) objQ4, o0Var, i47 & 2147483632, i45 & 8190, 0);
                    rVar3 = rVar5;
                    num3 = num4;
                    z19 = z25;
                    z18 = z24;
                    a2Var3 = a2Var4;
                    j14 = j15;
                    sgVar2 = sgVar3;
                    pVar5 = pVar8;
                    pVar4 = pVar7;
                    r0Var2 = r0Var4;
                    jVar2 = jVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    z18 = z15;
                    pVar4 = pVar2;
                    r0Var2 = r0Var;
                    jVar2 = jVar;
                    num3 = num2;
                    rVar3 = rVar2;
                    a2Var3 = a2Var2;
                    pVar5 = pVar3;
                    z19 = z16;
                    j14 = j8;
                    sgVar2 = sgVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: l72.j1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            p1.a(str, rVar3, str2, num3, z19, z18, a2Var3, j14, sgVar2, pVar5, pVar4, r0Var2, jVar2, lVar, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i17 |= 24576;
            z16 = z14;
            i26 = i17 | 196608;
            i27 = i16 & 64;
            if (i27 != 0) {
                if ((1572864 & i14) == 0) {
                    a2Var2 = a2Var;
                    if (o0VarE.B(a2Var2)) {
                        i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i28 = 524288;
                    }
                    i26 |= i28;
                }
                if ((i14 & 12582912) == 0) {
                    i26 |= 4194304;
                }
                if ((i14 & 100663296) == 0) {
                    i26 |= 33554432;
                }
                i29 = i16 & 512;
                if (i29 != 0) {
                    i26 |= C.ENCODING_PCM_32BIT;
                    pVar3 = pVar;
                } else {
                    pVar3 = pVar;
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(pVar3)) {
                            i30 = 536870912;
                        } else {
                            i30 = 268435456;
                        }
                        i26 |= i30;
                    }
                }
                i34 = i16 & 1024;
                if (i34 != 0) {
                    i35 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i36 = 4;
                    } else {
                        i36 = 2;
                    }
                    i35 = i15 | i36;
                } else {
                    i35 = i15;
                }
                i37 = i16 & 2048;
                if (i37 != 0) {
                    i35 |= 48;
                } else if ((i15 & 48) != 0) {
                    if (o0VarE.B(r0Var)) {
                        i38 = 32;
                    } else {
                        i38 = 16;
                    }
                    i35 |= i38;
                }
                i39 = i35;
                i44 = i39 | 384;
                if ((i16 & 8192) != 0) {
                    i45 = i39 | 3456;
                } else if ((i15 & 3072) == 0) {
                    i45 = i44 | (o0VarE.r(null) ? 2048 : 1024);
                } else {
                    i45 = i44;
                }
                if ((i15 & 24576) == 0) {
                    i45 |= o0VarE.r(lVar) ? 16384 : 8192;
                }
                if ((i26 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (o0VarE.n(i26 & 1, z17)) {
                    o0VarE.G0();
                    i46 = i14 & 1;
                    aVar = p3.m.f135153a;
                    if (i46 != 0) {
                        if (i55 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            x5.v.f188954b.getClass();
                            int i5118 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var2 = new p006l2.a2(0, (Boolean) null, i5118, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        }
                        d92.b.f58623a.getClass();
                        long jD12 = d92.b.a(o0VarE).k().d();
                        sg sgVarD12 = d(o0VarE);
                        int i5119 = i26 & (-264241153);
                        if (i29 != 0) {
                            pVar3 = null;
                        }
                        if (i34 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i37 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        objQ = o0VarE.q();
                        aVar.getClass();
                        h4.r rVar17 = rVar4;
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        rVar5 = rVar17;
                        jVar3 = (a2.j) objQ;
                        pVar7 = pVar6;
                        sgVar3 = sgVarD12;
                        i47 = i5119;
                        r0Var4 = r0Var3;
                        z24 = true;
                        j15 = jD12;
                        num4 = num2;
                        pVar8 = pVar3;
                        z25 = z16;
                        i48 = 4;
                        a2Var4 = a2Var2;
                        i49 = 16384;
                    } else {
                        if (i55 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            x5.v.f188954b.getClass();
                            int i51110 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var2 = new p006l2.a2(0, (Boolean) null, i51110, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        }
                        d92.b.f58623a.getClass();
                        long jD13 = d92.b.a(o0VarE).k().d();
                        sg sgVarD13 = d(o0VarE);
                        int i51111 = i26 & (-264241153);
                        if (i29 != 0) {
                            pVar3 = null;
                        }
                        if (i34 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i37 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        objQ = o0VarE.q();
                        aVar.getClass();
                        h4.r rVar18 = rVar4;
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        rVar5 = rVar18;
                        jVar3 = (a2.j) objQ;
                        pVar7 = pVar6;
                        sgVar3 = sgVarD13;
                        i47 = i51111;
                        r0Var4 = r0Var3;
                        z24 = true;
                        j15 = jD13;
                        num4 = num2;
                        pVar8 = pVar3;
                        z25 = z16;
                        i48 = 4;
                        a2Var4 = a2Var2;
                        i49 = 16384;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var7 = p3.n.f135158a;
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        if (str == null) {
                            str4 = "";
                        } else {
                            str4 = str;
                        }
                        int length7 = str4.length();
                        if (str == null) {
                            str5 = "";
                        } else {
                            str5 = str;
                        }
                        objQ2 = p3.p0.n(s5.w0.a(og.a.l(length7, str5.length())));
                        o0VarE.K(objQ2);
                    }
                    p1Var = (p3.p1) objQ2;
                    long j112 = ((s5.w0) p1Var.getF182175a()).f157317a;
                    if ((i47 & 14) == i48) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zL = z26 | o0VarE.l(j112);
                    objQ3 = o0VarE.q();
                    if (zL) {
                        objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                        o0VarE.K(objQ3);
                    }
                    x5.l0 l0Var7 = (x5.l0) ((p3.p1) objQ3).getF182175a();
                    if ((57344 & i45) == i49) {
                    }
                    objQ4 = o0VarE.q();
                    if (z27) {
                        objQ4 = new a11.b0(lVar, p1Var, 20);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new a11.b0(lVar, p1Var, 20);
                        o0VarE.K(objQ4);
                    }
                    o0Var = o0VarE;
                    b(l0Var7, rVar5, str3, num4, z25, z24, a2Var4, j15, sgVar3, pVar8, pVar7, r0Var4, jVar3, null, (e23.l) objQ4, o0Var, i47 & 2147483632, i45 & 8190, 0);
                    rVar3 = rVar5;
                    num3 = num4;
                    z19 = z25;
                    z18 = z24;
                    a2Var3 = a2Var4;
                    j14 = j15;
                    sgVar2 = sgVar3;
                    pVar5 = pVar8;
                    pVar4 = pVar7;
                    r0Var2 = r0Var4;
                    jVar2 = jVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    z18 = z15;
                    pVar4 = pVar2;
                    r0Var2 = r0Var;
                    jVar2 = jVar;
                    num3 = num2;
                    rVar3 = rVar2;
                    a2Var3 = a2Var2;
                    pVar5 = pVar3;
                    z19 = z16;
                    j14 = j8;
                    sgVar2 = sgVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: l72.j1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            p1.a(str, rVar3, str2, num3, z19, z18, a2Var3, j14, sgVar2, pVar5, pVar4, r0Var2, jVar2, lVar, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i26 = i17 | 1769472;
            a2Var2 = a2Var;
            if ((i14 & 12582912) == 0) {
                i26 |= 4194304;
            }
            if ((i14 & 100663296) == 0) {
                i26 |= 33554432;
            }
            i29 = i16 & 512;
            if (i29 != 0) {
                i26 |= C.ENCODING_PCM_32BIT;
                pVar3 = pVar;
            } else {
                pVar3 = pVar;
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(pVar3)) {
                        i30 = 536870912;
                    } else {
                        i30 = 268435456;
                    }
                    i26 |= i30;
                }
            }
            i34 = i16 & 1024;
            if (i34 != 0) {
                i35 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.r(pVar2)) {
                    i36 = 4;
                } else {
                    i36 = 2;
                }
                i35 = i15 | i36;
            } else {
                i35 = i15;
            }
            i37 = i16 & 2048;
            if (i37 != 0) {
                i35 |= 48;
            } else if ((i15 & 48) != 0) {
                if (o0VarE.B(r0Var)) {
                    i38 = 32;
                } else {
                    i38 = 16;
                }
                i35 |= i38;
            }
            i39 = i35;
            i44 = i39 | 384;
            if ((i16 & 8192) != 0) {
                i45 = i39 | 3456;
            } else if ((i15 & 3072) == 0) {
                i45 = i44 | (o0VarE.r(null) ? 2048 : 1024);
            } else {
                i45 = i44;
            }
            if ((i15 & 24576) == 0) {
                i45 |= o0VarE.r(lVar) ? 16384 : 8192;
            }
            if ((i26 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (o0VarE.n(i26 & 1, z17)) {
                o0VarE.G0();
                i46 = i14 & 1;
                aVar = p3.m.f135153a;
                if (i46 != 0) {
                    if (i55 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i18 != 0) {
                        num2 = null;
                    }
                    if (i24 != 0) {
                        z16 = true;
                    }
                    if (i27 != 0) {
                        x5.v.f188954b.getClass();
                        int i51112 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        a2Var2 = new p006l2.a2(0, (Boolean) null, i51112, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    }
                    d92.b.f58623a.getClass();
                    long jD14 = d92.b.a(o0VarE).k().d();
                    sg sgVarD14 = d(o0VarE);
                    int i51113 = i26 & (-264241153);
                    if (i29 != 0) {
                        pVar3 = null;
                    }
                    if (i34 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i37 != 0) {
                        x5.r0.f188941a.getClass();
                        r0Var3 = x5.r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    objQ = o0VarE.q();
                    aVar.getClass();
                    h4.r rVar19 = rVar4;
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.b(o0VarE);
                    }
                    rVar5 = rVar19;
                    jVar3 = (a2.j) objQ;
                    pVar7 = pVar6;
                    sgVar3 = sgVarD14;
                    i47 = i51113;
                    r0Var4 = r0Var3;
                    z24 = true;
                    j15 = jD14;
                    num4 = num2;
                    pVar8 = pVar3;
                    z25 = z16;
                    i48 = 4;
                    a2Var4 = a2Var2;
                    i49 = 16384;
                } else {
                    if (i55 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i18 != 0) {
                        num2 = null;
                    }
                    if (i24 != 0) {
                        z16 = true;
                    }
                    if (i27 != 0) {
                        x5.v.f188954b.getClass();
                        int i51114 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        a2Var2 = new p006l2.a2(0, (Boolean) null, i51114, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    }
                    d92.b.f58623a.getClass();
                    long jD15 = d92.b.a(o0VarE).k().d();
                    sg sgVarD15 = d(o0VarE);
                    int i51115 = i26 & (-264241153);
                    if (i29 != 0) {
                        pVar3 = null;
                    }
                    if (i34 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i37 != 0) {
                        x5.r0.f188941a.getClass();
                        r0Var3 = x5.r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    objQ = o0VarE.q();
                    aVar.getClass();
                    h4.r rVar110 = rVar4;
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.b(o0VarE);
                    }
                    rVar5 = rVar110;
                    jVar3 = (a2.j) objQ;
                    pVar7 = pVar6;
                    sgVar3 = sgVarD15;
                    i47 = i51115;
                    r0Var4 = r0Var3;
                    z24 = true;
                    j15 = jD15;
                    num4 = num2;
                    pVar8 = pVar3;
                    z25 = z16;
                    i48 = 4;
                    a2Var4 = a2Var2;
                    i49 = 16384;
                }
                o0VarE.h0();
                p3.x1 x1Var8 = p3.n.f135158a;
                objQ2 = o0VarE.q();
                aVar.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ2 == c2565a) {
                    if (str == null) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    int length8 = str4.length();
                    if (str == null) {
                        str5 = "";
                    } else {
                        str5 = str;
                    }
                    objQ2 = p3.p0.n(s5.w0.a(og.a.l(length8, str5.length())));
                    o0VarE.K(objQ2);
                }
                p1Var = (p3.p1) objQ2;
                long j113 = ((s5.w0) p1Var.getF182175a()).f157317a;
                if ((i47 & 14) == i48) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zL = z26 | o0VarE.l(j113);
                objQ3 = o0VarE.q();
                if (zL) {
                    objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                    o0VarE.K(objQ3);
                }
                x5.l0 l0Var8 = (x5.l0) ((p3.p1) objQ3).getF182175a();
                if ((57344 & i45) == i49) {
                }
                objQ4 = o0VarE.q();
                if (z27) {
                    objQ4 = new a11.b0(lVar, p1Var, 20);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new a11.b0(lVar, p1Var, 20);
                    o0VarE.K(objQ4);
                }
                o0Var = o0VarE;
                b(l0Var8, rVar5, str3, num4, z25, z24, a2Var4, j15, sgVar3, pVar8, pVar7, r0Var4, jVar3, null, (e23.l) objQ4, o0Var, i47 & 2147483632, i45 & 8190, 0);
                rVar3 = rVar5;
                num3 = num4;
                z19 = z25;
                z18 = z24;
                a2Var3 = a2Var4;
                j14 = j15;
                sgVar2 = sgVar3;
                pVar5 = pVar8;
                pVar4 = pVar7;
                r0Var2 = r0Var4;
                jVar2 = jVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z18 = z15;
                pVar4 = pVar2;
                r0Var2 = r0Var;
                jVar2 = jVar;
                num3 = num2;
                rVar3 = rVar2;
                a2Var3 = a2Var2;
                pVar5 = pVar3;
                z19 = z16;
                j14 = j8;
                sgVar2 = sgVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l72.j1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        p1.a(str, rVar3, str2, num3, z19, z18, a2Var3, j14, sgVar2, pVar5, pVar4, r0Var2, jVar2, lVar, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i17 |= 48;
        rVar2 = rVar;
        if ((i14 & 384) == 0) {
            str3 = str2;
            if (o0VarE.B(str3)) {
                i54 = 256;
            } else {
                i54 = 128;
            }
            i17 |= i54;
        } else {
            str3 = str2;
        }
        i18 = i16 & 8;
        if (i18 != 0) {
            if ((i14 & 3072) == 0) {
                num2 = num;
                if (o0VarE.B(num2)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            i24 = i16 & 16;
            if (i24 != 0) {
                if ((i14 & 24576) == 0) {
                    z16 = z14;
                    if (o0VarE.h(z16)) {
                        i25 = 16384;
                    } else {
                        i25 = 8192;
                    }
                    i17 |= i25;
                }
                i26 = i17 | 196608;
                i27 = i16 & 64;
                if (i27 != 0) {
                    if ((1572864 & i14) == 0) {
                        a2Var2 = a2Var;
                        if (o0VarE.B(a2Var2)) {
                            i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i28 = 524288;
                        }
                        i26 |= i28;
                    }
                    if ((i14 & 12582912) == 0) {
                        i26 |= 4194304;
                    }
                    if ((i14 & 100663296) == 0) {
                        i26 |= 33554432;
                    }
                    i29 = i16 & 512;
                    if (i29 != 0) {
                        i26 |= C.ENCODING_PCM_32BIT;
                        pVar3 = pVar;
                    } else {
                        pVar3 = pVar;
                        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarE.r(pVar3)) {
                                i30 = 536870912;
                            } else {
                                i30 = 268435456;
                            }
                            i26 |= i30;
                        }
                    }
                    i34 = i16 & 1024;
                    if (i34 != 0) {
                        i35 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(pVar2)) {
                            i36 = 4;
                        } else {
                            i36 = 2;
                        }
                        i35 = i15 | i36;
                    } else {
                        i35 = i15;
                    }
                    i37 = i16 & 2048;
                    if (i37 != 0) {
                        i35 |= 48;
                    } else if ((i15 & 48) != 0) {
                        if (o0VarE.B(r0Var)) {
                            i38 = 32;
                        } else {
                            i38 = 16;
                        }
                        i35 |= i38;
                    }
                    i39 = i35;
                    i44 = i39 | 384;
                    if ((i16 & 8192) != 0) {
                        i45 = i39 | 3456;
                    } else if ((i15 & 3072) == 0) {
                        i45 = i44 | (o0VarE.r(null) ? 2048 : 1024);
                    } else {
                        i45 = i44;
                    }
                    if ((i15 & 24576) == 0) {
                        i45 |= o0VarE.r(lVar) ? 16384 : 8192;
                    }
                    if ((i26 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (o0VarE.n(i26 & 1, z17)) {
                        o0VarE.G0();
                        i46 = i14 & 1;
                        aVar = p3.m.f135153a;
                        if (i46 != 0) {
                            if (i55 != 0) {
                                rVar4 = h4.r.S;
                            } else {
                                rVar4 = rVar2;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                x5.v.f188954b.getClass();
                                int i51116 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var2 = new p006l2.a2(0, (Boolean) null, i51116, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            }
                            d92.b.f58623a.getClass();
                            long jD16 = d92.b.a(o0VarE).k().d();
                            sg sgVarD16 = d(o0VarE);
                            int i51117 = i26 & (-264241153);
                            if (i29 != 0) {
                                pVar3 = null;
                            }
                            if (i34 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i37 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            objQ = o0VarE.q();
                            aVar.getClass();
                            h4.r rVar111 = rVar4;
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            rVar5 = rVar111;
                            jVar3 = (a2.j) objQ;
                            pVar7 = pVar6;
                            sgVar3 = sgVarD16;
                            i47 = i51117;
                            r0Var4 = r0Var3;
                            z24 = true;
                            j15 = jD16;
                            num4 = num2;
                            pVar8 = pVar3;
                            z25 = z16;
                            i48 = 4;
                            a2Var4 = a2Var2;
                            i49 = 16384;
                        } else {
                            if (i55 != 0) {
                                rVar4 = h4.r.S;
                            } else {
                                rVar4 = rVar2;
                            }
                            if (i18 != 0) {
                                num2 = null;
                            }
                            if (i24 != 0) {
                                z16 = true;
                            }
                            if (i27 != 0) {
                                x5.v.f188954b.getClass();
                                int i51118 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var2 = new p006l2.a2(0, (Boolean) null, i51118, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            }
                            d92.b.f58623a.getClass();
                            long jD17 = d92.b.a(o0VarE).k().d();
                            sg sgVarD17 = d(o0VarE);
                            int i51119 = i26 & (-264241153);
                            if (i29 != 0) {
                                pVar3 = null;
                            }
                            if (i34 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i37 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            objQ = o0VarE.q();
                            aVar.getClass();
                            h4.r rVar112 = rVar4;
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            rVar5 = rVar112;
                            jVar3 = (a2.j) objQ;
                            pVar7 = pVar6;
                            sgVar3 = sgVarD17;
                            i47 = i51119;
                            r0Var4 = r0Var3;
                            z24 = true;
                            j15 = jD17;
                            num4 = num2;
                            pVar8 = pVar3;
                            z25 = z16;
                            i48 = 4;
                            a2Var4 = a2Var2;
                            i49 = 16384;
                        }
                        o0VarE.h0();
                        p3.x1 x1Var9 = p3.n.f135158a;
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ2 == c2565a) {
                            if (str == null) {
                                str4 = "";
                            } else {
                                str4 = str;
                            }
                            int length9 = str4.length();
                            if (str == null) {
                                str5 = "";
                            } else {
                                str5 = str;
                            }
                            objQ2 = p3.p0.n(s5.w0.a(og.a.l(length9, str5.length())));
                            o0VarE.K(objQ2);
                        }
                        p1Var = (p3.p1) objQ2;
                        long j114 = ((s5.w0) p1Var.getF182175a()).f157317a;
                        if ((i47 & 14) == i48) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        zL = z26 | o0VarE.l(j114);
                        objQ3 = o0VarE.q();
                        if (zL) {
                            objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                            o0VarE.K(objQ3);
                        }
                        x5.l0 l0Var9 = (x5.l0) ((p3.p1) objQ3).getF182175a();
                        if ((57344 & i45) == i49) {
                        }
                        objQ4 = o0VarE.q();
                        if (z27) {
                            objQ4 = new a11.b0(lVar, p1Var, 20);
                            o0VarE.K(objQ4);
                        } else {
                            objQ4 = new a11.b0(lVar, p1Var, 20);
                            o0VarE.K(objQ4);
                        }
                        o0Var = o0VarE;
                        b(l0Var9, rVar5, str3, num4, z25, z24, a2Var4, j15, sgVar3, pVar8, pVar7, r0Var4, jVar3, null, (e23.l) objQ4, o0Var, i47 & 2147483632, i45 & 8190, 0);
                        rVar3 = rVar5;
                        num3 = num4;
                        z19 = z25;
                        z18 = z24;
                        a2Var3 = a2Var4;
                        j14 = j15;
                        sgVar2 = sgVar3;
                        pVar5 = pVar8;
                        pVar4 = pVar7;
                        r0Var2 = r0Var4;
                        jVar2 = jVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        z18 = z15;
                        pVar4 = pVar2;
                        r0Var2 = r0Var;
                        jVar2 = jVar;
                        num3 = num2;
                        rVar3 = rVar2;
                        a2Var3 = a2Var2;
                        pVar5 = pVar3;
                        z19 = z16;
                        j14 = j8;
                        sgVar2 = sgVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: l72.j1
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                p1.a(str, rVar3, str2, num3, z19, z18, a2Var3, j14, sgVar2, pVar5, pVar4, r0Var2, jVar2, lVar, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i26 = i17 | 1769472;
                a2Var2 = a2Var;
                if ((i14 & 12582912) == 0) {
                    i26 |= 4194304;
                }
                if ((i14 & 100663296) == 0) {
                    i26 |= 33554432;
                }
                i29 = i16 & 512;
                if (i29 != 0) {
                    i26 |= C.ENCODING_PCM_32BIT;
                    pVar3 = pVar;
                } else {
                    pVar3 = pVar;
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(pVar3)) {
                            i30 = 536870912;
                        } else {
                            i30 = 268435456;
                        }
                        i26 |= i30;
                    }
                }
                i34 = i16 & 1024;
                if (i34 != 0) {
                    i35 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i36 = 4;
                    } else {
                        i36 = 2;
                    }
                    i35 = i15 | i36;
                } else {
                    i35 = i15;
                }
                i37 = i16 & 2048;
                if (i37 != 0) {
                    i35 |= 48;
                } else if ((i15 & 48) != 0) {
                    if (o0VarE.B(r0Var)) {
                        i38 = 32;
                    } else {
                        i38 = 16;
                    }
                    i35 |= i38;
                }
                i39 = i35;
                i44 = i39 | 384;
                if ((i16 & 8192) != 0) {
                    i45 = i39 | 3456;
                } else if ((i15 & 3072) == 0) {
                    i45 = i44 | (o0VarE.r(null) ? 2048 : 1024);
                } else {
                    i45 = i44;
                }
                if ((i15 & 24576) == 0) {
                    i45 |= o0VarE.r(lVar) ? 16384 : 8192;
                }
                if ((i26 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (o0VarE.n(i26 & 1, z17)) {
                    o0VarE.G0();
                    i46 = i14 & 1;
                    aVar = p3.m.f135153a;
                    if (i46 != 0) {
                        if (i55 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            x5.v.f188954b.getClass();
                            int i511110 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var2 = new p006l2.a2(0, (Boolean) null, i511110, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        }
                        d92.b.f58623a.getClass();
                        long jD18 = d92.b.a(o0VarE).k().d();
                        sg sgVarD18 = d(o0VarE);
                        int i511111 = i26 & (-264241153);
                        if (i29 != 0) {
                            pVar3 = null;
                        }
                        if (i34 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i37 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        objQ = o0VarE.q();
                        aVar.getClass();
                        h4.r rVar113 = rVar4;
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        rVar5 = rVar113;
                        jVar3 = (a2.j) objQ;
                        pVar7 = pVar6;
                        sgVar3 = sgVarD18;
                        i47 = i511111;
                        r0Var4 = r0Var3;
                        z24 = true;
                        j15 = jD18;
                        num4 = num2;
                        pVar8 = pVar3;
                        z25 = z16;
                        i48 = 4;
                        a2Var4 = a2Var2;
                        i49 = 16384;
                    } else {
                        if (i55 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            x5.v.f188954b.getClass();
                            int i511112 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var2 = new p006l2.a2(0, (Boolean) null, i511112, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        }
                        d92.b.f58623a.getClass();
                        long jD19 = d92.b.a(o0VarE).k().d();
                        sg sgVarD19 = d(o0VarE);
                        int i511113 = i26 & (-264241153);
                        if (i29 != 0) {
                            pVar3 = null;
                        }
                        if (i34 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i37 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        objQ = o0VarE.q();
                        aVar.getClass();
                        h4.r rVar114 = rVar4;
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        rVar5 = rVar114;
                        jVar3 = (a2.j) objQ;
                        pVar7 = pVar6;
                        sgVar3 = sgVarD19;
                        i47 = i511113;
                        r0Var4 = r0Var3;
                        z24 = true;
                        j15 = jD19;
                        num4 = num2;
                        pVar8 = pVar3;
                        z25 = z16;
                        i48 = 4;
                        a2Var4 = a2Var2;
                        i49 = 16384;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var10 = p3.n.f135158a;
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        if (str == null) {
                            str4 = "";
                        } else {
                            str4 = str;
                        }
                        int length10 = str4.length();
                        if (str == null) {
                            str5 = "";
                        } else {
                            str5 = str;
                        }
                        objQ2 = p3.p0.n(s5.w0.a(og.a.l(length10, str5.length())));
                        o0VarE.K(objQ2);
                    }
                    p1Var = (p3.p1) objQ2;
                    long j115 = ((s5.w0) p1Var.getF182175a()).f157317a;
                    if ((i47 & 14) == i48) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zL = z26 | o0VarE.l(j115);
                    objQ3 = o0VarE.q();
                    if (zL) {
                        objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                        o0VarE.K(objQ3);
                    }
                    x5.l0 l0Var10 = (x5.l0) ((p3.p1) objQ3).getF182175a();
                    if ((57344 & i45) == i49) {
                    }
                    objQ4 = o0VarE.q();
                    if (z27) {
                        objQ4 = new a11.b0(lVar, p1Var, 20);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new a11.b0(lVar, p1Var, 20);
                        o0VarE.K(objQ4);
                    }
                    o0Var = o0VarE;
                    b(l0Var10, rVar5, str3, num4, z25, z24, a2Var4, j15, sgVar3, pVar8, pVar7, r0Var4, jVar3, null, (e23.l) objQ4, o0Var, i47 & 2147483632, i45 & 8190, 0);
                    rVar3 = rVar5;
                    num3 = num4;
                    z19 = z25;
                    z18 = z24;
                    a2Var3 = a2Var4;
                    j14 = j15;
                    sgVar2 = sgVar3;
                    pVar5 = pVar8;
                    pVar4 = pVar7;
                    r0Var2 = r0Var4;
                    jVar2 = jVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    z18 = z15;
                    pVar4 = pVar2;
                    r0Var2 = r0Var;
                    jVar2 = jVar;
                    num3 = num2;
                    rVar3 = rVar2;
                    a2Var3 = a2Var2;
                    pVar5 = pVar3;
                    z19 = z16;
                    j14 = j8;
                    sgVar2 = sgVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: l72.j1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            p1.a(str, rVar3, str2, num3, z19, z18, a2Var3, j14, sgVar2, pVar5, pVar4, r0Var2, jVar2, lVar, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i17 |= 24576;
            z16 = z14;
            i26 = i17 | 196608;
            i27 = i16 & 64;
            if (i27 != 0) {
                if ((1572864 & i14) == 0) {
                    a2Var2 = a2Var;
                    if (o0VarE.B(a2Var2)) {
                        i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i28 = 524288;
                    }
                    i26 |= i28;
                }
                if ((i14 & 12582912) == 0) {
                    i26 |= 4194304;
                }
                if ((i14 & 100663296) == 0) {
                    i26 |= 33554432;
                }
                i29 = i16 & 512;
                if (i29 != 0) {
                    i26 |= C.ENCODING_PCM_32BIT;
                    pVar3 = pVar;
                } else {
                    pVar3 = pVar;
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(pVar3)) {
                            i30 = 536870912;
                        } else {
                            i30 = 268435456;
                        }
                        i26 |= i30;
                    }
                }
                i34 = i16 & 1024;
                if (i34 != 0) {
                    i35 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i36 = 4;
                    } else {
                        i36 = 2;
                    }
                    i35 = i15 | i36;
                } else {
                    i35 = i15;
                }
                i37 = i16 & 2048;
                if (i37 != 0) {
                    i35 |= 48;
                } else if ((i15 & 48) != 0) {
                    if (o0VarE.B(r0Var)) {
                        i38 = 32;
                    } else {
                        i38 = 16;
                    }
                    i35 |= i38;
                }
                i39 = i35;
                i44 = i39 | 384;
                if ((i16 & 8192) != 0) {
                    i45 = i39 | 3456;
                } else if ((i15 & 3072) == 0) {
                    i45 = i44 | (o0VarE.r(null) ? 2048 : 1024);
                } else {
                    i45 = i44;
                }
                if ((i15 & 24576) == 0) {
                    i45 |= o0VarE.r(lVar) ? 16384 : 8192;
                }
                if ((i26 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (o0VarE.n(i26 & 1, z17)) {
                    o0VarE.G0();
                    i46 = i14 & 1;
                    aVar = p3.m.f135153a;
                    if (i46 != 0) {
                        if (i55 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            x5.v.f188954b.getClass();
                            int i511114 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var2 = new p006l2.a2(0, (Boolean) null, i511114, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        }
                        d92.b.f58623a.getClass();
                        long jD110 = d92.b.a(o0VarE).k().d();
                        sg sgVarD110 = d(o0VarE);
                        int i511115 = i26 & (-264241153);
                        if (i29 != 0) {
                            pVar3 = null;
                        }
                        if (i34 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i37 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        objQ = o0VarE.q();
                        aVar.getClass();
                        h4.r rVar115 = rVar4;
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        rVar5 = rVar115;
                        jVar3 = (a2.j) objQ;
                        pVar7 = pVar6;
                        sgVar3 = sgVarD110;
                        i47 = i511115;
                        r0Var4 = r0Var3;
                        z24 = true;
                        j15 = jD110;
                        num4 = num2;
                        pVar8 = pVar3;
                        z25 = z16;
                        i48 = 4;
                        a2Var4 = a2Var2;
                        i49 = 16384;
                    } else {
                        if (i55 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            x5.v.f188954b.getClass();
                            int i511116 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var2 = new p006l2.a2(0, (Boolean) null, i511116, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        }
                        d92.b.f58623a.getClass();
                        long jD111 = d92.b.a(o0VarE).k().d();
                        sg sgVarD111 = d(o0VarE);
                        int i511117 = i26 & (-264241153);
                        if (i29 != 0) {
                            pVar3 = null;
                        }
                        if (i34 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i37 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        objQ = o0VarE.q();
                        aVar.getClass();
                        h4.r rVar116 = rVar4;
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        rVar5 = rVar116;
                        jVar3 = (a2.j) objQ;
                        pVar7 = pVar6;
                        sgVar3 = sgVarD111;
                        i47 = i511117;
                        r0Var4 = r0Var3;
                        z24 = true;
                        j15 = jD111;
                        num4 = num2;
                        pVar8 = pVar3;
                        z25 = z16;
                        i48 = 4;
                        a2Var4 = a2Var2;
                        i49 = 16384;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var11 = p3.n.f135158a;
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        if (str == null) {
                            str4 = "";
                        } else {
                            str4 = str;
                        }
                        int length11 = str4.length();
                        if (str == null) {
                            str5 = "";
                        } else {
                            str5 = str;
                        }
                        objQ2 = p3.p0.n(s5.w0.a(og.a.l(length11, str5.length())));
                        o0VarE.K(objQ2);
                    }
                    p1Var = (p3.p1) objQ2;
                    long j116 = ((s5.w0) p1Var.getF182175a()).f157317a;
                    if ((i47 & 14) == i48) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zL = z26 | o0VarE.l(j116);
                    objQ3 = o0VarE.q();
                    if (zL) {
                        objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                        o0VarE.K(objQ3);
                    }
                    x5.l0 l0Var11 = (x5.l0) ((p3.p1) objQ3).getF182175a();
                    if ((57344 & i45) == i49) {
                    }
                    objQ4 = o0VarE.q();
                    if (z27) {
                        objQ4 = new a11.b0(lVar, p1Var, 20);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new a11.b0(lVar, p1Var, 20);
                        o0VarE.K(objQ4);
                    }
                    o0Var = o0VarE;
                    b(l0Var11, rVar5, str3, num4, z25, z24, a2Var4, j15, sgVar3, pVar8, pVar7, r0Var4, jVar3, null, (e23.l) objQ4, o0Var, i47 & 2147483632, i45 & 8190, 0);
                    rVar3 = rVar5;
                    num3 = num4;
                    z19 = z25;
                    z18 = z24;
                    a2Var3 = a2Var4;
                    j14 = j15;
                    sgVar2 = sgVar3;
                    pVar5 = pVar8;
                    pVar4 = pVar7;
                    r0Var2 = r0Var4;
                    jVar2 = jVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    z18 = z15;
                    pVar4 = pVar2;
                    r0Var2 = r0Var;
                    jVar2 = jVar;
                    num3 = num2;
                    rVar3 = rVar2;
                    a2Var3 = a2Var2;
                    pVar5 = pVar3;
                    z19 = z16;
                    j14 = j8;
                    sgVar2 = sgVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: l72.j1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            p1.a(str, rVar3, str2, num3, z19, z18, a2Var3, j14, sgVar2, pVar5, pVar4, r0Var2, jVar2, lVar, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i26 = i17 | 1769472;
            a2Var2 = a2Var;
            if ((i14 & 12582912) == 0) {
                i26 |= 4194304;
            }
            if ((i14 & 100663296) == 0) {
                i26 |= 33554432;
            }
            i29 = i16 & 512;
            if (i29 != 0) {
                i26 |= C.ENCODING_PCM_32BIT;
                pVar3 = pVar;
            } else {
                pVar3 = pVar;
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(pVar3)) {
                        i30 = 536870912;
                    } else {
                        i30 = 268435456;
                    }
                    i26 |= i30;
                }
            }
            i34 = i16 & 1024;
            if (i34 != 0) {
                i35 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.r(pVar2)) {
                    i36 = 4;
                } else {
                    i36 = 2;
                }
                i35 = i15 | i36;
            } else {
                i35 = i15;
            }
            i37 = i16 & 2048;
            if (i37 != 0) {
                i35 |= 48;
            } else if ((i15 & 48) != 0) {
                if (o0VarE.B(r0Var)) {
                    i38 = 32;
                } else {
                    i38 = 16;
                }
                i35 |= i38;
            }
            i39 = i35;
            i44 = i39 | 384;
            if ((i16 & 8192) != 0) {
                i45 = i39 | 3456;
            } else if ((i15 & 3072) == 0) {
                i45 = i44 | (o0VarE.r(null) ? 2048 : 1024);
            } else {
                i45 = i44;
            }
            if ((i15 & 24576) == 0) {
                i45 |= o0VarE.r(lVar) ? 16384 : 8192;
            }
            if ((i26 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (o0VarE.n(i26 & 1, z17)) {
                o0VarE.G0();
                i46 = i14 & 1;
                aVar = p3.m.f135153a;
                if (i46 != 0) {
                    if (i55 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i18 != 0) {
                        num2 = null;
                    }
                    if (i24 != 0) {
                        z16 = true;
                    }
                    if (i27 != 0) {
                        x5.v.f188954b.getClass();
                        int i511118 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        a2Var2 = new p006l2.a2(0, (Boolean) null, i511118, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    }
                    d92.b.f58623a.getClass();
                    long jD112 = d92.b.a(o0VarE).k().d();
                    sg sgVarD112 = d(o0VarE);
                    int i511119 = i26 & (-264241153);
                    if (i29 != 0) {
                        pVar3 = null;
                    }
                    if (i34 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i37 != 0) {
                        x5.r0.f188941a.getClass();
                        r0Var3 = x5.r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    objQ = o0VarE.q();
                    aVar.getClass();
                    h4.r rVar117 = rVar4;
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.b(o0VarE);
                    }
                    rVar5 = rVar117;
                    jVar3 = (a2.j) objQ;
                    pVar7 = pVar6;
                    sgVar3 = sgVarD112;
                    i47 = i511119;
                    r0Var4 = r0Var3;
                    z24 = true;
                    j15 = jD112;
                    num4 = num2;
                    pVar8 = pVar3;
                    z25 = z16;
                    i48 = 4;
                    a2Var4 = a2Var2;
                    i49 = 16384;
                } else {
                    if (i55 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i18 != 0) {
                        num2 = null;
                    }
                    if (i24 != 0) {
                        z16 = true;
                    }
                    if (i27 != 0) {
                        x5.v.f188954b.getClass();
                        int i5111110 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        a2Var2 = new p006l2.a2(0, (Boolean) null, i5111110, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    }
                    d92.b.f58623a.getClass();
                    long jD113 = d92.b.a(o0VarE).k().d();
                    sg sgVarD113 = d(o0VarE);
                    int i5111111 = i26 & (-264241153);
                    if (i29 != 0) {
                        pVar3 = null;
                    }
                    if (i34 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i37 != 0) {
                        x5.r0.f188941a.getClass();
                        r0Var3 = x5.r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    objQ = o0VarE.q();
                    aVar.getClass();
                    h4.r rVar118 = rVar4;
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.b(o0VarE);
                    }
                    rVar5 = rVar118;
                    jVar3 = (a2.j) objQ;
                    pVar7 = pVar6;
                    sgVar3 = sgVarD113;
                    i47 = i5111111;
                    r0Var4 = r0Var3;
                    z24 = true;
                    j15 = jD113;
                    num4 = num2;
                    pVar8 = pVar3;
                    z25 = z16;
                    i48 = 4;
                    a2Var4 = a2Var2;
                    i49 = 16384;
                }
                o0VarE.h0();
                p3.x1 x1Var12 = p3.n.f135158a;
                objQ2 = o0VarE.q();
                aVar.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ2 == c2565a) {
                    if (str == null) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    int length12 = str4.length();
                    if (str == null) {
                        str5 = "";
                    } else {
                        str5 = str;
                    }
                    objQ2 = p3.p0.n(s5.w0.a(og.a.l(length12, str5.length())));
                    o0VarE.K(objQ2);
                }
                p1Var = (p3.p1) objQ2;
                long j117 = ((s5.w0) p1Var.getF182175a()).f157317a;
                if ((i47 & 14) == i48) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zL = z26 | o0VarE.l(j117);
                objQ3 = o0VarE.q();
                if (zL) {
                    objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                    o0VarE.K(objQ3);
                }
                x5.l0 l0Var12 = (x5.l0) ((p3.p1) objQ3).getF182175a();
                if ((57344 & i45) == i49) {
                }
                objQ4 = o0VarE.q();
                if (z27) {
                    objQ4 = new a11.b0(lVar, p1Var, 20);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new a11.b0(lVar, p1Var, 20);
                    o0VarE.K(objQ4);
                }
                o0Var = o0VarE;
                b(l0Var12, rVar5, str3, num4, z25, z24, a2Var4, j15, sgVar3, pVar8, pVar7, r0Var4, jVar3, null, (e23.l) objQ4, o0Var, i47 & 2147483632, i45 & 8190, 0);
                rVar3 = rVar5;
                num3 = num4;
                z19 = z25;
                z18 = z24;
                a2Var3 = a2Var4;
                j14 = j15;
                sgVar2 = sgVar3;
                pVar5 = pVar8;
                pVar4 = pVar7;
                r0Var2 = r0Var4;
                jVar2 = jVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z18 = z15;
                pVar4 = pVar2;
                r0Var2 = r0Var;
                jVar2 = jVar;
                num3 = num2;
                rVar3 = rVar2;
                a2Var3 = a2Var2;
                pVar5 = pVar3;
                z19 = z16;
                j14 = j8;
                sgVar2 = sgVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l72.j1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        p1.a(str, rVar3, str2, num3, z19, z18, a2Var3, j14, sgVar2, pVar5, pVar4, r0Var2, jVar2, lVar, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i17 |= 3072;
        num2 = num;
        i24 = i16 & 16;
        if (i24 != 0) {
            if ((i14 & 24576) == 0) {
                z16 = z14;
                if (o0VarE.h(z16)) {
                    i25 = 16384;
                } else {
                    i25 = 8192;
                }
                i17 |= i25;
            }
            i26 = i17 | 196608;
            i27 = i16 & 64;
            if (i27 != 0) {
                if ((1572864 & i14) == 0) {
                    a2Var2 = a2Var;
                    if (o0VarE.B(a2Var2)) {
                        i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i28 = 524288;
                    }
                    i26 |= i28;
                }
                if ((i14 & 12582912) == 0) {
                    i26 |= 4194304;
                }
                if ((i14 & 100663296) == 0) {
                    i26 |= 33554432;
                }
                i29 = i16 & 512;
                if (i29 != 0) {
                    i26 |= C.ENCODING_PCM_32BIT;
                    pVar3 = pVar;
                } else {
                    pVar3 = pVar;
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(pVar3)) {
                            i30 = 536870912;
                        } else {
                            i30 = 268435456;
                        }
                        i26 |= i30;
                    }
                }
                i34 = i16 & 1024;
                if (i34 != 0) {
                    i35 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i36 = 4;
                    } else {
                        i36 = 2;
                    }
                    i35 = i15 | i36;
                } else {
                    i35 = i15;
                }
                i37 = i16 & 2048;
                if (i37 != 0) {
                    i35 |= 48;
                } else if ((i15 & 48) != 0) {
                    if (o0VarE.B(r0Var)) {
                        i38 = 32;
                    } else {
                        i38 = 16;
                    }
                    i35 |= i38;
                }
                i39 = i35;
                i44 = i39 | 384;
                if ((i16 & 8192) != 0) {
                    i45 = i39 | 3456;
                } else if ((i15 & 3072) == 0) {
                    i45 = i44 | (o0VarE.r(null) ? 2048 : 1024);
                } else {
                    i45 = i44;
                }
                if ((i15 & 24576) == 0) {
                    i45 |= o0VarE.r(lVar) ? 16384 : 8192;
                }
                if ((i26 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (o0VarE.n(i26 & 1, z17)) {
                    o0VarE.G0();
                    i46 = i14 & 1;
                    aVar = p3.m.f135153a;
                    if (i46 != 0) {
                        if (i55 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            x5.v.f188954b.getClass();
                            int i5111112 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var2 = new p006l2.a2(0, (Boolean) null, i5111112, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        }
                        d92.b.f58623a.getClass();
                        long jD114 = d92.b.a(o0VarE).k().d();
                        sg sgVarD114 = d(o0VarE);
                        int i5111113 = i26 & (-264241153);
                        if (i29 != 0) {
                            pVar3 = null;
                        }
                        if (i34 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i37 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        objQ = o0VarE.q();
                        aVar.getClass();
                        h4.r rVar119 = rVar4;
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        rVar5 = rVar119;
                        jVar3 = (a2.j) objQ;
                        pVar7 = pVar6;
                        sgVar3 = sgVarD114;
                        i47 = i5111113;
                        r0Var4 = r0Var3;
                        z24 = true;
                        j15 = jD114;
                        num4 = num2;
                        pVar8 = pVar3;
                        z25 = z16;
                        i48 = 4;
                        a2Var4 = a2Var2;
                        i49 = 16384;
                    } else {
                        if (i55 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i18 != 0) {
                            num2 = null;
                        }
                        if (i24 != 0) {
                            z16 = true;
                        }
                        if (i27 != 0) {
                            x5.v.f188954b.getClass();
                            int i5111114 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var2 = new p006l2.a2(0, (Boolean) null, i5111114, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        }
                        d92.b.f58623a.getClass();
                        long jD115 = d92.b.a(o0VarE).k().d();
                        sg sgVarD115 = d(o0VarE);
                        int i5111115 = i26 & (-264241153);
                        if (i29 != 0) {
                            pVar3 = null;
                        }
                        if (i34 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i37 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        objQ = o0VarE.q();
                        aVar.getClass();
                        h4.r rVar1110 = rVar4;
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        rVar5 = rVar1110;
                        jVar3 = (a2.j) objQ;
                        pVar7 = pVar6;
                        sgVar3 = sgVarD115;
                        i47 = i5111115;
                        r0Var4 = r0Var3;
                        z24 = true;
                        j15 = jD115;
                        num4 = num2;
                        pVar8 = pVar3;
                        z25 = z16;
                        i48 = 4;
                        a2Var4 = a2Var2;
                        i49 = 16384;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var13 = p3.n.f135158a;
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        if (str == null) {
                            str4 = "";
                        } else {
                            str4 = str;
                        }
                        int length13 = str4.length();
                        if (str == null) {
                            str5 = "";
                        } else {
                            str5 = str;
                        }
                        objQ2 = p3.p0.n(s5.w0.a(og.a.l(length13, str5.length())));
                        o0VarE.K(objQ2);
                    }
                    p1Var = (p3.p1) objQ2;
                    long j118 = ((s5.w0) p1Var.getF182175a()).f157317a;
                    if ((i47 & 14) == i48) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zL = z26 | o0VarE.l(j118);
                    objQ3 = o0VarE.q();
                    if (zL) {
                        objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                        o0VarE.K(objQ3);
                    }
                    x5.l0 l0Var13 = (x5.l0) ((p3.p1) objQ3).getF182175a();
                    if ((57344 & i45) == i49) {
                    }
                    objQ4 = o0VarE.q();
                    if (z27) {
                        objQ4 = new a11.b0(lVar, p1Var, 20);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new a11.b0(lVar, p1Var, 20);
                        o0VarE.K(objQ4);
                    }
                    o0Var = o0VarE;
                    b(l0Var13, rVar5, str3, num4, z25, z24, a2Var4, j15, sgVar3, pVar8, pVar7, r0Var4, jVar3, null, (e23.l) objQ4, o0Var, i47 & 2147483632, i45 & 8190, 0);
                    rVar3 = rVar5;
                    num3 = num4;
                    z19 = z25;
                    z18 = z24;
                    a2Var3 = a2Var4;
                    j14 = j15;
                    sgVar2 = sgVar3;
                    pVar5 = pVar8;
                    pVar4 = pVar7;
                    r0Var2 = r0Var4;
                    jVar2 = jVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    z18 = z15;
                    pVar4 = pVar2;
                    r0Var2 = r0Var;
                    jVar2 = jVar;
                    num3 = num2;
                    rVar3 = rVar2;
                    a2Var3 = a2Var2;
                    pVar5 = pVar3;
                    z19 = z16;
                    j14 = j8;
                    sgVar2 = sgVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: l72.j1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            p1.a(str, rVar3, str2, num3, z19, z18, a2Var3, j14, sgVar2, pVar5, pVar4, r0Var2, jVar2, lVar, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i26 = i17 | 1769472;
            a2Var2 = a2Var;
            if ((i14 & 12582912) == 0) {
                i26 |= 4194304;
            }
            if ((i14 & 100663296) == 0) {
                i26 |= 33554432;
            }
            i29 = i16 & 512;
            if (i29 != 0) {
                i26 |= C.ENCODING_PCM_32BIT;
                pVar3 = pVar;
            } else {
                pVar3 = pVar;
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(pVar3)) {
                        i30 = 536870912;
                    } else {
                        i30 = 268435456;
                    }
                    i26 |= i30;
                }
            }
            i34 = i16 & 1024;
            if (i34 != 0) {
                i35 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.r(pVar2)) {
                    i36 = 4;
                } else {
                    i36 = 2;
                }
                i35 = i15 | i36;
            } else {
                i35 = i15;
            }
            i37 = i16 & 2048;
            if (i37 != 0) {
                i35 |= 48;
            } else if ((i15 & 48) != 0) {
                if (o0VarE.B(r0Var)) {
                    i38 = 32;
                } else {
                    i38 = 16;
                }
                i35 |= i38;
            }
            i39 = i35;
            i44 = i39 | 384;
            if ((i16 & 8192) != 0) {
                i45 = i39 | 3456;
            } else if ((i15 & 3072) == 0) {
                i45 = i44 | (o0VarE.r(null) ? 2048 : 1024);
            } else {
                i45 = i44;
            }
            if ((i15 & 24576) == 0) {
                i45 |= o0VarE.r(lVar) ? 16384 : 8192;
            }
            if ((i26 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (o0VarE.n(i26 & 1, z17)) {
                o0VarE.G0();
                i46 = i14 & 1;
                aVar = p3.m.f135153a;
                if (i46 != 0) {
                    if (i55 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i18 != 0) {
                        num2 = null;
                    }
                    if (i24 != 0) {
                        z16 = true;
                    }
                    if (i27 != 0) {
                        x5.v.f188954b.getClass();
                        int i5111116 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        a2Var2 = new p006l2.a2(0, (Boolean) null, i5111116, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    }
                    d92.b.f58623a.getClass();
                    long jD116 = d92.b.a(o0VarE).k().d();
                    sg sgVarD116 = d(o0VarE);
                    int i5111117 = i26 & (-264241153);
                    if (i29 != 0) {
                        pVar3 = null;
                    }
                    if (i34 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i37 != 0) {
                        x5.r0.f188941a.getClass();
                        r0Var3 = x5.r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    objQ = o0VarE.q();
                    aVar.getClass();
                    h4.r rVar1111 = rVar4;
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.b(o0VarE);
                    }
                    rVar5 = rVar1111;
                    jVar3 = (a2.j) objQ;
                    pVar7 = pVar6;
                    sgVar3 = sgVarD116;
                    i47 = i5111117;
                    r0Var4 = r0Var3;
                    z24 = true;
                    j15 = jD116;
                    num4 = num2;
                    pVar8 = pVar3;
                    z25 = z16;
                    i48 = 4;
                    a2Var4 = a2Var2;
                    i49 = 16384;
                } else {
                    if (i55 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i18 != 0) {
                        num2 = null;
                    }
                    if (i24 != 0) {
                        z16 = true;
                    }
                    if (i27 != 0) {
                        x5.v.f188954b.getClass();
                        int i5111118 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        a2Var2 = new p006l2.a2(0, (Boolean) null, i5111118, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    }
                    d92.b.f58623a.getClass();
                    long jD117 = d92.b.a(o0VarE).k().d();
                    sg sgVarD117 = d(o0VarE);
                    int i5111119 = i26 & (-264241153);
                    if (i29 != 0) {
                        pVar3 = null;
                    }
                    if (i34 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i37 != 0) {
                        x5.r0.f188941a.getClass();
                        r0Var3 = x5.r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    objQ = o0VarE.q();
                    aVar.getClass();
                    h4.r rVar1112 = rVar4;
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.b(o0VarE);
                    }
                    rVar5 = rVar1112;
                    jVar3 = (a2.j) objQ;
                    pVar7 = pVar6;
                    sgVar3 = sgVarD117;
                    i47 = i5111119;
                    r0Var4 = r0Var3;
                    z24 = true;
                    j15 = jD117;
                    num4 = num2;
                    pVar8 = pVar3;
                    z25 = z16;
                    i48 = 4;
                    a2Var4 = a2Var2;
                    i49 = 16384;
                }
                o0VarE.h0();
                p3.x1 x1Var14 = p3.n.f135158a;
                objQ2 = o0VarE.q();
                aVar.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ2 == c2565a) {
                    if (str == null) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    int length14 = str4.length();
                    if (str == null) {
                        str5 = "";
                    } else {
                        str5 = str;
                    }
                    objQ2 = p3.p0.n(s5.w0.a(og.a.l(length14, str5.length())));
                    o0VarE.K(objQ2);
                }
                p1Var = (p3.p1) objQ2;
                long j119 = ((s5.w0) p1Var.getF182175a()).f157317a;
                if ((i47 & 14) == i48) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zL = z26 | o0VarE.l(j119);
                objQ3 = o0VarE.q();
                if (zL) {
                    objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                    o0VarE.K(objQ3);
                }
                x5.l0 l0Var14 = (x5.l0) ((p3.p1) objQ3).getF182175a();
                if ((57344 & i45) == i49) {
                }
                objQ4 = o0VarE.q();
                if (z27) {
                    objQ4 = new a11.b0(lVar, p1Var, 20);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new a11.b0(lVar, p1Var, 20);
                    o0VarE.K(objQ4);
                }
                o0Var = o0VarE;
                b(l0Var14, rVar5, str3, num4, z25, z24, a2Var4, j15, sgVar3, pVar8, pVar7, r0Var4, jVar3, null, (e23.l) objQ4, o0Var, i47 & 2147483632, i45 & 8190, 0);
                rVar3 = rVar5;
                num3 = num4;
                z19 = z25;
                z18 = z24;
                a2Var3 = a2Var4;
                j14 = j15;
                sgVar2 = sgVar3;
                pVar5 = pVar8;
                pVar4 = pVar7;
                r0Var2 = r0Var4;
                jVar2 = jVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z18 = z15;
                pVar4 = pVar2;
                r0Var2 = r0Var;
                jVar2 = jVar;
                num3 = num2;
                rVar3 = rVar2;
                a2Var3 = a2Var2;
                pVar5 = pVar3;
                z19 = z16;
                j14 = j8;
                sgVar2 = sgVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l72.j1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        p1.a(str, rVar3, str2, num3, z19, z18, a2Var3, j14, sgVar2, pVar5, pVar4, r0Var2, jVar2, lVar, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i17 |= 24576;
        z16 = z14;
        i26 = i17 | 196608;
        i27 = i16 & 64;
        if (i27 != 0) {
            if ((1572864 & i14) == 0) {
                a2Var2 = a2Var;
                if (o0VarE.B(a2Var2)) {
                    i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i28 = 524288;
                }
                i26 |= i28;
            }
            if ((i14 & 12582912) == 0) {
                i26 |= 4194304;
            }
            if ((i14 & 100663296) == 0) {
                i26 |= 33554432;
            }
            i29 = i16 & 512;
            if (i29 != 0) {
                i26 |= C.ENCODING_PCM_32BIT;
                pVar3 = pVar;
            } else {
                pVar3 = pVar;
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(pVar3)) {
                        i30 = 536870912;
                    } else {
                        i30 = 268435456;
                    }
                    i26 |= i30;
                }
            }
            i34 = i16 & 1024;
            if (i34 != 0) {
                i35 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.r(pVar2)) {
                    i36 = 4;
                } else {
                    i36 = 2;
                }
                i35 = i15 | i36;
            } else {
                i35 = i15;
            }
            i37 = i16 & 2048;
            if (i37 != 0) {
                i35 |= 48;
            } else if ((i15 & 48) != 0) {
                if (o0VarE.B(r0Var)) {
                    i38 = 32;
                } else {
                    i38 = 16;
                }
                i35 |= i38;
            }
            i39 = i35;
            i44 = i39 | 384;
            if ((i16 & 8192) != 0) {
                i45 = i39 | 3456;
            } else if ((i15 & 3072) == 0) {
                i45 = i44 | (o0VarE.r(null) ? 2048 : 1024);
            } else {
                i45 = i44;
            }
            if ((i15 & 24576) == 0) {
                i45 |= o0VarE.r(lVar) ? 16384 : 8192;
            }
            if ((i26 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (o0VarE.n(i26 & 1, z17)) {
                o0VarE.G0();
                i46 = i14 & 1;
                aVar = p3.m.f135153a;
                if (i46 != 0) {
                    if (i55 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i18 != 0) {
                        num2 = null;
                    }
                    if (i24 != 0) {
                        z16 = true;
                    }
                    if (i27 != 0) {
                        x5.v.f188954b.getClass();
                        int i51111110 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        a2Var2 = new p006l2.a2(0, (Boolean) null, i51111110, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    }
                    d92.b.f58623a.getClass();
                    long jD118 = d92.b.a(o0VarE).k().d();
                    sg sgVarD118 = d(o0VarE);
                    int i51111111 = i26 & (-264241153);
                    if (i29 != 0) {
                        pVar3 = null;
                    }
                    if (i34 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i37 != 0) {
                        x5.r0.f188941a.getClass();
                        r0Var3 = x5.r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    objQ = o0VarE.q();
                    aVar.getClass();
                    h4.r rVar1113 = rVar4;
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.b(o0VarE);
                    }
                    rVar5 = rVar1113;
                    jVar3 = (a2.j) objQ;
                    pVar7 = pVar6;
                    sgVar3 = sgVarD118;
                    i47 = i51111111;
                    r0Var4 = r0Var3;
                    z24 = true;
                    j15 = jD118;
                    num4 = num2;
                    pVar8 = pVar3;
                    z25 = z16;
                    i48 = 4;
                    a2Var4 = a2Var2;
                    i49 = 16384;
                } else {
                    if (i55 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i18 != 0) {
                        num2 = null;
                    }
                    if (i24 != 0) {
                        z16 = true;
                    }
                    if (i27 != 0) {
                        x5.v.f188954b.getClass();
                        int i51111112 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        a2Var2 = new p006l2.a2(0, (Boolean) null, i51111112, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    }
                    d92.b.f58623a.getClass();
                    long jD119 = d92.b.a(o0VarE).k().d();
                    sg sgVarD119 = d(o0VarE);
                    int i51111113 = i26 & (-264241153);
                    if (i29 != 0) {
                        pVar3 = null;
                    }
                    if (i34 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i37 != 0) {
                        x5.r0.f188941a.getClass();
                        r0Var3 = x5.r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    objQ = o0VarE.q();
                    aVar.getClass();
                    h4.r rVar1114 = rVar4;
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.b(o0VarE);
                    }
                    rVar5 = rVar1114;
                    jVar3 = (a2.j) objQ;
                    pVar7 = pVar6;
                    sgVar3 = sgVarD119;
                    i47 = i51111113;
                    r0Var4 = r0Var3;
                    z24 = true;
                    j15 = jD119;
                    num4 = num2;
                    pVar8 = pVar3;
                    z25 = z16;
                    i48 = 4;
                    a2Var4 = a2Var2;
                    i49 = 16384;
                }
                o0VarE.h0();
                p3.x1 x1Var15 = p3.n.f135158a;
                objQ2 = o0VarE.q();
                aVar.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ2 == c2565a) {
                    if (str == null) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    int length15 = str4.length();
                    if (str == null) {
                        str5 = "";
                    } else {
                        str5 = str;
                    }
                    objQ2 = p3.p0.n(s5.w0.a(og.a.l(length15, str5.length())));
                    o0VarE.K(objQ2);
                }
                p1Var = (p3.p1) objQ2;
                long j1110 = ((s5.w0) p1Var.getF182175a()).f157317a;
                if ((i47 & 14) == i48) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zL = z26 | o0VarE.l(j1110);
                objQ3 = o0VarE.q();
                if (zL) {
                    objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                    o0VarE.K(objQ3);
                }
                x5.l0 l0Var15 = (x5.l0) ((p3.p1) objQ3).getF182175a();
                if ((57344 & i45) == i49) {
                }
                objQ4 = o0VarE.q();
                if (z27) {
                    objQ4 = new a11.b0(lVar, p1Var, 20);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new a11.b0(lVar, p1Var, 20);
                    o0VarE.K(objQ4);
                }
                o0Var = o0VarE;
                b(l0Var15, rVar5, str3, num4, z25, z24, a2Var4, j15, sgVar3, pVar8, pVar7, r0Var4, jVar3, null, (e23.l) objQ4, o0Var, i47 & 2147483632, i45 & 8190, 0);
                rVar3 = rVar5;
                num3 = num4;
                z19 = z25;
                z18 = z24;
                a2Var3 = a2Var4;
                j14 = j15;
                sgVar2 = sgVar3;
                pVar5 = pVar8;
                pVar4 = pVar7;
                r0Var2 = r0Var4;
                jVar2 = jVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z18 = z15;
                pVar4 = pVar2;
                r0Var2 = r0Var;
                jVar2 = jVar;
                num3 = num2;
                rVar3 = rVar2;
                a2Var3 = a2Var2;
                pVar5 = pVar3;
                z19 = z16;
                j14 = j8;
                sgVar2 = sgVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l72.j1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        p1.a(str, rVar3, str2, num3, z19, z18, a2Var3, j14, sgVar2, pVar5, pVar4, r0Var2, jVar2, lVar, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i26 = i17 | 1769472;
        a2Var2 = a2Var;
        if ((i14 & 12582912) == 0) {
            i26 |= 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i26 |= 33554432;
        }
        i29 = i16 & 512;
        if (i29 != 0) {
            i26 |= C.ENCODING_PCM_32BIT;
            pVar3 = pVar;
        } else {
            pVar3 = pVar;
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(pVar3)) {
                    i30 = 536870912;
                } else {
                    i30 = 268435456;
                }
                i26 |= i30;
            }
        }
        i34 = i16 & 1024;
        if (i34 != 0) {
            i35 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            if (o0VarE.r(pVar2)) {
                i36 = 4;
            } else {
                i36 = 2;
            }
            i35 = i15 | i36;
        } else {
            i35 = i15;
        }
        i37 = i16 & 2048;
        if (i37 != 0) {
            i35 |= 48;
        } else if ((i15 & 48) != 0) {
            if (o0VarE.B(r0Var)) {
                i38 = 32;
            } else {
                i38 = 16;
            }
            i35 |= i38;
        }
        i39 = i35;
        i44 = i39 | 384;
        if ((i16 & 8192) != 0) {
            i45 = i39 | 3456;
        } else if ((i15 & 3072) == 0) {
            i45 = i44 | (o0VarE.r(null) ? 2048 : 1024);
        } else {
            i45 = i44;
        }
        if ((i15 & 24576) == 0) {
            i45 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if ((i26 & 306783379) == 306783378) {
            z17 = true;
        } else {
            z17 = true;
        }
        if (o0VarE.n(i26 & 1, z17)) {
            o0VarE.G0();
            i46 = i14 & 1;
            aVar = p3.m.f135153a;
            if (i46 != 0) {
                if (i55 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i18 != 0) {
                    num2 = null;
                }
                if (i24 != 0) {
                    z16 = true;
                }
                if (i27 != 0) {
                    x5.v.f188954b.getClass();
                    int i51111114 = x5.v.f188955c;
                    x5.p.f188918b.getClass();
                    a2Var2 = new p006l2.a2(0, (Boolean) null, i51111114, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                }
                d92.b.f58623a.getClass();
                long jD1110 = d92.b.a(o0VarE).k().d();
                sg sgVarD1110 = d(o0VarE);
                int i51111115 = i26 & (-264241153);
                if (i29 != 0) {
                    pVar3 = null;
                }
                if (i34 != 0) {
                    pVar6 = null;
                } else {
                    pVar6 = pVar2;
                }
                if (i37 != 0) {
                    x5.r0.f188941a.getClass();
                    r0Var3 = x5.r0.a.f188943b;
                } else {
                    r0Var3 = r0Var;
                }
                objQ = o0VarE.q();
                aVar.getClass();
                h4.r rVar1115 = rVar4;
                if (objQ == p3.m.a.f135155b) {
                    objQ = kg.f.b(o0VarE);
                }
                rVar5 = rVar1115;
                jVar3 = (a2.j) objQ;
                pVar7 = pVar6;
                sgVar3 = sgVarD1110;
                i47 = i51111115;
                r0Var4 = r0Var3;
                z24 = true;
                j15 = jD1110;
                num4 = num2;
                pVar8 = pVar3;
                z25 = z16;
                i48 = 4;
                a2Var4 = a2Var2;
                i49 = 16384;
            } else {
                if (i55 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i18 != 0) {
                    num2 = null;
                }
                if (i24 != 0) {
                    z16 = true;
                }
                if (i27 != 0) {
                    x5.v.f188954b.getClass();
                    int i51111116 = x5.v.f188955c;
                    x5.p.f188918b.getClass();
                    a2Var2 = new p006l2.a2(0, (Boolean) null, i51111116, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                }
                d92.b.f58623a.getClass();
                long jD1111 = d92.b.a(o0VarE).k().d();
                sg sgVarD1111 = d(o0VarE);
                int i51111117 = i26 & (-264241153);
                if (i29 != 0) {
                    pVar3 = null;
                }
                if (i34 != 0) {
                    pVar6 = null;
                } else {
                    pVar6 = pVar2;
                }
                if (i37 != 0) {
                    x5.r0.f188941a.getClass();
                    r0Var3 = x5.r0.a.f188943b;
                } else {
                    r0Var3 = r0Var;
                }
                objQ = o0VarE.q();
                aVar.getClass();
                h4.r rVar1116 = rVar4;
                if (objQ == p3.m.a.f135155b) {
                    objQ = kg.f.b(o0VarE);
                }
                rVar5 = rVar1116;
                jVar3 = (a2.j) objQ;
                pVar7 = pVar6;
                sgVar3 = sgVarD1111;
                i47 = i51111117;
                r0Var4 = r0Var3;
                z24 = true;
                j15 = jD1111;
                num4 = num2;
                pVar8 = pVar3;
                z25 = z16;
                i48 = 4;
                a2Var4 = a2Var2;
                i49 = 16384;
            }
            o0VarE.h0();
            p3.x1 x1Var16 = p3.n.f135158a;
            objQ2 = o0VarE.q();
            aVar.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                if (str == null) {
                    str4 = "";
                } else {
                    str4 = str;
                }
                int length16 = str4.length();
                if (str == null) {
                    str5 = "";
                } else {
                    str5 = str;
                }
                objQ2 = p3.p0.n(s5.w0.a(og.a.l(length16, str5.length())));
                o0VarE.K(objQ2);
            }
            p1Var = (p3.p1) objQ2;
            long j1111 = ((s5.w0) p1Var.getF182175a()).f157317a;
            if ((i47 & 14) == i48) {
                z26 = true;
            } else {
                z26 = false;
            }
            zL = z26 | o0VarE.l(j1111);
            objQ3 = o0VarE.q();
            if (zL) {
                objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                o0VarE.K(objQ3);
            } else {
                objQ3 = p3.p0.n(new x5.l0(str != null ? str : "", ((s5.w0) p1Var.getF182175a()).f157317a, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                o0VarE.K(objQ3);
            }
            x5.l0 l0Var16 = (x5.l0) ((p3.p1) objQ3).getF182175a();
            if ((57344 & i45) == i49) {
            }
            objQ4 = o0VarE.q();
            if (z27) {
                objQ4 = new a11.b0(lVar, p1Var, 20);
                o0VarE.K(objQ4);
            } else {
                objQ4 = new a11.b0(lVar, p1Var, 20);
                o0VarE.K(objQ4);
            }
            o0Var = o0VarE;
            b(l0Var16, rVar5, str3, num4, z25, z24, a2Var4, j15, sgVar3, pVar8, pVar7, r0Var4, jVar3, null, (e23.l) objQ4, o0Var, i47 & 2147483632, i45 & 8190, 0);
            rVar3 = rVar5;
            num3 = num4;
            z19 = z25;
            z18 = z24;
            a2Var3 = a2Var4;
            j14 = j15;
            sgVar2 = sgVar3;
            pVar5 = pVar8;
            pVar4 = pVar7;
            r0Var2 = r0Var4;
            jVar2 = jVar3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z18 = z15;
            pVar4 = pVar2;
            r0Var2 = r0Var;
            jVar2 = jVar;
            num3 = num2;
            rVar3 = rVar2;
            a2Var3 = a2Var2;
            pVar5 = pVar3;
            z19 = z16;
            j14 = j8;
            sgVar2 = sgVar;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: l72.j1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    p1.a(str, rVar3, str2, num3, z19, z18, a2Var3, j14, sgVar2, pVar5, pVar4, r0Var2, jVar2, lVar, (p3.m) obj, iT, iT2, i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x012c  */
    /* JADX WARN: Code duplicated, block: B:104:0x012f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0137  */
    /* JADX WARN: Code duplicated, block: B:109:0x013e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0142  */
    /* JADX WARN: Code duplicated, block: B:113:0x014c  */
    /* JADX WARN: Code duplicated, block: B:114:0x014f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0154  */
    /* JADX WARN: Code duplicated, block: B:119:0x015e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0165  */
    /* JADX WARN: Code duplicated, block: B:123:0x0169  */
    /* JADX WARN: Code duplicated, block: B:125:0x0173  */
    /* JADX WARN: Code duplicated, block: B:126:0x0176  */
    /* JADX WARN: Code duplicated, block: B:128:0x017b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0186  */
    /* JADX WARN: Code duplicated, block: B:132:0x0189  */
    /* JADX WARN: Code duplicated, block: B:134:0x018f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0197  */
    /* JADX WARN: Code duplicated, block: B:137:0x019a  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:143:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:148:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:153:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:159:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:162:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:169:0x0200  */
    /* JADX WARN: Code duplicated, block: B:171:0x0207  */
    /* JADX WARN: Code duplicated, block: B:176:0x022a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x022c  */
    /* JADX WARN: Code duplicated, block: B:178:0x022f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0233  */
    /* JADX WARN: Code duplicated, block: B:182:0x0235  */
    /* JADX WARN: Code duplicated, block: B:184:0x0239  */
    /* JADX WARN: Code duplicated, block: B:186:0x023c  */
    /* JADX WARN: Code duplicated, block: B:189:0x0241  */
    /* JADX WARN: Code duplicated, block: B:191:0x0245  */
    /* JADX WARN: Code duplicated, block: B:192:0x0267  */
    /* JADX WARN: Code duplicated, block: B:195:0x026d  */
    /* JADX WARN: Code duplicated, block: B:198:0x0283  */
    /* JADX WARN: Code duplicated, block: B:200:0x028a  */
    /* JADX WARN: Code duplicated, block: B:201:0x028c  */
    /* JADX WARN: Code duplicated, block: B:203:0x0290  */
    /* JADX WARN: Code duplicated, block: B:204:0x0292  */
    /* JADX WARN: Code duplicated, block: B:206:0x0296  */
    /* JADX WARN: Code duplicated, block: B:207:0x029e  */
    /* JADX WARN: Code duplicated, block: B:209:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:211:0x02af  */
    /* JADX WARN: Code duplicated, block: B:213:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:216:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:217:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:220:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:221:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:223:0x0348  */
    /* JADX WARN: Code duplicated, block: B:226:0x0365  */
    /* JADX WARN: Code duplicated, block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    /* JADX WARN: Code duplicated, block: B:99:0x011e  */
    public static final void b(final x5.l0 l0Var, @SuppressLint({"ModifierParameter"}) h4.r rVar, String str, Integer num, boolean z14, boolean z15, p006l2.a2 a2Var, long j8, sg sgVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, x5.r0 r0Var, a2.j jVar, e23.l<? super m4.g0, Unit> lVar, final e23.l<? super x5.l0, Unit> lVar2, p3.m mVar, final int i14, final int i15, final int i16) {
        int i17;
        h4.r rVar2;
        int i18;
        int i19;
        int i24;
        Integer num2;
        int i25;
        int i26;
        boolean z16;
        int i27;
        int i28;
        boolean z17;
        int i29;
        int i30;
        p006l2.a2 a2Var2;
        int i34;
        long jD;
        sg sgVarD;
        int i35;
        int i36;
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
        boolean z18;
        p3.o0 o0Var;
        final String str2;
        final e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        final Integer num3;
        final boolean z19;
        final boolean z24;
        final p006l2.a2 a2Var3;
        h4.r rVar3;
        final sg sgVar2;
        final long j14;
        final e23.p<? super p3.m, ? super Integer, Unit> pVar4;
        final x5.r0 r0Var2;
        final a2.j jVar2;
        final e23.l<? super m4.g0, Unit> lVar3;
        p3.p2 p2VarI0;
        String str3;
        p006l2.a2 a2Var4;
        e23.p<? super p3.m, ? super Integer, Unit> pVar5;
        e23.p<? super p3.m, ? super Integer, Unit> pVar6;
        x5.r0 r0Var3;
        a2.j jVar3;
        final x5.r0 r0Var4;
        final a2.j jVar4;
        final sg sgVar3;
        final long j15;
        final boolean z25;
        final p006l2.a2 a2Var5;
        final Integer num4;
        final boolean z26;
        final e23.p<? super p3.m, ? super Integer, Unit> pVar7;
        final e23.p<? super p3.m, ? super Integer, Unit> pVar8;
        final e23.l<? super m4.g0, Unit> lVar4;
        Object objQ;
        final String str4;
        int i59;
        lVar2.getClass();
        p3.o0 o0VarE = mVar.E(231227594);
        if ((i14 & 6) == 0) {
            i17 = (o0VarE.B(l0Var) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        int i64 = i16 & 2;
        if (i64 == 0) {
            if ((i14 & 48) == 0) {
                rVar2 = rVar;
                i17 |= o0VarE.B(rVar2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i14 & 384) == 0) {
                    if (o0VarE.B(str)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i24 = i16 & 8;
                if (i24 != 0) {
                    if ((i14 & 3072) == 0) {
                        num2 = num;
                        if (o0VarE.B(num2)) {
                            i25 = 2048;
                        } else {
                            i25 = 1024;
                        }
                        i17 |= i25;
                    }
                    i26 = i16 & 16;
                    if (i26 != 0) {
                        if ((i14 & 24576) == 0) {
                            z16 = z14;
                            if (o0VarE.h(z16)) {
                                i27 = 16384;
                            } else {
                                i27 = 8192;
                            }
                            i17 |= i27;
                        }
                        i28 = i16 & 32;
                        if (i28 != 0) {
                            i17 |= 196608;
                            z17 = z15;
                        } else {
                            z17 = z15;
                            if ((i14 & 196608) == 0) {
                                if (o0VarE.h(z17)) {
                                    i29 = 131072;
                                } else {
                                    i29 = 65536;
                                }
                                i17 |= i29;
                            }
                        }
                        i30 = i16 & 64;
                        if (i30 != 0) {
                            i17 |= 1572864;
                            a2Var2 = a2Var;
                        } else {
                            a2Var2 = a2Var;
                            if ((i14 & 1572864) == 0) {
                                if (o0VarE.B(a2Var2)) {
                                    i34 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                } else {
                                    i34 = 524288;
                                }
                                i17 |= i34;
                            }
                        }
                        if ((i14 & 12582912) == 0) {
                            jD = j8;
                            if ((i16 & 128) == 0 || !o0VarE.l(jD)) {
                                i59 = 4194304;
                            } else {
                                i59 = 8388608;
                            }
                            i17 |= i59;
                        } else {
                            jD = j8;
                        }
                        if ((i14 & 100663296) == 0) {
                            if ((i16 & 256) == 0) {
                                sgVarD = sgVar;
                                int i65 = o0VarE.B(sgVarD) ? 67108864 : 33554432;
                                i17 |= i65;
                            } else {
                                sgVarD = sgVar;
                            }
                            i17 |= i65;
                        } else {
                            sgVarD = sgVar;
                        }
                        i35 = i16 & 512;
                        if (i35 != 0) {
                            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                                if (o0VarE.r(pVar)) {
                                    i36 = 536870912;
                                } else {
                                    i36 = 268435456;
                                }
                                i17 |= i36;
                            }
                            i37 = i16 & 1024;
                            if (i37 != 0) {
                                i38 = i15 | 6;
                            } else if ((i15 & 6) == 0) {
                                if (o0VarE.r(pVar2)) {
                                    i39 = 4;
                                } else {
                                    i39 = 2;
                                }
                                i38 = i15 | i39;
                            } else {
                                i38 = i15;
                            }
                            i44 = i16 & 2048;
                            if (i44 != 0) {
                                i38 |= 48;
                            } else if ((i15 & 48) != 0) {
                                if (o0VarE.B(r0Var)) {
                                    i45 = 32;
                                } else {
                                    i45 = 16;
                                }
                                i38 |= i45;
                            }
                            i46 = i38;
                            i47 = i17;
                            i48 = i16 & 4096;
                            if (i48 != 0) {
                                i54 = i46 | 384;
                            } else {
                                i49 = i46;
                                if ((i15 & 384) != 0) {
                                    if (o0VarE.B(jVar)) {
                                        i55 = 256;
                                    } else {
                                        i55 = 128;
                                    }
                                    i49 |= i55;
                                }
                                i54 = i49;
                            }
                            i56 = i16 & 8192;
                            if (i56 != 0) {
                                i58 = i54 | 3072;
                            } else {
                                i57 = i54;
                                if ((i15 & 3072) == 0) {
                                    i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                                } else {
                                    i58 = i57;
                                }
                            }
                            if ((i15 & 24576) != 0) {
                                i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                            }
                            int i66 = i58;
                            if ((i47 & 306783379) == 306783378 || (i66 & 9363) != 9362) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (o0VarE.n(i47 & 1, z18)) {
                                o0VarE.G0();
                                if ((i14 & 1) != 0 || o0VarE.o0()) {
                                    if (i64 != 0) {
                                        rVar3 = h4.r.S;
                                    } else {
                                        rVar3 = rVar2;
                                    }
                                    if (i18 != 0) {
                                        str3 = null;
                                    } else {
                                        str3 = str;
                                    }
                                    if (i24 != 0) {
                                        num2 = null;
                                    }
                                    if (i26 != 0) {
                                        z16 = true;
                                    }
                                    boolean z27 = i28 == 0 ? z17 : true;
                                    if (i30 != 0) {
                                        x5.v.f188954b.getClass();
                                        int i67 = x5.v.f188955c;
                                        x5.p.f188918b.getClass();
                                        a2Var4 = new p006l2.a2(0, (Boolean) null, i67, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                                    } else {
                                        a2Var4 = a2Var2;
                                    }
                                    if ((i16 & 128) != 0) {
                                        d92.b.f58623a.getClass();
                                        jD = d92.b.a(o0VarE).k().d();
                                    }
                                    if ((i16 & 256) != 0) {
                                        sgVarD = d(o0VarE);
                                    }
                                    if (i35 != 0) {
                                        pVar5 = null;
                                    } else {
                                        pVar5 = pVar;
                                    }
                                    if (i37 != 0) {
                                        pVar6 = null;
                                    } else {
                                        pVar6 = pVar2;
                                    }
                                    if (i44 != 0) {
                                        x5.r0.f188941a.getClass();
                                        r0Var3 = x5.r0.a.f188943b;
                                    } else {
                                        r0Var3 = r0Var;
                                    }
                                    if (i48 != 0) {
                                        objQ = o0VarE.q();
                                        p3.m.f135153a.getClass();
                                        if (objQ == p3.m.a.f135155b) {
                                            objQ = kg.f.b(o0VarE);
                                        }
                                        jVar3 = (a2.j) objQ;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    r0Var4 = r0Var3;
                                    jVar4 = jVar3;
                                    sgVar3 = sgVarD;
                                    j15 = jD;
                                    z25 = z27;
                                    if (i56 != 0) {
                                        a2Var5 = a2Var4;
                                        num4 = num2;
                                        z26 = z16;
                                        pVar7 = pVar5;
                                        pVar8 = pVar6;
                                        lVar4 = null;
                                    } else {
                                        a2Var5 = a2Var4;
                                        num4 = num2;
                                        z26 = z16;
                                        pVar7 = pVar5;
                                        pVar8 = pVar6;
                                    }
                                    o0VarE.h0();
                                    p3.x1 x1Var = p3.n.f135158a;
                                    final m4.q qVar = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                                    if (str3 == null) {
                                        str4 = "";
                                    } else {
                                        str4 = str3;
                                    }
                                    ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                                        /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                                        /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                                        /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                                        @Override // e23.p
                                        public final Object invoke(Object obj, Object obj2) {
                                            p3.m mVar2 = (p3.m) obj;
                                            int iIntValue = ((Integer) obj2).intValue();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                p3.x1 x1Var2 = p3.n.f135158a;
                                                g6.f.a aVar = g6.f.f75994b;
                                                h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                                e23.l lVar5 = lVar4;
                                                boolean zB = mVar2.B(lVar5);
                                                Object objQ2 = mVar2.q();
                                                p3.m.a aVar2 = p3.m.f135153a;
                                                if (zB) {
                                                    objQ2 = new k11.n(lVar5, 7);
                                                    mVar2.K(objQ2);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        objQ2 = new k11.n(lVar5, 7);
                                                        mVar2.K(objQ2);
                                                    }
                                                }
                                                h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                                m4.q qVar2 = qVar;
                                                boolean zR = mVar2.r(qVar2);
                                                Object objQ3 = mVar2.q();
                                                if (zR) {
                                                    objQ3 = new b82.k0(qVar2, 6);
                                                    mVar2.K(objQ3);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ3 == p3.m.a.f135155b) {
                                                        objQ3 = new b82.k0(qVar2, 6);
                                                        mVar2.K(objQ3);
                                                    }
                                                }
                                                p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58624b.getClass();
                                                s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                                boolean z28 = z25;
                                                if (!z28) {
                                                    x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                                }
                                                Integer num5 = num4;
                                                boolean zB2 = mVar2.B(num5);
                                                e23.l lVar6 = lVar2;
                                                boolean zB3 = zB2 | mVar2.B(lVar6);
                                                Object objQ4 = mVar2.q();
                                                if (zB3) {
                                                    objQ4 = new i1(lVar6, 1, num5);
                                                    mVar2.K(objQ4);
                                                } else {
                                                    aVar2.getClass();
                                                    if (objQ4 == p3.m.a.f135155b) {
                                                        objQ4 = new i1(lVar6, 1, num5);
                                                        mVar2.K(objQ4);
                                                    }
                                                }
                                                eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                                            } else {
                                                mVar2.e();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, o0VarE), o0VarE, 12582912, 122);
                                    o0Var = o0VarE;
                                    str2 = str3;
                                    num3 = num4;
                                    z24 = z25;
                                    pVar3 = pVar8;
                                    pVar4 = pVar7;
                                    r0Var2 = r0Var4;
                                    a2Var3 = a2Var5;
                                    z19 = z26;
                                    jVar2 = jVar4;
                                    sgVar2 = sgVar3;
                                    lVar3 = lVar4;
                                    j14 = j15;
                                } else {
                                    o0VarE.e();
                                    str3 = str;
                                    r0Var4 = r0Var;
                                    jVar4 = jVar;
                                    z26 = z16;
                                    a2Var5 = a2Var2;
                                    rVar3 = rVar2;
                                    sgVar3 = sgVarD;
                                    j15 = jD;
                                    pVar7 = pVar;
                                    pVar8 = pVar2;
                                    num4 = num2;
                                    z25 = z17;
                                }
                                lVar4 = lVar;
                                o0VarE.h0();
                                p3.x1 x1Var2 = p3.n.f135158a;
                                final m4.q qVar2 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                                if (str3 == null) {
                                    str4 = "";
                                } else {
                                    str4 = str3;
                                }
                                ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                                    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                                    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                                    /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                                    @Override // e23.p
                                    public final Object invoke(Object obj, Object obj2) {
                                        p3.m mVar2 = (p3.m) obj;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            p3.x1 x1Var3 = p3.n.f135158a;
                                            g6.f.a aVar = g6.f.f75994b;
                                            h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                            e23.l lVar5 = lVar4;
                                            boolean zB = mVar2.B(lVar5);
                                            Object objQ2 = mVar2.q();
                                            p3.m.a aVar2 = p3.m.f135153a;
                                            if (zB) {
                                                objQ2 = new k11.n(lVar5, 7);
                                                mVar2.K(objQ2);
                                            } else {
                                                aVar2.getClass();
                                                if (objQ2 == p3.m.a.f135155b) {
                                                    objQ2 = new k11.n(lVar5, 7);
                                                    mVar2.K(objQ2);
                                                }
                                            }
                                            h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                            m4.q qVar3 = qVar2;
                                            boolean zR = mVar2.r(qVar3);
                                            Object objQ3 = mVar2.q();
                                            if (zR) {
                                                objQ3 = new b82.k0(qVar3, 6);
                                                mVar2.K(objQ3);
                                            } else {
                                                aVar2.getClass();
                                                if (objQ3 == p3.m.a.f135155b) {
                                                    objQ3 = new b82.k0(qVar3, 6);
                                                    mVar2.K(objQ3);
                                                }
                                            }
                                            p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                            boolean z28 = z25;
                                            if (!z28) {
                                                x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                            }
                                            Integer num5 = num4;
                                            boolean zB2 = mVar2.B(num5);
                                            e23.l lVar6 = lVar2;
                                            boolean zB3 = zB2 | mVar2.B(lVar6);
                                            Object objQ4 = mVar2.q();
                                            if (zB3) {
                                                objQ4 = new i1(lVar6, 1, num5);
                                                mVar2.K(objQ4);
                                            } else {
                                                aVar2.getClass();
                                                if (objQ4 == p3.m.a.f135155b) {
                                                    objQ4 = new i1(lVar6, 1, num5);
                                                    mVar2.K(objQ4);
                                                }
                                            }
                                            eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                                        } else {
                                            mVar2.e();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, o0VarE), o0VarE, 12582912, 122);
                                o0Var = o0VarE;
                                str2 = str3;
                                num3 = num4;
                                z24 = z25;
                                pVar3 = pVar8;
                                pVar4 = pVar7;
                                r0Var2 = r0Var4;
                                a2Var3 = a2Var5;
                                z19 = z26;
                                jVar2 = jVar4;
                                sgVar2 = sgVar3;
                                lVar3 = lVar4;
                                j14 = j15;
                            } else {
                                o0Var = o0VarE;
                                o0Var.e();
                                str2 = str;
                                pVar3 = pVar2;
                                num3 = num2;
                                z19 = z16;
                                z24 = z17;
                                a2Var3 = a2Var2;
                                rVar3 = rVar2;
                                sgVar2 = sgVarD;
                                j14 = jD;
                                pVar4 = pVar;
                                r0Var2 = r0Var;
                                jVar2 = jVar;
                                lVar3 = lVar;
                            }
                            p2VarI0 = o0Var.i0();
                            if (p2VarI0 != null) {
                                final h4.r rVar4 = rVar3;
                                p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                                    @Override // e23.p
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int iT = p3.p0.t(i14 | 1);
                                        int iT2 = p3.p0.t(i15);
                                        p1.b(l0Var, rVar4, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                                        return Unit.INSTANCE;
                                    }
                                };
                            }
                        }
                        i17 |= C.ENCODING_PCM_32BIT;
                        i37 = i16 & 1024;
                        if (i37 != 0) {
                            i38 = i15 | 6;
                        } else if ((i15 & 6) == 0) {
                            if (o0VarE.r(pVar2)) {
                                i39 = 4;
                            } else {
                                i39 = 2;
                            }
                            i38 = i15 | i39;
                        } else {
                            i38 = i15;
                        }
                        i44 = i16 & 2048;
                        if (i44 != 0) {
                            i38 |= 48;
                        } else if ((i15 & 48) != 0) {
                            if (o0VarE.B(r0Var)) {
                                i45 = 32;
                            } else {
                                i45 = 16;
                            }
                            i38 |= i45;
                        }
                        i46 = i38;
                        i47 = i17;
                        i48 = i16 & 4096;
                        if (i48 != 0) {
                            i54 = i46 | 384;
                        } else {
                            i49 = i46;
                            if ((i15 & 384) != 0) {
                                if (o0VarE.B(jVar)) {
                                    i55 = 256;
                                } else {
                                    i55 = 128;
                                }
                                i49 |= i55;
                            }
                            i54 = i49;
                        }
                        i56 = i16 & 8192;
                        if (i56 != 0) {
                            i58 = i54 | 3072;
                        } else {
                            i57 = i54;
                            if ((i15 & 3072) == 0) {
                                i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                            } else {
                                i58 = i57;
                            }
                        }
                        if ((i15 & 24576) != 0) {
                            i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                        }
                        int i68 = i58;
                        if ((i47 & 306783379) == 306783378) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        if (o0VarE.n(i47 & 1, z18)) {
                            o0VarE.G0();
                            if ((i14 & 1) != 0) {
                                if (i64 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar2;
                                }
                                if (i18 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i24 != 0) {
                                    num2 = null;
                                }
                                if (i26 != 0) {
                                    z16 = true;
                                }
                                if (i28 == 0) {
                                }
                                if (i30 != 0) {
                                    x5.v.f188954b.getClass();
                                    int i69 = x5.v.f188955c;
                                    x5.p.f188918b.getClass();
                                    a2Var4 = new p006l2.a2(0, (Boolean) null, i69, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                                } else {
                                    a2Var4 = a2Var2;
                                }
                                if ((i16 & 128) != 0) {
                                    d92.b.f58623a.getClass();
                                    jD = d92.b.a(o0VarE).k().d();
                                }
                                if ((i16 & 256) != 0) {
                                    sgVarD = d(o0VarE);
                                }
                                if (i35 != 0) {
                                    pVar5 = null;
                                } else {
                                    pVar5 = pVar;
                                }
                                if (i37 != 0) {
                                    pVar6 = null;
                                } else {
                                    pVar6 = pVar2;
                                }
                                if (i44 != 0) {
                                    x5.r0.f188941a.getClass();
                                    r0Var3 = x5.r0.a.f188943b;
                                } else {
                                    r0Var3 = r0Var;
                                }
                                if (i48 != 0) {
                                    objQ = o0VarE.q();
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = kg.f.b(o0VarE);
                                    }
                                    jVar3 = (a2.j) objQ;
                                } else {
                                    jVar3 = jVar;
                                }
                                r0Var4 = r0Var3;
                                jVar4 = jVar3;
                                sgVar3 = sgVarD;
                                j15 = jD;
                                z25 = z27;
                                if (i56 != 0) {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = null;
                                } else {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = lVar;
                                }
                            } else {
                                if (i64 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar2;
                                }
                                if (i18 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i24 != 0) {
                                    num2 = null;
                                }
                                if (i26 != 0) {
                                    z16 = true;
                                }
                                if (i28 == 0) {
                                }
                                if (i30 != 0) {
                                    x5.v.f188954b.getClass();
                                    int i610 = x5.v.f188955c;
                                    x5.p.f188918b.getClass();
                                    a2Var4 = new p006l2.a2(0, (Boolean) null, i610, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                                } else {
                                    a2Var4 = a2Var2;
                                }
                                if ((i16 & 128) != 0) {
                                    d92.b.f58623a.getClass();
                                    jD = d92.b.a(o0VarE).k().d();
                                }
                                if ((i16 & 256) != 0) {
                                    sgVarD = d(o0VarE);
                                }
                                if (i35 != 0) {
                                    pVar5 = null;
                                } else {
                                    pVar5 = pVar;
                                }
                                if (i37 != 0) {
                                    pVar6 = null;
                                } else {
                                    pVar6 = pVar2;
                                }
                                if (i44 != 0) {
                                    x5.r0.f188941a.getClass();
                                    r0Var3 = x5.r0.a.f188943b;
                                } else {
                                    r0Var3 = r0Var;
                                }
                                if (i48 != 0) {
                                    objQ = o0VarE.q();
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = kg.f.b(o0VarE);
                                    }
                                    jVar3 = (a2.j) objQ;
                                } else {
                                    jVar3 = jVar;
                                }
                                r0Var4 = r0Var3;
                                jVar4 = jVar3;
                                sgVar3 = sgVarD;
                                j15 = jD;
                                z25 = z27;
                                if (i56 != 0) {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = null;
                                } else {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = lVar;
                                }
                            }
                            o0VarE.h0();
                            p3.x1 x1Var3 = p3.n.f135158a;
                            final m4.q qVar3 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                            if (str3 == null) {
                                str4 = "";
                            } else {
                                str4 = str3;
                            }
                            ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                                /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                                /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                                /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    p3.m mVar2 = (p3.m) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        p3.x1 x1Var4 = p3.n.f135158a;
                                        g6.f.a aVar = g6.f.f75994b;
                                        h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                        e23.l lVar5 = lVar4;
                                        boolean zB = mVar2.B(lVar5);
                                        Object objQ2 = mVar2.q();
                                        p3.m.a aVar2 = p3.m.f135153a;
                                        if (zB) {
                                            objQ2 = new k11.n(lVar5, 7);
                                            mVar2.K(objQ2);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ2 == p3.m.a.f135155b) {
                                                objQ2 = new k11.n(lVar5, 7);
                                                mVar2.K(objQ2);
                                            }
                                        }
                                        h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                        m4.q qVar4 = qVar3;
                                        boolean zR = mVar2.r(qVar4);
                                        Object objQ3 = mVar2.q();
                                        if (zR) {
                                            objQ3 = new b82.k0(qVar4, 6);
                                            mVar2.K(objQ3);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ3 == p3.m.a.f135155b) {
                                                objQ3 = new b82.k0(qVar4, 6);
                                                mVar2.K(objQ3);
                                            }
                                        }
                                        p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                        boolean z28 = z25;
                                        if (!z28) {
                                            x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                        }
                                        Integer num5 = num4;
                                        boolean zB2 = mVar2.B(num5);
                                        e23.l lVar6 = lVar2;
                                        boolean zB3 = zB2 | mVar2.B(lVar6);
                                        Object objQ4 = mVar2.q();
                                        if (zB3) {
                                            objQ4 = new i1(lVar6, 1, num5);
                                            mVar2.K(objQ4);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ4 == p3.m.a.f135155b) {
                                                objQ4 = new i1(lVar6, 1, num5);
                                                mVar2.K(objQ4);
                                            }
                                        }
                                        eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                                    } else {
                                        mVar2.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, o0VarE), o0VarE, 12582912, 122);
                            o0Var = o0VarE;
                            str2 = str3;
                            num3 = num4;
                            z24 = z25;
                            pVar3 = pVar8;
                            pVar4 = pVar7;
                            r0Var2 = r0Var4;
                            a2Var3 = a2Var5;
                            z19 = z26;
                            jVar2 = jVar4;
                            sgVar2 = sgVar3;
                            lVar3 = lVar4;
                            j14 = j15;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            str2 = str;
                            pVar3 = pVar2;
                            num3 = num2;
                            z19 = z16;
                            z24 = z17;
                            a2Var3 = a2Var2;
                            rVar3 = rVar2;
                            sgVar2 = sgVarD;
                            j14 = jD;
                            pVar4 = pVar;
                            r0Var2 = r0Var;
                            jVar2 = jVar;
                            lVar3 = lVar;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            final h4.r rVar5 = rVar3;
                            p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iT = p3.p0.t(i14 | 1);
                                    int iT2 = p3.p0.t(i15);
                                    p1.b(l0Var, rVar5, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    }
                    i17 |= 24576;
                    z16 = z14;
                    i28 = i16 & 32;
                    if (i28 != 0) {
                        i17 |= 196608;
                        z17 = z15;
                    } else {
                        z17 = z15;
                        if ((i14 & 196608) == 0) {
                            if (o0VarE.h(z17)) {
                                i29 = 131072;
                            } else {
                                i29 = 65536;
                            }
                            i17 |= i29;
                        }
                    }
                    i30 = i16 & 64;
                    if (i30 != 0) {
                        i17 |= 1572864;
                        a2Var2 = a2Var;
                    } else {
                        a2Var2 = a2Var;
                        if ((i14 & 1572864) == 0) {
                            if (o0VarE.B(a2Var2)) {
                                i34 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            } else {
                                i34 = 524288;
                            }
                            i17 |= i34;
                        }
                    }
                    if ((i14 & 12582912) == 0) {
                        jD = j8;
                        if ((i16 & 128) == 0) {
                            i59 = 4194304;
                        } else {
                            i59 = 4194304;
                        }
                        i17 |= i59;
                    } else {
                        jD = j8;
                    }
                    if ((i14 & 100663296) == 0) {
                        if ((i16 & 256) == 0) {
                            sgVarD = sgVar;
                            if (o0VarE.B(sgVarD)) {
                            }
                            i17 |= i65;
                        } else {
                            sgVarD = sgVar;
                        }
                        i17 |= i65;
                    } else {
                        sgVarD = sgVar;
                    }
                    i35 = i16 & 512;
                    if (i35 != 0) {
                        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarE.r(pVar)) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i17 |= i36;
                        }
                        i37 = i16 & 1024;
                        if (i37 != 0) {
                            i38 = i15 | 6;
                        } else if ((i15 & 6) == 0) {
                            if (o0VarE.r(pVar2)) {
                                i39 = 4;
                            } else {
                                i39 = 2;
                            }
                            i38 = i15 | i39;
                        } else {
                            i38 = i15;
                        }
                        i44 = i16 & 2048;
                        if (i44 != 0) {
                            i38 |= 48;
                        } else if ((i15 & 48) != 0) {
                            if (o0VarE.B(r0Var)) {
                                i45 = 32;
                            } else {
                                i45 = 16;
                            }
                            i38 |= i45;
                        }
                        i46 = i38;
                        i47 = i17;
                        i48 = i16 & 4096;
                        if (i48 != 0) {
                            i54 = i46 | 384;
                        } else {
                            i49 = i46;
                            if ((i15 & 384) != 0) {
                                if (o0VarE.B(jVar)) {
                                    i55 = 256;
                                } else {
                                    i55 = 128;
                                }
                                i49 |= i55;
                            }
                            i54 = i49;
                        }
                        i56 = i16 & 8192;
                        if (i56 != 0) {
                            i58 = i54 | 3072;
                        } else {
                            i57 = i54;
                            if ((i15 & 3072) == 0) {
                                i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                            } else {
                                i58 = i57;
                            }
                        }
                        if ((i15 & 24576) != 0) {
                            i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                        }
                        int i611 = i58;
                        if ((i47 & 306783379) == 306783378) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        if (o0VarE.n(i47 & 1, z18)) {
                            o0VarE.G0();
                            if ((i14 & 1) != 0) {
                                if (i64 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar2;
                                }
                                if (i18 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i24 != 0) {
                                    num2 = null;
                                }
                                if (i26 != 0) {
                                    z16 = true;
                                }
                                if (i28 == 0) {
                                }
                                if (i30 != 0) {
                                    x5.v.f188954b.getClass();
                                    int i612 = x5.v.f188955c;
                                    x5.p.f188918b.getClass();
                                    a2Var4 = new p006l2.a2(0, (Boolean) null, i612, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                                } else {
                                    a2Var4 = a2Var2;
                                }
                                if ((i16 & 128) != 0) {
                                    d92.b.f58623a.getClass();
                                    jD = d92.b.a(o0VarE).k().d();
                                }
                                if ((i16 & 256) != 0) {
                                    sgVarD = d(o0VarE);
                                }
                                if (i35 != 0) {
                                    pVar5 = null;
                                } else {
                                    pVar5 = pVar;
                                }
                                if (i37 != 0) {
                                    pVar6 = null;
                                } else {
                                    pVar6 = pVar2;
                                }
                                if (i44 != 0) {
                                    x5.r0.f188941a.getClass();
                                    r0Var3 = x5.r0.a.f188943b;
                                } else {
                                    r0Var3 = r0Var;
                                }
                                if (i48 != 0) {
                                    objQ = o0VarE.q();
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = kg.f.b(o0VarE);
                                    }
                                    jVar3 = (a2.j) objQ;
                                } else {
                                    jVar3 = jVar;
                                }
                                r0Var4 = r0Var3;
                                jVar4 = jVar3;
                                sgVar3 = sgVarD;
                                j15 = jD;
                                z25 = z27;
                                if (i56 != 0) {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = null;
                                } else {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = lVar;
                                }
                            } else {
                                if (i64 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar2;
                                }
                                if (i18 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i24 != 0) {
                                    num2 = null;
                                }
                                if (i26 != 0) {
                                    z16 = true;
                                }
                                if (i28 == 0) {
                                }
                                if (i30 != 0) {
                                    x5.v.f188954b.getClass();
                                    int i613 = x5.v.f188955c;
                                    x5.p.f188918b.getClass();
                                    a2Var4 = new p006l2.a2(0, (Boolean) null, i613, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                                } else {
                                    a2Var4 = a2Var2;
                                }
                                if ((i16 & 128) != 0) {
                                    d92.b.f58623a.getClass();
                                    jD = d92.b.a(o0VarE).k().d();
                                }
                                if ((i16 & 256) != 0) {
                                    sgVarD = d(o0VarE);
                                }
                                if (i35 != 0) {
                                    pVar5 = null;
                                } else {
                                    pVar5 = pVar;
                                }
                                if (i37 != 0) {
                                    pVar6 = null;
                                } else {
                                    pVar6 = pVar2;
                                }
                                if (i44 != 0) {
                                    x5.r0.f188941a.getClass();
                                    r0Var3 = x5.r0.a.f188943b;
                                } else {
                                    r0Var3 = r0Var;
                                }
                                if (i48 != 0) {
                                    objQ = o0VarE.q();
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = kg.f.b(o0VarE);
                                    }
                                    jVar3 = (a2.j) objQ;
                                } else {
                                    jVar3 = jVar;
                                }
                                r0Var4 = r0Var3;
                                jVar4 = jVar3;
                                sgVar3 = sgVarD;
                                j15 = jD;
                                z25 = z27;
                                if (i56 != 0) {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = null;
                                } else {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = lVar;
                                }
                            }
                            o0VarE.h0();
                            p3.x1 x1Var4 = p3.n.f135158a;
                            final m4.q qVar4 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                            if (str3 == null) {
                                str4 = "";
                            } else {
                                str4 = str3;
                            }
                            ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                                /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                                /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                                /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    p3.m mVar2 = (p3.m) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        p3.x1 x1Var5 = p3.n.f135158a;
                                        g6.f.a aVar = g6.f.f75994b;
                                        h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                        e23.l lVar5 = lVar4;
                                        boolean zB = mVar2.B(lVar5);
                                        Object objQ2 = mVar2.q();
                                        p3.m.a aVar2 = p3.m.f135153a;
                                        if (zB) {
                                            objQ2 = new k11.n(lVar5, 7);
                                            mVar2.K(objQ2);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ2 == p3.m.a.f135155b) {
                                                objQ2 = new k11.n(lVar5, 7);
                                                mVar2.K(objQ2);
                                            }
                                        }
                                        h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                        m4.q qVar5 = qVar4;
                                        boolean zR = mVar2.r(qVar5);
                                        Object objQ3 = mVar2.q();
                                        if (zR) {
                                            objQ3 = new b82.k0(qVar5, 6);
                                            mVar2.K(objQ3);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ3 == p3.m.a.f135155b) {
                                                objQ3 = new b82.k0(qVar5, 6);
                                                mVar2.K(objQ3);
                                            }
                                        }
                                        p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                        boolean z28 = z25;
                                        if (!z28) {
                                            x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                        }
                                        Integer num5 = num4;
                                        boolean zB2 = mVar2.B(num5);
                                        e23.l lVar6 = lVar2;
                                        boolean zB3 = zB2 | mVar2.B(lVar6);
                                        Object objQ4 = mVar2.q();
                                        if (zB3) {
                                            objQ4 = new i1(lVar6, 1, num5);
                                            mVar2.K(objQ4);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ4 == p3.m.a.f135155b) {
                                                objQ4 = new i1(lVar6, 1, num5);
                                                mVar2.K(objQ4);
                                            }
                                        }
                                        eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                                    } else {
                                        mVar2.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, o0VarE), o0VarE, 12582912, 122);
                            o0Var = o0VarE;
                            str2 = str3;
                            num3 = num4;
                            z24 = z25;
                            pVar3 = pVar8;
                            pVar4 = pVar7;
                            r0Var2 = r0Var4;
                            a2Var3 = a2Var5;
                            z19 = z26;
                            jVar2 = jVar4;
                            sgVar2 = sgVar3;
                            lVar3 = lVar4;
                            j14 = j15;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            str2 = str;
                            pVar3 = pVar2;
                            num3 = num2;
                            z19 = z16;
                            z24 = z17;
                            a2Var3 = a2Var2;
                            rVar3 = rVar2;
                            sgVar2 = sgVarD;
                            j14 = jD;
                            pVar4 = pVar;
                            r0Var2 = r0Var;
                            jVar2 = jVar;
                            lVar3 = lVar;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            final h4.r rVar6 = rVar3;
                            p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iT = p3.p0.t(i14 | 1);
                                    int iT2 = p3.p0.t(i15);
                                    p1.b(l0Var, rVar6, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    }
                    i17 |= C.ENCODING_PCM_32BIT;
                    i37 = i16 & 1024;
                    if (i37 != 0) {
                        i38 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(pVar2)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i38 = i15 | i39;
                    } else {
                        i38 = i15;
                    }
                    i44 = i16 & 2048;
                    if (i44 != 0) {
                        i38 |= 48;
                    } else if ((i15 & 48) != 0) {
                        if (o0VarE.B(r0Var)) {
                            i45 = 32;
                        } else {
                            i45 = 16;
                        }
                        i38 |= i45;
                    }
                    i46 = i38;
                    i47 = i17;
                    i48 = i16 & 4096;
                    if (i48 != 0) {
                        i54 = i46 | 384;
                    } else {
                        i49 = i46;
                        if ((i15 & 384) != 0) {
                            if (o0VarE.B(jVar)) {
                                i55 = 256;
                            } else {
                                i55 = 128;
                            }
                            i49 |= i55;
                        }
                        i54 = i49;
                    }
                    i56 = i16 & 8192;
                    if (i56 != 0) {
                        i58 = i54 | 3072;
                    } else {
                        i57 = i54;
                        if ((i15 & 3072) == 0) {
                            i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                        } else {
                            i58 = i57;
                        }
                    }
                    if ((i15 & 24576) != 0) {
                        i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                    }
                    int i614 = i58;
                    if ((i47 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (o0VarE.n(i47 & 1, z18)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i615 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i615, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        } else {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i616 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i616, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        }
                        o0VarE.h0();
                        p3.x1 x1Var5 = p3.n.f135158a;
                        final m4.q qVar5 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                            /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                            /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                            /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2 = (p3.m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    p3.x1 x1Var6 = p3.n.f135158a;
                                    g6.f.a aVar = g6.f.f75994b;
                                    h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                    e23.l lVar5 = lVar4;
                                    boolean zB = mVar2.B(lVar5);
                                    Object objQ2 = mVar2.q();
                                    p3.m.a aVar2 = p3.m.f135153a;
                                    if (zB) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new k11.n(lVar5, 7);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                    m4.q qVar6 = qVar5;
                                    boolean zR = mVar2.r(qVar6);
                                    Object objQ3 = mVar2.q();
                                    if (zR) {
                                        objQ3 = new b82.k0(qVar6, 6);
                                        mVar2.K(objQ3);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            objQ3 = new b82.k0(qVar6, 6);
                                            mVar2.K(objQ3);
                                        }
                                    }
                                    p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                    boolean z28 = z25;
                                    if (!z28) {
                                        x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                    }
                                    Integer num5 = num4;
                                    boolean zB2 = mVar2.B(num5);
                                    e23.l lVar6 = lVar2;
                                    boolean zB3 = zB2 | mVar2.B(lVar6);
                                    Object objQ4 = mVar2.q();
                                    if (zB3) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ4 == p3.m.a.f135155b) {
                                            objQ4 = new i1(lVar6, 1, num5);
                                            mVar2.K(objQ4);
                                        }
                                    }
                                    eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, o0VarE), o0VarE, 12582912, 122);
                        o0Var = o0VarE;
                        str2 = str3;
                        num3 = num4;
                        z24 = z25;
                        pVar3 = pVar8;
                        pVar4 = pVar7;
                        r0Var2 = r0Var4;
                        a2Var3 = a2Var5;
                        z19 = z26;
                        jVar2 = jVar4;
                        sgVar2 = sgVar3;
                        lVar3 = lVar4;
                        j14 = j15;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        str2 = str;
                        pVar3 = pVar2;
                        num3 = num2;
                        z19 = z16;
                        z24 = z17;
                        a2Var3 = a2Var2;
                        rVar3 = rVar2;
                        sgVar2 = sgVarD;
                        j14 = jD;
                        pVar4 = pVar;
                        r0Var2 = r0Var;
                        jVar2 = jVar;
                        lVar3 = lVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        final h4.r rVar7 = rVar3;
                        p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                p1.b(l0Var, rVar7, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i17 |= 3072;
                num2 = num;
                i26 = i16 & 16;
                if (i26 != 0) {
                    if ((i14 & 24576) == 0) {
                        z16 = z14;
                        if (o0VarE.h(z16)) {
                            i27 = 16384;
                        } else {
                            i27 = 8192;
                        }
                        i17 |= i27;
                    }
                    i28 = i16 & 32;
                    if (i28 != 0) {
                        i17 |= 196608;
                        z17 = z15;
                    } else {
                        z17 = z15;
                        if ((i14 & 196608) == 0) {
                            if (o0VarE.h(z17)) {
                                i29 = 131072;
                            } else {
                                i29 = 65536;
                            }
                            i17 |= i29;
                        }
                    }
                    i30 = i16 & 64;
                    if (i30 != 0) {
                        i17 |= 1572864;
                        a2Var2 = a2Var;
                    } else {
                        a2Var2 = a2Var;
                        if ((i14 & 1572864) == 0) {
                            if (o0VarE.B(a2Var2)) {
                                i34 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            } else {
                                i34 = 524288;
                            }
                            i17 |= i34;
                        }
                    }
                    if ((i14 & 12582912) == 0) {
                        jD = j8;
                        if ((i16 & 128) == 0) {
                            i59 = 4194304;
                        } else {
                            i59 = 4194304;
                        }
                        i17 |= i59;
                    } else {
                        jD = j8;
                    }
                    if ((i14 & 100663296) == 0) {
                        if ((i16 & 256) == 0) {
                            sgVarD = sgVar;
                            if (o0VarE.B(sgVarD)) {
                            }
                            i17 |= i65;
                        } else {
                            sgVarD = sgVar;
                        }
                        i17 |= i65;
                    } else {
                        sgVarD = sgVar;
                    }
                    i35 = i16 & 512;
                    if (i35 != 0) {
                        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarE.r(pVar)) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i17 |= i36;
                        }
                        i37 = i16 & 1024;
                        if (i37 != 0) {
                            i38 = i15 | 6;
                        } else if ((i15 & 6) == 0) {
                            if (o0VarE.r(pVar2)) {
                                i39 = 4;
                            } else {
                                i39 = 2;
                            }
                            i38 = i15 | i39;
                        } else {
                            i38 = i15;
                        }
                        i44 = i16 & 2048;
                        if (i44 != 0) {
                            i38 |= 48;
                        } else if ((i15 & 48) != 0) {
                            if (o0VarE.B(r0Var)) {
                                i45 = 32;
                            } else {
                                i45 = 16;
                            }
                            i38 |= i45;
                        }
                        i46 = i38;
                        i47 = i17;
                        i48 = i16 & 4096;
                        if (i48 != 0) {
                            i54 = i46 | 384;
                        } else {
                            i49 = i46;
                            if ((i15 & 384) != 0) {
                                if (o0VarE.B(jVar)) {
                                    i55 = 256;
                                } else {
                                    i55 = 128;
                                }
                                i49 |= i55;
                            }
                            i54 = i49;
                        }
                        i56 = i16 & 8192;
                        if (i56 != 0) {
                            i58 = i54 | 3072;
                        } else {
                            i57 = i54;
                            if ((i15 & 3072) == 0) {
                                i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                            } else {
                                i58 = i57;
                            }
                        }
                        if ((i15 & 24576) != 0) {
                            i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                        }
                        int i617 = i58;
                        if ((i47 & 306783379) == 306783378) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        if (o0VarE.n(i47 & 1, z18)) {
                            o0VarE.G0();
                            if ((i14 & 1) != 0) {
                                if (i64 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar2;
                                }
                                if (i18 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i24 != 0) {
                                    num2 = null;
                                }
                                if (i26 != 0) {
                                    z16 = true;
                                }
                                if (i28 == 0) {
                                }
                                if (i30 != 0) {
                                    x5.v.f188954b.getClass();
                                    int i618 = x5.v.f188955c;
                                    x5.p.f188918b.getClass();
                                    a2Var4 = new p006l2.a2(0, (Boolean) null, i618, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                                } else {
                                    a2Var4 = a2Var2;
                                }
                                if ((i16 & 128) != 0) {
                                    d92.b.f58623a.getClass();
                                    jD = d92.b.a(o0VarE).k().d();
                                }
                                if ((i16 & 256) != 0) {
                                    sgVarD = d(o0VarE);
                                }
                                if (i35 != 0) {
                                    pVar5 = null;
                                } else {
                                    pVar5 = pVar;
                                }
                                if (i37 != 0) {
                                    pVar6 = null;
                                } else {
                                    pVar6 = pVar2;
                                }
                                if (i44 != 0) {
                                    x5.r0.f188941a.getClass();
                                    r0Var3 = x5.r0.a.f188943b;
                                } else {
                                    r0Var3 = r0Var;
                                }
                                if (i48 != 0) {
                                    objQ = o0VarE.q();
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = kg.f.b(o0VarE);
                                    }
                                    jVar3 = (a2.j) objQ;
                                } else {
                                    jVar3 = jVar;
                                }
                                r0Var4 = r0Var3;
                                jVar4 = jVar3;
                                sgVar3 = sgVarD;
                                j15 = jD;
                                z25 = z27;
                                if (i56 != 0) {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = null;
                                } else {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = lVar;
                                }
                            } else {
                                if (i64 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar2;
                                }
                                if (i18 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i24 != 0) {
                                    num2 = null;
                                }
                                if (i26 != 0) {
                                    z16 = true;
                                }
                                if (i28 == 0) {
                                }
                                if (i30 != 0) {
                                    x5.v.f188954b.getClass();
                                    int i619 = x5.v.f188955c;
                                    x5.p.f188918b.getClass();
                                    a2Var4 = new p006l2.a2(0, (Boolean) null, i619, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                                } else {
                                    a2Var4 = a2Var2;
                                }
                                if ((i16 & 128) != 0) {
                                    d92.b.f58623a.getClass();
                                    jD = d92.b.a(o0VarE).k().d();
                                }
                                if ((i16 & 256) != 0) {
                                    sgVarD = d(o0VarE);
                                }
                                if (i35 != 0) {
                                    pVar5 = null;
                                } else {
                                    pVar5 = pVar;
                                }
                                if (i37 != 0) {
                                    pVar6 = null;
                                } else {
                                    pVar6 = pVar2;
                                }
                                if (i44 != 0) {
                                    x5.r0.f188941a.getClass();
                                    r0Var3 = x5.r0.a.f188943b;
                                } else {
                                    r0Var3 = r0Var;
                                }
                                if (i48 != 0) {
                                    objQ = o0VarE.q();
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = kg.f.b(o0VarE);
                                    }
                                    jVar3 = (a2.j) objQ;
                                } else {
                                    jVar3 = jVar;
                                }
                                r0Var4 = r0Var3;
                                jVar4 = jVar3;
                                sgVar3 = sgVarD;
                                j15 = jD;
                                z25 = z27;
                                if (i56 != 0) {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = null;
                                } else {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = lVar;
                                }
                            }
                            o0VarE.h0();
                            p3.x1 x1Var6 = p3.n.f135158a;
                            final m4.q qVar6 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                            if (str3 == null) {
                                str4 = "";
                            } else {
                                str4 = str3;
                            }
                            ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                                /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                                /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                                /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    p3.m mVar2 = (p3.m) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        p3.x1 x1Var7 = p3.n.f135158a;
                                        g6.f.a aVar = g6.f.f75994b;
                                        h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                        e23.l lVar5 = lVar4;
                                        boolean zB = mVar2.B(lVar5);
                                        Object objQ2 = mVar2.q();
                                        p3.m.a aVar2 = p3.m.f135153a;
                                        if (zB) {
                                            objQ2 = new k11.n(lVar5, 7);
                                            mVar2.K(objQ2);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ2 == p3.m.a.f135155b) {
                                                objQ2 = new k11.n(lVar5, 7);
                                                mVar2.K(objQ2);
                                            }
                                        }
                                        h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                        m4.q qVar7 = qVar6;
                                        boolean zR = mVar2.r(qVar7);
                                        Object objQ3 = mVar2.q();
                                        if (zR) {
                                            objQ3 = new b82.k0(qVar7, 6);
                                            mVar2.K(objQ3);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ3 == p3.m.a.f135155b) {
                                                objQ3 = new b82.k0(qVar7, 6);
                                                mVar2.K(objQ3);
                                            }
                                        }
                                        p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                        boolean z28 = z25;
                                        if (!z28) {
                                            x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                        }
                                        Integer num5 = num4;
                                        boolean zB2 = mVar2.B(num5);
                                        e23.l lVar6 = lVar2;
                                        boolean zB3 = zB2 | mVar2.B(lVar6);
                                        Object objQ4 = mVar2.q();
                                        if (zB3) {
                                            objQ4 = new i1(lVar6, 1, num5);
                                            mVar2.K(objQ4);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ4 == p3.m.a.f135155b) {
                                                objQ4 = new i1(lVar6, 1, num5);
                                                mVar2.K(objQ4);
                                            }
                                        }
                                        eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                                    } else {
                                        mVar2.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, o0VarE), o0VarE, 12582912, 122);
                            o0Var = o0VarE;
                            str2 = str3;
                            num3 = num4;
                            z24 = z25;
                            pVar3 = pVar8;
                            pVar4 = pVar7;
                            r0Var2 = r0Var4;
                            a2Var3 = a2Var5;
                            z19 = z26;
                            jVar2 = jVar4;
                            sgVar2 = sgVar3;
                            lVar3 = lVar4;
                            j14 = j15;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            str2 = str;
                            pVar3 = pVar2;
                            num3 = num2;
                            z19 = z16;
                            z24 = z17;
                            a2Var3 = a2Var2;
                            rVar3 = rVar2;
                            sgVar2 = sgVarD;
                            j14 = jD;
                            pVar4 = pVar;
                            r0Var2 = r0Var;
                            jVar2 = jVar;
                            lVar3 = lVar;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            final h4.r rVar8 = rVar3;
                            p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iT = p3.p0.t(i14 | 1);
                                    int iT2 = p3.p0.t(i15);
                                    p1.b(l0Var, rVar8, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    }
                    i17 |= C.ENCODING_PCM_32BIT;
                    i37 = i16 & 1024;
                    if (i37 != 0) {
                        i38 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(pVar2)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i38 = i15 | i39;
                    } else {
                        i38 = i15;
                    }
                    i44 = i16 & 2048;
                    if (i44 != 0) {
                        i38 |= 48;
                    } else if ((i15 & 48) != 0) {
                        if (o0VarE.B(r0Var)) {
                            i45 = 32;
                        } else {
                            i45 = 16;
                        }
                        i38 |= i45;
                    }
                    i46 = i38;
                    i47 = i17;
                    i48 = i16 & 4096;
                    if (i48 != 0) {
                        i54 = i46 | 384;
                    } else {
                        i49 = i46;
                        if ((i15 & 384) != 0) {
                            if (o0VarE.B(jVar)) {
                                i55 = 256;
                            } else {
                                i55 = 128;
                            }
                            i49 |= i55;
                        }
                        i54 = i49;
                    }
                    i56 = i16 & 8192;
                    if (i56 != 0) {
                        i58 = i54 | 3072;
                    } else {
                        i57 = i54;
                        if ((i15 & 3072) == 0) {
                            i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                        } else {
                            i58 = i57;
                        }
                    }
                    if ((i15 & 24576) != 0) {
                        i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                    }
                    int i6110 = i58;
                    if ((i47 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (o0VarE.n(i47 & 1, z18)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i6111 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i6111, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        } else {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i6112 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i6112, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        }
                        o0VarE.h0();
                        p3.x1 x1Var7 = p3.n.f135158a;
                        final m4.q qVar7 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                            /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                            /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                            /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2 = (p3.m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    p3.x1 x1Var8 = p3.n.f135158a;
                                    g6.f.a aVar = g6.f.f75994b;
                                    h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                    e23.l lVar5 = lVar4;
                                    boolean zB = mVar2.B(lVar5);
                                    Object objQ2 = mVar2.q();
                                    p3.m.a aVar2 = p3.m.f135153a;
                                    if (zB) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new k11.n(lVar5, 7);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                    m4.q qVar8 = qVar7;
                                    boolean zR = mVar2.r(qVar8);
                                    Object objQ3 = mVar2.q();
                                    if (zR) {
                                        objQ3 = new b82.k0(qVar8, 6);
                                        mVar2.K(objQ3);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            objQ3 = new b82.k0(qVar8, 6);
                                            mVar2.K(objQ3);
                                        }
                                    }
                                    p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                    boolean z28 = z25;
                                    if (!z28) {
                                        x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                    }
                                    Integer num5 = num4;
                                    boolean zB2 = mVar2.B(num5);
                                    e23.l lVar6 = lVar2;
                                    boolean zB3 = zB2 | mVar2.B(lVar6);
                                    Object objQ4 = mVar2.q();
                                    if (zB3) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ4 == p3.m.a.f135155b) {
                                            objQ4 = new i1(lVar6, 1, num5);
                                            mVar2.K(objQ4);
                                        }
                                    }
                                    eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, o0VarE), o0VarE, 12582912, 122);
                        o0Var = o0VarE;
                        str2 = str3;
                        num3 = num4;
                        z24 = z25;
                        pVar3 = pVar8;
                        pVar4 = pVar7;
                        r0Var2 = r0Var4;
                        a2Var3 = a2Var5;
                        z19 = z26;
                        jVar2 = jVar4;
                        sgVar2 = sgVar3;
                        lVar3 = lVar4;
                        j14 = j15;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        str2 = str;
                        pVar3 = pVar2;
                        num3 = num2;
                        z19 = z16;
                        z24 = z17;
                        a2Var3 = a2Var2;
                        rVar3 = rVar2;
                        sgVar2 = sgVarD;
                        j14 = jD;
                        pVar4 = pVar;
                        r0Var2 = r0Var;
                        jVar2 = jVar;
                        lVar3 = lVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        final h4.r rVar9 = rVar3;
                        p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                p1.b(l0Var, rVar9, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i17 |= 24576;
                z16 = z14;
                i28 = i16 & 32;
                if (i28 != 0) {
                    i17 |= 196608;
                    z17 = z15;
                } else {
                    z17 = z15;
                    if ((i14 & 196608) == 0) {
                        if (o0VarE.h(z17)) {
                            i29 = 131072;
                        } else {
                            i29 = 65536;
                        }
                        i17 |= i29;
                    }
                }
                i30 = i16 & 64;
                if (i30 != 0) {
                    i17 |= 1572864;
                    a2Var2 = a2Var;
                } else {
                    a2Var2 = a2Var;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.B(a2Var2)) {
                            i34 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i34 = 524288;
                        }
                        i17 |= i34;
                    }
                }
                if ((i14 & 12582912) == 0) {
                    jD = j8;
                    if ((i16 & 128) == 0) {
                        i59 = 4194304;
                    } else {
                        i59 = 4194304;
                    }
                    i17 |= i59;
                } else {
                    jD = j8;
                }
                if ((i14 & 100663296) == 0) {
                    if ((i16 & 256) == 0) {
                        sgVarD = sgVar;
                        if (o0VarE.B(sgVarD)) {
                        }
                        i17 |= i65;
                    } else {
                        sgVarD = sgVar;
                    }
                    i17 |= i65;
                } else {
                    sgVarD = sgVar;
                }
                i35 = i16 & 512;
                if (i35 != 0) {
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(pVar)) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i17 |= i36;
                    }
                    i37 = i16 & 1024;
                    if (i37 != 0) {
                        i38 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(pVar2)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i38 = i15 | i39;
                    } else {
                        i38 = i15;
                    }
                    i44 = i16 & 2048;
                    if (i44 != 0) {
                        i38 |= 48;
                    } else if ((i15 & 48) != 0) {
                        if (o0VarE.B(r0Var)) {
                            i45 = 32;
                        } else {
                            i45 = 16;
                        }
                        i38 |= i45;
                    }
                    i46 = i38;
                    i47 = i17;
                    i48 = i16 & 4096;
                    if (i48 != 0) {
                        i54 = i46 | 384;
                    } else {
                        i49 = i46;
                        if ((i15 & 384) != 0) {
                            if (o0VarE.B(jVar)) {
                                i55 = 256;
                            } else {
                                i55 = 128;
                            }
                            i49 |= i55;
                        }
                        i54 = i49;
                    }
                    i56 = i16 & 8192;
                    if (i56 != 0) {
                        i58 = i54 | 3072;
                    } else {
                        i57 = i54;
                        if ((i15 & 3072) == 0) {
                            i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                        } else {
                            i58 = i57;
                        }
                    }
                    if ((i15 & 24576) != 0) {
                        i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                    }
                    int i6113 = i58;
                    if ((i47 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (o0VarE.n(i47 & 1, z18)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i6114 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i6114, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        } else {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i6115 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i6115, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        }
                        o0VarE.h0();
                        p3.x1 x1Var8 = p3.n.f135158a;
                        final m4.q qVar8 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                            /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                            /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                            /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2 = (p3.m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    p3.x1 x1Var9 = p3.n.f135158a;
                                    g6.f.a aVar = g6.f.f75994b;
                                    h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                    e23.l lVar5 = lVar4;
                                    boolean zB = mVar2.B(lVar5);
                                    Object objQ2 = mVar2.q();
                                    p3.m.a aVar2 = p3.m.f135153a;
                                    if (zB) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new k11.n(lVar5, 7);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                    m4.q qVar9 = qVar8;
                                    boolean zR = mVar2.r(qVar9);
                                    Object objQ3 = mVar2.q();
                                    if (zR) {
                                        objQ3 = new b82.k0(qVar9, 6);
                                        mVar2.K(objQ3);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            objQ3 = new b82.k0(qVar9, 6);
                                            mVar2.K(objQ3);
                                        }
                                    }
                                    p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                    boolean z28 = z25;
                                    if (!z28) {
                                        x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                    }
                                    Integer num5 = num4;
                                    boolean zB2 = mVar2.B(num5);
                                    e23.l lVar6 = lVar2;
                                    boolean zB3 = zB2 | mVar2.B(lVar6);
                                    Object objQ4 = mVar2.q();
                                    if (zB3) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ4 == p3.m.a.f135155b) {
                                            objQ4 = new i1(lVar6, 1, num5);
                                            mVar2.K(objQ4);
                                        }
                                    }
                                    eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, o0VarE), o0VarE, 12582912, 122);
                        o0Var = o0VarE;
                        str2 = str3;
                        num3 = num4;
                        z24 = z25;
                        pVar3 = pVar8;
                        pVar4 = pVar7;
                        r0Var2 = r0Var4;
                        a2Var3 = a2Var5;
                        z19 = z26;
                        jVar2 = jVar4;
                        sgVar2 = sgVar3;
                        lVar3 = lVar4;
                        j14 = j15;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        str2 = str;
                        pVar3 = pVar2;
                        num3 = num2;
                        z19 = z16;
                        z24 = z17;
                        a2Var3 = a2Var2;
                        rVar3 = rVar2;
                        sgVar2 = sgVarD;
                        j14 = jD;
                        pVar4 = pVar;
                        r0Var2 = r0Var;
                        jVar2 = jVar;
                        lVar3 = lVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        final h4.r rVar10 = rVar3;
                        p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                p1.b(l0Var, rVar10, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i17 |= C.ENCODING_PCM_32BIT;
                i37 = i16 & 1024;
                if (i37 != 0) {
                    i38 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i15 | i39;
                } else {
                    i38 = i15;
                }
                i44 = i16 & 2048;
                if (i44 != 0) {
                    i38 |= 48;
                } else if ((i15 & 48) != 0) {
                    if (o0VarE.B(r0Var)) {
                        i45 = 32;
                    } else {
                        i45 = 16;
                    }
                    i38 |= i45;
                }
                i46 = i38;
                i47 = i17;
                i48 = i16 & 4096;
                if (i48 != 0) {
                    i54 = i46 | 384;
                } else {
                    i49 = i46;
                    if ((i15 & 384) != 0) {
                        if (o0VarE.B(jVar)) {
                            i55 = 256;
                        } else {
                            i55 = 128;
                        }
                        i49 |= i55;
                    }
                    i54 = i49;
                }
                i56 = i16 & 8192;
                if (i56 != 0) {
                    i58 = i54 | 3072;
                } else {
                    i57 = i54;
                    if ((i15 & 3072) == 0) {
                        i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                    } else {
                        i58 = i57;
                    }
                }
                if ((i15 & 24576) != 0) {
                    i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                }
                int i6116 = i58;
                if ((i47 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (o0VarE.n(i47 & 1, z18)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i6117 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i6117, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    } else {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i6118 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i6118, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    }
                    o0VarE.h0();
                    p3.x1 x1Var9 = p3.n.f135158a;
                    final m4.q qVar9 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                        /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                        /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                        /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                p3.x1 x1Var10 = p3.n.f135158a;
                                g6.f.a aVar = g6.f.f75994b;
                                h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                e23.l lVar5 = lVar4;
                                boolean zB = mVar2.B(lVar5);
                                Object objQ2 = mVar2.q();
                                p3.m.a aVar2 = p3.m.f135153a;
                                if (zB) {
                                    objQ2 = new k11.n(lVar5, 7);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar2.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    }
                                }
                                h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                m4.q qVar10 = qVar9;
                                boolean zR = mVar2.r(qVar10);
                                Object objQ3 = mVar2.q();
                                if (zR) {
                                    objQ3 = new b82.k0(qVar10, 6);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar2.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new b82.k0(qVar10, 6);
                                        mVar2.K(objQ3);
                                    }
                                }
                                p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                boolean z28 = z25;
                                if (!z28) {
                                    x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                }
                                Integer num5 = num4;
                                boolean zB2 = mVar2.B(num5);
                                e23.l lVar6 = lVar2;
                                boolean zB3 = zB2 | mVar2.B(lVar6);
                                Object objQ4 = mVar2.q();
                                if (zB3) {
                                    objQ4 = new i1(lVar6, 1, num5);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar2.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    }
                                }
                                eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, 12582912, 122);
                    o0Var = o0VarE;
                    str2 = str3;
                    num3 = num4;
                    z24 = z25;
                    pVar3 = pVar8;
                    pVar4 = pVar7;
                    r0Var2 = r0Var4;
                    a2Var3 = a2Var5;
                    z19 = z26;
                    jVar2 = jVar4;
                    sgVar2 = sgVar3;
                    lVar3 = lVar4;
                    j14 = j15;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    str2 = str;
                    pVar3 = pVar2;
                    num3 = num2;
                    z19 = z16;
                    z24 = z17;
                    a2Var3 = a2Var2;
                    rVar3 = rVar2;
                    sgVar2 = sgVarD;
                    j14 = jD;
                    pVar4 = pVar;
                    r0Var2 = r0Var;
                    jVar2 = jVar;
                    lVar3 = lVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    final h4.r rVar11 = rVar3;
                    p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            p1.b(l0Var, rVar11, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i17 |= 384;
            i24 = i16 & 8;
            if (i24 != 0) {
                if ((i14 & 3072) == 0) {
                    num2 = num;
                    if (o0VarE.B(num2)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i17 |= i25;
                }
                i26 = i16 & 16;
                if (i26 != 0) {
                    if ((i14 & 24576) == 0) {
                        z16 = z14;
                        if (o0VarE.h(z16)) {
                            i27 = 16384;
                        } else {
                            i27 = 8192;
                        }
                        i17 |= i27;
                    }
                    i28 = i16 & 32;
                    if (i28 != 0) {
                        i17 |= 196608;
                        z17 = z15;
                    } else {
                        z17 = z15;
                        if ((i14 & 196608) == 0) {
                            if (o0VarE.h(z17)) {
                                i29 = 131072;
                            } else {
                                i29 = 65536;
                            }
                            i17 |= i29;
                        }
                    }
                    i30 = i16 & 64;
                    if (i30 != 0) {
                        i17 |= 1572864;
                        a2Var2 = a2Var;
                    } else {
                        a2Var2 = a2Var;
                        if ((i14 & 1572864) == 0) {
                            if (o0VarE.B(a2Var2)) {
                                i34 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            } else {
                                i34 = 524288;
                            }
                            i17 |= i34;
                        }
                    }
                    if ((i14 & 12582912) == 0) {
                        jD = j8;
                        if ((i16 & 128) == 0) {
                            i59 = 4194304;
                        } else {
                            i59 = 4194304;
                        }
                        i17 |= i59;
                    } else {
                        jD = j8;
                    }
                    if ((i14 & 100663296) == 0) {
                        if ((i16 & 256) == 0) {
                            sgVarD = sgVar;
                            if (o0VarE.B(sgVarD)) {
                            }
                            i17 |= i65;
                        } else {
                            sgVarD = sgVar;
                        }
                        i17 |= i65;
                    } else {
                        sgVarD = sgVar;
                    }
                    i35 = i16 & 512;
                    if (i35 != 0) {
                        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarE.r(pVar)) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i17 |= i36;
                        }
                        i37 = i16 & 1024;
                        if (i37 != 0) {
                            i38 = i15 | 6;
                        } else if ((i15 & 6) == 0) {
                            if (o0VarE.r(pVar2)) {
                                i39 = 4;
                            } else {
                                i39 = 2;
                            }
                            i38 = i15 | i39;
                        } else {
                            i38 = i15;
                        }
                        i44 = i16 & 2048;
                        if (i44 != 0) {
                            i38 |= 48;
                        } else if ((i15 & 48) != 0) {
                            if (o0VarE.B(r0Var)) {
                                i45 = 32;
                            } else {
                                i45 = 16;
                            }
                            i38 |= i45;
                        }
                        i46 = i38;
                        i47 = i17;
                        i48 = i16 & 4096;
                        if (i48 != 0) {
                            i54 = i46 | 384;
                        } else {
                            i49 = i46;
                            if ((i15 & 384) != 0) {
                                if (o0VarE.B(jVar)) {
                                    i55 = 256;
                                } else {
                                    i55 = 128;
                                }
                                i49 |= i55;
                            }
                            i54 = i49;
                        }
                        i56 = i16 & 8192;
                        if (i56 != 0) {
                            i58 = i54 | 3072;
                        } else {
                            i57 = i54;
                            if ((i15 & 3072) == 0) {
                                i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                            } else {
                                i58 = i57;
                            }
                        }
                        if ((i15 & 24576) != 0) {
                            i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                        }
                        int i6119 = i58;
                        if ((i47 & 306783379) == 306783378) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        if (o0VarE.n(i47 & 1, z18)) {
                            o0VarE.G0();
                            if ((i14 & 1) != 0) {
                                if (i64 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar2;
                                }
                                if (i18 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i24 != 0) {
                                    num2 = null;
                                }
                                if (i26 != 0) {
                                    z16 = true;
                                }
                                if (i28 == 0) {
                                }
                                if (i30 != 0) {
                                    x5.v.f188954b.getClass();
                                    int i61110 = x5.v.f188955c;
                                    x5.p.f188918b.getClass();
                                    a2Var4 = new p006l2.a2(0, (Boolean) null, i61110, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                                } else {
                                    a2Var4 = a2Var2;
                                }
                                if ((i16 & 128) != 0) {
                                    d92.b.f58623a.getClass();
                                    jD = d92.b.a(o0VarE).k().d();
                                }
                                if ((i16 & 256) != 0) {
                                    sgVarD = d(o0VarE);
                                }
                                if (i35 != 0) {
                                    pVar5 = null;
                                } else {
                                    pVar5 = pVar;
                                }
                                if (i37 != 0) {
                                    pVar6 = null;
                                } else {
                                    pVar6 = pVar2;
                                }
                                if (i44 != 0) {
                                    x5.r0.f188941a.getClass();
                                    r0Var3 = x5.r0.a.f188943b;
                                } else {
                                    r0Var3 = r0Var;
                                }
                                if (i48 != 0) {
                                    objQ = o0VarE.q();
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = kg.f.b(o0VarE);
                                    }
                                    jVar3 = (a2.j) objQ;
                                } else {
                                    jVar3 = jVar;
                                }
                                r0Var4 = r0Var3;
                                jVar4 = jVar3;
                                sgVar3 = sgVarD;
                                j15 = jD;
                                z25 = z27;
                                if (i56 != 0) {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = null;
                                } else {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = lVar;
                                }
                            } else {
                                if (i64 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar2;
                                }
                                if (i18 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i24 != 0) {
                                    num2 = null;
                                }
                                if (i26 != 0) {
                                    z16 = true;
                                }
                                if (i28 == 0) {
                                }
                                if (i30 != 0) {
                                    x5.v.f188954b.getClass();
                                    int i61111 = x5.v.f188955c;
                                    x5.p.f188918b.getClass();
                                    a2Var4 = new p006l2.a2(0, (Boolean) null, i61111, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                                } else {
                                    a2Var4 = a2Var2;
                                }
                                if ((i16 & 128) != 0) {
                                    d92.b.f58623a.getClass();
                                    jD = d92.b.a(o0VarE).k().d();
                                }
                                if ((i16 & 256) != 0) {
                                    sgVarD = d(o0VarE);
                                }
                                if (i35 != 0) {
                                    pVar5 = null;
                                } else {
                                    pVar5 = pVar;
                                }
                                if (i37 != 0) {
                                    pVar6 = null;
                                } else {
                                    pVar6 = pVar2;
                                }
                                if (i44 != 0) {
                                    x5.r0.f188941a.getClass();
                                    r0Var3 = x5.r0.a.f188943b;
                                } else {
                                    r0Var3 = r0Var;
                                }
                                if (i48 != 0) {
                                    objQ = o0VarE.q();
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = kg.f.b(o0VarE);
                                    }
                                    jVar3 = (a2.j) objQ;
                                } else {
                                    jVar3 = jVar;
                                }
                                r0Var4 = r0Var3;
                                jVar4 = jVar3;
                                sgVar3 = sgVarD;
                                j15 = jD;
                                z25 = z27;
                                if (i56 != 0) {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = null;
                                } else {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = lVar;
                                }
                            }
                            o0VarE.h0();
                            p3.x1 x1Var10 = p3.n.f135158a;
                            final m4.q qVar10 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                            if (str3 == null) {
                                str4 = "";
                            } else {
                                str4 = str3;
                            }
                            ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                                /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                                /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                                /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    p3.m mVar2 = (p3.m) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        p3.x1 x1Var11 = p3.n.f135158a;
                                        g6.f.a aVar = g6.f.f75994b;
                                        h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                        e23.l lVar5 = lVar4;
                                        boolean zB = mVar2.B(lVar5);
                                        Object objQ2 = mVar2.q();
                                        p3.m.a aVar2 = p3.m.f135153a;
                                        if (zB) {
                                            objQ2 = new k11.n(lVar5, 7);
                                            mVar2.K(objQ2);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ2 == p3.m.a.f135155b) {
                                                objQ2 = new k11.n(lVar5, 7);
                                                mVar2.K(objQ2);
                                            }
                                        }
                                        h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                        m4.q qVar11 = qVar10;
                                        boolean zR = mVar2.r(qVar11);
                                        Object objQ3 = mVar2.q();
                                        if (zR) {
                                            objQ3 = new b82.k0(qVar11, 6);
                                            mVar2.K(objQ3);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ3 == p3.m.a.f135155b) {
                                                objQ3 = new b82.k0(qVar11, 6);
                                                mVar2.K(objQ3);
                                            }
                                        }
                                        p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                        boolean z28 = z25;
                                        if (!z28) {
                                            x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                        }
                                        Integer num5 = num4;
                                        boolean zB2 = mVar2.B(num5);
                                        e23.l lVar6 = lVar2;
                                        boolean zB3 = zB2 | mVar2.B(lVar6);
                                        Object objQ4 = mVar2.q();
                                        if (zB3) {
                                            objQ4 = new i1(lVar6, 1, num5);
                                            mVar2.K(objQ4);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ4 == p3.m.a.f135155b) {
                                                objQ4 = new i1(lVar6, 1, num5);
                                                mVar2.K(objQ4);
                                            }
                                        }
                                        eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                                    } else {
                                        mVar2.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, o0VarE), o0VarE, 12582912, 122);
                            o0Var = o0VarE;
                            str2 = str3;
                            num3 = num4;
                            z24 = z25;
                            pVar3 = pVar8;
                            pVar4 = pVar7;
                            r0Var2 = r0Var4;
                            a2Var3 = a2Var5;
                            z19 = z26;
                            jVar2 = jVar4;
                            sgVar2 = sgVar3;
                            lVar3 = lVar4;
                            j14 = j15;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            str2 = str;
                            pVar3 = pVar2;
                            num3 = num2;
                            z19 = z16;
                            z24 = z17;
                            a2Var3 = a2Var2;
                            rVar3 = rVar2;
                            sgVar2 = sgVarD;
                            j14 = jD;
                            pVar4 = pVar;
                            r0Var2 = r0Var;
                            jVar2 = jVar;
                            lVar3 = lVar;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            final h4.r rVar12 = rVar3;
                            p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iT = p3.p0.t(i14 | 1);
                                    int iT2 = p3.p0.t(i15);
                                    p1.b(l0Var, rVar12, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    }
                    i17 |= C.ENCODING_PCM_32BIT;
                    i37 = i16 & 1024;
                    if (i37 != 0) {
                        i38 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(pVar2)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i38 = i15 | i39;
                    } else {
                        i38 = i15;
                    }
                    i44 = i16 & 2048;
                    if (i44 != 0) {
                        i38 |= 48;
                    } else if ((i15 & 48) != 0) {
                        if (o0VarE.B(r0Var)) {
                            i45 = 32;
                        } else {
                            i45 = 16;
                        }
                        i38 |= i45;
                    }
                    i46 = i38;
                    i47 = i17;
                    i48 = i16 & 4096;
                    if (i48 != 0) {
                        i54 = i46 | 384;
                    } else {
                        i49 = i46;
                        if ((i15 & 384) != 0) {
                            if (o0VarE.B(jVar)) {
                                i55 = 256;
                            } else {
                                i55 = 128;
                            }
                            i49 |= i55;
                        }
                        i54 = i49;
                    }
                    i56 = i16 & 8192;
                    if (i56 != 0) {
                        i58 = i54 | 3072;
                    } else {
                        i57 = i54;
                        if ((i15 & 3072) == 0) {
                            i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                        } else {
                            i58 = i57;
                        }
                    }
                    if ((i15 & 24576) != 0) {
                        i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                    }
                    int i61112 = i58;
                    if ((i47 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (o0VarE.n(i47 & 1, z18)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i61113 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i61113, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        } else {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i61114 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i61114, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        }
                        o0VarE.h0();
                        p3.x1 x1Var11 = p3.n.f135158a;
                        final m4.q qVar11 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                            /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                            /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                            /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2 = (p3.m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    p3.x1 x1Var12 = p3.n.f135158a;
                                    g6.f.a aVar = g6.f.f75994b;
                                    h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                    e23.l lVar5 = lVar4;
                                    boolean zB = mVar2.B(lVar5);
                                    Object objQ2 = mVar2.q();
                                    p3.m.a aVar2 = p3.m.f135153a;
                                    if (zB) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new k11.n(lVar5, 7);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                    m4.q qVar12 = qVar11;
                                    boolean zR = mVar2.r(qVar12);
                                    Object objQ3 = mVar2.q();
                                    if (zR) {
                                        objQ3 = new b82.k0(qVar12, 6);
                                        mVar2.K(objQ3);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            objQ3 = new b82.k0(qVar12, 6);
                                            mVar2.K(objQ3);
                                        }
                                    }
                                    p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                    boolean z28 = z25;
                                    if (!z28) {
                                        x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                    }
                                    Integer num5 = num4;
                                    boolean zB2 = mVar2.B(num5);
                                    e23.l lVar6 = lVar2;
                                    boolean zB3 = zB2 | mVar2.B(lVar6);
                                    Object objQ4 = mVar2.q();
                                    if (zB3) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ4 == p3.m.a.f135155b) {
                                            objQ4 = new i1(lVar6, 1, num5);
                                            mVar2.K(objQ4);
                                        }
                                    }
                                    eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, o0VarE), o0VarE, 12582912, 122);
                        o0Var = o0VarE;
                        str2 = str3;
                        num3 = num4;
                        z24 = z25;
                        pVar3 = pVar8;
                        pVar4 = pVar7;
                        r0Var2 = r0Var4;
                        a2Var3 = a2Var5;
                        z19 = z26;
                        jVar2 = jVar4;
                        sgVar2 = sgVar3;
                        lVar3 = lVar4;
                        j14 = j15;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        str2 = str;
                        pVar3 = pVar2;
                        num3 = num2;
                        z19 = z16;
                        z24 = z17;
                        a2Var3 = a2Var2;
                        rVar3 = rVar2;
                        sgVar2 = sgVarD;
                        j14 = jD;
                        pVar4 = pVar;
                        r0Var2 = r0Var;
                        jVar2 = jVar;
                        lVar3 = lVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        final h4.r rVar13 = rVar3;
                        p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                p1.b(l0Var, rVar13, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i17 |= 24576;
                z16 = z14;
                i28 = i16 & 32;
                if (i28 != 0) {
                    i17 |= 196608;
                    z17 = z15;
                } else {
                    z17 = z15;
                    if ((i14 & 196608) == 0) {
                        if (o0VarE.h(z17)) {
                            i29 = 131072;
                        } else {
                            i29 = 65536;
                        }
                        i17 |= i29;
                    }
                }
                i30 = i16 & 64;
                if (i30 != 0) {
                    i17 |= 1572864;
                    a2Var2 = a2Var;
                } else {
                    a2Var2 = a2Var;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.B(a2Var2)) {
                            i34 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i34 = 524288;
                        }
                        i17 |= i34;
                    }
                }
                if ((i14 & 12582912) == 0) {
                    jD = j8;
                    if ((i16 & 128) == 0) {
                        i59 = 4194304;
                    } else {
                        i59 = 4194304;
                    }
                    i17 |= i59;
                } else {
                    jD = j8;
                }
                if ((i14 & 100663296) == 0) {
                    if ((i16 & 256) == 0) {
                        sgVarD = sgVar;
                        if (o0VarE.B(sgVarD)) {
                        }
                        i17 |= i65;
                    } else {
                        sgVarD = sgVar;
                    }
                    i17 |= i65;
                } else {
                    sgVarD = sgVar;
                }
                i35 = i16 & 512;
                if (i35 != 0) {
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(pVar)) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i17 |= i36;
                    }
                    i37 = i16 & 1024;
                    if (i37 != 0) {
                        i38 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(pVar2)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i38 = i15 | i39;
                    } else {
                        i38 = i15;
                    }
                    i44 = i16 & 2048;
                    if (i44 != 0) {
                        i38 |= 48;
                    } else if ((i15 & 48) != 0) {
                        if (o0VarE.B(r0Var)) {
                            i45 = 32;
                        } else {
                            i45 = 16;
                        }
                        i38 |= i45;
                    }
                    i46 = i38;
                    i47 = i17;
                    i48 = i16 & 4096;
                    if (i48 != 0) {
                        i54 = i46 | 384;
                    } else {
                        i49 = i46;
                        if ((i15 & 384) != 0) {
                            if (o0VarE.B(jVar)) {
                                i55 = 256;
                            } else {
                                i55 = 128;
                            }
                            i49 |= i55;
                        }
                        i54 = i49;
                    }
                    i56 = i16 & 8192;
                    if (i56 != 0) {
                        i58 = i54 | 3072;
                    } else {
                        i57 = i54;
                        if ((i15 & 3072) == 0) {
                            i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                        } else {
                            i58 = i57;
                        }
                    }
                    if ((i15 & 24576) != 0) {
                        i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                    }
                    int i61115 = i58;
                    if ((i47 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (o0VarE.n(i47 & 1, z18)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i61116 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i61116, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        } else {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i61117 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i61117, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        }
                        o0VarE.h0();
                        p3.x1 x1Var12 = p3.n.f135158a;
                        final m4.q qVar12 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                            /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                            /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                            /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2 = (p3.m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    p3.x1 x1Var13 = p3.n.f135158a;
                                    g6.f.a aVar = g6.f.f75994b;
                                    h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                    e23.l lVar5 = lVar4;
                                    boolean zB = mVar2.B(lVar5);
                                    Object objQ2 = mVar2.q();
                                    p3.m.a aVar2 = p3.m.f135153a;
                                    if (zB) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new k11.n(lVar5, 7);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                    m4.q qVar13 = qVar12;
                                    boolean zR = mVar2.r(qVar13);
                                    Object objQ3 = mVar2.q();
                                    if (zR) {
                                        objQ3 = new b82.k0(qVar13, 6);
                                        mVar2.K(objQ3);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            objQ3 = new b82.k0(qVar13, 6);
                                            mVar2.K(objQ3);
                                        }
                                    }
                                    p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                    boolean z28 = z25;
                                    if (!z28) {
                                        x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                    }
                                    Integer num5 = num4;
                                    boolean zB2 = mVar2.B(num5);
                                    e23.l lVar6 = lVar2;
                                    boolean zB3 = zB2 | mVar2.B(lVar6);
                                    Object objQ4 = mVar2.q();
                                    if (zB3) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ4 == p3.m.a.f135155b) {
                                            objQ4 = new i1(lVar6, 1, num5);
                                            mVar2.K(objQ4);
                                        }
                                    }
                                    eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, o0VarE), o0VarE, 12582912, 122);
                        o0Var = o0VarE;
                        str2 = str3;
                        num3 = num4;
                        z24 = z25;
                        pVar3 = pVar8;
                        pVar4 = pVar7;
                        r0Var2 = r0Var4;
                        a2Var3 = a2Var5;
                        z19 = z26;
                        jVar2 = jVar4;
                        sgVar2 = sgVar3;
                        lVar3 = lVar4;
                        j14 = j15;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        str2 = str;
                        pVar3 = pVar2;
                        num3 = num2;
                        z19 = z16;
                        z24 = z17;
                        a2Var3 = a2Var2;
                        rVar3 = rVar2;
                        sgVar2 = sgVarD;
                        j14 = jD;
                        pVar4 = pVar;
                        r0Var2 = r0Var;
                        jVar2 = jVar;
                        lVar3 = lVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        final h4.r rVar14 = rVar3;
                        p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                p1.b(l0Var, rVar14, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i17 |= C.ENCODING_PCM_32BIT;
                i37 = i16 & 1024;
                if (i37 != 0) {
                    i38 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i15 | i39;
                } else {
                    i38 = i15;
                }
                i44 = i16 & 2048;
                if (i44 != 0) {
                    i38 |= 48;
                } else if ((i15 & 48) != 0) {
                    if (o0VarE.B(r0Var)) {
                        i45 = 32;
                    } else {
                        i45 = 16;
                    }
                    i38 |= i45;
                }
                i46 = i38;
                i47 = i17;
                i48 = i16 & 4096;
                if (i48 != 0) {
                    i54 = i46 | 384;
                } else {
                    i49 = i46;
                    if ((i15 & 384) != 0) {
                        if (o0VarE.B(jVar)) {
                            i55 = 256;
                        } else {
                            i55 = 128;
                        }
                        i49 |= i55;
                    }
                    i54 = i49;
                }
                i56 = i16 & 8192;
                if (i56 != 0) {
                    i58 = i54 | 3072;
                } else {
                    i57 = i54;
                    if ((i15 & 3072) == 0) {
                        i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                    } else {
                        i58 = i57;
                    }
                }
                if ((i15 & 24576) != 0) {
                    i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                }
                int i61118 = i58;
                if ((i47 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (o0VarE.n(i47 & 1, z18)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i61119 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i61119, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    } else {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i611110 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i611110, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    }
                    o0VarE.h0();
                    p3.x1 x1Var13 = p3.n.f135158a;
                    final m4.q qVar13 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                        /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                        /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                        /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                p3.x1 x1Var14 = p3.n.f135158a;
                                g6.f.a aVar = g6.f.f75994b;
                                h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                e23.l lVar5 = lVar4;
                                boolean zB = mVar2.B(lVar5);
                                Object objQ2 = mVar2.q();
                                p3.m.a aVar2 = p3.m.f135153a;
                                if (zB) {
                                    objQ2 = new k11.n(lVar5, 7);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar2.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    }
                                }
                                h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                m4.q qVar14 = qVar13;
                                boolean zR = mVar2.r(qVar14);
                                Object objQ3 = mVar2.q();
                                if (zR) {
                                    objQ3 = new b82.k0(qVar14, 6);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar2.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new b82.k0(qVar14, 6);
                                        mVar2.K(objQ3);
                                    }
                                }
                                p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                boolean z28 = z25;
                                if (!z28) {
                                    x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                }
                                Integer num5 = num4;
                                boolean zB2 = mVar2.B(num5);
                                e23.l lVar6 = lVar2;
                                boolean zB3 = zB2 | mVar2.B(lVar6);
                                Object objQ4 = mVar2.q();
                                if (zB3) {
                                    objQ4 = new i1(lVar6, 1, num5);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar2.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    }
                                }
                                eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, 12582912, 122);
                    o0Var = o0VarE;
                    str2 = str3;
                    num3 = num4;
                    z24 = z25;
                    pVar3 = pVar8;
                    pVar4 = pVar7;
                    r0Var2 = r0Var4;
                    a2Var3 = a2Var5;
                    z19 = z26;
                    jVar2 = jVar4;
                    sgVar2 = sgVar3;
                    lVar3 = lVar4;
                    j14 = j15;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    str2 = str;
                    pVar3 = pVar2;
                    num3 = num2;
                    z19 = z16;
                    z24 = z17;
                    a2Var3 = a2Var2;
                    rVar3 = rVar2;
                    sgVar2 = sgVarD;
                    j14 = jD;
                    pVar4 = pVar;
                    r0Var2 = r0Var;
                    jVar2 = jVar;
                    lVar3 = lVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    final h4.r rVar15 = rVar3;
                    p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            p1.b(l0Var, rVar15, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i17 |= 3072;
            num2 = num;
            i26 = i16 & 16;
            if (i26 != 0) {
                if ((i14 & 24576) == 0) {
                    z16 = z14;
                    if (o0VarE.h(z16)) {
                        i27 = 16384;
                    } else {
                        i27 = 8192;
                    }
                    i17 |= i27;
                }
                i28 = i16 & 32;
                if (i28 != 0) {
                    i17 |= 196608;
                    z17 = z15;
                } else {
                    z17 = z15;
                    if ((i14 & 196608) == 0) {
                        if (o0VarE.h(z17)) {
                            i29 = 131072;
                        } else {
                            i29 = 65536;
                        }
                        i17 |= i29;
                    }
                }
                i30 = i16 & 64;
                if (i30 != 0) {
                    i17 |= 1572864;
                    a2Var2 = a2Var;
                } else {
                    a2Var2 = a2Var;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.B(a2Var2)) {
                            i34 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i34 = 524288;
                        }
                        i17 |= i34;
                    }
                }
                if ((i14 & 12582912) == 0) {
                    jD = j8;
                    if ((i16 & 128) == 0) {
                        i59 = 4194304;
                    } else {
                        i59 = 4194304;
                    }
                    i17 |= i59;
                } else {
                    jD = j8;
                }
                if ((i14 & 100663296) == 0) {
                    if ((i16 & 256) == 0) {
                        sgVarD = sgVar;
                        if (o0VarE.B(sgVarD)) {
                        }
                        i17 |= i65;
                    } else {
                        sgVarD = sgVar;
                    }
                    i17 |= i65;
                } else {
                    sgVarD = sgVar;
                }
                i35 = i16 & 512;
                if (i35 != 0) {
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(pVar)) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i17 |= i36;
                    }
                    i37 = i16 & 1024;
                    if (i37 != 0) {
                        i38 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(pVar2)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i38 = i15 | i39;
                    } else {
                        i38 = i15;
                    }
                    i44 = i16 & 2048;
                    if (i44 != 0) {
                        i38 |= 48;
                    } else if ((i15 & 48) != 0) {
                        if (o0VarE.B(r0Var)) {
                            i45 = 32;
                        } else {
                            i45 = 16;
                        }
                        i38 |= i45;
                    }
                    i46 = i38;
                    i47 = i17;
                    i48 = i16 & 4096;
                    if (i48 != 0) {
                        i54 = i46 | 384;
                    } else {
                        i49 = i46;
                        if ((i15 & 384) != 0) {
                            if (o0VarE.B(jVar)) {
                                i55 = 256;
                            } else {
                                i55 = 128;
                            }
                            i49 |= i55;
                        }
                        i54 = i49;
                    }
                    i56 = i16 & 8192;
                    if (i56 != 0) {
                        i58 = i54 | 3072;
                    } else {
                        i57 = i54;
                        if ((i15 & 3072) == 0) {
                            i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                        } else {
                            i58 = i57;
                        }
                    }
                    if ((i15 & 24576) != 0) {
                        i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                    }
                    int i611111 = i58;
                    if ((i47 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (o0VarE.n(i47 & 1, z18)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i611112 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i611112, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        } else {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i611113 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i611113, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        }
                        o0VarE.h0();
                        p3.x1 x1Var14 = p3.n.f135158a;
                        final m4.q qVar14 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                            /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                            /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                            /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2 = (p3.m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    p3.x1 x1Var15 = p3.n.f135158a;
                                    g6.f.a aVar = g6.f.f75994b;
                                    h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                    e23.l lVar5 = lVar4;
                                    boolean zB = mVar2.B(lVar5);
                                    Object objQ2 = mVar2.q();
                                    p3.m.a aVar2 = p3.m.f135153a;
                                    if (zB) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new k11.n(lVar5, 7);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                    m4.q qVar15 = qVar14;
                                    boolean zR = mVar2.r(qVar15);
                                    Object objQ3 = mVar2.q();
                                    if (zR) {
                                        objQ3 = new b82.k0(qVar15, 6);
                                        mVar2.K(objQ3);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            objQ3 = new b82.k0(qVar15, 6);
                                            mVar2.K(objQ3);
                                        }
                                    }
                                    p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                    boolean z28 = z25;
                                    if (!z28) {
                                        x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                    }
                                    Integer num5 = num4;
                                    boolean zB2 = mVar2.B(num5);
                                    e23.l lVar6 = lVar2;
                                    boolean zB3 = zB2 | mVar2.B(lVar6);
                                    Object objQ4 = mVar2.q();
                                    if (zB3) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ4 == p3.m.a.f135155b) {
                                            objQ4 = new i1(lVar6, 1, num5);
                                            mVar2.K(objQ4);
                                        }
                                    }
                                    eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, o0VarE), o0VarE, 12582912, 122);
                        o0Var = o0VarE;
                        str2 = str3;
                        num3 = num4;
                        z24 = z25;
                        pVar3 = pVar8;
                        pVar4 = pVar7;
                        r0Var2 = r0Var4;
                        a2Var3 = a2Var5;
                        z19 = z26;
                        jVar2 = jVar4;
                        sgVar2 = sgVar3;
                        lVar3 = lVar4;
                        j14 = j15;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        str2 = str;
                        pVar3 = pVar2;
                        num3 = num2;
                        z19 = z16;
                        z24 = z17;
                        a2Var3 = a2Var2;
                        rVar3 = rVar2;
                        sgVar2 = sgVarD;
                        j14 = jD;
                        pVar4 = pVar;
                        r0Var2 = r0Var;
                        jVar2 = jVar;
                        lVar3 = lVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        final h4.r rVar16 = rVar3;
                        p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                p1.b(l0Var, rVar16, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i17 |= C.ENCODING_PCM_32BIT;
                i37 = i16 & 1024;
                if (i37 != 0) {
                    i38 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i15 | i39;
                } else {
                    i38 = i15;
                }
                i44 = i16 & 2048;
                if (i44 != 0) {
                    i38 |= 48;
                } else if ((i15 & 48) != 0) {
                    if (o0VarE.B(r0Var)) {
                        i45 = 32;
                    } else {
                        i45 = 16;
                    }
                    i38 |= i45;
                }
                i46 = i38;
                i47 = i17;
                i48 = i16 & 4096;
                if (i48 != 0) {
                    i54 = i46 | 384;
                } else {
                    i49 = i46;
                    if ((i15 & 384) != 0) {
                        if (o0VarE.B(jVar)) {
                            i55 = 256;
                        } else {
                            i55 = 128;
                        }
                        i49 |= i55;
                    }
                    i54 = i49;
                }
                i56 = i16 & 8192;
                if (i56 != 0) {
                    i58 = i54 | 3072;
                } else {
                    i57 = i54;
                    if ((i15 & 3072) == 0) {
                        i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                    } else {
                        i58 = i57;
                    }
                }
                if ((i15 & 24576) != 0) {
                    i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                }
                int i611114 = i58;
                if ((i47 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (o0VarE.n(i47 & 1, z18)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i611115 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i611115, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    } else {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i611116 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i611116, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    }
                    o0VarE.h0();
                    p3.x1 x1Var15 = p3.n.f135158a;
                    final m4.q qVar15 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                        /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                        /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                        /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                p3.x1 x1Var16 = p3.n.f135158a;
                                g6.f.a aVar = g6.f.f75994b;
                                h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                e23.l lVar5 = lVar4;
                                boolean zB = mVar2.B(lVar5);
                                Object objQ2 = mVar2.q();
                                p3.m.a aVar2 = p3.m.f135153a;
                                if (zB) {
                                    objQ2 = new k11.n(lVar5, 7);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar2.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    }
                                }
                                h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                m4.q qVar16 = qVar15;
                                boolean zR = mVar2.r(qVar16);
                                Object objQ3 = mVar2.q();
                                if (zR) {
                                    objQ3 = new b82.k0(qVar16, 6);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar2.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new b82.k0(qVar16, 6);
                                        mVar2.K(objQ3);
                                    }
                                }
                                p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                boolean z28 = z25;
                                if (!z28) {
                                    x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                }
                                Integer num5 = num4;
                                boolean zB2 = mVar2.B(num5);
                                e23.l lVar6 = lVar2;
                                boolean zB3 = zB2 | mVar2.B(lVar6);
                                Object objQ4 = mVar2.q();
                                if (zB3) {
                                    objQ4 = new i1(lVar6, 1, num5);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar2.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    }
                                }
                                eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, 12582912, 122);
                    o0Var = o0VarE;
                    str2 = str3;
                    num3 = num4;
                    z24 = z25;
                    pVar3 = pVar8;
                    pVar4 = pVar7;
                    r0Var2 = r0Var4;
                    a2Var3 = a2Var5;
                    z19 = z26;
                    jVar2 = jVar4;
                    sgVar2 = sgVar3;
                    lVar3 = lVar4;
                    j14 = j15;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    str2 = str;
                    pVar3 = pVar2;
                    num3 = num2;
                    z19 = z16;
                    z24 = z17;
                    a2Var3 = a2Var2;
                    rVar3 = rVar2;
                    sgVar2 = sgVarD;
                    j14 = jD;
                    pVar4 = pVar;
                    r0Var2 = r0Var;
                    jVar2 = jVar;
                    lVar3 = lVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    final h4.r rVar17 = rVar3;
                    p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            p1.b(l0Var, rVar17, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i17 |= 24576;
            z16 = z14;
            i28 = i16 & 32;
            if (i28 != 0) {
                i17 |= 196608;
                z17 = z15;
            } else {
                z17 = z15;
                if ((i14 & 196608) == 0) {
                    if (o0VarE.h(z17)) {
                        i29 = 131072;
                    } else {
                        i29 = 65536;
                    }
                    i17 |= i29;
                }
            }
            i30 = i16 & 64;
            if (i30 != 0) {
                i17 |= 1572864;
                a2Var2 = a2Var;
            } else {
                a2Var2 = a2Var;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.B(a2Var2)) {
                        i34 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i34 = 524288;
                    }
                    i17 |= i34;
                }
            }
            if ((i14 & 12582912) == 0) {
                jD = j8;
                if ((i16 & 128) == 0) {
                    i59 = 4194304;
                } else {
                    i59 = 4194304;
                }
                i17 |= i59;
            } else {
                jD = j8;
            }
            if ((i14 & 100663296) == 0) {
                if ((i16 & 256) == 0) {
                    sgVarD = sgVar;
                    if (o0VarE.B(sgVarD)) {
                    }
                    i17 |= i65;
                } else {
                    sgVarD = sgVar;
                }
                i17 |= i65;
            } else {
                sgVarD = sgVar;
            }
            i35 = i16 & 512;
            if (i35 != 0) {
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(pVar)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i17 |= i36;
                }
                i37 = i16 & 1024;
                if (i37 != 0) {
                    i38 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i15 | i39;
                } else {
                    i38 = i15;
                }
                i44 = i16 & 2048;
                if (i44 != 0) {
                    i38 |= 48;
                } else if ((i15 & 48) != 0) {
                    if (o0VarE.B(r0Var)) {
                        i45 = 32;
                    } else {
                        i45 = 16;
                    }
                    i38 |= i45;
                }
                i46 = i38;
                i47 = i17;
                i48 = i16 & 4096;
                if (i48 != 0) {
                    i54 = i46 | 384;
                } else {
                    i49 = i46;
                    if ((i15 & 384) != 0) {
                        if (o0VarE.B(jVar)) {
                            i55 = 256;
                        } else {
                            i55 = 128;
                        }
                        i49 |= i55;
                    }
                    i54 = i49;
                }
                i56 = i16 & 8192;
                if (i56 != 0) {
                    i58 = i54 | 3072;
                } else {
                    i57 = i54;
                    if ((i15 & 3072) == 0) {
                        i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                    } else {
                        i58 = i57;
                    }
                }
                if ((i15 & 24576) != 0) {
                    i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                }
                int i611117 = i58;
                if ((i47 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (o0VarE.n(i47 & 1, z18)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i611118 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i611118, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    } else {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i611119 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i611119, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    }
                    o0VarE.h0();
                    p3.x1 x1Var16 = p3.n.f135158a;
                    final m4.q qVar16 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                        /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                        /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                        /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                p3.x1 x1Var17 = p3.n.f135158a;
                                g6.f.a aVar = g6.f.f75994b;
                                h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                e23.l lVar5 = lVar4;
                                boolean zB = mVar2.B(lVar5);
                                Object objQ2 = mVar2.q();
                                p3.m.a aVar2 = p3.m.f135153a;
                                if (zB) {
                                    objQ2 = new k11.n(lVar5, 7);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar2.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    }
                                }
                                h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                m4.q qVar17 = qVar16;
                                boolean zR = mVar2.r(qVar17);
                                Object objQ3 = mVar2.q();
                                if (zR) {
                                    objQ3 = new b82.k0(qVar17, 6);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar2.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new b82.k0(qVar17, 6);
                                        mVar2.K(objQ3);
                                    }
                                }
                                p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                boolean z28 = z25;
                                if (!z28) {
                                    x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                }
                                Integer num5 = num4;
                                boolean zB2 = mVar2.B(num5);
                                e23.l lVar6 = lVar2;
                                boolean zB3 = zB2 | mVar2.B(lVar6);
                                Object objQ4 = mVar2.q();
                                if (zB3) {
                                    objQ4 = new i1(lVar6, 1, num5);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar2.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    }
                                }
                                eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, 12582912, 122);
                    o0Var = o0VarE;
                    str2 = str3;
                    num3 = num4;
                    z24 = z25;
                    pVar3 = pVar8;
                    pVar4 = pVar7;
                    r0Var2 = r0Var4;
                    a2Var3 = a2Var5;
                    z19 = z26;
                    jVar2 = jVar4;
                    sgVar2 = sgVar3;
                    lVar3 = lVar4;
                    j14 = j15;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    str2 = str;
                    pVar3 = pVar2;
                    num3 = num2;
                    z19 = z16;
                    z24 = z17;
                    a2Var3 = a2Var2;
                    rVar3 = rVar2;
                    sgVar2 = sgVarD;
                    j14 = jD;
                    pVar4 = pVar;
                    r0Var2 = r0Var;
                    jVar2 = jVar;
                    lVar3 = lVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    final h4.r rVar18 = rVar3;
                    p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            p1.b(l0Var, rVar18, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i17 |= C.ENCODING_PCM_32BIT;
            i37 = i16 & 1024;
            if (i37 != 0) {
                i38 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.r(pVar2)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i38 = i15 | i39;
            } else {
                i38 = i15;
            }
            i44 = i16 & 2048;
            if (i44 != 0) {
                i38 |= 48;
            } else if ((i15 & 48) != 0) {
                if (o0VarE.B(r0Var)) {
                    i45 = 32;
                } else {
                    i45 = 16;
                }
                i38 |= i45;
            }
            i46 = i38;
            i47 = i17;
            i48 = i16 & 4096;
            if (i48 != 0) {
                i54 = i46 | 384;
            } else {
                i49 = i46;
                if ((i15 & 384) != 0) {
                    if (o0VarE.B(jVar)) {
                        i55 = 256;
                    } else {
                        i55 = 128;
                    }
                    i49 |= i55;
                }
                i54 = i49;
            }
            i56 = i16 & 8192;
            if (i56 != 0) {
                i58 = i54 | 3072;
            } else {
                i57 = i54;
                if ((i15 & 3072) == 0) {
                    i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                } else {
                    i58 = i57;
                }
            }
            if ((i15 & 24576) != 0) {
                i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
            }
            int i6111110 = i58;
            if ((i47 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (o0VarE.n(i47 & 1, z18)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i64 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i24 != 0) {
                        num2 = null;
                    }
                    if (i26 != 0) {
                        z16 = true;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        x5.v.f188954b.getClass();
                        int i6111111 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        a2Var4 = new p006l2.a2(0, (Boolean) null, i6111111, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    } else {
                        a2Var4 = a2Var2;
                    }
                    if ((i16 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        jD = d92.b.a(o0VarE).k().d();
                    }
                    if ((i16 & 256) != 0) {
                        sgVarD = d(o0VarE);
                    }
                    if (i35 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i37 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i44 != 0) {
                        x5.r0.f188941a.getClass();
                        r0Var3 = x5.r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    if (i48 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar3 = (a2.j) objQ;
                    } else {
                        jVar3 = jVar;
                    }
                    r0Var4 = r0Var3;
                    jVar4 = jVar3;
                    sgVar3 = sgVarD;
                    j15 = jD;
                    z25 = z27;
                    if (i56 != 0) {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = null;
                    } else {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = lVar;
                    }
                } else {
                    if (i64 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i24 != 0) {
                        num2 = null;
                    }
                    if (i26 != 0) {
                        z16 = true;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        x5.v.f188954b.getClass();
                        int i6111112 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        a2Var4 = new p006l2.a2(0, (Boolean) null, i6111112, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    } else {
                        a2Var4 = a2Var2;
                    }
                    if ((i16 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        jD = d92.b.a(o0VarE).k().d();
                    }
                    if ((i16 & 256) != 0) {
                        sgVarD = d(o0VarE);
                    }
                    if (i35 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i37 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i44 != 0) {
                        x5.r0.f188941a.getClass();
                        r0Var3 = x5.r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    if (i48 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar3 = (a2.j) objQ;
                    } else {
                        jVar3 = jVar;
                    }
                    r0Var4 = r0Var3;
                    jVar4 = jVar3;
                    sgVar3 = sgVarD;
                    j15 = jD;
                    z25 = z27;
                    if (i56 != 0) {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = null;
                    } else {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = lVar;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var17 = p3.n.f135158a;
                final m4.q qVar17 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            p3.x1 x1Var18 = p3.n.f135158a;
                            g6.f.a aVar = g6.f.f75994b;
                            h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                            e23.l lVar5 = lVar4;
                            boolean zB = mVar2.B(lVar5);
                            Object objQ2 = mVar2.q();
                            p3.m.a aVar2 = p3.m.f135153a;
                            if (zB) {
                                objQ2 = new k11.n(lVar5, 7);
                                mVar2.K(objQ2);
                            } else {
                                aVar2.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new k11.n(lVar5, 7);
                                    mVar2.K(objQ2);
                                }
                            }
                            h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                            m4.q qVar18 = qVar17;
                            boolean zR = mVar2.r(qVar18);
                            Object objQ3 = mVar2.q();
                            if (zR) {
                                objQ3 = new b82.k0(qVar18, 6);
                                mVar2.K(objQ3);
                            } else {
                                aVar2.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new b82.k0(qVar18, 6);
                                    mVar2.K(objQ3);
                                }
                            }
                            p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                            boolean z28 = z25;
                            if (!z28) {
                                x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                            }
                            Integer num5 = num4;
                            boolean zB2 = mVar2.B(num5);
                            e23.l lVar6 = lVar2;
                            boolean zB3 = zB2 | mVar2.B(lVar6);
                            Object objQ4 = mVar2.q();
                            if (zB3) {
                                objQ4 = new i1(lVar6, 1, num5);
                                mVar2.K(objQ4);
                            } else {
                                aVar2.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new i1(lVar6, 1, num5);
                                    mVar2.K(objQ4);
                                }
                            }
                            eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 12582912, 122);
                o0Var = o0VarE;
                str2 = str3;
                num3 = num4;
                z24 = z25;
                pVar3 = pVar8;
                pVar4 = pVar7;
                r0Var2 = r0Var4;
                a2Var3 = a2Var5;
                z19 = z26;
                jVar2 = jVar4;
                sgVar2 = sgVar3;
                lVar3 = lVar4;
                j14 = j15;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str2 = str;
                pVar3 = pVar2;
                num3 = num2;
                z19 = z16;
                z24 = z17;
                a2Var3 = a2Var2;
                rVar3 = rVar2;
                sgVar2 = sgVarD;
                j14 = jD;
                pVar4 = pVar;
                r0Var2 = r0Var;
                jVar2 = jVar;
                lVar3 = lVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                final h4.r rVar19 = rVar3;
                p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        p1.b(l0Var, rVar19, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i17 |= 48;
        rVar2 = rVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i14 & 384) == 0) {
                if (o0VarE.B(str)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i24 = i16 & 8;
            if (i24 != 0) {
                if ((i14 & 3072) == 0) {
                    num2 = num;
                    if (o0VarE.B(num2)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i17 |= i25;
                }
                i26 = i16 & 16;
                if (i26 != 0) {
                    if ((i14 & 24576) == 0) {
                        z16 = z14;
                        if (o0VarE.h(z16)) {
                            i27 = 16384;
                        } else {
                            i27 = 8192;
                        }
                        i17 |= i27;
                    }
                    i28 = i16 & 32;
                    if (i28 != 0) {
                        i17 |= 196608;
                        z17 = z15;
                    } else {
                        z17 = z15;
                        if ((i14 & 196608) == 0) {
                            if (o0VarE.h(z17)) {
                                i29 = 131072;
                            } else {
                                i29 = 65536;
                            }
                            i17 |= i29;
                        }
                    }
                    i30 = i16 & 64;
                    if (i30 != 0) {
                        i17 |= 1572864;
                        a2Var2 = a2Var;
                    } else {
                        a2Var2 = a2Var;
                        if ((i14 & 1572864) == 0) {
                            if (o0VarE.B(a2Var2)) {
                                i34 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            } else {
                                i34 = 524288;
                            }
                            i17 |= i34;
                        }
                    }
                    if ((i14 & 12582912) == 0) {
                        jD = j8;
                        if ((i16 & 128) == 0) {
                            i59 = 4194304;
                        } else {
                            i59 = 4194304;
                        }
                        i17 |= i59;
                    } else {
                        jD = j8;
                    }
                    if ((i14 & 100663296) == 0) {
                        if ((i16 & 256) == 0) {
                            sgVarD = sgVar;
                            if (o0VarE.B(sgVarD)) {
                            }
                            i17 |= i65;
                        } else {
                            sgVarD = sgVar;
                        }
                        i17 |= i65;
                    } else {
                        sgVarD = sgVar;
                    }
                    i35 = i16 & 512;
                    if (i35 != 0) {
                        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarE.r(pVar)) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i17 |= i36;
                        }
                        i37 = i16 & 1024;
                        if (i37 != 0) {
                            i38 = i15 | 6;
                        } else if ((i15 & 6) == 0) {
                            if (o0VarE.r(pVar2)) {
                                i39 = 4;
                            } else {
                                i39 = 2;
                            }
                            i38 = i15 | i39;
                        } else {
                            i38 = i15;
                        }
                        i44 = i16 & 2048;
                        if (i44 != 0) {
                            i38 |= 48;
                        } else if ((i15 & 48) != 0) {
                            if (o0VarE.B(r0Var)) {
                                i45 = 32;
                            } else {
                                i45 = 16;
                            }
                            i38 |= i45;
                        }
                        i46 = i38;
                        i47 = i17;
                        i48 = i16 & 4096;
                        if (i48 != 0) {
                            i54 = i46 | 384;
                        } else {
                            i49 = i46;
                            if ((i15 & 384) != 0) {
                                if (o0VarE.B(jVar)) {
                                    i55 = 256;
                                } else {
                                    i55 = 128;
                                }
                                i49 |= i55;
                            }
                            i54 = i49;
                        }
                        i56 = i16 & 8192;
                        if (i56 != 0) {
                            i58 = i54 | 3072;
                        } else {
                            i57 = i54;
                            if ((i15 & 3072) == 0) {
                                i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                            } else {
                                i58 = i57;
                            }
                        }
                        if ((i15 & 24576) != 0) {
                            i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                        }
                        int i6111113 = i58;
                        if ((i47 & 306783379) == 306783378) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        if (o0VarE.n(i47 & 1, z18)) {
                            o0VarE.G0();
                            if ((i14 & 1) != 0) {
                                if (i64 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar2;
                                }
                                if (i18 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i24 != 0) {
                                    num2 = null;
                                }
                                if (i26 != 0) {
                                    z16 = true;
                                }
                                if (i28 == 0) {
                                }
                                if (i30 != 0) {
                                    x5.v.f188954b.getClass();
                                    int i6111114 = x5.v.f188955c;
                                    x5.p.f188918b.getClass();
                                    a2Var4 = new p006l2.a2(0, (Boolean) null, i6111114, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                                } else {
                                    a2Var4 = a2Var2;
                                }
                                if ((i16 & 128) != 0) {
                                    d92.b.f58623a.getClass();
                                    jD = d92.b.a(o0VarE).k().d();
                                }
                                if ((i16 & 256) != 0) {
                                    sgVarD = d(o0VarE);
                                }
                                if (i35 != 0) {
                                    pVar5 = null;
                                } else {
                                    pVar5 = pVar;
                                }
                                if (i37 != 0) {
                                    pVar6 = null;
                                } else {
                                    pVar6 = pVar2;
                                }
                                if (i44 != 0) {
                                    x5.r0.f188941a.getClass();
                                    r0Var3 = x5.r0.a.f188943b;
                                } else {
                                    r0Var3 = r0Var;
                                }
                                if (i48 != 0) {
                                    objQ = o0VarE.q();
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = kg.f.b(o0VarE);
                                    }
                                    jVar3 = (a2.j) objQ;
                                } else {
                                    jVar3 = jVar;
                                }
                                r0Var4 = r0Var3;
                                jVar4 = jVar3;
                                sgVar3 = sgVarD;
                                j15 = jD;
                                z25 = z27;
                                if (i56 != 0) {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = null;
                                } else {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = lVar;
                                }
                            } else {
                                if (i64 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar2;
                                }
                                if (i18 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                if (i24 != 0) {
                                    num2 = null;
                                }
                                if (i26 != 0) {
                                    z16 = true;
                                }
                                if (i28 == 0) {
                                }
                                if (i30 != 0) {
                                    x5.v.f188954b.getClass();
                                    int i6111115 = x5.v.f188955c;
                                    x5.p.f188918b.getClass();
                                    a2Var4 = new p006l2.a2(0, (Boolean) null, i6111115, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                                } else {
                                    a2Var4 = a2Var2;
                                }
                                if ((i16 & 128) != 0) {
                                    d92.b.f58623a.getClass();
                                    jD = d92.b.a(o0VarE).k().d();
                                }
                                if ((i16 & 256) != 0) {
                                    sgVarD = d(o0VarE);
                                }
                                if (i35 != 0) {
                                    pVar5 = null;
                                } else {
                                    pVar5 = pVar;
                                }
                                if (i37 != 0) {
                                    pVar6 = null;
                                } else {
                                    pVar6 = pVar2;
                                }
                                if (i44 != 0) {
                                    x5.r0.f188941a.getClass();
                                    r0Var3 = x5.r0.a.f188943b;
                                } else {
                                    r0Var3 = r0Var;
                                }
                                if (i48 != 0) {
                                    objQ = o0VarE.q();
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = kg.f.b(o0VarE);
                                    }
                                    jVar3 = (a2.j) objQ;
                                } else {
                                    jVar3 = jVar;
                                }
                                r0Var4 = r0Var3;
                                jVar4 = jVar3;
                                sgVar3 = sgVarD;
                                j15 = jD;
                                z25 = z27;
                                if (i56 != 0) {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = null;
                                } else {
                                    a2Var5 = a2Var4;
                                    num4 = num2;
                                    z26 = z16;
                                    pVar7 = pVar5;
                                    pVar8 = pVar6;
                                    lVar4 = lVar;
                                }
                            }
                            o0VarE.h0();
                            p3.x1 x1Var18 = p3.n.f135158a;
                            final m4.q qVar18 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                            if (str3 == null) {
                                str4 = "";
                            } else {
                                str4 = str3;
                            }
                            ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                                /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                                /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                                /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    p3.m mVar2 = (p3.m) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        p3.x1 x1Var19 = p3.n.f135158a;
                                        g6.f.a aVar = g6.f.f75994b;
                                        h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                        e23.l lVar5 = lVar4;
                                        boolean zB = mVar2.B(lVar5);
                                        Object objQ2 = mVar2.q();
                                        p3.m.a aVar2 = p3.m.f135153a;
                                        if (zB) {
                                            objQ2 = new k11.n(lVar5, 7);
                                            mVar2.K(objQ2);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ2 == p3.m.a.f135155b) {
                                                objQ2 = new k11.n(lVar5, 7);
                                                mVar2.K(objQ2);
                                            }
                                        }
                                        h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                        m4.q qVar19 = qVar18;
                                        boolean zR = mVar2.r(qVar19);
                                        Object objQ3 = mVar2.q();
                                        if (zR) {
                                            objQ3 = new b82.k0(qVar19, 6);
                                            mVar2.K(objQ3);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ3 == p3.m.a.f135155b) {
                                                objQ3 = new b82.k0(qVar19, 6);
                                                mVar2.K(objQ3);
                                            }
                                        }
                                        p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58624b.getClass();
                                        s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                        boolean z28 = z25;
                                        if (!z28) {
                                            x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                        }
                                        Integer num5 = num4;
                                        boolean zB2 = mVar2.B(num5);
                                        e23.l lVar6 = lVar2;
                                        boolean zB3 = zB2 | mVar2.B(lVar6);
                                        Object objQ4 = mVar2.q();
                                        if (zB3) {
                                            objQ4 = new i1(lVar6, 1, num5);
                                            mVar2.K(objQ4);
                                        } else {
                                            aVar2.getClass();
                                            if (objQ4 == p3.m.a.f135155b) {
                                                objQ4 = new i1(lVar6, 1, num5);
                                                mVar2.K(objQ4);
                                            }
                                        }
                                        eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                                    } else {
                                        mVar2.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, o0VarE), o0VarE, 12582912, 122);
                            o0Var = o0VarE;
                            str2 = str3;
                            num3 = num4;
                            z24 = z25;
                            pVar3 = pVar8;
                            pVar4 = pVar7;
                            r0Var2 = r0Var4;
                            a2Var3 = a2Var5;
                            z19 = z26;
                            jVar2 = jVar4;
                            sgVar2 = sgVar3;
                            lVar3 = lVar4;
                            j14 = j15;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            str2 = str;
                            pVar3 = pVar2;
                            num3 = num2;
                            z19 = z16;
                            z24 = z17;
                            a2Var3 = a2Var2;
                            rVar3 = rVar2;
                            sgVar2 = sgVarD;
                            j14 = jD;
                            pVar4 = pVar;
                            r0Var2 = r0Var;
                            jVar2 = jVar;
                            lVar3 = lVar;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            final h4.r rVar110 = rVar3;
                            p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iT = p3.p0.t(i14 | 1);
                                    int iT2 = p3.p0.t(i15);
                                    p1.b(l0Var, rVar110, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    }
                    i17 |= C.ENCODING_PCM_32BIT;
                    i37 = i16 & 1024;
                    if (i37 != 0) {
                        i38 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(pVar2)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i38 = i15 | i39;
                    } else {
                        i38 = i15;
                    }
                    i44 = i16 & 2048;
                    if (i44 != 0) {
                        i38 |= 48;
                    } else if ((i15 & 48) != 0) {
                        if (o0VarE.B(r0Var)) {
                            i45 = 32;
                        } else {
                            i45 = 16;
                        }
                        i38 |= i45;
                    }
                    i46 = i38;
                    i47 = i17;
                    i48 = i16 & 4096;
                    if (i48 != 0) {
                        i54 = i46 | 384;
                    } else {
                        i49 = i46;
                        if ((i15 & 384) != 0) {
                            if (o0VarE.B(jVar)) {
                                i55 = 256;
                            } else {
                                i55 = 128;
                            }
                            i49 |= i55;
                        }
                        i54 = i49;
                    }
                    i56 = i16 & 8192;
                    if (i56 != 0) {
                        i58 = i54 | 3072;
                    } else {
                        i57 = i54;
                        if ((i15 & 3072) == 0) {
                            i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                        } else {
                            i58 = i57;
                        }
                    }
                    if ((i15 & 24576) != 0) {
                        i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                    }
                    int i6111116 = i58;
                    if ((i47 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (o0VarE.n(i47 & 1, z18)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i6111117 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i6111117, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        } else {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i6111118 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i6111118, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        }
                        o0VarE.h0();
                        p3.x1 x1Var19 = p3.n.f135158a;
                        final m4.q qVar19 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                            /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                            /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                            /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2 = (p3.m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    p3.x1 x1Var110 = p3.n.f135158a;
                                    g6.f.a aVar = g6.f.f75994b;
                                    h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                    e23.l lVar5 = lVar4;
                                    boolean zB = mVar2.B(lVar5);
                                    Object objQ2 = mVar2.q();
                                    p3.m.a aVar2 = p3.m.f135153a;
                                    if (zB) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new k11.n(lVar5, 7);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                    m4.q qVar110 = qVar19;
                                    boolean zR = mVar2.r(qVar110);
                                    Object objQ3 = mVar2.q();
                                    if (zR) {
                                        objQ3 = new b82.k0(qVar110, 6);
                                        mVar2.K(objQ3);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            objQ3 = new b82.k0(qVar110, 6);
                                            mVar2.K(objQ3);
                                        }
                                    }
                                    p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                    boolean z28 = z25;
                                    if (!z28) {
                                        x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                    }
                                    Integer num5 = num4;
                                    boolean zB2 = mVar2.B(num5);
                                    e23.l lVar6 = lVar2;
                                    boolean zB3 = zB2 | mVar2.B(lVar6);
                                    Object objQ4 = mVar2.q();
                                    if (zB3) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ4 == p3.m.a.f135155b) {
                                            objQ4 = new i1(lVar6, 1, num5);
                                            mVar2.K(objQ4);
                                        }
                                    }
                                    eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, o0VarE), o0VarE, 12582912, 122);
                        o0Var = o0VarE;
                        str2 = str3;
                        num3 = num4;
                        z24 = z25;
                        pVar3 = pVar8;
                        pVar4 = pVar7;
                        r0Var2 = r0Var4;
                        a2Var3 = a2Var5;
                        z19 = z26;
                        jVar2 = jVar4;
                        sgVar2 = sgVar3;
                        lVar3 = lVar4;
                        j14 = j15;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        str2 = str;
                        pVar3 = pVar2;
                        num3 = num2;
                        z19 = z16;
                        z24 = z17;
                        a2Var3 = a2Var2;
                        rVar3 = rVar2;
                        sgVar2 = sgVarD;
                        j14 = jD;
                        pVar4 = pVar;
                        r0Var2 = r0Var;
                        jVar2 = jVar;
                        lVar3 = lVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        final h4.r rVar111 = rVar3;
                        p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                p1.b(l0Var, rVar111, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i17 |= 24576;
                z16 = z14;
                i28 = i16 & 32;
                if (i28 != 0) {
                    i17 |= 196608;
                    z17 = z15;
                } else {
                    z17 = z15;
                    if ((i14 & 196608) == 0) {
                        if (o0VarE.h(z17)) {
                            i29 = 131072;
                        } else {
                            i29 = 65536;
                        }
                        i17 |= i29;
                    }
                }
                i30 = i16 & 64;
                if (i30 != 0) {
                    i17 |= 1572864;
                    a2Var2 = a2Var;
                } else {
                    a2Var2 = a2Var;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.B(a2Var2)) {
                            i34 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i34 = 524288;
                        }
                        i17 |= i34;
                    }
                }
                if ((i14 & 12582912) == 0) {
                    jD = j8;
                    if ((i16 & 128) == 0) {
                        i59 = 4194304;
                    } else {
                        i59 = 4194304;
                    }
                    i17 |= i59;
                } else {
                    jD = j8;
                }
                if ((i14 & 100663296) == 0) {
                    if ((i16 & 256) == 0) {
                        sgVarD = sgVar;
                        if (o0VarE.B(sgVarD)) {
                        }
                        i17 |= i65;
                    } else {
                        sgVarD = sgVar;
                    }
                    i17 |= i65;
                } else {
                    sgVarD = sgVar;
                }
                i35 = i16 & 512;
                if (i35 != 0) {
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(pVar)) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i17 |= i36;
                    }
                    i37 = i16 & 1024;
                    if (i37 != 0) {
                        i38 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(pVar2)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i38 = i15 | i39;
                    } else {
                        i38 = i15;
                    }
                    i44 = i16 & 2048;
                    if (i44 != 0) {
                        i38 |= 48;
                    } else if ((i15 & 48) != 0) {
                        if (o0VarE.B(r0Var)) {
                            i45 = 32;
                        } else {
                            i45 = 16;
                        }
                        i38 |= i45;
                    }
                    i46 = i38;
                    i47 = i17;
                    i48 = i16 & 4096;
                    if (i48 != 0) {
                        i54 = i46 | 384;
                    } else {
                        i49 = i46;
                        if ((i15 & 384) != 0) {
                            if (o0VarE.B(jVar)) {
                                i55 = 256;
                            } else {
                                i55 = 128;
                            }
                            i49 |= i55;
                        }
                        i54 = i49;
                    }
                    i56 = i16 & 8192;
                    if (i56 != 0) {
                        i58 = i54 | 3072;
                    } else {
                        i57 = i54;
                        if ((i15 & 3072) == 0) {
                            i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                        } else {
                            i58 = i57;
                        }
                    }
                    if ((i15 & 24576) != 0) {
                        i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                    }
                    int i6111119 = i58;
                    if ((i47 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (o0VarE.n(i47 & 1, z18)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i61111110 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i61111110, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        } else {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i61111111 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i61111111, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        }
                        o0VarE.h0();
                        p3.x1 x1Var110 = p3.n.f135158a;
                        final m4.q qVar110 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                            /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                            /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                            /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2 = (p3.m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    p3.x1 x1Var111 = p3.n.f135158a;
                                    g6.f.a aVar = g6.f.f75994b;
                                    h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                    e23.l lVar5 = lVar4;
                                    boolean zB = mVar2.B(lVar5);
                                    Object objQ2 = mVar2.q();
                                    p3.m.a aVar2 = p3.m.f135153a;
                                    if (zB) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new k11.n(lVar5, 7);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                    m4.q qVar111 = qVar110;
                                    boolean zR = mVar2.r(qVar111);
                                    Object objQ3 = mVar2.q();
                                    if (zR) {
                                        objQ3 = new b82.k0(qVar111, 6);
                                        mVar2.K(objQ3);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            objQ3 = new b82.k0(qVar111, 6);
                                            mVar2.K(objQ3);
                                        }
                                    }
                                    p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                    boolean z28 = z25;
                                    if (!z28) {
                                        x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                    }
                                    Integer num5 = num4;
                                    boolean zB2 = mVar2.B(num5);
                                    e23.l lVar6 = lVar2;
                                    boolean zB3 = zB2 | mVar2.B(lVar6);
                                    Object objQ4 = mVar2.q();
                                    if (zB3) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ4 == p3.m.a.f135155b) {
                                            objQ4 = new i1(lVar6, 1, num5);
                                            mVar2.K(objQ4);
                                        }
                                    }
                                    eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, o0VarE), o0VarE, 12582912, 122);
                        o0Var = o0VarE;
                        str2 = str3;
                        num3 = num4;
                        z24 = z25;
                        pVar3 = pVar8;
                        pVar4 = pVar7;
                        r0Var2 = r0Var4;
                        a2Var3 = a2Var5;
                        z19 = z26;
                        jVar2 = jVar4;
                        sgVar2 = sgVar3;
                        lVar3 = lVar4;
                        j14 = j15;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        str2 = str;
                        pVar3 = pVar2;
                        num3 = num2;
                        z19 = z16;
                        z24 = z17;
                        a2Var3 = a2Var2;
                        rVar3 = rVar2;
                        sgVar2 = sgVarD;
                        j14 = jD;
                        pVar4 = pVar;
                        r0Var2 = r0Var;
                        jVar2 = jVar;
                        lVar3 = lVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        final h4.r rVar112 = rVar3;
                        p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                p1.b(l0Var, rVar112, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i17 |= C.ENCODING_PCM_32BIT;
                i37 = i16 & 1024;
                if (i37 != 0) {
                    i38 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i15 | i39;
                } else {
                    i38 = i15;
                }
                i44 = i16 & 2048;
                if (i44 != 0) {
                    i38 |= 48;
                } else if ((i15 & 48) != 0) {
                    if (o0VarE.B(r0Var)) {
                        i45 = 32;
                    } else {
                        i45 = 16;
                    }
                    i38 |= i45;
                }
                i46 = i38;
                i47 = i17;
                i48 = i16 & 4096;
                if (i48 != 0) {
                    i54 = i46 | 384;
                } else {
                    i49 = i46;
                    if ((i15 & 384) != 0) {
                        if (o0VarE.B(jVar)) {
                            i55 = 256;
                        } else {
                            i55 = 128;
                        }
                        i49 |= i55;
                    }
                    i54 = i49;
                }
                i56 = i16 & 8192;
                if (i56 != 0) {
                    i58 = i54 | 3072;
                } else {
                    i57 = i54;
                    if ((i15 & 3072) == 0) {
                        i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                    } else {
                        i58 = i57;
                    }
                }
                if ((i15 & 24576) != 0) {
                    i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                }
                int i61111112 = i58;
                if ((i47 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (o0VarE.n(i47 & 1, z18)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i61111113 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i61111113, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    } else {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i61111114 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i61111114, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    }
                    o0VarE.h0();
                    p3.x1 x1Var111 = p3.n.f135158a;
                    final m4.q qVar111 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                        /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                        /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                        /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                p3.x1 x1Var112 = p3.n.f135158a;
                                g6.f.a aVar = g6.f.f75994b;
                                h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                e23.l lVar5 = lVar4;
                                boolean zB = mVar2.B(lVar5);
                                Object objQ2 = mVar2.q();
                                p3.m.a aVar2 = p3.m.f135153a;
                                if (zB) {
                                    objQ2 = new k11.n(lVar5, 7);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar2.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    }
                                }
                                h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                m4.q qVar112 = qVar111;
                                boolean zR = mVar2.r(qVar112);
                                Object objQ3 = mVar2.q();
                                if (zR) {
                                    objQ3 = new b82.k0(qVar112, 6);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar2.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new b82.k0(qVar112, 6);
                                        mVar2.K(objQ3);
                                    }
                                }
                                p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                boolean z28 = z25;
                                if (!z28) {
                                    x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                }
                                Integer num5 = num4;
                                boolean zB2 = mVar2.B(num5);
                                e23.l lVar6 = lVar2;
                                boolean zB3 = zB2 | mVar2.B(lVar6);
                                Object objQ4 = mVar2.q();
                                if (zB3) {
                                    objQ4 = new i1(lVar6, 1, num5);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar2.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    }
                                }
                                eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, 12582912, 122);
                    o0Var = o0VarE;
                    str2 = str3;
                    num3 = num4;
                    z24 = z25;
                    pVar3 = pVar8;
                    pVar4 = pVar7;
                    r0Var2 = r0Var4;
                    a2Var3 = a2Var5;
                    z19 = z26;
                    jVar2 = jVar4;
                    sgVar2 = sgVar3;
                    lVar3 = lVar4;
                    j14 = j15;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    str2 = str;
                    pVar3 = pVar2;
                    num3 = num2;
                    z19 = z16;
                    z24 = z17;
                    a2Var3 = a2Var2;
                    rVar3 = rVar2;
                    sgVar2 = sgVarD;
                    j14 = jD;
                    pVar4 = pVar;
                    r0Var2 = r0Var;
                    jVar2 = jVar;
                    lVar3 = lVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    final h4.r rVar113 = rVar3;
                    p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            p1.b(l0Var, rVar113, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i17 |= 3072;
            num2 = num;
            i26 = i16 & 16;
            if (i26 != 0) {
                if ((i14 & 24576) == 0) {
                    z16 = z14;
                    if (o0VarE.h(z16)) {
                        i27 = 16384;
                    } else {
                        i27 = 8192;
                    }
                    i17 |= i27;
                }
                i28 = i16 & 32;
                if (i28 != 0) {
                    i17 |= 196608;
                    z17 = z15;
                } else {
                    z17 = z15;
                    if ((i14 & 196608) == 0) {
                        if (o0VarE.h(z17)) {
                            i29 = 131072;
                        } else {
                            i29 = 65536;
                        }
                        i17 |= i29;
                    }
                }
                i30 = i16 & 64;
                if (i30 != 0) {
                    i17 |= 1572864;
                    a2Var2 = a2Var;
                } else {
                    a2Var2 = a2Var;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.B(a2Var2)) {
                            i34 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i34 = 524288;
                        }
                        i17 |= i34;
                    }
                }
                if ((i14 & 12582912) == 0) {
                    jD = j8;
                    if ((i16 & 128) == 0) {
                        i59 = 4194304;
                    } else {
                        i59 = 4194304;
                    }
                    i17 |= i59;
                } else {
                    jD = j8;
                }
                if ((i14 & 100663296) == 0) {
                    if ((i16 & 256) == 0) {
                        sgVarD = sgVar;
                        if (o0VarE.B(sgVarD)) {
                        }
                        i17 |= i65;
                    } else {
                        sgVarD = sgVar;
                    }
                    i17 |= i65;
                } else {
                    sgVarD = sgVar;
                }
                i35 = i16 & 512;
                if (i35 != 0) {
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(pVar)) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i17 |= i36;
                    }
                    i37 = i16 & 1024;
                    if (i37 != 0) {
                        i38 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(pVar2)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i38 = i15 | i39;
                    } else {
                        i38 = i15;
                    }
                    i44 = i16 & 2048;
                    if (i44 != 0) {
                        i38 |= 48;
                    } else if ((i15 & 48) != 0) {
                        if (o0VarE.B(r0Var)) {
                            i45 = 32;
                        } else {
                            i45 = 16;
                        }
                        i38 |= i45;
                    }
                    i46 = i38;
                    i47 = i17;
                    i48 = i16 & 4096;
                    if (i48 != 0) {
                        i54 = i46 | 384;
                    } else {
                        i49 = i46;
                        if ((i15 & 384) != 0) {
                            if (o0VarE.B(jVar)) {
                                i55 = 256;
                            } else {
                                i55 = 128;
                            }
                            i49 |= i55;
                        }
                        i54 = i49;
                    }
                    i56 = i16 & 8192;
                    if (i56 != 0) {
                        i58 = i54 | 3072;
                    } else {
                        i57 = i54;
                        if ((i15 & 3072) == 0) {
                            i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                        } else {
                            i58 = i57;
                        }
                    }
                    if ((i15 & 24576) != 0) {
                        i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                    }
                    int i61111115 = i58;
                    if ((i47 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (o0VarE.n(i47 & 1, z18)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i61111116 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i61111116, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        } else {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i61111117 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i61111117, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        }
                        o0VarE.h0();
                        p3.x1 x1Var112 = p3.n.f135158a;
                        final m4.q qVar112 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                            /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                            /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                            /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2 = (p3.m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    p3.x1 x1Var113 = p3.n.f135158a;
                                    g6.f.a aVar = g6.f.f75994b;
                                    h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                    e23.l lVar5 = lVar4;
                                    boolean zB = mVar2.B(lVar5);
                                    Object objQ2 = mVar2.q();
                                    p3.m.a aVar2 = p3.m.f135153a;
                                    if (zB) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new k11.n(lVar5, 7);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                    m4.q qVar113 = qVar112;
                                    boolean zR = mVar2.r(qVar113);
                                    Object objQ3 = mVar2.q();
                                    if (zR) {
                                        objQ3 = new b82.k0(qVar113, 6);
                                        mVar2.K(objQ3);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            objQ3 = new b82.k0(qVar113, 6);
                                            mVar2.K(objQ3);
                                        }
                                    }
                                    p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                    boolean z28 = z25;
                                    if (!z28) {
                                        x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                    }
                                    Integer num5 = num4;
                                    boolean zB2 = mVar2.B(num5);
                                    e23.l lVar6 = lVar2;
                                    boolean zB3 = zB2 | mVar2.B(lVar6);
                                    Object objQ4 = mVar2.q();
                                    if (zB3) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ4 == p3.m.a.f135155b) {
                                            objQ4 = new i1(lVar6, 1, num5);
                                            mVar2.K(objQ4);
                                        }
                                    }
                                    eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, o0VarE), o0VarE, 12582912, 122);
                        o0Var = o0VarE;
                        str2 = str3;
                        num3 = num4;
                        z24 = z25;
                        pVar3 = pVar8;
                        pVar4 = pVar7;
                        r0Var2 = r0Var4;
                        a2Var3 = a2Var5;
                        z19 = z26;
                        jVar2 = jVar4;
                        sgVar2 = sgVar3;
                        lVar3 = lVar4;
                        j14 = j15;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        str2 = str;
                        pVar3 = pVar2;
                        num3 = num2;
                        z19 = z16;
                        z24 = z17;
                        a2Var3 = a2Var2;
                        rVar3 = rVar2;
                        sgVar2 = sgVarD;
                        j14 = jD;
                        pVar4 = pVar;
                        r0Var2 = r0Var;
                        jVar2 = jVar;
                        lVar3 = lVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        final h4.r rVar114 = rVar3;
                        p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                p1.b(l0Var, rVar114, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i17 |= C.ENCODING_PCM_32BIT;
                i37 = i16 & 1024;
                if (i37 != 0) {
                    i38 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i15 | i39;
                } else {
                    i38 = i15;
                }
                i44 = i16 & 2048;
                if (i44 != 0) {
                    i38 |= 48;
                } else if ((i15 & 48) != 0) {
                    if (o0VarE.B(r0Var)) {
                        i45 = 32;
                    } else {
                        i45 = 16;
                    }
                    i38 |= i45;
                }
                i46 = i38;
                i47 = i17;
                i48 = i16 & 4096;
                if (i48 != 0) {
                    i54 = i46 | 384;
                } else {
                    i49 = i46;
                    if ((i15 & 384) != 0) {
                        if (o0VarE.B(jVar)) {
                            i55 = 256;
                        } else {
                            i55 = 128;
                        }
                        i49 |= i55;
                    }
                    i54 = i49;
                }
                i56 = i16 & 8192;
                if (i56 != 0) {
                    i58 = i54 | 3072;
                } else {
                    i57 = i54;
                    if ((i15 & 3072) == 0) {
                        i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                    } else {
                        i58 = i57;
                    }
                }
                if ((i15 & 24576) != 0) {
                    i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                }
                int i61111118 = i58;
                if ((i47 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (o0VarE.n(i47 & 1, z18)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i61111119 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i61111119, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    } else {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i611111110 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i611111110, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    }
                    o0VarE.h0();
                    p3.x1 x1Var113 = p3.n.f135158a;
                    final m4.q qVar113 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                        /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                        /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                        /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                p3.x1 x1Var114 = p3.n.f135158a;
                                g6.f.a aVar = g6.f.f75994b;
                                h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                e23.l lVar5 = lVar4;
                                boolean zB = mVar2.B(lVar5);
                                Object objQ2 = mVar2.q();
                                p3.m.a aVar2 = p3.m.f135153a;
                                if (zB) {
                                    objQ2 = new k11.n(lVar5, 7);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar2.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    }
                                }
                                h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                m4.q qVar114 = qVar113;
                                boolean zR = mVar2.r(qVar114);
                                Object objQ3 = mVar2.q();
                                if (zR) {
                                    objQ3 = new b82.k0(qVar114, 6);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar2.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new b82.k0(qVar114, 6);
                                        mVar2.K(objQ3);
                                    }
                                }
                                p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                boolean z28 = z25;
                                if (!z28) {
                                    x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                }
                                Integer num5 = num4;
                                boolean zB2 = mVar2.B(num5);
                                e23.l lVar6 = lVar2;
                                boolean zB3 = zB2 | mVar2.B(lVar6);
                                Object objQ4 = mVar2.q();
                                if (zB3) {
                                    objQ4 = new i1(lVar6, 1, num5);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar2.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    }
                                }
                                eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, 12582912, 122);
                    o0Var = o0VarE;
                    str2 = str3;
                    num3 = num4;
                    z24 = z25;
                    pVar3 = pVar8;
                    pVar4 = pVar7;
                    r0Var2 = r0Var4;
                    a2Var3 = a2Var5;
                    z19 = z26;
                    jVar2 = jVar4;
                    sgVar2 = sgVar3;
                    lVar3 = lVar4;
                    j14 = j15;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    str2 = str;
                    pVar3 = pVar2;
                    num3 = num2;
                    z19 = z16;
                    z24 = z17;
                    a2Var3 = a2Var2;
                    rVar3 = rVar2;
                    sgVar2 = sgVarD;
                    j14 = jD;
                    pVar4 = pVar;
                    r0Var2 = r0Var;
                    jVar2 = jVar;
                    lVar3 = lVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    final h4.r rVar115 = rVar3;
                    p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            p1.b(l0Var, rVar115, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i17 |= 24576;
            z16 = z14;
            i28 = i16 & 32;
            if (i28 != 0) {
                i17 |= 196608;
                z17 = z15;
            } else {
                z17 = z15;
                if ((i14 & 196608) == 0) {
                    if (o0VarE.h(z17)) {
                        i29 = 131072;
                    } else {
                        i29 = 65536;
                    }
                    i17 |= i29;
                }
            }
            i30 = i16 & 64;
            if (i30 != 0) {
                i17 |= 1572864;
                a2Var2 = a2Var;
            } else {
                a2Var2 = a2Var;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.B(a2Var2)) {
                        i34 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i34 = 524288;
                    }
                    i17 |= i34;
                }
            }
            if ((i14 & 12582912) == 0) {
                jD = j8;
                if ((i16 & 128) == 0) {
                    i59 = 4194304;
                } else {
                    i59 = 4194304;
                }
                i17 |= i59;
            } else {
                jD = j8;
            }
            if ((i14 & 100663296) == 0) {
                if ((i16 & 256) == 0) {
                    sgVarD = sgVar;
                    if (o0VarE.B(sgVarD)) {
                    }
                    i17 |= i65;
                } else {
                    sgVarD = sgVar;
                }
                i17 |= i65;
            } else {
                sgVarD = sgVar;
            }
            i35 = i16 & 512;
            if (i35 != 0) {
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(pVar)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i17 |= i36;
                }
                i37 = i16 & 1024;
                if (i37 != 0) {
                    i38 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i15 | i39;
                } else {
                    i38 = i15;
                }
                i44 = i16 & 2048;
                if (i44 != 0) {
                    i38 |= 48;
                } else if ((i15 & 48) != 0) {
                    if (o0VarE.B(r0Var)) {
                        i45 = 32;
                    } else {
                        i45 = 16;
                    }
                    i38 |= i45;
                }
                i46 = i38;
                i47 = i17;
                i48 = i16 & 4096;
                if (i48 != 0) {
                    i54 = i46 | 384;
                } else {
                    i49 = i46;
                    if ((i15 & 384) != 0) {
                        if (o0VarE.B(jVar)) {
                            i55 = 256;
                        } else {
                            i55 = 128;
                        }
                        i49 |= i55;
                    }
                    i54 = i49;
                }
                i56 = i16 & 8192;
                if (i56 != 0) {
                    i58 = i54 | 3072;
                } else {
                    i57 = i54;
                    if ((i15 & 3072) == 0) {
                        i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                    } else {
                        i58 = i57;
                    }
                }
                if ((i15 & 24576) != 0) {
                    i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                }
                int i611111111 = i58;
                if ((i47 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (o0VarE.n(i47 & 1, z18)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i611111112 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i611111112, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    } else {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i611111113 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i611111113, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    }
                    o0VarE.h0();
                    p3.x1 x1Var114 = p3.n.f135158a;
                    final m4.q qVar114 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                        /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                        /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                        /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                p3.x1 x1Var115 = p3.n.f135158a;
                                g6.f.a aVar = g6.f.f75994b;
                                h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                e23.l lVar5 = lVar4;
                                boolean zB = mVar2.B(lVar5);
                                Object objQ2 = mVar2.q();
                                p3.m.a aVar2 = p3.m.f135153a;
                                if (zB) {
                                    objQ2 = new k11.n(lVar5, 7);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar2.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    }
                                }
                                h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                m4.q qVar115 = qVar114;
                                boolean zR = mVar2.r(qVar115);
                                Object objQ3 = mVar2.q();
                                if (zR) {
                                    objQ3 = new b82.k0(qVar115, 6);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar2.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new b82.k0(qVar115, 6);
                                        mVar2.K(objQ3);
                                    }
                                }
                                p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                boolean z28 = z25;
                                if (!z28) {
                                    x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                }
                                Integer num5 = num4;
                                boolean zB2 = mVar2.B(num5);
                                e23.l lVar6 = lVar2;
                                boolean zB3 = zB2 | mVar2.B(lVar6);
                                Object objQ4 = mVar2.q();
                                if (zB3) {
                                    objQ4 = new i1(lVar6, 1, num5);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar2.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    }
                                }
                                eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, 12582912, 122);
                    o0Var = o0VarE;
                    str2 = str3;
                    num3 = num4;
                    z24 = z25;
                    pVar3 = pVar8;
                    pVar4 = pVar7;
                    r0Var2 = r0Var4;
                    a2Var3 = a2Var5;
                    z19 = z26;
                    jVar2 = jVar4;
                    sgVar2 = sgVar3;
                    lVar3 = lVar4;
                    j14 = j15;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    str2 = str;
                    pVar3 = pVar2;
                    num3 = num2;
                    z19 = z16;
                    z24 = z17;
                    a2Var3 = a2Var2;
                    rVar3 = rVar2;
                    sgVar2 = sgVarD;
                    j14 = jD;
                    pVar4 = pVar;
                    r0Var2 = r0Var;
                    jVar2 = jVar;
                    lVar3 = lVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    final h4.r rVar116 = rVar3;
                    p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            p1.b(l0Var, rVar116, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i17 |= C.ENCODING_PCM_32BIT;
            i37 = i16 & 1024;
            if (i37 != 0) {
                i38 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.r(pVar2)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i38 = i15 | i39;
            } else {
                i38 = i15;
            }
            i44 = i16 & 2048;
            if (i44 != 0) {
                i38 |= 48;
            } else if ((i15 & 48) != 0) {
                if (o0VarE.B(r0Var)) {
                    i45 = 32;
                } else {
                    i45 = 16;
                }
                i38 |= i45;
            }
            i46 = i38;
            i47 = i17;
            i48 = i16 & 4096;
            if (i48 != 0) {
                i54 = i46 | 384;
            } else {
                i49 = i46;
                if ((i15 & 384) != 0) {
                    if (o0VarE.B(jVar)) {
                        i55 = 256;
                    } else {
                        i55 = 128;
                    }
                    i49 |= i55;
                }
                i54 = i49;
            }
            i56 = i16 & 8192;
            if (i56 != 0) {
                i58 = i54 | 3072;
            } else {
                i57 = i54;
                if ((i15 & 3072) == 0) {
                    i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                } else {
                    i58 = i57;
                }
            }
            if ((i15 & 24576) != 0) {
                i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
            }
            int i611111114 = i58;
            if ((i47 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (o0VarE.n(i47 & 1, z18)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i64 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i24 != 0) {
                        num2 = null;
                    }
                    if (i26 != 0) {
                        z16 = true;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        x5.v.f188954b.getClass();
                        int i611111115 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        a2Var4 = new p006l2.a2(0, (Boolean) null, i611111115, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    } else {
                        a2Var4 = a2Var2;
                    }
                    if ((i16 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        jD = d92.b.a(o0VarE).k().d();
                    }
                    if ((i16 & 256) != 0) {
                        sgVarD = d(o0VarE);
                    }
                    if (i35 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i37 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i44 != 0) {
                        x5.r0.f188941a.getClass();
                        r0Var3 = x5.r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    if (i48 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar3 = (a2.j) objQ;
                    } else {
                        jVar3 = jVar;
                    }
                    r0Var4 = r0Var3;
                    jVar4 = jVar3;
                    sgVar3 = sgVarD;
                    j15 = jD;
                    z25 = z27;
                    if (i56 != 0) {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = null;
                    } else {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = lVar;
                    }
                } else {
                    if (i64 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i24 != 0) {
                        num2 = null;
                    }
                    if (i26 != 0) {
                        z16 = true;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        x5.v.f188954b.getClass();
                        int i611111116 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        a2Var4 = new p006l2.a2(0, (Boolean) null, i611111116, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    } else {
                        a2Var4 = a2Var2;
                    }
                    if ((i16 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        jD = d92.b.a(o0VarE).k().d();
                    }
                    if ((i16 & 256) != 0) {
                        sgVarD = d(o0VarE);
                    }
                    if (i35 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i37 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i44 != 0) {
                        x5.r0.f188941a.getClass();
                        r0Var3 = x5.r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    if (i48 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar3 = (a2.j) objQ;
                    } else {
                        jVar3 = jVar;
                    }
                    r0Var4 = r0Var3;
                    jVar4 = jVar3;
                    sgVar3 = sgVarD;
                    j15 = jD;
                    z25 = z27;
                    if (i56 != 0) {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = null;
                    } else {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = lVar;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var115 = p3.n.f135158a;
                final m4.q qVar115 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            p3.x1 x1Var116 = p3.n.f135158a;
                            g6.f.a aVar = g6.f.f75994b;
                            h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                            e23.l lVar5 = lVar4;
                            boolean zB = mVar2.B(lVar5);
                            Object objQ2 = mVar2.q();
                            p3.m.a aVar2 = p3.m.f135153a;
                            if (zB) {
                                objQ2 = new k11.n(lVar5, 7);
                                mVar2.K(objQ2);
                            } else {
                                aVar2.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new k11.n(lVar5, 7);
                                    mVar2.K(objQ2);
                                }
                            }
                            h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                            m4.q qVar116 = qVar115;
                            boolean zR = mVar2.r(qVar116);
                            Object objQ3 = mVar2.q();
                            if (zR) {
                                objQ3 = new b82.k0(qVar116, 6);
                                mVar2.K(objQ3);
                            } else {
                                aVar2.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new b82.k0(qVar116, 6);
                                    mVar2.K(objQ3);
                                }
                            }
                            p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                            boolean z28 = z25;
                            if (!z28) {
                                x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                            }
                            Integer num5 = num4;
                            boolean zB2 = mVar2.B(num5);
                            e23.l lVar6 = lVar2;
                            boolean zB3 = zB2 | mVar2.B(lVar6);
                            Object objQ4 = mVar2.q();
                            if (zB3) {
                                objQ4 = new i1(lVar6, 1, num5);
                                mVar2.K(objQ4);
                            } else {
                                aVar2.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new i1(lVar6, 1, num5);
                                    mVar2.K(objQ4);
                                }
                            }
                            eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 12582912, 122);
                o0Var = o0VarE;
                str2 = str3;
                num3 = num4;
                z24 = z25;
                pVar3 = pVar8;
                pVar4 = pVar7;
                r0Var2 = r0Var4;
                a2Var3 = a2Var5;
                z19 = z26;
                jVar2 = jVar4;
                sgVar2 = sgVar3;
                lVar3 = lVar4;
                j14 = j15;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str2 = str;
                pVar3 = pVar2;
                num3 = num2;
                z19 = z16;
                z24 = z17;
                a2Var3 = a2Var2;
                rVar3 = rVar2;
                sgVar2 = sgVarD;
                j14 = jD;
                pVar4 = pVar;
                r0Var2 = r0Var;
                jVar2 = jVar;
                lVar3 = lVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                final h4.r rVar117 = rVar3;
                p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        p1.b(l0Var, rVar117, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i17 |= 384;
        i24 = i16 & 8;
        if (i24 != 0) {
            if ((i14 & 3072) == 0) {
                num2 = num;
                if (o0VarE.B(num2)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i17 |= i25;
            }
            i26 = i16 & 16;
            if (i26 != 0) {
                if ((i14 & 24576) == 0) {
                    z16 = z14;
                    if (o0VarE.h(z16)) {
                        i27 = 16384;
                    } else {
                        i27 = 8192;
                    }
                    i17 |= i27;
                }
                i28 = i16 & 32;
                if (i28 != 0) {
                    i17 |= 196608;
                    z17 = z15;
                } else {
                    z17 = z15;
                    if ((i14 & 196608) == 0) {
                        if (o0VarE.h(z17)) {
                            i29 = 131072;
                        } else {
                            i29 = 65536;
                        }
                        i17 |= i29;
                    }
                }
                i30 = i16 & 64;
                if (i30 != 0) {
                    i17 |= 1572864;
                    a2Var2 = a2Var;
                } else {
                    a2Var2 = a2Var;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.B(a2Var2)) {
                            i34 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i34 = 524288;
                        }
                        i17 |= i34;
                    }
                }
                if ((i14 & 12582912) == 0) {
                    jD = j8;
                    if ((i16 & 128) == 0) {
                        i59 = 4194304;
                    } else {
                        i59 = 4194304;
                    }
                    i17 |= i59;
                } else {
                    jD = j8;
                }
                if ((i14 & 100663296) == 0) {
                    if ((i16 & 256) == 0) {
                        sgVarD = sgVar;
                        if (o0VarE.B(sgVarD)) {
                        }
                        i17 |= i65;
                    } else {
                        sgVarD = sgVar;
                    }
                    i17 |= i65;
                } else {
                    sgVarD = sgVar;
                }
                i35 = i16 & 512;
                if (i35 != 0) {
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(pVar)) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i17 |= i36;
                    }
                    i37 = i16 & 1024;
                    if (i37 != 0) {
                        i38 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(pVar2)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i38 = i15 | i39;
                    } else {
                        i38 = i15;
                    }
                    i44 = i16 & 2048;
                    if (i44 != 0) {
                        i38 |= 48;
                    } else if ((i15 & 48) != 0) {
                        if (o0VarE.B(r0Var)) {
                            i45 = 32;
                        } else {
                            i45 = 16;
                        }
                        i38 |= i45;
                    }
                    i46 = i38;
                    i47 = i17;
                    i48 = i16 & 4096;
                    if (i48 != 0) {
                        i54 = i46 | 384;
                    } else {
                        i49 = i46;
                        if ((i15 & 384) != 0) {
                            if (o0VarE.B(jVar)) {
                                i55 = 256;
                            } else {
                                i55 = 128;
                            }
                            i49 |= i55;
                        }
                        i54 = i49;
                    }
                    i56 = i16 & 8192;
                    if (i56 != 0) {
                        i58 = i54 | 3072;
                    } else {
                        i57 = i54;
                        if ((i15 & 3072) == 0) {
                            i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                        } else {
                            i58 = i57;
                        }
                    }
                    if ((i15 & 24576) != 0) {
                        i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                    }
                    int i611111117 = i58;
                    if ((i47 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (o0VarE.n(i47 & 1, z18)) {
                        o0VarE.G0();
                        if ((i14 & 1) != 0) {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i611111118 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i611111118, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        } else {
                            if (i64 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i18 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (i24 != 0) {
                                num2 = null;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if (i28 == 0) {
                            }
                            if (i30 != 0) {
                                x5.v.f188954b.getClass();
                                int i611111119 = x5.v.f188955c;
                                x5.p.f188918b.getClass();
                                a2Var4 = new p006l2.a2(0, (Boolean) null, i611111119, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                            } else {
                                a2Var4 = a2Var2;
                            }
                            if ((i16 & 128) != 0) {
                                d92.b.f58623a.getClass();
                                jD = d92.b.a(o0VarE).k().d();
                            }
                            if ((i16 & 256) != 0) {
                                sgVarD = d(o0VarE);
                            }
                            if (i35 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i37 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i44 != 0) {
                                x5.r0.f188941a.getClass();
                                r0Var3 = x5.r0.a.f188943b;
                            } else {
                                r0Var3 = r0Var;
                            }
                            if (i48 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            r0Var4 = r0Var3;
                            jVar4 = jVar3;
                            sgVar3 = sgVarD;
                            j15 = jD;
                            z25 = z27;
                            if (i56 != 0) {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = null;
                            } else {
                                a2Var5 = a2Var4;
                                num4 = num2;
                                z26 = z16;
                                pVar7 = pVar5;
                                pVar8 = pVar6;
                                lVar4 = lVar;
                            }
                        }
                        o0VarE.h0();
                        p3.x1 x1Var116 = p3.n.f135158a;
                        final m4.q qVar116 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                            /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                            /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                            /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                p3.m mVar2 = (p3.m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    p3.x1 x1Var117 = p3.n.f135158a;
                                    g6.f.a aVar = g6.f.f75994b;
                                    h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                    e23.l lVar5 = lVar4;
                                    boolean zB = mVar2.B(lVar5);
                                    Object objQ2 = mVar2.q();
                                    p3.m.a aVar2 = p3.m.f135153a;
                                    if (zB) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new k11.n(lVar5, 7);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                    m4.q qVar117 = qVar116;
                                    boolean zR = mVar2.r(qVar117);
                                    Object objQ3 = mVar2.q();
                                    if (zR) {
                                        objQ3 = new b82.k0(qVar117, 6);
                                        mVar2.K(objQ3);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            objQ3 = new b82.k0(qVar117, 6);
                                            mVar2.K(objQ3);
                                        }
                                    }
                                    p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                    boolean z28 = z25;
                                    if (!z28) {
                                        x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                    }
                                    Integer num5 = num4;
                                    boolean zB2 = mVar2.B(num5);
                                    e23.l lVar6 = lVar2;
                                    boolean zB3 = zB2 | mVar2.B(lVar6);
                                    Object objQ4 = mVar2.q();
                                    if (zB3) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ4 == p3.m.a.f135155b) {
                                            objQ4 = new i1(lVar6, 1, num5);
                                            mVar2.K(objQ4);
                                        }
                                    }
                                    eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, o0VarE), o0VarE, 12582912, 122);
                        o0Var = o0VarE;
                        str2 = str3;
                        num3 = num4;
                        z24 = z25;
                        pVar3 = pVar8;
                        pVar4 = pVar7;
                        r0Var2 = r0Var4;
                        a2Var3 = a2Var5;
                        z19 = z26;
                        jVar2 = jVar4;
                        sgVar2 = sgVar3;
                        lVar3 = lVar4;
                        j14 = j15;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        str2 = str;
                        pVar3 = pVar2;
                        num3 = num2;
                        z19 = z16;
                        z24 = z17;
                        a2Var3 = a2Var2;
                        rVar3 = rVar2;
                        sgVar2 = sgVarD;
                        j14 = jD;
                        pVar4 = pVar;
                        r0Var2 = r0Var;
                        jVar2 = jVar;
                        lVar3 = lVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        final h4.r rVar118 = rVar3;
                        p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i14 | 1);
                                int iT2 = p3.p0.t(i15);
                                p1.b(l0Var, rVar118, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i17 |= C.ENCODING_PCM_32BIT;
                i37 = i16 & 1024;
                if (i37 != 0) {
                    i38 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i15 | i39;
                } else {
                    i38 = i15;
                }
                i44 = i16 & 2048;
                if (i44 != 0) {
                    i38 |= 48;
                } else if ((i15 & 48) != 0) {
                    if (o0VarE.B(r0Var)) {
                        i45 = 32;
                    } else {
                        i45 = 16;
                    }
                    i38 |= i45;
                }
                i46 = i38;
                i47 = i17;
                i48 = i16 & 4096;
                if (i48 != 0) {
                    i54 = i46 | 384;
                } else {
                    i49 = i46;
                    if ((i15 & 384) != 0) {
                        if (o0VarE.B(jVar)) {
                            i55 = 256;
                        } else {
                            i55 = 128;
                        }
                        i49 |= i55;
                    }
                    i54 = i49;
                }
                i56 = i16 & 8192;
                if (i56 != 0) {
                    i58 = i54 | 3072;
                } else {
                    i57 = i54;
                    if ((i15 & 3072) == 0) {
                        i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                    } else {
                        i58 = i57;
                    }
                }
                if ((i15 & 24576) != 0) {
                    i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                }
                int i6111111110 = i58;
                if ((i47 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (o0VarE.n(i47 & 1, z18)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i6111111111 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i6111111111, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    } else {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i6111111112 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i6111111112, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    }
                    o0VarE.h0();
                    p3.x1 x1Var117 = p3.n.f135158a;
                    final m4.q qVar117 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                        /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                        /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                        /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                p3.x1 x1Var118 = p3.n.f135158a;
                                g6.f.a aVar = g6.f.f75994b;
                                h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                e23.l lVar5 = lVar4;
                                boolean zB = mVar2.B(lVar5);
                                Object objQ2 = mVar2.q();
                                p3.m.a aVar2 = p3.m.f135153a;
                                if (zB) {
                                    objQ2 = new k11.n(lVar5, 7);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar2.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    }
                                }
                                h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                m4.q qVar118 = qVar117;
                                boolean zR = mVar2.r(qVar118);
                                Object objQ3 = mVar2.q();
                                if (zR) {
                                    objQ3 = new b82.k0(qVar118, 6);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar2.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new b82.k0(qVar118, 6);
                                        mVar2.K(objQ3);
                                    }
                                }
                                p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                boolean z28 = z25;
                                if (!z28) {
                                    x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                }
                                Integer num5 = num4;
                                boolean zB2 = mVar2.B(num5);
                                e23.l lVar6 = lVar2;
                                boolean zB3 = zB2 | mVar2.B(lVar6);
                                Object objQ4 = mVar2.q();
                                if (zB3) {
                                    objQ4 = new i1(lVar6, 1, num5);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar2.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    }
                                }
                                eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, 12582912, 122);
                    o0Var = o0VarE;
                    str2 = str3;
                    num3 = num4;
                    z24 = z25;
                    pVar3 = pVar8;
                    pVar4 = pVar7;
                    r0Var2 = r0Var4;
                    a2Var3 = a2Var5;
                    z19 = z26;
                    jVar2 = jVar4;
                    sgVar2 = sgVar3;
                    lVar3 = lVar4;
                    j14 = j15;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    str2 = str;
                    pVar3 = pVar2;
                    num3 = num2;
                    z19 = z16;
                    z24 = z17;
                    a2Var3 = a2Var2;
                    rVar3 = rVar2;
                    sgVar2 = sgVarD;
                    j14 = jD;
                    pVar4 = pVar;
                    r0Var2 = r0Var;
                    jVar2 = jVar;
                    lVar3 = lVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    final h4.r rVar119 = rVar3;
                    p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            p1.b(l0Var, rVar119, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i17 |= 24576;
            z16 = z14;
            i28 = i16 & 32;
            if (i28 != 0) {
                i17 |= 196608;
                z17 = z15;
            } else {
                z17 = z15;
                if ((i14 & 196608) == 0) {
                    if (o0VarE.h(z17)) {
                        i29 = 131072;
                    } else {
                        i29 = 65536;
                    }
                    i17 |= i29;
                }
            }
            i30 = i16 & 64;
            if (i30 != 0) {
                i17 |= 1572864;
                a2Var2 = a2Var;
            } else {
                a2Var2 = a2Var;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.B(a2Var2)) {
                        i34 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i34 = 524288;
                    }
                    i17 |= i34;
                }
            }
            if ((i14 & 12582912) == 0) {
                jD = j8;
                if ((i16 & 128) == 0) {
                    i59 = 4194304;
                } else {
                    i59 = 4194304;
                }
                i17 |= i59;
            } else {
                jD = j8;
            }
            if ((i14 & 100663296) == 0) {
                if ((i16 & 256) == 0) {
                    sgVarD = sgVar;
                    if (o0VarE.B(sgVarD)) {
                    }
                    i17 |= i65;
                } else {
                    sgVarD = sgVar;
                }
                i17 |= i65;
            } else {
                sgVarD = sgVar;
            }
            i35 = i16 & 512;
            if (i35 != 0) {
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(pVar)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i17 |= i36;
                }
                i37 = i16 & 1024;
                if (i37 != 0) {
                    i38 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i15 | i39;
                } else {
                    i38 = i15;
                }
                i44 = i16 & 2048;
                if (i44 != 0) {
                    i38 |= 48;
                } else if ((i15 & 48) != 0) {
                    if (o0VarE.B(r0Var)) {
                        i45 = 32;
                    } else {
                        i45 = 16;
                    }
                    i38 |= i45;
                }
                i46 = i38;
                i47 = i17;
                i48 = i16 & 4096;
                if (i48 != 0) {
                    i54 = i46 | 384;
                } else {
                    i49 = i46;
                    if ((i15 & 384) != 0) {
                        if (o0VarE.B(jVar)) {
                            i55 = 256;
                        } else {
                            i55 = 128;
                        }
                        i49 |= i55;
                    }
                    i54 = i49;
                }
                i56 = i16 & 8192;
                if (i56 != 0) {
                    i58 = i54 | 3072;
                } else {
                    i57 = i54;
                    if ((i15 & 3072) == 0) {
                        i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                    } else {
                        i58 = i57;
                    }
                }
                if ((i15 & 24576) != 0) {
                    i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                }
                int i6111111113 = i58;
                if ((i47 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (o0VarE.n(i47 & 1, z18)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i6111111114 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i6111111114, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    } else {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i6111111115 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i6111111115, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    }
                    o0VarE.h0();
                    p3.x1 x1Var118 = p3.n.f135158a;
                    final m4.q qVar118 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                        /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                        /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                        /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                p3.x1 x1Var119 = p3.n.f135158a;
                                g6.f.a aVar = g6.f.f75994b;
                                h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                e23.l lVar5 = lVar4;
                                boolean zB = mVar2.B(lVar5);
                                Object objQ2 = mVar2.q();
                                p3.m.a aVar2 = p3.m.f135153a;
                                if (zB) {
                                    objQ2 = new k11.n(lVar5, 7);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar2.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    }
                                }
                                h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                m4.q qVar119 = qVar118;
                                boolean zR = mVar2.r(qVar119);
                                Object objQ3 = mVar2.q();
                                if (zR) {
                                    objQ3 = new b82.k0(qVar119, 6);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar2.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new b82.k0(qVar119, 6);
                                        mVar2.K(objQ3);
                                    }
                                }
                                p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                boolean z28 = z25;
                                if (!z28) {
                                    x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                }
                                Integer num5 = num4;
                                boolean zB2 = mVar2.B(num5);
                                e23.l lVar6 = lVar2;
                                boolean zB3 = zB2 | mVar2.B(lVar6);
                                Object objQ4 = mVar2.q();
                                if (zB3) {
                                    objQ4 = new i1(lVar6, 1, num5);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar2.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    }
                                }
                                eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, 12582912, 122);
                    o0Var = o0VarE;
                    str2 = str3;
                    num3 = num4;
                    z24 = z25;
                    pVar3 = pVar8;
                    pVar4 = pVar7;
                    r0Var2 = r0Var4;
                    a2Var3 = a2Var5;
                    z19 = z26;
                    jVar2 = jVar4;
                    sgVar2 = sgVar3;
                    lVar3 = lVar4;
                    j14 = j15;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    str2 = str;
                    pVar3 = pVar2;
                    num3 = num2;
                    z19 = z16;
                    z24 = z17;
                    a2Var3 = a2Var2;
                    rVar3 = rVar2;
                    sgVar2 = sgVarD;
                    j14 = jD;
                    pVar4 = pVar;
                    r0Var2 = r0Var;
                    jVar2 = jVar;
                    lVar3 = lVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    final h4.r rVar1110 = rVar3;
                    p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            p1.b(l0Var, rVar1110, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i17 |= C.ENCODING_PCM_32BIT;
            i37 = i16 & 1024;
            if (i37 != 0) {
                i38 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.r(pVar2)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i38 = i15 | i39;
            } else {
                i38 = i15;
            }
            i44 = i16 & 2048;
            if (i44 != 0) {
                i38 |= 48;
            } else if ((i15 & 48) != 0) {
                if (o0VarE.B(r0Var)) {
                    i45 = 32;
                } else {
                    i45 = 16;
                }
                i38 |= i45;
            }
            i46 = i38;
            i47 = i17;
            i48 = i16 & 4096;
            if (i48 != 0) {
                i54 = i46 | 384;
            } else {
                i49 = i46;
                if ((i15 & 384) != 0) {
                    if (o0VarE.B(jVar)) {
                        i55 = 256;
                    } else {
                        i55 = 128;
                    }
                    i49 |= i55;
                }
                i54 = i49;
            }
            i56 = i16 & 8192;
            if (i56 != 0) {
                i58 = i54 | 3072;
            } else {
                i57 = i54;
                if ((i15 & 3072) == 0) {
                    i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                } else {
                    i58 = i57;
                }
            }
            if ((i15 & 24576) != 0) {
                i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
            }
            int i6111111116 = i58;
            if ((i47 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (o0VarE.n(i47 & 1, z18)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i64 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i24 != 0) {
                        num2 = null;
                    }
                    if (i26 != 0) {
                        z16 = true;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        x5.v.f188954b.getClass();
                        int i6111111117 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        a2Var4 = new p006l2.a2(0, (Boolean) null, i6111111117, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    } else {
                        a2Var4 = a2Var2;
                    }
                    if ((i16 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        jD = d92.b.a(o0VarE).k().d();
                    }
                    if ((i16 & 256) != 0) {
                        sgVarD = d(o0VarE);
                    }
                    if (i35 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i37 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i44 != 0) {
                        x5.r0.f188941a.getClass();
                        r0Var3 = x5.r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    if (i48 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar3 = (a2.j) objQ;
                    } else {
                        jVar3 = jVar;
                    }
                    r0Var4 = r0Var3;
                    jVar4 = jVar3;
                    sgVar3 = sgVarD;
                    j15 = jD;
                    z25 = z27;
                    if (i56 != 0) {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = null;
                    } else {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = lVar;
                    }
                } else {
                    if (i64 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i24 != 0) {
                        num2 = null;
                    }
                    if (i26 != 0) {
                        z16 = true;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        x5.v.f188954b.getClass();
                        int i6111111118 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        a2Var4 = new p006l2.a2(0, (Boolean) null, i6111111118, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    } else {
                        a2Var4 = a2Var2;
                    }
                    if ((i16 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        jD = d92.b.a(o0VarE).k().d();
                    }
                    if ((i16 & 256) != 0) {
                        sgVarD = d(o0VarE);
                    }
                    if (i35 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i37 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i44 != 0) {
                        x5.r0.f188941a.getClass();
                        r0Var3 = x5.r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    if (i48 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar3 = (a2.j) objQ;
                    } else {
                        jVar3 = jVar;
                    }
                    r0Var4 = r0Var3;
                    jVar4 = jVar3;
                    sgVar3 = sgVarD;
                    j15 = jD;
                    z25 = z27;
                    if (i56 != 0) {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = null;
                    } else {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = lVar;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var119 = p3.n.f135158a;
                final m4.q qVar119 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            p3.x1 x1Var1110 = p3.n.f135158a;
                            g6.f.a aVar = g6.f.f75994b;
                            h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                            e23.l lVar5 = lVar4;
                            boolean zB = mVar2.B(lVar5);
                            Object objQ2 = mVar2.q();
                            p3.m.a aVar2 = p3.m.f135153a;
                            if (zB) {
                                objQ2 = new k11.n(lVar5, 7);
                                mVar2.K(objQ2);
                            } else {
                                aVar2.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new k11.n(lVar5, 7);
                                    mVar2.K(objQ2);
                                }
                            }
                            h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                            m4.q qVar1110 = qVar119;
                            boolean zR = mVar2.r(qVar1110);
                            Object objQ3 = mVar2.q();
                            if (zR) {
                                objQ3 = new b82.k0(qVar1110, 6);
                                mVar2.K(objQ3);
                            } else {
                                aVar2.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new b82.k0(qVar1110, 6);
                                    mVar2.K(objQ3);
                                }
                            }
                            p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                            boolean z28 = z25;
                            if (!z28) {
                                x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                            }
                            Integer num5 = num4;
                            boolean zB2 = mVar2.B(num5);
                            e23.l lVar6 = lVar2;
                            boolean zB3 = zB2 | mVar2.B(lVar6);
                            Object objQ4 = mVar2.q();
                            if (zB3) {
                                objQ4 = new i1(lVar6, 1, num5);
                                mVar2.K(objQ4);
                            } else {
                                aVar2.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new i1(lVar6, 1, num5);
                                    mVar2.K(objQ4);
                                }
                            }
                            eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 12582912, 122);
                o0Var = o0VarE;
                str2 = str3;
                num3 = num4;
                z24 = z25;
                pVar3 = pVar8;
                pVar4 = pVar7;
                r0Var2 = r0Var4;
                a2Var3 = a2Var5;
                z19 = z26;
                jVar2 = jVar4;
                sgVar2 = sgVar3;
                lVar3 = lVar4;
                j14 = j15;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str2 = str;
                pVar3 = pVar2;
                num3 = num2;
                z19 = z16;
                z24 = z17;
                a2Var3 = a2Var2;
                rVar3 = rVar2;
                sgVar2 = sgVarD;
                j14 = jD;
                pVar4 = pVar;
                r0Var2 = r0Var;
                jVar2 = jVar;
                lVar3 = lVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                final h4.r rVar1111 = rVar3;
                p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        p1.b(l0Var, rVar1111, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i17 |= 3072;
        num2 = num;
        i26 = i16 & 16;
        if (i26 != 0) {
            if ((i14 & 24576) == 0) {
                z16 = z14;
                if (o0VarE.h(z16)) {
                    i27 = 16384;
                } else {
                    i27 = 8192;
                }
                i17 |= i27;
            }
            i28 = i16 & 32;
            if (i28 != 0) {
                i17 |= 196608;
                z17 = z15;
            } else {
                z17 = z15;
                if ((i14 & 196608) == 0) {
                    if (o0VarE.h(z17)) {
                        i29 = 131072;
                    } else {
                        i29 = 65536;
                    }
                    i17 |= i29;
                }
            }
            i30 = i16 & 64;
            if (i30 != 0) {
                i17 |= 1572864;
                a2Var2 = a2Var;
            } else {
                a2Var2 = a2Var;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.B(a2Var2)) {
                        i34 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i34 = 524288;
                    }
                    i17 |= i34;
                }
            }
            if ((i14 & 12582912) == 0) {
                jD = j8;
                if ((i16 & 128) == 0) {
                    i59 = 4194304;
                } else {
                    i59 = 4194304;
                }
                i17 |= i59;
            } else {
                jD = j8;
            }
            if ((i14 & 100663296) == 0) {
                if ((i16 & 256) == 0) {
                    sgVarD = sgVar;
                    if (o0VarE.B(sgVarD)) {
                    }
                    i17 |= i65;
                } else {
                    sgVarD = sgVar;
                }
                i17 |= i65;
            } else {
                sgVarD = sgVar;
            }
            i35 = i16 & 512;
            if (i35 != 0) {
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(pVar)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i17 |= i36;
                }
                i37 = i16 & 1024;
                if (i37 != 0) {
                    i38 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i38 = i15 | i39;
                } else {
                    i38 = i15;
                }
                i44 = i16 & 2048;
                if (i44 != 0) {
                    i38 |= 48;
                } else if ((i15 & 48) != 0) {
                    if (o0VarE.B(r0Var)) {
                        i45 = 32;
                    } else {
                        i45 = 16;
                    }
                    i38 |= i45;
                }
                i46 = i38;
                i47 = i17;
                i48 = i16 & 4096;
                if (i48 != 0) {
                    i54 = i46 | 384;
                } else {
                    i49 = i46;
                    if ((i15 & 384) != 0) {
                        if (o0VarE.B(jVar)) {
                            i55 = 256;
                        } else {
                            i55 = 128;
                        }
                        i49 |= i55;
                    }
                    i54 = i49;
                }
                i56 = i16 & 8192;
                if (i56 != 0) {
                    i58 = i54 | 3072;
                } else {
                    i57 = i54;
                    if ((i15 & 3072) == 0) {
                        i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                    } else {
                        i58 = i57;
                    }
                }
                if ((i15 & 24576) != 0) {
                    i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
                }
                int i6111111119 = i58;
                if ((i47 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (o0VarE.n(i47 & 1, z18)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0) {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i61111111110 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i61111111110, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    } else {
                        if (i64 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i18 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i24 != 0) {
                            num2 = null;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            x5.v.f188954b.getClass();
                            int i61111111111 = x5.v.f188955c;
                            x5.p.f188918b.getClass();
                            a2Var4 = new p006l2.a2(0, (Boolean) null, i61111111111, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        } else {
                            a2Var4 = a2Var2;
                        }
                        if ((i16 & 128) != 0) {
                            d92.b.f58623a.getClass();
                            jD = d92.b.a(o0VarE).k().d();
                        }
                        if ((i16 & 256) != 0) {
                            sgVarD = d(o0VarE);
                        }
                        if (i35 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i37 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i44 != 0) {
                            x5.r0.f188941a.getClass();
                            r0Var3 = x5.r0.a.f188943b;
                        } else {
                            r0Var3 = r0Var;
                        }
                        if (i48 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        r0Var4 = r0Var3;
                        jVar4 = jVar3;
                        sgVar3 = sgVarD;
                        j15 = jD;
                        z25 = z27;
                        if (i56 != 0) {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = null;
                        } else {
                            a2Var5 = a2Var4;
                            num4 = num2;
                            z26 = z16;
                            pVar7 = pVar5;
                            pVar8 = pVar6;
                            lVar4 = lVar;
                        }
                    }
                    o0VarE.h0();
                    p3.x1 x1Var1110 = p3.n.f135158a;
                    final m4.q qVar1110 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                        /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                        /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                        /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                p3.x1 x1Var1111 = p3.n.f135158a;
                                g6.f.a aVar = g6.f.f75994b;
                                h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                                e23.l lVar5 = lVar4;
                                boolean zB = mVar2.B(lVar5);
                                Object objQ2 = mVar2.q();
                                p3.m.a aVar2 = p3.m.f135153a;
                                if (zB) {
                                    objQ2 = new k11.n(lVar5, 7);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar2.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new k11.n(lVar5, 7);
                                        mVar2.K(objQ2);
                                    }
                                }
                                h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                                m4.q qVar1111 = qVar1110;
                                boolean zR = mVar2.r(qVar1111);
                                Object objQ3 = mVar2.q();
                                if (zR) {
                                    objQ3 = new b82.k0(qVar1111, 6);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar2.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new b82.k0(qVar1111, 6);
                                        mVar2.K(objQ3);
                                    }
                                }
                                p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                boolean z28 = z25;
                                if (!z28) {
                                    x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                }
                                Integer num5 = num4;
                                boolean zB2 = mVar2.B(num5);
                                e23.l lVar6 = lVar2;
                                boolean zB3 = zB2 | mVar2.B(lVar6);
                                Object objQ4 = mVar2.q();
                                if (zB3) {
                                    objQ4 = new i1(lVar6, 1, num5);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar2.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new i1(lVar6, 1, num5);
                                        mVar2.K(objQ4);
                                    }
                                }
                                eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, 12582912, 122);
                    o0Var = o0VarE;
                    str2 = str3;
                    num3 = num4;
                    z24 = z25;
                    pVar3 = pVar8;
                    pVar4 = pVar7;
                    r0Var2 = r0Var4;
                    a2Var3 = a2Var5;
                    z19 = z26;
                    jVar2 = jVar4;
                    sgVar2 = sgVar3;
                    lVar3 = lVar4;
                    j14 = j15;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    str2 = str;
                    pVar3 = pVar2;
                    num3 = num2;
                    z19 = z16;
                    z24 = z17;
                    a2Var3 = a2Var2;
                    rVar3 = rVar2;
                    sgVar2 = sgVarD;
                    j14 = jD;
                    pVar4 = pVar;
                    r0Var2 = r0Var;
                    jVar2 = jVar;
                    lVar3 = lVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    final h4.r rVar1112 = rVar3;
                    p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i14 | 1);
                            int iT2 = p3.p0.t(i15);
                            p1.b(l0Var, rVar1112, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i17 |= C.ENCODING_PCM_32BIT;
            i37 = i16 & 1024;
            if (i37 != 0) {
                i38 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.r(pVar2)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i38 = i15 | i39;
            } else {
                i38 = i15;
            }
            i44 = i16 & 2048;
            if (i44 != 0) {
                i38 |= 48;
            } else if ((i15 & 48) != 0) {
                if (o0VarE.B(r0Var)) {
                    i45 = 32;
                } else {
                    i45 = 16;
                }
                i38 |= i45;
            }
            i46 = i38;
            i47 = i17;
            i48 = i16 & 4096;
            if (i48 != 0) {
                i54 = i46 | 384;
            } else {
                i49 = i46;
                if ((i15 & 384) != 0) {
                    if (o0VarE.B(jVar)) {
                        i55 = 256;
                    } else {
                        i55 = 128;
                    }
                    i49 |= i55;
                }
                i54 = i49;
            }
            i56 = i16 & 8192;
            if (i56 != 0) {
                i58 = i54 | 3072;
            } else {
                i57 = i54;
                if ((i15 & 3072) == 0) {
                    i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                } else {
                    i58 = i57;
                }
            }
            if ((i15 & 24576) != 0) {
                i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
            }
            int i61111111112 = i58;
            if ((i47 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (o0VarE.n(i47 & 1, z18)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i64 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i24 != 0) {
                        num2 = null;
                    }
                    if (i26 != 0) {
                        z16 = true;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        x5.v.f188954b.getClass();
                        int i61111111113 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        a2Var4 = new p006l2.a2(0, (Boolean) null, i61111111113, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    } else {
                        a2Var4 = a2Var2;
                    }
                    if ((i16 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        jD = d92.b.a(o0VarE).k().d();
                    }
                    if ((i16 & 256) != 0) {
                        sgVarD = d(o0VarE);
                    }
                    if (i35 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i37 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i44 != 0) {
                        x5.r0.f188941a.getClass();
                        r0Var3 = x5.r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    if (i48 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar3 = (a2.j) objQ;
                    } else {
                        jVar3 = jVar;
                    }
                    r0Var4 = r0Var3;
                    jVar4 = jVar3;
                    sgVar3 = sgVarD;
                    j15 = jD;
                    z25 = z27;
                    if (i56 != 0) {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = null;
                    } else {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = lVar;
                    }
                } else {
                    if (i64 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i24 != 0) {
                        num2 = null;
                    }
                    if (i26 != 0) {
                        z16 = true;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        x5.v.f188954b.getClass();
                        int i61111111114 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        a2Var4 = new p006l2.a2(0, (Boolean) null, i61111111114, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    } else {
                        a2Var4 = a2Var2;
                    }
                    if ((i16 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        jD = d92.b.a(o0VarE).k().d();
                    }
                    if ((i16 & 256) != 0) {
                        sgVarD = d(o0VarE);
                    }
                    if (i35 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i37 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i44 != 0) {
                        x5.r0.f188941a.getClass();
                        r0Var3 = x5.r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    if (i48 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar3 = (a2.j) objQ;
                    } else {
                        jVar3 = jVar;
                    }
                    r0Var4 = r0Var3;
                    jVar4 = jVar3;
                    sgVar3 = sgVarD;
                    j15 = jD;
                    z25 = z27;
                    if (i56 != 0) {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = null;
                    } else {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = lVar;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var1111 = p3.n.f135158a;
                final m4.q qVar1111 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            p3.x1 x1Var1112 = p3.n.f135158a;
                            g6.f.a aVar = g6.f.f75994b;
                            h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                            e23.l lVar5 = lVar4;
                            boolean zB = mVar2.B(lVar5);
                            Object objQ2 = mVar2.q();
                            p3.m.a aVar2 = p3.m.f135153a;
                            if (zB) {
                                objQ2 = new k11.n(lVar5, 7);
                                mVar2.K(objQ2);
                            } else {
                                aVar2.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new k11.n(lVar5, 7);
                                    mVar2.K(objQ2);
                                }
                            }
                            h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                            m4.q qVar1112 = qVar1111;
                            boolean zR = mVar2.r(qVar1112);
                            Object objQ3 = mVar2.q();
                            if (zR) {
                                objQ3 = new b82.k0(qVar1112, 6);
                                mVar2.K(objQ3);
                            } else {
                                aVar2.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new b82.k0(qVar1112, 6);
                                    mVar2.K(objQ3);
                                }
                            }
                            p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                            boolean z28 = z25;
                            if (!z28) {
                                x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                            }
                            Integer num5 = num4;
                            boolean zB2 = mVar2.B(num5);
                            e23.l lVar6 = lVar2;
                            boolean zB3 = zB2 | mVar2.B(lVar6);
                            Object objQ4 = mVar2.q();
                            if (zB3) {
                                objQ4 = new i1(lVar6, 1, num5);
                                mVar2.K(objQ4);
                            } else {
                                aVar2.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new i1(lVar6, 1, num5);
                                    mVar2.K(objQ4);
                                }
                            }
                            eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 12582912, 122);
                o0Var = o0VarE;
                str2 = str3;
                num3 = num4;
                z24 = z25;
                pVar3 = pVar8;
                pVar4 = pVar7;
                r0Var2 = r0Var4;
                a2Var3 = a2Var5;
                z19 = z26;
                jVar2 = jVar4;
                sgVar2 = sgVar3;
                lVar3 = lVar4;
                j14 = j15;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str2 = str;
                pVar3 = pVar2;
                num3 = num2;
                z19 = z16;
                z24 = z17;
                a2Var3 = a2Var2;
                rVar3 = rVar2;
                sgVar2 = sgVarD;
                j14 = jD;
                pVar4 = pVar;
                r0Var2 = r0Var;
                jVar2 = jVar;
                lVar3 = lVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                final h4.r rVar1113 = rVar3;
                p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        p1.b(l0Var, rVar1113, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i17 |= 24576;
        z16 = z14;
        i28 = i16 & 32;
        if (i28 != 0) {
            i17 |= 196608;
            z17 = z15;
        } else {
            z17 = z15;
            if ((i14 & 196608) == 0) {
                if (o0VarE.h(z17)) {
                    i29 = 131072;
                } else {
                    i29 = 65536;
                }
                i17 |= i29;
            }
        }
        i30 = i16 & 64;
        if (i30 != 0) {
            i17 |= 1572864;
            a2Var2 = a2Var;
        } else {
            a2Var2 = a2Var;
            if ((i14 & 1572864) == 0) {
                if (o0VarE.B(a2Var2)) {
                    i34 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i34 = 524288;
                }
                i17 |= i34;
            }
        }
        if ((i14 & 12582912) == 0) {
            jD = j8;
            if ((i16 & 128) == 0) {
                i59 = 4194304;
            } else {
                i59 = 4194304;
            }
            i17 |= i59;
        } else {
            jD = j8;
        }
        if ((i14 & 100663296) == 0) {
            if ((i16 & 256) == 0) {
                sgVarD = sgVar;
                if (o0VarE.B(sgVarD)) {
                }
                i17 |= i65;
            } else {
                sgVarD = sgVar;
            }
            i17 |= i65;
        } else {
            sgVarD = sgVar;
        }
        i35 = i16 & 512;
        if (i35 != 0) {
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(pVar)) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i17 |= i36;
            }
            i37 = i16 & 1024;
            if (i37 != 0) {
                i38 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.r(pVar2)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i38 = i15 | i39;
            } else {
                i38 = i15;
            }
            i44 = i16 & 2048;
            if (i44 != 0) {
                i38 |= 48;
            } else if ((i15 & 48) != 0) {
                if (o0VarE.B(r0Var)) {
                    i45 = 32;
                } else {
                    i45 = 16;
                }
                i38 |= i45;
            }
            i46 = i38;
            i47 = i17;
            i48 = i16 & 4096;
            if (i48 != 0) {
                i54 = i46 | 384;
            } else {
                i49 = i46;
                if ((i15 & 384) != 0) {
                    if (o0VarE.B(jVar)) {
                        i55 = 256;
                    } else {
                        i55 = 128;
                    }
                    i49 |= i55;
                }
                i54 = i49;
            }
            i56 = i16 & 8192;
            if (i56 != 0) {
                i58 = i54 | 3072;
            } else {
                i57 = i54;
                if ((i15 & 3072) == 0) {
                    i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
                } else {
                    i58 = i57;
                }
            }
            if ((i15 & 24576) != 0) {
                i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
            }
            int i61111111115 = i58;
            if ((i47 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (o0VarE.n(i47 & 1, z18)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i64 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i24 != 0) {
                        num2 = null;
                    }
                    if (i26 != 0) {
                        z16 = true;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        x5.v.f188954b.getClass();
                        int i61111111116 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        a2Var4 = new p006l2.a2(0, (Boolean) null, i61111111116, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    } else {
                        a2Var4 = a2Var2;
                    }
                    if ((i16 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        jD = d92.b.a(o0VarE).k().d();
                    }
                    if ((i16 & 256) != 0) {
                        sgVarD = d(o0VarE);
                    }
                    if (i35 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i37 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i44 != 0) {
                        x5.r0.f188941a.getClass();
                        r0Var3 = x5.r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    if (i48 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar3 = (a2.j) objQ;
                    } else {
                        jVar3 = jVar;
                    }
                    r0Var4 = r0Var3;
                    jVar4 = jVar3;
                    sgVar3 = sgVarD;
                    j15 = jD;
                    z25 = z27;
                    if (i56 != 0) {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = null;
                    } else {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = lVar;
                    }
                } else {
                    if (i64 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i18 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i24 != 0) {
                        num2 = null;
                    }
                    if (i26 != 0) {
                        z16 = true;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        x5.v.f188954b.getClass();
                        int i61111111117 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        a2Var4 = new p006l2.a2(0, (Boolean) null, i61111111117, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    } else {
                        a2Var4 = a2Var2;
                    }
                    if ((i16 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        jD = d92.b.a(o0VarE).k().d();
                    }
                    if ((i16 & 256) != 0) {
                        sgVarD = d(o0VarE);
                    }
                    if (i35 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i37 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i44 != 0) {
                        x5.r0.f188941a.getClass();
                        r0Var3 = x5.r0.a.f188943b;
                    } else {
                        r0Var3 = r0Var;
                    }
                    if (i48 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar3 = (a2.j) objQ;
                    } else {
                        jVar3 = jVar;
                    }
                    r0Var4 = r0Var3;
                    jVar4 = jVar3;
                    sgVar3 = sgVarD;
                    j15 = jD;
                    z25 = z27;
                    if (i56 != 0) {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = null;
                    } else {
                        a2Var5 = a2Var4;
                        num4 = num2;
                        z26 = z16;
                        pVar7 = pVar5;
                        pVar8 = pVar6;
                        lVar4 = lVar;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var1112 = p3.n.f135158a;
                final m4.q qVar1112 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            p3.x1 x1Var1113 = p3.n.f135158a;
                            g6.f.a aVar = g6.f.f75994b;
                            h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                            e23.l lVar5 = lVar4;
                            boolean zB = mVar2.B(lVar5);
                            Object objQ2 = mVar2.q();
                            p3.m.a aVar2 = p3.m.f135153a;
                            if (zB) {
                                objQ2 = new k11.n(lVar5, 7);
                                mVar2.K(objQ2);
                            } else {
                                aVar2.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new k11.n(lVar5, 7);
                                    mVar2.K(objQ2);
                                }
                            }
                            h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                            m4.q qVar1113 = qVar1112;
                            boolean zR = mVar2.r(qVar1113);
                            Object objQ3 = mVar2.q();
                            if (zR) {
                                objQ3 = new b82.k0(qVar1113, 6);
                                mVar2.K(objQ3);
                            } else {
                                aVar2.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new b82.k0(qVar1113, 6);
                                    mVar2.K(objQ3);
                                }
                            }
                            p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                            boolean z28 = z25;
                            if (!z28) {
                                x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                            }
                            Integer num5 = num4;
                            boolean zB2 = mVar2.B(num5);
                            e23.l lVar6 = lVar2;
                            boolean zB3 = zB2 | mVar2.B(lVar6);
                            Object objQ4 = mVar2.q();
                            if (zB3) {
                                objQ4 = new i1(lVar6, 1, num5);
                                mVar2.K(objQ4);
                            } else {
                                aVar2.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new i1(lVar6, 1, num5);
                                    mVar2.K(objQ4);
                                }
                            }
                            eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 12582912, 122);
                o0Var = o0VarE;
                str2 = str3;
                num3 = num4;
                z24 = z25;
                pVar3 = pVar8;
                pVar4 = pVar7;
                r0Var2 = r0Var4;
                a2Var3 = a2Var5;
                z19 = z26;
                jVar2 = jVar4;
                sgVar2 = sgVar3;
                lVar3 = lVar4;
                j14 = j15;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str2 = str;
                pVar3 = pVar2;
                num3 = num2;
                z19 = z16;
                z24 = z17;
                a2Var3 = a2Var2;
                rVar3 = rVar2;
                sgVar2 = sgVarD;
                j14 = jD;
                pVar4 = pVar;
                r0Var2 = r0Var;
                jVar2 = jVar;
                lVar3 = lVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                final h4.r rVar1114 = rVar3;
                p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        p1.b(l0Var, rVar1114, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i17 |= C.ENCODING_PCM_32BIT;
        i37 = i16 & 1024;
        if (i37 != 0) {
            i38 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            if (o0VarE.r(pVar2)) {
                i39 = 4;
            } else {
                i39 = 2;
            }
            i38 = i15 | i39;
        } else {
            i38 = i15;
        }
        i44 = i16 & 2048;
        if (i44 != 0) {
            i38 |= 48;
        } else if ((i15 & 48) != 0) {
            if (o0VarE.B(r0Var)) {
                i45 = 32;
            } else {
                i45 = 16;
            }
            i38 |= i45;
        }
        i46 = i38;
        i47 = i17;
        i48 = i16 & 4096;
        if (i48 != 0) {
            i54 = i46 | 384;
        } else {
            i49 = i46;
            if ((i15 & 384) != 0) {
                if (o0VarE.B(jVar)) {
                    i55 = 256;
                } else {
                    i55 = 128;
                }
                i49 |= i55;
            }
            i54 = i49;
        }
        i56 = i16 & 8192;
        if (i56 != 0) {
            i58 = i54 | 3072;
        } else {
            i57 = i54;
            if ((i15 & 3072) == 0) {
                i58 = i57 | (o0VarE.r(lVar) ? 2048 : 1024);
            } else {
                i58 = i57;
            }
        }
        if ((i15 & 24576) != 0) {
            i58 |= o0VarE.r(lVar2) ? 16384 : 8192;
        }
        int i61111111118 = i58;
        if ((i47 & 306783379) == 306783378) {
            z18 = true;
        } else {
            z18 = true;
        }
        if (o0VarE.n(i47 & 1, z18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i64 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i18 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i24 != 0) {
                    num2 = null;
                }
                if (i26 != 0) {
                    z16 = true;
                }
                if (i28 == 0) {
                }
                if (i30 != 0) {
                    x5.v.f188954b.getClass();
                    int i61111111119 = x5.v.f188955c;
                    x5.p.f188918b.getClass();
                    a2Var4 = new p006l2.a2(0, (Boolean) null, i61111111119, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                } else {
                    a2Var4 = a2Var2;
                }
                if ((i16 & 128) != 0) {
                    d92.b.f58623a.getClass();
                    jD = d92.b.a(o0VarE).k().d();
                }
                if ((i16 & 256) != 0) {
                    sgVarD = d(o0VarE);
                }
                if (i35 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i37 != 0) {
                    pVar6 = null;
                } else {
                    pVar6 = pVar2;
                }
                if (i44 != 0) {
                    x5.r0.f188941a.getClass();
                    r0Var3 = x5.r0.a.f188943b;
                } else {
                    r0Var3 = r0Var;
                }
                if (i48 != 0) {
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.b(o0VarE);
                    }
                    jVar3 = (a2.j) objQ;
                } else {
                    jVar3 = jVar;
                }
                r0Var4 = r0Var3;
                jVar4 = jVar3;
                sgVar3 = sgVarD;
                j15 = jD;
                z25 = z27;
                if (i56 != 0) {
                    a2Var5 = a2Var4;
                    num4 = num2;
                    z26 = z16;
                    pVar7 = pVar5;
                    pVar8 = pVar6;
                    lVar4 = null;
                } else {
                    a2Var5 = a2Var4;
                    num4 = num2;
                    z26 = z16;
                    pVar7 = pVar5;
                    pVar8 = pVar6;
                    lVar4 = lVar;
                }
            } else {
                if (i64 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i18 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i24 != 0) {
                    num2 = null;
                }
                if (i26 != 0) {
                    z16 = true;
                }
                if (i28 == 0) {
                }
                if (i30 != 0) {
                    x5.v.f188954b.getClass();
                    int i611111111110 = x5.v.f188955c;
                    x5.p.f188918b.getClass();
                    a2Var4 = new p006l2.a2(0, (Boolean) null, i611111111110, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                } else {
                    a2Var4 = a2Var2;
                }
                if ((i16 & 128) != 0) {
                    d92.b.f58623a.getClass();
                    jD = d92.b.a(o0VarE).k().d();
                }
                if ((i16 & 256) != 0) {
                    sgVarD = d(o0VarE);
                }
                if (i35 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i37 != 0) {
                    pVar6 = null;
                } else {
                    pVar6 = pVar2;
                }
                if (i44 != 0) {
                    x5.r0.f188941a.getClass();
                    r0Var3 = x5.r0.a.f188943b;
                } else {
                    r0Var3 = r0Var;
                }
                if (i48 != 0) {
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.b(o0VarE);
                    }
                    jVar3 = (a2.j) objQ;
                } else {
                    jVar3 = jVar;
                }
                r0Var4 = r0Var3;
                jVar4 = jVar3;
                sgVar3 = sgVarD;
                j15 = jD;
                z25 = z27;
                if (i56 != 0) {
                    a2Var5 = a2Var4;
                    num4 = num2;
                    z26 = z16;
                    pVar7 = pVar5;
                    pVar8 = pVar6;
                    lVar4 = null;
                } else {
                    a2Var5 = a2Var4;
                    num4 = num2;
                    z26 = z16;
                    pVar7 = pVar5;
                    pVar8 = pVar6;
                    lVar4 = lVar;
                }
            }
            o0VarE.h0();
            p3.x1 x1Var1113 = p3.n.f135158a;
            final m4.q qVar1113 = (m4.q) o0VarE.A(kotlin.t1.f91491i);
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = str3;
            }
            ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar3), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1779754417, new e23.p() { // from class: l72.k1
                /* JADX WARN: Code duplicated, block: B:12:0x0040  */
                /* JADX WARN: Code duplicated, block: B:17:0x0062  */
                /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        p3.x1 x1Var1114 = p3.n.f135158a;
                        g6.f.a aVar = g6.f.f75994b;
                        h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                        e23.l lVar5 = lVar4;
                        boolean zB = mVar2.B(lVar5);
                        Object objQ2 = mVar2.q();
                        p3.m.a aVar2 = p3.m.f135153a;
                        if (zB) {
                            objQ2 = new k11.n(lVar5, 7);
                            mVar2.K(objQ2);
                        } else {
                            aVar2.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new k11.n(lVar5, 7);
                                mVar2.K(objQ2);
                            }
                        }
                        h4.r rVarC = m4.e.c(rVarA, (e23.l) objQ2);
                        m4.q qVar1114 = qVar1113;
                        boolean zR = mVar2.r(qVar1114);
                        Object objQ3 = mVar2.q();
                        if (zR) {
                            objQ3 = new b82.k0(qVar1114, 6);
                            mVar2.K(objQ3);
                        } else {
                            aVar2.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new b82.k0(qVar1114, 6);
                                mVar2.K(objQ3);
                            }
                        }
                        p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ3, null, null, null, null, null, 62, null);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                        boolean z28 = z25;
                        if (!z28) {
                            x0VarB = s5.x0.a(x0VarB, o4.d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        }
                        Integer num5 = num4;
                        boolean zB2 = mVar2.B(num5);
                        e23.l lVar6 = lVar2;
                        boolean zB3 = zB2 | mVar2.B(lVar6);
                        Object objQ4 = mVar2.q();
                        if (zB3) {
                            objQ4 = new i1(lVar6, 1, num5);
                            mVar2.K(objQ4);
                        } else {
                            aVar2.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new i1(lVar6, 1, num5);
                                mVar2.K(objQ4);
                            }
                        }
                        eh.b(l0Var, (e23.l) objQ4, rVarC, z28, x0VarB, null, z3.f.c(1414027850, new es1.a(str4, j15, 2), mVar2), pVar8, pVar7, null, false, r0Var4, a2Var5, z1Var, z26, 0, 0, jVar4, null, sgVar3, mVar2, 12582912, 0, 0, 2899024);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 12582912, 122);
            o0Var = o0VarE;
            str2 = str3;
            num3 = num4;
            z24 = z25;
            pVar3 = pVar8;
            pVar4 = pVar7;
            r0Var2 = r0Var4;
            a2Var3 = a2Var5;
            z19 = z26;
            jVar2 = jVar4;
            sgVar2 = sgVar3;
            lVar3 = lVar4;
            j14 = j15;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str2 = str;
            pVar3 = pVar2;
            num3 = num2;
            z19 = z16;
            z24 = z17;
            a2Var3 = a2Var2;
            rVar3 = rVar2;
            sgVar2 = sgVarD;
            j14 = jD;
            pVar4 = pVar;
            r0Var2 = r0Var;
            jVar2 = jVar;
            lVar3 = lVar;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final h4.r rVar1115 = rVar3;
            p2VarI0.f135219d = new e23.p() { // from class: l72.l1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    p1.b(l0Var, rVar1115, str2, num3, z19, z24, a2Var3, j14, sgVar2, pVar4, pVar3, r0Var2, jVar2, lVar3, lVar2, (p3.m) obj, iT, iT2, i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void c(final String str, @SuppressLint({"ModifierParameter"}) h4.r rVar, final String str2, final Integer num, final boolean z14, final p006l2.a2 a2Var, final long j8, x5.r0 r0Var, a2.j jVar, i2.a aVar, final e23.l lVar, final e23.l lVar2, p3.m mVar, final int i14, final int i15) {
        int i16;
        Integer num2;
        p3.o0 o0Var;
        final h4.r rVar2;
        final x5.r0 r0Var2;
        final a2.j jVar2;
        final i2.a aVar2;
        final i2.a aVar3;
        final x5.r0 r0Var3;
        final a2.j jVar3;
        lVar2.getClass();
        p3.o0 o0VarE = mVar.E(-1658913814);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i17 = i16 | 48;
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.B(str2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            num2 = num;
            i17 |= o0VarE.B(num2) ? 2048 : 1024;
        } else {
            num2 = num;
        }
        int i18 = i17 | (o0VarE.B(a2Var) ? 131072 : 65536) | (o0VarE.l(j8) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 918552576;
        int i19 = (i15 & 6) == 0 ? i15 | 2 : i15;
        if ((i15 & 48) == 0) {
            i19 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i19 |= o0VarE.r(lVar2) ? 256 : 128;
        }
        if (o0VarE.n(i18 & 1, ((306783379 & i18) == 306783378 && (i19 & 147) == 146) ? false : true)) {
            o0VarE.G0();
            int i24 = i14 & 1;
            p3.m.a aVar4 = p3.m.f135153a;
            if (i24 == 0 || o0VarE.o0()) {
                rVar2 = h4.r.S;
                x5.r0.f188941a.getClass();
                nb0.b bVar = x5.r0.a.f188943b;
                Object objQ = o0VarE.q();
                aVar4.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = kg.f.b(o0VarE);
                }
                a2.j jVar4 = (a2.j) objQ;
                Object objQ2 = o0VarE.q();
                aVar4.getClass();
                if (objQ2 == c2565a) {
                    objQ2 = new i2.c();
                    o0VarE.K(objQ2);
                }
                aVar3 = (i2.a) objQ2;
                r0Var3 = bVar;
                jVar3 = jVar4;
            } else {
                o0VarE.e();
                rVar2 = rVar;
                r0Var3 = r0Var;
                jVar3 = jVar;
                aVar3 = aVar;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ3 = o0VarE.q();
            aVar4.getClass();
            if (objQ3 == p3.m.a.f135155b) {
                objQ3 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ3);
            }
            final o53.b0 b0Var = (o53.b0) objQ3;
            final m4.q qVar = (m4.q) o0VarE.A(kotlin.t1.f91491i);
            final String str3 = str2 == null ? "" : str2;
            final Integer num3 = num2;
            jVar2 = jVar3;
            o0Var = o0VarE;
            ve.a(c2.x2.f(h4.r.S, 1.0f).then(rVar2), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1025054459, new e23.p() { // from class: l72.m1
                /* JADX WARN: Code duplicated, block: B:15:0x0058  */
                /* JADX WARN: Code duplicated, block: B:20:0x007b  */
                /* JADX WARN: Code duplicated, block: B:25:0x00c6  */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        p3.x1 x1Var2 = p3.n.f135158a;
                        String str4 = str;
                        if (str4 == null) {
                            str4 = "";
                        }
                        g6.f.a aVar5 = g6.f.f75994b;
                        h4.r rVarA = c2.l.A(h4.r.S, 0, 0.0f, 2);
                        i2.a aVar6 = aVar3;
                        h4.r rVarA2 = i2.d.a(rVarA, aVar6);
                        e23.l lVar3 = lVar;
                        boolean zB = mVar2.B(lVar3);
                        o53.b0 b0Var2 = b0Var;
                        boolean zR = zB | mVar2.r(b0Var2) | mVar2.r(aVar6);
                        Object objQ4 = mVar2.q();
                        p3.m.a aVar7 = p3.m.f135153a;
                        if (zR) {
                            objQ4 = new k62.k(lVar3, 23, b0Var2, aVar6);
                            mVar2.K(objQ4);
                        } else {
                            aVar7.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new k62.k(lVar3, 23, b0Var2, aVar6);
                                mVar2.K(objQ4);
                            }
                        }
                        h4.r rVarC = m4.e.c(rVarA2, (e23.l) objQ4);
                        m4.q qVar2 = qVar;
                        boolean zR2 = mVar2.r(qVar2);
                        Object objQ5 = mVar2.q();
                        if (zR2) {
                            objQ5 = new b82.k0(qVar2, 5);
                            mVar2.K(objQ5);
                        } else {
                            aVar7.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new b82.k0(qVar2, 5);
                                mVar2.K(objQ5);
                            }
                        }
                        p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ5, null, null, null, null, null, 62, null);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                        sg sgVarD = p1.d(mVar2);
                        Integer num4 = num3;
                        boolean zB2 = mVar2.B(num4);
                        e23.l lVar4 = lVar2;
                        boolean zB3 = zB2 | mVar2.B(lVar4);
                        Object objQ6 = mVar2.q();
                        if (zB3) {
                            objQ6 = new i1(lVar4, 0, num4);
                            mVar2.K(objQ6);
                        } else {
                            aVar7.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new i1(lVar4, 0, num4);
                                mVar2.K(objQ6);
                            }
                        }
                        eh.a(str4, (e23.l) objQ6, rVarC, false, x0VarB, z3.f.c(949949034, new es1.a(str3, j8, 1), mVar2), null, null, r0Var3, a2Var, z1Var, z14, 0, 0, jVar3, null, sgVarD, mVar2, 12582912, 0, 2899544);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0Var, 12582912, 122);
            r0Var2 = r0Var3;
            aVar2 = aVar3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            r0Var2 = r0Var;
            jVar2 = jVar;
            aVar2 = aVar;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: l72.n1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    p1.c(str, rVar2, str2, num, z14, a2Var, j8, r0Var2, jVar2, aVar2, lVar, lVar2, (p3.m) obj, iT, iT2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final sg d(p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        d92.b.f58623a.getClass();
        z2.t2 t2Var = new z2.t2(d92.b.a(mVar).k().a(), o4.d0.c(0.4f, d92.b.a(mVar).k().a(), 14), null);
        ba baVar = ba.f87580a;
        o4.d0.f128823b.getClass();
        long j8 = o4.d0.f128831j;
        long jA = d92.b.a(mVar).k().a();
        baVar.getClass();
        return ba.c(0L, 0L, 0L, 0L, 0L, jA, t2Var, j8, j8, 0L, 0L, j8, j8, 0L, 0L, 0L, 0L, mVar, 2147377919);
    }
}
