package com.miui.tsmclient.account;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public interface IAccountManager {
    AccountManagerFuture<Bundle> addAccount(Activity activity, AccountManagerCallback accountManagerCallback);

    AccountManagerFuture<Bundle> confirmCredentials(Activity activity, AccountManagerCallback accountManagerCallback);

    Account getAccount(Context context);

    AccountInfo loadAccountInfo(Context context);

    AccountInfo loadAccountInfo(Context context, String str);

    default AccountInfo loadAccountInfo(Context context, String str, boolean z) {
        return null;
    }

    void resetAccount(Context context, String str, String str2);
}
