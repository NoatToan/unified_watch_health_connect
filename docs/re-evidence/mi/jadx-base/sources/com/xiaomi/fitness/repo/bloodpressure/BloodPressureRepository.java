package com.xiaomi.fitness.repo.bloodpressure;

import androidx.paging.PagingSource;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.repository.IBloodPressureRepository;
import com.xiaomi.fit.fitness.export.api.repository.PagingSourceParams;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import com.xiaomi.fitness.repo.bloodpressure.BloodPressureRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0010¢\u0006\u0002\b\u000eJ\b\u0010\u000f\u001a\u00020\tH\u0016J\u001e\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J!\u0010\u0016\u001a\u00020\t2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0018\"\u00020\u000bH\u0014¢\u0006\u0002\u0010\u0019J0\u0010\u001a\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00122\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0016JI\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0 0\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&H\u0010¢\u0006\u0002\b'J\b\u0010(\u001a\u00020)H\u0016J@\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130 0\"2\u0006\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020/H\u0096@¢\u0006\u0002\u00100R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/repo/bloodpressure/BloodPressureRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IBloodPressureRepository;", "<init>", "()V", "bpBiz", "Lcom/xiaomi/fitness/repo/bloodpressure/BloodPressureBiz;", "doRecordAdd", "", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "dumpRecords", "getAllRecordDetailPagingSource", "Landroidx/paging/PagingSource;", "", "Lcom/xiaomi/fit/fitness/export/data/item/BloodPressureItem;", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "doDeleteRecord", "data", "", "([Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "mergeTargetReport", "sid", "", CloudContract.COL_VIEW_TAG, "startTimestamp", "srcReportList", "", "queryDataItems", "", "beginInSecond", "endInSecond", "zoneOffsetInSec", "", "queryDataItems$fitness_data_core_chinaProductRelease", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getBloodPressureByMonthGroup", "startTime", "endTime", "limit", "reverse", "", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBloodPressureRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodPressureRepository.kt\ncom/xiaomi/fitness/repo/bloodpressure/BloodPressureRepository\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,219:1\n13423#2,2:220\n13423#2,2:222\n13423#2,2:224\n216#3,2:226\n216#3,2:228\n*S KotlinDebug\n*F\n+ 1 BloodPressureRepository.kt\ncom/xiaomi/fitness/repo/bloodpressure/BloodPressureRepository\n*L\n112#1:220,2\n121#1:222,2\n131#1:224,2\n170#1:226,2\n173#1:228,2\n*E\n"})
public final class BloodPressureRepository extends BaseRepository<DailyBloodPressureReport> implements IBloodPressureRepository {

    @NotNull
    private final BloodPressureBiz bpBiz = new BloodPressureBiz();

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.bloodpressure.BloodPressureRepository$getBloodPressureByMonthGroup$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.bloodpressure.BloodPressureRepository", f = "BloodPressureRepository.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {SportReportBaseParser.ReportType.avgDivingDepth, 192}, m = "getBloodPressureByMonthGroup", n = {"this", "startTime", "endTime", "limit", "reverse", "this", "bpList", "limit", "reverse"}, s = {"L$0", "J$0", "J$1", "I$0", "Z$0", "L$0", "L$1", "I$0", "Z$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        boolean Z$0;
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
            return BloodPressureRepository.this.getBloodPressureByMonthGroup(0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getBloodPressureByMonthGroup$lambda$13(BloodPressureItem bloodPressureItem, BloodPressureItem bloodPressureItem2) {
        return (int) (bloodPressureItem2.getTime() - bloodPressureItem.getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getBloodPressureByMonthGroup$lambda$14(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getBloodPressureByMonthGroup$lambda$15(BloodPressureItem bloodPressureItem, BloodPressureItem bloodPressureItem2) {
        return (int) (bloodPressureItem.getTime() - bloodPressureItem2.getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getBloodPressureByMonthGroup$lambda$16(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mergeTargetReport$lambda$0(DailyBloodPressureReport it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getMaxLow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mergeTargetReport$lambda$1(DailyBloodPressureReport it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getMaxHigh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mergeTargetReport$lambda$2(DailyBloodPressureReport it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getMinLow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mergeTargetReport$lambda$3(DailyBloodPressureReport it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getMinHigh();
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doDeleteRecord(@NotNull DailyRecordItem... data) {
        Intrinsics.checkNotNullParameter(data, "data");
        getDbWriter().deleteBloodPressure((DailyRecordItem[]) Arrays.copyOf(data, data.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doRecordAdd(@NotNull DailyRecordItem record) {
        Intrinsics.checkNotNullParameter(record, "record");
        if (record instanceof BloodPressureItem) {
            FitnessDataRecorder dbWriter = getDbWriter();
            String sid = record.getSid();
            Intrinsics.checkNotNull(sid);
            dbWriter.recordBloodPressure(sid, getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond(), record);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IBloodPressureRepository
    public void dumpRecords() {
        FitnessLogUtils.i(getTAG(), "dumpRecords: >>>> blood pressure");
        ArrayList<BloodPressureItem> arrayList = new ArrayList();
        for (BloodPressureItem bloodPressureItem : arrayList) {
            FitnessLogUtils.i(getTAG(), "dumpRecords: " + bloodPressureItem);
        }
        if (arrayList.isEmpty()) {
            FitnessLogUtils.i(getTAG(), "dumpRecords: blood pressure records is empty");
        }
        FitnessLogUtils.i(getTAG(), "dumpRecords: <<<<< finished blood pressure");
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IPagingSourceRepository
    @NotNull
    public PagingSource<Long, BloodPressureItem> getAllRecordDetailPagingSource(@Nullable PagingSourceParams params) {
        return new BloodPressureDataSource(params);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyBloodPressureReport> getBiz$fitness_data_core_chinaProductRelease() {
        return this.bpBiz;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x011a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0129  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.IBloodPressureRepository
    @Nullable
    public Object getBloodPressureByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<BloodPressureItem>>> continuation) {
        AnonymousClass1 anonymousClass1;
        int i2;
        Object limitedDataRecord;
        BloodPressureRepository bloodPressureRepository;
        long j3;
        long j4;
        boolean z2;
        List list;
        int i3;
        BloodPressureRepository bloodPressureRepository2;
        boolean z3;
        List list2;
        List arrayList;
        List list3;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i4 = anonymousClass1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i4 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = anonymousClass1.label;
        if (i5 != 0) {
            if (i5 == 1) {
                boolean z4 = anonymousClass1.Z$0;
                int i6 = anonymousClass1.I$0;
                long j5 = anonymousClass1.J$1;
                long j6 = anonymousClass1.J$0;
                BloodPressureRepository bloodPressureRepository3 = (BloodPressureRepository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                bloodPressureRepository = bloodPressureRepository3;
                z2 = z4;
                limitedDataRecord = obj;
                i2 = i6;
                j3 = j6;
                j4 = j5;
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = anonymousClass1.Z$0;
                i3 = anonymousClass1.I$0;
                list = (List) anonymousClass1.L$1;
                bloodPressureRepository2 = (BloodPressureRepository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.BloodPressureItem>");
            list2 = (List) obj;
            arrayList = new ArrayList();
            list3 = list;
            if (list3 != null || list3.isEmpty()) {
                Boxing.boxBoolean(arrayList.addAll(list2));
            } else {
                List list4 = list2;
                if (list4.isEmpty()) {
                    Boxing.boxBoolean(arrayList.addAll(list3));
                } else {
                    arrayList.addAll(list3);
                    arrayList.addAll(list4);
                    if (z3) {
                        final Function2 function2 = new Function2() { // from class: k03
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return Integer.valueOf(BloodPressureRepository.getBloodPressureByMonthGroup$lambda$13((BloodPressureItem) obj2, (BloodPressureItem) obj3));
                            }
                        };
                        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: l03
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                return BloodPressureRepository.getBloodPressureByMonthGroup$lambda$14(function2, obj2, obj3);
                            }
                        });
                    } else {
                        final Function2 function3 = new Function2() { // from class: m03
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return Integer.valueOf(BloodPressureRepository.getBloodPressureByMonthGroup$lambda$15((BloodPressureItem) obj2, (BloodPressureItem) obj3));
                            }
                        };
                        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: n03
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                return BloodPressureRepository.getBloodPressureByMonthGroup$lambda$16(function3, obj2, obj3);
                            }
                        });
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            if (arrayList.size() > i3) {
                arrayList = arrayList.subList(0, i3);
            }
            return bloodPressureRepository2.getBiz$fitness_data_core_chinaProductRelease().groupByMonth(arrayList);
        }
        ResultKt.throwOnFailure(obj);
        DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
        int curTimeZoneOffsetInSecond = getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
        anonymousClass1.L$0 = this;
        anonymousClass1.J$0 = j;
        anonymousClass1.J$1 = j2;
        i2 = i;
        anonymousClass1.I$0 = i2;
        anonymousClass1.Z$0 = z;
        anonymousClass1.label = 1;
        limitedDataRecord = dailyRecordDaoUtils.getLimitedDataRecord("blood_pressure", (String) null, j, j2, curTimeZoneOffsetInSecond, i, z, anonymousClass1);
        if (limitedDataRecord == coroutine_suspended) {
            return coroutine_suspended;
        }
        bloodPressureRepository = this;
        j3 = j;
        j4 = j2;
        z2 = z;
        Intrinsics.checkNotNull(limitedDataRecord, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.BloodPressureItem>");
        List list5 = (List) limitedDataRecord;
        DailyRecordDaoUtils dailyRecordDaoUtils2 = DailyRecordDaoUtils.INSTANCE;
        int curTimeZoneOffsetInSecond2 = bloodPressureRepository.getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
        anonymousClass1.L$0 = bloodPressureRepository;
        anonymousClass1.L$1 = list5;
        anonymousClass1.I$0 = i2;
        anonymousClass1.Z$0 = z2;
        anonymousClass1.label = 2;
        BloodPressureRepository bloodPressureRepository4 = bloodPressureRepository;
        boolean z5 = z2;
        Object limitedDataRecord2 = dailyRecordDaoUtils2.getLimitedDataRecord(FitnessPersistKey.BloodPressureMedical, (String) null, j3, j4, curTimeZoneOffsetInSecond2, i2, z2, anonymousClass1);
        if (limitedDataRecord2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        list = list5;
        i3 = i2;
        obj = limitedDataRecord2;
        bloodPressureRepository2 = bloodPressureRepository4;
        z3 = z5;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.BloodPressureItem>");
        list2 = (List) obj;
        arrayList = new ArrayList();
        list3 = list;
        if (list3 != null) {
            Boxing.boxBoolean(arrayList.addAll(list2));
        } else {
            Boxing.boxBoolean(arrayList.addAll(list2));
        }
        if (arrayList.size() > i3) {
            arrayList = arrayList.subList(0, i3);
        }
        return bloodPressureRepository2.getBiz$fitness_data_core_chinaProductRelease().groupByMonth(arrayList);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.BLOOD_PRESSURE;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<DailyBloodPressureReport>) list);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public Map<String, List<DailyRecordItem>> queryDataItems$fitness_data_core_chinaProductRelease(@Nullable String sid, @NotNull String viewTag, long beginInSecond, long endInSecond, int zoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, List<DailyRecordItem>> mapQueryDataItems$fitness_data_core_chinaProductRelease = super.queryDataItems$fitness_data_core_chinaProductRelease(sid, viewTag, beginInSecond, endInSecond, zoneOffsetInSec);
        Map<String, List<DailyRecordItem>> allDailyRecord = getDbGetter().getAllDailyRecord(HomeDataType.BP_MEDICAL, sid, beginInSecond, endInSecond, zoneOffsetInSec);
        for (Map.Entry<String, List<DailyRecordItem>> entry : mapQueryDataItems$fitness_data_core_chinaProductRelease.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, List<DailyRecordItem>> entry2 : allDailyRecord.entrySet()) {
            linkedHashMap.put(entry2.getKey(), entry2.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r27.equals("weeks") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r27.equals("months") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        r4 = (java.lang.Integer) com.xiaomi.fitness.common.extensions.ListExtKt.maxOfOrDefault(r30, 0, new defpackage.o03());
        r5 = (java.lang.Integer) com.xiaomi.fitness.common.extensions.ListExtKt.maxOfOrDefault(r30, 0, new defpackage.p03());
        r7 = (java.lang.Integer) com.xiaomi.fitness.common.extensions.ListExtKt.minOfOrDefault(r30, 0, new defpackage.q03());
        r8 = (java.lang.Integer) com.xiaomi.fitness.common.extensions.ListExtKt.minOfOrDefault(r30, 0, new defpackage.r03());
        r9 = new java.util.ArrayList();
        r10 = new java.util.ArrayList();
        r11 = new java.util.ArrayList();
        r14 = new java.util.ArrayList();
        r13 = new java.util.ArrayList();
        r15 = new java.util.ArrayList();
        r12 = new java.util.ArrayList();
        r0 = r30.iterator();
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r16 = 0;
        r17 = 0;
        r18 = 0;
        r19 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
    
        if (r0.hasNext() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ce, code lost:
    
        r20 = r0.next();
        r21 = r20.getSinglePressureRecords();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d8, code lost:
    
        if (r21 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00da, code lost:
    
        r12.addAll(r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e1, code lost:
    
        r2 = r2 + 1;
        r16 = r16 + r20.getAvgLow();
        r17 = r17 + r20.getAvgHigh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f3, code lost:
    
        if (r20.getAvgPulse() <= 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f5, code lost:
    
        r18 = r18 + 1;
        r19 = r19 + r20.getAvgPulse();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0101, code lost:
    
        if (r20.getMaxPulse() <= r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0103, code lost:
    
        r3 = r20.getMaxPulse();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0107, code lost:
    
        if (r1 == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010d, code lost:
    
        if (r20.getMinPulse() >= r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010f, code lost:
    
        r1 = r20.getMinPulse();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0113, code lost:
    
        r6 = r20.getHighPressureRecords().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011f, code lost:
    
        if (r6.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0121, code lost:
    
        r30 = r0;
        r0 = r6.next().getValueArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012d, code lost:
    
        if (r0 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012f, code lost:
    
        r21 = r1;
        r1 = r0.length;
        r22 = r2;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0135, code lost:
    
        if (r2 >= r1) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0137, code lost:
    
        r23 = r0[r2];
        r24 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0143, code lost:
    
        if (r11.contains(java.lang.Integer.valueOf(r23)) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0145, code lost:
    
        r11.add(java.lang.Integer.valueOf(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014c, code lost:
    
        r2 = r2 + 1;
        r0 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0151, code lost:
    
        r1 = r21;
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x015b, code lost:
    
        r30 = r0;
        r21 = r1;
        r22 = r2;
        r0 = r20.getLowPressureRecords().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016d, code lost:
    
        if (r0.hasNext() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016f, code lost:
    
        r1 = r0.next().getValueArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0179, code lost:
    
        if (r1 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017b, code lost:
    
        r2 = r1.length;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017d, code lost:
    
        if (r6 >= r2) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017f, code lost:
    
        r23 = r1[r6];
        r24 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x018b, code lost:
    
        if (r10.contains(java.lang.Integer.valueOf(r23)) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018d, code lost:
    
        r10.add(java.lang.Integer.valueOf(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0194, code lost:
    
        r6 = r6 + 1;
        r0 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0199, code lost:
    
        r0 = r20.getPulseRecords();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019f, code lost:
    
        if (r0 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a5, code lost:
    
        if (r0.isEmpty() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a8, code lost:
    
        r0 = r20.getPulseRecords().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b4, code lost:
    
        if (r0.hasNext() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b6, code lost:
    
        r1 = r0.next().getValueArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c0, code lost:
    
        if (r1 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c2, code lost:
    
        r2 = r1.length;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c4, code lost:
    
        if (r6 >= r2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c6, code lost:
    
        r23 = r1[r6];
        r24 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d2, code lost:
    
        if (r9.contains(java.lang.Integer.valueOf(r23)) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d4, code lost:
    
        r9.add(java.lang.Integer.valueOf(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01db, code lost:
    
        r6 = r6 + 1;
        r0 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e0, code lost:
    
        r14.add(new com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt(r20.getTime(), kotlin.collections.CollectionsKt___CollectionsKt.toIntArray(r10)));
        r13.add(new com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt(r20.getTime(), kotlin.collections.CollectionsKt___CollectionsKt.toIntArray(r11)));
        r15.add(new com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt(r20.getTime(), kotlin.collections.CollectionsKt___CollectionsKt.toIntArray(r9)));
        r0 = r30;
        r1 = r21;
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0219, code lost:
    
        if (r2 <= 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x021b, code lost:
    
        r16 = r16 / r2;
        r17 = r17 / r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0220, code lost:
    
        r16 = 0;
        r17 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0224, code lost:
    
        if (r18 <= 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0226, code lost:
    
        r10 = r19 / r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x022b, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022c, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r5);
        r5 = r5.intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r8);
        r6 = r8.intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
        r8 = r4.intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x025e, code lost:
    
        return new com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport(r28, r27, r17, r5, r6, r16, r8, r7.intValue(), r10, r3, r1, r13, r14, r15, r12);
     */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport mergeTargetReport(@org.jetbrains.annotations.Nullable java.lang.String r26, @org.jetbrains.annotations.NotNull java.lang.String r27, long r28, @org.jetbrains.annotations.NotNull java.util.List<com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport> r30) {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.repo.bloodpressure.BloodPressureRepository.mergeTargetReport(java.lang.String, java.lang.String, long, java.util.List):com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport");
    }
}
