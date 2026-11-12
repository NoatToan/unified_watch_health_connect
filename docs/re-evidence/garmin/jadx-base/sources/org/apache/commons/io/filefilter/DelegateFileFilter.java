package org.apache.commons.io.filefilter;

import i3.e5;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.Serializable;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class DelegateFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -8723373124984771318L;
    private final FileFilter fileFilter;
    private final FilenameFilter filenameFilter;

    public DelegateFileFilter(FilenameFilter filenameFilter) {
        if (filenameFilter == null) {
            h.s("The FilenameFilter must not be null");
            throw null;
        }
        this.filenameFilter = filenameFilter;
        this.fileFilter = null;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        FileFilter fileFilter = this.fileFilter;
        return fileFilter != null ? fileFilter.accept(file) : super.accept(file);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        Object obj = this.fileFilter;
        if (obj == null) {
            obj = this.filenameFilter;
        }
        return e5.h(new StringBuilder(), super.toString(), "(", obj.toString(), ")");
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        FilenameFilter filenameFilter = this.filenameFilter;
        if (filenameFilter != null) {
            return filenameFilter.accept(file, str);
        }
        return super.accept(file, str);
    }

    public DelegateFileFilter(FileFilter fileFilter) {
        if (fileFilter != null) {
            this.fileFilter = fileFilter;
            this.filenameFilter = null;
        } else {
            h.s("The FileFilter must not be null");
            throw null;
        }
    }
}
