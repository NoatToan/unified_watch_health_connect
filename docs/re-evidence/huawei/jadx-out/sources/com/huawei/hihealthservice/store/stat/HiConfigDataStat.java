package com.huawei.hihealthservice.store.stat;

import android.content.Context;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiConfigDataType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.utils.FoundationCommonUtil;
import defpackage.kuk;
import defpackage.kwm;
import defpackage.kwn;
import defpackage.kyj;
import defpackage.kyn;
import defpackage.lke;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class HiConfigDataStat extends HiStatCommon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kwn f12556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kyj f12557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12558c;
    private kyn d;
    private kwm e;
    private String f;

    public HiConfigDataStat(Context context) {
        super(context);
        this.d = kyn.d(this.mContext);
        this.f12557b = kyj.c();
        this.e = kwm.d();
        this.f12556a = kwn.e();
    }

    @Override // com.huawei.hihealthservice.store.stat.HiStatCommon
    public boolean stat(HiHealthData hiHealthData) {
        int iB;
        if (hiHealthData == null) {
            return false;
        }
        LogUtil.d("Debug_HiConfigDataStat", "stat() day = ", Long.valueOf(hiHealthData.getDay()));
        Integer numC = HiConfigDataType.c(hiHealthData.getType());
        int iIntValue = HiConfigDataType.c(numC.intValue(), 0) instanceof Integer ? ((Integer) HiConfigDataType.c(numC.intValue(), 0)).intValue() : 0;
        Integer num = HiConfigDataType.c(numC.intValue(), 1) instanceof Integer ? (Integer) HiConfigDataType.c(numC.intValue(), 1) : null;
        Integer num2 = HiConfigDataType.c(numC.intValue(), 7) instanceof Integer ? (Integer) HiConfigDataType.c(numC.intValue(), 7) : null;
        if (num == null || num2 == null || (iB = HiConfigDataType.b(hiHealthData.getType())) < 0) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jP = HiDateUtil.p(hiHealthData.getStartTime());
        String[] strArr = {"dataType"};
        HiAggregateOption hiAggregateOptionD = d(iB, jP, HiDateUtil.g(hiHealthData.getStartTime()), new int[]{iIntValue}, strArr);
        int syncStatus = hiHealthData.getSyncStatus();
        int userId = hiHealthData.getUserId();
        kuk kukVarE = e(iIntValue, jP, syncStatus, userId);
        int iE = this.d.e(0, userId, 0);
        if (iE <= 0) {
            return false;
        }
        List<Integer> listC = this.f12557b.c(userId);
        kukVarE.a(iE);
        this.f = lke.d(num.intValue());
        String strD = lke.d(num2.intValue());
        this.f12558c = hiHealthData.getType();
        c(hiAggregateOptionD, kukVarE, strArr, listC, strD);
        if (hiHealthData.getDay() == HiDateUtil.d(System.currentTimeMillis()) && hiHealthData.getDeviceUuid() != null && !FoundationCommonUtil.getAndroidId(this.mContext).equals(hiHealthData.getDeviceUuid())) {
            LogUtil.d("Debug_HiConfigDataStat", "data.getDay == currentTimeMillis");
        }
        LogUtil.d("Debug_HiConfigDataStat", "stat() totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return true;
    }

    private kuk e(int i, long j, int i2, int i3) {
        kuk kukVar = new kuk();
        kukVar.c(j);
        kukVar.h(i3);
        kukVar.i(i2);
        kukVar.e(i);
        kukVar.f(16);
        return kukVar;
    }

    private HiAggregateOption d(int i, long j, long j2, int[] iArr, String[] strArr) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setType(iArr);
        hiAggregateOption.setConstantsKey(strArr);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setAggregateType(i);
        return hiAggregateOption;
    }

    private boolean c(HiAggregateOption hiAggregateOption, kuk kukVar, String[] strArr, List<Integer> list, String str) {
        if (HiCommonUtil.b(list)) {
            return true;
        }
        return e(hiAggregateOption, list, strArr, kukVar, str);
    }

    private boolean e(HiAggregateOption hiAggregateOption, List<Integer> list, String[] strArr, kuk kukVar, String str) {
        List<HiHealthData> listA = this.e.a(this.f, list, hiAggregateOption);
        if (listA == null || listA.size() == 0) {
            return false;
        }
        return d(listA.get(0).getDouble(strArr[0]), kukVar, str);
    }

    private boolean d(double d, kuk kukVar, String str) {
        if (d <= 1.0E-6d) {
            LogUtil.j("Debug_HiConfigDataStat", "saveOneStat()  statValue <= 0 statType = ", Integer.valueOf(this.f12558c));
            return false;
        }
        kukVar.c(d);
        kukVar.d(this.f12558c);
        return this.f12556a.b(str, kukVar);
    }
}
