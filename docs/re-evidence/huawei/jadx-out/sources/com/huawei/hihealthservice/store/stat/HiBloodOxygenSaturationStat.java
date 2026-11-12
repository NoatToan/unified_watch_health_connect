package com.huawei.hihealthservice.store.stat;

import android.content.Context;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kth;
import defpackage.kuk;
import defpackage.kyj;
import defpackage.kyn;
import defpackage.ljq;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes10.dex */
public class HiBloodOxygenSaturationStat extends HiStatCommon {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kyn f12555b;
    private kyj d;

    public HiBloodOxygenSaturationStat(Context context) {
        super(context, "hihealth_sensitive.db");
        this.f12555b = kyn.d(this.mContext);
        this.d = kyj.c();
    }

    @Override // com.huawei.hihealthservice.store.stat.HiStatCommon
    public boolean stat(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return false;
        }
        LogUtil.d("Debug_HiBloodOxygenSaturationStat", "stat()");
        return b(hiHealthData);
    }

    private boolean b(HiHealthData hiHealthData) {
        int userId = hiHealthData.getUserId();
        int iE = this.f12555b.e(0, userId, 0);
        if (iE <= 0) {
            LogUtil.j("Debug_HiBloodOxygenSaturationStat", "statHeartRateDataByUser()  statClient <= 0");
            return false;
        }
        List<Integer> listC = this.d.c(userId);
        if (HiCommonUtil.b(listC)) {
            LogUtil.j("Debug_HiBloodOxygenSaturationStat", "statHeartRateDataByUser()  statClients <= 0");
            return false;
        }
        long jA = HiDateUtil.a(hiHealthData.getStartTime(), TimeZone.getDefault());
        long jC = HiDateUtil.c(hiHealthData.getStartTime(), TimeZone.getDefault());
        kuk kukVar = new kuk();
        kukVar.c(jA);
        kukVar.h(userId);
        kukVar.i(hiHealthData.getSyncStatus());
        kukVar.e(47200);
        kukVar.f(18);
        kukVar.a(iE);
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(jA);
        hiDataReadOption.setEndTime(jC);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(1);
        return c(ljq.a(this.mContext, 2103).b(hiDataReadOption, 2103, listC, (kth) null), kukVar) && e(ljq.e(this.mContext, 2103).d(listC, jA, jC, 3, 2103, new String[]{"avgBloodOxygenSaturation", "maxBloodOxygenSaturation", "minBloodOxygenSaturation"}, new int[]{3, 4, 5}, 0), kukVar);
    }

    private boolean c(List<HiHealthData> list, kuk kukVar) {
        if (HiCommonUtil.b(list)) {
            LogUtil.j("Debug_HiBloodOxygenSaturationStat", "saveLastBloodOxygenSaturationStat() statLastDatas are null");
            return false;
        }
        return a(kukVar, list.get(0).getValue(), 47204);
    }

    private boolean e(List<HiHealthData> list, kuk kukVar) {
        if (HiCommonUtil.b(list)) {
            LogUtil.j("Debug_HiBloodOxygenSaturationStat", "saveBloodOxygenSaturationStat()  statDatas are null");
            return false;
        }
        return a(kukVar, list.get(0).getDouble("avgBloodOxygenSaturation"), 47203) && a(kukVar, list.get(0).getDouble("maxBloodOxygenSaturation"), 47201) && a(kukVar, list.get(0).getDouble("minBloodOxygenSaturation"), 47202);
    }

    private boolean a(kuk kukVar, double d, int i) {
        if (d <= 1.0E-6d) {
            LogUtil.j("Debug_HiBloodOxygenSaturationStat", "saveOneStat()  statValue <= 0 statType = ", Integer.valueOf(i));
            return false;
        }
        kukVar.c(d);
        kukVar.d(i);
        return this.mDataStatManager.b(kukVar);
    }
}
