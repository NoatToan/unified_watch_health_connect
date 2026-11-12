package defpackage;

import android.os.RemoteException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IWearPhoneServiceAIDL;
import com.huawei.syncmgr.workout.WorkOutSyncApi;
import health.compact.a.EnvironmentUtils;

/* JADX INFO: loaded from: classes38.dex */
@ApiDefine(uri = WorkOutSyncApi.class)
@Singleton
public class mid implements WorkOutSyncApi {
    @Override // com.huawei.syncmgr.workout.WorkOutSyncApi
    public void startSynWorkOut() {
        if (EnvironmentUtils.e()) {
            LogUtil.a("SyncWorkOutApiImpl", "startSyncWorkOut() syncDeviceWorkoutRecordInfo ");
            HwExerciseAdviceManager.getInstance().syncDeviceWorkoutRecordInfo();
            return;
        }
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC != null) {
            try {
                iWearPhoneServiceAIDLC.notifyPhoneService("syncWorkOutData", new DeviceInfo(), 0, null);
                return;
            } catch (RemoteException e) {
                lug.e(BaseApplication.getContext());
                LogUtil.e("SyncWorkOutApiImpl", "startSyncWorkOut exception:", ExceptionUtils.c(e));
                return;
            }
        }
        LogUtil.j("SyncWorkOutApiImpl", "startSyncWorkOut() iPhoneServiceAIDL is null");
        lug.e(BaseApplication.getContext());
    }
}
