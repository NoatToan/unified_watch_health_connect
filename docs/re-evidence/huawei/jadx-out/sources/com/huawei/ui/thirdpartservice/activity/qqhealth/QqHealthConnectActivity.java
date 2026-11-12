package com.huawei.ui.thirdpartservice.activity.qqhealth;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.main.api.MainCommonApi;
import com.huawei.health.main.api.WeChatApi;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.ThirdUserToken;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.thirdpartservice.R;
import com.huawei.ui.thirdpartservice.activity.qqhealth.QqHealthConnectActivity;
import com.huawei.ui.thirdpartservice.interactors.callback.AuthorizeCallback;
import com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.qqhealth.QqHealthInteractors;
import com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.qqhealth.QqLogin;
import com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.qqhealth.QqLoginMgr;
import com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.qqhealth.mgr.QqHealthDb;
import com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.qqhealth.mgr.QqHealthTable;
import defpackage.lmf;
import defpackage.lsy;
import defpackage.qpx;
import defpackage.wvn;
import defpackage.wyz;
import defpackage.wzb;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.Services;
import java.util.HashMap;

/* JADX INFO: loaded from: classes20.dex */
public class QqHealthConnectActivity extends BaseActivity {
    private c e;
    private CommonDialog21 d = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private QqHealthInteractors f29124c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private QqLoginMgr f29122a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AuthorizeCallback f29123b = new AuthorizeCallback() { // from class: com.huawei.ui.thirdpartservice.activity.qqhealth.QqHealthConnectActivity.1
        @Override // com.huawei.ui.thirdpartservice.interactors.callback.AuthorizeCallback
        public void initCallback(boolean z) {
            LogUtil.a("QqHealthConnectActivity", "mAuthorizeCallback.initCallback() isSuccess=", Boolean.valueOf(z));
        }

        @Override // com.huawei.ui.thirdpartservice.interactors.callback.AuthorizeCallback
        public void loginCallback(String str, String str2, String str3) {
            if (TextUtils.isEmpty(str) || QqHealthConnectActivity.this.e == null) {
                return;
            }
            QqHealthConnectActivity.this.e.sendMessageDelayed(QqHealthConnectActivity.this.e.obtainMessage(1), 300L);
        }

        @Override // com.huawei.ui.thirdpartservice.interactors.callback.AuthorizeCallback
        public void logoutCallback(boolean z) {
            LogUtil.a("QqHealthConnectActivity", "mAuthorizeCallback.logoutCallback() isSuccess=", Boolean.valueOf(z));
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_qq_health_connect);
        this.f29124c = QqHealthInteractors.getInstance();
        this.e = new c(this);
        a(this, this.f29123b);
        findViewById(R.id.qqhealthConnectButton).setOnClickListener(a());
        Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra("isQqTokenValid", false)) {
            return;
        }
        qpx.e(this, R.string.IDS_qq_health_data_clean);
    }

    private View.OnClickListener a() {
        return new View.OnClickListener() { // from class: wxr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52580c.a(view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("type", "1");
        lmf.d().c(this, AnalyticsValue.HEALTH_MINE_SHARE_DATA_CONNECT_2040035.value(), map, 0);
        if ("false".equals(((MainCommonApi) Services.b("Main", MainCommonApi.class)).getPersonalPrivacySettingValue(3))) {
            ((WeChatApi) Services.b("Main", WeChatApi.class)).showSportPrivacySettingDialog(this, R.string.IDS_service_listview_item_qqhealth_content);
            return;
        }
        if (!CommonUtil.ab(this)) {
            LogUtil.a("QqHealthConnectActivity", "Network is not Connected ");
            qpx.b(this, R.string.IDS_network_connect_error);
            return;
        }
        if (wvn.d(this, "com.tencent.mobileqq")) {
            LogUtil.a("QqHealthConnectActivity", "QqHealthConnectActivity onClick() loginQq().");
            b();
            return;
        }
        LogUtil.a("QqHealthConnectActivity", "System is not install QQ App.");
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(QqLoginMgr.MARKET_URI));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("QqHealthConnectActivity", "start qq ActivityNotFoundException");
            wvn.b(this, R.string.IDS_common_notification_know_tips, R.string.IDS_hw_data_share_app_not_install);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.a("QqHealthConnectActivity", "QqHealthActivity onResume");
        super.onResume();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("QqHealthConnectActivity", "QqHealthActivity onDestroy");
        this.e.removeCallbacksAndMessages(null);
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a("QqHealthConnectActivity", "showWaitingDialog: mLoadDataDialog ");
        if (this.d != null) {
            return;
        }
        if (isFinishing()) {
            LogUtil.a("QqHealthConnectActivity", "showWaitingDialog: isFinishing...");
            return;
        }
        CommonDialog21 commonDialog21B = CommonDialog21.b(this);
        this.d = commonDialog21B;
        commonDialog21B.b(getString(R.string.IDS_login_server));
        this.d.setCancelable(false);
        this.d.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("QqHealthConnectActivity", "closeLoadDataDialog: mLoadDataDialog = ", this.d);
        if (isFinishing()) {
            LogUtil.a("QqHealthConnectActivity", "closeLoadDataDialog: isFinishing...");
            return;
        }
        CommonDialog21 commonDialog21 = this.d;
        if (commonDialog21 != null) {
            commonDialog21.dismiss();
            this.d = null;
        }
    }

    private void a(Activity activity, AuthorizeCallback authorizeCallback) {
        if (this.f29122a == null) {
            this.f29122a = new QqLoginMgr(activity, authorizeCallback, wyz.b(1, 20, 1020, 2020));
        }
    }

    private void b() {
        if (this.f29122a != null) {
            lsy.a(new Runnable() { // from class: wxo
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f29122a.login();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final ICloudOperationResult<String> iCloudOperationResult) {
        LogUtil.d("QqHealthConnectActivity", "getUserName");
        lsy.a(new Runnable() { // from class: wxk
            @Override // java.lang.Runnable
            public final void run() {
                this.f52577c.a(iCloudOperationResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final ICloudOperationResult iCloudOperationResult) {
        this.f29122a.getUserName(this, new QqLogin.QqNameCallback() { // from class: wxl
            @Override // com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.qqhealth.QqLogin.QqNameCallback
            public final void onQqNameCallback(String str) {
                QqHealthConnectActivity.e(iCloudOperationResult, str);
            }
        });
    }

    public static /* synthetic */ void e(ICloudOperationResult iCloudOperationResult, String str) {
        LogUtil.d("QqHealthConnectActivity", "userName = ", str);
        if (iCloudOperationResult != null) {
            iCloudOperationResult.operationResult(str, str, true);
        }
    }

    public static class c extends BaseHandler<QqHealthConnectActivity> {
        c(QqHealthConnectActivity qqHealthConnectActivity) {
            super(qqHealthConnectActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(QqHealthConnectActivity qqHealthConnectActivity, Message message) {
            LogUtil.a("QqHealthConnectActivity", "handleMessage msg is ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1) {
                a(qqHealthConnectActivity);
                return;
            }
            if (i == 2) {
                e(qqHealthConnectActivity);
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                qqHealthConnectActivity.e();
                qpx.e(qqHealthConnectActivity, R.string.IDS_eu_login_failure);
                return;
            }
            qqHealthConnectActivity.e();
            KeyValDbManager.d(BaseApplication.getContext()).b("third_part_service_qq_health_status", "true");
            qqHealthConnectActivity.startActivity(new Intent(qqHealthConnectActivity, (Class<?>) QqHealthActivity.class));
            qqHealthConnectActivity.finish();
        }

        private void a(final QqHealthConnectActivity qqHealthConnectActivity) {
            qqHealthConnectActivity.d();
            qqHealthConnectActivity.d((ICloudOperationResult<String>) new ICloudOperationResult() { // from class: wxq
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z) {
                    QqHealthConnectActivity.c.c(qqHealthConnectActivity, (String) obj, str, z);
                }
            });
        }

        public static /* synthetic */ void c(QqHealthConnectActivity qqHealthConnectActivity, String str, String str2, boolean z) {
            LogUtil.d("QqHealthConnectActivity", "isSuccess = ", Boolean.valueOf(z));
            if (z) {
                if (qqHealthConnectActivity.f29122a != null) {
                    qqHealthConnectActivity.f29122a.saveQqUserInfo();
                }
                qqHealthConnectActivity.e.sendMessageDelayed(qqHealthConnectActivity.e.obtainMessage(2), 300L);
                return;
            }
            qqHealthConnectActivity.e.sendMessageDelayed(qqHealthConnectActivity.e.obtainMessage(4), 300L);
        }

        private void e(final QqHealthConnectActivity qqHealthConnectActivity) {
            long j;
            int i;
            QqHealthTable qqHealthTable = new QqHealthDb().get();
            if (qqHealthTable == null) {
                LogUtil.a("QqHealthConnectActivity", "loginHuaweiCloud qqHealthTable is null");
                qqHealthConnectActivity.e.sendMessageDelayed(qqHealthConnectActivity.e.obtainMessage(4), 300L);
                return;
            }
            ThirdUserToken thirdUserToken = new ThirdUserToken();
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
            if (accountInfo != null) {
                try {
                    j = Long.parseLong(accountInfo);
                } catch (NumberFormatException unused) {
                    LogUtil.e("QqHealthConnectActivity", "loginHuaweiCloud NumberFormatException");
                    j = 0;
                }
            } else {
                j = 0;
            }
            thirdUserToken.setHuid(j);
            thirdUserToken.setThirdAccount(qqHealthTable.getOpenId());
            thirdUserToken.setThirdAccessToken(qqHealthTable.getToken());
            thirdUserToken.setType(7);
            String expireTime = qqHealthTable.getExpireTime();
            if (expireTime != null) {
                try {
                    i = Integer.parseInt(expireTime);
                } catch (NumberFormatException unused2) {
                    LogUtil.e("QqHealthConnectActivity", "loginHuaweiCloud NumberFormatException expireTimeStr = ", expireTime);
                    i = 0;
                }
            } else {
                i = 0;
            }
            thirdUserToken.setExpireTime(i);
            HashMap map = new HashMap();
            map.put("thirdUserToken", thirdUserToken);
            new wzb(String.class, "/profile/third/authorize").b(map, new ICloudOperationResult() { // from class: wxp
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z) {
                    QqHealthConnectActivity.c.e(qqHealthConnectActivity, (String) obj, str, z);
                }
            });
        }

        public static /* synthetic */ void e(QqHealthConnectActivity qqHealthConnectActivity, String str, String str2, boolean z) {
            LogUtil.a("QqHealthConnectActivity", "HwCloudManagerQQ authorize() isSuccess = ", Boolean.valueOf(z));
            if (z) {
                qqHealthConnectActivity.f29124c.sendQqHealthConnectSuccessBroadcast();
                qqHealthConnectActivity.e.sendMessageDelayed(qqHealthConnectActivity.e.obtainMessage(3), 300L);
            } else {
                qqHealthConnectActivity.e.sendMessageDelayed(qqHealthConnectActivity.e.obtainMessage(4), 300L);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f29122a.onActivityResult(i, i2, intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
