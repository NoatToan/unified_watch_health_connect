package com.mibi.sdk.common.account;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes5.dex */
public interface IAccountProvider {
    void addAccount(String str, Bundle bundle, AccountManagerCallback<Bundle> accountManagerCallback, Handler handler);

    Account getAccount();

    IServiceTokenFuture getServiceToken(Context context, String str);

    void invalidateServiceToken(IServiceTokenResult iServiceTokenResult);

    boolean isUseSystem();
}
