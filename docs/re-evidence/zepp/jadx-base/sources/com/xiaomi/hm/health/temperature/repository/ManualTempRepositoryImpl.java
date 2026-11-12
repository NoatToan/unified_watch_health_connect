package com.xiaomi.hm.health.temperature.repository;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.devicex.injection.webapi.TempWebApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.temperature.TempExtKt;
import com.xiaomi.hm.health.temperature.local.dao.ManualTempDao;
import com.xiaomi.hm.health.temperature.local.entity.ManualTempEntity;
import com.xiaomi.hm.health.temperature.model.Temperature;
import com.xiaomi.hm.health.temperature.remote.bean.ManualTempBean;
import com.xiaomi.hm.health.temperature.remote.bean.ManualTempResponse;
import com.xiaomi.hm.health.temperature.remote.net.ApiErrorResponse;
import com.xiaomi.hm.health.temperature.remote.net.ApiResponse;
import com.xiaomi.hm.health.temperature.remote.net.ApiSuccessResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 (2\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010%\u001a\u00020#¢\u0006\u0004\b&\u0010'J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJA\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/temperature/repository/ManualTempRepositoryImpl;", "Lcom/xiaomi/hm/health/temperature/repository/ManualTempRepository;", "", "userId", "", "fromTime", "endTime", "", "b", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "from", "to", "", "limit", "Lkotlin/Pair;", "Lcom/xiaomi/hm/health/temperature/remote/bean/ManualTempBean;", "a", "(Ljava/lang/String;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchManualTempFromServer", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "end", "", "Lcom/xiaomi/hm/health/temperature/model/Temperature;", "getManualTempBetweenTime", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "", "uploadManualTemp", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanManualTempDb", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/temperature/local/dao/ManualTempDao;", "Lcom/xiaomi/hm/health/temperature/local/dao/ManualTempDao;", "manualTempDao", "Lcom/huami/devicex/injection/webapi/TempWebApi;", "Lcom/huami/devicex/injection/webapi/TempWebApi;", "webApi", "<init>", "(Lcom/xiaomi/hm/health/temperature/local/dao/ManualTempDao;Lcom/huami/devicex/injection/webapi/TempWebApi;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ManualTempRepositoryImpl implements ManualTempRepository {
    public static final int DATA_LOAD_SIZE = 1000;
    public static final int DATA_UPLOAD_LIMIT = 7;

    @NotNull
    public static final String TAG = "ManualTempRepositoryImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ManualTempDao manualTempDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TempWebApi webApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.temperature.repository.ManualTempRepositoryImpl", f = "ManualTempRepositoryImpl.kt", i = {0, 1, 1}, l = {56, 58}, m = "fetchManualFromServerByPage", n = {"this", "this", AbstractJSONTokenResponse.RESPONSE}, s = {"L$0", "L$0", "L$1"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return ManualTempRepositoryImpl.this.a(null, 0L, 0L, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResponse<ManualTempResponse> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ApiResponse<ManualTempResponse> apiResponse) {
            super(0);
            this.a = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fetch manualTemperature from server success :" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResponse<ManualTempResponse> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ApiResponse<ManualTempResponse> apiResponse) {
            super(0);
            this.a = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fetch manualTemperature from server failed:" + ((ApiErrorResponse) this.a).getErrorMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/xiaomi/hm/health/temperature/local/entity/ManualTempEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.temperature.repository.ManualTempRepositoryImpl$fetchManualFromServerByPage$dataSaveToDb$1", f = "ManualTempRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ManualTempEntity>>, Object> {
        public int a;
        public final /* synthetic */ ApiResponse<ManualTempResponse> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ApiResponse<ManualTempResponse> apiResponse, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = apiResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ManualTempEntity>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<ManualTempEntity>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<ManualTempEntity>> continuation) {
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
            List<ManualTempBean> items = ((ManualTempResponse) ((ApiSuccessResponse) this.b).getBody()).getItems();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
            Iterator<T> it2 = items.iterator();
            while (it2.hasNext()) {
                arrayList.add(TempExtKt.toManualTempEntity((ManualTempBean) it2.next()));
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.temperature.repository.ManualTempRepositoryImpl", f = "ManualTempRepositoryImpl.kt", i = {0, 0, 0, 1, 1, 1}, l = {43, 46}, m = "fetchManualTempFromServerByTimeRange", n = {"this", "userId", "endTime", "this", "userId", "endTime"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0"})
    public static final class e extends ContinuationImpl {
        public Object a;
        public Object b;
        public long c;
        public /* synthetic */ Object d;
        public int f;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return ManualTempRepositoryImpl.this.b(null, 0L, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j, long j2) {
            super(0);
            this.a = j;
            this.b = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fetchManualTempFromServerByTimeRange from:" + this.a + ",end:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.temperature.repository.ManualTempRepositoryImpl", f = "ManualTempRepositoryImpl.kt", i = {}, l = {79}, m = "uploadManualTemp", n = {}, s = {})
    public static final class g extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return ManualTempRepositoryImpl.this.uploadManualTemp(null, this);
        }
    }

    public ManualTempRepositoryImpl(@NotNull ManualTempDao manualTempDao, @NotNull TempWebApi tempWebApi) {
        this.manualTempDao = manualTempDao;
        this.webApi = tempWebApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object a(String str, long j, long j2, int i, Continuation<? super Pair<Integer, ManualTempBean>> continuation) throws Throwable {
        a aVar;
        ManualTempRepositoryImpl manualTempRepositoryImpl;
        ApiResponse apiResponse;
        ManualTempRepositoryImpl manualTempRepositoryImpl2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.e = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objFetchManualTempByTimeRange = aVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = aVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                manualTempRepositoryImpl = (ManualTempRepositoryImpl) aVar.a;
                ResultKt.throwOnFailure(objFetchManualTempByTimeRange);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiResponse = (ApiResponse) aVar.b;
                manualTempRepositoryImpl2 = (ManualTempRepositoryImpl) aVar.a;
                ResultKt.throwOnFailure(objFetchManualTempByTimeRange);
            }
            manualTempRepositoryImpl2.manualTempDao.insertOrUpdateManualTempList((List) objFetchManualTempByTimeRange);
            HMLog.info("ManualTempRepositoryImpl", new b(apiResponse));
            ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponse;
            return new Pair(Boxing.boxInt(((ManualTempResponse) apiSuccessResponse.getBody()).getItems().size()), ((ManualTempResponse) apiSuccessResponse.getBody()).getNext());
        }
        ResultKt.throwOnFailure(objFetchManualTempByTimeRange);
        TempWebApi tempWebApi = this.webApi;
        aVar.a = this;
        aVar.e = 1;
        objFetchManualTempByTimeRange = tempWebApi.fetchManualTempByTimeRange(str, j, j2, i, aVar);
        if (objFetchManualTempByTimeRange == coroutine_suspended) {
            return coroutine_suspended;
        }
        manualTempRepositoryImpl = this;
        ApiResponse apiResponse2 = (ApiResponse) objFetchManualTempByTimeRange;
        if (!(apiResponse2 instanceof ApiSuccessResponse)) {
            if (!(apiResponse2 instanceof ApiErrorResponse)) {
                throw new NoWhenBranchMatchedException();
            }
            HMLog.warn$default("ManualTempRepositoryImpl", null, new c(apiResponse2), 2, null);
            return new Pair(Boxing.boxInt(0), null);
        }
        CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
        d dVar = new d(apiResponse2, null);
        aVar.a = manualTempRepositoryImpl;
        aVar.b = apiResponse2;
        aVar.e = 2;
        Object objWithContext = BuildersKt.withContext(coroutineDispatcher, dVar, aVar);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        ManualTempRepositoryImpl manualTempRepositoryImpl3 = manualTempRepositoryImpl;
        apiResponse = apiResponse2;
        objFetchManualTempByTimeRange = objWithContext;
        manualTempRepositoryImpl2 = manualTempRepositoryImpl3;
        manualTempRepositoryImpl2.manualTempDao.insertOrUpdateManualTempList((List) objFetchManualTempByTimeRange);
        HMLog.info("ManualTempRepositoryImpl", new b(apiResponse));
        ApiSuccessResponse apiSuccessResponse2 = (ApiSuccessResponse) apiResponse;
        return new Pair(Boxing.boxInt(((ManualTempResponse) apiSuccessResponse2.getBody()).getItems().size()), ((ManualTempResponse) apiSuccessResponse2.getBody()).getNext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b8 -> B:28:0x00bb). Please report as a decompilation issue!!! */
    public final Object b(String str, long j, long j2, Continuation<? super Unit> continuation) throws Throwable {
        e eVar;
        String str2;
        ManualTempRepositoryImpl manualTempRepositoryImpl;
        Pair pair;
        long j3;
        String str3;
        long j4 = j2;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.f = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        e eVar2 = eVar;
        Object objA = eVar2.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = eVar2.f;
        if (i2 != 0) {
            if (i2 == 1) {
                long j5 = eVar2.c;
                String str4 = (String) eVar2.b;
                manualTempRepositoryImpl = (ManualTempRepositoryImpl) eVar2.a;
                ResultKt.throwOnFailure(objA);
                j4 = j5;
                str2 = str4;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = eVar2.c;
                str3 = (String) eVar2.b;
                manualTempRepositoryImpl = (ManualTempRepositoryImpl) eVar2.a;
                ResultKt.throwOnFailure(objA);
            }
            pair = (Pair) objA;
            if (((Number) pair.getFirst()).intValue() == 1000 || pair.getSecond() == null) {
                return Unit.INSTANCE;
            }
            long timestamp = ((ManualTempBean) pair.getSecond()).getTimestamp();
            eVar2.a = manualTempRepositoryImpl;
            eVar2.b = str3;
            eVar2.c = j3;
            eVar2.f = 2;
            objA = manualTempRepositoryImpl.a(str3, timestamp, j3, 1000, eVar2);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            pair = (Pair) objA;
            if (((Number) pair.getFirst()).intValue() == 1000) {
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objA);
        HMLog.info("ManualTempRepositoryImpl", new f(j, j4));
        eVar2.a = this;
        str2 = str;
        eVar2.b = str2;
        eVar2.c = j4;
        eVar2.f = 1;
        objA = a(str, j, j2, 1000, eVar2);
        if (objA == coroutine_suspended) {
            return coroutine_suspended;
        }
        manualTempRepositoryImpl = this;
        pair = (Pair) objA;
        j3 = j4;
        str3 = str2;
        if (((Number) pair.getFirst()).intValue() == 1000) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.hm.health.temperature.repository.ManualTempRepository
    @Nullable
    public Object cleanManualTempDb(@NotNull Continuation<? super Unit> continuation) {
        this.manualTempDao.clean();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.hm.health.temperature.repository.ManualTempRepository
    @Nullable
    public Object fetchManualTempFromServer(@NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Long lBoxLong;
        ManualTempEntity latestManualTemp = this.manualTempDao.getLatestManualTemp();
        long jLongValue = 0;
        if (latestManualTemp != null && (lBoxLong = Boxing.boxLong(latestManualTemp.getTimestamp())) != null) {
            jLongValue = lBoxLong.longValue();
        }
        Object objB = b(str, jLongValue, System.currentTimeMillis(), continuation);
        return objB == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objB : Unit.INSTANCE;
    }

    @Override // com.xiaomi.hm.health.temperature.repository.ManualTempRepository
    @Nullable
    public Object getManualTempBetweenTime(long j, long j2, @NotNull Continuation<? super List<Temperature>> continuation) {
        List<ManualTempEntity> manualTempBetweenTimestamp = this.manualTempDao.getManualTempBetweenTimestamp(j, j2);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(manualTempBetweenTimestamp, 10));
        Iterator<T> it2 = manualTempBetweenTimestamp.iterator();
        while (it2.hasNext()) {
            arrayList.add(TempExtKt.toTemperature((ManualTempEntity) it2.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.hm.health.temperature.repository.ManualTempRepository
    @Nullable
    public Object uploadManualTemp(@NotNull List<ManualTempBean> list, @NotNull Continuation<? super Boolean> continuation) {
        g gVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i = gVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.c = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objUploadManualTemp = gVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = gVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUploadManualTemp);
            ManualTempDao manualTempDao = this.manualTempDao;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(TempExtKt.toManualTempEntity((ManualTempBean) it2.next()));
            }
            manualTempDao.insertOrUpdateManualTempList(arrayList);
            TempWebApi tempWebApi = this.webApi;
            gVar.c = 1;
            objUploadManualTemp = tempWebApi.uploadManualTemp(list, gVar);
            if (objUploadManualTemp == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUploadManualTemp);
        }
        return Boxing.boxBoolean(objUploadManualTemp instanceof ApiSuccessResponse);
    }
}
