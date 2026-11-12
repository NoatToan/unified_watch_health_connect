package com.huawei.hihealthservice.store.stat;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kuk;
import defpackage.kxd;
import defpackage.kyj;
import defpackage.kyn;
import defpackage.ljz;
import defpackage.njy;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes10.dex */
public class HiStressAndRelaxtionStat extends HiStatCommon {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kyj f12582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kyn f12583c;
    private kxd d;

    public HiStressAndRelaxtionStat(Context context) {
        super(context);
        this.f12583c = kyn.d(this.mContext);
        this.f12582b = kyj.c();
        this.d = kxd.e(this.mContext);
    }

    @Override // com.huawei.hihealthservice.store.stat.HiStatCommon
    public boolean stat(HiHealthData hiHealthData) {
        LogUtil.a("Debug_HiStressAndRelaxtionStat", "stat()");
        return b(hiHealthData);
    }

    private boolean b(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return false;
        }
        int userId = hiHealthData.getUserId();
        int iE = this.f12583c.e(0, userId, 0);
        if (iE <= 0) {
            LogUtil.j("Debug_HiStressAndRelaxtionStat", "statStressAndRelaxationDataByUser()  statClient <= 0");
            return false;
        }
        List<Integer> listC = this.f12582b.c(userId);
        if (HiCommonUtil.b(listC)) {
            LogUtil.j("Debug_HiStressAndRelaxtionStat", "statStressAndRelaxationDataByUser()  statClients <= 0");
            return false;
        }
        return d(listC, iE, userId, hiHealthData) & b(listC, iE, userId, hiHealthData);
    }

    private boolean b(List<Integer> list, int i, int i2, HiHealthData hiHealthData) {
        long jA = HiDateUtil.a(hiHealthData.getStartTime(), TimeZone.getDefault());
        long jC = HiDateUtil.c(hiHealthData.getStartTime(), TimeZone.getDefault());
        String[] strArr = {"stress_score_max", "stress_score_min"};
        int[] iArr = {4, 5};
        List<HiHealthData> listD = this.d.d(list, jA, jC, 3, 2019, strArr, iArr, 0);
        List<HiHealthData> listD2 = this.d.d(list, jA, jC, 3, 2020, strArr, iArr, 0);
        kuk kukVar = new kuk();
        kukVar.c(jA);
        kukVar.h(i2);
        kukVar.i(hiHealthData.getSyncStatus());
        kukVar.e(2020);
        kukVar.f(17);
        kukVar.a(i);
        return a(listD, listD2, kukVar);
    }

    private boolean d(List<Integer> list, int i, int i2, HiHealthData hiHealthData) {
        long jA = HiDateUtil.a(hiHealthData.getStartTime(), TimeZone.getDefault());
        long jC = HiDateUtil.c(hiHealthData.getStartTime(), TimeZone.getDefault());
        kuk kukVar = new kuk();
        kukVar.c(jA);
        kukVar.h(i2);
        kukVar.i(hiHealthData.getSyncStatus());
        kukVar.e(2021);
        kukVar.f(16);
        kukVar.a(i);
        List<HiHealthData> listB = this.d.b(list, jA, jC, 2021);
        if (njy.e(listB)) {
            return ljz.c(kukVar, HiHealthDataType.f());
        }
        long endTime = 0;
        int i3 = 0;
        for (HiHealthData hiHealthData2 : listB) {
            endTime += (hiHealthData2.getEndTime() - hiHealthData2.getStartTime()) / 1000;
            i3++;
        }
        return c(endTime, i3, kukVar);
    }

    private boolean a(List<HiHealthData> list, List<HiHealthData> list2, kuk kukVar) {
        double d;
        double d2;
        if (HiCommonUtil.b(list) && HiCommonUtil.b(list2)) {
            LogUtil.j("Debug_HiStressAndRelaxtionStat", "saveStressStat()  statDatas is null");
            return ljz.c(kukVar, HiHealthDataType.l());
        }
        if (!HiCommonUtil.b(list)) {
            HiHealthData hiHealthData = list.get(0);
            d = hiHealthData.getDouble("stress_score_max");
            d2 = hiHealthData.getDouble("stress_score_min");
            if (!HiCommonUtil.b(list2)) {
                HiHealthData hiHealthData2 = list2.get(0);
                if (d <= hiHealthData2.getDouble("stress_score_max")) {
                    d = hiHealthData2.getDouble("stress_score_max");
                }
                if (d2 >= hiHealthData2.getDouble("stress_score_min")) {
                    d2 = hiHealthData2.getDouble("stress_score_min");
                }
            }
        } else {
            HiHealthData hiHealthData3 = list2.get(0);
            d = hiHealthData3.getDouble("stress_score_max");
            d2 = hiHealthData3.getDouble("stress_score_min");
        }
        return e(kukVar, d, 44399) && e(kukVar, d2, 44300);
    }

    private boolean c(long j, int i, kuk kukVar) {
        if (i == 0 || 0 == j) {
            LogUtil.j("Debug_HiStressAndRelaxtionStat", "saveRelaxationStat() toatltime or totalcount is 0");
            return false;
        }
        boolean zE = e(kukVar, i, 44303);
        kukVar.f(15);
        return zE && e(kukVar, ((double) j) / 60.0d, 44302);
    }

    private boolean e(kuk kukVar, double d, int i) {
        if (d <= 1.0E-6d) {
            LogUtil.j("Debug_HiStressAndRelaxtionStat", "saveOneStat()  statValue <= 0 statType = ", Integer.valueOf(i));
            return false;
        }
        kukVar.c(d);
        kukVar.d(i);
        return this.mDataStatManager.b(kukVar);
    }
}
