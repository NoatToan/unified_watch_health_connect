package com.xiaomi.passport.accountmanager;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.account.authenticator.AMPassTokenUpdateUtil;
import com.xiaomi.account.authenticator.ExtraTokensManager;
import com.xiaomi.account.data.XMPassportInfo;
import com.xiaomi.account.interfaces.AuthResponceInterface;
import com.xiaomi.account.utils.AccountManagerCompat;
import com.xiaomi.account.utils.SettingsRedDotHelper;
import com.xiaomi.accountsdk.account.AccountIntent;
import com.xiaomi.accountsdk.account.ChildAccount;
import com.xiaomi.accountsdk.account.data.AccountInfo;
import com.xiaomi.accountsdk.account.data.ExtendedAuthToken;
import com.xiaomi.accountsdk.account.data.SecondaryDeviceInfo;
import com.xiaomi.accountsdk.account.data.XiaomiUserCoreInfo;
import com.xiaomi.accountsdk.account.exception.RequestSecondaryDeviceLoginDataException;
import com.xiaomi.accountsdk.hasheddeviceidlib.HashedDeviceIdUtil;
import com.xiaomi.accountsdk.hasheddeviceidlib.UDevIdUtil;
import com.xiaomi.accountsdk.request.AccessDeniedException;
import com.xiaomi.accountsdk.request.AuthenticationFailureException;
import com.xiaomi.accountsdk.request.CipherException;
import com.xiaomi.accountsdk.request.InvalidResponseException;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.accountsdk.utils.CloudCoder;
import com.xiaomi.accountsdk.utils.EasyMap;
import com.xiaomi.accountsdk.utils.FidSigningUtil;
import com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity;
import com.xiaomi.passport.Constants;
import com.xiaomi.passport.LocalFeatures.LocalFeaturesManagerResponse;
import com.xiaomi.passport.servicetoken.ServiceTokenResult;
import com.xiaomi.passport.servicetoken.ServiceTokenUIResponse;
import com.xiaomi.passport.servicetoken.data.XmAccountVisibility;
import com.xiaomi.passport.task.QueryUserInfoTask;
import com.xiaomi.passport.utils.AccountHelper;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
abstract class AbsXiaomiAccountManager implements IXiaomiAccountManager {
    private static final Object ACCOUNT_LOCK = new Object();
    private static final String[] NEED_VISIBILITY_APPS_PACKAGE_NAMES = {"com.google.android.contacts", "com.google.android.apps.messaging", "com.google.android.dialer", MedicalIdEditActivity.SYSTEM_CONTACT_PACKAGE, "com.miui.yellowpage"};
    public static final String TAG = "AbsXiaomiAccountManager";
    protected Context mContext;

    public AbsXiaomiAccountManager(Context context) {
        this.mContext = context.getApplicationContext();
        HashedDeviceIdUtil.GlobalConfig.getInstance().setupPolicy(this.mContext);
    }

    private void handleSaveUDevId(String str, Account account) {
        String uDevId;
        try {
            uDevId = UDevIdUtil.getUDevId(this.mContext, str);
        } catch (FidSigningUtil.FidSignException e) {
            AccountLogger.log(TAG, "handleSaveUDevId ", e);
            uDevId = null;
        }
        if (uDevId != null) {
            setUserData(account, "acc_udevid", uDevId);
        }
    }

    private void saveAccountInfoLocked(Account account, AccountInfo accountInfo) {
        String str;
        if (accountInfo == null) {
            return;
        }
        if (account == null) {
            account = getXiaomiAccount();
        }
        if (account == null) {
            AccountLogger.log(TAG, "no account, skip update account info");
            return;
        }
        String encryptedUserId = accountInfo.getEncryptedUserId();
        if (!TextUtils.isEmpty(encryptedUserId)) {
            setUserData(account, "encrypted_user_id", encryptedUserId);
        }
        if (accountInfo.hasPwd) {
            setUserData(account, AccountIntent.EXTRA_HAS_PASSWORD, Boolean.TRUE.toString());
        }
        ChildAccount.saveAsUserData(this.mContext, account, accountInfo);
        String serviceId = accountInfo.getServiceId();
        String serviceToken = accountInfo.getServiceToken();
        if (TextUtils.isEmpty(serviceId) || TextUtils.isEmpty(serviceToken)) {
            return;
        }
        setServiceToken(account, serviceId, new ServiceTokenResult.Builder(serviceId).serviceToken(serviceToken).security(accountInfo.security).peeked(false).build());
        String md5DigestUpperCase = CloudCoder.getMd5DigestUpperCase(serviceToken);
        String str2 = null;
        if (TextUtils.isEmpty(accountInfo.getSlh())) {
            str = null;
        } else {
            str = md5DigestUpperCase + "," + accountInfo.getSlh();
        }
        if (!TextUtils.isEmpty(accountInfo.getPh())) {
            str2 = md5DigestUpperCase + "," + accountInfo.getPh();
        }
        String str3 = serviceId + "_slh";
        String str4 = serviceId + "_ph";
        setUserData(account, str3, str);
        setUserData(account, str4, str2);
        EasyMap easyMap = new EasyMap();
        easyMap.easyPutOpt(str3, str);
        easyMap.easyPutOpt(str4, str2);
        ExtraTokensManager.save(this.mContext, account.name, easyMap);
    }

    private void saveLocalChannelInfoToUseData(Account account, Boolean bool) {
        if (bool != null) {
            setUserData(account, "has_local_channel", String.valueOf(bool));
        }
    }

    private static void setAccountVisibilityForApps(XiaomiAccountManager xiaomiAccountManager, Account account) {
        for (String str : NEED_VISIBILITY_APPS_PACKAGE_NAMES) {
            if (AccountManagerCompat.getAccountVisible(xiaomiAccountManager, account, str)) {
                AccountLogger.log(TAG, "setAccountVisibilityForApps, packageName=" + str + " already visible.");
            } else {
                AccountLogger.log(TAG, "setAccountVisibilityForApps, packageName=" + str + ", result=" + AccountManagerCompat.setAccountVisible(xiaomiAccountManager, account, str));
            }
        }
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    public boolean addAccountOrUpdatePassToken(AccountInfo accountInfo) {
        boolean zAddAccountOrUpdatePassToken;
        String userId = accountInfo.getUserId();
        Account account = new Account(userId, "com.xiaomi");
        Bundle bundle = new Bundle();
        bundle.putString("extra_user_id", userId);
        bundle.putString("authAccount", accountInfo.getUserId());
        bundle.putString("encrypted_user_id", accountInfo.getEncryptedUserId());
        ChildAccount.fill(this.mContext, bundle, accountInfo);
        String str = accountInfo.serviceId;
        setServiceToken(account, str, new ServiceTokenResult.Builder(str).serviceToken(accountInfo.serviceToken).security(accountInfo.security).peeked(false).build());
        synchronized (ACCOUNT_LOCK) {
            zAddAccountOrUpdatePassToken = addAccountOrUpdatePassToken(accountInfo, bundle);
            saveAccountInfoLocked(account, accountInfo);
            ExtraTokensManager.restoreIfNotExists(this.mContext, account);
        }
        handleSaveUDevId(userId, account);
        saveLocalChannelInfoToUseData(account, accountInfo.hasLocalChannel);
        return zAddAccountOrUpdatePassToken;
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    public String getPassToken(Account account) {
        ExtendedAuthToken extendedAuthToken;
        if (account == null) {
            account = getXiaomiAccount();
        }
        if (account == null) {
            return null;
        }
        String password = XiaomiAccountManager.get(this.mContext).getPassword(account);
        if (TextUtils.isEmpty(password) || (extendedAuthToken = ExtendedAuthToken.parse(password)) == null) {
            return null;
        }
        return extendedAuthToken.authToken;
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    public XiaomiAccountManagerFuture<XiaomiUserCoreInfo> getUserInfo(XiaomiAccountManagerCallback<XiaomiUserCoreInfo> xiaomiAccountManagerCallback, Handler handler) {
        return new XiaomiAccountManagerFuture<XiaomiUserCoreInfo>(xiaomiAccountManagerCallback, handler) { // from class: com.xiaomi.passport.accountmanager.AbsXiaomiAccountManager.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.passport.accountmanager.XiaomiAccountManagerFuture
            public XiaomiUserCoreInfo doWork() {
                XiaomiUserCoreInfo userCoreInfo = QueryUserInfoTask.getUserCoreInfo(AbsXiaomiAccountManager.this.mContext);
                if (userCoreInfo != null) {
                    userCoreInfo.downloadAvatar(AbsXiaomiAccountManager.this.mContext);
                }
                return userCoreInfo;
            }
        }.start();
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    public void handleAccountAuthenticatorResponse(Parcelable parcelable, Bundle bundle) {
        if (parcelable == null) {
            return;
        }
        if (parcelable instanceof AccountAuthenticatorResponse) {
            AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) parcelable;
            if (bundle == null) {
                accountAuthenticatorResponse.onError(4, "canceled");
                return;
            } else {
                accountAuthenticatorResponse.onResult(bundle);
                return;
            }
        }
        if (parcelable instanceof com.xiaomi.accounts.AccountAuthenticatorResponse) {
            com.xiaomi.accounts.AccountAuthenticatorResponse accountAuthenticatorResponse2 = (com.xiaomi.accounts.AccountAuthenticatorResponse) parcelable;
            if (bundle == null) {
                accountAuthenticatorResponse2.onError(4, "canceled");
                return;
            } else {
                accountAuthenticatorResponse2.onResult(bundle);
                return;
            }
        }
        if (parcelable instanceof ServiceTokenUIResponse) {
            ServiceTokenUIResponse serviceTokenUIResponse = (ServiceTokenUIResponse) parcelable;
            if (bundle == null) {
                serviceTokenUIResponse.onError(4, "canceled");
                return;
            } else {
                serviceTokenUIResponse.onResult(bundle);
                return;
            }
        }
        if (parcelable instanceof AuthResponceInterface) {
            AuthResponceInterface authResponceInterface = (AuthResponceInterface) parcelable;
            if (bundle == null) {
                authResponceInterface.onError(4, "canceled");
                return;
            } else {
                authResponceInterface.onResult(bundle);
                return;
            }
        }
        if (parcelable instanceof LocalFeaturesManagerResponse) {
            LocalFeaturesManagerResponse localFeaturesManagerResponse = (LocalFeaturesManagerResponse) parcelable;
            if (bundle == null) {
                localFeaturesManagerResponse.onError(4, "canceled");
            } else {
                localFeaturesManagerResponse.onResult(bundle);
            }
        }
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    public boolean hasSetPassword(Account account, String str) {
        boolean zIsSetPassword;
        if (account == null) {
            account = getXiaomiAccount();
        }
        if (account == null) {
            AccountLogger.log(TAG, "no account");
            return false;
        }
        if (TextUtils.isEmpty(getPassword(account))) {
            return TextUtils.equals("true", getUserData(account, AccountIntent.EXTRA_HAS_PASSWORD));
        }
        boolean z = true;
        try {
            try {
                String hashedDeviceIdNoThrow = new HashedDeviceIdUtil(this.mContext).getHashedDeviceIdNoThrow();
                XMPassportInfo xMPassportInfoBuild = XMPassportInfo.build(this.mContext, "passportapi");
                if (xMPassportInfoBuild == null) {
                    AccountLogger.log(TAG, "passport info is null");
                    throw new AuthenticationFailureException("passport info is null");
                }
                String strSubstring = UUID.randomUUID().toString().substring(0, 15);
                try {
                    zIsSetPassword = AccountHelper.isSetPassword(xMPassportInfoBuild, str, hashedDeviceIdNoThrow, strSubstring);
                } catch (AuthenticationFailureException unused) {
                    xMPassportInfoBuild.refreshAuthToken(this.mContext);
                    zIsSetPassword = AccountHelper.isSetPassword(xMPassportInfoBuild, str, hashedDeviceIdNoThrow, strSubstring);
                }
                z = zIsSetPassword;
                setUserData(account, AccountIntent.EXTRA_HAS_PASSWORD, String.valueOf(z));
                return z;
            } catch (AuthenticationFailureException e) {
                AccountLogger.log(TAG, "handleQueryUserPassword error", e);
            }
        } catch (AccessDeniedException e2) {
            AccountLogger.log(TAG, "handleQueryUserPassword error", e2);
        } catch (CipherException e3) {
            AccountLogger.log(TAG, "handleQueryUserPassword error", e3);
        } catch (InvalidResponseException e4) {
            AccountLogger.log(TAG, "handleQueryUserPassword error", e4);
        } catch (IOException e5) {
            AccountLogger.log(TAG, "handleQueryUserPassword error", e5);
        }
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    public XiaomiAccountManagerFuture<XmAccountVisibility> makeAccountVisible(XiaomiAccountManagerCallback<XmAccountVisibility> xiaomiAccountManagerCallback, Handler handler) {
        return new XiaomiAccountManagerFuture<XmAccountVisibility>(xiaomiAccountManagerCallback, handler) { // from class: com.xiaomi.passport.accountmanager.AbsXiaomiAccountManager.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.passport.accountmanager.XiaomiAccountManagerFuture
            public XmAccountVisibility doWork() {
                Account xiaomiAccount = AbsXiaomiAccountManager.this.getXiaomiAccount();
                return xiaomiAccount == null ? new XmAccountVisibility.Builder(XmAccountVisibility.ErrorCode.ERROR_NO_ACCOUNT, null).build() : new XmAccountVisibility.Builder(XmAccountVisibility.ErrorCode.ERROR_NONE, null).accountVisible(true, xiaomiAccount).build();
            }
        }.start();
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    public String requestSecondaryDeviceLoginData(SecondaryDeviceInfo secondaryDeviceInfo) throws RequestSecondaryDeviceLoginDataException {
        return PrimarySecondaryDeviceAccountHelper.requestSecondaryDeviceLoginData(secondaryDeviceInfo);
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    public void updateAccountInfo(Account account, AccountInfo accountInfo) {
        synchronized (ACCOUNT_LOCK) {
            saveAccountInfoLocked(account, accountInfo);
        }
    }

    @Override // com.xiaomi.passport.accountmanager.IXiaomiAccountManager
    public void updatePassToken(Account account, AccountInfo accountInfo) {
        if (accountInfo == null) {
            return;
        }
        if (account == null) {
            account = getXiaomiAccount();
        }
        if (account != null && new AMPassTokenUpdateUtil(this.mContext).needUpdatePassToken(getPassToken(account), accountInfo)) {
            setPassword(account, ExtendedAuthToken.build(accountInfo.passToken, accountInfo.getPsecurity()).toPlain());
        }
    }

    private boolean addAccountOrUpdatePassToken(AccountInfo accountInfo, Bundle bundle) {
        Account account = new Account(accountInfo.getUserId(), "com.xiaomi");
        String plain = ExtendedAuthToken.build(accountInfo.getPassToken(), accountInfo.getPsecurity()).toPlain();
        synchronized (ACCOUNT_LOCK) {
            try {
                Account xiaomiAccount = getXiaomiAccount();
                if (xiaomiAccount != null) {
                    String password = getPassword(xiaomiAccount);
                    if (xiaomiAccount.name.equals(account.name) && !TextUtils.isEmpty(plain) && !TextUtils.equals(plain, password)) {
                        setPassword(xiaomiAccount, plain);
                        sendAccountUpdateBroadcast(account, IXiaomiAccountManager.UpdateType.POST_REFRESH);
                    }
                    return true;
                }
                sendAccountUpdateBroadcast(account, IXiaomiAccountManager.UpdateType.PRE_ADD);
                boolean zAddAccountExplicitly = addAccountExplicitly(accountInfo, bundle);
                if (zAddAccountExplicitly) {
                    if (XiaomiAccountManager.isSystemXiaomiAccountApp(this.mContext)) {
                        setAccountVisibilityForApps(XiaomiAccountManager.get(this.mContext), account);
                        ((NotificationManager) this.mContext.getSystemService("notification")).cancel(Constants.LOGIN_PUSH_ID);
                        SettingsRedDotHelper.removeRedDot(this.mContext);
                    }
                    sendAccountUpdateBroadcast(account, IXiaomiAccountManager.UpdateType.POST_ADD);
                }
                return zAddAccountExplicitly;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
