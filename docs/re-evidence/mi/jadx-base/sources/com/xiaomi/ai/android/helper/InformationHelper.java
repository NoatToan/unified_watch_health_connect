package com.xiaomi.ai.android.helper;

import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.android.core.e;
import defpackage.d3s;
import defpackage.wpe;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public class InformationHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OkHttpClient f10925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f10926b;

    public interface InformationCallback {
        void onError(String str);

        void onSuccess(String str);
    }

    public class a implements Interceptor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Engine f10927a;

        public a(InformationHelper informationHelper, Engine engine) {
            this.f10927a = engine;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request request = chain.request();
            String authorization = this.f10927a.getAuthorization();
            if (!TextUtils.isEmpty(authorization)) {
                return chain.proceed(request.newBuilder().header("Authorization", authorization).build());
            }
            wpe.e("InformationHelper", " getAuthorization is null");
            throw new IOException("getAuthorization is null");
        }
    }

    public class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InformationCallback f10928a;

        public b(InformationHelper informationHelper, InformationCallback informationCallback) {
            this.f10928a = informationCallback;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            wpe.e("InformationHelper", wpe.o(iOException));
            InformationCallback informationCallback = this.f10928a;
            if (informationCallback != null) {
                informationCallback.onError(iOException.getMessage());
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            try {
                if (response.isSuccessful()) {
                    wpe.h("InformationHelper", "uploadInfo success");
                    this.f10928a.onSuccess(response.body().string());
                } else {
                    String strString = response.body().string();
                    wpe.e("InformationHelper", "uploadInfo failed. code=" + response.code() + " ,msg=" + strString);
                    this.f10928a.onError("uploadInfo fail. code=" + response.code() + " ,msg=" + strString);
                }
            } catch (Exception e) {
                wpe.e("InformationHelper", wpe.o(e));
            }
        }
    }

    public InformationHelper(Engine engine) {
        e eVar = (e) engine;
        this.f10926b = eVar;
        int iE = eVar.i().e("connection.connect_timeout");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j = iE;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f10925a = builder.connectTimeout(j, timeUnit).readTimeout(j, timeUnit).writeTimeout(j, timeUnit).addInterceptor(new a(this, engine)).build();
    }

    public void uploadInfo(InformationInfo informationInfo, InformationCallback informationCallback) {
        String strWriteValueAsString;
        if (informationCallback == null) {
            wpe.e("InformationHelper", "uploadInfo: callback can not null");
            return;
        }
        try {
            strWriteValueAsString = new ObjectMapper().writeValueAsString(informationInfo);
        } catch (JsonProcessingException e) {
            wpe.e("InformationHelper", wpe.o(e));
            strWriteValueAsString = null;
        }
        if (TextUtils.isEmpty(strWriteValueAsString)) {
            wpe.e("InformationHelper", "uploadInfo: InformationInfo is null");
            informationCallback.onError("InformationInfo is null");
            return;
        }
        wpe.b("InformationHelper", "uploadInfo: data = " + strWriteValueAsString);
        String strG = new d3s(this.f10926b.i()).g();
        wpe.h("InformationHelper", "uploadInfo: url=" + strG + " ,length=" + strWriteValueAsString.getBytes().length);
        this.f10925a.newCall(new Request.Builder().url(strG).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), strWriteValueAsString)).build()).enqueue(new b(this, informationCallback));
    }
}
