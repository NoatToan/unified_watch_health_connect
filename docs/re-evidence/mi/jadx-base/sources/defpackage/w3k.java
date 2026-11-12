package defpackage;

import android.health.connect.datatypes.BloodPressureRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.units.Pressure;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w3k {
    public static /* synthetic */ BloodPressureRecord.Builder a(Metadata metadata, Instant instant, int i, Pressure pressure, Pressure pressure2, int i2) {
        return new BloodPressureRecord.Builder(metadata, instant, i, pressure, pressure2, i2);
    }
}
