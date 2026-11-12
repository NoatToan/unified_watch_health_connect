package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public class ndm {
    private final BroadcastReceiver e;
    private static final Map<String, Set<Integer>> d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42948c = new Object();

    private ndm() {
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: ndm.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (ndm.d.isEmpty()) {
                    LogUtil.a("DEVMGR_ThreeCircleReSyncMgr", "CloudSyncListener SubscribeMap empty, receive content ignored");
                    return;
                }
                if (intent == null) {
                    LogUtil.a("DEVMGR_ThreeCircleReSyncMgr", "CloudSyncListener Intent empty, receive content ignored");
                    return;
                }
                int intExtra = intent.getIntExtra("com.huawei.hihealth.action_sync_status", 6);
                LogUtil.a("DEVMGR_ThreeCircleReSyncMgr", "CloudSyncListener Action = ", intent.getAction(), ", Status=", Integer.valueOf(intExtra));
                if (2 != intExtra) {
                    return;
                }
                LogUtil.a("DEVMGR_ThreeCircleReSyncMgr", "CloudSyncListener ReSync trigger by cloudSync finish");
                ndm.this.d(myk.b("DEVMGR_ThreeCircleReSyncMgr"));
            }
        };
        this.e = broadcastReceiver;
        BroadcastManagerUtil.d(BaseApplication.b(), broadcastReceiver, new IntentFilter("com.huawei.hihealth.action_sync"), LocalBroadcast.f36595c, null);
    }

    public static ndm b() {
        return b.e;
    }

    static class b {
        private static final ndm e = new ndm();
    }

    public void b(final DeviceInfo deviceInfo) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: ndt
            @Override // java.lang.Runnable
            public final void run() {
                this.f42962a.a(deviceInfo);
            }
        });
    }

    /* synthetic */ void a(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceConnectState() == 2) {
            e(deviceInfo);
            c(deviceInfo);
            ReleaseLogUtil.d("DEVMGR_ThreeCircleReSyncMgr", "processByConnectState() reSync, subscribe and register by device connect");
        } else {
            h(deviceInfo);
            ReleaseLogUtil.d("DEVMGR_ThreeCircleReSyncMgr", "processByConnectState() unsubscribe and unregister by device disconnect, state=", Integer.valueOf(deviceInfo.getDeviceConnectState()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo) {
        e(deviceInfo, 60000L);
    }

    private void e(DeviceInfo deviceInfo) {
        e(deviceInfo, 1800000L);
    }

    private void e(DeviceInfo deviceInfo, long j) {
        ndy ndyVar = new ndy();
        if (ndyVar.isNeedSync(deviceInfo, j)) {
            ArrayList arrayList = new ArrayList();
            long jCurrentTimeMillis = System.currentTimeMillis();
            b(arrayList, jCurrentTimeMillis);
            b(arrayList, lsl.u(jCurrentTimeMillis));
            long jC = lsl.c(jCurrentTimeMillis, -6);
            long jE = ndu.e(jCurrentTimeMillis, 86400000L);
            DeviceFeatureSupportApi deviceFeatureSupportApi = (DeviceFeatureSupportApi) Services.d("Module_Device_Feature", DeviceFeatureSupportApi.class);
            if (deviceFeatureSupportApi != null && deviceFeatureSupportApi.isSupportWheelchair(deviceInfo)) {
                int length = ndu.c().length;
                int[] iArr = new int[length + 1];
                System.arraycopy(ndu.c(), 0, iArr, 0, ndu.c().length);
                iArr[length] = 40008;
                arrayList.add(a(iArr, jC, jE, 1, 86400000L));
            } else {
                arrayList.add(a(ndu.c(), jC, jE, 1, 86400000L));
            }
            if (deviceFeatureSupportApi != 0 && deviceFeatureSupportApi.isSupportMicroWorkout(deviceInfo)) {
                arrayList.add(a(ndu.a(), jC, jE, 1, 86400000L));
            }
            int length2 = ndu.e().length;
            int[] iArr2 = new int[length2 + 1];
            System.arraycopy(ndu.e(), 0, iArr2, r8, ndu.e().length);
            iArr2[length2] = DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value();
            arrayList.add(a(iArr2, jC, jE, 1, 86400000L));
            ndyVar.syncDataToDevice(deviceInfo, ndyVar.preProcess(ndyVar.fetchData(arrayList)));
        }
    }

    private void c(DeviceInfo deviceInfo) {
        if (!eey.d(deviceInfo, 154)) {
            ReleaseLogUtil.e("DEVMGR_ThreeCircleReSyncMgr", "subscribeThreeCircleData() failed: device capability NOT support");
            return;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(Integer.valueOf(DicDataTypeUtil.DataType.ACTIVE_HOUR.value()), Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA.value()), 1));
        DeviceFeatureSupportApi deviceFeatureSupportApi = (DeviceFeatureSupportApi) Services.d("Module_Device_Feature", DeviceFeatureSupportApi.class);
        if (deviceFeatureSupportApi != null && deviceFeatureSupportApi.isSupportWheelchair(deviceInfo)) {
            arrayList.add(40008);
        }
        if (deviceFeatureSupportApi != null && deviceFeatureSupportApi.isSupportMicroWorkout(deviceInfo)) {
            arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.MICRO_WORKOUT.value()));
        }
        ReleaseLogUtil.d("DEVMGR_ThreeCircleReSyncMgr", "subscribeThreeCircleData() enter");
        HiHealthNativeApi.a(BaseApplication.b()).subscribeHiHealthData(arrayList, new c(deviceInfo.getDeviceIdentify()));
    }

    private void h(DeviceInfo deviceInfo) {
        if (!eey.d(deviceInfo, 154)) {
            LogUtil.j("DEVMGR_ThreeCircleReSyncMgr", "unsubscribeThreeCircleData() failed: device capability NOT support");
            return;
        }
        final String deviceIdentify = deviceInfo.getDeviceIdentify();
        Set<Integer> setB = b(deviceIdentify);
        if (TextUtils.isEmpty(deviceIdentify) || setB == null) {
            LogUtil.j("DEVMGR_ThreeCircleReSyncMgr", "unsubscribeThreeCircleData() failed, device has NOT subscribe");
        } else {
            ReleaseLogUtil.d("DEVMGR_ThreeCircleReSyncMgr", "unsubscribeThreeCircleData() enter");
            HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(new ArrayList(setB), new HiUnSubscribeListener() { // from class: nds
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    this.f42961b.b(deviceIdentify, z);
                }
            });
        }
    }

    /* synthetic */ void b(String str, boolean z) {
        ReleaseLogUtil.d("DEVMGR_ThreeCircleReSyncMgr", "unsubscribeThreeCircleData onResult() ", Boolean.valueOf(z));
        if (z) {
            a(str, (Collection<Integer>) null);
        }
    }

    private Set<Integer> b(String str) {
        Set<Integer> set;
        synchronized (f42948c) {
            set = d.get(str);
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Collection<Integer> collection) {
        synchronized (f42948c) {
            try {
                if (collection == null) {
                    d.remove(str);
                    return;
                }
                Map<String, Set<Integer>> map = d;
                Set<Integer> set = map.get(str);
                if (set == null) {
                    map.put(str, new HashSet(collection));
                } else {
                    set.addAll(collection);
                    map.put(str, set);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(List<HiAggregateOption> list, long j) {
        long jA = ndu.a(j, 86400000L);
        long jE = ndu.e(j, 86400000L);
        list.add(a(new int[]{7}, jA, jE, 2, 1800000L));
        list.add(a(ndu.b(), jA, jE, 1, 1800000L));
        list.add(a(new int[]{DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value()}, jA, jE, 1, 3600000L));
    }

    private HiAggregateOption a(int[] iArr, long j, long j2, int i, long j3) {
        String str;
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(iArr);
        hiAggregateOption.setTimeInterval(j, j2);
        hiAggregateOption.setAggregateType(i);
        if (j3 == 86400000) {
            hiAggregateOption.setGroupUnitType(3);
            str = "WriteBackKey_DAY_";
        } else if (j3 == 3600000) {
            hiAggregateOption.setGroupUnitType(2);
            str = "WriteBackKey_HOUR_";
        } else if (j3 == 1800000) {
            hiAggregateOption.setGroupUnitType(1);
            hiAggregateOption.setGroupUnitSize(30);
            str = "WriteBackKey_HALFHOUR_";
        } else {
            return new HiAggregateOption();
        }
        String[] strArr = new String[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            strArr[i2] = str + iArr[i2];
        }
        hiAggregateOption.setConstantsKey(strArr);
        return hiAggregateOption;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DeviceInfo c(String str) {
        DeviceInfo deviceInfoB;
        if (TextUtils.isEmpty(str) || (deviceInfoB = myk.b("DEVMGR_ThreeCircleReSyncMgr")) == null || !str.equals(deviceInfoB.getDeviceIdentify())) {
            return null;
        }
        return deviceInfoB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long d(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return 0L;
        }
        try {
            return new JSONArray(hiHealthData.getChangeDataInfos()).getJSONObject(0).getLong("start_time");
        } catch (JSONException unused) {
            health.compact.a.util.LogUtil.c("DEVMGR_ThreeCircleReSyncMgr", "getSubscribeStartTime JSONException");
            return 0L;
        }
    }

    class c implements HiSubscribeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f42949b;

        c(String str) {
            this.f42949b = str;
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            LogUtil.a("DEVMGR_ThreeCircleReSyncMgr", "SubscribeDataListener onResult() successList=", HiJsonUtil.d(list), ", failList.size=", HiJsonUtil.d(list2));
            if (njy.e(list)) {
                return;
            }
            ndm.this.a(this.f42949b, list);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(final int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            final long jD = ndm.this.d(hiHealthData);
            if (jD <= 0) {
                LogUtil.j("DEVMGR_ThreeCircleReSyncMgr", "data onChange from cloud.");
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: ndr
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f42959a.e(i, jD);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void e(int i, long j) {
            List<HiAggregateOption> listA;
            ndv ndvVar = new ndv();
            DeviceInfo deviceInfoC = ndm.c(this.f42949b);
            if (ndvVar.isNeedSync(deviceInfoC, 60000L) && (listA = ndm.this.a(i, j, deviceInfoC)) != null) {
                ndvVar.syncDataToDevice(deviceInfoC, ndvVar.preProcess(ndvVar.fetchData(listA)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HiAggregateOption> a(int i, long j, DeviceInfo deviceInfo) {
        String str;
        ArrayList arrayList = new ArrayList(4);
        long jA = ndu.a(j, 3600000L);
        long jE = ndu.e(j, 3600000L);
        long jA2 = ndu.a(j, 86400000L);
        long jE2 = ndu.e(j, 86400000L);
        if (i != 1) {
            str = "DEVMGR_ThreeCircleReSyncMgr";
            if (i == DicDataTypeUtil.DataType.ACTIVE_HOUR.value()) {
                arrayList.add(a(new int[]{DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value()}, jA, jE, 1, 3600000L));
                arrayList.add(a(ndu.c(), jA2, jE2, 1, 86400000L));
                arrayList.add(a(new int[]{DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value()}, jA2, jE2, 1, 86400000L));
                LogUtil.a(str, "SubscribeDataListener onChange() activeHour");
            } else {
                if (i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA.value()) {
                    arrayList.add(a(ndu.e(), jA2, jE2, 1, 86400000L));
                    LogUtil.a(str, "SubscribeDataListener onChange() threeCircle");
                    return arrayList;
                }
                if (i == 40008) {
                    arrayList.add(a(ndu.c(), jA2, jE2, 1, 86400000L));
                    arrayList.add(a(new int[]{DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value()}, jA2, jE2, 1, 86400000L));
                    LogUtil.a(str, "SubscribeDataListener onChange() STAT_SPORT_PUSHES_SUM");
                } else {
                    if (i != DicDataTypeUtil.DataType.MICRO_WORKOUT.value()) {
                        return null;
                    }
                    arrayList.add(a(ndu.c(), jA2, jE2, 1, 86400000L));
                    arrayList.add(a(new int[]{DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value()}, jA2, jE2, 1, 86400000L));
                    LogUtil.a(str, "SubscribeDataListener onChange() STAT_SPORT_MICRO_EXERCISE_SUM");
                }
            }
        } else {
            long jA3 = ndu.a(j, 1800000L);
            long jE3 = ndu.e(j, 1800000L);
            arrayList.add(a(new int[]{7}, jA3, jE3, 2, 1800000L));
            arrayList.add(a(ndu.b(), jA3, jE3, 1, 1800000L));
            str = "DEVMGR_ThreeCircleReSyncMgr";
            arrayList.add(a(new int[]{DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value()}, jA, jE, 1, 3600000L));
            arrayList.add(a(ndu.c(), jA2, jE2, 1, 86400000L));
            arrayList.add(a(new int[]{DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value()}, jA2, jE2, 1, 86400000L));
            LogUtil.a(str, "SubscribeDataListener onChange() sportData");
        }
        DeviceFeatureSupportApi deviceFeatureSupportApi = (DeviceFeatureSupportApi) Services.d("Module_Device_Feature", DeviceFeatureSupportApi.class);
        if (deviceFeatureSupportApi != null && deviceFeatureSupportApi.isSupportWheelchair(deviceInfo)) {
            LogUtil.a(str, "SubscribeDataListener onChange() STAT_SPORT_PUSHES_SUM add");
            arrayList.add(a(new int[]{40008}, jA2, jE2, 1, 86400000L));
        }
        if (deviceFeatureSupportApi != null && deviceFeatureSupportApi.isSupportMicroWorkout(deviceInfo)) {
            LogUtil.a(str, "SubscribeDataListener onChange() STAT_SPORT_MICRO_WORKOUT_SUM add");
            arrayList.add(a(ndu.a(), jA2, jE2, 1, 86400000L));
        }
        return arrayList;
    }
}
