package defpackage;

import android.health.connect.datatypes.LeanBodyMassRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.units.Mass;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j4k {
    public static /* synthetic */ LeanBodyMassRecord.Builder a(Metadata metadata, Instant instant, Mass mass) {
        return new LeanBodyMassRecord.Builder(metadata, instant, mass);
    }
}
