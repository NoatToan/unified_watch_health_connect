package org.apache.commons.io.filefilter;

import defpackage.nm9;
import defpackage.r00;
import java.io.File;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class WildcardFilter extends r00 implements Serializable {
    private final String[] wildcards;

    public WildcardFilter(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The wildcard must not be null");
        }
        this.wildcards = new String[]{str};
    }

    @Override // defpackage.r00, defpackage.yuc, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        if (file != null && new File(file, str).isDirectory()) {
            return false;
        }
        for (String str2 : this.wildcards) {
            if (nm9.f(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public WildcardFilter(String[] strArr) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.wildcards = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            return;
        }
        throw new IllegalArgumentException("The wildcard array must not be null");
    }

    @Override // defpackage.r00, defpackage.yuc, java.io.FileFilter
    public boolean accept(File file) {
        if (file.isDirectory()) {
            return false;
        }
        for (String str : this.wildcards) {
            if (nm9.f(file.getName(), str)) {
                return true;
            }
        }
        return false;
    }

    public WildcardFilter(List<String> list) {
        if (list != null) {
            this.wildcards = (String[]) list.toArray(new String[list.size()]);
            return;
        }
        throw new IllegalArgumentException("The wildcard list must not be null");
    }
}
