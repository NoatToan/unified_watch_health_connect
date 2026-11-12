package m6;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f116819q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static e f116820r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f116824d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f116833m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f116836p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f116821a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f116822b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f116823c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f116825e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f116826f = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f116828h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean[] f116829i = new boolean[32];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f116830j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f116831k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f116832l = 32;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h[] f116834n = new h[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f116835o = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b[] f116827g = new b[32];

    public interface a {
        h a(boolean[] zArr);
    }

    public d() {
        s();
        c cVar = new c();
        this.f116833m = cVar;
        this.f116824d = new g(cVar);
        this.f116836p = new b(cVar);
    }

    public static int n(Object obj) {
        h hVar = ((t6.d) obj).f162591i;
        if (hVar != null) {
            return (int) (hVar.f116858f + 0.5f);
        }
        return 0;
    }

    public final h a(h.a aVar, String str) {
        f fVar = this.f116833m.f116817b;
        int i14 = fVar.f116846b;
        Object obj = null;
        if (i14 > 0) {
            int i15 = i14 - 1;
            Object[] objArr = fVar.f116845a;
            Object obj2 = objArr[i15];
            objArr[i15] = null;
            fVar.f116846b = i15;
            obj = obj2;
        }
        h hVar = (h) obj;
        if (hVar == null) {
            hVar = new h(aVar, str);
            hVar.f116862j = aVar;
        } else {
            hVar.c();
            hVar.f116862j = aVar;
        }
        int i16 = this.f116835o;
        int i17 = this.f116821a;
        if (i16 >= i17) {
            int i18 = i17 * 2;
            this.f116821a = i18;
            this.f116834n = (h[]) Arrays.copyOf(this.f116834n, i18);
        }
        h[] hVarArr = this.f116834n;
        int i19 = this.f116835o;
        this.f116835o = i19 + 1;
        hVarArr[i19] = hVar;
        return hVar;
    }

    public final void b(h hVar, h hVar2, int i14, float f14, h hVar3, h hVar4, int i15, int i16) {
        b bVarL = l();
        if (hVar2 == hVar3) {
            bVarL.f116814d.k(hVar, 1.0f);
            bVarL.f116814d.k(hVar4, 1.0f);
            bVarL.f116814d.k(hVar2, -2.0f);
        } else {
            b.a aVar = bVarL.f116814d;
            if (f14 == 0.5f) {
                aVar.k(hVar, 1.0f);
                bVarL.f116814d.k(hVar2, -1.0f);
                bVarL.f116814d.k(hVar3, -1.0f);
                bVarL.f116814d.k(hVar4, 1.0f);
                if (i14 > 0 || i15 > 0) {
                    bVarL.f116812b = (-i14) + i15;
                }
            } else if (f14 <= 0.0f) {
                aVar.k(hVar, -1.0f);
                bVarL.f116814d.k(hVar2, 1.0f);
                bVarL.f116812b = i14;
            } else if (f14 >= 1.0f) {
                aVar.k(hVar4, -1.0f);
                bVarL.f116814d.k(hVar3, 1.0f);
                bVarL.f116812b = -i15;
            } else {
                float f15 = 1.0f - f14;
                aVar.k(hVar, f15 * 1.0f);
                bVarL.f116814d.k(hVar2, f15 * (-1.0f));
                bVarL.f116814d.k(hVar3, (-1.0f) * f14);
                bVarL.f116814d.k(hVar4, 1.0f * f14);
                if (i14 > 0 || i15 > 0) {
                    bVarL.f116812b = (i15 * f14) + ((-i14) * f15);
                }
            }
        }
        if (i16 != 8) {
            bVarL.b(this, i16);
        }
        c(bVarL);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0197  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e3  */
    public final void c(b bVar) {
        boolean z14;
        boolean z15;
        h hVarF;
        boolean z16 = true;
        if (this.f116831k + 1 >= this.f116832l || this.f116830j + 1 >= this.f116826f) {
            o();
        }
        if (bVar.f116815e) {
            z14 = false;
        } else {
            ArrayList<h> arrayList = bVar.f116813c;
            if (this.f116827g.length != 0) {
                boolean z17 = false;
                while (!z17) {
                    int iJ = bVar.f116814d.j();
                    for (int i14 = 0; i14 < iJ; i14++) {
                        h hVarH = bVar.f116814d.h(i14);
                        if (hVarH.f116856d != -1 || hVarH.f116859g) {
                            arrayList.add(hVarH);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i15 = 0; i15 < size; i15++) {
                            h hVar = arrayList.get(i15);
                            if (hVar.f116859g) {
                                bVar.h(this, hVar, true);
                            } else {
                                bVar.i(this, this.f116827g[hVar.f116856d], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z17 = true;
                    }
                }
                if (bVar.f116811a != null && bVar.f116814d.j() == 0) {
                    bVar.f116815e = true;
                    this.f116822b = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f14 = bVar.f116812b;
            float f15 = 0.0f;
            if (f14 < 0.0f) {
                bVar.f116812b = f14 * (-1.0f);
                bVar.f116814d.e();
            }
            int iJ2 = bVar.f116814d.j();
            float f16 = 0.0f;
            float f17 = 0.0f;
            h hVar2 = null;
            h hVar3 = null;
            int i16 = 0;
            boolean z18 = false;
            boolean z19 = false;
            while (i16 < iJ2) {
                float f18 = bVar.f116814d.f(i16);
                h hVarH2 = bVar.f116814d.h(i16);
                float f19 = f15;
                if (hVarH2.f116862j == h.a.UNRESTRICTED) {
                    if (hVar2 == null) {
                        if (hVarH2.f116865m <= 1) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        hVar2 = hVarH2;
                        f16 = f18;
                    } else {
                        if (f16 > f18) {
                            if (hVarH2.f116865m > 1) {
                                z18 = false;
                            }
                            hVar2 = hVarH2;
                            f16 = f18;
                        } else if (z18 || hVarH2.f116865m > 1) {
                        }
                        z18 = true;
                        hVar2 = hVarH2;
                        f16 = f18;
                    }
                } else if (hVar2 == null && f18 < f19) {
                    if (hVar3 == null) {
                        if (hVarH2.f116865m <= 1) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        hVar3 = hVarH2;
                        f17 = f18;
                    } else {
                        if (f17 > f18) {
                            if (hVarH2.f116865m > 1) {
                                z19 = false;
                            }
                            hVar3 = hVarH2;
                            f17 = f18;
                        } else if (z19 || hVarH2.f116865m > 1) {
                        }
                        z19 = true;
                        hVar3 = hVarH2;
                        f17 = f18;
                    }
                }
                i16++;
                f15 = f19;
            }
            float f22 = f15;
            if (hVar2 == null) {
                hVar2 = hVar3;
            }
            if (hVar2 == null) {
                z15 = true;
            } else {
                bVar.g(hVar2);
                z15 = false;
            }
            if (bVar.f116814d.j() == 0) {
                bVar.f116815e = true;
            }
            if (z15) {
                if (this.f116830j + 1 >= this.f116826f) {
                    o();
                }
                h hVarA = a(h.a.SLACK, null);
                int i17 = this.f116823c + 1;
                this.f116823c = i17;
                this.f116830j++;
                hVarA.f116855c = i17;
                c cVar = this.f116833m;
                cVar.f116818c[i17] = hVarA;
                bVar.f116811a = hVarA;
                int i18 = this.f116831k;
                h(bVar);
                if (this.f116831k == i18 + 1) {
                    b bVar2 = this.f116836p;
                    bVar2.f116811a = null;
                    bVar2.f116814d.clear();
                    for (int i19 = 0; i19 < bVar.f116814d.j(); i19++) {
                        bVar2.f116814d.g(bVar.f116814d.h(i19), bVar.f116814d.f(i19), true);
                    }
                    r(this.f116836p);
                    if (hVarA.f116856d == -1) {
                        if (bVar.f116811a == hVarA && (hVarF = bVar.f(null, hVarA)) != null) {
                            bVar.g(hVarF);
                        }
                        if (!bVar.f116815e) {
                            bVar.f116811a.e(this, bVar);
                        }
                        cVar.f116816a.a(bVar);
                        this.f116831k--;
                    }
                } else {
                    z16 = false;
                }
            } else {
                z16 = false;
            }
            h hVar4 = bVar.f116811a;
            if (hVar4 == null) {
                return;
            }
            if (hVar4.f116862j != h.a.UNRESTRICTED && bVar.f116812b < f22) {
                return;
            } else {
                z14 = z16;
            }
        }
        if (z14) {
            return;
        }
        h(bVar);
    }

    public final void d(h hVar, int i14) {
        int i15 = hVar.f116856d;
        if (i15 == -1) {
            hVar.d(this, i14);
            for (int i16 = 0; i16 < this.f116823c + 1; i16++) {
                h hVar2 = this.f116833m.f116818c[i16];
            }
            return;
        }
        if (i15 == -1) {
            b bVarL = l();
            bVarL.f116811a = hVar;
            float f14 = i14;
            hVar.f116858f = f14;
            bVarL.f116812b = f14;
            bVarL.f116815e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f116827g[i15];
        if (bVar.f116815e) {
            bVar.f116812b = i14;
            return;
        }
        if (bVar.f116814d.j() == 0) {
            bVar.f116815e = true;
            bVar.f116812b = i14;
            return;
        }
        b bVarL2 = l();
        if (i14 < 0) {
            bVarL2.f116812b = i14 * (-1);
            bVarL2.f116814d.k(hVar, 1.0f);
        } else {
            bVarL2.f116812b = i14;
            bVarL2.f116814d.k(hVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(h hVar, h hVar2, int i14, int i15) {
        if (i15 == 8 && hVar2.f116859g && hVar.f116856d == -1) {
            hVar.d(this, hVar2.f116858f + i14);
            return;
        }
        b bVarL = l();
        boolean z14 = false;
        if (i14 != 0) {
            if (i14 < 0) {
                i14 *= -1;
                z14 = true;
            }
            bVarL.f116812b = i14;
        }
        b.a aVar = bVarL.f116814d;
        if (z14) {
            aVar.k(hVar, 1.0f);
            bVarL.f116814d.k(hVar2, -1.0f);
        } else {
            aVar.k(hVar, -1.0f);
            bVarL.f116814d.k(hVar2, 1.0f);
        }
        if (i15 != 8) {
            bVarL.b(this, i15);
        }
        c(bVarL);
    }

    public final void f(h hVar, h hVar2, int i14, int i15) {
        b bVarL = l();
        h hVarM = m();
        hVarM.f116857e = 0;
        bVarL.c(hVar, hVar2, hVarM, i14);
        if (i15 != 8) {
            bVarL.f116814d.k(j(i15, null), (int) (bVarL.f116814d.i(hVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(h hVar, h hVar2, int i14, int i15) {
        b bVarL = l();
        h hVarM = m();
        hVarM.f116857e = 0;
        bVarL.d(hVar, hVar2, hVarM, i14);
        if (i15 != 8) {
            bVarL.f116814d.k(j(i15, null), (int) (bVarL.f116814d.i(hVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i14;
        if (bVar.f116815e) {
            bVar.f116811a.d(this, bVar.f116812b);
        } else {
            b[] bVarArr = this.f116827g;
            int i15 = this.f116831k;
            bVarArr[i15] = bVar;
            h hVar = bVar.f116811a;
            hVar.f116856d = i15;
            this.f116831k = i15 + 1;
            hVar.e(this, bVar);
        }
        if (this.f116822b) {
            int i16 = 0;
            while (i16 < this.f116831k) {
                if (this.f116827g[i16] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f116827g[i16];
                if (bVar2 != null && bVar2.f116815e) {
                    bVar2.f116811a.d(this, bVar2.f116812b);
                    this.f116833m.f116816a.a(bVar2);
                    this.f116827g[i16] = null;
                    int i17 = i16 + 1;
                    int i18 = i17;
                    while (true) {
                        i14 = this.f116831k;
                        if (i17 >= i14) {
                            break;
                        }
                        b[] bVarArr2 = this.f116827g;
                        int i19 = i17 - 1;
                        b bVar3 = bVarArr2[i17];
                        bVarArr2[i19] = bVar3;
                        h hVar2 = bVar3.f116811a;
                        if (hVar2.f116856d == i17) {
                            hVar2.f116856d = i19;
                        }
                        i18 = i17;
                        i17++;
                    }
                    if (i18 < i14) {
                        this.f116827g[i18] = null;
                    }
                    this.f116831k = i14 - 1;
                    i16--;
                }
                i16++;
            }
            this.f116822b = false;
        }
    }

    public final void i() {
        for (int i14 = 0; i14 < this.f116831k; i14++) {
            b bVar = this.f116827g[i14];
            bVar.f116811a.f116858f = bVar.f116812b;
        }
    }

    public final h j(int i14, String str) {
        if (this.f116830j + 1 >= this.f116826f) {
            o();
        }
        h hVarA = a(h.a.ERROR, str);
        float[] fArr = hVarA.f116861i;
        int i15 = this.f116823c + 1;
        this.f116823c = i15;
        this.f116830j++;
        hVarA.f116855c = i15;
        hVarA.f116857e = i14;
        this.f116833m.f116818c[i15] = hVarA;
        g gVar = this.f116824d;
        gVar.f116850i.f116851a = hVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[hVarA.f116857e] = 1.0f;
        gVar.j(hVarA);
        return hVarA;
    }

    public final h k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f116830j + 1 >= this.f116826f) {
            o();
        }
        if (!(obj instanceof t6.d)) {
            return null;
        }
        t6.d dVar = (t6.d) obj;
        h hVar = dVar.f162591i;
        if (hVar == null) {
            dVar.k();
            hVar = dVar.f162591i;
        }
        int i14 = hVar.f116855c;
        c cVar = this.f116833m;
        if (i14 != -1 && i14 <= this.f116823c && cVar.f116818c[i14] != null) {
            return hVar;
        }
        if (i14 != -1) {
            hVar.c();
        }
        int i15 = this.f116823c + 1;
        this.f116823c = i15;
        this.f116830j++;
        hVar.f116855c = i15;
        hVar.f116862j = h.a.UNRESTRICTED;
        cVar.f116818c[i15] = hVar;
        return hVar;
    }

    public final b l() {
        Object obj;
        c cVar = this.f116833m;
        f fVar = cVar.f116816a;
        int i14 = fVar.f116846b;
        if (i14 > 0) {
            int i15 = i14 - 1;
            Object[] objArr = fVar.f116845a;
            obj = objArr[i15];
            objArr[i15] = null;
            fVar.f116846b = i15;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(cVar);
        }
        bVar.f116811a = null;
        bVar.f116814d.clear();
        bVar.f116812b = 0.0f;
        bVar.f116815e = false;
        return bVar;
    }

    public final h m() {
        if (this.f116830j + 1 >= this.f116826f) {
            o();
        }
        h hVarA = a(h.a.SLACK, null);
        int i14 = this.f116823c + 1;
        this.f116823c = i14;
        this.f116830j++;
        hVarA.f116855c = i14;
        this.f116833m.f116818c[i14] = hVarA;
        return hVarA;
    }

    public final void o() {
        int i14 = this.f116825e * 2;
        this.f116825e = i14;
        this.f116827g = (b[]) Arrays.copyOf(this.f116827g, i14);
        c cVar = this.f116833m;
        cVar.f116818c = (h[]) Arrays.copyOf(cVar.f116818c, this.f116825e);
        int i15 = this.f116825e;
        this.f116829i = new boolean[i15];
        this.f116826f = i15;
        this.f116832l = i15;
        e eVar = f116820r;
        if (eVar != null) {
            eVar.f116838b = Math.max(eVar.f116838b, i15);
            long j8 = f116820r.f116838b;
        }
    }

    public final void p() {
        g gVar = this.f116824d;
        if (gVar.e()) {
            i();
            return;
        }
        if (!this.f116828h) {
            q(gVar);
            return;
        }
        e eVar = f116820r;
        if (eVar != null) {
            eVar.f116839c++;
        }
        for (int i14 = 0; i14 < this.f116831k; i14++) {
            if (!this.f116827g[i14].f116815e) {
                q(gVar);
                return;
            }
        }
        i();
    }

    public final void q(g gVar) {
        e eVar = f116820r;
        if (eVar != null) {
            eVar.f116842f = Math.max(eVar.f116842f, this.f116830j);
            e eVar2 = f116820r;
            eVar2.f116843g = Math.max(eVar2.f116843g, this.f116831k);
        }
        for (int i14 = 0; i14 < this.f116831k; i14++) {
            b bVar = this.f116827g[i14];
            if (bVar.f116811a.f116862j != h.a.UNRESTRICTED) {
                float f14 = 0.0f;
                if (bVar.f116812b < 0.0f) {
                    boolean z14 = false;
                    int i15 = 0;
                    while (!z14) {
                        i15++;
                        float f15 = Float.MAX_VALUE;
                        int i16 = -1;
                        int i17 = -1;
                        int i18 = 0;
                        int i19 = 0;
                        while (i18 < this.f116831k) {
                            b bVar2 = this.f116827g[i18];
                            if (bVar2.f116811a.f116862j != h.a.UNRESTRICTED && !bVar2.f116815e && bVar2.f116812b < f14) {
                                int iJ = bVar2.f116814d.j();
                                int i24 = 0;
                                while (i24 < iJ) {
                                    h hVarH = bVar2.f116814d.h(i24);
                                    float fI = bVar2.f116814d.i(hVarH);
                                    if (fI > f14) {
                                        for (int i25 = 0; i25 < 9; i25++) {
                                            float f16 = hVarH.f116860h[i25] / fI;
                                            if ((f16 < f15 && i25 == i19) || i25 > i19) {
                                                i19 = i25;
                                                i17 = hVarH.f116855c;
                                                i16 = i18;
                                                f15 = f16;
                                            }
                                        }
                                    }
                                    i24++;
                                    f14 = 0.0f;
                                }
                            }
                            i18++;
                            f14 = 0.0f;
                        }
                        if (i16 != -1) {
                            b bVar3 = this.f116827g[i16];
                            bVar3.f116811a.f116856d = -1;
                            bVar3.g(this.f116833m.f116818c[i17]);
                            h hVar = bVar3.f116811a;
                            hVar.f116856d = i16;
                            hVar.e(this, bVar3);
                        } else {
                            z14 = true;
                        }
                        if (i15 > this.f116830j / 2) {
                            z14 = true;
                        }
                        f14 = 0.0f;
                    }
                    break;
                }
            }
        }
        r(gVar);
        i();
    }

    public final void r(a aVar) {
        for (int i14 = 0; i14 < this.f116830j; i14++) {
            this.f116829i[i14] = false;
        }
        boolean z14 = false;
        int i15 = 0;
        while (!z14) {
            i15++;
            if (i15 >= this.f116830j * 2) {
                return;
            }
            h hVar = ((b) aVar).f116811a;
            if (hVar != null) {
                this.f116829i[hVar.f116855c] = true;
            }
            h hVarA = aVar.a(this.f116829i);
            if (hVarA != null) {
                boolean[] zArr = this.f116829i;
                int i16 = hVarA.f116855c;
                if (zArr[i16]) {
                    return;
                } else {
                    zArr[i16] = true;
                }
            }
            if (hVarA != null) {
                float f14 = Float.MAX_VALUE;
                int i17 = -1;
                for (int i18 = 0; i18 < this.f116831k; i18++) {
                    b bVar = this.f116827g[i18];
                    if (bVar.f116811a.f116862j != h.a.UNRESTRICTED && !bVar.f116815e && bVar.f116814d.a(hVarA)) {
                        float fI = bVar.f116814d.i(hVarA);
                        if (fI < 0.0f) {
                            float f15 = (-bVar.f116812b) / fI;
                            if (f15 < f14) {
                                i17 = i18;
                                f14 = f15;
                            }
                        }
                    }
                }
                if (i17 > -1) {
                    b bVar2 = this.f116827g[i17];
                    bVar2.f116811a.f116856d = -1;
                    bVar2.g(hVarA);
                    h hVar2 = bVar2.f116811a;
                    hVar2.f116856d = i17;
                    hVar2.e(this, bVar2);
                }
            } else {
                z14 = true;
            }
        }
    }

    public final void s() {
        for (int i14 = 0; i14 < this.f116831k; i14++) {
            b bVar = this.f116827g[i14];
            if (bVar != null) {
                this.f116833m.f116816a.a(bVar);
            }
            this.f116827g[i14] = null;
        }
    }

    public final void t() {
        c cVar;
        int i14 = 0;
        while (true) {
            cVar = this.f116833m;
            h[] hVarArr = cVar.f116818c;
            if (i14 >= hVarArr.length) {
                break;
            }
            h hVar = hVarArr[i14];
            if (hVar != null) {
                hVar.c();
            }
            i14++;
        }
        f fVar = cVar.f116817b;
        h[] hVarArr2 = this.f116834n;
        int length = this.f116835o;
        fVar.getClass();
        if (length > hVarArr2.length) {
            length = hVarArr2.length;
        }
        for (int i15 = 0; i15 < length; i15++) {
            h hVar2 = hVarArr2[i15];
            int i16 = fVar.f116846b;
            Object[] objArr = fVar.f116845a;
            if (i16 < objArr.length) {
                objArr[i16] = hVar2;
                fVar.f116846b = i16 + 1;
            }
        }
        this.f116835o = 0;
        Arrays.fill(cVar.f116818c, (Object) null);
        this.f116823c = 0;
        g gVar = this.f116824d;
        gVar.f116849h = 0;
        gVar.f116812b = 0.0f;
        this.f116830j = 1;
        for (int i17 = 0; i17 < this.f116831k; i17++) {
            b bVar = this.f116827g[i17];
        }
        s();
        this.f116831k = 0;
        this.f116836p = new b(cVar);
    }
}
