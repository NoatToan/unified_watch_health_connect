package com.xiaomi.fit.fitness.export.di;

import com.xiaomi.fit.fitness.export.api.CurseApi;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.api.HealthConnectApi;
import com.xiaomi.fit.fitness.export.api.ISummarySyncManager;
import com.xiaomi.fit.fitness.export.api.SportSummaryApi;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fit/fitness/export/di/FitnessDataEntryPoint;", "", "getFitnessDataRecord", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "getFitnessDataItemGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getRepositoryProvider", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "getServerSyncer", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "getSummarySyncManager", "Lcom/xiaomi/fit/fitness/export/api/ISummarySyncManager;", "getCurseApi", "Lcom/xiaomi/fit/fitness/export/api/CurseApi;", "getSportSummaryApi", "Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;", "getHealthConnectApi", "Lcom/xiaomi/fit/fitness/export/api/HealthConnectApi;", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FitnessDataEntryPoint {
    @NotNull
    CurseApi getCurseApi();

    @NotNull
    FitnessDataGetter getFitnessDataItemGetter();

    @NotNull
    FitnessDataRecorder getFitnessDataRecord();

    @NotNull
    HealthConnectApi getHealthConnectApi();

    @NotNull
    IRepositoryProvider getRepositoryProvider();

    @NotNull
    FitnessServerSyncer getServerSyncer();

    @NotNull
    SportSummaryApi getSportSummaryApi();

    @NotNull
    ISummarySyncManager getSummarySyncManager();
}
