package com.xiaomi.accountsdk.utils;

import com.xiaomi.accountsdk.account.data.ExtendedAuthToken;
import com.xiaomi.accountsdk.request.AccessDeniedException;
import com.xiaomi.accountsdk.request.AuthenticationFailureException;
import com.xiaomi.accountsdk.request.CipherException;
import com.xiaomi.accountsdk.request.InvalidResponseException;
import com.xiaomi.accountsdk.request.SecureRequestForAccount;
import com.xiaomi.accountsdk.request.SimpleRequest;
import java.io.IOException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class XMPassportApiRequest {

    public enum WebMethod {
        POST,
        GET
    }

    public abstract void addParams(EasyMap<String, String> easyMap);

    public abstract boolean allowRetryAuthToken();

    public String execute() throws AccessDeniedException, JSONException, CipherException, IOException, InvalidResponseException {
        String authToken;
        ExtendedAuthToken extendedAuthToken;
        for (int i = 0; i < 2 && (extendedAuthToken = ExtendedAuthToken.parse((authToken = getAuthToken()))) != null; i++) {
            String str = extendedAuthToken.authToken;
            String str2 = extendedAuthToken.security;
            if (str == null || str2 == null) {
                return null;
            }
            EasyMap<String, String> easyMap = new EasyMap<>();
            addParams(easyMap);
            EasyMap easyMap2 = new EasyMap();
            easyMap2.easyPut("serviceToken", str);
            String cUserId = getCUserId();
            if (cUserId != null) {
                easyMap2.easyPut("cUserId", cUserId);
            } else {
                easyMap2.easyPut("userId", getUserId());
            }
            try {
                SimpleRequest.MapContent asMap = getWebMethod() == WebMethod.GET ? SecureRequestForAccount.getAsMap(getUrl(), easyMap, easyMap2, true, str2, new AESCoder(str2)) : SecureRequestForAccount.postAsMap(getUrl(), easyMap, easyMap2, true, str2, new AESCoder(str2));
                if (asMap == null) {
                    return null;
                }
                return handleDataResult(asMap.getFromBody("data"));
            } catch (AuthenticationFailureException unused) {
                if (!allowRetryAuthToken()) {
                    return null;
                }
                invalidateAuthToken(authToken);
            }
        }
        return null;
    }

    public abstract String getAuthToken();

    public abstract String getCUserId();

    public abstract String getUrl();

    public abstract String getUserId();

    public abstract WebMethod getWebMethod();

    public abstract String handleDataResult(Object obj) throws JSONException;

    public abstract void invalidateAuthToken(String str);
}
