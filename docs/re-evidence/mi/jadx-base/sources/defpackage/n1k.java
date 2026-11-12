package defpackage;

import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.units.Velocity;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n1k {
    public static /* synthetic */ SpeedRecord.SpeedRecordSample a(Velocity velocity, Instant instant) {
        return new SpeedRecord.SpeedRecordSample(velocity, instant);
    }
}
