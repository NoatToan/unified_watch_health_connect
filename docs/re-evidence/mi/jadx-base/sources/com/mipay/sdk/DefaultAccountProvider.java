package com.mipay.sdk;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"MissingPermission"})
public class DefaultAccountProvider implements IMipayAccountProvider {
    private final AccountManager mAccountManager;

    public DefaultAccountProvider(Context context) {
        this.mAccountManager = AccountManager.get(context);
    }

    @Override // com.mipay.sdk.IMipayAccountProvider
    public AccountManagerFuture<Bundle> addAccount(String str, String str2, String[] strArr, Bundle bundle, Activity activity, AccountManagerCallback<Bundle> accountManagerCallback, Handler handler) {
        return this.mAccountManager.addAccount(str, str2, strArr, bundle, activity, accountManagerCallback, handler);
    }

    @Override // com.mipay.sdk.IMipayAccountProvider
    public Account[] getAccounts() {
        return this.mAccountManager.getAccounts();
    }

    @Override // com.mipay.sdk.IMipayAccountProvider
    public Account[] getAccountsByType(String str) {
        return this.mAccountManager.getAccountsByType(str);
    }

    @Override // com.mipay.sdk.IMipayAccountProvider
    public AccountManagerFuture<Bundle> getAuthToken(Account account, String str, Bundle bundle, Activity activity, AccountManagerCallback<Bundle> accountManagerCallback, Handler handler) {
        return this.mAccountManager.getAuthToken(account, str, bundle, activity, accountManagerCallback, handler);
    }

    @Override // com.mipay.sdk.IMipayAccountProvider
    public void invalidateAuthToken(String str, String str2) {
        this.mAccountManager.invalidateAuthToken(str, str2);
    }

    @Override // com.mipay.sdk.IMipayAccountProvider
    public boolean isUseSystem() {
        return true;
    }

    @Override // com.mipay.sdk.IMipayAccountProvider
    public AccountManagerFuture<Bundle> getAuthToken(Account account, String str, Bundle bundle, boolean z, AccountManagerCallback<Bundle> accountManagerCallback, Handler handler) {
        return this.mAccountManager.getAuthToken(account, str, bundle, z, accountManagerCallback, handler);
    }
}
