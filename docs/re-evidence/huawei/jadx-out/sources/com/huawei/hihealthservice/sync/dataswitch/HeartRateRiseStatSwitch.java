package com.huawei.hihealthservice.sync.dataswitch;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcloudmodel.model.unite.HeartRateRiseAlarmBasic;
import com.huawei.hwcloudmodel.model.unite.HeartRateRiseAlarmTotal;
import defpackage.kuk;
import defpackage.kym;
import defpackage.kyn;
import defpackage.lik;
import defpackage.njy;
import health.compact.a.HiDateUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class HeartRateRiseStatSwitch {
    private Context e;

    public HeartRateRiseStatSwitch(Context context) {
        this.e = context.getApplicationContext();
    }

    public List<kuk> d(List<HeartRateRiseAlarmTotal> list, int i) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<HeartRateRiseAlarmTotal> it = list.iterator();
        while (it.hasNext()) {
            List<kuk> listB = b(it.next(), i);
            if (listB != null && !listB.isEmpty()) {
                arrayList.addAll(listB);
            }
        }
        return arrayList;
    }

    public List<kuk> b(HeartRateRiseAlarmTotal heartRateRiseAlarmTotal, int i) {
        if (heartRateRiseAlarmTotal.getDeviceCode() != null && heartRateRiseAlarmTotal.getDeviceCode().longValue() != 0) {
            LogUtil.d("HiH_HeartRateRiseStatSwitch", "the ExerciseIntensityTotal's deviceCode should be 0, deviceCode is ", heartRateRiseAlarmTotal.getDeviceCode());
            return null;
        }
        kym kymVarD = kyn.d(this.e).d(0, i, 0);
        if (kymVarD == null) {
            LogUtil.d("HiH_HeartRateRiseStatSwitch", "cloudHeartRateRiseToLocal statClient is null");
            return null;
        }
        List<kuk> listE = e(heartRateRiseAlarmTotal.getHeartRateRiseAlarmBasic());
        if (njy.e(listE)) {
            LogUtil.d("HiH_HeartRateRiseStatSwitch", "cloudHeartRateRiseToLocal localStats is null or empty");
            return null;
        }
        int iIntValue = heartRateRiseAlarmTotal.getRecordDay().intValue();
        int iC = kymVarD.c();
        String timeZone = heartRateRiseAlarmTotal.getTimeZone();
        long jLongValue = heartRateRiseAlarmTotal.getGenerateTime().longValue();
        for (kuk kukVar : listE) {
            kukVar.a(iC);
            kukVar.b(iIntValue);
            kukVar.c(timeZone);
            kukVar.i(1);
            kukVar.e(47001);
            kukVar.a(jLongValue);
        }
        return listE;
    }

    private List<kuk> e(HeartRateRiseAlarmBasic heartRateRiseAlarmBasic) {
        if (heartRateRiseAlarmBasic == null) {
            LogUtil.d("HiH_HeartRateRiseStatSwitch", "getLocalHeartRateRiseBasic basic is null");
            return null;
        }
        ArrayList arrayList = new ArrayList(4);
        Integer duration = heartRateRiseAlarmBasic.getDuration();
        Integer maxHeartRate = heartRateRiseAlarmBasic.getMaxHeartRate();
        Integer minHeartRate = heartRateRiseAlarmBasic.getMinHeartRate();
        Integer alarmTimes = heartRateRiseAlarmBasic.getAlarmTimes();
        if (duration != null && duration.intValue() > 0) {
            arrayList.add(lik.d(47004, duration.intValue(), 15));
        }
        if (maxHeartRate != null && maxHeartRate.intValue() > 0) {
            arrayList.add(lik.d(47003, maxHeartRate.intValue(), 8));
        }
        if (minHeartRate != null && minHeartRate.intValue() > 0) {
            arrayList.add(lik.d(47002, minHeartRate.intValue(), 8));
        }
        if (alarmTimes != null && alarmTimes.intValue() > 0) {
            arrayList.add(lik.d(47005, alarmTimes.intValue(), 16));
        }
        return arrayList;
    }

    public List<HeartRateRiseAlarmTotal> c(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            HeartRateRiseAlarmTotal heartRateRiseAlarmTotal = new HeartRateRiseAlarmTotal();
            heartRateRiseAlarmTotal.setTimeZone(hiHealthData.getTimeZone());
            heartRateRiseAlarmTotal.setGenerateTime(Long.valueOf(hiHealthData.getLong("modified_time")));
            heartRateRiseAlarmTotal.setRecordDay(Integer.valueOf(HiDateUtil.d(hiHealthData.getStartTime())));
            heartRateRiseAlarmTotal.setDataSource(2);
            heartRateRiseAlarmTotal.setDeviceCode(0L);
            HeartRateRiseAlarmBasic heartRateRiseAlarmBasicD = d(hiHealthData);
            if (heartRateRiseAlarmBasicD != null) {
                heartRateRiseAlarmTotal.setHeartRateRiseAlarmBasic(heartRateRiseAlarmBasicD);
                arrayList.add(heartRateRiseAlarmTotal);
            }
        }
        return arrayList;
    }

    private HeartRateRiseAlarmBasic d(HiHealthData hiHealthData) {
        HeartRateRiseAlarmBasic heartRateRiseAlarmBasic = new HeartRateRiseAlarmBasic();
        int i = hiHealthData.getInt("heart_rate_rise_duration");
        int i2 = hiHealthData.getInt("heart_rate_rise_max");
        int i3 = hiHealthData.getInt("heart_rate_rise_min");
        int i4 = hiHealthData.getInt("heart_rate_rise_alarmtimes");
        if (i <= 0 || i2 <= 0 || i3 <= 0 || i4 <= 0) {
            LogUtil.a("HiH_HeartRateRiseStatSwitch", "error HeartRateRise stat, some stat <= 0");
            return null;
        }
        heartRateRiseAlarmBasic.setDuration(Integer.valueOf(i));
        heartRateRiseAlarmBasic.setMaxHeartRate(Integer.valueOf(i2));
        heartRateRiseAlarmBasic.setMinHeartRate(Integer.valueOf(i3));
        heartRateRiseAlarmBasic.setAlarmTimes(Integer.valueOf(i4));
        return heartRateRiseAlarmBasic;
    }
}
