package rx2;

import am.j;
import com.garmin.samd.repository.UnexpectedResponseCodeException;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.firebase.perf.FirebasePerformance;
import java.net.URL;
import java.util.List;
import java.util.Map;
import o72.t;
import p005kotlin.jvm.internal.s;
import p13.h0;
import qx2.c;

/* JADX INFO: loaded from: classes13.dex */
public final class b {
    public static final lx2.a a(String str) throws UnexpectedResponseCodeException {
        str.getClass();
        c cVarB = a.b(false, FirebasePerformance.HttpMethod.GET, new URL(j.m("https://", str, "/status/sync")), "", null, null);
        if (cVarB.f148454c != 200) {
            a.c().error(cVarB.toString());
            throw new UnexpectedResponseCodeException(cVarB.f148454c, cVarB.f148456e, null, 4, null);
        }
        a.c().debug(t.u(cVarB));
        lx2.a.C2195a c2195a = lx2.a.f115275b;
        Map<String, List<String>> map = cVarB.f148455d;
        c2195a.getClass();
        try {
            List<String> list = map.get("enabled");
            return new lx2.a(s.g(list != null ? (String) h0.d0(list) : null, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
        } catch (Throwable th3) {
            ge1.b.L("GCSyncServerStatus").error("fromGCSyncServerStatus", th3);
            throw th3;
        }
    }
}
