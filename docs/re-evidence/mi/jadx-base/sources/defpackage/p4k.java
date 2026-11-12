package defpackage;

import android.health.connect.datatypes.BloodGlucoseRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.units.BloodGlucose;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p4k {
    public static /* synthetic */ BloodGlucoseRecord.Builder a(Metadata metadata, Instant instant, int i, BloodGlucose bloodGlucose, int i2, int i3) {
        return new BloodGlucoseRecord.Builder(metadata, instant, i, bloodGlucose, i2, i3);
    }
}
