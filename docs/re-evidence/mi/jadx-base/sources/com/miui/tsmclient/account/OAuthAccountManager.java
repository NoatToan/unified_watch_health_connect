package com.miui.tsmclient.account;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.account.internal.ExtendedAuthToken;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ReflectUtil;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public class OAuthAccountManager implements IAccountManager {
    private static final int GET_TOKEN_TIMEOUT = 30000;
    private static final int MAX_RETRY_COUNT = 1;
    private IMiOAuth mMiOAuth;
    private ThreadLocal<Integer> mRetryCount = new ThreadLocal<Integer>() { // from class: com.miui.tsmclient.account.OAuthAccountManager.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Integer initialValue() {
            return 0;
        }
    };

    public final class MiOAuthConstant {
        public static final String TOKEN = "accessToken";
        public static final String USER_ID = "userId";

        private MiOAuthConstant() {
        }
    }

    private IMiOAuth getMiOAuth(Context context) {
        IMiOAuth miOAuth = EnvironmentConfig.getMiOAuth();
        this.mMiOAuth = miOAuth;
        if (miOAuth == null) {
            if (context == null) {
                return null;
            }
            Object objNewInstance = ReflectUtil.newInstance(context.getPackageName() + ".mitsmsdk.MiOAuthImpl", (Class<?>[]) new Class[]{Context.class}, context);
            if (!(objNewInstance instanceof IMiOAuth)) {
                throw new IllegalStateException("MiOAuthImpl can not be found!");
            }
            this.mMiOAuth = (IMiOAuth) objNewInstance;
        }
        return this.mMiOAuth;
    }

    @Override // com.miui.tsmclient.account.IAccountManager
    public AccountManagerFuture<Bundle> addAccount(Activity activity, AccountManagerCallback accountManagerCallback) {
        return null;
    }

    @Override // com.miui.tsmclient.account.IAccountManager
    public AccountManagerFuture<Bundle> confirmCredentials(Activity activity, AccountManagerCallback accountManagerCallback) {
        return null;
    }

    @Override // com.miui.tsmclient.account.IAccountManager
    public Account getAccount(Context context) {
        return null;
    }

    @Override // com.miui.tsmclient.account.IAccountManager
    public AccountInfo loadAccountInfo(Context context) {
        return loadAccountInfo(context, (String) null);
    }

    @Override // com.miui.tsmclient.account.IAccountManager
    public void resetAccount(Context context, String str, String str2) {
        IMiOAuth miOAuth = getMiOAuth(context);
        if (miOAuth != null) {
            if (!EnvironmentConfig.isLoginAuth()) {
                str = EnvironmentConfig.getClientId();
            }
            miOAuth.invalidateAccessToken(str, str2);
        }
    }

    @Override // com.miui.tsmclient.account.IAccountManager
    public AccountInfo loadAccountInfo(Context context, String str) {
        IMiOAuth miOAuth = getMiOAuth(context);
        if (miOAuth == null) {
            return null;
        }
        String clientId = EnvironmentConfig.isLoginAuth() ? str : EnvironmentConfig.getClientId();
        Future<Bundle> accessToken = miOAuth.getAccessToken(clientId);
        try {
            Bundle bundle = accessToken.get(30000L, TimeUnit.MILLISECONDS);
            if (accessToken.isDone() && bundle != null) {
                String string = bundle.getString(MiOAuthConstant.TOKEN);
                AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(bundle.getString("userId"), string);
                if (accountInfoLoadAccountInfo != null) {
                    this.mRetryCount.set(0);
                    return accountInfoLoadAccountInfo;
                }
                if (this.mRetryCount.get().intValue() < 1) {
                    LogUtils.d("getAccessToken met an invalid token, so invalidateAuthToken.");
                    miOAuth.invalidateAccessToken(clientId, string);
                    ThreadLocal<Integer> threadLocal = this.mRetryCount;
                    threadLocal.set(Integer.valueOf(threadLocal.get().intValue() + 1));
                    return loadAccountInfo(context, str);
                }
                this.mRetryCount.set(0);
                LogUtils.w("After invalidating the AccessToken, but result is still invalid.");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            LogUtils.e("OAuthAccountManager#loadAccountInfo invoke failed with an InterruptedException!", e);
        } catch (ExecutionException e2) {
            LogUtils.e("OAuthAccountManager#loadAccountInfo invoke failed with an ExecutionException!", e2);
        } catch (TimeoutException e3) {
            LogUtils.e("OAuthAccountManager#loadAccountInfo invoke failed with an TimeoutException!", e3);
        }
        return null;
    }

    private AccountInfo loadAccountInfo(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        AccountInfo accountInfo = new AccountInfo();
        if (EnvironmentConfig.isLoginAuth()) {
            ExtendedAuthToken extendedAuthToken = ExtendedAuthToken.parse(str2);
            if (extendedAuthToken != null) {
                accountInfo.setServiceToken(extendedAuthToken.authToken);
                accountInfo.setSecurity(extendedAuthToken.security);
            } else {
                LogUtils.d("extendedAuthToken is null as token format is not right");
                return null;
            }
        }
        accountInfo.setUserId(str);
        accountInfo.setAuthToken(str2);
        return accountInfo;
    }
}
