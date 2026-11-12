package defpackage;

import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.SpeedRecord;
import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b2k {
    public static /* synthetic */ SpeedRecord.Builder a(Metadata metadata, Instant instant, Instant instant2, List list) {
        return new SpeedRecord.Builder(metadata, instant, instant2, list);
    }
}
