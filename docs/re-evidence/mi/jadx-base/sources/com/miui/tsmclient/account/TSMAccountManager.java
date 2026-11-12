package com.miui.tsmclient.account;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public class TSMAccountManager implements IAccountManager {
    private static final String SERVICE_ID = "tsm-auth";
    IAccountManager mAccountManager = new OAuthAccountManager();

    @Override // com.miui.tsmclient.account.IAccountManager
    public AccountManagerFuture<Bundle> addAccount(Activity activity, AccountManagerCallback accountManagerCallback) {
        return this.mAccountManager.addAccount(activity, accountManagerCallback);
    }

    @Override // com.miui.tsmclient.account.IAccountManager
    public AccountManagerFuture<Bundle> confirmCredentials(Activity activity, AccountManagerCallback accountManagerCallback) {
        return this.mAccountManager.confirmCredentials(activity, accountManagerCallback);
    }

    @Override // com.miui.tsmclient.account.IAccountManager
    public Account getAccount(Context context) {
        return this.mAccountManager.getAccount(context);
    }

    @Override // com.miui.tsmclient.account.IAccountManager
    public AccountInfo loadAccountInfo(Context context) {
        return loadAccountInfo(context, SERVICE_ID);
    }

    @Override // com.miui.tsmclient.account.IAccountManager
    public void resetAccount(Context context, String str, String str2) {
        this.mAccountManager.resetAccount(context, str, str2);
    }

    @Override // com.miui.tsmclient.account.IAccountManager
    public AccountInfo loadAccountInfo(Context context, String str) {
        return this.mAccountManager.loadAccountInfo(context, str);
    }
}
