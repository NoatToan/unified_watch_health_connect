package com.huami.snore.core.cloud.api;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.gson.Gson;
import com.huami.android.vo.ApiEmptyResponse;
import com.huami.android.vo.ApiErrorResponse;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.snore.core.cloud.api.request.UploadVoiceDataRequest;
import com.huami.snore.core.cloud.api.response.SnoreDataFindOneResponse;
import com.huami.snore.core.cloud.api.response.SnoreDataFindResponse;
import com.huami.snore.core.cloud.api.response.SnoreDataUploadResponse;
import com.huami.snore.core.ext.KoinExtKt;
import com.huami.snore.core.util.SerializationKtxKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import org.apache.http.entity.FileEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016JO\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J&\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000fH\u0016J\u001c\u0010#\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J(\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016¨\u0006-"}, d2 = {"Lcom/huami/snore/core/cloud/api/VoiceWebApiImpl;", "Lcom/huami/snore/core/cloud/api/VoiceWebApi;", "", "url", "a", "fileName", "fileType", "Ljava/io/File;", "file", "Lcom/huami/snore/core/cloud/api/request/UploadVoiceDataRequest;", WebConst.Param.SNORE_DATA, "Lcom/huami/android/vo/ApiResponse;", "Lcom/huami/snore/core/cloud/api/response/SnoreDataUploadResponse;", "uploadInfo", "userId", "", "from", "to", "next", "", "limit", "", "reverse", "Lcom/huami/snore/core/cloud/api/response/SnoreDataFindResponse;", "fetchList", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/huami/android/vo/ApiResponse;", WebConst.Param.FINDONE, "timestamp", "Lcom/huami/snore/core/cloud/api/response/SnoreDataFindOneResponse;", "findByTime", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/huami/android/vo/ApiResponse;", "deleteInfo", "startTime", "endTime", "batchDeleteInfo", "downloadZipFile", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/loopj/android/http/AsyncHttpResponseHandler;", "handler", "", "uploadZipfile", "<init>", "()V", "Companion", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class VoiceWebApiImpl implements VoiceWebApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "SnoreWebApiImpl";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002J\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/huami/snore/core/cloud/api/VoiceWebApiImpl$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/network/base/model/HMHttpResponseData;", AbstractJSONTokenResponse.RESPONSE, "Lkotlinx/serialization/KSerializer;", "kSerializer", "Lcom/huami/android/vo/ApiResponse;", "c", "a", "", "b", "TAG", "Ljava/lang/String;", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return this.a;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final <T> ApiResponse<T> a(HMHttpResponseData response) {
            if (response.getStatusCode() != 409) {
                return null;
            }
            try {
                String string = new JSONObject(response.getResponseString()).getString("errorMsg");
                if (string == null) {
                    string = "请不要重复提交";
                }
                return new ApiErrorResponse(string);
            } catch (Exception unused) {
                return new ApiErrorResponse("未知错误");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ApiResponse<String> b(HMHttpResponseData response) {
            String message;
            if (response.isSuccess()) {
                return new ApiSuccessResponse("");
            }
            String responseString = response.getResponseString(StandardCharsets.UTF_8);
            if (!(responseString == null || m.isBlank(responseString))) {
                return new ApiErrorResponse(responseString);
            }
            Throwable error = response.getError();
            String str = "网络请求错误";
            if (error != null && (message = error.getMessage()) != null) {
                str = message;
            }
            return new ApiErrorResponse(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> ApiResponse<T> c(HMHttpResponseData response, KSerializer<T> kSerializer) {
            String message;
            String message2;
            String responseString = response.getResponseString(StandardCharsets.UTF_8);
            ApiResponse<T> apiResponseA = a(response);
            if (apiResponseA != null) {
                return apiResponseA;
            }
            if (!response.isSuccess()) {
                if (!(responseString == null || m.isBlank(responseString))) {
                    return new ApiErrorResponse(responseString);
                }
                Throwable error = response.getError();
                String str = "网络请求错误";
                if (error != null && (message = error.getMessage()) != null) {
                    str = message;
                }
                return new ApiErrorResponse(str);
            }
            if (response.getStatusCode() == 204) {
                return new ApiEmptyResponse();
            }
            try {
                return new ApiSuccessResponse(SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(kSerializer, responseString));
            } catch (Throwable th) {
                Throwable error2 = response.getError();
                String str2 = "";
                if (error2 != null && (message2 = error2.getMessage()) != null) {
                    str2 = message2;
                }
                String str3 = "json解析发生错误. " + str2;
                HMLog.warn(VoiceWebApiImpl.a, th, new a(str3));
                return new ApiErrorResponse(str3);
            }
        }
    }

    private final String a(String url) {
        return HMServerDef.getHost() + url;
    }

    @Override // com.huami.snore.core.cloud.api.VoiceWebApi
    @NotNull
    public ApiResponse<String> batchDeleteInfo(@NotNull String userId, long startTime, long endTime) {
        return INSTANCE.b(WebUtils.INSTANCE.delete(a(WebConst.Path.BATCH_DELETE), r.hashMapOf(TuplesKt.to("userId", userId), TuplesKt.to("startTime", Long.valueOf(startTime)), TuplesKt.to("endTime", Long.valueOf(endTime)))));
    }

    @Override // com.huami.snore.core.cloud.api.VoiceWebApi
    @NotNull
    public ApiResponse<String> deleteInfo(@NotNull String userId, long timestamp) {
        return INSTANCE.b(WebUtils.INSTANCE.delete(a("snore"), r.hashMapOf(TuplesKt.to("userId", userId), TuplesKt.to("timestamp", Long.valueOf(timestamp)))));
    }

    @Override // com.huami.snore.core.cloud.api.VoiceWebApi
    @Nullable
    public File downloadZipFile(@NotNull File file, @Nullable String url) {
        if (url == null) {
            return null;
        }
        return WebUtils.INSTANCE.get(url, file);
    }

    @Override // com.huami.snore.core.cloud.api.VoiceWebApi
    @NotNull
    public ApiResponse<SnoreDataFindResponse> fetchList(@NotNull String userId, @Nullable Long from, @Nullable Long to, @Nullable Long next, @Nullable Integer limit, @Nullable Boolean reverse) {
        String strA = a("snore");
        HashMap mapHashMapOf = r.hashMapOf(TuplesKt.to("userId", userId));
        if (from != null) {
            from.longValue();
            mapHashMapOf.put("from", String.valueOf(from));
        }
        if (to != null) {
            to.longValue();
            mapHashMapOf.put("to", String.valueOf(to));
        }
        if (next != null) {
        }
        if (reverse != null) {
        }
        if (limit != null) {
            limit.intValue();
            TuplesKt.to("limit", limit);
        }
        return INSTANCE.c(WebUtils.INSTANCE.get(strA, mapHashMapOf), SnoreDataFindResponse.INSTANCE.serializer());
    }

    @Override // com.huami.snore.core.cloud.api.VoiceWebApi
    @NotNull
    public ApiResponse<SnoreDataFindOneResponse> findByTime(@NotNull String userId, @Nullable Boolean findOne, @Nullable Long timestamp) {
        String strA = a("snore");
        HashMap mapHashMapOf = r.hashMapOf(TuplesKt.to("userId", userId));
        if (findOne != null) {
        }
        if (timestamp != null) {
        }
        return INSTANCE.c(WebUtils.INSTANCE.get(strA, mapHashMapOf), SnoreDataFindOneResponse.INSTANCE.serializer());
    }

    @Override // com.huami.snore.core.cloud.api.VoiceWebApi
    @NotNull
    public ApiResponse<SnoreDataUploadResponse> uploadInfo(@NotNull String fileName, @NotNull String fileType, @NotNull File file, @NotNull UploadVoiceDataRequest snoreData) {
        return INSTANCE.c(WebUtils.INSTANCE.post(a(m.replace$default(m.replace$default(WebConst.Path.UPLOAD_SNORE, "{userId}", KoinExtKt.getUserInfo().getUserId(), false, 4, (Object) null), "{appName}", HMAppConfig.getPackageName(), false, 4, (Object) null)), new Gson().toJson(r.hashMapOf(TuplesKt.to("fileName", fileName), TuplesKt.to("fileType", fileType), TuplesKt.to(WebConst.Param.SNORE_DATA, snoreData))), WebUtils.ContentType.JSON), SnoreDataUploadResponse.INSTANCE.serializer());
    }

    @Override // com.huami.snore.core.cloud.api.VoiceWebApi
    public void uploadZipfile(@NotNull Context context, @NotNull File file, @NotNull String url, @NotNull AsyncHttpResponseHandler handler) {
        new AsyncHttpClient().put(context, url, new FileEntity(file, null), null, handler);
    }
}
