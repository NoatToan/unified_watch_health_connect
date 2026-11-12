package com.huami.phn.core.source.impl;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.phn.core.model.PHNDailyAnalysisResult;
import com.huami.phn.core.model.PHNProjectRecord;
import com.huami.phn.core.source.RemoteDataSource;
import com.huami.phn.core.webapi.ApiResult;
import com.huami.phn.core.webapi.PHNInitWebApi;
import com.huami.phn.core.webapi.RemoteResult;
import com.huami.phn.core.webapi.UserEventApi;
import com.huami.phn.core.webapi.UserEventList;
import com.huami.phn.core.webapi.impl.PHNInitWebApiImpl;
import com.huami.phn.util.SerialzationKtxKt;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.e;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020&¢\u0006\u0004\b)\u0010*J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\b*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0002J(\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u00110\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0002J(\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u00110\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\bH\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\b2\u0006\u0010\u0019\u001a\u00020\u0004H\u0016J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0016J-\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\b2\u0006\u0010 \u001a\u00020\rH\u0016J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0016R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'¨\u0006+"}, d2 = {"Lcom/huami/phn/core/source/impl/RemoteDataSourceImpl;", "Lcom/huami/phn/core/source/RemoteDataSource;", "", "jsonData", "Lcom/huami/phn/core/model/PHNProjectRecord;", "a", "Lcom/huami/phn/core/webapi/ApiResult;", "", "Lcom/huami/phn/core/webapi/RemoteResult;", "f", "Lkotlinx/serialization/json/JsonObject;", "json", "e", "Lcom/huami/phn/core/model/PHNDailyAnalysisResult;", GoogleApiAvailabilityLight.a, "", "records", "Lkotlin/Pair;", "", "c", "analysisResultList", "b", PHNInitWebApiImpl.PARAM_PHN_ALGO_VERSION, "postPHNInit", "getPHNProjectRecord", "record", "pushPHNProjectRecord", "queryTime", "", "limitSize", "getPHNDailyAnalysis", "(Ljava/lang/Long;I)Lcom/huami/phn/core/webapi/RemoteResult;", "result", "pushPHNDailyAnalysis", "results", "Lcom/huami/phn/core/webapi/PHNInitWebApi;", "Lcom/huami/phn/core/webapi/PHNInitWebApi;", "phnInitApi", "Lcom/huami/phn/core/webapi/UserEventApi;", "Lcom/huami/phn/core/webapi/UserEventApi;", "ueApi", "<init>", "(Lcom/huami/phn/core/webapi/PHNInitWebApi;Lcom/huami/phn/core/webapi/UserEventApi;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class RemoteDataSourceImpl implements RemoteDataSource {

    @Deprecated
    @NotNull
    public static final String NODE_RESULT = "result";

    @Deprecated
    @NotNull
    public static final String NODE_TIMESTAMP = "timestamp";

    @Deprecated
    @NotNull
    public static final String NODE_VALUE = "value";

    @Deprecated
    public static final int QUERY_LIMIT = 50;

    @Deprecated
    @NotNull
    public static final String USER_PHN_DAILY_ANA_SUB_KEY = "daily_analysis";

    @Deprecated
    @NotNull
    public static final String USER_PHN_EVENT_KEY = "phn";

    @Deprecated
    @NotNull
    public static final String USER_PHN_PLAN_SUB_KEY = "training_plan";

    @NotNull
    private static final b c = new b(null);

    @Deprecated
    @NotNull
    private static final Lazy<Json> d = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PHNInitWebApi phnInitApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final UserEventApi ueApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/serialization/json/Json;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Json> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.phn.core.source.impl.RemoteDataSourceImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0537a extends Lambda implements Function1<JsonBuilder, Unit> {
            public static final C0537a a = new C0537a();

            public C0537a() {
                super(1);
            }

            public final void a(@NotNull JsonBuilder jsonBuilder) {
                jsonBuilder.setEncodeDefaults(true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
                a(jsonBuilder);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Json getA() {
            return JsonKt.Json$default(null, C0537a.a, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0016\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0016\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\n¨\u0006\u0015"}, d2 = {"com/huami/phn/core/source/impl/RemoteDataSourceImpl$b", "", "Lkotlinx/serialization/json/Json;", "json$delegate", "Lkotlin/Lazy;", "a", "()Lkotlinx/serialization/json/Json;", "json", "", "NODE_RESULT", "Ljava/lang/String;", "NODE_TIMESTAMP", "NODE_VALUE", "", "QUERY_LIMIT", LogUtil.I, "USER_PHN_DAILY_ANA_SUB_KEY", "USER_PHN_EVENT_KEY", "USER_PHN_PLAN_SUB_KEY", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Json a() {
            return (Json) RemoteDataSourceImpl.d.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1<JsonObject, PHNDailyAnalysisResult> {
        public c(Object obj) {
            super(1, obj, RemoteDataSourceImpl.class, "parsePHNDailyAnalysis", "parsePHNDailyAnalysis(Lkotlinx/serialization/json/JsonObject;)Lcom/huami/phn/core/model/PHNDailyAnalysisResult;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PHNDailyAnalysisResult invoke(@NotNull JsonObject jsonObject) {
            return ((RemoteDataSourceImpl) this.receiver).d(jsonObject);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1<JsonObject, PHNProjectRecord> {
        public d(Object obj) {
            super(1, obj, RemoteDataSourceImpl.class, "parsePHNProject", "parsePHNProject(Lkotlinx/serialization/json/JsonObject;)Lcom/huami/phn/core/model/PHNProjectRecord;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PHNProjectRecord invoke(@NotNull JsonObject jsonObject) {
            return ((RemoteDataSourceImpl) this.receiver).e(jsonObject);
        }
    }

    public RemoteDataSourceImpl(@NotNull PHNInitWebApi pHNInitWebApi, @NotNull UserEventApi userEventApi) {
        this.phnInitApi = pHNInitWebApi;
        this.ueApi = userEventApi;
    }

    private final PHNProjectRecord a(String jsonData) {
        JsonPrimitive jsonPrimitive;
        JsonPrimitive jsonPrimitive2;
        String contentOrNull;
        JsonObject jsonObject;
        JsonPrimitive jsonPrimitive3;
        Json.Companion companion = Json.INSTANCE;
        JsonElement jsonElement = (JsonElement) JsonElementKt.getJsonObject(companion.parseToJsonElement(jsonData)).get((Object) "data");
        JsonObject jsonObject2 = jsonElement == null ? null : JsonElementKt.getJsonObject(jsonElement);
        if (jsonObject2 == null) {
            return null;
        }
        JsonElement jsonElement2 = (JsonElement) jsonObject2.get((Object) "timestamp");
        Long longOrNull = (jsonElement2 == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : JsonElementKt.getLongOrNull(jsonPrimitive);
        if (longOrNull == null) {
            return null;
        }
        long jLongValue = longOrNull.longValue();
        JsonElement jsonElement3 = (JsonElement) jsonObject2.get((Object) "value");
        JsonObject jsonObject3 = jsonElement3 == null ? null : JsonElementKt.getJsonObject(jsonElement3);
        if (jsonObject3 == null) {
            return null;
        }
        JsonElement jsonElement4 = (JsonElement) jsonObject3.get((Object) "result");
        JsonObject jsonObject4 = (jsonElement4 == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement4)) == null || (contentOrNull = JsonElementKt.getContentOrNull(jsonPrimitive2)) == null) ? null : JsonElementKt.getJsonObject(SerialzationKtxKt.getNonStrictInstance(companion).parseToJsonElement(contentOrNull));
        if (jsonObject4 == null) {
            return null;
        }
        Map mutableMap = r.toMutableMap(jsonObject4);
        mutableMap.put("last_update_time", JsonElementKt.JsonPrimitive(Long.valueOf(System.currentTimeMillis() / ((long) 1000))));
        mutableMap.put("last_update_time_zone", JsonElementKt.JsonPrimitive(Integer.valueOf(ProfileUtils.getTimezoneKey(TimeZone.getDefault()))));
        JsonObject jsonObject5 = new JsonObject(mutableMap);
        JsonElement jsonElement5 = (JsonElement) jsonObject3.get((Object) "setting");
        PHNProjectRecord.PHNProjectSetting pHNProjectSetting = (jsonElement5 == null || (jsonObject = JsonElementKt.getJsonObject(jsonElement5)) == null) ? null : (PHNProjectRecord.PHNProjectSetting) companion.decodeFromString(SerializersKt.serializer(companion.getSerializersModule(), Reflection.typeOf(PHNProjectRecord.PHNProjectSetting.class)), jsonObject.toString());
        if (pHNProjectSetting == null) {
            return null;
        }
        JsonElement jsonElement6 = (JsonElement) jsonObject3.get((Object) "version");
        String contentOrNull2 = (jsonElement6 == null || (jsonPrimitive3 = JsonElementKt.getJsonPrimitive(jsonElement6)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive3);
        if (contentOrNull2 == null) {
            return null;
        }
        return new PHNProjectRecord(jLongValue, contentOrNull2, pHNProjectSetting, jsonObject5, 0, 1);
    }

    private final List<Pair<Long, JsonObject>> b(List<PHNDailyAnalysisResult> analysisResultList) {
        JsonPrimitive jsonPrimitive;
        ArrayList arrayList = new ArrayList();
        for (PHNDailyAnalysisResult pHNDailyAnalysisResult : analysisResultList) {
            Json jsonA = c.a();
            JsonObject jsonObject = JsonElementKt.getJsonObject(jsonA.encodeToJsonElement(SerializersKt.serializer(jsonA.getSerializersModule(), Reflection.typeOf(PHNDailyAnalysisResult.class)), pHNDailyAnalysisResult));
            JsonElement jsonElement = (JsonElement) jsonObject.get((Object) "timestamp");
            Long longOrNull = null;
            if (jsonElement != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) != null) {
                longOrNull = JsonElementKt.getLongOrNull(jsonPrimitive);
            }
            if (longOrNull == null) {
                throw new IllegalArgumentException("no timestamp convert error!!!");
            }
            long jLongValue = longOrNull.longValue();
            Map mutableMap = r.toMutableMap(jsonObject);
            mutableMap.remove("timestamp");
            arrayList.add(new Pair(Long.valueOf(jLongValue), new JsonObject(mutableMap)));
        }
        return arrayList;
    }

    private final List<Pair<Long, JsonObject>> c(List<PHNProjectRecord> records) {
        JsonPrimitive jsonPrimitive;
        JsonObject jsonObject;
        ArrayList arrayList = new ArrayList();
        for (PHNProjectRecord pHNProjectRecord : records) {
            Json jsonA = c.a();
            JsonObject jsonObject2 = JsonElementKt.getJsonObject(jsonA.encodeToJsonElement(SerializersKt.serializer(jsonA.getSerializersModule(), Reflection.typeOf(PHNProjectRecord.class)), pHNProjectRecord));
            JsonElement jsonElement = (JsonElement) jsonObject2.get((Object) "timestamp");
            String string = null;
            Long longOrNull = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : JsonElementKt.getLongOrNull(jsonPrimitive);
            if (longOrNull == null) {
                throw new IllegalArgumentException("no timestamp convert error!!!");
            }
            long jLongValue = longOrNull.longValue();
            JsonElement jsonElement2 = (JsonElement) jsonObject2.get((Object) "result");
            if (jsonElement2 != null && (jsonObject = JsonElementKt.getJsonObject(jsonElement2)) != null) {
                string = jsonObject.toString();
            }
            Map mutableMap = r.toMutableMap(jsonObject2);
            mutableMap.remove("timestamp");
            mutableMap.put("result", JsonElementKt.JsonPrimitive(string));
            arrayList.add(new Pair(Long.valueOf(jLongValue), new JsonObject(mutableMap)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PHNDailyAnalysisResult d(JsonObject json) {
        JsonObject jsonObject;
        JsonPrimitive jsonPrimitive;
        Json.Companion companion = Json.INSTANCE;
        JsonElement toJsonElement = companion.parseToJsonElement(json.toString());
        JsonElement jsonElement = (JsonElement) JsonElementKt.getJsonObject(toJsonElement).get((Object) "value");
        Unit unit = null;
        Map mutableMap = (jsonElement == null || (jsonObject = JsonElementKt.getJsonObject(jsonElement)) == null) ? null : r.toMutableMap(jsonObject);
        if (mutableMap == null) {
            throw new IllegalArgumentException("no node value cause parse error!!!");
        }
        JsonElement jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(toJsonElement).get((Object) "timestamp");
        if (jsonElement2 != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) != null) {
            mutableMap.put("timestamp", jsonPrimitive);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            throw new IllegalArgumentException("no timestamp parse error!!!");
        }
        Json nonStrictInstance = SerialzationKtxKt.getNonStrictInstance(companion);
        PHNDailyAnalysisResult pHNDailyAnalysisResult = (PHNDailyAnalysisResult) nonStrictInstance.decodeFromString(SerializersKt.serializer(nonStrictInstance.getSerializersModule(), Reflection.typeOf(PHNDailyAnalysisResult.class)), new JsonObject(mutableMap).toString());
        pHNDailyAnalysisResult.stateChangeByServer();
        return pHNDailyAnalysisResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PHNProjectRecord e(JsonObject json) {
        JsonObject jsonObject;
        JsonPrimitive jsonPrimitive;
        Unit unit;
        JsonPrimitive jsonPrimitive2;
        String contentOrNull;
        Json.Companion companion = Json.INSTANCE;
        JsonElement toJsonElement = companion.parseToJsonElement(json.toString());
        JsonElement jsonElement = (JsonElement) JsonElementKt.getJsonObject(toJsonElement).get((Object) "value");
        JsonObject jsonObject2 = null;
        Map mutableMap = (jsonElement == null || (jsonObject = JsonElementKt.getJsonObject(jsonElement)) == null) ? null : r.toMutableMap(jsonObject);
        if (mutableMap == null) {
            throw new IllegalArgumentException("no node value cause parse error!!!");
        }
        JsonElement jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(toJsonElement).get((Object) "timestamp");
        if (jsonElement2 == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) {
            unit = null;
        } else {
            mutableMap.put("timestamp", jsonPrimitive);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            throw new IllegalArgumentException("no timestamp parse error!!!");
        }
        JsonElement jsonElement3 = (JsonElement) mutableMap.get("result");
        if (jsonElement3 != null && (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement3)) != null && (contentOrNull = JsonElementKt.getContentOrNull(jsonPrimitive2)) != null) {
            jsonObject2 = JsonElementKt.getJsonObject(SerialzationKtxKt.getNonStrictInstance(companion).parseToJsonElement(contentOrNull));
        }
        if (jsonObject2 == null) {
            throw new IllegalArgumentException("no result parse error!!!");
        }
        mutableMap.put("result", jsonObject2);
        Json nonStrictInstance = SerialzationKtxKt.getNonStrictInstance(companion);
        PHNProjectRecord pHNProjectRecord = (PHNProjectRecord) nonStrictInstance.decodeFromString(SerializersKt.serializer(nonStrictInstance.getSerializersModule(), Reflection.typeOf(PHNProjectRecord.class)), new JsonObject(mutableMap).toString());
        pHNProjectRecord.stateChangeByServer();
        return pHNProjectRecord;
    }

    private final RemoteResult<Boolean> f(ApiResult<Boolean> apiResult) {
        if (apiResult instanceof ApiResult.Failed) {
            return new RemoteResult.Failed(((ApiResult.Failed) apiResult).getCode());
        }
        if (apiResult instanceof ApiResult.Success) {
            return new RemoteResult.Success(Boolean.TRUE);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.huami.phn.core.source.RemoteDataSource
    @NotNull
    public RemoteResult<List<PHNDailyAnalysisResult>> getPHNDailyAnalysis(@Nullable Long queryTime, int limitSize) {
        ArrayList arrayList = new ArrayList();
        Long next = null;
        int size = 0;
        while (true) {
            ApiResult apiResultQueryUserEvents$default = UserEventApi.DefaultImpls.queryUserEvents$default(this.ueApi, USER_PHN_EVENT_KEY, new c(this), USER_PHN_DAILY_ANA_SUB_KEY, null, queryTime, next, 50, Boolean.TRUE, 8, null);
            if (apiResultQueryUserEvents$default instanceof ApiResult.Failed) {
                return new RemoteResult.Failed(((ApiResult.Failed) apiResultQueryUserEvents$default).getCode());
            }
            boolean z = true;
            if (apiResultQueryUserEvents$default instanceof ApiResult.Success) {
                ApiResult.Success success = (ApiResult.Success) apiResultQueryUserEvents$default;
                if (!((UserEventList) success.getData()).getItems().isEmpty()) {
                    arrayList.addAll(((UserEventList) success.getData()).getItems());
                    size += ((UserEventList) success.getData()).getItems().size();
                }
                next = ((UserEventList) success.getData()).getNext();
            }
            int i = size;
            if (next != null) {
                if (limitSize > 0 && i > limitSize) {
                    z = false;
                }
                if (z) {
                    size = i;
                }
            }
            return new RemoteResult.Success(arrayList);
        }
    }

    @Override // com.huami.phn.core.source.RemoteDataSource
    @NotNull
    public RemoteResult<List<PHNProjectRecord>> getPHNProjectRecord() {
        ArrayList arrayList = new ArrayList();
        Long next = null;
        do {
            ApiResult apiResultQueryUserEvents$default = UserEventApi.DefaultImpls.queryUserEvents$default(this.ueApi, USER_PHN_EVENT_KEY, new d(this), USER_PHN_PLAN_SUB_KEY, null, null, next, 50, null, 152, null);
            if (apiResultQueryUserEvents$default instanceof ApiResult.Failed) {
                return new RemoteResult.Failed(((ApiResult.Failed) apiResultQueryUserEvents$default).getCode());
            }
            if (apiResultQueryUserEvents$default instanceof ApiResult.Success) {
                ApiResult.Success success = (ApiResult.Success) apiResultQueryUserEvents$default;
                if (!((UserEventList) success.getData()).getItems().isEmpty()) {
                    arrayList.addAll(((UserEventList) success.getData()).getItems());
                }
                next = ((UserEventList) success.getData()).getNext();
            }
        } while (next != null);
        return new RemoteResult.Success(arrayList);
    }

    @Override // com.huami.phn.core.source.RemoteDataSource
    @NotNull
    public PHNProjectRecord postPHNInit(@NotNull String jsonData, @NotNull String algoVersion) {
        PHNProjectRecord pHNProjectRecordA = a(this.phnInitApi.postPHNInitData(jsonData, algoVersion));
        if (pHNProjectRecordA != null) {
            return pHNProjectRecordA;
        }
        throw new IllegalStateException("phn-plan record parse error");
    }

    @Override // com.huami.phn.core.source.RemoteDataSource
    @NotNull
    public RemoteResult<Boolean> pushPHNDailyAnalysis(@NotNull PHNDailyAnalysisResult result) {
        return f(this.ueApi.postUserEvent(USER_PHN_EVENT_KEY, b(e.listOf(result)), USER_PHN_DAILY_ANA_SUB_KEY));
    }

    @Override // com.huami.phn.core.source.RemoteDataSource
    @NotNull
    public RemoteResult<Boolean> pushPHNProjectRecord(@NotNull PHNProjectRecord record) {
        return pushPHNProjectRecord(e.listOf(record));
    }

    @Override // com.huami.phn.core.source.RemoteDataSource
    @NotNull
    public RemoteResult<Boolean> pushPHNProjectRecord(@NotNull List<PHNProjectRecord> records) {
        return f(this.ueApi.postUserEvent(USER_PHN_EVENT_KEY, c(records), USER_PHN_PLAN_SUB_KEY));
    }

    @Override // com.huami.phn.core.source.RemoteDataSource
    @NotNull
    public RemoteResult<Boolean> pushPHNDailyAnalysis(@NotNull List<PHNDailyAnalysisResult> results) {
        return f(this.ueApi.postUserEvent(USER_PHN_EVENT_KEY, b(results), USER_PHN_DAILY_ANA_SUB_KEY));
    }
}
