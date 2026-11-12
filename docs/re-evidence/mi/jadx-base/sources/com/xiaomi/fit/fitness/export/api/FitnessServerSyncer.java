package com.xiaomi.fit.fitness.export.api;

import com.xiaomi.fit.data.common.constant.SyncTriggerSource;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u0000 (2\u00020\u0001:\u0001(J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J1\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0010\"\u00020\u0007H&¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\u0012\u0010\u0014\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H&J\"\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\u001a\u001a\u00020\u0003H&J\u0012\u0010\u001b\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u001cH&J \u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0007H&J\u0012\u0010!\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u001cH&J*\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\fH&¨\u0006)"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "", "syncWithServer", "", "forceSync", "", "triggerSource", "", "callback", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncCallback;", "pullServerSportReport", "startTime", "", "endTime", "pullServerFitnessData", "keys", "", "(JJ[Ljava/lang/String;)V", "pullAndPushRainbowData", "pullRedDotData", "syncMedicalDataWithServer", "insertSwitchSongRecord", "time", "playerId", "", "value", "syncSwitchSongRecordWithServer", "getCurWeekPlan", "Lcom/xiaomi/fit/fitness/export/api/TrainingPlanCallback;", "updateWeekPlan", "planId", "type", "weekPlanInfo", "getLocalCurDatePlanInfo", "syncCurDatePlanInfo", "trainingType", "id", DialWidgetType.DATE, "planInfo", "deleteCurDataByPlanId", "Companion", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FitnessServerSyncer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer$Companion;", "", "<init>", "()V", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void syncWithServer$default(FitnessServerSyncer fitnessServerSyncer, boolean z, String str, FitnessServerSyncCallback fitnessServerSyncCallback, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncWithServer");
            }
            if ((i & 4) != 0) {
                fitnessServerSyncCallback = null;
            }
            fitnessServerSyncer.syncWithServer(z, str, fitnessServerSyncCallback);
        }
    }

    void deleteCurDataByPlanId(long planId);

    void getCurWeekPlan(@Nullable TrainingPlanCallback callback);

    void getLocalCurDatePlanInfo(@Nullable TrainingPlanCallback callback);

    void insertSwitchSongRecord(long time, int playerId, @Nullable String value);

    void pullAndPushRainbowData();

    void pullRedDotData();

    void pullServerFitnessData(long startTime, long endTime, @NotNull String... keys);

    void pullServerSportReport(long startTime, long endTime);

    void syncCurDatePlanInfo(int trainingType, long id, long date, @Nullable String planInfo);

    void syncMedicalDataWithServer(@SyncTriggerSource @NotNull String triggerSource);

    void syncSwitchSongRecordWithServer();

    void syncWithServer(boolean forceSync, @SyncTriggerSource @NotNull String triggerSource, @Nullable FitnessServerSyncCallback callback);

    void updateWeekPlan(long planId, int type, @NotNull String weekPlanInfo);
}
