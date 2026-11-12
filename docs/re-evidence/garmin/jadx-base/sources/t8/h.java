package t8;

import android.health.connect.datatypes.HeartRateRecord;
import android.health.connect.datatypes.HydrationRecord;
import android.health.connect.datatypes.IntermenstrualBleedingRecord;
import android.health.connect.datatypes.MenstruationFlowRecord;
import android.health.connect.datatypes.MenstruationPeriodRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.NutritionRecord;
import android.health.connect.datatypes.OvulationTestRecord;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.SexualActivityRecord;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.StepsCadenceRecord;
import android.health.connect.datatypes.Vo2MaxRecord;
import android.health.connect.datatypes.units.Power;
import android.health.connect.datatypes.units.Volume;
import java.time.Instant;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h {
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ HeartRateRecord.Builder b(Metadata metadata, Instant instant, Instant instant2, ArrayList arrayList) {
        return new HeartRateRecord.Builder(metadata, instant, instant2, arrayList);
    }

    public static /* synthetic */ HeartRateRecord.HeartRateSample c(Instant instant, long j8) {
        return new HeartRateRecord.HeartRateSample(j8, instant);
    }

    public static /* synthetic */ HydrationRecord.Builder d(Metadata metadata, Instant instant, Instant instant2, Volume volume) {
        return new HydrationRecord.Builder(metadata, instant, instant2, volume);
    }

    public static /* synthetic */ IntermenstrualBleedingRecord.Builder e(Metadata metadata, Instant instant) {
        return new IntermenstrualBleedingRecord.Builder(metadata, instant);
    }

    public static /* synthetic */ MenstruationFlowRecord.Builder f(Metadata metadata, Instant instant, int i14) {
        return new MenstruationFlowRecord.Builder(metadata, instant, i14);
    }

    public static /* synthetic */ MenstruationPeriodRecord.Builder g(Metadata metadata, Instant instant, Instant instant2) {
        return new MenstruationPeriodRecord.Builder(metadata, instant, instant2);
    }

    public static /* synthetic */ NutritionRecord.Builder h(Metadata metadata, Instant instant, Instant instant2) {
        return new NutritionRecord.Builder(metadata, instant, instant2);
    }

    public static /* synthetic */ OvulationTestRecord.Builder i(Metadata metadata, Instant instant, int i14) {
        return new OvulationTestRecord.Builder(metadata, instant, i14);
    }

    public static /* synthetic */ PowerRecord.PowerRecordSample j(Power power, Instant instant) {
        return new PowerRecord.PowerRecordSample(power, instant);
    }

    public static /* synthetic */ SexualActivityRecord.Builder k(Metadata metadata, Instant instant, int i14) {
        return new SexualActivityRecord.Builder(metadata, instant, i14);
    }

    public static /* synthetic */ SleepSessionRecord.Builder l(Metadata metadata, Instant instant, Instant instant2) {
        return new SleepSessionRecord.Builder(metadata, instant, instant2);
    }

    public static /* synthetic */ StepsCadenceRecord.Builder m(Metadata metadata, Instant instant, Instant instant2, ArrayList arrayList) {
        return new StepsCadenceRecord.Builder(metadata, instant, instant2, arrayList);
    }

    public static /* synthetic */ StepsCadenceRecord.StepsCadenceRecordSample n(Instant instant, double d14) {
        return new StepsCadenceRecord.StepsCadenceRecordSample(d14, instant);
    }

    public static /* synthetic */ Vo2MaxRecord.Builder o(Metadata metadata, Instant instant, int i14, double d14) {
        return new Vo2MaxRecord.Builder(metadata, instant, i14, d14);
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ void s() {
    }

    public static /* synthetic */ void t() {
    }

    public static /* synthetic */ void u() {
    }

    public static /* synthetic */ void v() {
    }

    public static /* synthetic */ void w() {
    }

    public static /* synthetic */ void x() {
    }

    public static /* synthetic */ void y() {
    }

    public static /* synthetic */ void z() {
    }
}
