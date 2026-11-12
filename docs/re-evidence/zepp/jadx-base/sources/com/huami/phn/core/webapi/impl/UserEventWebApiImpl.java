package com.huami.phn.core.webapi.impl;

import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import com.huami.phn.coach.koin.PHNProjectModuleKt;
import com.huami.phn.core.webapi.ApiResult;
import com.huami.phn.core.webapi.ErrorCode;
import com.huami.phn.core.webapi.UserEventApi;
import com.huami.phn.core.webapi.UserEventList;
import com.huami.phn.util.SerialzationKtxKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b \u0010!J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002Jw\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u0015\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JB\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0019\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016J(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016J:\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u001d0\u001c2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\""}, d2 = {"Lcom/huami/phn/core/webapi/impl/UserEventWebApiImpl;", "Lcom/huami/phn/core/webapi/UserEventApi;", "Lcom/huami/http/HttpKit;", "Lkotlinx/serialization/json/JsonElement;", "Lokhttp3/RequestBody;", "a", ExifInterface.GPS_DIRECTION_TRUE, "", "eventType", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonObject;", "eventParse", "subType", "", "from", "to", "next", "", "limit", "", "reverse", "Lcom/huami/phn/core/webapi/ApiResult;", "Lcom/huami/phn/core/webapi/UserEventList;", "queryUserEvents", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/Boolean;)Lcom/huami/phn/core/webapi/ApiResult;", "timestamp", "queryUserEventData", "deleteUserEvent", "", "Lkotlin/Pair;", "postDatas", "postUserEvent", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class UserEventWebApiImpl implements UserEventApi, HttpKit {

    @Deprecated
    @NotNull
    public static final String JSON_KEY_ITEMS = "items";

    @Deprecated
    @NotNull
    public static final String JSON_KEY_NEXT = "next";

    @Deprecated
    @NotNull
    public static final String JSON_NODE_VALUE_RESULT = "result";

    @Deprecated
    @NotNull
    public static final String MEDIA_TYPE_JSON = "application/json";

    @Deprecated
    @NotNull
    public static final String PARAMS_EVENT_TYPE = "eventType";

    @Deprecated
    @NotNull
    public static final String PARAMS_FROM = "from";

    @Deprecated
    @NotNull
    public static final String PARAMS_LIMIT = "limit";

    @Deprecated
    @NotNull
    public static final String PARAMS_NEXT = "next";

    @Deprecated
    @NotNull
    public static final String PARAMS_NODE_VALUE = "value";

    @Deprecated
    @NotNull
    public static final String PARAMS_REVERSE = "reverse";

    @Deprecated
    @NotNull
    public static final String PARAMS_SUB_TYPE = "subType";

    @Deprecated
    @NotNull
    public static final String PARAMS_TIMESTAMP = "timestamp";

    @Deprecated
    @NotNull
    public static final String PARAMS_TO = "to";

    @Deprecated
    @NotNull
    public static final String TAG = "UserEventApiImpl";

    @Deprecated
    @NotNull
    public static final String UE_V2_URL = "v2/users/me/events";

    @NotNull
    private static final a a = new a(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004¨\u0006\u0015"}, d2 = {"com/huami/phn/core/webapi/impl/UserEventWebApiImpl$a", "", "", "JSON_KEY_ITEMS", "Ljava/lang/String;", "JSON_KEY_NEXT", "JSON_NODE_VALUE_RESULT", "MEDIA_TYPE_JSON", "PARAMS_EVENT_TYPE", "PARAMS_FROM", "PARAMS_LIMIT", "PARAMS_NEXT", "PARAMS_NODE_VALUE", "PARAMS_REVERSE", "PARAMS_SUB_TYPE", "PARAMS_TIMESTAMP", "PARAMS_TO", "TAG", "UE_V2_URL", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Delete user event: " + this.a + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Post user event: " + this.a + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Query user event: " + this.a + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Query user events: " + this.a + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.b;
        }
    }

    private final RequestBody a(JsonElement jsonElement) {
        return RequestBody.create(MediaType.parse("application/json"), jsonElement.toString());
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.phn.core.webapi.UserEventApi
    @NotNull
    public ApiResult<Boolean> deleteUserEvent(@NotNull String eventType, long timestamp, @Nullable String subType) {
        Object objM3845constructorimpl;
        HMLog.info("UserEventApiImpl", new b(eventType, subType));
        String str = "users/" + ((Object) PHNProjectModuleKt.getPhnUserId().getA()) + "/events";
        if (m.isBlank(str)) {
            return new ApiResult.Failed(new ErrorCode.InvalidUrl(str));
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (subType != null) {
            builderBuildUpon.appendQueryParameter("subType", subType);
        }
        builderBuildUpon.appendQueryParameter("timestamp", String.valueOf(timestamp));
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(HttpKitKtxKt.httpDelete$default(this, builderBuildUpon.build().toString(), null, null, null, 14, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Response response = (Response) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        if (response != null) {
            return response.isSuccessful() ? new ApiResult.Success(Boolean.TRUE) : new ApiResult.Failed(new ErrorCode.ApiError(String.valueOf(response.code()), response.message()));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        return new ApiResult.Failed(new ErrorCode.Error(thM3848exceptionOrNullimpl != null ? thM3848exceptionOrNullimpl.getMessage() : null));
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.phn.core.webapi.UserEventApi
    @NotNull
    public ApiResult<Boolean> postUserEvent(@NotNull String eventType, @NotNull List<Pair<Long, JsonObject>> postDatas, @Nullable String subType) {
        Object objM3845constructorimpl;
        HMLog.info("UserEventApiImpl", new c(eventType, subType));
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(postDatas, 10));
        Iterator<T> it2 = postDatas.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("timestamp", JsonElementKt.JsonPrimitive((Number) pair.getFirst()));
            linkedHashMap.put("eventType", JsonElementKt.JsonPrimitive(eventType));
            linkedHashMap.put("value", pair.getSecond());
            linkedHashMap.put("subType", JsonElementKt.JsonPrimitive(subType));
            arrayList.add(new JsonObject(linkedHashMap));
        }
        RequestBody requestBodyA = a(new JsonArray(arrayList));
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(HttpKitKtxKt.httpPost$default(this, "v2/users/me/events", requestBodyA, null, null, 12, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Response response = (Response) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        if (response != null) {
            return response.isSuccessful() ? new ApiResult.Success(Boolean.TRUE) : new ApiResult.Failed(new ErrorCode.ApiError(String.valueOf(response.code()), response.message()));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        return new ApiResult.Failed(new ErrorCode.Error(thM3848exceptionOrNullimpl != null ? thM3848exceptionOrNullimpl.getMessage() : null));
    }

    @Override // com.huami.phn.core.webapi.UserEventApi
    @NotNull
    public <T> ApiResult<T> queryUserEventData(@NotNull String eventType, @NotNull Function1<? super JsonObject, ? extends T> eventParse, long timestamp, @Nullable String subType) {
        Object objM3845constructorimpl;
        String string;
        HMLog.info("UserEventApiImpl", new d(eventType, subType));
        Uri.Builder builderBuildUpon = Uri.parse("v2/users/me/events").buildUpon();
        if (subType != null) {
            builderBuildUpon.appendQueryParameter("subType", subType);
        }
        builderBuildUpon.appendQueryParameter("timestamp", String.valueOf(timestamp));
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(HttpKitKtxKt.httpGet$default(this, builderBuildUpon.build().toString(), null, null, 6, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        String str = null;
        Response response = (Response) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        if (response == null) {
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            return new ApiResult.Failed(new ErrorCode.Error(thM3848exceptionOrNullimpl != null ? thM3848exceptionOrNullimpl.getMessage() : null));
        }
        if (!response.isSuccessful()) {
            return new ApiResult.Failed(new ErrorCode.ApiError(String.valueOf(response.code()), response.message()));
        }
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody != null && (string = responseBodyBody.toString()) != null && (!m.isBlank(string))) {
            str = string;
        }
        if (str == null) {
            return new ApiResult.Failed(ErrorCode.NoneData.INSTANCE);
        }
        try {
            return new ApiResult.Success(eventParse.invoke(JsonElementKt.getJsonObject(SerialzationKtxKt.getNonStrictInstance(Json.INSTANCE).parseToJsonElement(str))));
        } catch (Exception e2) {
            return new ApiResult.Failed(new ErrorCode.ParseError(e2.getLocalizedMessage()));
        }
    }

    @Override // com.huami.phn.core.webapi.UserEventApi
    @NotNull
    public <T> ApiResult<UserEventList<T>> queryUserEvents(@NotNull String eventType, @NotNull Function1<? super JsonObject, ? extends T> eventParse, @Nullable String subType, @Nullable Long from, @Nullable Long to, @Nullable Long next, int limit, @Nullable Boolean reverse) {
        Object objM3845constructorimpl;
        String strString;
        JsonPrimitive jsonPrimitive;
        HMLog.info("UserEventApiImpl", new e(eventType, subType));
        Uri.Builder builderBuildUpon = Uri.parse("v2/users/me/events").buildUpon();
        builderBuildUpon.appendQueryParameter("eventType", eventType);
        if (subType != null) {
            builderBuildUpon.appendQueryParameter("subType", subType);
        }
        if (from != null) {
            builderBuildUpon.appendQueryParameter("from", String.valueOf(from.longValue()));
        }
        if (to != null) {
            builderBuildUpon.appendQueryParameter("to", String.valueOf(to.longValue()));
        }
        if (next != null) {
            builderBuildUpon.appendQueryParameter("next", String.valueOf(next.longValue()));
        }
        builderBuildUpon.appendQueryParameter("limit", String.valueOf(limit));
        if (reverse != null) {
            builderBuildUpon.appendQueryParameter("reverse", String.valueOf(reverse.booleanValue()));
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(HttpKitKtxKt.httpGet$default(this, builderBuildUpon.build().toString(), null, null, 6, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Long longOrNull = null;
        longOrNull = null;
        Response response = (Response) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        if (response == null) {
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            return new ApiResult.Failed(new ErrorCode.Error(thM3848exceptionOrNullimpl != null ? thM3848exceptionOrNullimpl.getMessage() : null));
        }
        if (!response.isSuccessful()) {
            return new ApiResult.Failed(new ErrorCode.ApiError(String.valueOf(response.code()), response.message()));
        }
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null || (strString = responseBodyBody.string()) == null || !(!m.isBlank(strString))) {
            strString = null;
        }
        if (strString == null) {
            return new ApiResult.Failed(ErrorCode.NoneData.INSTANCE);
        }
        try {
            JsonObject jsonObject = JsonElementKt.getJsonObject(SerialzationKtxKt.getNonStrictInstance(Json.INSTANCE).parseToJsonElement(strString));
            JsonArray jsonArray = JsonElementKt.getJsonArray((JsonElement) MapsKt.getValue(jsonObject, "items"));
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(jsonArray, 10));
            Iterator<JsonElement> it2 = jsonArray.iterator();
            while (it2.hasNext()) {
                arrayList.add(eventParse.invoke(JsonElementKt.getJsonObject(it2.next())));
            }
            JsonElement jsonElement = (JsonElement) jsonObject.get((Object) "next");
            if (jsonElement != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) != null) {
                longOrNull = JsonElementKt.getLongOrNull(jsonPrimitive);
            }
            return new ApiResult.Success(new UserEventList(arrayList, longOrNull));
        } catch (Exception e2) {
            return new ApiResult.Failed(new ErrorCode.ParseError(e2.getLocalizedMessage()));
        }
    }
}
