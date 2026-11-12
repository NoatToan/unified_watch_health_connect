package androidx.health.connect.client.impl.platform.records;

import android.health.connect.datatypes.BasalBodyTemperatureRecord;
import android.health.connect.datatypes.BasalMetabolicRateRecord;
import android.health.connect.datatypes.BloodGlucoseRecord;
import android.health.connect.datatypes.BloodPressureRecord;
import android.health.connect.datatypes.BodyWaterMassRecord;
import android.health.connect.datatypes.ExerciseRoute;
import android.health.connect.datatypes.HeartRateRecord;
import android.health.connect.datatypes.HeartRateVariabilityRmssdRecord;
import android.health.connect.datatypes.HeightRecord;
import android.health.connect.datatypes.HydrationRecord;
import android.health.connect.datatypes.IntermenstrualBleedingRecord;
import android.health.connect.datatypes.LeanBodyMassRecord;
import android.health.connect.datatypes.MenstruationFlowRecord;
import android.health.connect.datatypes.MenstruationPeriodRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.NutritionRecord;
import android.health.connect.datatypes.OvulationTestRecord;
import android.health.connect.datatypes.OxygenSaturationRecord;
import android.health.connect.datatypes.PlannedExerciseStep;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.RespiratoryRateRecord;
import android.health.connect.datatypes.RestingHeartRateRecord;
import android.health.connect.datatypes.SexualActivityRecord;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.StepsCadenceRecord;
import android.health.connect.datatypes.StepsRecord;
import android.health.connect.datatypes.TotalCaloriesBurnedRecord;
import android.health.connect.datatypes.Vo2MaxRecord;
import android.health.connect.datatypes.WeightRecord;
import android.health.connect.datatypes.WheelchairPushesRecord;
import android.health.connect.datatypes.units.Mass;
import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RecordConvertersKt$$ExternalSyntheticApiModelOutline3 {
    public static /* bridge */ /* synthetic */ BasalBodyTemperatureRecord m(Object obj) {
        return (BasalBodyTemperatureRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ BasalMetabolicRateRecord m211m(Object obj) {
        return (BasalMetabolicRateRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ BloodGlucoseRecord m212m(Object obj) {
        return (BloodGlucoseRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ BloodPressureRecord m213m(Object obj) {
        return (BloodPressureRecord) obj;
    }

    public static /* synthetic */ BodyWaterMassRecord.Builder m(Metadata metadata, Instant instant, Mass mass) {
        return new BodyWaterMassRecord.Builder(metadata, instant, mass);
    }

    public static /* synthetic */ ExerciseRoute.Location.Builder m(Instant instant, double d, double d2) {
        return new ExerciseRoute.Location.Builder(instant, d, d2);
    }

    public static /* synthetic */ ExerciseRoute m(List list) {
        return new ExerciseRoute(list);
    }

    public static /* synthetic */ HeartRateRecord.Builder m(Metadata metadata, Instant instant, Instant instant2, List list) {
        return new HeartRateRecord.Builder(metadata, instant, instant2, list);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ HeartRateVariabilityRmssdRecord m214m(Object obj) {
        return (HeartRateVariabilityRmssdRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ HeightRecord m215m(Object obj) {
        return (HeightRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ HydrationRecord m216m(Object obj) {
        return (HydrationRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ IntermenstrualBleedingRecord m217m(Object obj) {
        return (IntermenstrualBleedingRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ LeanBodyMassRecord m218m(Object obj) {
        return (LeanBodyMassRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MenstruationFlowRecord m219m(Object obj) {
        return (MenstruationFlowRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MenstruationPeriodRecord m220m(Object obj) {
        return (MenstruationPeriodRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ NutritionRecord m223m(Object obj) {
        return (NutritionRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ OvulationTestRecord m224m(Object obj) {
        return (OvulationTestRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ OxygenSaturationRecord m225m(Object obj) {
        return (OxygenSaturationRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ PlannedExerciseStep m226m(Object obj) {
        return (PlannedExerciseStep) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ PowerRecord m227m(Object obj) {
        return (PowerRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ RespiratoryRateRecord m228m(Object obj) {
        return (RespiratoryRateRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ RestingHeartRateRecord m229m(Object obj) {
        return (RestingHeartRateRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ SexualActivityRecord m230m(Object obj) {
        return (SexualActivityRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ SleepSessionRecord m231m(Object obj) {
        return (SleepSessionRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ SpeedRecord m232m(Object obj) {
        return (SpeedRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ StepsCadenceRecord m233m(Object obj) {
        return (StepsCadenceRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ StepsRecord m234m(Object obj) {
        return (StepsRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ TotalCaloriesBurnedRecord m235m(Object obj) {
        return (TotalCaloriesBurnedRecord) obj;
    }

    public static /* synthetic */ Vo2MaxRecord.Builder m(Metadata metadata, Instant instant, int i, double d) {
        return new Vo2MaxRecord.Builder(metadata, instant, i, d);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Vo2MaxRecord m236m(Object obj) {
        return (Vo2MaxRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ WeightRecord m237m(Object obj) {
        return (WeightRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ WheelchairPushesRecord m238m(Object obj) {
        return (WheelchairPushesRecord) obj;
    }

    public static /* synthetic */ void m() {
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m249m(Object obj) {
        return obj instanceof HeartRateVariabilityRmssdRecord;
    }

    public static /* synthetic */ void m$1() {
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof HeightRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$10(Object obj) {
        return obj instanceof OxygenSaturationRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$11(Object obj) {
        return obj instanceof PowerRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$12(Object obj) {
        return obj instanceof RespiratoryRateRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$13(Object obj) {
        return obj instanceof RestingHeartRateRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$14(Object obj) {
        return obj instanceof SexualActivityRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$15(Object obj) {
        return obj instanceof SleepSessionRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$16(Object obj) {
        return obj instanceof SpeedRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$17(Object obj) {
        return obj instanceof StepsCadenceRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$18(Object obj) {
        return obj instanceof StepsRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$19(Object obj) {
        return obj instanceof TotalCaloriesBurnedRecord;
    }

    public static /* synthetic */ void m$2() {
    }

    public static /* bridge */ /* synthetic */ boolean m$2(Object obj) {
        return obj instanceof HydrationRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$20(Object obj) {
        return obj instanceof BloodGlucoseRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$21(Object obj) {
        return obj instanceof Vo2MaxRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$22(Object obj) {
        return obj instanceof WeightRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$23(Object obj) {
        return obj instanceof WheelchairPushesRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$24(Object obj) {
        return obj instanceof BloodPressureRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$3(Object obj) {
        return obj instanceof IntermenstrualBleedingRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$4(Object obj) {
        return obj instanceof LeanBodyMassRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$5(Object obj) {
        return obj instanceof MenstruationFlowRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$6(Object obj) {
        return obj instanceof MenstruationPeriodRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$7(Object obj) {
        return obj instanceof NutritionRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$8(Object obj) {
        return obj instanceof OvulationTestRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$9(Object obj) {
        return obj instanceof BasalMetabolicRateRecord;
    }
}
