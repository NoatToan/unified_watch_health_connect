package com.huawei.hihealthservice.store.merge;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import defpackage.kwb;
import defpackage.kwq;
import defpackage.kwt;
import defpackage.kwv;
import defpackage.ljn;
import defpackage.ljq;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class HiDataPointMerge implements HiMergeCommon {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kwq f12542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kwv f12543c;
    private Context e;

    public HiDataPointMerge(Context context) {
        this.e = context.getApplicationContext();
        this.f12542b = kwq.e(context);
        this.f12543c = kwv.e(context);
    }

    @Override // com.huawei.hihealthservice.store.merge.HiMergeCommon
    public boolean merge(HiHealthData hiHealthData, int i, List<Integer> list) {
        long startTime;
        long startTime2;
        List<Integer> listE;
        if (hiHealthData.getMergedStatus() != 999) {
            return e(hiHealthData, i, list);
        }
        if (b(hiHealthData, i, 0) && (listE = ljq.e(this.e, hiHealthData.getType()).e((startTime = hiHealthData.getStartTime() - 120000), (startTime2 = 120000 + hiHealthData.getStartTime()), hiHealthData.getType(), list)) != null && listE.size() >= 2) {
            if (e(listE) == i) {
                listE.remove(0);
                this.f12542b.a(startTime, startTime2, hiHealthData.getType(), listE, 1);
            } else {
                this.f12542b.a(hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType(), i, 1);
            }
        }
        return true;
    }

    private int e(List<Integer> list) {
        Collections.sort(list, new ljn.d());
        return list.get(0).intValue();
    }

    public boolean e(HiHealthData hiHealthData, int i, List<Integer> list) {
        long startTime;
        long startTime2;
        List<Integer> listE;
        if (b(hiHealthData, i, hiHealthData.getMergedStatus()) && (listE = ljq.e(this.e, hiHealthData.getType()).e((startTime = hiHealthData.getStartTime() - 120000), (startTime2 = 120000 + hiHealthData.getStartTime()), hiHealthData.getType(), list)) != null && listE.size() >= 2) {
            List<HiHealthData> listE2 = this.f12542b.e(startTime, startTime2, new int[]{hiHealthData.getType()}, list);
            if (HiCommonUtil.b(listE2)) {
                return true;
            }
            int iE = e(listE);
            for (HiHealthData hiHealthData2 : listE2) {
                if (iE == hiHealthData2.getClientId() && hiHealthData2.getMergedStatus() != 0) {
                    this.f12542b.d(hiHealthData2.getDataId(), 0, 0);
                    this.f12543c.c(hiHealthData2, iE, 0);
                }
                if (iE != hiHealthData2.getClientId() && hiHealthData2.getMergedStatus() != 1) {
                    this.f12542b.d(hiHealthData2.getDataId(), 0, 1);
                    this.f12543c.c(hiHealthData2, hiHealthData2.getClientId(), 0);
                }
            }
            Iterator<Integer> it = listE.iterator();
            while (it.hasNext()) {
                kwt.b().k(it.next().intValue());
            }
        }
        return true;
    }

    public boolean b(HiHealthData hiHealthData, int i, int i2) {
        int iD = HiDateUtil.d(hiHealthData.getStartTime());
        boolean z = HiDateUtil.d(System.currentTimeMillis()) == iD && 901 == hiHealthData.getType();
        if (hiHealthData.getType() >= 901 && hiHealthData.getType() <= 906) {
            hiHealthData.setStartTime(HiDateUtil.p(hiHealthData.getStartTime()));
            hiHealthData.setEndTime(HiDateUtil.g(hiHealthData.getEndTime()));
        }
        Double dB = this.f12542b.b(hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType(), i);
        if (dB == null) {
            if (z) {
                ReleaseLogUtil.e("HiH_HiDataPointMerge", "saveSptDt insDev staDt=", Integer.valueOf(iD), ",old=null");
            }
            return kwb.b(this.f12542b.a(hiHealthData, i, i2));
        }
        if (dB.doubleValue() >= hiHealthData.getValue()) {
            ReleaseLogUtil.d("HiH_HiDataPointMerge", "oldValue " + dB + " is bigger than current value " + hiHealthData.getValue());
            return false;
        }
        if (hiHealthData.getSyncStatus() == 0) {
            this.f12543c.c(hiHealthData, i, 0);
        }
        if (z) {
            ReleaseLogUtil.d("HiH_HiDataPointMerge", "saveSptDt insDev staDt=", Integer.valueOf(iD), ", old!=null");
        }
        return kwb.b(this.f12542b.e(hiHealthData, i, i2));
    }
}
