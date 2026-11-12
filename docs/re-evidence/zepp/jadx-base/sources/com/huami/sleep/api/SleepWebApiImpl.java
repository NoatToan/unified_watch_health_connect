package com.huami.sleep.api;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.android.vo.ApiEmptyResponse;
import com.huami.android.vo.ApiErrorResponse;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.sleep.api.pojo.UserEventsItem;
import com.huami.sleep.api.pojo.UserEventsResponse;
import com.huami.sleep.util.SerializationKtxKt;
import com.huami.tools.log.HMLog;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J]\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¨\u0006\u001c"}, d2 = {"Lcom/huami/sleep/api/SleepWebApiImpl;", "Lcom/huami/sleep/api/SleepDataWebApi;", "", "url", "a", "userId", "eventType", "subType", "", "from", "to", "next", "", "limit", "", "reverse", "Lcom/huami/android/vo/ApiResponse;", "Lcom/huami/sleep/api/pojo/UserEventsResponse;", "fetchUserEventsData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/Boolean;)Lcom/huami/android/vo/ApiResponse;", "", "Lcom/huami/sleep/api/pojo/UserEventsItem;", "events", "isDate", "uploadUserEvents", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepWebApiImpl implements SleepDataWebApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "HealthDataWebApiImpl";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002J\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/huami/sleep/api/SleepWebApiImpl$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/network/base/model/HMHttpResponseData;", AbstractJSONTokenResponse.RESPONSE, "Lkotlinx/serialization/KSerializer;", "kSerializer", "Lcom/huami/android/vo/ApiResponse;", "c", "a", "", "b", "TAG", "Ljava/lang/String;", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
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
                HMLog.warn(SleepWebApiImpl.a, th, new a(str3));
                return new ApiErrorResponse(str3);
            }
        }
    }

    private final String a(String url) {
        return HMServerDef.getHost() + url;
    }

    @Override // com.huami.sleep.api.SleepDataWebApi
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

    @Override // com.huami.sleep.api.SleepDataWebApi
    @NotNull
    public ApiResponse<String> uploadUserEvents(@NotNull String userId, @NotNull List<UserEventsItem> events, boolean isDate) {
        return INSTANCE.b(WebUtils.INSTANCE.post(a(isDate ? m.replace$default("users/{userId}/date/events", "{userId}", userId, false, 4, (Object) null) : m.replace$default("users/{userId}/events", "{userId}", userId, false, 4, (Object) null)), SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).encodeToString(BuiltinSerializersKt.ListSerializer(UserEventsItem.INSTANCE.serializer()), events), WebUtils.ContentType.JSON));
    }
}
