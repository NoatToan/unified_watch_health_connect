package com.huami.passport.auth.entity;

import com.android.volley.AuthFailureError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.huami.passport.auth.IError;
import com.huami.passport.auth.entity.AuthError;
import com.huami.tools.log.HMLog;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AuthError {
    public int errorCode;
    public String errorMsg;

    public AuthError(int i, String str) {
        this.errorCode = i;
        this.errorMsg = str;
    }

    public static AuthError builder(int i, String str) {
        return new AuthError(i, str);
    }

    public static IError getError(Exception exc) {
        if (exc instanceof ExecutionException) {
            try {
                exc = (VolleyError) exc.getCause();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (exc instanceof AuthFailureError) {
            HMLog.debug(new Function0() { // from class: uj
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AuthError.lambda$getError$0();
                }
            });
        }
        if (exc instanceof NoConnectionError) {
            return IError.EC_10005;
        }
        if (exc instanceof ParseError) {
            return IError.EC_10012;
        }
        if (exc instanceof ServerError) {
            HMLog.debug(new Function0() { // from class: tj
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AuthError.lambda$getError$1();
                }
            });
        }
        if (exc instanceof TimeoutError) {
            HMLog.debug(new Function0() { // from class: vj
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AuthError.lambda$getError$2();
                }
            });
        }
        return IError.EC_10006;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getError$0() {
        return "AuthFailureError";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getError$1() {
        return "ServerError";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getError$2() {
        return "TimeoutError";
    }

    public String toString() {
        return "AuthError{errorCode=" + this.errorCode + ", errorMsg='" + this.errorMsg + "'}";
    }

    public static AuthError builder(IError iError) {
        return new AuthError(iError.errorCode, iError.errorMsg);
    }

    public AuthError(IError iError) {
        this.errorCode = iError.errorCode;
        this.errorMsg = iError.errorMsg;
    }
}
