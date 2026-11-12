package com.huawei.common.scope;

import com.huawei.common.OpAnalyticsApi;
import com.huawei.common.util.Utils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import defpackage.oet;
import java.io.IOException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes4.dex */
public class AccessScopeReport {
    private static final String PATH = "?nsp_svc=huawei.oauth2.user.getTokenInfo&open_id=OPENID&access_token=";
    private static final String TAG = "AccessScopeReport";

    public static void reportErrorScope(String str, String str2, String str3) {
        LoginApi loginApi = (LoginApi) oet.d().e(LoginApi.class);
        if (loginApi == null) {
            LogUtil.j(TAG, "reportErrorScope callApi is null");
            return;
        }
        try {
            Response<GetAccessScopeRsp> responseExecute = loginApi.getScopes(getUrl() + URLEncoder.encode(str, "utf-8")).execute();
            if (!responseExecute.isOK()) {
                LogUtil.e(TAG, "reportErrorScope network error");
                return;
            }
            GetAccessScopeRsp body = responseExecute.getBody();
            String strMaskValue = SharedPreferenceUtil.getInstance(BaseApplication.getContext()).maskValue(body.getScope());
            String strMaskValue2 = SharedPreferenceUtil.getInstance(BaseApplication.getContext()).maskValue(body.getUid());
            OpAnalyticsApi opAnalyticsApi = LoginInit.getInstance(BaseApplication.getContext()).getOpAnalyticsApi();
            if (opAnalyticsApi != null) {
                opAnalyticsApi.onReport("AT_SCOPE_UNSATISIFIED", "appId:" + str2 + " errCode:" + str3 + " uidMask:" + strMaskValue2 + " maskScopes:" + strMaskValue);
            }
        } catch (IOException e) {
            LogUtil.e(TAG, "reportErrorScope IOException:", ExceptionUtils.c(e));
        }
    }

    private static String getUrl() {
        return Utils.getUrl("com.huawei.health", "domainScopeOauth") + PATH;
    }
}
