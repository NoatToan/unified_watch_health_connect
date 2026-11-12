package org.apache.commons.io.comparator;

import defpackage.q00;
import defpackage.vtk;
import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class DirectoryFileComparator extends q00 implements Serializable {
    public static final Comparator<File> DIRECTORY_COMPARATOR;
    public static final Comparator<File> DIRECTORY_REVERSE;

    static {
        DirectoryFileComparator directoryFileComparator = new DirectoryFileComparator();
        DIRECTORY_COMPARATOR = directoryFileComparator;
        DIRECTORY_REVERSE = new vtk(directoryFileComparator);
    }

    private int getType(File file) {
        return file.isDirectory() ? 1 : 2;
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
        return getType(file) - getType(file2);
    }

    @Override // defpackage.q00
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }
}
