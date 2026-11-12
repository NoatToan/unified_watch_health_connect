package com.xiaomi.fitness.repo.heartrate;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.paging.PagingSource;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository;
import com.xiaomi.fit.fitness.export.api.repository.PagingSourceParams;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalHrItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.LactateThresholdItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import com.xiaomi.fitness.repo.heartrate.HeartRateRepository;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001e\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001e\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00140\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001e\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00140\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001e\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0010¢\u0006\u0002\b\u001eJ!\u0010\u001f\u001a\u00020\u00192\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0!\"\u00020\u001bH\u0014¢\u0006\u0002\u0010\"J0\u0010#\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u000b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020)H\u0016J\b\u0010*\u001a\u00020+H\u0016J@\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170)0-2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0096@¢\u0006\u0002\u00104J@\u00105\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140)0-2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0096@¢\u0006\u0002\u00104J@\u00106\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140)0-2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0096@¢\u0006\u0002\u00104J@\u00107\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0)0-2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0096@¢\u0006\u0002\u00104J@\u00108\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002090)0-2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0096@¢\u0006\u0002\u00104JH\u0010:\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0)0-2\u0006\u0010;\u001a\u00020%2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0082@¢\u0006\u0002\u0010<R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/repo/heartrate/HeartRateRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IHeartRateRepository;", "<init>", "()V", "hrBiz", "Lcom/xiaomi/fitness/repo/heartrate/HeartRateBiz;", "getMonthRestHrReport", "Landroidx/lifecycle/LiveData;", "rightDayTimeStamp", "", "getAllAbnormalFibDetailPagingSource", "Landroidx/paging/PagingSource;", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalFibItem;", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "getAllAbnormalHrDetailPagingSource", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalHrItem;", "getAllAbnormalHrHighDetailPagingSource", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "getAllAbnormalHrLowDetailPagingSource", "getAllRecordDetailPagingSource", "Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "doRecordAdd", "", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "doDeleteRecord", "records", "", "([Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "mergeTargetReport", "sid", "", CloudContract.COL_VIEW_TAG, "startTimestamp", "srcReportList", "", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getManualHrByMonthGroup", "", "startTime", "endTime", "limit", "", "reverse", "", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getManualAbnormalHrHighByMonthGroup", "getManualAbnormalHrLowByMonthGroup", "getManualAbnormalFibByMonthGroup", "getLactateThresholdFibByMonthGroup", "Lcom/xiaomi/fit/fitness/export/data/item/LactateThresholdItem;", "getRecordByMonthGroup", "persistKey", "(Ljava/lang/String;JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHeartRateRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRateRepository.kt\ncom/xiaomi/fitness/repo/heartrate/HeartRateRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,222:1\n1#2:223\n1863#3:224\n1864#3:227\n13423#4,2:225\n*S KotlinDebug\n*F\n+ 1 HeartRateRepository.kt\ncom/xiaomi/fitness/repo/heartrate/HeartRateRepository\n*L\n140#1:224\n140#1:227\n142#1:225,2\n*E\n"})
public final class HeartRateRepository extends BaseRepository<DailyHrReport> implements IHeartRateRepository {

    @NotNull
    private final HeartRateBiz hrBiz = new HeartRateBiz();

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.heartrate.HeartRateRepository$getLactateThresholdFibByMonthGroup$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.heartrate.HeartRateRepository", f = "HeartRateRepository.kt", i = {}, l = {207}, m = "getLactateThresholdFibByMonthGroup", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
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
            return HeartRateRepository.this.getLactateThresholdFibByMonthGroup(0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.heartrate.HeartRateRepository$getManualAbnormalFibByMonthGroup$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.heartrate.HeartRateRepository", f = "HeartRateRepository.kt", i = {}, l = {SportReportBaseParser.ReportType.oxygenConcentration}, m = "getManualAbnormalFibByMonthGroup", n = {}, s = {})
    public static final class C28261 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C28261(Continuation<? super C28261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HeartRateRepository.this.getManualAbnormalFibByMonthGroup(0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.heartrate.HeartRateRepository$getManualAbnormalHrHighByMonthGroup$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.heartrate.HeartRateRepository", f = "HeartRateRepository.kt", i = {}, l = {180}, m = "getManualAbnormalHrHighByMonthGroup", n = {}, s = {})
    public static final class C28271 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C28271(Continuation<? super C28271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HeartRateRepository.this.getManualAbnormalHrHighByMonthGroup(0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.heartrate.HeartRateRepository$getManualAbnormalHrLowByMonthGroup$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.heartrate.HeartRateRepository", f = "HeartRateRepository.kt", i = {}, l = {SportReportBaseParser.ReportType.avgDescentRate}, m = "getManualAbnormalHrLowByMonthGroup", n = {}, s = {})
    public static final class C28281 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C28281(Continuation<? super C28281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HeartRateRepository.this.getManualAbnormalHrLowByMonthGroup(0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.heartrate.HeartRateRepository$getManualHrByMonthGroup$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.heartrate.HeartRateRepository", f = "HeartRateRepository.kt", i = {}, l = {172}, m = "getManualHrByMonthGroup", n = {}, s = {})
    public static final class C28291 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C28291(Continuation<? super C28291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HeartRateRepository.this.getManualHrByMonthGroup(0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.heartrate.HeartRateRepository$getRecordByMonthGroup$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.heartrate.HeartRateRepository", f = "HeartRateRepository.kt", i = {0}, l = {215}, m = "getRecordByMonthGroup", n = {"this"}, s = {"L$0"})
    public static final class C28301 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C28301(Continuation<? super C28301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HeartRateRepository.this.getRecordByMonthGroup(null, 0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DailyHrReport getMonthRestHrReport$lambda$0(HeartRateRepository this$0, long j, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        DailyHrReport dailyHrReportMergeTargetReport = this$0.mergeTargetReport((String) null, "months", j, (List<DailyHrReport>) it);
        dailyHrReportMergeTargetReport.setHrReportList(it);
        return dailyHrReportMergeTargetReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final Object getRecordByMonthGroup(String str, long j, long j2, int i, boolean z, Continuation<? super Map<Long, ? extends List<? extends DailyRecordItem>>> continuation) {
        C28301 c28301;
        HeartRateRepository heartRateRepository;
        if (continuation instanceof C28301) {
            c28301 = (C28301) continuation;
            int i2 = c28301.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28301.label = i2 - Integer.MIN_VALUE;
            } else {
                c28301 = new C28301(continuation);
            }
        } else {
            c28301 = new C28301(continuation);
        }
        C28301 c28302 = c28301;
        Object limitedDataRecord = c28302.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c28302.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(limitedDataRecord);
            DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
            int curTimeZoneOffsetInSecond = getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
            c28302.L$0 = this;
            c28302.label = 1;
            limitedDataRecord = dailyRecordDaoUtils.getLimitedDataRecord(str, (String) null, j, j2, curTimeZoneOffsetInSecond, i, z, c28302);
            if (limitedDataRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
            heartRateRepository = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            heartRateRepository = (HeartRateRepository) c28302.L$0;
            ResultKt.throwOnFailure(limitedDataRecord);
        }
        return heartRateRepository.getBiz$fitness_data_core_chinaProductRelease().groupByMonth((List) limitedDataRecord);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mergeTargetReport$lambda$1(DailyHrReport it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getMaxHr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mergeTargetReport$lambda$2(DailyHrReport it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getMinHr();
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doDeleteRecord(@NotNull DailyRecordItem... records) {
        Intrinsics.checkNotNullParameter(records, "records");
        String str = "";
        for (DailyRecordItem dailyRecordItem : records) {
            if (dailyRecordItem instanceof HrItem) {
                str = FitnessPersistKey.ManualHr;
                break;
            }
            if (dailyRecordItem instanceof SegmentItem) {
                String dbKey = dailyRecordItem.getDbKey();
                if (dbKey == null) {
                    dbKey = "unknown";
                }
                str = dbKey;
                break;
            }
            if (dailyRecordItem instanceof AbnormalFibItem) {
                str = "abnormal_heart_beat";
            } else if (dailyRecordItem instanceof LactateThresholdItem) {
                str = "lactate_threshold";
            }
        }
        if (str.length() == 0) {
            return;
        }
        getDbWriter().deleteDailyItems(str, (DailyRecordItem[]) Arrays.copyOf(records, records.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doRecordAdd(@NotNull DailyRecordItem record) {
        Intrinsics.checkNotNullParameter(record, "record");
        if (record instanceof HrItem) {
            FitnessDataRecorder dbWriter = getDbWriter();
            String sid = record.getSid();
            Intrinsics.checkNotNull(sid);
            dbWriter.recordManualHr(sid, getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond(), record);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository
    @NotNull
    public PagingSource<Long, AbnormalFibItem> getAllAbnormalFibDetailPagingSource(@Nullable PagingSourceParams params) {
        return new HeartRateAbnormalFibDataSource(params);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository
    @NotNull
    public PagingSource<Long, AbnormalHrItem> getAllAbnormalHrDetailPagingSource(@Nullable PagingSourceParams params) {
        return new HeartRateAbnormalHrDataSource(params);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository
    @NotNull
    public PagingSource<Long, SegmentItem> getAllAbnormalHrHighDetailPagingSource(@Nullable PagingSourceParams params) {
        return new HeartRateAbnormalHighDataSource(params);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository
    @NotNull
    public PagingSource<Long, SegmentItem> getAllAbnormalHrLowDetailPagingSource(@Nullable PagingSourceParams params) {
        return new HeartRateAbnormalLowDataSource(params);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IPagingSourceRepository
    @NotNull
    public PagingSource<Long, HrItem> getAllRecordDetailPagingSource(@Nullable PagingSourceParams params) {
        return new HeartRateRecordDetailDataSource(params);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyHrReport> getBiz$fitness_data_core_chinaProductRelease() {
        return this.hrBiz;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.HR;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository
    @Nullable
    public Object getLactateThresholdFibByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<LactateThresholdItem>>> continuation) {
        AnonymousClass1 anonymousClass1;
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
        Object recordByMonthGroup = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass2.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(recordByMonthGroup);
            anonymousClass2.label = 1;
            recordByMonthGroup = getRecordByMonthGroup("lactate_threshold", j, j2, i, z, anonymousClass2);
            if (recordByMonthGroup == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(recordByMonthGroup);
        }
        Intrinsics.checkNotNull(recordByMonthGroup, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Long, kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.LactateThresholdItem>>");
        return (Map) recordByMonthGroup;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository
    @Nullable
    public Object getManualAbnormalFibByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<AbnormalFibItem>>> continuation) {
        C28261 c28261;
        if (continuation instanceof C28261) {
            c28261 = (C28261) continuation;
            int i2 = c28261.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28261.label = i2 - Integer.MIN_VALUE;
            } else {
                c28261 = new C28261(continuation);
            }
        } else {
            c28261 = new C28261(continuation);
        }
        C28261 c28262 = c28261;
        Object recordByMonthGroup = c28262.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c28262.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(recordByMonthGroup);
            c28262.label = 1;
            recordByMonthGroup = getRecordByMonthGroup("abnormal_heart_beat", j, j2, i, z, c28262);
            if (recordByMonthGroup == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(recordByMonthGroup);
        }
        Intrinsics.checkNotNull(recordByMonthGroup, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Long, kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem>>");
        return (Map) recordByMonthGroup;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository
    @Nullable
    public Object getManualAbnormalHrHighByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<SegmentItem>>> continuation) {
        C28271 c28271;
        if (continuation instanceof C28271) {
            c28271 = (C28271) continuation;
            int i2 = c28271.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28271.label = i2 - Integer.MIN_VALUE;
            } else {
                c28271 = new C28271(continuation);
            }
        } else {
            c28271 = new C28271(continuation);
        }
        C28271 c28272 = c28271;
        Object recordByMonthGroup = c28272.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c28272.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(recordByMonthGroup);
            c28272.label = 1;
            recordByMonthGroup = getRecordByMonthGroup("high_heart_rate", j, j2, i, z, c28272);
            if (recordByMonthGroup == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(recordByMonthGroup);
        }
        Intrinsics.checkNotNull(recordByMonthGroup, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Long, kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.AbnormalRecordItem>>");
        return (Map) recordByMonthGroup;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository
    @Nullable
    public Object getManualAbnormalHrLowByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<SegmentItem>>> continuation) {
        C28281 c28281;
        if (continuation instanceof C28281) {
            c28281 = (C28281) continuation;
            int i2 = c28281.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28281.label = i2 - Integer.MIN_VALUE;
            } else {
                c28281 = new C28281(continuation);
            }
        } else {
            c28281 = new C28281(continuation);
        }
        C28281 c28282 = c28281;
        Object recordByMonthGroup = c28282.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c28282.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(recordByMonthGroup);
            c28282.label = 1;
            recordByMonthGroup = getRecordByMonthGroup(FitnessPersistKey.AbnormalHrLow, j, j2, i, z, c28282);
            if (recordByMonthGroup == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(recordByMonthGroup);
        }
        Intrinsics.checkNotNull(recordByMonthGroup, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Long, kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.AbnormalRecordItem>>");
        return (Map) recordByMonthGroup;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository
    @Nullable
    public Object getManualHrByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<HrItem>>> continuation) {
        C28291 c28291;
        if (continuation instanceof C28291) {
            c28291 = (C28291) continuation;
            int i2 = c28291.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28291.label = i2 - Integer.MIN_VALUE;
            } else {
                c28291 = new C28291(continuation);
            }
        } else {
            c28291 = new C28291(continuation);
        }
        C28291 c28292 = c28291;
        Object recordByMonthGroup = c28292.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c28292.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(recordByMonthGroup);
            c28292.label = 1;
            recordByMonthGroup = getRecordByMonthGroup(FitnessPersistKey.ManualHr, j, j2, i, z, c28292);
            if (recordByMonthGroup == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(recordByMonthGroup);
        }
        Intrinsics.checkNotNull(recordByMonthGroup, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Long, kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.HrItem>>");
        return (Map) recordByMonthGroup;
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository
    @NotNull
    public LiveData<DailyHrReport> getMonthRestHrReport(final long rightDayTimeStamp) {
        return Transformations.map(getReportList(null, "days", rightDayTimeStamp, 29, 0, false), new Function1() { // from class: n6c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HeartRateRepository.getMonthRestHrReport$lambda$0(this.f27591a, rightDayTimeStamp, (List) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<DailyHrReport>) list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r19.equals("weeks") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r19.equals("months") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        r4 = (java.lang.Integer) com.xiaomi.fitness.common.extensions.ListExtKt.maxOfOrDefault(r22, 0, new defpackage.o6c());
        r5 = (java.lang.Integer) com.xiaomi.fitness.common.extensions.ListExtKt.minOfOrDefault(r22, 0, new defpackage.p6c());
        r8 = new java.util.ArrayList();
        r10 = new java.util.ArrayList();
        r0 = r22.iterator();
        r7 = 0;
        r9 = 0;
        r11 = 0;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        if (r0.hasNext() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
    
        r13 = r0.next();
        r14 = r13.getRestHr();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        if (r14 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        r14 = r14.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
    
        r14 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        if (r14 <= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
    
        r14 = r14;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bb, code lost:
    
        r14 = r14;
        r15 = r13.getAvgHr();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
    
        if (r15 <= 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
    
        r9 = r9 + r14;
        r12 = r12 + r15;
        r14 = r13.getAbnormalHrRecords();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
    
        if (r14 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cb, code lost:
    
        r10.addAll(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        r14 = new java.util.ArrayList();
        r15 = r13.getHrRecords().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        if (r15.hasNext() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e5, code lost:
    
        r6 = ((com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt) r15.next()).getValueArray();
        r22 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f1, code lost:
    
        if (r6 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f3, code lost:
    
        r0 = r6.length;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f5, code lost:
    
        if (r1 >= r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f7, code lost:
    
        r2 = r6[r1];
        r16 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:
    
        if (r14.contains(java.lang.Integer.valueOf(r2)) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0105, code lost:
    
        r14.add(java.lang.Integer.valueOf(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010c, code lost:
    
        r1 = r1 + 1;
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0111, code lost:
    
        r8.add(new com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt(r13.getTime(), kotlin.collections.CollectionsKt___CollectionsKt.toIntArray(r14)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0121, code lost:
    
        r0 = r22;
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012b, code lost:
    
        if (r7 <= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012d, code lost:
    
        r9 = r9 / r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012f, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0130, code lost:
    
        if (r11 <= 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0132, code lost:
    
        r12 = r12 / r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0134, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0137, code lost:
    
        if (r9 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0139, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013a, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013c, code lost:
    
        r0 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0141, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
        r7 = r4.intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
    
        return new com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport(r20, r19, r6, r12, r7, r5.intValue(), r8, kotlin.collections.CollectionsKt__CollectionsKt.emptyList(), r10, kotlin.collections.CollectionsKt__CollectionsKt.emptyList());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport mergeTargetReport(@org.jetbrains.annotations.Nullable java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, long r20, @org.jetbrains.annotations.NotNull java.util.List<com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport> r22) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.repo.heartrate.HeartRateRepository.mergeTargetReport(java.lang.String, java.lang.String, long, java.util.List):com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport");
    }
}
