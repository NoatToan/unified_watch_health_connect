package com.mibi.sdk.common.account;

import android.accounts.Account;
import com.mibi.sdk.common.account.loader.AccountLoader;
import com.mibi.sdk.common.account.loader.FakeAccountLoader;
import com.mibi.sdk.common.account.loader.MiAccountLoader;

/* JADX INFO: loaded from: classes5.dex */
public class AccountUtils {
    private static final String TAG = "AccountUtils";

    private AccountUtils() {
    }

    public static AccountLoader getCurrentAccountLoader() {
        Account miAccount = getMiAccount();
        return miAccount != null ? newMiAccountLoader(miAccount) : newFakeAccountLoader();
    }

    public static Account getMiAccount() {
        IAccountProvider accountProvider = AccountRegistry.getAccountProvider();
        if (accountProvider == null) {
            return null;
        }
        return accountProvider.getAccount();
    }

    public static String getMiUserId() {
        Account miAccount = getMiAccount();
        return miAccount != null ? miAccount.name : "";
    }

    public static AccountLoader newFakeAccountLoader() {
        return new FakeAccountLoader();
    }

    public static AccountLoader newMiAccountLoader(Account account) {
        return new MiAccountLoader(account);
    }
}
