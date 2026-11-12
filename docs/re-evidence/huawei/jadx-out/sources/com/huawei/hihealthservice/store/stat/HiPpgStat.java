package com.huawei.hihealthservice.store.stat;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kuk;
import defpackage.kxe;
import defpackage.kyj;
import defpackage.kyn;
import defpackage.njy;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes10.dex */
public class HiPpgStat extends HiStatCommon {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kyn f12576b;
    private kxe d;
    private kyj e;

    public HiPpgStat(Context context) {
        super(context);
        this.f12576b = kyn.d(this.mContext);
        this.e = kyj.c();
        this.d = kxe.d(this.mContext);
    }

    @Override // com.huawei.hihealthservice.store.stat.HiStatCommon
    public boolean stat(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return false;
        }
        int userId = hiHealthData.getUserId();
        int iE = this.f12576b.e(0, userId, 0);
        if (iE <= 0) {
            LogUtil.j("HiH_HiPpgStat", "statClient <= 0");
            return false;
        }
        List<Integer> listC = this.e.c(userId);
        if (HiCommonUtil.b(listC)) {
            LogUtil.j("HiH_HiPpgStat", "HiPpgStat() statClients <= 0");
            return false;
        }
        return c(listC, iE, userId, hiHealthData);
    }

    private boolean c(List<Integer> list, int i, int i2, HiHealthData hiHealthData) {
        long jA = HiDateUtil.a(hiHealthData.getStartTime(), TimeZone.getDefault());
        List<HiHealthData> listC = this.d.c(list, jA, HiDateUtil.c(hiHealthData.getStartTime(), TimeZone.getDefault()), hiHealthData.getType());
        if (njy.e(listC)) {
            LogUtil.j("HiH_HiPpgStat", "saveStat datas is null or empty");
            return false;
        }
        int[] iArrA = a(listC);
        int[] iArrJ = HiHealthDataType.j();
        if (iArrA.length != iArrJ.length) {
            LogUtil.j("HiH_HiPpgStat", "saveStat length difference");
            return false;
        }
        kuk kukVar = new kuk();
        kukVar.a(i);
        kukVar.f(16);
        kukVar.h(i2);
        kukVar.c(jA);
        kukVar.i(hiHealthData.getSyncStatus());
        for (int i3 = 0; i3 < iArrJ.length; i3++) {
            c(kukVar, iArrA[i3], iArrJ[i3]);
        }
        return true;
    }

    private int[] a(List<HiHealthData> list) {
        Iterator<HiHealthData> it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            int intValue = it.next().getIntValue();
            if (intValue == 1) {
                i++;
            } else if (intValue == 2) {
                i2++;
            } else if (intValue == 3) {
                i3++;
            } else if (intValue == 4) {
                i4++;
            } else if (intValue == 5) {
                i5++;
            }
        }
        return new int[]{i, i2, i3, i4, i5};
    }

    private boolean c(kuk kukVar, double d, int i) {
        if (Double.compare(d, 1.0E-6d) <= 0) {
            LogUtil.j("HiH_HiPpgStat", "saveOneStat()  statValue <= 0 statType = ", Integer.valueOf(i));
            return false;
        }
        kukVar.c(d);
        kukVar.d(i);
        return this.mDataStatManager.b(kukVar);
    }
}
