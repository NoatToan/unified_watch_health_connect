package ef1;

import c22.l3;
import f12.l;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f63968a = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();

    public static final float a(Integer num) {
        double dIntValue;
        double d14;
        if (num == null) {
            return 0.0f;
        }
        if (f63968a) {
            l3.a aVar = l3.f23124b;
            dIntValue = num.intValue();
            aVar.getClass();
            d14 = 1000.0d;
        } else {
            l3.a aVar2 = l3.f23124b;
            dIntValue = num.intValue();
            aVar2.getClass();
            d14 = 1609.344d;
        }
        double d15 = dIntValue / d14;
        double dPow = Math.pow(10.0d, 1);
        return (float) (Math.rint(d15 * dPow) / dPow);
    }
}
