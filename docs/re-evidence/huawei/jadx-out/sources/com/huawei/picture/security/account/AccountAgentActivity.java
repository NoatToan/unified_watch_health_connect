package com.huawei.picture.security.account;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.media3.common.C;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.findnetwork.comm.request.bean.DisconnectNotifyModeValue;
import com.huawei.hms.support.account.AccountAuthManager;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.account.service.AccountAuthService;
import com.huawei.hms.support.picker.service.AccountPickerService;
import com.huawei.picture.security.account.bean.ErrorStatus;
import com.huawei.picture.security.account.handler.CloudAccountHandler;
import com.huawei.secure.android.common.intent.SafeIntent;
import defpackage.oqw;
import defpackage.orf;
import defpackage.orj;
import defpackage.ork;

/* JADX INFO: loaded from: classes13.dex */
public class AccountAgentActivity extends BaseAgentActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f21999a = new Runnable() { // from class: com.huawei.picture.security.account.AccountAgentActivity.3
        @Override // java.lang.Runnable
        public void run() {
            if (AccountAgentActivity.this.d != null) {
                AccountAgentActivity.this.d.logFromSdk("finishTask scheduledShutdownActivity finish");
            }
            AccountAgentActivity.this.finish();
        }
    };
    private CloudAccountHandler d;

    @Override // com.huawei.picture.security.account.BaseAgentActivity, com.huawei.secure.android.common.activity.SafeActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent signInIntent;
        super.onCreate(bundle);
        SafeIntent safeIntent = new SafeIntent(getIntent());
        boolean booleanExtra = safeIntent.getBooleanExtra("isMcp", false);
        boolean booleanExtra2 = safeIntent.getBooleanExtra("hasMms", true);
        String stringExtra = safeIntent.getStringExtra("subAppId");
        String stringExtra2 = safeIntent.getStringExtra("handlerId");
        if (stringExtra2 == null) {
            finish();
            return;
        }
        CloudAccountHandler cloudAccountHandler = oqw.a().e.get(stringExtra2);
        this.d = cloudAccountHandler;
        if (cloudAccountHandler == null) {
            finish();
            return;
        }
        if (!booleanExtra) {
            signInIntent = oqw.a().e(this).getSignInIntent();
        } else if (booleanExtra2) {
            try {
                AccountAuthService accountAuthServiceE = oqw.a().e(this);
                accountAuthServiceE.setSubAppId(stringExtra);
                signInIntent = accountAuthServiceE.getSignInIntent();
            } catch (ApiException e) {
                ork.a("AccountAgentActivity", "AccountAuthService ApiException: ", e);
                signInIntent = null;
            }
        } else {
            try {
                AccountPickerService accountPickerServiceD = oqw.a().d(this);
                accountPickerServiceD.setSubAppId(stringExtra);
                signInIntent = accountPickerServiceD.signInByMcp();
            } catch (ApiException e2) {
                ork.a("AccountAgentActivity", "AccountPickerService ApiException: ", e2);
                signInIntent = null;
            }
        }
        orf.d(this, signInIntent, DisconnectNotifyModeValue.DISCONNECT_NOTIFY_DEBUG);
        a();
    }

    private void a() {
        orj.c(this.f21999a, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    @Override // com.huawei.secure.android.common.activity.SafeActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        orj.d(this.f21999a);
    }

    @Override // com.huawei.picture.security.account.BaseAgentActivity, com.huawei.secure.android.common.activity.SafeActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        try {
            orj.d(this.f21999a);
            if (!(intent instanceof SafeIntent)) {
                intent = new SafeIntent(intent);
            }
            if (i == 8888) {
                ork.a("AccountAgentActivity", "onActivityResult requestCode : " + i);
                Task<AuthAccount> authResultFromIntent = AccountAuthManager.parseAuthResultFromIntent(intent);
                this.d.logFromSdk("onActivityResult isSuccessful:" + authResultFromIntent.isSuccessful());
                if (authResultFromIntent.isSuccessful()) {
                    AuthAccount result = authResultFromIntent.getResult();
                    oqw.a().a(result.getAuthorizationCode(), result.getServiceCountryCode(), this.d);
                } else {
                    ApiException apiException = (ApiException) authResultFromIntent.getException();
                    ork.b("AccountAgentActivity", "onActivityResult signIn failed : " + apiException.getStatusCode());
                    this.d.onRequestError(new ErrorStatus(apiException.getStatusCode(), apiException.getMessage()));
                }
                finish();
            }
        } catch (Exception e) {
            ork.a("AccountAgentActivity", "onActivityResult exception : ", e);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
