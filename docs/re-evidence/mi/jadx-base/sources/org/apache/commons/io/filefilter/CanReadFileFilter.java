package org.apache.commons.io.filefilter;

import defpackage.r00;
import defpackage.yuc;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class CanReadFileFilter extends r00 implements Serializable {
    public static final yuc CANNOT_READ;
    public static final yuc CAN_READ;
    public static final yuc READ_ONLY;

    static {
        CanReadFileFilter canReadFileFilter = new CanReadFileFilter();
        CAN_READ = canReadFileFilter;
        CANNOT_READ = new NotFileFilter(canReadFileFilter);
        READ_ONLY = new AndFileFilter(canReadFileFilter, CanWriteFileFilter.CANNOT_WRITE);
    }

    @Override // defpackage.r00, defpackage.yuc, java.io.FileFilter
    public boolean accept(File file) {
        return file.canRead();
    }
}
