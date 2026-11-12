package androidx.camera.core.internal.compat.quirk;

import androidx.camera.core.impl.e2;
import androidx.camera.core.impl.i2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public interface SurfaceProcessingQuirk extends e2 {
    static boolean d(i2 i2Var) {
        Iterator it = i2Var.c(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    default boolean b() {
        return true;
    }
}
