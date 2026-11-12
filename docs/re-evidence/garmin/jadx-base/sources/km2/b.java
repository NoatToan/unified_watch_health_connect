package km2;

import am.j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f105626a = LoggerFactory.getLogger("PAIR#PairingUtil");

    @Deprecated
    public interface a {
        void onComplete(boolean z14);
    }

    private b() {
    }

    public static int a(int i14) {
        int i15 = 1;
        if (i14 != 1) {
            i15 = 2;
            if (i14 != 2) {
                i15 = 3;
                if (i14 != 3) {
                    i15 = 4;
                    if (i14 != 4) {
                        if (i14 == 2000) {
                            return 2000;
                        }
                        h.s(j.h(i14, "Unrecognized device feature:"));
                        return 0;
                    }
                }
            }
        }
        return i15;
    }
}
