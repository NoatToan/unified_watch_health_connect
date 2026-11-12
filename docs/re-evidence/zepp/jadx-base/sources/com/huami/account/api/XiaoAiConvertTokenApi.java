package com.huami.account.api;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huami.account.AccountExternalsKt;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.network.hmnetwork.exception.GettingTokenErrorException;
import com.huami.network.hmnetwork.exception.GettingTokenInUIThreadException;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.passport.data.cache.HttpDnsCache;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/huami/account/api/XiaoAiConvertTokenApi;", "Lcom/huami/http/HttpKit;", "", "deviceId", "miotId", "accessToken", "Lcom/huami/account/api/XiaoAiConvertTokenApi$ConvertResult;", "requestConvertApi", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TAG", "Ljava/lang/String;", "a", "PARAM_DEVICE_ID", "b", "PARAM_MIOT_DID", "c", "PARAM_ACCESS_TOKEN", GoogleApiAvailabilityLight.a, "HEADER_APP_TOKEN", "e", "HEADER_APP_TOKEN_BACKUP", "f", "PATH_CONVERT", "<init>", "()V", "ConvertResult", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class XiaoAiConvertTokenApi implements HttpKit {

    @NotNull
    public static final XiaoAiConvertTokenApi INSTANCE = new XiaoAiConvertTokenApi();

    @NotNull
    public static final String TAG = "XiaoAiConvertTokenApi";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String PARAM_DEVICE_ID = "deviceId";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String PARAM_MIOT_DID = "miotDid";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String PARAM_ACCESS_TOKEN = "access_token";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String HEADER_APP_TOKEN = "apptoken";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String HEADER_APP_TOKEN_BACKUP = "app_token";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String PATH_CONVERT = "v1/client/xiaoai/convert/access_token";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J-\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/account/api/XiaoAiConvertTokenApi$ConvertResult;", "", "", "component1", "component2", "component3", "originalAccessToken", "accessToken", "errorCode", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getOriginalAccessToken", "()Ljava/lang/String;", "b", "getAccessToken", "c", "getErrorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class ConvertResult {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @SerializedName("originalAccessToken")
        @Nullable
        private final String originalAccessToken;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @SerializedName("accessToken")
        @Nullable
        private final String accessToken;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @SerializedName("error_code")
        @Nullable
        private final String errorCode;

        public ConvertResult(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.originalAccessToken = str;
            this.accessToken = str2;
            this.errorCode = str3;
        }

        public static /* synthetic */ ConvertResult copy$default(ConvertResult convertResult, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = convertResult.originalAccessToken;
            }
            if ((i & 2) != 0) {
                str2 = convertResult.accessToken;
            }
            if ((i & 4) != 0) {
                str3 = convertResult.errorCode;
            }
            return convertResult.copy(str, str2, str3);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getOriginalAccessToken() {
            return this.originalAccessToken;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public final ConvertResult copy(@Nullable String originalAccessToken, @Nullable String accessToken, @Nullable String errorCode) {
            return new ConvertResult(originalAccessToken, accessToken, errorCode);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConvertResult)) {
                return false;
            }
            ConvertResult convertResult = (ConvertResult) other;
            return Intrinsics.areEqual(this.originalAccessToken, convertResult.originalAccessToken) && Intrinsics.areEqual(this.accessToken, convertResult.accessToken) && Intrinsics.areEqual(this.errorCode, convertResult.errorCode);
        }

        @Nullable
        public final String getAccessToken() {
            return this.accessToken;
        }

        @Nullable
        public final String getErrorCode() {
            return this.errorCode;
        }

        @Nullable
        public final String getOriginalAccessToken() {
            return this.originalAccessToken;
        }

        public int hashCode() {
            String str = this.originalAccessToken;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accessToken;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.errorCode;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ConvertResult(originalAccessToken=" + this.originalAccessToken + ", accessToken=" + this.accessToken + ", errorCode=" + this.errorCode + ")";
        }
    }

    /* JADX INFO: renamed from: com.huami.account.api.XiaoAiConvertTokenApi$requestConvertApi$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/account/api/XiaoAiConvertTokenApi$ConvertResult;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.api.XiaoAiConvertTokenApi$requestConvertApi$2", f = "XiaoAiConvertTokenApi.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ConvertResult>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, String str3, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ConvertResult> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws GettingTokenErrorException, GettingTokenInUIThreadException {
            Object objM3845constructorimpl;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.b == null) {
                    return null;
                }
                Map mapMapOf = r.mapOf(TuplesKt.to("deviceId", this.c), TuplesKt.to(XiaoAiConvertTokenApi.PARAM_MIOT_DID, this.d), TuplesKt.to("access_token", this.b));
                Map<String, String> systemHeader = HMWebUtil.getSystemHeader();
                systemHeader.put("app_token", systemHeader.get("apptoken"));
                String accountUrl = HttpDnsCache.getAccountUrl(AccountExternalsKt.getAppContext(), XiaoAiConvertTokenApi.PATH_CONVERT);
                XiaoAiConvertTokenApi xiaoAiConvertTokenApi = XiaoAiConvertTokenApi.INSTANCE;
                this.a = 1;
                obj = HttpKitKtxKt.awaitHttpGet(xiaoAiConvertTokenApi, accountUrl, mapMapOf, systemHeader, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Response response = (Response) obj;
            try {
                Result.Companion companion = Result.Companion;
                ConverterKt.checkToken(response, ConverterKt.responseToJsonStr(response));
                if (!response.isSuccessful()) {
                    objM3845constructorimpl = Result.m3845constructorimpl(null);
                    if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                        return null;
                    }
                    return objM3845constructorimpl;
                }
                ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                ResponseBody responseBodyBody = response.body();
                if (responseBodyBody == null) {
                    Intrinsics.throwNpe();
                }
                return converter.convert(responseBodyBody, new TypeToken<ConvertResult>() { // from class: com.huami.account.api.XiaoAiConvertTokenApi$requestConvertApi$2$invokeSuspend$$inlined$deserialize$1
                }.getType());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    private XiaoAiConvertTokenApi() {
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Nullable
    public final Object requestConvertApi(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull Continuation<? super ConvertResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(str3, str, str2, null), continuation);
    }
}
