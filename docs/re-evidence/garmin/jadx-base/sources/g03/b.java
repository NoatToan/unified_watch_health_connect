package g03;

import j20.x;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private b() {
    }

    public static void a(Object obj) {
        if (obj != null) {
            return;
        }
        x.l("Cannot return null from a non-@Nullable @Provides method");
    }
}
