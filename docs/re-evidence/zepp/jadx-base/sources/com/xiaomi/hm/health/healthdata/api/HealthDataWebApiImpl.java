package com.xiaomi.hm.health.healthdata.api;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.android.vo.ApiEmptyResponse;
import com.huami.android.vo.ApiErrorResponse;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.healthdata.api.pojo.HealthDataBean;
import com.xiaomi.hm.health.healthdata.api.pojo.HealthDataFindResponse;
import com.xiaomi.hm.health.healthdata.api.pojo.HearingHealthResponse;
import com.xiaomi.hm.health.healthdata.api.pojo.SyncHealthDataResponse;
import com.xiaomi.hm.health.healthdata.api.pojo.UserEventsItem;
import com.xiaomi.hm.health.healthdata.api.pojo.UserEventsResponse;
import com.xiaomi.hm.health.healthdata.api.request.UploadHealthDataRequest;
import com.xiaomi.hm.health.healthdata.core.entity.HearingHealthEntity;
import com.xiaomi.hm.health.utils.SerialzationKtxKt;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016JY\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J]\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\fH\u0016J.\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J$\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J,\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0\u001e2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\"H\u0016J$\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020'0\u001eH\u0016JU\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/api/HealthDataWebApiImpl;", "Lcom/xiaomi/hm/health/healthdata/api/HealthDataWebApi;", "", "url", "a", "Lcom/xiaomi/hm/health/healthdata/api/pojo/HealthDataBean;", "data", "Lcom/huami/android/vo/ApiResponse;", "postHealthData", "userId", "eventType", "subType", "", "from", "to", "next", "", "limit", "", "reverse", "Lcom/xiaomi/hm/health/healthdata/api/pojo/SyncHealthDataResponse;", "fetchData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Long;ILjava/lang/Boolean;)Lcom/huami/android/vo/ApiResponse;", "Lcom/xiaomi/hm/health/healthdata/api/pojo/UserEventsResponse;", "fetchUserEventsData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/Boolean;)Lcom/huami/android/vo/ApiResponse;", "uploadTime", "Lcom/xiaomi/hm/health/healthdata/api/pojo/HealthDataFindResponse;", "findDataByType", "delete", "", "Lcom/xiaomi/hm/health/healthdata/api/request/UploadHealthDataRequest;", "events", "uploadEvent", "Lcom/xiaomi/hm/health/healthdata/api/pojo/UserEventsItem;", "isDate", "uploadUserEvents", "event", "deleteUserEvents", "Lcom/xiaomi/hm/health/healthdata/core/entity/HearingHealthEntity;", "uploadHearingEvents", "Lcom/xiaomi/hm/health/healthdata/api/pojo/HearingHealthResponse;", "fetchHearingEvents", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/Boolean;)Lcom/huami/android/vo/ApiResponse;", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthDataWebApiImpl implements HealthDataWebApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "HealthDataWebApiImpl";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002J\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/api/HealthDataWebApiImpl$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/network/base/model/HMHttpResponseData;", AbstractJSONTokenResponse.RESPONSE, "Lkotlinx/serialization/KSerializer;", "kSerializer", "Lcom/huami/android/vo/ApiResponse;", "c", "a", "", "b", "TAG", "Ljava/lang/String;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
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
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
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
                return new ApiSuccessResponse(SerialzationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(kSerializer, responseString));
            } catch (Throwable th) {
                Throwable error2 = response.getError();
                String str2 = "";
                if (error2 != null && (message2 = error2.getMessage()) != null) {
                    str2 = message2;
                }
                String str3 = "json解析发生错误. " + str2;
                HMLog.warn(HealthDataWebApiImpl.a, th, new a(str3));
                return new ApiErrorResponse(str3);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HMHttpResponseData a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMHttpResponseData hMHttpResponseData, String str) {
            super(0);
            this.a = hMHttpResponseData;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "上传信息成功  response：  " + this.a + "    Request:  " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<JsonBuilder, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(@NotNull JsonBuilder jsonBuilder) {
            jsonBuilder.setIgnoreUnknownKeys(false);
            jsonBuilder.setAllowSpecialFloatingPointValues(false);
            jsonBuilder.setLenient(false);
            jsonBuilder.setEncodeDefaults(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            a(jsonBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ HMHttpResponseData a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HMHttpResponseData hMHttpResponseData, String str) {
            super(0);
            this.a = hMHttpResponseData;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "上传信息成功  response：  " + this.a + "    Requesr:  " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<JsonBuilder, Unit> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        public final void a(@NotNull JsonBuilder jsonBuilder) {
            jsonBuilder.setIgnoreUnknownKeys(false);
            jsonBuilder.setAllowSpecialFloatingPointValues(false);
            jsonBuilder.setLenient(false);
            jsonBuilder.setEncodeDefaults(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            a(jsonBuilder);
            return Unit.INSTANCE;
        }
    }

    private final String a(String url) {
        return HMServerDef.getHost() + url;
    }

    @Override // com.xiaomi.hm.health.healthdata.api.HealthDataWebApi
    @NotNull
    public ApiResponse<String> delete(@NotNull String userId, @NotNull String eventType, @NotNull String subType, @NotNull String uploadTime) {
        return INSTANCE.b(WebUtils.INSTANCE.delete(a(m.replace$default(m.replace$default("users/{userId}/event/{eventType}", "{userId}", userId, false, 4, (Object) null), "{eventType}", eventType, false, 4, (Object) null)), r.mapOf(TuplesKt.to("subType", subType), TuplesKt.to("timestamp", uploadTime))));
    }

    @Override // com.xiaomi.hm.health.healthdata.api.HealthDataWebApi
    @NotNull
    public ApiResponse<String> deleteUserEvents(@NotNull String userId, @NotNull UserEventsItem event) {
        return INSTANCE.b(WebUtils.INSTANCE.delete(a(m.replace$default(m.replace$default("users/{userId}/event/{eventType}", "{userId}", userId, false, 4, (Object) null), "{eventType}", event.getEventType(), false, 4, (Object) null)), r.mapOf(TuplesKt.to("subType", event.getSubType()), TuplesKt.to("timestamp", Long.valueOf(event.getTimestamp())))));
    }

    @Override // com.xiaomi.hm.health.healthdata.api.HealthDataWebApi
    @NotNull
    public ApiResponse<SyncHealthDataResponse> fetchData(@NotNull String userId, @NotNull String eventType, @NotNull String subType, long from, long to, @Nullable Long next, int limit, @Nullable Boolean reverse) {
        String strA = a(m.replace$default("users/{userId}/events", "{userId}", userId, false, 4, (Object) null));
        HashMap mapHashMapOf = r.hashMapOf(TuplesKt.to("eventType", eventType), TuplesKt.to("subType", subType), TuplesKt.to("limit", String.valueOf(limit)), TuplesKt.to("from", String.valueOf(from)), TuplesKt.to("to", String.valueOf(to)));
        if (next != null) {
        }
        if (reverse != null) {
        }
        return INSTANCE.c(WebUtils.INSTANCE.get(strA, mapHashMapOf), SyncHealthDataResponse.INSTANCE.serializer());
    }

    @Override // com.xiaomi.hm.health.healthdata.api.HealthDataWebApi
    @NotNull
    public ApiResponse<HearingHealthResponse> fetchHearingEvents(@NotNull String userId, @NotNull String eventType, @Nullable Long from, @Nullable Long to, @Nullable Long next, int limit, @Nullable Boolean reverse) {
        String strA = a(m.replace$default("users/{userId}/events", "{userId}", userId, false, 4, (Object) null));
        HashMap mapHashMapOf = r.hashMapOf(TuplesKt.to("eventType", eventType), TuplesKt.to("limit", String.valueOf(limit)));
        if (from != null) {
            mapHashMapOf.put("from", String.valueOf(from));
        }
        if (to != null) {
            mapHashMapOf.put("to", String.valueOf(to));
        }
        if (next != null) {
        }
        if (reverse != null) {
        }
        return INSTANCE.c(WebUtils.INSTANCE.get(strA, mapHashMapOf), HearingHealthResponse.INSTANCE.serializer());
    }

    @Override // com.xiaomi.hm.health.healthdata.api.HealthDataWebApi
    @NotNull
    public ApiResponse<UserEventsResponse> fetchUserEventsData(@NotNull String userId, @NotNull String eventType, @NotNull String subType, @Nullable Long from, @Nullable Long to, @Nullable Long next, int limit, @Nullable Boolean reverse) {
        String strA = a(m.replace$default("users/{userId}/events", "{userId}", userId, false, 4, (Object) null));
        HashMap mapHashMapOf = r.hashMapOf(TuplesKt.to("eventType", eventType), TuplesKt.to("subType", subType), TuplesKt.to("limit", String.valueOf(limit)));
        if (from != null) {
            mapHashMapOf.put("from", String.valueOf(from));
        }
        if (to != null) {
            mapHashMapOf.put("to", String.valueOf(to));
        }
        if (next != null) {
        }
        if (reverse != null) {
        }
        return INSTANCE.c(WebUtils.INSTANCE.get(strA, mapHashMapOf), UserEventsResponse.INSTANCE.serializer());
    }

    @Override // com.xiaomi.hm.health.healthdata.api.HealthDataWebApi
    @NotNull
    public ApiResponse<HealthDataFindResponse> findDataByType(@NotNull String userId, @NotNull String eventType, @NotNull String subType, long uploadTime) {
        return INSTANCE.c(WebUtils.INSTANCE.get(a(m.replace$default(m.replace$default("users/{userId}/event/{eventType}", "{userId}", userId, false, 4, (Object) null), "{eventType}", eventType, false, 4, (Object) null)), r.mapOf(TuplesKt.to("subType", subType), TuplesKt.to("timestamp", Long.valueOf(uploadTime)))), HealthDataFindResponse.INSTANCE.serializer());
    }

    @Override // com.xiaomi.hm.health.healthdata.api.HealthDataWebApi
    @NotNull
    public ApiResponse<String> postHealthData(@NotNull HealthDataBean data) {
        String strA = a(m.replace$default("users/{userId}/events", "{userId}", data.getUserId(), false, 4, (Object) null));
        ArrayList arrayList = new ArrayList();
        arrayList.add(data);
        return INSTANCE.b(WebUtils.INSTANCE.post(strA, SerialzationKtxKt.getNonStrictInstance(Json.INSTANCE).encodeToString(BuiltinSerializersKt.ListSerializer(HealthDataBean.INSTANCE.serializer()), arrayList), WebUtils.ContentType.JSON));
    }

    @Override // com.xiaomi.hm.health.healthdata.api.HealthDataWebApi
    @NotNull
    public ApiResponse<String> uploadEvent(@NotNull String userId, @NotNull List<UploadHealthDataRequest> events) {
        return INSTANCE.b(WebUtils.INSTANCE.post(a(m.replace$default("users/{userId}/events", "{userId}", userId, false, 4, (Object) null)), SerialzationKtxKt.getNonStrictInstance(Json.INSTANCE).encodeToString(BuiltinSerializersKt.ListSerializer(UploadHealthDataRequest.INSTANCE.serializer()), events), WebUtils.ContentType.JSON));
    }

    @Override // com.xiaomi.hm.health.healthdata.api.HealthDataWebApi
    @NotNull
    public ApiResponse<String> uploadHearingEvents(@NotNull String userId, @NotNull List<HearingHealthEntity> events) {
        String strA = a(m.replace$default("users/{userId}/events", "{userId}", userId, false, 4, (Object) null));
        String strEncodeToString = JsonKt.Json$default(null, b.a, 1, null).encodeToString(BuiltinSerializersKt.ListSerializer(HearingHealthEntity.INSTANCE.serializer()), events);
        HMHttpResponseData hMHttpResponseDataPost = WebUtils.INSTANCE.post(strA, strEncodeToString, WebUtils.ContentType.JSON);
        HMLog.debug$default(null, new a(hMHttpResponseDataPost, strEncodeToString), 1, null);
        return INSTANCE.b(hMHttpResponseDataPost);
    }

    @Override // com.xiaomi.hm.health.healthdata.api.HealthDataWebApi
    @NotNull
    public ApiResponse<String> uploadUserEvents(@NotNull String userId, @NotNull List<UserEventsItem> events, boolean isDate) {
        String strA = a(isDate ? m.replace$default("users/{userId}/date/events", "{userId}", userId, false, 4, (Object) null) : m.replace$default("users/{userId}/events", "{userId}", userId, false, 4, (Object) null));
        String strEncodeToString = JsonKt.Json$default(null, d.a, 1, null).encodeToString(BuiltinSerializersKt.ListSerializer(UserEventsItem.INSTANCE.serializer()), events);
        HMHttpResponseData hMHttpResponseDataPost = WebUtils.INSTANCE.post(strA, strEncodeToString, WebUtils.ContentType.JSON);
        HMLog.debug$default(null, new c(hMHttpResponseDataPost, strEncodeToString), 1, null);
        return INSTANCE.b(hMHttpResponseDataPost);
    }
}
