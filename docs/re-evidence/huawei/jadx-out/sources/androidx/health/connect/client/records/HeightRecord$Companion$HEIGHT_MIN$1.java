package androidx.health.connect.client.records;

import androidx.health.connect.client.units.Length;
import defpackage.zcn;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class HeightRecord$Companion$HEIGHT_MIN$1 extends zcn implements Function1<Double, Length> {
    public final Length invoke(double d) {
        return ((Length.Companion) this.receiver).meters(d);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Length invoke(Double d) {
        return invoke(d.doubleValue());
    }

    HeightRecord$Companion$HEIGHT_MIN$1(Object obj) {
        super(1, obj, Length.Companion.class, "meters", "meters(D)Landroidx/health/connect/client/units/Length;", 0);
    }
}
