package com.huawei.hihealthservice.store.stat;

import android.content.Context;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kuk;
import defpackage.kxg;
import defpackage.kyj;
import defpackage.kyn;
import defpackage.lji;
import defpackage.ljz;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class HiSleepStat extends HiStatCommon {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kyn f12577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kyj f12578c;
    private kxg d;

    private double d(double d, double d2) {
        double d3 = d + d2;
        if (d3 > 86400.0d) {
            return 86400.0d;
        }
        return d3;
    }

    public HiSleepStat(Context context) {
        super(context);
        this.d = kxg.c(context);
        this.f12577b = kyn.d(this.mContext);
        this.f12578c = kyj.c();
    }

    @Override // com.huawei.hihealthservice.store.stat.HiStatCommon
    public boolean stat(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int userId = hiHealthData.getUserId();
        long jO = HiDateUtil.o(hiHealthData.getStartTime());
        long jM = HiDateUtil.m(hiHealthData.getStartTime());
        kuk kukVar = new kuk();
        kukVar.c(HiDateUtil.r(hiHealthData.getStartTime()));
        kukVar.h(userId);
        kukVar.i(hiHealthData.getSyncStatus());
        kukVar.e(hiHealthData.getType());
        boolean zC = c(jO, jM, kukVar, userId);
        ReleaseLogUtil.d("Debug_HiSleepStat", "stat() totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ", date=", Integer.valueOf(kukVar.e()));
        return zC;
    }

    private boolean c(long j, long j2, kuk kukVar, int i) {
        int iE = this.f12577b.e(0, i, 0);
        kukVar.a(iE);
        if (iE <= 0) {
            LogUtil.j("Debug_HiSleepStat", "statSleepDataByUser() statClient <= 0 userID = ", Integer.valueOf(i));
            return false;
        }
        List<Integer> listC = this.f12578c.c(i);
        if (HiCommonUtil.b(listC)) {
            LogUtil.j("Debug_HiSleepStat", "statSleepDataByUser() statClients is null userID = ", Integer.valueOf(i));
            return false;
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setSortOrder(0);
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(22001);
        arrayList.add(22002);
        return d(kukVar, this.d.d(hiDataReadOption, listC, arrayList));
    }

    private boolean d(kuk kukVar, List<HiHealthData> list) {
        if (HiCommonUtil.b(list)) {
            LogUtil.j("Debug_HiSleepStat", "statSleepData() sleepDatas is null");
            return ljz.c(kukVar, HiHealthDataType.m());
        }
        int size = list.size();
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        double d2 = 0.0d;
        double d3 = 0.0d;
        while (i < size) {
            HiHealthData hiHealthData = list.get(i);
            int type = hiHealthData.getType();
            long startTime = hiHealthData.getStartTime();
            long endTime = hiHealthData.getEndTime();
            if (type == 22001) {
                d += (endTime - startTime) / 1000.0d;
            } else if (type == 22002) {
                d2 += (endTime - startTime) / 1000.0d;
            }
            if (i >= size - 1) {
                LogUtil.d("Debug_HiSleepStat", "statSleepData break i = " + i);
                break;
            }
            i++;
            long startTime2 = list.get(i).getStartTime() - endTime;
            if (startTime2 > 180000 && startTime2 < 1800000) {
                d3 += startTime2 / 1000.0d;
                i2++;
            }
        }
        e(kukVar, d, d2, d3);
        c(kukVar, list, size);
        b(kukVar, list);
        e(kukVar, i2, 44005, 16);
        return true;
    }

    private void e(kuk kukVar, double d, double d2, double d3) {
        c(kukVar, d, d2, d3, d(d, d2));
    }

    private void c(kuk kukVar, List<HiHealthData> list, int i) {
        long startTime = list.get(0).getStartTime();
        long endTime = list.get(i - 1).getEndTime();
        e(kukVar, startTime, 44006, 5);
        e(kukVar, endTime, 44007, 5);
    }

    private void b(kuk kukVar, List<HiHealthData> list) {
        Map<String, Long> mapB = lji.b(list);
        if (mapB == null) {
            return;
        }
        b(kukVar, CommonUtil.a(String.valueOf(mapB.get("core_sleep_start_time_key")), 0L), CommonUtil.a(String.valueOf(mapB.get("core_sleep_end_time_key")), 0L));
    }

    private void c(kuk kukVar, double d, double d2, double d3, double d4) {
        e(kukVar, d4, 44004, 13);
        e(kukVar, d, 44001, 13);
        e(kukVar, d2, 44002, 13);
        e(kukVar, d3, 44003, 13);
    }

    private void b(kuk kukVar, long j, long j2) {
        if (j > 0) {
            e(kukVar, j, 44008, 5);
        }
        if (j2 > 0) {
            e(kukVar, j2, 44009, 5);
        }
    }

    private boolean e(kuk kukVar, double d, int i, int i2) {
        kukVar.c(d);
        kukVar.d(i);
        kukVar.f(i2);
        return this.mDataStatManager.b(kukVar);
    }
}
