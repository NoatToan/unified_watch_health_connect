package com.xiaomi.fit.data.common.data.annotation;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fit/data/common/data/annotation/SportCourseID;", "", "Companion", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface SportCourseID {
    public static final int AdvancedAerobicRun = 8;
    public static final int AdvancedFatBurningRun = 5;
    public static final int AdvancedIntervalRun = 10;
    public static final int AdvancedRun = 2;
    public static final int BasicAerobicRun = 7;
    public static final int BasicFatBurningRun = 4;
    public static final int BasicIntervalRun = 9;
    public static final int BasicRun = 1;
    public static final int BasicSlowRun = 3;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int IntervalTraining = 254;
    public static final int MIITFatBurningRun = 6;
    public static final int None = 0;
    public static final int ServerClass = 255;
    public static final int ServerClassAiDong = 252;
    public static final int ServerClassTV = 253;
    public static final int lactateTestTun = 11;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fit/data/common/data/annotation/SportCourseID$Companion;", "", "<init>", "()V", "None", "", "BasicRun", "AdvancedRun", "BasicSlowRun", "BasicFatBurningRun", "AdvancedFatBurningRun", "MIITFatBurningRun", "BasicAerobicRun", "AdvancedAerobicRun", "BasicIntervalRun", "AdvancedIntervalRun", "lactateTestTun", "ServerClassAiDong", "ServerClassTV", "IntervalTraining", "ServerClass", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int AdvancedAerobicRun = 8;
        public static final int AdvancedFatBurningRun = 5;
        public static final int AdvancedIntervalRun = 10;
        public static final int AdvancedRun = 2;
        public static final int BasicAerobicRun = 7;
        public static final int BasicFatBurningRun = 4;
        public static final int BasicIntervalRun = 9;
        public static final int BasicRun = 1;
        public static final int BasicSlowRun = 3;
        public static final int IntervalTraining = 254;
        public static final int MIITFatBurningRun = 6;
        public static final int None = 0;
        public static final int ServerClass = 255;
        public static final int ServerClassAiDong = 252;
        public static final int ServerClassTV = 253;
        public static final int lactateTestTun = 11;

        private Companion() {
        }
    }
}
