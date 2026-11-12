package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcloudmodel.model.unite.SportBasicInfo;
import com.huawei.hwcloudmodel.model.unite.SportTotal;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.HiValidatorUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lgv {

    static class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final lgv f40107c = new lgv();
    }

    public static lgv c() {
        return e.f40107c;
    }

    public List<SportTotal> a(List<HiHealthData> list, Map<Integer, SportTotal> map) {
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            e(arrayList, hiHealthData, HiDateUtil.d(hiHealthData.getStartTime()), 2, hiHealthData.getTimeZone(), map);
        }
        return arrayList;
    }

    public List<SportTotal> d(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            kym kymVarJ = kwt.b().j(hiHealthData.getClientId());
            if (kymVarJ == null) {
                return null;
            }
            int i = (int) hiHealthData.getDouble("deviceStepStat");
            int i2 = (int) hiHealthData.getDouble("deviceCalorieStat");
            float f = (float) hiHealthData.getDouble("deviceAltitudeStat");
            int i3 = hiHealthData.getInt("deviceStatPushes");
            if (!HiValidatorUtil.d(i) || !HiValidatorUtil.a(i2) || !HiValidatorUtil.b(f) || !HiValidatorUtil.f(i3)) {
                ReleaseLogUtil.a("HiH_SportDataSwitch", "localDeviceTotalStatToCloud out of range hiHealthData = ", HiJsonUtil.d(hiHealthData));
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
                linkedHashMap.put("errorCode", Integer.toString(-1));
                linkedHashMap.put("data", HiJsonUtil.d(hiHealthData));
                ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_BIG_DATA_ERROR_2129012.value(), linkedHashMap, true);
                LogUtil.b("Debug_SportDataSwitch", "ErrorType: out of range, biKey:", OperationKey.HEALTH_APP_DAEMON_EXCEPTION_2129026.value());
            } else {
                SportBasicInfo sportBasicInfo = new SportBasicInfo();
                sportBasicInfo.configSteps(i);
                sportBasicInfo.configPushesVal(i3);
                sportBasicInfo.configCalorie(i2);
                sportBasicInfo.configDistance((int) hiHealthData.getDouble("deviceDistanceStat"));
                sportBasicInfo.configAltitude(f);
                sportBasicInfo.configDuration((int) hiHealthData.getDouble("deviceDurationStat"));
                sportBasicInfo.configFloor((int) hiHealthData.getDouble("deviceFloorStat"));
                SportTotal sportTotal = new SportTotal();
                sportTotal.setDataId(Long.valueOf(hiHealthData.getDataId()));
                sportTotal.setSportBasicInfo(sportBasicInfo);
                sportTotal.setRecordDay(Integer.valueOf(HiDateUtil.d(hiHealthData.getStartTime())));
                sportTotal.setTimeZone(hiHealthData.getTimeZone());
                sportTotal.setSportType(0);
                sportTotal.setDeviceCode(Long.valueOf(kymVarJ.e()));
                if (!b(arrayList, sportTotal)) {
                    arrayList.add(sportTotal);
                }
            }
        }
        return arrayList;
    }

    private boolean b(List<SportTotal> list, SportTotal sportTotal) {
        if (HiCommonUtil.b(list)) {
            return false;
        }
        for (SportTotal sportTotal2 : list) {
            if (sportTotal2.getDeviceCode().equals(sportTotal.getDeviceCode()) && sportTotal2.getRecordDay().equals(sportTotal.getRecordDay()) && sportTotal2.getSportType().equals(sportTotal.getSportType())) {
                LogUtil.d("Debug_SportDataSwitch", "hasSameDeviceCode sportTotal=", sportTotal.toString());
                SportBasicInfo sportBasicInfo = sportTotal2.getSportBasicInfo();
                SportBasicInfo sportBasicInfo2 = sportTotal.getSportBasicInfo();
                if (sportBasicInfo.fetchSteps() >= sportBasicInfo2.fetchSteps()) {
                    return true;
                }
                sportBasicInfo.configSteps(sportBasicInfo2.fetchSteps());
                return true;
            }
        }
        return false;
    }

    private void e(List<SportTotal> list, HiHealthData hiHealthData, int i, int i2, String str, Map<Integer, SportTotal> map) {
        SportTotal sportTotal = new SportTotal();
        int i3 = (int) hiHealthData.getDouble("sport_step_sum");
        int i4 = (int) hiHealthData.getDouble("sport_distance_sum");
        int i5 = (int) hiHealthData.getDouble("sport_calorie_sum");
        int i6 = (int) hiHealthData.getDouble("sport_duration_sum");
        float f = (float) hiHealthData.getDouble("sport_altitude_offset_sum");
        int i7 = (int) hiHealthData.getDouble("sport_pushes_sum");
        if (!HiValidatorUtil.d(i3) || !HiValidatorUtil.a(i5) || !HiValidatorUtil.b(f) || !HiValidatorUtil.f(i7)) {
            ReleaseLogUtil.a("HiH_SportDataSwitch", "addAllTotal STEPS or CALORIE or altitude is out of range hiHealthData = ", hiHealthData);
            LogUtil.b("Debug_SportDataSwitch", "ErrorType: out of range, biKey:", OperationKey.HEALTH_APP_DAEMON_EXCEPTION_2129026.value());
            return;
        }
        if (HiDateUtil.d(System.currentTimeMillis()) == i) {
            ReleaseLogUtil.d("HiH_SportDataSwitch", "addAllTotal date=", Integer.valueOf(i), ": s=", Integer.valueOf(i3), ", d=", Integer.valueOf(i4), ", c=", Integer.valueOf(i5));
        }
        SportBasicInfo sportBasicInfoE = lik.e(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Float.valueOf(f / 10.0f), 0, Integer.valueOf(i6 / 60), 0);
        sportBasicInfoE.configPushesVal(i7);
        sportTotal.setDataId(Long.valueOf(hiHealthData.getDataId()));
        sportTotal.setSportBasicInfo(sportBasicInfoE);
        sportTotal.setRecordDay(Integer.valueOf(i));
        sportTotal.setDataSource(Integer.valueOf(i2));
        sportTotal.setTimeZone(str);
        sportTotal.setSportType(0);
        map.put(Integer.valueOf(i), sportTotal);
        list.add(sportTotal);
    }
}
