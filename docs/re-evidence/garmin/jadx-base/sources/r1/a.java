package r1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lr1/a;", "", "<init>", "()V", "a", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f148963a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f148964b;

    /* JADX INFO: renamed from: r1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr1/a$a;", "", "", "distanceCoefficient", "velocityCoefficient", "<init>", "(FF)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class C2811a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f148965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f148966b;

        public C2811a(float f14, float f15) {
            this.f148965a = f14;
            this.f148966b = f15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2811a)) {
                return false;
            }
            C2811a c2811a = (C2811a) obj;
            return Float.compare(this.f148965a, c2811a.f148965a) == 0 && Float.compare(this.f148966b, c2811a.f148966b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f148966b) + (Float.hashCode(this.f148965a) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("FlingResult(distanceCoefficient=");
            sb3.append(this.f148965a);
            sb3.append(", velocityCoefficient=");
            return q6.f.p(sb3, this.f148966b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    static {
        float f14;
        float fC;
        float f15;
        float f16;
        float f17;
        float f18;
        float fC2;
        float f19;
        float f22;
        float f24;
        float[] fArr = new float[101];
        f148964b = fArr;
        float[] fArr2 = new float[101];
        float f25 = 0.0f;
        int i14 = 0;
        float f26 = 0.0f;
        while (true) {
            float f27 = 1.0f;
            if (i14 >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f28 = i14 / 100;
            float f29 = 1.0f;
            while (true) {
                f14 = 2.0f;
                fC = q6.f.c(f29, f25, 2.0f, f25);
                f15 = f27 - fC;
                f16 = fC * 3.0f * f15;
                f17 = fC * fC * fC;
                float f34 = (((fC * 0.35000002f) + (f15 * 0.175f)) * f16) + f17;
                f18 = f27;
                if (Math.abs(f34 - f28) < 1.0E-5d) {
                    break;
                }
                if (f34 > f28) {
                    f29 = fC;
                } else {
                    f25 = fC;
                }
                f27 = f18;
            }
            float f35 = 0.5f;
            fArr[i14] = (((f15 * 0.5f) + fC) * f16) + f17;
            float f36 = f18;
            while (true) {
                fC2 = q6.f.c(f36, f26, f14, f26);
                f19 = f18 - fC2;
                f22 = fC2 * 3.0f * f19;
                f24 = fC2 * fC2 * fC2;
                float f37 = (((f19 * f35) + fC2) * f22) + f24;
                if (Math.abs(f37 - f28) >= 1.0E-5d) {
                    if (f37 > f28) {
                        f36 = fC2;
                    } else {
                        f26 = fC2;
                    }
                    f35 = 0.5f;
                    f14 = 2.0f;
                }
            }
            fArr2[i14] = (((fC2 * 0.35000002f) + (f19 * 0.175f)) * f22) + f24;
            i14++;
        }
    }

    private a() {
    }

    public static C2811a a(float f14) {
        float f15 = 0.0f;
        float f16 = 1.0f;
        float fD = j23.t.d(f14, 0.0f, 1.0f);
        float f17 = 100;
        int i14 = (int) (f17 * fD);
        if (i14 < 100) {
            float f18 = i14 / f17;
            int i15 = i14 + 1;
            float f19 = i15 / f17;
            float[] fArr = f148964b;
            float f22 = fArr[i14];
            float f24 = (fArr[i15] - f22) / (f19 - f18);
            float fA = j20.x.a(fD, f18, f24, f22);
            f15 = f24;
            f16 = fA;
        }
        return new C2811a(f16, f15);
    }
}
