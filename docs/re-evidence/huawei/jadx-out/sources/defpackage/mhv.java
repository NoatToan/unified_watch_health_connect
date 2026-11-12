package defpackage;

import android.os.RemoteException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.hwservicesmgr.IWearPhoneServiceAIDL;
import com.huawei.syncmgr.SyncOption;
import com.huawei.syncmgr.coresleep.CoreSleepSyncApi;
import health.compact.a.EnvironmentUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes38.dex */
@ApiDefine(uri = CoreSleepSyncApi.class)
@Singleton
public class mhv implements CoreSleepSyncApi {
    @Override // com.huawei.syncmgr.coresleep.CoreSleepSyncApi
    public void startSynCoreSleep(SyncOption syncOption, final IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepSyncApiImpl", "startSynCoreSleep isphoneserviceprocess is ", Boolean.valueOf(EnvironmentUtils.e()));
        if (EnvironmentUtils.e()) {
            ltm.c(myl.b()).d(syncOption, iBaseResponseCallback);
            return;
        }
        try {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC == null) {
                ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepSyncApiImpl", "startSynCoreSleep iPhoneServiceAIDL is null");
                lug.e(BaseApplication.getContext());
            } else {
                iWearPhoneServiceAIDLC.starSycnCoreSleep(syncOption, new IBaseCallback.Stub() { // from class: mhv.3
                    @Override // com.huawei.hwservicesmgr.IBaseCallback
                    public void onResponse(int i, String str) {
                        LogUtil.d("CoreSleepSyncApiImpl", "startSynCoreSleep code is ", Integer.valueOf(i), " reason is ", str);
                        iBaseResponseCallback.a(i, str);
                    }
                });
            }
        } catch (RemoteException e) {
            ReleaseLogUtil.a("BTSYNC_CoreSleep_CoreSleepSyncApiImpl", "startSynCoreSleep RemoteException ", ExceptionUtils.c(e));
        }
    }

    @Override // com.huawei.syncmgr.coresleep.CoreSleepSyncApi
    public boolean isSyncing() {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepSyncApiImpl", "start isSyncing");
        if (EnvironmentUtils.e()) {
            return ltm.c(myl.b()).g();
        }
        try {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC != null) {
                return iWearPhoneServiceAIDLC.isCoreSleepSyncing();
            }
            ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepSyncApiImpl", "isSyncing iPhoneServiceAIDL is null");
            lug.e(BaseApplication.getContext());
            return false;
        } catch (RemoteException e) {
            ReleaseLogUtil.a("BTSYNC_CoreSleep_CoreSleepSyncApiImpl", "isSyncing RemoteException ", ExceptionUtils.c(e));
            return false;
        }
    }

    @Override // com.huawei.syncmgr.coresleep.CoreSleepSyncApi
    public void registerProgressListener(final IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepSyncApiImpl", "registerProgressListener, callback=", iBaseResponseCallback);
        if (EnvironmentUtils.e()) {
            ltm.c(myl.b()).c(iBaseResponseCallback);
            return;
        }
        try {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC != null) {
                iWearPhoneServiceAIDLC.registerCoreSleepProgressListener(new IBaseCallback.Stub() { // from class: mhv.4
                    @Override // com.huawei.hwservicesmgr.IBaseCallback
                    public void onResponse(int i, String str) {
                        LogUtil.d("CoreSleepSyncApiImpl", "registerProgressListener code is ", Integer.valueOf(i), "  reason is ", str);
                        iBaseResponseCallback.a(i, str);
                    }
                });
            } else {
                ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepSyncApiImpl", "registerProgressListener iPhoneServiceAIDL is null");
                lug.e(BaseApplication.getContext());
            }
        } catch (RemoteException e) {
            ReleaseLogUtil.a("BTSYNC_CoreSleep_CoreSleepSyncApiImpl", "registerProgressListener RemoteException ", ExceptionUtils.c(e));
        }
    }
}
