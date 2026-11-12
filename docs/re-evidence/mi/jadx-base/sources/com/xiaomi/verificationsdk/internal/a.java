package com.xiaomi.verificationsdk.internal;

import com.xiaomi.accountsdk.request.AccessDeniedException;
import com.xiaomi.accountsdk.request.AuthenticationFailureException;
import com.xiaomi.accountsdk.request.SimpleRequest;
import com.xiaomi.accountsdk.request.SimpleRequestForAccount;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.accountsdk.utils.EasyMap;
import defpackage.mb4;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static mb4 a(String str) {
        try {
            SimpleRequest.StringContent asString = SimpleRequestForAccount.getAsString(str, new EasyMap().easyPut("type", String.valueOf(2)), null, null, true);
            if (asString == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(asString.getBody());
            int iOptInt = jSONObject.optInt("maxDuration");
            int iOptInt2 = jSONObject.optInt("frequency");
            mb4 mb4Var = new mb4();
            mb4Var.d(iOptInt);
            mb4Var.c(iOptInt2);
            return mb4Var;
        } catch (AccessDeniedException e) {
            e.printStackTrace();
            return null;
        } catch (AuthenticationFailureException e2) {
            e2.printStackTrace();
            return null;
        } catch (IOException e3) {
            e3.printStackTrace();
            return null;
        } catch (JSONException e4) {
            AccountLogger.log("VerifyRequest", "fail to parse JSONObject", e4);
            return null;
        }
    }
}
