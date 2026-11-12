package com.huawei.hihealthservice.store.merge;

import android.content.Context;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HealthDataMergePolicy;
import com.huawei.hihealth.dictionary.model.HiHealthDictField;
import com.huawei.hihealth.dictionary.model.HiHealthDictMergeMode;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kwt;
import defpackage.kwy;
import defpackage.kxe;
import defpackage.ljn;
import defpackage.ljq;
import defpackage.ljs;
import defpackage.ljt;
import health.compact.a.HiCommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class HiDicHealthDataMerge {
    private static Context e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kxe f12548c;
    private String d;
    private String f;
    private int g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap<Integer, Integer> f12547b = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, Integer> f12546a = new HashMap<>();

    public HiDicHealthDataMerge(Context context) {
        b(context.getApplicationContext());
    }

    private static void b(Context context) {
        e = context;
    }

    public boolean e(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            LogUtil.j("Debug_HiDicHealthDataMerge", "healthData is null");
            return false;
        }
        HiHealthDictField hiHealthDictFieldC = HiHealthDictManager.a(e).c(hiHealthData.getType());
        if (hiHealthDictFieldC == null) {
            ReleaseLogUtil.e("Debug_HiDicHealthDataMerge", "HiHealthDictField is null, type is ", Integer.valueOf(hiHealthData.getType()));
            return false;
        }
        this.g = hiHealthData.getType();
        HiHealthDictMergeMode hiHealthDictMergeModeA = hiHealthDictFieldC.a();
        if (hiHealthDictMergeModeA == null) {
            ReleaseLogUtil.e("Debug_HiDicHealthDataMerge", "mergeMode is null, type is ", Integer.valueOf(this.g));
            return false;
        }
        String strC = hiHealthDictMergeModeA.c();
        this.d = strC;
        if (HealthDataMergePolicy.SOURCE_PRIORITY.equals(strC)) {
            int[] iArrD = hiHealthDictMergeModeA.d();
            for (int i = 0; i < iArrD.length; i++) {
                f12547b.put(Integer.valueOf(iArrD[i]), Integer.valueOf(iArrD.length - i));
            }
            this.f = hiHealthDictMergeModeA.e();
        }
        if (HealthDataMergePolicy.CATEGORY_PRIORITY.equals(this.d)) {
            String[] strArrB = hiHealthDictMergeModeA.b();
            for (int i2 = 0; i2 < strArrB.length; i2++) {
                f12546a.put(strArrB[i2], Integer.valueOf(strArrB.length - i2));
            }
            this.f = hiHealthDictMergeModeA.e();
        }
        this.f12548c = ljq.a(e, hiHealthData.getType());
        return true;
    }

    public boolean d(final HiHealthData hiHealthData, int i, List<Integer> list) {
        long jD;
        List<HiHealthData> list2;
        List<HiHealthData> list3;
        if (hiHealthData == null || HiCommonUtil.b(list)) {
            ReleaseLogUtil.e("Debug_HiDicHealthDataMerge", "healthData is null or clients is null empty");
            return false;
        }
        List<HiHealthData> listB = this.f12548c.b(hiHealthData.getStartTime(), hiHealthData.getEndTime(), this.g, list);
        boolean z = true;
        boolean z2 = hiHealthData.getModifiedTime() == 0;
        if (z2) {
            jD = ljs.d(listB, hiHealthData);
            hiHealthData.setModifiedTime(jD);
        } else {
            jD = 0;
        }
        if (HiCommonUtil.b(listB)) {
            if (hiHealthData.getSyncStatus() == 2) {
                return true;
            }
            long jB = this.f12548c.b(hiHealthData, i, 0);
            if (hiHealthData.getSyncStatus() != 1) {
                HandlerCenter.a().d(new Runnable() { // from class: lgc
                    @Override // java.lang.Runnable
                    public final void run() {
                        lfp.c().process(hiHealthData);
                    }
                }, 1000L);
            }
            return jB > 0;
        }
        Iterator<HiHealthData> it = listB.iterator();
        while (true) {
            if (!it.hasNext()) {
                list2 = listB;
                break;
            }
            HiHealthData next = it.next();
            if (next.getClientId() == i || ljt.c(next.getClientId(), i)) {
                if (c(hiHealthData)) {
                    list2 = listB;
                } else {
                    list2 = listB;
                    if (Double.compare(hiHealthData.getValue(), next.getValue()) == 0 && e(next, hiHealthData) && next.getInt("merged") == 0) {
                        ReleaseLogUtil.d("Debug_HiDicHealthDataMerge", "merge time is same and value is same, type = ", Integer.valueOf(this.g));
                        return true;
                    }
                }
                if (!z2 && next.getModifiedTime() >= hiHealthData.getModifiedTime()) {
                    ReleaseLogUtil.d("Debug_HiDicHealthDataMerge", "getModifiedTime is small, type = ", Integer.valueOf(this.g), " time = ", Long.valueOf(hiHealthData.getModifiedTime()));
                    return true;
                }
                if (!e(next, hiHealthData)) {
                    next.setMetaData(hiHealthData.getMetaData());
                }
                next.setValue(hiHealthData.getValue());
                if (hiHealthData.getSyncStatus() != 1 || next.getInt("merged") != 2) {
                    next.putInt("merged", 0);
                }
                next.setSyncStatus(hiHealthData.getSyncStatus());
                if (z2) {
                    next.setModifiedTime(jD);
                } else {
                    next.setModifiedTime(hiHealthData.getModifiedTime());
                }
                z = false;
                break;
            }
        }
        if (HealthDataMergePolicy.NONE.equals(this.d)) {
            return this.f12548c.c(hiHealthData, i, 0);
        }
        if (!z || hiHealthData.getSyncStatus() == 2) {
            list3 = list2;
        } else {
            hiHealthData.setClientId(i);
            hiHealthData.putInt("merged", 0);
            list3 = list2;
            list3.add(hiHealthData);
        }
        if (HealthDataMergePolicy.SOURCE_PRIORITY.equals(this.d) || HealthDataMergePolicy.CATEGORY_PRIORITY.equals(this.d)) {
            for (HiHealthData hiHealthData2 : list3) {
                HiDeviceInfo hiDeviceInfoB = kwy.b(e).b(kwt.b().c(hiHealthData2.getClientId()));
                if (hiDeviceInfoB == null) {
                    ReleaseLogUtil.e("Debug_HiDicHealthDataMerge", "deviceInfo is null");
                    return false;
                }
                hiHealthData2.setDeviceUuid(hiDeviceInfoB.getDeviceUniqueCode());
            }
        }
        return a(list3);
    }

    private boolean e(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
        if (hiHealthData.getMetaData() == null && hiHealthData2.getMetaData() == null) {
            return true;
        }
        return (hiHealthData.getMetaData() == null || hiHealthData2.getMetaData() == null || !hiHealthData.getMetaData().equals(hiHealthData2.getMetaData())) ? false : true;
    }

    private boolean c(HiHealthData hiHealthData) {
        return HiHealthDictManager.a(e).f(DicDataTypeUtil.DataType.FASTING_LITE_PHASE_SET.value()).contains(Integer.valueOf(hiHealthData.getType())) || HiHealthDictManager.a(e).f(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value()).contains(Integer.valueOf(hiHealthData.getType())) || HiHealthDictManager.a(e).f(DicDataTypeUtil.DataType.PHYSIOLOGICAL_CYCLE.value()).contains(Integer.valueOf(hiHealthData.getType()));
    }

    private boolean a(List<HiHealthData> list) {
        e(list);
        HiHealthData hiHealthData = list.get(0);
        boolean zC = this.f12548c.c(hiHealthData, hiHealthData.getClientId(), 0);
        boolean z = true;
        for (int i = 1; i < list.size(); i++) {
            HiHealthData hiHealthData2 = list.get(i);
            if (hiHealthData2.getInt("merged") == 0) {
                boolean zC2 = this.f12548c.c(hiHealthData2, hiHealthData2.getClientId(), 1);
                LogUtil.d("Debug_HiDicHealthDataMerge", "insertOrUpdatePointData unmerge change = ", Boolean.valueOf(zC2));
                if (!zC2) {
                    z = false;
                }
            }
        }
        return z && zC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    private void e(List<HiHealthData> list) {
        byte b2;
        Comparator bVar;
        String str = this.d;
        str.hashCode();
        switch (str) {
            case "CATEGORY_PRIORITY":
                b2 = 0;
                break;
            case "MAX":
                b2 = 1;
                break;
            case "MIN":
                b2 = 2;
                break;
            case "NEW":
                b2 = 3;
                break;
            case "OLD":
                b2 = 4;
                break;
            case "SOURCE_PRIORITY":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            bVar = new ljn.b(f12546a, this.f);
        } else if (b2 == 1) {
            bVar = new ljn.f();
        } else if (b2 == 2) {
            bVar = new ljn.g();
        } else if (b2 == 3) {
            bVar = new ljn.i();
        } else {
            if (b2 == 4) {
                return;
            }
            if (b2 == 5) {
                bVar = new ljn.c(f12547b, this.f);
            } else {
                LogUtil.j("Debug_HiDicHealthDataMerge", "This mergePolicy is not supported! mergePolicy is ", this.d);
                return;
            }
        }
        Collections.sort(list, bVar);
    }
}
