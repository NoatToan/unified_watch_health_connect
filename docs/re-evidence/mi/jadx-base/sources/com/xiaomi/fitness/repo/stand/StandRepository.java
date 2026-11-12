package com.xiaomi.fitness.repo.stand;

import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.repository.IStandRepository;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.ValidStandItem;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.persist.db.internal.StandRecordEntity;
import com.xiaomi.fit.fitness.persist.db.utils.ItemEntityUtil;
import com.xiaomi.fitness.aggregation.health.dao.TimeZoneUtil;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0010¢\u0006\u0002\b\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J0\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J$\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00160\u001a2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0014H\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00162\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0014H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/repo/stand/StandRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IStandRepository;", "<init>", "()V", "standBiz", "Lcom/xiaomi/fitness/repo/stand/StandBiz;", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "doRecordAdd", "", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "mergeTargetReport", "sid", "", CloudContract.COL_VIEW_TAG, "startTimestamp", "", "srcReportList", "", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "queryStandRecords", "Lkotlinx/coroutines/flow/Flow;", "Lcom/xiaomi/fit/fitness/export/data/item/ValidStandItem;", "startTime", "endTime", "queryStandRecordsSync", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStandRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandRepository.kt\ncom/xiaomi/fitness/repo/stand/StandRepository\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,87:1\n53#2:88\n55#2:92\n50#3:89\n55#3:91\n107#4:90\n*S KotlinDebug\n*F\n+ 1 StandRepository.kt\ncom/xiaomi/fitness/repo/stand/StandRepository\n*L\n71#1:88\n71#1:92\n71#1:89\n71#1:91\n71#1:90\n*E\n"})
public final class StandRepository extends BaseRepository<DailyStandReport> implements IStandRepository {

    @NotNull
    private final StandBiz standBiz = new StandBiz();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doRecordAdd(@NotNull DailyRecordItem record) {
        Intrinsics.checkNotNullParameter(record, "record");
        if (record instanceof ValidStandItem) {
            FitnessDataRecorder dbWriter = getDbWriter();
            String sid = record.getSid();
            Intrinsics.checkNotNull(sid);
            dbWriter.recordValidStand(sid, getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond(), record);
        }
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyStandReport> getBiz$fitness_data_core_chinaProductRelease() {
        return this.standBiz;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.VALID_STAND;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<DailyStandReport>) list);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IStandRepository
    @NotNull
    public Flow<List<ValidStandItem>> queryStandRecords(long startTime, long endTime) {
        Pair<Long, Long> pairNormalizeTime = TimeZoneUtil.INSTANCE.normalizeTime(startTime, endTime);
        final Flow<List<StandRecordEntity>> flowQueryStandRecords = getDbInstance$fitness_data_core_chinaProductRelease().standRecordItemDao().queryStandRecords(pairNormalizeTime.getFirst().longValue(), pairNormalizeTime.getSecond().longValue());
        return FlowKt.flowOn(new Flow<List<? extends ValidStandItem>>() { // from class: com.xiaomi.fitness.repo.stand.StandRepository$queryStandRecords$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.repo.stand.StandRepository$queryStandRecords$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 StandRepository.kt\ncom/xiaomi/fitness/repo/stand/StandRepository\n*L\n1#1,222:1\n54#2:223\n72#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.repo.stand.StandRepository$queryStandRecords$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.repo.stand.StandRepository$queryStandRecords$$inlined$map$1$2", f = "StandRepository.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
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
                        List listConvertEntityToItemList$default = ItemEntityUtil.convertEntityToItemList$default(ItemEntityUtil.INSTANCE, (List) obj, ValidStandItem.class, null, 4, null);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(listConvertEntityToItemList$default, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super List<? extends ValidStandItem>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowQueryStandRecords.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO());
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IStandRepository
    @NotNull
    public List<ValidStandItem> queryStandRecordsSync(long startTime, long endTime) {
        Map<String, List<DailyRecordItem>> allDailyRecord = getDbGetter().getAllDailyRecord(HomeDataType.VALID_STAND, null, startTime, endTime, FitnessDateUtils.getCurrentTZOffsetInSec());
        ArrayList arrayList = new ArrayList();
        List<DailyRecordItem> list = allDailyRecord.get(FitnessPersistKey.ValidStand);
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r8.equals("weeks") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r8.equals("months") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        r4 = new java.util.ArrayList();
        r7 = r11.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r7.hasNext() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        r11 = r7.next();
        r5 = r5 + r11.getStandCount();
        r4.add(new com.xiaomi.fit.fitness.export.data.aggregation.record.StandRecord(r11.getTime(), r11.getStandCount()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        return new com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport(r9, r8, r4, r5);
     */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport mergeTargetReport(@org.jetbrains.annotations.Nullable java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, long r9, @org.jetbrains.annotations.NotNull java.util.List<com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport> r11) {
        /*
            r6 = this;
            java.lang.String r7 = "viewTag"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
            java.lang.String r7 = "srcReportList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r7)
            r7 = r11
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L19
            com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport r7 = new com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport
            r7.<init>(r8, r9)
            return r7
        L19:
            int r7 = r8.hashCode()
            r0 = -1068487181(0xffffffffc0502df3, float:-3.2528045)
            r1 = 0
            if (r7 == r0) goto L46
            r0 = 3076183(0x2ef057, float:4.31065E-39)
            if (r7 == r0) goto L37
            r0 = 113008383(0x6bc5eff, float:7.0857324E-35)
            if (r7 == r0) goto L2e
            goto L4e
        L2e:
            java.lang.String r7 = "weeks"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L54
            goto L4e
        L37:
            java.lang.String r7 = "days"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L4e
            java.lang.Object r7 = r11.get(r1)
            com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport r7 = (com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport) r7
            return r7
        L46:
            java.lang.String r7 = "months"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L54
        L4e:
            com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport r7 = new com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport
            r7.<init>(r8, r9)
            return r7
        L54:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r7 = r11.iterator()
            r5 = r1
        L5e:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L80
            java.lang.Object r11 = r7.next()
            com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport r11 = (com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport) r11
            int r0 = r11.getStandCount()
            int r5 = r5 + r0
            com.xiaomi.fit.fitness.export.data.aggregation.record.StandRecord r0 = new com.xiaomi.fit.fitness.export.data.aggregation.record.StandRecord
            long r1 = r11.getTime()
            int r11 = r11.getStandCount()
            r0.<init>(r1, r11)
            r4.add(r0)
            goto L5e
        L80:
            com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport r7 = new com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport
            r0 = r7
            r1 = r9
            r3 = r8
            r0.<init>(r1, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.repo.stand.StandRepository.mergeTargetReport(java.lang.String, java.lang.String, long, java.util.List):com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport");
    }
}
