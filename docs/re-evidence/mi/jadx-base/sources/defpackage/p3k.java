package defpackage;

import android.health.connect.datatypes.ActiveCaloriesBurnedRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.units.Energy;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p3k {
    public static /* synthetic */ ActiveCaloriesBurnedRecord.Builder a(Metadata metadata, Instant instant, Instant instant2, Energy energy) {
        return new ActiveCaloriesBurnedRecord.Builder(metadata, instant, instant2, energy);
    }
}
