package com.huami.account.userinfo.datasource;

import android.text.TextUtils;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.facebook.GraphRequest;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.account.api.PersonInfoMapper;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.userinfo.datasource.PersonInfoRemoteDataSource;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.webapi.account.model.HMBeanAlarmClock;
import com.xiaomi.hm.health.webapi.account.model.HMBeanConfig;
import com.xiaomi.hm.health.webapi.account.model.HMBeanPersonInfo;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\n\u001a\u00020\tJ'\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/huami/account/userinfo/datasource/PersonInfoRemoteDataSource;", "Lcom/huami/http/HttpKit;", "Lcom/google/gson/JsonElement;", "element", "Ljava/lang/reflect/Type;", "type", "", "Lcom/xiaomi/hm/health/webapi/account/model/HMBeanAlarmClock;", "e", "Lcom/huami/network/base/model/HMHttpResponseData;", "getUserInfo", "", "", GraphRequest.FIELDS_PARAM, "", "uploadPartOfPersonInfo", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", AbstractJSONTokenResponse.RESPONSE, "Lcom/xiaomi/hm/health/webapi/account/model/HMBeanPersonInfo;", "parsePersonInfo", "<init>", "()V", "Companion", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class PersonInfoRemoteDataSource implements HttpKit {

    @NotNull
    private static final String a = "personInfoManager";

    @NotNull
    private static final String b = "huami.health.bindProfile.json";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Gson parse alarm error!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Json parse alarm error!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parse Long type error!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.userinfo.datasource.PersonInfoRemoteDataSource$uploadPartOfPersonInfo$3", f = "PersonInfoRemoteDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ String d;
        public final /* synthetic */ FormBody e;
        public final /* synthetic */ String f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "uploadPartOfPersonInfo error";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, FormBody formBody, String str2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.d = str;
            this.e = formBody;
            this.f = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = PersonInfoRemoteDataSource.this.new d(this.d, this.e, this.f, continuation);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zIsSuccessful;
            Object objM3845constructorimpl;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PersonInfoRemoteDataSource personInfoRemoteDataSource = PersonInfoRemoteDataSource.this;
            String str = this.d;
            FormBody formBody = this.e;
            try {
                Result.Companion companion = Result.Companion;
                zIsSuccessful = HttpKitKtxKt.httpPost$default(personInfoRemoteDataSource, str, formBody, null, null, 12, null).isSuccessful();
                try {
                    objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
            } catch (Throwable th2) {
                th = th2;
                zIsSuccessful = false;
            }
            String str2 = this.f;
            if (Result.m3851isSuccessimpl(objM3845constructorimpl)) {
                if (zIsSuccessful) {
                    HMAccountKeeper.INSTANCE.setLastSyncPersonInfo(str2);
                    HMPersonInfo.getInstance().saveInfo(0);
                }
            }
            if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
                HMLog.debug(PersonInfoRemoteDataSource.a, a.a);
            }
            return Boxing.boxBoolean(zIsSuccessful);
        }
    }

    private final List<HMBeanAlarmClock> e(JsonElement element, Type type) {
        String strDecodeJson;
        if (element != null) {
            String string = element.toString();
            int length = string.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (!TextUtils.isEmpty(string.subSequence(i, length + 1).toString())) {
                try {
                    strDecodeJson = HMHttpUtils.decodeJson(element.getAsString());
                } catch (Exception unused) {
                    strDecodeJson = HMHttpUtils.decodeJson(element.toString());
                }
                try {
                    return (List) HMHttpUtils.getGson().fromJson(strDecodeJson, type);
                } catch (Exception unused2) {
                    HMLog.verbose(a, a.a);
                    try {
                        JSONArray jSONArray = new JSONArray(strDecodeJson);
                        ArrayList arrayList = new ArrayList();
                        int length2 = jSONArray.length();
                        if (length2 > 0) {
                            int i2 = 0;
                            while (true) {
                                int i3 = i2 + 1;
                                HMBeanAlarmClock hMBeanAlarmClock = new HMBeanAlarmClock();
                                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                                hMBeanAlarmClock.setIndex(jSONObject.optInt("index"));
                                hMBeanAlarmClock.setVisible(jSONObject.optBoolean("visible"));
                                hMBeanAlarmClock.setCalendar((Calendar) HMHttpUtils.getGson().fromJson(jSONObject.getString("calendar"), Calendar.class));
                                hMBeanAlarmClock.setEnabled(jSONObject.optBoolean(Constants.ENABLED, false));
                                hMBeanAlarmClock.setIsUpdate(jSONObject.optInt("isUpdate", 0) == 1);
                                hMBeanAlarmClock.setmDays(jSONObject.optInt("mDays", 0));
                                hMBeanAlarmClock.setDaysForSupportCalendar(jSONObject.optInt("mDaysForSupportCalendar", 0));
                                hMBeanAlarmClock.setmSmartWakeupDuration(jSONObject.optInt("mSmartWakeupDuration", 0));
                                hMBeanAlarmClock.setLazySleepEnable(jSONObject.optBoolean("lazySleepEnable"));
                                hMBeanAlarmClock.isSmart = jSONObject.optBoolean("isSmart");
                                arrayList.add(hMBeanAlarmClock);
                                if (i3 >= length2) {
                                    break;
                                }
                                i2 = i3;
                            }
                        }
                        return arrayList;
                    } catch (Exception unused3) {
                        HMLog.verbose(a, b.a);
                        return new ArrayList();
                    }
                }
            }
        }
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(PersonInfoRemoteDataSource personInfoRemoteDataSource, JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return personInfoRemoteDataSource.e(jsonElement, type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HMBeanConfig g(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        String strDecodeJson;
        if (jsonElement != null) {
            String string = jsonElement.toString();
            int length = string.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (!TextUtils.isEmpty(string.subSequence(i, length + 1).toString())) {
                try {
                    strDecodeJson = HMHttpUtils.decodeJson(jsonElement.getAsString());
                } catch (Exception unused) {
                    strDecodeJson = HMHttpUtils.decodeJson(jsonElement.toString());
                }
                try {
                    return (HMBeanConfig) HMHttpUtils.getGson().fromJson(strDecodeJson, type);
                } catch (Exception unused2) {
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement == null) {
            return null;
        }
        String string = jsonElement.toString();
        int length = string.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (TextUtils.isEmpty(string.subSequence(i, length + 1).toString())) {
            return null;
        }
        return jsonElement.getAsString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long i(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement != null) {
            String string = jsonElement.toString();
            int length = string.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (!TextUtils.isEmpty(string.subSequence(i, length + 1).toString())) {
                try {
                    return Long.valueOf(jsonElement.getAsLong());
                } catch (Exception unused) {
                    HMLog.verbose(a, c.a);
                }
            }
        }
        return 0L;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @NotNull
    public final HMHttpResponseData getUserInfo() {
        final HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
        HMAccountWebAPI.getUserInfo(true, new IHMSimpleHttpResponseHandler() { // from class: com.huami.account.userinfo.datasource.PersonInfoRemoteDataSource.getUserInfo.1
            @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@NotNull HMHttpResponseData item) {
            }

            @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
            public void onSuccess(@NotNull WebResponse response, @NotNull HMHttpResponseData item) {
                if (item.isSuccess() && response.success()) {
                    hMHttpResponseData.copy(item);
                }
            }
        });
        return hMHttpResponseData;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Nullable
    public final HMBeanPersonInfo parsePersonInfo(@NotNull HMHttpResponseData response) {
        try {
            return (HMBeanPersonInfo) new GsonBuilder().registerTypeAdapter(new TypeToken<List<HMBeanAlarmClock>>() { // from class: com.huami.account.userinfo.datasource.PersonInfoRemoteDataSource$parsePersonInfo$gson$1
            }.getType(), new JsonDeserializer() { // from class: ht5
                @Override // com.google.gson.JsonDeserializer
                public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
                    return PersonInfoRemoteDataSource.f(this.a, jsonElement, type, jsonDeserializationContext);
                }
            }).registerTypeAdapter(HMBeanConfig.class, new JsonDeserializer() { // from class: jt5
                @Override // com.google.gson.JsonDeserializer
                public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
                    return PersonInfoRemoteDataSource.g(jsonElement, type, jsonDeserializationContext);
                }
            }).registerTypeAdapter(String.class, new JsonDeserializer() { // from class: it5
                @Override // com.google.gson.JsonDeserializer
                public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
                    return PersonInfoRemoteDataSource.h(jsonElement, type, jsonDeserializationContext);
                }
            }).registerTypeAdapter(Long.TYPE, new JsonDeserializer() { // from class: kt5
                @Override // com.google.gson.JsonDeserializer
                public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
                    return PersonInfoRemoteDataSource.i(jsonElement, type, jsonDeserializationContext);
                }
            }).disableHtmlEscaping().create().fromJson(new JSONObject(new String(response.getResponseBody(), StandardCharsets.UTF_8)).optString("data", MessageFormatter.c), HMBeanPersonInfo.class);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Nullable
    public final Object uploadPartOfPersonInfo(@NotNull Map<String, String> map, @NotNull Continuation<? super Boolean> continuation) {
        String url = HMServerDef.getUrl(b);
        String lastSyncPersonInfo = HMAccountKeeper.INSTANCE.getLastSyncPersonInfo();
        String json = HMHttpUtils.getGson().toJson(PersonInfoMapper.toProfileDataMap$default(HMPersonInfo.getInstance(), null, 1, null));
        boolean z = false;
        if (m.equals$default(lastSyncPersonInfo, json, false, 2, null)) {
            return Boxing.boxBoolean(true);
        }
        List<String> defaultFields = HMPersonInfo.getInstance().getUserInfo().getDefaultFields();
        ArrayList arrayList = new ArrayList();
        if (defaultFields != null) {
            for (String str : defaultFields) {
                if (map.containsKey(str)) {
                    z = true;
                } else {
                    arrayList.add(str);
                }
            }
        }
        HMPersonInfo.getInstance().getUserInfo().setDefaultFields(arrayList);
        FormBody.Builder builder = new FormBody.Builder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builder.add(entry.getKey(), entry.getValue());
        }
        if (z) {
            builder.add(HMAccountWebAPI.PARAM_DEFAULT_FIELDS, CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
        }
        return BuildersKt.withContext(Dispatchers.getIO(), new d(url, builder.build(), json, null), continuation);
    }
}
