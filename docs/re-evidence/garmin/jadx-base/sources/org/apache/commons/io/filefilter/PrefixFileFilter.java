package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.io.IOCase;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class PrefixFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 8533897440809599867L;
    private final IOCase caseSensitivity;
    private final String[] prefixes;

    public PrefixFileFilter(String[] strArr, IOCase iOCase) {
        if (strArr == null) {
            h.s("The array of prefixes must not be null");
            throw null;
        }
        String[] strArr2 = new String[strArr.length];
        this.prefixes = strArr2;
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        String name = file.getName();
        for (String str : this.prefixes) {
            if (this.caseSensitivity.checkStartsWith(name, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append("(");
        if (this.prefixes != null) {
            for (int i14 = 0; i14 < this.prefixes.length; i14++) {
                if (i14 > 0) {
                    sb3.append(",");
                }
                sb3.append(this.prefixes[i14]);
            }
        }
        sb3.append(")");
        return sb3.toString();
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        for (String str2 : this.prefixes) {
            if (this.caseSensitivity.checkStartsWith(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public PrefixFileFilter(String str, IOCase iOCase) {
        if (str != null) {
            this.prefixes = new String[]{str};
            this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
        } else {
            h.s("The prefix must not be null");
            throw null;
        }
    }

    public PrefixFileFilter(String... strArr) {
        this(strArr, IOCase.SENSITIVE);
    }

    public PrefixFileFilter(String str) {
        this(str, IOCase.SENSITIVE);
    }

    public PrefixFileFilter(List<String> list) {
        this(list, IOCase.SENSITIVE);
    }

    public PrefixFileFilter(List<String> list, IOCase iOCase) {
        if (list != null) {
            this.prefixes = (String[]) list.toArray(IOFileFilter.EMPTY_STRING_ARRAY);
            this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
        } else {
            h.s("The list of prefixes must not be null");
            throw null;
        }
    }
}
