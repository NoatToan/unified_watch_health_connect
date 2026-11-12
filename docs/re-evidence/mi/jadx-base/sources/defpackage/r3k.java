package defpackage;

import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.OxygenSaturationRecord;
import android.health.connect.datatypes.units.Percentage;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r3k {
    public static /* synthetic */ OxygenSaturationRecord.Builder a(Metadata metadata, Instant instant, Percentage percentage) {
        return new OxygenSaturationRecord.Builder(metadata, instant, percentage);
    }
}
