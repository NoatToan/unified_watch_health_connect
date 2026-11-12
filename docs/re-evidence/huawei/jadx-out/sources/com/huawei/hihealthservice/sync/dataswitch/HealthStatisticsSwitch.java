package com.huawei.hihealthservice.sync.dataswitch;

import android.content.Context;
import com.google.gson.JsonObject;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictStat;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.sync.syncdata.dictionary.statistics.HealthStatistics;
import com.huawei.hwcloudmodel.model.unite.ActiveHourBasic;
import com.huawei.hwcloudmodel.model.unite.GoalAchieveBasic;
import com.huawei.hwcloudmodel.model.unite.SportBasicInfo;
import com.huawei.hwcloudmodel.model.unite.SportTotal;
import com.huawei.operation.OperationKey;
import defpackage.kuk;
import defpackage.kym;
import defpackage.kyn;
import defpackage.ljv;
import defpackage.njy;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HealthStatisticsSwitch {
    private Context d;

    public HealthStatisticsSwitch(Context context) {
        this.d = context;
    }

    public List<kuk> c(int i, List<HealthStatistics> list, int i2) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            ReleaseLogUtil.e("HiH_HealthStatisticsSwitch", "value is null");
            return arrayList;
        }
        kym kymVarD = kyn.d(this.d).d(0, i2, 0);
        if (kymVarD != null) {
            List<String> listO = HiHealthDictManager.a(this.d).o(i);
            for (HealthStatistics healthStatistics : list) {
                long deviceCode = healthStatistics.getDeviceCode();
                if (deviceCode != 0) {
                    ReleaseLogUtil.e("HiH_HealthStatisticsSwitch", "deviceCode should be 0, real deviceCode is ", Long.valueOf(deviceCode));
                } else {
                    c(i, arrayList, kymVarD, listO, healthStatistics);
                }
            }
        }
        return arrayList;
    }

    private void c(int i, List<kuk> list, kym kymVar, List<String> list2, HealthStatistics healthStatistics) {
        JsonObject statistics = healthStatistics.getStatistics();
        if (statistics == null) {
            return;
        }
        for (String str : list2) {
            if (statistics.has(str)) {
                int iC = HiHealthDictManager.a(this.d).c(i, str, 0);
                if (iC == 0) {
                    ReleaseLogUtil.a("HiH_HealthStatisticsSwitch", "the key is ", str, ", and statType is not found");
                } else {
                    int iB = HiHealthDictManager.a(this.d).b(i, str, 0);
                    if (iB == 0) {
                        ReleaseLogUtil.a("HiH_HealthStatisticsSwitch", "the key is ", str, ", and hiHealthType is not found");
                    } else {
                        kuk kukVar = new kuk();
                        kukVar.a(kymVar.c());
                        kukVar.i(1);
                        kukVar.b(healthStatistics.getRecordDay());
                        kukVar.c(statistics.get(str).getAsDouble());
                        kukVar.d(iC);
                        kukVar.e(iB);
                        kukVar.c(healthStatistics.getTimezone());
                        list.add(kukVar);
                    }
                }
            }
        }
    }

    public Map<String, List<HealthStatistics>> d(List<HiHealthData> list, int[] iArr) {
        HashMap map = new HashMap();
        if (!njy.e(list) && !HiCommonUtil.e(iArr)) {
            for (HiHealthData hiHealthData : list) {
                for (int i : iArr) {
                    HiHealthDictStat hiHealthDictStatB = HiHealthDictManager.a(this.d).b(i);
                    if (hiHealthDictStatB == null) {
                        ReleaseLogUtil.a("HiH_HealthStatisticsSwitch", "dictStat is null, statType is ", Integer.valueOf(i));
                    } else {
                        HiHealthDictType hiHealthDictTypeG = HiHealthDictManager.a(this.d).g(i);
                        if (hiHealthDictTypeG == null) {
                            ReleaseLogUtil.a("HiH_HealthStatisticsSwitch", "dictType is null, statType is ", Integer.valueOf(i));
                        } else {
                            int iL = hiHealthDictTypeG.l();
                            if (!map.containsKey(Integer.toString(iL))) {
                                ArrayList arrayList = new ArrayList(1);
                                a(hiHealthData, hiHealthDictStatB, HiDateUtil.d(hiHealthData.getStartTime()), arrayList);
                                map.put(String.valueOf(iL), arrayList);
                            } else {
                                b(map, hiHealthDictStatB, hiHealthData, iL);
                            }
                        }
                    }
                }
            }
        }
        return map;
    }

    private Number e(HiHealthData hiHealthData, HiHealthDictStat hiHealthDictStat) {
        String strD = hiHealthDictStat.d();
        strD.hashCode();
        if (strD.equals("Integer")) {
            return Integer.valueOf(hiHealthData.getInt(hiHealthDictStat.a()));
        }
        if (strD.equals("Long")) {
            return Long.valueOf(hiHealthData.getLong(hiHealthDictStat.a()));
        }
        return Double.valueOf(hiHealthData.getDouble(hiHealthDictStat.a()));
    }

    private void b(Map<String, List<HealthStatistics>> map, HiHealthDictStat hiHealthDictStat, HiHealthData hiHealthData, int i) {
        int iD = HiDateUtil.d(hiHealthData.getStartTime());
        List<HealthStatistics> list = map.get(Integer.toString(i));
        HealthStatistics healthStatisticsA = a(iD, list);
        if (healthStatisticsA == null) {
            a(hiHealthData, hiHealthDictStat, iD, list);
        } else {
            healthStatisticsA.getStatistics().addProperty(hiHealthDictStat.a(), e(hiHealthData, hiHealthDictStat));
        }
    }

    private void a(HiHealthData hiHealthData, HiHealthDictStat hiHealthDictStat, int i, List<HealthStatistics> list) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(hiHealthDictStat.a(), e(hiHealthData, hiHealthDictStat));
        list.add(new HealthStatistics.Builder().recordDay(i).dataSource(2).deviceCode(0L).statistics(jsonObject).timezone(hiHealthData.getTimeZone()).generateTime(hiHealthData.getModifiedTime()).build());
    }

    private HealthStatistics a(int i, List<HealthStatistics> list) {
        for (HealthStatistics healthStatistics : list) {
            if (i == healthStatistics.getRecordDay()) {
                return healthStatistics;
            }
        }
        return null;
    }

    public void d(List<HiHealthData> list, Map<Integer, SportTotal> map) {
        ArrayList arrayList = null;
        for (HiHealthData hiHealthData : list) {
            int iD = HiDateUtil.d(hiHealthData.getStartTime());
            ActiveHourBasic activeHourBasic = new ActiveHourBasic();
            int i = hiHealthData.getInt("countActiveHour");
            if (i < 0 || i > 48) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                HashMap map2 = new HashMap();
                map2.put("day", Integer.valueOf(iD));
                map2.put("countActiveHour", Integer.valueOf(i));
                arrayList.add(map2);
            } else {
                activeHourBasic.setCountActiveHour(i);
                activeHourBasic.setGenerateTime(hiHealthData.getModifiedTime());
                if (map.get(Integer.valueOf(iD)) == null) {
                    SportTotal sportTotal = new SportTotal();
                    sportTotal.setSportType(0);
                    sportTotal.setDataId(Long.valueOf(hiHealthData.getDataId()));
                    sportTotal.setRecordDay(Integer.valueOf(iD));
                    sportTotal.setDataSource(2);
                    sportTotal.setActiveHourBasic(activeHourBasic);
                    sportTotal.setTimeZone(hiHealthData.getTimeZone());
                    sportTotal.setDeviceCode(0L);
                    sportTotal.setSportBasicInfo(new SportBasicInfo());
                    map.put(Integer.valueOf(iD), sportTotal);
                } else {
                    map.get(Integer.valueOf(iD)).setActiveHourBasic(activeHourBasic);
                }
            }
        }
        if (njy.e(arrayList)) {
            return;
        }
        String strD = HiJsonUtil.d(arrayList);
        ReleaseLogUtil.e("HiH_HealthStatisticsSwitch", "countActiveHour range: [0 ,48], but illegalCountActiveHourList=" + strD);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
        linkedHashMap.put("countActiveHourFailedToCloud", strD);
        ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_BIG_DATA_ERROR_2129012.value(), linkedHashMap, true);
    }

    public void e(List<HiHealthData> list, Map<Integer, SportTotal> map) {
        for (HiHealthData hiHealthData : list) {
            int iD = HiDateUtil.d(hiHealthData.getStartTime());
            GoalAchieveBasic goalAchieveBasic = new GoalAchieveBasic();
            goalAchieveBasic.setGenerateTime(hiHealthData.getModifiedTime());
            goalAchieveBasic.setStepGoalValueStat(hiHealthData.getInt("stepGoalValue"));
            goalAchieveBasic.setStepGoalStateStat(hiHealthData.getInt("stepGoalState"));
            goalAchieveBasic.setStepIsRingStat(hiHealthData.getInt("stepIsRing"));
            goalAchieveBasic.setCalorieGoalValueStat(hiHealthData.getInt("calorieGoalValue"));
            goalAchieveBasic.setCalorieGoalStateStat(hiHealthData.getInt("calorieGoalState"));
            goalAchieveBasic.setCalorieIsRingStat(hiHealthData.getInt("calorieIsRingNew"));
            goalAchieveBasic.setDurationGoalValueStat(hiHealthData.getInt("durationGoalValue"));
            goalAchieveBasic.setDurationGoalStateStat(hiHealthData.getInt("durationGoalState"));
            goalAchieveBasic.setDurationIsRingStat(hiHealthData.getInt("durationIsRing"));
            goalAchieveBasic.setActiveGoalValueStat(hiHealthData.getInt("activeGoalValue"));
            goalAchieveBasic.setActiveGoalStateStat(hiHealthData.getInt("activeGoalState"));
            goalAchieveBasic.setActiveIsRingStat(hiHealthData.getInt("activeIsRing"));
            if (map.get(Integer.valueOf(iD)) == null) {
                SportTotal sportTotal = new SportTotal();
                sportTotal.setSportType(0);
                sportTotal.setDataId(Long.valueOf(hiHealthData.getDataId()));
                sportTotal.setRecordDay(Integer.valueOf(iD));
                sportTotal.setDataSource(2);
                sportTotal.setTimeZone(hiHealthData.getTimeZone());
                sportTotal.setDeviceCode(0L);
                sportTotal.setSportBasicInfo(new SportBasicInfo());
                sportTotal.setGoalAchieveBasic(goalAchieveBasic);
                map.put(Integer.valueOf(iD), sportTotal);
            } else {
                if (map.get(Integer.valueOf(iD)).getSportBasicInfo() == null) {
                    map.get(Integer.valueOf(iD)).setSportBasicInfo(new SportBasicInfo());
                }
                map.get(Integer.valueOf(iD)).setGoalAchieveBasic(goalAchieveBasic);
            }
        }
    }

    public kuk c(ActiveHourBasic activeHourBasic) {
        int countActiveHour = activeHourBasic.getCountActiveHour();
        if (countActiveHour <= 0) {
            return null;
        }
        kuk kukVar = new kuk();
        kukVar.c(countActiveHour);
        kukVar.d(DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE_COUNT.value());
        kukVar.e(DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value());
        return kukVar;
    }

    public List<kuk> c(List<String> list, GoalAchieveBasic goalAchieveBasic) {
        JSONObject jSONObject;
        ArrayList arrayList = new ArrayList();
        try {
            jSONObject = new JSONObject(HiJsonUtil.d(goalAchieveBasic));
        } catch (JSONException unused) {
            ReleaseLogUtil.a("HiH_HealthStatisticsSwitch", "goalAchieveBasicToLccal json ", goalAchieveBasic);
            jSONObject = null;
        }
        if (jSONObject != null) {
            for (String str : list) {
                if (jSONObject.has(str)) {
                    int iC = HiHealthDictManager.a(this.d).c(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA.value(), str, 0);
                    if (iC == 0) {
                        ReleaseLogUtil.a("HiH_HealthStatisticsSwitch", "the key is ", str, ", and statType is not found");
                    } else {
                        int iB = HiHealthDictManager.a(this.d).b(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA.value(), str, 0);
                        if (iB == 0) {
                            ReleaseLogUtil.a("HiH_HealthStatisticsSwitch", "the key is ", str, ", and hiHealthType is not found");
                        } else {
                            kuk kukVar = new kuk();
                            kukVar.i(1);
                            try {
                                kukVar.c(Double.valueOf(jSONObject.get(str).toString()).doubleValue());
                                kukVar.d(iC);
                                kukVar.e(iB);
                                arrayList.add(kukVar);
                            } catch (JSONException unused2) {
                                ReleaseLogUtil.a("HiH_HealthStatisticsSwitch", "jsonObject ", jSONObject);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
