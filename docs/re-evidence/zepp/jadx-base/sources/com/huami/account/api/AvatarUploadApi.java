package com.huami.account.api;

import android.net.Uri;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.network.hmnetwork.server.HMServerDef;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/huami/account/api/AvatarUploadApi;", "Lcom/huami/http/HttpKit;", "Lokhttp3/Response;", "a", "", "userId", "appName", "b", "url", "Ljava/io/File;", "file", "", "uploadAvatar", "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/account/api/RawDataUrlResponse;", "fetchAvatarUrl", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/String;", "PARAM_FILE_TYPE", "PARAM_FILE_NAME", "c", "FILE_TYPE_AVATAR", GoogleApiAvailabilityLight.a, "FILE_NAME_AVATAR", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class AvatarUploadApi implements HttpKit {

    @NotNull
    public static final AvatarUploadApi INSTANCE = new AvatarUploadApi();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String PARAM_FILE_TYPE = "fileType";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String PARAM_FILE_NAME = "fileName";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String FILE_TYPE_AVATAR = "PICTURE";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String FILE_NAME_AVATAR = "bracelet_icon.jpg";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.api.AvatarUploadApi$uploadAvatar$2", f = "AvatarUploadApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ File c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, File file, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AvatarUploadApi avatarUploadApi = AvatarUploadApi.INSTANCE;
            avatarUploadApi.a(HttpKitKtxKt.httpPut$default(avatarUploadApi, this.b, RequestBody.create((MediaType) null, this.c), null, null, 12, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.huami.account.api.AvatarUploadApi$fetchAvatarUrl$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/account/api/RawDataUrlResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.api.AvatarUploadApi$fetchAvatarUrl$2", f = "AvatarUploadApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RawDataUrlResponse>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super RawDataUrlResponse> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = this.b;
            String str2 = this.c;
            try {
                Result.Companion companion = Result.Companion;
                AvatarUploadApi avatarUploadApi = AvatarUploadApi.INSTANCE;
                Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(avatarUploadApi, avatarUploadApi.b(str, str2), null, null, 6, null);
                ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
                if (!responseHttpGet$default.isSuccessful()) {
                    throw new HttpError(responseHttpGet$default);
                }
                ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                ResponseBody responseBodyBody = responseHttpGet$default.body();
                if (responseBodyBody == null) {
                    Intrinsics.throwNpe();
                }
                objM3845constructorimpl = Result.m3845constructorimpl((RawDataUrlResponse) converter.convert(responseBodyBody, new TypeToken<RawDataUrlResponse>() { // from class: com.huami.account.api.AvatarUploadApi$fetchAvatarUrl$2$invokeSuspend$lambda-0$$inlined$deserializeOrThrow$1
                }.getType()));
                ResultKt.throwOnFailure(objM3845constructorimpl);
                return objM3845constructorimpl;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    private AvatarUploadApi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Response a(Response response) {
        if (response.isSuccessful()) {
            return response;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b(String userId, String appName) {
        String url = HMServerDef.getUrl("users/" + userId + "/apps/" + appName + "/fileUploadURIs");
        Uri.Builder builder = new Uri.Builder();
        builder.encodedPath(url);
        builder.appendQueryParameter("fileType", "PICTURE");
        builder.appendQueryParameter("fileName", "bracelet_icon.jpg");
        return builder.build().toString();
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Nullable
    public final Object fetchAvatarUrl(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super RawDataUrlResponse> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(str, str2, null), continuation);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Nullable
    public final Object uploadAvatar(@NotNull String str, @NotNull File file, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new a(str, file, null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
