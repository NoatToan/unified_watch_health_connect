package com.xiaomi.fit.fitness.persist.data;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/data/ServerRequestAction;", "", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface ServerRequestAction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String CrossYearPull = "cross_year_pull";

    @NotNull
    public static final String EarliestTimePull = "earliest_time_pull";

    @NotNull
    public static final String FullPull = "full_pull";

    @NotNull
    public static final String IncrementalPull = "incremental_pull";

    @NotNull
    public static final String LatestTimePull = "latest_time_pull";

    @NotNull
    public static final String OnetimePull = "onetime_pull";

    @NotNull
    public static final String RecentOneYearPull = "recent_one_year_pull";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/data/ServerRequestAction$Companion;", "", "<init>", "()V", "EarliestTimePull", "", "LatestTimePull", "IncrementalPull", "RecentOneYearPull", "CrossYearPull", "OnetimePull", "FullPull", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String CrossYearPull = "cross_year_pull";

        @NotNull
        public static final String EarliestTimePull = "earliest_time_pull";

        @NotNull
        public static final String FullPull = "full_pull";

        @NotNull
        public static final String IncrementalPull = "incremental_pull";

        @NotNull
        public static final String LatestTimePull = "latest_time_pull";

        @NotNull
        public static final String OnetimePull = "onetime_pull";

        @NotNull
        public static final String RecentOneYearPull = "recent_one_year_pull";

        private Companion() {
        }
    }
}
