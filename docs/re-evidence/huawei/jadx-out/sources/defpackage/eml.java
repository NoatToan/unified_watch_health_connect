package defpackage;

import android.content.Context;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hihealth.data.type.HiSyncType;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes7.dex */
public class eml {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<HealthDevice.HealthDeviceKind, Integer> f33193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f33194c;
    private final Map<Integer, Integer> e;

    private eml() {
        int i = 4;
        this.f33193b = new HashMap<HealthDevice.HealthDeviceKind, Integer>(i) { // from class: eml.3
            {
                put(HealthDevice.HealthDeviceKind.HDK_BLOOD_PRESSURE, 5);
                put(HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR, 4);
                put(HealthDevice.HealthDeviceKind.HDK_WEIGHT, Integer.valueOf(HiSyncType.HiSyncDataType.f12263a));
            }
        };
        this.e = new HashMap<Integer, Integer>(i) { // from class: eml.5
            {
                put(5, Integer.valueOf(HiSubscribeType.f12261c));
                put(4, Integer.valueOf(HiSubscribeType.f12260b));
                put(Integer.valueOf(HiSyncType.HiSyncDataType.f12263a), Integer.valueOf(HiSubscribeType.f12259a));
                put(20000, 200);
            }
        };
        this.f33194c = BaseApplication.getContext();
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final eml f33199a = new eml();
    }

    public static eml b() {
        return c.f33199a;
    }

    public void b(HealthDevice.HealthDeviceKind healthDeviceKind, IBaseResponseCallback iBaseResponseCallback) {
        d(healthDeviceKind, false, iBaseResponseCallback);
    }

    public void d(HealthDevice.HealthDeviceKind healthDeviceKind, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        e(this.f33193b.get(healthDeviceKind) == null ? 20000 : this.f33193b.get(healthDeviceKind).intValue(), z, iBaseResponseCallback);
    }

    public void e(int i, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("DEVMGR_SyncCloudManager", "synCloud dataType：", Integer.valueOf(i));
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("DEVMGR_SyncCloudManager", "syncCloud callback is null!");
            return;
        }
        if (!this.e.containsKey(Integer.valueOf(i))) {
            ReleaseLogUtil.e("DEVMGR_SyncCloudManager", "dataType undefined!");
            iBaseResponseCallback.a(2, null);
        } else if (Utils.m()) {
            ReleaseLogUtil.e("DEVMGR_SyncCloudManager", "syncCloud isNoCloudVersion = true");
            iBaseResponseCallback.a(Integer.parseInt(BleConstants.ERRCODE_COMMON_ERR), null);
        } else if (!CommonUtil.ab(this.f33194c)) {
            ReleaseLogUtil.e("DEVMGR_SyncCloudManager", "syncCloud network error!");
            iBaseResponseCallback.a(Integer.parseInt(BleConstants.ERRCODE_COMMON_ERR), null);
        } else {
            a(this.e.get(Integer.valueOf(i)).intValue(), iBaseResponseCallback);
            e(i, z);
        }
    }

    private void e(int i, boolean z) {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setForceSync(z);
        hiSyncOption.setSyncDataType(i);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(dxw.d()).synCloud(hiSyncOption, new HiCommonListener() { // from class: eml.4
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i2, Object obj) {
                LogUtil.a("SyncCloudManager", "syncCloud onSuccess");
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i2, Object obj) {
                LogUtil.a("SyncCloudManager", "syncCloud onFailure errCode: ", Integer.valueOf(i2));
            }
        });
    }

    private void a(final int i, final IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(Integer.valueOf(i));
        HiHealthNativeApi.a(this.f33194c).subscribeHiHealthData(arrayList, new HiSubscribeListener() { // from class: eml.1
            private List<Integer> d;
            private Timer e;

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onResult(List<Integer> list, List<Integer> list2) {
                ReleaseLogUtil.d("DEVMGR_SyncCloudManager", "subscribeData, onResult");
                if (list == null) {
                    list = list2;
                }
                this.d = list;
                TimerTask timerTask = new TimerTask() { // from class: eml.1.2
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        eml.this.b(AnonymousClass1.this.d);
                        LogUtil.a("SyncCloudManager", "timeout, type = ", Integer.valueOf(i));
                        iBaseResponseCallback.a(Integer.parseInt(BleConstants.ERRCODE_TIMEOUT), Integer.valueOf(i));
                        AnonymousClass1.this.e.cancel();
                    }
                };
                Timer timer = new Timer("SyncCloudManager");
                this.e = timer;
                timer.schedule(timerTask, 12000L);
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onChange(int i2, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
                this.e.cancel();
                ReleaseLogUtil.d("DEVMGR_SyncCloudManager", "subscribeData onChange, type = ", Integer.valueOf(i2));
                iBaseResponseCallback.a(Integer.parseInt("0"), Integer.valueOf(i2));
                eml.this.b(this.d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<Integer> list) {
        if (list == null) {
            return;
        }
        HiHealthNativeApi.a(this.f33194c).unSubscribeHiHealthData(list, new HiUnSubscribeListener() { // from class: eml.2
            @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
            public void onResult(boolean z) {
                LogUtil.a("SyncCloudManager", "unSubscribeData onResult isSuccess = ", Boolean.valueOf(z));
            }
        });
    }
}
