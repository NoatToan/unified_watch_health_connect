package tt0;

import lc.u0;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static final DateTime a(e eVar) {
        eVar.getClass();
        if (eVar instanceof e.a) {
            return g22.k.q(((e.a) eVar).f166374d, "yyyy-MM-dd'T'HH:mm:ss.S", null);
        }
        if (eVar instanceof e.b) {
            return g22.k.q(((e.b) eVar).f166384h, "yyyy-MM-dd'T'HH:mm:ss.S", null);
        }
        if (eVar instanceof e.c) {
            return g22.k.q(((e.c) eVar).f166395h, "yyyy-MM-dd'T'HH:mm:ss.S", null);
        }
        u0.r();
        return null;
    }

    public static final DateTime b(e eVar) {
        if (eVar instanceof e.a) {
            return g22.k.q(((e.a) eVar).f166373c, "yyyy-MM-dd'T'HH:mm:ss.S", null);
        }
        if (eVar instanceof e.b) {
            return g22.k.q(((e.b) eVar).f166383g, "yyyy-MM-dd'T'HH:mm:ss.S", null);
        }
        if (eVar instanceof e.c) {
            return g22.k.q(((e.c) eVar).f166394g, "yyyy-MM-dd'T'HH:mm:ss.S", null);
        }
        u0.r();
        return null;
    }
}
