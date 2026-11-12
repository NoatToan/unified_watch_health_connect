package org.apache.commons.io.filefilter;

import defpackage.r00;
import defpackage.yuc;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class HiddenFileFilter extends r00 implements Serializable {
    public static final yuc HIDDEN;
    public static final yuc VISIBLE;

    static {
        HiddenFileFilter hiddenFileFilter = new HiddenFileFilter();
        HIDDEN = hiddenFileFilter;
        VISIBLE = new NotFileFilter(hiddenFileFilter);
    }

    @Override // defpackage.r00, defpackage.yuc, java.io.FileFilter
    public boolean accept(File file) {
        return file.isHidden();
    }
}
