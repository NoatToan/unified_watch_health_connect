package com.huawei.hihealthservice.store.stat;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiHearRateUpMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kuk;
import defpackage.kxe;
import defpackage.kyj;
import defpackage.kyn;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes10.dex */
public class HiHeartRateUpStat extends HiStatCommon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kxe f12573a;
    private kyn d;
    private kyj e;

    public HiHeartRateUpStat(Context context) {
        super(context);
        this.d = kyn.d(this.mContext);
        this.e = kyj.c();
        this.f12573a = kxe.d(this.mContext);
    }

    @Override // com.huawei.hihealthservice.store.stat.HiStatCommon
    public boolean stat(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return false;
        }
        int userId = hiHealthData.getUserId();
        int iE = this.d.e(0, userId, 0);
        if (iE <= 0) {
            LogUtil.j("Debug_HiHeartRateUpStat", "HiHeartRateUpStat() statClient <= 0");
            return false;
        }
        List<Integer> listC = this.e.c(userId);
        if (HiCommonUtil.b(listC)) {
            LogUtil.j("Debug_HiHeartRateUpStat", "HiHeartRateUpStat() statClients <= 0");
            return false;
        }
        return a(listC, iE, userId, hiHealthData);
    }

    private boolean a(List<Integer> list, int i, int i2, HiHealthData hiHealthData) {
        long jA = HiDateUtil.a(hiHealthData.getStartTime(), TimeZone.getDefault());
        long jC = HiDateUtil.c(hiHealthData.getStartTime(), TimeZone.getDefault());
        int type = hiHealthData.getType();
        List<HiHealthData> listC = this.f12573a.c(list, jA, jC, type);
        if (listC == null || listC.isEmpty()) {
            LogUtil.a("Debug_HiHeartRateUpStat", "saveStat datas is null or empty");
            return false;
        }
        int endTime = 0;
        int i3 = 0;
        int maxHeartRate = Integer.MIN_VALUE;
        int minHeartRate = Integer.MAX_VALUE;
        for (HiHealthData hiHealthData2 : listC) {
            endTime = (int) (((long) endTime) + ((hiHealthData2.getEndTime() - hiHealthData2.getStartTime()) / 1000));
            HiHearRateUpMetaData hiHearRateUpMetaData = (HiHearRateUpMetaData) HiJsonUtil.d(hiHealthData2.getMetaData(), HiHearRateUpMetaData.class);
            if (maxHeartRate < hiHearRateUpMetaData.getMaxHeartRate()) {
                maxHeartRate = hiHearRateUpMetaData.getMaxHeartRate();
            }
            if (minHeartRate > hiHearRateUpMetaData.getMinHeartRate()) {
                minHeartRate = hiHearRateUpMetaData.getMinHeartRate();
            }
            i3++;
        }
        if (maxHeartRate == Integer.MIN_VALUE) {
            maxHeartRate = 0;
        }
        int i4 = minHeartRate != Integer.MAX_VALUE ? minHeartRate : 0;
        kuk kukVar = new kuk();
        kukVar.a(i);
        kukVar.f(8);
        kukVar.h(i2);
        kukVar.c(jA);
        kukVar.i(hiHealthData.getSyncStatus());
        if (type == 2101) {
            kukVar.e(47001);
            b(kukVar, maxHeartRate, 47003);
            b(kukVar, i4, 47002);
            b(kukVar, endTime, 47004);
            b(kukVar, i3, 47005);
            return true;
        }
        if (type != 2102) {
            LogUtil.j("Debug_HiHeartRateUpStat", "saveOneStat is other condition");
            return true;
        }
        kukVar.e(47051);
        b(kukVar, maxHeartRate, 47053);
        b(kukVar, i4, 47052);
        b(kukVar, endTime, 47054);
        b(kukVar, i3, 47055);
        return true;
    }

    private boolean b(kuk kukVar, double d, int i) {
        if (d <= 1.0E-6d) {
            LogUtil.j("Debug_HiHeartRateUpStat", "saveOneStat()  statValue <= 0 statType = ", Integer.valueOf(i));
            return false;
        }
        kukVar.c(d);
        kukVar.d(i);
        return this.mDataStatManager.b(kukVar);
    }
}
