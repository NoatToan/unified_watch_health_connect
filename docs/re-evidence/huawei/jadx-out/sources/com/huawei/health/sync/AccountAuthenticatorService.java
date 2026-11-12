package com.huawei.health.sync;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.R;
import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;
import defpackage.igf;
import defpackage.qre;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes31.dex */
public class AccountAuthenticatorService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SimpleAuthenticator f10232a;

    static class SimpleAuthenticator extends AbstractAccountAuthenticator {
        private final Context e;

        @Override // android.accounts.AbstractAccountAuthenticator
        public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
            return null;
        }

        @Override // android.accounts.AbstractAccountAuthenticator
        public String getAuthTokenLabel(String str) {
            return null;
        }

        public SimpleAuthenticator(Context context) {
            super(context);
            this.e = context;
        }

        @Override // android.accounts.AbstractAccountAuthenticator
        public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            Account account = new Account(qre.b(BaseApplication.b()).getString(R.string.IDS_app_name_health), str);
            AccountManager accountManager = AccountManager.get(this.e);
            if (accountManager == null) {
                bundle2.putInt("errorCode", 1);
                bundle2.putString("errorMessage", "addAccount account null");
                ReleaseLogUtil.e("R_AccountAuthenticatorService", "addAccount am == null)");
                return bundle2;
            }
            boolean zAddAccountExplicitly = accountManager.addAccountExplicitly(account, null, null);
            ReleaseLogUtil.d("R_AccountAuthenticatorService", "addAccount success:", Boolean.valueOf(zAddAccountExplicitly));
            if (zAddAccountExplicitly) {
                igf.c(account);
                bundle2.putString("authAccount", account.name);
                bundle2.putString(SyncDataConstant.BI_KEY_ACCOUNT_TYPE, account.type);
                return bundle2;
            }
            bundle2.putInt("errorCode", 1);
            bundle2.putString("errorMessage", "addAccount error");
            return bundle2;
        }

        @Override // android.accounts.AbstractAccountAuthenticator
        public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("booleanResult", false);
            return bundle2;
        }

        @Override // android.accounts.AbstractAccountAuthenticator
        public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("errorCode", 6);
            bundle2.putString("errorMessage", "no support token");
            return bundle2;
        }

        @Override // android.accounts.AbstractAccountAuthenticator
        public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("booleanResult", false);
            return bundle;
        }

        @Override // android.accounts.AbstractAccountAuthenticator
        public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("booleanResult", false);
            return bundle2;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f10232a = new SimpleAuthenticator(this);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        SimpleAuthenticator simpleAuthenticator = this.f10232a;
        if (simpleAuthenticator != null) {
            return simpleAuthenticator.getIBinder();
        }
        return new SimpleAuthenticator(this).getIBinder();
    }
}
