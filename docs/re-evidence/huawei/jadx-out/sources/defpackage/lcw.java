package defpackage;

import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hihealthservice.hihealthkit.cpcheck.BaseRequest;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.GRSManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lcw<T> extends BaseRequest<T> {
    public lcw(String str) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        ReleaseLogUtil.d("R_AppInfoRequest", "AppInfoRequest site: ", accountInfo);
        this.mUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl(HealthEngineRequestManager.GRS_KEY, "com.huawei.health" + lcz.f39935a, accountInfo) + "/healthkit/v1/appInfos";
        if (!this.mUrl.startsWith("https://") && Utils.b(BaseApplication.getContext())) {
            StringBuilder sb = new StringBuilder();
            sb.append(GRSManager.c(BaseApplication.getContext()).getNoCheckUrl(HealthEngineRequestManager.GRS_KEY, "com.huawei.health" + lcz.f39935a, "CN"));
            sb.append("/healthkit/v1/appInfos");
            this.mUrl = sb.toString();
            ReleaseLogUtil.d("R_AppInfoRequest", "AppInfoRequest site is Russia, changed to a site in China");
        }
        this.mParams.put("appId", str);
        this.mParams.put("includeAuditInfo", "true");
    }
}
