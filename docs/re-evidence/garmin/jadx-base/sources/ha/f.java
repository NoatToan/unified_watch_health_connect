package ha;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private f() {
    }

    public static void a(d dVar) {
        if (dVar != null) {
            try {
                dVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
