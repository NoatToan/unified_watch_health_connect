package defpackage;

import com.huawei.health.device.api.MultiUsersManagerApi;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwbasemgr.ResponseCallback;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = MultiUsersManagerApi.class)
public class fng implements MultiUsersManagerApi {
    @Override // com.huawei.health.device.api.MultiUsersManagerApi
    public dnj getCurrentUser() {
        LogUtil.a("MultiUsersManagerImpl", "getCurrentUser");
        return MultiUsersManager.INSTANCE.getCurrentUser();
    }

    @Override // com.huawei.health.device.api.MultiUsersManagerApi
    public void getCurrentUserForUserInfo(ResponseCallback<dnj> responseCallback) {
        LogUtil.a("MultiUsersManagerImpl", "getCurrentUserForUserInfo");
        MultiUsersManager.INSTANCE.getCurrentUserForUserInfo(responseCallback);
    }
}
