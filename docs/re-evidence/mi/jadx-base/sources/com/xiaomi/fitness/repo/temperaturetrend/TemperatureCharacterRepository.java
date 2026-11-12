package com.xiaomi.fitness.repo.temperaturetrend;

import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.repository.IRepository;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTempReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureCharacterItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import com.xiaomi.fitness.repo.temperaturecharacter.TempCharacterBiz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\u001d\u0010\n\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\fH\u0014¢\u0006\u0002\u0010\rJ0\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0010¢\u0006\u0002\b\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00152\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/repo/temperaturetrend/TemperatureCharacterRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "<init>", "()V", "doRecordAdd", "", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "doDeleteRecord", "records", "", "([Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "mergeTargetReport", "sid", "", CloudContract.COL_VIEW_TAG, "startTimestamp", "", "srcReportList", "", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "queryTempCharacterList", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureCharacterItem;", "startTime", "endTime", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TemperatureCharacterRepository extends BaseRepository<DailyBasicReport> implements IRepository<DailyBasicReport> {
    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doDeleteRecord(@NotNull DailyRecordItem[] records) {
        Intrinsics.checkNotNullParameter(records, "records");
        getDbWriter().deleteTemperature((DailyRecordItem[]) Arrays.copyOf(records, records.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doRecordAdd(@NotNull DailyRecordItem record) {
        Intrinsics.checkNotNullParameter(record, "record");
        if (record instanceof TemperatureCharacterItem) {
            FitnessDataRecorder dbWriter = getDbWriter();
            String sid = record.getSid();
            Intrinsics.checkNotNull(sid);
            dbWriter.recordTemperatureCharacteristic(sid, getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond(), record);
        }
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyBasicReport> getBiz$fitness_data_core_chinaProductRelease() {
        return new TempCharacterBiz();
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.TEMPERATURE_CHARACTER;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public DailyBasicReport mergeTargetReport(@Nullable String sid, @NotNull String viewTag, long startTimestamp, @NotNull List<? extends DailyBasicReport> srcReportList) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(srcReportList, "srcReportList");
        return new DailyTempReport(startTimestamp, viewTag);
    }

    @NotNull
    public final List<TemperatureCharacterItem> queryTempCharacterList(long startTime, long endTime) {
        Map<String, List<DailyRecordItem>> allDailyRecord = getDbGetter().getAllDailyRecord(getDataType(), null, startTime, endTime, FitnessDateUtils.getCurrentTZOffsetInSec());
        ArrayList arrayList = new ArrayList();
        List<DailyRecordItem> list = allDailyRecord.get(FitnessPersistKey.TemperatureCharacter);
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }
}
