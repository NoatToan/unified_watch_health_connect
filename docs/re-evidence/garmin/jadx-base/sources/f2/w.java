package f2;

import android.os.Trace;
import c2.h2;
import f5.a1;
import f5.k2;
import g2.b2;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class w implements g2.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f68313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f68314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h2 f68315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f68316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<n> f68317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f68318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c2.j.l f68319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c2.j.e f68320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f68321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o4.q0 f68322j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b2 f68323k;

    /* JADX WARN: Multi-variable type inference failed */
    public w(p0 p0Var, boolean z14, h2 h2Var, boolean z15, e23.a<? extends n> aVar, m0 m0Var, c2.j.l lVar, c2.j.e eVar, o53.b0 b0Var, o4.q0 q0Var, b2 b2Var) {
        this.f68313a = p0Var;
        this.f68314b = z14;
        this.f68315c = h2Var;
        this.f68316d = z15;
        this.f68317e = aVar;
        this.f68318f = m0Var;
        this.f68319g = lVar;
        this.f68320h = eVar;
        this.f68321i = b0Var;
        this.f68322j = q0Var;
        this.f68323k = b2Var;
    }

    /* JADX WARN: Code duplicated, block: B:199:0x047e  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:210:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:251:0x0587 A[LOOP:8: B:234:0x0538->B:251:0x0587, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:255:0x0596  */
    /* JADX WARN: Code duplicated, block: B:258:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:261:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:280:0x061a  */
    /* JADX WARN: Code duplicated, block: B:285:0x062d  */
    /* JADX WARN: Code duplicated, block: B:291:0x0639  */
    /* JADX WARN: Code duplicated, block: B:293:0x0642  */
    /* JADX WARN: Code duplicated, block: B:295:0x064c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:300:0x0664  */
    /* JADX WARN: Code duplicated, block: B:302:0x066c  */
    /* JADX WARN: Code duplicated, block: B:304:0x0675  */
    /* JADX WARN: Code duplicated, block: B:306:0x067b  */
    /* JADX WARN: Code duplicated, block: B:310:0x0687  */
    /* JADX WARN: Code duplicated, block: B:312:0x068f  */
    /* JADX WARN: Code duplicated, block: B:313:0x0691  */
    /* JADX WARN: Code duplicated, block: B:316:0x0698  */
    /* JADX WARN: Code duplicated, block: B:317:0x069b  */
    /* JADX WARN: Code duplicated, block: B:324:0x06b4 A[LOOP:14: B:323:0x06b2->B:324:0x06b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:327:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:332:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:335:0x06e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:336:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:337:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:341:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:343:0x0700  */
    /* JADX WARN: Code duplicated, block: B:344:0x070c  */
    /* JADX WARN: Code duplicated, block: B:346:0x0715 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:347:0x0717  */
    /* JADX WARN: Code duplicated, block: B:350:0x072d  */
    /* JADX WARN: Code duplicated, block: B:358:0x0743  */
    /* JADX WARN: Code duplicated, block: B:359:0x0747  */
    /* JADX WARN: Code duplicated, block: B:362:0x0757  */
    /* JADX WARN: Code duplicated, block: B:363:0x075f  */
    /* JADX WARN: Code duplicated, block: B:366:0x0769 A[LOOP:17: B:365:0x0767->B:366:0x0769, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:368:0x0777 A[LOOP:16: B:356:0x073f->B:368:0x0777, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:370:0x0783  */
    /* JADX WARN: Code duplicated, block: B:372:0x078c  */
    /* JADX WARN: Code duplicated, block: B:374:0x079c  */
    /* JADX WARN: Code duplicated, block: B:378:0x07b3 A[LOOP:19: B:375:0x079e->B:378:0x07b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:381:0x07be  */
    /* JADX WARN: Code duplicated, block: B:383:0x07ce A[LOOP:21: B:382:0x07cc->B:383:0x07ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:387:0x07e7 A[LOOP:22: B:386:0x07e5->B:387:0x07e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:391:0x0825  */
    /* JADX WARN: Code duplicated, block: B:393:0x0838 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:394:0x083a  */
    /* JADX WARN: Code duplicated, block: B:396:0x083f  */
    /* JADX WARN: Code duplicated, block: B:399:0x085b  */
    /* JADX WARN: Code duplicated, block: B:400:0x085d  */
    /* JADX WARN: Code duplicated, block: B:402:0x0860  */
    /* JADX WARN: Code duplicated, block: B:404:0x0867 A[LOOP:18: B:403:0x0865->B:404:0x0867, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:406:0x087c  */
    /* JADX WARN: Code duplicated, block: B:407:0x0880  */
    /* JADX WARN: Code duplicated, block: B:411:0x08ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:414:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:417:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:419:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:481:0x04c3 A[EDGE_INSN: B:481:0x04c3->B:208:0x04c3 BREAK  A[LOOP:6: B:197:0x047a->B:207:0x04bc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x058e A[EDGE_INSN: B:489:0x058e->B:252:0x058e BREAK  A[LOOP:8: B:234:0x0538->B:251:0x0587], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x077e A[EDGE_INSN: B:503:0x077e->B:369:0x077e BREAK  A[LOOP:16: B:356:0x073f->B:368:0x0777], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x07b5 A[EDGE_INSN: B:507:0x07b5->B:379:0x07b5 BREAK  A[LOOP:19: B:375:0x079e->B:378:0x07b3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x0636 A[ADDED_TO_REGION, EDGE_INSN: B:512:0x0636->B:290:0x0636 BREAK  A[LOOP:23: B:292:0x0640->B:298:0x0656], REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // g2.q0
    public final a1 a(g2.s0 s0Var, long j8) {
        int i14;
        boolean z14;
        float f22711d;
        long j14;
        int iC;
        int iH;
        p0 p0Var;
        v vVar;
        boolean z15;
        int i15;
        int i16;
        int i17;
        int i18;
        c0 c0Var;
        int i19;
        int size;
        int i24;
        List arrayList;
        int i25;
        n0 n0Var;
        int i26;
        List list;
        int i27;
        List list2;
        int size2;
        List arrayList2;
        int i28;
        u uVar;
        int f97124f;
        int i29;
        int i30;
        long j15;
        int iG;
        int i34;
        int i35;
        int i36;
        List list3;
        int i37;
        boolean z16;
        int size3;
        boolean z17;
        long j16;
        int i38;
        int length;
        ArrayList arrayList3;
        int size4;
        int size5;
        int i39;
        int i44;
        int size6;
        int i45;
        a0[] a0VarArrA;
        int length2;
        int i46;
        int i47;
        int i48;
        boolean z18;
        int i49;
        u uVar2;
        int i54;
        int i55;
        int i56;
        boolean z19;
        p008y1.b2 b2Var;
        z zVar;
        k2 k2Var;
        boolean z24;
        long jB;
        int i57;
        int iG2;
        int iF;
        int i58;
        int size7;
        int i59;
        int size8;
        int[] iArr;
        int i64;
        int[] iArr2;
        j23.l lVarI;
        j23.j jVarM;
        int i65;
        int i66;
        int i67;
        int i68;
        int i69;
        c0 c0Var2;
        a0[] a0VarArrA2;
        int length3;
        int i74;
        int i75;
        ArrayList arrayListC0;
        int iIntValue;
        int i76;
        List<Integer> list4;
        u uVar3;
        a0 a0Var;
        int iIntValue2;
        a0[] a0VarArr;
        a0[] a0VarArr2;
        a0 a0Var2;
        k2 k2Var2 = s0Var.f75213b;
        p0 p0Var2 = this.f68313a;
        p0Var2.f68279s.getF182175a();
        boolean z25 = p0Var2.f68262b || k2Var2.t1();
        boolean z26 = this.f68314b;
        u1.n.g(z26 ? p008y1.b2.Vertical : p008y1.b2.Horizontal, j8);
        h2 h2Var = this.f68315c;
        int iF0 = z26 ? k2Var2.f0(h2Var.b(k2Var2.getF68910b())) : k2Var2.f0(c2.l.i(h2Var, k2Var2.getF68910b()));
        int iF1 = z26 ? k2Var2.f0(h2Var.c(k2Var2.getF68910b())) : k2Var2.f0(c2.l.h(h2Var, k2Var2.getF68910b()));
        int iF2 = k2Var2.f0(h2Var.getF22737b());
        int iF3 = k2Var2.f0(h2Var.getF22739d());
        int i77 = iF2 + iF3;
        int i78 = iF0 + iF1;
        int i79 = z26 ? i77 : i78;
        boolean z27 = this.f68316d;
        if (z26 && !z27) {
            i14 = iF2;
        } else if (z26 && z27) {
            i14 = iF3;
        } else {
            i14 = (z26 || z27) ? iF1 : iF0;
        }
        int i84 = i79 - i14;
        long jI = g6.b.i(-i78, -i77, j8);
        n nVarInvoke = this.f68317e.invoke();
        n0 n0VarG = nVarInvoke.g();
        l0 l0VarA = this.f68318f.a(s0Var, jI);
        int length4 = l0VarA.f68233a.length;
        if (length4 != n0VarG.f68243i) {
            n0VarG.f68243i = length4;
            ArrayList<n0.a> arrayList4 = n0VarG.f68236b;
            arrayList4.clear();
            z14 = false;
            arrayList4.add(new n0.a(0, 0, 2, null));
            n0VarG.f68237c = 0;
            n0VarG.f68238d = 0;
            n0VarG.f68239e = 0;
            n0VarG.f68240f = -1;
            n0VarG.f68241g.clear();
        } else {
            z14 = false;
        }
        c2.j.e eVar = this.f68320h;
        c2.j.l lVar = this.f68319g;
        if (z26) {
            if (lVar == null) {
                b2.e.b("null verticalArrangement when isVertical == true");
                o2.c.f();
                return null;
            }
            f22711d = lVar.getF22711d();
        } else {
            if (eVar == null) {
                b2.e.b("null horizontalArrangement when isVertical == false");
                o2.c.f();
                return null;
            }
            f22711d = eVar.getF22711d();
        }
        int iF4 = k2Var2.f0(f22711d);
        int itemCount = nVarInvoke.getItemCount();
        int i85 = z26 ? g6.a.i(j8) - i77 : g6.a.j(j8) - i78;
        boolean z28 = this.f68316d;
        if (!z28 || i85 > 0) {
            j14 = (((long) iF0) << 32) | (((long) iF2) & 4294967295L);
            g6.k.a aVar = g6.k.f76003b;
        } else {
            if (!z26) {
                iF0 += i85;
            }
            if (z26) {
                iF2 += i85;
            }
            j14 = (((long) iF2) & 4294967295L) | (((long) iF0) << 32);
            g6.k.a aVar2 = g6.k.f76003b;
        }
        int i86 = i85;
        int i87 = i14;
        u uVar4 = new u(nVarInvoke, s0Var, iF4, this.f68313a, this.f68314b, z28, i87, i84, j14);
        v vVar2 = new v(this.f68314b, l0VarA, itemCount, iF4, uVar4, n0VarG);
        e52.b bVar = new e52.b(10, n0VarG, vVar2);
        ds0.g gVar = new ds0.g(n0VarG, 29);
        f4.f.f68735e.getClass();
        f4.f fVarA = f4.f.a.a();
        e23.l<Object, Unit> f68799i = fVarA != null ? fVarA.getF68799i() : null;
        f4.f fVarB = f4.f.a.b(fVarA);
        try {
            int iG3 = p0Var2.g();
            k0 k0Var = p0Var2.f68264d;
            int iE = g2.p.e(iG3, nVarInvoke, k0Var.f68227d);
            if (iG3 != iE) {
                k0Var.f68224a.t(iE);
                k0Var.f68228e.a(iG3);
            }
            if (iE < itemCount || itemCount <= 0) {
                iC = n0VarG.c(iE);
                iH = p0Var2.h();
            } else {
                iC = n0VarG.c(itemCount - 1);
                iH = 0;
            }
            Unit unit = Unit.INSTANCE;
            f4.f.a.e(fVarA, fVarB, f68799i);
            List<Integer> listA = g2.s.a(nVarInvoke, p0Var2.f68277q, p0Var2.f68274n);
            float fFloatValue = (k2Var2.t1() || !z25) ? p0Var2.f68267g : ((Number) p0Var2.f68282v.f75057b.f155628b.getF182175a()).floatValue();
            g2.b0<a0> b0Var = p0Var2.f68273m;
            boolean zT1 = k2Var2.t1();
            z zVar2 = p0Var2.f68263c;
            p1<Unit> p1Var = p0Var2.f68278r;
            if (i87 < 0) {
                b2.e.a("negative beforeContentPadding");
            }
            if (i84 < 0) {
                b2.e.a("negative afterContentPadding");
            }
            n nVar = uVar4.f68175b;
            boolean z29 = this.f68314b;
            int i88 = iC;
            boolean z34 = this.f68316d;
            o53.b0 b0Var2 = this.f68321i;
            o4.q0 q0Var = this.f68322j;
            if (itemCount <= 0) {
                int iL = g6.a.l(jI);
                int iK = g6.a.k(jI);
                b0Var.d(0, iL, iK, new ArrayList(), nVar.getF68258c(), uVar4, z29, zT1, length4, z25, 0, 0, b0Var2, q0Var);
                if (!zT1) {
                    long jB2 = b0Var.b();
                    g6.m.f76012b.getClass();
                    if (!g6.m.c(jB2, 0L)) {
                        iL = g6.b.g((int) (jB2 >> 32), jI);
                        iK = g6.b.f((int) (jB2 & 4294967295L), jI);
                    }
                }
                ep0.a aVar3 = new ep0.a(26);
                int iG4 = g6.b.g(iL + i78, j8);
                int iF5 = g6.b.f(iK + i77, j8);
                p13.k0 k0Var2 = p13.k0.f134949a;
                k0Var2.getClass();
                a1 a1VarH1 = k2Var2.H1(iG4, iF5, k0Var2, aVar3);
                int i89 = i86 + i84;
                k2Var = k2Var2;
                p0Var = p0Var2;
                vVar = vVar2;
                zVar = new z(null, 0, false, 0.0f, a1VarH1, 0.0f, false, b0Var2, s0Var, length4, bVar, gVar, p13.j0.f134944a, -i87, i89, 0, z34, z29 ? p008y1.b2.Vertical : p008y1.b2.Horizontal, i84, iF4);
                z24 = false;
            } else {
                p0Var = p0Var2;
                g2.b0<a0> b0Var3 = b0Var;
                vVar = vVar2;
                u uVar5 = uVar4;
                int i93 = i87;
                int iRound = Math.round(fFloatValue);
                int i94 = iH - iRound;
                if (i88 == 0 && i94 < 0) {
                    iRound += i94;
                    i94 = 0;
                }
                p13.k kVar = new p13.k();
                int i95 = -i93;
                int i96 = i94;
                int i97 = i95 + (iF4 < 0 ? iF4 : 0);
                float f14 = fFloatValue;
                int i98 = i96 + i97;
                while (i98 < 0 && i88 > 0) {
                    int i99 = i95;
                    int i100 = i88 - 1;
                    g2.b0<a0> b0Var4 = b0Var3;
                    c0 c0VarC = vVar.c(i100);
                    i88 = i100;
                    kVar.add(0, c0VarC);
                    i98 += c0VarC.f68186h;
                    b0Var3 = b0Var4;
                    i95 = i99;
                }
                int i101 = i95;
                g2.b0<a0> b0Var5 = b0Var3;
                if (i98 < i97) {
                    iRound -= i97 - i98;
                    i98 = i97;
                }
                int i102 = iRound;
                int i103 = i98 - i97;
                int i104 = i86 + i84;
                int i105 = i104 >= 0 ? i104 : 0;
                int i106 = i103;
                int i107 = -i103;
                int i108 = i88;
                int i109 = 0;
                boolean z35 = false;
                while (i109 < kVar.f134948c) {
                    if (i107 >= i105) {
                        kVar.b(i109);
                        Unit unit2 = Unit.INSTANCE;
                        z35 = true;
                    } else {
                        i108++;
                        i107 += ((c0) kVar.get(i109)).f68186h;
                        i109++;
                    }
                }
                int i110 = i108;
                boolean z36 = z35;
                while (true) {
                    if (i110 >= itemCount || (i107 >= i105 && i107 > 0 && !kVar.isEmpty())) {
                        z15 = z36;
                        break;
                    }
                    int i111 = i105;
                    c0 c0VarC2 = vVar.c(i110);
                    int i112 = i110;
                    a0[] a0VarArr3 = c0VarC2.f68180b;
                    z15 = z36;
                    int i113 = c0VarC2.f68186h;
                    if (a0VarArr3.length == 0) {
                        break;
                    }
                    i107 += i113;
                    if (i107 > i97 || ((a0) p13.u.Q(a0VarArr3)).f68148a == itemCount - 1) {
                        kVar.addLast(c0VarC2);
                        z36 = z15;
                    } else {
                        i106 -= i113;
                        Unit unit3 = Unit.INSTANCE;
                        i88 = i112 + 1;
                        z36 = true;
                    }
                    i110 = i112 + 1;
                    i105 = i111;
                }
                if (i107 < i86) {
                    int i114 = i86 - i107;
                    int i115 = i107 + i114;
                    i18 = i106 - i114;
                    while (i18 < i93 && i88 > 0) {
                        int i116 = i88 - 1;
                        c0 c0VarC3 = vVar.c(i116);
                        kVar.add(0, c0VarC3);
                        i18 += c0VarC3.f68186h;
                        i88 = i116;
                        i93 = i93;
                    }
                    i15 = i93;
                    i17 = i114 + i102;
                    if (i18 < 0) {
                        i17 += i18;
                        i16 = i115 + i18;
                        i18 = 0;
                    } else {
                        i16 = i115;
                    }
                } else {
                    i15 = i93;
                    i16 = i107;
                    i17 = i102;
                    i18 = i106;
                }
                float f15 = (Integer.signum(Math.round(f14)) != Integer.signum(i17) || Math.abs(Math.round(f14)) < Math.abs(i17)) ? f14 : i17;
                float f16 = f14 - f15;
                float f17 = 0.0f;
                if (zT1 && i17 > i102 && f16 <= 0.0f) {
                    f17 = (i17 - i102) + f16;
                }
                float f18 = f17;
                if (i18 < 0) {
                    b2.e.a("negative initial offset");
                }
                int i117 = -i18;
                c0 c0Var3 = (c0) kVar.e();
                int i118 = (c0Var3 == null || (a0VarArr2 = c0Var3.f68180b) == null || (a0Var2 = (a0) p13.u.H(a0VarArr2)) == null) ? 0 : a0Var2.f68148a;
                c0 c0Var4 = (c0) kVar.h();
                if (c0Var4 == null || (a0VarArr = c0Var4.f68180b) == null) {
                    c0Var = c0Var3;
                } else {
                    c0Var = c0Var3;
                    a0 a0Var3 = a0VarArr.length == 0 ? null : a0VarArr[a0VarArr.length - 1];
                    i19 = a0Var3 != null ? a0Var3.f68148a : 0;
                    size = listA.size();
                    i24 = i18;
                    arrayList = null;
                    i25 = 0;
                    while (true) {
                        n0Var = vVar.f68196f;
                        if (i25 < size) {
                            break;
                        }
                        int i119 = size;
                        iIntValue2 = listA.get(i25).intValue();
                        if (iIntValue2 < 0 && iIntValue2 < i118) {
                            int i120 = n0Var.f68243i;
                            int iE2 = n0Var.e(iIntValue2);
                            a0 a0VarD = uVar5.d(iIntValue2, 0, iE2, uVar5.f68177d, vVar.a(0, iE2));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            List list5 = arrayList;
                            list5.add(a0VarD);
                            arrayList = list5;
                        }
                        i25++;
                        i118 = i118;
                        size = i119;
                    }
                    i26 = i118;
                    if (arrayList == null) {
                        arrayList = p13.j0.f134944a;
                    }
                    list = arrayList;
                    if (zT1 || zVar2 == null) {
                        i27 = i19;
                        list2 = null;
                    } else {
                        List<a0> list6 = zVar2.f68336m;
                        if (list6.isEmpty()) {
                            i27 = i19;
                        } else {
                            int size9 = list6.size() - 1;
                            int i121 = -1;
                            while (true) {
                                if (i121 >= size9) {
                                    a0Var = null;
                                    break;
                                }
                                int i122 = i121;
                                if (list6.get(size9).getF62559a() > i19 && (size9 == 0 || list6.get(size9 - 1).getF62559a() <= i19)) {
                                    a0Var = list6.get(size9);
                                    break;
                                }
                                size9--;
                                i121 = i122;
                            }
                            m mVar = (m) p13.h0.m0(list6);
                            c0 c0Var5 = (c0) p13.h0.n0(kVar);
                            int i123 = c0Var5 != null ? c0Var5.f68179a + 1 : 0;
                            if (a0Var != null) {
                                int f62559a = a0Var.getF62559a();
                                i27 = i19;
                                int iMin = Math.min(mVar.getF62559a(), itemCount - 1);
                                if (f62559a <= iMin) {
                                    ArrayList arrayList5 = null;
                                    while (true) {
                                        if (arrayList5 != null) {
                                            int size10 = arrayList5.size();
                                            f15 = f15;
                                            int i124 = 0;
                                            while (true) {
                                                if (i124 < size10) {
                                                    int i125 = size10;
                                                    a0[] a0VarArr4 = ((c0) arrayList5.get(i124)).f68180b;
                                                    ArrayList arrayList6 = arrayList5;
                                                    int length5 = a0VarArr4.length;
                                                    int i126 = 0;
                                                    while (true) {
                                                        if (i126 < length5) {
                                                            int i127 = i126;
                                                            if (a0VarArr4[i127].f68148a == f62559a) {
                                                                arrayList5 = arrayList6;
                                                            } else {
                                                                i126 = i127 + 1;
                                                            }
                                                        } else {
                                                            i124++;
                                                            arrayList5 = arrayList6;
                                                            size10 = i125;
                                                        }
                                                    }
                                                }
                                                if (f62559a != iMin) {
                                                    break;
                                                }
                                                f62559a++;
                                                f15 = f15;
                                            }
                                        } else {
                                            f15 = f15;
                                        }
                                        ArrayList arrayList7 = arrayList5;
                                        arrayList5 = arrayList7 == null ? new ArrayList() : arrayList7;
                                        c0 c0VarC4 = vVar.c(i123);
                                        i123++;
                                        arrayList5.add(c0VarC4);
                                        if (f62559a != iMin) {
                                            break;
                                            break;
                                        }
                                        f62559a++;
                                        f15 = f15;
                                    }
                                    list2 = arrayList5;
                                }
                            } else {
                                i27 = i19;
                            }
                        }
                        list2 = null;
                    }
                    if (list2 == null) {
                        list2 = p13.j0.f134944a;
                    }
                    size2 = listA.size();
                    arrayList2 = null;
                    i28 = 0;
                    while (i28 < size2) {
                        iIntValue = listA.get(i28).intValue();
                        if (i27 + 1 <= iIntValue || iIntValue >= itemCount) {
                            i76 = size2;
                            list4 = listA;
                        } else {
                            if (zT1) {
                                int size11 = list2.size();
                                i76 = size2;
                                int i128 = 0;
                                while (true) {
                                    if (i128 < size11) {
                                        int i129 = i128;
                                        a0[] a0VarArr5 = ((c0) list2.get(i128)).f68180b;
                                        list4 = listA;
                                        int length6 = a0VarArr5.length;
                                        int i130 = 0;
                                        while (true) {
                                            if (i130 < length6) {
                                                int i131 = i130;
                                                if (a0VarArr5[i131].f68148a != iIntValue) {
                                                    i130 = i131 + 1;
                                                }
                                            } else {
                                                i128 = i129 + 1;
                                                listA = list4;
                                            }
                                        }
                                    }
                                }
                            } else {
                                i76 = size2;
                            }
                            list4 = listA;
                            int i132 = n0Var.f68243i;
                            int iE3 = n0Var.e(iIntValue);
                            uVar3 = uVar5;
                            a0 a0VarD2 = uVar3.d(iIntValue, 0, iE3, uVar5.f68177d, vVar.a(0, iE3));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(a0VarD2);
                            i28++;
                            size2 = i76;
                            uVar5 = uVar3;
                            listA = list4;
                        }
                        uVar3 = uVar5;
                        i28++;
                        size2 = i76;
                        uVar5 = uVar3;
                        listA = list4;
                    }
                    uVar = uVar5;
                    if (arrayList2 == null) {
                        arrayList2 = p13.j0.f134944a;
                    }
                    if (i15 > 0 || iF4 < 0) {
                        f97124f = kVar.getF97124f();
                        i29 = i24;
                        i30 = 0;
                        while (i30 < f97124f) {
                            int i133 = ((c0) kVar.get(i30)).f68186h;
                            if (i29 != 0 || i133 > i29 || i30 == kVar.getF97124f() - 1) {
                                break;
                            }
                            i29 -= i133;
                            i30++;
                            c0Var = (c0) kVar.get(i30);
                        }
                    } else {
                        i29 = i24;
                    }
                    c0 c0Var6 = c0Var;
                    if (z29) {
                        iG = g6.a.j(jI);
                        j15 = jI;
                    } else {
                        j15 = jI;
                        iG = g6.b.g(i16, j15);
                    }
                    i34 = iG;
                    if (z29) {
                        i35 = g6.b.f(i16, j15);
                    } else {
                        i35 = g6.a.i(j15);
                    }
                    i36 = i35;
                    list3 = kVar;
                    if (!list2.isEmpty()) {
                        arrayListC0 = p13.h0.C0(kVar, list2);
                    }
                    if (z29) {
                        list3 = arrayListC0;
                        i37 = i36;
                    } else {
                        list3 = arrayListC0;
                        i37 = i34;
                    }
                    if (i16 < Math.min(i37, i86)) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (z16 && i117 != 0) {
                        b2.e.c("non-zero firstLineScrollOffset");
                    }
                    size3 = list3.size();
                    z17 = z16;
                    j16 = j15;
                    length = 0;
                    for (i38 = 0; i38 < size3; i38++) {
                        length += ((c0) list3.get(i38)).f68180b.length;
                    }
                    arrayList3 = new ArrayList(length);
                    if (z17) {
                        if (list.isEmpty() || !arrayList2.isEmpty()) {
                            b2.e.a("no items");
                        }
                        size8 = list3.size();
                        iArr = new int[size8];
                        for (i64 = 0; i64 < size8; i64++) {
                            if (z34) {
                                i75 = (size8 - i64) - 1;
                            } else {
                                i75 = i64;
                            }
                            iArr[i64] = ((c0) list3.get(i75)).f68185g;
                        }
                        iArr2 = new int[size8];
                        if (z29) {
                            if (lVar != null) {
                                b2.e.b("null verticalArrangement");
                                o2.c.f();
                                return null;
                            }
                            lVar.c(s0Var, i37, iArr, iArr2);
                        } else {
                            if (eVar != 0) {
                                b2.e.b("null horizontalArrangement");
                                o2.c.f();
                                return null;
                            }
                            eVar.b(s0Var, i37, iArr, g6.o.Ltr, iArr2);
                        }
                        lVarI = p13.u.I(iArr2);
                        jVarM = lVarI;
                        if (z34) {
                            jVarM = j23.t.m(lVarI);
                        }
                        i65 = jVarM.f96796a;
                        i66 = jVarM.f96797b;
                        i67 = jVarM.f96798c;
                        if ((i67 > 0 && i65 <= i66) || (i67 < 0 && i66 <= i65)) {
                            while (true) {
                                i68 = iArr2[i65];
                                if (z34) {
                                    i69 = (size8 - i65) - 1;
                                } else {
                                    i69 = i65;
                                }
                                c0Var2 = (c0) list3.get(i69);
                                if (z34) {
                                    i68 = (i37 - i68) - c0Var2.f68185g;
                                }
                                a0VarArrA2 = c0Var2.a(i68, i34, i36);
                                length3 = a0VarArrA2.length;
                                i74 = 0;
                                while (i74 < length3) {
                                    a0[] a0VarArr6 = a0VarArrA2;
                                    arrayList3.add(a0VarArr6[i74]);
                                    i74++;
                                    a0VarArrA2 = a0VarArr6;
                                }
                                if (i65 == i66) {
                                    break;
                                }
                                i65 += i67;
                                i37 = i37;
                                i67 = i67;
                            }
                        }
                    } else {
                        i15 = i15;
                        j16 = j16;
                        i27 = i27;
                        i26 = i26;
                        size4 = list.size() - 1;
                        if (size4 >= 0) {
                            i47 = i117;
                            while (true) {
                                i48 = size4 - 1;
                                a0 a0Var4 = (a0) list.get(size4);
                                i47 -= a0Var4.f68164q;
                                a0Var4.c(i47, 0, i34, i36);
                                arrayList3.add(a0Var4);
                                if (i48 < 0) {
                                    break;
                                }
                                size4 = i48;
                            }
                        }
                        size5 = list3.size();
                        i39 = i117;
                        i44 = 0;
                        while (i44 < size5) {
                            c0 c0Var7 = (c0) list3.get(i44);
                            a0VarArrA = c0Var7.a(i39, i34, i36);
                            length2 = a0VarArrA.length;
                            int i134 = size5;
                            i46 = 0;
                            while (i46 < length2) {
                                int i135 = i46;
                                arrayList3.add(a0VarArrA[i135]);
                                i46 = i135 + 1;
                            }
                            i39 += c0Var7.f68186h;
                            i44++;
                            size5 = i134;
                        }
                        size6 = arrayList2.size();
                        for (i45 = 0; i45 < size6; i45++) {
                            a0 a0Var5 = (a0) arrayList2.get(i45);
                            a0Var5.c(i39, 0, i34, i36);
                            arrayList3.add(a0Var5);
                            i39 += a0Var5.f68164q;
                        }
                    }
                    int i136 = i29;
                    int i137 = i16;
                    b0Var5.d((int) f15, i34, i36, arrayList3, nVar.getF68258c(), uVar, z29, zT1, length4, z25, i136, i137, b0Var2, q0Var);
                    z18 = zT1;
                    i49 = length4;
                    if (z18) {
                        uVar2 = uVar;
                    } else {
                        jB = b0Var5.b();
                        g6.m.f76012b.getClass();
                        if (g6.m.c(jB, 0L)) {
                            uVar2 = uVar;
                        } else {
                            if (z29) {
                                i57 = i36;
                            } else {
                                i57 = i34;
                            }
                            i49 = i49;
                            z18 = z18;
                            long j17 = j16;
                            iG2 = g6.b.g(Math.max(i34, (int) (jB >> 32)), j17);
                            iF = g6.b.f(Math.max(i36, (int) (jB & 4294967295L)), j17);
                            if (z29) {
                                i58 = iF;
                            } else {
                                i58 = iG2;
                            }
                            if (i58 != i57) {
                                size7 = arrayList3.size();
                                for (i59 = 0; i59 < size7; i59++) {
                                    a0 a0Var6 = (a0) arrayList3.get(i59);
                                    a0Var6.f68165r = i58;
                                    a0Var6.f68167t = a0Var6.f68155h + i58;
                                }
                            }
                            i55 = iG2;
                            i54 = iF;
                        }
                        int i138 = i26;
                        i56 = i27;
                        List listD = g2.p.d(this.f68323k, i138, i56, arrayList3, nVar.b(), i15, i84, i55, i54, new e52.b(11, vVar, uVar2));
                        int i139 = i55;
                        int i140 = i54;
                        if (i56 == itemCount - 1 || i137 > i86) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        e2.w wVar = new e2.w(p1Var, arrayList3, listD, z18, 1);
                        float f19 = f15;
                        boolean z37 = z19;
                        int iG5 = g6.b.g(i139 + i78, j8);
                        int iF6 = g6.b.f(i140 + i77, j8);
                        p13.k0 k0Var3 = p13.k0.f134949a;
                        k0Var3.getClass();
                        a1 a1VarH2 = k2Var2.H1(iG5, iF6, k0Var3, wVar);
                        List listH = g2.p.h(i138, i56, arrayList3, listD);
                        if (z29) {
                            b2Var = p008y1.b2.Vertical;
                        } else {
                            b2Var = p008y1.b2.Horizontal;
                        }
                        p008y1.b2 b2Var2 = b2Var;
                        k2Var = k2Var2;
                        z24 = false;
                        zVar = new z(c0Var6, i136, z37, f19, a1VarH2, f18, z15, b0Var2, s0Var, i49, bVar, gVar, listH, i101, i104, itemCount, z34, b2Var2, i84, iF4);
                    }
                    i54 = i36;
                    i55 = i34;
                    int i1310 = i26;
                    i56 = i27;
                    List listD2 = g2.p.d(this.f68323k, i1310, i56, arrayList3, nVar.b(), i15, i84, i55, i54, new e52.b(11, vVar, uVar2));
                    int i1311 = i55;
                    int i141 = i54;
                    if (i56 == itemCount - 1) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    e2.w wVar2 = new e2.w(p1Var, arrayList3, listD2, z18, 1);
                    float f110 = f15;
                    boolean z38 = z19;
                    int iG6 = g6.b.g(i1311 + i78, j8);
                    int iF7 = g6.b.f(i141 + i77, j8);
                    p13.k0 k0Var4 = p13.k0.f134949a;
                    k0Var4.getClass();
                    a1 a1VarH3 = k2Var2.H1(iG6, iF7, k0Var4, wVar2);
                    List listH2 = g2.p.h(i1310, i56, arrayList3, listD2);
                    if (z29) {
                        b2Var = p008y1.b2.Vertical;
                    } else {
                        b2Var = p008y1.b2.Horizontal;
                    }
                    p008y1.b2 b2Var3 = b2Var;
                    k2Var = k2Var2;
                    z24 = false;
                    zVar = new z(c0Var6, i136, z38, f110, a1VarH3, f18, z15, b0Var2, s0Var, i49, bVar, gVar, listH2, i101, i104, itemCount, z34, b2Var3, i84, iF4);
                }
                size = listA.size();
                i24 = i18;
                arrayList = null;
                i25 = 0;
                while (true) {
                    n0Var = vVar.f68196f;
                    if (i25 < size) {
                        break;
                        break;
                    }
                    int i1110 = size;
                    iIntValue2 = listA.get(i25).intValue();
                    if (iIntValue2 < 0) {
                    }
                    i25++;
                    i118 = i118;
                    size = i1110;
                }
                i26 = i118;
                if (arrayList == null) {
                    arrayList = p13.j0.f134944a;
                }
                list = arrayList;
                if (zT1) {
                    i27 = i19;
                    list2 = null;
                } else {
                    i27 = i19;
                    list2 = null;
                }
                if (list2 == null) {
                    list2 = p13.j0.f134944a;
                }
                size2 = listA.size();
                arrayList2 = null;
                i28 = 0;
                while (i28 < size2) {
                    iIntValue = listA.get(i28).intValue();
                    if (i27 + 1 <= iIntValue) {
                        i76 = size2;
                        list4 = listA;
                        uVar3 = uVar5;
                    } else {
                        i76 = size2;
                        list4 = listA;
                        uVar3 = uVar5;
                    }
                    i28++;
                    size2 = i76;
                    uVar5 = uVar3;
                    listA = list4;
                }
                uVar = uVar5;
                if (arrayList2 == null) {
                    arrayList2 = p13.j0.f134944a;
                }
                if (i15 > 0) {
                    f97124f = kVar.getF97124f();
                    i29 = i24;
                    i30 = 0;
                    while (i30 < f97124f) {
                        int i1312 = ((c0) kVar.get(i30)).f68186h;
                        if (i29 != 0) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                }
                f97124f = kVar.getF97124f();
                i29 = i24;
                i30 = 0;
                while (i30 < f97124f) {
                    int i1313 = ((c0) kVar.get(i30)).f68186h;
                    if (i29 != 0) {
                        break;
                    }
                    break;
                }
                c0 c0Var8 = c0Var;
                if (z29) {
                    iG = g6.a.j(jI);
                    j15 = jI;
                } else {
                    j15 = jI;
                    iG = g6.b.g(i16, j15);
                }
                i34 = iG;
                if (z29) {
                    i35 = g6.b.f(i16, j15);
                } else {
                    i35 = g6.a.i(j15);
                }
                i36 = i35;
                list3 = kVar;
                if (!list2.isEmpty()) {
                    arrayListC0 = p13.h0.C0(kVar, list2);
                }
                if (z29) {
                    list3 = arrayListC0;
                    i37 = i36;
                } else {
                    list3 = arrayListC0;
                    i37 = i34;
                }
                if (i16 < Math.min(i37, i86)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    b2.e.c("non-zero firstLineScrollOffset");
                }
                size3 = list3.size();
                z17 = z16;
                j16 = j15;
                length = 0;
                while (i38 < size3) {
                    length += ((c0) list3.get(i38)).f68180b.length;
                }
                arrayList3 = new ArrayList(length);
                if (z17) {
                    if (list.isEmpty()) {
                        b2.e.a("no items");
                    } else {
                        b2.e.a("no items");
                    }
                    size8 = list3.size();
                    iArr = new int[size8];
                    while (i64 < size8) {
                        if (z34) {
                            i75 = i64;
                        } else {
                            i75 = (size8 - i64) - 1;
                        }
                        iArr[i64] = ((c0) list3.get(i75)).f68185g;
                    }
                    iArr2 = new int[size8];
                    if (z29) {
                        if (lVar != null) {
                            b2.e.b("null verticalArrangement");
                            o2.c.f();
                            return null;
                        }
                        lVar.c(s0Var, i37, iArr, iArr2);
                    } else {
                        if (eVar != 0) {
                            b2.e.b("null horizontalArrangement");
                            o2.c.f();
                            return null;
                        }
                        eVar.b(s0Var, i37, iArr, g6.o.Ltr, iArr2);
                    }
                    lVarI = p13.u.I(iArr2);
                    jVarM = lVarI;
                    if (z34) {
                        jVarM = j23.t.m(lVarI);
                    }
                    i65 = jVarM.f96796a;
                    i66 = jVarM.f96797b;
                    i67 = jVarM.f96798c;
                    if (i67 > 0) {
                        while (true) {
                            i68 = iArr2[i65];
                            if (z34) {
                                i69 = i65;
                            } else {
                                i69 = (size8 - i65) - 1;
                            }
                            c0Var2 = (c0) list3.get(i69);
                            if (z34) {
                                i68 = (i37 - i68) - c0Var2.f68185g;
                            }
                            a0VarArrA2 = c0Var2.a(i68, i34, i36);
                            length3 = a0VarArrA2.length;
                            i74 = 0;
                            while (i74 < length3) {
                                a0[] a0VarArr7 = a0VarArrA2;
                                arrayList3.add(a0VarArr7[i74]);
                                i74++;
                                a0VarArrA2 = a0VarArr7;
                            }
                            if (i65 == i66) {
                                break;
                                break;
                            }
                            i65 += i67;
                            i37 = i37;
                            i67 = i67;
                        }
                    } else {
                        while (true) {
                            i68 = iArr2[i65];
                            if (z34) {
                                i69 = i65;
                            } else {
                                i69 = (size8 - i65) - 1;
                            }
                            c0Var2 = (c0) list3.get(i69);
                            if (z34) {
                                i68 = (i37 - i68) - c0Var2.f68185g;
                            }
                            a0VarArrA2 = c0Var2.a(i68, i34, i36);
                            length3 = a0VarArrA2.length;
                            i74 = 0;
                            while (i74 < length3) {
                                a0[] a0VarArr8 = a0VarArrA2;
                                arrayList3.add(a0VarArr8[i74]);
                                i74++;
                                a0VarArrA2 = a0VarArr8;
                            }
                            if (i65 == i66) {
                                break;
                                break;
                            }
                            i65 += i67;
                            i37 = i37;
                            i67 = i67;
                        }
                    }
                } else {
                    i15 = i15;
                    j16 = j16;
                    i27 = i27;
                    i26 = i26;
                    size4 = list.size() - 1;
                    if (size4 >= 0) {
                        i47 = i117;
                        while (true) {
                            i48 = size4 - 1;
                            a0 a0Var7 = (a0) list.get(size4);
                            i47 -= a0Var7.f68164q;
                            a0Var7.c(i47, 0, i34, i36);
                            arrayList3.add(a0Var7);
                            if (i48 < 0) {
                                break;
                                break;
                            }
                            size4 = i48;
                        }
                    }
                    size5 = list3.size();
                    i39 = i117;
                    i44 = 0;
                    while (i44 < size5) {
                        c0 c0Var9 = (c0) list3.get(i44);
                        a0VarArrA = c0Var9.a(i39, i34, i36);
                        length2 = a0VarArrA.length;
                        int i1314 = size5;
                        i46 = 0;
                        while (i46 < length2) {
                            int i1315 = i46;
                            arrayList3.add(a0VarArrA[i1315]);
                            i46 = i1315 + 1;
                        }
                        i39 += c0Var9.f68186h;
                        i44++;
                        size5 = i1314;
                    }
                    size6 = arrayList2.size();
                    while (i45 < size6) {
                        a0 a0Var8 = (a0) arrayList2.get(i45);
                        a0Var8.c(i39, 0, i34, i36);
                        arrayList3.add(a0Var8);
                        i39 += a0Var8.f68164q;
                    }
                }
                int i1316 = i29;
                int i1317 = i16;
                b0Var5.d((int) f15, i34, i36, arrayList3, nVar.getF68258c(), uVar, z29, zT1, length4, z25, i1316, i1317, b0Var2, q0Var);
                z18 = zT1;
                i49 = length4;
                if (z18) {
                    jB = b0Var5.b();
                    g6.m.f76012b.getClass();
                    if (g6.m.c(jB, 0L)) {
                        if (z29) {
                            i57 = i36;
                        } else {
                            i57 = i34;
                        }
                        i49 = i49;
                        z18 = z18;
                        long j18 = j16;
                        iG2 = g6.b.g(Math.max(i34, (int) (jB >> 32)), j18);
                        iF = g6.b.f(Math.max(i36, (int) (jB & 4294967295L)), j18);
                        if (z29) {
                            i58 = iF;
                        } else {
                            i58 = iG2;
                        }
                        if (i58 != i57) {
                            size7 = arrayList3.size();
                            while (i59 < size7) {
                                a0 a0Var9 = (a0) arrayList3.get(i59);
                                a0Var9.f68165r = i58;
                                a0Var9.f68167t = a0Var9.f68155h + i58;
                            }
                        }
                        i55 = iG2;
                        i54 = iF;
                    } else {
                        uVar2 = uVar;
                    }
                    int i1318 = i26;
                    i56 = i27;
                    List listD3 = g2.p.d(this.f68323k, i1318, i56, arrayList3, nVar.b(), i15, i84, i55, i54, new e52.b(11, vVar, uVar2));
                    int i1319 = i55;
                    int i142 = i54;
                    if (i56 == itemCount - 1) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    e2.w wVar3 = new e2.w(p1Var, arrayList3, listD3, z18, 1);
                    float f111 = f15;
                    boolean z39 = z19;
                    int iG7 = g6.b.g(i1319 + i78, j8);
                    int iF8 = g6.b.f(i142 + i77, j8);
                    p13.k0 k0Var5 = p13.k0.f134949a;
                    k0Var5.getClass();
                    a1 a1VarH4 = k2Var2.H1(iG7, iF8, k0Var5, wVar3);
                    List listH3 = g2.p.h(i1318, i56, arrayList3, listD3);
                    if (z29) {
                        b2Var = p008y1.b2.Vertical;
                    } else {
                        b2Var = p008y1.b2.Horizontal;
                    }
                    p008y1.b2 b2Var4 = b2Var;
                    k2Var = k2Var2;
                    z24 = false;
                    zVar = new z(c0Var8, i1316, z39, f111, a1VarH4, f18, z15, b0Var2, s0Var, i49, bVar, gVar, listH3, i101, i104, itemCount, z34, b2Var4, i84, iF4);
                } else {
                    uVar2 = uVar;
                }
                i54 = i36;
                i55 = i34;
                int i13110 = i26;
                i56 = i27;
                List listD4 = g2.p.d(this.f68323k, i13110, i56, arrayList3, nVar.b(), i15, i84, i55, i54, new e52.b(11, vVar, uVar2));
                int i13111 = i55;
                int i143 = i54;
                if (i56 == itemCount - 1) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                e2.w wVar4 = new e2.w(p1Var, arrayList3, listD4, z18, 1);
                float f112 = f15;
                boolean z310 = z19;
                int iG8 = g6.b.g(i13111 + i78, j8);
                int iF9 = g6.b.f(i143 + i77, j8);
                p13.k0 k0Var6 = p13.k0.f134949a;
                k0Var6.getClass();
                a1 a1VarH5 = k2Var2.H1(iG8, iF9, k0Var6, wVar4);
                List listH4 = g2.p.h(i13110, i56, arrayList3, listD4);
                if (z29) {
                    b2Var = p008y1.b2.Vertical;
                } else {
                    b2Var = p008y1.b2.Horizontal;
                }
                p008y1.b2 b2Var5 = b2Var;
                k2Var = k2Var2;
                z24 = false;
                zVar = new z(c0Var8, i1316, z310, f112, a1VarH5, f18, z15, b0Var2, s0Var, i49, bVar, gVar, listH4, i101, i104, itemCount, z34, b2Var5, i84, iF4);
            }
            p0 p0Var3 = p0Var;
            p0Var3.f(zVar, k2Var.t1(), z24);
            Object obj = p0Var3.f68261a;
            g2.e eVar2 = obj instanceof g2.e ? (g2.e) obj : null;
            if (eVar2 == null) {
                return zVar;
            }
            List<a0> list7 = zVar.f68336m;
            Trace.beginSection("compose:lazy:cache_window:keepAroundItems");
            try {
                if (eVar2.g() && !list7.isEmpty()) {
                    m mVar2 = (m) p13.h0.b0(list7);
                    p008y1.b2 b2Var6 = p008y1.b2.Vertical;
                    p008y1.b2 b2Var7 = zVar.f68341r;
                    int f68170w = b2Var7 == b2Var6 ? mVar2.getF68170w() : mVar2.getF68171x();
                    m mVar3 = (m) p13.h0.m0(list7);
                    int f68170w2 = b2Var7 == b2Var6 ? mVar3.getF68170w() : mVar3.getF68171x();
                    for (int i144 = eVar2.f75084i; i144 < f68170w; i144++) {
                        vVar.c(i144);
                    }
                    int i145 = f68170w2 + 1;
                    int i146 = eVar2.f75085j;
                    if (i145 <= i146) {
                        while (true) {
                            vVar.c(i145);
                            if (i145 == i146) {
                                break;
                            }
                            i145++;
                        }
                    }
                }
                Unit unit4 = Unit.INSTANCE;
                return zVar;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th3) {
            f4.f.a.e(fVarA, fVarB, f68799i);
            throw th3;
        }
    }
}
