package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.utils.FoundationCommonUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class tuy {
    protected List<Integer> e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f49694c = new Object();
    private static final int[] d = {DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_USER_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_STATE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_IS_RING.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_USER_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_STATE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_IS_RING.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_USER_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_STATE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_IS_RING.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_USER_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_STATE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_IS_RING_NEW.value()};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f49693b = {"stepGoalValue", "stepUserValue", "stepGoalState", "stepIsRing", "durationGoalValue", "durationUserValue", "durationGoalState", "durationIsRing", "activeGoalValue", "activeUserValue", "activeGoalState", "activeIsRing", "calorieGoalValue", "sport_calorie_sum", "calorieGoalState", "calorieIsRingNew"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, String> f49692a = new HashMap(16);

    protected HiHealthData a(HiHealthData hiHealthData) {
        return null;
    }

    protected void a() {
    }

    protected List<Integer> b() {
        return null;
    }

    protected List<Integer> c() {
        return null;
    }

    protected List<Integer> d() {
        return null;
    }

    static {
        int i = 0;
        while (true) {
            int[] iArr = d;
            if (i >= iArr.length) {
                return;
            }
            f49692a.put(Integer.valueOf(iArr[i]), f49693b[i]);
            i++;
        }
    }

    public void c(List<Integer> list) {
        this.e = list;
    }

    public HiHealthData d(HiHealthData hiHealthData, HiHealthData hiHealthData2, List<HiHealthData> list, boolean z) {
        int iE;
        Integer num;
        synchronized (f49694c) {
            a();
        }
        int i = 0;
        while (true) {
            if (i < d().size()) {
                Map<Integer, String> map = f49692a;
                int i2 = hiHealthData2.getInt(map.get(d().get(i)));
                synchronized (f49694c) {
                    try {
                        if (njy.c(this.e, i) && (num = this.e.get(i)) != null) {
                            iE = num.intValue();
                        } else {
                            iE = e(c().get(i).intValue());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int iE2 = e(hiHealthData, c().get(i).intValue(), iE);
                int i3 = iE2 > i2 ? 0 : 1;
                hiHealthData.putInt(map.get(d().get(i)), i2);
                hiHealthData.putInt(map.get(c().get(i)), iE2);
                hiHealthData.putInt(map.get(b().get(i)), i3);
                if (z) {
                    a(hiHealthData, list, i, i2, iE2);
                }
                i++;
            } else {
                list.add(a(hiHealthData));
                hiHealthData.putInt(f49692a.get(Integer.valueOf(e())), 1);
                d(hiHealthData, hiHealthData2, "sport_distance_sum");
                d(hiHealthData, hiHealthData2, "sport_calorie_sum");
                d(hiHealthData, hiHealthData2, "sport_altitude_offset_sum");
                d(hiHealthData, hiHealthData2, "stepUserValue");
                d(hiHealthData, hiHealthData2, "pushesVal");
                return hiHealthData;
            }
        }
    }

    private void d(HiHealthData hiHealthData, HiHealthData hiHealthData2, String str) {
        hiHealthData.putInt(str, hiHealthData2.getInt(str));
    }

    private void a(HiHealthData hiHealthData, List<HiHealthData> list, int i, int i2, int i3) {
        HiHealthData hiHealthDataD = d(hiHealthData, d().get(i).intValue(), i2);
        LogUtil.a("Track_BaseThreeCircleSupplementWorker", "fillInsertList value", Integer.valueOf(i2));
        HiHealthData hiHealthDataD2 = d(hiHealthData, b().get(i).intValue(), i3 > i2 ? 0 : 1);
        HiHealthData hiHealthDataD3 = d(hiHealthData, c().get(i).intValue(), i3);
        list.add(hiHealthDataD);
        list.add(hiHealthDataD2);
        LogUtil.a("Track_BaseThreeCircleSupplementWorker", "fillInsertList goal", Integer.valueOf(i3));
        list.add(hiHealthDataD3);
    }

    protected int e() {
        return DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_IS_RING_NEW.value();
    }

    private HiHealthData d(HiHealthData hiHealthData, int i, int i2) {
        HiHealthData hiHealthData2 = new HiHealthData(i);
        hiHealthData2.setStartTime(hiHealthData.getStartTime());
        hiHealthData2.setEndTime(hiHealthData.getEndTime());
        hiHealthData2.setValue(i2);
        hiHealthData2.setDeviceUuid(FoundationCommonUtil.getAndroidId(BaseApplication.b()));
        return hiHealthData2;
    }

    private int e(HiHealthData hiHealthData, int i, int i2) {
        int i3 = hiHealthData.getInt(f49692a.get(Integer.valueOf(i)));
        return i3 == 0 ? i2 : i3;
    }

    private int e(int i) {
        if (DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_VALUE.value() == i) {
            return 10000;
        }
        if (DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_VALUE.value() == i) {
            return 25;
        }
        if (DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_VALUE.value() == i) {
            return 12;
        }
        return DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_VALUE.value() == i ? 270000 : 0;
    }
}
