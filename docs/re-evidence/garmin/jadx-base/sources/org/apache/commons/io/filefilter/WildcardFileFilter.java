package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOCase;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class WildcardFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -7426486598995782105L;
    private final IOCase caseSensitivity;
    private final String[] wildcards;

    public WildcardFileFilter(String[] strArr, IOCase iOCase) {
        if (strArr == null) {
            h.s("The wildcard array must not be null");
            throw null;
        }
        String[] strArr2 = new String[strArr.length];
        this.wildcards = strArr2;
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        String name = file.getName();
        for (String str : this.wildcards) {
            if (FilenameUtils.wildcardMatch(name, str, this.caseSensitivity)) {
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
        if (this.wildcards != null) {
            for (int i14 = 0; i14 < this.wildcards.length; i14++) {
                if (i14 > 0) {
                    sb3.append(",");
                }
                sb3.append(this.wildcards[i14]);
            }
        }
        sb3.append(")");
        return sb3.toString();
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        for (String str2 : this.wildcards) {
            if (FilenameUtils.wildcardMatch(str, str2, this.caseSensitivity)) {
                return true;
            }
        }
        return false;
    }

    public WildcardFileFilter(String str, IOCase iOCase) {
        if (str != null) {
            this.wildcards = new String[]{str};
            this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
        } else {
            h.s("The wildcard must not be null");
            throw null;
        }
    }

    public WildcardFileFilter(String... strArr) {
        this(strArr, IOCase.SENSITIVE);
    }

    public WildcardFileFilter(String str) {
        this(str, IOCase.SENSITIVE);
    }

    public WildcardFileFilter(List<String> list) {
        this(list, IOCase.SENSITIVE);
    }

    public WildcardFileFilter(List<String> list, IOCase iOCase) {
        if (list != null) {
            this.wildcards = (String[]) list.toArray(IOFileFilter.EMPTY_STRING_ARRAY);
            this.caseSensitivity = iOCase == null ? IOCase.SENSITIVE : iOCase;
        } else {
            h.s("The wildcard list must not be null");
            throw null;
        }
    }
}
