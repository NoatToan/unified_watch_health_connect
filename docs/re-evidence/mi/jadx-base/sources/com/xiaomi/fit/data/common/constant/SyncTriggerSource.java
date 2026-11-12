package com.xiaomi.fit.data.common.constant;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fit/data/common/constant/SyncTriggerSource;", "", "Companion", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SyncTriggerSource {

    @NotNull
    public static final String AccountLogin = "account_login";

    @NotNull
    public static final String AddOrDelete = "add_or_delete";

    @NotNull
    public static final String CloudSyncSwitch = "cloud_sync_switch";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String DeviceSync = "device_sync";

    @NotNull
    public static final String EcgInterpretedNotification = "ecg_interpreted_notification";

    @NotNull
    public static final String EcgListPage = "ecg_list_page";

    @NotNull
    public static final String HomePage = "home_page";

    @NotNull
    public static final String MigrationFitnessDB = "migration_fitness_db";

    @NotNull
    public static final String MigrationOldHealth = "migration_old_health";

    @NotNull
    public static final String MiuiFunctionManualMarkStand = "miui_function_stand_manual";

    @NotNull
    public static final String MiuiFunctionMotion = "miui_function_motion";

    @NotNull
    public static final String MiuiFunctionSleep = "miui_function_sleep";

    @NotNull
    public static final String MiuiFunctionStand = "miui_function_stand";

    @NotNull
    public static final String MiuiFunctionStep = "miui_function_step";

    @NotNull
    public static final String SleepAnimalGenerate = "sleep_animal_generate";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fit/data/common/constant/SyncTriggerSource$Companion;", "", "<init>", "()V", "AccountLogin", "", "DeviceSync", "HomePage", "CloudSyncSwitch", "AddOrDelete", "MigrationOldHealth", "MigrationFitnessDB", "MiuiFunctionStep", "MiuiFunctionSleep", "MiuiFunctionMotion", "MiuiFunctionStand", "MiuiFunctionManualMarkStand", "EcgInterpretedNotification", "EcgListPage", "SleepAnimalGenerate", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String AccountLogin = "account_login";

        @NotNull
        public static final String AddOrDelete = "add_or_delete";

        @NotNull
        public static final String CloudSyncSwitch = "cloud_sync_switch";

        @NotNull
        public static final String DeviceSync = "device_sync";

        @NotNull
        public static final String EcgInterpretedNotification = "ecg_interpreted_notification";

        @NotNull
        public static final String EcgListPage = "ecg_list_page";

        @NotNull
        public static final String HomePage = "home_page";

        @NotNull
        public static final String MigrationFitnessDB = "migration_fitness_db";

        @NotNull
        public static final String MigrationOldHealth = "migration_old_health";

        @NotNull
        public static final String MiuiFunctionManualMarkStand = "miui_function_stand_manual";

        @NotNull
        public static final String MiuiFunctionMotion = "miui_function_motion";

        @NotNull
        public static final String MiuiFunctionSleep = "miui_function_sleep";

        @NotNull
        public static final String MiuiFunctionStand = "miui_function_stand";

        @NotNull
        public static final String MiuiFunctionStep = "miui_function_step";

        @NotNull
        public static final String SleepAnimalGenerate = "sleep_animal_generate";

        private Companion() {
        }
    }
}
