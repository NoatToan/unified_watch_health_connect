package org.apache.commons.io.comparator;

import defpackage.nm9;
import defpackage.q00;
import defpackage.vtk;
import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.IOCase;

/* JADX INFO: loaded from: classes3.dex */
public class ExtensionFileComparator extends q00 implements Serializable {
    public static final Comparator<File> EXTENSION_COMPARATOR;
    public static final Comparator<File> EXTENSION_INSENSITIVE_COMPARATOR;
    public static final Comparator<File> EXTENSION_INSENSITIVE_REVERSE;
    public static final Comparator<File> EXTENSION_REVERSE;
    public static final Comparator<File> EXTENSION_SYSTEM_COMPARATOR;
    public static final Comparator<File> EXTENSION_SYSTEM_REVERSE;
    private final IOCase caseSensitivity;

    static {
        ExtensionFileComparator extensionFileComparator = new ExtensionFileComparator();
        EXTENSION_COMPARATOR = extensionFileComparator;
        EXTENSION_REVERSE = new vtk(extensionFileComparator);
        ExtensionFileComparator extensionFileComparator2 = new ExtensionFileComparator(IOCase.INSENSITIVE);
        EXTENSION_INSENSITIVE_COMPARATOR = extensionFileComparator2;
        EXTENSION_INSENSITIVE_REVERSE = new vtk(extensionFileComparator2);
        ExtensionFileComparator extensionFileComparator3 = new ExtensionFileComparator(IOCase.SYSTEM);
        EXTENSION_SYSTEM_COMPARATOR = extensionFileComparator3;
        EXTENSION_SYSTEM_REVERSE = new vtk(extensionFileComparator3);
    }

    public ExtensionFileComparator() {
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
        return this.caseSensitivity.checkCompareTo(nm9.a(file.getName()), nm9.a(file2.getName()));
    }

    @Override // defpackage.q00
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }

    public ExtensionFileComparator(IOCase iOCase) {
        this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
    }
}
