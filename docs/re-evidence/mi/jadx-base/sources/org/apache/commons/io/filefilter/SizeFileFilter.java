package org.apache.commons.io.filefilter;

import defpackage.r00;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class SizeFileFilter extends r00 implements Serializable {
    private final boolean acceptLarger;
    private final long size;

    public SizeFileFilter(long j) {
        this(j, true);
    }

    @Override // defpackage.r00, defpackage.yuc, java.io.FileFilter
    public boolean accept(File file) {
        boolean z = file.length() < this.size;
        if (this.acceptLarger) {
            return !z;
        }
        return z;
    }

    @Override // defpackage.r00
    public String toString() {
        return super.toString() + "(" + (this.acceptLarger ? ">=" : "<") + this.size + ")";
    }

    public SizeFileFilter(long j, boolean z) {
        if (j < 0) {
            throw new IllegalArgumentException("The size must be non-negative");
        }
        this.size = j;
        this.acceptLarger = z;
    }
}
