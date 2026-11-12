package com.huami.ednetwork.interceptor;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.ednetwork.EdResponse;
import com.huami.ednetwork.HttpClientCryptoProxy;
import com.huami.ednetwork.WhiteBoxKeyEntity;
import com.huami.ednetwork.api.EncryptionDecryptionApi;
import com.huami.ednetwork.apiImpl.HmEncryptionDecryptionApiImpl;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u001d\u0010\u0010\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/ednetwork/interceptor/ResponseDecryptInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/ResponseBody;", "responseBody", "Lokhttp3/Response;", AbstractJSONTokenResponse.RESPONSE, "Lcom/huami/ednetwork/api/EncryptionDecryptionApi;", "edApi", "a", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "Lcom/huami/ednetwork/apiImpl/HmEncryptionDecryptionApiImpl;", "Lkotlin/Lazy;", "b", "()Lcom/huami/ednetwork/apiImpl/HmEncryptionDecryptionApiImpl;", "hmEdApi", "<init>", "()V", "Companion", "ednetwork_release"}, k = 1, mv = {1, 4, 0})
public final class ResponseDecryptInterceptor implements Interceptor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "ResponseDecryptInterceptor";
    private static final int b = 40001;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy hmEdApi = LazyKt__LazyJVMKt.lazy(c.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/ednetwork/interceptor/ResponseDecryptInterceptor$Companion;", "", "", "isSuccess", "", "realData", "Lcom/huami/ednetwork/api/EncryptionDecryptionApi;", "edApi", "", "updateWhiteBoxKey", "", "ERROR_CODE", LogUtil.I, "TAG", "Ljava/lang/String;", "<init>", "()V", "ednetwork_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "key失效需要刷新白盒key";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ EdResponse a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(EdResponse edResponse) {
                super(0);
                this.a = edResponse;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "刷新白盒key失败 code:" + this.a.getCode();
            }
        }

        private Companion() {
        }

        public final void updateWhiteBoxKey(boolean isSuccess, @NotNull String realData, @NotNull EncryptionDecryptionApi edApi) {
            if (isSuccess) {
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
                LogcatKt.warn(logcat, "ResponseDecryptInterceptor", a.a);
                EdResponse<WhiteBoxKeyEntity> whiteBoxKey = edApi.getWhiteBoxKey();
                if (!whiteBoxKey.isSuccessful()) {
                    LogcatKt.error(logcat, "ResponseDecryptInterceptor", new b(whiteBoxKey));
                    return;
                }
                WhiteBoxKeyEntity data = whiteBoxKey.getData();
                String wb_key = data != null ? data.getWb_key() : null;
                WhiteBoxKeyEntity data2 = whiteBoxKey.getData();
                edApi.upDateKey(wb_key, data2 != null ? data2.getHm_ekv() : null);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(byte[] bArr) {
            super(0);
            this.a = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "decryptionResponseBody start :" + this.a.length;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("decryptionResponseBody end :");
            sb.append(this.a.length() == 0);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/ednetwork/apiImpl/HmEncryptionDecryptionApiImpl;", "a", "()Lcom/huami/ednetwork/apiImpl/HmEncryptionDecryptionApiImpl;"}, k = 3, mv = {1, 4, 0})
    public static final class c extends Lambda implements Function0<HmEncryptionDecryptionApiImpl> {
        public static final c a = new c();

        public c() {
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
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "解密异常 error:" + this.a;
        }
    }

    private final Response a(ResponseBody responseBody, Response response, EncryptionDecryptionApi edApi) throws IOException {
        byte[] bArrBytes = responseBody.bytes();
        byte[] bArr = new byte[0];
        if (!(bArrBytes.length == 0)) {
            LogcatKt.info(Logcat.INSTANCE, "ResponseDecryptInterceptor", new a(bArrBytes));
            byte[] data = edApi.wbDecryption(bArrBytes).getData();
            if (data == null) {
                data = new byte[0];
            }
            bArr = data;
        }
        String str = new String(bArr, Charsets.UTF_8);
        LogcatKt.info(Logcat.INSTANCE, "ResponseDecryptInterceptor", new b(str));
        INSTANCE.updateWhiteBoxKey(response.isSuccessful(), str, edApi);
        return response.newBuilder().body(ResponseBody.create(responseBody.contentType(), str)).build();
    }

    private final HmEncryptionDecryptionApiImpl b() {
        return (HmEncryptionDecryptionApiImpl) this.hmEdApi.getValue();
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Object objM3845constructorimpl;
        Object obj;
        Response responseProceed = chain.proceed(chain.request());
        ResponseBody responseBodyBody = responseProceed.body();
        String strEncodedPath = responseProceed.request().url().encodedPath();
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl((responseBodyBody != null && HttpClientCryptoProxy.isPathInHmCrypto(strEncodedPath)) ? a(responseBodyBody, responseProceed, b()) : responseProceed);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            LogcatKt.error(Logcat.INSTANCE, "ResponseDecryptInterceptor", new d(thM3848exceptionOrNullimpl));
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
