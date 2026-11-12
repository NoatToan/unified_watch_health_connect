package com.huawei.hihealthservice.sync.dataswitch;

import android.content.Context;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcloudmodel.model.SportTotalData;
import com.huawei.hwcloudmodel.model.unite.ActiveHourBasic;
import com.huawei.hwcloudmodel.model.unite.ExerciseTimeBasic;
import com.huawei.hwcloudmodel.model.unite.GoalAchieveBasic;
import com.huawei.hwcloudmodel.model.unite.SportBasicInfo;
import com.huawei.hwcloudmodel.model.unite.SportTotal;
import com.huawei.operation.OperationKey;
import defpackage.kuk;
import defpackage.kxq;
import defpackage.kyk;
import defpackage.kym;
import defpackage.kyn;
import defpackage.lgr;
import defpackage.lgt;
import defpackage.lgu;
import defpackage.lgv;
import defpackage.lif;
import defpackage.lik;
import defpackage.liq;
import defpackage.ljv;
import defpackage.lkb;
import defpackage.njy;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class SportStatSwitch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthStatisticsSwitch f12603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kuk f12604b = new kuk();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f12605c;
    private ExerciseIntensityStatSwitch d;

    public SportStatSwitch(Context context) {
        this.f12605c = context.getApplicationContext();
        this.d = new ExerciseIntensityStatSwitch(this.f12605c);
        this.f12603a = new HealthStatisticsSwitch(this.f12605c);
    }

    public List<kuk> c(List<SportTotalData> list, int i) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (SportTotalData sportTotalData : list) {
            if (sportTotalData == null) {
                LogUtil.d("Debug_SportStatSwitch", "sportTotalData is null ");
            } else {
                List<kuk> listB = b(sportTotalData, i);
                if (listB != null && !listB.isEmpty()) {
                    arrayList.addAll(listB);
                }
            }
        }
        return arrayList;
    }

    public List<HiHealthData> a(List<SportTotalData> list, int i) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (SportTotalData sportTotalData : list) {
            if (sportTotalData.getDeviceCode().longValue() != 0) {
                try {
                    List<HiHealthData> listD = d(sportTotalData, i);
                    if (listD != null || !listD.isEmpty()) {
                        arrayList.addAll(listD);
                    }
                } catch (lif e) {
                    ReleaseLogUtil.a("HiH_SportStatSwitch", "convertSportTotalDataToHealthData exception e=", e.getMessage());
                }
            }
        }
        return arrayList;
    }

    private List<HiHealthData> d(SportTotalData sportTotalData, int i) throws lif {
        kym kymVarB = kyk.e(this.f12605c).b(1, i, sportTotalData.getDeviceCode().longValue());
        if (kymVarB == null) {
            ReleaseLogUtil.a("Debug_SportStatSwitch", "saveDeviceStat hiHealthContext is null");
            return Collections.EMPTY_LIST;
        }
        kymVarB.h(1);
        SportBasicInfo sportBasicInfo = sportTotalData.getSportBasicInfo();
        if (sportBasicInfo == null) {
            ReleaseLogUtil.a("Debug_SportStatSwitch", "basicInfo null", sportTotalData);
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(a(901, sportBasicInfo.fetchSteps(), sportTotalData, kymVarB), a(902, sportBasicInfo.fetchDistance(), sportTotalData, kymVarB), a(903, sportBasicInfo.fetchCalorie(), sportTotalData, kymVarB), a(904, sportBasicInfo.fetchAltitude(), sportTotalData, kymVarB), a(905, sportBasicInfo.fetchFloor(), sportTotalData, kymVarB), a(TypedValues.Custom.TYPE_REFERENCE, sportBasicInfo.fetchDuration(), sportTotalData, kymVarB), a(907, sportBasicInfo.fetchPushesVal(), sportTotalData, kymVarB));
    }

    public List<kuk> b(SportTotalData sportTotalData, int i) {
        kuk kukVarC;
        if (sportTotalData.getDeviceCode().longValue() != 0) {
            return Collections.EMPTY_LIST;
        }
        int iIntValue = sportTotalData.getRecordDay().intValue();
        Integer sportType = sportTotalData.getSportType();
        int iIntValue2 = sportType.intValue();
        SportBasicInfo sportBasicInfo = sportTotalData.getSportBasicInfo();
        String timeZone = sportTotalData.getTimeZone();
        kym kymVarD = kyn.d(this.f12605c).d(0, i, 0);
        if (kymVarD == null) {
            ReleaseLogUtil.e("Debug_SportStatSwitch", "switchSportTotalDataToDayStat statClient is null");
            return null;
        }
        com.huawei.hwlogsmodel.LogUtil.d("Debug_SportStatSwitch", "switchSportTotalDataToDayStat sportType is ", sportType);
        ArrayList arrayList = new ArrayList(16);
        if (sportBasicInfo != null) {
            e(sportTotalData, i, iIntValue2, sportBasicInfo);
            List<kuk> listE = e(iIntValue2, sportBasicInfo, iIntValue);
            if (!HiCommonUtil.b(listE)) {
                arrayList.addAll(listE);
            }
        }
        ExerciseTimeBasic exerciseTimeBasic = sportTotalData.getExerciseTimeBasic();
        if (exerciseTimeBasic != null) {
            List<kuk> listD = this.d.d(exerciseTimeBasic);
            if (!HiCommonUtil.b(listD)) {
                arrayList.addAll(listD);
            }
        }
        ActiveHourBasic activeHourBasic = sportTotalData.getActiveHourBasic();
        if (activeHourBasic != null && (kukVarC = this.f12603a.c(activeHourBasic)) != null) {
            arrayList.add(kukVarC);
        }
        GoalAchieveBasic goalAchieveBasic = sportTotalData.getGoalAchieveBasic();
        if (goalAchieveBasic != null) {
            List<kuk> listC = this.f12603a.c(HiHealthDictManager.a(this.f12605c).o(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA.value()), goalAchieveBasic);
            if (!HiCommonUtil.b(listC)) {
                arrayList.addAll(listC);
            }
        }
        com.huawei.hwlogsmodel.LogUtil.a("Debug_SportStatSwitch", "switchSportTotalDataToDayStat " + HiJsonUtil.d(arrayList));
        if (njy.e(arrayList)) {
            ReleaseLogUtil.e("Debug_SportStatSwitch", "switchSportTotalDataToDayStat dayStatTables is null or empty");
            return null;
        }
        return this.f12604b.b(arrayList, timeZone, kymVarD.c(), iIntValue);
    }

    private void e(SportTotalData sportTotalData, int i, int i2, SportBasicInfo sportBasicInfo) {
        int iFetchSteps;
        if (i2 == 0 && sportTotalData.getDeviceCode().longValue() == 0 && sportTotalData.getRecordDay().intValue() == HiDateUtil.d(System.currentTimeMillis()) && (iFetchSteps = sportBasicInfo.fetchSteps() - liq.b(this.f12605c, i, HiDateUtil.d(System.currentTimeMillis()), 40002)) > 0) {
            String strD = kxq.c().d(i);
            String str = strD + "step_sum_dvalue";
            com.huawei.hwlogsmodel.LogUtil.d("Debug_SportStatSwitch", "switchSportTotalDataToDayStat huid is ", strD, ", key is ", str);
            int iA = lkb.a(this.f12605c, strD) + iFetchSteps;
            lkb.c(this.f12605c, strD, iA);
            com.huawei.hwlogsmodel.LogUtil.d("Debug_SportStatSwitch", "switchSportTotalDataToDayStat sportStepDvalueDB is ", String.valueOf(iA), ", stepDvalue is ", Integer.valueOf(iFetchSteps));
            KeyValDbManager.d(this.f12605c).b(str, String.valueOf(iA));
            if (iFetchSteps > 5000) {
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(5);
                linkedHashMap.put("errorCode", Integer.toString(1007));
                ljv.d(this.f12605c).c(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMap, false);
            }
        }
    }

    private HiHealthData a(int i, double d, SportTotalData sportTotalData, kym kymVar) {
        HiHealthData hiHealthData = new HiHealthData(i);
        hiHealthData.setStartTime(HiDateUtil.p(HiDateUtil.a(sportTotalData.getRecordDay().intValue())));
        hiHealthData.setEndTime(HiDateUtil.g(HiDateUtil.a(sportTotalData.getRecordDay().intValue())));
        hiHealthData.setUserId(kymVar.i());
        hiHealthData.setAppId(kymVar.b());
        hiHealthData.setDeviceId(kymVar.d());
        hiHealthData.setClientId(kymVar.c());
        hiHealthData.setSyncStatus(kymVar.f());
        hiHealthData.setValue(d);
        hiHealthData.setTimeZone(sportTotalData.getTimeZone());
        return hiHealthData;
    }

    public List<SportTotal> a(List<HiHealthData> list) {
        return lgt.c().c(list);
    }

    public List<SportTotal> b(List<HiHealthData> list, Map<Integer, SportTotal> map) {
        return lgv.c().a(list, map);
    }

    public List<SportTotal> b(List<HiHealthData> list) {
        return lgv.c().d(list);
    }

    private List<kuk> e(int i, SportBasicInfo sportBasicInfo, int i2) {
        if (i == 0) {
            return lgr.b(sportBasicInfo, this.f12604b, i2);
        }
        if (i == 1) {
            return lgr.d(sportBasicInfo, this.f12604b);
        }
        if (i == 2) {
            return lgr.b(sportBasicInfo, this.f12604b);
        }
        if (i == 3) {
            return lgu.b(sportBasicInfo, this.f12604b);
        }
        if (i == 4) {
            return lgu.a(sportBasicInfo, this.f12604b);
        }
        if (i == 5) {
            return lgu.e(sportBasicInfo, this.f12604b);
        }
        if (i != 9) {
            return null;
        }
        return lgu.d(sportBasicInfo, this.f12604b);
    }

    public List<SportTotalData> d(List<SportTotalData> list) {
        com.huawei.hwlogsmodel.LogUtil.a("Debug_SportStatSwitch", "start mergeClimbAndFloor");
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (SportTotalData sportTotalData : list) {
            if (sportTotalData.getSportType().intValue() == 1) {
                d(sportTotalData);
                arrayList.add(sportTotalData);
            } else if (sportTotalData.getSportType().intValue() == 2) {
                arrayList.add(sportTotalData);
            } else {
                arrayList2.add(sportTotalData);
            }
        }
        if (arrayList.isEmpty()) {
            com.huawei.hwlogsmodel.LogUtil.a("Debug_SportStatSwitch", "mergeClimbAndFloor no such data");
            return arrayList2;
        }
        arrayList2.addAll(e(arrayList));
        return arrayList2;
    }

    private List<SportTotalData> e(List<SportTotalData> list) {
        SparseArray sparseArray = new SparseArray(list.size());
        for (SportTotalData sportTotalData : list) {
            if (sportTotalData != null) {
                Integer recordDay = sportTotalData.getRecordDay();
                int iIntValue = recordDay.intValue();
                com.huawei.hwlogsmodel.LogUtil.d("Debug_SportStatSwitch", "mergeOneDayStat key is ", recordDay);
                SportTotalData sportTotalDataD = (SportTotalData) sparseArray.get(iIntValue);
                if (sportTotalDataD != null) {
                    sportTotalDataD = d(sportTotalDataD, sportTotalData);
                    com.huawei.hwlogsmodel.LogUtil.d("Debug_SportStatSwitch", "mergeOneDayStat need merged key is ", recordDay);
                }
                sparseArray.put(iIntValue, sportTotalDataD);
            }
        }
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add((SportTotalData) sparseArray.valueAt(i));
        }
        return arrayList;
    }

    private void d(SportTotalData sportTotalData) {
        sportTotalData.setSportType(2);
        SportBasicInfo sportBasicInfo = sportTotalData.getSportBasicInfo();
        sportBasicInfo.configAltitude((sportBasicInfo.fetchFloor() * 30) / 10.0f);
        sportBasicInfo.configFloor(0);
    }

    private SportTotalData d(SportTotalData sportTotalData, SportTotalData sportTotalData2) {
        SportTotalData sportTotalData3 = new SportTotalData();
        sportTotalData3.setSportType(sportTotalData.getSportType());
        sportTotalData3.setDeviceCode(sportTotalData.getDeviceCode());
        sportTotalData3.setDataSource(sportTotalData.getDataSource());
        sportTotalData3.setRecordDay(sportTotalData.getRecordDay());
        sportTotalData3.setTimeZone(sportTotalData.getTimeZone());
        sportTotalData3.setSportBasicInfo(lik.e(Integer.valueOf(sportTotalData.getSportBasicInfo().fetchSteps() + sportTotalData2.getSportBasicInfo().fetchSteps()), Integer.valueOf(sportTotalData.getSportBasicInfo().fetchDistance() + sportTotalData2.getSportBasicInfo().fetchDistance()), Integer.valueOf(sportTotalData.getSportBasicInfo().fetchCalorie() + sportTotalData2.getSportBasicInfo().fetchCalorie()), Float.valueOf(sportTotalData.getSportBasicInfo().fetchAltitude() + sportTotalData2.getSportBasicInfo().fetchAltitude()), Integer.valueOf(sportTotalData.getSportBasicInfo().fetchFloor() + sportTotalData2.getSportBasicInfo().fetchFloor()), Integer.valueOf(sportTotalData.getSportBasicInfo().fetchDuration() + sportTotalData2.getSportBasicInfo().fetchDuration()), Integer.valueOf(sportTotalData.getSportBasicInfo().fetchCount() + sportTotalData2.getSportBasicInfo().fetchCount())));
        return sportTotalData3;
    }
}
