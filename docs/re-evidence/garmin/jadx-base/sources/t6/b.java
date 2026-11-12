package t6;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {
    /* JADX WARN: Code duplicated, block: B:189:0x0297  */
    /* JADX WARN: Code duplicated, block: B:206:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:208:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:210:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:212:0x0311  */
    /* JADX WARN: Code duplicated, block: B:234:0x037e  */
    /* JADX WARN: Code duplicated, block: B:236:0x0396  */
    /* JADX WARN: Code duplicated, block: B:238:0x039b  */
    /* JADX WARN: Code duplicated, block: B:242:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:252:0x0428  */
    /* JADX WARN: Code duplicated, block: B:406:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:409:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:410:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:413:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:414:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:416:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:418:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:421:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:423:0x06d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:433:0x06f1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:74:0x0115  */
    public static void a(f fVar, m6.d dVar, ArrayList<e> arrayList, int i14) {
        int i15;
        c[] cVarArr;
        int i16;
        int i17;
        float f14;
        boolean z14;
        boolean z15;
        boolean z16;
        int i18;
        c[] cVarArr2;
        e eVar;
        m6.d dVar2;
        m6.h hVar;
        d dVar3;
        m6.h hVar2;
        int i19;
        d dVar4;
        m6.h hVar3;
        e eVar2;
        int i24;
        d[] dVarArr;
        int i25;
        d dVar5;
        d dVar6;
        m6.h hVar4;
        d dVar7;
        m6.h hVar5;
        int size;
        ArrayList<e> arrayList2;
        float f15;
        float f16;
        m6.h hVar6;
        m6.h hVar7;
        m6.h hVar8;
        m6.h hVar9;
        m6.b bVarL;
        float f17;
        d dVar8;
        e eVar3;
        int i26;
        int i27;
        int i28;
        e eVar4;
        float f18;
        f fVar2 = fVar;
        if (i14 == 0) {
            i15 = fVar2.G0;
            cVarArr = fVar2.J0;
            i16 = 0;
        } else {
            i15 = fVar2.H0;
            cVarArr = fVar2.I0;
            i16 = 2;
        }
        int i29 = i15;
        c[] cVarArr3 = cVarArr;
        int i30 = 0;
        while (i30 < i29) {
            c cVar = cVarArr3[i30];
            boolean z17 = cVar.f162582q;
            e eVar5 = cVar.f162566a;
            int i34 = 8;
            if (z17) {
                i17 = i30;
                f14 = 0.0f;
            } else {
                int i35 = cVar.f162577l;
                int i36 = i35 * 2;
                e eVar6 = eVar5;
                e eVar7 = eVar6;
                boolean z18 = false;
                f14 = 0.0f;
                while (!z18) {
                    cVar.f162574i++;
                    e[] eVarArr = eVar6.f162637r0;
                    d[] dVarArr2 = eVar6.T;
                    eVarArr[i35] = null;
                    eVar6.f162635q0[i35] = null;
                    if (eVar6.f162623k0 != i34) {
                        eVar6.l(i35);
                        e.b bVar = e.b.MATCH_CONSTRAINT;
                        dVarArr2[i36].e();
                        int i37 = i36 + 1;
                        dVarArr2[i37].e();
                        dVarArr2[i36].e();
                        dVarArr2[i37].e();
                        if (cVar.f162567b == null) {
                            cVar.f162567b = eVar6;
                        }
                        cVar.f162569d = eVar6;
                        e.b bVar2 = eVar6.W[i35];
                        if (bVar2 == bVar) {
                            i27 = i30;
                            int i38 = eVar6.f162644v[i35];
                            i28 = i35;
                            if (i38 == 0 || i38 == 3 || i38 == 2) {
                                cVar.f162575j++;
                                float f19 = eVar6.f162633p0[i28];
                                if (f19 > 0.0f) {
                                    f18 = f19;
                                    cVar.f162576k += f18;
                                } else {
                                    f18 = f19;
                                }
                                if (eVar6.f162623k0 != 8 && bVar2 == bVar && (i38 == 0 || i38 == 3)) {
                                    if (f18 < 0.0f) {
                                        cVar.f162579n = true;
                                    } else {
                                        cVar.f162580o = true;
                                    }
                                    if (cVar.f162573h == null) {
                                        cVar.f162573h = new ArrayList<>();
                                    }
                                    cVar.f162573h.add(eVar6);
                                }
                                if (cVar.f162571f == null) {
                                    cVar.f162571f = eVar6;
                                }
                                e eVar8 = cVar.f162572g;
                                if (eVar8 != null) {
                                    eVar8.f162635q0[i28] = eVar6;
                                }
                                cVar.f162572g = eVar6;
                            }
                            if (i28 == 0) {
                                if (eVar6.f162640t == 0 && eVar6.f162646w == 0) {
                                    int i39 = eVar6.f162647x;
                                }
                            } else if (eVar6.f162642u == 0 && eVar6.f162649z == 0) {
                                int i44 = eVar6.A;
                            }
                        } else {
                            i27 = i30;
                            i28 = i35;
                            i36 = i36;
                        }
                    } else {
                        i27 = i30;
                        i28 = i35;
                        i36 = i36;
                    }
                    if (eVar7 != eVar6) {
                        eVar7.f162637r0[i28] = eVar6;
                    }
                    d dVar9 = dVarArr2[i36 + 1].f162588f;
                    if (dVar9 != null) {
                        eVar4 = dVar9.f162586d;
                        d dVar10 = eVar4.T[i36].f162588f;
                        if (dVar10 == null || dVar10.f162586d != eVar6) {
                            eVar4 = null;
                        }
                    } else {
                        eVar4 = null;
                    }
                    if (eVar4 == null) {
                        eVar4 = eVar6;
                        z18 = true;
                    }
                    eVar7 = eVar6;
                    i35 = i28;
                    i36 = i36;
                    i34 = 8;
                    eVar6 = eVar4;
                    i30 = i27;
                }
                i17 = i30;
                int i45 = i35;
                int i46 = i36;
                e eVar9 = cVar.f162567b;
                if (eVar9 != null) {
                    eVar9.T[i46].e();
                }
                e eVar10 = cVar.f162569d;
                if (eVar10 != null) {
                    eVar10.T[i46 + 1].e();
                }
                cVar.f162568c = eVar6;
                if (i45 == 0 && cVar.f162578m) {
                    cVar.f162570e = eVar6;
                } else {
                    cVar.f162570e = eVar5;
                }
                cVar.f162581p = cVar.f162580o && cVar.f162579n;
            }
            cVar.f162582q = true;
            if (arrayList == 0 || arrayList.contains(eVar5)) {
                e eVar11 = cVar.f162568c;
                e eVar12 = cVar.f162567b;
                e eVar13 = cVar.f162569d;
                e eVar14 = cVar.f162570e;
                float f22 = cVar.f162576k;
                e.b[] bVarArr = fVar2.W;
                d[] dVarArr3 = fVar2.T;
                boolean z19 = bVarArr[i14] == e.b.WRAP_CONTENT;
                if (i14 == 0) {
                    int i47 = eVar14.f162629n0;
                    boolean z24 = i47 == 0;
                    z15 = i47 == 1;
                    z16 = i47 == 2;
                    z14 = z24;
                } else {
                    int i48 = eVar14.f162631o0;
                    z14 = i48 == 0;
                    z15 = i48 == 1;
                    z16 = i48 == 2;
                }
                boolean z25 = z15;
                boolean z26 = false;
                while (!z26) {
                    d[] dVarArr4 = eVar5.T;
                    d dVar11 = dVarArr4[i16];
                    int i49 = z16 ? 1 : 4;
                    int iE = dVar11.e();
                    d[] dVarArr5 = dVarArr3;
                    e.b bVar3 = eVar5.W[i14];
                    boolean z27 = z16;
                    e.b bVar4 = e.b.MATCH_CONSTRAINT;
                    boolean z28 = bVar3 == bVar4 && eVar5.f162644v[i14] == 0;
                    d dVar12 = dVar11.f162588f;
                    if (dVar12 != null && eVar5 != eVar5) {
                        iE = dVar12.e() + iE;
                    }
                    int i54 = iE;
                    if (z27 && eVar5 != eVar5 && eVar5 != eVar12) {
                        i49 = 8;
                    }
                    d dVar13 = dVar11.f162588f;
                    int i55 = i29;
                    if (dVar13 != null) {
                        m6.h hVar10 = dVar11.f162591i;
                        m6.h hVar11 = dVar13.f162591i;
                        if (eVar5 == eVar12) {
                            dVar.f(hVar10, hVar11, i54, 6);
                        } else {
                            dVar.f(hVar10, hVar11, i54, 8);
                        }
                        if (z28 && !z27) {
                            i49 = 5;
                        }
                        dVar.e(dVar11.f162591i, dVar11.f162588f.f162591i, i54, (eVar5 == eVar12 && z27 && eVar5.V[i14]) ? 5 : i49);
                    } else {
                        cVarArr3 = cVarArr3;
                    }
                    if (z19) {
                        if (eVar5.f162623k0 == 8 || eVar5.W[i14] != bVar4) {
                            i26 = 0;
                        } else {
                            i26 = 0;
                            dVar.f(dVarArr4[i16 + 1].f162591i, dVarArr4[i16].f162591i, 0, 5);
                        }
                        dVar.f(dVarArr4[i16].f162591i, dVarArr5[i16].f162591i, i26, 8);
                    }
                    d dVar14 = dVarArr4[i16 + 1].f162588f;
                    if (dVar14 != null) {
                        eVar3 = dVar14.f162586d;
                        d dVar15 = eVar3.T[i16].f162588f;
                        if (dVar15 == null || dVar15.f162586d != eVar5) {
                            eVar3 = null;
                        }
                    } else {
                        eVar3 = null;
                    }
                    if (eVar3 != null) {
                        eVar5 = eVar3;
                    } else {
                        z26 = true;
                    }
                    i29 = i55;
                    dVarArr3 = dVarArr5;
                    z16 = z27;
                    cVarArr3 = cVarArr3;
                }
                d[] dVarArr6 = dVarArr3;
                boolean z29 = z16;
                i18 = i29;
                cVarArr2 = cVarArr3;
                if (eVar13 != null) {
                    int i56 = i16 + 1;
                    if (eVar11.T[i56].f162588f != null) {
                        d dVar16 = eVar13.T[i56];
                        if (eVar13.W[i14] == e.b.MATCH_CONSTRAINT && eVar13.f162644v[i14] == 0 && !z29) {
                            d dVar17 = dVar16.f162588f;
                            if (dVar17.f162586d == fVar2) {
                                dVar.e(dVar16.f162591i, dVar17.f162591i, -dVar16.e(), 5);
                            } else if (z29) {
                                dVar8 = dVar16.f162588f;
                                if (dVar8.f162586d == fVar2) {
                                    dVar.e(dVar16.f162591i, dVar8.f162591i, -dVar16.e(), 4);
                                }
                            }
                        } else if (z29) {
                            dVar8 = dVar16.f162588f;
                            if (dVar8.f162586d == fVar2) {
                                dVar.e(dVar16.f162591i, dVar8.f162591i, -dVar16.e(), 4);
                            }
                        }
                        dVar.g(dVar16.f162591i, eVar11.T[i56].f162588f.f162591i, -dVar16.e(), 6);
                    }
                }
                if (z19 != 0) {
                    int i57 = i16 + 1;
                    m6.h hVar12 = dVarArr6[i57].f162591i;
                    d dVar18 = eVar11.T[i57];
                    dVar.f(hVar12, dVar18.f162591i, dVar18.e(), 8);
                }
                ArrayList<e> arrayList3 = cVar.f162573h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (cVar.f162579n && !cVar.f162581p) {
                        f22 = cVar.f162575j;
                    }
                    e eVar15 = null;
                    float f24 = f14;
                    int i58 = 0;
                    while (i58 < size) {
                        e eVar16 = arrayList3.get(i58);
                        float[] fArr = eVar16.f162633p0;
                        d[] dVarArr7 = eVar16.T;
                        float f25 = fArr[i14];
                        if (f25 >= f14) {
                            arrayList2 = arrayList3;
                            if (f25 == f14) {
                                dVar.e(dVarArr7[i16 + 1].f162591i, dVarArr7[i16].f162591i, 0, 8);
                                size = size;
                                f15 = f14;
                            } else {
                                i58 = i58;
                                if (eVar15 != null) {
                                    d[] dVarArr8 = eVar15.T;
                                    hVar6 = dVarArr8[i16].f162591i;
                                    int i59 = i16 + 1;
                                    hVar7 = dVarArr8[i59].f162591i;
                                    hVar8 = dVarArr7[i16].f162591i;
                                    hVar9 = dVarArr7[i59].f162591i;
                                    bVarL = dVar.l();
                                    f17 = f14;
                                    bVarL.f116812b = f17;
                                    f15 = f17;
                                    if (f22 != f17 || f24 == f25) {
                                        f16 = f25;
                                        bVarL.f116814d.k(hVar6, 1.0f);
                                        bVarL.f116814d.k(hVar7, -1.0f);
                                        bVarL.f116814d.k(hVar9, 1.0f);
                                        bVarL.f116814d.k(hVar8, -1.0f);
                                    } else {
                                        m6.b.a aVar = bVarL.f116814d;
                                        if (f24 == f15) {
                                            f16 = f25;
                                            aVar.k(hVar6, 1.0f);
                                            bVarL.f116814d.k(hVar7, -1.0f);
                                        } else {
                                            f16 = f25;
                                            float f26 = f24;
                                            if (f25 == f14) {
                                                aVar.k(hVar8, 1.0f);
                                                bVarL.f116814d.k(hVar9, -1.0f);
                                            } else {
                                                float f27 = (f26 / f22) / (f16 / f22);
                                                aVar.k(hVar6, 1.0f);
                                                bVarL.f116814d.k(hVar7, -1.0f);
                                                bVarL.f116814d.k(hVar9, f27);
                                                bVarL.f116814d.k(hVar8, -f27);
                                            }
                                        }
                                    }
                                    dVar.c(bVarL);
                                } else {
                                    f15 = f14;
                                    f16 = f25;
                                }
                                f24 = f16;
                                eVar15 = eVar16;
                            }
                        } else {
                            if (cVar.f162581p) {
                                arrayList2 = arrayList3;
                                dVar.e(dVarArr7[i16 + 1].f162591i, dVarArr7[i16].f162591i, 0, 4);
                            } else {
                                f25 = 1.0f;
                                arrayList2 = arrayList3;
                                if (f25 == f14) {
                                    dVar.e(dVarArr7[i16 + 1].f162591i, dVarArr7[i16].f162591i, 0, 8);
                                } else {
                                    i58 = i58;
                                    if (eVar15 != null) {
                                        d[] dVarArr9 = eVar15.T;
                                        hVar6 = dVarArr9[i16].f162591i;
                                        int i510 = i16 + 1;
                                        hVar7 = dVarArr9[i510].f162591i;
                                        hVar8 = dVarArr7[i16].f162591i;
                                        hVar9 = dVarArr7[i510].f162591i;
                                        bVarL = dVar.l();
                                        f17 = f14;
                                        bVarL.f116812b = f17;
                                        f15 = f17;
                                        if (f22 != f17) {
                                            f16 = f25;
                                            bVarL.f116814d.k(hVar6, 1.0f);
                                            bVarL.f116814d.k(hVar7, -1.0f);
                                            bVarL.f116814d.k(hVar9, 1.0f);
                                            bVarL.f116814d.k(hVar8, -1.0f);
                                        } else {
                                            f16 = f25;
                                            bVarL.f116814d.k(hVar6, 1.0f);
                                            bVarL.f116814d.k(hVar7, -1.0f);
                                            bVarL.f116814d.k(hVar9, 1.0f);
                                            bVarL.f116814d.k(hVar8, -1.0f);
                                        }
                                        dVar.c(bVarL);
                                    } else {
                                        f15 = f14;
                                        f16 = f25;
                                    }
                                    f24 = f16;
                                    eVar15 = eVar16;
                                }
                            }
                            size = size;
                            f15 = f14;
                        }
                        i58++;
                        arrayList3 = arrayList2;
                        size = size;
                        f14 = f15;
                    }
                }
                if (eVar12 == null || !(eVar12 == eVar13 || z29)) {
                    eVar = eVar13;
                    if (!z14 || eVar12 == null) {
                        if (z25 && eVar12 != null) {
                            int i64 = cVar.f162575j;
                            boolean z34 = i64 > 0 && cVar.f162574i == i64;
                            e eVar17 = eVar12;
                            e eVar18 = eVar17;
                            while (eVar17 != null) {
                                d[] dVarArr10 = eVar17.T;
                                e eVar19 = eVar17.f162637r0[i14];
                                while (eVar19 != null && eVar19.f162623k0 == 8) {
                                    eVar19 = eVar19.f162637r0[i14];
                                }
                                if (eVar17 != eVar12 && eVar17 != eVar && eVar19 != null) {
                                    if (eVar19 == eVar) {
                                        eVar19 = null;
                                    }
                                    d dVar19 = dVarArr10[i16];
                                    m6.h hVar13 = dVar19.f162591i;
                                    int i65 = i16 + 1;
                                    m6.h hVar14 = eVar18.T[i65].f162591i;
                                    int iE2 = dVar19.e();
                                    int iE3 = dVarArr10[i65].e();
                                    if (eVar19 != null) {
                                        dVar3 = eVar19.T[i16];
                                        hVar2 = dVar3.f162591i;
                                        d dVar20 = dVar3.f162588f;
                                        hVar = dVar20 != null ? dVar20.f162591i : null;
                                    } else {
                                        d dVar21 = eVar.T[i16];
                                        m6.h hVar15 = dVar21 != null ? dVar21.f162591i : null;
                                        hVar = dVarArr10[i65].f162591i;
                                        dVar3 = dVar21;
                                        hVar2 = hVar15;
                                    }
                                    if (dVar3 != null) {
                                        iE3 += dVar3.e();
                                    }
                                    int iE4 = eVar18.T[i65].e() + iE2;
                                    int i66 = z34 ? 8 : 4;
                                    if (hVar13 != null && hVar14 != null && hVar2 != null && hVar != null) {
                                        dVar.b(hVar13, hVar14, iE4, 0.5f, hVar2, hVar, iE3, i66);
                                    }
                                    eVar19 = eVar19;
                                }
                                if (eVar17.f162623k0 != 8) {
                                    eVar18 = eVar17;
                                }
                                eVar17 = eVar19;
                            }
                            dVar2 = dVar;
                            d dVar22 = eVar12.T[i16];
                            d dVar23 = eVar5.T[i16].f162588f;
                            int i67 = i16 + 1;
                            d dVar24 = eVar.T[i67];
                            d dVar25 = eVar11.T[i67].f162588f;
                            if (dVar23 != null) {
                                if (eVar12 != eVar) {
                                    dVar2.e(dVar22.f162591i, dVar23.f162591i, dVar22.e(), 5);
                                } else if (dVar25 != null) {
                                    dVar2.b(dVar22.f162591i, dVar23.f162591i, dVar22.e(), 0.5f, dVar24.f162591i, dVar25.f162591i, dVar24.e(), 5);
                                }
                            }
                            if (dVar25 != null && eVar12 != eVar) {
                                dVar2.e(dVar24.f162591i, dVar25.f162591i, -dVar24.e(), 5);
                            }
                        }
                        if ((z14 || z25) && eVar12 != null && eVar12 != eVar) {
                            dVarArr = eVar12.T;
                            d dVar26 = dVarArr[i16];
                            if (eVar == null) {
                                eVar = eVar12;
                            }
                            d[] dVarArr11 = eVar.T;
                            i25 = i16 + 1;
                            dVar5 = dVarArr11[i25];
                            dVar6 = dVar26.f162588f;
                            if (dVar6 != null) {
                                hVar4 = dVar6.f162591i;
                            } else {
                                hVar4 = null;
                            }
                            dVar7 = dVar5.f162588f;
                            if (dVar7 != null) {
                                hVar5 = dVar7.f162591i;
                            } else {
                                hVar5 = null;
                            }
                            if (eVar11 != eVar) {
                                d dVar27 = eVar11.T[i25].f162588f;
                                hVar5 = dVar27 != null ? dVar27.f162591i : null;
                            }
                            if (eVar12 == eVar) {
                                dVar5 = dVarArr[i25];
                            }
                            if (hVar4 == null && hVar5 != null) {
                                dVar2.b(dVar26.f162591i, hVar4, dVar26.e(), 0.5f, hVar5, dVar5.f162591i, dVarArr11[i25].e(), 5);
                            }
                        }
                    } else {
                        int i68 = cVar.f162575j;
                        boolean z35 = i68 > 0 && cVar.f162574i == i68;
                        e eVar20 = eVar12;
                        e eVar21 = eVar20;
                        while (eVar20 != null) {
                            d[] dVarArr12 = eVar20.T;
                            e eVar22 = eVar20.f162637r0[i14];
                            while (true) {
                                if (eVar22 == null) {
                                    i19 = 8;
                                    break;
                                }
                                i19 = 8;
                                if (eVar22.f162623k0 != 8) {
                                    break;
                                } else {
                                    eVar22 = eVar22.f162637r0[i14];
                                }
                            }
                            if (eVar22 != null || eVar20 == eVar) {
                                d dVar28 = dVarArr12[i16];
                                m6.h hVar16 = dVar28.f162591i;
                                d dVar29 = dVar28.f162588f;
                                m6.h hVar17 = dVar29 != null ? dVar29.f162591i : null;
                                if (eVar21 != eVar20) {
                                    hVar17 = eVar21.T[i16 + 1].f162591i;
                                } else if (eVar20 == eVar12) {
                                    d dVar30 = eVar5.T[i16].f162588f;
                                    hVar17 = dVar30 != null ? dVar30.f162591i : null;
                                }
                                int iE5 = dVar28.e();
                                int i69 = i16 + 1;
                                int iE6 = dVarArr12[i69].e();
                                if (eVar22 != null) {
                                    dVar4 = eVar22.T[i16];
                                    hVar3 = dVar4.f162591i;
                                } else {
                                    dVar4 = eVar11.T[i69].f162588f;
                                    hVar3 = dVar4 != null ? dVar4.f162591i : null;
                                }
                                m6.h hVar18 = dVarArr12[i69].f162591i;
                                if (dVar4 != null) {
                                    iE6 += dVar4.e();
                                }
                                int iE7 = eVar21.T[i69].e() + iE5;
                                if (hVar16 == null || hVar17 == null || hVar3 == null || hVar18 == null) {
                                    eVar2 = eVar5;
                                    i24 = 8;
                                } else {
                                    if (eVar20 == eVar12) {
                                        iE7 = eVar12.T[i16].e();
                                    }
                                    if (eVar20 == eVar) {
                                        iE6 = eVar.T[i69].e();
                                    }
                                    eVar2 = eVar5;
                                    i24 = 8;
                                    dVar.b(hVar16, hVar17, iE7, 0.5f, hVar3, hVar18, iE6, z35 ? 8 : 5);
                                }
                            } else {
                                eVar2 = eVar5;
                                i24 = i19;
                            }
                            if (eVar20.f162623k0 != i24) {
                                eVar21 = eVar20;
                            }
                            eVar20 = eVar22;
                            eVar21 = eVar21;
                            eVar5 = eVar2;
                        }
                    }
                } else {
                    d dVar31 = eVar5.T[i16];
                    int i74 = i16 + 1;
                    d dVar32 = eVar11.T[i74];
                    d dVar33 = dVar31.f162588f;
                    m6.h hVar19 = dVar33 != null ? dVar33.f162591i : null;
                    d dVar34 = dVar32.f162588f;
                    m6.h hVar20 = dVar34 != null ? dVar34.f162591i : null;
                    d dVar35 = eVar12.T[i16];
                    if (eVar13 != null) {
                        dVar32 = eVar13.T[i74];
                    }
                    if (hVar19 == null || hVar20 == null) {
                        eVar = eVar13;
                    } else {
                        float f28 = i14 == 0 ? eVar14.f162617h0 : eVar14.f162619i0;
                        int iE8 = dVar35.e();
                        int iE9 = dVar32.e();
                        m6.h hVar21 = dVar35.f162591i;
                        m6.h hVar22 = dVar32.f162591i;
                        m6.h hVar23 = hVar19;
                        eVar = eVar13;
                        dVar.b(hVar21, hVar23, iE8, f28, hVar20, hVar22, iE9, 7);
                    }
                }
                dVar2 = dVar;
                if (z14) {
                    dVarArr = eVar12.T;
                    d dVar210 = dVarArr[i16];
                    if (eVar == null) {
                        eVar = eVar12;
                    }
                    d[] dVarArr13 = eVar.T;
                    i25 = i16 + 1;
                    dVar5 = dVarArr13[i25];
                    dVar6 = dVar210.f162588f;
                    if (dVar6 != null) {
                        hVar4 = dVar6.f162591i;
                    } else {
                        hVar4 = null;
                    }
                    dVar7 = dVar5.f162588f;
                    if (dVar7 != null) {
                        hVar5 = dVar7.f162591i;
                    } else {
                        hVar5 = null;
                    }
                    if (eVar11 != eVar) {
                        d dVar211 = eVar11.T[i25].f162588f;
                        hVar5 = dVar211 != null ? dVar211.f162591i : null;
                    }
                    if (eVar12 == eVar) {
                        dVar5 = dVarArr[i25];
                    }
                    if (hVar4 == null) {
                    }
                } else {
                    dVarArr = eVar12.T;
                    d dVar212 = dVarArr[i16];
                    if (eVar == null) {
                        eVar = eVar12;
                    }
                    d[] dVarArr14 = eVar.T;
                    i25 = i16 + 1;
                    dVar5 = dVarArr14[i25];
                    dVar6 = dVar212.f162588f;
                    if (dVar6 != null) {
                        hVar4 = dVar6.f162591i;
                    } else {
                        hVar4 = null;
                    }
                    dVar7 = dVar5.f162588f;
                    if (dVar7 != null) {
                        hVar5 = dVar7.f162591i;
                    } else {
                        hVar5 = null;
                    }
                    if (eVar11 != eVar) {
                        d dVar213 = eVar11.T[i25].f162588f;
                        hVar5 = dVar213 != null ? dVar213.f162591i : null;
                    }
                    if (eVar12 == eVar) {
                        dVar5 = dVarArr[i25];
                    }
                    if (hVar4 == null) {
                    }
                }
            } else {
                i18 = i29;
                cVarArr2 = cVarArr3;
            }
            i30 = i17 + 1;
            fVar2 = fVar;
            i29 = i18;
            cVarArr3 = cVarArr2;
        }
    }
}
