package fc1;

import hs1.k;
import o70.t;

/* JADX INFO: loaded from: classes9.dex */
public final class i {
    public static final t.b a(hs1.d dVar) {
        k pulseOx;
        Integer latestValue;
        k pulseOx2;
        Double avgAltitudeInMeters;
        return (((dVar == null || (pulseOx2 = dVar.getPulseOx()) == null || (avgAltitudeInMeters = pulseOx2.getAvgAltitudeInMeters()) == null) ? Double.NaN : avgAltitudeInMeters.doubleValue()) <= 0.0d || ((dVar == null || (pulseOx = dVar.getPulseOx()) == null || (latestValue = pulseOx.getLatestValue()) == null) ? -1 : latestValue.intValue()) <= 0) ? t.b.f130089d : t.b.f130090e;
    }
}
