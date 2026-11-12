package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.sync.dataswitch.ExerciseIntensityStatSwitch;
import com.huawei.hihealthservice.sync.dataswitch.HealthStatisticsSwitch;
import com.huawei.hihealthservice.sync.dataswitch.SportStatSwitch;
import com.huawei.hwcloudmodel.healthdatacloud.model.AddSportTotalReq;
import com.huawei.hwcloudmodel.model.unite.AddSportTotalRsp;
import com.huawei.hwcloudmodel.model.unite.ParamValidDetail;
import com.huawei.hwcloudmodel.model.unite.SportBasicInfo;
import com.huawei.hwcloudmodel.model.unite.SportTotal;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.ui.openservice.OpenServiceUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.HiValidatorUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public class lhn {
    private static Context g;
    private kwt f;
    private ExerciseIntensityStatSwitch i;
    private HealthStatisticsSwitch j;
    private boolean k;
    private int l;
    private lqo m;
    private int n;
    private static final int[] d = {40002, 40004, 40003, SmartMsgConstant.MSG_TYPE_BLOOD_SUGAR_USER, SmartMsgConstant.MSG_TYPE_RIDE_USER, 40008};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f40154a = {"sport_step_sum", "sport_distance_sum", "sport_calorie_sum", "sport_duration_sum", "sport_altitude_offset_sum", "sport_pushes_sum"};
    private static final int[] e = {47102, 47103, 47104, 47105, 47106, 47101, 47107, 47108, 47109};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f40156c = {OpenServiceUtil.Location.STEP, "RUN", "CYCLE", "FITNESS", "HEART", "TOTAL", "CLIMB", "SWIM", "UNKNOWHIGH"};
    private static final int[] h = {DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_VALUE_STAT.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_STATE_STAT.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_IS_RING_STAT.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_VALUE_STAT.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_STATE_STAT.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_IS_RING_STAT.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_VALUE_STAT.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_STATE_STAT.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_IS_RING_STAT.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_VALUE_STAT.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_STATE_STAT.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_IS_RING_STAT.value()};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f40155b = {"stepGoalValue", "stepGoalState", "stepIsRing", "calorieGoalValue", "calorieGoalState", "calorieIsRingNew", "durationGoalValue", "durationGoalState", "durationIsRing", "activeGoalValue", "activeGoalState", "activeIsRing"};

    private lhn() {
        this.l = 0;
        this.n = 0;
        this.k = false;
        this.f = kwt.b();
        this.m = lqo.b(g);
        this.i = new ExerciseIntensityStatSwitch(g);
        this.j = new HealthStatisticsSwitch(g);
    }

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final lhn f40157b = new lhn();
    }

    public static lhn e(Context context) {
        g = context.getApplicationContext();
        return a.f40157b;
    }

    public void a(int i, HiDataReadOption hiDataReadOption, HiSyncOption hiSyncOption, SportStatSwitch sportStatSwitch) throws lif {
        ReleaseLogUtil.d("HiH_HiSyncTtlSptStat", "pushData() begin !");
        this.l = 0;
        this.n = 0;
        this.k = liq.f();
        if (!lgp.n()) {
            ReleaseLogUtil.e("HiH_HiSyncTtlSptStat", "pushData() dataPrivacy switch is closed, push end!");
            return;
        }
        lis.b(5.0d, "SYNC_SPORT_STAT_DOWNLOAD_PERCENT_MAX");
        int iG = this.f.g(i);
        if (iG <= 0) {
            LogUtil.j("HiH_HiSyncTtlSptStat", "pushData() no statClient get, maybe no data need to pushData!");
        } else {
            d(iG, i, hiDataReadOption, hiSyncOption, sportStatSwitch);
            lgp.f().b(i);
        }
        lis.c(g);
        ReleaseLogUtil.d("HiH_HiSyncTtlSptStat", "pushData() end!");
    }

    private void d(int i, int i2, HiDataReadOption hiDataReadOption, HiSyncOption hiSyncOption, SportStatSwitch sportStatSwitch) throws lif {
        List<HiHealthData> listD;
        while (this.l < 2) {
            HashMap map = new HashMap(1);
            int[] iArr = {50, this.k};
            List<HiHealthData> listA = liq.a(g, i, d, f40154a, iArr);
            if (!HiCommonUtil.b(listA)) {
                LogUtil.a("HiH_HiSyncTtlSptStat", "uploadSportStatData localSportBasicInfo=" + HiJsonUtil.d(sportStatSwitch.b(listA, map)));
            }
            Context context = g;
            int[] iArr2 = e;
            List<HiHealthData> listA2 = liq.a(context, i, iArr2, f40156c, iArr);
            if (!HiCommonUtil.b(listA2)) {
                this.i.b(listA2, map);
            }
            LogUtil.a("HiH_HiSyncTtlSptStat", "uploadSportStatData localExerciseIntensityStats=", HiJsonUtil.d(listA2));
            List<HiHealthData> listA3 = liq.a(g, i, new int[]{DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE_COUNT.value()}, new String[]{"countActiveHour"}, iArr);
            if (!HiCommonUtil.b(listA3)) {
                this.j.d(listA3, map);
            }
            LogUtil.a("HiH_HiSyncTtlSptStat", "uploadSportStatData localActiveHour=", HiJsonUtil.d(listA3));
            Context context2 = g;
            int[] iArr3 = h;
            List<HiHealthData> listA4 = liq.a(context2, i, iArr3, f40155b, iArr);
            if (!HiCommonUtil.b(listA4)) {
                this.j.e(listA4, map);
            }
            ReleaseLogUtil.d("HiH_HiSyncTtlSptStat", "uploadSportStatData localThreeCircleDatas=", HiJsonUtil.d(listA4));
            LogUtil.a("HiH_HiSyncTtlSptStat", "uploadSportStatData SportTotal =", HiJsonUtil.d(map));
            List<Integer> listH = this.f.h(i2);
            if (HiCommonUtil.b(listH)) {
                listD = null;
            } else {
                LogUtil.d("HiH_HiSyncTtlSptStat", "uploadDeviceStatData() has client");
                listD = d(listH, hiDataReadOption);
            }
            if (!a(listA, listD, hiSyncOption, sportStatSwitch, i, map)) {
                LogUtil.j("HiH_HiSyncTtlSptStat", "uploadSportStatData failed, clientId=", Integer.valueOf(i));
            } else {
                liq.d(g, listA2, iArr2, i);
                liq.d(g, listA3, new int[]{DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE_COUNT.value()}, i);
                liq.d(g, listA4, iArr3, i);
            }
        }
        this.l = 0;
    }

    private List<HiHealthData> d(List<Integer> list, HiDataReadOption hiDataReadOption) {
        return kxo.a().a(list, hiDataReadOption, 200);
    }

    private List<SportTotal> d(List<HiHealthData> list, SportStatSwitch sportStatSwitch) {
        ArrayList arrayList = new ArrayList(10);
        if (!HiCommonUtil.b(list)) {
            List<SportTotal> listB = sportStatSwitch.b(list);
            if (!HiCommonUtil.b(listB)) {
                arrayList.addAll(listB);
            }
        }
        return arrayList;
    }

    private boolean a(List<HiHealthData> list, List<HiHealthData> list2, HiSyncOption hiSyncOption, SportStatSwitch sportStatSwitch, int i, Map<Integer, SportTotal> map) throws lif {
        if (!this.k) {
            int i2 = this.n + 1;
            this.n = i2;
            liq.c(i2, hiSyncOption.getSyncManual());
        } else {
            int i3 = this.n + 1;
            this.n = i3;
            if (i3 > 3) {
                this.l += 2;
                return false;
            }
        }
        List<SportTotal> listD = d(list2, sportStatSwitch);
        if (map.size() > 0) {
            Iterator<SportTotal> it = map.values().iterator();
            while (it.hasNext()) {
                listD.add(it.next());
            }
        }
        if (HiCommonUtil.b(listD)) {
            this.l += 2;
            LogUtil.j("HiH_HiSyncTtlSptStat", "addSportStatDataOne sportTotals is null or empty");
            return false;
        }
        AddSportTotalReq addSportTotalReqB = b(listD, listD.get(0).getTimeZone(), hiSyncOption);
        while (this.l < 2) {
            AddSportTotalRsp addSportTotalRspB = this.m.b(addSportTotalReqB);
            if (addSportTotalRspB != null && addSportTotalRspB.getResultCode().intValue() == 1001) {
                final StringBuilder sb = new StringBuilder("");
                addSportTotalReqB.getTotalInfo().forEach(new Consumer() { // from class: lhk
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        lhn.a(sb, (SportTotal) obj);
                    }
                });
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put("sportTotalMsg", sb.toString());
                ParamValidDetail paramValidDetail = addSportTotalRspB.getParamValidDetail();
                liq.c(addSportTotalRspB, paramValidDetail, (LinkedHashMap<String, String>) linkedHashMap);
                ReleaseLogUtil.d("HiH_HiSyncTtlSptStat", "addSportStat failed ! resultCode is ", addSportTotalRspB.getResultCode(), ", resultDesc is ", paramValidDetail == null ? addSportTotalRspB.getResultDesc() : paramValidDetail.toString());
                if (paramValidDetail == null) {
                    this.l++;
                } else {
                    d(list, list2, paramValidDetail, i);
                    return true;
                }
            } else if (!lih.e(addSportTotalRspB, false)) {
                this.l++;
            } else {
                d(list, list2, null, i);
                ReleaseLogUtil.d("HiH_HiSyncTtlSptStat", "addSportStat success, mUploadCount is ", Integer.valueOf(this.n));
                LogUtil.a("HiH_HiSyncTtlSptStat", "stat is ", HiJsonUtil.d(listD));
                return true;
            }
        }
        ReleaseLogUtil.d("HiH_HiSyncTtlSptStat", "addDataToCloud failed ! mUploadCount is ", Integer.valueOf(this.n));
        LogUtil.a("HiH_HiSyncTtlSptStat", "stat is ", HiJsonUtil.d(listD));
        return false;
    }

    static /* synthetic */ void a(StringBuilder sb, SportTotal sportTotal) {
        SportBasicInfo sportBasicInfo = sportTotal.getSportBasicInfo();
        if (sportBasicInfo != null) {
            sb.append("day:");
            sb.append(sportTotal.getRecordDay());
            sb.append(" basicInfo:");
            sb.append(sportBasicInfo);
            sb.append(" ");
            sb.append(" checkStep:");
            sb.append(HiValidatorUtil.d(sportBasicInfo.fetchSteps()));
            sb.append(" ");
        }
    }

    private void d(List<HiHealthData> list, List<HiHealthData> list2, ParamValidDetail paramValidDetail, int i) {
        if (!HiCommonUtil.b(list)) {
            if (paramValidDetail != null) {
                liq.a(list, paramValidDetail, (Map<Long, List<Long>>) null);
            }
            liq.e(g, list, d, i);
        }
        if (HiCommonUtil.b(list2)) {
            return;
        }
        if (paramValidDetail != null) {
            liq.a(list2, paramValidDetail, (Map<Long, List<Long>>) null);
        }
        liq.f(g, list2);
    }

    private AddSportTotalReq b(List<SportTotal> list, String str, HiSyncOption hiSyncOption) {
        AddSportTotalReq addSportTotalReq = new AddSportTotalReq();
        addSportTotalReq.setTotalInfo(list);
        addSportTotalReq.setTimeZone(str);
        for (SportTotal sportTotal : list) {
            if (sportTotal.getRecordDay().intValue() == HiDateUtil.d(System.currentTimeMillis())) {
                int pushAction = hiSyncOption.getPushAction();
                LogUtil.d("HiH_HiSyncTtlSptStat", "getAddSportTotalReq upload today stat may let cloud do push ,pushAction is ", Integer.valueOf(pushAction), " day is ", sportTotal.getRecordDay());
                addSportTotalReq.setIsForce(hiSyncOption.getPushAction());
            }
        }
        return addSportTotalReq;
    }
}
