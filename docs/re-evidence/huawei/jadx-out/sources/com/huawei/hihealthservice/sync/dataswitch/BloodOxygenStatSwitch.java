package com.huawei.hihealthservice.sync.dataswitch;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcloudmodel.model.unite.BloodOxygenSaturationBasic;
import com.huawei.hwcloudmodel.model.unite.BloodOxygenSaturationTotal;
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
public class BloodOxygenStatSwitch {
    private Context d;

    public BloodOxygenStatSwitch(Context context) {
        this.d = context.getApplicationContext();
    }

    public List<kuk> d(List<BloodOxygenSaturationTotal> list, int i) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<BloodOxygenSaturationTotal> it = list.iterator();
        while (it.hasNext()) {
            List<kuk> listE = e(it.next(), i);
            if (listE != null && !listE.isEmpty()) {
                arrayList.addAll(listE);
            }
        }
        return arrayList;
    }

    public List<kuk> e(BloodOxygenSaturationTotal bloodOxygenSaturationTotal, int i) {
        List<kuk> listD;
        if (bloodOxygenSaturationTotal.getDeviceCode().longValue() != 0) {
            LogUtil.j("Debug_BloodOxygenStatSwitch", "the bloodOxygenSaturationTotal's deviceCode should be 0, deviceCode is ", bloodOxygenSaturationTotal.getDeviceCode());
            return null;
        }
        kym kymVarD = kyn.d(this.d).d(0, i, 0);
        if (kymVarD == null || (listD = d(bloodOxygenSaturationTotal.getBloodOxygenSaturationBasic())) == null || listD.isEmpty()) {
            return null;
        }
        int iIntValue = bloodOxygenSaturationTotal.getRecordDay().intValue();
        int iC = kymVarD.c();
        String timeZone = bloodOxygenSaturationTotal.getTimeZone();
        long jLongValue = bloodOxygenSaturationTotal.getGenerateTime().longValue();
        for (kuk kukVar : listD) {
            kukVar.a(iC);
            kukVar.b(iIntValue);
            kukVar.c(timeZone);
            kukVar.i(1);
            kukVar.e(47200);
            kukVar.a(jLongValue);
        }
        return listD;
    }

    private List<kuk> d(BloodOxygenSaturationBasic bloodOxygenSaturationBasic) {
        if (bloodOxygenSaturationBasic == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(4);
        double maxSaturation = bloodOxygenSaturationBasic.getMaxSaturation();
        double minSaturation = bloodOxygenSaturationBasic.getMinSaturation();
        double avgSaturation = bloodOxygenSaturationBasic.getAvgSaturation();
        double lastSaturation = bloodOxygenSaturationBasic.getLastSaturation();
        if (maxSaturation > 0.0d) {
            arrayList.add(lik.d(47201, maxSaturation, 18));
        }
        if (minSaturation > 0.0d) {
            arrayList.add(lik.d(47202, minSaturation, 18));
        }
        if (avgSaturation > 0.0d) {
            arrayList.add(lik.d(47203, avgSaturation, 18));
        }
        if (lastSaturation > 0.0d) {
            arrayList.add(lik.d(47204, lastSaturation, 18));
        }
        return arrayList;
    }

    public List<BloodOxygenSaturationTotal> a(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            BloodOxygenSaturationTotal bloodOxygenSaturationTotal = new BloodOxygenSaturationTotal();
            bloodOxygenSaturationTotal.setTimeZone(hiHealthData.getTimeZone());
            bloodOxygenSaturationTotal.setGenerateTime(Long.valueOf(hiHealthData.getLong("modified_time")));
            bloodOxygenSaturationTotal.setRecordDay(Integer.valueOf(HiDateUtil.d(hiHealthData.getStartTime())));
            bloodOxygenSaturationTotal.setDataSource(2);
            bloodOxygenSaturationTotal.setDeviceCode(0L);
            bloodOxygenSaturationTotal.setBloodOxygenSaturationBasic(c(hiHealthData));
            arrayList.add(bloodOxygenSaturationTotal);
        }
        return arrayList;
    }

    private BloodOxygenSaturationBasic c(HiHealthData hiHealthData) {
        BloodOxygenSaturationBasic bloodOxygenSaturationBasic = new BloodOxygenSaturationBasic();
        bloodOxygenSaturationBasic.setMaxSaturation(hiHealthData.getDouble("maxBloodOxygenSaturation"));
        bloodOxygenSaturationBasic.setMinSaturation(hiHealthData.getDouble("minBloodOxygenSaturation"));
        bloodOxygenSaturationBasic.setAvgSaturation(hiHealthData.getDouble("avgBloodOxygenSaturation"));
        bloodOxygenSaturationBasic.setLastSaturation(hiHealthData.getDouble("lastBloodOxygenSaturation"));
        return bloodOxygenSaturationBasic;
    }
}
