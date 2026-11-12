package com.facebook.gamingservices.cloudgaming;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKLogger;
import java.net.HttpURLConnection;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DaemonReceiver {

    @Nullable
    private static DaemonReceiver a;
    private static ConcurrentHashMap<String, CompletableFuture<GraphResponse>> b;
    private static SDKLogger c;

    public static class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CompletableFuture completableFuture;
            try {
                JSONObject jSONObject = new JSONObject(intent.getStringExtra(SDKConstants.RECEIVER_PAYLOAD));
                String string = jSONObject.getString(SDKConstants.REQUEST_ID);
                if (!DaemonReceiver.b.containsKey(string) || (completableFuture = (CompletableFuture) DaemonReceiver.b.remove(string)) == null) {
                    return;
                }
                completableFuture.complete(DaemonReceiver.i(jSONObject, string));
            } catch (JSONException unused) {
            }
        }
    }

    @SuppressLint({"BadDependencyInjection"})
    private DaemonReceiver(Context context) {
        IntentFilter intentFilter = new IntentFilter(SDKConstants.RECEIVER_INTENT);
        HandlerThread handlerThread = new HandlerThread(SDKConstants.RECEIVER_HANDLER);
        handlerThread.start();
        context.registerReceiver(new b(), intentFilter, null, new Handler(handlerThread.getLooper()));
        b = new ConcurrentHashMap<>();
        c = SDKLogger.getInstance(context);
    }

    private static GraphResponse c(String str) {
        return d(new FacebookRequestError(20, "UNSUPPORTED_FORMAT", "The response format is invalid."), str);
    }

    public static GraphResponse d(FacebookRequestError facebookRequestError, @Nullable String str) {
        c.logSendingErrorResponse(facebookRequestError, str);
        return new GraphResponse(new GraphRequest(), null, facebookRequestError);
    }

    private static GraphResponse e(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("error");
        return jSONObjectOptJSONObject != null ? d(new FacebookRequestError(jSONObjectOptJSONObject.optInt("code"), jSONObjectOptJSONObject.optString("type"), jSONObjectOptJSONObject.optString("message")), str) : c(str);
    }

    private static GraphResponse f(JSONObject jSONObject, String str) {
        if (jSONObject.optJSONObject("success") != null) {
            c.logSendingSuccessResponse(str);
            return new GraphResponse(new GraphRequest(), (HttpURLConnection) null, "", jSONObject.optJSONObject("success"));
        }
        if (jSONObject.optJSONArray("success") == null) {
            return c(str);
        }
        c.logSendingSuccessResponse(str);
        return new GraphResponse(new GraphRequest(), (HttpURLConnection) null, "", jSONObject.optJSONArray("success"));
    }

    public static synchronized DaemonReceiver g(Context context) {
        if (a == null) {
            a = new DaemonReceiver(context);
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GraphResponse i(JSONObject jSONObject, String str) {
        if (jSONObject.isNull("success")) {
            return !jSONObject.isNull("error") ? e(jSONObject, str) : c(str);
        }
        return f(jSONObject, str);
    }

    public synchronized ConcurrentHashMap<String, CompletableFuture<GraphResponse>> h() {
        return b;
    }
}
