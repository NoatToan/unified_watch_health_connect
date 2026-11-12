package com.huawei.hihealthservice.sync.dataswitch;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcloudmodel.model.unite.ExerciseTimeBasic;
import com.huawei.hwcloudmodel.model.unite.SportBasicInfo;
import com.huawei.hwcloudmodel.model.unite.SportTotal;
import com.huawei.ui.openservice.OpenServiceUtil;
import defpackage.kuk;
import defpackage.lik;
import health.compact.a.HiDateUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ExerciseIntensityStatSwitch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f12593a;

    public ExerciseIntensityStatSwitch(Context context) {
        this.f12593a = context.getApplicationContext();
    }

    public void b(List<HiHealthData> list, Map<Integer, SportTotal> map) {
        for (HiHealthData hiHealthData : list) {
            int iD = HiDateUtil.d(hiHealthData.getStartTime());
            ExerciseTimeBasic exerciseTimeBasicB = b(hiHealthData);
            if (map.get(Integer.valueOf(iD)) == null) {
                SportTotal sportTotal = new SportTotal();
                sportTotal.setSportType(0);
                sportTotal.setDataId(Long.valueOf(hiHealthData.getDataId()));
                sportTotal.setRecordDay(Integer.valueOf(iD));
                sportTotal.setDataSource(2);
                sportTotal.setExerciseTimeBasic(exerciseTimeBasicB);
                sportTotal.setTimeZone(hiHealthData.getTimeZone());
                sportTotal.setDeviceCode(0L);
                sportTotal.setSportBasicInfo(new SportBasicInfo());
                map.put(Integer.valueOf(iD), sportTotal);
            } else {
                map.get(Integer.valueOf(iD)).setExerciseTimeBasic(exerciseTimeBasicB);
            }
        }
    }

    private ExerciseTimeBasic b(HiHealthData hiHealthData) {
        HashMap map = new HashMap(16);
        int i = hiHealthData.getInt("TOTAL");
        int i2 = hiHealthData.getInt(OpenServiceUtil.Location.STEP);
        int i3 = hiHealthData.getInt("RUN");
        int i4 = hiHealthData.getInt("CYCLE");
        int i5 = hiHealthData.getInt("FITNESS");
        int i6 = hiHealthData.getInt("HEART");
        int i7 = hiHealthData.getInt("CLIMB");
        int i8 = hiHealthData.getInt("SWIM");
        int i9 = hiHealthData.getInt("UNKNOWHIGH");
        long j = hiHealthData.getLong("modified_time");
        if (i <= 0 || i2 < 0 || i3 < 0 || i4 < 0 || i5 < 0 || i6 < 0 || i7 < 0 || i8 < 0 || i9 < 0) {
            LogUtil.a("HiH_ExerciseIntensitySwitch", "error ExerciseIntensityBasic stat, some stat < 0 or total <= 0");
            return null;
        }
        map.put(1, Integer.valueOf(i2));
        map.put(2, Integer.valueOf(i3));
        map.put(3, Integer.valueOf(i4));
        map.put(4, Integer.valueOf(i5));
        map.put(5, Integer.valueOf(i6));
        map.put(6, Integer.valueOf(i7));
        map.put(7, Integer.valueOf(i8));
        map.put(8, Integer.valueOf(i9));
        ExerciseTimeBasic exerciseTimeBasic = new ExerciseTimeBasic();
        exerciseTimeBasic.setTotalMidHighIntensity(i);
        exerciseTimeBasic.setIntensityMap(map);
        exerciseTimeBasic.setGenerateTime(j);
        return exerciseTimeBasic;
    }

    public List<kuk> d(ExerciseTimeBasic exerciseTimeBasic) {
        ArrayList arrayList = new ArrayList(10);
        if (exerciseTimeBasic != null) {
            int totalMidHighIntensity = exerciseTimeBasic.getTotalMidHighIntensity();
            if (totalMidHighIntensity > 0) {
                arrayList.add(lik.d(47101, totalMidHighIntensity, 15));
            }
            Map<Integer, Integer> intensityMap = exerciseTimeBasic.getIntensityMap();
            if (intensityMap == null) {
                LogUtil.d("HiH_ExerciseIntensitySwitch", "getLocalExerciseIntensityBasic intensityMap is null");
                return arrayList;
            }
            Integer num = intensityMap.get(1);
            Integer num2 = intensityMap.get(2);
            Integer num3 = intensityMap.get(3);
            Integer num4 = intensityMap.get(4);
            Integer num5 = intensityMap.get(5);
            Integer num6 = intensityMap.get(6);
            Integer num7 = intensityMap.get(7);
            Integer num8 = intensityMap.get(8);
            if (num != null && num.intValue() > 0) {
                arrayList.add(lik.d(47102, num.intValue(), 15));
            }
            if (num2 != null && num2.intValue() > 0) {
                arrayList.add(lik.d(47103, num2.intValue(), 15));
            }
            if (num3 != null && num3.intValue() > 0) {
                arrayList.add(lik.d(47104, num3.intValue(), 15));
            }
            if (num4 != null && num4.intValue() > 0) {
                arrayList.add(lik.d(47105, num4.intValue(), 15));
            }
            if (num5 != null && num5.intValue() > 0) {
                arrayList.add(lik.d(47106, num5.intValue(), 15));
            }
            if (num6 != null && num6.intValue() > 0) {
                arrayList.add(lik.d(47107, num6.intValue(), 15));
            }
            if (num7 != null && num7.intValue() > 0) {
                arrayList.add(lik.d(47108, num7.intValue(), 15));
            }
            if (num8 != null && num8.intValue() > 0) {
                arrayList.add(lik.d(47109, num8.intValue(), 15));
            }
        }
        return arrayList;
    }
}
