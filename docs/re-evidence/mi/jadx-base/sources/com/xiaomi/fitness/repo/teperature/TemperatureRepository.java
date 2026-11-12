package com.xiaomi.fitness.repo.teperature;

import androidx.paging.PagingSource;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.repository.ITemperatureRepository;
import com.xiaomi.fit.fitness.export.api.repository.PagingSourceParams;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTempReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordFloat;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import com.xiaomi.fitness.repo.teperature.TemperatureRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u001d\u0010\u0016\u001a\u00020\u00132\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0018H\u0014¢\u0006\u0002\u0010\u0019J0\u0010\u001a\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0016J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0 2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010 H\u0002J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0010¢\u0006\u0002\b'J\b\u0010(\u001a\u00020)H\u0016J@\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0 0+2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0096@¢\u0006\u0002\u00102R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/repo/teperature/TemperatureRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/ITemperatureRepository;", "<init>", "()V", "tempBiz", "Lcom/xiaomi/fitness/repo/teperature/TemperatureBiz;", "getTempBiz", "()Lcom/xiaomi/fitness/repo/teperature/TemperatureBiz;", "tempBiz$delegate", "Lkotlin/Lazy;", "getAllRecordDetailPagingSource", "Landroidx/paging/PagingSource;", "", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureItem;", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "doRecordAdd", "", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "doDeleteRecord", "records", "", "([Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "mergeTargetReport", "sid", "", CloudContract.COL_VIEW_TAG, "startTimestamp", "srcReportList", "", "getAllRecordValue", "", "recordList", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordFloat;", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getTemperatureByMonthGroup", "", "startTime", "endTime", "limit", "", "reverse", "", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTemperatureRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemperatureRepository.kt\ncom/xiaomi/fitness/repo/teperature/TemperatureRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,150:1\n1863#2:151\n1864#2:154\n13437#3,2:152\n*S KotlinDebug\n*F\n+ 1 TemperatureRepository.kt\ncom/xiaomi/fitness/repo/teperature/TemperatureRepository\n*L\n119#1:151\n119#1:154\n121#1:152,2\n*E\n"})
public final class TemperatureRepository extends BaseRepository<DailyTempReport> implements ITemperatureRepository {

    /* JADX INFO: renamed from: tempBiz$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tempBiz = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: u3p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TemperatureRepository.tempBiz_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.teperature.TemperatureRepository$getTemperatureByMonthGroup$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.teperature.TemperatureRepository", f = "TemperatureRepository.kt", i = {0}, l = {143}, m = "getTemperatureByMonthGroup", n = {"this"}, s = {"L$0"})
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
            return TemperatureRepository.this.getTemperatureByMonthGroup(0L, 0L, 0, false, this);
        }
    }

    private final List<Float> getAllRecordValue(List<TimesDataRecordFloat> recordList) {
        ArrayList arrayList = new ArrayList();
        if (recordList != null) {
            Iterator<T> it = recordList.iterator();
            while (it.hasNext()) {
                float[] valueArray = ((TimesDataRecordFloat) it.next()).getValueArray();
                if (valueArray != null) {
                    for (float f : valueArray) {
                        if (f > 0.0f && !arrayList.contains(Float.valueOf(f))) {
                            arrayList.add(Float.valueOf(f));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final TemperatureBiz getTempBiz() {
        return (TemperatureBiz) this.tempBiz.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TemperatureBiz tempBiz_delegate$lambda$0() {
        return new TemperatureBiz();
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doDeleteRecord(@NotNull DailyRecordItem[] records) {
        Intrinsics.checkNotNullParameter(records, "records");
        getDbWriter().deleteTemperature((DailyRecordItem[]) Arrays.copyOf(records, records.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doRecordAdd(@NotNull DailyRecordItem record) {
        Intrinsics.checkNotNullParameter(record, "record");
        if (record instanceof TemperatureItem) {
            FitnessDataRecorder dbWriter = getDbWriter();
            String sid = record.getSid();
            Intrinsics.checkNotNull(sid);
            dbWriter.recordTemperatureItem(sid, getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond(), record);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IPagingSourceRepository
    @NotNull
    public PagingSource<Long, TemperatureItem> getAllRecordDetailPagingSource(@Nullable PagingSourceParams params) {
        return new TemperatureDataSource(params);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyTempReport> getBiz$fitness_data_core_chinaProductRelease() {
        return getTempBiz();
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.TEMPERATURE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.ITemperatureRepository
    @Nullable
    public Object getTemperatureByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<TemperatureItem>>> continuation) {
        AnonymousClass1 anonymousClass1;
        TemperatureRepository temperatureRepository;
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
            limitedDataRecord = dailyRecordDaoUtils.getLimitedDataRecord(FitnessPersistKey.ManualTemperature, (String) null, j, j2, curTimeZoneOffsetInSecond, i, z, anonymousClass2);
            if (limitedDataRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
            temperatureRepository = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            temperatureRepository = (TemperatureRepository) anonymousClass2.L$0;
            ResultKt.throwOnFailure(limitedDataRecord);
        }
        Object objGroupByMonth = temperatureRepository.getBiz$fitness_data_core_chinaProductRelease().groupByMonth((List) limitedDataRecord);
        Intrinsics.checkNotNull(objGroupByMonth, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Long, kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.TemperatureItem>>");
        return objGroupByMonth;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<DailyTempReport>) list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r11.equals("weeks") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r11.equals("months") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        r10 = new com.xiaomi.fit.fitness.export.data.aggregation.DailyTempReport(r12, r11);
        r11 = new java.util.ArrayList();
        r12 = new java.util.ArrayList();
        r13 = r14.iterator();
        r2 = 0.0f;
        r3 = 0.0f;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r13.hasNext() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        r4 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r4.getAvgBodyTemp() <= 0.0f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        r2 = r2 + r4.getAvgBodyTemp();
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        if (r4.getAvgSkinTemp() <= 0.0f) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        r3 = r3 + r4.getAvgSkinTemp();
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r4.getMaxBodyTemp() <= r10.getMaxBodyTemp()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        r10.setMaxBodyTemp(r4.getMaxBodyTemp());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
    
        if (r10.getMinBodyTemp() != 0.0f) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        if (r4.getMinBodyTemp() != 0.0f) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
    
        if (r4.getMinBodyTemp() >= r10.getMinBodyTemp()) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
    
        r10.setMinBodyTemp(r4.getMinBodyTemp());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d7, code lost:
    
        if (r4.getMaxSkinTemp() <= r10.getMaxSkinTemp()) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d9, code lost:
    
        r10.setMaxSkinTemp(r4.getMaxSkinTemp());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e6, code lost:
    
        if (r10.getMinSkinTemp() != 0.0f) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ef, code lost:
    
        if (r4.getMinSkinTemp() != 0.0f) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fc, code lost:
    
        if (r4.getMinSkinTemp() >= r10.getMinSkinTemp()) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fe, code lost:
    
        r10.setMinSkinTemp(r4.getMinSkinTemp());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0105, code lost:
    
        r5 = getAllRecordValue(r4.getBodyTempRecords());
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0115, code lost:
    
        if ((!r5.isEmpty()) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0117, code lost:
    
        r11.add(new com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordFloat(r4.getTime(), kotlin.collections.CollectionsKt___CollectionsKt.toFloatArray(r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0127, code lost:
    
        r5 = getAllRecordValue(r4.getSkinTempRecords());
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0137, code lost:
    
        if ((!r5.isEmpty()) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0139, code lost:
    
        r12.add(new com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordFloat(r4.getTime(), kotlin.collections.CollectionsKt___CollectionsKt.toFloatArray(r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0151, code lost:
    
        if ((!r11.isEmpty()) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0153, code lost:
    
        r10.setBodyTempRecords(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015c, code lost:
    
        if ((!r12.isEmpty()) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015e, code lost:
    
        r10.setSkinTempRecords(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0161, code lost:
    
        if (r0 <= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0163, code lost:
    
        r10.setAvgSkinTemp(r3 / r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0168, code lost:
    
        if (r1 <= 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016a, code lost:
    
        r10.setAvgBodyTemp(r2 / r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016f, code lost:
    
        return r10;
     */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xiaomi.fit.fitness.export.data.aggregation.DailyTempReport mergeTargetReport(@org.jetbrains.annotations.Nullable java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11, long r12, @org.jetbrains.annotations.NotNull java.util.List<com.xiaomi.fit.fitness.export.data.aggregation.DailyTempReport> r14) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.repo.teperature.TemperatureRepository.mergeTargetReport(java.lang.String, java.lang.String, long, java.util.List):com.xiaomi.fit.fitness.export.data.aggregation.DailyTempReport");
    }
}
