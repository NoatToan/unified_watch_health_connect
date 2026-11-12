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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/SportInjuriesRiskType;", "", "Companion", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SportInjuriesRiskType {
    public static final int BMI_HIGH = 1;
    public static final int CONTROL_HIGH_INTENSITY_TRAINING = 14;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int DECLINE_SHOCK_ABSORPTION = 19;
    public static final int EXCESSIVE_RUNNING_DISTANCE = 10;
    public static final int FOOT_SHAPE_ABNORMAL = 2;
    public static final int IMPROPER_RUNNING_FREQUENCY = 7;
    public static final int INCREASED_RUNNING_SPEED = 9;
    public static final int INSUFFICIENT_COOLDOWN = 13;
    public static final int INSUFFICIENT_SLEEP = 11;
    public static final int INSUFFICIENT_STRENGTH_TRAINING = 16;
    public static final int INSUFFICIENT_WARMUP = 12;
    public static final int KNEE_SHAPE_ABNORMAL = 3;
    public static final int MENTAL_FATIGUE = 15;
    public static final int OVER_HIGH = 8;
    public static final int PAIN_STILL_OCCURS = 21;
    public static final int POOR_RUNNING_SURFACE = 5;
    public static final int PROPER_RUNNING_SHOES = 17;
    public static final int SHOE_WEAR_OUTSIDE = 18;
    public static final int SPORT_INJURY_NOT_RECOVERED = 20;
    public static final int STEEP_SLOPE = 6;
    public static final int WRONG_PAIN_HANDLING = 4;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/SportInjuriesRiskType$Companion;", "", "<init>", "()V", "BMI_HIGH", "", "FOOT_SHAPE_ABNORMAL", "KNEE_SHAPE_ABNORMAL", "WRONG_PAIN_HANDLING", "POOR_RUNNING_SURFACE", "STEEP_SLOPE", "IMPROPER_RUNNING_FREQUENCY", "OVER_HIGH", "INCREASED_RUNNING_SPEED", "EXCESSIVE_RUNNING_DISTANCE", "INSUFFICIENT_SLEEP", "INSUFFICIENT_WARMUP", "INSUFFICIENT_COOLDOWN", "CONTROL_HIGH_INTENSITY_TRAINING", "MENTAL_FATIGUE", "INSUFFICIENT_STRENGTH_TRAINING", "PROPER_RUNNING_SHOES", "SHOE_WEAR_OUTSIDE", "DECLINE_SHOCK_ABSORPTION", "SPORT_INJURY_NOT_RECOVERED", "PAIN_STILL_OCCURS", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int BMI_HIGH = 1;
        public static final int CONTROL_HIGH_INTENSITY_TRAINING = 14;
        public static final int DECLINE_SHOCK_ABSORPTION = 19;
        public static final int EXCESSIVE_RUNNING_DISTANCE = 10;
        public static final int FOOT_SHAPE_ABNORMAL = 2;
        public static final int IMPROPER_RUNNING_FREQUENCY = 7;
        public static final int INCREASED_RUNNING_SPEED = 9;
        public static final int INSUFFICIENT_COOLDOWN = 13;
        public static final int INSUFFICIENT_SLEEP = 11;
        public static final int INSUFFICIENT_STRENGTH_TRAINING = 16;
        public static final int INSUFFICIENT_WARMUP = 12;
        public static final int KNEE_SHAPE_ABNORMAL = 3;
        public static final int MENTAL_FATIGUE = 15;
        public static final int OVER_HIGH = 8;
        public static final int PAIN_STILL_OCCURS = 21;
        public static final int POOR_RUNNING_SURFACE = 5;
        public static final int PROPER_RUNNING_SHOES = 17;
        public static final int SHOE_WEAR_OUTSIDE = 18;
        public static final int SPORT_INJURY_NOT_RECOVERED = 20;
        public static final int STEEP_SLOPE = 6;
        public static final int WRONG_PAIN_HANDLING = 4;

        private Companion() {
        }
    }
}
