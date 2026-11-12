package mn2;

import java.util.HashMap;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f119847a;

    static {
        int i14 = gt2.c.f79010a;
        f119847a = gt2.b.f79005a.h("GcsCiqImageApiExtensions");
    }

    public static final e13.j a(o oVar, long j8, int i14, int i15, int i16, String str) {
        oVar.getClass();
        str.getClass();
        wr2.i.f186861a.getClass();
        lq2.d dVar = new lq2.d(j8, 1);
        int i17 = w03.b.f181178a;
        return new e13.j(new e13.j(new e13.m(dVar), new e(new r(oVar, j8, i14, i15, i16, str), 24)), new e(new mi0.i(8), 21));
    }

    public static final HashMap b(sd2.f fVar) {
        String productNumber = fVar != null ? fVar.getProductNumber() : null;
        String softwareVersion = fVar != null ? fVar.getSoftwareVersion() : null;
        Long lValueOf = fVar != null ? Long.valueOf(fVar.getUnitID()) : null;
        ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).getClass();
        String strValueOf = String.valueOf(lValueOf);
        HashMap map = new HashMap();
        map.put("X-Garmin-Paired-App-Version", "5.30.1");
        if (softwareVersion != null) {
            map.put("X-Garmin-Firmware-Version", softwareVersion);
        }
        if (productNumber != null) {
            map.put("X-Garmin-SW-Part-Number", "006-B" + productNumber + "-00");
        }
        map.put("X-Garmin-Unit-Id", strValueOf);
        return map;
    }
}
