package org.apache.commons.io.comparator;

import defpackage.q00;
import defpackage.vtk;
import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.IOCase;

/* JADX INFO: loaded from: classes3.dex */
public class PathFileComparator extends q00 implements Serializable {
    public static final Comparator<File> PATH_COMPARATOR;
    public static final Comparator<File> PATH_INSENSITIVE_COMPARATOR;
    public static final Comparator<File> PATH_INSENSITIVE_REVERSE;
    public static final Comparator<File> PATH_REVERSE;
    public static final Comparator<File> PATH_SYSTEM_COMPARATOR;
    public static final Comparator<File> PATH_SYSTEM_REVERSE;
    private final IOCase caseSensitivity;

    static {
        PathFileComparator pathFileComparator = new PathFileComparator();
        PATH_COMPARATOR = pathFileComparator;
        PATH_REVERSE = new vtk(pathFileComparator);
        PathFileComparator pathFileComparator2 = new PathFileComparator(IOCase.INSENSITIVE);
        PATH_INSENSITIVE_COMPARATOR = pathFileComparator2;
        PATH_INSENSITIVE_REVERSE = new vtk(pathFileComparator2);
        PathFileComparator pathFileComparator3 = new PathFileComparator(IOCase.SYSTEM);
        PATH_SYSTEM_COMPARATOR = pathFileComparator3;
        PATH_SYSTEM_REVERSE = new vtk(pathFileComparator3);
    }

    public PathFileComparator() {
        this.caseSensitivity = IOCase.SENSITIVE;
    }

    @Override // defpackage.q00
    public /* bridge */ /* synthetic */ List sort(List list) {
        return super.sort((List<File>) list);
    }

    @Override // defpackage.q00
    public String toString() {
        return super.toString() + "[caseSensitivity=" + this.caseSensitivity + "]";
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        return this.caseSensitivity.checkCompareTo(file.getPath(), file2.getPath());
    }

    @Override // defpackage.q00
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }

    public PathFileComparator(IOCase iOCase) {
        this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
    }
}
