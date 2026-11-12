package defpackage;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes11.dex */
public class ygt implements FileFilter {
    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return file.isDirectory();
    }
}
