package defpackage;

import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class nit implements bit {
    public static void c(ClassLoader classLoader, Set set) {
        iit.c(classLoader, set, new lit());
    }

    public static boolean d(ClassLoader classLoader, File file, File file2, boolean z) {
        return fit.d(classLoader, file, file2, z, new git(), "path", new mit());
    }

    @Override // defpackage.bit
    public final void a(ClassLoader classLoader, Set set) {
        c(classLoader, set);
    }

    @Override // defpackage.bit
    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z) {
        return d(classLoader, file, file2, z);
    }
}
