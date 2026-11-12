package o4;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lo4/a1;", "", "a", "values", "", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f128807b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f128808a;

    static {
        new a(null);
    }

    private /* synthetic */ a1(float[] fArr) {
        this.f128808a = fArr;
    }

    public static final /* synthetic */ a1 a(float[] fArr) {
        return new a1(fArr);
    }

    public static float[] b() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long c(long j8, float[] fArr) {
        if (fArr.length < 16) {
            return j8;
        }
        float f14 = fArr[0];
        float f15 = fArr[1];
        float f16 = fArr[3];
        float f17 = fArr[4];
        float f18 = fArr[5];
        float f19 = fArr[7];
        float f22 = fArr[12];
        float f24 = fArr[13];
        float f25 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        float f26 = 1 / (((f19 * fIntBitsToFloat2) + (f16 * fIntBitsToFloat)) + f25);
        if ((Float.floatToRawIntBits(f26) & Integer.MAX_VALUE) >= 2139095040) {
            f26 = 0.0f;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((((f17 * fIntBitsToFloat2) + (f14 * fIntBitsToFloat)) + f22) * f26)) << 32) | (((long) Float.floatToRawIntBits(((f18 * fIntBitsToFloat2) + (f15 * fIntBitsToFloat) + f24) * f26)) & 4294967295L);
        n4.c.a aVar = n4.c.f123541b;
        return jFloatToRawIntBits;
    }

    public static final void d(float[] fArr, n4.b bVar) {
        if (fArr.length < 16) {
            return;
        }
        float f14 = fArr[0];
        float f15 = fArr[1];
        float f16 = fArr[3];
        float f17 = fArr[4];
        float f18 = fArr[5];
        float f19 = fArr[7];
        float f22 = fArr[12];
        float f24 = fArr[13];
        float f25 = fArr[15];
        float f26 = bVar.f123537a;
        float f27 = bVar.f123538b;
        float f28 = bVar.f123539c;
        float f29 = bVar.f123540d;
        float f34 = f16 * f26;
        float f35 = f19 * f27;
        float f36 = 1.0f / ((f34 + f35) + f25);
        if ((Float.floatToRawIntBits(f36) & Integer.MAX_VALUE) >= 2139095040) {
            f36 = 0.0f;
        }
        float f37 = f14 * f26;
        float f38 = f17 * f27;
        float f39 = (f37 + f38 + f22) * f36;
        float f44 = f26 * f15;
        float f45 = f27 * f18;
        float f46 = (f44 + f45 + f24) * f36;
        float f47 = f19 * f29;
        float f48 = 1.0f / ((f34 + f47) + f25);
        if ((Float.floatToRawIntBits(f48) & Integer.MAX_VALUE) >= 2139095040) {
            f48 = 0.0f;
        }
        float f49 = f17 * f29;
        float f50 = (f37 + f49 + f22) * f48;
        float f54 = f18 * f29;
        float f55 = (f44 + f54 + f24) * f48;
        float f56 = f16 * f28;
        float f57 = 1.0f / ((f35 + f56) + f25);
        if ((Float.floatToRawIntBits(f57) & Integer.MAX_VALUE) >= 2139095040) {
            f57 = 0.0f;
        }
        float f58 = f14 * f28;
        float f59 = (f58 + f38 + f22) * f57;
        float f64 = f28 * f15;
        float f65 = (f45 + f64 + f24) * f57;
        float f66 = 1.0f / ((f56 + f47) + f25);
        float f67 = (Float.floatToRawIntBits(f66) & Integer.MAX_VALUE) < 2139095040 ? f66 : 0.0f;
        float f68 = (f58 + f49 + f22) * f67;
        float f69 = (f64 + f54 + f24) * f67;
        bVar.f123537a = Math.min(f39, Math.min(f50, Math.min(f59, f68)));
        bVar.f123538b = Math.min(f46, Math.min(f55, Math.min(f65, f69)));
        bVar.f123539c = Math.max(f39, Math.max(f50, Math.max(f59, f68)));
        bVar.f123540d = Math.max(f46, Math.max(f55, Math.max(f65, f69)));
    }

    public static final void e(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void f(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        double d14 = ((double) 180.0f) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d14);
        float fCos = (float) Math.cos(d14);
        float f14 = fArr[1];
        float f15 = fArr[2];
        float f16 = (f14 * fCos) - (f15 * fSin);
        float f17 = fArr[5];
        float f18 = fArr[6];
        float f19 = (f17 * fCos) - (f18 * fSin);
        float f22 = fArr[9];
        float f24 = fArr[10];
        float f25 = (f22 * fCos) - (f24 * fSin);
        float f26 = fArr[13];
        float f27 = fArr[14];
        float f28 = (f26 * fCos) - (f27 * fSin);
        fArr[1] = f16;
        fArr[2] = (f15 * fCos) + (f14 * fSin);
        fArr[5] = f19;
        fArr[6] = (f18 * fCos) + (f17 * fSin);
        fArr[9] = f25;
        fArr[10] = (f24 * fCos) + (f22 * fSin);
        fArr[13] = f28;
        fArr[14] = (f27 * fCos) + (f26 * fSin);
    }

    public static final void g(float f14, float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        double d14 = ((double) f14) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d14);
        float fCos = (float) Math.cos(d14);
        float f15 = fArr[0];
        float f16 = fArr[4];
        float f17 = (fSin * f16) + (fCos * f15);
        float f18 = -fSin;
        float f19 = (f16 * fCos) + (f15 * f18);
        float f22 = fArr[1];
        float f24 = fArr[5];
        float f25 = (fSin * f24) + (fCos * f22);
        float f26 = (f24 * fCos) + (f22 * f18);
        float f27 = fArr[2];
        float f28 = fArr[6];
        float f29 = (fSin * f28) + (fCos * f27);
        float f34 = (f28 * fCos) + (f27 * f18);
        float f35 = fArr[3];
        float f36 = fArr[7];
        float f37 = (fSin * f36) + (fCos * f35);
        fArr[0] = f17;
        fArr[1] = f25;
        fArr[2] = f29;
        fArr[3] = f37;
        fArr[4] = f19;
        fArr[5] = f26;
        fArr[6] = f34;
        fArr[7] = (fCos * f36) + (f18 * f35);
    }

    public static final void h(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f14 = fArr[0];
            float f15 = fArr2[0];
            float f16 = fArr[1];
            float f17 = fArr2[4];
            float f18 = fArr[2];
            float f19 = fArr2[8];
            float f22 = f18 * f19;
            float f24 = fArr[3];
            float f25 = fArr2[12];
            float f26 = f24 * f25;
            float f27 = f26 + f22 + (f16 * f17) + (f14 * f15);
            float f28 = fArr2[1];
            float f29 = fArr2[5];
            float f34 = fArr2[9];
            float f35 = f18 * f34;
            float f36 = fArr2[13];
            float f37 = f24 * f36;
            float f38 = f37 + f35 + (f16 * f29) + (f14 * f28);
            float f39 = fArr2[2];
            float f44 = fArr2[6];
            float f45 = fArr2[10];
            float f46 = f18 * f45;
            float f47 = fArr2[14];
            float f48 = f24 * f47;
            float f49 = f48 + f46 + (f16 * f44) + (f14 * f39);
            float f50 = fArr2[3];
            float f54 = fArr2[7];
            float f55 = fArr2[11];
            float f56 = f18 * f55;
            float f57 = fArr2[15];
            float f58 = f24 * f57;
            float f59 = f58 + f56 + (f16 * f54) + (f14 * f50);
            float f64 = fArr[4];
            float f65 = fArr[5];
            float f66 = fArr[6];
            float f67 = (f66 * f19) + (f65 * f17) + (f64 * f15);
            float f68 = fArr[7];
            float f69 = (f68 * f25) + f67;
            float f74 = (f68 * f36) + (f66 * f34) + (f65 * f29) + (f64 * f28);
            float f75 = (f68 * f47) + (f66 * f45) + (f65 * f44) + (f64 * f39);
            float f76 = f66 * f55;
            float f77 = f68 * f57;
            float f78 = f77 + f76 + (f65 * f54) + (f64 * f50);
            float f79 = fArr[8];
            float f84 = fArr[9];
            float f85 = fArr[10];
            float f86 = (f85 * f19) + (f84 * f17) + (f79 * f15);
            float f87 = fArr[11];
            float f88 = (f87 * f25) + f86;
            float f89 = (f87 * f36) + (f85 * f34) + (f84 * f29) + (f79 * f28);
            float f93 = (f87 * f47) + (f85 * f45) + (f84 * f44) + (f79 * f39);
            float f94 = f85 * f55;
            float f95 = f87 * f57;
            float f96 = f95 + f94 + (f84 * f54) + (f79 * f50);
            float f97 = fArr[12];
            float f98 = fArr[13];
            float f99 = (f17 * f98) + (f15 * f97);
            float f100 = fArr[14];
            float f101 = (f19 * f100) + f99;
            float f102 = fArr[15];
            float f103 = (f25 * f102) + f101;
            float f104 = f34 * f100;
            float f105 = f36 * f102;
            float f106 = f105 + f104 + (f29 * f98) + (f28 * f97);
            float f107 = f45 * f100;
            float f108 = f47 * f102;
            float f109 = f108 + f107 + (f44 * f98) + (f39 * f97);
            float f110 = f100 * f55;
            float f111 = f102 * f57;
            fArr[0] = f27;
            fArr[1] = f38;
            fArr[2] = f49;
            fArr[3] = f59;
            fArr[4] = f69;
            fArr[5] = f74;
            fArr[6] = f75;
            fArr[7] = f78;
            fArr[8] = f88;
            fArr[9] = f89;
            fArr[10] = f93;
            fArr[11] = f96;
            fArr[12] = f103;
            fArr[13] = f106;
            fArr[14] = f109;
            fArr[15] = f111 + f110 + (f98 * f54) + (f97 * f50);
        }
    }

    public static final void i(float[] fArr, float f14, float f15) {
        if (fArr.length < 16) {
            return;
        }
        float f16 = (fArr[8] * 0.0f) + (fArr[4] * f15) + (fArr[0] * f14) + fArr[12];
        float f17 = (fArr[9] * 0.0f) + (fArr[5] * f15) + (fArr[1] * f14) + fArr[13];
        float f18 = (fArr[10] * 0.0f) + (fArr[6] * f15) + (fArr[2] * f14) + fArr[14];
        float f19 = (fArr[11] * 0.0f) + (fArr[7] * f15) + (fArr[3] * f14) + fArr[15];
        fArr[12] = f16;
        fArr[13] = f17;
        fArr[14] = f18;
        fArr[15] = f19;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a1) {
            return p005kotlin.jvm.internal.s.g(this.f128808a, ((a1) obj).f128808a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f128808a);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("\n            |");
        float[] fArr = this.f128808a;
        sb3.append(fArr[0]);
        sb3.append(' ');
        sb3.append(fArr[1]);
        sb3.append(' ');
        sb3.append(fArr[2]);
        sb3.append(' ');
        sb3.append(fArr[3]);
        sb3.append("|\n            |");
        sb3.append(fArr[4]);
        sb3.append(' ');
        sb3.append(fArr[5]);
        sb3.append(' ');
        sb3.append(fArr[6]);
        sb3.append(' ');
        sb3.append(fArr[7]);
        sb3.append("|\n            |");
        sb3.append(fArr[8]);
        sb3.append(' ');
        sb3.append(fArr[9]);
        sb3.append(' ');
        sb3.append(fArr[10]);
        sb3.append(' ');
        sb3.append(fArr[11]);
        sb3.append("|\n            |");
        sb3.append(fArr[12]);
        sb3.append(' ');
        sb3.append(fArr[13]);
        sb3.append(' ');
        sb3.append(fArr[14]);
        sb3.append(' ');
        sb3.append(fArr[15]);
        sb3.append("|\n        ");
        return d53.n.c(sb3.toString());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lo4/a1$a;", "", "<init>", "()V", "", "ScaleX", "I", "SkewY", "Perspective0", "SkewX", "ScaleY", "Perspective1", "ScaleZ", "TranslateX", "TranslateY", "TranslateZ", "Perspective2", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
