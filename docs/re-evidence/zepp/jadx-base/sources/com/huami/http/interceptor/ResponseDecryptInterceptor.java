package com.huami.http.interceptor;

import android.util.Base64;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.http.ednetwork.EDWhitePath;
import com.huami.http.ednetwork.EncryptionDecryptionApi;
import com.huami.http.ednetwork.HttpDeResponse;
import com.huami.http.ednetwork.HttpWhiteBoxKeyEntity;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/http/interceptor/ResponseDecryptInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/ResponseBody;", "responseBody", "Lokhttp3/Response;", AbstractJSONTokenResponse.RESPONSE, "a", "Ljava/nio/charset/Charset;", "b", "", "realData", "", "c", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "Lcom/huami/http/ednetwork/EncryptionDecryptionApi;", "Lcom/huami/http/ednetwork/EncryptionDecryptionApi;", "edApi", "<init>", "(Lcom/huami/http/ednetwork/EncryptionDecryptionApi;)V", "Companion", "httpkit_release"}, k = 1, mv = {1, 5, 1})
public final class ResponseDecryptInterceptor implements Interceptor {
    public static final int ERROR_CODE = 40001;

    @NotNull
    public static final String TAG = "ResponseDecryptInterceptor";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final EncryptionDecryptionApi edApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "解密异常 error: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Object> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "key失效需要刷新白盒key";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Object> {
        public final /* synthetic */ HttpDeResponse<HttpWhiteBoxKeyEntity> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HttpDeResponse<HttpWhiteBoxKeyEntity> httpDeResponse) {
            super(0);
            this.a = httpDeResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "刷新白盒key失败 code:" + this.a.getCode();
        }
    }

    public ResponseDecryptInterceptor(@NotNull EncryptionDecryptionApi encryptionDecryptionApi) {
        this.edApi = encryptionDecryptionApi;
    }

    private final Response a(ResponseBody responseBody, Response response) throws JSONException, IOException {
        BufferedSource bufferedSourceSource = responseBody.source();
        bufferedSourceSource.request(Long.MAX_VALUE);
        byte[] data = this.edApi.wbDecryption(Base64.decode(bufferedSourceSource.buffer().clone().readString(b(responseBody)), 2)).getData();
        if (data == null) {
            data = new byte[0];
        }
        String str = new String(data, Charsets.UTF_8);
        c(response, str);
        return response.newBuilder().body(ResponseBody.create(responseBody.contentType(), str)).build();
    }

    private final Charset b(ResponseBody responseBody) {
        Charset charsetForName = Charset.forName("UTF-8");
        MediaType mediaTypeContentType = responseBody.contentType();
        return mediaTypeContentType != null ? mediaTypeContentType.charset(charsetForName) : charsetForName;
    }

    private final void c(Response response, String realData) throws JSONException {
        if (response.isSuccessful()) {
            return;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) realData, (CharSequence) "resp_code", false, 2, (Object) null)) {
            Object obj = new JSONObject(realData).get("resp_code");
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            if (((Integer) obj).intValue() != 40001) {
                return;
            }
            Logcat logcat = Logcat.INSTANCE;
            LogcatKt.warn(logcat, "ResponseDecryptInterceptor", b.a);
            HttpDeResponse<HttpWhiteBoxKeyEntity> whiteBoxKey = this.edApi.getWhiteBoxKey();
            if (!whiteBoxKey.isSuccessful()) {
                LogcatKt.error(logcat, "ResponseDecryptInterceptor", new c(whiteBoxKey));
                return;
            }
            EncryptionDecryptionApi encryptionDecryptionApi = this.edApi;
            HttpWhiteBoxKeyEntity data = whiteBoxKey.getData();
            String wbKey = data == null ? null : data.getWbKey();
            HttpWhiteBoxKeyEntity data2 = whiteBoxKey.getData();
            encryptionDecryptionApi.upDateKey(wbKey, data2 != null ? data2.getHmEkv() : null);
        }
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Object objM3845constructorimpl;
        Object obj;
        Response responseProceed = chain.proceed(chain.request());
        ResponseBody responseBodyBody = responseProceed.body();
        String strEncodedPath = responseProceed.request().url().encodedPath();
        if (responseBodyBody == null || !EDWhitePath.INSTANCE.getWhitePath().contains(strEncodedPath)) {
            return responseProceed;
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(a(responseBodyBody, responseProceed));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            LogcatKt.error(Logcat.INSTANCE, "ResponseDecryptInterceptor", new a(thM3848exceptionOrNullimpl));
            return responseProceed;
        }
        if (!Result.m3850isFailureimpl(objM3845constructorimpl)) {
            obj = responseProceed;
            obj = objM3845constructorimpl;
        }
        obj = responseProceed;
        return (Response) obj;
    }
}
