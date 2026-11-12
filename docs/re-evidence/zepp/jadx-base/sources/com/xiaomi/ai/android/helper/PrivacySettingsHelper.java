package com.xiaomi.ai.android.helper;

import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.android.core.d;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.core.c;
import com.xiaomi.ai.log.Logger;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class PrivacySettingsHelper {
    private OkHttpClient a;
    private String b;
    private String c;

    public interface PrivacySettingsCallback {
        void onError(String str);

        void onSuccess(String str);
    }

    public PrivacySettingsHelper(final Engine engine) {
        d dVar = (d) engine;
        this.b = new c(dVar.b()).l();
        this.c = dVar.m().getDeviceId().get();
        int i = dVar.b().getInt(AivsConfig.Connection.CONNECT_TIMEOUT);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j = i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a = builder.connectTimeout(j, timeUnit).readTimeout(j, timeUnit).writeTimeout(j, timeUnit).addInterceptor(new Interceptor() { // from class: com.xiaomi.ai.android.helper.PrivacySettingsHelper.1
            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request request = chain.request();
                String authorization = engine.getAuthorization();
                if (!TextUtils.isEmpty(authorization)) {
                    return chain.proceed(request.newBuilder().header("Authorization", authorization).build());
                }
                Logger.d("PrivacySettingsHelper", " getAuthorization is null");
                throw new IOException("getAuthorization is null");
            }
        }).build();
    }

    public void getPrivacySettings(final PrivacySettingsCallback privacySettingsCallback) {
        if (privacySettingsCallback == null) {
            Logger.d("PrivacySettingsHelper", "getPrivacySettings :callback can not null");
            return;
        }
        HttpUrl.Builder builderNewBuilder = HttpUrl.parse(this.b).newBuilder();
        builderNewBuilder.addQueryParameter("deviceId", this.c);
        FirebasePerfOkHttpClient.enqueue(this.a.newCall(new Request.Builder().url(builderNewBuilder.build()).build()), new Callback() { // from class: com.xiaomi.ai.android.helper.PrivacySettingsHelper.2
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                Logger.d("PrivacySettingsHelper", "getPrivacySettings failure " + iOException.getMessage());
                privacySettingsCallback.onError(iOException.toString());
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                if (response == null) {
                    privacySettingsCallback.onError("response null");
                    return;
                }
                if (response.isSuccessful()) {
                    try {
                        Logger.b("PrivacySettingsHelper", "getPrivacySettings success");
                        privacySettingsCallback.onSuccess(response.body().string());
                        return;
                    } catch (Exception e) {
                        Logger.d("PrivacySettingsHelper", Logger.throwableToString(e));
                        privacySettingsCallback.onError("data parse error:" + e.toString());
                        return;
                    }
                }
                Logger.d("PrivacySettingsHelper", "getPrivacySettings failed net work:" + response.code() + " " + response.message());
                privacySettingsCallback.onError("net work fail:" + response.code() + " " + response.message());
            }
        });
    }

    public void uploadPrivacySettings(Map<String, Boolean> map, final PrivacySettingsCallback privacySettingsCallback) {
        if (map == null || map.isEmpty()) {
            Logger.d("PrivacySettingsHelper", "uploadPrivacySettings ,can't upload empty settings");
            return;
        }
        if (privacySettingsCallback == null) {
            Logger.d("PrivacySettingsHelper", "uploadPrivacySettings ,callback can not null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            jSONObject.put("device_id", this.c);
            jSONObject.put("watermark", jCurrentTimeMillis);
            JSONObject jSONObject2 = new JSONObject();
            for (String str : map.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject2.put(str, map.get(str));
                }
            }
            jSONObject.put("privacy_set", jSONObject2);
            Logger.a("PrivacySettingsHelper", jSONObject.toString());
            FirebasePerfOkHttpClient.enqueue(this.a.newCall(new Request.Builder().url(this.b).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jSONObject.toString())).build()), new Callback() { // from class: com.xiaomi.ai.android.helper.PrivacySettingsHelper.3
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException iOException) {
                    Logger.d("PrivacySettingsHelper", "uploadPrivacySettings failure " + iOException.getMessage());
                    privacySettingsCallback.onError(iOException.toString());
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    if (response == null) {
                        privacySettingsCallback.onError("response null");
                        return;
                    }
                    if (response.isSuccessful()) {
                        try {
                            Logger.b("PrivacySettingsHelper", "uploadPrivacySettings success");
                            privacySettingsCallback.onSuccess(response.body().string());
                            return;
                        } catch (Exception e) {
                            Logger.d("PrivacySettingsHelper", Logger.throwableToString(e));
                            privacySettingsCallback.onError("data parse error:" + e.toString());
                            return;
                        }
                    }
                    Logger.d("PrivacySettingsHelper", "uploadPrivacySettings failed net work:" + response.code() + " " + response.message());
                    privacySettingsCallback.onError("net work fail:" + response.code() + " " + response.message());
                }
            });
        } catch (JSONException e) {
            Logger.d("PrivacySettingsHelper", Logger.throwableToString(e));
            privacySettingsCallback.onError("uploadPrivacySettings fail JSONException: " + e.toString());
        }
    }
}
