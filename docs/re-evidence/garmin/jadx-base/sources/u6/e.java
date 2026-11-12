package u6;

import j20.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t6.f f168795a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t6.f f168798d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b.InterfaceC3163b f168800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b.a f168801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<m> f168802h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f168796b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f168797c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<p> f168799e = new ArrayList<>();

    public e(t6.f fVar) {
        new ArrayList();
        this.f168800f = null;
        this.f168801g = new b.a();
        this.f168802h = new ArrayList<>();
        this.f168795a = fVar;
        this.f168798d = fVar;
    }

    public final void a(f fVar, int i14, int i15, ArrayList arrayList, m mVar) {
        int i16;
        ArrayList arrayList2;
        p pVar = fVar.f168806d;
        m mVar2 = pVar.f168841c;
        f fVar2 = pVar.f168847i;
        f fVar3 = pVar.f168846h;
        if (mVar2 == null) {
            t6.f fVar4 = this.f168795a;
            if (pVar == fVar4.f162608d || pVar == fVar4.f162610e) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i15);
                arrayList.add(mVar);
            }
            m mVar3 = mVar;
            pVar.f168841c = mVar3;
            mVar3.f168829b.add(pVar);
            for (d dVar : fVar3.f168813k) {
                if (dVar instanceof f) {
                    i16 = i14;
                    arrayList2 = arrayList;
                    a((f) dVar, i16, 0, arrayList2, mVar3);
                } else {
                    i16 = i14;
                    arrayList2 = arrayList;
                }
                i14 = i16;
                arrayList = arrayList2;
            }
            int i17 = i14;
            ArrayList arrayList3 = arrayList;
            for (d dVar2 : fVar2.f168813k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i17, 1, arrayList3, mVar3);
                }
            }
            if (i17 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f168830k.f168813k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i17, 2, arrayList3, mVar3);
                    }
                }
            }
            Iterator it = fVar3.f168814l.iterator();
            while (it.hasNext()) {
                a((f) it.next(), i17, 0, arrayList3, mVar3);
            }
            Iterator it3 = fVar2.f168814l.iterator();
            while (it3.hasNext()) {
                a((f) it3.next(), i17, 1, arrayList3, mVar3);
            }
            if (i17 == 1 && (pVar instanceof n)) {
                Iterator it4 = ((n) pVar).f168830k.f168814l.iterator();
                while (it4.hasNext()) {
                    a((f) it4.next(), i17, 2, arrayList3, mVar3);
                }
            }
        }
    }

    public final void b(t6.f fVar) {
        char c14;
        t6.e.b bVar;
        t6.e.b bVar2;
        t6.e.b bVar3;
        t6.e.b bVar4;
        Iterator<t6.e> it = fVar.f162695w0.iterator();
        while (it.hasNext()) {
            t6.e next = it.next();
            t6.e.b[] bVarArr = next.W;
            t6.d[] dVarArr = next.T;
            t6.d dVar = next.O;
            t6.d dVar2 = next.M;
            t6.d dVar3 = next.N;
            t6.d dVar4 = next.L;
            t6.e.b bVar5 = bVarArr[0];
            t6.e.b bVar6 = bVarArr[1];
            if (next.f162623k0 == 8) {
                next.f162602a = true;
            } else {
                float f14 = next.f162648y;
                if (f14 < 1.0f && bVar5 == t6.e.b.MATCH_CONSTRAINT) {
                    next.f162640t = 2;
                }
                float f15 = next.B;
                if (f15 < 1.0f) {
                    c14 = 0;
                    if (bVar6 == t6.e.b.MATCH_CONSTRAINT) {
                        next.f162642u = 2;
                    }
                } else {
                    c14 = 0;
                }
                if (next.f162603a0 > 0.0f) {
                    t6.e.b bVar7 = t6.e.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == t6.e.b.WRAP_CONTENT || bVar6 == t6.e.b.FIXED)) {
                        next.f162640t = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == t6.e.b.WRAP_CONTENT || bVar5 == t6.e.b.FIXED)) {
                        next.f162642u = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (next.f162640t == 0) {
                            next.f162640t = 3;
                        }
                        if (next.f162642u == 0) {
                            next.f162642u = 3;
                        }
                    }
                }
                t6.e.b bVar8 = t6.e.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && next.f162640t == 1 && (dVar4.f162588f == null || dVar3.f162588f == null)) {
                    bVar5 = t6.e.b.WRAP_CONTENT;
                }
                if (bVar6 == bVar8 && next.f162642u == 1 && (dVar2.f162588f == null || dVar.f162588f == null)) {
                    bVar6 = t6.e.b.WRAP_CONTENT;
                }
                l lVar = next.f162608d;
                lVar.f168842d = bVar5;
                int i14 = next.f162640t;
                lVar.f168839a = i14;
                n nVar = next.f162610e;
                nVar.f168842d = bVar6;
                int i15 = next.f162642u;
                nVar.f168839a = i15;
                t6.e.b bVar9 = t6.e.b.MATCH_PARENT;
                Iterator<t6.e> it3 = it;
                if ((bVar5 == bVar9 || bVar5 == t6.e.b.FIXED || bVar5 == t6.e.b.WRAP_CONTENT) && (bVar6 == bVar9 || bVar6 == t6.e.b.FIXED || bVar6 == t6.e.b.WRAP_CONTENT)) {
                    t6.e.b bVar10 = bVar6;
                    int iS = next.s();
                    if (bVar5 == bVar9) {
                        iS = (fVar.s() - dVar4.f162589g) - dVar3.f162589g;
                        bVar5 = t6.e.b.FIXED;
                    }
                    int iM = next.m();
                    if (bVar10 == bVar9) {
                        iM = (fVar.m() - dVar2.f162589g) - dVar.f162589g;
                        bVar10 = t6.e.b.FIXED;
                    }
                    f(next, bVar5, iS, bVar10, iM);
                    next.f162608d.f168843e.d(next.s());
                    next.f162610e.f168843e.d(next.m());
                    next.f162602a = true;
                } else {
                    if (bVar5 != bVar8 || (bVar6 != (bVar4 = t6.e.b.WRAP_CONTENT) && bVar6 != t6.e.b.FIXED)) {
                        bVar = bVar6;
                    } else if (i14 == 3) {
                        if (bVar6 == bVar4) {
                            f(next, bVar4, 0, bVar4, 0);
                        }
                        int iM2 = next.m();
                        int i16 = (int) ((iM2 * next.f162603a0) + 0.5f);
                        t6.e.b bVar11 = t6.e.b.FIXED;
                        f(next, bVar11, i16, bVar11, iM2);
                        next.f162608d.f168843e.d(next.s());
                        next.f162610e.f168843e.d(next.m());
                        next.f162602a = true;
                    } else if (i14 == 1) {
                        f(next, bVar4, 0, bVar6, 0);
                        next.f162608d.f168843e.f168824m = next.s();
                    } else {
                        bVar = bVar6;
                        if (i14 == 2) {
                            t6.e.b bVar12 = fVar.W[c14];
                            t6.e.b bVar13 = t6.e.b.FIXED;
                            if (bVar12 == bVar13 || bVar12 == bVar9) {
                                f(next, bVar13, (int) ((f14 * fVar.s()) + 0.5f), bVar, next.m());
                                next.f162608d.f168843e.d(next.s());
                                next.f162610e.f168843e.d(next.m());
                                next.f162602a = true;
                            }
                        } else if (dVarArr[c14].f162588f == null || dVarArr[1].f162588f == null) {
                            f(next, bVar4, 0, bVar, 0);
                            next.f162608d.f168843e.d(next.s());
                            next.f162610e.f168843e.d(next.m());
                            next.f162602a = true;
                        }
                    }
                    if (bVar != bVar8 || (bVar5 != (bVar3 = t6.e.b.WRAP_CONTENT) && bVar5 != t6.e.b.FIXED)) {
                        bVar2 = bVar;
                    } else if (i15 == 3) {
                        if (bVar5 == bVar3) {
                            f(next, bVar3, 0, bVar3, 0);
                        }
                        int iS2 = next.s();
                        float f16 = next.f162603a0;
                        if (next.f162605b0 == -1) {
                            f16 = 1.0f / f16;
                        }
                        t6.e.b bVar14 = t6.e.b.FIXED;
                        f(next, bVar14, iS2, bVar14, (int) ((iS2 * f16) + 0.5f));
                        next.f162608d.f168843e.d(next.s());
                        next.f162610e.f168843e.d(next.m());
                        next.f162602a = true;
                    } else if (i15 == 1) {
                        f(next, bVar5, 0, bVar3, 0);
                        next.f162610e.f168843e.f168824m = next.m();
                    } else {
                        t6.e.b bVar15 = bVar5;
                        if (i15 == 2) {
                            t6.e.b bVar16 = fVar.W[1];
                            t6.e.b bVar17 = bVar;
                            t6.e.b bVar18 = t6.e.b.FIXED;
                            if (bVar16 == bVar18 || bVar16 == bVar9) {
                                f(next, bVar15, next.s(), bVar18, (int) ((f15 * fVar.m()) + 0.5f));
                                next.f162608d.f168843e.d(next.s());
                                next.f162610e.f168843e.d(next.m());
                                next.f162602a = true;
                            } else {
                                bVar2 = bVar17;
                                bVar5 = bVar15;
                            }
                        } else {
                            bVar5 = bVar15;
                            t6.e.b bVar19 = bVar;
                            if (dVarArr[2].f162588f == null || dVarArr[3].f162588f == null) {
                                f(next, bVar3, 0, bVar19, 0);
                                next.f162608d.f168843e.d(next.s());
                                next.f162610e.f168843e.d(next.m());
                                next.f162602a = true;
                            } else {
                                bVar2 = bVar19;
                            }
                        }
                    }
                    if (bVar5 == bVar8 && bVar2 == bVar8) {
                        if (i14 == 1 || i15 == 1) {
                            t6.e.b bVar20 = t6.e.b.WRAP_CONTENT;
                            f(next, bVar20, 0, bVar20, 0);
                            next.f162608d.f168843e.f168824m = next.s();
                            next.f162610e.f168843e.f168824m = next.m();
                        } else if (i15 == 2 && i14 == 2) {
                            t6.e.b[] bVarArr2 = fVar.W;
                            t6.e.b bVar21 = bVarArr2[c14];
                            t6.e.b bVar22 = t6.e.b.FIXED;
                            if (bVar21 == bVar22 && bVarArr2[1] == bVar22) {
                                f(next, bVar22, (int) ((f14 * fVar.s()) + 0.5f), bVar22, (int) ((f15 * fVar.m()) + 0.5f));
                                next.f162608d.f168843e.d(next.s());
                                next.f162610e.f168843e.d(next.m());
                                next.f162602a = true;
                            }
                        }
                    }
                }
                it = it3;
            }
        }
    }

    public final void c() {
        ArrayList<p> arrayList = this.f168799e;
        arrayList.clear();
        t6.f fVar = this.f168798d;
        fVar.f162608d.f();
        fVar.f162610e.f();
        arrayList.add(fVar.f162608d);
        arrayList.add(fVar.f162610e);
        HashSet hashSet = null;
        for (t6.e eVar : fVar.f162695w0) {
            if (eVar instanceof t6.h) {
                arrayList.add(new j(eVar));
            } else {
                if (eVar.z()) {
                    if (eVar.f162604b == null) {
                        eVar.f162604b = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f162604b);
                } else {
                    arrayList.add(eVar.f162608d);
                }
                if (eVar.A()) {
                    if (eVar.f162606c == null) {
                        eVar.f162606c = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f162606c);
                } else {
                    arrayList.add(eVar.f162610e);
                }
                if (eVar instanceof t6.i) {
                    arrayList.add(new k(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        for (p pVar : arrayList) {
            if (pVar.f168840b != fVar) {
                pVar.d();
            }
        }
        ArrayList<m> arrayList2 = this.f168802h;
        arrayList2.clear();
        t6.f fVar2 = this.f168795a;
        e(fVar2.f162608d, 0, arrayList2);
        e(fVar2.f162610e, 1, arrayList2);
        this.f168796b = false;
    }

    public final int d(t6.f fVar, int i14) {
        ArrayList<m> arrayList;
        int i15;
        long j8;
        float f14;
        long j14;
        ArrayList<m> arrayList2 = this.f168802h;
        int size = arrayList2.size();
        long j15 = 0;
        int i16 = 0;
        long jMax = 0;
        while (i16 < size) {
            p pVar = arrayList2.get(i16).f168828a;
            if (!(pVar instanceof c) ? !(i14 != 0 ? (pVar instanceof n) : (pVar instanceof l)) : ((c) pVar).f168844f != i14) {
                f fVar2 = (i14 == 0 ? fVar.f162608d : fVar.f162610e).f168846h;
                f fVar3 = (i14 == 0 ? fVar.f162608d : fVar.f162610e).f168847i;
                f fVar4 = pVar.f168846h;
                f fVar5 = pVar.f168847i;
                boolean zContains = fVar4.f168814l.contains(fVar2);
                boolean zContains2 = fVar5.f168814l.contains(fVar3);
                long j16 = pVar.j();
                if (zContains && zContains2) {
                    long jB = m.b(fVar4, j15);
                    long jA = m.a(fVar5, j15);
                    long j17 = jB - j16;
                    int i17 = fVar5.f168808f;
                    arrayList = arrayList2;
                    i15 = size;
                    if (j17 >= (-i17)) {
                        j17 += (long) i17;
                    }
                    long j18 = fVar4.f168808f;
                    long j19 = ((-jA) - j16) - j18;
                    if (j19 >= j18) {
                        j19 -= j18;
                    }
                    t6.e eVar = pVar.f168840b;
                    if (i14 == 0) {
                        f14 = eVar.f162617h0;
                    } else if (i14 == 1) {
                        f14 = eVar.f162619i0;
                    } else {
                        eVar.getClass();
                        f14 = -1.0f;
                    }
                    if (f14 > 0.0f) {
                        j14 = (long) ((j17 / (1.0f - f14)) + (j19 / f14));
                    } else {
                        j14 = 0;
                    }
                    float f15 = j14;
                    j8 = (((long) fVar4.f168808f) + ((((long) ((f15 * f14) + 0.5f)) + j16) + ((long) x.a(1.0f, f14, f15, 0.5f)))) - ((long) fVar5.f168808f);
                } else {
                    arrayList = arrayList2;
                    i15 = size;
                    if (zContains) {
                        j8 = Math.max(m.b(fVar4, fVar4.f168808f), ((long) fVar4.f168808f) + j16);
                    } else if (zContains2) {
                        j8 = Math.max(-m.a(fVar5, fVar5.f168808f), ((long) (-fVar5.f168808f)) + j16);
                    } else {
                        j8 = (pVar.j() + ((long) fVar4.f168808f)) - ((long) fVar5.f168808f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i15 = size;
                j8 = j15;
            }
            jMax = Math.max(jMax, j8);
            i16++;
            arrayList2 = arrayList;
            size = i15;
            j15 = 0;
        }
        return (int) jMax;
    }

    public final void e(p pVar, int i14, ArrayList<m> arrayList) {
        f fVar = pVar.f168846h;
        f fVar2 = pVar.f168847i;
        for (d dVar : fVar.f168813k) {
            if (dVar instanceof f) {
                a((f) dVar, i14, 0, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f168846h, i14, 0, arrayList, null);
            }
        }
        for (d dVar2 : fVar2.f168813k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i14, 1, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f168847i, i14, 1, arrayList, null);
            }
        }
        int i15 = i14;
        if (i15 == 1) {
            for (d dVar3 : ((n) pVar).f168830k.f168813k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i15, 2, arrayList, null);
                }
                i15 = i14;
            }
        }
    }

    public final void f(t6.e eVar, t6.e.b bVar, int i14, t6.e.b bVar2, int i15) {
        b.a aVar = this.f168801g;
        aVar.f168783a = bVar;
        aVar.f168784b = bVar2;
        aVar.f168785c = i14;
        aVar.f168786d = i15;
        this.f168800f.a(eVar, aVar);
        eVar.T(aVar.f168787e);
        eVar.O(aVar.f168788f);
        eVar.G = aVar.f168790h;
        eVar.K(aVar.f168789g);
    }

    public final void g() {
        a aVar;
        for (t6.e eVar : this.f168795a.f162695w0) {
            if (!eVar.f162602a) {
                t6.e.b[] bVarArr = eVar.W;
                boolean z14 = false;
                t6.e.b bVar = bVarArr[0];
                t6.e.b bVar2 = bVarArr[1];
                int i14 = eVar.f162640t;
                int i15 = eVar.f162642u;
                t6.e.b bVar3 = t6.e.b.WRAP_CONTENT;
                boolean z15 = bVar == bVar3 || (bVar == t6.e.b.MATCH_CONSTRAINT && i14 == 1);
                if (bVar2 == bVar3 || (bVar2 == t6.e.b.MATCH_CONSTRAINT && i15 == 1)) {
                    z14 = true;
                }
                g gVar = eVar.f162608d.f168843e;
                boolean z16 = gVar.f168812j;
                g gVar2 = eVar.f162610e.f168843e;
                boolean z17 = gVar2.f168812j;
                if (z16 && z17) {
                    t6.e.b bVar4 = t6.e.b.FIXED;
                    f(eVar, bVar4, gVar.f168809g, bVar4, gVar2.f168809g);
                    eVar.f162602a = true;
                } else if (z16 && z14) {
                    f(eVar, t6.e.b.FIXED, gVar.f168809g, bVar3, gVar2.f168809g);
                    t6.e.b bVar5 = t6.e.b.MATCH_CONSTRAINT;
                    n nVar = eVar.f162610e;
                    if (bVar2 == bVar5) {
                        nVar.f168843e.f168824m = eVar.m();
                    } else {
                        nVar.f168843e.d(eVar.m());
                        eVar.f162602a = true;
                    }
                } else if (z17 && z15) {
                    f(eVar, bVar3, gVar.f168809g, t6.e.b.FIXED, gVar2.f168809g);
                    t6.e.b bVar6 = t6.e.b.MATCH_CONSTRAINT;
                    l lVar = eVar.f162608d;
                    if (bVar == bVar6) {
                        lVar.f168843e.f168824m = eVar.s();
                    } else {
                        lVar.f168843e.d(eVar.s());
                        eVar.f162602a = true;
                    }
                }
                if (eVar.f162602a && (aVar = eVar.f162610e.f168831l) != null) {
                    aVar.d(eVar.f162611e0);
                }
            }
        }
    }
}
