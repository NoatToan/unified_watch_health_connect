package defpackage;

import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.RestingHeartRateRecord;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u4k {
    public static /* synthetic */ RestingHeartRateRecord.Builder a(Metadata metadata, Instant instant, long j) {
        return new RestingHeartRateRecord.Builder(metadata, instant, j);
    }
}
