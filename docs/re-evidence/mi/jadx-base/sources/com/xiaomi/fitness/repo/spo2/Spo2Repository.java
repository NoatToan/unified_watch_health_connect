package com.xiaomi.fitness.repo.spo2;

import androidx.paging.PagingSource;
import com.xiaomi.fit.fitness.export.api.repository.ISpo2Repository;
import com.xiaomi.fit.fitness.export.api.repository.PagingSourceParams;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
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
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0010¢\u0006\u0002\b\nJ!\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0014¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001e\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00180\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J0\u0010\u0019\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00132\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J@\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001f0#2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0096@¢\u0006\u0002\u0010*J@\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001f0#2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0096@¢\u0006\u0002\u0010*JH\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001f0#2\u0006\u0010-\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0082@¢\u0006\u0002\u0010.R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/repo/spo2/Spo2Repository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;", "Lcom/xiaomi/fit/fitness/export/api/repository/ISpo2Repository;", "<init>", "()V", "spo2Biz", "Lcom/xiaomi/fitness/repo/spo2/Spo2Biz;", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "doDeleteRecord", "", "records", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "([Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "getAllSpo2AbnormalRecords", "Landroidx/paging/PagingSource;", "", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "getAllRecordDetailPagingSource", "Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;", "mergeTargetReport", "sid", "", CloudContract.COL_VIEW_TAG, "startTimestamp", "srcReportList", "", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getManualSpo2ByMonthGroup", "", "startTime", "endTime", "limit", "", "reverse", "", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAbnormalSpo2LowByMonthGroup", "getRecordByMonthGroup", "persistKey", "(Ljava/lang/String;JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpo2Repository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spo2Repository.kt\ncom/xiaomi/fitness/repo/spo2/Spo2Repository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,131:1\n1863#2:132\n1864#2:135\n13423#3,2:133\n*S KotlinDebug\n*F\n+ 1 Spo2Repository.kt\ncom/xiaomi/fitness/repo/spo2/Spo2Repository\n*L\n80#1:132\n80#1:135\n82#1:133,2\n*E\n"})
public final class Spo2Repository extends BaseRepository<DailySpo2Report> implements ISpo2Repository {

    @NotNull
    private final Spo2Biz spo2Biz = new Spo2Biz();

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.spo2.Spo2Repository$getAbnormalSpo2LowByMonthGroup$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.spo2.Spo2Repository", f = "Spo2Repository.kt", i = {}, l = {116}, m = "getAbnormalSpo2LowByMonthGroup", n = {}, s = {})
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
            return Spo2Repository.this.getAbnormalSpo2LowByMonthGroup(0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.spo2.Spo2Repository$getManualSpo2ByMonthGroup$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.spo2.Spo2Repository", f = "Spo2Repository.kt", i = {}, l = {108}, m = "getManualSpo2ByMonthGroup", n = {}, s = {})
    public static final class C28601 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C28601(Continuation<? super C28601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Spo2Repository.this.getManualSpo2ByMonthGroup(0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.spo2.Spo2Repository$getRecordByMonthGroup$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.spo2.Spo2Repository", f = "Spo2Repository.kt", i = {0}, l = {124}, m = "getRecordByMonthGroup", n = {"this"}, s = {"L$0"})
    public static final class C28611 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C28611(Continuation<? super C28611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Spo2Repository.this.getRecordByMonthGroup(null, 0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final Object getRecordByMonthGroup(String str, long j, long j2, int i, boolean z, Continuation<? super Map<Long, ? extends List<? extends DailyRecordItem>>> continuation) {
        C28611 c28611;
        Spo2Repository spo2Repository;
        if (continuation instanceof C28611) {
            c28611 = (C28611) continuation;
            int i2 = c28611.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28611.label = i2 - Integer.MIN_VALUE;
            } else {
                c28611 = new C28611(continuation);
            }
        } else {
            c28611 = new C28611(continuation);
        }
        C28611 c28612 = c28611;
        Object limitedDataRecord = c28612.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c28612.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(limitedDataRecord);
            DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
            int curTimeZoneOffsetInSecond = getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
            c28612.L$0 = this;
            c28612.label = 1;
            limitedDataRecord = dailyRecordDaoUtils.getLimitedDataRecord(str, (String) null, j, j2, curTimeZoneOffsetInSecond, i, z, c28612);
            if (limitedDataRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
            spo2Repository = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            spo2Repository = (Spo2Repository) c28612.L$0;
            ResultKt.throwOnFailure(limitedDataRecord);
        }
        return spo2Repository.getBiz$fitness_data_core_chinaProductRelease().groupByMonth((List) limitedDataRecord);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mergeTargetReport$lambda$0(DailySpo2Report it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getMaxSpo2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mergeTargetReport$lambda$1(DailySpo2Report it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getMinSpo2();
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doDeleteRecord(@NotNull DailyRecordItem... records) {
        Intrinsics.checkNotNullParameter(records, "records");
        String str = "";
        for (DailyRecordItem dailyRecordItem : records) {
            if (dailyRecordItem instanceof Spo2Item) {
                str = FitnessPersistKey.ManualSpo2;
            } else if (dailyRecordItem instanceof SegmentItem) {
                str = "low_spo2";
            }
        }
        if (str.length() == 0) {
            return;
        }
        getDbWriter().deleteDailyItems(str, (DailyRecordItem[]) Arrays.copyOf(records, records.length));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.ISpo2Repository
    @Nullable
    public Object getAbnormalSpo2LowByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<SegmentItem>>> continuation) {
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
            recordByMonthGroup = getRecordByMonthGroup("low_spo2", j, j2, i, z, anonymousClass2);
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

    @Override // com.xiaomi.fit.fitness.export.api.repository.IPagingSourceRepository
    @NotNull
    public PagingSource<Long, Spo2Item> getAllRecordDetailPagingSource(@Nullable PagingSourceParams params) {
        return new Spo2DataSource(params);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISpo2Repository
    @NotNull
    public PagingSource<Long, SegmentItem> getAllSpo2AbnormalRecords(@Nullable PagingSourceParams params) {
        return new Spo2AbnormalLowDataSource(params);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailySpo2Report> getBiz$fitness_data_core_chinaProductRelease() {
        return this.spo2Biz;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.SPO2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.ISpo2Repository
    @Nullable
    public Object getManualSpo2ByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<Spo2Item>>> continuation) {
        C28601 c28601;
        if (continuation instanceof C28601) {
            c28601 = (C28601) continuation;
            int i2 = c28601.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28601.label = i2 - Integer.MIN_VALUE;
            } else {
                c28601 = new C28601(continuation);
            }
        } else {
            c28601 = new C28601(continuation);
        }
        C28601 c28602 = c28601;
        Object recordByMonthGroup = c28602.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c28602.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(recordByMonthGroup);
            c28602.label = 1;
            recordByMonthGroup = getRecordByMonthGroup(FitnessPersistKey.ManualSpo2, j, j2, i, z, c28602);
            if (recordByMonthGroup == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(recordByMonthGroup);
        }
        Intrinsics.checkNotNull(recordByMonthGroup, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Long, kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.Spo2Item>>");
        return (Map) recordByMonthGroup;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<DailySpo2Report>) list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r19.equals("weeks") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r19.equals("months") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        r4 = (java.lang.Integer) com.xiaomi.fitness.common.extensions.ListExtKt.maxOfOrDefault(r22, 0, new defpackage.u8n());
        r5 = (java.lang.Integer) com.xiaomi.fitness.common.extensions.ListExtKt.minOfOrDefault(r22, 0, new defpackage.v8n());
        r8 = new java.util.ArrayList();
        r0 = r22.iterator();
        r7 = 0;
        r9 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r0.hasNext() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        r11 = r0.next();
        r9 = r9 + 1;
        r10 = r10 + r11.getAvgSpo2();
        r7 = r7 + r11.getLackTimes();
        r12 = new java.util.ArrayList();
        r13 = r11.getSpo2Records().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        if (r13.hasNext() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
    
        r14 = ((com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt) r13.next()).getValueArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        if (r14 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        r15 = r14.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r6 >= r15) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        r16 = r14[r6];
        r22 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
    
        if (r12.contains(java.lang.Integer.valueOf(r16)) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
    
        r12.add(java.lang.Integer.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        r6 = r6 + 1;
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
    
        r0 = r0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e0, code lost:
    
        r8.add(new com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt(r11.getTime(), kotlin.collections.CollectionsKt___CollectionsKt.toIntArray(r12)));
        r0 = r0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        if (r9 <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
    
        r10 = r10 / r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fa, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fb, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
        r6 = r4.intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0116, code lost:
    
        return new com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report(r20, r19, r10, r6, r5.intValue(), r7, r8);
     */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report mergeTargetReport(@org.jetbrains.annotations.Nullable java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, long r20, @org.jetbrains.annotations.NotNull java.util.List<com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report> r22) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.repo.spo2.Spo2Repository.mergeTargetReport(java.lang.String, java.lang.String, long, java.util.List):com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report");
    }
}
