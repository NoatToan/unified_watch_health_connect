package org.apache.commons.io.filefilter;

import defpackage.r00;
import defpackage.yuc;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class DirectoryFileFilter extends r00 implements Serializable {
    public static final yuc DIRECTORY;
    public static final yuc INSTANCE;

    static {
        DirectoryFileFilter directoryFileFilter = new DirectoryFileFilter();
        DIRECTORY = directoryFileFilter;
        INSTANCE = directoryFileFilter;
    }

    @Override // defpackage.r00, defpackage.yuc, java.io.FileFilter
    public boolean accept(File file) {
        return file.isDirectory();
    }
}
