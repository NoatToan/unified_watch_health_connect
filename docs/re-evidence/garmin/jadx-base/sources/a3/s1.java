package a3;

import com.google.android.exoplayer2.C;
import p005kotlin.Unit;
import p3.a4;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p3.j0 f819a;

    static {
        a4 a4Var = a4.f135041a;
        a4Var.getClass();
        f819a = new p3.j0(a4Var, new a03.d(11));
    }

    public static final void a(s5.x0 x0Var, e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-13499697);
        int i15 = (o0VarE.B(x0Var) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p3.j0 j0Var = f819a;
            p3.v.a(j0Var.c(((s5.x0) o0VarE.A(j0Var)).e(x0Var)), pVar, o0VarE, (i15 & 112) | 8);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q1(x0Var, pVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0127  */
    /* JADX WARN: Code duplicated, block: B:104:0x012f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0134  */
    /* JADX WARN: Code duplicated, block: B:107:0x013a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0140  */
    /* JADX WARN: Code duplicated, block: B:110:0x0143  */
    /* JADX WARN: Code duplicated, block: B:112:0x0148  */
    /* JADX WARN: Code duplicated, block: B:115:0x014e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0153  */
    /* JADX WARN: Code duplicated, block: B:119:0x0159  */
    /* JADX WARN: Code duplicated, block: B:121:0x015f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0162  */
    /* JADX WARN: Code duplicated, block: B:126:0x016b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0170  */
    /* JADX WARN: Code duplicated, block: B:130:0x0174  */
    /* JADX WARN: Code duplicated, block: B:132:0x017c  */
    /* JADX WARN: Code duplicated, block: B:133:0x017f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0189  */
    /* JADX WARN: Code duplicated, block: B:138:0x018c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0192  */
    /* JADX WARN: Code duplicated, block: B:142:0x019a  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:157:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:158:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:160:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:163:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:167:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:169:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:173:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:177:0x020a  */
    /* JADX WARN: Code duplicated, block: B:180:0x0214  */
    /* JADX WARN: Code duplicated, block: B:182:0x021b  */
    /* JADX WARN: Code duplicated, block: B:186:0x0238 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x023a  */
    /* JADX WARN: Code duplicated, block: B:188:0x023d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0241  */
    /* JADX WARN: Code duplicated, block: B:191:0x0249  */
    /* JADX WARN: Code duplicated, block: B:193:0x024d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0255  */
    /* JADX WARN: Code duplicated, block: B:196:0x0259  */
    /* JADX WARN: Code duplicated, block: B:198:0x025c  */
    /* JADX WARN: Code duplicated, block: B:199:0x0264  */
    /* JADX WARN: Code duplicated, block: B:201:0x0267  */
    /* JADX WARN: Code duplicated, block: B:202:0x026f  */
    /* JADX WARN: Code duplicated, block: B:204:0x0273  */
    /* JADX WARN: Code duplicated, block: B:205:0x027b  */
    /* JADX WARN: Code duplicated, block: B:207:0x027f  */
    /* JADX WARN: Code duplicated, block: B:209:0x0283  */
    /* JADX WARN: Code duplicated, block: B:210:0x0287  */
    /* JADX WARN: Code duplicated, block: B:213:0x028c  */
    /* JADX WARN: Code duplicated, block: B:215:0x0290  */
    /* JADX WARN: Code duplicated, block: B:216:0x0293  */
    /* JADX WARN: Code duplicated, block: B:219:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:220:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:223:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:226:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:228:0x0301  */
    /* JADX WARN: Code duplicated, block: B:230:0x0356  */
    /* JADX WARN: Code duplicated, block: B:233:0x0373  */
    /* JADX WARN: Code duplicated, block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:86:0x0101  */
    /* JADX WARN: Code duplicated, block: B:88:0x0108  */
    /* JADX WARN: Code duplicated, block: B:89:0x010b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119  */
    /* JADX WARN: Code duplicated, block: B:97:0x011d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0124  */
    public static final void b(final String str, h4.r rVar, long j8, long j14, w5.f0 f0Var, long j15, long j16, int i14, boolean z14, int i15, int i16, e23.l lVar, final s5.x0 x0Var, p3.m mVar, final int i17, final int i18, final int i19) {
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        w5.f0 f0Var2;
        int i34;
        int i35;
        int i36;
        long j17;
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
        boolean z15;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i64;
        int i65;
        boolean z16;
        p3.o0 o0Var;
        h4.r rVar2;
        final long j18;
        final int i66;
        final int i67;
        final e23.l lVar2;
        final boolean z17;
        final long j19;
        final w5.f0 f0Var3;
        final long j24;
        final long j25;
        final int i68;
        p2 p2VarI0;
        h4.r rVar3;
        long j26;
        long j27;
        int i69;
        int i74;
        int i75;
        e23.l lVar3;
        long j28;
        float fFloatValue;
        long jC;
        boolean zL;
        Object objQ;
        p3.o0 o0VarE = mVar.E(1028090691);
        if ((i17 & 6) == 0) {
            i24 = (o0VarE.B(str) ? 4 : 2) | i17;
        } else {
            i24 = i17;
        }
        int i76 = i19 & 2;
        if (i76 == 0) {
            if ((i17 & 48) == 0) {
                i24 |= o0VarE.B(rVar) ? 32 : 16;
            }
            i25 = i19 & 4;
            if (i25 != 0) {
                i24 |= 384;
            } else if ((i17 & 384) == 0) {
                if (o0VarE.l(j8)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i24 |= i26;
            }
            i27 = i19 & 8;
            if (i27 != 0) {
                i24 |= 3072;
            } else if ((i17 & 3072) == 0) {
                if (o0VarE.l(j14)) {
                    i28 = 2048;
                } else {
                    i28 = 1024;
                }
                i24 |= i28;
            }
            if ((i19 & 16) != 0) {
                i24 |= 24576;
            } else if ((i17 & 24576) == 0) {
                if (o0VarE.B(null)) {
                    i29 = 16384;
                } else {
                    i29 = 8192;
                }
                i24 |= i29;
            }
            i30 = i19 & 32;
            if (i30 != 0) {
                i24 |= 196608;
                f0Var2 = f0Var;
            } else {
                f0Var2 = f0Var;
                if ((i17 & 196608) == 0) {
                    if (o0VarE.B(f0Var2)) {
                        i34 = 131072;
                    } else {
                        i34 = 65536;
                    }
                    i24 |= i34;
                }
            }
            if ((i19 & 64) != 0) {
                i24 |= 1572864;
            } else if ((i17 & 1572864) == 0) {
                if (o0VarE.B(null)) {
                    i35 = 1048576;
                } else {
                    i35 = 524288;
                }
                i24 |= i35;
            }
            i36 = i19 & 128;
            if (i36 != 0) {
                i24 |= 12582912;
                j17 = j15;
            } else {
                j17 = j15;
                if ((i17 & 12582912) == 0) {
                    if (o0VarE.l(j17)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i24 |= i37;
                }
            }
            if ((i19 & 256) != 0) {
                i24 |= 100663296;
            } else if ((i17 & 100663296) == 0) {
                if (o0VarE.B(null)) {
                    i38 = 67108864;
                } else {
                    i38 = 33554432;
                }
                i24 |= i38;
            }
            if ((i19 & 512) != 0) {
                if ((i17 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.B(null)) {
                        i39 = 536870912;
                    } else {
                        i39 = 268435456;
                    }
                    i24 |= i39;
                }
                i44 = i19 & 1024;
                if (i44 != 0) {
                    i45 = i18 | 6;
                } else if ((i18 & 6) == 0) {
                    if (o0VarE.l(j16)) {
                        i46 = 4;
                    } else {
                        i46 = 2;
                    }
                    i45 = i18 | i46;
                } else {
                    i45 = i18;
                }
                i47 = i19 & 2048;
                if (i47 != 0) {
                    i45 |= 48;
                } else if ((i18 & 48) == 0) {
                    if (o0VarE.k(i14)) {
                        i48 = 32;
                    } else {
                        i48 = 16;
                    }
                    i45 |= i48;
                }
                i49 = i45;
                i54 = i19 & 4096;
                if (i54 != 0) {
                    if ((i18 & 384) == 0) {
                        z15 = z14;
                        if (o0VarE.h(z15)) {
                            i55 = 256;
                        } else {
                            i55 = 128;
                        }
                        i49 |= i55;
                    }
                    i56 = i19 & 8192;
                    if (i56 != 0) {
                        i58 = i49 | 3072;
                    } else {
                        i57 = i49;
                        if ((i18 & 3072) == 0) {
                            i58 = i57 | (o0VarE.k(i15) ? 2048 : 1024);
                        } else {
                            i58 = i57;
                        }
                    }
                    i59 = i19 & 16384;
                    if (i59 != 0) {
                        i64 = i58;
                        if ((i18 & 24576) == 0) {
                            i64 |= o0VarE.k(i16) ? 16384 : 8192;
                        }
                        i65 = i19 & 32768;
                        if (i65 != 0) {
                            i64 |= 196608;
                        } else if ((i18 & 196608) == 0) {
                            i64 |= o0VarE.r(lVar) ? 131072 : 65536;
                        }
                        if ((i18 & 1572864) == 0) {
                            i64 |= o0VarE.B(x0Var) ? 1048576 : 524288;
                        }
                        if ((i24 & 306783379) == 306783378 || (i64 & 599187) != 599186) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (o0VarE.n(i24 & 1, z16)) {
                            o0VarE.G0();
                            if ((i17 & 1) != 0 || o0VarE.o0()) {
                                if (i76 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar;
                                }
                                if (i25 != 0) {
                                    o4.d0.f128823b.getClass();
                                    j26 = o4.d0.f128832k;
                                } else {
                                    j26 = j8;
                                }
                                if (i27 != 0) {
                                    g6.q.f76018b.getClass();
                                    j27 = g6.q.f76020d;
                                } else {
                                    j27 = j14;
                                }
                                if (i30 != 0) {
                                    f0Var2 = null;
                                }
                                if (i36 != 0) {
                                    g6.q.f76018b.getClass();
                                    j19 = g6.q.f76020d;
                                } else {
                                    j19 = j17;
                                }
                                if (i44 != 0) {
                                    g6.q.f76018b.getClass();
                                    j25 = g6.q.f76020d;
                                } else {
                                    j25 = j16;
                                }
                                if (i47 != 0) {
                                    d6.p.f57793b.getClass();
                                    i69 = d6.p.f57794c;
                                } else {
                                    i69 = i14;
                                }
                                if (i54 != 0) {
                                    z15 = true;
                                }
                                if (i56 != 0) {
                                    i74 = Integer.MAX_VALUE;
                                } else {
                                    i74 = i15;
                                }
                                i75 = i59 == 0 ? i16 : 1;
                                if (i65 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                            } else {
                                o0VarE.e();
                                rVar3 = rVar;
                                j26 = j8;
                                j27 = j14;
                                i69 = i14;
                                i74 = i15;
                                i75 = i16;
                                lVar3 = lVar;
                                j19 = j17;
                                j25 = j16;
                            }
                            o0VarE.h0();
                            x1 x1Var = p3.n.f135158a;
                            j28 = ((o4.d0) o0VarE.A(x.f872a)).f128833a;
                            fFloatValue = ((Number) o0VarE.A(w.f867a)).floatValue();
                            if (j26 != 16) {
                                jC = j26;
                            } else if (x0Var.c() != 16) {
                                jC = x0Var.c();
                            } else {
                                jC = o4.d0.c(fFloatValue, j28, 14);
                            }
                            d6.h.f57752b.getClass();
                            s5.x0 x0VarF = s5.x0.f(x0Var, 0L, j27, f0Var2, j19, 0, j25, 16609105);
                            zL = o0VarE.l(jC);
                            h4.r rVar4 = rVar3;
                            objQ = o0VarE.q();
                            if (zL) {
                                objQ = new r1(jC);
                                o0VarE.K(objQ);
                            } else {
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new r1(jC);
                                    o0VarE.K(objQ);
                                }
                            }
                            int i77 = i64 << 9;
                            int i78 = i69;
                            p006l2.y.b(str, rVar4, x0VarF, lVar3, i78, z15, i74, i75, (o4.j0) objQ, null, o0VarE, (i24 & 126) | ((i64 >> 6) & 7168) | (57344 & i77) | (458752 & i77) | (3670016 & i77) | (i77 & 29360128), 512);
                            rVar2 = rVar4;
                            o0Var = o0VarE;
                            i66 = i78;
                            z17 = z15;
                            f0Var3 = f0Var2;
                            i67 = i75;
                            j18 = j26;
                            lVar2 = lVar3;
                            i68 = i74;
                            j24 = j27;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            rVar2 = rVar;
                            j18 = j8;
                            i66 = i14;
                            i67 = i16;
                            lVar2 = lVar;
                            z17 = z15;
                            j19 = j17;
                            f0Var3 = f0Var2;
                            j24 = j14;
                            j25 = j16;
                            i68 = i15;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            final h4.r rVar5 = rVar2;
                            p2VarI0.f135219d = new e23.p() { // from class: a3.p1
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iT = p3.p0.t(i17 | 1);
                                    int iT2 = p3.p0.t(i18);
                                    s1.b(str, rVar5, j18, j24, f0Var3, j19, j25, i66, z17, i68, i67, lVar2, x0Var, (p3.m) obj, iT, iT2, i19);
                                    return Unit.INSTANCE;
                                }
                            };
                        }
                    }
                    i64 = i58 | 24576;
                    i65 = i19 & 32768;
                    if (i65 != 0) {
                        i64 |= 196608;
                    } else if ((i18 & 196608) == 0) {
                        i64 |= o0VarE.r(lVar) ? 131072 : 65536;
                    }
                    if ((i18 & 1572864) == 0) {
                        i64 |= o0VarE.B(x0Var) ? 1048576 : 524288;
                    }
                    if ((i24 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i24 & 1, z16)) {
                        o0VarE.G0();
                        if ((i17 & 1) != 0) {
                            if (i76 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i25 != 0) {
                                o4.d0.f128823b.getClass();
                                j26 = o4.d0.f128832k;
                            } else {
                                j26 = j8;
                            }
                            if (i27 != 0) {
                                g6.q.f76018b.getClass();
                                j27 = g6.q.f76020d;
                            } else {
                                j27 = j14;
                            }
                            if (i30 != 0) {
                                f0Var2 = null;
                            }
                            if (i36 != 0) {
                                g6.q.f76018b.getClass();
                                j19 = g6.q.f76020d;
                            } else {
                                j19 = j17;
                            }
                            if (i44 != 0) {
                                g6.q.f76018b.getClass();
                                j25 = g6.q.f76020d;
                            } else {
                                j25 = j16;
                            }
                            if (i47 != 0) {
                                d6.p.f57793b.getClass();
                                i69 = d6.p.f57794c;
                            } else {
                                i69 = i14;
                            }
                            if (i54 != 0) {
                                z15 = true;
                            }
                            if (i56 != 0) {
                                i74 = Integer.MAX_VALUE;
                            } else {
                                i74 = i15;
                            }
                            if (i59 == 0) {
                            }
                            if (i65 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                        } else {
                            if (i76 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i25 != 0) {
                                o4.d0.f128823b.getClass();
                                j26 = o4.d0.f128832k;
                            } else {
                                j26 = j8;
                            }
                            if (i27 != 0) {
                                g6.q.f76018b.getClass();
                                j27 = g6.q.f76020d;
                            } else {
                                j27 = j14;
                            }
                            if (i30 != 0) {
                                f0Var2 = null;
                            }
                            if (i36 != 0) {
                                g6.q.f76018b.getClass();
                                j19 = g6.q.f76020d;
                            } else {
                                j19 = j17;
                            }
                            if (i44 != 0) {
                                g6.q.f76018b.getClass();
                                j25 = g6.q.f76020d;
                            } else {
                                j25 = j16;
                            }
                            if (i47 != 0) {
                                d6.p.f57793b.getClass();
                                i69 = d6.p.f57794c;
                            } else {
                                i69 = i14;
                            }
                            if (i54 != 0) {
                                z15 = true;
                            }
                            if (i56 != 0) {
                                i74 = Integer.MAX_VALUE;
                            } else {
                                i74 = i15;
                            }
                            if (i59 == 0) {
                            }
                            if (i65 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                        }
                        o0VarE.h0();
                        x1 x1Var2 = p3.n.f135158a;
                        j28 = ((o4.d0) o0VarE.A(x.f872a)).f128833a;
                        fFloatValue = ((Number) o0VarE.A(w.f867a)).floatValue();
                        if (j26 != 16) {
                            jC = j26;
                        } else if (x0Var.c() != 16) {
                            jC = x0Var.c();
                        } else {
                            jC = o4.d0.c(fFloatValue, j28, 14);
                        }
                        d6.h.f57752b.getClass();
                        s5.x0 x0VarF2 = s5.x0.f(x0Var, 0L, j27, f0Var2, j19, 0, j25, 16609105);
                        zL = o0VarE.l(jC);
                        h4.r rVar6 = rVar3;
                        objQ = o0VarE.q();
                        if (zL) {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new r1(jC);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new r1(jC);
                            o0VarE.K(objQ);
                        }
                        int i79 = i64 << 9;
                        int i710 = i69;
                        p006l2.y.b(str, rVar6, x0VarF2, lVar3, i710, z15, i74, i75, (o4.j0) objQ, null, o0VarE, (i24 & 126) | ((i64 >> 6) & 7168) | (57344 & i79) | (458752 & i79) | (3670016 & i79) | (i79 & 29360128), 512);
                        rVar2 = rVar6;
                        o0Var = o0VarE;
                        i66 = i710;
                        z17 = z15;
                        f0Var3 = f0Var2;
                        i67 = i75;
                        j18 = j26;
                        lVar2 = lVar3;
                        i68 = i74;
                        j24 = j27;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        rVar2 = rVar;
                        j18 = j8;
                        i66 = i14;
                        i67 = i16;
                        lVar2 = lVar;
                        z17 = z15;
                        j19 = j17;
                        f0Var3 = f0Var2;
                        j24 = j14;
                        j25 = j16;
                        i68 = i15;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        final h4.r rVar7 = rVar2;
                        p2VarI0.f135219d = new e23.p() { // from class: a3.p1
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i17 | 1);
                                int iT2 = p3.p0.t(i18);
                                s1.b(str, rVar7, j18, j24, f0Var3, j19, j25, i66, z17, i68, i67, lVar2, x0Var, (p3.m) obj, iT, iT2, i19);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i49 |= 384;
                z15 = z14;
                i56 = i19 & 8192;
                if (i56 != 0) {
                    i58 = i49 | 3072;
                } else {
                    i57 = i49;
                    if ((i18 & 3072) == 0) {
                        i58 = i57 | (o0VarE.k(i15) ? 2048 : 1024);
                    } else {
                        i58 = i57;
                    }
                }
                i59 = i19 & 16384;
                if (i59 != 0) {
                    i64 = i58;
                    if ((i18 & 24576) == 0) {
                        i64 |= o0VarE.k(i16) ? 16384 : 8192;
                    }
                    i65 = i19 & 32768;
                    if (i65 != 0) {
                        i64 |= 196608;
                    } else if ((i18 & 196608) == 0) {
                        i64 |= o0VarE.r(lVar) ? 131072 : 65536;
                    }
                    if ((i18 & 1572864) == 0) {
                        i64 |= o0VarE.B(x0Var) ? 1048576 : 524288;
                    }
                    if ((i24 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i24 & 1, z16)) {
                        o0VarE.G0();
                        if ((i17 & 1) != 0) {
                            if (i76 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i25 != 0) {
                                o4.d0.f128823b.getClass();
                                j26 = o4.d0.f128832k;
                            } else {
                                j26 = j8;
                            }
                            if (i27 != 0) {
                                g6.q.f76018b.getClass();
                                j27 = g6.q.f76020d;
                            } else {
                                j27 = j14;
                            }
                            if (i30 != 0) {
                                f0Var2 = null;
                            }
                            if (i36 != 0) {
                                g6.q.f76018b.getClass();
                                j19 = g6.q.f76020d;
                            } else {
                                j19 = j17;
                            }
                            if (i44 != 0) {
                                g6.q.f76018b.getClass();
                                j25 = g6.q.f76020d;
                            } else {
                                j25 = j16;
                            }
                            if (i47 != 0) {
                                d6.p.f57793b.getClass();
                                i69 = d6.p.f57794c;
                            } else {
                                i69 = i14;
                            }
                            if (i54 != 0) {
                                z15 = true;
                            }
                            if (i56 != 0) {
                                i74 = Integer.MAX_VALUE;
                            } else {
                                i74 = i15;
                            }
                            if (i59 == 0) {
                            }
                            if (i65 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                        } else {
                            if (i76 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i25 != 0) {
                                o4.d0.f128823b.getClass();
                                j26 = o4.d0.f128832k;
                            } else {
                                j26 = j8;
                            }
                            if (i27 != 0) {
                                g6.q.f76018b.getClass();
                                j27 = g6.q.f76020d;
                            } else {
                                j27 = j14;
                            }
                            if (i30 != 0) {
                                f0Var2 = null;
                            }
                            if (i36 != 0) {
                                g6.q.f76018b.getClass();
                                j19 = g6.q.f76020d;
                            } else {
                                j19 = j17;
                            }
                            if (i44 != 0) {
                                g6.q.f76018b.getClass();
                                j25 = g6.q.f76020d;
                            } else {
                                j25 = j16;
                            }
                            if (i47 != 0) {
                                d6.p.f57793b.getClass();
                                i69 = d6.p.f57794c;
                            } else {
                                i69 = i14;
                            }
                            if (i54 != 0) {
                                z15 = true;
                            }
                            if (i56 != 0) {
                                i74 = Integer.MAX_VALUE;
                            } else {
                                i74 = i15;
                            }
                            if (i59 == 0) {
                            }
                            if (i65 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                        }
                        o0VarE.h0();
                        x1 x1Var3 = p3.n.f135158a;
                        j28 = ((o4.d0) o0VarE.A(x.f872a)).f128833a;
                        fFloatValue = ((Number) o0VarE.A(w.f867a)).floatValue();
                        if (j26 != 16) {
                            jC = j26;
                        } else if (x0Var.c() != 16) {
                            jC = x0Var.c();
                        } else {
                            jC = o4.d0.c(fFloatValue, j28, 14);
                        }
                        d6.h.f57752b.getClass();
                        s5.x0 x0VarF3 = s5.x0.f(x0Var, 0L, j27, f0Var2, j19, 0, j25, 16609105);
                        zL = o0VarE.l(jC);
                        h4.r rVar8 = rVar3;
                        objQ = o0VarE.q();
                        if (zL) {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new r1(jC);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new r1(jC);
                            o0VarE.K(objQ);
                        }
                        int i711 = i64 << 9;
                        int i712 = i69;
                        p006l2.y.b(str, rVar8, x0VarF3, lVar3, i712, z15, i74, i75, (o4.j0) objQ, null, o0VarE, (i24 & 126) | ((i64 >> 6) & 7168) | (57344 & i711) | (458752 & i711) | (3670016 & i711) | (i711 & 29360128), 512);
                        rVar2 = rVar8;
                        o0Var = o0VarE;
                        i66 = i712;
                        z17 = z15;
                        f0Var3 = f0Var2;
                        i67 = i75;
                        j18 = j26;
                        lVar2 = lVar3;
                        i68 = i74;
                        j24 = j27;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        rVar2 = rVar;
                        j18 = j8;
                        i66 = i14;
                        i67 = i16;
                        lVar2 = lVar;
                        z17 = z15;
                        j19 = j17;
                        f0Var3 = f0Var2;
                        j24 = j14;
                        j25 = j16;
                        i68 = i15;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        final h4.r rVar9 = rVar2;
                        p2VarI0.f135219d = new e23.p() { // from class: a3.p1
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i17 | 1);
                                int iT2 = p3.p0.t(i18);
                                s1.b(str, rVar9, j18, j24, f0Var3, j19, j25, i66, z17, i68, i67, lVar2, x0Var, (p3.m) obj, iT, iT2, i19);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i64 = i58 | 24576;
                i65 = i19 & 32768;
                if (i65 != 0) {
                    i64 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    i64 |= o0VarE.r(lVar) ? 131072 : 65536;
                }
                if ((i18 & 1572864) == 0) {
                    i64 |= o0VarE.B(x0Var) ? 1048576 : 524288;
                }
                if ((i24 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i24 & 1, z16)) {
                    o0VarE.G0();
                    if ((i17 & 1) != 0) {
                        if (i76 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i25 != 0) {
                            o4.d0.f128823b.getClass();
                            j26 = o4.d0.f128832k;
                        } else {
                            j26 = j8;
                        }
                        if (i27 != 0) {
                            g6.q.f76018b.getClass();
                            j27 = g6.q.f76020d;
                        } else {
                            j27 = j14;
                        }
                        if (i30 != 0) {
                            f0Var2 = null;
                        }
                        if (i36 != 0) {
                            g6.q.f76018b.getClass();
                            j19 = g6.q.f76020d;
                        } else {
                            j19 = j17;
                        }
                        if (i44 != 0) {
                            g6.q.f76018b.getClass();
                            j25 = g6.q.f76020d;
                        } else {
                            j25 = j16;
                        }
                        if (i47 != 0) {
                            d6.p.f57793b.getClass();
                            i69 = d6.p.f57794c;
                        } else {
                            i69 = i14;
                        }
                        if (i54 != 0) {
                            z15 = true;
                        }
                        if (i56 != 0) {
                            i74 = Integer.MAX_VALUE;
                        } else {
                            i74 = i15;
                        }
                        if (i59 == 0) {
                        }
                        if (i65 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                    } else {
                        if (i76 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i25 != 0) {
                            o4.d0.f128823b.getClass();
                            j26 = o4.d0.f128832k;
                        } else {
                            j26 = j8;
                        }
                        if (i27 != 0) {
                            g6.q.f76018b.getClass();
                            j27 = g6.q.f76020d;
                        } else {
                            j27 = j14;
                        }
                        if (i30 != 0) {
                            f0Var2 = null;
                        }
                        if (i36 != 0) {
                            g6.q.f76018b.getClass();
                            j19 = g6.q.f76020d;
                        } else {
                            j19 = j17;
                        }
                        if (i44 != 0) {
                            g6.q.f76018b.getClass();
                            j25 = g6.q.f76020d;
                        } else {
                            j25 = j16;
                        }
                        if (i47 != 0) {
                            d6.p.f57793b.getClass();
                            i69 = d6.p.f57794c;
                        } else {
                            i69 = i14;
                        }
                        if (i54 != 0) {
                            z15 = true;
                        }
                        if (i56 != 0) {
                            i74 = Integer.MAX_VALUE;
                        } else {
                            i74 = i15;
                        }
                        if (i59 == 0) {
                        }
                        if (i65 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var4 = p3.n.f135158a;
                    j28 = ((o4.d0) o0VarE.A(x.f872a)).f128833a;
                    fFloatValue = ((Number) o0VarE.A(w.f867a)).floatValue();
                    if (j26 != 16) {
                        jC = j26;
                    } else if (x0Var.c() != 16) {
                        jC = x0Var.c();
                    } else {
                        jC = o4.d0.c(fFloatValue, j28, 14);
                    }
                    d6.h.f57752b.getClass();
                    s5.x0 x0VarF4 = s5.x0.f(x0Var, 0L, j27, f0Var2, j19, 0, j25, 16609105);
                    zL = o0VarE.l(jC);
                    h4.r rVar10 = rVar3;
                    objQ = o0VarE.q();
                    if (zL) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new r1(jC);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new r1(jC);
                        o0VarE.K(objQ);
                    }
                    int i713 = i64 << 9;
                    int i714 = i69;
                    p006l2.y.b(str, rVar10, x0VarF4, lVar3, i714, z15, i74, i75, (o4.j0) objQ, null, o0VarE, (i24 & 126) | ((i64 >> 6) & 7168) | (57344 & i713) | (458752 & i713) | (3670016 & i713) | (i713 & 29360128), 512);
                    rVar2 = rVar10;
                    o0Var = o0VarE;
                    i66 = i714;
                    z17 = z15;
                    f0Var3 = f0Var2;
                    i67 = i75;
                    j18 = j26;
                    lVar2 = lVar3;
                    i68 = i74;
                    j24 = j27;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    j18 = j8;
                    i66 = i14;
                    i67 = i16;
                    lVar2 = lVar;
                    z17 = z15;
                    j19 = j17;
                    f0Var3 = f0Var2;
                    j24 = j14;
                    j25 = j16;
                    i68 = i15;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    final h4.r rVar11 = rVar2;
                    p2VarI0.f135219d = new e23.p() { // from class: a3.p1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i17 | 1);
                            int iT2 = p3.p0.t(i18);
                            s1.b(str, rVar11, j18, j24, f0Var3, j19, j25, i66, z17, i68, i67, lVar2, x0Var, (p3.m) obj, iT, iT2, i19);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i24 |= C.ENCODING_PCM_32BIT;
            i44 = i19 & 1024;
            if (i44 != 0) {
                i45 = i18 | 6;
            } else if ((i18 & 6) == 0) {
                if (o0VarE.l(j16)) {
                    i46 = 4;
                } else {
                    i46 = 2;
                }
                i45 = i18 | i46;
            } else {
                i45 = i18;
            }
            i47 = i19 & 2048;
            if (i47 != 0) {
                i45 |= 48;
            } else if ((i18 & 48) == 0) {
                if (o0VarE.k(i14)) {
                    i48 = 32;
                } else {
                    i48 = 16;
                }
                i45 |= i48;
            }
            i49 = i45;
            i54 = i19 & 4096;
            if (i54 != 0) {
                if ((i18 & 384) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i55 = 256;
                    } else {
                        i55 = 128;
                    }
                    i49 |= i55;
                }
                i56 = i19 & 8192;
                if (i56 != 0) {
                    i58 = i49 | 3072;
                } else {
                    i57 = i49;
                    if ((i18 & 3072) == 0) {
                        i58 = i57 | (o0VarE.k(i15) ? 2048 : 1024);
                    } else {
                        i58 = i57;
                    }
                }
                i59 = i19 & 16384;
                if (i59 != 0) {
                    i64 = i58;
                    if ((i18 & 24576) == 0) {
                        i64 |= o0VarE.k(i16) ? 16384 : 8192;
                    }
                    i65 = i19 & 32768;
                    if (i65 != 0) {
                        i64 |= 196608;
                    } else if ((i18 & 196608) == 0) {
                        i64 |= o0VarE.r(lVar) ? 131072 : 65536;
                    }
                    if ((i18 & 1572864) == 0) {
                        i64 |= o0VarE.B(x0Var) ? 1048576 : 524288;
                    }
                    if ((i24 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i24 & 1, z16)) {
                        o0VarE.G0();
                        if ((i17 & 1) != 0) {
                            if (i76 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i25 != 0) {
                                o4.d0.f128823b.getClass();
                                j26 = o4.d0.f128832k;
                            } else {
                                j26 = j8;
                            }
                            if (i27 != 0) {
                                g6.q.f76018b.getClass();
                                j27 = g6.q.f76020d;
                            } else {
                                j27 = j14;
                            }
                            if (i30 != 0) {
                                f0Var2 = null;
                            }
                            if (i36 != 0) {
                                g6.q.f76018b.getClass();
                                j19 = g6.q.f76020d;
                            } else {
                                j19 = j17;
                            }
                            if (i44 != 0) {
                                g6.q.f76018b.getClass();
                                j25 = g6.q.f76020d;
                            } else {
                                j25 = j16;
                            }
                            if (i47 != 0) {
                                d6.p.f57793b.getClass();
                                i69 = d6.p.f57794c;
                            } else {
                                i69 = i14;
                            }
                            if (i54 != 0) {
                                z15 = true;
                            }
                            if (i56 != 0) {
                                i74 = Integer.MAX_VALUE;
                            } else {
                                i74 = i15;
                            }
                            if (i59 == 0) {
                            }
                            if (i65 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                        } else {
                            if (i76 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i25 != 0) {
                                o4.d0.f128823b.getClass();
                                j26 = o4.d0.f128832k;
                            } else {
                                j26 = j8;
                            }
                            if (i27 != 0) {
                                g6.q.f76018b.getClass();
                                j27 = g6.q.f76020d;
                            } else {
                                j27 = j14;
                            }
                            if (i30 != 0) {
                                f0Var2 = null;
                            }
                            if (i36 != 0) {
                                g6.q.f76018b.getClass();
                                j19 = g6.q.f76020d;
                            } else {
                                j19 = j17;
                            }
                            if (i44 != 0) {
                                g6.q.f76018b.getClass();
                                j25 = g6.q.f76020d;
                            } else {
                                j25 = j16;
                            }
                            if (i47 != 0) {
                                d6.p.f57793b.getClass();
                                i69 = d6.p.f57794c;
                            } else {
                                i69 = i14;
                            }
                            if (i54 != 0) {
                                z15 = true;
                            }
                            if (i56 != 0) {
                                i74 = Integer.MAX_VALUE;
                            } else {
                                i74 = i15;
                            }
                            if (i59 == 0) {
                            }
                            if (i65 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                        }
                        o0VarE.h0();
                        x1 x1Var5 = p3.n.f135158a;
                        j28 = ((o4.d0) o0VarE.A(x.f872a)).f128833a;
                        fFloatValue = ((Number) o0VarE.A(w.f867a)).floatValue();
                        if (j26 != 16) {
                            jC = j26;
                        } else if (x0Var.c() != 16) {
                            jC = x0Var.c();
                        } else {
                            jC = o4.d0.c(fFloatValue, j28, 14);
                        }
                        d6.h.f57752b.getClass();
                        s5.x0 x0VarF5 = s5.x0.f(x0Var, 0L, j27, f0Var2, j19, 0, j25, 16609105);
                        zL = o0VarE.l(jC);
                        h4.r rVar12 = rVar3;
                        objQ = o0VarE.q();
                        if (zL) {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new r1(jC);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new r1(jC);
                            o0VarE.K(objQ);
                        }
                        int i715 = i64 << 9;
                        int i716 = i69;
                        p006l2.y.b(str, rVar12, x0VarF5, lVar3, i716, z15, i74, i75, (o4.j0) objQ, null, o0VarE, (i24 & 126) | ((i64 >> 6) & 7168) | (57344 & i715) | (458752 & i715) | (3670016 & i715) | (i715 & 29360128), 512);
                        rVar2 = rVar12;
                        o0Var = o0VarE;
                        i66 = i716;
                        z17 = z15;
                        f0Var3 = f0Var2;
                        i67 = i75;
                        j18 = j26;
                        lVar2 = lVar3;
                        i68 = i74;
                        j24 = j27;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        rVar2 = rVar;
                        j18 = j8;
                        i66 = i14;
                        i67 = i16;
                        lVar2 = lVar;
                        z17 = z15;
                        j19 = j17;
                        f0Var3 = f0Var2;
                        j24 = j14;
                        j25 = j16;
                        i68 = i15;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        final h4.r rVar13 = rVar2;
                        p2VarI0.f135219d = new e23.p() { // from class: a3.p1
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i17 | 1);
                                int iT2 = p3.p0.t(i18);
                                s1.b(str, rVar13, j18, j24, f0Var3, j19, j25, i66, z17, i68, i67, lVar2, x0Var, (p3.m) obj, iT, iT2, i19);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i64 = i58 | 24576;
                i65 = i19 & 32768;
                if (i65 != 0) {
                    i64 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    i64 |= o0VarE.r(lVar) ? 131072 : 65536;
                }
                if ((i18 & 1572864) == 0) {
                    i64 |= o0VarE.B(x0Var) ? 1048576 : 524288;
                }
                if ((i24 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i24 & 1, z16)) {
                    o0VarE.G0();
                    if ((i17 & 1) != 0) {
                        if (i76 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i25 != 0) {
                            o4.d0.f128823b.getClass();
                            j26 = o4.d0.f128832k;
                        } else {
                            j26 = j8;
                        }
                        if (i27 != 0) {
                            g6.q.f76018b.getClass();
                            j27 = g6.q.f76020d;
                        } else {
                            j27 = j14;
                        }
                        if (i30 != 0) {
                            f0Var2 = null;
                        }
                        if (i36 != 0) {
                            g6.q.f76018b.getClass();
                            j19 = g6.q.f76020d;
                        } else {
                            j19 = j17;
                        }
                        if (i44 != 0) {
                            g6.q.f76018b.getClass();
                            j25 = g6.q.f76020d;
                        } else {
                            j25 = j16;
                        }
                        if (i47 != 0) {
                            d6.p.f57793b.getClass();
                            i69 = d6.p.f57794c;
                        } else {
                            i69 = i14;
                        }
                        if (i54 != 0) {
                            z15 = true;
                        }
                        if (i56 != 0) {
                            i74 = Integer.MAX_VALUE;
                        } else {
                            i74 = i15;
                        }
                        if (i59 == 0) {
                        }
                        if (i65 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                    } else {
                        if (i76 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i25 != 0) {
                            o4.d0.f128823b.getClass();
                            j26 = o4.d0.f128832k;
                        } else {
                            j26 = j8;
                        }
                        if (i27 != 0) {
                            g6.q.f76018b.getClass();
                            j27 = g6.q.f76020d;
                        } else {
                            j27 = j14;
                        }
                        if (i30 != 0) {
                            f0Var2 = null;
                        }
                        if (i36 != 0) {
                            g6.q.f76018b.getClass();
                            j19 = g6.q.f76020d;
                        } else {
                            j19 = j17;
                        }
                        if (i44 != 0) {
                            g6.q.f76018b.getClass();
                            j25 = g6.q.f76020d;
                        } else {
                            j25 = j16;
                        }
                        if (i47 != 0) {
                            d6.p.f57793b.getClass();
                            i69 = d6.p.f57794c;
                        } else {
                            i69 = i14;
                        }
                        if (i54 != 0) {
                            z15 = true;
                        }
                        if (i56 != 0) {
                            i74 = Integer.MAX_VALUE;
                        } else {
                            i74 = i15;
                        }
                        if (i59 == 0) {
                        }
                        if (i65 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var6 = p3.n.f135158a;
                    j28 = ((o4.d0) o0VarE.A(x.f872a)).f128833a;
                    fFloatValue = ((Number) o0VarE.A(w.f867a)).floatValue();
                    if (j26 != 16) {
                        jC = j26;
                    } else if (x0Var.c() != 16) {
                        jC = x0Var.c();
                    } else {
                        jC = o4.d0.c(fFloatValue, j28, 14);
                    }
                    d6.h.f57752b.getClass();
                    s5.x0 x0VarF6 = s5.x0.f(x0Var, 0L, j27, f0Var2, j19, 0, j25, 16609105);
                    zL = o0VarE.l(jC);
                    h4.r rVar14 = rVar3;
                    objQ = o0VarE.q();
                    if (zL) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new r1(jC);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new r1(jC);
                        o0VarE.K(objQ);
                    }
                    int i717 = i64 << 9;
                    int i718 = i69;
                    p006l2.y.b(str, rVar14, x0VarF6, lVar3, i718, z15, i74, i75, (o4.j0) objQ, null, o0VarE, (i24 & 126) | ((i64 >> 6) & 7168) | (57344 & i717) | (458752 & i717) | (3670016 & i717) | (i717 & 29360128), 512);
                    rVar2 = rVar14;
                    o0Var = o0VarE;
                    i66 = i718;
                    z17 = z15;
                    f0Var3 = f0Var2;
                    i67 = i75;
                    j18 = j26;
                    lVar2 = lVar3;
                    i68 = i74;
                    j24 = j27;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    j18 = j8;
                    i66 = i14;
                    i67 = i16;
                    lVar2 = lVar;
                    z17 = z15;
                    j19 = j17;
                    f0Var3 = f0Var2;
                    j24 = j14;
                    j25 = j16;
                    i68 = i15;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    final h4.r rVar15 = rVar2;
                    p2VarI0.f135219d = new e23.p() { // from class: a3.p1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i17 | 1);
                            int iT2 = p3.p0.t(i18);
                            s1.b(str, rVar15, j18, j24, f0Var3, j19, j25, i66, z17, i68, i67, lVar2, x0Var, (p3.m) obj, iT, iT2, i19);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i49 |= 384;
            z15 = z14;
            i56 = i19 & 8192;
            if (i56 != 0) {
                i58 = i49 | 3072;
            } else {
                i57 = i49;
                if ((i18 & 3072) == 0) {
                    i58 = i57 | (o0VarE.k(i15) ? 2048 : 1024);
                } else {
                    i58 = i57;
                }
            }
            i59 = i19 & 16384;
            if (i59 != 0) {
                i64 = i58;
                if ((i18 & 24576) == 0) {
                    i64 |= o0VarE.k(i16) ? 16384 : 8192;
                }
                i65 = i19 & 32768;
                if (i65 != 0) {
                    i64 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    i64 |= o0VarE.r(lVar) ? 131072 : 65536;
                }
                if ((i18 & 1572864) == 0) {
                    i64 |= o0VarE.B(x0Var) ? 1048576 : 524288;
                }
                if ((i24 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i24 & 1, z16)) {
                    o0VarE.G0();
                    if ((i17 & 1) != 0) {
                        if (i76 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i25 != 0) {
                            o4.d0.f128823b.getClass();
                            j26 = o4.d0.f128832k;
                        } else {
                            j26 = j8;
                        }
                        if (i27 != 0) {
                            g6.q.f76018b.getClass();
                            j27 = g6.q.f76020d;
                        } else {
                            j27 = j14;
                        }
                        if (i30 != 0) {
                            f0Var2 = null;
                        }
                        if (i36 != 0) {
                            g6.q.f76018b.getClass();
                            j19 = g6.q.f76020d;
                        } else {
                            j19 = j17;
                        }
                        if (i44 != 0) {
                            g6.q.f76018b.getClass();
                            j25 = g6.q.f76020d;
                        } else {
                            j25 = j16;
                        }
                        if (i47 != 0) {
                            d6.p.f57793b.getClass();
                            i69 = d6.p.f57794c;
                        } else {
                            i69 = i14;
                        }
                        if (i54 != 0) {
                            z15 = true;
                        }
                        if (i56 != 0) {
                            i74 = Integer.MAX_VALUE;
                        } else {
                            i74 = i15;
                        }
                        if (i59 == 0) {
                        }
                        if (i65 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                    } else {
                        if (i76 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i25 != 0) {
                            o4.d0.f128823b.getClass();
                            j26 = o4.d0.f128832k;
                        } else {
                            j26 = j8;
                        }
                        if (i27 != 0) {
                            g6.q.f76018b.getClass();
                            j27 = g6.q.f76020d;
                        } else {
                            j27 = j14;
                        }
                        if (i30 != 0) {
                            f0Var2 = null;
                        }
                        if (i36 != 0) {
                            g6.q.f76018b.getClass();
                            j19 = g6.q.f76020d;
                        } else {
                            j19 = j17;
                        }
                        if (i44 != 0) {
                            g6.q.f76018b.getClass();
                            j25 = g6.q.f76020d;
                        } else {
                            j25 = j16;
                        }
                        if (i47 != 0) {
                            d6.p.f57793b.getClass();
                            i69 = d6.p.f57794c;
                        } else {
                            i69 = i14;
                        }
                        if (i54 != 0) {
                            z15 = true;
                        }
                        if (i56 != 0) {
                            i74 = Integer.MAX_VALUE;
                        } else {
                            i74 = i15;
                        }
                        if (i59 == 0) {
                        }
                        if (i65 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var7 = p3.n.f135158a;
                    j28 = ((o4.d0) o0VarE.A(x.f872a)).f128833a;
                    fFloatValue = ((Number) o0VarE.A(w.f867a)).floatValue();
                    if (j26 != 16) {
                        jC = j26;
                    } else if (x0Var.c() != 16) {
                        jC = x0Var.c();
                    } else {
                        jC = o4.d0.c(fFloatValue, j28, 14);
                    }
                    d6.h.f57752b.getClass();
                    s5.x0 x0VarF7 = s5.x0.f(x0Var, 0L, j27, f0Var2, j19, 0, j25, 16609105);
                    zL = o0VarE.l(jC);
                    h4.r rVar16 = rVar3;
                    objQ = o0VarE.q();
                    if (zL) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new r1(jC);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new r1(jC);
                        o0VarE.K(objQ);
                    }
                    int i719 = i64 << 9;
                    int i7110 = i69;
                    p006l2.y.b(str, rVar16, x0VarF7, lVar3, i7110, z15, i74, i75, (o4.j0) objQ, null, o0VarE, (i24 & 126) | ((i64 >> 6) & 7168) | (57344 & i719) | (458752 & i719) | (3670016 & i719) | (i719 & 29360128), 512);
                    rVar2 = rVar16;
                    o0Var = o0VarE;
                    i66 = i7110;
                    z17 = z15;
                    f0Var3 = f0Var2;
                    i67 = i75;
                    j18 = j26;
                    lVar2 = lVar3;
                    i68 = i74;
                    j24 = j27;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    j18 = j8;
                    i66 = i14;
                    i67 = i16;
                    lVar2 = lVar;
                    z17 = z15;
                    j19 = j17;
                    f0Var3 = f0Var2;
                    j24 = j14;
                    j25 = j16;
                    i68 = i15;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    final h4.r rVar17 = rVar2;
                    p2VarI0.f135219d = new e23.p() { // from class: a3.p1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i17 | 1);
                            int iT2 = p3.p0.t(i18);
                            s1.b(str, rVar17, j18, j24, f0Var3, j19, j25, i66, z17, i68, i67, lVar2, x0Var, (p3.m) obj, iT, iT2, i19);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i64 = i58 | 24576;
            i65 = i19 & 32768;
            if (i65 != 0) {
                i64 |= 196608;
            } else if ((i18 & 196608) == 0) {
                i64 |= o0VarE.r(lVar) ? 131072 : 65536;
            }
            if ((i18 & 1572864) == 0) {
                i64 |= o0VarE.B(x0Var) ? 1048576 : 524288;
            }
            if ((i24 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i24 & 1, z16)) {
                o0VarE.G0();
                if ((i17 & 1) != 0) {
                    if (i76 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i25 != 0) {
                        o4.d0.f128823b.getClass();
                        j26 = o4.d0.f128832k;
                    } else {
                        j26 = j8;
                    }
                    if (i27 != 0) {
                        g6.q.f76018b.getClass();
                        j27 = g6.q.f76020d;
                    } else {
                        j27 = j14;
                    }
                    if (i30 != 0) {
                        f0Var2 = null;
                    }
                    if (i36 != 0) {
                        g6.q.f76018b.getClass();
                        j19 = g6.q.f76020d;
                    } else {
                        j19 = j17;
                    }
                    if (i44 != 0) {
                        g6.q.f76018b.getClass();
                        j25 = g6.q.f76020d;
                    } else {
                        j25 = j16;
                    }
                    if (i47 != 0) {
                        d6.p.f57793b.getClass();
                        i69 = d6.p.f57794c;
                    } else {
                        i69 = i14;
                    }
                    if (i54 != 0) {
                        z15 = true;
                    }
                    if (i56 != 0) {
                        i74 = Integer.MAX_VALUE;
                    } else {
                        i74 = i15;
                    }
                    if (i59 == 0) {
                    }
                    if (i65 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                } else {
                    if (i76 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i25 != 0) {
                        o4.d0.f128823b.getClass();
                        j26 = o4.d0.f128832k;
                    } else {
                        j26 = j8;
                    }
                    if (i27 != 0) {
                        g6.q.f76018b.getClass();
                        j27 = g6.q.f76020d;
                    } else {
                        j27 = j14;
                    }
                    if (i30 != 0) {
                        f0Var2 = null;
                    }
                    if (i36 != 0) {
                        g6.q.f76018b.getClass();
                        j19 = g6.q.f76020d;
                    } else {
                        j19 = j17;
                    }
                    if (i44 != 0) {
                        g6.q.f76018b.getClass();
                        j25 = g6.q.f76020d;
                    } else {
                        j25 = j16;
                    }
                    if (i47 != 0) {
                        d6.p.f57793b.getClass();
                        i69 = d6.p.f57794c;
                    } else {
                        i69 = i14;
                    }
                    if (i54 != 0) {
                        z15 = true;
                    }
                    if (i56 != 0) {
                        i74 = Integer.MAX_VALUE;
                    } else {
                        i74 = i15;
                    }
                    if (i59 == 0) {
                    }
                    if (i65 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                }
                o0VarE.h0();
                x1 x1Var8 = p3.n.f135158a;
                j28 = ((o4.d0) o0VarE.A(x.f872a)).f128833a;
                fFloatValue = ((Number) o0VarE.A(w.f867a)).floatValue();
                if (j26 != 16) {
                    jC = j26;
                } else if (x0Var.c() != 16) {
                    jC = x0Var.c();
                } else {
                    jC = o4.d0.c(fFloatValue, j28, 14);
                }
                d6.h.f57752b.getClass();
                s5.x0 x0VarF8 = s5.x0.f(x0Var, 0L, j27, f0Var2, j19, 0, j25, 16609105);
                zL = o0VarE.l(jC);
                h4.r rVar18 = rVar3;
                objQ = o0VarE.q();
                if (zL) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new r1(jC);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new r1(jC);
                    o0VarE.K(objQ);
                }
                int i7111 = i64 << 9;
                int i7112 = i69;
                p006l2.y.b(str, rVar18, x0VarF8, lVar3, i7112, z15, i74, i75, (o4.j0) objQ, null, o0VarE, (i24 & 126) | ((i64 >> 6) & 7168) | (57344 & i7111) | (458752 & i7111) | (3670016 & i7111) | (i7111 & 29360128), 512);
                rVar2 = rVar18;
                o0Var = o0VarE;
                i66 = i7112;
                z17 = z15;
                f0Var3 = f0Var2;
                i67 = i75;
                j18 = j26;
                lVar2 = lVar3;
                i68 = i74;
                j24 = j27;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                j18 = j8;
                i66 = i14;
                i67 = i16;
                lVar2 = lVar;
                z17 = z15;
                j19 = j17;
                f0Var3 = f0Var2;
                j24 = j14;
                j25 = j16;
                i68 = i15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                final h4.r rVar19 = rVar2;
                p2VarI0.f135219d = new e23.p() { // from class: a3.p1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i17 | 1);
                        int iT2 = p3.p0.t(i18);
                        s1.b(str, rVar19, j18, j24, f0Var3, j19, j25, i66, z17, i68, i67, lVar2, x0Var, (p3.m) obj, iT, iT2, i19);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i24 |= 48;
        i25 = i19 & 4;
        if (i25 != 0) {
            i24 |= 384;
        } else if ((i17 & 384) == 0) {
            if (o0VarE.l(j8)) {
                i26 = 256;
            } else {
                i26 = 128;
            }
            i24 |= i26;
        }
        i27 = i19 & 8;
        if (i27 != 0) {
            i24 |= 3072;
        } else if ((i17 & 3072) == 0) {
            if (o0VarE.l(j14)) {
                i28 = 2048;
            } else {
                i28 = 1024;
            }
            i24 |= i28;
        }
        if ((i19 & 16) != 0) {
            i24 |= 24576;
        } else if ((i17 & 24576) == 0) {
            if (o0VarE.B(null)) {
                i29 = 16384;
            } else {
                i29 = 8192;
            }
            i24 |= i29;
        }
        i30 = i19 & 32;
        if (i30 != 0) {
            i24 |= 196608;
            f0Var2 = f0Var;
        } else {
            f0Var2 = f0Var;
            if ((i17 & 196608) == 0) {
                if (o0VarE.B(f0Var2)) {
                    i34 = 131072;
                } else {
                    i34 = 65536;
                }
                i24 |= i34;
            }
        }
        if ((i19 & 64) != 0) {
            i24 |= 1572864;
        } else if ((i17 & 1572864) == 0) {
            if (o0VarE.B(null)) {
                i35 = 1048576;
            } else {
                i35 = 524288;
            }
            i24 |= i35;
        }
        i36 = i19 & 128;
        if (i36 != 0) {
            i24 |= 12582912;
            j17 = j15;
        } else {
            j17 = j15;
            if ((i17 & 12582912) == 0) {
                if (o0VarE.l(j17)) {
                    i37 = 8388608;
                } else {
                    i37 = 4194304;
                }
                i24 |= i37;
            }
        }
        if ((i19 & 256) != 0) {
            i24 |= 100663296;
        } else if ((i17 & 100663296) == 0) {
            if (o0VarE.B(null)) {
                i38 = 67108864;
            } else {
                i38 = 33554432;
            }
            i24 |= i38;
        }
        if ((i19 & 512) != 0) {
            if ((i17 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.B(null)) {
                    i39 = 536870912;
                } else {
                    i39 = 268435456;
                }
                i24 |= i39;
            }
            i44 = i19 & 1024;
            if (i44 != 0) {
                i45 = i18 | 6;
            } else if ((i18 & 6) == 0) {
                if (o0VarE.l(j16)) {
                    i46 = 4;
                } else {
                    i46 = 2;
                }
                i45 = i18 | i46;
            } else {
                i45 = i18;
            }
            i47 = i19 & 2048;
            if (i47 != 0) {
                i45 |= 48;
            } else if ((i18 & 48) == 0) {
                if (o0VarE.k(i14)) {
                    i48 = 32;
                } else {
                    i48 = 16;
                }
                i45 |= i48;
            }
            i49 = i45;
            i54 = i19 & 4096;
            if (i54 != 0) {
                if ((i18 & 384) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i55 = 256;
                    } else {
                        i55 = 128;
                    }
                    i49 |= i55;
                }
                i56 = i19 & 8192;
                if (i56 != 0) {
                    i58 = i49 | 3072;
                } else {
                    i57 = i49;
                    if ((i18 & 3072) == 0) {
                        i58 = i57 | (o0VarE.k(i15) ? 2048 : 1024);
                    } else {
                        i58 = i57;
                    }
                }
                i59 = i19 & 16384;
                if (i59 != 0) {
                    i64 = i58;
                    if ((i18 & 24576) == 0) {
                        i64 |= o0VarE.k(i16) ? 16384 : 8192;
                    }
                    i65 = i19 & 32768;
                    if (i65 != 0) {
                        i64 |= 196608;
                    } else if ((i18 & 196608) == 0) {
                        i64 |= o0VarE.r(lVar) ? 131072 : 65536;
                    }
                    if ((i18 & 1572864) == 0) {
                        i64 |= o0VarE.B(x0Var) ? 1048576 : 524288;
                    }
                    if ((i24 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i24 & 1, z16)) {
                        o0VarE.G0();
                        if ((i17 & 1) != 0) {
                            if (i76 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i25 != 0) {
                                o4.d0.f128823b.getClass();
                                j26 = o4.d0.f128832k;
                            } else {
                                j26 = j8;
                            }
                            if (i27 != 0) {
                                g6.q.f76018b.getClass();
                                j27 = g6.q.f76020d;
                            } else {
                                j27 = j14;
                            }
                            if (i30 != 0) {
                                f0Var2 = null;
                            }
                            if (i36 != 0) {
                                g6.q.f76018b.getClass();
                                j19 = g6.q.f76020d;
                            } else {
                                j19 = j17;
                            }
                            if (i44 != 0) {
                                g6.q.f76018b.getClass();
                                j25 = g6.q.f76020d;
                            } else {
                                j25 = j16;
                            }
                            if (i47 != 0) {
                                d6.p.f57793b.getClass();
                                i69 = d6.p.f57794c;
                            } else {
                                i69 = i14;
                            }
                            if (i54 != 0) {
                                z15 = true;
                            }
                            if (i56 != 0) {
                                i74 = Integer.MAX_VALUE;
                            } else {
                                i74 = i15;
                            }
                            if (i59 == 0) {
                            }
                            if (i65 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                        } else {
                            if (i76 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar;
                            }
                            if (i25 != 0) {
                                o4.d0.f128823b.getClass();
                                j26 = o4.d0.f128832k;
                            } else {
                                j26 = j8;
                            }
                            if (i27 != 0) {
                                g6.q.f76018b.getClass();
                                j27 = g6.q.f76020d;
                            } else {
                                j27 = j14;
                            }
                            if (i30 != 0) {
                                f0Var2 = null;
                            }
                            if (i36 != 0) {
                                g6.q.f76018b.getClass();
                                j19 = g6.q.f76020d;
                            } else {
                                j19 = j17;
                            }
                            if (i44 != 0) {
                                g6.q.f76018b.getClass();
                                j25 = g6.q.f76020d;
                            } else {
                                j25 = j16;
                            }
                            if (i47 != 0) {
                                d6.p.f57793b.getClass();
                                i69 = d6.p.f57794c;
                            } else {
                                i69 = i14;
                            }
                            if (i54 != 0) {
                                z15 = true;
                            }
                            if (i56 != 0) {
                                i74 = Integer.MAX_VALUE;
                            } else {
                                i74 = i15;
                            }
                            if (i59 == 0) {
                            }
                            if (i65 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                        }
                        o0VarE.h0();
                        x1 x1Var9 = p3.n.f135158a;
                        j28 = ((o4.d0) o0VarE.A(x.f872a)).f128833a;
                        fFloatValue = ((Number) o0VarE.A(w.f867a)).floatValue();
                        if (j26 != 16) {
                            jC = j26;
                        } else if (x0Var.c() != 16) {
                            jC = x0Var.c();
                        } else {
                            jC = o4.d0.c(fFloatValue, j28, 14);
                        }
                        d6.h.f57752b.getClass();
                        s5.x0 x0VarF9 = s5.x0.f(x0Var, 0L, j27, f0Var2, j19, 0, j25, 16609105);
                        zL = o0VarE.l(jC);
                        h4.r rVar110 = rVar3;
                        objQ = o0VarE.q();
                        if (zL) {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new r1(jC);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new r1(jC);
                            o0VarE.K(objQ);
                        }
                        int i7113 = i64 << 9;
                        int i7114 = i69;
                        p006l2.y.b(str, rVar110, x0VarF9, lVar3, i7114, z15, i74, i75, (o4.j0) objQ, null, o0VarE, (i24 & 126) | ((i64 >> 6) & 7168) | (57344 & i7113) | (458752 & i7113) | (3670016 & i7113) | (i7113 & 29360128), 512);
                        rVar2 = rVar110;
                        o0Var = o0VarE;
                        i66 = i7114;
                        z17 = z15;
                        f0Var3 = f0Var2;
                        i67 = i75;
                        j18 = j26;
                        lVar2 = lVar3;
                        i68 = i74;
                        j24 = j27;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        rVar2 = rVar;
                        j18 = j8;
                        i66 = i14;
                        i67 = i16;
                        lVar2 = lVar;
                        z17 = z15;
                        j19 = j17;
                        f0Var3 = f0Var2;
                        j24 = j14;
                        j25 = j16;
                        i68 = i15;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        final h4.r rVar111 = rVar2;
                        p2VarI0.f135219d = new e23.p() { // from class: a3.p1
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p3.p0.t(i17 | 1);
                                int iT2 = p3.p0.t(i18);
                                s1.b(str, rVar111, j18, j24, f0Var3, j19, j25, i66, z17, i68, i67, lVar2, x0Var, (p3.m) obj, iT, iT2, i19);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i64 = i58 | 24576;
                i65 = i19 & 32768;
                if (i65 != 0) {
                    i64 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    i64 |= o0VarE.r(lVar) ? 131072 : 65536;
                }
                if ((i18 & 1572864) == 0) {
                    i64 |= o0VarE.B(x0Var) ? 1048576 : 524288;
                }
                if ((i24 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i24 & 1, z16)) {
                    o0VarE.G0();
                    if ((i17 & 1) != 0) {
                        if (i76 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i25 != 0) {
                            o4.d0.f128823b.getClass();
                            j26 = o4.d0.f128832k;
                        } else {
                            j26 = j8;
                        }
                        if (i27 != 0) {
                            g6.q.f76018b.getClass();
                            j27 = g6.q.f76020d;
                        } else {
                            j27 = j14;
                        }
                        if (i30 != 0) {
                            f0Var2 = null;
                        }
                        if (i36 != 0) {
                            g6.q.f76018b.getClass();
                            j19 = g6.q.f76020d;
                        } else {
                            j19 = j17;
                        }
                        if (i44 != 0) {
                            g6.q.f76018b.getClass();
                            j25 = g6.q.f76020d;
                        } else {
                            j25 = j16;
                        }
                        if (i47 != 0) {
                            d6.p.f57793b.getClass();
                            i69 = d6.p.f57794c;
                        } else {
                            i69 = i14;
                        }
                        if (i54 != 0) {
                            z15 = true;
                        }
                        if (i56 != 0) {
                            i74 = Integer.MAX_VALUE;
                        } else {
                            i74 = i15;
                        }
                        if (i59 == 0) {
                        }
                        if (i65 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                    } else {
                        if (i76 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i25 != 0) {
                            o4.d0.f128823b.getClass();
                            j26 = o4.d0.f128832k;
                        } else {
                            j26 = j8;
                        }
                        if (i27 != 0) {
                            g6.q.f76018b.getClass();
                            j27 = g6.q.f76020d;
                        } else {
                            j27 = j14;
                        }
                        if (i30 != 0) {
                            f0Var2 = null;
                        }
                        if (i36 != 0) {
                            g6.q.f76018b.getClass();
                            j19 = g6.q.f76020d;
                        } else {
                            j19 = j17;
                        }
                        if (i44 != 0) {
                            g6.q.f76018b.getClass();
                            j25 = g6.q.f76020d;
                        } else {
                            j25 = j16;
                        }
                        if (i47 != 0) {
                            d6.p.f57793b.getClass();
                            i69 = d6.p.f57794c;
                        } else {
                            i69 = i14;
                        }
                        if (i54 != 0) {
                            z15 = true;
                        }
                        if (i56 != 0) {
                            i74 = Integer.MAX_VALUE;
                        } else {
                            i74 = i15;
                        }
                        if (i59 == 0) {
                        }
                        if (i65 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var10 = p3.n.f135158a;
                    j28 = ((o4.d0) o0VarE.A(x.f872a)).f128833a;
                    fFloatValue = ((Number) o0VarE.A(w.f867a)).floatValue();
                    if (j26 != 16) {
                        jC = j26;
                    } else if (x0Var.c() != 16) {
                        jC = x0Var.c();
                    } else {
                        jC = o4.d0.c(fFloatValue, j28, 14);
                    }
                    d6.h.f57752b.getClass();
                    s5.x0 x0VarF10 = s5.x0.f(x0Var, 0L, j27, f0Var2, j19, 0, j25, 16609105);
                    zL = o0VarE.l(jC);
                    h4.r rVar112 = rVar3;
                    objQ = o0VarE.q();
                    if (zL) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new r1(jC);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new r1(jC);
                        o0VarE.K(objQ);
                    }
                    int i7115 = i64 << 9;
                    int i7116 = i69;
                    p006l2.y.b(str, rVar112, x0VarF10, lVar3, i7116, z15, i74, i75, (o4.j0) objQ, null, o0VarE, (i24 & 126) | ((i64 >> 6) & 7168) | (57344 & i7115) | (458752 & i7115) | (3670016 & i7115) | (i7115 & 29360128), 512);
                    rVar2 = rVar112;
                    o0Var = o0VarE;
                    i66 = i7116;
                    z17 = z15;
                    f0Var3 = f0Var2;
                    i67 = i75;
                    j18 = j26;
                    lVar2 = lVar3;
                    i68 = i74;
                    j24 = j27;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    j18 = j8;
                    i66 = i14;
                    i67 = i16;
                    lVar2 = lVar;
                    z17 = z15;
                    j19 = j17;
                    f0Var3 = f0Var2;
                    j24 = j14;
                    j25 = j16;
                    i68 = i15;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    final h4.r rVar113 = rVar2;
                    p2VarI0.f135219d = new e23.p() { // from class: a3.p1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i17 | 1);
                            int iT2 = p3.p0.t(i18);
                            s1.b(str, rVar113, j18, j24, f0Var3, j19, j25, i66, z17, i68, i67, lVar2, x0Var, (p3.m) obj, iT, iT2, i19);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i49 |= 384;
            z15 = z14;
            i56 = i19 & 8192;
            if (i56 != 0) {
                i58 = i49 | 3072;
            } else {
                i57 = i49;
                if ((i18 & 3072) == 0) {
                    i58 = i57 | (o0VarE.k(i15) ? 2048 : 1024);
                } else {
                    i58 = i57;
                }
            }
            i59 = i19 & 16384;
            if (i59 != 0) {
                i64 = i58;
                if ((i18 & 24576) == 0) {
                    i64 |= o0VarE.k(i16) ? 16384 : 8192;
                }
                i65 = i19 & 32768;
                if (i65 != 0) {
                    i64 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    i64 |= o0VarE.r(lVar) ? 131072 : 65536;
                }
                if ((i18 & 1572864) == 0) {
                    i64 |= o0VarE.B(x0Var) ? 1048576 : 524288;
                }
                if ((i24 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i24 & 1, z16)) {
                    o0VarE.G0();
                    if ((i17 & 1) != 0) {
                        if (i76 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i25 != 0) {
                            o4.d0.f128823b.getClass();
                            j26 = o4.d0.f128832k;
                        } else {
                            j26 = j8;
                        }
                        if (i27 != 0) {
                            g6.q.f76018b.getClass();
                            j27 = g6.q.f76020d;
                        } else {
                            j27 = j14;
                        }
                        if (i30 != 0) {
                            f0Var2 = null;
                        }
                        if (i36 != 0) {
                            g6.q.f76018b.getClass();
                            j19 = g6.q.f76020d;
                        } else {
                            j19 = j17;
                        }
                        if (i44 != 0) {
                            g6.q.f76018b.getClass();
                            j25 = g6.q.f76020d;
                        } else {
                            j25 = j16;
                        }
                        if (i47 != 0) {
                            d6.p.f57793b.getClass();
                            i69 = d6.p.f57794c;
                        } else {
                            i69 = i14;
                        }
                        if (i54 != 0) {
                            z15 = true;
                        }
                        if (i56 != 0) {
                            i74 = Integer.MAX_VALUE;
                        } else {
                            i74 = i15;
                        }
                        if (i59 == 0) {
                        }
                        if (i65 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                    } else {
                        if (i76 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i25 != 0) {
                            o4.d0.f128823b.getClass();
                            j26 = o4.d0.f128832k;
                        } else {
                            j26 = j8;
                        }
                        if (i27 != 0) {
                            g6.q.f76018b.getClass();
                            j27 = g6.q.f76020d;
                        } else {
                            j27 = j14;
                        }
                        if (i30 != 0) {
                            f0Var2 = null;
                        }
                        if (i36 != 0) {
                            g6.q.f76018b.getClass();
                            j19 = g6.q.f76020d;
                        } else {
                            j19 = j17;
                        }
                        if (i44 != 0) {
                            g6.q.f76018b.getClass();
                            j25 = g6.q.f76020d;
                        } else {
                            j25 = j16;
                        }
                        if (i47 != 0) {
                            d6.p.f57793b.getClass();
                            i69 = d6.p.f57794c;
                        } else {
                            i69 = i14;
                        }
                        if (i54 != 0) {
                            z15 = true;
                        }
                        if (i56 != 0) {
                            i74 = Integer.MAX_VALUE;
                        } else {
                            i74 = i15;
                        }
                        if (i59 == 0) {
                        }
                        if (i65 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var11 = p3.n.f135158a;
                    j28 = ((o4.d0) o0VarE.A(x.f872a)).f128833a;
                    fFloatValue = ((Number) o0VarE.A(w.f867a)).floatValue();
                    if (j26 != 16) {
                        jC = j26;
                    } else if (x0Var.c() != 16) {
                        jC = x0Var.c();
                    } else {
                        jC = o4.d0.c(fFloatValue, j28, 14);
                    }
                    d6.h.f57752b.getClass();
                    s5.x0 x0VarF11 = s5.x0.f(x0Var, 0L, j27, f0Var2, j19, 0, j25, 16609105);
                    zL = o0VarE.l(jC);
                    h4.r rVar114 = rVar3;
                    objQ = o0VarE.q();
                    if (zL) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new r1(jC);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new r1(jC);
                        o0VarE.K(objQ);
                    }
                    int i7117 = i64 << 9;
                    int i7118 = i69;
                    p006l2.y.b(str, rVar114, x0VarF11, lVar3, i7118, z15, i74, i75, (o4.j0) objQ, null, o0VarE, (i24 & 126) | ((i64 >> 6) & 7168) | (57344 & i7117) | (458752 & i7117) | (3670016 & i7117) | (i7117 & 29360128), 512);
                    rVar2 = rVar114;
                    o0Var = o0VarE;
                    i66 = i7118;
                    z17 = z15;
                    f0Var3 = f0Var2;
                    i67 = i75;
                    j18 = j26;
                    lVar2 = lVar3;
                    i68 = i74;
                    j24 = j27;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    j18 = j8;
                    i66 = i14;
                    i67 = i16;
                    lVar2 = lVar;
                    z17 = z15;
                    j19 = j17;
                    f0Var3 = f0Var2;
                    j24 = j14;
                    j25 = j16;
                    i68 = i15;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    final h4.r rVar115 = rVar2;
                    p2VarI0.f135219d = new e23.p() { // from class: a3.p1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i17 | 1);
                            int iT2 = p3.p0.t(i18);
                            s1.b(str, rVar115, j18, j24, f0Var3, j19, j25, i66, z17, i68, i67, lVar2, x0Var, (p3.m) obj, iT, iT2, i19);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i64 = i58 | 24576;
            i65 = i19 & 32768;
            if (i65 != 0) {
                i64 |= 196608;
            } else if ((i18 & 196608) == 0) {
                i64 |= o0VarE.r(lVar) ? 131072 : 65536;
            }
            if ((i18 & 1572864) == 0) {
                i64 |= o0VarE.B(x0Var) ? 1048576 : 524288;
            }
            if ((i24 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i24 & 1, z16)) {
                o0VarE.G0();
                if ((i17 & 1) != 0) {
                    if (i76 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i25 != 0) {
                        o4.d0.f128823b.getClass();
                        j26 = o4.d0.f128832k;
                    } else {
                        j26 = j8;
                    }
                    if (i27 != 0) {
                        g6.q.f76018b.getClass();
                        j27 = g6.q.f76020d;
                    } else {
                        j27 = j14;
                    }
                    if (i30 != 0) {
                        f0Var2 = null;
                    }
                    if (i36 != 0) {
                        g6.q.f76018b.getClass();
                        j19 = g6.q.f76020d;
                    } else {
                        j19 = j17;
                    }
                    if (i44 != 0) {
                        g6.q.f76018b.getClass();
                        j25 = g6.q.f76020d;
                    } else {
                        j25 = j16;
                    }
                    if (i47 != 0) {
                        d6.p.f57793b.getClass();
                        i69 = d6.p.f57794c;
                    } else {
                        i69 = i14;
                    }
                    if (i54 != 0) {
                        z15 = true;
                    }
                    if (i56 != 0) {
                        i74 = Integer.MAX_VALUE;
                    } else {
                        i74 = i15;
                    }
                    if (i59 == 0) {
                    }
                    if (i65 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                } else {
                    if (i76 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i25 != 0) {
                        o4.d0.f128823b.getClass();
                        j26 = o4.d0.f128832k;
                    } else {
                        j26 = j8;
                    }
                    if (i27 != 0) {
                        g6.q.f76018b.getClass();
                        j27 = g6.q.f76020d;
                    } else {
                        j27 = j14;
                    }
                    if (i30 != 0) {
                        f0Var2 = null;
                    }
                    if (i36 != 0) {
                        g6.q.f76018b.getClass();
                        j19 = g6.q.f76020d;
                    } else {
                        j19 = j17;
                    }
                    if (i44 != 0) {
                        g6.q.f76018b.getClass();
                        j25 = g6.q.f76020d;
                    } else {
                        j25 = j16;
                    }
                    if (i47 != 0) {
                        d6.p.f57793b.getClass();
                        i69 = d6.p.f57794c;
                    } else {
                        i69 = i14;
                    }
                    if (i54 != 0) {
                        z15 = true;
                    }
                    if (i56 != 0) {
                        i74 = Integer.MAX_VALUE;
                    } else {
                        i74 = i15;
                    }
                    if (i59 == 0) {
                    }
                    if (i65 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                }
                o0VarE.h0();
                x1 x1Var12 = p3.n.f135158a;
                j28 = ((o4.d0) o0VarE.A(x.f872a)).f128833a;
                fFloatValue = ((Number) o0VarE.A(w.f867a)).floatValue();
                if (j26 != 16) {
                    jC = j26;
                } else if (x0Var.c() != 16) {
                    jC = x0Var.c();
                } else {
                    jC = o4.d0.c(fFloatValue, j28, 14);
                }
                d6.h.f57752b.getClass();
                s5.x0 x0VarF12 = s5.x0.f(x0Var, 0L, j27, f0Var2, j19, 0, j25, 16609105);
                zL = o0VarE.l(jC);
                h4.r rVar116 = rVar3;
                objQ = o0VarE.q();
                if (zL) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new r1(jC);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new r1(jC);
                    o0VarE.K(objQ);
                }
                int i7119 = i64 << 9;
                int i71110 = i69;
                p006l2.y.b(str, rVar116, x0VarF12, lVar3, i71110, z15, i74, i75, (o4.j0) objQ, null, o0VarE, (i24 & 126) | ((i64 >> 6) & 7168) | (57344 & i7119) | (458752 & i7119) | (3670016 & i7119) | (i7119 & 29360128), 512);
                rVar2 = rVar116;
                o0Var = o0VarE;
                i66 = i71110;
                z17 = z15;
                f0Var3 = f0Var2;
                i67 = i75;
                j18 = j26;
                lVar2 = lVar3;
                i68 = i74;
                j24 = j27;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                j18 = j8;
                i66 = i14;
                i67 = i16;
                lVar2 = lVar;
                z17 = z15;
                j19 = j17;
                f0Var3 = f0Var2;
                j24 = j14;
                j25 = j16;
                i68 = i15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                final h4.r rVar117 = rVar2;
                p2VarI0.f135219d = new e23.p() { // from class: a3.p1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i17 | 1);
                        int iT2 = p3.p0.t(i18);
                        s1.b(str, rVar117, j18, j24, f0Var3, j19, j25, i66, z17, i68, i67, lVar2, x0Var, (p3.m) obj, iT, iT2, i19);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i24 |= C.ENCODING_PCM_32BIT;
        i44 = i19 & 1024;
        if (i44 != 0) {
            i45 = i18 | 6;
        } else if ((i18 & 6) == 0) {
            if (o0VarE.l(j16)) {
                i46 = 4;
            } else {
                i46 = 2;
            }
            i45 = i18 | i46;
        } else {
            i45 = i18;
        }
        i47 = i19 & 2048;
        if (i47 != 0) {
            i45 |= 48;
        } else if ((i18 & 48) == 0) {
            if (o0VarE.k(i14)) {
                i48 = 32;
            } else {
                i48 = 16;
            }
            i45 |= i48;
        }
        i49 = i45;
        i54 = i19 & 4096;
        if (i54 != 0) {
            if ((i18 & 384) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i55 = 256;
                } else {
                    i55 = 128;
                }
                i49 |= i55;
            }
            i56 = i19 & 8192;
            if (i56 != 0) {
                i58 = i49 | 3072;
            } else {
                i57 = i49;
                if ((i18 & 3072) == 0) {
                    i58 = i57 | (o0VarE.k(i15) ? 2048 : 1024);
                } else {
                    i58 = i57;
                }
            }
            i59 = i19 & 16384;
            if (i59 != 0) {
                i64 = i58;
                if ((i18 & 24576) == 0) {
                    i64 |= o0VarE.k(i16) ? 16384 : 8192;
                }
                i65 = i19 & 32768;
                if (i65 != 0) {
                    i64 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    i64 |= o0VarE.r(lVar) ? 131072 : 65536;
                }
                if ((i18 & 1572864) == 0) {
                    i64 |= o0VarE.B(x0Var) ? 1048576 : 524288;
                }
                if ((i24 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i24 & 1, z16)) {
                    o0VarE.G0();
                    if ((i17 & 1) != 0) {
                        if (i76 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i25 != 0) {
                            o4.d0.f128823b.getClass();
                            j26 = o4.d0.f128832k;
                        } else {
                            j26 = j8;
                        }
                        if (i27 != 0) {
                            g6.q.f76018b.getClass();
                            j27 = g6.q.f76020d;
                        } else {
                            j27 = j14;
                        }
                        if (i30 != 0) {
                            f0Var2 = null;
                        }
                        if (i36 != 0) {
                            g6.q.f76018b.getClass();
                            j19 = g6.q.f76020d;
                        } else {
                            j19 = j17;
                        }
                        if (i44 != 0) {
                            g6.q.f76018b.getClass();
                            j25 = g6.q.f76020d;
                        } else {
                            j25 = j16;
                        }
                        if (i47 != 0) {
                            d6.p.f57793b.getClass();
                            i69 = d6.p.f57794c;
                        } else {
                            i69 = i14;
                        }
                        if (i54 != 0) {
                            z15 = true;
                        }
                        if (i56 != 0) {
                            i74 = Integer.MAX_VALUE;
                        } else {
                            i74 = i15;
                        }
                        if (i59 == 0) {
                        }
                        if (i65 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                    } else {
                        if (i76 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i25 != 0) {
                            o4.d0.f128823b.getClass();
                            j26 = o4.d0.f128832k;
                        } else {
                            j26 = j8;
                        }
                        if (i27 != 0) {
                            g6.q.f76018b.getClass();
                            j27 = g6.q.f76020d;
                        } else {
                            j27 = j14;
                        }
                        if (i30 != 0) {
                            f0Var2 = null;
                        }
                        if (i36 != 0) {
                            g6.q.f76018b.getClass();
                            j19 = g6.q.f76020d;
                        } else {
                            j19 = j17;
                        }
                        if (i44 != 0) {
                            g6.q.f76018b.getClass();
                            j25 = g6.q.f76020d;
                        } else {
                            j25 = j16;
                        }
                        if (i47 != 0) {
                            d6.p.f57793b.getClass();
                            i69 = d6.p.f57794c;
                        } else {
                            i69 = i14;
                        }
                        if (i54 != 0) {
                            z15 = true;
                        }
                        if (i56 != 0) {
                            i74 = Integer.MAX_VALUE;
                        } else {
                            i74 = i15;
                        }
                        if (i59 == 0) {
                        }
                        if (i65 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var13 = p3.n.f135158a;
                    j28 = ((o4.d0) o0VarE.A(x.f872a)).f128833a;
                    fFloatValue = ((Number) o0VarE.A(w.f867a)).floatValue();
                    if (j26 != 16) {
                        jC = j26;
                    } else if (x0Var.c() != 16) {
                        jC = x0Var.c();
                    } else {
                        jC = o4.d0.c(fFloatValue, j28, 14);
                    }
                    d6.h.f57752b.getClass();
                    s5.x0 x0VarF13 = s5.x0.f(x0Var, 0L, j27, f0Var2, j19, 0, j25, 16609105);
                    zL = o0VarE.l(jC);
                    h4.r rVar118 = rVar3;
                    objQ = o0VarE.q();
                    if (zL) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new r1(jC);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new r1(jC);
                        o0VarE.K(objQ);
                    }
                    int i71111 = i64 << 9;
                    int i71112 = i69;
                    p006l2.y.b(str, rVar118, x0VarF13, lVar3, i71112, z15, i74, i75, (o4.j0) objQ, null, o0VarE, (i24 & 126) | ((i64 >> 6) & 7168) | (57344 & i71111) | (458752 & i71111) | (3670016 & i71111) | (i71111 & 29360128), 512);
                    rVar2 = rVar118;
                    o0Var = o0VarE;
                    i66 = i71112;
                    z17 = z15;
                    f0Var3 = f0Var2;
                    i67 = i75;
                    j18 = j26;
                    lVar2 = lVar3;
                    i68 = i74;
                    j24 = j27;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    j18 = j8;
                    i66 = i14;
                    i67 = i16;
                    lVar2 = lVar;
                    z17 = z15;
                    j19 = j17;
                    f0Var3 = f0Var2;
                    j24 = j14;
                    j25 = j16;
                    i68 = i15;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    final h4.r rVar119 = rVar2;
                    p2VarI0.f135219d = new e23.p() { // from class: a3.p1
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i17 | 1);
                            int iT2 = p3.p0.t(i18);
                            s1.b(str, rVar119, j18, j24, f0Var3, j19, j25, i66, z17, i68, i67, lVar2, x0Var, (p3.m) obj, iT, iT2, i19);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i64 = i58 | 24576;
            i65 = i19 & 32768;
            if (i65 != 0) {
                i64 |= 196608;
            } else if ((i18 & 196608) == 0) {
                i64 |= o0VarE.r(lVar) ? 131072 : 65536;
            }
            if ((i18 & 1572864) == 0) {
                i64 |= o0VarE.B(x0Var) ? 1048576 : 524288;
            }
            if ((i24 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i24 & 1, z16)) {
                o0VarE.G0();
                if ((i17 & 1) != 0) {
                    if (i76 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i25 != 0) {
                        o4.d0.f128823b.getClass();
                        j26 = o4.d0.f128832k;
                    } else {
                        j26 = j8;
                    }
                    if (i27 != 0) {
                        g6.q.f76018b.getClass();
                        j27 = g6.q.f76020d;
                    } else {
                        j27 = j14;
                    }
                    if (i30 != 0) {
                        f0Var2 = null;
                    }
                    if (i36 != 0) {
                        g6.q.f76018b.getClass();
                        j19 = g6.q.f76020d;
                    } else {
                        j19 = j17;
                    }
                    if (i44 != 0) {
                        g6.q.f76018b.getClass();
                        j25 = g6.q.f76020d;
                    } else {
                        j25 = j16;
                    }
                    if (i47 != 0) {
                        d6.p.f57793b.getClass();
                        i69 = d6.p.f57794c;
                    } else {
                        i69 = i14;
                    }
                    if (i54 != 0) {
                        z15 = true;
                    }
                    if (i56 != 0) {
                        i74 = Integer.MAX_VALUE;
                    } else {
                        i74 = i15;
                    }
                    if (i59 == 0) {
                    }
                    if (i65 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                } else {
                    if (i76 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i25 != 0) {
                        o4.d0.f128823b.getClass();
                        j26 = o4.d0.f128832k;
                    } else {
                        j26 = j8;
                    }
                    if (i27 != 0) {
                        g6.q.f76018b.getClass();
                        j27 = g6.q.f76020d;
                    } else {
                        j27 = j14;
                    }
                    if (i30 != 0) {
                        f0Var2 = null;
                    }
                    if (i36 != 0) {
                        g6.q.f76018b.getClass();
                        j19 = g6.q.f76020d;
                    } else {
                        j19 = j17;
                    }
                    if (i44 != 0) {
                        g6.q.f76018b.getClass();
                        j25 = g6.q.f76020d;
                    } else {
                        j25 = j16;
                    }
                    if (i47 != 0) {
                        d6.p.f57793b.getClass();
                        i69 = d6.p.f57794c;
                    } else {
                        i69 = i14;
                    }
                    if (i54 != 0) {
                        z15 = true;
                    }
                    if (i56 != 0) {
                        i74 = Integer.MAX_VALUE;
                    } else {
                        i74 = i15;
                    }
                    if (i59 == 0) {
                    }
                    if (i65 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                }
                o0VarE.h0();
                x1 x1Var14 = p3.n.f135158a;
                j28 = ((o4.d0) o0VarE.A(x.f872a)).f128833a;
                fFloatValue = ((Number) o0VarE.A(w.f867a)).floatValue();
                if (j26 != 16) {
                    jC = j26;
                } else if (x0Var.c() != 16) {
                    jC = x0Var.c();
                } else {
                    jC = o4.d0.c(fFloatValue, j28, 14);
                }
                d6.h.f57752b.getClass();
                s5.x0 x0VarF14 = s5.x0.f(x0Var, 0L, j27, f0Var2, j19, 0, j25, 16609105);
                zL = o0VarE.l(jC);
                h4.r rVar1110 = rVar3;
                objQ = o0VarE.q();
                if (zL) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new r1(jC);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new r1(jC);
                    o0VarE.K(objQ);
                }
                int i71113 = i64 << 9;
                int i71114 = i69;
                p006l2.y.b(str, rVar1110, x0VarF14, lVar3, i71114, z15, i74, i75, (o4.j0) objQ, null, o0VarE, (i24 & 126) | ((i64 >> 6) & 7168) | (57344 & i71113) | (458752 & i71113) | (3670016 & i71113) | (i71113 & 29360128), 512);
                rVar2 = rVar1110;
                o0Var = o0VarE;
                i66 = i71114;
                z17 = z15;
                f0Var3 = f0Var2;
                i67 = i75;
                j18 = j26;
                lVar2 = lVar3;
                i68 = i74;
                j24 = j27;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                j18 = j8;
                i66 = i14;
                i67 = i16;
                lVar2 = lVar;
                z17 = z15;
                j19 = j17;
                f0Var3 = f0Var2;
                j24 = j14;
                j25 = j16;
                i68 = i15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                final h4.r rVar1111 = rVar2;
                p2VarI0.f135219d = new e23.p() { // from class: a3.p1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i17 | 1);
                        int iT2 = p3.p0.t(i18);
                        s1.b(str, rVar1111, j18, j24, f0Var3, j19, j25, i66, z17, i68, i67, lVar2, x0Var, (p3.m) obj, iT, iT2, i19);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i49 |= 384;
        z15 = z14;
        i56 = i19 & 8192;
        if (i56 != 0) {
            i58 = i49 | 3072;
        } else {
            i57 = i49;
            if ((i18 & 3072) == 0) {
                i58 = i57 | (o0VarE.k(i15) ? 2048 : 1024);
            } else {
                i58 = i57;
            }
        }
        i59 = i19 & 16384;
        if (i59 != 0) {
            i64 = i58;
            if ((i18 & 24576) == 0) {
                i64 |= o0VarE.k(i16) ? 16384 : 8192;
            }
            i65 = i19 & 32768;
            if (i65 != 0) {
                i64 |= 196608;
            } else if ((i18 & 196608) == 0) {
                i64 |= o0VarE.r(lVar) ? 131072 : 65536;
            }
            if ((i18 & 1572864) == 0) {
                i64 |= o0VarE.B(x0Var) ? 1048576 : 524288;
            }
            if ((i24 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i24 & 1, z16)) {
                o0VarE.G0();
                if ((i17 & 1) != 0) {
                    if (i76 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i25 != 0) {
                        o4.d0.f128823b.getClass();
                        j26 = o4.d0.f128832k;
                    } else {
                        j26 = j8;
                    }
                    if (i27 != 0) {
                        g6.q.f76018b.getClass();
                        j27 = g6.q.f76020d;
                    } else {
                        j27 = j14;
                    }
                    if (i30 != 0) {
                        f0Var2 = null;
                    }
                    if (i36 != 0) {
                        g6.q.f76018b.getClass();
                        j19 = g6.q.f76020d;
                    } else {
                        j19 = j17;
                    }
                    if (i44 != 0) {
                        g6.q.f76018b.getClass();
                        j25 = g6.q.f76020d;
                    } else {
                        j25 = j16;
                    }
                    if (i47 != 0) {
                        d6.p.f57793b.getClass();
                        i69 = d6.p.f57794c;
                    } else {
                        i69 = i14;
                    }
                    if (i54 != 0) {
                        z15 = true;
                    }
                    if (i56 != 0) {
                        i74 = Integer.MAX_VALUE;
                    } else {
                        i74 = i15;
                    }
                    if (i59 == 0) {
                    }
                    if (i65 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                } else {
                    if (i76 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i25 != 0) {
                        o4.d0.f128823b.getClass();
                        j26 = o4.d0.f128832k;
                    } else {
                        j26 = j8;
                    }
                    if (i27 != 0) {
                        g6.q.f76018b.getClass();
                        j27 = g6.q.f76020d;
                    } else {
                        j27 = j14;
                    }
                    if (i30 != 0) {
                        f0Var2 = null;
                    }
                    if (i36 != 0) {
                        g6.q.f76018b.getClass();
                        j19 = g6.q.f76020d;
                    } else {
                        j19 = j17;
                    }
                    if (i44 != 0) {
                        g6.q.f76018b.getClass();
                        j25 = g6.q.f76020d;
                    } else {
                        j25 = j16;
                    }
                    if (i47 != 0) {
                        d6.p.f57793b.getClass();
                        i69 = d6.p.f57794c;
                    } else {
                        i69 = i14;
                    }
                    if (i54 != 0) {
                        z15 = true;
                    }
                    if (i56 != 0) {
                        i74 = Integer.MAX_VALUE;
                    } else {
                        i74 = i15;
                    }
                    if (i59 == 0) {
                    }
                    if (i65 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                }
                o0VarE.h0();
                x1 x1Var15 = p3.n.f135158a;
                j28 = ((o4.d0) o0VarE.A(x.f872a)).f128833a;
                fFloatValue = ((Number) o0VarE.A(w.f867a)).floatValue();
                if (j26 != 16) {
                    jC = j26;
                } else if (x0Var.c() != 16) {
                    jC = x0Var.c();
                } else {
                    jC = o4.d0.c(fFloatValue, j28, 14);
                }
                d6.h.f57752b.getClass();
                s5.x0 x0VarF15 = s5.x0.f(x0Var, 0L, j27, f0Var2, j19, 0, j25, 16609105);
                zL = o0VarE.l(jC);
                h4.r rVar1112 = rVar3;
                objQ = o0VarE.q();
                if (zL) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new r1(jC);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new r1(jC);
                    o0VarE.K(objQ);
                }
                int i71115 = i64 << 9;
                int i71116 = i69;
                p006l2.y.b(str, rVar1112, x0VarF15, lVar3, i71116, z15, i74, i75, (o4.j0) objQ, null, o0VarE, (i24 & 126) | ((i64 >> 6) & 7168) | (57344 & i71115) | (458752 & i71115) | (3670016 & i71115) | (i71115 & 29360128), 512);
                rVar2 = rVar1112;
                o0Var = o0VarE;
                i66 = i71116;
                z17 = z15;
                f0Var3 = f0Var2;
                i67 = i75;
                j18 = j26;
                lVar2 = lVar3;
                i68 = i74;
                j24 = j27;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                j18 = j8;
                i66 = i14;
                i67 = i16;
                lVar2 = lVar;
                z17 = z15;
                j19 = j17;
                f0Var3 = f0Var2;
                j24 = j14;
                j25 = j16;
                i68 = i15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                final h4.r rVar1113 = rVar2;
                p2VarI0.f135219d = new e23.p() { // from class: a3.p1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i17 | 1);
                        int iT2 = p3.p0.t(i18);
                        s1.b(str, rVar1113, j18, j24, f0Var3, j19, j25, i66, z17, i68, i67, lVar2, x0Var, (p3.m) obj, iT, iT2, i19);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i64 = i58 | 24576;
        i65 = i19 & 32768;
        if (i65 != 0) {
            i64 |= 196608;
        } else if ((i18 & 196608) == 0) {
            i64 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if ((i18 & 1572864) == 0) {
            i64 |= o0VarE.B(x0Var) ? 1048576 : 524288;
        }
        if ((i24 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (o0VarE.n(i24 & 1, z16)) {
            o0VarE.G0();
            if ((i17 & 1) != 0) {
                if (i76 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar;
                }
                if (i25 != 0) {
                    o4.d0.f128823b.getClass();
                    j26 = o4.d0.f128832k;
                } else {
                    j26 = j8;
                }
                if (i27 != 0) {
                    g6.q.f76018b.getClass();
                    j27 = g6.q.f76020d;
                } else {
                    j27 = j14;
                }
                if (i30 != 0) {
                    f0Var2 = null;
                }
                if (i36 != 0) {
                    g6.q.f76018b.getClass();
                    j19 = g6.q.f76020d;
                } else {
                    j19 = j17;
                }
                if (i44 != 0) {
                    g6.q.f76018b.getClass();
                    j25 = g6.q.f76020d;
                } else {
                    j25 = j16;
                }
                if (i47 != 0) {
                    d6.p.f57793b.getClass();
                    i69 = d6.p.f57794c;
                } else {
                    i69 = i14;
                }
                if (i54 != 0) {
                    z15 = true;
                }
                if (i56 != 0) {
                    i74 = Integer.MAX_VALUE;
                } else {
                    i74 = i15;
                }
                if (i59 == 0) {
                }
                if (i65 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
            } else {
                if (i76 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar;
                }
                if (i25 != 0) {
                    o4.d0.f128823b.getClass();
                    j26 = o4.d0.f128832k;
                } else {
                    j26 = j8;
                }
                if (i27 != 0) {
                    g6.q.f76018b.getClass();
                    j27 = g6.q.f76020d;
                } else {
                    j27 = j14;
                }
                if (i30 != 0) {
                    f0Var2 = null;
                }
                if (i36 != 0) {
                    g6.q.f76018b.getClass();
                    j19 = g6.q.f76020d;
                } else {
                    j19 = j17;
                }
                if (i44 != 0) {
                    g6.q.f76018b.getClass();
                    j25 = g6.q.f76020d;
                } else {
                    j25 = j16;
                }
                if (i47 != 0) {
                    d6.p.f57793b.getClass();
                    i69 = d6.p.f57794c;
                } else {
                    i69 = i14;
                }
                if (i54 != 0) {
                    z15 = true;
                }
                if (i56 != 0) {
                    i74 = Integer.MAX_VALUE;
                } else {
                    i74 = i15;
                }
                if (i59 == 0) {
                }
                if (i65 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
            }
            o0VarE.h0();
            x1 x1Var16 = p3.n.f135158a;
            j28 = ((o4.d0) o0VarE.A(x.f872a)).f128833a;
            fFloatValue = ((Number) o0VarE.A(w.f867a)).floatValue();
            if (j26 != 16) {
                jC = j26;
            } else if (x0Var.c() != 16) {
                jC = x0Var.c();
            } else {
                jC = o4.d0.c(fFloatValue, j28, 14);
            }
            d6.h.f57752b.getClass();
            s5.x0 x0VarF16 = s5.x0.f(x0Var, 0L, j27, f0Var2, j19, 0, j25, 16609105);
            zL = o0VarE.l(jC);
            h4.r rVar1114 = rVar3;
            objQ = o0VarE.q();
            if (zL) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new r1(jC);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new r1(jC);
                o0VarE.K(objQ);
            }
            int i71117 = i64 << 9;
            int i71118 = i69;
            p006l2.y.b(str, rVar1114, x0VarF16, lVar3, i71118, z15, i74, i75, (o4.j0) objQ, null, o0VarE, (i24 & 126) | ((i64 >> 6) & 7168) | (57344 & i71117) | (458752 & i71117) | (3670016 & i71117) | (i71117 & 29360128), 512);
            rVar2 = rVar1114;
            o0Var = o0VarE;
            i66 = i71118;
            z17 = z15;
            f0Var3 = f0Var2;
            i67 = i75;
            j18 = j26;
            lVar2 = lVar3;
            i68 = i74;
            j24 = j27;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            j18 = j8;
            i66 = i14;
            i67 = i16;
            lVar2 = lVar;
            z17 = z15;
            j19 = j17;
            f0Var3 = f0Var2;
            j24 = j14;
            j25 = j16;
            i68 = i15;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final h4.r rVar1115 = rVar2;
            p2VarI0.f135219d = new e23.p() { // from class: a3.p1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i17 | 1);
                    int iT2 = p3.p0.t(i18);
                    s1.b(str, rVar1115, j18, j24, f0Var3, j19, j25, i66, z17, i68, i67, lVar2, x0Var, (p3.m) obj, iT, iT2, i19);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x0116  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    @o13.e
    public static final void c(final String str, h4.r rVar, long j8, long j14, w5.f0 f0Var, long j15, long j16, int i14, boolean z14, int i15, e23.l lVar, s5.x0 x0Var, p3.m mVar, final int i16, final int i17) {
        long j17;
        w5.f0 f0Var2;
        int i18;
        boolean z15;
        p3.o0 o0Var;
        final h4.r rVar2;
        final long j18;
        final long j19;
        final int i19;
        final boolean z16;
        final int i24;
        final e23.l lVar2;
        final s5.x0 x0Var2;
        final long j24;
        final w5.f0 f0Var3;
        final long j25;
        p2 p2VarI0;
        h4.r rVar3;
        long j26;
        long j27;
        Object objQ;
        int i25;
        e23.l lVar3;
        s5.x0 x0Var3;
        boolean z17;
        w5.f0 f0Var4;
        int i26;
        long j28;
        long j29;
        p3.o0 o0VarE = mVar.E(-366126944);
        int i27 = (o0VarE.B(str) ? 4 : 2) | i16;
        int i28 = i27 | 432;
        int i29 = i17 & 8;
        if (i29 != 0) {
            i28 = i27 | 3504;
            j17 = j14;
        } else {
            j17 = j14;
            if ((i16 & 3072) == 0) {
                i28 |= o0VarE.l(j17) ? 2048 : 1024;
            }
        }
        int i30 = i28 | 24576;
        int i34 = i17 & 32;
        if (i34 == 0) {
            if ((196608 & i16) == 0) {
                f0Var2 = f0Var;
                i30 |= o0VarE.B(f0Var2) ? 131072 : 65536;
            }
            i18 = i30 | 920125440;
            if ((306783379 & i18) == 306783378) {
                z15 = false;
            } else {
                z15 = true;
            }
            if (o0VarE.n(i18 & 1, z15)) {
                o0VarE.G0();
                if ((i16 & 1) != 0 || o0VarE.o0()) {
                    rVar3 = h4.r.S;
                    o4.d0.f128823b.getClass();
                    long j34 = o4.d0.f128832k;
                    if (i29 != 0) {
                        g6.q.f76018b.getClass();
                        j26 = g6.q.f76020d;
                    } else {
                        j26 = j17;
                    }
                    if (i34 != 0) {
                        f0Var2 = null;
                    }
                    g6.q.a aVar = g6.q.f76018b;
                    aVar.getClass();
                    j27 = g6.q.f76020d;
                    aVar.getClass();
                    d6.p.f57793b.getClass();
                    int i35 = d6.p.f57794c;
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a03.h(16);
                        o0VarE.K(objQ);
                    }
                    i25 = Integer.MAX_VALUE;
                    lVar3 = (e23.l) objQ;
                    x0Var3 = (s5.x0) o0VarE.A(f819a);
                    z17 = true;
                    f0Var4 = f0Var2;
                    i26 = i35;
                    j17 = j26;
                    j28 = j34;
                    j29 = j27;
                } else {
                    o0VarE.e();
                    rVar3 = rVar;
                    j27 = j15;
                    j29 = j16;
                    i26 = i14;
                    z17 = z14;
                    i25 = i15;
                    lVar3 = lVar;
                    x0Var3 = x0Var;
                    f0Var4 = f0Var2;
                    j28 = j8;
                }
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                int i36 = i18 & 2147483646;
                h4.r rVar4 = rVar3;
                long j35 = j27;
                boolean z18 = z17;
                int i37 = i25;
                o0Var = o0VarE;
                b(str, rVar4, j28, j17, f0Var4, j35, j29, i26, z18, i37, 1, lVar3, x0Var3, o0Var, i36, 224694, 0);
                rVar2 = rVar4;
                j25 = j28;
                j24 = j17;
                f0Var3 = f0Var4;
                j18 = j35;
                j19 = j29;
                i19 = i26;
                z16 = z18;
                i24 = i37;
                lVar2 = lVar3;
                x0Var2 = x0Var3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                j18 = j15;
                j19 = j16;
                i19 = i14;
                z16 = z14;
                i24 = i15;
                lVar2 = lVar;
                x0Var2 = x0Var;
                j24 = j17;
                f0Var3 = f0Var2;
                j25 = j8;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: a3.o1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i16 | 1);
                        s1.c(str, rVar2, j25, j24, f0Var3, j18, j19, i19, z16, i24, lVar2, x0Var2, (p3.m) obj, iT, i17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i30 = 221184 | i28;
        f0Var2 = f0Var;
        i18 = i30 | 920125440;
        if ((306783379 & i18) == 306783378) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (o0VarE.n(i18 & 1, z15)) {
            o0VarE.G0();
            if ((i16 & 1) != 0) {
                rVar3 = h4.r.S;
                o4.d0.f128823b.getClass();
                long j36 = o4.d0.f128832k;
                if (i29 != 0) {
                    g6.q.f76018b.getClass();
                    j26 = g6.q.f76020d;
                } else {
                    j26 = j17;
                }
                if (i34 != 0) {
                    f0Var2 = null;
                }
                g6.q.a aVar2 = g6.q.f76018b;
                aVar2.getClass();
                j27 = g6.q.f76020d;
                aVar2.getClass();
                d6.p.f57793b.getClass();
                int i38 = d6.p.f57794c;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a03.h(16);
                    o0VarE.K(objQ);
                }
                i25 = Integer.MAX_VALUE;
                lVar3 = (e23.l) objQ;
                x0Var3 = (s5.x0) o0VarE.A(f819a);
                z17 = true;
                f0Var4 = f0Var2;
                i26 = i38;
                j17 = j26;
                j28 = j36;
                j29 = j27;
            } else {
                rVar3 = h4.r.S;
                o4.d0.f128823b.getClass();
                long j37 = o4.d0.f128832k;
                if (i29 != 0) {
                    g6.q.f76018b.getClass();
                    j26 = g6.q.f76020d;
                } else {
                    j26 = j17;
                }
                if (i34 != 0) {
                    f0Var2 = null;
                }
                g6.q.a aVar3 = g6.q.f76018b;
                aVar3.getClass();
                j27 = g6.q.f76020d;
                aVar3.getClass();
                d6.p.f57793b.getClass();
                int i39 = d6.p.f57794c;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a03.h(16);
                    o0VarE.K(objQ);
                }
                i25 = Integer.MAX_VALUE;
                lVar3 = (e23.l) objQ;
                x0Var3 = (s5.x0) o0VarE.A(f819a);
                z17 = true;
                f0Var4 = f0Var2;
                i26 = i39;
                j17 = j26;
                j28 = j37;
                j29 = j27;
            }
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            int i310 = i18 & 2147483646;
            h4.r rVar5 = rVar3;
            long j38 = j27;
            boolean z19 = z17;
            int i311 = i25;
            o0Var = o0VarE;
            b(str, rVar5, j28, j17, f0Var4, j38, j29, i26, z19, i311, 1, lVar3, x0Var3, o0Var, i310, 224694, 0);
            rVar2 = rVar5;
            j25 = j28;
            j24 = j17;
            f0Var3 = f0Var4;
            j18 = j38;
            j19 = j29;
            i19 = i26;
            z16 = z19;
            i24 = i311;
            lVar2 = lVar3;
            x0Var2 = x0Var3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            j18 = j15;
            j19 = j16;
            i19 = i14;
            z16 = z14;
            i24 = i15;
            lVar2 = lVar;
            x0Var2 = x0Var;
            j24 = j17;
            f0Var3 = f0Var2;
            j25 = j8;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: a3.o1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i16 | 1);
                    s1.c(str, rVar2, j25, j24, f0Var3, j18, j19, i19, z16, i24, lVar2, x0Var2, (p3.m) obj, iT, i17);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
