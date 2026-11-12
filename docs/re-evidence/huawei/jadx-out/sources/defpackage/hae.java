package defpackage;

import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.health.servicesui.R;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateZoneMgr;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class hae {
    public static int d(int i) {
        HiUserPreference userPreference;
        if (i < 1 || i > 4) {
            i = 1;
        }
        int iE = 0;
        if (i == 1 && (userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.UserPreference_HeartRate_Classify_Method")) != null) {
            iE = CommonUtil.e(userPreference.getValue(), 0);
        }
        HeartZoneConf heartZoneConfE = e(i);
        return heartZoneConfE != null ? heartZoneConfE.getClassifyMethod() : iE;
    }

    public static List<String> c(int i) {
        ArrayList arrayList = new ArrayList(10);
        if (i == 1) {
            arrayList.add(BaseApplication.getContext().getString(R.string.IDS_rate_zone_hrr_aerobicBase_threshold));
            arrayList.add(BaseApplication.getContext().getString(R.string.IDS_rate_zone_hrr_aerobicAdvance_threshold));
            arrayList.add(BaseApplication.getContext().getString(R.string.IDS_rate_zone_hrr_lacticAcid_threshold));
            arrayList.add(BaseApplication.getContext().getString(R.string.IDS_rate_zone_hrr_anaerobicBase_threshold));
            arrayList.add(BaseApplication.getContext().getString(R.string.IDS_rate_zone_hrr_anaerobicAdvance_threshold));
            return arrayList;
        }
        if (i == 3) {
            arrayList.add(BaseApplication.getContext().getString(R.string.IDS_lactate_subHeader_top8));
            arrayList.add(BaseApplication.getContext().getString(R.string.IDS_rate_zone_hrr_aerobicBase_threshold));
            arrayList.add(BaseApplication.getContext().getString(R.string.IDS_rate_zone_hrr_aerobicAdvance_threshold));
            arrayList.add(BaseApplication.getContext().getString(R.string.IDS_rate_zone_hrr_lacticAcid_threshold));
            arrayList.add(BaseApplication.getContext().getString(R.string.IDS_lactate_subHeader_top7));
            return arrayList;
        }
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_rate_zone_warmup_threshold));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_rate_zone_fatburn_threshold_string));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_rate_zone_aerobic_threshold));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_rate_zone_anaerobic_threshold));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_rate_zone_maximum_threshold));
        return arrayList;
    }

    public static HeartZoneConf a(int i, int i2) {
        HeartZoneConf heartZoneConfD;
        if (i < 1 || i > 4) {
            i = 1;
        }
        if (i == 1) {
            heartZoneConfD = d();
            LogUtil.a("Track_HeartRateConfigUtils", "get standing posture data");
        } else {
            heartZoneConfD = null;
        }
        HeartZoneConf heartZoneConfE = e(i);
        if (heartZoneConfE != null) {
            LogUtil.a("Track_HeartRateConfigUtils", "get multiple heart rate data ", Integer.valueOf(heartZoneConfE.getClassifyMethod()));
            heartZoneConfD = heartZoneConfE;
        }
        if (heartZoneConfD != null) {
            return heartZoneConfD;
        }
        HeartZoneConf heartZoneConf = new HeartZoneConf(i2);
        LogUtil.a("Track_HeartRateConfigUtils", "no heart rate data ", Integer.valueOf(heartZoneConf.getMaxThreshold()));
        return heartZoneConf;
    }

    public static HeartZoneConf d(int i, int i2, int i3) {
        HeartZoneConf heartZoneConfA = a(i, i2);
        LogUtil.a("Track_HeartRateConfigUtils", "get Classify Method ", Integer.valueOf(heartZoneConfA.getClassifyMethod()));
        heartZoneConfA.setClassifyMethod(i3);
        return heartZoneConfA;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private static HeartZoneConf d() {
        HeartZoneConf heartZoneConf;
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.UserPreference_HeartZone_Config");
        if (userPreference == null || userPreference.getValue() == null) {
            heartZoneConf = null;
        } else {
            String[] strArrSplit = userPreference.getValue().split(",");
            if (strArrSplit.length == 2) {
                heartZoneConf = new HeartZoneConf();
                heartZoneConf.setHRZoneConf(strArrSplit[0]);
                heartZoneConf.setThreshold(strArrSplit[1]);
            } else {
                heartZoneConf = null;
            }
        }
        HiUserPreference userPreference2 = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.UserPreference_HRRHeartZone_Config");
        if (userPreference2 != null && userPreference2.getValue() != null) {
            String[] strArrSplit2 = userPreference2.getValue().split(",");
            if (strArrSplit2.length == 2) {
                if (heartZoneConf == null) {
                    heartZoneConf = new HeartZoneConf();
                }
                heartZoneConf.setHRRHRZoneConf(strArrSplit2[0]);
                heartZoneConf.setHrrThreshold(strArrSplit2[1]);
            }
        }
        if (heartZoneConf != null) {
            heartZoneConf.setClassifyMethod(d(1));
        }
        return heartZoneConf;
    }

    public static HeartZoneConf e(int i) {
        HeartRateZoneMgr heartRateZoneMgrByCache;
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi != null) {
            LogUtil.j("Track_HeartRateConfigUtils", "getHeartRateConfigByNewDb healthDataMgrApi not null");
            heartRateZoneMgrByCache = healthDataMgrApi.getHeartRateZoneMgrByCache();
        } else {
            heartRateZoneMgrByCache = null;
        }
        HeartZoneConf heartZoneConf = new HeartZoneConf();
        if (heartRateZoneMgrByCache == null) {
            LogUtil.e("Track_HeartRateConfigUtils", "getPostureHeartZoneConf object != null");
            return heartZoneConf;
        }
        if (i < 1 || i > 4) {
            i = 1;
        }
        HeartRateThresholdConfig postureType = heartRateZoneMgrByCache.getPostureType(i);
        if (postureType == null) {
            LogUtil.e("Track_HeartRateConfigUtils", "temp == null");
            return heartZoneConf;
        }
        b(heartZoneConf, postureType);
        heartZoneConf.setAnaerobicThreshold(postureType.getAnaerobicThreshold());
        heartZoneConf.setAerobicThreshold(postureType.getAerobicThreshold());
        heartZoneConf.setFatBurnThreshold(postureType.getFatBurnThreshold());
        heartZoneConf.setWarmUpThreshold(postureType.getWarmUpThreshold());
        heartZoneConf.setFitnessThreshold(postureType.getFitnessThreshold());
        heartZoneConf.setAnaerobicAdvanceThreshold(postureType.getAnaerobicAdvanceThreshold());
        heartZoneConf.setAnaerobicBaseThreshold(postureType.getAnaerobicBaseThreshold());
        heartZoneConf.setLacticAcidThreshold(postureType.getLacticAcidThreshold());
        heartZoneConf.setAerobicAdvanceThreshold(postureType.getAerobicAdvanceThreshold());
        heartZoneConf.setAerobicBaseThreshold(postureType.getAerobicBaseThreshold());
        heartZoneConf.setLactateThresholdHeartRate(postureType.getLactateThresholdHeartRate());
        heartZoneConf.setLthrAnaerobicInterval(postureType.getLthrAnaerobicInterval());
        heartZoneConf.setLthrLactateThreshold(postureType.getLthrLactateThreshold());
        heartZoneConf.setLthrAerobicHighZone(postureType.getLthrAerobicHighZone());
        heartZoneConf.setLthrAerobicLowZone(postureType.getLthrAerobicLowZone());
        heartZoneConf.setLthrRecoveryInterval(postureType.getLthrRecoveryInterval());
        LogUtil.a("Track_HeartRateConfigUtils", "getClassifyMethod = ", Integer.valueOf(postureType.getClassifyMethod()));
        return heartZoneConf;
    }

    private static void b(HeartZoneConf heartZoneConf, HeartRateThresholdConfig heartRateThresholdConfig) {
        heartZoneConf.setClassifyMethod(heartRateThresholdConfig.getClassifyMethod());
        heartZoneConf.setMaxThreshold(heartRateThresholdConfig.getMaxThreshold());
        heartZoneConf.setRestHeartRate(heartRateThresholdConfig.getRestHeartRate());
        heartZoneConf.setWarningEnble(heartRateThresholdConfig.getWarningEnable());
        heartZoneConf.setWarningEnbleHRR(heartRateThresholdConfig.getWarningEnable());
        heartZoneConf.setWarningLimitHR(heartRateThresholdConfig.getWarningLimit());
        heartZoneConf.setWarningLimitHRHRR(heartRateThresholdConfig.getWarningLimit());
    }
}
