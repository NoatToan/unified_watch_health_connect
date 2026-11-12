package defpackage;

import android.health.connect.datatypes.CyclingPedalingCadenceRecord;
import android.health.connect.datatypes.Metadata;
import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q2k {
    public static /* synthetic */ CyclingPedalingCadenceRecord.Builder a(Metadata metadata, Instant instant, Instant instant2, List list) {
        return new CyclingPedalingCadenceRecord.Builder(metadata, instant, instant2, list);
    }
}
