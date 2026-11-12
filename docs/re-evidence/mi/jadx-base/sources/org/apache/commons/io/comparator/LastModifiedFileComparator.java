package org.apache.commons.io.comparator;

import defpackage.q00;
import defpackage.vtk;
import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class LastModifiedFileComparator extends q00 implements Serializable {
    public static final Comparator<File> LASTMODIFIED_COMPARATOR;
    public static final Comparator<File> LASTMODIFIED_REVERSE;

    static {
        LastModifiedFileComparator lastModifiedFileComparator = new LastModifiedFileComparator();
        LASTMODIFIED_COMPARATOR = lastModifiedFileComparator;
        LASTMODIFIED_REVERSE = new vtk(lastModifiedFileComparator);
    }

    @Override // defpackage.q00
    public /* bridge */ /* synthetic */ List sort(List list) {
        return super.sort((List<File>) list);
    }

    @Override // defpackage.q00
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        long jLastModified = file.lastModified() - file2.lastModified();
        if (jLastModified < 0) {
            return -1;
        }
        return jLastModified > 0 ? 1 : 0;
    }

    @Override // defpackage.q00
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }
}
