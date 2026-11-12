package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.store.merge.HiDataCoreSessionMerge;
import com.huawei.hihealthservice.store.merge.HiHealthDataSessionMerge;
import com.huawei.hwcloudmodel.model.unite.DataTimeDelCondition;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lfw {
    private static Context e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f40058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String[] f40059c;
    private List<DataTimeDelCondition> d;

    private lfw() {
        this.f40058b = new int[]{DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_BED_TIME.value(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_RISING_TIME.value(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_FALL_ASLEEP_TIME.value(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_WAKEUP_TIME.value()};
        this.f40059c = new String[]{"bedTime", "risingTime", "fallAsleepTime", "wakeupTime"};
    }

    static class b {
        private static final lfw e = new lfw();
    }

    public static lfw b(Context context) {
        if (context != null) {
            e = context.getApplicationContext();
        }
        return b.e;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    public boolean c(long j, long j2, int[] iArr, List<Integer> list, int i) throws Throwable {
        boolean zB;
        int iB;
        boolean z = false;
        if (iArr != null && list != null) {
            kwv kwvVarE = kwv.e(e);
            List<HiHealthData> listD = kwvVarE.d(j, j2, iArr, list);
            ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteSessionDatas()");
            if (listD == null || listD.isEmpty()) {
                LogUtil.j("HiH_HiHealthDataDeleteStore", "deleteSessionDatas() hiHealthDatas = null");
            } else {
                ArrayList arrayList = new ArrayList(10);
                try {
                    try {
                        zB = !ljq.h(e, iArr[0]) ? ljq.b(e, iArr[0]) : false;
                        try {
                            boolean z2 = true;
                            for (HiHealthData hiHealthData : listD) {
                                if (hiHealthData.getSyncStatus() == 0) {
                                    iB = kwvVarE.b(hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getClientId());
                                } else {
                                    iB = kwvVarE.b(hiHealthData.getDataId(), 2, 2);
                                }
                                if (iB <= 0) {
                                    LogUtil.j("HiH_HiHealthDataDeleteStore", "deleteSessionDatas() change <= 0");
                                    z2 = false;
                                } else {
                                    hiHealthData.setUserId(i);
                                    arrayList.add(hiHealthData);
                                }
                            }
                            if (zB) {
                                ljq.g(e, iArr[0]);
                            }
                            if (zB) {
                                ljq.c(e, iArr[0]);
                            }
                            z = z2;
                        } catch (Exception e2) {
                            e = e2;
                            ReleaseLogUtil.a("HiH_HiHealthDataDeleteStore", "deleteSessionDatas Exception ", e.getMessage());
                            if (zB) {
                                ljq.c(e, iArr[0]);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (0 != 0) {
                            ljq.c(e, iArr[0]);
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    zB = false;
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        ljq.c(e, iArr[0]);
                    }
                    throw th;
                }
                b(arrayList);
                return z;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0152  */
    public boolean d(long j, long j2, int[] iArr, List<Integer> list, int i) throws Throwable {
        boolean zB;
        HiHealthData hiHealthData;
        int iB;
        boolean z = false;
        if (iArr == null || list == null) {
            return false;
        }
        kxg kxgVarC = kxg.c(e);
        List<HiHealthData> listA = kxgVarC.a(j, j2, iArr, list);
        ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteHealthSessionDatas()");
        if (HiCommonUtil.b(listA)) {
            List<kuk> listA2 = kww.c(e).a(HiDateUtil.d(j2), kyn.d(e).e(0, i, 0), HiHealthDataType.m());
            if (!HiCommonUtil.b(listA2)) {
                if (this.d == null) {
                    this.d = new ArrayList(16);
                }
                this.d.add(e(j, j2, 3));
                Iterator<kuk> it = listA2.iterator();
                while (it.hasNext()) {
                    kww.c(BaseApplication.getContext()).c(it.next().a(), 2);
                }
                return true;
            }
            LogUtil.j("HiH_HiHealthDataDeleteStore", "deleteHealthSessionDatas() hiHealthDatas = null");
            return false;
        }
        char c2 = '\n';
        ArrayList arrayList = new ArrayList(10);
        try {
            try {
                zB = !ljq.h(e, iArr[0]) ? ljq.b(e, iArr[0]) : false;
                try {
                    boolean z2 = true;
                    for (HiHealthData hiHealthData2 : listA) {
                        if (hiHealthData2.getSyncStatus() == 0) {
                            hiHealthData = hiHealthData2;
                            iB = kxgVarC.a(hiHealthData2.getStartTime(), hiHealthData2.getEndTime(), hiHealthData2.getClientId());
                        } else {
                            hiHealthData = hiHealthData2;
                            iB = kxgVarC.b(hiHealthData.getDataId(), 2, 2);
                        }
                        if (iB <= 0) {
                            LogUtil.j("HiH_HiHealthDataDeleteStore", "deleteHealthSessionDatas() change <= 0");
                            z2 = false;
                        } else {
                            HiHealthData hiHealthData3 = hiHealthData;
                            hiHealthData3.setUserId(i);
                            hiHealthData3.setSyncStatus(2);
                            hiHealthData3.setMergedStatus(2);
                            arrayList.add(hiHealthData3);
                        }
                    }
                    if (zB) {
                        ljq.g(e, iArr[0]);
                    }
                    if (zB) {
                        ljq.c(e, iArr[0]);
                    }
                    z = z2;
                } catch (Exception e2) {
                    e = e2;
                    ReleaseLogUtil.a("HiH_HiHealthDataDeleteStore", "deleteHealthSessionDatas Exception ", e.getMessage());
                    if (zB) {
                        ljq.c(e, iArr[0]);
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (c2 != 0) {
                    ljq.c(e, iArr[0]);
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            c2 = 0;
            if (c2 != 0) {
                ljq.c(e, iArr[0]);
            }
            throw th;
        }
        e(arrayList, kwt.b().f(i));
        b(arrayList);
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0175  */
    public boolean a(long j, long j2, int[] iArr, List<Integer> list, int i) throws Throwable {
        boolean zB;
        HiHealthData hiHealthData;
        int iB;
        boolean z = false;
        if (iArr == null || list == null) {
            return false;
        }
        ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteCoreSessionDatas() hiHealthDatas");
        a(j, j2, list, DicDataTypeUtil.DataType.SLEEP_RECORD.value());
        d(j, j2, list);
        kwu kwuVarC = kwu.c(e);
        List<HiHealthData> listC = kwuVarC.c(j, j2, iArr, list);
        if (HiCommonUtil.b(listC)) {
            List<kuk> listA = kww.c(e).a(HiDateUtil.d(j2), kyn.d(e).e(0, i, 0), HiHealthDataType.e());
            if (!HiCommonUtil.b(listA)) {
                if (this.d == null) {
                    this.d = new ArrayList(16);
                }
                this.d.add(e(j, j2, 9));
                Iterator<kuk> it = listA.iterator();
                while (it.hasNext()) {
                    kww.c(BaseApplication.getContext()).c(it.next().a(), 2);
                }
                return true;
            }
            LogUtil.j("HiH_HiHealthDataDeleteStore", "deleteCoreSessionDatas() hiHealthDatas = null");
            return false;
        }
        ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteCoreSessionDatas hiHealthDatas size ", Integer.valueOf(listC.size()));
        ArrayList arrayList = new ArrayList(10);
        try {
            try {
                zB = !ljq.h(e, iArr[0]) ? ljq.b(e, iArr[0]) : false;
                try {
                    boolean z2 = true;
                    for (HiHealthData hiHealthData2 : listC) {
                        if (hiHealthData2.getSyncStatus() == 0) {
                            hiHealthData = hiHealthData2;
                            iB = kwuVarC.d(hiHealthData2.getStartTime(), hiHealthData2.getEndTime(), hiHealthData2.getClientId());
                        } else {
                            hiHealthData = hiHealthData2;
                            iB = kwuVarC.b(hiHealthData.getDataId(), 2, 2);
                        }
                        if (iB <= 0) {
                            ReleaseLogUtil.e("HiH_HiHealthDataDeleteStore", "deleteHealthSessionDatas() change <= 0");
                            z2 = false;
                        } else {
                            HiHealthData hiHealthData3 = hiHealthData;
                            hiHealthData3.setUserId(i);
                            hiHealthData3.setMergedStatus(2);
                            hiHealthData3.setSyncStatus(2);
                            arrayList.add(hiHealthData3);
                        }
                    }
                    if (zB) {
                        ljq.g(e, iArr[0]);
                    }
                    if (zB) {
                        ljq.c(e, iArr[0]);
                    }
                    z = z2;
                } catch (Exception e2) {
                    e = e2;
                    ReleaseLogUtil.a("HiH_HiHealthDataDeleteStore", "deleteCoreSessionDatas Exception ", e.getMessage());
                    if (zB) {
                        ljq.c(e, iArr[0]);
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    ljq.c(e, iArr[0]);
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                ljq.c(e, iArr[0]);
            }
            throw th;
        }
        a(arrayList, kwt.b().f(i));
        b(arrayList);
        return z;
    }

    private void a(long j, long j2, List<Integer> list, int i) {
        ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteCoreSleepDictData type-", Integer.valueOf(i));
        List<HiHealthData> listA = kxe.d(e).a(j, j2, CommonUtil.c(HiHealthDictManager.a((Context) null).f(i)), list);
        if (HiCommonUtil.b(listA)) {
            ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteCoreSleepDictData isNullEmpty ", Long.valueOf(j), " endTime= ", Long.valueOf(j2), ",clientIds= ", list, ",type=", Integer.valueOf(i));
            return;
        }
        for (HiHealthData hiHealthData : listA) {
            if (hiHealthData.getSyncStatus() == 0) {
                kxe.d(e).b(hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType(), hiHealthData.getClientId());
            } else {
                kxe.d(e).b(hiHealthData.getDataId(), 2, 2);
            }
        }
    }

    private void d(long j, long j2, List<Integer> list) {
        String str;
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(0L);
        hiAggregateOption.setEndTime(System.currentTimeMillis());
        hiAggregateOption.setType(this.f40058b);
        hiAggregateOption.setConstantsKey(this.f40059c);
        boolean z = true;
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        HiDataFilter.DataFilterExpression dataFilterExpression = new HiDataFilter.DataFilterExpression("bedTime", HiDataFilter.DataFilterExpression.BIGGER_EQUAL, j - 86400000);
        HiDataFilter.DataFilterExpression dataFilterExpression2 = new HiDataFilter.DataFilterExpression("bedTime", HiDataFilter.DataFilterExpression.LESS_EQUAL, j2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(dataFilterExpression);
        arrayList.add(dataFilterExpression2);
        ArrayList arrayList2 = new ArrayList(10);
        arrayList2.add(0);
        List<HiHealthData> listD = kxo.a().d(list, hiAggregateOption, kth.b(true).b(HiJsonUtil.d(new HiDataFilter(arrayList, arrayList2))).d());
        String str2 = "HiH_HiHealthDataDeleteStore";
        ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteSleepRecordDictData healthDatas-", listD);
        if (HiCommonUtil.b(listD)) {
            return;
        }
        for (HiHealthData hiHealthData : listD) {
            if (hiHealthData.getLong("bedTime") >= j || hiHealthData.getLong("risingTime") <= j) {
                if (hiHealthData.getLong("bedTime") < j2 && hiHealthData.getLong("risingTime") > j2) {
                    a(j2, hiHealthData, z);
                } else if (hiHealthData.getLong("bedTime") >= j && hiHealthData.getLong("risingTime") < j2) {
                    str = str2;
                    a(hiHealthData.getStartTime(), hiHealthData.getEndTime(), list, DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD.value());
                } else {
                    str = str2;
                    ReleaseLogUtil.d(str, "deleteSleepRecordDictData not del ", hiHealthData);
                }
                str2 = str;
                z = true;
            } else {
                a(j, hiHealthData, false);
            }
            str = str2;
            str2 = str;
            z = true;
        }
    }

    private HiHealthData d(long j, long j2, int i, long j3) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setTimeInterval(j, j2);
        hiHealthData.setType(i);
        hiHealthData.setValue(j3);
        hiHealthData.setDeviceUuid("-1");
        return hiHealthData;
    }

    private void a(long j, HiHealthData hiHealthData, boolean z) {
        if (z) {
            long j2 = j + 1;
            HiHealthData hiHealthDataD = d(hiHealthData.getStartTime(), hiHealthData.getEndTime(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_BED_TIME.value(), j2);
            HiHealthData hiHealthDataD2 = d(hiHealthData.getStartTime(), hiHealthData.getEndTime(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_FALL_ASLEEP_TIME.value(), j2);
            kxe kxeVarD = kxe.d(e);
            kxeVarD.a(hiHealthDataD, hiHealthData.getClientId(), 0);
            kxeVarD.a(hiHealthDataD2, hiHealthData.getClientId(), 0);
            return;
        }
        long j3 = j - 1;
        HiHealthData hiHealthDataD3 = d(hiHealthData.getStartTime(), hiHealthData.getEndTime(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_RISING_TIME.value(), j3);
        HiHealthData hiHealthDataD4 = d(hiHealthData.getStartTime(), hiHealthData.getEndTime(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_WAKEUP_TIME.value(), j3);
        kxe kxeVarD2 = kxe.d(e);
        kxeVarD2.a(hiHealthDataD3, hiHealthData.getClientId(), 0);
        kxeVarD2.a(hiHealthDataD4, hiHealthData.getClientId(), 0);
    }

    private void b(List<HiHealthData> list) {
        lfz lfzVarD = lfz.d(e);
        lfzVarD.prepareRealTimeHealthDataStat(list);
        lfzVarD.doRealTimeHealthDataStat();
    }

    private void e(List<HiHealthData> list, List<Integer> list2) {
        HiHealthDataSessionMerge hiHealthDataSessionMerge = new HiHealthDataSessionMerge(e);
        if (HiCommonUtil.b(list)) {
            return;
        }
        for (HiHealthData hiHealthData : list) {
            hiHealthDataSessionMerge.merge(hiHealthData, hiHealthData.getClientId(), list2);
        }
    }

    private void a(List<HiHealthData> list, List<Integer> list2) {
        HiDataCoreSessionMerge hiDataCoreSessionMerge = new HiDataCoreSessionMerge(e);
        if (HiCommonUtil.b(list)) {
            return;
        }
        list.get(list.size() - 1).setLastDataFlag(true);
        for (HiHealthData hiHealthData : list) {
            hiDataCoreSessionMerge.merge(hiHealthData, hiHealthData.getClientId(), list2);
        }
    }

    public List<DataTimeDelCondition> b() {
        List<DataTimeDelCondition> listSubList;
        ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteCloudSleep mSleepTimeList=" + HiJsonUtil.d(this.d));
        ArrayList arrayList = new ArrayList(16);
        if (HiCommonUtil.b(this.d)) {
            return arrayList;
        }
        int size = this.d.size();
        int i = size / 10;
        for (int i2 = 0; i2 < i + 1; i2++) {
            if (i2 == i) {
                listSubList = this.d.subList(i2 * 10, size);
            } else {
                listSubList = this.d.subList(i2 * 10, (i2 + 1) * 10);
            }
            try {
                if (!e(listSubList)) {
                    arrayList.addAll(listSubList);
                }
            } catch (lif unused) {
                ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteCloudSleep SyncException=" + HiJsonUtil.d(listSubList));
                arrayList.addAll(listSubList);
            }
        }
        this.d.clear();
        return arrayList;
    }

    private boolean e(List<DataTimeDelCondition> list) throws lif {
        ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteCloudSleep deleteDataByTime=" + HiJsonUtil.d(list));
        int i = 0;
        while (i < 2) {
            if (liq.e(e, list)) {
                ReleaseLogUtil.d("HiH_HiHealthDataDeleteStore", "deleteCloudSleep OK !  dataTimeDelConditions = ", HiJsonUtil.d(list));
                break;
            }
            ReleaseLogUtil.e("HiH_HiHealthDataDeleteStore", "deleteCloudSleep failed dataTimeDelConditions = ", HiJsonUtil.d(list), " upLoadFailCount= ", Integer.valueOf(i));
            i++;
        }
        return i < 2;
    }

    private DataTimeDelCondition e(long j, long j2, int i) {
        DataTimeDelCondition dataTimeDelCondition = new DataTimeDelCondition();
        dataTimeDelCondition.setStartTime(Long.valueOf(j));
        dataTimeDelCondition.setEndTime(Long.valueOf(j2));
        dataTimeDelCondition.setType(Integer.valueOf(i));
        dataTimeDelCondition.setDeviceCode(0L);
        return dataTimeDelCondition;
    }
}
