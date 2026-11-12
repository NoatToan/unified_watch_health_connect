package com.miui.tsmclient.net;

import com.miui.tsmclient.account.AccountInfo;
import com.xiaomi.accountsdk.request.AccessDeniedException;
import com.xiaomi.accountsdk.request.AuthenticationFailureException;
import com.xiaomi.accountsdk.request.CipherException;
import com.xiaomi.accountsdk.request.InvalidResponseException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public interface IAuthClient {
    public static final String KEY_DATA = "data";
    public static final String KEY_ERR_CODE = "errCode";
    public static final String KEY_ERR_DESC = "errDesc";
    public static final String KEY_ERR_INFO = "errInfo";

    Object sendGetRequest(AccountInfo accountInfo, AuthRequest authRequest) throws AccessDeniedException, CipherException, IOException, AuthApiException, InvalidResponseException, AuthenticationFailureException;

    Object sendPostRequest(AccountInfo accountInfo, AuthRequest authRequest) throws AccessDeniedException, CipherException, IOException, AuthApiException, InvalidResponseException, AuthenticationFailureException;
}
