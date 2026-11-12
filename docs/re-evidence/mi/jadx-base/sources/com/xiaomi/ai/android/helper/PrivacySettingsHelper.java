package com.xiaomi.ai.android.helper;

import android.text.TextUtils;
import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.android.core.e;
import defpackage.d3s;
import defpackage.wpe;
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

/* JADX INFO: loaded from: classes6.dex */
public class PrivacySettingsHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OkHttpClient f10936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10937b;
    private String c;

    public interface PrivacySettingsCallback {
        void onError(String str);

        void onSuccess(String str);
    }

    public class a implements Interceptor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Engine f10938a;

        public a(PrivacySettingsHelper privacySettingsHelper, Engine engine) {
            this.f10938a = engine;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request request = chain.request();
            String authorization = this.f10938a.getAuthorization();
            if (!TextUtils.isEmpty(authorization)) {
                return chain.proceed(request.newBuilder().header("Authorization", authorization).build());
            }
            wpe.e("PrivacySettingsHelper", " getAuthorization is null");
            throw new IOException("getAuthorization is null");
        }
    }

    public class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PrivacySettingsCallback f10939a;

        public b(PrivacySettingsHelper privacySettingsHelper, PrivacySettingsCallback privacySettingsCallback) {
            this.f10939a = privacySettingsCallback;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            wpe.e("PrivacySettingsHelper", "getPrivacySettings failure " + iOException.getMessage());
            this.f10939a.onError(iOException.toString());
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            if (response == null) {
                this.f10939a.onError("response null");
                return;
            }
            if (response.isSuccessful()) {
                try {
                    wpe.h("PrivacySettingsHelper", "getPrivacySettings success");
                    this.f10939a.onSuccess(response.body().string());
                    return;
                } catch (Exception e) {
                    wpe.e("PrivacySettingsHelper", wpe.o(e));
                    this.f10939a.onError("data parse error:" + e.toString());
                    return;
                }
            }
            wpe.e("PrivacySettingsHelper", "getPrivacySettings failed net work:" + response.code() + " " + response.message());
            this.f10939a.onError("net work fail:" + response.code() + " " + response.message());
        }
    }

    public class c implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PrivacySettingsCallback f10940a;

        public c(PrivacySettingsHelper privacySettingsHelper, PrivacySettingsCallback privacySettingsCallback) {
            this.f10940a = privacySettingsCallback;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            wpe.e("PrivacySettingsHelper", "uploadPrivacySettings failure " + iOException.getMessage());
            this.f10940a.onError(iOException.toString());
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            if (response == null) {
                this.f10940a.onError("response null");
                return;
            }
            if (response.isSuccessful()) {
                try {
                    wpe.h("PrivacySettingsHelper", "uploadPrivacySettings success");
                    this.f10940a.onSuccess(response.body().string());
                    return;
                } catch (Exception e) {
                    wpe.e("PrivacySettingsHelper", wpe.o(e));
                    this.f10940a.onError("data parse error:" + e.toString());
                    return;
                }
            }
            wpe.e("PrivacySettingsHelper", "uploadPrivacySettings failed net work:" + response.code() + " " + response.message());
            this.f10940a.onError("net work fail:" + response.code() + " " + response.message());
        }
    }

    public PrivacySettingsHelper(Engine engine) {
        e eVar = (e) engine;
        this.f10937b = new d3s(eVar.i()).l();
        this.c = eVar.h().getDeviceId().b();
        int iE = eVar.i().e("connection.connect_timeout");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j = iE;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f10936a = builder.connectTimeout(j, timeUnit).readTimeout(j, timeUnit).writeTimeout(j, timeUnit).addInterceptor(new a(this, engine)).build();
    }

    public void getPrivacySettings(PrivacySettingsCallback privacySettingsCallback) {
        if (privacySettingsCallback == null) {
            wpe.e("PrivacySettingsHelper", "getPrivacySettings :callback can not null");
            return;
        }
        HttpUrl.Builder builderNewBuilder = HttpUrl.parse(this.f10937b).newBuilder();
        builderNewBuilder.addQueryParameter("deviceId", this.c);
        this.f10936a.newCall(new Request.Builder().url(builderNewBuilder.build()).build()).enqueue(new b(this, privacySettingsCallback));
    }

    public void uploadPrivacySettings(Map<String, Boolean> map, PrivacySettingsCallback privacySettingsCallback) {
        if (map == null || map.isEmpty()) {
            wpe.e("PrivacySettingsHelper", "uploadPrivacySettings ,can't upload empty settings");
            return;
        }
        if (privacySettingsCallback == null) {
            wpe.e("PrivacySettingsHelper", "uploadPrivacySettings ,callback can not null");
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
            wpe.b("PrivacySettingsHelper", jSONObject.toString());
            this.f10936a.newCall(new Request.Builder().url(this.f10937b).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jSONObject.toString())).build()).enqueue(new c(this, privacySettingsCallback));
        } catch (JSONException e) {
            wpe.e("PrivacySettingsHelper", wpe.o(e));
            privacySettingsCallback.onError("uploadPrivacySettings fail JSONException: " + e.toString());
        }
    }
}
