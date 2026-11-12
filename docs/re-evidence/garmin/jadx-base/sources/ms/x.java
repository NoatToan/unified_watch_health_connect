package ms;

import c22.l3;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lms/x;", "Lu00/c;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x implements u00.c<Double> {
    @Override // u00.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean a(Double d14) {
        int iU;
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        if (d14 == null) {
            iU = 0;
        } else {
            l3.a aVar = l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            iU = l3.a.u(dDoubleValue, zY);
        }
        return (d14 == null || Double.isNaN(d14.doubleValue()) || Double.isInfinite(d14.doubleValue()) || d14.doubleValue() < 0.0d || !(iU >= 0 && iU < 3599)) ? false : true;
    }
}
