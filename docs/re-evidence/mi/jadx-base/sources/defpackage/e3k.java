package defpackage;

import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.OvulationTestRecord;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e3k {
    public static /* synthetic */ OvulationTestRecord.Builder a(Metadata metadata, Instant instant, int i) {
        return new OvulationTestRecord.Builder(metadata, instant, i);
    }
}
