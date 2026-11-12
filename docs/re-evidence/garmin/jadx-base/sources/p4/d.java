package p4;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static c a(c cVar, s sVar) {
        a.f135532b.getClass();
        a.C2569a c2569a = a.f135533c;
        long j8 = cVar.f135542b;
        b.f135535b.getClass();
        if (b.a(j8, b.f135536c)) {
            q qVar = (q) cVar;
            s sVar2 = qVar.f135602d;
            if (!c(sVar2, sVar)) {
                return new q(qVar, f(b(c2569a.f135534a, sVar2.a(), sVar.a()), qVar.f135607i), sVar);
            }
        }
        return cVar;
    }

    public static final float[] b(float[] fArr, float[] fArr2, float[] fArr3) {
        h(fArr, fArr2);
        h(fArr, fArr3);
        return f(e(fArr), g(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static final boolean c(s sVar, s sVar2) {
        if (sVar == sVar2) {
            return true;
        }
        return Math.abs(sVar.f135625a - sVar2.f135625a) < 0.001f && Math.abs(sVar.f135626b - sVar2.f135626b) < 0.001f;
    }

    public static final g d(c cVar, c cVar2) {
        if (cVar == cVar2) {
            g.f135570e.getClass();
            m.f135589b.getClass();
            return new f(cVar, m.f135590c);
        }
        long j8 = cVar.f135542b;
        b.f135535b.getClass();
        long j14 = b.f135536c;
        int i14 = 0;
        p005kotlin.jvm.internal.j jVar = null;
        return (b.a(j8, j14) && b.a(cVar2.f135542b, j14)) ? new g.b((q) cVar, (q) cVar2, i14, jVar) : new g(cVar, cVar2, i14, jVar);
    }

    public static final float[] e(float[] fArr) {
        float f14 = fArr[0];
        float f15 = fArr[3];
        float f16 = fArr[6];
        float f17 = fArr[1];
        float f18 = fArr[4];
        float f19 = fArr[7];
        float f22 = fArr[2];
        float f24 = fArr[5];
        float f25 = fArr[8];
        float f26 = (f18 * f25) - (f19 * f24);
        float f27 = (f19 * f22) - (f17 * f25);
        float f28 = (f17 * f24) - (f18 * f22);
        float f29 = (f16 * f28) + (f15 * f27) + (f14 * f26);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f26 / f29;
        fArr2[1] = f27 / f29;
        fArr2[2] = f28 / f29;
        fArr2[3] = hb.a.c(f15, f25, f16 * f24, f29);
        fArr2[4] = hb.a.c(f16, f22, f25 * f14, f29);
        fArr2[5] = hb.a.c(f14, f24, f22 * f15, f29);
        fArr2[6] = hb.a.c(f16, f18, f15 * f19, f29);
        fArr2[7] = hb.a.c(f14, f19, f16 * f17, f29);
        fArr2[8] = hb.a.c(f15, f17, f14 * f18, f29);
        return fArr2;
    }

    public static final float[] f(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f14 = fArr[0] * fArr2[0];
        float f15 = fArr[3];
        float f16 = fArr2[1];
        float f17 = fArr[6];
        float f18 = fArr2[2];
        fArr3[0] = (f17 * f18) + (f15 * f16) + f14;
        float f19 = fArr[1];
        float f22 = fArr2[0];
        float f24 = fArr[4];
        float f25 = fArr[7];
        float f26 = f25 * f18;
        fArr3[1] = f26 + (f16 * f24) + (f19 * f22);
        float f27 = fArr[2] * f22;
        float f28 = fArr[5];
        float f29 = (fArr2[1] * f28) + f27;
        float f34 = fArr[8];
        fArr3[2] = (f18 * f34) + f29;
        float f35 = fArr[0];
        float f36 = fArr2[3] * f35;
        float f37 = fArr2[4];
        float f38 = (f15 * f37) + f36;
        float f39 = fArr2[5];
        fArr3[3] = (f17 * f39) + f38;
        float f44 = fArr[1];
        float f45 = fArr2[3];
        float f46 = f24 * f37;
        fArr3[4] = (f25 * f39) + f46 + (f44 * f45);
        float f47 = fArr[2];
        float f48 = f39 * f34;
        fArr3[5] = f48 + (f28 * fArr2[4]) + (f45 * f47);
        float f49 = f35 * fArr2[6];
        float f50 = fArr[3];
        float f54 = fArr2[7];
        float f55 = (f50 * f54) + f49;
        float f56 = fArr2[8];
        fArr3[6] = (f17 * f56) + f55;
        float f57 = fArr2[6];
        float f58 = f25 * f56;
        fArr3[7] = f58 + (fArr[4] * f54) + (f44 * f57);
        float f59 = f34 * f56;
        fArr3[8] = f59 + (fArr[5] * fArr2[7]) + (f47 * f57);
        return fArr3;
    }

    public static final float[] g(float[] fArr, float[] fArr2) {
        float f14 = fArr[0];
        float f15 = fArr2[0] * f14;
        float f16 = fArr[1];
        float f17 = fArr2[1] * f16;
        float f18 = fArr[2];
        return new float[]{f15, f17, fArr2[2] * f18, fArr2[3] * f14, fArr2[4] * f16, fArr2[5] * f18, f14 * fArr2[6], f16 * fArr2[7], f18 * fArr2[8]};
    }

    public static final float[] h(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f14 = fArr2[0];
        float f15 = fArr2[1];
        float f16 = fArr2[2];
        fArr2[0] = (fArr[6] * f16) + (fArr[3] * f15) + (fArr[0] * f14);
        fArr2[1] = (fArr[7] * f16) + (fArr[4] * f15) + (fArr[1] * f14);
        fArr2[2] = (fArr[8] * f16) + (fArr[5] * f15) + (fArr[2] * f14);
        return fArr2;
    }
}
