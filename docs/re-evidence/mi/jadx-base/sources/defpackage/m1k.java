package defpackage;

import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.PowerRecord;
import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m1k {
    public static /* synthetic */ PowerRecord.Builder a(Metadata metadata, Instant instant, Instant instant2, List list) {
        return new PowerRecord.Builder(metadata, instant, instant2, list);
    }
}
