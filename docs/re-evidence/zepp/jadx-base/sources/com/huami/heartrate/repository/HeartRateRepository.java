package com.huami.heartrate.repository;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.heartrate.chart.HandleDataKt;
import com.huami.heartrate.dto.RestingHeartRate;
import com.huami.heartrate.repository.db.IDataBaseDataSource;
import com.huami.heartrate.repository.entity.HeartRateData;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import com.huami.heartrate.repository.entity.PagingRemoteHeartRateData;
import com.huami.heartrate.repository.entity.RemoteHeartRateData;
import com.huami.heartrate.repository.local.ILocalDataSource;
import com.huami.heartrate.repository.remote.IRemoteDataSource;
import com.huami.heartrate.resting.datasource.IRestingHrDataSource;
import com.huami.heartrate.utils.ExtensionUtilsKt;
import com.huami.heartrate.utils.HeartRateTimeUtils;
import com.huami.heartrate.viewmodel.MeasureHrViewModelKt;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.dataflow.Constant;
import com.loc.z;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 b2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001bB'\u0012\u0006\u0010Z\u001a\u00020\u0002\u0012\u0006\u0010\\\u001a\u00020\u0003\u0012\u0006\u0010^\u001a\u00020\u0004\u0012\u0006\u0010_\u001a\u00020\u0005¢\u0006\u0004\b`\u0010aJ5\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001b2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001b2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ+\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001b2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010\u001dJ \u0010\"\u001a\u0004\u0018\u00010\f2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0002J\u0010\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\nH\u0002J \u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060'2\u0006\u0010\u0019\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020&H\u0002J,\u0010+\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b0'2\u0006\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020&H\u0002J&\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0006\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020&H\u0002J\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020$0'2\u0006\u0010-\u001a\u00020\tH\u0096\u0001J1\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0006\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0014H\u0096Aø\u0001\u0000¢\u0006\u0004\b/\u0010\u001dJ\u001b\u00100\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\tH\u0096Aø\u0001\u0000¢\u0006\u0004\b0\u00101J'\u00105\u001a\u0004\u0018\u0001042\b\u00102\u001a\u0004\u0018\u00010\u00142\u0006\u00103\u001a\u00020\u0016H\u0096Aø\u0001\u0000¢\u0006\u0004\b5\u00106J-\u0010;\u001a\u0004\u0018\u00010:2\u0006\u00107\u001a\u00020\u00142\u0006\u00108\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u0016H\u0096Aø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020>2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH\u0096\u0001J\u0011\u0010A\u001a\u00020>2\u0006\u0010@\u001a\u00020\u0006H\u0096\u0001J'\u0010B\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001b0'2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0014H\u0096\u0001J\u0011\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060'H\u0096\u0001J!\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060'2\u0006\u0010D\u001a\u00020\u00142\u0006\u0010E\u001a\u00020\u0014H\u0096\u0001J-\u0010F\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b0'2\u0006\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020&H\u0096\u0001J'\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0006\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020&H\u0096\u0001J\u0011\u0010H\u001a\u00020>2\u0006\u0010@\u001a\u00020\u0006H\u0096\u0001J#\u0010K\u001a\u00020>2\u0006\u0010I\u001a\u00020\u00142\u0006\u0010J\u001a\u00020\u0014H\u0096Aø\u0001\u0000¢\u0006\u0004\bK\u0010\u001dJ!\u0010L\u001a\u00020>2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH\u0096Aø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\u0004\u0018\u00010\u0006H\u0096Aø\u0001\u0000¢\u0006\u0004\bN\u0010OJ+\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001b2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0014H\u0096Aø\u0001\u0000¢\u0006\u0004\bP\u0010\u001dJ+\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u0016H\u0096Aø\u0001\u0000¢\u0006\u0004\bQ\u0010RJ!\u0010S\u001a\u00020>2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH\u0096Aø\u0001\u0000¢\u0006\u0004\bS\u0010MJ'\u0010U\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020T\u0018\u00010\u001b0'2\u0006\u00107\u001a\u00020\u00142\u0006\u00108\u001a\u00020\u0014H\u0096\u0001J\u0010\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0'H\u0016J\u001b\u0010W\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\bW\u0010\u0018J'\u0010X\u001a\u0004\u0018\u0001042\b\u00102\u001a\u0004\u0018\u00010\u00142\u0006\u00103\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\bX\u00106R\u0016\u0010Z\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010YR\u0016\u0010\\\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010[R\u0016\u0010^\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010]\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006c"}, d2 = {"Lcom/huami/heartrate/repository/HeartRateRepository;", "Lcom/huami/heartrate/repository/IHeartRateRepository;", "Lcom/huami/heartrate/repository/local/ILocalDataSource;", "Lcom/huami/heartrate/repository/remote/IRemoteDataSource;", "Lcom/huami/heartrate/repository/db/IDataBaseDataSource;", "Lcom/huami/heartrate/resting/datasource/IRestingHrDataSource;", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "manualHr", "", "", "", "wholeHr", "Lcom/huami/heartrate/repository/entity/HeartRateData;", "c", "(Lcom/huami/heartrate/repository/entity/HeartRateEntity;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "(Lcom/huami/heartrate/repository/entity/HeartRateEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firstValidWholeHeartRateData", "i", "(Lcom/huami/heartrate/repository/entity/HeartRateData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "time", "", "f", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "from", "end", "", "e", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "to", GoogleApiAvailabilityLight.a, "hrDatas", "l", "hrArray", "", "g", "Ljava/util/Date;", "Lkotlinx/coroutines/flow/Flow;", hl.k, "dayFrom", "dayEnd", z.j, "b", "date", "observeWholeDayHrDataChanged", "getWholeDayHeartRateData", "queryRestHeartRateByDay", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nextSeconds", "limit", "Lcom/huami/heartrate/repository/entity/PagingRemoteHeartRateData;", "fetchMeasureHeartRateData", "(Ljava/lang/Long;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dateFrom", "dateEnd", "limitCount", "Lcom/huami/heartrate/repository/entity/RemoteHeartRateData;", "getRemoteMeasureHrData", "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "heartRateList", "", "deleteHeartRateList", Constant.KEY_HR_VALUE, "insertHeartRate", "observeHeartRateLiveDataList", "observeLatestHeartRate", "fromSecond", "toSecond", "observeWholeDayHeartRate", "queryWholeDayHeartRate", "updateHeartRate", "earliestTime", "latestTime", "deleteSyncedHeartRate", "insertHeartRateList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryEarliestSyncedHeartRate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryHeartRateListByDayRange", "queryHeartRateListByLimit", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateHeartRateList", "Lcom/huami/heartrate/dto/RestingHeartRate;", "fetchRestingHr", "queryLatestHeartRateRawData", "fetchHeartRateInDay", "getMeasureHeartRatePagingList", "Lcom/huami/heartrate/repository/local/ILocalDataSource;", "localDataSource", "Lcom/huami/heartrate/repository/remote/IRemoteDataSource;", "remoteDataSource", "Lcom/huami/heartrate/repository/db/IDataBaseDataSource;", "dbDataSource", "restingHrDataSource", "<init>", "(Lcom/huami/heartrate/repository/local/ILocalDataSource;Lcom/huami/heartrate/repository/remote/IRemoteDataSource;Lcom/huami/heartrate/repository/db/IDataBaseDataSource;Lcom/huami/heartrate/resting/datasource/IRestingHrDataSource;)V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateRepository implements IHeartRateRepository, ILocalDataSource, IRemoteDataSource, IDataBaseDataSource, IRestingHrDataSource {

    @NotNull
    private static final String e = "HeartRateRepository";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ILocalDataSource localDataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IRemoteDataSource remoteDataSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IDataBaseDataSource dbDataSource;
    private final /* synthetic */ IRestingHrDataSource d;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.repository.HeartRateRepository", f = "HeartRateRepository.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}, l = {66, 70, 71}, m = "fetchHeartRateInDay", n = {"this", "date", "from", "end", "this", "hrData", "date", "from", "end", "hrData", "date"}, s = {"L$0", "J$0", "J$1", "J$2", "L$0", "L$1", "J$0", "J$1", "J$2", "L$0", "J$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public long c;
        public long d;
        public long e;
        public long f;
        public int g;
        public /* synthetic */ Object h;
        public int j;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return HeartRateRepository.this.fetchHeartRateInDay(0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ HeartRateData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HeartRateData heartRateData) {
            super(0);
            this.a = heartRateData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fetchHeartRateInDay :" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.repository.HeartRateRepository", f = "HeartRateRepository.kt", i = {0}, l = {DataTypeSource.SPORT_TYPE_SHOOT, 188, 189}, m = "fetchMeasureHrInDay", n = {"this"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return HeartRateRepository.this.a(0L, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/heartrate/repository/entity/HeartRateData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.repository.HeartRateRepository$getLocalLatestHeartRateInfo$2", f = "HeartRateRepository.kt", i = {0}, l = {102, 103, 106, 109, 111}, m = "invokeSuspend", n = {"firstValidWholeHeartRateData"}, s = {"L$0"})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HeartRateData>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ Map<String, byte[]> d;
        public final /* synthetic */ HeartRateEntity e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Map<String, byte[]> map, HeartRateEntity heartRateEntity, Continuation<? super e> continuation) {
            super(2, continuation);
            this.d = map;
            this.e = heartRateEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeartRateRepository.this.new e(this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super HeartRateData> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0072  */
        /* JADX WARN: Code duplicated, block: B:29:0x007c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x007d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            HeartRateData heartRateDataL;
            HeartRateEntity heartRateEntity;
            HeartRateRepository heartRateRepository;
            Object objI;
            Object obj2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    heartRateDataL = (HeartRateData) this.a;
                    ResultKt.throwOnFailure(obj);
                    heartRateRepository = HeartRateRepository.this;
                    if (((HeartRateData) obj) == null) {
                        this.a = obj;
                        this.b = 2;
                        objI = heartRateRepository.i(heartRateDataL, this);
                        if (objI == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = obj;
                        obj = objI;
                    }
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            return (HeartRateData) obj;
                        }
                        if (i == 4) {
                            ResultKt.throwOnFailure(obj);
                            return (HeartRateData) obj;
                        }
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return (HeartRateData) obj;
                    }
                    obj2 = this.a;
                    ResultKt.throwOnFailure(obj);
                }
                obj = obj2;
            } else {
                ResultKt.throwOnFailure(obj);
                heartRateDataL = HeartRateRepository.this.l(this.d);
                if (heartRateDataL == null || (heartRateEntity = this.e) == null) {
                    if (heartRateDataL != null) {
                        HeartRateRepository heartRateRepository2 = HeartRateRepository.this;
                        this.b = 4;
                        obj = heartRateRepository2.i(heartRateDataL, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return (HeartRateData) obj;
                    }
                    HeartRateEntity heartRateEntity2 = this.e;
                    if (heartRateEntity2 == null) {
                        return null;
                    }
                    HeartRateRepository heartRateRepository3 = HeartRateRepository.this;
                    this.b = 5;
                    obj = heartRateRepository3.h(heartRateEntity2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return (HeartRateData) obj;
                }
                if (ExtensionUtilsKt.secondToMills(heartRateEntity.getTime()) <= heartRateDataL.getTime()) {
                    HeartRateRepository heartRateRepository4 = HeartRateRepository.this;
                    this.b = 3;
                    obj = heartRateRepository4.i(heartRateDataL, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return (HeartRateData) obj;
                }
                HeartRateRepository heartRateRepository5 = HeartRateRepository.this;
                HeartRateEntity heartRateEntity3 = this.e;
                this.a = heartRateDataL;
                this.b = 1;
                obj = heartRateRepository5.h(heartRateEntity3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                heartRateRepository = HeartRateRepository.this;
                if (((HeartRateData) obj) == null) {
                    this.a = obj;
                    this.b = 2;
                    objI = heartRateRepository.i(heartRateDataL, this);
                    if (objI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj2 = obj;
                    obj = objI;
                    obj = obj2;
                }
            }
            return (HeartRateData) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.repository.HeartRateRepository", f = "HeartRateRepository.kt", i = {0, 0, 0}, l = {170, 172}, m = "getMeasureHrInDay", n = {"this", "from", "end"}, s = {"L$0", "J$0", "J$1"})
    public static final class f extends ContinuationImpl {
        public Object a;
        public long b;
        public long c;
        public /* synthetic */ Object d;
        public int f;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return HeartRateRepository.this.e(0L, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.repository.HeartRateRepository", f = "HeartRateRepository.kt", i = {0, 0, 1, 1, 1}, l = {130, 132}, m = "localManualHeartRateIsLatest", n = {SportAnalytics.ParamValue.MapButtonType.MAP, "time", "manualHrList", "hrArray", "time"}, s = {"L$1", "J$0", "L$0", "L$1", "J$0"})
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
            return HeartRateRepository.this.h(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ HeartRateData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(HeartRateData heartRateData) {
            super(0);
            this.a = heartRateData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "manual hr is latest data is: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.repository.HeartRateRepository", f = "HeartRateRepository.kt", i = {0, 0, 0, 1, 1}, l = {146, 149}, m = "localWholeHeartRateIsLatest", n = {"this", "firstValidWholeHeartRateData", "time", "firstValidWholeHeartRateData", com.xiaomi.hm.health.Constant.PAI_KEY_RHR}, s = {"L$0", "L$1", "J$0", "L$0", "I$0"})
    public static final class i extends ContinuationImpl {
        public Object a;
        public Object b;
        public long c;
        public int d;
        public /* synthetic */ Object e;
        public int g;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return HeartRateRepository.this.i(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ HeartRateData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(HeartRateData heartRateData) {
            super(0);
            this.a = heartRateData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "whole hr is latest data is: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "manualHr", "", "", "", "wholeHr", "Lcom/huami/heartrate/repository/entity/HeartRateData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.repository.HeartRateRepository$queryLatestHeartRateRawData$1", f = "HeartRateRepository.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function3<HeartRateEntity, Map<String, ? extends byte[]>, Continuation<? super HeartRateData>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ HeartRateData a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HeartRateData heartRateData) {
                super(0);
                this.a = heartRateData;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "local latest heart rate :" + this.a;
            }
        }

        public k(Continuation<? super k> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable HeartRateEntity heartRateEntity, @Nullable Map<String, byte[]> map, @Nullable Continuation<? super HeartRateData> continuation) {
            k kVar = HeartRateRepository.this.new k(continuation);
            kVar.b = heartRateEntity;
            kVar.c = map;
            return kVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HeartRateEntity heartRateEntity = (HeartRateEntity) this.b;
                Map map = (Map) this.c;
                HeartRateRepository heartRateRepository = HeartRateRepository.this;
                this.b = null;
                this.a = 1;
                obj = heartRateRepository.c(heartRateEntity, map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HMLog.info(HeartRateRepository.e, new a((HeartRateData) obj));
            return obj;
        }
    }

    public HeartRateRepository(@NotNull ILocalDataSource iLocalDataSource, @NotNull IRemoteDataSource iRemoteDataSource, @NotNull IDataBaseDataSource iDataBaseDataSource, @NotNull IRestingHrDataSource iRestingHrDataSource) {
        this.localDataSource = iLocalDataSource;
        this.remoteDataSource = iRemoteDataSource;
        this.dbDataSource = iDataBaseDataSource;
        this.d = iRestingHrDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object a(long j2, long j3, Continuation<? super List<HeartRateEntity>> continuation) {
        c cVar;
        HeartRateRepository heartRateRepository;
        Object objM3845constructorimpl;
        List<HeartRateEntity> list;
        HeartRateRepository heartRateRepository2;
        IDataBaseDataSource iDataBaseDataSource;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.e = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object remoteMeasureHrData = cVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = cVar.e;
        boolean z = true;
        if (i3 != 0) {
            if (i3 == 1) {
                heartRateRepository = (HeartRateRepository) cVar.a;
                try {
                    ResultKt.throwOnFailure(remoteMeasureHrData);
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list2 = (List) cVar.a;
                    ResultKt.throwOnFailure(remoteMeasureHrData);
                    return list2;
                }
                List<HeartRateEntity> list3 = (List) cVar.b;
                heartRateRepository2 = (HeartRateRepository) cVar.a;
                ResultKt.throwOnFailure(remoteMeasureHrData);
                list = list3;
            }
            iDataBaseDataSource = heartRateRepository2.dbDataSource;
            cVar.a = list;
            cVar.b = null;
            cVar.e = 3;
            if (iDataBaseDataSource.insertHeartRateList(list, cVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return list;
        }
        ResultKt.throwOnFailure(remoteMeasureHrData);
        try {
            Result.Companion companion2 = Result.Companion;
            IRemoteDataSource iRemoteDataSource = this.remoteDataSource;
            cVar.a = this;
            cVar.e = 1;
            remoteMeasureHrData = iRemoteDataSource.getRemoteMeasureHrData(j2, j3, 0, cVar);
            if (remoteMeasureHrData == coroutine_suspended) {
                return coroutine_suspended;
            }
            heartRateRepository = this;
        } catch (Throwable th2) {
            th = th2;
            heartRateRepository = this;
            Result.Companion companion3 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        RemoteHeartRateData remoteHeartRateData = (RemoteHeartRateData) remoteMeasureHrData;
        List<HeartRateEntity> listConvertHeartRate = MeasureHrViewModelKt.convertHeartRate(remoteHeartRateData == null ? null : remoteHeartRateData.getItems());
        objM3845constructorimpl = Result.m3845constructorimpl(listConvertHeartRate == null ? null : CollectionsKt___CollectionsKt.sortedDescending(listConvertHeartRate));
        HeartRateRepository heartRateRepository3 = heartRateRepository;
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(e, new d(thM3848exceptionOrNullimpl));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        list = (List) objM3845constructorimpl;
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (z) {
            return null;
        }
        IDataBaseDataSource iDataBaseDataSource2 = heartRateRepository3.dbDataSource;
        long time = ((HeartRateEntity) CollectionsKt.first((List) list)).getTime();
        long time2 = ((HeartRateEntity) CollectionsKt.last((List) list)).getTime();
        cVar.a = heartRateRepository3;
        cVar.b = list;
        cVar.e = 2;
        if (iDataBaseDataSource2.deleteSyncedHeartRate(time, time2, cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        heartRateRepository2 = heartRateRepository3;
        iDataBaseDataSource = heartRateRepository2.dbDataSource;
        cVar.a = list;
        cVar.b = null;
        cVar.e = 3;
        if (iDataBaseDataSource.insertHeartRateList(list, cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return list;
    }

    private final Map<String, byte[]> b(Date dayFrom, Date dayEnd) {
        return this.dbDataSource.queryWholeDayHeartRate(dayFrom, dayEnd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(HeartRateEntity heartRateEntity, Map<String, byte[]> map, Continuation<? super HeartRateData> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new e(map, heartRateEntity, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(long j2, long j3, Continuation<? super List<HeartRateEntity>> continuation) {
        return this.dbDataSource.queryHeartRateListByDayRange(ExtensionUtilsKt.millsToSecond(j2), ExtensionUtilsKt.millsToSecond(j3), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(long j2, long j3, Continuation<? super List<HeartRateEntity>> continuation) {
        f fVar;
        HeartRateRepository heartRateRepository;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.f = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object objQueryHeartRateListByDayRange = fVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = fVar.f;
        boolean z = true;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objQueryHeartRateListByDayRange);
            IDataBaseDataSource iDataBaseDataSource = this.dbDataSource;
            fVar.a = this;
            fVar.b = j2;
            fVar.c = j3;
            fVar.f = 1;
            objQueryHeartRateListByDayRange = iDataBaseDataSource.queryHeartRateListByDayRange(j2, j3, fVar);
            if (objQueryHeartRateListByDayRange == coroutine_suspended) {
                return coroutine_suspended;
            }
            heartRateRepository = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list = (List) fVar.a;
                ResultKt.throwOnFailure(objQueryHeartRateListByDayRange);
                return list;
            }
            j3 = fVar.c;
            j2 = fVar.b;
            heartRateRepository = (HeartRateRepository) fVar.a;
            ResultKt.throwOnFailure(objQueryHeartRateListByDayRange);
        }
        long j4 = j2;
        long j5 = j3;
        List list2 = (List) objQueryHeartRateListByDayRange;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        }
        if (!z) {
            return list2;
        }
        fVar.a = list2;
        fVar.f = 2;
        return heartRateRepository.a(j4, j5, fVar) == coroutine_suspended ? coroutine_suspended : list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(long j2, Continuation<? super Integer> continuation) {
        return this.localDataSource.queryRestHeartRateByDay(HeartRateTimeUtils.INSTANCE.getChinaDateString(j2), continuation);
    }

    private final boolean g(byte[] hrArray) {
        for (byte b2 : hrArray) {
            if (HandleDataKt.isValidHeartRate().invoke(Integer.valueOf(b2 & 255)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object h(HeartRateEntity heartRateEntity, Continuation<? super HeartRateData> continuation) {
        g gVar;
        HeartRateRepository heartRateRepository;
        long j2;
        Map<String, byte[]> map;
        List list;
        byte[] bArr;
        long j3;
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
        Object objD = gVar2.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = gVar2.f;
        if (i3 != 0) {
            if (i3 == 1) {
                j2 = gVar2.c;
                map = (Map) gVar2.b;
                heartRateRepository = (HeartRateRepository) gVar2.a;
                ResultKt.throwOnFailure(objD);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j4 = gVar2.c;
                byte[] bArr2 = (byte[]) gVar2.b;
                List list2 = (List) gVar2.a;
                ResultKt.throwOnFailure(objD);
                j3 = j4;
                bArr = bArr2;
                list = list2;
            }
            HeartRateData heartRateData = new HeartRateData(j3, ((Number) objD).intValue(), list, bArr);
            HMLog.info(e, new h(heartRateData));
            return heartRateData;
        }
        ResultKt.throwOnFailure(objD);
        if (heartRateEntity == null) {
            return null;
        }
        long jSecondToMills = ExtensionUtilsKt.secondToMills(heartRateEntity.getTime());
        HeartRateTimeUtils heartRateTimeUtils = HeartRateTimeUtils.INSTANCE;
        long dayStartTime = heartRateTimeUtils.getDayStartTime(jSecondToMills);
        long dayEndTime = heartRateTimeUtils.getDayEndTime(jSecondToMills);
        Map<String, byte[]> mapB = b(new Date(dayStartTime), new Date(dayEndTime));
        gVar2.a = this;
        gVar2.b = mapB;
        gVar2.c = jSecondToMills;
        gVar2.f = 1;
        objD = d(dayStartTime, dayEndTime, gVar2);
        if (objD == coroutine_suspended) {
            return coroutine_suspended;
        }
        heartRateRepository = this;
        j2 = jSecondToMills;
        map = mapB;
        List list3 = (List) objD;
        byte[] bArr3 = map != null ? map.get(HeartRateTimeUtils.INSTANCE.getChinaDateString(j2)) : null;
        gVar2.a = list3;
        gVar2.b = bArr3;
        gVar2.c = j2;
        gVar2.f = 2;
        Object objF = heartRateRepository.f(j2, gVar2);
        if (objF == coroutine_suspended) {
            return coroutine_suspended;
        }
        list = list3;
        objD = objF;
        bArr = bArr3;
        j3 = j2;
        HeartRateData heartRateData2 = new HeartRateData(j3, ((Number) objD).intValue(), list, bArr);
        HMLog.info(e, new h(heartRateData2));
        return heartRateData2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(HeartRateData heartRateData, Continuation<? super HeartRateData> continuation) {
        i iVar;
        HeartRateRepository heartRateRepository;
        long j2;
        HeartRateData heartRateData2;
        int i2;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i3 = iVar.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.g = i3 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        i iVar2 = iVar;
        Object objF = iVar2.e;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = iVar2.g;
        if (i4 != 0) {
            if (i4 == 1) {
                j2 = iVar2.c;
                heartRateData = (HeartRateData) iVar2.b;
                heartRateRepository = (HeartRateRepository) iVar2.a;
                ResultKt.throwOnFailure(objF);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = iVar2.d;
                heartRateData2 = (HeartRateData) iVar2.a;
                ResultKt.throwOnFailure(objF);
                i2 = i5;
            }
            HeartRateData heartRateData3 = new HeartRateData(heartRateData2.getTime(), i2, (List) objF, heartRateData2.getWholeHrData());
            HMLog.info(e, new j(heartRateData3));
            return heartRateData3;
        }
        ResultKt.throwOnFailure(objF);
        long time = heartRateData.getTime();
        iVar2.a = this;
        iVar2.b = heartRateData;
        iVar2.c = time;
        iVar2.g = 1;
        objF = f(time, iVar2);
        if (objF == coroutine_suspended) {
            return coroutine_suspended;
        }
        heartRateRepository = this;
        j2 = time;
        int iIntValue = ((Number) objF).intValue();
        HeartRateTimeUtils heartRateTimeUtils = HeartRateTimeUtils.INSTANCE;
        long dayStartTime = heartRateTimeUtils.getDayStartTime(j2);
        long dayEndTime = heartRateTimeUtils.getDayEndTime(j2);
        iVar2.a = heartRateData;
        iVar2.b = null;
        iVar2.d = iIntValue;
        iVar2.g = 2;
        Object objD = heartRateRepository.d(dayStartTime, dayEndTime, iVar2);
        if (objD == coroutine_suspended) {
            return coroutine_suspended;
        }
        heartRateData2 = heartRateData;
        i2 = iIntValue;
        objF = objD;
        HeartRateData heartRateData4 = new HeartRateData(heartRateData2.getTime(), i2, (List) objF, heartRateData2.getWholeHrData());
        HMLog.info(e, new j(heartRateData4));
        return heartRateData4;
    }

    private final Flow<Map<String, byte[]>> j(Date dayFrom, Date dayEnd) {
        return this.dbDataSource.observeWholeDayHeartRate(dayFrom, dayEnd);
    }

    private final Flow<HeartRateEntity> k(Date from, Date end) {
        return this.dbDataSource.observeLatestHeartRate(ExtensionUtilsKt.millsToSecond(from.getTime()), ExtensionUtilsKt.millsToSecond(end.getTime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeartRateData l(Map<String, byte[]> hrDatas) {
        Object next;
        HeartRateTimeUtils heartRateTimeUtils;
        Date chinaDateDate;
        if (hrDatas == null || hrDatas.isEmpty()) {
            return null;
        }
        Iterator<T> it2 = hrDatas.entrySet().iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!g((byte[]) ((Map.Entry) next).getValue()));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (chinaDateDate = (heartRateTimeUtils = HeartRateTimeUtils.INSTANCE).getChinaDateDate((String) entry.getKey())) == null) {
            return null;
        }
        return new HeartRateData(heartRateTimeUtils.getDayEndTime(chinaDateDate.getTime()), 0, null, (byte[]) entry.getValue());
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    public void deleteHeartRateList(@NotNull List<HeartRateEntity> heartRateList) {
        this.dbDataSource.deleteHeartRateList(heartRateList);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Object deleteSyncedHeartRate(long j2, long j3, @NotNull Continuation<? super Unit> continuation) {
        return this.dbDataSource.deleteSyncedHeartRate(j2, j3, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.huami.heartrate.repository.IHeartRateRepository
    @Nullable
    public Object fetchHeartRateInDay(long j2, @NotNull Continuation<? super HeartRateData> continuation) {
        a aVar;
        HeartRateRepository heartRateRepository;
        long j3;
        long j4;
        long j5;
        long j6;
        Map map;
        HeartRateRepository heartRateRepository2;
        long j7;
        long j8;
        int iIntValue;
        byte[] bArr;
        Object objE;
        int i2;
        long j9;
        byte[] bArr2;
        long j10 = j2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i3 = aVar.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.j = i3 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object wholeDayHeartRateData = aVar.h;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = aVar.j;
        if (i4 != 0) {
            if (i4 == 1) {
                long j11 = aVar.e;
                long j12 = aVar.d;
                long j13 = aVar.c;
                heartRateRepository = (HeartRateRepository) aVar.a;
                ResultKt.throwOnFailure(wholeDayHeartRateData);
                j10 = j13;
                j4 = j12;
                j3 = j11;
            } else if (i4 == 2) {
                long j14 = aVar.f;
                long j15 = aVar.e;
                long j16 = aVar.d;
                long j17 = aVar.c;
                Map map2 = (Map) aVar.b;
                HeartRateRepository heartRateRepository3 = (HeartRateRepository) aVar.a;
                ResultKt.throwOnFailure(wholeDayHeartRateData);
                j5 = j14;
                j6 = j17;
                map = map2;
                j7 = j16;
                j8 = j15;
                heartRateRepository2 = heartRateRepository3;
                iIntValue = ((Number) wholeDayHeartRateData).intValue();
                long jMillsToSecond = ExtensionUtilsKt.millsToSecond(j7);
                long jMillsToSecond2 = ExtensionUtilsKt.millsToSecond(j8);
                aVar.a = map;
                bArr = null;
                aVar.b = null;
                aVar.c = j6;
                aVar.d = j5;
                aVar.g = iIntValue;
                aVar.j = 3;
                objE = heartRateRepository2.e(jMillsToSecond, jMillsToSecond2, aVar);
                if (objE == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i2 = iIntValue;
                wholeDayHeartRateData = objE;
                j9 = j5;
            } else {
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = aVar.g;
                long j18 = aVar.d;
                long j19 = aVar.c;
                map = (Map) aVar.a;
                ResultKt.throwOnFailure(wholeDayHeartRateData);
                bArr = null;
                i2 = i5;
                j9 = j18;
                j6 = j19;
            }
            List list = (List) wholeDayHeartRateData;
            if (map == null) {
                bArr2 = bArr;
            } else {
                bArr2 = (byte[]) map.get(HeartRateTimeUtils.INSTANCE.getChinaDateString(j6));
            }
            HeartRateData heartRateData = new HeartRateData(j9, i2, list, bArr2);
            HMLog.info(e, new b(heartRateData));
            return heartRateData;
        }
        ResultKt.throwOnFailure(wholeDayHeartRateData);
        HeartRateTimeUtils heartRateTimeUtils = HeartRateTimeUtils.INSTANCE;
        long dayStartTime = heartRateTimeUtils.getDayStartTime(j10);
        long dayEndTime = heartRateTimeUtils.getDayEndTime(j10);
        ILocalDataSource iLocalDataSource = this.localDataSource;
        aVar.a = this;
        aVar.c = j10;
        aVar.d = dayStartTime;
        aVar.e = dayEndTime;
        aVar.j = 1;
        wholeDayHeartRateData = iLocalDataSource.getWholeDayHeartRateData(dayStartTime, dayEndTime, aVar);
        if (wholeDayHeartRateData == coroutine_suspended) {
            return coroutine_suspended;
        }
        heartRateRepository = this;
        j3 = dayEndTime;
        j4 = dayStartTime;
        Map map3 = (Map) wholeDayHeartRateData;
        aVar.a = heartRateRepository;
        aVar.b = map3;
        aVar.c = j10;
        aVar.d = j4;
        aVar.e = j3;
        aVar.f = j10;
        aVar.j = 2;
        Object objF = heartRateRepository.f(j10, aVar);
        if (objF == coroutine_suspended) {
            return coroutine_suspended;
        }
        j5 = j10;
        j6 = j5;
        map = map3;
        wholeDayHeartRateData = objF;
        long j20 = j3;
        heartRateRepository2 = heartRateRepository;
        j7 = j4;
        j8 = j20;
        iIntValue = ((Number) wholeDayHeartRateData).intValue();
        long jMillsToSecond3 = ExtensionUtilsKt.millsToSecond(j7);
        long jMillsToSecond4 = ExtensionUtilsKt.millsToSecond(j8);
        aVar.a = map;
        bArr = null;
        aVar.b = null;
        aVar.c = j6;
        aVar.d = j5;
        aVar.g = iIntValue;
        aVar.j = 3;
        objE = heartRateRepository2.e(jMillsToSecond3, jMillsToSecond4, aVar);
        if (objE == coroutine_suspended) {
            return coroutine_suspended;
        }
        i2 = iIntValue;
        wholeDayHeartRateData = objE;
        j9 = j5;
        List list2 = (List) wholeDayHeartRateData;
        if (map == null) {
            bArr2 = bArr;
        } else {
            bArr2 = (byte[]) map.get(HeartRateTimeUtils.INSTANCE.getChinaDateString(j6));
        }
        HeartRateData heartRateData2 = new HeartRateData(j9, i2, list2, bArr2);
        HMLog.info(e, new b(heartRateData2));
        return heartRateData2;
    }

    @Override // com.huami.heartrate.repository.remote.IRemoteDataSource
    @Nullable
    public Object fetchMeasureHeartRateData(@Nullable Long l, int i2, @NotNull Continuation<? super PagingRemoteHeartRateData> continuation) {
        return this.remoteDataSource.fetchMeasureHeartRateData(l, i2, continuation);
    }

    @Override // com.huami.heartrate.resting.datasource.IRestingHrDataSource
    @NotNull
    public Flow<List<RestingHeartRate>> fetchRestingHr(long dateFrom, long dateEnd) {
        return this.d.fetchRestingHr(dateFrom, dateEnd);
    }

    @Override // com.huami.heartrate.repository.IHeartRateRepository
    @Nullable
    public Object getMeasureHeartRatePagingList(@Nullable Long l, int i2, @NotNull Continuation<? super PagingRemoteHeartRateData> continuation) {
        return this.remoteDataSource.fetchMeasureHeartRateData(l, i2, continuation);
    }

    @Override // com.huami.heartrate.repository.remote.IRemoteDataSource
    @Nullable
    public Object getRemoteMeasureHrData(long j2, long j3, int i2, @NotNull Continuation<? super RemoteHeartRateData> continuation) {
        return this.remoteDataSource.getRemoteMeasureHrData(j2, j3, i2, continuation);
    }

    @Override // com.huami.heartrate.repository.local.ILocalDataSource
    @Nullable
    public Object getWholeDayHeartRateData(long j2, long j3, @NotNull Continuation<? super Map<String, byte[]>> continuation) {
        return this.localDataSource.getWholeDayHeartRateData(j2, j3, continuation);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    public void insertHeartRate(@NotNull HeartRateEntity heartRate) {
        this.dbDataSource.insertHeartRate(heartRate);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Object insertHeartRateList(@NotNull List<HeartRateEntity> list, @NotNull Continuation<? super Unit> continuation) {
        return this.dbDataSource.insertHeartRateList(list, continuation);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @NotNull
    public Flow<List<HeartRateEntity>> observeHeartRateLiveDataList(long from, long to) {
        return this.dbDataSource.observeHeartRateLiveDataList(from, to);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @NotNull
    public Flow<HeartRateEntity> observeLatestHeartRate() {
        return this.dbDataSource.observeLatestHeartRate();
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @NotNull
    public Flow<HeartRateEntity> observeLatestHeartRate(long fromSecond, long toSecond) {
        return this.dbDataSource.observeLatestHeartRate(fromSecond, toSecond);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @NotNull
    public Flow<Map<String, byte[]>> observeWholeDayHeartRate(@NotNull Date dayFrom, @NotNull Date dayEnd) {
        return this.dbDataSource.observeWholeDayHeartRate(dayFrom, dayEnd);
    }

    @Override // com.huami.heartrate.repository.local.ILocalDataSource
    @NotNull
    public Flow<Boolean> observeWholeDayHrDataChanged(@NotNull String date) {
        return this.localDataSource.observeWholeDayHrDataChanged(date);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Object queryEarliestSyncedHeartRate(@NotNull Continuation<? super HeartRateEntity> continuation) {
        return this.dbDataSource.queryEarliestSyncedHeartRate(continuation);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Object queryHeartRateListByDayRange(long j2, long j3, @NotNull Continuation<? super List<HeartRateEntity>> continuation) {
        return this.dbDataSource.queryHeartRateListByDayRange(j2, j3, continuation);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Object queryHeartRateListByLimit(long j2, int i2, @NotNull Continuation<? super List<HeartRateEntity>> continuation) {
        return this.dbDataSource.queryHeartRateListByLimit(j2, i2, continuation);
    }

    @Override // com.huami.heartrate.repository.IHeartRateRepository
    @NotNull
    public Flow<HeartRateData> queryLatestHeartRateRawData() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(4, -2);
        return FlowKt.flowCombine(k(calendar.getTime(), date), j(calendar.getTime(), date), new k(null));
    }

    @Override // com.huami.heartrate.repository.local.ILocalDataSource
    @Nullable
    public Object queryRestHeartRateByDay(@NotNull String str, @NotNull Continuation<? super Integer> continuation) {
        return this.localDataSource.queryRestHeartRateByDay(str, continuation);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Map<String, byte[]> queryWholeDayHeartRate(@NotNull Date dayFrom, @NotNull Date dayEnd) {
        return this.dbDataSource.queryWholeDayHeartRate(dayFrom, dayEnd);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    public void updateHeartRate(@NotNull HeartRateEntity heartRate) {
        this.dbDataSource.updateHeartRate(heartRate);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Object updateHeartRateList(@NotNull List<HeartRateEntity> list, @NotNull Continuation<? super Unit> continuation) {
        return this.dbDataSource.updateHeartRateList(list, continuation);
    }
}
