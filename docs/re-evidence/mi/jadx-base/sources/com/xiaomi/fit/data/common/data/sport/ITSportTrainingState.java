package com.xiaomi.fit.data.common.data.sport;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fit/data/common/data/sport/ITSportTrainingState;", "", "Companion", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ITSportTrainingState {
    public static final int ACTIVITY = 8;
    public static final int AUTO_TYPE = 32;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int EXTREMITY_RUN = 9;
    public static final int FAST_RUN = 7;
    public static final int FAST_WALK = 4;
    public static final int MANUAL_TYPE = 33;
    public static final int MEDIUM_SPEED_RUN = 6;
    public static final int NONE_SPORT_TYPE = 128;
    public static final int REGULAR_SPORT = 127;
    public static final int RELAX = 3;
    public static final int REST = 2;
    public static final int SLOW_RUN = 5;
    public static final int TRAINING = 1;
    public static final int TRAINING_PLAN_REST = 12;
    public static final int TRAINING_PLAN_RUNNING = 10;
    public static final int TRAINING_PLAN_WALK = 11;
    public static final int WARM_UP = 0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/data/common/data/sport/ITSportTrainingState$Companion;", "", "<init>", "()V", "WARM_UP", "", "TRAINING", "REST", "RELAX", "FAST_WALK", "SLOW_RUN", "MEDIUM_SPEED_RUN", "FAST_RUN", "ACTIVITY", "EXTREMITY_RUN", "AUTO_TYPE", "MANUAL_TYPE", "TRAINING_PLAN_RUNNING", "TRAINING_PLAN_WALK", "TRAINING_PLAN_REST", "REGULAR_SPORT", "NONE_SPORT_TYPE", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int ACTIVITY = 8;
        public static final int AUTO_TYPE = 32;
        public static final int EXTREMITY_RUN = 9;
        public static final int FAST_RUN = 7;
        public static final int FAST_WALK = 4;
        public static final int MANUAL_TYPE = 33;
        public static final int MEDIUM_SPEED_RUN = 6;
        public static final int NONE_SPORT_TYPE = 128;
        public static final int REGULAR_SPORT = 127;
        public static final int RELAX = 3;
        public static final int REST = 2;
        public static final int SLOW_RUN = 5;
        public static final int TRAINING = 1;
        public static final int TRAINING_PLAN_REST = 12;
        public static final int TRAINING_PLAN_RUNNING = 10;
        public static final int TRAINING_PLAN_WALK = 11;
        public static final int WARM_UP = 0;

        private Companion() {
        }
    }
}
