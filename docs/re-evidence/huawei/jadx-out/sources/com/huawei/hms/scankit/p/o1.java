package com.huawei.hms.scankit.p;

import android.util.Log;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p4 f16237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p f16238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p f16239c;
    private p d;
    private boolean e;
    private float g;
    private float f = 0.0f;
    private float h = 0.0f;
    private float j = 1.778f;
    private int k = 0;
    private int l = 0;
    public m4 i = new m4();

    o1(p4 p4Var) {
        this.e = false;
        this.g = 0.0f;
        this.f16237a = p4Var;
        this.f16238b = new p(new q3(this.f16237a));
        this.f16239c = new p(new e4(this.f16237a));
        this.e = false;
        this.g = 0.0f;
    }

    public s6 e(List list, j2 j2Var) {
        HashMap map = new HashMap();
        map.put(m1.f16208c, list);
        if (j2Var != null) {
            r3.l = true;
            s6 s6VarA = a(map, j2Var);
            r3.l = false;
            if (s6VarA != null && s6VarA.k() == null && r3.p) {
                r3.m = true;
                s6VarA = g(list, j2Var);
                r3.m = false;
            }
            if (s6VarA != null && s6VarA.k() == null && r3.q) {
                r3.n = true;
                s6VarA = a(map, j2Var);
                r3.n = false;
            }
            if ((s6VarA != null && s6VarA.k() != null) || !r3.r) {
                return s6VarA;
            }
            r3.o = true;
            s6 s6VarA2 = a(map, j2Var);
            r3.o = false;
            return s6VarA2;
        }
        s6 s6VarA3 = a(map);
        if (s6VarA3 != null && s6VarA3.k() == null && r3.q) {
            r3.m = true;
            s6VarA3 = a(map);
            r3.m = false;
        }
        if (s6VarA3 == null || s6VarA3.k() != null || !r3.r) {
            return s6VarA3;
        }
        r3.n = true;
        s6 s6VarA4 = a(map);
        r3.n = false;
        return s6VarA4;
    }

    public s6 g(List list, j2 j2Var) {
        p pVarG;
        p pVar;
        s6 s6VarA;
        a5 a5Var = new a5();
        HashMap map = new HashMap();
        map.put(m1.f16208c, list);
        float fE = 1.0f;
        if (j2Var == null) {
            if (r3.f16300a && (this.f16238b.e() > 500 || this.f16238b.c() > 500)) {
                fE = (this.f16238b.e() > this.f16238b.c() ? this.f16238b.e() : this.f16238b.c()) / 500.0f;
                pVarG = this.i.c(this.f16238b, fE);
            } else {
                pVarG = this.f16238b;
            }
        } else if (r3.f16300a && (pVar = this.d) != null && (pVar.e() > 500 || this.d.c() > 500)) {
            fE = (this.d.e() > this.d.c() ? this.d.e() : this.d.c()) / 500.0f;
            pVarG = this.i.g(this.d, fE);
        } else {
            pVarG = this.d;
        }
        try {
            s6VarA = a5Var.a(pVarG, map);
            if (s6VarA != null) {
                try {
                    if (s6VarA.k() != null) {
                        l2.a(s6VarA.j(), fE, j2Var);
                    }
                } catch (a unused) {
                    Log.e("DecodeProcessor", "decodeQRSimple AIScanException");
                    return s6VarA;
                }
            }
            return s6VarA;
        } catch (a unused2) {
            s6VarA = null;
        }
    }

    public s6 f(List list, j2 j2Var) {
        p4 p4VarC;
        float fE;
        p pVar;
        HashMap map = new HashMap();
        map.put(m1.f16208c, list);
        try {
            if (j2Var != null) {
                p4VarC = this.d.a().c();
            } else {
                p4VarC = this.f16237a;
            }
            if (!r3.f16300a || (this.f16238b.e() <= 800 && this.f16238b.c() <= 800)) {
                fE = 1.0f;
            } else {
                fE = (this.f16238b.e() > this.f16238b.c() ? this.f16238b.e() : this.f16238b.c()) / 800.0f;
                p4VarC = this.i.h(new p(new q3(p4VarC)), fE).a().c();
            }
            p4 p4Var = p4VarC;
            float f = fE;
            if (p4Var != null) {
                if (r3.f16300a && !r3.f16301b) {
                    s sVarA = a(p4Var.b(), p4Var.c(), p4Var.a(), false);
                    pVar = new p(new q3(p4Var));
                    pVar.a(sVarA);
                } else {
                    pVar = new p(new q3(p4Var));
                }
                a5 a5Var = new a5();
                try {
                    s6 s6VarA = a5Var.a(pVar, map);
                    if (s6VarA != null && s6VarA.k() != null) {
                        l2.a(s6VarA.j(), f, j2Var);
                        return s6VarA;
                    }
                    throw a.a();
                } catch (a unused) {
                    return a(a5Var, p4Var, pVar, map, f, j2Var);
                }
            }
            throw a.a();
        } catch (a unused2) {
            Log.e("DecodeProcessor", "decodeQRMulti AIScanException");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f0 A[Catch: a -> 0x00f8, TRY_ENTER, TRY_LEAVE, TryCatch #3 {a -> 0x00f8, blocks: (B:10:0x0039, B:40:0x00f0, B:18:0x005d, B:20:0x006b, B:26:0x0085, B:28:0x008f, B:34:0x00a0, B:32:0x0098, B:17:0x0058, B:13:0x0047, B:15:0x004b), top: B:64:0x0039, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fa  */
    public s6 d(List list, j2 j2Var) {
        s6 s6VarA;
        s6 s6VarA2;
        float fMin;
        float f;
        a5 a5Var = new a5();
        HashMap map = new HashMap();
        map.put(m1.f16208c, list);
        s6 s6VarA3 = null;
        float f2 = 1.0f;
        try {
            if (j2Var != null) {
                p pVar = this.d;
                if (pVar != null) {
                    fMin = Math.min(pVar.e(), this.d.c()) / 800.0f;
                    if (fMin < 1.25f) {
                        fMin = 1.0f;
                    }
                    try {
                        p pVarH = this.i.h(this.d, fMin);
                        try {
                            try {
                                s6VarA2 = a5Var.a(pVarH, map);
                            } catch (a unused) {
                                if (r3.q) {
                                    s6VarA3 = a5Var.a(this.i.g(this.d, fMin), map);
                                }
                                float fI = (j2Var.i() + 180.0f) % 90.0f;
                                if (!r3.f16302c && j2Var.h() > 0.8d && (fI < 3.0f || fI > 87.0f)) {
                                    p4 p4VarC = pVarH.a().c();
                                    if (fI < 3.0f) {
                                        f = fI * (-2.0f);
                                    } else {
                                        f = fI > 87.0f ? (90.0f - fI) * 2.0f : 0.0f;
                                    }
                                    s6VarA2 = a5Var.a(new p(new e4(new e6(LoadOpencvJNIUtil.imageRotate(p4VarC.b(), p4VarC.a(), p4VarC.c(), p4VarC.a(), p4VarC.c(), f, 1.0d), p4VarC.c(), p4VarC.a(), 0, 0, p4VarC.c(), p4VarC.a(), false))), map);
                                    s6VarA3 = s6VarA2;
                                    if (s6VarA3 != null) {
                                        l2.a(s6VarA3.j(), fMin, j2Var);
                                    } else {
                                        f2 = fMin;
                                    }
                                } else if (s6VarA3 != null) {
                                    l2.a(s6VarA3.j(), fMin, j2Var);
                                } else {
                                    f2 = fMin;
                                }
                                return a(s6VarA3, f2, 0, 0);
                            }
                        } catch (a unused2) {
                            Log.e("DecodeProcessor", "decodePdf417  AIScanException");
                            float fI2 = (j2Var.i() + 180.0f) % 90.0f;
                            if (!r3.f16302c) {
                            }
                            if (s6VarA3 != null) {
                                l2.a(s6VarA3.j(), fMin, j2Var);
                            } else {
                                f2 = fMin;
                            }
                            return a(s6VarA3, f2, 0, 0);
                        }
                    } catch (a unused3) {
                        f2 = fMin;
                        Log.e("DecodeProcessor", "decodePdf417 AIScanException");
                    }
                } else {
                    s6VarA2 = a5Var.a(this.f16238b, map);
                    fMin = 1.0f;
                }
                s6VarA3 = s6VarA2;
                if (s6VarA3 != null) {
                    l2.a(s6VarA3.j(), fMin, j2Var);
                } else {
                    f2 = fMin;
                }
            } else {
                int iMin = Math.min(this.f16238b.e(), this.f16238b.c());
                if (iMin > 1080) {
                    float f3 = iMin / 1080.0f;
                    if (f3 >= 1.25f) {
                        f2 = f3;
                    }
                }
                try {
                    s6VarA = a5Var.a(this.i.a(this.f16238b, f2), map);
                } catch (a unused4) {
                    s6VarA = a5Var.a(this.i.b(this.f16239c, f2), map);
                }
                s6VarA3 = s6VarA;
            }
        } catch (a unused5) {
            Log.e("DecodeProcessor", "decodePdf417 AIScanException");
        }
        return a(s6VarA3, f2, 0, 0);
    }

    public s6 b(List list, j2 j2Var) {
        s6 s6VarB;
        a5 a5Var = new a5();
        HashMap map = new HashMap();
        map.put(m1.f16208c, list);
        try {
            if (j2Var != null) {
                s6VarB = a5Var.b(this.f16238b, this.f16239c, this.d, map, this.i, j2Var);
            } else {
                s6VarB = a5Var.b(this.f16238b, this.f16239c, null, map, this.i, null);
            }
            try {
                if (!r3.f16302c && s6VarB != null && s6VarB.k() == null && s6VarB.j() != null && s6VarB.j().length >= 3) {
                    float fB = o8.b(this.f16237a.c(), this.f16237a.a(), s6VarB.j());
                    if (Math.abs(1.0f - fB) > 0.001d) {
                        this.h = fB;
                        this.e = true;
                    }
                }
                return s6VarB;
            } catch (a unused) {
                Log.e("DecodeProcessor", "decode2d AIScanException");
                return s6VarB;
            }
        } catch (a unused2) {
            s6VarB = null;
        }
    }

    public s6 c(List list, j2 j2Var) {
        a5 a5Var = new a5();
        HashMap map = new HashMap();
        map.put(m1.f16208c, list);
        s6 s6VarA = null;
        if (j2Var != null) {
            try {
                Log.i("DecodeProcessor", "decodeHarm start.");
                s6VarA = a5Var.a(this.f16238b, this.f16239c, this.d, map, this.i, j2Var);
            } catch (a unused) {
                Log.e("DecodeProcessor", "decodeHarm AIScanException");
                return s6VarA;
            }
        }
        if (!r3.f16302c && s6VarA != null && s6VarA.k() == null && s6VarA.j() != null && s6VarA.j().length >= 3) {
            float fB = o8.b(this.f16237a.c(), this.f16237a.a(), new u6[]{new u6(j2Var.d(), j2Var.e()), new u6(j2Var.d() + j2Var.f(), j2Var.e()), new u6(j2Var.d(), j2Var.e() + j2Var.c())});
            if (Math.abs(1.0f - fB) > 0.001d) {
                this.h = fB;
                this.e = true;
            }
            if (this.e) {
                Log.i("DecodeProcessor", "decodeHarm need zoom");
            }
        }
        return s6VarA;
    }

    public s6 h(List list, j2 j2Var) {
        a5 a5Var = new a5();
        HashMap map = new HashMap();
        map.put(m1.f16208c, list);
        s6 s6VarC = null;
        if (j2Var != null) {
            try {
                s6VarC = a5Var.c(this.d, this.i, map, j2Var);
            } catch (a unused) {
                Log.e("DecodeProcessor", "decode2d AIScanException");
                return s6VarC;
            }
        }
        if (!r3.f16302c && s6VarC != null && s6VarC.k() == null && s6VarC.j() != null && s6VarC.j().length >= 3) {
            float fB = o8.b(this.f16237a.c(), this.f16237a.a(), s6VarC.j());
            if (Math.abs(1.0f - fB) > 0.001d) {
                this.h = fB;
                this.e = true;
            }
        }
        return s6VarC;
    }

    public static s a(byte[] bArr, int i, int i2, boolean z) throws a {
        int i3 = i / 11;
        byte[] bArrAdaptivebinary = LoadOpencvJNIUtil.adaptivebinary(bArr, i2, i, (i3 + (i3 % 2)) - 1, z);
        if (bArrAdaptivebinary != null) {
            s sVar = new s(i, i2);
            for (int i4 = 0; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i; i5++) {
                    if (bArrAdaptivebinary[(i4 * i) + i5] == 0) {
                        sVar.c(i5, i4);
                    }
                }
            }
            return sVar;
        }
        throw a.a();
    }

    static s6 a(List list, o1 o1Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j2 j2Var = (j2) it.next();
            if (r3.f16301b || j2Var.h() > 0.4d) {
                int iJ = (int) j2Var.j();
                int iK = (int) j2Var.k();
                if (iJ > o1Var.f16237a.c() / 3 && iJ < (o1Var.f16237a.c() * 2) / 3 && iK > o1Var.f16237a.a() / 3 && iK < (o1Var.f16237a.a() * 2) / 3) {
                    float fC = o1Var.c(o1Var.d);
                    s6 s6Var = new s6(1.0f);
                    s6Var.a(fC);
                    s6Var.a(j2Var);
                    return s6Var;
                }
            }
        }
        return null;
    }

    public float e() {
        return this.g;
    }

    public static float[] a(j2 j2Var) {
        int i = j2Var.s;
        int i2 = j2Var.r;
        return new float[]{i, i2, i + j2Var.q, i2 + j2Var.p};
    }

    private p b(p pVar) {
        int iE = pVar.e();
        int iC = pVar.c();
        if (iE < iC) {
            if (iC / iE <= 1.2d) {
                return pVar;
            }
            int i = (int) (((double) iE) * 1.2d);
            int i2 = (iC - i) / 2;
            this.l = i2;
            return pVar.a(0, i2, iE, i);
        }
        if (iE / iC <= 1.2d) {
            return pVar;
        }
        int i3 = (int) (((double) iC) * 1.2d);
        int i4 = (iE - i3) / 2;
        this.k = i4;
        return pVar.a(i4, 0, i3, iC);
    }

    public float d() {
        return this.h;
    }

    public boolean c(List list) {
        int i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j2 j2Var = (j2) it.next();
            boolean z = j2Var.g() == 1.0f && ((double) j2Var.h()) > 0.7d;
            boolean z2 = j2Var.g() == 1.0f && ((double) j2Var.h()) > 0.4d;
            boolean z3 = j2Var.g() == 2.0f && ((double) j2Var.h()) > 0.7d;
            boolean z4 = j2Var.g() == 3.0f && ((double) j2Var.h()) > 0.7d;
            boolean z5 = j2Var.g() == 4.0f && ((double) j2Var.h()) > 0.7d;
            boolean z6 = j2Var.g() == 5.0f && ((double) j2Var.h()) > 0.7d;
            boolean z7 = j2Var.g() == 6.0f && ((double) j2Var.h()) > 0.7d;
            boolean z8 = j2Var.g() == 7.0f && ((double) j2Var.h()) > 0.7d;
            if (z2 || z3 || z4 || z7 || z8 || z5 || z6) {
                if (!z && !a(this.f16238b, j2Var) && (i = r3.k) <= 4) {
                    r3.k = i + 2;
                } else {
                    r3.k = 0;
                    float fB = o8.b(this.f16237a.c(), this.f16237a.a(), new u6[]{new u6(j2Var.d(), j2Var.e()), new u6(j2Var.d() + j2Var.f(), j2Var.e()), new u6(j2Var.d(), j2Var.e() + j2Var.c())});
                    if (fB > 1.001f) {
                        this.g = fB;
                        return true;
                    }
                }
            }
        }
        return this.e;
    }

    private void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j2 j2Var = (j2) it.next();
            j2Var.a(this.f16237a.c(), this.f16237a.a(), this.k, this.l);
            float fMin = Math.min(Math.abs(j2Var.i() % 90.0f), 90.0f - Math.abs(j2Var.i() % 90.0f));
            if (j2Var.c() * j2Var.f() > this.f16237a.a() * 0.9f * this.f16237a.c() && fMin < 5.0f) {
                j2Var.b(this.f16237a.c(), this.f16237a.a());
            }
        }
    }

    public boolean b(List list) {
        int i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j2 j2Var = (j2) it.next();
            boolean z = j2Var.g() == 1.0f && ((double) j2Var.h()) > 0.7d;
            boolean z2 = j2Var.g() == 1.0f && ((double) j2Var.h()) > 0.4d;
            boolean z3 = j2Var.g() == 2.0f && ((double) j2Var.h()) > 0.7d;
            boolean z4 = j2Var.g() == 3.0f && ((double) j2Var.h()) > 0.7d;
            boolean z5 = j2Var.g() == 6.0f && ((double) j2Var.h()) > 0.7d;
            boolean z6 = j2Var.g() == 7.0f && ((double) j2Var.h()) > 0.7d;
            if (z2 || z3 || z4 || z5 || z6) {
                if (!z && !a(this.f16238b, j2Var) && (i = r3.k) <= 4) {
                    r3.k = i + 2;
                } else {
                    r3.k = 0;
                    float fB = o8.b(this.f16237a.c(), this.f16237a.a(), new u6[]{new u6(j2Var.d(), j2Var.e()), new u6(j2Var.d() + j2Var.f(), j2Var.e()), new u6(j2Var.d(), j2Var.e() + j2Var.c())});
                    if (fB > 1.001f) {
                        this.g = fB;
                        this.e = true;
                    }
                }
            }
        }
        return this.e;
    }

    public float c(p pVar) {
        byte[] bArrB = (pVar == null || (pVar.a() == null && pVar.a().c() == null)) ? null : pVar.a().c().b();
        if (bArrB == null) {
            return 1.0f;
        }
        int iE = pVar.e();
        int iC = pVar.c();
        long j = 0;
        for (int i = iC / 4; i < (iC * 3) / 4; i++) {
            for (int i2 = iE / 4; i2 < (iE * 3) / 4; i2++) {
                j += (long) (bArrB[(i * iE) + i2] & 255);
            }
        }
        return (j / ((long) bArrB.length)) * 4;
    }

    private s6 a(s6 s6Var, float f, int i, int i2) {
        if (s6Var != null && s6Var.j().length == 4 && (Math.abs(f - 1.0f) >= 1.0E-6f || i != 0 || i2 != 0)) {
            u6[] u6VarArr = new u6[4];
            for (int i3 = 0; i3 < 4; i3++) {
                u6VarArr[i3] = new u6((s6Var.j()[i3].b() * f) + i, (s6Var.j()[i3].c() * f) + i2);
            }
            s6Var.a();
            s6Var.a(u6VarArr);
        }
        return s6Var;
    }

    private s6 a(a5 a5Var, p4 p4Var, p pVar, Map map, float f, j2 j2Var) {
        p pVar2;
        s6 s6VarA = null;
        if (r3.f16300a && !r3.f16301b) {
            try {
                pVar2 = new p(new q3(p4Var));
                try {
                    s6 s6VarA2 = a5Var.a(pVar2, map);
                    if (s6VarA2 != null) {
                        try {
                            if (s6VarA2.k() != null) {
                                l2.a(s6VarA2.j(), f, j2Var);
                                return s6VarA2;
                            }
                        } catch (a unused) {
                            s6VarA = s6VarA2;
                            pVar = pVar2;
                            Log.e("DecodeProcessor", "decodeQRMultiHard AIScanException");
                            pVar2 = pVar;
                        }
                    }
                    s6VarA = s6VarA2;
                } catch (a unused2) {
                }
            } catch (a unused3) {
            }
            if (s6VarA != null && s6VarA.j() != null && s6VarA.j().length >= 3) {
                try {
                    s6VarA = a(pVar2, map, s6VarA, new double[]{0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d});
                    if (s6VarA != null && s6VarA.k() != null) {
                        l2.a(s6VarA.j(), f, j2Var);
                        return s6VarA;
                    }
                } catch (a unused4) {
                    Log.e("DecodeProcessor", "decodeQRMultiHard AIScanException");
                }
            }
        }
        p pVar3 = new p(new e4(p4Var));
        try {
            s6 s6VarA3 = a5Var.a(pVar3, map);
            if (s6VarA3 != null && s6VarA3.k() != null) {
                l2.a(s6VarA3.j(), f, j2Var);
                return s6VarA3;
            }
            throw a.a();
        } catch (a unused5) {
            if (r3.f16300a && !r3.f16301b && s6VarA != null && s6VarA.j() != null && s6VarA.j().length >= 3 && (s6VarA = a(pVar3, map, s6VarA, new double[]{0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d})) != null && s6VarA.k() != null) {
                l2.a(s6VarA.j(), f, j2Var);
            }
            return s6VarA;
        }
    }

    public boolean b() {
        return this.e;
    }

    public void b(j2 j2Var) {
        try {
            if (r3.f16300a) {
                l2.a(r3.f16301b, this.f16238b, j2Var);
                this.d = j2Var.l;
            }
        } catch (a unused) {
            Log.e("DecodeProcessor", "cropAndRotate AIScanException");
        }
    }

    static boolean b(p pVar, j2 j2Var) {
        if (r3.f16300a && !r3.f16301b) {
            float fD = j2Var.d();
            float fE = j2Var.e();
            float f = j2Var.f();
            float fC = j2Var.c();
            float f2 = fD - ((f * 0.2f) / 2.0f);
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            float f3 = fE - ((0.2f * fC) / 2.0f);
            float f4 = f3 >= 0.0f ? f3 : 0.0f;
            float fE2 = (f * 1.2f) + f2;
            if (fE2 > pVar.e()) {
                fE2 = pVar.e();
            }
            float fC2 = (fC * 1.2f) + f4;
            if (fC2 > pVar.c()) {
                fC2 = pVar.c();
            }
            List listA = l2.a(r3.f16301b, pVar.a((int) f2, (int) f4, (int) (fE2 - f2), (int) (fC2 - f4)), 0, true);
            if (!listA.isEmpty() && ((j2) listA.get(0)).g() == 6.0f) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fe  */
    public s6 a(Map map, j2 j2Var) {
        p pVar;
        float f;
        s6 s6VarA;
        s6 s6Var;
        s6 s6VarA2;
        float fA;
        a5 a5Var = new a5();
        p pVar2 = this.d;
        s6 s6Var2 = null;
        if (pVar2 == null) {
            return null;
        }
        r3.h = true;
        int iE = pVar2.e() > this.d.c() ? this.d.e() : this.d.c();
        if (r3.f16300a && iE > 500) {
            float f2 = iE / 500.0f;
            if (f2 < 1.0f) {
                f2 = 1.0f;
            }
            pVar = this.i.g(this.d, f2);
            f = f2;
        } else {
            pVar = this.d;
            f = 1.0f;
        }
        try {
            if (r3.o) {
                pVar = new p(new q3(j7.b(pVar.a().c())));
            }
            s6VarA = a5Var.a(pVar, map);
            if (s6VarA != null) {
                try {
                    if (s6VarA.k() != null || s6VarA.j() == null || s6VarA.j().length < 3) {
                        s6Var = null;
                    } else {
                        s6Var = new s6(null, null, s6VarA.j(), BarcodeFormat.QR_CODE);
                        try {
                            s6VarA = a(pVar, map, s6VarA, new double[]{0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d});
                        } catch (a unused) {
                            s6VarA2 = a(pVar, s6VarA, s6Var, a5Var, map, f, j2Var);
                            if (s6VarA2 != null) {
                                l2.a(s6VarA2.j(), f, j2Var);
                                fA = o8.a(this.f16237a.c(), this.f16237a.a(), s6VarA2.j());
                                if (Math.abs(1.0f - fA) > 0.001d) {
                                    this.f = fA;
                                    this.e = true;
                                }
                            } else {
                                l2.a(s6VarA2.j(), f, j2Var);
                                fA = o8.a(this.f16237a.c(), this.f16237a.a(), s6VarA2.j());
                                if (Math.abs(1.0f - fA) > 0.001d) {
                                    this.f = fA;
                                    this.e = true;
                                }
                            }
                            return s6VarA2;
                        }
                    }
                } catch (a unused2) {
                    s6Var = s6Var2;
                    s6VarA2 = a(pVar, s6VarA, s6Var, a5Var, map, f, j2Var);
                    if (s6VarA2 != null) {
                        l2.a(s6VarA2.j(), f, j2Var);
                        fA = o8.a(this.f16237a.c(), this.f16237a.a(), s6VarA2.j());
                        if (Math.abs(1.0f - fA) > 0.001d) {
                            this.f = fA;
                            this.e = true;
                        }
                    } else {
                        l2.a(s6VarA2.j(), f, j2Var);
                        fA = o8.a(this.f16237a.c(), this.f16237a.a(), s6VarA2.j());
                        if (Math.abs(1.0f - fA) > 0.001d) {
                            this.f = fA;
                            this.e = true;
                        }
                    }
                    return s6VarA2;
                }
            } else {
                s6Var = null;
            }
            s6 s6Var3 = s6VarA;
            if (s6Var3 != null) {
                try {
                    if (s6Var3.k() != null) {
                        l2.a(s6Var3.j(), f, j2Var);
                        return s6Var3;
                    }
                } catch (a unused3) {
                    s6VarA = s6Var3;
                    s6Var2 = s6Var;
                    s6Var = s6Var2;
                    s6VarA2 = a(pVar, s6VarA, s6Var, a5Var, map, f, j2Var);
                    if ((s6VarA2 != null || s6VarA2.k() == null) && !r3.f16302c && s6VarA2 != null && s6VarA2.j() != null && s6VarA2.j().length >= 3) {
                        l2.a(s6VarA2.j(), f, j2Var);
                        fA = o8.a(this.f16237a.c(), this.f16237a.a(), s6VarA2.j());
                        if (Math.abs(1.0f - fA) > 0.001d) {
                            this.f = fA;
                            this.e = true;
                        }
                    }
                    return s6VarA2;
                }
            }
            throw a.a();
        } catch (a unused4) {
            s6VarA = null;
        }
    }

    public float c() {
        return this.f;
    }

    private s6 a(a5 a5Var, p4 p4Var, s6 s6Var, Map map, float f, int i, int i2) {
        s6 s6VarA;
        p pVar = null;
        if (!r3.f16300a) {
            return null;
        }
        try {
            try {
                p pVar2 = new p(new q3(p4Var));
                try {
                    s6 s6VarA2 = a5Var.a(pVar2, map);
                    if (s6VarA2 != null && s6VarA2.k() != null) {
                        return a(s6VarA2, f, i, i2);
                    }
                    if (s6VarA2 != null && s6VarA2.j() != null && s6VarA2.j().length >= 3) {
                        s6Var.b(s6VarA2.j());
                    }
                    pVar = pVar2;
                    if (s6Var != null) {
                        try {
                            if (s6Var.j() != null && s6Var.j().length >= 3 && !r3.m && (s6VarA = a(pVar, map, s6Var, new double[]{0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d})) != null && s6VarA.k() != null) {
                                return a(s6VarA, f, i, i2);
                            }
                        } catch (a unused) {
                            Log.e("DecodeProcessor", "decodeQRUseFullImgTryHard AIScanException");
                        }
                    }
                    return a(pVar, a5Var, p4Var, s6Var, map, f);
                } catch (a unused2) {
                    pVar = pVar2;
                    Log.e("DecodeProcessor", "decodeQRUseFullImgTryHard AIScanException");
                }
            } catch (a unused3) {
            }
        } catch (a unused4) {
        }
    }

    private s6 a(p pVar, a5 a5Var, p4 p4Var, s6 s6Var, Map map, float f) {
        s6 s6VarA = null;
        try {
            j6.a(this.f16237a, s6Var);
            if (r3.f16302c && r3.v[1]) {
                r3.s = true;
                s6VarA = a5Var.a(this.f16238b, map);
                r3.s = false;
                if (s6VarA != null && s6VarA.k() != null) {
                    return a(s6VarA, f, 0, 0);
                }
            }
        } catch (a unused) {
            r3.s = false;
        }
        float fE = pVar.e() / pVar.c();
        if (fE < 1.0f) {
            fE = 1.0f / fE;
        }
        if (!r3.m && !r3.n) {
            double d = fE;
            if (d > 1.27d && d < 1.272d) {
                r3.u = true;
                try {
                    s6VarA = a5Var.a(new p(new e4(p4Var)), map);
                    if (s6VarA != null && s6VarA.k() != null) {
                        return a(s6VarA, f, 0, 0);
                    }
                } catch (a unused2) {
                    Log.e("DecodeProcessor", "decodeQRUseFullImgTryHardSpecialCase AIScanException");
                }
                r3.u = false;
            }
        }
        return s6VarA;
    }

    private p a(p pVar) {
        int iE = pVar.e();
        int iC = pVar.c();
        int i = (int) (((double) iE) * 0.75d);
        int i2 = (int) (((double) iC) * 0.75d);
        int i3 = (iE - i) / 2;
        this.k += i3;
        int i4 = (iC - i2) / 2;
        this.l += i4;
        return pVar.a(i3, i4, i, i2);
    }

    public p a() {
        return this.f16238b;
    }

    static s6 a(o1 o1Var) {
        float fC = o1Var.c(o1Var.f16238b);
        s6 s6Var = new s6(1.0f);
        s6Var.b(fC);
        s6Var.b(new j2(false, 0.0f, 0.0f, o1Var.f16238b.e(), o1Var.f16238b.e(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f));
        return s6Var;
    }

    public static boolean a(List list, boolean z) {
        if (!z && !r3.f16301b) {
            float[] fArrA = a((j2) list.get(0));
            float fA = a(fArrA);
            r3.y = fArrA;
            if (fA >= 0.6f) {
                r3.z++;
            } else {
                r3.z = 1;
            }
            o4.d("DecodeProcessor", "iou: " + fA + " focusAreaFrameCount: " + r3.z);
            if (r3.z < 8) {
                return false;
            }
            o4.d("DecodeProcessor", "need area focus");
            r3.z = 1;
            return true;
        }
        r3.y = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        r3.z = 0;
        return false;
    }

    private s6 a(p pVar, Map map, s6 s6Var, double[] dArr) {
        if (pVar == null) {
            return null;
        }
        a5 a5Var = new a5();
        int[] iArr = {0, 0};
        byte[] bArrA = k7.a(pVar, map, s6Var, iArr, dArr);
        int i = iArr[0];
        int i2 = iArr[1];
        e6 e6Var = new e6(bArrA, i, i2, 0, 0, i, i2, false);
        try {
            s6 s6VarA = a5Var.a(new p(new q3(e6Var)), map);
            if (s6VarA != null && s6VarA.k() != null) {
                u6[] u6VarArrA = k7.a(s6VarA.j(), pVar.e(), pVar.c(), dArr);
                s6VarA.a();
                s6VarA.b(u6VarArrA);
                return s6VarA;
            }
            throw a.a();
        } catch (a unused) {
            p pVar2 = new p(new e4(e6Var));
            try {
                s6 s6VarA2 = a5Var.a(pVar2, map);
                if (s6VarA2 != null && s6VarA2.k() != null) {
                    u6[] u6VarArrA2 = k7.a(s6VarA2.j(), pVar.e(), pVar.c(), dArr);
                    s6VarA2.a();
                    s6VarA2.b(u6VarArrA2);
                    return s6VarA2;
                }
                throw a.a();
            } catch (a unused2) {
                pVar2.a(a(e6Var.b(), e6Var.c(), e6Var.a(), false));
                try {
                    s6 s6VarA3 = a5Var.a(pVar2, map);
                    if (s6VarA3 != null && s6VarA3.k() != null) {
                        u6[] u6VarArrA3 = k7.a(s6VarA3.j(), pVar.e(), pVar.c(), dArr);
                        s6VarA3.a();
                        s6VarA3.b(u6VarArrA3);
                        return s6VarA3;
                    }
                    throw a.a();
                } catch (a unused3) {
                    Log.e("DecodeProcessor", "rotatedQRBinarizer  AIScanException");
                    return s6Var;
                }
            }
        }
    }

    public static p a(byte[] bArr, int i, int i2) throws a {
        byte[] bArrSharpen = LoadOpencvJNIUtil.sharpen(bArr, i2, i);
        if (bArrSharpen != null) {
            return new p(new e4(new e6(bArrSharpen, i, i2, 0, 0, i, i2, false)));
        }
        throw a.a();
    }

    public static float a(float[] fArr) {
        float[] fArr2 = r3.y;
        float f = fArr2[2];
        float f2 = fArr2[0];
        float f3 = fArr2[3];
        float f4 = fArr2[1];
        float f5 = (f - f2) * (f3 - f4);
        if (f5 == 0.0d) {
            return 0.0f;
        }
        float f6 = fArr[2];
        float f7 = fArr[0];
        float f8 = fArr[3];
        float f9 = fArr[1];
        float fMax = Math.max(f4, f9);
        float fMin = Math.min(r3.y[3], fArr[3]);
        float fMax2 = Math.max(r3.y[0], fArr[0]);
        float fMin2 = Math.min(r3.y[2], fArr[2]);
        if (fMax >= fMin || fMax2 >= fMin2) {
            return 0.0f;
        }
        float f10 = (fMin - fMax) * (fMin2 - fMax2);
        return (f10 / ((f5 + ((f6 - f7) * (f8 - f9))) - f10)) * 1.0f;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c A[Catch: a -> 0x00af, TryCatch #3 {a -> 0x00af, blocks: (B:35:0x0086, B:37:0x009c, B:39:0x00a2, B:41:0x00aa, B:42:0x00ae), top: B:104:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00eb A[Catch: a -> 0x00fe, TryCatch #2 {a -> 0x00fe, blocks: (B:53:0x00c8, B:55:0x00eb, B:57:0x00f1, B:59:0x00f9, B:60:0x00fd), top: B:103:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0105  */
    /* JADX WARN: Code duplicated, block: B:65:0x010b  */
    /* JADX WARN: Code duplicated, block: B:71:0x015d A[Catch: a -> 0x01ec, TRY_LEAVE, TryCatch #6 {a -> 0x01ec, blocks: (B:69:0x0113, B:71:0x015d, B:85:0x01b4, B:87:0x01c1, B:89:0x01c7, B:91:0x01cd, B:92:0x01e3, B:94:0x01e7, B:95:0x01eb, B:73:0x017d, B:75:0x0183, B:77:0x0189, B:79:0x018e, B:80:0x01a8, B:82:0x01ac, B:83:0x01b0), top: B:108:0x0113, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0183 A[Catch: a -> 0x01b1, TryCatch #5 {a -> 0x01b1, blocks: (B:73:0x017d, B:75:0x0183, B:77:0x0189, B:79:0x018e, B:80:0x01a8, B:82:0x01ac, B:83:0x01b0), top: B:107:0x017d, outer: #6 }] */
    private s6 a(p pVar, s6 s6Var, s6 s6Var2, a5 a5Var, Map map, float f, j2 j2Var) {
        s6 s6VarA;
        s6 s6Var3;
        s6 s6VarA2;
        s6 s6VarA3;
        int iMax;
        int iMax2;
        float[] fArr;
        byte[] bArrQRCornerDetect;
        p pVar2;
        s6 s6VarA4;
        try {
            if (r3.f16300a) {
                pVar.a(a(pVar.d(), pVar.e(), pVar.c(), false));
                s6VarA = a5Var.a(pVar, map);
                if (s6VarA != null) {
                    try {
                        if (s6VarA.k() == null && s6VarA.j() != null && s6VarA.j().length >= 3) {
                            s6Var3 = new s6(null, null, s6VarA.j(), BarcodeFormat.QR_CODE);
                            try {
                                s6VarA = a(pVar, map, s6VarA, new double[]{0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d});
                            } catch (a unused) {
                                if (s6VarA != null) {
                                    try {
                                        s6VarA2 = a5Var.a(a(pVar.d(), pVar.e(), pVar.c()), map);
                                        if (s6VarA2 == null) {
                                        }
                                        throw a.a();
                                    } catch (a unused2) {
                                        Log.e("DecodeProcessor", "decodeQRUseDetResHard sharpenMethod AIScanException");
                                        if (s6VarA != null) {
                                            try {
                                                p pVar3 = new p(new e4(pVar.a().c()));
                                                pVar3.a(pVar.b().c());
                                                s6VarA3 = a5Var.a(pVar3, map);
                                                if (s6VarA3 == null) {
                                                }
                                                throw a.a();
                                            } catch (a unused3) {
                                                Log.e("DecodeProcessor", "decodeQRUseDetResHard InvMethod AIScanException");
                                                if (s6VarA != null) {
                                                    try {
                                                        iMax = (int) Math.max(j2Var.d(), 0.0f);
                                                        iMax2 = (int) Math.max(j2Var.e(), 0.0f);
                                                        int iMin = (int) Math.min(j2Var.f(), this.f16237a.c() - iMax);
                                                        int iMin2 = (int) Math.min(j2Var.c(), this.f16237a.a() - iMax2);
                                                        fArr = new float[8];
                                                        bArrQRCornerDetect = LoadOpencvJNIUtil.QRCornerDetect(this.f16237a.a(iMax, iMax2, iMin, iMin2).b(), iMin, iMin2, fArr);
                                                        if (bArrQRCornerDetect.length != 0) {
                                                            pVar2 = new p(new k5(new e6(bArrQRCornerDetect, 256, 256, 0, 0, 256, 256, false)));
                                                            try {
                                                                s6VarA4 = a5Var.a(pVar2, map);
                                                                if (s6VarA4 == null) {
                                                                }
                                                                throw a.a();
                                                            } catch (a unused4) {
                                                                pVar2.a(a(bArrQRCornerDetect, 256, 256, false));
                                                                s6 s6VarA5 = a5Var.a(pVar2, map);
                                                                if (s6VarA5 != null && s6VarA5.k() != null) {
                                                                    u6[] u6VarArr = new u6[4];
                                                                    for (int i = 0; i < 4; i++) {
                                                                        int i2 = i * 2;
                                                                        u6VarArr[i] = new u6(fArr[i2] + iMax, fArr[i2 + 1] + iMax2);
                                                                    }
                                                                    s6VarA5.b(u6VarArr);
                                                                    return s6VarA5;
                                                                }
                                                                throw a.a();
                                                            }
                                                        }
                                                    } catch (a unused5) {
                                                        Log.e("DecodeProcessor", "decodeQRUseDetResHard CornerMethod AIScanException");
                                                        return s6Var3;
                                                    }
                                                } else {
                                                    iMax = (int) Math.max(j2Var.d(), 0.0f);
                                                    iMax2 = (int) Math.max(j2Var.e(), 0.0f);
                                                    int iMin3 = (int) Math.min(j2Var.f(), this.f16237a.c() - iMax);
                                                    int iMin4 = (int) Math.min(j2Var.c(), this.f16237a.a() - iMax2);
                                                    fArr = new float[8];
                                                    bArrQRCornerDetect = LoadOpencvJNIUtil.QRCornerDetect(this.f16237a.a(iMax, iMax2, iMin3, iMin4).b(), iMin3, iMin4, fArr);
                                                    if (bArrQRCornerDetect.length != 0) {
                                                        pVar2 = new p(new k5(new e6(bArrQRCornerDetect, 256, 256, 0, 0, 256, 256, false)));
                                                        s6VarA4 = a5Var.a(pVar2, map);
                                                        if (s6VarA4 == null) {
                                                        }
                                                        throw a.a();
                                                    }
                                                }
                                                return s6Var3;
                                            }
                                        }
                                        p pVar4 = new p(new e4(pVar.a().c()));
                                        pVar4.a(pVar.b().c());
                                        s6VarA3 = a5Var.a(pVar4, map);
                                        if (s6VarA3 == null) {
                                        }
                                        throw a.a();
                                        if (s6VarA != null) {
                                            iMax = (int) Math.max(j2Var.d(), 0.0f);
                                            iMax2 = (int) Math.max(j2Var.e(), 0.0f);
                                            int iMin5 = (int) Math.min(j2Var.f(), this.f16237a.c() - iMax);
                                            int iMin6 = (int) Math.min(j2Var.c(), this.f16237a.a() - iMax2);
                                            fArr = new float[8];
                                            bArrQRCornerDetect = LoadOpencvJNIUtil.QRCornerDetect(this.f16237a.a(iMax, iMax2, iMin5, iMin6).b(), iMin5, iMin6, fArr);
                                            if (bArrQRCornerDetect.length != 0) {
                                                pVar2 = new p(new k5(new e6(bArrQRCornerDetect, 256, 256, 0, 0, 256, 256, false)));
                                                s6VarA4 = a5Var.a(pVar2, map);
                                                if (s6VarA4 == null) {
                                                }
                                                throw a.a();
                                            }
                                        } else {
                                            iMax = (int) Math.max(j2Var.d(), 0.0f);
                                            iMax2 = (int) Math.max(j2Var.e(), 0.0f);
                                            int iMin7 = (int) Math.min(j2Var.f(), this.f16237a.c() - iMax);
                                            int iMin8 = (int) Math.min(j2Var.c(), this.f16237a.a() - iMax2);
                                            fArr = new float[8];
                                            bArrQRCornerDetect = LoadOpencvJNIUtil.QRCornerDetect(this.f16237a.a(iMax, iMax2, iMin7, iMin8).b(), iMin7, iMin8, fArr);
                                            if (bArrQRCornerDetect.length != 0) {
                                                pVar2 = new p(new k5(new e6(bArrQRCornerDetect, 256, 256, 0, 0, 256, 256, false)));
                                                s6VarA4 = a5Var.a(pVar2, map);
                                                if (s6VarA4 == null) {
                                                }
                                                throw a.a();
                                            }
                                        }
                                        return s6Var3;
                                    }
                                }
                                s6VarA2 = a5Var.a(a(pVar.d(), pVar.e(), pVar.c()), map);
                                if (s6VarA2 == null) {
                                }
                                throw a.a();
                                if (s6VarA != null) {
                                    p pVar5 = new p(new e4(pVar.a().c()));
                                    pVar5.a(pVar.b().c());
                                    s6VarA3 = a5Var.a(pVar5, map);
                                    if (s6VarA3 == null) {
                                    }
                                    throw a.a();
                                }
                                p pVar6 = new p(new e4(pVar.a().c()));
                                pVar6.a(pVar.b().c());
                                s6VarA3 = a5Var.a(pVar6, map);
                                if (s6VarA3 == null) {
                                }
                                throw a.a();
                                if (s6VarA != null) {
                                    iMax = (int) Math.max(j2Var.d(), 0.0f);
                                    iMax2 = (int) Math.max(j2Var.e(), 0.0f);
                                    int iMin9 = (int) Math.min(j2Var.f(), this.f16237a.c() - iMax);
                                    int iMin10 = (int) Math.min(j2Var.c(), this.f16237a.a() - iMax2);
                                    fArr = new float[8];
                                    bArrQRCornerDetect = LoadOpencvJNIUtil.QRCornerDetect(this.f16237a.a(iMax, iMax2, iMin9, iMin10).b(), iMin9, iMin10, fArr);
                                    if (bArrQRCornerDetect.length != 0) {
                                        pVar2 = new p(new k5(new e6(bArrQRCornerDetect, 256, 256, 0, 0, 256, 256, false)));
                                        s6VarA4 = a5Var.a(pVar2, map);
                                        if (s6VarA4 == null) {
                                        }
                                        throw a.a();
                                    }
                                } else {
                                    iMax = (int) Math.max(j2Var.d(), 0.0f);
                                    iMax2 = (int) Math.max(j2Var.e(), 0.0f);
                                    int iMin11 = (int) Math.min(j2Var.f(), this.f16237a.c() - iMax);
                                    int iMin12 = (int) Math.min(j2Var.c(), this.f16237a.a() - iMax2);
                                    fArr = new float[8];
                                    bArrQRCornerDetect = LoadOpencvJNIUtil.QRCornerDetect(this.f16237a.a(iMax, iMax2, iMin11, iMin12).b(), iMin11, iMin12, fArr);
                                    if (bArrQRCornerDetect.length != 0) {
                                        pVar2 = new p(new k5(new e6(bArrQRCornerDetect, 256, 256, 0, 0, 256, 256, false)));
                                        s6VarA4 = a5Var.a(pVar2, map);
                                        if (s6VarA4 == null) {
                                        }
                                        throw a.a();
                                    }
                                }
                                return s6Var3;
                            }
                        }
                    } catch (a unused6) {
                        s6Var3 = s6Var2;
                        if ((s6VarA != null || s6VarA.k() == null) && r3.f16302c && !r3.f16301b) {
                            s6VarA2 = a5Var.a(a(pVar.d(), pVar.e(), pVar.c()), map);
                            if (s6VarA2 == null && s6VarA2.k() != null) {
                                l2.a(s6VarA2.j(), f, j2Var);
                                return s6VarA2;
                            }
                            throw a.a();
                        }
                        if ((s6VarA != null || s6VarA.k() == null) && (r3.x || (!r3.f16302c && r3.q))) {
                            p pVar7 = new p(new e4(pVar.a().c()));
                            pVar7.a(pVar.b().c());
                            s6VarA3 = a5Var.a(pVar7, map);
                            if (s6VarA3 == null && s6VarA3.k() != null) {
                                l2.a(s6VarA3.j(), f, j2Var);
                                return s6VarA3;
                            }
                            throw a.a();
                        }
                        if ((s6VarA != null || s6VarA.k() == null) && r3.l && !r3.f16301b) {
                            iMax = (int) Math.max(j2Var.d(), 0.0f);
                            iMax2 = (int) Math.max(j2Var.e(), 0.0f);
                            int iMin13 = (int) Math.min(j2Var.f(), this.f16237a.c() - iMax);
                            int iMin14 = (int) Math.min(j2Var.c(), this.f16237a.a() - iMax2);
                            fArr = new float[8];
                            bArrQRCornerDetect = LoadOpencvJNIUtil.QRCornerDetect(this.f16237a.a(iMax, iMax2, iMin13, iMin14).b(), iMin13, iMin14, fArr);
                            if (bArrQRCornerDetect.length != 0) {
                                pVar2 = new p(new k5(new e6(bArrQRCornerDetect, 256, 256, 0, 0, 256, 256, false)));
                                s6VarA4 = a5Var.a(pVar2, map);
                                if (s6VarA4 == null && s6VarA4.k() != null) {
                                    u6[] u6VarArr2 = new u6[4];
                                    int i3 = 0;
                                    for (int i4 = 4; i3 < i4; i4 = 4) {
                                        int i5 = i3 * 2;
                                        u6VarArr2[i3] = new u6(fArr[i5] + iMax, fArr[i5 + 1] + iMax2);
                                        i3++;
                                    }
                                    s6VarA4.b(u6VarArr2);
                                    return s6VarA4;
                                }
                                throw a.a();
                            }
                        }
                        return s6Var3;
                    }
                }
                if (s6VarA != null && s6VarA.k() != null) {
                    l2.a(s6VarA.j(), f, j2Var);
                    return s6VarA;
                }
            }
            throw a.a();
        } catch (a unused7) {
            s6VarA = s6Var;
        }
    }

    public s6 a(Map map) {
        p4 p4VarC;
        float f;
        a5 a5Var = new a5();
        p4 p4Var = this.f16237a;
        if (!r3.f16300a || (this.f16238b.e() <= 800 && this.f16238b.c() <= 800)) {
            p4VarC = p4Var;
            f = 1.0f;
        } else {
            float fMax = Math.max(this.f16238b.e(), this.f16238b.c()) / 800.0f;
            if (r3.f16302c && (this.f16238b.e() > this.f16238b.c() * this.j || this.f16238b.c() > this.f16238b.e() * this.j)) {
                fMax = Math.min(this.f16238b.e(), this.f16238b.c()) / 860.0f;
            }
            p4VarC = this.i.d(this.f16238b, fMax).a().c();
            f = fMax;
        }
        if (p4VarC == null) {
            return null;
        }
        p pVar = new p(new q3(p4VarC));
        j6.a(this.f16237a);
        try {
            if (r3.f16300a) {
                pVar.a(a(p4VarC.b(), p4VarC.c(), p4VarC.a(), false));
            }
            s6 s6VarA = a5Var.a(pVar, map);
            if (s6VarA != null && s6VarA.k() != null) {
                return a(s6VarA, f, 0, 0);
            }
            s6 s6Var = (s6VarA == null || s6VarA.j() == null || s6VarA.j().length < 3) ? null : new s6(null, null, s6VarA.j(), BarcodeFormat.QR_CODE);
            s6 s6Var2 = s6Var == null ? new s6(null, null, null, BarcodeFormat.QR_CODE) : s6Var;
            if (r3.f16302c) {
                s6Var2 = a(a5Var, p4VarC, s6Var2, map, f, 0, 0);
            }
            if (s6Var2 != null && s6Var2.k() != null) {
                return s6Var2;
            }
            if (s6Var2 != null && s6Var2.j() != null) {
                s6Var = s6Var2;
            }
            if (!r3.f16302c && s6Var != null && s6Var.j() != null && s6Var.j().length >= 3) {
                a(s6Var, f, 0, 0);
                float fA = o8.a(this.f16237a.c(), this.f16237a.a(), s6Var.j());
                if (Math.abs(1.0f - fA) > 0.001d) {
                    this.f = fA;
                    this.e = true;
                }
            }
            return s6Var;
        } catch (a unused) {
            Log.e("DecodeProcessor", "decodeQRUseFullImg AIScanException");
        }
    }

    public s6 a(List list, j2 j2Var) {
        s6 s6VarA;
        a5 a5Var = new a5();
        HashMap map = new HashMap();
        map.put(m1.f16208c, list);
        if (r3.f16302c) {
            map.put(m1.d, Boolean.valueOf(r3.f16302c));
        }
        try {
            if (j2Var != null) {
                s6VarA = a5Var.a(this.f16238b, this.d, map, this.i, j2Var);
            } else {
                s6VarA = a5Var.a(this.f16238b, (p) null, map, this.i, (j2) null);
            }
        } catch (a unused) {
            Log.e("DecodeProcessor", "decode1d AIScanException");
            s6VarA = null;
        }
        s6 s6Var = s6VarA;
        if (s6Var != null || r3.f16301b || j2Var == null || !r3.f16302c || j2Var.h() >= 0.8d) {
            return s6Var;
        }
        float fI = j2Var.i() % 180.0f;
        boolean z = false;
        boolean z2 = ((double) j2Var.c()) > ((double) this.f16238b.c()) * 0.97d && ((fI < 5.0f && fI > -5.0f) || fI < -175.0f || fI > 175.0f);
        if (j2Var.b() > ((double) this.f16238b.e()) * 0.97d && ((fI < 95.0f && fI > 85.0f) || (fI < -85.0f && fI > -95.0f))) {
            z = true;
        }
        if (!z2 && !z) {
            return s6Var;
        }
        this.i.a();
        try {
            return a5Var.a(this.f16238b, (p) null, map, this.i, (j2) null);
        } catch (a unused2) {
            Log.e("DecodeProcessor", "decode1d AIScanException");
            return s6Var;
        }
    }

    public List a(int i, boolean z) {
        List listA;
        ArrayList arrayList = new ArrayList();
        if (!r3.f16300a) {
            return arrayList;
        }
        boolean z2 = r3.f16301b;
        if (!z2) {
            byte[] bArrC = y4.c();
            byte[] bArrA = y4.a();
            byte[] bArrB = y4.b();
            LoadOpencvJNIUtil.setModel(bArrC, bArrC.length, bArrA, bArrA.length, bArrB, bArrB.length);
            p pVarA = this.f16238b;
            long jCurrentTimeMillis = System.currentTimeMillis() % 10;
            boolean z3 = jCurrentTimeMillis % 2 == 0;
            boolean z4 = jCurrentTimeMillis % 3 == 0;
            if (i == 0 && !r3.f16302c && z3) {
                pVarA = b(this.f16238b);
            } else if (i == 0 && !r3.f16302c && z4) {
                pVarA = a(b(this.f16238b));
            }
            listA = l2.a(r3.f16301b, pVarA, i, z);
        } else {
            listA = l2.a(z2, this.f16238b, i, z);
        }
        a(listA);
        return listA;
    }

    private static boolean a(p pVar, j2 j2Var) {
        if (r3.f16300a && !r3.f16301b) {
            float fD = j2Var.d();
            float fE = j2Var.e();
            float f = j2Var.f();
            float fC = j2Var.c();
            float f2 = fD - ((f * 0.2f) / 2.0f);
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            float f3 = fE - ((0.2f * fC) / 2.0f);
            float f4 = f3 >= 0.0f ? f3 : 0.0f;
            float fE2 = (f * 1.2f) + f2;
            if (fE2 > pVar.e()) {
                fE2 = pVar.e();
            }
            float fC2 = (fC * 1.2f) + f4;
            if (fC2 > pVar.c()) {
                fC2 = pVar.c();
            }
            float f5 = fE2 - f2;
            float f6 = fC2 - f4;
            if (f5 < pVar.e() / 2.0f && f6 < pVar.c() / 2.0f) {
                for (j2 j2Var2 : l2.a(r3.f16301b, pVar.a((int) f2, (int) f4, (int) f5, (int) f6), 0, true)) {
                    boolean z = j2Var2.g() == 1.0f && ((double) j2Var2.h()) > 0.5d;
                    boolean z2 = j2Var.g() == 2.0f && j2Var2.g() == 2.0f && ((double) j2Var2.h()) > 0.7d;
                    boolean z3 = j2Var.g() == 3.0f && j2Var2.g() == 3.0f && ((double) j2Var2.h()) > 0.7d;
                    boolean z4 = j2Var.g() == 7.0f && j2Var2.g() == 7.0f && ((double) j2Var2.h()) > 0.7d;
                    boolean z5 = j2Var.g() == 6.0f && j2Var2.g() == 6.0f && ((double) j2Var2.h()) > 0.7d;
                    if (z || z2 || z3 || z4 || z5) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }
}
