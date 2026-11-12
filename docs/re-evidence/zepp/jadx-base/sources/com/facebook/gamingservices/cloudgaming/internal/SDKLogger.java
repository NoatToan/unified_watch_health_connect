package com.facebook.gamingservices.cloudgaming.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.facebook.FacebookRequestError;
import com.facebook.appevents.InternalAppEventsLogger;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class SDKLogger {
    private static SDKLogger f;
    private final InternalAppEventsLogger a;
    private String b = null;
    private String c = null;
    private String d = null;
    private ConcurrentHashMap<String, String> e = new ConcurrentHashMap<>();

    private SDKLogger(Context context) {
        this.a = new InternalAppEventsLogger(context);
    }

    private Bundle a() {
        Bundle bundle = new Bundle();
        String str = this.b;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = this.d;
        if (str2 != null) {
            bundle.putString("session_id", str2);
        }
        return bundle;
    }

    private Bundle b(@Nullable String str) {
        Bundle bundleA = a();
        if (str != null) {
            String orDefault = this.e.getOrDefault(str, null);
            bundleA.putString("request_id", str);
            if (orDefault != null) {
                bundleA.putString(SDKAnalyticsEvents.PARAMETER_FUNCTION_TYPE, orDefault);
                this.e.remove(str);
            }
        }
        return bundleA;
    }

    private Bundle c(String str, String str2) {
        Bundle bundleA = a();
        bundleA.putString("request_id", str);
        bundleA.putString(SDKAnalyticsEvents.PARAMETER_FUNCTION_TYPE, str2);
        return bundleA;
    }

    public static synchronized SDKLogger getInstance(Context context) {
        if (f == null) {
            f = new SDKLogger(context);
        }
        return f;
    }

    public static void logInternalError(Context context, SDKMessageEnum sDKMessageEnum, Exception exc) {
        getInstance(context).logInternalError(sDKMessageEnum, exc);
    }

    public void logGameLoadComplete() {
        this.a.logEventImplicitly(SDKAnalyticsEvents.EVENT_GAME_LOAD_COMPLETE, a());
    }

    public void logLoginSuccess() {
        this.a.logEventImplicitly(SDKAnalyticsEvents.EVENT_LOGIN_SUCCESS, a());
    }

    public void logPreparingRequest(String str, String str2, JSONObject jSONObject) {
        Bundle bundleC = c(str2, str);
        bundleC.putString("payload", jSONObject.toString());
        this.a.logEventImplicitly(SDKAnalyticsEvents.EVENT_PREPARING_REQUEST, bundleC);
    }

    public void logSendingErrorResponse(FacebookRequestError facebookRequestError, @Nullable String str) {
        Bundle bundleB = b(str);
        bundleB.putString("error_code", Integer.toString(facebookRequestError.getErrorCode()));
        bundleB.putString("error_type", facebookRequestError.getErrorType());
        bundleB.putString("error_message", facebookRequestError.getErrorMessage());
        this.a.logEventImplicitly(SDKAnalyticsEvents.EVENT_SENDING_ERROR_RESPONSE, bundleB);
    }

    public void logSendingSuccessResponse(String str) {
        this.a.logEventImplicitly(SDKAnalyticsEvents.EVENT_SENDING_SUCCESS_RESPONSE, b(str));
    }

    public void logSentRequest(String str, String str2, JSONObject jSONObject) {
        Bundle bundleC = c(str2, str);
        this.e.put(str2, str);
        bundleC.putString("payload", jSONObject.toString());
        this.a.logEventImplicitly(SDKAnalyticsEvents.EVENT_SENT_REQUEST, bundleC);
    }

    public void setAppID(String str) {
        this.b = str;
    }

    public void setSessionID(String str) {
        this.d = str;
    }

    public void setUserID(String str) {
        this.c = str;
    }

    public void logInternalError(SDKMessageEnum sDKMessageEnum, Exception exc) {
        Bundle bundleA = a();
        bundleA.putString(SDKAnalyticsEvents.PARAMETER_FUNCTION_TYPE, sDKMessageEnum.toString());
        bundleA.putString("error_type", exc.getClass().getName());
        bundleA.putString("error_message", exc.getMessage());
        this.a.logEventImplicitly(SDKAnalyticsEvents.EVENT_INTERNAL_ERROR, bundleA);
    }
}
