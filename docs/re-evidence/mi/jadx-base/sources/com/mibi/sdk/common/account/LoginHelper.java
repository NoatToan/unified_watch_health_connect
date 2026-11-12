package com.mibi.sdk.common.account;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.account.loader.AccountLoader;
import com.mibi.sdk.common.utils.MibiLog;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class LoginHelper {
    private static final String TAG = "LoginHelper";

    public static abstract class AddAccountCallback implements AccountManagerCallback<Bundle>, LoginCallback {
        public AddAccountCallback(Context context) {
        }

        @Override // android.accounts.AccountManagerCallback
        public void run(AccountManagerFuture<Bundle> accountManagerFuture) {
            if (accountManagerFuture.isDone()) {
                try {
                    if (accountManagerFuture.getResult() == null) {
                        MibiLog.d(LoginHelper.TAG, "loginSystem failed : authentication failed");
                        onFailed(5, "authentication failed");
                        return;
                    }
                    Account miAccount = AccountUtils.getMiAccount();
                    if (miAccount != null) {
                        onSuccess(miAccount);
                    } else {
                        MibiLog.d(LoginHelper.TAG, "loginSystem failed : authentication failed");
                        onFailed(5, "authentication failed");
                    }
                } catch (AuthenticatorException e) {
                    MibiLog.d(LoginHelper.TAG, "loginSystem failed : authenticator exception " + e);
                    onFailed(5, e.getMessage());
                } catch (OperationCanceledException e2) {
                    MibiLog.d(LoginHelper.TAG, "loginSystem failed : user canceled " + e2);
                    onFailed(0, e2.getMessage());
                } catch (IOException e3) {
                    MibiLog.d(LoginHelper.TAG, "loginSystem failed : io exception " + e3);
                    onFailed(3, e3.getMessage());
                }
            }
        }
    }

    public interface LoginCallback {
        void onFailed(int i, String str);

        void onSuccess(Account account);
    }

    public interface LoginWithResult {
        void onLoginFailed(int i, String str);

        void onLoginSuccess(AccountLoader accountLoader);
    }

    private LoginHelper() {
    }

    public static void login(Activity activity, LoginWithResult loginWithResult) {
        login(activity, false, loginWithResult);
    }

    private static void loginSystem(Activity activity, final LoginWithResult loginWithResult) {
        Account miAccount = AccountUtils.getMiAccount();
        if (miAccount != null) {
            loginWithResult.onLoginSuccess(AccountUtils.newMiAccountLoader(miAccount));
        } else {
            AccountRegistry.getAccountProvider().addAccount(CommonConstants.SERVICE_ID, null, new AddAccountCallback(activity) { // from class: com.mibi.sdk.common.account.LoginHelper.1
                @Override // com.mibi.sdk.common.account.LoginHelper.LoginCallback
                public void onFailed(int i, String str) {
                    loginWithResult.onLoginFailed(i, str);
                }

                @Override // com.mibi.sdk.common.account.LoginHelper.LoginCallback
                public void onSuccess(Account account) {
                    loginWithResult.onLoginSuccess(AccountUtils.newMiAccountLoader(account));
                }
            }, null);
        }
    }

    public static void login(Activity activity, boolean z, LoginWithResult loginWithResult) {
        if (loginWithResult == null) {
            throw new IllegalArgumentException("login callback not be null");
        }
        if (z) {
            loginWithResult.onLoginSuccess(AccountUtils.newFakeAccountLoader());
        } else {
            loginSystem(activity, loginWithResult);
        }
    }
}
