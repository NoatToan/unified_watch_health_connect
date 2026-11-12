package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictField;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.threecircle.strategy.SyncStrategy;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.operation.utils.Constants;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class ndu {
    private static final int[] d = {40002, 40003, 47101, 40004, SmartMsgConstant.MSG_TYPE_RIDE_USER};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f42966c = {2, 4};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f42964a = {DicDataTypeUtil.DataType.DAILY_ACTIVITY_RECORD_ACTIVE_HOUR.value(), DicDataTypeUtil.DataType.DAILY_ACTIVITY_RECORD_CALORIE.value(), DicDataTypeUtil.DataType.DAILY_ACTIVITY_RECORD_DURATION.value(), DicDataTypeUtil.DataType.DAILY_ACTIVITY_RECORD_STEPS.value()};
    private static final int[] h = {DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_USER_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_STATE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_IS_RING.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_USER_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_STATE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_IS_RING_NEW.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_USER_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_STATE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_IS_RING.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_USER_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_STATE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_IS_RING.value()};
    private static final int[] j = {DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_HEAD_AND_NECK_PART_TIMES.value(), DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_SHOULDER_PART_TIMES.value(), DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_BACK_PART_TIMES.value(), DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_CHEST_PART_TIMES.value(), DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_ARM_PART_TIMES.value(), DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_WAIST_PART_TIMES.value(), DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_ABDOMEN_PART_TIMES.value(), DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_GLUTE_PART_TIMES.value(), DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_LEG_PART_TIMES.value(), DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_FULL_BODY_TIMES.value()};
    private static final Map<String, Long> e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f42965b = new Object();

    public static int[] c() {
        return (int[]) d.clone();
    }

    public static int[] b() {
        return (int[]) f42966c.clone();
    }

    public static int[] d() {
        return (int[]) f42964a.clone();
    }

    public static int[] e() {
        return (int[]) h.clone();
    }

    public static int[] a() {
        return (int[]) j.clone();
    }

    public static Collection<eeh> b(Collection<HiHealthData> collection, String str, String str2) {
        HashMap map = new HashMap(16);
        if (njy.e(collection) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.c("DEVMGR_WriteBackUtils", "toSamplePoints() input with empty param");
            return map.values();
        }
        LogUtil.a("DEVMGR_WriteBackUtils", "toSamplePoints() input dataSize=", Integer.valueOf(collection.size()));
        HiHealthDictManager hiHealthDictManagerA = HiHealthDictManager.a(BaseApplication.getContext());
        Comparator<eed> comparator = new Comparator<eed>() { // from class: ndu.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(eed eedVar, eed eedVar2) {
                return Long.compare(eedVar.a(), eedVar2.a());
            }
        };
        for (HiHealthData hiHealthData : collection) {
            if (hiHealthData != null) {
                int iE = e(hiHealthData.getType(), hiHealthDictManagerA);
                String str3 = iE + "_" + hiHealthData.getStartTime() + "_" + hiHealthData.getEndTime();
                eeh eehVar = (eeh) map.get(str3);
                TreeSet treeSet = new TreeSet(comparator);
                if (eehVar == null) {
                    eehVar = new eeh();
                    eehVar.setSrcPkgName(str);
                    eehVar.setWearPkgName(str2);
                    eehVar.c(e(hiHealthData.getStartTime()));
                    eehVar.a(e(hiHealthData.getEndTime()));
                    eehVar.d(iE);
                } else {
                    treeSet.addAll(eehVar.b());
                }
                eed eedVar = new eed();
                eedVar.e(hiHealthData.getType());
                eedVar.a(c(hiHealthData.getIntValue()));
                treeSet.add(eedVar);
                eehVar.e(new ArrayList(treeSet));
                map.put(str3, eehVar);
            }
        }
        for (eeh eehVar2 : map.values()) {
            HiHealthDictType hiHealthDictTypeA = hiHealthDictManagerA.a(Long.valueOf(eehVar2.c()).intValue());
            if (hiHealthDictTypeA != null) {
                b(hiHealthDictTypeA, eehVar2, comparator);
            }
        }
        LogUtil.a("DEVMGR_WriteBackUtils", "toSamplePoints() output resultSize=", Integer.valueOf(map.size()));
        return map.values();
    }

    private static void b(HiHealthDictType hiHealthDictType, eeh eehVar, Comparator<eed> comparator) {
        TreeSet treeSet = new TreeSet();
        Iterator<HiHealthDictField> it = hiHealthDictType.h().iterator();
        while (it.hasNext()) {
            treeSet.add(Integer.valueOf(it.next().e()));
        }
        Iterator<eed> it2 = eehVar.b().iterator();
        while (it2.hasNext()) {
            treeSet.remove(Integer.valueOf(Long.valueOf(it2.next().a()).intValue()));
        }
        if (treeSet.isEmpty()) {
            return;
        }
        TreeSet treeSet2 = new TreeSet(comparator);
        Iterator it3 = treeSet.iterator();
        while (it3.hasNext()) {
            int iIntValue = ((Integer) it3.next()).intValue();
            eed eedVar = new eed();
            eedVar.e(iIntValue);
            eedVar.a(c(0));
            treeSet2.add(eedVar);
        }
        treeSet2.addAll(eehVar.b());
        eehVar.e(new ArrayList(treeSet2));
    }

    public static long e(long j2) {
        return j2 / 1000;
    }

    public static long a(long j2, long j3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        calendar.set(14, 0);
        if (j3 >= 60000) {
            calendar.set(13, 0);
        }
        if (j3 == 1800000) {
            calendar.set(12, calendar.get(12) < 30 ? 0 : 30);
        }
        if (j3 >= 3600000) {
            calendar.set(12, 0);
        }
        if (j3 >= 86400000) {
            calendar.set(11, 0);
        }
        return calendar.getTimeInMillis();
    }

    public static long e(long j2, long j3) {
        if (86400000 == j3) {
            return lsl.c(j2);
        }
        return a(j2, j3) + j3;
    }

    public static String c(List<HiHealthData> list) {
        if (njy.e(list)) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(b(list.get(i)));
        }
        sb.append(']');
        return sb.toString();
    }

    private static String b(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return Constants.NULL;
        }
        StringBuilder sb = new StringBuilder("{startTime:");
        sb.append(hiHealthData.getStartTime());
        for (Map.Entry<String, Object> entry : hiHealthData.getValueHolder().valueSet()) {
            String key = entry.getKey();
            if (key.startsWith("WriteBackKey_")) {
                sb.append(',');
                sb.append(key);
                sb.append(':');
                sb.append(entry.getValue());
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static int b(int i, long j2) {
        if (j2 != 86400000 && j2 != 1800000) {
            return -1;
        }
        if (i == DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value()) {
            if (j2 == 1800000) {
                return DicDataTypeUtil.DataType.DAILY_ACTIVITY_RECORD_ACTIVE_HOUR.value();
            }
            return DicDataTypeUtil.DataType.TODAY_ACTIVITY_RECORD_ACTIVE_HOUR.value();
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 7) {
                            if (i == 40008) {
                                if (j2 == 1800000) {
                                    return -1;
                                }
                                return DicDataTypeUtil.DataType.TODAY_ACTIVITY_RECORD_PUSHES.value();
                            }
                            if (i != 47101) {
                                switch (i) {
                                    case 40002:
                                        break;
                                    case 40003:
                                        break;
                                    case 40004:
                                        break;
                                    case SmartMsgConstant.MSG_TYPE_RIDE_USER /* 40005 */:
                                        break;
                                    default:
                                        if (HiHealthDictManager.a(com.huawei.haf.application.BaseApplication.b()).i(i) == null) {
                                            return -1;
                                        }
                                        return i;
                                }
                            }
                        }
                        if (j2 == 1800000) {
                            return DicDataTypeUtil.DataType.DAILY_ACTIVITY_RECORD_DURATION.value();
                        }
                        return DicDataTypeUtil.DataType.TODAY_ACTIVITY_RECORD_DURATION.value();
                    }
                    if (j2 == 1800000) {
                        return -1;
                    }
                    return DicDataTypeUtil.DataType.TODAY_ACTIVITY_RECORD_CLIMB.value();
                }
                if (j2 == 1800000) {
                    return DicDataTypeUtil.DataType.DAILY_ACTIVITY_RECORD_CALORIE.value();
                }
                return DicDataTypeUtil.DataType.TODAY_ACTIVITY_RECORD_ACTIVE_CALORIE.value();
            }
            if (j2 == 1800000) {
                return -1;
            }
            return DicDataTypeUtil.DataType.TODAY_ACTIVITY_RECORD_DISTANCE.value();
        }
        if (j2 == 1800000) {
            return DicDataTypeUtil.DataType.DAILY_ACTIVITY_RECORD_STEPS.value();
        }
        return DicDataTypeUtil.DataType.TODAY_ACTIVITY_RECORD_STEPS.value();
    }

    public static boolean a(int i) {
        return i / 1000 == DicDataTypeUtil.DataType.MICRO_WORKOUT.value();
    }

    private static int e(int i, HiHealthDictManager hiHealthDictManager) {
        HiHealthDictType hiHealthDictTypeI = hiHealthDictManager.i(i);
        if (hiHealthDictTypeI == null) {
            return -1;
        }
        return hiHealthDictTypeI.l();
    }

    private static byte[] c(int i) {
        byte[] bArr = {(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
        LogUtil.e("DEVMGR_WriteBackUtils", "toBytes() origin=", Integer.valueOf(i), ", result=", Arrays.toString(bArr));
        return bArr;
    }

    public static void b(String str) {
        if (SyncStrategy.SP_KEY_RECONNECT_LAST_SYNC_TIME.equals(str)) {
            SharedPreferenceManager.c("threeCircleSp", str, System.currentTimeMillis());
            return;
        }
        synchronized (f42965b) {
            e.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static long e(String str) {
        long jLongValue = 0;
        if (SyncStrategy.SP_KEY_RECONNECT_LAST_SYNC_TIME.equals(str)) {
            return SharedPreferenceManager.d("threeCircleSp", str, 0L);
        }
        Map<String, Long> map = e;
        synchronized (map) {
            Long l = map.get(str);
            if (l != null) {
                jLongValue = l.longValue();
            }
        }
        return jLongValue;
    }

    public static HiHealthData c(HiHealthData hiHealthData) {
        HiHealthData hiHealthData2 = new HiHealthData();
        hiHealthData2.setType(DicDataTypeUtil.DataType.TODAY_ACTIVITY_RECORD_MICRO_WORKOUT.value());
        hiHealthData2.setStartTime(hiHealthData.getStartTime());
        double d2 = d(hiHealthData);
        hiHealthData2.getValueHolder().put("WriteBackKey_DAY_" + DicDataTypeUtil.DataType.TODAY_ACTIVITY_RECORD_MICRO_WORKOUT.value(), Double.valueOf(d2));
        return hiHealthData2;
    }

    private static double d(HiHealthData hiHealthData) {
        ContentValues valueHolder = hiHealthData.getValueHolder();
        Iterator<Map.Entry<String, Object>> it = valueHolder.valueSet().iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            String key = it.next().getKey();
            Double asDouble = valueHolder.getAsDouble(key);
            if (asDouble != null && key.startsWith("WriteBackKey_DAY_")) {
                dDoubleValue += asDouble.doubleValue();
            }
        }
        return dDoubleValue;
    }
}
