package defpackage;

import com.huawei.up.model.UserInfomation;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class iym {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int[] f38213c = {0, 0};
    private static int[] e = {0, 0};
    private static final float[] d = {1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f38212a = {0.0f, 0.0f};

    private static float d(int i) {
        float f;
        float f2;
        float f3;
        if (i == 0) {
            i = 170;
        }
        if (i < 149) {
            f2 = i;
            f3 = 0.48f;
        } else {
            if (i >= 166) {
                if (i < 185) {
                    f2 = i;
                    f3 = 0.56f;
                } else {
                    f = 110.0f;
                }
                return f / 100.0f;
            }
            f2 = i;
            f3 = (0.0025f * f2) + 0.145f;
        }
        f = f2 * f3;
        return f / 100.0f;
    }

    private static float e(int i) {
        if (i <= 0 || i > 220) {
            return 1.0f;
        }
        if (i <= 96) {
            return 0.75f;
        }
        if (i <= 132) {
            return 0.85f;
        }
        return i >= 180 ? 1.1f : 1.0f;
    }

    private static float d(int i, UserInfomation userInfomation) {
        if (i <= 0) {
            return 0.0f;
        }
        return i * (((userInfomation == null ? 170 : userInfomation.getHeightOrDefaultValue()) * 0.42f) / 100.0f);
    }

    private static float a(int i, UserInfomation userInfomation, int i2, int i3, boolean z) {
        if (i2 <= 0 || i3 > 1) {
            return -1.0f;
        }
        if (i3 == 0) {
            return a(i, userInfomation, i2, z);
        }
        return d(i, userInfomation);
    }

    private static float a(int i, UserInfomation userInfomation, int i2, boolean z) {
        if (i2 <= 0) {
            return -1.0f;
        }
        int heightOrDefaultValue = userInfomation == null ? 170 : userInfomation.getHeightOrDefaultValue();
        int iD = d(i, i2);
        float fD = d(heightOrDefaultValue);
        if (z) {
            fD *= e(iD);
        }
        return i * fD;
    }

    private static int d(int i, int i2) {
        if (i2 != 0) {
            return (i * 60) / i2;
        }
        return 0;
    }

    public static float b(int i, UserInfomation userInfomation, int i2, int i3) {
        if (i2 <= 0) {
            return -1.0f;
        }
        if (i3 > 1 || i3 < 0) {
            return -1.0f;
        }
        int iD = d(i, i2);
        float fA = a(iD, i3);
        if (fA < 0.4f || fA > 1.6f) {
            fA = 1.0f;
        }
        return fA * (iyv.e(0.025f, 0.2f, 185.0f, iD) + 1.0f) * a(i, userInfomation, i2, i3, fA != 1.0f);
    }

    private static float a(int i, int i2) {
        float f;
        float f2;
        float f3 = i;
        if (f3 < f38213c[i2] * 0.95f || f3 > e[i2] * 1.05f) {
            return 1.0f;
        }
        float[] fArr = d;
        if (i2 > fArr.length) {
            return 1.0f;
        }
        if (i < 80) {
            f = fArr[i2];
            f2 = f38212a[i2];
            f3 = 80.0f;
        } else if (i > 220) {
            f = fArr[i2];
            f2 = f38212a[i2];
            f3 = 220.0f;
        } else {
            f = fArr[i2];
            f2 = f38212a[i2];
        }
        return f + (f2 * f3);
    }

    public static int c(UserInfomation userInfomation, int[] iArr, int[] iArr2, float[] fArr, int i) {
        int length;
        if (iArr == null || iArr2 == null || fArr == null || (length = iArr.length) == 0 || iArr2.length != length || fArr.length != length || i > 1) {
            return -1;
        }
        float[] fArr2 = new float[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return -2;
            }
            fArr2[i2] = (iArr2[i2] * 60.0f) / i3;
        }
        float[] fArr3 = new float[length];
        for (int i4 = 0; i4 < length; i4++) {
            float fA = a(iArr2[i4], userInfomation, iArr[i4], i, true);
            if (fA == 0.0f) {
                return -3;
            }
            fArr3[i4] = fArr[i4] / fA;
        }
        float[] fArr4 = f38212a;
        float fD = iyy.d(fArr2, fArr3);
        fArr4[i] = fD;
        d[i] = iyy.d(fArr2, fArr3, fD);
        e(fArr2, i);
        return 0;
    }

    private static void e(float[] fArr, int i) {
        Arrays.sort(fArr);
        f38213c[i] = (int) fArr[0];
        e[i] = (int) fArr[fArr.length - 1];
    }
}
