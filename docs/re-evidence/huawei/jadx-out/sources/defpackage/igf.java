package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.R;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class igf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f37588b = qre.b(BaseApplication.b()).getString(R.string.IDS_app_name_health);

    public static void e(Context context) {
        ReleaseLogUtil.d("R_AccountSyncManager", "initialize");
        try {
            Account accountD = d(context);
            if (accountD != null) {
                c(accountD);
                ReleaseLogUtil.d("R_AccountSyncManager", "initialize setting");
            } else {
                ReleaseLogUtil.a("R_AccountSyncManager", "getAccount account null");
            }
        } catch (Exception e) {
            ReleaseLogUtil.a("R_AccountSyncManager", "initialize exception", ExceptionUtils.c(e));
        }
    }

    private static Account d(Context context) {
        try {
            AccountManager accountManager = AccountManager.get(context);
            if (accountManager == null) {
                ReleaseLogUtil.e("R_AccountSyncManager", "getAccount am == null");
                return null;
            }
            Account[] accountsByType = accountManager.getAccountsByType("com.huawei.health.alive.account");
            if (accountsByType.length > 0) {
                LogUtil.a("R_AccountSyncManager", "getAccount exist: " + accountsByType[0].name);
                return accountsByType[0];
            }
            Account account = new Account(f37588b, "com.huawei.health.alive.account");
            boolean zAddAccountExplicitly = accountManager.addAccountExplicitly(account, null, null);
            ReleaseLogUtil.d("R_AccountSyncManager", "getAccount success:" + zAddAccountExplicitly);
            if (!zAddAccountExplicitly) {
                return null;
            }
            a();
            return account;
        } catch (Exception e) {
            ReleaseLogUtil.a("R_AccountSyncManager", "getAccount exception", ExceptionUtils.c(e));
            return null;
        }
    }

    public static void c(Account account) {
        ContentResolver.setIsSyncable(account, "com.huawei.health.aliveProvider", 1);
        ContentResolver.setSyncAutomatically(account, "com.huawei.health.aliveProvider", true);
        ContentResolver.addPeriodicSync(account, "com.huawei.health.aliveProvider", new Bundle(), 3600L);
        ContentResolver.setMasterSyncAutomatically(true);
    }

    public static void a() {
        Account account = new Account(f37588b, "com.huawei.health.alive.account");
        Bundle bundle = new Bundle();
        bundle.putBoolean("force", true);
        bundle.putBoolean("expedited", true);
        ContentResolver.requestSync(account, "com.huawei.health.aliveProvider", bundle);
        ReleaseLogUtil.d("R_AccountSyncManager", "triggerImmediateSync end");
    }
}
