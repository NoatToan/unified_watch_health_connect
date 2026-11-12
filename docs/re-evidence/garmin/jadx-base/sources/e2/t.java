package e2;

import android.os.Trace;
import c2.h2;
import f5.a1;
import f5.k2;
import g2.b2;
import g2.q0;
import g2.r0;
import g2.s0;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class t implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f62523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f62524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h2 f62525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f62526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<o> f62527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c2.j.l f62528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c2.j.e f62529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f62530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f62531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o4.q0 f62532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b2 f62533k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h4.d.b f62534l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h4.d.c f62535m;

    /* JADX WARN: Multi-variable type inference failed */
    public t(i0 i0Var, boolean z14, h2 h2Var, boolean z15, e23.a<? extends o> aVar, c2.j.l lVar, c2.j.e eVar, int i14, o53.b0 b0Var, o4.q0 q0Var, b2 b2Var, h4.d.b bVar, h4.d.c cVar) {
        this.f62523a = i0Var;
        this.f62524b = z14;
        this.f62525c = h2Var;
        this.f62526d = z15;
        this.f62527e = aVar;
        this.f62528f = lVar;
        this.f62529g = eVar;
        this.f62530h = i14;
        this.f62531i = b0Var;
        this.f62532j = q0Var;
        this.f62533k = b2Var;
        this.f62534l = bVar;
        this.f62535m = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:333:0x0747  */
    /* JADX WARN: Code duplicated, block: B:334:0x074c  */
    /* JADX WARN: Code duplicated, block: B:337:0x0756  */
    /* JADX WARN: Code duplicated, block: B:338:0x075d  */
    /* JADX WARN: Code duplicated, block: B:341:0x077d  */
    /* JADX WARN: Code duplicated, block: B:343:0x0785  */
    /* JADX WARN: Code duplicated, block: B:344:0x078c  */
    /* JADX WARN: Code duplicated, block: B:345:0x078f  */
    /* JADX WARN: Code duplicated, block: B:347:0x0797  */
    /* JADX WARN: Code duplicated, block: B:349:0x079f  */
    /* JADX WARN: Code duplicated, block: B:351:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:352:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:353:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:355:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:360:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:363:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:364:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:366:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:367:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:370:0x0804  */
    /* JADX WARN: Code duplicated, block: B:372:0x0809  */
    /* JADX WARN: Code duplicated, block: B:88:0x023c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not found block with instruction: 0x05ef: MOVE (r6v16 ?? I:??[long, double]) A[DONT_GENERATE, REMOVE] */
    @Override // g2.q0
    public final a1 a(s0 s0Var, long j8) {
        int i14;
        float f22711d;
        long j14;
        i0 i0Var;
        int i15;
        int i16;
        int i17;
        int i18;
        y yVar;
        int i19;
        int i24;
        List arrayList;
        int i25;
        ArrayList arrayList2;
        boolean z14;
        int iF;
        y yVar2;
        int i26;
        y yVar3;
        int i27;
        y yVar4;
        Integer numValueOf;
        y yVar5;
        Integer numValueOf2;
        boolean z15;
        int iIntValue;
        int iIntValue2;
        p008y1.b2 b2Var;
        x xVar;
        k2 k2Var;
        s sVar;
        y yVar6;
        y yVar7;
        int i28;
        r0 r0Var;
        int iG;
        k2 k2Var2 = s0Var.f75213b;
        i0 i0Var2 = this.f62523a;
        i0Var2.f62452s.getF182175a();
        boolean z16 = i0Var2.f62435b || k2Var2.t1();
        boolean z17 = this.f62524b;
        u1.n.g(z17 ? p008y1.b2.Vertical : p008y1.b2.Horizontal, j8);
        h2 h2Var = this.f62525c;
        int iF0 = z17 ? k2Var2.f0(h2Var.b(k2Var2.getF68910b())) : k2Var2.f0(c2.l.i(h2Var, k2Var2.getF68910b()));
        int iF1 = z17 ? k2Var2.f0(h2Var.c(k2Var2.getF68910b())) : k2Var2.f0(c2.l.h(h2Var, k2Var2.getF68910b()));
        int iF2 = k2Var2.f0(h2Var.getF22737b());
        int iF3 = k2Var2.f0(h2Var.getF22739d());
        int i29 = iF2 + iF3;
        int i30 = iF0 + iF1;
        int i34 = z17 ? i29 : i30;
        boolean z18 = this.f62526d;
        if (z17 && !z18) {
            i14 = iF2;
        } else if (z17 && z18) {
            i14 = iF3;
        } else {
            i14 = (z17 || z18) ? iF1 : iF0;
        }
        int i35 = i34 - i14;
        long jI = g6.b.i(-i30, -i29, j8);
        o oVarInvoke = this.f62527e.invoke();
        e f62494c = oVarInvoke.getF62494c();
        int iJ = g6.a.j(jI);
        int i36 = g6.a.i(jI);
        f62494c.f62414a.t(iJ);
        f62494c.f62415b.t(i36);
        c2.j.e eVar = this.f62529g;
        c2.j.l lVar = this.f62528f;
        if (z17) {
            if (lVar == null) {
                b2.e.b("null verticalArrangement when isVertical == true");
                o2.c.f();
                return null;
            }
            f22711d = lVar.getF22711d();
        } else {
            if (eVar == null) {
                b2.e.b("null horizontalAlignment when isVertical == false");
                o2.c.f();
                return null;
            }
            f22711d = eVar.getF22711d();
        }
        int iF4 = k2Var2.f0(f22711d);
        int itemCount = oVarInvoke.getItemCount();
        int i37 = z17 ? g6.a.i(j8) - i29 : g6.a.j(j8) - i30;
        boolean z19 = this.f62526d;
        if (!z19 || i37 > 0) {
            j14 = (((long) iF0) << 32) | (((long) iF2) & 4294967295L);
            g6.k.a aVar = g6.k.f76003b;
        } else {
            if (!z17) {
                iF0 += i37;
            }
            if (z17) {
                iF2 += i37;
            }
            j14 = (((long) iF0) << 32) | (((long) iF2) & 4294967295L);
            g6.k.a aVar2 = g6.k.f76003b;
        }
        int i38 = i37;
        int i39 = i14;
        s sVar2 = new s(jI, this.f62524b, oVarInvoke, s0Var, itemCount, iF4, this.f62534l, this.f62535m, z19, i39, i35, j14, this.f62523a);
        int i44 = i39;
        f4.f.f68735e.getClass();
        f4.f fVarA = f4.f.a.a();
        e23.l<Object, Unit> f68799i = fVarA != null ? fVarA.getF68799i() : null;
        f4.f fVarB = f4.f.a.b(fVarA);
        try {
            int iH = i0Var2.h();
            g0 g0Var = i0Var2.f62438e;
            int iE = g2.p.e(iH, oVarInvoke, g0Var.f62425d);
            if (iH != iE) {
                g0Var.f62422a.t(iE);
                g0Var.f62426e.a(iH);
            }
            int i45 = i0Var2.i();
            Unit unit = Unit.INSTANCE;
            f4.f.a.e(fVarA, fVarB, f68799i);
            List<Integer> listA = g2.s.a(oVarInvoke, i0Var2.f62451r, i0Var2.f62448o);
            float fFloatValue = (k2Var2.t1() || !z16) ? i0Var2.f62441h : ((Number) i0Var2.f62456w.f75057b.f155628b.getF182175a()).floatValue();
            g2.b0<y> b0Var = i0Var2.f62447n;
            boolean zT1 = k2Var2.t1();
            p1<Unit> p1Var = i0Var2.f62455v;
            if (i44 < 0) {
                b2.e.a("invalid beforeContentPadding");
            }
            if (i35 < 0) {
                b2.e.a("invalid afterContentPadding");
            }
            o oVar = sVar2.f62584b;
            boolean z24 = this.f62524b;
            boolean z25 = this.f62526d;
            int i46 = i45;
            o53.b0 b0Var2 = this.f62531i;
            o4.q0 q0Var = this.f62532j;
            if (itemCount <= 0) {
                int iL = g6.a.l(jI);
                int iK = g6.a.k(jI);
                b0Var.d(0, iL, iK, new ArrayList(), oVar.getF62495d(), sVar2, z24, zT1, 1, z16, 0, 0, b0Var2, q0Var);
                if (zT1) {
                    iG = iL;
                } else {
                    long jB = b0Var.b();
                    g6.m.f76012b.getClass();
                    if (g6.m.c(jB, 0L)) {
                        iG = iL;
                    } else {
                        iG = g6.b.g((int) (jB >> 32), jI);
                        iK = g6.b.f((int) (jB & 4294967295L), jI);
                    }
                }
                dv0.n nVar = new dv0.n(19);
                int iG2 = g6.b.g(iG + i30, j8);
                int iF5 = g6.b.f(iK + i29, j8);
                p13.k0 k0Var = p13.k0.f134949a;
                k0Var.getClass();
                a1 a1VarH1 = k2Var2.H1(iG2, iF5, k0Var, nVar);
                int i47 = i38 + i35;
                k2Var = k2Var2;
                sVar = sVar2;
                i0Var = i0Var2;
                xVar = new x(null, 0, false, 0.0f, a1VarH1, 0.0f, false, b0Var2, s0Var, sVar2.f62586d, p13.j0.f134944a, -i44, i47, 0, z25, z24 ? p008y1.b2.Vertical : p008y1.b2.Horizontal, i35, iF4, null);
            } else {
                boolean z26 = z24;
                i0Var = i0Var2;
                int i48 = itemCount;
                boolean z27 = z16;
                if (iE >= i48) {
                    iE = i48 - 1;
                    i46 = 0;
                }
                int iRound = Math.round(fFloatValue);
                int i49 = i46 - iRound;
                if (iE == 0 && i49 < 0) {
                    iRound += i49;
                    i49 = 0;
                }
                p13.k kVar = new p13.k();
                int i54 = -i44;
                float f14 = fFloatValue;
                int i55 = i54 + (r5 < 0 ? r5 : 0);
                int i56 = i49 + i55;
                int i57 = iE;
                int iMax = 0;
                while (i56 < 0 && i57 > 0) {
                    p1<Unit> p1Var2 = p1Var;
                    int i58 = i57 - 1;
                    boolean z28 = z26;
                    y yVarD = z.d(sVar2, i58);
                    i57 = i58;
                    kVar.add(0, yVarD);
                    iMax = Math.max(iMax, yVarD.f62578t);
                    i56 += yVarD.f62577s;
                    z26 = z28;
                    p1Var = p1Var2;
                }
                p1<Unit> p1Var3 = p1Var;
                boolean z29 = z26;
                if (i56 < i55) {
                    iRound -= i55 - i56;
                    i56 = i55;
                }
                int i59 = iRound;
                int i64 = i56 - i55;
                int i65 = i38 + i35;
                int i66 = i65 < 0 ? 0 : i65;
                int i67 = i64;
                int i68 = -i64;
                int i69 = iMax;
                int i74 = i57;
                int i75 = 0;
                boolean z34 = false;
                while (i75 < kVar.f134948c) {
                    if (i68 >= i66) {
                        kVar.b(i75);
                        Unit unit2 = Unit.INSTANCE;
                        z34 = true;
                    } else {
                        i74++;
                        i68 += ((y) kVar.get(i75)).f62577s;
                        i75++;
                    }
                }
                boolean z35 = z34;
                int i76 = i74;
                int iMax2 = i69;
                while (i76 < i48 && (i68 < i66 || i68 <= 0 || kVar.isEmpty())) {
                    int i77 = i66;
                    y yVarD2 = z.d(sVar2, i76);
                    int i78 = i48;
                    int i79 = yVarD2.f62577s;
                    i68 += i79;
                    if (i68 <= i55) {
                        i28 = i55;
                        if (i76 != i78 - 1) {
                            i67 -= i79;
                            Unit unit3 = Unit.INSTANCE;
                            i57 = i76 + 1;
                            z35 = true;
                        }
                        i76++;
                        i66 = i77;
                        i48 = i78;
                        i55 = i28;
                    } else {
                        i28 = i55;
                    }
                    int iMax3 = Math.max(iMax2, yVarD2.f62578t);
                    kVar.addLast(yVarD2);
                    iMax2 = iMax3;
                    i76++;
                    i66 = i77;
                    i48 = i78;
                    i55 = i28;
                }
                int i84 = i48;
                if (i68 < i38) {
                    int i85 = i38 - i68;
                    i68 += i85;
                    i17 = i67 - i85;
                    while (i17 < i44 && i57 > 0) {
                        int i86 = i57 - 1;
                        int i87 = i44;
                        y yVarD3 = z.d(sVar2, i86);
                        kVar.add(0, yVarD3);
                        iMax2 = Math.max(iMax2, yVarD3.f62578t);
                        i17 += yVarD3.f62577s;
                        i57 = i86;
                        i44 = i87;
                        i85 = i85;
                    }
                    i15 = i44;
                    i16 = i59 + i85;
                    if (i17 < 0) {
                        i16 += i17;
                        i68 += i17;
                        i17 = 0;
                    }
                } else {
                    i15 = i44;
                    i16 = i59;
                    i17 = i67;
                }
                float f15 = (Integer.signum(Math.round(f14)) != Integer.signum(i16) || Math.abs(Math.round(f14)) < Math.abs(i16)) ? f14 : i16;
                float f16 = f14 - f15;
                float f17 = 0.0f;
                if (zT1 && i16 > i59 && f16 <= 0.0f) {
                    f17 = (i16 - i59) + f16;
                }
                float f18 = f17;
                if (i17 < 0) {
                    b2.e.a("negative currentFirstItemScrollOffset");
                }
                int i88 = -i17;
                y yVar8 = (y) kVar.first();
                if (i15 > 0 || r5 < 0) {
                    int f97124f = kVar.getF97124f();
                    int i89 = i17;
                    y yVar9 = yVar8;
                    int i93 = 0;
                    while (true) {
                        if (i93 < f97124f) {
                            int i94 = f97124f;
                            int i95 = ((y) kVar.get(i93)).f62577s;
                            if (i89 != 0 && i95 <= i89) {
                                i18 = i89;
                                if (i93 == kVar.getF97124f() - 1) {
                                    break;
                                }
                                i89 = i18 - i95;
                                i93++;
                                yVar9 = (y) kVar.get(i93);
                                f97124f = i94;
                            }
                        }
                        i18 = i89;
                        break;
                    }
                    yVar = yVar9;
                    i17 = i18;
                } else {
                    yVar = yVar8;
                }
                int i96 = this.f62530h;
                int i97 = i17;
                int iMax4 = Math.max(0, i57 - i96);
                int i98 = i57 - 1;
                if (iMax4 <= i98) {
                    List arrayList3 = null;
                    while (true) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        i19 = i96;
                        arrayList = arrayList3;
                        i24 = i76;
                        arrayList.add(z.d(sVar2, i98));
                        if (i98 == iMax4) {
                            break;
                        }
                        i98--;
                        i76 = i24;
                        arrayList3 = arrayList;
                        i96 = i19;
                    }
                } else {
                    i19 = i96;
                    i24 = i76;
                    arrayList = null;
                }
                int size = listA.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i99 = size - 1;
                        int iIntValue3 = listA.get(size).intValue();
                        if (iIntValue3 < iMax4) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(z.d(sVar2, iIntValue3));
                        }
                        if (i99 < 0) {
                            break;
                        }
                        size = i99;
                    }
                }
                if (arrayList == null) {
                    arrayList = p13.j0.f134944a;
                }
                int size2 = arrayList.size();
                for (int i100 = 0; i100 < size2; i100++) {
                    iMax2 = Math.max(iMax2, ((y) arrayList.get(i100)).f62578t);
                }
                int iMin = Math.min(((y) p13.h0.m0(kVar)).f62559a + i19, i84 - 1);
                int i101 = ((y) p13.h0.m0(kVar)).f62559a + 1;
                if (i101 <= iMin) {
                    arrayList2 = null;
                    while (true) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        i25 = iMax2;
                        arrayList2.add(z.d(sVar2, i101));
                        if (i101 == iMin) {
                            break;
                        }
                        i101++;
                        iMax2 = i25;
                    }
                } else {
                    i25 = iMax2;
                    arrayList2 = null;
                }
                if (arrayList2 != null && ((y) p13.h0.m0(arrayList2)).f62559a > iMin) {
                    iMin = ((y) p13.h0.m0(arrayList2)).f62559a;
                }
                int size3 = listA.size();
                List arrayList4 = arrayList2;
                int i102 = 0;
                while (i102 < size3) {
                    List<Integer> list = listA;
                    int iIntValue4 = listA.get(i102).intValue();
                    if (iIntValue4 > iMin) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(z.d(sVar2, iIntValue4));
                    }
                    i102++;
                    listA = list;
                }
                if (arrayList4 == null) {
                    arrayList4 = p13.j0.f134944a;
                }
                int size4 = arrayList4.size();
                int iMax5 = i25;
                for (int i103 = 0; i103 < size4; i103++) {
                    iMax5 = Math.max(iMax5, ((y) arrayList4.get(i103)).f62578t);
                }
                boolean z36 = p005kotlin.jvm.internal.s.g(yVar, kVar.first()) && arrayList.isEmpty() && arrayList4.isEmpty();
                int iG3 = g6.b.g(z29 ? iMax5 : i68, jI);
                if (z29) {
                    iMax5 = i68;
                }
                int iF6 = g6.b.f(iMax5, jI);
                int i104 = z29 ? iF6 : iG3;
                boolean z37 = i68 < Math.min(i104, i38);
                if (z37 && i88 != 0) {
                    b2.e.c("non-zero itemsScrollOffset");
                }
                boolean z38 = z37;
                ArrayList arrayList5 = new ArrayList(arrayList4.size() + arrayList.size() + kVar.getF97124f());
                if (z38) {
                    if (!arrayList.isEmpty() || !arrayList4.isEmpty()) {
                        b2.e.a("no extra items");
                    }
                    int f97124f2 = kVar.getF97124f();
                    int[] iArr = new int[f97124f2];
                    int i105 = 0;
                    while (i105 < f97124f2) {
                        if (z25) {
                            i105 = (f97124f2 - i105) - 1;
                        }
                        iArr[i105] = ((y) kVar.get(i105)).f62575q;
                        i105++;
                    }
                    int[] iArr2 = new int[f97124f2];
                    if (z29) {
                        if (lVar == null) {
                            b2.e.b("null verticalArrangement when isVertical == true");
                            o2.c.f();
                            return null;
                        }
                        lVar.c(s0Var, i104, iArr, iArr2);
                    } else {
                        if (eVar == null) {
                            b2.e.b("null horizontalArrangement when isVertical == false");
                            o2.c.f();
                            return null;
                        }
                        eVar.b(s0Var, i104, iArr, g6.o.Ltr, iArr2);
                    }
                    j23.l lVarI = p13.u.I(iArr2);
                    j23.j jVarM = lVarI;
                    if (z25) {
                        jVarM = j23.t.m(lVarI);
                    }
                    int i106 = jVarM.f96796a;
                    int i107 = jVarM.f96797b;
                    int i108 = jVarM.f96798c;
                    if ((i108 > 0 && i106 <= i107) || (i108 < 0 && i107 <= i106)) {
                        while (true) {
                            int i109 = iArr2[i106];
                            y yVar10 = (y) kVar.get(!z25 ? i106 : (f97124f2 - i106) - 1);
                            if (z25) {
                                i109 = (i104 - i109) - yVar10.f62575q;
                            }
                            yVar10.h(i109, iG3, iF6);
                            arrayList5.add(yVar10);
                            if (i106 == i107) {
                                break;
                            }
                            i106 += i108;
                            i104 = i104;
                            i108 = i108;
                        }
                    }
                } else {
                    int size5 = arrayList.size();
                    int i110 = i88;
                    for (int i111 = 0; i111 < size5; i111++) {
                        y yVar11 = (y) arrayList.get(i111);
                        i110 -= yVar11.f62577s;
                        yVar11.h(i110, iG3, iF6);
                        arrayList5.add(yVar11);
                    }
                    int f97124f3 = kVar.getF97124f();
                    int i112 = i88;
                    for (int i113 = 0; i113 < f97124f3; i113++) {
                        y yVar12 = (y) kVar.get(i113);
                        yVar12.h(i112, iG3, iF6);
                        arrayList5.add(yVar12);
                        i112 += yVar12.f62577s;
                    }
                    int size6 = arrayList4.size();
                    for (int i114 = 0; i114 < size6; i114++) {
                        y yVar13 = (y) arrayList4.get(i114);
                        yVar13.h(i112, iG3, iF6);
                        arrayList5.add(yVar13);
                        i112 += yVar13.f62577s;
                    }
                }
                int i115 = i24;
                int i116 = i68;
                y yVar14 = yVar;
                float f19 = f15;
                int iG4 = iG3;
                b0Var.d((int) f15, iG4, iF6, arrayList5, oVar.getF62495d(), sVar2, z29, zT1, 1, z27, i97, i116, b0Var2, q0Var);
                if (zT1) {
                    z14 = z29;
                } else {
                    long jB2 = b0Var.b();
                    g6.m.f76012b.getClass();
                    z14 = z29;
                    if (!g6.m.c(jB2, 0L)) {
                        int i117 = z14 ? iF6 : iG4;
                        iG4 = g6.b.g(Math.max(iG4, (int) (jB2 >> 32)), jI);
                        iF = g6.b.f(Math.max(iF6, (int) (jB2 & 4294967295L)), jI);
                        int i118 = z14 ? iF : iG4;
                        if (i118 != i117) {
                            int size7 = arrayList5.size();
                            for (int i119 = 0; i119 < size7; i119++) {
                                y yVar15 = (y) arrayList5.get(i119);
                                yVar15.f62580v = i118;
                                yVar15.f62582x = yVar15.f62567i + i118;
                            }
                        }
                    }
                    int i120 = iG4;
                    yVar2 = (y) kVar.e();
                    if (yVar2 != null) {
                        i26 = yVar2.f62559a;
                    } else {
                        i26 = 0;
                    }
                    yVar3 = (y) kVar.h();
                    if (yVar3 != null) {
                        i27 = yVar3.f62559a;
                    } else {
                        i27 = 0;
                    }
                    int i121 = i15;
                    int i122 = iF;
                    List listD = g2.p.d(this.f62533k, i26, i27, arrayList5, oVar.b(), i121, i35, i120, i122, new ds0.g(sVar2, 3));
                    if (z36) {
                        yVar7 = (y) p13.h0.d0(arrayList5);
                        if (yVar7 != null) {
                            numValueOf = Integer.valueOf(yVar7.f62559a);
                        } else {
                            numValueOf = null;
                        }
                    } else {
                        yVar4 = (y) kVar.e();
                        if (yVar4 != null) {
                            numValueOf = Integer.valueOf(yVar4.f62559a);
                        } else {
                            numValueOf = null;
                        }
                    }
                    if (z36) {
                        yVar6 = (y) p13.h0.n0(arrayList5);
                        if (yVar6 != null) {
                            numValueOf2 = Integer.valueOf(yVar6.f62559a);
                        } else {
                            numValueOf2 = null;
                        }
                    } else {
                        yVar5 = (y) kVar.h();
                        if (yVar5 != null) {
                            numValueOf2 = Integer.valueOf(yVar5.f62559a);
                        } else {
                            numValueOf2 = null;
                        }
                    }
                    if (i115 >= i84 || i116 > i38) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    w wVar = new w(p1Var3, arrayList5, listD, zT1, 0);
                    int iG5 = g6.b.g(i120 + i30, j8);
                    int iF7 = g6.b.f(i122 + i29, j8);
                    p13.k0 k0Var2 = p13.k0.f134949a;
                    k0Var2.getClass();
                    a1 a1VarH2 = k2Var2.H1(iG5, iF7, k0Var2, wVar);
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (numValueOf2 != null) {
                        iIntValue2 = numValueOf2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    List listH = g2.p.h(iIntValue, iIntValue2, arrayList5, listD);
                    if (z14) {
                        b2Var = p008y1.b2.Vertical;
                    } else {
                        b2Var = p008y1.b2.Horizontal;
                    }
                    k2Var = k2Var2;
                    sVar = sVar2;
                    xVar = new x(yVar14, i97, z15, f19, a1VarH2, f18, z35, b0Var2, s0Var, sVar2.f62586d, listH, i54, i65, i84, z25, b2Var, i35, r5, null);
                }
                iF = iF6;
                int i123 = iG4;
                yVar2 = (y) kVar.e();
                if (yVar2 != null) {
                    i26 = yVar2.f62559a;
                } else {
                    i26 = 0;
                }
                yVar3 = (y) kVar.h();
                if (yVar3 != null) {
                    i27 = yVar3.f62559a;
                } else {
                    i27 = 0;
                }
                int i124 = i15;
                int i125 = iF;
                List listD2 = g2.p.d(this.f62533k, i26, i27, arrayList5, oVar.b(), i124, i35, i123, i125, new ds0.g(sVar2, 3));
                if (z36) {
                    yVar7 = (y) p13.h0.d0(arrayList5);
                    if (yVar7 != null) {
                        numValueOf = Integer.valueOf(yVar7.f62559a);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    yVar4 = (y) kVar.e();
                    if (yVar4 != null) {
                        numValueOf = Integer.valueOf(yVar4.f62559a);
                    } else {
                        numValueOf = null;
                    }
                }
                if (z36) {
                    yVar6 = (y) p13.h0.n0(arrayList5);
                    if (yVar6 != null) {
                        numValueOf2 = Integer.valueOf(yVar6.f62559a);
                    } else {
                        numValueOf2 = null;
                    }
                } else {
                    yVar5 = (y) kVar.h();
                    if (yVar5 != null) {
                        numValueOf2 = Integer.valueOf(yVar5.f62559a);
                    } else {
                        numValueOf2 = null;
                    }
                }
                if (i115 >= i84) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                w wVar2 = new w(p1Var3, arrayList5, listD2, zT1, 0);
                int iG6 = g6.b.g(i123 + i30, j8);
                int iF8 = g6.b.f(i125 + i29, j8);
                p13.k0 k0Var3 = p13.k0.f134949a;
                k0Var3.getClass();
                a1 a1VarH3 = k2Var2.H1(iG6, iF8, k0Var3, wVar2);
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 0;
                }
                if (numValueOf2 != null) {
                    iIntValue2 = numValueOf2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                List listH2 = g2.p.h(iIntValue, iIntValue2, arrayList5, listD2);
                if (z14) {
                    b2Var = p008y1.b2.Vertical;
                } else {
                    b2Var = p008y1.b2.Horizontal;
                }
                k2Var = k2Var2;
                sVar = sVar2;
                xVar = new x(yVar14, i97, z15, f19, a1VarH3, f18, z35, b0Var2, s0Var, sVar2.f62586d, listH2, i54, i65, i84, z25, b2Var, i35, r5, null);
            }
            i0 i0Var3 = i0Var;
            i0Var3.g(xVar, k2Var.t1(), false);
            Object obj = i0Var3.f62434a;
            g2.e eVar2 = obj instanceof g2.e ? (g2.e) obj : null;
            if (eVar2 == null) {
                return xVar;
            }
            List<y> list2 = xVar.f62551k;
            Trace.beginSection("compose:lazy:cache_window:keepAroundItems");
            try {
                if (eVar2.g() && !list2.isEmpty()) {
                    int i126 = ((y) p13.h0.b0(list2)).f62559a;
                    int i127 = ((y) p13.h0.m0(list2)).f62559a;
                    int i128 = eVar2.f75084i;
                    while (true) {
                        r0Var = sVar.f62585c;
                        if (i128 >= i126) {
                            break;
                        }
                        r0Var.x0(i128);
                        i128++;
                    }
                    int i129 = i127 + 1;
                    int i130 = eVar2.f75085j;
                    if (i129 <= i130) {
                        while (true) {
                            r0Var.x0(i129);
                            if (i129 == i130) {
                                break;
                            }
                            i129++;
                        }
                    }
                }
                Unit unit4 = Unit.INSTANCE;
                return xVar;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th3) {
            f4.f.a.e(fVarA, fVarB, f68799i);
            throw th3;
        }
    }
}
