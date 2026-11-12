package androidx.health.connect.client.impl.platform.records;

import android.health.connect.datatypes.BasalBodyTemperatureRecord;
import android.health.connect.datatypes.BloodGlucoseRecord;
import android.health.connect.datatypes.HeartRateRecord;
import android.health.connect.datatypes.HeartRateVariabilityRmssdRecord;
import android.health.connect.datatypes.LeanBodyMassRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.MindfulnessSessionRecord;
import android.health.connect.datatypes.PlannedExerciseSessionRecord;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.RespiratoryRateRecord;
import android.health.connect.datatypes.RestingHeartRateRecord;
import android.health.connect.datatypes.SkinTemperatureRecord;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.WheelchairPushesRecord;
import android.health.connect.datatypes.units.BloodGlucose;
import android.health.connect.datatypes.units.Mass;
import android.health.connect.datatypes.units.Temperature;
import android.health.connect.datatypes.units.TemperatureDelta;
import java.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RecordConvertersKt$$ExternalSyntheticApiModelOutline5 {
    public static /* synthetic */ BasalBodyTemperatureRecord.Builder m(Metadata metadata, Instant instant, int i, Temperature temperature) {
        return new BasalBodyTemperatureRecord.Builder(metadata, instant, i, temperature);
    }

    public static /* synthetic */ BloodGlucoseRecord.Builder m(Metadata metadata, Instant instant, int i, BloodGlucose bloodGlucose, int i2, int i3) {
        return new BloodGlucoseRecord.Builder(metadata, instant, i, bloodGlucose, i2, i3);
    }

    public static /* bridge */ /* synthetic */ HeartRateRecord.HeartRateSample m(Object obj) {
        return (HeartRateRecord.HeartRateSample) obj;
    }

    public static /* synthetic */ HeartRateVariabilityRmssdRecord.Builder m(Metadata metadata, Instant instant, double d) {
        return new HeartRateVariabilityRmssdRecord.Builder(metadata, instant, d);
    }

    public static /* synthetic */ LeanBodyMassRecord.Builder m(Metadata metadata, Instant instant, Mass mass) {
        return new LeanBodyMassRecord.Builder(metadata, instant, mass);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MindfulnessSessionRecord m293m(Object obj) {
        return (MindfulnessSessionRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ PlannedExerciseSessionRecord m294m(Object obj) {
        return (PlannedExerciseSessionRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ PowerRecord.PowerRecordSample m295m(Object obj) {
        return (PowerRecord.PowerRecordSample) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ RespiratoryRateRecord.Builder m296m(Metadata metadata, Instant instant, double d) {
        return new RespiratoryRateRecord.Builder(metadata, instant, d);
    }

    public static /* synthetic */ RestingHeartRateRecord.Builder m(Metadata metadata, Instant instant, long j) {
        return new RestingHeartRateRecord.Builder(metadata, instant, j);
    }

    public static /* synthetic */ SkinTemperatureRecord.Delta m(TemperatureDelta temperatureDelta, Instant instant) {
        return new SkinTemperatureRecord.Delta(temperatureDelta, instant);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ SkinTemperatureRecord m297m(Object obj) {
        return (SkinTemperatureRecord) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ SleepSessionRecord.Stage m298m(Object obj) {
        return (SleepSessionRecord.Stage) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ SpeedRecord.SpeedRecordSample m299m(Object obj) {
        return (SpeedRecord.SpeedRecordSample) obj;
    }

    public static /* synthetic */ WheelchairPushesRecord.Builder m(Metadata metadata, Instant instant, Instant instant2, long j) {
        return new WheelchairPushesRecord.Builder(metadata, instant, instant2, j);
    }

    public static /* synthetic */ void m() {
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m326m(Object obj) {
        return obj instanceof SkinTemperatureRecord;
    }

    public static /* synthetic */ void m$1() {
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
}
