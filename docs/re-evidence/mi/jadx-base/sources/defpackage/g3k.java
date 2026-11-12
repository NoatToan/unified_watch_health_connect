package defpackage;

import android.health.connect.datatypes.HydrationRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.units.Volume;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g3k {
    public static /* synthetic */ HydrationRecord.Builder a(Metadata metadata, Instant instant, Instant instant2, Volume volume) {
        return new HydrationRecord.Builder(metadata, instant, instant2, volume);
    }
}
