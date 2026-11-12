package defpackage;

import android.os.RemoteException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IWearPhoneServiceAIDL;
import com.huawei.syncmgr.basicdata.BasicDataSyncApi;
import health.compact.a.EnvironmentUtils;

/* JADX INFO: loaded from: classes38.dex */
@ApiDefine(uri = BasicDataSyncApi.class)
@Singleton
public class mic implements BasicDataSyncApi {
    @Override // com.huawei.syncmgr.basicdata.BasicDataSyncApi
    public void startSynBasicData(IBaseResponseCallback iBaseResponseCallback) {
        if (EnvironmentUtils.e()) {
            mpg.d().a(true, (DeviceInfo) null, iBaseResponseCallback);
            return;
        }
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC == null) {
            LogUtil.j("SyncStressDataApiImpl", "startSyncWorkOut() iPhoneServiceAIDL is null");
            lug.e(BaseApplication.getContext());
            return;
        }
        try {
            iWearPhoneServiceAIDLC.notifyPhoneService("syncBasicData", new DeviceInfo(), 0, null);
        } catch (RemoteException e) {
            lug.e(BaseApplication.getContext());
            LogUtil.e("SyncStressDataApiImpl", "startSyncWorkOut exception:", ExceptionUtils.c(e));
        }
    }
}
