package org.apache.commons.io.filefilter;

import defpackage.r00;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.io.IOCase;

/* JADX INFO: loaded from: classes3.dex */
public class PrefixFileFilter extends r00 implements Serializable {
    private final IOCase caseSensitivity;
    private final String[] prefixes;

    public PrefixFileFilter(String str) {
        this(str, IOCase.SENSITIVE);
    }

    @Override // defpackage.r00, defpackage.yuc, java.io.FileFilter
    public boolean accept(File file) {
        String name = file.getName();
        for (String str : this.prefixes) {
            if (this.caseSensitivity.checkStartsWith(name, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.r00
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        if (this.prefixes != null) {
            for (int i = 0; i < this.prefixes.length; i++) {
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(this.prefixes[i]);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public PrefixFileFilter(String str, IOCase iOCase) {
        if (str == null) {
            throw new IllegalArgumentException("The prefix must not be null");
        }
        this.prefixes = new String[]{str};
        this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
    }

    @Override // defpackage.r00, defpackage.yuc, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        for (String str2 : this.prefixes) {
            if (this.caseSensitivity.checkStartsWith(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public PrefixFileFilter(String[] strArr) {
        this(strArr, IOCase.SENSITIVE);
    }

    public PrefixFileFilter(String[] strArr, IOCase iOCase) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.prefixes = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
            return;
        }
        throw new IllegalArgumentException("The array of prefixes must not be null");
    }

    public PrefixFileFilter(List<String> list) {
        this(list, IOCase.SENSITIVE);
    }

    public PrefixFileFilter(List<String> list, IOCase iOCase) {
        if (list != null) {
            this.prefixes = (String[]) list.toArray(new String[list.size()]);
            this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
            return;
        }
        throw new IllegalArgumentException("The list of prefixes must not be null");
    }
}
