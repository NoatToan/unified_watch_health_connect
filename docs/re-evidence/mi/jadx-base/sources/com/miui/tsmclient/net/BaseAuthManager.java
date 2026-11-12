package com.miui.tsmclient.net;

import android.content.Context;
import com.miui.tsmclient.account.AccountInfo;
import com.miui.tsmclient.account.AccountManagerFactory;
import com.miui.tsmclient.account.IAccountManager;
import com.miui.tsmclient.common.net.HttpLifecycleManager;
import com.miui.tsmclient.common.net.host.AuthHost;
import com.miui.tsmclient.common.net.host.Host;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.NetworkUtil;
import com.xiaomi.accountsdk.request.AccessDeniedException;
import com.xiaomi.accountsdk.request.AuthenticationFailureException;
import com.xiaomi.accountsdk.request.CipherException;
import com.xiaomi.accountsdk.request.InvalidResponseException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class BaseAuthManager {
    private static final String REQUEST_METHOD_GET = "GET";
    private static final String REQUEST_METHOD_POST = "POST";
    protected Host mHost;
    private IAuthClient mAuthClient = AuthClientFactory.createAuthClient();
    protected IAccountManager mAccountManager = AccountManagerFactory.createAccountManager();

    public BaseAuthManager() {
        initHost();
    }

    private Object retry(Context context, AccountInfo accountInfo, AuthRequest authRequest, boolean z) throws AuthApiException {
        this.mAccountManager.resetAccount(context, this.mHost.getServiceId(), accountInfo.getAuthToken());
        AccountInfo accountInfo2 = getAccountInfo(context);
        try {
            return z ? this.mAuthClient.sendPostRequest(accountInfo2, authRequest) : this.mAuthClient.sendGetRequest(accountInfo2, authRequest);
        } catch (IOException unused) {
            throw new AuthApiException(2);
        } catch (Exception e) {
            LogUtils.e("An AuthenticationFailureException happened, so retry, but still failed!", e);
            throw new AuthApiException(7);
        }
    }

    private Object sendRequestInternal(Context context, AccountInfo accountInfo, AuthRequest authRequest, String str) throws AuthApiException {
        try {
            if ("POST".equals(str)) {
                return this.mAuthClient.sendPostRequest(accountInfo, authRequest);
            }
            if ("GET".equals(str)) {
                return this.mAuthClient.sendGetRequest(accountInfo, authRequest);
            }
            throw new AuthApiException(7);
        } catch (AccessDeniedException e) {
            LogUtils.e(authRequest.getClass().getName() + " send failed with an AccessDeniedException!So return null!", e);
        } catch (AuthenticationFailureException e2) {
            LogUtils.e(authRequest.getClass().getName() + " send failed with an AuthenticationFailureException!Now retry", e2);
            return retry(context, accountInfo, authRequest, false);
        } catch (CipherException e3) {
            LogUtils.e(authRequest.getClass().getName() + " send failed with a CipherException!So return null!", e3);
        } catch (InvalidResponseException e4) {
            e = e4;
            LogUtils.e(authRequest.getClass().getName() + " send failed! So return null! msg: " + e, e);
            throw new AuthApiException(2);
        } catch (IOException e5) {
            e = e5;
            LogUtils.e(authRequest.getClass().getName() + " send failed! So return null! msg: " + e, e);
            throw new AuthApiException(2);
        }
    }

    private Object sendRequestMiddle(Context context, AccountInfo accountInfo, AuthRequest authRequest, String str) throws Throwable {
        if (!NetworkUtil.isConnected(context)) {
            throw new AuthApiException(2);
        }
        String requestFullUrl = authRequest.getRequestFullUrl();
        int i = 401;
        try {
            HttpLifecycleManager.getInstance().onStart(requestFullUrl);
            Object objSendRequestInternal = sendRequestInternal(context, accountInfo, authRequest, str);
            HttpLifecycleManager.getInstance().onStop(requestFullUrl, 200);
            LogUtils.t("BaseAuthManager request_url:" + requestFullUrl + " response:" + objSendRequestInternal);
            return objSendRequestInternal;
        } catch (AuthApiException e) {
            try {
                throw e;
            } catch (Throwable th) {
                th = th;
                i = -1;
                HttpLifecycleManager.getInstance().onStop(requestFullUrl, i);
                LogUtils.t("BaseAuthManager request_url:" + requestFullUrl + " response:" + ((Object) null));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            HttpLifecycleManager.getInstance().onStop(requestFullUrl, i);
            LogUtils.t("BaseAuthManager request_url:" + requestFullUrl + " response:" + ((Object) null));
            throw th;
        }
    }

    public AccountInfo getAccountInfo(Context context) throws AuthApiException {
        AccountInfo accountInfoLoadAccountInfo = this.mAccountManager.loadAccountInfo(context, this.mHost.getServiceId());
        if (accountInfoLoadAccountInfo == null || !accountInfoLoadAccountInfo.isValid()) {
            throw new AuthApiException(14);
        }
        return accountInfoLoadAccountInfo;
    }

    public void initHost() {
        this.mHost = new AuthHost();
    }

    public Object sendGetRequest(Context context, AccountInfo accountInfo, AuthRequest authRequest) throws AuthApiException {
        return sendRequestMiddle(context, accountInfo, authRequest, "GET");
    }

    public Object sendRequest(Context context, AccountInfo accountInfo, AuthRequest authRequest) throws AuthApiException {
        return sendRequestMiddle(context, accountInfo, authRequest, "POST");
    }
}
