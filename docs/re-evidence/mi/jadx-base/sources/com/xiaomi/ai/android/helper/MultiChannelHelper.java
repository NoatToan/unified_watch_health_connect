package com.xiaomi.ai.android.helper;

import android.text.TextUtils;
import android.util.Base64;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaomi.ai.android.codec.FlacEncoder;
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
public class MultiChannelHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OkHttpClient f10930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10931b;
    private FlacEncoder c;
    private String d;
    private String e;

    public interface MultiChannelCallback {
        void onError(String str);

        void onSuccess(String str);
    }

    public class a implements Interceptor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Engine f10932a;

        public a(Engine engine) {
            this.f10932a = engine;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request request = chain.request();
            String authorization = this.f10932a.getAuthorization();
            if (!TextUtils.isEmpty(authorization)) {
                return chain.proceed(request.newBuilder().header("Authorization", authorization).build());
            }
            wpe.e("MultiChannelHelper", " getAuthorization is null");
            throw new IOException("getAuthorization is null");
        }
    }

    public class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MultiChannelCallback f10934a;

        public b(MultiChannelCallback multiChannelCallback) {
            this.f10934a = multiChannelCallback;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            wpe.e("MultiChannelHelper", wpe.o(iOException));
            MultiChannelCallback multiChannelCallback = this.f10934a;
            if (multiChannelCallback != null) {
                multiChannelCallback.onError(iOException.getMessage());
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            if (response == null) {
                wpe.b("MultiChannelHelper", "response null");
                MultiChannelCallback multiChannelCallback = this.f10934a;
                if (multiChannelCallback != null) {
                    multiChannelCallback.onError("response null");
                    return;
                }
                return;
            }
            try {
                if (response.isSuccessful()) {
                    wpe.b("MultiChannelHelper", "uploadJson success");
                    MultiChannelCallback multiChannelCallback2 = this.f10934a;
                    if (multiChannelCallback2 != null) {
                        multiChannelCallback2.onSuccess(response.body().string());
                        return;
                    }
                    return;
                }
                String strString = response.body().string();
                MultiChannelCallback multiChannelCallback3 = this.f10934a;
                if (multiChannelCallback3 != null) {
                    multiChannelCallback3.onError("uploadJson fail. " + strString);
                }
                wpe.e("MultiChannelHelper", "uploadJson failed. " + strString);
            } catch (Exception e) {
                wpe.e("MultiChannelHelper", wpe.o(e));
            }
        }
    }

    public MultiChannelHelper(int i, String str, int i2) {
        this.d = str;
        this.f10931b = d3s.b(i);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f10930a = builder.connectTimeout(j, timeUnit).readTimeout(j, timeUnit).writeTimeout(j, timeUnit).build();
        FlacEncoder flacEncoder = new FlacEncoder();
        this.c = flacEncoder;
        if (flacEncoder.a()) {
            return;
        }
        this.c.b();
        this.c = null;
    }

    private <T> void a(String str, T t, String str2, String str3, MultiChannelCallback multiChannelCallback) {
        String strWriteValueAsString;
        try {
            strWriteValueAsString = new ObjectMapper().writeValueAsString(t);
        } catch (JsonProcessingException e) {
            wpe.e("MultiChannelHelper", wpe.o(e));
            strWriteValueAsString = null;
        }
        Request.Builder builderPost = new Request.Builder().url(str).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), strWriteValueAsString));
        if (!TextUtils.isEmpty(str2)) {
            builderPost.removeHeader("User-Agent").addHeader("User-Agent", str2);
        } else if (!TextUtils.isEmpty(this.e)) {
            builderPost.removeHeader("User-Agent").addHeader("User-Agent", this.e);
        }
        if (str3 != null) {
            builderPost.addHeader("Authorization", str3);
        }
        wpe.h("MultiChannelHelper", "uploadJson: url=" + str + " ,length=" + strWriteValueAsString.getBytes().length);
        this.f10930a.newCall(builderPost.build()).enqueue(new b(multiChannelCallback));
    }

    public void finalize() throws Throwable {
        super.finalize();
        FlacEncoder flacEncoder = this.c;
        if (flacEncoder != null) {
            flacEncoder.b();
            this.c = null;
        }
    }

    public void uploadData(AsrInfo asrInfo, byte[] bArr, int i, int i2, int i3, MultiChannelCallback multiChannelCallback) {
        uploadData(asrInfo, bArr, i, i2, i3, (String) null, (String) null, multiChannelCallback);
    }

    public void uploadRawData(WakeupInfo wakeupInfo, byte[] bArr, String str, String str2, MultiChannelCallback multiChannelCallback) {
        if (bArr == null || bArr.length <= 0) {
            wpe.e("MultiChannelHelper", "uploadData wakeup: data is null");
            if (multiChannelCallback != null) {
                multiChannelCallback.onError("wakeup raw data is null");
                return;
            }
            return;
        }
        if (bArr.length > 2516582) {
            wpe.e("MultiChannelHelper", "uploadData wakeup: encode data too large. encoder size = " + bArr.length);
            if (multiChannelCallback != null) {
                multiChannelCallback.onError("wakeup raw data is null");
                return;
            }
            return;
        }
        if (wpe.l() == 3) {
            try {
                wpe.b("MultiChannelHelper", "uploadData wakeup: data = " + new ObjectMapper().writeValueAsString(wakeupInfo));
            } catch (JsonProcessingException e) {
                wpe.e("MultiChannelHelper", wpe.o(e));
            }
        }
        wakeupInfo.wakeupAudio = Base64.encodeToString(bArr, 0);
        a(this.f10931b + "?app_id=" + this.d + "&type=WAKEUP_AUDIO", wakeupInfo, str, str2, multiChannelCallback);
    }

    public MultiChannelHelper(Engine engine) {
        e eVar = (e) engine;
        this.f10931b = new d3s(eVar.i()).j();
        this.d = eVar.i().i("auth.client_id");
        this.e = eVar.i().i("connection.user_agent");
        int iE = eVar.i().e("connection.connect_timeout");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j = iE;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f10930a = builder.connectTimeout(j, timeUnit).readTimeout(j, timeUnit).writeTimeout(j, timeUnit).addInterceptor(new a(engine)).build();
        FlacEncoder flacEncoder = new FlacEncoder();
        this.c = flacEncoder;
        if (flacEncoder.a()) {
            return;
        }
        this.c.b();
        this.c = null;
    }

    public void uploadData(AsrInfo asrInfo, byte[] bArr, int i, int i2, int i3, String str, String str2, MultiChannelCallback multiChannelCallback) {
        if (bArr == null || bArr.length <= 0) {
            wpe.e("MultiChannelHelper", "uploadData asr: data is null");
            return;
        }
        FlacEncoder flacEncoder = this.c;
        if (flacEncoder == null) {
            wpe.e("MultiChannelHelper", "uploadData asr: FlacEncoder is null");
            if (multiChannelCallback != null) {
                multiChannelCallback.onError("FlacEncoder asr is null");
                return;
            }
            return;
        }
        byte[] bArrA = flacEncoder.a(bArr, i, i2, i3);
        if (bArrA == null) {
            if (multiChannelCallback != null) {
                multiChannelCallback.onError("encode asr data is null");
                return;
            }
            return;
        }
        if (bArrA.length > 2516582) {
            wpe.e("MultiChannelHelper", "uploadData asr: encode data too large. encoder size = " + bArrA.length);
            if (multiChannelCallback != null) {
                multiChannelCallback.onError("encode asr data too large");
                return;
            }
            return;
        }
        if (wpe.l() == 3) {
            try {
                wpe.b("MultiChannelHelper", "uploadData asr: data = " + new ObjectMapper().writeValueAsString(asrInfo));
            } catch (JsonProcessingException e) {
                wpe.e("MultiChannelHelper", wpe.o(e));
            }
        }
        asrInfo.asrRecordAudio = Base64.encodeToString(bArrA, 0);
        AsrInfo.AsrFormat asrFormat = asrInfo.asrFormat;
        if (asrFormat != null) {
            if (i2 == 32) {
                asrFormat.bits = 24;
            }
            asrFormat.codec = "flac";
        }
        a(this.f10931b + "?app_id=" + this.d + "&type=ASR_RECORD", asrInfo, str, str2, multiChannelCallback);
    }

    public void uploadData(WakeupInfo wakeupInfo, byte[] bArr, int i, int i2, int i3, MultiChannelCallback multiChannelCallback) {
        uploadData(wakeupInfo, bArr, i, i2, i3, (String) null, (String) null, multiChannelCallback);
    }

    public void uploadData(WakeupInfo wakeupInfo, byte[] bArr, int i, int i2, int i3, String str, String str2, MultiChannelCallback multiChannelCallback) {
        if (bArr == null || bArr.length <= 0) {
            wpe.e("MultiChannelHelper", "uploadData wakeup: data is null");
            if (multiChannelCallback != null) {
                multiChannelCallback.onError("wakeup data is null");
                return;
            }
            return;
        }
        FlacEncoder flacEncoder = this.c;
        if (flacEncoder == null) {
            wpe.e("MultiChannelHelper", "uploadData wakeup: FlacEncoder is null");
            if (multiChannelCallback != null) {
                multiChannelCallback.onError("FlacEncoder wakeup is null");
                return;
            }
            return;
        }
        byte[] bArrA = flacEncoder.a(bArr, i, i2, i3);
        if (bArrA == null) {
            if (multiChannelCallback != null) {
                multiChannelCallback.onError("encode wakeup data is null");
                return;
            }
            return;
        }
        if (bArrA.length > 2516582) {
            wpe.e("MultiChannelHelper", "uploadData wakeup: encode data too large. encoder size = " + bArrA.length);
            if (multiChannelCallback != null) {
                multiChannelCallback.onError("encode wakeup data too large");
                return;
            }
            return;
        }
        if (wpe.l() == 3) {
            try {
                wpe.b("MultiChannelHelper", "uploadData wakeup: data = " + new ObjectMapper().writeValueAsString(wakeupInfo));
            } catch (JsonProcessingException e) {
                wpe.e("MultiChannelHelper", wpe.o(e));
            }
        }
        wakeupInfo.wakeupAudio = Base64.encodeToString(bArrA, 0);
        WakeupInfo.AudioMeta audioMeta = wakeupInfo.audioMeta;
        if (audioMeta != null) {
            audioMeta.codec = "flac";
        }
        a(this.f10931b + "?app_id=" + this.d + "&type=WAKEUP_AUDIO", wakeupInfo, str, str2, multiChannelCallback);
    }
}
