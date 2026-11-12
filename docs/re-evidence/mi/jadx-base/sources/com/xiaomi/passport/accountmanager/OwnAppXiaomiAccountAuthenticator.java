package com.xiaomi.passport.accountmanager;

import android.accounts.Account;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.accounts.AbstractAccountAuthenticator;
import com.xiaomi.accounts.AccountAuthenticatorResponse;
import com.xiaomi.accounts.AccountManager;
import com.xiaomi.accountsdk.account.AccountIntent;
import com.xiaomi.accountsdk.account.data.AccountInfo;
import com.xiaomi.accountsdk.account.data.PassTokenLoginParams;
import com.xiaomi.accountsdk.account.exception.IllegalDeviceException;
import com.xiaomi.accountsdk.account.exception.InvalidCredentialException;
import com.xiaomi.accountsdk.account.exception.InvalidUserNameException;
import com.xiaomi.accountsdk.account.exception.NeedCaptchaException;
import com.xiaomi.accountsdk.account.exception.NeedNotificationException;
import com.xiaomi.accountsdk.account.exception.NeedVerificationException;
import com.xiaomi.accountsdk.account.exception.PackageNameDeniedException;
import com.xiaomi.accountsdk.request.AccessDeniedException;
import com.xiaomi.accountsdk.request.AuthenticationFailureException;
import com.xiaomi.accountsdk.request.InvalidResponseException;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.passport.utils.AccountHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class OwnAppXiaomiAccountAuthenticator extends AbstractAccountAuthenticator {
    private static final boolean DEBUG = true;
    private static final String TAG = "OwnAppXiaomiAccountAuthenticator";
    private Context mContext;

    public OwnAppXiaomiAccountAuthenticator(Context context) {
        super(context);
        this.mContext = context;
    }

    private void fillQuickLoginIntent(Bundle bundle, AccountAuthenticatorResponse accountAuthenticatorResponse, boolean z, Account account, String str, Bundle bundle2) {
        XiaomiAccountManager xiaomiAccountManager = XiaomiAccountManager.get(this.mContext);
        if (!TextUtils.equals(xiaomiAccountManager.getUserData(account, AccountIntent.EXTRA_HAS_PASSWORD), String.valueOf(true)) && !TextUtils.isEmpty(xiaomiAccountManager.getPassToken(account))) {
            xiaomiAccountManager.hasSetPassword(account, null);
        }
        String userData = XiaomiAccountManager.get(this.mContext).getUserData(account, AccountIntent.EXTRA_HAS_PASSWORD);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("userId", account.name);
        bundle2.putBoolean("need_retry_on_authenticator_response_result", z);
        bundle2.putBoolean(AccountIntent.EXTRA_HAS_PASSWORD, TextUtils.isEmpty(userData) ? true : TextUtils.equals(userData, String.valueOf(true)));
        Intent confirmCredentialActivityIntent = xiaomiAccountManager.getConfirmCredentialActivityIntent(bundle2, accountAuthenticatorResponse);
        confirmCredentialActivityIntent.putExtra("service_id", str);
        bundle.putParcelable("intent", confirmCredentialActivityIntent);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:49:0x011c A[Catch: NeedNotificationException -> 0x00e9, InvalidUserNameException -> 0x00ec, AuthenticationFailureException -> 0x00ef, AccessDeniedException -> 0x00f2, PackageNameDeniedException -> 0x00fa, InvalidCredentialException -> 0x0101, InvalidResponseException -> 0x0106, IllegalDeviceException -> 0x010d, IOException -> 0x0114, TRY_LEAVE, TryCatch #1 {InvalidCredentialException -> 0x0101, blocks: (B:29:0x00c2, B:49:0x011c), top: B:81:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:59:0x014f A[Catch: NeedNotificationException -> 0x00e9, InvalidUserNameException -> 0x00ec, AuthenticationFailureException -> 0x00ef, AccessDeniedException -> 0x00f2, PackageNameDeniedException -> 0x00fa, InvalidResponseException -> 0x0106, IllegalDeviceException -> 0x010d, IOException -> 0x0114, InvalidCredentialException -> 0x0148, TryCatch #6 {InvalidCredentialException -> 0x0148, blocks: (B:51:0x0120, B:53:0x013b, B:55:0x0143, B:60:0x0153, B:62:0x0159, B:63:0x015c, B:59:0x014f), top: B:82:0x0120 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0159 A[Catch: NeedNotificationException -> 0x00e9, InvalidUserNameException -> 0x00ec, AuthenticationFailureException -> 0x00ef, AccessDeniedException -> 0x00f2, PackageNameDeniedException -> 0x00fa, InvalidResponseException -> 0x0106, IllegalDeviceException -> 0x010d, IOException -> 0x0114, InvalidCredentialException -> 0x0148, TryCatch #6 {InvalidCredentialException -> 0x0148, blocks: (B:51:0x0120, B:53:0x013b, B:55:0x0143, B:60:0x0153, B:62:0x0159, B:63:0x015c, B:59:0x014f), top: B:82:0x0120 }] */
    private Bundle getAuthTokenBundle(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        String strSubstring;
        String realPasstoken;
        PassTokenLoginParams.Builder builderPackageName;
        AccountInfo serviceTokenByPassToken;
        XiaomiAccountManager xiaomiAccountManager;
        Bundle authenticatorResponseBundle;
        Bundle bundle2 = bundle;
        String string = bundle2.getString(AccountManager.KEY_ANDROID_PACKAGE_NAME, this.mContext.getPackageName());
        Object[] objArr = new Object[2];
        objArr[0] = str.startsWith("weblogin:") ? "websso" : str;
        objArr[1] = string;
        AccountLogger.log(TAG, String.format("getting AuthToken, type: %s, package name: %s", objArr));
        Bundle bundle3 = new Bundle();
        Account xiaomiAccount = XiaomiAccountManager.get(this.mContext).getXiaomiAccount();
        if (xiaomiAccount == null || !xiaomiAccount.name.equals(account.name)) {
            bundle3.putBoolean("booleanResult", false);
            return bundle3;
        }
        String str2 = "passportapi";
        if (TextUtils.isEmpty(str)) {
            AccountLogger.log(TAG, "getting auth token, but no service url contained, use passportapi");
        } else {
            if (str.startsWith("weblogin:")) {
                strSubstring = str.substring(9);
                if (!AccountHelper.isTrustedWebSsoUrl(strSubstring)) {
                    bundle3.putInt("errorCode", 7);
                    bundle3.putString("errorMessage", "untrusted web sso url");
                    return bundle3;
                }
            } else {
                str2 = str;
            }
            realPasstoken = getRealPasstoken(account);
            if (TextUtils.isEmpty(realPasstoken)) {
                fillQuickLoginIntent(bundle3, accountAuthenticatorResponse, true, account, str2, bundle);
                AccountLogger.log(TAG, "passToken is null");
                return bundle3;
            }
            builderPackageName = new PassTokenLoginParams.Builder().userId(account.name).passToken(realPasstoken).packageName(string);
            try {
                try {
                    if (strSubstring != null) {
                        builderPackageName.serviceId(null);
                        builderPackageName.loginRequestUrl(strSubstring);
                        AccountInfo serviceTokenByPassToken2 = AccountHelper.getServiceTokenByPassToken(this.mContext, builderPackageName.build());
                        bundle3.putString("authAccount", serviceTokenByPassToken2.getUserId());
                        bundle3.putString("accountType", "weblogin:com.xiaomi");
                        bundle3.putString("authtoken", serviceTokenByPassToken2.getAutoLoginUrl());
                        AccountLogger.log(TAG, "web sso getAuthToken succeed");
                        return bundle3;
                    }
                    builderPackageName.serviceId(str2);
                    try {
                        builderPackageName.loginRequestUrl(null);
                        serviceTokenByPassToken = AccountHelper.getServiceTokenByPassToken(this.mContext, builderPackageName.build());
                        xiaomiAccountManager = XiaomiAccountManager.get(this.mContext);
                        if (!TextUtils.isEmpty(serviceTokenByPassToken.passToken) || realPasstoken.equals(serviceTokenByPassToken.passToken)) {
                            xiaomiAccountManager.updateAccountInfo(account, serviceTokenByPassToken);
                        } else {
                            xiaomiAccountManager.addAccountOrUpdatePassToken(serviceTokenByPassToken);
                        }
                        authenticatorResponseBundle = AccountHelper.getAuthenticatorResponseBundle(serviceTokenByPassToken, false);
                        if (authenticatorResponseBundle != null) {
                            bundle3.putAll(authenticatorResponseBundle);
                        }
                        AccountLogger.log(TAG, String.format("type: %s, package name: %s, getAuthToken succeed", str, string));
                    } catch (InvalidCredentialException e) {
                        e = e;
                        bundle2 = bundle;
                        AccountLogger.log(TAG, "invalid credential, passToken is invalid", e);
                        XiaomiAccountManager.get(this.mContext).clearPassword(account);
                        bundle2.putString("captcha_url", e.getCaptchaUrl());
                        fillQuickLoginIntent(bundle3, accountAuthenticatorResponse, true, account, str2, bundle);
                    }
                    return bundle3;
                } catch (InvalidCredentialException e2) {
                    e = e2;
                }
            } catch (IllegalDeviceException e3) {
                AccountLogger.log(TAG, "get device id failed when getting service token", e3);
                bundle3.putInt("errorCode", 3);
                bundle3.putString("errorMessage", "illegal device exception");
            } catch (InvalidUserNameException e4) {
                AccountLogger.log(TAG, "no such a user", e4);
            } catch (NeedNotificationException e5) {
                AccountLogger.log(TAG, "need notification ", e5);
                if (strSubstring != null) {
                    AccountLogger.log(TAG, "websso return notification url: " + str2);
                    bundle3.putString("authAccount", account.name);
                    bundle3.putString("accountType", "weblogin:com.xiaomi");
                    bundle3.putString("authtoken", e5.getNotificationUrl());
                    return bundle3;
                }
                bundle3.putParcelable("intent", XiaomiAccountManager.get(this.mContext).getAccountNotificationActivityIntent(str2, e5.getNotificationUrl(), bundle, accountAuthenticatorResponse));
            } catch (PackageNameDeniedException e6) {
                AccountLogger.log(TAG, "package name denied: " + string, e6);
                bundle3.putInt("errorCode", 9);
                bundle3.putString("errorMessage", e6.toString());
            } catch (AccessDeniedException e7) {
                AccountLogger.log(TAG, "access denied", e7);
                bundle3.putInt("errorCode", 5);
                bundle3.putString("errorMessage", e7.toString());
            } catch (AuthenticationFailureException e8) {
                AccountLogger.log(TAG, "auth failure", e8);
                bundle3.putInt("errorCode", 5);
                bundle3.putString("errorMessage", e8.toString());
            } catch (InvalidResponseException e9) {
                AccountLogger.log(TAG, "invalid response received when getting service token", e9);
                bundle3.putInt("errorCode", 5);
                bundle3.putString("errorMessage", e9.toString());
            } catch (IOException e10) {
                AccountLogger.log(TAG, "io exception when getting service token", e10);
                bundle3.putInt("errorCode", 3);
                bundle3.putString("errorMessage", e10.toString());
            }
        }
        strSubstring = null;
        realPasstoken = getRealPasstoken(account);
        if (TextUtils.isEmpty(realPasstoken)) {
            fillQuickLoginIntent(bundle3, accountAuthenticatorResponse, true, account, str2, bundle);
            AccountLogger.log(TAG, "passToken is null");
            return bundle3;
        }
        builderPackageName = new PassTokenLoginParams.Builder().userId(account.name).passToken(realPasstoken).packageName(string);
        if (strSubstring != null) {
            builderPackageName.serviceId(null);
            builderPackageName.loginRequestUrl(strSubstring);
            AccountInfo serviceTokenByPassToken3 = AccountHelper.getServiceTokenByPassToken(this.mContext, builderPackageName.build());
            bundle3.putString("authAccount", serviceTokenByPassToken3.getUserId());
            bundle3.putString("accountType", "weblogin:com.xiaomi");
            bundle3.putString("authtoken", serviceTokenByPassToken3.getAutoLoginUrl());
            AccountLogger.log(TAG, "web sso getAuthToken succeed");
            return bundle3;
        }
        builderPackageName.serviceId(str2);
        builderPackageName.loginRequestUrl(null);
        serviceTokenByPassToken = AccountHelper.getServiceTokenByPassToken(this.mContext, builderPackageName.build());
        xiaomiAccountManager = XiaomiAccountManager.get(this.mContext);
        if (TextUtils.isEmpty(serviceTokenByPassToken.passToken)) {
            xiaomiAccountManager.updateAccountInfo(account, serviceTokenByPassToken);
        } else {
            xiaomiAccountManager.updateAccountInfo(account, serviceTokenByPassToken);
        }
        authenticatorResponseBundle = AccountHelper.getAuthenticatorResponseBundle(serviceTokenByPassToken, false);
        if (authenticatorResponseBundle != null) {
            bundle3.putAll(authenticatorResponseBundle);
        }
        AccountLogger.log(TAG, String.format("type: %s, package name: %s, getAuthToken succeed", str, string));
        return bundle3;
    }

    private String getRealPasstoken(Account account) {
        return XiaomiAccountManager.get(this.mContext).getPassToken(account);
    }

    @Override // com.xiaomi.accounts.AbstractAccountAuthenticator
    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) throws NetworkErrorException {
        Account xiaomiAccount = XiaomiAccountManager.get(this.mContext).getXiaomiAccount();
        Bundle bundle2 = new Bundle();
        if (xiaomiAccount != null) {
            AccountLogger.log(TAG, "a xiaomi account already exists");
            bundle2.putString("authAccount", xiaomiAccount.name);
            bundle2.putString("accountType", xiaomiAccount.type);
        } else {
            if (TextUtils.isEmpty(str2)) {
                AccountLogger.log(TAG, "no service id contained, use passportapi");
                str2 = "passportapi";
            }
            bundle2.putParcelable("intent", XiaomiAccountManager.get(this.mContext).getAccountLoginActivityIntent(str2, bundle, accountAuthenticatorResponse));
        }
        return bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    @Override // com.xiaomi.accounts.AbstractAccountAuthenticator
    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) throws NetworkErrorException {
        AccountInfo accountInfoBuild;
        String captchaUrl;
        Bundle bundle2 = new Bundle();
        AccountInfo accountInfo = null;
        if (bundle == null || !bundle.containsKey("password")) {
            String password = XiaomiAccountManager.get(this.mContext).getPassword(account);
            if ((bundle == null || bundle.getBoolean("verify_only", true)) && TextUtils.isEmpty(password)) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("verify_only", false);
            }
            Bundle bundle3 = bundle;
            fillQuickLoginIntent(bundle2, accountAuthenticatorResponse, false, account, bundle3 != null ? bundle3.getString("service_id") : null, bundle3);
        } else {
            String str = account.name;
            try {
                accountInfoBuild = AccountHelper.getServiceTokenByPassword(str, bundle.getString("password"), bundle.getString("captcha_code"), bundle.getString("captcha_ick"), null);
            } catch (IllegalDeviceException e) {
                e.printStackTrace();
                captchaUrl = null;
                bundle2.putString("authAccount", str);
                bundle2.putString("accountType", "com.xiaomi");
                bundle2.putBoolean("booleanResult", accountInfo != null);
                bundle2.putString("captcha_url", captchaUrl);
                return bundle2;
            } catch (InvalidCredentialException e2) {
                captchaUrl = e2.getCaptchaUrl();
                e2.printStackTrace();
            } catch (InvalidUserNameException e3) {
                e3.printStackTrace();
                captchaUrl = null;
                bundle2.putString("authAccount", str);
                bundle2.putString("accountType", "com.xiaomi");
                bundle2.putBoolean("booleanResult", accountInfo != null);
                bundle2.putString("captcha_url", captchaUrl);
                return bundle2;
            } catch (NeedCaptchaException e4) {
                captchaUrl = e4.getCaptchaUrl();
                e4.printStackTrace();
            } catch (NeedVerificationException unused) {
                accountInfoBuild = new AccountInfo.Builder().userId(str).build();
            } catch (AccessDeniedException e5) {
                e5.printStackTrace();
                captchaUrl = null;
                bundle2.putString("authAccount", str);
                bundle2.putString("accountType", "com.xiaomi");
                bundle2.putBoolean("booleanResult", accountInfo != null);
                bundle2.putString("captcha_url", captchaUrl);
                return bundle2;
            } catch (AuthenticationFailureException e6) {
                e6.printStackTrace();
                captchaUrl = null;
                bundle2.putString("authAccount", str);
                bundle2.putString("accountType", "com.xiaomi");
                bundle2.putBoolean("booleanResult", accountInfo != null);
                bundle2.putString("captcha_url", captchaUrl);
                return bundle2;
            } catch (InvalidResponseException e7) {
                e7.printStackTrace();
                captchaUrl = null;
                bundle2.putString("authAccount", str);
                bundle2.putString("accountType", "com.xiaomi");
                bundle2.putBoolean("booleanResult", accountInfo != null);
                bundle2.putString("captcha_url", captchaUrl);
                return bundle2;
            } catch (IOException e8) {
                throw new NetworkErrorException("IO exception when sending request to passport server", e8);
            }
            captchaUrl = null;
            accountInfo = accountInfoBuild;
            bundle2.putString("authAccount", str);
            bundle2.putString("accountType", "com.xiaomi");
            bundle2.putBoolean("booleanResult", accountInfo != null);
            bundle2.putString("captcha_url", captchaUrl);
        }
        return bundle2;
    }

    @Override // com.xiaomi.accounts.AbstractAccountAuthenticator
    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        return null;
    }

    @Override // com.xiaomi.accounts.AbstractAccountAuthenticator
    public Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account) throws NetworkErrorException {
        Bundle bundle = new Bundle();
        bundle.putBoolean("booleanResult", true);
        return bundle;
    }

    @Override // com.xiaomi.accounts.AbstractAccountAuthenticator
    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        return recheckAuthTokenResult(getAuthTokenBundle(accountAuthenticatorResponse, account, str, bundle));
    }

    @Override // com.xiaomi.accounts.AbstractAccountAuthenticator
    public String getAuthTokenLabel(String str) {
        return null;
    }

    @Override // com.xiaomi.accounts.AbstractAccountAuthenticator
    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) throws NetworkErrorException {
        return null;
    }

    public Bundle recheckAuthTokenResult(Bundle bundle) {
        if (XiaomiAccountManager.get(this.mContext).getXiaomiAccount() != null) {
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("booleanResult", false);
        return bundle2;
    }

    @Override // com.xiaomi.accounts.AbstractAccountAuthenticator
    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) throws NetworkErrorException {
        throw new UnsupportedOperationException("updateCredentials not supported");
    }
}
