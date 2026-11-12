package defpackage;

import android.health.connect.datatypes.DistanceRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.units.Length;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e4k {
    public static /* synthetic */ DistanceRecord.Builder a(Metadata metadata, Instant instant, Instant instant2, Length length) {
        return new DistanceRecord.Builder(metadata, instant, instant2, length);
    }
}
