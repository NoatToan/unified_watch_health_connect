package com.huami.moving.service;

import android.content.Context;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.common.SyncedState;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.moving.ui.utils.SportRecordAssembleUtil;
import com.huami.moving.ui.utils.SportRecordQueryConstrainUtils;
import com.huami.sport.service.SportService;
import com.huami.sport.service.model.HistoryRecord;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.LiveDataSupportKt;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.databases.model.TrackrecordDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecordDao;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.LongRange;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J.\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t0\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0002J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0013H\u0002J(\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001c2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0016J(\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001c2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0016J&\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t0\u001c2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\""}, d2 = {"Lcom/huami/moving/service/SportServiceImpl;", "Lcom/huami/sport/service/SportService;", "Lcom/huami/sport/service/model/HistoryRecord;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "startTime", "endTime", "Landroidx/lifecycle/LiveData;", "", "a", "", "count", "h", "Lkotlin/ranges/LongRange;", "timeRange", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "c", "b", "Lorg/greenrobot/greendao/query/QueryBuilder;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/databases/model/trainning/TrainingRecord;", "f", "e", "g", "Ljava/util/Date;", "start", "end", "Lkotlinx/coroutines/flow/Flow;", "loadSportCount", "loadSportDuration", "loadLatestSportRecords", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportServiceImpl implements SportService<HistoryRecord> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/sport/service/model/HistoryRecord;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<List<? extends HistoryRecord>> {
        public final /* synthetic */ Context b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, long j, long j2) {
            super(0);
            this.b = context;
            this.c = j;
            this.d = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final List<? extends HistoryRecord> invoke() {
            return SportServiceImpl.this.h(this.b, this.c, this.d, 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/sport/service/model/HistoryRecord;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<List<? extends HistoryRecord>> {
        public final /* synthetic */ Context b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, int i) {
            super(0);
            this.b = context;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final List<? extends HistoryRecord> invoke() {
            return SportServiceImpl.this.h(this.b, 0L, 0L, this.c);
        }
    }

    private final LiveData<List<HistoryRecord>> a(Context context, long startTime, long endTime) {
        return LiveDataSupportKt.queryByLiveData(new String[]{"TRACKRECORD", "TRAINING_RECORD"}, new a(context, startTime, endTime));
    }

    private final List<Trackrecord> b(int count) {
        return count > 0 ? d().limit(count).list() : CollectionsKt__CollectionsKt.emptyList();
    }

    private final List<Trackrecord> c(LongRange timeRange) {
        QueryBuilder<Trackrecord> queryBuilderD = d();
        Property property = TrackrecordDao.Properties.Trackid;
        return queryBuilderD.where(property.ge(Long.valueOf(timeRange.getFirst())), property.le(Long.valueOf(timeRange.getLast()))).list();
    }

    private final QueryBuilder<Trackrecord> d() {
        QueryBuilder<Trackrecord> queryBuilder = HMDaoManager.getInstance().getTrackrecordDao().queryBuilder();
        Property property = TrackrecordDao.Properties.State;
        return queryBuilder.where(property.notEq(Integer.valueOf(SyncedState.SYNC_STATE_DEFAULT.getValue())), property.notEq(Integer.valueOf(SyncedState.STATE_TO_BE_DELETED.getValue())), property.notEq(Integer.valueOf(SyncedState.STATE_UNKNOW.getValue())), SportRecordQueryConstrainUtils.querySportRecordBySportType()).orderDesc(TrackrecordDao.Properties.Trackid);
    }

    private final List<TrainingRecord> e(int count) {
        return count > 0 ? g().limit(count).list() : CollectionsKt__CollectionsKt.emptyList();
    }

    private final List<TrainingRecord> f(LongRange timeRange) {
        QueryBuilder<TrainingRecord> queryBuilderG = g();
        Property property = TrainingRecordDao.Properties.StartTime;
        return queryBuilderG.where(property.ge(Long.valueOf(timeRange.getFirst())), property.le(Long.valueOf(timeRange.getLast()))).list();
    }

    private final QueryBuilder<TrainingRecord> g() {
        return HMDaoManager.getInstance().getDaoSession().getTrainingRecordDao().queryBuilder().where(TrainingRecordDao.Properties.Status.in(0, 1), new WhereCondition[0]).orderDesc(TrainingRecordDao.Properties.StartTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<HistoryRecord> h(Context context, long startTime, long endTime, int count) {
        List<Trackrecord> listB;
        Object objM3845constructorimpl;
        if (startTime <= 0 || endTime <= 0) {
            listB = b(count);
        } else {
            long j = 1000;
            listB = c(new LongRange(startTime / j, endTime / j));
        }
        List<TrainingRecord> listE = (Language.isSimplifiedChinese() && RunnerData.getRunner().isMainlandUser()) ? (startTime <= 0 || endTime <= 0) ? e(count) : f(new LongRange(startTime, endTime)) : CollectionsKt__CollectionsKt.emptyList();
        ArrayList arrayList = new ArrayList();
        try {
            Result.Companion companion = Result.Companion;
            Iterator<Trackrecord> it2 = listB.iterator();
            while (it2.hasNext()) {
                HistoryRecord historyRecordConvertTrackRecord = HistoryRecord.convertTrackRecord(it2.next());
                SportRecordAssembleUtil sportRecordAssembleUtil = SportRecordAssembleUtil.INSTANCE;
                sportRecordAssembleUtil.setSportIconAndNameToRecord(context, historyRecordConvertTrackRecord);
                sportRecordAssembleUtil.setTitleDataAndSubDataToRecord(historyRecordConvertTrackRecord);
                arrayList.add(historyRecordConvertTrackRecord);
            }
            Iterator<TrainingRecord> it3 = listE.iterator();
            while (it3.hasNext()) {
                HistoryRecord historyRecordConvertTrainingRecord = HistoryRecord.convertTrainingRecord(it3.next());
                SportRecordAssembleUtil sportRecordAssembleUtil2 = SportRecordAssembleUtil.INSTANCE;
                sportRecordAssembleUtil2.setSportIconAndNameToRecord(context, historyRecordConvertTrainingRecord);
                sportRecordAssembleUtil2.setTitleDataAndSubDataToRecord(historyRecordConvertTrainingRecord);
                arrayList.add(historyRecordConvertTrainingRecord);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            thM3848exceptionOrNullimpl.printStackTrace();
            HMLog.i("SportServiceImpl", "query sport-record error:" + thM3848exceptionOrNullimpl.getMessage(), new Object[0]);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((HistoryRecord) obj).getBeginTimeInMilli() <= System.currentTimeMillis()) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.huami.moving.service.SportServiceImpl$loadSportRecordByRangeOrCount$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((HistoryRecord) t2).getBeginTimeInMilli()), Long.valueOf(((HistoryRecord) t).getBeginTimeInMilli()));
            }
        });
    }

    @Override // com.huami.sport.service.SportService
    @NotNull
    public Flow<List<HistoryRecord>> loadLatestSportRecords(@NotNull Context context, int count) {
        return FlowLiveDataConversions.asFlow(LiveDataSupportKt.queryByLiveData(new String[]{"TRACKRECORD", "TRAINING_RECORD"}, new b(context, count)));
    }

    @Override // com.huami.sport.service.SportService
    @NotNull
    public Flow<Integer> loadSportCount(@NotNull Context context, @NotNull Date start, @NotNull Date end) {
        final Flow flowAsFlow = FlowLiveDataConversions.asFlow(a(context, start.getTime(), end.getTime()));
        return new Flow<Integer>() { // from class: com.huami.moving.service.SportServiceImpl$loadSportCount$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.moving.service.SportServiceImpl$loadSportCount$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<List<? extends HistoryRecord>> {
                public final /* synthetic */ FlowCollector a;

                /* JADX INFO: renamed from: com.huami.moving.service.SportServiceImpl$loadSportCount$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.moving.service.SportServiceImpl$loadSportCount$$inlined$map$1$2", f = "SportServiceImpl.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;

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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<? extends HistoryRecord> list, @NotNull Continuation continuation) {
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
                        List<? extends HistoryRecord> list2 = list;
                        Integer numBoxInt = list2 == null ? null : Boxing.boxInt(list2.size());
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(numBoxInt, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super Integer> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.huami.sport.service.SportService
    @NotNull
    public Flow<Long> loadSportDuration(@NotNull Context context, @NotNull Date start, @NotNull Date end) {
        final Flow flowAsFlow = FlowLiveDataConversions.asFlow(a(context, start.getTime(), end.getTime()));
        return new Flow<Long>() { // from class: com.huami.moving.service.SportServiceImpl$loadSportDuration$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.moving.service.SportServiceImpl$loadSportDuration$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<List<? extends HistoryRecord>> {
                public final /* synthetic */ FlowCollector a;

                /* JADX INFO: renamed from: com.huami.moving.service.SportServiceImpl$loadSportDuration$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.moving.service.SportServiceImpl$loadSportDuration$$inlined$map$1$2", f = "SportServiceImpl.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;

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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<? extends HistoryRecord> list, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Long lBoxLong;
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
                        List<? extends HistoryRecord> list2 = list;
                        if (list2 == null) {
                            lBoxLong = null;
                        } else {
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                            Iterator<T> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Boxing.boxLong(((HistoryRecord) it2.next()).getConsumeTime()));
                            }
                            lBoxLong = Boxing.boxLong(CollectionsKt___CollectionsKt.sumOfLong(arrayList));
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(lBoxLong, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super Long> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
