package com.xiaomi.fitness.v2.onetrack;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.TrackContentBean;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.threetarget.RainbowExKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.l2c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007\u001a\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t\u001a\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t\u001a\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007\u001a\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u0010\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u001a\u0016\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007\u001a\u0016\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007\u001a\u0016\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0007\u001a\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0007\u001a\u0006\u0010\u001e\u001a\u00020\u000f\u001a\u000e\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0007\u001a\u000e\u0010!\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u000e\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020$\u001a\u001e\u0010%\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007\u001a\u000e\u0010'\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007\u001a\u000e\u0010(\u001a\u00020$2\u0006\u0010\f\u001a\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"TAG", "", "KEY_TYPE_NUM", "KEY_MANAGE_HEALTH_FUNCTION", "buildHealthDataCardExposeTag", "Lcom/example/statistics/export/TrackContentBean;", "healthDataType", "", "dataExist", "", "location", "buildHealthHeaderExposeTag", "type", "hasData", "oneTrackOnHealthHeaderComponentClick", "", "oneTrackOnDataCardClick", "oneTrackRainbowOnExpose", "dailyGoalReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "oneTrackRainbowOnClick", "oneTrackRainbowFoodExpose", "food", "foodCount", "oneTrackOnClickRainbowFood", "foodType", "dailyGoalType", "goalType", "buildHealthManageBtnExposeTag", "position", "oneTrackOnClickHealthManageBtn", "oneTrackOnSportRecordEntranceClick", "clickView", "getHealthDataTrackName", "getOneTrackName", "homeDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "buildOneTrackRunningIndexExposeTrackBean", "status", "isTrainingIndexType", "getHomeDataType", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HealthTabOneTrackExtKt {

    @NotNull
    public static final String KEY_MANAGE_HEALTH_FUNCTION = "status_tab_page_manage_health_functions";

    @NotNull
    public static final String KEY_TYPE_NUM = "type_num";

    @NotNull
    public static final String TAG = "HealthFragmentOneTrack";

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

    @Nullable
    public static final TrackContentBean buildHealthDataCardExposeTag(int i, boolean z, int i2) {
        String healthDataTrackName = getHealthDataTrackName(i);
        Logger.d(TAG, "buildHealthDataCardExposeTag healthDataType=" + i + " trackName=" + healthDataTrackName + " status=" + (z ? 1 : 0));
        if (!(!StringsKt__StringsKt.isBlank(healthDataTrackName))) {
            return null;
        }
        return new TrackContentBean("health_data_card_expose_" + l2c.e(i), false, "expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", healthDataTrackName), TuplesKt.to("tip", "56.4.6.1.28410"), TuplesKt.to("status", Integer.valueOf(z ? 1 : 0)), TuplesKt.to("position_id", Integer.valueOf(i2))), 1.0f);
    }

    @NotNull
    public static final TrackContentBean buildHealthHeaderExposeTag(int i, boolean z) {
        String str;
        if (i == 0) {
            str = "3D_character";
        } else if (i != 1) {
            str = i != 2 ? "" : "all_workout";
        } else {
            str = "recent_workout";
        }
        return new TrackContentBean("health_header_component_" + str, false, "expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", str), TuplesKt.to("tip", "56.4.6.1.28410"), TuplesKt.to("status", Integer.valueOf(z ? 1 : 0)), TuplesKt.to("position_id", 0)), 1.0f);
    }

    @NotNull
    public static final TrackContentBean buildHealthManageBtnExposeTag(int i) {
        return new TrackContentBean("manage_health_btn_expose", false, "expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.4.6.1.28410"), TuplesKt.to("name", KEY_MANAGE_HEALTH_FUNCTION), TuplesKt.to("position_id", Integer.valueOf(i))), 1.0f);
    }

    @NotNull
    public static final TrackContentBean buildOneTrackRunningIndexExposeTrackBean(@NotNull HomeDataType homeDataType, int i, int i2) {
        Intrinsics.checkNotNullParameter(homeDataType, "homeDataType");
        return new TrackContentBean("training_index_" + getOneTrackName(homeDataType), false, "expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.2.0.1.36282"), TuplesKt.to("name", "workout_tab_training_indicators"), TuplesKt.to("type", getOneTrackName(homeDataType)), TuplesKt.to("position_id", Integer.valueOf(i)), TuplesKt.to("status", Integer.valueOf(i2))), 1.0f);
    }

    @NotNull
    public static final String getHealthDataTrackName(int i) {
        if (i == 12) {
            return DialWidgetType.OXYGEN;
        }
        if (i == 13) {
            return "blood_oxygen";
        }
        if (i == 402) {
            return DialWidgetType.ECG;
        }
        if (i == 403) {
            return "blood_sugar";
        }
        if (i == 10000) {
            return "weight";
        }
        if (i == 30000) {
            return "health_check";
        }
        switch (i) {
            case 2:
                return "calorie";
            case 3:
                return "step";
            case 4:
                return "heart_rate";
            case 5:
                return "stand";
            case 6:
                return "sleep";
            case 7:
                return "stress";
            case 8:
                return "energy";
            case 9:
                return "women_health";
            case 10:
                return "PAI";
            default:
                switch (i) {
                    case 15:
                        return "high_intensity";
                    case 16:
                        return "blood_pressure";
                    case 17:
                        return "hear";
                    default:
                        switch (i) {
                            case 20:
                                return FitnessPersistKey.TrainingLoad;
                            case 21:
                                return "temperature";
                            case 22:
                                return "run_index";
                            case 23:
                                return "vitality";
                            case 24:
                                return "physical_status";
                            default:
                                return "";
                        }
                }
        }
    }

    @NotNull
    public static final HomeDataType getHomeDataType(int i) {
        if (i == 12) {
            return HomeDataType.V02_MAX;
        }
        if (i == 20) {
            return HomeDataType.TRAINING_LOAD;
        }
        if (i != 22) {
            return i != 24 ? HomeDataType.V02_MAX : HomeDataType.PHYSICAL_STATUS;
        }
        return HomeDataType.RUNNING_INDICATOR;
    }

    @NotNull
    public static final String getOneTrackName(@NotNull HomeDataType homeDataType) {
        Intrinsics.checkNotNullParameter(homeDataType, "homeDataType");
        int i = WhenMappings.$EnumSwitchMapping$0[homeDataType.ordinal()];
        if (i == 1) {
            return FitnessPersistKey.Vo2Max;
        }
        if (i == 2) {
            return "stamina_level";
        }
        if (i != 3) {
            return i != 4 ? "" : FitnessPersistKey.TrainingLoad;
        }
        return "training_stress_balance";
    }

    public static final boolean isTrainingIndexType(int i) {
        return i == 12 || i == 20 || i == 22 || i == 24;
    }

    public static final void oneTrackOnClickHealthManageBtn() {
        Logger.i(TAG, "oneTrackOnClickHealthManageBtn");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", KEY_MANAGE_HEALTH_FUNCTION), TuplesKt.to("tip", "56.88.1.1.36271")));
    }

    public static final void oneTrackOnClickRainbowFood(int i, int i2) {
        Logger.d(TAG, "oneTrackOnClickRainbowFood foodType=" + i + " foodCount=" + i2);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.4.0.1.36277"), TuplesKt.to("name", "home_page_stats_donut"), TuplesKt.to("type", Integer.valueOf(i)), TuplesKt.to(KEY_TYPE_NUM, Integer.valueOf(i2))));
    }

    public static final void oneTrackOnDataCardClick(int i, boolean z, int i2) {
        String healthDataTrackName = getHealthDataTrackName(i);
        Logger.d(TAG, "oneTrackOnDataCardClick trackName=" + healthDataTrackName + " status=" + (z ? 1 : 0));
        if (!StringsKt__StringsKt.isBlank(healthDataTrackName)) {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", healthDataTrackName), TuplesKt.to("tip", "56.88.1.1.36271"), TuplesKt.to("status", Integer.valueOf(z ? 1 : 0)), TuplesKt.to("position_id", Integer.valueOf(i2))));
        }
    }

    public static final void oneTrackOnHealthHeaderComponentClick(int i, boolean z) {
        String str;
        if (i != 1) {
            str = i != 2 ? "" : "all_workout";
        } else {
            str = "recent_workout";
        }
        if (true ^ StringsKt__StringsKt.isBlank(str)) {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", str), TuplesKt.to("tip", "56.88.1.1.36271"), TuplesKt.to("status", Integer.valueOf(z ? 1 : 0)), TuplesKt.to("position_id", 0)));
        }
    }

    public static final void oneTrackOnSportRecordEntranceClick(int i) {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.2.0.1.36281"), TuplesKt.to("name", "workout_tab_workout_record"), TuplesKt.to("btn_id", Integer.valueOf(i))));
    }

    public static final void oneTrackRainbowFoodExpose(int i, int i2) {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.4.0.1.36253"), TuplesKt.to("name", "home_page_stats_donut"), TuplesKt.to("type", Integer.valueOf(i)), TuplesKt.to(KEY_TYPE_NUM, Integer.valueOf(i2))));
    }

    public static final void oneTrackRainbowOnClick(@Nullable DailyGoalReport dailyGoalReport) {
        if (dailyGoalReport == null) {
            return;
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "home_page_stats"), TuplesKt.to("tip", "56.4.0.1.36252"), TuplesKt.to("type", Integer.valueOf(dailyGoalReport.containsStanding() ? 2 : 1)), TuplesKt.to("status", Integer.valueOf(RainbowExKt.getRainbowAchieveStatus(dailyGoalReport)))));
    }

    @NotNull
    public static final TrackContentBean oneTrackRainbowOnExpose(@NotNull DailyGoalReport dailyGoalReport) {
        Intrinsics.checkNotNullParameter(dailyGoalReport, "dailyGoalReport");
        Logger.i(TAG, "oneTrackRainbowOnExpose dailyGoalReport=" + dailyGoalReport);
        return new TrackContentBean("rainbow_expose", false, "expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.4.0.1.36251"), TuplesKt.to("name", "home_page_stats"), TuplesKt.to("type", Integer.valueOf(dailyGoalReport.containsStanding() ? 2 : 1)), TuplesKt.to("status", Integer.valueOf(RainbowExKt.getRainbowAchieveStatus(dailyGoalReport)))), 1.0f);
    }

    public static final void oneTrackOnClickRainbowFood(@NotNull DailyGoalReport dailyGoalType, int i) {
        String str;
        Intrinsics.checkNotNullParameter(dailyGoalType, "dailyGoalType");
        Pair<Integer, Integer> pair = dailyGoalType.getItemTypeGoalAndValue().get(Integer.valueOf(i));
        if (pair == null) {
            return;
        }
        int iIntValue = pair.getFirst().intValue();
        int iIntValue2 = pair.getSecond().intValue();
        if (i == 1) {
            str = "steps";
        } else if (i == 2) {
            str = "calories";
        } else if (i == 3) {
            str = "stand";
        } else if (i != 4) {
            str = "";
        } else {
            str = "exercise_time";
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.4.0.1.36278"), TuplesKt.to("name", "home_page_stats_data_card"), TuplesKt.to("type", str), TuplesKt.to("target_value", Integer.valueOf(iIntValue)), TuplesKt.to(KEY_TYPE_NUM, Integer.valueOf(iIntValue2))));
    }
}
