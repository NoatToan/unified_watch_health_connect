package defpackage;

import android.health.connect.datatypes.BodyWaterMassRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.units.Mass;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k1k {
    public static /* synthetic */ BodyWaterMassRecord.Builder a(Metadata metadata, Instant instant, Mass mass) {
        return new BodyWaterMassRecord.Builder(metadata, instant, mass);
    }
}
