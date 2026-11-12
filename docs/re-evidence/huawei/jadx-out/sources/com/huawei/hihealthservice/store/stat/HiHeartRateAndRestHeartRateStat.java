package com.huawei.hihealthservice.store.stat;

import android.content.Context;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kth;
import defpackage.kuk;
import defpackage.kxe;
import defpackage.kxo;
import defpackage.kyj;
import defpackage.kyn;
import defpackage.lfz;
import defpackage.ljz;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes10.dex */
public class HiHeartRateAndRestHeartRateStat extends HiStatCommon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kyj f12570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kxe f12571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kyn f12572c;
    private kxo e;

    public HiHeartRateAndRestHeartRateStat(Context context) {
        super(context);
        this.e = kxo.a();
        this.f12572c = kyn.d(this.mContext);
        this.f12570a = kyj.c();
        this.f12571b = kxe.d(this.mContext);
    }

    @Override // com.huawei.hihealthservice.store.stat.HiStatCommon
    public boolean stat(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return false;
        }
        LogUtil.d("Debug_HiHeartRateAndRestHeartRateStat", "stat()");
        return d(hiHealthData);
    }

    public void d(int i, List<Integer> list, long j, long j2) {
        if (list == null) {
            return;
        }
        LogUtil.d("Debug_HiHeartRateAndRestHeartRateStat", "statDBOldHeartRateData");
        ArrayList arrayList = new ArrayList(10);
        List<HiHealthData> listC = kxe.d(this.mContext).c(list, j, j2, 2002);
        List<HiHealthData> listC2 = kxe.d(this.mContext).c(list, j, j2, 2018);
        if (!CollectionUtils.a(listC)) {
            arrayList.addAll(listC);
        }
        if (!CollectionUtils.a(listC2)) {
            arrayList.addAll(listC2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((HiHealthData) it.next()).setUserId(i);
        }
        lfz lfzVarD = lfz.d(this.mContext);
        lfzVarD.prepareRealTimeHealthDataStat(arrayList);
        lfzVarD.doRealTimeHealthDataStat();
    }

    private boolean d(HiHealthData hiHealthData) {
        int userId = hiHealthData.getUserId();
        int iE = this.f12572c.e(0, userId, 0);
        if (iE <= 0) {
            LogUtil.j("Debug_HiHeartRateAndRestHeartRateStat", "statHeartRateDataByUser()  statClient <= 0");
            return false;
        }
        List<Integer> listC = this.f12570a.c(userId);
        if (HiCommonUtil.b(listC)) {
            LogUtil.j("Debug_HiHeartRateAndRestHeartRateStat", "statHeartRateDataByUser()  statClients <= 0");
            return false;
        }
        long jA = HiDateUtil.a(hiHealthData.getStartTime(), TimeZone.getDefault());
        long jC = HiDateUtil.c(hiHealthData.getStartTime(), TimeZone.getDefault());
        kuk kukVar = new kuk();
        kukVar.c(jA);
        kukVar.h(userId);
        kukVar.i(hiHealthData.getSyncStatus());
        kukVar.e(46015);
        kukVar.f(8);
        kukVar.a(iE);
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(jA);
        hiDataReadOption.setEndTime(jC);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(1);
        b(this.f12571b.b(hiDataReadOption, 2105, listC, (kth) null), kukVar);
        String[] strArr = {"avgRestingHeartRate", "maxHeartRate", "minHeartRate"};
        int[] iArr = {3, 4, 5};
        return c(this.f12571b.b(hiDataReadOption, 2002, listC, (kth) null), this.f12571b.b(hiDataReadOption, 2018, listC, (kth) null), kukVar) && e(this.e.d(listC, jA, jC, 3, 2002, strArr, iArr, 0), this.e.d(listC, jA, jC, 3, 2018, strArr, iArr, 0), kukVar);
    }

    private boolean e(List<HiHealthData> list, List<HiHealthData> list2, kuk kukVar) {
        if (HiCommonUtil.b(list) && HiCommonUtil.b(list2)) {
            ljz.c(kukVar, HiHealthDataType.i());
            LogUtil.j("Debug_HiHeartRateAndRestHeartRateStat", "saveHeartRateStat()  statDatasOld and statDatasNew are null");
            return false;
        }
        if (HiCommonUtil.b(list) && !HiCommonUtil.b(list2)) {
            return a(kukVar, list2.get(0).getDouble("avgRestingHeartRate"), 46018) && a(kukVar, list2.get(0).getDouble("maxHeartRate"), 46016) && a(kukVar, list2.get(0).getDouble("minHeartRate"), 46017);
        }
        if (!HiCommonUtil.b(list) && HiCommonUtil.b(list2)) {
            ljz.c(kukVar, new int[]{46018});
            return a(kukVar, list.get(0).getDouble("maxHeartRate"), 46016) && a(kukVar, list.get(0).getDouble("minHeartRate"), 46017);
        }
        LogUtil.d("Debug_HiHeartRateAndRestHeartRateStat", "statDatasOld and statDatasNew is null or empty");
        HiHealthData hiHealthData = list.get(0);
        HiHealthData hiHealthData2 = list2.get(0);
        double d = hiHealthData.getDouble("maxHeartRate");
        double d2 = hiHealthData2.getDouble("maxHeartRate");
        double d3 = hiHealthData.getDouble("minHeartRate");
        double d4 = hiHealthData2.getDouble("minHeartRate");
        double d5 = hiHealthData2.getDouble("avgRestingHeartRate");
        if (d <= d2) {
            d = d2;
        }
        double d6 = d3 < d4 ? d3 : d4;
        return a(kukVar, d5, 46018) && a(kukVar, d, 46016) && ((d6 > 0.5d ? 1 : (d6 == 0.5d ? 0 : -1)) > 0 ? a(kukVar, d6, 46017) : true);
    }

    private boolean c(List<HiHealthData> list, List<HiHealthData> list2, kuk kukVar) {
        double value;
        if (HiCommonUtil.b(list) && HiCommonUtil.b(list2)) {
            LogUtil.j("Debug_HiHeartRateAndRestHeartRateStat", "saveLastHeartRateStat()  statLastDatas and StatLastDatas2 are null");
            return ljz.d(kukVar.e(), kukVar.c(), 46015, new int[]{46019});
        }
        if (!HiCommonUtil.b(list) && HiCommonUtil.b(list2)) {
            return a(kukVar, list.get(0).getValue(), 46019);
        }
        if (HiCommonUtil.b(list) && !HiCommonUtil.b(list2)) {
            return a(kukVar, list2.get(0).getValue(), 46019);
        }
        LogUtil.d("Debug_HiHeartRateAndRestHeartRateStat", "statLastDatas and statLastDatasRest is null or empty");
        if (list.get(0).getStartTime() > list2.get(0).getStartTime()) {
            value = list.get(0).getValue();
        } else {
            value = list2.get(0).getValue();
        }
        return a(kukVar, value, 46019);
    }

    private boolean b(List<HiHealthData> list, kuk kukVar) {
        if (HiCommonUtil.b(list)) {
            LogUtil.j("Debug_HiHeartRateAndRestHeartRateStat", "saveLastRestHeartRateStat() statLastDatasRest is null");
            return ljz.d(kukVar.e(), kukVar.c(), 46015, new int[]{46020});
        }
        return a(kukVar, list.get(0).getValue(), 46020);
    }

    private boolean a(kuk kukVar, double d, int i) {
        if (d <= 1.0E-6d) {
            LogUtil.j("Debug_HiHeartRateAndRestHeartRateStat", "saveOneStat()  statValue <= 0 statType = ", Integer.valueOf(i));
            return false;
        }
        kukVar.c(d);
        kukVar.d(i);
        return this.mDataStatManager.b(kukVar);
    }
}
