package com.huami.bigdata.statistics.heartrate;

import com.huami.bigdata.statistics.common.CommonSingleData;
import com.huami.bigdata.statistics.core.api.BigDataType;
import com.huami.bigdata.statistics.core.api.IBigDataExportedApi;
import com.huami.bigdata.statistics.core.usecase.DefaultMapSingleDataUseCase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0014J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0004H\u0014J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0014¨\u0006\u0010"}, d2 = {"Lcom/huami/bigdata/statistics/heartrate/HeartRateBigDataUseCase;", "Lcom/huami/bigdata/statistics/core/usecase/DefaultMapSingleDataUseCase;", "Lcom/huami/bigdata/statistics/heartrate/HeartRateDateData;", "Lcom/huami/bigdata/statistics/heartrate/HeartRateStatistics;", "Lcom/huami/bigdata/statistics/common/CommonSingleData;", "Lcom/huami/bigdata/statistics/core/api/BigDataType;", "getType", "Ljava/lang/Class;", "getClassT", "singleData", "mapSingleDataToStatisticsData", "mapSingleDataToDateData", "Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;", "iBigDataExportedApi", "<init>", "(Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public abstract class HeartRateBigDataUseCase extends DefaultMapSingleDataUseCase<HeartRateDateData, HeartRateStatistics, CommonSingleData> {
    public HeartRateBigDataUseCase(@NotNull IBigDataExportedApi iBigDataExportedApi) {
        super(iBigDataExportedApi);
    }

    @Override // com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase
    @NotNull
    public Class<HeartRateStatistics> getClassT() {
        return HeartRateStatistics.class;
    }

    @Override // com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase
    @NotNull
    public BigDataType getType() {
        return BigDataType.HR_V2;
    }

    @Override // com.huami.bigdata.statistics.core.usecase.DefaultMapSingleDataUseCase
    @NotNull
    public HeartRateDateData mapSingleDataToDateData(@NotNull CommonSingleData singleData) {
        return new HeartRateDateData(new int[]{singleData.getValue()});
    }

    @Override // com.huami.bigdata.statistics.core.usecase.DefaultMapSingleDataUseCase
    @NotNull
    public HeartRateStatistics mapSingleDataToStatisticsData(@NotNull CommonSingleData singleData) {
        return new HeartRateStatistics(singleData.getValue(), singleData.getValue(), singleData.getValue(), 1);
    }
}
