package org.apache.commons.io.comparator;

import defpackage.lm9;
import defpackage.q00;
import defpackage.vtk;
import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SizeFileComparator extends q00 implements Serializable {
    public static final Comparator<File> SIZE_COMPARATOR;
    public static final Comparator<File> SIZE_REVERSE;
    public static final Comparator<File> SIZE_SUMDIR_COMPARATOR;
    public static final Comparator<File> SIZE_SUMDIR_REVERSE;
    private final boolean sumDirectoryContents;

    static {
        SizeFileComparator sizeFileComparator = new SizeFileComparator();
        SIZE_COMPARATOR = sizeFileComparator;
        SIZE_REVERSE = new vtk(sizeFileComparator);
        SizeFileComparator sizeFileComparator2 = new SizeFileComparator(true);
        SIZE_SUMDIR_COMPARATOR = sizeFileComparator2;
        SIZE_SUMDIR_REVERSE = new vtk(sizeFileComparator2);
    }

    public SizeFileComparator() {
        this.sumDirectoryContents = false;
    }

    @Override // defpackage.q00
    public /* bridge */ /* synthetic */ List sort(List list) {
        return super.sort((List<File>) list);
    }

    @Override // defpackage.q00
    public String toString() {
        return super.toString() + "[sumDirectoryContents=" + this.sumDirectoryContents + "]";
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        long length;
        long length2;
        if (file.isDirectory()) {
            length = (this.sumDirectoryContents && file.exists()) ? lm9.e(file) : 0L;
        } else {
            length = file.length();
        }
        if (file2.isDirectory()) {
            length2 = (this.sumDirectoryContents && file2.exists()) ? lm9.e(file2) : 0L;
        } else {
            length2 = file2.length();
        }
        long j = length - length2;
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    @Override // defpackage.q00
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }

    public SizeFileComparator(boolean z) {
        this.sumDirectoryContents = z;
    }
}
