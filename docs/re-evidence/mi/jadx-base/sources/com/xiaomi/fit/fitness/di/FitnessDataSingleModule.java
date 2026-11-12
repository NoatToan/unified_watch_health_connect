package com.xiaomi.fit.fitness.di;

import android.os.IBinder;
import com.xiaomi.fit.fitness.FitnessServerSyncMgr;
import com.xiaomi.fit.fitness.export.api.CurseApi;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.api.HealthConnectApi;
import com.xiaomi.fit.fitness.export.api.SportSummaryApi;
import com.xiaomi.fit.fitness.impl.CurseApiImpl;
import com.xiaomi.fit.fitness.impl.FitnessDataGetterImpl;
import com.xiaomi.fit.fitness.impl.FitnessDataRecorderImpl;
import com.xiaomi.fit.fitness.impl.HealthConnectApiImpl;
import com.xiaomi.fit.fitness.impl.SportSummaryApiImpl;
import com.xiaomi.fit.fitness.remote.FitnessDataRemoteImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0012H'J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H'J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u0019H'J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001cH'¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fit/fitness/di/FitnessDataSingleModule;", "", "<init>", "()V", "getFitnessDataRecord", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "recordImpl", "Lcom/xiaomi/fit/fitness/impl/FitnessDataRecorderImpl;", "getFitnessDataItemGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getter", "Lcom/xiaomi/fit/fitness/impl/FitnessDataGetterImpl;", "getSportSummaryApi", "Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;", "api", "Lcom/xiaomi/fit/fitness/impl/SportSummaryApiImpl;", "getCurseApi", "Lcom/xiaomi/fit/fitness/export/api/CurseApi;", "Lcom/xiaomi/fit/fitness/impl/CurseApiImpl;", "getFitnessServerSyncer", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer", "Lcom/xiaomi/fit/fitness/FitnessServerSyncMgr;", "getHealthConnectApi", "Lcom/xiaomi/fit/fitness/export/api/HealthConnectApi;", "Lcom/xiaomi/fit/fitness/impl/HealthConnectApiImpl;", "getFitnessDataCenterRemote", "Landroid/os/IBinder;", "Lcom/xiaomi/fit/fitness/remote/FitnessDataRemoteImpl;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FitnessDataSingleModule {
    @NotNull
    public abstract CurseApi getCurseApi(@NotNull CurseApiImpl api);

    @NotNull
    public abstract IBinder getFitnessDataCenterRemote(@NotNull FitnessDataRemoteImpl serverSyncer);

    @NotNull
    public abstract FitnessDataGetter getFitnessDataItemGetter(@NotNull FitnessDataGetterImpl getter);

    @NotNull
    public abstract FitnessDataRecorder getFitnessDataRecord(@NotNull FitnessDataRecorderImpl recordImpl);

    @NotNull
    public abstract FitnessServerSyncer getFitnessServerSyncer(@NotNull FitnessServerSyncMgr serverSyncer);

    @NotNull
    public abstract HealthConnectApi getHealthConnectApi(@NotNull HealthConnectApiImpl api);

    @NotNull
    public abstract SportSummaryApi getSportSummaryApi(@NotNull SportSummaryApiImpl api);
}
