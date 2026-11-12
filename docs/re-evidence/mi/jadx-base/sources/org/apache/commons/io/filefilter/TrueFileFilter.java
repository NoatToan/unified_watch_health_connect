package org.apache.commons.io.filefilter;

import defpackage.yuc;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class TrueFileFilter implements yuc, Serializable {
    public static final yuc INSTANCE;
    public static final yuc TRUE;

    static {
        TrueFileFilter trueFileFilter = new TrueFileFilter();
        TRUE = trueFileFilter;
        INSTANCE = trueFileFilter;
    }

    @Override // defpackage.yuc, java.io.FileFilter
    public boolean accept(File file) {
        return true;
    }

    @Override // defpackage.yuc, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return true;
    }
}
