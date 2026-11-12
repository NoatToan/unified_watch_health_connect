package rs;

import c22.l3;
import c22.q3;
import f12.l;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrs/i;", "", "Ll22/a;", "resolver", "<init>", "(Ll22/a;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.a f154322a;

    public i(l22.a aVar) {
        aVar.getClass();
        this.f154322a = aVar;
    }

    public static long a(double d14) {
        l3.f23124b.getClass();
        if (!Double.isNaN(d14) && d14 != 0.0d) {
            d14 *= 1.15078d;
        }
        if (((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y()) {
            d14 = l3.a.w(d14, q3.MILE_PER_HOUR, q3.KILOMETER_PER_HOUR);
        }
        return MathKt.d(d14);
    }
}
