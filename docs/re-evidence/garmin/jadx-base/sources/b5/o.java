package b5;

import ch.qos.logback.core.CoreConstants;
import h5.c1;
import h5.u1;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lb5/o;", "Lb5/p;", "Lh4/r$c;", "modifierNode", "<init>", "(Lh4/r$c;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h4.r.c f15856c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c1 f15859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f15860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15861h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c5.c f15857d = new c5.c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1.z<a0> f15858e = new p1.z<>(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15862i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15863j = true;

    public o(h4.r.c cVar) {
        this.f15856c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:147:0x02da  */
    /* JADX WARN: Code duplicated, block: B:149:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:169:0x032d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r5v0, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r5v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    @Override // b5.p
    public final boolean a(p1.z<a0> zVar, f5.c0 c0Var, k kVar, boolean z14) {
        c5.c cVar;
        p1.z<a0> zVar2;
        a0 a0Var;
        boolean z15;
        boolean z16;
        q qVar;
        int i14;
        int i15;
        int i16;
        boolean z17;
        boolean zA = super.a(zVar, c0Var, kVar, z14);
        ?? B = this.f15856c;
        boolean z18 = true;
        if (B.getIsAttached()) {
            ?? cVar2 = 0;
            while (B != 0) {
                if (B instanceof u1) {
                    this.f15859f = h5.k.e((u1) B, 16);
                } else if ((B.getKindSet() & 16) != 0 && (B instanceof h5.m)) {
                    h4.r.c child = ((h5.m) B).f81888b;
                    int i17 = 0;
                    while (child != null) {
                        if ((child.getKindSet() & 16) != 0) {
                            i17++;
                            if (i17 == 1) {
                                B = B;
                                cVar2 = cVar2;
                                cVar2 = cVar2;
                                B = child;
                            } else {
                                if (cVar2 == 0) {
                                    cVar2 = new q3.c(new h4.r.c[16], 0);
                                }
                                if (B != 0) {
                                    cVar2.b(B);
                                    B = 0;
                                }
                                cVar2.b(child);
                            }
                        } else {
                            B = B;
                            cVar2 = cVar2;
                        }
                        child = child.getChild();
                        B = B;
                        cVar2 = cVar2;
                    }
                    if (i17 == 1) {
                        B = B;
                        cVar2 = cVar2;
                    } else {
                        B = B;
                        cVar2 = cVar2;
                    }
                }
                B = h5.k.b(cVar2);
            }
            if (this.f15859f != null) {
                int iH = zVar.h();
                int i18 = 0;
                while (true) {
                    cVar = this.f15857d;
                    zVar2 = this.f15858e;
                    if (i18 >= iH) {
                        break;
                    }
                    long jE = zVar.e(i18);
                    a0 a0VarI = zVar.i(i18);
                    if (cVar.b(jE)) {
                        boolean z19 = z18;
                        long j8 = a0VarI.f15754g;
                        List<e> list = a0VarI.f15760m;
                        long j14 = a0VarI.f15750c;
                        if ((((j8 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j14 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z17 = z19;
                            ArrayList arrayList = new ArrayList((list == null ? p13.j0.f134944a : list).size());
                            List<e> list2 = list == null ? p13.j0.f134944a : list;
                            int size = list2.size();
                            int i19 = 0;
                            while (i19 < size) {
                                List<e> list3 = list2;
                                e eVar = list2.get(i19);
                                p1.z<a0> zVar3 = zVar2;
                                long j15 = jE;
                                long j16 = eVar.f15789b;
                                if ((((j16 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j17 = eVar.f15788a;
                                    c1 c1Var = this.f15859f;
                                    c1Var.getClass();
                                    arrayList.add(new e(j17, c1Var.X(c0Var, j16), eVar.f15790c, eVar.f15791d, eVar.f15792e, (p005kotlin.jvm.internal.j) null));
                                }
                                i19++;
                                size = size;
                                list2 = list3;
                                zVar2 = zVar3;
                                jE = j15;
                                a0VarI = a0VarI;
                            }
                            p1.z<a0> zVar4 = zVar2;
                            long j18 = jE;
                            c1 c1Var2 = this.f15859f;
                            c1Var2.getClass();
                            long jX = c1Var2.X(c0Var, j8);
                            c1 c1Var3 = this.f15859f;
                            c1Var3.getClass();
                            a0 a0Var2 = new a0(a0VarI.f15748a, a0VarI.f15749b, c1Var3.X(c0Var, j14), a0VarI.f15751d, a0VarI.f15752e, a0VarI.f15753f, jX, a0VarI.f15755h, false, a0VarI.f15756i, arrayList, a0VarI.f15757j, a0VarI.f15758k, a0VarI.f15759l, a0VarI.f15761n, null);
                            a0 a0Var3 = a0VarI.f15764q;
                            if (a0Var3 == null) {
                                a0Var3 = a0VarI;
                            }
                            a0Var2.f15764q = a0Var3;
                            a0 a0Var4 = a0VarI.f15764q;
                            if (a0Var4 != null) {
                                a0VarI = a0Var4;
                            }
                            a0Var2.f15764q = a0VarI;
                            zVar4.f(j18, a0Var2);
                        } else {
                            z17 = z19;
                        }
                    } else {
                        z17 = z18;
                    }
                    i18++;
                    iH = iH;
                    z18 = z17;
                    zA = zA;
                }
                boolean z24 = zA;
                boolean z25 = z18;
                if (zVar2.d()) {
                    cVar.f24450a = 0;
                    this.f15865a.g();
                    return z25;
                }
                int i24 = cVar.f24450a;
                while (true) {
                    i24--;
                    if (-1 >= i24) {
                        break;
                    }
                    if (zVar.c(cVar.f24451b[i24]) < 0 && i24 < (i16 = cVar.f24450a)) {
                        int i25 = i16 - 1;
                        int i26 = i24;
                        while (i26 < i25) {
                            long[] jArr = cVar.f24451b;
                            int i27 = i26 + 1;
                            jArr[i26] = jArr[i27];
                            i26 = i27;
                        }
                        cVar.f24450a--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(zVar2.h());
                int iH2 = zVar2.h();
                for (int i28 = 0; i28 < iH2; i28++) {
                    arrayList2.add(zVar2.i(i28));
                }
                q qVar2 = new q(arrayList2, kVar);
                List<a0> list4 = qVar2.f15870a;
                int size2 = list4.size();
                int i29 = 0;
                while (true) {
                    if (i29 >= size2) {
                        a0Var = null;
                        break;
                    }
                    a0Var = list4.get(i29);
                    if (kVar.a(a0Var.f15748a)) {
                        break;
                    }
                    i29++;
                }
                a0 a0Var5 = a0Var;
                if (a0Var5 != null) {
                    boolean z26 = a0Var5.f15751d;
                    if (z14) {
                        z15 = false;
                        if (!this.f15862i && (z26 || a0Var5.f15755h)) {
                            c1 c1Var4 = this.f15859f;
                            c1Var4.getClass();
                            long j19 = c1Var4.f69146c;
                            long j24 = a0Var5.f15750c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j24 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j24 & 4294967295L));
                            int i30 = (int) (j19 >> 32);
                            this.f15862i = !((fIntBitsToFloat2 > ((float) ((int) (j19 & 4294967295L))) ? z25 : false) | (fIntBitsToFloat > ((float) i30) ? z25 : false) | (fIntBitsToFloat < 0.0f ? z25 : false) | (fIntBitsToFloat2 < 0.0f ? z25 : false));
                        }
                    } else {
                        z15 = false;
                        this.f15862i = false;
                    }
                    if (this.f15862i != this.f15861h) {
                        int i34 = qVar2.f15875f;
                        t.f15887b.getClass();
                        if (i34 == t.f15890e || (i15 = qVar2.f15875f) == t.f15891f || i15 == t.f15892g) {
                            qVar2.f15875f = this.f15862i ? t.f15891f : t.f15892g;
                        } else {
                            i14 = qVar2.f15875f;
                            t.f15887b.getClass();
                            if (i14 != t.f15891f && this.f15861h && !this.f15863j) {
                                qVar2.f15875f = t.f15890e;
                            } else if (qVar2.f15875f == t.f15892g && this.f15862i && z26) {
                                qVar2.f15875f = t.f15890e;
                            }
                        }
                    } else {
                        i14 = qVar2.f15875f;
                        t.f15887b.getClass();
                        if (i14 != t.f15891f) {
                            if (qVar2.f15875f == t.f15892g) {
                                qVar2.f15875f = t.f15890e;
                            }
                        } else if (qVar2.f15875f == t.f15892g) {
                            qVar2.f15875f = t.f15890e;
                        }
                    }
                } else {
                    z15 = false;
                }
                if (z24) {
                    z16 = z25;
                    break;
                }
                int i35 = qVar2.f15875f;
                t.f15887b.getClass();
                if (i35 != t.f15890e || (qVar = this.f15860g) == null) {
                    z16 = z25;
                    break;
                }
                List<a0> list5 = qVar.f15870a;
                if (list5.size() != list4.size()) {
                    z16 = z25;
                    break;
                }
                int size3 = list4.size();
                ?? r14 = z15;
                while (true) {
                    if (r14 >= size3) {
                        z16 = z15;
                        break;
                    }
                    if (!n4.c.d(list5.get(r14).f15750c, list4.get(r14).f15750c)) {
                        z16 = z25;
                        break;
                    }
                    r14++;
                }
                this.f15860g = qVar2;
                return z16;
            }
        }
        return true;
    }

    @Override // b5.p
    public final void b(k kVar) {
        super.b(kVar);
        q qVar = this.f15860g;
        if (qVar == null) {
            return;
        }
        this.f15861h = this.f15862i;
        List<a0> list = qVar.f15870a;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            a0 a0Var = list.get(i14);
            boolean z14 = a0Var.f15751d;
            long j8 = a0Var.f15748a;
            boolean zA = kVar.a(j8);
            boolean z15 = this.f15862i;
            if ((!z14 && !zA) || (!z14 && !z15)) {
                this.f15857d.c(j8);
            }
        }
        this.f15862i = false;
        int i15 = qVar.f15875f;
        t.f15887b.getClass();
        this.f15863j = i15 == t.f15892g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void c() {
        q3.c<o> cVar = this.f15865a;
        o[] oVarArr = cVar.f142356a;
        int i14 = cVar.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            oVarArr[i15].c();
        }
        ?? B = this.f15856c;
        ?? cVar2 = 0;
        while (B != 0) {
            if (B instanceof u1) {
                ((u1) B).a1();
            } else if ((B.getKindSet() & 16) != 0 && (B instanceof h5.m)) {
                h4.r.c child = ((h5.m) B).f81888b;
                int i16 = 0;
                B = B;
                cVar2 = cVar2;
                while (child != null) {
                    if ((child.getKindSet() & 16) != 0) {
                        i16++;
                        if (i16 == 1) {
                            cVar2 = cVar2;
                            B = child;
                        } else {
                            if (cVar2 == 0) {
                                cVar2 = new q3.c(new h4.r.c[16], 0);
                            }
                            if (B != 0) {
                                cVar2.b(B);
                                B = 0;
                            }
                            cVar2.b(child);
                        }
                    }
                    child = child.getChild();
                    B = B;
                    cVar2 = cVar2;
                }
                if (i16 == 1) {
                }
            }
            B = h5.k.b(cVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(k kVar) {
        Object[] objArr;
        h5.e0 e0Var;
        p1.z<a0> zVar = this.f15858e;
        boolean z14 = false;
        z14 = false;
        z14 = false;
        if (!zVar.d()) {
            h4.r.c cVar = this.f15856c;
            if (cVar.getIsAttached()) {
                c1 coordinator = cVar.getCoordinator();
                if ((coordinator == null || (e0Var = coordinator.f81711p) == null) ? false : e0Var.g()) {
                    q qVar = this.f15860g;
                    qVar.getClass();
                    c1 c1Var = this.f15859f;
                    c1Var.getClass();
                    long j8 = c1Var.f69146c;
                    h4.r.c cVarB = cVar;
                    q3.c cVar2 = null;
                    while (cVarB != null) {
                        if (cVarB instanceof u1) {
                            ((u1) cVarB).u1(qVar, s.Final, j8);
                            objArr = false;
                        } else {
                            objArr = true;
                        }
                        if (objArr != false) {
                            if (((cVarB.getKindSet() & 16) != 0) != false && (cVarB instanceof h5.m)) {
                                int i14 = 0;
                                for (h4.r.c child = ((h5.m) cVarB).f81888b; child != null; child = child.getChild()) {
                                    if (((child.getKindSet() & 16) != 0) != false) {
                                        i14++;
                                        if (i14 == 1) {
                                            cVarB = child;
                                        } else {
                                            if (cVar2 == null) {
                                                cVar2 = new q3.c(new h4.r.c[16], 0);
                                            }
                                            if (cVarB != null) {
                                                cVar2.b(cVarB);
                                                cVarB = null;
                                            }
                                            cVar2.b(child);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                        }
                        cVarB = h5.k.b(cVar2);
                    }
                    if (cVar.getIsAttached()) {
                        q3.c<o> cVar3 = this.f15865a;
                        o[] oVarArr = cVar3.f142356a;
                        int i15 = cVar3.f142358c;
                        for (int i16 = 0; i16 < i15; i16++) {
                            oVarArr[i16].d(kVar);
                        }
                    }
                    z14 = true;
                }
            }
        }
        b(kVar);
        zVar.a();
        this.f15859f = null;
        return z14;
    }

    public final boolean e(k kVar, boolean z14) {
        boolean z15;
        boolean z16;
        h5.e0 e0Var;
        if (!this.f15858e.d()) {
            h4.r.c cVarB = this.f15856c;
            if (cVarB.getIsAttached()) {
                c1 coordinator = cVarB.getCoordinator();
                if ((coordinator == null || (e0Var = coordinator.f81711p) == null) ? false : e0Var.g()) {
                    q qVar = this.f15860g;
                    qVar.getClass();
                    c1 c1Var = this.f15859f;
                    c1Var.getClass();
                    long j8 = c1Var.f69146c;
                    h4.r.c cVarB2 = cVarB;
                    q3.c cVar = null;
                    while (cVarB2 != null) {
                        if (cVarB2 instanceof u1) {
                            ((u1) cVarB2).u1(qVar, s.Initial, j8);
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        if (z16) {
                            if (((cVarB2.getKindSet() & 16) != 0) && (cVarB2 instanceof h5.m)) {
                                int i14 = 0;
                                for (h4.r.c child = ((h5.m) cVarB2).f81888b; child != null; child = child.getChild()) {
                                    if ((child.getKindSet() & 16) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            cVarB2 = child;
                                        } else {
                                            if (cVar == null) {
                                                cVar = new q3.c(new h4.r.c[16], 0);
                                            }
                                            if (cVarB2 != null) {
                                                cVar.b(cVarB2);
                                                cVarB2 = null;
                                            }
                                            cVar.b(child);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                        }
                        cVarB2 = h5.k.b(cVar);
                    }
                    if (cVarB.getIsAttached()) {
                        q3.c<o> cVar2 = this.f15865a;
                        o[] oVarArr = cVar2.f142356a;
                        int i15 = cVar2.f142358c;
                        for (int i16 = 0; i16 < i15; i16++) {
                            o oVar = oVarArr[i16];
                            this.f15859f.getClass();
                            oVar.e(kVar, z14);
                        }
                    }
                    if (cVarB.getIsAttached()) {
                        q3.c cVar3 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof u1) {
                                ((u1) cVarB).u1(qVar, s.Main, j8);
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (z15) {
                                if (((cVarB.getKindSet() & 16) != 0) && (cVarB instanceof h5.m)) {
                                    int i17 = 0;
                                    for (h4.r.c child2 = ((h5.m) cVarB).f81888b; child2 != null; child2 = child2.getChild()) {
                                        if ((child2.getKindSet() & 16) != 0) {
                                            i17++;
                                            if (i17 == 1) {
                                                cVarB = child2;
                                            } else {
                                                if (cVar3 == null) {
                                                    cVar3 = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (cVarB != null) {
                                                    cVar3.b(cVarB);
                                                    cVarB = null;
                                                }
                                                cVar3.b(child2);
                                            }
                                        }
                                    }
                                    if (i17 == 1) {
                                    }
                                }
                            }
                            cVarB = h5.k.b(cVar3);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(long j8, p1.q0<o> q0Var) {
        c5.c cVar = this.f15857d;
        if (cVar.b(j8) && q0Var.c(this) < 0) {
            cVar.c(j8);
            this.f15858e.g(j8);
        }
        q3.c<o> cVar2 = this.f15865a;
        o[] oVarArr = cVar2.f142356a;
        int i14 = cVar2.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            oVarArr[i15].f(j8, q0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f15856c + ", children=" + this.f15865a + ", pointerIds=" + this.f15857d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
