package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.health.servicesapi.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.BaseChoreographyAction;
import com.huawei.pluginfitnessadvice.TargetConfig;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class hcc {
    public static Map<String, Double> c(TargetConfig targetConfig, gzf gzfVar, HeartZoneConf heartZoneConf, boolean z) {
        int iB = CommonUtil.b(BaseApplication.getContext(), targetConfig.getId(), -1);
        LogUtil.a("CustomCourseActionIntensityUtil", "setIntensityTarget intensityConfigId ", Integer.valueOf(iB));
        double d = iB;
        if (d == -1.0d) {
            return d(-1.0d, -1.0d, -1.0d);
        }
        if (iB == 14) {
            if (z) {
                return a(8, 1, heartZoneConf, targetConfig.getValueL());
            }
            return e(13, (int) targetConfig.getValueL(), gzfVar);
        }
        if (BaseChoreographyAction.d.e(iB)) {
            return a(iB, (iB != 17 || heartZoneConf == null || heartZoneConf.getClassifyMethod() == 0) ? 0 : 1, heartZoneConf, targetConfig.getValueL());
        }
        if (iB == 13) {
            return e(iB, (int) targetConfig.getValueL(), gzfVar);
        }
        if (iB == 15) {
            if (targetConfig.getValueL() > 0.0d && targetConfig.getValueH() > 0.0d) {
                return d(d, targetConfig.getValueL(), targetConfig.getValueH());
            }
            return d(d, -1.0d, -1.0d);
        }
        if (iB == 16) {
            return b(iB, targetConfig.getValueL(), targetConfig.getValueH());
        }
        if (iB == 1) {
            return d(4, heartZoneConf, targetConfig);
        }
        return d(d, -1.0d, -1.0d);
    }

    private static Map<String, Double> d(double d, double d2, double d3) {
        LogUtil.a("CustomCourseActionIntensityUtil", "mIntensityType, ", Double.valueOf(d), " mIntensityLow ", Double.valueOf(d2), " mIntensityHeight ", Double.valueOf(d3));
        HashMap map = new HashMap(3);
        map.put("IntensityType", Double.valueOf(d));
        map.put("IntensityLow", Double.valueOf(d2));
        map.put("IntensityHeight", Double.valueOf(d3));
        return map;
    }

    private static Map<String, Double> b(int i, double d, double d2) {
        if (d > 0.0d && d2 > 0.0d) {
            return d(i, d, d2);
        }
        return d(i, -1.0d, -1.0d);
    }

    private static Map<String, Double> d(int i, HeartZoneConf heartZoneConf, TargetConfig targetConfig) {
        if (heartZoneConf == null) {
            return d(i, -1.0d, -1.0d);
        }
        return e(i, heartZoneConf.getMaxThreshold(), targetConfig.getValueL(), targetConfig.getValueH());
    }

    private static Map<String, Double> e(int i, int i2, double d, double d2) {
        double d3;
        double d4;
        if (d <= 0.0d || d2 <= 0.0d || i2 <= 0) {
            d3 = -1.0d;
            d4 = -1.0d;
        } else {
            double d5 = i2;
            d3 = (int) ((d * d5) / 100.0d);
            d4 = (int) ((d5 * d2) / 100.0d);
        }
        return d(i, d3, d4);
    }

    private static Map<String, Double> e(int i, int i2, gzf gzfVar) {
        if (gzfVar == null) {
            LogUtil.j("CustomCourseActionIntensityUtil", "setIntensityPaceZoneValue paceSectionConfig == null ");
            return d(i, -1.0d, -1.0d);
        }
        if (i2 <= 0) {
            LogUtil.j("CustomCourseActionIntensityUtil", "setIntensityPaceZoneValue index <= 0 ");
            return d(i, -1.0d, -1.0d);
        }
        return d(i, gzfVar.b(i2, true), gzfVar.b(i2, false));
    }

    public static String d(Context context, float f) {
        if (context == null) {
            return "";
        }
        int iRound = Math.round(f);
        int i = iRound / 60;
        if (f <= 0.001f) {
            return context.getResources().getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol);
        }
        if (LanguageUtil.p(context)) {
            return UnitUtil.e(iRound);
        }
        String string = context.getResources().getString(R.string.IDS_hwh_motiontrack_show_pace, UnitUtil.e(i, 1, 0), Integer.valueOf(iRound % 60));
        if (TextUtils.isEmpty(string)) {
            return qre.f(R.string.IDS_hw_health_show_healthdata_nodata_symbol);
        }
        return (!LanguageUtil.c(context) || string.length() <= 2) ? string : string.substring(0, string.length() - 2).replace("'", ":");
    }

    private static Map<String, Double> a(int i, int i2, HeartZoneConf heartZoneConf, double d) {
        if (heartZoneConf == null) {
            return d(i, -1.0d, -1.0d);
        }
        return e(i, i2, heartZoneConf, d);
    }

    private static Map<String, Double> e(int i, int i2, HeartZoneConf heartZoneConf, double d) {
        double d2;
        double d3;
        if (d >= 0.0d) {
            int i3 = ((int) d) - 1;
            double zoneValue = heartZoneConf.getZoneValue(i3, true, i2);
            double zoneValue2 = heartZoneConf.getZoneValue(i3, false, i2);
            LogUtil.a("CustomCourseActionIntensityUtil", "setIntensityRelativeHeartRateZoneValue, valueL = ", Double.valueOf(d));
            d3 = zoneValue2;
            d2 = zoneValue;
        } else {
            d2 = -1.0d;
            d3 = -1.0d;
        }
        return d(i, d2, d3);
    }

    public static hca c(HeartZoneConf heartZoneConf) {
        hca hcaVar = new hca();
        if (heartZoneConf != null) {
            hcaVar.b(heartZoneConf.getMaxThreshold());
            hcaVar.d(heartZoneConf.getAnaerobicThreshold());
            hcaVar.e(heartZoneConf.getAerobicThreshold());
            hcaVar.c(heartZoneConf.getFatBurnThreshold());
            hcaVar.g(heartZoneConf.getWarmUpThreshold());
            hcaVar.a(heartZoneConf.getFitnessThreshold());
            return hcaVar;
        }
        LogUtil.j("CustomCourseActionIntensityUtil", "getMaxHeartRateZone, heartZoneConf == null");
        return hcaVar;
    }

    public static hca a(HeartZoneConf heartZoneConf) {
        hca hcaVar = new hca();
        if (heartZoneConf != null) {
            hcaVar.b(heartZoneConf.getMaxThreshold());
            hcaVar.d(heartZoneConf.getAnaerobicAdvanceThreshold());
            hcaVar.e(heartZoneConf.getAnaerobicBaseThreshold());
            hcaVar.c(heartZoneConf.getLacticAcidThreshold());
            hcaVar.g(heartZoneConf.getAerobicAdvanceThreshold());
            hcaVar.a(heartZoneConf.getAerobicBaseThreshold());
            return hcaVar;
        }
        LogUtil.j("CustomCourseActionIntensityUtil", "getReserveHeartRateZone, heartZoneConf == null");
        return hcaVar;
    }

    public static gzf c() {
        return haf.c();
    }

    public static void d(gze gzeVar, Bundle bundle) {
        Map<String, Double> mapM = gzeVar.m();
        if (mapM == null || mapM.isEmpty() || d(mapM)) {
            bundle.putInt("IntensityType", -1);
            return;
        }
        int iIntValue = mapM.get("IntensityType").intValue();
        if (iIntValue == -1) {
            bundle.putInt("IntensityType", -1);
            return;
        }
        int iIntValue2 = mapM.get("IntensityLow").intValue();
        int iIntValue3 = mapM.get("IntensityHeight").intValue();
        if (iIntValue2 == -1 || iIntValue3 == -1) {
            bundle.putInt("IntensityType", -1);
            return;
        }
        bundle.putInt("IntensityType", iIntValue);
        bundle.putDouble("IntensityLow", mapM.get("IntensityLow").doubleValue());
        bundle.putDouble("IntensityHeight", mapM.get("IntensityHeight").doubleValue());
    }

    private static boolean d(Map<String, Double> map) {
        return map.get("IntensityType") == null || map.get("IntensityLow") == null || map.get("IntensityHeight") == null;
    }
}
