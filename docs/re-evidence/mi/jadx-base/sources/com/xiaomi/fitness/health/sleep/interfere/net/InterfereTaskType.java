package com.xiaomi.fitness.health.sleep.interfere.net;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/InterfereTaskType;", "", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE, AnnotationTarget.TYPE})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface InterfereTaskType {

    @NotNull
    public static final String BREATH_RELAX = "BREATH_RELAX";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String DRINK_MILK = "DRINK_MILK";

    @NotNull
    public static final String EAT_NUTS = "EAT_NUTS";

    @NotNull
    public static final String EXERCISE_30MIN = "EXERCISE_30MIN";

    @NotNull
    public static final String LIMIT_NAPS = "LIMIT_NAPS";

    @NotNull
    public static final String MAGNESIUM_FOODS = "MAGNESIUM_FOODS";

    @NotNull
    public static final String NO_CAFFEINE_AFTER_5PM = "NO_CAFFEINE_AFTER_5PM";

    @NotNull
    public static final String NO_SCREENS_30MIN = "NO_SCREENS_30MIN";

    @NotNull
    public static final String SLEEP_TIP = "SLEEP_TIP";

    @NotNull
    public static final String SUNLIGHT_EXPOSURE = "SUNLIGHT_EXPOSURE";

    @NotNull
    public static final String TIMELY_SLEEP = "TIMELY_SLEEP";

    @NotNull
    public static final String TIMELY_WAKE_UP = "TIMELY_WAKE_UP";

    @NotNull
    public static final String VITAMIN_C_INTAKE = "VITAMIN_C_INTAKE";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/InterfereTaskType$Companion;", "", "<init>", "()V", "TIMELY_SLEEP", "", "TIMELY_WAKE_UP", "LIMIT_NAPS", "EXERCISE_30MIN", "BREATH_RELAX", "SLEEP_TIP", "SUNLIGHT_EXPOSURE", "NO_SCREENS_30MIN", "NO_CAFFEINE_AFTER_5PM", "VITAMIN_C_INTAKE", "DRINK_MILK", "EAT_NUTS", "MAGNESIUM_FOODS", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String BREATH_RELAX = "BREATH_RELAX";

        @NotNull
        public static final String DRINK_MILK = "DRINK_MILK";

        @NotNull
        public static final String EAT_NUTS = "EAT_NUTS";

        @NotNull
        public static final String EXERCISE_30MIN = "EXERCISE_30MIN";

        @NotNull
        public static final String LIMIT_NAPS = "LIMIT_NAPS";

        @NotNull
        public static final String MAGNESIUM_FOODS = "MAGNESIUM_FOODS";

        @NotNull
        public static final String NO_CAFFEINE_AFTER_5PM = "NO_CAFFEINE_AFTER_5PM";

        @NotNull
        public static final String NO_SCREENS_30MIN = "NO_SCREENS_30MIN";

        @NotNull
        public static final String SLEEP_TIP = "SLEEP_TIP";

        @NotNull
        public static final String SUNLIGHT_EXPOSURE = "SUNLIGHT_EXPOSURE";

        @NotNull
        public static final String TIMELY_SLEEP = "TIMELY_SLEEP";

        @NotNull
        public static final String TIMELY_WAKE_UP = "TIMELY_WAKE_UP";

        @NotNull
        public static final String VITAMIN_C_INTAKE = "VITAMIN_C_INTAKE";

        private Companion() {
        }
    }
}
