package defpackage;

import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class rit implements bit {
    @Override // defpackage.bit
    public final void a(ClassLoader classLoader, Set set) {
        nit.c(classLoader, set);
    }

    @Override // defpackage.bit
    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z) {
        return fit.d(classLoader, file, file2, z, new git(), "path", new qit());
    }
}
