package com.xiaomi.fit.fitness.persist.utils;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fit.data.common.constant.SyncTriggerSource;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.GoalItem;
import com.xiaomi.fit.fitness.persist.process.SyncRequestResult;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ(\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ(\u0010\u0010\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/utils/FitnessServerSyncTracker;", "", "<init>", "()V", "trackOneYearPullFitness", "", "startPullTimeMilli", "", "requestResult", "Lcom/xiaomi/fit/fitness/persist/process/SyncRequestResult;", "trackHomeRecentPullFitness", "trackIncPullFitness", "source", "", "isForeground", "", "trackPushFitnessData", "trackDailyRainbowReport", "report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessServerSyncTracker {

    @NotNull
    private static final String CONNECT_EVENT_NAME = "connect_v3";

    @NotNull
    private static final String EVENT_EVENT_NAME = "event_v3";

    @NotNull
    private static final String KEY_HAS_VALUE = "value_bool";

    @NotNull
    private static final String KEY_IS_FOREGROUND = "is_foreground";

    @NotNull
    private static final String KEY_TIP = "tip";

    @NotNull
    private static final String KEY_TRACK_DURATION_MILLI = "duration_msec";

    @NotNull
    private static final String KEY_TRACK_ERROR_CODE = "error_code";

    @NotNull
    private static final String KEY_TRACK_ERROR_INFO = "error_info";

    @NotNull
    private static final String KEY_TRACK_NAME = "name";

    @NotNull
    private static final String KEY_TRACK_RESULT = "result";

    @NotNull
    private static final String KEY_TRACK_SOURCE = "source";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final FitnessServerSyncTracker instance = new FitnessServerSyncTracker();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/utils/FitnessServerSyncTracker$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/persist/utils/FitnessServerSyncTracker;", "getInstance", "()Lcom/xiaomi/fit/fitness/persist/utils/FitnessServerSyncTracker;", "CONNECT_EVENT_NAME", "", "EVENT_EVENT_NAME", "KEY_TIP", "KEY_TRACK_NAME", "KEY_TRACK_RESULT", "KEY_TRACK_DURATION_MILLI", "KEY_TRACK_ERROR_CODE", "KEY_TRACK_ERROR_INFO", "KEY_TRACK_SOURCE", "KEY_HAS_VALUE", "KEY_IS_FOREGROUND", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FitnessServerSyncTracker getInstance() {
            return FitnessServerSyncTracker.instance;
        }
    }

    private FitnessServerSyncTracker() {
    }

    public final void trackDailyRainbowReport(@NotNull DailyGoalReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        List<GoalItem> listGoalList = report.goalList();
        if (listGoalList.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tip", "56.48.1.1.20567");
        linkedHashMap.put("name", "activity_target_report");
        int i = 0;
        for (GoalItem goalItem : listGoalList) {
            String typeName = goalItem.getTypeName();
            String str = typeName + "_target";
            String str2 = typeName + "_completeness";
            int achievedValue = goalItem.getGoalValue() == 0 ? 0 : (goalItem.getAchievedValue() * 100) / goalItem.getGoalValue();
            linkedHashMap.put(str, Integer.valueOf(goalItem.getGoalValue()));
            linkedHashMap.put(str2, Integer.valueOf(achievedValue));
            if (achievedValue >= 100) {
                i++;
            }
        }
        linkedHashMap.put("value_num", Integer.valueOf(i));
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("event_v3", linkedHashMap);
    }

    public final void trackHomeRecentPullFitness(long startPullTimeMilli, @NotNull SyncRequestResult requestResult) {
        Intrinsics.checkNotNullParameter(requestResult, "requestResult");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tip", "56.32.3.1.17901");
        linkedHashMap.put("name", "download_home_date");
        linkedHashMap.put("result", Boolean.valueOf(requestResult.getSuccess()));
        linkedHashMap.put(KEY_TRACK_DURATION_MILLI, Long.valueOf(System.currentTimeMillis() - startPullTimeMilli));
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(CONNECT_EVENT_NAME, linkedHashMap);
    }

    public final void trackIncPullFitness(@SyncTriggerSource @NotNull String source, long startPullTimeMilli, @NotNull SyncRequestResult requestResult, boolean isForeground) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(requestResult, "requestResult");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tip", "56.32.3.1.17900");
        linkedHashMap.put("name", "download_sever");
        linkedHashMap.put("result", Boolean.valueOf(requestResult.getSuccess()));
        linkedHashMap.put(KEY_TRACK_DURATION_MILLI, Long.valueOf(System.currentTimeMillis() - startPullTimeMilli));
        linkedHashMap.put("source", source);
        linkedHashMap.put(KEY_HAS_VALUE, Boolean.valueOf(requestResult.getHasNewData()));
        linkedHashMap.put(KEY_IS_FOREGROUND, Boolean.valueOf(isForeground));
        if (!requestResult.getSuccess()) {
            if (requestResult.getServerCode() != null) {
                Integer serverCode = requestResult.getServerCode();
                Intrinsics.checkNotNull(serverCode);
                linkedHashMap.put("error_code", serverCode);
            }
            if (requestResult.getServerMsg() != null) {
                String serverMsg = requestResult.getServerMsg();
                Intrinsics.checkNotNull(serverMsg);
                linkedHashMap.put("error_info", serverMsg);
            }
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(CONNECT_EVENT_NAME, linkedHashMap);
    }

    public final void trackOneYearPullFitness(long startPullTimeMilli, @NotNull SyncRequestResult requestResult) {
        Intrinsics.checkNotNullParameter(requestResult, "requestResult");
        if (requestResult.isRequestOnline()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("tip", "56.32.3.1.17902");
            linkedHashMap.put("name", "download_recent_year");
            linkedHashMap.put("result", Boolean.valueOf(requestResult.getSuccess()));
            linkedHashMap.put(KEY_TRACK_DURATION_MILLI, Long.valueOf(System.currentTimeMillis() - startPullTimeMilli));
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(CONNECT_EVENT_NAME, linkedHashMap);
        }
    }

    public final void trackPushFitnessData(@SyncTriggerSource @NotNull String source, long startPullTimeMilli, @NotNull SyncRequestResult requestResult, boolean isForeground) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(requestResult, "requestResult");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tip", "56.32.2.1.17893");
        linkedHashMap.put("name", "upload_sever");
        linkedHashMap.put("result", Boolean.valueOf(requestResult.getSuccess()));
        linkedHashMap.put(KEY_TRACK_DURATION_MILLI, Long.valueOf(System.currentTimeMillis() - startPullTimeMilli));
        linkedHashMap.put("source", source);
        linkedHashMap.put(KEY_HAS_VALUE, Boolean.valueOf(requestResult.getHasNewData()));
        linkedHashMap.put(KEY_IS_FOREGROUND, Boolean.valueOf(isForeground));
        if (!requestResult.getSuccess()) {
            if (requestResult.getServerCode() != null) {
                Integer serverCode = requestResult.getServerCode();
                Intrinsics.checkNotNull(serverCode);
                linkedHashMap.put("error_code", serverCode);
            }
            if (requestResult.getServerMsg() != null) {
                String serverMsg = requestResult.getServerMsg();
                Intrinsics.checkNotNull(serverMsg);
                linkedHashMap.put("error_info", serverMsg);
            }
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(CONNECT_EVENT_NAME, linkedHashMap);
    }
}
