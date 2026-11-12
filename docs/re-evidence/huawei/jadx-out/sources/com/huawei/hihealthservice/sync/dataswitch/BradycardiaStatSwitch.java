package com.huawei.hihealthservice.sync.dataswitch;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcloudmodel.model.unite.BradycardiaAlarmBasic;
import com.huawei.hwcloudmodel.model.unite.BradycardiaAlarmTotal;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kuk;
import defpackage.kym;
import defpackage.kyn;
import defpackage.lik;
import defpackage.njy;
import health.compact.a.HiDateUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class BradycardiaStatSwitch {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f12591c;

    public BradycardiaStatSwitch(Context context) {
        if (context != null) {
            this.f12591c = context.getApplicationContext();
        }
    }

    public List<kuk> b(List<BradycardiaAlarmTotal> list, int i) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<BradycardiaAlarmTotal> it = list.iterator();
        while (it.hasNext()) {
            List<kuk> listC = c(it.next(), i);
            if (listC != null && !listC.isEmpty()) {
                arrayList.addAll(listC);
            }
        }
        return arrayList;
    }

    public List<kuk> c(BradycardiaAlarmTotal bradycardiaAlarmTotal, int i) {
        if (bradycardiaAlarmTotal.getDeviceCode() != null && bradycardiaAlarmTotal.getDeviceCode().longValue() != 0) {
            LogUtil.j("HiH_BradycardiaStatSwitch", "the ExerciseIntensityTotal's deviceCode should be 0, deviceCode is ", bradycardiaAlarmTotal.getDeviceCode());
            return null;
        }
        kym kymVarD = kyn.d(this.f12591c).d(0, i, 0);
        if (kymVarD == null) {
            LogUtil.j("HiH_BradycardiaStatSwitch", "cloudBradycardiaStatToLocal statClient is null");
            return null;
        }
        List<kuk> listD = d(bradycardiaAlarmTotal.getBradycardiaAlarmBasic());
        if (njy.e(listD)) {
            LogUtil.j("HiH_BradycardiaStatSwitch", "cloudBradycardiaStatToLocal localStats is null or empty");
            return listD;
        }
        int iIntValue = bradycardiaAlarmTotal.getRecordDay().intValue();
        int iC = kymVarD.c();
        String timeZone = bradycardiaAlarmTotal.getTimeZone();
        long jLongValue = bradycardiaAlarmTotal.getGenerateTime().longValue();
        for (kuk kukVar : listD) {
            kukVar.a(iC);
            kukVar.b(iIntValue);
            kukVar.c(timeZone);
            kukVar.i(1);
            kukVar.e(47051);
            kukVar.a(jLongValue);
        }
        return listD;
    }

    private List<kuk> d(BradycardiaAlarmBasic bradycardiaAlarmBasic) {
        if (bradycardiaAlarmBasic == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(4);
        int iIntValue = bradycardiaAlarmBasic.getDuration().intValue();
        int iIntValue2 = bradycardiaAlarmBasic.getMaxHeartRate().intValue();
        int iIntValue3 = bradycardiaAlarmBasic.getMinHeartRate().intValue();
        int iIntValue4 = bradycardiaAlarmBasic.getAlarmTimes().intValue();
        if (iIntValue > 0) {
            arrayList.add(lik.d(47054, iIntValue, 15));
        }
        if (iIntValue2 > 0) {
            arrayList.add(lik.d(47053, iIntValue2, 8));
        }
        if (iIntValue3 > 0) {
            arrayList.add(lik.d(47052, iIntValue3, 8));
        }
        if (iIntValue4 > 0) {
            arrayList.add(lik.d(47055, iIntValue4, 16));
        }
        return arrayList;
    }

    public List<BradycardiaAlarmTotal> e(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            BradycardiaAlarmTotal bradycardiaAlarmTotal = new BradycardiaAlarmTotal();
            bradycardiaAlarmTotal.setTimeZone(hiHealthData.getTimeZone());
            bradycardiaAlarmTotal.setGenerateTime(Long.valueOf(hiHealthData.getLong("modified_time")));
            bradycardiaAlarmTotal.setRecordDay(Integer.valueOf(HiDateUtil.d(hiHealthData.getStartTime())));
            bradycardiaAlarmTotal.setDataSource(2);
            bradycardiaAlarmTotal.setDeviceCode(0L);
            BradycardiaAlarmBasic bradycardiaAlarmBasicC = c(hiHealthData);
            if (bradycardiaAlarmBasicC != null) {
                bradycardiaAlarmTotal.setBradycardiaAlarmBasic(bradycardiaAlarmBasicC);
                arrayList.add(bradycardiaAlarmTotal);
            }
        }
        return arrayList;
    }

    private BradycardiaAlarmBasic c(HiHealthData hiHealthData) {
        int i = hiHealthData.getInt("heart_rate_bradycardia_duration");
        int i2 = hiHealthData.getInt("heart_rate_bradycardia_max");
        int i3 = hiHealthData.getInt("heart_rate_bradycardia_min");
        int i4 = hiHealthData.getInt("heart_rate_bradycardia_alarmtimes");
        if (i <= 0 || i2 <= 0 || i3 <= 0 || i4 <= 0) {
            LogUtil.a("HiH_BradycardiaStatSwitch", "error HeartRateRise stat, some stat <= 0");
            return null;
        }
        BradycardiaAlarmBasic bradycardiaAlarmBasic = new BradycardiaAlarmBasic();
        bradycardiaAlarmBasic.setDuration(Integer.valueOf(i));
        bradycardiaAlarmBasic.setMaxHeartRate(Integer.valueOf(i2));
        bradycardiaAlarmBasic.setMinHeartRate(Integer.valueOf(i3));
        bradycardiaAlarmBasic.setAlarmTimes(Integer.valueOf(i4));
        return bradycardiaAlarmBasic;
    }
}
