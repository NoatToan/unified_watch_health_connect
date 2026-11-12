package defpackage;

import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateZoneMgr;
import health.compact.a.HEXUtils;
import health.compact.a.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class jxs {
    public static byte[] c(HeartRateZoneMgr heartRateZoneMgr) {
        if (heartRateZoneMgr == null || e(heartRateZoneMgr)) {
            LogUtil.e("Track_HeartDataParses", "checkHeartObject() == null ");
            return new byte[0];
        }
        if (b(heartRateZoneMgr)) {
            ReleaseLogUtil.e("Track_HeartDataParses", "heart data exception");
            jxv.c().e();
            return new byte[0];
        }
        HeartRateThresholdConfig postureType = heartRateZoneMgr.getPostureType(1);
        String strE = (b(postureType) ? c(postureType, "") : "") + HEXUtils.b(12) + HEXUtils.b(1) + HEXUtils.b(postureType.getRestHeartRate());
        if (d(postureType)) {
            strE = e(postureType, strE);
        }
        String strB = b(postureType, strE);
        HeartRateThresholdConfig postureType2 = heartRateZoneMgr.getPostureType(2);
        if (b(postureType2)) {
            strB = a(18, postureType2, strB);
        }
        if (d(postureType2)) {
            strB = b(27, postureType2, strB);
        }
        HeartRateThresholdConfig postureType3 = heartRateZoneMgr.getPostureType(3);
        if (b(postureType3)) {
            strB = a(33, postureType3, strB);
        }
        if (d(postureType3)) {
            strB = b(42, postureType3, strB);
        }
        HeartRateThresholdConfig postureType4 = heartRateZoneMgr.getPostureType(4);
        if (b(postureType4)) {
            strB = a(48, postureType4, strB);
        }
        if (d(postureType4)) {
            strB = b(57, postureType4, strB);
        }
        LogUtil.b("Track_HeartDataParses", "getHeartRateZoneConfigure command= ", strB);
        return HEXUtils.a(strB);
    }

    public static boolean b(HeartRateZoneMgr heartRateZoneMgr) {
        HeartRateThresholdConfig postureType = heartRateZoneMgr.getPostureType(1);
        if (e(postureType) || a(postureType)) {
            LogUtil.e("Track_HeartDataParses", "standing exception:", Arrays.toString(postureType.getHeartData()));
            return true;
        }
        HeartRateThresholdConfig postureType2 = heartRateZoneMgr.getPostureType(2);
        if (e(postureType2) || a(postureType2)) {
            LogUtil.e("Track_HeartDataParses", "riding exception:", Arrays.toString(postureType2.getHeartData()));
            return true;
        }
        HeartRateThresholdConfig postureType3 = heartRateZoneMgr.getPostureType(3);
        if (e(postureType3) || a(postureType3)) {
            LogUtil.e("Track_HeartDataParses", "strokes exception:", Arrays.toString(postureType3.getHeartData()));
            return true;
        }
        HeartRateThresholdConfig postureType4 = heartRateZoneMgr.getPostureType(4);
        if (!e(postureType4) && !a(postureType4)) {
            return false;
        }
        LogUtil.e("Track_HeartDataParses", "otherHeart exception:", Arrays.toString(postureType4.getHeartData()));
        return true;
    }

    private static boolean a(HeartRateThresholdConfig heartRateThresholdConfig) {
        return heartRateThresholdConfig.getWarningLimit() == 0;
    }

    private static boolean e(HeartRateThresholdConfig heartRateThresholdConfig) {
        boolean z;
        int[] heartData = heartRateThresholdConfig.getHeartData();
        int length = heartData.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            int i2 = heartData[i];
            if (i2 < 0 || i2 > 220) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            return z;
        }
        return heartRateThresholdConfig.getWarningLimit() == 0;
    }

    private static String a(int i, HeartRateThresholdConfig heartRateThresholdConfig, String str) {
        return ((((((((str + HEXUtils.b(i) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getWarningEnable() ? 1 : 0)) + HEXUtils.b(i + 1) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getClassifyMethod())) + HEXUtils.b(i + 2) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getWarningLimit())) + HEXUtils.b(i + 3) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getFitnessThreshold())) + HEXUtils.b(i + 4) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getWarmUpThreshold())) + HEXUtils.b(i + 5) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getFatBurnThreshold())) + HEXUtils.b(i + 6) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getAerobicThreshold())) + HEXUtils.b(i + 7) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getAnaerobicThreshold())) + HEXUtils.b(i + 8) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getMaxThreshold());
    }

    private static String b(int i, HeartRateThresholdConfig heartRateThresholdConfig, String str) {
        return (((((str + HEXUtils.b(i) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getRestHeartRate())) + HEXUtils.b(i + 1) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getAerobicBaseThreshold())) + HEXUtils.b(i + 2) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getAerobicAdvanceThreshold())) + HEXUtils.b(i + 3) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getLacticAcidThreshold())) + HEXUtils.b(i + 4) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getAnaerobicBaseThreshold())) + HEXUtils.b(i + 5) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getAnaerobicAdvanceThreshold());
    }

    private static boolean e(HeartRateZoneMgr heartRateZoneMgr) {
        return heartRateZoneMgr.getPostureType(1) == null || heartRateZoneMgr.getPostureType(2) == null || heartRateZoneMgr.getPostureType(3) == null || heartRateZoneMgr.getPostureType(4) == null;
    }

    private static boolean b(HeartRateThresholdConfig heartRateThresholdConfig) {
        return (heartRateThresholdConfig.getFitnessThreshold() > 0) && (heartRateThresholdConfig.getWarmUpThreshold() > 0 && heartRateThresholdConfig.getFatBurnThreshold() > 0) && (heartRateThresholdConfig.getAerobicThreshold() > 0 && heartRateThresholdConfig.getAnaerobicThreshold() > 0 && heartRateThresholdConfig.getMaxThreshold() > 0);
    }

    private static boolean d(HeartRateThresholdConfig heartRateThresholdConfig) {
        return (heartRateThresholdConfig.getRestHeartRate() > 0 && heartRateThresholdConfig.getAerobicBaseThreshold() > 0 && heartRateThresholdConfig.getAerobicAdvanceThreshold() > 0) && (heartRateThresholdConfig.getLacticAcidThreshold() > 0 && heartRateThresholdConfig.getAnaerobicBaseThreshold() > 0 && heartRateThresholdConfig.getAnaerobicAdvanceThreshold() > 0);
    }

    private static String b(HeartRateThresholdConfig heartRateThresholdConfig, String str) {
        if (c(heartRateThresholdConfig)) {
            return str;
        }
        return (((((str + HEXUtils.b(63) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getLactateThresholdHeartRate())) + HEXUtils.b(64) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getLthrAnaerobicInterval())) + HEXUtils.b(65) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getLthrLactateThreshold())) + HEXUtils.b(66) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getLthrAerobicHighZone())) + HEXUtils.b(67) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getLthrAerobicLowZone())) + HEXUtils.b(68) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getLthrRecoveryInterval());
    }

    private static boolean c(HeartRateThresholdConfig heartRateThresholdConfig) {
        return heartRateThresholdConfig.getLactateThresholdHeartRate() == 0 || heartRateThresholdConfig.getLthrAnaerobicInterval() == 0 || heartRateThresholdConfig.getLthrLactateThreshold() == 0 || heartRateThresholdConfig.getLthrAerobicHighZone() == 0 || heartRateThresholdConfig.getLthrAerobicLowZone() == 0 || heartRateThresholdConfig.getLthrRecoveryInterval() == 0;
    }

    private static String e(HeartRateThresholdConfig heartRateThresholdConfig, String str) {
        return ((((str + HEXUtils.b(13) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getAerobicBaseThreshold())) + HEXUtils.b(14) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getAerobicAdvanceThreshold())) + HEXUtils.b(15) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getLacticAcidThreshold())) + HEXUtils.b(16) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getAnaerobicBaseThreshold())) + HEXUtils.b(17) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getAnaerobicAdvanceThreshold());
    }

    private static String c(HeartRateThresholdConfig heartRateThresholdConfig, String str) {
        return (((((((((str + HEXUtils.b(2) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getFitnessThreshold())) + HEXUtils.b(3) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getWarmUpThreshold())) + HEXUtils.b(4) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getFatBurnThreshold())) + HEXUtils.b(5) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getAerobicThreshold())) + HEXUtils.b(6) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getAnaerobicThreshold())) + HEXUtils.b(7) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getMaxThreshold())) + HEXUtils.b(8) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getWarningEnable() ? 1 : 0)) + HEXUtils.b(9) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getWarningLimit())) + HEXUtils.b(10) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getClassifyMethod())) + HEXUtils.b(11) + HEXUtils.b(1) + HEXUtils.b(heartRateThresholdConfig.getMaxThreshold());
    }
}
