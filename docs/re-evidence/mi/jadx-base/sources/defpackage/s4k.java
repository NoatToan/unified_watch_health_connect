package defpackage;

import android.health.connect.datatypes.HeartRateVariabilityRmssdRecord;
import android.health.connect.datatypes.Metadata;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s4k {
    public static /* synthetic */ HeartRateVariabilityRmssdRecord.Builder a(Metadata metadata, Instant instant, double d) {
        return new HeartRateVariabilityRmssdRecord.Builder(metadata, instant, d);
    }
}
