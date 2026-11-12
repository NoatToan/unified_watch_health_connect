package com.huawei.hihealthservice.sync.dataswitch;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcloudmodel.model.unite.StressBasic;
import com.huawei.hwcloudmodel.model.unite.StressTotal;
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
public class StressStatSwitch {
    private Context d;

    public StressStatSwitch(Context context) {
        this.d = context.getApplicationContext();
    }

    public List<kuk> c(List<StressTotal> list, int i) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<StressTotal> it = list.iterator();
        while (it.hasNext()) {
            List<kuk> listD = d(it.next(), i);
            if (listD != null && !listD.isEmpty()) {
                arrayList.addAll(listD);
            }
        }
        return arrayList;
    }

    public List<kuk> d(StressTotal stressTotal, int i) {
        if (stressTotal.fetchDeviceCode() != null && stressTotal.fetchDeviceCode().longValue() != 0) {
            LogUtil.j("HiH_StressStatSwitch", "the StressTotal's deviceCode should be 0, deviceCode is ", stressTotal.fetchDeviceCode());
            return null;
        }
        if (stressTotal.fetchRecordDay() == null) {
            LogUtil.j("HiH_StressStatSwitch", "the StressTotal's recordDay should not be null, recordDay is ", stressTotal.fetchDeviceCode());
            return null;
        }
        kym kymVarD = kyn.d(this.d).d(0, i, 0);
        if (kymVarD == null) {
            return null;
        }
        List<kuk> listB = b(stressTotal.fetchStressBasic());
        if (listB != null && !listB.isEmpty()) {
            int iIntValue = stressTotal.fetchRecordDay().intValue();
            int iC = kymVarD.c();
            String strFetchTimeZone = stressTotal.fetchTimeZone();
            long jLongValue = stressTotal.fetchGenerateTime().longValue();
            for (kuk kukVar : listB) {
                kukVar.a(iC);
                kukVar.b(iIntValue);
                kukVar.c(strFetchTimeZone);
                kukVar.i(1);
                kukVar.e(2034);
                kukVar.a(jLongValue);
            }
        }
        return listB;
    }

    private List<kuk> b(StressBasic stressBasic) {
        if (stressBasic == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(5);
        int iIntValue = stressBasic.fetchMaxScore().intValue();
        int iIntValue2 = stressBasic.fetchMinScore().intValue();
        int iIntValue3 = stressBasic.fetchMeanScore().intValue();
        int iIntValue4 = stressBasic.fetchLastScore().intValue();
        int iIntValue5 = stressBasic.fetchMeasureCount().intValue();
        if (iIntValue > 0) {
            arrayList.add(lik.d(44305, iIntValue, 17));
        }
        if (iIntValue2 > 0) {
            arrayList.add(lik.d(44304, iIntValue2, 17));
        }
        if (iIntValue3 > 0) {
            arrayList.add(lik.d(44306, iIntValue3, 17));
        }
        if (iIntValue4 > 0) {
            arrayList.add(lik.d(44307, iIntValue4, 17));
        }
        if (iIntValue5 > 0) {
            arrayList.add(lik.d(44308, iIntValue5, 16));
        }
        return arrayList;
    }

    public List<StressTotal> d(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            StressTotal stressTotal = new StressTotal();
            stressTotal.configTimeZone(hiHealthData.getTimeZone());
            stressTotal.configGenerateTime(Long.valueOf(hiHealthData.getLong("modified_time")));
            stressTotal.configRecordDay(Integer.valueOf(HiDateUtil.d(hiHealthData.getStartTime())));
            stressTotal.configDataSource(2);
            stressTotal.configDeviceCode(0L);
            StressBasic stressBasicD = d(hiHealthData);
            if (stressBasicD != null) {
                stressTotal.configStressBasic(stressBasicD);
                arrayList.add(stressTotal);
            }
        }
        return arrayList;
    }

    private StressBasic d(HiHealthData hiHealthData) {
        int i = hiHealthData.getInt("stress_score_last");
        int i2 = hiHealthData.getInt("stress_score_max");
        int i3 = hiHealthData.getInt("stress_score_avg");
        int i4 = hiHealthData.getInt("stress_score_count");
        int i5 = hiHealthData.getInt("stress_score_min");
        if (i <= 0 || i2 <= 0 || i3 <= 0 || i4 <= 0 || i5 <= 0) {
            LogUtil.a("HiH_StressStatSwitch", "error stress stat, some stat <= 0");
            return null;
        }
        StressBasic stressBasic = new StressBasic();
        stressBasic.configLastScore(Integer.valueOf(i));
        stressBasic.configMaxScore(Integer.valueOf(i2));
        stressBasic.configMeanScore(Integer.valueOf(i3));
        stressBasic.configMeasureCount(Integer.valueOf(i4));
        stressBasic.configMinScore(Integer.valueOf(i5));
        return stressBasic;
    }
}
