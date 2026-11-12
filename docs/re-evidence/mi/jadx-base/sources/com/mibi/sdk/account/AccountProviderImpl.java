package com.mibi.sdk.account;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.account.IAccountProvider;
import com.mibi.sdk.common.account.IServiceTokenFuture;
import com.mibi.sdk.common.account.IServiceTokenResult;
import com.mibi.sdk.common.utils.MibiLog;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;
import com.xiaomi.passport.servicetoken.ServiceTokenResult;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class AccountProviderImpl implements IAccountProvider {
    private static final String TAG = "AccountProviderImpl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10075a = 0;
    private XiaomiAccountManager mAccountManager;

    public AccountProviderImpl(Context context) {
        this.mAccountManager = XiaomiAccountManager.get(context);
    }

    private ServiceTokenResult convert(IServiceTokenResult iServiceTokenResult) {
        return new ServiceTokenResult.Builder(iServiceTokenResult.getSid()).serviceToken(iServiceTokenResult.getServiceToken()).security(iServiceTokenResult.getSecurity()).errorMessage(iServiceTokenResult.getErrorMessage()).errorCode(getErrorCodeByName(iServiceTokenResult.getErrorCodeName())).errorStackTrace(iServiceTokenResult.getErrorStackTrace()).intent(iServiceTokenResult.getIntent()).slh(iServiceTokenResult.getSlh()).ph(iServiceTokenResult.getPh()).cUserId(iServiceTokenResult.getCUserId()).userId(iServiceTokenResult.getUserId()).peeked(iServiceTokenResult.isPeeked()).build();
    }

    private ServiceTokenResult.ErrorCode getErrorCodeByName(String str) {
        for (ServiceTokenResult.ErrorCode errorCode : ServiceTokenResult.ErrorCode.values()) {
            if (TextUtils.equals(errorCode.name(), str)) {
                return errorCode;
            }
        }
        return ServiceTokenResult.ErrorCode.ERROR_NONE;
    }

    @Override // com.mibi.sdk.common.account.IAccountProvider
    public void addAccount(String str, Bundle bundle, AccountManagerCallback<Bundle> accountManagerCallback, Handler handler) {
        this.mAccountManager.addXiaomiAccount(str, bundle, accountManagerCallback, handler);
    }

    @Override // com.mibi.sdk.common.account.IAccountProvider
    public Account getAccount() {
        return this.mAccountManager.getXiaomiAccount();
    }

    @Override // com.mibi.sdk.common.account.IAccountProvider
    public IServiceTokenFuture getServiceToken(Context context, String str) {
        return new ServiceTokenFutureImpl(this.mAccountManager.getServiceToken(getAccount(), str, null));
    }

    @Override // com.mibi.sdk.common.account.IAccountProvider
    public void invalidateServiceToken(IServiceTokenResult iServiceTokenResult) {
        String str = TAG;
        MibiLog.d(str, "invalidate serviceToken : " + iServiceTokenResult.getSid());
        try {
            ServiceTokenResult serviceTokenResult = this.mAccountManager.invalidateServiceToken(convert(iServiceTokenResult)).get(30L, TimeUnit.SECONDS);
            if (serviceTokenResult != null) {
                MibiLog.d(str, "fakeResult.security is null : " + TextUtils.isEmpty(serviceTokenResult.security) + " ; serviceToken is null : " + TextUtils.isEmpty(serviceTokenResult.serviceToken));
            } else {
                MibiLog.d(str, "fakeResult is null");
            }
        } catch (Exception e) {
            MibiLog.d(TAG, "invalidate serviceToken failed : " + e.getMessage(), e);
        }
    }

    @Override // com.mibi.sdk.common.account.IAccountProvider
    public boolean isUseSystem() {
        return CommonConstants.sIsUseSystemAccount;
    }
}
