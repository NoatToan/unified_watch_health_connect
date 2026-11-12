package com.huawei.hihealthservice.store.merge;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kwb;
import defpackage.kwt;
import defpackage.kxg;
import defpackage.ljn;
import health.compact.a.HiCommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class HiHealthDataSessionMerge implements HiMergeCommon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kxg f12554a;

    public HiHealthDataSessionMerge(Context context) {
        this.f12554a = kxg.c(context);
    }

    @Override // com.huawei.hihealthservice.store.merge.HiMergeCommon
    public boolean merge(HiHealthData hiHealthData, int i, List<Integer> list) {
        if (hiHealthData.getMergedStatus() != 999) {
            return b(hiHealthData, i, list);
        }
        List<HiHealthData> listE = this.f12554a.e(hiHealthData.getStartTime(), hiHealthData.getEndTime(), list);
        if (HiCommonUtil.b(listE)) {
            return hiHealthData.getSyncStatus() == 2 || this.f12554a.a(hiHealthData, i, 0) > 0;
        }
        Iterator<HiHealthData> it = listE.iterator();
        while (true) {
            if (it.hasNext()) {
                HiHealthData next = it.next();
                if (next.getClientId() == i) {
                    next.setType(hiHealthData.getType());
                    next.putInt("merged", 0);
                    next.setSyncStatus(hiHealthData.getSyncStatus());
                    break;
                }
            } else {
                if (hiHealthData.getSyncStatus() == 2) {
                    break;
                }
                hiHealthData.putInt("merged", 0);
                hiHealthData.setClientId(i);
                listE.add(hiHealthData);
                break;
            }
        }
        Collections.sort(listE, new ljn.e());
        HiHealthData hiHealthData2 = listE.get(0);
        boolean zB = this.f12554a.b(hiHealthData2, hiHealthData2.getClientId(), 0);
        for (int i2 = 1; i2 < listE.size(); i2++) {
            HiHealthData hiHealthData3 = listE.get(i2);
            if (hiHealthData3.getInt("merged") == 0) {
                boolean zB2 = this.f12554a.b(hiHealthData3, hiHealthData3.getClientId(), 1);
                LogUtil.d("Debug_HiHealthDataSessionMerge", "healthSessionDataMerge() insertOrUpdateSessionData unmerge change = ", Boolean.valueOf(zB2));
                if (!zB2) {
                    zB = false;
                }
            }
        }
        return zB;
    }

    public boolean b(HiHealthData hiHealthData, int i, List<Integer> list) {
        long jD;
        if (hiHealthData.getMergedStatus() != 2) {
            if (this.f12554a.b(hiHealthData.getStartTime(), hiHealthData.getEndTime(), i)) {
                jD = this.f12554a.e(hiHealthData, hiHealthData.getMergedStatus());
            } else {
                jD = this.f12554a.a(hiHealthData, i, hiHealthData.getMergedStatus());
            }
            if (!kwb.b(jD)) {
                ReleaseLogUtil.a("Debug_HiHealthDataSessionMerge", "sessionData insert fail", hiHealthData);
                return false;
            }
        } else {
            jD = 1;
        }
        List<HiHealthData> listE = this.f12554a.e(hiHealthData.getStartTime(), hiHealthData.getEndTime(), list);
        if (HiCommonUtil.b(listE)) {
            return true;
        }
        if (hiHealthData.getMergedStatus() != 2 && listE.size() < 2) {
            return true;
        }
        Collections.sort(listE, new ljn.e());
        HiHealthData hiHealthData2 = listE.get(0);
        if (hiHealthData2.getMergedStatus() != 0) {
            hiHealthData2.setSyncStatus(0);
            jD = this.f12554a.d(hiHealthData2, 0);
        }
        boolean zB = kwb.b(jD);
        for (int i2 = 1; i2 < listE.size(); i2++) {
            HiHealthData hiHealthData3 = listE.get(i2);
            if (hiHealthData3.getInt("merged") == 0) {
                hiHealthData3.setSyncStatus(0);
                if (!kwb.b(this.f12554a.d(hiHealthData3, 1))) {
                    zB = false;
                }
            }
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            kwt.b().k(it.next().intValue());
        }
        return zB;
    }
}
