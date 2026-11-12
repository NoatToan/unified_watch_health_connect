package com.huami.http.interceptor;

import android.util.Base64;
import com.huami.assistant.ocr.camera.CameraActivity;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.http.HttpExtensionKt;
import com.huami.http.ednetwork.EDWhitePath;
import com.huami.http.ednetwork.EncryptionDecryptionApi;
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
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J*\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/http/interceptor/RequestEncryptInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Request;", "a", "Lokhttp3/RequestBody;", "requestBody", "Ljava/nio/charset/Charset;", "c", "charset", "Lokhttp3/MediaType;", CameraActivity.KEY_CONTENT_TYPE, "request", "b", "Lokhttp3/Response;", "intercept", "Lcom/huami/http/ednetwork/EncryptionDecryptionApi;", "Lcom/huami/http/ednetwork/EncryptionDecryptionApi;", "edApi", "<init>", "(Lcom/huami/http/ednetwork/EncryptionDecryptionApi;)V", "Companion", "httpkit_release"}, k = 1, mv = {1, 5, 1})
public final class RequestEncryptInterceptor implements Interceptor {

    @NotNull
    public static final String TAG = "RequestEncryptInterceptor";

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
            return "加密异常 error: " + this.a;
        }
    }

    public RequestEncryptInterceptor(@NotNull EncryptionDecryptionApi encryptionDecryptionApi) {
        this.edApi = encryptionDecryptionApi;
    }

    private final Request a(Interceptor.Chain chain) {
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        builderNewBuilder.addHeader(com.huami.ednetwork.interceptor.RequestEncryptInterceptor.HM_KEY, this.edApi.getHmKv());
        return builderNewBuilder.build();
    }

    private final Request b(RequestBody requestBody, Charset charset, MediaType contentType, Request request) throws IOException {
        Buffer buffer = new Buffer();
        requestBody.writeTo(buffer);
        String string = StringsKt__StringsKt.trim(buffer.readString(charset)).toString();
        EncryptionDecryptionApi encryptionDecryptionApi = this.edApi;
        Charset charset2 = Charsets.UTF_8;
        if (string == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        return request.newBuilder().post(RequestBody.create(contentType, Base64.encodeToString(encryptionDecryptionApi.wbEncryption(string.getBytes(charset2)).getData(), 2))).build();
    }

    private final Charset c(RequestBody requestBody) {
        Charset charsetForName = Charset.forName("UTF-8");
        MediaType mediaTypeContentType = requestBody.contentType();
        return mediaTypeContentType != null ? mediaTypeContentType.charset(charsetForName) : charsetForName;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Object objM3845constructorimpl;
        Object obj;
        Request request = chain.request();
        String strEncodedPath = request.url().encodedPath();
        RequestBody requestBodyBody = request.body();
        if (!HttpExtensionKt.isPost(request) || requestBodyBody == null || !EDWhitePath.INSTANCE.getWhitePath().contains(strEncodedPath)) {
            return chain.proceed(request);
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(b(requestBodyBody, c(requestBodyBody), requestBodyBody.contentType(), a(chain)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            LogcatKt.error(Logcat.INSTANCE, "RequestEncryptInterceptor", new a(thM3848exceptionOrNullimpl));
            return chain.proceed(request);
        }
        if (!Result.m3850isFailureimpl(objM3845constructorimpl)) {
            obj = request;
            obj = objM3845constructorimpl;
        }
        obj = request;
        return chain.proceed((Request) obj);
    }
}
