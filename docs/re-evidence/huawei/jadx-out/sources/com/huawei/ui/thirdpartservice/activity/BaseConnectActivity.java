package com.huawei.ui.thirdpartservice.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.thirdpartservice.R;
import com.huawei.ui.thirdpartservice.activity.BaseConnectActivity;
import com.huawei.ui.thirdpartservice.syncdata.callback.ReferencePerformOauthCallback;
import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;
import com.huawei.ui.thirdpartservice.syncdata.oauth.OauthManager;
import defpackage.lmf;
import defpackage.lon;
import defpackage.qpx;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseConnectActivity extends BaseActivity {
    static final String KEY_CODE = "code";
    static final String KEY_ERROR = "error";
    private boolean mIsSupport;
    private CommonDialog21 mLoadDataDialog = null;

    /* JADX INFO: loaded from: classes20.dex */
    public interface CheckSupportCallBack {
        void checkResult(boolean z);
    }

    protected abstract void checkConnectStatus();

    protected abstract Intent createDisconnectIntent();

    protected abstract OauthManager createOauthManager();

    protected abstract String getAccountType();

    protected abstract String getAuthorizationUrl();

    protected abstract String getClientId();

    protected abstract String getGrsKey();

    protected abstract String getRedirectUri();

    protected abstract String getTag();

    protected abstract void initView();

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_oauth_connect);
        initView();
        LogUtil.a(getTag(), "onCreate.");
        showWaitingDialog();
        checkSupport(new CheckSupportCallBack() { // from class: wvj
            @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity.CheckSupportCallBack
            public final void checkResult(boolean z) {
                this.f52543a.lambda$onCreate$0(z);
            }
        });
        recordBiEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(boolean z) {
        lambda$onNewIntent$1(getIntent(), z);
    }

    protected void openOauthPage() {
        if (!this.mIsSupport) {
            qpx.e(this, R.string.IDS_not_available_in_your_region);
            return;
        }
        if (qrs.r()) {
            return;
        }
        if (!CommonUtil.ab(this)) {
            LogUtil.a(getTag(), "Network is not Connected ");
            qpx.b(this, R.string.IDS_connect_network);
            return;
        }
        LogUtil.a(getTag(), "openOauthPage");
        String strD = lon.c().d(getGrsKey());
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j(getTag(), "oauth domain is empty!");
            return;
        }
        String strD2 = lon.c().d("domain_oauth_redirect_uri");
        if (TextUtils.isEmpty(strD2)) {
            LogUtil.j(getTag(), "redirect domain is empty!");
            return;
        }
        String str = strD + getAuthorizationUrl();
        String str2 = strD2 + getRedirectUri();
        LogUtil.a(getTag(), "getClientId", getClientId());
        OauthManager.openOauthPage(this, String.format(Locale.ENGLISH, str, getClientId(), str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissWaitingDialog() {
        LogUtil.a(getTag(), "closeLoadDataDialog: mLoadDataDialog = ", this.mLoadDataDialog);
        CommonDialog21 commonDialog21 = this.mLoadDataDialog;
        if (commonDialog21 != null) {
            commonDialog21.dismiss();
            this.mLoadDataDialog = null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        LogUtil.a(getTag(), "onNewIntent.");
        showWaitingDialog();
        checkSupport(new CheckSupportCallBack() { // from class: wvk
            @Override // com.huawei.ui.thirdpartservice.activity.BaseConnectActivity.CheckSupportCallBack
            public final void checkResult(boolean z) {
                this.f52545b.lambda$onNewIntent$1(intent, z);
            }
        });
    }

    private void startOauth(Intent intent) {
        if (intent == null) {
            dismissWaitingDialog();
            return;
        }
        Uri uriB = AppRouterUtils.b(intent);
        if (uriB == null) {
            dismissWaitingDialog();
            return;
        }
        checkConnectStatus();
        LogUtil.a(getTag(), "uri:", uriB.toString());
        String queryParameter = uriB.getQueryParameter("code");
        if (TextUtils.isEmpty(queryParameter)) {
            String queryParameter2 = uriB.getQueryParameter("error");
            if (!TextUtils.isEmpty(queryParameter2)) {
                qpx.b(this, queryParameter2);
            }
            LogUtil.j(getTag(), "startOauth: data is error");
            dismissWaitingDialog();
            return;
        }
        createOauthManager().performOauth(queryParameter, new b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSupportResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onNewIntent$1(Intent intent, boolean z) {
        LogUtil.a(getTag(), "checkSupport: ", Boolean.valueOf(z));
        this.mIsSupport = z;
        if (z) {
            startOauth(intent);
        } else {
            qpx.e(this, R.string.IDS_not_available_in_your_region);
            dismissWaitingDialog();
        }
    }

    private void recordBiEvent() {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put(SyncDataConstant.BI_KEY_ACCOUNT_TYPE, getAccountType());
        LogUtil.a(getTag(), AnalyticsValue.THIRD_CONNECT_ACTIVITY_2041096.value(), getAccountType());
        lmf.d().c(this, AnalyticsValue.THIRD_CONNECT_ACTIVITY_2041096.value(), map, 0);
    }

    private void showWaitingDialog() {
        LogUtil.a(getTag(), "showWaitingDialog: mLoadDataDialog ");
        if (this.mLoadDataDialog != null) {
            return;
        }
        if (isFinishing()) {
            LogUtil.a(getTag(), "showWaitingDialog: isFinishing...");
            return;
        }
        CommonDialog21 commonDialog21B = CommonDialog21.b(this);
        this.mLoadDataDialog = commonDialog21B;
        commonDialog21B.b(getString(R.string.IDS_sns_waiting));
        this.mLoadDataDialog.setCancelable(false);
        this.mLoadDataDialog.c();
        this.mLoadDataDialog.show();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static class b extends ReferencePerformOauthCallback<BaseConnectActivity> {
        b(BaseConnectActivity baseConnectActivity) {
            super(baseConnectActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.ui.thirdpartservice.syncdata.callback.ReferencePerformOauthCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void oauthResultWhenReferenceNotNull(final BaseConnectActivity baseConnectActivity, final boolean z, final boolean z2, long j, final String str) {
            baseConnectActivity.runOnUiThread(new Runnable() { // from class: wvq
                @Override // java.lang.Runnable
                public final void run() {
                    BaseConnectActivity.b.d(baseConnectActivity, z, z2, str);
                }
            });
        }

        public static /* synthetic */ void d(BaseConnectActivity baseConnectActivity, boolean z, boolean z2, String str) {
            baseConnectActivity.dismissWaitingDialog();
            if (!z) {
                qpx.e(baseConnectActivity, R.string.IDS_network_connect_error);
                return;
            }
            if (z2) {
                baseConnectActivity.startActivity(baseConnectActivity.createDisconnectIntent());
                baseConnectActivity.finish();
            } else if (TextUtils.isEmpty(str)) {
                qpx.e(baseConnectActivity, R.string.IDS_connect_error);
            } else {
                qpx.b(baseConnectActivity, str);
            }
        }
    }

    public void checkSupport(CheckSupportCallBack checkSupportCallBack) {
        LogUtil.a(getTag(), "checkSupport: ");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a(getTag(), "onDestroy.");
        dismissWaitingDialog();
    }
}
