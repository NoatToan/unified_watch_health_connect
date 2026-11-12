package com.huami.stress.domain.data.remote;

import com.google.gson.Gson;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.stress.domain.data.remote.bean.AllDayStressApiBean;
import com.huami.stress.domain.data.remote.bean.GetAllDayStressListResponse;
import com.huami.stress.domain.data.remote.bean.GetSingleStressListResponse;
import com.huami.stress.domain.data.remote.bean.SingleStressApiBean;
import com.huami.stress.domain.data.remote.net.ApiResponse;
import com.huami.stress.domain.data.remote.net.WebApiUtils;
import com.huami.stress.domain.data.remote.net.WebUtils;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0012J9\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/huami/stress/domain/data/remote/StressWebApiImpl;", "Lcom/huami/stress/domain/data/remote/StressWebApi;", "", "userId", "", "Lcom/huami/stress/domain/data/remote/bean/AllDayStressApiBean;", "data", "Lcom/huami/stress/domain/data/remote/net/ApiResponse;", "uploadAllDayStress", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/stress/domain/data/remote/bean/SingleStressApiBean;", "uploadSingleStress", "", "from", "", "limit", "Lcom/huami/stress/domain/data/remote/bean/GetAllDayStressListResponse;", "getAllDayStress", "(Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "to", "getAllDayStressByTimeRange", "(Ljava/lang/String;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/stress/domain/data/remote/bean/GetSingleStressListResponse;", "getSingleStress", "getSingleStressByTimeRange", "timestamp", "deleteSingleStress", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "Companion", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class StressWebApiImpl implements StressWebApi {

    @NotNull
    private static final String a = "users/{userId}/events";

    @NotNull
    private static final String b = "users/{userId}/event/single_stress?timestamp={timestamp}";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/stress/domain/data/remote/net/ApiResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.remote.StressWebApiImpl$deleteSingleStress$2", f = "StressWebApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResponse<String>>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ApiResponse<String>> continuation) {
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
            return WebApiUtils.INSTANCE.parseEmptyResponse(WebUtils.INSTANCE.delete(m.replace$default(m.replace$default(HMServerDef.getUrl(StressWebApiImpl.b), "{userId}", this.b, false, 4, (Object) null), "{timestamp}", String.valueOf(this.c), false, 4, (Object) null)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/stress/domain/data/remote/net/ApiResponse;", "Lcom/huami/stress/domain/data/remote/bean/GetAllDayStressListResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.remote.StressWebApiImpl$getAllDayStress$2", f = "StressWebApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResponse<GetAllDayStressListResponse>>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, long j, int i, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = j;
            this.d = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ApiResponse<GetAllDayStressListResponse>> continuation) {
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
            int i = this.d;
            linkedHashMap.put("eventType", "all_day_stress");
            linkedHashMap.put("next", Boxing.boxLong(j));
            linkedHashMap.put("reverse", Boxing.boxBoolean(true));
            linkedHashMap.put("limit", Boxing.boxInt(i));
            return WebApiUtils.INSTANCE.parseResponse(WebUtils.INSTANCE.get(strReplace$default, linkedHashMap), GetAllDayStressListResponse.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/stress/domain/data/remote/net/ApiResponse;", "Lcom/huami/stress/domain/data/remote/bean/GetAllDayStressListResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.remote.StressWebApiImpl$getAllDayStressByTimeRange$2", f = "StressWebApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResponse<GetAllDayStressListResponse>>, Object> {
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
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ApiResponse<GetAllDayStressListResponse>> continuation) {
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
            linkedHashMap.put("eventType", "all_day_stress");
            linkedHashMap.put("from", Boxing.boxLong(j));
            linkedHashMap.put("to", Boxing.boxLong(j2));
            linkedHashMap.put("reverse", Boxing.boxBoolean(true));
            linkedHashMap.put("limit", Boxing.boxInt(i));
            return WebApiUtils.INSTANCE.parseResponse(WebUtils.INSTANCE.get(strReplace$default, linkedHashMap), GetAllDayStressListResponse.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/stress/domain/data/remote/net/ApiResponse;", "Lcom/huami/stress/domain/data/remote/bean/GetSingleStressListResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.remote.StressWebApiImpl$getSingleStress$2", f = "StressWebApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResponse<GetSingleStressListResponse>>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, long j, int i, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = j;
            this.d = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ApiResponse<GetSingleStressListResponse>> continuation) {
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
            int i = this.d;
            linkedHashMap.put("eventType", StressApiConst.EVENT_SINGLE_STRESS);
            linkedHashMap.put("next", Boxing.boxLong(j));
            linkedHashMap.put("reverse", Boxing.boxBoolean(true));
            linkedHashMap.put("limit", Boxing.boxInt(i));
            return WebApiUtils.INSTANCE.parseResponse(WebUtils.INSTANCE.get(strReplace$default, linkedHashMap), GetSingleStressListResponse.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/stress/domain/data/remote/net/ApiResponse;", "Lcom/huami/stress/domain/data/remote/bean/GetSingleStressListResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.remote.StressWebApiImpl$getSingleStressByTimeRange$2", f = "StressWebApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResponse<GetSingleStressListResponse>>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, long j, long j2, int i, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = j;
            this.d = j2;
            this.e = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ApiResponse<GetSingleStressListResponse>> continuation) {
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
            String strReplace$default = m.replace$default(HMServerDef.getUrl("users/{userId}/events"), "{userId}", this.b, false, 4, (Object) null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long j = this.c;
            long j2 = this.d;
            int i = this.e;
            linkedHashMap.put("eventType", StressApiConst.EVENT_SINGLE_STRESS);
            linkedHashMap.put("from", Boxing.boxLong(j));
            linkedHashMap.put("to", Boxing.boxLong(j2));
            linkedHashMap.put("reverse", Boxing.boxBoolean(true));
            linkedHashMap.put("limit", Boxing.boxInt(i));
            return WebApiUtils.INSTANCE.parseResponse(WebUtils.INSTANCE.get(strReplace$default, linkedHashMap), GetSingleStressListResponse.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/stress/domain/data/remote/net/ApiResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.remote.StressWebApiImpl$uploadAllDayStress$2", f = "StressWebApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResponse<String>>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ List<AllDayStressApiBean> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, List<AllDayStressApiBean> list, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.b, this.c, continuation);
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
            return WebApiUtils.INSTANCE.parseEmptyResponse(WebUtils.INSTANCE.post(m.replace$default(HMServerDef.getUrl("users/{userId}/events"), "{userId}", this.b, false, 4, (Object) null), new Gson().toJson(this.c), WebUtils.ContentType.JSON));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/stress/domain/data/remote/net/ApiResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.remote.StressWebApiImpl$uploadSingleStress$2", f = "StressWebApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResponse<String>>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ List<SingleStressApiBean> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, List<SingleStressApiBean> list, Continuation<? super g> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new g(this.b, this.c, continuation);
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
            return WebApiUtils.INSTANCE.parseEmptyResponse(WebUtils.INSTANCE.post(m.replace$default(HMServerDef.getUrl("users/{userId}/events"), "{userId}", this.b, false, 4, (Object) null), new Gson().toJson(this.c), WebUtils.ContentType.JSON));
        }
    }

    @Override // com.huami.stress.domain.data.remote.StressWebApi
    @Nullable
    public Object deleteSingleStress(@NotNull String str, long j, @NotNull Continuation<? super ApiResponse<String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(str, j, null), continuation);
    }

    @Override // com.huami.stress.domain.data.remote.StressWebApi
    @Nullable
    public Object getAllDayStress(@NotNull String str, long j, int i, @NotNull Continuation<? super ApiResponse<GetAllDayStressListResponse>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(str, j, i, null), continuation);
    }

    @Override // com.huami.stress.domain.data.remote.StressWebApi
    @Nullable
    public Object getAllDayStressByTimeRange(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super ApiResponse<GetAllDayStressListResponse>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new c(str, j2, j, i, null), continuation);
    }

    @Override // com.huami.stress.domain.data.remote.StressWebApi
    @Nullable
    public Object getSingleStress(@NotNull String str, long j, int i, @NotNull Continuation<? super ApiResponse<GetSingleStressListResponse>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new d(str, j, i, null), continuation);
    }

    @Override // com.huami.stress.domain.data.remote.StressWebApi
    @Nullable
    public Object getSingleStressByTimeRange(@NotNull String str, long j, long j2, int i, @NotNull Continuation<? super ApiResponse<GetSingleStressListResponse>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new e(str, j2, j, i, null), continuation);
    }

    @Override // com.huami.stress.domain.data.remote.StressWebApi
    @Nullable
    public Object uploadAllDayStress(@NotNull String str, @NotNull List<AllDayStressApiBean> list, @NotNull Continuation<? super ApiResponse<String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new f(str, list, null), continuation);
    }

    @Override // com.huami.stress.domain.data.remote.StressWebApi
    @Nullable
    public Object uploadSingleStress(@NotNull String str, @NotNull List<SingleStressApiBean> list, @NotNull Continuation<? super ApiResponse<String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new g(str, list, null), continuation);
    }
}
