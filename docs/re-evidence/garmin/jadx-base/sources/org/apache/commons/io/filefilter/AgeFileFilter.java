package org.apache.commons.io.filefilter;

import am.j;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes3.dex */
public class AgeFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -2132740084016138541L;
    private final boolean acceptOlder;
    private final long cutoff;

    public AgeFileFilter(long j8, boolean z14) {
        this.acceptOlder = z14;
        this.cutoff = j8;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return this.acceptOlder != FileUtils.isFileNewer(file, this.cutoff);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        String str = this.acceptOlder ? "<=" : ">";
        StringBuilder sb3 = new StringBuilder();
        j.y(sb3, super.toString(), "(", str);
        return j.i(this.cutoff, ")", sb3);
    }

    public AgeFileFilter(long j8) {
        this(j8, true);
    }

    public AgeFileFilter(Date date) {
        this(date, true);
    }

    public AgeFileFilter(Date date, boolean z14) {
        this(date.getTime(), z14);
    }

    public AgeFileFilter(File file) {
        this(file, true);
    }

    public AgeFileFilter(File file, boolean z14) {
        this(file.lastModified(), z14);
    }
}
