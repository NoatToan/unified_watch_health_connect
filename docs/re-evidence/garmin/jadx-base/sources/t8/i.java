package t8;

import android.health.connect.datatypes.HeartRateVariabilityRmssdRecord;
import android.health.connect.datatypes.HeightRecord;
import android.health.connect.datatypes.LeanBodyMassRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.OxygenSaturationRecord;
import android.health.connect.datatypes.RespiratoryRateRecord;
import android.health.connect.datatypes.RestingHeartRateRecord;
import android.health.connect.datatypes.StepsRecord;
import android.health.connect.datatypes.WheelchairPushesRecord;
import android.health.connect.datatypes.units.Length;
import android.health.connect.datatypes.units.Mass;
import android.health.connect.datatypes.units.Percentage;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i {
    public static /* synthetic */ HeartRateVariabilityRmssdRecord.Builder a(Metadata metadata, Instant instant, double d14) {
        return new HeartRateVariabilityRmssdRecord.Builder(metadata, instant, d14);
    }

    public static /* synthetic */ HeightRecord.Builder b(Metadata metadata, Instant instant, Length length) {
        return new HeightRecord.Builder(metadata, instant, length);
    }

    public static /* synthetic */ LeanBodyMassRecord.Builder c(Metadata metadata, Instant instant, Mass mass) {
        return new LeanBodyMassRecord.Builder(metadata, instant, mass);
    }

    public static /* synthetic */ OxygenSaturationRecord.Builder d(Metadata metadata, Instant instant, Percentage percentage) {
        return new OxygenSaturationRecord.Builder(metadata, instant, percentage);
    }

    public static /* synthetic */ RespiratoryRateRecord.Builder e(Metadata metadata, Instant instant, double d14) {
        return new RespiratoryRateRecord.Builder(metadata, instant, d14);
    }

    public static /* synthetic */ RestingHeartRateRecord.Builder f(Metadata metadata, Instant instant, long j8) {
        return new RestingHeartRateRecord.Builder(metadata, instant, j8);
    }

    public static /* synthetic */ StepsRecord.Builder g(Metadata metadata, Instant instant, Instant instant2, long j8) {
        return new StepsRecord.Builder(metadata, instant, instant2, j8);
    }

    public static /* synthetic */ WheelchairPushesRecord.Builder h(Metadata metadata, Instant instant, Instant instant2, long j8) {
        return new WheelchairPushesRecord.Builder(metadata, instant, instant2, j8);
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void m() {
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ void o() {
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void q() {
    }
}
