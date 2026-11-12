package com.huawei.hihealthservice.store.merge;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kwc;
import defpackage.kwv;
import defpackage.ljn;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class HiDataSessionMerge implements HiMergeCommon {
    private kwv d;

    public HiDataSessionMerge(Context context) {
        this.d = kwv.e(context);
    }

    @Override // com.huawei.hihealthservice.store.merge.HiMergeCommon
    public boolean merge(HiHealthData hiHealthData, int i, List<Integer> list) {
        List<HiHealthData> listD = this.d.d(hiHealthData.getStartTime(), hiHealthData.getEndTime(), list);
        if (listD == null || listD.isEmpty()) {
            return this.d.d(hiHealthData, i, 0) > 0;
        }
        Iterator<HiHealthData> it = listD.iterator();
        while (true) {
            if (it.hasNext()) {
                HiHealthData next = it.next();
                if (next.getClientId() == i) {
                    if (kwc.e(hiHealthData.getType(), next.getType()) <= 0) {
                        LogUtil.d("Debug_HiDataSessionMerge", "sessionDataMerge() insertData priority is lower");
                        return true;
                    }
                    LogUtil.d("Debug_HiDataSessionMerge", "sessionDataMerge() merged has happen  type from  ", Integer.valueOf(next.getType()), ",to ", Integer.valueOf(hiHealthData.getType()));
                    next.setType(hiHealthData.getType());
                    next.putInt("merged", 0);
                    next.setSyncStatus(hiHealthData.getSyncStatus());
                    break;
                }
            } else {
                hiHealthData.setClientId(i);
                hiHealthData.putInt("merged", 0);
                listD.add(hiHealthData);
                break;
            }
        }
        Collections.sort(listD, new ljn.l());
        HiHealthData hiHealthData2 = listD.get(0);
        boolean zA = this.d.a(hiHealthData2, hiHealthData2.getClientId(), 0);
        for (int i2 = 1; i2 < listD.size(); i2++) {
            HiHealthData hiHealthData3 = listD.get(i2);
            if (hiHealthData3.getInt("merged") == 0 && !this.d.a(hiHealthData3, hiHealthData3.getClientId(), 1)) {
                zA = false;
            }
        }
        return zA;
    }
}
