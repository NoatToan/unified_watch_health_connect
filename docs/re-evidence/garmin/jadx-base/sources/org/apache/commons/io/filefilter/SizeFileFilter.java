package org.apache.commons.io.filefilter;

import am.j;
import java.io.File;
import java.io.Serializable;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class SizeFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 7388077430788600069L;
    private final boolean acceptLarger;
    private final long size;

    public SizeFileFilter(long j8, boolean z14) {
        if (j8 < 0) {
            h.s("The size must be non-negative");
            throw null;
        }
        this.size = j8;
        this.acceptLarger = z14;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return this.acceptLarger != ((file.length() > this.size ? 1 : (file.length() == this.size ? 0 : -1)) < 0);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        String str = this.acceptLarger ? ">=" : "<";
        StringBuilder sb3 = new StringBuilder();
        j.y(sb3, super.toString(), "(", str);
        return j.i(this.size, ")", sb3);
    }

    public SizeFileFilter(long j8) {
        this(j8, true);
    }
}
