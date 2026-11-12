package defpackage;

import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwdevice.phoneprocess.mgr.threecircle.strategy.SyncStrategy;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class ndv implements SyncStrategy {
    @Override // com.huawei.hwdevice.phoneprocess.mgr.threecircle.strategy.SyncStrategy
    public boolean isNeedSync(DeviceInfo deviceInfo, long j) {
        if (!eey.d(deviceInfo, 154)) {
            return false;
        }
        long jE = ndu.e(SyncStrategy.KEY_INSERT_LAST_SYNC_TIME);
        if (BaseApplication.h()) {
            j = 1000;
        }
        if (!ScreenUtil.d()) {
            j = 180000;
        }
        return System.currentTimeMillis() - jE > j;
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.threecircle.strategy.SyncStrategy
    public List<HiHealthData> fetchData(final List<HiAggregateOption> list) {
        if (CollectionUtils.a(list)) {
            return new ArrayList(0);
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final ArrayList arrayList = new ArrayList();
        HiHealthNativeApi.a(BaseApplication.b()).aggregateHiHealthDataEx(list, new HiAggregateListenerEx() { // from class: ndv.4
            @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
            public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
                ReleaseLogUtil.d("DEVMGR_InsertSuccessSyncStrategy", "fetchData onResult() errCode=", Integer.valueOf(i));
                if (i != 0) {
                    return;
                }
                for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                    List<HiHealthData> listValueAt = sparseArray.valueAt(i3);
                    if (listValueAt != null) {
                        int iKeyAt = sparseArray.keyAt(i3);
                        int[] type = ((HiAggregateOption) list.get(iKeyAt)).getType();
                        LogUtil.a("DEVMGR_InsertSuccessSyncStrategy", "aggregateOptionsKeyIndex:", Integer.valueOf(iKeyAt), "type:", Arrays.toString(type));
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
                LogUtil.a("DEVMGR_InsertSuccessSyncStrategy", "fetchData onResult() result.size=", Integer.valueOf(sparseArray.size()));
                LogUtil.d("DEVMGR_InsertSuccessSyncStrategy", "fetchData onResult() result = ", HiJsonUtil.d(sparseArray));
            }
        });
        try {
            if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                ReleaseLogUtil.a("DEVMGR_InsertSuccessSyncStrategy", "fetchData() timeout");
            }
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a("DEVMGR_InsertSuccessSyncStrategy", "fetchData() interruptedException");
        }
        return new ArrayList(arrayList);
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.threecircle.strategy.SyncStrategy
    public List<eeh> preProcess(List<HiHealthData> list) {
        ReleaseLogUtil.d("DEVMGR_InsertSuccessSyncStrategy", npt.d("preProcessing rawDatas=", ndu.c(list)));
        ArrayList arrayList = new ArrayList();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                arrayList.addAll(transAggregateToRead(hiHealthData));
            }
        }
        return new ArrayList(ndu.b(arrayList, SyncStrategy.SRC_PKG_NAME, SyncStrategy.WEAR_PKG_NAME));
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.threecircle.strategy.SyncStrategy
    public void syncDataToDevice(DeviceInfo deviceInfo, List<eeh> list) {
        if (CollectionUtils.a(list)) {
            LogUtil.a("DEVMGR_InsertSuccessSyncStrategy", "syncDataToDevice() skipped sync by empty list");
            return;
        }
        int i = 0;
        for (eeh eehVar : list) {
            if (eehVar == null) {
                ReleaseLogUtil.a("DEVMGR_InsertSuccessSyncStrategy", "syncDataToDevice() onSending is empty");
            } else {
                LogUtil.d("DEVMGR_InsertSuccessSyncStrategy", "syncDataToDevice() onSending=", eehVar);
                if (!edc.e().sendSamplePointCommand(deviceInfo, eehVar, "DEVMGR_InsertSuccessSyncStrategy")) {
                    ReleaseLogUtil.a("DEVMGR_InsertSuccessSyncStrategy", "syncDataToDevice() send failed");
                    return;
                }
                i++;
            }
        }
        LogUtil.a("DEVMGR_InsertSuccessSyncStrategy", "syncDataToDevice() sent (", Integer.valueOf(i), ") samplePoints");
        if (i > 0) {
            ndu.b(SyncStrategy.KEY_INSERT_LAST_SYNC_TIME);
        }
    }
}
