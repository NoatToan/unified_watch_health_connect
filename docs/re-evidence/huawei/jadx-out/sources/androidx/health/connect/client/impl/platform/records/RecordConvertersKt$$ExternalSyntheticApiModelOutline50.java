package androidx.health.connect.client.impl.platform.records;

import android.health.connect.datatypes.ActiveCaloriesBurnedRecord;
import android.health.connect.datatypes.BloodPressureRecord;
import android.health.connect.datatypes.BodyTemperatureRecord;
import android.health.connect.datatypes.CervicalMucusRecord;
import android.health.connect.datatypes.DistanceRecord;
import android.health.connect.datatypes.ExerciseLap;
import android.health.connect.datatypes.ExerciseRoute;
import android.health.connect.datatypes.ExerciseSegment;
import android.health.connect.datatypes.HeightRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.OxygenSaturationRecord;
import android.health.connect.datatypes.PlannedExerciseBlock;
import android.health.connect.datatypes.PlannedExerciseSessionRecord;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.StepsCadenceRecord;
import android.health.connect.datatypes.units.Energy;
import android.health.connect.datatypes.units.Length;
import android.health.connect.datatypes.units.Percentage;
import android.health.connect.datatypes.units.Pressure;
import android.health.connect.datatypes.units.Temperature;
import android.health.connect.datatypes.units.Velocity;
import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RecordConvertersKt$$ExternalSyntheticApiModelOutline50 {
    public static /* synthetic */ ActiveCaloriesBurnedRecord.Builder m(Metadata metadata, Instant instant, Instant instant2, Energy energy) {
        return new ActiveCaloriesBurnedRecord.Builder(metadata, instant, instant2, energy);
    }

    public static /* synthetic */ BloodPressureRecord.Builder m(Metadata metadata, Instant instant, int i, Pressure pressure, Pressure pressure2, int i2) {
        return new BloodPressureRecord.Builder(metadata, instant, i, pressure, pressure2, i2);
    }

    public static /* synthetic */ BodyTemperatureRecord.Builder m(Metadata metadata, Instant instant, int i, Temperature temperature) {
        return new BodyTemperatureRecord.Builder(metadata, instant, i, temperature);
    }

    public static /* synthetic */ CervicalMucusRecord.Builder m(Metadata metadata, Instant instant, int i, int i2) {
        return new CervicalMucusRecord.Builder(metadata, instant, i, i2);
    }

    public static /* synthetic */ DistanceRecord.Builder m(Metadata metadata, Instant instant, Instant instant2, Length length) {
        return new DistanceRecord.Builder(metadata, instant, instant2, length);
    }

    public static /* synthetic */ ExerciseLap.Builder m(Instant instant, Instant instant2) {
        return new ExerciseLap.Builder(instant, instant2);
    }

    public static /* bridge */ /* synthetic */ ExerciseRoute.Location m(Object obj) {
        return (ExerciseRoute.Location) obj;
    }

    public static /* synthetic */ ExerciseSegment.Builder m(Instant instant, Instant instant2, int i) {
        return new ExerciseSegment.Builder(instant, instant2, i);
    }

    public static /* synthetic */ HeightRecord.Builder m(Metadata metadata, Instant instant, Length length) {
        return new HeightRecord.Builder(metadata, instant, length);
    }

    public static /* synthetic */ OxygenSaturationRecord.Builder m(Metadata metadata, Instant instant, Percentage percentage) {
        return new OxygenSaturationRecord.Builder(metadata, instant, percentage);
    }

    public static /* synthetic */ PlannedExerciseBlock.Builder m(int i) {
        return new PlannedExerciseBlock.Builder(i);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ PlannedExerciseBlock m335m(Object obj) {
        return (PlannedExerciseBlock) obj;
    }

    public static /* synthetic */ PowerRecord.Builder m(Metadata metadata, Instant instant, Instant instant2, List list) {
        return new PowerRecord.Builder(metadata, instant, instant2, list);
    }

    public static /* synthetic */ SpeedRecord.SpeedRecordSample m(Velocity velocity, Instant instant) {
        return new SpeedRecord.SpeedRecordSample(velocity, instant);
    }

    public static /* synthetic */ StepsCadenceRecord.StepsCadenceRecordSample m(double d, Instant instant) {
        return new StepsCadenceRecord.StepsCadenceRecordSample(d, instant);
    }

    public static /* synthetic */ void m() {
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m356m(Object obj) {
        return obj instanceof PlannedExerciseSessionRecord;
    }

    public static /* synthetic */ void m$1() {
    }

    public static /* synthetic */ void m$10() {
    }

    public static /* synthetic */ void m$11() {
    }

    public static /* synthetic */ void m$2() {
    }

    public static /* synthetic */ void m$3() {
    }

    public static /* synthetic */ void m$4() {
    }

    public static /* synthetic */ void m$5() {
    }

    public static /* synthetic */ void m$6() {
    }

    public static /* synthetic */ void m$7() {
    }

    public static /* synthetic */ void m$8() {
    }

    public static /* synthetic */ void m$9() {
    }
}
