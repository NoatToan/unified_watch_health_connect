package com.huawei.hihealthservice.sync.dataswitch;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcloudmodel.model.unite.SleepBasic;
import com.huawei.hwcloudmodel.model.unite.SleepTotal;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kuk;
import defpackage.kym;
import defpackage.kyn;
import defpackage.lik;
import health.compact.a.HiDateUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SleepStatSwitch {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f12600c;

    public SleepStatSwitch(Context context) {
        this.f12600c = context.getApplicationContext();
    }

    public List<kuk> c(List<SleepTotal> list, int i) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<SleepTotal> it = list.iterator();
        while (it.hasNext()) {
            List<kuk> listB = b(it.next(), i);
            if (listB != null && !listB.isEmpty()) {
                arrayList.addAll(listB);
            }
        }
        return arrayList;
    }

    public List<kuk> b(SleepTotal sleepTotal, int i) {
        if (sleepTotal.getDeviceCode().longValue() != 0) {
            LogUtil.j("Debug_SleepStatSwitch", "the sportTotal's deviceCode should be 0, deviceCode is ", sleepTotal.getDeviceCode());
            return null;
        }
        kym kymVarD = kyn.d(this.f12600c).d(0, i, 0);
        if (kymVarD == null) {
            return null;
        }
        List<kuk> listA = a(sleepTotal.getSleepBasic());
        if (listA != null && !listA.isEmpty()) {
            int iIntValue = sleepTotal.getRecordDay().intValue();
            int iC = kymVarD.c();
            String timeZone = sleepTotal.getTimeZone();
            long jLongValue = sleepTotal.getGenerateTime() != null ? sleepTotal.getGenerateTime().longValue() : 0L;
            for (kuk kukVar : listA) {
                kukVar.a(iC);
                kukVar.b(iIntValue);
                kukVar.c(timeZone);
                kukVar.i(1);
                kukVar.e(22000);
                kukVar.a(jLongValue);
            }
        }
        return listA;
    }

    private List<kuk> a(SleepBasic sleepBasic) {
        if (sleepBasic == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(7);
        int iIntValue = sleepBasic.getDeepDuration().intValue();
        int iIntValue2 = sleepBasic.getLightDuration().intValue();
        int iIntValue3 = sleepBasic.getAwakeDuration().intValue();
        int iIntValue4 = sleepBasic.getAwakeTimes().intValue();
        int iIntValue5 = sleepBasic.getTotalDuration().intValue();
        Long lLoadFallAsleepTime = sleepBasic.loadFallAsleepTime();
        Long lLoadWakeupTime = sleepBasic.loadWakeupTime();
        if (iIntValue > 0) {
            arrayList.add(lik.d(44001, iIntValue * 60, 13));
        }
        if (iIntValue2 > 0) {
            arrayList.add(lik.d(44002, iIntValue2 * 60, 13));
        }
        if (iIntValue3 > 0) {
            arrayList.add(lik.d(44003, iIntValue3 * 60, 13));
        }
        if (iIntValue4 > 0) {
            arrayList.add(lik.d(44005, iIntValue4, 16));
        }
        if (iIntValue5 > 0) {
            arrayList.add(lik.d(44004, iIntValue5 * 60, 13));
        }
        if (lLoadFallAsleepTime != null && 0 < lLoadFallAsleepTime.longValue()) {
            arrayList.add(lik.d(44008, lLoadFallAsleepTime.longValue(), 5));
        }
        if (lLoadWakeupTime != null && 0 < lLoadWakeupTime.longValue()) {
            arrayList.add(lik.d(44009, lLoadWakeupTime.longValue(), 5));
        }
        return arrayList;
    }

    public List<SleepTotal> b(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            SleepTotal sleepTotal = new SleepTotal();
            sleepTotal.setTimeZone(hiHealthData.getTimeZone());
            sleepTotal.setRecordDay(Integer.valueOf(HiDateUtil.d(hiHealthData.getStartTime())));
            sleepTotal.setDataSource(2);
            sleepTotal.setGenerateTime(Long.valueOf(hiHealthData.getLong("modified_time")));
            SleepBasic sleepBasicC = c(hiHealthData);
            if (sleepBasicC != null) {
                sleepTotal.setSleepBasic(sleepBasicC);
                arrayList.add(sleepTotal);
            }
        }
        return arrayList;
    }

    private SleepBasic c(HiHealthData hiHealthData) {
        long j = hiHealthData.getLong("stat_sleep_start_time");
        long j2 = hiHealthData.getLong("stat_sleep_end_time");
        if (j < 1 || j2 < 1) {
            LogUtil.j("Debug_SleepStatSwitch", "getSleepBasic sleep data error ! hiHealthData is ", hiHealthData);
            return null;
        }
        SleepBasic sleepBasic = new SleepBasic();
        sleepBasic.setStartTime(Long.valueOf(j));
        sleepBasic.setEndTime(Long.valueOf(j2));
        sleepBasic.setDeepDuration(Integer.valueOf(hiHealthData.getInt("stat_sleep_deep_duration") / 60));
        sleepBasic.setLightDuration(Integer.valueOf(hiHealthData.getInt("stat_sleep_shallow_duration") / 60));
        sleepBasic.setAwakeDuration(Integer.valueOf(hiHealthData.getInt("stat_sleep_wake_duration") / 60));
        sleepBasic.setAwakeTimes(Integer.valueOf(hiHealthData.getInt("stat_sleep_wake_count")));
        sleepBasic.setTotalDuration(Integer.valueOf(hiHealthData.getInt("stat_sleep_duration_sum") / 60));
        long j3 = hiHealthData.getLong("stat_sleep_regular_start_time");
        if (0 != j3) {
            sleepBasic.saveFallAsleepTime(Long.valueOf(j3));
        }
        long j4 = hiHealthData.getLong("stat_sleep_regular_end_time");
        if (0 != j4) {
            sleepBasic.saveWakeupTime(Long.valueOf(j4));
        }
        return sleepBasic;
    }
}
