package com.huami.rawdata_uploader.file.remote;

import android.net.Uri;
import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\b\t*\u0001\u0016\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002J3\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00038\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u001d\u0010\u001a\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/rawdata_uploader/file/remote/BloodPressureFileUploadRepo;", "Lcom/huami/rawdata_uploader/file/remote/IFileUploadRepo;", "Lcom/huami/http/HttpKit;", "", "url", "fileName", "type", "b", "userId", "appName", "Lcom/huami/rawdata_uploader/file/remote/RawDataUrlResponse;", "fetchRawDataUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/File;", "file", "", "uploadRawDataFile", "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljava/lang/String;", "PARAM_FILE_TYPE", "PARAM_FILE_NAME", "com/huami/rawdata_uploader/file/remote/BloodPressureFileUploadRepo$fileHttpKit$2$1", "c", "Lkotlin/Lazy;", "()Lcom/huami/rawdata_uploader/file/remote/BloodPressureFileUploadRepo$fileHttpKit$2$1;", "fileHttpKit", "<init>", "()V", "Companion", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureFileUploadRepo implements IFileUploadRepo, HttpKit {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String d = "BLOOD_PRESSURE_DATA";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String PARAM_FILE_TYPE = "fileType";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String PARAM_FILE_NAME = "fileName";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy fileHttpKit = LazyKt__LazyJVMKt.lazy(new Function0<BloodPressureFileUploadRepo$fileHttpKit$2.AnonymousClass1>() { // from class: com.huami.rawdata_uploader.file.remote.BloodPressureFileUploadRepo$fileHttpKit$2
        /* JADX WARN: Type inference failed for: r0v0, types: [com.huami.rawdata_uploader.file.remote.BloodPressureFileUploadRepo$fileHttpKit$2$1] */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 invoke() {
            return new HttpKit() { // from class: com.huami.rawdata_uploader.file.remote.BloodPressureFileUploadRepo$fileHttpKit$2.1
                @Override // com.huami.http.HttpKit
                @NotNull
                public HttpUrl baseUrl() {
                    return HttpKit.DefaultImpls.baseUrl(this);
                }

                @Override // com.huami.http.HttpKit
                @NotNull
                public OkHttpClient okHttpClient() {
                    return new OkHttpClient();
                }
            };
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/rawdata_uploader/file/remote/BloodPressureFileUploadRepo$Companion;", "", "", "PARAM_BP_FILE_TYPE", "Ljava/lang/String;", "getPARAM_BP_FILE_TYPE", "()Ljava/lang/String;", "<init>", "()V", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getPARAM_BP_FILE_TYPE() {
            return BloodPressureFileUploadRepo.d;
        }
    }

    private final BloodPressureFileUploadRepo$fileHttpKit$2.AnonymousClass1 a() {
        return (BloodPressureFileUploadRepo$fileHttpKit$2.AnonymousClass1) this.fileHttpKit.getValue();
    }

    private final String b(String url, String fileName, String type) {
        Uri.Builder builder = new Uri.Builder();
        builder.encodedPath(url);
        builder.appendQueryParameter(this.PARAM_FILE_TYPE, type);
        builder.appendQueryParameter(this.PARAM_FILE_NAME, fileName);
        return builder.build().toString();
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.rawdata_uploader.file.remote.IFileUploadRepo
    @Nullable
    public Object fetchRawDataUrl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Continuation<? super RawDataUrlResponse> continuation) {
        Object objM3845constructorimpl;
        String str5 = baseUrl() + "users/" + str + "/apps/" + str2 + "/fileUploadURIs";
        try {
            Result.Companion companion = Result.Companion;
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, b(str5, str3, str4), null, null, 6, null);
            ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
            if (!responseHttpGet$default.isSuccessful()) {
                throw new HttpError(responseHttpGet$default);
            }
            ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
            ResponseBody responseBodyBody = responseHttpGet$default.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            objM3845constructorimpl = Result.m3845constructorimpl((RawDataUrlResponse) converter.convert(responseBodyBody, new TypeToken<RawDataUrlResponse>() { // from class: com.huami.rawdata_uploader.file.remote.BloodPressureFileUploadRepo$fetchRawDataUrl$lambda-0$$inlined$deserializeOrThrow$1
            }.getType()));
            ResultKt.throwOnFailure(objM3845constructorimpl);
            return objM3845constructorimpl;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.rawdata_uploader.file.remote.IFileUploadRepo
    @Nullable
    public Object uploadRawDataFile(@NotNull String str, @NotNull File file, @NotNull Continuation<? super Boolean> continuation) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(HttpKitKtxKt.httpPut$default(a(), str, RequestBody.create((MediaType) null, file), null, null, 12, null).isSuccessful()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        ResultKt.throwOnFailure(objM3845constructorimpl);
        return objM3845constructorimpl;
    }
}
