package defpackage;

import android.health.connect.datatypes.BodyFatRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.units.Percentage;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l3k {
    public static /* synthetic */ BodyFatRecord.Builder a(Metadata metadata, Instant instant, Percentage percentage) {
        return new BodyFatRecord.Builder(metadata, instant, percentage);
    }
}
