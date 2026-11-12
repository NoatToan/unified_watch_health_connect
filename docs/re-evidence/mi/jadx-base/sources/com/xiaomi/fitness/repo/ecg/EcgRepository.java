package com.xiaomi.fitness.repo.ecg;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.paging.PagingSource;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.repository.IEcgRepository;
import com.xiaomi.fit.fitness.export.api.repository.PagingSourceParams;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyEcgReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import com.xiaomi.fitness.repo.ecg.EcgRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0010¢\u0006\u0002\b\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016JF\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J0\u0010\u001e\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00182\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016J\u001e\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020#0\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001e\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020#0\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001e\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020#0\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0014J\u001d\u0010,\u001a\u00020)2\u000e\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0.H\u0014¢\u0006\u0002\u0010/J\u001a\u00100\u001a\u0004\u0018\u00010#2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u0018H\u0016J@\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u0013032\u0006\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001dH\u0096@¢\u0006\u0002\u00108J@\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u0013032\u0006\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001dH\u0096@¢\u0006\u0002\u00108J@\u0010:\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u0013032\u0006\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001dH\u0096@¢\u0006\u0002\u00108R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/repo/ecg/EcgRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEcgReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IEcgRepository;", "<init>", "()V", "ecgBiz", "Lcom/xiaomi/fitness/repo/ecg/EcgBiz;", "getEcgBiz", "()Lcom/xiaomi/fitness/repo/ecg/EcgBiz;", "ecgBiz$delegate", "Lkotlin/Lazy;", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getReportList", "Landroidx/lifecycle/LiveData;", "", "sid", "", CloudContract.COL_VIEW_TAG, "beginInSecond", "", "leftOffset", "", "rightOffset", "syncNet", "", "mergeTargetReport", "startTimestamp", "srcReportList", "getAllEcgReport", "Landroidx/paging/PagingSource;", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "getInterpretedEcgReport", "getNotInterpretedEcgReport", "doRecordAdd", "", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "doDeleteRecord", "records", "", "([Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "getTheEcgReport", "time", "getAllEcgByMonthGroup", "", "startTime", "endTime", "limit", "reverse", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInterpretedEcgByMonthGroup", "getNotInterpretedEcgByMonthGroup", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcgRepository extends BaseRepository<DailyEcgReport> implements IEcgRepository {

    /* JADX INFO: renamed from: ecgBiz$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ecgBiz = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xb7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcgRepository.ecgBiz_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.ecg.EcgRepository$getAllEcgByMonthGroup$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.ecg.EcgRepository", f = "EcgRepository.kt", i = {0}, l = {97}, m = "getAllEcgByMonthGroup", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcgRepository.this.getAllEcgByMonthGroup(0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.ecg.EcgRepository$getInterpretedEcgByMonthGroup$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.ecg.EcgRepository", f = "EcgRepository.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {107, 112}, m = "getInterpretedEcgByMonthGroup", n = {"this", "startTime", "endTime", "limit", "reverse", "this", "interpretedList", "limit", "reverse"}, s = {"L$0", "J$0", "J$1", "I$0", "Z$0", "L$0", "L$1", "I$0", "Z$0"})
    public static final class C28041 extends ContinuationImpl {
        int I$0;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C28041(Continuation<? super C28041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcgRepository.this.getInterpretedEcgByMonthGroup(0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.ecg.EcgRepository$getNotInterpretedEcgByMonthGroup$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.ecg.EcgRepository", f = "EcgRepository.kt", i = {0}, l = {132}, m = "getNotInterpretedEcgByMonthGroup", n = {"this"}, s = {"L$0"})
    public static final class C28051 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C28051(Continuation<? super C28051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcgRepository.this.getNotInterpretedEcgByMonthGroup(0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcgBiz ecgBiz_delegate$lambda$0() {
        return new EcgBiz();
    }

    private final EcgBiz getEcgBiz() {
        return (EcgBiz) this.ecgBiz.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getInterpretedEcgByMonthGroup$lambda$2(EcgMedicalItemReport ecgMedicalItemReport, EcgMedicalItemReport ecgMedicalItemReport2) {
        return (int) (ecgMedicalItemReport2.getTimestamp() - ecgMedicalItemReport.getTimestamp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getInterpretedEcgByMonthGroup$lambda$3(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getInterpretedEcgByMonthGroup$lambda$4(EcgMedicalItemReport ecgMedicalItemReport, EcgMedicalItemReport ecgMedicalItemReport2) {
        return (int) (ecgMedicalItemReport.getTimestamp() - ecgMedicalItemReport2.getTimestamp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getInterpretedEcgByMonthGroup$lambda$5(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getReportList$lambda$1(EcgRepository this$0, String str, String viewTag, long j, Map it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewTag, "$viewTag");
        Intrinsics.checkNotNullParameter(it, "it");
        List listSingletonList = Collections.singletonList(this$0.getEcgBiz().splitDailyReport(str, viewTag, j, (Map<String, ? extends List<? extends DailyRecordItem>>) it));
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doDeleteRecord(@NotNull DailyRecordItem[] records) {
        Intrinsics.checkNotNullParameter(records, "records");
        getDbWriter().deleteEcg((DailyRecordItem[]) Arrays.copyOf(records, records.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doRecordAdd(@NotNull DailyRecordItem record) {
        Intrinsics.checkNotNullParameter(record, "record");
        if (!(record instanceof EcgMedicalItemReport) || record.getSid() == null) {
            return;
        }
        FitnessDataRecorder dbWriter = getDbWriter();
        String sid = record.getSid();
        Intrinsics.checkNotNull(sid);
        dbWriter.recordEcgItemReport(sid, getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond(), record);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.IEcgRepository
    @Nullable
    public Object getAllEcgByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<EcgMedicalItemReport>>> continuation) {
        AnonymousClass1 anonymousClass1;
        EcgRepository ecgRepository;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object theEcgRecord = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass2.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(theEcgRecord);
            DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
            int curTimeZoneOffsetInSecond = getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
            anonymousClass2.L$0 = this;
            anonymousClass2.label = 1;
            theEcgRecord = dailyRecordDaoUtils.getTheEcgRecord(FitnessPersistKey.EcgMedical, null, null, j, j2, curTimeZoneOffsetInSecond, i, z, anonymousClass2);
            if (theEcgRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
            ecgRepository = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ecgRepository = (EcgRepository) anonymousClass2.L$0;
            ResultKt.throwOnFailure(theEcgRecord);
        }
        Intrinsics.checkNotNull(theEcgRecord, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport>");
        return ecgRepository.getBiz$fitness_data_core_chinaProductRelease().groupByMonth((List) theEcgRecord);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IEcgRepository
    @NotNull
    public PagingSource<Long, EcgMedicalItemReport> getAllEcgReport(@Nullable PagingSourceParams params) {
        return new AllEcgDataSource(params);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyEcgReport> getBiz$fitness_data_core_chinaProductRelease() {
        return getEcgBiz();
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.ECG_MEDICAL;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:27:0x0105  */
    /* JADX WARN: Code duplicated, block: B:30:0x0118  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.IEcgRepository
    @Nullable
    public Object getInterpretedEcgByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<EcgMedicalItemReport>>> continuation) {
        C28041 c28041;
        int i2;
        Object theEcgRecord;
        EcgRepository ecgRepository;
        long j3;
        long j4;
        boolean z2;
        int i3;
        List list;
        EcgRepository ecgRepository2;
        boolean z3;
        List arrayList;
        if (continuation instanceof C28041) {
            c28041 = (C28041) continuation;
            int i4 = c28041.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c28041.label = i4 - Integer.MIN_VALUE;
            } else {
                c28041 = new C28041(continuation);
            }
        } else {
            c28041 = new C28041(continuation);
        }
        Object obj = c28041.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c28041.label;
        String str = "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport>";
        if (i5 != 0) {
            if (i5 == 1) {
                boolean z4 = c28041.Z$0;
                int i6 = c28041.I$0;
                long j5 = c28041.J$1;
                j3 = c28041.J$0;
                EcgRepository ecgRepository3 = (EcgRepository) c28041.L$0;
                ResultKt.throwOnFailure(obj);
                ecgRepository = ecgRepository3;
                z2 = z4;
                j4 = j5;
                theEcgRecord = obj;
                i2 = i6;
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = c28041.Z$0;
                i3 = c28041.I$0;
                list = (List) c28041.L$1;
                ecgRepository2 = (EcgRepository) c28041.L$0;
                ResultKt.throwOnFailure(obj);
                str = "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport>";
            }
            Intrinsics.checkNotNull(obj, str);
            arrayList = new ArrayList();
            arrayList.addAll(list);
            arrayList.addAll((List) obj);
            if (z3) {
                final Function2 function2 = new Function2() { // from class: zb7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return Integer.valueOf(EcgRepository.getInterpretedEcgByMonthGroup$lambda$2((EcgMedicalItemReport) obj2, (EcgMedicalItemReport) obj3));
                    }
                };
                CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: ac7
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        return EcgRepository.getInterpretedEcgByMonthGroup$lambda$3(function2, obj2, obj3);
                    }
                });
            } else {
                final Function2 function3 = new Function2() { // from class: bc7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return Integer.valueOf(EcgRepository.getInterpretedEcgByMonthGroup$lambda$4((EcgMedicalItemReport) obj2, (EcgMedicalItemReport) obj3));
                    }
                };
                CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: cc7
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        return EcgRepository.getInterpretedEcgByMonthGroup$lambda$5(function3, obj2, obj3);
                    }
                });
            }
            if (arrayList.size() > i3) {
                arrayList = arrayList.subList(0, i3);
            }
            return ecgRepository2.getBiz$fitness_data_core_chinaProductRelease().groupByMonth(arrayList);
        }
        ResultKt.throwOnFailure(obj);
        DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
        Integer numBoxInt = Boxing.boxInt(3);
        int curTimeZoneOffsetInSecond = getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
        c28041.L$0 = this;
        c28041.J$0 = j;
        c28041.J$1 = j2;
        i2 = i;
        c28041.I$0 = i2;
        c28041.Z$0 = z;
        c28041.label = 1;
        theEcgRecord = dailyRecordDaoUtils.getTheEcgRecord(FitnessPersistKey.EcgMedical, numBoxInt, null, j, j2, curTimeZoneOffsetInSecond, i, z, c28041);
        if (theEcgRecord == coroutine_suspended) {
            return coroutine_suspended;
        }
        ecgRepository = this;
        j3 = j;
        j4 = j2;
        z2 = z;
        Intrinsics.checkNotNull(theEcgRecord, str);
        List list2 = (List) theEcgRecord;
        DailyRecordDaoUtils dailyRecordDaoUtils2 = DailyRecordDaoUtils.INSTANCE;
        Integer numBoxInt2 = Boxing.boxInt(1);
        int curTimeZoneOffsetInSecond2 = ecgRepository.getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
        c28041.L$0 = ecgRepository;
        c28041.L$1 = list2;
        c28041.I$0 = i2;
        c28041.Z$0 = z2;
        c28041.label = 2;
        EcgRepository ecgRepository4 = ecgRepository;
        boolean z5 = z2;
        Object theEcgRecord2 = dailyRecordDaoUtils2.getTheEcgRecord(FitnessPersistKey.EcgMedical, numBoxInt2, null, j3, j4, curTimeZoneOffsetInSecond2, i2, z2, c28041);
        if (theEcgRecord2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        i3 = i2;
        obj = theEcgRecord2;
        list = list2;
        ecgRepository2 = ecgRepository4;
        z3 = z5;
        Intrinsics.checkNotNull(obj, str);
        arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll((List) obj);
        if (z3) {
            final Function2 function4 = new Function2() { // from class: zb7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return Integer.valueOf(EcgRepository.getInterpretedEcgByMonthGroup$lambda$2((EcgMedicalItemReport) obj2, (EcgMedicalItemReport) obj3));
                }
            };
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: ac7
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return EcgRepository.getInterpretedEcgByMonthGroup$lambda$3(function4, obj2, obj3);
                }
            });
        } else {
            final Function2 function5 = new Function2() { // from class: bc7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return Integer.valueOf(EcgRepository.getInterpretedEcgByMonthGroup$lambda$4((EcgMedicalItemReport) obj2, (EcgMedicalItemReport) obj3));
                }
            };
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: cc7
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return EcgRepository.getInterpretedEcgByMonthGroup$lambda$5(function5, obj2, obj3);
                }
            });
        }
        if (arrayList.size() > i3) {
            arrayList = arrayList.subList(0, i3);
        }
        return ecgRepository2.getBiz$fitness_data_core_chinaProductRelease().groupByMonth(arrayList);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IEcgRepository
    @NotNull
    public PagingSource<Long, EcgMedicalItemReport> getInterpretedEcgReport(@Nullable PagingSourceParams params) {
        return new InterpretedEcgDataSource(params);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.IEcgRepository
    @Nullable
    public Object getNotInterpretedEcgByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<EcgMedicalItemReport>>> continuation) {
        C28051 c28051;
        EcgRepository ecgRepository;
        if (continuation instanceof C28051) {
            c28051 = (C28051) continuation;
            int i2 = c28051.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28051.label = i2 - Integer.MIN_VALUE;
            } else {
                c28051 = new C28051(continuation);
            }
        } else {
            c28051 = new C28051(continuation);
        }
        C28051 c28052 = c28051;
        Object theEcgRecord = c28052.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c28052.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(theEcgRecord);
            DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
            Integer numBoxInt = Boxing.boxInt(0);
            int curTimeZoneOffsetInSecond = getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
            c28052.L$0 = this;
            c28052.label = 1;
            theEcgRecord = dailyRecordDaoUtils.getTheEcgRecord(FitnessPersistKey.EcgMedical, numBoxInt, null, j, j2, curTimeZoneOffsetInSecond, i, z, c28052);
            if (theEcgRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
            ecgRepository = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ecgRepository = (EcgRepository) c28052.L$0;
            ResultKt.throwOnFailure(theEcgRecord);
        }
        Intrinsics.checkNotNull(theEcgRecord, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport>");
        return ecgRepository.getBiz$fitness_data_core_chinaProductRelease().groupByMonth((List) theEcgRecord);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IEcgRepository
    @NotNull
    public PagingSource<Long, EcgMedicalItemReport> getNotInterpretedEcgReport(@Nullable PagingSourceParams params) {
        return new NotInterpretedEcgDataSource(params);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository, com.xiaomi.fit.fitness.export.api.repository.IRepository
    @NotNull
    public LiveData<List<DailyEcgReport>> getReportList(@Nullable final String sid, @NotNull final String viewTag, long beginInSecond, int leftOffset, int rightOffset, boolean syncNet) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Calendar calendar = Calendar.getInstance();
        long j = 1000;
        calendar.setTimeInMillis(beginInSecond * j);
        TimeUtils.setToZeroOClock(calendar);
        calendar.add(5, -leftOffset);
        final long timeInMillis = calendar.getTimeInMillis() / j;
        calendar.add(5, leftOffset + rightOffset + 1);
        return Transformations.map(queryDataItemsAsync$fitness_data_core_chinaProductRelease(sid, viewTag, timeInMillis, calendar.getTimeInMillis() / j, FitnessDateUtils.getCurrentTZOffsetInSec()), new Function1() { // from class: yb7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcgRepository.getReportList$lambda$1(this.f40010a, sid, viewTag, timeInMillis, (Map) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IEcgRepository
    @Nullable
    public EcgMedicalItemReport getTheEcgReport(@NotNull String sid, long time) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        return (EcgMedicalItemReport) getDbGetter().getTheDailyRecord(FitnessPersistKey.EcgMedical, sid, time, Integer.valueOf(getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond()));
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<DailyEcgReport>) list);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public DailyEcgReport mergeTargetReport(@Nullable String sid, @NotNull String viewTag, long startTimestamp, @NotNull List<DailyEcgReport> srcReportList) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(srcReportList, "srcReportList");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
