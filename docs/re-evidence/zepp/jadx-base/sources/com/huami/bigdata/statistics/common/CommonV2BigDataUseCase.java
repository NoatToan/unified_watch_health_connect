package com.huami.bigdata.statistics.common;

import com.huami.bigdata.statistics.core.api.IBigDataExportedApi;
import com.huami.bigdata.statistics.core.usecase.DefaultMapSingleDataUseCase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0014J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0014¨\u0006\u000e"}, d2 = {"Lcom/huami/bigdata/statistics/common/CommonV2BigDataUseCase;", "Lcom/huami/bigdata/statistics/core/usecase/DefaultMapSingleDataUseCase;", "Lcom/huami/bigdata/statistics/common/CommonDateData;", "Lcom/huami/bigdata/statistics/common/CommonStatistics;", "Lcom/huami/bigdata/statistics/common/CommonSingleData;", "Ljava/lang/Class;", "getClassT", "singleData", "mapSingleDataToStatisticsData", "mapSingleDataToDateData", "Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;", "iBigDataExportedApi", "<init>", "(Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public abstract class CommonV2BigDataUseCase extends DefaultMapSingleDataUseCase<CommonDateData, CommonStatistics, CommonSingleData> {
    public CommonV2BigDataUseCase(@NotNull IBigDataExportedApi iBigDataExportedApi) {
        super(iBigDataExportedApi);
    }

    @Override // com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase
    @NotNull
    public Class<CommonStatistics> getClassT() {
        return CommonStatistics.class;
    }

    @Override // com.huami.bigdata.statistics.core.usecase.DefaultMapSingleDataUseCase
    @NotNull
    public CommonDateData mapSingleDataToDateData(@NotNull CommonSingleData singleData) {
        return new CommonDateData(singleData.getValue(), singleData.getValue());
    }

    @Override // com.huami.bigdata.statistics.core.usecase.DefaultMapSingleDataUseCase
    @NotNull
    public CommonStatistics mapSingleDataToStatisticsData(@NotNull CommonSingleData singleData) {
        return new CommonStatistics(singleData.getValue(), singleData.getValue(), singleData.getValue(), 1);
    }
}
