package defpackage;

import android.os.RemoteException;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwsyncmgr.periodrri.HwDevicePeriodRriFileManager;
import com.huawei.hwservicesmgr.IWearPhoneServiceAIDL;
import com.huawei.syncmgr.periodrri.PeriodRriSyncApi;
import health.compact.a.EnvironmentUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes38.dex */
@ApiDefine(uri = PeriodRriSyncApi.class)
@Singleton
public class mhz implements PeriodRriSyncApi {
    @Override // com.huawei.syncmgr.periodrri.PeriodRriSyncApi
    public void startSyncPeriodRriFile() {
        ReleaseLogUtil.d("BTSYNC_PeriodRri_PeriodRriSyncApiImpl", "startSyncPeriodRriFile() isPhoneServiceProcess:", Boolean.valueOf(EnvironmentUtils.e()));
        if (EnvironmentUtils.e()) {
            HwDevicePeriodRriFileManager.getInstance().getPeriodRriFileFromDevice();
            return;
        }
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC == null) {
            ReleaseLogUtil.e("BTSYNC_PeriodRri_PeriodRriSyncApiImpl", "startSyncPeriodRriFile() binder is null");
            lug.e(BaseApplication.getContext());
        } else {
            try {
                iWearPhoneServiceAIDLC.notifyPhoneService("syncPeriodRri", null, 0, null);
            } catch (RemoteException unused) {
                ReleaseLogUtil.a("BTSYNC_PeriodRri_PeriodRriSyncApiImpl", "startSyncPeriodRriFile() RemoteException");
            }
        }
    }

    @Override // com.huawei.syncmgr.periodrri.PeriodRriSyncApi
    public boolean isPeriodRriSyncing() {
        ReleaseLogUtil.d("BTSYNC_PeriodRri_PeriodRriSyncApiImpl", "isPeriodRriSyncing() isPhoneServiceProcess:", Boolean.valueOf(EnvironmentUtils.e()));
        if (EnvironmentUtils.e()) {
            return HwDevicePeriodRriFileManager.getInstance().isPeriodRriSyncing();
        }
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC != null) {
            try {
                return iWearPhoneServiceAIDLC.notifyPhoneService("isPeriodRriSyncing", null, 230227, null);
            } catch (RemoteException unused) {
                ReleaseLogUtil.a("BTSYNC_PeriodRri_PeriodRriSyncApiImpl", "isPeriodRriSyncing() RemoteException");
                return false;
            }
        }
        ReleaseLogUtil.e("BTSYNC_PeriodRri_PeriodRriSyncApiImpl", "isPeriodRriSyncing() binder is null");
        lug.e(BaseApplication.getContext());
        return false;
    }
}
