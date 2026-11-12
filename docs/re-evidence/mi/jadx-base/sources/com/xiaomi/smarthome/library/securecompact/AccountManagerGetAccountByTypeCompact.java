package com.xiaomi.smarthome.library.securecompact;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes2.dex */
public class AccountManagerGetAccountByTypeCompact {
    private static Account[] accountsByType = new Account[0];

    @SuppressLint({"MissingPermission"})
    public static synchronized Account[] getAccountsByType(AccountManager accountManager, String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("getAccountsByType:");
            sb.append(FrequencySecureLimitHelper.canInvoke(getCacheTimeKey()));
            if (FrequencySecureLimitHelper.canInvoke(getCacheTimeKey())) {
                try {
                    accountsByType = accountManager.getAccountsByType(str);
                } catch (Throwable unused) {
                }
                FrequencySecureLimitHelper.cacheInvokeTime(getCacheTimeKey());
            }
        } catch (Throwable th) {
            throw th;
        }
        return accountsByType;
    }

    private static String getCacheTimeKey() {
        return "account.manager.get.by.type.time.key";
    }
}
