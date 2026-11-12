package org.apache.commons.io.filefilter;

import defpackage.r00;
import defpackage.yuc;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class NotFileFilter extends r00 implements Serializable {
    private final yuc filter;

    public NotFileFilter(yuc yucVar) {
        if (yucVar == null) {
            throw new IllegalArgumentException("The filter must not be null");
        }
        this.filter = yucVar;
    }

    @Override // defpackage.r00, defpackage.yuc, java.io.FileFilter
    public boolean accept(File file) {
        return !this.filter.accept(file);
    }

    @Override // defpackage.r00
    public String toString() {
        return super.toString() + "(" + this.filter.toString() + ")";
    }

    @Override // defpackage.r00, defpackage.yuc, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return !this.filter.accept(file, str);
    }
}
