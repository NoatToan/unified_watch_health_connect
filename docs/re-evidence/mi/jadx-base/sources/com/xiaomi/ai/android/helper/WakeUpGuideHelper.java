package com.xiaomi.ai.android.helper;

import android.text.TextUtils;
import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.android.core.e;
import defpackage.d3s;
import defpackage.djs;
import defpackage.wpe;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public class WakeUpGuideHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OkHttpClient f10944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f10945b;

    public interface WakeUpGuideCallback {
        void onError(String str);

        void onSuccess(String str);
    }

    public class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WakeUpGuideCallback f10946a;

        public a(WakeUpGuideHelper wakeUpGuideHelper, WakeUpGuideCallback wakeUpGuideCallback) {
            this.f10946a = wakeUpGuideCallback;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            wpe.e("WakeUpGuideHelper", "getWakeUpGuideInfo failure " + iOException.getMessage());
            this.f10946a.onError(iOException.toString());
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            if (response == null) {
                this.f10946a.onError("response null");
                return;
            }
            if (response.isSuccessful()) {
                try {
                    wpe.h("WakeUpGuideHelper", "getWakeUpGuideInfo success");
                    this.f10946a.onSuccess(response.body().string());
                    return;
                } catch (Exception e) {
                    wpe.e("WakeUpGuideHelper", wpe.o(e));
                    this.f10946a.onError("data parse error:" + e.toString());
                    return;
                }
            }
            wpe.e("WakeUpGuideHelper", "getWakeUpGuideInfo failed net work:" + response.code() + " " + response.message());
            this.f10946a.onError("net work fail:" + response.code() + " " + response.message());
        }
    }

    public WakeUpGuideHelper(Engine engine) {
        e eVar = (e) engine;
        this.f10945b = eVar;
        int iE = eVar.i().e("connection.connect_timeout");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j = iE;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f10944a = builder.connectTimeout(j, timeUnit).readTimeout(j, timeUnit).writeTimeout(j, timeUnit).addInterceptor(new djs(eVar.e())).build();
    }

    public void getWakeUpGuideInfo(String str, WakeUpGuideCallback wakeUpGuideCallback) {
        if (wakeUpGuideCallback == null) {
            wpe.e("WakeUpGuideHelper", "getWakeUpGuideInfo ,callback can not null");
            return;
        }
        wpe.b("WakeUpGuideHelper", "getWakeUpGuideInfo");
        if (TextUtils.isEmpty(str)) {
            wpe.e("WakeUpGuideHelper", "getWakeUpGuideInfo ,bodyJson can not empty");
            wakeUpGuideCallback.onError("bodyJson can not empty");
            return;
        }
        String strI = this.f10945b.i().i("connection.user_agent");
        String authorization = this.f10945b.getAuthorization();
        if (TextUtils.isEmpty(authorization)) {
            wpe.e("WakeUpGuideHelper", " getAuthorization is null");
            wakeUpGuideCallback.onError("getAuthorization is null");
        } else if (TextUtils.isEmpty(strI)) {
            wpe.e("WakeUpGuideHelper", " user_agent is null");
            wakeUpGuideCallback.onError("user_agent can not empty");
        } else {
            String strN = new d3s(this.f10945b.i()).n();
            this.f10944a.newCall(new Request.Builder().url(strN).addHeader("Authorization", authorization).addHeader("user_agent", strI).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str)).build()).enqueue(new a(this, wakeUpGuideCallback));
        }
    }
}
