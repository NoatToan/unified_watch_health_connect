package com.xiaomi.fitness.aggregation.health.dao;

import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataTypeKt;
import com.xiaomi.fit.fitness.export.data.item.RedDotItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.aggregation.db.FitnessSummaryDatabase;
import com.xiaomi.fitness.aggregation.health.entity.FitnessDailyReportEntity;
import com.xiaomi.fitness.aggregation.health.entity.RedDotEntity;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fJ*\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000f0\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015J0\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000f0\u00172\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015J \u0010\u001c\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0002J\u001e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010!\u001a\u00020\u001eJ\u0014\u0010\"\u001a\u00020\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fR\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/dao/RedDotDaoProxy;", "", "<init>", "()V", "redDotDao", "Lcom/xiaomi/fitness/aggregation/health/dao/RedDotDao;", "getRedDotDao", "()Lcom/xiaomi/fitness/aggregation/health/dao/RedDotDao;", "dailyReportDao", "Lcom/xiaomi/fitness/aggregation/health/dao/FitnessDailyReportDao;", "getDailyReportDao", "()Lcom/xiaomi/fitness/aggregation/health/dao/FitnessDailyReportDao;", "insert", "", "entityList", "", "Lcom/xiaomi/fitness/aggregation/health/entity/RedDotEntity;", "updateDelete", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "timeList", "", "queryRedDotList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/xiaomi/fit/fitness/export/data/item/RedDotItem;", StatConstants.PARAM_START, StatConstants.PARAM_END, "queryRedDotDataTypeList", "deleteRedDotIfNeed", "queryRedDotCount", "", "getItemList", "getNotUpCloudList", "limit", "updateAfterCloud", "list", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRedDotDaoProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedDotDaoProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/RedDotDaoProxy\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n37#2:106\n36#2,3:107\n37#2:122\n36#2,3:123\n53#3:110\n55#3:114\n53#3:117\n55#3:121\n50#4:111\n55#4:113\n50#4:118\n55#4:120\n107#5:112\n107#5:119\n1863#6,2:115\n*S KotlinDebug\n*F\n+ 1 RedDotDaoProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/RedDotDaoProxy\n*L\n25#1:106\n25#1:107,3\n102#1:122\n102#1:123,3\n41#1:110\n41#1:114\n56#1:117\n56#1:121\n41#1:111\n41#1:113\n56#1:118\n56#1:120\n41#1:112\n56#1:119\n52#1:115,2\n*E\n"})
public final class RedDotDaoProxy {

    @NotNull
    public static final RedDotDaoProxy INSTANCE = new RedDotDaoProxy();

    private RedDotDaoProxy() {
    }

    private final void deleteRedDotIfNeed(HomeDataType dataType, long start, long end) {
        if (HomeDataTypeKt.canDeleteData(dataType) && HomeDataTypeKt.needSaveDailyReport(dataType)) {
            List<RedDotEntity> listQueryRedDotListSync = getRedDotDao().queryRedDotListSync(dataType, start, end);
            List<FitnessDailyReportEntity> listQueryDailyReportEntityListSync = getDailyReportDao().queryDailyReportEntityListSync(dataType, start, end);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<FitnessDailyReportEntity> it = listQueryDailyReportEntityListSync.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(Long.valueOf(it.next().getTimeInZero()));
            }
            ArrayList arrayList = new ArrayList();
            Iterator<RedDotEntity> it2 = listQueryRedDotListSync.iterator();
            while (it2.hasNext()) {
                long timeInZero = it2.next().getTimeInZero();
                if (!linkedHashSet.contains(Long.valueOf(timeInZero))) {
                    arrayList.add(Long.valueOf(timeInZero));
                }
            }
            updateDelete(dataType, arrayList);
        }
    }

    private final FitnessDailyReportDao getDailyReportDao() {
        return FitnessSummaryDatabase.INSTANCE.getInstance().getFitnessDailyReportDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<RedDotItem> getItemList(List<RedDotEntity> entityList) {
        ArrayList arrayList = new ArrayList();
        Iterator<RedDotEntity> it = entityList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toRedDotItem());
        }
        return arrayList;
    }

    private final RedDotDao getRedDotDao() {
        return FitnessSummaryDatabase.INSTANCE.getInstance().getRedDotDao();
    }

    @NotNull
    public final List<RedDotEntity> getNotUpCloudList(int limit) {
        return getRedDotDao().queryRedDotNotUpcloudList(limit);
    }

    public final void insert(@NotNull List<RedDotEntity> entityList) {
        Intrinsics.checkNotNullParameter(entityList, "entityList");
        RedDotDao redDotDao = getRedDotDao();
        RedDotEntity[] redDotEntityArr = (RedDotEntity[]) entityList.toArray(new RedDotEntity[0]);
        redDotDao.insert((RedDotEntity[]) Arrays.copyOf(redDotEntityArr, redDotEntityArr.length));
    }

    public final int queryRedDotCount(@NotNull HomeDataType dataType, long start, long end) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Pair<Long, Long> pairNormalizeTime = TimeZoneUtil.INSTANCE.normalizeTime(start, end);
        long jLongValue = pairNormalizeTime.getFirst().longValue();
        long jLongValue2 = pairNormalizeTime.getSecond().longValue();
        FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE).pullRedDotData();
        deleteRedDotIfNeed(dataType, jLongValue, jLongValue2);
        return getRedDotDao().queryRedDotCount(dataType, jLongValue, jLongValue2);
    }

    @NotNull
    public final Flow<List<RedDotItem>> queryRedDotDataTypeList(@NotNull List<? extends HomeDataType> dataType, long start, long end) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Pair<Long, Long> pairNormalizeTime = TimeZoneUtil.INSTANCE.normalizeTime(start, end);
        long jLongValue = pairNormalizeTime.getFirst().longValue();
        long jLongValue2 = pairNormalizeTime.getSecond().longValue();
        FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE).pullRedDotData();
        Iterator<T> it = dataType.iterator();
        while (it.hasNext()) {
            INSTANCE.deleteRedDotIfNeed((HomeDataType) it.next(), jLongValue, jLongValue2);
        }
        final Flow<List<RedDotEntity>> flowQueryRedDotDataTypeList = getRedDotDao().queryRedDotDataTypeList(dataType, jLongValue, jLongValue2);
        return FlowKt.flowOn(new Flow<List<? extends RedDotItem>>() { // from class: com.xiaomi.fitness.aggregation.health.dao.RedDotDaoProxy$queryRedDotDataTypeList$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.RedDotDaoProxy$queryRedDotDataTypeList$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 RedDotDaoProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/RedDotDaoProxy\n*L\n1#1,222:1\n54#2:223\n56#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.RedDotDaoProxy$queryRedDotDataTypeList$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.aggregation.health.dao.RedDotDaoProxy$queryRedDotDataTypeList$$inlined$map$1$2", f = "RedDotDaoProxy.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        List itemList = RedDotDaoProxy.INSTANCE.getItemList((List) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(itemList, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super List<? extends RedDotItem>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowQueryRedDotDataTypeList.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO());
    }

    @NotNull
    public final Flow<List<RedDotItem>> queryRedDotList(@NotNull HomeDataType dataType, long start, long end) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Pair<Long, Long> pairNormalizeTime = TimeZoneUtil.INSTANCE.normalizeTime(start, end);
        long jLongValue = pairNormalizeTime.getFirst().longValue();
        long jLongValue2 = pairNormalizeTime.getSecond().longValue();
        FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE).pullRedDotData();
        deleteRedDotIfNeed(dataType, jLongValue, jLongValue2);
        final Flow<List<RedDotEntity>> flowQueryRedDotList = getRedDotDao().queryRedDotList(dataType, jLongValue, jLongValue2);
        return FlowKt.flowOn(new Flow<List<? extends RedDotItem>>() { // from class: com.xiaomi.fitness.aggregation.health.dao.RedDotDaoProxy$queryRedDotList$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.RedDotDaoProxy$queryRedDotList$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 RedDotDaoProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/RedDotDaoProxy\n*L\n1#1,222:1\n54#2:223\n41#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.RedDotDaoProxy$queryRedDotList$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.aggregation.health.dao.RedDotDaoProxy$queryRedDotList$$inlined$map$1$2", f = "RedDotDaoProxy.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        List itemList = RedDotDaoProxy.INSTANCE.getItemList((List) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(itemList, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super List<? extends RedDotItem>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowQueryRedDotList.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO());
    }

    public final void updateAfterCloud(@NotNull List<RedDotEntity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<RedDotEntity> list2 = list;
        if (!list2.isEmpty()) {
            RedDotDao redDotDao = getRedDotDao();
            RedDotEntity[] redDotEntityArr = (RedDotEntity[]) list2.toArray(new RedDotEntity[0]);
            redDotDao.insert((RedDotEntity[]) Arrays.copyOf(redDotEntityArr, redDotEntityArr.length));
        }
    }

    public final void updateDelete(@NotNull HomeDataType dataType, @NotNull List<Long> timeList) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(timeList, "timeList");
        getRedDotDao().delete(dataType, timeList);
    }
}
