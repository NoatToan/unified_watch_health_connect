package kotlin;

import h4.r;
import java.util.Arrays;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes.dex */
public final class o3 {
    public static final boolean a(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f14 = fArr[0];
        float f15 = fArr[1];
        float f16 = fArr[2];
        float f17 = fArr[3];
        float f18 = fArr[4];
        float f19 = fArr[5];
        float f22 = fArr[6];
        float f24 = fArr[7];
        float f25 = fArr[8];
        float f26 = fArr[9];
        float f27 = fArr[10];
        float f28 = fArr[11];
        float f29 = fArr[12];
        float f34 = fArr[13];
        float f35 = fArr[14];
        float f36 = fArr[15];
        float f37 = (f14 * f19) - (f15 * f18);
        float f38 = (f14 * f22) - (f16 * f18);
        float f39 = (f14 * f24) - (f17 * f18);
        float f44 = (f15 * f22) - (f16 * f19);
        float f45 = (f15 * f24) - (f17 * f19);
        float f46 = (f16 * f24) - (f17 * f22);
        float f47 = (f25 * f34) - (f26 * f29);
        float f48 = (f25 * f35) - (f27 * f29);
        float f49 = (f25 * f36) - (f28 * f29);
        float f50 = (f26 * f35) - (f27 * f34);
        float f54 = (f26 * f36) - (f28 * f34);
        float f55 = (f27 * f36) - (f28 * f35);
        float f56 = (f46 * f47) + (((f44 * f49) + ((f39 * f50) + ((f37 * f55) - (f38 * f54)))) - (f45 * f48));
        if (f56 != 0.0f) {
            float f57 = 1.0f / f56;
            fArr2[0] = ((f24 * f50) + ((f19 * f55) - (f22 * f54))) * f57;
            fArr2[1] = (((f16 * f54) + ((-f15) * f55)) - (f17 * f50)) * f57;
            fArr2[2] = ((f36 * f44) + ((f34 * f46) - (f35 * f45))) * f57;
            fArr2[3] = (((f27 * f45) + ((-f26) * f46)) - (f28 * f44)) * f57;
            float f58 = -f18;
            fArr2[4] = (((f22 * f49) + (f58 * f55)) - (f24 * f48)) * f57;
            fArr2[5] = ((f17 * f48) + ((f55 * f14) - (f16 * f49))) * f57;
            float f59 = -f29;
            fArr2[6] = (((f35 * f39) + (f59 * f46)) - (f36 * f38)) * f57;
            fArr2[7] = ((f28 * f38) + ((f46 * f25) - (f27 * f39))) * f57;
            fArr2[8] = ((f24 * f47) + ((f18 * f54) - (f19 * f49))) * f57;
            fArr2[9] = (((f49 * f15) + ((-f14) * f54)) - (f17 * f47)) * f57;
            fArr2[10] = ((f36 * f37) + ((f29 * f45) - (f34 * f39))) * f57;
            fArr2[11] = (((f39 * f26) + ((-f25) * f45)) - (f28 * f37)) * f57;
            fArr2[12] = (((f19 * f48) + (f58 * f50)) - (f22 * f47)) * f57;
            fArr2[13] = ((f16 * f47) + ((f14 * f50) - (f15 * f48))) * f57;
            fArr2[14] = (((f34 * f38) + (f59 * f44)) - (f35 * f37)) * f57;
            fArr2[15] = ((f27 * f37) + ((f25 * f44) - (f26 * f38))) * f57;
        }
        return !(f56 == 0.0f);
    }

    public static final String b(Object obj) {
        String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(name);
        sb3.append('@');
        x0 x0Var = x0.f105818a;
        sb3.append(String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
        return sb3.toString();
    }

    public static final r c(r rVar, String str) {
        return rVar.then(new n3(str));
    }
}
