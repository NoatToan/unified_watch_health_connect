package com.huami.ednetwork.interceptor;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.ocr.camera.CameraActivity;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.ednetwork.HmKeyManager;
import com.huami.ednetwork.HttpClientCryptoProxy;
import com.huami.ednetwork.HttpExtensionKt;
import com.huami.ednetwork.api.EncryptionDecryptionApi;
import com.huami.ednetwork.apiImpl.HmEncryptionDecryptionApiImpl;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J2\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/ednetwork/interceptor/RequestEncryptInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "", "hmKey", "Lokhttp3/Request;", "a", "Lokhttp3/RequestBody;", "requestBody", "Ljava/nio/charset/Charset;", "c", "charset", "Lokhttp3/MediaType;", CameraActivity.KEY_CONTENT_TYPE, "request", "Lcom/huami/ednetwork/api/EncryptionDecryptionApi;", "edApi", "b", "Lokhttp3/Response;", "intercept", "Lcom/huami/ednetwork/apiImpl/HmEncryptionDecryptionApiImpl;", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/ednetwork/apiImpl/HmEncryptionDecryptionApiImpl;", "hmEdApi", "<init>", "()V", "Companion", "ednetwork_release"}, k = 1, mv = {1, 4, 0})
public final class RequestEncryptInterceptor implements Interceptor {

    @NotNull
    public static final String HM_KEY = "X-HM-EKV";

    @NotNull
    public static final String TAG = "RequestEncryptInterceptor";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy hmEdApi = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/ednetwork/apiImpl/HmEncryptionDecryptionApiImpl;", "a", "()Lcom/huami/ednetwork/apiImpl/HmEncryptionDecryptionApiImpl;"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<HmEncryptionDecryptionApiImpl> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HmEncryptionDecryptionApiImpl invoke() {
            return new HmEncryptionDecryptionApiImpl();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "加密异常 error: " + this.a;
        }
    }

    private final Request a(Interceptor.Chain chain, String hmKey) {
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        if (hmKey == null) {
            hmKey = "";
        }
        builderNewBuilder.addHeader(HM_KEY, hmKey);
        return builderNewBuilder.build();
    }

    private final Request b(RequestBody requestBody, Charset charset, MediaType contentType, Request request, EncryptionDecryptionApi edApi) throws IOException {
        Buffer buffer = new Buffer();
        requestBody.writeTo(buffer);
        String string = buffer.readString(charset);
        if (string == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        String string2 = StringsKt__StringsKt.trim(string).toString();
        buffer.clear();
        byte[] bArr = new byte[0];
        if (string2.length() > 0) {
            Charset charset2 = Charsets.UTF_8;
            if (string2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] data = edApi.wbEncryption(string2.getBytes(charset2)).getData();
            if (data == null) {
                data = new byte[0];
            }
            bArr = data;
        }
        RequestBody requestBodyCreate = RequestBody.create(contentType, bArr);
        Request.Builder builderNewBuilder = request.newBuilder();
        if (HttpExtensionKt.isPost(request)) {
            builderNewBuilder.post(requestBodyCreate);
        } else if (HttpExtensionKt.isPut(request)) {
            builderNewBuilder.put(requestBodyCreate);
        } else {
            if (!HttpExtensionKt.isDelete(request)) {
                return request;
            }
            builderNewBuilder.delete(requestBody);
        }
        if (request.header("Content-Length") != null) {
            builderNewBuilder.header("Content-Length", String.valueOf(bArr.length));
        }
        return builderNewBuilder.build();
    }

    private final Charset c(RequestBody requestBody) {
        Charset charsetForName = Charset.forName("UTF-8");
        MediaType mediaTypeContentType = requestBody.contentType();
        return mediaTypeContentType != null ? mediaTypeContentType.charset(charsetForName) : charsetForName;
    }

    private final HmEncryptionDecryptionApiImpl d() {
        return (HmEncryptionDecryptionApiImpl) this.hmEdApi.getValue();
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Object objM3845constructorimpl;
        Object obj;
        Request request = chain.request();
        String strEncodedPath = request.url().encodedPath();
        RequestBody requestBodyBody = request.body();
        if (!HttpClientCryptoProxy.isPathInHmCrypto(strEncodedPath)) {
            return chain.proceed(request);
        }
        Request requestA = a(chain, HmKeyManager.INSTANCE.getHmKv());
        if ((!HttpExtensionKt.isPost(requestA) && !HttpExtensionKt.isPut(requestA) && !HttpExtensionKt.isDelete(requestA)) || requestBodyBody == null) {
            return chain.proceed(requestA);
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(b(requestBodyBody, c(requestBodyBody), requestBodyBody.contentType(), requestA, d()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            LogcatKt.error(Logcat.INSTANCE, "RequestEncryptInterceptor", new b(thM3848exceptionOrNullimpl));
            return chain.proceed(requestA);
        }
        if (!Result.m3850isFailureimpl(objM3845constructorimpl)) {
            obj = requestA;
            obj = objM3845constructorimpl;
        }
        obj = requestA;
        return chain.proceed((Request) obj);
    }
}
