package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r00 implements yuc {
    @Override // defpackage.yuc, java.io.FileFilter
    public boolean accept(File file) {
        return accept(file.getParentFile(), file.getName());
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    @Override // defpackage.yuc, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return accept(new File(file, str));
    }
}
