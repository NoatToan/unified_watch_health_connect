package com.huawei.health.h5pro.jsbridge.system.account;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.utils.EnvironmentHelper;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.hwcloudjs.JsClientApi;
import com.huawei.hwcloudjs.api.IAccessToken;
import com.huawei.hwcloudjs.api.TaskCallBack;
import com.huawei.hwcloudjs.service.hms.HmsCoreApi;
import com.huawei.hwcloudjs.service.hms.HmsLiteCoreApi;
import com.huawei.hwcloudjs.service.hms.bean.AccessTokenInfo;
import com.huawei.hwcloudjs.service.hms.bean.Status;

/* JADX INFO: loaded from: classes7.dex */
public class AccountEntry extends JsBaseModule implements H5ProInstance.JsBridgeCleaner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebView f6787b;

    @Override // com.huawei.health.h5pro.vengine.H5ProInstance.JsBridgeCleaner
    public void destroy() {
        try {
            JsClientApi.destroyApi(this.f6786a);
        } catch (Throwable th) {
            LogUtil.e(this.TAG, th.getMessage());
        }
        this.f6787b = null;
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        JsClientApi.setGrsAppName(EnvironmentHelper.getInstance().getAccountGrsAppName());
        this.f6787b = this.mH5ProInstance.getWebView();
        this.f6786a = JsClientApi.createApi(this.f6787b, new JsClientApi.SdkOpt.Builder().setShowAuthDlg(false).build());
        String accountJsLoginUrl = EnvironmentHelper.getInstance().getAccountJsLoginUrl();
        if (TextUtils.isEmpty(accountJsLoginUrl)) {
            LogUtil.w(this.TAG, "JsClientApi#setJsUrl: url is empty");
        } else {
            JsClientApi.setJsUrl(accountJsLoginUrl);
        }
        if (EnvironmentHelper.getInstance().isUseHmsLite()) {
            JsClientApi.registerJsApi(HmsLiteCoreApi.class);
            JsClientApi.registerIAccessTokenClass(new IAccessToken() { // from class: com.huawei.health.h5pro.jsbridge.system.account.AccountEntry.5
                @Override // com.huawei.hwcloudjs.api.IAccessToken
                public void getAccessToken(TaskCallBack taskCallBack) {
                    String hostAt = EnvironmentHelper.getInstance().getHostAt();
                    Status status = new Status(0, "success");
                    status.setSuccessFlag(true);
                    taskCallBack.onResult(new AccessTokenInfo(hostAt, status));
                }
            });
        } else {
            JsClientApi.registerJsApi(HmsCoreApi.class);
        }
        this.mH5ProInstance.registerCleaner(this);
    }

    @JavascriptInterface
    public void removeAccessToken() {
        H5ProInstance h5ProInstance = this.mH5ProInstance;
        if (h5ProInstance == null) {
            LogUtil.w(this.TAG, "removeAccessToken: mH5ProInstance is null");
        } else {
            h5ProInstance.removeAccessToken();
        }
    }

    @JavascriptInterface
    public void setAccessToken(String str) {
        H5ProInstance h5ProInstance = this.mH5ProInstance;
        if (h5ProInstance == null) {
            LogUtil.w(this.TAG, "setAccessToken: mH5ProInstance is null");
        } else {
            h5ProInstance.setAccessToken(str);
        }
    }

    @JavascriptInterface
    public void setAppId(String str) {
        H5ProInstance h5ProInstance = this.mH5ProInstance;
        if (h5ProInstance == null) {
            LogUtil.w(this.TAG, "setAppId: mH5ProInstance is null");
        } else {
            h5ProInstance.getAppInfo().setAppId(str);
        }
    }
}
