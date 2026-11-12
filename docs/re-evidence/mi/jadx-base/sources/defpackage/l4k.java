package defpackage;

import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.RespiratoryRateRecord;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l4k {
    public static /* synthetic */ RespiratoryRateRecord.Builder a(Metadata metadata, Instant instant, double d) {
        return new RespiratoryRateRecord.Builder(metadata, instant, d);
    }
}
