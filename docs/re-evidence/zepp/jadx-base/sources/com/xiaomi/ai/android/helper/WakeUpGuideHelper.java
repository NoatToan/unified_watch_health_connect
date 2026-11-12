package com.xiaomi.ai.android.helper;

import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.android.core.d;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.core.c;
import com.xiaomi.ai.log.Logger;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes18.dex */
public class WakeUpGuideHelper {
    private OkHttpClient a;
    private d b;

    public interface WakeUpGuideCallback {
        void onError(String str);

        void onSuccess(String str);
    }

    public WakeUpGuideHelper(Engine engine) {
        d dVar = (d) engine;
        this.b = dVar;
        int i = dVar.b().getInt(AivsConfig.Connection.CONNECT_TIMEOUT);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j = i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a = builder.connectTimeout(j, timeUnit).readTimeout(j, timeUnit).writeTimeout(j, timeUnit).addInterceptor(new com.xiaomi.ai.transport.d(dVar.g())).build();
    }

    public void getWakeUpGuideInfo(String str, final WakeUpGuideCallback wakeUpGuideCallback) {
        if (wakeUpGuideCallback == null) {
            Logger.d("WakeUpGuideHelper", "getWakeUpGuideInfo ,callback can not null");
            return;
        }
        Logger.a("WakeUpGuideHelper", "getWakeUpGuideInfo");
        if (TextUtils.isEmpty(str)) {
            Logger.d("WakeUpGuideHelper", "getWakeUpGuideInfo ,bodyJson can not empty");
            wakeUpGuideCallback.onError("bodyJson can not empty");
            return;
        }
        String string = this.b.b().getString(AivsConfig.Connection.USER_AGENT);
        String authorization = this.b.getAuthorization();
        if (TextUtils.isEmpty(authorization)) {
            Logger.d("WakeUpGuideHelper", " getAuthorization is null");
            wakeUpGuideCallback.onError("getAuthorization is null");
        } else if (TextUtils.isEmpty(string)) {
            Logger.d("WakeUpGuideHelper", " user_agent is null");
            wakeUpGuideCallback.onError("user_agent can not empty");
        } else {
            String strM = new c(this.b.b()).m();
            FirebasePerfOkHttpClient.enqueue(this.a.newCall(new Request.Builder().url(strM).addHeader("Authorization", authorization).addHeader("user_agent", string).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str)).build()), new Callback() { // from class: com.xiaomi.ai.android.helper.WakeUpGuideHelper.1
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException iOException) {
                    Logger.d("WakeUpGuideHelper", "getWakeUpGuideInfo failure " + iOException.getMessage());
                    wakeUpGuideCallback.onError(iOException.toString());
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    if (response == null) {
                        wakeUpGuideCallback.onError("response null");
                        return;
                    }
                    if (response.isSuccessful()) {
                        try {
                            Logger.b("WakeUpGuideHelper", "getWakeUpGuideInfo success");
                            wakeUpGuideCallback.onSuccess(response.body().string());
                            return;
                        } catch (Exception e) {
                            Logger.d("WakeUpGuideHelper", Logger.throwableToString(e));
                            wakeUpGuideCallback.onError("data parse error:" + e.toString());
                            return;
                        }
                    }
                    Logger.d("WakeUpGuideHelper", "getWakeUpGuideInfo failed net work:" + response.code() + " " + response.message());
                    wakeUpGuideCallback.onError("net work fail:" + response.code() + " " + response.message());
                }
            });
        }
    }
}
