package com.xiaomi.fitness.repo.temperaturetrend;

import androidx.paging.PagingSource;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.repository.ITemperatureTrendRepository;
import com.xiaomi.fit.fitness.export.api.repository.PagingSourceParams;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTempReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordFloat;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureTrendItem;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import com.xiaomi.fitness.repo.temperaturecharacter.TempCharacterBiz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
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
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u001d\u0010\u0010\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0012H\u0014¢\u0006\u0002\u0010\u0013J0\u0010\u0014\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001a2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001aH\u0002J\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0010¢\u0006\u0002\b!J\b\u0010\"\u001a\u00020#H\u0016J4\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0096@¢\u0006\u0002\u0010+¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/repo/temperaturetrend/TemperatureTrendRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/ITemperatureTrendRepository;", "<init>", "()V", "getAllRecordDetailPagingSource", "Landroidx/paging/PagingSource;", "", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureTrendItem;", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "doRecordAdd", "", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "doDeleteRecord", "records", "", "([Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "mergeTargetReport", "sid", "", CloudContract.COL_VIEW_TAG, "startTimestamp", "srcReportList", "", "getAllRecordValue", "", "recordList", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordFloat;", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getTemperatureTrendData", "startTime", "endTime", "limit", "", "reverse", "", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTemperatureTrendRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemperatureTrendRepository.kt\ncom/xiaomi/fitness/repo/temperaturetrend/TemperatureTrendRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,78:1\n1863#2:79\n1864#2:82\n13437#3,2:80\n*S KotlinDebug\n*F\n+ 1 TemperatureTrendRepository.kt\ncom/xiaomi/fitness/repo/temperaturetrend/TemperatureTrendRepository\n*L\n47#1:79\n47#1:82\n49#1:80,2\n*E\n"})
public final class TemperatureTrendRepository extends BaseRepository<DailyBasicReport> implements ITemperatureTrendRepository {

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.temperaturetrend.TemperatureTrendRepository$getTemperatureTrendData$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.temperaturetrend.TemperatureTrendRepository", f = "TemperatureTrendRepository.kt", i = {}, l = {71}, m = "getTemperatureTrendData", n = {}, s = {})
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
            return TemperatureTrendRepository.this.getTemperatureTrendData(0L, 0L, 0, false, this);
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

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doDeleteRecord(@NotNull DailyRecordItem[] records) {
        Intrinsics.checkNotNullParameter(records, "records");
        getDbWriter().deleteTemperature((DailyRecordItem[]) Arrays.copyOf(records, records.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doRecordAdd(@NotNull DailyRecordItem record) {
        Intrinsics.checkNotNullParameter(record, "record");
        if (record instanceof TemperatureTrendItem) {
            FitnessDataRecorder dbWriter = getDbWriter();
            String sid = record.getSid();
            Intrinsics.checkNotNull(sid);
            dbWriter.recordTemperatureTrendItem(sid, getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond(), record);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IPagingSourceRepository
    @NotNull
    public PagingSource<Long, TemperatureTrendItem> getAllRecordDetailPagingSource(@Nullable PagingSourceParams params) {
        return new TemperatureTrendDataSource(params);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyBasicReport> getBiz$fitness_data_core_chinaProductRelease() {
        return new TempCharacterBiz();
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.TEMPERATURE_TREND;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.ITemperatureTrendRepository
    @Nullable
    public Object getTemperatureTrendData(long j, long j2, int i, boolean z, @NotNull Continuation<? super List<TemperatureTrendItem>> continuation) {
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
        Object limitedDataRecord = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass2.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(limitedDataRecord);
            DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
            int curTimeZoneOffsetInSecond = getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
            anonymousClass2.label = 1;
            limitedDataRecord = dailyRecordDaoUtils.getLimitedDataRecord("temperature_trend", (String) null, j, j2, curTimeZoneOffsetInSecond, i, z, anonymousClass2);
            if (limitedDataRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(limitedDataRecord);
        }
        List list = (List) limitedDataRecord;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.TemperatureTrendItem>");
        return list;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public DailyBasicReport mergeTargetReport(@Nullable String sid, @NotNull String viewTag, long startTimestamp, @NotNull List<? extends DailyBasicReport> srcReportList) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(srcReportList, "srcReportList");
        return new DailyTempReport(startTimestamp, viewTag);
    }
}
