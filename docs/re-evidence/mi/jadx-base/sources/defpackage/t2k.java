package defpackage;

import android.health.connect.datatypes.HeartRateRecord;
import android.health.connect.datatypes.Metadata;
import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t2k {
    public static /* synthetic */ HeartRateRecord.Builder a(Metadata metadata, Instant instant, Instant instant2, List list) {
        return new HeartRateRecord.Builder(metadata, instant, instant2, list);
    }
}
