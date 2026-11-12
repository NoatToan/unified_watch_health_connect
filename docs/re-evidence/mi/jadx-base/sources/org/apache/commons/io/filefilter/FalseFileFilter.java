package org.apache.commons.io.filefilter;

import defpackage.yuc;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class FalseFileFilter implements yuc, Serializable {
    public static final yuc FALSE;
    public static final yuc INSTANCE;

    static {
        FalseFileFilter falseFileFilter = new FalseFileFilter();
        FALSE = falseFileFilter;
        INSTANCE = falseFileFilter;
    }

    @Override // defpackage.yuc, java.io.FileFilter
    public boolean accept(File file) {
        return false;
    }

    @Override // defpackage.yuc, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return false;
    }
}
