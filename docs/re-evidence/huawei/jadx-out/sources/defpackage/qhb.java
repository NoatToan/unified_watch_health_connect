package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.HiDateUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class qhb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f46218b = new Object();
    private static volatile qhb d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f46219c = {DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_USER_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_STATE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_IS_RING.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_USER_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_STATE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_IS_RING.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_USER_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_STATE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_IS_RING.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_USER_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_STATE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_IS_RING_NEW.value()};

    private qhb() {
    }

    public static qhb c() {
        if (d == null) {
            synchronized (f46218b) {
                if (d == null) {
                    d = new qhb();
                }
            }
        }
        return d;
    }

    public void c(Context context, HashMap<Integer, Integer> map, long j, final IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList(10);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry != null) {
                HiHealthData hiHealthData = new HiHealthData(entry.getKey().intValue());
                hiHealthData.setStartTime(HiDateUtil.p(j));
                hiHealthData.setEndTime(HiDateUtil.g(j));
                hiHealthData.setValue(entry.getValue().intValue());
                hiHealthData.setDeviceUuid(FoundationCommonUtil.getAndroidId(context));
                arrayList.add(hiHealthData);
            }
        }
        LogUtil.a("SCUI_SportGoalAchievementDataManager", "insertSingleAchievementData ", Integer.valueOf(arrayList.size()));
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(arrayList);
        HiHealthManager.d(context).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: qhb.4
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("SCUI_SportGoalAchievementDataManager", "save dataResult errorCode:", Integer.valueOf(i), "message：", obj);
                if (i == 0) {
                    iBaseResponseCallback.a(i, obj);
                } else {
                    iBaseResponseCallback.a(i, null);
                }
            }
        });
    }

    public void e(final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("SCUI_SportGoalAchievementDataManager", "readThreeCircleData enter ");
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(0L);
        hiAggregateOption.setEndTime(System.currentTimeMillis());
        hiAggregateOption.setType(new int[]{DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_IS_RING_NEW.value()});
        hiAggregateOption.setConstantsKey(new String[]{"calorieIsRingNew"});
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setSortOrder(0);
        hiAggregateOption.setCount(1);
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: qhb.3
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                LogUtil.a("SCUI_SportGoalAchievementDataManager", "readThreeCircleData callback ", Integer.valueOf(i));
                if (njy.e(list) || list.get(0) == null) {
                    LogUtil.j("SCUI_SportGoalAchievementDataManager", "readThreeCircleData no data");
                    iBaseResponseCallback.a(i, Long.valueOf(HiDateUtil.p(System.currentTimeMillis())));
                } else {
                    iBaseResponseCallback.a(i, Long.valueOf(HiDateUtil.p(list.get(0).getStartTime())));
                }
            }
        });
    }

    public void c(long j, long j2, final ResponseCallback<List<HiHealthData>> responseCallback) {
        LogUtil.a("SCUI_SportGoalAchievementDataManager", "readThreeCircleData enter ");
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setType(this.f46219c);
        hiAggregateOption.setConstantsKey(new String[]{"stepGoalValue", "stepUserValue", "stepGoalState", "stepIsRing", "durationGoalValue", "durationUserValue", "durationGoalState", "durationIsRing", "activeGoalValue", "activeUserValue", "activeGoalState", "activeIsRing", "calorieGoalValue", "calorieUserValue", "calorieGoalState", "calorieIsRingNew"});
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setSortOrder(1);
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: qhb.5
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                LogUtil.a("SCUI_SportGoalAchievementDataManager", "readThreeCircleData callback ", Integer.valueOf(i));
                if (njy.e(list)) {
                    LogUtil.j("SCUI_SportGoalAchievementDataManager", "readThreeCircleData no data");
                    responseCallback.onResponse(i, null);
                } else {
                    responseCallback.onResponse(i, list);
                }
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    public static void c(long j, String str, final ResponseCallback<List<HiHealthData>> responseCallback) {
        byte b2;
        int iValue;
        String str2;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SCUI_SportGoalAchievementDataManager", "readSportGoalAchievementData goalKey ", str, " timeMillis ", Long.valueOf(j));
            return;
        }
        str.hashCode();
        switch (str) {
            case "900200007":
                b2 = 0;
                break;
            case "900200008":
                b2 = 1;
                break;
            case "900200009":
                b2 = 2;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            iValue = DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_VALUE.value();
            str2 = "calorieGoalValue";
        } else if (b2 == 1) {
            iValue = DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_VALUE.value();
            str2 = "durationGoalValue";
        } else if (b2 == 2) {
            iValue = DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_VALUE.value();
            str2 = "activeGoalValue";
        } else {
            LogUtil.j("SCUI_SportGoalAchievementDataManager", "readSportGoalAchievementData goalKey ", str, " timeMillis ", Long.valueOf(j));
            return;
        }
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(HiDateUtil.p(j));
        hiAggregateOption.setEndTime(HiDateUtil.g(j));
        hiAggregateOption.setType(new int[]{iValue});
        hiAggregateOption.setConstantsKey(new String[]{str2});
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setReadType(0);
        HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: qhb.2
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                ResponseCallback responseCallback2 = responseCallback;
                if (responseCallback2 == null) {
                    LogUtil.j("SCUI_SportGoalAchievementDataManager", "readSportGoalAchievementData onResult callback is null");
                } else {
                    responseCallback2.onResponse(i, list);
                }
            }
        });
    }
}
