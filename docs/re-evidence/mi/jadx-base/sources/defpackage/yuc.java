package defpackage;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes3.dex */
public interface yuc extends FileFilter, FilenameFilter {
    @Override // java.io.FileFilter
    boolean accept(File file);

    boolean accept(File file, String str);
}
