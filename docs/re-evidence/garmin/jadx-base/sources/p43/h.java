package p43;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f135849a = new h();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f135851b;

        static {
            int[] iArr = new int[t43.t.values().length];
            try {
                iArr[t43.t.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t43.t.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t43.t.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f135850a = iArr;
            int[] iArr2 = new int[l1.b.values().length];
            try {
                iArr2[l1.b.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[l1.b.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[l1.b.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f135851b = iArr2;
        }
    }

    private h() {
    }

    public static final boolean a(t43.p pVar, t43.i iVar) {
        if (!pVar.s0(iVar)) {
            if (!(iVar instanceof t43.d)) {
                return false;
            }
            t43.c cVarL = pVar.L((t43.d) iVar);
            cVarL.getClass();
            t43.l lVarD0 = pVar.D0(cVarL);
            lVarD0.getClass();
            t43.h hVarP = pVar.p(lVarD0);
            if (hVarP == null || !pVar.s0(pVar.k(hVarP))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean b(t43.p pVar, l1 l1Var, t43.i iVar, t43.i iVar2, boolean z14) {
        Collection<t43.h> collectionJ = pVar.J(iVar);
        if ((collectionJ instanceof Collection) && collectionJ.isEmpty()) {
            return false;
        }
        for (t43.h hVar : collectionJ) {
            hVar.getClass();
            if (p005kotlin.jvm.internal.s.g(pVar.G(hVar), pVar.F0(iVar2))) {
                return true;
            }
            if (z14 && j(f135849a, l1Var, iVar2, hVar)) {
                return true;
            }
        }
        return false;
    }

    public static List c(l1 l1Var, t43.p pVar, t43.i iVar, t43.m mVar) {
        l1.c cVarQ0;
        pVar.l(iVar, mVar);
        if (!pVar.Y(mVar) && pVar.E(iVar)) {
            return p13.j0.f134944a;
        }
        if (pVar.u(mVar)) {
            if (!pVar.P(pVar.F0(iVar), mVar)) {
                return p13.j0.f134944a;
            }
            t43.i iVarA = pVar.A(iVar, t43.b.FOR_SUBTYPING);
            if (iVarA != null) {
                iVar = iVarA;
            }
            return p13.w.c(iVar);
        }
        z43.i iVar2 = new z43.i();
        l1Var.c();
        t43.p pVar2 = l1Var.f135870d;
        ArrayDeque<t43.i> arrayDeque = l1Var.f135874h;
        arrayDeque.getClass();
        z43.j jVar = l1Var.f135875i;
        jVar.getClass();
        arrayDeque.push(iVar);
        while (!arrayDeque.isEmpty()) {
            t43.i iVarPop = arrayDeque.pop();
            iVarPop.getClass();
            if (jVar.add(iVarPop)) {
                t43.i iVarA2 = pVar.A(iVarPop, t43.b.FOR_SUBTYPING);
                if (iVarA2 == null) {
                    iVarA2 = iVarPop;
                }
                if (pVar.P(pVar.F0(iVarA2), mVar)) {
                    iVar2.add(iVarA2);
                    cVarQ0 = l1.c.C2572c.f135882a;
                } else {
                    cVarQ0 = pVar.g(iVarA2) == 0 ? l1.c.b.f135881a : pVar2.q0(iVarA2);
                }
                if (p005kotlin.jvm.internal.s.g(cVarQ0, l1.c.C2572c.f135882a)) {
                    cVarQ0 = null;
                }
                if (cVarQ0 != null) {
                    Iterator<t43.h> it = pVar2.E0(pVar2.F0(iVarPop)).iterator();
                    while (it.hasNext()) {
                        arrayDeque.add(cVarQ0.a(l1Var, it.next()));
                    }
                }
            }
        }
        l1Var.a();
        return iVar2;
    }

    public static List d(l1 l1Var, t43.p pVar, t43.i iVar, t43.m mVar) {
        List listC = c(l1Var, pVar, iVar, mVar);
        if (listC.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listC) {
                t43.i iVar2 = (t43.i) obj;
                iVar2.getClass();
                t43.k kVarW0 = pVar.w0(iVar2);
                int iO = pVar.o(kVarW0);
                int i14 = 0;
                while (true) {
                    if (i14 >= iO) {
                        arrayList.add(obj);
                        break;
                    }
                    t43.l lVarZ = pVar.Z(kVarW0, i14);
                    lVarZ.getClass();
                    t43.h hVarP = pVar.p(lVarZ);
                    if ((hVarP != null ? pVar.y0(hVarP) : null) != null) {
                        break;
                    }
                    i14++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listC;
    }

    public static boolean f(l1 l1Var, t43.h hVar, t43.h hVar2) {
        l1Var.getClass();
        o oVar = l1Var.f135871e;
        p pVar = l1Var.f135872f;
        hVar.getClass();
        hVar2.getClass();
        t43.p pVar2 = l1Var.f135870d;
        if (hVar == hVar2) {
            return true;
        }
        h hVar3 = f135849a;
        hVar3.getClass();
        if (h(pVar2, hVar) && h(pVar2, hVar2)) {
            f2 f2VarA = oVar.a(pVar.a(hVar));
            f2 f2VarA2 = oVar.a(pVar.a(hVar2));
            t43.i iVarA0 = pVar2.A0(f2VarA);
            if (!pVar2.P(pVar2.G(f2VarA), pVar2.G(f2VarA2))) {
                return false;
            }
            if (pVar2.g(iVarA0) == 0) {
                return pVar2.W(f2VarA) || pVar2.W(f2VarA2) || pVar2.r(iVarA0) == pVar2.r(pVar2.A0(f2VarA2));
            }
        }
        return j(hVar3, l1Var, hVar, hVar2) && j(hVar3, l1Var, hVar2, hVar);
    }

    public static t43.n g(t43.p pVar, t43.h hVar, t43.i iVar) {
        t43.h hVarP;
        int iG = pVar.g(hVar);
        int i14 = 0;
        while (true) {
            if (i14 >= iG) {
                return null;
            }
            t43.l lVarH = pVar.h(hVar, i14);
            lVarH.getClass();
            t43.l lVar = pVar.H(lVarH) ? null : lVarH;
            if (lVar != null && (hVarP = pVar.p(lVar)) != null) {
                boolean z14 = pVar.a0(pVar.A0(hVarP)) && pVar.a0(pVar.A0(iVar));
                if (hVarP.equals(iVar) || (z14 && p005kotlin.jvm.internal.s.g(pVar.G(hVarP), pVar.G(iVar)))) {
                    t43.m mVarG = pVar.G(hVar);
                    mVarG.getClass();
                    return pVar.i(mVarG, i14);
                }
                t43.n nVarG = g(pVar, hVarP, iVar);
                if (nVarG != null) {
                    return nVarG;
                }
            }
            i14++;
        }
    }

    public static boolean h(t43.p pVar, t43.h hVar) {
        hVar.getClass();
        t43.m mVarG = pVar.G(hVar);
        mVarG.getClass();
        return (!pVar.e0(mVarG) || pVar.p0(hVar) || pVar.D(hVar) || pVar.C(hVar) || pVar.d0(hVar)) ? false : true;
    }

    public static boolean i(l1 l1Var, t43.p pVar, t43.k kVar, t43.i iVar) {
        boolean zF;
        l1Var.getClass();
        pVar.getClass();
        kVar.getClass();
        iVar.getClass();
        t43.m mVarF0 = pVar.F0(iVar);
        int iO = pVar.o(kVar);
        mVarF0.getClass();
        int iF = pVar.F(mVarF0);
        if (iO == iF && iO == pVar.g(iVar)) {
            for (int i14 = 0; i14 < iF; i14++) {
                t43.l lVarH = pVar.h(iVar, i14);
                lVarH.getClass();
                t43.h hVarP = pVar.p(lVarH);
                if (hVarP != null) {
                    t43.l lVarZ = pVar.Z(kVar, i14);
                    lVarZ.getClass();
                    pVar.n(lVarZ);
                    t43.t tVar = t43.t.INV;
                    t43.h hVarP2 = pVar.p(lVarZ);
                    hVarP2.getClass();
                    t43.t tVarQ = pVar.Q(pVar.i(mVarF0, i14));
                    t43.t tVarN = pVar.n(lVarH);
                    tVarQ.getClass();
                    tVarN.getClass();
                    if (tVarQ == tVar) {
                        tVarQ = tVarN;
                    } else if (tVarN != tVar && tVarQ != tVarN) {
                        tVarQ = null;
                    }
                    if (tVarQ == null) {
                        return l1Var.f135867a;
                    }
                    if (tVarQ != tVar || (!k(pVar, hVarP2, hVarP, mVarF0) && !k(pVar, hVarP, hVarP2, mVarF0))) {
                        int i15 = l1Var.f135873g;
                        if (i15 > 100) {
                            ds.e0.t(hVarP2, "Arguments depth is too high. Some related argument: ");
                            return false;
                        }
                        l1Var.f135873g = i15 + 1;
                        int i16 = a.f135850a[tVarQ.ordinal()];
                        h hVar = f135849a;
                        if (i16 == 1) {
                            hVar.getClass();
                            zF = f(l1Var, hVarP2, hVarP);
                        } else if (i16 == 2) {
                            zF = j(hVar, l1Var, hVarP2, hVarP);
                        } else {
                            if (i16 != 3) {
                                lc.u0.r();
                                return false;
                            }
                            zF = j(hVar, l1Var, hVarP, hVarP2);
                        }
                        l1Var.f135873g--;
                        if (!zF) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean j(h hVar, l1 l1Var, t43.h hVar2, t43.h hVar3) {
        hVar.getClass();
        l1Var.getClass();
        hVar2.getClass();
        hVar3.getClass();
        if (hVar2 == hVar3) {
            return true;
        }
        if (!l1Var.b(hVar2, hVar3)) {
            return false;
        }
        return f135849a.e(l1Var, l1Var.f135870d, hVar2, hVar3);
    }

    public static boolean k(t43.p pVar, t43.h hVar, t43.h hVar2, t43.m mVar) {
        t43.n nVarI;
        pVar.getClass();
        t43.i iVarT0 = pVar.t0(hVar);
        if (!(iVarT0 instanceof t43.d)) {
            return false;
        }
        t43.d dVar = (t43.d) iVarT0;
        if (pVar.S(dVar)) {
            return false;
        }
        t43.c cVarL = pVar.L(dVar);
        cVarL.getClass();
        t43.l lVarD0 = pVar.D0(cVarL);
        lVarD0.getClass();
        if (!pVar.H(lVarD0) || pVar.N(dVar) != t43.b.FOR_SUBTYPING) {
            return false;
        }
        t43.m mVarG = pVar.G(hVar2);
        t43.s sVar = mVarG instanceof t43.s ? (t43.s) mVarG : null;
        return (sVar == null || (nVarI = pVar.I(sVar)) == null || !pVar.u0(nVarI, mVar)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:196:0x0312  */
    /* JADX WARN: Code duplicated, block: B:207:0x033c  */
    /* JADX WARN: Code duplicated, block: B:210:0x034a  */
    /* JADX WARN: Code duplicated, block: B:212:0x0356  */
    /* JADX WARN: Code duplicated, block: B:213:0x035c  */
    /* JADX WARN: Code duplicated, block: B:218:0x036e  */
    /* JADX WARN: Code duplicated, block: B:221:0x0389  */
    /* JADX WARN: Code duplicated, block: B:225:0x039e  */
    /* JADX WARN: Code duplicated, block: B:226:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:230:0x03af  */
    /* JADX WARN: Code duplicated, block: B:236:0x03c5 A[LOOP:8: B:234:0x03bf->B:236:0x03c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:240:0x03e5 A[LOOP:9: B:238:0x03df->B:240:0x03e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:245:0x040f  */
    /* JADX WARN: Code duplicated, block: B:248:0x042b  */
    /* JADX WARN: Code duplicated, block: B:252:0x0436 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x0438  */
    /* JADX WARN: Code duplicated, block: B:255:0x0449  */
    /* JADX WARN: Code duplicated, block: B:260:0x045a  */
    /* JADX WARN: Code duplicated, block: B:262:0x045d  */
    /* JADX WARN: Code duplicated, block: B:265:0x0472  */
    /* JADX WARN: Code duplicated, block: B:267:0x0485  */
    /* JADX WARN: Code duplicated, block: B:270:0x048e  */
    /* JADX WARN: Code duplicated, block: B:278:0x04da  */
    /* JADX WARN: Code duplicated, block: B:287:0x0505  */
    /* JADX WARN: Code duplicated, block: B:289:0x0517  */
    /* JADX WARN: Code duplicated, block: B:291:0x0528  */
    /* JADX WARN: Code duplicated, block: B:293:0x052d  */
    /* JADX WARN: Code duplicated, block: B:296:0x053b  */
    /* JADX WARN: Code duplicated, block: B:299:0x0551  */
    /* JADX WARN: Code duplicated, block: B:303:0x0566  */
    /* JADX WARN: Code duplicated, block: B:304:0x0569  */
    /* JADX WARN: Code duplicated, block: B:308:0x0574  */
    /* JADX WARN: Code duplicated, block: B:314:0x058a  */
    /* JADX WARN: Code duplicated, block: B:318:0x05a8 A[LOOP:6: B:312:0x0584->B:318:0x05a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:335:0x042c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x04a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x0560 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x0578 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x05a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x054b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x054b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x0398 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x0383 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x0383 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:? A[LOOP:11: B:74:0x013e->B:367:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:? A[LOOP:12: B:90:0x0180->B:370:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0122  */
    /* JADX WARN: Code duplicated, block: B:73:0x013a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0144  */
    /* JADX WARN: Code duplicated, block: B:80:0x0157  */
    /* JADX WARN: Code duplicated, block: B:82:0x015f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0168  */
    /* JADX WARN: Code duplicated, block: B:89:0x017c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0186  */
    /* JADX WARN: Code duplicated, block: B:95:0x0191  */
    /* JADX WARN: Code duplicated, block: B:97:0x0197  */
    public final boolean e(l1 l1Var, t43.p pVar, t43.h hVar, t43.h hVar2) {
        Boolean boolValueOf;
        Boolean bool;
        t43.m mVarF0;
        z43.i<t43.i> iVar;
        ArrayDeque<t43.i> arrayDeque;
        z43.j jVar;
        ArrayList arrayList;
        List<t43.i> listC;
        t43.i iVarPop;
        l1.c cVar;
        Iterator<t43.h> it;
        ArrayList<t43.i> arrayList2;
        int i14;
        int size;
        t43.m mVarF1;
        t43.m mVarF2;
        ArrayDeque<t43.i> arrayDeque2;
        z43.j jVar2;
        t43.i iVarPop2;
        l1.c cVar2;
        Iterator<t43.h> it3;
        t43.i iVarA;
        t43.m mVarF3;
        t43.a aVar;
        int iF;
        int i15;
        boolean z14;
        boolean z15;
        t43.l lVarM;
        t43.h hVarP;
        t43.i iVarT0;
        t43.m mVarF4;
        t43.m mVarF5;
        t43.n nVarG;
        Collection<t43.h> collectionE0;
        Iterator<T> it4;
        Collection<t43.h> collectionE1;
        Iterator<T> it5;
        boolean z16;
        l1Var.getClass();
        hVar.getClass();
        p pVar2 = l1Var.f135872f;
        n0 n0VarA = pVar2.a(hVar);
        boolean z17 = l1Var.f135868b;
        o oVar = l1Var.f135871e;
        f2 f2VarA = oVar.a(n0VarA);
        hVar2.getClass();
        f2 f2VarA2 = oVar.a(pVar2.a(hVar2));
        if (l1Var.f135869c) {
            f2VarA.getClass();
            if (pVar.x(f2VarA)) {
                f2VarA2.getClass();
                if (pVar.D(f2VarA2)) {
                    t43.f fVarY0 = pVar.y0(f2VarA);
                    fVarY0.getClass();
                    t43.i iVarB = pVar.b(fVarY0);
                    t43.i iVarT1 = pVar.t0(f2VarA2);
                    iVarT1.getClass();
                    return e(l1Var, pVar, iVarB, pVar.f(iVarT1));
                }
            }
        }
        f2VarA.getClass();
        t43.i iVarA0 = pVar.A0(f2VarA);
        f2VarA2.getClass();
        t43.i iVarK = pVar.k(f2VarA2);
        boolean zU = pVar.U(iVarA0);
        h hVar3 = f135849a;
        boolean z18 = true;
        boolean z19 = false;
        if (zU || pVar.U(iVarK)) {
            if (l1Var.f135867a) {
                boolValueOf = Boolean.TRUE;
            } else if (!pVar.r(iVarA0) || pVar.r(iVarK)) {
                d dVar = d.f135809a;
                t43.i iVarC = pVar.c(iVarA0);
                t43.i iVarC2 = pVar.c(iVarK);
                dVar.getClass();
                boolValueOf = Boolean.valueOf(d.b(pVar, iVarC, iVarC2));
            } else {
                boolValueOf = Boolean.FALSE;
            }
        } else if (pVar.b0(iVarA0) && pVar.b0(iVarK)) {
            boolValueOf = Boolean.valueOf((pVar.F0(iVarA0) == pVar.F0(iVarK) && ((pVar.B0(iVarA0) || !pVar.B0(iVarK)) && (!pVar.r(iVarA0) || pVar.r(iVarK)))) || z17);
        } else if (pVar.o0(iVarA0) || pVar.o0(iVarK)) {
            boolValueOf = Boolean.valueOf(z17);
        } else {
            t43.d dVarJ0 = pVar.j0(iVarK);
            t43.h hVarW = dVarJ0 != null ? pVar.w(dVarJ0) : null;
            if (dVarJ0 == null || hVarW == null) {
                mVarF4 = pVar.F0(iVarK);
                mVarF4.getClass();
                if (pVar.V(mVarF4)) {
                    pVar.r(iVarK);
                    collectionE1 = pVar.E0(mVarF4);
                    if (!(collectionE1 instanceof Collection) && collectionE1.isEmpty()) {
                        z16 = true;
                        break;
                    }
                    it5 = collectionE1.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            z16 = true;
                            break;
                        }
                        if (!j(hVar3, l1Var, iVarA0, (t43.h) it5.next())) {
                            z16 = false;
                            break;
                        }
                    }
                    boolValueOf = Boolean.valueOf(z16);
                } else {
                    mVarF5 = pVar.F0(iVarA0);
                    if (iVarA0 instanceof t43.d) {
                        nVarG = g(pVar, iVarK, iVarA0);
                        if (nVarG == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = null;
                        }
                    } else {
                        mVarF5.getClass();
                        if (pVar.V(mVarF5)) {
                            collectionE0 = pVar.E0(mVarF5);
                            if ((collectionE0 instanceof Collection) || !collectionE0.isEmpty()) {
                                it4 = collectionE0.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        nVarG = g(pVar, iVarK, iVarA0);
                                        if (nVarG == null && pVar.u0(nVarG, pVar.F0(iVarK))) {
                                            boolValueOf = Boolean.TRUE;
                                        }
                                    } else if (!(((t43.h) it4.next()) instanceof t43.d)) {
                                    }
                                }
                            } else {
                                nVarG = g(pVar, iVarK, iVarA0);
                                if (nVarG == null) {
                                }
                            }
                        }
                        boolValueOf = null;
                    }
                }
            } else {
                if (pVar.r(iVarK)) {
                    hVarW = pVar.j(hVarW);
                } else if (pVar.B0(iVarK)) {
                    hVarW = pVar.s(hVarW);
                }
                int i16 = a.f135851b[l1.b.CHECK_SUBTYPE_AND_LOWER.ordinal()];
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            lc.u0.r();
                            return false;
                        }
                    } else if (j(this, l1Var, iVarA0, hVarW)) {
                        boolValueOf = Boolean.TRUE;
                    }
                    mVarF4 = pVar.F0(iVarK);
                    mVarF4.getClass();
                    if (pVar.V(mVarF4)) {
                        pVar.r(iVarK);
                        collectionE1 = pVar.E0(mVarF4);
                        if (!(collectionE1 instanceof Collection)) {
                            it5 = collectionE1.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    z16 = true;
                                    break;
                                }
                                if (!j(hVar3, l1Var, iVarA0, (t43.h) it5.next())) {
                                    z16 = false;
                                    break;
                                }
                            }
                        } else {
                            it5 = collectionE1.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    z16 = true;
                                    break;
                                }
                                if (!j(hVar3, l1Var, iVarA0, (t43.h) it5.next())) {
                                    z16 = false;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z16);
                    } else {
                        mVarF5 = pVar.F0(iVarA0);
                        if (iVarA0 instanceof t43.d) {
                            mVarF5.getClass();
                            if (pVar.V(mVarF5)) {
                                collectionE0 = pVar.E0(mVarF5);
                                if (collectionE0 instanceof Collection) {
                                    it4 = collectionE0.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            nVarG = g(pVar, iVarK, iVarA0);
                                            if (nVarG == null) {
                                            }
                                        } else if (!(((t43.h) it4.next()) instanceof t43.d)) {
                                        }
                                    }
                                } else {
                                    it4 = collectionE0.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            nVarG = g(pVar, iVarK, iVarA0);
                                            if (nVarG == null) {
                                            }
                                        } else if (!(((t43.h) it4.next()) instanceof t43.d)) {
                                        }
                                    }
                                }
                            }
                            boolValueOf = null;
                        } else {
                            nVarG = g(pVar, iVarK, iVarA0);
                            if (nVarG == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = null;
                            }
                        }
                    }
                } else {
                    boolValueOf = Boolean.valueOf(j(this, l1Var, iVarA0, hVarW));
                }
            }
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        t43.i iVarA1 = pVar.A0(f2VarA);
        t43.i iVarK2 = pVar.k(f2VarA2);
        c.f135803a.getClass();
        t43.p pVar3 = l1Var.f135870d;
        if (!pVar3.r(iVarK2) && !pVar3.C(iVarA1) && !pVar3.B0(iVarA1) && ((!(iVarA1 instanceof t43.d) || !pVar3.K((t43.d) iVarA1)) && !c.a(l1Var, iVarA1, l1.c.b.f135881a))) {
            if (pVar3.B0(iVarK2) || c.a(l1Var, iVarK2, l1.c.d.f135883a) || pVar3.E(iVarA1)) {
                return false;
            }
            t43.m mVarF6 = pVar3.F0(iVarK2);
            mVarF6.getClass();
            if (!c.b(l1Var, iVarA1, mVarF6)) {
                l1Var.c();
                ArrayDeque<t43.i> arrayDeque3 = l1Var.f135874h;
                arrayDeque3.getClass();
                z43.j jVar3 = l1Var.f135875i;
                jVar3.getClass();
                arrayDeque3.push(iVarA1);
                loop0: while (true) {
                    if (arrayDeque3.isEmpty()) {
                        l1Var.a();
                        return false;
                    }
                    t43.i iVarPop3 = arrayDeque3.pop();
                    iVarPop3.getClass();
                    if (jVar3.add(iVarPop3)) {
                        l1.c cVar3 = pVar3.r(iVarPop3) ? l1.c.C2572c.f135882a : l1.c.b.f135881a;
                        if (p005kotlin.jvm.internal.s.g(cVar3, l1.c.C2572c.f135882a)) {
                            cVar3 = null;
                        }
                        if (cVar3 == null) {
                            continue;
                        } else {
                            Iterator<t43.h> it6 = pVar3.E0(pVar3.F0(iVarPop3)).iterator();
                            while (it6.hasNext()) {
                                t43.i iVarA2 = cVar3.a(l1Var, it6.next());
                                if (c.b(l1Var, iVarA2, mVarF6)) {
                                    l1Var.a();
                                    break loop0;
                                }
                                arrayDeque3.add(iVarA2);
                            }
                        }
                    }
                }
            }
        }
        if (!pVar.s0(iVarA1) && !pVar.s0(iVarK2)) {
            bool = null;
        } else if (a(pVar, iVarA1) && a(pVar, iVarK2)) {
            bool = Boolean.TRUE;
        } else if (pVar.s0(iVarA1)) {
            if (b(pVar, l1Var, iVarA1, iVarK2, false)) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
        } else if (pVar.s0(iVarK2)) {
            t43.m mVarF7 = pVar.F0(iVarA1);
            if (mVarF7 instanceof t43.g) {
                Collection<t43.h> collectionE2 = pVar.E0(mVarF7);
                if (!(collectionE2 instanceof Collection) || !collectionE2.isEmpty()) {
                    Iterator<T> it7 = collectionE2.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            t43.h hVar4 = (t43.h) it7.next();
                            hVar4.getClass();
                            t43.i iVarT2 = pVar.t0(hVar4);
                            if (iVarT2 == null || !pVar.s0(iVarT2)) {
                            }
                        } else if (!b(pVar, l1Var, iVarK2, iVarA1, true)) {
                            bool = null;
                        }
                    }
                } else if (!b(pVar, l1Var, iVarK2, iVarA1, true)) {
                    bool = null;
                }
            } else if (!b(pVar, l1Var, iVarK2, iVarA1, true)) {
                bool = null;
            }
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        t43.m mVarF8 = pVar.F0(iVarK2);
        if (pVar.P(pVar.F0(iVarA1), mVarF8)) {
            mVarF8.getClass();
            if (pVar.F(mVarF8) != 0) {
                mVarF0 = pVar.F0(iVarK2);
                mVarF0.getClass();
                if (!pVar.k0(mVarF0)) {
                    mVarF8.getClass();
                    hVar3.getClass();
                    if (pVar3.E(iVarA1)) {
                        listC = d(l1Var, pVar3, iVarA1, mVarF8);
                    } else if (!pVar3.Y(mVarF8) || pVar3.C0(mVarF8)) {
                        iVar = new z43.i();
                        l1Var.c();
                        arrayDeque = l1Var.f135874h;
                        arrayDeque.getClass();
                        jVar = l1Var.f135875i;
                        jVar.getClass();
                        arrayDeque.push(iVarA1);
                        while (!arrayDeque.isEmpty()) {
                            iVarPop = arrayDeque.pop();
                            iVarPop.getClass();
                            if (jVar.add(iVarPop)) {
                                if (pVar3.E(iVarPop)) {
                                    iVar.add(iVarPop);
                                    cVar = l1.c.C2572c.f135882a;
                                } else {
                                    cVar = l1.c.b.f135881a;
                                }
                                if (p005kotlin.jvm.internal.s.g(cVar, l1.c.C2572c.f135882a)) {
                                    cVar = null;
                                }
                                if (cVar != null) {
                                    it = pVar3.E0(pVar3.F0(iVarPop)).iterator();
                                    while (it.hasNext()) {
                                        arrayDeque.add(cVar.a(l1Var, it.next()));
                                    }
                                }
                            }
                        }
                        l1Var.a();
                        arrayList = new ArrayList();
                        for (t43.i iVar2 : iVar) {
                            iVar2.getClass();
                            p13.d0.v(arrayList, d(l1Var, pVar3, iVar2, mVarF8));
                        }
                        listC = arrayList;
                    } else {
                        listC = c(l1Var, pVar3, iVarA1, mVarF8);
                    }
                    listC.size();
                    i14 = 10;
                    arrayList2 = new ArrayList(p13.y.r(listC, 10));
                    for (t43.i iVar3 : listC) {
                        l1Var.getClass();
                        iVar3.getClass();
                        f2 f2VarA3 = l1Var.f135871e.a(iVar3);
                        f2VarA3.getClass();
                        iVarT0 = pVar.t0(f2VarA3);
                        if (iVarT0 == null) {
                            iVar3 = iVarT0;
                        }
                        arrayList2.add(iVar3);
                    }
                    size = arrayList2.size();
                    if (size != 0) {
                        mVarF1 = pVar.F0(iVarA1);
                        mVarF1.getClass();
                        if (pVar.Y(mVarF1)) {
                            return pVar.c0(mVarF1);
                        }
                        mVarF2 = pVar.F0(iVarA1);
                        mVarF2.getClass();
                        if (pVar.c0(mVarF2)) {
                            return true;
                        }
                        l1Var.c();
                        arrayDeque2 = l1Var.f135874h;
                        arrayDeque2.getClass();
                        jVar2 = l1Var.f135875i;
                        jVar2.getClass();
                        arrayDeque2.push(iVarA1);
                        while (!arrayDeque2.isEmpty()) {
                            iVarPop2 = arrayDeque2.pop();
                            iVarPop2.getClass();
                            if (!jVar2.add(iVarPop2)) {
                                if (pVar.E(iVarPop2)) {
                                    cVar2 = l1.c.C2572c.f135882a;
                                } else {
                                    cVar2 = l1.c.b.f135881a;
                                }
                                if (p005kotlin.jvm.internal.s.g(cVar2, l1.c.C2572c.f135882a)) {
                                    cVar2 = null;
                                }
                                if (cVar2 == null) {
                                    continue;
                                } else {
                                    it3 = pVar3.E0(pVar3.F0(iVarPop2)).iterator();
                                    while (it3.hasNext()) {
                                        iVarA = cVar2.a(l1Var, it3.next());
                                        iVarA.getClass();
                                        mVarF3 = pVar.F0(iVarA);
                                        mVarF3.getClass();
                                        if (pVar.c0(mVarF3)) {
                                            l1Var.a();
                                            return true;
                                        }
                                        arrayDeque2.add(iVarA);
                                    }
                                }
                            }
                        }
                        l1Var.a();
                        return false;
                    }
                    if (size != 1) {
                        t43.i iVar4 = (t43.i) p13.h0.a0(arrayList2);
                        iVar4.getClass();
                        return i(l1Var, pVar, pVar.w0(iVar4), iVarK2);
                    }
                    aVar = new t43.a(pVar.F(mVarF8));
                    iF = pVar.F(mVarF8);
                    i15 = 0;
                    z14 = false;
                    while (i15 < iF) {
                        if (z14 && pVar.Q(pVar.i(mVarF8, i15)) == t43.t.OUT) {
                            z14 = z19;
                        } else {
                            z14 = z18;
                        }
                        if (z14) {
                            z15 = z19;
                        } else {
                            ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, i14));
                            for (t43.i iVar5 : arrayList2) {
                                iVar5.getClass();
                                boolean z24 = z19;
                                lVarM = pVar.m(iVar5, i15);
                                if (lVarM == null) {
                                    if (pVar.n(lVarM) != t43.t.INV) {
                                        lVarM = null;
                                    }
                                    if (lVarM == null && (hVarP = pVar.p(lVarM)) != null) {
                                        arrayList3.add(hVarP);
                                        z19 = z24;
                                    }
                                }
                                throw new IllegalStateException(("Incorrect type: " + iVar5 + ", subType: " + iVarA1 + ", superType: " + iVarK2).toString());
                            }
                            z15 = z19;
                            t43.h hVarO = pVar.O(arrayList3);
                            hVarO.getClass();
                            aVar.add(pVar.i0(hVarO));
                        }
                        i15++;
                        z18 = z18;
                        z19 = z15;
                        i14 = 10;
                    }
                    boolean z25 = z18;
                    if (z14 && i(l1Var, pVar, aVar, iVarK2)) {
                        return z25;
                    }
                    f fVar = new f(arrayList2, l1Var, pVar, iVarK2);
                    l1.a.C2571a c2571a = new l1.a.C2571a();
                    fVar.invoke(c2571a);
                    return c2571a.f135876a;
                }
            }
        } else {
            mVarF0 = pVar.F0(iVarK2);
            mVarF0.getClass();
            if (!pVar.k0(mVarF0)) {
                mVarF8.getClass();
                hVar3.getClass();
                if (pVar3.E(iVarA1)) {
                    listC = d(l1Var, pVar3, iVarA1, mVarF8);
                } else if (pVar3.Y(mVarF8)) {
                    iVar = new z43.i();
                    l1Var.c();
                    arrayDeque = l1Var.f135874h;
                    arrayDeque.getClass();
                    jVar = l1Var.f135875i;
                    jVar.getClass();
                    arrayDeque.push(iVarA1);
                    while (!arrayDeque.isEmpty()) {
                        iVarPop = arrayDeque.pop();
                        iVarPop.getClass();
                        if (jVar.add(iVarPop)) {
                            if (pVar3.E(iVarPop)) {
                                iVar.add(iVarPop);
                                cVar = l1.c.C2572c.f135882a;
                            } else {
                                cVar = l1.c.b.f135881a;
                            }
                            if (p005kotlin.jvm.internal.s.g(cVar, l1.c.C2572c.f135882a)) {
                                cVar = null;
                            }
                            if (cVar != null) {
                                it = pVar3.E0(pVar3.F0(iVarPop)).iterator();
                                while (it.hasNext()) {
                                    arrayDeque.add(cVar.a(l1Var, it.next()));
                                }
                            }
                        }
                    }
                    l1Var.a();
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        iVar2.getClass();
                        p13.d0.v(arrayList, d(l1Var, pVar3, iVar2, mVarF8));
                    }
                    listC = arrayList;
                } else {
                    iVar = new z43.i();
                    l1Var.c();
                    arrayDeque = l1Var.f135874h;
                    arrayDeque.getClass();
                    jVar = l1Var.f135875i;
                    jVar.getClass();
                    arrayDeque.push(iVarA1);
                    while (!arrayDeque.isEmpty()) {
                        iVarPop = arrayDeque.pop();
                        iVarPop.getClass();
                        if (jVar.add(iVarPop)) {
                            if (pVar3.E(iVarPop)) {
                                iVar.add(iVarPop);
                                cVar = l1.c.C2572c.f135882a;
                            } else {
                                cVar = l1.c.b.f135881a;
                            }
                            if (p005kotlin.jvm.internal.s.g(cVar, l1.c.C2572c.f135882a)) {
                                cVar = null;
                            }
                            if (cVar != null) {
                                it = pVar3.E0(pVar3.F0(iVarPop)).iterator();
                                while (it.hasNext()) {
                                    arrayDeque.add(cVar.a(l1Var, it.next()));
                                }
                            }
                        }
                    }
                    l1Var.a();
                    arrayList = new ArrayList();
                    while (r7.hasNext()) {
                        iVar2.getClass();
                        p13.d0.v(arrayList, d(l1Var, pVar3, iVar2, mVarF8));
                    }
                    listC = arrayList;
                }
                listC.size();
                i14 = 10;
                arrayList2 = new ArrayList(p13.y.r(listC, 10));
                while (r7.hasNext()) {
                    l1Var.getClass();
                    iVar3.getClass();
                    f2 f2VarA4 = l1Var.f135871e.a(iVar3);
                    f2VarA4.getClass();
                    iVarT0 = pVar.t0(f2VarA4);
                    if (iVarT0 == null) {
                        iVar3 = iVarT0;
                    }
                    arrayList2.add(iVar3);
                }
                size = arrayList2.size();
                if (size != 0) {
                    mVarF1 = pVar.F0(iVarA1);
                    mVarF1.getClass();
                    if (pVar.Y(mVarF1)) {
                        return pVar.c0(mVarF1);
                    }
                    mVarF2 = pVar.F0(iVarA1);
                    mVarF2.getClass();
                    if (pVar.c0(mVarF2)) {
                        return true;
                    }
                    l1Var.c();
                    arrayDeque2 = l1Var.f135874h;
                    arrayDeque2.getClass();
                    jVar2 = l1Var.f135875i;
                    jVar2.getClass();
                    arrayDeque2.push(iVarA1);
                    while (!arrayDeque2.isEmpty()) {
                        iVarPop2 = arrayDeque2.pop();
                        iVarPop2.getClass();
                        if (!jVar2.add(iVarPop2)) {
                            if (pVar.E(iVarPop2)) {
                                cVar2 = l1.c.C2572c.f135882a;
                            } else {
                                cVar2 = l1.c.b.f135881a;
                            }
                            if (p005kotlin.jvm.internal.s.g(cVar2, l1.c.C2572c.f135882a)) {
                                cVar2 = null;
                            }
                            if (cVar2 == null) {
                                continue;
                            } else {
                                it3 = pVar3.E0(pVar3.F0(iVarPop2)).iterator();
                                while (it3.hasNext()) {
                                    iVarA = cVar2.a(l1Var, it3.next());
                                    iVarA.getClass();
                                    mVarF3 = pVar.F0(iVarA);
                                    mVarF3.getClass();
                                    if (pVar.c0(mVarF3)) {
                                        l1Var.a();
                                        return true;
                                    }
                                    arrayDeque2.add(iVarA);
                                }
                            }
                        }
                    }
                    l1Var.a();
                    return false;
                }
                if (size != 1) {
                    t43.i iVar6 = (t43.i) p13.h0.a0(arrayList2);
                    iVar6.getClass();
                    return i(l1Var, pVar, pVar.w0(iVar6), iVarK2);
                }
                aVar = new t43.a(pVar.F(mVarF8));
                iF = pVar.F(mVarF8);
                i15 = 0;
                z14 = false;
                while (i15 < iF) {
                    if (z14) {
                        z14 = z18;
                    } else {
                        z14 = z18;
                    }
                    if (z14) {
                        ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList2, i14));
                        while (r10.hasNext()) {
                            iVar5.getClass();
                            boolean z26 = z19;
                            lVarM = pVar.m(iVar5, i15);
                            if (lVarM == null) {
                                if (pVar.n(lVarM) != t43.t.INV) {
                                    lVarM = null;
                                }
                                if (lVarM == null) {
                                }
                            }
                            throw new IllegalStateException(("Incorrect type: " + iVar5 + ", subType: " + iVarA1 + ", superType: " + iVarK2).toString());
                        }
                        z15 = z19;
                        t43.h hVarO2 = pVar.O(arrayList4);
                        hVarO2.getClass();
                        aVar.add(pVar.i0(hVarO2));
                    } else {
                        z15 = z19;
                    }
                    i15++;
                    z18 = z18;
                    z19 = z15;
                    i14 = 10;
                }
                boolean z27 = z18;
                if (z14) {
                }
                f fVar2 = new f(arrayList2, l1Var, pVar, iVarK2);
                l1.a.C2571a c2571a2 = new l1.a.C2571a();
                fVar2.invoke(c2571a2);
                return c2571a2.f135876a;
            }
        }
        return true;
    }
}
