package com.miui.tsmclient.net;

import com.miui.tsmclient.account.AccountInfo;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.xiaomi.accountsdk.request.AccessDeniedException;
import com.xiaomi.accountsdk.request.AuthenticationFailureException;
import com.xiaomi.accountsdk.request.SimpleRequest;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
class OAuthClient extends BaseAuthClient {
    @Override // com.miui.tsmclient.net.IAuthClient
    public Object sendGetRequest(AccountInfo accountInfo, AuthRequest authRequest) throws AccessDeniedException, IOException, AuthApiException, AuthenticationFailureException {
        if (accountInfo == null) {
            return null;
        }
        authRequest.addParams("clientId", EnvironmentConfig.getClientId());
        authRequest.addParams("token", accountInfo.getAuthToken());
        authRequest.addParams("userId", accountInfo.getUserId());
        return handleResult(SimpleRequest.getAsString(authRequest.getRequestFullUrl(), authRequest.getParams(), authRequest.getHeaders(), authRequest.getCookies(), true).getBody(), authRequest.getRespContentType());
    }

    @Override // com.miui.tsmclient.net.IAuthClient
    public Object sendPostRequest(AccountInfo accountInfo, AuthRequest authRequest) throws AccessDeniedException, IOException, AuthApiException, AuthenticationFailureException {
        if (accountInfo == null) {
            return null;
        }
        authRequest.addParams("clientId", EnvironmentConfig.getClientId());
        authRequest.addParams("token", accountInfo.getAuthToken());
        authRequest.addParams("userId", accountInfo.getUserId());
        return handleResult(SimpleRequest.postAsString(authRequest.getRequestFullUrl(), authRequest.getParams(), authRequest.getCookies(), authRequest.getHeaders(), true, (Integer) null).getBody(), authRequest.getRespContentType());
    }
}
