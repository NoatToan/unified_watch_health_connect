package defpackage;

import android.health.connect.datatypes.BodyTemperatureRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.units.Temperature;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r1k {
    public static /* synthetic */ BodyTemperatureRecord.Builder a(Metadata metadata, Instant instant, int i, Temperature temperature) {
        return new BodyTemperatureRecord.Builder(metadata, instant, i, temperature);
    }
}
