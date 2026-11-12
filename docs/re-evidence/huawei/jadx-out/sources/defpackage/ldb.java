package defpackage;

import android.text.TextUtils;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hihealthservice.hihealthkit.cpcheck.BaseRequest;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import health.compact.a.GRSManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ldb<T> extends BaseRequest<T> {
    private Map<String, Object> d;

    public ldb(String str, String str2) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        ReleaseLogUtil.d("R_TrustedUserRequest", "TrustedUserRequest site: ", accountInfo);
        String noCheckUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl(HealthEngineRequestManager.GRS_KEY, "com.huawei.health" + lcz.f39935a, accountInfo);
        if ((TextUtils.isEmpty(noCheckUrl) || !noCheckUrl.startsWith("https://")) && Utils.b(BaseApplication.getContext())) {
            noCheckUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl(HealthEngineRequestManager.GRS_KEY, "com.huawei.health" + lcz.f39935a, "CN");
            ReleaseLogUtil.d("R_TrustedUserRequest", "TrustedUserRequest site is Russia, changed to a site in China");
        }
        this.mUrl = String.format(Locale.ENGLISH, noCheckUrl + "/healthkit/v1/appInfos/%s/trustedUsers", str);
        HashMap map = new HashMap(10);
        this.d = map;
        map.put(JsbMapKeyNames.H5_USER_ID, str2);
    }

    @Override // com.huawei.hihealthservice.hihealthkit.cpcheck.BaseRequest
    public lcx.a<T> getRequestParamsBuilder() {
        return super.getRequestParamsBuilder().b(ProfileRequestConstants.PUT_TYPE).e(this.d);
    }
}
