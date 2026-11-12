package com.xiaomi.hm.health.temperature.remote;

import com.huami.devicex.injection.webapi.TempWebApi;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.healthdata.api.WebUtils;
import com.xiaomi.hm.health.temperature.remote.bean.AllDayTempBean;
import com.xiaomi.hm.health.temperature.remote.bean.AllDayTempResponse;
import com.xiaomi.hm.health.temperature.remote.bean.ManualTempBean;
import com.xiaomi.hm.health.temperature.remote.bean.ManualTempResponse;
import com.xiaomi.hm.health.temperature.remote.bean.SingleTempBean;
import com.xiaomi.hm.health.temperature.remote.bean.SingleTempResponse;
import com.xiaomi.hm.health.temperature.remote.net.ApiResponse;
import com.xiaomi.hm.health.temperature.remote.net.TempWebApiUtils;
import com.xiaomi.hm.health.utils.SerialzationKtxKt;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bJ'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000bJ9\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017J9\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/temperature/remote/TempWebApiImpl;", "Lcom/huami/devicex/injection/webapi/TempWebApi;", "", "userId", "", "a", "", "Lcom/xiaomi/hm/health/temperature/remote/bean/SingleTempBean;", "data", "Lcom/xiaomi/hm/health/temperature/remote/net/ApiResponse;", "uploadSingleTemp", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/temperature/remote/bean/AllDayTempBean;", "uploadAllDayTemp", "Lcom/xiaomi/hm/health/temperature/remote/bean/ManualTempBean;", "uploadManualTemp", "", "from", "to", "", "limit", "Lcom/xiaomi/hm/health/temperature/remote/bean/SingleTempResponse;", "fetchSingleTempByTimeRange", "(Ljava/lang/String;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/temperature/remote/bean/AllDayTempResponse;", "fetchAllDayTempByTimeRange", "Lcom/xiaomi/hm/health/temperature/remote/bean/ManualTempResponse;", "fetchManualTempByTimeRange", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TempWebApiImpl implements TempWebApi {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HMHttpResponseData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMHttpResponseData hMHttpResponseData) {
            super(0);
            this.a = hMHttpResponseData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "delete success " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/temperature/remote/net/ApiResponse;", "Lcom/xiaomi/hm/health/temperature/remote/bean/AllDayTempResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.temperature.remote.TempWebApiImpl$fetchAllDayTempByTimeRange$2", f = "TempWebApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResponse<AllDayTempResponse>>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, long j, long j2, int i, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = j;
            this.d = j2;
            this.e = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ApiResponse<AllDayTempResponse>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String strReplace$default = m.replace$default(HMServerDef.getUrl("users/{userId}/events"), "{userId}", this.b, false, 4, (Object) null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long j = this.c;
            long j2 = this.d;
            int i = this.e;
            linkedHashMap.put("eventType", "allDayTemperature");
            linkedHashMap.put("from", Boxing.boxLong(j));
            linkedHashMap.put("to", Boxing.boxLong(j2));
            linkedHashMap.put("reverse", Boxing.boxBoolean(true));
            linkedHashMap.put("limit", Boxing.boxInt(i));
            return TempWebApiUtils.INSTANCE.parseResponse(WebUtils.INSTANCE.get(strReplace$default, linkedHashMap), AllDayTempResponse.INSTANCE.serializer());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/temperature/remote/net/ApiResponse;", "Lcom/xiaomi/hm/health/temperature/remote/bean/ManualTempResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.temperature.remote.TempWebApiImpl$fetchManualTempByTimeRange$2", f = "TempWebApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResponse<ManualTempResponse>>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, long j, long j2, int i, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = j;
            this.d = j2;
            this.e = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ApiResponse<ManualTempResponse>> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String strReplace$default = m.replace$default(HMServerDef.getUrl("users/{userId}/events"), "{userId}", this.b, false, 4, (Object) null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long j = this.c;
            long j2 = this.d;
            int i = this.e;
            linkedHashMap.put("eventType", "health_data");
            linkedHashMap.put("subType", "temperature");
            linkedHashMap.put("from", Boxing.boxLong(j));
            linkedHashMap.put("to", Boxing.boxLong(j2));
            linkedHashMap.put("reverse", Boxing.boxBoolean(true));
            linkedHashMap.put("limit", Boxing.boxInt(i));
            return TempWebApiUtils.INSTANCE.parseResponse(WebUtils.INSTANCE.get(strReplace$default, linkedHashMap), ManualTempResponse.INSTANCE.serializer());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/temperature/remote/net/ApiResponse;", "Lcom/xiaomi/hm/health/temperature/remote/bean/SingleTempResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.temperature.remote.TempWebApiImpl$fetchSingleTempByTimeRange$2", f = "TempWebApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResponse<SingleTempResponse>>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, long j, long j2, int i, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = j;
            this.d = j2;
            this.e = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ApiResponse<SingleTempResponse>> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String strReplace$default = m.replace$default(HMServerDef.getUrl("users/{userId}/events"), "{userId}", this.b, false, 4, (Object) null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long j = this.c;
            long j2 = this.d;
            int i = this.e;
            linkedHashMap.put("eventType", "singleTemperature");
            linkedHashMap.put("from", Boxing.boxLong(j));
            linkedHashMap.put("to", Boxing.boxLong(j2));
            linkedHashMap.put("reverse", Boxing.boxBoolean(true));
            linkedHashMap.put("limit", Boxing.boxInt(i));
            return TempWebApiUtils.INSTANCE.parseResponse(WebUtils.INSTANCE.get(strReplace$default, linkedHashMap), SingleTempResponse.INSTANCE.serializer());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/temperature/remote/net/ApiResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.temperature.remote.TempWebApiImpl$uploadAllDayTemp$2", f = "TempWebApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResponse<String>>, Object> {
        public int a;
        public final /* synthetic */ List<AllDayTempBean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<AllDayTempBean> list, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ApiResponse<String>> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TempWebApiUtils.INSTANCE.parseEmptyResponse(WebUtils.INSTANCE.post(m.replace$default(HMServerDef.getUrl("users/{userId}/events"), "{userId}", ((AllDayTempBean) CollectionsKt.first((List) this.b)).getUserId(), false, 4, (Object) null), SerialzationKtxKt.getEnableEncodeDefaults(Json.INSTANCE).encodeToString(BuiltinSerializersKt.ListSerializer(AllDayTempBean.INSTANCE.serializer()), this.b), WebUtils.ContentType.JSON));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/temperature/remote/net/ApiResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.temperature.remote.TempWebApiImpl$uploadManualTemp$2", f = "TempWebApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResponse<String>>, Object> {
        public int a;
        public final /* synthetic */ List<ManualTempBean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<ManualTempBean> list, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ApiResponse<String>> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TempWebApiUtils.INSTANCE.parseEmptyResponse(WebUtils.INSTANCE.post(m.replace$default(HMServerDef.getUrl("users/{userId}/events"), "{userId}", ((ManualTempBean) CollectionsKt.first((List) this.b)).getUserId(), false, 4, (Object) null), SerialzationKtxKt.getEnableEncodeDefaults(Json.INSTANCE).encodeToString(BuiltinSerializersKt.ListSerializer(ManualTempBean.INSTANCE.serializer()), this.b), WebUtils.ContentType.JSON));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/temperature/remote/net/ApiResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.temperature.remote.TempWebApiImpl$uploadSingleTemp$2", f = "TempWebApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResponse<String>>, Object> {
        public int a;
        public final /* synthetic */ List<SingleTempBean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<SingleTempBean> list, Continuation<? super g> continuation) {
            super(2, continuation);
            this.b = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new g(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ApiResponse<String>> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TempWebApiUtils.INSTANCE.parseEmptyResponse(WebUtils.INSTANCE.post(m.replace$default(HMServerDef.getUrl("users/{userId}/events"), "{userId}", ((SingleTempBean) CollectionsKt.first((List) this.b)).getUserId(), false, 4, (Object) null), SerialzationKtxKt.getEnableEncodeDefaults(Json.INSTANCE).encodeToString(BuiltinSerializersKt.ListSerializer(SingleTempBean.INSTANCE.serializer()), this.b), WebUtils.ContentType.JSON));
        }
    }

    private final void a(String userId) {
        HMHttpResponseData hMHttpResponseDataDelete = WebUtils.INSTANCE.delete(m.replace$default(m.replace$default(HMServerDef.getUrl("users/{userId}/event/{eventType}"), "{userId}", userId, false, 4, (Object) null), "{eventType}", "allDayTemperature", false, 4, (Object) null), q.mapOf(TuplesKt.to("timestamp", "1600790400001")));
        TempWebApiUtils.INSTANCE.parseEmptyResponse(hMHttpResponseDataDelete);
        HMLog.info("TempWebApiImpl", new a(hMHttpResponseDataDelete));
    }

    @Override // com.huami.devicex.injection.webapi.TempWebApi
    @Nullable
    public Object fetchAllDayTempByTimeRange(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super ApiResponse<AllDayTempResponse>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(str, j, j2, i, null), continuation);
    }

    @Override // com.huami.devicex.injection.webapi.TempWebApi
    @Nullable
    public Object fetchManualTempByTimeRange(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super ApiResponse<ManualTempResponse>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new c(str, j, j2, i, null), continuation);
    }

    @Override // com.huami.devicex.injection.webapi.TempWebApi
    @Nullable
    public Object fetchSingleTempByTimeRange(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super ApiResponse<SingleTempResponse>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new d(str, j, j2, i, null), continuation);
    }

    @Override // com.huami.devicex.injection.webapi.TempWebApi
    @Nullable
    public Object uploadAllDayTemp(@NotNull List<AllDayTempBean> list, @NotNull Continuation<? super ApiResponse<String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new e(list, null), continuation);
    }

    @Override // com.huami.devicex.injection.webapi.TempWebApi
    @Nullable
    public Object uploadManualTemp(@NotNull List<ManualTempBean> list, @NotNull Continuation<? super ApiResponse<String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new f(list, null), continuation);
    }

    @Override // com.huami.devicex.injection.webapi.TempWebApi
    @Nullable
    public Object uploadSingleTemp(@NotNull List<SingleTempBean> list, @NotNull Continuation<? super ApiResponse<String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new g(list, null), continuation);
    }
}
