package com.huawei.hihealthservice.store.merge;

import android.content.Context;
import android.util.LruCache;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiBloodSugarMetaData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kwc;
import defpackage.kwt;
import defpackage.kwy;
import defpackage.liq;
import defpackage.ljn;
import defpackage.ljq;
import defpackage.ljs;
import health.compact.a.HiCommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class HiHealthDataPointMerge implements HiMergeCommon {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f12552b;
    private static LruCache<Integer, String> d;

    public HiHealthDataPointMerge(Context context) {
        f12552b = context.getApplicationContext();
        d = new LruCache<>(16);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0111  */
    /* JADX WARN: Code duplicated, block: B:56:0x0115  */
    @Override // com.huawei.hihealthservice.store.merge.HiMergeCommon
    public boolean merge(HiHealthData hiHealthData, int i, List<Integer> list) {
        long jD;
        String str;
        boolean z;
        int type = hiHealthData.getType();
        List<HiHealthData> listB = ljq.a(f12552b, type).b(hiHealthData.getStartTime(), hiHealthData.getEndTime(), type, list);
        boolean z2 = hiHealthData.getModifiedTime() == 0;
        if (z2) {
            jD = ljs.d(listB, hiHealthData);
            hiHealthData.setModifiedTime(jD);
        } else {
            jD = 0;
        }
        if (HiCommonUtil.b(listB)) {
            return hiHealthData.getSyncStatus() == 2 || ljq.a(f12552b, type).b(hiHealthData, i, 0) > 0;
        }
        Iterator<HiHealthData> it = listB.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "merged";
                z = true;
                break;
            }
            HiHealthData next = it.next();
            if (next.getClientId() == i) {
                if (c(hiHealthData, next)) {
                    ReleaseLogUtil.d("Debug_HiHealthDataPointMerge", "merge time is same and value is same, type=", Integer.valueOf(type));
                    return true;
                }
                if (!z2 && next.getModifiedTime() >= hiHealthData.getModifiedTime()) {
                    ReleaseLogUtil.d("Debug_HiHealthDataPointMerge", "getModifiedTime is small, type = ", Integer.valueOf(type), " time = ", Long.valueOf(hiHealthData.getModifiedTime()));
                    return true;
                }
                if (b(type)) {
                    next.setMetaData(hiHealthData.getMetaData());
                }
                if (c(type)) {
                    try {
                        HiBloodSugarMetaData hiBloodSugarMetaData = (HiBloodSugarMetaData) new Gson().fromJson(hiHealthData.getMetaData(), HiBloodSugarMetaData.class);
                        if (hiBloodSugarMetaData != null && hiBloodSugarMetaData.getConfirmed()) {
                            next.setMetaData(hiHealthData.getMetaData());
                        }
                    } catch (JsonSyntaxException e) {
                        ReleaseLogUtil.e("HiH_HiHealthDataPointMerge", "JsonSyntaxException ", e.getMessage());
                        return false;
                    }
                }
                next.setValue(hiHealthData.getValue());
                if (hiHealthData.getSyncStatus() == 1) {
                    str = "merged";
                    if (next.getInt(str) != 2) {
                    }
                    if (z2) {
                        next.setModifiedTime(jD);
                    } else {
                        next.setModifiedTime(hiHealthData.getModifiedTime());
                    }
                    next.setSyncStatus(hiHealthData.getSyncStatus());
                    z = false;
                    break;
                }
                str = "merged";
                next.putInt(str, 0);
                if (z2) {
                    next.setModifiedTime(jD);
                } else {
                    next.setModifiedTime(hiHealthData.getModifiedTime());
                }
                next.setSyncStatus(hiHealthData.getSyncStatus());
                z = false;
                break;
            }
        }
        if (z && hiHealthData.getSyncStatus() != 2) {
            hiHealthData.setClientId(i);
            hiHealthData.putInt(str, 0);
            listB.add(hiHealthData);
        }
        if (type == 2002 || type == 2018 || type == 2105) {
            for (HiHealthData hiHealthData2 : listB) {
                String deviceUniqueCode = d.get(Integer.valueOf(hiHealthData2.getClientId()));
                if (deviceUniqueCode == null) {
                    HiDeviceInfo hiDeviceInfoB = kwy.b(f12552b).b(kwt.b().c(hiHealthData2.getClientId()));
                    if (hiDeviceInfoB == null) {
                        ReleaseLogUtil.e("Debug_HiHealthDataPointMerge", "deviceInfo is null");
                        return false;
                    }
                    deviceUniqueCode = hiDeviceInfoB.getDeviceUniqueCode();
                    d.put(Integer.valueOf(hiHealthData2.getClientId()), deviceUniqueCode);
                }
                hiHealthData2.setDeviceUuid(deviceUniqueCode);
            }
        }
        b(listB);
        boolean zA = a(listB.get(0), hiHealthData, z, 0);
        for (int i2 = 1; i2 < listB.size(); i2++) {
            HiHealthData hiHealthData3 = listB.get(i2);
            if (hiHealthData3.getInt(str) == 0) {
                boolean zA2 = a(hiHealthData3, hiHealthData, z, 1);
                LogUtil.d("Debug_HiHealthDataPointMerge", "pointDataMerge() insertOrUpdatePointData unmerge change = ", Boolean.valueOf(zA2));
                if (!zA2) {
                    zA = false;
                }
            }
        }
        return zA;
    }

    private boolean b(int i) {
        return i == new int[]{2107}[0];
    }

    private boolean c(int i) {
        for (int i2 : HiHealthDataType.e(10001)) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    public boolean c(List<HiHealthData> list, long j, long j2, List<Integer> list2) throws Throwable {
        boolean zB;
        try {
            try {
                zB = !ljq.h(f12552b, 0) ? ljq.b(f12552b, 0) : false;
                try {
                    boolean zD = d(list, j, j2, list2);
                    if (zB) {
                        ljq.g(f12552b, 0);
                    }
                    if (zB) {
                        ljq.c(f12552b, 0);
                    }
                    return zD;
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.e("HiH_HiHealthDataPointMerge", "merges: ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(f12552b, 0);
                    }
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    ljq.c(f12552b, 0);
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                ljq.c(f12552b, 0);
            }
            throw th;
        }
    }

    private boolean d(List<HiHealthData> list, long j, long j2, List<Integer> list2) {
        List<HiHealthData> listE = ljq.a(f12552b, list.get(0).getType()).e(j, j2, list.get(0).getType(), list2);
        if (CollectionUtils.a(listE)) {
            return d(list);
        }
        ArrayList arrayList = new ArrayList(10);
        boolean zE = true;
        for (int i = 0; i < list.size(); i++) {
            HiHealthData hiHealthData = list.get(i);
            liq.d(i, false);
            arrayList.clear();
            int clientId = hiHealthData.getClientId();
            boolean zC = c(listE, hiHealthData, clientId, arrayList);
            if (zC) {
                hiHealthData.setClientId(clientId);
                hiHealthData.putInt("merged", 0);
                arrayList.add(hiHealthData);
                listE.add(hiHealthData);
            }
            b(arrayList);
            HiHealthData hiHealthData2 = arrayList.get(0);
            zE = e(!a(hiHealthData2, hiHealthData, zC, 0) ? false : zE, arrayList, hiHealthData, zC, hiHealthData2);
        }
        return zE;
    }

    private static boolean c(List<HiHealthData> list, HiHealthData hiHealthData, int i, List<HiHealthData> list2) {
        for (HiHealthData hiHealthData2 : list) {
            if (hiHealthData2.getStartTime() == hiHealthData.getStartTime() && hiHealthData2.getEndTime() == hiHealthData.getEndTime() && hiHealthData.getType() == hiHealthData2.getType()) {
                if (hiHealthData2.getClientId() != i) {
                    list2.add(hiHealthData2);
                } else {
                    hiHealthData2.setValue(hiHealthData.getValue());
                    hiHealthData2.putInt("merged", 0);
                    hiHealthData2.setSyncStatus(hiHealthData.getSyncStatus());
                    list2.add(hiHealthData2);
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean d(List<HiHealthData> list) {
        boolean z = true;
        for (int i = 0; i < list.size(); i++) {
            HiHealthData hiHealthData = list.get(i);
            if (ljq.a(f12552b, hiHealthData.getType()).b(hiHealthData, hiHealthData.getClientId(), 0) <= 0) {
                z = false;
            }
            liq.d(i, false);
        }
        return z;
    }

    private boolean e(boolean z, List<HiHealthData> list, HiHealthData hiHealthData, boolean z2, HiHealthData hiHealthData2) {
        hiHealthData2.putInt("merged", 0);
        for (int i = 1; i < list.size(); i++) {
            HiHealthData hiHealthData3 = list.get(i);
            if (hiHealthData3.getInt("merged") == 0) {
                boolean zA = a(hiHealthData3, hiHealthData, z2, 1);
                hiHealthData3.putInt("merged", 1);
                LogUtil.d("Debug_HiHealthDataPointMerge", "pointDataMerge() insertOrUpdatePointData unmerge change = ", Boolean.valueOf(zA));
                if (!zA) {
                    z = false;
                }
            }
        }
        return z;
    }

    private boolean a(HiHealthData hiHealthData, HiHealthData hiHealthData2, boolean z, int i) {
        long jB;
        if (hiHealthData.getClientId() == hiHealthData2.getClientId() && z) {
            jB = ljq.a(f12552b, hiHealthData.getType()).b(hiHealthData, hiHealthData.getClientId(), i);
        } else {
            int iD = ljq.a(f12552b, hiHealthData.getType()).d(hiHealthData, i);
            jB = iD;
        }
        return jB > 0;
    }

    private void b(List<HiHealthData> list) {
        Comparator bVar;
        int type = list.get(0).getType();
        if (type == 2101 || type == 2102 || type == 2103) {
            Collections.reverse(list);
            return;
        }
        if (type == 2002 || type == 2018 || type == 2105) {
            bVar = new ljn.b(kwc.h(), "MIN");
        } else {
            bVar = new ljn.f();
        }
        Collections.sort(list, bVar);
    }

    private boolean c(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
        int type = hiHealthData.getType();
        if (type != 2002 && type != 2018) {
            switch (type) {
                case 2101:
                case 2102:
                    return hiHealthData.getMetaData().equals(hiHealthData2.getMetaData());
                case 2103:
                    break;
                default:
                    return false;
            }
        }
        return hiHealthData.getValue() == hiHealthData2.getValue();
    }
}
