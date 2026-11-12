package com.xiaomi.fitness.repo.stress;

import androidx.paging.PagingSource;
import com.xiaomi.fit.fitness.export.api.repository.IStressRepository;
import com.xiaomi.fit.fitness.export.api.repository.PagingSourceParams;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0010¢\u0006\u0002\b\nJ!\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0014¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J4\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0016J\u001e\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001f0\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J0\u0010 \u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u00192\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00132\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016J\b\u0010%\u001a\u00020&H\u0016J@\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001a0\u00182\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0096@¢\u0006\u0002\u0010,R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/repo/stress/StressRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IStressRepository;", "<init>", "()V", "stressBiz", "Lcom/xiaomi/fitness/repo/stress/StressBiz;", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "doDeleteRecord", "", "records", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "([Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "getAllStressAbnormalRecords", "Landroidx/paging/PagingSource;", "", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "getAllDataByTime", "", "", "", "startTime", "endTime", "did", "getAllRecordDetailPagingSource", "Lcom/xiaomi/fit/fitness/export/data/item/StressItem;", "mergeTargetReport", "sid", CloudContract.COL_VIEW_TAG, "startTimestamp", "srcReportList", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getManualStressByMonthGroup", "limit", "", "reverse", "", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStressRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressRepository.kt\ncom/xiaomi/fitness/repo/stress/StressRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,132:1\n1863#2:133\n1864#2:136\n13423#3,2:134\n*S KotlinDebug\n*F\n+ 1 StressRepository.kt\ncom/xiaomi/fitness/repo/stress/StressRepository\n*L\n91#1:133\n91#1:136\n93#1:134,2\n*E\n"})
public final class StressRepository extends BaseRepository<DailyStressReport> implements IStressRepository {

    @NotNull
    private final StressBiz stressBiz = new StressBiz();

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.stress.StressRepository$getManualStressByMonthGroup$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.stress.StressRepository", f = "StressRepository.kt", i = {0}, l = {125}, m = "getManualStressByMonthGroup", n = {"this"}, s = {"L$0"})
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
            return StressRepository.this.getManualStressByMonthGroup(0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mergeTargetReport$lambda$0(DailyStressReport it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getMaxStress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mergeTargetReport$lambda$1(DailyStressReport it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getMinStress();
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doDeleteRecord(@NotNull DailyRecordItem... records) {
        Intrinsics.checkNotNullParameter(records, "records");
        String str = "";
        for (DailyRecordItem dailyRecordItem : records) {
            if (dailyRecordItem instanceof StressItem) {
                str = FitnessPersistKey.ManualStress;
            } else if (dailyRecordItem instanceof SegmentItem) {
                str = FitnessPersistKey.AbnormalStress;
            }
        }
        if (str.length() == 0) {
            return;
        }
        getDbWriter().deleteDailyItems(str, (DailyRecordItem[]) Arrays.copyOf(records, records.length));
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IStressRepository
    @NotNull
    public Map<String, List<DailyRecordItem>> getAllDataByTime(long startTime, long endTime, @Nullable String did) {
        return getDbGetter().getAllDailyRecord(getDataType(), did, startTime, endTime, getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond());
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IPagingSourceRepository
    @NotNull
    public PagingSource<Long, StressItem> getAllRecordDetailPagingSource(@Nullable PagingSourceParams params) {
        return new ManualStressDataSource(params);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IStressRepository
    @NotNull
    public PagingSource<Long, SegmentItem> getAllStressAbnormalRecords(@Nullable PagingSourceParams params) {
        return new StressAbnormalDataSource(params);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyStressReport> getBiz$fitness_data_core_chinaProductRelease() {
        return this.stressBiz;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.STRESS;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.IStressRepository
    @Nullable
    public Object getManualStressByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<StressItem>>> continuation) {
        AnonymousClass1 anonymousClass1;
        StressRepository stressRepository;
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
        Object limitedDataRecord = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass2.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(limitedDataRecord);
            DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
            int curTimeZoneOffsetInSecond = getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
            anonymousClass2.L$0 = this;
            anonymousClass2.label = 1;
            limitedDataRecord = dailyRecordDaoUtils.getLimitedDataRecord(FitnessPersistKey.ManualStress, (String) null, j, j2, curTimeZoneOffsetInSecond, i, z, anonymousClass2);
            if (limitedDataRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
            stressRepository = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stressRepository = (StressRepository) anonymousClass2.L$0;
            ResultKt.throwOnFailure(limitedDataRecord);
        }
        Object objGroupByMonth = stressRepository.getBiz$fitness_data_core_chinaProductRelease().groupByMonth((List) limitedDataRecord);
        Intrinsics.checkNotNull(objGroupByMonth, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Long, kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.StressItem>>");
        return objGroupByMonth;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<DailyStressReport>) list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r22.equals("weeks") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r22.equals("months") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        r5 = (java.lang.Integer) com.xiaomi.fitness.common.extensions.ListExtKt.maxOfOrDefault(r25, 0, new defpackage.qko());
        r6 = (java.lang.Integer) com.xiaomi.fitness.common.extensions.ListExtKt.minOfOrDefault(r25, 0, new defpackage.rko());
        r12 = new java.util.ArrayList();
        r0 = r25.iterator();
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r13 = 0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if (r0.hasNext() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        r15 = r0.next();
        r13 = r13 + 1;
        r14 = r14 + r15.getAvgStress();
        r7 = new java.util.ArrayList();
        r17 = r15.getStressRecords().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
    
        if (r17.hasNext() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        r25 = r0;
        r0 = ((com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt) r17.next()).getValueArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
    
        if (r0 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
    
        r1 = r0.length;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
    
        if (r2 >= r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
    
        r18 = r0[r2];
        r19 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
    
        if (r18 <= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
    
        if (r7.contains(java.lang.Integer.valueOf(r18)) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
    
        r7.add(java.lang.Integer.valueOf(r18));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
    
        r2 = r2 + 1;
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e6, code lost:
    
        r0 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00eb, code lost:
    
        r12.add(new com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt(r15.getTime(), kotlin.collections.CollectionsKt___CollectionsKt.toIntArray(r7)));
        r8 = r8 + r15.getDurationHeavyStress();
        r9 = r9 + r15.getDurationMediumStress();
        r10 = r10 + r15.getDurationLightStress();
        r11 = r11 + r15.getDurationRelaxStress();
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0118, code lost:
    
        if (r13 <= 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
    
        r14 = r14 / r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011c, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011d, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r21);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r5);
        r7 = r5.intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0143, code lost:
    
        return new com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport(r23, r22, r21, r14, r7, r6.intValue(), r8, r9, r10, r11, r12, kotlin.collections.CollectionsKt__CollectionsKt.emptyList());
     */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport mergeTargetReport(@org.jetbrains.annotations.Nullable java.lang.String r21, @org.jetbrains.annotations.NotNull java.lang.String r22, long r23, @org.jetbrains.annotations.NotNull java.util.List<com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport> r25) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.repo.stress.StressRepository.mergeTargetReport(java.lang.String, java.lang.String, long, java.util.List):com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport");
    }
}
