package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class a5 implements o6 {
    public static boolean a(s6 s6Var, float f, float f2) {
        double dAbs = Math.abs(s6Var.j()[0].b() - s6Var.j()[1].b()) / f;
        return (dAbs < 0.55d && ((double) f2) > 1.5d) || dAbs < 0.3d;
    }

    @Override // com.huawei.hms.scankit.p.o6
    public s6 a(p pVar, Map map) {
        return a(pVar, a(map), map);
    }

    public s6 c(p pVar, m4 m4Var, Map map, j2 j2Var) throws a {
        s6 s6VarA;
        int iE = pVar.e();
        int iC = pVar.c();
        if (iE >= iC) {
            iE = iC;
        }
        float f = (iE * 1.0f) / 500.0f;
        p pVarG = m4Var.g(pVar, f);
        try {
            s6VarA = a(pVarG, a(map), map);
            if (s6VarA != null) {
                try {
                    if (s6VarA.k() != null) {
                        l2.a(s6VarA.j(), f, j2Var);
                        return s6VarA;
                    }
                } catch (a unused) {
                    try {
                        pVarG.a(o1.a(pVarG.d(), pVarG.e(), pVarG.c(), true));
                        s6 s6VarA2 = a(pVarG, a(map), map);
                        if (s6VarA2 != null && s6VarA2.k() != null) {
                            l2.a(s6VarA2.j(), f, j2Var);
                            return s6VarA2;
                        }
                        throw a.a();
                    } catch (a unused2) {
                        if (s6VarA != null) {
                            return s6VarA;
                        }
                        throw a.a();
                    }
                }
            }
            throw a.a();
        } catch (a unused3) {
            s6VarA = null;
        }
    }

    public s6 b(p pVar, p pVar2, p pVar3, Map map, m4 m4Var, j2 j2Var) {
        if (pVar3 != null) {
            return b(pVar3, m4Var, map, j2Var);
        }
        return a(pVar, pVar2, m4Var, map);
    }

    private s6 a(p pVar, m4 m4Var, Map map, j2 j2Var) throws a {
        s6 s6VarA;
        boolean z;
        s6 s6VarA2;
        int iE = pVar.e();
        int iC = pVar.c();
        if (iE >= iC) {
            iE = iC;
        }
        float f = (iE * 1.0f) / 900.0f;
        p pVarI = m4Var.i(pVar, f);
        u6[] u6VarArr = null;
        try {
            s6VarA = a(pVarI, a(map), map);
            if (s6VarA != null) {
                try {
                    if (s6VarA.k() != null) {
                        l2.a(s6VarA.j(), f, j2Var);
                        return s6VarA;
                    }
                } catch (a unused) {
                    z = false;
                    try {
                        pVarI.a(o1.a(pVarI.d(), pVarI.e(), pVarI.c(), false));
                        s6VarA2 = a(pVarI, a(map), map);
                        if (s6VarA2 == null && s6VarA2.k() != null) {
                            l2.a(s6VarA2.j(), f, j2Var);
                            return s6VarA2;
                        }
                        throw a.a();
                    } catch (a unused2) {
                        if (s6VarA == null) {
                            throw a.a();
                        }
                        if (z) {
                            s6VarA.a();
                            s6VarA.b(u6VarArr);
                            l2.a(s6VarA.j(), f, j2Var);
                        }
                        return s6VarA;
                    }
                }
            }
            if (r3.f16302c || s6VarA == null || s6VarA.k() != null || s6VarA.j().length < 3) {
                z = false;
            } else {
                z = true;
                try {
                    u6VarArr = (u6[]) s6VarA.j().clone();
                } catch (a unused3) {
                    pVarI.a(o1.a(pVarI.d(), pVarI.e(), pVarI.c(), false));
                    s6VarA2 = a(pVarI, a(map), map);
                    if (s6VarA2 == null) {
                    }
                    throw a.a();
                }
            }
            throw a.a();
        } catch (a unused4) {
            s6VarA = null;
        }
    }

    public s6 a(p pVar, p pVar2, p pVar3, Map map, m4 m4Var, j2 j2Var) throws a {
        s6 s6VarA = pVar3 != null ? a(pVar3, m4Var, map, j2Var) : null;
        if (s6VarA != null) {
            return s6VarA;
        }
        throw a.a();
    }

    public s6 b(p pVar, m4 m4Var, Map map, j2 j2Var) throws a {
        int iE = pVar.e();
        int iC = pVar.c();
        int i = iE < iC ? iE : iC;
        float f = i * 1.0f;
        float f2 = f / 128.0f;
        if (f2 < 1.0f && r3.f16302c) {
            pVar = m4Var.e(pVar, f2);
        }
        p pVar2 = pVar;
        float f3 = f / 500.0f;
        float f4 = f3 >= 1.0f ? f3 : 1.0f;
        try {
            s6 s6VarA = a(m4Var.g(pVar2, f4), a(map), map);
            if (s6VarA != null && s6VarA.k() != null) {
                l2.a(s6VarA.j(), f4, j2Var);
                return s6VarA;
            }
            if (!r3.f16302c && s6VarA != null && s6VarA.k() == null && s6VarA.j().length >= 3) {
            }
            throw a.a();
        } catch (a unused) {
            s6 s6VarA2 = a(i, pVar2, m4Var, map, j2Var);
            if (s6VarA2 == null) {
                throw a.a();
            }
            if (0 != 0) {
                s6VarA2.a();
                s6VarA2.b((u6[]) null);
                l2.a(s6VarA2.j(), f4, j2Var);
            }
            return s6VarA2;
        }
    }

    private s6 a(p pVar, o6[] o6VarArr, Map map) throws a {
        if (o6VarArr != null) {
            for (o6 o6Var : o6VarArr) {
                try {
                    s6 s6VarA = o6Var.a(pVar, map);
                    if (s6VarA != null && s6VarA.j() != null) {
                        int i = 0;
                        for (u6 u6Var : s6VarA.j()) {
                            if (u6Var != null) {
                                i++;
                            }
                        }
                        if (i == 0 && s6VarA.c() == BarcodeFormat.PDF_417) {
                            throw a.a();
                        }
                    }
                    return s6VarA;
                } catch (a unused) {
                }
            }
        }
        throw a.a();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d A[SYNTHETIC] */
    public s6 a(p pVar, p pVar2, Map map, m4 m4Var, j2 j2Var) throws a {
        s6 s6VarA;
        boolean z;
        u6[] u6VarArrJ;
        boolean zContainsKey = map.containsKey(m1.d);
        float[] fArr = {1.0f, 0.0f};
        if (pVar2 != null) {
            s6VarA = a(pVar2, m4Var, map, fArr, j2Var);
        } else {
            if (zContainsKey || !r3.f16300a) {
                s6VarA = a(pVar, m4Var, map, fArr);
                z = fArr[1] > 1.0f;
                if (s6VarA != null) {
                    throw a.a();
                }
                if (z && (u6VarArrJ = s6VarA.j()) != null) {
                    for (int i = 0; i < u6VarArrJ.length; i++) {
                        if (u6VarArrJ[i] != null) {
                            u6VarArrJ[i] = new u6(u6VarArrJ[i].c(), (pVar.c() - 1) - u6VarArrJ[i].b());
                        }
                    }
                }
                return s6VarA;
            }
            s6VarA = null;
        }
        if (s6VarA != null) {
            throw a.a();
        }
        if (z) {
            while (i < u6VarArrJ.length) {
                if (u6VarArrJ[i] != null) {
                    u6VarArrJ[i] = new u6(u6VarArrJ[i].c(), (pVar.c() - 1) - u6VarArrJ[i].b());
                }
            }
        }
        return s6VarA;
    }

    private s6 a(p pVar, m4 m4Var, Map map, float[] fArr, j2 j2Var) throws a {
        s6 s6VarA;
        s6 s6VarA2;
        float fN = j2Var.n();
        float fE = pVar.e() < pVar.c() ? pVar.e() : pVar.c();
        float f = fE / 500.0f;
        if (f < 1.0f) {
            f = 1.0f;
        }
        p pVarG = m4Var.g(pVar, f);
        o6[] o6VarArrA = a(map);
        float fB = j2Var.a() > 0.0f ? j2Var.b() / j2Var.a() : 1.0f;
        try {
            s6VarA = a(pVarG, o6VarArrA, map);
            try {
                if (a(s6VarA, fN / f, fB)) {
                    throw a.a();
                }
            } catch (a unused) {
                if (r3.p) {
                    float f2 = fE / 250.0f;
                    float f3 = f2 >= 1.0f ? f2 : 1.0f;
                    pVarG = m4Var.f(pVar, f3);
                    try {
                        map.put(m1.e, 2);
                        s6VarA2 = a(m4Var.e(pVarG), o6VarArrA, map);
                        if (a(s6VarA2, fN / f3, fB)) {
                            throw a.a();
                        }
                    } catch (a unused2) {
                        map.put(m1.e, 1);
                        s6VarA2 = a(m4Var.f(pVarG), o6VarArrA, map);
                        if (a(s6VarA2, fN / f3, fB)) {
                            throw a.a();
                        }
                    }
                    s6VarA = s6VarA2;
                    f = f3;
                }
            }
        } catch (a unused3) {
            s6VarA = null;
        }
        fArr[0] = f;
        if (s6VarA != null) {
            l2.a(pVarG.b(), s6VarA, f, j2Var);
        }
        return s6VarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.huawei.hms.scankit.p.m4] */
    /* JADX WARN: Type inference failed for: r10v10, types: [com.huawei.hms.scankit.p.s6] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7, types: [com.huawei.hms.scankit.p.s6] */
    private s6 a(p pVar, m4 m4Var, Map map, float[] fArr) throws a {
        p pVarA;
        s6 s6VarA;
        float fMin = (Math.min(pVar.c(), pVar.e()) * 1.0f) / 1080.0f;
        if (r3.f16300a) {
            pVarA = m4Var.a(pVar, fMin);
        } else {
            float f = fMin > 1.5f ? fMin : 1.0f;
            pVarA = m4Var.a(pVar, f);
            fMin = f;
        }
        o6[] o6VarArrA = a(map);
        if (r3.f16301b || !r3.f16300a) {
            s6 s6VarA2 = null;
            int i = 0;
            s6VarA = m4Var;
            while (true) {
                if (i < 2) {
                    if (i == 1) {
                        s6VarA2 = a(s6VarA.c(l4.a(pVarA)), o6VarArrA, map);
                        fArr[1] = 2.0f;
                    } else {
                        try {
                            try {
                                s6VarA = a(s6VarA.b(pVarA), o6VarArrA, map);
                                break;
                            } catch (a unused) {
                                if (r3.p) {
                                    map.put(m1.e, 1);
                                    s6VarA = a(s6VarA.d(pVarA), o6VarArrA, map);
                                    break;
                                }
                                i++;
                                s6VarA = s6VarA;
                            }
                        } catch (a unused2) {
                            i++;
                            s6VarA = s6VarA;
                        }
                    }
                }
                s6VarA = s6VarA2;
                i++;
                s6VarA = s6VarA;
            }
        } else {
            map.put(m1.e, 0);
            s6VarA = a(pVarA, o6VarArrA, map);
        }
        if (s6VarA != 0) {
            l2.a(pVarA.b(), s6VarA, fMin, (j2) null);
        }
        fArr[0] = fMin;
        return s6VarA;
    }

    private s6 a(int i, p pVar, m4 m4Var, Map map, j2 j2Var) throws a {
        float f = (i * 1.0f) / 250.0f;
        if (f < 1.0f) {
            f = 1.0f;
        }
        p pVarF = m4Var.f(pVar, f);
        o6[] o6VarArrA = a(map);
        try {
            try {
                s6 s6VarA = a(m4Var.e(pVarF), o6VarArrA, map);
                if (s6VarA != null && s6VarA.k() != null) {
                    l2.a(s6VarA.j(), f, j2Var);
                    return s6VarA;
                }
                throw a.a();
            } catch (a unused) {
                s6 s6VarA2 = a(new p(new e4(pVar.a().c())), o6VarArrA, map);
                if (s6VarA2 != null && s6VarA2.k() != null) {
                    l2.a(s6VarA2.j(), 1.0f, j2Var);
                }
                return s6VarA2;
            }
        } catch (a unused2) {
            s6 s6VarA3 = a(m4Var.f(pVarF), o6VarArrA, map);
            if (s6VarA3 != null && s6VarA3.k() != null) {
                l2.a(s6VarA3.j(), f, j2Var);
                return s6VarA3;
            }
            throw a.a();
        }
    }

    public s6 a(p pVar, p pVar2, m4 m4Var, Map map) throws a {
        p pVarA;
        int iE = pVar.e();
        int iC = pVar.c();
        int i = iE < iC ? iE : iC;
        float f = (i * 1.0f) / 1080.0f;
        if (f <= 1.0f) {
            f = 1.0f;
        }
        if (r3.f16300a) {
            pVarA = m4Var.a(pVar, f);
        } else {
            float f2 = f > 1.5f ? f : 1.0f;
            float f3 = f2;
            pVarA = m4Var.a(pVar, f2);
            f = f3;
        }
        try {
            s6 s6VarA = a(pVarA, a(map), map);
            if (s6VarA != null && s6VarA.k() != null) {
                l2.a(s6VarA.j(), f, (j2) null);
                return s6VarA;
            }
            if (!r3.f16302c && s6VarA != null && s6VarA.k() == null && s6VarA.j().length >= 3) {
            }
            throw a.a();
        } catch (a unused) {
            s6 s6VarA2 = a(i, m4Var, pVar, pVar2, map);
            if (s6VarA2 == null) {
                throw a.a();
            }
            if (0 != 0) {
                s6VarA2.a();
                s6VarA2.b((u6[]) null);
            }
            return s6VarA2;
        }
    }

    private s6 a(int i, m4 m4Var, p pVar, p pVar2, Map map) throws a {
        o6[] o6VarArrA = a(map);
        try {
            if (r3.f16300a) {
                float f = (i * 1.0f) / 500.0f;
                if (f <= 1.0f) {
                    f = 1.0f;
                }
                s6 s6VarA = a(m4Var.g(m4Var.g(pVar, f)), o6VarArrA, map);
                if (s6VarA != null && s6VarA.k() != null) {
                    l2.a(s6VarA.j(), f, (j2) null);
                    return s6VarA;
                }
            }
            throw a.a();
        } catch (a unused) {
            float f2 = (i * 1.0f) / 1080.0f;
            float f3 = f2 > 1.0f ? f2 : 1.0f;
            s6 s6VarA2 = a(m4Var.b(pVar2, f3), o6VarArrA, map);
            if (s6VarA2 != null && s6VarA2.k() != null) {
                l2.a(s6VarA2.j(), f3, (j2) null);
            }
            return s6VarA2;
        }
    }

    public o6[] a(Map map) {
        Collection collection = map == null ? null : (Collection) map.get(m1.f16208c);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.UPC_E) || collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.CODABAR) || collection.contains(BarcodeFormat.CODE_39) || collection.contains(BarcodeFormat.CODE_93) || collection.contains(BarcodeFormat.CODE_128) || collection.contains(BarcodeFormat.ITF)) {
                arrayList.add(new z4(map));
            }
            if (collection.contains(BarcodeFormat.QR_CODE)) {
                arrayList.add(new j6());
            }
            if (collection.contains(BarcodeFormat.DATA_MATRIX)) {
                arrayList.add(new h1());
            }
            if (collection.contains(BarcodeFormat.AZTEC)) {
                arrayList.add(new h());
            }
            if (collection.contains(BarcodeFormat.PDF_417)) {
                arrayList.add(new r5());
            }
            if (collection.contains(BarcodeFormat.HARMONY_CODE)) {
                arrayList.add(new z3());
            }
            if (collection.contains(BarcodeFormat.WXCODE)) {
                arrayList.add(new m8());
            }
        }
        return (o6[]) arrayList.toArray(new o6[arrayList.size()]);
    }
}
