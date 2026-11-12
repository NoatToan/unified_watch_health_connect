package defpackage;

import android.health.connect.datatypes.ElevationGainedRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.units.Length;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y4k {
    public static /* synthetic */ ElevationGainedRecord.Builder a(Metadata metadata, Instant instant, Instant instant2, Length length) {
        return new ElevationGainedRecord.Builder(metadata, instant, instant2, length);
    }
}
