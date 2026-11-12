package androidx.health.connect.client.impl.platform.records;

import android.health.connect.datatypes.BoneMassRecord;
import android.health.connect.datatypes.ElevationGainedRecord;
import android.health.connect.datatypes.ExerciseCompletionGoal;
import android.health.connect.datatypes.ExercisePerformanceGoal;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.SkinTemperatureRecord;
import android.health.connect.datatypes.TotalCaloriesBurnedRecord;
import android.health.connect.datatypes.units.Energy;
import android.health.connect.datatypes.units.Length;
import android.health.connect.datatypes.units.Mass;
import android.health.connect.datatypes.units.Power;
import android.health.connect.datatypes.units.Velocity;
import java.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RecordConvertersKt$$ExternalSyntheticApiModelOutline6 {
    public static /* synthetic */ BoneMassRecord.Builder m(Metadata metadata, Instant instant, Mass mass) {
        return new BoneMassRecord.Builder(metadata, instant, mass);
    }

    public static /* synthetic */ ElevationGainedRecord.Builder m(Metadata metadata, Instant instant, Instant instant2, Length length) {
        return new ElevationGainedRecord.Builder(metadata, instant, instant2, length);
    }

    public static /* bridge */ /* synthetic */ ExerciseCompletionGoal.ActiveCaloriesBurnedGoal m(Object obj) {
        return (ExerciseCompletionGoal.ActiveCaloriesBurnedGoal) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ExerciseCompletionGoal.DistanceGoal m363m(Object obj) {
        return (ExerciseCompletionGoal.DistanceGoal) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ExerciseCompletionGoal.DistanceWithVariableRestGoal m364m(Object obj) {
        return (ExerciseCompletionGoal.DistanceWithVariableRestGoal) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ExerciseCompletionGoal.DurationGoal m365m(Object obj) {
        return (ExerciseCompletionGoal.DurationGoal) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ExerciseCompletionGoal.RepetitionsGoal m366m(Object obj) {
        return (ExerciseCompletionGoal.RepetitionsGoal) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ExerciseCompletionGoal.StepsGoal m367m(Object obj) {
        return (ExerciseCompletionGoal.StepsGoal) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ExerciseCompletionGoal.TotalCaloriesBurnedGoal m368m(Object obj) {
        return (ExerciseCompletionGoal.TotalCaloriesBurnedGoal) obj;
    }

    public static /* synthetic */ ExercisePerformanceGoal.CadenceGoal m(double d, double d2) {
        return new ExercisePerformanceGoal.CadenceGoal(d, d2);
    }

    public static /* synthetic */ ExercisePerformanceGoal.HeartRateGoal m(int i, int i2) {
        return new ExercisePerformanceGoal.HeartRateGoal(i, i2);
    }

    public static /* synthetic */ ExercisePerformanceGoal.PowerGoal m(Power power, Power power2) {
        return new ExercisePerformanceGoal.PowerGoal(power, power2);
    }

    public static /* synthetic */ ExercisePerformanceGoal.RateOfPerceivedExertionGoal m(int i) {
        return new ExercisePerformanceGoal.RateOfPerceivedExertionGoal(i);
    }

    public static /* synthetic */ ExercisePerformanceGoal.SpeedGoal m(Velocity velocity, Velocity velocity2) {
        return new ExercisePerformanceGoal.SpeedGoal(velocity, velocity2);
    }

    public static /* synthetic */ ExercisePerformanceGoal.WeightGoal m(Mass mass) {
        return new ExercisePerformanceGoal.WeightGoal(mass);
    }

    public static /* synthetic */ SkinTemperatureRecord.Builder m(Metadata metadata, Instant instant, Instant instant2) {
        return new SkinTemperatureRecord.Builder(metadata, instant, instant2);
    }

    public static /* synthetic */ TotalCaloriesBurnedRecord.Builder m(Metadata metadata, Instant instant, Instant instant2, Energy energy) {
        return new TotalCaloriesBurnedRecord.Builder(metadata, instant, instant2, energy);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m390m() {
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m391m(Object obj) {
        return obj instanceof ExerciseCompletionGoal.DistanceGoal;
    }

    public static /* synthetic */ void m$1() {
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof ExerciseCompletionGoal.DurationGoal;
    }

    public static /* synthetic */ void m$2() {
    }

    public static /* bridge */ /* synthetic */ boolean m$2(Object obj) {
        return obj instanceof ExerciseCompletionGoal.RepetitionsGoal;
    }

    public static /* synthetic */ void m$3() {
    }

    public static /* bridge */ /* synthetic */ boolean m$3(Object obj) {
        return obj instanceof ExerciseCompletionGoal.TotalCaloriesBurnedGoal;
    }

    public static /* synthetic */ void m$4() {
    }

    public static /* bridge */ /* synthetic */ boolean m$4(Object obj) {
        return obj instanceof ExerciseCompletionGoal.ActiveCaloriesBurnedGoal;
    }

    public static /* synthetic */ void m$5() {
    }

    public static /* bridge */ /* synthetic */ boolean m$5(Object obj) {
        return obj instanceof ExerciseCompletionGoal.UnknownGoal;
    }

    public static /* synthetic */ void m$6() {
    }

    public static /* bridge */ /* synthetic */ boolean m$6(Object obj) {
        return obj instanceof ExerciseCompletionGoal.UnspecifiedGoal;
    }

    public static /* synthetic */ void m$7() {
    }

    public static /* bridge */ /* synthetic */ boolean m$7(Object obj) {
        return obj instanceof ExerciseCompletionGoal.DistanceWithVariableRestGoal;
    }

    public static /* synthetic */ void m$8() {
    }

    public static /* bridge */ /* synthetic */ boolean m$8(Object obj) {
        return obj instanceof ExerciseCompletionGoal.StepsGoal;
    }

    public static /* synthetic */ void m$9() {
    }
}
