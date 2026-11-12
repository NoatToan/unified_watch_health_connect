package com.mibi.sdk.common.account.loader;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.common.account.AccountInteractHelper;
import com.mibi.sdk.common.account.AccountRegistry;
import com.mibi.sdk.common.account.AccountToken;
import com.mibi.sdk.common.account.AccountUtils;
import com.mibi.sdk.common.account.IServiceTokenFuture;
import com.mibi.sdk.common.account.IServiceTokenResult;
import com.mibi.sdk.common.exception.AccountChangedException;
import com.mibi.sdk.common.exception.AccountException;
import com.mibi.sdk.common.exception.AccountThrottingException;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.utils.MibiLog;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class MiAccountLoader implements AccountLoader {
    public static final Parcelable.Creator<AccountLoader> CREATOR = new Parcelable.Creator<AccountLoader>() { // from class: com.mibi.sdk.common.account.loader.MiAccountLoader.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AccountLoader createFromParcel(Parcel parcel) {
            return new MiAccountLoader((Account) parcel.readParcelable(null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AccountLoader[] newArray(int i) {
            return new MiAccountLoader[i];
        }
    };
    private static final int GET_TOKEN_TIMEOUT = 30000;
    private static final String TAG = "MiAccountLoader";
    private final Account mAccount;
    private AccountToken mAccountToken;

    public MiAccountLoader(Account account) {
        this.mAccount = account;
    }

    private String getAccountChangeMsg(String str, String str2) {
        return "uid1 is empty : " + TextUtils.isEmpty(str) + " ; uid2 is empty : " + TextUtils.isEmpty(str2) + " ; equals : " + TextUtils.equals(str, str2);
    }

    private void invalidToken() {
        if (TextUtils.isEmpty(this.mAccountToken.getServiceToken())) {
            return;
        }
        MibiLog.d(TAG, "invalid token");
        AccountRegistry.getAccountProvider().invalidateServiceToken(this.mAccountToken.getServiceTokenResult());
    }

    private synchronized void loadAccountInfo(Context context) throws PaymentException {
        loadAccountInfoByServiceToken(context);
    }

    private void loadAccountInfoByServiceToken(Context context) throws PaymentException {
        MibiLog.d(TAG, "load by get service token");
        IServiceTokenFuture serviceToken = AccountRegistry.getAccountProvider().getServiceToken(context, CommonConstants.SERVICE_ID);
        try {
            IServiceTokenResult iServiceTokenResult = serviceToken.get(30000L, TimeUnit.MILLISECONDS);
            if (serviceToken.isDone() && iServiceTokenResult != null) {
                String userId = iServiceTokenResult.getUserId();
                String serviceToken2 = iServiceTokenResult.getServiceToken();
                if (TextUtils.isEmpty(serviceToken2)) {
                    Intent intent = iServiceTokenResult.getIntent();
                    if (intent == null) {
                        String str = "authtoken is empty dueto error " + iServiceTokenResult.getErrorCodeName() + ": " + iServiceTokenResult.getErrorMessage();
                        MibiLog.d(TAG, str);
                        throw new AccountException(new ResultException(str));
                    }
                    if (!waitInteractionResult(context, intent, CommonConstants.SERVICE_ID)) {
                        throw new AccountThrottingException();
                    }
                    loadAccountInfoByServiceToken(context);
                }
                if (TextUtils.isEmpty(userId)) {
                    MibiLog.d(TAG, "uid is empty");
                    throw new AccountException(new ResultException("uid is empty"));
                }
                if (!TextUtils.equals(userId, this.mAccount.name)) {
                    MibiLog.d(TAG, "account changed , service token");
                    throw new AccountChangedException(1002, getAccountChangeMsg(userId, this.mAccount.name));
                }
                String security = iServiceTokenResult.getSecurity();
                if (TextUtils.isEmpty(serviceToken2) || TextUtils.isEmpty(security)) {
                    MibiLog.d(TAG, "serviceToken or security is empty");
                    throw new AccountException(new ResultException("serviceToken or security is empty"));
                }
                this.mAccountToken = new AccountToken(iServiceTokenResult);
                return;
            }
        } catch (Exception e) {
            MibiLog.d(TAG, "getToken failed : " + e.getMessage());
        }
        throw new AccountException();
    }

    private boolean waitInteractionResult(Context context, Intent intent, String str) {
        AccountInteractHelper.registerUserInteraction(str);
        try {
            synchronized (AccountInteractHelper.sUserInteractionSet) {
                try {
                    if (AccountInteractHelper.mInteractionResult) {
                        AccountInteractHelper.unregisterUserInteraction(str);
                        return true;
                    }
                    AccountInteractHelper.mInteractionResult = false;
                    AccountInteractActivity.startActivity(context, intent, 1001);
                    MibiLog.d(TAG, "go to throttle page");
                    Object obj = AccountInteractHelper.sInteractionWaitingLock;
                    synchronized (obj) {
                        obj.wait(300000L);
                    }
                    MibiLog.d(TAG, "wait interaction result: " + AccountInteractHelper.mInteractionResult);
                    boolean z = AccountInteractHelper.mInteractionResult;
                    AccountInteractHelper.unregisterUserInteraction(str);
                    return z;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e) {
            MibiLog.e(TAG, "throw throttle exception", e);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.mibi.sdk.common.account.loader.AccountLoader
    public synchronized AccountToken getAccountToken() {
        return this.mAccountToken;
    }

    @Override // com.mibi.sdk.common.account.loader.AccountLoader
    public String getUserId() {
        return this.mAccount.name;
    }

    @Override // com.mibi.sdk.common.account.loader.AccountLoader
    public boolean isAccountChanged(Context context) {
        String miUserId = AccountUtils.getMiUserId();
        MibiLog.d(TAG, "uid is empty : " + TextUtils.isEmpty(miUserId) + " : " + TextUtils.isEmpty(getUserId()));
        return !TextUtils.equals(miUserId, getUserId());
    }

    @Override // com.mibi.sdk.common.account.loader.AccountLoader
    public void load(Context context) throws PaymentException {
        if (isAccountChanged(context)) {
            MibiLog.d(TAG, "account changed, load");
            throw new AccountChangedException(1000, getAccountChangeMsg(AccountUtils.getMiUserId(), getUserId()));
        }
        loadAccountInfo(context);
    }

    @Override // com.mibi.sdk.common.account.loader.AccountLoader
    public void reload(Context context) throws PaymentException {
        MibiLog.d(TAG, "reload");
        if (isAccountChanged(context)) {
            MibiLog.d(TAG, "account changed, reload");
            throw new AccountChangedException(1001, getAccountChangeMsg(AccountUtils.getMiUserId(), getUserId()));
        }
        invalidToken();
        loadAccountInfo(context);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mAccount, i);
    }
}
