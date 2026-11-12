package defpackage;

import android.os.RemoteException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IWearPhoneServiceAIDL;
import com.huawei.syncmgr.SyncStressDataApi;
import health.compact.a.EnvironmentUtils;

/* JADX INFO: loaded from: classes38.dex */
@ApiDefine(uri = SyncStressDataApi.class)
@Singleton
public class mia implements SyncStressDataApi {
    @Override // com.huawei.syncmgr.SyncStressDataApi
    public void syncStressDetailData() {
        if (EnvironmentUtils.e()) {
            mxz.d().e();
            return;
        }
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC == null) {
            LogUtil.j("SyncStressDataApiImpl", "startSyncWorkOut() iPhoneServiceAIDL is null");
            lug.e(BaseApplication.getContext());
            return;
        }
        try {
            iWearPhoneServiceAIDLC.notifyPhoneService("stressRelaxManager", null, 0, null);
        } catch (RemoteException e) {
            lug.e(BaseApplication.getContext());
            LogUtil.e("SyncStressDataApiImpl", "startSyncWorkOut exception:", ExceptionUtils.c(e));
        }
    }
}
