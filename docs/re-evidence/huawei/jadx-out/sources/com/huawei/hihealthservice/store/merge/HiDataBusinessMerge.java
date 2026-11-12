package com.huawei.hihealthservice.store.merge;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiRelationInformation;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kwl;
import defpackage.kwo;
import defpackage.ljn;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class HiDataBusinessMerge implements HiMergeCommon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kwo f12537a = kwo.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kwl f12538b = kwl.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f12539c;

    public HiDataBusinessMerge(Context context) {
        this.f12539c = context.getApplicationContext();
    }

    @Override // com.huawei.hihealthservice.store.merge.HiMergeCommon
    public boolean merge(HiHealthData hiHealthData, int i, List<Integer> list) {
        List list2 = (List) new Gson().fromJson(hiHealthData.getRelationInformations(), new TypeToken<List<HiRelationInformation>>() { // from class: com.huawei.hihealthservice.store.merge.HiDataBusinessMerge.1
        }.getType());
        if (hiHealthData.getRelationFlag() && list2.isEmpty()) {
            ReleaseLogUtil.e("Debug_HiDataBusinessMerge", "RelationFlag is true, but relationInformation is empty!");
            return false;
        }
        long jA = a(hiHealthData, i);
        if (jA < 0) {
            return false;
        }
        boolean z = true;
        int i2 = 0;
        while (i2 < list2.size()) {
            long j = jA;
            if (this.f12538b.c(hiHealthData.getType(), (int) jA, ((HiRelationInformation) list2.get(i2)).a(), ((HiRelationInformation) list2.get(i2)).b()) < 0) {
                z = false;
            }
            i2++;
            jA = j;
        }
        return z;
    }

    private long a(HiHealthData hiHealthData, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        List<HiHealthData> listD = this.f12537a.d(hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType(), arrayList);
        if (listD == null || listD.isEmpty()) {
            return this.f12537a.e(hiHealthData, i, 0);
        }
        Iterator<HiHealthData> it = listD.iterator();
        while (true) {
            if (it.hasNext()) {
                HiHealthData next = it.next();
                if (next.getClientId() == i) {
                    next.setValue(hiHealthData.getValue());
                    next.setMetaData(hiHealthData.getMetaData());
                    if (hiHealthData.getSyncStatus() != 1 || next.getInt("merged") != 2) {
                        next.putInt("merged", 0);
                    }
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
        d(listD);
        HiHealthData hiHealthData2 = listD.get(0);
        long jB = this.f12537a.b(hiHealthData2, hiHealthData2.getClientId(), 0);
        if (jB < 0) {
            return -1L;
        }
        for (int i2 = 1; i2 < listD.size(); i2++) {
            HiHealthData hiHealthData3 = listD.get(i2);
            if (hiHealthData3.getInt("merged") == 0) {
                jB = this.f12537a.b(hiHealthData3, hiHealthData3.getClientId(), 1);
                LogUtil.d("Debug_HiDataBusinessMerge", "businessDataMerge() insertOrUpdatePointData unmerge change index = ", Long.valueOf(jB));
                if (jB < 0) {
                    return -1L;
                }
            }
        }
        return jB;
    }

    private void d(List<HiHealthData> list) {
        Comparator fVar;
        switch (list.get(0).getType()) {
            case 61001:
            case 61002:
                fVar = new ljn.f();
                break;
            default:
                fVar = new ljn.g();
                break;
        }
        Collections.sort(list, fVar);
    }
}
