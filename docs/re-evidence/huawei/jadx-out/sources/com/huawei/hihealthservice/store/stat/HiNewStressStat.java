package com.huawei.hihealthservice.store.stat;

import android.content.Context;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kth;
import defpackage.kuk;
import defpackage.kxd;
import defpackage.kyj;
import defpackage.kyn;
import defpackage.ljz;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes10.dex */
public class HiNewStressStat extends HiStatCommon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kyj f12574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kyn f12575b;
    private kxd e;

    public HiNewStressStat(Context context) {
        super(context);
        this.f12575b = kyn.d(this.mContext);
        this.f12574a = kyj.c();
        this.e = kxd.e(this.mContext);
    }

    @Override // com.huawei.hihealthservice.store.stat.HiStatCommon
    public boolean stat(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return false;
        }
        int userId = hiHealthData.getUserId();
        int iE = this.f12575b.e(0, userId, 0);
        if (iE <= 0) {
            LogUtil.j("Debug_HiNewStressStat", "stat() statClient <= 0");
            return false;
        }
        List<Integer> listC = this.f12574a.c(userId);
        if (HiCommonUtil.b(listC)) {
            LogUtil.j("Debug_HiNewStressStat", "stat() statClients <= 0 day");
            return false;
        }
        return c(listC, iE, userId, hiHealthData);
    }

    private boolean c(List<Integer> list, int i, int i2, HiHealthData hiHealthData) {
        long jA = HiDateUtil.a(hiHealthData.getStartTime(), TimeZone.getDefault());
        long jC = HiDateUtil.c(hiHealthData.getStartTime(), TimeZone.getDefault());
        List<HiHealthData> listB = b(jA, jC, list);
        List<HiHealthData> listD = d(jA, jC, list);
        boolean zB = HiCommonUtil.b(listB);
        boolean zB2 = HiCommonUtil.b(listD);
        if (zB || zB2) {
            LogUtil.j("Debug_HiNewStressStat", "saveScoreStat query stat is empty!");
            return ljz.d(HiDateUtil.d(jA), i, 2034, HiHealthDataType.h());
        }
        kuk kukVar = new kuk();
        kukVar.c(jA);
        kukVar.h(i2);
        kukVar.i(hiHealthData.getSyncStatus());
        kukVar.e(2034);
        kukVar.a(i);
        HiHealthData hiHealthData2 = listD.get(0);
        e(kukVar, hiHealthData2.getDouble("stress_score_max"), 44305);
        e(kukVar, hiHealthData2.getDouble("stress_score_min"), 44304);
        e(kukVar, hiHealthData2.getDouble("stress_score_avg"), 44306);
        e(kukVar, listB.get(0).getValue(), 44307);
        return e(kukVar, hiHealthData2.getDouble("stress_score_count"), 44308);
    }

    private List<HiHealthData> b(long j, long j2, List<Integer> list) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(1);
        return this.e.c(hiDataReadOption, 2034, list, (kth) null);
    }

    private List<HiHealthData> d(long j, long j2, List<Integer> list) {
        return this.e.d(list, j, j2, 3, 2034, new String[]{"stress_score_count", "stress_score_max", "stress_score_min", "stress_score_avg"}, new int[]{2, 4, 5, 3}, 0);
    }

    private boolean e(kuk kukVar, double d, int i) {
        if (d <= 1.0E-6d) {
            LogUtil.j("Debug_HiNewStressStat", "saveOneStat()  statValue <= 0 statType = ", Integer.valueOf(i));
            return false;
        }
        if (i == 44306) {
            d = Math.round(d);
        }
        kukVar.c(d);
        kukVar.d(i);
        return this.mDataStatManager.b(kukVar);
    }
}
