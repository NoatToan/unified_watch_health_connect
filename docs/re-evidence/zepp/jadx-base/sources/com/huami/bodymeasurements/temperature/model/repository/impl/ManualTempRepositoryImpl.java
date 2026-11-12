package com.huami.bodymeasurements.temperature.model.repository.impl;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.bodymeasurements.common.remote.net.vo.ApiErrorResponse;
import com.huami.bodymeasurements.common.remote.net.vo.ApiResponse;
import com.huami.bodymeasurements.common.remote.net.vo.ApiSuccessResponse;
import com.huami.bodymeasurements.common.remote.userevents.bean.UserEventsItem;
import com.huami.bodymeasurements.temperature.model.converter.ManualTempExKt;
import com.huami.bodymeasurements.temperature.model.local.dao.ManualTempDao;
import com.huami.bodymeasurements.temperature.model.local.entity.ManualTempEntity;
import com.huami.bodymeasurements.temperature.model.remote.TempWebApi;
import com.huami.bodymeasurements.temperature.model.remote.bean.ManualTempBean;
import com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 32\u00020\u0001:\u00013B\u0017\u0012\u0006\u0010*\u001a\u00020(\u0012\u0006\u0010-\u001a\u00020+¢\u0006\u0004\b1\u00102JA\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\r2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001aH\u0016J\u001b\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0018J\u0013\u0010\u001d\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J+\u0010%\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0086@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0018R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/repository/impl/ManualTempRepositoryImpl;", "Lcom/huami/bodymeasurements/temperature/model/repository/TempBaseRepository;", "", "userId", "", "from", "to", "", "limit", "Lkotlin/Pair;", "Lcom/huami/bodymeasurements/temperature/model/remote/bean/ManualTempBean;", "a", "(Ljava/lang/String;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/bodymeasurements/temperature/model/local/entity/ManualTempEntity;", "data", "", "b", "start", "end", "Lcom/huami/bodymeasurements/temperature/view/vo/TemperatureVo;", "getLocalTempBetweenTime", "(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllLocalTemp", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestTemp", "Lkotlinx/coroutines/flow/Flow;", "getLatestTempFlow", "fetchTempFromServer", "cleanLocalTemp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timestamp", "", "deleteTemp", "timeStamp", "", "temp", "uploadTemp", "(Ljava/lang/String;JFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadUnSyncTempToServer", "Lcom/huami/bodymeasurements/temperature/model/local/dao/ManualTempDao;", "Lcom/huami/bodymeasurements/temperature/model/local/dao/ManualTempDao;", "manualTempDao", "Lcom/huami/bodymeasurements/temperature/model/remote/TempWebApi;", "Lcom/huami/bodymeasurements/temperature/model/remote/TempWebApi;", "webApi", "c", "Ljava/lang/String;", "appNameValue", "<init>", "(Lcom/huami/bodymeasurements/temperature/model/local/dao/ManualTempDao;Lcom/huami/bodymeasurements/temperature/model/remote/TempWebApi;)V", "Companion", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class ManualTempRepositoryImpl implements TempBaseRepository {

    @NotNull
    public static final String TAG = "ManualTempRepositoryImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ManualTempDao manualTempDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TempWebApi webApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String appNameValue = getAppName();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.repository.impl.ManualTempRepositoryImpl", f = "ManualTempRepositoryImpl.kt", i = {0, 1, 1}, l = {94, 96}, m = "fetchManualFromServerByPage", n = {"this", "this", AbstractJSONTokenResponse.RESPONSE}, s = {"L$0", "L$0", "L$1"})
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
        public final /* synthetic */ String a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, long j, long j2) {
            super(0);
            this.a = str;
            this.b = j;
            this.c = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "userId:" + this.a + ",from:" + this.b + ",to:" + this.c;
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
            return "fetch manualTemperature from server is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResponse<UserEventsItem<ManualTempBean>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ApiResponse<UserEventsItem<ManualTempBean>> apiResponse) {
            super(0);
            this.a = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("fetch manualTemperature from server success :", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResponse<UserEventsItem<ManualTempBean>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ApiResponse<UserEventsItem<ManualTempBean>> apiResponse) {
            super(0);
            this.a = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("fetch manualTemperature from server failed:", ((ApiErrorResponse) this.a).getErrorMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/bodymeasurements/temperature/model/local/entity/ManualTempEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.repository.impl.ManualTempRepositoryImpl$fetchManualFromServerByPage$dataSaveToDb$1", f = "ManualTempRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ManualTempEntity>>, Object> {
        public int a;
        public final /* synthetic */ ApiResponse<UserEventsItem<ManualTempBean>> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ApiResponse<UserEventsItem<ManualTempBean>> apiResponse, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = apiResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ManualTempEntity>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<ManualTempEntity>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<ManualTempEntity>> continuation) {
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
            List items = ((UserEventsItem) ((ApiSuccessResponse) this.b).getBody()).getItems();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
            Iterator it2 = items.iterator();
            while (it2.hasNext()) {
                arrayList.add(ManualTempExKt.toManualTempEntity((ManualTempBean) it2.next()));
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.repository.impl.ManualTempRepositoryImpl", f = "ManualTempRepositoryImpl.kt", i = {0, 0, 0, 1, 1, 1}, l = {79, 82}, m = "fetchTempFromServer", n = {"this", "userId", "endTime", "this", "userId", "endTime"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0"})
    public static final class g extends ContinuationImpl {
        public Object a;
        public Object b;
        public long c;
        public /* synthetic */ Object d;
        public int f;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return ManualTempRepositoryImpl.this.fetchTempFromServer(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ ManualTempEntity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ManualTempEntity manualTempEntity) {
            super(0);
            this.a = manualTempEntity;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("latestManualTemp:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ ArrayList<TemperatureVo> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, ArrayList<TemperatureVo> arrayList) {
            super(0);
            this.a = str;
            this.b = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "userId:" + this.a + "--->result size:" + this.b.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ TemperatureVo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(TemperatureVo temperatureVo) {
            super(0);
            this.a = temperatureVo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("latestTemp :", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;
        public final /* synthetic */ ArrayList<TemperatureVo> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(long j, long j2, String str, ArrayList<TemperatureVo> arrayList) {
            super(0);
            this.a = j;
            this.b = j2;
            this.c = str;
            this.d = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start:" + this.a + ",end:" + this.b + ",userId:" + this.c + "--->result size:" + this.d.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ List<ManualTempEntity> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(List<ManualTempEntity> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("saveToDb data size:", Integer.valueOf(this.a.size()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.repository.impl.ManualTempRepositoryImpl", f = "ManualTempRepositoryImpl.kt", i = {}, l = {143}, m = "uploadTemp", n = {}, s = {})
    public static final class m extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return ManualTempRepositoryImpl.this.uploadTemp(null, 0L, 0.0f, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ long b;
        public final /* synthetic */ float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, long j, float f) {
            super(0);
            this.a = str;
            this.b = j;
            this.c = f;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "userId:" + this.a + ",timeStamp:" + this.b + ",temp:" + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadManualTemp success";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadManualTemp failed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.repository.impl.ManualTempRepositoryImpl", f = "ManualTempRepositoryImpl.kt", i = {}, l = {161}, m = "uploadUnSyncTempToServer", n = {}, s = {})
    public static final class q extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public q(Continuation<? super q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return ManualTempRepositoryImpl.this.uploadUnSyncTempToServer(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ List<ManualTempEntity> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(List<ManualTempEntity> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("unSyncData size:", Integer.valueOf(this.a.size()));
        }
    }

    public ManualTempRepositoryImpl(@NotNull ManualTempDao manualTempDao, @NotNull TempWebApi tempWebApi) {
        this.manualTempDao = manualTempDao;
        this.webApi = tempWebApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, long j2, long j3, int i2, Continuation<? super Pair<Integer, ManualTempBean>> continuation) throws Throwable {
        a aVar;
        ManualTempRepositoryImpl manualTempRepositoryImpl;
        ApiResponse apiResponse;
        ManualTempRepositoryImpl manualTempRepositoryImpl2;
        List<ManualTempEntity> list;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i3 = aVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.e = i3 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objFetchManualTempByTimeRange = aVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = aVar.e;
        if (i4 != 0) {
            if (i4 == 1) {
                manualTempRepositoryImpl = (ManualTempRepositoryImpl) aVar.a;
                ResultKt.throwOnFailure(objFetchManualTempByTimeRange);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiResponse = (ApiResponse) aVar.b;
                manualTempRepositoryImpl2 = (ManualTempRepositoryImpl) aVar.a;
                ResultKt.throwOnFailure(objFetchManualTempByTimeRange);
            }
            list = (List) objFetchManualTempByTimeRange;
            if (list.isEmpty()) {
                HMLog.info("ManualTempRepositoryImpl", c.a);
                return new Pair(Boxing.boxInt(0), null);
            }
            manualTempRepositoryImpl2.b(list);
            HMLog.info("ManualTempRepositoryImpl", new d(apiResponse));
            ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponse;
            return new Pair(Boxing.boxInt(((UserEventsItem) apiSuccessResponse.getBody()).getItems().size()), ((UserEventsItem) apiSuccessResponse.getBody()).getNext());
        }
        ResultKt.throwOnFailure(objFetchManualTempByTimeRange);
        HMLog.info("ManualTempRepositoryImpl", new b(str, j2, j3));
        TempWebApi tempWebApi = this.webApi;
        aVar.a = this;
        aVar.e = 1;
        objFetchManualTempByTimeRange = tempWebApi.fetchManualTempByTimeRange(str, j2, j3, i2, aVar);
        if (objFetchManualTempByTimeRange == coroutine_suspended) {
            return coroutine_suspended;
        }
        manualTempRepositoryImpl = this;
        ApiResponse apiResponse2 = (ApiResponse) objFetchManualTempByTimeRange;
        if (!(apiResponse2 instanceof ApiSuccessResponse)) {
            if (!(apiResponse2 instanceof ApiErrorResponse)) {
                throw new NoWhenBranchMatchedException();
            }
            HMLog.warn$default("ManualTempRepositoryImpl", null, new e(apiResponse2), 2, null);
            return new Pair(Boxing.boxInt(0), null);
        }
        CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
        f fVar = new f(apiResponse2, null);
        aVar.a = manualTempRepositoryImpl;
        aVar.b = apiResponse2;
        aVar.e = 2;
        Object objWithContext = BuildersKt.withContext(coroutineDispatcher, fVar, aVar);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        ManualTempRepositoryImpl manualTempRepositoryImpl3 = manualTempRepositoryImpl;
        apiResponse = apiResponse2;
        objFetchManualTempByTimeRange = objWithContext;
        manualTempRepositoryImpl2 = manualTempRepositoryImpl3;
        list = (List) objFetchManualTempByTimeRange;
        if (list.isEmpty()) {
            HMLog.info("ManualTempRepositoryImpl", c.a);
            return new Pair(Boxing.boxInt(0), null);
        }
        manualTempRepositoryImpl2.b(list);
        HMLog.info("ManualTempRepositoryImpl", new d(apiResponse));
        ApiSuccessResponse apiSuccessResponse2 = (ApiSuccessResponse) apiResponse;
        return new Pair(Boxing.boxInt(((UserEventsItem) apiSuccessResponse2.getBody()).getItems().size()), ((UserEventsItem) apiSuccessResponse2.getBody()).getNext());
    }

    private final void b(List<ManualTempEntity> data) {
        HMLog.info("ManualTempRepositoryImpl", new l(data));
        this.manualTempDao.insertOrUpdateManualTempList(data);
    }

    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @Nullable
    public Object cleanLocalTemp(@NotNull Continuation<? super Unit> continuation) {
        this.manualTempDao.clean();
        return Unit.INSTANCE;
    }

    public final boolean deleteTemp(long timestamp, @NotNull String userId) {
        return this.manualTempDao.delete(timestamp, userId) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00cf -> B:35:0x00d2). Please report as a decompilation issue!!! */
    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @Nullable
    public Object fetchTempFromServer(@NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        g gVar;
        ManualTempRepositoryImpl manualTempRepositoryImpl;
        String str2;
        long j2;
        Long lBoxLong;
        Pair pair;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.f = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        g gVar2 = gVar;
        Object objA = gVar2.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = gVar2.f;
        if (i3 != 0) {
            if (i3 == 1) {
                j2 = gVar2.c;
                str2 = (String) gVar2.b;
                manualTempRepositoryImpl = (ManualTempRepositoryImpl) gVar2.a;
                ResultKt.throwOnFailure(objA);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = gVar2.c;
                str2 = (String) gVar2.b;
                manualTempRepositoryImpl = (ManualTempRepositoryImpl) gVar2.a;
                ResultKt.throwOnFailure(objA);
            }
            pair = (Pair) objA;
            if (((Number) pair.getFirst()).intValue() == 1000 || pair.getSecond() == null) {
                return Unit.INSTANCE;
            }
            long timestamp = ((ManualTempBean) pair.getSecond()).getTimestamp();
            gVar2.a = manualTempRepositoryImpl;
            gVar2.b = str2;
            gVar2.c = j2;
            gVar2.f = 2;
            objA = manualTempRepositoryImpl.a(str2, timestamp, j2, 1000, gVar2);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            pair = (Pair) objA;
            if (((Number) pair.getFirst()).intValue() == 1000) {
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objA);
        ManualTempEntity latestManualTemp = this.manualTempDao.getLatestManualTemp(str);
        HMLog.info("ManualTempRepositoryImpl", new h(latestManualTemp));
        long jLongValue = 0;
        if (latestManualTemp != null && (lBoxLong = Boxing.boxLong(latestManualTemp.getTimestamp())) != null) {
            jLongValue = lBoxLong.longValue();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        gVar2.a = this;
        gVar2.b = str;
        gVar2.c = jCurrentTimeMillis;
        gVar2.f = 1;
        objA = a(str, jLongValue, jCurrentTimeMillis, 1000, gVar2);
        if (objA == coroutine_suspended) {
            return coroutine_suspended;
        }
        manualTempRepositoryImpl = this;
        str2 = str;
        j2 = jCurrentTimeMillis;
        pair = (Pair) objA;
        if (((Number) pair.getFirst()).intValue() == 1000) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @Nullable
    public Object getAllLocalTemp(@NotNull String str, @NotNull Continuation<? super List<TemperatureVo>> continuation) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = this.manualTempDao.getManualTempAll(str).iterator();
        while (it2.hasNext()) {
            arrayList.add(ManualTempExKt.toTemperatureVo((ManualTempEntity) it2.next()));
        }
        CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.huami.bodymeasurements.temperature.model.repository.impl.ManualTempRepositoryImpl$getAllLocalTemp$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TemperatureVo) t).getTimestamp()), Long.valueOf(((TemperatureVo) t2).getTimestamp()));
            }
        });
        HMLog.info("ManualTempRepositoryImpl", new i(str, arrayList));
        return arrayList;
    }

    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @NotNull
    public String getAppName() {
        return TempBaseRepository.DefaultImpls.getAppName(this);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return TempBaseRepository.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @Nullable
    public Object getLatestTemp(@NotNull String str, @NotNull Continuation<? super TemperatureVo> continuation) {
        ManualTempEntity latestManualTemp = this.manualTempDao.getLatestManualTemp(str);
        TemperatureVo temperatureVo = latestManualTemp == null ? null : ManualTempExKt.toTemperatureVo(latestManualTemp);
        HMLog.info("ManualTempRepositoryImpl", new j(temperatureVo));
        return temperatureVo;
    }

    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @NotNull
    public Flow<TemperatureVo> getLatestTempFlow() {
        final Flow<ManualTempEntity> latestManualTempFlow = this.manualTempDao.getLatestManualTempFlow();
        return new Flow<TemperatureVo>() { // from class: com.huami.bodymeasurements.temperature.model.repository.impl.ManualTempRepositoryImpl$getLatestTempFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.bodymeasurements.temperature.model.repository.impl.ManualTempRepositoryImpl$getLatestTempFlow$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<ManualTempEntity> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ ManualTempRepositoryImpl$getLatestTempFlow$$inlined$map$1 b;

                /* JADX INFO: renamed from: com.huami.bodymeasurements.temperature.model.repository.impl.ManualTempRepositoryImpl$getLatestTempFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.repository.impl.ManualTempRepositoryImpl$getLatestTempFlow$$inlined$map$1$2", f = "ManualTempRepositoryImpl.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;
                    public Object d;
                    public Object e;
                    public Object f;
                    public Object g;
                    public Object h;
                    public Object i;
                    public Object j;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ManualTempRepositoryImpl$getLatestTempFlow$$inlined$map$1 manualTempRepositoryImpl$getLatestTempFlow$$inlined$map$1) {
                    this.a = flowCollector;
                    this.b = manualTempRepositoryImpl$getLatestTempFlow$$inlined$map$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(ManualTempEntity manualTempEntity, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        ManualTempEntity manualTempEntity2 = manualTempEntity;
                        TemperatureVo temperatureVo = manualTempEntity2 == null ? null : ManualTempExKt.toTemperatureVo(manualTempEntity2);
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(temperatureVo, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super TemperatureVo> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = latestManualTempFlow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @Nullable
    public Object getLocalTempBetweenTime(long j2, long j3, @NotNull String str, @NotNull Continuation<? super List<TemperatureVo>> continuation) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = this.manualTempDao.getManualTempBetweenTimestamp(j2, j3, str).iterator();
        while (it2.hasNext()) {
            arrayList.add(ManualTempExKt.toTemperatureVo((ManualTempEntity) it2.next()));
        }
        if (arrayList.size() > 1) {
            kotlin.collections.g.sortWith(arrayList, new Comparator() { // from class: com.huami.bodymeasurements.temperature.model.repository.impl.ManualTempRepositoryImpl$getLocalTempBetweenTime$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TemperatureVo) t).getTimestamp()), Long.valueOf(((TemperatureVo) t2).getTimestamp()));
                }
            });
        }
        HMLog.info("ManualTempRepositoryImpl", new k(j2, j3, str, arrayList));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object uploadTemp(@NotNull String str, long j2, float f2, @NotNull Continuation<? super Boolean> continuation) {
        m mVar;
        ArrayList arrayList;
        ManualTempRepositoryImpl manualTempRepositoryImpl;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.e = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        Object obj = mVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = mVar.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            HMLog.info("ManualTempRepositoryImpl", new n(str, j2, f2));
            ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(new ManualTempEntity(j2, f2, str, this.appNameValue));
            TempWebApi tempWebApi = this.webApi;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayListArrayListOf, 10));
            Iterator it2 = arrayListArrayListOf.iterator();
            while (it2.hasNext()) {
                arrayList2.add(ManualTempExKt.toManualTempBean((ManualTempEntity) it2.next()));
            }
            mVar.a = this;
            mVar.b = arrayListArrayListOf;
            mVar.e = 1;
            Object objUploadManualTemp = tempWebApi.uploadManualTemp(arrayList2, mVar);
            if (objUploadManualTemp == coroutine_suspended) {
                return coroutine_suspended;
            }
            arrayList = arrayListArrayListOf;
            obj = objUploadManualTemp;
            manualTempRepositoryImpl = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (ArrayList) mVar.b;
            manualTempRepositoryImpl = (ManualTempRepositoryImpl) mVar.a;
            ResultKt.throwOnFailure(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            HMLog.info("ManualTempRepositoryImpl", o.a);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((ManualTempEntity) it3.next()).setSyncStatus(true);
            }
            manualTempRepositoryImpl.manualTempDao.insertOrUpdateManualTempList(arrayList);
        } else {
            HMLog.error$default("ManualTempRepositoryImpl", null, null, p.a, 6, null);
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @Nullable
    public Object uploadUnSyncTempToServer(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        q qVar;
        ManualTempRepositoryImpl manualTempRepositoryImpl;
        String str2;
        Iterator it2;
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i2 = qVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.f = i2 - Integer.MIN_VALUE;
            } else {
                qVar = new q(continuation);
            }
        } else {
            qVar = new q(continuation);
        }
        Object obj = qVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = qVar.f;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            List<ManualTempEntity> unSyncManualTempList = this.manualTempDao.getUnSyncManualTempList();
            HMLog.info("ManualTempRepositoryImpl", new r(unSyncManualTempList));
            if (unSyncManualTempList.isEmpty()) {
                return Unit.INSTANCE;
            }
            Iterator it3 = unSyncManualTempList.iterator();
            manualTempRepositoryImpl = this;
            str2 = str;
            it2 = it3;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it2 = (Iterator) qVar.c;
            String str3 = (String) qVar.b;
            ManualTempRepositoryImpl manualTempRepositoryImpl2 = (ManualTempRepositoryImpl) qVar.a;
            ResultKt.throwOnFailure(obj);
            str2 = str3;
            manualTempRepositoryImpl = manualTempRepositoryImpl2;
        }
        while (it2.hasNext()) {
            ManualTempEntity manualTempEntity = (ManualTempEntity) it2.next();
            long timestamp = manualTempEntity.getTimestamp();
            float temp = manualTempEntity.getTemp();
            qVar.a = manualTempRepositoryImpl;
            qVar.b = str2;
            qVar.c = it2;
            qVar.f = 1;
            if (manualTempRepositoryImpl.uploadTemp(str2, timestamp, temp, qVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
