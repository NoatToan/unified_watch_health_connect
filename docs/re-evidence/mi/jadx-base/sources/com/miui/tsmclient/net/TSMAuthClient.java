package com.miui.tsmclient.net;

import com.miui.tsmclient.account.AccountInfo;
import com.xiaomi.accountsdk.request.AccessDeniedException;
import com.xiaomi.accountsdk.request.AuthenticationFailureException;
import com.xiaomi.accountsdk.request.CipherException;
import com.xiaomi.accountsdk.request.InvalidResponseException;
import com.xiaomi.accountsdk.request.SecureRequest;
import java.io.IOException;
import java.net.CookieHandler;

/* JADX INFO: loaded from: classes6.dex */
class TSMAuthClient extends BaseAuthClient {
    @Override // com.miui.tsmclient.net.IAuthClient
    public Object sendGetRequest(AccountInfo accountInfo, AuthRequest authRequest) throws AccessDeniedException, CipherException, IOException, AuthApiException, InvalidResponseException, AuthenticationFailureException {
        if (accountInfo == null) {
            return null;
        }
        CookieHandler cookieHandler = CookieHandler.getDefault();
        try {
            authRequest.addParams("userId", accountInfo.getUserId());
            return handleResult(SecureRequest.getAsString(authRequest.getRequestFullUrl(), authRequest.getParams(), authRequest.getCookies(), true, accountInfo.getSecurity(), null, null, authRequest.getHeaders()).getBody(), authRequest.getRespContentType());
        } finally {
            CookieHandler.setDefault(cookieHandler);
        }
    }

    @Override // com.miui.tsmclient.net.IAuthClient
    public Object sendPostRequest(AccountInfo accountInfo, AuthRequest authRequest) throws AccessDeniedException, CipherException, IOException, AuthApiException, InvalidResponseException, AuthenticationFailureException {
        if (accountInfo == null) {
            return null;
        }
        CookieHandler cookieHandler = CookieHandler.getDefault();
        try {
            authRequest.addParams("userId", accountInfo.getUserId());
            return handleResult(SecureRequest.postAsString(authRequest.getRequestFullUrl(), authRequest.getParams(), authRequest.getCookies(), true, accountInfo.getSecurity(), null, null, authRequest.getHeaders()).getBody(), authRequest.getRespContentType());
        } finally {
            CookieHandler.setDefault(cookieHandler);
        }
    }
}
