package com.huami.bigdata.statistics.bloodpressure;

import com.huami.bigdata.statistics.core.api.BigDataType;
import com.huami.bigdata.statistics.core.api.IBigDataExportedApi;
import com.huami.bigdata.statistics.core.usecase.DefaultMapSingleDataUseCase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0014J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0014J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0004H\u0014¨\u0006\u0010"}, d2 = {"Lcom/huami/bigdata/statistics/bloodpressure/BloodPressureBigDataUseCase;", "Lcom/huami/bigdata/statistics/core/usecase/DefaultMapSingleDataUseCase;", "Lcom/huami/bigdata/statistics/bloodpressure/BloodPressureDateData;", "Lcom/huami/bigdata/statistics/bloodpressure/BloodPressureStatistics;", "Lcom/huami/bigdata/statistics/bloodpressure/BloodPressureSingleData;", "Lcom/huami/bigdata/statistics/core/api/BigDataType;", "getType", "Ljava/lang/Class;", "getClassT", "singleData", "mapSingleDataToDateData", "mapSingleDataToStatisticsData", "Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;", "iBigDataExportedApi", "<init>", "(Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public abstract class BloodPressureBigDataUseCase extends DefaultMapSingleDataUseCase<BloodPressureDateData, BloodPressureStatistics, BloodPressureSingleData> {
    public BloodPressureBigDataUseCase(@NotNull IBigDataExportedApi iBigDataExportedApi) {
        super(iBigDataExportedApi);
    }

    @Override // com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase
    @NotNull
    public Class<BloodPressureStatistics> getClassT() {
        return BloodPressureStatistics.class;
    }

    @Override // com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase
    @NotNull
    public BigDataType getType() {
        return BigDataType.BLOOD_PRESSURE;
    }

    @Override // com.huami.bigdata.statistics.core.usecase.DefaultMapSingleDataUseCase
    @NotNull
    public BloodPressureDateData mapSingleDataToDateData(@NotNull BloodPressureSingleData singleData) {
        return new BloodPressureDateData(singleData.getSbp(), singleData.getSbp(), singleData.getSbp(), singleData.getDbp(), singleData.getDbp(), singleData.getDbp(), 1);
    }

    @Override // com.huami.bigdata.statistics.core.usecase.DefaultMapSingleDataUseCase
    @NotNull
    public BloodPressureStatistics mapSingleDataToStatisticsData(@NotNull BloodPressureSingleData singleData) {
        return new BloodPressureStatistics(singleData.getSbp(), singleData.getSbp(), singleData.getDbp(), singleData.getDbp(), singleData.getSbp(), singleData.getDbp(), 1);
    }
}
