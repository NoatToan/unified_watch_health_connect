package androidx.health.connect.client.impl.platform.records;

import android.health.connect.datatypes.ActiveCaloriesBurnedRecord;
import android.health.connect.datatypes.BasalBodyTemperatureRecord;
import android.health.connect.datatypes.BasalMetabolicRateRecord;
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
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.MindfulnessSessionRecord;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.StepsCadenceRecord;
import android.health.connect.datatypes.units.Power;
import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RecordConvertersKt$$ExternalSyntheticApiModelOutline2 {
    public static /* bridge */ /* synthetic */ ActiveCaloriesBurnedRecord m(Object obj) {
        return (ActiveCaloriesBurnedRecord) obj;
    }

    public static /* synthetic */ BasalMetabolicRateRecord.Builder m(Metadata metadata, Instant instant, Power power) {
        return new BasalMetabolicRateRecord.Builder(metadata, instant, power);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ BodyFatRecord m168m(Object obj) {
        return (BodyFatRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ BodyTemperatureRecord m169m(Object obj) {
        return (BodyTemperatureRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ BodyWaterMassRecord m170m(Object obj) {
        return (BodyWaterMassRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ BoneMassRecord m171m(Object obj) {
        return (BoneMassRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ CervicalMucusRecord m172m(Object obj) {
        return (CervicalMucusRecord) obj;
    }

    public static /* synthetic */ CyclingPedalingCadenceRecord.Builder m(Metadata metadata, Instant instant, Instant instant2, List list) {
        return new CyclingPedalingCadenceRecord.Builder(metadata, instant, instant2, list);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample m173m(Object obj) {
        return (CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ CyclingPedalingCadenceRecord m174m(Object obj) {
        return (CyclingPedalingCadenceRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ DistanceRecord m175m(Object obj) {
        return (DistanceRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ElevationGainedRecord m176m(Object obj) {
        return (ElevationGainedRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ExercisePerformanceGoal m178m(Object obj) {
        return (ExercisePerformanceGoal) obj;
    }

    public static /* synthetic */ ExerciseSessionRecord.Builder m(Metadata metadata, Instant instant, Instant instant2, int i) {
        return new ExerciseSessionRecord.Builder(metadata, instant, instant2, i);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ExerciseSessionRecord m179m(Object obj) {
        return (ExerciseSessionRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ FloorsClimbedRecord m180m(Object obj) {
        return (FloorsClimbedRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ HeartRateRecord m181m(Object obj) {
        return (HeartRateRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ MindfulnessSessionRecord.Builder m183m(Metadata metadata, Instant instant, Instant instant2, int i) {
        return new MindfulnessSessionRecord.Builder(metadata, instant, instant2, i);
    }

    public static /* synthetic */ SleepSessionRecord.Stage m(Instant instant, Instant instant2, int i) {
        return new SleepSessionRecord.Stage(instant, instant2, i);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ StepsCadenceRecord.StepsCadenceRecordSample m184m(Object obj) {
        return (StepsCadenceRecord.StepsCadenceRecordSample) obj;
    }

    public static /* synthetic */ void m() {
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m207m(Object obj) {
        return obj instanceof ActiveCaloriesBurnedRecord;
    }

    public static /* synthetic */ void m$1() {
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof BodyFatRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$10(Object obj) {
        return obj instanceof FloorsClimbedRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$11(Object obj) {
        return obj instanceof BasalBodyTemperatureRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$12(Object obj) {
        return obj instanceof HeartRateRecord;
    }

    public static /* synthetic */ void m$2() {
    }

    public static /* bridge */ /* synthetic */ boolean m$2(Object obj) {
        return obj instanceof BodyTemperatureRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$3(Object obj) {
        return obj instanceof BodyWaterMassRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$4(Object obj) {
        return obj instanceof BoneMassRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$5(Object obj) {
        return obj instanceof CervicalMucusRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$6(Object obj) {
        return obj instanceof CyclingPedalingCadenceRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$7(Object obj) {
        return obj instanceof DistanceRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$8(Object obj) {
        return obj instanceof ElevationGainedRecord;
    }

    public static /* bridge */ /* synthetic */ boolean m$9(Object obj) {
        return obj instanceof ExerciseSessionRecord;
    }
}
