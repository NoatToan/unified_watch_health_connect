package com.xiaomi.fitness.health.todayhealth.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/model/ProjectPersistKey;", "", "<init>", "()V", "Unknown", "", "AllDaySleep", "DynamicBloodPressure", "AmbulatoryBloodPressure", "DynamicBloodPressureSchedule", "AmbulatoryBloodPressureReport", "AmbulatoryBloodPressureCheck", "SportInjuries", "EcgMedical", "PpgMedical", "SleepResearchReport", "SleepResearchRecord", "LightSensitivity", "BodyMovement", "SleepCycleReport", "getBloodPressureKeyList", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProjectPersistKey {

    @NotNull
    public static final String AllDaySleep = "sleep";

    @NotNull
    public static final String AmbulatoryBloodPressure = "no_sense_blood_pressure";

    @NotNull
    public static final String AmbulatoryBloodPressureCheck = "no_sense_blood_pressure_check";

    @NotNull
    public static final String AmbulatoryBloodPressureReport = "no_sense_blood_pressure_report";

    @NotNull
    public static final String BodyMovement = "body_momentum";

    @NotNull
    public static final String DynamicBloodPressure = "ambulatory_blood_pressure";

    @NotNull
    public static final String DynamicBloodPressureSchedule = "ambulatory_blood_pressure_plan";

    @NotNull
    public static final String EcgMedical = "ecg";

    @NotNull
    public static final ProjectPersistKey INSTANCE = new ProjectPersistKey();

    @NotNull
    public static final String LightSensitivity = "light_sensitivity_value";

    @NotNull
    public static final String PpgMedical = "ppg";

    @NotNull
    public static final String SleepCycleReport = "sleep_cycle_report";

    @NotNull
    public static final String SleepResearchRecord = "sleep_research_record";

    @NotNull
    public static final String SleepResearchReport = "sleep_research_report";

    @NotNull
    public static final String SportInjuries = "running_injury_assessment";

    @NotNull
    public static final String Unknown = "unknown";

    private ProjectPersistKey() {
    }

    @NotNull
    public final List<String> getBloodPressureKeyList() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{DynamicBloodPressure, AmbulatoryBloodPressure, AmbulatoryBloodPressureReport, DynamicBloodPressureSchedule, AmbulatoryBloodPressureCheck});
    }
}
