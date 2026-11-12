package androidx.health.connect.client.impl.platform.records;

import android.health.connect.datatypes.CyclingPedalingCadenceRecord;
import android.health.connect.datatypes.DataOrigin;
import android.health.connect.datatypes.Device;
import android.health.connect.datatypes.ExerciseCompletionGoal;
import android.health.connect.datatypes.ExercisePerformanceGoal;
import android.health.connect.datatypes.IntermenstrualBleedingRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.units.Energy;
import android.health.connect.datatypes.units.Length;
import java.time.Duration;
import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RecordConvertersKt$$ExternalSyntheticApiModelOutline0 {
    public static /* synthetic */ CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample m(double d, Instant instant) {
        return new CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample(d, instant);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ DataOrigin.Builder m128m() {
        return new DataOrigin.Builder();
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ Device.Builder m130m() {
        return new Device.Builder();
    }

    public static /* synthetic */ ExerciseCompletionGoal.ActiveCaloriesBurnedGoal m(Energy energy) {
        return new ExerciseCompletionGoal.ActiveCaloriesBurnedGoal(energy);
    }

    public static /* synthetic */ ExerciseCompletionGoal.DistanceGoal m(Length length) {
        return new ExerciseCompletionGoal.DistanceGoal(length);
    }

    public static /* synthetic */ ExerciseCompletionGoal.DistanceWithVariableRestGoal m(Length length, Duration duration) {
        return new ExerciseCompletionGoal.DistanceWithVariableRestGoal(length, duration);
    }

    public static /* synthetic */ ExerciseCompletionGoal.DurationGoal m(Duration duration) {
        return new ExerciseCompletionGoal.DurationGoal(duration);
    }

    public static /* synthetic */ ExerciseCompletionGoal.RepetitionsGoal m(int i) {
        return new ExerciseCompletionGoal.RepetitionsGoal(i);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ ExerciseCompletionGoal.StepsGoal m132m(int i) {
        return new ExerciseCompletionGoal.StepsGoal(i);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ ExerciseCompletionGoal.TotalCaloriesBurnedGoal m133m(Energy energy) {
        return new ExerciseCompletionGoal.TotalCaloriesBurnedGoal(energy);
    }

    public static /* bridge */ /* synthetic */ ExerciseCompletionGoal m(Object obj) {
        return (ExerciseCompletionGoal) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ExercisePerformanceGoal.SpeedGoal m134m(Object obj) {
        return (ExercisePerformanceGoal.SpeedGoal) obj;
    }

    public static /* synthetic */ IntermenstrualBleedingRecord.Builder m(Metadata metadata, Instant instant) {
        return new IntermenstrualBleedingRecord.Builder(metadata, instant);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ Metadata.Builder m135m() {
        return new Metadata.Builder();
    }

    public static /* synthetic */ SleepSessionRecord.Builder m(Metadata metadata, Instant instant, Instant instant2) {
        return new SleepSessionRecord.Builder(metadata, instant, instant2);
    }

    public static /* synthetic */ SpeedRecord.Builder m(Metadata metadata, Instant instant, Instant instant2, List list) {
        return new SpeedRecord.Builder(metadata, instant, instant2, list);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m146m() {
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m147m(Object obj) {
        return obj instanceof ExercisePerformanceGoal.SpeedGoal;
    }

    /* JADX INFO: renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m148m$1() {
    }

    /* JADX INFO: renamed from: m$2, reason: collision with other method in class */
    public static /* synthetic */ void m149m$2() {
    }

    /* JADX INFO: renamed from: m$3, reason: collision with other method in class */
    public static /* synthetic */ void m150m$3() {
    }

    /* JADX INFO: renamed from: m$4, reason: collision with other method in class */
    public static /* synthetic */ void m151m$4() {
    }

    /* JADX INFO: renamed from: m$5, reason: collision with other method in class */
    public static /* synthetic */ void m152m$5() {
    }

    /* JADX INFO: renamed from: m$6, reason: collision with other method in class */
    public static /* synthetic */ void m153m$6() {
    }
}
