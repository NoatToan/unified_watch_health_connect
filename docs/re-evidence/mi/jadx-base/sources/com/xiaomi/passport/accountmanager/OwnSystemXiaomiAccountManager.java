package com.xiaomi.passport.accountmanager;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.OnAccountsUpdateListener;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.account.utils.SplitUtils;
import com.xiaomi.accountsdk.account.XMPassportSettings;
import com.xiaomi.accountsdk.account.data.AccountInfo;
import com.xiaomi.accountsdk.account.data.ExtendedAuthToken;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.accountsdk.utils.ActivityExportSafetyGuardian;
import com.xiaomi.accountsdk.utils.SystemXiaomiAccountPackageName;
import com.xiaomi.passport.jsb.PassportJsbWebViewPageConfig;
import com.xiaomi.passport.servicetoken.ServiceTokenFuture;
import com.xiaomi.passport.servicetoken.ServiceTokenOp;
import com.xiaomi.passport.servicetoken.ServiceTokenResult;
import com.xiaomi.passport.utils.HttpCookies;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
class OwnSystemXiaomiAccountManager extends AbsXiaomiAccountManager {
    public static final String EXTRA_ACCOUNT = "extra_account";
    public static final String EXTRA_UPDATE_TYPE = "extra_update_type";
    private static final String SYSTEM_LOGIN_ACCOUNTS_POST_CHANGED_ACTION = "android.accounts.LOGIN_ACCOUNTS_POST_CHANGED";
    private static final String SYSTEM_LOGIN_ACCOUNTS_PRE_CHANGED_ACTION = "android.accounts.LOGIN_ACCOUNTS_PRE_CHANGED";
    public static final int TYPE_ADD = 2;
    public static final int TYPE_REFRESH = 3;
    public static final int TYPE_REMOVE = 1;
    protected final AccountManager mAccountManager;
    protected final Context mContext;

    /* JADX INFO: renamed from: com.xiaomi.passport.accountmanager.OwnSystemXiaomiAccountManager$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$xiaomi$passport$accountmanager$IXiaomiAccountManager$UpdateType;

        static {
            int[] iArr = new int[IXiaomiAccountManager.UpdateType.values().length];
            $SwitchMap$com$xiaomi$passport$accountmanager$IXiaomiAccountManager$UpdateType = iArr;
            try {
                iArr[IXiaomiAccountManager.UpdateType.PRE_ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$xiaomi$passport$accountmanager$IXiaomiAccountManager$UpdateType[IXiaomiAccountManager.UpdateType.POST_ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$xiaomi$passport$accountmanager$IXiaomiAccountManager$UpdateType[IXiaomiAccountManager.UpdateType.POST_REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$xiaomi$passport$accountmanager$IXiaomiAccountManager$UpdateType[IXiaomiAccountManager.UpdateType.PRE_REMOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$xiaomi$passport$accountmanager$IXiaomiAccountManager$UpdateType[IXiaomiAccountManager.UpdateType.POST_REMOVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public OwnSystemXiaomiAccountManager(Context context) {
        super(context);
        this.mAccountManager = AccountManager.get(context);
        this.mContext = context.getApplicationContext();
    }

    @Override // com.xiaomi.passport.accountmanager.IAccountManager
    public boolean addAccountExplicitly(AccountInfo accountInfo, Bundle bundle) {
        return this.mAccountManager.addAccountExplicitly(new Account(accountInfo.getUserId(), "com.xiaomi"), ExtendedAuthToken.build(accountInfo.getPassToken(), accountInfo.getPsecurity()).toPlain(), bundle);
    }

    @Override // com.xiaomi.passport.accountmanager.IAccountManager
    @SuppressLint({"MissingPermission"})
    public void addOnAccountsUpdatedListener(OnAccountsUpdateListener onAccountsUpdateListener, Handler handler, boolean z) {
        this.mAccountManager.addOnAccountsUpdatedListener(onAccountsUpdateListener, handler, z);
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    @SuppressLint({"MissingPermission"})
    public void addXiaomiAccount(String str, Bundle bundle, AccountManagerCallback<Bundle> accountManagerCallback, Handler handler) {
        this.mAccountManager.addAccount("com.xiaomi", str, null, bundle, null, accountManagerCallback, handler);
    }

    @Override // com.xiaomi.passport.accountmanager.IAccountManager
    @SuppressLint({"MissingPermission"})
    public void clearPassword(Account account) {
        this.mAccountManager.clearPassword(account);
    }

    @Override // com.xiaomi.passport.accountmanager.IAccountManager
    @SuppressLint({"MissingPermission"})
    public AccountManagerFuture<Bundle> confirmCredentials(Account account, Bundle bundle, AccountManagerCallback<Bundle> accountManagerCallback, Handler handler) {
        return this.mAccountManager.confirmCredentials(account, bundle, null, accountManagerCallback, handler);
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    public Intent getAccountHomeActivityIntent() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setPackage(SystemXiaomiAccountPackageName.getValid(this.mContext));
        SplitUtils.setIntentExemptAddForceSplitFlag(intent);
        return intent;
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    public Intent getAccountLoginActivityIntent(String str, Bundle bundle, Parcelable parcelable) {
        Intent intent = new Intent("com.xiaomi.account.action.XIAOMI_ACCOUNT_LOGIN");
        intent.setPackage("com.xiaomi.account");
        intent.putExtra("service_id", str);
        intent.addFlags(67108864);
        intent.putExtra("accountAuthenticatorResponse", parcelable);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setPackage(SystemXiaomiAccountPackageName.getValid(this.mContext));
        intent.addCategory("android.intent.category.DEFAULT");
        SplitUtils.setIntentExemptAddForceSplitFlag(intent);
        return intent;
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    public Intent getAccountNotificationActivityIntent(String str, String str2, Bundle bundle, Parcelable parcelable) {
        Intent intent = new Intent("com.xiaomi.account.action.PASSPORT_JSB_WEBVIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        PassportJsbWebViewPageConfig passportJsbWebViewPageConfigBuild = new PassportJsbWebViewPageConfig.Builder().url(str2).removeAllCookies(true).closeAfterLogin(true).cookieFillConfig(PassportJsbWebViewPageConfig.CookieFillConfig.create(HttpCookies.COOKIE_URL_ACCOUNT_DOMAIN, true, null)).headerFillConfig(PassportJsbWebViewPageConfig.HeaderFillConfig.create(true)).actionBarConfig(PassportJsbWebViewPageConfig.ActionBarConfig.createNoTitle()).build();
        Bundle bundle2 = new Bundle();
        passportJsbWebViewPageConfigBuild.fillBundle(bundle2);
        intent.putExtras(bundle2);
        intent.putExtra("accountAuthenticatorResponse", parcelable);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setData(Uri.parse("xiaomiaccount://webview"));
        intent.setPackage(SystemXiaomiAccountPackageName.getValid(this.mContext));
        intent.addCategory("android.intent.category.DEFAULT");
        SplitUtils.setIntentExemptAddForceSplitFlag(intent);
        ActivityExportSafetyGuardian.getInstance().sign(this.mContext, intent);
        return intent;
    }

    @Override // com.xiaomi.passport.accountmanager.IAccountManager
    public int getAccountVisibility(Account account, String str) {
        return this.mAccountManager.getAccountVisibility(account, str);
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    public Intent getConfirmCredentialActivityIntent(Bundle bundle, Parcelable parcelable) {
        Intent intent = new Intent("com.xiaomi.account.action.XIAOMI_ACCOUNT_QUICK_LOGIN");
        intent.setPackage("com.xiaomi.account");
        intent.putExtra("accountAuthenticatorResponse", parcelable);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.addFlags(67108864);
        intent.setPackage(SystemXiaomiAccountPackageName.getValid(this.mContext));
        intent.addCategory("android.intent.category.DEFAULT");
        SplitUtils.setIntentExemptAddForceSplitFlag(intent);
        return intent;
    }

    @Override // com.xiaomi.passport.accountmanager.IAccountManager
    public String getPassword(Account account) {
        return this.mAccountManager.getPassword(account);
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    public Intent getQRCodeAuthActivityIntent(String str) {
        Intent intent = new Intent("com.xiaomi.account.action.XIAOMI_ACCOUNT_WEB");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setData(Uri.parse(str));
        intent.setPackage(SystemXiaomiAccountPackageName.getValid(this.mContext));
        SplitUtils.setIntentExemptAddForceSplitFlag(intent);
        intent.addCategory("android.intent.category.DEFAULT");
        List<ResolveInfo> listQueryIntentActivities = XMPassportSettings.getApplicationContext().getPackageManager().queryIntentActivities(intent, 1);
        if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
            return intent;
        }
        AccountLogger.log(AbsXiaomiAccountManager.TAG, "getQRCodeAuthActivityIntent>>>XIAOMI_ACCOUNT_WEB action not exist");
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setClassName(SystemXiaomiAccountPackageName.getValid(this.mContext), "com.xiaomi.account.ui.AccountWebActivity");
        intent2.setData(Uri.parse(str));
        return intent2;
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    @SuppressLint({"MissingPermission"})
    public ServiceTokenFuture getServiceToken(final Account account, final String str, final Bundle bundle) {
        return new ServiceTokenOp.OpWorker() { // from class: com.xiaomi.passport.accountmanager.OwnSystemXiaomiAccountManager.2
            @Override // com.xiaomi.passport.servicetoken.ServiceTokenOp.OpWorker
            public ServiceTokenResult doWork() {
                Account xiaomiAccount = account;
                if (xiaomiAccount == null) {
                    xiaomiAccount = OwnSystemXiaomiAccountManager.this.getXiaomiAccount();
                }
                if (xiaomiAccount == null) {
                    return new ServiceTokenResult.Builder(str).errorCode(ServiceTokenResult.ErrorCode.ERROR_NO_ACCOUNT).build();
                }
                ServiceTokenResult serviceTokenResultPeekServiceToken = OwnSystemXiaomiAccountManager.this.peekServiceToken(xiaomiAccount, str, bundle);
                if (serviceTokenResultPeekServiceToken != null) {
                    return serviceTokenResultPeekServiceToken.addAccountInfo(OwnSystemXiaomiAccountManager.this.mContext, xiaomiAccount);
                }
                try {
                    ServiceTokenResult serviceTokenResultCreate = ServiceTokenResult.create(OwnSystemXiaomiAccountManager.this.mAccountManager.getAuthToken(xiaomiAccount, str, bundle, (Activity) null, (AccountManagerCallback<Bundle>) null, (Handler) null).getResult(), str);
                    if (serviceTokenResultCreate == null) {
                        return null;
                    }
                    return serviceTokenResultCreate.addAccountInfo(OwnSystemXiaomiAccountManager.this.mContext, xiaomiAccount);
                } catch (Exception e) {
                    return ServiceTokenResult.create(str, e);
                }
            }
        }.work();
    }

    @Override // com.xiaomi.passport.accountmanager.IAccountManager
    @SuppressLint({"MissingPermission"})
    public String getUserData(Account account, String str) {
        return this.mAccountManager.getUserData(account, str);
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    @SuppressLint({"MissingPermission"})
    public Account getXiaomiAccount() {
        Account[] accountsByType = this.mAccountManager.getAccountsByType("com.xiaomi");
        if (accountsByType.length > 0) {
            return accountsByType[0];
        }
        return null;
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    @SuppressLint({"MissingPermission"})
    public ServiceTokenFuture invalidateServiceToken(final ServiceTokenResult serviceTokenResult) {
        return new ServiceTokenOp.OpWorker() { // from class: com.xiaomi.passport.accountmanager.OwnSystemXiaomiAccountManager.3
            @Override // com.xiaomi.passport.servicetoken.ServiceTokenOp.OpWorker
            public ServiceTokenResult doWork() {
                ServiceTokenResult serviceTokenResult2 = serviceTokenResult;
                OwnSystemXiaomiAccountManager.this.mAccountManager.invalidateAuthToken("com.xiaomi", serviceTokenResult2 == null ? null : serviceTokenResult2.toAuthToken());
                return new ServiceTokenResult.Builder(serviceTokenResult.sid).build();
            }
        }.work();
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    @SuppressLint({"MissingPermission"})
    public ServiceTokenResult peekServiceToken(Account account, String str, Bundle bundle) {
        ServiceTokenResult serviceTokenResultCreate;
        String strPeekAuthToken = this.mAccountManager.peekAuthToken(account, str);
        if (TextUtils.isEmpty(strPeekAuthToken) || (serviceTokenResultCreate = ServiceTokenResult.create(null, str, strPeekAuthToken, true)) == null) {
            return null;
        }
        return serviceTokenResultCreate.addAccountInfo(this.mContext, account);
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    public ServiceTokenFuture refreshServiceToken(final Account account, final String str, final ServiceTokenResult serviceTokenResult, final Bundle bundle) {
        return new ServiceTokenOp.OpWorker() { // from class: com.xiaomi.passport.accountmanager.OwnSystemXiaomiAccountManager.4
            @Override // com.xiaomi.passport.servicetoken.ServiceTokenOp.OpWorker
            public ServiceTokenResult doWork() {
                OwnSystemXiaomiAccountManager.this.invalidateServiceToken(serviceTokenResult).get();
                return OwnSystemXiaomiAccountManager.this.getServiceToken(account, str, bundle).get();
            }
        }.work();
    }

    @Override // com.xiaomi.passport.accountmanager.IAccountManager
    public void removeOnAccountsUpdatedListener(OnAccountsUpdateListener onAccountsUpdateListener) {
        this.mAccountManager.removeOnAccountsUpdatedListener(onAccountsUpdateListener);
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    @SuppressLint({"MissingPermission"})
    public XiaomiAccountManagerFuture<Bundle> removeXiaomiAccount(XiaomiAccountManagerCallback<Bundle> xiaomiAccountManagerCallback, Handler handler) {
        final Account xiaomiAccount = getXiaomiAccount();
        return new XiaomiAccountManagerFuture<Bundle>(xiaomiAccountManagerCallback, handler) { // from class: com.xiaomi.passport.accountmanager.OwnSystemXiaomiAccountManager.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.passport.accountmanager.XiaomiAccountManagerFuture
            public Bundle doWork() throws Exception {
                Bundle bundle = new Bundle();
                Account account = xiaomiAccount;
                if (account == null) {
                    bundle.putBoolean("booleanResult", false);
                    bundle.putString("errorMessage", "no account");
                    return bundle;
                }
                OwnSystemXiaomiAccountManager.this.sendAccountUpdateBroadcast(account, IXiaomiAccountManager.UpdateType.PRE_REMOVE);
                OwnSystemXiaomiAccountManager ownSystemXiaomiAccountManager = OwnSystemXiaomiAccountManager.this;
                Boolean result = ownSystemXiaomiAccountManager.mAccountManager.removeAccount(ownSystemXiaomiAccountManager.getXiaomiAccount(), null, null).getResult();
                bundle.putBoolean("booleanResult", result.booleanValue());
                if (result.booleanValue()) {
                    OwnSystemXiaomiAccountManager.this.sendAccountUpdateBroadcast(xiaomiAccount, IXiaomiAccountManager.UpdateType.POST_REMOVE);
                }
                return bundle;
            }
        }.start();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001e A[PHI: r1
      0x001e: PHI (r1v2 int) = (r1v0 int), (r1v3 int), (r1v6 int) binds: [B:6:0x0012, B:8:0x0015, B:13:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    @SuppressLint({"WrongConstant"})
    public void sendAccountUpdateBroadcast(Account account, IXiaomiAccountManager.UpdateType updateType) {
        if (updateType == null) {
            throw new IllegalArgumentException();
        }
        int i = AnonymousClass5.$SwitchMap$com$xiaomi$passport$accountmanager$IXiaomiAccountManager$UpdateType[updateType.ordinal()];
        String str = "android.accounts.LOGIN_ACCOUNTS_PRE_CHANGED";
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                i2 = 3;
                if (i == 3) {
                    str = "android.accounts.LOGIN_ACCOUNTS_POST_CHANGED";
                } else if (i == 4) {
                    i2 = 1;
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("this should not be happen");
                    }
                    i2 = 1;
                    str = "android.accounts.LOGIN_ACCOUNTS_POST_CHANGED";
                }
            } else {
                str = "android.accounts.LOGIN_ACCOUNTS_POST_CHANGED";
            }
        }
        Intent intent = new Intent(str);
        intent.putExtra("extra_account", account);
        intent.putExtra("extra_update_type", i2);
        intent.addFlags(16777216);
        this.mContext.sendBroadcast(intent);
    }

    @Override // com.xiaomi.passport.accountmanager.IAccountManager
    public boolean setAccountVisibility(Account account, String str, int i) {
        return this.mAccountManager.setAccountVisibility(account, str, i);
    }

    @Override // com.xiaomi.passport.accountmanager.IAccountManager
    public void setPassword(Account account, String str) {
        this.mAccountManager.setPassword(account, str);
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    @SuppressLint({"MissingPermission"})
    public void setServiceToken(Account account, String str, ServiceTokenResult serviceTokenResult) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(serviceTokenResult.security) || TextUtils.isEmpty(serviceTokenResult.serviceToken)) {
            return;
        }
        this.mAccountManager.setAuthToken(account, str, serviceTokenResult.toAuthToken());
    }

    @Override // com.xiaomi.passport.accountmanager.IAccountManager
    @SuppressLint({"MissingPermission"})
    public void setUserData(Account account, String str, String str2) {
        this.mAccountManager.setUserData(account, str, str2);
    }

    @Override // com.xiaomi.passport.accountmanager.IAccountManager
    public Map<String, String> getUserData(Account account, Set<String> set) {
        HashMap map = new HashMap();
        for (String str : set) {
            if (!TextUtils.isEmpty(str)) {
                map.put(str, getUserData(account, str));
            }
        }
        return map;
    }

    @Override // com.xiaomi.passport.accountmanager.IAccountManager
    public void setUserData(Account account, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                setUserData(account, entry.getKey(), entry.getValue());
            }
        }
    }
}
