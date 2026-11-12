package defpackage;

import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.TotalCaloriesBurnedRecord;
import android.health.connect.datatypes.units.Energy;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w4k {
    public static /* synthetic */ TotalCaloriesBurnedRecord.Builder a(Metadata metadata, Instant instant, Instant instant2, Energy energy) {
        return new TotalCaloriesBurnedRecord.Builder(metadata, instant, instant2, energy);
    }
}
