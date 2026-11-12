package defpackage;

import android.bluetooth.BluetoothAdapter;
import com.google.gson.Gson;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.device.model.OperatorStatus;
import com.huawei.health.healthlinkage.api.HWhealthLinkageApi;
import com.huawei.health.versionmgr.api.VersionMgrApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes7.dex */
public final class deo {
    public static boolean c() {
        boolean zIsEnabled = BluetoothAdapter.getDefaultAdapter() != null ? BluetoothAdapter.getDefaultAdapter().isEnabled() : false;
        boolean zE = iem.e(BaseApplication.b(), zIsEnabled);
        boolean zE2 = iem.e(BaseApplication.b());
        VersionMgrApi versionMgrApi = (VersionMgrApi) Services.d("HWVersionMgr", VersionMgrApi.class);
        boolean bandOtaStatus = versionMgrApi != null ? versionMgrApi.getBandOtaStatus(BaseApplication.b().getApplicationContext()) : false;
        ReleaseLogUtil.d("HWhealthLinkage_SportDeviceUtils", "isBlueToothEnable:", Boolean.valueOf(zIsEnabled), " isConnectHeartRateDevice:", Boolean.valueOf(zE), " isIndependentSportDevice:", Boolean.valueOf(zE2), " isUpdating:", Boolean.valueOf(bandOtaStatus));
        return zE && zE2 && !bandOtaStatus;
    }

    public static void c(final IBaseResponseCallback iBaseResponseCallback) {
        HWhealthLinkageApi hWhealthLinkageApi = (HWhealthLinkageApi) Services.d("HWhealthLinkage", HWhealthLinkageApi.class);
        if (iBaseResponseCallback == null || hWhealthLinkageApi == null || hWhealthLinkageApi.isMediatorExist()) {
            ReleaseLogUtil.d("HWhealthLinkage_SportDeviceUtils", "getDeviceBusyStatus with error params.");
        } else {
            pqm.a().e(new IBaseResponseCallback() { // from class: deq
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    deo.b(iBaseResponseCallback, i, obj);
                }
            });
        }
    }

    static /* synthetic */ void b(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        if (i == 100000 && obj != null) {
            OperatorStatus operatorStatus = (OperatorStatus) new Gson().fromJson(CommonUtil.ac((String) obj), OperatorStatus.class);
            iBaseResponseCallback.a(100000, Integer.valueOf(operatorStatus.getTrainMonitorState()));
            ReleaseLogUtil.d("HWhealthLinkage_SportDeviceUtils", "getDeviceBusyStatus :", Integer.valueOf(operatorStatus.getTrainMonitorState()));
        } else {
            iBaseResponseCallback.a(i, -1);
            ReleaseLogUtil.d("HWhealthLinkage_SportDeviceUtils", "getDeviceBusyStatus failed with errorCode:", Integer.valueOf(i));
        }
    }
}
