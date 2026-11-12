package p33;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p43.d2;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f135484a;

    public n1(i iVar) {
        iVar.getClass();
        this.f135484a = iVar;
    }

    public final p43.n0 a(j33.a aVar, t23.a aVar2, boolean z14, k33.i iVar, h33.c cVar, r1 r1Var, boolean z15, e23.l lVar) {
        p1 p1Var = new p1(aVar2, z14, iVar, cVar, false, 16, null);
        p43.n0 n0Var = (p43.n0) lVar.invoke(aVar);
        Collection<? extends t23.b> collectionO = aVar.o();
        collectionO.getClass();
        Collection<? extends t23.b> collection = collectionO;
        ArrayList arrayList = new ArrayList(p13.y.r(collection, 10));
        for (t23.b bVar : collection) {
            bVar.getClass();
            arrayList.add((p43.n0) lVar.invoke(bVar));
        }
        return b(p1Var, n0Var, arrayList, r1Var, z15);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:123:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:130:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:136:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:148:0x021a  */
    /* JADX WARN: Code duplicated, block: B:151:0x021f  */
    /* JADX WARN: Code duplicated, block: B:152:0x0222  */
    /* JADX WARN: Code duplicated, block: B:222:0x0310  */
    /* JADX WARN: Code duplicated, block: B:325:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:59:0x0102  */
    /* JADX WARN: Code duplicated, block: B:64:0x011d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0135  */
    /* JADX WARN: Code duplicated, block: B:67:0x0138  */
    /* JADX WARN: Code duplicated, block: B:69:0x0142  */
    /* JADX WARN: Code duplicated, block: B:79:0x0169  */
    /* JADX WARN: Code duplicated, block: B:82:0x0176  */
    /* JADX WARN: Code duplicated, block: B:93:0x018e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0197  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v7, types: [h33.d] */
    /* JADX WARN: Type inference failed for: r20v2 */
    public final p43.n0 b(p1 p1Var, p43.n0 n0Var, List<? extends p43.n0> list, r1 r1Var, boolean z14) {
        p43.n0 n0Var2;
        boolean z15;
        boolean z16;
        Iterable iterableA0;
        t23.d1 d1VarV;
        boolean z17;
        boolean z18;
        Iterator it;
        k kVar;
        ?? r14;
        ArrayList arrayList;
        h33.d dVarC;
        a aVar;
        Iterator it3;
        n nVar;
        n nVarE;
        n nVarA;
        m mVar;
        boolean z19;
        n nVarE2;
        j jVar;
        m mVar2;
        boolean z24;
        j jVar2;
        m mVar3;
        boolean z25;
        n nVarC;
        boolean z26;
        x33.c cVarE;
        k kVar2;
        u23.a aVar2;
        Iterable annotations;
        t43.m mVarG;
        ArrayList arrayList2;
        boolean z27;
        m mVar4;
        boolean z28;
        j jVar3;
        j jVar4;
        t43.h hVar;
        m mVarI;
        k kVar3;
        t43.t tVarY;
        boolean z29 = p1Var.f135500b;
        n0Var.getClass();
        list.getClass();
        ArrayList arrayListM = p1Var.m(n0Var);
        ArrayList arrayList3 = new ArrayList(p13.y.r(list, 10));
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            arrayList3.add(p1Var.m((t43.h) it4.next()));
        }
        if (!z29 || list.isEmpty()) {
            n0Var2 = n0Var;
            z15 = false;
            break;
        }
        Iterator it5 = list.iterator();
        while (true) {
            if (!it5.hasNext()) {
                n0Var2 = n0Var;
                z15 = false;
                break;
            }
            t43.h hVar2 = (t43.h) it5.next();
            hVar2.getClass();
            n0Var2 = n0Var;
            if (!p1Var.f135501c.f102785a.f102771u.a(n0Var2, (p43.n0) hVar2)) {
                z15 = true;
                break;
            }
        }
        int size = arrayListM.size();
        j[] jVarArr = new j[size];
        int i14 = 0;
        while (i14 < size) {
            o13.l lVarA = o13.m.a(o13.n.NONE, new c(p1Var, arrayListM, i14));
            if (i14 <= 0 || !z15) {
                f.a aVar3 = (f.a) arrayListM.get(i14);
                h33.q qVar = (h33.q) lVarA.getValue();
                t43.h hVar3 = aVar3.f135430a;
                t43.n nVar2 = aVar3.f135432c;
                if (hVar3 == null) {
                    q43.s sVarK = p1Var.k();
                    if (nVar2 != null) {
                        sVarK.getClass();
                        tVarY = q43.b.a.y(nVar2);
                    } else {
                        tVarY = null;
                    }
                    if (tVarY == t43.t.IN) {
                        j.f135458e.getClass();
                        jVar2 = j.f135459f;
                        z17 = z29;
                        arrayList = arrayListM;
                    } else {
                        if (nVar2 == null) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (hVar3 != null || (iterableA0 = p1Var.d(hVar3)) == null) {
                            iterableA0 = p13.j0.f134944a;
                        }
                        q43.s sVarK2 = p1Var.k();
                        if (hVar3 != null || (mVarG = sVarK2.G(hVar3)) == null) {
                            d1VarV = null;
                        } else {
                            d1VarV = q43.b.a.v(mVarG);
                        }
                        z17 = z29;
                        if (p1Var.f() == h33.c.TYPE_PARAMETER_BOUNDS) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (z16) {
                            if (!z18) {
                                p1Var.n();
                            }
                            aVar2 = p1Var.f135499a;
                            if (aVar2 != null || (annotations = aVar2.getAnnotations()) == null) {
                                annotations = p13.j0.f134944a;
                            }
                            iterableA0 = p13.h0.A0(annotations, iterableA0);
                        }
                        h33.d dVarC2 = p1Var.c();
                        dVarC2.getClass();
                        iterableA0.getClass();
                        it = iterableA0.iterator();
                        kVar = null;
                        r14 = dVarC2;
                        while (true) {
                            if (it.hasNext()) {
                                arrayList = arrayListM;
                                break;
                            }
                            arrayList = arrayListM;
                            cVarE = r14.e(it.next());
                            ?? r24 = r14;
                            if (p13.h0.R(h33.d0.f81449n, cVarE)) {
                                kVar2 = k.READ_ONLY;
                            } else {
                                if (p13.h0.R(h33.d0.f81450o, cVarE)) {
                                    kVar2 = k.MUTABLE;
                                } else {
                                    continue;
                                }
                                arrayListM = arrayList;
                                r14 = r24;
                            }
                            if (kVar == null && kVar != kVar2) {
                                kVar = null;
                                break;
                            }
                            kVar = kVar2;
                            arrayListM = arrayList;
                            r14 = r24;
                        }
                        dVarC = p1Var.c();
                        aVar = new a(p1Var, aVar3);
                        dVarC.getClass();
                        it3 = iterableA0.iterator();
                        nVar = null;
                        while (it3.hasNext()) {
                            nVarC = dVarC.c(aVar, it3.next());
                            h33.d dVar = dVarC;
                            if (nVar == null) {
                                nVar = nVarC;
                            } else {
                                boolean z34 = nVar.f135481b;
                                if (nVarC != null && !nVarC.equals(nVar) && (!(z26 = nVarC.f135481b) || z34)) {
                                    if (z26 || !z34) {
                                        nVar = null;
                                        break;
                                    }
                                    nVar = nVarC;
                                }
                            }
                            dVarC = dVar;
                        }
                        if (nVar != null) {
                            mVar3 = nVar.f135480a;
                            if (mVar3 == m.NOT_NULL || d1VarV == null) {
                                z25 = false;
                            } else {
                                z25 = true;
                            }
                            jVar2 = new j(mVar3, kVar, z25, nVar.f135481b);
                        } else {
                            if (d1VarV != null) {
                                nVarE = p1Var.e(d1VarV);
                            } else {
                                nVarE = null;
                            }
                            p1Var.getClass();
                            if (nVarE != null) {
                                nVarA = n.a(nVarE, m.NOT_NULL, false, 2);
                            } else if (qVar != null) {
                                nVarA = qVar.f81486a;
                            } else {
                                nVarA = null;
                            }
                            if (nVarE != null) {
                                mVar = nVarE.f135480a;
                            } else {
                                mVar = null;
                            }
                            if (mVar == m.NOT_NULL && (d1VarV == null || qVar == null || !qVar.f81488c)) {
                                z19 = false;
                            } else {
                                z19 = true;
                            }
                            if (nVar2 != null || (nVarE2 = p1Var.e(nVar2)) == null) {
                                nVarE2 = null;
                            } else if (nVarE2.f135480a == m.NULLABLE) {
                                nVarE2 = n.a(nVarE2, m.FORCE_FLEXIBILITY, false, 2);
                            }
                            if (nVarE2 != null) {
                                m mVar5 = nVarE2.f135480a;
                                if (nVarA == null) {
                                    nVarA = nVarE2;
                                } else {
                                    m mVar6 = nVarA.f135480a;
                                    boolean z35 = nVarA.f135481b;
                                    z24 = nVarE2.f135481b;
                                    if ((z24 || z35) && ((!z24 && z35) || (mVar5.compareTo(mVar6) >= 0 && mVar5.compareTo(mVar6) > 0))) {
                                        nVarA = nVarE2;
                                    }
                                }
                            }
                            if (nVarA != null) {
                                mVar2 = nVarA.f135480a;
                            } else {
                                mVar2 = null;
                            }
                            jVar = new j(mVar2, kVar, z19, nVarA == null && nVarA.f135481b);
                        }
                    }
                    jVar = jVar2;
                } else {
                    if (nVar2 == null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (hVar3 != null) {
                        iterableA0 = p13.j0.f134944a;
                    } else {
                        iterableA0 = p13.j0.f134944a;
                    }
                    q43.s sVarK3 = p1Var.k();
                    if (hVar3 != null) {
                        d1VarV = null;
                    } else {
                        d1VarV = null;
                    }
                    z17 = z29;
                    if (p1Var.f() == h33.c.TYPE_PARAMETER_BOUNDS) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z16) {
                        if (!z18) {
                            p1Var.n();
                        }
                        aVar2 = p1Var.f135499a;
                        if (aVar2 != null) {
                            annotations = p13.j0.f134944a;
                        } else {
                            annotations = p13.j0.f134944a;
                        }
                        iterableA0 = p13.h0.A0(annotations, iterableA0);
                    }
                    h33.d dVarC3 = p1Var.c();
                    dVarC3.getClass();
                    iterableA0.getClass();
                    it = iterableA0.iterator();
                    kVar = null;
                    r14 = dVarC3;
                    while (true) {
                        if (it.hasNext()) {
                            arrayList = arrayListM;
                            break;
                        }
                        arrayList = arrayListM;
                        cVarE = r14.e(it.next());
                        ?? r25 = r14;
                        if (p13.h0.R(h33.d0.f81449n, cVarE)) {
                            kVar2 = k.READ_ONLY;
                        } else {
                            if (p13.h0.R(h33.d0.f81450o, cVarE)) {
                                kVar2 = k.MUTABLE;
                            } else {
                                continue;
                            }
                            arrayListM = arrayList;
                            r14 = r25;
                        }
                        if (kVar == null) {
                        }
                        kVar = kVar2;
                        arrayListM = arrayList;
                        r14 = r25;
                    }
                    dVarC = p1Var.c();
                    aVar = new a(p1Var, aVar3);
                    dVarC.getClass();
                    it3 = iterableA0.iterator();
                    nVar = null;
                    while (it3.hasNext()) {
                        nVarC = dVarC.c(aVar, it3.next());
                        h33.d dVar2 = dVarC;
                        if (nVar == null) {
                            nVar = nVarC;
                        } else {
                            boolean z36 = nVar.f135481b;
                            if (nVarC != null) {
                                continue;
                            }
                        }
                        dVarC = dVar2;
                    }
                    if (nVar != null) {
                        mVar3 = nVar.f135480a;
                        if (mVar3 == m.NOT_NULL) {
                            z25 = false;
                        } else {
                            z25 = false;
                        }
                        jVar2 = new j(mVar3, kVar, z25, nVar.f135481b);
                        jVar = jVar2;
                    } else {
                        if (d1VarV != null) {
                            nVarE = p1Var.e(d1VarV);
                        } else {
                            nVarE = null;
                        }
                        p1Var.getClass();
                        if (nVarE != null) {
                            nVarA = n.a(nVarE, m.NOT_NULL, false, 2);
                        } else if (qVar != null) {
                            nVarA = qVar.f81486a;
                        } else {
                            nVarA = null;
                        }
                        if (nVarE != null) {
                            mVar = nVarE.f135480a;
                        } else {
                            mVar = null;
                        }
                        if (mVar == m.NOT_NULL) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (nVar2 != null) {
                            nVarE2 = null;
                        } else {
                            nVarE2 = null;
                        }
                        if (nVarE2 != null) {
                            m mVar7 = nVarE2.f135480a;
                            if (nVarA == null) {
                                nVarA = nVarE2;
                            } else {
                                m mVar8 = nVarA.f135480a;
                                boolean z37 = nVarA.f135481b;
                                z24 = nVarE2.f135481b;
                                if (z24) {
                                    nVarA = nVarE2;
                                } else {
                                    nVarA = nVarE2;
                                }
                            }
                        }
                        if (nVarA != null) {
                            mVar2 = nVarA.f135480a;
                        } else {
                            mVar2 = null;
                        }
                        jVar = new j(mVar2, kVar, z19, nVarA == null && nVarA.f135481b);
                    }
                }
                ArrayList<j> arrayList4 = new ArrayList();
                Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    f.a aVar4 = (f.a) p13.h0.e0(i14, (List) it6.next());
                    if (aVar4 == null || (hVar = aVar4.f135430a) == null) {
                        jVar4 = null;
                    } else {
                        m mVarI2 = p1Var.i(hVar);
                        if (mVarI2 == null) {
                            p43.n0 n0VarC = og.a.C((p43.n0) hVar);
                            mVarI = n0VarC != null ? p1Var.i(n0VarC) : null;
                        } else {
                            mVarI = mVarI2;
                        }
                        q43.s sVar = q43.s.f142813a;
                        s23.c cVar = s23.c.f156232a;
                        p43.n0 n0Var3 = (p43.n0) sVar.A0(hVar);
                        r43.i iVar = d2.f135814a;
                        t23.h hVarT = n0Var3.F0().t();
                        t23.e eVar = hVarT instanceof t23.e ? (t23.e) hVarT : null;
                        x33.d dVarF = eVar != null ? b43.i.f(eVar) : null;
                        cVar.getClass();
                        if (s23.c.f156243l.containsKey(dVarF)) {
                            kVar3 = k.READ_ONLY;
                        } else {
                            t23.h hVarT2 = ((p43.n0) sVar.k(hVar)).F0().t();
                            t23.e eVar2 = hVarT2 instanceof t23.e ? (t23.e) hVarT2 : null;
                            kVar3 = s23.c.f156242k.containsKey(eVar2 != null ? b43.i.f(eVar2) : null) ? k.MUTABLE : null;
                        }
                        jVar4 = new j(mVarI, kVar3, sVar.D(hVar) || (((p43.n0) hVar).I0() instanceof l), mVarI != mVarI2);
                    }
                    if (jVar4 != null) {
                        arrayList4.add(jVar4);
                    }
                    arrayList3 = arrayList3;
                }
                arrayList2 = arrayList3;
                boolean z38 = i14 == 0 && z17;
                if (i14 == 0) {
                    u23.a aVar5 = p1Var.f135499a;
                    if (!(aVar5 instanceof t23.j1) || ((t23.j1) aVar5).R() == null) {
                        z27 = false;
                    } else {
                        z27 = true;
                    }
                } else {
                    z27 = false;
                }
                jVar.getClass();
                boolean z39 = jVar.f135463d;
                m mVar9 = jVar.f135460a;
                ArrayList arrayList5 = new ArrayList();
                for (j jVar5 : arrayList4) {
                    m mVar10 = jVar5.f135463d ? null : jVar5.f135460a;
                    if (mVar10 != null) {
                        arrayList5.add(mVar10);
                    }
                }
                Set setG1 = p13.h0.g1(arrayList5);
                m mVar11 = z39 ? null : mVar9;
                m mVar12 = m.FORCE_FLEXIBILITY;
                if (mVar11 != mVar12) {
                    mVar12 = (m) og.a.X(setG1, m.NOT_NULL, m.NULLABLE, mVar11, z38);
                }
                if (mVar12 == null) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it7 = arrayList4.iterator();
                    while (it7.hasNext()) {
                        m mVar13 = ((j) it7.next()).f135460a;
                        if (mVar13 != null) {
                            arrayList6.add(mVar13);
                        }
                    }
                    Set setG2 = p13.h0.g1(arrayList6);
                    mVar4 = m.FORCE_FLEXIBILITY;
                    if (mVar9 != mVar4) {
                        mVar4 = (m) og.a.X(setG2, m.NOT_NULL, m.NULLABLE, mVar9, z38);
                    }
                } else {
                    mVar4 = mVar12;
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it8 = arrayList4.iterator();
                while (it8.hasNext()) {
                    k kVar4 = ((j) it8.next()).f135461b;
                    if (kVar4 != null) {
                        arrayList7.add(kVar4);
                    }
                }
                k kVar5 = (k) og.a.X(p13.h0.g1(arrayList7), k.MUTABLE, k.READ_ONLY, jVar.f135461b, z38);
                m mVar14 = (mVar4 == null || z14 || (z27 && mVar4 == m.NULLABLE)) ? null : mVar4;
                boolean z44 = mVar14 != null && mVar12 == null;
                if (mVar14 != m.NOT_NULL) {
                    z28 = false;
                } else {
                    if (z39 != z44 || !jVar.f135462c) {
                        if (!arrayList4.isEmpty()) {
                            Iterator it9 = arrayList4.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    j jVar6 = (j) it9.next();
                                    if (jVar6.f135463d != z44 || !jVar6.f135462c) {
                                    }
                                }
                            }
                        }
                        z28 = false;
                    }
                    z28 = true;
                }
                jVar3 = new j(mVar14, kVar5, z28, z44);
            } else {
                j.f135458e.getClass();
                jVar3 = j.f135459f;
                z17 = z29;
                arrayList = arrayListM;
                arrayList2 = arrayList3;
            }
            jVarArr[i14] = jVar3;
            i14++;
            arrayList3 = arrayList2;
            z29 = z17;
            arrayListM = arrayList;
        }
        return this.f135484a.b(n0Var2.I0(), new d(r1Var, jVarArr), 0, p1Var.f135503e).f135450a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:111:0x0202  */
    /* JADX WARN: Code duplicated, block: B:112:0x0206  */
    /* JADX WARN: Code duplicated, block: B:115:0x0225  */
    /* JADX WARN: Code duplicated, block: B:120:0x0236  */
    /* JADX WARN: Code duplicated, block: B:122:0x023a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0247 A[EDGE_INSN: B:124:0x0247->B:131:0x026a BREAK  A[LOOP:4: B:126:0x024e->B:195:?]] */
    /* JADX WARN: Code duplicated, block: B:125:0x024a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0254  */
    /* JADX WARN: Code duplicated, block: B:133:0x026d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0270  */
    /* JADX WARN: Code duplicated, block: B:136:0x0273  */
    /* JADX WARN: Code duplicated, block: B:137:0x0280  */
    /* JADX WARN: Code duplicated, block: B:142:0x028b A[EDGE_INSN: B:142:0x028b->B:151:0x02a6 BREAK  A[LOOP:2: B:144:0x0292->B:189:?]] */
    /* JADX WARN: Code duplicated, block: B:143:0x028e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0298  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:149:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:159:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:163:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:165:0x02db  */
    /* JADX WARN: Code duplicated, block: B:167:0x02df  */
    /* JADX WARN: Code duplicated, block: B:172:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:178:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:? A[LOOP:4: B:126:0x024e->B:195:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0142  */
    /* JADX WARN: Code duplicated, block: B:89:0x019f  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d0  */
    public final ArrayList c(k33.i iVar, Collection collection) {
        u23.h annotations;
        p43.n0 type;
        h1 h1Var;
        boolean z14;
        ArrayList arrayList;
        ArrayList arrayList2;
        t23.r0 r0Var;
        h33.c cVar;
        r1 r1Var;
        p43.n0 n0VarA;
        p43.n0 returnType;
        m1 m1Var;
        boolean z15;
        o13.p pVar;
        ArrayList arrayList3;
        int i14;
        int i15;
        int i16;
        p43.n0 type2;
        t23.u0 u0VarI;
        Iterator it;
        boolean z16;
        t23.u0 u0VarI2;
        boolean zD;
        List<t23.j1> listF;
        Iterator<T> it3;
        p43.n0 type3;
        boolean z17;
        p43.n0 type4;
        r1 r1Var2;
        k33.i iVarQ;
        List<r1> list;
        w23.o0 o0Var;
        iVar.getClass();
        collection.getClass();
        Collection<t23.b> collection2 = collection;
        int i17 = 10;
        ArrayList arrayList4 = new ArrayList(p13.y.r(collection2, 10));
        for (t23.b bVarL0 : collection2) {
            if (bVarL0 instanceof j33.a) {
                boolean z18 = true;
                if (bVarL0.getKind() == t23.b.a.FAKE_OVERRIDE && bVarL0.a().o().size() == 1) {
                    i14 = 10;
                } else {
                    t23.h hVarW = og2.k.w(bVarL0);
                    if (hVarW == null) {
                        annotations = bVarL0.getAnnotations();
                    } else {
                        l33.m mVar = hVarW instanceof l33.m ? (l33.m) hVarW : null;
                        List list2 = mVar != null ? (List) mVar.f109775m.getValue() : null;
                        if (list2 == null || list2.isEmpty()) {
                            annotations = bVarL0.getAnnotations();
                        } else {
                            ArrayList arrayList5 = new ArrayList(p13.y.r(list2, i17));
                            Iterator it4 = list2.iterator();
                            while (it4.hasNext()) {
                                arrayList5.add(new l33.i(iVar, (o33.a) it4.next(), true));
                            }
                            u23.h.a aVar = u23.h.f168226x0;
                            ArrayList arrayListA0 = p13.h0.A0(bVarL0.getAnnotations(), arrayList5);
                            aVar.getClass();
                            annotations = u23.h.a.a(arrayListA0);
                        }
                    }
                    k33.i iVarQ2 = ge1.b.q(iVar, annotations);
                    t23.a aVar2 = (!(bVarL0 instanceof j33.f) || (o0Var = ((w23.n0) bVarL0).f181679z) == null || o0Var.f181654e) ? bVarL0 : o0Var;
                    if (bVarL0.I() != null) {
                        t23.v vVar = aVar2 instanceof t23.v ? (t23.v) aVar2 : null;
                        t23.a aVar3 = vVar != null ? (t23.j1) vVar.v(j33.e.T) : null;
                        type = a((j33.a) bVarL0, aVar3, false, aVar3 != null ? ge1.b.q(iVarQ2, aVar3.getAnnotations()) : iVarQ2, h33.c.VALUE_PARAMETER, null, false, i1.f135457a);
                    } else {
                        type = null;
                    }
                    j33.e eVar = bVarL0 instanceof j33.e ? (j33.e) bVarL0 : null;
                    if (eVar != null) {
                        q33.e0 e0Var = q33.e0.f142457a;
                        t23.l lVarD = eVar.d();
                        lVarD.getClass();
                        h1Var = (h1) g1.f135442d.get(oc.b.I(e0Var, (t23.e) lVarD, q33.b0.a(eVar, 3)));
                        if (h1Var != null) {
                            String str = h1Var.f135448c;
                            if (str != null && !d53.u.y(str, "2.", false)) {
                                vb.h.z("Check failed.");
                                return null;
                            }
                            if (str != null) {
                                h1Var = h1Var.f135449d;
                            }
                        } else {
                            h1Var = null;
                        }
                    } else {
                        h1Var = null;
                    }
                    if (h1Var != null) {
                        h1Var.f135447b.size();
                        ((j33.e) bVarL0).f().size();
                    }
                    h33.x xVar = iVar.f102785a.f102772v;
                    xVar.getClass();
                    if (xVar.f81512b.invoke(h33.u.f81500a) == h33.h0.STRICT) {
                        if ((bVarL0 instanceof t23.v) && p005kotlin.jvm.internal.s.g(bVarL0.v(j33.e.X), Boolean.TRUE)) {
                            z14 = true;
                        }
                        List<t23.j1> listF2 = aVar2.f();
                        listF2.getClass();
                        arrayList = new ArrayList(p13.y.r(listF2, i17));
                        for (t23.j1 j1Var : listF2) {
                            if (h1Var != null || (list = h1Var.f135447b) == null) {
                                r1Var2 = null;
                            } else {
                                r1Var2 = (r1) p13.h0.e0(j1Var.getIndex(), list);
                            }
                            e23.l j1Var2 = new j1(j1Var);
                            j33.a aVar4 = (j33.a) bVarL0;
                            if (j1Var != null) {
                                iVarQ = ge1.b.q(iVarQ2, j1Var.getAnnotations());
                            } else {
                                iVarQ = iVarQ2;
                            }
                            ArrayList arrayList6 = arrayList;
                            arrayList6.add(a(aVar4, j1Var, false, iVarQ, h33.c.VALUE_PARAMETER, r1Var2, z14, j1Var2));
                            arrayList = arrayList6;
                        }
                        arrayList2 = arrayList;
                        if (bVarL0 instanceof t23.r0) {
                            r0Var = (t23.r0) bVarL0;
                        } else {
                            r0Var = null;
                        }
                        if (r0Var == null && gl1.y.A(r0Var)) {
                            cVar = h33.c.FIELD;
                        } else {
                            cVar = h33.c.METHOD_RETURN_TYPE;
                        }
                        h33.c cVar2 = cVar;
                        if (h1Var != null) {
                            r1Var = h1Var.f135446a;
                        } else {
                            r1Var = null;
                        }
                        j33.a aVar5 = (j33.a) bVarL0;
                        n0VarA = a(aVar5, aVar2, true, iVarQ2, cVar2, r1Var, false, k1.f135470a);
                        returnType = bVarL0.getReturnType();
                        returnType.getClass();
                        m1Var = m1.f135479a;
                        if (d2.c(returnType, m1Var)) {
                            z15 = true;
                        } else {
                            u0VarI2 = bVarL0.I();
                            if (u0VarI2 != null || (type4 = u0VarI2.getType()) == null) {
                                zD = false;
                            } else {
                                zD = d2.d(type4, m1Var, null);
                            }
                            if (zD) {
                                z15 = true;
                            } else {
                                listF = bVarL0.f();
                                listF.getClass();
                                if (listF.isEmpty()) {
                                    z17 = false;
                                    break;
                                }
                                it3 = listF.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        z17 = false;
                                        break;
                                    }
                                    type3 = ((t23.j1) it3.next()).getType();
                                    type3.getClass();
                                    if (d2.c(type3, m1.f135479a)) {
                                        z17 = true;
                                        break;
                                    }
                                }
                                if (z17) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                            }
                        }
                        if (z15) {
                            pVar = new o13.p(e43.d.f62903a, new h33.k(bVarL0));
                        } else {
                            pVar = null;
                        }
                        if (type == null && n0VarA == null) {
                            if (arrayList2.isEmpty()) {
                                z18 = false;
                                break;
                            }
                            it = arrayList2.iterator();
                            do {
                                if (it.hasNext()) {
                                    z18 = false;
                                    break;
                                }
                                if (((p43.n0) it.next()) != null) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                            } while (!z16);
                            if (z18 && pVar == null) {
                                i14 = 10;
                            }
                        }
                        if (type == null) {
                            u0VarI = bVarL0.I();
                            if (u0VarI != null) {
                                type = u0VarI.getType();
                            } else {
                                type = null;
                            }
                        }
                        i14 = 10;
                        arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
                        i15 = 0;
                        for (Object obj : arrayList2) {
                            i16 = i15 + 1;
                            if (i15 >= 0) {
                                p13.x.q();
                                throw null;
                            }
                            type2 = (p43.n0) obj;
                            if (type2 == null) {
                                type2 = bVarL0.f().get(i15).getType();
                                type2.getClass();
                            }
                            arrayList3.add(type2);
                            i15 = i16;
                        }
                        if (n0VarA == null) {
                            n0VarA = bVarL0.getReturnType();
                            n0VarA.getClass();
                        }
                        bVarL0 = aVar5.l0(type, arrayList3, n0VarA, pVar);
                    } else {
                        iVarQ2.f102785a.f102770t.getClass();
                    }
                    z14 = false;
                    List<t23.j1> listF3 = aVar2.f();
                    listF3.getClass();
                    arrayList = new ArrayList(p13.y.r(listF3, i17));
                    while (r11.hasNext()) {
                        if (h1Var != null) {
                            r1Var2 = null;
                        } else {
                            r1Var2 = null;
                        }
                        e23.l j1Var3 = new j1(j1Var);
                        j33.a aVar6 = (j33.a) bVarL0;
                        if (j1Var != null) {
                            iVarQ = ge1.b.q(iVarQ2, j1Var.getAnnotations());
                        } else {
                            iVarQ = iVarQ2;
                        }
                        ArrayList arrayList7 = arrayList;
                        arrayList7.add(a(aVar6, j1Var, false, iVarQ, h33.c.VALUE_PARAMETER, r1Var2, z14, j1Var3));
                        arrayList = arrayList7;
                    }
                    arrayList2 = arrayList;
                    if (bVarL0 instanceof t23.r0) {
                        r0Var = (t23.r0) bVarL0;
                    } else {
                        r0Var = null;
                    }
                    if (r0Var == null) {
                        cVar = h33.c.METHOD_RETURN_TYPE;
                    } else {
                        cVar = h33.c.METHOD_RETURN_TYPE;
                    }
                    h33.c cVar3 = cVar;
                    if (h1Var != null) {
                        r1Var = h1Var.f135446a;
                    } else {
                        r1Var = null;
                    }
                    j33.a aVar7 = (j33.a) bVarL0;
                    n0VarA = a(aVar7, aVar2, true, iVarQ2, cVar3, r1Var, false, k1.f135470a);
                    returnType = bVarL0.getReturnType();
                    returnType.getClass();
                    m1Var = m1.f135479a;
                    if (d2.c(returnType, m1Var)) {
                        z15 = true;
                    } else {
                        u0VarI2 = bVarL0.I();
                        if (u0VarI2 != null) {
                            zD = false;
                        } else {
                            zD = false;
                        }
                        if (zD) {
                            listF = bVarL0.f();
                            listF.getClass();
                            if (listF.isEmpty()) {
                                z17 = false;
                                break;
                            }
                            it3 = listF.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    z17 = false;
                                    break;
                                }
                                type3 = ((t23.j1) it3.next()).getType();
                                type3.getClass();
                                if (d2.c(type3, m1.f135479a)) {
                                    z17 = true;
                                    break;
                                }
                            }
                            if (z17) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        } else {
                            z15 = true;
                        }
                    }
                    if (z15) {
                        pVar = new o13.p(e43.d.f62903a, new h33.k(bVarL0));
                    } else {
                        pVar = null;
                    }
                    if (type == null) {
                        if (arrayList2.isEmpty()) {
                            z18 = false;
                            break;
                        }
                        it = arrayList2.iterator();
                        do {
                            if (it.hasNext()) {
                                z18 = false;
                                break;
                            }
                            if (((p43.n0) it.next()) != null) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                        } while (!z16);
                        if (z18) {
                        }
                    }
                    if (type == null) {
                        u0VarI = bVarL0.I();
                        if (u0VarI != null) {
                            type = u0VarI.getType();
                        } else {
                            type = null;
                        }
                    }
                    i14 = 10;
                    arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
                    i15 = 0;
                    while (r3.hasNext()) {
                        i16 = i15 + 1;
                        if (i15 >= 0) {
                            p13.x.q();
                            throw null;
                        }
                        type2 = (p43.n0) obj;
                        if (type2 == null) {
                            type2 = bVarL0.f().get(i15).getType();
                            type2.getClass();
                        }
                        arrayList3.add(type2);
                        i15 = i16;
                    }
                    if (n0VarA == null) {
                        n0VarA = bVarL0.getReturnType();
                        n0VarA.getClass();
                    }
                    bVarL0 = aVar7.l0(type, arrayList3, n0VarA, pVar);
                }
            } else {
                i14 = i17;
            }
            arrayList4.add(bVarL0);
            i17 = i14;
        }
        return arrayList4;
    }
}
