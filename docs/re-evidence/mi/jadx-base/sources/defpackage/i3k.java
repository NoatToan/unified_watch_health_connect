package defpackage;

import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.units.Power;
import java.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i3k {
    public static /* synthetic */ PowerRecord.PowerRecordSample a(Power power, Instant instant) {
        return new PowerRecord.PowerRecordSample(power, instant);
    }
}
