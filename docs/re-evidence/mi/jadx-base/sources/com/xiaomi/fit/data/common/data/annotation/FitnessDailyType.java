package com.xiaomi.fit.data.common.data.annotation;

import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fit/data/common/data/annotation/FitnessDailyType;", "", "Companion", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface FitnessDailyType {
    public static final int ABNORMAL_RECORD = 9;
    public static final int AVERAGE = 4;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int DAILY_ACTIVITY_DATA = 0;
    public static final int DAY_SLEEP = 2;
    public static final int DISTRIBUTE = 1;
    public static final int ECG = 31;
    public static final int ECG_MEASURE = 11;
    public static final int MANUAL_MEASURE = 6;
    public static final int NIGHT_SLEEP = 3;
    public static final int PROFILE = 5;
    public static final int SLEEP_LIFEQ = 7;
    public static final int SLEEP_MI_DEV = 8;
    public static final int TEMPERATURE_MEASURE = 12;
    public static final int WEIGHT_RECORD = 10;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/data/common/data/annotation/FitnessDailyType$Companion;", "", "<init>", "()V", "DAILY_ACTIVITY_DATA", "", "DISTRIBUTE", "DAY_SLEEP", "NIGHT_SLEEP", "AVERAGE", "PROFILE", "MANUAL_MEASURE", "SLEEP_LIFEQ", "SLEEP_MI_DEV", "ABNORMAL_RECORD", "WEIGHT_RECORD", "ECG_MEASURE", "TEMPERATURE_MEASURE", DialWidgetType.ECG, "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int ABNORMAL_RECORD = 9;
        public static final int AVERAGE = 4;
        public static final int DAILY_ACTIVITY_DATA = 0;
        public static final int DAY_SLEEP = 2;
        public static final int DISTRIBUTE = 1;
        public static final int ECG = 31;
        public static final int ECG_MEASURE = 11;
        public static final int MANUAL_MEASURE = 6;
        public static final int NIGHT_SLEEP = 3;
        public static final int PROFILE = 5;
        public static final int SLEEP_LIFEQ = 7;
        public static final int SLEEP_MI_DEV = 8;
        public static final int TEMPERATURE_MEASURE = 12;
        public static final int WEIGHT_RECORD = 10;

        private Companion() {
        }
    }
}
