package org.apache.commons.io.filefilter;

import defpackage.lm9;
import defpackage.r00;
import java.io.File;
import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class AgeFileFilter extends r00 implements Serializable {
    private final boolean acceptOlder;
    private final long cutoff;

    public AgeFileFilter(long j) {
        this(j, true);
    }

    @Override // defpackage.r00, defpackage.yuc, java.io.FileFilter
    public boolean accept(File file) {
        boolean zA = lm9.a(file, this.cutoff);
        if (this.acceptOlder) {
            return !zA;
        }
        return zA;
    }

    @Override // defpackage.r00
    public String toString() {
        return super.toString() + "(" + (this.acceptOlder ? "<=" : ">") + this.cutoff + ")";
    }

    public AgeFileFilter(long j, boolean z) {
        this.acceptOlder = z;
        this.cutoff = j;
    }

    public AgeFileFilter(Date date) {
        this(date, true);
    }

    public AgeFileFilter(Date date, boolean z) {
        this(date.getTime(), z);
    }

    public AgeFileFilter(File file) {
        this(file, true);
    }

    public AgeFileFilter(File file, boolean z) {
        this(file.lastModified(), z);
    }
}
