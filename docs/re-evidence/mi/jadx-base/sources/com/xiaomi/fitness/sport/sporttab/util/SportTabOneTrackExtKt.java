package com.xiaomi.fitness.sport.sporttab.util;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.log.Logger;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0006\u0010\b\u001a\u00020\u0003\u001a\u0006\u0010\t\u001a\u00020\u0003\u001a3\u0010\n\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"TAG", "", "oneTrackOnLaunchSportEntranceClick", "", DailyRecordKey.sportType, "", "oneTrackOnSportRecordEntranceClick", "clickView", "oneTrackOnLaunchSportEntranceScrollLeft", "oneTrackOneTrainingIndexCardScrollLeft", "oneTrackOnTrainingIndexEntranceExpose", "oneTrackReportMap", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "", "homeDataType", "dataStatus", "(Ljava/util/Map;Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;Ljava/lang/Integer;)V", "sport_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SportTabOneTrackExtKt {

    @NotNull
    public static final String TAG = "SportTabOneTrackExt";

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomeDataType.values().length];
            try {
                iArr[HomeDataType.V02_MAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeDataType.RUNNING_INDICATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeDataType.PHYSICAL_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeDataType.TRAINING_LOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void oneTrackOnLaunchSportEntranceClick(int i) {
        String str;
        if (i == 1) {
            str = "outdoor_running";
        } else if (i == 2) {
            str = "outdoor_walking";
        } else if (i == 3) {
            str = "indoor_running";
        } else if (i == 6) {
            str = "outdoor_cycling";
        } else if (i != 14) {
            str = i != 324 ? "" : "indoor_cycling";
        } else {
            str = "rope_skipping";
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.2.0.1.36279"), TuplesKt.to("name", "workout_tab_launch_workout"), TuplesKt.to("type", str)));
    }

    public static final void oneTrackOnLaunchSportEntranceScrollLeft() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.2.0.1.36280"), TuplesKt.to("name", "workout_tab_launch_workout_slide")));
    }

    public static final void oneTrackOnSportRecordEntranceClick(int i) {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.2.0.1.36281"), TuplesKt.to("name", "workout_tab_workout_record"), TuplesKt.to("btn_id", Integer.valueOf(i))));
    }

    public static final void oneTrackOnTrainingIndexEntranceExpose(@NotNull Map<HomeDataType, Boolean> oneTrackReportMap, @Nullable HomeDataType homeDataType, @Nullable Integer num) {
        String str;
        Intrinsics.checkNotNullParameter(oneTrackReportMap, "oneTrackReportMap");
        Boolean bool = oneTrackReportMap.get(homeDataType);
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool, bool2)) {
            return;
        }
        int i = homeDataType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[homeDataType.ordinal()];
        if (i == 1) {
            str = FitnessPersistKey.Vo2Max;
        } else if (i == 2) {
            str = "stamina_level";
        } else if (i != 3) {
            str = i != 4 ? "" : FitnessPersistKey.TrainingLoad;
        } else {
            str = "training_stress_balance";
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.2.0.1.36282"), TuplesKt.to("name", "workout_tab_training_indicators"), TuplesKt.to("type", str), TuplesKt.to("status", num)));
        Logger.d(TAG, "oneTrackOnExpose homeDataType=" + homeDataType + " dataStatus=" + num + " exposed");
        if (homeDataType != null) {
            oneTrackReportMap.put(homeDataType, bool2);
        }
    }

    public static final void oneTrackOneTrainingIndexCardScrollLeft() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.2.0.1.36280"), TuplesKt.to("name", "workout_tab_training_indicators_slide")));
    }
}
