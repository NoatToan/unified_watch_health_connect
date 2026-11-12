package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.io.IOCase;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class NameFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 176844364689077340L;
    private final IOCase caseSensitivity;
    private final String[] names;

    public NameFileFilter(String[] strArr, IOCase iOCase) {
        if (strArr == null) {
            h.s("The array of names must not be null");
            throw null;
        }
        String[] strArr2 = new String[strArr.length];
        this.names = strArr2;
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        String name = file.getName();
        for (String str : this.names) {
            if (this.caseSensitivity.checkEquals(name, str)) {
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
        if (this.names != null) {
            for (int i14 = 0; i14 < this.names.length; i14++) {
                if (i14 > 0) {
                    sb3.append(",");
                }
                sb3.append(this.names[i14]);
            }
        }
        sb3.append(")");
        return sb3.toString();
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        for (String str2 : this.names) {
            if (this.caseSensitivity.checkEquals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public NameFileFilter(String str, IOCase iOCase) {
        if (str != null) {
            this.names = new String[]{str};
            this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
        } else {
            h.s("The wildcard must not be null");
            throw null;
        }
    }

    public NameFileFilter(String... strArr) {
        this(strArr, (IOCase) null);
    }

    public NameFileFilter(String str) {
        this(str, (IOCase) null);
    }

    public NameFileFilter(List<String> list) {
        this(list, (IOCase) null);
    }

    public NameFileFilter(List<String> list, IOCase iOCase) {
        if (list != null) {
            this.names = (String[]) list.toArray(IOFileFilter.EMPTY_STRING_ARRAY);
            this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
        } else {
            h.s("The list of names must not be null");
            throw null;
        }
    }
}
