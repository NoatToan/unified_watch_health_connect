package defpackage;

import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwdevice.phoneprocess.mgr.threecircle.strategy.SyncStrategy;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class ndy implements SyncStrategy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f42969c;

    @Override // com.huawei.hwdevice.phoneprocess.mgr.threecircle.strategy.SyncStrategy
    public boolean isNeedSync(DeviceInfo deviceInfo, long j) {
        if (!eey.d(deviceInfo, 154)) {
            return false;
        }
        this.f42969c = j;
        return System.currentTimeMillis() - ndu.e(a(j)) > j;
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.threecircle.strategy.SyncStrategy
    public List<HiHealthData> fetchData(final List<HiAggregateOption> list) {
        if (CollectionUtils.a(list)) {
            return new ArrayList(0);
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final ArrayList arrayList = new ArrayList();
        HiHealthNativeApi.a(BaseApplication.b()).aggregateHiHealthDataEx(list, new HiAggregateListenerEx() { // from class: ndy.5
            @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
            public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
                ReleaseLogUtil.d("DEVMGR_ReconnectSuccessSyncStrategy", "fetchData onResult() errCode=", Integer.valueOf(i));
                if (i != 0) {
                    return;
                }
                for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                    List<HiHealthData> listValueAt = sparseArray.valueAt(i3);
                    if (listValueAt != null) {
                        int iKeyAt = sparseArray.keyAt(i3);
                        int[] type = ((HiAggregateOption) list.get(iKeyAt)).getType();
                        LogUtil.a("DEVMGR_ReconnectSuccessSyncStrategy", "aggregateOptionsKeyIndex:", Integer.valueOf(iKeyAt), "type:", Arrays.toString(type));
                        if (type != null && type.length > 0) {
                            if (ndu.a(type[0])) {
                                Iterator<HiHealthData> it = listValueAt.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(ndu.c(it.next()));
                                }
                            } else {
                                arrayList.addAll(listValueAt);
                            }
                        }
                    }
                }
                countDownLatch.countDown();
                LogUtil.a("DEVMGR_ReconnectSuccessSyncStrategy", "fetchData onResult() result.size=", Integer.valueOf(sparseArray.size()));
                LogUtil.d("DEVMGR_ReconnectSuccessSyncStrategy", "fetchData onResult() result = ", HiJsonUtil.d(sparseArray));
            }
        });
        try {
            if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                ReleaseLogUtil.a("DEVMGR_ReconnectSuccessSyncStrategy", "fetchData() timeout");
            }
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a("DEVMGR_ReconnectSuccessSyncStrategy", "fetchData() interruptedException");
        }
        return new ArrayList(arrayList);
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.threecircle.strategy.SyncStrategy
    public List<eeh> preProcess(List<HiHealthData> list) {
        ReleaseLogUtil.d("DEVMGR_ReconnectSuccessSyncStrategy", npt.d("preProcessing rawDatas=", ndu.c(list)));
        ArrayList arrayList = new ArrayList();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                arrayList.addAll(transAggregateToRead(hiHealthData));
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        eeh eehVarA = a(arrayList, jCurrentTimeMillis);
        eeh eehVarA2 = a(arrayList, jCurrentTimeMillis - 86400000);
        ArrayList arrayList2 = new ArrayList(ndu.b(arrayList, SyncStrategy.SRC_PKG_NAME, SyncStrategy.WEAR_PKG_NAME));
        arrayList2.add(eehVarA);
        arrayList2.add(eehVarA2);
        return arrayList2;
    }

    private eeh a(List<HiHealthData> list, long j) {
        HashSet hashSet = new HashSet(16);
        ArrayList arrayList = new ArrayList(10);
        long jA = ndu.a(j, 86400000L);
        b(jA, list, hashSet, arrayList);
        d(jA, j, hashSet, arrayList);
        ArrayList<eeh> arrayList2 = new ArrayList(ndu.b(arrayList, SyncStrategy.SRC_PKG_NAME, SyncStrategy.WEAR_PKG_NAME));
        Collections.sort(arrayList2, new Comparator() { // from class: ndz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((eeh) obj).d(), ((eeh) obj2).d());
            }
        });
        LogUtil.a("DEVMGR_ReconnectSuccessSyncStrategy", "extractTodayHalfHourDataWithSort() after sort.size=", Integer.valueOf(arrayList2.size()));
        eeh eehVar = null;
        for (eeh eehVar2 : arrayList2) {
            if (eehVar == null) {
                eehVar = eehVar2;
            } else {
                List<eed> listB = eehVar2.b();
                if (listB != null) {
                    eehVar.b().addAll(listB);
                }
            }
        }
        if (eehVar == null) {
            return null;
        }
        eehVar.d(DicDataTypeUtil.DataType.DAILY_ACTIVITY_RECORD.value());
        eehVar.c(ndu.e(jA));
        eehVar.a(ndu.e(ndu.e(j, 86400000L)));
        LogUtil.a("DEVMGR_ReconnectSuccessSyncStrategy", "extractTodayHalfHourDataWithSort() after construct.size=", Integer.valueOf(eehVar.b() == null ? 0 : eehVar.b().size()));
        LogUtil.d("DEVMGR_ReconnectSuccessSyncStrategy", "extractTodayHalfHourDataWithSort() after construct=", HiJsonUtil.d(eehVar));
        return eehVar;
    }

    private void b(long j, List<HiHealthData> list, Set<String> set, List<HiHealthData> list2) {
        ArrayList arrayList = new ArrayList(ndu.d().length);
        for (int i : ndu.d()) {
            arrayList.add(Integer.valueOf(i));
        }
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            HiHealthData next = it.next();
            if (next.getEndTime() - next.getStartTime() <= 1800000 && next.getStartTime() >= j && arrayList.contains(Integer.valueOf(next.getType()))) {
                list2.add(next);
                set.add(ndu.a(next.getStartTime(), 1800000L) + "_" + next.getType());
                it.remove();
            }
        }
        LogUtil.a("DEVMGR_ReconnectSuccessSyncStrategy", "extractTodayHalfHourDataWithSort() after removal.size=", Integer.valueOf(list2.size()));
    }

    private void d(long j, long j2, Set<String> set, List<HiHealthData> list) {
        while (j < ndu.e(j2, 86400000L)) {
            for (int i : ndu.d()) {
                if (!set.contains(j + "_" + i)) {
                    HiHealthData hiHealthData = new HiHealthData(i);
                    hiHealthData.setValue(0);
                    hiHealthData.setTimeInterval(j, 1800000 + j);
                    list.add(hiHealthData);
                }
            }
            j += 1800000;
        }
        LogUtil.a("DEVMGR_ReconnectSuccessSyncStrategy", "extractTodayHalfHourDataWithSort() after fill.size=", Integer.valueOf(list.size()));
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.threecircle.strategy.SyncStrategy
    public void syncDataToDevice(DeviceInfo deviceInfo, List<eeh> list) {
        if (CollectionUtils.a(list)) {
            LogUtil.a("DEVMGR_ReconnectSuccessSyncStrategy", "syncDataToDevice() skipped sync by empty list");
            return;
        }
        int i = 0;
        for (eeh eehVar : list) {
            LogUtil.d("DEVMGR_ReconnectSuccessSyncStrategy", "syncDataToDevice() onSending=", eehVar);
            if (!edc.e().sendSamplePointCommand(deviceInfo, eehVar, "DEVMGR_ReconnectSuccessSyncStrategy")) {
                ReleaseLogUtil.a("DEVMGR_ReconnectSuccessSyncStrategy", "syncDataToDevice() send failed");
                return;
            }
            i++;
        }
        LogUtil.a("DEVMGR_ReconnectSuccessSyncStrategy", "syncDataToDevice() sent (", Integer.valueOf(i), ") samplePoints");
        if (i > 0) {
            ndu.b(a(this.f42969c));
        }
    }

    private String a(long j) {
        if (j == 60000) {
            return SyncStrategy.KEY_CLOUD_LAST_SYNC_TIME;
        }
        return SyncStrategy.SP_KEY_RECONNECT_LAST_SYNC_TIME;
    }
}
