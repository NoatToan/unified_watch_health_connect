package com.xiaomi.fitness.training_plan_export.utils;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.m1j;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.MapsKt__MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002#$B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\nJ\u0006\u0010\u0014\u001a\u00020\nJ\u0016\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\fJ\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/utils/TrainingEventUtils;", "", "<init>", "()V", "HABIT_TYPE_STR", "", "ABILITY_TYPE_STR", "TAB_SOURCE_STR", "DETAIL_PAGE_SOURCE_STR", "trackTabCreate", "", "type", "", "trackTabAll", "trackAllHistory", "trackSportReport", "trackToSport", "source", "trackRunningCourseDetail", "trackPlanSetting", "trackPlanStop", "trackPlanDetailView", "duration", "", "trackPlanGenerated", "success", "", "trackPlanStopped", BroadcastsKt.SILENT_PUSHING_PROGRESS, "resultType", "getTrainingTypeStr", "getToSportSourceStr", "getDetailPageName", "getPlanGeneratedStr", "getResultTypeStr", "PlanGeneratedType", "PlanStoppedResultType", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrainingEventUtils {

    @NotNull
    private static final String ABILITY_TYPE_STR = "running_ability_improve_plan";

    @NotNull
    private static final String DETAIL_PAGE_SOURCE_STR = "training_plan_details_page";

    @NotNull
    private static final String HABIT_TYPE_STR = "habit_formation_plan";

    @NotNull
    public static final TrainingEventUtils INSTANCE = new TrainingEventUtils();

    @NotNull
    private static final String TAB_SOURCE_STR = "workout_tab";

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/utils/TrainingEventUtils$PlanGeneratedType;", "", "Companion", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface PlanGeneratedType {
        public static final int ABILITY_3KM = 1;
        public static final int ABILITY_5KM = 2;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int HABIT = 0;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/utils/TrainingEventUtils$PlanGeneratedType$Companion;", "", "<init>", "()V", "HABIT", "", "ABILITY_3KM", "ABILITY_5KM", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int ABILITY_3KM = 1;
            public static final int ABILITY_5KM = 2;
            public static final int HABIT = 0;

            private Companion() {
            }
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/utils/TrainingEventUtils$PlanStoppedResultType;", "", "Companion", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface PlanStoppedResultType {
        public static final int AUTO_END_FINISHED = 4;
        public static final int AUTO_END_UNFINISHED = 3;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int USER_END_FINISHED = 2;
        public static final int USER_END_UNFINISHED = 1;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/utils/TrainingEventUtils$PlanStoppedResultType$Companion;", "", "<init>", "()V", "USER_END_UNFINISHED", "", "USER_END_FINISHED", "AUTO_END_UNFINISHED", "AUTO_END_FINISHED", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int AUTO_END_FINISHED = 4;
            public static final int AUTO_END_UNFINISHED = 3;
            public static final int USER_END_FINISHED = 2;
            public static final int USER_END_UNFINISHED = 1;

            private Companion() {
            }
        }
    }

    private TrainingEventUtils() {
    }

    private final String getDetailPageName(int type) {
        if (type != 1) {
            return type != 2 ? "" : ResourceExtKt.getString(m1j.h);
        }
        return ResourceExtKt.getString(m1j.q);
    }

    private final String getPlanGeneratedStr(int type) {
        if (type == 0) {
            return HABIT_TYPE_STR;
        }
        if (type != 1) {
            return type != 2 ? "" : "running_ability_improve_plan_5km";
        }
        return "running_ability_improve_plan_3km";
    }

    private final String getResultTypeStr(int type) {
        if (type == 1) {
            return "user_end_unfinished";
        }
        if (type == 2) {
            return "user_end_finished";
        }
        if (type != 3) {
            return type != 4 ? "" : "auto_end_finished";
        }
        return "auto_end_unfinished";
    }

    private final String getToSportSourceStr(int source) {
        if (source != 1) {
            return source != 2 ? "" : DETAIL_PAGE_SOURCE_STR;
        }
        return TAB_SOURCE_STR;
    }

    private final String getTrainingTypeStr(int type) {
        if (type != 1) {
            return type != 2 ? "" : ABILITY_TYPE_STR;
        }
        return HABIT_TYPE_STR;
    }

    public final void trackAllHistory() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.97.0.1.37626"), TuplesKt.to("name", "all_training_plans_page_history_btn")));
    }

    public final void trackPlanDetailView(int type, long duration) {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("c_pa_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.97.0.1.37633"), TuplesKt.to("name", DETAIL_PAGE_SOURCE_STR), TuplesKt.to(FaceDetailFragment.PAGE_NAME, getDetailPageName(type)), TuplesKt.to("duration_sec", Long.valueOf(duration))));
    }

    public final void trackPlanGenerated(boolean success, int type) {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.97.0.1.37634"), TuplesKt.to("name", "training_plan_create_event"), TuplesKt.to("result", Integer.valueOf(!success ? 1 : 0)), TuplesKt.to("type_str", getPlanGeneratedStr(type))));
    }

    public final void trackPlanSetting() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.97.0.1.37631"), TuplesKt.to("name", "training_plan_details_page_settings_btn")));
    }

    public final void trackPlanStop() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.97.0.1.37632"), TuplesKt.to("name", "training_plan_details_page_end_plan_btn")));
    }

    public final void trackPlanStopped(int type, int progress, int resultType) {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.97.0.1.37635"), TuplesKt.to("name", "training_plan_end_event"), TuplesKt.to(Constants.EXTRA_RESULT_MSG, getResultTypeStr(resultType)), TuplesKt.to(BroadcastsKt.SILENT_PUSHING_PROGRESS, Integer.valueOf(progress)), TuplesKt.to("type_str", getTrainingTypeStr(type))));
    }

    public final void trackRunningCourseDetail(int source) {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.97.0.1.37629"), TuplesKt.to("name", "training_plan_course_details_btn"), TuplesKt.to("source", getToSportSourceStr(source))));
    }

    public final void trackSportReport(int type) {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.97.0.1.37630"), TuplesKt.to("name", "workout_tab_create_training_plan_btn"), TuplesKt.to("type_Str", getTrainingTypeStr(type))));
    }

    public final void trackTabAll() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.97.0.1.37625"), TuplesKt.to("name", "workout_tab_all_training_plans_btn")));
    }

    public final void trackTabCreate(int type) {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.2.0.1.37624"), TuplesKt.to("name", "workout_tab_create_training_plan_btn"), TuplesKt.to("type_str", getTrainingTypeStr(type))));
    }

    public final void trackToSport(int source) {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.97.0.1.37628"), TuplesKt.to("name", "training_plan_go_training_btn"), TuplesKt.to("source", getToSportSourceStr(source))));
    }
}
