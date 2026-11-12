package androidx.health.connect.client.records;

import androidx.health.connect.client.units.Volume;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class HydrationRecord$Companion$VOLUME_TOTAL$1 extends FunctionReferenceImpl implements Function1<Double, Volume> {
    public HydrationRecord$Companion$VOLUME_TOTAL$1(Object obj) {
        super(1, obj, Volume.Companion.class, "liters", "liters(D)Landroidx/health/connect/client/units/Volume;", 0);
    }

    @NotNull
    public final Volume invoke(double d) {
        return ((Volume.Companion) this.receiver).liters(d);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Volume invoke2(Double d) {
        return invoke(d.doubleValue());
    }
}
