package defpackage;

import android.health.connect.datatypes.BoneMassRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.units.Mass;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a5k {
    public static /* synthetic */ BoneMassRecord.Builder a(Metadata metadata, Instant instant, Mass mass) {
        return new BoneMassRecord.Builder(metadata, instant, mass);
    }
}
