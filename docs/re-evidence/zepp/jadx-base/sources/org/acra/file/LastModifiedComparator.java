package org.acra.file;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes23.dex */
public final class LastModifiedComparator implements Comparator<File> {
    @Override // java.util.Comparator
    public int compare(@NonNull File file, @NonNull File file2) {
        long jLastModified = file.lastModified();
        long jLastModified2 = file2.lastModified();
        if (jLastModified < jLastModified2) {
            return -1;
        }
        return jLastModified == jLastModified2 ? 0 : 1;
    }
}
