package androidx.health.connect.client.impl.platform.records;

import android.health.connect.datatypes.BodyFatRecord;
import android.health.connect.datatypes.ExerciseCompletionGoal;
import android.health.connect.datatypes.ExerciseLap;
import android.health.connect.datatypes.ExerciseSegment;
import android.health.connect.datatypes.HeartRateRecord;
import android.health.connect.datatypes.HydrationRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.MindfulnessSessionRecord;
import android.health.connect.datatypes.OvulationTestRecord;
import android.health.connect.datatypes.PlannedExerciseStep;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.SexualActivityRecord;
import android.health.connect.datatypes.StepsRecord;
import android.health.connect.datatypes.units.Percentage;
import android.health.connect.datatypes.units.Power;
import android.health.connect.datatypes.units.Volume;
import java.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RecordConvertersKt$$ExternalSyntheticApiModelOutline4 {
    public static /* synthetic */ BodyFatRecord.Builder m(Metadata metadata, Instant instant, Percentage percentage) {
        return new BodyFatRecord.Builder(metadata, instant, percentage);
    }

    public static /* bridge */ /* synthetic */ ExerciseLap m(Object obj) {
        return (ExerciseLap) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ExerciseSegment m252m(Object obj) {
        return (ExerciseSegment) obj;
    }

    public static /* synthetic */ HeartRateRecord.HeartRateSample m(long j, Instant instant) {
        return new HeartRateRecord.HeartRateSample(j, instant);
    }

    public static /* synthetic */ HydrationRecord.Builder m(Metadata metadata, Instant instant, Instant instant2, Volume volume) {
        return new HydrationRecord.Builder(metadata, instant, instant2, volume);
    }

    public static /* synthetic */ OvulationTestRecord.Builder m(Metadata metadata, Instant instant, int i) {
        return new OvulationTestRecord.Builder(metadata, instant, i);
    }

    public static /* synthetic */ PlannedExerciseStep.Builder m(int i, int i2, ExerciseCompletionGoal exerciseCompletionGoal) {
        return new PlannedExerciseStep.Builder(i, i2, exerciseCompletionGoal);
    }

    public static /* synthetic */ PowerRecord.PowerRecordSample m(Power power, Instant instant) {
        return new PowerRecord.PowerRecordSample(power, instant);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ SexualActivityRecord.Builder m256m(Metadata metadata, Instant instant, int i) {
        return new SexualActivityRecord.Builder(metadata, instant, i);
    }

    public static /* synthetic */ StepsRecord.Builder m(Metadata metadata, Instant instant, Instant instant2, long j) {
        return new StepsRecord.Builder(metadata, instant, instant2, j);
    }

    public static /* synthetic */ void m() {
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m282m(Object obj) {
        return obj instanceof MindfulnessSessionRecord;
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
