package t8;

import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.WeightRecord;
import android.health.connect.datatypes.units.Mass;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e {
    public static /* synthetic */ WeightRecord.Builder e(Metadata metadata, Instant instant, Mass mass) {
        return new WeightRecord.Builder(metadata, instant, mass);
    }

    public static /* synthetic */ void f() {
    }
}
