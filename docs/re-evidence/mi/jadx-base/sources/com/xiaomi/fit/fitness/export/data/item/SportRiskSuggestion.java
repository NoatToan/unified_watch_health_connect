package com.xiaomi.fit.fitness.export.data.item;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/SportRiskSuggestion;", "", "Companion", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SportRiskSuggestion {
    public static final int AVOID_TRAINING_OTHERS_SUGGESTION = 9;
    public static final int CONTROL_HIGH_INTENSITY_SUGGESTION_ONE = 15;
    public static final int CONTROL_HIGH_INTENSITY_SUGGESTION_TWO = 16;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int DISTANCE_PER_RUN_SUGGESTION = 11;
    public static final int ENVIRONMENTAL_SLOPE_SUGGESTION = 7;
    public static final int FOOT_MORPHOLOGY_SUGGESTION_ONE = 1;
    public static final int FOOT_MORPHOLOGY_SUGGESTION_TWO = 2;
    public static final int KNEE_JOINT_SUGGESTION_ONE = 3;
    public static final int KNEE_JOINT_SUGGESTION_TWO = 4;
    public static final int MENTAL_FATIGUE_SUGGESTION = 17;
    public static final int OUTSOLE_WORN_SUGGESTION = 21;
    public static final int PAIN_STILL_OCCURS_SUGGESTION = 24;
    public static final int PAVEMENT_ENVIRONMENT_SUGGESTION = 6;
    public static final int POST_WORKOUT_RELAXATION_SUGGESTION = 14;
    public static final int RUNNING_FREQUENCY_SUGGESTION = 8;
    public static final int RUNNING_PAIN_SUGGESTION = 5;
    public static final int RUNNING_SHOES_SUGGESTION_ONE = 19;
    public static final int RUNNING_SHOES_SUGGESTION_TWO = 20;
    public static final int RUN_RATE_INCREASE_SUGGESTION = 10;
    public static final int SLEEP_DURATION_SUGGESTION = 12;
    public static final int SPORT_CUSHIONING_SHOES_SUGGESTION = 22;
    public static final int SPORT_INJURY_NOT_RECOVERED_SUGGESTION = 23;
    public static final int STRENGTH_TRAINING_SUGGESTION = 18;
    public static final int WARM_UP_BEFORE_TRAINING_SUGGESTION = 13;
    public static final int WEIGHT_BMI_SUGGESTION = 0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/SportRiskSuggestion$Companion;", "", "<init>", "()V", "WEIGHT_BMI_SUGGESTION", "", "FOOT_MORPHOLOGY_SUGGESTION_ONE", "FOOT_MORPHOLOGY_SUGGESTION_TWO", "KNEE_JOINT_SUGGESTION_ONE", "KNEE_JOINT_SUGGESTION_TWO", "RUNNING_PAIN_SUGGESTION", "PAVEMENT_ENVIRONMENT_SUGGESTION", "ENVIRONMENTAL_SLOPE_SUGGESTION", "RUNNING_FREQUENCY_SUGGESTION", "AVOID_TRAINING_OTHERS_SUGGESTION", "RUN_RATE_INCREASE_SUGGESTION", "DISTANCE_PER_RUN_SUGGESTION", "SLEEP_DURATION_SUGGESTION", "WARM_UP_BEFORE_TRAINING_SUGGESTION", "POST_WORKOUT_RELAXATION_SUGGESTION", "CONTROL_HIGH_INTENSITY_SUGGESTION_ONE", "CONTROL_HIGH_INTENSITY_SUGGESTION_TWO", "MENTAL_FATIGUE_SUGGESTION", "STRENGTH_TRAINING_SUGGESTION", "RUNNING_SHOES_SUGGESTION_ONE", "RUNNING_SHOES_SUGGESTION_TWO", "OUTSOLE_WORN_SUGGESTION", "SPORT_CUSHIONING_SHOES_SUGGESTION", "SPORT_INJURY_NOT_RECOVERED_SUGGESTION", "PAIN_STILL_OCCURS_SUGGESTION", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int AVOID_TRAINING_OTHERS_SUGGESTION = 9;
        public static final int CONTROL_HIGH_INTENSITY_SUGGESTION_ONE = 15;
        public static final int CONTROL_HIGH_INTENSITY_SUGGESTION_TWO = 16;
        public static final int DISTANCE_PER_RUN_SUGGESTION = 11;
        public static final int ENVIRONMENTAL_SLOPE_SUGGESTION = 7;
        public static final int FOOT_MORPHOLOGY_SUGGESTION_ONE = 1;
        public static final int FOOT_MORPHOLOGY_SUGGESTION_TWO = 2;
        public static final int KNEE_JOINT_SUGGESTION_ONE = 3;
        public static final int KNEE_JOINT_SUGGESTION_TWO = 4;
        public static final int MENTAL_FATIGUE_SUGGESTION = 17;
        public static final int OUTSOLE_WORN_SUGGESTION = 21;
        public static final int PAIN_STILL_OCCURS_SUGGESTION = 24;
        public static final int PAVEMENT_ENVIRONMENT_SUGGESTION = 6;
        public static final int POST_WORKOUT_RELAXATION_SUGGESTION = 14;
        public static final int RUNNING_FREQUENCY_SUGGESTION = 8;
        public static final int RUNNING_PAIN_SUGGESTION = 5;
        public static final int RUNNING_SHOES_SUGGESTION_ONE = 19;
        public static final int RUNNING_SHOES_SUGGESTION_TWO = 20;
        public static final int RUN_RATE_INCREASE_SUGGESTION = 10;
        public static final int SLEEP_DURATION_SUGGESTION = 12;
        public static final int SPORT_CUSHIONING_SHOES_SUGGESTION = 22;
        public static final int SPORT_INJURY_NOT_RECOVERED_SUGGESTION = 23;
        public static final int STRENGTH_TRAINING_SUGGESTION = 18;
        public static final int WARM_UP_BEFORE_TRAINING_SUGGESTION = 13;
        public static final int WEIGHT_BMI_SUGGESTION = 0;

        private Companion() {
        }
    }
}
