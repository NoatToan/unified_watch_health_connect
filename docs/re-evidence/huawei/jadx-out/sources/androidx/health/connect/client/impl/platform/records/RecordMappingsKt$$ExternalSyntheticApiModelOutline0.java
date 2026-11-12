package androidx.health.connect.client.impl.platform.records;

import android.health.connect.datatypes.ActiveCaloriesBurnedRecord;
import android.health.connect.datatypes.BasalBodyTemperatureRecord;
import android.health.connect.datatypes.BasalMetabolicRateRecord;
import android.health.connect.datatypes.BloodGlucoseRecord;
import android.health.connect.datatypes.BloodPressureRecord;
import android.health.connect.datatypes.BodyFatRecord;
import android.health.connect.datatypes.BodyTemperatureRecord;
import android.health.connect.datatypes.BodyWaterMassRecord;
import android.health.connect.datatypes.BoneMassRecord;
import android.health.connect.datatypes.CervicalMucusRecord;
import android.health.connect.datatypes.CyclingPedalingCadenceRecord;
import android.health.connect.datatypes.DistanceRecord;
import android.health.connect.datatypes.ElevationGainedRecord;
import android.health.connect.datatypes.ExercisePerformanceGoal;
import android.health.connect.datatypes.ExerciseSessionRecord;
import android.health.connect.datatypes.FloorsClimbedRecord;
import android.health.connect.datatypes.HeartRateRecord;
import android.health.connect.datatypes.HeartRateVariabilityRmssdRecord;
import android.health.connect.datatypes.HeightRecord;
import android.health.connect.datatypes.HydrationRecord;
import android.health.connect.datatypes.IntermenstrualBleedingRecord;
import android.health.connect.datatypes.LeanBodyMassRecord;
import android.health.connect.datatypes.MenstruationFlowRecord;
import android.health.connect.datatypes.MenstruationPeriodRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.MindfulnessSessionRecord;
import android.health.connect.datatypes.NutritionRecord;
import android.health.connect.datatypes.OvulationTestRecord;
import android.health.connect.datatypes.OxygenSaturationRecord;
import android.health.connect.datatypes.PlannedExerciseSessionRecord;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.RespiratoryRateRecord;
import android.health.connect.datatypes.RestingHeartRateRecord;
import android.health.connect.datatypes.SexualActivityRecord;
import android.health.connect.datatypes.SkinTemperatureRecord;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.StepsCadenceRecord;
import android.health.connect.datatypes.StepsRecord;
import android.health.connect.datatypes.TotalCaloriesBurnedRecord;
import android.health.connect.datatypes.Vo2MaxRecord;
import android.health.connect.datatypes.WeightRecord;
import android.health.connect.datatypes.WheelchairPushesRecord;
import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RecordMappingsKt$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ ExercisePerformanceGoal.CadenceGoal m(Object obj) {
        return (ExercisePerformanceGoal.CadenceGoal) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ExercisePerformanceGoal.HeartRateGoal m395m(Object obj) {
        return (ExercisePerformanceGoal.HeartRateGoal) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ExercisePerformanceGoal.PowerGoal m396m(Object obj) {
        return (ExercisePerformanceGoal.PowerGoal) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ExercisePerformanceGoal.RateOfPerceivedExertionGoal m397m(Object obj) {
        return (ExercisePerformanceGoal.RateOfPerceivedExertionGoal) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ExercisePerformanceGoal.WeightGoal m398m(Object obj) {
        return (ExercisePerformanceGoal.WeightGoal) obj;
    }

    public static /* synthetic */ FloorsClimbedRecord.Builder m(Metadata metadata, Instant instant, Instant instant2, double d) {
        return new FloorsClimbedRecord.Builder(metadata, instant, instant2, d);
    }

    public static /* synthetic */ StepsCadenceRecord.Builder m(Metadata metadata, Instant instant, Instant instant2, List list) {
        return new StepsCadenceRecord.Builder(metadata, instant, instant2, list);
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return PlannedExerciseSessionRecord.class;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m412m(Object obj) {
        return obj instanceof ExercisePerformanceGoal.PowerGoal;
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return OvulationTestRecord.class;
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof ExercisePerformanceGoal.CadenceGoal;
    }

    public static /* bridge */ /* synthetic */ Class m$10() {
        return SpeedRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$11() {
        return HeartRateVariabilityRmssdRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$12() {
        return StepsCadenceRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$13() {
        return StepsRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$14() {
        return BoneMassRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$15() {
        return TotalCaloriesBurnedRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$16() {
        return Vo2MaxRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$17() {
        return WeightRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$18() {
        return ActiveCaloriesBurnedRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$19() {
        return WheelchairPushesRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return BodyWaterMassRecord.class;
    }

    public static /* bridge */ /* synthetic */ boolean m$2(Object obj) {
        return obj instanceof ExercisePerformanceGoal.HeartRateGoal;
    }

    public static /* bridge */ /* synthetic */ Class m$20() {
        return BasalBodyTemperatureRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$21() {
        return BasalMetabolicRateRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$22() {
        return SkinTemperatureRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$23() {
        return BloodGlucoseRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$24() {
        return BloodPressureRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$25() {
        return BodyFatRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$26() {
        return CervicalMucusRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$27() {
        return BodyTemperatureRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$28() {
        return CyclingPedalingCadenceRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$29() {
        return DistanceRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$3() {
        return OxygenSaturationRecord.class;
    }

    public static /* bridge */ /* synthetic */ boolean m$3(Object obj) {
        return obj instanceof ExercisePerformanceGoal.WeightGoal;
    }

    public static /* bridge */ /* synthetic */ Class m$30() {
        return ElevationGainedRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$31() {
        return ExerciseSessionRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$32() {
        return FloorsClimbedRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$33() {
        return HeightRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$34() {
        return HeartRateRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$35() {
        return HydrationRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$36() {
        return IntermenstrualBleedingRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$37() {
        return LeanBodyMassRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$38() {
        return MenstruationFlowRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$39() {
        return MenstruationPeriodRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$4() {
        return PowerRecord.class;
    }

    public static /* bridge */ /* synthetic */ boolean m$4(Object obj) {
        return obj instanceof ExercisePerformanceGoal.RateOfPerceivedExertionGoal;
    }

    public static /* bridge */ /* synthetic */ Class m$40() {
        return NutritionRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$5() {
        return MindfulnessSessionRecord.class;
    }

    public static /* bridge */ /* synthetic */ boolean m$5(Object obj) {
        return obj instanceof ExercisePerformanceGoal.AmrapGoal;
    }

    public static /* bridge */ /* synthetic */ Class m$6() {
        return RespiratoryRateRecord.class;
    }

    public static /* bridge */ /* synthetic */ boolean m$6(Object obj) {
        return obj instanceof ExercisePerformanceGoal.UnknownGoal;
    }

    public static /* bridge */ /* synthetic */ Class m$7() {
        return RestingHeartRateRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$8() {
        return SexualActivityRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class m$9() {
        return SleepSessionRecord.class;
    }
}
