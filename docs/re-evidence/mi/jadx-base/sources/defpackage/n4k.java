package defpackage;

import android.health.connect.datatypes.BasalBodyTemperatureRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.units.Temperature;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n4k {
    public static /* synthetic */ BasalBodyTemperatureRecord.Builder a(Metadata metadata, Instant instant, int i, Temperature temperature) {
        return new BasalBodyTemperatureRecord.Builder(metadata, instant, i, temperature);
    }
}
