package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes28.dex */
public class fgi {
    public static int b(int i, int i2, int i3) {
        if (i < i2) {
            return 1;
        }
        return i > i3 ? -1 : 0;
    }

    private static int e(int i) {
        if (i > 35) {
            return 60;
        }
        return (20 >= i || i > 35) ? 30 : 45;
    }

    public static float a(int i, float f) {
        LogUtil.a("HRControl_BikeHeartRateControl", "getHeartRatePowerFactor vo2Max = ", Integer.valueOf(i), ", weight = ", Float.valueOf(f));
        if (i <= 0) {
            return 1.1f;
        }
        float fFloatValue = new BigDecimal(i).multiply(new BigDecimal(Float.toString(f))).divide(new BigDecimal(2925), 1, RoundingMode.HALF_UP).floatValue();
        LogUtil.a("HRControl_BikeHeartRateControl", "getHeartRatePowerFactor heartRatePowerFactor = ", Float.valueOf(fFloatValue));
        return fFloatValue;
    }

    public static float d(int i, float f) {
        LogUtil.a("HRControl_BikeHeartRateControl", "getRpmPowerFactor vo2Max = ", Integer.valueOf(i), ", weight = ", Float.valueOf(f));
        float fMin = i <= 0 ? 16.0f : Math.min(32.0f, new BigDecimal(15).multiply(new BigDecimal(i)).multiply(new BigDecimal(Float.toString(f))).divide(new BigDecimal(2925), 1, RoundingMode.HALF_UP).floatValue());
        LogUtil.a("HRControl_BikeHeartRateControl", "getRpmPowerFactor rpmPowerFactor = ", Float.valueOf(fMin));
        return fMin;
    }

    public static int e(float f, int i) {
        LogUtil.a("HRControl_BikeHeartRateControl", "getRpmLimitPower rpmPowerFactor = ", Float.valueOf(f), ", currentRpm = ", Integer.valueOf(i));
        BigDecimal bigDecimal = new BigDecimal(Float.toString(f));
        BigDecimal bigDecimal2 = new BigDecimal(i);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(-2.6917118d);
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(0.16503129d);
        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(0.00830111d);
        BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(0.00525906d);
        BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(0.19709128d);
        int iMax = Math.max(20, bigDecimalValueOf.multiply(bigDecimal).add(bigDecimalValueOf2.multiply(bigDecimal2)).subtract(bigDecimalValueOf3.multiply(bigDecimal).multiply(bigDecimal)).add(bigDecimalValueOf4.multiply(bigDecimal2).multiply(bigDecimal2)).add(bigDecimalValueOf5.multiply(bigDecimal).multiply(bigDecimal2)).add(BigDecimal.valueOf(1.65261776753669d)).setScale(0, 4).intValue());
        LogUtil.a("HRControl_BikeHeartRateControl", "getRpmLimitPower rmpLimitPower = ", Integer.valueOf(iMax));
        return iMax;
    }

    public static fgg e(fgg fggVar, int i, int i2, int i3, float f) {
        LogUtil.a("HRControl_BikeHeartRateControl", "getBikeHeartRateAdjustResult lastBikeAdjustResult = ", fggVar.toString(), ", currentHeartRate = ", Integer.valueOf(i), ", targetHR = ", Integer.valueOf(i2), ", adjustOrientation = ", Integer.valueOf(i3), ", heartRatePowerFactor = ", Float.valueOf(f));
        int iA = a(i, i2, i3, f);
        int iE = e(iA);
        fggVar.e(i3);
        fggVar.b(iA);
        fggVar.a(iE);
        if (i3 != 0) {
            fggVar.c(fggVar.b() + 1);
            fggVar.d(fggVar.c() + Math.abs(iA));
        }
        LogUtil.a("HRControl_BikeHeartRateControl", "getBikeHeartRateAdjustResult Result = ", fggVar.toString());
        return fggVar;
    }

    public static fgg b(fgg fggVar, int i, int i2, int i3, float f) {
        LogUtil.a("HRControl_BikeHeartRateControl", "getBikeZoneAdjustResult lastBikeAdjustResult = ", fggVar.toString(), ", currentHeartRate = ", Integer.valueOf(i), ", targetHR = ", Integer.valueOf(i2), ", adjustOrientation = ", Integer.valueOf(i3), ", heartRatePowerFactor = ", Float.valueOf(f));
        int iA = a(i, i2, i3, f);
        int iE = e(iA);
        fggVar.e(i3);
        fggVar.b(iA);
        fggVar.a(iE);
        LogUtil.a("HRControl_BikeHeartRateControl", "getBikeZoneAdjustResult Result = ", fggVar.toString());
        return fggVar;
    }

    private static int a(int i, int i2, int i3, float f) {
        if (i3 == 0) {
            return 0;
        }
        int iIntValue = new BigDecimal(i2 - i).multiply(new BigDecimal(Float.toString(f))).intValue();
        if (i3 == -1) {
            return Math.max(-100, iIntValue);
        }
        if (i3 != 1) {
            return 0;
        }
        return Math.min(50, iIntValue);
    }
}
