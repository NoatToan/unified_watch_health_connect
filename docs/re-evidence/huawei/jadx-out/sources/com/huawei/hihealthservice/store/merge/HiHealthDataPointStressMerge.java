package com.huawei.hihealthservice.store.merge;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kxd;
import defpackage.kxo;
import defpackage.kyh;
import defpackage.ljn;
import health.compact.a.HiCommonUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class HiHealthDataPointStressMerge implements HiMergeCommon {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kxd f12553b;
    private kyh d;
    private kxo e = kxo.a();

    private boolean a(int i) {
        if (i == 2021) {
            return true;
        }
        switch (i) {
            case 2034:
            case 2035:
            case 2036:
            case 2037:
                return true;
            default:
                return false;
        }
    }

    public HiHealthDataPointStressMerge(Context context) {
        this.f12553b = kxd.e(context);
        this.d = kyh.d(context);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    @Override // com.huawei.hihealthservice.store.merge.HiMergeCommon
    public boolean merge(HiHealthData hiHealthData, int i, List<Integer> list) {
        boolean z;
        if (a(hiHealthData.getType())) {
            return b(hiHealthData, i, list);
        }
        if (a(hiHealthData)) {
            List<HiHealthData> listE = this.f12553b.e(hiHealthData.getStartTime(), hiHealthData.getEndTime(), 2019, 2020, list);
            boolean z2 = false;
            if (HiCommonUtil.b(listE)) {
                return this.f12553b.b(hiHealthData, i, 0) > 0;
            }
            LogUtil.d("Debug_HiHealthDataPointStressMerge", "merge() get old data size = ", Integer.valueOf(listE.size()));
            for (HiHealthData hiHealthData2 : listE) {
                if (hiHealthData2.getClientId() == i) {
                    if (hiHealthData2.getType() != 2019 ? !e(hiHealthData, hiHealthData2) : !c(hiHealthData, hiHealthData2)) {
                        hiHealthData2.setValue(hiHealthData.getValue());
                        hiHealthData2.setType(hiHealthData.getType());
                        hiHealthData2.putInt("merged", 0);
                        hiHealthData2.setSyncStatus(hiHealthData.getSyncStatus());
                        z = false;
                    } else {
                        z = true;
                        z2 = true;
                    }
                    if (!z2) {
                        return d(hiHealthData, i, listE, z);
                    }
                }
            }
            z = true;
            if (!z2) {
                return d(hiHealthData, i, listE, z);
            }
        }
        return true;
    }

    private boolean d(HiHealthData hiHealthData, int i, List<HiHealthData> list, boolean z) {
        if (z) {
            hiHealthData.setClientId(i);
            hiHealthData.putInt("merged", 0);
            list.add(hiHealthData);
        }
        HiHealthData hiHealthDataD = d(list);
        return e(this.f12553b.e(hiHealthDataD, hiHealthDataD.getClientId(), 2019, 2020, 0), list);
    }

    private boolean e(boolean z, List<HiHealthData> list) {
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData.getInt("merged") == 0) {
                boolean zE = this.f12553b.e(hiHealthData, hiHealthData.getClientId(), 2019, 2020, 1);
                LogUtil.d("Debug_HiHealthDataPointStressMerge", "stress pointDataMerge() insertOrUpdatePointData unmerge change = ", Boolean.valueOf(zE));
                if (!zE) {
                    z = false;
                }
            }
        }
        return z;
    }

    private boolean e(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
        return 2020 == hiHealthData.getType() && hiHealthData.getValue() <= hiHealthData2.getValue();
    }

    private boolean c(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
        return 2020 == hiHealthData.getType() || hiHealthData.getValue() <= hiHealthData2.getValue();
    }

    private boolean a(HiHealthData hiHealthData) {
        return 2019 == hiHealthData.getType() || 2020 == hiHealthData.getType();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    private HiHealthData d(List<HiHealthData> list) {
        int i = 0;
        HiHealthData hiHealthData = list.get(0);
        for (int i2 = 1; i2 < list.size(); i2++) {
            HiHealthData hiHealthData2 = list.get(i2);
            if (hiHealthData.getType() == hiHealthData2.getType()) {
                if (hiHealthData2.getValue() > hiHealthData.getValue()) {
                    i = i2;
                    hiHealthData = hiHealthData2;
                }
            } else if (2019 == hiHealthData2.getType()) {
                i = i2;
                hiHealthData = hiHealthData2;
            }
        }
        return list.remove(i);
    }

    private boolean b(HiHealthData hiHealthData, int i, List<Integer> list) {
        boolean zC = this.f12553b.c(hiHealthData, i, 0);
        if (!zC) {
            return zC;
        }
        List<Integer> listD = this.e.d(hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType(), list);
        if (listD == null || listD.size() < 2) {
            return true;
        }
        Collections.sort(listD, new ljn.d());
        if (listD.get(0).intValue() == i) {
            listD.remove(0);
            this.f12553b.a(hiHealthData.getStartTime(), hiHealthData.getStartTime(), hiHealthData.getType(), listD, 1);
            return zC;
        }
        this.f12553b.a(hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType(), i, 1);
        return zC;
    }
}
