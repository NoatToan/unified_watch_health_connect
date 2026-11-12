package defpackage;

import android.health.connect.datatypes.BasalMetabolicRateRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.units.Power;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n2k {
    public static /* synthetic */ BasalMetabolicRateRecord.Builder a(Metadata metadata, Instant instant, Power power) {
        return new BasalMetabolicRateRecord.Builder(metadata, instant, power);
    }
}
