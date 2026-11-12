package defpackage;

import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes28.dex */
public class fgz {
    public static int c(int i) {
        return (i < 80 || i > 250) ? MachineControlPointResponse.OP_CODE_EXTENSION_SET_UNLOCK_CODE : i;
    }

    public static int d(int i) {
        if (i <= 0) {
            return 35;
        }
        return i;
    }

    public static int e(int i) {
        if (i < 40 || i > 85) {
            return 65;
        }
        return i;
    }

    public static float e(float f) {
        if (Float.compare(f, 30.0f) < 0 || Float.compare(f, 200.0f) > 0) {
            return 70.0f;
        }
        return f;
    }

    public static float d(float f, int i) {
        float fE = e(f);
        BigDecimal bigDecimalDivide = new BigDecimal(c(i)).divide(new BigDecimal(100), 2, RoundingMode.HALF_UP);
        return new BigDecimal(Float.toString(fE)).divide(bigDecimalDivide.multiply(bigDecimalDivide), RoundingMode.HALF_UP).floatValue();
    }

    public static int a(int i) {
        if (i <= 0) {
            return 0;
        }
        return Math.min(90, Math.max(20, i));
    }

    public static float c(float f, int i, float f2, int i2) {
        int iA = a(i);
        float fD = d(f2, i2);
        if (Float.compare(f, 1.0E-6f) > 0) {
            return new BigDecimal(Float.toString(f)).subtract(BigDecimal.valueOf(1.5d)).floatValue();
        }
        if (iA > 0) {
            return new BigDecimal(i - 13).subtract(BigDecimal.valueOf(1.5d)).floatValue();
        }
        if (fD > 25.2f) {
            return 25.0f;
        }
        return fD <= 24.0f ? 30.0f : 27.0f;
    }

    public static int c(int i, int i2) {
        return (i < 155 || i > 200) ? 209 - BigDecimal.valueOf(0.7d).multiply(new BigDecimal(d(i2))).intValue() : i;
    }
}
