package com.huawei.ui.thirdpartservice.syncdata.oauth;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.ThirdOauthTokenI;
import com.huawei.hwcloudmodel.model.ThirdOauthTokenO;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.webview.WebViewActivity;
import com.huawei.ui.thirdpartservice.R;
import com.huawei.ui.thirdpartservice.syncdata.callback.PerformOauthCallback;
import com.huawei.ui.thirdpartservice.syncdata.callback.RefreshTokenCallback;
import com.huawei.ui.thirdpartservice.syncdata.callback.RevokeOauthCallback;
import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;
import defpackage.lmf;
import defpackage.lqo;
import defpackage.qrs;
import health.compact.a.KeyValDbManager;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes20.dex */
public abstract class OauthManager {
    private static final String DEFAULT_OAUTH_TIME = "-1";
    private static final String KEY_LAST_HUID = "key_last_huid";
    private static final String R_TAG = "R_OauthManager";
    private String mAccessToken;
    private String mOpenId;

    protected abstract String getConnectTimeKey();

    protected abstract String getModuleId();

    protected abstract int getThirdAccountType();

    public OauthManager() {
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), getModuleId(), KEY_LAST_HUID);
        if (TextUtils.isEmpty(strE) || !strE.equals(strC)) {
            saveOauthTime(Long.parseLong("-1"));
            SharedPreferenceManager.e(BaseApplication.getContext(), getModuleId(), KEY_LAST_HUID, strC, null);
        }
    }

    public static void openOauthPage(final Context context, String str) {
        if (!isChromeInstall() || !isChromeEnabled()) {
            jumpToWebview(context, str);
            return;
        }
        try {
            final Intent intent = new Intent();
            intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.setData(Uri.parse(str));
            intent.setClassName("com.android.chrome", "com.google.android.apps.chrome.Main");
            qrs.e("com.android.chrome", context, context.getString(R.string.IDS_browser_app_name), new View.OnClickListener() { // from class: xbw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    iov.d(context, intent);
                }
            }, null);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent();
            intent2.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent2.setData(Uri.parse(str));
            jumpToBrowser(context, intent2);
        }
    }

    private static void jumpToBrowser(final Context context, final Intent intent) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536)) == null) {
            return;
        }
        intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
        qrs.e(resolveInfoResolveActivity.activityInfo.packageName, context, context.getString(R.string.IDS_browser_app_name), new View.OnClickListener() { // from class: xce
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                context.startActivity(intent);
            }
        }, null);
    }

    private static void jumpToWebview(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
        intent.putExtra("WebViewActivity.REQUEST_URL_KEY", str);
        intent.putExtra("WebViewActivity.HANDLE_REDIRECT", true);
        intent.putExtra("WebViewActivity.TITLE", context.getString(R.string.IDS_sync_fitness_data_link_komoot));
        context.startActivity(intent);
    }

    private static boolean isChromeInstall() {
        return Utils.b(com.huawei.haf.application.BaseApplication.b(), "com.android.chrome");
    }

    private static boolean isChromeEnabled() {
        try {
            return com.huawei.haf.application.BaseApplication.b().getPackageManager().getApplicationInfo("com.android.chrome", 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public void checkConnectStatus(RefreshTokenCallback refreshTokenCallback) {
        checkConnectStatus(false, refreshTokenCallback);
    }

    public void refreshConnectStatus() {
        checkConnectStatus(true, null);
    }

    public void checkConnectStatus(boolean z, RefreshTokenCallback refreshTokenCallback) {
        LogUtil.a("OauthManager", "  checkConnectStatus   called");
        if (z || refreshTokenCallback == null) {
            refreshAccessToken(refreshTokenCallback);
            return;
        }
        long oauthTime = getOauthTime();
        if (oauthTime == 0) {
            refreshTokenCallback.refreshResult(true, false);
        } else if (oauthTime > 0) {
            refreshTokenCallback.refreshResult(true, true);
        } else {
            refreshAccessToken(refreshTokenCallback);
        }
    }

    public String getOpenId() {
        return this.mOpenId;
    }

    private void recordOauthBiEvent(String str) {
        HashMap map = new HashMap();
        map.put("status", str);
        map.put(SyncDataConstant.BI_KEY_ACCOUNT_TYPE, getAccountTypeName());
        LogUtil.a(getClass().getSimpleName(), AnalyticsValue.THIRD_OAUTH_STATUS_2041095.value(), str);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.THIRD_OAUTH_STATUS_2041095.value(), map, 0);
    }

    private String getAccountTypeName() {
        int thirdAccountType = getThirdAccountType();
        if (thirdAccountType == 26) {
            return SyncDataConstant.BI_VALUE_ACCOUNT_TYPE_KOMMOT;
        }
        if (thirdAccountType == 27) {
            return SyncDataConstant.BI_VALUE_ACCOUNT_TYPE_STRAVA;
        }
        return "";
    }

    public void refreshAccessToken(final RefreshTokenCallback refreshTokenCallback) {
        ThirdOauthTokenO thirdOauthTokenO = new ThirdOauthTokenO();
        thirdOauthTokenO.setThirdAccountType(getThirdAccountType());
        thirdOauthTokenO.setThirdTokenType(2);
        lqo.b(BaseApplication.getContext()).e(thirdOauthTokenO, new ICloudOperationResult() { // from class: xby
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.d.lambda$refreshAccessToken$2(refreshTokenCallback, (ThirdOauthTokenI) obj, str, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshAccessToken$2(RefreshTokenCallback refreshTokenCallback, ThirdOauthTokenI thirdOauthTokenI, String str, boolean z) {
        if (refreshTokenCallback == null) {
            return;
        }
        if (thirdOauthTokenI == null) {
            refreshTokenCallback.refreshResult(false, false);
            return;
        }
        if (!z || thirdOauthTokenI.getThirdAuthToken() == null || TextUtils.isEmpty(thirdOauthTokenI.getThirdAuthToken().getThirdToken())) {
            revokeOauthTime();
            refreshTokenCallback.refreshResult(true, false);
        } else {
            setAccessToken(thirdOauthTokenI.getThirdAuthToken().getThirdToken());
            setOpenId(thirdOauthTokenI.getThirdAuthToken().getOpenId());
            saveOauthTime(thirdOauthTokenI.getThirdAuthToken().getCreateTime());
            refreshTokenCallback.refreshResult(true, true);
        }
    }

    public void revokeOauth(final RevokeOauthCallback revokeOauthCallback) {
        lqo.b(BaseApplication.getContext()).e(getThirdAccountType(), new ICloudOperationResult() { // from class: xcb
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f52694a.lambda$revokeOauth$3(revokeOauthCallback, (CloudCommonReponse) obj, str, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$revokeOauth$3(RevokeOauthCallback revokeOauthCallback, CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        if (cloudCommonReponse == null) {
            revokeOauthCallback.revokeResult(false, false, str);
        } else {
            if (z) {
                revokeOauthTime();
                recordOauthBiEvent("cancel");
                revokeOauthCallback.revokeResult(true, true, "");
                return;
            }
            revokeOauthCallback.revokeResult(true, false, str);
        }
    }

    public void performOauth(String str, final PerformOauthCallback performOauthCallback) {
        ThirdOauthTokenO thirdOauthTokenO = new ThirdOauthTokenO();
        thirdOauthTokenO.setThirdAccountType(getThirdAccountType());
        thirdOauthTokenO.setThirdTokenType(3);
        thirdOauthTokenO.setThirdToken(str);
        lqo.b(BaseApplication.getContext()).d(thirdOauthTokenO, new ICloudOperationResult() { // from class: xbz
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str2, boolean z) {
                this.e.lambda$performOauth$4(performOauthCallback, (ThirdOauthTokenI) obj, str2, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performOauth$4(PerformOauthCallback performOauthCallback, ThirdOauthTokenI thirdOauthTokenI, String str, boolean z) {
        if (thirdOauthTokenI == null) {
            performOauthCallback.oauthResult(false, false, 0L, str);
            return;
        }
        if (!z) {
            performOauthCallback.oauthResult(true, false, 0L, str);
            return;
        }
        if (thirdOauthTokenI.getThirdAuthToken() == null || TextUtils.isEmpty(thirdOauthTokenI.getThirdAuthToken().getThirdToken())) {
            performOauthCallback.oauthResult(true, false, 0L, "");
            return;
        }
        setAccessToken(thirdOauthTokenI.getThirdAuthToken().getThirdToken());
        setOpenId(thirdOauthTokenI.getThirdAuthToken().getOpenId());
        saveOauthTime(thirdOauthTokenI.getThirdAuthToken().getCreateTime());
        recordOauthBiEvent(SyncDataConstant.BI_VALUE_OAUTH_STATUS_OAUTH);
        performOauthCallback.oauthResult(true, true, thirdOauthTokenI.getThirdAuthToken().getCreateTime(), "");
    }

    private void setAccessToken(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.mAccessToken = str;
    }

    private void setOpenId(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.mOpenId = str;
    }

    public long getOauthTime() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), getModuleId(), getConnectTimeKey());
        ReleaseLogUtil.c(R_TAG, "getOauthTime = ", strE);
        try {
            if (TextUtils.isEmpty(strE)) {
                strE = "-1";
            }
            return Long.parseLong(strE);
        } catch (NumberFormatException e) {
            LogUtil.e("OauthManager", e.getMessage());
            return -1L;
        }
    }

    public String getAccessToken() {
        return TextUtils.isEmpty(this.mAccessToken) ? "" : this.mAccessToken;
    }

    private void saveOauthTime(long j) {
        SharedPreferenceManager.e(BaseApplication.getContext(), getModuleId(), getConnectTimeKey(), Long.toString(j), null);
    }

    private void revokeOauthTime() {
        SharedPreferenceManager.e(BaseApplication.getContext(), getModuleId(), getConnectTimeKey(), "0", null);
    }
}
