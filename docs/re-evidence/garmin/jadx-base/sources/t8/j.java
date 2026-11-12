package t8;

import android.health.connect.datatypes.ElevationGainedRecord;
import android.health.connect.datatypes.ExerciseSessionRecord;
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
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.TotalCaloriesBurnedRecord;
import android.health.connect.datatypes.units.Energy;
import android.health.connect.datatypes.units.Length;
import java.time.Instant;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j {
    public static /* synthetic */ ElevationGainedRecord.Builder a(Metadata metadata, Instant instant, Instant instant2, Length length) {
        return new ElevationGainedRecord.Builder(metadata, instant, instant2, length);
    }

    public static /* synthetic */ ExerciseSessionRecord.Builder b(Metadata metadata, Instant instant, Instant instant2, int i14) {
        return new ExerciseSessionRecord.Builder(metadata, instant, instant2, i14);
    }

    public static /* synthetic */ PowerRecord.Builder c(Metadata metadata, Instant instant, Instant instant2, ArrayList arrayList) {
        return new PowerRecord.Builder(metadata, instant, instant2, arrayList);
    }

    public static /* synthetic */ SleepSessionRecord.Stage e(Instant instant, Instant instant2, int i14) {
        return new SleepSessionRecord.Stage(instant, instant2, i14);
    }

    public static /* synthetic */ SpeedRecord.Builder f(Metadata metadata, Instant instant, Instant instant2, ArrayList arrayList) {
        return new SpeedRecord.Builder(metadata, instant, instant2, arrayList);
    }

    public static /* synthetic */ TotalCaloriesBurnedRecord.Builder g(Metadata metadata, Instant instant, Instant instant2, Energy energy) {
        return new TotalCaloriesBurnedRecord.Builder(metadata, instant, instant2, energy);
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return HeartRateRecord.class;
    }

    public static /* synthetic */ void j() {
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return HeartRateVariabilityRmssdRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class o() {
        return HeightRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class p() {
        return HydrationRecord.class;
    }

    public static /* synthetic */ void q() {
    }

    public static /* bridge */ /* synthetic */ Class r() {
        return IntermenstrualBleedingRecord.class;
    }

    public static /* synthetic */ void s() {
    }

    public static /* bridge */ /* synthetic */ Class t() {
        return LeanBodyMassRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class u() {
        return MenstruationFlowRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class v() {
        return MenstruationPeriodRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class w() {
        return NutritionRecord.class;
    }
}
