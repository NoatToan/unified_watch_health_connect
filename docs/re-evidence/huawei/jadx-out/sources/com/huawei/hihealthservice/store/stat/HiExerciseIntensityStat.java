package com.huawei.hihealthservice.store.stat;

import android.content.Context;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.utils.FoundationCommonUtil;
import defpackage.kth;
import defpackage.kuk;
import defpackage.kwq;
import defpackage.kyj;
import defpackage.kyn;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes10.dex */
public class HiExerciseIntensityStat extends HiStatCommon {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kwq f12569b;
    private kyj d;
    private kyn e;

    public HiExerciseIntensityStat(Context context) {
        super(context);
        this.f12569b = kwq.e(this.mContext);
        this.e = kyn.d(this.mContext);
        this.d = kyj.c();
    }

    @Override // com.huawei.hihealthservice.store.stat.HiStatCommon
    public boolean stat(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return false;
        }
        int userId = hiHealthData.getUserId();
        int iE = this.e.e(0, userId, 0);
        if (iE <= 0) {
            LogUtil.j("HiH_HiExerciseIntensityStat", "stat() statClient <= 0");
            return false;
        }
        List<Integer> listC = this.d.c(userId);
        if (HiCommonUtil.b(listC)) {
            LogUtil.j("HiH_HiExerciseIntensityStat", "stat() statClients <= 0");
            return false;
        }
        return b(listC, iE, userId, hiHealthData);
    }

    private boolean b(List<Integer> list, int i, int i2, HiHealthData hiHealthData) {
        long jA = HiDateUtil.a(hiHealthData.getStartTime(), TimeZone.getDefault());
        long jC = HiDateUtil.c(hiHealthData.getStartTime(), TimeZone.getDefault());
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(jA, jC);
        List<HiHealthData> listB = this.f12569b.b(hiDataReadOption, 7, list, (kth) null);
        if (listB == null || listB.isEmpty()) {
            return false;
        }
        boolean zB = b(d(i, i2, hiHealthData, jA, listB), listB.size(), 47101);
        if (b(hiHealthData)) {
            LogUtil.a("Debug_HiExerciseIntensityStat", "saveUserStat() send intensity change broadcast");
            HiBroadcastUtil.e(this.mContext, 8);
        }
        return zB;
    }

    private boolean b(HiHealthData hiHealthData) {
        return hiHealthData.getDay() == ((long) HiDateUtil.d(System.currentTimeMillis())) && (hiHealthData.getDeviceUuid() != null && !FoundationCommonUtil.getAndroidId(this.mContext).equals(hiHealthData.getDeviceUuid())) && (hiHealthData.getType() > 47100 && hiHealthData.getType() < 47199);
    }

    private kuk d(int i, int i2, HiHealthData hiHealthData, long j, List<HiHealthData> list) {
        Iterator<HiHealthData> it = list.iterator();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            switch (it.next().getIntValue()) {
                case 1:
                    i3++;
                    break;
                case 2:
                    i4++;
                    break;
                case 3:
                    i5++;
                    break;
                case 4:
                    i6++;
                    break;
                case 5:
                    i7++;
                    break;
                case 6:
                    i8++;
                    break;
                case 7:
                    i9++;
                    break;
                case 8:
                    i10++;
                    break;
            }
        }
        kuk kukVar = new kuk();
        c(i, i2, hiHealthData, j, kukVar);
        b(i3, i4, i5, i6, kukVar);
        d(i7, i8, i9, kukVar);
        b(kukVar, i10, 47109);
        return kukVar;
    }

    private void d(int i, int i2, int i3, kuk kukVar) {
        b(kukVar, i, 47106);
        b(kukVar, i2, 47107);
        b(kukVar, i3, 47108);
    }

    private void b(int i, int i2, int i3, int i4, kuk kukVar) {
        b(kukVar, i, 47102);
        b(kukVar, i2, 47103);
        b(kukVar, i3, 47104);
        b(kukVar, i4, 47105);
    }

    private void c(int i, int i2, HiHealthData hiHealthData, long j, kuk kukVar) {
        kukVar.c(j);
        kukVar.h(i2);
        kukVar.i(hiHealthData.getSyncStatus());
        kukVar.e(2034);
        kukVar.a(i);
        kukVar.f(15);
    }

    private boolean b(kuk kukVar, double d, int i) {
        if (d <= 1.0E-6d) {
            LogUtil.j("Debug_HiExerciseIntensityStat", "saveOneStat()  statValue <= 0 statType = ", Integer.valueOf(i));
            return false;
        }
        kukVar.c(d);
        kukVar.d(i);
        return this.mDataStatManager.b(kukVar);
    }
}
