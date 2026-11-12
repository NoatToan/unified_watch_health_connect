package androidx.health.connect.client.impl.platform.records;

import android.health.connect.datatypes.MenstruationFlowRecord;
import android.health.connect.datatypes.MenstruationPeriodRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.NutritionRecord;
import android.health.connect.datatypes.PlannedExerciseSessionRecord;
import android.health.connect.datatypes.SkinTemperatureRecord;
import android.health.connect.datatypes.WeightRecord;
import android.health.connect.datatypes.units.Mass;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RecordConvertersKt$$ExternalSyntheticApiModelOutline1 {
    public static /* synthetic */ MenstruationFlowRecord.Builder m(Metadata metadata, Instant instant, int i) {
        return new MenstruationFlowRecord.Builder(metadata, instant, i);
    }

    public static /* synthetic */ MenstruationPeriodRecord.Builder m(Metadata metadata, Instant instant, Instant instant2) {
        return new MenstruationPeriodRecord.Builder(metadata, instant, instant2);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ NutritionRecord.Builder m157m(Metadata metadata, Instant instant, Instant instant2) {
        return new NutritionRecord.Builder(metadata, instant, instant2);
    }

    public static /* synthetic */ PlannedExerciseSessionRecord.Builder m(Metadata metadata, int i, Instant instant, Instant instant2) {
        return new PlannedExerciseSessionRecord.Builder(metadata, i, instant, instant2);
    }

    public static /* synthetic */ PlannedExerciseSessionRecord.Builder m(Metadata metadata, int i, LocalDate localDate, Duration duration) {
        return new PlannedExerciseSessionRecord.Builder(metadata, i, localDate, duration);
    }

    public static /* bridge */ /* synthetic */ SkinTemperatureRecord.Delta m(Object obj) {
        return (SkinTemperatureRecord.Delta) obj;
    }

    public static /* synthetic */ WeightRecord.Builder m(Metadata metadata, Instant instant, Mass mass) {
        return new WeightRecord.Builder(metadata, instant, mass);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m167m() {
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

    public static /* synthetic */ void m$8() {
    }

    public static /* synthetic */ void m$9() {
    }
}
