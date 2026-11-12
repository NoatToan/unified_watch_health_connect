package com.huawei.hihealthservice.sync.dataswitch;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcloudmodel.model.unite.HeartRateBasic;
import com.huawei.hwcloudmodel.model.unite.HeartRateTotal;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kuk;
import defpackage.kym;
import defpackage.kyn;
import defpackage.lik;
import health.compact.a.HiDateUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class HeartRateStatSwitch {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f12597c;

    public HeartRateStatSwitch(Context context) {
        this.f12597c = context.getApplicationContext();
    }

    public List<kuk> e(List<HeartRateTotal> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<HeartRateTotal> it = list.iterator();
        while (it.hasNext()) {
            List<kuk> listE = e(it.next(), i);
            if (listE != null && !listE.isEmpty()) {
                arrayList.addAll(listE);
            }
        }
        return arrayList;
    }

    public List<kuk> e(HeartRateTotal heartRateTotal, int i) {
        List<kuk> listB;
        if (heartRateTotal.getDeviceCode() != 0) {
            LogUtil.j("Debug_HeartRateStatSwitch", "the heartRateTotal's deviceCode should be 0, deviceCode is ", Long.valueOf(heartRateTotal.getDeviceCode()));
            return null;
        }
        kym kymVarD = kyn.d(this.f12597c).d(0, i, 0);
        if (kymVarD == null || (listB = b(heartRateTotal.getHeartRateBasic())) == null || listB.isEmpty()) {
            return null;
        }
        int recordDay = heartRateTotal.getRecordDay();
        int iC = kymVarD.c();
        String timeZone = heartRateTotal.getTimeZone();
        long generateTime = heartRateTotal.getGenerateTime();
        for (kuk kukVar : listB) {
            kukVar.a(iC);
            kukVar.b(recordDay);
            kukVar.c(timeZone);
            kukVar.i(1);
            kukVar.e(46015);
            kukVar.a(generateTime);
        }
        return listB;
    }

    private List<kuk> b(HeartRateBasic heartRateBasic) {
        if (heartRateBasic == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(5);
        int maxHeartRate = heartRateBasic.getMaxHeartRate();
        int minHeartRate = heartRateBasic.getMinHeartRate();
        int avgRestingHeartRate = heartRateBasic.getAvgRestingHeartRate();
        int lastHeartRate = heartRateBasic.getLastHeartRate();
        int lastRestHeartRate = heartRateBasic.getLastRestHeartRate();
        if (maxHeartRate > 0) {
            arrayList.add(lik.d(46016, maxHeartRate, 8));
        }
        if (minHeartRate > 0) {
            arrayList.add(lik.d(46017, minHeartRate, 8));
        }
        if (avgRestingHeartRate > 0) {
            arrayList.add(lik.d(46018, avgRestingHeartRate, 8));
        }
        if (lastHeartRate > 0) {
            arrayList.add(lik.d(46019, lastHeartRate, 8));
        }
        if (lastRestHeartRate > 0) {
            arrayList.add(lik.d(46020, lastRestHeartRate, 8));
        }
        return arrayList;
    }

    public List<HeartRateTotal> a(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            HeartRateTotal heartRateTotal = new HeartRateTotal();
            heartRateTotal.setTimeZone(hiHealthData.getTimeZone());
            heartRateTotal.setGenerateTime(hiHealthData.getLong("modified_time"));
            heartRateTotal.setRecordDay(HiDateUtil.d(hiHealthData.getStartTime()));
            heartRateTotal.setDataSource(2);
            heartRateTotal.setDeviceCode(0L);
            HeartRateBasic heartRateBasicE = e(hiHealthData);
            if (heartRateBasicE != null) {
                heartRateTotal.setHeartRateBasic(heartRateBasicE);
                arrayList.add(heartRateTotal);
            }
        }
        return arrayList;
    }

    private HeartRateBasic e(HiHealthData hiHealthData) {
        HeartRateBasic heartRateBasic = new HeartRateBasic();
        heartRateBasic.setMaxHeartRate(hiHealthData.getInt("maxHeartRate"));
        heartRateBasic.setMinHeartRate(hiHealthData.getInt("minHeartRate"));
        heartRateBasic.setAvgRestingHeartRate((int) Math.round(hiHealthData.getDouble("avgRestingHeartRate")));
        heartRateBasic.setLastHeartRate(hiHealthData.getInt("lastHeartRate"));
        heartRateBasic.setLastRestHeartRate(hiHealthData.getInt("lastRestHeartRate"));
        return heartRateBasic;
    }
}
