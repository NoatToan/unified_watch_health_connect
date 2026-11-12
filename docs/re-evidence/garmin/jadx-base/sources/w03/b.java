package w03;

import j20.x;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f181178a = 0;

    public static final class a {
    }

    static {
        new a();
    }

    private b() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        x.l(str);
    }

    public static void b(int i14, String str) {
        if (i14 > 0) {
            return;
        }
        h.s(h.h(i14, str, " > 0 required but it was "));
    }
}
