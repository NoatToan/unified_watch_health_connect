package com.xiaomi.hm.health.device.webapi.userevent;

import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.webapi.ApiResult;
import com.xiaomi.hm.health.device.webapi.ErrorCode;
import com.xiaomi.hm.health.device.webapi.UserEventApi;
import com.xiaomi.hm.health.device.webapi.UserEventList;
import com.xiaomi.hm.health.utils.SerialzationKtxKt;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.r;
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
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001\u0005B\u000f\u0012\u0006\u0010!\u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002Jw\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u0015\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JB\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0019\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016J(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016J.\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001c2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016R\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 ¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/userevent/UserEventApiImpl;", "Lcom/xiaomi/hm/health/device/webapi/UserEventApi;", "Lcom/huami/http/HttpKit;", "Lkotlinx/serialization/json/JsonElement;", "Lokhttp3/RequestBody;", "a", ExifInterface.GPS_DIRECTION_TRUE, "", "eventType", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonObject;", "eventParse", "subType", "", "from", "to", "next", "", "limit", "", "reverse", "Lcom/xiaomi/hm/health/device/webapi/ApiResult;", "Lcom/xiaomi/hm/health/device/webapi/UserEventList;", "queryUserEvents", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/Boolean;)Lcom/xiaomi/hm/health/device/webapi/ApiResult;", "timestamp", "queryUserEventData", "deleteUserEvent", "", "data", "postUserEvent", "Lcom/xiaomi/hm/health/device/webapi/userevent/UserEventApiUrlProvider;", "Lcom/xiaomi/hm/health/device/webapi/userevent/UserEventApiUrlProvider;", "urlProvider", "<init>", "(Lcom/xiaomi/hm/health/device/webapi/userevent/UserEventApiUrlProvider;)V", "b", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class UserEventApiImpl implements UserEventApi, HttpKit {

    @Deprecated
    @NotNull
    public static final String JSON_KEY_ITEMS = "items";

    @Deprecated
    @NotNull
    public static final String JSON_KEY_NEXT = "next";

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

    @NotNull
    private static final a b = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final UserEventApiUrlProvider urlProvider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, d2 = {"com/xiaomi/hm/health/device/webapi/userevent/UserEventApiImpl$a", "", "", "JSON_KEY_ITEMS", "Ljava/lang/String;", "JSON_KEY_NEXT", "MEDIA_TYPE_JSON", "PARAMS_EVENT_TYPE", "PARAMS_FROM", "PARAMS_LIMIT", "PARAMS_NEXT", "PARAMS_REVERSE", "PARAMS_SUB_TYPE", "PARAMS_TIMESTAMP", "PARAMS_TO", "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
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
        public final String invoke() {
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
        public final String invoke() {
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
        public final String invoke() {
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
        public final String invoke() {
            return "Query user events: " + this.a + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.b;
        }
    }

    public UserEventApiImpl(@NotNull UserEventApiUrlProvider userEventApiUrlProvider) {
        this.urlProvider = userEventApiUrlProvider;
    }

    private final RequestBody a(JsonElement jsonElement) {
        return RequestBody.create(MediaType.parse("application/json"), jsonElement.toString());
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.xiaomi.hm.health.device.webapi.UserEventApi
    @NotNull
    public ApiResult<Boolean> deleteUserEvent(@NotNull String eventType, long timestamp, @Nullable String subType) {
        Object objM3845constructorimpl;
        HMLog.info("UserEventApiImpl", new b(eventType, subType));
        String strInvoke = this.urlProvider.getEventUrl().invoke(eventType);
        if (m.isBlank(strInvoke)) {
            return new ApiResult.Failed(new ErrorCode.InvalidUrl(strInvoke));
        }
        Uri.Builder builderBuildUpon = Uri.parse(strInvoke).buildUpon();
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

    @Override // com.xiaomi.hm.health.device.webapi.UserEventApi
    @NotNull
    public ApiResult<Boolean> postUserEvent(@NotNull String eventType, @NotNull List<JsonObject> data, @Nullable String subType) {
        Object objM3845constructorimpl;
        HMLog.info("UserEventApiImpl", new c(eventType, subType));
        String strInvoke = this.urlProvider.getEventsUrl().invoke();
        if (m.isBlank(strInvoke)) {
            return new ApiResult.Failed(new ErrorCode.InvalidUrl(strInvoke));
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
        Iterator<T> it2 = data.iterator();
        while (it2.hasNext()) {
            Map mutableMap = r.toMutableMap((JsonObject) it2.next());
            mutableMap.put("eventType", JsonElementKt.JsonPrimitive(eventType));
            if (subType != null) {
                mutableMap.put("subType", JsonElementKt.JsonPrimitive(subType));
            }
            arrayList.add(new JsonObject(mutableMap));
        }
        RequestBody requestBodyA = a(new JsonArray(arrayList));
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(HttpKitKtxKt.httpPost$default(this, strInvoke, requestBodyA, null, null, 12, null));
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

    @Override // com.xiaomi.hm.health.device.webapi.UserEventApi
    @NotNull
    public <T> ApiResult<T> queryUserEventData(@NotNull String eventType, @NotNull Function1<? super JsonObject, ? extends T> eventParse, long timestamp, @Nullable String subType) {
        Object objM3845constructorimpl;
        String string;
        HMLog.info("UserEventApiImpl", new d(eventType, subType));
        String strInvoke = this.urlProvider.getEventUrl().invoke(eventType);
        if (m.isBlank(strInvoke)) {
            return new ApiResult.Failed(new ErrorCode.InvalidUrl(strInvoke));
        }
        Uri.Builder builderBuildUpon = Uri.parse(strInvoke).buildUpon();
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

    @Override // com.xiaomi.hm.health.device.webapi.UserEventApi
    @NotNull
    public <T> ApiResult<UserEventList<T>> queryUserEvents(@NotNull String eventType, @NotNull Function1<? super JsonObject, ? extends T> eventParse, @Nullable String subType, @Nullable Long from, @Nullable Long to, @Nullable Long next, int limit, @Nullable Boolean reverse) {
        Object objM3845constructorimpl;
        String strString;
        JsonObject jsonObject;
        HMLog.info("UserEventApiImpl", new e(eventType, subType));
        String strInvoke = this.urlProvider.getEventsUrl().invoke();
        if (m.isBlank(strInvoke)) {
            return new ApiResult.Failed(new ErrorCode.InvalidUrl(strInvoke));
        }
        Uri.Builder builderBuildUpon = Uri.parse(strInvoke).buildUpon();
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
        T tInvoke = (T) null;
        Response response = (Response) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        if (response == null) {
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                tInvoke = (T) thM3848exceptionOrNullimpl.getMessage();
            }
            return new ApiResult.Failed(new ErrorCode.Error(tInvoke));
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
            JsonObject jsonObject2 = JsonElementKt.getJsonObject(SerialzationKtxKt.getNonStrictInstance(Json.INSTANCE).parseToJsonElement(strString));
            JsonArray jsonArray = JsonElementKt.getJsonArray((JsonElement) MapsKt.getValue(jsonObject2, "items"));
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(jsonArray, 10));
            Iterator<JsonElement> it2 = jsonArray.iterator();
            while (it2.hasNext()) {
                arrayList.add(eventParse.invoke(JsonElementKt.getJsonObject(it2.next())));
            }
            JsonElement jsonElement = (JsonElement) jsonObject2.get((Object) "next");
            if (jsonElement != null && (jsonObject = JsonElementKt.getJsonObject(jsonElement)) != null) {
                tInvoke = eventParse.invoke(jsonObject);
            }
            return new ApiResult.Success(new UserEventList(arrayList, tInvoke));
        } catch (Exception e2) {
            return new ApiResult.Failed(new ErrorCode.ParseError(e2.getLocalizedMessage()));
        }
    }
}
